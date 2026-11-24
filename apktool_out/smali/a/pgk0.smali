.class public final La/pgk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public c:Z

.field public final d:La/edk0;

.field public final e:La/rai0;

.field public final f:La/xz40;

.field public final g:Ljava/lang/Object;

.field public h:La/jk8;

.field public i:La/ogk0;

.field public j:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pgk0;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/pgk0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    new-instance p1, La/edk0;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p0, v0}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/pgk0;->d:La/edk0;

    .line 21
    .line 22
    new-instance p1, La/rai0;

    .line 23
    .line 24
    const/16 v0, 0x16

    .line 25
    .line 26
    invoke-direct {p1, p0, v0}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/pgk0;->e:La/rai0;

    .line 30
    .line 31
    new-instance p1, La/xz40;

    .line 32
    .line 33
    const/16 v0, 0x10

    .line 34
    .line 35
    new-array v0, v0, [La/ogk0;

    .line 36
    .line 37
    invoke-direct {p1, v0}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/pgk0;->f:La/xz40;

    .line 41
    .line 42
    new-instance p1, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, La/pgk0;->g:Ljava/lang/Object;

    .line 48
    .line 49
    const-wide/16 v0, -0x1

    .line 50
    .line 51
    iput-wide v0, p0, La/pgk0;->j:J

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, La/pgk0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/pgk0;->f:La/xz40;

    .line 5
    .line 6
    iget-object v1, p0, La/xz40;->a:[Ljava/lang/Object;

    .line 7
    .line 8
    iget p0, p0, La/xz40;->c:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, p0, :cond_0

    .line 12
    .line 13
    aget-object v3, v1, v2

    .line 14
    .line 15
    check-cast v3, La/ogk0;

    .line 16
    .line 17
    iget-object v4, v3, La/ogk0;->e:La/hz40;

    .line 18
    .line 19
    invoke-virtual {v4}, La/hz40;->a()V

    .line 20
    .line 21
    .line 22
    iget-object v4, v3, La/ogk0;->f:La/hz40;

    .line 23
    .line 24
    invoke-virtual {v4}, La/hz40;->a()V

    .line 25
    .line 26
    .line 27
    iget-object v4, v3, La/ogk0;->l:La/hz40;

    .line 28
    .line 29
    invoke-virtual {v4}, La/hz40;->a()V

    .line 30
    .line 31
    .line 32
    iget-object v3, v3, La/ogk0;->m:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0

    .line 45
    throw p0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/pgk0;->g:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    iget-object v0, v0, La/pgk0;->f:La/xz40;

    .line 9
    .line 10
    iget v3, v0, La/xz40;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    iget-object v7, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 15
    .line 16
    if-ge v5, v3, :cond_8

    .line 17
    .line 18
    :try_start_1
    aget-object v7, v7, v5

    .line 19
    .line 20
    check-cast v7, La/ogk0;

    .line 21
    .line 22
    iget-object v8, v7, La/ogk0;->f:La/hz40;

    .line 23
    .line 24
    invoke-virtual {v8, v1}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    check-cast v8, La/ry40;

    .line 29
    .line 30
    if-nez v8, :cond_1

    .line 31
    .line 32
    :cond_0
    move v15, v5

    .line 33
    goto :goto_4

    .line 34
    :cond_1
    iget-object v9, v8, La/ry40;->b:[Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v10, v8, La/ry40;->c:[I

    .line 37
    .line 38
    iget-object v8, v8, La/ry40;->a:[J

    .line 39
    .line 40
    array-length v11, v8

    .line 41
    add-int/lit8 v11, v11, -0x2

    .line 42
    .line 43
    if-ltz v11, :cond_0

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    :goto_1
    aget-wide v13, v8, v12

    .line 47
    .line 48
    move v15, v5

    .line 49
    not-long v4, v13

    .line 50
    const/16 v16, 0x7

    .line 51
    .line 52
    shl-long v4, v4, v16

    .line 53
    .line 54
    and-long/2addr v4, v13

    .line 55
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long v4, v4, v16

    .line 61
    .line 62
    cmp-long v4, v4, v16

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    sub-int v4, v12, v11

    .line 67
    .line 68
    not-int v4, v4

    .line 69
    ushr-int/lit8 v4, v4, 0x1f

    .line 70
    .line 71
    const/16 v5, 0x8

    .line 72
    .line 73
    rsub-int/lit8 v4, v4, 0x8

    .line 74
    .line 75
    move/from16 v16, v5

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    :goto_2
    if-ge v5, v4, :cond_3

    .line 79
    .line 80
    const-wide/16 v17, 0xff

    .line 81
    .line 82
    and-long v17, v13, v17

    .line 83
    .line 84
    const-wide/16 v19, 0x80

    .line 85
    .line 86
    cmp-long v17, v17, v19

    .line 87
    .line 88
    if-gez v17, :cond_2

    .line 89
    .line 90
    shl-int/lit8 v17, v12, 0x3

    .line 91
    .line 92
    add-int v17, v17, v5

    .line 93
    .line 94
    move/from16 v18, v5

    .line 95
    .line 96
    aget-object v5, v9, v17

    .line 97
    .line 98
    aget v17, v10, v17

    .line 99
    .line 100
    invoke-virtual {v7, v1, v5}, La/ogk0;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_2
    move/from16 v18, v5

    .line 105
    .line 106
    :goto_3
    shr-long v13, v13, v16

    .line 107
    .line 108
    add-int/lit8 v5, v18, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move/from16 v5, v16

    .line 112
    .line 113
    if-ne v4, v5, :cond_5

    .line 114
    .line 115
    :cond_4
    if-eq v12, v11, :cond_5

    .line 116
    .line 117
    add-int/lit8 v12, v12, 0x1

    .line 118
    .line 119
    move v5, v15

    .line 120
    goto :goto_1

    .line 121
    :cond_5
    :goto_4
    iget-object v4, v7, La/ogk0;->f:La/hz40;

    .line 122
    .line 123
    invoke-virtual {v4}, La/hz40;->j()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_6

    .line 128
    .line 129
    add-int/lit8 v6, v6, 0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-lez v6, :cond_7

    .line 133
    .line 134
    iget-object v4, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 135
    .line 136
    sub-int v5, v15, v6

    .line 137
    .line 138
    aget-object v7, v4, v15

    .line 139
    .line 140
    aput-object v7, v4, v5

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    goto :goto_6

    .line 145
    :cond_7
    :goto_5
    add-int/lit8 v5, v15, 0x1

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_8
    sub-int v1, v3, v6

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    invoke-static {v7, v1, v3, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput v1, v0, La/xz40;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    .line 157
    monitor-exit v2

    .line 158
    return-void

    .line 159
    :goto_6
    monitor-exit v2

    .line 160
    throw v0
.end method

.method public final c()Z
    .locals 10

    .line 1
    iget-object v0, p0, La/pgk0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, La/pgk0;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    iget-object v2, p0, La/pgk0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_4

    .line 23
    :cond_1
    instance-of v6, v3, Ljava/util/Set;

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    move-object v6, v3

    .line 28
    check-cast v6, Ljava/util/Set;

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    instance-of v6, v3, Ljava/util/List;

    .line 32
    .line 33
    if-eqz v6, :cond_b

    .line 34
    .line 35
    move-object v6, v3

    .line 36
    check-cast v6, Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x2

    .line 49
    if-ne v8, v9, :cond_3

    .line 50
    .line 51
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-le v8, v9, :cond_4

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-interface {v6, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :cond_4
    :goto_2
    move-object v6, v7

    .line 71
    :cond_5
    :goto_3
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_a

    .line 76
    .line 77
    move-object v4, v6

    .line 78
    :goto_4
    if-nez v4, :cond_6

    .line 79
    .line 80
    return v1

    .line 81
    :cond_6
    iget-object v2, p0, La/pgk0;->g:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter v2

    .line 84
    :try_start_1
    iget-object v3, p0, La/pgk0;->f:La/xz40;

    .line 85
    .line 86
    iget-object v6, v3, La/xz40;->a:[Ljava/lang/Object;

    .line 87
    .line 88
    iget v3, v3, La/xz40;->c:I

    .line 89
    .line 90
    move v7, v0

    .line 91
    :goto_5
    if-ge v7, v3, :cond_9

    .line 92
    .line 93
    aget-object v8, v6, v7

    .line 94
    .line 95
    check-cast v8, La/ogk0;

    .line 96
    .line 97
    invoke-virtual {v8, v4}, La/ogk0;->a(Ljava/util/Set;)Z

    .line 98
    .line 99
    .line 100
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    if-nez v8, :cond_8

    .line 102
    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_7
    move v1, v0

    .line 107
    goto :goto_7

    .line 108
    :cond_8
    :goto_6
    move v1, v5

    .line 109
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_8

    .line 114
    :cond_9
    monitor-exit v2

    .line 115
    goto :goto_0

    .line 116
    :goto_8
    monitor-exit v2

    .line 117
    throw p0

    .line 118
    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-eq v7, v3, :cond_5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_b
    const-string p0, "Unexpected notification"

    .line 126
    .line 127
    invoke-static {p0}, La/ykd;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 128
    .line 129
    .line 130
    invoke-static {}, La/csj;->b()V

    .line 131
    .line 132
    .line 133
    return v0

    .line 134
    :catchall_1
    move-exception p0

    .line 135
    monitor-exit v0

    .line 136
    throw p0
.end method

.method public final d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {}, La/hfm0;->v()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-object v5, v1, La/pgk0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v5

    .line 14
    :try_start_0
    iget-object v6, v1, La/pgk0;->f:La/xz40;

    .line 15
    .line 16
    iget-object v7, v6, La/xz40;->a:[Ljava/lang/Object;

    .line 17
    .line 18
    iget v8, v6, La/xz40;->c:I

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    :goto_0
    if-ge v10, v8, :cond_1

    .line 22
    .line 23
    aget-object v12, v7, v10

    .line 24
    .line 25
    move-object v13, v12

    .line 26
    check-cast v13, La/ogk0;

    .line 27
    .line 28
    iget-object v13, v13, La/ogk0;->a:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    if-ne v13, v2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v12, 0x0

    .line 37
    :goto_1
    check-cast v12, La/ogk0;

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    if-nez v12, :cond_2

    .line 41
    .line 42
    new-instance v12, La/ogk0;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v7, v2}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-direct {v12, v2}, La/ogk0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v12}, La/xz40;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object v2, v1, La/pgk0;->i:La/ogk0;

    .line 57
    .line 58
    iget-wide v13, v1, La/pgk0;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_d

    .line 59
    .line 60
    monitor-exit v5

    .line 61
    const-wide/16 v5, -0x1

    .line 62
    .line 63
    cmp-long v5, v13, v5

    .line 64
    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    cmp-long v5, v13, v3

    .line 68
    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const-string v6, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    .line 81
    .line 82
    const-string v8, "), currentThread={id="

    .line 83
    .line 84
    invoke-static {v13, v14, v6, v8}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    const-string v8, ", name="

    .line 89
    .line 90
    invoke-static {v6, v3, v4, v8, v5}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v5, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    .line 94
    .line 95
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v5}, La/dsb0;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    :goto_2
    :try_start_1
    iget-object v5, v1, La/pgk0;->g:Ljava/lang/Object;

    .line 106
    .line 107
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    :try_start_2
    iput-object v12, v1, La/pgk0;->i:La/ogk0;

    .line 109
    .line 110
    iput-wide v3, v1, La/pgk0;->j:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    .line 111
    .line 112
    :try_start_3
    monitor-exit v5

    .line 113
    iget-object v3, v1, La/pgk0;->e:La/rai0;

    .line 114
    .line 115
    iget-object v4, v12, La/ogk0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    iget-object v5, v12, La/ogk0;->c:La/ry40;

    .line 118
    .line 119
    iget v6, v12, La/ogk0;->d:I

    .line 120
    .line 121
    iput-object v0, v12, La/ogk0;->b:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v8, v12, La/ogk0;->f:La/hz40;

    .line 124
    .line 125
    invoke-virtual {v8, v0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, La/ry40;

    .line 130
    .line 131
    iput-object v0, v12, La/ogk0;->c:La/ry40;

    .line 132
    .line 133
    iget v0, v12, La/ogk0;->d:I

    .line 134
    .line 135
    const/4 v8, -0x1

    .line 136
    if-ne v0, v8, :cond_5

    .line 137
    .line 138
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, La/rfk0;->g()J

    .line 143
    .line 144
    .line 145
    move-result-wide v15

    .line 146
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->hashCode(J)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iput v0, v12, La/ogk0;->d:I

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    move-wide v6, v13

    .line 155
    goto/16 :goto_11

    .line 156
    .line 157
    :cond_5
    :goto_3
    iget-object v0, v12, La/ogk0;->i:La/eet;

    .line 158
    .line 159
    invoke-static {}, La/jgk0;->a()La/xz40;

    .line 160
    .line 161
    .line 162
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    :try_start_4
    invoke-virtual {v8, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    if-nez v3, :cond_6

    .line 167
    .line 168
    invoke-interface/range {p3 .. p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-object/from16 p2, v12

    .line 172
    .line 173
    goto/16 :goto_7

    .line 174
    .line 175
    :catchall_1
    move-exception v0

    .line 176
    move/from16 v18, v7

    .line 177
    .line 178
    move-wide v6, v13

    .line 179
    goto/16 :goto_10

    .line 180
    .line 181
    :cond_6
    sget-object v0, La/xfk0;->b:La/nvu;

    .line 182
    .line 183
    invoke-virtual {v0}, La/nvu;->w()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object v10, v0

    .line 188
    check-cast v10, La/rfk0;

    .line 189
    .line 190
    instance-of v0, v10, La/ios0;

    .line 191
    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    move-object v0, v10

    .line 195
    check-cast v0, La/ios0;

    .line 196
    .line 197
    move-object/from16 p2, v12

    .line 198
    .line 199
    iget-wide v11, v0, La/ios0;->t:J

    .line 200
    .line 201
    invoke-static {}, La/hfm0;->v()J

    .line 202
    .line 203
    .line 204
    move-result-wide v16

    .line 205
    cmp-long v0, v11, v16

    .line 206
    .line 207
    if-nez v0, :cond_8

    .line 208
    .line 209
    move-object v0, v10

    .line 210
    check-cast v0, La/ios0;

    .line 211
    .line 212
    iget-object v11, v0, La/ios0;->r:Lkotlin/jvm/functions/Function1;

    .line 213
    .line 214
    move-object v0, v10

    .line 215
    check-cast v0, La/ios0;

    .line 216
    .line 217
    iget-object v12, v0, La/ios0;->s:Lkotlin/jvm/functions/Function1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 218
    .line 219
    :try_start_5
    move-object v0, v10

    .line 220
    check-cast v0, La/ios0;

    .line 221
    .line 222
    invoke-static {v3, v11, v7}, La/xfk0;->i(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    iput-object v3, v0, La/ios0;->r:Lkotlin/jvm/functions/Function1;

    .line 227
    .line 228
    move-object v0, v10

    .line 229
    check-cast v0, La/ios0;

    .line 230
    .line 231
    iput-object v12, v0, La/ios0;->s:Lkotlin/jvm/functions/Function1;

    .line 232
    .line 233
    invoke-interface/range {p3 .. p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 234
    .line 235
    .line 236
    :try_start_6
    move-object v0, v10

    .line 237
    check-cast v0, La/ios0;

    .line 238
    .line 239
    iput-object v11, v0, La/ios0;->r:Lkotlin/jvm/functions/Function1;

    .line 240
    .line 241
    check-cast v10, La/ios0;

    .line 242
    .line 243
    iput-object v12, v10, La/ios0;->s:Lkotlin/jvm/functions/Function1;

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :catchall_2
    move-exception v0

    .line 247
    move-object v3, v10

    .line 248
    check-cast v3, La/ios0;

    .line 249
    .line 250
    iput-object v11, v3, La/ios0;->r:Lkotlin/jvm/functions/Function1;

    .line 251
    .line 252
    check-cast v10, La/ios0;

    .line 253
    .line 254
    iput-object v12, v10, La/ios0;->s:Lkotlin/jvm/functions/Function1;

    .line 255
    .line 256
    throw v0

    .line 257
    :cond_7
    move-object/from16 p2, v12

    .line 258
    .line 259
    :cond_8
    if-eqz v10, :cond_9

    .line 260
    .line 261
    instance-of v0, v10, La/nz40;

    .line 262
    .line 263
    if-eqz v0, :cond_a

    .line 264
    .line 265
    :cond_9
    const/4 v0, 0x0

    .line 266
    goto :goto_4

    .line 267
    :cond_a
    invoke-virtual {v10, v3}, La/rfk0;->u(Lkotlin/jvm/functions/Function1;)La/rfk0;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    move-object v15, v0

    .line 272
    goto :goto_6

    .line 273
    :goto_4
    new-instance v15, La/ios0;

    .line 274
    .line 275
    instance-of v11, v10, La/nz40;

    .line 276
    .line 277
    if-eqz v11, :cond_b

    .line 278
    .line 279
    move-object v11, v10

    .line 280
    check-cast v11, La/nz40;

    .line 281
    .line 282
    move-object/from16 v16, v11

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_b
    move-object/from16 v16, v0

    .line 286
    .line 287
    :goto_5
    const/16 v19, 0x1

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    const/16 v18, 0x0

    .line 292
    .line 293
    move-object/from16 v17, v3

    .line 294
    .line 295
    invoke-direct/range {v15 .. v20}, La/ios0;-><init>(La/nz40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 296
    .line 297
    .line 298
    :goto_6
    :try_start_7
    invoke-virtual {v15}, La/rfk0;->j()La/rfk0;

    .line 299
    .line 300
    .line 301
    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 302
    :try_start_8
    invoke-interface/range {p3 .. p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 303
    .line 304
    .line 305
    :try_start_9
    invoke-static {v3}, La/rfk0;->q(La/rfk0;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 306
    .line 307
    .line 308
    :try_start_a
    invoke-virtual {v15}, La/rfk0;->c()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 309
    .line 310
    .line 311
    :goto_7
    :try_start_b
    iget v0, v8, La/xz40;->c:I

    .line 312
    .line 313
    sub-int/2addr v0, v7

    .line 314
    invoke-virtual {v8, v0}, La/xz40;->k(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-object/from16 v12, p2

    .line 318
    .line 319
    iget-object v0, v12, La/ogk0;->b:Ljava/lang/Object;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iget v3, v12, La/ogk0;->d:I

    .line 325
    .line 326
    iget-object v8, v12, La/ogk0;->c:La/ry40;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 327
    .line 328
    if-eqz v8, :cond_12

    .line 329
    .line 330
    :try_start_c
    iget-object v10, v8, La/ry40;->a:[J

    .line 331
    .line 332
    array-length v11, v10

    .line 333
    add-int/lit8 v11, v11, -0x2

    .line 334
    .line 335
    if-ltz v11, :cond_12

    .line 336
    .line 337
    move-object/from16 v17, v10

    .line 338
    .line 339
    const/4 v15, 0x0

    .line 340
    :goto_8
    aget-wide v9, v17, v15

    .line 341
    .line 342
    move/from16 v18, v7

    .line 343
    .line 344
    move-object/from16 v19, v8

    .line 345
    .line 346
    not-long v7, v9

    .line 347
    const/16 v20, 0x7

    .line 348
    .line 349
    shl-long v7, v7, v20

    .line 350
    .line 351
    and-long/2addr v7, v9

    .line 352
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    and-long v7, v7, v20

    .line 358
    .line 359
    cmp-long v7, v7, v20

    .line 360
    .line 361
    if-eqz v7, :cond_11

    .line 362
    .line 363
    sub-int v7, v15, v11

    .line 364
    .line 365
    not-int v7, v7

    .line 366
    ushr-int/lit8 v7, v7, 0x1f

    .line 367
    .line 368
    const/16 v8, 0x8

    .line 369
    .line 370
    rsub-int/lit8 v7, v7, 0x8

    .line 371
    .line 372
    move/from16 p1, v8

    .line 373
    .line 374
    const/4 v8, 0x0

    .line 375
    :goto_9
    if-ge v8, v7, :cond_10

    .line 376
    .line 377
    const-wide/16 v20, 0xff

    .line 378
    .line 379
    and-long v20, v9, v20

    .line 380
    .line 381
    const-wide/16 v22, 0x80

    .line 382
    .line 383
    cmp-long v20, v20, v22

    .line 384
    .line 385
    if-gez v20, :cond_e

    .line 386
    .line 387
    shl-int/lit8 v20, v15, 0x3

    .line 388
    .line 389
    move/from16 v21, v8

    .line 390
    .line 391
    add-int v8, v20, v21

    .line 392
    .line 393
    move-wide/from16 p2, v9

    .line 394
    .line 395
    move-object/from16 v9, v19

    .line 396
    .line 397
    iget-object v10, v9, La/ry40;->b:[Ljava/lang/Object;

    .line 398
    .line 399
    aget-object v10, v10, v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 400
    .line 401
    move-wide/from16 v19, v13

    .line 402
    .line 403
    :try_start_d
    iget-object v13, v9, La/ry40;->c:[I

    .line 404
    .line 405
    aget v13, v13, v8

    .line 406
    .line 407
    if-eq v13, v3, :cond_c

    .line 408
    .line 409
    move/from16 v13, v18

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_c
    const/4 v13, 0x0

    .line 413
    :goto_a
    if-eqz v13, :cond_d

    .line 414
    .line 415
    invoke-virtual {v12, v0, v10}, La/ogk0;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    :cond_d
    if-eqz v13, :cond_f

    .line 419
    .line 420
    invoke-virtual {v9, v8}, La/ry40;->f(I)V

    .line 421
    .line 422
    .line 423
    goto :goto_b

    .line 424
    :cond_e
    move/from16 v21, v8

    .line 425
    .line 426
    move-wide/from16 p2, v9

    .line 427
    .line 428
    move-object/from16 v9, v19

    .line 429
    .line 430
    move-wide/from16 v19, v13

    .line 431
    .line 432
    :cond_f
    :goto_b
    shr-long v13, p2, p1

    .line 433
    .line 434
    add-int/lit8 v8, v21, 0x1

    .line 435
    .line 436
    move-wide/from16 v24, v19

    .line 437
    .line 438
    move-object/from16 v19, v9

    .line 439
    .line 440
    move-wide v9, v13

    .line 441
    move-wide/from16 v13, v24

    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_10
    move/from16 v8, p1

    .line 445
    .line 446
    move-object/from16 v9, v19

    .line 447
    .line 448
    move-wide/from16 v19, v13

    .line 449
    .line 450
    if-ne v7, v8, :cond_13

    .line 451
    .line 452
    goto :goto_c

    .line 453
    :cond_11
    move-object/from16 v9, v19

    .line 454
    .line 455
    move-wide/from16 v19, v13

    .line 456
    .line 457
    :goto_c
    if-eq v15, v11, :cond_13

    .line 458
    .line 459
    add-int/lit8 v15, v15, 0x1

    .line 460
    .line 461
    move-object v8, v9

    .line 462
    move/from16 v7, v18

    .line 463
    .line 464
    move-wide/from16 v13, v19

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_12
    move-wide/from16 v19, v13

    .line 468
    .line 469
    goto :goto_d

    .line 470
    :catchall_3
    move-exception v0

    .line 471
    move-wide/from16 v19, v13

    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_13
    :goto_d
    iput-object v4, v12, La/ogk0;->b:Ljava/lang/Object;

    .line 475
    .line 476
    iput-object v5, v12, La/ogk0;->c:La/ry40;

    .line 477
    .line 478
    iput v6, v12, La/ogk0;->d:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 479
    .line 480
    iget-object v3, v1, La/pgk0;->g:Ljava/lang/Object;

    .line 481
    .line 482
    monitor-enter v3

    .line 483
    :try_start_e
    iput-object v2, v1, La/pgk0;->i:La/ogk0;

    .line 484
    .line 485
    move-wide/from16 v6, v19

    .line 486
    .line 487
    iput-wide v6, v1, La/pgk0;->j:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 488
    .line 489
    monitor-exit v3

    .line 490
    return-void

    .line 491
    :catchall_4
    move-exception v0

    .line 492
    monitor-exit v3

    .line 493
    throw v0

    .line 494
    :catchall_5
    move-exception v0

    .line 495
    :goto_e
    move-wide/from16 v6, v19

    .line 496
    .line 497
    goto :goto_11

    .line 498
    :catchall_6
    move-exception v0

    .line 499
    move/from16 v18, v7

    .line 500
    .line 501
    move-wide v6, v13

    .line 502
    goto :goto_f

    .line 503
    :catchall_7
    move-exception v0

    .line 504
    move/from16 v18, v7

    .line 505
    .line 506
    move-wide v6, v13

    .line 507
    :try_start_f
    invoke-static {v3}, La/rfk0;->q(La/rfk0;)V

    .line 508
    .line 509
    .line 510
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 511
    :catchall_8
    move-exception v0

    .line 512
    :goto_f
    :try_start_10
    invoke-virtual {v15}, La/rfk0;->c()V

    .line 513
    .line 514
    .line 515
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 516
    :catchall_9
    move-exception v0

    .line 517
    :goto_10
    :try_start_11
    iget v3, v8, La/xz40;->c:I

    .line 518
    .line 519
    add-int/lit8 v3, v3, -0x1

    .line 520
    .line 521
    invoke-virtual {v8, v3}, La/xz40;->k(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    throw v0

    .line 525
    :catchall_a
    move-exception v0

    .line 526
    goto :goto_11

    .line 527
    :catchall_b
    move-exception v0

    .line 528
    move-wide v6, v13

    .line 529
    monitor-exit v5

    .line 530
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 531
    :goto_11
    iget-object v3, v1, La/pgk0;->g:Ljava/lang/Object;

    .line 532
    .line 533
    monitor-enter v3

    .line 534
    :try_start_12
    iput-object v2, v1, La/pgk0;->i:La/ogk0;

    .line 535
    .line 536
    iput-wide v6, v1, La/pgk0;->j:J
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 537
    .line 538
    monitor-exit v3

    .line 539
    throw v0

    .line 540
    :catchall_c
    move-exception v0

    .line 541
    monitor-exit v3

    .line 542
    throw v0

    .line 543
    :catchall_d
    move-exception v0

    .line 544
    monitor-exit v5

    .line 545
    throw v0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, La/pgk0;->d:La/edk0;

    .line 2
    .line 3
    sget-object v1, La/xfk0;->a:La/thj0;

    .line 4
    .line 5
    invoke-static {v1}, La/xfk0;->b(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/xfk0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    sget-object v2, La/xfk0;->h:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sput-object v2, La/xfk0;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    new-instance v1, La/jk8;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v1, v0, v2}, La/jk8;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, La/pgk0;->h:La/jk8;

    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v1

    .line 31
    throw p0
.end method
