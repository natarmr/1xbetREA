.class public final synthetic La/x6o;
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
    iput-byte p1, p0, La/x6o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/x6o;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p0, p0, La/x6o;->a:B

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    const v1, 0x7f0d0634

    .line 6
    .line 7
    .line 8
    const-string v2, "Missing required view with ID: "

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x3

    .line 12
    const-string v5, "rootView"

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    check-cast p2, Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne p0, v0, :cond_0

    .line 38
    .line 39
    invoke-interface {p1, p2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v3, v7

    .line 47
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_0
    check-cast p1, Landroid/view/LayoutInflater;

    .line 53
    .line 54
    check-cast p2, Landroid/view/ViewGroup;

    .line 55
    .line 56
    const p0, 0x7f0d010e

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const p1, 0x7f0a027d

    .line 64
    .line 65
    .line 66
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 71
    .line 72
    if-eqz p2, :cond_1

    .line 73
    .line 74
    const p1, 0x7f0a0283

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 82
    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    const p1, 0x7f0a0289

    .line 86
    .line 87
    .line 88
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 93
    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    check-cast p0, Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 97
    .line 98
    new-instance v6, La/f2k;

    .line 99
    .line 100
    invoke-direct {v6, p0, p2, v0, v1}, La/f2k;-><init>(Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_1
    return-object v6

    .line 120
    :pswitch_1
    check-cast p1, Landroid/view/LayoutInflater;

    .line 121
    .line 122
    check-cast p2, Landroid/view/ViewGroup;

    .line 123
    .line 124
    const p0, 0x7f0d010f

    .line 125
    .line 126
    .line 127
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_2

    .line 132
    .line 133
    new-instance v6, La/g2k;

    .line 134
    .line 135
    check-cast p0, Landroid/widget/LinearLayout;

    .line 136
    .line 137
    invoke-direct {v6, p0}, La/g2k;-><init>(Landroid/widget/LinearLayout;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    return-object v6

    .line 145
    :pswitch_2
    check-cast p1, Landroid/view/LayoutInflater;

    .line 146
    .line 147
    check-cast p2, Landroid/view/ViewGroup;

    .line 148
    .line 149
    const p0, 0x7f0d0104

    .line 150
    .line 151
    .line 152
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_3

    .line 157
    .line 158
    check-cast p0, Landroid/widget/LinearLayout;

    .line 159
    .line 160
    new-instance v6, La/y1k;

    .line 161
    .line 162
    invoke-direct {v6, p0, p0}, La/y1k;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_3
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    return-object v6

    .line 170
    :pswitch_3
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
    invoke-static {v3}, La/x8x;->L(I)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    invoke-static {p0, p1}, La/acb;->v(ILa/fet;)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_4
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 188
    .line 189
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance p0, La/e4p;

    .line 198
    .line 199
    invoke-direct {p0, v4}, La/e4p;-><init>(B)V

    .line 200
    .line 201
    .line 202
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    new-instance p0, La/r4p;

    .line 206
    .line 207
    invoke-direct {p0, v7}, La/r4p;-><init>(B)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    check-cast p2, La/e5p;

    .line 223
    .line 224
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    instance-of p1, p2, La/g4p;

    .line 228
    .line 229
    if-eqz p1, :cond_4

    .line 230
    .line 231
    check-cast p2, La/g4p;

    .line 232
    .line 233
    iget-object v6, p2, La/g4p;->e:Ljava/lang/String;

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_4
    instance-of p1, p2, La/h4p;

    .line 237
    .line 238
    if-eqz p1, :cond_5

    .line 239
    .line 240
    check-cast p2, La/h4p;

    .line 241
    .line 242
    iget-object v6, p2, La/h4p;->b:Ljava/lang/String;

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_5
    instance-of p1, p2, La/w4p;

    .line 246
    .line 247
    if-eqz p1, :cond_6

    .line 248
    .line 249
    check-cast p2, La/w4p;

    .line 250
    .line 251
    iget-object v6, p2, La/w4p;->b:Ljava/lang/String;

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_6
    instance-of p1, p2, La/z4p;

    .line 255
    .line 256
    if-eqz p1, :cond_7

    .line 257
    .line 258
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-static {p0, p1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    goto :goto_4

    .line 267
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 268
    .line 269
    .line 270
    :goto_4
    return-object v6

    .line 271
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    check-cast p2, La/e5p;

    .line 278
    .line 279
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    instance-of p1, p2, La/g4p;

    .line 283
    .line 284
    if-eqz p1, :cond_8

    .line 285
    .line 286
    check-cast p2, La/g4p;

    .line 287
    .line 288
    iget-object v6, p2, La/g4p;->e:Ljava/lang/String;

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_8
    instance-of p1, p2, La/h4p;

    .line 292
    .line 293
    if-eqz p1, :cond_9

    .line 294
    .line 295
    check-cast p2, La/h4p;

    .line 296
    .line 297
    iget-object v6, p2, La/h4p;->b:Ljava/lang/String;

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_9
    instance-of p1, p2, La/w4p;

    .line 301
    .line 302
    if-eqz p1, :cond_a

    .line 303
    .line 304
    check-cast p2, La/w4p;

    .line 305
    .line 306
    iget-object v6, p2, La/w4p;->b:Ljava/lang/String;

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_a
    instance-of p1, p2, La/z4p;

    .line 310
    .line 311
    if-eqz p1, :cond_b

    .line 312
    .line 313
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-static {p0, p1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    goto :goto_5

    .line 322
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 323
    .line 324
    .line 325
    :goto_5
    return-object v6

    .line 326
    :pswitch_7
    check-cast p1, Landroid/view/LayoutInflater;

    .line 327
    .line 328
    check-cast p2, Landroid/view/ViewGroup;

    .line 329
    .line 330
    const p0, 0x7f0d0110

    .line 331
    .line 332
    .line 333
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    if-eqz p0, :cond_c

    .line 338
    .line 339
    check-cast p0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 340
    .line 341
    new-instance v6, La/h2k;

    .line 342
    .line 343
    invoke-direct {v6, p0, v7}, La/h2k;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;B)V

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_c
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :goto_6
    return-object v6

    .line 351
    :pswitch_8
    check-cast p1, Landroid/view/LayoutInflater;

    .line 352
    .line 353
    check-cast p2, Landroid/view/ViewGroup;

    .line 354
    .line 355
    const p0, 0x7f0d0103

    .line 356
    .line 357
    .line 358
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    if-eqz p0, :cond_d

    .line 363
    .line 364
    check-cast p0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 365
    .line 366
    new-instance v6, La/x1k;

    .line 367
    .line 368
    invoke-direct {v6, p0, p0}, La/x1k;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 369
    .line 370
    .line 371
    goto :goto_7

    .line 372
    :cond_d
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    :goto_7
    return-object v6

    .line 376
    :pswitch_9
    check-cast p1, Landroid/view/LayoutInflater;

    .line 377
    .line 378
    check-cast p2, Landroid/view/ViewGroup;

    .line 379
    .line 380
    const p0, 0x7f0d010d

    .line 381
    .line 382
    .line 383
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    if-eqz p0, :cond_e

    .line 388
    .line 389
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 390
    .line 391
    new-instance v6, La/mzq;

    .line 392
    .line 393
    invoke-direct {v6, p0, v3}, La/mzq;-><init>(Landroid/view/View;B)V

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_e
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :goto_8
    return-object v6

    .line 401
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 404
    .line 405
    .line 406
    check-cast p2, La/a2p;

    .line 407
    .line 408
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    return-object p0

    .line 416
    :pswitch_b
    check-cast p1, Landroid/view/LayoutInflater;

    .line 417
    .line 418
    check-cast p2, Landroid/view/ViewGroup;

    .line 419
    .line 420
    const p0, 0x7f0d01c7

    .line 421
    .line 422
    .line 423
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    if-eqz p0, :cond_f

    .line 428
    .line 429
    check-cast p0, Landroid/view/ViewStub;

    .line 430
    .line 431
    new-instance v6, La/mzq;

    .line 432
    .line 433
    const/4 p1, 0x2

    .line 434
    invoke-direct {v6, p0, p1}, La/mzq;-><init>(Landroid/view/View;B)V

    .line 435
    .line 436
    .line 437
    goto :goto_9

    .line 438
    :cond_f
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :goto_9
    return-object v6

    .line 442
    :pswitch_c
    check-cast p1, La/oyg0;

    .line 443
    .line 444
    move-object v0, p2

    .line 445
    check-cast v0, La/mvo;

    .line 446
    .line 447
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    const/4 v6, 0x0

    .line 454
    const/16 v7, 0x39

    .line 455
    .line 456
    const/4 v1, 0x0

    .line 457
    const/4 v2, 0x0

    .line 458
    const/4 v3, 0x1

    .line 459
    const/4 v4, 0x0

    .line 460
    const/4 v5, 0x0

    .line 461
    invoke-static/range {v0 .. v7}, La/mvo;->a(La/mvo;ZZZLa/kvo;La/zdm0;La/nc5;I)La/mvo;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    return-object p0

    .line 466
    :pswitch_d
    check-cast p1, La/oyg0;

    .line 467
    .line 468
    move-object v0, p2

    .line 469
    check-cast v0, La/mvo;

    .line 470
    .line 471
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    const/4 v6, 0x0

    .line 478
    const/16 v7, 0x31

    .line 479
    .line 480
    const/4 v1, 0x0

    .line 481
    const/4 v2, 0x0

    .line 482
    const/4 v3, 0x0

    .line 483
    const/4 v4, 0x0

    .line 484
    const/4 v5, 0x0

    .line 485
    invoke-static/range {v0 .. v7}, La/mvo;->a(La/mvo;ZZZLa/kvo;La/zdm0;La/nc5;I)La/mvo;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    return-object p0

    .line 490
    :pswitch_e
    check-cast p1, La/fet;

    .line 491
    .line 492
    check-cast p2, Ljava/lang/Integer;

    .line 493
    .line 494
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-static {v3}, La/x8x;->L(I)I

    .line 498
    .line 499
    .line 500
    move-result p0

    .line 501
    invoke-static {p0, p1}, La/xbc;->A(ILa/fet;)V

    .line 502
    .line 503
    .line 504
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object p0

    .line 507
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 508
    .line 509
    check-cast p2, Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    return-object p0

    .line 520
    :pswitch_10
    check-cast p1, Landroid/view/LayoutInflater;

    .line 521
    .line 522
    check-cast p2, Landroid/view/ViewGroup;

    .line 523
    .line 524
    const p0, 0x7f0d039c

    .line 525
    .line 526
    .line 527
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    const p1, 0x7f0a0526

    .line 532
    .line 533
    .line 534
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 535
    .line 536
    .line 537
    move-result-object p2

    .line 538
    check-cast p2, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 539
    .line 540
    if-eqz p2, :cond_10

    .line 541
    .line 542
    new-instance v6, La/vtx;

    .line 543
    .line 544
    check-cast p0, Landroid/widget/FrameLayout;

    .line 545
    .line 546
    invoke-direct {v6, p0, p2}, La/vtx;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit_sport/express_card/SportExpressCard;)V

    .line 547
    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    :goto_a
    return-object v6

    .line 566
    :pswitch_11
    check-cast p1, Landroid/view/LayoutInflater;

    .line 567
    .line 568
    check-cast p2, Landroid/view/ViewGroup;

    .line 569
    .line 570
    invoke-static {p1, p2, v1, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    if-eqz p0, :cond_11

    .line 575
    .line 576
    check-cast p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 577
    .line 578
    new-instance v6, La/tcu0;

    .line 579
    .line 580
    invoke-direct {v6, p0, p0}, La/tcu0;-><init>(Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;)V

    .line 581
    .line 582
    .line 583
    goto :goto_b

    .line 584
    :cond_11
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    :goto_b
    return-object v6

    .line 588
    :pswitch_12
    check-cast p1, Landroid/view/LayoutInflater;

    .line 589
    .line 590
    check-cast p2, Landroid/view/ViewGroup;

    .line 591
    .line 592
    invoke-static {p1, p2, v1, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    if-eqz p0, :cond_12

    .line 597
    .line 598
    check-cast p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;

    .line 599
    .line 600
    new-instance v6, La/tcu0;

    .line 601
    .line 602
    invoke-direct {v6, p0, p0}, La/tcu0;-><init>(Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;)V

    .line 603
    .line 604
    .line 605
    goto :goto_c

    .line 606
    :cond_12
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    :goto_c
    return-object v6

    .line 610
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 611
    .line 612
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 613
    .line 614
    .line 615
    check-cast p2, La/ah7;

    .line 616
    .line 617
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    iget-wide p0, p2, La/ah7;->a:J

    .line 621
    .line 622
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 623
    .line 624
    .line 625
    move-result-object p0

    .line 626
    return-object p0

    .line 627
    :pswitch_14
    check-cast p1, La/fet;

    .line 628
    .line 629
    check-cast p2, Ljava/lang/Integer;

    .line 630
    .line 631
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 632
    .line 633
    .line 634
    const p0, -0x53751bcc

    .line 635
    .line 636
    .line 637
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 638
    .line 639
    .line 640
    invoke-static {v7, v7, p1, v7, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 645
    .line 646
    .line 647
    return-object p0

    .line 648
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 649
    .line 650
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 651
    .line 652
    .line 653
    check-cast p2, La/p6t0;

    .line 654
    .line 655
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object p0

    .line 662
    return-object p0

    .line 663
    :pswitch_16
    check-cast p1, La/fet;

    .line 664
    .line 665
    check-cast p2, Ljava/lang/Integer;

    .line 666
    .line 667
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 668
    .line 669
    .line 670
    const p0, -0x7537e949

    .line 671
    .line 672
    .line 673
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 674
    .line 675
    .line 676
    invoke-static {v7, v7, p1, v7, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 681
    .line 682
    .line 683
    return-object p0

    .line 684
    :pswitch_17
    check-cast p1, La/fet;

    .line 685
    .line 686
    check-cast p2, Ljava/lang/Integer;

    .line 687
    .line 688
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 689
    .line 690
    .line 691
    const p0, -0x6a88019b

    .line 692
    .line 693
    .line 694
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 695
    .line 696
    .line 697
    invoke-static {v7, v7, p1, v7, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 702
    .line 703
    .line 704
    return-object p0

    .line 705
    :pswitch_18
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 706
    .line 707
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 708
    .line 709
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    new-instance p0, La/mmn;

    .line 716
    .line 717
    const/16 v1, 0xd

    .line 718
    .line 719
    invoke-direct {p0, v1}, La/mmn;-><init>(B)V

    .line 720
    .line 721
    .line 722
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    new-instance p0, La/urn;

    .line 726
    .line 727
    invoke-direct {p0, v0}, La/urn;-><init>(B)V

    .line 728
    .line 729
    .line 730
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 734
    .line 735
    return-object p0

    .line 736
    :pswitch_19
    check-cast p1, La/fet;

    .line 737
    .line 738
    check-cast p2, Ljava/lang/Integer;

    .line 739
    .line 740
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 741
    .line 742
    .line 743
    const p0, -0x793279bb

    .line 744
    .line 745
    .line 746
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 747
    .line 748
    .line 749
    invoke-static {v7, v7, p1, v7, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 750
    .line 751
    .line 752
    move-result-object p0

    .line 753
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 754
    .line 755
    .line 756
    return-object p0

    .line 757
    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    .line 758
    .line 759
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 760
    .line 761
    .line 762
    check-cast p2, La/wnk;

    .line 763
    .line 764
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    return-object p1

    .line 768
    :pswitch_1b
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 769
    .line 770
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 771
    .line 772
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    new-instance p0, La/mmn;

    .line 779
    .line 780
    const/16 v0, 0x8

    .line 781
    .line 782
    invoke-direct {p0, v0}, La/mmn;-><init>(B)V

    .line 783
    .line 784
    .line 785
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    new-instance p0, La/urn;

    .line 789
    .line 790
    const/4 p1, 0x6

    .line 791
    invoke-direct {p0, p1}, La/urn;-><init>(B)V

    .line 792
    .line 793
    .line 794
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 798
    .line 799
    return-object p0

    .line 800
    :pswitch_1c
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 801
    .line 802
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 803
    .line 804
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    new-instance p0, La/mmn;

    .line 811
    .line 812
    invoke-direct {p0, v0}, La/mmn;-><init>(B)V

    .line 813
    .line 814
    .line 815
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    new-instance p0, La/urn;

    .line 819
    .line 820
    const/4 p1, 0x7

    .line 821
    invoke-direct {p0, p1}, La/urn;-><init>(B)V

    .line 822
    .line 823
    .line 824
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 828
    .line 829
    return-object p0

    .line 830
    nop

    .line 831
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
