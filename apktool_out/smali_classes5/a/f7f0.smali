.class public final synthetic La/f7f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f7f0;->a:B

    iput-object p1, p0, La/f7f0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f7f0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/f7f0;->b:La/l7m0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/mdn0;

    .line 17
    .line 18
    invoke-interface {v0}, La/mdn0;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_0
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ubn0;

    .line 42
    .line 43
    iget-boolean v0, v0, La/ubn0;->b:Z

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_2
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/ubn0;

    .line 55
    .line 56
    iget-object v0, v0, La/ubn0;->d:La/yan0;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_4
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/high16 v1, 0x3f000000    # 0.5f

    .line 80
    .line 81
    cmpg-float v0, v0, v1

    .line 82
    .line 83
    if-gez v0, :cond_0

    .line 84
    .line 85
    move v2, v3

    .line 86
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :pswitch_5
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    sget-object v7, La/j1t0;->a:La/qrq;

    .line 104
    .line 105
    sget-wide v4, La/qmk;->q:J

    .line 106
    .line 107
    sget-wide v13, La/qmk;->D:J

    .line 108
    .line 109
    new-instance v1, La/y9q0;

    .line 110
    .line 111
    const/4 v12, 0x0

    .line 112
    const v15, 0xfdffdd

    .line 113
    .line 114
    .line 115
    const-wide/16 v2, 0x0

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    const-wide/16 v8, 0x0

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 127
    .line 128
    sget-wide v5, La/qmk;->q:J

    .line 129
    .line 130
    sget-wide v14, La/qmk;->D:J

    .line 131
    .line 132
    new-instance v2, La/y9q0;

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v16, 0xfdff9d

    .line 136
    .line 137
    .line 138
    const-wide/16 v3, 0x0

    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    const-wide/16 v9, 0x0

    .line 142
    .line 143
    const/4 v11, 0x0

    .line 144
    const/4 v12, 0x0

    .line 145
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 146
    .line 147
    .line 148
    move-object v1, v2

    .line 149
    :goto_0
    return-object v1

    .line 150
    :pswitch_6
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/lang/Boolean;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_2

    .line 161
    .line 162
    sget-object v7, La/j1t0;->a:La/qrq;

    .line 163
    .line 164
    sget-wide v4, La/qmk;->q:J

    .line 165
    .line 166
    sget-wide v13, La/qmk;->D:J

    .line 167
    .line 168
    new-instance v1, La/y9q0;

    .line 169
    .line 170
    const/4 v12, 0x0

    .line 171
    const v15, 0xfdffdd

    .line 172
    .line 173
    .line 174
    const-wide/16 v2, 0x0

    .line 175
    .line 176
    const/4 v6, 0x0

    .line 177
    const-wide/16 v8, 0x0

    .line 178
    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v11, 0x0

    .line 181
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_2
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 186
    .line 187
    sget-wide v5, La/qmk;->q:J

    .line 188
    .line 189
    sget-wide v14, La/qmk;->D:J

    .line 190
    .line 191
    new-instance v2, La/y9q0;

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v16, 0xfdff9d

    .line 195
    .line 196
    .line 197
    const-wide/16 v3, 0x0

    .line 198
    .line 199
    const/4 v7, 0x0

    .line 200
    const-wide/16 v9, 0x0

    .line 201
    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 205
    .line 206
    .line 207
    move-object v1, v2

    .line 208
    :goto_1
    return-object v1

    .line 209
    :pswitch_7
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_8
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    check-cast v0, Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_9
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 230
    .line 231
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, La/kwk0;

    .line 236
    .line 237
    iget v0, v0, La/kwk0;->a:I

    .line 238
    .line 239
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :pswitch_a
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 245
    .line 246
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/kpk0;

    .line 251
    .line 252
    iget-object v0, v0, La/kpk0;->d:La/mwk0;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_b
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 256
    .line 257
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, La/kpk0;

    .line 262
    .line 263
    iget-object v0, v0, La/kpk0;->c:La/owk0;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_c
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 267
    .line 268
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, La/kpk0;

    .line 273
    .line 274
    iget-object v0, v0, La/kpk0;->b:La/z1d;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_d
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 278
    .line 279
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, La/kpk0;

    .line 284
    .line 285
    iget-object v0, v0, La/kpk0;->a:La/wnk0;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_e
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 289
    .line 290
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, La/mwk0;

    .line 295
    .line 296
    iget v0, v0, La/mwk0;->a:I

    .line 297
    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :pswitch_f
    sget-object v1, La/fpk0;->V1:La/zie0;

    .line 304
    .line 305
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, La/kpk0;

    .line 310
    .line 311
    iget-object v0, v0, La/kpk0;->e:La/kwk0;

    .line 312
    .line 313
    return-object v0

    .line 314
    :pswitch_10
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, La/v6n;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_11
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, La/wlj0;

    .line 326
    .line 327
    iget v0, v0, La/wlj0;->a:I

    .line 328
    .line 329
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    return-object v0

    .line 334
    :pswitch_12
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, La/ucj0;

    .line 339
    .line 340
    iget-object v0, v0, La/ucj0;->d:La/a4x;

    .line 341
    .line 342
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    return-object v0

    .line 351
    :pswitch_13
    sget-object v1, La/i5i0;->a:La/q73;

    .line 352
    .line 353
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, La/ne60;

    .line 358
    .line 359
    iget-wide v1, v0, La/ne60;->a:J

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_14
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    check-cast v0, La/ne60;

    .line 367
    .line 368
    iget-wide v1, v0, La/ne60;->a:J

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_15
    sget-object v1, La/xph0;->Q1:La/lme0;

    .line 372
    .line 373
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, La/zph0;

    .line 378
    .line 379
    iget v0, v0, La/zph0;->d:I

    .line 380
    .line 381
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    return-object v0

    .line 386
    :pswitch_16
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, La/g9g0;

    .line 391
    .line 392
    iget-object v0, v0, La/g9g0;->b:La/jje;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_17
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    check-cast v0, La/g9g0;

    .line 400
    .line 401
    iget-object v0, v0, La/g9g0;->a:La/ad50;

    .line 402
    .line 403
    return-object v0

    .line 404
    :pswitch_18
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    check-cast v0, La/nbf0;

    .line 409
    .line 410
    iget-object v0, v0, La/nbf0;->c:La/l7m0;

    .line 411
    .line 412
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, La/u9f0;

    .line 417
    .line 418
    iget-boolean v0, v0, La/u9f0;->b:Z

    .line 419
    .line 420
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    return-object v0

    .line 425
    :pswitch_19
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, Ljava/lang/Number;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    const/high16 v1, 0x3f800000    # 1.0f

    .line 436
    .line 437
    cmpg-float v0, v0, v1

    .line 438
    .line 439
    if-nez v0, :cond_3

    .line 440
    .line 441
    move v2, v3

    .line 442
    :cond_3
    xor-int/lit8 v0, v2, 0x1

    .line 443
    .line 444
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    return-object v0

    .line 449
    :pswitch_1a
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    check-cast v0, Ljava/lang/Boolean;

    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    return-object v0

    .line 459
    :pswitch_1b
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    check-cast v0, La/p7f0;

    .line 464
    .line 465
    iget-boolean v0, v0, La/p7f0;->d:Z

    .line 466
    .line 467
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    return-object v0

    .line 472
    :pswitch_1c
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    check-cast v0, La/p7f0;

    .line 477
    .line 478
    iget-boolean v0, v0, La/p7f0;->c:Z

    .line 479
    .line 480
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    return-object v0

    .line 485
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
