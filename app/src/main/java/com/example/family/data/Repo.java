package com.example.family.data;

import java.util.List;

public interface Repo {



    int create ( Note note);
// чтение
    Note read (int id);
// Изменение
    void update(Note note);
    //Удаление
    void delete(int id);



    List<Note> getAll();
}
