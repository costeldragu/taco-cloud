package mdc.tacocloud.repository;

import mdc.tacocloud.domain.Taco;

public interface TacoRepository {
    Taco save(Taco taco);
}
