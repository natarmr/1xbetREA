.class public final synthetic La/xx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xx;->a:B

    iput-object p1, p0, La/xx;->b:La/pz40;

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
    iget-byte v1, v0, La/xx;->a:B

    .line 4
    .line 5
    const-string v2, "Required value was null."

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v0, v0, La/xx;->b:La/pz40;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget v1, La/q1j;->n2:I

    .line 16
    .line 17
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/e2j;

    .line 22
    .line 23
    iget-object v0, v0, La/e2j;->a:La/omm;

    .line 24
    .line 25
    iget-object v0, v0, La/omm;->a:La/a4x;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_0
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    xor-int/2addr v1, v5

    .line 47
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_1
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    xor-int/2addr v1, v5

    .line 68
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_2
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_0

    .line 99
    .line 100
    sget-object v7, La/j1t0;->a:La/qrq;

    .line 101
    .line 102
    sget-wide v4, La/qmk;->q:J

    .line 103
    .line 104
    sget-wide v13, La/qmk;->D:J

    .line 105
    .line 106
    new-instance v1, La/y9q0;

    .line 107
    .line 108
    const/4 v12, 0x0

    .line 109
    const v15, 0xfdffdd

    .line 110
    .line 111
    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    const/4 v6, 0x0

    .line 115
    const-wide/16 v8, 0x0

    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    const/4 v11, 0x0

    .line 119
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 124
    .line 125
    sget-wide v5, La/qmk;->q:J

    .line 126
    .line 127
    sget-wide v14, La/qmk;->D:J

    .line 128
    .line 129
    new-instance v2, La/y9q0;

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const v16, 0xfdff9d

    .line 133
    .line 134
    .line 135
    const-wide/16 v3, 0x0

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    const-wide/16 v9, 0x0

    .line 139
    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 143
    .line 144
    .line 145
    move-object v1, v2

    .line 146
    :goto_0
    return-object v1

    .line 147
    :pswitch_4
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_1

    .line 158
    .line 159
    sget-object v7, La/j1t0;->a:La/qrq;

    .line 160
    .line 161
    sget-wide v4, La/qmk;->q:J

    .line 162
    .line 163
    sget-wide v13, La/qmk;->D:J

    .line 164
    .line 165
    new-instance v1, La/y9q0;

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const v15, 0xfdffdd

    .line 169
    .line 170
    .line 171
    const-wide/16 v2, 0x0

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    const-wide/16 v8, 0x0

    .line 175
    .line 176
    const/4 v10, 0x0

    .line 177
    const/4 v11, 0x0

    .line 178
    invoke-direct/range {v1 .. v15}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_1
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 183
    .line 184
    sget-wide v5, La/qmk;->q:J

    .line 185
    .line 186
    sget-wide v14, La/qmk;->D:J

    .line 187
    .line 188
    new-instance v2, La/y9q0;

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const v16, 0xfdff9d

    .line 192
    .line 193
    .line 194
    const-wide/16 v3, 0x0

    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    const-wide/16 v9, 0x0

    .line 198
    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v12, 0x0

    .line 201
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 202
    .line 203
    .line 204
    move-object v1, v2

    .line 205
    :goto_1
    return-object v1

    .line 206
    :pswitch_5
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    xor-int/2addr v1, v5

    .line 217
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_6
    sget-object v1, La/lcc;->a:La/uts0;

    .line 228
    .line 229
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0

    .line 237
    :pswitch_7
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    sget-object v1, La/gex;->b:La/gex;

    .line 242
    .line 243
    if-ne v0, v1, :cond_2

    .line 244
    .line 245
    move v3, v5

    .line 246
    :cond_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    return-object v0

    .line 251
    :pswitch_8
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sget-object v1, La/gex;->a:La/gex;

    .line 256
    .line 257
    if-ne v0, v1, :cond_3

    .line 258
    .line 259
    move v3, v5

    .line 260
    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    return-object v0

    .line 265
    :pswitch_9
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 270
    .line 271
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_a
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 282
    .line 283
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0

    .line 289
    :pswitch_b
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 294
    .line 295
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_c
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 306
    .line 307
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_d
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    check-cast v0, La/rw7;

    .line 318
    .line 319
    iget-boolean v0, v0, La/rw7;->c:Z

    .line 320
    .line 321
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    return-object v0

    .line 326
    :pswitch_e
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, La/sw7;

    .line 331
    .line 332
    iget-boolean v0, v0, La/sw7;->c:Z

    .line 333
    .line 334
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    return-object v0

    .line 339
    :pswitch_f
    if-eqz v0, :cond_4

    .line 340
    .line 341
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    move-object v4, v0

    .line 346
    check-cast v4, Ljava/util/List;

    .line 347
    .line 348
    :cond_4
    return-object v4

    .line 349
    :pswitch_10
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    check-cast v0, La/j6z;

    .line 354
    .line 355
    if-eqz v0, :cond_5

    .line 356
    .line 357
    move-object v4, v0

    .line 358
    goto :goto_2

    .line 359
    :cond_5
    invoke-static {v2}, La/adx;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 360
    .line 361
    .line 362
    invoke-static {}, La/csj;->b()V

    .line 363
    .line 364
    .line 365
    :goto_2
    return-object v4

    .line 366
    :pswitch_11
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, La/j6z;

    .line 371
    .line 372
    if-eqz v0, :cond_6

    .line 373
    .line 374
    move-object v4, v0

    .line 375
    goto :goto_3

    .line 376
    :cond_6
    invoke-static {v2}, La/adx;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 377
    .line 378
    .line 379
    invoke-static {}, La/csj;->b()V

    .line 380
    .line 381
    .line 382
    :goto_3
    return-object v4

    .line 383
    :pswitch_12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 384
    .line 385
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 392
    .line 393
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_14
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, La/ty;

    .line 404
    .line 405
    iget v0, v0, La/ty;->c:I

    .line 406
    .line 407
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    return-object v0

    .line 412
    :pswitch_15
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, La/vy;

    .line 417
    .line 418
    iget-object v0, v0, La/vy;->c:Ljava/lang/Integer;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_16
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    check-cast v0, La/uy;

    .line 426
    .line 427
    iget-object v0, v0, La/uy;->c:Ljava/lang/Integer;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_17
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    check-cast v0, La/ty;

    .line 435
    .line 436
    iget v0, v0, La/ty;->b:I

    .line 437
    .line 438
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    return-object v0

    .line 443
    :pswitch_18
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    check-cast v0, La/vy;

    .line 448
    .line 449
    iget-object v0, v0, La/vy;->b:Ljava/lang/Integer;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_19
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    check-cast v0, La/uy;

    .line 457
    .line 458
    iget-object v0, v0, La/uy;->b:Ljava/lang/Integer;

    .line 459
    .line 460
    return-object v0

    .line 461
    :pswitch_1a
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    check-cast v0, La/vy;

    .line 466
    .line 467
    iget-object v0, v0, La/vy;->a:Ljava/lang/Integer;

    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_1b
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    check-cast v0, La/uy;

    .line 475
    .line 476
    iget-object v0, v0, La/uy;->a:Ljava/lang/Integer;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_1c
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    check-cast v0, La/ty;

    .line 484
    .line 485
    iget v0, v0, La/ty;->a:I

    .line 486
    .line 487
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    return-object v0

    .line 492
    nop

    .line 493
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
