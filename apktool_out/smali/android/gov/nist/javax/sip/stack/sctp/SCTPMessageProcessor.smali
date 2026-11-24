.class public final Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;
.super Landroid/gov/nist/javax/sip/stack/MessageProcessor;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final channels:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;",
            ">;"
        }
    .end annotation
.end field

.field private doClose:Z

.field private isRunning:Z

.field private key:Ljava/nio/channels/SelectionKey;

.field private sctpServerChannel:Lcom/sun/nio/sctp/SctpServerChannel;

.field private selector:Ljava/nio/channels/Selector;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "sctp"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->channels:Ljava/util/Set;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public createMessageChannel(Landroid/gov/nist/core/HostPort;)Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 1

    .line 17
    invoke-virtual {p1}, Landroid/gov/nist/core/HostPort;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p1}, Landroid/gov/nist/core/HostPort;->getPort()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    move-result-object p0

    return-object p0
.end method

.method public createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 2

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;

    .line 2
    .line 3
    new-instance v1, Ljava/net/InetSocketAddress;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;-><init>(Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;Ljava/net/InetSocketAddress;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->channels:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getDefaultTargetPort()I
    .locals 0

    const/16 p0, 0x13c4

    return p0
.end method

.method public getMaximumMessageSize()I
    .locals 0

    const p0, 0x7fffffff

    return p0
.end method

.method public getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelector()Ljava/nio/channels/Selector;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 2
    .line 3
    return-object p0
.end method

.method public inUse()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->isRunning:Z

    .line 2
    .line 3
    return p0
.end method

.method public isSecure()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public registerChannel(Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;Lcom/sun/nio/sctp/SctpChannel;)Ljava/nio/channels/SelectionKey;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p2, v0, v1, p1}, Lcom/sun/nio/sctp/SctpChannel;->register(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public removeChannel(Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->channels:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public run()V
    .locals 3

    .line 1
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->select()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/nio/channels/SelectionKey;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->attachment()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;->readMessages()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v1}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->sctpServerChannel:Lcom/sun/nio/sctp/SctpServerChannel;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/sun/nio/sctp/SctpServerChannel;->accept()Lcom/sun/nio/sctp/SctpChannel;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;

    .line 65
    .line 66
    invoke-direct {v2, p0, v1}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;-><init>(Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;Lcom/sun/nio/sctp/SctpChannel;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->channels:Ljava/util/Set;

    .line 70
    .line 71
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :try_start_1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->doClose:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->close()V

    .line 83
    .line 84
    .line 85
    monitor-exit p0

    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :try_start_2
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->isOpen()Z

    .line 93
    .line 94
    .line 95
    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 96
    if-nez v0, :cond_0

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 100
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 101
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    .line 103
    .line 104
    :try_start_5
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->stop()V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto :goto_5

    .line 115
    :catch_1
    move-exception v0

    .line 116
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :goto_4
    return-void

    .line 121
    :goto_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->stop()V

    .line 122
    .line 123
    .line 124
    throw v0
.end method

.method public start()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/sun/nio/sctp/SctpServerChannel;->open()Lcom/sun/nio/sctp/SctpServerChannel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->sctpServerChannel:Lcom/sun/nio/sctp/SctpServerChannel;

    .line 6
    .line 7
    new-instance v1, Ljava/net/InetSocketAddress;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v1, v2, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/sun/nio/sctp/SctpServerChannel;->bind(Ljava/net/SocketAddress;)Lcom/sun/nio/sctp/SctpServerChannel;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->sctpServerChannel:Lcom/sun/nio/sctp/SctpServerChannel;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {v0, v1}, Lcom/sun/nio/sctp/SctpServerChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 34
    .line 35
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->sctpServerChannel:Lcom/sun/nio/sctp/SctpServerChannel;

    .line 36
    .line 37
    const/16 v2, 0x10

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lcom/sun/nio/sctp/SctpServerChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->key:Ljava/nio/channels/SelectionKey;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->isRunning:Z

    .line 47
    .line 48
    new-instance v1, Ljava/lang/Thread;

    .line 49
    .line 50
    invoke-direct {v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 54
    .line 55
    .line 56
    const-string p0, "SCTPMessageProcessorThread"

    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/16 p0, 0xa

    .line 62
    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/Thread;->setPriority(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->isRunning:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->doClose:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->channels:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageChannel;->closeNoRemove()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->channels:Ljava/util/Set;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->key:Ljava/nio/channels/SelectionKey;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->sctpServerChannel:Lcom/sun/nio/sctp/SctpServerChannel;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/sun/nio/sctp/SctpServerChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    .line 43
    .line 44
    monitor-enter p0

    .line 45
    :try_start_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw v0

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v0

    .line 58
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    monitor-enter p0

    .line 62
    :try_start_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 65
    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :catchall_2
    move-exception v0

    .line 70
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 71
    throw v0

    .line 72
    :goto_1
    monitor-enter p0

    .line 73
    :try_start_4
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/sctp/SCTPMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/nio/channels/Selector;->wakeup()Ljava/nio/channels/Selector;

    .line 76
    .line 77
    .line 78
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 79
    throw v0

    .line 80
    :catchall_3
    move-exception v0

    .line 81
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 82
    throw v0
.end method
