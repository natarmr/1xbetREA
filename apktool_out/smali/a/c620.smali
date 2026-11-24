.class public final La/c620;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kxu;

.field public j:La/q4f;

.field public k:D

.field public l:B

.field public final synthetic m:La/h620;

.field public final synthetic n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

.field public final synthetic o:La/q4f;

.field public final synthetic p:Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;


# direct methods
.method public constructor <init>(La/h620;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c620;->m:La/h620;

    .line 2
    .line 3
    iput-object p2, p0, La/c620;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iput-object p3, p0, La/c620;->o:La/q4f;

    .line 6
    .line 7
    iput-object p4, p0, La/c620;->p:Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/c620;

    .line 2
    .line 3
    iget-object v3, p0, La/c620;->o:La/q4f;

    .line 4
    .line 5
    iget-object v4, p0, La/c620;->p:Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 6
    .line 7
    iget-object v1, p0, La/c620;->m:La/h620;

    .line 8
    .line 9
    iget-object v2, p0, La/c620;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/c620;-><init>(La/h620;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;La/yje;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, La/c620;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c620;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v9, v8, La/c620;->n:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iget-object v10, v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v11, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v0, v8, La/c620;->l:B

    .line 10
    .line 11
    iget-object v12, v8, La/c620;->p:Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 12
    .line 13
    iget-object v13, v8, La/c620;->o:La/q4f;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    iget-object v14, v8, La/c620;->m:La/h620;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_1
    iget-wide v4, v8, La/c620;->k:D

    .line 40
    .line 41
    iget-object v0, v8, La/c620;->j:La/q4f;

    .line 42
    .line 43
    iget-object v2, v8, La/c620;->i:La/kxu;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-wide v5, v4

    .line 49
    move-object v4, v2

    .line 50
    move-object/from16 v2, p1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v14, La/h620;->Z:La/bby;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    sget-object v20, La/g620;->a:La/g620;

    .line 68
    .line 69
    new-instance v0, La/a620;

    .line 70
    .line 71
    invoke-direct {v0, v14, v3, v1}, La/a620;-><init>(La/h620;La/yje;B)V

    .line 72
    .line 73
    .line 74
    const/16 v22, 0x24

    .line 75
    .line 76
    const-wide/16 v16, 0x1f4

    .line 77
    .line 78
    sget-object v18, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 79
    .line 80
    const/16 v19, 0x0

    .line 81
    .line 82
    move-object/from16 v21, v0

    .line 83
    .line 84
    invoke-static/range {v15 .. v22}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, v14, La/h620;->Z:La/bby;

    .line 89
    .line 90
    iget-object v0, v14, La/h620;->k:La/kxu;

    .line 91
    .line 92
    iget-wide v4, v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 93
    .line 94
    iput-object v0, v8, La/c620;->i:La/kxu;

    .line 95
    .line 96
    iput-object v13, v8, La/c620;->j:La/q4f;

    .line 97
    .line 98
    iput-wide v4, v8, La/c620;->k:D

    .line 99
    .line 100
    iput-byte v2, v8, La/c620;->l:B

    .line 101
    .line 102
    invoke-virtual {v14, v8}, La/h620;->z(La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-ne v2, v11, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move-wide v5, v4

    .line 110
    move-object v4, v0

    .line 111
    move-object v0, v13

    .line 112
    :goto_0
    check-cast v2, La/ql5;

    .line 113
    .line 114
    iget-wide v1, v2, La/ql5;->e:J

    .line 115
    .line 116
    iget-object v15, v12, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 117
    .line 118
    move-object/from16 p1, v4

    .line 119
    .line 120
    invoke-virtual {v15}, Ljava/math/BigDecimal;->doubleValue()D

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    move-wide/from16 v17, v1

    .line 125
    .line 126
    move-wide v1, v5

    .line 127
    new-instance v6, Ljava/lang/Double;

    .line 128
    .line 129
    invoke-direct {v6, v3, v4}, Ljava/lang/Double;-><init>(D)V

    .line 130
    .line 131
    .line 132
    const/4 v3, 0x2

    .line 133
    sget-object v7, La/ozc;->d:La/ozc;

    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    iput-object v4, v8, La/c620;->i:La/kxu;

    .line 137
    .line 138
    iput-object v4, v8, La/c620;->j:La/q4f;

    .line 139
    .line 140
    iput-byte v3, v8, La/c620;->l:B

    .line 141
    .line 142
    move-object v3, v0

    .line 143
    move-wide/from16 v4, v17

    .line 144
    .line 145
    move-object/from16 v0, p1

    .line 146
    .line 147
    invoke-virtual/range {v0 .. v8}, La/kxu;->a(DLa/q4f;JLjava/lang/Double;La/ozc;La/zje;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-ne v0, v11, :cond_5

    .line 152
    .line 153
    :goto_1
    return-object v11

    .line 154
    :cond_5
    :goto_2
    check-cast v0, La/hxu;

    .line 155
    .line 156
    iget-object v1, v0, La/hxu;->d:La/ivo0;

    .line 157
    .line 158
    iget-wide v1, v1, La/ivo0;->b:D

    .line 159
    .line 160
    const-wide/16 v3, 0x0

    .line 161
    .line 162
    cmpl-double v1, v1, v3

    .line 163
    .line 164
    if-gtz v1, :cond_8

    .line 165
    .line 166
    iget-object v1, v0, La/hxu;->a:La/ivo0;

    .line 167
    .line 168
    iget-wide v1, v1, La/ivo0;->b:D

    .line 169
    .line 170
    cmpl-double v1, v1, v3

    .line 171
    .line 172
    if-lez v1, :cond_6

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    iget-object v1, v14, La/h620;->e0:La/nwo0;

    .line 176
    .line 177
    iget-boolean v1, v1, La/nwo0;->a:Z

    .line 178
    .line 179
    if-eqz v1, :cond_7

    .line 180
    .line 181
    sget-object v1, La/xvo0;->a:La/xvo0;

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    sget-object v1, La/awo0;->a:La/awo0;

    .line 185
    .line 186
    :goto_3
    invoke-virtual {v14, v1}, La/h620;->E(La/hwo0;)V

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_8
    :goto_4
    new-instance v1, La/ewo0;

    .line 191
    .line 192
    new-instance v2, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    new-instance v15, La/bnk0;

    .line 198
    .line 199
    invoke-direct {v15}, La/bnk0;-><init>()V

    .line 200
    .line 201
    .line 202
    iget-wide v5, v0, La/hxu;->g:D

    .line 203
    .line 204
    cmpl-double v7, v5, v3

    .line 205
    .line 206
    if-lez v7, :cond_9

    .line 207
    .line 208
    sget v3, La/cy7;->a:I

    .line 209
    .line 210
    sget-object v3, La/pn40;->a:La/pn40;

    .line 211
    .line 212
    invoke-static {v10, v5, v6}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v3}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v16

    .line 220
    const/16 v20, 0x0

    .line 221
    .line 222
    const/16 v21, 0x36

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const v18, 0x7f0606c1

    .line 227
    .line 228
    .line 229
    const/16 v19, 0x0

    .line 230
    .line 231
    invoke-static/range {v15 .. v21}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_9
    cmpg-double v3, v5, v3

    .line 236
    .line 237
    if-gez v3, :cond_a

    .line 238
    .line 239
    sget v3, La/cy7;->a:I

    .line 240
    .line 241
    sget-object v3, La/pn40;->a:La/pn40;

    .line 242
    .line 243
    invoke-static {v10, v5, v6}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-static {v3}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v16

    .line 251
    const/16 v20, 0x0

    .line 252
    .line 253
    const/16 v21, 0x3e

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    const/16 v18, 0x0

    .line 258
    .line 259
    const/16 v19, 0x0

    .line 260
    .line 261
    invoke-static/range {v15 .. v21}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 262
    .line 263
    .line 264
    :cond_a
    :goto_5
    iget-object v3, v15, La/bnk0;->a:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-static {v2, v3, v2}, La/w6x;->l(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)La/ank0;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v0, v10}, La/rsm0;->q(La/hxu;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-direct {v1, v2, v3}, La/ewo0;-><init>(La/ank0;Ljava/util/ArrayList;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v14, v1}, La/h620;->E(La/hwo0;)V

    .line 278
    .line 279
    .line 280
    :goto_6
    invoke-virtual {v14, v9, v12, v0, v13}, La/h620;->x(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;La/hxu;La/q4f;)V

    .line 281
    .line 282
    .line 283
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object v0
.end method
