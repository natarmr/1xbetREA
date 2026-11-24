.class public final synthetic La/t6q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/t6q0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/t6q0;->a:B

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v7, p1

    .line 18
    .line 19
    check-cast v7, La/fhl;

    .line 20
    .line 21
    sget-object v0, La/v9r0;->O1:La/j6m0;

    .line 22
    .line 23
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 27
    .line 28
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 33
    .line 34
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 35
    .line 36
    .line 37
    move-result-wide v8

    .line 38
    const/16 v17, 0x0

    .line 39
    .line 40
    const/16 v18, 0x7e

    .line 41
    .line 42
    const-wide/16 v10, 0x0

    .line 43
    .line 44
    const-wide/16 v12, 0x0

    .line 45
    .line 46
    const/4 v14, 0x0

    .line 47
    const/4 v15, 0x0

    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    invoke-static/range {v7 .. v18}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    move-object/from16 v1, p1

    .line 57
    .line 58
    check-cast v1, La/fhl;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 64
    .line 65
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 70
    .line 71
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    const/4 v11, 0x0

    .line 76
    const/16 v12, 0x7e

    .line 77
    .line 78
    const-wide/16 v4, 0x0

    .line 79
    .line 80
    const-wide/16 v6, 0x0

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x0

    .line 85
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    move-object/from16 v0, p1

    .line 92
    .line 93
    check-cast v0, La/d9r0;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, La/d9r0;->a:Ljava/lang/String;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_2
    move-object/from16 v0, p1

    .line 102
    .line 103
    check-cast v0, Landroid/view/View;

    .line 104
    .line 105
    sget-object v1, La/q7r0;->O1:La/y2m0;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 111
    .line 112
    new-instance v1, La/b6r;

    .line 113
    .line 114
    invoke-direct {v1, v0, v0}, La/b6r;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 115
    .line 116
    .line 117
    return-object v1

    .line 118
    :pswitch_3
    move-object/from16 v0, p1

    .line 119
    .line 120
    check-cast v0, La/sjd;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance v1, La/d5r0;

    .line 126
    .line 127
    invoke-direct {v1, v0}, La/d5r0;-><init>(La/sjd;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_4
    move-object/from16 v0, p1

    .line 132
    .line 133
    check-cast v0, Ljava/lang/Long;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_5
    move-object/from16 v0, p1

    .line 142
    .line 143
    check-cast v0, La/s8l0;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-wide v0, v0, La/s8l0;->a:J

    .line 149
    .line 150
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :pswitch_6
    move-object/from16 v0, p1

    .line 156
    .line 157
    check-cast v0, Ljava/util/List;

    .line 158
    .line 159
    new-instance v1, La/oyq0;

    .line 160
    .line 161
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Ljava/lang/Number;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    const/4 v4, 0x2

    .line 182
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/Number;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-direct {v1, v3, v2, v0}, La/oyq0;-><init>(FFF)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :pswitch_7
    move-object/from16 v0, p1

    .line 197
    .line 198
    check-cast v0, La/n1g;

    .line 199
    .line 200
    new-instance v1, La/rq2;

    .line 201
    .line 202
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 209
    .line 210
    sget-object v1, La/l1g;->b:La/l1g;

    .line 211
    .line 212
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 213
    .line 214
    sget-object v1, La/k1g;->b:La/k1g;

    .line 215
    .line 216
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 217
    .line 218
    sget-object v1, La/j1g;->c:La/j1g;

    .line 219
    .line 220
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 221
    .line 222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_8
    move-object/from16 v0, p1

    .line 226
    .line 227
    check-cast v0, La/cp;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_9
    move-object/from16 v0, p1

    .line 236
    .line 237
    check-cast v0, La/cp;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    new-instance v1, La/kzi0;

    .line 243
    .line 244
    const/16 v2, 0x14

    .line 245
    .line 246
    invoke-direct {v1, v0, v2}, La/kzi0;-><init>(La/cp;B)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_a
    move-object/from16 v0, p1

    .line 256
    .line 257
    check-cast v0, La/cp;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance v1, La/pgj0;

    .line 263
    .line 264
    const/16 v2, 0x12

    .line 265
    .line 266
    invoke-direct {v1, v0, v0, v2}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_b
    move-object/from16 v0, p1

    .line 276
    .line 277
    check-cast v0, Ljava/lang/Throwable;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 283
    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_c
    move-object/from16 v0, p1

    .line 289
    .line 290
    check-cast v0, Landroid/text/Editable;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_d
    move-object/from16 v0, p1

    .line 299
    .line 300
    check-cast v0, La/abi0;

    .line 301
    .line 302
    sget-object v1, La/xai0;->B:La/zai0;

    .line 303
    .line 304
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    invoke-interface {v0, v1, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-object v2

    .line 310
    :pswitch_e
    move-object/from16 v0, p1

    .line 311
    .line 312
    check-cast v0, La/i83;

    .line 313
    .line 314
    iget-object v1, v0, La/i83;->a:Ljava/lang/Object;

    .line 315
    .line 316
    instance-of v2, v1, La/kb00;

    .line 317
    .line 318
    if-eqz v2, :cond_3

    .line 319
    .line 320
    check-cast v1, La/kb00;

    .line 321
    .line 322
    invoke-virtual {v1}, La/kb00;->b()La/f9q0;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-eqz v1, :cond_3

    .line 327
    .line 328
    iget-object v2, v1, La/f9q0;->a:La/smk0;

    .line 329
    .line 330
    if-nez v2, :cond_0

    .line 331
    .line 332
    iget-object v2, v1, La/f9q0;->b:La/smk0;

    .line 333
    .line 334
    if-nez v2, :cond_0

    .line 335
    .line 336
    iget-object v2, v1, La/f9q0;->c:La/smk0;

    .line 337
    .line 338
    if-nez v2, :cond_0

    .line 339
    .line 340
    iget-object v1, v1, La/f9q0;->d:La/smk0;

    .line 341
    .line 342
    if-nez v1, :cond_0

    .line 343
    .line 344
    goto :goto_0

    .line 345
    :cond_0
    new-instance v1, La/i83;

    .line 346
    .line 347
    iget-object v2, v0, La/i83;->a:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    check-cast v2, La/kb00;

    .line 353
    .line 354
    invoke-virtual {v2}, La/kb00;->b()La/f9q0;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    if-eqz v2, :cond_1

    .line 359
    .line 360
    iget-object v2, v2, La/f9q0;->a:La/smk0;

    .line 361
    .line 362
    if-nez v2, :cond_2

    .line 363
    .line 364
    :cond_1
    new-instance v3, La/smk0;

    .line 365
    .line 366
    const/16 v22, 0x0

    .line 367
    .line 368
    const v23, 0xffff

    .line 369
    .line 370
    .line 371
    const-wide/16 v4, 0x0

    .line 372
    .line 373
    const-wide/16 v6, 0x0

    .line 374
    .line 375
    const/4 v8, 0x0

    .line 376
    const/4 v9, 0x0

    .line 377
    const/4 v10, 0x0

    .line 378
    const/4 v11, 0x0

    .line 379
    const/4 v12, 0x0

    .line 380
    const-wide/16 v13, 0x0

    .line 381
    .line 382
    const/4 v15, 0x0

    .line 383
    const/16 v16, 0x0

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const-wide/16 v18, 0x0

    .line 388
    .line 389
    const/16 v20, 0x0

    .line 390
    .line 391
    const/16 v21, 0x0

    .line 392
    .line 393
    invoke-direct/range {v3 .. v23}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 394
    .line 395
    .line 396
    move-object v2, v3

    .line 397
    :cond_2
    iget v3, v0, La/i83;->b:I

    .line 398
    .line 399
    iget v4, v0, La/i83;->c:I

    .line 400
    .line 401
    invoke-direct {v1, v3, v4, v2}, La/i83;-><init>(IILjava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    filled-new-array {v0, v1}, [La/i83;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    goto :goto_1

    .line 413
    :cond_3
    :goto_0
    filled-new-array {v0}, [La/i83;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    :goto_1
    return-object v0

    .line 422
    :pswitch_f
    move-object/from16 v0, p1

    .line 423
    .line 424
    check-cast v0, La/a9q0;

    .line 425
    .line 426
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    return-object v0

    .line 429
    :pswitch_10
    move-object/from16 v0, p1

    .line 430
    .line 431
    check-cast v0, La/j3x;

    .line 432
    .line 433
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object v0

    .line 436
    :pswitch_11
    move-object/from16 v0, p1

    .line 437
    .line 438
    check-cast v0, Ljava/util/List;

    .line 439
    .line 440
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_12
    move-object/from16 v0, p1

    .line 444
    .line 445
    check-cast v0, La/j3x;

    .line 446
    .line 447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_13
    move-object/from16 v0, p1

    .line 451
    .line 452
    check-cast v0, Ljava/util/List;

    .line 453
    .line 454
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    return-object v0

    .line 457
    :pswitch_14
    move-object/from16 v0, p1

    .line 458
    .line 459
    check-cast v0, Ljava/lang/String;

    .line 460
    .line 461
    sget v1, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->j2:I

    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object v0

    .line 469
    :pswitch_15
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, La/a8q0;

    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_16
    move-object/from16 v0, p1

    .line 477
    .line 478
    check-cast v0, Ljava/util/List;

    .line 479
    .line 480
    new-instance v1, La/d7q0;

    .line 481
    .line 482
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    check-cast v2, Ljava/lang/Boolean;

    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_4

    .line 496
    .line 497
    sget-object v2, La/ma80;->a:La/ma80;

    .line 498
    .line 499
    goto :goto_2

    .line 500
    :cond_4
    sget-object v2, La/ma80;->b:La/ma80;

    .line 501
    .line 502
    :goto_2
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    check-cast v0, Ljava/lang/Float;

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    invoke-direct {v1, v2, v0}, La/d7q0;-><init>(La/ma80;F)V

    .line 516
    .line 517
    .line 518
    return-object v1

    .line 519
    :pswitch_17
    move-object/from16 v0, p1

    .line 520
    .line 521
    check-cast v0, La/z6q0;

    .line 522
    .line 523
    invoke-virtual {v0}, La/z6q0;->b()Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    if-eqz v1, :cond_5

    .line 528
    .line 529
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    new-instance v3, La/g6k;

    .line 534
    .line 535
    iget-wide v7, v0, La/z6q0;->f:J

    .line 536
    .line 537
    sget v0, La/o9q0;->c:I

    .line 538
    .line 539
    and-long/2addr v4, v7

    .line 540
    long-to-int v0, v4

    .line 541
    sub-int/2addr v1, v0

    .line 542
    invoke-direct {v3, v6, v1}, La/g6k;-><init>(II)V

    .line 543
    .line 544
    .line 545
    :cond_5
    return-object v3

    .line 546
    :pswitch_18
    move-object/from16 v0, p1

    .line 547
    .line 548
    check-cast v0, La/z6q0;

    .line 549
    .line 550
    invoke-virtual {v0}, La/z6q0;->c()Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    if-eqz v1, :cond_6

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    new-instance v3, La/g6k;

    .line 561
    .line 562
    iget-wide v7, v0, La/z6q0;->f:J

    .line 563
    .line 564
    sget v0, La/o9q0;->c:I

    .line 565
    .line 566
    and-long/2addr v4, v7

    .line 567
    long-to-int v0, v4

    .line 568
    sub-int/2addr v0, v1

    .line 569
    invoke-direct {v3, v0, v6}, La/g6k;-><init>(II)V

    .line 570
    .line 571
    .line 572
    :cond_6
    return-object v3

    .line 573
    :pswitch_19
    move-object/from16 v0, p1

    .line 574
    .line 575
    check-cast v0, La/z6q0;

    .line 576
    .line 577
    invoke-virtual {v0}, La/z6q0;->d()Ljava/lang/Integer;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    if-eqz v1, :cond_7

    .line 582
    .line 583
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v1

    .line 587
    new-instance v3, La/g6k;

    .line 588
    .line 589
    iget-wide v7, v0, La/z6q0;->f:J

    .line 590
    .line 591
    sget v0, La/o9q0;->c:I

    .line 592
    .line 593
    and-long/2addr v4, v7

    .line 594
    long-to-int v0, v4

    .line 595
    sub-int/2addr v1, v0

    .line 596
    invoke-direct {v3, v6, v1}, La/g6k;-><init>(II)V

    .line 597
    .line 598
    .line 599
    :cond_7
    return-object v3

    .line 600
    :pswitch_1a
    move-object/from16 v0, p1

    .line 601
    .line 602
    check-cast v0, La/z6q0;

    .line 603
    .line 604
    invoke-virtual {v0}, La/z6q0;->e()Ljava/lang/Integer;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    if-eqz v1, :cond_8

    .line 609
    .line 610
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    new-instance v3, La/g6k;

    .line 615
    .line 616
    iget-wide v7, v0, La/z6q0;->f:J

    .line 617
    .line 618
    sget v0, La/o9q0;->c:I

    .line 619
    .line 620
    and-long/2addr v4, v7

    .line 621
    long-to-int v0, v4

    .line 622
    sub-int/2addr v0, v1

    .line 623
    invoke-direct {v3, v0, v6}, La/g6k;-><init>(II)V

    .line 624
    .line 625
    .line 626
    :cond_8
    return-object v3

    .line 627
    :pswitch_1b
    move-object/from16 v0, p1

    .line 628
    .line 629
    check-cast v0, La/z6q0;

    .line 630
    .line 631
    iget-object v2, v0, La/z6q0;->g:La/j83;

    .line 632
    .line 633
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 634
    .line 635
    iget-wide v7, v0, La/z6q0;->f:J

    .line 636
    .line 637
    sget v9, La/o9q0;->c:I

    .line 638
    .line 639
    and-long/2addr v7, v4

    .line 640
    long-to-int v7, v7

    .line 641
    invoke-static {v7, v2}, La/osm0;->i(ILjava/lang/String;)I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    if-eq v2, v1, :cond_9

    .line 646
    .line 647
    new-instance v3, La/g6k;

    .line 648
    .line 649
    iget-wide v0, v0, La/z6q0;->f:J

    .line 650
    .line 651
    and-long/2addr v0, v4

    .line 652
    long-to-int v0, v0

    .line 653
    sub-int/2addr v2, v0

    .line 654
    invoke-direct {v3, v6, v2}, La/g6k;-><init>(II)V

    .line 655
    .line 656
    .line 657
    :cond_9
    return-object v3

    .line 658
    :pswitch_1c
    move-object/from16 v0, p1

    .line 659
    .line 660
    check-cast v0, La/z6q0;

    .line 661
    .line 662
    iget-object v2, v0, La/z6q0;->g:La/j83;

    .line 663
    .line 664
    iget-object v2, v2, La/j83;->b:Ljava/lang/String;

    .line 665
    .line 666
    iget-wide v7, v0, La/z6q0;->f:J

    .line 667
    .line 668
    sget v9, La/o9q0;->c:I

    .line 669
    .line 670
    and-long/2addr v7, v4

    .line 671
    long-to-int v7, v7

    .line 672
    if-gtz v7, :cond_a

    .line 673
    .line 674
    :goto_3
    move v2, v1

    .line 675
    goto :goto_4

    .line 676
    :cond_a
    invoke-static {}, La/osm0;->k()La/qsn;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    if-nez v8, :cond_c

    .line 681
    .line 682
    if-gtz v7, :cond_b

    .line 683
    .line 684
    goto :goto_3

    .line 685
    :cond_b
    invoke-static {v2, v7, v1}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    goto :goto_4

    .line 690
    :cond_c
    add-int/lit8 v9, v7, -0x1

    .line 691
    .line 692
    invoke-virtual {v8, v9, v2}, La/qsn;->b(ILjava/lang/CharSequence;)I

    .line 693
    .line 694
    .line 695
    move-result v8

    .line 696
    if-gez v8, :cond_e

    .line 697
    .line 698
    if-gtz v7, :cond_d

    .line 699
    .line 700
    goto :goto_3

    .line 701
    :cond_d
    invoke-static {v2, v7, v1}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    goto :goto_4

    .line 706
    :cond_e
    move v2, v8

    .line 707
    :goto_4
    if-ne v2, v1, :cond_f

    .line 708
    .line 709
    goto :goto_5

    .line 710
    :cond_f
    new-instance v3, La/g6k;

    .line 711
    .line 712
    iget-wide v0, v0, La/z6q0;->f:J

    .line 713
    .line 714
    and-long/2addr v0, v4

    .line 715
    long-to-int v0, v0

    .line 716
    sub-int/2addr v0, v2

    .line 717
    invoke-direct {v3, v0, v6}, La/g6k;-><init>(II)V

    .line 718
    .line 719
    .line 720
    :goto_5
    return-object v3

    .line 721
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
