.class public final synthetic La/oh60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oh60;->a:B

    iput-object p1, p0, La/oh60;->b:Ljava/lang/Object;

    iput-object p2, p0, La/oh60;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oh60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/o55;

    .line 13
    .line 14
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/b1x;

    .line 17
    .line 18
    iget-object v1, v1, La/o55;->d:La/mz9;

    .line 19
    .line 20
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, La/m2x;->q(La/b1x;)Landroid/graphics/Bitmap;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v1, v1, La/mz9;->a:La/qz9;

    .line 31
    .line 32
    iget-object v3, v1, La/qz9;->q2:La/okz;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3}, La/okz;->a()La/j0a;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    iget-object v4, v1, La/qz9;->o2:La/a8z;

    .line 43
    .line 44
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, La/jyw;

    .line 49
    .line 50
    invoke-virtual {v4}, La/fot0;->m()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    check-cast v3, La/ewq;

    .line 55
    .line 56
    invoke-virtual {v3, v4}, La/ewq;->B(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    int-to-float v4, v4

    .line 61
    invoke-virtual {v3}, La/ewq;->d()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    int-to-float v3, v3

    .line 66
    sub-float/2addr v4, v3

    .line 67
    :goto_0
    move v8, v4

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    const/4 v4, 0x0

    .line 70
    goto :goto_0

    .line 71
    :goto_1
    invoke-virtual {v1}, La/qz9;->S0()La/d4a;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {v0}, La/b1x;->u0()Landroid/graphics/Rect;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, La/b1x;->K0()La/f0x;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1}, La/f0x;->a()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    int-to-float v7, v1

    .line 91
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v10, La/y3a;

    .line 96
    .line 97
    invoke-direct {v10, v4, v2}, La/y3a;-><init>(La/d4a;B)V

    .line 98
    .line 99
    .line 100
    new-instance v3, La/b4a;

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    invoke-direct/range {v3 .. v9}, La/b4a;-><init>(La/d4a;Landroid/graphics/Bitmap;Landroid/graphics/Rect;FFLa/yje;)V

    .line 104
    .line 105
    .line 106
    const/16 v14, 0xe

    .line 107
    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    move-object v9, v1

    .line 111
    move-object v13, v3

    .line 112
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_0
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, La/ito0;

    .line 122
    .line 123
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/snf0;

    .line 126
    .line 127
    iget-object v1, v1, La/ito0;->e:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_1
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 136
    .line 137
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, La/xho0;

    .line 140
    .line 141
    sget-object v2, La/jho0;->R1:La/y2m0;

    .line 142
    .line 143
    iget v0, v0, La/xho0;->b:I

    .line 144
    .line 145
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_2
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 152
    .line 153
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/fgo0;

    .line 156
    .line 157
    sget-object v2, La/ufo0;->Q1:La/s2m0;

    .line 158
    .line 159
    iget v0, v0, La/fgo0;->b:I

    .line 160
    .line 161
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_3
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, La/imn0;

    .line 168
    .line 169
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, La/sbe;

    .line 178
    .line 179
    new-instance v2, La/j55;

    .line 180
    .line 181
    invoke-direct {v2, v1}, La/j55;-><init>(La/imn0;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0, v2}, La/sbe;->accept(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_4
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, La/pmi0;

    .line 191
    .line 192
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, La/uom0;

    .line 195
    .line 196
    iget-object v1, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, La/jrs0;

    .line 199
    .line 200
    iget-object v1, v1, La/jrs0;->f:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, La/hru;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v1, v1, La/hru;->a:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, La/xaw;

    .line 210
    .line 211
    iget-boolean v4, v1, La/xaw;->k:Z

    .line 212
    .line 213
    invoke-static {v4}, La/x0x;->K(Z)V

    .line 214
    .line 215
    .line 216
    iget-object v4, v0, La/uom0;->e:La/b4x;

    .line 217
    .line 218
    iget-object v5, v1, La/xaw;->h:Ljava/util/HashSet;

    .line 219
    .line 220
    invoke-virtual {v4, v3}, La/b4x;->r(I)La/v3x;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    :cond_1
    :goto_2
    invoke-virtual {v4}, La/v3x;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_8

    .line 229
    .line 230
    invoke-virtual {v4}, La/v3x;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    check-cast v6, La/som0;

    .line 235
    .line 236
    iget-object v7, v6, La/som0;->a:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v8, v6, La/som0;->c:La/tom0;

    .line 239
    .line 240
    iget-object v9, v6, La/som0;->b:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    if-eqz v10, :cond_1

    .line 247
    .line 248
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_2

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_2
    new-instance v10, La/u3x;

    .line 256
    .line 257
    const/4 v11, 0x4

    .line 258
    invoke-direct {v10, v11}, La/r3x;-><init>(I)V

    .line 259
    .line 260
    .line 261
    new-instance v12, La/u3x;

    .line 262
    .line 263
    invoke-direct {v12, v11}, La/r3x;-><init>(I)V

    .line 264
    .line 265
    .line 266
    iget-object v11, v1, La/xaw;->d:La/b4x;

    .line 267
    .line 268
    iget-object v13, v8, La/tom0;->c:La/wcf0;

    .line 269
    .line 270
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    :cond_3
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    if-eqz v14, :cond_5

    .line 279
    .line 280
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v14

    .line 284
    check-cast v14, La/tbw;

    .line 285
    .line 286
    iget-object v15, v14, La/tbw;->b:Ljava/util/HashMap;

    .line 287
    .line 288
    invoke-virtual {v15, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v15

    .line 292
    check-cast v15, Landroid/net/Uri;

    .line 293
    .line 294
    iget-object v14, v14, La/tbw;->a:La/sbw;

    .line 295
    .line 296
    iget-object v14, v14, La/sbw;->b:Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13, v14}, La/wcf0;->containsKey(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v16

    .line 305
    if-eqz v16, :cond_4

    .line 306
    .line 307
    invoke-virtual {v13, v14}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    check-cast v14, Landroid/net/Uri;

    .line 312
    .line 313
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_4
    invoke-static {v15, v8}, La/xaw;->b(Landroid/net/Uri;La/tom0;)Landroid/net/Uri$Builder;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    invoke-virtual {v14}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    :goto_4
    if-eqz v14, :cond_3

    .line 326
    .line 327
    invoke-virtual {v10, v14}, La/r3x;->b(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v15}, La/r3x;->b(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_5
    iget-object v7, v1, La/xaw;->e:La/b4x;

    .line 335
    .line 336
    invoke-static {v6, v7, v10, v12}, La/xaw;->d(La/som0;Ljava/util/List;La/u3x;La/u3x;)V

    .line 337
    .line 338
    .line 339
    iget-object v7, v1, La/xaw;->f:La/b4x;

    .line 340
    .line 341
    invoke-static {v6, v7, v10, v12}, La/xaw;->d(La/som0;Ljava/util/List;La/u3x;La/u3x;)V

    .line 342
    .line 343
    .line 344
    iget-object v7, v1, La/xaw;->g:La/b4x;

    .line 345
    .line 346
    invoke-static {v6, v7, v10, v12}, La/xaw;->d(La/som0;Ljava/util/List;La/u3x;La/u3x;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    iget-object v6, v1, La/xaw;->b:La/prc;

    .line 353
    .line 354
    invoke-virtual {v10}, La/u3x;->g()La/rcf0;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    invoke-virtual {v12}, La/u3x;->g()La/rcf0;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    iget-object v6, v6, La/prc;->b:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v6, La/vuj;

    .line 365
    .line 366
    iget-object v6, v6, La/vuj;->d:Ljava/util/HashMap;

    .line 367
    .line 368
    iget v10, v7, La/rcf0;->d:I

    .line 369
    .line 370
    iget v11, v8, La/rcf0;->d:I

    .line 371
    .line 372
    if-ne v10, v11, :cond_6

    .line 373
    .line 374
    move v10, v2

    .line 375
    goto :goto_5

    .line 376
    :cond_6
    move v10, v3

    .line 377
    :goto_5
    invoke-static {v10}, La/x0x;->K(Z)V

    .line 378
    .line 379
    .line 380
    move v10, v3

    .line 381
    :goto_6
    iget v11, v7, La/rcf0;->d:I

    .line 382
    .line 383
    if-ge v10, v11, :cond_1

    .line 384
    .line 385
    invoke-virtual {v8, v10}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v11

    .line 389
    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v11

    .line 393
    check-cast v11, La/uuj;

    .line 394
    .line 395
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v7, v10}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    check-cast v12, Landroid/net/Uri;

    .line 403
    .line 404
    iget-object v13, v11, La/uuj;->a:La/tbw;

    .line 405
    .line 406
    iget-object v13, v13, La/tbw;->b:Ljava/util/HashMap;

    .line 407
    .line 408
    invoke-virtual {v13, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    iget-object v13, v11, La/uuj;->b:Ljava/util/HashMap;

    .line 412
    .line 413
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v14

    .line 417
    check-cast v14, La/tuj;

    .line 418
    .line 419
    if-nez v14, :cond_7

    .line 420
    .line 421
    new-instance v14, La/tuj;

    .line 422
    .line 423
    iget-object v15, v11, La/uuj;->d:La/vuj;

    .line 424
    .line 425
    invoke-direct {v14, v15, v12, v9}, La/tuj;-><init>(La/vuj;Landroid/net/Uri;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v13, v12, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_7
    iget-object v13, v14, La/tuj;->b:Ljava/util/HashSet;

    .line 433
    .line 434
    invoke-virtual {v13, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    :goto_7
    invoke-virtual {v6, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    add-int/lit8 v10, v10, 0x1

    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_8
    iget-object v0, v0, La/uom0;->d:La/b4x;

    .line 444
    .line 445
    iput-object v0, v1, La/xaw;->m:La/b4x;

    .line 446
    .line 447
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    invoke-virtual {v1, v2, v3}, La/xaw;->e(J)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :pswitch_5
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v1, La/cam0;

    .line 459
    .line 460
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, La/o9m0;

    .line 463
    .line 464
    check-cast v1, La/aam0;

    .line 465
    .line 466
    iget-boolean v1, v1, La/aam0;->c:Z

    .line 467
    .line 468
    if-eqz v1, :cond_9

    .line 469
    .line 470
    invoke-virtual {v0}, La/yge0;->g()V

    .line 471
    .line 472
    .line 473
    :cond_9
    return-void

    .line 474
    :pswitch_6
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v1, La/p5h0;

    .line 477
    .line 478
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 481
    .line 482
    invoke-static {v1, v0}, Lorg/xplatform/uikit_sport/score/SportScore;->j(La/p5h0;Lorg/xplatform/uikit_sport/score/SportScore;)V

    .line 483
    .line 484
    .line 485
    return-void

    .line 486
    :pswitch_7
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v1, La/qxk0;

    .line 489
    .line 490
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, Landroid/graphics/SurfaceTexture;

    .line 493
    .line 494
    sget v2, La/qxk0;->l:I

    .line 495
    .line 496
    iget-object v2, v1, La/qxk0;->g:Landroid/graphics/SurfaceTexture;

    .line 497
    .line 498
    iget-object v3, v1, La/qxk0;->h:Landroid/view/Surface;

    .line 499
    .line 500
    new-instance v4, Landroid/view/Surface;

    .line 501
    .line 502
    invoke-direct {v4, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 503
    .line 504
    .line 505
    iput-object v0, v1, La/qxk0;->g:Landroid/graphics/SurfaceTexture;

    .line 506
    .line 507
    iput-object v4, v1, La/qxk0;->h:Landroid/view/Surface;

    .line 508
    .line 509
    iget-object v0, v1, La/qxk0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_a

    .line 520
    .line 521
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, La/qlo;

    .line 526
    .line 527
    iget-object v1, v1, La/qlo;->a:La/ulo;

    .line 528
    .line 529
    invoke-virtual {v1, v4}, La/ulo;->S(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_a
    if-eqz v2, :cond_b

    .line 534
    .line 535
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 536
    .line 537
    .line 538
    :cond_b
    if-eqz v3, :cond_c

    .line 539
    .line 540
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 541
    .line 542
    .line 543
    :cond_c
    return-void

    .line 544
    :pswitch_8
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v1, La/ztj0;

    .line 547
    .line 548
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, La/jjv0;

    .line 551
    .line 552
    iget-object v1, v1, La/ztj0;->c:La/sbe;

    .line 553
    .line 554
    invoke-interface {v1, v0}, La/sbe;->accept(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :pswitch_9
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/seabattle/view/SeaBattleView;

    .line 561
    .line 562
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, La/mie0;

    .line 565
    .line 566
    sget v2, Lorg/xplatform/cyber/game/universal/impl/presentation/seabattle/view/SeaBattleView;->k:I

    .line 567
    .line 568
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, La/xch0;

    .line 571
    .line 572
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/seabattle/view/SeaBattleView;->g:La/xch0;

    .line 573
    .line 574
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :pswitch_a
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 581
    .line 582
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;

    .line 585
    .line 586
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 587
    .line 588
    invoke-virtual {v0}, La/e1a0;->z()I

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 593
    .line 594
    .line 595
    return-void

    .line 596
    :pswitch_b
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v1, La/cym0;

    .line 599
    .line 600
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v0, La/htg0;

    .line 603
    .line 604
    invoke-virtual {v1}, La/cym0;->invoke()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    iget-object v0, v0, La/htg0;->c:La/sps0;

    .line 608
    .line 609
    if-eqz v0, :cond_d

    .line 610
    .line 611
    invoke-interface {v0}, La/sps0;->f()V

    .line 612
    .line 613
    .line 614
    :cond_d
    return-void

    .line 615
    :pswitch_c
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v1, La/ybf;

    .line 618
    .line 619
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v0, La/g0u;

    .line 622
    .line 623
    check-cast v1, La/a1d;

    .line 624
    .line 625
    invoke-virtual {v1, v0}, La/a1d;->k(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_d
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v1, La/xvw;

    .line 632
    .line 633
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, Landroid/graphics/Typeface;

    .line 636
    .line 637
    invoke-virtual {v1, v0}, La/xvw;->U(Landroid/graphics/Typeface;)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :pswitch_e
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v1, La/amf0;

    .line 644
    .line 645
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 648
    .line 649
    :try_start_0
    iget-object v1, v1, La/amf0;->h:La/vkr0;

    .line 650
    .line 651
    sget-object v3, La/mwb0;->c:La/mwb0;

    .line 652
    .line 653
    iget-object v1, v1, La/vkr0;->b:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v1, La/q55;

    .line 656
    .line 657
    invoke-virtual {v1, v3}, La/q55;->b(La/mwb0;)La/q55;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-static {}, La/eps0;->a()La/eps0;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    iget-object v3, v3, La/eps0;->d:La/wdu;

    .line 666
    .line 667
    invoke-virtual {v3, v1, v2}, La/wdu;->H(La/q55;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 668
    .line 669
    .line 670
    :catch_0
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 671
    .line 672
    .line 673
    return-void

    .line 674
    :pswitch_f
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v1, La/y3c0;

    .line 677
    .line 678
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v0, La/fvh0;

    .line 681
    .line 682
    invoke-virtual {v1, v0}, La/y3c0;->F(La/fvh0;)V

    .line 683
    .line 684
    .line 685
    return-void

    .line 686
    :pswitch_10
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v1, La/ezb0;

    .line 689
    .line 690
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v0, La/xov0;

    .line 693
    .line 694
    iget-object v2, v1, La/ezb0;->k:Ljava/lang/Object;

    .line 695
    .line 696
    monitor-enter v2

    .line 697
    :try_start_1
    new-instance v4, Ljava/util/ArrayList;

    .line 698
    .line 699
    iget-object v1, v1, La/ezb0;->j:Ljava/util/ArrayList;

    .line 700
    .line 701
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 702
    .line 703
    .line 704
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 705
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    if-eqz v2, :cond_e

    .line 714
    .line 715
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    check-cast v2, La/zjo;

    .line 720
    .line 721
    invoke-interface {v2, v0, v3}, La/zjo;->c(La/xov0;Z)V

    .line 722
    .line 723
    .line 724
    goto :goto_9

    .line 725
    :cond_e
    return-void

    .line 726
    :catchall_0
    move-exception v0

    .line 727
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 728
    throw v0

    .line 729
    :pswitch_11
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast v1, La/dzb0;

    .line 732
    .line 733
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v0, La/ozw;

    .line 736
    .line 737
    const-string v2, "ProcessingRequest"

    .line 738
    .line 739
    new-instance v3, Ljava/lang/StringBuilder;

    .line 740
    .line 741
    const-string v4, "onProcessFailure: request ID = "

    .line 742
    .line 743
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    iget v4, v1, La/dzb0;->a:I

    .line 747
    .line 748
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v3

    .line 755
    invoke-static {v2, v3, v0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 756
    .line 757
    .line 758
    iget-object v1, v1, La/dzb0;->g:La/snf0;

    .line 759
    .line 760
    invoke-static {}, La/ofm0;->m()V

    .line 761
    .line 762
    .line 763
    iget-boolean v2, v1, La/snf0;->g:Z

    .line 764
    .line 765
    if-eqz v2, :cond_f

    .line 766
    .line 767
    goto :goto_a

    .line 768
    :cond_f
    iget-object v2, v1, La/snf0;->c:La/wu9;

    .line 769
    .line 770
    iget-object v2, v2, La/wu9;->b:La/vu9;

    .line 771
    .line 772
    invoke-virtual {v2}, La/y4;->isDone()Z

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    const-string v3, "onImageCaptured() must be called before onFinalResult()"

    .line 777
    .line 778
    invoke-static {v3, v2}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v1}, La/snf0;->a()V

    .line 782
    .line 783
    .line 784
    invoke-static {}, La/ofm0;->m()V

    .line 785
    .line 786
    .line 787
    iget-object v1, v1, La/snf0;->a:La/o55;

    .line 788
    .line 789
    iget-object v2, v1, La/o55;->c:Ljava/util/concurrent/Executor;

    .line 790
    .line 791
    new-instance v3, La/apj0;

    .line 792
    .line 793
    invoke-direct {v3, v1, v0}, La/apj0;-><init>(La/o55;La/ozw;)V

    .line 794
    .line 795
    .line 796
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 797
    .line 798
    .line 799
    :goto_a
    return-void

    .line 800
    :pswitch_12
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v1, La/dzb0;

    .line 803
    .line 804
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, La/b1x;

    .line 807
    .line 808
    const-string v2, "ProcessingRequest"

    .line 809
    .line 810
    new-instance v3, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    const-string v4, "onFinalResult(ImageProxy): request ID = "

    .line 813
    .line 814
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    iget v4, v1, La/dzb0;->a:I

    .line 818
    .line 819
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    invoke-static {v2, v3}, La/l8x;->e0(Ljava/lang/String;Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    iget-object v1, v1, La/dzb0;->g:La/snf0;

    .line 830
    .line 831
    invoke-static {}, La/ofm0;->m()V

    .line 832
    .line 833
    .line 834
    iget-boolean v2, v1, La/snf0;->g:Z

    .line 835
    .line 836
    if-eqz v2, :cond_10

    .line 837
    .line 838
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 839
    .line 840
    .line 841
    goto :goto_b

    .line 842
    :cond_10
    iget-object v2, v1, La/snf0;->c:La/wu9;

    .line 843
    .line 844
    iget-object v2, v2, La/wu9;->b:La/vu9;

    .line 845
    .line 846
    invoke-virtual {v2}, La/y4;->isDone()Z

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    const-string v3, "onImageCaptured() must be called before onFinalResult()"

    .line 851
    .line 852
    invoke-static {v3, v2}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v1}, La/snf0;->a()V

    .line 856
    .line 857
    .line 858
    iget-object v1, v1, La/snf0;->a:La/o55;

    .line 859
    .line 860
    iget-object v2, v1, La/o55;->c:Ljava/util/concurrent/Executor;

    .line 861
    .line 862
    new-instance v3, La/oh60;

    .line 863
    .line 864
    const/16 v4, 0x1d

    .line 865
    .line 866
    invoke-direct {v3, v1, v0, v4}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 867
    .line 868
    .line 869
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 870
    .line 871
    .line 872
    :goto_b
    return-void

    .line 873
    :pswitch_13
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v1, La/dzb0;

    .line 876
    .line 877
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Landroid/graphics/Bitmap;

    .line 880
    .line 881
    const-string v2, "ProcessingRequest"

    .line 882
    .line 883
    new-instance v3, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    const-string v4, "onPostviewBitmapAvailable: request ID = "

    .line 886
    .line 887
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    iget v4, v1, La/dzb0;->a:I

    .line 891
    .line 892
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    invoke-static {v2, v3}, La/l8x;->e0(Ljava/lang/String;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    iget-object v1, v1, La/dzb0;->g:La/snf0;

    .line 903
    .line 904
    invoke-static {}, La/ofm0;->m()V

    .line 905
    .line 906
    .line 907
    iget-boolean v2, v1, La/snf0;->g:Z

    .line 908
    .line 909
    if-eqz v2, :cond_11

    .line 910
    .line 911
    goto :goto_c

    .line 912
    :cond_11
    iget-object v1, v1, La/snf0;->a:La/o55;

    .line 913
    .line 914
    iget-object v2, v1, La/o55;->c:Ljava/util/concurrent/Executor;

    .line 915
    .line 916
    new-instance v3, La/d12;

    .line 917
    .line 918
    invoke-direct {v3, v1, v0}, La/d12;-><init>(La/o55;Landroid/graphics/Bitmap;)V

    .line 919
    .line 920
    .line 921
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 922
    .line 923
    .line 924
    :goto_c
    return-void

    .line 925
    :pswitch_14
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v1, La/nv20;

    .line 928
    .line 929
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast v0, La/pmn0;

    .line 932
    .line 933
    iget-object v1, v1, La/nv20;->a:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 936
    .line 937
    iget-object v1, v1, Landroidx/camera/view/PreviewView;->l:La/nv20;

    .line 938
    .line 939
    invoke-virtual {v1, v0}, La/nv20;->d(La/pmn0;)V

    .line 940
    .line 941
    .line 942
    return-void

    .line 943
    :pswitch_15
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast v1, La/nub0;

    .line 946
    .line 947
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v0, La/pmn0;

    .line 950
    .line 951
    invoke-interface {v1, v0}, La/nub0;->d(La/pmn0;)V

    .line 952
    .line 953
    .line 954
    return-void

    .line 955
    :pswitch_16
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v1, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 958
    .line 959
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 960
    .line 961
    check-cast v0, La/u6b0;

    .line 962
    .line 963
    sget-object v2, La/u6b0;->e2:La/xi70;

    .line 964
    .line 965
    invoke-virtual {v1}, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 966
    .line 967
    .line 968
    move-result-object v1

    .line 969
    if-eqz v1, :cond_12

    .line 970
    .line 971
    iget-object v0, v0, La/u6b0;->b2:La/d930;

    .line 972
    .line 973
    const-string v2, "SPORTS_FILTER_KEY_STATE"

    .line 974
    .line 975
    invoke-virtual {v0, v2, v1}, La/d930;->b(Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 976
    .line 977
    .line 978
    :cond_12
    return-void

    .line 979
    :pswitch_17
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v1, Landroidx/media3/ui/PlayerView;

    .line 982
    .line 983
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v0, Landroid/graphics/Bitmap;

    .line 986
    .line 987
    sget v2, Landroidx/media3/ui/PlayerView;->j1:I

    .line 988
    .line 989
    invoke-virtual {v1, v0}, Landroidx/media3/ui/PlayerView;->d(Landroid/graphics/Bitmap;)V

    .line 990
    .line 991
    .line 992
    return-void

    .line 993
    :pswitch_18
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v1, La/tr90;

    .line 996
    .line 997
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1000
    .line 1001
    sget-object v2, La/zo90;->p2:La/fl70;

    .line 1002
    .line 1003
    check-cast v1, La/kr90;

    .line 1004
    .line 1005
    iget-boolean v1, v1, La/kr90;->c:Z

    .line 1006
    .line 1007
    if-eqz v1, :cond_13

    .line 1008
    .line 1009
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 1010
    .line 1011
    .line 1012
    :cond_13
    return-void

    .line 1013
    :pswitch_19
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v1, La/gb90;

    .line 1016
    .line 1017
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v0, Landroid/view/View;

    .line 1020
    .line 1021
    iget-object v1, v1, La/gb90;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 1022
    .line 1023
    check-cast v1, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 1024
    .line 1025
    invoke-static {v1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->h(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)Landroid/view/Window;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    new-instance v2, La/ani0;

    .line 1030
    .line 1031
    invoke-direct {v2, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 1032
    .line 1033
    .line 1034
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1035
    .line 1036
    const/16 v3, 0x23

    .line 1037
    .line 1038
    if-lt v0, v3, :cond_14

    .line 1039
    .line 1040
    new-instance v0, La/bjv0;

    .line 1041
    .line 1042
    invoke-direct {v0, v1, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 1043
    .line 1044
    .line 1045
    goto :goto_d

    .line 1046
    :cond_14
    const/16 v3, 0x1e

    .line 1047
    .line 1048
    if-lt v0, v3, :cond_15

    .line 1049
    .line 1050
    new-instance v0, La/ajv0;

    .line 1051
    .line 1052
    invoke-direct {v0, v1, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_d

    .line 1056
    :cond_15
    const/16 v3, 0x1a

    .line 1057
    .line 1058
    if-lt v0, v3, :cond_16

    .line 1059
    .line 1060
    new-instance v0, La/ziv0;

    .line 1061
    .line 1062
    invoke-direct {v0, v1, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 1063
    .line 1064
    .line 1065
    goto :goto_d

    .line 1066
    :cond_16
    new-instance v0, La/yiv0;

    .line 1067
    .line 1068
    invoke-direct {v0, v1, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 1069
    .line 1070
    .line 1071
    :goto_d
    const/4 v1, 0x2

    .line 1072
    invoke-virtual {v0, v1}, La/ycm0;->s(I)V

    .line 1073
    .line 1074
    .line 1075
    const/16 v2, 0x207

    .line 1076
    .line 1077
    invoke-virtual {v0, v2}, La/ycm0;->s(I)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v0, v1}, La/ycm0;->x(I)V

    .line 1081
    .line 1082
    .line 1083
    return-void

    .line 1084
    :pswitch_1a
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 1085
    .line 1086
    check-cast v1, La/mh70;

    .line 1087
    .line 1088
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 1089
    .line 1090
    check-cast v0, La/ck60;

    .line 1091
    .line 1092
    sget-object v2, La/mh70;->Q1:La/jh70;

    .line 1093
    .line 1094
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    if-eqz v2, :cond_17

    .line 1099
    .line 1100
    new-instance v3, La/iha;

    .line 1101
    .line 1102
    new-instance v4, La/ds60;

    .line 1103
    .line 1104
    const/16 v5, 0xc

    .line 1105
    .line 1106
    invoke-direct {v4, v0, v5}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 1107
    .line 1108
    .line 1109
    invoke-direct {v3, v2, v4}, La/iha;-><init>(La/kxq;Lkotlin/jvm/functions/Function2;)V

    .line 1110
    .line 1111
    .line 1112
    iput-object v3, v1, La/mh70;->O1:La/iha;

    .line 1113
    .line 1114
    :cond_17
    return-void

    .line 1115
    :pswitch_1b
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 1116
    .line 1117
    check-cast v1, La/dg70;

    .line 1118
    .line 1119
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 1120
    .line 1121
    check-cast v0, La/ck60;

    .line 1122
    .line 1123
    sget-object v2, La/dg70;->Q1:La/xuz;

    .line 1124
    .line 1125
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    if-eqz v2, :cond_18

    .line 1130
    .line 1131
    new-instance v3, La/iha;

    .line 1132
    .line 1133
    new-instance v4, La/ds60;

    .line 1134
    .line 1135
    const/16 v5, 0xb

    .line 1136
    .line 1137
    invoke-direct {v4, v0, v5}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 1138
    .line 1139
    .line 1140
    invoke-direct {v3, v2, v4}, La/iha;-><init>(La/kxq;Lkotlin/jvm/functions/Function2;)V

    .line 1141
    .line 1142
    .line 1143
    iput-object v3, v1, La/dg70;->O1:La/iha;

    .line 1144
    .line 1145
    :cond_18
    return-void

    .line 1146
    :pswitch_1c
    iget-object v1, v0, La/oh60;->b:Ljava/lang/Object;

    .line 1147
    .line 1148
    check-cast v1, La/o2i0;

    .line 1149
    .line 1150
    iget-object v0, v0, La/oh60;->c:Ljava/lang/Object;

    .line 1151
    .line 1152
    check-cast v0, La/qh60;

    .line 1153
    .line 1154
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1155
    .line 1156
    invoke-virtual {v1, v0, v2}, La/o2i0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1157
    .line 1158
    .line 1159
    return-void

    .line 1160
    nop

    .line 1161
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
