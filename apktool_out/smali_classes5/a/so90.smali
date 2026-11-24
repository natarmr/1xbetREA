.class public final synthetic La/so90;
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
    iput-byte p1, p0, La/so90;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/so90;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte p0, p0, La/so90;->a:B

    .line 2
    .line 3
    const v0, 0x7f0a0cc4

    .line 4
    .line 5
    .line 6
    const v1, 0x7f0a027b

    .line 7
    .line 8
    .line 9
    const v2, 0x7f0a029a

    .line 10
    .line 11
    .line 12
    const v3, 0x7f0a0287

    .line 13
    .line 14
    .line 15
    const-string v4, "Missing required view with ID: "

    .line 16
    .line 17
    const v5, 0x7f0a0d73

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x1

    .line 23
    packed-switch p0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast p1, Landroid/view/LayoutInflater;

    .line 27
    .line 28
    check-cast p2, Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, La/vjd;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/vjd;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/fet;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v8}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0, p1}, La/d9x;->q(ILa/fet;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 59
    .line 60
    check-cast p2, Ljava/lang/String;

    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v8}, La/x8x;->L(I)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p0, p1}, La/qjj;->D(ILa/fet;)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_3
    check-cast p1, La/fet;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {v8}, La/x8x;->L(I)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0, p1}, La/qjj;->B(ILa/fet;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_4
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance p0, La/er90;

    .line 110
    .line 111
    const/16 v0, 0x10

    .line 112
    .line 113
    invoke-direct {p0, v0}, La/er90;-><init>(B)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    new-instance p0, La/wm90;

    .line 120
    .line 121
    const/16 p1, 0x15

    .line 122
    .line 123
    invoke-direct {p0, p1}, La/wm90;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 133
    .line 134
    check-cast p2, Ljava/lang/String;

    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 140
    .line 141
    check-cast p2, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_7
    check-cast p1, La/fet;

    .line 153
    .line 154
    check-cast p2, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v8}, La/x8x;->L(I)I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    invoke-static {p0, p1}, La/saj;->z(ILa/fet;)V

    .line 164
    .line 165
    .line 166
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_8
    check-cast p1, La/fet;

    .line 170
    .line 171
    check-cast p2, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v8}, La/x8x;->L(I)I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    invoke-static {p0, p1}, La/x8f;->k(ILa/fet;)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    check-cast p2, La/h3a0;

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    return-object p1

    .line 197
    :pswitch_a
    check-cast p1, La/fet;

    .line 198
    .line 199
    check-cast p2, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {v8}, La/x8x;->L(I)I

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    invoke-static {p0, p1}, La/x8f;->F(ILa/fet;)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_b
    check-cast p1, La/oyg0;

    .line 215
    .line 216
    check-cast p2, La/k0a0;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {p2, v7, v8, v7}, La/k0a0;->a(La/k0a0;ZZZ)La/k0a0;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_c
    check-cast p1, La/oyg0;

    .line 230
    .line 231
    check-cast p2, La/k0a0;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {p2, v7, v7, v8}, La/k0a0;->a(La/k0a0;ZZZ)La/k0a0;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    check-cast p2, La/nz30;

    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object p0, p2, La/nz30;->b:La/cz10;

    .line 255
    .line 256
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_e
    check-cast p1, La/fet;

    .line 262
    .line 263
    check-cast p2, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-static {v8}, La/x8x;->L(I)I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-static {p0, p1}, La/vdx;->z(ILa/fet;)V

    .line 273
    .line 274
    .line 275
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    check-cast p2, La/p6t0;

    .line 285
    .line 286
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-static {p0, p1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :pswitch_10
    check-cast p1, La/fet;

    .line 299
    .line 300
    check-cast p2, Ljava/lang/Integer;

    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {v8}, La/x8x;->L(I)I

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    invoke-static {p0, p1}, La/bdx;->H(ILa/fet;)V

    .line 310
    .line 311
    .line 312
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object p0

    .line 315
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    check-cast p2, La/p6t0;

    .line 322
    .line 323
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-static {p0, p1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    return-object p0

    .line 335
    :pswitch_12
    check-cast p1, La/fet;

    .line 336
    .line 337
    check-cast p2, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v8}, La/x8x;->L(I)I

    .line 343
    .line 344
    .line 345
    move-result p0

    .line 346
    invoke-static {p0, p1}, La/t9x;->m(ILa/fet;)V

    .line 347
    .line 348
    .line 349
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object p0

    .line 352
    :pswitch_13
    check-cast p1, Ljava/lang/Throwable;

    .line 353
    .line 354
    check-cast p2, Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_14
    check-cast p1, Landroid/view/LayoutInflater;

    .line 363
    .line 364
    check-cast p2, Landroid/view/ViewGroup;

    .line 365
    .line 366
    const p0, 0x7f0d03f8

    .line 367
    .line 368
    .line 369
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-static {p0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    check-cast p1, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 378
    .line 379
    if-eqz p1, :cond_1

    .line 380
    .line 381
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    check-cast p1, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 386
    .line 387
    if-eqz p1, :cond_2

    .line 388
    .line 389
    const v2, 0x7f0a0cc5

    .line 390
    .line 391
    .line 392
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    check-cast p2, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 397
    .line 398
    if-eqz p2, :cond_2

    .line 399
    .line 400
    invoke-static {p0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 405
    .line 406
    if-eqz v0, :cond_0

    .line 407
    .line 408
    new-instance v6, La/twx;

    .line 409
    .line 410
    check-cast p0, Landroid/widget/LinearLayout;

    .line 411
    .line 412
    invoke-direct {v6, p0, p1, p2, v0}, La/twx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/separator/DsSeparator;)V

    .line 413
    .line 414
    .line 415
    goto :goto_1

    .line 416
    :cond_0
    move v2, v5

    .line 417
    goto :goto_0

    .line 418
    :cond_1
    move v2, v3

    .line 419
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    :goto_1
    return-object v6

    .line 435
    :pswitch_15
    check-cast p1, Landroid/view/LayoutInflater;

    .line 436
    .line 437
    check-cast p2, Landroid/view/ViewGroup;

    .line 438
    .line 439
    const p0, 0x7f0d03f5

    .line 440
    .line 441
    .line 442
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    invoke-static {p0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    move-object v9, p1

    .line 451
    check-cast v9, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 452
    .line 453
    if-eqz v9, :cond_6

    .line 454
    .line 455
    invoke-static {p0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    check-cast p1, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 460
    .line 461
    if-eqz p1, :cond_5

    .line 462
    .line 463
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    move-object v10, p1

    .line 468
    check-cast v10, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 469
    .line 470
    if-eqz v10, :cond_4

    .line 471
    .line 472
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    move-object v11, p1

    .line 477
    check-cast v11, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 478
    .line 479
    if-eqz v11, :cond_7

    .line 480
    .line 481
    invoke-static {p0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    move-object v12, p1

    .line 486
    check-cast v12, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 487
    .line 488
    if-eqz v12, :cond_3

    .line 489
    .line 490
    new-instance v7, La/qwx;

    .line 491
    .line 492
    move-object v8, p0

    .line 493
    check-cast v8, Landroid/widget/LinearLayout;

    .line 494
    .line 495
    invoke-direct/range {v7 .. v12}, La/qwx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/separator/DsSeparator;)V

    .line 496
    .line 497
    .line 498
    move-object v6, v7

    .line 499
    goto :goto_3

    .line 500
    :cond_3
    move v0, v5

    .line 501
    goto :goto_2

    .line 502
    :cond_4
    move v0, v2

    .line 503
    goto :goto_2

    .line 504
    :cond_5
    move v0, v3

    .line 505
    goto :goto_2

    .line 506
    :cond_6
    move v0, v1

    .line 507
    :cond_7
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 508
    .line 509
    .line 510
    move-result-object p0

    .line 511
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    :goto_3
    return-object v6

    .line 523
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 524
    .line 525
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 526
    .line 527
    .line 528
    check-cast p2, La/cav0;

    .line 529
    .line 530
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    return-object p1

    .line 534
    :pswitch_17
    check-cast p1, Ljava/lang/Throwable;

    .line 535
    .line 536
    check-cast p2, Ljava/lang/String;

    .line 537
    .line 538
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 539
    .line 540
    return-object p0

    .line 541
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    check-cast p2, Ljava/lang/Integer;

    .line 547
    .line 548
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 552
    .line 553
    return-object p0

    .line 554
    :pswitch_19
    check-cast p1, Landroid/view/LayoutInflater;

    .line 555
    .line 556
    check-cast p2, Landroid/view/ViewGroup;

    .line 557
    .line 558
    const p0, 0x7f0d03f7

    .line 559
    .line 560
    .line 561
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    if-eqz p0, :cond_8

    .line 566
    .line 567
    check-cast p0, Lorg/xplatform/uikit/components/header/Header;

    .line 568
    .line 569
    new-instance v6, La/swx;

    .line 570
    .line 571
    invoke-direct {v6, p0, p0}, La/swx;-><init>(Lorg/xplatform/uikit/components/header/Header;Lorg/xplatform/uikit/components/header/Header;)V

    .line 572
    .line 573
    .line 574
    goto :goto_4

    .line 575
    :cond_8
    const-string p0, "rootView"

    .line 576
    .line 577
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    :goto_4
    return-object v6

    .line 581
    :pswitch_1a
    check-cast p1, Landroid/view/LayoutInflater;

    .line 582
    .line 583
    check-cast p2, Landroid/view/ViewGroup;

    .line 584
    .line 585
    const p0, 0x7f0d03f6

    .line 586
    .line 587
    .line 588
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    invoke-static {p0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    check-cast p1, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 597
    .line 598
    if-eqz p1, :cond_9

    .line 599
    .line 600
    const v5, 0x7f0a10e3

    .line 601
    .line 602
    .line 603
    invoke-static {p0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 604
    .line 605
    .line 606
    move-result-object p2

    .line 607
    check-cast p2, Landroid/widget/TextView;

    .line 608
    .line 609
    if-eqz p2, :cond_9

    .line 610
    .line 611
    new-instance v6, La/rwx;

    .line 612
    .line 613
    check-cast p0, Landroid/widget/FrameLayout;

    .line 614
    .line 615
    invoke-direct {v6, p0, p1, p2}, La/rwx;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/separator/DsSeparator;Landroid/widget/TextView;)V

    .line 616
    .line 617
    .line 618
    goto :goto_5

    .line 619
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    invoke-virtual {p0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object p0

    .line 631
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    :goto_5
    return-object v6

    .line 635
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 636
    .line 637
    check-cast p2, Ljava/lang/String;

    .line 638
    .line 639
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    return-object p0

    .line 642
    :pswitch_1c
    check-cast p1, Landroid/view/LayoutInflater;

    .line 643
    .line 644
    check-cast p2, Landroid/view/ViewGroup;

    .line 645
    .line 646
    const p0, 0x7f0d03f4

    .line 647
    .line 648
    .line 649
    invoke-static {p1, p2, p0, p2, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    invoke-static {p0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 654
    .line 655
    .line 656
    move-result-object p1

    .line 657
    move-object v9, p1

    .line 658
    check-cast v9, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 659
    .line 660
    if-eqz v9, :cond_d

    .line 661
    .line 662
    invoke-static {p0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 663
    .line 664
    .line 665
    move-result-object p1

    .line 666
    check-cast p1, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 667
    .line 668
    if-eqz p1, :cond_c

    .line 669
    .line 670
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 671
    .line 672
    .line 673
    move-result-object p1

    .line 674
    move-object v10, p1

    .line 675
    check-cast v10, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 676
    .line 677
    if-eqz v10, :cond_b

    .line 678
    .line 679
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 680
    .line 681
    .line 682
    move-result-object p1

    .line 683
    move-object v11, p1

    .line 684
    check-cast v11, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 685
    .line 686
    if-eqz v11, :cond_e

    .line 687
    .line 688
    invoke-static {p0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 689
    .line 690
    .line 691
    move-result-object p1

    .line 692
    move-object v12, p1

    .line 693
    check-cast v12, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 694
    .line 695
    if-eqz v12, :cond_a

    .line 696
    .line 697
    new-instance v7, La/pwx;

    .line 698
    .line 699
    move-object v8, p0

    .line 700
    check-cast v8, Landroid/widget/LinearLayout;

    .line 701
    .line 702
    invoke-direct/range {v7 .. v12}, La/pwx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/separator/DsSeparator;)V

    .line 703
    .line 704
    .line 705
    move-object v6, v7

    .line 706
    goto :goto_7

    .line 707
    :cond_a
    move v0, v5

    .line 708
    goto :goto_6

    .line 709
    :cond_b
    move v0, v2

    .line 710
    goto :goto_6

    .line 711
    :cond_c
    move v0, v3

    .line 712
    goto :goto_6

    .line 713
    :cond_d
    move v0, v1

    .line 714
    :cond_e
    :goto_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 715
    .line 716
    .line 717
    move-result-object p0

    .line 718
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object p0

    .line 722
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object p0

    .line 726
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    :goto_7
    return-object v6

    .line 730
    nop

    .line 731
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
