.class public final synthetic La/q42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q42;->a:B

    iput-object p1, p0, La/q42;->b:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q42;->a:B

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x2

    .line 9
    const/high16 v5, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sget-object v6, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v0, v0, La/q42;->b:La/pz40;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/u63;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, La/fet;

    .line 27
    .line 28
    move-object/from16 v3, p3

    .line 29
    .line 30
    check-cast v3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v3, 0x11

    .line 40
    .line 41
    const/16 v4, 0x10

    .line 42
    .line 43
    if-eq v1, v4, :cond_0

    .line 44
    .line 45
    move v8, v7

    .line 46
    :cond_0
    and-int/lit8 v1, v3, 0x1

    .line 47
    .line 48
    invoke-virtual {v2, v1, v8}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    sget-object v1, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    const/4 v11, 0x0

    .line 61
    const/16 v12, 0xd

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    const/high16 v9, 0x40c00000    # 6.0f

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/u2e0;

    .line 76
    .line 77
    iget-object v9, v0, La/u2e0;->g:Ljava/lang/String;

    .line 78
    .line 79
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 80
    .line 81
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 86
    .line 87
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 92
    .line 93
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/g1t0;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 103
    .line 104
    .line 105
    move-result-object v29

    .line 106
    new-instance v0, La/f2q0;

    .line 107
    .line 108
    const/4 v1, 0x3

    .line 109
    invoke-direct {v0, v1}, La/f2q0;-><init>(I)V

    .line 110
    .line 111
    .line 112
    const/16 v32, 0x6180

    .line 113
    .line 114
    const v33, 0x1abf8

    .line 115
    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    const-wide/16 v14, 0x0

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    const/16 v18, 0x0

    .line 125
    .line 126
    const-wide/16 v19, 0x0

    .line 127
    .line 128
    const-wide/16 v22, 0x0

    .line 129
    .line 130
    const/16 v24, 0x2

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v26, 0x6

    .line 135
    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const/16 v28, 0x0

    .line 139
    .line 140
    const/16 v31, 0x0

    .line 141
    .line 142
    move-object/from16 v21, v0

    .line 143
    .line 144
    move-object/from16 v30, v2

    .line 145
    .line 146
    invoke-static/range {v9 .. v33}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_1
    move-object/from16 v30, v2

    .line 151
    .line 152
    invoke-virtual/range {v30 .. v30}, La/fet;->X()V

    .line 153
    .line 154
    .line 155
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_0
    move-object/from16 v1, p1

    .line 159
    .line 160
    check-cast v1, La/ob50;

    .line 161
    .line 162
    move-object/from16 v5, p2

    .line 163
    .line 164
    check-cast v5, La/fet;

    .line 165
    .line 166
    move-object/from16 v6, p3

    .line 167
    .line 168
    check-cast v6, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    and-int/lit8 v9, v6, 0x6

    .line 175
    .line 176
    if-nez v9, :cond_3

    .line 177
    .line 178
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-eqz v9, :cond_2

    .line 183
    .line 184
    move v9, v3

    .line 185
    goto :goto_1

    .line 186
    :cond_2
    move v9, v4

    .line 187
    :goto_1
    or-int/2addr v6, v9

    .line 188
    :cond_3
    and-int/lit8 v9, v6, 0x13

    .line 189
    .line 190
    if-eq v9, v2, :cond_4

    .line 191
    .line 192
    move v2, v7

    .line 193
    goto :goto_2

    .line 194
    :cond_4
    move v2, v8

    .line 195
    :goto_2
    and-int/lit8 v9, v6, 0x1

    .line 196
    .line 197
    invoke-virtual {v5, v9, v2}, La/fet;->U(IZ)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_d

    .line 202
    .line 203
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Ljava/util/List;

    .line 208
    .line 209
    and-int/lit8 v2, v6, 0xe

    .line 210
    .line 211
    if-ne v2, v3, :cond_5

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_5
    move v7, v8

    .line 215
    :goto_3
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-nez v7, :cond_6

    .line 220
    .line 221
    sget-object v3, La/ukd;->a:La/cl5;

    .line 222
    .line 223
    if-ne v2, v3, :cond_7

    .line 224
    .line 225
    :cond_6
    new-instance v2, La/b33;

    .line 226
    .line 227
    const/16 v3, 0x13

    .line 228
    .line 229
    invoke-direct {v2, v1, v3}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 236
    .line 237
    instance-of v3, v0, Ljava/util/RandomAccess;

    .line 238
    .line 239
    if-eqz v3, :cond_9

    .line 240
    .line 241
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    move v6, v8

    .line 246
    :goto_4
    if-ge v6, v3, :cond_c

    .line 247
    .line 248
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-interface {v2, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    check-cast v7, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    if-eqz v7, :cond_8

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_9
    if-eqz v0, :cond_a

    .line 269
    .line 270
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_a

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_c

    .line 286
    .line 287
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    check-cast v3, Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_b

    .line 302
    .line 303
    :goto_5
    sget-object v0, La/lkz;->e:La/lkz;

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_c
    :goto_6
    sget-object v0, La/lkz;->c:La/lkz;

    .line 307
    .line 308
    :goto_7
    invoke-static {v0, v5, v4}, La/r8x;->V(La/lkz;La/fet;I)La/wjd;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    sget-object v2, La/or00;->a:La/zfn;

    .line 313
    .line 314
    invoke-virtual {v2, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    new-instance v2, La/yb5;

    .line 319
    .line 320
    invoke-direct {v2, v1, v8}, La/yb5;-><init>(La/ob50;B)V

    .line 321
    .line 322
    .line 323
    const v1, -0x6624bf14

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v2, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    const/16 v2, 0x38

    .line 331
    .line 332
    invoke-static {v0, v1, v5, v2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 333
    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_d
    invoke-virtual {v5}, La/fet;->X()V

    .line 337
    .line 338
    .line 339
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_1
    move-object/from16 v1, p1

    .line 343
    .line 344
    check-cast v1, La/y5d;

    .line 345
    .line 346
    move-object/from16 v9, p2

    .line 347
    .line 348
    check-cast v9, La/fet;

    .line 349
    .line 350
    move-object/from16 v10, p3

    .line 351
    .line 352
    check-cast v10, Ljava/lang/Integer;

    .line 353
    .line 354
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    sget-object v11, La/t42;->p2:La/jdk0;

    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    and-int/lit8 v11, v10, 0x6

    .line 364
    .line 365
    if-nez v11, :cond_f

    .line 366
    .line 367
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    if-eqz v11, :cond_e

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_e
    move v3, v4

    .line 375
    :goto_9
    or-int/2addr v10, v3

    .line 376
    :cond_f
    and-int/lit8 v3, v10, 0x13

    .line 377
    .line 378
    if-eq v3, v2, :cond_10

    .line 379
    .line 380
    move v8, v7

    .line 381
    :cond_10
    and-int/lit8 v2, v10, 0x1

    .line 382
    .line 383
    invoke-virtual {v9, v2, v8}, La/fet;->U(IZ)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_11

    .line 388
    .line 389
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 394
    .line 395
    invoke-virtual {v1, v2, v3}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    sget-object v1, La/qmk;->a:La/zcl;

    .line 400
    .line 401
    const/4 v14, 0x0

    .line 402
    const/16 v15, 0xd

    .line 403
    .line 404
    const/4 v11, 0x0

    .line 405
    const/high16 v12, 0x41c00000    # 24.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, La/d52;

    .line 417
    .line 418
    iget-object v10, v0, La/d52;->a:Ljava/lang/String;

    .line 419
    .line 420
    const/16 v17, 0x0

    .line 421
    .line 422
    const/16 v18, 0x1c

    .line 423
    .line 424
    const-wide/16 v11, 0x0

    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    const-wide/16 v14, 0x0

    .line 428
    .line 429
    move-object/from16 v16, v9

    .line 430
    .line 431
    move-object v9, v1

    .line 432
    invoke-static/range {v9 .. v18}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 433
    .line 434
    .line 435
    goto :goto_a

    .line 436
    :cond_11
    move-object/from16 v16, v9

    .line 437
    .line 438
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 439
    .line 440
    .line 441
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object v0

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
