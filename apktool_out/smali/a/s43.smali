.class public final La/s43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s43;->a:B

    iput-object p1, p0, La/s43;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/s43;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f000000    # 0.5f

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object p0, p0, La/s43;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/abi0;

    .line 16
    .line 17
    check-cast p0, La/ot40;

    .line 18
    .line 19
    invoke-static {p1, p0}, La/swq0;->a(La/abi0;La/bk30;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, La/ne60;

    .line 26
    .line 27
    iget-wide v0, p1, La/ne60;->a:J

    .line 28
    .line 29
    check-cast p0, La/j6u0;

    .line 30
    .line 31
    iget-object p0, p0, La/j6u0;->a:La/r34;

    .line 32
    .line 33
    iget-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/i6u0;

    .line 36
    .line 37
    iget-object v0, p1, La/i6u0;->d:[La/zaj;

    .line 38
    .line 39
    invoke-static {v3, v0}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput v5, p1, La/i6u0;->e:I

    .line 43
    .line 44
    iget-object p1, p0, La/r34;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, La/i6u0;

    .line 47
    .line 48
    iget-object v0, p1, La/i6u0;->d:[La/zaj;

    .line 49
    .line 50
    invoke-static {v3, v0}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput v5, p1, La/i6u0;->e:I

    .line 54
    .line 55
    const-wide/16 v0, 0x0

    .line 56
    .line 57
    iput-wide v0, p0, La/r34;->a:J

    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p1, La/dpa0;

    .line 63
    .line 64
    check-cast p0, La/hs40;

    .line 65
    .line 66
    invoke-static {p1, v5}, La/x2x;->j0(La/dpa0;Z)J

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    iget-object v0, p0, La/hs40;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, La/j6u0;

    .line 73
    .line 74
    invoke-static {v0, p1}, La/dqm0;->k(La/j6u0;La/dpa0;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, La/hs40;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, La/htb;

    .line 80
    .line 81
    new-instance v6, La/js40;

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    const-wide/16 v10, 0x0

    .line 85
    .line 86
    invoke-direct/range {v6 .. v11}, La/js40;-><init>(ZJJ)V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0, v6}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance p1, La/yj30;

    .line 104
    .line 105
    check-cast p0, Landroid/content/Context;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {p0}, La/mmv;->b(Landroid/content/Context;)Landroid/adservices/measurement/MeasurementManager;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-direct {p1, p0}, La/ak30;-><init>(Landroid/adservices/measurement/MeasurementManager;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :pswitch_3
    check-cast p1, La/k810;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    check-cast p0, La/v9d;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, La/v9d;->b(La/k810;)La/v9d;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v1, p1, La/k810;->d:Ljava/lang/CharSequence;

    .line 133
    .line 134
    invoke-static {v0, v1}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    invoke-static {v0, p0}, La/idx;->X(La/v9d;La/v9d;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_1

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-ge v2, p0, :cond_2

    .line 149
    .line 150
    add-int/2addr v2, v4

    .line 151
    invoke-virtual {p1, v2}, La/k810;->e(I)La/k810;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-eqz p0, :cond_0

    .line 156
    .line 157
    invoke-virtual {p0}, La/k810;->a()Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    :cond_0
    if-nez v3, :cond_1

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_1
    move v4, v5

    .line 165
    :cond_2
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 171
    .line 172
    check-cast p0, La/ig00;

    .line 173
    .line 174
    invoke-interface {p0, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 175
    .line 176
    .line 177
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_5
    check-cast p1, La/wvq0;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget p1, p1, La/wvq0;->a:I

    .line 186
    .line 187
    check-cast p0, La/wvq0;

    .line 188
    .line 189
    iget p0, p0, La/wvq0;->a:I

    .line 190
    .line 191
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    check-cast p0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    int-to-char v0, p1

    .line 209
    const/16 v1, 0x20

    .line 210
    .line 211
    if-ne p1, v1, :cond_3

    .line 212
    .line 213
    const-string p1, "%20"

    .line 214
    .line 215
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_3
    if-lt p1, v1, :cond_5

    .line 220
    .line 221
    const/16 v1, 0x80

    .line 222
    .line 223
    if-ge p1, v1, :cond_5

    .line 224
    .line 225
    const-string v1, "\".<>\\^_`{|}"

    .line 226
    .line 227
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_4

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_4
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_5
    :goto_1
    const/high16 v1, 0x10000

    .line 239
    .line 240
    if-lt p1, v1, :cond_6

    .line 241
    .line 242
    ushr-int/lit8 v0, p1, 0xa

    .line 243
    .line 244
    const v1, 0xd7c0

    .line 245
    .line 246
    .line 247
    add-int/2addr v0, v1

    .line 248
    int-to-char v0, v0

    .line 249
    and-int/lit16 p1, p1, 0x3ff

    .line 250
    .line 251
    const v1, 0xdc00

    .line 252
    .line 253
    .line 254
    add-int/2addr p1, v1

    .line 255
    int-to-char p1, p1

    .line 256
    const/4 v1, 0x2

    .line 257
    new-array v1, v1, [C

    .line 258
    .line 259
    aput-char v0, v1, v5

    .line 260
    .line 261
    aput-char p1, v1, v4

    .line 262
    .line 263
    new-instance p1, Ljava/lang/String;

    .line 264
    .line 265
    invoke-direct {p1, v1}, Ljava/lang/String;-><init>([C)V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    const-string v0, "UTF-8"

    .line 277
    .line 278
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_7
    check-cast p1, La/fhl;

    .line 292
    .line 293
    check-cast p0, La/dfv;

    .line 294
    .line 295
    iget-object v0, p0, La/dfv;->l:La/w03;

    .line 296
    .line 297
    iget-boolean v1, p0, La/dfv;->n:Z

    .line 298
    .line 299
    if-eqz v1, :cond_7

    .line 300
    .line 301
    iget-boolean v1, p0, La/dfv;->A:Z

    .line 302
    .line 303
    if-eqz v1, :cond_7

    .line 304
    .line 305
    if-eqz v0, :cond_7

    .line 306
    .line 307
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v1}, La/nr;->p()J

    .line 312
    .line 313
    .line 314
    move-result-wide v2

    .line 315
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-interface {v4}, La/x5a;->l()V

    .line 320
    .line 321
    .line 322
    :try_start_0
    iget-object v4, v1, La/nr;->b:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v4, La/fvt0;

    .line 325
    .line 326
    invoke-virtual {v4, v0}, La/fvt0;->i(La/w03;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0, p1}, La/dfv;->d(La/fhl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 330
    .line 331
    .line 332
    invoke-static {v1, v2, v3}, Lc;->g(La/nr;J)V

    .line 333
    .line 334
    .line 335
    goto :goto_4

    .line 336
    :catchall_0
    move-exception v0

    .line 337
    move-object p0, v0

    .line 338
    invoke-static {v1, v2, v3}, Lc;->g(La/nr;J)V

    .line 339
    .line 340
    .line 341
    throw p0

    .line 342
    :cond_7
    invoke-virtual {p0, p1}, La/dfv;->d(La/fhl;)V

    .line 343
    .line 344
    .line 345
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object p0

    .line 348
    :pswitch_8
    check-cast p1, La/uag0;

    .line 349
    .line 350
    check-cast p0, La/l7m0;

    .line 351
    .line 352
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    check-cast p0, Ljava/lang/Number;

    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 363
    .line 364
    .line 365
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_9
    check-cast p0, La/oms0;

    .line 369
    .line 370
    iget-object p0, p0, La/oms0;->d:La/pz40;

    .line 371
    .line 372
    check-cast p0, La/hgk0;

    .line 373
    .line 374
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    xor-int/2addr p0, v4

    .line 383
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    return-object p0

    .line 388
    :pswitch_a
    check-cast p1, La/uag0;

    .line 389
    .line 390
    check-cast p0, La/vdv0;

    .line 391
    .line 392
    iget v0, p0, La/vdv0;->f:F

    .line 393
    .line 394
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    if-eqz v0, :cond_8

    .line 399
    .line 400
    iget v0, p0, La/vdv0;->g:F

    .line 401
    .line 402
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-nez v0, :cond_b

    .line 407
    .line 408
    :cond_8
    iget v0, p0, La/vdv0;->f:F

    .line 409
    .line 410
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_9

    .line 415
    .line 416
    move v0, v1

    .line 417
    goto :goto_5

    .line 418
    :cond_9
    iget v0, p0, La/vdv0;->f:F

    .line 419
    .line 420
    :goto_5
    iget v3, p0, La/vdv0;->g:F

    .line 421
    .line 422
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_a

    .line 427
    .line 428
    goto :goto_6

    .line 429
    :cond_a
    iget v1, p0, La/vdv0;->g:F

    .line 430
    .line 431
    :goto_6
    invoke-static {v0, v1}, La/osm0;->e(FF)J

    .line 432
    .line 433
    .line 434
    move-result-wide v0

    .line 435
    invoke-virtual {p1, v0, v1}, La/uag0;->G(J)V

    .line 436
    .line 437
    .line 438
    :cond_b
    iget v0, p0, La/vdv0;->h:F

    .line 439
    .line 440
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_c

    .line 445
    .line 446
    iget v0, p0, La/vdv0;->h:F

    .line 447
    .line 448
    invoke-virtual {p1, v0}, La/uag0;->m(F)V

    .line 449
    .line 450
    .line 451
    :cond_c
    iget v0, p0, La/vdv0;->i:F

    .line 452
    .line 453
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-nez v0, :cond_d

    .line 458
    .line 459
    iget v0, p0, La/vdv0;->i:F

    .line 460
    .line 461
    invoke-virtual {p1, v0}, La/uag0;->n(F)V

    .line 462
    .line 463
    .line 464
    :cond_d
    iget v0, p0, La/vdv0;->j:F

    .line 465
    .line 466
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-nez v0, :cond_e

    .line 471
    .line 472
    iget v0, p0, La/vdv0;->j:F

    .line 473
    .line 474
    invoke-virtual {p1, v0}, La/uag0;->v(F)V

    .line 475
    .line 476
    .line 477
    :cond_e
    iget v0, p0, La/vdv0;->k:F

    .line 478
    .line 479
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-nez v0, :cond_f

    .line 484
    .line 485
    iget v0, p0, La/vdv0;->k:F

    .line 486
    .line 487
    invoke-virtual {p1, v0}, La/uag0;->H(F)V

    .line 488
    .line 489
    .line 490
    :cond_f
    iget v0, p0, La/vdv0;->l:F

    .line 491
    .line 492
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-nez v0, :cond_10

    .line 497
    .line 498
    iget v0, p0, La/vdv0;->l:F

    .line 499
    .line 500
    invoke-virtual {p1, v0}, La/uag0;->I(F)V

    .line 501
    .line 502
    .line 503
    :cond_10
    iget v0, p0, La/vdv0;->m:F

    .line 504
    .line 505
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-nez v0, :cond_11

    .line 510
    .line 511
    iget v0, p0, La/vdv0;->m:F

    .line 512
    .line 513
    invoke-virtual {p1, v0}, La/uag0;->C(F)V

    .line 514
    .line 515
    .line 516
    :cond_11
    iget v0, p0, La/vdv0;->n:F

    .line 517
    .line 518
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-eqz v0, :cond_12

    .line 523
    .line 524
    iget v0, p0, La/vdv0;->o:F

    .line 525
    .line 526
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-nez v0, :cond_15

    .line 531
    .line 532
    :cond_12
    iget v0, p0, La/vdv0;->n:F

    .line 533
    .line 534
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_13

    .line 539
    .line 540
    move v0, v2

    .line 541
    goto :goto_7

    .line 542
    :cond_13
    iget v0, p0, La/vdv0;->n:F

    .line 543
    .line 544
    :goto_7
    invoke-virtual {p1, v0}, La/uag0;->w(F)V

    .line 545
    .line 546
    .line 547
    iget v0, p0, La/vdv0;->o:F

    .line 548
    .line 549
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_14

    .line 554
    .line 555
    goto :goto_8

    .line 556
    :cond_14
    iget v2, p0, La/vdv0;->o:F

    .line 557
    .line 558
    :goto_8
    invoke-virtual {p1, v2}, La/uag0;->y(F)V

    .line 559
    .line 560
    .line 561
    :cond_15
    iget v0, p0, La/vdv0;->p:F

    .line 562
    .line 563
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-nez v0, :cond_16

    .line 568
    .line 569
    iget p0, p0, La/vdv0;->p:F

    .line 570
    .line 571
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 572
    .line 573
    .line 574
    :cond_16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object p0

    .line 577
    :pswitch_b
    check-cast p1, La/s73;

    .line 578
    .line 579
    iget v0, p1, La/s73;->b:F

    .line 580
    .line 581
    const/4 v3, 0x0

    .line 582
    cmpg-float v4, v0, v3

    .line 583
    .line 584
    if-gez v4, :cond_17

    .line 585
    .line 586
    move v0, v3

    .line 587
    :cond_17
    cmpl-float v4, v0, v2

    .line 588
    .line 589
    if-lez v4, :cond_18

    .line 590
    .line 591
    move v0, v2

    .line 592
    :cond_18
    iget v4, p1, La/s73;->c:F

    .line 593
    .line 594
    const/high16 v5, -0x41000000    # -0.5f

    .line 595
    .line 596
    cmpg-float v6, v4, v5

    .line 597
    .line 598
    if-gez v6, :cond_19

    .line 599
    .line 600
    move v4, v5

    .line 601
    :cond_19
    cmpl-float v6, v4, v1

    .line 602
    .line 603
    if-lez v6, :cond_1a

    .line 604
    .line 605
    move v4, v1

    .line 606
    :cond_1a
    iget v6, p1, La/s73;->d:F

    .line 607
    .line 608
    cmpg-float v7, v6, v5

    .line 609
    .line 610
    if-gez v7, :cond_1b

    .line 611
    .line 612
    goto :goto_9

    .line 613
    :cond_1b
    move v5, v6

    .line 614
    :goto_9
    cmpl-float v6, v5, v1

    .line 615
    .line 616
    if-lez v6, :cond_1c

    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_1c
    move v1, v5

    .line 620
    :goto_a
    iget p1, p1, La/s73;->a:F

    .line 621
    .line 622
    cmpg-float v5, p1, v3

    .line 623
    .line 624
    if-gez v5, :cond_1d

    .line 625
    .line 626
    goto :goto_b

    .line 627
    :cond_1d
    move v3, p1

    .line 628
    :goto_b
    cmpl-float p1, v3, v2

    .line 629
    .line 630
    if-lez p1, :cond_1e

    .line 631
    .line 632
    goto :goto_c

    .line 633
    :cond_1e
    move v2, v3

    .line 634
    :goto_c
    sget-object p1, La/a5d;->x:La/rf60;

    .line 635
    .line 636
    invoke-static {v0, v4, v1, v2, p1}, La/fbc;->c(FFFFLa/y4d;)J

    .line 637
    .line 638
    .line 639
    move-result-wide v0

    .line 640
    check-cast p0, La/y4d;

    .line 641
    .line 642
    invoke-static {v0, v1, p0}, La/y3d;->b(JLa/y4d;)J

    .line 643
    .line 644
    .line 645
    move-result-wide p0

    .line 646
    new-instance v0, La/y3d;

    .line 647
    .line 648
    invoke-direct {v0, p0, p1}, La/y3d;-><init>(J)V

    .line 649
    .line 650
    .line 651
    return-object v0

    .line 652
    :pswitch_c
    check-cast p1, La/j;

    .line 653
    .line 654
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    check-cast p0, Ljava/lang/String;

    .line 658
    .line 659
    iget-object v0, p1, La/j;->a:La/ar20;

    .line 660
    .line 661
    sget-object v1, La/cy2;->z:La/ar20;

    .line 662
    .line 663
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    if-eqz v0, :cond_1f

    .line 668
    .line 669
    const-string p0, ""

    .line 670
    .line 671
    goto :goto_d

    .line 672
    :cond_1f
    sget-object v0, La/tzn;->a:Ljava/util/Map;

    .line 673
    .line 674
    invoke-static {p1, p0}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 675
    .line 676
    .line 677
    move-result-object p0

    .line 678
    invoke-static {p0, v5, v5}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    :goto_d
    return-object p0

    .line 683
    :pswitch_d
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result p0

    .line 687
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 688
    .line 689
    .line 690
    move-result-object p0

    .line 691
    return-object p0

    .line 692
    nop

    .line 693
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
