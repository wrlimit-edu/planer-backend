package com.wrlimit.planerbackend;

import com.wrlimit.planerbackend.model.Category;
import com.wrlimit.planerbackend.model.Priority;
import com.wrlimit.planerbackend.model.Task;
import com.wrlimit.planerbackend.repository.CategoryMongoRepository;
import com.wrlimit.planerbackend.repository.PriorityMongoRepository;
import com.wrlimit.planerbackend.repository.TaskMongoRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class MongoDatabaseInit {
    private final CategoryMongoRepository categoryRepository;
    private final PriorityMongoRepository priorityRepository;
    private final TaskMongoRepository taskRepository;

    public MongoDatabaseInit(
            CategoryMongoRepository categoryRepository,
            PriorityMongoRepository priorityRepository,
            TaskMongoRepository taskRepository
    ) {
        this.categoryRepository = categoryRepository;
        this.priorityRepository = priorityRepository;
        this.taskRepository = taskRepository;
    }

    @PostConstruct
    private void postConstruct() {

        /* Category */
        categoryRepository.deleteAll();
        categoryRepository.saveAll(
                new ArrayList<>(
                        Arrays.asList(
                                new Category(
                                        "Работа",
                                        "laptop"
                                ),
                                new Category(
                                        "Семья",
                                        "child_care"
                                ),
                                new Category(
                                        "Учеба",
                                        "school"
                                ),
                                new Category(
                                        "Отдых",
                                        "local_bar"
                                ),
                                new Category(
                                        "Спорт",
                                        "sports_soccer"
                                ),
                                new Category(
                                        "Еда",
                                        "fastfood"
                                ),
                                new Category(
                                        "Финансы",
                                        "account_balance_wallet"
                                ),
                                new Category(
                                        "Гаджеты",
                                        "devices"
                                ),
                                new Category(
                                        "Здоровье",
                                        "sentiment_satisfied_alt"
                                ),
                                new Category(
                                        "Автомобиль",
                                        "directions_car"
                                )
                        )
                )
        );

        /* Priority */
        priorityRepository.deleteAll();
        priorityRepository.saveAll(
                new ArrayList<>(
                        Arrays.asList(
                                new Priority(
                                        "Низкий",
                                        "#fcc"
                                ),
                                new Priority(
                                        "Средний",
                                        "#f99"
                                ),
                                new Priority(
                                        "Высокий",
                                        "#f66"
                                ),
                                new Priority(
                                        "Срочно",
                                        "#f00"
                                )
                        )
                )
        );

        /* Task */
        taskRepository.deleteAll();
        taskRepository.saveAll(
                new ArrayList<>(
                        Arrays.asList(
                                new Task(
                                        "Залить бензин полный бак",
                                        categoryRepository.findByName("Автомобиль"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.APRIL, 10)
                                ),
                                new Task(
                                        "Передать отчеты в налоговую",
                                        categoryRepository.findByName("Работа"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.AUGUST, 28)
                                ),
                                new Task(
                                        "Убраться у себя в комнате, полить растения",
                                        categoryRepository.findByName("Семья"),
                                        priorityRepository.findByName("Средний"),
                                        true,
                                        LocalDate.of(2020, Month.NOVEMBER, 11)
                                ),
                                new Task(
                                        "Сходить на каток с семьей",
                                        categoryRepository.findByName("Семья"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.DECEMBER, 5)
                                ),
                                new Task(
                                        "Найти и выучить учебник по квантовой физике",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Срочно"),
                                        false,
                                        LocalDate.of(2020, Month.MARCH, 21)
                                ),
                                new Task(
                                        "Сходить на семинар по Котлину",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Низкий"),
                                        true,
                                        LocalDate.of(2020, Month.SEPTEMBER, 19)
                                ),
                                new Task(
                                        "Найти билеты в Венгрию, выбрать отель",
                                        categoryRepository.findByName("Отдых"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.APRIL, 14)
                                ),
                                new Task(
                                        "Приготовить ужин для всей семьи (семга с картошкой)",
                                        categoryRepository.findByName("Еда"),
                                        priorityRepository.findByName("Срочно"),
                                        false,
                                        LocalDate.of(2020, Month.OCTOBER, 21)
                                ),
                                new Task(
                                        "Подтянуться 10 раз",
                                        categoryRepository.findByName("Спорт"),
                                        priorityRepository.findByName("Срочно"),
                                        false,
                                        LocalDate.of(2020, Month.OCTOBER, 9)
                                ),
                                new Task(
                                        "Пробежать 100 метров",
                                        categoryRepository.findByName("Спорт"),
                                        priorityRepository.findByName("Низкий"),
                                        true,
                                        LocalDate.of(2020, Month.JUNE, 14)
                                ),
                                new Task(
                                        "Организовать детский праздник",
                                        categoryRepository.findByName("Семья"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.SEPTEMBER, 28)
                                ),
                                new Task(
                                        "Сходить на лекцию 'Как научиться программировать на Пайтон'",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.MAY, 6)
                                ),
                                new Task(
                                        "Купить продукты на неделю",
                                        categoryRepository.findByName("Еда"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.JUNE, 21)
                                ),
                                new Task(
                                        "Провести собрание по поводу всех проектов",
                                        categoryRepository.findByName("Работа"),
                                        priorityRepository.findByName("Срочно"),
                                        true,
                                        LocalDate.of(2020, Month.NOVEMBER, 7)
                                ),
                                new Task(
                                        "Сдать экзамен по Java Oracle",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Средний"),
                                        true,
                                        LocalDate.of(2020, Month.JULY, 3)
                                ),
                                new Task(
                                        "Положить 100 грн в банк на депозит",
                                        categoryRepository.findByName("Финансы"),
                                        priorityRepository.findByName("Высокий"),
                                        false,
                                        LocalDate.of(2020, Month.APRIL, 26)
                                ),
                                new Task(
                                        "Попросить аванс на работе",
                                        categoryRepository.findByName("Финансы"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.AUGUST, 15)
                                ),
                                new Task(
                                        "Сдать анализы, проверить гемоглобин",
                                        categoryRepository.findByName("Здоровье"),
                                        priorityRepository.findByName("Высокий"),
                                        false,
                                        LocalDate.of(2020, Month.DECEMBER, 11)
                                ),
                                new Task(
                                        "Сравнить новый айпад с самсунгом",
                                        categoryRepository.findByName("Гаджеты"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.OCTOBER, 11)
                                ),
                                new Task(
                                        "Футбол с сотрудниками",
                                        categoryRepository.findByName("Спорт"),
                                        priorityRepository.findByName("Высокий"),
                                        false,
                                        LocalDate.of(2020, Month.MARCH, 17)
                                )
                        )
                )
        );
    }
}