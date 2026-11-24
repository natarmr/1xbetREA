.class public final synthetic La/fu60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rza;


# direct methods
.method public synthetic constructor <init>(La/rza;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/fu60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fu60;->b:La/rza;

    return-void
.end method

.method public synthetic constructor <init>(La/rza;I)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/fu60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fu60;->b:La/rza;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fu60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/fu60;->b:La/rza;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/fet;

    .line 14
    .line 15
    move-object/from16 v3, p2

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v0, v1, v2}, La/jiq0;->s(La/rza;La/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, La/fet;

    .line 35
    .line 36
    move-object/from16 v3, p2

    .line 37
    .line 38
    check-cast v3, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    and-int/lit8 v4, v3, 0x3

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x2

    .line 48
    if-eq v4, v6, :cond_0

    .line 49
    .line 50
    move v4, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v4, v5

    .line 53
    :goto_0
    and-int/2addr v3, v2

    .line 54
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    sget-object v3, La/jm40;->b:La/jm40;

    .line 61
    .line 62
    const/high16 v4, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    sget-object v8, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    const/high16 v11, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/4 v12, 0x7

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    sget-object v8, La/gqw0;->k:La/yx7;

    .line 81
    .line 82
    sget-object v9, La/uc9;->g:La/nw3;

    .line 83
    .line 84
    const/16 v10, 0x36

    .line 85
    .line 86
    invoke-static {v9, v8, v1, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    iget-wide v10, v1, La/fet;->T:J

    .line 91
    .line 92
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-static {v1, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 105
    .line 106
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, La/fet;->i0()V

    .line 110
    .line 111
    .line 112
    iget-boolean v12, v1, La/fet;->S:Z

    .line 113
    .line 114
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 115
    .line 116
    if-eqz v12, :cond_1

    .line 117
    .line 118
    invoke-virtual {v1, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 123
    .line 124
    .line 125
    :goto_1
    sget-object v12, La/gqw0;->x:La/shd;

    .line 126
    .line 127
    invoke-static {v1, v9, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    sget-object v9, La/gqw0;->w:La/shd;

    .line 131
    .line 132
    invoke-static {v1, v11, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    sget-object v11, La/gqw0;->y:La/shd;

    .line 140
    .line 141
    invoke-static {v1, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 145
    .line 146
    .line 147
    sget-object v10, La/gqw0;->v:La/shd;

    .line 148
    .line 149
    invoke-static {v1, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    move-object v7, v3

    .line 153
    iget-object v3, v0, La/rza;->a:Ljava/lang/String;

    .line 154
    .line 155
    sget-object v14, La/s6t0;->a:La/pz40;

    .line 156
    .line 157
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 158
    .line 159
    .line 160
    move-result-object v23

    .line 161
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    iget-object v14, v14, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 166
    .line 167
    invoke-virtual {v14}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v14

    .line 171
    const/16 v26, 0x0

    .line 172
    .line 173
    const v27, 0x1fffa

    .line 174
    .line 175
    .line 176
    move/from16 v16, v4

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    move-object/from16 v17, v7

    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    move-object/from16 v18, v8

    .line 183
    .line 184
    move-object/from16 v19, v9

    .line 185
    .line 186
    const-wide/16 v8, 0x0

    .line 187
    .line 188
    move-object/from16 v20, v10

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    move-object/from16 v21, v11

    .line 192
    .line 193
    const/4 v11, 0x0

    .line 194
    move-object/from16 v22, v12

    .line 195
    .line 196
    const/4 v12, 0x0

    .line 197
    move/from16 v24, v6

    .line 198
    .line 199
    move-object/from16 v25, v13

    .line 200
    .line 201
    move-wide/from16 v40, v14

    .line 202
    .line 203
    move v15, v5

    .line 204
    move-wide/from16 v5, v40

    .line 205
    .line 206
    const-wide/16 v13, 0x0

    .line 207
    .line 208
    move/from16 v28, v15

    .line 209
    .line 210
    const/4 v15, 0x0

    .line 211
    move/from16 v29, v16

    .line 212
    .line 213
    move-object/from16 v30, v17

    .line 214
    .line 215
    const-wide/16 v16, 0x0

    .line 216
    .line 217
    move-object/from16 v31, v18

    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    move-object/from16 v32, v19

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    move-object/from16 v33, v20

    .line 226
    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    move-object/from16 v34, v21

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    move-object/from16 v35, v22

    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    move-object/from16 v36, v25

    .line 238
    .line 239
    const/16 v25, 0x0

    .line 240
    .line 241
    move-object/from16 v29, v0

    .line 242
    .line 243
    move-object/from16 v24, v1

    .line 244
    .line 245
    move-object/from16 v0, v30

    .line 246
    .line 247
    move-object/from16 v1, v31

    .line 248
    .line 249
    move-object/from16 v38, v33

    .line 250
    .line 251
    move-object/from16 v37, v34

    .line 252
    .line 253
    move-object/from16 v2, v36

    .line 254
    .line 255
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 256
    .line 257
    .line 258
    move-object/from16 v3, v24

    .line 259
    .line 260
    sget-object v4, La/uc9;->a:La/lw3;

    .line 261
    .line 262
    const/16 v5, 0x30

    .line 263
    .line 264
    invoke-static {v4, v1, v3, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-wide v4, v3, La/fet;->T:J

    .line 269
    .line 270
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    invoke-virtual {v3}, La/fet;->m()La/bh90;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-static {v3, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-virtual {v3}, La/fet;->i0()V

    .line 283
    .line 284
    .line 285
    iget-boolean v7, v3, La/fet;->S:Z

    .line 286
    .line 287
    if-eqz v7, :cond_2

    .line 288
    .line 289
    invoke-virtual {v3, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 290
    .line 291
    .line 292
    :goto_2
    move-object/from16 v2, v35

    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_2
    invoke-virtual {v3}, La/fet;->r0()V

    .line 296
    .line 297
    .line 298
    goto :goto_2

    .line 299
    :goto_3
    invoke-static {v3, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v1, v32

    .line 303
    .line 304
    invoke-static {v3, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 305
    .line 306
    .line 307
    move-object/from16 v1, v37

    .line 308
    .line 309
    invoke-static {v4, v3, v1, v3}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 310
    .line 311
    .line 312
    move-object/from16 v1, v38

    .line 313
    .line 314
    invoke-static {v3, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    move-object/from16 v24, v3

    .line 318
    .line 319
    move-object/from16 v1, v29

    .line 320
    .line 321
    iget-object v3, v1, La/rza;->b:Ljava/lang/String;

    .line 322
    .line 323
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 324
    .line 325
    .line 326
    move-result-object v23

    .line 327
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 332
    .line 333
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 334
    .line 335
    .line 336
    move-result-wide v5

    .line 337
    const/16 v26, 0x0

    .line 338
    .line 339
    const v27, 0x1fffa

    .line 340
    .line 341
    .line 342
    const/4 v4, 0x0

    .line 343
    const/4 v7, 0x0

    .line 344
    const-wide/16 v8, 0x0

    .line 345
    .line 346
    const/4 v10, 0x0

    .line 347
    const/4 v11, 0x0

    .line 348
    const/4 v12, 0x0

    .line 349
    const-wide/16 v13, 0x0

    .line 350
    .line 351
    const/4 v15, 0x0

    .line 352
    const-wide/16 v16, 0x0

    .line 353
    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    const/16 v19, 0x0

    .line 357
    .line 358
    const/16 v20, 0x0

    .line 359
    .line 360
    const/16 v21, 0x0

    .line 361
    .line 362
    const/16 v22, 0x0

    .line 363
    .line 364
    const/16 v25, 0x0

    .line 365
    .line 366
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 367
    .line 368
    .line 369
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 370
    .line 371
    .line 372
    move-result-object v23

    .line 373
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 378
    .line 379
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 380
    .line 381
    .line 382
    move-result-wide v5

    .line 383
    const/high16 v2, 0x40800000    # 4.0f

    .line 384
    .line 385
    const/4 v3, 0x0

    .line 386
    const/4 v4, 0x2

    .line 387
    invoke-static {v0, v2, v3, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    const v27, 0x1fff8

    .line 392
    .line 393
    .line 394
    const/16 v25, 0x6

    .line 395
    .line 396
    const-string v3, "/"

    .line 397
    .line 398
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 399
    .line 400
    .line 401
    iget-object v3, v1, La/rza;->c:Ljava/lang/String;

    .line 402
    .line 403
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 404
    .line 405
    .line 406
    move-result-object v23

    .line 407
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 412
    .line 413
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 414
    .line 415
    .line 416
    move-result-wide v5

    .line 417
    const v27, 0x1fffa

    .line 418
    .line 419
    .line 420
    const/4 v4, 0x0

    .line 421
    const/16 v25, 0x0

    .line 422
    .line 423
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v3, v24

    .line 427
    .line 428
    const/4 v2, 0x1

    .line 429
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 433
    .line 434
    .line 435
    const/high16 v2, 0x3f800000    # 1.0f

    .line 436
    .line 437
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    const/4 v8, 0x0

    .line 442
    const/16 v9, 0xd

    .line 443
    .line 444
    const/4 v5, 0x0

    .line 445
    const/high16 v6, 0x41000000    # 8.0f

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    new-instance v4, La/unm;

    .line 453
    .line 454
    sget-object v5, La/tnm;->a:La/tnm;

    .line 455
    .line 456
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 457
    .line 458
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOrange-0d7_KjU()J

    .line 459
    .line 460
    .line 461
    move-result-wide v6

    .line 462
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOrange-0d7_KjU()J

    .line 463
    .line 464
    .line 465
    move-result-wide v8

    .line 466
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 471
    .line 472
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 473
    .line 474
    .line 475
    move-result-wide v10

    .line 476
    iget v1, v1, La/rza;->d:F

    .line 477
    .line 478
    float-to-int v1, v1

    .line 479
    const/16 v2, 0x64

    .line 480
    .line 481
    const/4 v12, 0x0

    .line 482
    invoke-static {v1, v12, v2}, La/l1e0;->d(III)I

    .line 483
    .line 484
    .line 485
    move-result v14

    .line 486
    const/16 v16, 0x0

    .line 487
    .line 488
    const/16 v17, 0x300

    .line 489
    .line 490
    move v15, v12

    .line 491
    const/high16 v12, 0x41200000    # 10.0f

    .line 492
    .line 493
    const/high16 v13, 0x43b40000    # 360.0f

    .line 494
    .line 495
    move/from16 v39, v15

    .line 496
    .line 497
    const/16 v15, 0x64

    .line 498
    .line 499
    move/from16 v1, v39

    .line 500
    .line 501
    invoke-direct/range {v4 .. v17}, La/unm;-><init>(La/tnm;JJJFFIIZI)V

    .line 502
    .line 503
    .line 504
    invoke-static {v0, v4, v3, v1}, La/snm;->b(La/mm40;La/unm;La/fet;I)V

    .line 505
    .line 506
    .line 507
    goto :goto_4

    .line 508
    :cond_3
    move-object v3, v1

    .line 509
    invoke-virtual {v3}, La/fet;->X()V

    .line 510
    .line 511
    .line 512
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object v0

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
