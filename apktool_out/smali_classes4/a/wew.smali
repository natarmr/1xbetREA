.class public final La/wew;
.super La/guy;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:La/lwf;

.field public final synthetic c:La/nie0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:La/pz40;


# direct methods
.method public constructor <init>(La/pz40;La/lwf;La/nie0;La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;Lkotlin/jvm/functions/Function0;La/pz40;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wew;->a:La/pz40;

    .line 2
    .line 3
    iput-object p2, p0, La/wew;->b:La/lwf;

    .line 4
    .line 5
    iput-object p3, p0, La/wew;->c:La/nie0;

    .line 6
    .line 7
    iput-object p4, p0, La/wew;->d:La/l7m0;

    .line 8
    .line 9
    iput-object p5, p0, La/wew;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iput-object p6, p0, La/wew;->f:La/l7m0;

    .line 12
    .line 13
    iput-object p7, p0, La/wew;->g:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    iput-object p8, p0, La/wew;->h:La/pz40;

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/nt40;

    .line 6
    .line 7
    move-object/from16 v14, p2

    .line 8
    .line 9
    check-cast v14, La/fet;

    .line 10
    .line 11
    move-object/from16 v1, p3

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    iget-object v2, v0, La/wew;->a:La/pz40;

    .line 21
    .line 22
    invoke-interface {v2, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, La/wew;->b:La/lwf;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, La/wew;->c:La/nie0;

    .line 31
    .line 32
    iget-object v3, v2, La/nie0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v4, La/cmd;->a:La/cmd;

    .line 35
    .line 36
    if-ne v3, v4, :cond_0

    .line 37
    .line 38
    sget-object v3, La/cmd;->b:La/cmd;

    .line 39
    .line 40
    iput-object v3, v2, La/nie0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_0
    const v2, 0x76d81a38

    .line 43
    .line 44
    .line 45
    invoke-virtual {v14, v2}, La/fet;->e0(I)V

    .line 46
    .line 47
    .line 48
    sget-object v2, La/jm40;->b:La/jm40;

    .line 49
    .line 50
    const/high16 v3, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sget-object v5, La/et40;->a:La/et40;

    .line 57
    .line 58
    invoke-static {v4, v5}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v11, La/gqw0;->b:La/zx7;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-static {v11, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    iget-wide v7, v14, La/fet;->T:J

    .line 70
    .line 71
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-virtual {v14}, La/fet;->m()La/bh90;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v14, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v14}, La/fet;->i0()V

    .line 89
    .line 90
    .line 91
    iget-boolean v9, v14, La/fet;->S:Z

    .line 92
    .line 93
    if-eqz v9, :cond_1

    .line 94
    .line 95
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 96
    .line 97
    invoke-virtual {v14, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {v14}, La/fet;->r0()V

    .line 102
    .line 103
    .line 104
    :goto_0
    sget-object v9, La/gqw0;->x:La/shd;

    .line 105
    .line 106
    invoke-static {v14, v6, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v6, La/gqw0;->w:La/shd;

    .line 110
    .line 111
    invoke-static {v14, v8, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    sget-object v7, La/gqw0;->y:La/shd;

    .line 119
    .line 120
    invoke-static {v14, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v14}, La/jpm0;->n(La/fet;)V

    .line 124
    .line 125
    .line 126
    sget-object v6, La/gqw0;->v:La/shd;

    .line 127
    .line 128
    invoke-static {v14, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    sget-object v4, La/o7k0;->c:La/n0q;

    .line 132
    .line 133
    iget-object v6, v0, La/wew;->d:La/l7m0;

    .line 134
    .line 135
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, La/xew;

    .line 140
    .line 141
    iget-object v7, v7, La/xew;->c:Ljava/lang/String;

    .line 142
    .line 143
    sget-object v12, La/gqw0;->A:La/pge;

    .line 144
    .line 145
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    check-cast v8, La/xew;

    .line 150
    .line 151
    iget v8, v8, La/xew;->d:I

    .line 152
    .line 153
    invoke-static {v8, v5, v14}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    check-cast v9, La/xew;

    .line 162
    .line 163
    iget v9, v9, La/xew;->d:I

    .line 164
    .line 165
    invoke-static {v9, v5, v14}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    const/16 v16, 0x6

    .line 170
    .line 171
    const/16 v17, 0x79e0

    .line 172
    .line 173
    move v10, v3

    .line 174
    const/4 v3, 0x0

    .line 175
    move-object v13, v2

    .line 176
    move-object v2, v7

    .line 177
    const/4 v7, 0x0

    .line 178
    move-object v15, v6

    .line 179
    move-object v6, v8

    .line 180
    const/4 v8, 0x0

    .line 181
    move/from16 v18, v5

    .line 182
    .line 183
    move-object v5, v9

    .line 184
    const/4 v9, 0x0

    .line 185
    move/from16 v19, v10

    .line 186
    .line 187
    const/4 v10, 0x0

    .line 188
    move-object/from16 v20, v13

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    move-object/from16 v21, v15

    .line 192
    .line 193
    const v15, 0x300091b0

    .line 194
    .line 195
    .line 196
    move-object/from16 p1, v1

    .line 197
    .line 198
    move/from16 v1, v18

    .line 199
    .line 200
    move-object/from16 v28, v20

    .line 201
    .line 202
    move-object/from16 v27, v21

    .line 203
    .line 204
    invoke-static/range {v2 .. v17}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 205
    .line 206
    .line 207
    iget-object v2, v0, La/wew;->f:La/l7m0;

    .line 208
    .line 209
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    check-cast v3, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    invoke-static {v4, v3}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    sget-wide v4, La/ijg;->j:J

    .line 224
    .line 225
    sget-object v6, La/jd8;->n:La/ljc;

    .line 226
    .line 227
    invoke-static {v3, v4, v5, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-static {v1, v14, v3}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v3, v28

    .line 235
    .line 236
    const/high16 v10, 0x3f800000    # 1.0f

    .line 237
    .line 238
    invoke-static {v3, v10}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    const/4 v5, 0x0

    .line 243
    const/4 v6, 0x1

    .line 244
    invoke-static {v4, v5, v14, v6}, La/yyw;->X(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)La/mm40;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    new-instance v15, La/imm;

    .line 249
    .line 250
    sget-object v5, La/m8m0;->a:La/zfn;

    .line 251
    .line 252
    invoke-virtual {v14, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    check-cast v5, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 257
    .line 258
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 259
    .line 260
    .line 261
    move-result-wide v19

    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    sget-object v16, La/klm;->a:La/klm;

    .line 267
    .line 268
    sget-object v17, La/mlm;->a:La/mlm;

    .line 269
    .line 270
    sget-object v18, La/fmm;->a:La/fmm;

    .line 271
    .line 272
    invoke-direct/range {v15 .. v22}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    sget-object v7, La/ukd;->a:La/cl5;

    .line 280
    .line 281
    if-ne v5, v7, :cond_2

    .line 282
    .line 283
    new-instance v5, La/vkm;

    .line 284
    .line 285
    invoke-direct {v5, v6}, La/vkm;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v14, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_2
    check-cast v5, La/vkm;

    .line 292
    .line 293
    iget-object v8, v0, La/wew;->g:Lkotlin/jvm/functions/Function0;

    .line 294
    .line 295
    invoke-virtual {v14, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    const/4 v11, 0x5

    .line 304
    if-nez v9, :cond_3

    .line 305
    .line 306
    if-ne v10, v7, :cond_4

    .line 307
    .line 308
    :cond_3
    new-instance v10, La/lfk;

    .line 309
    .line 310
    invoke-direct {v10, v8, v11}, La/lfk;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v14, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 317
    .line 318
    new-instance v9, La/a8;

    .line 319
    .line 320
    iget-object v12, v0, La/wew;->h:La/pz40;

    .line 321
    .line 322
    const/16 v13, 0xf

    .line 323
    .line 324
    invoke-direct {v9, v8, v12, v13}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 325
    .line 326
    .line 327
    const v8, -0x78adea65

    .line 328
    .line 329
    .line 330
    invoke-static {v8, v9, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    new-instance v9, La/a8;

    .line 335
    .line 336
    const/16 v12, 0x10

    .line 337
    .line 338
    move-object/from16 v13, v27

    .line 339
    .line 340
    invoke-direct {v9, v2, v13, v12}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 341
    .line 342
    .line 343
    const v2, -0x45a666f3

    .line 344
    .line 345
    .line 346
    invoke-static {v2, v9, v14}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 347
    .line 348
    .line 349
    move-result-object v12

    .line 350
    const/16 v16, 0x6

    .line 351
    .line 352
    const/16 v17, 0x9f0

    .line 353
    .line 354
    move v2, v6

    .line 355
    const/4 v6, 0x0

    .line 356
    move-object v9, v7

    .line 357
    const/4 v7, 0x0

    .line 358
    move/from16 v18, v11

    .line 359
    .line 360
    move-object v11, v8

    .line 361
    const/4 v8, 0x0

    .line 362
    move-object/from16 v19, v9

    .line 363
    .line 364
    const/4 v9, 0x0

    .line 365
    move/from16 v20, v2

    .line 366
    .line 367
    move-object v2, v4

    .line 368
    move-object v4, v5

    .line 369
    move-object v5, v10

    .line 370
    const/4 v10, 0x0

    .line 371
    move-object/from16 v21, v13

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    move-object/from16 v28, v3

    .line 375
    .line 376
    move-object v3, v15

    .line 377
    const v15, 0x30000180

    .line 378
    .line 379
    .line 380
    move-object/from16 v29, v19

    .line 381
    .line 382
    move/from16 v1, v20

    .line 383
    .line 384
    move-object/from16 p3, v21

    .line 385
    .line 386
    move-object/from16 v0, v28

    .line 387
    .line 388
    invoke-static/range {v2 .. v17}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v14, v1}, La/fet;->r(Z)V

    .line 392
    .line 393
    .line 394
    const/high16 v10, 0x3f800000    # 1.0f

    .line 395
    .line 396
    invoke-static {v0, v10}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    iget v3, v3, La/wfn;->e:F

    .line 405
    .line 406
    sget-object v4, La/qmk;->a:La/zcl;

    .line 407
    .line 408
    const/4 v6, 0x0

    .line 409
    const/16 v7, 0xc

    .line 410
    .line 411
    const/high16 v4, 0x41800000    # 16.0f

    .line 412
    .line 413
    const/4 v5, 0x0

    .line 414
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    sget-object v3, La/et40;->b:La/et40;

    .line 419
    .line 420
    invoke-static {v2, v3}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    const-string v3, "HLTV_AWARDS_TOOLBAR_TITLE"

    .line 425
    .line 426
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    invoke-interface/range {p3 .. p3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    check-cast v2, La/xew;

    .line 435
    .line 436
    iget-object v2, v2, La/xew;->a:Ljava/lang/String;

    .line 437
    .line 438
    sget-object v36, La/j1t0;->a:La/qrq;

    .line 439
    .line 440
    sget-wide v33, La/qmk;->y:J

    .line 441
    .line 442
    sget-wide v42, La/qmk;->K:J

    .line 443
    .line 444
    new-instance v30, La/y9q0;

    .line 445
    .line 446
    const/16 v41, 0x0

    .line 447
    .line 448
    const v44, 0xfdffdd

    .line 449
    .line 450
    .line 451
    const-wide/16 v31, 0x0

    .line 452
    .line 453
    const/16 v35, 0x0

    .line 454
    .line 455
    const-wide/16 v37, 0x0

    .line 456
    .line 457
    const/16 v39, 0x0

    .line 458
    .line 459
    const/16 v40, 0x0

    .line 460
    .line 461
    invoke-direct/range {v30 .. v44}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 462
    .line 463
    .line 464
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 465
    .line 466
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 467
    .line 468
    .line 469
    move-result-wide v11

    .line 470
    sget-wide v5, La/qmk;->u:J

    .line 471
    .line 472
    sget-wide v9, La/qmk;->n:J

    .line 473
    .line 474
    new-instance v4, La/n05;

    .line 475
    .line 476
    move-wide/from16 v7, v33

    .line 477
    .line 478
    invoke-direct/range {v4 .. v10}, La/n05;-><init>(JJJ)V

    .line 479
    .line 480
    .line 481
    const/16 v25, 0x6180

    .line 482
    .line 483
    const v26, 0x1aff0

    .line 484
    .line 485
    .line 486
    const-wide/16 v7, 0x0

    .line 487
    .line 488
    const/4 v9, 0x0

    .line 489
    const/4 v10, 0x0

    .line 490
    move-object v6, v4

    .line 491
    move-wide v4, v11

    .line 492
    const/4 v11, 0x0

    .line 493
    const-wide/16 v12, 0x0

    .line 494
    .line 495
    move-object/from16 v23, v14

    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const-wide/16 v15, 0x0

    .line 499
    .line 500
    const/16 v17, 0x2

    .line 501
    .line 502
    const/16 v18, 0x0

    .line 503
    .line 504
    const/16 v19, 0x2

    .line 505
    .line 506
    const/16 v20, 0x0

    .line 507
    .line 508
    const/16 v21, 0x0

    .line 509
    .line 510
    const/16 v24, 0x0

    .line 511
    .line 512
    move-object/from16 v22, v30

    .line 513
    .line 514
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v14, v23

    .line 518
    .line 519
    invoke-interface/range {p3 .. p3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    check-cast v2, La/xew;

    .line 524
    .line 525
    iget-object v2, v2, La/xew;->b:La/a4x;

    .line 526
    .line 527
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    if-nez v2, :cond_7

    .line 532
    .line 533
    const v2, 0x77167a1f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v14, v2}, La/fet;->e0(I)V

    .line 537
    .line 538
    .line 539
    const/high16 v10, 0x3f800000    # 1.0f

    .line 540
    .line 541
    invoke-static {v0, v10}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {v14}, La/xfn;->a(La/fet;)La/wfn;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    iget v3, v0, La/wfn;->e:F

    .line 550
    .line 551
    const/4 v6, 0x0

    .line 552
    const/16 v7, 0xe

    .line 553
    .line 554
    const/4 v4, 0x0

    .line 555
    const/4 v5, 0x0

    .line 556
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    sget-object v2, La/et40;->c:La/et40;

    .line 561
    .line 562
    invoke-static {v0, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    new-instance v6, La/qw3;

    .line 567
    .line 568
    new-instance v0, La/jf4;

    .line 569
    .line 570
    const/16 v3, 0xe

    .line 571
    .line 572
    invoke-direct {v0, v3}, La/jf4;-><init>(B)V

    .line 573
    .line 574
    .line 575
    const/high16 v3, 0x41000000    # 8.0f

    .line 576
    .line 577
    invoke-direct {v6, v3, v1, v0}, La/qw3;-><init>(FZLa/rw3;)V

    .line 578
    .line 579
    .line 580
    const/4 v0, 0x0

    .line 581
    const/4 v1, 0x5

    .line 582
    invoke-static {v0, v3, v0, v3, v1}, La/s5x0;->u(FFFFI)La/lh80;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    sget-object v7, La/gqw0;->j:La/yx7;

    .line 587
    .line 588
    move-object/from16 v13, p3

    .line 589
    .line 590
    invoke-virtual {v14, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    move-object/from16 v1, p0

    .line 595
    .line 596
    iget-object v1, v1, La/wew;->e:Lkotlin/jvm/functions/Function1;

    .line 597
    .line 598
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    or-int/2addr v0, v3

    .line 603
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    if-nez v0, :cond_5

    .line 608
    .line 609
    move-object/from16 v9, v29

    .line 610
    .line 611
    if-ne v3, v9, :cond_6

    .line 612
    .line 613
    :cond_5
    new-instance v3, La/d2p;

    .line 614
    .line 615
    const/16 v0, 0x16

    .line 616
    .line 617
    invoke-direct {v3, v13, v1, v0}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    :cond_6
    move-object v11, v3

    .line 624
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 625
    .line 626
    const/high16 v13, 0x30000

    .line 627
    .line 628
    move-object/from16 v23, v14

    .line 629
    .line 630
    const/16 v14, 0x1ca

    .line 631
    .line 632
    const/4 v3, 0x0

    .line 633
    const/4 v5, 0x0

    .line 634
    const/4 v8, 0x0

    .line 635
    const/4 v9, 0x0

    .line 636
    const/4 v10, 0x0

    .line 637
    move-object/from16 v12, v23

    .line 638
    .line 639
    invoke-static/range {v2 .. v14}, La/b8k0;->f(La/mm40;La/xcz;La/hh80;ZLa/ow3;La/yx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 640
    .line 641
    .line 642
    move-object v14, v12

    .line 643
    const/4 v1, 0x0

    .line 644
    invoke-virtual {v14, v1}, La/fet;->r(Z)V

    .line 645
    .line 646
    .line 647
    goto :goto_1

    .line 648
    :cond_7
    const/4 v1, 0x0

    .line 649
    const v0, 0x772af3c9

    .line 650
    .line 651
    .line 652
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v14, v1}, La/fet;->r(Z)V

    .line 656
    .line 657
    .line 658
    :goto_1
    invoke-virtual {v14, v1}, La/fet;->r(Z)V

    .line 659
    .line 660
    .line 661
    return-object p1
.end method
