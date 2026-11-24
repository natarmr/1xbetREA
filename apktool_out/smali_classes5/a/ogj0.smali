.class public final synthetic La/ogj0;
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
    iput-byte p1, p0, La/ogj0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ogj0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p0, p0, La/ogj0;->a:B

    .line 2
    .line 3
    const-string v0, "rootView"

    .line 4
    .line 5
    const-string v1, "Missing required view with ID: "

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Throwable;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/String;

    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p1, La/fet;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v3}, La/x8x;->L(I)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0, p1}, La/ay3;->v(ILa/fet;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p0, La/thj0;

    .line 48
    .line 49
    const/16 v0, 0xf

    .line 50
    .line 51
    invoke-direct {p0, v0}, La/thj0;-><init>(B)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance p0, La/hwi0;

    .line 58
    .line 59
    const/16 p1, 0x16

    .line 60
    .line 61
    invoke-direct {p0, p1}, La/hwi0;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    check-cast p2, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast p2, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast p2, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_5
    check-cast p1, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast p2, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_6
    check-cast p1, Landroid/view/LayoutInflater;

    .line 123
    .line 124
    check-cast p2, Landroid/view/ViewGroup;

    .line 125
    .line 126
    const p0, 0x7f0d0429

    .line 127
    .line 128
    .line 129
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-eqz p0, :cond_0

    .line 134
    .line 135
    check-cast p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 136
    .line 137
    new-instance v2, La/sxx;

    .line 138
    .line 139
    invoke-direct {v2, p0}, La/sxx;-><init>(Lorg/xplatform/uikit/components/cells/DsShimmerCell;)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :goto_0
    return-object v2

    .line 147
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 148
    .line 149
    check-cast p2, Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 152
    .line 153
    .line 154
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object p0

    .line 157
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 158
    .line 159
    check-cast p2, Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_9
    check-cast p1, Landroid/view/LayoutInflater;

    .line 168
    .line 169
    check-cast p2, Landroid/view/ViewGroup;

    .line 170
    .line 171
    const p0, 0x7f0d0374

    .line 172
    .line 173
    .line 174
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const p1, 0x7f0a01ca

    .line 179
    .line 180
    .line 181
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    move-object v5, p2

    .line 186
    check-cast v5, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 187
    .line 188
    if-eqz v5, :cond_1

    .line 189
    .line 190
    const p1, 0x7f0a0c9e

    .line 191
    .line 192
    .line 193
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    move-object v6, p2

    .line 198
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 199
    .line 200
    if-eqz v6, :cond_1

    .line 201
    .line 202
    const p1, 0x7f0a0f0f

    .line 203
    .line 204
    .line 205
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    if-eqz p2, :cond_1

    .line 210
    .line 211
    invoke-static {p2}, La/jk3;->a(Landroid/view/View;)La/jk3;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    const p1, 0x7f0a0f17

    .line 216
    .line 217
    .line 218
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    if-eqz p2, :cond_1

    .line 223
    .line 224
    invoke-static {p2}, La/jk3;->a(Landroid/view/View;)La/jk3;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    new-instance v3, La/wsx;

    .line 229
    .line 230
    move-object v4, p0

    .line 231
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 232
    .line 233
    invoke-direct/range {v3 .. v8}, La/wsx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;Landroidx/recyclerview/widget/RecyclerView;La/jk3;La/jk3;)V

    .line 234
    .line 235
    .line 236
    move-object v2, v3

    .line 237
    goto :goto_1

    .line 238
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_1
    return-object v2

    .line 254
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    check-cast p2, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_b
    check-cast p1, Ljava/lang/Long;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    check-cast p2, Ljava/lang/Boolean;

    .line 273
    .line 274
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_c
    check-cast p1, Landroid/view/LayoutInflater;

    .line 281
    .line 282
    check-cast p2, Landroid/view/ViewGroup;

    .line 283
    .line 284
    const p0, 0x7f0d0485

    .line 285
    .line 286
    .line 287
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    const p1, 0x7f0a0a90

    .line 292
    .line 293
    .line 294
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    check-cast p2, Landroid/widget/TextView;

    .line 299
    .line 300
    if-eqz p2, :cond_2

    .line 301
    .line 302
    const p1, 0x7f0a0b94

    .line 303
    .line 304
    .line 305
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, Landroid/widget/TextView;

    .line 310
    .line 311
    if-eqz v0, :cond_2

    .line 312
    .line 313
    const p1, 0x7f0a0bfe

    .line 314
    .line 315
    .line 316
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, Landroid/widget/ImageView;

    .line 321
    .line 322
    if-eqz v3, :cond_2

    .line 323
    .line 324
    const p1, 0x7f0a0bff

    .line 325
    .line 326
    .line 327
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    check-cast v3, Landroid/widget/TextView;

    .line 332
    .line 333
    if-eqz v3, :cond_2

    .line 334
    .line 335
    new-instance v2, La/v7z;

    .line 336
    .line 337
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 338
    .line 339
    invoke-direct {v2, p0, p2, v0, v3}, La/v7z;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    :goto_2
    return-object v2

    .line 359
    :pswitch_d
    check-cast p1, Landroid/view/LayoutInflater;

    .line 360
    .line 361
    check-cast p2, Landroid/view/ViewGroup;

    .line 362
    .line 363
    const p0, 0x7f0d0420

    .line 364
    .line 365
    .line 366
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    const p1, 0x7f0a1182

    .line 371
    .line 372
    .line 373
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object p2

    .line 377
    move-object v5, p2

    .line 378
    check-cast v5, Landroid/widget/TextView;

    .line 379
    .line 380
    if-eqz v5, :cond_3

    .line 381
    .line 382
    const p1, 0x7f0a1242

    .line 383
    .line 384
    .line 385
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 386
    .line 387
    .line 388
    move-result-object p2

    .line 389
    move-object v6, p2

    .line 390
    check-cast v6, Landroid/widget/TextView;

    .line 391
    .line 392
    if-eqz v6, :cond_3

    .line 393
    .line 394
    const p1, 0x7f0a1248

    .line 395
    .line 396
    .line 397
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    move-object v7, p2

    .line 402
    check-cast v7, Landroid/widget/TextView;

    .line 403
    .line 404
    if-eqz v7, :cond_3

    .line 405
    .line 406
    const p1, 0x7f0a13af

    .line 407
    .line 408
    .line 409
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    if-eqz v8, :cond_3

    .line 414
    .line 415
    const p1, 0x7f0a13b2

    .line 416
    .line 417
    .line 418
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    if-eqz v9, :cond_3

    .line 423
    .line 424
    new-instance v3, La/rxx;

    .line 425
    .line 426
    move-object v4, p0

    .line 427
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 428
    .line 429
    invoke-direct/range {v3 .. v9}, La/rxx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;)V

    .line 430
    .line 431
    .line 432
    move-object v2, v3

    .line 433
    goto :goto_3

    .line 434
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    :goto_3
    return-object v2

    .line 450
    :pswitch_e
    check-cast p1, La/fet;

    .line 451
    .line 452
    check-cast p2, Ljava/lang/Integer;

    .line 453
    .line 454
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    invoke-static {v3}, La/x8x;->L(I)I

    .line 458
    .line 459
    .line 460
    move-result p0

    .line 461
    invoke-static {p0, p1}, La/x2x;->r(ILa/fet;)V

    .line 462
    .line 463
    .line 464
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object p0

    .line 467
    :pswitch_f
    check-cast p1, La/fet;

    .line 468
    .line 469
    check-cast p2, Ljava/lang/Integer;

    .line 470
    .line 471
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-static {v3}, La/x8x;->L(I)I

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    invoke-static {p0, p1}, La/cy2;->r(ILa/fet;)V

    .line 479
    .line 480
    .line 481
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object p0

    .line 484
    :pswitch_10
    check-cast p1, La/fet;

    .line 485
    .line 486
    check-cast p2, Ljava/lang/Integer;

    .line 487
    .line 488
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-static {v3}, La/x8x;->L(I)I

    .line 492
    .line 493
    .line 494
    move-result p0

    .line 495
    invoke-static {p0, p1}, La/n2x;->k(ILa/fet;)V

    .line 496
    .line 497
    .line 498
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object p0

    .line 501
    :pswitch_11
    check-cast p1, La/fet;

    .line 502
    .line 503
    check-cast p2, Ljava/lang/Integer;

    .line 504
    .line 505
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    invoke-static {v3}, La/x8x;->L(I)I

    .line 509
    .line 510
    .line 511
    move-result p0

    .line 512
    invoke-static {p0, p1}, La/m2x;->g(ILa/fet;)V

    .line 513
    .line 514
    .line 515
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object p0

    .line 518
    :pswitch_12
    check-cast p1, La/fet;

    .line 519
    .line 520
    check-cast p2, Ljava/lang/Integer;

    .line 521
    .line 522
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-static {v3}, La/x8x;->L(I)I

    .line 526
    .line 527
    .line 528
    move-result p0

    .line 529
    invoke-static {p0, p1}, La/x1x;->q(ILa/fet;)V

    .line 530
    .line 531
    .line 532
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object p0

    .line 535
    :pswitch_13
    check-cast p1, La/fet;

    .line 536
    .line 537
    check-cast p2, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {v3}, La/x8x;->L(I)I

    .line 543
    .line 544
    .line 545
    move-result p0

    .line 546
    invoke-static {p0, p1}, La/s0x;->v(ILa/fet;)V

    .line 547
    .line 548
    .line 549
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object p0

    .line 552
    :pswitch_14
    check-cast p1, La/fet;

    .line 553
    .line 554
    check-cast p2, Ljava/lang/Integer;

    .line 555
    .line 556
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-static {v3}, La/x8x;->L(I)I

    .line 560
    .line 561
    .line 562
    move-result p0

    .line 563
    invoke-static {p0, p1}, La/cfx0;->w(ILa/fet;)V

    .line 564
    .line 565
    .line 566
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    return-object p0

    .line 569
    :pswitch_15
    check-cast p1, La/azg0;

    .line 570
    .line 571
    check-cast p2, La/xpj0;

    .line 572
    .line 573
    invoke-virtual {p2}, La/xpj0;->c()La/ypj0;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    return-object p0

    .line 578
    :pswitch_16
    check-cast p1, Ljava/lang/Throwable;

    .line 579
    .line 580
    check-cast p2, Ljava/lang/String;

    .line 581
    .line 582
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 583
    .line 584
    .line 585
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object p0

    .line 588
    :pswitch_17
    check-cast p1, La/fet;

    .line 589
    .line 590
    check-cast p2, Ljava/lang/Integer;

    .line 591
    .line 592
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    sget-object p0, La/rlj0;->O1:La/eke0;

    .line 596
    .line 597
    const p0, 0x5d1789ae

    .line 598
    .line 599
    .line 600
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 601
    .line 602
    .line 603
    sget-object p0, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 604
    .line 605
    invoke-static {p1}, La/zcm0;->i(La/fet;)La/djv0;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    iget-object p0, p0, La/djv0;->o:La/g3u0;

    .line 610
    .line 611
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 612
    .line 613
    .line 614
    return-object p0

    .line 615
    :pswitch_18
    check-cast p1, Landroid/view/LayoutInflater;

    .line 616
    .line 617
    check-cast p2, Landroid/view/ViewGroup;

    .line 618
    .line 619
    const p0, 0x7f0d0671

    .line 620
    .line 621
    .line 622
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 623
    .line 624
    .line 625
    move-result-object p0

    .line 626
    const p1, 0x7f0a092f

    .line 627
    .line 628
    .line 629
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 630
    .line 631
    .line 632
    move-result-object p2

    .line 633
    if-eqz p2, :cond_4

    .line 634
    .line 635
    new-instance v2, La/ddu0;

    .line 636
    .line 637
    check-cast p0, Landroid/widget/FrameLayout;

    .line 638
    .line 639
    invoke-direct {v2, p2, p0}, La/ddu0;-><init>(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 640
    .line 641
    .line 642
    goto :goto_4

    .line 643
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    :goto_4
    return-object v2

    .line 659
    :pswitch_19
    check-cast p1, Landroid/view/LayoutInflater;

    .line 660
    .line 661
    check-cast p2, Landroid/view/ViewGroup;

    .line 662
    .line 663
    const p0, 0x7f0d0670

    .line 664
    .line 665
    .line 666
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    const p1, 0x7f0a069d

    .line 671
    .line 672
    .line 673
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 674
    .line 675
    .line 676
    move-result-object p2

    .line 677
    check-cast p2, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 678
    .line 679
    if-eqz p2, :cond_5

    .line 680
    .line 681
    new-instance v2, La/cdu0;

    .line 682
    .line 683
    check-cast p0, Landroid/widget/FrameLayout;

    .line 684
    .line 685
    invoke-direct {v2, p0, p2}, La/cdu0;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 686
    .line 687
    .line 688
    goto :goto_5

    .line 689
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 690
    .line 691
    .line 692
    move-result-object p0

    .line 693
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object p0

    .line 697
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    :goto_5
    return-object v2

    .line 705
    :pswitch_1a
    check-cast p1, Landroid/view/LayoutInflater;

    .line 706
    .line 707
    check-cast p2, Landroid/view/ViewGroup;

    .line 708
    .line 709
    const p0, 0x7f0d0672

    .line 710
    .line 711
    .line 712
    invoke-static {p1, p2, p0, p2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 713
    .line 714
    .line 715
    move-result-object p0

    .line 716
    if-eqz p0, :cond_6

    .line 717
    .line 718
    new-instance v2, La/edu0;

    .line 719
    .line 720
    invoke-direct {v2, p0, p0}, La/edu0;-><init>(Landroid/view/View;Landroid/view/View;)V

    .line 721
    .line 722
    .line 723
    goto :goto_6

    .line 724
    :cond_6
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    :goto_6
    return-object v2

    .line 728
    :pswitch_1b
    check-cast p1, Landroid/view/LayoutInflater;

    .line 729
    .line 730
    check-cast p2, Landroid/view/ViewGroup;

    .line 731
    .line 732
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    invoke-static {p1, p2, v4}, La/kxx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La/kxx;

    .line 739
    .line 740
    .line 741
    move-result-object p0

    .line 742
    return-object p0

    .line 743
    :pswitch_1c
    check-cast p1, Landroid/view/LayoutInflater;

    .line 744
    .line 745
    check-cast p2, Landroid/view/ViewGroup;

    .line 746
    .line 747
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    invoke-static {p1, p2, v4}, La/kxx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La/kxx;

    .line 754
    .line 755
    .line 756
    move-result-object p0

    .line 757
    return-object p0

    .line 758
    nop

    .line 759
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
