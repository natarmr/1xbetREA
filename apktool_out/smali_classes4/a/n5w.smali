.class public final synthetic La/n5w;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/n5w;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n5w;->a:B

    .line 4
    .line 5
    const-string v2, "composeGameCardFragmentDelegate"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/xzx;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/k3t0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Ljava/util/Set;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/mox;

    .line 40
    .line 41
    iget-object v2, v0, La/mox;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 44
    .line 45
    .line 46
    :try_start_0
    iget-object v0, v0, La/mox;->c:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Iterable;

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, La/he60;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v5, v2, La/he60;->b:[I

    .line 81
    .line 82
    array-length v6, v5

    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    if-eq v6, v3, :cond_3

    .line 86
    .line 87
    new-instance v6, La/yni0;

    .line 88
    .line 89
    invoke-direct {v6}, La/yni0;-><init>()V

    .line 90
    .line 91
    .line 92
    array-length v7, v5

    .line 93
    move v8, v4

    .line 94
    move v9, v8

    .line 95
    :goto_1
    if-ge v8, v7, :cond_2

    .line 96
    .line 97
    aget v10, v5, v8

    .line 98
    .line 99
    add-int/lit8 v11, v9, 0x1

    .line 100
    .line 101
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_1

    .line 110
    .line 111
    iget-object v10, v2, La/he60;->c:[Ljava/lang/String;

    .line 112
    .line 113
    aget-object v9, v10, v9

    .line 114
    .line 115
    invoke-virtual {v6, v9}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 119
    .line 120
    move v9, v11

    .line 121
    goto :goto_1

    .line 122
    :cond_2
    invoke-static {v6}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    goto :goto_2

    .line 127
    :cond_3
    aget v5, v5, v4

    .line 128
    .line 129
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_4

    .line 138
    .line 139
    iget-object v5, v2, La/he60;->d:Ljava/util/Set;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    sget-object v5, La/xun;->a:La/xun;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    sget-object v5, La/xun;->a:La/xun;

    .line 146
    .line 147
    :goto_2
    move-object v6, v5

    .line 148
    check-cast v6, Ljava/util/Collection;

    .line 149
    .line 150
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-nez v6, :cond_0

    .line 155
    .line 156
    iget-object v2, v2, La/he60;->a:La/iox;

    .line 157
    .line 158
    invoke-virtual {v2, v5}, La/iox;->a(Ljava/util/Set;)V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object v0

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :pswitch_1
    move-object/from16 v1, p1

    .line 171
    .line 172
    check-cast v1, La/tbx;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, La/k3t0;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_2
    move-object/from16 v1, p1

    .line 188
    .line 189
    check-cast v1, La/yqw;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, La/k3t0;

    .line 197
    .line 198
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_3
    move-object/from16 v1, p1

    .line 205
    .line 206
    check-cast v1, La/aqw;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, La/k3t0;

    .line 214
    .line 215
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_4
    move-object/from16 v1, p1

    .line 222
    .line 223
    check-cast v1, La/aqw;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, La/k3t0;

    .line 231
    .line 232
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_5
    move-object/from16 v1, p1

    .line 239
    .line 240
    check-cast v1, La/aqw;

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, La/k3t0;

    .line 248
    .line 249
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_6
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, La/xnw;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, La/k3t0;

    .line 265
    .line 266
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_7
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, La/rmw;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, La/k3t0;

    .line 282
    .line 283
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0

    .line 289
    :pswitch_8
    move-object/from16 v1, p1

    .line 290
    .line 291
    check-cast v1, La/ujw;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 297
    .line 298
    move-object v8, v0

    .line 299
    check-cast v8, La/piw;

    .line 300
    .line 301
    sget-object v0, La/piw;->Y1:La/sqt;

    .line 302
    .line 303
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    instance-of v0, v1, La/qjw;

    .line 307
    .line 308
    if-eqz v0, :cond_8

    .line 309
    .line 310
    iget-object v0, v8, La/piw;->L1:La/ujd;

    .line 311
    .line 312
    if-eqz v0, :cond_7

    .line 313
    .line 314
    check-cast v1, La/qjw;

    .line 315
    .line 316
    iget-object v1, v1, La/qjw;->a:La/sjd;

    .line 317
    .line 318
    invoke-virtual {v0, v8, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 319
    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v5

    .line 326
    :cond_8
    instance-of v0, v1, La/tjw;

    .line 327
    .line 328
    if-eqz v0, :cond_a

    .line 329
    .line 330
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-static {v0}, La/tdc;->T(Landroidx/fragment/app/e;)Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-nez v0, :cond_b

    .line 342
    .line 343
    iget-object v0, v8, La/piw;->O1:La/poq0;

    .line 344
    .line 345
    if-eqz v0, :cond_9

    .line 346
    .line 347
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    sget-object v1, La/fk60;->b:La/uuz;

    .line 355
    .line 356
    sget-object v1, La/ki60;->q2:La/htz;

    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    const-string v1, "OnboardingBottomSheetContainerFragment"

    .line 362
    .line 363
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    if-nez v2, :cond_b

    .line 368
    .line 369
    new-instance v2, La/ki60;

    .line 370
    .line 371
    invoke-direct {v2}, La/ki60;-><init>()V

    .line 372
    .line 373
    .line 374
    sget-object v4, La/ki60;->r2:[La/iiy;

    .line 375
    .line 376
    aget-object v3, v4, v3

    .line 377
    .line 378
    iget-object v5, v2, La/ki60;->n2:La/zz2;

    .line 379
    .line 380
    const/4 v6, 0x7

    .line 381
    invoke-virtual {v5, v2, v3, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 382
    .line 383
    .line 384
    const/4 v3, 0x2

    .line 385
    aget-object v3, v4, v3

    .line 386
    .line 387
    iget-object v4, v2, La/ki60;->o2:La/phf0;

    .line 388
    .line 389
    const-string v5, ""

    .line 390
    .line 391
    invoke-virtual {v4, v2, v3, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v2, v0, v1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_9
    const-string v0, "tipsDialogFeature"

    .line 399
    .line 400
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v5

    .line 404
    :cond_a
    instance-of v0, v1, La/sjw;

    .line 405
    .line 406
    if-eqz v0, :cond_d

    .line 407
    .line 408
    iget-object v6, v8, La/piw;->N1:La/wdk0;

    .line 409
    .line 410
    if-eqz v6, :cond_c

    .line 411
    .line 412
    check-cast v1, La/sjw;

    .line 413
    .line 414
    iget-object v7, v1, La/sjw;->a:La/xdk0;

    .line 415
    .line 416
    const/4 v12, 0x0

    .line 417
    const/16 v13, 0x3fc

    .line 418
    .line 419
    const/4 v9, 0x0

    .line 420
    const/4 v10, 0x0

    .line 421
    const/4 v11, 0x0

    .line 422
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 423
    .line 424
    .line 425
    :cond_b
    :goto_3
    invoke-virtual {v8}, La/piw;->H0()La/k3t0;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sget-object v1, La/bgw;->a:La/bgw;

    .line 430
    .line 431
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_c
    const-string v0, "snackbarManager"

    .line 438
    .line 439
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v5

    .line 443
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 444
    .line 445
    .line 446
    :goto_4
    return-object v5

    .line 447
    :pswitch_9
    move-object/from16 v1, p1

    .line 448
    .line 449
    check-cast v1, La/xhw;

    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, La/k3t0;

    .line 457
    .line 458
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_a
    move-object/from16 v1, p1

    .line 465
    .line 466
    check-cast v1, La/rjw;

    .line 467
    .line 468
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, La/oiw;

    .line 474
    .line 475
    iget-object v3, v0, La/oiw;->L1:La/ujd;

    .line 476
    .line 477
    if-eqz v3, :cond_e

    .line 478
    .line 479
    iget-object v1, v1, La/rjw;->a:La/sjd;

    .line 480
    .line 481
    invoke-virtual {v3, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 482
    .line 483
    .line 484
    iget-object v0, v0, La/oiw;->N1:La/a8z;

    .line 485
    .line 486
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    check-cast v0, La/k3t0;

    .line 491
    .line 492
    sget-object v1, La/agw;->a:La/agw;

    .line 493
    .line 494
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 498
    .line 499
    return-object v0

    .line 500
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    throw v5

    .line 504
    :pswitch_b
    move-object/from16 v1, p1

    .line 505
    .line 506
    check-cast v1, Ljava/lang/Throwable;

    .line 507
    .line 508
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, La/duj;

    .line 514
    .line 515
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 516
    .line 517
    .line 518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_c
    move-object/from16 v1, p1

    .line 522
    .line 523
    check-cast v1, Ljava/lang/Throwable;

    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v0, La/duj;

    .line 531
    .line 532
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_d
    move-object/from16 v1, p1

    .line 539
    .line 540
    check-cast v1, Ljava/lang/Throwable;

    .line 541
    .line 542
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v0, La/duj;

    .line 548
    .line 549
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 553
    .line 554
    return-object v0

    .line 555
    :pswitch_e
    move-object/from16 v1, p1

    .line 556
    .line 557
    check-cast v1, Ljava/lang/Throwable;

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, La/duj;

    .line 565
    .line 566
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 567
    .line 568
    .line 569
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_f
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, La/kew;

    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 580
    .line 581
    move-object v7, v0

    .line 582
    check-cast v7, La/cdw;

    .line 583
    .line 584
    sget-object v0, La/cdw;->R1:La/rqt;

    .line 585
    .line 586
    instance-of v0, v1, La/jew;

    .line 587
    .line 588
    if-eqz v0, :cond_10

    .line 589
    .line 590
    check-cast v1, La/jew;

    .line 591
    .line 592
    iget-object v0, v1, La/jew;->a:La/m0k0;

    .line 593
    .line 594
    iget-object v2, v1, La/jew;->b:La/m97;

    .line 595
    .line 596
    iget-object v1, v1, La/jew;->c:La/mq2;

    .line 597
    .line 598
    iget-object v3, v7, La/cdw;->M1:La/e720;

    .line 599
    .line 600
    if-eqz v3, :cond_f

    .line 601
    .line 602
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v3, v4, v2, v0, v1}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 610
    .line 611
    .line 612
    goto :goto_5

    .line 613
    :cond_f
    const-string v0, "makeBetBottomSheetProvider"

    .line 614
    .line 615
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    throw v5

    .line 619
    :cond_10
    instance-of v0, v1, La/hew;

    .line 620
    .line 621
    const-string v2, "addEventToCouponDelegate"

    .line 622
    .line 623
    if-eqz v0, :cond_12

    .line 624
    .line 625
    iget-object v6, v7, La/cdw;->N1:La/vq;

    .line 626
    .line 627
    if-eqz v6, :cond_11

    .line 628
    .line 629
    check-cast v1, La/hew;

    .line 630
    .line 631
    iget-object v8, v1, La/hew;->a:La/aud;

    .line 632
    .line 633
    sget-object v12, La/ctc;->b:La/ctc;

    .line 634
    .line 635
    iget-wide v2, v1, La/hew;->b:J

    .line 636
    .line 637
    iget-object v0, v1, La/hew;->c:Ljava/lang/String;

    .line 638
    .line 639
    new-instance v14, La/mq2;

    .line 640
    .line 641
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 642
    .line 643
    .line 644
    const/4 v11, 0x0

    .line 645
    const/4 v13, 0x1

    .line 646
    const/4 v9, 0x0

    .line 647
    const/4 v10, 0x0

    .line 648
    move-object/from16 v17, v0

    .line 649
    .line 650
    move-wide v15, v2

    .line 651
    invoke-virtual/range {v6 .. v17}, La/vq;->a(Landroidx/fragment/app/Fragment;La/aud;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ctc;ZLa/ms2;JLjava/lang/String;)La/yq;

    .line 652
    .line 653
    .line 654
    goto :goto_5

    .line 655
    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    throw v5

    .line 659
    :cond_12
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    sget-object v0, La/iew;->a:La/iew;

    .line 663
    .line 664
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    if-eqz v0, :cond_14

    .line 669
    .line 670
    iget-object v0, v7, La/cdw;->N1:La/vq;

    .line 671
    .line 672
    if-eqz v0, :cond_13

    .line 673
    .line 674
    invoke-virtual {v0, v7, v5, v5}, La/vq;->b(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)La/xq;

    .line 675
    .line 676
    .line 677
    :goto_5
    invoke-virtual {v7}, La/cdw;->G0()La/k3t0;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    sget-object v1, La/dcw;->a:La/dcw;

    .line 682
    .line 683
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    goto :goto_6

    .line 689
    :cond_13
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    throw v5

    .line 693
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 694
    .line 695
    .line 696
    :goto_6
    return-object v5

    .line 697
    :pswitch_10
    move-object/from16 v1, p1

    .line 698
    .line 699
    check-cast v1, Ljava/lang/Throwable;

    .line 700
    .line 701
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v0, La/duj;

    .line 707
    .line 708
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 709
    .line 710
    .line 711
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    return-object v0

    .line 714
    :pswitch_11
    move-object/from16 v1, p1

    .line 715
    .line 716
    check-cast v1, Ljava/lang/Throwable;

    .line 717
    .line 718
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v0, La/naw;

    .line 724
    .line 725
    invoke-virtual {v0, v1}, La/naw;->y(Ljava/lang/Throwable;)V

    .line 726
    .line 727
    .line 728
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_12
    move-object/from16 v1, p1

    .line 732
    .line 733
    check-cast v1, Ljava/lang/Throwable;

    .line 734
    .line 735
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v0, La/naw;

    .line 741
    .line 742
    invoke-virtual {v0, v1}, La/naw;->y(Ljava/lang/Throwable;)V

    .line 743
    .line 744
    .line 745
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 746
    .line 747
    return-object v0

    .line 748
    :pswitch_13
    move-object/from16 v1, p1

    .line 749
    .line 750
    check-cast v1, Ljava/lang/Throwable;

    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v0, La/naw;

    .line 758
    .line 759
    invoke-virtual {v0, v1}, La/naw;->y(Ljava/lang/Throwable;)V

    .line 760
    .line 761
    .line 762
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 763
    .line 764
    return-object v0

    .line 765
    :pswitch_14
    move-object/from16 v1, p1

    .line 766
    .line 767
    check-cast v1, La/u7w;

    .line 768
    .line 769
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v0, La/k3t0;

    .line 775
    .line 776
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_15
    move-object/from16 v1, p1

    .line 783
    .line 784
    check-cast v1, La/y7w;

    .line 785
    .line 786
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v0, La/r7w;

    .line 792
    .line 793
    sget-object v2, La/r7w;->q2:La/bst;

    .line 794
    .line 795
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    iget-object v2, v0, La/r7w;->o2:La/phf0;

    .line 799
    .line 800
    sget-object v3, La/x7w;->a:La/x7w;

    .line 801
    .line 802
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    move-result v3

    .line 806
    const/4 v4, 0x3

    .line 807
    if-eqz v3, :cond_15

    .line 808
    .line 809
    sget-object v1, La/r7w;->r2:[La/iiy;

    .line 810
    .line 811
    aget-object v1, v1, v4

    .line 812
    .line 813
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 818
    .line 819
    new-instance v3, Lkotlin/Pair;

    .line 820
    .line 821
    const-string v4, "RESULT_HIDE_BET_HISTORY_CLICK"

    .line 822
    .line 823
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    goto :goto_7

    .line 838
    :cond_15
    instance-of v3, v1, La/v7w;

    .line 839
    .line 840
    if-eqz v3, :cond_16

    .line 841
    .line 842
    sget-object v3, La/r7w;->r2:[La/iiy;

    .line 843
    .line 844
    aget-object v3, v3, v4

    .line 845
    .line 846
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    check-cast v1, La/v7w;

    .line 851
    .line 852
    iget-object v1, v1, La/v7w;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 853
    .line 854
    new-instance v3, Lkotlin/Pair;

    .line 855
    .line 856
    const-string v4, "RESULT_BET_HISTORY_CLICK"

    .line 857
    .line 858
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    goto :goto_7

    .line 873
    :cond_16
    sget-object v2, La/w7w;->a:La/w7w;

    .line 874
    .line 875
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    :goto_7
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 879
    .line 880
    .line 881
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_16
    move-object/from16 v1, p1

    .line 885
    .line 886
    check-cast v1, Ljava/lang/Throwable;

    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v0, La/q5w;

    .line 894
    .line 895
    invoke-virtual {v0, v1}, La/q5w;->w(Ljava/lang/Throwable;)V

    .line 896
    .line 897
    .line 898
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 899
    .line 900
    return-object v0

    .line 901
    :pswitch_17
    move-object/from16 v1, p1

    .line 902
    .line 903
    check-cast v1, Ljava/lang/Throwable;

    .line 904
    .line 905
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v0, La/q5w;

    .line 911
    .line 912
    invoke-virtual {v0, v1}, La/q5w;->w(Ljava/lang/Throwable;)V

    .line 913
    .line 914
    .line 915
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 916
    .line 917
    return-object v0

    .line 918
    :pswitch_18
    move-object/from16 v1, p1

    .line 919
    .line 920
    check-cast v1, Ljava/lang/Throwable;

    .line 921
    .line 922
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v0, La/q5w;

    .line 928
    .line 929
    iget-object v2, v0, La/q5w;->w:La/duj;

    .line 930
    .line 931
    new-instance v3, La/l5w;

    .line 932
    .line 933
    invoke-direct {v3, v0, v4}, La/l5w;-><init>(La/q5w;B)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 937
    .line 938
    .line 939
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 940
    .line 941
    return-object v0

    .line 942
    :pswitch_19
    move-object/from16 v1, p1

    .line 943
    .line 944
    check-cast v1, Ljava/lang/Throwable;

    .line 945
    .line 946
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v0, La/q5w;

    .line 952
    .line 953
    invoke-virtual {v0, v1}, La/q5w;->w(Ljava/lang/Throwable;)V

    .line 954
    .line 955
    .line 956
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 957
    .line 958
    return-object v0

    .line 959
    :pswitch_1a
    move-object/from16 v1, p1

    .line 960
    .line 961
    check-cast v1, Ljava/lang/Throwable;

    .line 962
    .line 963
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast v0, La/q5w;

    .line 969
    .line 970
    invoke-virtual {v0, v1}, La/q5w;->w(Ljava/lang/Throwable;)V

    .line 971
    .line 972
    .line 973
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 974
    .line 975
    return-object v0

    .line 976
    :pswitch_1b
    move-object/from16 v1, p1

    .line 977
    .line 978
    check-cast v1, Ljava/lang/Throwable;

    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v0, La/q5w;

    .line 986
    .line 987
    invoke-virtual {v0, v1}, La/q5w;->w(Ljava/lang/Throwable;)V

    .line 988
    .line 989
    .line 990
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 991
    .line 992
    return-object v0

    .line 993
    :pswitch_1c
    move-object/from16 v1, p1

    .line 994
    .line 995
    check-cast v1, Ljava/lang/Throwable;

    .line 996
    .line 997
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v0, La/q5w;

    .line 1003
    .line 1004
    invoke-virtual {v0, v1}, La/q5w;->w(Ljava/lang/Throwable;)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    nop

    .line 1011
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
