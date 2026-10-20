// final grade calculator

#include <iostream>
#include <cmath>

int main();

int main()
{
    double f_max{};
    double f{};
    double m_max{};
    double m{};
    double p1_max{};
    double p1{};
    double p2_max{};
    double p2{};
    double p3_max{};
    double p3{};
    double p4_max{};
    double p4{};
    double p5_max{};
    double p5{};

    do
    {
        std::cout << "Enter max grade for final: ";
        std::cin >> f_max;
    } while (f_max != std::round(f_max) || f_max <= 0);

    do
    {
        std::cout << "Enter your grade for final: ";
        std::cin >> f;
    } while (f > f_max || f < 0);

    do
    {
        std::cout << "Enter max grade for midterm: ";
        std::cin >> m_max;
    } while (m_max != std::round(m_max) || m_max <= 0);

    do
    {
        std::cout << "Enter your grade for midterm: ";
        std::cin >> m;
    } while (m > m_max || m < 0);

    do
    {
        std::cout << "Enter max grade for project 1: ";
        std::cin >> p1_max;
    } while (p1_max != std::round(p1_max) || p1_max <= 0);

    do
    {
        std::cout << "Enter your grade for project 1: ";
        std::cin >> p1;
    } while (p1 > p1_max || p1 < 0);

    do
    {
        std::cout << "Enter max grade for project 2: ";
        std::cin >> p2_max;
    } while (p2_max != std::round(p2_max) || p2_max <= 0);

    do
    {
        std::cout << "Enter your grade for project 2: ";
        std::cin >> p2;
    } while (p2 > p2_max || p2 < 0);

    do
    {
        std::cout << "Enter max grade for project 3: ";
        std::cin >> p3_max;
    } while (p3_max != std::round(p3_max) || p3_max <= 0);

    do
    {
        std::cout << "Enter your grade for project 3: ";
        std::cin >> p3;
    } while (p3 > p3_max || p3 < 0);

    do
    {
        std::cout << "Enter max grade for project 4: ";
        std::cin >> p4_max;
    } while (p4_max != std::round(p4_max) || p4_max <= 0);

    do
    {
        std::cout << "Enter your grade for project 4: ";
        std::cin >> p4;
    } while (p4 > p4_max || p4 < 0);

    do
    {
        std::cout << "Enter max grade for project 5: ";
        std::cin >> p5_max;
    } while (p5_max != std::round(p5_max) || p5_max <= 0);

    do
    {
        std::cout << "Enter your grade for project 5: ";
        std::cin >> p5;
    } while (p5 > p5_max || p5 < 0);

    f = f / f_max * 100;
    m = m / m_max * 100;
    if (m < f)
        m = f;
    p1 = p1 / p1_max * 100;
    if (p1 < f)
        p1 = f;
    p2 = p2 / p2_max * 100;
    if (p2 < f)
        p2 = f;
    p3 = p3 / p3_max * 100;
    if (p3 < f)
        p3 = f;
    p4 = p4 / p4_max * 100;
    if (p4 < f)
        p4 = f;
    p5 = p5 / p5_max * 100;
    if (p5 < f)
        p5 = f;

    double e{.75 * f + .25 * m};
    double p{(p1 + p2 + p3 + p4 + p5) / 5};

    double final_grade{};
    if (e <= 40)
        final_grade = e;
    else if (e >= 60)
        final_grade = (2 * e / 3) + (p / 3);
    else
        final_grade = (p * (e - 40) / 20) / 3 + e * (1 - ((e - 40) / 20) / 3);

    final_grade = std::round(final_grade);
    std::cout << "Final grade: " << final_grade << std::endl;

    return 0;
}