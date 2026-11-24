.class public final La/q3t;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/zju;

.field public final c:La/v4u;

.field public final d:La/gni0;

.field public final e:La/t0u;

.field public final f:La/pyb;

.field public final g:La/l1u;

.field public final h:La/k1u;

.field public final i:La/nqt;

.field public final j:La/fq;

.field public final k:La/v8u;

.field public final l:La/mne;

.field public final m:La/xcc;

.field public final n:La/q99;


# direct methods
.method public constructor <init>(La/i1w0;La/zju;La/v4u;La/gni0;La/t0u;La/pyb;La/l1u;La/k1u;La/qa60;La/nqt;La/fq;La/v8u;La/mne;La/xcc;)V
    .locals 6

    .line 1
    move-object/from16 v0, p13

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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, La/w46;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, La/q3t;->b:La/zju;

    .line 46
    .line 47
    iput-object p3, p0, La/q3t;->c:La/v4u;

    .line 48
    .line 49
    iput-object p4, p0, La/q3t;->d:La/gni0;

    .line 50
    .line 51
    iput-object p5, p0, La/q3t;->e:La/t0u;

    .line 52
    .line 53
    iput-object p6, p0, La/q3t;->f:La/pyb;

    .line 54
    .line 55
    iput-object p7, p0, La/q3t;->g:La/l1u;

    .line 56
    .line 57
    iput-object p8, p0, La/q3t;->h:La/k1u;

    .line 58
    .line 59
    move-object/from16 p1, p10

    .line 60
    .line 61
    iput-object p1, p0, La/q3t;->i:La/nqt;

    .line 62
    .line 63
    move-object/from16 p1, p11

    .line 64
    .line 65
    iput-object p1, p0, La/q3t;->j:La/fq;

    .line 66
    .line 67
    move-object/from16 p1, p12

    .line 68
    .line 69
    iput-object p1, p0, La/q3t;->k:La/v8u;

    .line 70
    .line 71
    iput-object v0, p0, La/q3t;->l:La/mne;

    .line 72
    .line 73
    move-object/from16 p1, p14

    .line 74
    .line 75
    iput-object p1, p0, La/q3t;->m:La/xcc;

    .line 76
    .line 77
    const/4 p1, 0x7

    .line 78
    const/4 p2, 0x0

    .line 79
    const/4 p3, 0x0

    .line 80
    invoke-static {p2, p3, p3, p1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, La/q3t;->n:La/q99;

    .line 85
    .line 86
    invoke-virtual {p9}, La/qa60;->a()La/vae0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance p4, La/ens;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    const/4 v2, 0x2

    .line 94
    const-class v3, La/q3t;

    .line 95
    .line 96
    const-string v4, "handleCommand"

    .line 97
    .line 98
    const-string v5, "handleCommand(Lorg/xplatform/core/domain/GameCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 99
    .line 100
    move-object p6, p0

    .line 101
    move/from16 p10, p2

    .line 102
    .line 103
    move/from16 p11, v1

    .line 104
    .line 105
    move p5, v2

    .line 106
    move-object p7, v3

    .line 107
    move-object p8, v4

    .line 108
    move-object p9, v5

    .line 109
    invoke-direct/range {p4 .. p11}, La/ens;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 110
    .line 111
    .line 112
    move-object p2, p7

    .line 113
    new-instance v1, La/fnq;

    .line 114
    .line 115
    const/4 v2, 0x4

    .line 116
    invoke-direct {v1, p1, p4, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 117
    .line 118
    .line 119
    new-instance p1, La/lo3;

    .line 120
    .line 121
    const/4 p4, 0x3

    .line 122
    const/16 v2, 0x15

    .line 123
    .line 124
    invoke-direct {p1, p4, p3, v2}, La/lo3;-><init>(ILa/yje;B)V

    .line 125
    .line 126
    .line 127
    new-instance p4, La/dnq;

    .line 128
    .line 129
    const/4 v2, 0x1

    .line 130
    invoke-direct {p4, v1, p1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-static {p4, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 138
    .line 139
    .line 140
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance p4, La/h2s;

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    const/16 v2, 0x17

    .line 148
    .line 149
    const/4 v3, 0x1

    .line 150
    const-string v4, "handleGameError"

    .line 151
    .line 152
    const-string v5, "handleGameError(Ljava/lang/Throwable;)V"

    .line 153
    .line 154
    move-object p7, p0

    .line 155
    move-object p8, p2

    .line 156
    move-object p5, p4

    .line 157
    move/from16 p11, v1

    .line 158
    .line 159
    move/from16 p12, v2

    .line 160
    .line 161
    move p6, v3

    .line 162
    move-object p9, v4

    .line 163
    move-object/from16 p10, v5

    .line 164
    .line 165
    invoke-direct/range {p5 .. p12}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 169
    .line 170
    new-instance v1, La/cbq;

    .line 171
    .line 172
    const/16 v2, 0x13

    .line 173
    .line 174
    invoke-direct {v1, p0, p3, v2}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    const/16 p0, 0xa

    .line 178
    .line 179
    const/4 p2, 0x0

    .line 180
    move/from16 p10, p0

    .line 181
    .line 182
    move-object p5, p1

    .line 183
    move-object p7, p2

    .line 184
    move-object p6, p4

    .line 185
    move-object p8, v0

    .line 186
    move-object p9, v1

    .line 187
    invoke-static/range {p5 .. p10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 188
    .line 189
    .line 190
    return-void
.end method


# virtual methods
.method public final A(La/gxo;ZLjava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, La/i3t;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, La/i3t;-><init>(La/gxo;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/q3t;->C(La/l3t;)V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p2, p0, La/q3t;->c:La/v4u;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, La/v4u;->a(La/gxo;)D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p3}, La/msm0;->j(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    :goto_0
    iget-object p3, p0, La/q3t;->g:La/l1u;

    .line 41
    .line 42
    invoke-virtual {p3}, La/l1u;->a()D

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iget-object p3, p0, La/q3t;->h:La/k1u;

    .line 47
    .line 48
    invoke-virtual {p3}, La/k1u;->a()D

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    cmpl-double p3, v0, v4

    .line 53
    .line 54
    if-lez p3, :cond_3

    .line 55
    .line 56
    move-wide v0, v4

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    cmpg-double p3, v0, v2

    .line 59
    .line 60
    if-gez p3, :cond_4

    .line 61
    .line 62
    invoke-virtual {p2, p1}, La/v4u;->a(La/gxo;)D

    .line 63
    .line 64
    .line 65
    move-result-wide p2

    .line 66
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->max(DD)D

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    :cond_4
    :goto_1
    new-instance p2, La/c3t;

    .line 71
    .line 72
    invoke-direct {p2, p1, v0, v1}, La/c3t;-><init>(La/gxo;D)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p2}, La/q3t;->C(La/l3t;)V

    .line 76
    .line 77
    .line 78
    new-instance p2, La/lle;

    .line 79
    .line 80
    invoke-direct {p2, p1, v0, v1}, La/lle;-><init>(La/gxo;D)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object p1, p0, La/q3t;->l:La/mne;

    .line 88
    .line 89
    iget-object v5, p1, La/mne;->a:La/rwj;

    .line 90
    .line 91
    sget-object v3, La/m3t;->a:La/m3t;

    .line 92
    .line 93
    new-instance v6, La/cbq;

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    const/16 p3, 0x11

    .line 97
    .line 98
    invoke-direct {v6, p0, p2, p1, p3}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 99
    .line 100
    .line 101
    const/16 v7, 0xa

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 105
    .line 106
    .line 107
    new-instance p1, La/e3t;

    .line 108
    .line 109
    invoke-virtual {p0}, La/q3t;->x()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-direct {p1, p2}, La/e3t;-><init>(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1}, La/q3t;->C(La/l3t;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final B(La/gxo;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/q3t;->c:La/v4u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/v4u;->a(La/gxo;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p2}, La/msm0;->j(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    :goto_0
    new-instance p2, La/lle;

    .line 30
    .line 31
    invoke-direct {p2, p1, v0, v1}, La/lle;-><init>(La/gxo;D)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object p1, p0, La/q3t;->l:La/mne;

    .line 39
    .line 40
    iget-object v5, p1, La/mne;->a:La/rwj;

    .line 41
    .line 42
    sget-object v3, La/m3t;->a:La/m3t;

    .line 43
    .line 44
    new-instance v6, La/cbq;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    const/16 v0, 0x11

    .line 48
    .line 49
    invoke-direct {v6, p0, p2, p1, v0}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    const/16 v7, 0xa

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final C(La/l3t;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/vls;

    .line 6
    .line 7
    const/16 v2, 0x9

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/vls;-><init>(B)V

    .line 10
    .line 11
    .line 12
    new-instance v4, La/cbq;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/16 v3, 0x15

    .line 16
    .line 17
    invoke-direct {v4, p0, p1, v2, v3}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 18
    .line 19
    .line 20
    const/16 v5, 0xe

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final w(La/w05;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/q3t;->l:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 8
    .line 9
    sget-object v1, La/n3t;->a:La/n3t;

    .line 10
    .line 11
    new-instance v4, La/cbq;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/16 v5, 0x12

    .line 15
    .line 16
    invoke-direct {v4, p0, p1, v2, v5}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0xa

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final x()Z
    .locals 10

    .line 1
    invoke-static {}, La/gxo;->values()[La/gxo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_1

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    iget-object v5, p0, La/q3t;->k:La/v8u;

    .line 13
    .line 14
    invoke-virtual {v5, v4}, La/v8u;->a(La/gxo;)D

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    iget-object v6, p0, La/q3t;->g:La/l1u;

    .line 19
    .line 20
    invoke-virtual {v6}, La/l1u;->a()D

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    iget-object v8, p0, La/q3t;->h:La/k1u;

    .line 25
    .line 26
    invoke-virtual {v8}, La/k1u;->a()D

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    cmpg-double v8, v4, v8

    .line 31
    .line 32
    if-gtz v8, :cond_0

    .line 33
    .line 34
    cmpg-double v4, v6, v4

    .line 35
    .line 36
    if-gtz v4, :cond_0

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return v2

    .line 42
    :cond_1
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method public final y(La/zy5;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/o3t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/o3t;

    .line 7
    .line 8
    iget v1, v0, La/o3t;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/o3t;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/o3t;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/o3t;-><init>(La/q3t;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/o3t;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/o3t;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    instance-of p2, p1, La/lle;

    .line 54
    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    check-cast p1, La/lle;

    .line 58
    .line 59
    iget-object p2, p1, La/lle;->a:La/gxo;

    .line 60
    .line 61
    iget-wide v0, p1, La/lle;->b:D

    .line 62
    .line 63
    new-instance p1, La/c3t;

    .line 64
    .line 65
    iget-object v2, p0, La/q3t;->c:La/v4u;

    .line 66
    .line 67
    invoke-virtual {v2, p2}, La/v4u;->a(La/gxo;)D

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-direct {p1, p2, v0, v1}, La/c3t;-><init>(La/gxo;D)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/q3t;->C(La/l3t;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    instance-of p2, p1, La/yy5;

    .line 83
    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    sget-object p1, La/h3t;->a:La/h3t;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, La/q3t;->C(La/l3t;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    instance-of p1, p1, La/ple;

    .line 93
    .line 94
    if-eqz p1, :cond_7

    .line 95
    .line 96
    iput v3, v0, La/o3t;->k:I

    .line 97
    .line 98
    iget-object p1, p0, La/q3t;->e:La/t0u;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-ne p2, v1, :cond_6

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_6
    :goto_1
    move-object v5, p2

    .line 108
    check-cast v5, Ljava/lang/String;

    .line 109
    .line 110
    new-instance v0, La/d3t;

    .line 111
    .line 112
    iget-object p1, p0, La/q3t;->g:La/l1u;

    .line 113
    .line 114
    invoke-virtual {p1}, La/l1u;->a()D

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    iget-object p1, p0, La/q3t;->h:La/k1u;

    .line 119
    .line 120
    invoke-virtual {p1}, La/k1u;->a()D

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    invoke-direct/range {v0 .. v5}, La/d3t;-><init>(DDLjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0}, La/q3t;->C(La/l3t;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, La/e3t;

    .line 131
    .line 132
    invoke-virtual {p0}, La/q3t;->x()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    invoke-direct {p1, p2}, La/e3t;-><init>(Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, p1}, La/q3t;->C(La/l3t;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, La/b3t;

    .line 143
    .line 144
    invoke-direct {p1, v5}, La/b3t;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p1}, La/q3t;->C(La/l3t;)V

    .line 148
    .line 149
    .line 150
    sget-object p1, La/gxo;->a:La/gxo;

    .line 151
    .line 152
    invoke-virtual {p0, p1}, La/q3t;->z(La/gxo;)V

    .line 153
    .line 154
    .line 155
    sget-object p1, La/gxo;->b:La/gxo;

    .line 156
    .line 157
    invoke-virtual {p0, p1}, La/q3t;->z(La/gxo;)V

    .line 158
    .line 159
    .line 160
    sget-object p1, La/gxo;->c:La/gxo;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, La/q3t;->z(La/gxo;)V

    .line 163
    .line 164
    .line 165
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0
.end method

.method public final z(La/gxo;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/q3t;->k:La/v8u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    new-instance v2, La/j3t;

    .line 8
    .line 9
    iget-object v3, p0, La/q3t;->g:La/l1u;

    .line 10
    .line 11
    invoke-virtual {v3}, La/l1u;->a()D

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    iget-object v5, p0, La/q3t;->h:La/k1u;

    .line 16
    .line 17
    invoke-virtual {v5}, La/k1u;->a()D

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    cmpg-double v5, v0, v5

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-gtz v5, :cond_0

    .line 25
    .line 26
    cmpg-double v3, v3, v0

    .line 27
    .line 28
    if-gtz v3, :cond_0

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    :cond_0
    invoke-direct {v2, p1, v6}, La/j3t;-><init>(La/gxo;Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, La/q3t;->C(La/l3t;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, La/c3t;

    .line 38
    .line 39
    iget-object v3, p0, La/q3t;->c:La/v4u;

    .line 40
    .line 41
    invoke-virtual {v3, p1}, La/v4u;->a(La/gxo;)D

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-direct {v2, p1, v0, v1}, La/c3t;-><init>(La/gxo;D)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2}, La/q3t;->C(La/l3t;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
