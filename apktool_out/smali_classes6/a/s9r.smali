.class public final synthetic La/s9r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/s9r;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/s9r;->a:B

    .line 4
    .line 5
    const/16 v7, 0xd

    .line 6
    .line 7
    const/16 v8, 0xc

    .line 8
    .line 9
    const/16 v9, 0xb

    .line 10
    .line 11
    const/16 v10, 0xa

    .line 12
    .line 13
    const/16 v11, 0x9

    .line 14
    .line 15
    const/16 v12, 0x8

    .line 16
    .line 17
    const/4 v13, 0x7

    .line 18
    const/4 v14, 0x6

    .line 19
    const/4 v15, 0x5

    .line 20
    const/16 v16, 0x4

    .line 21
    .line 22
    const/16 v17, 0x3

    .line 23
    .line 24
    const/16 v18, 0x2

    .line 25
    .line 26
    const/16 p0, 0x14

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const/16 v19, 0x13

    .line 30
    .line 31
    const/16 v2, 0xf

    .line 32
    .line 33
    const/16 v20, 0x12

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/16 v21, 0x11

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    packed-switch v0, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    new-instance v0, La/zw3;

    .line 43
    .line 44
    sget-object v1, La/zn2;->a:La/zn2;

    .line 45
    .line 46
    invoke-direct {v0, v1, v4}, La/zw3;-><init>(La/jiy;B)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_0
    new-instance v0, La/zw3;

    .line 51
    .line 52
    sget-object v1, La/yvm0;->a:La/yvm0;

    .line 53
    .line 54
    invoke-direct {v0, v1, v4}, La/zw3;-><init>(La/jiy;B)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    invoke-static {v4}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_2
    invoke-static {v4}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :pswitch_3
    invoke-static {v4}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_4
    sget-object v0, La/i7s;->a2:La/nek;

    .line 74
    .line 75
    invoke-static {v4}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :pswitch_5
    const/4 v0, 0x0

    .line 81
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_6
    sget-object v13, La/iun;->a:La/iun;

    .line 87
    .line 88
    sget-object v14, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 89
    .line 90
    new-instance v1, La/jdb;

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v15, 0x0

    .line 94
    const/4 v2, 0x0

    .line 95
    const-wide/16 v3, 0x0

    .line 96
    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v10, 0x0

    .line 103
    const-string v12, ""

    .line 104
    .line 105
    invoke-direct/range {v1 .. v15}, La/jdb;-><init>(IJJJLa/m9s;La/sff0;La/ypl0;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :pswitch_7
    const/4 v0, 0x0

    .line 110
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    :pswitch_8
    sget-object v0, La/fmr;->Companion:La/emr;

    .line 116
    .line 117
    invoke-virtual {v0}, La/emr;->serializer()La/jiy;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :pswitch_9
    invoke-static {}, La/fmr;->values()[La/fmr;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v51, "RightActionZones"

    .line 127
    .line 128
    const-string v52, "Ch"

    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const-string v23, "AddTime"

    .line 133
    .line 134
    const-string v24, "Stat1"

    .line 135
    .line 136
    const-string v25, "Stat2"

    .line 137
    .line 138
    const-string v26, "Team1Scores"

    .line 139
    .line 140
    const-string v27, "Team2Scores"

    .line 141
    .line 142
    const-string v28, "AltCaptionsByTeams"

    .line 143
    .line 144
    const-string v29, "statDay"

    .line 145
    .line 146
    const-string v30, "AltOpp"

    .line 147
    .line 148
    const-string v31, "statHomeAway"

    .line 149
    .line 150
    const-string v32, "IRedCard1"

    .line 151
    .line 152
    const-string v33, "IRedCard2"

    .line 153
    .line 154
    const-string v34, "IYellowCard1"

    .line 155
    .line 156
    const-string v35, "IYellowCard2"

    .line 157
    .line 158
    const-string v36, "ICorner1"

    .line 159
    .line 160
    const-string v37, "ICorner2"

    .line 161
    .line 162
    const-string v38, "T"

    .line 163
    .line 164
    const-string v39, "P1"

    .line 165
    .line 166
    const-string v40, "P2"

    .line 167
    .line 168
    const-string v41, "InnsStats"

    .line 169
    .line 170
    const-string v42, "STATE"

    .line 171
    .line 172
    const-string v43, "RoundTable"

    .line 173
    .line 174
    const-string v44, "Combination1"

    .line 175
    .line 176
    const-string v45, "F1"

    .line 177
    .line 178
    const-string v46, "F2"

    .line 179
    .line 180
    const-string v47, "Combination2"

    .line 181
    .line 182
    const-string v48, "Board"

    .line 183
    .line 184
    const-string v49, "LeftActionZones"

    .line 185
    .line 186
    const-string v50, "CentralActionZones"

    .line 187
    .line 188
    const/16 v53, 0x10

    .line 189
    .line 190
    filled-new-array/range {v22 .. v52}, [Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    const/16 v22, 0xe

    .line 195
    .line 196
    const/16 v6, 0x1f

    .line 197
    .line 198
    new-array v6, v6, [[Ljava/lang/annotation/Annotation;

    .line 199
    .line 200
    aput-object v1, v6, v4

    .line 201
    .line 202
    aput-object v1, v6, v3

    .line 203
    .line 204
    aput-object v1, v6, v18

    .line 205
    .line 206
    aput-object v1, v6, v17

    .line 207
    .line 208
    aput-object v1, v6, v16

    .line 209
    .line 210
    aput-object v1, v6, v15

    .line 211
    .line 212
    aput-object v1, v6, v14

    .line 213
    .line 214
    aput-object v1, v6, v13

    .line 215
    .line 216
    aput-object v1, v6, v12

    .line 217
    .line 218
    aput-object v1, v6, v11

    .line 219
    .line 220
    aput-object v1, v6, v10

    .line 221
    .line 222
    aput-object v1, v6, v9

    .line 223
    .line 224
    aput-object v1, v6, v8

    .line 225
    .line 226
    aput-object v1, v6, v7

    .line 227
    .line 228
    aput-object v1, v6, v22

    .line 229
    .line 230
    aput-object v1, v6, v2

    .line 231
    .line 232
    aput-object v1, v6, v53

    .line 233
    .line 234
    new-instance v7, La/iy;

    .line 235
    .line 236
    const-string v8, "P"

    .line 237
    .line 238
    const-string v9, "P1Cards"

    .line 239
    .line 240
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    invoke-direct {v7, v8, v2}, La/iy;-><init>([Ljava/lang/String;B)V

    .line 245
    .line 246
    .line 247
    new-array v8, v3, [Ljava/lang/annotation/Annotation;

    .line 248
    .line 249
    aput-object v7, v8, v4

    .line 250
    .line 251
    aput-object v8, v6, v21

    .line 252
    .line 253
    new-instance v7, La/iy;

    .line 254
    .line 255
    const-string v8, "D"

    .line 256
    .line 257
    const-string v9, "P2Cards"

    .line 258
    .line 259
    const-string v10, "B"

    .line 260
    .line 261
    filled-new-array {v10, v8, v9}, [Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-direct {v7, v8, v2}, La/iy;-><init>([Ljava/lang/String;B)V

    .line 266
    .line 267
    .line 268
    new-array v8, v3, [Ljava/lang/annotation/Annotation;

    .line 269
    .line 270
    aput-object v7, v8, v4

    .line 271
    .line 272
    aput-object v8, v6, v20

    .line 273
    .line 274
    aput-object v1, v6, v19

    .line 275
    .line 276
    new-instance v7, La/iy;

    .line 277
    .line 278
    const-string v8, "RG"

    .line 279
    .line 280
    const-string v9, "Status"

    .line 281
    .line 282
    const-string v10, "S"

    .line 283
    .line 284
    filled-new-array {v10, v8, v9}, [Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    invoke-direct {v7, v8, v2}, La/iy;-><init>([Ljava/lang/String;B)V

    .line 289
    .line 290
    .line 291
    new-array v2, v3, [Ljava/lang/annotation/Annotation;

    .line 292
    .line 293
    aput-object v7, v2, v4

    .line 294
    .line 295
    aput-object v2, v6, p0

    .line 296
    .line 297
    const/16 v2, 0x15

    .line 298
    .line 299
    aput-object v1, v6, v2

    .line 300
    .line 301
    const/16 v2, 0x16

    .line 302
    .line 303
    aput-object v1, v6, v2

    .line 304
    .line 305
    const/16 v2, 0x17

    .line 306
    .line 307
    aput-object v1, v6, v2

    .line 308
    .line 309
    const/16 v2, 0x18

    .line 310
    .line 311
    aput-object v1, v6, v2

    .line 312
    .line 313
    const/16 v2, 0x19

    .line 314
    .line 315
    aput-object v1, v6, v2

    .line 316
    .line 317
    const/16 v2, 0x1a

    .line 318
    .line 319
    aput-object v1, v6, v2

    .line 320
    .line 321
    const/16 v2, 0x1b

    .line 322
    .line 323
    aput-object v1, v6, v2

    .line 324
    .line 325
    const/16 v2, 0x1c

    .line 326
    .line 327
    aput-object v1, v6, v2

    .line 328
    .line 329
    const/16 v2, 0x1d

    .line 330
    .line 331
    aput-object v1, v6, v2

    .line 332
    .line 333
    const/16 v2, 0x1e

    .line 334
    .line 335
    aput-object v1, v6, v2

    .line 336
    .line 337
    const-string v1, "org.xplatform.betting.core.zip.data.model.GameAddTimeKeyResponse"

    .line 338
    .line 339
    invoke-static {v1, v0, v5, v6}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    :pswitch_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_b
    invoke-static {}, La/ajr;->values()[La/ajr;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    const-string v2, "light"

    .line 352
    .line 353
    const-string v3, "night"

    .line 354
    .line 355
    const-string v4, "dark"

    .line 356
    .line 357
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    filled-new-array {v1, v1, v1}, [[Ljava/lang/annotation/Annotation;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    const-string v3, "org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppTheme"

    .line 366
    .line 367
    invoke-static {v3, v0, v2, v1}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    :pswitch_c
    invoke-static {}, La/yir;->values()[La/yir;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    const-string v8, "back"

    .line 377
    .line 378
    const-string v9, "bonuses"

    .line 379
    .line 380
    const-string v1, "index"

    .line 381
    .line 382
    const-string v2, "lobby"

    .line 383
    .line 384
    const-string v3, "game"

    .line 385
    .line 386
    const-string v4, "promotion"

    .line 387
    .line 388
    const-string v5, "authorization"

    .line 389
    .line 390
    const-string v6, "registration"

    .line 391
    .line 392
    const-string v7, "recharge"

    .line 393
    .line 394
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    const/4 v9, 0x0

    .line 399
    const/4 v10, 0x0

    .line 400
    const/4 v2, 0x0

    .line 401
    const/4 v3, 0x0

    .line 402
    const/4 v4, 0x0

    .line 403
    const/4 v5, 0x0

    .line 404
    const/4 v6, 0x0

    .line 405
    const/4 v7, 0x0

    .line 406
    const/4 v8, 0x0

    .line 407
    filled-new-array/range {v2 .. v10}, [[Ljava/lang/annotation/Annotation;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const-string v3, "org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppRoute"

    .line 412
    .line 413
    invoke-static {v3, v0, v1, v2}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    return-object v0

    .line 418
    :pswitch_d
    invoke-static {}, La/tir;->values()[La/tir;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v2, "started"

    .line 423
    .line 424
    const-string v3, "finished"

    .line 425
    .line 426
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    filled-new-array {v1, v1}, [[Ljava/lang/annotation/Annotation;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    const-string v3, "org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppGameState"

    .line 435
    .line 436
    invoke-static {v3, v0, v2, v1}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    return-object v0

    .line 441
    :pswitch_e
    invoke-static {}, La/rir;->values()[La/rir;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    const-string v2, "notAuthWithoutDemoBalance"

    .line 446
    .line 447
    const-string v3, "toggleDemoGameAvailable"

    .line 448
    .line 449
    const-string v4, "disabledDemoMode"

    .line 450
    .line 451
    const-string v5, "authWithoutDemoBalance"

    .line 452
    .line 453
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    filled-new-array {v1, v1, v1, v1}, [[Ljava/lang/annotation/Annotation;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    const-string v3, "org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppDemoStatus"

    .line 462
    .line 463
    invoke-static {v3, v0, v2, v1}, La/ntb;->F(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La/g0o;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_f
    sget-object v0, La/ajr;->Companion:La/zir;

    .line 469
    .line 470
    invoke-virtual {v0}, La/zir;->serializer()La/jiy;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :pswitch_10
    sget-object v0, La/tir;->Companion:La/sir;

    .line 476
    .line 477
    invoke-virtual {v0}, La/sir;->serializer()La/jiy;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    return-object v0

    .line 482
    :pswitch_11
    sget-object v0, La/yir;->Companion:La/xir;

    .line 483
    .line 484
    invoke-virtual {v0}, La/xir;->serializer()La/jiy;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    return-object v0

    .line 489
    :pswitch_12
    sget-object v0, La/rir;->Companion:La/qir;

    .line 490
    .line 491
    invoke-virtual {v0}, La/qir;->serializer()La/jiy;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    return-object v0

    .line 496
    :pswitch_13
    const/16 v22, 0xe

    .line 497
    .line 498
    const/16 v53, 0x10

    .line 499
    .line 500
    new-instance v1, La/leh0;

    .line 501
    .line 502
    sget-object v0, La/sre0;->a:La/tre0;

    .line 503
    .line 504
    const-class v5, La/mir;

    .line 505
    .line 506
    invoke-virtual {v0, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    const-class v6, La/zfr;

    .line 511
    .line 512
    invoke-virtual {v0, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    move/from16 v23, v2

    .line 517
    .line 518
    const-class v2, La/dgr;

    .line 519
    .line 520
    invoke-virtual {v0, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    move/from16 v24, v7

    .line 525
    .line 526
    const-class v7, La/ggr;

    .line 527
    .line 528
    invoke-virtual {v0, v7}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 529
    .line 530
    .line 531
    move-result-object v7

    .line 532
    move/from16 v25, v8

    .line 533
    .line 534
    const-class v8, La/jgr;

    .line 535
    .line 536
    invoke-virtual {v0, v8}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    move/from16 v26, v9

    .line 541
    .line 542
    const-class v9, La/mgr;

    .line 543
    .line 544
    invoke-virtual {v0, v9}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    move/from16 v27, v10

    .line 549
    .line 550
    const-class v10, La/pgr;

    .line 551
    .line 552
    invoke-virtual {v0, v10}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    move/from16 v28, v11

    .line 557
    .line 558
    const-class v11, La/sgr;

    .line 559
    .line 560
    invoke-virtual {v0, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    move/from16 v29, v12

    .line 565
    .line 566
    const-class v12, La/vgr;

    .line 567
    .line 568
    invoke-virtual {v0, v12}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 569
    .line 570
    .line 571
    move-result-object v12

    .line 572
    move/from16 v30, v13

    .line 573
    .line 574
    const-class v13, La/ygr;

    .line 575
    .line 576
    invoke-virtual {v0, v13}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 577
    .line 578
    .line 579
    move-result-object v13

    .line 580
    move/from16 v31, v14

    .line 581
    .line 582
    const-class v14, La/bhr;

    .line 583
    .line 584
    invoke-virtual {v0, v14}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 585
    .line 586
    .line 587
    move-result-object v14

    .line 588
    move/from16 v32, v15

    .line 589
    .line 590
    const-class v15, La/ehr;

    .line 591
    .line 592
    invoke-virtual {v0, v15}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 593
    .line 594
    .line 595
    move-result-object v15

    .line 596
    move/from16 v33, v3

    .line 597
    .line 598
    const-class v3, La/hhr;

    .line 599
    .line 600
    invoke-virtual {v0, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    move/from16 v34, v4

    .line 605
    .line 606
    const-class v4, La/khr;

    .line 607
    .line 608
    invoke-virtual {v0, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    move-object/from16 v35, v1

    .line 613
    .line 614
    const-class v1, La/nhr;

    .line 615
    .line 616
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    move-object/from16 v36, v1

    .line 621
    .line 622
    const-class v1, La/qhr;

    .line 623
    .line 624
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    move-object/from16 v37, v1

    .line 629
    .line 630
    const-class v1, La/thr;

    .line 631
    .line 632
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    move-object/from16 v38, v1

    .line 637
    .line 638
    const-class v1, La/whr;

    .line 639
    .line 640
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    move-object/from16 v39, v1

    .line 645
    .line 646
    const-class v1, La/zhr;

    .line 647
    .line 648
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    move-object/from16 v40, v1

    .line 653
    .line 654
    const-class v1, La/cir;

    .line 655
    .line 656
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    move-object/from16 v41, v1

    .line 661
    .line 662
    const-class v1, La/fir;

    .line 663
    .line 664
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    move-object/from16 v42, v1

    .line 669
    .line 670
    const-class v1, La/iir;

    .line 671
    .line 672
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    move-object/from16 v43, v1

    .line 677
    .line 678
    const-class v1, La/lir;

    .line 679
    .line 680
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    const/16 v1, 0x16

    .line 685
    .line 686
    new-array v1, v1, [La/sgy;

    .line 687
    .line 688
    aput-object v6, v1, v34

    .line 689
    .line 690
    aput-object v2, v1, v33

    .line 691
    .line 692
    aput-object v7, v1, v18

    .line 693
    .line 694
    aput-object v8, v1, v17

    .line 695
    .line 696
    aput-object v9, v1, v16

    .line 697
    .line 698
    aput-object v10, v1, v32

    .line 699
    .line 700
    aput-object v11, v1, v31

    .line 701
    .line 702
    aput-object v12, v1, v30

    .line 703
    .line 704
    aput-object v13, v1, v29

    .line 705
    .line 706
    aput-object v14, v1, v28

    .line 707
    .line 708
    aput-object v15, v1, v27

    .line 709
    .line 710
    aput-object v3, v1, v26

    .line 711
    .line 712
    aput-object v4, v1, v25

    .line 713
    .line 714
    aput-object v36, v1, v24

    .line 715
    .line 716
    aput-object v37, v1, v22

    .line 717
    .line 718
    aput-object v38, v1, v23

    .line 719
    .line 720
    aput-object v39, v1, v53

    .line 721
    .line 722
    aput-object v40, v1, v21

    .line 723
    .line 724
    aput-object v41, v1, v20

    .line 725
    .line 726
    aput-object v42, v1, v19

    .line 727
    .line 728
    aput-object v43, v1, p0

    .line 729
    .line 730
    const/16 v2, 0x15

    .line 731
    .line 732
    aput-object v0, v1, v2

    .line 733
    .line 734
    const/16 v0, 0x16

    .line 735
    .line 736
    new-array v0, v0, [La/jiy;

    .line 737
    .line 738
    sget-object v2, La/xfr;->a:La/xfr;

    .line 739
    .line 740
    aput-object v2, v0, v34

    .line 741
    .line 742
    sget-object v2, La/bgr;->a:La/bgr;

    .line 743
    .line 744
    aput-object v2, v0, v33

    .line 745
    .line 746
    sget-object v2, La/egr;->a:La/egr;

    .line 747
    .line 748
    aput-object v2, v0, v18

    .line 749
    .line 750
    sget-object v2, La/hgr;->a:La/hgr;

    .line 751
    .line 752
    aput-object v2, v0, v17

    .line 753
    .line 754
    sget-object v2, La/kgr;->a:La/kgr;

    .line 755
    .line 756
    aput-object v2, v0, v16

    .line 757
    .line 758
    sget-object v2, La/ngr;->a:La/ngr;

    .line 759
    .line 760
    aput-object v2, v0, v32

    .line 761
    .line 762
    sget-object v2, La/qgr;->a:La/qgr;

    .line 763
    .line 764
    aput-object v2, v0, v31

    .line 765
    .line 766
    sget-object v2, La/tgr;->a:La/tgr;

    .line 767
    .line 768
    aput-object v2, v0, v30

    .line 769
    .line 770
    sget-object v2, La/wgr;->a:La/wgr;

    .line 771
    .line 772
    aput-object v2, v0, v29

    .line 773
    .line 774
    sget-object v2, La/zgr;->a:La/zgr;

    .line 775
    .line 776
    aput-object v2, v0, v28

    .line 777
    .line 778
    sget-object v2, La/chr;->a:La/chr;

    .line 779
    .line 780
    aput-object v2, v0, v27

    .line 781
    .line 782
    sget-object v2, La/fhr;->a:La/fhr;

    .line 783
    .line 784
    aput-object v2, v0, v26

    .line 785
    .line 786
    sget-object v2, La/ihr;->a:La/ihr;

    .line 787
    .line 788
    aput-object v2, v0, v25

    .line 789
    .line 790
    sget-object v2, La/lhr;->a:La/lhr;

    .line 791
    .line 792
    aput-object v2, v0, v24

    .line 793
    .line 794
    sget-object v2, La/ohr;->a:La/ohr;

    .line 795
    .line 796
    aput-object v2, v0, v22

    .line 797
    .line 798
    sget-object v2, La/rhr;->a:La/rhr;

    .line 799
    .line 800
    aput-object v2, v0, v23

    .line 801
    .line 802
    sget-object v2, La/uhr;->a:La/uhr;

    .line 803
    .line 804
    aput-object v2, v0, v53

    .line 805
    .line 806
    sget-object v2, La/xhr;->a:La/xhr;

    .line 807
    .line 808
    aput-object v2, v0, v21

    .line 809
    .line 810
    sget-object v2, La/air;->a:La/air;

    .line 811
    .line 812
    aput-object v2, v0, v20

    .line 813
    .line 814
    sget-object v2, La/dir;->a:La/dir;

    .line 815
    .line 816
    aput-object v2, v0, v19

    .line 817
    .line 818
    sget-object v2, La/gir;->a:La/gir;

    .line 819
    .line 820
    aput-object v2, v0, p0

    .line 821
    .line 822
    sget-object v2, La/jir;->a:La/jir;

    .line 823
    .line 824
    const/16 v3, 0x15

    .line 825
    .line 826
    aput-object v2, v0, v3

    .line 827
    .line 828
    move/from16 v2, v34

    .line 829
    .line 830
    new-array v6, v2, [Ljava/lang/annotation/Annotation;

    .line 831
    .line 832
    const-string v2, "org.xplatform.web.impl.domain.models.gp_web_app.GPWebApp"

    .line 833
    .line 834
    move-object v4, v1

    .line 835
    move-object v3, v5

    .line 836
    move-object/from16 v1, v35

    .line 837
    .line 838
    move-object v5, v0

    .line 839
    invoke-direct/range {v1 .. v6}, La/leh0;-><init>(Ljava/lang/String;La/sgy;[La/sgy;[La/jiy;[Ljava/lang/annotation/Annotation;)V

    .line 840
    .line 841
    .line 842
    return-object v1

    .line 843
    :pswitch_14
    move v2, v4

    .line 844
    new-instance v0, La/zw3;

    .line 845
    .line 846
    sget-object v1, La/whp0;->a:La/whp0;

    .line 847
    .line 848
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 849
    .line 850
    .line 851
    return-object v0

    .line 852
    :pswitch_15
    move v2, v4

    .line 853
    new-instance v0, La/zw3;

    .line 854
    .line 855
    sget-object v1, La/vft0;->a:La/vft0;

    .line 856
    .line 857
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 858
    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_17
    move/from16 v33, v3

    .line 865
    .line 866
    move v2, v4

    .line 867
    new-instance v0, La/rar;

    .line 868
    .line 869
    sget-object v1, La/iun;->a:La/iun;

    .line 870
    .line 871
    invoke-direct {v0, v1, v3, v2, v2}, La/rar;-><init>(Ljava/util/List;ZZZ)V

    .line 872
    .line 873
    .line 874
    return-object v0

    .line 875
    :pswitch_18
    move v2, v4

    .line 876
    new-instance v0, La/zw3;

    .line 877
    .line 878
    sget-object v1, La/zwk;->a:La/zwk;

    .line 879
    .line 880
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 881
    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_19
    move v2, v4

    .line 885
    new-instance v0, La/zw3;

    .line 886
    .line 887
    new-instance v1, La/zw3;

    .line 888
    .line 889
    sget-object v3, La/okx;->a:La/okx;

    .line 890
    .line 891
    invoke-direct {v1, v3, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 892
    .line 893
    .line 894
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 895
    .line 896
    .line 897
    return-object v0

    .line 898
    :pswitch_1a
    move v2, v4

    .line 899
    new-instance v0, La/zw3;

    .line 900
    .line 901
    sget-object v1, La/w9r;->a:La/w9r;

    .line 902
    .line 903
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 904
    .line 905
    .line 906
    return-object v0

    .line 907
    :pswitch_1b
    move v2, v4

    .line 908
    new-instance v0, La/inv;

    .line 909
    .line 910
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 911
    .line 912
    new-instance v3, La/zw3;

    .line 913
    .line 914
    sget-object v4, La/okx;->a:La/okx;

    .line 915
    .line 916
    invoke-direct {v3, v4, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 917
    .line 918
    .line 919
    const/4 v2, 0x1

    .line 920
    invoke-direct {v0, v1, v3, v2}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 921
    .line 922
    .line 923
    return-object v0

    .line 924
    :pswitch_1c
    move v2, v4

    .line 925
    new-instance v0, La/zw3;

    .line 926
    .line 927
    new-instance v1, La/zw3;

    .line 928
    .line 929
    sget-object v3, La/okx;->a:La/okx;

    .line 930
    .line 931
    invoke-direct {v1, v3, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 932
    .line 933
    .line 934
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 935
    .line 936
    .line 937
    return-object v0

    .line 938
    nop

    .line 939
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
