.class public final La/gjx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/gjx;

.field public static final b:La/ewb0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/gjx;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/gjx;->a:La/gjx;

    .line 7
    .line 8
    new-instance v0, La/ewb0;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Instant"

    .line 11
    .line 12
    sget-object v2, La/zvb0;->j:La/zvb0;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/ewb0;-><init>(Ljava/lang/String;La/zvb0;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/gjx;->b:La/ewb0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 25

    .line 1
    sget-object v0, La/bjx;->c:La/bjx;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, La/rkj;->z()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0xb

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, La/zpu;

    .line 19
    .line 20
    const-string v3, "An empty string is not a valid Instant"

    .line 21
    .line 22
    invoke-direct {v1, v3, v0, v2}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_16

    .line 26
    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    const/16 v5, 0x2b

    .line 35
    .line 36
    const/16 v6, 0x2d

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    if-eq v3, v5, :cond_1

    .line 40
    .line 41
    if-eq v3, v6, :cond_1

    .line 42
    .line 43
    move v8, v1

    .line 44
    move v3, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v8, v7

    .line 47
    :goto_0
    move v10, v1

    .line 48
    move v9, v8

    .line 49
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    const/16 v12, 0x3a

    .line 54
    .line 55
    const/16 v13, 0x30

    .line 56
    .line 57
    if-ge v9, v11, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    if-gt v13, v11, :cond_2

    .line 64
    .line 65
    if-ge v11, v12, :cond_2

    .line 66
    .line 67
    mul-int/lit8 v10, v10, 0xa

    .line 68
    .line 69
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    sub-int/2addr v11, v13

    .line 74
    add-int/2addr v10, v11

    .line 75
    add-int/lit8 v9, v9, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sub-int v11, v9, v8

    .line 79
    .line 80
    const-string v14, " digits"

    .line 81
    .line 82
    const/16 v15, 0xa

    .line 83
    .line 84
    if-le v11, v15, :cond_3

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v2, "Expected at most 10 digits for the year number, got "

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto/16 :goto_16

    .line 108
    .line 109
    :cond_3
    if-ne v11, v15, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    const/16 v2, 0x32

    .line 116
    .line 117
    if-lt v8, v2, :cond_4

    .line 118
    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "Expected at most 9 digits for the year number or year 1000000000, got "

    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    goto/16 :goto_16

    .line 141
    .line 142
    :cond_4
    const/4 v2, 0x4

    .line 143
    if-ge v11, v2, :cond_5

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v2, "The year number must be padded to 4 digits, got "

    .line 148
    .line 149
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    goto/16 :goto_16

    .line 167
    .line 168
    :cond_5
    if-ne v3, v5, :cond_6

    .line 169
    .line 170
    if-ne v11, v2, :cond_6

    .line 171
    .line 172
    const-string v1, "The \'+\' sign at the start is only valid for year numbers longer than 4 digits"

    .line 173
    .line 174
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto/16 :goto_16

    .line 179
    .line 180
    :cond_6
    if-ne v3, v4, :cond_7

    .line 181
    .line 182
    if-eq v11, v2, :cond_7

    .line 183
    .line 184
    const-string v1, "A \'+\' or \'-\' sign is required for year numbers longer than 4 digits"

    .line 185
    .line 186
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto/16 :goto_16

    .line 191
    .line 192
    :cond_7
    if-ne v3, v6, :cond_8

    .line 193
    .line 194
    neg-int v10, v10

    .line 195
    :cond_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    add-int/lit8 v4, v9, 0x10

    .line 200
    .line 201
    if-ge v3, v4, :cond_9

    .line 202
    .line 203
    const-string v1, "The input string is too short"

    .line 204
    .line 205
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    goto/16 :goto_16

    .line 210
    .line 211
    :cond_9
    new-instance v3, La/h7w;

    .line 212
    .line 213
    const/16 v8, 0x1c

    .line 214
    .line 215
    invoke-direct {v3, v8}, La/h7w;-><init>(B)V

    .line 216
    .line 217
    .line 218
    const-string v11, "\'-\'"

    .line 219
    .line 220
    invoke-static {v0, v9, v11, v3}, La/ny9;->V(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)La/zpu;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    if-eqz v3, :cond_a

    .line 225
    .line 226
    :goto_2
    move-object v1, v3

    .line 227
    goto/16 :goto_16

    .line 228
    .line 229
    :cond_a
    add-int/lit8 v3, v9, 0x3

    .line 230
    .line 231
    new-instance v8, La/h7w;

    .line 232
    .line 233
    const/16 v2, 0x1d

    .line 234
    .line 235
    invoke-direct {v8, v2}, La/h7w;-><init>(B)V

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v3, v11, v8}, La/ny9;->V(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)La/zpu;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    if-eqz v3, :cond_b

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_b
    add-int/lit8 v3, v9, 0x6

    .line 246
    .line 247
    new-instance v8, La/djx;

    .line 248
    .line 249
    invoke-direct {v8, v1}, La/djx;-><init>(B)V

    .line 250
    .line 251
    .line 252
    const-string v11, "\'T\' or \'t\'"

    .line 253
    .line 254
    invoke-static {v0, v3, v11, v8}, La/ny9;->V(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)La/zpu;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    if-eqz v3, :cond_c

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_c
    add-int/lit8 v3, v9, 0x9

    .line 262
    .line 263
    new-instance v8, La/djx;

    .line 264
    .line 265
    invoke-direct {v8, v7}, La/djx;-><init>(B)V

    .line 266
    .line 267
    .line 268
    const-string v11, "\':\'"

    .line 269
    .line 270
    invoke-static {v0, v3, v11, v8}, La/ny9;->V(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)La/zpu;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    if-eqz v3, :cond_d

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_d
    add-int/lit8 v3, v9, 0xc

    .line 278
    .line 279
    new-instance v8, La/djx;

    .line 280
    .line 281
    const/4 v1, 0x2

    .line 282
    invoke-direct {v8, v1}, La/djx;-><init>(B)V

    .line 283
    .line 284
    .line 285
    invoke-static {v0, v3, v11, v8}, La/ny9;->V(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)La/zpu;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    if-eqz v3, :cond_e

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_e
    sget-object v3, La/ny9;->j:[I

    .line 293
    .line 294
    const/4 v8, 0x0

    .line 295
    :goto_3
    const/4 v11, 0x3

    .line 296
    if-ge v8, v15, :cond_10

    .line 297
    .line 298
    aget v18, v3, v8

    .line 299
    .line 300
    add-int v2, v9, v18

    .line 301
    .line 302
    new-instance v1, La/djx;

    .line 303
    .line 304
    invoke-direct {v1, v11}, La/djx;-><init>(B)V

    .line 305
    .line 306
    .line 307
    const-string v11, "an ASCII digit"

    .line 308
    .line 309
    invoke-static {v0, v2, v11, v1}, La/ny9;->V(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)La/zpu;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    if-eqz v1, :cond_f

    .line 314
    .line 315
    goto/16 :goto_16

    .line 316
    .line 317
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 318
    .line 319
    const/4 v1, 0x2

    .line 320
    const/16 v2, 0x1d

    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_10
    add-int/lit8 v1, v9, 0x1

    .line 324
    .line 325
    invoke-static {v1, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    add-int/lit8 v2, v9, 0x4

    .line 330
    .line 331
    invoke-static {v2, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    add-int/lit8 v3, v9, 0x7

    .line 336
    .line 337
    invoke-static {v3, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    add-int/lit8 v8, v9, 0xa

    .line 342
    .line 343
    invoke-static {v8, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    add-int/lit8 v11, v9, 0xd

    .line 348
    .line 349
    invoke-static {v11, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    add-int/lit8 v9, v9, 0xf

    .line 354
    .line 355
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    const/16 v5, 0x2e

    .line 360
    .line 361
    const/16 v15, 0x9

    .line 362
    .line 363
    if-ne v6, v5, :cond_13

    .line 364
    .line 365
    move v9, v4

    .line 366
    const/4 v5, 0x0

    .line 367
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-ge v9, v6, :cond_11

    .line 372
    .line 373
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    if-gt v13, v6, :cond_11

    .line 378
    .line 379
    if-ge v6, v12, :cond_11

    .line 380
    .line 381
    mul-int/lit8 v5, v5, 0xa

    .line 382
    .line 383
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    sub-int/2addr v6, v13

    .line 388
    add-int/2addr v5, v6

    .line 389
    add-int/lit8 v9, v9, 0x1

    .line 390
    .line 391
    goto :goto_4

    .line 392
    :cond_11
    sub-int v4, v9, v4

    .line 393
    .line 394
    if-gt v7, v4, :cond_12

    .line 395
    .line 396
    const/16 v6, 0xa

    .line 397
    .line 398
    if-ge v4, v6, :cond_12

    .line 399
    .line 400
    sget-object v6, La/ny9;->i:[I

    .line 401
    .line 402
    rsub-int/lit8 v4, v4, 0x9

    .line 403
    .line 404
    aget v4, v6, v4

    .line 405
    .line 406
    mul-int/2addr v5, v4

    .line 407
    goto :goto_5

    .line 408
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    const-string v2, "1..9 digits are supported for the fraction of the second, got "

    .line 411
    .line 412
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    goto/16 :goto_16

    .line 430
    .line 431
    :cond_13
    const/4 v5, 0x0

    .line 432
    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    if-lt v9, v4, :cond_14

    .line 437
    .line 438
    const-string v1, "The UTC offset at the end of the string is missing"

    .line 439
    .line 440
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    goto/16 :goto_16

    .line 445
    .line 446
    :cond_14
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    const/16 v14, 0x27

    .line 451
    .line 452
    move/from16 v23, v7

    .line 453
    .line 454
    const-string v7, ", got \'"

    .line 455
    .line 456
    const/16 v13, 0x2b

    .line 457
    .line 458
    if-eq v4, v13, :cond_17

    .line 459
    .line 460
    const/16 v13, 0x2d

    .line 461
    .line 462
    if-eq v4, v13, :cond_17

    .line 463
    .line 464
    const/16 v12, 0x5a

    .line 465
    .line 466
    if-eq v4, v12, :cond_15

    .line 467
    .line 468
    const/16 v12, 0x7a

    .line 469
    .line 470
    if-eq v4, v12, :cond_15

    .line 471
    .line 472
    new-instance v1, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    const-string v2, "Expected the UTC offset at position "

    .line 475
    .line 476
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    goto/16 :goto_16

    .line 500
    .line 501
    :cond_15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    add-int/lit8 v9, v9, 0x1

    .line 506
    .line 507
    if-ne v4, v9, :cond_16

    .line 508
    .line 509
    const/4 v6, 0x0

    .line 510
    :goto_6
    move/from16 v4, v23

    .line 511
    .line 512
    goto/16 :goto_10

    .line 513
    .line 514
    :cond_16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string v2, "Extra text after the instant at position "

    .line 517
    .line 518
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    goto/16 :goto_16

    .line 533
    .line 534
    :cond_17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 535
    .line 536
    .line 537
    move-result v13

    .line 538
    sub-int/2addr v13, v9

    .line 539
    if-le v13, v15, :cond_18

    .line 540
    .line 541
    new-instance v1, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    const-string v2, "The UTC offset string \""

    .line 544
    .line 545
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    invoke-virtual {v0, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const/16 v3, 0x10

    .line 561
    .line 562
    invoke-static {v3, v2}, La/ny9;->d0(ILjava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v2, "\" is too long"

    .line 570
    .line 571
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    goto/16 :goto_16

    .line 583
    .line 584
    :cond_18
    rem-int/lit8 v22, v13, 0x3

    .line 585
    .line 586
    if-eqz v22, :cond_19

    .line 587
    .line 588
    new-instance v1, Ljava/lang/StringBuilder;

    .line 589
    .line 590
    const-string v2, "Invalid UTC offset string \""

    .line 591
    .line 592
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    invoke-virtual {v0, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    const/16 v2, 0x22

    .line 611
    .line 612
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    goto/16 :goto_16

    .line 624
    .line 625
    :cond_19
    sget-object v22, La/ny9;->k:[I

    .line 626
    .line 627
    const/4 v15, 0x0

    .line 628
    :goto_7
    const/4 v6, 0x2

    .line 629
    if-ge v15, v6, :cond_1c

    .line 630
    .line 631
    aget v6, v22, v15

    .line 632
    .line 633
    add-int/2addr v6, v9

    .line 634
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 635
    .line 636
    .line 637
    move-result v14

    .line 638
    if-lt v6, v14, :cond_1a

    .line 639
    .line 640
    goto :goto_8

    .line 641
    :cond_1a
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 642
    .line 643
    .line 644
    move-result v14

    .line 645
    if-eq v14, v12, :cond_1b

    .line 646
    .line 647
    const-string v1, "Expected \':\' at index "

    .line 648
    .line 649
    invoke-static {v6, v1, v7}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    const/16 v2, 0x27

    .line 661
    .line 662
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    goto/16 :goto_16

    .line 674
    .line 675
    :cond_1b
    add-int/lit8 v15, v15, 0x1

    .line 676
    .line 677
    const/16 v14, 0x27

    .line 678
    .line 679
    goto :goto_7

    .line 680
    :cond_1c
    :goto_8
    sget-object v6, La/ny9;->l:[I

    .line 681
    .line 682
    const/4 v14, 0x0

    .line 683
    :goto_9
    const/4 v15, 0x6

    .line 684
    if-ge v14, v15, :cond_1f

    .line 685
    .line 686
    aget v15, v6, v14

    .line 687
    .line 688
    add-int/2addr v15, v9

    .line 689
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 690
    .line 691
    .line 692
    move-result v12

    .line 693
    if-lt v15, v12, :cond_1d

    .line 694
    .line 695
    goto :goto_a

    .line 696
    :cond_1d
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 697
    .line 698
    .line 699
    move-result v12

    .line 700
    move-object/from16 v24, v6

    .line 701
    .line 702
    const/16 v6, 0x30

    .line 703
    .line 704
    if-gt v6, v12, :cond_1e

    .line 705
    .line 706
    const/16 v6, 0x3a

    .line 707
    .line 708
    if-ge v12, v6, :cond_1e

    .line 709
    .line 710
    add-int/lit8 v14, v14, 0x1

    .line 711
    .line 712
    move v12, v6

    .line 713
    move-object/from16 v6, v24

    .line 714
    .line 715
    goto :goto_9

    .line 716
    :cond_1e
    const-string v1, "Expected an ASCII digit at index "

    .line 717
    .line 718
    invoke-static {v15, v1, v7}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 723
    .line 724
    .line 725
    move-result v2

    .line 726
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    const/16 v2, 0x27

    .line 730
    .line 731
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    goto/16 :goto_16

    .line 743
    .line 744
    :cond_1f
    :goto_a
    add-int/lit8 v6, v9, 0x1

    .line 745
    .line 746
    invoke-static {v6, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 747
    .line 748
    .line 749
    move-result v6

    .line 750
    const/4 v7, 0x3

    .line 751
    if-le v13, v7, :cond_20

    .line 752
    .line 753
    add-int/lit8 v7, v9, 0x4

    .line 754
    .line 755
    invoke-static {v7, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 756
    .line 757
    .line 758
    move-result v7

    .line 759
    :goto_b
    const/4 v15, 0x6

    .line 760
    goto :goto_c

    .line 761
    :cond_20
    const/4 v7, 0x0

    .line 762
    goto :goto_b

    .line 763
    :goto_c
    if-le v13, v15, :cond_21

    .line 764
    .line 765
    add-int/lit8 v12, v9, 0x7

    .line 766
    .line 767
    invoke-static {v12, v0}, La/ny9;->X(ILjava/lang/String;)I

    .line 768
    .line 769
    .line 770
    move-result v12

    .line 771
    :goto_d
    const/16 v13, 0x3b

    .line 772
    .line 773
    goto :goto_e

    .line 774
    :cond_21
    const/4 v12, 0x0

    .line 775
    goto :goto_d

    .line 776
    :goto_e
    if-le v7, v13, :cond_22

    .line 777
    .line 778
    new-instance v1, Ljava/lang/StringBuilder;

    .line 779
    .line 780
    const-string v2, "Expected offset-minute-of-hour in 0..59, got "

    .line 781
    .line 782
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    goto/16 :goto_16

    .line 797
    .line 798
    :cond_22
    if-le v12, v13, :cond_23

    .line 799
    .line 800
    new-instance v1, Ljava/lang/StringBuilder;

    .line 801
    .line 802
    const-string v2, "Expected offset-second-of-minute in 0..59, got "

    .line 803
    .line 804
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    goto/16 :goto_16

    .line 819
    .line 820
    :cond_23
    const/16 v13, 0x11

    .line 821
    .line 822
    if-le v6, v13, :cond_25

    .line 823
    .line 824
    const/16 v13, 0x12

    .line 825
    .line 826
    if-ne v6, v13, :cond_24

    .line 827
    .line 828
    if-nez v7, :cond_24

    .line 829
    .line 830
    if-eqz v12, :cond_25

    .line 831
    .line 832
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 833
    .line 834
    const-string v2, "Expected an offset in -18:00..+18:00, got "

    .line 835
    .line 836
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    invoke-virtual {v0, v9, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    goto/16 :goto_16

    .line 863
    .line 864
    :cond_25
    mul-int/lit16 v6, v6, 0xe10

    .line 865
    .line 866
    const/16 v9, 0x3c

    .line 867
    .line 868
    invoke-static {v7, v9, v6, v12}, La/vqd;->a(IIII)I

    .line 869
    .line 870
    .line 871
    move-result v6

    .line 872
    const/16 v13, 0x2d

    .line 873
    .line 874
    if-ne v4, v13, :cond_26

    .line 875
    .line 876
    const/4 v4, -0x1

    .line 877
    goto :goto_f

    .line 878
    :cond_26
    move/from16 v4, v23

    .line 879
    .line 880
    :goto_f
    mul-int/2addr v6, v4

    .line 881
    goto/16 :goto_6

    .line 882
    .line 883
    :goto_10
    if-gt v4, v1, :cond_34

    .line 884
    .line 885
    const/16 v7, 0xd

    .line 886
    .line 887
    if-ge v1, v7, :cond_34

    .line 888
    .line 889
    if-gt v4, v2, :cond_33

    .line 890
    .line 891
    and-int/lit8 v4, v10, 0x3

    .line 892
    .line 893
    if-nez v4, :cond_28

    .line 894
    .line 895
    rem-int/lit8 v7, v10, 0x64

    .line 896
    .line 897
    if-nez v7, :cond_27

    .line 898
    .line 899
    rem-int/lit16 v7, v10, 0x190

    .line 900
    .line 901
    if-nez v7, :cond_28

    .line 902
    .line 903
    :cond_27
    const/16 v17, 0x1

    .line 904
    .line 905
    :goto_11
    const/4 v7, 0x2

    .line 906
    goto :goto_12

    .line 907
    :cond_28
    const/16 v17, 0x0

    .line 908
    .line 909
    goto :goto_11

    .line 910
    :goto_12
    if-eq v1, v7, :cond_2a

    .line 911
    .line 912
    const/4 v7, 0x4

    .line 913
    if-eq v1, v7, :cond_29

    .line 914
    .line 915
    const/4 v15, 0x6

    .line 916
    if-eq v1, v15, :cond_29

    .line 917
    .line 918
    const/16 v7, 0x9

    .line 919
    .line 920
    if-eq v1, v7, :cond_29

    .line 921
    .line 922
    const/16 v7, 0xb

    .line 923
    .line 924
    if-eq v1, v7, :cond_29

    .line 925
    .line 926
    const/16 v7, 0x1f

    .line 927
    .line 928
    goto :goto_13

    .line 929
    :cond_29
    const/16 v7, 0x1e

    .line 930
    .line 931
    goto :goto_13

    .line 932
    :cond_2a
    if-eqz v17, :cond_2b

    .line 933
    .line 934
    const/16 v7, 0x1d

    .line 935
    .line 936
    goto :goto_13

    .line 937
    :cond_2b
    const/16 v7, 0x1c

    .line 938
    .line 939
    :goto_13
    if-gt v2, v7, :cond_33

    .line 940
    .line 941
    const/16 v7, 0x17

    .line 942
    .line 943
    if-le v3, v7, :cond_2c

    .line 944
    .line 945
    new-instance v1, Ljava/lang/StringBuilder;

    .line 946
    .line 947
    const-string v2, "Expected hour in 0..23, got "

    .line 948
    .line 949
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v1

    .line 959
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    goto/16 :goto_16

    .line 964
    .line 965
    :cond_2c
    const/16 v13, 0x3b

    .line 966
    .line 967
    if-le v8, v13, :cond_2d

    .line 968
    .line 969
    new-instance v1, Ljava/lang/StringBuilder;

    .line 970
    .line 971
    const-string v2, "Expected minute-of-hour in 0..59, got "

    .line 972
    .line 973
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    goto/16 :goto_16

    .line 988
    .line 989
    :cond_2d
    if-le v11, v13, :cond_2e

    .line 990
    .line 991
    new-instance v1, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    const-string v2, "Expected second-of-minute in 0..59, got "

    .line 994
    .line 995
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    goto/16 :goto_16

    .line 1010
    .line 1011
    :cond_2e
    int-to-long v12, v10

    .line 1012
    const-wide/16 v14, 0x16d

    .line 1013
    .line 1014
    mul-long/2addr v14, v12

    .line 1015
    const-wide/16 v16, 0x0

    .line 1016
    .line 1017
    cmp-long v0, v12, v16

    .line 1018
    .line 1019
    if-ltz v0, :cond_2f

    .line 1020
    .line 1021
    const-wide/16 v16, 0x3

    .line 1022
    .line 1023
    add-long v16, v12, v16

    .line 1024
    .line 1025
    const-wide/16 v19, 0x4

    .line 1026
    .line 1027
    div-long v16, v16, v19

    .line 1028
    .line 1029
    const-wide/16 v19, 0x63

    .line 1030
    .line 1031
    add-long v19, v12, v19

    .line 1032
    .line 1033
    const-wide/16 v21, 0x64

    .line 1034
    .line 1035
    div-long v19, v19, v21

    .line 1036
    .line 1037
    sub-long v16, v16, v19

    .line 1038
    .line 1039
    const-wide/16 v19, 0x18f

    .line 1040
    .line 1041
    add-long v12, v12, v19

    .line 1042
    .line 1043
    const-wide/16 v19, 0x190

    .line 1044
    .line 1045
    div-long v12, v12, v19

    .line 1046
    .line 1047
    add-long v12, v12, v16

    .line 1048
    .line 1049
    add-long/2addr v12, v14

    .line 1050
    goto :goto_14

    .line 1051
    :cond_2f
    const-wide/16 v16, -0x4

    .line 1052
    .line 1053
    div-long v16, v12, v16

    .line 1054
    .line 1055
    const-wide/16 v19, -0x64

    .line 1056
    .line 1057
    div-long v19, v12, v19

    .line 1058
    .line 1059
    sub-long v16, v16, v19

    .line 1060
    .line 1061
    const-wide/16 v19, -0x190

    .line 1062
    .line 1063
    div-long v12, v12, v19

    .line 1064
    .line 1065
    add-long v12, v12, v16

    .line 1066
    .line 1067
    sub-long v12, v14, v12

    .line 1068
    .line 1069
    :goto_14
    mul-int/lit16 v0, v1, 0x16f

    .line 1070
    .line 1071
    add-int/lit16 v0, v0, -0x16a

    .line 1072
    .line 1073
    div-int/lit8 v0, v0, 0xc

    .line 1074
    .line 1075
    int-to-long v14, v0

    .line 1076
    add-long/2addr v12, v14

    .line 1077
    const/16 v23, 0x1

    .line 1078
    .line 1079
    add-int/lit8 v2, v2, -0x1

    .line 1080
    .line 1081
    int-to-long v14, v2

    .line 1082
    add-long/2addr v12, v14

    .line 1083
    const/4 v7, 0x2

    .line 1084
    if-le v1, v7, :cond_32

    .line 1085
    .line 1086
    const-wide/16 v0, -0x1

    .line 1087
    .line 1088
    add-long/2addr v0, v12

    .line 1089
    if-nez v4, :cond_31

    .line 1090
    .line 1091
    rem-int/lit8 v2, v10, 0x64

    .line 1092
    .line 1093
    if-nez v2, :cond_30

    .line 1094
    .line 1095
    rem-int/lit16 v10, v10, 0x190

    .line 1096
    .line 1097
    if-nez v10, :cond_31

    .line 1098
    .line 1099
    :cond_30
    move-wide v12, v0

    .line 1100
    goto :goto_15

    .line 1101
    :cond_31
    const-wide/16 v0, -0x2

    .line 1102
    .line 1103
    add-long/2addr v12, v0

    .line 1104
    :cond_32
    :goto_15
    const-wide/32 v0, 0xafaa8

    .line 1105
    .line 1106
    .line 1107
    sub-long/2addr v12, v0

    .line 1108
    mul-int/lit16 v3, v3, 0xe10

    .line 1109
    .line 1110
    const/16 v9, 0x3c

    .line 1111
    .line 1112
    invoke-static {v8, v9, v3, v11}, La/vqd;->a(IIII)I

    .line 1113
    .line 1114
    .line 1115
    move-result v0

    .line 1116
    const-wide/32 v1, 0x15180

    .line 1117
    .line 1118
    .line 1119
    mul-long/2addr v12, v1

    .line 1120
    int-to-long v0, v0

    .line 1121
    add-long/2addr v12, v0

    .line 1122
    int-to-long v0, v6

    .line 1123
    sub-long/2addr v12, v0

    .line 1124
    new-instance v1, La/ejx;

    .line 1125
    .line 1126
    invoke-direct {v1, v12, v13, v5}, La/ejx;-><init>(JI)V

    .line 1127
    .line 1128
    .line 1129
    goto :goto_16

    .line 1130
    :cond_33
    const-string v3, " of year "

    .line 1131
    .line 1132
    const-string v4, ", got "

    .line 1133
    .line 1134
    const-string v5, "Expected a valid day-of-month for month "

    .line 1135
    .line 1136
    invoke-static {v5, v1, v3, v4, v10}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    goto :goto_16

    .line 1152
    :cond_34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    const-string v3, "Expected a month number in 1..12, got "

    .line 1155
    .line 1156
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    invoke-static {v0, v1}, La/ny9;->W(Ljava/lang/String;Ljava/lang/String;)La/zpu;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v1

    .line 1170
    :goto_16
    invoke-interface {v1}, La/fjx;->toInstant()La/bjx;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    return-object v0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/gjx;->b:La/ewb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La/bjx;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, La/bjx;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, La/bwn;->E(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
