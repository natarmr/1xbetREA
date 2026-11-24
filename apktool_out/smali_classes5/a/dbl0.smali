.class public final synthetic La/dbl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gbl0;


# direct methods
.method public synthetic constructor <init>(La/gbl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dbl0;->a:B

    iput-object p1, p0, La/dbl0;->b:La/gbl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dbl0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/dbl0;->b:La/gbl0;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 13
    .line 14
    new-instance v1, La/qfs;

    .line 15
    .line 16
    new-instance v7, La/bbl0;

    .line 17
    .line 18
    invoke-direct {v7, v0, v2}, La/bbl0;-><init>(La/gbl0;B)V

    .line 19
    .line 20
    .line 21
    new-instance v5, La/cbl0;

    .line 22
    .line 23
    invoke-direct {v5, v0, v2}, La/cbl0;-><init>(La/gbl0;B)V

    .line 24
    .line 25
    .line 26
    new-instance v6, La/bbl0;

    .line 27
    .line 28
    invoke-direct {v6, v0, v3}, La/bbl0;-><init>(La/gbl0;B)V

    .line 29
    .line 30
    .line 31
    new-instance v8, La/cbl0;

    .line 32
    .line 33
    invoke-direct {v8, v0, v3}, La/cbl0;-><init>(La/gbl0;B)V

    .line 34
    .line 35
    .line 36
    new-instance v9, La/bbl0;

    .line 37
    .line 38
    const/4 v11, 0x2

    .line 39
    invoke-direct {v9, v0, v11}, La/bbl0;-><init>(La/gbl0;B)V

    .line 40
    .line 41
    .line 42
    sget-object v0, La/ofs;->a:La/ek5;

    .line 43
    .line 44
    invoke-direct {v1, v0}, La/zz3;-><init>(La/dtb;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/im8;

    .line 48
    .line 49
    const/16 v12, 0x10

    .line 50
    .line 51
    invoke-direct {v0, v12}, La/im8;-><init>(B)V

    .line 52
    .line 53
    .line 54
    new-instance v4, La/vca;

    .line 55
    .line 56
    invoke-direct {v4, v7, v3}, La/vca;-><init>(La/bbl0;B)V

    .line 57
    .line 58
    .line 59
    new-instance v10, La/lq4;

    .line 60
    .line 61
    const/4 v13, 0x3

    .line 62
    const/16 v14, 0x11

    .line 63
    .line 64
    invoke-direct {v10, v13, v14}, La/lq4;-><init>(IB)V

    .line 65
    .line 66
    .line 67
    sget-object v15, La/zx3;->A:La/zx3;

    .line 68
    .line 69
    new-instance v3, La/gbn;

    .line 70
    .line 71
    invoke-direct {v3, v0, v10, v4, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, La/dp;->b(La/gbn;)V

    .line 77
    .line 78
    .line 79
    new-instance v3, La/im8;

    .line 80
    .line 81
    const/16 v4, 0x1a

    .line 82
    .line 83
    invoke-direct {v3, v4}, La/im8;-><init>(B)V

    .line 84
    .line 85
    .line 86
    new-instance v4, La/dg;

    .line 87
    .line 88
    const/4 v10, 0x7

    .line 89
    invoke-direct/range {v4 .. v10}, La/dg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    new-instance v5, La/lq4;

    .line 93
    .line 94
    const/16 v6, 0x17

    .line 95
    .line 96
    invoke-direct {v5, v13, v6}, La/lq4;-><init>(IB)V

    .line 97
    .line 98
    .line 99
    sget-object v6, La/qja;->c:La/qja;

    .line 100
    .line 101
    new-instance v8, La/gbn;

    .line 102
    .line 103
    invoke-direct {v8, v3, v5, v4, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v8}, La/dp;->b(La/gbn;)V

    .line 107
    .line 108
    .line 109
    new-instance v3, La/im8;

    .line 110
    .line 111
    const/16 v4, 0xf

    .line 112
    .line 113
    invoke-direct {v3, v4}, La/im8;-><init>(B)V

    .line 114
    .line 115
    .line 116
    new-instance v4, La/vca;

    .line 117
    .line 118
    invoke-direct {v4, v7, v2}, La/vca;-><init>(La/bbl0;B)V

    .line 119
    .line 120
    .line 121
    new-instance v2, La/lq4;

    .line 122
    .line 123
    invoke-direct {v2, v13, v12}, La/lq4;-><init>(IB)V

    .line 124
    .line 125
    .line 126
    sget-object v5, La/zx3;->z:La/zx3;

    .line 127
    .line 128
    new-instance v6, La/gbn;

    .line 129
    .line 130
    invoke-direct {v6, v3, v2, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, La/im8;

    .line 137
    .line 138
    const/16 v3, 0x15

    .line 139
    .line 140
    invoke-direct {v2, v3}, La/im8;-><init>(B)V

    .line 141
    .line 142
    .line 143
    new-instance v4, La/vca;

    .line 144
    .line 145
    invoke-direct {v4, v7, v11}, La/vca;-><init>(La/bbl0;B)V

    .line 146
    .line 147
    .line 148
    new-instance v5, La/lq4;

    .line 149
    .line 150
    invoke-direct {v5, v13, v3}, La/lq4;-><init>(IB)V

    .line 151
    .line 152
    .line 153
    sget-object v3, La/zx3;->f1:La/zx3;

    .line 154
    .line 155
    new-instance v6, La/gbn;

    .line 156
    .line 157
    invoke-direct {v6, v2, v5, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 161
    .line 162
    .line 163
    new-instance v2, La/im8;

    .line 164
    .line 165
    const/16 v3, 0x14

    .line 166
    .line 167
    invoke-direct {v2, v3}, La/im8;-><init>(B)V

    .line 168
    .line 169
    .line 170
    new-instance v4, La/d69;

    .line 171
    .line 172
    invoke-direct {v4, v12}, La/d69;-><init>(B)V

    .line 173
    .line 174
    .line 175
    new-instance v5, La/lq4;

    .line 176
    .line 177
    invoke-direct {v5, v13, v3}, La/lq4;-><init>(IB)V

    .line 178
    .line 179
    .line 180
    sget-object v3, La/zx3;->Z:La/zx3;

    .line 181
    .line 182
    new-instance v6, La/gbn;

    .line 183
    .line 184
    invoke-direct {v6, v2, v5, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, La/im8;

    .line 191
    .line 192
    const/16 v3, 0x16

    .line 193
    .line 194
    invoke-direct {v2, v3}, La/im8;-><init>(B)V

    .line 195
    .line 196
    .line 197
    new-instance v4, La/d69;

    .line 198
    .line 199
    invoke-direct {v4, v14}, La/d69;-><init>(B)V

    .line 200
    .line 201
    .line 202
    new-instance v5, La/lq4;

    .line 203
    .line 204
    invoke-direct {v5, v13, v3}, La/lq4;-><init>(IB)V

    .line 205
    .line 206
    .line 207
    sget-object v3, La/qja;->b:La/qja;

    .line 208
    .line 209
    new-instance v6, La/gbn;

    .line 210
    .line 211
    invoke-direct {v6, v2, v5, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 215
    .line 216
    .line 217
    new-instance v2, La/im8;

    .line 218
    .line 219
    invoke-direct {v2, v14}, La/im8;-><init>(B)V

    .line 220
    .line 221
    .line 222
    new-instance v3, La/d69;

    .line 223
    .line 224
    const/16 v4, 0xd

    .line 225
    .line 226
    invoke-direct {v3, v4}, La/d69;-><init>(B)V

    .line 227
    .line 228
    .line 229
    new-instance v4, La/lq4;

    .line 230
    .line 231
    const/16 v5, 0x12

    .line 232
    .line 233
    invoke-direct {v4, v13, v5}, La/lq4;-><init>(IB)V

    .line 234
    .line 235
    .line 236
    sget-object v5, La/zx3;->B:La/zx3;

    .line 237
    .line 238
    new-instance v6, La/gbn;

    .line 239
    .line 240
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 244
    .line 245
    .line 246
    new-instance v2, La/im8;

    .line 247
    .line 248
    const/16 v3, 0x13

    .line 249
    .line 250
    invoke-direct {v2, v3}, La/im8;-><init>(B)V

    .line 251
    .line 252
    .line 253
    new-instance v4, La/d69;

    .line 254
    .line 255
    const/16 v5, 0xe

    .line 256
    .line 257
    invoke-direct {v4, v5}, La/d69;-><init>(B)V

    .line 258
    .line 259
    .line 260
    new-instance v5, La/lq4;

    .line 261
    .line 262
    invoke-direct {v5, v13, v3}, La/lq4;-><init>(IB)V

    .line 263
    .line 264
    .line 265
    sget-object v3, La/zx3;->Y:La/zx3;

    .line 266
    .line 267
    new-instance v6, La/gbn;

    .line 268
    .line 269
    invoke-direct {v6, v2, v5, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 273
    .line 274
    .line 275
    new-instance v2, La/jbp;

    .line 276
    .line 277
    const/16 v3, 0x1b

    .line 278
    .line 279
    invoke-direct {v2, v3}, La/jbp;-><init>(B)V

    .line 280
    .line 281
    .line 282
    new-instance v3, La/vca;

    .line 283
    .line 284
    invoke-direct {v3, v7, v13}, La/vca;-><init>(La/bbl0;B)V

    .line 285
    .line 286
    .line 287
    new-instance v4, La/atq;

    .line 288
    .line 289
    const/4 v5, 0x1

    .line 290
    invoke-direct {v4, v13, v5}, La/atq;-><init>(IB)V

    .line 291
    .line 292
    .line 293
    sget-object v5, La/gzn;->y:La/gzn;

    .line 294
    .line 295
    new-instance v6, La/gbn;

    .line 296
    .line 297
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 301
    .line 302
    .line 303
    return-object v1

    .line 304
    :pswitch_0
    new-instance v1, La/q0h0;

    .line 305
    .line 306
    iget-object v0, v0, La/gbl0;->L1:La/mui;

    .line 307
    .line 308
    if-eqz v0, :cond_0

    .line 309
    .line 310
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 311
    .line 312
    .line 313
    return-object v1

    .line 314
    :cond_0
    const-string v0, "viewModelFactory"

    .line 315
    .line 316
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    const/4 v0, 0x0

    .line 320
    throw v0

    .line 321
    :pswitch_1
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 322
    .line 323
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    iget-object v1, v1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 328
    .line 329
    iget-object v1, v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 330
    .line 331
    invoke-static {v1}, La/bww;->Q(La/y930;)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_1

    .line 336
    .line 337
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    iget-object v0, v0, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 342
    .line 343
    invoke-virtual {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->B()V

    .line 344
    .line 345
    .line 346
    goto :goto_1

    .line 347
    :cond_1
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v1, v0, La/ncl0;->y:La/lhf0;

    .line 352
    .line 353
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    check-cast v3, La/p7m0;

    .line 358
    .line 359
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    check-cast v3, La/zqs;

    .line 364
    .line 365
    iget-wide v3, v3, La/zqs;->c:J

    .line 366
    .line 367
    invoke-virtual {v0}, La/ncl0;->w()La/qz40;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    check-cast v5, La/p7m0;

    .line 372
    .line 373
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, La/zqs;

    .line 378
    .line 379
    iget-boolean v5, v5, La/zqs;->f:Z

    .line 380
    .line 381
    iget-object v6, v1, La/lhf0;->b:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v6, La/bn6;

    .line 384
    .line 385
    const/4 v7, 0x1

    .line 386
    invoke-virtual {v6, v3, v4, v7, v5}, La/bn6;->c(JZZ)V

    .line 387
    .line 388
    .line 389
    iget-object v1, v1, La/lhf0;->d:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, La/je;

    .line 392
    .line 393
    invoke-virtual {v1, v3, v4, v7, v5}, La/je;->e(JZZ)V

    .line 394
    .line 395
    .line 396
    iget-object v0, v0, La/ncl0;->i:La/i1w0;

    .line 397
    .line 398
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    new-instance v3, La/c8d;

    .line 403
    .line 404
    sget-object v4, La/y7d;->a:La/v7d;

    .line 405
    .line 406
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 407
    .line 408
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    :goto_0
    move-object v2, v1

    .line 416
    check-cast v2, La/paw;

    .line 417
    .line 418
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    if-eqz v3, :cond_2

    .line 423
    .line 424
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    check-cast v2, La/oe50;

    .line 429
    .line 430
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 431
    .line 432
    .line 433
    goto :goto_0

    .line 434
    :cond_2
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_2
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 438
    .line 439
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
