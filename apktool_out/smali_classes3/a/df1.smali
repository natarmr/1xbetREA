.class public final synthetic La/df1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/df1;->a:B

    iput-object p1, p0, La/df1;->b:Ljava/lang/Object;

    iput-object p2, p0, La/df1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/jem;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    iput-byte v0, p0, La/df1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/df1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/df1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/df1;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v3, 0x13

    .line 8
    .line 9
    const/16 v4, 0xe

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x4

    .line 13
    const/16 v10, 0xa

    .line 14
    .line 15
    const/16 v11, 0x8

    .line 16
    .line 17
    const/4 v12, 0x2

    .line 18
    const/4 v13, 0x0

    .line 19
    const/4 v14, 0x0

    .line 20
    const/4 v15, 0x1

    .line 21
    iget-object v9, v0, La/df1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v0, v0, La/df1;->b:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v21, v0

    .line 29
    .line 30
    check-cast v21, Landroid/view/View;

    .line 31
    .line 32
    move-object/from16 v22, v9

    .line 33
    .line 34
    check-cast v22, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 35
    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    check-cast v0, La/lwk;

    .line 39
    .line 40
    sget v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v20, La/jie0;

    .line 46
    .line 47
    invoke-direct/range {v20 .. v20}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v19, La/hie0;

    .line 51
    .line 52
    invoke-direct/range {v19 .. v19}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v17, La/mr3;

    .line 56
    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    invoke-direct/range {v17 .. v22}, La/mr3;-><init>(BLa/hie0;La/jie0;Landroid/view/View;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v0, v17

    .line 63
    .line 64
    new-instance v17, La/tr3;

    .line 65
    .line 66
    invoke-direct/range {v17 .. v22}, La/tr3;-><init>(BLa/hie0;La/jie0;Landroid/view/View;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object/from16 v2, v17

    .line 70
    .line 71
    move-object/from16 v1, v21

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 78
    .line 79
    .line 80
    sget-object v4, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 81
    .line 82
    invoke-static {v1, v2}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, La/u43;

    .line 86
    .line 87
    invoke-direct {v2, v3, v0, v1, v15}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :pswitch_0
    check-cast v0, La/ayq;

    .line 92
    .line 93
    check-cast v9, La/wp3;

    .line 94
    .line 95
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    sget-object v2, La/wp3;->O1:[La/iiy;

    .line 104
    .line 105
    iget-object v2, v0, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 106
    .line 107
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 111
    .line 112
    invoke-virtual {v0, v13}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->s:Landroid/widget/Button;

    .line 116
    .line 117
    invoke-virtual {v0, v13}, Landroid/view/View;->setEnabled(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, La/wp3;->H0()La/kq3;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v2, v0, La/kq3;->d:La/lzt;

    .line 125
    .line 126
    invoke-virtual {v2}, La/lzt;->a()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_0

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    iget-object v2, v0, La/kq3;->u:La/bby;

    .line 134
    .line 135
    if-eqz v2, :cond_1

    .line 136
    .line 137
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-ne v2, v15, :cond_1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iget-object v2, v0, La/kq3;->f:La/mne;

    .line 149
    .line 150
    iget-object v6, v2, La/mne;->b:La/dvj;

    .line 151
    .line 152
    new-instance v16, La/bk2;

    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const/16 v23, 0x11

    .line 157
    .line 158
    const/16 v17, 0x1

    .line 159
    .line 160
    const-class v19, La/kq3;

    .line 161
    .line 162
    const-string v20, "handleGameError"

    .line 163
    .line 164
    const-string v21, "handleGameError(Ljava/lang/Throwable;)V"

    .line 165
    .line 166
    move-object/from16 v18, v0

    .line 167
    .line 168
    invoke-direct/range {v16 .. v23}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 169
    .line 170
    .line 171
    new-instance v7, La/iq3;

    .line 172
    .line 173
    invoke-direct {v7, v0, v1, v14, v13}, La/iq3;-><init>(La/w46;ILa/yje;B)V

    .line 174
    .line 175
    .line 176
    const/16 v8, 0xa

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    move-object/from16 v4, v16

    .line 180
    .line 181
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iput-object v1, v0, La/kq3;->u:La/bby;

    .line 186
    .line 187
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_1
    check-cast v0, La/o53;

    .line 191
    .line 192
    check-cast v9, La/t6k;

    .line 193
    .line 194
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, La/ou90;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget v2, v0, La/o53;->a:I

    .line 202
    .line 203
    iget v3, v0, La/o53;->b:I

    .line 204
    .line 205
    iget v4, v0, La/o53;->e:I

    .line 206
    .line 207
    sub-int/2addr v2, v4

    .line 208
    iget-object v4, v0, La/o53;->c:La/pu90;

    .line 209
    .line 210
    const/4 v5, 0x0

    .line 211
    if-eqz v4, :cond_2

    .line 212
    .line 213
    div-int/lit8 v6, v3, 0x2

    .line 214
    .line 215
    iget v7, v0, La/o53;->g:I

    .line 216
    .line 217
    div-int/2addr v7, v12

    .line 218
    sub-int/2addr v6, v7

    .line 219
    invoke-virtual {v1, v4, v2, v6, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 220
    .line 221
    .line 222
    :cond_2
    iget v4, v9, La/t6k;->c:F

    .line 223
    .line 224
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    mul-float/2addr v6, v4

    .line 229
    float-to-int v4, v6

    .line 230
    sub-int/2addr v2, v4

    .line 231
    iget v4, v0, La/o53;->f:I

    .line 232
    .line 233
    sub-int/2addr v2, v4

    .line 234
    iget-object v4, v0, La/o53;->d:La/pu90;

    .line 235
    .line 236
    if-eqz v4, :cond_3

    .line 237
    .line 238
    div-int/2addr v3, v12

    .line 239
    iget v0, v0, La/o53;->h:I

    .line 240
    .line 241
    div-int/2addr v0, v12

    .line 242
    sub-int/2addr v3, v0

    .line 243
    invoke-virtual {v1, v4, v2, v3, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 244
    .line 245
    .line 246
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_2
    check-cast v0, La/e7z;

    .line 250
    .line 251
    check-cast v9, La/mm40;

    .line 252
    .line 253
    move-object/from16 v1, p1

    .line 254
    .line 255
    check-cast v1, La/mm40;

    .line 256
    .line 257
    invoke-interface {v1, v9}, La/mm40;->e(La/mm40;)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v0, v1}, La/e7z;->e0(La/mm40;)V

    .line 262
    .line 263
    .line 264
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_3
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 268
    .line 269
    check-cast v9, La/xdr;

    .line 270
    .line 271
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, Landroid/content/Context;

    .line 274
    .line 275
    if-eqz v0, :cond_5

    .line 276
    .line 277
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 278
    .line 279
    if-nez v2, :cond_4

    .line 280
    .line 281
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->b0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    iput-object v2, v0, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 286
    .line 287
    :cond_4
    if-nez v2, :cond_6

    .line 288
    .line 289
    :cond_5
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    :cond_6
    new-instance v0, Landroid/widget/FrameLayout;

    .line 294
    .line 295
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 296
    .line 297
    .line 298
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-interface {v9, v2, v0, v1}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, La/yfu0;

    .line 305
    .line 306
    invoke-interface {v0}, La/yfu0;->getRoot()Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    const v2, 0x7f0a0164

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-object v1

    .line 317
    :pswitch_4
    check-cast v0, La/rmb0;

    .line 318
    .line 319
    check-cast v9, La/vmb0;

    .line 320
    .line 321
    move-object/from16 v1, p1

    .line 322
    .line 323
    check-cast v1, La/lwk;

    .line 324
    .line 325
    invoke-virtual {v0, v9}, La/rmb0;->setPositionProvider(La/vmb0;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, La/rmb0;->r()V

    .line 329
    .line 330
    .line 331
    new-instance v0, La/mz2;

    .line 332
    .line 333
    invoke-direct {v0, v15}, La/mz2;-><init>(B)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_5
    check-cast v0, La/ejz;

    .line 338
    .line 339
    check-cast v9, La/c13;

    .line 340
    .line 341
    move-object/from16 v1, p1

    .line 342
    .line 343
    check-cast v1, La/vne;

    .line 344
    .line 345
    new-instance v1, La/yex;

    .line 346
    .line 347
    new-instance v2, La/a13;

    .line 348
    .line 349
    invoke-direct {v2, v9, v13}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 350
    .line 351
    .line 352
    invoke-direct {v1, v0, v2}, La/yex;-><init>(La/ejz;La/a13;)V

    .line 353
    .line 354
    .line 355
    return-object v1

    .line 356
    :pswitch_6
    check-cast v0, La/hv2;

    .line 357
    .line 358
    check-cast v9, La/nv2;

    .line 359
    .line 360
    move-object/from16 v1, p1

    .line 361
    .line 362
    check-cast v1, La/odl;

    .line 363
    .line 364
    iget-wide v1, v1, La/odl;->a:J

    .line 365
    .line 366
    invoke-virtual {v0}, La/hv2;->v1()Z

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-eqz v3, :cond_7

    .line 371
    .line 372
    const/high16 v3, -0x40800000    # -1.0f

    .line 373
    .line 374
    :goto_1
    invoke-static {v3, v1, v2}, La/ne60;->g(FJ)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    goto :goto_2

    .line 379
    :cond_7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 380
    .line 381
    goto :goto_1

    .line 382
    :goto_2
    iget-object v3, v0, La/hel;->q:La/ma80;

    .line 383
    .line 384
    sget-object v4, La/ma80;->a:La/ma80;

    .line 385
    .line 386
    if-ne v3, v4, :cond_8

    .line 387
    .line 388
    const-wide v3, 0xffffffffL

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    and-long/2addr v1, v3

    .line 394
    :goto_3
    long-to-int v1, v1

    .line 395
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    goto :goto_4

    .line 400
    :cond_8
    const/16 v3, 0x20

    .line 401
    .line 402
    shr-long/2addr v1, v3

    .line 403
    goto :goto_3

    .line 404
    :goto_4
    iget-object v0, v0, La/hv2;->k1:La/rv2;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, La/rv2;->e(F)F

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    invoke-static {v9, v0}, La/nv2;->b(La/nv2;F)V

    .line 411
    .line 412
    .line 413
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_7
    check-cast v0, La/yn2;

    .line 417
    .line 418
    check-cast v9, La/js0;

    .line 419
    .line 420
    move-object/from16 v1, p1

    .line 421
    .line 422
    check-cast v1, La/k0w0;

    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    iget-object v2, v0, La/yn2;->F:La/uf3;

    .line 428
    .line 429
    iget-wide v3, v9, La/js0;->a:J

    .line 430
    .line 431
    iget-object v5, v9, La/js0;->c:Ljava/lang/String;

    .line 432
    .line 433
    iget-wide v10, v9, La/js0;->e:J

    .line 434
    .line 435
    iget-boolean v6, v9, La/js0;->g:Z

    .line 436
    .line 437
    iget-wide v13, v9, La/js0;->f:J

    .line 438
    .line 439
    iget-boolean v12, v9, La/js0;->h:Z

    .line 440
    .line 441
    move/from16 v32, v15

    .line 442
    .line 443
    iget-boolean v15, v9, La/js0;->i:Z

    .line 444
    .line 445
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v16

    .line 449
    move-object/from16 v7, v16

    .line 450
    .line 451
    check-cast v7, La/xm2;

    .line 452
    .line 453
    iget-object v7, v7, La/xm2;->d:Ljava/util/List;

    .line 454
    .line 455
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v8

    .line 465
    if-eqz v8, :cond_a

    .line 466
    .line 467
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    check-cast v8, La/oxy;

    .line 472
    .line 473
    invoke-interface {v8}, La/oxy;->a()J

    .line 474
    .line 475
    .line 476
    move-result-wide v20

    .line 477
    move-object v8, v2

    .line 478
    move-wide/from16 v22, v3

    .line 479
    .line 480
    iget-wide v2, v9, La/js0;->a:J

    .line 481
    .line 482
    cmp-long v2, v20, v2

    .line 483
    .line 484
    if-nez v2, :cond_9

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_9
    add-int/lit8 v17, v17, 0x1

    .line 488
    .line 489
    move-object v2, v8

    .line 490
    move-wide/from16 v3, v22

    .line 491
    .line 492
    goto :goto_5

    .line 493
    :cond_a
    move-object v8, v2

    .line 494
    move-wide/from16 v22, v3

    .line 495
    .line 496
    const/16 v17, -0x1

    .line 497
    .line 498
    :goto_6
    add-int/lit8 v17, v17, 0x1

    .line 499
    .line 500
    iget-object v0, v0, La/yn2;->V:La/eyg0;

    .line 501
    .line 502
    new-instance v24, La/lu0;

    .line 503
    .line 504
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v27

    .line 508
    const-string v2, "recent"

    .line 509
    .line 510
    const-wide/16 v3, 0x0

    .line 511
    .line 512
    invoke-static {v3, v4, v2}, La/hne;->r(JLjava/lang/String;)Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v29

    .line 516
    const-wide/16 v25, 0x0

    .line 517
    .line 518
    const-string v28, "bet_favor_viewed"

    .line 519
    .line 520
    invoke-direct/range {v24 .. v29}, La/lu0;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v2, v24

    .line 524
    .line 525
    invoke-virtual {v0, v2}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v30

    .line 529
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    const/16 v25, 0x0

    .line 536
    .line 537
    const/16 v26, 0x200a

    .line 538
    .line 539
    const/16 v28, 0x0

    .line 540
    .line 541
    const/16 v29, 0x0

    .line 542
    .line 543
    const/16 v31, 0x1

    .line 544
    .line 545
    move-object/from16 v18, v5

    .line 546
    .line 547
    move/from16 v21, v6

    .line 548
    .line 549
    move-wide/from16 v19, v10

    .line 550
    .line 551
    move/from16 v24, v12

    .line 552
    .line 553
    move/from16 v27, v15

    .line 554
    .line 555
    move-wide/from16 v16, v22

    .line 556
    .line 557
    move-wide/from16 v22, v13

    .line 558
    .line 559
    invoke-static/range {v16 .. v31}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v0, La/c8d;

    .line 570
    .line 571
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 572
    .line 573
    iget-boolean v2, v9, La/js0;->i:Z

    .line 574
    .line 575
    xor-int/lit8 v2, v2, 0x1

    .line 576
    .line 577
    new-instance v3, La/v7d;

    .line 578
    .line 579
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 580
    .line 581
    .line 582
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 583
    .line 584
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_8
    check-cast v0, La/yn2;

    .line 588
    .line 589
    check-cast v9, La/d0t;

    .line 590
    .line 591
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, La/k0w0;

    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object v0, v0, La/yn2;->E:La/yfm0;

    .line 599
    .line 600
    iget-object v2, v9, La/d0t;->Q:Ljava/lang/String;

    .line 601
    .line 602
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    if-nez v3, :cond_b

    .line 607
    .line 608
    iget-wide v2, v9, La/d0t;->a:J

    .line 609
    .line 610
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    :cond_b
    iget-wide v3, v9, La/d0t;->v:J

    .line 615
    .line 616
    check-cast v0, La/zfm0;

    .line 617
    .line 618
    invoke-virtual {v0, v3, v4, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 623
    .line 624
    .line 625
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 626
    .line 627
    return-object v0

    .line 628
    :pswitch_9
    move/from16 v32, v15

    .line 629
    .line 630
    check-cast v0, La/nhe;

    .line 631
    .line 632
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 633
    .line 634
    move-object/from16 v11, p1

    .line 635
    .line 636
    check-cast v11, La/i8z;

    .line 637
    .line 638
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-object v1, v0, La/nhe;->a:La/a4x;

    .line 642
    .line 643
    new-instance v2, La/ma2;

    .line 644
    .line 645
    const/16 v3, 0x10

    .line 646
    .line 647
    invoke-direct {v2, v3}, La/ma2;-><init>(B)V

    .line 648
    .line 649
    .line 650
    new-instance v3, La/xd2;

    .line 651
    .line 652
    const/16 v4, 0xf

    .line 653
    .line 654
    invoke-direct {v3, v4}, La/xd2;-><init>(B)V

    .line 655
    .line 656
    .line 657
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 658
    .line 659
    .line 660
    move-result v12

    .line 661
    new-instance v14, La/a8;

    .line 662
    .line 663
    invoke-direct {v14, v2, v1, v6}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 664
    .line 665
    .line 666
    new-instance v15, La/ci2;

    .line 667
    .line 668
    invoke-direct {v15, v3, v1, v10}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 669
    .line 670
    .line 671
    new-instance v2, La/c8;

    .line 672
    .line 673
    invoke-direct {v2, v1, v9, v0, v5}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 674
    .line 675
    .line 676
    new-instance v0, La/ugd;

    .line 677
    .line 678
    const v1, -0x4297e015

    .line 679
    .line 680
    .line 681
    move/from16 v3, v32

    .line 682
    .line 683
    invoke-direct {v0, v1, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    const/4 v13, 0x0

    .line 687
    move-object/from16 v16, v0

    .line 688
    .line 689
    invoke-virtual/range {v11 .. v16}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 690
    .line 691
    .line 692
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 693
    .line 694
    return-object v0

    .line 695
    :pswitch_a
    check-cast v0, La/hd2;

    .line 696
    .line 697
    check-cast v9, Ljava/util/Set;

    .line 698
    .line 699
    move-object/from16 v1, p1

    .line 700
    .line 701
    check-cast v1, La/k0w0;

    .line 702
    .line 703
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    iget-object v0, v0, La/hd2;->s:La/gle0;

    .line 707
    .line 708
    check-cast v9, Ljava/lang/Iterable;

    .line 709
    .line 710
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    new-instance v0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getLiveGamesScreen$1;

    .line 721
    .line 722
    invoke-direct {v0, v2}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getLiveGamesScreen$1;-><init>(Ljava/util/Set;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 726
    .line 727
    .line 728
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_b
    check-cast v0, La/zb2;

    .line 732
    .line 733
    check-cast v9, Ljava/util/Set;

    .line 734
    .line 735
    move-object/from16 v1, p1

    .line 736
    .line 737
    check-cast v1, La/k0w0;

    .line 738
    .line 739
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    iget-object v0, v0, La/zb2;->t:La/gle0;

    .line 743
    .line 744
    check-cast v9, Ljava/lang/Iterable;

    .line 745
    .line 746
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    new-instance v0, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;

    .line 757
    .line 758
    invoke-direct {v0, v2}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;-><init>(Ljava/util/List;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 762
    .line 763
    .line 764
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 765
    .line 766
    return-object v0

    .line 767
    :pswitch_c
    check-cast v0, La/ctf0;

    .line 768
    .line 769
    check-cast v9, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;

    .line 770
    .line 771
    move-object/from16 v1, p1

    .line 772
    .line 773
    check-cast v1, La/ab2;

    .line 774
    .line 775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    iget-object v1, v9, Lorg/xplatform/results/impl/presentation/alt_history/GamesHistoryResultsParams;->a:Ljava/lang/String;

    .line 779
    .line 780
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    if-nez v2, :cond_c

    .line 785
    .line 786
    const/4 v2, 0x0

    .line 787
    new-array v1, v2, [Ljava/lang/Object;

    .line 788
    .line 789
    iget-object v3, v0, La/ctf0;->b:La/lsm0;

    .line 790
    .line 791
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    const v2, 0x7f13087f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v3, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    :cond_c
    new-instance v2, La/db2;

    .line 803
    .line 804
    invoke-direct {v2, v0, v1}, La/db2;-><init>(La/ctf0;Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    return-object v2

    .line 808
    :pswitch_d
    const-wide/16 v3, 0x0

    .line 809
    .line 810
    check-cast v0, La/n92;

    .line 811
    .line 812
    check-cast v9, La/uf50;

    .line 813
    .line 814
    move-object/from16 v1, p1

    .line 815
    .line 816
    check-cast v1, La/k0w0;

    .line 817
    .line 818
    iget-object v0, v0, La/n92;->U:La/qv2;

    .line 819
    .line 820
    sget-object v23, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 821
    .line 822
    sget-object v24, La/grs;->b:La/grs;

    .line 823
    .line 824
    sget-object v27, La/ors;->a:La/ors;

    .line 825
    .line 826
    sget-object v30, La/k1g;->h:La/k1g;

    .line 827
    .line 828
    invoke-interface {v9}, La/uf50;->getId()J

    .line 829
    .line 830
    .line 831
    move-result-wide v11

    .line 832
    invoke-interface {v9}, La/uf50;->g()La/xh50;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    iget-wide v5, v2, La/xh50;->e:J

    .line 837
    .line 838
    invoke-interface {v9}, La/uf50;->i()Z

    .line 839
    .line 840
    .line 841
    move-result v22

    .line 842
    invoke-interface {v9}, La/uf50;->j()La/fi50;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    if-eqz v2, :cond_d

    .line 847
    .line 848
    iget-wide v7, v2, La/fi50;->a:J

    .line 849
    .line 850
    move-wide/from16 v17, v7

    .line 851
    .line 852
    goto :goto_7

    .line 853
    :cond_d
    move-wide/from16 v17, v3

    .line 854
    .line 855
    :goto_7
    invoke-interface {v9}, La/uf50;->g()La/xh50;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    iget-boolean v2, v2, La/xh50;->b:Z

    .line 860
    .line 861
    new-instance v10, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 862
    .line 863
    const-wide/16 v13, 0x0

    .line 864
    .line 865
    const-wide/16 v20, 0x0

    .line 866
    .line 867
    const-string v25, "main_screen"

    .line 868
    .line 869
    const-string v26, ""

    .line 870
    .line 871
    const/16 v28, 0x0

    .line 872
    .line 873
    const/16 v29, 0x0

    .line 874
    .line 875
    move/from16 v19, v2

    .line 876
    .line 877
    move-wide v15, v5

    .line 878
    invoke-direct/range {v10 .. v30}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v0, v10}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 886
    .line 887
    .line 888
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 889
    .line 890
    return-object v0

    .line 891
    :pswitch_e
    check-cast v0, La/s72;

    .line 892
    .line 893
    check-cast v9, Ljava/lang/String;

    .line 894
    .line 895
    move-object/from16 v1, p1

    .line 896
    .line 897
    check-cast v1, La/k0w0;

    .line 898
    .line 899
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    iget-object v2, v0, La/s72;->x:La/gle0;

    .line 903
    .line 904
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    check-cast v3, La/g72;

    .line 909
    .line 910
    iget-object v3, v3, La/g72;->p:Ljava/util/Set;

    .line 911
    .line 912
    check-cast v3, Ljava/lang/Iterable;

    .line 913
    .line 914
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    iget-object v0, v0, La/s72;->o:Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 919
    .line 920
    iget-boolean v4, v0, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;->d:Z

    .line 921
    .line 922
    iget v0, v0, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;->c:I

    .line 923
    .line 924
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    new-instance v2, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1;

    .line 931
    .line 932
    invoke-direct {v2, v0, v9, v3, v4}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1;-><init>(ILjava/lang/String;Ljava/util/List;Z)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 936
    .line 937
    .line 938
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 939
    .line 940
    return-object v0

    .line 941
    :pswitch_f
    check-cast v0, La/s72;

    .line 942
    .line 943
    check-cast v9, La/s62;

    .line 944
    .line 945
    move-object/from16 v1, p1

    .line 946
    .line 947
    check-cast v1, La/k0w0;

    .line 948
    .line 949
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    new-instance v2, La/r72;

    .line 953
    .line 954
    const/4 v3, 0x0

    .line 955
    invoke-direct {v2, v0, v9, v14, v3}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 956
    .line 957
    .line 958
    new-instance v0, La/b1w0;

    .line 959
    .line 960
    invoke-direct {v0, v2}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 968
    .line 969
    check-cast v0, La/c8d;

    .line 970
    .line 971
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 972
    .line 973
    new-instance v2, La/v7d;

    .line 974
    .line 975
    const/4 v3, 0x1

    .line 976
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 977
    .line 978
    .line 979
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 980
    .line 981
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 982
    .line 983
    return-object v0

    .line 984
    :pswitch_10
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 985
    .line 986
    check-cast v0, La/jem;

    .line 987
    .line 988
    move-object/from16 v1, p1

    .line 989
    .line 990
    check-cast v1, La/wgl0;

    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    new-instance v1, La/sdm;

    .line 996
    .line 997
    iget-wide v2, v0, La/jem;->a:J

    .line 998
    .line 999
    invoke-direct {v1, v2, v3}, La/sdm;-><init>(J)V

    .line 1000
    .line 1001
    .line 1002
    invoke-interface {v9, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1006
    .line 1007
    return-object v0

    .line 1008
    :pswitch_11
    check-cast v0, La/ctf0;

    .line 1009
    .line 1010
    check-cast v9, La/f8w;

    .line 1011
    .line 1012
    move-object/from16 v1, p1

    .line 1013
    .line 1014
    check-cast v1, La/c52;

    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    const/4 v2, 0x0

    .line 1023
    new-array v3, v2, [Ljava/lang/Object;

    .line 1024
    .line 1025
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1026
    .line 1027
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    const v2, 0x7f1308b5

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v0, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v19

    .line 1038
    iget-object v2, v1, La/c52;->e:La/wdj;

    .line 1039
    .line 1040
    iget-object v3, v1, La/c52;->c:Ljava/util/List;

    .line 1041
    .line 1042
    iget-object v4, v1, La/c52;->d:Ljava/util/List;

    .line 1043
    .line 1044
    iget-object v6, v1, La/c52;->a:Ljava/util/List;

    .line 1045
    .line 1046
    iget-object v7, v1, La/c52;->b:Ljava/util/List;

    .line 1047
    .line 1048
    iget-object v8, v1, La/c52;->f:La/wdj;

    .line 1049
    .line 1050
    iget-boolean v11, v1, La/c52;->g:Z

    .line 1051
    .line 1052
    iget-boolean v13, v1, La/c52;->j:Z

    .line 1053
    .line 1054
    if-nez v11, :cond_e

    .line 1055
    .line 1056
    :goto_8
    move-object v11, v14

    .line 1057
    goto/16 :goto_e

    .line 1058
    .line 1059
    :cond_e
    sget-object v11, La/f8w;->b:La/f8w;

    .line 1060
    .line 1061
    if-ne v9, v11, :cond_f

    .line 1062
    .line 1063
    goto :goto_8

    .line 1064
    :cond_f
    sget-object v9, La/s3q;->a:La/s3q;

    .line 1065
    .line 1066
    const/4 v11, 0x0

    .line 1067
    new-array v15, v11, [Ljava/lang/Object;

    .line 1068
    .line 1069
    invoke-static {v15, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v15

    .line 1073
    const v10, 0x7f130f2d

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v0, v10, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v10

    .line 1080
    sget-object v23, La/syl;->b:La/syl;

    .line 1081
    .line 1082
    sget-object v15, La/hh80;->a:La/gh80;

    .line 1083
    .line 1084
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    sget-object v24, La/gh80;->b:La/fh80;

    .line 1088
    .line 1089
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v15

    .line 1093
    new-instance v33, La/lxl;

    .line 1094
    .line 1095
    sget-object v16, La/j3q;->b:[La/j3q;

    .line 1096
    .line 1097
    new-instance v5, La/xxl;

    .line 1098
    .line 1099
    new-array v12, v11, [Ljava/lang/Object;

    .line 1100
    .line 1101
    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v12

    .line 1105
    const v11, 0x7f1309df

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v0, v11, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v11

    .line 1112
    invoke-direct {v5, v11}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    instance-of v11, v2, La/tdj;

    .line 1116
    .line 1117
    if-eqz v11, :cond_10

    .line 1118
    .line 1119
    sget-object v11, La/uxl;->b:La/uxl;

    .line 1120
    .line 1121
    :goto_9
    move-object/from16 v38, v11

    .line 1122
    .line 1123
    goto :goto_a

    .line 1124
    :cond_10
    sget-object v11, La/uxl;->a:La/uxl;

    .line 1125
    .line 1126
    goto :goto_9

    .line 1127
    :goto_a
    const/16 v39, 0x0

    .line 1128
    .line 1129
    const/16 v40, 0x68

    .line 1130
    .line 1131
    const-wide/16 v34, -0x12c

    .line 1132
    .line 1133
    const/16 v37, 0x0

    .line 1134
    .line 1135
    move-object/from16 v36, v5

    .line 1136
    .line 1137
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1138
    .line 1139
    .line 1140
    move-object/from16 v5, v33

    .line 1141
    .line 1142
    if-eqz v13, :cond_11

    .line 1143
    .line 1144
    invoke-virtual {v15, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1145
    .line 1146
    .line 1147
    :cond_11
    new-instance v33, La/lxl;

    .line 1148
    .line 1149
    new-instance v5, La/xxl;

    .line 1150
    .line 1151
    const/4 v11, 0x0

    .line 1152
    new-array v12, v11, [Ljava/lang/Object;

    .line 1153
    .line 1154
    invoke-static {v12, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v12

    .line 1158
    const v11, 0x7f1309e0

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v0, v11, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v11

    .line 1165
    invoke-direct {v5, v11}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    sget-object v11, La/udj;->a:La/udj;

    .line 1169
    .line 1170
    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v11

    .line 1174
    if-eqz v11, :cond_12

    .line 1175
    .line 1176
    sget-object v11, La/uxl;->b:La/uxl;

    .line 1177
    .line 1178
    :goto_b
    move-object/from16 v38, v11

    .line 1179
    .line 1180
    goto :goto_c

    .line 1181
    :cond_12
    sget-object v11, La/uxl;->a:La/uxl;

    .line 1182
    .line 1183
    goto :goto_b

    .line 1184
    :goto_c
    const/16 v39, 0x0

    .line 1185
    .line 1186
    const/16 v40, 0x68

    .line 1187
    .line 1188
    const-wide/16 v34, -0x190

    .line 1189
    .line 1190
    const/16 v37, 0x0

    .line 1191
    .line 1192
    move-object/from16 v36, v5

    .line 1193
    .line 1194
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1195
    .line 1196
    .line 1197
    move-object/from16 v5, v33

    .line 1198
    .line 1199
    invoke-virtual {v15, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1200
    .line 1201
    .line 1202
    instance-of v5, v2, La/vdj;

    .line 1203
    .line 1204
    if-eqz v5, :cond_13

    .line 1205
    .line 1206
    sget-object v5, La/rdj;->a:La/rdj;

    .line 1207
    .line 1208
    move-object v5, v2

    .line 1209
    check-cast v5, La/vdj;

    .line 1210
    .line 1211
    iget-wide v11, v5, La/vdj;->a:J

    .line 1212
    .line 1213
    new-instance v13, La/znq0;

    .line 1214
    .line 1215
    invoke-direct {v13, v11, v12}, La/znq0;-><init>(J)V

    .line 1216
    .line 1217
    .line 1218
    sget-object v11, La/sdj;->b:La/sdj;

    .line 1219
    .line 1220
    const/16 v12, 0x3c

    .line 1221
    .line 1222
    invoke-static {v13, v11, v14, v12}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v13

    .line 1226
    move-object/from16 v22, v13

    .line 1227
    .line 1228
    iget-wide v12, v5, La/vdj;->b:J

    .line 1229
    .line 1230
    new-instance v5, La/znq0;

    .line 1231
    .line 1232
    invoke-direct {v5, v12, v13}, La/znq0;-><init>(J)V

    .line 1233
    .line 1234
    .line 1235
    const/16 v12, 0x3c

    .line 1236
    .line 1237
    invoke-static {v5, v11, v14, v12}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v5

    .line 1241
    new-instance v33, La/lxl;

    .line 1242
    .line 1243
    new-instance v36, La/byl;

    .line 1244
    .line 1245
    move-object/from16 v11, v22

    .line 1246
    .line 1247
    filled-new-array {v11, v5}, [Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v5

    .line 1251
    const/4 v11, 0x2

    .line 1252
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v5

    .line 1256
    const v11, 0x7f13067a

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v0, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v26

    .line 1263
    new-instance v5, La/m0x;

    .line 1264
    .line 1265
    const/4 v11, 0x6

    .line 1266
    const v12, 0x7f080815

    .line 1267
    .line 1268
    .line 1269
    invoke-direct {v5, v12, v14, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1270
    .line 1271
    .line 1272
    const/16 v29, 0x0

    .line 1273
    .line 1274
    const/16 v30, 0x1c

    .line 1275
    .line 1276
    const/16 v28, 0x0

    .line 1277
    .line 1278
    move-object/from16 v27, v5

    .line 1279
    .line 1280
    move-object/from16 v25, v36

    .line 1281
    .line 1282
    invoke-direct/range {v25 .. v30}, La/byl;-><init>(Ljava/lang/String;La/m0x;Ljava/lang/Integer;Ljava/lang/Boolean;I)V

    .line 1283
    .line 1284
    .line 1285
    sget-object v38, La/uxl;->b:La/uxl;

    .line 1286
    .line 1287
    const/16 v39, 0x0

    .line 1288
    .line 1289
    const/16 v40, 0x68

    .line 1290
    .line 1291
    const-wide/16 v34, -0x1f4

    .line 1292
    .line 1293
    const/16 v37, 0x0

    .line 1294
    .line 1295
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1296
    .line 1297
    .line 1298
    move-object/from16 v5, v33

    .line 1299
    .line 1300
    invoke-virtual {v15, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    goto/16 :goto_d

    .line 1304
    .line 1305
    :cond_13
    instance-of v5, v8, La/vdj;

    .line 1306
    .line 1307
    if-eqz v5, :cond_14

    .line 1308
    .line 1309
    sget-object v5, La/rdj;->a:La/rdj;

    .line 1310
    .line 1311
    move-object v5, v8

    .line 1312
    check-cast v5, La/vdj;

    .line 1313
    .line 1314
    iget-wide v11, v5, La/vdj;->a:J

    .line 1315
    .line 1316
    new-instance v13, La/znq0;

    .line 1317
    .line 1318
    invoke-direct {v13, v11, v12}, La/znq0;-><init>(J)V

    .line 1319
    .line 1320
    .line 1321
    sget-object v11, La/sdj;->b:La/sdj;

    .line 1322
    .line 1323
    const/16 v12, 0x3c

    .line 1324
    .line 1325
    invoke-static {v13, v11, v14, v12}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v13

    .line 1329
    move-object/from16 v22, v13

    .line 1330
    .line 1331
    iget-wide v12, v5, La/vdj;->b:J

    .line 1332
    .line 1333
    new-instance v5, La/znq0;

    .line 1334
    .line 1335
    invoke-direct {v5, v12, v13}, La/znq0;-><init>(J)V

    .line 1336
    .line 1337
    .line 1338
    const/16 v12, 0x3c

    .line 1339
    .line 1340
    invoke-static {v5, v11, v14, v12}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v5

    .line 1344
    new-instance v33, La/lxl;

    .line 1345
    .line 1346
    new-instance v36, La/byl;

    .line 1347
    .line 1348
    move-object/from16 v11, v22

    .line 1349
    .line 1350
    filled-new-array {v11, v5}, [Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v5

    .line 1354
    const/4 v11, 0x2

    .line 1355
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v5

    .line 1359
    const v11, 0x7f13067a

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {v0, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v26

    .line 1366
    new-instance v5, La/m0x;

    .line 1367
    .line 1368
    const/4 v11, 0x6

    .line 1369
    const v12, 0x7f080815

    .line 1370
    .line 1371
    .line 1372
    invoke-direct {v5, v12, v14, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1373
    .line 1374
    .line 1375
    const/16 v29, 0x0

    .line 1376
    .line 1377
    const/16 v30, 0x1c

    .line 1378
    .line 1379
    const/16 v28, 0x0

    .line 1380
    .line 1381
    move-object/from16 v27, v5

    .line 1382
    .line 1383
    move-object/from16 v25, v36

    .line 1384
    .line 1385
    invoke-direct/range {v25 .. v30}, La/byl;-><init>(Ljava/lang/String;La/m0x;Ljava/lang/Integer;Ljava/lang/Boolean;I)V

    .line 1386
    .line 1387
    .line 1388
    sget-object v38, La/uxl;->a:La/uxl;

    .line 1389
    .line 1390
    const/16 v39, 0x0

    .line 1391
    .line 1392
    const/16 v40, 0x68

    .line 1393
    .line 1394
    const-wide/16 v34, -0x1f4

    .line 1395
    .line 1396
    const/16 v37, 0x0

    .line 1397
    .line 1398
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1399
    .line 1400
    .line 1401
    move-object/from16 v5, v33

    .line 1402
    .line 1403
    invoke-virtual {v15, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1404
    .line 1405
    .line 1406
    goto :goto_d

    .line 1407
    :cond_14
    new-instance v33, La/lxl;

    .line 1408
    .line 1409
    new-instance v36, La/byl;

    .line 1410
    .line 1411
    const/4 v11, 0x0

    .line 1412
    new-array v5, v11, [Ljava/lang/Object;

    .line 1413
    .line 1414
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v5

    .line 1418
    const v11, 0x7f1309f1

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v0, v11, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v26

    .line 1425
    new-instance v5, La/m0x;

    .line 1426
    .line 1427
    const/4 v11, 0x6

    .line 1428
    const v12, 0x7f080815

    .line 1429
    .line 1430
    .line 1431
    invoke-direct {v5, v12, v14, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1432
    .line 1433
    .line 1434
    const/16 v29, 0x0

    .line 1435
    .line 1436
    const/16 v30, 0x1c

    .line 1437
    .line 1438
    const/16 v28, 0x0

    .line 1439
    .line 1440
    move-object/from16 v27, v5

    .line 1441
    .line 1442
    move-object/from16 v25, v36

    .line 1443
    .line 1444
    invoke-direct/range {v25 .. v30}, La/byl;-><init>(Ljava/lang/String;La/m0x;Ljava/lang/Integer;Ljava/lang/Boolean;I)V

    .line 1445
    .line 1446
    .line 1447
    sget-object v38, La/uxl;->a:La/uxl;

    .line 1448
    .line 1449
    const/16 v39, 0x0

    .line 1450
    .line 1451
    const/16 v40, 0x68

    .line 1452
    .line 1453
    const-wide/16 v34, -0x1f4

    .line 1454
    .line 1455
    const/16 v37, 0x0

    .line 1456
    .line 1457
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1458
    .line 1459
    .line 1460
    move-object/from16 v5, v33

    .line 1461
    .line 1462
    invoke-virtual {v15, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1463
    .line 1464
    .line 1465
    :goto_d
    invoke-static {v15}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v5

    .line 1469
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v21

    .line 1473
    new-instance v20, La/fyl;

    .line 1474
    .line 1475
    const/16 v25, 0x0

    .line 1476
    .line 1477
    const/16 v26, 0x12

    .line 1478
    .line 1479
    const/16 v22, 0x0

    .line 1480
    .line 1481
    invoke-direct/range {v20 .. v26}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 1482
    .line 1483
    .line 1484
    move-object/from16 v5, v20

    .line 1485
    .line 1486
    new-instance v11, La/inh0;

    .line 1487
    .line 1488
    invoke-direct {v11, v10, v5, v9}, La/inh0;-><init>(Ljava/lang/String;La/fyl;La/s3q;)V

    .line 1489
    .line 1490
    .line 1491
    :goto_e
    new-instance v5, Ljava/util/ArrayList;

    .line 1492
    .line 1493
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1494
    .line 1495
    .line 1496
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v9

    .line 1500
    :cond_15
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v10

    .line 1504
    if-eqz v10, :cond_16

    .line 1505
    .line 1506
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v10

    .line 1510
    move-object v12, v10

    .line 1511
    check-cast v12, La/h0w;

    .line 1512
    .line 1513
    iget-boolean v12, v12, La/h0w;->b:Z

    .line 1514
    .line 1515
    if-eqz v12, :cond_15

    .line 1516
    .line 1517
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1518
    .line 1519
    .line 1520
    goto :goto_f

    .line 1521
    :cond_16
    new-instance v9, Ljava/util/ArrayList;

    .line 1522
    .line 1523
    const/16 v10, 0xa

    .line 1524
    .line 1525
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1526
    .line 1527
    .line 1528
    move-result v12

    .line 1529
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v10

    .line 1536
    :goto_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1537
    .line 1538
    .line 1539
    move-result v12

    .line 1540
    if-eqz v12, :cond_17

    .line 1541
    .line 1542
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v12

    .line 1546
    check-cast v12, La/h0w;

    .line 1547
    .line 1548
    invoke-static {v12}, La/xnm0;->k(La/h0w;)I

    .line 1549
    .line 1550
    .line 1551
    move-result v12

    .line 1552
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v12

    .line 1556
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1557
    .line 1558
    .line 1559
    goto :goto_10

    .line 1560
    :cond_17
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v9

    .line 1564
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1565
    .line 1566
    .line 1567
    move-result v5

    .line 1568
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1569
    .line 1570
    .line 1571
    move-result v10

    .line 1572
    if-ne v5, v10, :cond_18

    .line 1573
    .line 1574
    const/4 v5, 0x1

    .line 1575
    goto :goto_11

    .line 1576
    :cond_18
    const/4 v5, 0x0

    .line 1577
    :goto_11
    sget-object v10, La/s3q;->b:La/s3q;

    .line 1578
    .line 1579
    const/4 v12, 0x0

    .line 1580
    new-array v13, v12, [Ljava/lang/Object;

    .line 1581
    .line 1582
    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v13

    .line 1586
    const v12, 0x7f1309cf

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v0, v12, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v12

    .line 1593
    sget-object v22, La/tyl;->c:La/tyl;

    .line 1594
    .line 1595
    sget-object v23, La/syl;->b:La/syl;

    .line 1596
    .line 1597
    sget-object v13, La/hh80;->a:La/gh80;

    .line 1598
    .line 1599
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1600
    .line 1601
    .line 1602
    sget-object v24, La/gh80;->b:La/fh80;

    .line 1603
    .line 1604
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v13

    .line 1608
    new-instance v33, La/lxl;

    .line 1609
    .line 1610
    sget-object v15, La/j3q;->b:[La/j3q;

    .line 1611
    .line 1612
    new-instance v15, La/xxl;

    .line 1613
    .line 1614
    move/from16 p0, v5

    .line 1615
    .line 1616
    move-object/from16 v27, v14

    .line 1617
    .line 1618
    const/4 v14, 0x0

    .line 1619
    new-array v5, v14, [Ljava/lang/Object;

    .line 1620
    .line 1621
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v5

    .line 1625
    const v14, 0x7f1300e4

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v0, v14, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v5

    .line 1632
    invoke-direct {v15, v5}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1633
    .line 1634
    .line 1635
    if-eqz p0, :cond_19

    .line 1636
    .line 1637
    sget-object v5, La/uxl;->b:La/uxl;

    .line 1638
    .line 1639
    :goto_12
    move-object/from16 v38, v5

    .line 1640
    .line 1641
    goto :goto_13

    .line 1642
    :cond_19
    sget-object v5, La/uxl;->a:La/uxl;

    .line 1643
    .line 1644
    goto :goto_12

    .line 1645
    :goto_13
    const/16 v39, 0x0

    .line 1646
    .line 1647
    const/16 v40, 0x68

    .line 1648
    .line 1649
    const-wide/16 v34, -0x64

    .line 1650
    .line 1651
    const/16 v37, 0x0

    .line 1652
    .line 1653
    move-object/from16 v36, v15

    .line 1654
    .line 1655
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1656
    .line 1657
    .line 1658
    move-object/from16 v5, v33

    .line 1659
    .line 1660
    invoke-virtual {v13, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1661
    .line 1662
    .line 1663
    new-instance v5, Ljava/util/ArrayList;

    .line 1664
    .line 1665
    const/16 v15, 0xa

    .line 1666
    .line 1667
    invoke-static {v6, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1668
    .line 1669
    .line 1670
    move-result v14

    .line 1671
    invoke-direct {v5, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1672
    .line 1673
    .line 1674
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v14

    .line 1678
    const/4 v15, 0x0

    .line 1679
    :goto_14
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1680
    .line 1681
    .line 1682
    move-result v16

    .line 1683
    if-eqz v16, :cond_1c

    .line 1684
    .line 1685
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v16

    .line 1689
    add-int/lit8 v20, v15, 0x1

    .line 1690
    .line 1691
    if-ltz v15, :cond_1b

    .line 1692
    .line 1693
    move-object/from16 v15, v16

    .line 1694
    .line 1695
    check-cast v15, La/h0w;

    .line 1696
    .line 1697
    new-instance v33, La/lxl;

    .line 1698
    .line 1699
    move-object/from16 v16, v14

    .line 1700
    .line 1701
    invoke-static {v15}, La/xnm0;->k(La/h0w;)I

    .line 1702
    .line 1703
    .line 1704
    move-result v14

    .line 1705
    move-object/from16 v28, v6

    .line 1706
    .line 1707
    move-object/from16 v29, v7

    .line 1708
    .line 1709
    int-to-long v6, v14

    .line 1710
    new-instance v14, La/xxl;

    .line 1711
    .line 1712
    move-wide/from16 v34, v6

    .line 1713
    .line 1714
    iget-object v6, v15, La/h0w;->a:La/jvw;

    .line 1715
    .line 1716
    invoke-static {v6}, La/lmc;->b0(La/jvw;)I

    .line 1717
    .line 1718
    .line 1719
    move-result v6

    .line 1720
    move-object/from16 v21, v15

    .line 1721
    .line 1722
    const/4 v7, 0x0

    .line 1723
    new-array v15, v7, [Ljava/lang/Object;

    .line 1724
    .line 1725
    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v15

    .line 1729
    invoke-virtual {v0, v6, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v6

    .line 1733
    invoke-direct {v14, v6}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1734
    .line 1735
    .line 1736
    if-nez p0, :cond_1a

    .line 1737
    .line 1738
    invoke-static/range {v21 .. v21}, La/xnm0;->k(La/h0w;)I

    .line 1739
    .line 1740
    .line 1741
    move-result v6

    .line 1742
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v6

    .line 1746
    invoke-interface {v9, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v6

    .line 1750
    if-eqz v6, :cond_1a

    .line 1751
    .line 1752
    sget-object v6, La/uxl;->b:La/uxl;

    .line 1753
    .line 1754
    :goto_15
    move-object/from16 v38, v6

    .line 1755
    .line 1756
    goto :goto_16

    .line 1757
    :cond_1a
    sget-object v6, La/uxl;->a:La/uxl;

    .line 1758
    .line 1759
    goto :goto_15

    .line 1760
    :goto_16
    const/16 v39, 0x0

    .line 1761
    .line 1762
    const/16 v40, 0x68

    .line 1763
    .line 1764
    const/16 v37, 0x0

    .line 1765
    .line 1766
    move-object/from16 v36, v14

    .line 1767
    .line 1768
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1769
    .line 1770
    .line 1771
    move-object/from16 v6, v33

    .line 1772
    .line 1773
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    move-object/from16 v14, v16

    .line 1777
    .line 1778
    move/from16 v15, v20

    .line 1779
    .line 1780
    move-object/from16 v6, v28

    .line 1781
    .line 1782
    move-object/from16 v7, v29

    .line 1783
    .line 1784
    goto :goto_14

    .line 1785
    :cond_1b
    invoke-static {}, La/q3d;->p()V

    .line 1786
    .line 1787
    .line 1788
    throw v27

    .line 1789
    :cond_1c
    move-object/from16 v28, v6

    .line 1790
    .line 1791
    move-object/from16 v29, v7

    .line 1792
    .line 1793
    invoke-static {v13, v13, v5}, La/cs0;->f(La/lc00;La/lc00;Ljava/util/ArrayList;)La/a4x;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v21

    .line 1797
    new-instance v20, La/fyl;

    .line 1798
    .line 1799
    const/16 v25, 0x0

    .line 1800
    .line 1801
    const/16 v26, 0x10

    .line 1802
    .line 1803
    invoke-direct/range {v20 .. v26}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 1804
    .line 1805
    .line 1806
    move-object/from16 v5, v20

    .line 1807
    .line 1808
    new-instance v6, La/inh0;

    .line 1809
    .line 1810
    invoke-direct {v6, v12, v5, v10}, La/inh0;-><init>(Ljava/lang/String;La/fyl;La/s3q;)V

    .line 1811
    .line 1812
    .line 1813
    new-instance v5, Ljava/util/ArrayList;

    .line 1814
    .line 1815
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1816
    .line 1817
    .line 1818
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v7

    .line 1822
    :cond_1d
    :goto_17
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1823
    .line 1824
    .line 1825
    move-result v9

    .line 1826
    if-eqz v9, :cond_1e

    .line 1827
    .line 1828
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v9

    .line 1832
    move-object v10, v9

    .line 1833
    check-cast v10, La/un7;

    .line 1834
    .line 1835
    iget-boolean v10, v10, La/un7;->b:Z

    .line 1836
    .line 1837
    if-eqz v10, :cond_1d

    .line 1838
    .line 1839
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1840
    .line 1841
    .line 1842
    goto :goto_17

    .line 1843
    :cond_1e
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1844
    .line 1845
    .line 1846
    move-result v7

    .line 1847
    if-eqz v7, :cond_1f

    .line 1848
    .line 1849
    move-object/from16 v30, v3

    .line 1850
    .line 1851
    move-object/from16 v5, v27

    .line 1852
    .line 1853
    goto/16 :goto_1f

    .line 1854
    .line 1855
    :cond_1f
    new-instance v7, Ljava/util/ArrayList;

    .line 1856
    .line 1857
    const/16 v15, 0xa

    .line 1858
    .line 1859
    invoke-static {v5, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1860
    .line 1861
    .line 1862
    move-result v9

    .line 1863
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1864
    .line 1865
    .line 1866
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v9

    .line 1870
    :goto_18
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1871
    .line 1872
    .line 1873
    move-result v10

    .line 1874
    if-eqz v10, :cond_20

    .line 1875
    .line 1876
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v10

    .line 1880
    check-cast v10, La/un7;

    .line 1881
    .line 1882
    iget-object v10, v10, La/un7;->a:La/q4f;

    .line 1883
    .line 1884
    invoke-virtual {v10}, La/q4f;->a()I

    .line 1885
    .line 1886
    .line 1887
    move-result v10

    .line 1888
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v10

    .line 1892
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1893
    .line 1894
    .line 1895
    goto :goto_18

    .line 1896
    :cond_20
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v7

    .line 1900
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1901
    .line 1902
    .line 1903
    move-result v5

    .line 1904
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1905
    .line 1906
    .line 1907
    move-result v9

    .line 1908
    if-ne v5, v9, :cond_21

    .line 1909
    .line 1910
    const/4 v5, 0x1

    .line 1911
    goto :goto_19

    .line 1912
    :cond_21
    const/4 v5, 0x0

    .line 1913
    :goto_19
    sget-object v9, La/s3q;->c:La/s3q;

    .line 1914
    .line 1915
    const/4 v14, 0x0

    .line 1916
    new-array v10, v14, [Ljava/lang/Object;

    .line 1917
    .line 1918
    invoke-static {v10, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v10

    .line 1922
    const v12, 0x7f1309d0

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v0, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v10

    .line 1929
    sget-object v23, La/syl;->b:La/syl;

    .line 1930
    .line 1931
    sget-object v12, La/hh80;->a:La/gh80;

    .line 1932
    .line 1933
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1934
    .line 1935
    .line 1936
    sget-object v24, La/gh80;->b:La/fh80;

    .line 1937
    .line 1938
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v12

    .line 1942
    new-instance v33, La/lxl;

    .line 1943
    .line 1944
    sget-object v13, La/j3q;->b:[La/j3q;

    .line 1945
    .line 1946
    new-instance v13, La/xxl;

    .line 1947
    .line 1948
    new-array v15, v14, [Ljava/lang/Object;

    .line 1949
    .line 1950
    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v15

    .line 1954
    const v14, 0x7f1300e4

    .line 1955
    .line 1956
    .line 1957
    invoke-virtual {v0, v14, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v14

    .line 1961
    invoke-direct {v13, v14}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 1962
    .line 1963
    .line 1964
    if-eqz v5, :cond_22

    .line 1965
    .line 1966
    sget-object v14, La/uxl;->b:La/uxl;

    .line 1967
    .line 1968
    :goto_1a
    move-object/from16 v38, v14

    .line 1969
    .line 1970
    goto :goto_1b

    .line 1971
    :cond_22
    sget-object v14, La/uxl;->a:La/uxl;

    .line 1972
    .line 1973
    goto :goto_1a

    .line 1974
    :goto_1b
    const/16 v39, 0x0

    .line 1975
    .line 1976
    const/16 v40, 0x68

    .line 1977
    .line 1978
    const-wide/16 v34, -0xc8

    .line 1979
    .line 1980
    const/16 v37, 0x0

    .line 1981
    .line 1982
    move-object/from16 v36, v13

    .line 1983
    .line 1984
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 1985
    .line 1986
    .line 1987
    move-object/from16 v13, v33

    .line 1988
    .line 1989
    invoke-virtual {v12, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1990
    .line 1991
    .line 1992
    new-instance v13, Ljava/util/ArrayList;

    .line 1993
    .line 1994
    const/16 v15, 0xa

    .line 1995
    .line 1996
    invoke-static {v3, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1997
    .line 1998
    .line 1999
    move-result v14

    .line 2000
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 2001
    .line 2002
    .line 2003
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v14

    .line 2007
    const/4 v15, 0x0

    .line 2008
    :goto_1c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 2009
    .line 2010
    .line 2011
    move-result v16

    .line 2012
    if-eqz v16, :cond_25

    .line 2013
    .line 2014
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v16

    .line 2018
    add-int/lit8 v18, v15, 0x1

    .line 2019
    .line 2020
    if-ltz v15, :cond_24

    .line 2021
    .line 2022
    move-object/from16 v15, v16

    .line 2023
    .line 2024
    check-cast v15, La/un7;

    .line 2025
    .line 2026
    new-instance v33, La/lxl;

    .line 2027
    .line 2028
    iget-object v15, v15, La/un7;->a:La/q4f;

    .line 2029
    .line 2030
    move/from16 p0, v5

    .line 2031
    .line 2032
    invoke-virtual {v15}, La/q4f;->a()I

    .line 2033
    .line 2034
    .line 2035
    move-result v5

    .line 2036
    move-object/from16 p1, v14

    .line 2037
    .line 2038
    move-object/from16 v16, v15

    .line 2039
    .line 2040
    int-to-long v14, v5

    .line 2041
    new-instance v5, La/xxl;

    .line 2042
    .line 2043
    move-wide/from16 v34, v14

    .line 2044
    .line 2045
    invoke-static/range {v16 .. v16}, La/lgb;->V(La/q4f;)I

    .line 2046
    .line 2047
    .line 2048
    move-result v14

    .line 2049
    move-object/from16 v30, v3

    .line 2050
    .line 2051
    const/4 v15, 0x0

    .line 2052
    new-array v3, v15, [Ljava/lang/Object;

    .line 2053
    .line 2054
    invoke-static {v3, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v3

    .line 2058
    invoke-virtual {v0, v14, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v3

    .line 2062
    invoke-direct {v5, v3}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 2063
    .line 2064
    .line 2065
    if-nez p0, :cond_23

    .line 2066
    .line 2067
    invoke-virtual/range {v16 .. v16}, La/q4f;->a()I

    .line 2068
    .line 2069
    .line 2070
    move-result v3

    .line 2071
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v3

    .line 2075
    invoke-interface {v7, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2076
    .line 2077
    .line 2078
    move-result v3

    .line 2079
    if-eqz v3, :cond_23

    .line 2080
    .line 2081
    sget-object v3, La/uxl;->b:La/uxl;

    .line 2082
    .line 2083
    :goto_1d
    move-object/from16 v38, v3

    .line 2084
    .line 2085
    goto :goto_1e

    .line 2086
    :cond_23
    sget-object v3, La/uxl;->a:La/uxl;

    .line 2087
    .line 2088
    goto :goto_1d

    .line 2089
    :goto_1e
    const/16 v39, 0x0

    .line 2090
    .line 2091
    const/16 v40, 0x68

    .line 2092
    .line 2093
    const/16 v37, 0x0

    .line 2094
    .line 2095
    move-object/from16 v36, v5

    .line 2096
    .line 2097
    invoke-direct/range {v33 .. v40}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 2098
    .line 2099
    .line 2100
    move-object/from16 v3, v33

    .line 2101
    .line 2102
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2103
    .line 2104
    .line 2105
    move/from16 v5, p0

    .line 2106
    .line 2107
    move-object/from16 v14, p1

    .line 2108
    .line 2109
    move/from16 v15, v18

    .line 2110
    .line 2111
    move-object/from16 v3, v30

    .line 2112
    .line 2113
    goto :goto_1c

    .line 2114
    :cond_24
    invoke-static {}, La/q3d;->p()V

    .line 2115
    .line 2116
    .line 2117
    throw v27

    .line 2118
    :cond_25
    move-object/from16 v30, v3

    .line 2119
    .line 2120
    invoke-static {v12, v12, v13}, La/cs0;->f(La/lc00;La/lc00;Ljava/util/ArrayList;)La/a4x;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v21

    .line 2124
    new-instance v20, La/fyl;

    .line 2125
    .line 2126
    const/16 v25, 0x0

    .line 2127
    .line 2128
    const/16 v26, 0x12

    .line 2129
    .line 2130
    const/16 v22, 0x0

    .line 2131
    .line 2132
    invoke-direct/range {v20 .. v26}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 2133
    .line 2134
    .line 2135
    move-object/from16 v3, v20

    .line 2136
    .line 2137
    new-instance v5, La/inh0;

    .line 2138
    .line 2139
    invoke-direct {v5, v10, v3, v9}, La/inh0;-><init>(Ljava/lang/String;La/fyl;La/s3q;)V

    .line 2140
    .line 2141
    .line 2142
    :goto_1f
    filled-new-array {v11, v6, v5}, [La/inh0;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v3

    .line 2146
    invoke-static {v3}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v3

    .line 2150
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v20

    .line 2154
    iget-object v3, v1, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 2155
    .line 2156
    iget-boolean v5, v1, La/c52;->h:Z

    .line 2157
    .line 2158
    sget-object v6, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 2159
    .line 2160
    if-eq v3, v6, :cond_26

    .line 2161
    .line 2162
    :goto_20
    move-object/from16 v23, v27

    .line 2163
    .line 2164
    goto :goto_21

    .line 2165
    :cond_26
    if-nez v5, :cond_27

    .line 2166
    .line 2167
    goto :goto_20

    .line 2168
    :cond_27
    new-instance v9, La/wul;

    .line 2169
    .line 2170
    sget-object v10, La/nul;->e:La/nul;

    .line 2171
    .line 2172
    sget-object v11, La/oe9;->a:La/oe9;

    .line 2173
    .line 2174
    new-instance v12, La/ue9;

    .line 2175
    .line 2176
    const/4 v14, 0x0

    .line 2177
    new-array v3, v14, [Ljava/lang/Object;

    .line 2178
    .line 2179
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v3

    .line 2183
    const v5, 0x7f13115e

    .line 2184
    .line 2185
    .line 2186
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v3

    .line 2190
    invoke-direct {v12, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2191
    .line 2192
    .line 2193
    const/4 v14, 0x0

    .line 2194
    const/4 v15, 0x0

    .line 2195
    const/4 v13, 0x1

    .line 2196
    invoke-direct/range {v9 .. v15}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 2197
    .line 2198
    .line 2199
    move-object/from16 v23, v9

    .line 2200
    .line 2201
    :goto_21
    new-instance v21, La/wul;

    .line 2202
    .line 2203
    sget-object v10, La/nul;->e:La/nul;

    .line 2204
    .line 2205
    sget-object v35, La/oe9;->a:La/oe9;

    .line 2206
    .line 2207
    new-instance v12, La/ue9;

    .line 2208
    .line 2209
    const/4 v14, 0x0

    .line 2210
    new-array v3, v14, [Ljava/lang/Object;

    .line 2211
    .line 2212
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v3

    .line 2216
    const v5, 0x7f131164

    .line 2217
    .line 2218
    .line 2219
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v3

    .line 2223
    invoke-direct {v12, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2224
    .line 2225
    .line 2226
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2227
    .line 2228
    .line 2229
    move-result v2

    .line 2230
    if-eqz v2, :cond_29

    .line 2231
    .line 2232
    move-object/from16 v2, v30

    .line 2233
    .line 2234
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2235
    .line 2236
    .line 2237
    move-result v2

    .line 2238
    if-eqz v2, :cond_29

    .line 2239
    .line 2240
    move-object/from16 v2, v28

    .line 2241
    .line 2242
    move-object/from16 v3, v29

    .line 2243
    .line 2244
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2245
    .line 2246
    .line 2247
    move-result v2

    .line 2248
    if-nez v2, :cond_28

    .line 2249
    .line 2250
    goto :goto_22

    .line 2251
    :cond_28
    const/4 v13, 0x0

    .line 2252
    goto :goto_23

    .line 2253
    :cond_29
    :goto_22
    const/4 v13, 0x1

    .line 2254
    :goto_23
    const/4 v14, 0x0

    .line 2255
    const/4 v15, 0x0

    .line 2256
    move-object/from16 v9, v21

    .line 2257
    .line 2258
    move-object/from16 v11, v35

    .line 2259
    .line 2260
    invoke-direct/range {v9 .. v15}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 2261
    .line 2262
    .line 2263
    new-instance v33, La/wul;

    .line 2264
    .line 2265
    sget-object v34, La/lul;->e:La/lul;

    .line 2266
    .line 2267
    new-instance v2, La/ue9;

    .line 2268
    .line 2269
    const/4 v14, 0x0

    .line 2270
    new-array v3, v14, [Ljava/lang/Object;

    .line 2271
    .line 2272
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v3

    .line 2276
    const v4, 0x7f13014b

    .line 2277
    .line 2278
    .line 2279
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v0

    .line 2283
    invoke-direct {v2, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2284
    .line 2285
    .line 2286
    const/16 v38, 0x0

    .line 2287
    .line 2288
    const/16 v39, 0x0

    .line 2289
    .line 2290
    const/16 v37, 0x1

    .line 2291
    .line 2292
    move-object/from16 v36, v2

    .line 2293
    .line 2294
    invoke-direct/range {v33 .. v39}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 2295
    .line 2296
    .line 2297
    iget-boolean v0, v1, La/c52;->g:Z

    .line 2298
    .line 2299
    new-instance v18, La/d52;

    .line 2300
    .line 2301
    move/from16 v24, v0

    .line 2302
    .line 2303
    move-object/from16 v22, v33

    .line 2304
    .line 2305
    invoke-direct/range {v18 .. v24}, La/d52;-><init>(Ljava/lang/String;La/a4x;La/wul;La/wul;La/wul;Z)V

    .line 2306
    .line 2307
    .line 2308
    return-object v18

    .line 2309
    :pswitch_12
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 2310
    .line 2311
    check-cast v9, La/inh0;

    .line 2312
    .line 2313
    move-object/from16 v1, p1

    .line 2314
    .line 2315
    check-cast v1, Ljava/lang/Long;

    .line 2316
    .line 2317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2318
    .line 2319
    .line 2320
    sget-object v2, La/t42;->p2:La/jdk0;

    .line 2321
    .line 2322
    iget-object v2, v9, La/inh0;->c:La/s3q;

    .line 2323
    .line 2324
    invoke-interface {v0, v2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2325
    .line 2326
    .line 2327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2328
    .line 2329
    return-object v0

    .line 2330
    :pswitch_13
    check-cast v0, La/clz;

    .line 2331
    .line 2332
    check-cast v9, La/ax0;

    .line 2333
    .line 2334
    move-object/from16 v1, p1

    .line 2335
    .line 2336
    check-cast v1, La/lwk;

    .line 2337
    .line 2338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2339
    .line 2340
    .line 2341
    new-instance v1, La/g02;

    .line 2342
    .line 2343
    const/4 v14, 0x0

    .line 2344
    invoke-direct {v1, v9, v14}, La/g02;-><init>(Ljava/lang/Object;B)V

    .line 2345
    .line 2346
    .line 2347
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v2

    .line 2351
    invoke-virtual {v2, v1}, La/glz;->a(La/blz;)V

    .line 2352
    .line 2353
    .line 2354
    new-instance v2, La/pr0;

    .line 2355
    .line 2356
    const/4 v3, 0x1

    .line 2357
    invoke-direct {v2, v0, v1, v3}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2358
    .line 2359
    .line 2360
    return-object v2

    .line 2361
    :pswitch_14
    check-cast v0, La/abs0;

    .line 2362
    .line 2363
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 2364
    .line 2365
    move-object/from16 v1, p1

    .line 2366
    .line 2367
    check-cast v1, La/hcz;

    .line 2368
    .line 2369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2370
    .line 2371
    .line 2372
    iget-object v0, v0, La/abs0;->a:La/i4;

    .line 2373
    .line 2374
    new-instance v2, La/dj1;

    .line 2375
    .line 2376
    invoke-direct {v2, v4}, La/dj1;-><init>(B)V

    .line 2377
    .line 2378
    .line 2379
    invoke-static {v0, v2}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v2

    .line 2383
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2384
    .line 2385
    .line 2386
    move-result v4

    .line 2387
    new-instance v5, La/b8;

    .line 2388
    .line 2389
    const/16 v6, 0x12

    .line 2390
    .line 2391
    invoke-direct {v5, v2, v6}, La/b8;-><init>(Ljava/util/List;B)V

    .line 2392
    .line 2393
    .line 2394
    new-instance v2, La/b8;

    .line 2395
    .line 2396
    invoke-direct {v2, v0, v3}, La/b8;-><init>(Ljava/util/List;B)V

    .line 2397
    .line 2398
    .line 2399
    new-instance v3, La/vb;

    .line 2400
    .line 2401
    invoke-direct {v3, v0, v9, v11}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 2402
    .line 2403
    .line 2404
    new-instance v0, La/ugd;

    .line 2405
    .line 2406
    const v6, -0x4e295cff

    .line 2407
    .line 2408
    .line 2409
    const/4 v7, 0x1

    .line 2410
    invoke-direct {v0, v6, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2411
    .line 2412
    .line 2413
    invoke-virtual {v1, v4, v5, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2414
    .line 2415
    .line 2416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2417
    .line 2418
    return-object v0

    .line 2419
    :pswitch_15
    check-cast v0, La/ctf0;

    .line 2420
    .line 2421
    check-cast v9, La/wiu;

    .line 2422
    .line 2423
    move-object/from16 v1, p1

    .line 2424
    .line 2425
    check-cast v1, La/yu1;

    .line 2426
    .line 2427
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2428
    .line 2429
    .line 2430
    new-instance v2, La/gv1;

    .line 2431
    .line 2432
    invoke-virtual {v9}, La/wiu;->a()Ljava/util/Locale;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v3

    .line 2436
    invoke-direct {v2, v1, v0, v3}, La/gv1;-><init>(La/yu1;La/ctf0;Ljava/util/Locale;)V

    .line 2437
    .line 2438
    .line 2439
    return-object v2

    .line 2440
    :pswitch_16
    move-object/from16 v27, v14

    .line 2441
    .line 2442
    check-cast v0, La/yu1;

    .line 2443
    .line 2444
    check-cast v9, La/gv1;

    .line 2445
    .line 2446
    move-object/from16 v1, p1

    .line 2447
    .line 2448
    check-cast v1, La/gu1;

    .line 2449
    .line 2450
    iget-object v0, v0, La/yu1;->b:Ljava/lang/String;

    .line 2451
    .line 2452
    iget-object v3, v9, La/gv1;->c:La/n0o0;

    .line 2453
    .line 2454
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2455
    .line 2456
    .line 2457
    move-result-object v3

    .line 2458
    check-cast v3, La/fee;

    .line 2459
    .line 2460
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v3

    .line 2464
    check-cast v3, La/bv1;

    .line 2465
    .line 2466
    iget-object v4, v9, La/gv1;->d:La/n0o0;

    .line 2467
    .line 2468
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2469
    .line 2470
    .line 2471
    move-result-object v4

    .line 2472
    check-cast v4, La/fee;

    .line 2473
    .line 2474
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v4

    .line 2478
    check-cast v4, La/qu1;

    .line 2479
    .line 2480
    iget-object v5, v9, La/gv1;->b:La/ctf0;

    .line 2481
    .line 2482
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2483
    .line 2484
    .line 2485
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2486
    .line 2487
    .line 2488
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2489
    .line 2490
    .line 2491
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 2492
    .line 2493
    .line 2494
    move-result v4

    .line 2495
    if-eqz v4, :cond_2d

    .line 2496
    .line 2497
    const/4 v7, 0x1

    .line 2498
    if-eq v4, v7, :cond_2c

    .line 2499
    .line 2500
    const/4 v11, 0x2

    .line 2501
    if-eq v4, v11, :cond_2b

    .line 2502
    .line 2503
    const/4 v6, 0x3

    .line 2504
    if-ne v4, v6, :cond_2a

    .line 2505
    .line 2506
    sget-object v4, La/du1;->d:La/du1;

    .line 2507
    .line 2508
    :goto_24
    move-object v7, v4

    .line 2509
    goto :goto_26

    .line 2510
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 2511
    .line 2512
    .line 2513
    :goto_25
    move-object/from16 v14, v27

    .line 2514
    .line 2515
    goto/16 :goto_3b

    .line 2516
    .line 2517
    :cond_2b
    sget-object v4, La/du1;->c:La/du1;

    .line 2518
    .line 2519
    goto :goto_24

    .line 2520
    :cond_2c
    sget-object v4, La/du1;->b:La/du1;

    .line 2521
    .line 2522
    goto :goto_24

    .line 2523
    :cond_2d
    sget-object v4, La/du1;->a:La/du1;

    .line 2524
    .line 2525
    goto :goto_24

    .line 2526
    :goto_26
    if-eqz v1, :cond_2e

    .line 2527
    .line 2528
    iget-object v1, v1, La/gu1;->e:La/j88;

    .line 2529
    .line 2530
    goto :goto_27

    .line 2531
    :cond_2e
    move-object/from16 v1, v27

    .line 2532
    .line 2533
    :goto_27
    if-eqz v1, :cond_31

    .line 2534
    .line 2535
    iget-object v4, v1, La/j88;->k:Ljava/lang/String;

    .line 2536
    .line 2537
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2538
    .line 2539
    .line 2540
    move-result v6

    .line 2541
    if-lez v6, :cond_2f

    .line 2542
    .line 2543
    goto :goto_28

    .line 2544
    :cond_2f
    move-object/from16 v4, v27

    .line 2545
    .line 2546
    :goto_28
    if-nez v4, :cond_30

    .line 2547
    .line 2548
    goto :goto_29

    .line 2549
    :cond_30
    move-object v8, v4

    .line 2550
    goto :goto_2a

    .line 2551
    :cond_31
    :goto_29
    move-object v8, v0

    .line 2552
    :goto_2a
    if-eqz v1, :cond_32

    .line 2553
    .line 2554
    iget-object v0, v1, La/j88;->f:Ljava/lang/String;

    .line 2555
    .line 2556
    goto :goto_2b

    .line 2557
    :cond_32
    move-object/from16 v0, v27

    .line 2558
    .line 2559
    :goto_2b
    if-nez v0, :cond_33

    .line 2560
    .line 2561
    move-object v9, v2

    .line 2562
    goto :goto_2c

    .line 2563
    :cond_33
    move-object v9, v0

    .line 2564
    :goto_2c
    if-eqz v1, :cond_34

    .line 2565
    .line 2566
    iget-object v0, v1, La/j88;->j:La/t7s0;

    .line 2567
    .line 2568
    goto :goto_2d

    .line 2569
    :cond_34
    move-object/from16 v0, v27

    .line 2570
    .line 2571
    :goto_2d
    if-eqz v1, :cond_36

    .line 2572
    .line 2573
    iget-boolean v1, v1, La/j88;->b:Z

    .line 2574
    .line 2575
    const/4 v2, 0x1

    .line 2576
    if-ne v1, v2, :cond_35

    .line 2577
    .line 2578
    move v1, v2

    .line 2579
    goto :goto_2f

    .line 2580
    :cond_35
    :goto_2e
    const/4 v1, 0x0

    .line 2581
    goto :goto_2f

    .line 2582
    :cond_36
    const/4 v2, 0x1

    .line 2583
    goto :goto_2e

    .line 2584
    :goto_2f
    if-nez v0, :cond_37

    .line 2585
    .line 2586
    sget-object v0, La/lak0;->c:La/lak0;

    .line 2587
    .line 2588
    :goto_30
    move-object v10, v0

    .line 2589
    goto/16 :goto_35

    .line 2590
    .line 2591
    :cond_37
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2592
    .line 2593
    .line 2594
    move-result-object v4

    .line 2595
    new-instance v6, La/eu1;

    .line 2596
    .line 2597
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2598
    .line 2599
    .line 2600
    move-result v10

    .line 2601
    if-eqz v10, :cond_3a

    .line 2602
    .line 2603
    if-eq v10, v2, :cond_39

    .line 2604
    .line 2605
    const/4 v11, 0x2

    .line 2606
    if-ne v10, v11, :cond_38

    .line 2607
    .line 2608
    const v2, 0x7f131656

    .line 2609
    .line 2610
    .line 2611
    :goto_31
    const/4 v14, 0x0

    .line 2612
    goto :goto_32

    .line 2613
    :cond_38
    invoke-static {}, La/t9f;->b()V

    .line 2614
    .line 2615
    .line 2616
    goto :goto_25

    .line 2617
    :cond_39
    const v2, 0x7f131655

    .line 2618
    .line 2619
    .line 2620
    goto :goto_31

    .line 2621
    :cond_3a
    const v2, 0x7f131657

    .line 2622
    .line 2623
    .line 2624
    goto :goto_31

    .line 2625
    :goto_32
    new-array v10, v14, [Ljava/lang/Object;

    .line 2626
    .line 2627
    iget-object v11, v5, La/ctf0;->b:La/lsm0;

    .line 2628
    .line 2629
    invoke-static {v10, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v10

    .line 2633
    invoke-virtual {v11, v2, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2634
    .line 2635
    .line 2636
    move-result-object v2

    .line 2637
    sget-object v10, La/du1;->b:La/du1;

    .line 2638
    .line 2639
    sget-object v12, La/kso0;->a:La/kso0;

    .line 2640
    .line 2641
    if-ne v7, v10, :cond_3b

    .line 2642
    .line 2643
    move-object v0, v12

    .line 2644
    goto :goto_33

    .line 2645
    :cond_3b
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2646
    .line 2647
    .line 2648
    move-result v0

    .line 2649
    if-eqz v0, :cond_3e

    .line 2650
    .line 2651
    const/4 v13, 0x1

    .line 2652
    if-eq v0, v13, :cond_3d

    .line 2653
    .line 2654
    const/4 v13, 0x2

    .line 2655
    if-ne v0, v13, :cond_3c

    .line 2656
    .line 2657
    sget-object v0, La/xpo0;->a:La/xpo0;

    .line 2658
    .line 2659
    goto :goto_33

    .line 2660
    :cond_3c
    invoke-static {}, La/t9f;->b()V

    .line 2661
    .line 2662
    .line 2663
    goto/16 :goto_25

    .line 2664
    .line 2665
    :cond_3d
    sget-object v0, La/bqo0;->a:La/bqo0;

    .line 2666
    .line 2667
    goto :goto_33

    .line 2668
    :cond_3e
    sget-object v0, La/nso0;->a:La/nso0;

    .line 2669
    .line 2670
    :goto_33
    invoke-direct {v6, v2, v0}, La/eu1;-><init>(Ljava/lang/String;La/sso0;)V

    .line 2671
    .line 2672
    .line 2673
    invoke-virtual {v4, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2674
    .line 2675
    .line 2676
    if-eqz v1, :cond_40

    .line 2677
    .line 2678
    new-instance v0, La/eu1;

    .line 2679
    .line 2680
    const/4 v14, 0x0

    .line 2681
    new-array v1, v14, [Ljava/lang/Object;

    .line 2682
    .line 2683
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2684
    .line 2685
    .line 2686
    move-result-object v1

    .line 2687
    const v2, 0x7f13165f

    .line 2688
    .line 2689
    .line 2690
    invoke-virtual {v11, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v1

    .line 2694
    if-ne v7, v10, :cond_3f

    .line 2695
    .line 2696
    goto :goto_34

    .line 2697
    :cond_3f
    sget-object v12, La/qro0;->a:La/qro0;

    .line 2698
    .line 2699
    :goto_34
    invoke-direct {v0, v1, v12}, La/eu1;-><init>(Ljava/lang/String;La/sso0;)V

    .line 2700
    .line 2701
    .line 2702
    invoke-virtual {v4, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 2703
    .line 2704
    .line 2705
    :cond_40
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 2706
    .line 2707
    .line 2708
    move-result-object v0

    .line 2709
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2710
    .line 2711
    .line 2712
    move-result-object v0

    .line 2713
    goto :goto_30

    .line 2714
    :goto_35
    new-instance v11, La/ru1;

    .line 2715
    .line 2716
    sget-object v0, La/bv1;->g:La/c0o;

    .line 2717
    .line 2718
    new-instance v1, Ljava/util/ArrayList;

    .line 2719
    .line 2720
    const/16 v15, 0xa

    .line 2721
    .line 2722
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2723
    .line 2724
    .line 2725
    move-result v2

    .line 2726
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2727
    .line 2728
    .line 2729
    invoke-virtual {v0}, La/b3;->iterator()Ljava/util/Iterator;

    .line 2730
    .line 2731
    .line 2732
    move-result-object v0

    .line 2733
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2734
    .line 2735
    .line 2736
    move-result v2

    .line 2737
    if-eqz v2, :cond_41

    .line 2738
    .line 2739
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v2

    .line 2743
    check-cast v2, La/bv1;

    .line 2744
    .line 2745
    new-instance v4, La/yvh0;

    .line 2746
    .line 2747
    iget-object v2, v2, La/bv1;->b:La/s9s0;

    .line 2748
    .line 2749
    invoke-static {v2}, La/e3c;->H(La/s9s0;)I

    .line 2750
    .line 2751
    .line 2752
    move-result v2

    .line 2753
    const/4 v14, 0x0

    .line 2754
    new-array v6, v14, [Ljava/lang/Object;

    .line 2755
    .line 2756
    iget-object v12, v5, La/ctf0;->b:La/lsm0;

    .line 2757
    .line 2758
    invoke-static {v6, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v6

    .line 2762
    invoke-virtual {v12, v2, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v2

    .line 2766
    sget-object v6, La/bwh0;->a:La/bwh0;

    .line 2767
    .line 2768
    invoke-direct {v4, v2, v6}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 2769
    .line 2770
    .line 2771
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2772
    .line 2773
    .line 2774
    goto :goto_36

    .line 2775
    :cond_41
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v0

    .line 2779
    iget-byte v1, v3, La/bv1;->a:B

    .line 2780
    .line 2781
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 2782
    .line 2783
    .line 2784
    move-result v2

    .line 2785
    if-eqz v2, :cond_44

    .line 2786
    .line 2787
    const/4 v3, 0x1

    .line 2788
    if-eq v2, v3, :cond_44

    .line 2789
    .line 2790
    const/4 v13, 0x2

    .line 2791
    if-eq v2, v13, :cond_43

    .line 2792
    .line 2793
    const/4 v6, 0x3

    .line 2794
    if-ne v2, v6, :cond_42

    .line 2795
    .line 2796
    sget-object v2, La/cxh0;->a:La/cxh0;

    .line 2797
    .line 2798
    goto :goto_37

    .line 2799
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 2800
    .line 2801
    .line 2802
    goto/16 :goto_25

    .line 2803
    .line 2804
    :cond_43
    sget-object v2, La/zwh0;->a:La/zwh0;

    .line 2805
    .line 2806
    goto :goto_37

    .line 2807
    :cond_44
    sget-object v2, La/axh0;->a:La/axh0;

    .line 2808
    .line 2809
    :goto_37
    invoke-direct {v11, v1, v0, v2}, La/ru1;-><init>(ILa/a4x;La/dxh0;)V

    .line 2810
    .line 2811
    .line 2812
    sget-object v0, La/bv1;->g:La/c0o;

    .line 2813
    .line 2814
    new-instance v1, Ljava/util/ArrayList;

    .line 2815
    .line 2816
    const/16 v15, 0xa

    .line 2817
    .line 2818
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2819
    .line 2820
    .line 2821
    move-result v2

    .line 2822
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2823
    .line 2824
    .line 2825
    invoke-virtual {v0}, La/b3;->iterator()Ljava/util/Iterator;

    .line 2826
    .line 2827
    .line 2828
    move-result-object v0

    .line 2829
    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2830
    .line 2831
    .line 2832
    move-result v2

    .line 2833
    if-eqz v2, :cond_49

    .line 2834
    .line 2835
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2836
    .line 2837
    .line 2838
    move-result-object v2

    .line 2839
    check-cast v2, La/bv1;

    .line 2840
    .line 2841
    new-instance v33, La/s4i;

    .line 2842
    .line 2843
    iget-object v3, v2, La/bv1;->b:La/s9s0;

    .line 2844
    .line 2845
    invoke-static {v3}, La/e3c;->H(La/s9s0;)I

    .line 2846
    .line 2847
    .line 2848
    move-result v3

    .line 2849
    const/4 v14, 0x0

    .line 2850
    new-array v4, v14, [Ljava/lang/Object;

    .line 2851
    .line 2852
    iget-object v6, v5, La/ctf0;->b:La/lsm0;

    .line 2853
    .line 2854
    invoke-static {v4, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2855
    .line 2856
    .line 2857
    move-result-object v4

    .line 2858
    invoke-virtual {v6, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v34

    .line 2862
    iget-object v2, v2, La/bv1;->b:La/s9s0;

    .line 2863
    .line 2864
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 2865
    .line 2866
    .line 2867
    move-result v2

    .line 2868
    if-eqz v2, :cond_48

    .line 2869
    .line 2870
    const/4 v3, 0x1

    .line 2871
    if-eq v2, v3, :cond_47

    .line 2872
    .line 2873
    const/4 v13, 0x2

    .line 2874
    if-eq v2, v13, :cond_46

    .line 2875
    .line 2876
    const/4 v6, 0x3

    .line 2877
    if-ne v2, v6, :cond_45

    .line 2878
    .line 2879
    const v2, 0x7f080966

    .line 2880
    .line 2881
    .line 2882
    :goto_39
    move/from16 v35, v2

    .line 2883
    .line 2884
    goto :goto_3a

    .line 2885
    :cond_45
    invoke-static {}, La/t9f;->b()V

    .line 2886
    .line 2887
    .line 2888
    goto/16 :goto_25

    .line 2889
    .line 2890
    :cond_46
    const v2, 0x7f0809e5

    .line 2891
    .line 2892
    .line 2893
    goto :goto_39

    .line 2894
    :cond_47
    const v2, 0x7f080801

    .line 2895
    .line 2896
    .line 2897
    goto :goto_39

    .line 2898
    :cond_48
    const v2, 0x7f080a2c

    .line 2899
    .line 2900
    .line 2901
    goto :goto_39

    .line 2902
    :goto_3a
    const/16 v37, 0x0

    .line 2903
    .line 2904
    const/16 v38, 0xc

    .line 2905
    .line 2906
    const/16 v36, 0x0

    .line 2907
    .line 2908
    invoke-direct/range {v33 .. v38}, La/s4i;-><init>(Ljava/lang/String;ILjava/lang/Integer;ZI)V

    .line 2909
    .line 2910
    .line 2911
    move-object/from16 v2, v33

    .line 2912
    .line 2913
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2914
    .line 2915
    .line 2916
    goto :goto_38

    .line 2917
    :cond_49
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v12

    .line 2921
    new-instance v6, La/fu1;

    .line 2922
    .line 2923
    invoke-direct/range {v6 .. v12}, La/fu1;-><init>(La/du1;Ljava/lang/String;Ljava/lang/String;La/a4x;La/ru1;La/a4x;)V

    .line 2924
    .line 2925
    .line 2926
    move-object v14, v6

    .line 2927
    :goto_3b
    return-object v14

    .line 2928
    :pswitch_17
    move-object/from16 v27, v14

    .line 2929
    .line 2930
    check-cast v0, La/zs1;

    .line 2931
    .line 2932
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 2933
    .line 2934
    move-object/from16 v1, p1

    .line 2935
    .line 2936
    check-cast v1, La/hcz;

    .line 2937
    .line 2938
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2939
    .line 2940
    .line 2941
    if-eqz v0, :cond_4b

    .line 2942
    .line 2943
    instance-of v2, v0, La/xs1;

    .line 2944
    .line 2945
    const v4, 0x799532c4

    .line 2946
    .line 2947
    .line 2948
    if-eqz v2, :cond_4a

    .line 2949
    .line 2950
    check-cast v0, La/xs1;

    .line 2951
    .line 2952
    iget-object v0, v0, La/xs1;->a:La/a4x;

    .line 2953
    .line 2954
    new-instance v2, La/xg1;

    .line 2955
    .line 2956
    const/4 v5, 0x7

    .line 2957
    invoke-direct {v2, v5}, La/xg1;-><init>(B)V

    .line 2958
    .line 2959
    .line 2960
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2961
    .line 2962
    .line 2963
    move-result v5

    .line 2964
    new-instance v6, La/g5;

    .line 2965
    .line 2966
    invoke-direct {v6, v2, v0, v3}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2967
    .line 2968
    .line 2969
    new-instance v2, La/wl0;

    .line 2970
    .line 2971
    const/4 v11, 0x2

    .line 2972
    invoke-direct {v2, v0, v11}, La/wl0;-><init>(La/a4x;B)V

    .line 2973
    .line 2974
    .line 2975
    new-instance v3, La/zd1;

    .line 2976
    .line 2977
    const/4 v7, 0x1

    .line 2978
    invoke-direct {v3, v0, v7}, La/zd1;-><init>(La/a4x;B)V

    .line 2979
    .line 2980
    .line 2981
    new-instance v0, La/ugd;

    .line 2982
    .line 2983
    invoke-direct {v0, v4, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2984
    .line 2985
    .line 2986
    invoke-virtual {v1, v5, v6, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2987
    .line 2988
    .line 2989
    goto :goto_3c

    .line 2990
    :cond_4a
    instance-of v2, v0, La/ys1;

    .line 2991
    .line 2992
    if-eqz v2, :cond_4b

    .line 2993
    .line 2994
    check-cast v0, La/ys1;

    .line 2995
    .line 2996
    iget-object v0, v0, La/ys1;->a:La/a4x;

    .line 2997
    .line 2998
    new-instance v2, La/xg1;

    .line 2999
    .line 3000
    invoke-direct {v2, v11}, La/xg1;-><init>(B)V

    .line 3001
    .line 3002
    .line 3003
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 3004
    .line 3005
    .line 3006
    move-result v3

    .line 3007
    new-instance v5, La/g5;

    .line 3008
    .line 3009
    const/16 v6, 0x14

    .line 3010
    .line 3011
    invoke-direct {v5, v2, v0, v6}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3012
    .line 3013
    .line 3014
    new-instance v2, La/wl0;

    .line 3015
    .line 3016
    const/4 v6, 0x3

    .line 3017
    invoke-direct {v2, v0, v6}, La/wl0;-><init>(La/a4x;B)V

    .line 3018
    .line 3019
    .line 3020
    new-instance v6, La/ws1;

    .line 3021
    .line 3022
    const/4 v14, 0x0

    .line 3023
    invoke-direct {v6, v0, v9, v14}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 3024
    .line 3025
    .line 3026
    new-instance v0, La/ugd;

    .line 3027
    .line 3028
    const/4 v7, 0x1

    .line 3029
    invoke-direct {v0, v4, v7, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3030
    .line 3031
    .line 3032
    invoke-virtual {v1, v3, v5, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 3033
    .line 3034
    .line 3035
    :goto_3c
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3036
    .line 3037
    goto :goto_3d

    .line 3038
    :cond_4b
    invoke-static {}, La/t9f;->b()V

    .line 3039
    .line 3040
    .line 3041
    move-object/from16 v14, v27

    .line 3042
    .line 3043
    :goto_3d
    return-object v14

    .line 3044
    :pswitch_18
    check-cast v0, La/gr00;

    .line 3045
    .line 3046
    check-cast v9, La/hpj;

    .line 3047
    .line 3048
    move-object/from16 v1, p1

    .line 3049
    .line 3050
    check-cast v1, La/k0w0;

    .line 3051
    .line 3052
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3053
    .line 3054
    .line 3055
    iget-object v0, v0, La/gr00;->c:Ljava/lang/Object;

    .line 3056
    .line 3057
    check-cast v0, La/fvt0;

    .line 3058
    .line 3059
    iget-object v0, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 3060
    .line 3061
    check-cast v0, La/h7i;

    .line 3062
    .line 3063
    invoke-virtual {v0}, La/h7i;->d()La/peg0;

    .line 3064
    .line 3065
    .line 3066
    iget-boolean v0, v9, La/hpj;->b:Z

    .line 3067
    .line 3068
    iget-boolean v0, v9, La/hpj;->a:Z

    .line 3069
    .line 3070
    iget-object v2, v9, La/hpj;->c:Ljava/lang/String;

    .line 3071
    .line 3072
    iget-object v3, v9, La/hpj;->d:Ljava/lang/String;

    .line 3073
    .line 3074
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$TvBetJackpotScreen;

    .line 3075
    .line 3076
    invoke-direct {v4, v2, v3, v0}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$TvBetJackpotScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3077
    .line 3078
    .line 3079
    invoke-virtual {v1, v4}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v0

    .line 3083
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 3084
    .line 3085
    check-cast v0, La/c8d;

    .line 3086
    .line 3087
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 3088
    .line 3089
    new-instance v2, La/v7d;

    .line 3090
    .line 3091
    const/4 v3, 0x1

    .line 3092
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 3093
    .line 3094
    .line 3095
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 3096
    .line 3097
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3098
    .line 3099
    return-object v0

    .line 3100
    :pswitch_19
    move-object v1, v0

    .line 3101
    check-cast v1, La/gl1;

    .line 3102
    .line 3103
    move-object v3, v9

    .line 3104
    check-cast v3, Ljava/lang/String;

    .line 3105
    .line 3106
    move-object/from16 v0, p1

    .line 3107
    .line 3108
    check-cast v0, Ljava/lang/Throwable;

    .line 3109
    .line 3110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3111
    .line 3112
    .line 3113
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 3114
    .line 3115
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 3116
    .line 3117
    :cond_4c
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v0

    .line 3121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3122
    .line 3123
    .line 3124
    iget-object v5, v1, La/i3t0;->f:La/oyg0;

    .line 3125
    .line 3126
    move-object v6, v0

    .line 3127
    check-cast v6, La/dl1;

    .line 3128
    .line 3129
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3130
    .line 3131
    .line 3132
    invoke-static {v6, v3, v2}, La/dl1;->a(La/dl1;Ljava/lang/String;Ljava/lang/String;)La/dl1;

    .line 3133
    .line 3134
    .line 3135
    move-result-object v5

    .line 3136
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3137
    .line 3138
    .line 3139
    move-result v0

    .line 3140
    if-eqz v0, :cond_4c

    .line 3141
    .line 3142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3143
    .line 3144
    return-object v0

    .line 3145
    :pswitch_1a
    check-cast v0, La/wk1;

    .line 3146
    .line 3147
    check-cast v9, Ljava/lang/String;

    .line 3148
    .line 3149
    move-object/from16 v1, p1

    .line 3150
    .line 3151
    check-cast v1, La/k0w0;

    .line 3152
    .line 3153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3154
    .line 3155
    .line 3156
    iget-object v2, v0, La/wk1;->q:La/vw3;

    .line 3157
    .line 3158
    iget-wide v3, v2, La/vw3;->b:J

    .line 3159
    .line 3160
    invoke-static {v9}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 3161
    .line 3162
    .line 3163
    move-result-object v5

    .line 3164
    if-eqz v5, :cond_4d

    .line 3165
    .line 3166
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 3167
    .line 3168
    .line 3169
    move-result-wide v21

    .line 3170
    iget-object v0, v0, La/wk1;->s:La/ctf0;

    .line 3171
    .line 3172
    const/4 v14, 0x0

    .line 3173
    new-array v5, v14, [Ljava/lang/Object;

    .line 3174
    .line 3175
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 3176
    .line 3177
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3178
    .line 3179
    .line 3180
    move-result-object v5

    .line 3181
    const v6, 0x7f1301bc

    .line 3182
    .line 3183
    .line 3184
    invoke-virtual {v0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3185
    .line 3186
    .line 3187
    move-result-object v23

    .line 3188
    iget-object v0, v2, La/vw3;->c:Ljava/lang/Object;

    .line 3189
    .line 3190
    move-object/from16 v25, v0

    .line 3191
    .line 3192
    check-cast v25, La/rj1;

    .line 3193
    .line 3194
    new-instance v18, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublisherGamesFragmentScreen;

    .line 3195
    .line 3196
    const/16 v24, 0x0

    .line 3197
    .line 3198
    move-wide/from16 v19, v3

    .line 3199
    .line 3200
    invoke-direct/range {v18 .. v25}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublisherGamesFragmentScreen;-><init>(JJLjava/lang/String;ZLa/rj1;)V

    .line 3201
    .line 3202
    .line 3203
    move-object/from16 v0, v18

    .line 3204
    .line 3205
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 3206
    .line 3207
    .line 3208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3209
    .line 3210
    goto :goto_3e

    .line 3211
    :cond_4d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3212
    .line 3213
    :goto_3e
    return-object v0

    .line 3214
    :pswitch_1b
    check-cast v0, La/mh1;

    .line 3215
    .line 3216
    check-cast v9, La/d7v;

    .line 3217
    .line 3218
    move-object/from16 v1, p1

    .line 3219
    .line 3220
    check-cast v1, La/k0w0;

    .line 3221
    .line 3222
    new-instance v2, La/mc;

    .line 3223
    .line 3224
    invoke-direct {v2, v0, v9, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3225
    .line 3226
    .line 3227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3228
    .line 3229
    .line 3230
    new-instance v0, La/a1w0;

    .line 3231
    .line 3232
    invoke-direct {v0, v2}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 3233
    .line 3234
    .line 3235
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 3236
    .line 3237
    .line 3238
    move-result-object v0

    .line 3239
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 3240
    .line 3241
    check-cast v0, La/c8d;

    .line 3242
    .line 3243
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 3244
    .line 3245
    new-instance v2, La/v7d;

    .line 3246
    .line 3247
    const/4 v3, 0x1

    .line 3248
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 3249
    .line 3250
    .line 3251
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 3252
    .line 3253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3254
    .line 3255
    return-object v0

    .line 3256
    :pswitch_1c
    move-object/from16 v27, v14

    .line 3257
    .line 3258
    check-cast v0, La/hg1;

    .line 3259
    .line 3260
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 3261
    .line 3262
    move-object/from16 v1, p1

    .line 3263
    .line 3264
    check-cast v1, La/hcz;

    .line 3265
    .line 3266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3267
    .line 3268
    .line 3269
    iget-object v0, v0, La/hg1;->c:La/a4x;

    .line 3270
    .line 3271
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3272
    .line 3273
    .line 3274
    move-result-object v0

    .line 3275
    :goto_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3276
    .line 3277
    .line 3278
    move-result v2

    .line 3279
    if-eqz v2, :cond_54

    .line 3280
    .line 3281
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3282
    .line 3283
    .line 3284
    move-result-object v2

    .line 3285
    check-cast v2, La/gg1;

    .line 3286
    .line 3287
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3288
    .line 3289
    .line 3290
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3291
    .line 3292
    .line 3293
    instance-of v3, v2, La/ag1;

    .line 3294
    .line 3295
    if-eqz v3, :cond_4e

    .line 3296
    .line 3297
    new-instance v3, La/ne1;

    .line 3298
    .line 3299
    const/4 v14, 0x0

    .line 3300
    invoke-direct {v3, v2, v9, v14}, La/ne1;-><init>(La/gg1;Lkotlin/jvm/functions/Function1;B)V

    .line 3301
    .line 3302
    .line 3303
    new-instance v2, La/ugd;

    .line 3304
    .line 3305
    const v4, 0x3710108b

    .line 3306
    .line 3307
    .line 3308
    const/4 v7, 0x1

    .line 3309
    invoke-direct {v2, v4, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3310
    .line 3311
    .line 3312
    const-string v3, "PROMO_BANNERS_KEY"

    .line 3313
    .line 3314
    move-object/from16 v4, v27

    .line 3315
    .line 3316
    const/4 v11, 0x2

    .line 3317
    invoke-static {v1, v3, v4, v2, v11}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3318
    .line 3319
    .line 3320
    :goto_40
    const/4 v5, 0x3

    .line 3321
    goto/16 :goto_41

    .line 3322
    .line 3323
    :cond_4e
    move-object/from16 v4, v27

    .line 3324
    .line 3325
    const/4 v7, 0x1

    .line 3326
    const/4 v11, 0x2

    .line 3327
    const/4 v14, 0x0

    .line 3328
    instance-of v3, v2, La/cg1;

    .line 3329
    .line 3330
    if-eqz v3, :cond_4f

    .line 3331
    .line 3332
    new-instance v3, La/ne1;

    .line 3333
    .line 3334
    invoke-direct {v3, v2, v9, v7}, La/ne1;-><init>(La/gg1;Lkotlin/jvm/functions/Function1;B)V

    .line 3335
    .line 3336
    .line 3337
    new-instance v2, La/ugd;

    .line 3338
    .line 3339
    const v5, -0x73aa6cc

    .line 3340
    .line 3341
    .line 3342
    invoke-direct {v2, v5, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3343
    .line 3344
    .line 3345
    const-string v3, "PROMO_GIFTS_KEY"

    .line 3346
    .line 3347
    invoke-static {v1, v3, v4, v2, v11}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3348
    .line 3349
    .line 3350
    goto :goto_40

    .line 3351
    :cond_4f
    instance-of v3, v2, La/dg1;

    .line 3352
    .line 3353
    if-eqz v3, :cond_50

    .line 3354
    .line 3355
    new-instance v3, La/ne1;

    .line 3356
    .line 3357
    invoke-direct {v3, v2, v9, v11}, La/ne1;-><init>(La/gg1;Lkotlin/jvm/functions/Function1;B)V

    .line 3358
    .line 3359
    .line 3360
    new-instance v2, La/ugd;

    .line 3361
    .line 3362
    const v5, -0x30032d6d

    .line 3363
    .line 3364
    .line 3365
    invoke-direct {v2, v5, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3366
    .line 3367
    .line 3368
    const-string v3, "PROMO_PROMOCODE_KEY"

    .line 3369
    .line 3370
    invoke-static {v1, v3, v4, v2, v11}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3371
    .line 3372
    .line 3373
    goto :goto_40

    .line 3374
    :cond_50
    instance-of v3, v2, La/eg1;

    .line 3375
    .line 3376
    if-eqz v3, :cond_51

    .line 3377
    .line 3378
    new-instance v3, La/ne1;

    .line 3379
    .line 3380
    const/4 v5, 0x3

    .line 3381
    invoke-direct {v3, v2, v9, v5}, La/ne1;-><init>(La/gg1;Lkotlin/jvm/functions/Function1;B)V

    .line 3382
    .line 3383
    .line 3384
    new-instance v2, La/ugd;

    .line 3385
    .line 3386
    const v8, -0x58cbb40e

    .line 3387
    .line 3388
    .line 3389
    invoke-direct {v2, v8, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3390
    .line 3391
    .line 3392
    const-string v3, "PROMO_SOCIALS_KEY"

    .line 3393
    .line 3394
    invoke-static {v1, v3, v4, v2, v11}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3395
    .line 3396
    .line 3397
    goto :goto_41

    .line 3398
    :cond_51
    const/4 v5, 0x3

    .line 3399
    instance-of v3, v2, La/fg1;

    .line 3400
    .line 3401
    if-eqz v3, :cond_52

    .line 3402
    .line 3403
    new-instance v3, La/ne1;

    .line 3404
    .line 3405
    invoke-direct {v3, v2, v9, v6}, La/ne1;-><init>(La/gg1;Lkotlin/jvm/functions/Function1;B)V

    .line 3406
    .line 3407
    .line 3408
    new-instance v2, La/ugd;

    .line 3409
    .line 3410
    const v8, 0x7e6bc551

    .line 3411
    .line 3412
    .line 3413
    invoke-direct {v2, v8, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3414
    .line 3415
    .line 3416
    const-string v3, "PROMO_TOURNAMENTS_KEY"

    .line 3417
    .line 3418
    invoke-static {v1, v3, v4, v2, v11}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3419
    .line 3420
    .line 3421
    goto :goto_41

    .line 3422
    :cond_52
    instance-of v3, v2, La/bg1;

    .line 3423
    .line 3424
    if-eqz v3, :cond_53

    .line 3425
    .line 3426
    new-instance v3, La/ne1;

    .line 3427
    .line 3428
    const/4 v8, 0x5

    .line 3429
    invoke-direct {v3, v2, v9, v8}, La/ne1;-><init>(La/gg1;Lkotlin/jvm/functions/Function1;B)V

    .line 3430
    .line 3431
    .line 3432
    new-instance v2, La/ugd;

    .line 3433
    .line 3434
    const v8, 0x55a33eb0

    .line 3435
    .line 3436
    .line 3437
    invoke-direct {v2, v8, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 3438
    .line 3439
    .line 3440
    const-string v3, "PROMO_DAILY_TASKS_KEY"

    .line 3441
    .line 3442
    invoke-static {v1, v3, v4, v2, v11}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 3443
    .line 3444
    .line 3445
    :goto_41
    move-object/from16 v27, v4

    .line 3446
    .line 3447
    goto/16 :goto_3f

    .line 3448
    .line 3449
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 3450
    .line 3451
    .line 3452
    move-object v14, v4

    .line 3453
    goto :goto_42

    .line 3454
    :cond_54
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3455
    .line 3456
    :goto_42
    return-object v14

    .line 3457
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
