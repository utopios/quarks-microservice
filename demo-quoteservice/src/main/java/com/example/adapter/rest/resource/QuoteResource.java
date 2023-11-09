package com.example.adapter.rest.resource;


import com.example.adapter.rest.dto.QuoteDTO;
import com.example.domain.QuoteService;
import com.example.domain.entity.Quote;
import com.example.domain.port.QuoteRepository;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/v1/quote")
public class QuoteResource {


    private final QuoteRepository quoteRepository;
    private final QuoteService quoteService;

    public QuoteResource(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
        quoteService = new QuoteService(quoteRepository);
    }

    @POST
    @Transactional
    public QuoteDTO post(QuoteDTO quote) {
        Quote quoteCreated = quoteService.save(quote.getContent(), quote.getId());
        return QuoteDTO.builder().id(quoteCreated.getId())
                .content(quoteCreated.getContent())
                .authorId(quote.getAuthorId())
                .build();
    }
}
