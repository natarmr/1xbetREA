.class public final Lokhttp3/CacheControl$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/CacheControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lokhttp3/CacheControl$Companion;",
        "",
        "Lokhttp3/CacheControl;",
        "FORCE_NETWORK",
        "Lokhttp3/CacheControl;",
        "FORCE_CACHE",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x0

    .line 12
    const/4 v11, -0x1

    .line 13
    const/4 v12, -0x1

    .line 14
    const/4 v13, 0x0

    .line 15
    const/4 v14, 0x0

    .line 16
    const/4 v15, 0x0

    .line 17
    const/16 v16, -0x1

    .line 18
    .line 19
    const/16 v17, -0x1

    .line 20
    .line 21
    const/16 v18, 0x0

    .line 22
    .line 23
    const/16 v19, 0x0

    .line 24
    .line 25
    const/16 v20, 0x0

    .line 26
    .line 27
    :goto_0
    if-ge v6, v1, :cond_18

    .line 28
    .line 29
    invoke-static {v0, v6}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/16 v22, 0x1

    .line 34
    .line 35
    invoke-static {v0, v6}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "Cache-Control"

    .line 40
    .line 41
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    if-eqz v8, :cond_0

    .line 48
    .line 49
    :goto_1
    const/4 v7, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_0
    move-object v8, v4

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const-string v5, "Pragma"

    .line 54
    .line 55
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_17

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_2
    const/4 v2, 0x0

    .line 63
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-ge v2, v5, :cond_17

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    move v3, v2

    .line 74
    :goto_4
    if-ge v3, v5, :cond_3

    .line 75
    .line 76
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    move/from16 v23, v1

    .line 81
    .line 82
    const-string v1, "=,;"

    .line 83
    .line 84
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    move-object/from16 v0, p0

    .line 94
    .line 95
    move/from16 v1, v23

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_3
    move/from16 v23, v1

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    :goto_5
    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eq v3, v1, :cond_a

    .line 121
    .line 122
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    const/16 v2, 0x2c

    .line 127
    .line 128
    if-eq v1, v2, :cond_a

    .line 129
    .line 130
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    const/16 v2, 0x3b

    .line 135
    .line 136
    if-ne v1, v2, :cond_4

    .line 137
    .line 138
    goto/16 :goto_a

    .line 139
    .line 140
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    sget-object v1, Lokhttp3/internal/_UtilCommonKt;->a:[B

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    :goto_6
    if-ge v3, v1, :cond_6

    .line 149
    .line 150
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    const/16 v5, 0x20

    .line 155
    .line 156
    if-eq v2, v5, :cond_5

    .line 157
    .line 158
    const/16 v5, 0x9

    .line 159
    .line 160
    if-eq v2, v5, :cond_5

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    :goto_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-ge v3, v1, :cond_7

    .line 175
    .line 176
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    const/16 v2, 0x22

    .line 181
    .line 182
    if-ne v1, v2, :cond_7

    .line 183
    .line 184
    add-int/lit8 v3, v3, 0x1

    .line 185
    .line 186
    const/4 v1, 0x4

    .line 187
    invoke-static {v2, v3, v1, v4}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    invoke-virtual {v4, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    move v2, v3

    .line 203
    :goto_8
    if-ge v2, v1, :cond_9

    .line 204
    .line 205
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    move/from16 v24, v1

    .line 210
    .line 211
    const-string v1, ",;"

    .line 212
    .line 213
    invoke-static {v1, v5}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_8

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 221
    .line 222
    move/from16 v1, v24

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_9
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    :goto_9
    invoke-virtual {v4, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    move/from16 v25, v2

    .line 242
    .line 243
    move-object v2, v1

    .line 244
    move/from16 v1, v25

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_a
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 248
    .line 249
    move v1, v3

    .line 250
    const/4 v2, 0x0

    .line 251
    :goto_b
    const-string v3, "no-cache"

    .line 252
    .line 253
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-eqz v3, :cond_b

    .line 258
    .line 259
    move-object/from16 v0, p0

    .line 260
    .line 261
    move v2, v1

    .line 262
    move/from16 v9, v22

    .line 263
    .line 264
    :goto_c
    move/from16 v1, v23

    .line 265
    .line 266
    goto/16 :goto_3

    .line 267
    .line 268
    :cond_b
    const-string v3, "no-store"

    .line 269
    .line 270
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_c

    .line 275
    .line 276
    move-object/from16 v0, p0

    .line 277
    .line 278
    move v2, v1

    .line 279
    move/from16 v10, v22

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :cond_c
    const-string v3, "max-age"

    .line 283
    .line 284
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-eqz v3, :cond_e

    .line 289
    .line 290
    const/4 v3, -0x1

    .line 291
    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->q(ILjava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    :cond_d
    :goto_d
    move-object/from16 v0, p0

    .line 296
    .line 297
    move v2, v1

    .line 298
    goto :goto_c

    .line 299
    :cond_e
    const/4 v3, -0x1

    .line 300
    const-string v5, "s-maxage"

    .line 301
    .line 302
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-eqz v5, :cond_f

    .line 307
    .line 308
    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->q(ILjava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    goto :goto_d

    .line 313
    :cond_f
    const-string v3, "private"

    .line 314
    .line 315
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-eqz v3, :cond_10

    .line 320
    .line 321
    move-object/from16 v0, p0

    .line 322
    .line 323
    move v2, v1

    .line 324
    move/from16 v13, v22

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_10
    const-string v3, "public"

    .line 328
    .line 329
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_11

    .line 334
    .line 335
    move-object/from16 v0, p0

    .line 336
    .line 337
    move v2, v1

    .line 338
    move/from16 v14, v22

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_11
    const-string v3, "must-revalidate"

    .line 342
    .line 343
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-eqz v3, :cond_12

    .line 348
    .line 349
    move-object/from16 v0, p0

    .line 350
    .line 351
    move v2, v1

    .line 352
    move/from16 v15, v22

    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_12
    const-string v3, "max-stale"

    .line 356
    .line 357
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-eqz v3, :cond_13

    .line 362
    .line 363
    const v0, 0x7fffffff

    .line 364
    .line 365
    .line 366
    invoke-static {v0, v2}, Lokhttp3/internal/_UtilCommonKt;->q(ILjava/lang/String;)I

    .line 367
    .line 368
    .line 369
    move-result v16

    .line 370
    goto :goto_d

    .line 371
    :cond_13
    const-string v3, "min-fresh"

    .line 372
    .line 373
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-eqz v3, :cond_14

    .line 378
    .line 379
    const/4 v3, -0x1

    .line 380
    invoke-static {v3, v2}, Lokhttp3/internal/_UtilCommonKt;->q(ILjava/lang/String;)I

    .line 381
    .line 382
    .line 383
    move-result v17

    .line 384
    goto :goto_d

    .line 385
    :cond_14
    const/4 v3, -0x1

    .line 386
    const-string v2, "only-if-cached"

    .line 387
    .line 388
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    if-eqz v2, :cond_15

    .line 393
    .line 394
    move-object/from16 v0, p0

    .line 395
    .line 396
    move v2, v1

    .line 397
    move/from16 v18, v22

    .line 398
    .line 399
    goto/16 :goto_c

    .line 400
    .line 401
    :cond_15
    const-string v2, "no-transform"

    .line 402
    .line 403
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v2, :cond_16

    .line 408
    .line 409
    move-object/from16 v0, p0

    .line 410
    .line 411
    move v2, v1

    .line 412
    move/from16 v19, v22

    .line 413
    .line 414
    goto/16 :goto_c

    .line 415
    .line 416
    :cond_16
    const-string v2, "immutable"

    .line 417
    .line 418
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_d

    .line 423
    .line 424
    move-object/from16 v0, p0

    .line 425
    .line 426
    move v2, v1

    .line 427
    move/from16 v20, v22

    .line 428
    .line 429
    goto/16 :goto_c

    .line 430
    .line 431
    :cond_17
    move/from16 v23, v1

    .line 432
    .line 433
    const/4 v3, -0x1

    .line 434
    add-int/lit8 v6, v6, 0x1

    .line 435
    .line 436
    move-object/from16 v0, p0

    .line 437
    .line 438
    move/from16 v1, v23

    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_18
    if-nez v7, :cond_19

    .line 443
    .line 444
    const/16 v21, 0x0

    .line 445
    .line 446
    goto :goto_e

    .line 447
    :cond_19
    move-object/from16 v21, v8

    .line 448
    .line 449
    :goto_e
    new-instance v8, Lokhttp3/CacheControl;

    .line 450
    .line 451
    invoke-direct/range {v8 .. v21}, Lokhttp3/CacheControl;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v8
.end method
