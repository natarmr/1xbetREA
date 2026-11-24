.class public final synthetic La/fy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fy2;->a:B

    iput-object p1, p0, La/fy2;->b:Ljava/lang/Object;

    iput-object p2, p0, La/fy2;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 8

    .line 1
    iget-object v0, p0, La/fy2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/j4a;

    .line 4
    .line 5
    iget-object p0, p0, La/fy2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/tu9;

    .line 8
    .line 9
    iget-object v1, v0, La/j4a;->g:La/ru;

    .line 10
    .line 11
    iget-object v2, v1, La/ru;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    iget-object v2, v1, La/ru;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, La/wy9;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    iput-boolean v5, v2, La/wy9;->g:Z

    .line 34
    .line 35
    iget-object v6, v2, La/wy9;->b:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v6

    .line 38
    :try_start_0
    iput-object v4, v2, La/wy9;->c:La/j2a;

    .line 39
    .line 40
    sget-object v7, La/lun;->a:La/lun;

    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v7, La/iun;->a:La/iun;

    .line 46
    .line 47
    iput-object v7, v2, La/wy9;->d:La/iun;

    .line 48
    .line 49
    iput-boolean v5, v2, La/wy9;->f:Z

    .line 50
    .line 51
    iget-object v2, v2, La/wy9;->e:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 54
    .line 55
    .line 56
    monitor-exit v6

    .line 57
    iget-object v2, v1, La/ru;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, La/jrs0;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const-string v6, "PipePresenceSrc"

    .line 65
    .line 66
    const-string v7, "Stopping camera ID flow collection."

    .line 67
    .line 68
    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    iget-object v6, v2, La/jrs0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 74
    .line 75
    invoke-virtual {v6, v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v5, v2, La/jrs0;->h:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, La/c4m0;

    .line 85
    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    invoke-virtual {v5, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    iput-object v4, v2, La/jrs0;->h:Ljava/lang/Object;

    .line 92
    .line 93
    :goto_0
    iget-object v2, v1, La/ru;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, La/n0o0;

    .line 96
    .line 97
    invoke-virtual {v2}, La/n0o0;->a()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    iget-object v1, v1, La/ru;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, La/n0o0;

    .line 106
    .line 107
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, La/m1a;

    .line 112
    .line 113
    iget-object v2, v1, La/m1a;->c:Ljava/lang/Object;

    .line 114
    .line 115
    monitor-enter v2

    .line 116
    :try_start_1
    iget-boolean v5, v1, La/m1a;->d:Z

    .line 117
    .line 118
    if-nez v5, :cond_3

    .line 119
    .line 120
    iget-object v5, v1, La/m1a;->a:La/hbi;

    .line 121
    .line 122
    iget-object v5, v5, La/hbi;->e:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v5, La/n5d0;

    .line 125
    .line 126
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, La/r1a;

    .line 131
    .line 132
    invoke-virtual {v5}, La/r1a;->b()V

    .line 133
    .line 134
    .line 135
    iput-boolean v3, v1, La/m1a;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    monitor-exit v2

    .line 138
    goto :goto_2

    .line 139
    :catchall_0
    move-exception p0

    .line 140
    goto :goto_1

    .line 141
    :cond_3
    :try_start_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    const-string v0, "Check failed."

    .line 144
    .line 145
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    :goto_1
    monitor-exit v2

    .line 150
    throw p0

    .line 151
    :cond_4
    :goto_2
    iget-object v1, v0, La/j4a;->f:Landroid/os/HandlerThread;

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    iget-object v1, v0, La/j4a;->d:Ljava/util/concurrent/Executor;

    .line 156
    .line 157
    instance-of v2, v1, La/dz9;

    .line 158
    .line 159
    if-eqz v2, :cond_6

    .line 160
    .line 161
    check-cast v1, La/dz9;

    .line 162
    .line 163
    iget-object v2, v1, La/dz9;->a:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v2

    .line 166
    :try_start_3
    iget-object v3, v1, La/dz9;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-nez v3, :cond_5

    .line 173
    .line 174
    iget-object v1, v1, La/dz9;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :catchall_1
    move-exception p0

    .line 181
    goto :goto_4

    .line 182
    :cond_5
    :goto_3
    monitor-exit v2

    .line 183
    goto :goto_5

    .line 184
    :goto_4
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 185
    throw p0

    .line 186
    :cond_6
    :goto_5
    iget-object v0, v0, La/j4a;->f:Landroid/os/HandlerThread;

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 189
    .line 190
    .line 191
    :cond_7
    invoke-virtual {p0, v4}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :catchall_2
    move-exception p0

    .line 196
    monitor-exit v6

    .line 197
    throw p0
.end method

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, La/fy2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/y680;

    .line 4
    .line 5
    iget-object p0, p0, La/fy2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/p5d0;

    .line 8
    .line 9
    iget-object v1, v0, La/y680;->b:La/p5d0;

    .line 10
    .line 11
    sget-object v2, La/y680;->d:La/ogd;

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, v0, La/y680;->a:La/izj;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput-object v2, v0, La/y680;->a:La/izj;

    .line 20
    .line 21
    iput-object p0, v0, La/y680;->b:La/p5d0;

    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-interface {v1, p0}, La/izj;->a(La/p5d0;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p0

    .line 31
    :cond_0
    const-string p0, "provide() can be called only once."

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fy2;->a:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/sdz;

    .line 15
    .line 16
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/p5d0;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iget-object v2, v1, La/sdz;->b:Ljava/util/Set;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, La/sdz;->a:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v2, v1, La/sdz;->b:Ljava/util/Set;

    .line 34
    .line 35
    invoke-interface {v0}, La/p5d0;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :goto_0
    monitor-exit v1

    .line 43
    return-void

    .line 44
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw v0

    .line 46
    :pswitch_0
    invoke-direct {v0}, La/fy2;->b()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/agd;

    .line 53
    .line 54
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La/jg60;

    .line 57
    .line 58
    iget-object v2, v1, La/zfd;->a:La/glz;

    .line 59
    .line 60
    new-instance v3, La/sfd;

    .line 61
    .line 62
    invoke-direct {v3, v0, v1, v4}, La/sfd;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, La/glz;->a(La/blz;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/cu;

    .line 72
    .line 73
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, [La/t7d;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v2, v1, La/cu;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, La/rs3;

    .line 83
    .line 84
    if-nez v2, :cond_1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_1
    invoke-virtual {v2, v0}, La/rs3;->b([La/t7d;)V

    .line 88
    .line 89
    .line 90
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_2
    if-nez v5, :cond_2

    .line 93
    .line 94
    iget-object v1, v1, La/cu;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :pswitch_3
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, La/bmf0;

    .line 105
    .line 106
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/cmf0;

    .line 109
    .line 110
    invoke-interface {v1, v0}, La/bmf0;->q(La/cmf0;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_4
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, La/z9c;

    .line 117
    .line 118
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/cym0;

    .line 121
    .line 122
    sget-object v2, La/y9c;->a:La/y9c;

    .line 123
    .line 124
    iput-object v2, v1, La/z9c;->f:La/y9c;

    .line 125
    .line 126
    iget-object v1, v1, La/z9c;->h:La/sps0;

    .line 127
    .line 128
    invoke-interface {v1}, La/sps0;->f()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, La/cym0;->invoke()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_5
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 138
    .line 139
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, La/zj;

    .line 142
    .line 143
    iget-object v2, v1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 144
    .line 145
    iget-object v3, v1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->p:La/qna;

    .line 146
    .line 147
    iget v2, v2, La/xna;->f:I

    .line 148
    .line 149
    invoke-virtual {v1}, Landroidx/recyclerview/widget/b;->S()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-ne v2, v4, :cond_3

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    :cond_3
    iget-object v1, v1, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->s:La/ron0;

    .line 159
    .line 160
    iget-object v1, v1, La/ron0;->c:La/bpn0;

    .line 161
    .line 162
    invoke-interface {v3, v0, v1}, La/qna;->a(La/zj;La/bpn0;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_6
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v1, La/a8a;

    .line 169
    .line 170
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/lu5;

    .line 173
    .line 174
    iget-object v6, v0, La/lu5;->a:La/i0g0;

    .line 175
    .line 176
    iget-object v1, v1, La/a8a;->a:La/b8a;

    .line 177
    .line 178
    iget-object v7, v1, La/b8a;->a:Lcom/journeyapps/barcodescanner/CaptureActivity;

    .line 179
    .line 180
    iget-boolean v8, v1, La/b8a;->d:Z

    .line 181
    .line 182
    if-eqz v8, :cond_5

    .line 183
    .line 184
    iget-object v0, v0, La/lu5;->b:La/fmk0;

    .line 185
    .line 186
    iget-object v8, v0, La/fmk0;->a:La/t68;

    .line 187
    .line 188
    iget v9, v0, La/fmk0;->c:I

    .line 189
    .line 190
    new-instance v10, Landroid/graphics/Rect;

    .line 191
    .line 192
    iget v11, v8, La/t68;->b:I

    .line 193
    .line 194
    iget v12, v8, La/t68;->c:I

    .line 195
    .line 196
    invoke-direct {v10, v4, v4, v11, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 197
    .line 198
    .line 199
    new-instance v13, Landroid/graphics/YuvImage;

    .line 200
    .line 201
    iget-object v14, v8, La/t68;->a:[B

    .line 202
    .line 203
    iget v15, v0, La/fmk0;->b:I

    .line 204
    .line 205
    iget v0, v8, La/t68;->b:I

    .line 206
    .line 207
    iget v8, v8, La/t68;->c:I

    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    move/from16 v16, v0

    .line 212
    .line 213
    move/from16 v17, v8

    .line 214
    .line 215
    invoke-direct/range {v13 .. v18}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 216
    .line 217
    .line 218
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 219
    .line 220
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 221
    .line 222
    .line 223
    const/16 v8, 0x5a

    .line 224
    .line 225
    invoke-virtual {v13, v10, v8, v0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    new-instance v8, Landroid/graphics/BitmapFactory$Options;

    .line 233
    .line 234
    invoke-direct {v8}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 235
    .line 236
    .line 237
    const/4 v10, 0x2

    .line 238
    iput v10, v8, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 239
    .line 240
    array-length v10, v0

    .line 241
    invoke-static {v0, v4, v10, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    if-eqz v9, :cond_4

    .line 246
    .line 247
    new-instance v0, Landroid/graphics/Matrix;

    .line 248
    .line 249
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 250
    .line 251
    .line 252
    int-to-float v8, v9

    .line 253
    invoke-virtual {v0, v8}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getWidth()I

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getHeight()I

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/4 v12, 0x0

    .line 267
    const/4 v13, 0x0

    .line 268
    move-object/from16 v16, v0

    .line 269
    .line 270
    invoke-static/range {v11 .. v17}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    :cond_4
    :try_start_2
    const-string v0, "barcodeimage"

    .line 275
    .line 276
    const-string v8, ".jpg"

    .line 277
    .line 278
    invoke-virtual {v7}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    invoke-static {v0, v8, v9}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-instance v8, Ljava/io/FileOutputStream;

    .line 287
    .line 288
    invoke-direct {v8, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 289
    .line 290
    .line 291
    sget-object v9, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 292
    .line 293
    const/16 v10, 0x64

    .line 294
    .line 295
    invoke-virtual {v11, v9, v10, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 296
    .line 297
    .line 298
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 305
    goto :goto_3

    .line 306
    :catch_0
    move-exception v0

    .line 307
    const-string v8, "b8a"

    .line 308
    .line 309
    new-instance v9, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v10, "Unable to create temporary file and store bitmap! "

    .line 312
    .line 313
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v8, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    :cond_5
    :goto_3
    new-instance v0, Landroid/content/Intent;

    .line 327
    .line 328
    const-string v8, "com.google.zxing.client.android.SCAN"

    .line 329
    .line 330
    invoke-direct {v0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    const/high16 v8, 0x80000

    .line 334
    .line 335
    invoke-virtual {v0, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 336
    .line 337
    .line 338
    const-string v8, "SCAN_RESULT"

    .line 339
    .line 340
    iget-object v9, v6, La/i0g0;->a:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v0, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 343
    .line 344
    .line 345
    const-string v8, "SCAN_RESULT_FORMAT"

    .line 346
    .line 347
    iget-object v9, v6, La/i0g0;->d:La/ju5;

    .line 348
    .line 349
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-virtual {v0, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 354
    .line 355
    .line 356
    iget-object v8, v6, La/i0g0;->b:[B

    .line 357
    .line 358
    if-eqz v8, :cond_6

    .line 359
    .line 360
    array-length v9, v8

    .line 361
    if-lez v9, :cond_6

    .line 362
    .line 363
    const-string v9, "SCAN_RESULT_BYTES"

    .line 364
    .line 365
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 366
    .line 367
    .line 368
    :cond_6
    iget-object v6, v6, La/i0g0;->e:Ljava/util/Map;

    .line 369
    .line 370
    if-eqz v6, :cond_a

    .line 371
    .line 372
    sget-object v8, La/a3g0;->i:La/a3g0;

    .line 373
    .line 374
    invoke-interface {v6, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    if-eqz v9, :cond_7

    .line 379
    .line 380
    const-string v9, "SCAN_RESULT_UPC_EAN_EXTENSION"

    .line 381
    .line 382
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 391
    .line 392
    .line 393
    :cond_7
    sget-object v8, La/a3g0;->a:La/a3g0;

    .line 394
    .line 395
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    check-cast v8, Ljava/lang/Number;

    .line 400
    .line 401
    if-eqz v8, :cond_8

    .line 402
    .line 403
    const-string v9, "SCAN_RESULT_ORIENTATION"

    .line 404
    .line 405
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 410
    .line 411
    .line 412
    :cond_8
    sget-object v8, La/a3g0;->c:La/a3g0;

    .line 413
    .line 414
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    check-cast v8, Ljava/lang/String;

    .line 419
    .line 420
    if-eqz v8, :cond_9

    .line 421
    .line 422
    const-string v9, "SCAN_RESULT_ERROR_CORRECTION_LEVEL"

    .line 423
    .line 424
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 425
    .line 426
    .line 427
    :cond_9
    sget-object v8, La/a3g0;->b:La/a3g0;

    .line 428
    .line 429
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    check-cast v6, Ljava/lang/Iterable;

    .line 434
    .line 435
    if-eqz v6, :cond_a

    .line 436
    .line 437
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    if-eqz v8, :cond_a

    .line 446
    .line 447
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    check-cast v8, [B

    .line 452
    .line 453
    new-instance v9, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    const-string v10, "SCAN_RESULT_BYTE_SEGMENTS_"

    .line 456
    .line 457
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 468
    .line 469
    .line 470
    add-int/2addr v4, v3

    .line 471
    goto :goto_4

    .line 472
    :cond_a
    if-eqz v5, :cond_b

    .line 473
    .line 474
    const-string v3, "SCAN_RESULT_IMAGE_PATH"

    .line 475
    .line 476
    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 477
    .line 478
    .line 479
    :cond_b
    invoke-virtual {v7, v2, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1}, La/b8a;->a()V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    :pswitch_7
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v1, La/cpv0;

    .line 489
    .line 490
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, Ljava/util/UUID;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    invoke-static {v1, v0}, La/dj8;->T(La/cpv0;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    return-void

    .line 505
    :pswitch_8
    invoke-direct {v0}, La/fy2;->a()V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_9
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v1, La/sbe;

    .line 512
    .line 513
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v0, La/o15;

    .line 516
    .line 517
    invoke-interface {v1, v0}, La/sbe;->accept(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :pswitch_a
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v1, La/j2a;

    .line 524
    .line 525
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v0, La/s0a;

    .line 528
    .line 529
    iget-object v2, v1, La/j2a;->a:Ljava/lang/Object;

    .line 530
    .line 531
    monitor-enter v2

    .line 532
    :try_start_3
    iget-object v3, v1, La/j2a;->c:Ljava/util/HashSet;

    .line 533
    .line 534
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    iget-object v0, v1, La/j2a;->c:Ljava/util/HashSet;

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-eqz v0, :cond_c

    .line 544
    .line 545
    iget-object v0, v1, La/j2a;->e:La/tu9;

    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    iget-object v0, v1, La/j2a;->e:La/tu9;

    .line 551
    .line 552
    invoke-virtual {v0, v5}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    iput-object v5, v1, La/j2a;->e:La/tu9;

    .line 556
    .line 557
    iput-object v5, v1, La/j2a;->d:La/ig00;

    .line 558
    .line 559
    goto :goto_5

    .line 560
    :catchall_1
    move-exception v0

    .line 561
    goto :goto_6

    .line 562
    :cond_c
    :goto_5
    monitor-exit v2

    .line 563
    return-void

    .line 564
    :goto_6
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 565
    throw v0

    .line 566
    :pswitch_b
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v1, La/n0a;

    .line 569
    .line 570
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v0, La/w1a;

    .line 573
    .line 574
    invoke-interface {v1}, La/j0a;->b()La/wh00;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-virtual {v1, v0}, La/wh00;->f(La/ee60;)V

    .line 579
    .line 580
    .line 581
    return-void

    .line 582
    :pswitch_c
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v1, La/s0a;

    .line 585
    .line 586
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v0, La/ee60;

    .line 589
    .line 590
    invoke-interface {v1}, La/s0a;->h()La/n0a;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    invoke-interface {v1}, La/j0a;->b()La/wh00;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    invoke-virtual {v1, v0}, La/wh00;->j(La/ee60;)V

    .line 599
    .line 600
    .line 601
    return-void

    .line 602
    :pswitch_d
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast v1, La/x1a;

    .line 605
    .line 606
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v0, Ljava/util/Set;

    .line 609
    .line 610
    iget-object v1, v1, La/x1a;->a:La/rrd;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-static {}, La/ofm0;->m()V

    .line 616
    .line 617
    .line 618
    iget-object v2, v1, La/rrd;->b:Ljava/lang/Object;

    .line 619
    .line 620
    monitor-enter v2

    .line 621
    :try_start_4
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-eqz v3, :cond_10

    .line 630
    .line 631
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    check-cast v3, La/h0a;

    .line 636
    .line 637
    iget-object v4, v1, La/rrd;->h:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v4, Ljava/util/HashMap;

    .line 640
    .line 641
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    check-cast v4, Ljava/lang/Iterable;

    .line 646
    .line 647
    new-instance v5, Ljava/util/ArrayList;

    .line 648
    .line 649
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 650
    .line 651
    .line 652
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    :cond_e
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 657
    .line 658
    .line 659
    move-result v6

    .line 660
    if-eqz v6, :cond_f

    .line 661
    .line 662
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    move-object v7, v6

    .line 667
    check-cast v7, La/h0a;

    .line 668
    .line 669
    iget-object v7, v7, La/h0a;->a:Ljava/util/ArrayList;

    .line 670
    .line 671
    iget-object v8, v3, La/h0a;->a:Ljava/util/ArrayList;

    .line 672
    .line 673
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    if-eqz v7, :cond_e

    .line 678
    .line 679
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    goto :goto_7

    .line 683
    :catchall_2
    move-exception v0

    .line 684
    goto :goto_9

    .line 685
    :cond_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    if-eqz v4, :cond_d

    .line 694
    .line 695
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    check-cast v4, La/h0a;

    .line 700
    .line 701
    iget-object v5, v1, La/rrd;->h:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v5, Ljava/util/HashMap;

    .line 704
    .line 705
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 706
    .line 707
    .line 708
    goto :goto_8

    .line 709
    :cond_10
    monitor-exit v2

    .line 710
    return-void

    .line 711
    :goto_9
    monitor-exit v2

    .line 712
    throw v0

    .line 713
    :pswitch_e
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v1, La/o3a;

    .line 716
    .line 717
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 720
    .line 721
    iget-object v1, v1, La/o3a;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 722
    .line 723
    invoke-virtual {v1, v0, v2}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureSequenceAborted(Landroid/hardware/camera2/CameraCaptureSession;I)V

    .line 724
    .line 725
    .line 726
    return-void

    .line 727
    :pswitch_f
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v1, La/b99;

    .line 730
    .line 731
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v0, Ljava/lang/String;

    .line 734
    .line 735
    iget-object v1, v1, La/b99;->l:Landroid/widget/TextView;

    .line 736
    .line 737
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    if-eqz v2, :cond_12

    .line 742
    .line 743
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    invoke-static {v2, v0}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-nez v0, :cond_11

    .line 756
    .line 757
    const/high16 v0, 0x41200000    # 10.0f

    .line 758
    .line 759
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 760
    .line 761
    .line 762
    goto :goto_a

    .line 763
    :cond_11
    const/high16 v0, 0x41400000    # 12.0f

    .line 764
    .line 765
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 766
    .line 767
    .line 768
    :cond_12
    :goto_a
    return-void

    .line 769
    :pswitch_10
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v1, La/l58;

    .line 772
    .line 773
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v0, La/p58;

    .line 776
    .line 777
    iget-object v1, v1, La/l58;->H1:La/t58;

    .line 778
    .line 779
    iget-object v2, v1, La/t58;->c:La/nnw0;

    .line 780
    .line 781
    if-nez v2, :cond_13

    .line 782
    .line 783
    new-instance v2, La/s58;

    .line 784
    .line 785
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 786
    .line 787
    .line 788
    iput-object v2, v1, La/t58;->c:La/nnw0;

    .line 789
    .line 790
    :cond_13
    invoke-virtual {v2, v0}, La/nnw0;->G(La/p58;)V

    .line 791
    .line 792
    .line 793
    return-void

    .line 794
    :pswitch_11
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, La/fp;

    .line 797
    .line 798
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v0, La/plo;

    .line 801
    .line 802
    iget-object v2, v1, La/fp;->g:Ljava/lang/Object;

    .line 803
    .line 804
    invoke-virtual {v0, v2}, La/plo;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    iput-object v0, v1, La/fp;->g:Ljava/lang/Object;

    .line 809
    .line 810
    new-instance v2, La/nd5;

    .line 811
    .line 812
    invoke-direct {v2, v1, v0, v3}, La/nd5;-><init>(La/fp;Ljava/lang/Object;B)V

    .line 813
    .line 814
    .line 815
    iget-object v0, v1, La/fp;->d:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v0, La/q9o0;

    .line 818
    .line 819
    iget-object v1, v0, La/q9o0;->a:Landroid/os/Handler;

    .line 820
    .line 821
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    if-nez v1, :cond_14

    .line 834
    .line 835
    goto :goto_b

    .line 836
    :cond_14
    invoke-virtual {v0, v2}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 837
    .line 838
    .line 839
    :goto_b
    return-void

    .line 840
    :pswitch_12
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 841
    .line 842
    check-cast v1, La/nhf0;

    .line 843
    .line 844
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v0, Landroid/media/AudioDeviceInfo;

    .line 847
    .line 848
    iget-object v2, v1, La/nhf0;->d:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v2, La/h44;

    .line 851
    .line 852
    if-nez v2, :cond_15

    .line 853
    .line 854
    goto :goto_c

    .line 855
    :cond_15
    iget-object v1, v1, La/nhf0;->b:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v1, La/do20;

    .line 858
    .line 859
    iget-object v1, v1, La/do20;->a:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v1, La/n44;

    .line 862
    .line 863
    iget-object v1, v1, La/n44;->h:La/krs0;

    .line 864
    .line 865
    if-eqz v1, :cond_17

    .line 866
    .line 867
    iget-object v2, v1, La/krs0;->j:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 870
    .line 871
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    if-eqz v2, :cond_16

    .line 876
    .line 877
    goto :goto_c

    .line 878
    :cond_16
    iput-object v0, v1, La/krs0;->j:Ljava/lang/Object;

    .line 879
    .line 880
    iget-object v2, v1, La/krs0;->b:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v2, Landroid/content/Context;

    .line 883
    .line 884
    iget-object v3, v1, La/krs0;->k:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v3, La/m24;

    .line 887
    .line 888
    invoke-virtual {v1}, La/krs0;->b()Ljava/util/List;

    .line 889
    .line 890
    .line 891
    move-result-object v4

    .line 892
    sget-object v6, La/q24;->e:La/rcf0;

    .line 893
    .line 894
    new-instance v6, Landroid/content/IntentFilter;

    .line 895
    .line 896
    const-string v7, "android.media.action.HDMI_AUDIO_PLUG"

    .line 897
    .line 898
    invoke-direct {v6, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2, v5, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    invoke-static {v2, v5, v3, v0, v4}, La/q24;->b(Landroid/content/Context;Landroid/content/Intent;La/m24;Landroid/media/AudioDeviceInfo;Ljava/util/List;)La/q24;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    invoke-virtual {v1, v0}, La/krs0;->d(La/q24;)V

    .line 910
    .line 911
    .line 912
    :cond_17
    :goto_c
    return-void

    .line 913
    :pswitch_13
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast v1, La/nhf0;

    .line 916
    .line 917
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, Landroid/media/AudioRouting;

    .line 920
    .line 921
    invoke-interface {v0}, Landroid/media/AudioRouting;->getRoutedDevice()Landroid/media/AudioDeviceInfo;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    if-eqz v0, :cond_18

    .line 926
    .line 927
    iget-object v2, v1, La/nhf0;->c:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v2, Landroid/os/Handler;

    .line 930
    .line 931
    new-instance v3, La/fy2;

    .line 932
    .line 933
    const/16 v4, 0xa

    .line 934
    .line 935
    invoke-direct {v3, v1, v0, v4}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 939
    .line 940
    .line 941
    :cond_18
    return-void

    .line 942
    :pswitch_14
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v1, La/xex;

    .line 945
    .line 946
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v0, La/tkj;

    .line 949
    .line 950
    monitor-enter v0

    .line 951
    monitor-exit v0

    .line 952
    iget-object v0, v1, La/xex;->b:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, La/qlo;

    .line 955
    .line 956
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 957
    .line 958
    iget-object v0, v0, La/qlo;->a:La/ulo;

    .line 959
    .line 960
    iget-object v0, v0, La/ulo;->s:La/fsj;

    .line 961
    .line 962
    iget-object v1, v0, La/fsj;->d:La/uii;

    .line 963
    .line 964
    iget-object v1, v1, La/uii;->e:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v1, La/vn30;

    .line 967
    .line 968
    invoke-virtual {v0, v1}, La/fsj;->J(La/vn30;)La/ft2;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    new-instance v2, La/csj;

    .line 973
    .line 974
    const/4 v3, 0x3

    .line 975
    invoke-direct {v2, v3}, La/csj;-><init>(B)V

    .line 976
    .line 977
    .line 978
    const/16 v3, 0x3f5

    .line 979
    .line 980
    invoke-virtual {v0, v1, v3, v2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 981
    .line 982
    .line 983
    return-void

    .line 984
    :pswitch_15
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 985
    .line 986
    check-cast v1, La/xex;

    .line 987
    .line 988
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, La/hyc;

    .line 991
    .line 992
    iget-object v1, v1, La/xex;->b:Ljava/lang/Object;

    .line 993
    .line 994
    check-cast v1, La/qlo;

    .line 995
    .line 996
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 997
    .line 998
    iget-object v1, v1, La/qlo;->a:La/ulo;

    .line 999
    .line 1000
    iget-object v1, v1, La/ulo;->F:La/fhj;

    .line 1001
    .line 1002
    invoke-virtual {v1, v0}, La/fhj;->A(La/hyc;)V

    .line 1003
    .line 1004
    .line 1005
    return-void

    .line 1006
    :pswitch_16
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v1, Landroid/content/Context;

    .line 1009
    .line 1010
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v0, La/brd;

    .line 1013
    .line 1014
    const-string v2, "audio"

    .line 1015
    .line 1016
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    check-cast v1, Landroid/media/AudioManager;

    .line 1021
    .line 1022
    sput-object v1, La/b34;->a:Landroid/media/AudioManager;

    .line 1023
    .line 1024
    invoke-virtual {v0}, La/brd;->c()Z

    .line 1025
    .line 1026
    .line 1027
    return-void

    .line 1028
    :pswitch_17
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v1, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 1031
    .line 1032
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v0, La/fbs0;

    .line 1035
    .line 1036
    sget-object v2, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:Lcom/google/firebase/perf/util/Timer;

    .line 1037
    .line 1038
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->b:La/dps0;

    .line 1039
    .line 1040
    invoke-virtual {v0}, La/zit;->h()La/kjt;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    check-cast v0, La/ibs0;

    .line 1045
    .line 1046
    sget-object v2, La/ts3;->e:La/ts3;

    .line 1047
    .line 1048
    invoke-virtual {v1, v0, v2}, La/dps0;->c(La/ibs0;La/ts3;)V

    .line 1049
    .line 1050
    .line 1051
    return-void

    .line 1052
    :pswitch_18
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1053
    .line 1054
    check-cast v1, La/gd3;

    .line 1055
    .line 1056
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v0, Ljava/lang/Runnable;

    .line 1059
    .line 1060
    :try_start_5
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v1}, La/gd3;->a()V

    .line 1064
    .line 1065
    .line 1066
    return-void

    .line 1067
    :catchall_3
    move-exception v0

    .line 1068
    invoke-virtual {v1}, La/gd3;->a()V

    .line 1069
    .line 1070
    .line 1071
    throw v0

    .line 1072
    :pswitch_19
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 1075
    .line 1076
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1079
    .line 1080
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v1

    .line 1084
    if-eqz v1, :cond_19

    .line 1085
    .line 1086
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    :cond_19
    return-void

    .line 1090
    :pswitch_1a
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v1, Landroid/content/Context;

    .line 1093
    .line 1094
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1095
    .line 1096
    check-cast v0, Landroid/view/View;

    .line 1097
    .line 1098
    const-string v2, "input_method"

    .line 1099
    .line 1100
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 1108
    .line 1109
    invoke-virtual {v1, v0, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 1110
    .line 1111
    .line 1112
    return-void

    .line 1113
    :pswitch_1b
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast v1, La/cgx0;

    .line 1116
    .line 1117
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1118
    .line 1119
    check-cast v0, La/d1x;

    .line 1120
    .line 1121
    invoke-interface {v0, v1}, La/d1x;->e(La/e1x;)V

    .line 1122
    .line 1123
    .line 1124
    return-void

    .line 1125
    :pswitch_1c
    iget-object v1, v0, La/fy2;->b:Ljava/lang/Object;

    .line 1126
    .line 1127
    check-cast v1, La/iy2;

    .line 1128
    .line 1129
    iget-object v0, v0, La/fy2;->c:Ljava/lang/Object;

    .line 1130
    .line 1131
    check-cast v0, Landroid/util/LongSparseArray;

    .line 1132
    .line 1133
    invoke-static {v1, v0}, La/gy2;->b(La/iy2;Landroid/util/LongSparseArray;)V

    .line 1134
    .line 1135
    .line 1136
    return-void

    .line 1137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
