#include <stdio.h>
int main(void)
{
    int n;
    int sum = 0;
    scanf("%d", &n);
    int i;
    for(i = 1; i <= n; i++)
        sum += i;
    printf("%d", sum);
}