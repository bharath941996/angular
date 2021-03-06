package com.stackroute.compose.muzix.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "track")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Track {

    @Id
    private String  trackId;
    private String trackName;
    private String trackComment;
    private String  trackUrl ;
    protected String trackSinger ;
    private  String trackImageUrl
    ;
}

