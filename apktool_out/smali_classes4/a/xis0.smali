.class public final synthetic La/xis0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/xis0;->a:B

    iput-object p3, p0, La/xis0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/xis0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/xis0;->a:B

    iput-object p1, p0, La/xis0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/xis0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xis0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/16 v4, 0x19

    .line 10
    .line 11
    const v5, 0x2fd4df92

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/ffv0;

    .line 22
    .line 23
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/k3t0;

    .line 26
    .line 27
    move-object/from16 v2, p1

    .line 28
    .line 29
    check-cast v2, La/gfv0;

    .line 30
    .line 31
    sget v3, La/ffv0;->k2:I

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-wide v2, v2, La/gfv0;->a:J

    .line 37
    .line 38
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->R()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v4, "WildFreeBetFeature.FRAGMENT_RESULT_KEY"

    .line 46
    .line 47
    new-instance v5, Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v6, "WildFreeBetFeature.GAME_SELECT_KEY"

    .line 53
    .line 54
    invoke-virtual {v5, v6, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 55
    .line 56
    .line 57
    invoke-static {v5, v1, v4}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, La/yo8;->y0()V

    .line 61
    .line 62
    .line 63
    :goto_0
    sget-object v1, La/yev0;->a:La/yev0;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, La/aev0;

    .line 74
    .line 75
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    move-object/from16 v2, p1

    .line 80
    .line 81
    check-cast v2, La/hcz;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v1, v1, La/aev0;->c:La/a4x;

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    new-instance v4, La/vdr0;

    .line 93
    .line 94
    const/16 v6, 0x11

    .line 95
    .line 96
    invoke-direct {v4, v1, v6}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 97
    .line 98
    .line 99
    new-instance v6, La/njh0;

    .line 100
    .line 101
    const/16 v9, 0x1b

    .line 102
    .line 103
    invoke-direct {v6, v1, v0, v9}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 104
    .line 105
    .line 106
    new-instance v0, La/ugd;

    .line 107
    .line 108
    invoke-direct {v0, v5, v8, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3, v7, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_1
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/c8v0;

    .line 120
    .line 121
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/l7v0;

    .line 124
    .line 125
    move-object/from16 v2, p1

    .line 126
    .line 127
    check-cast v2, La/k0w0;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v1, v1, La/c8v0;->s:La/kys0;

    .line 133
    .line 134
    iget-wide v3, v0, La/l7v0;->a:J

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;

    .line 140
    .line 141
    invoke-direct {v0, v3, v4}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;-><init>(J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 145
    .line 146
    .line 147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_2
    const-string v1, "ufcStatistic/v1/image/"

    .line 151
    .line 152
    iget-object v2, v0, La/xis0;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v2, La/s7p0;

    .line 155
    .line 156
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 159
    .line 160
    move-object/from16 v3, p1

    .line 161
    .line 162
    check-cast v3, Ljava/util/List;

    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_2

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    move-object v5, v4

    .line 182
    check-cast v5, La/wlc;

    .line 183
    .line 184
    iget-object v5, v5, La/wlc;->a:La/f7v0;

    .line 185
    .line 186
    iget-object v9, v0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;->b:La/f7v0;

    .line 187
    .line 188
    if-ne v5, v9, :cond_1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_2
    move-object v4, v7

    .line 192
    :goto_1
    check-cast v4, La/wlc;

    .line 193
    .line 194
    iget-object v0, v2, La/s7p0;->b:La/ctf0;

    .line 195
    .line 196
    const-string v2, "/"

    .line 197
    .line 198
    const-string v3, "https://"

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    if-nez v4, :cond_3

    .line 204
    .line 205
    sget-object v0, La/lak0;->c:La/lak0;

    .line 206
    .line 207
    goto/16 :goto_14

    .line 208
    .line 209
    :cond_3
    iget-object v5, v4, La/wlc;->c:La/fwp;

    .line 210
    .line 211
    new-instance v9, La/p7v0;

    .line 212
    .line 213
    iget v10, v5, La/fwp;->a:I

    .line 214
    .line 215
    iget-object v11, v5, La/fwp;->i:La/gwp;

    .line 216
    .line 217
    iget v12, v11, La/gwp;->a:I

    .line 218
    .line 219
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    new-instance v13, La/doh;

    .line 224
    .line 225
    iget-wide v14, v5, La/fwp;->b:J

    .line 226
    .line 227
    move-object/from16 v27, v7

    .line 228
    .line 229
    new-instance v7, La/n0x;

    .line 230
    .line 231
    new-instance v6, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 234
    .line 235
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object v8, v5, La/fwp;->g:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v16

    .line 248
    move-object/from16 v29, v1

    .line 249
    .line 250
    const/4 v1, 0x0

    .line 251
    move-object/from16 p0, v9

    .line 252
    .line 253
    if-nez v16, :cond_4

    .line 254
    .line 255
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_4
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {v8, v9, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-nez v9, :cond_7

    .line 266
    .line 267
    invoke-static {v8, v3, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    if-eqz v9, :cond_5

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-lez v9, :cond_6

    .line 279
    .line 280
    invoke-static {v6, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-nez v9, :cond_6

    .line 285
    .line 286
    const/16 v9, 0x2f

    .line 287
    .line 288
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    move/from16 v30, v1

    .line 292
    .line 293
    move/from16 p1, v9

    .line 294
    .line 295
    :goto_2
    const/4 v9, 0x1

    .line 296
    goto :goto_3

    .line 297
    :cond_6
    move/from16 v30, v1

    .line 298
    .line 299
    const/16 p1, 0x2f

    .line 300
    .line 301
    goto :goto_2

    .line 302
    :goto_3
    new-array v1, v9, [C

    .line 303
    .line 304
    aput-char p1, v1, v30

    .line 305
    .line 306
    invoke-static {v8, v1}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    move/from16 v1, v30

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_7
    :goto_4
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    :goto_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-direct {v7, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    iget-object v6, v4, La/wlc;->a:La/f7v0;

    .line 330
    .line 331
    invoke-static {v6, v0}, La/tnq0;->r(La/f7v0;La/ctf0;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v17

    .line 335
    iget-object v5, v5, La/fwp;->c:Ljava/lang/String;

    .line 336
    .line 337
    new-array v6, v1, [Ljava/lang/Object;

    .line 338
    .line 339
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 340
    .line 341
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    const v8, 0x7f130400

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v19

    .line 352
    new-array v6, v1, [Ljava/lang/Object;

    .line 353
    .line 354
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    const v8, 0x7f13062a

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v20

    .line 365
    iget v6, v11, La/gwp;->c:I

    .line 366
    .line 367
    iget v8, v11, La/gwp;->b:I

    .line 368
    .line 369
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v21

    .line 373
    new-array v9, v1, [Ljava/lang/Object;

    .line 374
    .line 375
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    const v11, 0x7f130606

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v22

    .line 386
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v23

    .line 390
    new-array v9, v1, [Ljava/lang/Object;

    .line 391
    .line 392
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    const v1, 0x7f130715

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v1, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v24

    .line 403
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v25

    .line 407
    const/4 v0, -0x1

    .line 408
    if-eq v12, v0, :cond_9

    .line 409
    .line 410
    if-eq v8, v0, :cond_9

    .line 411
    .line 412
    if-ne v6, v0, :cond_8

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_8
    const/16 v28, 0x0

    .line 416
    .line 417
    :goto_6
    const/4 v9, 0x1

    .line 418
    goto :goto_8

    .line 419
    :cond_9
    :goto_7
    const/16 v28, 0x1

    .line 420
    .line 421
    goto :goto_6

    .line 422
    :goto_8
    xor-int/lit8 v26, v28, 0x1

    .line 423
    .line 424
    move-object/from16 v18, v5

    .line 425
    .line 426
    move-object/from16 v16, v7

    .line 427
    .line 428
    invoke-direct/range {v13 .. v26}, La/doh;-><init>(JLa/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 429
    .line 430
    .line 431
    new-instance v1, La/goh;

    .line 432
    .line 433
    invoke-direct {v1, v13}, La/goh;-><init>(La/foh;)V

    .line 434
    .line 435
    .line 436
    move-object/from16 v5, p0

    .line 437
    .line 438
    invoke-direct {v5, v10, v1}, La/p7v0;-><init>(Ljava/lang/String;La/ioh;)V

    .line 439
    .line 440
    .line 441
    iget-object v1, v4, La/wlc;->d:Ljava/util/List;

    .line 442
    .line 443
    new-instance v4, Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    :cond_a
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_b

    .line 457
    .line 458
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v6

    .line 462
    move-object v7, v6

    .line 463
    check-cast v7, La/fwp;

    .line 464
    .line 465
    iget-object v8, v7, La/fwp;->c:Ljava/lang/String;

    .line 466
    .line 467
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 468
    .line 469
    .line 470
    move-result v8

    .line 471
    if-lez v8, :cond_a

    .line 472
    .line 473
    iget v7, v7, La/fwp;->h:I

    .line 474
    .line 475
    if-eq v7, v0, :cond_a

    .line 476
    .line 477
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_b
    new-instance v0, Ljava/util/ArrayList;

    .line 482
    .line 483
    const/16 v1, 0xa

    .line 484
    .line 485
    invoke-static {v4, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    const/4 v4, 0x0

    .line 497
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v6

    .line 501
    if-eqz v6, :cond_14

    .line 502
    .line 503
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    add-int/lit8 v7, v4, 0x1

    .line 508
    .line 509
    if-ltz v4, :cond_13

    .line 510
    .line 511
    check-cast v6, La/fwp;

    .line 512
    .line 513
    new-instance v8, La/u7v0;

    .line 514
    .line 515
    iget v9, v6, La/fwp;->a:I

    .line 516
    .line 517
    iget v10, v6, La/fwp;->j:I

    .line 518
    .line 519
    new-instance v11, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    new-instance v11, La/joh;

    .line 535
    .line 536
    iget-wide v12, v6, La/fwp;->b:J

    .line 537
    .line 538
    iget v9, v6, La/fwp;->h:I

    .line 539
    .line 540
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v14

    .line 544
    new-instance v15, La/ewp;

    .line 545
    .line 546
    new-instance v9, La/n0x;

    .line 547
    .line 548
    move-object/from16 p0, v1

    .line 549
    .line 550
    new-instance v1, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    move/from16 v17, v7

    .line 553
    .line 554
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 555
    .line 556
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    iget-object v7, v6, La/fwp;->g:Ljava/lang/String;

    .line 560
    .line 561
    move/from16 v16, v10

    .line 562
    .line 563
    move-object/from16 v10, v29

    .line 564
    .line 565
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 570
    .line 571
    .line 572
    move-result v18

    .line 573
    if-nez v18, :cond_c

    .line 574
    .line 575
    move-object/from16 v29, v10

    .line 576
    .line 577
    const/4 v10, 0x0

    .line 578
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v18, v11

    .line 582
    .line 583
    const/16 p1, 0x2f

    .line 584
    .line 585
    move v11, v10

    .line 586
    goto :goto_f

    .line 587
    :cond_c
    move-object/from16 v29, v10

    .line 588
    .line 589
    move-object/from16 v18, v11

    .line 590
    .line 591
    const/4 v10, 0x0

    .line 592
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 593
    .line 594
    invoke-static {v7, v11, v10}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    if-nez v11, :cond_f

    .line 599
    .line 600
    invoke-static {v7, v3, v10}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 601
    .line 602
    .line 603
    move-result v11

    .line 604
    if-eqz v11, :cond_d

    .line 605
    .line 606
    const/4 v11, 0x0

    .line 607
    :goto_b
    const/16 p1, 0x2f

    .line 608
    .line 609
    goto :goto_e

    .line 610
    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 611
    .line 612
    .line 613
    move-result v10

    .line 614
    if-lez v10, :cond_e

    .line 615
    .line 616
    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 617
    .line 618
    .line 619
    move-result v10

    .line 620
    if-nez v10, :cond_e

    .line 621
    .line 622
    const/16 v10, 0x2f

    .line 623
    .line 624
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    move/from16 p1, v10

    .line 628
    .line 629
    :goto_c
    const/4 v11, 0x1

    .line 630
    goto :goto_d

    .line 631
    :cond_e
    const/16 p1, 0x2f

    .line 632
    .line 633
    goto :goto_c

    .line 634
    :goto_d
    new-array v10, v11, [C

    .line 635
    .line 636
    const/4 v11, 0x0

    .line 637
    aput-char p1, v10, v11

    .line 638
    .line 639
    invoke-static {v7, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    goto :goto_f

    .line 647
    :cond_f
    move v11, v10

    .line 648
    goto :goto_b

    .line 649
    :goto_e
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    :goto_f
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-direct {v9, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    iget-object v1, v6, La/fwp;->c:Ljava/lang/String;

    .line 663
    .line 664
    iget-object v6, v6, La/fwp;->i:La/gwp;

    .line 665
    .line 666
    const-string v7, "-"

    .line 667
    .line 668
    iget v10, v6, La/gwp;->a:I

    .line 669
    .line 670
    iget v11, v6, La/gwp;->c:I

    .line 671
    .line 672
    iget v6, v6, La/gwp;->b:I

    .line 673
    .line 674
    if-nez v10, :cond_10

    .line 675
    .line 676
    if-nez v6, :cond_10

    .line 677
    .line 678
    if-nez v11, :cond_10

    .line 679
    .line 680
    const-string v6, ""

    .line 681
    .line 682
    move-object/from16 v19, v2

    .line 683
    .line 684
    goto :goto_10

    .line 685
    :cond_10
    move-object/from16 v19, v2

    .line 686
    .line 687
    new-instance v2, Ljava/lang/StringBuilder;

    .line 688
    .line 689
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    :goto_10
    invoke-direct {v15, v9, v1, v6}, La/ewp;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    if-nez v16, :cond_11

    .line 715
    .line 716
    move-object/from16 v16, v27

    .line 717
    .line 718
    :goto_11
    move-object/from16 v11, v18

    .line 719
    .line 720
    const/16 v30, 0x0

    .line 721
    .line 722
    goto :goto_13

    .line 723
    :cond_11
    new-instance v1, La/fnk0;

    .line 724
    .line 725
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->abs(I)I

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    if-lez v16, :cond_12

    .line 730
    .line 731
    const/4 v6, 0x1

    .line 732
    goto :goto_12

    .line 733
    :cond_12
    const/4 v6, 0x0

    .line 734
    :goto_12
    invoke-direct {v1, v2, v6}, La/fnk0;-><init>(IZ)V

    .line 735
    .line 736
    .line 737
    move-object/from16 v16, v1

    .line 738
    .line 739
    goto :goto_11

    .line 740
    :goto_13
    invoke-direct/range {v11 .. v16}, La/joh;-><init>(JLjava/lang/String;La/ewp;La/fnk0;)V

    .line 741
    .line 742
    .line 743
    new-instance v1, La/koh;

    .line 744
    .line 745
    invoke-direct {v1, v11}, La/koh;-><init>(La/joh;)V

    .line 746
    .line 747
    .line 748
    invoke-direct {v8, v4, v1}, La/u7v0;-><init>(Ljava/lang/String;La/moh;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-object/from16 v1, p0

    .line 755
    .line 756
    move/from16 v4, v17

    .line 757
    .line 758
    move-object/from16 v2, v19

    .line 759
    .line 760
    goto/16 :goto_a

    .line 761
    .line 762
    :cond_13
    invoke-static {}, La/q3d;->p()V

    .line 763
    .line 764
    .line 765
    throw v27

    .line 766
    :cond_14
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    invoke-virtual {v1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 778
    .line 779
    .line 780
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    :goto_14
    return-object v0

    .line 789
    :pswitch_3
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v1, La/n0v0;

    .line 792
    .line 793
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 796
    .line 797
    move-object/from16 v2, p1

    .line 798
    .line 799
    check-cast v2, La/hcz;

    .line 800
    .line 801
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    check-cast v1, La/k0v0;

    .line 805
    .line 806
    iget-object v1, v1, La/k0v0;->a:Ljava/util/List;

    .line 807
    .line 808
    new-instance v3, La/d4u0;

    .line 809
    .line 810
    const/16 v4, 0x10

    .line 811
    .line 812
    invoke-direct {v3, v4}, La/d4u0;-><init>(B)V

    .line 813
    .line 814
    .line 815
    invoke-static {v1, v3}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 820
    .line 821
    .line 822
    move-result v5

    .line 823
    new-instance v6, La/vdr0;

    .line 824
    .line 825
    const/16 v7, 0xf

    .line 826
    .line 827
    invoke-direct {v6, v3, v7}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 828
    .line 829
    .line 830
    new-instance v3, La/vdr0;

    .line 831
    .line 832
    invoke-direct {v3, v1, v4}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 833
    .line 834
    .line 835
    new-instance v4, La/njh0;

    .line 836
    .line 837
    const/16 v7, 0x1a

    .line 838
    .line 839
    invoke-direct {v4, v1, v0, v7}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 840
    .line 841
    .line 842
    new-instance v0, La/ugd;

    .line 843
    .line 844
    const v1, -0x4e295cff

    .line 845
    .line 846
    .line 847
    const/4 v9, 0x1

    .line 848
    invoke-direct {v0, v1, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v2, v5, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 852
    .line 853
    .line 854
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 855
    .line 856
    return-object v0

    .line 857
    :pswitch_4
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v1, La/c69;

    .line 860
    .line 861
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, La/txu0;

    .line 864
    .line 865
    move-object/from16 v2, p1

    .line 866
    .line 867
    check-cast v2, La/fwu0;

    .line 868
    .line 869
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    iget-boolean v0, v0, La/txu0;->a:Z

    .line 873
    .line 874
    invoke-virtual {v1, v2, v0}, La/c69;->a(La/fwu0;Z)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    return-object v0

    .line 879
    :pswitch_5
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v1, La/jru0;

    .line 882
    .line 883
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 884
    .line 885
    check-cast v0, La/oru0;

    .line 886
    .line 887
    move-object/from16 v2, p1

    .line 888
    .line 889
    check-cast v2, La/k0w0;

    .line 890
    .line 891
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    iget-object v1, v1, La/jru0;->s:La/vqc;

    .line 895
    .line 896
    iget-object v3, v0, La/oru0;->b:Ljava/lang/String;

    .line 897
    .line 898
    iget-object v4, v0, La/oru0;->c:Ljava/lang/String;

    .line 899
    .line 900
    iget-object v5, v0, La/oru0;->d:Ljava/util/List;

    .line 901
    .line 902
    new-instance v6, Ljava/util/ArrayList;

    .line 903
    .line 904
    const/16 v7, 0xa

    .line 905
    .line 906
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 907
    .line 908
    .line 909
    move-result v7

    .line 910
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 911
    .line 912
    .line 913
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 914
    .line 915
    .line 916
    move-result-object v5

    .line 917
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 918
    .line 919
    .line 920
    move-result v7

    .line 921
    if-eqz v7, :cond_15

    .line 922
    .line 923
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v7

    .line 927
    check-cast v7, La/iqu0;

    .line 928
    .line 929
    iget v7, v7, La/iqu0;->a:I

    .line 930
    .line 931
    int-to-long v7, v7

    .line 932
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 933
    .line 934
    .line 935
    move-result-object v7

    .line 936
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    goto :goto_15

    .line 940
    :cond_15
    iget v0, v0, La/oru0;->a:I

    .line 941
    .line 942
    new-instance v5, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 943
    .line 944
    invoke-direct {v5, v0, v3, v4, v6}, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1;

    .line 951
    .line 952
    invoke-direct {v0, v1, v5}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 956
    .line 957
    .line 958
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 959
    .line 960
    return-object v0

    .line 961
    :pswitch_6
    iget-object v1, v0, La/xis0;->c:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 964
    .line 965
    iget-object v0, v0, La/xis0;->b:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v0, La/gru0;

    .line 968
    .line 969
    move-object/from16 v2, p1

    .line 970
    .line 971
    check-cast v2, Ljava/lang/Integer;

    .line 972
    .line 973
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 974
    .line 975
    .line 976
    move-result v2

    .line 977
    if-nez v2, :cond_16

    .line 978
    .line 979
    iget-boolean v0, v0, La/gru0;->a:Z

    .line 980
    .line 981
    const/16 v28, 0x1

    .line 982
    .line 983
    xor-int/lit8 v0, v0, 0x1

    .line 984
    .line 985
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    :cond_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 993
    .line 994
    return-object v0

    .line 995
    :pswitch_7
    move-object/from16 v27, v7

    .line 996
    .line 997
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v1, La/jpu0;

    .line 1000
    .line 1001
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, La/d930;

    .line 1004
    .line 1005
    move-object/from16 v2, p1

    .line 1006
    .line 1007
    check-cast v2, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;

    .line 1008
    .line 1009
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    iget-object v4, v1, La/jpu0;->b:La/y3b;

    .line 1013
    .line 1014
    new-instance v5, La/cps0;

    .line 1015
    .line 1016
    const/4 v9, 0x1

    .line 1017
    invoke-direct {v5, v0, v1, v2, v9}, La/cps0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1018
    .line 1019
    .line 1020
    iget-object v0, v2, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->p2:La/n3b;

    .line 1021
    .line 1022
    instance-of v1, v4, La/w3b;

    .line 1023
    .line 1024
    if-eqz v1, :cond_17

    .line 1025
    .line 1026
    check-cast v4, La/w3b;

    .line 1027
    .line 1028
    iget-object v1, v4, La/w3b;->b:La/m0x;

    .line 1029
    .line 1030
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->setPlaceholder(La/o0x;)V

    .line 1031
    .line 1032
    .line 1033
    iget-object v1, v4, La/w3b;->a:Ljava/util/ArrayList;

    .line 1034
    .line 1035
    invoke-virtual {v0, v1, v5}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_17

    .line 1039
    :cond_17
    sget-object v1, La/x3b;->a:La/x3b;

    .line 1040
    .line 1041
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v1

    .line 1045
    if-eqz v1, :cond_19

    .line 1046
    .line 1047
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 1048
    .line 1049
    const/4 v9, 0x1

    .line 1050
    invoke-direct {v1, v9, v3, v9}, Lkotlin/ranges/a;-><init>(III)V

    .line 1051
    .line 1052
    .line 1053
    new-instance v2, Ljava/util/ArrayList;

    .line 1054
    .line 1055
    const/16 v7, 0xa

    .line 1056
    .line 1057
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1058
    .line 1059
    .line 1060
    move-result v3

    .line 1061
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    :goto_16
    move-object v3, v1

    .line 1069
    check-cast v3, La/kkx;

    .line 1070
    .line 1071
    iget-boolean v3, v3, La/kkx;->c:Z

    .line 1072
    .line 1073
    if-eqz v3, :cond_18

    .line 1074
    .line 1075
    move-object v3, v1

    .line 1076
    check-cast v3, La/bkx;

    .line 1077
    .line 1078
    invoke-virtual {v3}, La/bkx;->nextInt()I

    .line 1079
    .line 1080
    .line 1081
    sget-object v3, La/u3b;->a:La/u3b;

    .line 1082
    .line 1083
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    goto :goto_16

    .line 1087
    :cond_18
    invoke-virtual {v0, v2, v5}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 1088
    .line 1089
    .line 1090
    :goto_17
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1091
    .line 1092
    goto :goto_18

    .line 1093
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 1094
    .line 1095
    .line 1096
    move-object/from16 v7, v27

    .line 1097
    .line 1098
    :goto_18
    return-object v7

    .line 1099
    :pswitch_8
    iget-object v1, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1102
    .line 1103
    iget-object v0, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v0, La/lou0;

    .line 1106
    .line 1107
    move-object/from16 v2, p1

    .line 1108
    .line 1109
    check-cast v2, Ljava/lang/Integer;

    .line 1110
    .line 1111
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1112
    .line 1113
    .line 1114
    move-result v2

    .line 1115
    if-nez v2, :cond_1a

    .line 1116
    .line 1117
    iget-boolean v0, v0, La/lou0;->a:Z

    .line 1118
    .line 1119
    const/16 v28, 0x1

    .line 1120
    .line 1121
    xor-int/lit8 v0, v0, 0x1

    .line 1122
    .line 1123
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1131
    .line 1132
    return-object v0

    .line 1133
    :pswitch_9
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1134
    .line 1135
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1136
    .line 1137
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1138
    .line 1139
    check-cast v0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;

    .line 1140
    .line 1141
    move-object/from16 v2, p1

    .line 1142
    .line 1143
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 1144
    .line 1145
    sget v3, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->h:I

    .line 1146
    .line 1147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    check-cast v0, Ljava/lang/Boolean;

    .line 1155
    .line 1156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    return-object v0

    .line 1160
    :pswitch_a
    move-object/from16 v27, v7

    .line 1161
    .line 1162
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast v1, La/s8u0;

    .line 1165
    .line 1166
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1169
    .line 1170
    move-object/from16 v2, p1

    .line 1171
    .line 1172
    check-cast v2, La/hcz;

    .line 1173
    .line 1174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    check-cast v1, La/p8u0;

    .line 1178
    .line 1179
    iget-object v1, v1, La/p8u0;->a:La/a4x;

    .line 1180
    .line 1181
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1182
    .line 1183
    .line 1184
    move-result v6

    .line 1185
    new-instance v7, La/e0m0;

    .line 1186
    .line 1187
    invoke-direct {v7, v1, v3}, La/e0m0;-><init>(La/a4x;B)V

    .line 1188
    .line 1189
    .line 1190
    new-instance v3, La/ws1;

    .line 1191
    .line 1192
    invoke-direct {v3, v1, v0, v4}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 1193
    .line 1194
    .line 1195
    new-instance v0, La/ugd;

    .line 1196
    .line 1197
    const/4 v9, 0x1

    .line 1198
    invoke-direct {v0, v5, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1199
    .line 1200
    .line 1201
    move-object/from16 v1, v27

    .line 1202
    .line 1203
    invoke-virtual {v2, v6, v1, v7, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1204
    .line 1205
    .line 1206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1207
    .line 1208
    return-object v0

    .line 1209
    :pswitch_b
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v1, La/ggt0;

    .line 1212
    .line 1213
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v0, La/cp;

    .line 1216
    .line 1217
    move-object/from16 v2, p1

    .line 1218
    .line 1219
    check-cast v2, Landroid/view/View;

    .line 1220
    .line 1221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v2

    .line 1228
    check-cast v2, La/g8u0;

    .line 1229
    .line 1230
    iget-object v2, v2, La/g8u0;->a:La/mbu0;

    .line 1231
    .line 1232
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    check-cast v0, La/g8u0;

    .line 1237
    .line 1238
    iget-object v0, v0, La/g8u0;->g:Ljava/lang/String;

    .line 1239
    .line 1240
    invoke-virtual {v1, v2, v0}, La/ggt0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1244
    .line 1245
    return-object v0

    .line 1246
    :pswitch_c
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1247
    .line 1248
    check-cast v1, La/las0;

    .line 1249
    .line 1250
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1251
    .line 1252
    check-cast v0, La/cp;

    .line 1253
    .line 1254
    move-object/from16 v2, p1

    .line 1255
    .line 1256
    check-cast v2, Landroid/view/View;

    .line 1257
    .line 1258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    invoke-virtual {v1, v0}, La/las0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1269
    .line 1270
    return-object v0

    .line 1271
    :pswitch_d
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v1, La/f2u0;

    .line 1274
    .line 1275
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1276
    .line 1277
    move-object v9, v0

    .line 1278
    check-cast v9, Ljava/lang/String;

    .line 1279
    .line 1280
    move-object/from16 v0, p1

    .line 1281
    .line 1282
    check-cast v0, La/k0w0;

    .line 1283
    .line 1284
    iget-object v12, v1, La/f2u0;->N:La/qgh;

    .line 1285
    .line 1286
    sget-object v2, La/sip;->a:La/bek;

    .line 1287
    .line 1288
    iget-object v3, v1, La/f2u0;->r:Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;

    .line 1289
    .line 1290
    iget-boolean v4, v3, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->d:Z

    .line 1291
    .line 1292
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1293
    .line 1294
    .line 1295
    invoke-static {v4}, La/bek;->f(Z)La/sip;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    iget-wide v7, v3, Lorg/xplatform/cyber/game/valorant/api/ValorantGameScreenParams;->c:J

    .line 1300
    .line 1301
    sget-object v3, La/c0u0;->c:La/c0o;

    .line 1302
    .line 1303
    new-instance v10, Ljava/util/ArrayList;

    .line 1304
    .line 1305
    const/16 v4, 0xa

    .line 1306
    .line 1307
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1308
    .line 1309
    .line 1310
    move-result v4

    .line 1311
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v3}, La/b3;->iterator()Ljava/util/Iterator;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v3

    .line 1318
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v4

    .line 1322
    if-eqz v4, :cond_1b

    .line 1323
    .line 1324
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v4

    .line 1328
    check-cast v4, La/c0u0;

    .line 1329
    .line 1330
    iget-object v4, v4, La/c0u0;->a:La/t9m0;

    .line 1331
    .line 1332
    iget-short v4, v4, La/t9m0;->a:S

    .line 1333
    .line 1334
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v4

    .line 1338
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1339
    .line 1340
    .line 1341
    goto :goto_19

    .line 1342
    :cond_1b
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    check-cast v3, La/b0u0;

    .line 1347
    .line 1348
    iget-object v3, v3, La/b0u0;->d:La/vxt0;

    .line 1349
    .line 1350
    if-eqz v3, :cond_1d

    .line 1351
    .line 1352
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v1

    .line 1356
    check-cast v1, La/b0u0;

    .line 1357
    .line 1358
    iget-object v1, v1, La/b0u0;->c:La/jlr;

    .line 1359
    .line 1360
    invoke-static {v1}, La/d5c;->C(La/jlr;)La/m9s;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    invoke-static {v3, v1}, La/xcm0;->g(La/vxt0;La/m9s;)Ljava/util/List;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v1

    .line 1368
    if-nez v1, :cond_1c

    .line 1369
    .line 1370
    goto :goto_1b

    .line 1371
    :cond_1c
    :goto_1a
    move-object v11, v1

    .line 1372
    goto :goto_1c

    .line 1373
    :cond_1d
    :goto_1b
    sget-object v1, La/iun;->a:La/iun;

    .line 1374
    .line 1375
    goto :goto_1a

    .line 1376
    :goto_1c
    sget-object v4, La/dam0;->a:La/dam0;

    .line 1377
    .line 1378
    move-object v3, v2

    .line 1379
    new-instance v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 1380
    .line 1381
    const-wide/16 v5, 0x28

    .line 1382
    .line 1383
    invoke-direct/range {v2 .. v11}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    new-instance v1, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 1390
    .line 1391
    invoke-direct {v1, v2}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1395
    .line 1396
    .line 1397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1398
    .line 1399
    return-object v0

    .line 1400
    :pswitch_e
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1401
    .line 1402
    check-cast v1, La/tzt0;

    .line 1403
    .line 1404
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1405
    .line 1406
    move-object v9, v0

    .line 1407
    check-cast v9, Ljava/lang/String;

    .line 1408
    .line 1409
    move-object/from16 v0, p1

    .line 1410
    .line 1411
    check-cast v0, La/k0w0;

    .line 1412
    .line 1413
    iget-object v12, v1, La/tzt0;->s:La/qgh;

    .line 1414
    .line 1415
    sget-object v2, La/sip;->a:La/bek;

    .line 1416
    .line 1417
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1418
    .line 1419
    .line 1420
    sget-object v3, La/sip;->b:La/sip;

    .line 1421
    .line 1422
    iget-object v2, v1, La/tzt0;->G:Ljava/util/ArrayList;

    .line 1423
    .line 1424
    new-instance v10, Ljava/util/ArrayList;

    .line 1425
    .line 1426
    const/16 v7, 0xa

    .line 1427
    .line 1428
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1429
    .line 1430
    .line 1431
    move-result v4

    .line 1432
    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1440
    .line 1441
    .line 1442
    move-result v4

    .line 1443
    if-eqz v4, :cond_1e

    .line 1444
    .line 1445
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v4

    .line 1449
    check-cast v4, La/t9m0;

    .line 1450
    .line 1451
    iget-short v4, v4, La/t9m0;->a:S

    .line 1452
    .line 1453
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v4

    .line 1457
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    goto :goto_1d

    .line 1461
    :cond_1e
    iget-object v11, v1, La/tzt0;->M:Ljava/util/List;

    .line 1462
    .line 1463
    sget-object v4, La/dam0;->b:La/dam0;

    .line 1464
    .line 1465
    new-instance v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 1466
    .line 1467
    const-wide/16 v5, 0x28

    .line 1468
    .line 1469
    const-wide/16 v7, 0x1b

    .line 1470
    .line 1471
    invoke-direct/range {v2 .. v11}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1475
    .line 1476
    .line 1477
    new-instance v1, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 1478
    .line 1479
    invoke-direct {v1, v2}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1483
    .line 1484
    .line 1485
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1486
    .line 1487
    return-object v0

    .line 1488
    :pswitch_f
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v1, La/ppt0;

    .line 1491
    .line 1492
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1493
    .line 1494
    check-cast v0, La/pby;

    .line 1495
    .line 1496
    move-object/from16 v2, p1

    .line 1497
    .line 1498
    check-cast v2, Ljava/lang/Throwable;

    .line 1499
    .line 1500
    iget-object v2, v1, La/ppt0;->k:Ljava/lang/Object;

    .line 1501
    .line 1502
    monitor-enter v2

    .line 1503
    :try_start_0
    iget-object v1, v1, La/ppt0;->w:Ljava/util/ArrayList;

    .line 1504
    .line 1505
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1506
    .line 1507
    .line 1508
    monitor-exit v2

    .line 1509
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1510
    .line 1511
    return-object v0

    .line 1512
    :catchall_0
    move-exception v0

    .line 1513
    monitor-exit v2

    .line 1514
    throw v0

    .line 1515
    :pswitch_10
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1516
    .line 1517
    check-cast v1, La/aht0;

    .line 1518
    .line 1519
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1520
    .line 1521
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1522
    .line 1523
    move-object/from16 v2, p1

    .line 1524
    .line 1525
    check-cast v2, Ljava/lang/Long;

    .line 1526
    .line 1527
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    iget v2, v1, La/aht0;->e:F

    .line 1531
    .line 1532
    const/4 v3, 0x0

    .line 1533
    iput v3, v1, La/aht0;->e:F

    .line 1534
    .line 1535
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v1

    .line 1539
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1543
    .line 1544
    return-object v0

    .line 1545
    :pswitch_11
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1546
    .line 1547
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1548
    .line 1549
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1550
    .line 1551
    check-cast v0, La/l6t0;

    .line 1552
    .line 1553
    move-object/from16 v2, p1

    .line 1554
    .line 1555
    check-cast v2, Ljava/lang/Long;

    .line 1556
    .line 1557
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1558
    .line 1559
    .line 1560
    iget-object v0, v0, La/l6t0;->a:Ljava/lang/String;

    .line 1561
    .line 1562
    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1566
    .line 1567
    return-object v0

    .line 1568
    :pswitch_12
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1569
    .line 1570
    check-cast v1, La/a6t0;

    .line 1571
    .line 1572
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast v0, La/x4t0;

    .line 1575
    .line 1576
    move-object/from16 v2, p1

    .line 1577
    .line 1578
    check-cast v2, La/k0w0;

    .line 1579
    .line 1580
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1581
    .line 1582
    .line 1583
    iget-object v1, v1, La/a6t0;->A:La/kys0;

    .line 1584
    .line 1585
    iget-object v8, v0, La/x4t0;->a:Ljava/lang/String;

    .line 1586
    .line 1587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1588
    .line 1589
    .line 1590
    new-instance v3, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 1591
    .line 1592
    const-wide/16 v4, -0x1

    .line 1593
    .line 1594
    const-wide/16 v6, 0xbd

    .line 1595
    .line 1596
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;-><init>(JJLjava/lang/String;)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v2, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1600
    .line 1601
    .line 1602
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1603
    .line 1604
    return-object v0

    .line 1605
    :pswitch_13
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1606
    .line 1607
    move-object v2, v1

    .line 1608
    check-cast v2, La/i3t0;

    .line 1609
    .line 1610
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1611
    .line 1612
    move-object v3, v0

    .line 1613
    check-cast v3, La/j3t0;

    .line 1614
    .line 1615
    move-object/from16 v0, p1

    .line 1616
    .line 1617
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1618
    .line 1619
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v4

    .line 1623
    const/4 v6, 0x0

    .line 1624
    const/4 v7, 0x6

    .line 1625
    const/4 v5, 0x0

    .line 1626
    invoke-static/range {v2 .. v7}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1627
    .line 1628
    .line 1629
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1630
    .line 1631
    return-object v0

    .line 1632
    :pswitch_14
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1633
    .line 1634
    check-cast v1, La/i3t0;

    .line 1635
    .line 1636
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1637
    .line 1638
    move-object/from16 v2, p1

    .line 1639
    .line 1640
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1641
    .line 1642
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1647
    .line 1648
    .line 1649
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1650
    .line 1651
    return-object v0

    .line 1652
    :pswitch_15
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1653
    .line 1654
    check-cast v1, La/trm0;

    .line 1655
    .line 1656
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v0, La/y0t0;

    .line 1659
    .line 1660
    move-object/from16 v2, p1

    .line 1661
    .line 1662
    check-cast v2, La/b1t0;

    .line 1663
    .line 1664
    iget-object v3, v1, La/trm0;->b:Ljava/lang/Object;

    .line 1665
    .line 1666
    check-cast v3, La/j6m0;

    .line 1667
    .line 1668
    monitor-enter v3

    .line 1669
    :try_start_1
    invoke-interface {v2}, La/b1t0;->a()Z

    .line 1670
    .line 1671
    .line 1672
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1673
    iget-object v1, v1, La/trm0;->c:Ljava/lang/Object;

    .line 1674
    .line 1675
    check-cast v1, La/dj10;

    .line 1676
    .line 1677
    if-eqz v4, :cond_1f

    .line 1678
    .line 1679
    :try_start_2
    invoke-virtual {v1, v0, v2}, La/dj10;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v0

    .line 1683
    check-cast v0, La/b1t0;

    .line 1684
    .line 1685
    goto :goto_1e

    .line 1686
    :catchall_1
    move-exception v0

    .line 1687
    goto :goto_1f

    .line 1688
    :cond_1f
    invoke-virtual {v1, v0}, La/dj10;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    check-cast v0, La/b1t0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1693
    .line 1694
    :goto_1e
    monitor-exit v3

    .line 1695
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1696
    .line 1697
    return-object v0

    .line 1698
    :goto_1f
    monitor-exit v3

    .line 1699
    throw v0

    .line 1700
    :pswitch_16
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1701
    .line 1702
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1703
    .line 1704
    check-cast v0, La/vne;

    .line 1705
    .line 1706
    move-object/from16 v2, p1

    .line 1707
    .line 1708
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 1709
    .line 1710
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v3

    .line 1714
    if-ne v1, v3, :cond_20

    .line 1715
    .line 1716
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    goto :goto_20

    .line 1720
    :cond_20
    new-instance v1, La/wi1;

    .line 1721
    .line 1722
    const/4 v3, 0x7

    .line 1723
    const/4 v4, 0x0

    .line 1724
    invoke-direct {v1, v2, v4, v3}, La/wi1;-><init>(Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 1725
    .line 1726
    .line 1727
    const/4 v2, 0x3

    .line 1728
    invoke-static {v0, v4, v4, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1729
    .line 1730
    .line 1731
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1732
    .line 1733
    return-object v0

    .line 1734
    :pswitch_17
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1735
    .line 1736
    check-cast v1, La/oms0;

    .line 1737
    .line 1738
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1739
    .line 1740
    check-cast v0, La/vls0;

    .line 1741
    .line 1742
    move-object/from16 v3, p1

    .line 1743
    .line 1744
    check-cast v3, La/lwk;

    .line 1745
    .line 1746
    new-instance v3, La/pr0;

    .line 1747
    .line 1748
    invoke-direct {v3, v1, v0, v2}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1749
    .line 1750
    .line 1751
    return-object v3

    .line 1752
    :pswitch_18
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1753
    .line 1754
    check-cast v1, La/oms0;

    .line 1755
    .line 1756
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1757
    .line 1758
    check-cast v0, La/oms0;

    .line 1759
    .line 1760
    move-object/from16 v2, p1

    .line 1761
    .line 1762
    check-cast v2, La/lwk;

    .line 1763
    .line 1764
    iget-object v2, v1, La/oms0;->k:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 1765
    .line 1766
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    new-instance v2, La/pr0;

    .line 1770
    .line 1771
    const/16 v3, 0x17

    .line 1772
    .line 1773
    invoke-direct {v2, v1, v0, v3}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1774
    .line 1775
    .line 1776
    return-object v2

    .line 1777
    :pswitch_19
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1778
    .line 1779
    check-cast v1, La/p4;

    .line 1780
    .line 1781
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1782
    .line 1783
    check-cast v0, La/vne;

    .line 1784
    .line 1785
    move-object/from16 v3, p1

    .line 1786
    .line 1787
    check-cast v3, La/lwk;

    .line 1788
    .line 1789
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v3

    .line 1793
    new-instance v4, La/pgk0;

    .line 1794
    .line 1795
    new-instance v5, La/xis0;

    .line 1796
    .line 1797
    const/4 v6, 0x6

    .line 1798
    invoke-direct {v5, v3, v0, v6}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1799
    .line 1800
    .line 1801
    invoke-direct {v4, v5}, La/pgk0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1802
    .line 1803
    .line 1804
    move-object v0, v1

    .line 1805
    check-cast v0, La/pvh0;

    .line 1806
    .line 1807
    invoke-virtual {v0, v4}, La/pvh0;->v1(La/pgk0;)V

    .line 1808
    .line 1809
    .line 1810
    new-instance v0, La/ty2;

    .line 1811
    .line 1812
    invoke-direct {v0, v1, v2}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 1813
    .line 1814
    .line 1815
    return-object v0

    .line 1816
    :pswitch_1a
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1817
    .line 1818
    check-cast v1, La/oms0;

    .line 1819
    .line 1820
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1821
    .line 1822
    check-cast v0, La/cms0;

    .line 1823
    .line 1824
    move-object/from16 v2, p1

    .line 1825
    .line 1826
    check-cast v2, La/lwk;

    .line 1827
    .line 1828
    iget-object v2, v1, La/oms0;->j:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 1829
    .line 1830
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 1831
    .line 1832
    .line 1833
    new-instance v2, La/pr0;

    .line 1834
    .line 1835
    invoke-direct {v2, v1, v0, v4}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1836
    .line 1837
    .line 1838
    return-object v2

    .line 1839
    :pswitch_1b
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1840
    .line 1841
    check-cast v1, La/vne;

    .line 1842
    .line 1843
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1844
    .line 1845
    check-cast v0, La/oms0;

    .line 1846
    .line 1847
    move-object/from16 v2, p1

    .line 1848
    .line 1849
    check-cast v2, La/lwk;

    .line 1850
    .line 1851
    sget-object v2, La/yne;->d:La/yne;

    .line 1852
    .line 1853
    new-instance v3, La/ep8;

    .line 1854
    .line 1855
    const/4 v4, 0x0

    .line 1856
    invoke-direct {v3, v0, v4}, La/ep8;-><init>(La/oms0;La/yje;)V

    .line 1857
    .line 1858
    .line 1859
    const/4 v9, 0x1

    .line 1860
    invoke-static {v1, v4, v2, v3, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1861
    .line 1862
    .line 1863
    new-instance v0, La/mz2;

    .line 1864
    .line 1865
    const/4 v1, 0x4

    .line 1866
    invoke-direct {v0, v1}, La/mz2;-><init>(B)V

    .line 1867
    .line 1868
    .line 1869
    return-object v0

    .line 1870
    :pswitch_1c
    iget-object v1, v0, La/xis0;->b:Ljava/lang/Object;

    .line 1871
    .line 1872
    check-cast v1, La/uis0;

    .line 1873
    .line 1874
    iget-object v0, v0, La/xis0;->c:Ljava/lang/Object;

    .line 1875
    .line 1876
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1877
    .line 1878
    move-object/from16 v2, p1

    .line 1879
    .line 1880
    check-cast v2, La/hcz;

    .line 1881
    .line 1882
    sget-object v3, La/zis0;->m2:La/y2m0;

    .line 1883
    .line 1884
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1885
    .line 1886
    .line 1887
    check-cast v1, La/sis0;

    .line 1888
    .line 1889
    iget-object v1, v1, La/sis0;->a:La/a4x;

    .line 1890
    .line 1891
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1892
    .line 1893
    .line 1894
    move-result v3

    .line 1895
    new-instance v6, La/vdr0;

    .line 1896
    .line 1897
    const/16 v7, 0xa

    .line 1898
    .line 1899
    invoke-direct {v6, v1, v7}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 1900
    .line 1901
    .line 1902
    new-instance v7, La/njh0;

    .line 1903
    .line 1904
    invoke-direct {v7, v1, v0, v4}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1905
    .line 1906
    .line 1907
    new-instance v0, La/ugd;

    .line 1908
    .line 1909
    const/4 v9, 0x1

    .line 1910
    invoke-direct {v0, v5, v9, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1911
    .line 1912
    .line 1913
    const/4 v4, 0x0

    .line 1914
    invoke-virtual {v2, v3, v4, v6, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1915
    .line 1916
    .line 1917
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1918
    .line 1919
    return-object v0

    .line 1920
    nop

    .line 1921
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
