.class public final synthetic La/ytt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/k4r;
.implements La/wzn0;
.implements La/d1x;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ytt0;->a:B

    iput-object p1, p0, La/ytt0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(La/e1x;)V
    .locals 5

    .line 1
    iget-object p0, p0, La/ytt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/g4w0;

    .line 4
    .line 5
    const-string v0, "CXCP"

    .line 6
    .line 7
    :try_start_0
    invoke-interface {p1}, La/e1x;->b()La/b1x;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_6

    .line 12
    .line 13
    iget-object p0, p0, La/g4w0;->c:La/fck0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, La/b1x;->K0()La/f0x;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, La/dy9;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    check-cast v1, La/dy9;

    .line 28
    .line 29
    iget-object v1, v1, La/dy9;->a:La/cy9;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v1, v3

    .line 33
    :goto_0
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-interface {v1}, La/cy9;->m()La/zx9;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v4, La/zx9;->f:La/zx9;

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, La/cy9;->m()La/zx9;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v4, La/zx9;->d:La/zx9;

    .line 49
    .line 50
    if-eq v2, v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-interface {v1}, La/cy9;->p()La/yx9;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    sget-object v4, La/yx9;->e:La/yx9;

    .line 58
    .line 59
    if-eq v2, v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-interface {v1}, La/cy9;->o()La/ay9;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget-object v2, La/ay9;->d:La/ay9;

    .line 67
    .line 68
    if-eq v1, v2, :cond_4

    .line 69
    .line 70
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    iget-object v1, p0, La/fck0;->c:Ljava/lang/Object;

    .line 75
    .line 76
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :try_start_1
    iget-object v2, p0, La/fck0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Ljava/util/ArrayDeque;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v4, 0x3

    .line 86
    if-lt v2, v4, :cond_5

    .line 87
    .line 88
    invoke-virtual {p0}, La/fck0;->c()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ljava/util/ArrayDeque;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    if-eqz v3, :cond_6

    .line 104
    .line 105
    :try_start_2
    check-cast v3, La/b1x;

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 113
    :catch_0
    invoke-static {}, La/l8x;->g0()Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_6

    .line 118
    .line 119
    const-string p0, "Failed to acquire latest image"

    .line 120
    .line 121
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    :cond_6
    return-void
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/ytt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ywu0;

    .line 4
    .line 5
    sget-object v0, La/ywu0;->s2:La/sxs0;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string p2, "CODE_CONFIRMED_RESULT"

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const-string v0, ""

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, La/ywu0;->P0()La/k3t0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p2, La/cwu0;

    .line 25
    .line 26
    const-string v1, "CODE_CONFIRMED_MESSAGE"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, p1

    .line 36
    :goto_0
    invoke-direct {p2, v0}, La/cwu0;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-virtual {p0}, La/ywu0;->P0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p2, La/dwu0;

    .line 48
    .line 49
    const-string v1, "CODE_CONFIRMATION_ERROR"

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v0, p1

    .line 59
    :goto_1
    invoke-direct {p2, v0}, La/dwu0;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p0, p0, La/ytt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/fht0;

    .line 4
    .line 5
    iget-object v0, p0, La/fht0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/wpg0;

    .line 8
    .line 9
    new-instance v1, La/e9d0;

    .line 10
    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/e9d0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/wpg0;->d(La/upg0;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/q55;

    .line 37
    .line 38
    iget-object v2, p0, La/fht0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, La/y3v;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v2, v1, v3, v4}, La/y3v;->v(La/q55;IZ)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/ytt0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ytt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    check-cast p0, La/nov0;

    .line 16
    .line 17
    iget-object p0, p0, La/nov0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    check-cast p0, Landroid/content/Intent;

    .line 25
    .line 26
    invoke-static {p0}, La/qjj;->P(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ytt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method
