.class public final synthetic La/sja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/s5h0;

.field public final synthetic d:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/s5h0;La/mm40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/sja;->a:B

    iput-object p1, p0, La/sja;->b:La/mm40;

    iput-object p2, p0, La/sja;->c:La/s5h0;

    iput-object p3, p0, La/sja;->d:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sja;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    iget-object v5, v0, La/sja;->d:La/mm40;

    .line 9
    .line 10
    iget-object v6, v0, La/sja;->c:La/s5h0;

    .line 11
    .line 12
    const/16 v7, 0x12

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x1

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v10, p1

    .line 20
    .line 21
    check-cast v10, La/y5d;

    .line 22
    .line 23
    move-object/from16 v1, p2

    .line 24
    .line 25
    check-cast v1, La/fet;

    .line 26
    .line 27
    move-object/from16 v11, p3

    .line 28
    .line 29
    check-cast v11, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v12, v11, 0x6

    .line 39
    .line 40
    if-nez v12, :cond_1

    .line 41
    .line 42
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    if-eqz v12, :cond_0

    .line 47
    .line 48
    move v3, v4

    .line 49
    :cond_0
    or-int/2addr v11, v3

    .line 50
    :cond_1
    and-int/lit8 v3, v11, 0x13

    .line 51
    .line 52
    if-eq v3, v7, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v9, v8

    .line 56
    :goto_0
    and-int/lit8 v3, v11, 0x1

    .line 57
    .line 58
    invoke-virtual {v1, v3, v9}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_5

    .line 63
    .line 64
    iget-object v3, v6, La/s5h0;->c:La/hgr0;

    .line 65
    .line 66
    invoke-interface {v3}, La/hgr0;->a()La/j83;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-interface {v3}, La/hgr0;->b()La/j83;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    sget-object v4, La/j1t0;->e:La/zfn;

    .line 75
    .line 76
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, La/g1t0;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    instance-of v4, v3, La/egr0;

    .line 90
    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    const v2, -0x6f710d68

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 97
    .line 98
    .line 99
    new-instance v2, La/ab4;

    .line 100
    .line 101
    invoke-direct {v2, v5, v3, v7}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    const v3, -0x93aafda    # -2.0009924E33f

    .line 105
    .line 106
    .line 107
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 112
    .line 113
    .line 114
    :goto_1
    move-object v15, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    instance-of v3, v3, La/fgr0;

    .line 117
    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    const v3, -0x6f6a3475

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :goto_2
    and-int/lit8 v2, v11, 0xe

    .line 131
    .line 132
    or-int/lit8 v17, v2, 0x30

    .line 133
    .line 134
    iget-object v11, v0, La/sja;->b:La/mm40;

    .line 135
    .line 136
    move-object/from16 v16, v1

    .line 137
    .line 138
    invoke-static/range {v10 .. v17}, La/bww;->w(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_4
    move-object v0, v1

    .line 143
    const v1, -0x2ce2a904

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    throw v0

    .line 151
    :cond_5
    move-object v0, v1

    .line 152
    invoke-virtual {v0}, La/fet;->X()V

    .line 153
    .line 154
    .line 155
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_0
    move-object/from16 v1, p1

    .line 159
    .line 160
    check-cast v1, La/y5d;

    .line 161
    .line 162
    move-object/from16 v10, p2

    .line 163
    .line 164
    check-cast v10, La/fet;

    .line 165
    .line 166
    move-object/from16 v11, p3

    .line 167
    .line 168
    check-cast v11, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    and-int/lit8 v12, v11, 0x6

    .line 178
    .line 179
    if-nez v12, :cond_7

    .line 180
    .line 181
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-eqz v12, :cond_6

    .line 186
    .line 187
    move v3, v4

    .line 188
    :cond_6
    or-int/2addr v11, v3

    .line 189
    :cond_7
    and-int/lit8 v3, v11, 0x13

    .line 190
    .line 191
    if-eq v3, v7, :cond_8

    .line 192
    .line 193
    move v3, v9

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    move v3, v8

    .line 196
    :goto_4
    and-int/lit8 v4, v11, 0x1

    .line 197
    .line 198
    invoke-virtual {v10, v4, v3}, La/fet;->U(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_b

    .line 203
    .line 204
    iget-object v3, v6, La/s5h0;->e:La/loa0;

    .line 205
    .line 206
    invoke-interface {v3}, La/loa0;->a()La/j83;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    move-object v7, v4

    .line 211
    invoke-interface {v3}, La/loa0;->b()La/j83;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    sget-object v12, La/j1t0;->e:La/zfn;

    .line 216
    .line 217
    invoke-virtual {v10, v12}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    check-cast v12, La/g1t0;

    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    instance-of v13, v3, La/ioa0;

    .line 231
    .line 232
    if-eqz v13, :cond_9

    .line 233
    .line 234
    const v2, -0x7ed24c59

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 238
    .line 239
    .line 240
    new-instance v2, La/uja;

    .line 241
    .line 242
    invoke-direct {v2, v5, v6, v9}, La/uja;-><init>(La/mm40;La/s5h0;B)V

    .line 243
    .line 244
    .line 245
    const v3, 0xd0233be

    .line 246
    .line 247
    .line 248
    invoke-static {v3, v2, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v10, v8}, La/fet;->r(Z)V

    .line 253
    .line 254
    .line 255
    :goto_5
    move-object v6, v2

    .line 256
    goto :goto_6

    .line 257
    :cond_9
    instance-of v3, v3, La/joa0;

    .line 258
    .line 259
    if-eqz v3, :cond_a

    .line 260
    .line 261
    const v3, -0x7eca8ded

    .line 262
    .line 263
    .line 264
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v10, v8}, La/fet;->r(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :goto_6
    and-int/lit8 v2, v11, 0xe

    .line 272
    .line 273
    or-int/lit8 v8, v2, 0x30

    .line 274
    .line 275
    iget-object v2, v0, La/sja;->b:La/mm40;

    .line 276
    .line 277
    move-object v3, v7

    .line 278
    move-object v7, v10

    .line 279
    move-object v5, v12

    .line 280
    invoke-static/range {v1 .. v8}, La/bww;->w(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 281
    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_a
    move-object v7, v10

    .line 285
    const v0, 0x42ab90d

    .line 286
    .line 287
    .line 288
    invoke-static {v0, v7, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    throw v0

    .line 293
    :cond_b
    move-object v7, v10

    .line 294
    invoke-virtual {v7}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_1
    move-object/from16 v1, p1

    .line 301
    .line 302
    check-cast v1, La/y5d;

    .line 303
    .line 304
    move-object/from16 v10, p2

    .line 305
    .line 306
    check-cast v10, La/fet;

    .line 307
    .line 308
    move-object/from16 v11, p3

    .line 309
    .line 310
    check-cast v11, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    and-int/lit8 v12, v11, 0x6

    .line 320
    .line 321
    if-nez v12, :cond_d

    .line 322
    .line 323
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v12

    .line 327
    if-eqz v12, :cond_c

    .line 328
    .line 329
    move v3, v4

    .line 330
    :cond_c
    or-int/2addr v11, v3

    .line 331
    :cond_d
    and-int/lit8 v3, v11, 0x13

    .line 332
    .line 333
    if-eq v3, v7, :cond_e

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_e
    move v9, v8

    .line 337
    :goto_8
    and-int/lit8 v3, v11, 0x1

    .line 338
    .line 339
    invoke-virtual {v10, v3, v9}, La/fet;->U(IZ)Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-eqz v3, :cond_11

    .line 344
    .line 345
    iget-object v3, v6, La/s5h0;->d:La/x0s;

    .line 346
    .line 347
    invoke-interface {v3}, La/x0s;->a()La/j83;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    move-object v7, v4

    .line 352
    invoke-interface {v3}, La/x0s;->b()La/j83;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    sget-object v9, La/j1t0;->e:La/zfn;

    .line 357
    .line 358
    invoke-virtual {v10, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    check-cast v9, La/g1t0;

    .line 363
    .line 364
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    instance-of v12, v3, La/u0s;

    .line 372
    .line 373
    if-eqz v12, :cond_f

    .line 374
    .line 375
    const v2, -0x6a625e17

    .line 376
    .line 377
    .line 378
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 379
    .line 380
    .line 381
    new-instance v2, La/uja;

    .line 382
    .line 383
    invoke-direct {v2, v5, v6, v8}, La/uja;-><init>(La/mm40;La/s5h0;B)V

    .line 384
    .line 385
    .line 386
    const v3, -0x138f1683

    .line 387
    .line 388
    .line 389
    invoke-static {v3, v2, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-virtual {v10, v8}, La/fet;->r(Z)V

    .line 394
    .line 395
    .line 396
    :goto_9
    move-object v6, v2

    .line 397
    goto :goto_a

    .line 398
    :cond_f
    instance-of v3, v3, La/v0s;

    .line 399
    .line 400
    if-eqz v3, :cond_10

    .line 401
    .line 402
    const v3, -0x6a5aa74c

    .line 403
    .line 404
    .line 405
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v10, v8}, La/fet;->r(Z)V

    .line 409
    .line 410
    .line 411
    goto :goto_9

    .line 412
    :goto_a
    and-int/lit8 v2, v11, 0xe

    .line 413
    .line 414
    or-int/lit8 v8, v2, 0x30

    .line 415
    .line 416
    iget-object v2, v0, La/sja;->b:La/mm40;

    .line 417
    .line 418
    move-object v3, v7

    .line 419
    move-object v5, v9

    .line 420
    move-object v7, v10

    .line 421
    invoke-static/range {v1 .. v8}, La/bww;->w(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 422
    .line 423
    .line 424
    goto :goto_b

    .line 425
    :cond_10
    move-object v7, v10

    .line 426
    const v0, -0x3d3d0538

    .line 427
    .line 428
    .line 429
    invoke-static {v0, v7, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    throw v0

    .line 434
    :cond_11
    move-object v7, v10

    .line 435
    invoke-virtual {v7}, La/fet;->X()V

    .line 436
    .line 437
    .line 438
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
