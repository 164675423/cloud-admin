package com.zh.am.dto.page;

import com.zh.am.dto.role.OperationDto;

import java.util.List;

public class PageDetailsVO {
  private String id;
  private String name;
  private List<PageDetailsVO> items;
  private List<OperationDto> operations;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<PageDetailsVO> getItems() {
    return items;
  }

  public void setItems(List<PageDetailsVO> items) {
    this.items = items;
  }

  public List<OperationDto> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationDto> operations) {
    this.operations = operations;
  }
}
