#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main(void)
{
    int num, sum = 0;
    
    int K;
    int v[1000000] = { 0, };
    int s = 0;
    scanf("%d", &K);
    for (int i = 1; i <= K; i++)
    {
        scanf("%d", &num);
        if (num != 0)
        {
            v[s++] = num;
        }
        else
        {
            v[s--] = 0;
        }
    }
    for (int i = 0; i < s; i++)
    {
        sum += v[i];
    }

    printf("%d", sum);

    return 0;
}