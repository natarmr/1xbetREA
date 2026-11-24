.class public final synthetic La/ixr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:La/wdr;

.field public final synthetic h:La/wdr;

.field public final synthetic i:La/wdr;


# direct methods
.method public synthetic constructor <init>(JLa/mm40;La/nsm0;La/pwr0;La/k6z;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ixr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/ixr0;->c:J

    iput-object p3, p0, La/ixr0;->b:La/mm40;

    iput-object p4, p0, La/ixr0;->d:Ljava/lang/Object;

    iput-object p5, p0, La/ixr0;->e:Ljava/lang/Object;

    iput-object p6, p0, La/ixr0;->f:Ljava/lang/Object;

    iput-object p7, p0, La/ixr0;->g:La/wdr;

    iput-object p8, p0, La/ixr0;->h:La/wdr;

    iput-object p9, p0, La/ixr0;->i:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/wul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p10, 0x1

    iput-byte p10, p0, La/ixr0;->a:B

    sget-object p10, La/vul;->a:La/vul;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ixr0;->b:La/mm40;

    iput-object p2, p0, La/ixr0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/ixr0;->e:Ljava/lang/Object;

    iput-object p4, p0, La/ixr0;->f:Ljava/lang/Object;

    iput-wide p5, p0, La/ixr0;->c:J

    iput-object p7, p0, La/ixr0;->g:La/wdr;

    iput-object p8, p0, La/ixr0;->h:La/wdr;

    iput-object p9, p0, La/ixr0;->i:La/wdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ixr0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    iget-object v3, v0, La/ixr0;->i:La/wdr;

    .line 7
    .line 8
    iget-object v4, v0, La/ixr0;->h:La/wdr;

    .line 9
    .line 10
    iget-object v5, v0, La/ixr0;->g:La/wdr;

    .line 11
    .line 12
    iget-object v6, v0, La/ixr0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, La/ixr0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, v0, La/ixr0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v1, La/vul;->a:La/vul;

    .line 22
    .line 23
    move-object v10, v8

    .line 24
    check-cast v10, La/wul;

    .line 25
    .line 26
    move-object v11, v7

    .line 27
    check-cast v11, La/wul;

    .line 28
    .line 29
    move-object v12, v6

    .line 30
    check-cast v12, La/wul;

    .line 31
    .line 32
    move-object v15, v5

    .line 33
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    move-object/from16 v16, v4

    .line 36
    .line 37
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 38
    .line 39
    move-object/from16 v17, v3

    .line 40
    .line 41
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 42
    .line 43
    move-object/from16 v18, p1

    .line 44
    .line 45
    check-cast v18, La/fet;

    .line 46
    .line 47
    move-object/from16 v1, p2

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, La/x8x;->L(I)I

    .line 55
    .line 56
    .line 57
    move-result v19

    .line 58
    iget-object v9, v0, La/ixr0;->b:La/mm40;

    .line 59
    .line 60
    iget-wide v13, v0, La/ixr0;->c:J

    .line 61
    .line 62
    invoke-static/range {v9 .. v19}, La/hkb;->j(La/mm40;La/wul;La/wul;La/wul;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    move-object v1, v8

    .line 69
    check-cast v1, La/nsm0;

    .line 70
    .line 71
    check-cast v7, La/pwr0;

    .line 72
    .line 73
    check-cast v6, La/k6z;

    .line 74
    .line 75
    move-object v8, v5

    .line 76
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    move-object v9, v4

    .line 79
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 80
    .line 81
    move-object v10, v3

    .line 82
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    move-object/from16 v12, p1

    .line 85
    .line 86
    check-cast v12, La/fet;

    .line 87
    .line 88
    move-object/from16 v3, p2

    .line 89
    .line 90
    check-cast v3, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    and-int/lit8 v4, v3, 0x3

    .line 97
    .line 98
    const/4 v5, 0x2

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v14, 0x1

    .line 101
    if-eq v4, v5, :cond_0

    .line 102
    .line 103
    move v4, v14

    .line 104
    goto :goto_0

    .line 105
    :cond_0
    move v4, v11

    .line 106
    :goto_0
    and-int/2addr v3, v14

    .line 107
    invoke-virtual {v12, v3, v4}, La/fet;->U(IZ)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_11

    .line 112
    .line 113
    sget-object v3, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 114
    .line 115
    invoke-static {v12}, La/zcm0;->i(La/fet;)La/djv0;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v3, v3, La/djv0;->e:La/q33;

    .line 120
    .line 121
    sget-object v4, La/bmd;->h:La/zfn;

    .line 122
    .line 123
    invoke-virtual {v12, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, La/w6k;

    .line 128
    .line 129
    invoke-virtual {v3}, La/q33;->e()La/pfx;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget v3, v3, La/pfx;->d:I

    .line 134
    .line 135
    invoke-virtual {v12, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, La/w6k;

    .line 140
    .line 141
    sget-object v13, La/qmk;->a:La/zcl;

    .line 142
    .line 143
    const/high16 v13, 0x42d00000    # 104.0f

    .line 144
    .line 145
    invoke-interface {v5, v13}, La/w6k;->w0(F)F

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-static {v5}, La/si30;->b(F)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    add-int/2addr v5, v3

    .line 154
    const v3, 0x70387061

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, La/w6k;

    .line 165
    .line 166
    invoke-static {v12}, La/xfn;->a(La/fet;)La/wfn;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    iget v4, v4, La/wfn;->d:F

    .line 171
    .line 172
    invoke-interface {v3, v4}, La/w6k;->w0(F)F

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    invoke-static {v3}, La/si30;->b(F)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v12, v11}, La/fet;->r(Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const-wide/16 v14, 0x0

    .line 188
    .line 189
    sget-object v13, La/ukd;->a:La/cl5;

    .line 190
    .line 191
    if-ne v4, v13, :cond_1

    .line 192
    .line 193
    new-instance v4, La/qkx;

    .line 194
    .line 195
    invoke-direct {v4, v14, v15}, La/qkx;-><init>(J)V

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_1
    check-cast v4, La/pz40;

    .line 206
    .line 207
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-ne v2, v13, :cond_2

    .line 212
    .line 213
    new-instance v2, La/qkx;

    .line 214
    .line 215
    invoke-direct {v2, v14, v15}, La/qkx;-><init>(J)V

    .line 216
    .line 217
    .line 218
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_2
    check-cast v2, La/pz40;

    .line 226
    .line 227
    new-array v14, v11, [Ljava/lang/Object;

    .line 228
    .line 229
    sget-object v15, La/fre0;->o:La/v0h0;

    .line 230
    .line 231
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    if-ne v11, v13, :cond_3

    .line 236
    .line 237
    new-instance v11, La/yqr0;

    .line 238
    .line 239
    move-object/from16 v23, v1

    .line 240
    .line 241
    const/4 v1, 0x6

    .line 242
    invoke-direct {v11, v1}, La/yqr0;-><init>(B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_3
    move-object/from16 v23, v1

    .line 250
    .line 251
    :goto_1
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 252
    .line 253
    const/16 v1, 0x180

    .line 254
    .line 255
    invoke-static {v14, v15, v11, v12, v1}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, La/ngk0;

    .line 260
    .line 261
    iget-wide v14, v0, La/ixr0;->c:J

    .line 262
    .line 263
    invoke-virtual {v12, v14, v15}, La/fet;->f(J)Z

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v18

    .line 271
    or-int v11, v11, v18

    .line 272
    .line 273
    invoke-virtual {v12, v3}, La/fet;->e(I)Z

    .line 274
    .line 275
    .line 276
    move-result v18

    .line 277
    or-int v11, v11, v18

    .line 278
    .line 279
    invoke-virtual {v12, v5}, La/fet;->e(I)Z

    .line 280
    .line 281
    .line 282
    move-result v18

    .line 283
    or-int v11, v11, v18

    .line 284
    .line 285
    move-object/from16 v18, v1

    .line 286
    .line 287
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-nez v11, :cond_4

    .line 292
    .line 293
    if-ne v1, v13, :cond_5

    .line 294
    .line 295
    :cond_4
    move-wide/from16 v31, v14

    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_5
    move/from16 v19, v3

    .line 299
    .line 300
    move-wide/from16 v31, v14

    .line 301
    .line 302
    const-wide/16 v24, 0x0

    .line 303
    .line 304
    move-object v15, v1

    .line 305
    move-object/from16 v1, v18

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :goto_2
    new-instance v15, La/o6s0;

    .line 309
    .line 310
    new-instance v1, La/jxr0;

    .line 311
    .line 312
    const/4 v11, 0x0

    .line 313
    invoke-direct {v1, v4, v11}, La/jxr0;-><init>(La/pz40;B)V

    .line 314
    .line 315
    .line 316
    new-instance v11, La/jxr0;

    .line 317
    .line 318
    const/4 v14, 0x1

    .line 319
    invoke-direct {v11, v2, v14}, La/jxr0;-><init>(La/pz40;B)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v21, v1

    .line 323
    .line 324
    move/from16 v19, v3

    .line 325
    .line 326
    move/from16 v20, v5

    .line 327
    .line 328
    move-object/from16 v22, v11

    .line 329
    .line 330
    move-wide/from16 v16, v31

    .line 331
    .line 332
    const-wide/16 v24, 0x0

    .line 333
    .line 334
    invoke-direct/range {v15 .. v22}, La/o6s0;-><init>(JLa/ngk0;IILa/jxr0;La/jxr0;)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v1, v18

    .line 338
    .line 339
    invoke-virtual {v12, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :goto_3
    check-cast v15, La/o6s0;

    .line 343
    .line 344
    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-virtual {v1, v3}, La/ngk0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    check-cast v3, La/ne60;

    .line 353
    .line 354
    move-object v11, v6

    .line 355
    if-eqz v3, :cond_6

    .line 356
    .line 357
    iget-wide v5, v3, La/ne60;->a:J

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_6
    move-wide/from16 v5, v24

    .line 361
    .line 362
    :goto_4
    invoke-static {v12}, La/wzk0;->a(La/fet;)La/sjj;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    move-object v14, v7

    .line 367
    move-object/from16 v16, v8

    .line 368
    .line 369
    move-wide/from16 v7, v31

    .line 370
    .line 371
    invoke-virtual {v12, v7, v8}, La/fet;->f(J)Z

    .line 372
    .line 373
    .line 374
    move-result v17

    .line 375
    move-object/from16 v18, v3

    .line 376
    .line 377
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    move-object/from16 v20, v9

    .line 382
    .line 383
    if-nez v17, :cond_8

    .line 384
    .line 385
    if-ne v3, v13, :cond_7

    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_7
    move-wide/from16 v21, v5

    .line 389
    .line 390
    move-object/from16 v33, v10

    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_8
    :goto_5
    new-instance v3, La/t33;

    .line 394
    .line 395
    new-instance v9, La/ne60;

    .line 396
    .line 397
    invoke-direct {v9, v5, v6}, La/ne60;-><init>(J)V

    .line 398
    .line 399
    .line 400
    move-wide/from16 v21, v5

    .line 401
    .line 402
    sget-object v5, La/hp4;->o:La/lxs0;

    .line 403
    .line 404
    const/16 v6, 0xc

    .line 405
    .line 406
    move-object/from16 v33, v10

    .line 407
    .line 408
    const/4 v10, 0x0

    .line 409
    invoke-direct {v3, v9, v5, v10, v6}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :goto_6
    check-cast v3, La/t33;

    .line 416
    .line 417
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    if-ne v5, v13, :cond_9

    .line 422
    .line 423
    sget-object v5, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 424
    .line 425
    invoke-static {v5, v12}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    :cond_9
    check-cast v5, La/vne;

    .line 433
    .line 434
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    if-ne v6, v13, :cond_a

    .line 439
    .line 440
    const/16 v17, 0x0

    .line 441
    .line 442
    invoke-static/range {v17 .. v17}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    invoke-virtual {v12, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    :cond_a
    check-cast v6, La/pz40;

    .line 450
    .line 451
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v17

    .line 463
    or-int v10, v10, v17

    .line 464
    .line 465
    invoke-virtual {v12, v7, v8}, La/fet;->f(J)Z

    .line 466
    .line 467
    .line 468
    move-result v17

    .line 469
    or-int v10, v10, v17

    .line 470
    .line 471
    move-object/from16 v26, v1

    .line 472
    .line 473
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    if-nez v10, :cond_c

    .line 478
    .line 479
    if-ne v1, v13, :cond_b

    .line 480
    .line 481
    goto :goto_7

    .line 482
    :cond_b
    move-object/from16 v25, v3

    .line 483
    .line 484
    move-wide/from16 v31, v7

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :cond_c
    :goto_7
    new-instance v24, La/f6n0;

    .line 488
    .line 489
    const/16 v29, 0x0

    .line 490
    .line 491
    const/16 v30, 0x1

    .line 492
    .line 493
    move-object/from16 v25, v3

    .line 494
    .line 495
    move-wide/from16 v27, v7

    .line 496
    .line 497
    invoke-direct/range {v24 .. v30}, La/f6n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 498
    .line 499
    .line 500
    move-object/from16 v1, v24

    .line 501
    .line 502
    move-wide/from16 v31, v27

    .line 503
    .line 504
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    :goto_8
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 508
    .line 509
    invoke-static {v12, v9, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 510
    .line 511
    .line 512
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 513
    .line 514
    iget-object v0, v0, La/ixr0;->b:La/mm40;

    .line 515
    .line 516
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-static {v0}, La/lgb;->K(La/mm40;)La/mm40;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v12, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    if-nez v1, :cond_d

    .line 533
    .line 534
    if-ne v3, v13, :cond_e

    .line 535
    .line 536
    :cond_d
    new-instance v3, La/b8q0;

    .line 537
    .line 538
    const/16 v1, 0x17

    .line 539
    .line 540
    invoke-direct {v3, v15, v4, v1}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 547
    .line 548
    invoke-static {v0, v3}, La/fre0;->Y(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    new-instance v24, La/p5s0;

    .line 575
    .line 576
    move-object/from16 v28, v15

    .line 577
    .line 578
    move-object/from16 v29, v18

    .line 579
    .line 580
    move-object/from16 v27, v25

    .line 581
    .line 582
    move-object/from16 v30, v26

    .line 583
    .line 584
    move-object/from16 v26, v5

    .line 585
    .line 586
    move-object/from16 v25, v6

    .line 587
    .line 588
    invoke-direct/range {v24 .. v32}, La/p5s0;-><init>(La/pz40;La/vne;La/t33;La/o6s0;La/sjj;La/ngk0;J)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v3, v24

    .line 592
    .line 593
    invoke-static {v0, v1, v3}, La/fnn0;->a(La/mm40;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)La/mm40;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    sget-object v1, La/gqw0;->a:La/zx7;

    .line 598
    .line 599
    const/4 v3, 0x0

    .line 600
    invoke-static {v1, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    iget-wide v3, v12, La/fet;->T:J

    .line 605
    .line 606
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    invoke-static {v12, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 619
    .line 620
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, La/fet;->i0()V

    .line 624
    .line 625
    .line 626
    iget-boolean v5, v12, La/fet;->S:Z

    .line 627
    .line 628
    if-eqz v5, :cond_f

    .line 629
    .line 630
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 631
    .line 632
    invoke-virtual {v12, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 633
    .line 634
    .line 635
    goto :goto_9

    .line 636
    :cond_f
    invoke-virtual {v12}, La/fet;->r0()V

    .line 637
    .line 638
    .line 639
    :goto_9
    sget-object v5, La/gqw0;->x:La/shd;

    .line 640
    .line 641
    invoke-static {v12, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 642
    .line 643
    .line 644
    sget-object v1, La/gqw0;->w:La/shd;

    .line 645
    .line 646
    invoke-static {v12, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 647
    .line 648
    .line 649
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    sget-object v3, La/gqw0;->y:La/shd;

    .line 654
    .line 655
    invoke-static {v12, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 656
    .line 657
    .line 658
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 659
    .line 660
    .line 661
    sget-object v1, La/gqw0;->v:La/shd;

    .line 662
    .line 663
    invoke-static {v12, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    if-ne v0, v13, :cond_10

    .line 671
    .line 672
    new-instance v0, La/dbo0;

    .line 673
    .line 674
    const/4 v1, 0x7

    .line 675
    invoke-direct {v0, v2, v1}, La/dbo0;-><init>(La/pz40;B)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    :cond_10
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 682
    .line 683
    const/4 v13, 0x6

    .line 684
    move-object v3, v11

    .line 685
    move-object v2, v14

    .line 686
    move-object/from16 v8, v16

    .line 687
    .line 688
    move/from16 v7, v19

    .line 689
    .line 690
    move-object/from16 v9, v20

    .line 691
    .line 692
    move-wide/from16 v4, v21

    .line 693
    .line 694
    move-object/from16 v1, v23

    .line 695
    .line 696
    move-object/from16 v6, v28

    .line 697
    .line 698
    move-object/from16 v10, v33

    .line 699
    .line 700
    move-object v11, v0

    .line 701
    invoke-static/range {v1 .. v13}, La/iom0;->c(La/nsm0;La/pwr0;La/k6z;JLa/o6s0;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 702
    .line 703
    .line 704
    const/4 v14, 0x1

    .line 705
    invoke-virtual {v12, v14}, La/fet;->r(Z)V

    .line 706
    .line 707
    .line 708
    goto :goto_a

    .line 709
    :cond_11
    invoke-virtual {v12}, La/fet;->X()V

    .line 710
    .line 711
    .line 712
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 713
    .line 714
    return-object v0

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
