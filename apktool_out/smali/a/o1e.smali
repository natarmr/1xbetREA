.class public final La/o1e;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/rw40;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/o1e;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/o1e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, La/o1e;->a:B

    iput-object p1, p0, La/o1e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object p0, p0, La/o1e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/p1e;

    .line 4
    .line 5
    iget-object v0, p0, La/p1e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iget-object v1, p0, La/p1e;->b:La/p7m0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v0, v1, v2}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/p1e;->c:La/p7m0;

    .line 23
    .line 24
    invoke-static {v0, p0, v2}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/o1e;->a:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/o1e;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onBlockedStatusChanged(Landroid/net/Network;Z)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/o1e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/rl50;

    .line 16
    .line 17
    iget-object v0, v0, La/rl50;->g:Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v0, La/ql50;->a:Ljava/lang/String;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Network blocked status changed: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p1, v0, v1}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/o1e;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, La/rl50;

    .line 55
    .line 56
    iget-object v0, p1, La/b4e;->e:Ljava/lang/Object;

    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, La/rl50;->d()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_0
    check-cast v0, La/pl50;

    .line 65
    .line 66
    iget-object p1, p0, La/o1e;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, La/rl50;

    .line 69
    .line 70
    iget-object v1, p1, La/rl50;->h:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v1

    .line 73
    :try_start_0
    iget-boolean v2, p1, La/rl50;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    if-ne v2, p2, :cond_1

    .line 76
    .line 77
    monitor-exit v1

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    :try_start_1
    iput-boolean p2, p1, La/rl50;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    monitor-exit v1

    .line 82
    iget-object p0, p0, La/o1e;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, La/rl50;

    .line 85
    .line 86
    iget-boolean v2, v0, La/pl50;->a:Z

    .line 87
    .line 88
    iget-boolean v3, v0, La/pl50;->b:Z

    .line 89
    .line 90
    iget-boolean v4, v0, La/pl50;->c:Z

    .line 91
    .line 92
    iget-boolean v5, v0, La/pl50;->d:Z

    .line 93
    .line 94
    new-instance v1, La/pl50;

    .line 95
    .line 96
    move v6, p2

    .line 97
    invoke-direct/range {v1 .. v6}, La/pl50;-><init>(ZZZZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1}, La/b4e;->f(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    monitor-exit v1

    .line 107
    throw p0

    .line 108
    :cond_2
    :goto_0
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/o1e;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, La/ql50;->a:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "Network capabilities changed: "

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, v0, p2}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/o1e;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, La/rl50;

    .line 38
    .line 39
    iget-object p1, p0, La/rl50;->g:Landroid/net/ConnectivityManager;

    .line 40
    .line 41
    iget-boolean p2, p0, La/rl50;->i:Z

    .line 42
    .line 43
    invoke-static {p1, p2}, La/ql50;->a(Landroid/net/ConnectivityManager;Z)La/pl50;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, La/b4e;->f(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget-object p2, La/pov0;->a:Ljava/lang/String;

    .line 62
    .line 63
    const-string v0, "NetworkRequestConstraintController onCapabilitiesChanged callback"

    .line 64
    .line 65
    invoke-virtual {p1, p2, v0}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/o1e;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, La/rw40;

    .line 71
    .line 72
    sget-object p1, La/u4e;->a:La/u4e;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, La/rw40;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_1
    iget-object v0, p0, La/o1e;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La/p1e;

    .line 81
    .line 82
    iget-object v0, v0, La/p1e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const/16 v1, 0xc

    .line 91
    .line 92
    invoke-virtual {p2, v1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    const/16 v2, 0x10

    .line 97
    .line 98
    invoke-virtual {p2, v2}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    if-eqz p2, :cond_0

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {p0}, La/o1e;->a()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/o1e;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/o1e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/ql50;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "Network connection lost"

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v1, La/rl50;

    .line 23
    .line 24
    new-instance v2, La/pl50;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-direct/range {v2 .. v7}, La/pl50;-><init>(ZZZZZ)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, La/b4e;->f(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object p1, La/pov0;->a:Ljava/lang/String;

    .line 43
    .line 44
    const-string v0, "NetworkRequestConstraintController onLost callback"

    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v1, La/rw40;

    .line 50
    .line 51
    new-instance p0, La/v4e;

    .line 52
    .line 53
    const/4 p1, 0x7

    .line 54
    invoke-direct {p0, p1}, La/v4e;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p0}, La/rw40;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    check-cast v1, La/p1e;

    .line 62
    .line 63
    iget-object v0, v1, La/p1e;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/o1e;->a()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
