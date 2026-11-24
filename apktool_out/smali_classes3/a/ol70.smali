.class public final La/ol70;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/fq;

.field public final c:La/l1u;

.field public final d:La/v8u;

.field public final e:La/k1u;

.field public final f:La/spx;

.field public final g:La/vcu;

.field public final h:Z

.field public final i:La/lzt;

.field public final j:La/xcc;

.field public final k:La/lg60;

.field public final l:La/mne;

.field public final m:La/tbu;

.field public final n:La/t0u;

.field public final o:La/q99;


# direct methods
.method public constructor <init>(La/i1w0;La/fq;La/qa60;La/l1u;La/v8u;La/k1u;La/spx;La/vcu;ZLa/lzt;La/xcc;La/lg60;La/mne;La/tbu;La/t0u;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, La/w46;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, La/ol70;->b:La/fq;

    .line 44
    .line 45
    iput-object p4, p0, La/ol70;->c:La/l1u;

    .line 46
    .line 47
    iput-object p5, p0, La/ol70;->d:La/v8u;

    .line 48
    .line 49
    iput-object p6, p0, La/ol70;->e:La/k1u;

    .line 50
    .line 51
    iput-object p7, p0, La/ol70;->f:La/spx;

    .line 52
    .line 53
    iput-object p8, p0, La/ol70;->g:La/vcu;

    .line 54
    .line 55
    iput-boolean p9, p0, La/ol70;->h:Z

    .line 56
    .line 57
    move-object/from16 p1, p10

    .line 58
    .line 59
    iput-object p1, p0, La/ol70;->i:La/lzt;

    .line 60
    .line 61
    move-object/from16 p1, p11

    .line 62
    .line 63
    iput-object p1, p0, La/ol70;->j:La/xcc;

    .line 64
    .line 65
    move-object/from16 p1, p12

    .line 66
    .line 67
    iput-object p1, p0, La/ol70;->k:La/lg60;

    .line 68
    .line 69
    move-object/from16 p1, p13

    .line 70
    .line 71
    iput-object p1, p0, La/ol70;->l:La/mne;

    .line 72
    .line 73
    move-object/from16 p1, p14

    .line 74
    .line 75
    iput-object p1, p0, La/ol70;->m:La/tbu;

    .line 76
    .line 77
    move-object/from16 p1, p15

    .line 78
    .line 79
    iput-object p1, p0, La/ol70;->n:La/t0u;

    .line 80
    .line 81
    const/4 p1, 0x7

    .line 82
    const/4 p2, 0x0

    .line 83
    const/4 p4, 0x0

    .line 84
    invoke-static {p2, p4, p4, p1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, La/ol70;->o:La/q99;

    .line 89
    .line 90
    new-instance p1, La/il70;

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    invoke-direct {p1, v0}, La/il70;-><init>(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/ol70;->z(La/ll70;)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, La/gxo;->values()[La/gxo;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    array-length v1, p1

    .line 104
    :goto_0
    if-ge p2, v1, :cond_0

    .line 105
    .line 106
    aget-object v2, p1, p2

    .line 107
    .line 108
    iget-object v3, p0, La/ol70;->d:La/v8u;

    .line 109
    .line 110
    invoke-virtual {v3, v2}, La/v8u;->a(La/gxo;)D

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    invoke-virtual {p0, v2, v3, v4}, La/ol70;->x(La/gxo;D)V

    .line 115
    .line 116
    .line 117
    add-int/lit8 p2, p2, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {p3}, La/qa60;->a()La/vae0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance p2, La/hi70;

    .line 125
    .line 126
    const/4 p3, 0x4

    .line 127
    const/4 v1, 0x5

    .line 128
    const/4 v2, 0x2

    .line 129
    const-class v3, La/ol70;

    .line 130
    .line 131
    const-string v4, "handleCommand"

    .line 132
    .line 133
    const-string v5, "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V"

    .line 134
    .line 135
    move-object p7, p0

    .line 136
    move-object p5, p2

    .line 137
    move/from16 p11, p3

    .line 138
    .line 139
    move/from16 p12, v1

    .line 140
    .line 141
    move p6, v2

    .line 142
    move-object p8, v3

    .line 143
    move-object p9, v4

    .line 144
    move-object/from16 p10, v5

    .line 145
    .line 146
    invoke-direct/range {p5 .. p12}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 147
    .line 148
    .line 149
    move-object p3, p5

    .line 150
    new-instance v1, La/fnq;

    .line 151
    .line 152
    const/4 v2, 0x4

    .line 153
    invoke-direct {v1, p1, p3, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 154
    .line 155
    .line 156
    new-instance p1, La/ib60;

    .line 157
    .line 158
    invoke-direct {p1, p0, p4, v2}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 159
    .line 160
    .line 161
    new-instance p3, La/dnq;

    .line 162
    .line 163
    invoke-direct {p3, v1, p1, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 164
    .line 165
    .line 166
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p3, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 171
    .line 172
    .line 173
    return-void
.end method


# virtual methods
.method public final w(La/zy5;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/ol70;->l:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 8
    .line 9
    sget-object v1, La/ml70;->a:La/ml70;

    .line 10
    .line 11
    new-instance v4, La/wk70;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v5, 0x2

    .line 15
    invoke-direct {v4, p0, p1, v2, v5}, La/wk70;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 16
    .line 17
    .line 18
    const/16 v5, 0xa

    .line 19
    .line 20
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final x(La/gxo;D)V
    .locals 16

    .line 1
    invoke-static/range {p0 .. p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/gk70;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    const/16 v8, 0x8

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const-class v4, La/ol70;

    .line 12
    .line 13
    const-string v5, "handleGameError"

    .line 14
    .line 15
    const-string v6, "handleGameError(Ljava/lang/Throwable;)V"

    .line 16
    .line 17
    move-object/from16 v3, p0

    .line 18
    .line 19
    invoke-direct/range {v1 .. v8}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 20
    .line 21
    .line 22
    new-instance v4, La/ui70;

    .line 23
    .line 24
    const/4 v14, 0x0

    .line 25
    const/4 v15, 0x1

    .line 26
    move-object/from16 v10, p0

    .line 27
    .line 28
    move-object/from16 v11, p1

    .line 29
    .line 30
    move-wide/from16 v12, p2

    .line 31
    .line 32
    move-object v9, v4

    .line 33
    invoke-direct/range {v9 .. v15}, La/ui70;-><init>(La/w46;La/gxo;DLa/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v5, 0xe

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final y(La/gxo;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/ol70;->f:La/spx;

    .line 2
    .line 3
    invoke-virtual {v0}, La/spx;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/ol70;->i:La/lzt;

    .line 10
    .line 11
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, La/ol70;->d:La/v8u;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iget-object v3, p0, La/ol70;->c:La/l1u;

    .line 25
    .line 26
    invoke-virtual {v3}, La/l1u;->a()D

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    iget-object v6, p0, La/ol70;->e:La/k1u;

    .line 31
    .line 32
    invoke-virtual {v6}, La/k1u;->a()D

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    cmpg-double v6, v1, v6

    .line 37
    .line 38
    if-gtz v6, :cond_3

    .line 39
    .line 40
    cmpg-double v1, v4, v1

    .line 41
    .line 42
    if-gtz v1, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, La/ol70;->g:La/vcu;

    .line 45
    .line 46
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, La/vrs;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v2, p0, La/ol70;->k:La/lg60;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    invoke-virtual {v2, v3, v4}, La/lg60;->a(D)V

    .line 61
    .line 62
    .line 63
    iget-boolean p1, p0, La/ol70;->h:Z

    .line 64
    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    sget-object p1, La/py5;->a:La/py5;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, La/ol70;->w(La/zy5;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    iget-object p1, p0, La/ol70;->m:La/tbu;

    .line 76
    .line 77
    iget-object p1, p1, La/tbu;->a:La/pbt;

    .line 78
    .line 79
    iget-object p1, p1, La/pbt;->a:La/j5t;

    .line 80
    .line 81
    iget-object p1, p1, La/j5t;->z:La/y5s;

    .line 82
    .line 83
    iget-boolean p1, p1, La/y5s;->d:Z

    .line 84
    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    sget-object p1, La/qy5;->a:La/qy5;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/ol70;->w(La/zy5;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    sget-object p1, La/fy5;->a:La/fy5;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, La/ol70;->w(La/zy5;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    invoke-virtual {v3}, La/l1u;->a()D

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    cmpg-double p1, v0, v2

    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    if-gez p1, :cond_4

    .line 111
    .line 112
    move p1, v0

    .line 113
    goto :goto_0

    .line 114
    :cond_4
    const/4 p1, 0x0

    .line 115
    :goto_0
    new-instance v1, La/il70;

    .line 116
    .line 117
    invoke-direct {v1, v0}, La/il70;-><init>(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v1}, La/ol70;->z(La/ll70;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, La/kl70;

    .line 124
    .line 125
    invoke-direct {v0, p1}, La/kl70;-><init>(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, La/ol70;->z(La/ll70;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final z(La/ll70;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/wk60;

    .line 6
    .line 7
    const/16 v2, 0x14

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/wk60;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/wk70;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-direct {v4, p0, p1, v2, v3}, La/wk70;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0xe

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 23
    .line 24
    .line 25
    return-void
.end method
