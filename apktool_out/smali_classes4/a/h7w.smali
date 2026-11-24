.class public final synthetic La/h7w;
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
    iput-byte p1, p0, La/h7w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mie0;)V
    .locals 0

    .line 1
    const/16 p1, 0xe

    iput-byte p1, p0, La/h7w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/h7w;->a:B

    .line 4
    .line 5
    const v1, 0x7f131681

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    const/16 v3, 0x2d

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Character;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v5, v6

    .line 29
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v0, p1

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Character;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne v0, v3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v5, v6

    .line 46
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :pswitch_1
    move-object/from16 v0, p1

    .line 52
    .line 53
    check-cast v0, La/y130;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v1, La/nhx;

    .line 59
    .line 60
    invoke-direct {v1, v0}, La/nhx;-><init>(La/y130;)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_2
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, Ljava/lang/Throwable;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_3
    move-object/from16 v0, p1

    .line 78
    .line 79
    check-cast v0, Ljava/lang/Throwable;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_4
    move-object/from16 v0, p1

    .line 91
    .line 92
    check-cast v0, La/zdo;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v1, La/sre0;->a:La/tre0;

    .line 102
    .line 103
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0

    .line 108
    :pswitch_5
    move-object/from16 v0, p1

    .line 109
    .line 110
    check-cast v0, La/zdo;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, La/zdo;->a()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0

    .line 120
    :pswitch_6
    move-object/from16 v1, p1

    .line 121
    .line 122
    check-cast v1, La/fhl;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 128
    .line 129
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 134
    .line 135
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    const/4 v11, 0x0

    .line 140
    const/16 v12, 0x7e

    .line 141
    .line 142
    const-wide/16 v4, 0x0

    .line 143
    .line 144
    const-wide/16 v6, 0x0

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_7
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, La/fhl;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 163
    .line 164
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 169
    .line 170
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    const/4 v10, 0x0

    .line 175
    const/16 v11, 0xfe

    .line 176
    .line 177
    const-wide/16 v4, 0x0

    .line 178
    .line 179
    const-wide/16 v6, 0x0

    .line 180
    .line 181
    const-wide/16 v8, 0x0

    .line 182
    .line 183
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 184
    .line 185
    .line 186
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_8
    move-object/from16 v0, p1

    .line 190
    .line 191
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_9
    move-object/from16 v0, p1

    .line 200
    .line 201
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_a
    move-object/from16 v0, p1

    .line 210
    .line 211
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_b
    move-object/from16 v0, p1

    .line 220
    .line 221
    check-cast v0, La/ou90;

    .line 222
    .line 223
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_c
    move-object/from16 v0, p1

    .line 227
    .line 228
    check-cast v0, La/g7z;

    .line 229
    .line 230
    invoke-virtual {v0}, La/g7z;->a()V

    .line 231
    .line 232
    .line 233
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_d
    move-object/from16 v0, p1

    .line 237
    .line 238
    check-cast v0, La/abi0;

    .line 239
    .line 240
    invoke-static {v0, v6}, La/yai0;->e(La/abi0;I)V

    .line 241
    .line 242
    .line 243
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_e
    move-object/from16 v0, p1

    .line 247
    .line 248
    check-cast v0, La/qsw;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_f
    move-object/from16 v0, p1

    .line 257
    .line 258
    check-cast v0, Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_10
    move-object/from16 v0, p1

    .line 267
    .line 268
    check-cast v0, Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_11
    move-object/from16 v0, p1

    .line 277
    .line 278
    check-cast v0, La/cp;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    new-instance v1, La/b1w;

    .line 284
    .line 285
    const/4 v2, 0x4

    .line 286
    invoke-direct {v1, v0, v2}, La/b1w;-><init>(La/cp;B)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_12
    move-object/from16 v0, p1

    .line 296
    .line 297
    check-cast v0, Landroid/content/Context;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 303
    .line 304
    invoke-direct {v1, v0, v4, v6}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 305
    .line 306
    .line 307
    new-instance v0, La/pow;

    .line 308
    .line 309
    const v2, 0x7f07074a

    .line 310
    .line 311
    .line 312
    invoke-direct {v0, v1, v5, v2}, La/k5;-><init>(La/nmo0;ZI)V

    .line 313
    .line 314
    .line 315
    iput-object v1, v0, La/pow;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 316
    .line 317
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 318
    .line 319
    .line 320
    return-object v1

    .line 321
    :pswitch_13
    move-object/from16 v0, p1

    .line 322
    .line 323
    check-cast v0, La/sjd;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v1, La/rjw;

    .line 329
    .line 330
    invoke-direct {v1, v0}, La/rjw;-><init>(La/sjd;)V

    .line 331
    .line 332
    .line 333
    return-object v1

    .line 334
    :pswitch_14
    move-object/from16 v0, p1

    .line 335
    .line 336
    check-cast v0, La/n1g;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    sget-object v1, La/j1g;->d:La/j1g;

    .line 342
    .line 343
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 344
    .line 345
    new-instance v1, La/tq2;

    .line 346
    .line 347
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 348
    .line 349
    .line 350
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 351
    .line 352
    sget-object v1, La/l1g;->b:La/l1g;

    .line 353
    .line 354
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 355
    .line 356
    sget-object v1, La/k1g;->b:La/k1g;

    .line 357
    .line 358
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 359
    .line 360
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_15
    move-object/from16 v0, p1

    .line 364
    .line 365
    check-cast v0, La/sjd;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    new-instance v1, La/qjw;

    .line 371
    .line 372
    invoke-direct {v1, v0}, La/qjw;-><init>(La/sjd;)V

    .line 373
    .line 374
    .line 375
    return-object v1

    .line 376
    :pswitch_16
    move-object/from16 v0, p1

    .line 377
    .line 378
    check-cast v0, La/n1g;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    sget-object v1, La/j1g;->d:La/j1g;

    .line 384
    .line 385
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 386
    .line 387
    new-instance v1, La/rq2;

    .line 388
    .line 389
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 390
    .line 391
    .line 392
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 393
    .line 394
    sget-object v1, La/l1g;->b:La/l1g;

    .line 395
    .line 396
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 397
    .line 398
    sget-object v1, La/k1g;->d:La/k1g;

    .line 399
    .line 400
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 401
    .line 402
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_17
    move-object/from16 v0, p1

    .line 406
    .line 407
    check-cast v0, Ljava/lang/Boolean;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    new-instance v1, La/cjw;

    .line 414
    .line 415
    new-instance v2, La/n0x;

    .line 416
    .line 417
    new-instance v3, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 420
    .line 421
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 425
    .line 426
    const-string v7, "static/img/ImgDefault/MMA/UFC/Logo.png"

    .line 427
    .line 428
    invoke-static {v7, v4, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    const-string v8, "/"

    .line 433
    .line 434
    const-string v9, "https://"

    .line 435
    .line 436
    const/16 v10, 0x2f

    .line 437
    .line 438
    if-nez v4, :cond_4

    .line 439
    .line 440
    invoke-static {v7, v9, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    if-eqz v4, :cond_2

    .line 445
    .line 446
    goto :goto_2

    .line 447
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-lez v4, :cond_3

    .line 452
    .line 453
    invoke-static {v3, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    if-nez v4, :cond_3

    .line 458
    .line 459
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    :cond_3
    new-array v4, v5, [C

    .line 463
    .line 464
    aput-char v10, v4, v6

    .line 465
    .line 466
    invoke-static {v7, v4}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    goto :goto_3

    .line 474
    :cond_4
    :goto_2
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    :goto_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-direct {v2, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    new-instance v3, La/n0x;

    .line 488
    .line 489
    new-instance v4, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 492
    .line 493
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    if-eqz v0, :cond_5

    .line 497
    .line 498
    const-string v0, "static/img/ImgDefault/MMA/UFC/Main_Screen/Background_Tablet.png"

    .line 499
    .line 500
    goto :goto_4

    .line 501
    :cond_5
    const-string v0, "static/img/ImgDefault/MMA/UFC/Main_Screen/Background.png"

    .line 502
    .line 503
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 504
    .line 505
    .line 506
    move-result v7

    .line 507
    if-nez v7, :cond_6

    .line 508
    .line 509
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 510
    .line 511
    .line 512
    goto :goto_6

    .line 513
    :cond_6
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 514
    .line 515
    invoke-static {v0, v7, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 516
    .line 517
    .line 518
    move-result v7

    .line 519
    if-nez v7, :cond_9

    .line 520
    .line 521
    invoke-static {v0, v9, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 522
    .line 523
    .line 524
    move-result v7

    .line 525
    if-eqz v7, :cond_7

    .line 526
    .line 527
    goto :goto_5

    .line 528
    :cond_7
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 529
    .line 530
    .line 531
    move-result v7

    .line 532
    if-lez v7, :cond_8

    .line 533
    .line 534
    invoke-static {v4, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 535
    .line 536
    .line 537
    move-result v7

    .line 538
    if-nez v7, :cond_8

    .line 539
    .line 540
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    :cond_8
    new-array v5, v5, [C

    .line 544
    .line 545
    aput-char v10, v5, v6

    .line 546
    .line 547
    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    goto :goto_6

    .line 555
    :cond_9
    :goto_5
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    :goto_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-direct {v3, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    invoke-direct {v1, v2, v3}, La/cjw;-><init>(La/n0x;La/n0x;)V

    .line 569
    .line 570
    .line 571
    return-object v1

    .line 572
    :pswitch_18
    move-object/from16 v0, p1

    .line 573
    .line 574
    check-cast v0, Ljava/lang/Throwable;

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_19
    move-object/from16 v0, p1

    .line 586
    .line 587
    check-cast v0, La/uew;

    .line 588
    .line 589
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object v0

    .line 595
    :pswitch_1a
    move-object/from16 v0, p1

    .line 596
    .line 597
    check-cast v0, Ljava/lang/Throwable;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 603
    .line 604
    invoke-static {}, La/uzb;->X()La/m9s;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    new-instance v1, La/j0g0;

    .line 609
    .line 610
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    return-object v1

    .line 614
    :pswitch_1b
    move-object/from16 v0, p1

    .line 615
    .line 616
    check-cast v0, Landroid/content/Context;

    .line 617
    .line 618
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    new-instance v3, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 622
    .line 623
    invoke-direct {v3, v0, v4, v2}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 624
    .line 625
    .line 626
    new-instance v7, La/nrv;

    .line 627
    .line 628
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    const v1, 0x7f1300e4

    .line 636
    .line 637
    .line 638
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    const v1, 0x7f0805be

    .line 643
    .line 644
    .line 645
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 646
    .line 647
    .line 648
    move-result-object v12

    .line 649
    const/4 v14, 0x0

    .line 650
    const/16 v15, 0xe6

    .line 651
    .line 652
    const/4 v9, 0x0

    .line 653
    const/4 v10, 0x0

    .line 654
    const/4 v13, 0x0

    .line 655
    invoke-direct/range {v7 .. v15}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v3, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    const v1, 0x7f0706ea

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    invoke-virtual {v3, v0, v6}, Lorg/xplatform/uikit/components/header/DsHeader;->c(II)V

    .line 673
    .line 674
    .line 675
    return-object v3

    .line 676
    :pswitch_1c
    move-object/from16 v0, p1

    .line 677
    .line 678
    check-cast v0, Landroid/content/Context;

    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    new-instance v3, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 684
    .line 685
    invoke-direct {v3, v0, v4, v2}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 686
    .line 687
    .line 688
    new-instance v5, La/nrv;

    .line 689
    .line 690
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v6

    .line 694
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    const/4 v12, 0x0

    .line 698
    const/16 v13, 0xfe

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/4 v8, 0x0

    .line 702
    const/4 v9, 0x0

    .line 703
    const/4 v10, 0x0

    .line 704
    const/4 v11, 0x0

    .line 705
    invoke-direct/range {v5 .. v13}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 709
    .line 710
    .line 711
    return-object v3

    .line 712
    nop

    .line 713
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
