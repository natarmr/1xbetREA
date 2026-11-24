.class public abstract La/s7o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    move v4, v2

    .line 9
    move v5, v4

    .line 10
    :goto_0
    const/16 v3, 0x1b

    .line 11
    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    new-instance v3, La/bpg0;

    .line 15
    .line 16
    const-string v8, ""

    .line 17
    .line 18
    const v6, 0x7f08040d

    .line 19
    .line 20
    .line 21
    const v7, 0x7f06069d

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v3 .. v8}, La/bpg0;-><init>(IIIILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    const/16 v3, 0x8

    .line 31
    .line 32
    if-ne v4, v3, :cond_0

    .line 33
    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    move v4, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sput-object v0, La/s7o0;->a:Ljava/util/ArrayList;

    .line 44
    .line 45
    return-void
.end method

.method public static final a(La/lc00;La/m9s;La/wog0;La/ctf0;)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v2, La/npg0;

    .line 12
    .line 13
    new-instance v3, La/kpg0;

    .line 14
    .line 15
    iget-object v4, v0, La/m9s;->h:La/qqs;

    .line 16
    .line 17
    iget-wide v5, v4, La/qqs;->h:J

    .line 18
    .line 19
    invoke-static {v5, v6}, La/znq0;->f(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    iget-object v4, v4, La/qqs;->k:La/znq0;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iget-wide v7, v4, La/znq0;->a:J

    .line 28
    .line 29
    invoke-static {v7, v8}, La/znq0;->f(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v4, 0x0

    .line 39
    :goto_0
    invoke-direct {v3, v4, v5, v6}, La/kpg0;-><init>(Ljava/lang/Long;J)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v1, La/wog0;->a:Ljava/util/List;

    .line 43
    .line 44
    iget-object v6, v1, La/wog0;->c:Ljava/util/List;

    .line 45
    .line 46
    iget-object v5, v1, La/wog0;->d:La/opg0;

    .line 47
    .line 48
    invoke-static {v4, v6}, La/s7o0;->b(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v1, v1, La/wog0;->b:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v1, v6}, La/s7o0;->b(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/4 v10, 0x3

    .line 63
    const/4 v11, 0x2

    .line 64
    const/4 v12, 0x1

    .line 65
    if-eqz v7, :cond_3

    .line 66
    .line 67
    const v13, 0x7f130f9d

    .line 68
    .line 69
    .line 70
    if-eq v7, v12, :cond_4

    .line 71
    .line 72
    if-eq v7, v11, :cond_2

    .line 73
    .line 74
    if-ne v7, v10, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    const v13, 0x7f13073f

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const v13, 0x7f131810

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_1
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_7

    .line 93
    .line 94
    if-eq v7, v12, :cond_5

    .line 95
    .line 96
    if-eq v7, v11, :cond_7

    .line 97
    .line 98
    if-ne v7, v10, :cond_6

    .line 99
    .line 100
    :cond_5
    const v7, 0x7f06069d

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_7
    const v7, 0x7f0606da

    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    const v16, 0x7f080bb1

    .line 116
    .line 117
    .line 118
    const v17, 0x7f080bb0

    .line 119
    .line 120
    .line 121
    const v18, 0x7f080baf

    .line 122
    .line 123
    .line 124
    if-eqz v8, :cond_b

    .line 125
    .line 126
    if-eq v8, v12, :cond_8

    .line 127
    .line 128
    if-eq v8, v11, :cond_a

    .line 129
    .line 130
    if-ne v8, v10, :cond_9

    .line 131
    .line 132
    :cond_8
    move-object/from16 v19, v2

    .line 133
    .line 134
    move-object v2, v4

    .line 135
    move/from16 v8, v18

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_a
    move-object/from16 v19, v2

    .line 143
    .line 144
    move-object v2, v4

    .line 145
    move/from16 v8, v17

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_b
    move-object/from16 v19, v2

    .line 149
    .line 150
    move-object v2, v4

    .line 151
    move/from16 v8, v16

    .line 152
    .line 153
    :goto_3
    new-instance v4, La/uog0;

    .line 154
    .line 155
    const/4 v9, 0x0

    .line 156
    new-array v14, v9, [Ljava/lang/Object;

    .line 157
    .line 158
    move-object/from16 v15, p3

    .line 159
    .line 160
    iget-object v15, v15, La/ctf0;->b:La/lsm0;

    .line 161
    .line 162
    invoke-static {v14, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-virtual {v15, v13, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v13

    .line 170
    invoke-direct {v4, v13, v7, v8}, La/uog0;-><init>(Ljava/lang/String;II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    const v8, 0x7f130fa3

    .line 178
    .line 179
    .line 180
    if-eqz v7, :cond_f

    .line 181
    .line 182
    if-eq v7, v12, :cond_e

    .line 183
    .line 184
    if-eq v7, v11, :cond_d

    .line 185
    .line 186
    if-ne v7, v10, :cond_c

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_d
    const v8, 0x7f13073f

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_e
    const v8, 0x7f131810

    .line 198
    .line 199
    .line 200
    :cond_f
    :goto_4
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-eqz v7, :cond_10

    .line 205
    .line 206
    if-eq v7, v12, :cond_12

    .line 207
    .line 208
    if-eq v7, v11, :cond_12

    .line 209
    .line 210
    if-ne v7, v10, :cond_11

    .line 211
    .line 212
    :cond_10
    const v14, 0x7f06069d

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_12
    const v14, 0x7f0606da

    .line 221
    .line 222
    .line 223
    :goto_5
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_13

    .line 228
    .line 229
    if-eq v7, v12, :cond_16

    .line 230
    .line 231
    if-eq v7, v11, :cond_15

    .line 232
    .line 233
    if-ne v7, v10, :cond_14

    .line 234
    .line 235
    :cond_13
    move-object v10, v5

    .line 236
    move/from16 v7, v18

    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_15
    move-object v10, v5

    .line 244
    move/from16 v7, v17

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_16
    move-object v10, v5

    .line 248
    move/from16 v7, v16

    .line 249
    .line 250
    :goto_6
    new-instance v5, La/uog0;

    .line 251
    .line 252
    new-array v13, v9, [Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static {v13, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v13

    .line 258
    invoke-virtual {v15, v8, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    invoke-direct {v5, v8, v14, v7}, La/uog0;-><init>(Ljava/lang/String;II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-wide v7, v0, La/m9s;->v:J

    .line 269
    .line 270
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_1a

    .line 275
    .line 276
    if-eq v0, v12, :cond_19

    .line 277
    .line 278
    if-eq v0, v11, :cond_18

    .line 279
    .line 280
    sget-object v0, La/wen;->b:La/uen;

    .line 281
    .line 282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 283
    .line 284
    .line 285
    move-result-wide v10

    .line 286
    sget-object v0, La/bfn;->d:La/bfn;

    .line 287
    .line 288
    invoke-static {v10, v11, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 289
    .line 290
    .line 291
    move-result-wide v10

    .line 292
    sget-object v0, La/bfn;->e:La/bfn;

    .line 293
    .line 294
    invoke-static {v10, v11, v0}, La/wen;->l(JLa/bfn;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v10

    .line 298
    sub-long/2addr v7, v10

    .line 299
    const-wide/16 v10, 0x1

    .line 300
    .line 301
    cmp-long v0, v10, v7

    .line 302
    .line 303
    if-gtz v0, :cond_17

    .line 304
    .line 305
    const-wide/16 v10, 0x5460

    .line 306
    .line 307
    cmp-long v0, v7, v10

    .line 308
    .line 309
    if-gez v0, :cond_17

    .line 310
    .line 311
    new-array v0, v9, [Ljava/lang/Object;

    .line 312
    .line 313
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    const v7, 0x7f130232

    .line 318
    .line 319
    .line 320
    invoke-virtual {v15, v7, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    :goto_7
    move-object v7, v3

    .line 325
    move-object v3, v1

    .line 326
    move-object v1, v7

    .line 327
    move-object v7, v0

    .line 328
    move-object/from16 v0, v19

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_17
    const-string v0, ""

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_18
    new-array v0, v9, [Ljava/lang/Object;

    .line 335
    .line 336
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const v7, 0x7f130744

    .line 341
    .line 342
    .line 343
    invoke-virtual {v15, v7, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    goto :goto_7

    .line 348
    :cond_19
    new-array v0, v9, [Ljava/lang/Object;

    .line 349
    .line 350
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const v7, 0x7f130fa4

    .line 355
    .line 356
    .line 357
    invoke-virtual {v15, v7, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    goto :goto_7

    .line 362
    :cond_1a
    new-array v0, v9, [Ljava/lang/Object;

    .line 363
    .line 364
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    const v7, 0x7f130f9e

    .line 369
    .line 370
    .line 371
    invoke-virtual {v15, v7, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    goto :goto_7

    .line 376
    :goto_8
    invoke-direct/range {v0 .. v7}, La/npg0;-><init>(La/kpg0;Ljava/util/ArrayList;Ljava/util/ArrayList;La/uog0;La/uog0;Ljava/util/List;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    move-object v1, v0

    .line 380
    move-object/from16 v0, p0

    .line 381
    .line 382
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    return-void
.end method

.method public static final b(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    sget-object v2, La/s7o0;->a:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_5

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, La/bpg0;

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v5, v4

    .line 45
    check-cast v5, La/xog0;

    .line 46
    .line 47
    iget v6, v2, La/bpg0;->a:I

    .line 48
    .line 49
    iget v7, v5, La/xog0;->a:I

    .line 50
    .line 51
    if-ne v6, v7, :cond_0

    .line 52
    .line 53
    iget v6, v2, La/bpg0;->b:I

    .line 54
    .line 55
    iget v5, v5, La/xog0;->b:I

    .line 56
    .line 57
    if-ne v6, v5, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v4, 0x0

    .line 61
    :goto_1
    check-cast v4, La/xog0;

    .line 62
    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    iget v2, v4, La/xog0;->c:I

    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    new-instance v5, La/bpg0;

    .line 76
    .line 77
    iget v6, v4, La/xog0;->a:I

    .line 78
    .line 79
    iget v7, v4, La/xog0;->b:I

    .line 80
    .line 81
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    const v2, 0x7f08040e

    .line 88
    .line 89
    .line 90
    :goto_2
    move v8, v2

    .line 91
    goto :goto_3

    .line 92
    :cond_2
    const v2, 0x7f08040d

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :goto_3
    if-eqz v3, :cond_3

    .line 97
    .line 98
    const v2, 0x7f0606da

    .line 99
    .line 100
    .line 101
    :goto_4
    move v9, v2

    .line 102
    goto :goto_5

    .line 103
    :cond_3
    const v2, 0x7f06069d

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :goto_5
    invoke-direct/range {v5 .. v10}, La/bpg0;-><init>(IIIILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    move-object v2, v5

    .line 111
    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    return-object v0
.end method
