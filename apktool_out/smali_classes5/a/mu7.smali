.class public final synthetic La/mu7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(BIJLjava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/mu7;->a:B

    iput p2, p0, La/mu7;->d:I

    iput-object p5, p0, La/mu7;->b:Ljava/lang/Object;

    iput-wide p3, p0, La/mu7;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;JIB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/mu7;->a:B

    iput-object p1, p0, La/mu7;->b:Ljava/lang/Object;

    iput-wide p2, p0, La/mu7;->c:J

    iput p4, p0, La/mu7;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mu7;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const-string v3, "REGISTER_OVERLAY_LOADER_ID"

    .line 8
    .line 9
    const-string v4, "TOOLBAR_ID"

    .line 10
    .line 11
    const v5, 0x3f666666    # 0.9f

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    iget-wide v8, v0, La/mu7;->c:J

    .line 17
    .line 18
    iget-object v10, v0, La/mu7;->b:Ljava/lang/Object;

    .line 19
    .line 20
    iget v11, v0, La/mu7;->d:I

    .line 21
    .line 22
    const/4 v12, 0x0

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v10, La/pz40;

    .line 27
    .line 28
    move-object/from16 v13, p1

    .line 29
    .line 30
    check-cast v13, La/fhl;

    .line 31
    .line 32
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-wide v14, v0, La/mu7;->c:J

    .line 46
    .line 47
    if-ne v11, v1, :cond_0

    .line 48
    .line 49
    sget-object v0, La/qmk;->a:La/zcl;

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    const/high16 v1, 0x41800000    # 16.0f

    .line 53
    .line 54
    invoke-static {v12, v12, v1, v1, v0}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v13}, La/fhl;->d()J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    invoke-interface {v13}, La/fhl;->getLayoutDirection()La/k6z;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v0, v1, v2, v3, v13}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v13, v0, v14, v15}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/16 v23, 0x0

    .line 75
    .line 76
    const/16 v24, 0x7e

    .line 77
    .line 78
    const-wide/16 v16, 0x0

    .line 79
    .line 80
    const-wide/16 v18, 0x0

    .line 81
    .line 82
    const/16 v20, 0x0

    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    invoke-static/range {v13 .. v24}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 89
    .line 90
    .line 91
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_0
    check-cast v10, Ljava/util/ArrayList;

    .line 95
    .line 96
    move-object/from16 v0, p1

    .line 97
    .line 98
    check-cast v0, La/ou90;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    move v10, v6

    .line 108
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    if-eqz v13, :cond_6

    .line 113
    .line 114
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    check-cast v13, La/pu90;

    .line 119
    .line 120
    invoke-virtual {v13}, La/pu90;->n()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    instance-of v15, v14, La/p6z;

    .line 125
    .line 126
    if-eqz v15, :cond_1

    .line 127
    .line 128
    check-cast v14, La/p6z;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_1
    move-object v14, v7

    .line 132
    :goto_2
    if-eqz v14, :cond_2

    .line 133
    .line 134
    invoke-interface {v14}, La/p6z;->g0()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    goto :goto_3

    .line 139
    :cond_2
    move-object v14, v7

    .line 140
    :goto_3
    invoke-static {v14, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    if-eqz v15, :cond_3

    .line 145
    .line 146
    invoke-virtual {v0, v13, v6, v6, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 147
    .line 148
    .line 149
    iget v13, v13, La/pu90;->b:I

    .line 150
    .line 151
    add-int/2addr v10, v13

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    const-string v15, "REGISTER_BUTTON_ID"

    .line 154
    .line 155
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    if-eqz v15, :cond_4

    .line 160
    .line 161
    invoke-static {v8, v9}, La/p4e;->h(J)I

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    iget v15, v13, La/pu90;->b:I

    .line 166
    .line 167
    sub-int/2addr v14, v15

    .line 168
    sub-int/2addr v14, v11

    .line 169
    invoke-virtual {v0, v13, v6, v14, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    invoke-static {v14, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-eqz v14, :cond_5

    .line 178
    .line 179
    invoke-virtual {v0, v13, v6, v10, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_5
    invoke-virtual {v0, v13, v6, v10, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_1
    check-cast v10, Ljava/util/ArrayList;

    .line 191
    .line 192
    move-object/from16 v0, p1

    .line 193
    .line 194
    check-cast v0, La/ou90;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    move v4, v6

    .line 204
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    if-eqz v10, :cond_d

    .line 209
    .line 210
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    check-cast v10, La/pu90;

    .line 215
    .line 216
    invoke-virtual {v10}, La/pu90;->n()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    instance-of v14, v13, La/p6z;

    .line 221
    .line 222
    if-eqz v14, :cond_7

    .line 223
    .line 224
    check-cast v13, La/p6z;

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_7
    move-object v13, v7

    .line 228
    :goto_5
    if-eqz v13, :cond_8

    .line 229
    .line 230
    invoke-interface {v13}, La/p6z;->g0()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    goto :goto_6

    .line 235
    :cond_8
    move-object v13, v7

    .line 236
    :goto_6
    const-string v14, "REGISTER_APP_BAR_ID"

    .line 237
    .line 238
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    if-eqz v14, :cond_9

    .line 243
    .line 244
    invoke-virtual {v0, v10, v6, v6, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 245
    .line 246
    .line 247
    iget v10, v10, La/pu90;->b:I

    .line 248
    .line 249
    add-int/2addr v4, v10

    .line 250
    goto :goto_4

    .line 251
    :cond_9
    const-string v14, "REGISTER_BOTTOM_BAR_ID"

    .line 252
    .line 253
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    if-eqz v14, :cond_a

    .line 258
    .line 259
    invoke-static {v8, v9}, La/p4e;->h(J)I

    .line 260
    .line 261
    .line 262
    move-result v13

    .line 263
    iget v14, v10, La/pu90;->b:I

    .line 264
    .line 265
    sub-int/2addr v13, v14

    .line 266
    sub-int/2addr v13, v11

    .line 267
    invoke-virtual {v0, v10, v6, v13, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_a
    const-string v14, "REGISTER_LOADER_ID"

    .line 272
    .line 273
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v14

    .line 277
    if-eqz v14, :cond_b

    .line 278
    .line 279
    invoke-virtual {v0, v10, v6, v4, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_b
    invoke-static {v13, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v13

    .line 287
    if-eqz v13, :cond_c

    .line 288
    .line 289
    const/high16 v13, 0x40000000    # 2.0f

    .line 290
    .line 291
    invoke-virtual {v0, v10, v6, v4, v13}, La/ou90;->m(La/pu90;IIF)V

    .line 292
    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_c
    invoke-virtual {v0, v10, v6, v4, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_2
    check-cast v10, Ljava/util/ArrayList;

    .line 303
    .line 304
    move-object/from16 v0, p1

    .line 305
    .line 306
    check-cast v0, La/ou90;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    :cond_e
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_13

    .line 320
    .line 321
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    check-cast v2, La/pu90;

    .line 326
    .line 327
    invoke-virtual {v2}, La/pu90;->n()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    instance-of v4, v3, La/p6z;

    .line 332
    .line 333
    if-eqz v4, :cond_f

    .line 334
    .line 335
    check-cast v3, La/p6z;

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_f
    move-object v3, v7

    .line 339
    :goto_8
    if-eqz v3, :cond_10

    .line 340
    .line 341
    invoke-interface {v3}, La/p6z;->g0()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    goto :goto_9

    .line 346
    :cond_10
    move-object v3, v7

    .line 347
    :goto_9
    const-string v4, "PitchPlayerLogo"

    .line 348
    .line 349
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    const/high16 v5, 0x41900000    # 18.0f

    .line 354
    .line 355
    const/4 v10, 0x2

    .line 356
    if-eqz v4, :cond_11

    .line 357
    .line 358
    sget-object v3, La/qmk;->a:La/zcl;

    .line 359
    .line 360
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    invoke-static {v8, v9}, La/p4e;->i(J)I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    iget v5, v2, La/pu90;->a:I

    .line 369
    .line 370
    sub-int/2addr v4, v5

    .line 371
    div-int/2addr v4, v10

    .line 372
    iget v5, v2, La/pu90;->b:I

    .line 373
    .line 374
    div-int/2addr v5, v10

    .line 375
    sub-int/2addr v3, v5

    .line 376
    invoke-virtual {v0, v2, v4, v3, v12}, La/ou90;->g(La/pu90;IIF)V

    .line 377
    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_11
    const-string v4, "PitchPlayerName"

    .line 381
    .line 382
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-eqz v4, :cond_12

    .line 387
    .line 388
    sget-object v3, La/qmk;->a:La/zcl;

    .line 389
    .line 390
    invoke-interface {v0, v5}, La/w6k;->T(F)I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    mul-int/2addr v3, v10

    .line 395
    const/high16 v4, 0x40800000    # 4.0f

    .line 396
    .line 397
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    sub-int/2addr v3, v4

    .line 402
    invoke-static {v8, v9}, La/p4e;->h(J)I

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    sub-int/2addr v4, v3

    .line 407
    iget v5, v2, La/pu90;->b:I

    .line 408
    .line 409
    invoke-static {v4, v5, v10, v3}, La/hne;->d(IIII)I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    invoke-virtual {v0, v2, v11, v3, v12}, La/ou90;->g(La/pu90;IIF)V

    .line 414
    .line 415
    .line 416
    goto :goto_7

    .line 417
    :cond_12
    const-string v4, "PitchPlayerCaptainTag"

    .line 418
    .line 419
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-eqz v3, :cond_e

    .line 424
    .line 425
    invoke-static {v8, v9}, La/p4e;->i(J)I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    div-int/2addr v3, v10

    .line 430
    sget-object v4, La/qmk;->a:La/zcl;

    .line 431
    .line 432
    const/high16 v4, 0x41200000    # 10.0f

    .line 433
    .line 434
    invoke-interface {v0, v4}, La/w6k;->T(F)I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    add-int/2addr v4, v3

    .line 439
    invoke-virtual {v0, v2, v4, v6, v12}, La/ou90;->g(La/pu90;IIF)V

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object v0

    .line 446
    :pswitch_3
    check-cast v10, Ljava/util/ArrayList;

    .line 447
    .line 448
    move-object/from16 v0, p1

    .line 449
    .line 450
    check-cast v0, La/ou90;

    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    :cond_14
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-eqz v2, :cond_1b

    .line 464
    .line 465
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    check-cast v2, La/pu90;

    .line 470
    .line 471
    invoke-virtual {v2}, La/pu90;->n()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    instance-of v5, v3, La/p6z;

    .line 476
    .line 477
    if-eqz v5, :cond_15

    .line 478
    .line 479
    check-cast v3, La/p6z;

    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_15
    move-object v3, v7

    .line 483
    :goto_b
    if-eqz v3, :cond_16

    .line 484
    .line 485
    invoke-interface {v3}, La/p6z;->g0()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    goto :goto_c

    .line 490
    :cond_16
    move-object v3, v7

    .line 491
    :goto_c
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-eqz v5, :cond_17

    .line 496
    .line 497
    invoke-virtual {v0, v2, v6, v11, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 498
    .line 499
    .line 500
    iget v2, v2, La/pu90;->b:I

    .line 501
    .line 502
    :goto_d
    add-int/2addr v11, v2

    .line 503
    goto :goto_a

    .line 504
    :cond_17
    const-string v5, "SEGMENT_CONTROL_ID"

    .line 505
    .line 506
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    if-eqz v5, :cond_18

    .line 511
    .line 512
    invoke-virtual {v0, v2, v6, v11, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 513
    .line 514
    .line 515
    iget v2, v2, La/pu90;->b:I

    .line 516
    .line 517
    goto :goto_d

    .line 518
    :cond_18
    const-string v5, "MIDDLE_CONTENT_ID"

    .line 519
    .line 520
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    if-eqz v5, :cond_19

    .line 525
    .line 526
    invoke-virtual {v0, v2, v6, v11, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 527
    .line 528
    .line 529
    iget v2, v2, La/pu90;->b:I

    .line 530
    .line 531
    goto :goto_d

    .line 532
    :cond_19
    const-string v5, "BETTING_ID"

    .line 533
    .line 534
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    if-eqz v5, :cond_1a

    .line 539
    .line 540
    invoke-static {v8, v9}, La/p4e;->h(J)I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    iget v5, v2, La/pu90;->b:I

    .line 545
    .line 546
    sub-int/2addr v3, v5

    .line 547
    invoke-virtual {v0, v2, v6, v3, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 548
    .line 549
    .line 550
    goto :goto_a

    .line 551
    :cond_1a
    const-string v5, "BACKGROUND_ID"

    .line 552
    .line 553
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-eqz v3, :cond_14

    .line 558
    .line 559
    invoke-virtual {v0, v2, v6, v6, v12}, La/ou90;->m(La/pu90;IIF)V

    .line 560
    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 564
    .line 565
    return-object v0

    .line 566
    nop

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
