package com.example.aerospike.Repositories;

import com.example.aerospike.Objects.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface AerospikeUserRepository extends AerospikeRepository<User,Object> {
}
