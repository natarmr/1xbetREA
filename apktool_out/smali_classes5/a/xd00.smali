.class public final synthetic La/xd00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ce00;


# direct methods
.method public synthetic constructor <init>(La/ce00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xd00;->a:B

    iput-object p1, p0, La/xd00;->b:La/ce00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xd00;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/xd00;->b:La/ce00;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/ce00;->P1:La/wsz;

    .line 11
    .line 12
    new-instance v1, La/vd00;

    .line 13
    .line 14
    new-instance v2, La/wd00;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v0, v3}, La/wd00;-><init>(La/ce00;B)V

    .line 18
    .line 19
    .line 20
    new-instance v3, La/wd00;

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-direct {v3, v0, v4}, La/wd00;-><init>(La/ce00;B)V

    .line 24
    .line 25
    .line 26
    new-instance v5, La/e000;

    .line 27
    .line 28
    invoke-virtual {v0}, La/ce00;->H0()La/ef00;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    const/4 v11, 0x0

    .line 33
    const/4 v12, 0x2

    .line 34
    const/4 v6, 0x2

    .line 35
    const-class v16, La/ef00;

    .line 36
    .line 37
    const-string v9, "onOneXGameClicked"

    .line 38
    .line 39
    const-string v10, "onOneXGameClicked(Lorg/xplatform/uikit_web_games/game_collection/GameCollectionItemModel;Ljava/lang/String;)V"

    .line 40
    .line 41
    move-object/from16 v8, v16

    .line 42
    .line 43
    invoke-direct/range {v5 .. v12}, La/e000;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    new-instance v4, La/wd00;

    .line 47
    .line 48
    const/4 v6, 0x3

    .line 49
    invoke-direct {v4, v0, v6}, La/wd00;-><init>(La/ce00;B)V

    .line 50
    .line 51
    .line 52
    new-instance v7, La/wd00;

    .line 53
    .line 54
    const/4 v8, 0x4

    .line 55
    invoke-direct {v7, v0, v8}, La/wd00;-><init>(La/ce00;B)V

    .line 56
    .line 57
    .line 58
    new-instance v13, La/o0t;

    .line 59
    .line 60
    invoke-virtual {v0}, La/ce00;->H0()La/ef00;

    .line 61
    .line 62
    .line 63
    move-result-object v15

    .line 64
    const/16 v19, 0x0

    .line 65
    .line 66
    const/16 v20, 0xc

    .line 67
    .line 68
    const/4 v14, 0x0

    .line 69
    const-string v17, "onEndCallClicked"

    .line 70
    .line 71
    const-string v18, "onEndCallClicked()V"

    .line 72
    .line 73
    invoke-direct/range {v13 .. v20}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {v2}, La/phu0;->N(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v8, v1, La/zz3;->d:La/dp;

    .line 84
    .line 85
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, La/k9x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, La/egm0;->i(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v2}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v5}, La/pym0;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2}, La/pzw;->H(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v2}, La/ro4;->X(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v13, v2}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, La/b4u0;

    .line 152
    .line 153
    const/16 v3, 0x15

    .line 154
    .line 155
    invoke-direct {v0, v3}, La/b4u0;-><init>(B)V

    .line 156
    .line 157
    .line 158
    new-instance v3, La/sbt0;

    .line 159
    .line 160
    const/16 v5, 0x1a

    .line 161
    .line 162
    invoke-direct {v3, v4, v5}, La/sbt0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 163
    .line 164
    .line 165
    new-instance v4, La/d8q0;

    .line 166
    .line 167
    const/16 v5, 0x18

    .line 168
    .line 169
    invoke-direct {v4, v6, v5}, La/d8q0;-><init>(IB)V

    .line 170
    .line 171
    .line 172
    sget-object v5, La/mnu0;->c:La/mnu0;

    .line 173
    .line 174
    new-instance v9, La/gbn;

    .line 175
    .line 176
    invoke-direct {v9, v0, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v8, v9}, La/dp;->b(La/gbn;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v7}, La/p8a;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, La/ycm0;->r(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v2}, La/wvb;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, La/efr0;

    .line 204
    .line 205
    const/16 v3, 0x1c

    .line 206
    .line 207
    invoke-direct {v0, v3}, La/efr0;-><init>(B)V

    .line 208
    .line 209
    .line 210
    new-instance v3, La/xar0;

    .line 211
    .line 212
    const/16 v4, 0x16

    .line 213
    .line 214
    invoke-direct {v3, v2, v4}, La/xar0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 215
    .line 216
    .line 217
    new-instance v4, La/d8q0;

    .line 218
    .line 219
    const/16 v5, 0x11

    .line 220
    .line 221
    invoke-direct {v4, v6, v5}, La/d8q0;-><init>(IB)V

    .line 222
    .line 223
    .line 224
    sget-object v5, La/pfo0;->z:La/pfo0;

    .line 225
    .line 226
    new-instance v6, La/gbn;

    .line 227
    .line 228
    invoke-direct {v6, v0, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8, v6}, La/dp;->b(La/gbn;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v2}, La/q7x;->A(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v8, v0}, La/dp;->b(La/gbn;)V

    .line 239
    .line 240
    .line 241
    return-object v1

    .line 242
    :pswitch_0
    sget-object v1, La/ce00;->P1:La/wsz;

    .line 243
    .line 244
    iget-object v0, v0, La/ce00;->M1:La/a8z;

    .line 245
    .line 246
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/uji;

    .line 251
    .line 252
    iget-object v0, v0, La/uji;->y:La/n5d0;

    .line 253
    .line 254
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, La/tji;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_1
    sget-object v1, La/ce00;->P1:La/wsz;

    .line 262
    .line 263
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    instance-of v2, v1, La/af3;

    .line 275
    .line 276
    const/4 v3, 0x0

    .line 277
    if-eqz v2, :cond_0

    .line 278
    .line 279
    check-cast v1, La/af3;

    .line 280
    .line 281
    goto :goto_0

    .line 282
    :cond_0
    move-object v1, v3

    .line 283
    :goto_0
    const-class v2, La/de00;

    .line 284
    .line 285
    if-eqz v1, :cond_3

    .line 286
    .line 287
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, La/o5d0;

    .line 296
    .line 297
    if-eqz v1, :cond_1

    .line 298
    .line 299
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, La/ze3;

    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_1
    move-object v1, v3

    .line 307
    :goto_1
    instance-of v4, v1, La/de00;

    .line 308
    .line 309
    if-nez v4, :cond_2

    .line 310
    .line 311
    move-object v1, v3

    .line 312
    :cond_2
    check-cast v1, La/de00;

    .line 313
    .line 314
    if-eqz v1, :cond_3

    .line 315
    .line 316
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 317
    .line 318
    .line 319
    move-result-object v32

    .line 320
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v0, v1, La/de00;->y:La/gr70;

    .line 324
    .line 325
    iget-object v2, v1, La/de00;->C:La/y3v;

    .line 326
    .line 327
    iget-object v5, v1, La/de00;->a:La/db;

    .line 328
    .line 329
    iget-object v8, v1, La/de00;->b:La/lp4;

    .line 330
    .line 331
    iget-object v6, v1, La/de00;->d:La/ugf0;

    .line 332
    .line 333
    iget-object v9, v1, La/de00;->e:La/ok50;

    .line 334
    .line 335
    iget-object v7, v1, La/de00;->c:La/e6e;

    .line 336
    .line 337
    iget-object v3, v1, La/de00;->f:La/y58;

    .line 338
    .line 339
    iget-object v10, v1, La/de00;->g:La/hru;

    .line 340
    .line 341
    iget-object v11, v1, La/de00;->h:La/bwl;

    .line 342
    .line 343
    iget-object v12, v1, La/de00;->i:La/mct;

    .line 344
    .line 345
    iget-object v13, v1, La/de00;->j:La/roi0;

    .line 346
    .line 347
    iget-object v14, v1, La/de00;->k:La/he1;

    .line 348
    .line 349
    iget-object v4, v1, La/de00;->m:La/wsf0;

    .line 350
    .line 351
    iget-object v15, v1, La/de00;->l:La/yqc;

    .line 352
    .line 353
    move-object/from16 v28, v0

    .line 354
    .line 355
    iget-object v0, v1, La/de00;->n:La/zx10;

    .line 356
    .line 357
    move-object/from16 v17, v0

    .line 358
    .line 359
    iget-object v0, v1, La/de00;->o:La/lef0;

    .line 360
    .line 361
    move-object/from16 v18, v0

    .line 362
    .line 363
    iget-object v0, v1, La/de00;->p:La/iip;

    .line 364
    .line 365
    move-object/from16 v19, v0

    .line 366
    .line 367
    iget-object v0, v1, La/de00;->q:La/pyg;

    .line 368
    .line 369
    move-object/from16 v20, v0

    .line 370
    .line 371
    iget-object v0, v1, La/de00;->r:La/ok50;

    .line 372
    .line 373
    move-object/from16 v21, v0

    .line 374
    .line 375
    iget-object v0, v1, La/de00;->s:La/nr00;

    .line 376
    .line 377
    move-object/from16 v22, v0

    .line 378
    .line 379
    iget-object v0, v1, La/de00;->t:La/nh70;

    .line 380
    .line 381
    move-object/from16 v23, v0

    .line 382
    .line 383
    iget-object v0, v1, La/de00;->u:La/peg0;

    .line 384
    .line 385
    move-object/from16 v27, v0

    .line 386
    .line 387
    iget-object v0, v1, La/de00;->A:La/evz;

    .line 388
    .line 389
    move-object/from16 v29, v0

    .line 390
    .line 391
    iget-object v0, v1, La/de00;->v:La/s2m0;

    .line 392
    .line 393
    move-object/from16 v24, v0

    .line 394
    .line 395
    iget-object v0, v1, La/de00;->w:La/zx10;

    .line 396
    .line 397
    move-object/from16 v25, v0

    .line 398
    .line 399
    iget-object v0, v1, La/de00;->x:La/kl5;

    .line 400
    .line 401
    move-object/from16 v26, v0

    .line 402
    .line 403
    iget-object v0, v1, La/de00;->z:La/qho;

    .line 404
    .line 405
    move-object/from16 v33, v0

    .line 406
    .line 407
    iget-object v0, v1, La/de00;->B:La/r2u;

    .line 408
    .line 409
    move-object/from16 v34, v0

    .line 410
    .line 411
    iget-object v0, v1, La/de00;->D:La/nv20;

    .line 412
    .line 413
    iget-object v1, v1, La/de00;->E:La/wxs0;

    .line 414
    .line 415
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    move-object/from16 v16, v4

    .line 437
    .line 438
    new-instance v4, La/uji;

    .line 439
    .line 440
    move-object/from16 v30, v0

    .line 441
    .line 442
    move-object/from16 v31, v1

    .line 443
    .line 444
    move-object/from16 v35, v2

    .line 445
    .line 446
    invoke-direct/range {v4 .. v35}, La/uji;-><init>(La/db;La/ugf0;La/e6e;La/lp4;La/ok50;La/hru;La/bwl;La/mct;La/roi0;La/he1;La/yqc;La/wsf0;La/zx10;La/lef0;La/iip;La/pyg;La/ok50;La/nr00;La/nh70;La/s2m0;La/zx10;La/kl5;La/peg0;La/gr70;La/evz;La/nv20;La/wxs0;La/i1w0;La/qho;La/r2u;La/y3v;)V

    .line 447
    .line 448
    .line 449
    move-object v3, v4

    .line 450
    goto :goto_2

    .line 451
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 452
    .line 453
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :goto_2
    return-object v3

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
