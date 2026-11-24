.class public final La/gpq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fuo;


# instance fields
.field public final a:La/fq80;

.field public final b:La/fq80;

.field public final c:La/fq80;

.field public final d:La/fq80;

.field public final e:La/p9h0;

.field public f:La/huo;

.field public g:B

.field public h:Z

.field public i:J

.field public j:I

.field public k:S

.field public l:I

.field public m:J

.field public n:Z

.field public o:La/e44;

.field public p:La/tfu0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fq80;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, La/fq80;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/gpq;->a:La/fq80;

    .line 11
    .line 12
    new-instance v0, La/fq80;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/fq80;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/gpq;->b:La/fq80;

    .line 20
    .line 21
    new-instance v0, La/fq80;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/fq80;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/gpq;->c:La/fq80;

    .line 29
    .line 30
    new-instance v0, La/fq80;

    .line 31
    .line 32
    invoke-direct {v0}, La/fq80;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/gpq;->d:La/fq80;

    .line 36
    .line 37
    new-instance v0, La/p9h0;

    .line 38
    .line 39
    new-instance v1, La/pnk;

    .line 40
    .line 41
    invoke-direct {v1}, La/pnk;-><init>()V

    .line 42
    .line 43
    .line 44
    const/16 v2, 0xb

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    iput-wide v1, v0, La/p9h0;->c:J

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    new-array v2, v1, [J

    .line 58
    .line 59
    iput-object v2, v0, La/p9h0;->d:[J

    .line 60
    .line 61
    new-array v1, v1, [J

    .line 62
    .line 63
    iput-object v1, v0, La/p9h0;->e:[J

    .line 64
    .line 65
    iput-object v0, p0, La/gpq;->e:La/p9h0;

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    iput-byte v0, p0, La/gpq;->g:B

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a(La/guo;La/mtc;)I
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/gpq;->f:La/huo;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    iget-byte v2, v0, La/gpq;->g:B

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    const/4 v4, 0x5

    .line 15
    const/16 v5, 0x9

    .line 16
    .line 17
    const/16 v6, 0x8

    .line 18
    .line 19
    const/4 v7, 0x2

    .line 20
    const/4 v8, 0x4

    .line 21
    const/4 v9, 0x1

    .line 22
    const/4 v10, 0x0

    .line 23
    if-eq v2, v9, :cond_28

    .line 24
    .line 25
    const/4 v11, 0x3

    .line 26
    if-eq v2, v7, :cond_27

    .line 27
    .line 28
    if-eq v2, v11, :cond_25

    .line 29
    .line 30
    if-ne v2, v8, :cond_24

    .line 31
    .line 32
    iget-boolean v2, v0, La/gpq;->h:Z

    .line 33
    .line 34
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const-wide/16 v16, 0x0

    .line 40
    .line 41
    iget-object v3, v0, La/gpq;->e:La/p9h0;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const-wide/16 v18, 0x3e8

    .line 46
    .line 47
    iget-wide v12, v0, La/gpq;->i:J

    .line 48
    .line 49
    move/from16 p2, v11

    .line 50
    .line 51
    move-wide/from16 v20, v12

    .line 52
    .line 53
    iget-wide v11, v0, La/gpq;->m:J

    .line 54
    .line 55
    add-long v12, v20, v11

    .line 56
    .line 57
    :goto_1
    move-wide/from16 v21, v12

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    move/from16 p2, v11

    .line 61
    .line 62
    const-wide/16 v18, 0x3e8

    .line 63
    .line 64
    iget-wide v11, v3, La/p9h0;->c:J

    .line 65
    .line 66
    cmp-long v2, v11, v14

    .line 67
    .line 68
    if-nez v2, :cond_2

    .line 69
    .line 70
    move-wide/from16 v21, v16

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    iget-wide v12, v0, La/gpq;->m:J

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :goto_2
    iget-short v2, v0, La/gpq;->k:S

    .line 77
    .line 78
    const/4 v11, 0x7

    .line 79
    const-string v12, "video/x-flv"

    .line 80
    .line 81
    if-ne v2, v6, :cond_e

    .line 82
    .line 83
    iget-object v13, v0, La/gpq;->o:La/e44;

    .line 84
    .line 85
    if-eqz v13, :cond_e

    .line 86
    .line 87
    iget-boolean v2, v0, La/gpq;->n:Z

    .line 88
    .line 89
    if-nez v2, :cond_3

    .line 90
    .line 91
    iget-object v2, v0, La/gpq;->f:La/huo;

    .line 92
    .line 93
    new-instance v4, La/ca5;

    .line 94
    .line 95
    invoke-direct {v4, v14, v15}, La/ca5;-><init>(J)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v2, v4}, La/huo;->f(La/fvh0;)V

    .line 99
    .line 100
    .line 101
    iput-boolean v9, v0, La/gpq;->n:Z

    .line 102
    .line 103
    :cond_3
    iget-object v2, v0, La/gpq;->o:La/e44;

    .line 104
    .line 105
    invoke-virtual/range {p0 .. p1}, La/gpq;->g(La/guo;)La/fq80;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iget-object v5, v2, La/p4;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, La/ncs0;

    .line 112
    .line 113
    iget-boolean v13, v2, La/e44;->c:Z

    .line 114
    .line 115
    move/from16 v27, v8

    .line 116
    .line 117
    const/16 v8, 0xa

    .line 118
    .line 119
    if-nez v13, :cond_9

    .line 120
    .line 121
    invoke-virtual {v4}, La/fq80;->z()I

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    shr-int/lit8 v18, v13, 0x4

    .line 126
    .line 127
    and-int/lit8 v14, v18, 0xf

    .line 128
    .line 129
    iput v14, v2, La/e44;->e:I

    .line 130
    .line 131
    if-ne v14, v7, :cond_4

    .line 132
    .line 133
    shr-int/lit8 v6, v13, 0x2

    .line 134
    .line 135
    and-int/lit8 v6, v6, 0x3

    .line 136
    .line 137
    sget-object v11, La/e44;->f:[I

    .line 138
    .line 139
    aget v6, v11, v6

    .line 140
    .line 141
    new-instance v11, La/awq;

    .line 142
    .line 143
    invoke-direct {v11}, La/awq;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-static {v12}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    iput-object v13, v11, La/awq;->n:Ljava/lang/String;

    .line 151
    .line 152
    const-string v13, "audio/mpeg"

    .line 153
    .line 154
    invoke-static {v13}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    iput-object v13, v11, La/awq;->o:Ljava/lang/String;

    .line 159
    .line 160
    iput v9, v11, La/awq;->I:I

    .line 161
    .line 162
    iput v6, v11, La/awq;->K:I

    .line 163
    .line 164
    invoke-static {v11, v5}, La/ohs0;->w(La/awq;La/ncs0;)V

    .line 165
    .line 166
    .line 167
    iput-boolean v9, v2, La/e44;->d:Z

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_4
    if-eq v14, v11, :cond_7

    .line 171
    .line 172
    if-ne v14, v6, :cond_5

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    if-ne v14, v8, :cond_6

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_6
    new-instance v0, La/voo0;

    .line 179
    .line 180
    iget v1, v2, La/e44;->e:I

    .line 181
    .line 182
    new-instance v2, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v3, "Audio format not supported: "

    .line 185
    .line 186
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-direct {v0, v1}, La/voo0;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :cond_7
    :goto_3
    if-ne v14, v11, :cond_8

    .line 201
    .line 202
    const-string v6, "audio/g711-alaw"

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_8
    const-string v6, "audio/g711-mlaw"

    .line 206
    .line 207
    :goto_4
    new-instance v11, La/awq;

    .line 208
    .line 209
    invoke-direct {v11}, La/awq;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-static {v12}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    iput-object v13, v11, La/awq;->n:Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {v6}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    iput-object v6, v11, La/awq;->o:Ljava/lang/String;

    .line 223
    .line 224
    iput v9, v11, La/awq;->I:I

    .line 225
    .line 226
    const/16 v6, 0x1f40

    .line 227
    .line 228
    iput v6, v11, La/awq;->K:I

    .line 229
    .line 230
    invoke-static {v11, v5}, La/ohs0;->w(La/awq;La/ncs0;)V

    .line 231
    .line 232
    .line 233
    iput-boolean v9, v2, La/e44;->d:Z

    .line 234
    .line 235
    :goto_5
    iput-boolean v9, v2, La/e44;->c:Z

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_9
    invoke-virtual {v4, v9}, La/fq80;->N(I)V

    .line 239
    .line 240
    .line 241
    :goto_6
    iget-object v5, v2, La/p4;->b:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v5, La/ncs0;

    .line 244
    .line 245
    iget v6, v2, La/e44;->e:I

    .line 246
    .line 247
    if-ne v6, v7, :cond_a

    .line 248
    .line 249
    invoke-virtual {v4}, La/fq80;->a()I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    invoke-interface {v5, v6, v4}, La/ncs0;->a(ILa/fq80;)V

    .line 254
    .line 255
    .line 256
    iget-object v2, v2, La/p4;->b:Ljava/lang/Object;

    .line 257
    .line 258
    move-object/from16 v20, v2

    .line 259
    .line 260
    check-cast v20, La/ncs0;

    .line 261
    .line 262
    const/16 v25, 0x0

    .line 263
    .line 264
    const/16 v26, 0x0

    .line 265
    .line 266
    const/16 v23, 0x1

    .line 267
    .line 268
    move/from16 v24, v6

    .line 269
    .line 270
    invoke-interface/range {v20 .. v26}, La/ncs0;->b(JIIILa/mcs0;)V

    .line 271
    .line 272
    .line 273
    :goto_7
    move v2, v9

    .line 274
    goto/16 :goto_11

    .line 275
    .line 276
    :cond_a
    invoke-virtual {v4}, La/fq80;->z()I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-nez v6, :cond_c

    .line 281
    .line 282
    iget-boolean v11, v2, La/e44;->d:Z

    .line 283
    .line 284
    if-nez v11, :cond_c

    .line 285
    .line 286
    invoke-virtual {v4}, La/fq80;->a()I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    new-array v8, v6, [B

    .line 291
    .line 292
    invoke-virtual {v4, v8, v10, v6}, La/fq80;->k([BII)V

    .line 293
    .line 294
    .line 295
    new-instance v4, La/q8b;

    .line 296
    .line 297
    invoke-direct {v4, v8, v6}, La/q8b;-><init>([BI)V

    .line 298
    .line 299
    .line 300
    invoke-static {v4, v10}, La/cy2;->E(La/q8b;Z)La/cf60;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    new-instance v6, La/awq;

    .line 305
    .line 306
    invoke-direct {v6}, La/awq;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-static {v12}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    iput-object v11, v6, La/awq;->n:Ljava/lang/String;

    .line 314
    .line 315
    const-string v11, "audio/mp4a-latm"

    .line 316
    .line 317
    invoke-static {v11}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    iput-object v11, v6, La/awq;->o:Ljava/lang/String;

    .line 322
    .line 323
    iget-object v11, v4, La/cf60;->d:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v11, Ljava/lang/String;

    .line 326
    .line 327
    iput-object v11, v6, La/awq;->k:Ljava/lang/String;

    .line 328
    .line 329
    iget v11, v4, La/cf60;->c:I

    .line 330
    .line 331
    iput v11, v6, La/awq;->I:I

    .line 332
    .line 333
    iget v4, v4, La/cf60;->b:I

    .line 334
    .line 335
    iput v4, v6, La/awq;->K:I

    .line 336
    .line 337
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    iput-object v4, v6, La/awq;->r:Ljava/util/List;

    .line 342
    .line 343
    invoke-static {v6, v5}, La/ohs0;->w(La/awq;La/ncs0;)V

    .line 344
    .line 345
    .line 346
    iput-boolean v9, v2, La/e44;->d:Z

    .line 347
    .line 348
    :cond_b
    move v2, v10

    .line 349
    goto/16 :goto_11

    .line 350
    .line 351
    :cond_c
    iget v11, v2, La/e44;->e:I

    .line 352
    .line 353
    if-ne v11, v8, :cond_d

    .line 354
    .line 355
    if-ne v6, v9, :cond_b

    .line 356
    .line 357
    :cond_d
    invoke-virtual {v4}, La/fq80;->a()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-interface {v5, v6, v4}, La/ncs0;->a(ILa/fq80;)V

    .line 362
    .line 363
    .line 364
    iget-object v2, v2, La/p4;->b:Ljava/lang/Object;

    .line 365
    .line 366
    move-object/from16 v20, v2

    .line 367
    .line 368
    check-cast v20, La/ncs0;

    .line 369
    .line 370
    const/16 v25, 0x0

    .line 371
    .line 372
    const/16 v26, 0x0

    .line 373
    .line 374
    const/16 v23, 0x1

    .line 375
    .line 376
    move/from16 v24, v6

    .line 377
    .line 378
    invoke-interface/range {v20 .. v26}, La/ncs0;->b(JIIILa/mcs0;)V

    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_e
    move/from16 v27, v8

    .line 383
    .line 384
    if-ne v2, v5, :cond_18

    .line 385
    .line 386
    iget-object v5, v0, La/gpq;->p:La/tfu0;

    .line 387
    .line 388
    if-eqz v5, :cond_18

    .line 389
    .line 390
    iget-boolean v2, v0, La/gpq;->n:Z

    .line 391
    .line 392
    if-nez v2, :cond_f

    .line 393
    .line 394
    iget-object v2, v0, La/gpq;->f:La/huo;

    .line 395
    .line 396
    new-instance v5, La/ca5;

    .line 397
    .line 398
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    invoke-direct {v5, v13, v14}, La/ca5;-><init>(J)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v2, v5}, La/huo;->f(La/fvh0;)V

    .line 407
    .line 408
    .line 409
    iput-boolean v9, v0, La/gpq;->n:Z

    .line 410
    .line 411
    :cond_f
    iget-object v2, v0, La/gpq;->p:La/tfu0;

    .line 412
    .line 413
    invoke-virtual/range {p0 .. p1}, La/gpq;->g(La/guo;)La/fq80;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5}, La/fq80;->z()I

    .line 421
    .line 422
    .line 423
    move-result v8

    .line 424
    shr-int/lit8 v13, v8, 0x4

    .line 425
    .line 426
    and-int/lit8 v13, v13, 0xf

    .line 427
    .line 428
    and-int/lit8 v8, v8, 0xf

    .line 429
    .line 430
    if-ne v8, v11, :cond_17

    .line 431
    .line 432
    iput v13, v2, La/tfu0;->h:I

    .line 433
    .line 434
    if-eq v13, v4, :cond_10

    .line 435
    .line 436
    move v4, v9

    .line 437
    goto :goto_8

    .line 438
    :cond_10
    move v4, v10

    .line 439
    :goto_8
    if-eqz v4, :cond_16

    .line 440
    .line 441
    iget-object v4, v2, La/tfu0;->c:La/fq80;

    .line 442
    .line 443
    iget-object v8, v2, La/p4;->b:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v8, La/ncs0;

    .line 446
    .line 447
    iget-object v11, v2, La/tfu0;->d:La/fq80;

    .line 448
    .line 449
    invoke-virtual {v5}, La/fq80;->z()I

    .line 450
    .line 451
    .line 452
    move-result v13

    .line 453
    move/from16 v14, p2

    .line 454
    .line 455
    invoke-virtual {v5, v14}, La/fq80;->f(I)V

    .line 456
    .line 457
    .line 458
    iget-object v14, v5, La/fq80;->a:[B

    .line 459
    .line 460
    iget v15, v5, La/fq80;->b:I

    .line 461
    .line 462
    move/from16 v20, v6

    .line 463
    .line 464
    add-int/lit8 v6, v15, 0x1

    .line 465
    .line 466
    iput v6, v5, La/fq80;->b:I

    .line 467
    .line 468
    move/from16 v23, v7

    .line 469
    .line 470
    aget-byte v7, v14, v15

    .line 471
    .line 472
    and-int/lit16 v7, v7, 0xff

    .line 473
    .line 474
    shl-int/lit8 v7, v7, 0x18

    .line 475
    .line 476
    shr-int/lit8 v7, v7, 0x8

    .line 477
    .line 478
    add-int/lit8 v9, v15, 0x2

    .line 479
    .line 480
    iput v9, v5, La/fq80;->b:I

    .line 481
    .line 482
    aget-byte v6, v14, v6

    .line 483
    .line 484
    and-int/lit16 v6, v6, 0xff

    .line 485
    .line 486
    shl-int/lit8 v6, v6, 0x8

    .line 487
    .line 488
    or-int/2addr v6, v7

    .line 489
    const/4 v7, 0x3

    .line 490
    add-int/2addr v15, v7

    .line 491
    iput v15, v5, La/fq80;->b:I

    .line 492
    .line 493
    aget-byte v7, v14, v9

    .line 494
    .line 495
    and-int/lit16 v7, v7, 0xff

    .line 496
    .line 497
    or-int/2addr v6, v7

    .line 498
    int-to-long v6, v6

    .line 499
    mul-long v6, v6, v18

    .line 500
    .line 501
    add-long v31, v6, v21

    .line 502
    .line 503
    if-nez v13, :cond_12

    .line 504
    .line 505
    iget-boolean v6, v2, La/tfu0;->f:Z

    .line 506
    .line 507
    if-nez v6, :cond_12

    .line 508
    .line 509
    new-instance v4, La/fq80;

    .line 510
    .line 511
    invoke-virtual {v5}, La/fq80;->a()I

    .line 512
    .line 513
    .line 514
    move-result v6

    .line 515
    new-array v6, v6, [B

    .line 516
    .line 517
    invoke-direct {v4, v6}, La/fq80;-><init>([B)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v5}, La/fq80;->a()I

    .line 521
    .line 522
    .line 523
    move-result v7

    .line 524
    invoke-virtual {v5, v6, v10, v7}, La/fq80;->k([BII)V

    .line 525
    .line 526
    .line 527
    invoke-static {v4}, La/z95;->a(La/fq80;)La/z95;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    iget v5, v4, La/z95;->b:I

    .line 532
    .line 533
    iput v5, v2, La/tfu0;->e:I

    .line 534
    .line 535
    new-instance v5, La/awq;

    .line 536
    .line 537
    invoke-direct {v5}, La/awq;-><init>()V

    .line 538
    .line 539
    .line 540
    invoke-static {v12}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    iput-object v6, v5, La/awq;->n:Ljava/lang/String;

    .line 545
    .line 546
    const-string v6, "video/avc"

    .line 547
    .line 548
    invoke-static {v6}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    iput-object v6, v5, La/awq;->o:Ljava/lang/String;

    .line 553
    .line 554
    iget-object v6, v4, La/z95;->l:Ljava/lang/String;

    .line 555
    .line 556
    iput-object v6, v5, La/awq;->k:Ljava/lang/String;

    .line 557
    .line 558
    iget v6, v4, La/z95;->c:I

    .line 559
    .line 560
    iput v6, v5, La/awq;->v:I

    .line 561
    .line 562
    iget v6, v4, La/z95;->d:I

    .line 563
    .line 564
    iput v6, v5, La/awq;->w:I

    .line 565
    .line 566
    iget v6, v4, La/z95;->k:F

    .line 567
    .line 568
    iput v6, v5, La/awq;->D:F

    .line 569
    .line 570
    iget-object v4, v4, La/z95;->a:Ljava/util/ArrayList;

    .line 571
    .line 572
    iput-object v4, v5, La/awq;->r:Ljava/util/List;

    .line 573
    .line 574
    invoke-static {v5, v8}, La/ohs0;->w(La/awq;La/ncs0;)V

    .line 575
    .line 576
    .line 577
    const/4 v6, 0x1

    .line 578
    iput-boolean v6, v2, La/tfu0;->f:Z

    .line 579
    .line 580
    :cond_11
    :goto_9
    move v2, v10

    .line 581
    goto :goto_c

    .line 582
    :cond_12
    const/4 v6, 0x1

    .line 583
    if-ne v13, v6, :cond_11

    .line 584
    .line 585
    iget-boolean v7, v2, La/tfu0;->f:Z

    .line 586
    .line 587
    if-eqz v7, :cond_11

    .line 588
    .line 589
    iget v7, v2, La/tfu0;->h:I

    .line 590
    .line 591
    if-ne v7, v6, :cond_13

    .line 592
    .line 593
    move/from16 v33, v6

    .line 594
    .line 595
    goto :goto_a

    .line 596
    :cond_13
    move/from16 v33, v10

    .line 597
    .line 598
    :goto_a
    iget-boolean v7, v2, La/tfu0;->g:Z

    .line 599
    .line 600
    if-nez v7, :cond_14

    .line 601
    .line 602
    if-nez v33, :cond_14

    .line 603
    .line 604
    goto :goto_9

    .line 605
    :cond_14
    iget-object v7, v11, La/fq80;->a:[B

    .line 606
    .line 607
    aput-byte v10, v7, v10

    .line 608
    .line 609
    aput-byte v10, v7, v6

    .line 610
    .line 611
    aput-byte v10, v7, v23

    .line 612
    .line 613
    iget v6, v2, La/tfu0;->e:I

    .line 614
    .line 615
    rsub-int/lit8 v6, v6, 0x4

    .line 616
    .line 617
    move/from16 v34, v10

    .line 618
    .line 619
    :goto_b
    invoke-virtual {v5}, La/fq80;->a()I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    if-lez v7, :cond_15

    .line 624
    .line 625
    iget-object v7, v11, La/fq80;->a:[B

    .line 626
    .line 627
    iget v9, v2, La/tfu0;->e:I

    .line 628
    .line 629
    invoke-virtual {v5, v7, v6, v9}, La/fq80;->k([BII)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v11, v10}, La/fq80;->M(I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v11}, La/fq80;->D()I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    invoke-virtual {v4, v10}, La/fq80;->M(I)V

    .line 640
    .line 641
    .line 642
    move/from16 v9, v27

    .line 643
    .line 644
    invoke-interface {v8, v9, v4}, La/ncs0;->a(ILa/fq80;)V

    .line 645
    .line 646
    .line 647
    add-int/lit8 v34, v34, 0x4

    .line 648
    .line 649
    invoke-interface {v8, v7, v5}, La/ncs0;->a(ILa/fq80;)V

    .line 650
    .line 651
    .line 652
    add-int v34, v34, v7

    .line 653
    .line 654
    const/16 v27, 0x4

    .line 655
    .line 656
    goto :goto_b

    .line 657
    :cond_15
    iget-object v4, v2, La/p4;->b:Ljava/lang/Object;

    .line 658
    .line 659
    move-object/from16 v30, v4

    .line 660
    .line 661
    check-cast v30, La/ncs0;

    .line 662
    .line 663
    const/16 v35, 0x0

    .line 664
    .line 665
    const/16 v36, 0x0

    .line 666
    .line 667
    invoke-interface/range {v30 .. v36}, La/ncs0;->b(JIIILa/mcs0;)V

    .line 668
    .line 669
    .line 670
    const/4 v6, 0x1

    .line 671
    iput-boolean v6, v2, La/tfu0;->g:Z

    .line 672
    .line 673
    const/4 v2, 0x1

    .line 674
    :goto_c
    if-eqz v2, :cond_20

    .line 675
    .line 676
    const/4 v2, 0x1

    .line 677
    goto :goto_d

    .line 678
    :cond_16
    move/from16 v23, v7

    .line 679
    .line 680
    goto/16 :goto_10

    .line 681
    .line 682
    :goto_d
    const/4 v9, 0x1

    .line 683
    goto/16 :goto_11

    .line 684
    .line 685
    :cond_17
    new-instance v0, La/voo0;

    .line 686
    .line 687
    const-string v1, "Video format not supported: "

    .line 688
    .line 689
    invoke-static {v8, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-direct {v0, v1}, La/voo0;-><init>(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    throw v0

    .line 697
    :cond_18
    move/from16 v20, v6

    .line 698
    .line 699
    move/from16 v23, v7

    .line 700
    .line 701
    const/16 v4, 0x12

    .line 702
    .line 703
    if-ne v2, v4, :cond_21

    .line 704
    .line 705
    iget-boolean v2, v0, La/gpq;->n:Z

    .line 706
    .line 707
    if-nez v2, :cond_21

    .line 708
    .line 709
    invoke-virtual/range {p0 .. p1}, La/gpq;->g(La/guo;)La/fq80;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-virtual {v2}, La/fq80;->z()I

    .line 714
    .line 715
    .line 716
    move-result v4

    .line 717
    move/from16 v5, v23

    .line 718
    .line 719
    if-eq v4, v5, :cond_19

    .line 720
    .line 721
    goto/16 :goto_f

    .line 722
    .line 723
    :cond_19
    invoke-static {v2}, La/p9h0;->p1(La/fq80;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    const-string v5, "onMetaData"

    .line 728
    .line 729
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    if-nez v4, :cond_1a

    .line 734
    .line 735
    goto/16 :goto_f

    .line 736
    .line 737
    :cond_1a
    invoke-virtual {v2}, La/fq80;->a()I

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    if-nez v4, :cond_1b

    .line 742
    .line 743
    goto/16 :goto_f

    .line 744
    .line 745
    :cond_1b
    invoke-virtual {v2}, La/fq80;->z()I

    .line 746
    .line 747
    .line 748
    move-result v4

    .line 749
    move/from16 v5, v20

    .line 750
    .line 751
    if-eq v4, v5, :cond_1c

    .line 752
    .line 753
    goto/16 :goto_f

    .line 754
    .line 755
    :cond_1c
    invoke-static {v2}, La/p9h0;->o1(La/fq80;)Ljava/util/HashMap;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    const-string v4, "duration"

    .line 760
    .line 761
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v4

    .line 765
    instance-of v5, v4, Ljava/lang/Double;

    .line 766
    .line 767
    const-wide v6, 0x412e848000000000L    # 1000000.0

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    if-eqz v5, :cond_1d

    .line 773
    .line 774
    check-cast v4, Ljava/lang/Double;

    .line 775
    .line 776
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 777
    .line 778
    .line 779
    move-result-wide v4

    .line 780
    const-wide/16 v8, 0x0

    .line 781
    .line 782
    cmpl-double v8, v4, v8

    .line 783
    .line 784
    if-lez v8, :cond_1d

    .line 785
    .line 786
    mul-double/2addr v4, v6

    .line 787
    double-to-long v4, v4

    .line 788
    iput-wide v4, v3, La/p9h0;->c:J

    .line 789
    .line 790
    :cond_1d
    const-string v4, "keyframes"

    .line 791
    .line 792
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    instance-of v4, v2, Ljava/util/Map;

    .line 797
    .line 798
    if-eqz v4, :cond_1f

    .line 799
    .line 800
    check-cast v2, Ljava/util/Map;

    .line 801
    .line 802
    const-string v4, "filepositions"

    .line 803
    .line 804
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    const-string v5, "times"

    .line 809
    .line 810
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    instance-of v5, v4, Ljava/util/List;

    .line 815
    .line 816
    if-eqz v5, :cond_1f

    .line 817
    .line 818
    instance-of v5, v2, Ljava/util/List;

    .line 819
    .line 820
    if-eqz v5, :cond_1f

    .line 821
    .line 822
    check-cast v4, Ljava/util/List;

    .line 823
    .line 824
    check-cast v2, Ljava/util/List;

    .line 825
    .line 826
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 827
    .line 828
    .line 829
    move-result v5

    .line 830
    new-array v8, v5, [J

    .line 831
    .line 832
    iput-object v8, v3, La/p9h0;->d:[J

    .line 833
    .line 834
    new-array v8, v5, [J

    .line 835
    .line 836
    iput-object v8, v3, La/p9h0;->e:[J

    .line 837
    .line 838
    move v8, v10

    .line 839
    :goto_e
    if-ge v8, v5, :cond_1f

    .line 840
    .line 841
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v11

    .line 849
    instance-of v12, v11, Ljava/lang/Double;

    .line 850
    .line 851
    if-eqz v12, :cond_1e

    .line 852
    .line 853
    instance-of v12, v9, Ljava/lang/Double;

    .line 854
    .line 855
    if-eqz v12, :cond_1e

    .line 856
    .line 857
    iget-object v12, v3, La/p9h0;->d:[J

    .line 858
    .line 859
    check-cast v11, Ljava/lang/Double;

    .line 860
    .line 861
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 862
    .line 863
    .line 864
    move-result-wide v13

    .line 865
    mul-double/2addr v13, v6

    .line 866
    double-to-long v13, v13

    .line 867
    aput-wide v13, v12, v8

    .line 868
    .line 869
    iget-object v11, v3, La/p9h0;->e:[J

    .line 870
    .line 871
    check-cast v9, Ljava/lang/Double;

    .line 872
    .line 873
    invoke-virtual {v9}, Ljava/lang/Double;->longValue()J

    .line 874
    .line 875
    .line 876
    move-result-wide v12

    .line 877
    aput-wide v12, v11, v8

    .line 878
    .line 879
    add-int/lit8 v8, v8, 0x1

    .line 880
    .line 881
    goto :goto_e

    .line 882
    :cond_1e
    new-array v2, v10, [J

    .line 883
    .line 884
    iput-object v2, v3, La/p9h0;->d:[J

    .line 885
    .line 886
    new-array v2, v10, [J

    .line 887
    .line 888
    iput-object v2, v3, La/p9h0;->e:[J

    .line 889
    .line 890
    :cond_1f
    :goto_f
    iget-wide v4, v3, La/p9h0;->c:J

    .line 891
    .line 892
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    cmp-long v2, v4, v28

    .line 898
    .line 899
    if-eqz v2, :cond_20

    .line 900
    .line 901
    iget-object v2, v0, La/gpq;->f:La/huo;

    .line 902
    .line 903
    new-instance v6, La/e5x;

    .line 904
    .line 905
    iget-object v7, v3, La/p9h0;->e:[J

    .line 906
    .line 907
    iget-object v8, v3, La/p9h0;->d:[J

    .line 908
    .line 909
    invoke-direct {v6, v4, v5, v7, v8}, La/e5x;-><init>(J[J[J)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v2, v6}, La/huo;->f(La/fvh0;)V

    .line 913
    .line 914
    .line 915
    const/4 v6, 0x1

    .line 916
    iput-boolean v6, v0, La/gpq;->n:Z

    .line 917
    .line 918
    :cond_20
    :goto_10
    move v2, v10

    .line 919
    goto/16 :goto_d

    .line 920
    .line 921
    :cond_21
    iget v2, v0, La/gpq;->l:I

    .line 922
    .line 923
    invoke-interface {v1, v2}, La/guo;->m(I)V

    .line 924
    .line 925
    .line 926
    move v2, v10

    .line 927
    move v9, v2

    .line 928
    :goto_11
    iget-boolean v4, v0, La/gpq;->h:Z

    .line 929
    .line 930
    if-nez v4, :cond_23

    .line 931
    .line 932
    if-eqz v2, :cond_23

    .line 933
    .line 934
    const/4 v6, 0x1

    .line 935
    iput-boolean v6, v0, La/gpq;->h:Z

    .line 936
    .line 937
    iget-wide v2, v3, La/p9h0;->c:J

    .line 938
    .line 939
    const-wide v28, -0x7fffffffffffffffL    # -4.9E-324

    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    cmp-long v2, v2, v28

    .line 945
    .line 946
    if-nez v2, :cond_22

    .line 947
    .line 948
    iget-wide v2, v0, La/gpq;->m:J

    .line 949
    .line 950
    neg-long v2, v2

    .line 951
    goto :goto_12

    .line 952
    :cond_22
    move-wide/from16 v2, v16

    .line 953
    .line 954
    :goto_12
    iput-wide v2, v0, La/gpq;->i:J

    .line 955
    .line 956
    :cond_23
    const/4 v2, 0x4

    .line 957
    iput v2, v0, La/gpq;->j:I

    .line 958
    .line 959
    const/4 v5, 0x2

    .line 960
    iput-byte v5, v0, La/gpq;->g:B

    .line 961
    .line 962
    if-eqz v9, :cond_0

    .line 963
    .line 964
    return v10

    .line 965
    :cond_24
    invoke-static {}, La/v4i0;->e()V

    .line 966
    .line 967
    .line 968
    return v10

    .line 969
    :cond_25
    const-wide/16 v18, 0x3e8

    .line 970
    .line 971
    iget-object v2, v0, La/gpq;->c:La/fq80;

    .line 972
    .line 973
    iget-object v4, v2, La/fq80;->a:[B

    .line 974
    .line 975
    const/4 v6, 0x1

    .line 976
    invoke-interface {v1, v4, v10, v3, v6}, La/guo;->h([BIIZ)Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-nez v3, :cond_26

    .line 981
    .line 982
    goto :goto_13

    .line 983
    :cond_26
    invoke-virtual {v2, v10}, La/fq80;->M(I)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v2}, La/fq80;->z()I

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    iput-short v3, v0, La/gpq;->k:S

    .line 991
    .line 992
    invoke-virtual {v2}, La/fq80;->C()I

    .line 993
    .line 994
    .line 995
    move-result v3

    .line 996
    iput v3, v0, La/gpq;->l:I

    .line 997
    .line 998
    invoke-virtual {v2}, La/fq80;->C()I

    .line 999
    .line 1000
    .line 1001
    move-result v3

    .line 1002
    int-to-long v3, v3

    .line 1003
    iput-wide v3, v0, La/gpq;->m:J

    .line 1004
    .line 1005
    invoke-virtual {v2}, La/fq80;->z()I

    .line 1006
    .line 1007
    .line 1008
    move-result v3

    .line 1009
    shl-int/lit8 v3, v3, 0x18

    .line 1010
    .line 1011
    int-to-long v3, v3

    .line 1012
    iget-wide v5, v0, La/gpq;->m:J

    .line 1013
    .line 1014
    or-long/2addr v3, v5

    .line 1015
    mul-long v3, v3, v18

    .line 1016
    .line 1017
    iput-wide v3, v0, La/gpq;->m:J

    .line 1018
    .line 1019
    const/4 v14, 0x3

    .line 1020
    invoke-virtual {v2, v14}, La/fq80;->N(I)V

    .line 1021
    .line 1022
    .line 1023
    const/4 v2, 0x4

    .line 1024
    iput-byte v2, v0, La/gpq;->g:B

    .line 1025
    .line 1026
    goto/16 :goto_0

    .line 1027
    .line 1028
    :cond_27
    move v14, v11

    .line 1029
    iget v2, v0, La/gpq;->j:I

    .line 1030
    .line 1031
    invoke-interface {v1, v2}, La/guo;->m(I)V

    .line 1032
    .line 1033
    .line 1034
    iput v10, v0, La/gpq;->j:I

    .line 1035
    .line 1036
    iput-byte v14, v0, La/gpq;->g:B

    .line 1037
    .line 1038
    goto/16 :goto_0

    .line 1039
    .line 1040
    :cond_28
    iget-object v2, v0, La/gpq;->b:La/fq80;

    .line 1041
    .line 1042
    iget-object v6, v2, La/fq80;->a:[B

    .line 1043
    .line 1044
    const/4 v7, 0x1

    .line 1045
    invoke-interface {v1, v6, v10, v5, v7}, La/guo;->h([BIIZ)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v6

    .line 1049
    if-nez v6, :cond_29

    .line 1050
    .line 1051
    :goto_13
    const/4 v0, -0x1

    .line 1052
    return v0

    .line 1053
    :cond_29
    invoke-virtual {v2, v10}, La/fq80;->M(I)V

    .line 1054
    .line 1055
    .line 1056
    const/4 v9, 0x4

    .line 1057
    invoke-virtual {v2, v9}, La/fq80;->N(I)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v2}, La/fq80;->z()I

    .line 1061
    .line 1062
    .line 1063
    move-result v6

    .line 1064
    and-int/lit8 v7, v6, 0x4

    .line 1065
    .line 1066
    if-eqz v7, :cond_2a

    .line 1067
    .line 1068
    const/4 v7, 0x1

    .line 1069
    goto :goto_14

    .line 1070
    :cond_2a
    move v7, v10

    .line 1071
    :goto_14
    and-int/lit8 v6, v6, 0x1

    .line 1072
    .line 1073
    if-eqz v6, :cond_2b

    .line 1074
    .line 1075
    const/4 v10, 0x1

    .line 1076
    :cond_2b
    if-eqz v7, :cond_2c

    .line 1077
    .line 1078
    iget-object v6, v0, La/gpq;->o:La/e44;

    .line 1079
    .line 1080
    if-nez v6, :cond_2c

    .line 1081
    .line 1082
    new-instance v6, La/e44;

    .line 1083
    .line 1084
    iget-object v7, v0, La/gpq;->f:La/huo;

    .line 1085
    .line 1086
    const/16 v8, 0x8

    .line 1087
    .line 1088
    const/4 v9, 0x1

    .line 1089
    invoke-interface {v7, v8, v9}, La/huo;->q(II)La/ncs0;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v7

    .line 1093
    invoke-direct {v6, v7, v3}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 1094
    .line 1095
    .line 1096
    iput-object v6, v0, La/gpq;->o:La/e44;

    .line 1097
    .line 1098
    :cond_2c
    if-eqz v10, :cond_2d

    .line 1099
    .line 1100
    iget-object v3, v0, La/gpq;->p:La/tfu0;

    .line 1101
    .line 1102
    if-nez v3, :cond_2d

    .line 1103
    .line 1104
    new-instance v3, La/tfu0;

    .line 1105
    .line 1106
    iget-object v6, v0, La/gpq;->f:La/huo;

    .line 1107
    .line 1108
    const/4 v7, 0x2

    .line 1109
    invoke-interface {v6, v5, v7}, La/huo;->q(II)La/ncs0;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v5

    .line 1113
    invoke-direct {v3, v5}, La/tfu0;-><init>(La/ncs0;)V

    .line 1114
    .line 1115
    .line 1116
    iput-object v3, v0, La/gpq;->p:La/tfu0;

    .line 1117
    .line 1118
    goto :goto_15

    .line 1119
    :cond_2d
    const/4 v7, 0x2

    .line 1120
    :goto_15
    iget-object v3, v0, La/gpq;->f:La/huo;

    .line 1121
    .line 1122
    invoke-interface {v3}, La/huo;->o()V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v2}, La/fq80;->m()I

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    sub-int/2addr v2, v4

    .line 1130
    iput v2, v0, La/gpq;->j:I

    .line 1131
    .line 1132
    iput-byte v7, v0, La/gpq;->g:B

    .line 1133
    .line 1134
    goto/16 :goto_0
.end method

.method public final b(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-byte p1, p0, La/gpq;->g:B

    .line 10
    .line 11
    iput-boolean p2, p0, La/gpq;->h:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    iput-byte p1, p0, La/gpq;->g:B

    .line 16
    .line 17
    :goto_0
    iput p2, p0, La/gpq;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public final c(La/guo;)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/gpq;->a:La/fq80;

    .line 2
    .line 3
    iget-object v0, p0, La/fq80;->a:[B

    .line 4
    .line 5
    check-cast p1, La/guj;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-virtual {p1, v0, v1, v2, v1}, La/guj;->b([BIIZ)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, La/fq80;->M(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/fq80;->C()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const v2, 0x464c56

    .line 20
    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, La/fq80;->a:[B

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-virtual {p1, v0, v1, v2, v1}, La/guj;->b([BIIZ)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, La/fq80;->M(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/fq80;->G()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit16 v0, v0, 0xfa

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p0, La/fq80;->a:[B

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-virtual {p1, v0, v1, v2, v1}, La/guj;->b([BIIZ)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, La/fq80;->M(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, La/fq80;->m()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v1, p1, La/guj;->f:I

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, La/guj;->f(IZ)Z

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, La/fq80;->a:[B

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1, v2, v1}, La/guj;->b([BIIZ)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, La/fq80;->M(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/fq80;->m()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    const/4 p0, 0x1

    .line 76
    return p0

    .line 77
    :cond_2
    :goto_0
    return v1
.end method

.method public final e(La/huo;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gpq;->f:La/huo;

    .line 2
    .line 3
    return-void
.end method

.method public final g(La/guo;)La/fq80;
    .locals 5

    .line 1
    iget v0, p0, La/gpq;->l:I

    .line 2
    .line 3
    iget-object v1, p0, La/gpq;->d:La/fq80;

    .line 4
    .line 5
    iget-object v2, v1, La/fq80;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-le v0, v3, :cond_0

    .line 10
    .line 11
    array-length v2, v2

    .line 12
    mul-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    invoke-virtual {v1, v0, v4}, La/fq80;->K([BI)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1, v4}, La/fq80;->M(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget v0, p0, La/gpq;->l:I

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/fq80;->L(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, La/fq80;->a:[B

    .line 33
    .line 34
    iget p0, p0, La/gpq;->l:I

    .line 35
    .line 36
    invoke-interface {p1, v0, v4, p0}, La/guo;->readFully([BII)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
