package com.nicholaslocicero.simpleroomapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import java.util.Date;

@Entity
public class Note {

  @PrimaryKey(autoGenerate = true)
  private long id;

  @NonNull
  private String note;

  @NonNull
  private Date timestamp;

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {

    return id;
  }

  public void setNote(@NonNull String note) {
    this.note = note;
  }

  @NonNull
  public String getNote() {
    return note;
  }

  @NonNull
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(@NonNull Date timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return note;
  }
}
