.class public Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/core/ThreadAuditor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ThreadHandle"
.end annotation


# instance fields
.field private isThreadActive:Z

.field final synthetic this$0:Landroid/gov/nist/core/ThreadAuditor;

.field private thread:Ljava/lang/Thread;

.field private threadAuditor:Landroid/gov/nist/core/ThreadAuditor;


# direct methods
.method public constructor <init>(Landroid/gov/nist/core/ThreadAuditor;Landroid/gov/nist/core/ThreadAuditor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->this$0:Landroid/gov/nist/core/ThreadAuditor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->isThreadActive:Z

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->thread:Ljava/lang/Thread;

    .line 14
    .line 15
    iput-object p2, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public getPingIntervalInMillisecs()J
    .locals 2

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/ThreadAuditor;->getPingIntervalInMillisecs()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getThread()Ljava/lang/Thread;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->thread:Ljava/lang/Thread;

    .line 2
    .line 3
    return-object p0
.end method

.method public isThreadActive()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->isThreadActive:Z

    .line 2
    .line 3
    return p0
.end method

.method public ping()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/gov/nist/core/ThreadAuditor;->ping(Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setThreadActive(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->isThreadActive:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Thread Name: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->thread:Ljava/lang/Thread;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", Alive: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->thread:Ljava/lang/Thread;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
