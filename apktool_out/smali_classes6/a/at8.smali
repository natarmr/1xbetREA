.class public final La/at8;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:La/dpa0;

.field public k:I

.field public l:F

.field public m:B

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/vb8;

.field public final synthetic p:F

.field public final synthetic q:La/d38;

.field public final synthetic r:La/j6u0;

.field public final synthetic s:La/xs8;

.field public final synthetic t:La/igm;


# direct methods
.method public constructor <init>(La/vb8;FLa/d38;La/j6u0;La/xs8;La/igm;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/at8;->o:La/vb8;

    .line 2
    .line 3
    iput p2, p0, La/at8;->p:F

    .line 4
    .line 5
    iput-object p3, p0, La/at8;->q:La/d38;

    .line 6
    .line 7
    iput-object p4, p0, La/at8;->r:La/j6u0;

    .line 8
    .line 9
    iput-object p5, p0, La/at8;->s:La/xs8;

    .line 10
    .line 11
    iput-object p6, p0, La/at8;->t:La/igm;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, La/zzf0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/at8;

    .line 2
    .line 3
    iget-object v5, p0, La/at8;->s:La/xs8;

    .line 4
    .line 5
    iget-object v6, p0, La/at8;->t:La/igm;

    .line 6
    .line 7
    iget-object v1, p0, La/at8;->o:La/vb8;

    .line 8
    .line 9
    iget v2, p0, La/at8;->p:F

    .line 10
    .line 11
    iget-object v3, p0, La/at8;->q:La/d38;

    .line 12
    .line 13
    iget-object v4, p0, La/at8;->r:La/j6u0;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/at8;-><init>(La/vb8;FLa/d38;La/j6u0;La/xs8;La/igm;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/at8;->n:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/inn0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/at8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/at8;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/at8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/at8;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/inn0;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/at8;->m:B

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    iget-object v7, v0, La/at8;->o:La/vb8;

    .line 14
    .line 15
    const/4 v8, 0x3

    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x1

    .line 18
    iget-object v11, v0, La/at8;->r:La/j6u0;

    .line 19
    .line 20
    const/16 v12, 0x20

    .line 21
    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    if-eq v3, v10, :cond_2

    .line 25
    .line 26
    if-eq v3, v9, :cond_1

    .line 27
    .line 28
    if-ne v3, v8, :cond_0

    .line 29
    .line 30
    iget v3, v0, La/at8;->l:F

    .line 31
    .line 32
    iget v5, v0, La/at8;->k:I

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v6, p1

    .line 38
    .line 39
    move-object/from16 v16, v7

    .line 40
    .line 41
    move v7, v8

    .line 42
    const/high16 v15, 0x3f000000    # 0.5f

    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_1
    iget v3, v0, La/at8;->k:I

    .line 53
    .line 54
    iget-object v13, v0, La/at8;->j:La/dpa0;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v14, p1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v3, p1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v0, La/at8;->n:Ljava/lang/Object;

    .line 72
    .line 73
    iput-byte v10, v0, La/at8;->m:B

    .line 74
    .line 75
    invoke-static {v1, v5, v0, v9}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-ne v3, v2, :cond_4

    .line 80
    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :cond_4
    :goto_0
    check-cast v3, La/dpa0;

    .line 84
    .line 85
    move-object v13, v3

    .line 86
    move v3, v5

    .line 87
    :goto_1
    sget-object v14, La/xoa0;->b:La/xoa0;

    .line 88
    .line 89
    iput-object v1, v0, La/at8;->n:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v13, v0, La/at8;->j:La/dpa0;

    .line 92
    .line 93
    iput v3, v0, La/at8;->k:I

    .line 94
    .line 95
    iput-byte v9, v0, La/at8;->m:B

    .line 96
    .line 97
    invoke-virtual {v1, v14, v0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    if-ne v14, v2, :cond_5

    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_5
    :goto_2
    check-cast v14, La/woa0;

    .line 106
    .line 107
    iget-object v14, v14, La/woa0;->a:Ljava/util/List;

    .line 108
    .line 109
    if-eqz v14, :cond_6

    .line 110
    .line 111
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-eqz v15, :cond_6

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v15

    .line 122
    :cond_7
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v16

    .line 126
    if-eqz v16, :cond_8

    .line 127
    .line 128
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v16

    .line 132
    check-cast v16, La/dpa0;

    .line 133
    .line 134
    invoke-static/range {v16 .. v16}, La/x2x;->K(La/dpa0;)Z

    .line 135
    .line 136
    .line 137
    move-result v16

    .line 138
    if-eqz v16, :cond_7

    .line 139
    .line 140
    invoke-virtual {v7}, La/vb8;->invoke()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_8
    :goto_3
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v14

    .line 150
    check-cast v14, La/dpa0;

    .line 151
    .line 152
    move-object/from16 v16, v7

    .line 153
    .line 154
    const/high16 v15, 0x3f000000    # 0.5f

    .line 155
    .line 156
    iget-wide v6, v14, La/dpa0;->c:J

    .line 157
    .line 158
    shr-long/2addr v6, v12

    .line 159
    long-to-int v6, v6

    .line 160
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    iget-wide v8, v13, La/dpa0;->c:J

    .line 165
    .line 166
    move-wide/from16 v17, v8

    .line 167
    .line 168
    shr-long v7, v17, v12

    .line 169
    .line 170
    long-to-int v7, v7

    .line 171
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    sub-float/2addr v6, v7

    .line 176
    iget-wide v7, v14, La/dpa0;->c:J

    .line 177
    .line 178
    const-wide v19, 0xffffffffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    and-long v7, v7, v19

    .line 184
    .line 185
    long-to-int v7, v7

    .line 186
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    and-long v8, v17, v19

    .line 191
    .line 192
    long-to-int v8, v8

    .line 193
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    sub-float/2addr v7, v8

    .line 198
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    iget v8, v0, La/at8;->p:F

    .line 207
    .line 208
    cmpl-float v9, v6, v8

    .line 209
    .line 210
    if-lez v9, :cond_9

    .line 211
    .line 212
    mul-float v9, v6, v15

    .line 213
    .line 214
    cmpl-float v9, v9, v7

    .line 215
    .line 216
    if-lez v9, :cond_9

    .line 217
    .line 218
    move v3, v10

    .line 219
    goto :goto_4

    .line 220
    :cond_9
    cmpl-float v8, v7, v8

    .line 221
    .line 222
    if-lez v8, :cond_a

    .line 223
    .line 224
    mul-float/2addr v7, v15

    .line 225
    cmpl-float v6, v7, v6

    .line 226
    .line 227
    if-lez v6, :cond_a

    .line 228
    .line 229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_a
    :goto_4
    if-eqz v3, :cond_11

    .line 233
    .line 234
    iget-object v6, v0, La/at8;->q:La/d38;

    .line 235
    .line 236
    iget-object v6, v6, La/d38;->b:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v6, La/et8;

    .line 239
    .line 240
    iget-object v6, v6, La/et8;->b:La/zr8;

    .line 241
    .line 242
    if-eqz v6, :cond_b

    .line 243
    .line 244
    invoke-virtual {v6}, La/zr8;->m()V

    .line 245
    .line 246
    .line 247
    iget v7, v6, La/zr8;->L:I

    .line 248
    .line 249
    iput v7, v6, La/zr8;->x:I

    .line 250
    .line 251
    iput-boolean v10, v6, La/zr8;->J:Z

    .line 252
    .line 253
    :cond_b
    shr-long v6, v17, v12

    .line 254
    .line 255
    long-to-int v6, v6

    .line 256
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    iget-object v7, v11, La/j6u0;->a:La/r34;

    .line 261
    .line 262
    iget-object v8, v7, La/r34;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v8, La/i6u0;

    .line 265
    .line 266
    iget-object v9, v8, La/i6u0;->d:[La/zaj;

    .line 267
    .line 268
    invoke-static {v4, v9}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iput v5, v8, La/i6u0;->e:I

    .line 272
    .line 273
    iget-object v8, v7, La/r34;->c:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v8, La/i6u0;

    .line 276
    .line 277
    iget-object v9, v8, La/i6u0;->d:[La/zaj;

    .line 278
    .line 279
    invoke-static {v4, v9}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iput v5, v8, La/i6u0;->e:I

    .line 283
    .line 284
    const-wide/16 v8, 0x0

    .line 285
    .line 286
    iput-wide v8, v7, La/r34;->a:J

    .line 287
    .line 288
    invoke-static {v11, v13}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 289
    .line 290
    .line 291
    move v5, v3

    .line 292
    move v3, v6

    .line 293
    :cond_c
    :goto_5
    sget-object v6, La/xoa0;->b:La/xoa0;

    .line 294
    .line 295
    iput-object v1, v0, La/at8;->n:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v4, v0, La/at8;->j:La/dpa0;

    .line 298
    .line 299
    iput v5, v0, La/at8;->k:I

    .line 300
    .line 301
    iput v3, v0, La/at8;->l:F

    .line 302
    .line 303
    const/4 v7, 0x3

    .line 304
    iput-byte v7, v0, La/at8;->m:B

    .line 305
    .line 306
    invoke-virtual {v1, v6, v0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    if-ne v6, v2, :cond_d

    .line 311
    .line 312
    :goto_6
    return-object v2

    .line 313
    :cond_d
    :goto_7
    check-cast v6, La/woa0;

    .line 314
    .line 315
    iget-object v6, v6, La/woa0;->a:Ljava/util/List;

    .line 316
    .line 317
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    check-cast v6, La/dpa0;

    .line 322
    .line 323
    if-eqz v6, :cond_10

    .line 324
    .line 325
    iget-wide v8, v6, La/dpa0;->c:J

    .line 326
    .line 327
    invoke-virtual {v6}, La/dpa0;->c()Z

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    if-eqz v10, :cond_e

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :cond_e
    invoke-static {v6}, La/x2x;->K(La/dpa0;)Z

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    if-eqz v10, :cond_f

    .line 339
    .line 340
    invoke-static {v11, v6}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 341
    .line 342
    .line 343
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 344
    .line 345
    .line 346
    invoke-static {v1, v1}, La/wpm0;->g(FF)J

    .line 347
    .line 348
    .line 349
    move-result-wide v1

    .line 350
    invoke-virtual {v11, v1, v2}, La/j6u0;->a(J)J

    .line 351
    .line 352
    .line 353
    move-result-wide v1

    .line 354
    new-instance v3, La/g6u0;

    .line 355
    .line 356
    invoke-direct {v3, v1, v2}, La/g6u0;-><init>(J)V

    .line 357
    .line 358
    .line 359
    iget-object v0, v0, La/at8;->s:La/xs8;

    .line 360
    .line 361
    invoke-virtual {v0, v3}, La/xs8;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_f
    shr-long/2addr v8, v12

    .line 366
    long-to-int v8, v8

    .line 367
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    sub-float/2addr v9, v3

    .line 372
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    cmpl-float v8, v8, v15

    .line 381
    .line 382
    if-lez v8, :cond_c

    .line 383
    .line 384
    invoke-static {v11, v6}, La/dqm0;->l(La/j6u0;La/dpa0;)V

    .line 385
    .line 386
    .line 387
    new-instance v8, Ljava/lang/Float;

    .line 388
    .line 389
    invoke-direct {v8, v9}, Ljava/lang/Float;-><init>(F)V

    .line 390
    .line 391
    .line 392
    iget-object v9, v0, La/at8;->t:La/igm;

    .line 393
    .line 394
    invoke-virtual {v9, v6, v8}, La/igm;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    goto :goto_5

    .line 398
    :cond_10
    :goto_8
    invoke-virtual/range {v16 .. v16}, La/vb8;->invoke()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    return-object v0

    .line 404
    :cond_11
    move-object/from16 v7, v16

    .line 405
    .line 406
    const/4 v8, 0x3

    .line 407
    const/4 v9, 0x2

    .line 408
    goto/16 :goto_1
.end method
