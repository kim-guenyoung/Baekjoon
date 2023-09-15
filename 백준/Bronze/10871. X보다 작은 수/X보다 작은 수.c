#include <stdio.h>
int main(void)
{
    int num, n, i;
    scanf("%d", &num);
    int arr[num];
    scanf("%d", &n);
    for(i = 0; i < num; i++)
        scanf("%d", &arr[i]);
    for(i = 0; i < num; i++)
    {
        if(arr[i] < n)
            printf("%d ", arr[i]);
    }
}