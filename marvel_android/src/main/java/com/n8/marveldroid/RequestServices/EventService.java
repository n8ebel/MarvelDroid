package com.n8.marveldroid.RequestServices;

import com.n8.marveldroid.ModelObjects.Event;
import com.n8.marveldroid.RequestResponse;

import java.util.Date;


import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EventService {

    @GET("/v1/public/events")
    RequestResponse<Event> getEvents(
        @Query("ts") String timestamp,
        @Query("apikey") String apikey,
        @Query("hash") String hashSignature,
        @Query("name") String name,
        @Query("nameStartsWith") String nameStartsWith,
        @Query("modifiedSince") Date modifiedSince,
        @Query("creators") String creators,
        @Query("characters") String characters,
        @Query("series") String series,
        @Query("comics") String comics,
        @Query("stories") String stories,
        @Query("orderBy") String orderBy,
        @Query("limit") int limit,
        @Query("offset") int offset);

    @GET("/v1/public/events/{eventId}")
    RequestResponse<Event> getEventForId(
        @Path("eventId") int eventId,
        @Query("ts") String timestamp,
        @Query("apikey") String apikey,
        @Query("hash") String hashSignature);

    @GET("/v1/public/characters/{characterId}/events")
    RequestResponse<Event> getEventsForCharacterId(
            @Path("characterId") int characterId,
            @Query("ts") String timestamp,
            @Query("apikey") String apikey,
            @Query("hash") String hashSignature,
            @Query("name") String name,
            @Query("nameStartsWith") String nameStartsWith,
            @Query("modifiedSince") Date modifiedSince,
            @Query("creators") String creators,
            @Query("series") String series,
            @Query("comics") String comics,
            @Query("stories") String stories,
            @Query("orderBy") String orderBy,
            @Query("limit") int limit,
            @Query("offset") int offset);

    @GET("/v1/public/comics/{comicId}/events")
    RequestResponse<Event> getEventsForComicId(
            @Path("comicId") int comicId,
            @Query("ts") String timestamp,
            @Query("apikey") String apikey,
            @Query("hash") String hashSignature,
            @Query("name") String name,
            @Query("nameStartsWith") String nameStartsWith,
            @Query("modifiedSince") Date modifiedSince,
            @Query("creators") String creators,
            @Query("characters") String characters,
            @Query("series") String series,
            @Query("stories") String stories,
            @Query("orderBy") String orderBy,
            @Query("limit") int limit,
            @Query("offset") int offset);

    @GET("/v1/public/creators/{creatorId}/events")
    RequestResponse<Event> getEventsForCreatorId(
            @Path("creatorId") int creatorId,
            @Query("ts") String timestamp,
            @Query("apikey") String apikey,
            @Query("hash") String hashSignature,
            @Query("name") String name,
            @Query("nameStartsWith") String nameStartsWith,
            @Query("modifiedSince") Date modifiedSince,
            @Query("characters") String characters,
            @Query("series") String series,
            @Query("comics") String comics,
            @Query("stories") String stories,
            @Query("orderBy") String orderBy,
            @Query("limit") int limit,
            @Query("offset") int offset);

    @GET("/v1/public/series/{seriesId}/events")
    RequestResponse<Event> getEventsForSeriesId(
            @Path("seriesId") int seriesId,
            @Query("ts") String timestamp,
            @Query("apikey") String apikey,
            @Query("hash") String hashSignature,
            @Query("name") String name,
            @Query("nameStartsWith") String nameStartsWith,
            @Query("modifiedSince") Date modifiedSince,
            @Query("creators") String creators,
            @Query("characters") String characters,
            @Query("comics") String comics,
            @Query("stories") String stories,
            @Query("orderBy") String orderBy,
            @Query("limit") int limit,
            @Query("offset") int offset);

    @GET("/v1/public/stories/{storyId}/events")
    RequestResponse<Event> getEventsForStoryId(
            @Path("storyId") int storyId,
            @Query("ts") String timestamp,
            @Query("apikey") String apikey,
            @Query("hash") String hashSignature,
            @Query("name") String name,
            @Query("nameStartsWith") String nameStartsWith,
            @Query("modifiedSince") Date modifiedSince,
            @Query("creators") String creators,
            @Query("characters") String characters,
            @Query("series") String series,
            @Query("comics") String comics,
            @Query("orderBy") String orderBy,
            @Query("limit") int limit,
            @Query("offset") int offset);
}
