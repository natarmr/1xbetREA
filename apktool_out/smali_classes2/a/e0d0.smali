.class public final La/e0d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/vjj;

.field public b:La/gm40;

.field public c:La/tek;

.field public d:La/d0d0;

.field public e:I

.field public f:La/vzs0;

.field public g:Z

.field public final h:La/c8z;

.field public final i:La/g950;

.field public final j:La/wsy;

.field public final synthetic k:La/f0d0;


# direct methods
.method public constructor <init>(La/f0d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/e0d0;->k:La/f0d0;

    .line 5
    .line 6
    invoke-virtual {p1}, La/yjj;->j()La/vjj;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/e0d0;->a:La/vjj;

    .line 11
    .line 12
    invoke-virtual {p1}, La/f0d0;->m()La/gm40;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/e0d0;->b:La/gm40;

    .line 17
    .line 18
    invoke-virtual {p1}, La/f0d0;->getVisibility()La/tek;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/e0d0;->c:La/tek;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, La/e0d0;->d:La/d0d0;

    .line 26
    .line 27
    invoke-virtual {p1}, La/f0d0;->l()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, La/e0d0;->e:I

    .line 32
    .line 33
    sget-object v0, La/vzs0;->a:La/uzs0;

    .line 34
    .line 35
    iput-object v0, p0, La/e0d0;->f:La/vzs0;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, La/e0d0;->g:Z

    .line 39
    .line 40
    iget-object v0, p1, La/f0d0;->u:La/c8z;

    .line 41
    .line 42
    iput-object v0, p0, La/e0d0;->h:La/c8z;

    .line 43
    .line 44
    invoke-virtual {p1}, La/wjj;->getName()La/g950;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/e0d0;->i:La/g950;

    .line 49
    .line 50
    invoke-virtual {p1}, La/s3u0;->getType()La/wsy;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, La/e0d0;->j:La/wsy;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a()La/f0d0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, La/e0d0;->a:La/vjj;

    .line 4
    .line 5
    iget-object v3, v0, La/e0d0;->b:La/gm40;

    .line 6
    .line 7
    iget-object v4, v0, La/e0d0;->c:La/tek;

    .line 8
    .line 9
    iget-object v5, v0, La/e0d0;->d:La/d0d0;

    .line 10
    .line 11
    iget v6, v0, La/e0d0;->e:I

    .line 12
    .line 13
    iget-object v7, v0, La/e0d0;->i:La/g950;

    .line 14
    .line 15
    iget-object v1, v0, La/e0d0;->k:La/f0d0;

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, La/f0d0;->r1(La/vjj;La/gm40;La/tek;La/d0d0;ILa/g950;)La/f0d0;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    invoke-virtual {v1}, La/f0d0;->getTypeParameters()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v10, Ljava/util/ArrayList;

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v0, La/e0d0;->f:La/vzs0;

    .line 38
    .line 39
    invoke-static {v2, v3, v9, v10}, La/vdb;->k0(Ljava/util/List;La/vzs0;La/vjj;Ljava/util/ArrayList;)La/xzs0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, La/t3u0;->e:La/t3u0;

    .line 44
    .line 45
    iget-object v4, v0, La/e0d0;->j:La/wsy;

    .line 46
    .line 47
    invoke-virtual {v2, v4, v3}, La/xzs0;->h(La/wsy;La/t3u0;)La/wsy;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v5, 0x0

    .line 52
    if-nez v3, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object v6, La/t3u0;->d:La/t3u0;

    .line 56
    .line 57
    invoke-virtual {v2, v4, v6}, La/xzs0;->h(La/wsy;La/t3u0;)La/wsy;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    invoke-virtual {v9, v4}, La/f0d0;->v1(La/wsy;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v4, v0, La/e0d0;->h:La/c8z;

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v4, v2}, La/c8z;->q1(La/xzs0;)La/c8z;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-nez v4, :cond_2

    .line 75
    .line 76
    :goto_0
    return-object v5

    .line 77
    :cond_2
    move-object v11, v4

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v11, v5

    .line 80
    :goto_1
    iget-object v4, v1, La/f0d0;->v:La/c8z;

    .line 81
    .line 82
    if-eqz v4, :cond_5

    .line 83
    .line 84
    invoke-virtual {v4}, La/c8z;->getType()La/wsy;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v2, v7, v6}, La/xzs0;->h(La/wsy;La/t3u0;)La/wsy;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-nez v6, :cond_4

    .line 93
    .line 94
    move-object v7, v5

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    new-instance v7, La/c8z;

    .line 97
    .line 98
    new-instance v8, La/lso;

    .line 99
    .line 100
    invoke-virtual {v4}, La/c8z;->p1()La/vde0;

    .line 101
    .line 102
    .line 103
    invoke-direct {v8, v9, v6}, La/lso;-><init>(La/kp9;La/wsy;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, La/p4;->getAnnotations()La/g93;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-direct {v7, v9, v8, v4}, La/c8z;-><init>(La/vjj;La/p4;La/g93;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    move-object v12, v7

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move-object v12, v5

    .line 116
    :goto_3
    new-instance v13, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    iget-object v4, v1, La/f0d0;->t:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_8

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    check-cast v6, La/c8z;

    .line 138
    .line 139
    invoke-virtual {v6}, La/c8z;->getType()La/wsy;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    sget-object v8, La/t3u0;->d:La/t3u0;

    .line 144
    .line 145
    invoke-virtual {v2, v7, v8}, La/xzs0;->h(La/wsy;La/t3u0;)La/wsy;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    if-nez v7, :cond_7

    .line 150
    .line 151
    move-object v8, v5

    .line 152
    goto :goto_5

    .line 153
    :cond_7
    new-instance v8, La/c8z;

    .line 154
    .line 155
    new-instance v14, La/mje;

    .line 156
    .line 157
    invoke-virtual {v6}, La/c8z;->p1()La/vde0;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    check-cast v15, La/mje;

    .line 162
    .line 163
    invoke-virtual {v15}, La/mje;->n1()La/g950;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    invoke-virtual {v6}, La/c8z;->p1()La/vde0;

    .line 168
    .line 169
    .line 170
    invoke-direct {v14, v9, v7, v15}, La/mje;-><init>(La/kp9;La/wsy;La/g950;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, La/p4;->getAnnotations()La/g93;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-direct {v8, v9, v14, v6}, La/c8z;-><init>(La/vjj;La/p4;La/g93;)V

    .line 178
    .line 179
    .line 180
    :goto_5
    if-eqz v8, :cond_6

    .line 181
    .line 182
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    move-object v8, v9

    .line 187
    move-object v9, v3

    .line 188
    invoke-virtual/range {v8 .. v13}, La/f0d0;->w1(La/wsy;Ljava/util/List;La/c8z;La/c8z;Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    move-object v9, v8

    .line 192
    iget-object v3, v1, La/f0d0;->x:La/g0d0;

    .line 193
    .line 194
    const/4 v4, 0x2

    .line 195
    sget-object v18, La/gmk0;->x0:La/gne0;

    .line 196
    .line 197
    if-nez v3, :cond_9

    .line 198
    .line 199
    move-object v3, v5

    .line 200
    goto :goto_8

    .line 201
    :cond_9
    new-instance v8, La/g0d0;

    .line 202
    .line 203
    invoke-virtual {v3}, La/p4;->getAnnotations()La/g93;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    iget-object v11, v0, La/e0d0;->b:La/gm40;

    .line 208
    .line 209
    iget-object v3, v1, La/f0d0;->x:La/g0d0;

    .line 210
    .line 211
    invoke-virtual {v3}, La/b0d0;->getVisibility()La/tek;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    iget v6, v0, La/e0d0;->e:I

    .line 216
    .line 217
    if-ne v6, v4, :cond_a

    .line 218
    .line 219
    iget-object v6, v3, La/tek;->a:La/xj;

    .line 220
    .line 221
    invoke-virtual {v6}, La/xj;->m()La/xj;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-static {v6}, La/uek;->f(La/xj;)La/tek;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-static {v6}, La/uek;->e(La/tek;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_a

    .line 234
    .line 235
    sget-object v3, La/uek;->h:La/tek;

    .line 236
    .line 237
    :cond_a
    move-object v12, v3

    .line 238
    iget-object v3, v1, La/f0d0;->x:La/g0d0;

    .line 239
    .line 240
    iget-boolean v13, v3, La/b0d0;->f:Z

    .line 241
    .line 242
    iget-boolean v14, v3, La/b0d0;->g:Z

    .line 243
    .line 244
    iget-boolean v15, v3, La/b0d0;->j:Z

    .line 245
    .line 246
    iget v3, v0, La/e0d0;->e:I

    .line 247
    .line 248
    iget-object v6, v0, La/e0d0;->d:La/d0d0;

    .line 249
    .line 250
    if-nez v6, :cond_b

    .line 251
    .line 252
    move-object/from16 v17, v5

    .line 253
    .line 254
    :goto_6
    move/from16 v16, v3

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_b
    invoke-interface {v6}, La/d0d0;->d()La/g0d0;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    move-object/from16 v17, v6

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :goto_7
    invoke-direct/range {v8 .. v18}, La/g0d0;-><init>(La/d0d0;La/g93;La/gm40;La/tek;ZZZILa/g0d0;La/gmk0;)V

    .line 265
    .line 266
    .line 267
    move-object v3, v8

    .line 268
    :goto_8
    if-eqz v3, :cond_d

    .line 269
    .line 270
    iget-object v6, v1, La/f0d0;->x:La/g0d0;

    .line 271
    .line 272
    iget-object v7, v6, La/g0d0;->n:La/wsy;

    .line 273
    .line 274
    invoke-static {v2, v6}, La/f0d0;->s1(La/xzs0;La/b0d0;)La/mer;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    iput-object v6, v3, La/b0d0;->m:La/mer;

    .line 279
    .line 280
    if-eqz v7, :cond_c

    .line 281
    .line 282
    sget-object v6, La/t3u0;->e:La/t3u0;

    .line 283
    .line 284
    invoke-virtual {v2, v7, v6}, La/xzs0;->h(La/wsy;La/t3u0;)La/wsy;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    goto :goto_9

    .line 289
    :cond_c
    move-object v6, v5

    .line 290
    :goto_9
    invoke-virtual {v3, v6}, La/g0d0;->s1(La/wsy;)V

    .line 291
    .line 292
    .line 293
    :cond_d
    iget-object v6, v1, La/f0d0;->y:La/n0d0;

    .line 294
    .line 295
    if-nez v6, :cond_e

    .line 296
    .line 297
    move-object v11, v5

    .line 298
    goto :goto_c

    .line 299
    :cond_e
    new-instance v8, La/n0d0;

    .line 300
    .line 301
    invoke-virtual {v6}, La/p4;->getAnnotations()La/g93;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    iget-object v11, v0, La/e0d0;->b:La/gm40;

    .line 306
    .line 307
    iget-object v6, v1, La/f0d0;->y:La/n0d0;

    .line 308
    .line 309
    invoke-virtual {v6}, La/b0d0;->getVisibility()La/tek;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    iget v7, v0, La/e0d0;->e:I

    .line 314
    .line 315
    if-ne v7, v4, :cond_f

    .line 316
    .line 317
    iget-object v4, v6, La/tek;->a:La/xj;

    .line 318
    .line 319
    invoke-virtual {v4}, La/xj;->m()La/xj;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-static {v4}, La/uek;->f(La/xj;)La/tek;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-static {v4}, La/uek;->e(La/tek;)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eqz v4, :cond_f

    .line 332
    .line 333
    sget-object v6, La/uek;->h:La/tek;

    .line 334
    .line 335
    :cond_f
    move-object v12, v6

    .line 336
    iget-object v4, v1, La/f0d0;->y:La/n0d0;

    .line 337
    .line 338
    iget-boolean v13, v4, La/b0d0;->f:Z

    .line 339
    .line 340
    iget-boolean v14, v4, La/b0d0;->g:Z

    .line 341
    .line 342
    iget-boolean v15, v4, La/b0d0;->j:Z

    .line 343
    .line 344
    iget v4, v0, La/e0d0;->e:I

    .line 345
    .line 346
    iget-object v6, v0, La/e0d0;->d:La/d0d0;

    .line 347
    .line 348
    if-nez v6, :cond_10

    .line 349
    .line 350
    move-object/from16 v17, v5

    .line 351
    .line 352
    :goto_a
    move/from16 v16, v4

    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_10
    invoke-interface {v6}, La/d0d0;->e()La/n0d0;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    move-object/from16 v17, v6

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :goto_b
    invoke-direct/range {v8 .. v18}, La/n0d0;-><init>(La/d0d0;La/g93;La/gm40;La/tek;ZZZILa/n0d0;La/gmk0;)V

    .line 363
    .line 364
    .line 365
    move-object v11, v8

    .line 366
    :goto_c
    if-eqz v11, :cond_14

    .line 367
    .line 368
    iget-object v4, v1, La/f0d0;->y:La/n0d0;

    .line 369
    .line 370
    invoke-virtual {v4}, La/n0d0;->z()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v12

    .line 374
    const/4 v15, 0x0

    .line 375
    const/16 v16, 0x0

    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    move-object v13, v2

    .line 379
    invoke-static/range {v11 .. v16}, La/oer;->s1(La/mer;Ljava/util/List;La/xzs0;ZZ[Z)Ljava/util/ArrayList;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    const/4 v4, 0x0

    .line 384
    if-nez v2, :cond_11

    .line 385
    .line 386
    iget-object v2, v0, La/e0d0;->a:La/vjj;

    .line 387
    .line 388
    invoke-static {v2}, La/rek;->e(La/vjj;)La/ary;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v2}, La/ary;->o()La/kzj0;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    iget-object v6, v1, La/f0d0;->y:La/n0d0;

    .line 397
    .line 398
    invoke-virtual {v6}, La/n0d0;->z()Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    check-cast v6, La/k3u0;

    .line 407
    .line 408
    invoke-virtual {v6}, La/p4;->getAnnotations()La/g93;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    invoke-static {v11, v2, v6}, La/n0d0;->r1(La/n0d0;La/wsy;La/g93;)La/k3u0;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    :cond_11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    const/4 v7, 0x1

    .line 425
    if-ne v6, v7, :cond_13

    .line 426
    .line 427
    iget-object v6, v1, La/f0d0;->y:La/n0d0;

    .line 428
    .line 429
    invoke-static {v13, v6}, La/f0d0;->s1(La/xzs0;La/b0d0;)La/mer;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    iput-object v6, v11, La/b0d0;->m:La/mer;

    .line 434
    .line 435
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    check-cast v2, La/k3u0;

    .line 440
    .line 441
    if-eqz v2, :cond_12

    .line 442
    .line 443
    iput-object v2, v11, La/n0d0;->n:La/k3u0;

    .line 444
    .line 445
    goto :goto_d

    .line 446
    :cond_12
    const/4 v0, 0x6

    .line 447
    invoke-static {v0}, La/n0d0;->k0(I)V

    .line 448
    .line 449
    .line 450
    throw v5

    .line 451
    :cond_13
    invoke-static {}, La/v4i0;->e()V

    .line 452
    .line 453
    .line 454
    return-object v5

    .line 455
    :cond_14
    move-object v13, v2

    .line 456
    :goto_d
    iget-object v2, v1, La/f0d0;->z:La/tqp;

    .line 457
    .line 458
    if-nez v2, :cond_15

    .line 459
    .line 460
    move-object v4, v5

    .line 461
    goto :goto_e

    .line 462
    :cond_15
    new-instance v4, La/tqp;

    .line 463
    .line 464
    invoke-virtual {v2}, La/p4;->getAnnotations()La/g93;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-direct {v4, v2, v9}, La/tqp;-><init>(La/g93;La/f0d0;)V

    .line 469
    .line 470
    .line 471
    :goto_e
    iget-object v2, v1, La/f0d0;->A:La/tqp;

    .line 472
    .line 473
    if-nez v2, :cond_16

    .line 474
    .line 475
    goto :goto_f

    .line 476
    :cond_16
    new-instance v5, La/tqp;

    .line 477
    .line 478
    invoke-virtual {v2}, La/p4;->getAnnotations()La/g93;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-direct {v5, v2, v9}, La/tqp;-><init>(La/g93;La/f0d0;)V

    .line 483
    .line 484
    .line 485
    :goto_f
    invoke-virtual {v9, v3, v11, v4, v5}, La/f0d0;->t1(La/g0d0;La/n0d0;La/tqp;La/tqp;)V

    .line 486
    .line 487
    .line 488
    iget-boolean v0, v0, La/e0d0;->g:Z

    .line 489
    .line 490
    if-eqz v0, :cond_18

    .line 491
    .line 492
    new-instance v0, La/nbk0;

    .line 493
    .line 494
    invoke-direct {v0}, La/g4;-><init>()V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v1}, La/f0d0;->k()Ljava/util/Collection;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-eqz v3, :cond_17

    .line 510
    .line 511
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    check-cast v3, La/d0d0;

    .line 516
    .line 517
    invoke-interface {v3, v13}, La/d0d0;->f(La/xzs0;)La/d0d0;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-virtual {v0, v3}, La/nbk0;->add(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    goto :goto_10

    .line 525
    :cond_17
    iput-object v0, v9, La/f0d0;->l:Ljava/util/Collection;

    .line 526
    .line 527
    :cond_18
    invoke-virtual {v1}, La/f0d0;->N()Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_19

    .line 532
    .line 533
    iget-object v0, v1, La/f0d0;->i:Lkotlin/jvm/functions/Function0;

    .line 534
    .line 535
    if-eqz v0, :cond_19

    .line 536
    .line 537
    iget-object v1, v1, La/f0d0;->h:La/bu00;

    .line 538
    .line 539
    invoke-virtual {v9, v1, v0}, La/f0d0;->u1(La/bu00;Lkotlin/jvm/functions/Function0;)V

    .line 540
    .line 541
    .line 542
    :cond_19
    return-object v9
.end method
