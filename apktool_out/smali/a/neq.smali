.class public final La/neq;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/us00;


# direct methods
.method public synthetic constructor <init>(La/us00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/neq;->a:B

    iput-object p1, p0, La/neq;->b:La/us00;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/neq;->a:B

    .line 4
    .line 5
    const-string v2, "activity"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/neq;->b:La/us00;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    const-string v1, "sensor"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v0, Landroid/hardware/SensorManager;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_2
    invoke-virtual {v0, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v0, v3

    .line 55
    :goto_0
    if-eqz v0, :cond_1

    .line 56
    .line 57
    new-instance v3, Landroid/os/StatFs;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    return-object v3

    .line 73
    :pswitch_3
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    check-cast v0, Landroid/app/ActivityManager;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_4
    const-string v1, "input"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v0, Landroid/hardware/input/InputManager;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_5
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_6
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v0, Landroid/app/ActivityManager;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_7
    new-instance v1, La/peq;

    .line 114
    .line 115
    sget v2, La/oeq;->a:I

    .line 116
    .line 117
    new-instance v4, La/zeq;

    .line 118
    .line 119
    new-instance v5, La/kud;

    .line 120
    .line 121
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v6, La/zpu;

    .line 125
    .line 126
    new-instance v2, La/neq;

    .line 127
    .line 128
    const/16 v7, 0xa

    .line 129
    .line 130
    invoke-direct {v2, v0, v7}, La/neq;-><init>(La/us00;B)V

    .line 131
    .line 132
    .line 133
    const-wide/16 v8, 0x3e8

    .line 134
    .line 135
    invoke-static {v8, v9, v2}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 140
    .line 141
    instance-of v10, v2, La/g0g0;

    .line 142
    .line 143
    if-eqz v10, :cond_2

    .line 144
    .line 145
    move-object v2, v3

    .line 146
    :cond_2
    check-cast v2, Landroid/app/ActivityManager;

    .line 147
    .line 148
    sget-object v10, La/w7f;->j:La/w7f;

    .line 149
    .line 150
    invoke-static {v8, v9, v10}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    instance-of v11, v10, La/g0g0;

    .line 155
    .line 156
    if-eqz v11, :cond_3

    .line 157
    .line 158
    move-object v10, v3

    .line 159
    :cond_3
    check-cast v10, Landroid/os/StatFs;

    .line 160
    .line 161
    new-instance v11, La/neq;

    .line 162
    .line 163
    const/16 v12, 0xb

    .line 164
    .line 165
    invoke-direct {v11, v0, v12}, La/neq;-><init>(La/us00;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {v8, v9, v11}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    instance-of v13, v11, La/g0g0;

    .line 173
    .line 174
    if-eqz v13, :cond_4

    .line 175
    .line 176
    move-object v11, v3

    .line 177
    :cond_4
    check-cast v11, Landroid/os/StatFs;

    .line 178
    .line 179
    const/16 v11, 0x18

    .line 180
    .line 181
    invoke-direct {v6, v2, v10, v11}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    move v2, v7

    .line 185
    new-instance v7, La/eyg0;

    .line 186
    .line 187
    new-instance v10, La/neq;

    .line 188
    .line 189
    const/16 v11, 0xd

    .line 190
    .line 191
    invoke-direct {v10, v0, v11}, La/neq;-><init>(La/us00;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v8, v9, v10}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    instance-of v11, v10, La/g0g0;

    .line 199
    .line 200
    if-eqz v11, :cond_5

    .line 201
    .line 202
    move-object v10, v3

    .line 203
    :cond_5
    check-cast v10, Landroid/hardware/SensorManager;

    .line 204
    .line 205
    const/4 v11, 0x6

    .line 206
    invoke-direct {v7, v10, v11}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 207
    .line 208
    .line 209
    new-instance v10, La/svu;

    .line 210
    .line 211
    new-instance v11, La/neq;

    .line 212
    .line 213
    const/16 v13, 0x9

    .line 214
    .line 215
    invoke-direct {v11, v0, v13}, La/neq;-><init>(La/us00;B)V

    .line 216
    .line 217
    .line 218
    invoke-static {v8, v9, v11}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    instance-of v13, v11, La/g0g0;

    .line 223
    .line 224
    if-eqz v13, :cond_6

    .line 225
    .line 226
    move-object v11, v3

    .line 227
    :cond_6
    check-cast v11, Landroid/hardware/input/InputManager;

    .line 228
    .line 229
    invoke-direct {v10, v11}, La/svu;-><init>(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    new-instance v11, La/bb6;

    .line 233
    .line 234
    invoke-direct {v11, v0}, La/bb6;-><init>(La/us00;)V

    .line 235
    .line 236
    .line 237
    move-object v13, v10

    .line 238
    new-instance v10, La/bj5;

    .line 239
    .line 240
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 241
    .line 242
    .line 243
    move-object v14, v11

    .line 244
    new-instance v11, La/hnu;

    .line 245
    .line 246
    new-instance v15, La/neq;

    .line 247
    .line 248
    const/4 v2, 0x7

    .line 249
    invoke-direct {v15, v0, v2}, La/neq;-><init>(La/us00;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {v8, v9, v15}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    instance-of v15, v2, La/g0g0;

    .line 257
    .line 258
    if-eqz v15, :cond_7

    .line 259
    .line 260
    move-object v2, v3

    .line 261
    :cond_7
    check-cast v2, Landroid/app/ActivityManager;

    .line 262
    .line 263
    invoke-direct {v11, v2}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    new-instance v2, La/rl70;

    .line 267
    .line 268
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 269
    .line 270
    .line 271
    move-object v15, v13

    .line 272
    new-instance v13, La/rrc;

    .line 273
    .line 274
    sget-object v3, La/w7f;->i:La/w7f;

    .line 275
    .line 276
    invoke-static {v8, v9, v3}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    instance-of v12, v3, La/g0g0;

    .line 281
    .line 282
    if-eqz v12, :cond_8

    .line 283
    .line 284
    const/4 v3, 0x0

    .line 285
    :cond_8
    check-cast v3, Landroid/media/MediaCodecList;

    .line 286
    .line 287
    const/4 v12, 0x3

    .line 288
    invoke-direct {v13, v3, v12}, La/rrc;-><init>(Ljava/lang/Object;B)V

    .line 289
    .line 290
    .line 291
    move-object v3, v14

    .line 292
    new-instance v14, La/jtj;

    .line 293
    .line 294
    new-instance v12, La/neq;

    .line 295
    .line 296
    move-object/from16 v18, v2

    .line 297
    .line 298
    const/4 v2, 0x4

    .line 299
    invoke-direct {v12, v0, v2}, La/neq;-><init>(La/us00;B)V

    .line 300
    .line 301
    .line 302
    invoke-static {v8, v9, v12}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    instance-of v12, v2, La/g0g0;

    .line 307
    .line 308
    if-eqz v12, :cond_9

    .line 309
    .line 310
    const/4 v2, 0x0

    .line 311
    :cond_9
    check-cast v2, Landroid/app/admin/DevicePolicyManager;

    .line 312
    .line 313
    new-instance v12, La/neq;

    .line 314
    .line 315
    move-object/from16 v19, v3

    .line 316
    .line 317
    const/4 v3, 0x5

    .line 318
    invoke-direct {v12, v0, v3}, La/neq;-><init>(La/us00;B)V

    .line 319
    .line 320
    .line 321
    invoke-static {v8, v9, v12}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    instance-of v12, v3, La/g0g0;

    .line 326
    .line 327
    if-eqz v12, :cond_a

    .line 328
    .line 329
    const/4 v3, 0x0

    .line 330
    :cond_a
    check-cast v3, Landroid/app/KeyguardManager;

    .line 331
    .line 332
    const/4 v12, 0x3

    .line 333
    invoke-direct {v14, v2, v3, v12}, La/jtj;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 334
    .line 335
    .line 336
    move-object v2, v15

    .line 337
    new-instance v15, La/iw20;

    .line 338
    .line 339
    new-instance v3, La/neq;

    .line 340
    .line 341
    const/16 v12, 0xc

    .line 342
    .line 343
    invoke-direct {v3, v0, v12}, La/neq;-><init>(La/us00;B)V

    .line 344
    .line 345
    .line 346
    invoke-static {v8, v9, v3}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    instance-of v12, v3, La/g0g0;

    .line 351
    .line 352
    if-eqz v12, :cond_b

    .line 353
    .line 354
    const/4 v3, 0x0

    .line 355
    :cond_b
    check-cast v3, Landroid/content/pm/PackageManager;

    .line 356
    .line 357
    invoke-direct {v15, v3}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    new-instance v3, La/eyg0;

    .line 361
    .line 362
    new-instance v12, La/neq;

    .line 363
    .line 364
    move-object/from16 v20, v2

    .line 365
    .line 366
    const/16 v2, 0xe

    .line 367
    .line 368
    invoke-direct {v12, v0, v2}, La/neq;-><init>(La/us00;B)V

    .line 369
    .line 370
    .line 371
    invoke-static {v8, v9, v12}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    instance-of v12, v2, La/g0g0;

    .line 376
    .line 377
    if-eqz v12, :cond_c

    .line 378
    .line 379
    const/4 v2, 0x0

    .line 380
    :cond_c
    check-cast v2, Landroid/content/ContentResolver;

    .line 381
    .line 382
    const/16 v12, 0x14

    .line 383
    .line 384
    invoke-direct {v3, v2, v12}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 385
    .line 386
    .line 387
    new-instance v2, La/nr;

    .line 388
    .line 389
    new-instance v12, La/neq;

    .line 390
    .line 391
    move-object/from16 v21, v3

    .line 392
    .line 393
    const/4 v3, 0x1

    .line 394
    invoke-direct {v12, v0, v3}, La/neq;-><init>(La/us00;B)V

    .line 395
    .line 396
    .line 397
    invoke-static {v8, v9, v12}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    instance-of v12, v3, La/g0g0;

    .line 402
    .line 403
    if-eqz v12, :cond_d

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    :cond_d
    check-cast v3, Landroid/media/RingtoneManager;

    .line 407
    .line 408
    new-instance v12, La/neq;

    .line 409
    .line 410
    move-object/from16 v22, v4

    .line 411
    .line 412
    const/4 v4, 0x2

    .line 413
    invoke-direct {v12, v0, v4}, La/neq;-><init>(La/us00;B)V

    .line 414
    .line 415
    .line 416
    invoke-static {v8, v9, v12}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    instance-of v12, v4, La/g0g0;

    .line 421
    .line 422
    if-eqz v12, :cond_e

    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    :cond_e
    check-cast v4, Landroid/content/res/AssetManager;

    .line 426
    .line 427
    new-instance v12, La/neq;

    .line 428
    .line 429
    move-object/from16 v23, v5

    .line 430
    .line 431
    const/4 v5, 0x3

    .line 432
    invoke-direct {v12, v0, v5}, La/neq;-><init>(La/us00;B)V

    .line 433
    .line 434
    .line 435
    invoke-static {v8, v9, v12}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    instance-of v12, v5, La/g0g0;

    .line 440
    .line 441
    if-eqz v12, :cond_f

    .line 442
    .line 443
    const/4 v5, 0x0

    .line 444
    :cond_f
    check-cast v5, Landroid/content/res/Configuration;

    .line 445
    .line 446
    const/16 v12, 0x10

    .line 447
    .line 448
    invoke-direct {v2, v3, v4, v5, v12}, La/nr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 449
    .line 450
    .line 451
    new-instance v3, La/a7q;

    .line 452
    .line 453
    new-instance v4, La/vut0;

    .line 454
    .line 455
    const/16 v5, 0xb

    .line 456
    .line 457
    invoke-direct {v4, v0, v5}, La/vut0;-><init>(Ljava/lang/Object;B)V

    .line 458
    .line 459
    .line 460
    invoke-static {v8, v9, v4}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    instance-of v5, v4, La/g0g0;

    .line 465
    .line 466
    if-eqz v5, :cond_10

    .line 467
    .line 468
    const/4 v4, 0x0

    .line 469
    :cond_10
    check-cast v4, La/heq;

    .line 470
    .line 471
    invoke-direct {v3, v4}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    move-object/from16 v17, v2

    .line 475
    .line 476
    move-object/from16 v12, v18

    .line 477
    .line 478
    move-object/from16 v16, v21

    .line 479
    .line 480
    move-object/from16 v4, v22

    .line 481
    .line 482
    move-object/from16 v5, v23

    .line 483
    .line 484
    move-object/from16 v18, v3

    .line 485
    .line 486
    move-wide v2, v8

    .line 487
    move-object/from16 v9, v19

    .line 488
    .line 489
    move-object/from16 v8, v20

    .line 490
    .line 491
    invoke-direct/range {v4 .. v18}, La/zeq;-><init>(La/kud;La/zpu;La/eyg0;La/svu;La/bb6;La/bj5;La/hnu;La/rl70;La/rrc;La/jtj;La/iw20;La/eyg0;La/nr;La/a7q;)V

    .line 492
    .line 493
    .line 494
    new-instance v5, La/uii;

    .line 495
    .line 496
    new-instance v6, La/xsu;

    .line 497
    .line 498
    new-instance v7, La/neq;

    .line 499
    .line 500
    const/16 v8, 0x8

    .line 501
    .line 502
    invoke-direct {v7, v0, v8}, La/neq;-><init>(La/us00;B)V

    .line 503
    .line 504
    .line 505
    invoke-static {v2, v3, v7}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    instance-of v8, v7, La/g0g0;

    .line 510
    .line 511
    if-eqz v8, :cond_11

    .line 512
    .line 513
    const/4 v7, 0x0

    .line 514
    :cond_11
    check-cast v7, Landroid/content/ContentResolver;

    .line 515
    .line 516
    invoke-direct {v6, v7}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    new-instance v7, La/h03;

    .line 520
    .line 521
    new-instance v8, La/neq;

    .line 522
    .line 523
    const/4 v9, 0x0

    .line 524
    invoke-direct {v8, v0, v9}, La/neq;-><init>(La/us00;B)V

    .line 525
    .line 526
    .line 527
    invoke-static {v2, v3, v8}, La/c3x;->E(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    instance-of v2, v0, La/g0g0;

    .line 532
    .line 533
    if-eqz v2, :cond_12

    .line 534
    .line 535
    const/4 v3, 0x0

    .line 536
    goto :goto_1

    .line 537
    :cond_12
    move-object v3, v0

    .line 538
    :goto_1
    check-cast v3, Landroid/content/ContentResolver;

    .line 539
    .line 540
    const/16 v2, 0xa

    .line 541
    .line 542
    invoke-direct {v7, v3, v2}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 543
    .line 544
    .line 545
    new-instance v0, La/uuz;

    .line 546
    .line 547
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-direct {v5, v6, v7, v0}, La/uii;-><init>(La/xsu;La/h03;La/uuz;)V

    .line 551
    .line 552
    .line 553
    invoke-direct {v1, v4, v5}, La/peq;-><init>(La/zeq;La/uii;)V

    .line 554
    .line 555
    .line 556
    return-object v1

    .line 557
    :pswitch_8
    const-string v1, "keyguard"

    .line 558
    .line 559
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    check-cast v0, Landroid/app/KeyguardManager;

    .line 567
    .line 568
    return-object v0

    .line 569
    :pswitch_9
    const-string v1, "device_policy"

    .line 570
    .line 571
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    check-cast v0, Landroid/app/admin/DevicePolicyManager;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_a
    invoke-virtual {v0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    return-object v0

    .line 596
    :pswitch_b
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    return-object v0

    .line 604
    :pswitch_c
    new-instance v1, Landroid/media/RingtoneManager;

    .line 605
    .line 606
    invoke-direct {v1, v0}, Landroid/media/RingtoneManager;-><init>(Landroid/content/Context;)V

    .line 607
    .line 608
    .line 609
    return-object v1

    .line 610
    :pswitch_d
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    return-object v0

    .line 618
    nop

    .line 619
    :pswitch_data_0
    .packed-switch 0x0
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
