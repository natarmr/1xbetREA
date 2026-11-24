.class public final La/cy4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public i:Z

.field public synthetic j:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

.field public synthetic k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

.field public synthetic l:La/cit0;

.field public synthetic m:Z

.field public final synthetic n:La/fy4;


# direct methods
.method public constructor <init>(La/fy4;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cy4;->n:La/fy4;

    .line 2
    .line 3
    const/4 p1, 0x5

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 2
    .line 3
    check-cast p2, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    check-cast p3, La/cit0;

    .line 6
    .line 7
    check-cast p4, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    check-cast p5, La/yje;

    .line 14
    .line 15
    new-instance v0, La/cy4;

    .line 16
    .line 17
    iget-object p0, p0, La/cy4;->n:La/fy4;

    .line 18
    .line 19
    invoke-direct {v0, p0, p5}, La/cy4;-><init>(La/fy4;La/yje;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, La/cy4;->j:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 23
    .line 24
    iput-object p2, v0, La/cy4;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 25
    .line 26
    iput-object p3, v0, La/cy4;->l:La/cit0;

    .line 27
    .line 28
    iput-boolean p4, v0, La/cy4;->m:Z

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/cy4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/cy4;->n:La/fy4;

    .line 4
    .line 5
    iget-object v7, v1, La/fy4;->g0:La/p7m0;

    .line 6
    .line 7
    iget-object v2, v1, La/fy4;->h0:La/p7m0;

    .line 8
    .line 9
    iget-object v3, v1, La/fy4;->W:La/nwo0;

    .line 10
    .line 11
    iget-object v4, v1, La/fy4;->z:La/vzg0;

    .line 12
    .line 13
    iget-object v8, v0, La/cy4;->j:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 14
    .line 15
    iget-object v5, v0, La/cy4;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 16
    .line 17
    iget-object v6, v0, La/cy4;->l:La/cit0;

    .line 18
    .line 19
    iget-boolean v9, v0, La/cy4;->m:Z

    .line 20
    .line 21
    sget-object v10, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v11, v0, La/cy4;->i:Z

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x1

    .line 27
    if-eqz v11, :cond_1

    .line 28
    .line 29
    if-ne v11, v13, :cond_0

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move v0, v9

    .line 35
    move-object v9, v5

    .line 36
    move v5, v0

    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    move-object/from16 v32, v2

    .line 40
    .line 41
    move-object/from16 v31, v7

    .line 42
    .line 43
    move v2, v13

    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v12

    .line 52
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 v14, 0x1

    .line 56
    const/16 v15, 0xff

    .line 57
    .line 58
    move v11, v9

    .line 59
    const/4 v9, 0x0

    .line 60
    move-object/from16 v16, v10

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    move/from16 v17, v11

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    move-object/from16 v18, v12

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    move/from16 v19, v13

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    move-object/from16 v32, v2

    .line 73
    .line 74
    move-object/from16 v20, v5

    .line 75
    .line 76
    move-object/from16 v31, v7

    .line 77
    .line 78
    move-object/from16 v7, v16

    .line 79
    .line 80
    move/from16 v5, v17

    .line 81
    .line 82
    move/from16 v2, v19

    .line 83
    .line 84
    invoke-static/range {v8 .. v15}, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    const-string v10, "SAVED_STATE_COEF_KEY"

    .line 89
    .line 90
    invoke-virtual {v4, v10, v9}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/16 v29, 0x0

    .line 94
    .line 95
    const v30, 0x1bfff

    .line 96
    .line 97
    .line 98
    const-wide/16 v10, 0x0

    .line 99
    .line 100
    const-wide/16 v12, 0x0

    .line 101
    .line 102
    const-wide/16 v14, 0x0

    .line 103
    .line 104
    const-wide/16 v16, 0x0

    .line 105
    .line 106
    const-wide/16 v18, 0x0

    .line 107
    .line 108
    move-object/from16 v9, v20

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    const/16 v23, 0x0

    .line 117
    .line 118
    const/16 v24, 0x0

    .line 119
    .line 120
    const/16 v25, 0x0

    .line 121
    .line 122
    const/16 v26, 0x0

    .line 123
    .line 124
    const/16 v27, 0x1

    .line 125
    .line 126
    const/16 v28, 0x0

    .line 127
    .line 128
    invoke-static/range {v9 .. v30}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    const-string v11, "SAVED_STATE_BET_SUM_KEY"

    .line 133
    .line 134
    invoke-virtual {v4, v11, v10}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v4, v1, La/fy4;->S:La/bby;

    .line 138
    .line 139
    if-eqz v4, :cond_2

    .line 140
    .line 141
    new-instance v10, Ljava/util/concurrent/CancellationException;

    .line 142
    .line 143
    const-string v11, "New config"

    .line 144
    .line 145
    invoke-direct {v10, v11}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v4, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    iget-object v4, v1, La/fy4;->r:La/m1e;

    .line 152
    .line 153
    invoke-interface {v4}, La/m1e;->b()La/gmq;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iput-object v8, v0, La/cy4;->j:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 158
    .line 159
    iput-object v9, v0, La/cy4;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 160
    .line 161
    iput-object v6, v0, La/cy4;->l:La/cit0;

    .line 162
    .line 163
    iput-boolean v5, v0, La/cy4;->m:Z

    .line 164
    .line 165
    iput-boolean v2, v0, La/cy4;->i:Z

    .line 166
    .line 167
    invoke-static {v4, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-ne v0, v7, :cond_3

    .line 172
    .line 173
    return-object v7

    .line 174
    :cond_3
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_4

    .line 181
    .line 182
    iget-boolean v0, v3, La/nwo0;->a:Z

    .line 183
    .line 184
    if-eqz v0, :cond_4

    .line 185
    .line 186
    sget-object v0, La/bwo0;->a:La/bwo0;

    .line 187
    .line 188
    invoke-virtual {v1, v0}, La/fy4;->H(La/gwo0;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, La/fy4;->y()La/qnb0;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-object/from16 v4, v32

    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    invoke-virtual {v4, v7, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto/16 :goto_2

    .line 205
    .line 206
    :cond_4
    move-object/from16 v4, v32

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    invoke-static {v9, v8}, La/fy4;->B(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_6

    .line 214
    .line 215
    iget-boolean v0, v3, La/nwo0;->a:Z

    .line 216
    .line 217
    if-nez v0, :cond_5

    .line 218
    .line 219
    iget-boolean v0, v3, La/nwo0;->b:Z

    .line 220
    .line 221
    if-eqz v0, :cond_6

    .line 222
    .line 223
    invoke-virtual/range {v31 .. v31}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_6

    .line 234
    .line 235
    :cond_5
    if-eqz v5, :cond_6

    .line 236
    .line 237
    iget-wide v4, v6, La/cit0;->N:D

    .line 238
    .line 239
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    iget-object v0, v1, La/fy4;->g:La/mne;

    .line 244
    .line 245
    iget-object v14, v0, La/mne;->b:La/dvj;

    .line 246
    .line 247
    new-instance v15, La/sx4;

    .line 248
    .line 249
    const/4 v0, 0x2

    .line 250
    invoke-direct {v15, v1, v0}, La/sx4;-><init>(La/fy4;B)V

    .line 251
    .line 252
    .line 253
    new-instance v0, La/ay4;

    .line 254
    .line 255
    const/4 v6, 0x0

    .line 256
    move-object v2, v8

    .line 257
    move-object v3, v9

    .line 258
    invoke-direct/range {v0 .. v6}, La/ay4;-><init>(La/fy4;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/yje;)V

    .line 259
    .line 260
    .line 261
    const/16 v17, 0x20

    .line 262
    .line 263
    const-wide/16 v11, 0x1f4

    .line 264
    .line 265
    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 266
    .line 267
    move-object/from16 v16, v0

    .line 268
    .line 269
    invoke-static/range {v10 .. v17}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iput-object v0, v1, La/fy4;->S:La/bby;

    .line 274
    .line 275
    iget-object v0, v1, La/fy4;->x:La/pyu;

    .line 276
    .line 277
    iget-object v0, v0, La/pyu;->a:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, La/ovo0;

    .line 280
    .line 281
    iget-boolean v0, v0, La/ovo0;->a:Z

    .line 282
    .line 283
    move-object/from16 v1, v31

    .line 284
    .line 285
    invoke-static {v0, v1, v7}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_6
    invoke-static {v9, v8}, La/fy4;->B(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;)Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_7

    .line 294
    .line 295
    sget-object v0, La/hxu;->h:La/hxu;

    .line 296
    .line 297
    iget-wide v5, v6, La/cit0;->N:D

    .line 298
    .line 299
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    new-instance v11, La/sx4;

    .line 304
    .line 305
    invoke-direct {v11, v1, v2}, La/sx4;-><init>(La/fy4;B)V

    .line 306
    .line 307
    .line 308
    iget-object v2, v1, La/fy4;->g:La/mne;

    .line 309
    .line 310
    iget-object v13, v2, La/mne;->b:La/dvj;

    .line 311
    .line 312
    new-instance v14, La/vx4;

    .line 313
    .line 314
    const/4 v7, 0x0

    .line 315
    move-object v2, v0

    .line 316
    move-object v4, v8

    .line 317
    move-object v3, v9

    .line 318
    move-object v0, v14

    .line 319
    invoke-direct/range {v0 .. v7}, La/vx4;-><init>(La/fy4;La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;DLa/yje;)V

    .line 320
    .line 321
    .line 322
    const/16 v15, 0xa

    .line 323
    .line 324
    const/4 v12, 0x0

    .line 325
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 326
    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_7
    iget-object v0, v1, La/fy4;->W:La/nwo0;

    .line 330
    .line 331
    iget-boolean v0, v0, La/nwo0;->a:Z

    .line 332
    .line 333
    if-eqz v0, :cond_8

    .line 334
    .line 335
    sget-object v0, La/wvo0;->a:La/wvo0;

    .line 336
    .line 337
    goto :goto_1

    .line 338
    :cond_8
    sget-object v0, La/zvo0;->a:La/zvo0;

    .line 339
    .line 340
    :goto_1
    invoke-virtual {v1, v0}, La/fy4;->H(La/gwo0;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    sget-object v0, La/onb0;->a:La/onb0;

    .line 347
    .line 348
    invoke-virtual {v4, v7, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object v0
.end method
