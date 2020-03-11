#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>
#include <signal.h>

void handler1(int signal)
{
    if(signal == SIGINT)
    {
        printf("Receive SIGNIT");
    }
    else if(signal == SIGUSR1)
    {
        printf("Receive SIGUSR1");
    }
    else if(signal == SIGUSR2)
    {
        printf("Receive SIGUSR2");
    }    
}
int main()
{
    pid_t ownPID=fork();

    if(ownPID==0)
    {
        signal(SIGINT, handler1);
        signal(SIGUSR1, handler1);
        signal(SIGUSR2, handler1);
        while(1);
    }
    else
    {
        while(1)
        {
            int c=getchar();
            if(c==1)
            {
                kill(ownPID, SIGINT);
            }
            else if(c==2)
            {
                kill(ownPID, SIGUSR1);
            }
            else if(c==3)
            {
                kill(ownPID, SIGUSR2);
            }
            else if(c==4)
            {
                break;
            }
            c==1;
            }
        }
}