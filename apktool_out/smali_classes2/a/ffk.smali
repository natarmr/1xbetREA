.class public final La/ffk;
.super La/h1;
.source "SourceFile"

# interfaces
.implements La/vjj;


# instance fields
.field public final e:La/s2d0;

.field public final f:La/e28;

.field public final g:La/gmk0;

.field public final h:La/qlc;

.field public final i:La/gm40;

.field public final j:La/tek;

.field public final k:La/slc;

.field public final l:La/g45;

.field public final m:La/cr30;

.field public final n:La/efk;

.field public final o:La/c3h0;

.field public final p:La/ali;

.field public final q:La/vjj;

.field public final r:La/bu00;

.field public final s:La/cu00;

.field public final t:La/bu00;

.field public final u:La/p4d0;

.field public final v:La/g93;


# direct methods
.method public constructor <init>(La/g45;La/s2d0;La/h950;La/e28;La/gmk0;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, La/g45;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, La/f6i;

    .line 27
    .line 28
    iget-object v2, v2, La/f6i;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, La/eu00;

    .line 31
    .line 32
    iget v4, v8, La/s2d0;->e:I

    .line 33
    .line 34
    invoke-static {v3, v4}, La/ydx;->K(La/h950;I)La/qlc;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, La/qlc;->f()La/g950;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-direct {v1, v2, v4}, La/h1;-><init>(La/eu00;La/g950;)V

    .line 43
    .line 44
    .line 45
    iput-object v8, v1, La/ffk;->e:La/s2d0;

    .line 46
    .line 47
    move-object/from16 v6, p4

    .line 48
    .line 49
    iput-object v6, v1, La/ffk;->f:La/e28;

    .line 50
    .line 51
    move-object/from16 v9, p5

    .line 52
    .line 53
    iput-object v9, v1, La/ffk;->g:La/gmk0;

    .line 54
    .line 55
    iget v2, v8, La/s2d0;->e:I

    .line 56
    .line 57
    invoke-static {v3, v2}, La/ydx;->K(La/h950;I)La/qlc;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v2, v1, La/ffk;->h:La/qlc;

    .line 62
    .line 63
    sget-object v2, La/njq;->e:La/ljq;

    .line 64
    .line 65
    iget v4, v8, La/s2d0;->d:I

    .line 66
    .line 67
    invoke-virtual {v2, v4}, La/ljq;->e(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, La/k3d0;

    .line 72
    .line 73
    invoke-static {v2}, La/lwf;->a(La/k3d0;)La/gm40;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iput-object v2, v1, La/ffk;->i:La/gm40;

    .line 78
    .line 79
    sget-object v2, La/njq;->d:La/ljq;

    .line 80
    .line 81
    iget v4, v8, La/s2d0;->d:I

    .line 82
    .line 83
    invoke-virtual {v2, v4}, La/ljq;->e(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/o4d0;

    .line 88
    .line 89
    invoke-static {v2}, La/l8x;->V(La/o4d0;)La/tek;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iput-object v2, v1, La/ffk;->j:La/tek;

    .line 94
    .line 95
    sget-object v2, La/njq;->f:La/ljq;

    .line 96
    .line 97
    iget v4, v8, La/s2d0;->d:I

    .line 98
    .line 99
    invoke-virtual {v2, v4}, La/ljq;->e(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, La/r2d0;

    .line 104
    .line 105
    if-nez v2, :cond_0

    .line 106
    .line 107
    const/4 v2, -0x1

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    sget-object v4, La/u4d0;->b:[I

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    aget v2, v4, v2

    .line 116
    .line 117
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 118
    .line 119
    .line 120
    sget-object v2, La/slc;->a:La/slc;

    .line 121
    .line 122
    :goto_1
    move-object v10, v2

    .line 123
    goto :goto_2

    .line 124
    :pswitch_0
    sget-object v2, La/slc;->f:La/slc;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :pswitch_1
    sget-object v2, La/slc;->e:La/slc;

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :pswitch_2
    sget-object v2, La/slc;->d:La/slc;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :pswitch_3
    sget-object v2, La/slc;->c:La/slc;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_4
    sget-object v2, La/slc;->b:La/slc;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_5
    sget-object v2, La/slc;->a:La/slc;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :goto_2
    iput-object v10, v1, La/ffk;->k:La/slc;

    .line 143
    .line 144
    iget-object v2, v8, La/s2d0;->g:Ljava/util/List;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v4, La/roi0;

    .line 150
    .line 151
    iget-object v5, v8, La/s2d0;->A:La/g4d0;

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-direct {v4, v5}, La/roi0;-><init>(La/g4d0;)V

    .line 157
    .line 158
    .line 159
    sget-object v5, La/xbu0;->b:La/xbu0;

    .line 160
    .line 161
    iget-object v5, v8, La/s2d0;->Y:La/n4d0;

    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v5}, La/tnq0;->j(La/n4d0;)La/xbu0;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual/range {v0 .. v6}, La/g45;->h(La/vjj;Ljava/util/List;La/h950;La/roi0;La/xbu0;La/e28;)La/g45;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    move-object v12, v0

    .line 175
    iget-object v0, v11, La/g45;->a:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, La/f6i;

    .line 178
    .line 179
    iget-object v2, v0, La/f6i;->e:Ljava/lang/Object;

    .line 180
    .line 181
    move-object v13, v2

    .line 182
    check-cast v13, La/eu00;

    .line 183
    .line 184
    iput-object v11, v1, La/ffk;->l:La/g45;

    .line 185
    .line 186
    sget-object v2, La/njq;->m:La/kjq;

    .line 187
    .line 188
    iget v3, v8, La/s2d0;->d:I

    .line 189
    .line 190
    invoke-virtual {v2, v3}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    new-instance v3, La/dfk;

    .line 199
    .line 200
    invoke-direct {v3, v1}, La/dfk;-><init>(La/ffk;)V

    .line 201
    .line 202
    .line 203
    sget-object v14, La/slc;->c:La/slc;

    .line 204
    .line 205
    const/4 v15, 0x2

    .line 206
    const/4 v4, 0x1

    .line 207
    const/4 v5, 0x0

    .line 208
    if-ne v10, v14, :cond_3

    .line 209
    .line 210
    if-nez v2, :cond_2

    .line 211
    .line 212
    iget-object v2, v0, La/f6i;->u:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v2, La/b0o;

    .line 215
    .line 216
    invoke-interface {v2}, La/b0o;->b0()Ljava/lang/Boolean;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_1

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_1
    move v2, v5

    .line 230
    goto :goto_4

    .line 231
    :cond_2
    :goto_3
    move v2, v4

    .line 232
    :goto_4
    invoke-virtual {v1}, La/h1;->getName()La/g950;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-virtual {v6}, La/g950;->b()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    new-instance v7, La/y8m0;

    .line 244
    .line 245
    invoke-direct {v7, v13, v1, v2}, La/y8m0;-><init>(La/eu00;La/ffk;Z)V

    .line 246
    .line 247
    .line 248
    new-array v2, v15, [La/cr30;

    .line 249
    .line 250
    aput-object v3, v2, v5

    .line 251
    .line 252
    aput-object v7, v2, v4

    .line 253
    .line 254
    invoke-static {v2}, La/tx3;->s([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-static {v6, v2}, La/obb;->L(Ljava/lang/String;Ljava/lang/Iterable;)La/cr30;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    :cond_3
    iput-object v3, v1, La/ffk;->m:La/cr30;

    .line 263
    .line 264
    new-instance v2, La/efk;

    .line 265
    .line 266
    invoke-direct {v2, v1}, La/efk;-><init>(La/ffk;)V

    .line 267
    .line 268
    .line 269
    iput-object v2, v1, La/ffk;->n:La/efk;

    .line 270
    .line 271
    sget-object v16, La/c3h0;->d:La/zie0;

    .line 272
    .line 273
    iget-object v0, v0, La/f6i;->s:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, La/km50;

    .line 276
    .line 277
    check-cast v0, La/lm50;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v0, La/y6h;

    .line 283
    .line 284
    const/4 v6, 0x0

    .line 285
    const/16 v7, 0x18

    .line 286
    .line 287
    const/4 v1, 0x1

    .line 288
    const-class v3, La/cfk;

    .line 289
    .line 290
    move v2, v4

    .line 291
    const-string v4, "<init>"

    .line 292
    .line 293
    move/from16 v17, v5

    .line 294
    .line 295
    const-string v5, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;)V"

    .line 296
    .line 297
    move-object/from16 v2, p0

    .line 298
    .line 299
    move/from16 v15, v17

    .line 300
    .line 301
    invoke-direct/range {v0 .. v7}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 302
    .line 303
    .line 304
    move-object v6, v2

    .line 305
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v1, La/c3h0;

    .line 312
    .line 313
    invoke-direct {v1, v6, v13, v0}, La/c3h0;-><init>(La/h1;La/eu00;Lkotlin/jvm/functions/Function1;)V

    .line 314
    .line 315
    .line 316
    iput-object v1, v6, La/ffk;->o:La/c3h0;

    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    if-ne v10, v14, :cond_4

    .line 320
    .line 321
    new-instance v1, La/ali;

    .line 322
    .line 323
    invoke-direct {v1, v6}, La/ali;-><init>(La/ffk;)V

    .line 324
    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_4
    move-object v1, v0

    .line 328
    :goto_5
    iput-object v1, v6, La/ffk;->p:La/ali;

    .line 329
    .line 330
    iget-object v1, v12, La/g45;->c:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v1, La/vjj;

    .line 333
    .line 334
    iput-object v1, v6, La/ffk;->q:La/vjj;

    .line 335
    .line 336
    new-instance v2, La/yek;

    .line 337
    .line 338
    invoke-direct {v2, v6, v15}, La/yek;-><init>(La/ffk;B)V

    .line 339
    .line 340
    .line 341
    new-instance v3, La/bu00;

    .line 342
    .line 343
    invoke-direct {v3, v13, v2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 344
    .line 345
    .line 346
    iput-object v3, v6, La/ffk;->r:La/bu00;

    .line 347
    .line 348
    new-instance v2, La/yek;

    .line 349
    .line 350
    const/4 v3, 0x1

    .line 351
    invoke-direct {v2, v6, v3}, La/yek;-><init>(La/ffk;B)V

    .line 352
    .line 353
    .line 354
    new-instance v3, La/cu00;

    .line 355
    .line 356
    invoke-direct {v3, v13, v2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 357
    .line 358
    .line 359
    iput-object v3, v6, La/ffk;->s:La/cu00;

    .line 360
    .line 361
    new-instance v2, La/yek;

    .line 362
    .line 363
    const/4 v3, 0x2

    .line 364
    invoke-direct {v2, v6, v3}, La/yek;-><init>(La/ffk;B)V

    .line 365
    .line 366
    .line 367
    new-instance v3, La/bu00;

    .line 368
    .line 369
    invoke-direct {v3, v13, v2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 370
    .line 371
    .line 372
    new-instance v2, La/yek;

    .line 373
    .line 374
    const/4 v3, 0x3

    .line 375
    invoke-direct {v2, v6, v3}, La/yek;-><init>(La/ffk;B)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v13, v2}, La/eu00;->b(Lkotlin/jvm/functions/Function0;)La/cu00;

    .line 379
    .line 380
    .line 381
    new-instance v2, La/yek;

    .line 382
    .line 383
    const/4 v3, 0x4

    .line 384
    invoke-direct {v2, v6, v3}, La/yek;-><init>(La/ffk;B)V

    .line 385
    .line 386
    .line 387
    new-instance v3, La/bu00;

    .line 388
    .line 389
    invoke-direct {v3, v13, v2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 390
    .line 391
    .line 392
    iput-object v3, v6, La/ffk;->t:La/bu00;

    .line 393
    .line 394
    move-object v2, v0

    .line 395
    new-instance v0, La/p4d0;

    .line 396
    .line 397
    iget-object v3, v11, La/g45;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v3, La/h950;

    .line 400
    .line 401
    iget-object v4, v11, La/g45;->d:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v4, La/roi0;

    .line 404
    .line 405
    instance-of v5, v1, La/ffk;

    .line 406
    .line 407
    if-eqz v5, :cond_5

    .line 408
    .line 409
    check-cast v1, La/ffk;

    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_5
    move-object v1, v2

    .line 413
    :goto_6
    if-eqz v1, :cond_6

    .line 414
    .line 415
    iget-object v1, v1, La/ffk;->u:La/p4d0;

    .line 416
    .line 417
    move-object v5, v1

    .line 418
    :goto_7
    move-object v2, v3

    .line 419
    move-object v3, v4

    .line 420
    move-object v1, v8

    .line 421
    move-object v4, v9

    .line 422
    goto :goto_8

    .line 423
    :cond_6
    move-object v5, v2

    .line 424
    goto :goto_7

    .line 425
    :goto_8
    invoke-direct/range {v0 .. v5}, La/p4d0;-><init>(La/s2d0;La/h950;La/roi0;La/gmk0;La/p4d0;)V

    .line 426
    .line 427
    .line 428
    iput-object v0, v6, La/ffk;->u:La/p4d0;

    .line 429
    .line 430
    sget-object v0, La/njq;->c:La/kjq;

    .line 431
    .line 432
    iget v1, v1, La/s2d0;->d:I

    .line 433
    .line 434
    invoke-virtual {v0, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-nez v0, :cond_7

    .line 443
    .line 444
    sget-object v0, La/ujn;->c:La/f93;

    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_7
    new-instance v0, La/b660;

    .line 448
    .line 449
    new-instance v1, La/yek;

    .line 450
    .line 451
    const/4 v2, 0x5

    .line 452
    invoke-direct {v1, v6, v2}, La/yek;-><init>(La/ffk;B)V

    .line 453
    .line 454
    .line 455
    invoke-direct {v0, v13, v1}, La/b660;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 456
    .line 457
    .line 458
    :goto_9
    iput-object v0, v6, La/ffk;->v:La/g93;

    .line 459
    .line 460
    return-void

    .line 461
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final L()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->l:La/g45;

    .line 2
    .line 3
    iget-object p0, p0, La/g45;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/qgd;

    .line 6
    .line 7
    invoke-virtual {p0}, La/qgd;->E()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final Q()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->j:La/kjq;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget p0, p0, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final U()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->m:La/cr30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/gmk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->g:La/gmk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->s:La/cu00;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->v:La/g93;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()La/tek;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->j:La/tek;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->n:La/efk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->g:La/kjq;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget p0, p0, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final isExternal()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->i:La/kjq;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget p0, p0, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final isInline()Z
    .locals 3

    .line 1
    sget-object v0, La/njq;->k:La/kjq;

    .line 2
    .line 3
    iget-object v1, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget v1, v1, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget-object p0, p0, La/ffk;->f:La/e28;

    .line 18
    .line 19
    iget v0, p0, La/e28;->b:I

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-le v0, v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget v0, p0, La/e28;->c:I

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    if-ge v0, v2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-le v0, v2, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget p0, p0, La/e28;->d:I

    .line 38
    .line 39
    if-gt p0, v1, :cond_4

    .line 40
    .line 41
    :goto_0
    return v1

    .line 42
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final j()La/vjj;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->q:La/vjj;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l0(La/cty;)La/cr30;
    .locals 1

    .line 1
    iget-object p0, p0, La/ffk;->o:La/c3h0;

    .line 2
    .line 3
    iget-object p1, p0, La/c3h0;->a:La/h1;

    .line 4
    .line 5
    sget v0, La/rek;->a:I

    .line 6
    .line 7
    invoke-static {p1}, La/oek;->c(La/vjj;)La/ym40;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/c3h0;->c:La/cu00;

    .line 15
    .line 16
    sget-object p1, La/c3h0;->e:[La/iiy;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    invoke-static {p0, p1}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/cr30;

    .line 26
    .line 27
    return-object p0
.end method

.method public final m()La/gm40;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->i:La/gm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m0()La/flc;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->r:La/bu00;

    .line 2
    .line 3
    invoke-virtual {p0}, La/bu00;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/flc;

    .line 8
    .line 9
    return-object p0
.end method

.method public final n0()La/k2u0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->t:La/bu00;

    .line 2
    .line 3
    invoke-virtual {p0}, La/bu00;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k2u0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final o0()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->f:La/ljq;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget p0, p0, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/ljq;->e(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, La/r2d0;->f:La/r2d0;

    .line 12
    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final p()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, La/ffk;->l:La/g45;

    .line 2
    .line 3
    iget-object v1, v0, La/g45;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/roi0;

    .line 6
    .line 7
    iget-object v2, p0, La/ffk;->e:La/s2d0;

    .line 8
    .line 9
    invoke-static {v2, v1}, La/m8x;->K(La/s2d0;La/roi0;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, La/a4d0;

    .line 39
    .line 40
    iget-object v4, v0, La/g45;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, La/qgd;

    .line 43
    .line 44
    invoke-virtual {v4, v3}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v4, La/c8z;

    .line 49
    .line 50
    invoke-virtual {p0}, La/h1;->f0()La/c8z;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, La/mje;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-direct {v6, p0, v3, v7}, La/mje;-><init>(La/wm40;La/wsy;La/g950;)V

    .line 58
    .line 59
    .line 60
    sget-object v3, La/ujn;->c:La/f93;

    .line 61
    .line 62
    invoke-direct {v4, v5, v6, v3}, La/c8z;-><init>(La/vjj;La/p4;La/g93;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object v2
.end method

.method public final p0()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->h:La/kjq;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget p0, p0, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final q0()Z
    .locals 1

    .line 1
    sget-object v0, La/njq;->l:La/kjq;

    .line 2
    .line 3
    iget-object p0, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget p0, p0, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final r()La/slc;
    .locals 0

    .line 1
    iget-object p0, p0, La/ffk;->k:La/slc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r0()Z
    .locals 3

    .line 1
    sget-object v0, La/njq;->k:La/kjq;

    .line 2
    .line 3
    iget-object v1, p0, La/ffk;->e:La/s2d0;

    .line 4
    .line 5
    iget v1, v1, La/s2d0;->d:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const/4 v1, 0x2

    .line 19
    iget-object p0, p0, La/ffk;->f:La/e28;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0, v2, v0, v1}, La/e28;->a(III)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    return v2

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "deserialized "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/ffk;->Q()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, "expect "

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, ""

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "class "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/h1;->getName()La/g950;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final u0()La/cfk;
    .locals 2

    .line 1
    iget-object v0, p0, La/ffk;->l:La/g45;

    .line 2
    .line 3
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/f6i;

    .line 6
    .line 7
    iget-object v0, v0, La/f6i;->s:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/km50;

    .line 10
    .line 11
    check-cast v0, La/lm50;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/ffk;->o:La/c3h0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, La/c3h0;->a:La/h1;

    .line 22
    .line 23
    sget v1, La/rek;->a:I

    .line 24
    .line 25
    invoke-static {v0}, La/oek;->c(La/vjj;)La/ym40;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/c3h0;->c:La/cu00;

    .line 33
    .line 34
    sget-object v0, La/c3h0;->e:[La/iiy;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    aget-object v0, v0, v1

    .line 38
    .line 39
    invoke-static {p0, v0}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/cr30;

    .line 44
    .line 45
    check-cast p0, La/cfk;

    .line 46
    .line 47
    return-object p0
.end method

.method public final v0(La/g950;)La/kzj0;
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ffk;->u0()La/cfk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, La/ux50;->g:La/ux50;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, La/cfk;->f(La/g950;La/ux50;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    const/4 v0, 0x0

    .line 19
    move-object v1, p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, La/d0d0;

    .line 32
    .line 33
    invoke-interface {v3}, La/kp9;->F()La/c8z;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, La/kp9;->W()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    :goto_1
    move-object v1, p1

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const/4 v0, 0x1

    .line 54
    move-object v1, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    :goto_2
    check-cast v1, La/d0d0;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v1}, La/b3u0;->getType()La/wsy;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_4
    check-cast p1, La/kzj0;

    .line 68
    .line 69
    return-object p1
.end method
