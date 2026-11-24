.class public abstract La/q5w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const-string v0, "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/q5w0;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v13, "or"

    .line 10
    .line 11
    const-string v14, "org"

    .line 12
    .line 13
    const-string v1, "ac"

    .line 14
    .line 15
    const-string v2, "co"

    .line 16
    .line 17
    const-string v3, "com"

    .line 18
    .line 19
    const-string v4, "ed"

    .line 20
    .line 21
    const-string v5, "edu"

    .line 22
    .line 23
    const-string v6, "go"

    .line 24
    .line 25
    const-string v7, "gouv"

    .line 26
    .line 27
    const-string v8, "gov"

    .line 28
    .line 29
    const-string v9, "info"

    .line 30
    .line 31
    const-string v10, "lg"

    .line 32
    .line 33
    const-string v11, "ne"

    .line 34
    .line 35
    const-string v12, "net"

    .line 36
    .line 37
    filled-new-array/range {v1 .. v14}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, La/q5w0;->b:[Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final a(Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    new-instance v0, La/r4w0;

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v2}, La/r4w0;-><init>(Ljavax/security/auth/x500/X500Principal;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput v2, v0, La/r4w0;->c:I

    .line 14
    .line 15
    iput v2, v0, La/r4w0;->d:I

    .line 16
    .line 17
    iput v2, v0, La/r4w0;->e:I

    .line 18
    .line 19
    iput v2, v0, La/r4w0;->f:I

    .line 20
    .line 21
    iget-object v3, v0, La/r4w0;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iput-object v4, v0, La/r4w0;->g:[C

    .line 28
    .line 29
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0}, La/r4w0;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    :cond_0
    const/16 v16, 0x1

    .line 38
    .line 39
    const/16 v17, 0x2

    .line 40
    .line 41
    goto/16 :goto_d

    .line 42
    .line 43
    :cond_1
    :goto_0
    iget v8, v0, La/r4w0;->c:I

    .line 44
    .line 45
    iget v9, v0, La/r4w0;->b:I

    .line 46
    .line 47
    if-ge v8, v9, :cond_0

    .line 48
    .line 49
    iget-object v10, v0, La/r4w0;->g:[C

    .line 50
    .line 51
    aget-char v10, v10, v8

    .line 52
    .line 53
    const-string v11, "Unexpected end of DN: "

    .line 54
    .line 55
    const/16 v12, 0x5c

    .line 56
    .line 57
    const/16 v13, 0x22

    .line 58
    .line 59
    const/16 v14, 0x20

    .line 60
    .line 61
    const/16 v15, 0x3b

    .line 62
    .line 63
    const/16 v16, 0x1

    .line 64
    .line 65
    const/16 v7, 0x2c

    .line 66
    .line 67
    const/16 v17, 0x2

    .line 68
    .line 69
    const/16 v6, 0x2b

    .line 70
    .line 71
    if-eq v10, v13, :cond_13

    .line 72
    .line 73
    const/16 v13, 0x23

    .line 74
    .line 75
    if-eq v10, v13, :cond_a

    .line 76
    .line 77
    if-eq v10, v6, :cond_9

    .line 78
    .line 79
    if-eq v10, v7, :cond_9

    .line 80
    .line 81
    if-eq v10, v15, :cond_9

    .line 82
    .line 83
    iput v8, v0, La/r4w0;->d:I

    .line 84
    .line 85
    iput v8, v0, La/r4w0;->e:I

    .line 86
    .line 87
    :goto_1
    iget v8, v0, La/r4w0;->c:I

    .line 88
    .line 89
    iget-object v10, v0, La/r4w0;->g:[C

    .line 90
    .line 91
    if-lt v8, v9, :cond_2

    .line 92
    .line 93
    new-instance v8, Ljava/lang/String;

    .line 94
    .line 95
    iget v11, v0, La/r4w0;->d:I

    .line 96
    .line 97
    iget v12, v0, La/r4w0;->e:I

    .line 98
    .line 99
    sub-int/2addr v12, v11

    .line 100
    invoke-direct {v8, v10, v11, v12}, Ljava/lang/String;-><init>([CII)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_a

    .line 104
    .line 105
    :cond_2
    aget-char v11, v10, v8

    .line 106
    .line 107
    if-eq v11, v14, :cond_6

    .line 108
    .line 109
    if-eq v11, v15, :cond_5

    .line 110
    .line 111
    if-eq v11, v12, :cond_4

    .line 112
    .line 113
    if-eq v11, v6, :cond_5

    .line 114
    .line 115
    if-eq v11, v7, :cond_5

    .line 116
    .line 117
    iget v13, v0, La/r4w0;->e:I

    .line 118
    .line 119
    add-int/lit8 v2, v13, 0x1

    .line 120
    .line 121
    iput v2, v0, La/r4w0;->e:I

    .line 122
    .line 123
    aput-char v11, v10, v13

    .line 124
    .line 125
    add-int/lit8 v8, v8, 0x1

    .line 126
    .line 127
    iput v8, v0, La/r4w0;->c:I

    .line 128
    .line 129
    :cond_3
    :goto_2
    const/4 v2, 0x0

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    iget v2, v0, La/r4w0;->e:I

    .line 132
    .line 133
    add-int/lit8 v8, v2, 0x1

    .line 134
    .line 135
    iput v8, v0, La/r4w0;->e:I

    .line 136
    .line 137
    invoke-virtual {v0}, La/r4w0;->b()C

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    aput-char v8, v10, v2

    .line 142
    .line 143
    iget v2, v0, La/r4w0;->c:I

    .line 144
    .line 145
    add-int/lit8 v2, v2, 0x1

    .line 146
    .line 147
    iput v2, v0, La/r4w0;->c:I

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    new-instance v8, Ljava/lang/String;

    .line 151
    .line 152
    iget v2, v0, La/r4w0;->d:I

    .line 153
    .line 154
    iget v11, v0, La/r4w0;->e:I

    .line 155
    .line 156
    sub-int/2addr v11, v2

    .line 157
    invoke-direct {v8, v10, v2, v11}, Ljava/lang/String;-><init>([CII)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_a

    .line 161
    .line 162
    :cond_6
    iget v2, v0, La/r4w0;->e:I

    .line 163
    .line 164
    iput v2, v0, La/r4w0;->f:I

    .line 165
    .line 166
    add-int/lit8 v8, v8, 0x1

    .line 167
    .line 168
    iput v8, v0, La/r4w0;->c:I

    .line 169
    .line 170
    add-int/lit8 v8, v2, 0x1

    .line 171
    .line 172
    iput v8, v0, La/r4w0;->e:I

    .line 173
    .line 174
    aput-char v14, v10, v2

    .line 175
    .line 176
    :goto_3
    iget v2, v0, La/r4w0;->c:I

    .line 177
    .line 178
    if-ge v2, v9, :cond_7

    .line 179
    .line 180
    iget-object v8, v0, La/r4w0;->g:[C

    .line 181
    .line 182
    aget-char v10, v8, v2

    .line 183
    .line 184
    if-ne v10, v14, :cond_7

    .line 185
    .line 186
    iget v10, v0, La/r4w0;->e:I

    .line 187
    .line 188
    add-int/lit8 v11, v10, 0x1

    .line 189
    .line 190
    iput v11, v0, La/r4w0;->e:I

    .line 191
    .line 192
    aput-char v14, v8, v10

    .line 193
    .line 194
    add-int/lit8 v2, v2, 0x1

    .line 195
    .line 196
    iput v2, v0, La/r4w0;->c:I

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_7
    if-eq v2, v9, :cond_8

    .line 200
    .line 201
    iget-object v8, v0, La/r4w0;->g:[C

    .line 202
    .line 203
    aget-char v2, v8, v2

    .line 204
    .line 205
    if-eq v2, v7, :cond_8

    .line 206
    .line 207
    if-eq v2, v6, :cond_8

    .line 208
    .line 209
    if-ne v2, v15, :cond_3

    .line 210
    .line 211
    :cond_8
    new-instance v8, Ljava/lang/String;

    .line 212
    .line 213
    iget-object v2, v0, La/r4w0;->g:[C

    .line 214
    .line 215
    iget v10, v0, La/r4w0;->d:I

    .line 216
    .line 217
    iget v11, v0, La/r4w0;->f:I

    .line 218
    .line 219
    sub-int/2addr v11, v10

    .line 220
    invoke-direct {v8, v2, v10, v11}, Ljava/lang/String;-><init>([CII)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_a

    .line 224
    .line 225
    :cond_9
    const-string v8, ""

    .line 226
    .line 227
    goto/16 :goto_a

    .line 228
    .line 229
    :cond_a
    add-int/lit8 v2, v8, 0x4

    .line 230
    .line 231
    if-ge v2, v9, :cond_12

    .line 232
    .line 233
    iput v8, v0, La/r4w0;->d:I

    .line 234
    .line 235
    add-int/lit8 v8, v8, 0x1

    .line 236
    .line 237
    iput v8, v0, La/r4w0;->c:I

    .line 238
    .line 239
    :goto_4
    iget v2, v0, La/r4w0;->c:I

    .line 240
    .line 241
    if-eq v2, v9, :cond_e

    .line 242
    .line 243
    iget-object v8, v0, La/r4w0;->g:[C

    .line 244
    .line 245
    aget-char v10, v8, v2

    .line 246
    .line 247
    if-eq v10, v6, :cond_e

    .line 248
    .line 249
    if-eq v10, v7, :cond_e

    .line 250
    .line 251
    if-ne v10, v15, :cond_b

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_b
    if-ne v10, v14, :cond_c

    .line 255
    .line 256
    iput v2, v0, La/r4w0;->e:I

    .line 257
    .line 258
    add-int/lit8 v2, v2, 0x1

    .line 259
    .line 260
    iput v2, v0, La/r4w0;->c:I

    .line 261
    .line 262
    :goto_5
    iget v2, v0, La/r4w0;->c:I

    .line 263
    .line 264
    if-ge v2, v9, :cond_f

    .line 265
    .line 266
    iget-object v8, v0, La/r4w0;->g:[C

    .line 267
    .line 268
    aget-char v8, v8, v2

    .line 269
    .line 270
    if-ne v8, v14, :cond_f

    .line 271
    .line 272
    add-int/lit8 v2, v2, 0x1

    .line 273
    .line 274
    iput v2, v0, La/r4w0;->c:I

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_c
    const/16 v12, 0x41

    .line 278
    .line 279
    if-lt v10, v12, :cond_d

    .line 280
    .line 281
    const/16 v12, 0x46

    .line 282
    .line 283
    if-gt v10, v12, :cond_d

    .line 284
    .line 285
    add-int/lit8 v10, v10, 0x20

    .line 286
    .line 287
    int-to-char v10, v10

    .line 288
    aput-char v10, v8, v2

    .line 289
    .line 290
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 291
    .line 292
    iput v2, v0, La/r4w0;->c:I

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_e
    :goto_6
    iput v2, v0, La/r4w0;->e:I

    .line 296
    .line 297
    :cond_f
    iget v2, v0, La/r4w0;->e:I

    .line 298
    .line 299
    iget v8, v0, La/r4w0;->d:I

    .line 300
    .line 301
    sub-int/2addr v2, v8

    .line 302
    const/4 v10, 0x5

    .line 303
    if-lt v2, v10, :cond_11

    .line 304
    .line 305
    and-int/lit8 v10, v2, 0x1

    .line 306
    .line 307
    if-eqz v10, :cond_11

    .line 308
    .line 309
    div-int/lit8 v10, v2, 0x2

    .line 310
    .line 311
    new-array v11, v10, [B

    .line 312
    .line 313
    add-int/lit8 v8, v8, 0x1

    .line 314
    .line 315
    const/4 v12, 0x0

    .line 316
    :goto_7
    if-ge v12, v10, :cond_10

    .line 317
    .line 318
    invoke-virtual {v0, v8}, La/r4w0;->a(I)I

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    int-to-byte v13, v13

    .line 323
    aput-byte v13, v11, v12

    .line 324
    .line 325
    add-int/lit8 v8, v8, 0x2

    .line 326
    .line 327
    add-int/lit8 v12, v12, 0x1

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_10
    new-instance v8, Ljava/lang/String;

    .line 331
    .line 332
    iget-object v10, v0, La/r4w0;->g:[C

    .line 333
    .line 334
    iget v11, v0, La/r4w0;->d:I

    .line 335
    .line 336
    invoke-direct {v8, v10, v11, v2}, Ljava/lang/String;-><init>([CII)V

    .line 337
    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_11
    invoke-virtual {v11, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_12
    invoke-virtual {v11, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 357
    .line 358
    iput v8, v0, La/r4w0;->c:I

    .line 359
    .line 360
    iput v8, v0, La/r4w0;->d:I

    .line 361
    .line 362
    iput v8, v0, La/r4w0;->e:I

    .line 363
    .line 364
    :goto_8
    iget v2, v0, La/r4w0;->c:I

    .line 365
    .line 366
    if-eq v2, v9, :cond_1e

    .line 367
    .line 368
    iget-object v8, v0, La/r4w0;->g:[C

    .line 369
    .line 370
    aget-char v10, v8, v2

    .line 371
    .line 372
    if-ne v10, v13, :cond_1c

    .line 373
    .line 374
    add-int/lit8 v2, v2, 0x1

    .line 375
    .line 376
    iput v2, v0, La/r4w0;->c:I

    .line 377
    .line 378
    :goto_9
    iget v2, v0, La/r4w0;->c:I

    .line 379
    .line 380
    if-ge v2, v9, :cond_14

    .line 381
    .line 382
    iget-object v8, v0, La/r4w0;->g:[C

    .line 383
    .line 384
    aget-char v8, v8, v2

    .line 385
    .line 386
    if-ne v8, v14, :cond_14

    .line 387
    .line 388
    add-int/lit8 v2, v2, 0x1

    .line 389
    .line 390
    iput v2, v0, La/r4w0;->c:I

    .line 391
    .line 392
    goto :goto_9

    .line 393
    :cond_14
    new-instance v8, Ljava/lang/String;

    .line 394
    .line 395
    iget-object v2, v0, La/r4w0;->g:[C

    .line 396
    .line 397
    iget v10, v0, La/r4w0;->d:I

    .line 398
    .line 399
    iget v11, v0, La/r4w0;->e:I

    .line 400
    .line 401
    sub-int/2addr v11, v10

    .line 402
    invoke-direct {v8, v2, v10, v11}, Ljava/lang/String;-><init>([CII)V

    .line 403
    .line 404
    .line 405
    :goto_a
    const-string v2, "cn"

    .line 406
    .line 407
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-eqz v2, :cond_16

    .line 412
    .line 413
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-eqz v2, :cond_15

    .line 418
    .line 419
    new-instance v4, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    :cond_15
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    :cond_16
    iget v2, v0, La/r4w0;->c:I

    .line 428
    .line 429
    if-lt v2, v9, :cond_17

    .line 430
    .line 431
    goto :goto_d

    .line 432
    :cond_17
    iget-object v5, v0, La/r4w0;->g:[C

    .line 433
    .line 434
    aget-char v5, v5, v2

    .line 435
    .line 436
    const-string v8, "Malformed DN: "

    .line 437
    .line 438
    if-eq v5, v7, :cond_1a

    .line 439
    .line 440
    if-ne v5, v15, :cond_18

    .line 441
    .line 442
    goto :goto_b

    .line 443
    :cond_18
    if-ne v5, v6, :cond_19

    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_19
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :cond_1a
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 455
    .line 456
    iput v2, v0, La/r4w0;->c:I

    .line 457
    .line 458
    invoke-virtual {v0}, La/r4w0;->c()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    if-eqz v5, :cond_1b

    .line 463
    .line 464
    const/4 v2, 0x0

    .line 465
    goto/16 :goto_0

    .line 466
    .line 467
    :cond_1b
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :cond_1c
    iget v2, v0, La/r4w0;->e:I

    .line 476
    .line 477
    if-ne v10, v12, :cond_1d

    .line 478
    .line 479
    invoke-virtual {v0}, La/r4w0;->b()C

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    aput-char v10, v8, v2

    .line 484
    .line 485
    goto :goto_c

    .line 486
    :cond_1d
    aput-char v10, v8, v2

    .line 487
    .line 488
    :goto_c
    iget v2, v0, La/r4w0;->c:I

    .line 489
    .line 490
    add-int/lit8 v2, v2, 0x1

    .line 491
    .line 492
    iput v2, v0, La/r4w0;->c:I

    .line 493
    .line 494
    iget v2, v0, La/r4w0;->e:I

    .line 495
    .line 496
    add-int/lit8 v2, v2, 0x1

    .line 497
    .line 498
    iput v2, v0, La/r4w0;->e:I

    .line 499
    .line 500
    goto/16 :goto_8

    .line 501
    .line 502
    :cond_1e
    invoke-virtual {v11, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :goto_d
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    const/4 v2, 0x0

    .line 515
    if-nez v0, :cond_1f

    .line 516
    .line 517
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    new-array v0, v0, [Ljava/lang/String;

    .line 522
    .line 523
    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-object v3, v0

    .line 527
    goto :goto_e

    .line 528
    :cond_1f
    move-object v3, v2

    .line 529
    :goto_e
    new-instance v4, Ljava/util/LinkedList;

    .line 530
    .line 531
    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 532
    .line 533
    .line 534
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    .line 535
    .line 536
    .line 537
    move-result-object v0
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 538
    goto :goto_f

    .line 539
    :catch_0
    move-exception v0

    .line 540
    const-string v5, "Error parsing certificate."

    .line 541
    .line 542
    const-string v6, "SecurityComp20000302: "

    .line 543
    .line 544
    invoke-static {v6, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 545
    .line 546
    .line 547
    move-object v0, v2

    .line 548
    :goto_f
    if-eqz v0, :cond_21

    .line 549
    .line 550
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    if-eqz v5, :cond_21

    .line 559
    .line 560
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    check-cast v5, Ljava/util/List;

    .line 565
    .line 566
    const/4 v6, 0x0

    .line 567
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    check-cast v7, Ljava/lang/Integer;

    .line 572
    .line 573
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    move/from16 v7, v17

    .line 578
    .line 579
    if-ne v6, v7, :cond_20

    .line 580
    .line 581
    move/from16 v6, v16

    .line 582
    .line 583
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    check-cast v5, Ljava/lang/String;

    .line 588
    .line 589
    invoke-virtual {v4, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    const/16 v16, 0x1

    .line 593
    .line 594
    const/16 v17, 0x2

    .line 595
    .line 596
    goto :goto_10

    .line 597
    :cond_20
    move/from16 v17, v7

    .line 598
    .line 599
    const/16 v16, 0x1

    .line 600
    .line 601
    goto :goto_10

    .line 602
    :cond_21
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-nez v0, :cond_22

    .line 607
    .line 608
    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    new-array v2, v0, [Ljava/lang/String;

    .line 613
    .line 614
    invoke-virtual {v4, v2}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    :cond_22
    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    new-instance v0, Ljava/util/LinkedList;

    .line 624
    .line 625
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 626
    .line 627
    .line 628
    if-eqz v3, :cond_23

    .line 629
    .line 630
    array-length v4, v3

    .line 631
    if-lez v4, :cond_23

    .line 632
    .line 633
    const/16 v18, 0x0

    .line 634
    .line 635
    aget-object v3, v3, v18

    .line 636
    .line 637
    if-eqz v3, :cond_24

    .line 638
    .line 639
    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    goto :goto_11

    .line 643
    :cond_23
    const/16 v18, 0x0

    .line 644
    .line 645
    :cond_24
    :goto_11
    if-eqz v2, :cond_26

    .line 646
    .line 647
    array-length v3, v2

    .line 648
    move/from16 v6, v18

    .line 649
    .line 650
    :goto_12
    if-ge v6, v3, :cond_26

    .line 651
    .line 652
    aget-object v4, v2, v6

    .line 653
    .line 654
    if-eqz v4, :cond_25

    .line 655
    .line 656
    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    :cond_25
    add-int/lit8 v6, v6, 0x1

    .line 660
    .line 661
    goto :goto_12

    .line 662
    :cond_26
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    if-nez v2, :cond_34

    .line 667
    .line 668
    new-instance v2, Ljava/lang/StringBuffer;

    .line 669
    .line 670
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 678
    .line 679
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    move/from16 v6, v18

    .line 688
    .line 689
    :cond_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    if-eqz v4, :cond_32

    .line 694
    .line 695
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    check-cast v4, Ljava/lang/String;

    .line 700
    .line 701
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 702
    .line 703
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    const-string v5, " <"

    .line 708
    .line 709
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 713
    .line 714
    .line 715
    const/16 v5, 0x3e

    .line 716
    .line 717
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 718
    .line 719
    .line 720
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 721
    .line 722
    .line 723
    move-result v5

    .line 724
    if-eqz v5, :cond_28

    .line 725
    .line 726
    const-string v5, " OR"

    .line 727
    .line 728
    invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 729
    .line 730
    .line 731
    :cond_28
    const-string v5, "*."

    .line 732
    .line 733
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    if-eqz v5, :cond_30

    .line 738
    .line 739
    const/16 v5, 0x2e

    .line 740
    .line 741
    const/4 v7, 0x2

    .line 742
    invoke-virtual {v4, v5, v7}, Ljava/lang/String;->indexOf(II)I

    .line 743
    .line 744
    .line 745
    move-result v6

    .line 746
    const/4 v7, -0x1

    .line 747
    if-eq v6, v7, :cond_30

    .line 748
    .line 749
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 750
    .line 751
    .line 752
    move-result v6

    .line 753
    const/4 v7, 0x7

    .line 754
    if-lt v6, v7, :cond_2a

    .line 755
    .line 756
    const/16 v7, 0x9

    .line 757
    .line 758
    if-gt v6, v7, :cond_2a

    .line 759
    .line 760
    add-int/lit8 v6, v6, -0x3

    .line 761
    .line 762
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 763
    .line 764
    .line 765
    move-result v7

    .line 766
    if-ne v7, v5, :cond_2a

    .line 767
    .line 768
    const/4 v7, 0x2

    .line 769
    invoke-virtual {v4, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v6

    .line 773
    sget-object v8, La/q5w0;->b:[Ljava/lang/String;

    .line 774
    .line 775
    invoke-static {v8, v6}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 776
    .line 777
    .line 778
    move-result v6

    .line 779
    if-gez v6, :cond_29

    .line 780
    .line 781
    goto :goto_14

    .line 782
    :cond_29
    :goto_13
    const/4 v8, 0x1

    .line 783
    goto :goto_17

    .line 784
    :cond_2a
    const/4 v7, 0x2

    .line 785
    :goto_14
    sget-object v6, La/q5w0;->a:Ljava/util/regex/Pattern;

    .line 786
    .line 787
    invoke-virtual {v6, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 788
    .line 789
    .line 790
    move-result-object v6

    .line 791
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 792
    .line 793
    .line 794
    move-result v6

    .line 795
    if-nez v6, :cond_29

    .line 796
    .line 797
    const/4 v8, 0x1

    .line 798
    invoke-virtual {v4, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 803
    .line 804
    .line 805
    move-result v6

    .line 806
    if-eqz v6, :cond_31

    .line 807
    .line 808
    move/from16 v6, v18

    .line 809
    .line 810
    move v9, v6

    .line 811
    :goto_15
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 812
    .line 813
    .line 814
    move-result v10

    .line 815
    if-ge v6, v10, :cond_2c

    .line 816
    .line 817
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    .line 818
    .line 819
    .line 820
    move-result v10

    .line 821
    if-ne v10, v5, :cond_2b

    .line 822
    .line 823
    add-int/lit8 v9, v9, 0x1

    .line 824
    .line 825
    :cond_2b
    add-int/lit8 v6, v6, 0x1

    .line 826
    .line 827
    goto :goto_15

    .line 828
    :cond_2c
    move/from16 v6, v18

    .line 829
    .line 830
    move v10, v6

    .line 831
    :goto_16
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 832
    .line 833
    .line 834
    move-result v11

    .line 835
    if-ge v6, v11, :cond_2e

    .line 836
    .line 837
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 838
    .line 839
    .line 840
    move-result v11

    .line 841
    if-ne v11, v5, :cond_2d

    .line 842
    .line 843
    add-int/lit8 v10, v10, 0x1

    .line 844
    .line 845
    :cond_2d
    add-int/lit8 v6, v6, 0x1

    .line 846
    .line 847
    goto :goto_16

    .line 848
    :cond_2e
    if-ne v9, v10, :cond_2f

    .line 849
    .line 850
    move v6, v8

    .line 851
    goto :goto_18

    .line 852
    :cond_2f
    move/from16 v6, v18

    .line 853
    .line 854
    goto :goto_18

    .line 855
    :cond_30
    const/4 v7, 0x2

    .line 856
    goto :goto_13

    .line 857
    :goto_17
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v4

    .line 861
    move v6, v4

    .line 862
    :cond_31
    :goto_18
    if-eqz v6, :cond_27

    .line 863
    .line 864
    :cond_32
    if-eqz v6, :cond_33

    .line 865
    .line 866
    return-void

    .line 867
    :cond_33
    new-instance v0, Ljavax/net/ssl/SSLException;

    .line 868
    .line 869
    new-instance v3, Ljava/lang/StringBuilder;

    .line 870
    .line 871
    const-string v4, "hostname in certificate didn\'t match: <"

    .line 872
    .line 873
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    const-string v1, "> !="

    .line 880
    .line 881
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    throw v0

    .line 895
    :cond_34
    const-string v0, "Certificate for <"

    .line 896
    .line 897
    const-string v2, "> doesn\'t contain CN or DNS subjectAlt"

    .line 898
    .line 899
    invoke-static {v0, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    new-instance v1, Ljavax/net/ssl/SSLException;

    .line 904
    .line 905
    invoke-direct {v1, v0}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    throw v1
.end method
