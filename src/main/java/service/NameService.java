package service;

import domain.dto.NameDto;
import domain.query.NameQuery;

import java.util.Optional;

/**
 * @Description
 * @Author Hust
 * @Date 2025/9/18 下午5:38
 */
public interface NameService {
    Optional<NameDto> getName(NameQuery query);
}
