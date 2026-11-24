.class public final La/c5w0;
.super La/m8w0;
.source "SourceFile"


# instance fields
.field public final synthetic g:B

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c5w0;->g:B

    iput-object p1, p0, La/c5w0;->h:Ljava/lang/Object;

    invoke-direct {p0}, La/m8w0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    iget-byte v0, p0, La/c5w0;->g:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, La/h5w0;

    .line 11
    .line 12
    iget-object v0, v0, La/h5w0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v3, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/h5w0;

    .line 18
    .line 19
    iget-object v3, v3, La/h5w0;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-lez v3, :cond_0

    .line 26
    .line 27
    iget-object v3, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, La/h5w0;

    .line 30
    .line 31
    iget-object v3, v3, La/h5w0;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-lez v3, :cond_0

    .line 38
    .line 39
    iget-object p0, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/h5w0;

    .line 42
    .line 43
    iget-object p0, p0, La/h5w0;->b:La/h8w0;

    .line 44
    .line 45
    const-string v2, "Leaving the connection open for other ongoing calls."

    .line 46
    .line 47
    new-array v1, v1, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p0, v2, v1}, La/h8w0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-object v3, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, La/h5w0;

    .line 59
    .line 60
    iget-object v4, v3, La/h5w0;->n:Landroid/os/IInterface;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v3, v3, La/h5w0;->b:La/h8w0;

    .line 65
    .line 66
    const-string v4, "Unbind from service."

    .line 67
    .line 68
    new-array v5, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v3, v4, v5}, La/h8w0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v3, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, La/h5w0;

    .line 76
    .line 77
    iget-object v4, v3, La/h5w0;->a:Landroid/content/Context;

    .line 78
    .line 79
    iget-object v3, v3, La/h5w0;->m:La/g5w0;

    .line 80
    .line 81
    invoke-virtual {v4, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    check-cast v3, La/h5w0;

    .line 88
    .line 89
    iput-boolean v1, v3, La/h5w0;->g:Z

    .line 90
    .line 91
    iput-object v2, v3, La/h5w0;->n:Landroid/os/IInterface;

    .line 92
    .line 93
    iput-object v2, v3, La/h5w0;->m:La/g5w0;

    .line 94
    .line 95
    :cond_1
    invoke-virtual {v3}, La/h5w0;->e()V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    :goto_0
    return-void

    .line 100
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0

    .line 102
    :pswitch_0
    iget-object p0, p0, La/c5w0;->h:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, La/g5w0;

    .line 105
    .line 106
    iget-object p0, p0, La/g5w0;->a:La/h5w0;

    .line 107
    .line 108
    iget-object v0, p0, La/h5w0;->b:La/h8w0;

    .line 109
    .line 110
    const-string v3, "unlinkToDeath"

    .line 111
    .line 112
    new-array v4, v1, [Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v0, v3, v4}, La/h8w0;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, La/h5w0;->n:Landroid/os/IInterface;

    .line 118
    .line 119
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v3, p0, La/h5w0;->k:La/p8w0;

    .line 124
    .line 125
    invoke-interface {v0, v3, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 126
    .line 127
    .line 128
    iput-object v2, p0, La/h5w0;->n:Landroid/os/IInterface;

    .line 129
    .line 130
    iput-boolean v1, p0, La/h5w0;->g:Z

    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
