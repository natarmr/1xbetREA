.class public final synthetic La/zo4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zo4;->a:B

    iput-object p1, p0, La/zo4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zo4;->a:B

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v4, "viewModelFactory"

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v0, v0, La/zo4;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, La/x68;

    .line 15
    .line 16
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v4, v0, La/x68;->b:La/a780;

    .line 22
    .line 23
    new-instance v6, La/u68;

    .line 24
    .line 25
    iget-object v7, v0, La/x68;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, La/y1x;

    .line 28
    .line 29
    invoke-interface {v7}, La/y1x;->V0()La/u99;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-direct {v6, v7}, La/u68;-><init>(La/emk0;)V

    .line 34
    .line 35
    .line 36
    new-instance v7, La/zae0;

    .line 37
    .line 38
    invoke-direct {v7, v6}, La/zae0;-><init>(La/emk0;)V

    .line 39
    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    iput-boolean v8, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 43
    .line 44
    invoke-virtual {v7}, La/zae0;->d()La/zae0;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    new-instance v10, La/e99;

    .line 49
    .line 50
    invoke-direct {v10, v9, v8}, La/e99;-><init>(Ljava/io/Closeable;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v10, v5, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 54
    .line 55
    .line 56
    iget-object v9, v6, La/u68;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Ljava/lang/Exception;

    .line 59
    .line 60
    if-nez v9, :cond_29

    .line 61
    .line 62
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 63
    .line 64
    sget-object v9, La/xko;->a:Landroid/graphics/Paint;

    .line 65
    .line 66
    iget-object v9, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, v0, La/x68;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/uko;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string v0, "image/jpeg"

    .line 76
    .line 77
    if-eqz v9, :cond_1

    .line 78
    .line 79
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_0

    .line 84
    .line 85
    const-string v10, "image/webp"

    .line 86
    .line 87
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-nez v10, :cond_0

    .line 92
    .line 93
    const-string v10, "image/heic"

    .line 94
    .line 95
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-nez v10, :cond_0

    .line 100
    .line 101
    const-string v10, "image/heif"

    .line 102
    .line 103
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_1

    .line 108
    .line 109
    :cond_0
    move v9, v8

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    move v9, v3

    .line 112
    :goto_0
    const/16 v10, 0x10e

    .line 113
    .line 114
    const/16 v11, 0x5a

    .line 115
    .line 116
    if-eqz v9, :cond_3

    .line 117
    .line 118
    new-instance v9, La/sko;

    .line 119
    .line 120
    new-instance v12, La/tko;

    .line 121
    .line 122
    invoke-virtual {v7}, La/zae0;->d()La/zae0;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    new-instance v14, La/e99;

    .line 127
    .line 128
    invoke-direct {v14, v13, v8}, La/e99;-><init>(Ljava/io/Closeable;B)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v12, v14}, La/tko;-><init>(Ljava/io/InputStream;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v9, v12}, La/sko;-><init>(Ljava/io/InputStream;)V

    .line 135
    .line 136
    .line 137
    new-instance v12, La/kko;

    .line 138
    .line 139
    const-string v13, "Orientation"

    .line 140
    .line 141
    invoke-virtual {v9, v8, v13}, La/sko;->d(ILjava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    const/4 v15, 0x2

    .line 146
    if-eq v14, v15, :cond_2

    .line 147
    .line 148
    const/4 v15, 0x7

    .line 149
    if-eq v14, v15, :cond_2

    .line 150
    .line 151
    const/4 v15, 0x4

    .line 152
    if-eq v14, v15, :cond_2

    .line 153
    .line 154
    const/4 v15, 0x5

    .line 155
    if-eq v14, v15, :cond_2

    .line 156
    .line 157
    move v14, v3

    .line 158
    goto :goto_1

    .line 159
    :cond_2
    move v14, v8

    .line 160
    :goto_1
    invoke-virtual {v9, v8, v13}, La/sko;->d(ILjava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    packed-switch v9, :pswitch_data_1

    .line 165
    .line 166
    .line 167
    move v9, v3

    .line 168
    goto :goto_2

    .line 169
    :pswitch_0
    move v9, v11

    .line 170
    goto :goto_2

    .line 171
    :pswitch_1
    move v9, v10

    .line 172
    goto :goto_2

    .line 173
    :pswitch_2
    const/16 v9, 0xb4

    .line 174
    .line 175
    :goto_2
    invoke-direct {v12, v14, v9}, La/kko;-><init>(ZI)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_3
    sget-object v12, La/kko;->c:La/kko;

    .line 180
    .line 181
    :goto_3
    iget v9, v12, La/kko;->a:I

    .line 182
    .line 183
    iget-boolean v12, v12, La/kko;->b:Z

    .line 184
    .line 185
    iget-object v13, v6, La/u68;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v13, Ljava/lang/Exception;

    .line 188
    .line 189
    if-nez v13, :cond_28

    .line 190
    .line 191
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 192
    .line 193
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 194
    .line 195
    const/16 v14, 0x1a

    .line 196
    .line 197
    if-lt v13, v14, :cond_4

    .line 198
    .line 199
    sget-object v15, La/t1x;->c:La/kuo;

    .line 200
    .line 201
    invoke-static {v4, v15}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v16

    .line 205
    invoke-static/range {v16 .. v16}, La/c0g;->c(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 206
    .line 207
    .line 208
    move-result-object v16

    .line 209
    if-eqz v16, :cond_4

    .line 210
    .line 211
    invoke-static {v4, v15}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    invoke-static {v15}, La/c0g;->c(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    invoke-static {v1, v15}, La/y24;->h(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 220
    .line 221
    .line 222
    :cond_4
    sget-object v15, La/t1x;->d:La/kuo;

    .line 223
    .line 224
    invoke-static {v4, v15}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    check-cast v15, Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v15

    .line 234
    iget-object v2, v4, La/a780;->a:Landroid/content/Context;

    .line 235
    .line 236
    iput-boolean v15, v1, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 237
    .line 238
    sget-object v15, La/t1x;->b:La/kuo;

    .line 239
    .line 240
    invoke-static {v4, v15}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    check-cast v15, Landroid/graphics/Bitmap$Config;

    .line 245
    .line 246
    if-nez v12, :cond_5

    .line 247
    .line 248
    if-lez v9, :cond_7

    .line 249
    .line 250
    :cond_5
    if-eqz v15, :cond_6

    .line 251
    .line 252
    invoke-static {v15}, La/cy2;->C(Landroid/graphics/Bitmap$Config;)Z

    .line 253
    .line 254
    .line 255
    move-result v17

    .line 256
    if-eqz v17, :cond_7

    .line 257
    .line 258
    :cond_6
    sget-object v15, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 259
    .line 260
    :cond_7
    sget-object v5, La/t1x;->h:La/kuo;

    .line 261
    .line 262
    invoke-static {v4, v5}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    check-cast v5, Ljava/lang/Boolean;

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_8

    .line 273
    .line 274
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 275
    .line 276
    if-ne v15, v5, :cond_8

    .line 277
    .line 278
    iget-object v5, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_8

    .line 285
    .line 286
    sget-object v15, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 287
    .line 288
    :cond_8
    if-lt v13, v14, :cond_9

    .line 289
    .line 290
    invoke-static {v1}, La/y24;->b(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {}, La/y6;->d()Landroid/graphics/Bitmap$Config;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    if-ne v0, v5, :cond_9

    .line 299
    .line 300
    invoke-static {}, La/y6;->B()Landroid/graphics/Bitmap$Config;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-eq v15, v0, :cond_9

    .line 305
    .line 306
    invoke-static {}, La/y6;->d()Landroid/graphics/Bitmap$Config;

    .line 307
    .line 308
    .line 309
    move-result-object v15

    .line 310
    :cond_9
    iput-object v15, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 311
    .line 312
    iget v0, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 313
    .line 314
    if-lez v0, :cond_1a

    .line 315
    .line 316
    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 317
    .line 318
    if-gtz v5, :cond_a

    .line 319
    .line 320
    move-object v0, v2

    .line 321
    move v10, v8

    .line 322
    move/from16 v21, v9

    .line 323
    .line 324
    move/from16 v20, v12

    .line 325
    .line 326
    goto/16 :goto_c

    .line 327
    .line 328
    :cond_a
    if-eq v9, v11, :cond_c

    .line 329
    .line 330
    if-ne v9, v10, :cond_b

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_b
    move v13, v0

    .line 334
    goto :goto_5

    .line 335
    :cond_c
    :goto_4
    move v13, v5

    .line 336
    :goto_5
    if-eq v9, v11, :cond_e

    .line 337
    .line 338
    if-ne v9, v10, :cond_d

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_d
    move v0, v5

    .line 342
    :cond_e
    :goto_6
    iget-object v5, v4, La/a780;->b:La/f7k0;

    .line 343
    .line 344
    iget-object v14, v4, La/a780;->c:La/j1h0;

    .line 345
    .line 346
    sget-object v15, La/q1x;->b:La/kuo;

    .line 347
    .line 348
    invoke-static {v4, v15}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v18

    .line 352
    move-object/from16 v10, v18

    .line 353
    .line 354
    check-cast v10, La/f7k0;

    .line 355
    .line 356
    invoke-static {v13, v0, v5, v14, v10}, La/u1c;->z(IILa/f7k0;La/j1h0;La/f7k0;)J

    .line 357
    .line 358
    .line 359
    move-result-wide v18

    .line 360
    const/16 v5, 0x20

    .line 361
    .line 362
    move/from16 v20, v12

    .line 363
    .line 364
    shr-long v11, v18, v5

    .line 365
    .line 366
    long-to-int v5, v11

    .line 367
    const-wide v11, 0xffffffffL

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    and-long v11, v18, v11

    .line 373
    .line 374
    long-to-int v11, v11

    .line 375
    div-int v12, v13, v5

    .line 376
    .line 377
    invoke-static {v12}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 378
    .line 379
    .line 380
    move-result v12

    .line 381
    div-int v18, v0, v11

    .line 382
    .line 383
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    if-eqz v3, :cond_10

    .line 392
    .line 393
    if-ne v3, v8, :cond_f

    .line 394
    .line 395
    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    goto :goto_8

    .line 400
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 401
    .line 402
    .line 403
    :goto_7
    const/4 v5, 0x0

    .line 404
    goto/16 :goto_15

    .line 405
    .line 406
    :cond_10
    invoke-static {v12, v10}, Ljava/lang/Math;->min(II)I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    :goto_8
    if-ge v3, v8, :cond_11

    .line 411
    .line 412
    move v3, v8

    .line 413
    :cond_11
    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 414
    .line 415
    int-to-double v12, v13

    .line 416
    move/from16 v21, v9

    .line 417
    .line 418
    int-to-double v8, v3

    .line 419
    div-double/2addr v12, v8

    .line 420
    move v3, v11

    .line 421
    int-to-double v10, v0

    .line 422
    div-double v8, v10, v8

    .line 423
    .line 424
    int-to-double v10, v5

    .line 425
    move-object v0, v2

    .line 426
    int-to-double v2, v3

    .line 427
    invoke-static {v4, v15}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, La/f7k0;

    .line 432
    .line 433
    div-double/2addr v10, v12

    .line 434
    div-double/2addr v2, v8

    .line 435
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 436
    .line 437
    .line 438
    move-result v14

    .line 439
    if-eqz v14, :cond_13

    .line 440
    .line 441
    const/4 v15, 0x1

    .line 442
    if-ne v14, v15, :cond_12

    .line 443
    .line 444
    move-wide v14, v10

    .line 445
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 446
    .line 447
    .line 448
    move-result-wide v2

    .line 449
    goto :goto_9

    .line 450
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_13
    move-wide v14, v10

    .line 455
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 456
    .line 457
    .line 458
    move-result-wide v2

    .line 459
    :goto_9
    iget-object v11, v5, La/f7k0;->a:La/umk;

    .line 460
    .line 461
    instance-of v14, v11, La/rmk;

    .line 462
    .line 463
    if-eqz v14, :cond_14

    .line 464
    .line 465
    check-cast v11, La/rmk;

    .line 466
    .line 467
    iget v11, v11, La/rmk;->a:I

    .line 468
    .line 469
    int-to-double v14, v11

    .line 470
    div-double/2addr v14, v12

    .line 471
    cmpl-double v11, v2, v14

    .line 472
    .line 473
    if-lez v11, :cond_14

    .line 474
    .line 475
    move-wide v2, v14

    .line 476
    :cond_14
    iget-object v5, v5, La/f7k0;->b:La/umk;

    .line 477
    .line 478
    instance-of v11, v5, La/rmk;

    .line 479
    .line 480
    if-eqz v11, :cond_15

    .line 481
    .line 482
    check-cast v5, La/rmk;

    .line 483
    .line 484
    iget v5, v5, La/rmk;->a:I

    .line 485
    .line 486
    int-to-double v11, v5

    .line 487
    div-double/2addr v11, v8

    .line 488
    cmpl-double v5, v2, v11

    .line 489
    .line 490
    if-lez v5, :cond_15

    .line 491
    .line 492
    move-wide v2, v11

    .line 493
    :cond_15
    iget-object v4, v4, La/a780;->d:La/asb0;

    .line 494
    .line 495
    sget-object v5, La/asb0;->b:La/asb0;

    .line 496
    .line 497
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 498
    .line 499
    if-ne v4, v5, :cond_16

    .line 500
    .line 501
    cmpl-double v4, v2, v8

    .line 502
    .line 503
    if-lez v4, :cond_16

    .line 504
    .line 505
    move-wide v2, v8

    .line 506
    :cond_16
    cmpg-double v4, v2, v8

    .line 507
    .line 508
    if-nez v4, :cond_17

    .line 509
    .line 510
    const/4 v4, 0x1

    .line 511
    goto :goto_a

    .line 512
    :cond_17
    const/4 v4, 0x0

    .line 513
    :goto_a
    xor-int/lit8 v5, v4, 0x1

    .line 514
    .line 515
    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 516
    .line 517
    if-nez v4, :cond_18

    .line 518
    .line 519
    cmpl-double v4, v2, v8

    .line 520
    .line 521
    const v5, 0x7fffffff

    .line 522
    .line 523
    .line 524
    const-wide v8, 0x41dfffffffc00000L    # 2.147483647E9

    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    if-lez v4, :cond_19

    .line 530
    .line 531
    div-double/2addr v8, v2

    .line 532
    invoke-static {v8, v9}, La/si30;->a(D)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 537
    .line 538
    iput v5, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 539
    .line 540
    :cond_18
    :goto_b
    const/4 v10, 0x1

    .line 541
    goto :goto_d

    .line 542
    :cond_19
    iput v5, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 543
    .line 544
    mul-double/2addr v8, v2

    .line 545
    invoke-static {v8, v9}, La/si30;->a(D)I

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 550
    .line 551
    goto :goto_b

    .line 552
    :cond_1a
    move-object v0, v2

    .line 553
    move/from16 v21, v9

    .line 554
    .line 555
    move/from16 v20, v12

    .line 556
    .line 557
    move v10, v8

    .line 558
    :goto_c
    iput v10, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 559
    .line 560
    const/4 v2, 0x0

    .line 561
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 562
    .line 563
    :goto_d
    :try_start_0
    new-instance v2, La/e99;

    .line 564
    .line 565
    invoke-direct {v2, v7, v10}, La/e99;-><init>(Ljava/io/Closeable;B)V

    .line 566
    .line 567
    .line 568
    const/4 v3, 0x0

    .line 569
    invoke-static {v2, v3, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 570
    .line 571
    .line 572
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 573
    invoke-virtual {v7}, La/zae0;->close()V

    .line 574
    .line 575
    .line 576
    iget-object v3, v6, La/u68;->c:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v3, Ljava/lang/Exception;

    .line 579
    .line 580
    if-nez v3, :cond_27

    .line 581
    .line 582
    if-eqz v2, :cond_26

    .line 583
    .line 584
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    iget v3, v3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 593
    .line 594
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 595
    .line 596
    .line 597
    if-nez v20, :cond_1b

    .line 598
    .line 599
    if-lez v21, :cond_23

    .line 600
    .line 601
    :cond_1b
    new-instance v3, Landroid/graphics/Matrix;

    .line 602
    .line 603
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    int-to-float v4, v4

    .line 611
    const/high16 v5, 0x40000000    # 2.0f

    .line 612
    .line 613
    div-float/2addr v4, v5

    .line 614
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 615
    .line 616
    .line 617
    move-result v6

    .line 618
    int-to-float v6, v6

    .line 619
    div-float/2addr v6, v5

    .line 620
    if-eqz v20, :cond_1c

    .line 621
    .line 622
    const/high16 v5, -0x40800000    # -1.0f

    .line 623
    .line 624
    const/high16 v7, 0x3f800000    # 1.0f

    .line 625
    .line 626
    invoke-virtual {v3, v5, v7, v4, v6}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 627
    .line 628
    .line 629
    :cond_1c
    if-lez v21, :cond_1d

    .line 630
    .line 631
    move/from16 v5, v21

    .line 632
    .line 633
    int-to-float v7, v5

    .line 634
    invoke-virtual {v3, v7, v4, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 635
    .line 636
    .line 637
    goto :goto_e

    .line 638
    :cond_1d
    move/from16 v5, v21

    .line 639
    .line 640
    :goto_e
    new-instance v4, Landroid/graphics/RectF;

    .line 641
    .line 642
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 643
    .line 644
    .line 645
    move-result v6

    .line 646
    int-to-float v6, v6

    .line 647
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    int-to-float v7, v7

    .line 652
    const/4 v8, 0x0

    .line 653
    invoke-direct {v4, v8, v8, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 657
    .line 658
    .line 659
    iget v6, v4, Landroid/graphics/RectF;->left:F

    .line 660
    .line 661
    cmpg-float v7, v6, v8

    .line 662
    .line 663
    if-nez v7, :cond_1e

    .line 664
    .line 665
    iget v7, v4, Landroid/graphics/RectF;->top:F

    .line 666
    .line 667
    cmpg-float v7, v7, v8

    .line 668
    .line 669
    if-nez v7, :cond_1e

    .line 670
    .line 671
    :goto_f
    const/16 v4, 0x5a

    .line 672
    .line 673
    goto :goto_10

    .line 674
    :cond_1e
    neg-float v6, v6

    .line 675
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 676
    .line 677
    neg-float v4, v4

    .line 678
    invoke-virtual {v3, v6, v4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 679
    .line 680
    .line 681
    goto :goto_f

    .line 682
    :goto_10
    if-eq v5, v4, :cond_21

    .line 683
    .line 684
    const/16 v4, 0x10e

    .line 685
    .line 686
    if-ne v5, v4, :cond_1f

    .line 687
    .line 688
    goto :goto_11

    .line 689
    :cond_1f
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    if-nez v6, :cond_20

    .line 702
    .line 703
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 704
    .line 705
    :cond_20
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 706
    .line 707
    .line 708
    move-result-object v4

    .line 709
    goto :goto_12

    .line 710
    :cond_21
    :goto_11
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 719
    .line 720
    .line 721
    move-result-object v6

    .line 722
    if-nez v6, :cond_22

    .line 723
    .line 724
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 725
    .line 726
    :cond_22
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    :goto_12
    new-instance v5, Landroid/graphics/Canvas;

    .line 731
    .line 732
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 733
    .line 734
    .line 735
    sget-object v6, La/xko;->a:Landroid/graphics/Paint;

    .line 736
    .line 737
    invoke-virtual {v5, v2, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 741
    .line 742
    .line 743
    move-object v2, v4

    .line 744
    :cond_23
    new-instance v5, La/hkj;

    .line 745
    .line 746
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 751
    .line 752
    invoke-direct {v3, v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 753
    .line 754
    .line 755
    invoke-static {v3}, La/c3x;->r(Landroid/graphics/drawable/Drawable;)La/dyw;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 760
    .line 761
    const/4 v10, 0x1

    .line 762
    if-gt v2, v10, :cond_25

    .line 763
    .line 764
    iget-boolean v1, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 765
    .line 766
    if-eqz v1, :cond_24

    .line 767
    .line 768
    goto :goto_13

    .line 769
    :cond_24
    const/4 v3, 0x0

    .line 770
    goto :goto_14

    .line 771
    :cond_25
    :goto_13
    move v3, v10

    .line 772
    :goto_14
    invoke-direct {v5, v0, v3}, La/hkj;-><init>(La/dyw;Z)V

    .line 773
    .line 774
    .line 775
    goto :goto_15

    .line 776
    :cond_26
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 777
    .line 778
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    goto/16 :goto_7

    .line 782
    .line 783
    :goto_15
    return-object v5

    .line 784
    :cond_27
    throw v3

    .line 785
    :catchall_0
    move-exception v0

    .line 786
    move-object v1, v0

    .line 787
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 788
    :catchall_1
    move-exception v0

    .line 789
    invoke-static {v7, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 790
    .line 791
    .line 792
    throw v0

    .line 793
    :cond_28
    throw v13

    .line 794
    :cond_29
    throw v9

    .line 795
    :pswitch_3
    check-cast v0, La/e68;

    .line 796
    .line 797
    iget-object v0, v0, La/e68;->K1:La/fiu0;

    .line 798
    .line 799
    if-eqz v0, :cond_2a

    .line 800
    .line 801
    return-object v0

    .line 802
    :cond_2a
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    const/16 v17, 0x0

    .line 806
    .line 807
    throw v17

    .line 808
    :pswitch_4
    check-cast v0, La/oif0;

    .line 809
    .line 810
    new-instance v1, La/pu7;

    .line 811
    .line 812
    sget-object v3, La/cu7;->a:La/cu7;

    .line 813
    .line 814
    invoke-virtual {v0}, La/oif0;->u()J

    .line 815
    .line 816
    .line 817
    move-result-wide v4

    .line 818
    const/4 v6, 0x0

    .line 819
    sget-object v2, La/nqp0;->a:La/nqp0;

    .line 820
    .line 821
    invoke-direct/range {v1 .. v6}, La/pu7;-><init>(La/qqp0;La/cu7;JLa/a8h0;)V

    .line 822
    .line 823
    .line 824
    return-object v1

    .line 825
    :pswitch_5
    check-cast v0, La/nwh0;

    .line 826
    .line 827
    iget v0, v0, La/nwh0;->b:I

    .line 828
    .line 829
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    return-object v0

    .line 834
    :pswitch_6
    check-cast v0, La/xex;

    .line 835
    .line 836
    iget-object v0, v0, La/xex;->a:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v0, La/gii0;

    .line 839
    .line 840
    const-class v1, La/oj7;

    .line 841
    .line 842
    sget-object v2, La/sre0;->a:La/tre0;

    .line 843
    .line 844
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    check-cast v0, La/oj7;

    .line 853
    .line 854
    return-object v0

    .line 855
    :pswitch_7
    move-object v1, v0

    .line 856
    check-cast v1, La/kf7;

    .line 857
    .line 858
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 859
    .line 860
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 861
    .line 862
    :cond_2b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 870
    .line 871
    move-object v4, v0

    .line 872
    check-cast v4, La/hf7;

    .line 873
    .line 874
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    const/4 v8, 0x0

    .line 878
    const/16 v9, 0x1b

    .line 879
    .line 880
    const/4 v5, 0x0

    .line 881
    const/4 v6, 0x0

    .line 882
    const/4 v7, 0x0

    .line 883
    invoke-static/range {v4 .. v9}, La/hf7;->a(La/hf7;La/xrz;La/af7;ZLjava/lang/String;I)La/hf7;

    .line 884
    .line 885
    .line 886
    move-result-object v3

    .line 887
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-eqz v0, :cond_2b

    .line 892
    .line 893
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 894
    .line 895
    return-object v0

    .line 896
    :pswitch_8
    check-cast v0, La/yzn0;

    .line 897
    .line 898
    iget-object v0, v0, La/yzn0;->a:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v0, La/gii0;

    .line 901
    .line 902
    const-class v1, La/s37;

    .line 903
    .line 904
    sget-object v2, La/sre0;->a:La/tre0;

    .line 905
    .line 906
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    check-cast v0, La/s37;

    .line 915
    .line 916
    return-object v0

    .line 917
    :pswitch_9
    check-cast v0, La/as6;

    .line 918
    .line 919
    iget-object v0, v0, La/as6;->x:La/r9u;

    .line 920
    .line 921
    sget-object v1, La/ygp;->t:La/ygp;

    .line 922
    .line 923
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 927
    .line 928
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 932
    .line 933
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    return-object v0

    .line 942
    :pswitch_a
    check-cast v0, La/c5k;

    .line 943
    .line 944
    iget-object v0, v0, La/c5k;->a:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, La/gii0;

    .line 947
    .line 948
    const-class v1, La/tq6;

    .line 949
    .line 950
    sget-object v2, La/sre0;->a:La/tre0;

    .line 951
    .line 952
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    check-cast v0, La/tq6;

    .line 961
    .line 962
    return-object v0

    .line 963
    :pswitch_b
    check-cast v0, La/zp6;

    .line 964
    .line 965
    iget-object v0, v0, La/zp6;->g2:La/fiu0;

    .line 966
    .line 967
    if-eqz v0, :cond_2c

    .line 968
    .line 969
    return-object v0

    .line 970
    :cond_2c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    const/16 v17, 0x0

    .line 974
    .line 975
    throw v17

    .line 976
    :pswitch_c
    check-cast v0, La/vp6;

    .line 977
    .line 978
    sget v1, La/vp6;->W:I

    .line 979
    .line 980
    sget-object v1, La/cp6;->a:La/cp6;

    .line 981
    .line 982
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 986
    .line 987
    return-object v0

    .line 988
    :pswitch_d
    check-cast v0, La/xr;

    .line 989
    .line 990
    iget-object v0, v0, La/xr;->a:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v0, La/gii0;

    .line 993
    .line 994
    const-class v1, La/rn6;

    .line 995
    .line 996
    sget-object v2, La/sre0;->a:La/tre0;

    .line 997
    .line 998
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    check-cast v0, La/rn6;

    .line 1007
    .line 1008
    return-object v0

    .line 1009
    :pswitch_e
    check-cast v0, La/j83;

    .line 1010
    .line 1011
    return-object v0

    .line 1012
    :pswitch_f
    check-cast v0, La/a56;

    .line 1013
    .line 1014
    invoke-virtual {v0}, La/a56;->h()La/g56;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    return-object v0

    .line 1019
    :pswitch_10
    check-cast v0, La/q46;

    .line 1020
    .line 1021
    sget-object v1, La/q46;->O1:La/bj5;

    .line 1022
    .line 1023
    new-instance v1, La/ry3;

    .line 1024
    .line 1025
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    iget-object v0, v0, La/q46;->L1:La/s9i;

    .line 1030
    .line 1031
    if-eqz v0, :cond_2d

    .line 1032
    .line 1033
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 1034
    .line 1035
    .line 1036
    return-object v1

    .line 1037
    :cond_2d
    const-string v0, "baseVerificationViewModelFactory"

    .line 1038
    .line 1039
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    const/16 v17, 0x0

    .line 1043
    .line 1044
    throw v17

    .line 1045
    :pswitch_11
    check-cast v0, La/yx5;

    .line 1046
    .line 1047
    new-instance v1, La/w1;

    .line 1048
    .line 1049
    const/16 v2, 0x11

    .line 1050
    .line 1051
    invoke-direct {v1, v0, v2}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 1052
    .line 1053
    .line 1054
    return-object v1

    .line 1055
    :pswitch_12
    check-cast v0, La/iw5;

    .line 1056
    .line 1057
    sget-object v1, La/iw5;->j2:[La/iiy;

    .line 1058
    .line 1059
    new-instance v1, La/gw5;

    .line 1060
    .line 1061
    const/4 v2, 0x0

    .line 1062
    invoke-direct {v1, v0, v2}, La/gw5;-><init>(Ljava/lang/Object;B)V

    .line 1063
    .line 1064
    .line 1065
    return-object v1

    .line 1066
    :pswitch_13
    check-cast v0, La/jr5;

    .line 1067
    .line 1068
    iget-object v0, v0, La/jr5;->a:La/rrc;

    .line 1069
    .line 1070
    iget-object v0, v0, La/rrc;->b:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v0, Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 1073
    .line 1074
    invoke-virtual {v0}, Lorg/xplatform/onexdatabase/OnexDatabase;->q()La/vn50;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    return-object v0

    .line 1079
    :pswitch_14
    check-cast v0, La/ol5;

    .line 1080
    .line 1081
    new-instance v1, La/t0h0;

    .line 1082
    .line 1083
    iget-object v2, v0, La/ol5;->K1:La/l9i;

    .line 1084
    .line 1085
    if-eqz v2, :cond_2e

    .line 1086
    .line 1087
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    invoke-direct {v1, v2, v0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 1092
    .line 1093
    .line 1094
    return-object v1

    .line 1095
    :cond_2e
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    const/16 v17, 0x0

    .line 1099
    .line 1100
    throw v17

    .line 1101
    :pswitch_15
    move-object/from16 v17, v5

    .line 1102
    .line 1103
    check-cast v0, La/il5;

    .line 1104
    .line 1105
    new-instance v1, La/t0h0;

    .line 1106
    .line 1107
    iget-object v2, v0, La/il5;->M1:La/l9i;

    .line 1108
    .line 1109
    if-eqz v2, :cond_2f

    .line 1110
    .line 1111
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-direct {v1, v2, v0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 1116
    .line 1117
    .line 1118
    return-object v1

    .line 1119
    :cond_2f
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1120
    .line 1121
    .line 1122
    throw v17

    .line 1123
    :pswitch_16
    move-object/from16 v17, v5

    .line 1124
    .line 1125
    check-cast v0, La/fl5;

    .line 1126
    .line 1127
    new-instance v1, La/t0h0;

    .line 1128
    .line 1129
    iget-object v2, v0, La/fl5;->K1:La/l9i;

    .line 1130
    .line 1131
    if-eqz v2, :cond_30

    .line 1132
    .line 1133
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    invoke-direct {v1, v2, v0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 1138
    .line 1139
    .line 1140
    return-object v1

    .line 1141
    :cond_30
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    throw v17

    .line 1145
    :pswitch_17
    move-object/from16 v17, v5

    .line 1146
    .line 1147
    check-cast v0, La/bl5;

    .line 1148
    .line 1149
    new-instance v1, La/t0h0;

    .line 1150
    .line 1151
    iget-object v2, v0, La/bl5;->K1:La/l9i;

    .line 1152
    .line 1153
    if-eqz v2, :cond_31

    .line 1154
    .line 1155
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-direct {v1, v2, v0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 1160
    .line 1161
    .line 1162
    return-object v1

    .line 1163
    :cond_31
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    throw v17

    .line 1167
    :pswitch_18
    check-cast v0, La/oyq0;

    .line 1168
    .line 1169
    iget-object v1, v0, La/oyq0;->c:La/agk0;

    .line 1170
    .line 1171
    invoke-virtual {v1}, La/agk0;->l()F

    .line 1172
    .line 1173
    .line 1174
    move-result v1

    .line 1175
    iget v0, v0, La/oyq0;->a:F

    .line 1176
    .line 1177
    cmpg-float v1, v1, v0

    .line 1178
    .line 1179
    if-nez v1, :cond_33

    .line 1180
    .line 1181
    const/16 v16, 0x0

    .line 1182
    .line 1183
    cmpg-float v0, v0, v16

    .line 1184
    .line 1185
    if-nez v0, :cond_32

    .line 1186
    .line 1187
    goto :goto_16

    .line 1188
    :cond_32
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1189
    .line 1190
    move/from16 v2, v16

    .line 1191
    .line 1192
    goto :goto_17

    .line 1193
    :cond_33
    :goto_16
    sget-object v0, La/qmk;->a:La/zcl;

    .line 1194
    .line 1195
    const/high16 v2, 0x41c00000    # 24.0f

    .line 1196
    .line 1197
    :goto_17
    new-instance v0, La/ycl;

    .line 1198
    .line 1199
    invoke-direct {v0, v2}, La/ycl;-><init>(F)V

    .line 1200
    .line 1201
    .line 1202
    return-object v0

    .line 1203
    :pswitch_19
    check-cast v0, La/df5;

    .line 1204
    .line 1205
    iget-object v0, v0, La/df5;->o:La/km40;

    .line 1206
    .line 1207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1211
    .line 1212
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    throw v0

    .line 1216
    :pswitch_1a
    check-cast v0, La/n75;

    .line 1217
    .line 1218
    iget-object v0, v0, La/n75;->N1:La/fiu0;

    .line 1219
    .line 1220
    if-eqz v0, :cond_34

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :cond_34
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    const/16 v17, 0x0

    .line 1227
    .line 1228
    throw v17

    .line 1229
    :pswitch_1b
    check-cast v0, La/ehf0;

    .line 1230
    .line 1231
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v0, La/gii0;

    .line 1234
    .line 1235
    const-class v1, La/hv4;

    .line 1236
    .line 1237
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1238
    .line 1239
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    check-cast v0, La/hv4;

    .line 1248
    .line 1249
    return-object v0

    .line 1250
    :pswitch_1c
    check-cast v0, La/wby;

    .line 1251
    .line 1252
    const-class v1, La/ws4;

    .line 1253
    .line 1254
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1255
    .line 1256
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    check-cast v0, La/ws4;

    .line 1265
    .line 1266
    return-object v0

    .line 1267
    :pswitch_1d
    check-cast v0, La/hl60;

    .line 1268
    .line 1269
    const/4 v2, 0x0

    .line 1270
    invoke-virtual {v0, v2}, La/hl60;->y(Z)V

    .line 1271
    .line 1272
    .line 1273
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1274
    .line 1275
    return-object v0

    .line 1276
    :pswitch_1e
    check-cast v0, La/cp4;

    .line 1277
    .line 1278
    sget-object v1, La/cp4;->P1:La/gfk0;

    .line 1279
    .line 1280
    iget-object v0, v0, La/cp4;->L1:La/fiu0;

    .line 1281
    .line 1282
    if-eqz v0, :cond_35

    .line 1283
    .line 1284
    return-object v0

    .line 1285
    :cond_35
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1286
    .line 1287
    .line 1288
    const/16 v17, 0x0

    .line 1289
    .line 1290
    throw v17

    .line 1291
    :pswitch_1f
    check-cast v0, La/ntu;

    .line 1292
    .line 1293
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    return-object v0

    .line 1298
    nop

    .line 1299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
    .end packed-switch

    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
