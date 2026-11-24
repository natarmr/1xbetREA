.class public final La/mjv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/trn;


# static fields
.field public static final l:[F


# instance fields
.field public final a:La/cyu;

.field public final b:La/fq80;

.field public final c:[Z

.field public final d:La/kjv;

.field public final e:La/y850;

.field public f:La/ljv;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:La/ncs0;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, La/mjv;->l:[F

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(La/cyu;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mjv;->a:La/cyu;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, La/mjv;->c:[Z

    .line 10
    .line 11
    new-instance p1, La/kjv;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x80

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    iput-object v0, p1, La/kjv;->e:Ljava/io/Serializable;

    .line 21
    .line 22
    iput-object p1, p0, La/mjv;->d:La/kjv;

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, La/mjv;->k:J

    .line 30
    .line 31
    new-instance p1, La/y850;

    .line 32
    .line 33
    const/16 v0, 0xb2

    .line 34
    .line 35
    invoke-direct {p1, v0}, La/y850;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/mjv;->e:La/y850;

    .line 39
    .line 40
    new-instance p1, La/fq80;

    .line 41
    .line 42
    invoke-direct {p1}, La/fq80;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, La/mjv;->b:La/fq80;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(La/fq80;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/mjv;->f:La/ljv;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/mjv;->i:La/ncs0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v2, v1, La/fq80;->b:I

    .line 16
    .line 17
    iget v3, v1, La/fq80;->c:I

    .line 18
    .line 19
    iget-object v4, v1, La/fq80;->a:[B

    .line 20
    .line 21
    iget-wide v5, v0, La/mjv;->g:J

    .line 22
    .line 23
    invoke-virtual {v1}, La/fq80;->a()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    int-to-long v7, v7

    .line 28
    add-long/2addr v5, v7

    .line 29
    iput-wide v5, v0, La/mjv;->g:J

    .line 30
    .line 31
    iget-object v5, v0, La/mjv;->i:La/ncs0;

    .line 32
    .line 33
    invoke-virtual {v1}, La/fq80;->a()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-interface {v5, v6, v1}, La/ncs0;->a(ILa/fq80;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object v5, v0, La/mjv;->c:[Z

    .line 41
    .line 42
    invoke-static {v4, v2, v3, v5}, La/ntr;->a0([BII[Z)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    iget-object v6, v0, La/mjv;->d:La/kjv;

    .line 47
    .line 48
    iget-object v7, v0, La/mjv;->e:La/y850;

    .line 49
    .line 50
    if-ne v5, v3, :cond_2

    .line 51
    .line 52
    iget-boolean v1, v0, La/mjv;->j:Z

    .line 53
    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {v6, v4, v2, v3}, La/kjv;->b([BII)V

    .line 57
    .line 58
    .line 59
    :cond_0
    iget-object v0, v0, La/mjv;->f:La/ljv;

    .line 60
    .line 61
    invoke-virtual {v0, v4, v2, v3}, La/ljv;->a([BII)V

    .line 62
    .line 63
    .line 64
    if-eqz v7, :cond_1

    .line 65
    .line 66
    invoke-virtual {v7, v4, v2, v3}, La/y850;->a([BII)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void

    .line 70
    :cond_2
    iget-object v8, v1, La/fq80;->a:[B

    .line 71
    .line 72
    add-int/lit8 v9, v5, 0x3

    .line 73
    .line 74
    aget-byte v8, v8, v9

    .line 75
    .line 76
    and-int/lit16 v10, v8, 0xff

    .line 77
    .line 78
    sub-int v11, v5, v2

    .line 79
    .line 80
    iget-boolean v12, v0, La/mjv;->j:Z

    .line 81
    .line 82
    if-nez v12, :cond_19

    .line 83
    .line 84
    if-lez v11, :cond_3

    .line 85
    .line 86
    invoke-virtual {v6, v4, v2, v5}, La/kjv;->b([BII)V

    .line 87
    .line 88
    .line 89
    :cond_3
    if-gez v11, :cond_4

    .line 90
    .line 91
    neg-int v12, v11

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    const/4 v12, 0x0

    .line 94
    :goto_1
    iget-byte v15, v6, La/kjv;->d:B

    .line 95
    .line 96
    if-eqz v15, :cond_17

    .line 97
    .line 98
    const-string v13, "H263Reader"

    .line 99
    .line 100
    const-string v14, "Unexpected start code value"

    .line 101
    .line 102
    move/from16 v16, v3

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    if-eq v15, v3, :cond_15

    .line 106
    .line 107
    const/4 v3, 0x2

    .line 108
    if-eq v15, v3, :cond_13

    .line 109
    .line 110
    const/4 v3, 0x4

    .line 111
    move/from16 v17, v9

    .line 112
    .line 113
    const/4 v9, 0x3

    .line 114
    if-eq v15, v9, :cond_11

    .line 115
    .line 116
    if-ne v15, v3, :cond_10

    .line 117
    .line 118
    const/16 v8, 0xb3

    .line 119
    .line 120
    if-eq v10, v8, :cond_6

    .line 121
    .line 122
    const/16 v8, 0xb5

    .line 123
    .line 124
    if-ne v10, v8, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    const/4 v8, 0x0

    .line 128
    goto/16 :goto_7

    .line 129
    .line 130
    :cond_6
    :goto_2
    iget v8, v6, La/kjv;->a:I

    .line 131
    .line 132
    sub-int/2addr v8, v12

    .line 133
    iput v8, v6, La/kjv;->a:I

    .line 134
    .line 135
    const/4 v8, 0x0

    .line 136
    iput-boolean v8, v6, La/kjv;->c:Z

    .line 137
    .line 138
    iget-object v8, v0, La/mjv;->i:La/ncs0;

    .line 139
    .line 140
    iget v9, v6, La/kjv;->b:I

    .line 141
    .line 142
    iget-object v12, v0, La/mjv;->h:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v14, v6, La/kjv;->e:Ljava/io/Serializable;

    .line 148
    .line 149
    check-cast v14, [B

    .line 150
    .line 151
    iget v6, v6, La/kjv;->a:I

    .line 152
    .line 153
    invoke-static {v14, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    new-instance v14, La/q8b;

    .line 158
    .line 159
    array-length v15, v6

    .line 160
    invoke-direct {v14, v6, v15}, La/q8b;-><init>([BI)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v14, v9}, La/q8b;->p(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v14, v3}, La/q8b;->p(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v14}, La/q8b;->n()V

    .line 170
    .line 171
    .line 172
    const/16 v9, 0x8

    .line 173
    .line 174
    invoke-virtual {v14, v9}, La/q8b;->o(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v14}, La/q8b;->f()Z

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    if-eqz v15, :cond_7

    .line 182
    .line 183
    invoke-virtual {v14, v3}, La/q8b;->o(I)V

    .line 184
    .line 185
    .line 186
    const/4 v15, 0x3

    .line 187
    invoke-virtual {v14, v15}, La/q8b;->o(I)V

    .line 188
    .line 189
    .line 190
    :cond_7
    invoke-virtual {v14, v3}, La/q8b;->g(I)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    const-string v15, "Invalid aspect ratio"

    .line 195
    .line 196
    move-object/from16 v18, v6

    .line 197
    .line 198
    const/16 v6, 0xf

    .line 199
    .line 200
    if-ne v3, v6, :cond_9

    .line 201
    .line 202
    invoke-virtual {v14, v9}, La/q8b;->g(I)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    invoke-virtual {v14, v9}, La/q8b;->g(I)I

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    if-nez v9, :cond_8

    .line 211
    .line 212
    invoke-static {v13, v15}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_8
    int-to-float v3, v3

    .line 217
    int-to-float v9, v9

    .line 218
    div-float v15, v3, v9

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    const/4 v9, 0x7

    .line 222
    if-ge v3, v9, :cond_a

    .line 223
    .line 224
    sget-object v9, La/mjv;->l:[F

    .line 225
    .line 226
    aget v15, v9, v3

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    invoke-static {v13, v15}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_3
    const/high16 v15, 0x3f800000    # 1.0f

    .line 233
    .line 234
    :goto_4
    invoke-virtual {v14}, La/q8b;->f()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_b

    .line 239
    .line 240
    const/4 v3, 0x2

    .line 241
    invoke-virtual {v14, v3}, La/q8b;->o(I)V

    .line 242
    .line 243
    .line 244
    const/4 v3, 0x1

    .line 245
    invoke-virtual {v14, v3}, La/q8b;->o(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v14}, La/q8b;->f()Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_b

    .line 253
    .line 254
    invoke-virtual {v14, v6}, La/q8b;->o(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v14}, La/q8b;->n()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v14, v6}, La/q8b;->o(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14}, La/q8b;->n()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v14, v6}, La/q8b;->o(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v14}, La/q8b;->n()V

    .line 270
    .line 271
    .line 272
    const/4 v9, 0x3

    .line 273
    invoke-virtual {v14, v9}, La/q8b;->o(I)V

    .line 274
    .line 275
    .line 276
    const/16 v3, 0xb

    .line 277
    .line 278
    invoke-virtual {v14, v3}, La/q8b;->o(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v14}, La/q8b;->n()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v14, v6}, La/q8b;->o(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v14}, La/q8b;->n()V

    .line 288
    .line 289
    .line 290
    :cond_b
    const/4 v3, 0x2

    .line 291
    invoke-virtual {v14, v3}, La/q8b;->g(I)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_c

    .line 296
    .line 297
    const-string v3, "Unhandled video object layer shape"

    .line 298
    .line 299
    invoke-static {v13, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    :cond_c
    invoke-virtual {v14}, La/q8b;->n()V

    .line 303
    .line 304
    .line 305
    const/16 v3, 0x10

    .line 306
    .line 307
    invoke-virtual {v14, v3}, La/q8b;->g(I)I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    invoke-virtual {v14}, La/q8b;->n()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v14}, La/q8b;->f()Z

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    if-eqz v6, :cond_f

    .line 319
    .line 320
    if-nez v3, :cond_d

    .line 321
    .line 322
    const-string v3, "Invalid vop_increment_time_resolution"

    .line 323
    .line 324
    invoke-static {v13, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_d
    add-int/lit8 v3, v3, -0x1

    .line 329
    .line 330
    const/4 v6, 0x0

    .line 331
    :goto_5
    if-lez v3, :cond_e

    .line 332
    .line 333
    add-int/lit8 v6, v6, 0x1

    .line 334
    .line 335
    shr-int/lit8 v3, v3, 0x1

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_e
    invoke-virtual {v14, v6}, La/q8b;->o(I)V

    .line 339
    .line 340
    .line 341
    :cond_f
    :goto_6
    invoke-virtual {v14}, La/q8b;->n()V

    .line 342
    .line 343
    .line 344
    const/16 v3, 0xd

    .line 345
    .line 346
    invoke-virtual {v14, v3}, La/q8b;->g(I)I

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    invoke-virtual {v14}, La/q8b;->n()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v14, v3}, La/q8b;->g(I)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    invoke-virtual {v14}, La/q8b;->n()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v14}, La/q8b;->n()V

    .line 361
    .line 362
    .line 363
    new-instance v9, La/awq;

    .line 364
    .line 365
    invoke-direct {v9}, La/awq;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object v12, v9, La/awq;->a:Ljava/lang/String;

    .line 369
    .line 370
    const-string v12, "video/mp2t"

    .line 371
    .line 372
    invoke-static {v12}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    iput-object v12, v9, La/awq;->n:Ljava/lang/String;

    .line 377
    .line 378
    const-string v12, "video/mp4v-es"

    .line 379
    .line 380
    invoke-static {v12}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    iput-object v12, v9, La/awq;->o:Ljava/lang/String;

    .line 385
    .line 386
    iput v6, v9, La/awq;->v:I

    .line 387
    .line 388
    iput v3, v9, La/awq;->w:I

    .line 389
    .line 390
    iput v15, v9, La/awq;->D:F

    .line 391
    .line 392
    invoke-static/range {v18 .. v18}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    iput-object v3, v9, La/awq;->r:Ljava/util/List;

    .line 397
    .line 398
    invoke-static {v9, v8}, La/ohs0;->w(La/awq;La/ncs0;)V

    .line 399
    .line 400
    .line 401
    const/4 v3, 0x1

    .line 402
    iput-boolean v3, v0, La/mjv;->j:Z

    .line 403
    .line 404
    goto :goto_8

    .line 405
    :cond_10
    invoke-static {}, La/v4i0;->e()V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :cond_11
    and-int/lit16 v8, v8, 0xf0

    .line 410
    .line 411
    const/16 v9, 0x20

    .line 412
    .line 413
    if-eq v8, v9, :cond_12

    .line 414
    .line 415
    invoke-static {v13, v14}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const/4 v8, 0x0

    .line 419
    iput-boolean v8, v6, La/kjv;->c:Z

    .line 420
    .line 421
    iput v8, v6, La/kjv;->a:I

    .line 422
    .line 423
    iput-byte v8, v6, La/kjv;->d:B

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_12
    const/4 v8, 0x0

    .line 427
    iget v9, v6, La/kjv;->a:I

    .line 428
    .line 429
    iput v9, v6, La/kjv;->b:I

    .line 430
    .line 431
    iput-byte v3, v6, La/kjv;->d:B

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_13
    move/from16 v17, v9

    .line 435
    .line 436
    const/4 v8, 0x0

    .line 437
    const/16 v3, 0x1f

    .line 438
    .line 439
    if-le v10, v3, :cond_14

    .line 440
    .line 441
    invoke-static {v13, v14}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    iput-boolean v8, v6, La/kjv;->c:Z

    .line 445
    .line 446
    iput v8, v6, La/kjv;->a:I

    .line 447
    .line 448
    iput-byte v8, v6, La/kjv;->d:B

    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_14
    const/4 v9, 0x3

    .line 452
    iput-byte v9, v6, La/kjv;->d:B

    .line 453
    .line 454
    goto :goto_7

    .line 455
    :cond_15
    move/from16 v17, v9

    .line 456
    .line 457
    const/16 v3, 0xb5

    .line 458
    .line 459
    const/4 v8, 0x0

    .line 460
    if-eq v10, v3, :cond_16

    .line 461
    .line 462
    invoke-static {v13, v14}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    iput-boolean v8, v6, La/kjv;->c:Z

    .line 466
    .line 467
    iput v8, v6, La/kjv;->a:I

    .line 468
    .line 469
    iput-byte v8, v6, La/kjv;->d:B

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_16
    const/4 v3, 0x2

    .line 473
    iput-byte v3, v6, La/kjv;->d:B

    .line 474
    .line 475
    goto :goto_7

    .line 476
    :cond_17
    move/from16 v16, v3

    .line 477
    .line 478
    move/from16 v17, v9

    .line 479
    .line 480
    const/4 v8, 0x0

    .line 481
    const/16 v3, 0xb0

    .line 482
    .line 483
    if-ne v10, v3, :cond_18

    .line 484
    .line 485
    const/4 v3, 0x1

    .line 486
    iput-byte v3, v6, La/kjv;->d:B

    .line 487
    .line 488
    iput-boolean v3, v6, La/kjv;->c:Z

    .line 489
    .line 490
    :cond_18
    :goto_7
    sget-object v3, La/kjv;->f:[B

    .line 491
    .line 492
    const/4 v9, 0x3

    .line 493
    invoke-virtual {v6, v3, v8, v9}, La/kjv;->b([BII)V

    .line 494
    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_19
    move/from16 v16, v3

    .line 498
    .line 499
    move/from16 v17, v9

    .line 500
    .line 501
    :goto_8
    iget-object v3, v0, La/mjv;->f:La/ljv;

    .line 502
    .line 503
    invoke-virtual {v3, v4, v2, v5}, La/ljv;->a([BII)V

    .line 504
    .line 505
    .line 506
    if-eqz v7, :cond_1c

    .line 507
    .line 508
    if-lez v11, :cond_1a

    .line 509
    .line 510
    invoke-virtual {v7, v4, v2, v5}, La/y850;->a([BII)V

    .line 511
    .line 512
    .line 513
    const/4 v2, 0x0

    .line 514
    goto :goto_9

    .line 515
    :cond_1a
    neg-int v2, v11

    .line 516
    :goto_9
    invoke-virtual {v7, v2}, La/y850;->b(I)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_1b

    .line 521
    .line 522
    iget-object v2, v7, La/y850;->d:[B

    .line 523
    .line 524
    iget v3, v7, La/y850;->e:I

    .line 525
    .line 526
    invoke-static {v2, v3}, La/ntr;->w0([BI)I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    sget-object v3, La/vtt0;->a:Ljava/lang/String;

    .line 531
    .line 532
    iget-object v3, v7, La/y850;->d:[B

    .line 533
    .line 534
    iget-object v6, v0, La/mjv;->b:La/fq80;

    .line 535
    .line 536
    invoke-virtual {v6, v3, v2}, La/fq80;->K([BI)V

    .line 537
    .line 538
    .line 539
    iget-object v2, v0, La/mjv;->a:La/cyu;

    .line 540
    .line 541
    iget-wide v8, v0, La/mjv;->k:J

    .line 542
    .line 543
    invoke-virtual {v2, v8, v9, v6}, La/cyu;->e(JLa/fq80;)V

    .line 544
    .line 545
    .line 546
    :cond_1b
    const/16 v2, 0xb2

    .line 547
    .line 548
    if-ne v10, v2, :cond_1c

    .line 549
    .line 550
    iget-object v2, v1, La/fq80;->a:[B

    .line 551
    .line 552
    add-int/lit8 v3, v5, 0x2

    .line 553
    .line 554
    aget-byte v2, v2, v3

    .line 555
    .line 556
    const/4 v3, 0x1

    .line 557
    if-ne v2, v3, :cond_1d

    .line 558
    .line 559
    invoke-virtual {v7, v10}, La/y850;->d(I)V

    .line 560
    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_1c
    const/4 v3, 0x1

    .line 564
    :cond_1d
    :goto_a
    sub-int v2, v16, v5

    .line 565
    .line 566
    iget-wide v5, v0, La/mjv;->g:J

    .line 567
    .line 568
    int-to-long v7, v2

    .line 569
    sub-long/2addr v5, v7

    .line 570
    iget-object v7, v0, La/mjv;->f:La/ljv;

    .line 571
    .line 572
    iget-boolean v8, v0, La/mjv;->j:Z

    .line 573
    .line 574
    invoke-virtual {v7, v2, v5, v6, v8}, La/ljv;->b(IJZ)V

    .line 575
    .line 576
    .line 577
    iget-object v2, v0, La/mjv;->f:La/ljv;

    .line 578
    .line 579
    iget-wide v5, v0, La/mjv;->k:J

    .line 580
    .line 581
    iput v10, v2, La/ljv;->e:I

    .line 582
    .line 583
    const/4 v8, 0x0

    .line 584
    iput-boolean v8, v2, La/ljv;->d:Z

    .line 585
    .line 586
    const/16 v7, 0xb6

    .line 587
    .line 588
    if-eq v10, v7, :cond_1f

    .line 589
    .line 590
    const/16 v8, 0xb3

    .line 591
    .line 592
    if-ne v10, v8, :cond_1e

    .line 593
    .line 594
    goto :goto_b

    .line 595
    :cond_1e
    const/4 v8, 0x0

    .line 596
    goto :goto_c

    .line 597
    :cond_1f
    :goto_b
    move v8, v3

    .line 598
    :goto_c
    iput-boolean v8, v2, La/ljv;->b:Z

    .line 599
    .line 600
    if-ne v10, v7, :cond_20

    .line 601
    .line 602
    move v14, v3

    .line 603
    goto :goto_d

    .line 604
    :cond_20
    const/4 v14, 0x0

    .line 605
    :goto_d
    iput-boolean v14, v2, La/ljv;->c:Z

    .line 606
    .line 607
    const/4 v8, 0x0

    .line 608
    iput v8, v2, La/ljv;->f:I

    .line 609
    .line 610
    iput-wide v5, v2, La/ljv;->h:J

    .line 611
    .line 612
    move/from16 v3, v16

    .line 613
    .line 614
    move/from16 v2, v17

    .line 615
    .line 616
    goto/16 :goto_0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, La/mjv;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, La/ntr;->Y([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/mjv;->d:La/kjv;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, La/kjv;->c:Z

    .line 10
    .line 11
    iput v1, v0, La/kjv;->a:I

    .line 12
    .line 13
    iput-byte v1, v0, La/kjv;->d:B

    .line 14
    .line 15
    iget-object v0, p0, La/mjv;->f:La/ljv;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-boolean v1, v0, La/ljv;->b:Z

    .line 20
    .line 21
    iput-boolean v1, v0, La/ljv;->c:Z

    .line 22
    .line 23
    iput-boolean v1, v0, La/ljv;->d:Z

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    iput v1, v0, La/ljv;->e:I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, La/mjv;->e:La/y850;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, La/y850;->c()V

    .line 33
    .line 34
    .line 35
    :cond_1
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, La/mjv;->g:J

    .line 38
    .line 39
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v0, p0, La/mjv;->k:J

    .line 45
    .line 46
    return-void
.end method

.method public final d()V
    .locals 5

    .line 1
    iget-object v0, p0, La/mjv;->f:La/ljv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/mjv;->f:La/ljv;

    .line 7
    .line 8
    iget-wide v1, p0, La/mjv;->g:J

    .line 9
    .line 10
    iget-boolean v3, p0, La/mjv;->j:Z

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-virtual {v0, v4, v1, v2, v3}, La/ljv;->b(IJZ)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/mjv;->f:La/ljv;

    .line 17
    .line 18
    iput-boolean v4, p0, La/ljv;->b:Z

    .line 19
    .line 20
    iput-boolean v4, p0, La/ljv;->c:Z

    .line 21
    .line 22
    iput-boolean v4, p0, La/ljv;->d:Z

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    iput v0, p0, La/ljv;->e:I

    .line 26
    .line 27
    return-void
.end method

.method public final e(La/huo;La/zrs0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, La/zrs0;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, La/zrs0;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, La/zrs0;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, La/mjv;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, La/zrs0;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, La/zrs0;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, La/huo;->q(II)La/ncs0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/mjv;->i:La/ncs0;

    .line 22
    .line 23
    new-instance v1, La/ljv;

    .line 24
    .line 25
    invoke-direct {v1, v0}, La/ljv;-><init>(La/ncs0;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, La/mjv;->f:La/ljv;

    .line 29
    .line 30
    iget-object p0, p0, La/mjv;->a:La/cyu;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2}, La/cyu;->g(La/huo;La/zrs0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final g(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, La/mjv;->k:J

    .line 2
    .line 3
    return-void
.end method
