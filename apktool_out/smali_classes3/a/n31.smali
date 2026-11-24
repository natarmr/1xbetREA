.class public final La/n31;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xzp;

.field public final b:La/knf0;

.field public final c:La/j51;

.field public final d:La/x2c0;

.field public final e:La/btt0;


# direct methods
.method public constructor <init>(La/xzp;La/knf0;La/j51;La/x2c0;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/n31;->a:La/xzp;

    .line 17
    .line 18
    iput-object p2, p0, La/n31;->b:La/knf0;

    .line 19
    .line 20
    iput-object p3, p0, La/n31;->c:La/j51;

    .line 21
    .line 22
    iput-object p4, p0, La/n31;->d:La/x2c0;

    .line 23
    .line 24
    iput-object p5, p0, La/n31;->e:La/btt0;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLa/zje;)Ljava/io/Serializable;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p10

    .line 4
    .line 5
    move-object/from16 v2, p15

    .line 6
    .line 7
    instance-of v3, v2, La/m31;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/m31;

    .line 13
    .line 14
    iget v4, v3, La/m31;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/m31;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/m31;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/m31;-><init>(La/n31;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/m31;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/m31;->l:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/16 v8, 0xa

    .line 40
    .line 41
    const/16 v19, 0x0

    .line 42
    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    if-eq v5, v7, :cond_2

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    .line 49
    iget-object v0, v3, La/m31;->i:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move v3, v8

    .line 55
    goto/16 :goto_b

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v19

    .line 63
    :cond_2
    iget-object v0, v3, La/m31;->i:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, La/n31;->a:La/xzp;

    .line 74
    .line 75
    if-eqz p14, :cond_e

    .line 76
    .line 77
    new-instance v5, Ljava/lang/Long;

    .line 78
    .line 79
    move-wide/from16 v9, p1

    .line 80
    .line 81
    invoke-direct {v5, v9, v10}, Ljava/lang/Long;-><init>(J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    sget-object v6, La/nw80;->t:La/nw80;

    .line 89
    .line 90
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 91
    .line 92
    .line 93
    move-result-wide v11

    .line 94
    cmp-long v6, v9, v11

    .line 95
    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-object/from16 v5, v19

    .line 100
    .line 101
    :goto_1
    invoke-static {v5}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v24

    .line 105
    if-eqz p13, :cond_5

    .line 106
    .line 107
    move-object/from16 v25, v19

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object/from16 v25, p4

    .line 111
    .line 112
    :goto_2
    if-eqz p13, :cond_7

    .line 113
    .line 114
    new-instance v5, Ljava/util/ArrayList;

    .line 115
    .line 116
    move-object/from16 v11, p4

    .line 117
    .line 118
    invoke-static {v11, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-eqz v9, :cond_6

    .line 134
    .line 135
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    check-cast v9, Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v9

    .line 145
    invoke-static {v9, v10, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_6
    move-object/from16 v26, v5

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    move-object/from16 v26, v19

    .line 153
    .line 154
    :goto_4
    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v30

    .line 158
    const/16 v33, 0x1688

    .line 159
    .line 160
    const/16 v23, 0x0

    .line 161
    .line 162
    const/16 v27, 0x0

    .line 163
    .line 164
    const/16 v29, 0x0

    .line 165
    .line 166
    move-object/from16 v22, p3

    .line 167
    .line 168
    move-object/from16 v31, p5

    .line 169
    .line 170
    move-object/from16 v32, p6

    .line 171
    .line 172
    move-object/from16 v28, p8

    .line 173
    .line 174
    move/from16 v21, p11

    .line 175
    .line 176
    move/from16 v20, p12

    .line 177
    .line 178
    invoke-static/range {v20 .. v33}, La/cwr0;->K(IILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;I)La/jo20;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    :try_start_0
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 183
    .line 184
    iget-object v0, v0, La/n31;->e:La/btt0;

    .line 185
    .line 186
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    goto :goto_5

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 193
    .line 194
    new-instance v6, La/g0g0;

    .line 195
    .line 196
    invoke-direct {v6, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    move-object v0, v6

    .line 200
    :goto_5
    nop

    .line 201
    instance-of v6, v0, La/g0g0;

    .line 202
    .line 203
    if-eqz v6, :cond_8

    .line 204
    .line 205
    move-object/from16 v0, v19

    .line 206
    .line 207
    :cond_8
    check-cast v0, Ljava/lang/String;

    .line 208
    .line 209
    if-eqz v0, :cond_9

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-lez v6, :cond_9

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_9
    move-object/from16 v0, v19

    .line 219
    .line 220
    :goto_6
    iput-object v1, v3, La/m31;->i:Ljava/lang/String;

    .line 221
    .line 222
    iput v7, v3, La/m31;->l:I

    .line 223
    .line 224
    invoke-static {v2, v5, v0, v3}, La/xzp;->z(La/xzp;La/jo20;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-ne v2, v4, :cond_a

    .line 229
    .line 230
    move-object v2, v4

    .line 231
    goto/16 :goto_a

    .line 232
    .line 233
    :cond_a
    move-object v0, v1

    .line 234
    :goto_7
    check-cast v2, La/dx5;

    .line 235
    .line 236
    invoke-virtual {v2}, La/dx5;->a()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast v1, La/ty0;

    .line 241
    .line 242
    iget-object v1, v1, La/ty0;->a:Ljava/util/List;

    .line 243
    .line 244
    if-eqz v1, :cond_c

    .line 245
    .line 246
    new-instance v2, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_b

    .line 264
    .line 265
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, La/bw0;

    .line 270
    .line 271
    invoke-static {v3, v0}, La/saj;->h0(La/bw0;Ljava/lang/String;)La/mlr;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_b
    move-object/from16 v19, v2

    .line 280
    .line 281
    :cond_c
    if-nez v19, :cond_d

    .line 282
    .line 283
    sget-object v19, La/iun;->a:La/iun;

    .line 284
    .line 285
    :cond_d
    return-object v19

    .line 286
    :cond_e
    move-wide/from16 v9, p1

    .line 287
    .line 288
    move-object/from16 v11, p4

    .line 289
    .line 290
    iget-object v5, v0, La/n31;->b:La/knf0;

    .line 291
    .line 292
    invoke-virtual {v5}, La/knf0;->b()I

    .line 293
    .line 294
    .line 295
    move-result v12

    .line 296
    iget-object v0, v0, La/n31;->d:La/x2c0;

    .line 297
    .line 298
    invoke-virtual {v0}, La/x2c0;->a()La/m2c0;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    if-eqz v0, :cond_f

    .line 303
    .line 304
    iget-object v0, v0, La/m2c0;->c:Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object v7, v0

    .line 311
    goto :goto_9

    .line 312
    :cond_f
    move-object/from16 v7, v19

    .line 313
    .line 314
    :goto_9
    invoke-virtual {v5}, La/knf0;->c()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v17

    .line 318
    iput-object v1, v3, La/m31;->i:Ljava/lang/String;

    .line 319
    .line 320
    iput v6, v3, La/m31;->l:I

    .line 321
    .line 322
    move-object v5, v4

    .line 323
    move-object v4, v2

    .line 324
    move-object v2, v5

    .line 325
    move/from16 v16, p7

    .line 326
    .line 327
    move/from16 v15, p11

    .line 328
    .line 329
    move/from16 v14, p12

    .line 330
    .line 331
    move/from16 v13, p13

    .line 332
    .line 333
    move-object/from16 v18, v3

    .line 334
    .line 335
    move v3, v8

    .line 336
    move-wide v5, v9

    .line 337
    move-object v10, v11

    .line 338
    move-object/from16 v9, p3

    .line 339
    .line 340
    move-object/from16 v11, p8

    .line 341
    .line 342
    move-object/from16 v8, p9

    .line 343
    .line 344
    invoke-virtual/range {v4 .. v18}, La/xzp;->A(JLjava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;IZIIZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-ne v0, v2, :cond_10

    .line 349
    .line 350
    :goto_a
    return-object v2

    .line 351
    :cond_10
    move-object v2, v0

    .line 352
    move-object v0, v1

    .line 353
    :goto_b
    check-cast v2, La/dx5;

    .line 354
    .line 355
    invoke-virtual {v2}, La/dx5;->a()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    check-cast v1, La/bt0;

    .line 360
    .line 361
    iget-object v1, v1, La/bt0;->a:Ljava/util/List;

    .line 362
    .line 363
    if-eqz v1, :cond_12

    .line 364
    .line 365
    new-instance v2, Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 372
    .line 373
    .line 374
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    if-eqz v3, :cond_11

    .line 383
    .line 384
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    check-cast v3, La/ys0;

    .line 389
    .line 390
    invoke-static {v3, v0}, La/saj;->g0(La/ys0;Ljava/lang/String;)La/mlr;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    goto :goto_c

    .line 398
    :cond_11
    move-object/from16 v19, v2

    .line 399
    .line 400
    :cond_12
    if-nez v19, :cond_13

    .line 401
    .line 402
    sget-object v0, La/iun;->a:La/iun;

    .line 403
    .line 404
    return-object v0

    .line 405
    :cond_13
    return-object v19
.end method
