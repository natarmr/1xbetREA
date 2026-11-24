.class public final synthetic La/ln1;
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
    iput-byte p7, p0, La/ln1;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ln1;->a:B

    .line 4
    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Throwable;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/qi2;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/qi2;->N(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Throwable;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La/hh2;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/hh2;->S(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    move-object/from16 v1, p1

    .line 46
    .line 47
    check-cast v1, La/ye2;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/k3t0;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object/from16 v1, p1

    .line 63
    .line 64
    check-cast v1, La/cc2;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/ef2;

    .line 72
    .line 73
    sget-object v2, La/ef2;->V1:La/hfk0;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    instance-of v2, v1, La/bc2;

    .line 79
    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    check-cast v1, La/bc2;

    .line 83
    .line 84
    iget-object v1, v1, La/bc2;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, La/ef2;->M0(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    instance-of v2, v1, La/ac2;

    .line 91
    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-instance v3, La/te2;

    .line 99
    .line 100
    check-cast v1, La/ac2;

    .line 101
    .line 102
    iget-boolean v1, v1, La/ac2;->a:Z

    .line 103
    .line 104
    invoke-direct {v3, v1}, La/te2;-><init>(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-virtual {v0}, La/ef2;->J0()La/k3t0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sget-object v1, La/ib2;->a:La/ib2;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 123
    .line 124
    .line 125
    :goto_1
    return-object v3

    .line 126
    :pswitch_3
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, La/zc2;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/ef2;

    .line 136
    .line 137
    sget-object v2, La/ef2;->V1:La/hfk0;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    instance-of v2, v1, La/yc2;

    .line 143
    .line 144
    if-eqz v2, :cond_2

    .line 145
    .line 146
    check-cast v1, La/yc2;

    .line 147
    .line 148
    iget-object v1, v1, La/yc2;->a:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, La/ef2;->M0(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_2
    instance-of v2, v1, La/xc2;

    .line 155
    .line 156
    if-eqz v2, :cond_3

    .line 157
    .line 158
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    new-instance v3, La/te2;

    .line 163
    .line 164
    check-cast v1, La/xc2;

    .line 165
    .line 166
    iget-boolean v1, v1, La/xc2;->a:Z

    .line 167
    .line 168
    invoke-direct {v3, v1}, La/te2;-><init>(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :goto_2
    invoke-virtual {v0}, La/ef2;->K0()La/k3t0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sget-object v1, La/jc2;->a:La/jc2;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 187
    .line 188
    .line 189
    :goto_3
    return-object v3

    .line 190
    :pswitch_4
    move-object/from16 v1, p1

    .line 191
    .line 192
    check-cast v1, La/hf2;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, La/ef2;

    .line 200
    .line 201
    sget-object v4, La/ef2;->V1:La/hfk0;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    instance-of v4, v1, La/gf2;

    .line 207
    .line 208
    if-eqz v4, :cond_4

    .line 209
    .line 210
    check-cast v1, La/gf2;

    .line 211
    .line 212
    iget-object v1, v1, La/gf2;->a:Ljava/util/Date;

    .line 213
    .line 214
    new-instance v3, La/mc;

    .line 215
    .line 216
    invoke-direct {v3, v0, v1, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0, v3}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_4
    sget-object v2, La/ff2;->a:La/ff2;

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_5

    .line 230
    .line 231
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 232
    .line 233
    .line 234
    :goto_4
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    sget-object v1, La/me2;->a:La/me2;

    .line 239
    .line 240
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 247
    .line 248
    .line 249
    :goto_5
    return-object v3

    .line 250
    :pswitch_5
    move-object/from16 v1, p1

    .line 251
    .line 252
    check-cast v1, La/q3g0;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, La/k3t0;

    .line 260
    .line 261
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_6
    move-object/from16 v1, p1

    .line 268
    .line 269
    check-cast v1, La/x3g0;

    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, La/ef2;

    .line 277
    .line 278
    sget-object v2, La/ef2;->V1:La/hfk0;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v2, v0, La/ef2;->N1:La/a8z;

    .line 284
    .line 285
    instance-of v4, v1, La/w3g0;

    .line 286
    .line 287
    if-eqz v4, :cond_6

    .line 288
    .line 289
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    check-cast v3, La/ksi;

    .line 294
    .line 295
    iget-object v3, v3, La/ksi;->b:La/bwl;

    .line 296
    .line 297
    iget-object v3, v3, La/bwl;->a:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, La/dbi;

    .line 300
    .line 301
    invoke-virtual {v3}, La/dbi;->o()La/jw20;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    check-cast v1, La/w3g0;

    .line 306
    .line 307
    iget-object v1, v1, La/w3g0;->a:La/j2g0;

    .line 308
    .line 309
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, La/ksi;

    .line 314
    .line 315
    iget-object v2, v2, La/ksi;->i:La/ctf0;

    .line 316
    .line 317
    invoke-virtual {v3, v0, v2, v1}, La/jw20;->r(Landroidx/fragment/app/Fragment;La/ctf0;La/j2g0;)V

    .line 318
    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_6
    instance-of v2, v1, La/u3g0;

    .line 322
    .line 323
    if-eqz v2, :cond_7

    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_7
    instance-of v2, v1, La/v3g0;

    .line 337
    .line 338
    if-eqz v2, :cond_8

    .line 339
    .line 340
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    new-instance v3, La/ve2;

    .line 345
    .line 346
    sget-object v4, La/b9g0;->a:La/lme0;

    .line 347
    .line 348
    check-cast v1, La/v3g0;

    .line 349
    .line 350
    iget-object v1, v1, La/v3g0;->a:Ljava/lang/String;

    .line 351
    .line 352
    invoke-direct {v3, v1}, La/ve2;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :goto_6
    iget-object v0, v0, La/ef2;->R1:La/a8z;

    .line 359
    .line 360
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, La/k3t0;

    .line 365
    .line 366
    sget-object v1, La/g3g0;->a:La/g3g0;

    .line 367
    .line 368
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 375
    .line 376
    .line 377
    :goto_7
    return-object v3

    .line 378
    :pswitch_7
    move-object/from16 v1, p1

    .line 379
    .line 380
    check-cast v1, La/vc2;

    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v0, La/k3t0;

    .line 388
    .line 389
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_8
    move-object/from16 v1, p1

    .line 396
    .line 397
    check-cast v1, La/ub2;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, La/k3t0;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_9
    move-object/from16 v1, p1

    .line 413
    .line 414
    check-cast v1, Ljava/lang/Throwable;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v0, La/le2;

    .line 422
    .line 423
    iget-object v2, v0, La/le2;->w:La/duj;

    .line 424
    .line 425
    new-instance v3, La/fa2;

    .line 426
    .line 427
    const/4 v4, 0x3

    .line 428
    invoke-direct {v3, v0, v4}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 432
    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_a
    move-object/from16 v1, p1

    .line 438
    .line 439
    check-cast v1, La/sd2;

    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v0, La/k3t0;

    .line 447
    .line 448
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_b
    move-object/from16 v1, p1

    .line 455
    .line 456
    check-cast v1, La/be2;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 462
    .line 463
    move-object v6, v0

    .line 464
    check-cast v6, La/vd2;

    .line 465
    .line 466
    sget-object v0, La/vd2;->R1:La/gfk0;

    .line 467
    .line 468
    instance-of v0, v1, La/zd2;

    .line 469
    .line 470
    if-eqz v0, :cond_9

    .line 471
    .line 472
    iget-object v0, v6, La/vd2;->M1:La/a8z;

    .line 473
    .line 474
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    check-cast v0, La/b8i;

    .line 479
    .line 480
    iget-object v0, v0, La/b8i;->a:La/itr;

    .line 481
    .line 482
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    check-cast v1, La/zd2;

    .line 490
    .line 491
    iget-object v1, v1, La/zd2;->a:La/sjd;

    .line 492
    .line 493
    invoke-virtual {v0, v6, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 494
    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    sget-object v0, La/yd2;->a:La/yd2;

    .line 501
    .line 502
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-eqz v0, :cond_a

    .line 507
    .line 508
    invoke-static {v6}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 509
    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_a
    instance-of v0, v1, La/ae2;

    .line 513
    .line 514
    if-eqz v0, :cond_b

    .line 515
    .line 516
    check-cast v1, La/ae2;

    .line 517
    .line 518
    iget-object v9, v1, La/ae2;->a:Ljava/lang/String;

    .line 519
    .line 520
    iget-object v0, v6, La/vd2;->M1:La/a8z;

    .line 521
    .line 522
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    check-cast v0, La/b8i;

    .line 527
    .line 528
    iget-object v4, v0, La/b8i;->p:La/wdk0;

    .line 529
    .line 530
    new-instance v5, La/xdk0;

    .line 531
    .line 532
    sget-object v8, La/rek0;->b:La/rek0;

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const/16 v14, 0x7c

    .line 536
    .line 537
    const/4 v10, 0x0

    .line 538
    const/4 v11, 0x0

    .line 539
    const/4 v12, 0x0

    .line 540
    move-object v7, v5

    .line 541
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 542
    .line 543
    .line 544
    const/16 v11, 0x3fc

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const/4 v8, 0x0

    .line 548
    const/4 v9, 0x0

    .line 549
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 550
    .line 551
    .line 552
    :goto_8
    iget-object v0, v6, La/vd2;->N1:La/a8z;

    .line 553
    .line 554
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, La/k3t0;

    .line 559
    .line 560
    sget-object v1, La/id2;->a:La/id2;

    .line 561
    .line 562
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 569
    .line 570
    .line 571
    :goto_9
    return-object v3

    .line 572
    :pswitch_c
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, Ljava/lang/Throwable;

    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v0, La/zb2;

    .line 582
    .line 583
    invoke-virtual {v0, v1}, La/zb2;->N(Ljava/lang/Throwable;)V

    .line 584
    .line 585
    .line 586
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object v0

    .line 589
    :pswitch_d
    move-object/from16 v1, p1

    .line 590
    .line 591
    check-cast v1, La/ea2;

    .line 592
    .line 593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, La/k3t0;

    .line 599
    .line 600
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_e
    move-object/from16 v1, p1

    .line 607
    .line 608
    check-cast v1, La/va2;

    .line 609
    .line 610
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v0, La/ia2;

    .line 616
    .line 617
    sget-object v2, La/ia2;->Q1:La/rek0;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    iget-object v2, v0, La/ia2;->N1:La/a8z;

    .line 623
    .line 624
    instance-of v4, v1, La/ua2;

    .line 625
    .line 626
    if-eqz v4, :cond_c

    .line 627
    .line 628
    new-instance v2, La/mc;

    .line 629
    .line 630
    const/16 v3, 0x13

    .line 631
    .line 632
    invoke-direct {v2, v0, v1, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 633
    .line 634
    .line 635
    invoke-static {v0, v2}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 636
    .line 637
    .line 638
    goto :goto_a

    .line 639
    :cond_c
    sget-object v4, La/sa2;->a:La/sa2;

    .line 640
    .line 641
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    if-eqz v4, :cond_d

    .line 646
    .line 647
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 648
    .line 649
    .line 650
    goto :goto_a

    .line 651
    :cond_d
    instance-of v4, v1, La/ta2;

    .line 652
    .line 653
    if-eqz v4, :cond_e

    .line 654
    .line 655
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    check-cast v3, La/wii;

    .line 660
    .line 661
    iget-object v3, v3, La/wii;->k:La/bwl;

    .line 662
    .line 663
    iget-object v3, v3, La/bwl;->a:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v3, La/dbi;

    .line 666
    .line 667
    invoke-virtual {v3}, La/dbi;->o()La/jw20;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    check-cast v1, La/ta2;

    .line 672
    .line 673
    iget-object v1, v1, La/ta2;->a:La/j2g0;

    .line 674
    .line 675
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    check-cast v2, La/wii;

    .line 680
    .line 681
    iget-object v2, v2, La/wii;->h:La/ctf0;

    .line 682
    .line 683
    invoke-virtual {v3, v0, v2, v1}, La/jw20;->r(Landroidx/fragment/app/Fragment;La/ctf0;La/j2g0;)V

    .line 684
    .line 685
    .line 686
    :goto_a
    invoke-virtual {v0}, La/ia2;->G0()La/k3t0;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    sget-object v1, La/q92;->a:La/q92;

    .line 691
    .line 692
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    goto :goto_b

    .line 698
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 699
    .line 700
    .line 701
    :goto_b
    return-object v3

    .line 702
    :pswitch_f
    move-object/from16 v1, p1

    .line 703
    .line 704
    check-cast v1, Ljava/lang/Throwable;

    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, La/n92;

    .line 712
    .line 713
    iget-object v2, v0, La/n92;->T:La/ivn;

    .line 714
    .line 715
    new-instance v3, La/g92;

    .line 716
    .line 717
    const/4 v4, 0x0

    .line 718
    invoke-direct {v3, v0, v4}, La/g92;-><init>(La/n92;B)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 722
    .line 723
    .line 724
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    return-object v0

    .line 727
    :pswitch_10
    move-object/from16 v1, p1

    .line 728
    .line 729
    check-cast v1, La/s62;

    .line 730
    .line 731
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v0, La/k3t0;

    .line 737
    .line 738
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    return-object v0

    .line 744
    :pswitch_11
    move-object/from16 v1, p1

    .line 745
    .line 746
    check-cast v1, La/b72;

    .line 747
    .line 748
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 752
    .line 753
    move-object v6, v0

    .line 754
    check-cast v6, La/w62;

    .line 755
    .line 756
    sget-object v0, La/w62;->Q1:La/pek0;

    .line 757
    .line 758
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    instance-of v0, v1, La/z62;

    .line 762
    .line 763
    if-eqz v0, :cond_f

    .line 764
    .line 765
    new-instance v0, La/mc;

    .line 766
    .line 767
    const/16 v2, 0x12

    .line 768
    .line 769
    invoke-direct {v0, v6, v1, v2}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 770
    .line 771
    .line 772
    invoke-static {v6, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 773
    .line 774
    .line 775
    goto :goto_c

    .line 776
    :cond_f
    sget-object v0, La/y62;->a:La/y62;

    .line 777
    .line 778
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-eqz v0, :cond_10

    .line 783
    .line 784
    invoke-static {v6}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 785
    .line 786
    .line 787
    goto :goto_c

    .line 788
    :cond_10
    instance-of v0, v1, La/a72;

    .line 789
    .line 790
    if-eqz v0, :cond_11

    .line 791
    .line 792
    iget-object v0, v6, La/w62;->N1:La/a8z;

    .line 793
    .line 794
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    check-cast v0, La/esi;

    .line 799
    .line 800
    iget-object v4, v0, La/esi;->q:La/wdk0;

    .line 801
    .line 802
    new-instance v5, La/xdk0;

    .line 803
    .line 804
    sget-object v8, La/rek0;->b:La/rek0;

    .line 805
    .line 806
    check-cast v1, La/a72;

    .line 807
    .line 808
    iget-object v9, v1, La/a72;->a:Ljava/lang/String;

    .line 809
    .line 810
    const/4 v13, 0x0

    .line 811
    const/16 v14, 0x7c

    .line 812
    .line 813
    const/4 v10, 0x0

    .line 814
    const/4 v11, 0x0

    .line 815
    const/4 v12, 0x0

    .line 816
    move-object v7, v5

    .line 817
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 818
    .line 819
    .line 820
    const/16 v11, 0x3fc

    .line 821
    .line 822
    const/4 v7, 0x0

    .line 823
    const/4 v8, 0x0

    .line 824
    const/4 v9, 0x0

    .line 825
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 826
    .line 827
    .line 828
    :goto_c
    invoke-virtual {v6}, La/w62;->G0()La/k3t0;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    sget-object v1, La/a62;->a:La/a62;

    .line 833
    .line 834
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 838
    .line 839
    goto :goto_d

    .line 840
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 841
    .line 842
    .line 843
    :goto_d
    return-object v3

    .line 844
    :pswitch_12
    move-object/from16 v1, p1

    .line 845
    .line 846
    check-cast v1, La/b52;

    .line 847
    .line 848
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v0, La/t42;

    .line 854
    .line 855
    sget-object v2, La/t42;->p2:La/jdk0;

    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    iget-object v2, v0, La/t42;->m2:La/phf0;

    .line 861
    .line 862
    sget-object v4, La/w42;->a:La/w42;

    .line 863
    .line 864
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v4

    .line 868
    if-eqz v4, :cond_12

    .line 869
    .line 870
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 871
    .line 872
    .line 873
    goto/16 :goto_e

    .line 874
    .line 875
    :cond_12
    instance-of v4, v1, La/x42;

    .line 876
    .line 877
    const/4 v5, 0x2

    .line 878
    if-eqz v4, :cond_13

    .line 879
    .line 880
    sget-object v1, La/t42;->q2:[La/iiy;

    .line 881
    .line 882
    aget-object v1, v1, v5

    .line 883
    .line 884
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    sget-object v2, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;->d:Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 889
    .line 890
    new-instance v3, Lkotlin/Pair;

    .line 891
    .line 892
    const-string v4, "REQUEST_HISTORY_KEY"

    .line 893
    .line 894
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 909
    .line 910
    .line 911
    goto/16 :goto_e

    .line 912
    .line 913
    :cond_13
    instance-of v4, v1, La/z42;

    .line 914
    .line 915
    if-eqz v4, :cond_14

    .line 916
    .line 917
    sget-object v2, La/de90;->k2:La/xi70;

    .line 918
    .line 919
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 920
    .line 921
    .line 922
    move-result-object v3

    .line 923
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    check-cast v1, La/z42;

    .line 927
    .line 928
    iget-wide v4, v1, La/z42;->a:J

    .line 929
    .line 930
    iget v8, v1, La/z42;->b:I

    .line 931
    .line 932
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    const-wide/16 v6, 0x0

    .line 936
    .line 937
    const-string v9, "DATE_PICKER_REQUEST_KEY"

    .line 938
    .line 939
    invoke-static/range {v3 .. v9}, La/xi70;->f(Landroidx/fragment/app/e;JJILjava/lang/String;)V

    .line 940
    .line 941
    .line 942
    goto :goto_e

    .line 943
    :cond_14
    instance-of v4, v1, La/a52;

    .line 944
    .line 945
    if-eqz v4, :cond_15

    .line 946
    .line 947
    sget-object v2, La/vcj;->m2:La/kud;

    .line 948
    .line 949
    check-cast v1, La/a52;

    .line 950
    .line 951
    iget-object v1, v1, La/a52;->a:Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;

    .line 952
    .line 953
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 954
    .line 955
    .line 956
    move-result-object v3

    .line 957
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    const-string v2, "HISTORY_DAY_PICKER_KEY"

    .line 964
    .line 965
    invoke-static {v1, v3, v2}, La/kud;->g(Lorg/xplatform/ui_core/calendar/model/DateCalendarBottomSheetParams;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    goto :goto_e

    .line 969
    :cond_15
    instance-of v4, v1, La/y42;

    .line 970
    .line 971
    if-eqz v4, :cond_16

    .line 972
    .line 973
    sget-object v2, La/dej;->l2:La/kwd;

    .line 974
    .line 975
    check-cast v1, La/y42;

    .line 976
    .line 977
    iget-object v1, v1, La/y42;->a:Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 978
    .line 979
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    invoke-static {v1, v3}, La/kwd;->h(Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;Landroidx/fragment/app/e;)V

    .line 990
    .line 991
    .line 992
    goto :goto_e

    .line 993
    :cond_16
    instance-of v1, v1, La/v42;

    .line 994
    .line 995
    if-eqz v1, :cond_17

    .line 996
    .line 997
    sget-object v1, La/t42;->q2:[La/iiy;

    .line 998
    .line 999
    aget-object v1, v1, v5

    .line 1000
    .line 1001
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1006
    .line 1007
    new-instance v3, Lkotlin/Pair;

    .line 1008
    .line 1009
    const-string v4, "SELECTED_DATE_KEY"

    .line 1010
    .line 1011
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1026
    .line 1027
    .line 1028
    :goto_e
    invoke-virtual {v0}, La/t42;->Q0()La/k3t0;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    sget-object v1, La/k42;->a:La/k42;

    .line 1033
    .line 1034
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1035
    .line 1036
    .line 1037
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1038
    .line 1039
    goto :goto_f

    .line 1040
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 1041
    .line 1042
    .line 1043
    :goto_f
    return-object v3

    .line 1044
    :pswitch_13
    move-object/from16 v1, p1

    .line 1045
    .line 1046
    check-cast v1, La/t22;

    .line 1047
    .line 1048
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, La/k3t0;

    .line 1054
    .line 1055
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1059
    .line 1060
    return-object v0

    .line 1061
    :pswitch_14
    move-object/from16 v1, p1

    .line 1062
    .line 1063
    check-cast v1, La/l32;

    .line 1064
    .line 1065
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;

    .line 1071
    .line 1072
    sget-object v2, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 1073
    .line 1074
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1075
    .line 1076
    .line 1077
    instance-of v2, v1, La/j32;

    .line 1078
    .line 1079
    if-eqz v2, :cond_19

    .line 1080
    .line 1081
    iget-object v2, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->N1:La/ujd;

    .line 1082
    .line 1083
    if-eqz v2, :cond_18

    .line 1084
    .line 1085
    check-cast v1, La/j32;

    .line 1086
    .line 1087
    iget-object v1, v1, La/j32;->a:La/sjd;

    .line 1088
    .line 1089
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_10

    .line 1093
    :cond_18
    const-string v0, "composeGameCardFragmentDelegate"

    .line 1094
    .line 1095
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    throw v3

    .line 1099
    :cond_19
    instance-of v2, v1, La/k32;

    .line 1100
    .line 1101
    if-eqz v2, :cond_1b

    .line 1102
    .line 1103
    iget-object v2, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->K1:La/oll0;

    .line 1104
    .line 1105
    if-eqz v2, :cond_1a

    .line 1106
    .line 1107
    check-cast v1, La/k32;

    .line 1108
    .line 1109
    iget-object v1, v1, La/k32;->a:La/nll0;

    .line 1110
    .line 1111
    invoke-virtual {v2, v0, v1}, La/oll0;->a(Landroidx/fragment/app/Fragment;La/nll0;)V

    .line 1112
    .line 1113
    .line 1114
    :goto_10
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    sget-object v1, La/j22;->a:La/j22;

    .line 1119
    .line 1120
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1124
    .line 1125
    goto :goto_11

    .line 1126
    :cond_1a
    const-string v0, "sportResultHistoryEventCardFragmentDelegate"

    .line 1127
    .line 1128
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    throw v3

    .line 1132
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 1133
    .line 1134
    .line 1135
    :goto_11
    return-object v3

    .line 1136
    :pswitch_15
    move-object/from16 v1, p1

    .line 1137
    .line 1138
    check-cast v1, La/by1;

    .line 1139
    .line 1140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1144
    .line 1145
    check-cast v0, La/k3t0;

    .line 1146
    .line 1147
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1148
    .line 1149
    .line 1150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1151
    .line 1152
    return-object v0

    .line 1153
    :pswitch_16
    move-object/from16 v1, p1

    .line 1154
    .line 1155
    check-cast v1, La/cz1;

    .line 1156
    .line 1157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v0, La/ty1;

    .line 1163
    .line 1164
    sget-object v2, La/ty1;->R1:La/rek0;

    .line 1165
    .line 1166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1167
    .line 1168
    .line 1169
    instance-of v2, v1, La/yy1;

    .line 1170
    .line 1171
    if-eqz v2, :cond_1d

    .line 1172
    .line 1173
    check-cast v1, La/yy1;

    .line 1174
    .line 1175
    iget-object v1, v1, La/yy1;->a:La/ob0;

    .line 1176
    .line 1177
    instance-of v1, v1, La/mb0;

    .line 1178
    .line 1179
    if-eqz v1, :cond_21

    .line 1180
    .line 1181
    iget-object v4, v0, La/ty1;->M1:La/ynb;

    .line 1182
    .line 1183
    if-eqz v4, :cond_1c

    .line 1184
    .line 1185
    sget-object v5, La/bm5;->e:La/bm5;

    .line 1186
    .line 1187
    const v1, 0x7f130983

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v6

    .line 1194
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v7

    .line 1201
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1202
    .line 1203
    .line 1204
    const-string v9, "REQUEST_CHANGE_BALANCE_KEY"

    .line 1205
    .line 1206
    const/16 v10, 0x1e6

    .line 1207
    .line 1208
    const/4 v8, 0x0

    .line 1209
    invoke-static/range {v4 .. v10}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1210
    .line 1211
    .line 1212
    goto :goto_12

    .line 1213
    :cond_1c
    const-string v0, "changeBalanceDialogProvider"

    .line 1214
    .line 1215
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    throw v3

    .line 1219
    :cond_1d
    instance-of v2, v1, La/az1;

    .line 1220
    .line 1221
    if-eqz v2, :cond_1e

    .line 1222
    .line 1223
    check-cast v1, La/az1;

    .line 1224
    .line 1225
    iget-wide v2, v1, La/az1;->a:J

    .line 1226
    .line 1227
    iget-object v1, v1, La/az1;->b:Ljava/lang/String;

    .line 1228
    .line 1229
    sget-object v4, La/cl1;->o2:La/gfk0;

    .line 1230
    .line 1231
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1232
    .line 1233
    .line 1234
    invoke-static {v2, v3, v1}, La/gfk0;->g(JLjava/lang/String;)La/cl1;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v1

    .line 1238
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v2

    .line 1242
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v1, v2}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 1246
    .line 1247
    .line 1248
    goto :goto_12

    .line 1249
    :cond_1e
    instance-of v2, v1, La/bz1;

    .line 1250
    .line 1251
    if-eqz v2, :cond_20

    .line 1252
    .line 1253
    check-cast v1, La/bz1;

    .line 1254
    .line 1255
    iget-object v2, v0, La/ty1;->N1:La/ii;

    .line 1256
    .line 1257
    if-eqz v2, :cond_1f

    .line 1258
    .line 1259
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1260
    .line 1261
    iget-object v5, v1, La/bz1;->a:Ljava/lang/String;

    .line 1262
    .line 1263
    iget-object v6, v1, La/bz1;->b:Ljava/lang/String;

    .line 1264
    .line 1265
    iget-object v7, v1, La/bz1;->c:Ljava/lang/String;

    .line 1266
    .line 1267
    sget-object v13, La/n12;->b:La/n12;

    .line 1268
    .line 1269
    const/4 v14, 0x0

    .line 1270
    const/16 v15, 0x5d8

    .line 1271
    .line 1272
    const/4 v8, 0x0

    .line 1273
    const/4 v9, 0x0

    .line 1274
    const-string v10, "DIALOG_REQUEST_KEY"

    .line 1275
    .line 1276
    const/4 v11, 0x0

    .line 1277
    const/4 v12, 0x0

    .line 1278
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v2, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1289
    .line 1290
    .line 1291
    goto :goto_12

    .line 1292
    :cond_1f
    const-string v0, "actionDialogManager"

    .line 1293
    .line 1294
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    throw v3

    .line 1298
    :cond_20
    instance-of v1, v1, La/zy1;

    .line 1299
    .line 1300
    if-eqz v1, :cond_22

    .line 1301
    .line 1302
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v1

    .line 1306
    if-eqz v1, :cond_21

    .line 1307
    .line 1308
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    invoke-static {v1}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v1

    .line 1316
    if-eqz v1, :cond_21

    .line 1317
    .line 1318
    invoke-virtual {v0}, La/ty1;->G0()La/k3t0;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    sget-object v2, La/xx1;->a:La/xx1;

    .line 1323
    .line 1324
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1325
    .line 1326
    .line 1327
    :cond_21
    :goto_12
    invoke-virtual {v0}, La/ty1;->G0()La/k3t0;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    sget-object v1, La/lx1;->a:La/lx1;

    .line 1332
    .line 1333
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1334
    .line 1335
    .line 1336
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1337
    .line 1338
    goto :goto_13

    .line 1339
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1340
    .line 1341
    .line 1342
    :goto_13
    return-object v3

    .line 1343
    :pswitch_17
    move-object/from16 v1, p1

    .line 1344
    .line 1345
    check-cast v1, Ljava/lang/Throwable;

    .line 1346
    .line 1347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1348
    .line 1349
    .line 1350
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v0, La/uv1;

    .line 1353
    .line 1354
    invoke-virtual {v0, v1}, La/uv1;->T(Ljava/lang/Throwable;)V

    .line 1355
    .line 1356
    .line 1357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1358
    .line 1359
    return-object v0

    .line 1360
    :pswitch_18
    move-object/from16 v1, p1

    .line 1361
    .line 1362
    check-cast v1, Ljava/lang/Throwable;

    .line 1363
    .line 1364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1365
    .line 1366
    .line 1367
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1368
    .line 1369
    move-object v3, v0

    .line 1370
    check-cast v3, La/uv1;

    .line 1371
    .line 1372
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 1373
    .line 1374
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 1375
    .line 1376
    :cond_23
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    iget-object v5, v3, La/i3t0;->f:La/oyg0;

    .line 1384
    .line 1385
    move-object v6, v0

    .line 1386
    check-cast v6, La/yu1;

    .line 1387
    .line 1388
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1389
    .line 1390
    .line 1391
    const/16 v23, 0x0

    .line 1392
    .line 1393
    const v24, 0x1fff87f

    .line 1394
    .line 1395
    .line 1396
    const/4 v7, 0x0

    .line 1397
    const/4 v8, 0x0

    .line 1398
    const/4 v9, 0x0

    .line 1399
    sget-object v10, La/bt1;->a:La/bt1;

    .line 1400
    .line 1401
    const/4 v14, 0x0

    .line 1402
    const/4 v15, 0x0

    .line 1403
    const/16 v16, 0x0

    .line 1404
    .line 1405
    const/16 v17, 0x0

    .line 1406
    .line 1407
    const/16 v18, 0x0

    .line 1408
    .line 1409
    const/16 v19, 0x0

    .line 1410
    .line 1411
    const/16 v20, 0x0

    .line 1412
    .line 1413
    const/16 v21, 0x0

    .line 1414
    .line 1415
    const/16 v22, 0x0

    .line 1416
    .line 1417
    move-object v11, v10

    .line 1418
    move-object v12, v10

    .line 1419
    move-object v13, v10

    .line 1420
    invoke-static/range {v6 .. v24}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v5

    .line 1424
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1425
    .line 1426
    .line 1427
    move-result v0

    .line 1428
    if-eqz v0, :cond_23

    .line 1429
    .line 1430
    iget-object v0, v3, La/uv1;->r:La/duj;

    .line 1431
    .line 1432
    new-instance v4, La/o00;

    .line 1433
    .line 1434
    invoke-direct {v4, v3, v2}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v0, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1438
    .line 1439
    .line 1440
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1441
    .line 1442
    return-object v0

    .line 1443
    :pswitch_19
    move-object/from16 v1, p1

    .line 1444
    .line 1445
    check-cast v1, Ljava/lang/Throwable;

    .line 1446
    .line 1447
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1448
    .line 1449
    .line 1450
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1451
    .line 1452
    check-cast v0, La/uv1;

    .line 1453
    .line 1454
    invoke-virtual {v0, v1}, La/uv1;->T(Ljava/lang/Throwable;)V

    .line 1455
    .line 1456
    .line 1457
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1458
    .line 1459
    return-object v0

    .line 1460
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1461
    .line 1462
    check-cast v1, Ljava/lang/Throwable;

    .line 1463
    .line 1464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1465
    .line 1466
    .line 1467
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1468
    .line 1469
    check-cast v0, La/uv1;

    .line 1470
    .line 1471
    invoke-virtual {v0, v1}, La/uv1;->T(Ljava/lang/Throwable;)V

    .line 1472
    .line 1473
    .line 1474
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1475
    .line 1476
    return-object v0

    .line 1477
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1478
    .line 1479
    check-cast v1, La/ts1;

    .line 1480
    .line 1481
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1482
    .line 1483
    .line 1484
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v0, La/k3t0;

    .line 1487
    .line 1488
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1489
    .line 1490
    .line 1491
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1492
    .line 1493
    return-object v0

    .line 1494
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1495
    .line 1496
    check-cast v1, La/fn1;

    .line 1497
    .line 1498
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1499
    .line 1500
    .line 1501
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1502
    .line 1503
    check-cast v0, La/k3t0;

    .line 1504
    .line 1505
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1506
    .line 1507
    .line 1508
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1509
    .line 1510
    return-object v0

    .line 1511
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
