.class public final La/uw9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fy9;

.field public final b:La/qcq0;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/util/Map;

.field public final e:La/lrm0;

.field public final f:La/bsm0;

.field public final g:Z

.field public final h:I

.field public final i:Ljava/lang/Object;

.field public j:Z

.field public k:La/tw9;

.field public final l:La/yz2;


# direct methods
.method public constructor <init>(La/fy9;La/qcq0;Ljava/util/Map;Ljava/util/Map;La/lrm0;La/bsm0;Z)V
    .locals 1

    .line 1
    const-string v0, "CXCP"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/uw9;->a:La/fy9;

    .line 22
    .line 23
    iput-object p2, p0, La/uw9;->b:La/qcq0;

    .line 24
    .line 25
    iput-object p3, p0, La/uw9;->c:Ljava/util/Map;

    .line 26
    .line 27
    iput-object p4, p0, La/uw9;->d:Ljava/util/Map;

    .line 28
    .line 29
    iput-object p5, p0, La/uw9;->e:La/lrm0;

    .line 30
    .line 31
    iput-object p6, p0, La/uw9;->f:La/bsm0;

    .line 32
    .line 33
    iput-boolean p7, p0, La/uw9;->g:Z

    .line 34
    .line 35
    sget-object p3, La/vw9;->a:La/z04;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object p4, La/z04;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 41
    .line 42
    invoke-virtual {p4, p3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    iput p3, p0, La/uw9;->h:I

    .line 47
    .line 48
    new-instance p3, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p3, p0, La/uw9;->i:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object p3, p5, La/lrm0;->f:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    const/4 p5, 0x0

    .line 62
    if-nez p4, :cond_1

    .line 63
    .line 64
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    check-cast p3, La/irm0;

    .line 69
    .line 70
    invoke-interface {p1}, La/fy9;->getInputSurface()Landroid/view/Surface;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    :try_start_0
    iget p4, p3, La/irm0;->a:I

    .line 77
    .line 78
    iget p3, p3, La/irm0;->b:I

    .line 79
    .line 80
    new-instance p6, La/grm0;

    .line 81
    .line 82
    invoke-direct {p6, p3}, La/grm0;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, La/qcq0;->a()Landroid/os/Handler;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-static {p1, p4, p6, p2}, La/o2e;->a0(Landroid/view/Surface;ILa/grm0;Landroid/os/Handler;)La/yz2;

    .line 90
    .line 91
    .line 92
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception p1

    .line 95
    new-instance p2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string p3, "Failed to create ImageWriter for session "

    .line 98
    .line 99
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p3, p0, La/uw9;->a:La/fy9;

    .line 103
    .line 104
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p3, "! Reprocessing will not be supported!"

    .line 108
    .line 109
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 117
    .line 118
    .line 119
    :goto_0
    if-eqz p5, :cond_1

    .line 120
    .line 121
    new-instance p1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string p2, "Created ImageWriter "

    .line 124
    .line 125
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p2, " for session "

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    iget-object p2, p0, La/uw9;->a:La/fy9;

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_0
    const-string p0, "inputSurface is required to create instance of imageWriter."

    .line 150
    .line 151
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p5

    .line 155
    :cond_1
    :goto_1
    iput-object p5, p0, La/uw9;->l:La/yz2;

    .line 156
    .line 157
    return-void
.end method


# virtual methods
.method public final a(La/tw9;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Waiting for the last repeating request sequence: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "CXCP"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    new-instance v0, La/pn;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/16 v3, 0xd

    .line 24
    .line 25
    invoke-direct {v0, p1, v2, v3}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, La/uw9;->b:La/qcq0;

    .line 29
    .line 30
    const-wide/16 v3, 0x7d0

    .line 31
    .line 32
    invoke-virtual {v2, v3, v4, v0}, La/qcq0;->b(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lkotlin/Unit;

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p0, "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = "

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method public final b(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;La/svu;Ljava/util/List;)La/tw9;
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v7, p5

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v13, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    new-instance v14, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    new-instance v15, Landroid/util/ArrayMap;

    invoke-direct {v15}, Landroid/util/ArrayMap;-><init>()V

    .line 5
    new-instance v2, Landroid/util/ArrayMap;

    invoke-direct {v2}, Landroid/util/ArrayMap;-><init>()V

    .line 6
    new-instance v8, Landroid/util/ArrayMap;

    invoke-direct {v8}, Landroid/util/ArrayMap;-><init>()V

    .line 7
    iget-object v0, v1, La/uw9;->a:La/fy9;

    .line 8
    const-string v3, "CXCP"

    iget-object v4, v1, La/uw9;->e:La/lrm0;

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    const/16 v16, 0x0

    if-nez v6, :cond_40

    .line 9
    instance-of v0, v0, La/mw2;

    const/16 v17, 0x1

    if-eqz v0, :cond_15

    .line 10
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v6, v16

    move-object/from16 v19, v6

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v9, v20

    check-cast v9, La/cmf0;

    .line 11
    iget-object v10, v9, La/cmf0;->a:Ljava/util/List;

    if-eqz v10, :cond_1

    .line 12
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v20

    if-eqz v20, :cond_1

    :cond_0
    move-object/from16 v20, v0

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    const/4 v0, 0x0

    goto/16 :goto_7

    .line 13
    :cond_1
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v11, v20

    check-cast v11, La/mrm0;

    .line 14
    iget v11, v11, La/mrm0;->a:I

    .line 15
    iget-object v11, v4, La/lrm0;->h:Ljava/util/ArrayList;

    if-eqz v11, :cond_3

    .line 16
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_3

    :cond_2
    move-object/from16 v20, v0

    move-object/from16 v25, v10

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    goto :goto_6

    .line 17
    :cond_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/krm0;

    move-object/from16 v20, v0

    .line 18
    iget-object v0, v12, La/krm0;->g:La/jf80;

    iget-object v12, v12, La/krm0;->i:La/kf80;

    if-nez v0, :cond_4

    move-object/from16 v25, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    const/4 v0, 0x0

    goto :goto_3

    :cond_4
    move-object/from16 v25, v10

    move-object/from16 v26, v11

    .line 19
    iget-wide v10, v0, La/jf80;->a:J

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    const-wide/16 v13, 0x1

    .line 20
    invoke-static {v10, v11, v13, v14}, La/jf80;->a(JJ)Z

    move-result v0

    :goto_3
    if-nez v0, :cond_7

    if-nez v12, :cond_5

    const/4 v0, 0x0

    goto :goto_4

    .line 21
    :cond_5
    iget-wide v10, v12, La/kf80;->a:J

    const-wide/16 v13, 0x0

    .line 22
    invoke-static {v10, v11, v13, v14}, La/kf80;->a(JJ)Z

    move-result v0

    :goto_4
    if-nez v0, :cond_7

    if-nez v12, :cond_6

    goto :goto_5

    :cond_6
    move-object/from16 v0, v20

    move-object/from16 v10, v25

    move-object/from16 v11, v26

    move-object/from16 v13, v27

    move-object/from16 v14, v28

    goto :goto_2

    :cond_7
    :goto_5
    move/from16 v0, v17

    goto :goto_7

    :goto_6
    move-object/from16 v0, v20

    move-object/from16 v10, v25

    move-object/from16 v13, v27

    move-object/from16 v14, v28

    goto :goto_1

    .line 23
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/16 v11, 0x2e

    if-eqz v6, :cond_8

    .line 24
    invoke-virtual {v6, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    .line 25
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 27
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    const-string v6, ". Current request contains preview stream use case or hint: "

    .line 29
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    :cond_8
    iget-object v0, v9, La/cmf0;->a:Ljava/util/List;

    if-eqz v0, :cond_a

    .line 32
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_a

    :cond_9
    const/4 v0, 0x0

    goto :goto_d

    .line 33
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/mrm0;

    .line 34
    iget v6, v6, La/mrm0;->a:I

    .line 35
    iget-object v6, v4, La/lrm0;->h:Ljava/util/ArrayList;

    if-eqz v6, :cond_c

    .line 36
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_8

    .line 37
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/krm0;

    .line 38
    iget-object v12, v9, La/krm0;->g:La/jf80;

    if-nez v12, :cond_d

    move-object v14, v6

    const/4 v12, 0x0

    goto :goto_a

    .line 39
    :cond_d
    iget-wide v12, v12, La/jf80;->a:J

    move-object v14, v6

    const-wide/16 v5, 0x3

    .line 40
    invoke-static {v12, v13, v5, v6}, La/jf80;->a(JJ)Z

    move-result v12

    :goto_a
    if-nez v12, :cond_10

    .line 41
    iget-object v5, v9, La/krm0;->i:La/kf80;

    if-nez v5, :cond_e

    const/4 v5, 0x0

    goto :goto_b

    .line 42
    :cond_e
    iget-wide v5, v5, La/kf80;->a:J

    const-wide/16 v12, 0x1

    .line 43
    invoke-static {v5, v6, v12, v13}, La/kf80;->a(JJ)Z

    move-result v5

    :goto_b
    if-eqz v5, :cond_f

    goto :goto_c

    :cond_f
    move-object v6, v14

    goto :goto_9

    :cond_10
    :goto_c
    move/from16 v0, v17

    .line 44
    :goto_d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v6, v19

    if-eqz v6, :cond_11

    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    .line 46
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: "

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 48
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    const-string v6, ". Current request contains video stream use case: "

    .line 50
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    :cond_11
    iget-object v0, v4, La/lrm0;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_12

    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_12

    goto :goto_e

    .line 54
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/krm0;

    .line 55
    invoke-virtual {v6}, La/krm0;->a()Z

    move-result v6

    if-nez v6, :cond_13

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    iget-object v1, v4, La/lrm0;->h:Ljava/util/ArrayList;

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v16

    :cond_14
    :goto_e
    move-object/from16 v19, v5

    move-object v6, v10

    move-object/from16 v0, v20

    move-object/from16 v13, v27

    move-object/from16 v14, v28

    goto/16 :goto_0

    :cond_15
    move-object/from16 v27, v13

    move-object/from16 v28, v14

    .line 60
    const-string v0, "Required value was null."

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3f

    .line 61
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v13, 0x21

    if-eqz v4, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/cmf0;

    .line 62
    iget-object v5, v4, La/cmf0;->a:Ljava/util/List;

    .line 63
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_16
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/mrm0;

    .line 64
    iget v10, v9, La/mrm0;->a:I

    .line 65
    invoke-virtual {v8, v9}, Landroid/util/ArrayMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    :cond_17
    move/from16 v6, v17

    goto :goto_10

    .line 66
    :cond_18
    iget-object v11, v1, La/uw9;->c:Ljava/util/Map;

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/Surface;

    if-eqz v11, :cond_16

    .line 67
    invoke-virtual {v15, v11, v9}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    invoke-virtual {v8, v9, v11}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object v6, v1, La/uw9;->e:La/lrm0;

    invoke-virtual {v6, v10}, La/lrm0;->a(I)La/f3a;

    move-result-object v6

    if-eqz v6, :cond_1a

    .line 70
    iget-object v6, v6, La/f3a;->b:Ljava/util/ArrayList;

    .line 71
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/krm0;

    .line 72
    iget-object v10, v1, La/uw9;->d:Ljava/util/Map;

    .line 73
    iget v11, v9, La/krm0;->a:I

    .line 74
    new-instance v12, La/xe80;

    invoke-direct {v12, v11}, La/xe80;-><init>(I)V

    .line 75
    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_19

    check-cast v10, Landroid/view/Surface;

    .line 76
    iget v9, v9, La/krm0;->a:I

    .line 77
    new-instance v11, La/xe80;

    invoke-direct {v11, v9}, La/xe80;-><init>(I)V

    .line 78
    invoke-virtual {v2, v10, v11}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    .line 79
    :cond_19
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16

    .line 80
    :cond_1a
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16

    :cond_1b
    if-nez v6, :cond_1c

    .line 81
    const-string v0, "CXCP"

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  Failed to bind any surfaces for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-object v16

    :cond_1c
    if-eqz v6, :cond_1d

    goto/16 :goto_f

    .line 84
    :cond_1d
    const-string v0, "Check failed."

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16

    .line 85
    :cond_1e
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_12
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, La/cmf0;

    .line 86
    const-string v0, "CXCP"

    .line 87
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Building CaptureRequest for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 88
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    iget-object v0, v10, La/cmf0;->e:La/onf0;

    if-eqz v0, :cond_1f

    .line 90
    iget v0, v0, La/onf0;->a:I

    goto :goto_13

    :cond_1f
    move/from16 v0, v17

    .line 91
    :goto_13
    const-string v3, "CXCP"

    iget-object v4, v1, La/uw9;->a:La/fy9;

    iget-object v5, v10, La/cmf0;->f:La/dfx;

    if-eqz v5, :cond_21

    .line 92
    iget-object v6, v5, La/dfx;->b:La/b7r;

    .line 93
    const-class v9, Landroid/hardware/camera2/TotalCaptureResult;

    .line 94
    sget-object v11, La/sre0;->a:La/tre0;

    invoke-virtual {v11, v9}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    move-result-object v9

    .line 95
    invoke-interface {v6, v9}, La/kft0;->H(La/sgy;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/hardware/camera2/TotalCaptureResult;

    if-eqz v6, :cond_20

    .line 96
    invoke-interface {v4}, La/fy9;->E()La/yy9;

    move-result-object v4

    invoke-interface {v4, v6}, La/yy9;->I(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v4

    goto :goto_14

    .line 97
    :cond_20
    const-string v0, "Failed to unwrap FrameInfo "

    .line 98
    iget-object v1, v5, La/dfx;->b:La/b7r;

    .line 99
    const-string v2, " as TotalCaptureResult"

    .line 100
    invoke-static {v1, v2, v0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-object v16

    .line 101
    :cond_21
    invoke-interface {v4}, La/fy9;->E()La/yy9;

    move-result-object v4

    invoke-interface {v4, v0}, La/yy9;->q(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v4

    :goto_14
    if-nez v4, :cond_23

    if-eqz v5, :cond_22

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Failed to create a ReprocessingCaptureRequest.Builder from "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    iget-object v4, v5, La/dfx;->b:La/b7r;

    .line 104
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 105
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_15

    .line 106
    :cond_22
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to create a CaptureRequest.Builder from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, La/onf0;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 107
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_15
    move-object/from16 v4, v16

    :cond_23
    if-nez v4, :cond_24

    goto/16 :goto_28

    .line 108
    :cond_24
    sget-object v0, La/n1a;->b:La/dd40;

    .line 109
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, p3

    if-nez v3, :cond_25

    .line 110
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 111
    :cond_25
    invoke-virtual {v4, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->setTag(Ljava/lang/Object;)V

    .line 112
    iget-object v0, v10, La/cmf0;->a:Ljava/util/List;

    .line 113
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_16
    if-ge v3, v0, :cond_27

    .line 114
    iget-object v9, v10, La/cmf0;->a:Ljava/util/List;

    .line 115
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/Surface;

    if-eqz v9, :cond_26

    .line 116
    invoke-virtual {v4, v9}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    move/from16 v6, v17

    :cond_26
    add-int/lit8 v3, v3, 0x1

    goto :goto_16

    :cond_27
    if-eqz v6, :cond_3d

    .line 117
    iget-object v0, v10, La/cmf0;->f:La/dfx;

    if-eqz v0, :cond_31

    .line 118
    iget-object v3, v1, La/uw9;->l:La/yz2;

    if-nez v3, :cond_28

    .line 119
    const-string v0, "CXCP"

    .line 120
    const-string v1, "Failed to queue request to ImageWriter - No ImageWriter available!"

    .line 121
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_28

    .line 122
    :cond_28
    iget-object v3, v0, La/dfx;->a:La/uz2;

    .line 123
    iget-object v6, v1, La/uw9;->i:Ljava/lang/Object;

    monitor-enter v6

    .line 124
    :try_start_0
    iget-boolean v0, v1, La/uw9;->j:Z

    if-eqz v0, :cond_29

    .line 125
    const-string v0, "CXCP"

    .line 126
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " disconnected. "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " can\'t be queued to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    iget-object v1, v1, La/uw9;->l:La/yz2;

    .line 128
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 129
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    monitor-exit v6

    goto/16 :goto_28

    :catchall_0
    move-exception v0

    goto/16 :goto_1a

    :cond_29
    monitor-exit v6

    .line 131
    const-string v0, "CXCP"

    .line 132
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "Queuing image "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " for reprocessing to ImageWriter "

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    iget-object v9, v1, La/uw9;->l:La/yz2;

    .line 134
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 135
    invoke-static {v0, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    iget-object v6, v1, La/uw9;->l:La/yz2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    const-string v9, "CXCP"

    const-string v0, "Failed to unwrap image wrapper "

    .line 138
    :try_start_1
    const-class v11, Landroid/media/Image;

    .line 139
    sget-object v12, La/sre0;->a:La/tre0;

    invoke-virtual {v12, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    move-result-object v11

    .line 140
    invoke-virtual {v3, v11}, La/uz2;->H(La/sgy;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/media/Image;

    if-nez v11, :cond_2a

    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 142
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_19

    :catchall_1
    move-exception v0

    goto :goto_17

    .line 143
    :cond_2a
    iget-object v0, v6, La/yz2;->a:Landroid/media/ImageWriter;

    invoke-virtual {v0, v11}, Landroid/media/ImageWriter;->queueInputImage(Landroid/media/Image;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    iget-object v0, v10, La/cmf0;->b:Ljava/util/Map;

    .line 145
    invoke-static {v4, v0}, La/tfx;->P(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    move-object/from16 v6, p4

    goto/16 :goto_1b

    .line 146
    :goto_17
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Failed to queue image to "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " due to error "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Ignoring failure and closing "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    invoke-static {v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    instance-of v0, v3, Ljava/lang/AutoCloseable;

    if-eqz v0, :cond_2b

    invoke-virtual {v3}, La/uz2;->close()V

    goto :goto_19

    :cond_2b
    instance-of v0, v3, Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_30

    move-object v0, v3

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v2

    if-ne v0, v2, :cond_2c

    goto :goto_19

    :cond_2c
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v2

    if-nez v2, :cond_2f

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 v6, 0x0

    :cond_2d
    :goto_18
    if-nez v2, :cond_2e

    :try_start_2
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v12, 0x1

    invoke-interface {v0, v12, v13, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_18

    :catch_0
    if-nez v6, :cond_2d

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    move/from16 v6, v17

    goto :goto_18

    :cond_2e
    if-eqz v6, :cond_2f

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 149
    :cond_2f
    :goto_19
    const-string v0, "CXCP"

    .line 150
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Failed to queue image "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for reprocessing to ImageWriter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    iget-object v1, v1, La/uw9;->l:La/yz2;

    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 153
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_28

    .line 154
    :cond_30
    invoke-static {}, La/e9d0;->o()V

    return-object v16

    .line 155
    :goto_1a
    monitor-exit v6

    throw v0

    .line 156
    :cond_31
    invoke-static {v4, v5}, La/tfx;->P(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    move-object/from16 v6, p4

    .line 157
    invoke-static {v4, v6}, La/tfx;->P(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    .line 158
    iget-object v0, v10, La/cmf0;->b:Ljava/util/Map;

    .line 159
    invoke-static {v4, v0}, La/tfx;->P(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    .line 160
    invoke-static {v4, v7}, La/tfx;->P(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V

    .line 161
    :goto_1b
    sget-object v0, La/vw9;->c:La/b14;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    sget-object v3, La/b14;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->incrementAndGet(Ljava/lang/Object;)J

    move-result-wide v11

    .line 163
    invoke-virtual {v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    iget-object v3, v1, La/uw9;->a:La/fy9;

    instance-of v0, v3, La/mw2;

    if-eqz v0, :cond_3c

    .line 165
    check-cast v3, La/mw2;

    .line 166
    const-string v9, "Failed to createHighSpeedRequestList from "

    iget-object v13, v3, La/lw2;->a:La/nw2;

    move-object/from16 v20, v2

    const-string v2, "CXCP"

    .line 167
    :try_start_3
    const-string v0, "CXCP#createHighSpeedRequestList"
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 168
    :try_start_4
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 169
    iget-object v0, v3, La/mw2;->e:Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;

    .line 170
    invoke-virtual {v0, v4}, Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;->createHighSpeedRequestList(Landroid/hardware/camera2/CaptureRequest;)Ljava/util/List;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 171
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_1d

    :catchall_2
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 172
    throw v0
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5 .. :try_end_5} :catch_1

    .line 173
    :catch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " because the output surface was not available."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1c

    .line 175
    :catch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " because the output surface was destroyed before calling createHighSpeedRequestList."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 176
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1c

    .line 177
    :catch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Failed to createHighSpeedRequestList. "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " may be closed."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1c
    move-object/from16 v0, v16

    :goto_1d
    if-nez v0, :cond_32

    goto/16 :goto_28

    .line 179
    :cond_32
    iget-object v2, v10, La/cmf0;->a:Ljava/util/List;

    if-eqz v2, :cond_34

    .line 180
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_34

    :cond_33
    move-object/from16 v18, v14

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    const/4 v14, 0x0

    const-wide/16 v21, 0x3

    const-wide/16 v23, 0x1

    goto/16 :goto_26

    .line 181
    :cond_34
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_33

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/mrm0;

    .line 182
    iget v3, v3, La/mrm0;->a:I

    .line 183
    iget-object v3, v1, La/uw9;->e:La/lrm0;

    .line 184
    iget-object v3, v3, La/lrm0;->h:Ljava/util/ArrayList;

    if-eqz v3, :cond_36

    .line 185
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_36

    :cond_35
    move-object/from16 p2, v2

    move-object/from16 v18, v14

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    const/4 v14, 0x0

    const-wide/16 v21, 0x3

    const-wide/16 v23, 0x1

    goto/16 :goto_25

    .line 186
    :cond_36
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_35

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/krm0;

    .line 187
    iget-object v9, v4, La/krm0;->g:La/jf80;

    if-nez v9, :cond_37

    move-object/from16 p2, v2

    move-object v13, v3

    const/4 v2, 0x0

    const-wide/16 v5, 0x3

    goto :goto_20

    :cond_37
    move-object/from16 p2, v2

    move-object v13, v3

    .line 188
    iget-wide v2, v9, La/jf80;->a:J

    const-wide/16 v5, 0x3

    .line 189
    invoke-static {v2, v3, v5, v6}, La/jf80;->a(JJ)Z

    move-result v2

    :goto_20
    if-nez v2, :cond_3a

    .line 190
    iget-object v2, v4, La/krm0;->i:La/kf80;

    if-nez v2, :cond_38

    const/4 v2, 0x0

    const-wide/16 v5, 0x1

    goto :goto_21

    .line 191
    :cond_38
    iget-wide v2, v2, La/kf80;->a:J

    const-wide/16 v5, 0x1

    .line 192
    invoke-static {v2, v3, v5, v6}, La/kf80;->a(JJ)Z

    move-result v2

    :goto_21
    if-eqz v2, :cond_39

    goto :goto_22

    :cond_39
    move-object/from16 v2, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object v3, v13

    goto :goto_1f

    :cond_3a
    const-wide/16 v5, 0x1

    .line 193
    :goto_22
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v13

    const/4 v2, 0x0

    :goto_23
    if-ge v2, v13, :cond_3b

    .line 194
    new-instance v3, La/kx9;

    move-object v4, v3

    .line 195
    iget-object v3, v1, La/uw9;->a:La/fy9;

    .line 196
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/hardware/camera2/CaptureRequest;

    move-wide/from16 v23, v5

    move/from16 p2, v13

    move-object/from16 v18, v14

    const/4 v14, 0x0

    const-wide/16 v21, 0x3

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move v13, v2

    move-object v2, v4

    move-object v4, v9

    move/from16 v9, p1

    .line 197
    invoke-direct/range {v2 .. v12}, La/kx9;-><init>(La/fy9;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/util/ArrayMap;ZLa/cmf0;J)V

    .line 198
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v28

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v27

    .line 199
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v13, 0x1

    move/from16 v13, p2

    move-object/from16 v7, p5

    move-object/from16 v14, v18

    move-wide/from16 v5, v23

    goto :goto_23

    :cond_3b
    move-object/from16 v18, v14

    const/4 v14, 0x0

    const-wide/16 v21, 0x3

    move-object/from16 v7, p5

    move-object/from16 v14, v18

    move-object/from16 v2, v20

    :goto_24
    const/16 v13, 0x21

    goto/16 :goto_12

    :goto_25
    move-object/from16 v2, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v14, v18

    goto/16 :goto_1e

    .line 200
    :goto_26
    new-instance v2, La/kx9;

    move-object/from16 v27, v3

    .line 201
    iget-object v3, v1, La/uw9;->a:La/fy9;

    .line 202
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/hardware/camera2/CaptureRequest;

    move/from16 v9, p1

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v25, v15

    move-object/from16 v13, v27

    move-object v15, v4

    move-object v4, v5

    move-object/from16 v5, p3

    .line 203
    invoke-direct/range {v2 .. v12}, La/kx9;-><init>(La/fy9;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/util/ArrayMap;ZLa/cmf0;J)V

    .line 204
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v28, v15

    :goto_27
    move-object/from16 v14, v18

    move-object/from16 v2, v20

    move-object/from16 v15, v25

    goto :goto_24

    :cond_3c
    move-object/from16 v20, v2

    move-object/from16 v18, v14

    move-object/from16 v25, v15

    move-object/from16 v13, v27

    move-object/from16 v15, v28

    const/4 v14, 0x0

    const-wide/16 v21, 0x3

    const-wide/16 v23, 0x1

    .line 206
    new-instance v2, La/kx9;

    move/from16 v9, p1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    .line 207
    invoke-direct/range {v2 .. v12}, La/kx9;-><init>(La/fy9;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/util/ArrayMap;ZLa/cmf0;J)V

    .line 208
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    .line 210
    :cond_3d
    const-string v0, "Check failed."

    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16

    :cond_3e
    move-object/from16 v20, v2

    move-object/from16 v25, v15

    move-object/from16 v13, v27

    move-object/from16 v15, v28

    .line 211
    new-instance v0, La/tw9;

    .line 212
    iget-object v2, v1, La/uw9;->a:La/fy9;

    invoke-interface {v2}, La/fy9;->E()La/yy9;

    move-result-object v2

    invoke-interface {v2}, La/yy9;->F()Ljava/lang/String;

    move-result-object v2

    .line 213
    iget-object v9, v1, La/uw9;->e:La/lrm0;

    .line 214
    iget-object v10, v1, La/uw9;->f:La/bsm0;

    move-object/from16 v6, p6

    move-object/from16 v5, p7

    move-object v1, v2

    move-object v4, v13

    move-object v3, v15

    move-object/from16 v8, v20

    move-object/from16 v7, v25

    move/from16 v2, p1

    .line 215
    invoke-direct/range {v0 .. v10}, La/tw9;-><init>(Ljava/lang/String;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;La/svu;Landroid/util/ArrayMap;Landroid/util/ArrayMap;La/lrm0;La/bsm0;)V

    move-object/from16 v16, v0

    :goto_28
    return-object v16

    .line 216
    :cond_3f
    const-string v0, "build(...) should never be called with an empty request list!"

    .line 217
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16

    .line 218
    :cond_40
    const-string v0, "build(...) should never be called with an empty request list!"

    .line 219
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    return-object v16
.end method

.method public final c()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "#disconnect"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, La/uw9;->i:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    :try_start_1
    iget-boolean v1, p0, La/uw9;->j:Z

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, p0, La/uw9;->j:Z

    .line 30
    .line 31
    iget-object v1, p0, La/uw9;->l:La/yz2;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-static {v1}, La/dw9;->y(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    :goto_0
    iget-object v1, p0, La/uw9;->a:La/fy9;

    .line 42
    .line 43
    invoke-interface {v1}, La/fy9;->getInputSurface()Landroid/view/Surface;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v1, p0, La/uw9;->k:La/tw9;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/4 v1, 0x0

    .line 56
    :goto_1
    :try_start_2
    monitor-exit v0

    .line 57
    iget-boolean v0, p0, La/uw9;->g:Z

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, v1}, La/uw9;->a(La/tw9;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :goto_2
    :try_start_3
    monitor-exit v0

    .line 71
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method public final d(La/tw9;)Ljava/lang/Integer;
    .locals 4

    .line 1
    iget-object v0, p0, La/uw9;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, La/uw9;->j:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "CXCP"

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, " disconnected. "

    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, " won\'t be submitted"

    .line 27
    .line 28
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :try_start_1
    iget-object v1, p1, La/tw9;->c:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x1

    .line 50
    if-ne v1, v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, La/uw9;->a:La/fy9;

    .line 53
    .line 54
    instance-of v2, v1, La/mw2;

    .line 55
    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    iget-boolean v2, p1, La/tw9;->b:Z

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    iget-boolean v2, p0, La/uw9;->g:Z

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    iput-object p1, p0, La/uw9;->k:La/tw9;

    .line 68
    .line 69
    :cond_1
    iget-object p0, p1, La/tw9;->c:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Landroid/hardware/camera2/CaptureRequest;

    .line 76
    .line 77
    invoke-interface {v1, p0, p1}, La/fy9;->d0(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    iget-object p0, p1, La/tw9;->c:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Landroid/hardware/camera2/CaptureRequest;

    .line 89
    .line 90
    invoke-interface {v1, p0, p1}, La/fy9;->w0(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    iget-boolean v1, p1, La/tw9;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    .line 97
    iget-object p0, p0, La/uw9;->a:La/fy9;

    .line 98
    .line 99
    iget-object v2, p1, La/tw9;->c:Ljava/util/ArrayList;

    .line 100
    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    :try_start_2
    invoke-interface {p0, v2, p1}, La/fy9;->T0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-interface {p0, v2, p1}, La/fy9;->g0(Ljava/util/ArrayList;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    :goto_0
    monitor-exit v0

    .line 113
    return-object p0

    .line 114
    :goto_1
    monitor-exit v0

    .line 115
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Camera2CaptureSequenceProcessor-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget p0, p0, La/uw9;->h:I

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
