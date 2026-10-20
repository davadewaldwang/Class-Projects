#include <iostream>
#include <cassert>

// We can include libraries for testing that aren't normally available
#include <bit>
#include <bitset>

// include "file.name" copies the text into this document
#include "project_2.cpp"

int main();
int main()
{

    // Testing code here
    pattern(0);
    std::cout << int_log10(4294967295) << std::endl;
    std::cout << count_bits(32, 0) << std::endl;
    std::cout << (32-std::popcount(32u)) << std::endl;
    std::cout << swap_bytes( 32, 2, 0 ) << std::endl;

    return 0;
}

