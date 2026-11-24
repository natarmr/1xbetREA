.class public final synthetic La/yw9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yw9;->a:B

    iput-object p1, p0, La/yw9;->b:Ljava/lang/Object;

    iput-object p2, p0, La/yw9;->c:Ljava/lang/Object;

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
    iget-byte v1, v0, La/yw9;->a:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v7, v0, La/yw9;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/yw9;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    check-cast v7, La/mie0;

    .line 20
    .line 21
    iget-object v1, v7, La/mie0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 30
    .line 31
    check-cast v7, La/gze;

    .line 32
    .line 33
    sget-object v1, La/gze;->S1:La/usd;

    .line 34
    .line 35
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->u()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7}, La/gze;->I0()La/qg20;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, La/qg20;->a0()V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_1
    check-cast v0, La/rye;

    .line 49
    .line 50
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 51
    .line 52
    sget-object v1, La/rye;->S1:La/kwd;

    .line 53
    .line 54
    invoke-virtual {v0}, La/rye;->G0()La/wre;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v1, v1, La/wre;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Landroid/view/View;->clearFocus()V

    .line 64
    .line 65
    .line 66
    invoke-static {v7}, La/j120;->X(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, La/rye;->H0()La/h620;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, v6}, La/h620;->D(Z)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_2
    check-cast v0, La/axe;

    .line 80
    .line 81
    check-cast v7, La/c4f;

    .line 82
    .line 83
    check-cast v7, La/k3f;

    .line 84
    .line 85
    iget-boolean v1, v7, La/k3f;->a:Z

    .line 86
    .line 87
    iget-boolean v4, v7, La/k3f;->b:Z

    .line 88
    .line 89
    iget-boolean v8, v7, La/k3f;->c:Z

    .line 90
    .line 91
    iget-boolean v7, v7, La/k3f;->d:Z

    .line 92
    .line 93
    sget-object v9, La/axe;->e2:La/kud;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    const-class v10, La/rre;

    .line 100
    .line 101
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v9, v10}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    if-nez v9, :cond_0

    .line 110
    .line 111
    sget-object v9, La/rre;->m2:La/nwd;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v9, La/rre;

    .line 117
    .line 118
    invoke-direct {v9}, La/rre;-><init>()V

    .line 119
    .line 120
    .line 121
    sget-object v10, La/rre;->n2:[La/iiy;

    .line 122
    .line 123
    aget-object v6, v10, v6

    .line 124
    .line 125
    iget-object v11, v9, La/rre;->g2:La/phf0;

    .line 126
    .line 127
    const-string v12, "COUPON_ACTION_REQUEST_KEY"

    .line 128
    .line 129
    invoke-virtual {v11, v9, v6, v12}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v6, v9, La/rre;->h2:La/cgx0;

    .line 133
    .line 134
    aget-object v5, v10, v5

    .line 135
    .line 136
    invoke-virtual {v6, v9, v5, v1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 137
    .line 138
    .line 139
    iget-object v1, v9, La/rre;->i2:La/cgx0;

    .line 140
    .line 141
    aget-object v3, v10, v3

    .line 142
    .line 143
    invoke-virtual {v1, v9, v3, v4}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 144
    .line 145
    .line 146
    const/4 v1, 0x3

    .line 147
    aget-object v1, v10, v1

    .line 148
    .line 149
    iget-object v3, v9, La/rre;->j2:La/cgx0;

    .line 150
    .line 151
    invoke-virtual {v3, v9, v1, v8}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 152
    .line 153
    .line 154
    iget-object v1, v9, La/rre;->k2:La/cgx0;

    .line 155
    .line 156
    aget-object v2, v10, v2

    .line 157
    .line 158
    invoke-virtual {v1, v9, v2, v7}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-static {v9, v0}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 169
    .line 170
    .line 171
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_3
    check-cast v0, La/axe;

    .line 175
    .line 176
    check-cast v7, La/pwq0;

    .line 177
    .line 178
    iget-object v1, v7, La/pwq0;->f:Ljava/util/List;

    .line 179
    .line 180
    sget-object v2, La/axe;->e2:La/kud;

    .line 181
    .line 182
    invoke-virtual {v0, v1}, La/axe;->N0(Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_4
    move-object v1, v0

    .line 189
    check-cast v1, La/axe;

    .line 190
    .line 191
    check-cast v7, Ljava/lang/String;

    .line 192
    .line 193
    sget-object v0, La/axe;->e2:La/kud;

    .line 194
    .line 195
    iget-object v2, v1, La/axe;->U1:La/wdk0;

    .line 196
    .line 197
    if-eqz v2, :cond_1

    .line 198
    .line 199
    const v0, 0x7f13053b

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    const v0, 0x7f080467

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const/4 v8, 0x0

    .line 217
    const/16 v9, 0x50

    .line 218
    .line 219
    const-string v3, ""

    .line 220
    .line 221
    const/4 v6, 0x0

    .line 222
    move-object v4, v7

    .line 223
    move-object v7, v0

    .line 224
    invoke-static/range {v1 .. v9}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 225
    .line 226
    .line 227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :cond_1
    const-string v0, "snackbarManager"

    .line 231
    .line 232
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v4

    .line 236
    :pswitch_5
    check-cast v0, La/axe;

    .line 237
    .line 238
    check-cast v7, Ljava/util/List;

    .line 239
    .line 240
    sget-object v1, La/axe;->e2:La/kud;

    .line 241
    .line 242
    invoke-virtual {v0, v7}, La/axe;->N0(Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_6
    check-cast v0, La/cp;

    .line 249
    .line 250
    check-cast v7, La/zre;

    .line 251
    .line 252
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 253
    .line 254
    check-cast v0, La/rcu0;

    .line 255
    .line 256
    iget-object v0, v0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 257
    .line 258
    invoke-virtual {v0, v7}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 259
    .line 260
    .line 261
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_7
    check-cast v0, La/cp;

    .line 265
    .line 266
    check-cast v7, La/a8z;

    .line 267
    .line 268
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 269
    .line 270
    check-cast v0, La/rcu0;

    .line 271
    .line 272
    iget-object v0, v0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 273
    .line 274
    new-instance v1, Lorg/xplatform/coupon/impl/coupon/presentation/common/LinearLayoutManagerWrapper;

    .line 275
    .line 276
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-direct {v1, v2}, Lorg/xplatform/coupon/impl/coupon/presentation/common/LinearLayoutManagerWrapper;-><init>(Landroid/content/Context;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, La/ase;

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setAdapter(La/ase;)V

    .line 296
    .line 297
    .line 298
    iget-object v0, v0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 299
    .line 300
    iget-object v0, v0, La/tbc;->g:Landroid/view/View;

    .line 301
    .line 302
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 303
    .line 304
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 305
    .line 306
    .line 307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 311
    .line 312
    sget-object v1, La/fee;->h:La/nwd;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    new-instance v1, La/fee;

    .line 318
    .line 319
    invoke-direct {v1, v7, v0}, La/fee;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    return-object v1

    .line 323
    :pswitch_9
    check-cast v0, La/vby;

    .line 324
    .line 325
    check-cast v7, Ljava/lang/String;

    .line 326
    .line 327
    sget-object v1, La/ksd;->Companion:La/jsd;

    .line 328
    .line 329
    invoke-virtual {v1}, La/jsd;->serializer()La/jiy;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, La/jiy;

    .line 334
    .line 335
    invoke-virtual {v0, v1, v7}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, La/ksd;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_a
    check-cast v0, La/rld;

    .line 343
    .line 344
    iget-object v0, v0, La/rld;->a:La/fet;

    .line 345
    .line 346
    iget-object v1, v0, La/fet;->c:La/q9k0;

    .line 347
    .line 348
    invoke-virtual {v1}, La/q9k0;->g()La/p9k0;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    move v5, v6

    .line 353
    :goto_0
    :try_start_0
    iget v8, v1, La/q9k0;->b:I

    .line 354
    .line 355
    if-ge v5, v8, :cond_b

    .line 356
    .line 357
    invoke-virtual {v3, v5}, La/p9k0;->l(I)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-eqz v8, :cond_5

    .line 362
    .line 363
    invoke-virtual {v3, v5}, La/p9k0;->n(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    if-eq v8, v7, :cond_4

    .line 368
    .line 369
    instance-of v9, v8, La/jet;

    .line 370
    .line 371
    if-eqz v9, :cond_2

    .line 372
    .line 373
    check-cast v8, La/jet;

    .line 374
    .line 375
    goto :goto_1

    .line 376
    :cond_2
    move-object v8, v4

    .line 377
    :goto_1
    if-eqz v8, :cond_3

    .line 378
    .line 379
    iget-object v8, v8, La/jet;->a:La/jff0;

    .line 380
    .line 381
    goto :goto_2

    .line 382
    :cond_3
    move-object v8, v4

    .line 383
    :goto_2
    if-ne v8, v7, :cond_5

    .line 384
    .line 385
    :cond_4
    new-instance v2, La/x960;

    .line 386
    .line 387
    invoke-direct {v2, v5, v4}, La/x960;-><init>(ILjava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3}, La/p9k0;->c()V

    .line 391
    .line 392
    .line 393
    move-object v4, v2

    .line 394
    goto :goto_8

    .line 395
    :catchall_0
    move-exception v0

    .line 396
    goto/16 :goto_a

    .line 397
    .line 398
    :cond_5
    :try_start_1
    iget-object v8, v3, La/p9k0;->b:[I

    .line 399
    .line 400
    invoke-static {v8, v5}, La/s9k0;->d([II)I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    add-int/lit8 v10, v5, 0x1

    .line 405
    .line 406
    iget v11, v3, La/p9k0;->c:I

    .line 407
    .line 408
    if-ge v10, v11, :cond_6

    .line 409
    .line 410
    mul-int/lit8 v11, v10, 0x5

    .line 411
    .line 412
    add-int/2addr v11, v2

    .line 413
    aget v8, v8, v11

    .line 414
    .line 415
    goto :goto_3

    .line 416
    :cond_6
    iget v8, v3, La/p9k0;->e:I

    .line 417
    .line 418
    :goto_3
    sub-int/2addr v8, v9

    .line 419
    move v9, v6

    .line 420
    :goto_4
    if-ge v9, v8, :cond_c

    .line 421
    .line 422
    invoke-virtual {v3, v5, v9}, La/p9k0;->h(II)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    if-eq v11, v7, :cond_a

    .line 427
    .line 428
    instance-of v12, v11, La/jet;

    .line 429
    .line 430
    if-eqz v12, :cond_7

    .line 431
    .line 432
    check-cast v11, La/jet;

    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_7
    move-object v11, v4

    .line 436
    :goto_5
    if-eqz v11, :cond_8

    .line 437
    .line 438
    iget-object v11, v11, La/jet;->a:La/jff0;

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_8
    move-object v11, v4

    .line 442
    :goto_6
    if-ne v11, v7, :cond_9

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_9
    add-int/lit8 v9, v9, 0x1

    .line 446
    .line 447
    goto :goto_4

    .line 448
    :cond_a
    :goto_7
    new-instance v4, La/x960;

    .line 449
    .line 450
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-direct {v4, v5, v2}, La/x960;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 455
    .line 456
    .line 457
    :cond_b
    invoke-virtual {v3}, La/p9k0;->c()V

    .line 458
    .line 459
    .line 460
    goto :goto_8

    .line 461
    :cond_c
    move v5, v10

    .line 462
    goto :goto_0

    .line 463
    :goto_8
    if-eqz v4, :cond_d

    .line 464
    .line 465
    iget v2, v4, La/x960;->a:I

    .line 466
    .line 467
    iget-object v3, v4, La/x960;->b:Ljava/lang/Integer;

    .line 468
    .line 469
    invoke-virtual {v1}, La/q9k0;->g()La/p9k0;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    :try_start_2
    invoke-static {v1, v2, v3}, La/aac;->i0(La/p9k0;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 474
    .line 475
    .line 476
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 477
    invoke-virtual {v1}, La/p9k0;->c()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0}, La/fet;->I()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    goto :goto_9

    .line 489
    :catchall_1
    move-exception v0

    .line 490
    invoke-virtual {v1}, La/p9k0;->c()V

    .line 491
    .line 492
    .line 493
    throw v0

    .line 494
    :cond_d
    sget-object v1, La/iun;->a:La/iun;

    .line 495
    .line 496
    :goto_9
    new-instance v2, La/ikd;

    .line 497
    .line 498
    iget-boolean v0, v0, La/fet;->C:Z

    .line 499
    .line 500
    invoke-direct {v2, v1, v0}, La/ikd;-><init>(Ljava/util/List;Z)V

    .line 501
    .line 502
    .line 503
    return-object v2

    .line 504
    :goto_a
    invoke-virtual {v3}, La/p9k0;->c()V

    .line 505
    .line 506
    .line 507
    throw v0

    .line 508
    :pswitch_b
    check-cast v0, La/nqp;

    .line 509
    .line 510
    check-cast v7, La/sgy;

    .line 511
    .line 512
    new-instance v1, Lkotlin/Pair;

    .line 513
    .line 514
    invoke-direct {v1, v0, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    return-object v0

    .line 522
    :pswitch_c
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 523
    .line 524
    check-cast v7, La/e2d;

    .line 525
    .line 526
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    check-cast v0, Ljava/lang/Boolean;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-eqz v0, :cond_e

    .line 537
    .line 538
    iget-object v0, v7, La/e2d;->a:La/oyq0;

    .line 539
    .line 540
    iget v0, v0, La/oyq0;->a:F

    .line 541
    .line 542
    const/4 v1, 0x0

    .line 543
    cmpg-float v0, v0, v1

    .line 544
    .line 545
    if-nez v0, :cond_f

    .line 546
    .line 547
    :cond_e
    move v5, v6

    .line 548
    :cond_f
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    return-object v0

    .line 553
    :pswitch_d
    check-cast v0, La/uzc;

    .line 554
    .line 555
    check-cast v7, La/qzc;

    .line 556
    .line 557
    iget-object v0, v0, La/uzc;->a:La/q7d0;

    .line 558
    .line 559
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-interface {v0, v7}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 564
    .line 565
    .line 566
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    return-object v0

    .line 569
    :pswitch_e
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 570
    .line 571
    check-cast v7, La/fq8;

    .line 572
    .line 573
    new-instance v1, La/g74;

    .line 574
    .line 575
    iget-object v2, v7, La/fq8;->a:La/ao4;

    .line 576
    .line 577
    iget-boolean v3, v2, La/ao4;->c:Z

    .line 578
    .line 579
    iget-object v2, v2, La/ao4;->a:Ljava/lang/String;

    .line 580
    .line 581
    invoke-direct {v1, v2, v3}, La/g74;-><init>(Ljava/lang/String;Z)V

    .line 582
    .line 583
    .line 584
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_f
    check-cast v0, La/ntt;

    .line 591
    .line 592
    check-cast v7, La/oif0;

    .line 593
    .line 594
    new-instance v1, La/jic;

    .line 595
    .line 596
    invoke-virtual {v0}, La/ntt;->a()Ljava/util/ArrayList;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v7}, La/oif0;->u()J

    .line 601
    .line 602
    .line 603
    move-result-wide v2

    .line 604
    invoke-direct {v1, v2, v3, v0}, La/jic;-><init>(JLjava/util/ArrayList;)V

    .line 605
    .line 606
    .line 607
    return-object v1

    .line 608
    :pswitch_10
    check-cast v0, La/z9c;

    .line 609
    .line 610
    check-cast v7, La/cym0;

    .line 611
    .line 612
    new-instance v1, La/fy2;

    .line 613
    .line 614
    const/16 v2, 0x18

    .line 615
    .line 616
    invoke-direct {v1, v0, v7, v2}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 617
    .line 618
    .line 619
    const-wide/16 v2, 0x12c

    .line 620
    .line 621
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_11
    check-cast v0, La/l5c;

    .line 628
    .line 629
    check-cast v7, La/m6c;

    .line 630
    .line 631
    sget-object v1, La/l5c;->W1:La/kl5;

    .line 632
    .line 633
    invoke-virtual {v0}, La/l5c;->I0()La/v7c;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    check-cast v7, La/l6c;

    .line 638
    .line 639
    sget-object v1, La/j6c;->a:La/j6c;

    .line 640
    .line 641
    sget-object v1, La/vm4;->c:La/vm4;

    .line 642
    .line 643
    sget-object v2, La/q64;->c:La/q64;

    .line 644
    .line 645
    invoke-virtual {v0, v1, v2}, La/v7c;->H(La/vm4;La/q64;)V

    .line 646
    .line 647
    .line 648
    sget-object v1, La/j7c;->b:[I

    .line 649
    .line 650
    aget v1, v1, v6

    .line 651
    .line 652
    if-ne v1, v5, :cond_10

    .line 653
    .line 654
    iget-object v1, v0, La/v7c;->c:La/i1w0;

    .line 655
    .line 656
    new-instance v2, La/f6c;

    .line 657
    .line 658
    invoke-direct {v2, v0, v3}, La/f6c;-><init>(La/v7c;B)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 662
    .line 663
    .line 664
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 665
    .line 666
    goto :goto_b

    .line 667
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 668
    .line 669
    .line 670
    :goto_b
    return-object v4

    .line 671
    :pswitch_12
    check-cast v0, La/zsb;

    .line 672
    .line 673
    check-cast v7, La/fnb0;

    .line 674
    .line 675
    sget-object v1, La/zsb;->n2:La/yk5;

    .line 676
    .line 677
    invoke-virtual {v0}, La/zsb;->P0()La/k3t0;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    new-instance v1, La/ssb;

    .line 682
    .line 683
    iget-object v2, v7, La/fnb0;->a:La/mcy;

    .line 684
    .line 685
    invoke-direct {v1, v2}, La/ssb;-><init>(La/mcy;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_13
    check-cast v0, La/rqb;

    .line 695
    .line 696
    check-cast v7, La/azq;

    .line 697
    .line 698
    sget-object v1, La/rqb;->U1:La/bj5;

    .line 699
    .line 700
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 701
    .line 702
    .line 703
    iget-object v1, v7, La/azq;->g:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 704
    .line 705
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->clearFocus()V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v0}, La/rqb;->H0()La/hrb;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getCode()Ljava/lang/CharSequence;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    iget-object v1, v4, La/hrb;->x:La/p7m0;

    .line 721
    .line 722
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    check-cast v1, La/frb;

    .line 727
    .line 728
    iget-object v1, v1, La/frb;->d:Ljava/lang/String;

    .line 729
    .line 730
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 731
    .line 732
    .line 733
    move-result v2

    .line 734
    if-eqz v2, :cond_11

    .line 735
    .line 736
    goto :goto_c

    .line 737
    :cond_11
    iget-boolean v2, v4, La/hrb;->E:Z

    .line 738
    .line 739
    if-nez v2, :cond_12

    .line 740
    .line 741
    iget-object v0, v4, La/hrb;->z:La/ol60;

    .line 742
    .line 743
    sget-object v1, La/zqb;->a:La/zqb;

    .line 744
    .line 745
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    goto :goto_c

    .line 749
    :cond_12
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 750
    .line 751
    .line 752
    move-result-object v10

    .line 753
    new-instance v2, La/zhb;

    .line 754
    .line 755
    const/4 v8, 0x0

    .line 756
    const/16 v9, 0x8

    .line 757
    .line 758
    const/4 v3, 0x1

    .line 759
    const-class v5, La/hrb;

    .line 760
    .line 761
    const-string v6, "handleError"

    .line 762
    .line 763
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 764
    .line 765
    invoke-direct/range {v2 .. v9}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 766
    .line 767
    .line 768
    move-object v8, v2

    .line 769
    iget-object v2, v4, La/hrb;->c:La/mne;

    .line 770
    .line 771
    iget-object v9, v2, La/mne;->b:La/dvj;

    .line 772
    .line 773
    new-instance v2, La/xb2;

    .line 774
    .line 775
    const/16 v7, 0xa

    .line 776
    .line 777
    const/4 v6, 0x0

    .line 778
    move-object v5, v0

    .line 779
    move-object v3, v1

    .line 780
    invoke-direct/range {v2 .. v7}, La/xb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 781
    .line 782
    .line 783
    invoke-static {v10, v8, v6, v9, v2}, La/sac;->R(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 784
    .line 785
    .line 786
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 787
    .line 788
    return-object v0

    .line 789
    :pswitch_14
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 790
    .line 791
    check-cast v7, La/pjb;

    .line 792
    .line 793
    new-instance v1, La/hkb0;

    .line 794
    .line 795
    iget-wide v2, v7, La/pjb;->a:J

    .line 796
    .line 797
    invoke-direct {v1, v2, v3}, La/hkb0;-><init>(J)V

    .line 798
    .line 799
    .line 800
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 804
    .line 805
    return-object v0

    .line 806
    :pswitch_15
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 807
    .line 808
    check-cast v7, La/ikb;

    .line 809
    .line 810
    new-instance v1, La/jjb;

    .line 811
    .line 812
    iget-object v2, v7, La/ikb;->a:Ljava/lang/String;

    .line 813
    .line 814
    invoke-direct {v1, v2}, La/jjb;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 821
    .line 822
    return-object v0

    .line 823
    :pswitch_16
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 824
    .line 825
    check-cast v7, La/akb;

    .line 826
    .line 827
    new-instance v1, La/jjb;

    .line 828
    .line 829
    iget-object v2, v7, La/akb;->a:Ljava/lang/String;

    .line 830
    .line 831
    invoke-direct {v1, v2}, La/jjb;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 838
    .line 839
    return-object v0

    .line 840
    :pswitch_17
    check-cast v0, La/pz40;

    .line 841
    .line 842
    check-cast v7, La/axa;

    .line 843
    .line 844
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 849
    .line 850
    iget-object v1, v7, La/axa;->a:La/y0b;

    .line 851
    .line 852
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 856
    .line 857
    return-object v0

    .line 858
    :pswitch_18
    check-cast v0, La/svu;

    .line 859
    .line 860
    check-cast v7, La/vzg0;

    .line 861
    .line 862
    new-instance v8, La/gsa;

    .line 863
    .line 864
    sget-object v13, La/iun;->a:La/iun;

    .line 865
    .line 866
    new-instance v1, La/ysa;

    .line 867
    .line 868
    new-instance v2, La/zpv;

    .line 869
    .line 870
    invoke-direct {v2, v6, v6}, La/zpv;-><init>(ZZ)V

    .line 871
    .line 872
    .line 873
    invoke-direct {v1, v2}, La/ysa;-><init>(La/zpv;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0}, La/svu;->l()Z

    .line 877
    .line 878
    .line 879
    move-result v17

    .line 880
    const-string v0, "SEARCH_QUERY_KEY"

    .line 881
    .line 882
    invoke-virtual {v7, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    check-cast v0, Ljava/lang/String;

    .line 887
    .line 888
    if-nez v0, :cond_13

    .line 889
    .line 890
    const-string v0, ""

    .line 891
    .line 892
    :cond_13
    move-object/from16 v20, v0

    .line 893
    .line 894
    const/4 v9, 0x0

    .line 895
    sget-object v10, La/hm5;->a:La/hm5;

    .line 896
    .line 897
    const/4 v11, 0x1

    .line 898
    const/4 v12, 0x0

    .line 899
    const/4 v14, 0x0

    .line 900
    const/4 v15, 0x0

    .line 901
    const/16 v18, 0x0

    .line 902
    .line 903
    const/16 v19, 0x0

    .line 904
    .line 905
    move-object/from16 v16, v1

    .line 906
    .line 907
    invoke-direct/range {v8 .. v20}, La/gsa;-><init>(La/rra;La/om5;ZZLjava/util/List;IILa/dta;ZZZLjava/lang/String;)V

    .line 908
    .line 909
    .line 910
    return-object v8

    .line 911
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 912
    .line 913
    check-cast v7, La/ara;

    .line 914
    .line 915
    check-cast v7, La/yqa;

    .line 916
    .line 917
    sget-object v1, La/dja;->g:La/dja;

    .line 918
    .line 919
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 923
    .line 924
    return-object v0

    .line 925
    :pswitch_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 926
    .line 927
    check-cast v7, La/soa;

    .line 928
    .line 929
    check-cast v7, La/qoa;

    .line 930
    .line 931
    sget-object v1, La/dja;->f:La/dja;

    .line 932
    .line 933
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 937
    .line 938
    return-object v0

    .line 939
    :pswitch_1b
    check-cast v0, La/cpv0;

    .line 940
    .line 941
    check-cast v7, Ljava/util/UUID;

    .line 942
    .line 943
    iget-object v1, v0, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 944
    .line 945
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    new-instance v2, La/fy2;

    .line 949
    .line 950
    const/16 v3, 0x15

    .line 951
    .line 952
    invoke-direct {v2, v0, v7, v3}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1, v2}, La/aeg0;->p(Ljava/lang/Runnable;)V

    .line 956
    .line 957
    .line 958
    iget-object v2, v0, La/cpv0;->b:La/wsd;

    .line 959
    .line 960
    iget-object v0, v0, La/cpv0;->e:Ljava/util/List;

    .line 961
    .line 962
    invoke-static {v2, v1, v0}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 963
    .line 964
    .line 965
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 966
    .line 967
    return-object v0

    .line 968
    :pswitch_1c
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 969
    .line 970
    check-cast v7, La/pw9;

    .line 971
    .line 972
    invoke-virtual {v0, v7}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 973
    .line 974
    .line 975
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 976
    .line 977
    return-object v0

    .line 978
    nop

    .line 979
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
