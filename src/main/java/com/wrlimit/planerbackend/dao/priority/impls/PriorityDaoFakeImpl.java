package com.wrlimit.planerbackend.dao.priority.impls;

import com.wrlimit.planerbackend.dao.priority.interfaces.IPriorityDao;
import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.repository.PriorityMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("fake")
public class PriorityDaoFakeImpl implements IPriorityDao {

    /* Priority */
   private List<Priority> list = new ArrayList<>(
            Arrays.asList(
                    new Priority(
                            1,
                            "Первый",
                            "#fcc"
                    ),
                    new Priority(
                            2,
                            "Второй",
                            "#f99"
                    ),
                    new Priority(
                            3,
                            "Третий",
                            "#f66"
                    ),
                    new Priority(
                            4,
                            "Test",
                            "#f66"
                    )

            )
    );

    @Override
    public Priority create(Priority priority) {
        return null;
    }

    @Override
    public Priority get(Integer id) {
        return null;
    }

    @Override
    public Priority update(Priority priority) {
        return null;
    }

    @Override
    public Priority delete(Integer id) {
        return null;
    }

    @Override
    public List<Priority> getAll() {
        return this.list;
    }
}
