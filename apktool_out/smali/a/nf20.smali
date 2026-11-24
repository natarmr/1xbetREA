.class public final La/nf20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:La/q4f;

.field public k:D

.field public l:B

.field public final synthetic m:La/qg20;

.field public final synthetic n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

.field public final synthetic o:La/q4f;

.field public final synthetic p:La/ozc;

.field public final synthetic q:Z


# direct methods
.method public constructor <init>(La/qg20;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;La/ozc;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nf20;->m:La/qg20;

    .line 2
    .line 3
    iput-object p2, p0, La/nf20;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iput-object p3, p0, La/nf20;->o:La/q4f;

    .line 6
    .line 7
    iput-object p4, p0, La/nf20;->p:La/ozc;

    .line 8
    .line 9
    iput-boolean p5, p0, La/nf20;->q:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/nf20;

    .line 2
    .line 3
    iget-object v4, p0, La/nf20;->p:La/ozc;

    .line 4
    .line 5
    iget-boolean v5, p0, La/nf20;->q:Z

    .line 6
    .line 7
    iget-object v1, p0, La/nf20;->m:La/qg20;

    .line 8
    .line 9
    iget-object v2, p0, La/nf20;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 10
    .line 11
    iget-object v3, p0, La/nf20;->o:La/q4f;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/nf20;-><init>(La/qg20;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;La/ozc;ZLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/nf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/nf20;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/nf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v9, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v5, La/nf20;->l:B

    .line 6
    .line 7
    const/4 v10, 0x3

    .line 8
    const/4 v1, 0x2

    .line 9
    iget-object v11, v5, La/nf20;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 10
    .line 11
    const/4 v12, 0x1

    .line 12
    const/4 v13, 0x0

    .line 13
    iget-object v14, v5, La/nf20;->m:La/qg20;

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-eq v0, v12, :cond_2

    .line 18
    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    if-ne v0, v10, :cond_0

    .line 22
    .line 23
    iget-object v0, v5, La/nf20;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/hxu;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    move-object v15, v0

    .line 33
    move-object v6, v11

    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v13

    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    move-object/from16 v16, v11

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :cond_2
    iget-wide v2, v5, La/nf20;->k:D

    .line 52
    .line 53
    iget-object v0, v5, La/nf20;->j:La/q4f;

    .line 54
    .line 55
    iget-object v4, v5, La/nf20;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, La/kxu;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v6, p1

    .line 63
    .line 64
    :cond_3
    move-wide v7, v2

    .line 65
    move-object v3, v0

    .line 66
    move-object v0, v4

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v14, La/qg20;->P0:La/bby;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    iget-object v0, v14, La/qg20;->d:La/mne;

    .line 83
    .line 84
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 85
    .line 86
    sget-object v20, La/ig20;->a:La/ig20;

    .line 87
    .line 88
    new-instance v2, La/re20;

    .line 89
    .line 90
    invoke-direct {v2, v14, v13, v12}, La/re20;-><init>(La/qg20;La/yje;B)V

    .line 91
    .line 92
    .line 93
    const/16 v22, 0x20

    .line 94
    .line 95
    const-wide/16 v16, 0x1f4

    .line 96
    .line 97
    sget-object v18, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 98
    .line 99
    move-object/from16 v19, v0

    .line 100
    .line 101
    move-object/from16 v21, v2

    .line 102
    .line 103
    invoke-static/range {v15 .. v22}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, v14, La/qg20;->P0:La/bby;

    .line 108
    .line 109
    iget-object v4, v14, La/qg20;->A:La/kxu;

    .line 110
    .line 111
    iget-wide v2, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 112
    .line 113
    iput-object v4, v5, La/nf20;->i:Ljava/lang/Object;

    .line 114
    .line 115
    iget-object v0, v5, La/nf20;->o:La/q4f;

    .line 116
    .line 117
    iput-object v0, v5, La/nf20;->j:La/q4f;

    .line 118
    .line 119
    iput-wide v2, v5, La/nf20;->k:D

    .line 120
    .line 121
    iput-byte v12, v5, La/nf20;->l:B

    .line 122
    .line 123
    invoke-virtual {v14, v5}, La/qg20;->G(La/zje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-ne v6, v9, :cond_3

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :goto_0
    check-cast v6, La/ql5;

    .line 131
    .line 132
    move-object/from16 v16, v11

    .line 133
    .line 134
    iget-wide v10, v6, La/ql5;->e:J

    .line 135
    .line 136
    iput-object v13, v5, La/nf20;->i:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v13, v5, La/nf20;->j:La/q4f;

    .line 139
    .line 140
    iput-byte v1, v5, La/nf20;->l:B

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    move-wide v1, v7

    .line 144
    iget-object v7, v5, La/nf20;->p:La/ozc;

    .line 145
    .line 146
    move-object v8, v5

    .line 147
    move-wide v4, v10

    .line 148
    invoke-virtual/range {v0 .. v8}, La/kxu;->a(DLa/q4f;JLjava/lang/Double;La/ozc;La/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object v5, v8

    .line 153
    if-ne v0, v9, :cond_6

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    :goto_1
    move-object v4, v0

    .line 157
    check-cast v4, La/hxu;

    .line 158
    .line 159
    move-object/from16 v6, v16

    .line 160
    .line 161
    iget-wide v1, v6, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 162
    .line 163
    iput-object v4, v5, La/nf20;->i:Ljava/lang/Object;

    .line 164
    .line 165
    const/4 v15, 0x3

    .line 166
    iput-byte v15, v5, La/nf20;->l:B

    .line 167
    .line 168
    iget-object v3, v5, La/nf20;->o:La/q4f;

    .line 169
    .line 170
    move-object v0, v14

    .line 171
    invoke-virtual/range {v0 .. v5}, La/qg20;->w(DLa/q4f;La/hxu;La/zje;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    if-ne v1, v9, :cond_7

    .line 176
    .line 177
    :goto_2
    return-object v9

    .line 178
    :cond_7
    move-object v15, v4

    .line 179
    :goto_3
    check-cast v1, La/txu;

    .line 180
    .line 181
    iget-object v0, v14, La/qg20;->a0:La/pyu;

    .line 182
    .line 183
    iget-object v0, v0, La/pyu;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, La/ovo0;

    .line 186
    .line 187
    iget-boolean v0, v0, La/ovo0;->a:Z

    .line 188
    .line 189
    iget-object v2, v14, La/qg20;->e0:La/b8u;

    .line 190
    .line 191
    invoke-virtual {v2}, La/b8u;->b()La/duw;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    sget-object v3, La/duw;->d:La/duw;

    .line 196
    .line 197
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v0, :cond_9

    .line 202
    .line 203
    if-nez v2, :cond_8

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_8
    const/4 v12, 0x0

    .line 207
    :cond_9
    :goto_4
    iget-object v0, v14, La/qg20;->f1:La/p7m0;

    .line 208
    .line 209
    invoke-static {v12, v0, v13}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, v14, La/qg20;->g1:La/p7m0;

    .line 213
    .line 214
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v13, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    sget-object v0, La/hxu;->h:La/hxu;

    .line 223
    .line 224
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_a

    .line 229
    .line 230
    if-nez v12, :cond_a

    .line 231
    .line 232
    iget-object v0, v14, La/qg20;->c1:La/ol60;

    .line 233
    .line 234
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    return-object v1

    .line 240
    :cond_a
    iget-boolean v0, v5, La/nf20;->q:Z

    .line 241
    .line 242
    invoke-virtual {v14, v6, v1, v15, v0}, La/qg20;->f0(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/txu;La/hxu;Z)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v14, La/qg20;->w:La/hsj;

    .line 246
    .line 247
    invoke-virtual {v0}, La/hsj;->i()D

    .line 248
    .line 249
    .line 250
    move-result-wide v2

    .line 251
    invoke-virtual {v14, v2, v3}, La/qg20;->K(D)D

    .line 252
    .line 253
    .line 254
    move-result-wide v18

    .line 255
    iget-object v0, v5, La/nf20;->p:La/ozc;

    .line 256
    .line 257
    iget-object v2, v5, La/nf20;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 258
    .line 259
    iget-object v3, v5, La/nf20;->o:La/q4f;

    .line 260
    .line 261
    move-object/from16 v20, v0

    .line 262
    .line 263
    move-object/from16 v21, v1

    .line 264
    .line 265
    move-object/from16 v16, v2

    .line 266
    .line 267
    move-object/from16 v17, v3

    .line 268
    .line 269
    invoke-virtual/range {v14 .. v21}, La/qg20;->A(La/hxu;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;DLa/ozc;La/txu;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0
.end method
