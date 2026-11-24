.class public final La/v9d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:La/v9d;


# instance fields
.field public final a:[I

.field public final b:[C

.field public final c:[Z

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/v9d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    new-array v3, v1, [C

    .line 7
    .line 8
    new-array v4, v1, [Z

    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v4, v1}, La/v9d;-><init>([I[C[ZI)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/v9d;->e:La/v9d;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>([I[C[ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v9d;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, La/v9d;->b:[C

    .line 7
    .line 8
    iput-object p3, p0, La/v9d;->c:[Z

    .line 9
    .line 10
    iput p4, p0, La/v9d;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/k810;Z)La/v9d;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v3, v1, La/k810;->d:Ljava/lang/CharSequence;

    .line 8
    .line 9
    iget v4, v1, La/k810;->b:I

    .line 10
    .line 11
    const/4 v5, -0x1

    .line 12
    if-ne v4, v5, :cond_1

    .line 13
    .line 14
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 15
    .line 16
    goto/16 :goto_f

    .line 17
    .line 18
    :cond_1
    invoke-static {v4, v3}, La/fbc;->O(ILjava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/16 v5, 0x9

    .line 26
    .line 27
    if-lez v4, :cond_3

    .line 28
    .line 29
    add-int/lit8 v7, v4, -0x1

    .line 30
    .line 31
    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-ne v7, v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0}, La/v9d;->e()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    rem-int/lit8 v7, v7, 0x4

    .line 42
    .line 43
    rsub-int/lit8 v7, v7, 0x4

    .line 44
    .line 45
    rem-int/lit8 v7, v7, 0x4

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    const/4 v7, 0x0

    .line 49
    :goto_1
    move v8, v4

    .line 50
    :goto_2
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    const/4 v10, 0x3

    .line 55
    const/16 v11, 0x20

    .line 56
    .line 57
    if-ge v8, v9, :cond_4

    .line 58
    .line 59
    invoke-interface {v3, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-ne v9, v11, :cond_4

    .line 64
    .line 65
    if-ge v7, v10, :cond_4

    .line 66
    .line 67
    add-int/lit8 v7, v7, 0x1

    .line 68
    .line 69
    add-int/lit8 v8, v8, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    const/4 v12, 0x1

    .line 77
    if-ne v8, v9, :cond_5

    .line 78
    .line 79
    const/4 v1, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    goto/16 :goto_b

    .line 83
    .line 84
    :cond_5
    sub-int v9, v8, v4

    .line 85
    .line 86
    invoke-virtual {v1, v9}, La/k810;->e(I)La/k810;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v9, v1, La/k810;->e:La/gxu;

    .line 94
    .line 95
    iget v13, v1, La/k810;->b:I

    .line 96
    .line 97
    iget-object v9, v9, La/gxu;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v9, Ljava/lang/CharSequence;

    .line 100
    .line 101
    iget v14, v1, La/k810;->c:I

    .line 102
    .line 103
    invoke-interface {v9, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    const/16 v14, 0x2a

    .line 108
    .line 109
    const/16 v15, 0x3a

    .line 110
    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const/16 v2, 0x30

    .line 114
    .line 115
    if-eq v9, v14, :cond_a

    .line 116
    .line 117
    const/16 v14, 0x2d

    .line 118
    .line 119
    if-eq v9, v14, :cond_a

    .line 120
    .line 121
    const/16 v14, 0x2b

    .line 122
    .line 123
    if-ne v9, v14, :cond_6

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    iget-object v1, v1, La/k810;->d:Ljava/lang/CharSequence;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    add-int/lit8 v14, v13, 0xa

    .line 133
    .line 134
    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    move v14, v13

    .line 139
    :goto_3
    if-ge v14, v9, :cond_7

    .line 140
    .line 141
    invoke-interface {v1, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-gt v2, v6, :cond_7

    .line 146
    .line 147
    if-ge v6, v15, :cond_7

    .line 148
    .line 149
    add-int/lit8 v14, v14, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    if-le v14, v13, :cond_9

    .line 153
    .line 154
    sub-int v6, v14, v13

    .line 155
    .line 156
    if-gt v6, v5, :cond_9

    .line 157
    .line 158
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-ge v14, v6, :cond_9

    .line 163
    .line 164
    invoke-interface {v1, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    const/16 v9, 0x2e

    .line 169
    .line 170
    if-eq v6, v9, :cond_8

    .line 171
    .line 172
    invoke-interface {v1, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    const/16 v9, 0x29

    .line 177
    .line 178
    if-ne v6, v9, :cond_9

    .line 179
    .line 180
    :cond_8
    new-instance v6, La/t9d;

    .line 181
    .line 182
    add-int/lit8 v9, v14, 0x1

    .line 183
    .line 184
    sub-int/2addr v9, v13

    .line 185
    invoke-interface {v1, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-direct {v6, v1, v9, v9}, La/t9d;-><init>(CII)V

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_9
    move-object/from16 v6, v16

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_a
    :goto_4
    new-instance v6, La/t9d;

    .line 197
    .line 198
    invoke-direct {v6, v9, v12, v12}, La/t9d;-><init>(CII)V

    .line 199
    .line 200
    .line 201
    :goto_5
    if-nez v6, :cond_c

    .line 202
    .line 203
    :cond_b
    :goto_6
    move-object/from16 v1, v16

    .line 204
    .line 205
    goto/16 :goto_b

    .line 206
    .line 207
    :cond_c
    iget-char v1, v6, La/t9d;->b:C

    .line 208
    .line 209
    iget v9, v6, La/t9d;->c:I

    .line 210
    .line 211
    if-eqz p2, :cond_f

    .line 212
    .line 213
    invoke-interface {v3, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    if-gt v2, v13, :cond_f

    .line 218
    .line 219
    if-ge v13, v15, :cond_f

    .line 220
    .line 221
    move v13, v8

    .line 222
    :goto_7
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    if-ge v13, v14, :cond_d

    .line 227
    .line 228
    invoke-interface {v3, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 229
    .line 230
    .line 231
    move-result v14

    .line 232
    if-gt v2, v14, :cond_d

    .line 233
    .line 234
    if-ge v14, v15, :cond_d

    .line 235
    .line 236
    add-int/lit8 v13, v13, 0x1

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_d
    invoke-interface {v3, v8, v13}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    if-nez v2, :cond_e

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eq v2, v12, :cond_f

    .line 259
    .line 260
    :goto_8
    goto :goto_6

    .line 261
    :cond_f
    iget v2, v6, La/t9d;->a:I

    .line 262
    .line 263
    add-int/2addr v8, v2

    .line 264
    move v2, v8

    .line 265
    const/4 v6, 0x0

    .line 266
    :goto_9
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 267
    .line 268
    .line 269
    move-result v13

    .line 270
    if-ge v2, v13, :cond_11

    .line 271
    .line 272
    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    if-ne v13, v11, :cond_10

    .line 277
    .line 278
    add-int/lit8 v6, v6, 0x1

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_10
    if-ne v13, v5, :cond_11

    .line 282
    .line 283
    rem-int/lit8 v13, v6, 0x4

    .line 284
    .line 285
    rsub-int/lit8 v13, v13, 0x4

    .line 286
    .line 287
    add-int/2addr v13, v6

    .line 288
    move v6, v13

    .line 289
    :goto_a
    add-int/lit8 v2, v2, 0x1

    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_11
    if-eqz p2, :cond_12

    .line 293
    .line 294
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    if-ne v2, v13, :cond_12

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_12
    const/4 v13, 0x5

    .line 302
    if-gt v12, v6, :cond_13

    .line 303
    .line 304
    if-ge v6, v13, :cond_13

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 307
    .line 308
    .line 309
    move-result v14

    .line 310
    if-ge v2, v14, :cond_13

    .line 311
    .line 312
    add-int/2addr v7, v9

    .line 313
    add-int/2addr v7, v6

    .line 314
    invoke-static {v0, v7, v1, v2}, La/obb;->K(La/v9d;ICI)La/v9d;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    goto :goto_b

    .line 319
    :cond_13
    if-lt v6, v13, :cond_14

    .line 320
    .line 321
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    if-lt v2, v6, :cond_15

    .line 326
    .line 327
    :cond_14
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-ne v2, v6, :cond_b

    .line 332
    .line 333
    :cond_15
    add-int/2addr v7, v9

    .line 334
    add-int/2addr v7, v12

    .line 335
    add-int/2addr v8, v12

    .line 336
    invoke-static {v2, v8}, Ljava/lang/Math;->min(II)I

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    invoke-static {v0, v7, v1, v2}, La/obb;->K(La/v9d;ICI)La/v9d;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    :goto_b
    if-nez v1, :cond_1b

    .line 345
    .line 346
    const/4 v1, 0x0

    .line 347
    :goto_c
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-ge v4, v2, :cond_16

    .line 352
    .line 353
    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-ne v2, v11, :cond_16

    .line 358
    .line 359
    if-ge v1, v10, :cond_16

    .line 360
    .line 361
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    add-int/lit8 v4, v4, 0x1

    .line 364
    .line 365
    goto :goto_c

    .line 366
    :cond_16
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eq v4, v2, :cond_1c

    .line 371
    .line 372
    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    const/16 v6, 0x3e

    .line 377
    .line 378
    if-eq v2, v6, :cond_17

    .line 379
    .line 380
    goto :goto_f

    .line 381
    :cond_17
    add-int/lit8 v2, v4, 0x1

    .line 382
    .line 383
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    if-ge v2, v7, :cond_19

    .line 388
    .line 389
    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    if-eq v7, v11, :cond_19

    .line 394
    .line 395
    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    if-ne v7, v5, :cond_18

    .line 400
    .line 401
    goto :goto_d

    .line 402
    :cond_18
    const/16 v17, 0x0

    .line 403
    .line 404
    goto :goto_e

    .line 405
    :cond_19
    :goto_d
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-ge v2, v3, :cond_1a

    .line 410
    .line 411
    add-int/lit8 v2, v4, 0x2

    .line 412
    .line 413
    :cond_1a
    move/from16 v17, v12

    .line 414
    .line 415
    :goto_e
    add-int/2addr v1, v12

    .line 416
    add-int v1, v1, v17

    .line 417
    .line 418
    invoke-static {v0, v1, v6, v2}, La/obb;->K(La/v9d;ICI)La/v9d;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    return-object v0

    .line 423
    :cond_1b
    return-object v1

    .line 424
    :cond_1c
    :goto_f
    return-object v16
.end method

.method public final b(La/k810;)La/v9d;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, La/v9d;->e:La/v9d;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget v0, p1, La/k810;->b:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-object p1, p1, La/k810;->d:Ljava/lang/CharSequence;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, p1, v0}, La/v9d;->d(Ljava/lang/CharSequence;La/bt40;)La/v9d;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v0, "given "

    .line 22
    .line 23
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p1, La/byw;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final c(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    instance-of v1, p1, Ljava/util/Collection;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :cond_1
    move-object v1, p1

    .line 25
    check-cast v1, La/kkx;

    .line 26
    .line 27
    iget-boolean v1, v1, La/kkx;->c:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    move-object v1, p1

    .line 32
    check-cast v1, La/bkx;

    .line 33
    .line 34
    invoke-virtual {v1}, La/bkx;->nextInt()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iget-object v2, p0, La/v9d;->b:[C

    .line 39
    .line 40
    aget-char v2, v2, v1

    .line 41
    .line 42
    const/16 v3, 0x3e

    .line 43
    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, La/v9d;->c:[Z

    .line 47
    .line 48
    aget-boolean v1, v2, v1

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_2
    :goto_0
    return v0
.end method

.method public final d(Ljava/lang/CharSequence;La/bt40;)La/v9d;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/v9d;->a:[I

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    goto/16 :goto_a

    .line 13
    .line 14
    :cond_0
    new-array v5, v4, [I

    .line 15
    .line 16
    new-array v6, v4, [C

    .line 17
    .line 18
    new-array v7, v4, [Z

    .line 19
    .line 20
    new-instance v8, La/kie0;

    .line 21
    .line 22
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v9, La/kie0;

    .line 26
    .line 27
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v10, La/kie0;

    .line 31
    .line 32
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v11, La/u9d;

    .line 36
    .line 37
    invoke-direct {v11, v10, v8, v1, v9}, La/u9d;-><init>(La/kie0;La/kie0;Ljava/lang/CharSequence;La/kie0;)V

    .line 38
    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    move v13, v12

    .line 42
    move v14, v13

    .line 43
    move v15, v14

    .line 44
    :goto_0
    if-ge v13, v4, :cond_f

    .line 45
    .line 46
    iput v12, v9, La/kie0;->a:I

    .line 47
    .line 48
    iput v12, v10, La/kie0;->a:I

    .line 49
    .line 50
    move/from16 v16, v12

    .line 51
    .line 52
    iget v12, v8, La/kie0;->a:I

    .line 53
    .line 54
    move-object/from16 v17, v3

    .line 55
    .line 56
    iget-object v3, v0, La/v9d;->b:[C

    .line 57
    .line 58
    aget-char v0, v3, v13

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    move-object/from16 v19, v3

    .line 63
    .line 64
    const/16 v3, 0x3e

    .line 65
    .line 66
    if-ne v0, v3, :cond_5

    .line 67
    .line 68
    move-object/from16 v21, v9

    .line 69
    .line 70
    move v3, v12

    .line 71
    move/from16 v0, v16

    .line 72
    .line 73
    :goto_1
    const/4 v9, 0x3

    .line 74
    if-ge v0, v9, :cond_1

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-ge v3, v9, :cond_1

    .line 81
    .line 82
    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    move/from16 v22, v0

    .line 87
    .line 88
    const/16 v0, 0x20

    .line 89
    .line 90
    if-ne v9, v0, :cond_2

    .line 91
    .line 92
    add-int/lit8 v0, v22, 0x1

    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move/from16 v22, v0

    .line 98
    .line 99
    :cond_2
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-ge v3, v0, :cond_3

    .line 104
    .line 105
    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    const/16 v3, 0x3e

    .line 110
    .line 111
    if-ne v0, v3, :cond_3

    .line 112
    .line 113
    add-int/lit8 v0, v22, 0x1

    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v18

    .line 119
    :cond_3
    if-nez v18, :cond_4

    .line 120
    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_4
    iget v0, v8, La/kie0;->a:I

    .line 124
    .line 125
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    add-int/2addr v3, v0

    .line 130
    iput v3, v8, La/kie0;->a:I

    .line 131
    .line 132
    add-int/lit8 v13, v13, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move-object/from16 v21, v9

    .line 136
    .line 137
    :goto_2
    move v0, v13

    .line 138
    :goto_3
    if-ge v0, v4, :cond_8

    .line 139
    .line 140
    aget-char v3, v19, v0

    .line 141
    .line 142
    const/16 v9, 0x3e

    .line 143
    .line 144
    if-eq v3, v9, :cond_8

    .line 145
    .line 146
    aget v3, v17, v0

    .line 147
    .line 148
    if-nez v0, :cond_6

    .line 149
    .line 150
    move/from16 v9, v16

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_6
    add-int/lit8 v9, v0, -0x1

    .line 154
    .line 155
    aget v9, v17, v9

    .line 156
    .line 157
    :goto_4
    sub-int/2addr v3, v9

    .line 158
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v11, v3}, La/u9d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-nez v3, :cond_7

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_8
    :goto_5
    if-nez v18, :cond_9

    .line 179
    .line 180
    if-ne v13, v0, :cond_9

    .line 181
    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_9
    if-eqz v18, :cond_c

    .line 185
    .line 186
    const/4 v3, 0x1

    .line 187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v11, v9}, La/u9d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    check-cast v9, Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v2, :cond_b

    .line 202
    .line 203
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v22

    .line 207
    move/from16 v23, v3

    .line 208
    .line 209
    add-int v3, v22, v12

    .line 210
    .line 211
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    iget v1, v8, La/kie0;->a:I

    .line 216
    .line 217
    if-le v1, v3, :cond_a

    .line 218
    .line 219
    add-int/lit8 v3, v3, 0x1

    .line 220
    .line 221
    :cond_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v2, v12, v1}, La/bt40;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_b
    move/from16 v23, v3

    .line 230
    .line 231
    :goto_6
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    add-int/2addr v1, v9

    .line 236
    add-int/2addr v15, v1

    .line 237
    aput v15, v5, v14

    .line 238
    .line 239
    const/16 v20, 0x3e

    .line 240
    .line 241
    aput-char v20, v6, v14

    .line 242
    .line 243
    aput-boolean v23, v7, v14

    .line 244
    .line 245
    add-int/lit8 v14, v14, 0x1

    .line 246
    .line 247
    :cond_c
    :goto_7
    if-ge v13, v0, :cond_e

    .line 248
    .line 249
    aget v1, v17, v13

    .line 250
    .line 251
    if-nez v13, :cond_d

    .line 252
    .line 253
    move/from16 v3, v16

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_d
    add-int/lit8 v3, v13, -0x1

    .line 257
    .line 258
    aget v3, v17, v3

    .line 259
    .line 260
    :goto_8
    sub-int/2addr v1, v3

    .line 261
    add-int/2addr v15, v1

    .line 262
    aput v15, v5, v14

    .line 263
    .line 264
    aget-char v1, v19, v13

    .line 265
    .line 266
    aput-char v1, v6, v14

    .line 267
    .line 268
    aput-boolean v16, v7, v14

    .line 269
    .line 270
    add-int/lit8 v14, v14, 0x1

    .line 271
    .line 272
    add-int/lit8 v13, v13, 0x1

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_e
    move-object/from16 v1, p1

    .line 276
    .line 277
    move v13, v0

    .line 278
    move/from16 v12, v16

    .line 279
    .line 280
    move-object/from16 v3, v17

    .line 281
    .line 282
    move-object/from16 v9, v21

    .line 283
    .line 284
    move-object/from16 v0, p0

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_f
    :goto_9
    if-nez v14, :cond_10

    .line 289
    .line 290
    :goto_a
    sget-object v0, La/v9d;->e:La/v9d;

    .line 291
    .line 292
    return-object v0

    .line 293
    :cond_10
    if-ne v14, v4, :cond_11

    .line 294
    .line 295
    iget v0, v8, La/kie0;->a:I

    .line 296
    .line 297
    new-instance v1, La/v9d;

    .line 298
    .line 299
    invoke-direct {v1, v5, v6, v7, v0}, La/v9d;-><init>([I[C[ZI)V

    .line 300
    .line 301
    .line 302
    return-object v1

    .line 303
    :cond_11
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v6, v14}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v7, v14}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iget v3, v8, La/kie0;->a:I

    .line 316
    .line 317
    new-instance v4, La/v9d;

    .line 318
    .line 319
    invoke-direct {v4, v0, v1, v2, v3}, La/v9d;-><init>([I[C[ZI)V

    .line 320
    .line 321
    .line 322
    return-object v4
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object p0, p0, La/v9d;->a:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    array-length v0, p0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    aget p0, p0, v0

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final f(La/v9d;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/v9d;->a:[I

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    iget-object v1, p1, La/v9d;->a:[I

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v2, v1}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Ljava/util/Collection;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v1, v0

    .line 23
    check-cast v1, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    move-object v1, v0

    .line 37
    check-cast v1, La/kkx;

    .line 38
    .line 39
    iget-boolean v1, v1, La/kkx;->c:Z

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, La/bkx;

    .line 45
    .line 46
    invoke-virtual {v1}, La/bkx;->nextInt()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget-object v3, p0, La/v9d;->b:[C

    .line 51
    .line 52
    aget-char v3, v3, v1

    .line 53
    .line 54
    iget-object v4, p1, La/v9d;->b:[C

    .line 55
    .line 56
    aget-char v1, v4, v1

    .line 57
    .line 58
    if-eq v3, v1, :cond_2

    .line 59
    .line 60
    :goto_0
    return v2

    .line 61
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 62
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MdConstraints: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, La/v9d;->b:[C

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x28

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/v9d;->e()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p0, 0x29

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
