.class public final synthetic La/edl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/s6q0;La/agk0;La/cgk0;)V
    .locals 0

    .line 1
    const/16 p2, 0x19

    iput-byte p2, p0, La/edl;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/edl;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/edl;->a:B

    iput-object p1, p0, La/edl;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/edl;->a:B

    .line 2
    .line 3
    const v1, 0x7f0706c1

    .line 4
    .line 5
    .line 6
    const/4 v2, -0x2

    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x6

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x1

    .line 13
    iget-object p0, p0, La/edl;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;

    .line 19
    .line 20
    check-cast p1, Landroid/view/View;

    .line 21
    .line 22
    sget v0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;->u:I

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p1, La/sab;

    .line 28
    .line 29
    iget v0, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;->n:I

    .line 30
    .line 31
    invoke-virtual {p1}, La/sab;->getRow()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    iget-boolean v0, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;->h:Z

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;->a:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    invoke-virtual {p1}, La/sab;->getColumn()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object v0, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;->i:Landroid/util/SparseArray;

    .line 64
    .line 65
    invoke-virtual {p1}, La/sab;->getRow()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/util/List;

    .line 74
    .line 75
    invoke-virtual {p1}, La/sab;->getColumn()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    sub-int/2addr v1, v8

    .line 80
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/sab;

    .line 85
    .line 86
    const v1, 0x7f0804c8

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v0}, La/sab;->u(ILa/sab;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsGameView;->r:La/sab;

    .line 93
    .line 94
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_0
    check-cast p0, La/uhn;

    .line 98
    .line 99
    check-cast p1, Landroid/view/View;

    .line 100
    .line 101
    sget v0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->u:I

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, La/uhn;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_1
    move-object v0, p0

    .line 113
    check-cast v0, La/sdn;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Throwable;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_3

    .line 125
    .line 126
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, La/cdn;

    .line 131
    .line 132
    iget-object p0, p0, La/cdn;->b:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-eqz p0, :cond_1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_1
    iget-object p0, v0, La/sdn;->A:La/bby;

    .line 142
    .line 143
    if-eqz p0, :cond_2

    .line 144
    .line 145
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-ne p0, v8, :cond_2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object p0, v0, La/sdn;->p:La/mne;

    .line 157
    .line 158
    iget-object v4, p0, La/mne;->a:La/rwj;

    .line 159
    .line 160
    new-instance v5, La/ldn;

    .line 161
    .line 162
    invoke-direct {v5, v0, v7, v8}, La/ldn;-><init>(La/sdn;La/yje;B)V

    .line 163
    .line 164
    .line 165
    const/16 v6, 0xb

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    const/4 v3, 0x0

    .line 169
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    iput-object p0, v0, La/sdn;->A:La/bby;

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_3
    :goto_0
    iget-object p0, v0, La/sdn;->A:La/bby;

    .line 177
    .line 178
    if-eqz p0, :cond_4

    .line 179
    .line 180
    invoke-interface {p0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 181
    .line 182
    .line 183
    :cond_4
    iput-object v7, v0, La/sdn;->A:La/bby;

    .line 184
    .line 185
    iget-object p0, v0, La/sdn;->w:La/owp0;

    .line 186
    .line 187
    sget-object p1, La/idf0;->a:La/idf0;

    .line 188
    .line 189
    invoke-virtual {p0, p1}, La/owp0;->g(La/ldf0;)V

    .line 190
    .line 191
    .line 192
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 193
    .line 194
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 195
    .line 196
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object p1, v0, La/i3t0;->f:La/oyg0;

    .line 204
    .line 205
    move-object v2, p0

    .line 206
    check-cast v2, La/cdn;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    sget-object v4, La/iun;->a:La/iun;

    .line 212
    .line 213
    const/4 v8, 0x0

    .line 214
    const/16 v9, 0xed

    .line 215
    .line 216
    const/4 v3, 0x0

    .line 217
    const/4 v5, 0x0

    .line 218
    const/4 v6, 0x0

    .line 219
    const/4 v7, 0x0

    .line 220
    invoke-static/range {v2 .. v9}, La/cdn;->a(La/cdn;Ljava/util/List;Ljava/util/List;La/l9s;ZLa/xfa0;La/aw20;I)La/cdn;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {v1, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-eqz p0, :cond_5

    .line 229
    .line 230
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_2
    check-cast p0, La/d9n;

    .line 234
    .line 235
    check-cast p1, La/bff0;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, La/bff0;->a()F

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    cmpl-float p1, p1, v4

    .line 245
    .line 246
    if-lez p1, :cond_6

    .line 247
    .line 248
    iput-boolean v8, p0, La/d9n;->s:Z

    .line 249
    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 251
    .line 252
    .line 253
    move-result-wide v0

    .line 254
    iput-wide v0, p0, La/d9n;->t:J

    .line 255
    .line 256
    invoke-virtual {p0}, La/d9n;->Z0()V

    .line 257
    .line 258
    .line 259
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object p0

    .line 262
    :pswitch_3
    check-cast p0, La/s6q0;

    .line 263
    .line 264
    check-cast p1, La/a9q0;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_4
    check-cast p0, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 276
    .line 277
    check-cast p1, Landroid/content/res/TypedArray;

    .line 278
    .line 279
    sget v0, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-nez v0, :cond_7

    .line 289
    .line 290
    invoke-virtual {p1, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :cond_7
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x5

    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {p1, v0}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-eqz v0, :cond_9

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    instance-of v2, v1, Landroid/graphics/drawable/GradientDrawable;

    .line 317
    .line 318
    if-eqz v2, :cond_8

    .line 319
    .line 320
    move-object v7, v1

    .line 321
    check-cast v7, Landroid/graphics/drawable/GradientDrawable;

    .line 322
    .line 323
    :cond_8
    if-eqz v7, :cond_9

    .line 324
    .line 325
    invoke-virtual {v7}, Landroid/graphics/drawable/GradientDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    const v2, 0x7f070633

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    invoke-virtual {v7, v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 340
    .line 341
    .line 342
    :cond_9
    const/4 v0, 0x2

    .line 343
    invoke-virtual {p1, v0, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    invoke-virtual {p1, v3, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, v8, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 367
    .line 368
    .line 369
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object p0

    .line 372
    :pswitch_5
    check-cast p0, La/d280;

    .line 373
    .line 374
    check-cast p1, La/abi0;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    new-instance v0, La/m0x;

    .line 380
    .line 381
    check-cast p0, La/b280;

    .line 382
    .line 383
    iget p0, p0, La/b280;->a:I

    .line 384
    .line 385
    invoke-direct {v0, p0, v7, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 386
    .line 387
    .line 388
    invoke-static {p1, v0}, La/cbi0;->b(La/abi0;La/o0x;)V

    .line 389
    .line 390
    .line 391
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_6
    check-cast p0, La/brm;

    .line 395
    .line 396
    check-cast p1, La/bff0;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1}, La/bff0;->a()F

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    cmpl-float p1, p1, v4

    .line 406
    .line 407
    if-lez p1, :cond_a

    .line 408
    .line 409
    move v6, v8

    .line 410
    :cond_a
    iget-boolean p1, p0, La/brm;->r:Z

    .line 411
    .line 412
    if-eq v6, p1, :cond_d

    .line 413
    .line 414
    iput-boolean v6, p0, La/brm;->r:Z

    .line 415
    .line 416
    if-eqz v6, :cond_b

    .line 417
    .line 418
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 419
    .line 420
    .line 421
    move-result-wide v0

    .line 422
    iput-wide v0, p0, La/brm;->s:J

    .line 423
    .line 424
    invoke-virtual {p0}, La/brm;->Z0()V

    .line 425
    .line 426
    .line 427
    goto :goto_2

    .line 428
    :cond_b
    iget-object p1, p0, La/brm;->q:La/c4m0;

    .line 429
    .line 430
    if-eqz p1, :cond_c

    .line 431
    .line 432
    invoke-virtual {p1, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 433
    .line 434
    .line 435
    :cond_c
    iput-object v7, p0, La/brm;->q:La/c4m0;

    .line 436
    .line 437
    :cond_d
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object p0

    .line 440
    :pswitch_7
    check-cast p0, La/uii;

    .line 441
    .line 442
    check-cast p1, Ljava/lang/Integer;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    iget-object p0, p0, La/uii;->b:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 451
    .line 452
    invoke-virtual {p0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 453
    .line 454
    .line 455
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object p0

    .line 458
    :pswitch_8
    check-cast p0, La/wom;

    .line 459
    .line 460
    check-cast p1, La/uag0;

    .line 461
    .line 462
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0}, La/wom;->c()F

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    cmpl-float v0, v0, v4

    .line 470
    .line 471
    if-gtz v0, :cond_e

    .line 472
    .line 473
    iget-object p0, p0, La/wom;->c:La/pz40;

    .line 474
    .line 475
    check-cast p0, La/hgk0;

    .line 476
    .line 477
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    check-cast p0, Ljava/lang/Boolean;

    .line 482
    .line 483
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 484
    .line 485
    .line 486
    move-result p0

    .line 487
    if-eqz p0, :cond_f

    .line 488
    .line 489
    :cond_e
    const/high16 v4, 0x3f800000    # 1.0f

    .line 490
    .line 491
    :cond_f
    invoke-virtual {p1, v4}, La/uag0;->b(F)V

    .line 492
    .line 493
    .line 494
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object p0

    .line 497
    :pswitch_9
    check-cast p0, La/j240;

    .line 498
    .line 499
    check-cast p1, Landroid/content/Context;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    new-instance v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 505
    .line 506
    invoke-direct {v0, p1, v7, v5}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 507
    .line 508
    .line 509
    iget-object v3, p0, La/j240;->b:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    iget-object p0, p0, La/j240;->a:La/dfm0;

    .line 515
    .line 516
    invoke-interface {p0}, La/dfm0;->a()I

    .line 517
    .line 518
    .line 519
    move-result p0

    .line 520
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setEnabled(Z)V

    .line 524
    .line 525
    .line 526
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 527
    .line 528
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 533
    .line 534
    .line 535
    move-result p1

    .line 536
    invoke-direct {p0, v2, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 540
    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_a
    check-cast p0, La/nz30;

    .line 544
    .line 545
    check-cast p1, Landroid/content/Context;

    .line 546
    .line 547
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 551
    .line 552
    invoke-direct {v0, p1, v7, v5}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 553
    .line 554
    .line 555
    iget-object v3, p0, La/nz30;->a:Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    iget-object p0, p0, La/nz30;->b:La/cz10;

    .line 561
    .line 562
    iget p0, p0, La/cz10;->a:I

    .line 563
    .line 564
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setEnabled(Z)V

    .line 568
    .line 569
    .line 570
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 571
    .line 572
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 577
    .line 578
    .line 579
    move-result p1

    .line 580
    invoke-direct {p0, v2, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 584
    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_b
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 588
    .line 589
    check-cast p1, Ljava/lang/Throwable;

    .line 590
    .line 591
    iput-object v7, p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->m:La/hsj;

    .line 592
    .line 593
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 594
    .line 595
    return-object p0

    .line 596
    :pswitch_c
    check-cast p0, La/l7m;

    .line 597
    .line 598
    check-cast p1, La/hcz;

    .line 599
    .line 600
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    iget-object v0, p0, La/l7m;->d:La/a4x;

    .line 604
    .line 605
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    new-instance v2, La/v2m;

    .line 610
    .line 611
    invoke-direct {v2, v0, v3}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 612
    .line 613
    .line 614
    new-instance v3, La/xe4;

    .line 615
    .line 616
    const/4 v4, 0x4

    .line 617
    invoke-direct {v3, v0, p0, v4}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 618
    .line 619
    .line 620
    new-instance p0, La/ugd;

    .line 621
    .line 622
    const v0, 0x799532c4

    .line 623
    .line 624
    .line 625
    invoke-direct {p0, v0, v8, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {p1, v1, v7, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 629
    .line 630
    .line 631
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object p0

    .line 634
    :pswitch_d
    check-cast p0, La/g4m;

    .line 635
    .line 636
    check-cast p1, La/hcz;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-object p0, p0, La/g4m;->a:La/a4x;

    .line 642
    .line 643
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    new-instance v1, La/v2m;

    .line 648
    .line 649
    invoke-direct {v1, p0, v8}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 650
    .line 651
    .line 652
    new-instance v2, La/xy1;

    .line 653
    .line 654
    const/4 v3, 0x7

    .line 655
    invoke-direct {v2, p0, v3}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 656
    .line 657
    .line 658
    new-instance p0, La/ugd;

    .line 659
    .line 660
    const v3, 0x2fd4df92

    .line 661
    .line 662
    .line 663
    invoke-direct {p0, v3, v8, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {p1, v0, v7, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 667
    .line 668
    .line 669
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 670
    .line 671
    return-object p0

    .line 672
    :pswitch_e
    check-cast p0, La/y2m;

    .line 673
    .line 674
    check-cast p1, La/abi0;

    .line 675
    .line 676
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    iget-object p0, p0, La/y2m;->c:La/n0x;

    .line 680
    .line 681
    invoke-virtual {p0}, La/n0x;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object p0

    .line 685
    invoke-static {p1, p0}, La/cbi0;->e(La/abi0;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 689
    .line 690
    return-object p0

    .line 691
    :pswitch_f
    check-cast p0, La/j0m;

    .line 692
    .line 693
    check-cast p1, La/abi0;

    .line 694
    .line 695
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    sget-object v0, La/cbi0;->b:La/zai0;

    .line 699
    .line 700
    iget p0, p0, La/j0m;->e:I

    .line 701
    .line 702
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 710
    .line 711
    return-object p0

    .line 712
    :pswitch_10
    check-cast p0, La/bzl;

    .line 713
    .line 714
    check-cast p1, Ljava/lang/Float;

    .line 715
    .line 716
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 717
    .line 718
    .line 719
    move-result p1

    .line 720
    iget-object p0, p0, La/bzl;->a:La/oyq0;

    .line 721
    .line 722
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 723
    .line 724
    invoke-virtual {v0}, La/agk0;->l()F

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    add-float/2addr v0, p1

    .line 729
    invoke-virtual {p0, v0}, La/oyq0;->c(F)V

    .line 730
    .line 731
    .line 732
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 733
    .line 734
    return-object p0

    .line 735
    :pswitch_11
    check-cast p0, La/lyl;

    .line 736
    .line 737
    check-cast p1, Ljava/lang/Integer;

    .line 738
    .line 739
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 740
    .line 741
    .line 742
    move-result p1

    .line 743
    new-instance v0, La/n23;

    .line 744
    .line 745
    invoke-direct {v0, p0, p1, v5}, La/n23;-><init>(Ljava/lang/Object;IB)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 749
    .line 750
    .line 751
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    return-object p0

    .line 754
    :pswitch_12
    check-cast p0, La/wxl;

    .line 755
    .line 756
    check-cast p1, Landroid/content/Context;

    .line 757
    .line 758
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    new-instance v0, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 762
    .line 763
    invoke-direct {v0, p1, v7}, Lorg/xplatform/uikit/components/chips/DsChip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/chips/DsChip;->setStyle(La/wxl;)V

    .line 767
    .line 768
    .line 769
    return-object v0

    .line 770
    :pswitch_13
    check-cast p0, La/rll;

    .line 771
    .line 772
    check-cast p1, Ljava/lang/Integer;

    .line 773
    .line 774
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 775
    .line 776
    .line 777
    move-result v0

    .line 778
    iget-object p0, p0, La/rll;->b:La/a4x;

    .line 779
    .line 780
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object p0

    .line 784
    check-cast p0, La/hll;

    .line 785
    .line 786
    if-eqz p0, :cond_10

    .line 787
    .line 788
    iget-wide v0, p0, La/hll;->a:J

    .line 789
    .line 790
    goto :goto_3

    .line 791
    :cond_10
    const-wide/16 v0, -0x1

    .line 792
    .line 793
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 794
    .line 795
    .line 796
    move-result-object p0

    .line 797
    new-instance v0, Lkotlin/Pair;

    .line 798
    .line 799
    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    return-object v0

    .line 803
    :pswitch_14
    check-cast p0, La/cll;

    .line 804
    .line 805
    check-cast p1, La/abi0;

    .line 806
    .line 807
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    iget-object p0, p0, La/cll;->b:La/n0x;

    .line 811
    .line 812
    invoke-interface {p0}, La/o0x;->a()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    invoke-static {p1, p0}, La/cbi0;->e(La/abi0;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 824
    .line 825
    return-object p0

    .line 826
    :pswitch_15
    check-cast p0, La/fkl;

    .line 827
    .line 828
    check-cast p1, La/abi0;

    .line 829
    .line 830
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    iget-object p0, p0, La/fkl;->b:La/o0x;

    .line 834
    .line 835
    instance-of v0, p0, La/n0x;

    .line 836
    .line 837
    if-eqz v0, :cond_11

    .line 838
    .line 839
    check-cast p0, La/n0x;

    .line 840
    .line 841
    goto :goto_4

    .line 842
    :cond_11
    move-object p0, v7

    .line 843
    :goto_4
    if-eqz p0, :cond_12

    .line 844
    .line 845
    iget-object v7, p0, La/n0x;->a:Ljava/lang/String;

    .line 846
    .line 847
    :cond_12
    if-nez v7, :cond_13

    .line 848
    .line 849
    const-string v7, ""

    .line 850
    .line 851
    :cond_13
    sget-object p0, La/cbi0;->n:La/zai0;

    .line 852
    .line 853
    sget-object v0, La/cbi0;->a:[La/iiy;

    .line 854
    .line 855
    const/16 v1, 0xb

    .line 856
    .line 857
    aget-object v0, v0, v1

    .line 858
    .line 859
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    invoke-interface {p1, p0, v7}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 866
    .line 867
    return-object p0

    .line 868
    :pswitch_16
    check-cast p0, La/bkl;

    .line 869
    .line 870
    check-cast p1, La/abi0;

    .line 871
    .line 872
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    iget-object p0, p0, La/bkl;->b:La/n0x;

    .line 876
    .line 877
    invoke-interface {p0}, La/o0x;->a()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object p0

    .line 881
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object p0

    .line 885
    invoke-static {p1, p0}, La/cbi0;->e(La/abi0;Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 889
    .line 890
    return-object p0

    .line 891
    :pswitch_17
    check-cast p0, La/cgl;

    .line 892
    .line 893
    check-cast p1, Ljava/lang/Throwable;

    .line 894
    .line 895
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    iget-object v1, p0, La/cgl;->f:La/mne;

    .line 903
    .line 904
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 905
    .line 906
    sget-object v1, La/tfl;->a:La/tfl;

    .line 907
    .line 908
    new-instance v4, La/ufl;

    .line 909
    .line 910
    invoke-direct {v4, p0, v7, v6}, La/ufl;-><init>(La/cgl;La/yje;B)V

    .line 911
    .line 912
    .line 913
    const/16 v5, 0xa

    .line 914
    .line 915
    const/4 v2, 0x0

    .line 916
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 917
    .line 918
    .line 919
    new-instance v0, La/xy5;

    .line 920
    .line 921
    invoke-direct {v0, v6}, La/xy5;-><init>(Z)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {p0, v0}, La/cgl;->w(La/zy5;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {p0, p1}, La/cgl;->C(Ljava/lang/Throwable;)V

    .line 928
    .line 929
    .line 930
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 931
    .line 932
    return-object p0

    .line 933
    :pswitch_18
    check-cast p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;

    .line 934
    .line 935
    check-cast p1, Landroid/view/View;

    .line 936
    .line 937
    sget v0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->u:I

    .line 938
    .line 939
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    check-cast p1, La/sab;

    .line 943
    .line 944
    iget v0, p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->n:I

    .line 945
    .line 946
    invoke-virtual {p1}, La/sab;->getRow()I

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    if-ne v0, v1, :cond_14

    .line 951
    .line 952
    iget-boolean v0, p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->h:Z

    .line 953
    .line 954
    if-eqz v0, :cond_14

    .line 955
    .line 956
    iget-object v0, p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->a:Lkotlin/jvm/functions/Function1;

    .line 957
    .line 958
    invoke-virtual {p1}, La/sab;->getColumn()I

    .line 959
    .line 960
    .line 961
    move-result v1

    .line 962
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    check-cast v0, Ljava/lang/Boolean;

    .line 971
    .line 972
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    if-eqz v0, :cond_14

    .line 977
    .line 978
    iget-object v0, p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->i:Landroid/util/SparseArray;

    .line 979
    .line 980
    invoke-virtual {p1}, La/sab;->getRow()I

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    check-cast v0, Ljava/util/List;

    .line 989
    .line 990
    invoke-virtual {p1}, La/sab;->getColumn()I

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    sub-int/2addr v1, v8

    .line 995
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    check-cast v0, La/sab;

    .line 1000
    .line 1001
    const v1, 0x7f0804bf

    .line 1002
    .line 1003
    .line 1004
    invoke-static {v1, v0}, La/sab;->u(ILa/sab;)V

    .line 1005
    .line 1006
    .line 1007
    iput-object p1, p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->r:La/sab;

    .line 1008
    .line 1009
    :cond_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1010
    .line 1011
    return-object p0

    .line 1012
    :pswitch_19
    check-cast p0, La/mfl;

    .line 1013
    .line 1014
    check-cast p1, Landroid/view/View;

    .line 1015
    .line 1016
    sget v0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->u:I

    .line 1017
    .line 1018
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {p0}, La/mfl;->invoke()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1025
    .line 1026
    return-object p0

    .line 1027
    :pswitch_1a
    check-cast p0, La/cel;

    .line 1028
    .line 1029
    check-cast p1, La/zlt;

    .line 1030
    .line 1031
    instance-of v0, p1, La/tel;

    .line 1032
    .line 1033
    if-eqz v0, :cond_15

    .line 1034
    .line 1035
    invoke-virtual {p0, p1}, La/cel;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object p0

    .line 1039
    check-cast p0, Ljava/lang/Boolean;

    .line 1040
    .line 1041
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1042
    .line 1043
    .line 1044
    move-result v8

    .line 1045
    :cond_15
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1046
    .line 1047
    .line 1048
    move-result-object p0

    .line 1049
    return-object p0

    .line 1050
    :pswitch_1b
    check-cast p0, La/g2z;

    .line 1051
    .line 1052
    check-cast p1, La/dpa0;

    .line 1053
    .line 1054
    invoke-static {p1, v6}, La/x2x;->j0(La/dpa0;Z)J

    .line 1055
    .line 1056
    .line 1057
    move-result-wide v0

    .line 1058
    const-wide v2, 0xffffffffL

    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    and-long/2addr v0, v2

    .line 1064
    long-to-int v0, v0

    .line 1065
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-virtual {p0, p1, v0}, La/g2z;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 1077
    .line 1078
    .line 1079
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1080
    .line 1081
    return-object p0

    .line 1082
    :pswitch_1c
    check-cast p0, La/a1d;

    .line 1083
    .line 1084
    check-cast p1, La/gdl;

    .line 1085
    .line 1086
    iget-object v0, p1, La/lm40;->a:La/lm40;

    .line 1087
    .line 1088
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 1089
    .line 1090
    if-nez v0, :cond_16

    .line 1091
    .line 1092
    sget-object p0, La/gps0;->b:La/gps0;

    .line 1093
    .line 1094
    goto :goto_6

    .line 1095
    :cond_16
    iget-object v0, p1, La/gdl;->p:La/gdl;

    .line 1096
    .line 1097
    if-eqz v0, :cond_18

    .line 1098
    .line 1099
    new-instance v1, La/edl;

    .line 1100
    .line 1101
    invoke-direct {v1, p0, v6}, La/edl;-><init>(Ljava/lang/Object;B)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v1, v0}, La/edl;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object p0

    .line 1108
    sget-object v2, La/gps0;->a:La/gps0;

    .line 1109
    .line 1110
    if-eq p0, v2, :cond_17

    .line 1111
    .line 1112
    goto :goto_5

    .line 1113
    :cond_17
    invoke-static {v0, v1}, La/etm0;->w(La/hps0;Lkotlin/jvm/functions/Function1;)V

    .line 1114
    .line 1115
    .line 1116
    :cond_18
    :goto_5
    iput-object v7, p1, La/gdl;->p:La/gdl;

    .line 1117
    .line 1118
    iput-object v7, p1, La/gdl;->o:La/gdl;

    .line 1119
    .line 1120
    sget-object p0, La/gps0;->a:La/gps0;

    .line 1121
    .line 1122
    :goto_6
    return-object p0

    .line 1123
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
