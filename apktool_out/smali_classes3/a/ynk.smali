.class public final synthetic La/ynk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ynk;->a:B

    iput-object p1, p0, La/ynk;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ynk;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x3

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    const-string v6, "TRANSFER_CHIP"

    .line 10
    .line 11
    const-wide/16 v7, 0x2

    .line 12
    .line 13
    const-string v9, "LEADERBOARD_CHIP"

    .line 14
    .line 15
    const-wide/16 v10, 0x1

    .line 16
    .line 17
    const/4 v12, 0x0

    .line 18
    const-string v13, ""

    .line 19
    .line 20
    const-string v14, "MATCH_RESULT_CHIP"

    .line 21
    .line 22
    const-string v15, "CALENDAR_CHIP"

    .line 23
    .line 24
    iget-object v0, v0, La/ynk;->b:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    new-instance v2, La/kd50;

    .line 38
    .line 39
    invoke-direct {v2, v1}, La/kd50;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object/from16 v1, p1

    .line 49
    .line 50
    check-cast v1, Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v2, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 56
    .line 57
    invoke-direct {v2, v1, v12}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/p3l;

    .line 61
    .line 62
    const/16 v3, 0x16

    .line 63
    .line 64
    invoke-direct {v1, v0, v3}, La/p3l;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, La/p3l;

    .line 71
    .line 72
    const/16 v3, 0x17

    .line 73
    .line 74
    invoke-direct {v1, v0, v3}, La/p3l;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setOnTitlesClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/ynk;

    .line 81
    .line 82
    const/16 v3, 0x1d

    .line 83
    .line 84
    invoke-direct {v1, v0, v3}, La/ynk;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setOnSearchViewExpandedStateChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, La/jt6;

    .line 91
    .line 92
    const/4 v3, 0x7

    .line 93
    invoke-direct {v1, v0, v3}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v2, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 97
    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    invoke-interface {v0, v1}, La/s96;->f(Landroid/text/TextWatcher;)V

    .line 101
    .line 102
    .line 103
    :cond_0
    return-object v2

    .line 104
    :pswitch_1
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    sget v2, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->l:I

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_2
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    new-instance v2, La/phm;

    .line 128
    .line 129
    invoke-direct {v2, v1}, La/phm;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_3
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, Ljava/lang/Long;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 143
    .line 144
    .line 145
    move-result-wide v1

    .line 146
    new-instance v3, La/khm;

    .line 147
    .line 148
    invoke-direct {v3, v1, v2}, La/khm;-><init>(J)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_4
    move-object/from16 v1, p1

    .line 158
    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-instance v2, La/qhm;

    .line 165
    .line 166
    invoke-direct {v2, v1}, La/qhm;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_5
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v2, La/shm;

    .line 183
    .line 184
    invoke-direct {v2, v1}, La/shm;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_6
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance v2, La/qhm;

    .line 201
    .line 202
    invoke-direct {v2, v1}, La/qhm;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_7
    move-object/from16 v1, p1

    .line 212
    .line 213
    check-cast v1, Ljava/lang/Integer;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    new-instance v2, La/phm;

    .line 220
    .line 221
    invoke-direct {v2, v1}, La/phm;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_8
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, Ljava/lang/Integer;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    new-instance v2, La/phm;

    .line 239
    .line 240
    invoke-direct {v2, v1}, La/phm;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_9
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    new-instance v2, La/qhm;

    .line 257
    .line 258
    invoke-direct {v2, v1}, La/qhm;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_a
    move-object/from16 v1, p1

    .line 268
    .line 269
    check-cast v1, La/o0x;

    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    instance-of v2, v1, La/n0x;

    .line 275
    .line 276
    if-eqz v2, :cond_1

    .line 277
    .line 278
    move-object v12, v1

    .line 279
    check-cast v12, La/n0x;

    .line 280
    .line 281
    :cond_1
    if-eqz v12, :cond_2

    .line 282
    .line 283
    iget-object v1, v12, La/n0x;->a:Ljava/lang/String;

    .line 284
    .line 285
    if-eqz v1, :cond_2

    .line 286
    .line 287
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    return-object v0

    .line 293
    :pswitch_b
    move-object/from16 v1, p1

    .line 294
    .line 295
    check-cast v1, Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    .line 299
    .line 300
    if-eqz v0, :cond_3

    .line 301
    .line 302
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_c
    move-object/from16 v1, p1

    .line 309
    .line 310
    check-cast v1, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    if-eqz v0, :cond_4

    .line 316
    .line 317
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_d
    move-object/from16 v1, p1

    .line 324
    .line 325
    check-cast v1, La/ims;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v2, La/m1l;

    .line 331
    .line 332
    invoke-direct {v2, v1}, La/m1l;-><init>(La/ims;)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_e
    move-object/from16 v1, p1

    .line 342
    .line 343
    check-cast v1, La/nus;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    new-instance v2, La/w1l;

    .line 349
    .line 350
    invoke-direct {v2, v1}, La/w1l;-><init>(La/nus;)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_f
    move-object/from16 v1, p1

    .line 360
    .line 361
    check-cast v1, Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance v2, La/l1l;

    .line 367
    .line 368
    invoke-direct {v2, v1}, La/l1l;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_10
    move-object/from16 v1, p1

    .line 378
    .line 379
    check-cast v1, Ljava/lang/Long;

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v1

    .line 385
    new-instance v3, La/v1l;

    .line 386
    .line 387
    invoke-direct {v3, v1, v2}, La/v1l;-><init>(J)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object v0

    .line 396
    :pswitch_11
    move-object/from16 v1, p1

    .line 397
    .line 398
    check-cast v1, Ljava/lang/Integer;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    new-instance v2, La/o1l;

    .line 405
    .line 406
    invoke-direct {v2, v1}, La/o1l;-><init>(I)V

    .line 407
    .line 408
    .line 409
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_12
    move-object/from16 v1, p1

    .line 416
    .line 417
    check-cast v1, La/uss;

    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    new-instance v2, La/j1l;

    .line 423
    .line 424
    invoke-direct {v2, v1}, La/j1l;-><init>(La/uss;)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    return-object v0

    .line 433
    :pswitch_13
    move-object/from16 v1, p1

    .line 434
    .line 435
    check-cast v1, La/hdb;

    .line 436
    .line 437
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    new-instance v2, La/i1l;

    .line 441
    .line 442
    invoke-direct {v2, v1}, La/i1l;-><init>(La/hdb;)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_14
    move-object/from16 v1, p1

    .line 452
    .line 453
    check-cast v1, La/rdv0;

    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    new-instance v2, La/gpk;

    .line 459
    .line 460
    iget-wide v3, v1, La/rdv0;->a:J

    .line 461
    .line 462
    iget-wide v5, v1, La/rdv0;->b:J

    .line 463
    .line 464
    iget-wide v7, v1, La/rdv0;->c:J

    .line 465
    .line 466
    invoke-direct/range {v2 .. v8}, La/gpk;-><init>(JJJ)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_15
    move-object/from16 v1, p1

    .line 476
    .line 477
    check-cast v1, La/fdv0;

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    sget-object v2, La/adv0;->a:La/adv0;

    .line 483
    .line 484
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_5

    .line 489
    .line 490
    move-object v13, v15

    .line 491
    goto :goto_0

    .line 492
    :cond_5
    sget-object v2, La/ddv0;->a:La/ddv0;

    .line 493
    .line 494
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_6

    .line 499
    .line 500
    move-object v13, v14

    .line 501
    goto :goto_0

    .line 502
    :cond_6
    sget-object v2, La/bdv0;->a:La/bdv0;

    .line 503
    .line 504
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-eqz v2, :cond_7

    .line 509
    .line 510
    const-string v13, "EXPAND_MARKET_CHIP"

    .line 511
    .line 512
    goto :goto_0

    .line 513
    :cond_7
    sget-object v2, La/edv0;->a:La/edv0;

    .line 514
    .line 515
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_8

    .line 520
    .line 521
    const-string v13, "HEADER_CHAMPIONSHIPS"

    .line 522
    .line 523
    :cond_8
    :goto_0
    new-instance v1, La/yok;

    .line 524
    .line 525
    invoke-direct {v1, v13}, La/yok;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_16
    move-object/from16 v1, p1

    .line 535
    .line 536
    check-cast v1, Ljava/lang/Long;

    .line 537
    .line 538
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 539
    .line 540
    .line 541
    move-result-wide v16

    .line 542
    cmp-long v1, v16, v10

    .line 543
    .line 544
    if-nez v1, :cond_9

    .line 545
    .line 546
    move-object v6, v9

    .line 547
    goto :goto_1

    .line 548
    :cond_9
    cmp-long v1, v16, v7

    .line 549
    .line 550
    if-nez v1, :cond_a

    .line 551
    .line 552
    goto :goto_1

    .line 553
    :cond_a
    cmp-long v1, v16, v4

    .line 554
    .line 555
    if-nez v1, :cond_b

    .line 556
    .line 557
    move-object v6, v14

    .line 558
    goto :goto_1

    .line 559
    :cond_b
    cmp-long v1, v16, v2

    .line 560
    .line 561
    if-nez v1, :cond_c

    .line 562
    .line 563
    move-object v6, v15

    .line 564
    goto :goto_1

    .line 565
    :cond_c
    const-wide/16 v1, 0x4

    .line 566
    .line 567
    cmp-long v1, v16, v1

    .line 568
    .line 569
    if-nez v1, :cond_d

    .line 570
    .line 571
    const-string v6, "META_HEROES_CHIP"

    .line 572
    .line 573
    goto :goto_1

    .line 574
    :cond_d
    move-object v6, v13

    .line 575
    :goto_1
    new-instance v1, La/yok;

    .line 576
    .line 577
    invoke-direct {v1, v6}, La/yok;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object v0

    .line 586
    :pswitch_17
    move-object/from16 v1, p1

    .line 587
    .line 588
    check-cast v1, La/m8m;

    .line 589
    .line 590
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_18
    move-object/from16 v1, p1

    .line 600
    .line 601
    check-cast v1, La/smh;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    iget-wide v1, v1, La/smh;->a:J

    .line 607
    .line 608
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 616
    .line 617
    return-object v0

    .line 618
    :pswitch_19
    move-object/from16 v1, p1

    .line 619
    .line 620
    check-cast v1, La/ona;

    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    new-instance v12, La/yok;

    .line 626
    .line 627
    iget-byte v1, v1, La/ona;->a:B

    .line 628
    .line 629
    move-wide/from16 v16, v2

    .line 630
    .line 631
    int-to-long v2, v1

    .line 632
    cmp-long v1, v2, v4

    .line 633
    .line 634
    if-nez v1, :cond_e

    .line 635
    .line 636
    move-object v6, v14

    .line 637
    goto :goto_2

    .line 638
    :cond_e
    cmp-long v1, v2, v10

    .line 639
    .line 640
    if-nez v1, :cond_f

    .line 641
    .line 642
    move-object v6, v9

    .line 643
    goto :goto_2

    .line 644
    :cond_f
    cmp-long v1, v2, v7

    .line 645
    .line 646
    if-nez v1, :cond_10

    .line 647
    .line 648
    goto :goto_2

    .line 649
    :cond_10
    cmp-long v1, v2, v16

    .line 650
    .line 651
    if-nez v1, :cond_11

    .line 652
    .line 653
    move-object v6, v15

    .line 654
    goto :goto_2

    .line 655
    :cond_11
    move-object v6, v13

    .line 656
    :goto_2
    invoke-direct {v12, v6}, La/yok;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    invoke-interface {v0, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 663
    .line 664
    return-object v0

    .line 665
    :pswitch_1a
    move-object/from16 v1, p1

    .line 666
    .line 667
    check-cast v1, Ljava/lang/Long;

    .line 668
    .line 669
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 670
    .line 671
    .line 672
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 676
    .line 677
    return-object v0

    .line 678
    :pswitch_1b
    move-object/from16 v1, p1

    .line 679
    .line 680
    check-cast v1, La/e8m;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    iget-wide v1, v1, La/e8m;->a:J

    .line 686
    .line 687
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0

    .line 697
    :pswitch_1c
    move-object/from16 v1, p1

    .line 698
    .line 699
    check-cast v1, La/ona;

    .line 700
    .line 701
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    iget-byte v1, v1, La/ona;->a:B

    .line 705
    .line 706
    int-to-long v1, v1

    .line 707
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 715
    .line 716
    return-object v0

    .line 717
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
