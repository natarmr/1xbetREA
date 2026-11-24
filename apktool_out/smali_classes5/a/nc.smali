.class public final synthetic La/nc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/c1a;Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;)V
    .locals 0

    .line 1
    const/16 p2, 0x8

    iput-byte p2, p0, La/nc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nc;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/nc;->a:B

    iput-object p1, p0, La/nc;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/nc;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "viewModelFactory"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/nc;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/w6k;

    .line 13
    .line 14
    const/high16 v0, 0x42fa0000    # 125.0f

    .line 15
    .line 16
    invoke-interface {p0, v0}, La/w6k;->w0(F)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p0, La/le2;

    .line 26
    .line 27
    iget-object p0, p0, La/le2;->y:La/pru;

    .line 28
    .line 29
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p0, La/ty1;

    .line 35
    .line 36
    sget-object v0, La/ty1;->R1:La/rek0;

    .line 37
    .line 38
    iget-object p0, p0, La/ty1;->L1:La/fiu0;

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v3

    .line 47
    :pswitch_2
    check-cast p0, La/uv1;

    .line 48
    .line 49
    invoke-virtual {p0}, La/uv1;->Q()V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_3
    check-cast p0, La/ru1;

    .line 56
    .line 57
    iget-byte p0, p0, La/ru1;->b:B

    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_4
    check-cast p0, La/yzn0;

    .line 65
    .line 66
    iget-object p0, p0, La/yzn0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/gii0;

    .line 69
    .line 70
    const-class v0, La/ar1;

    .line 71
    .line 72
    sget-object v1, La/sre0;->a:La/tre0;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/ar1;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_5
    check-cast p0, La/chf0;

    .line 86
    .line 87
    iget-object p0, p0, La/chf0;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, La/gii0;

    .line 90
    .line 91
    const-class v0, La/sa0;

    .line 92
    .line 93
    sget-object v1, La/sre0;->a:La/tre0;

    .line 94
    .line 95
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/sa0;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_6
    check-cast p0, La/lk1;

    .line 107
    .line 108
    sget-object v0, La/lk1;->U1:La/rek0;

    .line 109
    .line 110
    iget-object p0, p0, La/lk1;->M1:La/fiu0;

    .line 111
    .line 112
    if-eqz p0, :cond_1

    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v3

    .line 119
    :pswitch_7
    check-cast p0, La/qj1;

    .line 120
    .line 121
    iget-object p0, p0, La/qj1;->K1:La/fiu0;

    .line 122
    .line 123
    if-eqz p0, :cond_2

    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v3

    .line 130
    :pswitch_8
    check-cast p0, La/mh1;

    .line 131
    .line 132
    iget-object p0, p0, La/mh1;->g0:La/bby;

    .line 133
    .line 134
    if-eqz p0, :cond_3

    .line 135
    .line 136
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_9
    check-cast p0, La/xex;

    .line 143
    .line 144
    iget-object p0, p0, La/xex;->a:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, La/gii0;

    .line 147
    .line 148
    const-class v0, La/bx0;

    .line 149
    .line 150
    sget-object v1, La/sre0;->a:La/tre0;

    .line 151
    .line 152
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, La/bx0;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_a
    check-cast p0, La/je1;

    .line 164
    .line 165
    sget-object v0, La/je1;->S1:La/hfk0;

    .line 166
    .line 167
    iget-object p0, p0, La/je1;->L1:La/fiu0;

    .line 168
    .line 169
    if-eqz p0, :cond_4

    .line 170
    .line 171
    return-object p0

    .line 172
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v3

    .line 176
    :pswitch_b
    check-cast p0, La/iqt;

    .line 177
    .line 178
    new-instance v0, La/ga1;

    .line 179
    .line 180
    iget-object p0, p0, La/iqt;->a:La/gst0;

    .line 181
    .line 182
    invoke-virtual {p0}, La/gst0;->a()Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    invoke-direct {v0, p0}, La/ga1;-><init>(Z)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_c
    check-cast p0, La/xr;

    .line 191
    .line 192
    iget-object p0, p0, La/xr;->a:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p0, La/gii0;

    .line 195
    .line 196
    const-class v0, La/u41;

    .line 197
    .line 198
    sget-object v1, La/sre0;->a:La/tre0;

    .line 199
    .line 200
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    check-cast p0, La/u41;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_d
    check-cast p0, La/q21;

    .line 212
    .line 213
    sget-object v0, La/q21;->O1:La/rek0;

    .line 214
    .line 215
    new-instance v0, La/o21;

    .line 216
    .line 217
    new-instance v1, La/t1;

    .line 218
    .line 219
    const/16 v2, 0x1d

    .line 220
    .line 221
    invoke-direct {v1, p0, v2}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 222
    .line 223
    .line 224
    sget-object p0, La/ek5;->h:La/ek5;

    .line 225
    .line 226
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 227
    .line 228
    .line 229
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 230
    .line 231
    invoke-static {v1}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {p0, v1}, La/dp;->b(La/gbn;)V

    .line 236
    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_e
    check-cast p0, La/uu0;

    .line 240
    .line 241
    sget-object v0, La/uu0;->o2:La/gfk0;

    .line 242
    .line 243
    iget-object p0, p0, La/uu0;->m2:La/fiu0;

    .line 244
    .line 245
    if-eqz p0, :cond_5

    .line 246
    .line 247
    return-object p0

    .line 248
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v3

    .line 252
    :pswitch_f
    check-cast p0, La/wr0;

    .line 253
    .line 254
    new-instance v0, La/mtl;

    .line 255
    .line 256
    new-instance v2, La/itl;

    .line 257
    .line 258
    new-instance v3, La/wul;

    .line 259
    .line 260
    sget-object v4, La/nul;->e:La/nul;

    .line 261
    .line 262
    sget-object v5, La/oe9;->a:La/oe9;

    .line 263
    .line 264
    new-instance v6, La/ue9;

    .line 265
    .line 266
    iget-object p0, p0, La/wr0;->b:La/ctf0;

    .line 267
    .line 268
    new-array v7, v1, [Ljava/lang/Object;

    .line 269
    .line 270
    iget-object v8, p0, La/ctf0;->b:La/lsm0;

    .line 271
    .line 272
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    const v9, 0x7f131164

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-direct {v6, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const/4 v8, 0x0

    .line 287
    const/4 v9, 0x1

    .line 288
    const/4 v7, 0x1

    .line 289
    invoke-direct/range {v3 .. v9}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 290
    .line 291
    .line 292
    sget-object v4, La/ql1;->a:La/ql1;

    .line 293
    .line 294
    invoke-direct {v2, v3, v4}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 295
    .line 296
    .line 297
    new-instance v3, La/itl;

    .line 298
    .line 299
    move-object v7, v5

    .line 300
    new-instance v5, La/wul;

    .line 301
    .line 302
    sget-object v6, La/lul;->e:La/lul;

    .line 303
    .line 304
    new-instance v8, La/ue9;

    .line 305
    .line 306
    new-array v4, v1, [Ljava/lang/Object;

    .line 307
    .line 308
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 309
    .line 310
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    const v4, 0x7f1312c2

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-direct {v8, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    const/4 v10, 0x0

    .line 325
    const/4 v11, 0x1

    .line 326
    invoke-direct/range {v5 .. v11}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 327
    .line 328
    .line 329
    sget-object p0, La/va0;->a:La/va0;

    .line 330
    .line 331
    invoke-direct {v3, v5, p0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 332
    .line 333
    .line 334
    filled-new-array {v2, v3}, [La/itl;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    invoke-static {p0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-direct {v0, p0}, La/mtl;-><init>(La/a4x;)V

    .line 343
    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_10
    check-cast p0, La/jq0;

    .line 347
    .line 348
    new-instance v0, La/q0h0;

    .line 349
    .line 350
    iget-object p0, p0, La/jq0;->N1:La/l7i;

    .line 351
    .line 352
    if-eqz p0, :cond_6

    .line 353
    .line 354
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 355
    .line 356
    .line 357
    return-object v0

    .line 358
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v3

    .line 362
    :pswitch_11
    check-cast p0, La/xn0;

    .line 363
    .line 364
    check-cast p0, La/vn0;

    .line 365
    .line 366
    iget-boolean p0, p0, La/vn0;->c:Z

    .line 367
    .line 368
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    return-object p0

    .line 373
    :pswitch_12
    check-cast p0, La/khf0;

    .line 374
    .line 375
    iget-object p0, p0, La/khf0;->b:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p0, La/gii0;

    .line 378
    .line 379
    const-class v0, La/cq0;

    .line 380
    .line 381
    sget-object v1, La/sre0;->a:La/tre0;

    .line 382
    .line 383
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    check-cast p0, La/cq0;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_13
    check-cast p0, La/r80;

    .line 395
    .line 396
    iget-object p0, p0, La/r80;->a:La/gii0;

    .line 397
    .line 398
    const-class v0, La/s70;

    .line 399
    .line 400
    sget-object v1, La/sre0;->a:La/tre0;

    .line 401
    .line 402
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    check-cast p0, La/s70;

    .line 411
    .line 412
    return-object p0

    .line 413
    :pswitch_14
    check-cast p0, La/c1a;

    .line 414
    .line 415
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    check-cast p0, La/ow9;

    .line 421
    .line 422
    invoke-virtual {p0, v0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    check-cast p0, [Landroid/util/Range;

    .line 427
    .line 428
    if-eqz p0, :cond_e

    .line 429
    .line 430
    array-length v0, p0

    .line 431
    if-nez v0, :cond_7

    .line 432
    .line 433
    goto/16 :goto_3

    .line 434
    .line 435
    :cond_7
    array-length v0, p0

    .line 436
    :goto_0
    if-ge v1, v0, :cond_e

    .line 437
    .line 438
    aget-object v2, p0, v1

    .line 439
    .line 440
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    check-cast v4, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    check-cast v5, Ljava/lang/Integer;

    .line 451
    .line 452
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    check-cast v6, Ljava/lang/Number;

    .line 457
    .line 458
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result v6

    .line 462
    const/16 v7, 0x3e8

    .line 463
    .line 464
    if-lt v6, v7, :cond_8

    .line 465
    .line 466
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    check-cast v4, Ljava/lang/Number;

    .line 471
    .line 472
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    div-int/2addr v4, v7

    .line 477
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    :cond_8
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 482
    .line 483
    .line 484
    move-result-object v6

    .line 485
    check-cast v6, Ljava/lang/Number;

    .line 486
    .line 487
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-lt v6, v7, :cond_9

    .line 492
    .line 493
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    check-cast v2, Ljava/lang/Number;

    .line 498
    .line 499
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    div-int/2addr v2, v7

    .line 504
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    :cond_9
    new-instance v2, Landroid/util/Range;

    .line 509
    .line 510
    invoke-direct {v2, v5, v4}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Ljava/lang/Integer;

    .line 518
    .line 519
    if-nez v4, :cond_a

    .line 520
    .line 521
    goto :goto_2

    .line 522
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    const/16 v5, 0x1e

    .line 527
    .line 528
    if-eq v4, v5, :cond_b

    .line 529
    .line 530
    goto :goto_2

    .line 531
    :cond_b
    if-nez v3, :cond_c

    .line 532
    .line 533
    goto :goto_1

    .line 534
    :cond_c
    invoke-virtual {v2}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    check-cast v4, Ljava/lang/Number;

    .line 539
    .line 540
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-virtual {v3}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    check-cast v5, Ljava/lang/Number;

    .line 549
    .line 550
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 551
    .line 552
    .line 553
    move-result v5

    .line 554
    if-ge v4, v5, :cond_d

    .line 555
    .line 556
    :goto_1
    move-object v3, v2

    .line 557
    :cond_d
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 558
    .line 559
    goto :goto_0

    .line 560
    :cond_e
    :goto_3
    return-object v3

    .line 561
    :pswitch_15
    check-cast p0, La/vx;

    .line 562
    .line 563
    sget-object v0, La/vx;->P1:La/hfk0;

    .line 564
    .line 565
    iget-object p0, p0, La/vx;->M1:La/fiu0;

    .line 566
    .line 567
    if-eqz p0, :cond_f

    .line 568
    .line 569
    return-object p0

    .line 570
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    throw v3

    .line 574
    :pswitch_16
    check-cast p0, La/ew;

    .line 575
    .line 576
    sget-object v0, La/ew;->Q1:[La/iiy;

    .line 577
    .line 578
    iget-object p0, p0, La/ew;->M1:La/fiu0;

    .line 579
    .line 580
    if-eqz p0, :cond_10

    .line 581
    .line 582
    return-object p0

    .line 583
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v3

    .line 587
    :pswitch_17
    check-cast p0, La/pv;

    .line 588
    .line 589
    iget-object v0, p0, La/pv;->o:La/p7m0;

    .line 590
    .line 591
    :cond_11
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object p0

    .line 595
    move-object v1, p0

    .line 596
    check-cast v1, La/jv;

    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    const/16 v8, 0x3e

    .line 600
    .line 601
    const/4 v2, 0x0

    .line 602
    const/4 v3, 0x0

    .line 603
    const/4 v4, 0x0

    .line 604
    const/4 v5, 0x0

    .line 605
    const/4 v6, 0x0

    .line 606
    invoke-static/range {v1 .. v8}, La/jv;->a(La/jv;ZLjava/lang/String;Ljava/lang/String;ZZLa/c6q0;I)La/jv;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result p0

    .line 614
    if-eqz p0, :cond_11

    .line 615
    .line 616
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 617
    .line 618
    return-object p0

    .line 619
    :pswitch_18
    check-cast p0, La/um;

    .line 620
    .line 621
    iget-object p0, p0, La/um;->a:La/mdm;

    .line 622
    .line 623
    return-object p0

    .line 624
    :pswitch_19
    check-cast p0, La/wj;

    .line 625
    .line 626
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    new-instance v5, La/dj;

    .line 631
    .line 632
    const/4 v0, 0x1

    .line 633
    invoke-direct {v5, p0, v0}, La/dj;-><init>(La/wj;B)V

    .line 634
    .line 635
    .line 636
    new-instance v8, La/ya;

    .line 637
    .line 638
    invoke-direct {v8, p0, v3, v0}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 639
    .line 640
    .line 641
    const/16 v9, 0xe

    .line 642
    .line 643
    const/4 v6, 0x0

    .line 644
    const/4 v7, 0x0

    .line 645
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 646
    .line 647
    .line 648
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 649
    .line 650
    return-object p0

    .line 651
    :pswitch_1a
    check-cast p0, La/uf;

    .line 652
    .line 653
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    new-instance v5, La/t1;

    .line 658
    .line 659
    const/4 v0, 0x7

    .line 660
    invoke-direct {v5, p0, v0}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 661
    .line 662
    .line 663
    new-instance v8, La/l1;

    .line 664
    .line 665
    const/4 v0, 0x4

    .line 666
    invoke-direct {v8, p0, v3, v0}, La/l1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 667
    .line 668
    .line 669
    const/16 v9, 0xe

    .line 670
    .line 671
    const/4 v6, 0x0

    .line 672
    const/4 v7, 0x0

    .line 673
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 674
    .line 675
    .line 676
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 677
    .line 678
    return-object p0

    .line 679
    :pswitch_1b
    check-cast p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;

    .line 680
    .line 681
    new-instance v0, La/sc;

    .line 682
    .line 683
    iget-wide v3, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->b:J

    .line 684
    .line 685
    iget-object v7, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->c:Ljava/lang/String;

    .line 686
    .line 687
    iget-wide v5, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->d:J

    .line 688
    .line 689
    iget-object v8, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->e:Ljava/lang/String;

    .line 690
    .line 691
    iget-wide v1, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->f:D

    .line 692
    .line 693
    iget-boolean v9, p0, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->g:Z

    .line 694
    .line 695
    invoke-direct/range {v0 .. v9}, La/sc;-><init>(DJJLjava/lang/String;Ljava/lang/String;Z)V

    .line 696
    .line 697
    .line 698
    return-object v0

    .line 699
    :pswitch_1c
    check-cast p0, La/qc;

    .line 700
    .line 701
    sget-object v0, La/qc;->n2:La/hfk0;

    .line 702
    .line 703
    iget-object p0, p0, La/qc;->k2:La/fiu0;

    .line 704
    .line 705
    if-eqz p0, :cond_12

    .line 706
    .line 707
    return-object p0

    .line 708
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v3

    .line 712
    nop

    .line 713
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
