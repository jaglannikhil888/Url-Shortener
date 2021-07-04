package com.gfg.jbdl12urlshortener.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ClientConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String hostName = "http://localhost:8080/";
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "clientConfiguration")
    List<LongUrl> longUrls;
}
