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

    public MongoDatabaseInit(CategoryMongoRepository categoryRepository, PriorityMongoRepository priorityRepository, TaskMongoRepository taskRepository) {
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
                                        1L,
                                        "Работа",
                                        "laptop"
                                ),
                                new Category(
                                        2L,
                                        "Семья",
                                        "child_care"
                                ),
                                new Category(
                                        3L,
                                        "Учеба",
                                        "school"
                                ),
                                new Category(
                                        4L,
                                        "Отдых",
                                        "local_bar"
                                ),
                                new Category(
                                        5L,
                                        "Спорт",
                                        "sports_soccer"
                                ),
                                new Category(
                                        6L,
                                        "Еда",
                                        "fastfood"
                                ),
                                new Category(
                                        7L,
                                        "Финансы",
                                        "account_balance_wallet"
                                ),
                                new Category(
                                        8L,
                                        "Гаджеты",
                                        "devices"
                                ),
                                new Category(
                                        9L,
                                        "Здоровье",
                                        "sentiment_satisfied_alt"
                                ),
                                new Category(
                                        10L,
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
                                        1L,
                                        "Низкий",
                                        "#fcc"
                                ),
                                new Priority(
                                        2L,
                                        "Средний",
                                        "#f99"
                                ),
                                new Priority(
                                        3L,
                                        "Высокий",
                                        "#f66"
                                ),
                                new Priority(
                                        4L,
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
                                        1L,
                                        "Залить бензин полный бак",
                                        categoryRepository.findByName("Автомобиль"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.APRIL, 10)
                                ),
                                new Task(
                                        2L,
                                        "Передать отчеты в налоговую",
                                        categoryRepository.findByName("Работа"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.AUGUST, 28)
                                ),
                                new Task(
                                        3L,
                                        "Убраться у себя в комнате, полить растения",
                                        categoryRepository.findByName("Семья"),
                                        priorityRepository.findByName("Средний"),
                                        true,
                                        LocalDate.of(2020, Month.NOVEMBER, 11)
                                ),
                                new Task(
                                        4L,
                                        "Сходить на каток с семьей",
                                        categoryRepository.findByName("Семья"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.DECEMBER, 5)
                                ),
                                new Task(
                                        5L,
                                        "Найти и выучить учебник по квантовой физике",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Срочно"),
                                        false,
                                        LocalDate.of(2020, Month.MARCH, 21)
                                ),
                                new Task(
                                        6L,
                                        "Сходить на семинар по Котлину",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Низкий"),
                                        true,
                                        LocalDate.of(2020, Month.SEPTEMBER, 19)
                                ),
                                new Task(
                                        7L,
                                        "Найти билеты в Венгрию, выбрать отель",
                                        categoryRepository.findByName("Отдых"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.APRIL, 14)
                                ),
                                new Task(
                                        8L,
                                        "Приготовить ужин для всей семьи (семга с картошкой)",
                                        categoryRepository.findByName("Еда"),
                                        priorityRepository.findByName("Срочно"),
                                        false,
                                        LocalDate.of(2020, Month.OCTOBER, 21)
                                ),
                                new Task(
                                        9L,
                                        "Подтянуться 10 раз",
                                        categoryRepository.findByName("Спорт"),
                                        priorityRepository.findByName("Срочно"),
                                        false,
                                        LocalDate.of(2020, Month.OCTOBER, 9)
                                ),
                                new Task(
                                        10L,
                                        "Пробежать 100 метров",
                                        categoryRepository.findByName("Спорт"),
                                        priorityRepository.findByName("Низкий"),
                                        true,
                                        LocalDate.of(2020, Month.JUNE, 14)
                                ),
                                new Task(
                                        11L,
                                        "Организовать детский праздник",
                                        categoryRepository.findByName("Семья"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.SEPTEMBER, 28)
                                ),
                                new Task(
                                        12L,
                                        "Сходить на лекцию 'Как научиться программировать на Пайтон'",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.MAY, 6)
                                ),
                                new Task(
                                        13L,
                                        "Купить продукты на неделю",
                                        categoryRepository.findByName("Еда"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.JUNE, 21)
                                ),
                                new Task(
                                        14L,
                                        "Провести собрание по поводу всех проектов",
                                        categoryRepository.findByName("Работа"),
                                        priorityRepository.findByName("Срочно"),
                                        true,
                                        LocalDate.of(2020, Month.NOVEMBER, 7)
                                ),
                                new Task(
                                        15L,
                                        "Сдать экзамен по Java Oracle",
                                        categoryRepository.findByName("Учеба"),
                                        priorityRepository.findByName("Средний"),
                                        true,
                                        LocalDate.of(2020, Month.JULY, 3)
                                ),
                                new Task(
                                        16L,
                                        "Положить 100 грн в банк на депозит",
                                        categoryRepository.findByName("Финансы"),
                                        priorityRepository.findByName("Высокий"),
                                        false,
                                        LocalDate.of(2020, Month.APRIL, 26)
                                ),
                                new Task(
                                        17L,
                                        "Попросить аванс на работе",
                                        categoryRepository.findByName("Финансы"),
                                        priorityRepository.findByName("Средний"),
                                        false,
                                        LocalDate.of(2020, Month.AUGUST, 15)
                                ),
                                new Task(
                                        18L,
                                        "Сдать анализы, проверить гемоглобин",
                                        categoryRepository.findByName("Здоровье"),
                                        priorityRepository.findByName("Высокий"),
                                        false,
                                        LocalDate.of(2020, Month.DECEMBER, 11)
                                ),
                                new Task(
                                        19L,
                                        "Сравнить новый айпад с самсунгом",
                                        categoryRepository.findByName("Гаджеты"),
                                        priorityRepository.findByName("Низкий"),
                                        false,
                                        LocalDate.of(2020, Month.OCTOBER, 11)
                                ),
                                new Task(
                                        20L,
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