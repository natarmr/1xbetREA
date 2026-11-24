.class public final La/jcl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jcl;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/gmq;
    .locals 2

    .line 1
    iget-object p0, p0, La/jcl;->a:La/g45;

    .line 2
    .line 3
    iget-object p0, p0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/i7e;

    .line 6
    .line 7
    iget-object p0, p0, La/i7e;->f:La/p7m0;

    .line 8
    .line 9
    new-instance v0, La/a1t;

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/a1t;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public b(ILa/zje;Z)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, La/jcl;->a:La/g45;

    .line 10
    .line 11
    iget-object v5, v4, La/g45;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, La/i7e;

    .line 14
    .line 15
    instance-of v6, v2, La/dl80;

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    move-object v6, v2

    .line 20
    check-cast v6, La/dl80;

    .line 21
    .line 22
    iget v7, v6, La/dl80;->q:I

    .line 23
    .line 24
    const/high16 v8, -0x80000000

    .line 25
    .line 26
    and-int v9, v7, v8

    .line 27
    .line 28
    if-eqz v9, :cond_0

    .line 29
    .line 30
    sub-int/2addr v7, v8

    .line 31
    iput v7, v6, La/dl80;->q:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v6, La/dl80;

    .line 35
    .line 36
    invoke-direct {v6, v0, v2}, La/dl80;-><init>(La/jcl;La/zje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, v6, La/dl80;->o:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v2, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v7, v6, La/dl80;->q:I

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x2

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x1

    .line 49
    if-eqz v7, :cond_3

    .line 50
    .line 51
    if-eq v7, v11, :cond_2

    .line 52
    .line 53
    if-ne v7, v9, :cond_1

    .line 54
    .line 55
    iget-object v1, v6, La/dl80;->n:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v10

    .line 67
    :cond_2
    iget v1, v6, La/dl80;->m:I

    .line 68
    .line 69
    iget v3, v6, La/dl80;->l:I

    .line 70
    .line 71
    iget v7, v6, La/dl80;->k:I

    .line 72
    .line 73
    iget-byte v10, v6, La/dl80;->j:B

    .line 74
    .line 75
    iget-boolean v11, v6, La/dl80;->i:Z

    .line 76
    .line 77
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move/from16 v22, v10

    .line 81
    .line 82
    move v10, v1

    .line 83
    move/from16 v1, v22

    .line 84
    .line 85
    move/from16 v22, v7

    .line 86
    .line 87
    move v7, v3

    .line 88
    move v3, v11

    .line 89
    :goto_1
    move/from16 v11, v22

    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v5, La/i7e;->k:La/p7m0;

    .line 97
    .line 98
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/util/List;

    .line 103
    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    sget-object v0, La/iun;->a:La/iun;

    .line 107
    .line 108
    :cond_4
    const/4 v7, -0x1

    .line 109
    if-eqz v3, :cond_8

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    invoke-interface {v0, v12}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    if-eqz v12, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    move-object v13, v12

    .line 130
    check-cast v13, La/a640;

    .line 131
    .line 132
    invoke-virtual {v13}, La/a640;->b()I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    if-eq v13, v7, :cond_5

    .line 137
    .line 138
    move-object v10, v12

    .line 139
    :cond_6
    check-cast v10, La/a640;

    .line 140
    .line 141
    if-eqz v10, :cond_7

    .line 142
    .line 143
    invoke-virtual {v10}, La/a640;->b()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    add-int/2addr v0, v11

    .line 148
    :goto_2
    move v7, v0

    .line 149
    goto :goto_3

    .line 150
    :cond_7
    move v7, v11

    .line 151
    goto :goto_3

    .line 152
    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-eqz v12, :cond_a

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    move-object v13, v12

    .line 167
    check-cast v13, La/a640;

    .line 168
    .line 169
    invoke-virtual {v13}, La/a640;->b()I

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-eq v13, v7, :cond_9

    .line 174
    .line 175
    move-object v10, v12

    .line 176
    :cond_a
    check-cast v10, La/a640;

    .line 177
    .line 178
    if-eqz v10, :cond_7

    .line 179
    .line 180
    invoke-virtual {v10}, La/a640;->b()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    goto :goto_2

    .line 185
    :goto_3
    if-eqz v3, :cond_b

    .line 186
    .line 187
    move v0, v7

    .line 188
    goto :goto_4

    .line 189
    :cond_b
    move v0, v11

    .line 190
    :goto_4
    if-eqz v3, :cond_c

    .line 191
    .line 192
    const v10, 0x7fffffff

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_c
    add-int/lit8 v10, v7, -0x1

    .line 197
    .line 198
    :goto_5
    if-eqz v3, :cond_d

    .line 199
    .line 200
    move v12, v8

    .line 201
    goto :goto_6

    .line 202
    :cond_d
    neg-int v12, v1

    .line 203
    :goto_6
    iput-boolean v3, v6, La/dl80;->i:Z

    .line 204
    .line 205
    iput-byte v1, v6, La/dl80;->j:B

    .line 206
    .line 207
    iput v7, v6, La/dl80;->k:I

    .line 208
    .line 209
    iput v0, v6, La/dl80;->l:I

    .line 210
    .line 211
    iput v10, v6, La/dl80;->m:I

    .line 212
    .line 213
    iput v11, v6, La/dl80;->q:I

    .line 214
    .line 215
    invoke-virtual {v4, v7, v12, v1, v6}, La/g45;->r(IIILa/zje;)Ljava/io/Serializable;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    if-ne v11, v2, :cond_e

    .line 220
    .line 221
    goto/16 :goto_b

    .line 222
    .line 223
    :cond_e
    move/from16 v22, v7

    .line 224
    .line 225
    move v7, v0

    .line 226
    move-object v0, v11

    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :goto_7
    check-cast v0, Ljava/lang/Iterable;

    .line 230
    .line 231
    new-instance v12, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    :cond_f
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v13

    .line 244
    if-eqz v13, :cond_10

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    move-object v14, v13

    .line 251
    check-cast v14, La/a640;

    .line 252
    .line 253
    invoke-virtual {v14}, La/a640;->b()I

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    if-gt v7, v14, :cond_f

    .line 258
    .line 259
    if-gt v14, v10, :cond_f

    .line 260
    .line 261
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_10
    iget-object v0, v5, La/i7e;->i:La/p7m0;

    .line 266
    .line 267
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    move-object v13, v0

    .line 272
    check-cast v13, La/gxb;

    .line 273
    .line 274
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, La/a640;

    .line 279
    .line 280
    if-eqz v0, :cond_11

    .line 281
    .line 282
    invoke-virtual {v0}, La/a640;->b()I

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    iget-object v15, v13, La/gxb;->j:La/vxy;

    .line 287
    .line 288
    iget v15, v15, La/vxy;->a:I

    .line 289
    .line 290
    if-le v14, v15, :cond_11

    .line 291
    .line 292
    new-instance v14, La/vxy;

    .line 293
    .line 294
    invoke-virtual {v0}, La/a640;->b()I

    .line 295
    .line 296
    .line 297
    move-result v15

    .line 298
    invoke-virtual {v0}, La/a640;->e()La/xrt0;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    instance-of v0, v0, La/srt0;

    .line 303
    .line 304
    invoke-direct {v14, v15, v0}, La/vxy;-><init>(IZ)V

    .line 305
    .line 306
    .line 307
    const/16 v21, 0x1ff

    .line 308
    .line 309
    move-object/from16 v20, v14

    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const/4 v15, 0x0

    .line 313
    const/16 v16, 0x0

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const/16 v18, 0x0

    .line 318
    .line 319
    const/16 v19, 0x0

    .line 320
    .line 321
    invoke-static/range {v13 .. v21}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v4, v0}, La/g45;->j0(La/gxb;)V

    .line 326
    .line 327
    .line 328
    :cond_11
    iget-object v0, v5, La/i7e;->k:La/p7m0;

    .line 329
    .line 330
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Ljava/util/List;

    .line 335
    .line 336
    if-nez v0, :cond_12

    .line 337
    .line 338
    sget-object v0, La/iun;->a:La/iun;

    .line 339
    .line 340
    :cond_12
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-eqz v3, :cond_13

    .line 345
    .line 346
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_13
    invoke-virtual {v0, v8, v12}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 351
    .line 352
    .line 353
    :goto_9
    new-instance v5, Ljava/util/HashSet;

    .line 354
    .line 355
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 356
    .line 357
    .line 358
    new-instance v8, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :cond_14
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    if-eqz v13, :cond_15

    .line 372
    .line 373
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v13

    .line 377
    move-object v14, v13

    .line 378
    check-cast v14, La/a640;

    .line 379
    .line 380
    invoke-virtual {v14}, La/a640;->b()I

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    new-instance v15, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-direct {v15, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v14

    .line 393
    if-eqz v14, :cond_14

    .line 394
    .line 395
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    goto :goto_a

    .line 399
    :cond_15
    iput-object v12, v6, La/dl80;->n:Ljava/util/ArrayList;

    .line 400
    .line 401
    iput-boolean v3, v6, La/dl80;->i:Z

    .line 402
    .line 403
    iput-byte v1, v6, La/dl80;->j:B

    .line 404
    .line 405
    iput v11, v6, La/dl80;->k:I

    .line 406
    .line 407
    iput v7, v6, La/dl80;->l:I

    .line 408
    .line 409
    iput v10, v6, La/dl80;->m:I

    .line 410
    .line 411
    iput v9, v6, La/dl80;->q:I

    .line 412
    .line 413
    invoke-virtual {v4, v8}, La/g45;->l0(Ljava/util/List;)Lkotlin/Unit;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    if-ne v0, v2, :cond_16

    .line 418
    .line 419
    :goto_b
    return-object v2

    .line 420
    :cond_16
    return-object v12
.end method

.method public c(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/tox;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/tox;

    .line 7
    .line 8
    iget v1, v0, La/tox;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/tox;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tox;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/tox;-><init>(La/jcl;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/tox;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/tox;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    iget-object p0, p0, La/jcl;->a:La/g45;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v3, v0, La/tox;->k:I

    .line 53
    .line 54
    iget-object p1, p0, La/g45;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/vae;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/vae;->i(La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_1
    if-ne p1, v1, :cond_4

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_4
    :goto_2
    iget-object p1, p0, La/g45;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, La/i7e;

    .line 73
    .line 74
    iget-object p1, p1, La/i7e;->i:La/p7m0;

    .line 75
    .line 76
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    move-object v0, p1

    .line 81
    check-cast v0, La/gxb;

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    const/16 v8, 0x3fd

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    const/4 v2, 0x0

    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-static/range {v0 .. v8}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, La/g45;->j0(La/gxb;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0
.end method
