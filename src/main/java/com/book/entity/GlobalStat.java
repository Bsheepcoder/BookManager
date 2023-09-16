package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalStat {
    int userCount;
    int bookCount;
    int borrowCount;
}
