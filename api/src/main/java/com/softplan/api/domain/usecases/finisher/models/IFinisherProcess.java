package com.softplan.api.domain.usecases.finisher.models;

public interface IFinisherProcess {
    public Integer getId();
    public void setId(Integer id);
    public String getDescription();
    public void setDescription(String description);
    public Integer getUserId();
    public void setUserId(Integer userId);
}
