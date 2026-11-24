.class public final synthetic La/kyz;
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
    iput-byte p1, p0, La/kyz;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/kyz;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/kyz;->a:B

    .line 4
    .line 5
    const-string v1, "Missing required view with ID: "

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p1

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Throwable;

    .line 16
    .line 17
    move-object/from16 v1, p2

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Throwable;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_1
    move-object/from16 v0, p1

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Throwable;

    .line 44
    .line 45
    move-object/from16 v1, p2

    .line 46
    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_2
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Throwable;

    .line 58
    .line 59
    move-object/from16 v1, p2

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_3
    move-object/from16 v0, p1

    .line 70
    .line 71
    check-cast v0, Ljava/lang/Throwable;

    .line 72
    .line 73
    move-object/from16 v1, p2

    .line 74
    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_4
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Throwable;

    .line 86
    .line 87
    move-object/from16 v1, p2

    .line 88
    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_5
    move-object/from16 v0, p1

    .line 98
    .line 99
    check-cast v0, La/fet;

    .line 100
    .line 101
    move-object/from16 v1, p2

    .line 102
    .line 103
    check-cast v1, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v4}, La/x8x;->L(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v1, v0}, La/hew0;->s(ILa/fet;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_6
    move-object/from16 v0, p1

    .line 119
    .line 120
    check-cast v0, La/e7z;

    .line 121
    .line 122
    move-object/from16 v0, p2

    .line 123
    .line 124
    check-cast v0, La/j810;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_7
    move-object/from16 v0, p1

    .line 133
    .line 134
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 135
    .line 136
    move-object/from16 v1, p2

    .line 137
    .line 138
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v2, La/p610;

    .line 147
    .line 148
    const/4 v3, 0x2

    .line 149
    invoke-direct {v2, v3}, La/p610;-><init>(B)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    new-instance v0, La/t010;

    .line 156
    .line 157
    const/16 v2, 0x14

    .line 158
    .line 159
    invoke-direct {v0, v2}, La/t010;-><init>(B)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_8
    move-object/from16 v0, p1

    .line 169
    .line 170
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 171
    .line 172
    move-object/from16 v1, p2

    .line 173
    .line 174
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v2, La/p610;

    .line 183
    .line 184
    invoke-direct {v2, v4}, La/p610;-><init>(B)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    new-instance v0, La/t010;

    .line 191
    .line 192
    const/16 v2, 0x13

    .line 193
    .line 194
    invoke-direct {v0, v2}, La/t010;-><init>(B)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_9
    move-object/from16 v0, p1

    .line 204
    .line 205
    check-cast v0, La/oyg0;

    .line 206
    .line 207
    move-object/from16 v5, p2

    .line 208
    .line 209
    check-cast v5, La/m310;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object v6, v5, La/m310;->j:La/g310;

    .line 218
    .line 219
    iget-boolean v0, v6, La/g310;->g:Z

    .line 220
    .line 221
    xor-int/lit8 v17, v0, 0x1

    .line 222
    .line 223
    const/16 v18, 0xbf

    .line 224
    .line 225
    const-wide/16 v7, 0x0

    .line 226
    .line 227
    const-wide/16 v9, 0x0

    .line 228
    .line 229
    const/4 v11, 0x0

    .line 230
    const-wide/16 v12, 0x0

    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const-wide/16 v15, 0x0

    .line 234
    .line 235
    invoke-static/range {v6 .. v18}, La/g310;->a(La/g310;JJLa/o4i0;JLjava/util/ArrayList;JZI)La/g310;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const v22, 0x1fffdff

    .line 242
    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    const/4 v7, 0x0

    .line 246
    const/4 v8, 0x0

    .line 247
    const/4 v9, 0x0

    .line 248
    const/4 v10, 0x0

    .line 249
    const/4 v12, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    const/16 v16, 0x0

    .line 252
    .line 253
    const/16 v17, 0x0

    .line 254
    .line 255
    const/16 v18, 0x0

    .line 256
    .line 257
    const/16 v19, 0x0

    .line 258
    .line 259
    const/16 v20, 0x0

    .line 260
    .line 261
    invoke-static/range {v5 .. v22}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    return-object v0

    .line 266
    :pswitch_a
    move-object/from16 v0, p1

    .line 267
    .line 268
    check-cast v0, Ljava/lang/Throwable;

    .line 269
    .line 270
    move-object/from16 v1, p2

    .line 271
    .line 272
    check-cast v1, Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_b
    move-object/from16 v0, p1

    .line 284
    .line 285
    check-cast v0, Ljava/lang/Throwable;

    .line 286
    .line 287
    move-object/from16 v1, p2

    .line 288
    .line 289
    check-cast v1, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_c
    move-object/from16 v0, p1

    .line 301
    .line 302
    check-cast v0, La/fet;

    .line 303
    .line 304
    move-object/from16 v1, p2

    .line 305
    .line 306
    check-cast v1, Ljava/lang/Integer;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {v4}, La/x8x;->L(I)I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    invoke-static {v1, v0}, La/cwr0;->p(ILa/fet;)V

    .line 316
    .line 317
    .line 318
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_d
    move-object/from16 v0, p1

    .line 322
    .line 323
    check-cast v0, La/fet;

    .line 324
    .line 325
    move-object/from16 v1, p2

    .line 326
    .line 327
    check-cast v1, Ljava/lang/Integer;

    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-static {v4}, La/x8x;->L(I)I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    invoke-static {v1, v0}, La/rsr0;->N(ILa/fet;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_e
    move-object/from16 v0, p1

    .line 343
    .line 344
    check-cast v0, Landroid/view/LayoutInflater;

    .line 345
    .line 346
    move-object/from16 v1, p2

    .line 347
    .line 348
    check-cast v1, Landroid/view/ViewGroup;

    .line 349
    .line 350
    const v5, 0x7f0d0112

    .line 351
    .line 352
    .line 353
    invoke-static {v0, v1, v5, v1, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-eqz v0, :cond_0

    .line 358
    .line 359
    new-instance v2, La/auh;

    .line 360
    .line 361
    check-cast v0, Landroid/widget/FrameLayout;

    .line 362
    .line 363
    invoke-direct {v2, v0, v4}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 364
    .line 365
    .line 366
    goto :goto_0

    .line 367
    :cond_0
    const-string v0, "rootView"

    .line 368
    .line 369
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :goto_0
    return-object v2

    .line 373
    :pswitch_f
    move-object/from16 v0, p1

    .line 374
    .line 375
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 376
    .line 377
    move-object/from16 v1, p2

    .line 378
    .line 379
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance v2, La/w800;

    .line 388
    .line 389
    const/16 v3, 0x9

    .line 390
    .line 391
    invoke-direct {v2, v3}, La/w800;-><init>(B)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    new-instance v0, La/x800;

    .line 398
    .line 399
    const/4 v2, 0x3

    .line 400
    invoke-direct {v0, v2}, La/x800;-><init>(B)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_10
    move-object/from16 v0, p1

    .line 410
    .line 411
    check-cast v0, Landroid/view/LayoutInflater;

    .line 412
    .line 413
    move-object/from16 v4, p2

    .line 414
    .line 415
    check-cast v4, Landroid/view/ViewGroup;

    .line 416
    .line 417
    const v5, 0x7f0d0370

    .line 418
    .line 419
    .line 420
    invoke-static {v0, v4, v5, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    const v3, 0x7f0a01ca

    .line 425
    .line 426
    .line 427
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    check-cast v4, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 432
    .line 433
    if-eqz v4, :cond_1

    .line 434
    .line 435
    const v3, 0x7f0a0c8b

    .line 436
    .line 437
    .line 438
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 443
    .line 444
    if-eqz v5, :cond_1

    .line 445
    .line 446
    const v3, 0x7f0a0c8c

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 454
    .line 455
    if-eqz v6, :cond_1

    .line 456
    .line 457
    new-instance v2, La/ssx;

    .line 458
    .line 459
    check-cast v0, Landroid/widget/LinearLayout;

    .line 460
    .line 461
    invoke-direct {v2, v0, v4, v5, v6}, La/ssx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 462
    .line 463
    .line 464
    goto :goto_1

    .line 465
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :goto_1
    return-object v2

    .line 481
    :pswitch_11
    move-object/from16 v0, p1

    .line 482
    .line 483
    check-cast v0, Landroid/view/LayoutInflater;

    .line 484
    .line 485
    move-object/from16 v4, p2

    .line 486
    .line 487
    check-cast v4, Landroid/view/ViewGroup;

    .line 488
    .line 489
    const v5, 0x7f0d03db

    .line 490
    .line 491
    .line 492
    invoke-static {v0, v4, v5, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    const v3, 0x7f0a00e9

    .line 497
    .line 498
    .line 499
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    .line 504
    .line 505
    if-eqz v4, :cond_2

    .line 506
    .line 507
    const v3, 0x7f0a00ea

    .line 508
    .line 509
    .line 510
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    .line 515
    .line 516
    if-eqz v4, :cond_2

    .line 517
    .line 518
    const v3, 0x7f0a0852

    .line 519
    .line 520
    .line 521
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    move-object v7, v4

    .line 526
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 527
    .line 528
    if-eqz v7, :cond_2

    .line 529
    .line 530
    const v3, 0x7f0a08b3

    .line 531
    .line 532
    .line 533
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    move-object v8, v4

    .line 538
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 539
    .line 540
    if-eqz v8, :cond_2

    .line 541
    .line 542
    const v3, 0x7f0a10d6

    .line 543
    .line 544
    .line 545
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    move-object v9, v4

    .line 550
    check-cast v9, Landroid/widget/TextView;

    .line 551
    .line 552
    if-eqz v9, :cond_2

    .line 553
    .line 554
    const v3, 0x7f0a110a

    .line 555
    .line 556
    .line 557
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    move-object v10, v4

    .line 562
    check-cast v10, Landroid/widget/TextView;

    .line 563
    .line 564
    if-eqz v10, :cond_2

    .line 565
    .line 566
    const v3, 0x7f0a11ef

    .line 567
    .line 568
    .line 569
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    move-object v11, v4

    .line 574
    check-cast v11, Landroid/widget/TextView;

    .line 575
    .line 576
    if-eqz v11, :cond_2

    .line 577
    .line 578
    const v3, 0x7f0a11f6

    .line 579
    .line 580
    .line 581
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    move-object v12, v4

    .line 586
    check-cast v12, Landroid/widget/TextView;

    .line 587
    .line 588
    if-eqz v12, :cond_2

    .line 589
    .line 590
    const v3, 0x7f0a137b

    .line 591
    .line 592
    .line 593
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 594
    .line 595
    .line 596
    move-result-object v13

    .line 597
    if-eqz v13, :cond_2

    .line 598
    .line 599
    const v3, 0x7f0a139f

    .line 600
    .line 601
    .line 602
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 603
    .line 604
    .line 605
    move-result-object v14

    .line 606
    if-eqz v14, :cond_2

    .line 607
    .line 608
    new-instance v5, La/dwx;

    .line 609
    .line 610
    move-object v6, v0

    .line 611
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 612
    .line 613
    invoke-direct/range {v5 .. v14}, La/dwx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;)V

    .line 614
    .line 615
    .line 616
    move-object v2, v5

    .line 617
    goto :goto_2

    .line 618
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    :goto_2
    return-object v2

    .line 634
    :pswitch_12
    move-object/from16 v0, p1

    .line 635
    .line 636
    check-cast v0, Landroid/view/LayoutInflater;

    .line 637
    .line 638
    move-object/from16 v4, p2

    .line 639
    .line 640
    check-cast v4, Landroid/view/ViewGroup;

    .line 641
    .line 642
    const v5, 0x7f0d03da

    .line 643
    .line 644
    .line 645
    invoke-static {v0, v4, v5, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    const v3, 0x7f0a1151

    .line 650
    .line 651
    .line 652
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    check-cast v4, Landroid/widget/TextView;

    .line 657
    .line 658
    if-eqz v4, :cond_3

    .line 659
    .line 660
    new-instance v2, La/cwx;

    .line 661
    .line 662
    check-cast v0, Landroid/widget/LinearLayout;

    .line 663
    .line 664
    invoke-direct {v2, v0, v4}, La/cwx;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 665
    .line 666
    .line 667
    goto :goto_3

    .line 668
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    :goto_3
    return-object v2

    .line 684
    :pswitch_13
    move-object/from16 v0, p1

    .line 685
    .line 686
    check-cast v0, Landroid/view/LayoutInflater;

    .line 687
    .line 688
    move-object/from16 v1, p2

    .line 689
    .line 690
    check-cast v1, Landroid/view/ViewGroup;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    invoke-static {v0, v1}, La/bwx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bwx;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    return-object v0

    .line 703
    :pswitch_14
    move-object/from16 v0, p1

    .line 704
    .line 705
    check-cast v0, Landroid/view/LayoutInflater;

    .line 706
    .line 707
    move-object/from16 v1, p2

    .line 708
    .line 709
    check-cast v1, Landroid/view/ViewGroup;

    .line 710
    .line 711
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    invoke-static {v0, v1}, La/zvx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/zvx;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    return-object v0

    .line 722
    :pswitch_15
    move-object/from16 v0, p1

    .line 723
    .line 724
    check-cast v0, Landroid/view/LayoutInflater;

    .line 725
    .line 726
    move-object/from16 v1, p2

    .line 727
    .line 728
    check-cast v1, Landroid/view/ViewGroup;

    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    invoke-static {v0, v1}, La/zvx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/zvx;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    return-object v0

    .line 741
    :pswitch_16
    move-object/from16 v0, p1

    .line 742
    .line 743
    check-cast v0, Landroid/view/LayoutInflater;

    .line 744
    .line 745
    move-object/from16 v4, p2

    .line 746
    .line 747
    check-cast v4, Landroid/view/ViewGroup;

    .line 748
    .line 749
    const v5, 0x7f0d03d8

    .line 750
    .line 751
    .line 752
    invoke-static {v0, v4, v5, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    move-object v3, v0

    .line 757
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 758
    .line 759
    const v4, 0x7f0a03b3

    .line 760
    .line 761
    .line 762
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    check-cast v5, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 767
    .line 768
    if-eqz v5, :cond_4

    .line 769
    .line 770
    const v4, 0x7f0a0730

    .line 771
    .line 772
    .line 773
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 774
    .line 775
    .line 776
    move-result-object v6

    .line 777
    check-cast v6, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 778
    .line 779
    if-eqz v6, :cond_4

    .line 780
    .line 781
    const v4, 0x7f0a0fce

    .line 782
    .line 783
    .line 784
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 785
    .line 786
    .line 787
    move-result-object v7

    .line 788
    check-cast v7, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 789
    .line 790
    if-eqz v7, :cond_4

    .line 791
    .line 792
    new-instance v2, La/awx;

    .line 793
    .line 794
    invoke-direct {v2, v3, v5, v6, v7}, La/awx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 795
    .line 796
    .line 797
    goto :goto_4

    .line 798
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    :goto_4
    return-object v2

    .line 814
    :pswitch_17
    move-object/from16 v0, p1

    .line 815
    .line 816
    check-cast v0, Landroid/view/LayoutInflater;

    .line 817
    .line 818
    move-object/from16 v1, p2

    .line 819
    .line 820
    check-cast v1, Landroid/view/ViewGroup;

    .line 821
    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    invoke-static {v0, v1}, La/zvx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/zvx;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    return-object v0

    .line 833
    :pswitch_18
    move-object/from16 v0, p1

    .line 834
    .line 835
    check-cast v0, Ljava/lang/Float;

    .line 836
    .line 837
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-object/from16 v0, p2

    .line 841
    .line 842
    check-cast v0, Ljava/lang/Float;

    .line 843
    .line 844
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    sget v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->k1:I

    .line 848
    .line 849
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 850
    .line 851
    return-object v0

    .line 852
    :pswitch_19
    move-object/from16 v0, p1

    .line 853
    .line 854
    check-cast v0, Ljava/lang/Throwable;

    .line 855
    .line 856
    move-object/from16 v1, p2

    .line 857
    .line 858
    check-cast v1, Ljava/lang/String;

    .line 859
    .line 860
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 867
    .line 868
    return-object v0

    .line 869
    :pswitch_1a
    move-object/from16 v0, p1

    .line 870
    .line 871
    check-cast v0, La/fet;

    .line 872
    .line 873
    move-object/from16 v1, p2

    .line 874
    .line 875
    check-cast v1, Ljava/lang/Integer;

    .line 876
    .line 877
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    invoke-static {v4}, La/x8x;->L(I)I

    .line 881
    .line 882
    .line 883
    move-result v1

    .line 884
    invoke-static {v1, v0}, La/ccq0;->C(ILa/fet;)V

    .line 885
    .line 886
    .line 887
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 888
    .line 889
    return-object v0

    .line 890
    :pswitch_1b
    move-object/from16 v0, p1

    .line 891
    .line 892
    check-cast v0, La/fet;

    .line 893
    .line 894
    move-object/from16 v1, p2

    .line 895
    .line 896
    check-cast v1, Ljava/lang/Integer;

    .line 897
    .line 898
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    invoke-static {v4}, La/x8x;->L(I)I

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    invoke-static {v1, v0}, La/unh0;->K(ILa/fet;)V

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :pswitch_1c
    move-object/from16 v0, p1

    .line 912
    .line 913
    check-cast v0, La/fet;

    .line 914
    .line 915
    move-object/from16 v1, p2

    .line 916
    .line 917
    check-cast v1, Ljava/lang/Integer;

    .line 918
    .line 919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-static {v4}, La/x8x;->L(I)I

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    invoke-static {v1, v0}, La/x4d0;->J(ILa/fet;)V

    .line 927
    .line 928
    .line 929
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 930
    .line 931
    return-object v0

    .line 932
    nop

    .line 933
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
