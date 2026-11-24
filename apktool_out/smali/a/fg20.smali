.class public final La/fg20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public i:La/ozc;

.field public j:B

.field public synthetic k:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

.field public synthetic l:La/q4f;

.field public synthetic m:Z

.field public final synthetic n:La/qg20;

.field public final synthetic o:La/mie0;


# direct methods
.method public constructor <init>(La/qg20;La/mie0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fg20;->n:La/qg20;

    .line 2
    .line 3
    iput-object p2, p0, La/fg20;->o:La/mie0;

    .line 4
    .line 5
    const/4 p1, 0x5

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 2
    .line 3
    check-cast p2, La/q4f;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    check-cast p4, Lkotlin/Unit;

    .line 12
    .line 13
    check-cast p5, La/yje;

    .line 14
    .line 15
    new-instance p4, La/fg20;

    .line 16
    .line 17
    iget-object v0, p0, La/fg20;->n:La/qg20;

    .line 18
    .line 19
    iget-object p0, p0, La/fg20;->o:La/mie0;

    .line 20
    .line 21
    invoke-direct {p4, v0, p0, p5}, La/fg20;-><init>(La/qg20;La/mie0;La/yje;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p4, La/fg20;->k:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 25
    .line 26
    iput-object p2, p4, La/fg20;->l:La/q4f;

    .line 27
    .line 28
    iput-boolean p3, p4, La/fg20;->m:Z

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {p4, p0}, La/fg20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v2, v5, La/fg20;->k:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 4
    .line 5
    iget-object v3, v5, La/fg20;->l:La/q4f;

    .line 6
    .line 7
    iget-boolean v0, v5, La/fg20;->m:Z

    .line 8
    .line 9
    sget-object v1, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, v5, La/fg20;->j:B

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    iget-object v9, v5, La/fg20;->n:La/qg20;

    .line 17
    .line 18
    if-eqz v4, :cond_2

    .line 19
    .line 20
    if-eq v4, v8, :cond_1

    .line 21
    .line 22
    if-ne v4, v7, :cond_0

    .line 23
    .line 24
    iget-object v1, v5, La/fg20;->i:La/ozc;

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move v8, v0

    .line 30
    move-object v6, v1

    .line 31
    move-object v7, v2

    .line 32
    move-object v0, v9

    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    goto/16 :goto_8

    .line 36
    .line 37
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v6

    .line 43
    :cond_1
    iget-object v4, v5, La/fg20;->i:La/ozc;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v7, p1

    .line 49
    .line 50
    move-object v6, v2

    .line 51
    move v15, v8

    .line 52
    move-object v2, v9

    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, v9, La/qg20;->k0:La/vzg0;

    .line 59
    .line 60
    const/16 v27, 0x0

    .line 61
    .line 62
    const v28, 0x37fff

    .line 63
    .line 64
    .line 65
    move v10, v7

    .line 66
    move v11, v8

    .line 67
    const-wide/16 v7, 0x0

    .line 68
    .line 69
    move-object v13, v9

    .line 70
    move v12, v10

    .line 71
    const-wide/16 v9, 0x0

    .line 72
    .line 73
    move v15, v11

    .line 74
    move v14, v12

    .line 75
    const-wide/16 v11, 0x0

    .line 76
    .line 77
    move-object/from16 v17, v13

    .line 78
    .line 79
    move/from16 v16, v14

    .line 80
    .line 81
    const-wide/16 v13, 0x0

    .line 82
    .line 83
    move/from16 v19, v15

    .line 84
    .line 85
    move/from16 v18, v16

    .line 86
    .line 87
    const-wide/16 v15, 0x0

    .line 88
    .line 89
    move-object/from16 v20, v17

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    move/from16 v21, v18

    .line 94
    .line 95
    const/16 v18, 0x0

    .line 96
    .line 97
    move/from16 v22, v19

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    move-object/from16 v23, v20

    .line 102
    .line 103
    const/16 v20, 0x0

    .line 104
    .line 105
    move/from16 v24, v21

    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    move/from16 v25, v22

    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    move-object/from16 v26, v23

    .line 114
    .line 115
    const/16 v23, 0x0

    .line 116
    .line 117
    move/from16 v29, v24

    .line 118
    .line 119
    const/16 v24, 0x0

    .line 120
    .line 121
    move/from16 v30, v25

    .line 122
    .line 123
    const/16 v25, 0x1

    .line 124
    .line 125
    move-object/from16 v31, v26

    .line 126
    .line 127
    const/16 v26, 0x0

    .line 128
    .line 129
    move-object v6, v2

    .line 130
    move-object/from16 v2, v31

    .line 131
    .line 132
    invoke-static/range {v6 .. v28}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    const-string v8, "SAVED_STATE_STEP_INPUT_KEY"

    .line 137
    .line 138
    invoke-virtual {v4, v8, v7}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v4, v2, La/qg20;->L0:La/bby;

    .line 142
    .line 143
    const-string v7, "New config"

    .line 144
    .line 145
    if-eqz v4, :cond_3

    .line 146
    .line 147
    new-instance v8, Ljava/util/concurrent/CancellationException;

    .line 148
    .line 149
    invoke-direct {v8, v7}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v4, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    iget-object v4, v2, La/qg20;->O0:La/bby;

    .line 156
    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    new-instance v8, Ljava/util/concurrent/CancellationException;

    .line 160
    .line 161
    invoke-direct {v8, v7}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v4, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 165
    .line 166
    .line 167
    :cond_4
    iget-object v4, v2, La/qg20;->P0:La/bby;

    .line 168
    .line 169
    if-eqz v4, :cond_5

    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    invoke-interface {v4, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    iget-object v4, v2, La/qg20;->U:La/j9c;

    .line 176
    .line 177
    invoke-virtual {v4}, La/j9c;->c()La/cit0;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    iget-object v4, v4, La/cit0;->U:La/ozc;

    .line 182
    .line 183
    iput-object v6, v5, La/fg20;->k:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 184
    .line 185
    iput-object v3, v5, La/fg20;->l:La/q4f;

    .line 186
    .line 187
    iput-object v4, v5, La/fg20;->i:La/ozc;

    .line 188
    .line 189
    iput-boolean v0, v5, La/fg20;->m:Z

    .line 190
    .line 191
    const/4 v15, 0x1

    .line 192
    iput-byte v15, v5, La/fg20;->j:B

    .line 193
    .line 194
    iget-object v7, v2, La/qg20;->x:La/m1e;

    .line 195
    .line 196
    invoke-interface {v7}, La/m1e;->b()La/gmq;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-static {v7, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    if-ne v7, v1, :cond_6

    .line 205
    .line 206
    move-object v9, v1

    .line 207
    goto/16 :goto_7

    .line 208
    .line 209
    :cond_6
    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-nez v7, :cond_7

    .line 216
    .line 217
    invoke-virtual {v2, v0}, La/qg20;->V(Z)Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-eqz v7, :cond_7

    .line 222
    .line 223
    sget-object v0, La/cwo0;->a:La/cwo0;

    .line 224
    .line 225
    invoke-virtual {v2, v0}, La/qg20;->g0(La/hwo0;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, La/qg20;->z()La/inb0;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v2, v0}, La/qg20;->e0(La/jnb0;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_9

    .line 236
    .line 237
    :cond_7
    iget-object v7, v2, La/qg20;->e0:La/b8u;

    .line 238
    .line 239
    invoke-virtual {v7}, La/b8u;->b()La/duw;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    sget-object v8, La/duw;->d:La/duw;

    .line 244
    .line 245
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    invoke-virtual {v2, v6}, La/qg20;->T(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    sget-object v9, La/hnb0;->a:La/hnb0;

    .line 254
    .line 255
    if-eqz v8, :cond_8

    .line 256
    .line 257
    invoke-virtual {v2, v0}, La/qg20;->V(Z)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-nez v8, :cond_9

    .line 262
    .line 263
    if-nez v7, :cond_8

    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_8
    move v8, v0

    .line 267
    move-object v7, v6

    .line 268
    move-object v6, v4

    .line 269
    goto/16 :goto_6

    .line 270
    .line 271
    :cond_9
    :goto_1
    iget-object v7, v2, La/qg20;->f1:La/p7m0;

    .line 272
    .line 273
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    check-cast v7, Ljava/lang/Boolean;

    .line 278
    .line 279
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    if-eqz v7, :cond_8

    .line 284
    .line 285
    iget-object v1, v2, La/qg20;->T0:La/nwo0;

    .line 286
    .line 287
    iget-boolean v7, v1, La/nwo0;->a:Z

    .line 288
    .line 289
    iget-object v8, v5, La/fg20;->o:La/mie0;

    .line 290
    .line 291
    if-nez v7, :cond_a

    .line 292
    .line 293
    iget-boolean v1, v1, La/nwo0;->b:Z

    .line 294
    .line 295
    if-eqz v1, :cond_b

    .line 296
    .line 297
    iget-object v1, v2, La/qg20;->g1:La/p7m0;

    .line 298
    .line 299
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Ljava/lang/Boolean;

    .line 304
    .line 305
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_b

    .line 310
    .line 311
    :cond_a
    sget-object v16, La/q4f;->f:La/q4f;

    .line 312
    .line 313
    sget-object v17, La/q4f;->g:La/q4f;

    .line 314
    .line 315
    sget-object v18, La/q4f;->j:La/q4f;

    .line 316
    .line 317
    sget-object v19, La/q4f;->k:La/q4f;

    .line 318
    .line 319
    sget-object v20, La/q4f;->h:La/q4f;

    .line 320
    .line 321
    sget-object v21, La/q4f;->m:La/q4f;

    .line 322
    .line 323
    filled-new-array/range {v16 .. v21}, [La/q4f;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_b

    .line 336
    .line 337
    sget-object v0, La/xvo0;->a:La/xvo0;

    .line 338
    .line 339
    invoke-virtual {v2, v0}, La/qg20;->g0(La/hwo0;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v9}, La/qg20;->e0(La/jnb0;)V

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_b
    iget-object v1, v8, La/mie0;->a:Ljava/lang/Object;

    .line 347
    .line 348
    if-eq v1, v3, :cond_c

    .line 349
    .line 350
    goto :goto_2

    .line 351
    :cond_c
    const/4 v1, 0x0

    .line 352
    move v15, v1

    .line 353
    :goto_2
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    if-nez v15, :cond_d

    .line 358
    .line 359
    const-wide/16 v9, 0x1f4

    .line 360
    .line 361
    :goto_3
    move-wide/from16 v17, v9

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_d
    const-wide/16 v9, 0x0

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :goto_4
    iget-object v1, v2, La/qg20;->d:La/mne;

    .line 368
    .line 369
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 370
    .line 371
    new-instance v21, La/yw10;

    .line 372
    .line 373
    const/4 v15, 0x0

    .line 374
    const/16 v16, 0x13

    .line 375
    .line 376
    const/4 v10, 0x1

    .line 377
    const-class v12, La/qg20;

    .line 378
    .line 379
    const-string v13, "handleLoadTaxContentThrowable"

    .line 380
    .line 381
    const-string v14, "handleLoadTaxContentThrowable(Ljava/lang/Throwable;)V"

    .line 382
    .line 383
    move-object v11, v2

    .line 384
    move-object/from16 v9, v21

    .line 385
    .line 386
    invoke-direct/range {v9 .. v16}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 387
    .line 388
    .line 389
    move-object/from16 v31, v11

    .line 390
    .line 391
    new-instance v22, La/nf20;

    .line 392
    .line 393
    move-object v2, v6

    .line 394
    const/4 v6, 0x0

    .line 395
    move v5, v0

    .line 396
    move-object/from16 v20, v1

    .line 397
    .line 398
    move-object/from16 v0, v22

    .line 399
    .line 400
    move-object/from16 v1, v31

    .line 401
    .line 402
    invoke-direct/range {v0 .. v6}, La/nf20;-><init>(La/qg20;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;La/ozc;ZLa/yje;)V

    .line 403
    .line 404
    .line 405
    move-object v2, v1

    .line 406
    const/16 v23, 0x20

    .line 407
    .line 408
    sget-object v19, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 409
    .line 410
    move-object/from16 v16, v7

    .line 411
    .line 412
    invoke-static/range {v16 .. v23}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    iput-object v0, v2, La/qg20;->L0:La/bby;

    .line 417
    .line 418
    :goto_5
    iput-object v3, v8, La/mie0;->a:Ljava/lang/Object;

    .line 419
    .line 420
    goto :goto_9

    .line 421
    :goto_6
    invoke-virtual {v2, v7}, La/qg20;->T(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_10

    .line 426
    .line 427
    move-object v0, v1

    .line 428
    move-object/from16 v31, v2

    .line 429
    .line 430
    iget-wide v1, v7, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 431
    .line 432
    sget-object v4, La/hxu;->h:La/hxu;

    .line 433
    .line 434
    iput-object v7, v5, La/fg20;->k:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 435
    .line 436
    iput-object v3, v5, La/fg20;->l:La/q4f;

    .line 437
    .line 438
    iput-object v6, v5, La/fg20;->i:La/ozc;

    .line 439
    .line 440
    iput-boolean v8, v5, La/fg20;->m:Z

    .line 441
    .line 442
    const/4 v14, 0x2

    .line 443
    iput-byte v14, v5, La/fg20;->j:B

    .line 444
    .line 445
    move-object v9, v0

    .line 446
    move-object/from16 v0, v31

    .line 447
    .line 448
    invoke-virtual/range {v0 .. v5}, La/qg20;->w(DLa/q4f;La/hxu;La/zje;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    if-ne v1, v9, :cond_e

    .line 453
    .line 454
    :goto_7
    return-object v9

    .line 455
    :cond_e
    :goto_8
    check-cast v1, La/txu;

    .line 456
    .line 457
    move-object v2, v7

    .line 458
    move-object v7, v1

    .line 459
    sget-object v1, La/hxu;->h:La/hxu;

    .line 460
    .line 461
    iget-object v4, v0, La/qg20;->w:La/hsj;

    .line 462
    .line 463
    invoke-virtual {v4}, La/hsj;->i()D

    .line 464
    .line 465
    .line 466
    move-result-wide v4

    .line 467
    invoke-virtual {v0, v4, v5}, La/qg20;->K(D)D

    .line 468
    .line 469
    .line 470
    move-result-wide v4

    .line 471
    invoke-virtual/range {v0 .. v7}, La/qg20;->A(La/hxu;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/q4f;DLa/ozc;La/txu;)V

    .line 472
    .line 473
    .line 474
    iget-object v3, v7, La/txu;->g:La/ivo0;

    .line 475
    .line 476
    iget-wide v3, v3, La/ivo0;->b:D

    .line 477
    .line 478
    const-wide/16 v5, 0x0

    .line 479
    .line 480
    cmpl-double v3, v3, v5

    .line 481
    .line 482
    if-lez v3, :cond_f

    .line 483
    .line 484
    invoke-virtual {v0, v2, v7, v1, v8}, La/qg20;->f0(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;La/txu;La/hxu;Z)V

    .line 485
    .line 486
    .line 487
    goto :goto_9

    .line 488
    :cond_f
    invoke-virtual {v0, v8}, La/qg20;->N(Z)V

    .line 489
    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_10
    move-object v0, v2

    .line 493
    invoke-virtual {v0, v8}, La/qg20;->N(Z)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, v9}, La/qg20;->e0(La/jnb0;)V

    .line 497
    .line 498
    .line 499
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object v0
.end method
