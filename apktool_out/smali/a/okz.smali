.class public final La/okz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/blz;
.implements La/lx9;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La/clz;

.field public final c:La/t3a;

.field public d:Z

.field public e:La/rrd;


# direct methods
.method public constructor <init>(La/clz;La/t3a;La/veg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p3, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, La/okz;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    iput-boolean p3, p0, La/okz;->d:Z

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    iput-object p3, p0, La/okz;->e:La/rrd;

    .line 16
    .line 17
    iput-object p1, p0, La/okz;->b:La/clz;

    .line 18
    .line 19
    iput-object p2, p0, La/okz;->c:La/t3a;

    .line 20
    .line 21
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    iget-object p3, p3, La/glz;->i:La/lkz;

    .line 26
    .line 27
    sget-object v0, La/lkz;->d:La/lkz;

    .line 28
    .line 29
    invoke-virtual {p3, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-ltz p3, :cond_0

    .line 34
    .line 35
    invoke-virtual {p2}, La/t3a;->l()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p2}, La/t3a;->u()V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-interface {p1}, La/clz;->x()La/glz;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, p0}, La/glz;->a(La/blz;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a()La/j0a;
    .locals 0

    .line 1
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 2
    .line 3
    iget-object p0, p0, La/t3a;->a:La/ap;

    .line 4
    .line 5
    iget-object p0, p0, La/ap;->b:La/zo;

    .line 6
    .line 7
    return-object p0
.end method

.method public final c(La/rrd;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/okz;->e:La/rrd;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, La/okz;->e:La/rrd;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, La/okz;->e:La/rrd;

    .line 17
    .line 18
    iget-object v2, v2, La/rrd;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/List;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p1, La/rrd;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    new-instance v2, La/rrd;

    .line 33
    .line 34
    iget-object v3, p1, La/rrd;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, La/wju0;

    .line 37
    .line 38
    iget-object v4, p1, La/rrd;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Ljava/util/List;

    .line 41
    .line 42
    invoke-direct {v2, v1, v3, v4}, La/rrd;-><init>(Ljava/util/ArrayList;La/wju0;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, La/okz;->e:La/rrd;

    .line 46
    .line 47
    :goto_0
    iget-object v1, p0, La/okz;->c:La/t3a;

    .line 48
    .line 49
    iget-object v2, p1, La/rrd;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, La/wju0;

    .line 52
    .line 53
    iget-object v3, v1, La/t3a;->l:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :try_start_1
    iput-object v2, v1, La/t3a;->h:La/wju0;

    .line 57
    .line 58
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 59
    :try_start_2
    iget-object v1, p0, La/okz;->c:La/t3a;

    .line 60
    .line 61
    iget-object v2, p1, La/rrd;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/util/List;

    .line 64
    .line 65
    iget-object v3, v1, La/t3a;->l:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    :try_start_3
    iput-object v2, v1, La/t3a;->i:Ljava/util/List;

    .line 69
    .line 70
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 71
    :try_start_4
    iget-object v1, p0, La/okz;->c:La/t3a;

    .line 72
    .line 73
    iget-object v1, v1, La/t3a;->l:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 76
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 77
    :try_start_6
    iget-object v1, p0, La/okz;->c:La/t3a;

    .line 78
    .line 79
    iget-object v2, p1, La/rrd;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Landroid/util/Range;

    .line 82
    .line 83
    iget-object v3, v1, La/t3a;->l:Ljava/lang/Object;

    .line 84
    .line 85
    monitor-enter v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 86
    :try_start_7
    iput-object v2, v1, La/t3a;->j:Landroid/util/Range;

    .line 87
    .line 88
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 89
    :try_start_8
    invoke-virtual {p0}, La/okz;->a()La/j0a;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/n0a;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v1, p1}, La/eke0;->c(La/n0a;La/rrd;)La/wsf0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget-object v2, p1, La/rrd;->i:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    .line 106
    new-instance v3, La/llo;

    .line 107
    .line 108
    const/16 v4, 0xd

    .line 109
    .line 110
    invoke-direct {v3, v1, p1, v4}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 114
    .line 115
    .line 116
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 117
    .line 118
    iget-object p1, p1, La/rrd;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {p0, p1, v1}, La/t3a;->c(Ljava/util/Collection;La/wsf0;)V

    .line 123
    .line 124
    .line 125
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 126
    return-void

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 129
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 130
    :catchall_2
    move-exception p0

    .line 131
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 132
    :try_start_c
    throw p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 133
    :catchall_3
    move-exception p0

    .line 134
    :try_start_d
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 135
    :try_start_e
    throw p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 136
    :catchall_4
    move-exception p0

    .line 137
    :try_start_f
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 138
    :try_start_10
    throw p0

    .line 139
    :goto_1
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 140
    throw p0
.end method

.method public final i()La/clz;
    .locals 1

    .line 1
    iget-object v0, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/okz;->b:La/clz;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 5
    .line 6
    invoke-virtual {p0}, La/t3a;->y()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    monitor-exit v0

    .line 15
    return-object p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public onDestroy(La/clz;)V
    .locals 1
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_DESTROY:La/kkz;
    .end annotation

    .line 1
    iget-object p1, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 5
    .line 6
    invoke-virtual {p0}, La/t3a;->y()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, La/t3a;->A(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    monitor-exit p1

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public onPause(La/clz;)V
    .locals 0
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_PAUSE:La/kkz;
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 3
    .line 4
    iget-object p0, p0, La/t3a;->a:La/ap;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/ap;->g(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume(La/clz;)V
    .locals 0
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_RESUME:La/kkz;
    .end annotation

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 3
    .line 4
    iget-object p0, p0, La/t3a;->a:La/ap;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/ap;->g(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onStart(La/clz;)V
    .locals 1
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_START:La/kkz;
    .end annotation

    .line 1
    iget-object p1, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-boolean v0, p0, La/okz;->d:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 9
    .line 10
    invoke-virtual {p0}, La/t3a;->l()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p1

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public onStop(La/clz;)V
    .locals 1
    .annotation runtime La/kh60;
        value = .enum La/kkz;->ON_STOP:La/kkz;
    .end annotation

    .line 1
    iget-object p1, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-boolean v0, p0, La/okz;->d:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/okz;->c:La/t3a;

    .line 9
    .line 10
    invoke-virtual {p0}, La/t3a;->u()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    monitor-exit p1

    .line 17
    return-void

    .line 18
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, La/okz;->d:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, La/okz;->b:La/clz;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, La/okz;->onStop(La/clz;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, La/okz;->d:Z

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method public final t()V
    .locals 4

    .line 1
    iget-object v0, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/okz;->c:La/t3a;

    .line 5
    .line 6
    invoke-virtual {v1}, La/t3a;->y()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, La/okz;->c:La/t3a;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, La/t3a;->A(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, La/fot0;

    .line 35
    .line 36
    invoke-virtual {v2}, La/fot0;->o()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    iget-object v2, v2, La/fot0;->d:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 45
    :try_start_1
    monitor-exit v2

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :try_start_2
    throw p0

    .line 50
    :cond_1
    const/4 v1, 0x0

    .line 51
    iput-object v1, p0, La/okz;->e:La/rrd;

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception p0

    .line 56
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    throw p0
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, La/okz;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, La/okz;->d:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, La/okz;->d:Z

    .line 14
    .line 15
    iget-object v2, p0, La/okz;->b:La/clz;

    .line 16
    .line 17
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v2, v2, La/glz;->i:La/lkz;

    .line 22
    .line 23
    sget-object v3, La/lkz;->d:La/lkz;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ltz v2, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    :cond_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, La/okz;->b:La/clz;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/okz;->onStart(La/clz;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method
