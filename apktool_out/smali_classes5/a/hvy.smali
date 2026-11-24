.class public final synthetic La/hvy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/hvy;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/hvy;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, La/hvy;->a:B

    .line 2
    .line 3
    const v0, 0x7f0a1260

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    const-string v2, "Missing required view with ID: "

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/fet;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v4}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0, p1}, La/ro4;->J(ILa/fet;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p1, La/fet;

    .line 33
    .line 34
    check-cast p2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, La/x8x;->L(I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0, p1}, La/ffb0;->x(ILa/fet;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast p1, La/fet;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v4}, La/x8x;->L(I)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p0, p1}, La/oja0;->E(ILa/fet;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_2
    check-cast p1, Landroid/view/LayoutInflater;

    .line 67
    .line 68
    check-cast p2, Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const p0, 0x7f0d040b

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, La/cxx;->a(Landroid/view/View;)La/cxx;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_3
    check-cast p1, Landroid/view/LayoutInflater;

    .line 89
    .line 90
    check-cast p2, Landroid/view/ViewGroup;

    .line 91
    .line 92
    const p0, 0x7f0d03d5

    .line 93
    .line 94
    .line 95
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-eqz p0, :cond_0

    .line 100
    .line 101
    new-instance v3, La/xvx;

    .line 102
    .line 103
    check-cast p0, Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-direct {v3, p0}, La/xvx;-><init>(Landroid/widget/TextView;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const-string p0, "rootView"

    .line 110
    .line 111
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    return-object v3

    .line 115
    :pswitch_4
    check-cast p1, Landroid/view/LayoutInflater;

    .line 116
    .line 117
    check-cast p2, Landroid/view/ViewGroup;

    .line 118
    .line 119
    const p0, 0x7f0d03d6

    .line 120
    .line 121
    .line 122
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    const p1, 0x7f0a10e3

    .line 127
    .line 128
    .line 129
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    check-cast p2, Landroid/widget/TextView;

    .line 134
    .line 135
    if-eqz p2, :cond_1

    .line 136
    .line 137
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Landroid/widget/TextView;

    .line 142
    .line 143
    if-eqz p1, :cond_2

    .line 144
    .line 145
    new-instance v3, La/yvx;

    .line 146
    .line 147
    check-cast p0, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    invoke-direct {v3, p0, p2, p1}, La/yvx;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_1
    move v0, p1

    .line 154
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_1
    return-object v3

    .line 170
    :pswitch_5
    check-cast p1, La/fet;

    .line 171
    .line 172
    check-cast p2, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {v4}, La/x8x;->L(I)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    invoke-static {p0, p1}, La/xia0;->H(ILa/fet;)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_6
    check-cast p1, La/fet;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v4}, La/x8x;->L(I)I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    invoke-static {p0, p1}, La/nia0;->L(ILa/fet;)V

    .line 199
    .line 200
    .line 201
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_7
    check-cast p1, La/fet;

    .line 205
    .line 206
    check-cast p2, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v4}, La/x8x;->L(I)I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    invoke-static {p0, p1}, La/wha0;->w(ILa/fet;)V

    .line 216
    .line 217
    .line 218
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_8
    check-cast p1, Landroid/view/LayoutInflater;

    .line 222
    .line 223
    check-cast p2, Landroid/view/ViewGroup;

    .line 224
    .line 225
    const p0, 0x7f0d03d4

    .line 226
    .line 227
    .line 228
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    const p1, 0x7f0a0949

    .line 233
    .line 234
    .line 235
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    move-object v6, p2

    .line 240
    check-cast v6, Landroid/widget/TextView;

    .line 241
    .line 242
    if-eqz v6, :cond_3

    .line 243
    .line 244
    const p1, 0x7f0a1044

    .line 245
    .line 246
    .line 247
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    move-object v7, p2

    .line 252
    check-cast v7, Landroid/widget/TextView;

    .line 253
    .line 254
    if-eqz v7, :cond_3

    .line 255
    .line 256
    const p1, 0x7f0a11cd

    .line 257
    .line 258
    .line 259
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    move-object v8, p2

    .line 264
    check-cast v8, Landroid/widget/TextView;

    .line 265
    .line 266
    if-eqz v8, :cond_3

    .line 267
    .line 268
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    move-object v9, p1

    .line 273
    check-cast v9, Landroid/widget/TextView;

    .line 274
    .line 275
    if-eqz v9, :cond_4

    .line 276
    .line 277
    new-instance v4, La/wvx;

    .line 278
    .line 279
    move-object v5, p0

    .line 280
    check-cast v5, Landroid/widget/LinearLayout;

    .line 281
    .line 282
    invoke-direct/range {v4 .. v9}, La/wvx;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 283
    .line 284
    .line 285
    move-object v3, v4

    .line 286
    goto :goto_2

    .line 287
    :cond_3
    move v0, p1

    .line 288
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :goto_2
    return-object v3

    .line 304
    :pswitch_9
    check-cast p1, Landroid/view/LayoutInflater;

    .line 305
    .line 306
    check-cast p2, Landroid/view/ViewGroup;

    .line 307
    .line 308
    const p0, 0x7f0d0478

    .line 309
    .line 310
    .line 311
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    const p1, 0x7f0a093b

    .line 316
    .line 317
    .line 318
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    check-cast p2, Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;

    .line 323
    .line 324
    if-eqz p2, :cond_5

    .line 325
    .line 326
    new-instance v3, La/r6z;

    .line 327
    .line 328
    check-cast p0, Landroid/widget/FrameLayout;

    .line 329
    .line 330
    invoke-direct {v3, p0, p2}, La/r6z;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;)V

    .line 331
    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    :goto_3
    return-object v3

    .line 350
    :pswitch_a
    check-cast p1, La/azg0;

    .line 351
    .line 352
    check-cast p2, La/mez;

    .line 353
    .line 354
    iget-object p0, p2, La/mez;->c:La/hhk;

    .line 355
    .line 356
    iget-object p1, p0, La/hhk;->c:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p1, [I

    .line 359
    .line 360
    iget-object p0, p0, La/hhk;->e:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p0, [I

    .line 363
    .line 364
    filled-new-array {p1, p0}, [[I

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    return-object p0

    .line 373
    :pswitch_b
    check-cast p1, La/azg0;

    .line 374
    .line 375
    check-cast p2, La/pdz;

    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    iget-object p0, p2, La/pdz;->a:Ljava/util/LinkedHashMap;

    .line 384
    .line 385
    new-instance p1, Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    :cond_6
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result p2

    .line 402
    if-eqz p2, :cond_f

    .line 403
    .line 404
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p2

    .line 408
    check-cast p2, Ljava/util/Map$Entry;

    .line 409
    .line 410
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p2

    .line 418
    check-cast p2, La/ndz;

    .line 419
    .line 420
    iget-object v1, p2, La/ndz;->b:La/bch0;

    .line 421
    .line 422
    iget-object v2, p2, La/ndz;->a:La/r9h0;

    .line 423
    .line 424
    if-nez v1, :cond_7

    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_7
    instance-of v4, v1, La/xcz;

    .line 428
    .line 429
    if-eqz v4, :cond_8

    .line 430
    .line 431
    new-instance v4, La/r9h0;

    .line 432
    .line 433
    check-cast v1, La/xcz;

    .line 434
    .line 435
    invoke-virtual {v1}, La/xcz;->h()I

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    invoke-virtual {v1}, La/xcz;->i()I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    invoke-direct {v4, v6, v1}, La/r9h0;-><init>(II)V

    .line 444
    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_8
    instance-of v4, v1, La/rah0;

    .line 448
    .line 449
    if-eqz v4, :cond_9

    .line 450
    .line 451
    new-instance v4, La/r9h0;

    .line 452
    .line 453
    check-cast v1, La/rah0;

    .line 454
    .line 455
    iget-object v1, v1, La/rah0;->a:La/cgk0;

    .line 456
    .line 457
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    invoke-direct {v4, v5, v1}, La/r9h0;-><init>(II)V

    .line 462
    .line 463
    .line 464
    goto :goto_5

    .line 465
    :cond_9
    instance-of v4, v1, La/d9z;

    .line 466
    .line 467
    if-eqz v4, :cond_a

    .line 468
    .line 469
    new-instance v4, La/r9h0;

    .line 470
    .line 471
    check-cast v1, La/d9z;

    .line 472
    .line 473
    invoke-virtual {v1}, La/d9z;->h()I

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    invoke-virtual {v1}, La/d9z;->i()I

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    invoke-direct {v4, v6, v1}, La/r9h0;-><init>(II)V

    .line 482
    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_a
    instance-of v4, v1, La/mez;

    .line 486
    .line 487
    if-eqz v4, :cond_b

    .line 488
    .line 489
    new-instance v4, La/r9h0;

    .line 490
    .line 491
    check-cast v1, La/mez;

    .line 492
    .line 493
    invoke-virtual {v1}, La/mez;->g()I

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    invoke-virtual {v1}, La/mez;->h()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    invoke-direct {v4, v6, v1}, La/r9h0;-><init>(II)V

    .line 502
    .line 503
    .line 504
    goto :goto_5

    .line 505
    :cond_b
    new-instance v4, La/r9h0;

    .line 506
    .line 507
    invoke-direct {v4, v5, v5}, La/r9h0;-><init>(II)V

    .line 508
    .line 509
    .line 510
    :goto_5
    new-instance v1, La/r9h0;

    .line 511
    .line 512
    invoke-direct {v1, v5, v5}, La/r9h0;-><init>(II)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v4, v1}, La/r9h0;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_c

    .line 520
    .line 521
    iget-boolean p2, p2, La/ndz;->c:Z

    .line 522
    .line 523
    if-eqz p2, :cond_d

    .line 524
    .line 525
    :cond_c
    move-object v2, v4

    .line 526
    :cond_d
    :goto_6
    new-instance p2, La/r9h0;

    .line 527
    .line 528
    invoke-direct {p2, v5, v5}, La/r9h0;-><init>(II)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, p2}, La/r9h0;->equals(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result p2

    .line 535
    if-eqz p2, :cond_e

    .line 536
    .line 537
    move-object p2, v3

    .line 538
    goto :goto_7

    .line 539
    :cond_e
    new-instance p2, La/kzg0;

    .line 540
    .line 541
    iget v1, v2, La/r9h0;->a:I

    .line 542
    .line 543
    iget v2, v2, La/r9h0;->b:I

    .line 544
    .line 545
    invoke-direct {p2, v1, v2, v0}, La/kzg0;-><init>(IILjava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :goto_7
    if-eqz p2, :cond_6

    .line 549
    .line 550
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    goto/16 :goto_4

    .line 554
    .line 555
    :cond_f
    new-instance p0, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result p2

    .line 568
    if-eqz p2, :cond_10

    .line 569
    .line 570
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object p2

    .line 574
    check-cast p2, La/kzg0;

    .line 575
    .line 576
    iget-object v0, p2, La/kzg0;->a:Ljava/lang/Object;

    .line 577
    .line 578
    iget v1, p2, La/kzg0;->b:I

    .line 579
    .line 580
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    iget p2, p2, La/kzg0;->c:I

    .line 585
    .line 586
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object p2

    .line 590
    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object p2

    .line 594
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object p2

    .line 598
    invoke-static {p0, p2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 599
    .line 600
    .line 601
    goto :goto_8

    .line 602
    :cond_10
    return-object p0

    .line 603
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    .line 604
    .line 605
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 606
    .line 607
    .line 608
    move-result p0

    .line 609
    check-cast p2, Ljava/lang/Integer;

    .line 610
    .line 611
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 612
    .line 613
    .line 614
    move-result p1

    .line 615
    new-instance p2, La/xcz;

    .line 616
    .line 617
    invoke-direct {p2, p0, p1}, La/xcz;-><init>(II)V

    .line 618
    .line 619
    .line 620
    return-object p2

    .line 621
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 622
    .line 623
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    check-cast p2, Ljava/lang/Integer;

    .line 627
    .line 628
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 629
    .line 630
    .line 631
    move-result p0

    .line 632
    new-instance p1, La/rah0;

    .line 633
    .line 634
    invoke-direct {p1, p0}, La/rah0;-><init>(I)V

    .line 635
    .line 636
    .line 637
    return-object p1

    .line 638
    :pswitch_e
    check-cast p1, La/azg0;

    .line 639
    .line 640
    check-cast p2, La/ldz;

    .line 641
    .line 642
    invoke-virtual {p2}, La/ldz;->e()Ljava/util/Map;

    .line 643
    .line 644
    .line 645
    move-result-object p0

    .line 646
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 647
    .line 648
    .line 649
    move-result p1

    .line 650
    if-eqz p1, :cond_11

    .line 651
    .line 652
    goto :goto_9

    .line 653
    :cond_11
    move-object v3, p0

    .line 654
    :goto_9
    return-object v3

    .line 655
    :pswitch_f
    check-cast p1, La/azg0;

    .line 656
    .line 657
    check-cast p2, La/xcz;

    .line 658
    .line 659
    invoke-virtual {p2}, La/xcz;->h()I

    .line 660
    .line 661
    .line 662
    move-result p0

    .line 663
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 664
    .line 665
    .line 666
    move-result-object p0

    .line 667
    invoke-virtual {p2}, La/xcz;->i()I

    .line 668
    .line 669
    .line 670
    move-result p1

    .line 671
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 672
    .line 673
    .line 674
    move-result-object p1

    .line 675
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object p0

    .line 683
    return-object p0

    .line 684
    :pswitch_10
    check-cast p1, La/azg0;

    .line 685
    .line 686
    check-cast p2, La/xcz;

    .line 687
    .line 688
    invoke-virtual {p2}, La/xcz;->h()I

    .line 689
    .line 690
    .line 691
    move-result p0

    .line 692
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 693
    .line 694
    .line 695
    move-result-object p0

    .line 696
    invoke-virtual {p2}, La/xcz;->i()I

    .line 697
    .line 698
    .line 699
    move-result p1

    .line 700
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 701
    .line 702
    .line 703
    move-result-object p1

    .line 704
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 705
    .line 706
    .line 707
    move-result-object p0

    .line 708
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    return-object p0

    .line 713
    :pswitch_11
    check-cast p1, La/azg0;

    .line 714
    .line 715
    check-cast p2, La/xcz;

    .line 716
    .line 717
    invoke-virtual {p2}, La/xcz;->h()I

    .line 718
    .line 719
    .line 720
    move-result p0

    .line 721
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 722
    .line 723
    .line 724
    move-result-object p0

    .line 725
    invoke-virtual {p2}, La/xcz;->i()I

    .line 726
    .line 727
    .line 728
    move-result p1

    .line 729
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 734
    .line 735
    .line 736
    move-result-object p0

    .line 737
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object p0

    .line 741
    return-object p0

    .line 742
    :pswitch_12
    check-cast p1, La/azg0;

    .line 743
    .line 744
    check-cast p2, La/d9z;

    .line 745
    .line 746
    invoke-virtual {p2}, La/d9z;->h()I

    .line 747
    .line 748
    .line 749
    move-result p0

    .line 750
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 751
    .line 752
    .line 753
    move-result-object p0

    .line 754
    invoke-virtual {p2}, La/d9z;->i()I

    .line 755
    .line 756
    .line 757
    move-result p1

    .line 758
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    filled-new-array {p0, p1}, [Ljava/lang/Integer;

    .line 763
    .line 764
    .line 765
    move-result-object p0

    .line 766
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 767
    .line 768
    .line 769
    move-result-object p0

    .line 770
    return-object p0

    .line 771
    :pswitch_13
    check-cast p1, La/x8z;

    .line 772
    .line 773
    check-cast p2, Ljava/lang/Integer;

    .line 774
    .line 775
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 776
    .line 777
    .line 778
    invoke-static {v4}, La/q8x;->e(I)J

    .line 779
    .line 780
    .line 781
    move-result-wide p0

    .line 782
    new-instance p2, La/pgv;

    .line 783
    .line 784
    invoke-direct {p2, p0, p1}, La/pgv;-><init>(J)V

    .line 785
    .line 786
    .line 787
    return-object p2

    .line 788
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 789
    .line 790
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 791
    .line 792
    .line 793
    move-result p0

    .line 794
    check-cast p2, La/xyy;

    .line 795
    .line 796
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    iget-object p1, p2, La/xyy;->b:Ljava/lang/String;

    .line 800
    .line 801
    new-instance p2, Ljava/lang/StringBuilder;

    .line 802
    .line 803
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    const-string p1, "_"

    .line 807
    .line 808
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object p0

    .line 818
    return-object p0

    .line 819
    :pswitch_15
    check-cast p1, La/fet;

    .line 820
    .line 821
    check-cast p2, Ljava/lang/Integer;

    .line 822
    .line 823
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    invoke-static {v4}, La/x8x;->L(I)I

    .line 827
    .line 828
    .line 829
    move-result p0

    .line 830
    invoke-static {p0, p1}, La/ntr;->Q(ILa/fet;)V

    .line 831
    .line 832
    .line 833
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 834
    .line 835
    return-object p0

    .line 836
    :pswitch_16
    check-cast p1, Ljava/lang/Long;

    .line 837
    .line 838
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    check-cast p2, Ljava/lang/Boolean;

    .line 842
    .line 843
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 847
    .line 848
    return-object p0

    .line 849
    :pswitch_17
    check-cast p1, Ljava/lang/Long;

    .line 850
    .line 851
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    check-cast p2, Ljava/lang/Boolean;

    .line 855
    .line 856
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 860
    .line 861
    return-object p0

    .line 862
    :pswitch_18
    check-cast p1, La/fet;

    .line 863
    .line 864
    check-cast p2, Ljava/lang/Integer;

    .line 865
    .line 866
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 867
    .line 868
    .line 869
    const p0, 0x44e190a

    .line 870
    .line 871
    .line 872
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 873
    .line 874
    .line 875
    invoke-static {v5, v5, p1, v5, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 876
    .line 877
    .line 878
    move-result-object p0

    .line 879
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 880
    .line 881
    .line 882
    return-object p0

    .line 883
    :pswitch_19
    check-cast p1, La/fet;

    .line 884
    .line 885
    check-cast p2, Ljava/lang/Integer;

    .line 886
    .line 887
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 888
    .line 889
    .line 890
    const p0, -0x6adb6bb6

    .line 891
    .line 892
    .line 893
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 894
    .line 895
    .line 896
    invoke-static {v5, v5, p1, v5, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 897
    .line 898
    .line 899
    move-result-object p0

    .line 900
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 901
    .line 902
    .line 903
    return-object p0

    .line 904
    :pswitch_1a
    check-cast p1, La/fet;

    .line 905
    .line 906
    check-cast p2, Ljava/lang/Integer;

    .line 907
    .line 908
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 909
    .line 910
    .line 911
    const p0, 0x1b536a

    .line 912
    .line 913
    .line 914
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 915
    .line 916
    .line 917
    invoke-static {v5, v5, p1, v5, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 918
    .line 919
    .line 920
    move-result-object p0

    .line 921
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 922
    .line 923
    .line 924
    return-object p0

    .line 925
    :pswitch_1b
    check-cast p1, Landroid/view/LayoutInflater;

    .line 926
    .line 927
    check-cast p2, Landroid/view/ViewGroup;

    .line 928
    .line 929
    const p0, 0x7f0d0519

    .line 930
    .line 931
    .line 932
    invoke-static {p1, p2, p0, p2, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 933
    .line 934
    .line 935
    move-result-object p0

    .line 936
    const p1, 0x7f0a011b

    .line 937
    .line 938
    .line 939
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 940
    .line 941
    .line 942
    move-result-object p2

    .line 943
    check-cast p2, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;

    .line 944
    .line 945
    if-eqz p2, :cond_12

    .line 946
    .line 947
    const p1, 0x7f0a06e3

    .line 948
    .line 949
    .line 950
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 955
    .line 956
    if-eqz v0, :cond_12

    .line 957
    .line 958
    new-instance v3, La/s7b0;

    .line 959
    .line 960
    check-cast p0, Landroid/widget/LinearLayout;

    .line 961
    .line 962
    invoke-direct {v3, p0, p2, v0}, La/s7b0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 963
    .line 964
    .line 965
    goto :goto_a

    .line 966
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 967
    .line 968
    .line 969
    move-result-object p0

    .line 970
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object p0

    .line 974
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object p0

    .line 978
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    :goto_a
    return-object v3

    .line 982
    :pswitch_1c
    check-cast p1, La/fet;

    .line 983
    .line 984
    check-cast p2, Ljava/lang/Integer;

    .line 985
    .line 986
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    const/4 p0, 0x7

    .line 990
    invoke-static {p0}, La/x8x;->L(I)I

    .line 991
    .line 992
    .line 993
    move-result p0

    .line 994
    invoke-static {p0, p1}, La/ufx;->b(ILa/fet;)V

    .line 995
    .line 996
    .line 997
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 998
    .line 999
    return-object p0

    .line 1000
    nop

    .line 1001
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
