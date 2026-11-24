.class public final La/br20;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/util/Set;


# instance fields
.field public final a:La/l4w0;

.field public b:La/ar20;

.field public c:La/ar20;

.field public d:Ljava/lang/CharSequence;

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [La/ar20;

    .line 4
    .line 5
    sget-object v1, La/cy2;->x:La/ar20;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    sget-object v1, La/cy2;->j0:La/fr20;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    sget-object v1, La/cy2;->y:La/ar20;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    sget-object v1, La/cy2;->N:La/ar20;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    aput-object v1, v0, v2

    .line 24
    .line 25
    sget-object v1, La/cy2;->e0:La/ar20;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    aput-object v1, v0, v2

    .line 29
    .line 30
    sget-object v1, La/cy2;->X:La/ar20;

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    sget-object v1, La/cy2;->f0:La/ar20;

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    aput-object v1, v0, v2

    .line 39
    .line 40
    sget-object v1, La/cy2;->g0:La/ar20;

    .line 41
    .line 42
    const/4 v2, 0x7

    .line 43
    aput-object v1, v0, v2

    .line 44
    .line 45
    sget-object v1, La/cy2;->i0:La/ar20;

    .line 46
    .line 47
    const/16 v2, 0x8

    .line 48
    .line 49
    aput-object v1, v0, v2

    .line 50
    .line 51
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, La/br20;->i:Ljava/util/Set;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(La/l4w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/br20;->a:La/l4w0;

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    iput-object p1, p0, La/br20;->d:Ljava/lang/CharSequence;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()La/ar20;
    .locals 23

    .line 1
    sget-object v0, La/cy2;->j0:La/fr20;

    .line 2
    .line 3
    sget-object v1, La/cy2;->L:La/ar20;

    .line 4
    .line 5
    sget-object v2, La/cy2;->x:La/ar20;

    .line 6
    .line 7
    sget-object v3, La/l4w0;->k:[I

    .line 8
    .line 9
    move-object/from16 v3, p0

    .line 10
    .line 11
    iget-object v3, v3, La/br20;->a:La/l4w0;

    .line 12
    .line 13
    iget-object v4, v3, La/l4w0;->i:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v5, v3, La/l4w0;->j:La/k4w0;

    .line 16
    .line 17
    iget v6, v3, La/l4w0;->g:I

    .line 18
    .line 19
    iget-object v7, v3, La/l4w0;->c:Ljava/lang/CharSequence;

    .line 20
    .line 21
    sget-object v8, La/l4w0;->q:[I

    .line 22
    .line 23
    sget-object v9, La/l4w0;->p:[I

    .line 24
    .line 25
    sget-object v10, La/l4w0;->s:[I

    .line 26
    .line 27
    :goto_0
    iget v11, v3, La/l4w0;->d:I

    .line 28
    .line 29
    iput v11, v3, La/l4w0;->f:I

    .line 30
    .line 31
    iput v11, v3, La/l4w0;->e:I

    .line 32
    .line 33
    sget-object v12, La/l4w0;->k:[I

    .line 34
    .line 35
    iget v13, v3, La/l4w0;->b:I

    .line 36
    .line 37
    aget v12, v12, v13

    .line 38
    .line 39
    iput v12, v3, La/l4w0;->a:I

    .line 40
    .line 41
    aget v13, v10, v12

    .line 42
    .line 43
    const/4 v14, 0x1

    .line 44
    and-int/2addr v13, v14

    .line 45
    if-ne v13, v14, :cond_0

    .line 46
    .line 47
    move v13, v12

    .line 48
    move v12, v11

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v12, v11

    .line 51
    const/4 v13, -0x1

    .line 52
    :goto_1
    const/16 v16, 0x6

    .line 53
    .line 54
    const/16 v17, 0x4

    .line 55
    .line 56
    if-ge v11, v6, :cond_5

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {v7, v11}, Ljava/lang/CharSequence;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v18

    .line 65
    invoke-static/range {v18 .. v18}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 66
    .line 67
    .line 68
    move-result v19

    .line 69
    if-eqz v19, :cond_1

    .line 70
    .line 71
    add-int/lit8 v14, v11, 0x1

    .line 72
    .line 73
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    if-ge v14, v15, :cond_1

    .line 78
    .line 79
    invoke-interface {v7, v14}, Ljava/lang/CharSequence;->charAt(I)C

    .line 80
    .line 81
    .line 82
    move-result v14

    .line 83
    invoke-static {v14}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-eqz v15, :cond_1

    .line 88
    .line 89
    shl-int/lit8 v15, v18, 0xa

    .line 90
    .line 91
    add-int/2addr v15, v14

    .line 92
    const v14, -0x35fdc00

    .line 93
    .line 94
    .line 95
    add-int v18, v15, v14

    .line 96
    .line 97
    :cond_1
    move/from16 v14, v18

    .line 98
    .line 99
    const/high16 v15, 0x10000

    .line 100
    .line 101
    if-lt v14, v15, :cond_2

    .line 102
    .line 103
    const/4 v15, 0x2

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    const/4 v15, 0x1

    .line 106
    :goto_2
    add-int/2addr v11, v15

    .line 107
    iget v15, v3, La/l4w0;->a:I

    .line 108
    .line 109
    aget v15, v9, v15

    .line 110
    .line 111
    sget-object v18, La/l4w0;->n:[C

    .line 112
    .line 113
    sget-object v20, La/l4w0;->m:[C

    .line 114
    .line 115
    sget-object v21, La/l4w0;->l:[C

    .line 116
    .line 117
    shr-int/lit8 v22, v14, 0xa

    .line 118
    .line 119
    aget-char v21, v21, v22

    .line 120
    .line 121
    shl-int/lit8 v21, v21, 0x6

    .line 122
    .line 123
    shr-int/lit8 v22, v14, 0x4

    .line 124
    .line 125
    and-int/lit8 v22, v22, 0x3f

    .line 126
    .line 127
    or-int v21, v21, v22

    .line 128
    .line 129
    aget-char v20, v20, v21

    .line 130
    .line 131
    shl-int/lit8 v20, v20, 0x4

    .line 132
    .line 133
    and-int/lit8 v21, v14, 0xf

    .line 134
    .line 135
    or-int v20, v20, v21

    .line 136
    .line 137
    aget-char v18, v18, v20

    .line 138
    .line 139
    add-int v15, v15, v18

    .line 140
    .line 141
    aget v15, v8, v15

    .line 142
    .line 143
    move-object/from16 v18, v0

    .line 144
    .line 145
    const/4 v0, -0x1

    .line 146
    if-eq v15, v0, :cond_4

    .line 147
    .line 148
    iput v15, v3, La/l4w0;->a:I

    .line 149
    .line 150
    aget v0, v10, v15

    .line 151
    .line 152
    move/from16 v20, v0

    .line 153
    .line 154
    and-int/lit8 v0, v20, 0x1

    .line 155
    .line 156
    move-object/from16 v21, v1

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    if-ne v0, v1, :cond_3

    .line 160
    .line 161
    and-int/lit8 v0, v20, 0x8

    .line 162
    .line 163
    const/16 v1, 0x8

    .line 164
    .line 165
    move v12, v11

    .line 166
    move v13, v15

    .line 167
    if-ne v0, v1, :cond_3

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_3
    move-object/from16 v0, v18

    .line 171
    .line 172
    move-object/from16 v1, v21

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_4
    move-object/from16 v21, v1

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_5
    move-object/from16 v18, v0

    .line 179
    .line 180
    move-object/from16 v21, v1

    .line 181
    .line 182
    iget-boolean v0, v3, La/l4w0;->h:Z

    .line 183
    .line 184
    if-eqz v0, :cond_6

    .line 185
    .line 186
    :goto_3
    const/4 v14, -0x1

    .line 187
    goto :goto_4

    .line 188
    :cond_6
    iput v11, v3, La/l4w0;->e:I

    .line 189
    .line 190
    iput v12, v3, La/l4w0;->d:I

    .line 191
    .line 192
    iget-object v0, v3, La/l4w0;->c:Ljava/lang/CharSequence;

    .line 193
    .line 194
    iget v1, v3, La/l4w0;->g:I

    .line 195
    .line 196
    move-object v7, v0

    .line 197
    move v6, v1

    .line 198
    goto :goto_3

    .line 199
    :goto_4
    iput v12, v3, La/l4w0;->d:I

    .line 200
    .line 201
    const/4 v0, -0x1

    .line 202
    if-ne v14, v0, :cond_7

    .line 203
    .line 204
    iget v0, v3, La/l4w0;->f:I

    .line 205
    .line 206
    iget v1, v3, La/l4w0;->e:I

    .line 207
    .line 208
    if-ne v0, v1, :cond_7

    .line 209
    .line 210
    const/4 v1, 0x1

    .line 211
    iput-boolean v1, v3, La/l4w0;->h:Z

    .line 212
    .line 213
    const/4 v0, 0x0

    .line 214
    return-object v0

    .line 215
    :cond_7
    if-gez v13, :cond_8

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_8
    sget-object v0, La/l4w0;->o:[I

    .line 219
    .line 220
    aget v13, v0, v13

    .line 221
    .line 222
    :goto_5
    const/4 v0, 0x0

    .line 223
    packed-switch v13, :pswitch_data_0

    .line 224
    .line 225
    .line 226
    sget-object v1, La/l4w0;->r:[Ljava/lang/String;

    .line 227
    .line 228
    const/4 v2, 0x1

    .line 229
    :try_start_0
    aget-object v0, v1, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :catch_0
    aget-object v0, v1, v0

    .line 233
    .line 234
    :goto_6
    new-instance v1, Ljava/lang/Error;

    .line 235
    .line 236
    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v1

    .line 240
    :pswitch_0
    sget-object v0, La/cy2;->f0:La/ar20;

    .line 241
    .line 242
    invoke-virtual {v3, v0}, La/l4w0;->a(La/ar20;)La/ar20;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    return-object v0

    .line 247
    :pswitch_1
    sget-object v0, La/cy2;->g0:La/ar20;

    .line 248
    .line 249
    invoke-virtual {v3, v0}, La/l4w0;->a(La/ar20;)La/ar20;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    return-object v0

    .line 254
    :pswitch_2
    sget-object v0, La/cy2;->h0:La/ar20;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_3
    sget-object v0, La/cy2;->V:La/ar20;

    .line 258
    .line 259
    iget v1, v3, La/l4w0;->b:I

    .line 260
    .line 261
    move/from16 v4, v17

    .line 262
    .line 263
    if-eq v1, v4, :cond_a

    .line 264
    .line 265
    move/from16 v6, v16

    .line 266
    .line 267
    if-ne v1, v6, :cond_9

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_9
    iget-object v0, v5, La/k4w0;->b:La/ar20;

    .line 271
    .line 272
    :cond_a
    :goto_7
    return-object v0

    .line 273
    :pswitch_4
    move/from16 v6, v16

    .line 274
    .line 275
    move/from16 v4, v17

    .line 276
    .line 277
    iget v0, v3, La/l4w0;->b:I

    .line 278
    .line 279
    if-eq v0, v4, :cond_c

    .line 280
    .line 281
    if-ne v0, v6, :cond_b

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_b
    iget-object v0, v5, La/k4w0;->b:La/ar20;

    .line 285
    .line 286
    return-object v0

    .line 287
    :cond_c
    :goto_8
    return-object v2

    .line 288
    :pswitch_5
    iget v1, v3, La/l4w0;->f:I

    .line 289
    .line 290
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-ltz v1, :cond_11

    .line 298
    .line 299
    if-gt v1, v2, :cond_11

    .line 300
    .line 301
    :goto_9
    if-ge v1, v2, :cond_f

    .line 302
    .line 303
    const/4 v4, 0x1

    .line 304
    if-ge v0, v4, :cond_e

    .line 305
    .line 306
    add-int/lit8 v4, v1, 0x1

    .line 307
    .line 308
    invoke-interface {v7, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_d

    .line 317
    .line 318
    if-ge v4, v2, :cond_d

    .line 319
    .line 320
    invoke-interface {v7, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    if-eqz v5, :cond_d

    .line 329
    .line 330
    add-int/lit8 v1, v1, 0x2

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_d
    move v1, v4

    .line 334
    :goto_a
    add-int/lit8 v0, v0, 0x1

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_e
    move v2, v4

    .line 338
    goto :goto_b

    .line 339
    :cond_f
    const/4 v2, 0x1

    .line 340
    :goto_b
    if-lt v0, v2, :cond_10

    .line 341
    .line 342
    iput v1, v3, La/l4w0;->d:I

    .line 343
    .line 344
    return-object v21

    .line 345
    :cond_10
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 346
    .line 347
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 348
    .line 349
    .line 350
    throw v0

    .line 351
    :cond_11
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 352
    .line 353
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 354
    .line 355
    .line 356
    throw v0

    .line 357
    :pswitch_6
    invoke-virtual {v3, v0}, La/l4w0;->b(I)C

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    iget-char v2, v5, La/k4w0;->a:C

    .line 362
    .line 363
    if-ne v1, v2, :cond_12

    .line 364
    .line 365
    const/4 v1, 0x1

    .line 366
    invoke-static {v1, v4}, La/hne;->k(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    check-cast v1, Ljava/lang/Number;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    iput v1, v3, La/l4w0;->b:I

    .line 377
    .line 378
    invoke-virtual {v3, v0}, La/l4w0;->b(I)C

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    invoke-static {v0}, La/uxs0;->a(C)La/ar20;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    return-object v0

    .line 387
    :cond_12
    iget-object v0, v5, La/k4w0;->b:La/ar20;

    .line 388
    .line 389
    return-object v0

    .line 390
    :pswitch_7
    iget v0, v3, La/l4w0;->b:I

    .line 391
    .line 392
    const/4 v4, 0x4

    .line 393
    if-eq v0, v4, :cond_14

    .line 394
    .line 395
    const/4 v6, 0x6

    .line 396
    if-ne v0, v6, :cond_13

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_13
    iget-object v0, v5, La/k4w0;->b:La/ar20;

    .line 400
    .line 401
    return-object v0

    .line 402
    :cond_14
    :goto_c
    sget-object v0, La/cy2;->U:La/ar20;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_8
    move/from16 v6, v16

    .line 406
    .line 407
    move/from16 v4, v17

    .line 408
    .line 409
    sget-object v0, La/cy2;->T:La/ar20;

    .line 410
    .line 411
    iget v1, v3, La/l4w0;->b:I

    .line 412
    .line 413
    if-eq v1, v4, :cond_16

    .line 414
    .line 415
    if-ne v1, v6, :cond_15

    .line 416
    .line 417
    goto :goto_d

    .line 418
    :cond_15
    iget-object v0, v5, La/k4w0;->b:La/ar20;

    .line 419
    .line 420
    :cond_16
    :goto_d
    return-object v0

    .line 421
    :pswitch_9
    sget-object v0, La/cy2;->J:La/ar20;

    .line 422
    .line 423
    return-object v0

    .line 424
    :pswitch_a
    sget-object v0, La/cy2;->K:La/ar20;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_b
    invoke-virtual {v3, v0}, La/l4w0;->b(I)C

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    invoke-static {v0}, La/uxs0;->a(C)La/ar20;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    return-object v0

    .line 436
    :pswitch_c
    iget-object v1, v3, La/l4w0;->c:Ljava/lang/CharSequence;

    .line 437
    .line 438
    iget v2, v3, La/l4w0;->f:I

    .line 439
    .line 440
    invoke-interface {v1, v2, v12}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    const-string v2, "\n"

    .line 449
    .line 450
    const/4 v6, 0x6

    .line 451
    invoke-static {v1, v2, v0, v0, v6}, Lkotlin/text/StringsKt;->V(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    const/4 v2, 0x2

    .line 456
    if-lt v1, v2, :cond_17

    .line 457
    .line 458
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    sub-int/2addr v0, v1

    .line 463
    invoke-virtual {v3, v0}, La/l4w0;->d(I)V

    .line 464
    .line 465
    .line 466
    return-object v21

    .line 467
    :cond_17
    if-lez v1, :cond_18

    .line 468
    .line 469
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    sub-int/2addr v0, v1

    .line 474
    invoke-virtual {v3, v0}, La/l4w0;->d(I)V

    .line 475
    .line 476
    .line 477
    return-object v18

    .line 478
    :cond_18
    const/4 v1, 0x1

    .line 479
    :goto_e
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-ge v1, v2, :cond_19

    .line 484
    .line 485
    invoke-virtual {v3, v1}, La/l4w0;->b(I)C

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    const/16 v4, 0xa

    .line 490
    .line 491
    if-eq v2, v4, :cond_19

    .line 492
    .line 493
    add-int/lit8 v1, v1, 0x1

    .line 494
    .line 495
    goto :goto_e

    .line 496
    :cond_19
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    if-eq v1, v2, :cond_1a

    .line 501
    .line 502
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    sub-int/2addr v0, v1

    .line 507
    invoke-virtual {v3, v0}, La/l4w0;->d(I)V

    .line 508
    .line 509
    .line 510
    goto :goto_f

    .line 511
    :cond_1a
    iput v0, v3, La/l4w0;->b:I

    .line 512
    .line 513
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    const/4 v1, 0x1

    .line 518
    sub-int/2addr v0, v1

    .line 519
    invoke-virtual {v3, v0}, La/l4w0;->d(I)V

    .line 520
    .line 521
    .line 522
    :goto_f
    sget-object v0, La/cy2;->M:La/ar20;

    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_d
    return-object v18

    .line 526
    :pswitch_e
    return-object v2

    .line 527
    :pswitch_f
    sget-object v0, La/cy2;->z:La/ar20;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_10
    invoke-virtual {v3}, La/l4w0;->c()I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-virtual {v3, v0}, La/l4w0;->d(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_1b

    .line 542
    .line 543
    const/4 v0, 0x4

    .line 544
    iput v0, v3, La/l4w0;->b:I

    .line 545
    .line 546
    goto :goto_10

    .line 547
    :cond_1b
    const/4 v1, 0x1

    .line 548
    invoke-static {v1, v4}, La/hne;->k(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    check-cast v0, Ljava/lang/Number;

    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    iput v0, v3, La/l4w0;->b:I

    .line 559
    .line 560
    :goto_10
    :pswitch_11
    move-object/from16 v0, v18

    .line 561
    .line 562
    move-object/from16 v1, v21

    .line 563
    .line 564
    goto/16 :goto_0

    .line 565
    .line 566
    nop

    .line 567
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, La/br20;->a:La/l4w0;

    .line 2
    .line 3
    iget v1, v0, La/l4w0;->f:I

    .line 4
    .line 5
    invoke-virtual {v0}, La/l4w0;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p0, La/br20;->h:I

    .line 11
    .line 12
    invoke-virtual {p0}, La/br20;->a()La/ar20;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/br20;->c:La/ar20;

    .line 17
    .line 18
    iget-object v1, p0, La/br20;->b:La/ar20;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    sget-object v0, La/br20;->i:Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method
