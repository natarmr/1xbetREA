.class public final synthetic La/tsq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xsq0;


# direct methods
.method public synthetic constructor <init>(La/xsq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tsq0;->a:B

    iput-object p1, p0, La/tsq0;->b:La/xsq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tsq0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/tsq0;->b:La/xsq0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/xsq0;->P1:La/y2m0;

    .line 11
    .line 12
    iget-object v0, v0, La/xsq0;->N1:La/a8z;

    .line 13
    .line 14
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/s5i;

    .line 19
    .line 20
    iget-object v0, v0, La/s5i;->z:La/n5d0;

    .line 21
    .line 22
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/q5i;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    sget-object v1, La/xsq0;->P1:La/y2m0;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    instance-of v2, v1, La/af3;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    check-cast v1, La/af3;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v1, v3

    .line 51
    :goto_0
    const-class v2, La/o9;

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, La/o5d0;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, La/ze3;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object v1, v3

    .line 75
    :goto_1
    instance-of v4, v1, La/o9;

    .line 76
    .line 77
    if-nez v4, :cond_2

    .line 78
    .line 79
    move-object v1, v3

    .line 80
    :cond_2
    check-cast v1, La/o9;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-virtual {v1, v0, v2}, La/o9;->a(La/i1w0;Z)La/s5i;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 95
    .line 96
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_2
    return-object v3

    .line 104
    :pswitch_1
    sget-object v1, La/xsq0;->P1:La/y2m0;

    .line 105
    .line 106
    new-instance v1, La/orq0;

    .line 107
    .line 108
    new-instance v2, La/usq0;

    .line 109
    .line 110
    const/4 v3, 0x1

    .line 111
    invoke-direct {v2, v0, v3}, La/usq0;-><init>(La/xsq0;B)V

    .line 112
    .line 113
    .line 114
    new-instance v4, La/l7p0;

    .line 115
    .line 116
    const/16 v5, 0x1d

    .line 117
    .line 118
    invoke-direct {v4, v0, v5}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    new-instance v5, La/usq0;

    .line 122
    .line 123
    const/4 v6, 0x2

    .line 124
    invoke-direct {v5, v0, v6}, La/usq0;-><init>(La/xsq0;B)V

    .line 125
    .line 126
    .line 127
    new-instance v7, La/usq0;

    .line 128
    .line 129
    const/4 v8, 0x3

    .line 130
    invoke-direct {v7, v0, v8}, La/usq0;-><init>(La/xsq0;B)V

    .line 131
    .line 132
    .line 133
    new-instance v9, La/usq0;

    .line 134
    .line 135
    const/4 v10, 0x4

    .line 136
    invoke-direct {v9, v0, v10}, La/usq0;-><init>(La/xsq0;B)V

    .line 137
    .line 138
    .line 139
    new-instance v11, La/cym0;

    .line 140
    .line 141
    invoke-virtual {v0}, La/xsq0;->H0()La/xtq0;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/16 v18, 0x10

    .line 148
    .line 149
    const/4 v12, 0x0

    .line 150
    const-class v14, La/xtq0;

    .line 151
    .line 152
    const-string v15, "onEndCallClicked"

    .line 153
    .line 154
    const-string v16, "onEndCallClicked()V"

    .line 155
    .line 156
    invoke-direct/range {v11 .. v18}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, La/ccq0;->S(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v12, v1, La/zz3;->d:La/dp;

    .line 167
    .line 168
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v2}, La/cwr0;->O(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v2}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v2}, La/ofm0;->p(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v2}, La/bfb;->P(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 197
    .line 198
    .line 199
    new-instance v0, La/sfc;

    .line 200
    .line 201
    const/16 v13, 0x13

    .line 202
    .line 203
    invoke-direct {v0, v13}, La/sfc;-><init>(B)V

    .line 204
    .line 205
    .line 206
    new-instance v14, La/trb;

    .line 207
    .line 208
    const/16 v15, 0x14

    .line 209
    .line 210
    invoke-direct {v14, v2, v15}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 211
    .line 212
    .line 213
    new-instance v15, La/tad;

    .line 214
    .line 215
    invoke-direct {v15, v8, v10}, La/tad;-><init>(IB)V

    .line 216
    .line 217
    .line 218
    sget-object v10, La/qja;->o:La/qja;

    .line 219
    .line 220
    new-instance v3, La/gbn;

    .line 221
    .line 222
    invoke-direct {v3, v0, v15, v14, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v3}, La/dp;->b(La/gbn;)V

    .line 226
    .line 227
    .line 228
    new-instance v0, La/sfc;

    .line 229
    .line 230
    const/16 v3, 0x11

    .line 231
    .line 232
    invoke-direct {v0, v3}, La/sfc;-><init>(B)V

    .line 233
    .line 234
    .line 235
    new-instance v10, La/trb;

    .line 236
    .line 237
    const/16 v14, 0x12

    .line 238
    .line 239
    invoke-direct {v10, v2, v14}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 240
    .line 241
    .line 242
    new-instance v15, La/tad;

    .line 243
    .line 244
    invoke-direct {v15, v8, v6}, La/tad;-><init>(IB)V

    .line 245
    .line 246
    .line 247
    sget-object v6, La/qja;->m:La/qja;

    .line 248
    .line 249
    new-instance v3, La/gbn;

    .line 250
    .line 251
    invoke-direct {v3, v0, v15, v10, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v3}, La/dp;->b(La/gbn;)V

    .line 255
    .line 256
    .line 257
    new-instance v0, La/sfc;

    .line 258
    .line 259
    invoke-direct {v0, v14}, La/sfc;-><init>(B)V

    .line 260
    .line 261
    .line 262
    new-instance v3, La/trb;

    .line 263
    .line 264
    invoke-direct {v3, v2, v13}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 265
    .line 266
    .line 267
    new-instance v6, La/tad;

    .line 268
    .line 269
    invoke-direct {v6, v8, v8}, La/tad;-><init>(IB)V

    .line 270
    .line 271
    .line 272
    sget-object v10, La/qja;->n:La/qja;

    .line 273
    .line 274
    new-instance v14, La/gbn;

    .line 275
    .line 276
    invoke-direct {v14, v0, v6, v3, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v14}, La/dp;->b(La/gbn;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v2}, La/m7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v2}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, La/shq0;

    .line 297
    .line 298
    const/16 v3, 0xa

    .line 299
    .line 300
    invoke-direct {v0, v3}, La/shq0;-><init>(B)V

    .line 301
    .line 302
    .line 303
    new-instance v3, La/b8q0;

    .line 304
    .line 305
    const/16 v6, 0xb

    .line 306
    .line 307
    invoke-direct {v3, v2, v11, v6}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 308
    .line 309
    .line 310
    new-instance v6, La/d8q0;

    .line 311
    .line 312
    const/4 v10, 0x7

    .line 313
    invoke-direct {v6, v8, v10}, La/d8q0;-><init>(IB)V

    .line 314
    .line 315
    .line 316
    sget-object v10, La/pfo0;->p:La/pfo0;

    .line 317
    .line 318
    new-instance v11, La/gbn;

    .line 319
    .line 320
    invoke-direct {v11, v0, v6, v3, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v2}, La/ro4;->X(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 331
    .line 332
    .line 333
    invoke-static {v2, v4}, La/pym0;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v5}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 345
    .line 346
    .line 347
    invoke-static {v7}, La/ihm0;->m(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 352
    .line 353
    .line 354
    invoke-static {v2}, La/zcm0;->l(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 359
    .line 360
    .line 361
    new-instance v0, La/shq0;

    .line 362
    .line 363
    const/16 v3, 0x8

    .line 364
    .line 365
    invoke-direct {v0, v3}, La/shq0;-><init>(B)V

    .line 366
    .line 367
    .line 368
    new-instance v4, La/t6q0;

    .line 369
    .line 370
    invoke-direct {v4, v13}, La/t6q0;-><init>(B)V

    .line 371
    .line 372
    .line 373
    new-instance v5, La/d8q0;

    .line 374
    .line 375
    const/4 v6, 0x5

    .line 376
    invoke-direct {v5, v8, v6}, La/d8q0;-><init>(IB)V

    .line 377
    .line 378
    .line 379
    sget-object v6, La/pfo0;->n:La/pfo0;

    .line 380
    .line 381
    new-instance v7, La/gbn;

    .line 382
    .line 383
    invoke-direct {v7, v0, v5, v4, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v7}, La/dp;->b(La/gbn;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v9}, La/ny9;->R(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 394
    .line 395
    .line 396
    new-instance v0, La/sfc;

    .line 397
    .line 398
    const/16 v4, 0x10

    .line 399
    .line 400
    invoke-direct {v0, v4}, La/sfc;-><init>(B)V

    .line 401
    .line 402
    .line 403
    new-instance v4, La/trb;

    .line 404
    .line 405
    const/16 v5, 0x11

    .line 406
    .line 407
    invoke-direct {v4, v2, v5}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 408
    .line 409
    .line 410
    new-instance v5, La/tad;

    .line 411
    .line 412
    const/4 v6, 0x1

    .line 413
    invoke-direct {v5, v8, v6}, La/tad;-><init>(IB)V

    .line 414
    .line 415
    .line 416
    sget-object v6, La/qja;->l:La/qja;

    .line 417
    .line 418
    new-instance v7, La/gbn;

    .line 419
    .line 420
    invoke-direct {v7, v0, v5, v4, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v7}, La/dp;->b(La/gbn;)V

    .line 424
    .line 425
    .line 426
    new-instance v0, La/sfc;

    .line 427
    .line 428
    const/16 v4, 0x17

    .line 429
    .line 430
    invoke-direct {v0, v4}, La/sfc;-><init>(B)V

    .line 431
    .line 432
    .line 433
    new-instance v4, La/trb;

    .line 434
    .line 435
    const/16 v5, 0x16

    .line 436
    .line 437
    invoke-direct {v4, v2, v5}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 438
    .line 439
    .line 440
    new-instance v5, La/tad;

    .line 441
    .line 442
    invoke-direct {v5, v8, v3}, La/tad;-><init>(IB)V

    .line 443
    .line 444
    .line 445
    sget-object v3, La/qja;->s:La/qja;

    .line 446
    .line 447
    new-instance v6, La/gbn;

    .line 448
    .line 449
    invoke-direct {v6, v0, v5, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v6}, La/dp;->b(La/gbn;)V

    .line 453
    .line 454
    .line 455
    new-instance v0, La/sfc;

    .line 456
    .line 457
    const/16 v3, 0x15

    .line 458
    .line 459
    invoke-direct {v0, v3}, La/sfc;-><init>(B)V

    .line 460
    .line 461
    .line 462
    new-instance v4, La/trb;

    .line 463
    .line 464
    invoke-direct {v4, v2, v3}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 465
    .line 466
    .line 467
    new-instance v2, La/tad;

    .line 468
    .line 469
    const/4 v3, 0x6

    .line 470
    invoke-direct {v2, v8, v3}, La/tad;-><init>(IB)V

    .line 471
    .line 472
    .line 473
    sget-object v3, La/qja;->q:La/qja;

    .line 474
    .line 475
    new-instance v5, La/gbn;

    .line 476
    .line 477
    invoke-direct {v5, v0, v2, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v5}, La/dp;->b(La/gbn;)V

    .line 481
    .line 482
    .line 483
    return-object v1

    .line 484
    nop

    .line 485
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
