.class public final synthetic La/vis;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:La/xak;

.field public final synthetic f:La/nek;

.field public final synthetic g:La/ugd;

.field public final synthetic h:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;La/xak;La/nek;La/ugd;La/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vis;->a:La/l7m0;

    iput-object p2, p0, La/vis;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/vis;->c:La/l7m0;

    iput-object p4, p0, La/vis;->d:La/l7m0;

    iput-object p5, p0, La/vis;->e:La/xak;

    iput-object p6, p0, La/vis;->f:La/nek;

    iput-object p7, p0, La/vis;->g:La/ugd;

    iput-object p8, p0, La/vis;->h:La/ugd;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/b53;

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    check-cast v1, La/tf50;

    .line 7
    .line 8
    move-object/from16 v9, p3

    .line 9
    .line 10
    check-cast v9, La/fet;

    .line 11
    .line 12
    move-object/from16 v2, p4

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x30

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    and-int/lit8 v3, v2, 0x30

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v9, v3}, La/fet;->e(I)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    const/16 v3, 0x20

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/16 v3, 0x10

    .line 50
    .line 51
    :goto_0
    or-int/2addr v2, v3

    .line 52
    :cond_1
    and-int/lit16 v3, v2, 0x91

    .line 53
    .line 54
    const/16 v4, 0x90

    .line 55
    .line 56
    const/4 v12, 0x0

    .line 57
    const/4 v13, 0x1

    .line 58
    if-eq v3, v4, :cond_2

    .line 59
    .line 60
    move v3, v13

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v3, v12

    .line 63
    :goto_1
    and-int/2addr v2, v13

    .line 64
    invoke-virtual {v9, v2, v3}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_e

    .line 69
    .line 70
    sget-object v2, La/wis;->a:[I

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    aget v1, v2, v1

    .line 77
    .line 78
    iget-object v3, p0, La/vis;->a:La/l7m0;

    .line 79
    .line 80
    iget-object v6, p0, La/vis;->b:Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    sget-object v2, La/ukd;->a:La/cl5;

    .line 83
    .line 84
    if-ne v1, v13, :cond_9

    .line 85
    .line 86
    const p0, -0xc5e909c

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, p0}, La/fet;->e0(I)V

    .line 90
    .line 91
    .line 92
    sget-object p0, La/o7k0;->c:La/n0q;

    .line 93
    .line 94
    invoke-static {p0}, La/knm0;->r(La/mm40;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez v0, :cond_3

    .line 107
    .line 108
    if-ne v1, v2, :cond_4

    .line 109
    .line 110
    :cond_3
    new-instance v1, La/x6s;

    .line 111
    .line 112
    const/4 v0, 0x2

    .line 113
    invoke-direct {v1, v6, v0}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 120
    .line 121
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-nez v0, :cond_5

    .line 130
    .line 131
    if-ne v4, v2, :cond_6

    .line 132
    .line 133
    :cond_5
    new-instance v4, La/baq;

    .line 134
    .line 135
    const/16 v0, 0x13

    .line 136
    .line 137
    invoke-direct {v4, v6, v0}, La/baq;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    move-object v7, v4

    .line 144
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 145
    .line 146
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    if-ne v4, v2, :cond_8

    .line 157
    .line 158
    :cond_7
    new-instance v4, La/baq;

    .line 159
    .line 160
    const/16 v0, 0x14

    .line 161
    .line 162
    invoke-direct {v4, v6, v0}, La/baq;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_8
    move-object v8, v4

    .line 169
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    sget-object v0, La/qmk;->a:La/zcl;

    .line 184
    .line 185
    invoke-static {v9}, La/qmk;->a(La/fet;)La/wfn;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget v5, v0, La/wfn;->c:F

    .line 190
    .line 191
    sget-object v0, La/kr00;->a:La/zfn;

    .line 192
    .line 193
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, La/pjs;

    .line 198
    .line 199
    iget-boolean v2, v2, La/pjs;->h:Z

    .line 200
    .line 201
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v0, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v2, La/gc3;

    .line 210
    .line 211
    move-object v6, v1

    .line 212
    move-object v4, v3

    .line 213
    move-object v3, p0

    .line 214
    invoke-direct/range {v2 .. v8}, La/gc3;-><init>(La/mm40;La/l7m0;FLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 215
    .line 216
    .line 217
    const p0, 0x71a49a43

    .line 218
    .line 219
    .line 220
    invoke-static {p0, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    const/16 v1, 0x38

    .line 225
    .line 226
    invoke-static {v0, p0, v9, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_4

    .line 233
    .line 234
    :cond_9
    const v1, -0xc526842

    .line 235
    .line 236
    .line 237
    invoke-virtual {v9, v1}, La/fet;->e0(I)V

    .line 238
    .line 239
    .line 240
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 241
    .line 242
    sget-object v4, La/uc9;->c:La/mw3;

    .line 243
    .line 244
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 245
    .line 246
    invoke-static {v4, v5, v9, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    iget-wide v7, v9, La/fet;->T:J

    .line 251
    .line 252
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-static {v9, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 265
    .line 266
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9}, La/fet;->i0()V

    .line 270
    .line 271
    .line 272
    iget-boolean v8, v9, La/fet;->S:Z

    .line 273
    .line 274
    if-eqz v8, :cond_a

    .line 275
    .line 276
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 277
    .line 278
    invoke-virtual {v9, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 279
    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_a
    invoke-virtual {v9}, La/fet;->r0()V

    .line 283
    .line 284
    .line 285
    :goto_2
    sget-object v8, La/gqw0;->x:La/shd;

    .line 286
    .line 287
    invoke-static {v9, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 288
    .line 289
    .line 290
    sget-object v4, La/gqw0;->w:La/shd;

    .line 291
    .line 292
    invoke-static {v9, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    sget-object v5, La/gqw0;->y:La/shd;

    .line 300
    .line 301
    invoke-static {v9, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 305
    .line 306
    .line 307
    sget-object v4, La/gqw0;->v:La/shd;

    .line 308
    .line 309
    invoke-static {v9, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 310
    .line 311
    .line 312
    iget-object v1, p0, La/vis;->c:La/l7m0;

    .line 313
    .line 314
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    if-ne v4, v2, :cond_b

    .line 323
    .line 324
    new-instance v4, La/dcr;

    .line 325
    .line 326
    const/16 v2, 0x1a

    .line 327
    .line 328
    invoke-direct {v4, v2}, La/dcr;-><init>(B)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    move-object v8, v4

    .line 335
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 336
    .line 337
    new-instance v2, La/g54;

    .line 338
    .line 339
    const/16 v7, 0xa

    .line 340
    .line 341
    iget-object v4, p0, La/vis;->e:La/xak;

    .line 342
    .line 343
    iget-object v5, p0, La/vis;->f:La/nek;

    .line 344
    .line 345
    invoke-direct/range {v2 .. v7}, La/g54;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 346
    .line 347
    .line 348
    const v3, -0x595c4692

    .line 349
    .line 350
    .line 351
    invoke-static {v3, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const v10, 0x180180

    .line 356
    .line 357
    .line 358
    const/16 v11, 0x3a

    .line 359
    .line 360
    const/4 v3, 0x0

    .line 361
    const/4 v5, 0x0

    .line 362
    const/4 v6, 0x0

    .line 363
    const/4 v7, 0x0

    .line 364
    move-object v4, v8

    .line 365
    move-object v8, v2

    .line 366
    move-object v2, v1

    .line 367
    invoke-static/range {v2 .. v11}, La/ay3;->f(Ljava/lang/Object;La/mm40;Lkotlin/jvm/functions/Function1;La/u12;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/ydr;La/fet;II)V

    .line 368
    .line 369
    .line 370
    new-instance v1, La/uis;

    .line 371
    .line 372
    iget-object v2, p0, La/vis;->g:La/ugd;

    .line 373
    .line 374
    invoke-direct {v1, v2, v12}, La/uis;-><init>(La/ugd;B)V

    .line 375
    .line 376
    .line 377
    const v2, 0x15fca92b

    .line 378
    .line 379
    .line 380
    invoke-static {v2, v1, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    new-instance v2, La/uis;

    .line 385
    .line 386
    iget-object v3, p0, La/vis;->h:La/ugd;

    .line 387
    .line 388
    invoke-direct {v2, v3, v13}, La/uis;-><init>(La/ugd;B)V

    .line 389
    .line 390
    .line 391
    const v3, 0x38079752

    .line 392
    .line 393
    .line 394
    invoke-static {v3, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    iget-object p0, p0, La/vis;->d:La/l7m0;

    .line 399
    .line 400
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    check-cast p0, La/yym0;

    .line 408
    .line 409
    if-eqz p0, :cond_d

    .line 410
    .line 411
    instance-of v3, p0, La/sym0;

    .line 412
    .line 413
    if-eqz v3, :cond_c

    .line 414
    .line 415
    const v1, -0x13e42619

    .line 416
    .line 417
    .line 418
    invoke-virtual {v9, v1}, La/fet;->e0(I)V

    .line 419
    .line 420
    .line 421
    check-cast p0, La/sym0;

    .line 422
    .line 423
    iget-object p0, p0, La/sym0;->a:Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 424
    .line 425
    invoke-virtual {v2, p0, v9, v0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 429
    .line 430
    .line 431
    goto :goto_3

    .line 432
    :cond_c
    instance-of v2, p0, La/vym0;

    .line 433
    .line 434
    if-eqz v2, :cond_d

    .line 435
    .line 436
    const v2, -0x13e41ae3

    .line 437
    .line 438
    .line 439
    invoke-virtual {v9, v2}, La/fet;->e0(I)V

    .line 440
    .line 441
    .line 442
    check-cast p0, La/vym0;

    .line 443
    .line 444
    iget-object p0, p0, La/vym0;->a:Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 445
    .line 446
    invoke-virtual {v1, p0, v9, v0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 450
    .line 451
    .line 452
    :goto_3
    invoke-virtual {v9, v13}, La/fet;->r(Z)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 456
    .line 457
    .line 458
    goto :goto_4

    .line 459
    :cond_d
    const p0, -0x13e430c8

    .line 460
    .line 461
    .line 462
    invoke-static {p0, v9, v12}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 463
    .line 464
    .line 465
    move-result-object p0

    .line 466
    throw p0

    .line 467
    :cond_e
    invoke-virtual {v9}, La/fet;->X()V

    .line 468
    .line 469
    .line 470
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    return-object p0
.end method
