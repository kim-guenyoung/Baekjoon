// 닭고기, 쇠고기, 파스타
#include <stdio.h>
int main(void)
{
    int food1, food2, food3;
    scanf("%d %d %d", &food1, &food2, &food3);
    
    int choose1, choose2, choose3;
    scanf("%d %d %d", &choose1, &choose2, &choose3);

    int lack = 0;

    if(food1 < choose1)
        lack = choose1 - food1;
    if(food2 < choose2)
        lack += (choose2 - food2);

    if(food3 < choose3)
        lack += (choose3 - food3);
    
    printf("%d", lack);
}