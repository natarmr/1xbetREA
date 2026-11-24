.class public Landroid/gov/nist/javax/sip/parser/Pipeline;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;,
        Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;
    }
.end annotation


# instance fields
.field private buffList:Ljava/util/LinkedList;

.field private currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

.field private isClosed:Z

.field private myTimerTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

.field private pipe:Ljava/io/InputStream;

.field private readTimeout:I

.field private timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;ILandroid/gov/nist/javax/sip/stack/timers/SipTimer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 5
    .line 6
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->pipe:Ljava/io/InputStream;

    .line 7
    .line 8
    new-instance p1, Ljava/util/LinkedList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 14
    .line 15
    iput p2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->readTimeout:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->pipe:Ljava/io/InputStream;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0
.end method

.method public isClosed()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed:Z

    .line 2
    .line 3
    return p0
.end method

.method public read()I
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget v3, v1, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 10
    .line 11
    iget v4, v1, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->length:I

    .line 12
    .line 13
    if-ge v3, v4, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->getNextByte()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 20
    .line 21
    iget v4, v3, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 22
    .line 23
    iget v3, v3, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->length:I

    .line 24
    .line 25
    if-ne v4, v3, :cond_0

    .line 26
    .line 27
    iput-object v2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_3

    .line 32
    :cond_0
    :goto_0
    monitor-exit v0

    .line 33
    return v1

    .line 34
    :cond_1
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed:Z

    .line 35
    .line 36
    const/4 v3, -0x1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    return v3

    .line 49
    :cond_2
    :try_start_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    iget-object v4, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->wait()V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed:Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    return v3

    .line 76
    :catch_0
    move-exception p0

    .line 77
    goto :goto_1

    .line 78
    :catch_1
    move-exception p0

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    :try_start_4
    invoke-virtual {v4}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 85
    .line 86
    iput-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->getNextByte()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 93
    .line 94
    iget v4, v3, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 95
    .line 96
    iget v3, v3, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->length:I

    .line 97
    .line 98
    if-ne v4, v3, :cond_4

    .line 99
    .line 100
    iput-object v2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->currentBuffer:Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 101
    .line 102
    :cond_4
    :try_start_5
    monitor-exit v0

    .line 103
    return v1

    .line 104
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    new-instance v1, Ljava/io/IOException;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1

    .line 117
    :goto_2
    new-instance v1, Ljava/io/IOException;

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-direct {v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v1

    .line 127
    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 128
    throw p0
.end method

.method public startTimer()V
    .locals 4

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->readTimeout:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;

    .line 8
    .line 9
    invoke-direct {v0, p0, p0}, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;-><init>(Landroid/gov/nist/javax/sip/parser/Pipeline;Landroid/gov/nist/javax/sip/parser/Pipeline;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->myTimerTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 13
    .line 14
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 15
    .line 16
    iget p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->readTimeout:I

    .line 17
    .line 18
    int-to-long v2, p0

    .line 19
    invoke-interface {v1, v0, v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public stopTimer()V
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->readTimeout:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->myTimerTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->timer:Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public write([B)V
    .locals 2

    .line 36
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed:Z

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    array-length v1, p1

    invoke-direct {v0, p0, p1, v1}, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;-><init>(Landroid/gov/nist/javax/sip/parser/Pipeline;[BI)V

    .line 38
    iget-object p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    monitor-enter p1

    .line 39
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 41
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 42
    :cond_0
    const-string p0, "Closed!!"

    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1, p3}, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;-><init>(Landroid/gov/nist/javax/sip/parser/Pipeline;[BI)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, Landroid/gov/nist/javax/sip/parser/Pipeline$Buffer;->ptr:I

    .line 11
    .line 12
    iget-object p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 13
    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline;->buffList:Ljava/util/LinkedList;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 23
    .line 24
    .line 25
    monitor-exit p1

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0

    .line 30
    :cond_0
    const-string p0, "Closed!!"

    .line 31
    .line 32
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
