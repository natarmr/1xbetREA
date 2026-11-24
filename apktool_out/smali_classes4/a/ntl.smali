.class public final synthetic La/ntl;
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
    iput-byte p2, p0, La/ntl;->a:B

    iput-object p1, p0, La/ntl;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/ntl;->a:B

    .line 2
    .line 3
    const-string v1, "viewModelFactory"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/ntl;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/ehp;

    .line 12
    .line 13
    iget-object p0, p0, La/ehp;->K1:La/fiu0;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v2

    .line 22
    :pswitch_0
    check-cast p0, La/pgp;

    .line 23
    .line 24
    sget-object v0, La/pgp;->P1:La/ddk;

    .line 25
    .line 26
    iget-object p0, p0, La/pgp;->K1:La/fiu0;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v2

    .line 35
    :pswitch_1
    check-cast p0, La/wti;

    .line 36
    .line 37
    iget-object p0, p0, La/wti;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/gii0;

    .line 40
    .line 41
    const-class v0, La/ucp;

    .line 42
    .line 43
    sget-object v1, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/ucp;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_2
    check-cast p0, La/k6p;

    .line 57
    .line 58
    invoke-virtual {p0}, La/k6p;->x()V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_3
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 65
    .line 66
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/category/a;->y:La/pru;

    .line 67
    .line 68
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    check-cast p0, La/zri;

    .line 74
    .line 75
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, La/gii0;

    .line 78
    .line 79
    const-class v0, La/izo;

    .line 80
    .line 81
    sget-object v1, La/sre0;->a:La/tre0;

    .line 82
    .line 83
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/izo;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_5
    move-object v0, p0

    .line 95
    check-cast v0, La/gzo;

    .line 96
    .line 97
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 98
    .line 99
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 100
    .line 101
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 109
    .line 110
    move-object v3, p0

    .line 111
    check-cast v3, La/syo;

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const/16 v14, 0x7fd

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v11, 0x0

    .line 127
    const/4 v12, 0x0

    .line 128
    invoke-static/range {v3 .. v14}, La/syo;->a(La/syo;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;La/dyo;La/dyo;La/yxo;I)La/syo;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_2

    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_6
    check-cast p0, La/fhj;

    .line 142
    .line 143
    iget-object p0, p0, La/fhj;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, La/gii0;

    .line 146
    .line 147
    const-class v0, La/xxo;

    .line 148
    .line 149
    sget-object v1, La/sre0;->a:La/tre0;

    .line 150
    .line 151
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, La/xxo;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_7
    check-cast p0, La/hsj;

    .line 163
    .line 164
    iget-object p0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, La/gii0;

    .line 167
    .line 168
    const-class v0, La/nvo;

    .line 169
    .line 170
    sget-object v1, La/sre0;->a:La/tre0;

    .line 171
    .line 172
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, La/nvo;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_8
    check-cast p0, La/ivo;

    .line 184
    .line 185
    sget-object v0, La/ivo;->P1:La/xak;

    .line 186
    .line 187
    iget-object p0, p0, La/ivo;->M1:La/fiu0;

    .line 188
    .line 189
    if-eqz p0, :cond_3

    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v2

    .line 196
    :pswitch_9
    check-cast p0, La/qqo;

    .line 197
    .line 198
    iget-object p0, p0, La/qqo;->b:La/wro;

    .line 199
    .line 200
    iget-boolean p0, p0, La/wro;->c:Z

    .line 201
    .line 202
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :pswitch_a
    check-cast p0, Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 208
    .line 209
    invoke-virtual {p0}, Lorg/xplatform/onexdatabase/OnexDatabase;->m()La/nbo;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_b
    check-cast p0, La/wco;

    .line 215
    .line 216
    iget-object p0, p0, La/wco;->a:Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 217
    .line 218
    invoke-virtual {p0}, Lorg/xplatform/onexdatabase/OnexDatabase;->n()La/qco;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_c
    check-cast p0, La/i5o;

    .line 224
    .line 225
    new-instance v0, La/q0h0;

    .line 226
    .line 227
    iget-object p0, p0, La/i5o;->L1:La/bgi;

    .line 228
    .line 229
    if-eqz p0, :cond_4

    .line 230
    .line 231
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 232
    .line 233
    .line 234
    return-object v0

    .line 235
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v2

    .line 239
    :pswitch_d
    check-cast p0, La/l2o;

    .line 240
    .line 241
    iget p0, p0, La/l2o;->a:I

    .line 242
    .line 243
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    return-object p0

    .line 248
    :pswitch_e
    check-cast p0, La/cyn;

    .line 249
    .line 250
    new-instance v0, La/iyn;

    .line 251
    .line 252
    iget-boolean p0, p0, La/cyn;->a:Z

    .line 253
    .line 254
    const/4 v1, 0x0

    .line 255
    invoke-direct {v0, p0, v1}, La/iyn;-><init>(ZZ)V

    .line 256
    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_f
    check-cast p0, La/wti;

    .line 260
    .line 261
    iget-object p0, p0, La/wti;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, La/gii0;

    .line 264
    .line 265
    const-class v0, La/phn;

    .line 266
    .line 267
    sget-object v1, La/sre0;->a:La/tre0;

    .line 268
    .line 269
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    check-cast p0, La/phn;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_10
    check-cast p0, La/whn;

    .line 281
    .line 282
    sget-object v0, La/whn;->O1:[La/iiy;

    .line 283
    .line 284
    iget-object p0, p0, La/whn;->L1:La/fiu0;

    .line 285
    .line 286
    if-eqz p0, :cond_5

    .line 287
    .line 288
    return-object p0

    .line 289
    :cond_5
    const-string p0, "easternNightsViewModelFactory"

    .line 290
    .line 291
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v2

    .line 295
    :pswitch_11
    check-cast p0, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 296
    .line 297
    sget v0, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 298
    .line 299
    new-instance v0, La/k14;

    .line 300
    .line 301
    invoke-direct {v0, p0}, La/k14;-><init>(Landroid/view/View;)V

    .line 302
    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_12
    check-cast p0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 306
    .line 307
    sget v0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->k:I

    .line 308
    .line 309
    new-instance v0, La/od5;

    .line 310
    .line 311
    invoke-direct {v0, p0}, La/od5;-><init>(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_13
    check-cast p0, La/rrm;

    .line 316
    .line 317
    const/4 v0, 0x3

    .line 318
    invoke-virtual {p0, v0}, La/g46;->a(I)V

    .line 319
    .line 320
    .line 321
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object p0

    .line 324
    :pswitch_14
    check-cast p0, La/wom;

    .line 325
    .line 326
    invoke-virtual {p0}, La/wom;->c()F

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_15
    check-cast p0, La/knm;

    .line 336
    .line 337
    iget-object p0, p0, La/knm;->c:La/bm90;

    .line 338
    .line 339
    invoke-static {p0}, La/g8x;->Q(La/bm90;)I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    return-object p0

    .line 348
    :pswitch_16
    check-cast p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 349
    .line 350
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 351
    .line 352
    invoke-virtual {p0}, La/wf40;->b()V

    .line 353
    .line 354
    .line 355
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object p0

    .line 358
    :pswitch_17
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 359
    .line 360
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 361
    .line 362
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 371
    .line 372
    int-to-double v0, v0

    .line 373
    const-wide v2, 0x4000cccccccccccdL    # 2.1

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    div-double/2addr v0, v2

    .line 379
    iget p0, p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->c:I

    .line 380
    .line 381
    double-to-int v0, v0

    .line 382
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    return-object p0

    .line 391
    :pswitch_18
    check-cast p0, La/e7m;

    .line 392
    .line 393
    check-cast p0, La/d7m;

    .line 394
    .line 395
    iget p0, p0, La/d7m;->b:I

    .line 396
    .line 397
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :pswitch_19
    check-cast p0, La/h5m;

    .line 403
    .line 404
    iget-object v0, p0, La/h5m;->a:La/cgk0;

    .line 405
    .line 406
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    const/4 v2, 0x0

    .line 411
    if-lez v1, :cond_6

    .line 412
    .line 413
    iget-object p0, p0, La/h5m;->b:La/agk0;

    .line 414
    .line 415
    invoke-virtual {p0}, La/agk0;->l()F

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    int-to-float v0, v0

    .line 424
    div-float/2addr p0, v0

    .line 425
    const/high16 v0, 0x3f800000    # 1.0f

    .line 426
    .line 427
    invoke-static {p0, v2, v0}, La/l1e0;->c(FFF)F

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    :cond_6
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    return-object p0

    .line 436
    :pswitch_1a
    check-cast p0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 437
    .line 438
    sget v0, Lorg/xplatform/uikit/components/counter/DsCounter;->i:I

    .line 439
    .line 440
    new-instance v0, La/k14;

    .line 441
    .line 442
    invoke-direct {v0, p0}, La/k14;-><init>(Landroid/view/View;)V

    .line 443
    .line 444
    .line 445
    return-object v0

    .line 446
    :pswitch_1b
    check-cast p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;

    .line 447
    .line 448
    iget-object p0, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->o2:La/o0x;

    .line 449
    .line 450
    return-object p0

    .line 451
    :pswitch_1c
    check-cast p0, La/stl;

    .line 452
    .line 453
    sget-object v0, La/stl;->f2:[La/iiy;

    .line 454
    .line 455
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    const v0, 0x7f07066c

    .line 460
    .line 461
    .line 462
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 463
    .line 464
    .line 465
    move-result p0

    .line 466
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    return-object p0

    .line 471
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
