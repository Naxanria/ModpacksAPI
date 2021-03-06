package com.unrealdinnerbone.modpackapi.api.pack;

import lombok.Getter;

import java.util.List;

@Getter
public class Modpack {
    private String synopsis;
    private List<Art> art;
    private List<Author> authors;
    private List<ModpackVersion> versions;
    private int installs;
    private int plays;
    private boolean featured;
    private long refreshed;
    private String status;
    private int id;
    private String name;
    private String type;
    private long updated;
    private List<Tag> tags;
}
