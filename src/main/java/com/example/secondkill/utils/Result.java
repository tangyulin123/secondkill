package com.example.secondkill.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private boolean success = false;

    private String message = null;
}
