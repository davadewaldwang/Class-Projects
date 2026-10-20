// integer functions

#include <iostream>
#include <cassert>

// Function declarations
void pattern(unsigned int n);
unsigned int int_log10(unsigned int n);
unsigned int count_bits(unsigned int n, unsigned int bit);
unsigned int swap_bytes(unsigned int n, unsigned int b0, unsigned int b1);

void pattern(unsigned int n)
{
    if (n == 0)
    {
        std::cout << "*" << std::endl;
        return;
    }

    for (unsigned int i = 0; i <= n; i++) // top half
    {
        for (unsigned int space = 0; space < i; space++)
        {
            std::cout << " ";
        }
        for (int j = (n - i) * 2 + 1; j >= 1; j--)
        {
            std::cout << "*";
        }
        std::cout << std::endl;
    }

    for (unsigned int i = 1; i <= n; i++) // bottom half
    {
        for (unsigned int space = n - i; space >= 1; space--)
        {
            std::cout << " ";
        }
        for (unsigned int j = i * 2 + 1; j >= 1; j--)
        {
            std::cout << "*";
        }
        std::cout << std::endl;
    }
}

unsigned int int_log10(unsigned int n)
{
    assert(n != 0);

    if (n == 1)
    {
        return 0;
    }

    unsigned int exponent;
    for (exponent = 1; exponent < 10; exponent++) // find exponent where 10^exponent <= n
    {
        unsigned int power{1};
        for (unsigned int i = 0; i < exponent; i++) // find 10^exponent
        {
            power *= 10;
        }
        if (power > n)
        {
            exponent--;
            return exponent;
        }
    }
    exponent--;
    return exponent;
}

unsigned int count_bits(unsigned int n, unsigned int bit)
{
    assert(bit == 0 || bit == 1);
    unsigned int result{0};
    for (unsigned int i = 0; i < 32; i++)
    {
        if (n % 2 == bit)
        {
            result++;
        }
        n /= 2;
    }
    return result;
}

unsigned int swap_bytes(unsigned int n, unsigned int b0, unsigned int b1)
{
    assert(b0 >= 0 && b0 <= 3);
    assert(b1 >= 0 && b1 <= 3);

    if (b0 == b1)
    {
        return n;
    }

    b0 *= 8; //turn into bit location
    b1 *= 8;

    unsigned int byteb0{n >> b0};
    byteb0 = (byteb0 << b1) & (0xffu << b1); //put in b1 place
    unsigned int byteb1{n >> b1};
    byteb1 = (byteb1 << b0) & (0xffu << b0); //put in b0 place

    n &= ~((0xffu << b1) | (0xffu << b0)); //make byte b1 and b0 0000
    n |= (byteb0 | byteb1); //insert bytes

    return n;
}