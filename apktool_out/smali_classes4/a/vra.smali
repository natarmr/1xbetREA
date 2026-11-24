.class public final synthetic La/vra;
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
    iput-byte p7, p0, La/vra;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vra;->a:B

    .line 4
    .line 5
    sget-object v2, La/hl2;->a:La/hl2;

    .line 6
    .line 7
    sget-object v4, La/gl2;->a:La/gl2;

    .line 8
    .line 9
    sget-object v5, La/el2;->a:La/el2;

    .line 10
    .line 11
    sget-object v6, La/cm2;->a:La/cm2;

    .line 12
    .line 13
    const-string v7, "REMOVE_ALL_VIEWED_RESULT"

    .line 14
    .line 15
    sget-object v8, La/hn2;->a:La/hn2;

    .line 16
    .line 17
    const-string v11, "OnboardingBottomSheetContainerFragment"

    .line 18
    .line 19
    const-string v12, ""

    .line 20
    .line 21
    sget-object v14, La/nm2;->a:La/nm2;

    .line 22
    .line 23
    sget-object v15, La/qk2;->a:La/qk2;

    .line 24
    .line 25
    sget-object v3, La/xi2;->a:La/xi2;

    .line 26
    .line 27
    sget-object v9, La/ph2;->a:La/ph2;

    .line 28
    .line 29
    sget-object v10, La/xf2;->a:La/xf2;

    .line 30
    .line 31
    const/16 v18, 0x2

    .line 32
    .line 33
    const/4 v13, 0x0

    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Throwable;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/jgb;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v2, La/r26;

    .line 52
    .line 53
    iget-object v3, v0, La/jgb;->e:La/g2v;

    .line 54
    .line 55
    sget-object v4, La/pb10;->g:La/pb10;

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const/16 v10, 0x1de

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const v7, 0x7f130677

    .line 63
    .line 64
    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-static/range {v3 .. v10}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-direct {v2, v3}, La/r26;-><init>(La/jkm;)V

    .line 71
    .line 72
    .line 73
    iget-object v3, v0, La/jgb;->j:La/p7m0;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v13, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, La/jgb;->s:La/duj;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, La/mk50;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/jgb;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v6, La/xw5;

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    invoke-direct {v6, v0, v1, v13, v3}, La/xw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 111
    .line 112
    .line 113
    const/16 v7, 0xf

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_1
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, La/x4b;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, La/k3t0;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_2
    move-object/from16 v1, p1

    .line 142
    .line 143
    check-cast v1, La/o5b;

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, La/g5b;

    .line 151
    .line 152
    sget-object v2, La/g5b;->c2:La/gl5;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    instance-of v2, v1, La/k5b;

    .line 158
    .line 159
    if-eqz v2, :cond_7

    .line 160
    .line 161
    check-cast v1, La/k5b;

    .line 162
    .line 163
    iget-object v1, v1, La/k5b;->a:La/jx70;

    .line 164
    .line 165
    instance-of v2, v1, La/cx70;

    .line 166
    .line 167
    if-eqz v2, :cond_0

    .line 168
    .line 169
    invoke-virtual {v0}, La/g5b;->O0()La/k3t0;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    sget-object v2, La/ja0;->a:La/ja0;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_0
    instance-of v2, v1, La/dx70;

    .line 181
    .line 182
    if-eqz v2, :cond_1

    .line 183
    .line 184
    invoke-virtual {v0}, La/g5b;->X0()La/k3t0;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    sget-object v2, La/b2t;->a:La/b2t;

    .line 189
    .line 190
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_1
    instance-of v2, v1, La/ex70;

    .line 196
    .line 197
    if-eqz v2, :cond_2

    .line 198
    .line 199
    invoke-virtual {v0}, La/g5b;->T0()La/k3t0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v1, v10}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_2
    instance-of v2, v1, La/fx70;

    .line 209
    .line 210
    if-eqz v2, :cond_3

    .line 211
    .line 212
    invoke-virtual {v0}, La/g5b;->U0()La/k3t0;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1, v9}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_3
    instance-of v2, v1, La/gx70;

    .line 222
    .line 223
    if-eqz v2, :cond_4

    .line 224
    .line 225
    invoke-virtual {v0}, La/g5b;->V0()La/k3t0;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_4
    instance-of v2, v1, La/hx70;

    .line 235
    .line 236
    if-eqz v2, :cond_5

    .line 237
    .line 238
    invoke-virtual {v0}, La/g5b;->P0()La/k3t0;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v1, v15}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_5
    instance-of v1, v1, La/ix70;

    .line 248
    .line 249
    if-eqz v1, :cond_6

    .line 250
    .line 251
    invoke-virtual {v0}, La/g5b;->W0()La/k3t0;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {v1, v14}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :cond_7
    instance-of v2, v1, La/m5b;

    .line 266
    .line 267
    if-eqz v2, :cond_8

    .line 268
    .line 269
    iget-object v2, v0, La/g5b;->X1:La/a8z;

    .line 270
    .line 271
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    check-cast v2, La/k3t0;

    .line 276
    .line 277
    new-instance v3, La/wl2;

    .line 278
    .line 279
    check-cast v1, La/m5b;

    .line 280
    .line 281
    iget-object v1, v1, La/m5b;->a:La/ih2;

    .line 282
    .line 283
    iget-byte v1, v1, La/ih2;->a:B

    .line 284
    .line 285
    int-to-long v4, v1

    .line 286
    invoke-direct {v3, v4, v5}, La/wl2;-><init>(J)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_8
    instance-of v2, v1, La/l5b;

    .line 294
    .line 295
    if-eqz v2, :cond_9

    .line 296
    .line 297
    invoke-virtual {v0}, La/g5b;->T0()La/k3t0;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    check-cast v1, La/l5b;

    .line 302
    .line 303
    iget-object v1, v1, La/l5b;->a:Ljava/lang/String;

    .line 304
    .line 305
    new-instance v3, La/dg2;

    .line 306
    .line 307
    invoke-direct {v3, v1}, La/dg2;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto :goto_0

    .line 314
    :cond_9
    sget-object v2, La/j5b;->a:La/j5b;

    .line 315
    .line 316
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-eqz v2, :cond_a

    .line 321
    .line 322
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 330
    .line 331
    .line 332
    goto :goto_0

    .line 333
    :cond_a
    sget-object v2, La/n5b;->a:La/n5b;

    .line 334
    .line 335
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_c

    .line 340
    .line 341
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    iget-object v1, v1, La/aci;->a:La/poq0;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    sget-object v2, La/fk60;->b:La/uuz;

    .line 355
    .line 356
    sget-object v2, La/ki60;->q2:La/htz;

    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v11}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    if-nez v2, :cond_b

    .line 366
    .line 367
    new-instance v2, La/ki60;

    .line 368
    .line 369
    invoke-direct {v2}, La/ki60;-><init>()V

    .line 370
    .line 371
    .line 372
    sget-object v3, La/ki60;->r2:[La/iiy;

    .line 373
    .line 374
    const/16 v21, 0x1

    .line 375
    .line 376
    aget-object v4, v3, v21

    .line 377
    .line 378
    iget-object v5, v2, La/ki60;->n2:La/zz2;

    .line 379
    .line 380
    const/16 v6, 0x20

    .line 381
    .line 382
    invoke-virtual {v5, v2, v4, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 383
    .line 384
    .line 385
    iget-object v4, v2, La/ki60;->o2:La/phf0;

    .line 386
    .line 387
    aget-object v3, v3, v18

    .line 388
    .line 389
    invoke-virtual {v4, v2, v3, v12}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v2, v1, v11}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    :cond_b
    :goto_0
    invoke-virtual {v0}, La/g5b;->Q0()La/k3t0;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    sget-object v1, La/n4b;->a:La/n4b;

    .line 400
    .line 401
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    goto :goto_1

    .line 407
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 408
    .line 409
    .line 410
    :goto_1
    return-object v13

    .line 411
    :pswitch_3
    move-object/from16 v1, p1

    .line 412
    .line 413
    check-cast v1, La/n2t;

    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, La/k3t0;

    .line 421
    .line 422
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object v0

    .line 428
    :pswitch_4
    move-object/from16 v1, p1

    .line 429
    .line 430
    check-cast v1, La/tct;

    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, La/g5b;

    .line 438
    .line 439
    sget-object v2, La/g5b;->c2:La/gl5;

    .line 440
    .line 441
    instance-of v2, v1, La/rct;

    .line 442
    .line 443
    if-eqz v2, :cond_d

    .line 444
    .line 445
    iget-object v2, v0, La/g5b;->P1:La/a8z;

    .line 446
    .line 447
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    check-cast v2, La/aii;

    .line 452
    .line 453
    iget-object v2, v2, La/aii;->a:La/bw60;

    .line 454
    .line 455
    invoke-interface {v2}, La/bw60;->b()La/afm0;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    check-cast v1, La/rct;

    .line 463
    .line 464
    iget-object v1, v1, La/rct;->a:La/tn60;

    .line 465
    .line 466
    new-instance v3, La/b5b;

    .line 467
    .line 468
    const/4 v4, 0x4

    .line 469
    invoke-direct {v3, v0, v4}, La/b5b;-><init>(La/g5b;B)V

    .line 470
    .line 471
    .line 472
    new-instance v4, La/b5b;

    .line 473
    .line 474
    const/4 v5, 0x5

    .line 475
    invoke-direct {v4, v0, v5}, La/b5b;-><init>(La/g5b;B)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v0, v1, v3, v4}, La/afm0;->q(Landroidx/fragment/app/Fragment;La/tn60;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 479
    .line 480
    .line 481
    goto :goto_2

    .line 482
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    sget-object v2, La/sct;->a:La/sct;

    .line 486
    .line 487
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    if-eqz v1, :cond_e

    .line 492
    .line 493
    const-string v1, "REMOVE_ALL_FAVORITES_XGAMES_RESULT"

    .line 494
    .line 495
    invoke-virtual {v0, v1}, La/g5b;->Y0(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    :goto_2
    invoke-virtual {v0}, La/g5b;->X0()La/k3t0;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sget-object v1, La/a2t;->a:La/a2t;

    .line 503
    .line 504
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    goto :goto_3

    .line 510
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 511
    .line 512
    .line 513
    :goto_3
    return-object v13

    .line 514
    :pswitch_5
    move-object/from16 v1, p1

    .line 515
    .line 516
    check-cast v1, La/wm2;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, La/k3t0;

    .line 524
    .line 525
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 529
    .line 530
    return-object v0

    .line 531
    :pswitch_6
    move-object/from16 v1, p1

    .line 532
    .line 533
    check-cast v1, La/jn2;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, La/g5b;

    .line 541
    .line 542
    sget-object v2, La/g5b;->c2:La/gl5;

    .line 543
    .line 544
    sget-object v17, La/rek0;->b:La/rek0;

    .line 545
    .line 546
    instance-of v2, v1, La/fn2;

    .line 547
    .line 548
    if-eqz v2, :cond_f

    .line 549
    .line 550
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    iget-object v2, v2, La/aci;->b:La/itr;

    .line 555
    .line 556
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    check-cast v1, La/fn2;

    .line 564
    .line 565
    iget-object v1, v1, La/fn2;->a:La/sjd;

    .line 566
    .line 567
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 568
    .line 569
    .line 570
    :goto_4
    move-object/from16 v18, v0

    .line 571
    .line 572
    goto/16 :goto_5

    .line 573
    .line 574
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    sget-object v2, La/gn2;->a:La/gn2;

    .line 578
    .line 579
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    if-eqz v2, :cond_10

    .line 584
    .line 585
    iget-object v1, v0, La/g5b;->O1:La/a8z;

    .line 586
    .line 587
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    check-cast v1, La/k7i;

    .line 592
    .line 593
    iget-object v1, v1, La/k7i;->r:La/wdk0;

    .line 594
    .line 595
    new-instance v16, La/xdk0;

    .line 596
    .line 597
    const v2, 0x7f13096f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v18

    .line 604
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    const/16 v22, 0x0

    .line 608
    .line 609
    const/16 v23, 0x7c

    .line 610
    .line 611
    const/16 v19, 0x0

    .line 612
    .line 613
    const/16 v20, 0x0

    .line 614
    .line 615
    const/16 v21, 0x0

    .line 616
    .line 617
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 618
    .line 619
    .line 620
    const/16 v23, 0x3fc

    .line 621
    .line 622
    const/16 v21, 0x0

    .line 623
    .line 624
    move-object/from16 v18, v0

    .line 625
    .line 626
    move-object/from16 v17, v16

    .line 627
    .line 628
    move-object/from16 v16, v1

    .line 629
    .line 630
    invoke-static/range {v16 .. v23}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 631
    .line 632
    .line 633
    goto :goto_5

    .line 634
    :cond_10
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v2

    .line 638
    if-eqz v2, :cond_11

    .line 639
    .line 640
    invoke-virtual {v0, v7}, La/g5b;->Y0(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    goto :goto_4

    .line 644
    :cond_11
    instance-of v2, v1, La/in2;

    .line 645
    .line 646
    if-eqz v2, :cond_12

    .line 647
    .line 648
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    iget-object v2, v2, La/aci;->f:La/wdk0;

    .line 653
    .line 654
    new-instance v16, La/xdk0;

    .line 655
    .line 656
    check-cast v1, La/in2;

    .line 657
    .line 658
    iget-object v1, v1, La/in2;->a:Ljava/lang/String;

    .line 659
    .line 660
    const/16 v22, 0x0

    .line 661
    .line 662
    const/16 v23, 0x7c

    .line 663
    .line 664
    const/16 v19, 0x0

    .line 665
    .line 666
    const/16 v20, 0x0

    .line 667
    .line 668
    const/16 v21, 0x0

    .line 669
    .line 670
    move-object/from16 v18, v1

    .line 671
    .line 672
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 673
    .line 674
    .line 675
    const/16 v23, 0x3fc

    .line 676
    .line 677
    const/16 v21, 0x0

    .line 678
    .line 679
    move-object/from16 v18, v0

    .line 680
    .line 681
    move-object/from16 v17, v16

    .line 682
    .line 683
    move-object/from16 v16, v2

    .line 684
    .line 685
    invoke-static/range {v16 .. v23}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 686
    .line 687
    .line 688
    :goto_5
    invoke-virtual/range {v18 .. v18}, La/g5b;->W0()La/k3t0;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-virtual {v0, v6}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    goto :goto_6

    .line 698
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 699
    .line 700
    .line 701
    :goto_6
    return-object v13

    .line 702
    :pswitch_7
    move-object/from16 v1, p1

    .line 703
    .line 704
    check-cast v1, La/yl2;

    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, La/k3t0;

    .line 712
    .line 713
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 717
    .line 718
    return-object v0

    .line 719
    :pswitch_8
    move-object/from16 v1, p1

    .line 720
    .line 721
    check-cast v1, La/xk2;

    .line 722
    .line 723
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v0, La/k3t0;

    .line 729
    .line 730
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 734
    .line 735
    return-object v0

    .line 736
    :pswitch_9
    move-object/from16 v1, p1

    .line 737
    .line 738
    check-cast v1, La/ml2;

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, La/g5b;

    .line 746
    .line 747
    sget-object v3, La/g5b;->c2:La/gl5;

    .line 748
    .line 749
    instance-of v3, v1, La/fl2;

    .line 750
    .line 751
    if-eqz v3, :cond_13

    .line 752
    .line 753
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    iget-object v2, v2, La/aci;->b:La/itr;

    .line 758
    .line 759
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    check-cast v1, La/fl2;

    .line 767
    .line 768
    iget-object v1, v1, La/fl2;->a:La/sjd;

    .line 769
    .line 770
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 771
    .line 772
    .line 773
    goto/16 :goto_7

    .line 774
    .line 775
    :cond_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    if-eqz v3, :cond_14

    .line 783
    .line 784
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    iget-object v1, v1, La/aci;->g:La/e720;

    .line 789
    .line 790
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1, v2}, La/e720;->a(Landroidx/fragment/app/e;)V

    .line 798
    .line 799
    .line 800
    goto/16 :goto_7

    .line 801
    .line 802
    :cond_14
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    move-result v3

    .line 806
    if-eqz v3, :cond_15

    .line 807
    .line 808
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    iget-object v1, v1, La/aci;->f:La/wdk0;

    .line 813
    .line 814
    new-instance v2, La/xdk0;

    .line 815
    .line 816
    sget-object v3, La/pek0;->a:La/pek0;

    .line 817
    .line 818
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 819
    .line 820
    .line 821
    move-result-object v4

    .line 822
    iget-object v4, v4, La/aci;->e:La/ctf0;

    .line 823
    .line 824
    const/4 v5, 0x0

    .line 825
    new-array v6, v5, [Ljava/lang/Object;

    .line 826
    .line 827
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 828
    .line 829
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    const v6, 0x7f1301ac

    .line 834
    .line 835
    .line 836
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v4

    .line 840
    const/4 v8, 0x0

    .line 841
    const/16 v9, 0x7c

    .line 842
    .line 843
    const/4 v5, 0x0

    .line 844
    const/4 v6, 0x0

    .line 845
    const/4 v7, 0x0

    .line 846
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 847
    .line 848
    .line 849
    const/16 v27, 0x0

    .line 850
    .line 851
    const/16 v28, 0x3ec

    .line 852
    .line 853
    const/16 v24, 0x0

    .line 854
    .line 855
    const/16 v25, 0x0

    .line 856
    .line 857
    const/16 v26, 0x1

    .line 858
    .line 859
    move-object/from16 v23, v0

    .line 860
    .line 861
    move-object/from16 v21, v1

    .line 862
    .line 863
    move-object/from16 v22, v2

    .line 864
    .line 865
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 866
    .line 867
    .line 868
    goto/16 :goto_7

    .line 869
    .line 870
    :cond_15
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v2

    .line 874
    if-eqz v2, :cond_16

    .line 875
    .line 876
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    iget-object v1, v1, La/aci;->d:La/ii;

    .line 881
    .line 882
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 883
    .line 884
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    iget-object v3, v3, La/aci;->e:La/ctf0;

    .line 889
    .line 890
    const/4 v5, 0x0

    .line 891
    new-array v4, v5, [Ljava/lang/Object;

    .line 892
    .line 893
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 894
    .line 895
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    const v6, 0x7f130ed5

    .line 900
    .line 901
    .line 902
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 907
    .line 908
    .line 909
    move-result-object v4

    .line 910
    iget-object v4, v4, La/aci;->e:La/ctf0;

    .line 911
    .line 912
    new-array v6, v5, [Ljava/lang/Object;

    .line 913
    .line 914
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 915
    .line 916
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v6

    .line 920
    const v7, 0x7f130ed4

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v4

    .line 927
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 928
    .line 929
    .line 930
    move-result-object v6

    .line 931
    iget-object v6, v6, La/aci;->e:La/ctf0;

    .line 932
    .line 933
    new-array v7, v5, [Ljava/lang/Object;

    .line 934
    .line 935
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 936
    .line 937
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    const v7, 0x7f130e5c

    .line 942
    .line 943
    .line 944
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v5

    .line 948
    sget-object v11, La/n12;->a:La/n12;

    .line 949
    .line 950
    const/4 v12, 0x0

    .line 951
    const/16 v13, 0x5f8

    .line 952
    .line 953
    const/4 v6, 0x0

    .line 954
    const/4 v7, 0x0

    .line 955
    const/4 v8, 0x0

    .line 956
    const/4 v9, 0x0

    .line 957
    const/4 v10, 0x0

    .line 958
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_7

    .line 972
    .line 973
    :cond_16
    sget-object v2, La/ll2;->a:La/ll2;

    .line 974
    .line 975
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    move-result v2

    .line 979
    if-eqz v2, :cond_17

    .line 980
    .line 981
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 982
    .line 983
    .line 984
    move-result-object v1

    .line 985
    iget-object v1, v1, La/aci;->d:La/ii;

    .line 986
    .line 987
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 988
    .line 989
    const v3, 0x7f131151

    .line 990
    .line 991
    .line 992
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v4

    .line 996
    const v5, 0x7f130514

    .line 997
    .line 998
    .line 999
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v5

    .line 1003
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v3

    .line 1007
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    const v6, 0x7f13032f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v6

    .line 1017
    sget-object v11, La/n12;->a:La/n12;

    .line 1018
    .line 1019
    const/4 v12, 0x0

    .line 1020
    const/16 v13, 0x5d0

    .line 1021
    .line 1022
    const/4 v7, 0x0

    .line 1023
    const-string v8, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY"

    .line 1024
    .line 1025
    const/4 v9, 0x0

    .line 1026
    const/4 v10, 0x0

    .line 1027
    move-object/from16 v32, v5

    .line 1028
    .line 1029
    move-object v5, v3

    .line 1030
    move-object v3, v4

    .line 1031
    move-object/from16 v4, v32

    .line 1032
    .line 1033
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1044
    .line 1045
    .line 1046
    goto/16 :goto_7

    .line 1047
    .line 1048
    :cond_17
    sget-object v2, La/jl2;->a:La/jl2;

    .line 1049
    .line 1050
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v2

    .line 1054
    if-eqz v2, :cond_18

    .line 1055
    .line 1056
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    iget-object v1, v1, La/aci;->d:La/ii;

    .line 1061
    .line 1062
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1063
    .line 1064
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v3

    .line 1068
    iget-object v3, v3, La/aci;->e:La/ctf0;

    .line 1069
    .line 1070
    const/4 v5, 0x0

    .line 1071
    new-array v4, v5, [Ljava/lang/Object;

    .line 1072
    .line 1073
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 1074
    .line 1075
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    const v6, 0x7f130759

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v3

    .line 1086
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v4

    .line 1090
    iget-object v4, v4, La/aci;->e:La/ctf0;

    .line 1091
    .line 1092
    new-array v6, v5, [Ljava/lang/Object;

    .line 1093
    .line 1094
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 1095
    .line 1096
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v6

    .line 1100
    const v7, 0x7f130758

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v4, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v4

    .line 1107
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v6

    .line 1111
    iget-object v6, v6, La/aci;->e:La/ctf0;

    .line 1112
    .line 1113
    new-array v7, v5, [Ljava/lang/Object;

    .line 1114
    .line 1115
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 1116
    .line 1117
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v5

    .line 1121
    const v7, 0x7f130e5e

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v5

    .line 1128
    sget-object v11, La/n12;->a:La/n12;

    .line 1129
    .line 1130
    const/4 v12, 0x0

    .line 1131
    const/16 v13, 0x5f8

    .line 1132
    .line 1133
    const/4 v6, 0x0

    .line 1134
    const/4 v7, 0x0

    .line 1135
    const/4 v8, 0x0

    .line 1136
    const/4 v9, 0x0

    .line 1137
    const/4 v10, 0x0

    .line 1138
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v3

    .line 1145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1149
    .line 1150
    .line 1151
    goto :goto_7

    .line 1152
    :cond_18
    instance-of v2, v1, La/kl2;

    .line 1153
    .line 1154
    if-eqz v2, :cond_19

    .line 1155
    .line 1156
    check-cast v1, La/kl2;

    .line 1157
    .line 1158
    iget-object v2, v1, La/kl2;->a:La/m0k0;

    .line 1159
    .line 1160
    iget-object v1, v1, La/kl2;->b:La/m97;

    .line 1161
    .line 1162
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v3

    .line 1166
    iget-object v3, v3, La/aci;->g:La/e720;

    .line 1167
    .line 1168
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    new-instance v5, La/fq2;

    .line 1176
    .line 1177
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v3, v4, v1, v2, v5}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 1181
    .line 1182
    .line 1183
    goto :goto_7

    .line 1184
    :cond_19
    sget-object v2, La/il2;->a:La/il2;

    .line 1185
    .line 1186
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v1

    .line 1190
    if-eqz v1, :cond_1a

    .line 1191
    .line 1192
    const-string v1, "REMOVE_ALL_COEF_TRACK_RESULT"

    .line 1193
    .line 1194
    invoke-virtual {v0, v1}, La/g5b;->Y0(Ljava/lang/String;)V

    .line 1195
    .line 1196
    .line 1197
    :goto_7
    invoke-virtual {v0}, La/g5b;->P0()La/k3t0;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    sget-object v1, La/hk2;->a:La/hk2;

    .line 1202
    .line 1203
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1204
    .line 1205
    .line 1206
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1207
    .line 1208
    goto :goto_8

    .line 1209
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 1210
    .line 1211
    .line 1212
    :goto_8
    return-object v13

    .line 1213
    :pswitch_a
    move-object/from16 v1, p1

    .line 1214
    .line 1215
    check-cast v1, La/dj2;

    .line 1216
    .line 1217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1218
    .line 1219
    .line 1220
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v0, La/k3t0;

    .line 1223
    .line 1224
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_b
    move-object/from16 v1, p1

    .line 1231
    .line 1232
    check-cast v1, La/oj2;

    .line 1233
    .line 1234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v0, La/g5b;

    .line 1240
    .line 1241
    sget-object v2, La/g5b;->c2:La/gl5;

    .line 1242
    .line 1243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    sget-object v2, La/oj2;->a:La/oj2;

    .line 1247
    .line 1248
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    if-eqz v1, :cond_1b

    .line 1253
    .line 1254
    const-string v1, "REMOVE_ALL_TOURNAMENTS_RESULT"

    .line 1255
    .line 1256
    invoke-virtual {v0, v1}, La/g5b;->Y0(Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v0}, La/g5b;->V0()La/k3t0;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    sget-object v1, La/si2;->a:La/si2;

    .line 1264
    .line 1265
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1266
    .line 1267
    .line 1268
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1269
    .line 1270
    goto :goto_9

    .line 1271
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 1272
    .line 1273
    .line 1274
    :goto_9
    return-object v13

    .line 1275
    :pswitch_c
    move-object/from16 v1, p1

    .line 1276
    .line 1277
    check-cast v1, La/vh2;

    .line 1278
    .line 1279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1280
    .line 1281
    .line 1282
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1283
    .line 1284
    check-cast v0, La/k3t0;

    .line 1285
    .line 1286
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1287
    .line 1288
    .line 1289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1290
    .line 1291
    return-object v0

    .line 1292
    :pswitch_d
    move-object/from16 v1, p1

    .line 1293
    .line 1294
    check-cast v1, La/di2;

    .line 1295
    .line 1296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v0, La/g5b;

    .line 1302
    .line 1303
    sget-object v2, La/g5b;->c2:La/gl5;

    .line 1304
    .line 1305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1306
    .line 1307
    .line 1308
    sget-object v2, La/di2;->a:La/di2;

    .line 1309
    .line 1310
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v1

    .line 1314
    if-eqz v1, :cond_1c

    .line 1315
    .line 1316
    const-string v1, "REMOVE_ALL_TEAM_RESULT"

    .line 1317
    .line 1318
    invoke-virtual {v0, v1}, La/g5b;->Y0(Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v0}, La/g5b;->U0()La/k3t0;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    sget-object v1, La/kh2;->a:La/kh2;

    .line 1326
    .line 1327
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1331
    .line 1332
    goto :goto_a

    .line 1333
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1334
    .line 1335
    .line 1336
    :goto_a
    return-object v13

    .line 1337
    :pswitch_e
    move-object/from16 v1, p1

    .line 1338
    .line 1339
    check-cast v1, La/gg2;

    .line 1340
    .line 1341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1345
    .line 1346
    check-cast v0, La/k3t0;

    .line 1347
    .line 1348
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1349
    .line 1350
    .line 1351
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1352
    .line 1353
    return-object v0

    .line 1354
    :pswitch_f
    move-object/from16 v1, p1

    .line 1355
    .line 1356
    check-cast v1, La/tg2;

    .line 1357
    .line 1358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1359
    .line 1360
    .line 1361
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v0, La/g5b;

    .line 1364
    .line 1365
    sget-object v2, La/g5b;->c2:La/gl5;

    .line 1366
    .line 1367
    instance-of v2, v1, La/ng2;

    .line 1368
    .line 1369
    if-eqz v2, :cond_1d

    .line 1370
    .line 1371
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    iget-object v2, v2, La/aci;->b:La/itr;

    .line 1376
    .line 1377
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v2

    .line 1381
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1382
    .line 1383
    .line 1384
    check-cast v1, La/ng2;

    .line 1385
    .line 1386
    iget-object v1, v1, La/ng2;->a:La/sjd;

    .line 1387
    .line 1388
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1389
    .line 1390
    .line 1391
    goto/16 :goto_b

    .line 1392
    .line 1393
    :cond_1d
    instance-of v2, v1, La/qg2;

    .line 1394
    .line 1395
    if-eqz v2, :cond_1e

    .line 1396
    .line 1397
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v2

    .line 1401
    iget-object v2, v2, La/aci;->c:La/bwl;

    .line 1402
    .line 1403
    iget-object v2, v2, La/bwl;->a:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v2, La/dbi;

    .line 1406
    .line 1407
    invoke-virtual {v2}, La/dbi;->o()La/jw20;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    check-cast v1, La/qg2;

    .line 1412
    .line 1413
    iget-object v1, v1, La/qg2;->a:La/j2g0;

    .line 1414
    .line 1415
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v3

    .line 1419
    iget-object v3, v3, La/aci;->e:La/ctf0;

    .line 1420
    .line 1421
    invoke-virtual {v2, v0, v3, v1}, La/jw20;->r(Landroidx/fragment/app/Fragment;La/ctf0;La/j2g0;)V

    .line 1422
    .line 1423
    .line 1424
    goto/16 :goto_b

    .line 1425
    .line 1426
    :cond_1e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    sget-object v2, La/sg2;->a:La/sg2;

    .line 1430
    .line 1431
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v2

    .line 1435
    if-eqz v2, :cond_1f

    .line 1436
    .line 1437
    sget-object v1, La/s6p;->o2:La/pek;

    .line 1438
    .line 1439
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1444
    .line 1445
    .line 1446
    sget-object v3, La/wep;->a:La/wep;

    .line 1447
    .line 1448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1449
    .line 1450
    .line 1451
    const-string v1, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 1452
    .line 1453
    invoke-static {v2, v3, v1}, La/pek;->p(Landroidx/fragment/app/e;La/wep;Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    goto/16 :goto_b

    .line 1457
    .line 1458
    :cond_1f
    sget-object v2, La/rg2;->a:La/rg2;

    .line 1459
    .line 1460
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1461
    .line 1462
    .line 1463
    move-result v2

    .line 1464
    if-eqz v2, :cond_20

    .line 1465
    .line 1466
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v1

    .line 1470
    iget-object v1, v1, La/aci;->d:La/ii;

    .line 1471
    .line 1472
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1473
    .line 1474
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v3

    .line 1478
    iget-object v3, v3, La/aci;->e:La/ctf0;

    .line 1479
    .line 1480
    const/4 v5, 0x0

    .line 1481
    new-array v4, v5, [Ljava/lang/Object;

    .line 1482
    .line 1483
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 1484
    .line 1485
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v4

    .line 1489
    const v6, 0x7f13046c

    .line 1490
    .line 1491
    .line 1492
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v3

    .line 1496
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v4

    .line 1500
    iget-object v4, v4, La/aci;->e:La/ctf0;

    .line 1501
    .line 1502
    new-array v7, v5, [Ljava/lang/Object;

    .line 1503
    .line 1504
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 1505
    .line 1506
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v7

    .line 1510
    const v8, 0x7f1304d8

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v4, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v4

    .line 1517
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v7

    .line 1521
    iget-object v7, v7, La/aci;->e:La/ctf0;

    .line 1522
    .line 1523
    new-array v8, v5, [Ljava/lang/Object;

    .line 1524
    .line 1525
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 1526
    .line 1527
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v8

    .line 1531
    invoke-virtual {v7, v6, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v6

    .line 1535
    invoke-virtual {v0}, La/g5b;->R0()La/aci;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v7

    .line 1539
    iget-object v7, v7, La/aci;->e:La/ctf0;

    .line 1540
    .line 1541
    new-array v8, v5, [Ljava/lang/Object;

    .line 1542
    .line 1543
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 1544
    .line 1545
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v5

    .line 1549
    const v8, 0x7f13032f

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v7, v8, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v5

    .line 1556
    sget-object v11, La/n12;->a:La/n12;

    .line 1557
    .line 1558
    const/4 v12, 0x0

    .line 1559
    const/16 v13, 0x5d0

    .line 1560
    .line 1561
    const/4 v7, 0x0

    .line 1562
    const-string v8, "REQUEST_CLEAR_GROUPS_DIALOG_KEY"

    .line 1563
    .line 1564
    const/4 v9, 0x0

    .line 1565
    const/4 v10, 0x0

    .line 1566
    move-object/from16 v32, v6

    .line 1567
    .line 1568
    move-object v6, v5

    .line 1569
    move-object/from16 v5, v32

    .line 1570
    .line 1571
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v3

    .line 1578
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1582
    .line 1583
    .line 1584
    goto :goto_b

    .line 1585
    :cond_20
    sget-object v2, La/pg2;->a:La/pg2;

    .line 1586
    .line 1587
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1588
    .line 1589
    .line 1590
    move-result v2

    .line 1591
    if-eqz v2, :cond_21

    .line 1592
    .line 1593
    invoke-virtual {v0}, La/g5b;->Q0()La/k3t0;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v1

    .line 1597
    sget-object v2, La/m4b;->a:La/m4b;

    .line 1598
    .line 1599
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1600
    .line 1601
    .line 1602
    goto :goto_b

    .line 1603
    :cond_21
    sget-object v2, La/og2;->a:La/og2;

    .line 1604
    .line 1605
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v1

    .line 1609
    if-eqz v1, :cond_22

    .line 1610
    .line 1611
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v1

    .line 1615
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v0}, La/g5b;->Q0()La/k3t0;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v1

    .line 1625
    sget-object v2, La/p4b;->a:La/p4b;

    .line 1626
    .line 1627
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1628
    .line 1629
    .line 1630
    :goto_b
    invoke-virtual {v0}, La/g5b;->T0()La/k3t0;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    sget-object v1, La/qf2;->a:La/qf2;

    .line 1635
    .line 1636
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1637
    .line 1638
    .line 1639
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1640
    .line 1641
    goto :goto_c

    .line 1642
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1643
    .line 1644
    .line 1645
    :goto_c
    return-object v13

    .line 1646
    :pswitch_10
    move-object/from16 v1, p1

    .line 1647
    .line 1648
    check-cast v1, La/qa0;

    .line 1649
    .line 1650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1651
    .line 1652
    .line 1653
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1654
    .line 1655
    check-cast v0, La/k3t0;

    .line 1656
    .line 1657
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1658
    .line 1659
    .line 1660
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1661
    .line 1662
    return-object v0

    .line 1663
    :pswitch_11
    move-object/from16 v1, p1

    .line 1664
    .line 1665
    check-cast v1, La/ip1;

    .line 1666
    .line 1667
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1671
    .line 1672
    move-object v4, v0

    .line 1673
    check-cast v4, La/g5b;

    .line 1674
    .line 1675
    sget-object v0, La/g5b;->c2:La/gl5;

    .line 1676
    .line 1677
    instance-of v0, v1, La/hp1;

    .line 1678
    .line 1679
    if-eqz v0, :cond_23

    .line 1680
    .line 1681
    iget-object v0, v4, La/g5b;->O1:La/a8z;

    .line 1682
    .line 1683
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v0

    .line 1687
    check-cast v0, La/k7i;

    .line 1688
    .line 1689
    iget-object v2, v0, La/k7i;->r:La/wdk0;

    .line 1690
    .line 1691
    new-instance v3, La/xdk0;

    .line 1692
    .line 1693
    sget-object v6, La/rek0;->b:La/rek0;

    .line 1694
    .line 1695
    check-cast v1, La/hp1;

    .line 1696
    .line 1697
    iget-object v7, v1, La/hp1;->a:Ljava/lang/String;

    .line 1698
    .line 1699
    const/4 v11, 0x0

    .line 1700
    const/16 v12, 0x7c

    .line 1701
    .line 1702
    const/4 v8, 0x0

    .line 1703
    const/4 v9, 0x0

    .line 1704
    const/4 v10, 0x0

    .line 1705
    move-object v5, v3

    .line 1706
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1707
    .line 1708
    .line 1709
    const/16 v9, 0x3fc

    .line 1710
    .line 1711
    const/4 v5, 0x0

    .line 1712
    const/4 v6, 0x0

    .line 1713
    const/4 v7, 0x0

    .line 1714
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1715
    .line 1716
    .line 1717
    goto :goto_d

    .line 1718
    :cond_23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1719
    .line 1720
    .line 1721
    sget-object v0, La/gp1;->a:La/gp1;

    .line 1722
    .line 1723
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1724
    .line 1725
    .line 1726
    move-result v0

    .line 1727
    if-eqz v0, :cond_24

    .line 1728
    .line 1729
    const-string v0, "REMOVE_ALL_FAVORITES_AGGREGATOR_RESULT"

    .line 1730
    .line 1731
    invoke-virtual {v4, v0}, La/g5b;->Y0(Ljava/lang/String;)V

    .line 1732
    .line 1733
    .line 1734
    :goto_d
    invoke-virtual {v4}, La/g5b;->O0()La/k3t0;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    sget-object v1, La/fa0;->a:La/fa0;

    .line 1739
    .line 1740
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1741
    .line 1742
    .line 1743
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1744
    .line 1745
    goto :goto_e

    .line 1746
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1747
    .line 1748
    .line 1749
    :goto_e
    return-object v13

    .line 1750
    :pswitch_12
    move-object/from16 v1, p1

    .line 1751
    .line 1752
    check-cast v1, La/a570;

    .line 1753
    .line 1754
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1755
    .line 1756
    .line 1757
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1758
    .line 1759
    check-cast v0, La/yya;

    .line 1760
    .line 1761
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1762
    .line 1763
    .line 1764
    iget-object v2, v0, La/yya;->n:Ljava/util/ArrayList;

    .line 1765
    .line 1766
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    move-result v3

    .line 1770
    if-eqz v3, :cond_25

    .line 1771
    .line 1772
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1773
    .line 1774
    .line 1775
    goto :goto_f

    .line 1776
    :cond_25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1777
    .line 1778
    .line 1779
    move-result v3

    .line 1780
    move/from16 v4, v18

    .line 1781
    .line 1782
    if-ge v3, v4, :cond_26

    .line 1783
    .line 1784
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1785
    .line 1786
    .line 1787
    :cond_26
    :goto_f
    iget-object v1, v0, La/yya;->u:La/p7m0;

    .line 1788
    .line 1789
    :cond_27
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v0

    .line 1793
    move-object v3, v0

    .line 1794
    check-cast v3, La/wya;

    .line 1795
    .line 1796
    iget-object v4, v3, La/wya;->a:Ljava/util/List;

    .line 1797
    .line 1798
    new-instance v5, Ljava/util/ArrayList;

    .line 1799
    .line 1800
    const/16 v6, 0xa

    .line 1801
    .line 1802
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1803
    .line 1804
    .line 1805
    move-result v6

    .line 1806
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1807
    .line 1808
    .line 1809
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v4

    .line 1813
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1814
    .line 1815
    .line 1816
    move-result v6

    .line 1817
    if-eqz v6, :cond_2a

    .line 1818
    .line 1819
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v6

    .line 1823
    check-cast v6, La/i1b;

    .line 1824
    .line 1825
    iget-object v7, v6, La/i1b;->a:La/a570;

    .line 1826
    .line 1827
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v7

    .line 1831
    if-nez v7, :cond_29

    .line 1832
    .line 1833
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1834
    .line 1835
    .line 1836
    move-result v8

    .line 1837
    const/4 v9, 0x2

    .line 1838
    if-ge v8, v9, :cond_28

    .line 1839
    .line 1840
    goto :goto_11

    .line 1841
    :cond_28
    const/4 v8, 0x0

    .line 1842
    goto :goto_12

    .line 1843
    :cond_29
    :goto_11
    const/4 v8, 0x1

    .line 1844
    :goto_12
    invoke-static {v6, v8, v7}, La/i1b;->c(La/i1b;ZZ)La/i1b;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v6

    .line 1848
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1849
    .line 1850
    .line 1851
    goto :goto_10

    .line 1852
    :cond_2a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1853
    .line 1854
    .line 1855
    move-result v4

    .line 1856
    const/4 v6, 0x4

    .line 1857
    invoke-static {v3, v5, v4, v13, v6}, La/wya;->a(La/wya;Ljava/util/ArrayList;ILjava/lang/String;I)La/wya;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v3

    .line 1861
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1862
    .line 1863
    .line 1864
    move-result v0

    .line 1865
    if-eqz v0, :cond_27

    .line 1866
    .line 1867
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1868
    .line 1869
    return-object v0

    .line 1870
    :pswitch_13
    move-object/from16 v1, p1

    .line 1871
    .line 1872
    check-cast v1, La/txa;

    .line 1873
    .line 1874
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1875
    .line 1876
    .line 1877
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1878
    .line 1879
    check-cast v0, La/k3t0;

    .line 1880
    .line 1881
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1882
    .line 1883
    .line 1884
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1885
    .line 1886
    return-object v0

    .line 1887
    :pswitch_14
    move-object/from16 v1, p1

    .line 1888
    .line 1889
    check-cast v1, La/uta;

    .line 1890
    .line 1891
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1892
    .line 1893
    .line 1894
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1895
    .line 1896
    check-cast v0, La/k3t0;

    .line 1897
    .line 1898
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1899
    .line 1900
    .line 1901
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1902
    .line 1903
    return-object v0

    .line 1904
    :pswitch_15
    move-object/from16 v1, p1

    .line 1905
    .line 1906
    check-cast v1, La/kua;

    .line 1907
    .line 1908
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1909
    .line 1910
    .line 1911
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1912
    .line 1913
    move-object v4, v0

    .line 1914
    check-cast v4, La/bua;

    .line 1915
    .line 1916
    sget-object v0, La/bua;->Q1:La/gl5;

    .line 1917
    .line 1918
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1919
    .line 1920
    .line 1921
    instance-of v0, v1, La/jua;

    .line 1922
    .line 1923
    const-string v2, "actionDialogManager"

    .line 1924
    .line 1925
    const v3, 0x7f1303fb

    .line 1926
    .line 1927
    .line 1928
    if-eqz v0, :cond_2c

    .line 1929
    .line 1930
    iget-object v0, v4, La/bua;->M1:La/ii;

    .line 1931
    .line 1932
    if-eqz v0, :cond_2b

    .line 1933
    .line 1934
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1935
    .line 1936
    invoke-virtual {v4, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v21

    .line 1940
    const v1, 0x7f131169

    .line 1941
    .line 1942
    .line 1943
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v22

    .line 1947
    const v1, 0x7f130e5d

    .line 1948
    .line 1949
    .line 1950
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v23

    .line 1954
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1955
    .line 1956
    .line 1957
    const v6, 0x7f13032f

    .line 1958
    .line 1959
    .line 1960
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v24

    .line 1964
    sget-object v29, La/n12;->a:La/n12;

    .line 1965
    .line 1966
    const/16 v30, 0x0

    .line 1967
    .line 1968
    const/16 v31, 0x5d0

    .line 1969
    .line 1970
    const/16 v25, 0x0

    .line 1971
    .line 1972
    const-string v26, "REQUEST_RESET_CONFIRM_DIALOG_KEY"

    .line 1973
    .line 1974
    const/16 v27, 0x0

    .line 1975
    .line 1976
    const/16 v28, 0x0

    .line 1977
    .line 1978
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1979
    .line 1980
    .line 1981
    move-object/from16 v1, v20

    .line 1982
    .line 1983
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v2

    .line 1987
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1988
    .line 1989
    .line 1990
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1991
    .line 1992
    .line 1993
    goto/16 :goto_13

    .line 1994
    .line 1995
    :cond_2b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1996
    .line 1997
    .line 1998
    throw v13

    .line 1999
    :cond_2c
    instance-of v0, v1, La/iua;

    .line 2000
    .line 2001
    if-eqz v0, :cond_2e

    .line 2002
    .line 2003
    iget-object v0, v4, La/bua;->M1:La/ii;

    .line 2004
    .line 2005
    if-eqz v0, :cond_2d

    .line 2006
    .line 2007
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2008
    .line 2009
    invoke-virtual {v4, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v21

    .line 2013
    const v1, 0x7f13047e

    .line 2014
    .line 2015
    .line 2016
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v22

    .line 2020
    const v1, 0x7f130a86

    .line 2021
    .line 2022
    .line 2023
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v23

    .line 2027
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2028
    .line 2029
    .line 2030
    const v6, 0x7f13032f

    .line 2031
    .line 2032
    .line 2033
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v24

    .line 2037
    sget-object v29, La/n12;->a:La/n12;

    .line 2038
    .line 2039
    const/16 v30, 0x0

    .line 2040
    .line 2041
    const/16 v31, 0x5d0

    .line 2042
    .line 2043
    const/16 v25, 0x0

    .line 2044
    .line 2045
    const-string v26, "REQUEST_EXIT_CONFIRM_DIALOG_KEY"

    .line 2046
    .line 2047
    const/16 v27, 0x0

    .line 2048
    .line 2049
    const/16 v28, 0x0

    .line 2050
    .line 2051
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2052
    .line 2053
    .line 2054
    move-object/from16 v1, v20

    .line 2055
    .line 2056
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v2

    .line 2060
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2061
    .line 2062
    .line 2063
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2064
    .line 2065
    .line 2066
    goto :goto_13

    .line 2067
    :cond_2d
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2068
    .line 2069
    .line 2070
    throw v13

    .line 2071
    :cond_2e
    instance-of v0, v1, La/hua;

    .line 2072
    .line 2073
    if-eqz v0, :cond_30

    .line 2074
    .line 2075
    iget-object v2, v4, La/bua;->N1:La/wdk0;

    .line 2076
    .line 2077
    if-eqz v2, :cond_2f

    .line 2078
    .line 2079
    new-instance v3, La/xdk0;

    .line 2080
    .line 2081
    sget-object v6, La/qek0;->a:La/qek0;

    .line 2082
    .line 2083
    const v0, 0x7f130423

    .line 2084
    .line 2085
    .line 2086
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v7

    .line 2090
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2091
    .line 2092
    .line 2093
    const/4 v11, 0x0

    .line 2094
    const/16 v12, 0x7c

    .line 2095
    .line 2096
    const/4 v8, 0x0

    .line 2097
    const/4 v9, 0x0

    .line 2098
    const/4 v10, 0x0

    .line 2099
    move-object v5, v3

    .line 2100
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2101
    .line 2102
    .line 2103
    const/16 v9, 0x3fc

    .line 2104
    .line 2105
    const/4 v5, 0x0

    .line 2106
    const/4 v6, 0x0

    .line 2107
    const/4 v7, 0x0

    .line 2108
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2109
    .line 2110
    .line 2111
    :goto_13
    invoke-virtual {v4}, La/bua;->G0()La/k3t0;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v0

    .line 2115
    sget-object v1, La/nta;->a:La/nta;

    .line 2116
    .line 2117
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2118
    .line 2119
    .line 2120
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2121
    .line 2122
    goto :goto_14

    .line 2123
    :cond_2f
    const-string v0, "snackbarManager"

    .line 2124
    .line 2125
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2126
    .line 2127
    .line 2128
    throw v13

    .line 2129
    :cond_30
    invoke-static {}, La/t9f;->b()V

    .line 2130
    .line 2131
    .line 2132
    :goto_14
    return-object v13

    .line 2133
    :pswitch_16
    move-object/from16 v1, p1

    .line 2134
    .line 2135
    check-cast v1, La/qra;

    .line 2136
    .line 2137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2138
    .line 2139
    .line 2140
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2141
    .line 2142
    check-cast v0, La/k3t0;

    .line 2143
    .line 2144
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2145
    .line 2146
    .line 2147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2148
    .line 2149
    return-object v0

    .line 2150
    :pswitch_17
    move-object/from16 v1, p1

    .line 2151
    .line 2152
    check-cast v1, La/fsa;

    .line 2153
    .line 2154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2155
    .line 2156
    .line 2157
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2158
    .line 2159
    check-cast v0, La/xra;

    .line 2160
    .line 2161
    sget-object v2, La/xra;->X1:La/cl5;

    .line 2162
    .line 2163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2164
    .line 2165
    .line 2166
    instance-of v2, v1, La/bsa;

    .line 2167
    .line 2168
    if-eqz v2, :cond_36

    .line 2169
    .line 2170
    check-cast v1, La/bsa;

    .line 2171
    .line 2172
    iget-object v1, v1, La/bsa;->a:La/dta;

    .line 2173
    .line 2174
    instance-of v2, v1, La/ysa;

    .line 2175
    .line 2176
    if-eqz v2, :cond_31

    .line 2177
    .line 2178
    invoke-virtual {v0}, La/xra;->P0()La/k3t0;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v1

    .line 2182
    invoke-virtual {v1, v10}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2183
    .line 2184
    .line 2185
    goto/16 :goto_15

    .line 2186
    .line 2187
    :cond_31
    instance-of v2, v1, La/zsa;

    .line 2188
    .line 2189
    if-eqz v2, :cond_32

    .line 2190
    .line 2191
    invoke-virtual {v0}, La/xra;->Q0()La/k3t0;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v1

    .line 2195
    invoke-virtual {v1, v9}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2196
    .line 2197
    .line 2198
    goto/16 :goto_15

    .line 2199
    .line 2200
    :cond_32
    instance-of v2, v1, La/ata;

    .line 2201
    .line 2202
    if-eqz v2, :cond_33

    .line 2203
    .line 2204
    invoke-virtual {v0}, La/xra;->R0()La/k3t0;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v1

    .line 2208
    invoke-virtual {v1, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2209
    .line 2210
    .line 2211
    goto/16 :goto_15

    .line 2212
    .line 2213
    :cond_33
    instance-of v2, v1, La/bta;

    .line 2214
    .line 2215
    if-eqz v2, :cond_34

    .line 2216
    .line 2217
    invoke-virtual {v0}, La/xra;->M0()La/k3t0;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v1

    .line 2221
    invoke-virtual {v1, v15}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2222
    .line 2223
    .line 2224
    goto/16 :goto_15

    .line 2225
    .line 2226
    :cond_34
    instance-of v1, v1, La/cta;

    .line 2227
    .line 2228
    if-eqz v1, :cond_35

    .line 2229
    .line 2230
    invoke-virtual {v0}, La/xra;->S0()La/k3t0;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v1

    .line 2234
    invoke-virtual {v1, v14}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2235
    .line 2236
    .line 2237
    goto/16 :goto_15

    .line 2238
    .line 2239
    :cond_35
    invoke-static {}, La/t9f;->b()V

    .line 2240
    .line 2241
    .line 2242
    goto/16 :goto_16

    .line 2243
    .line 2244
    :cond_36
    instance-of v2, v1, La/dsa;

    .line 2245
    .line 2246
    if-eqz v2, :cond_37

    .line 2247
    .line 2248
    iget-object v2, v0, La/xra;->Q1:La/a8z;

    .line 2249
    .line 2250
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v2

    .line 2254
    check-cast v2, La/k3t0;

    .line 2255
    .line 2256
    new-instance v3, La/wl2;

    .line 2257
    .line 2258
    check-cast v1, La/dsa;

    .line 2259
    .line 2260
    iget-object v1, v1, La/dsa;->a:La/ih2;

    .line 2261
    .line 2262
    iget-byte v1, v1, La/ih2;->a:B

    .line 2263
    .line 2264
    int-to-long v4, v1

    .line 2265
    invoke-direct {v3, v4, v5}, La/wl2;-><init>(J)V

    .line 2266
    .line 2267
    .line 2268
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2269
    .line 2270
    .line 2271
    goto/16 :goto_15

    .line 2272
    .line 2273
    :cond_37
    instance-of v2, v1, La/csa;

    .line 2274
    .line 2275
    if-eqz v2, :cond_38

    .line 2276
    .line 2277
    invoke-virtual {v0}, La/xra;->P0()La/k3t0;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v2

    .line 2281
    check-cast v1, La/csa;

    .line 2282
    .line 2283
    iget-object v1, v1, La/csa;->a:Ljava/lang/String;

    .line 2284
    .line 2285
    new-instance v3, La/dg2;

    .line 2286
    .line 2287
    invoke-direct {v3, v1}, La/dg2;-><init>(Ljava/lang/String;)V

    .line 2288
    .line 2289
    .line 2290
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2291
    .line 2292
    .line 2293
    goto :goto_15

    .line 2294
    :cond_38
    instance-of v2, v1, La/zra;

    .line 2295
    .line 2296
    if-eqz v2, :cond_39

    .line 2297
    .line 2298
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2299
    .line 2300
    .line 2301
    move-result-object v1

    .line 2302
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 2303
    .line 2304
    .line 2305
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 2306
    .line 2307
    .line 2308
    goto :goto_15

    .line 2309
    :cond_39
    instance-of v2, v1, La/asa;

    .line 2310
    .line 2311
    if-eqz v2, :cond_3a

    .line 2312
    .line 2313
    check-cast v1, La/asa;

    .line 2314
    .line 2315
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v2

    .line 2319
    iget-object v2, v2, La/pbi;->b:La/itr;

    .line 2320
    .line 2321
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v2

    .line 2325
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2326
    .line 2327
    .line 2328
    iget-object v1, v1, La/asa;->a:La/sjd;

    .line 2329
    .line 2330
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 2331
    .line 2332
    .line 2333
    goto :goto_15

    .line 2334
    :cond_3a
    sget-object v2, La/esa;->a:La/esa;

    .line 2335
    .line 2336
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2337
    .line 2338
    .line 2339
    move-result v1

    .line 2340
    if-eqz v1, :cond_3c

    .line 2341
    .line 2342
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v1

    .line 2346
    iget-object v1, v1, La/pbi;->a:La/poq0;

    .line 2347
    .line 2348
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v1

    .line 2352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2353
    .line 2354
    .line 2355
    sget-object v2, La/fk60;->b:La/uuz;

    .line 2356
    .line 2357
    sget-object v2, La/ki60;->q2:La/htz;

    .line 2358
    .line 2359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2360
    .line 2361
    .line 2362
    invoke-virtual {v1, v11}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v2

    .line 2366
    if-nez v2, :cond_3b

    .line 2367
    .line 2368
    new-instance v2, La/ki60;

    .line 2369
    .line 2370
    invoke-direct {v2}, La/ki60;-><init>()V

    .line 2371
    .line 2372
    .line 2373
    sget-object v3, La/ki60;->r2:[La/iiy;

    .line 2374
    .line 2375
    const/16 v21, 0x1

    .line 2376
    .line 2377
    aget-object v4, v3, v21

    .line 2378
    .line 2379
    iget-object v5, v2, La/ki60;->n2:La/zz2;

    .line 2380
    .line 2381
    const/16 v6, 0x20

    .line 2382
    .line 2383
    invoke-virtual {v5, v2, v4, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2384
    .line 2385
    .line 2386
    iget-object v4, v2, La/ki60;->o2:La/phf0;

    .line 2387
    .line 2388
    const/16 v18, 0x2

    .line 2389
    .line 2390
    aget-object v3, v3, v18

    .line 2391
    .line 2392
    invoke-virtual {v4, v2, v3, v12}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2393
    .line 2394
    .line 2395
    invoke-static {v2, v1, v11}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2396
    .line 2397
    .line 2398
    :cond_3b
    :goto_15
    invoke-virtual {v0}, La/xra;->O0()La/k3t0;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v0

    .line 2402
    sget-object v1, La/dra;->a:La/dra;

    .line 2403
    .line 2404
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2405
    .line 2406
    .line 2407
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2408
    .line 2409
    goto :goto_16

    .line 2410
    :cond_3c
    invoke-static {}, La/t9f;->b()V

    .line 2411
    .line 2412
    .line 2413
    :goto_16
    return-object v13

    .line 2414
    :pswitch_18
    move-object/from16 v1, p1

    .line 2415
    .line 2416
    check-cast v1, La/wm2;

    .line 2417
    .line 2418
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2419
    .line 2420
    .line 2421
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2422
    .line 2423
    check-cast v0, La/k3t0;

    .line 2424
    .line 2425
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2426
    .line 2427
    .line 2428
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2429
    .line 2430
    return-object v0

    .line 2431
    :pswitch_19
    move-object/from16 v1, p1

    .line 2432
    .line 2433
    check-cast v1, La/jn2;

    .line 2434
    .line 2435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2436
    .line 2437
    .line 2438
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2439
    .line 2440
    check-cast v0, La/xra;

    .line 2441
    .line 2442
    sget-object v2, La/xra;->X1:La/cl5;

    .line 2443
    .line 2444
    sget-object v17, La/rek0;->b:La/rek0;

    .line 2445
    .line 2446
    instance-of v2, v1, La/fn2;

    .line 2447
    .line 2448
    if-eqz v2, :cond_3d

    .line 2449
    .line 2450
    iget-object v2, v0, La/xra;->N1:La/a8z;

    .line 2451
    .line 2452
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v2

    .line 2456
    check-cast v2, La/qgi;

    .line 2457
    .line 2458
    iget-object v2, v2, La/qgi;->P:La/itr;

    .line 2459
    .line 2460
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v2

    .line 2464
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2465
    .line 2466
    .line 2467
    check-cast v1, La/fn2;

    .line 2468
    .line 2469
    iget-object v1, v1, La/fn2;->a:La/sjd;

    .line 2470
    .line 2471
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 2472
    .line 2473
    .line 2474
    :goto_17
    move-object/from16 v18, v0

    .line 2475
    .line 2476
    goto :goto_18

    .line 2477
    :cond_3d
    instance-of v2, v1, La/gn2;

    .line 2478
    .line 2479
    if-eqz v2, :cond_3e

    .line 2480
    .line 2481
    iget-object v1, v0, La/xra;->N1:La/a8z;

    .line 2482
    .line 2483
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v1

    .line 2487
    check-cast v1, La/qgi;

    .line 2488
    .line 2489
    iget-object v1, v1, La/qgi;->R:La/wdk0;

    .line 2490
    .line 2491
    new-instance v16, La/xdk0;

    .line 2492
    .line 2493
    const v2, 0x7f13096f

    .line 2494
    .line 2495
    .line 2496
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2497
    .line 2498
    .line 2499
    move-result-object v18

    .line 2500
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2501
    .line 2502
    .line 2503
    const/16 v22, 0x0

    .line 2504
    .line 2505
    const/16 v23, 0x7c

    .line 2506
    .line 2507
    const/16 v19, 0x0

    .line 2508
    .line 2509
    const/16 v20, 0x0

    .line 2510
    .line 2511
    const/16 v21, 0x0

    .line 2512
    .line 2513
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2514
    .line 2515
    .line 2516
    const/16 v23, 0x3fc

    .line 2517
    .line 2518
    const/16 v21, 0x0

    .line 2519
    .line 2520
    move-object/from16 v18, v0

    .line 2521
    .line 2522
    move-object/from16 v17, v16

    .line 2523
    .line 2524
    move-object/from16 v16, v1

    .line 2525
    .line 2526
    invoke-static/range {v16 .. v23}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2527
    .line 2528
    .line 2529
    goto :goto_18

    .line 2530
    :cond_3e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2531
    .line 2532
    .line 2533
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2534
    .line 2535
    .line 2536
    move-result v2

    .line 2537
    if-eqz v2, :cond_3f

    .line 2538
    .line 2539
    invoke-virtual {v0, v7}, La/xra;->T0(Ljava/lang/String;)V

    .line 2540
    .line 2541
    .line 2542
    goto :goto_17

    .line 2543
    :cond_3f
    instance-of v2, v1, La/in2;

    .line 2544
    .line 2545
    if-eqz v2, :cond_40

    .line 2546
    .line 2547
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2548
    .line 2549
    .line 2550
    move-result-object v2

    .line 2551
    iget-object v2, v2, La/pbi;->f:La/wdk0;

    .line 2552
    .line 2553
    new-instance v16, La/xdk0;

    .line 2554
    .line 2555
    check-cast v1, La/in2;

    .line 2556
    .line 2557
    iget-object v1, v1, La/in2;->a:Ljava/lang/String;

    .line 2558
    .line 2559
    const/16 v22, 0x0

    .line 2560
    .line 2561
    const/16 v23, 0x7c

    .line 2562
    .line 2563
    const/16 v19, 0x0

    .line 2564
    .line 2565
    const/16 v20, 0x0

    .line 2566
    .line 2567
    const/16 v21, 0x0

    .line 2568
    .line 2569
    move-object/from16 v18, v1

    .line 2570
    .line 2571
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2572
    .line 2573
    .line 2574
    const/16 v23, 0x3fc

    .line 2575
    .line 2576
    const/16 v21, 0x0

    .line 2577
    .line 2578
    move-object/from16 v18, v0

    .line 2579
    .line 2580
    move-object/from16 v17, v16

    .line 2581
    .line 2582
    move-object/from16 v16, v2

    .line 2583
    .line 2584
    invoke-static/range {v16 .. v23}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2585
    .line 2586
    .line 2587
    :goto_18
    invoke-virtual/range {v18 .. v18}, La/xra;->S0()La/k3t0;

    .line 2588
    .line 2589
    .line 2590
    move-result-object v0

    .line 2591
    invoke-virtual {v0, v6}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2592
    .line 2593
    .line 2594
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2595
    .line 2596
    goto :goto_19

    .line 2597
    :cond_40
    invoke-static {}, La/t9f;->b()V

    .line 2598
    .line 2599
    .line 2600
    :goto_19
    return-object v13

    .line 2601
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2602
    .line 2603
    check-cast v1, La/xk2;

    .line 2604
    .line 2605
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2606
    .line 2607
    .line 2608
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2609
    .line 2610
    check-cast v0, La/k3t0;

    .line 2611
    .line 2612
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2613
    .line 2614
    .line 2615
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2616
    .line 2617
    return-object v0

    .line 2618
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2619
    .line 2620
    check-cast v1, La/ml2;

    .line 2621
    .line 2622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2623
    .line 2624
    .line 2625
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2626
    .line 2627
    check-cast v0, La/xra;

    .line 2628
    .line 2629
    sget-object v3, La/xra;->X1:La/cl5;

    .line 2630
    .line 2631
    instance-of v3, v1, La/fl2;

    .line 2632
    .line 2633
    if-eqz v3, :cond_41

    .line 2634
    .line 2635
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v2

    .line 2639
    iget-object v2, v2, La/pbi;->b:La/itr;

    .line 2640
    .line 2641
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 2642
    .line 2643
    .line 2644
    move-result-object v2

    .line 2645
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2646
    .line 2647
    .line 2648
    check-cast v1, La/fl2;

    .line 2649
    .line 2650
    iget-object v1, v1, La/fl2;->a:La/sjd;

    .line 2651
    .line 2652
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 2653
    .line 2654
    .line 2655
    goto/16 :goto_1a

    .line 2656
    .line 2657
    :cond_41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2658
    .line 2659
    .line 2660
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2661
    .line 2662
    .line 2663
    move-result v3

    .line 2664
    if-eqz v3, :cond_42

    .line 2665
    .line 2666
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v1

    .line 2670
    iget-object v1, v1, La/pbi;->g:La/e720;

    .line 2671
    .line 2672
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2673
    .line 2674
    .line 2675
    move-result-object v2

    .line 2676
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2677
    .line 2678
    .line 2679
    invoke-virtual {v1, v2}, La/e720;->a(Landroidx/fragment/app/e;)V

    .line 2680
    .line 2681
    .line 2682
    goto/16 :goto_1a

    .line 2683
    .line 2684
    :cond_42
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2685
    .line 2686
    .line 2687
    move-result v3

    .line 2688
    if-eqz v3, :cond_43

    .line 2689
    .line 2690
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v1

    .line 2694
    iget-object v1, v1, La/pbi;->f:La/wdk0;

    .line 2695
    .line 2696
    new-instance v2, La/xdk0;

    .line 2697
    .line 2698
    sget-object v3, La/pek0;->a:La/pek0;

    .line 2699
    .line 2700
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2701
    .line 2702
    .line 2703
    move-result-object v4

    .line 2704
    iget-object v4, v4, La/pbi;->e:La/ctf0;

    .line 2705
    .line 2706
    const/4 v5, 0x0

    .line 2707
    new-array v6, v5, [Ljava/lang/Object;

    .line 2708
    .line 2709
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 2710
    .line 2711
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2712
    .line 2713
    .line 2714
    move-result-object v5

    .line 2715
    const v6, 0x7f1301ac

    .line 2716
    .line 2717
    .line 2718
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2719
    .line 2720
    .line 2721
    move-result-object v4

    .line 2722
    const/4 v8, 0x0

    .line 2723
    const/16 v9, 0x7c

    .line 2724
    .line 2725
    const/4 v5, 0x0

    .line 2726
    const/4 v6, 0x0

    .line 2727
    const/4 v7, 0x0

    .line 2728
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2729
    .line 2730
    .line 2731
    const/16 v27, 0x0

    .line 2732
    .line 2733
    const/16 v28, 0x3ec

    .line 2734
    .line 2735
    const/16 v24, 0x0

    .line 2736
    .line 2737
    const/16 v25, 0x0

    .line 2738
    .line 2739
    const/16 v26, 0x1

    .line 2740
    .line 2741
    move-object/from16 v23, v0

    .line 2742
    .line 2743
    move-object/from16 v21, v1

    .line 2744
    .line 2745
    move-object/from16 v22, v2

    .line 2746
    .line 2747
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2748
    .line 2749
    .line 2750
    goto/16 :goto_1a

    .line 2751
    .line 2752
    :cond_43
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2753
    .line 2754
    .line 2755
    move-result v2

    .line 2756
    if-eqz v2, :cond_44

    .line 2757
    .line 2758
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v1

    .line 2762
    iget-object v1, v1, La/pbi;->d:La/ii;

    .line 2763
    .line 2764
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2765
    .line 2766
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2767
    .line 2768
    .line 2769
    move-result-object v3

    .line 2770
    iget-object v3, v3, La/pbi;->e:La/ctf0;

    .line 2771
    .line 2772
    const/4 v5, 0x0

    .line 2773
    new-array v4, v5, [Ljava/lang/Object;

    .line 2774
    .line 2775
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 2776
    .line 2777
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v4

    .line 2781
    const v6, 0x7f130ed5

    .line 2782
    .line 2783
    .line 2784
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v3

    .line 2788
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v4

    .line 2792
    iget-object v4, v4, La/pbi;->e:La/ctf0;

    .line 2793
    .line 2794
    new-array v6, v5, [Ljava/lang/Object;

    .line 2795
    .line 2796
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 2797
    .line 2798
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v6

    .line 2802
    const v7, 0x7f130ed4

    .line 2803
    .line 2804
    .line 2805
    invoke-virtual {v4, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v4

    .line 2809
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v6

    .line 2813
    iget-object v6, v6, La/pbi;->e:La/ctf0;

    .line 2814
    .line 2815
    new-array v7, v5, [Ljava/lang/Object;

    .line 2816
    .line 2817
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 2818
    .line 2819
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2820
    .line 2821
    .line 2822
    move-result-object v5

    .line 2823
    const v7, 0x7f130e5c

    .line 2824
    .line 2825
    .line 2826
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2827
    .line 2828
    .line 2829
    move-result-object v5

    .line 2830
    sget-object v11, La/n12;->a:La/n12;

    .line 2831
    .line 2832
    const/4 v12, 0x0

    .line 2833
    const/16 v13, 0x5f8

    .line 2834
    .line 2835
    const/4 v6, 0x0

    .line 2836
    const/4 v7, 0x0

    .line 2837
    const/4 v8, 0x0

    .line 2838
    const/4 v9, 0x0

    .line 2839
    const/4 v10, 0x0

    .line 2840
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2841
    .line 2842
    .line 2843
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v3

    .line 2847
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2848
    .line 2849
    .line 2850
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2851
    .line 2852
    .line 2853
    goto/16 :goto_1a

    .line 2854
    .line 2855
    :cond_44
    sget-object v2, La/ll2;->a:La/ll2;

    .line 2856
    .line 2857
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2858
    .line 2859
    .line 2860
    move-result v2

    .line 2861
    if-eqz v2, :cond_45

    .line 2862
    .line 2863
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2864
    .line 2865
    .line 2866
    move-result-object v1

    .line 2867
    iget-object v1, v1, La/pbi;->d:La/ii;

    .line 2868
    .line 2869
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2870
    .line 2871
    const v3, 0x7f131151

    .line 2872
    .line 2873
    .line 2874
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v4

    .line 2878
    const v5, 0x7f130514

    .line 2879
    .line 2880
    .line 2881
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v5

    .line 2885
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2886
    .line 2887
    .line 2888
    move-result-object v3

    .line 2889
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2890
    .line 2891
    .line 2892
    const v6, 0x7f13032f

    .line 2893
    .line 2894
    .line 2895
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2896
    .line 2897
    .line 2898
    move-result-object v6

    .line 2899
    sget-object v11, La/n12;->a:La/n12;

    .line 2900
    .line 2901
    const/4 v12, 0x0

    .line 2902
    const/16 v13, 0x5d0

    .line 2903
    .line 2904
    const/4 v7, 0x0

    .line 2905
    const-string v8, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY"

    .line 2906
    .line 2907
    const/4 v9, 0x0

    .line 2908
    const/4 v10, 0x0

    .line 2909
    move-object/from16 v32, v5

    .line 2910
    .line 2911
    move-object v5, v3

    .line 2912
    move-object v3, v4

    .line 2913
    move-object/from16 v4, v32

    .line 2914
    .line 2915
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2916
    .line 2917
    .line 2918
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v3

    .line 2922
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2923
    .line 2924
    .line 2925
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2926
    .line 2927
    .line 2928
    goto/16 :goto_1a

    .line 2929
    .line 2930
    :cond_45
    sget-object v2, La/jl2;->a:La/jl2;

    .line 2931
    .line 2932
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2933
    .line 2934
    .line 2935
    move-result v2

    .line 2936
    if-eqz v2, :cond_46

    .line 2937
    .line 2938
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2939
    .line 2940
    .line 2941
    move-result-object v1

    .line 2942
    iget-object v1, v1, La/pbi;->d:La/ii;

    .line 2943
    .line 2944
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2945
    .line 2946
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2947
    .line 2948
    .line 2949
    move-result-object v3

    .line 2950
    iget-object v3, v3, La/pbi;->e:La/ctf0;

    .line 2951
    .line 2952
    const/4 v5, 0x0

    .line 2953
    new-array v4, v5, [Ljava/lang/Object;

    .line 2954
    .line 2955
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 2956
    .line 2957
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2958
    .line 2959
    .line 2960
    move-result-object v4

    .line 2961
    const v6, 0x7f130759

    .line 2962
    .line 2963
    .line 2964
    invoke-virtual {v3, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2965
    .line 2966
    .line 2967
    move-result-object v3

    .line 2968
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2969
    .line 2970
    .line 2971
    move-result-object v4

    .line 2972
    iget-object v4, v4, La/pbi;->e:La/ctf0;

    .line 2973
    .line 2974
    new-array v6, v5, [Ljava/lang/Object;

    .line 2975
    .line 2976
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 2977
    .line 2978
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2979
    .line 2980
    .line 2981
    move-result-object v6

    .line 2982
    const v7, 0x7f130758

    .line 2983
    .line 2984
    .line 2985
    invoke-virtual {v4, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v4

    .line 2989
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 2990
    .line 2991
    .line 2992
    move-result-object v6

    .line 2993
    iget-object v6, v6, La/pbi;->e:La/ctf0;

    .line 2994
    .line 2995
    new-array v7, v5, [Ljava/lang/Object;

    .line 2996
    .line 2997
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 2998
    .line 2999
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3000
    .line 3001
    .line 3002
    move-result-object v5

    .line 3003
    const v7, 0x7f130e5e

    .line 3004
    .line 3005
    .line 3006
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3007
    .line 3008
    .line 3009
    move-result-object v5

    .line 3010
    sget-object v11, La/n12;->a:La/n12;

    .line 3011
    .line 3012
    const/4 v12, 0x0

    .line 3013
    const/16 v13, 0x5f8

    .line 3014
    .line 3015
    const/4 v6, 0x0

    .line 3016
    const/4 v7, 0x0

    .line 3017
    const/4 v8, 0x0

    .line 3018
    const/4 v9, 0x0

    .line 3019
    const/4 v10, 0x0

    .line 3020
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3021
    .line 3022
    .line 3023
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3024
    .line 3025
    .line 3026
    move-result-object v3

    .line 3027
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3028
    .line 3029
    .line 3030
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3031
    .line 3032
    .line 3033
    goto :goto_1a

    .line 3034
    :cond_46
    instance-of v2, v1, La/kl2;

    .line 3035
    .line 3036
    if-eqz v2, :cond_47

    .line 3037
    .line 3038
    check-cast v1, La/kl2;

    .line 3039
    .line 3040
    iget-object v2, v1, La/kl2;->a:La/m0k0;

    .line 3041
    .line 3042
    iget-object v1, v1, La/kl2;->b:La/m97;

    .line 3043
    .line 3044
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 3045
    .line 3046
    .line 3047
    move-result-object v3

    .line 3048
    iget-object v3, v3, La/pbi;->g:La/e720;

    .line 3049
    .line 3050
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3051
    .line 3052
    .line 3053
    move-result-object v4

    .line 3054
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3055
    .line 3056
    .line 3057
    new-instance v5, La/fq2;

    .line 3058
    .line 3059
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 3060
    .line 3061
    .line 3062
    invoke-virtual {v3, v4, v1, v2, v5}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 3063
    .line 3064
    .line 3065
    goto :goto_1a

    .line 3066
    :cond_47
    instance-of v1, v1, La/il2;

    .line 3067
    .line 3068
    if-eqz v1, :cond_48

    .line 3069
    .line 3070
    const-string v1, "REMOVE_ALL_COEF_TRACK_RESULT"

    .line 3071
    .line 3072
    invoke-virtual {v0, v1}, La/xra;->T0(Ljava/lang/String;)V

    .line 3073
    .line 3074
    .line 3075
    :goto_1a
    invoke-virtual {v0}, La/xra;->M0()La/k3t0;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v0

    .line 3079
    sget-object v1, La/hk2;->a:La/hk2;

    .line 3080
    .line 3081
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 3082
    .line 3083
    .line 3084
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3085
    .line 3086
    goto :goto_1b

    .line 3087
    :cond_48
    invoke-static {}, La/t9f;->b()V

    .line 3088
    .line 3089
    .line 3090
    :goto_1b
    return-object v13

    .line 3091
    :pswitch_1c
    move-object/from16 v1, p1

    .line 3092
    .line 3093
    check-cast v1, La/dj2;

    .line 3094
    .line 3095
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3096
    .line 3097
    .line 3098
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 3099
    .line 3100
    check-cast v0, La/k3t0;

    .line 3101
    .line 3102
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 3103
    .line 3104
    .line 3105
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3106
    .line 3107
    return-object v0

    .line 3108
    nop

    .line 3109
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
