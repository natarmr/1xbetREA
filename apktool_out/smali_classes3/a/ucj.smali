.class public final synthetic La/ucj;
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
    iput-byte p2, p0, La/ucj;->a:B

    iput-object p1, p0, La/ucj;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ucj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "viewModelFactory"

    .line 5
    .line 6
    const v3, 0x7f0606a8

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object p0, p0, La/ucj;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, La/rll;

    .line 17
    .line 18
    iget-object p0, p0, La/rll;->b:La/a4x;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p0, La/lhl;

    .line 30
    .line 31
    new-instance v0, La/i63;

    .line 32
    .line 33
    invoke-direct {v0, p0, v5}, La/i63;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    check-cast p0, La/zri;

    .line 38
    .line 39
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/gii0;

    .line 42
    .line 43
    const-class v0, La/dfl;

    .line 44
    .line 45
    sget-object v1, La/sre0;->a:La/tre0;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, La/dfl;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    check-cast p0, La/qfl;

    .line 59
    .line 60
    sget-object v0, La/qfl;->O1:[La/iiy;

    .line 61
    .line 62
    iget-object p0, p0, La/qfl;->L1:La/fiu0;

    .line 63
    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_0
    const-string p0, "dragonsGoldViewModelFactory"

    .line 68
    .line 69
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v4

    .line 73
    :pswitch_3
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;

    .line 74
    .line 75
    sget v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->v:I

    .line 76
    .line 77
    new-instance v0, La/ucl;

    .line 78
    .line 79
    invoke-direct {v0, p0}, La/ucl;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_4
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 84
    .line 85
    iget v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->i:I

    .line 86
    .line 87
    iget v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->j:I

    .line 88
    .line 89
    filled-new-array {v0, v1}, [I

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "textColor"

    .line 94
    .line 95
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofArgb(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-wide/16 v0, 0x258

    .line 100
    .line 101
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 102
    .line 103
    .line 104
    const/4 v0, 0x2

    .line 105
    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 106
    .line 107
    .line 108
    const/4 v0, -0x1

    .line 109
    invoke-virtual {p0, v0}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 110
    .line 111
    .line 112
    const-wide/16 v0, 0x12c

    .line 113
    .line 114
    invoke-virtual {p0, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_5
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 119
    .line 120
    new-instance v0, La/ecl;

    .line 121
    .line 122
    invoke-direct {v0, p0}, La/ecl;-><init>(Landroid/widget/FrameLayout;)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_6
    check-cast p0, La/z19;

    .line 127
    .line 128
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v1, p0, La/z19;->i:La/n0o0;

    .line 133
    .line 134
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, La/fee;

    .line 139
    .line 140
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Ljava/util/Collection;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, La/z19;->k:La/n0o0;

    .line 150
    .line 151
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, La/fee;

    .line 156
    .line 157
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, Ljava/util/Collection;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 164
    .line 165
    .line 166
    iget-object v1, p0, La/z19;->m:La/n0o0;

    .line 167
    .line 168
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, La/fee;

    .line 173
    .line 174
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Ljava/util/Collection;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 181
    .line 182
    .line 183
    iget-object v1, p0, La/z19;->j:La/n0o0;

    .line 184
    .line 185
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, La/fee;

    .line 190
    .line 191
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Ljava/util/Collection;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 198
    .line 199
    .line 200
    iget-object p0, p0, La/z19;->l:La/n0o0;

    .line 201
    .line 202
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    check-cast p0, La/fee;

    .line 207
    .line 208
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    check-cast p0, Ljava/util/Collection;

    .line 213
    .line 214
    invoke-static {v0, p0, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_7
    check-cast p0, La/d9l;

    .line 220
    .line 221
    invoke-static {p0}, La/d9l;->b(La/d9l;)Lkotlin/Unit;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0

    .line 226
    :pswitch_8
    check-cast p0, La/p7l;

    .line 227
    .line 228
    new-instance v0, Landroid/text/TextPaint;

    .line 229
    .line 230
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 234
    .line 235
    .line 236
    iget-object v1, p0, La/p7l;->a:Landroid/content/Context;

    .line 237
    .line 238
    const v2, 0x7f140464

    .line 239
    .line 240
    .line 241
    invoke-static {v0, v1, v2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 242
    .line 243
    .line 244
    const v2, 0x7f0606da

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 252
    .line 253
    .line 254
    iget v1, p0, La/p7l;->t:F

    .line 255
    .line 256
    iget p0, p0, La/p7l;->e:F

    .line 257
    .line 258
    mul-float/2addr v1, p0

    .line 259
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 260
    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_9
    check-cast p0, La/j7l;

    .line 264
    .line 265
    new-instance v0, La/z6p0;

    .line 266
    .line 267
    invoke-direct {v0, p0, v3}, La/z6p0;-><init>(Landroid/widget/FrameLayout;I)V

    .line 268
    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_a
    check-cast p0, La/m5l;

    .line 272
    .line 273
    new-instance v0, La/z6p0;

    .line 274
    .line 275
    invoke-direct {v0, p0, v3}, La/z6p0;-><init>(Landroid/widget/FrameLayout;I)V

    .line 276
    .line 277
    .line 278
    return-object v0

    .line 279
    :pswitch_b
    check-cast p0, La/l3l;

    .line 280
    .line 281
    new-instance v0, La/q0h0;

    .line 282
    .line 283
    iget-object p0, p0, La/l3l;->L1:La/sfi;

    .line 284
    .line 285
    if-eqz p0, :cond_1

    .line 286
    .line 287
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 288
    .line 289
    .line 290
    return-object v0

    .line 291
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v4

    .line 295
    :pswitch_c
    check-cast p0, La/o0l;

    .line 296
    .line 297
    iget-object p0, p0, La/o0l;->a:La/gii0;

    .line 298
    .line 299
    const-class v0, La/kzk;

    .line 300
    .line 301
    sget-object v1, La/sre0;->a:La/tre0;

    .line 302
    .line 303
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, La/kzk;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_d
    check-cast p0, La/szk;

    .line 315
    .line 316
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 317
    .line 318
    iget-object p0, p0, La/szk;->L1:La/fiu0;

    .line 319
    .line 320
    if-eqz p0, :cond_2

    .line 321
    .line 322
    return-object p0

    .line 323
    :cond_2
    const-string p0, "dominoViewModelFactory"

    .line 324
    .line 325
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v4

    .line 329
    :pswitch_e
    check-cast p0, La/hsj;

    .line 330
    .line 331
    iget-object p0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast p0, La/gii0;

    .line 334
    .line 335
    const-class v0, La/lyk;

    .line 336
    .line 337
    sget-object v1, La/sre0;->a:La/tre0;

    .line 338
    .line 339
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    check-cast p0, La/lyk;

    .line 348
    .line 349
    return-object p0

    .line 350
    :pswitch_f
    check-cast p0, La/zri;

    .line 351
    .line 352
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p0, La/azj0;

    .line 355
    .line 356
    const-class v0, La/tuk;

    .line 357
    .line 358
    sget-object v1, La/sre0;->a:La/tre0;

    .line 359
    .line 360
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {p0, v0}, La/azj0;->d(La/sgy;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    check-cast p0, La/tuk;

    .line 369
    .line 370
    return-object p0

    .line 371
    :pswitch_10
    check-cast p0, La/jbk;

    .line 372
    .line 373
    iget-object v0, p0, La/jbk;->f:La/p7m0;

    .line 374
    .line 375
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    move-object v1, p0

    .line 380
    check-cast v1, Ljava/lang/Boolean;

    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 386
    .line 387
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p0

    .line 391
    if-eqz p0, :cond_3

    .line 392
    .line 393
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object p0

    .line 396
    :pswitch_11
    check-cast p0, La/cbk;

    .line 397
    .line 398
    sget-object v0, La/cbk;->O1:La/xak;

    .line 399
    .line 400
    iget-object p0, p0, La/cbk;->K1:La/fiu0;

    .line 401
    .line 402
    if-eqz p0, :cond_4

    .line 403
    .line 404
    return-object p0

    .line 405
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v4

    .line 409
    :pswitch_12
    check-cast p0, La/pak;

    .line 410
    .line 411
    iget-object v0, p0, La/pak;->f:La/p7m0;

    .line 412
    .line 413
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    move-object v1, p0

    .line 418
    check-cast v1, Ljava/lang/Boolean;

    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result p0

    .line 429
    if-eqz p0, :cond_5

    .line 430
    .line 431
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object p0

    .line 434
    :pswitch_13
    move-object v0, p0

    .line 435
    check-cast v0, La/m8k;

    .line 436
    .line 437
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 438
    .line 439
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 440
    .line 441
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 449
    .line 450
    move-object v3, p0

    .line 451
    check-cast v3, La/k8k;

    .line 452
    .line 453
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const/16 v8, 0x1b

    .line 458
    .line 459
    const/4 v4, 0x0

    .line 460
    const/4 v5, 0x0

    .line 461
    const/4 v6, 0x0

    .line 462
    invoke-static/range {v3 .. v8}, La/k8k;->a(La/k8k;La/xrz;La/d8k;ZLjava/lang/String;I)La/k8k;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result p0

    .line 470
    if-eqz p0, :cond_6

    .line 471
    .line 472
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object p0

    .line 475
    :pswitch_14
    check-cast p0, La/g5q0;

    .line 476
    .line 477
    invoke-interface {p0}, La/g5q0;->close()V

    .line 478
    .line 479
    .line 480
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object p0

    .line 483
    :pswitch_15
    check-cast p0, La/prj;

    .line 484
    .line 485
    iget-object p0, p0, La/prj;->b:La/pru;

    .line 486
    .line 487
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    return-object p0

    .line 492
    :pswitch_16
    check-cast p0, La/tjj;

    .line 493
    .line 494
    iget-byte v0, p0, La/tjj;->a:B

    .line 495
    .line 496
    sub-int/2addr v0, v5

    .line 497
    iget-byte p0, p0, La/tjj;->b:B

    .line 498
    .line 499
    new-instance v1, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    const-string v2, "(([1-9]{1}[0-9]{0,"

    .line 502
    .line 503
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v0, "})?||[0]{1})((\\.[0-9]{0,"

    .line 510
    .line 511
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    const-string p0, "})?)||(\\.)?"

    .line 518
    .line 519
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    return-object p0

    .line 531
    :pswitch_17
    check-cast p0, La/fjj;

    .line 532
    .line 533
    const-string v1, "DEBUG_CONSOLE_KEY"

    .line 534
    .line 535
    iget-object p0, p0, La/fjj;->a:La/q7d0;

    .line 536
    .line 537
    sget-object v2, La/ljj;->a:La/ljj;

    .line 538
    .line 539
    :try_start_0
    const-string v0, ""

    .line 540
    .line 541
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    if-nez v0, :cond_7

    .line 550
    .line 551
    const-string v0, "CLOSED"

    .line 552
    .line 553
    goto :goto_0

    .line 554
    :catchall_0
    move-exception v0

    .line 555
    goto :goto_1

    .line 556
    :cond_7
    :goto_0
    invoke-static {v0}, La/ljj;->valueOf(Ljava/lang/String;)La/ljj;

    .line 557
    .line 558
    .line 559
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 560
    goto :goto_2

    .line 561
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 562
    .line 563
    .line 564
    invoke-virtual {p0, v1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    :goto_2
    invoke-static {v2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    return-object p0

    .line 572
    :pswitch_18
    check-cast p0, La/xr;

    .line 573
    .line 574
    iget-object p0, p0, La/xr;->a:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast p0, La/gii0;

    .line 577
    .line 578
    const-class v0, La/pfj;

    .line 579
    .line 580
    sget-object v1, La/sre0;->a:La/tre0;

    .line 581
    .line 582
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object p0

    .line 590
    check-cast p0, La/pfj;

    .line 591
    .line 592
    return-object p0

    .line 593
    :pswitch_19
    check-cast p0, La/c2;

    .line 594
    .line 595
    sget-object v0, La/xej;->l2:La/nwd;

    .line 596
    .line 597
    invoke-virtual {p0}, La/c2;->E()Z

    .line 598
    .line 599
    .line 600
    move-result p0

    .line 601
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 602
    .line 603
    .line 604
    move-result-object p0

    .line 605
    return-object p0

    .line 606
    :pswitch_1a
    check-cast p0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 607
    .line 608
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    return-object p0

    .line 613
    :pswitch_1b
    check-cast p0, La/jej;

    .line 614
    .line 615
    sget-object v0, La/dej;->l2:La/kwd;

    .line 616
    .line 617
    invoke-virtual {p0}, La/jej;->a()Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    iget-object v0, v0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 622
    .line 623
    if-eqz v0, :cond_8

    .line 624
    .line 625
    invoke-virtual {p0}, La/jej;->a()Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    iget-object p0, p0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 630
    .line 631
    if-eqz p0, :cond_8

    .line 632
    .line 633
    move v1, v5

    .line 634
    :cond_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    return-object p0

    .line 639
    :pswitch_1c
    check-cast p0, La/hdj;

    .line 640
    .line 641
    sget-object v0, La/vcj;->m2:La/kud;

    .line 642
    .line 643
    invoke-virtual {p0}, La/hdj;->a()Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    if-eqz p0, :cond_9

    .line 648
    .line 649
    move v1, v5

    .line 650
    :cond_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 651
    .line 652
    .line 653
    move-result-object p0

    .line 654
    return-object p0

    .line 655
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
