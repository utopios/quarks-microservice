package com.example.adapter.rest.resource;


import com.example.adapter.rest.dto.QuoteDTO;
import com.example.domain.QuoteService;
import com.example.domain.entity.Quote;
import com.example.domain.port.QuoteRepository;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api/v1/quote")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
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

    @GET
    @Path("/{id}")
    public QuoteDTO get(@PathParam("id") Long id) {
        Quote quote = quoteService.findById(id);
        return  QuoteDTO.builder().authorId(quote.getAuthorId()).content(quote.getContent()).build();
    }
}
