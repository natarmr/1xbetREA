.class public final synthetic La/goi0;
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
    iput-byte p2, p0, La/goi0;->a:B

    iput-object p1, p0, La/goi0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/goi0;->a:B

    .line 4
    .line 5
    const/16 v3, 0x8

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/goi0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/afm0;

    .line 14
    .line 15
    iget-object v0, v0, La/afm0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/gii0;

    .line 18
    .line 19
    const-class v1, La/zem0;

    .line 20
    .line 21
    sget-object v2, La/sre0;->a:La/tre0;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/zem0;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    check-cast v0, La/ubm0;

    .line 35
    .line 36
    sget-object v1, La/ubm0;->R1:La/y2m0;

    .line 37
    .line 38
    iget-object v0, v0, La/ubm0;->M1:La/fiu0;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    const-string v0, "viewModelFactory"

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v4

    .line 49
    :pswitch_1
    check-cast v0, La/wa00;

    .line 50
    .line 51
    iget v0, v0, La/wa00;->e:I

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :pswitch_2
    check-cast v0, La/va00;

    .line 59
    .line 60
    iget v0, v0, La/va00;->e:I

    .line 61
    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :pswitch_3
    check-cast v0, La/n7e0;

    .line 68
    .line 69
    iget-object v0, v0, La/n7e0;->b:La/gii0;

    .line 70
    .line 71
    const-class v1, La/f2m0;

    .line 72
    .line 73
    sget-object v2, La/sre0;->a:La/tre0;

    .line 74
    .line 75
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, La/f2m0;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_4
    check-cast v0, La/nw20;

    .line 87
    .line 88
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/gii0;

    .line 91
    .line 92
    const-class v1, La/xzl0;

    .line 93
    .line 94
    sget-object v2, La/sre0;->a:La/tre0;

    .line 95
    .line 96
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/xzl0;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_5
    check-cast v0, La/xfu;

    .line 108
    .line 109
    new-instance v1, La/g0m0;

    .line 110
    .line 111
    iget-object v0, v0, La/xfu;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, La/lef0;

    .line 114
    .line 115
    iget-object v0, v0, La/lef0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/a0m0;

    .line 118
    .line 119
    iget-object v0, v0, La/a0m0;->a:Ljava/util/List;

    .line 120
    .line 121
    invoke-direct {v1, v0}, La/g0m0;-><init>(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :pswitch_6
    check-cast v0, La/ryl0;

    .line 126
    .line 127
    sget-object v1, La/ryl0;->U1:La/zie0;

    .line 128
    .line 129
    iget-object v0, v0, La/ryl0;->K1:La/fiu0;

    .line 130
    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_1
    const-string v0, "viewModelFactory"

    .line 135
    .line 136
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v4

    .line 140
    :pswitch_7
    check-cast v0, La/kd30;

    .line 141
    .line 142
    iget-object v0, v0, La/kd30;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, La/gii0;

    .line 145
    .line 146
    const-class v1, La/jvl0;

    .line 147
    .line 148
    sget-object v2, La/sre0;->a:La/tre0;

    .line 149
    .line 150
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/jvl0;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_8
    check-cast v0, La/fck0;

    .line 162
    .line 163
    iget-object v0, v0, La/fck0;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, La/gii0;

    .line 166
    .line 167
    const-class v1, La/ivl0;

    .line 168
    .line 169
    sget-object v2, La/sre0;->a:La/tre0;

    .line 170
    .line 171
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, La/ivl0;

    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_9
    check-cast v0, La/ovl0;

    .line 183
    .line 184
    sget-object v1, La/ovl0;->R1:La/gne0;

    .line 185
    .line 186
    iget-object v0, v0, La/ovl0;->O1:La/fiu0;

    .line 187
    .line 188
    if-eqz v0, :cond_2

    .line 189
    .line 190
    return-object v0

    .line 191
    :cond_2
    const-string v0, "viewModelFactory"

    .line 192
    .line 193
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v4

    .line 197
    :pswitch_a
    check-cast v0, La/mtl0;

    .line 198
    .line 199
    sget-object v1, La/mtl0;->O1:La/eke0;

    .line 200
    .line 201
    new-instance v1, La/ktl0;

    .line 202
    .line 203
    new-instance v2, La/j1l0;

    .line 204
    .line 205
    const/16 v3, 0x9

    .line 206
    .line 207
    invoke-direct {v2, v0, v3}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 211
    .line 212
    .line 213
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 214
    .line 215
    invoke-static {v2}, La/k9x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v2}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v2}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v2}, La/wvb;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 241
    .line 242
    .line 243
    new-instance v3, La/efr0;

    .line 244
    .line 245
    const/16 v4, 0x1c

    .line 246
    .line 247
    invoke-direct {v3, v4}, La/efr0;-><init>(B)V

    .line 248
    .line 249
    .line 250
    new-instance v4, La/xar0;

    .line 251
    .line 252
    const/16 v5, 0x16

    .line 253
    .line 254
    invoke-direct {v4, v2, v5}, La/xar0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 255
    .line 256
    .line 257
    new-instance v5, La/d8q0;

    .line 258
    .line 259
    const/16 v6, 0x11

    .line 260
    .line 261
    const/4 v7, 0x3

    .line 262
    invoke-direct {v5, v7, v6}, La/d8q0;-><init>(IB)V

    .line 263
    .line 264
    .line 265
    sget-object v6, La/pfo0;->z:La/pfo0;

    .line 266
    .line 267
    new-instance v7, La/gbn;

    .line 268
    .line 269
    invoke-direct {v7, v3, v5, v4, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v2}, La/q7x;->A(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v0, v2}, La/dp;->b(La/gbn;)V

    .line 280
    .line 281
    .line 282
    return-object v1

    .line 283
    :pswitch_b
    check-cast v0, La/ysl0;

    .line 284
    .line 285
    sget-object v1, La/ysl0;->O1:La/zie0;

    .line 286
    .line 287
    new-instance v1, La/wsl0;

    .line 288
    .line 289
    new-instance v2, La/j1l0;

    .line 290
    .line 291
    invoke-direct {v2, v0, v3}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 292
    .line 293
    .line 294
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 295
    .line 296
    .line 297
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 298
    .line 299
    invoke-static {v2}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v2}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v2}, La/q7x;->A(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 318
    .line 319
    .line 320
    invoke-static {v2}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v0, v2}, La/dp;->b(La/gbn;)V

    .line 325
    .line 326
    .line 327
    return-object v1

    .line 328
    :pswitch_c
    check-cast v0, La/tql0;

    .line 329
    .line 330
    new-instance v1, La/r0x;

    .line 331
    .line 332
    iget-object v0, v0, La/tql0;->b:Landroid/widget/ImageView;

    .line 333
    .line 334
    invoke-direct {v1, v0}, La/r0x;-><init>(Landroid/widget/ImageView;)V

    .line 335
    .line 336
    .line 337
    return-object v1

    .line 338
    :pswitch_d
    check-cast v0, La/lbu;

    .line 339
    .line 340
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :pswitch_e
    check-cast v0, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;

    .line 350
    .line 351
    invoke-static {v0}, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->a(Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;)Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    return-object v0

    .line 356
    :pswitch_f
    move-object v1, v0

    .line 357
    check-cast v1, La/m1l0;

    .line 358
    .line 359
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 360
    .line 361
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 362
    .line 363
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 371
    .line 372
    move-object v4, v0

    .line 373
    check-cast v4, La/c1l0;

    .line 374
    .line 375
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    const/4 v11, 0x0

    .line 379
    const/16 v12, 0x1fb

    .line 380
    .line 381
    const/4 v5, 0x0

    .line 382
    const/4 v6, 0x0

    .line 383
    const/4 v7, 0x0

    .line 384
    const/4 v8, 0x0

    .line 385
    const/4 v9, 0x0

    .line 386
    const/4 v10, 0x0

    .line 387
    invoke-static/range {v4 .. v12}, La/c1l0;->a(La/c1l0;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;ZZZI)La/c1l0;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_3

    .line 396
    .line 397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object v0

    .line 400
    :pswitch_10
    check-cast v0, La/zyk0;

    .line 401
    .line 402
    iget-object v0, v0, La/zyk0;->a:La/gii0;

    .line 403
    .line 404
    const-class v1, La/wxk0;

    .line 405
    .line 406
    sget-object v2, La/sre0;->a:La/tre0;

    .line 407
    .line 408
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, La/wxk0;

    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_11
    check-cast v0, La/nw20;

    .line 420
    .line 421
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, La/gii0;

    .line 424
    .line 425
    const-class v1, La/nhk0;

    .line 426
    .line 427
    sget-object v2, La/sre0;->a:La/tre0;

    .line 428
    .line 429
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, La/nhk0;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_12
    move-object v1, v0

    .line 441
    check-cast v1, La/pgk0;

    .line 442
    .line 443
    :goto_0
    iget-object v4, v1, La/pgk0;->g:Ljava/lang/Object;

    .line 444
    .line 445
    monitor-enter v4

    .line 446
    :try_start_0
    iget-boolean v0, v1, La/pgk0;->c:Z

    .line 447
    .line 448
    if-nez v0, :cond_a

    .line 449
    .line 450
    const/4 v0, 0x1

    .line 451
    iput-boolean v0, v1, La/pgk0;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 452
    .line 453
    :try_start_1
    iget-object v0, v1, La/pgk0;->f:La/xz40;

    .line 454
    .line 455
    iget-object v5, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 456
    .line 457
    iget v0, v0, La/xz40;->c:I

    .line 458
    .line 459
    const/4 v6, 0x0

    .line 460
    :goto_1
    if-ge v6, v0, :cond_9

    .line 461
    .line 462
    aget-object v7, v5, v6

    .line 463
    .line 464
    check-cast v7, La/ogk0;

    .line 465
    .line 466
    iget-object v8, v7, La/ogk0;->g:La/iz40;

    .line 467
    .line 468
    iget-object v7, v7, La/ogk0;->a:Lkotlin/jvm/functions/Function1;

    .line 469
    .line 470
    iget-object v9, v8, La/iz40;->b:[Ljava/lang/Object;

    .line 471
    .line 472
    iget-object v10, v8, La/iz40;->a:[J

    .line 473
    .line 474
    array-length v11, v10

    .line 475
    add-int/lit8 v11, v11, -0x2

    .line 476
    .line 477
    if-ltz v11, :cond_7

    .line 478
    .line 479
    const/4 v12, 0x0

    .line 480
    :goto_2
    aget-wide v13, v10, v12

    .line 481
    .line 482
    move/from16 v16, v3

    .line 483
    .line 484
    not-long v2, v13

    .line 485
    const/16 v17, 0x7

    .line 486
    .line 487
    shl-long v2, v2, v17

    .line 488
    .line 489
    and-long/2addr v2, v13

    .line 490
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    and-long v2, v2, v17

    .line 496
    .line 497
    cmp-long v2, v2, v17

    .line 498
    .line 499
    if-eqz v2, :cond_6

    .line 500
    .line 501
    sub-int v2, v12, v11

    .line 502
    .line 503
    not-int v2, v2

    .line 504
    ushr-int/lit8 v2, v2, 0x1f

    .line 505
    .line 506
    rsub-int/lit8 v3, v2, 0x8

    .line 507
    .line 508
    const/4 v2, 0x0

    .line 509
    :goto_3
    if-ge v2, v3, :cond_5

    .line 510
    .line 511
    const-wide/16 v17, 0xff

    .line 512
    .line 513
    and-long v17, v13, v17

    .line 514
    .line 515
    const-wide/16 v19, 0x80

    .line 516
    .line 517
    cmp-long v17, v17, v19

    .line 518
    .line 519
    if-gez v17, :cond_4

    .line 520
    .line 521
    shl-int/lit8 v17, v12, 0x3

    .line 522
    .line 523
    add-int v17, v17, v2

    .line 524
    .line 525
    aget-object v15, v9, v17

    .line 526
    .line 527
    invoke-interface {v7, v15}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    :cond_4
    shr-long v13, v13, v16

    .line 531
    .line 532
    add-int/lit8 v2, v2, 0x1

    .line 533
    .line 534
    goto :goto_3

    .line 535
    :cond_5
    move/from16 v2, v16

    .line 536
    .line 537
    if-ne v3, v2, :cond_8

    .line 538
    .line 539
    goto :goto_4

    .line 540
    :cond_6
    move/from16 v2, v16

    .line 541
    .line 542
    :goto_4
    if-eq v12, v11, :cond_8

    .line 543
    .line 544
    add-int/lit8 v12, v12, 0x1

    .line 545
    .line 546
    move v3, v2

    .line 547
    goto :goto_2

    .line 548
    :cond_7
    move v2, v3

    .line 549
    :cond_8
    invoke-virtual {v8}, La/iz40;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 550
    .line 551
    .line 552
    add-int/lit8 v6, v6, 0x1

    .line 553
    .line 554
    move v3, v2

    .line 555
    goto :goto_1

    .line 556
    :goto_5
    const/4 v15, 0x0

    .line 557
    goto :goto_6

    .line 558
    :catchall_0
    move-exception v0

    .line 559
    goto :goto_5

    .line 560
    :cond_9
    move v2, v3

    .line 561
    const/4 v15, 0x0

    .line 562
    :try_start_2
    iput-boolean v15, v1, La/pgk0;->c:Z

    .line 563
    .line 564
    goto :goto_7

    .line 565
    :catchall_1
    move-exception v0

    .line 566
    goto :goto_8

    .line 567
    :goto_6
    iput-boolean v15, v1, La/pgk0;->c:Z

    .line 568
    .line 569
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 570
    :cond_a
    move v2, v3

    .line 571
    :goto_7
    monitor-exit v4

    .line 572
    invoke-virtual {v1}, La/pgk0;->c()Z

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    if-nez v0, :cond_b

    .line 577
    .line 578
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :cond_b
    move v3, v2

    .line 582
    goto/16 :goto_0

    .line 583
    .line 584
    :goto_8
    monitor-exit v4

    .line 585
    throw v0

    .line 586
    :pswitch_13
    check-cast v0, La/hwo;

    .line 587
    .line 588
    iget-object v1, v0, La/hwo;->a:Ljava/lang/Object;

    .line 589
    .line 590
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    if-nez v1, :cond_c

    .line 595
    .line 596
    iget-object v1, v0, La/hwo;->b:Ljava/util/ArrayList;

    .line 597
    .line 598
    new-instance v2, La/thj0;

    .line 599
    .line 600
    const/16 v3, 0x17

    .line 601
    .line 602
    invoke-direct {v2, v3}, La/thj0;-><init>(B)V

    .line 603
    .line 604
    .line 605
    invoke-static {v1, v2}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 606
    .line 607
    .line 608
    iget-object v0, v0, La/hwo;->c:La/yfe0;

    .line 609
    .line 610
    if-eqz v0, :cond_c

    .line 611
    .line 612
    iget-object v1, v0, La/yfe0;->a:La/zfe0;

    .line 613
    .line 614
    if-eqz v1, :cond_c

    .line 615
    .line 616
    invoke-interface {v1, v0, v4}, La/zfe0;->e(La/yfe0;Ljava/lang/Object;)La/gox;

    .line 617
    .line 618
    .line 619
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_14
    check-cast v0, La/wak0;

    .line 623
    .line 624
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    if-eqz v1, :cond_d

    .line 629
    .line 630
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    goto :goto_9

    .line 635
    :cond_d
    move-object v1, v4

    .line 636
    :goto_9
    instance-of v2, v1, Landroid/view/View;

    .line 637
    .line 638
    if-eqz v2, :cond_e

    .line 639
    .line 640
    move-object v4, v1

    .line 641
    check-cast v4, Landroid/view/View;

    .line 642
    .line 643
    :cond_e
    if-nez v4, :cond_f

    .line 644
    .line 645
    goto :goto_a

    .line 646
    :cond_f
    move-object v0, v4

    .line 647
    :goto_a
    return-object v0

    .line 648
    :pswitch_15
    check-cast v0, La/y4k0;

    .line 649
    .line 650
    sget-object v1, La/y4k0;->S1:La/gne0;

    .line 651
    .line 652
    iget-object v0, v0, La/y4k0;->Q1:La/fiu0;

    .line 653
    .line 654
    if-eqz v0, :cond_10

    .line 655
    .line 656
    return-object v0

    .line 657
    :cond_10
    const-string v0, "viewModelFactory"

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    throw v4

    .line 663
    :pswitch_16
    check-cast v0, La/xxj0;

    .line 664
    .line 665
    iget-object v1, v0, La/xxj0;->m0:La/bby;

    .line 666
    .line 667
    if-eqz v1, :cond_11

    .line 668
    .line 669
    invoke-interface {v1, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 670
    .line 671
    .line 672
    :cond_11
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 677
    .line 678
    iget-object v1, v0, La/xxj0;->d:La/mne;

    .line 679
    .line 680
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 681
    .line 682
    new-instance v10, La/thj0;

    .line 683
    .line 684
    const/16 v1, 0xc

    .line 685
    .line 686
    invoke-direct {v10, v1}, La/thj0;-><init>(B)V

    .line 687
    .line 688
    .line 689
    new-instance v11, La/qwj0;

    .line 690
    .line 691
    const/4 v15, 0x0

    .line 692
    invoke-direct {v11, v0, v4, v15}, La/qwj0;-><init>(La/xxj0;La/yje;B)V

    .line 693
    .line 694
    .line 695
    const/16 v12, 0x20

    .line 696
    .line 697
    const-wide/16 v6, 0x1

    .line 698
    .line 699
    invoke-static/range {v5 .. v12}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    iput-object v1, v0, La/xxj0;->m0:La/bby;

    .line 704
    .line 705
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 706
    .line 707
    return-object v0

    .line 708
    :pswitch_17
    check-cast v0, La/kd30;

    .line 709
    .line 710
    iget-object v0, v0, La/kd30;->a:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v0, La/gii0;

    .line 713
    .line 714
    const-class v1, La/sqj0;

    .line 715
    .line 716
    sget-object v2, La/sre0;->a:La/tre0;

    .line 717
    .line 718
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    check-cast v0, La/sqj0;

    .line 727
    .line 728
    return-object v0

    .line 729
    :pswitch_18
    check-cast v0, La/xpj0;

    .line 730
    .line 731
    iget-object v0, v0, La/xpj0;->d:La/cfq;

    .line 732
    .line 733
    return-object v0

    .line 734
    :pswitch_19
    check-cast v0, La/tjj0;

    .line 735
    .line 736
    iget-boolean v0, v0, La/tjj0;->g:Z

    .line 737
    .line 738
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    return-object v0

    .line 743
    :pswitch_1a
    check-cast v0, La/jjj0;

    .line 744
    .line 745
    iget-object v1, v0, La/jjj0;->c:La/pz40;

    .line 746
    .line 747
    move-object v2, v1

    .line 748
    check-cast v2, La/hgk0;

    .line 749
    .line 750
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    check-cast v2, La/h7k0;

    .line 755
    .line 756
    iget-wide v2, v2, La/h7k0;->a:J

    .line 757
    .line 758
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    cmp-long v2, v2, v5

    .line 764
    .line 765
    if-nez v2, :cond_12

    .line 766
    .line 767
    goto :goto_b

    .line 768
    :cond_12
    move-object v2, v1

    .line 769
    check-cast v2, La/hgk0;

    .line 770
    .line 771
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    check-cast v2, La/h7k0;

    .line 776
    .line 777
    iget-wide v2, v2, La/h7k0;->a:J

    .line 778
    .line 779
    invoke-static {v2, v3}, La/h7k0;->f(J)Z

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    if-eqz v2, :cond_13

    .line 784
    .line 785
    goto :goto_b

    .line 786
    :cond_13
    iget-object v0, v0, La/jjj0;->a:La/ijj0;

    .line 787
    .line 788
    check-cast v1, La/hgk0;

    .line 789
    .line 790
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    check-cast v1, La/h7k0;

    .line 795
    .line 796
    iget-wide v1, v1, La/h7k0;->a:J

    .line 797
    .line 798
    invoke-virtual {v0, v1, v2}, La/ijj0;->b(J)Landroid/graphics/Shader;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    :goto_b
    return-object v4

    .line 803
    :pswitch_1b
    check-cast v0, La/v6j0;

    .line 804
    .line 805
    invoke-virtual {v0}, La/v6j0;->g()La/uaq0;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    return-object v0

    .line 814
    :pswitch_1c
    check-cast v0, La/gbi;

    .line 815
    .line 816
    iget-object v0, v0, La/gbi;->q:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v0, La/pru;

    .line 819
    .line 820
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    return-object v0

    .line 825
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
