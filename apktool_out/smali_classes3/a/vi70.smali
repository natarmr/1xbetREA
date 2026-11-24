.class public final La/vi70;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/fq;

.field public final c:La/mne;

.field public final d:La/l1u;

.field public final e:La/v8u;

.field public final f:La/k1u;

.field public final g:La/spx;

.field public final h:La/lzt;

.field public final i:La/xcc;

.field public final j:La/lg60;

.field public final k:La/t0u;

.field public final l:La/q99;


# direct methods
.method public constructor <init>(La/i1w0;La/fq;La/mne;La/qa60;La/l1u;La/v8u;La/k1u;La/spx;La/lzt;La/xcc;La/lg60;La/tbu;La/t0u;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, La/w46;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, La/vi70;->b:La/fq;

    .line 41
    .line 42
    iput-object p3, p0, La/vi70;->c:La/mne;

    .line 43
    .line 44
    move-object/from16 p1, p5

    .line 45
    .line 46
    iput-object p1, p0, La/vi70;->d:La/l1u;

    .line 47
    .line 48
    move-object/from16 p1, p6

    .line 49
    .line 50
    iput-object p1, p0, La/vi70;->e:La/v8u;

    .line 51
    .line 52
    move-object/from16 p1, p7

    .line 53
    .line 54
    iput-object p1, p0, La/vi70;->f:La/k1u;

    .line 55
    .line 56
    move-object/from16 p1, p8

    .line 57
    .line 58
    iput-object p1, p0, La/vi70;->g:La/spx;

    .line 59
    .line 60
    move-object/from16 p1, p9

    .line 61
    .line 62
    iput-object p1, p0, La/vi70;->h:La/lzt;

    .line 63
    .line 64
    move-object/from16 p1, p10

    .line 65
    .line 66
    iput-object p1, p0, La/vi70;->i:La/xcc;

    .line 67
    .line 68
    move-object/from16 p1, p11

    .line 69
    .line 70
    iput-object p1, p0, La/vi70;->j:La/lg60;

    .line 71
    .line 72
    move-object/from16 p1, p13

    .line 73
    .line 74
    iput-object p1, p0, La/vi70;->k:La/t0u;

    .line 75
    .line 76
    const/4 p1, 0x7

    .line 77
    const/4 v0, 0x0

    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-static {v0, v1, v1, p1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, La/vi70;->l:La/q99;

    .line 84
    .line 85
    new-instance p1, La/pi70;

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    invoke-direct {p1, v2}, La/pi70;-><init>(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, La/vi70;->x(La/si70;)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, La/gxo;->values()[La/gxo;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    array-length v3, p1

    .line 99
    :goto_0
    const/4 v4, 0x3

    .line 100
    if-ge v0, v3, :cond_0

    .line 101
    .line 102
    aget-object v5, p1, v0

    .line 103
    .line 104
    iget-object v6, p0, La/vi70;->e:La/v8u;

    .line 105
    .line 106
    invoke-virtual {v6, v5}, La/v8u;->a(La/gxo;)D

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    new-instance v9, La/ui70;

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v11, 0x0

    .line 118
    move-object/from16 p6, p0

    .line 119
    .line 120
    move-object/from16 p7, v5

    .line 121
    .line 122
    move-wide/from16 p8, v6

    .line 123
    .line 124
    move-object/from16 p5, v9

    .line 125
    .line 126
    move-object/from16 p10, v10

    .line 127
    .line 128
    move/from16 p11, v11

    .line 129
    .line 130
    invoke-direct/range {p5 .. p11}, La/ui70;-><init>(La/w46;La/gxo;DLa/yje;B)V

    .line 131
    .line 132
    .line 133
    move-object/from16 v5, p5

    .line 134
    .line 135
    invoke-static {v8, v1, v1, v5, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v0, v0, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual/range {p4 .. p4}, La/qa60;->a()La/vae0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v0, La/hi70;

    .line 146
    .line 147
    const/4 v3, 0x4

    .line 148
    const/4 v5, 0x1

    .line 149
    const/4 v6, 0x2

    .line 150
    const-class v7, La/vi70;

    .line 151
    .line 152
    const-string v8, "handleCommand"

    .line 153
    .line 154
    const-string v9, "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V"

    .line 155
    .line 156
    move-object/from16 p4, p0

    .line 157
    .line 158
    move-object p2, v0

    .line 159
    move/from16 p8, v3

    .line 160
    .line 161
    move/from16 p9, v5

    .line 162
    .line 163
    move p3, v6

    .line 164
    move-object/from16 p5, v7

    .line 165
    .line 166
    move-object/from16 p6, v8

    .line 167
    .line 168
    move-object/from16 p7, v9

    .line 169
    .line 170
    invoke-direct/range {p2 .. p9}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 171
    .line 172
    .line 173
    move-object v3, p2

    .line 174
    new-instance v5, La/fnq;

    .line 175
    .line 176
    const/4 v6, 0x4

    .line 177
    invoke-direct {v5, p1, v3, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 178
    .line 179
    .line 180
    new-instance p1, La/ib60;

    .line 181
    .line 182
    invoke-direct {p1, p0, v1, v4}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 183
    .line 184
    .line 185
    new-instance v1, La/dnq;

    .line 186
    .line 187
    invoke-direct {v1, v5, p1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 188
    .line 189
    .line 190
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {v1, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 195
    .line 196
    .line 197
    return-void
.end method


# virtual methods
.method public final w(La/gxo;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/vi70;->g:La/spx;

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
    iget-object v0, p0, La/vi70;->h:La/lzt;

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
    iget-object v0, p0, La/vi70;->e:La/v8u;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    iget-object v3, p0, La/vi70;->d:La/l1u;

    .line 25
    .line 26
    invoke-virtual {v3}, La/l1u;->a()D

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    iget-object v6, p0, La/vi70;->f:La/k1u;

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
    if-gtz v6, :cond_1

    .line 39
    .line 40
    cmpg-double v1, v4, v1

    .line 41
    .line 42
    if-gtz v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, La/vi70;->j:La/lg60;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-virtual {v1, v2, v3}, La/lg60;->a(D)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object p1, p0, La/vi70;->c:La/mne;

    .line 58
    .line 59
    iget-object v7, p1, La/mne;->a:La/rwj;

    .line 60
    .line 61
    sget-object v5, La/ti70;->a:La/ti70;

    .line 62
    .line 63
    new-instance v8, La/ku60;

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    const/16 v0, 0x17

    .line 67
    .line 68
    sget-object v1, La/fy5;->a:La/fy5;

    .line 69
    .line 70
    invoke-direct {v8, p0, v1, p1, v0}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    const/16 v9, 0xa

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    invoke-virtual {v0, p1}, La/v8u;->a(La/gxo;)D

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    invoke-virtual {v3}, La/l1u;->a()D

    .line 85
    .line 86
    .line 87
    move-result-wide v2

    .line 88
    cmpg-double p1, v0, v2

    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    if-gez p1, :cond_2

    .line 92
    .line 93
    move p1, v0

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    const/4 p1, 0x0

    .line 96
    :goto_0
    new-instance v1, La/pi70;

    .line 97
    .line 98
    invoke-direct {v1, v0}, La/pi70;-><init>(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1}, La/vi70;->x(La/si70;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, La/ri70;

    .line 105
    .line 106
    invoke-direct {v0, p1}, La/ri70;-><init>(Z)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, La/vi70;->x(La/si70;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final x(La/si70;)V
    .locals 4

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/ku60;

    .line 6
    .line 7
    const/16 v2, 0x18

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v3, v2}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method
