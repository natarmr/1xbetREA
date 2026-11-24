.class public final synthetic La/qx7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/a4x;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/a4x;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qx7;->a:B

    iput-object p1, p0, La/qx7;->b:La/a4x;

    iput-object p2, p0, La/qx7;->c:La/a4x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qx7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/qx7;->c:La/a4x;

    .line 8
    .line 9
    iget-object v0, v0, La/qx7;->b:La/a4x;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/ir8;

    .line 17
    .line 18
    move-object/from16 v5, p2

    .line 19
    .line 20
    check-cast v5, La/fet;

    .line 21
    .line 22
    move-object/from16 v6, p3

    .line 23
    .line 24
    check-cast v6, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v1, v6, 0x11

    .line 34
    .line 35
    const/16 v7, 0x10

    .line 36
    .line 37
    if-eq v1, v7, :cond_0

    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v2

    .line 42
    :goto_0
    and-int/2addr v3, v6

    .line 43
    invoke-virtual {v5, v3, v1}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    const/16 v1, 0x64

    .line 50
    .line 51
    const/16 v3, 0x30

    .line 52
    .line 53
    const v6, 0x7f080f6e

    .line 54
    .line 55
    .line 56
    invoke-static {v6, v1, v5, v3}, La/v3c;->c(IILa/fet;I)V

    .line 57
    .line 58
    .line 59
    sget-object v1, La/aph;->a:La/aph;

    .line 60
    .line 61
    invoke-static {v0, v1}, La/v3c;->j0(La/a4x;La/aph;)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const v6, 0x7f080f6c

    .line 66
    .line 67
    .line 68
    invoke-static {v6, v3, v5, v2}, La/v3c;->c(IILa/fet;I)V

    .line 69
    .line 70
    .line 71
    sget-object v3, La/aph;->b:La/aph;

    .line 72
    .line 73
    invoke-static {v0, v3}, La/v3c;->j0(La/a4x;La/aph;)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const v7, 0x7f080f6b

    .line 78
    .line 79
    .line 80
    invoke-static {v7, v6, v5, v2}, La/v3c;->c(IILa/fet;I)V

    .line 81
    .line 82
    .line 83
    sget-object v6, La/aph;->c:La/aph;

    .line 84
    .line 85
    invoke-static {v0, v6}, La/v3c;->j0(La/a4x;La/aph;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const v7, 0x7f080f6d

    .line 90
    .line 91
    .line 92
    invoke-static {v7, v0, v5, v2}, La/v3c;->c(IILa/fet;I)V

    .line 93
    .line 94
    .line 95
    const v0, 0x7f080f70

    .line 96
    .line 97
    .line 98
    invoke-static {v4, v1}, La/v3c;->j0(La/a4x;La/aph;)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {v0, v1, v5, v2}, La/v3c;->c(IILa/fet;I)V

    .line 103
    .line 104
    .line 105
    const v0, 0x7f080f6f

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v3}, La/v3c;->j0(La/a4x;La/aph;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v0, v1, v5, v2}, La/v3c;->c(IILa/fet;I)V

    .line 113
    .line 114
    .line 115
    const v0, 0x7f080f71

    .line 116
    .line 117
    .line 118
    invoke-static {v4, v6}, La/v3c;->j0(La/a4x;La/aph;)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-static {v0, v1, v5, v2}, La/v3c;->c(IILa/fet;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-virtual {v5}, La/fet;->X()V

    .line 127
    .line 128
    .line 129
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_0
    sget-object v1, La/gqw0;->v:La/shd;

    .line 133
    .line 134
    sget-object v5, La/gqw0;->y:La/shd;

    .line 135
    .line 136
    sget-object v6, La/gqw0;->w:La/shd;

    .line 137
    .line 138
    sget-object v7, La/gqw0;->x:La/shd;

    .line 139
    .line 140
    move-object/from16 v8, p1

    .line 141
    .line 142
    check-cast v8, La/lr8;

    .line 143
    .line 144
    move-object/from16 v9, p2

    .line 145
    .line 146
    check-cast v9, La/fet;

    .line 147
    .line 148
    move-object/from16 v10, p3

    .line 149
    .line 150
    check-cast v10, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    sget-object v11, La/gqw0;->m:La/xx7;

    .line 157
    .line 158
    sget-object v12, La/uc9;->g:La/nw3;

    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    and-int/lit8 v13, v10, 0x6

    .line 164
    .line 165
    const/4 v14, 0x2

    .line 166
    if-nez v13, :cond_3

    .line 167
    .line 168
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    if-eqz v13, :cond_2

    .line 173
    .line 174
    const/4 v13, 0x4

    .line 175
    goto :goto_2

    .line 176
    :cond_2
    move v13, v14

    .line 177
    :goto_2
    or-int/2addr v10, v13

    .line 178
    :cond_3
    and-int/lit8 v13, v10, 0x13

    .line 179
    .line 180
    const/16 v15, 0x12

    .line 181
    .line 182
    if-eq v13, v15, :cond_4

    .line 183
    .line 184
    move v13, v3

    .line 185
    goto :goto_3

    .line 186
    :cond_4
    move v13, v2

    .line 187
    :goto_3
    and-int/2addr v10, v3

    .line 188
    invoke-virtual {v9, v10, v13}, La/fet;->U(IZ)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-eqz v10, :cond_b

    .line 193
    .line 194
    invoke-virtual {v8}, La/lr8;->c()F

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    const/high16 v10, 0x41400000    # 12.0f

    .line 199
    .line 200
    div-float/2addr v8, v10

    .line 201
    const/high16 v10, 0x42200000    # 40.0f

    .line 202
    .line 203
    invoke-static {v8, v10}, La/ycl;->a(FF)I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-ltz v13, :cond_5

    .line 208
    .line 209
    move v8, v10

    .line 210
    :cond_5
    sget-object v10, La/qmk;->a:La/zcl;

    .line 211
    .line 212
    const/high16 v10, 0x40800000    # 4.0f

    .line 213
    .line 214
    sget-object v13, La/jm40;->b:La/jm40;

    .line 215
    .line 216
    const/4 v15, 0x0

    .line 217
    invoke-static {v13, v10, v15, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    sget-object v14, La/uc9;->f:La/nw3;

    .line 222
    .line 223
    sget-object v15, La/gqw0;->j:La/yx7;

    .line 224
    .line 225
    const/4 v3, 0x6

    .line 226
    invoke-static {v14, v15, v9, v3}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    iget-wide v2, v9, La/fet;->T:J

    .line 231
    .line 232
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-static {v9, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 245
    .line 246
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9}, La/fet;->i0()V

    .line 250
    .line 251
    .line 252
    iget-boolean v15, v9, La/fet;->S:Z

    .line 253
    .line 254
    move/from16 v16, v15

    .line 255
    .line 256
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 257
    .line 258
    if-eqz v16, :cond_6

    .line 259
    .line 260
    invoke-virtual {v9, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_6
    invoke-virtual {v9}, La/fet;->r0()V

    .line 265
    .line 266
    .line 267
    :goto_4
    invoke-static {v9, v14, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v9, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v9, v5, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v9, v10, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    const/high16 v2, 0x3f800000    # 1.0f

    .line 280
    .line 281
    invoke-static {v13, v2}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 282
    .line 283
    .line 284
    move-result-object v16

    .line 285
    const/16 v20, 0x0

    .line 286
    .line 287
    const/16 v21, 0xb

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const/16 v18, 0x0

    .line 292
    .line 293
    const/high16 v19, 0x40000000    # 2.0f

    .line 294
    .line 295
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    const/4 v10, 0x6

    .line 300
    invoke-static {v12, v11, v9, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 301
    .line 302
    .line 303
    move-result-object v14

    .line 304
    move-object/from16 p3, v3

    .line 305
    .line 306
    iget-wide v2, v9, La/fet;->T:J

    .line 307
    .line 308
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    move-object/from16 v10, p3

    .line 317
    .line 318
    invoke-static {v9, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    invoke-virtual {v9}, La/fet;->i0()V

    .line 323
    .line 324
    .line 325
    move-object/from16 v16, v4

    .line 326
    .line 327
    iget-boolean v4, v9, La/fet;->S:Z

    .line 328
    .line 329
    if-eqz v4, :cond_7

    .line 330
    .line 331
    invoke-virtual {v9, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 332
    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_7
    invoke-virtual {v9}, La/fet;->r0()V

    .line 336
    .line 337
    .line 338
    :goto_5
    invoke-static {v9, v14, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v9, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v2, v9, v5, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 345
    .line 346
    .line 347
    const v2, -0x6452d643

    .line 348
    .line 349
    .line 350
    invoke-static {v9, v10, v1, v2, v0}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_8

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, La/k9q;

    .line 365
    .line 366
    const/4 v3, 0x0

    .line 367
    invoke-static {v2, v8, v9, v3}, La/bsr0;->r(La/k9q;FLa/fet;I)V

    .line 368
    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_8
    const/4 v3, 0x0

    .line 372
    invoke-virtual {v9, v3}, La/fet;->r(Z)V

    .line 373
    .line 374
    .line 375
    const/4 v0, 0x1

    .line 376
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x3f800000    # 1.0f

    .line 380
    .line 381
    invoke-static {v13, v0}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 382
    .line 383
    .line 384
    move-result-object v17

    .line 385
    sget-object v0, La/qmk;->a:La/zcl;

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const/16 v22, 0xe

    .line 390
    .line 391
    const/high16 v18, 0x40000000    # 2.0f

    .line 392
    .line 393
    const/16 v19, 0x0

    .line 394
    .line 395
    const/16 v20, 0x0

    .line 396
    .line 397
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    const/4 v10, 0x6

    .line 402
    invoke-static {v12, v11, v9, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    iget-wide v10, v9, La/fet;->T:J

    .line 407
    .line 408
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 413
    .line 414
    .line 415
    move-result-object v10

    .line 416
    invoke-static {v9, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 421
    .line 422
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v9}, La/fet;->i0()V

    .line 426
    .line 427
    .line 428
    iget-boolean v11, v9, La/fet;->S:Z

    .line 429
    .line 430
    if-eqz v11, :cond_9

    .line 431
    .line 432
    invoke-virtual {v9, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 433
    .line 434
    .line 435
    goto :goto_7

    .line 436
    :cond_9
    invoke-virtual {v9}, La/fet;->r0()V

    .line 437
    .line 438
    .line 439
    :goto_7
    invoke-static {v9, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 440
    .line 441
    .line 442
    invoke-static {v9, v10, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 443
    .line 444
    .line 445
    invoke-static {v4, v9, v5, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 446
    .line 447
    .line 448
    const v2, -0x160c5c6c

    .line 449
    .line 450
    .line 451
    move-object/from16 v4, v16

    .line 452
    .line 453
    invoke-static {v9, v0, v1, v2, v4}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-eqz v1, :cond_a

    .line 462
    .line 463
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, La/k9q;

    .line 468
    .line 469
    const/4 v3, 0x0

    .line 470
    invoke-static {v1, v8, v9, v3}, La/bsr0;->r(La/k9q;FLa/fet;I)V

    .line 471
    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_a
    const/4 v1, 0x1

    .line 475
    const/4 v3, 0x0

    .line 476
    invoke-static {v9, v3, v1, v1}, La/ohs0;->x(La/fet;ZZZ)V

    .line 477
    .line 478
    .line 479
    goto :goto_9

    .line 480
    :cond_b
    invoke-virtual {v9}, La/fet;->X()V

    .line 481
    .line 482
    .line 483
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object v0

    .line 486
    nop

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
