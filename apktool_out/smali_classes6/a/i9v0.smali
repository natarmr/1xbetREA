.class public final synthetic La/i9v0;
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
    iput-byte p1, p0, La/i9v0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/i9v0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/i9v0;->a:B

    .line 4
    .line 5
    const v1, 0x7f0a0fce

    .line 6
    .line 7
    .line 8
    const-string v2, "Missing required view with ID: "

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, La/q3u0;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, Ljava/util/List;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    sget-object v0, La/s1w0;->a:La/q3u0;

    .line 27
    .line 28
    :cond_0
    return-object v0

    .line 29
    :pswitch_0
    move-object/from16 v0, p1

    .line 30
    .line 31
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    move-object/from16 v1, p2

    .line 34
    .line 35
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v2, La/ejv0;

    .line 44
    .line 45
    const/16 v3, 0x15

    .line 46
    .line 47
    invoke-direct {v2, v3}, La/ejv0;-><init>(B)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    new-instance v0, La/y9v0;

    .line 54
    .line 55
    const/16 v2, 0xe

    .line 56
    .line 57
    invoke-direct {v0, v2}, La/y9v0;-><init>(B)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_1
    move-object/from16 v1, p1

    .line 67
    .line 68
    check-cast v1, La/i8z;

    .line 69
    .line 70
    move-object/from16 v0, p2

    .line 71
    .line 72
    check-cast v0, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v2, La/uli0;

    .line 82
    .line 83
    const/16 v3, 0x8

    .line 84
    .line 85
    invoke-direct {v2, v0, v3}, La/uli0;-><init>(IB)V

    .line 86
    .line 87
    .line 88
    sget-object v0, La/xf0;->q:La/ugd;

    .line 89
    .line 90
    invoke-static {v1, v2, v0}, La/i8z;->d(La/i8z;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 91
    .line 92
    .line 93
    new-instance v2, La/gtr;

    .line 94
    .line 95
    invoke-direct {v2, v4}, La/gtr;-><init>(Z)V

    .line 96
    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    const/16 v6, 0xe

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v4, 0x0

    .line 103
    invoke-static/range {v1 .. v6}, La/uzb;->U(La/i8z;La/htr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/xz8;I)V

    .line 104
    .line 105
    .line 106
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_2
    move-object/from16 v0, p1

    .line 110
    .line 111
    check-cast v0, Landroid/view/LayoutInflater;

    .line 112
    .line 113
    move-object/from16 v1, p2

    .line 114
    .line 115
    check-cast v1, Landroid/view/ViewGroup;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1}, La/bzx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bzx;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0

    .line 128
    :pswitch_3
    move-object/from16 v0, p1

    .line 129
    .line 130
    check-cast v0, Landroid/view/LayoutInflater;

    .line 131
    .line 132
    move-object/from16 v4, p2

    .line 133
    .line 134
    check-cast v4, Landroid/view/ViewGroup;

    .line 135
    .line 136
    const v6, 0x7f0d046c

    .line 137
    .line 138
    .line 139
    invoke-static {v0, v4, v6, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const v3, 0x7f0a0261

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    move-object v8, v4

    .line 151
    check-cast v8, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 152
    .line 153
    if-eqz v8, :cond_1

    .line 154
    .line 155
    const v3, 0x7f0a062c

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    move-object v9, v4

    .line 163
    check-cast v9, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 164
    .line 165
    if-eqz v9, :cond_1

    .line 166
    .line 167
    const v3, 0x7f0a0730

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    move-object v10, v4

    .line 175
    check-cast v10, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 176
    .line 177
    if-eqz v10, :cond_1

    .line 178
    .line 179
    const v3, 0x7f0a0a52

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    move-object v11, v4

    .line 187
    check-cast v11, Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 188
    .line 189
    if-eqz v11, :cond_1

    .line 190
    .line 191
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    move-object v12, v3

    .line 196
    check-cast v12, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 197
    .line 198
    if-eqz v12, :cond_2

    .line 199
    .line 200
    new-instance v6, La/azx;

    .line 201
    .line 202
    move-object v7, v0

    .line 203
    check-cast v7, Landroid/widget/LinearLayout;

    .line 204
    .line 205
    invoke-direct/range {v6 .. v12}, La/azx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 206
    .line 207
    .line 208
    move-object v5, v6

    .line 209
    goto :goto_0

    .line 210
    :cond_1
    move v1, v3

    .line 211
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_0
    return-object v5

    .line 227
    :pswitch_4
    move-object/from16 v0, p1

    .line 228
    .line 229
    check-cast v0, La/azg0;

    .line 230
    .line 231
    move-object/from16 v1, p2

    .line 232
    .line 233
    check-cast v1, La/ywv0;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v0, v1, La/ywv0;->b:La/h0q0;

    .line 242
    .line 243
    invoke-virtual {v0}, La/h0q0;->l()La/bsv0;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget-object v3, v2, La/bsv0;->a:La/esv0;

    .line 251
    .line 252
    instance-of v6, v3, La/dsv0;

    .line 253
    .line 254
    sget-object v7, La/csv0;->a:La/csv0;

    .line 255
    .line 256
    if-eqz v6, :cond_3

    .line 257
    .line 258
    check-cast v3, La/dsv0;

    .line 259
    .line 260
    iget v3, v3, La/dsv0;->a:F

    .line 261
    .line 262
    new-instance v6, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v8, "REST:"

    .line 265
    .line 266
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    goto :goto_1

    .line 277
    :cond_3
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-eqz v3, :cond_19

    .line 282
    .line 283
    const-string v3, "REST:CONTENT"

    .line 284
    .line 285
    :goto_1
    iget-object v2, v2, La/bsv0;->b:La/esv0;

    .line 286
    .line 287
    if-nez v2, :cond_4

    .line 288
    .line 289
    const-string v2, "EXPAND:NONE"

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_4
    instance-of v6, v2, La/dsv0;

    .line 293
    .line 294
    if-eqz v6, :cond_5

    .line 295
    .line 296
    check-cast v2, La/dsv0;

    .line 297
    .line 298
    iget v2, v2, La/dsv0;->a:F

    .line 299
    .line 300
    new-instance v6, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v7, "EXPAND:"

    .line 303
    .line 304
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    goto :goto_2

    .line 315
    :cond_5
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_18

    .line 320
    .line 321
    const-string v2, "EXPAND:CONTENT"

    .line 322
    .line 323
    :goto_2
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    const/4 v10, 0x0

    .line 332
    const/16 v11, 0x3e

    .line 333
    .line 334
    const-string v7, "|"

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    const/4 v9, 0x0

    .line 338
    invoke-static/range {v6 .. v11}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    new-instance v6, Lkotlin/Pair;

    .line 343
    .line 344
    const-string v3, "KEY_ANCHOR_MODEL"

    .line 345
    .line 346
    invoke-direct {v6, v3, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    iget-object v2, v2, La/bxv0;->c:La/lsv0;

    .line 354
    .line 355
    instance-of v3, v2, La/isv0;

    .line 356
    .line 357
    const-string v7, "NONE"

    .line 358
    .line 359
    if-eqz v3, :cond_7

    .line 360
    .line 361
    check-cast v2, La/isv0;

    .line 362
    .line 363
    iget-boolean v2, v2, La/isv0;->a:Z

    .line 364
    .line 365
    if-eqz v2, :cond_6

    .line 366
    .line 367
    const-string v2, "DIM_BEHIND_DISMISS_TRUE"

    .line 368
    .line 369
    :goto_3
    move-object v3, v7

    .line 370
    goto :goto_4

    .line 371
    :cond_6
    const-string v2, "DIM_BEHIND_DISMISS_FALSE"

    .line 372
    .line 373
    goto :goto_3

    .line 374
    :cond_7
    sget-object v3, La/ksv0;->a:La/ksv0;

    .line 375
    .line 376
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-eqz v3, :cond_8

    .line 381
    .line 382
    const-string v2, "SHADOW_ONLY"

    .line 383
    .line 384
    goto :goto_3

    .line 385
    :cond_8
    sget-object v3, La/jsv0;->a:La/jsv0;

    .line 386
    .line 387
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    if-eqz v2, :cond_17

    .line 392
    .line 393
    move-object v2, v7

    .line 394
    move-object v3, v2

    .line 395
    :goto_4
    new-instance v7, Lkotlin/Pair;

    .line 396
    .line 397
    const-string v8, "KEY_BACKDROP"

    .line 398
    .line 399
    invoke-direct {v7, v8, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    iget-object v2, v2, La/bxv0;->a:La/cxv0;

    .line 407
    .line 408
    iget-wide v8, v2, La/cxv0;->a:J

    .line 409
    .line 410
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    new-instance v8, Lkotlin/Pair;

    .line 415
    .line 416
    const-string v9, "KEY_SHEET_BACKGROUND_COLOR"

    .line 417
    .line 418
    invoke-direct {v8, v9, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iget-object v2, v2, La/bxv0;->b:La/jtv0;

    .line 426
    .line 427
    iget-object v2, v2, La/jtv0;->a:La/qtv0;

    .line 428
    .line 429
    instance-of v9, v2, La/ptv0;

    .line 430
    .line 431
    if-eqz v9, :cond_a

    .line 432
    .line 433
    check-cast v2, La/ptv0;

    .line 434
    .line 435
    iget-wide v9, v2, La/ptv0;->a:J

    .line 436
    .line 437
    const-wide/16 v11, 0x10

    .line 438
    .line 439
    cmp-long v2, v9, v11

    .line 440
    .line 441
    if-eqz v2, :cond_9

    .line 442
    .line 443
    const-string v2, "THEME:"

    .line 444
    .line 445
    invoke-static {v9, v10, v2}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    goto :goto_5

    .line 450
    :cond_9
    const-string v2, "THEME"

    .line 451
    .line 452
    goto :goto_5

    .line 453
    :cond_a
    sget-object v9, La/otv0;->a:La/otv0;

    .line 454
    .line 455
    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    if-eqz v9, :cond_b

    .line 460
    .line 461
    const-string v2, "STATIC"

    .line 462
    .line 463
    goto :goto_5

    .line 464
    :cond_b
    if-nez v2, :cond_16

    .line 465
    .line 466
    move-object v2, v3

    .line 467
    :goto_5
    new-instance v9, Lkotlin/Pair;

    .line 468
    .line 469
    const-string v10, "KEY_DRAG_HANDLE_STYLE"

    .line 470
    .line 471
    invoke-direct {v9, v10, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    iget-wide v10, v2, La/bxv0;->d:J

    .line 479
    .line 480
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    new-instance v10, Lkotlin/Pair;

    .line 485
    .line 486
    const-string v11, "KEY_SCRIM_COLOR"

    .line 487
    .line 488
    invoke-direct {v10, v11, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    iget-object v1, v1, La/ywv0;->d:La/glt0;

    .line 492
    .line 493
    invoke-virtual {v1}, La/glt0;->d()La/lxv0;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    sget-object v2, La/jxv0;->a:La/jxv0;

    .line 501
    .line 502
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    if-eqz v2, :cond_c

    .line 507
    .line 508
    const-string v1, "SHEET_VALUE_HIDDEN_TAG"

    .line 509
    .line 510
    goto :goto_6

    .line 511
    :cond_c
    sget-object v2, La/kxv0;->a:La/kxv0;

    .line 512
    .line 513
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_d

    .line 518
    .line 519
    const-string v1, "SHEET_VALUE_REST_TAG"

    .line 520
    .line 521
    goto :goto_6

    .line 522
    :cond_d
    sget-object v2, La/ixv0;->a:La/ixv0;

    .line 523
    .line 524
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    if-eqz v1, :cond_15

    .line 529
    .line 530
    const-string v1, "SHEET_VALUE_EXPAND_TAG"

    .line 531
    .line 532
    :goto_6
    new-instance v11, Lkotlin/Pair;

    .line 533
    .line 534
    const-string v2, "KEY_CURRENT_VALUE"

    .line 535
    .line 536
    invoke-direct {v11, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    iget-boolean v1, v1, La/bxv0;->e:Z

    .line 544
    .line 545
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    new-instance v12, Lkotlin/Pair;

    .line 550
    .line 551
    const-string v2, "KEY_HORIZONTAL_SWIPE_ENABLED"

    .line 552
    .line 553
    invoke-direct {v12, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    iget-object v1, v1, La/bxv0;->b:La/jtv0;

    .line 561
    .line 562
    iget-wide v1, v1, La/jtv0;->b:J

    .line 563
    .line 564
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    new-instance v13, Lkotlin/Pair;

    .line 569
    .line 570
    const-string v2, "KEY_DRAG_HANDLE_BACKGROUND_COLOR"

    .line 571
    .line 572
    invoke-direct {v13, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    iget-object v1, v1, La/bxv0;->f:La/stv0;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-eqz v1, :cond_10

    .line 586
    .line 587
    if-eq v1, v4, :cond_f

    .line 588
    .line 589
    const/4 v2, 0x2

    .line 590
    if-ne v1, v2, :cond_e

    .line 591
    .line 592
    move-object v1, v3

    .line 593
    goto :goto_7

    .line 594
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_a

    .line 598
    .line 599
    :cond_f
    const-string v1, "ANCHORS_ONLY"

    .line 600
    .line 601
    goto :goto_7

    .line 602
    :cond_10
    const-string v1, "FREE"

    .line 603
    .line 604
    :goto_7
    new-instance v14, Lkotlin/Pair;

    .line 605
    .line 606
    const-string v2, "KEY_DRAG_MODE"

    .line 607
    .line 608
    invoke-direct {v14, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    iget-object v1, v1, La/bxv0;->b:La/jtv0;

    .line 616
    .line 617
    iget-object v1, v1, La/jtv0;->c:La/ntv0;

    .line 618
    .line 619
    sget-object v2, La/mtv0;->a:La/mtv0;

    .line 620
    .line 621
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    if-eqz v2, :cond_11

    .line 626
    .line 627
    const-string v1, "STACKED"

    .line 628
    .line 629
    goto :goto_8

    .line 630
    :cond_11
    sget-object v2, La/ltv0;->a:La/ltv0;

    .line 631
    .line 632
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-eqz v1, :cond_14

    .line 637
    .line 638
    const-string v1, "OVERLAY"

    .line 639
    .line 640
    :goto_8
    new-instance v15, Lkotlin/Pair;

    .line 641
    .line 642
    const-string v2, "KEY_DRAG_HANDLE_PLACEMENT"

    .line 643
    .line 644
    invoke-direct {v15, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    iget-object v1, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v1, La/pz40;

    .line 650
    .line 651
    check-cast v1, La/hgk0;

    .line 652
    .line 653
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    check-cast v1, La/ssv0;

    .line 658
    .line 659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-eqz v1, :cond_13

    .line 667
    .line 668
    if-ne v1, v4, :cond_12

    .line 669
    .line 670
    const-string v1, "STAY_UNDER_KEYBOARD"

    .line 671
    .line 672
    goto :goto_9

    .line 673
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 674
    .line 675
    .line 676
    goto/16 :goto_a

    .line 677
    .line 678
    :cond_13
    const-string v1, "LIFT"

    .line 679
    .line 680
    :goto_9
    new-instance v2, Lkotlin/Pair;

    .line 681
    .line 682
    const-string v3, "KEY_BOTTOM_KEYBOARD_PLACEMENT"

    .line 683
    .line 684
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    iget-object v1, v1, La/bxv0;->a:La/cxv0;

    .line 692
    .line 693
    iget v1, v1, La/cxv0;->b:F

    .line 694
    .line 695
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    new-instance v3, Lkotlin/Pair;

    .line 700
    .line 701
    const-string v4, "KEY_SHEET_CORNER_RADIUS"

    .line 702
    .line 703
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    iget-object v1, v1, La/bxv0;->b:La/jtv0;

    .line 711
    .line 712
    iget-wide v4, v1, La/jtv0;->e:J

    .line 713
    .line 714
    invoke-static {v4, v5}, La/bdl;->b(J)F

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    new-instance v4, Lkotlin/Pair;

    .line 723
    .line 724
    const-string v5, "KEY_DRAG_HANDLE_SIZE_WIDTH"

    .line 725
    .line 726
    invoke-direct {v4, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    iget-object v1, v1, La/bxv0;->b:La/jtv0;

    .line 734
    .line 735
    move-object/from16 v16, v0

    .line 736
    .line 737
    iget-wide v0, v1, La/jtv0;->e:J

    .line 738
    .line 739
    invoke-static {v0, v1}, La/bdl;->a(J)F

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    new-instance v1, Lkotlin/Pair;

    .line 748
    .line 749
    const-string v5, "KEY_DRAG_HANDLE_SIZE_HEIGHT"

    .line 750
    .line 751
    invoke-direct {v1, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v16 .. v16}, La/h0q0;->p()La/bxv0;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    iget-object v0, v0, La/bxv0;->b:La/jtv0;

    .line 759
    .line 760
    iget v0, v0, La/jtv0;->d:F

    .line 761
    .line 762
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    new-instance v5, Lkotlin/Pair;

    .line 767
    .line 768
    move-object/from16 v19, v1

    .line 769
    .line 770
    const-string v1, "KEY_DRAG_HANDLE_ZONE_HEIGHT"

    .line 771
    .line 772
    invoke-direct {v5, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v16 .. v16}, La/h0q0;->m()La/msv0;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    iget v0, v0, La/msv0;->a:F

    .line 780
    .line 781
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    new-instance v1, Lkotlin/Pair;

    .line 786
    .line 787
    move-object/from16 v16, v2

    .line 788
    .line 789
    const-string v2, "KEY_MAX_BOUNCE_DISTANCE"

    .line 790
    .line 791
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 792
    .line 793
    .line 794
    move-object/from16 v21, v1

    .line 795
    .line 796
    move-object/from16 v17, v3

    .line 797
    .line 798
    move-object/from16 v18, v4

    .line 799
    .line 800
    move-object/from16 v20, v5

    .line 801
    .line 802
    filled-new-array/range {v6 .. v21}, [Lkotlin/Pair;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    goto :goto_a

    .line 811
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 812
    .line 813
    .line 814
    goto :goto_a

    .line 815
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 816
    .line 817
    .line 818
    goto :goto_a

    .line 819
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 820
    .line 821
    .line 822
    goto :goto_a

    .line 823
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 824
    .line 825
    .line 826
    goto :goto_a

    .line 827
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 828
    .line 829
    .line 830
    goto :goto_a

    .line 831
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 832
    .line 833
    .line 834
    :goto_a
    return-object v5

    .line 835
    :pswitch_5
    move-object/from16 v0, p1

    .line 836
    .line 837
    check-cast v0, La/fet;

    .line 838
    .line 839
    move-object/from16 v1, p2

    .line 840
    .line 841
    check-cast v1, Ljava/lang/Integer;

    .line 842
    .line 843
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    invoke-static {v4}, La/x8x;->L(I)I

    .line 847
    .line 848
    .line 849
    move-result v1

    .line 850
    invoke-static {v1, v0}, La/tnq0;->f(ILa/fet;)V

    .line 851
    .line 852
    .line 853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 854
    .line 855
    return-object v0

    .line 856
    :pswitch_6
    move-object/from16 v0, p1

    .line 857
    .line 858
    check-cast v0, Ljava/lang/Throwable;

    .line 859
    .line 860
    move-object/from16 v0, p2

    .line 861
    .line 862
    check-cast v0, Ljava/lang/String;

    .line 863
    .line 864
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 865
    .line 866
    return-object v0

    .line 867
    :pswitch_7
    move-object/from16 v0, p1

    .line 868
    .line 869
    check-cast v0, La/fet;

    .line 870
    .line 871
    move-object/from16 v1, p2

    .line 872
    .line 873
    check-cast v1, Ljava/lang/Integer;

    .line 874
    .line 875
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    invoke-static {v4}, La/x8x;->L(I)I

    .line 879
    .line 880
    .line 881
    move-result v1

    .line 882
    invoke-static {v1, v0}, La/wha0;->y(ILa/fet;)V

    .line 883
    .line 884
    .line 885
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 886
    .line 887
    return-object v0

    .line 888
    :pswitch_8
    move-object/from16 v0, p1

    .line 889
    .line 890
    check-cast v0, Ljava/lang/Throwable;

    .line 891
    .line 892
    move-object/from16 v0, p2

    .line 893
    .line 894
    check-cast v0, Ljava/lang/String;

    .line 895
    .line 896
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 897
    .line 898
    return-object v0

    .line 899
    :pswitch_9
    move-object/from16 v0, p1

    .line 900
    .line 901
    check-cast v0, La/fet;

    .line 902
    .line 903
    move-object/from16 v1, p2

    .line 904
    .line 905
    check-cast v1, Ljava/lang/Integer;

    .line 906
    .line 907
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    .line 909
    .line 910
    invoke-static {v4}, La/x8x;->L(I)I

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    invoke-static {v1, v0}, La/gq80;->J(ILa/fet;)V

    .line 915
    .line 916
    .line 917
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 918
    .line 919
    return-object v0

    .line 920
    :pswitch_a
    move-object/from16 v0, p1

    .line 921
    .line 922
    check-cast v0, La/fet;

    .line 923
    .line 924
    move-object/from16 v1, p2

    .line 925
    .line 926
    check-cast v1, Ljava/lang/Integer;

    .line 927
    .line 928
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    invoke-static {v4}, La/x8x;->L(I)I

    .line 932
    .line 933
    .line 934
    move-result v1

    .line 935
    invoke-static {v1, v0}, La/gq80;->E(ILa/fet;)V

    .line 936
    .line 937
    .line 938
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 939
    .line 940
    return-object v0

    .line 941
    :pswitch_b
    move-object/from16 v0, p1

    .line 942
    .line 943
    check-cast v0, Ljava/lang/Throwable;

    .line 944
    .line 945
    move-object/from16 v0, p2

    .line 946
    .line 947
    check-cast v0, Ljava/lang/String;

    .line 948
    .line 949
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 950
    .line 951
    return-object v0

    .line 952
    :pswitch_c
    move-object/from16 v0, p1

    .line 953
    .line 954
    check-cast v0, La/fet;

    .line 955
    .line 956
    move-object/from16 v1, p2

    .line 957
    .line 958
    check-cast v1, Ljava/lang/Integer;

    .line 959
    .line 960
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    invoke-static {v4}, La/x8x;->L(I)I

    .line 964
    .line 965
    .line 966
    move-result v1

    .line 967
    invoke-static {v1, v0}, La/ohm0;->b(ILa/fet;)V

    .line 968
    .line 969
    .line 970
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 971
    .line 972
    return-object v0

    .line 973
    :pswitch_d
    move-object/from16 v0, p1

    .line 974
    .line 975
    check-cast v0, La/fet;

    .line 976
    .line 977
    move-object/from16 v1, p2

    .line 978
    .line 979
    check-cast v1, Ljava/lang/Integer;

    .line 980
    .line 981
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    invoke-static {v4}, La/x8x;->L(I)I

    .line 985
    .line 986
    .line 987
    move-result v1

    .line 988
    invoke-static {v1, v0}, La/ju70;->x(ILa/fet;)V

    .line 989
    .line 990
    .line 991
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    return-object v0

    .line 994
    :pswitch_e
    move-object/from16 v0, p1

    .line 995
    .line 996
    check-cast v0, La/fet;

    .line 997
    .line 998
    move-object/from16 v1, p2

    .line 999
    .line 1000
    check-cast v1, Ljava/lang/Integer;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    invoke-static {v4}, La/x8x;->L(I)I

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    invoke-static {v1, v0}, La/hhm0;->d(ILa/fet;)V

    .line 1010
    .line 1011
    .line 1012
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1013
    .line 1014
    return-object v0

    .line 1015
    :pswitch_f
    move-object/from16 v0, p1

    .line 1016
    .line 1017
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1018
    .line 1019
    move-object/from16 v1, p2

    .line 1020
    .line 1021
    check-cast v1, Landroid/view/ViewGroup;

    .line 1022
    .line 1023
    const v4, 0x7f0d0335

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v0, v1, v4, v1, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    const v1, 0x7f0a0284

    .line 1031
    .line 1032
    .line 1033
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1038
    .line 1039
    if-eqz v3, :cond_1a

    .line 1040
    .line 1041
    const v1, 0x7f0a0290

    .line 1042
    .line 1043
    .line 1044
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v4

    .line 1048
    check-cast v4, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1049
    .line 1050
    if-eqz v4, :cond_1a

    .line 1051
    .line 1052
    new-instance v5, La/q3w;

    .line 1053
    .line 1054
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1055
    .line 1056
    invoke-direct {v5, v0, v3, v4}, La/q3w;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;)V

    .line 1057
    .line 1058
    .line 1059
    goto :goto_b

    .line 1060
    :cond_1a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1073
    .line 1074
    .line 1075
    :goto_b
    return-object v5

    .line 1076
    :pswitch_10
    move-object/from16 v0, p1

    .line 1077
    .line 1078
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1079
    .line 1080
    move-object/from16 v4, p2

    .line 1081
    .line 1082
    check-cast v4, Landroid/view/ViewGroup;

    .line 1083
    .line 1084
    const v6, 0x7f0d06ef

    .line 1085
    .line 1086
    .line 1087
    invoke-static {v0, v4, v6, v4, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    const v3, 0x7f0a027e

    .line 1092
    .line 1093
    .line 1094
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v4

    .line 1098
    check-cast v4, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1099
    .line 1100
    if-eqz v4, :cond_1b

    .line 1101
    .line 1102
    move-object v3, v0

    .line 1103
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1104
    .line 1105
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v6

    .line 1109
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1110
    .line 1111
    if-eqz v6, :cond_1c

    .line 1112
    .line 1113
    new-instance v5, La/mev0;

    .line 1114
    .line 1115
    invoke-direct {v5, v3, v3, v4, v6}, La/mev0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_c

    .line 1119
    :cond_1b
    move v1, v3

    .line 1120
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    :goto_c
    return-object v5

    .line 1136
    :pswitch_11
    move-object/from16 v0, p1

    .line 1137
    .line 1138
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1139
    .line 1140
    move-object/from16 v1, p2

    .line 1141
    .line 1142
    check-cast v1, Landroid/view/ViewGroup;

    .line 1143
    .line 1144
    const v2, 0x7f0d0321

    .line 1145
    .line 1146
    .line 1147
    invoke-static {v0, v1, v2, v1, v3}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    if-eqz v0, :cond_1d

    .line 1152
    .line 1153
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1154
    .line 1155
    new-instance v5, La/cqv;

    .line 1156
    .line 1157
    invoke-direct {v5, v0, v0}, La/cqv;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 1158
    .line 1159
    .line 1160
    goto :goto_d

    .line 1161
    :cond_1d
    const-string v0, "rootView"

    .line 1162
    .line 1163
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1164
    .line 1165
    .line 1166
    :goto_d
    return-object v5

    .line 1167
    :pswitch_12
    move-object/from16 v0, p1

    .line 1168
    .line 1169
    check-cast v0, Ljava/lang/Throwable;

    .line 1170
    .line 1171
    move-object/from16 v1, p2

    .line 1172
    .line 1173
    check-cast v1, Ljava/lang/String;

    .line 1174
    .line 1175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1179
    .line 1180
    .line 1181
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1182
    .line 1183
    return-object v0

    .line 1184
    :pswitch_13
    move-object/from16 v0, p1

    .line 1185
    .line 1186
    check-cast v0, Ljava/lang/Throwable;

    .line 1187
    .line 1188
    move-object/from16 v1, p2

    .line 1189
    .line 1190
    check-cast v1, Ljava/lang/String;

    .line 1191
    .line 1192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1199
    .line 1200
    return-object v0

    .line 1201
    :pswitch_data_0
    .packed-switch 0x0
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
