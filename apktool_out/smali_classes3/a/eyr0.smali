.class public abstract La/eyr0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;

.field public static final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, La/eyr0;->a:Ljava/util/List;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x5

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x6

    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x7

    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/eyr0;->b:Ljava/util/List;

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/16 v1, 0x8

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/16 v2, 0x9

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, La/eyr0;->c:Ljava/util/List;

    .line 73
    .line 74
    return-void
.end method

.method public static final a(La/bzr0;)La/myr0;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, La/bzr0;->a:Ljava/lang/Long;

    .line 7
    .line 8
    iget-object v2, v0, La/bzr0;->d:Ljava/lang/Boolean;

    .line 9
    .line 10
    iget-object v3, v0, La/bzr0;->g:La/qyr0;

    .line 11
    .line 12
    iget-object v4, v0, La/bzr0;->e:Ljava/lang/Integer;

    .line 13
    .line 14
    iget-object v5, v0, La/bzr0;->b:Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v1, :cond_2f

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v8

    .line 22
    const/4 v1, 0x1

    .line 23
    if-nez v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-ne v7, v1, :cond_1

    .line 31
    .line 32
    sget-object v7, La/z1s0;->a:La/z1s0;

    .line 33
    .line 34
    :goto_0
    move-object v10, v7

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    sget-object v7, La/z1s0;->b:La/z1s0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_2
    sget-object v7, La/qek0;->f:La/qek0;

    .line 40
    .line 41
    const/4 v11, 0x2

    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    if-eq v12, v11, :cond_4

    .line 50
    .line 51
    :goto_3
    iget-object v12, v0, La/bzr0;->c:Ljava/lang/Integer;

    .line 52
    .line 53
    if-nez v12, :cond_3

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_3
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    const/4 v13, 0x4

    .line 61
    if-ne v12, v13, :cond_4

    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_4
    :goto_4
    if-nez v5, :cond_5

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_5
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    if-ne v12, v11, :cond_6

    .line 72
    .line 73
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-eqz v12, :cond_6

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_6
    :goto_5
    sget-object v7, La/rek0;->f:La/rek0;

    .line 83
    .line 84
    :goto_6
    sget-object v12, La/eyr0;->b:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v12, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    if-eqz v12, :cond_7

    .line 91
    .line 92
    sget-object v12, La/jdk0;->e:La/jdk0;

    .line 93
    .line 94
    goto :goto_7

    .line 95
    :cond_7
    sget-object v12, La/eyr0;->a:Ljava/util/List;

    .line 96
    .line 97
    invoke-static {v12, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-eqz v12, :cond_8

    .line 102
    .line 103
    sget-object v12, La/pek0;->e:La/pek0;

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_8
    sget-object v12, La/eyr0;->c:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v12, v4}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_2e

    .line 113
    .line 114
    sget-object v12, La/jyr0;->a:La/jyr0;

    .line 115
    .line 116
    :goto_7
    if-eqz v2, :cond_9

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    :goto_8
    move/from16 v16, v2

    .line 123
    .line 124
    goto :goto_9

    .line 125
    :cond_9
    const/4 v2, 0x0

    .line 126
    goto :goto_8

    .line 127
    :goto_9
    new-instance v13, La/iyr0;

    .line 128
    .line 129
    iget-object v0, v0, La/bzr0;->f:La/tyr0;

    .line 130
    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    iget-object v2, v0, La/tyr0;->a:Ljava/lang/String;

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_a
    const/4 v2, 0x0

    .line 137
    :goto_a
    if-eqz v0, :cond_b

    .line 138
    .line 139
    iget-object v14, v0, La/tyr0;->c:Ljava/lang/String;

    .line 140
    .line 141
    goto :goto_b

    .line 142
    :cond_b
    const/4 v14, 0x0

    .line 143
    :goto_b
    if-eqz v0, :cond_2d

    .line 144
    .line 145
    iget-object v0, v0, La/tyr0;->b:Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v0, :cond_2d

    .line 148
    .line 149
    invoke-direct {v13, v2, v14, v0}, La/iyr0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    if-eqz v3, :cond_2c

    .line 153
    .line 154
    iget-object v0, v3, La/qyr0;->l:La/of9;

    .line 155
    .line 156
    iget-object v2, v3, La/qyr0;->a:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v14, v3, La/qyr0;->e:Ljava/lang/Long;

    .line 159
    .line 160
    iget-object v15, v3, La/qyr0;->d:Ljava/lang/Long;

    .line 161
    .line 162
    const/16 v31, 0x0

    .line 163
    .line 164
    iget-object v6, v3, La/qyr0;->m:La/xyr0;

    .line 165
    .line 166
    if-eqz v2, :cond_2b

    .line 167
    .line 168
    iget-object v11, v3, La/qyr0;->b:Ljava/lang/Long;

    .line 169
    .line 170
    const-wide/16 v17, 0x0

    .line 171
    .line 172
    if-eqz v11, :cond_c

    .line 173
    .line 174
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 175
    .line 176
    .line 177
    move-result-wide v19

    .line 178
    goto :goto_c

    .line 179
    :cond_c
    move-wide/from16 v19, v17

    .line 180
    .line 181
    :goto_c
    iget-object v11, v3, La/qyr0;->c:Ljava/lang/String;

    .line 182
    .line 183
    if-eqz v15, :cond_2a

    .line 184
    .line 185
    sget-object v21, La/rdj;->a:La/rdj;

    .line 186
    .line 187
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 188
    .line 189
    .line 190
    move-result-wide v21

    .line 191
    invoke-static/range {v21 .. v22}, La/rdj;->k(J)Ljava/util/Date;

    .line 192
    .line 193
    .line 194
    move-result-object v22

    .line 195
    if-eqz v14, :cond_29

    .line 196
    .line 197
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 198
    .line 199
    .line 200
    move-result-wide v14

    .line 201
    invoke-static {v14, v15}, La/rdj;->k(J)Ljava/util/Date;

    .line 202
    .line 203
    .line 204
    move-result-object v23

    .line 205
    iget-object v14, v3, La/qyr0;->f:Ljava/lang/String;

    .line 206
    .line 207
    const-string v15, ""

    .line 208
    .line 209
    if-nez v14, :cond_d

    .line 210
    .line 211
    move-object/from16 v24, v15

    .line 212
    .line 213
    goto :goto_d

    .line 214
    :cond_d
    move-object/from16 v24, v14

    .line 215
    .line 216
    :goto_d
    iget-object v14, v3, La/qyr0;->g:Ljava/lang/String;

    .line 217
    .line 218
    if-eqz v14, :cond_28

    .line 219
    .line 220
    iget-object v1, v3, La/qyr0;->i:Ljava/lang/Long;

    .line 221
    .line 222
    if-eqz v1, :cond_f

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 225
    .line 226
    .line 227
    move-result-wide v25

    .line 228
    invoke-static/range {v25 .. v26}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-nez v1, :cond_e

    .line 233
    .line 234
    goto :goto_e

    .line 235
    :cond_e
    move-object/from16 v27, v1

    .line 236
    .line 237
    goto :goto_f

    .line 238
    :cond_f
    :goto_e
    move-object/from16 v27, v15

    .line 239
    .line 240
    :goto_f
    iget-object v1, v3, La/qyr0;->j:Ljava/lang/String;

    .line 241
    .line 242
    if-nez v1, :cond_10

    .line 243
    .line 244
    move-object/from16 v28, v15

    .line 245
    .line 246
    goto :goto_10

    .line 247
    :cond_10
    move-object/from16 v28, v1

    .line 248
    .line 249
    :goto_10
    iget-object v1, v3, La/qyr0;->k:Ljava/lang/Integer;

    .line 250
    .line 251
    if-eqz v1, :cond_11

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    goto :goto_11

    .line 262
    :cond_11
    move-object/from16 v1, v31

    .line 263
    .line 264
    :goto_11
    if-nez v1, :cond_12

    .line 265
    .line 266
    move-object/from16 v29, v15

    .line 267
    .line 268
    goto :goto_12

    .line 269
    :cond_12
    move-object/from16 v29, v1

    .line 270
    .line 271
    :goto_12
    iget-object v1, v3, La/qyr0;->h:Ljava/lang/String;

    .line 272
    .line 273
    if-eqz v1, :cond_13

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-lez v3, :cond_13

    .line 280
    .line 281
    move-object/from16 v26, v1

    .line 282
    .line 283
    goto :goto_13

    .line 284
    :cond_13
    move-object/from16 v26, v31

    .line 285
    .line 286
    :goto_13
    if-eqz v26, :cond_27

    .line 287
    .line 288
    if-eqz v6, :cond_17

    .line 289
    .line 290
    iget-object v1, v6, La/xyr0;->a:La/zyr0;

    .line 291
    .line 292
    if-eqz v1, :cond_17

    .line 293
    .line 294
    sget-object v3, La/dyr0;->a:[I

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    aget v1, v3, v1

    .line 301
    .line 302
    const/4 v3, 0x1

    .line 303
    if-eq v1, v3, :cond_16

    .line 304
    .line 305
    const/4 v3, 0x2

    .line 306
    if-eq v1, v3, :cond_15

    .line 307
    .line 308
    const/4 v3, 0x3

    .line 309
    if-ne v1, v3, :cond_14

    .line 310
    .line 311
    sget-object v1, La/gyr0;->c:La/gyr0;

    .line 312
    .line 313
    goto :goto_14

    .line 314
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 315
    .line 316
    .line 317
    return-object v31

    .line 318
    :cond_15
    sget-object v1, La/gyr0;->b:La/gyr0;

    .line 319
    .line 320
    goto :goto_14

    .line 321
    :cond_16
    sget-object v1, La/gyr0;->a:La/gyr0;

    .line 322
    .line 323
    :goto_14
    move-object/from16 v33, v1

    .line 324
    .line 325
    goto :goto_15

    .line 326
    :cond_17
    move-object/from16 v33, v31

    .line 327
    .line 328
    :goto_15
    if-eqz v6, :cond_18

    .line 329
    .line 330
    iget-object v1, v6, La/xyr0;->b:Ljava/lang/Long;

    .line 331
    .line 332
    if-eqz v1, :cond_18

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 335
    .line 336
    .line 337
    move-result-wide v34

    .line 338
    invoke-static/range {v34 .. v35}, La/rdj;->k(J)Ljava/util/Date;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    move-object/from16 v34, v1

    .line 343
    .line 344
    goto :goto_16

    .line 345
    :cond_18
    move-object/from16 v34, v31

    .line 346
    .line 347
    :goto_16
    if-eqz v6, :cond_19

    .line 348
    .line 349
    iget-object v1, v6, La/xyr0;->c:Ljava/lang/Long;

    .line 350
    .line 351
    if-eqz v1, :cond_19

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 354
    .line 355
    .line 356
    move-result-wide v35

    .line 357
    invoke-static/range {v35 .. v36}, La/rdj;->k(J)Ljava/util/Date;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    move-object/from16 v35, v1

    .line 362
    .line 363
    goto :goto_17

    .line 364
    :cond_19
    move-object/from16 v35, v31

    .line 365
    .line 366
    :goto_17
    if-eqz v6, :cond_1a

    .line 367
    .line 368
    iget-object v1, v6, La/xyr0;->d:Ljava/lang/String;

    .line 369
    .line 370
    goto :goto_18

    .line 371
    :cond_1a
    move-object/from16 v1, v31

    .line 372
    .line 373
    :goto_18
    if-nez v1, :cond_1b

    .line 374
    .line 375
    move-object/from16 v37, v15

    .line 376
    .line 377
    goto :goto_19

    .line 378
    :cond_1b
    move-object/from16 v37, v1

    .line 379
    .line 380
    :goto_19
    new-instance v1, Ljava/util/Date;

    .line 381
    .line 382
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 386
    .line 387
    .line 388
    move-result-wide v38

    .line 389
    if-eqz v6, :cond_1c

    .line 390
    .line 391
    iget-object v1, v6, La/xyr0;->c:Ljava/lang/Long;

    .line 392
    .line 393
    if-eqz v1, :cond_1c

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 396
    .line 397
    .line 398
    move-result-wide v17

    .line 399
    :cond_1c
    move-object v3, v2

    .line 400
    move-wide/from16 v1, v17

    .line 401
    .line 402
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 403
    .line 404
    invoke-virtual {v6, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v1

    .line 408
    add-long v1, v1, v38

    .line 409
    .line 410
    new-instance v32, La/fyr0;

    .line 411
    .line 412
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 413
    .line 414
    .line 415
    move-result-object v36

    .line 416
    invoke-direct/range {v32 .. v37}, La/fyr0;-><init>(La/gyr0;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Long;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    new-instance v17, La/hyr0;

    .line 420
    .line 421
    move-object/from16 v18, v3

    .line 422
    .line 423
    move-object/from16 v21, v11

    .line 424
    .line 425
    move-object/from16 v25, v14

    .line 426
    .line 427
    move-object/from16 v30, v32

    .line 428
    .line 429
    invoke-direct/range {v17 .. v30}, La/hyr0;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fyr0;)V

    .line 430
    .line 431
    .line 432
    if-nez v5, :cond_1d

    .line 433
    .line 434
    goto :goto_1a

    .line 435
    :cond_1d
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    const/4 v3, 0x2

    .line 440
    if-ne v1, v3, :cond_1f

    .line 441
    .line 442
    sget-object v1, La/re9;->a:La/kj5;

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-static {v4}, La/kj5;->h(Ljava/lang/Integer;)La/re9;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    sget-object v2, La/re9;->b:La/re9;

    .line 452
    .line 453
    if-ne v1, v2, :cond_1f

    .line 454
    .line 455
    new-instance v1, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 456
    .line 457
    if-eqz v0, :cond_1e

    .line 458
    .line 459
    iget-object v2, v0, La/of9;->c:La/he9;

    .line 460
    .line 461
    if-eqz v2, :cond_1e

    .line 462
    .line 463
    iget-object v2, v2, La/he9;->a:Ljava/lang/String;

    .line 464
    .line 465
    if-eqz v2, :cond_1e

    .line 466
    .line 467
    sget-object v3, La/gqt0;->c:La/gqt0;

    .line 468
    .line 469
    invoke-direct {v1, v2, v3}, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;-><init>(Ljava/lang/String;La/gqt0;)V

    .line 470
    .line 471
    .line 472
    goto :goto_1c

    .line 473
    :cond_1e
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    return-object v31

    .line 477
    :cond_1f
    :goto_1a
    if-nez v5, :cond_20

    .line 478
    .line 479
    goto :goto_1b

    .line 480
    :cond_20
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    const/4 v3, 0x1

    .line 485
    if-ne v1, v3, :cond_22

    .line 486
    .line 487
    sget-object v1, La/re9;->a:La/kj5;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-static {v4}, La/kj5;->h(Ljava/lang/Integer;)La/re9;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    sget-object v2, La/re9;->b:La/re9;

    .line 497
    .line 498
    if-ne v1, v2, :cond_22

    .line 499
    .line 500
    new-instance v1, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 501
    .line 502
    if-eqz v0, :cond_21

    .line 503
    .line 504
    iget-object v2, v0, La/of9;->b:La/he9;

    .line 505
    .line 506
    if-eqz v2, :cond_21

    .line 507
    .line 508
    iget-object v2, v2, La/he9;->a:Ljava/lang/String;

    .line 509
    .line 510
    if-eqz v2, :cond_21

    .line 511
    .line 512
    sget-object v3, La/gqt0;->a:La/gqt0;

    .line 513
    .line 514
    invoke-direct {v1, v2, v3}, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;-><init>(Ljava/lang/String;La/gqt0;)V

    .line 515
    .line 516
    .line 517
    goto :goto_1c

    .line 518
    :cond_21
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-object v31

    .line 522
    :cond_22
    :goto_1b
    new-instance v1, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 523
    .line 524
    sget-object v2, La/gqt0;->h:La/gqt0;

    .line 525
    .line 526
    invoke-direct {v1, v15, v2}, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;-><init>(Ljava/lang/String;La/gqt0;)V

    .line 527
    .line 528
    .line 529
    :goto_1c
    if-nez v5, :cond_23

    .line 530
    .line 531
    goto :goto_1e

    .line 532
    :cond_23
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    const/4 v3, 0x2

    .line 537
    if-ne v2, v3, :cond_24

    .line 538
    .line 539
    sget-object v2, La/re9;->a:La/kj5;

    .line 540
    .line 541
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    invoke-static {v4}, La/kj5;->h(Ljava/lang/Integer;)La/re9;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    sget-object v3, La/re9;->b:La/re9;

    .line 549
    .line 550
    if-ne v2, v3, :cond_24

    .line 551
    .line 552
    new-instance v2, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 553
    .line 554
    sget-object v3, La/gqt0;->h:La/gqt0;

    .line 555
    .line 556
    invoke-direct {v2, v15, v3}, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;-><init>(Ljava/lang/String;La/gqt0;)V

    .line 557
    .line 558
    .line 559
    :goto_1d
    move-object/from16 v19, v2

    .line 560
    .line 561
    goto :goto_1f

    .line 562
    :cond_24
    :goto_1e
    new-instance v2, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 563
    .line 564
    if-eqz v0, :cond_26

    .line 565
    .line 566
    iget-object v3, v0, La/of9;->f:La/he9;

    .line 567
    .line 568
    if-eqz v3, :cond_26

    .line 569
    .line 570
    iget-object v3, v3, La/he9;->a:Ljava/lang/String;

    .line 571
    .line 572
    if-eqz v3, :cond_26

    .line 573
    .line 574
    sget-object v5, La/gqt0;->e:La/gqt0;

    .line 575
    .line 576
    invoke-direct {v2, v3, v5}, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;-><init>(Ljava/lang/String;La/gqt0;)V

    .line 577
    .line 578
    .line 579
    goto :goto_1d

    .line 580
    :goto_1f
    sget-object v2, La/re9;->a:La/kj5;

    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-static {v4}, La/kj5;->h(Ljava/lang/Integer;)La/re9;

    .line 586
    .line 587
    .line 588
    move-result-object v20

    .line 589
    if-eqz v0, :cond_25

    .line 590
    .line 591
    invoke-static {v0}, La/rsm0;->y(La/of9;)La/lf9;

    .line 592
    .line 593
    .line 594
    move-result-object v18

    .line 595
    move-object v11, v7

    .line 596
    new-instance v7, La/myr0;

    .line 597
    .line 598
    const/4 v15, 0x0

    .line 599
    move-object/from16 v14, v17

    .line 600
    .line 601
    move-object/from16 v17, v1

    .line 602
    .line 603
    invoke-direct/range {v7 .. v20}, La/myr0;-><init>(JLa/z1s0;La/lyr0;La/kyr0;La/iyr0;La/hyr0;ZZLorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;La/lf9;Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;La/re9;)V

    .line 604
    .line 605
    .line 606
    return-object v7

    .line 607
    :cond_25
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    return-object v31

    .line 611
    :cond_26
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    return-object v31

    .line 615
    :cond_27
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    return-object v31

    .line 619
    :cond_28
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    return-object v31

    .line 623
    :cond_29
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    return-object v31

    .line 627
    :cond_2a
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    return-object v31

    .line 631
    :cond_2b
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    return-object v31

    .line 635
    :cond_2c
    const/16 v31, 0x0

    .line 636
    .line 637
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    return-object v31

    .line 641
    :cond_2d
    const/16 v31, 0x0

    .line 642
    .line 643
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    return-object v31

    .line 647
    :cond_2e
    const/16 v31, 0x0

    .line 648
    .line 649
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    return-object v31

    .line 653
    :cond_2f
    const/16 v31, 0x0

    .line 654
    .line 655
    invoke-static/range {v31 .. v31}, La/jf4;->k(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    return-object v31
.end method
