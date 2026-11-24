.class public final synthetic La/iz9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qz9;


# direct methods
.method public synthetic constructor <init>(La/qz9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iz9;->a:B

    iput-object p1, p0, La/iz9;->b:La/qz9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iz9;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, La/cvb0;->b:La/cvb0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v0, v0, La/iz9;->b:La/qz9;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/cvb0;

    .line 18
    .line 19
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 20
    .line 21
    if-ne v1, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()La/wh00;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v0}, La/wh00;->k(La/clz;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, La/d4a;->x()V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, La/cvb0;

    .line 49
    .line 50
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 51
    .line 52
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v2, v2, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()La/nub0;

    .line 59
    .line 60
    .line 61
    if-ne v1, v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 68
    .line 69
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()La/wh00;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, La/wh00;->k(La/clz;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, La/d4a;->x()V

    .line 81
    .line 82
    .line 83
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_1
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, Landroid/view/View;

    .line 89
    .line 90
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v4, v4, v4}, La/sik;->z0(ZZZ)V

    .line 96
    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_2
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, Landroid/view/View;

    .line 104
    .line 105
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, v5}, La/d4a;->z(Z)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_3
    move-object/from16 v1, p1

    .line 121
    .line 122
    check-cast v1, Landroid/view/View;

    .line 123
    .line 124
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0, v4}, La/d4a;->z(Z)V

    .line 134
    .line 135
    .line 136
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_4
    move-object/from16 v1, p1

    .line 140
    .line 141
    check-cast v1, Landroid/view/View;

    .line 142
    .line 143
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v0, La/r0k0;->a:La/r0k0;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, La/d4a;->C(La/a1k0;)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v1, La/d4a;->m:La/p7m0;

    .line 158
    .line 159
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    move-object v6, v0

    .line 164
    check-cast v6, La/ike;

    .line 165
    .line 166
    const/16 v16, 0x0

    .line 167
    .line 168
    const/16 v17, 0xffe

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    const/4 v8, 0x0

    .line 172
    const/4 v9, 0x0

    .line 173
    const/4 v10, 0x0

    .line 174
    const/4 v11, 0x0

    .line 175
    const/4 v12, 0x0

    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    invoke-static/range {v6 .. v17}, La/ike;->a(La/ike;ZIIIFZZZZZI)La/ike;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_2

    .line 188
    .line 189
    iget-object v0, v1, La/d4a;->l:La/p7m0;

    .line 190
    .line 191
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    move-object v2, v1

    .line 196
    check-cast v2, La/wub0;

    .line 197
    .line 198
    const/4 v3, 0x7

    .line 199
    invoke-static {v2, v5, v3}, La/wub0;->a(La/wub0;ZI)La/wub0;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_3

    .line 208
    .line 209
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_5
    move-object/from16 v1, p1

    .line 213
    .line 214
    check-cast v1, Landroid/view/View;

    .line 215
    .line 216
    sget-object v3, La/qz9;->t2:La/kl5;

    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v1, La/d4a;->p:Ljava/util/List;

    .line 226
    .line 227
    iget-object v3, v0, La/d4a;->g:La/p7m0;

    .line 228
    .line 229
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    check-cast v4, La/wjq;

    .line 234
    .line 235
    iget v4, v4, La/wjq;->a:I

    .line 236
    .line 237
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-interface {v1, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    add-int/2addr v4, v5

    .line 246
    if-ltz v4, :cond_4

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    if-ge v4, v6, :cond_4

    .line 253
    .line 254
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    goto :goto_0

    .line 259
    :cond_4
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    :goto_0
    check-cast v1, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    new-instance v4, La/wjq;

    .line 280
    .line 281
    invoke-direct {v4, v1}, La/wjq;-><init>(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3, v2, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    iget-object v1, v0, La/d4a;->m:La/p7m0;

    .line 288
    .line 289
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    move-object v6, v0

    .line 294
    check-cast v6, La/ike;

    .line 295
    .line 296
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, La/wjq;

    .line 301
    .line 302
    iget v9, v2, La/wjq;->a:I

    .line 303
    .line 304
    const v2, 0x7f080918

    .line 305
    .line 306
    .line 307
    if-eqz v9, :cond_6

    .line 308
    .line 309
    if-eq v9, v5, :cond_8

    .line 310
    .line 311
    const/4 v4, 0x2

    .line 312
    if-eq v9, v4, :cond_7

    .line 313
    .line 314
    :cond_6
    :goto_1
    move v8, v2

    .line 315
    goto :goto_2

    .line 316
    :cond_7
    const v2, 0x7f080919

    .line 317
    .line 318
    .line 319
    goto :goto_1

    .line 320
    :cond_8
    const v2, 0x7f08091a

    .line 321
    .line 322
    .line 323
    goto :goto_1

    .line 324
    :goto_2
    const/16 v16, 0x0

    .line 325
    .line 326
    const/16 v17, 0xff9

    .line 327
    .line 328
    const/4 v7, 0x0

    .line 329
    const/4 v10, 0x0

    .line 330
    const/4 v11, 0x0

    .line 331
    const/4 v12, 0x0

    .line 332
    const/4 v13, 0x0

    .line 333
    const/4 v14, 0x0

    .line 334
    const/4 v15, 0x0

    .line 335
    invoke-static/range {v6 .. v17}, La/ike;->a(La/ike;ZIIIFZZZZZI)La/ike;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    if-eqz v0, :cond_5

    .line 344
    .line 345
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_6
    move-object/from16 v1, p1

    .line 349
    .line 350
    check-cast v1, Landroid/view/View;

    .line 351
    .line 352
    sget-object v3, La/qz9;->t2:La/kl5;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iget-object v1, v1, La/rz9;->k:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 362
    .line 363
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    const/high16 v3, -0x3ccc0000    # -180.0f

    .line 368
    .line 369
    invoke-virtual {v1, v3}, Landroid/view/ViewPropertyAnimator;->rotationBy(F)Landroid/view/ViewPropertyAnimator;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    iget-object v3, v3, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 381
    .line 382
    invoke-virtual {v3}, Landroidx/camera/view/PreviewView;->getBitmap()Landroid/graphics/Bitmap;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    if-eqz v3, :cond_9

    .line 387
    .line 388
    const v6, 0x3da3d70a    # 0.08f

    .line 389
    .line 390
    .line 391
    invoke-static {v3, v6}, La/wb;->G(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    goto :goto_3

    .line 396
    :cond_9
    move-object v3, v2

    .line 397
    :goto_3
    iget-object v1, v1, La/d4a;->k:La/p7m0;

    .line 398
    .line 399
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    move-object v7, v6

    .line 404
    check-cast v7, Landroid/graphics/Bitmap;

    .line 405
    .line 406
    invoke-virtual {v1, v6, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    if-eqz v6, :cond_a

    .line 411
    .line 412
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    iget-object v7, v6, La/d4a;->f:La/p7m0;

    .line 417
    .line 418
    iget-object v8, v6, La/d4a;->e:Ljava/util/ArrayList;

    .line 419
    .line 420
    iget-object v0, v6, La/d4a;->j:La/p7m0;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    sget-object v1, La/e4a;->a:La/e4a;

    .line 426
    .line 427
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    iget-object v9, v6, La/d4a;->m:La/p7m0;

    .line 431
    .line 432
    :cond_b
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    move-object v10, v0

    .line 437
    check-cast v10, La/ike;

    .line 438
    .line 439
    const/16 v20, 0x0

    .line 440
    .line 441
    const/16 v21, 0xff

    .line 442
    .line 443
    const/4 v11, 0x0

    .line 444
    const/4 v12, 0x0

    .line 445
    const/4 v13, 0x0

    .line 446
    const/4 v14, 0x0

    .line 447
    const/4 v15, 0x0

    .line 448
    const/16 v16, 0x0

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/16 v18, 0x0

    .line 453
    .line 454
    const/16 v19, 0x0

    .line 455
    .line 456
    invoke-static/range {v10 .. v21}, La/ike;->a(La/ike;ZIIIFZZZZZI)La/ike;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    invoke-virtual {v9, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_b

    .line 465
    .line 466
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    move v1, v4

    .line 471
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    if-eqz v3, :cond_d

    .line 476
    .line 477
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    check-cast v3, La/j0a;

    .line 482
    .line 483
    invoke-interface {v3}, La/j0a;->h()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    check-cast v9, La/ez9;

    .line 492
    .line 493
    iget v9, v9, La/ez9;->a:I

    .line 494
    .line 495
    if-ne v3, v9, :cond_c

    .line 496
    .line 497
    goto :goto_5

    .line 498
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 499
    .line 500
    goto :goto_4

    .line 501
    :cond_d
    const/4 v1, -0x1

    .line 502
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    sub-int/2addr v0, v5

    .line 507
    if-lt v1, v0, :cond_e

    .line 508
    .line 509
    move v1, v4

    .line 510
    goto :goto_6

    .line 511
    :cond_e
    add-int/2addr v1, v5

    .line 512
    :goto_6
    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    check-cast v0, La/j0a;

    .line 517
    .line 518
    if-eqz v0, :cond_f

    .line 519
    .line 520
    invoke-interface {v0}, La/j0a;->h()I

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    new-instance v1, La/ez9;

    .line 525
    .line 526
    invoke-direct {v1, v0}, La/ez9;-><init>(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v7, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    iget-object v0, v6, La/d4a;->l:La/p7m0;

    .line 536
    .line 537
    new-instance v1, La/wub0;

    .line 538
    .line 539
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 540
    .line 541
    invoke-static {v5, v5, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    const/4 v5, 0x0

    .line 549
    invoke-direct {v1, v3, v5, v4, v4}, La/wub0;-><init>(Landroid/graphics/Bitmap;FZZ)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    invoke-virtual {v6}, La/d4a;->A()V

    .line 559
    .line 560
    .line 561
    goto :goto_7

    .line 562
    :cond_f
    invoke-virtual {v6}, La/d4a;->w()V

    .line 563
    .line 564
    .line 565
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    return-object v0

    .line 568
    :pswitch_7
    move-object/from16 v1, p1

    .line 569
    .line 570
    check-cast v1, Ljava/lang/Integer;

    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    sget-object v1, La/qz9;->t2:La/kl5;

    .line 577
    .line 578
    invoke-virtual {v0}, La/qz9;->S0()La/d4a;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    iget-object v0, v0, La/d4a;->m:La/p7m0;

    .line 583
    .line 584
    :cond_10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    move-object v2, v1

    .line 589
    check-cast v2, La/ike;

    .line 590
    .line 591
    sget-object v3, La/d4a;->q:Ljava/util/List;

    .line 592
    .line 593
    if-ltz v6, :cond_11

    .line 594
    .line 595
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-ge v6, v4, :cond_11

    .line 600
    .line 601
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    goto :goto_8

    .line 606
    :cond_11
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    check-cast v3, Ljava/lang/Number;

    .line 611
    .line 612
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    :goto_8
    check-cast v3, Ljava/lang/Number;

    .line 621
    .line 622
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 623
    .line 624
    .line 625
    move-result v7

    .line 626
    const/4 v12, 0x0

    .line 627
    const/16 v13, 0xfe7

    .line 628
    .line 629
    const/4 v3, 0x0

    .line 630
    const/4 v4, 0x0

    .line 631
    const/4 v5, 0x0

    .line 632
    const/4 v8, 0x0

    .line 633
    const/4 v9, 0x0

    .line 634
    const/4 v10, 0x0

    .line 635
    const/4 v11, 0x0

    .line 636
    invoke-static/range {v2 .. v13}, La/ike;->a(La/ike;ZIIIFZZZZZI)La/ike;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v1

    .line 644
    if-eqz v1, :cond_10

    .line 645
    .line 646
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    return-object v0

    .line 649
    :pswitch_data_0
    .packed-switch 0x0
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
