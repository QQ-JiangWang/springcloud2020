package com.wangzaiqq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Wangjiang
 * @create 2020-11-15 18:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
  private Long id;
  private String serial;

}
