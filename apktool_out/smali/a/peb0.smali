.class public final synthetic La/peb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/peb0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/kd30;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput-byte p1, p0, La/peb0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/peb0;->a:B

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p1

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Void;

    .line 14
    .line 15
    sget-object v0, La/lyb0;->b:La/lyb0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 26
    .line 27
    new-instance v3, Landroid/view/ContextThemeWrapper;

    .line 28
    .line 29
    const v4, 0x7f1407de

    .line 30
    .line 31
    .line 32
    invoke-direct {v3, v0, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v3, v2}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_1
    move-object/from16 v5, p1

    .line 40
    .line 41
    check-cast v5, La/fhl;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 47
    .line 48
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 53
    .line 54
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v16, 0x7e

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    const-wide/16 v10, 0x0

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    invoke-static/range {v5 .. v16}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_2
    move-object/from16 v0, p1

    .line 75
    .line 76
    check-cast v0, La/fee;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/String;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_3
    move-object/from16 v0, p1

    .line 89
    .line 90
    check-cast v0, La/fee;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/a5w;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_4
    move-object/from16 v0, p1

    .line 103
    .line 104
    check-cast v0, La/fee;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/cit0;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_5
    move-object/from16 v0, p1

    .line 117
    .line 118
    check-cast v0, La/fee;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_6
    move-object/from16 v0, p1

    .line 134
    .line 135
    check-cast v0, La/fee;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Ljava/util/List;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_7
    move-object/from16 v0, p1

    .line 148
    .line 149
    check-cast v0, La/fee;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Ljava/util/List;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_8
    move-object/from16 v0, p1

    .line 162
    .line 163
    check-cast v0, La/fee;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, La/sob0;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_9
    move-object/from16 v0, p1

    .line 176
    .line 177
    check-cast v0, La/fee;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, La/ql5;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_a
    move-object/from16 v0, p1

    .line 190
    .line 191
    check-cast v0, La/rmb0;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_0

    .line 198
    .line 199
    invoke-virtual {v0}, La/rmb0;->r()V

    .line 200
    .line 201
    .line 202
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_b
    move-object/from16 v0, p1

    .line 206
    .line 207
    check-cast v0, La/ckv;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v1, La/yib0;

    .line 213
    .line 214
    invoke-direct {v1, v0}, La/yib0;-><init>(La/ckv;)V

    .line 215
    .line 216
    .line 217
    return-object v1

    .line 218
    :pswitch_c
    move-object/from16 v0, p1

    .line 219
    .line 220
    check-cast v0, La/n1g;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance v1, La/jr2;

    .line 226
    .line 227
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 231
    .line 232
    sget-object v1, La/l1g;->b:La/l1g;

    .line 233
    .line 234
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 235
    .line 236
    sget-object v1, La/k1g;->b:La/k1g;

    .line 237
    .line 238
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 239
    .line 240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_d
    move-object/from16 v0, p1

    .line 244
    .line 245
    check-cast v0, La/ql5;

    .line 246
    .line 247
    if-eqz v0, :cond_1

    .line 248
    .line 249
    iget-object v2, v0, La/ql5;->f:Ljava/lang/String;

    .line 250
    .line 251
    :cond_1
    if-nez v2, :cond_2

    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_2
    move-object v1, v2

    .line 255
    :goto_0
    return-object v1

    .line 256
    :pswitch_e
    move-object/from16 v0, p1

    .line 257
    .line 258
    check-cast v0, La/ql5;

    .line 259
    .line 260
    if-eqz v0, :cond_3

    .line 261
    .line 262
    sget-object v2, La/pn40;->a:La/pn40;

    .line 263
    .line 264
    iget-wide v2, v0, La/ql5;->b:D

    .line 265
    .line 266
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 267
    .line 268
    invoke-static {v2, v3, v0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    :cond_3
    if-nez v2, :cond_4

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_4
    move-object v1, v2

    .line 276
    :goto_1
    return-object v1

    .line 277
    :pswitch_f
    move-object/from16 v0, p1

    .line 278
    .line 279
    check-cast v0, Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    sget-object v1, La/aoo0;->a:La/s9m0;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {v0}, La/s9m0;->g(Ljava/lang/String;)La/aoo0;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :pswitch_10
    move-object/from16 v0, p1

    .line 295
    .line 296
    check-cast v0, Ljava/util/List;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0

    .line 306
    :pswitch_11
    move-object/from16 v0, p1

    .line 307
    .line 308
    check-cast v0, La/skb0;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_12
    move-object/from16 v0, p1

    .line 312
    .line 313
    check-cast v0, La/idb0;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-boolean v1, v0, La/idb0;->a:Z

    .line 319
    .line 320
    if-eqz v1, :cond_5

    .line 321
    .line 322
    sget-object v2, La/gdb0;->a:La/gdb0;

    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_5
    iget-boolean v1, v0, La/idb0;->b:Z

    .line 326
    .line 327
    if-eqz v1, :cond_6

    .line 328
    .line 329
    sget-object v2, La/cdb0;->a:La/cdb0;

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_6
    iget-boolean v1, v0, La/idb0;->c:Z

    .line 333
    .line 334
    if-eqz v1, :cond_7

    .line 335
    .line 336
    iget-boolean v1, v0, La/idb0;->d:Z

    .line 337
    .line 338
    if-nez v1, :cond_7

    .line 339
    .line 340
    sget-object v2, La/bdb0;->a:La/bdb0;

    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_7
    iget-boolean v1, v0, La/idb0;->e:Z

    .line 344
    .line 345
    if-eqz v1, :cond_8

    .line 346
    .line 347
    sget-object v2, La/edb0;->a:La/edb0;

    .line 348
    .line 349
    goto :goto_2

    .line 350
    :cond_8
    iget-boolean v1, v0, La/idb0;->g:Z

    .line 351
    .line 352
    if-eqz v1, :cond_9

    .line 353
    .line 354
    sget-object v2, La/ddb0;->a:La/ddb0;

    .line 355
    .line 356
    goto :goto_2

    .line 357
    :cond_9
    iget-boolean v0, v0, La/idb0;->f:Z

    .line 358
    .line 359
    if-eqz v0, :cond_a

    .line 360
    .line 361
    sget-object v2, La/fdb0;->a:La/fdb0;

    .line 362
    .line 363
    :cond_a
    :goto_2
    return-object v2

    .line 364
    :pswitch_13
    move-object/from16 v3, p1

    .line 365
    .line 366
    check-cast v3, La/fhl;

    .line 367
    .line 368
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 372
    .line 373
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 378
    .line 379
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 380
    .line 381
    .line 382
    move-result-wide v4

    .line 383
    const/4 v13, 0x0

    .line 384
    const/16 v14, 0x7e

    .line 385
    .line 386
    const-wide/16 v6, 0x0

    .line 387
    .line 388
    const-wide/16 v8, 0x0

    .line 389
    .line 390
    const/4 v10, 0x0

    .line 391
    const/4 v11, 0x0

    .line 392
    const/4 v12, 0x0

    .line 393
    invoke-static/range {v3 .. v14}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_14
    move-object/from16 v1, p1

    .line 400
    .line 401
    check-cast v1, La/fhl;

    .line 402
    .line 403
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 407
    .line 408
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 413
    .line 414
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 415
    .line 416
    .line 417
    move-result-wide v2

    .line 418
    const/4 v11, 0x0

    .line 419
    const/16 v12, 0x7e

    .line 420
    .line 421
    const-wide/16 v4, 0x0

    .line 422
    .line 423
    const-wide/16 v6, 0x0

    .line 424
    .line 425
    const/4 v8, 0x0

    .line 426
    const/4 v9, 0x0

    .line 427
    const/4 v10, 0x0

    .line 428
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 429
    .line 430
    .line 431
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_15
    move-object/from16 v1, p1

    .line 435
    .line 436
    check-cast v1, La/i8z;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    sget-object v5, La/ccq0;->f:La/ugd;

    .line 442
    .line 443
    const/16 v6, 0xe

    .line 444
    .line 445
    const/4 v2, 0x6

    .line 446
    const/4 v3, 0x0

    .line 447
    const/4 v4, 0x0

    .line 448
    invoke-static/range {v1 .. v6}, La/i8z;->f(La/i8z;ILa/oea;La/oea;La/ugd;I)V

    .line 449
    .line 450
    .line 451
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_16
    move-object/from16 v1, p1

    .line 455
    .line 456
    check-cast v1, La/hcz;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v5, La/ccq0;->e:La/ugd;

    .line 462
    .line 463
    const/4 v6, 0x6

    .line 464
    const/4 v2, 0x2

    .line 465
    const/4 v3, 0x0

    .line 466
    const/4 v4, 0x0

    .line 467
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 468
    .line 469
    .line 470
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_17
    move-object/from16 v0, p1

    .line 474
    .line 475
    check-cast v0, La/pkb0;

    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object v0

    .line 483
    :pswitch_18
    move-object/from16 v0, p1

    .line 484
    .line 485
    check-cast v0, La/pi9;

    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    sget-object v1, La/qmk;->a:La/zcl;

    .line 491
    .line 492
    const/high16 v1, 0x41000000    # 8.0f

    .line 493
    .line 494
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    mul-float/2addr v2, v1

    .line 499
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    int-to-long v3, v1

    .line 504
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    int-to-long v1, v1

    .line 509
    const/16 v5, 0x20

    .line 510
    .line 511
    shl-long/2addr v3, v5

    .line 512
    const-wide v5, 0xffffffffL

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    and-long/2addr v1, v5

    .line 518
    or-long/2addr v1, v3

    .line 519
    new-instance v3, La/r2a0;

    .line 520
    .line 521
    const/4 v4, 0x2

    .line 522
    invoke-direct {v3, v4, v1, v2}, La/r2a0;-><init>(BJ)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v3}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    return-object v0

    .line 530
    :pswitch_19
    move-object/from16 v1, p1

    .line 531
    .line 532
    check-cast v1, La/fhl;

    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 538
    .line 539
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 544
    .line 545
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 546
    .line 547
    .line 548
    move-result-wide v2

    .line 549
    const/4 v11, 0x0

    .line 550
    const/16 v12, 0x7e

    .line 551
    .line 552
    const-wide/16 v4, 0x0

    .line 553
    .line 554
    const-wide/16 v6, 0x0

    .line 555
    .line 556
    const/4 v8, 0x0

    .line 557
    const/4 v9, 0x0

    .line 558
    const/4 v10, 0x0

    .line 559
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 560
    .line 561
    .line 562
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    return-object v0

    .line 565
    :pswitch_1a
    move-object/from16 v1, p1

    .line 566
    .line 567
    check-cast v1, La/fhl;

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 573
    .line 574
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 579
    .line 580
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 581
    .line 582
    .line 583
    move-result-wide v2

    .line 584
    const/4 v11, 0x0

    .line 585
    const/16 v12, 0x7e

    .line 586
    .line 587
    const-wide/16 v4, 0x0

    .line 588
    .line 589
    const-wide/16 v6, 0x0

    .line 590
    .line 591
    const/4 v8, 0x0

    .line 592
    const/4 v9, 0x0

    .line 593
    const/4 v10, 0x0

    .line 594
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 595
    .line 596
    .line 597
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_1b
    move-object/from16 v0, p1

    .line 601
    .line 602
    check-cast v0, La/m1r;

    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    new-instance v1, Lorg/xplatform/popular_classic/impl/navigation/PopularClassicScreenFactoryImpl$getScreen$1;

    .line 608
    .line 609
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v0}, Lorg/xplatform/popular_classic/impl/navigation/PopularClassicScreenFactoryImpl$getScreen$1;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    return-object v0

    .line 617
    :pswitch_1c
    move-object/from16 v0, p1

    .line 618
    .line 619
    check-cast v0, La/oeb0;

    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    sget-object v1, La/sre0;->a:La/tre0;

    .line 629
    .line 630
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    return-object v0

    .line 635
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
