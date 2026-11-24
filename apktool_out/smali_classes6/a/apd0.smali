.class public final synthetic La/apd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ftv0;JLa/ywv0;La/l7m0;La/dvv0;La/ugd;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/apd0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/apd0;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/apd0;->b:J

    iput-object p4, p0, La/apd0;->d:Ljava/lang/Object;

    iput-object p5, p0, La/apd0;->e:Ljava/lang/Object;

    iput-object p6, p0, La/apd0;->f:Ljava/lang/Object;

    iput-object p7, p0, La/apd0;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/w6k;Ljava/lang/String;La/y9q0;Ljava/lang/String;JLa/g9q0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/apd0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/apd0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/apd0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/apd0;->f:Ljava/lang/Object;

    iput-object p4, p0, La/apd0;->e:Ljava/lang/Object;

    iput-wide p5, p0, La/apd0;->b:J

    iput-object p7, p0, La/apd0;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/apd0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    sget-object v6, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    iget-object v7, v0, La/apd0;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v8, v0, La/apd0;->f:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, La/apd0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v10, v0, La/apd0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v11, v0, La/apd0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v11, La/ftv0;

    .line 26
    .line 27
    move-object v13, v10

    .line 28
    check-cast v13, La/ywv0;

    .line 29
    .line 30
    move-object v15, v9

    .line 31
    check-cast v15, La/l7m0;

    .line 32
    .line 33
    move-object/from16 v16, v8

    .line 34
    .line 35
    check-cast v16, La/dvv0;

    .line 36
    .line 37
    move-object/from16 v18, v7

    .line 38
    .line 39
    check-cast v18, La/ugd;

    .line 40
    .line 41
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, La/j810;

    .line 44
    .line 45
    move-object/from16 v7, p2

    .line 46
    .line 47
    check-cast v7, La/fet;

    .line 48
    .line 49
    move-object/from16 v8, p3

    .line 50
    .line 51
    check-cast v8, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    and-int/lit8 v1, v8, 0x11

    .line 61
    .line 62
    const/16 v9, 0x10

    .line 63
    .line 64
    if-eq v1, v9, :cond_0

    .line 65
    .line 66
    move v4, v5

    .line 67
    :cond_0
    and-int/lit8 v1, v8, 0x1

    .line 68
    .line 69
    invoke-virtual {v7, v1, v4}, La/fet;->U(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    iget-object v14, v11, La/ftv0;->a:La/nuv0;

    .line 76
    .line 77
    iget-wide v0, v0, La/apd0;->b:J

    .line 78
    .line 79
    shr-long/2addr v0, v3

    .line 80
    long-to-int v0, v0

    .line 81
    sget-object v1, La/jm40;->b:La/jm40;

    .line 82
    .line 83
    sget-object v3, La/gqw0;->h:La/zx7;

    .line 84
    .line 85
    sget-object v4, La/jr8;->a:La/jr8;

    .line 86
    .line 87
    invoke-virtual {v4, v1, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v7, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-nez v3, :cond_1

    .line 100
    .line 101
    if-ne v4, v6, :cond_2

    .line 102
    .line 103
    :cond_1
    new-instance v4, La/gtv0;

    .line 104
    .line 105
    invoke-direct {v4, v13, v2}, La/gtv0;-><init>(La/ywv0;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 112
    .line 113
    invoke-static {v1, v4}, La/x4d0;->e0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-boolean v2, v11, La/ftv0;->b:Z

    .line 118
    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    invoke-static {v13}, La/pvm0;->s(La/ywv0;)La/bxv0;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v2, v2, La/bxv0;->a:La/cxv0;

    .line 126
    .line 127
    const/high16 v2, 0x44000000    # 512.0f

    .line 128
    .line 129
    invoke-static {v1, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    goto :goto_0

    .line 134
    :cond_3
    const/high16 v2, 0x3f800000    # 1.0f

    .line 135
    .line 136
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    :goto_0
    invoke-virtual {v7, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    if-nez v2, :cond_4

    .line 149
    .line 150
    if-ne v3, v6, :cond_5

    .line 151
    .line 152
    :cond_4
    new-instance v3, La/gtv0;

    .line 153
    .line 154
    const/4 v2, 0x3

    .line 155
    invoke-direct {v3, v13, v2}, La/gtv0;-><init>(La/ywv0;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 162
    .line 163
    invoke-static {v1, v3}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    const/high16 v20, 0x180000

    .line 168
    .line 169
    move/from16 v17, v0

    .line 170
    .line 171
    move-object/from16 v19, v7

    .line 172
    .line 173
    invoke-static/range {v12 .. v20}, La/vsm0;->i(La/mm40;La/ywv0;La/nuv0;La/l7m0;La/dvv0;ILa/ugd;La/fet;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_6
    move-object/from16 v19, v7

    .line 178
    .line 179
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_0
    check-cast v11, La/w6k;

    .line 186
    .line 187
    move-object v13, v10

    .line 188
    check-cast v13, Ljava/lang/String;

    .line 189
    .line 190
    move-object v14, v8

    .line 191
    check-cast v14, La/y9q0;

    .line 192
    .line 193
    check-cast v9, Ljava/lang/String;

    .line 194
    .line 195
    move-object v12, v7

    .line 196
    check-cast v12, La/g9q0;

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/lr8;

    .line 201
    .line 202
    move-object/from16 v7, p2

    .line 203
    .line 204
    check-cast v7, La/fet;

    .line 205
    .line 206
    move-object/from16 v8, p3

    .line 207
    .line 208
    check-cast v8, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    and-int/lit8 v10, v8, 0x6

    .line 218
    .line 219
    if-nez v10, :cond_8

    .line 220
    .line 221
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-eqz v10, :cond_7

    .line 226
    .line 227
    const/4 v2, 0x4

    .line 228
    :cond_7
    or-int/2addr v8, v2

    .line 229
    :cond_8
    and-int/lit8 v2, v8, 0x13

    .line 230
    .line 231
    const/16 v10, 0x12

    .line 232
    .line 233
    if-eq v2, v10, :cond_9

    .line 234
    .line 235
    move v4, v5

    .line 236
    :cond_9
    and-int/lit8 v2, v8, 0x1

    .line 237
    .line 238
    invoke-virtual {v7, v2, v4}, La/fet;->U(IZ)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eqz v2, :cond_10

    .line 243
    .line 244
    invoke-virtual {v1}, La/lr8;->d()F

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-interface {v11, v1}, La/w6k;->w0(F)F

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    float-to-int v1, v1

    .line 253
    const/high16 v2, 0x40800000    # 4.0f

    .line 254
    .line 255
    invoke-interface {v11, v2}, La/w6k;->w0(F)F

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    float-to-int v2, v2

    .line 260
    invoke-virtual {v7, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    invoke-virtual {v7, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    or-int/2addr v4, v5

    .line 269
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-nez v4, :cond_a

    .line 274
    .line 275
    if-ne v5, v6, :cond_b

    .line 276
    .line 277
    :cond_a
    const/16 v19, 0x0

    .line 278
    .line 279
    const/16 v20, 0x3fc

    .line 280
    .line 281
    const/4 v15, 0x0

    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    const-wide/16 v17, 0x0

    .line 285
    .line 286
    invoke-static/range {v12 .. v20}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    iget-wide v4, v4, La/a9q0;->c:J

    .line 291
    .line 292
    shr-long/2addr v4, v3

    .line 293
    long-to-int v4, v4

    .line 294
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_b
    check-cast v5, Ljava/lang/Number;

    .line 302
    .line 303
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    invoke-virtual {v7, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    invoke-virtual {v7, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    or-int/2addr v5, v8

    .line 316
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    if-nez v5, :cond_c

    .line 321
    .line 322
    if-ne v8, v6, :cond_d

    .line 323
    .line 324
    :cond_c
    const/16 v21, 0x0

    .line 325
    .line 326
    const/16 v22, 0x3fc

    .line 327
    .line 328
    const/16 v17, 0x0

    .line 329
    .line 330
    const/16 v18, 0x0

    .line 331
    .line 332
    const-wide/16 v19, 0x0

    .line 333
    .line 334
    move-object v15, v9

    .line 335
    move-object/from16 v16, v14

    .line 336
    .line 337
    move-object v14, v12

    .line 338
    invoke-static/range {v14 .. v22}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    move-object/from16 v14, v16

    .line 343
    .line 344
    iget-wide v5, v5, La/a9q0;->c:J

    .line 345
    .line 346
    shr-long/2addr v5, v3

    .line 347
    long-to-int v5, v5

    .line 348
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    :cond_d
    check-cast v8, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    add-int/2addr v5, v4

    .line 362
    add-int/2addr v5, v2

    .line 363
    if-gt v5, v1, :cond_e

    .line 364
    .line 365
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 366
    .line 367
    new-instance v1, Lkotlin/Pair;

    .line 368
    .line 369
    invoke-direct {v1, v14, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    move-object v15, v9

    .line 373
    goto :goto_2

    .line 374
    :cond_e
    const/16 v31, 0x0

    .line 375
    .line 376
    const v32, 0xfffffd

    .line 377
    .line 378
    .line 379
    const-wide/16 v15, 0x0

    .line 380
    .line 381
    iget-wide v4, v0, La/apd0;->b:J

    .line 382
    .line 383
    const/16 v19, 0x0

    .line 384
    .line 385
    const/16 v20, 0x0

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const-wide/16 v22, 0x0

    .line 390
    .line 391
    const/16 v24, 0x0

    .line 392
    .line 393
    const/16 v25, 0x0

    .line 394
    .line 395
    const/16 v26, 0x0

    .line 396
    .line 397
    const/16 v27, 0x0

    .line 398
    .line 399
    const-wide/16 v28, 0x0

    .line 400
    .line 401
    const/16 v30, 0x0

    .line 402
    .line 403
    move-wide/from16 v17, v4

    .line 404
    .line 405
    invoke-static/range {v14 .. v32}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 406
    .line 407
    .line 408
    move-result-object v14

    .line 409
    const/16 v20, 0x3fc

    .line 410
    .line 411
    const/4 v15, 0x0

    .line 412
    const/16 v16, 0x0

    .line 413
    .line 414
    const-wide/16 v17, 0x0

    .line 415
    .line 416
    invoke-static/range {v12 .. v20}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iget-wide v4, v0, La/a9q0;->c:J

    .line 421
    .line 422
    shr-long/2addr v4, v3

    .line 423
    long-to-int v0, v4

    .line 424
    const/16 v22, 0x0

    .line 425
    .line 426
    const/16 v23, 0x3fc

    .line 427
    .line 428
    const/16 v18, 0x0

    .line 429
    .line 430
    const/16 v19, 0x0

    .line 431
    .line 432
    const-wide/16 v20, 0x0

    .line 433
    .line 434
    move-object/from16 v16, v9

    .line 435
    .line 436
    move-object v15, v12

    .line 437
    move-object/from16 v17, v14

    .line 438
    .line 439
    invoke-static/range {v15 .. v23}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    move-object/from16 v15, v16

    .line 444
    .line 445
    iget-wide v4, v4, La/a9q0;->c:J

    .line 446
    .line 447
    shr-long v3, v4, v3

    .line 448
    .line 449
    long-to-int v3, v3

    .line 450
    add-int/2addr v0, v3

    .line 451
    add-int/2addr v0, v2

    .line 452
    if-gt v0, v1, :cond_f

    .line 453
    .line 454
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 455
    .line 456
    new-instance v1, Lkotlin/Pair;

    .line 457
    .line 458
    invoke-direct {v1, v14, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto :goto_2

    .line 462
    :cond_f
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 463
    .line 464
    new-instance v1, Lkotlin/Pair;

    .line 465
    .line 466
    invoke-direct {v1, v14, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    :goto_2
    iget-object v0, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v0, La/y9q0;

    .line 472
    .line 473
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v1, Ljava/lang/Boolean;

    .line 476
    .line 477
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    sget-object v2, La/bmd;->n:La/zfn;

    .line 482
    .line 483
    sget-object v3, La/k6z;->a:La/k6z;

    .line 484
    .line 485
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    new-instance v3, La/lfc0;

    .line 490
    .line 491
    invoke-direct {v3, v1, v13, v0, v15}, La/lfc0;-><init>(ZLjava/lang/String;La/y9q0;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    const v0, 0x5ebeb9b8

    .line 495
    .line 496
    .line 497
    invoke-static {v0, v3, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const/16 v1, 0x38

    .line 502
    .line 503
    invoke-static {v2, v0, v7, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 504
    .line 505
    .line 506
    goto :goto_3

    .line 507
    :cond_10
    invoke-virtual {v7}, La/fet;->X()V

    .line 508
    .line 509
    .line 510
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 511
    .line 512
    return-object v0

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
