package com.example.elastic.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jfr.Timestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;


@Document(indexName="test",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @JsonProperty("id")
    private String idddhhk;
    @Field(name="message")
  //  @JsonProperty("message")
    private String messagee;
    @Field(name="@timestamp")
   // @JsonProperty("@timestamp")
    private String time;
    private String lenHo;
    private String type;

}
