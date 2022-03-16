package br.com.letscode.rebels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.letscode.rebels.entity.Item;

public interface ItemRepository extends JpaRepository<Item, String>  {
}
