.class public abstract La/xm40;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xm40;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static final a(Ljava/lang/Class;)La/pog0;
    .locals 40

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p0 .. p0}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, La/e1v0;

    .line 9
    .line 10
    invoke-direct {v1, v0}, La/e1v0;-><init>(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, La/xm40;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, La/pog0;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    return-object v4

    .line 32
    :cond_0
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object v21, La/jtv;->m:La/jtv;

    .line 36
    .line 37
    new-instance v6, La/yox;

    .line 38
    .line 39
    invoke-direct {v6, v0}, La/yox;-><init>(Ljava/lang/ClassLoader;)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/yox;

    .line 43
    .line 44
    const-class v4, Lkotlin/Unit;

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, v4}, La/yox;-><init>(Ljava/lang/ClassLoader;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, La/zx10;

    .line 57
    .line 58
    invoke-direct {v5, v0}, La/zx10;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v7, "runtime module for "

    .line 64
    .line 65
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v18, La/gqw0;->A1:La/gqw0;

    .line 76
    .line 77
    new-instance v4, La/eu00;

    .line 78
    .line 79
    const-string v7, "DeserializationComponentsForJava.ModuleData"

    .line 80
    .line 81
    invoke-direct {v4, v7}, La/eu00;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v7, La/jey;

    .line 85
    .line 86
    sget-object v8, La/hey;->a:[La/hey;

    .line 87
    .line 88
    invoke-direct {v7, v4}, La/jey;-><init>(La/eu00;)V

    .line 89
    .line 90
    .line 91
    new-instance v11, La/zm40;

    .line 92
    .line 93
    new-instance v8, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v9, "<"

    .line 96
    .line 97
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const/16 v0, 0x3e

    .line 104
    .line 105
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, La/g950;->i(Ljava/lang/String;)La/g950;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const/16 v8, 0x38

    .line 117
    .line 118
    invoke-direct {v11, v0, v4, v7, v8}, La/zm40;-><init>(La/g950;La/eu00;La/ary;I)V

    .line 119
    .line 120
    .line 121
    iget-object v8, v4, La/eu00;->a:La/jyj0;

    .line 122
    .line 123
    invoke-interface {v8}, La/jyj0;->lock()V

    .line 124
    .line 125
    .line 126
    :try_start_0
    iget-object v0, v7, La/ary;->a:La/zm40;

    .line 127
    .line 128
    if-nez v0, :cond_a

    .line 129
    .line 130
    iput-object v11, v7, La/ary;->a:La/zm40;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    invoke-interface {v8}, La/jyj0;->unlock()V

    .line 133
    .line 134
    .line 135
    new-instance v0, La/gey;

    .line 136
    .line 137
    const/4 v8, 0x0

    .line 138
    invoke-direct {v0, v11, v8}, La/gey;-><init>(La/zm40;B)V

    .line 139
    .line 140
    .line 141
    iput-object v0, v7, La/jey;->f:La/gey;

    .line 142
    .line 143
    move-object v0, v7

    .line 144
    new-instance v7, La/jfk;

    .line 145
    .line 146
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v9, La/epi0;

    .line 150
    .line 151
    const/4 v10, 0x7

    .line 152
    invoke-direct {v9, v10}, La/epi0;-><init>(B)V

    .line 153
    .line 154
    .line 155
    new-instance v10, La/n660;

    .line 156
    .line 157
    invoke-direct {v10, v4, v11}, La/n660;-><init>(La/eu00;La/ym40;)V

    .line 158
    .line 159
    .line 160
    sget-object v12, La/lwf;->x:La/lwf;

    .line 161
    .line 162
    new-instance v13, La/fty;

    .line 163
    .line 164
    const/16 v14, 0x9

    .line 165
    .line 166
    const/4 v15, 0x1

    .line 167
    invoke-direct {v13, v15, v14, v8}, La/fty;-><init>(III)V

    .line 168
    .line 169
    .line 170
    new-instance v14, La/cgx0;

    .line 171
    .line 172
    sget-object v8, La/v9y;->d:La/w9y;

    .line 173
    .line 174
    iget-object v15, v8, La/w9y;->b:La/fty;

    .line 175
    .line 176
    if-eqz v15, :cond_2

    .line 177
    .line 178
    iget v15, v15, La/fty;->d:I

    .line 179
    .line 180
    move-object/from16 v17, v0

    .line 181
    .line 182
    iget v0, v13, La/fty;->d:I

    .line 183
    .line 184
    sub-int/2addr v15, v0

    .line 185
    if-gtz v15, :cond_3

    .line 186
    .line 187
    iget-object v0, v8, La/w9y;->c:La/zlf0;

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_2
    move-object/from16 v17, v0

    .line 191
    .line 192
    :cond_3
    iget-object v0, v8, La/w9y;->a:La/zlf0;

    .line 193
    .line 194
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v8, La/zlf0;->c:La/zlf0;

    .line 198
    .line 199
    const/16 v19, 0x0

    .line 200
    .line 201
    if-ne v0, v8, :cond_4

    .line 202
    .line 203
    move-object/from16 v8, v19

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_4
    move-object v8, v0

    .line 207
    :goto_1
    new-instance v15, La/ydy;

    .line 208
    .line 209
    invoke-direct {v15, v0, v8}, La/ydy;-><init>(La/zlf0;La/zlf0;)V

    .line 210
    .line 211
    .line 212
    new-instance v0, La/w0;

    .line 213
    .line 214
    const/16 v8, 0x1a

    .line 215
    .line 216
    invoke-direct {v0, v13, v8}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    invoke-direct {v14, v15, v0}, La/cgx0;-><init>(La/ydy;La/w0;)V

    .line 220
    .line 221
    .line 222
    move-object v0, v3

    .line 223
    new-instance v3, La/v7i;

    .line 224
    .line 225
    new-instance v8, La/zie0;

    .line 226
    .line 227
    sget-object v13, La/iun;->a:La/iun;

    .line 228
    .line 229
    invoke-direct {v8, v4, v13}, La/zie0;-><init>(La/eu00;La/iun;)V

    .line 230
    .line 231
    .line 232
    move-object v15, v12

    .line 233
    new-instance v12, La/xre0;

    .line 234
    .line 235
    invoke-direct {v12, v11, v10}, La/xre0;-><init>(La/zm40;La/n660;)V

    .line 236
    .line 237
    .line 238
    move-object/from16 v20, v13

    .line 239
    .line 240
    new-instance v13, La/a93;

    .line 241
    .line 242
    invoke-direct {v13, v14}, La/u0;-><init>(La/cgx0;)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v16, v14

    .line 246
    .line 247
    const/16 v22, 0x1

    .line 248
    .line 249
    new-instance v14, La/cge0;

    .line 250
    .line 251
    move-object/from16 v23, v0

    .line 252
    .line 253
    new-instance v0, La/tqt;

    .line 254
    .line 255
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-direct {v14, v0}, La/cge0;-><init>(La/tqt;)V

    .line 259
    .line 260
    .line 261
    sget-object v0, La/km50;->b:La/jm50;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    sget-object v33, La/jm50;->b:La/lm50;

    .line 267
    .line 268
    move-object/from16 v0, v17

    .line 269
    .line 270
    new-instance v17, La/bek;

    .line 271
    .line 272
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    move-object/from16 p0, v0

    .line 276
    .line 277
    move-object/from16 v36, v1

    .line 278
    .line 279
    move-object/from16 v37, v2

    .line 280
    .line 281
    move-object v1, v10

    .line 282
    move-object v10, v15

    .line 283
    move-object/from16 v2, v20

    .line 284
    .line 285
    move/from16 v38, v22

    .line 286
    .line 287
    move-object/from16 v15, v33

    .line 288
    .line 289
    const/4 v0, 0x0

    .line 290
    invoke-direct/range {v3 .. v17}, La/v7i;-><init>(La/eu00;La/zx10;La/yox;La/jfk;La/zie0;La/epi0;La/lwf;La/zm40;La/xre0;La/a93;La/cge0;La/km50;La/cgx0;La/bek;)V

    .line 291
    .line 292
    .line 293
    move-object v5, v6

    .line 294
    move-object v6, v3

    .line 295
    move-object v3, v5

    .line 296
    move-object v5, v7

    .line 297
    move-object v7, v11

    .line 298
    new-instance v10, La/s9z;

    .line 299
    .line 300
    invoke-direct {v10, v6}, La/s9z;-><init>(La/v7i;)V

    .line 301
    .line 302
    .line 303
    sget-object v6, La/vd40;->g:La/vd40;

    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    new-instance v8, La/zpu;

    .line 309
    .line 310
    const/16 v11, 0xe

    .line 311
    .line 312
    invoke-direct {v8, v3, v5, v11}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 313
    .line 314
    .line 315
    move-object v12, v9

    .line 316
    new-instance v9, La/esg0;

    .line 317
    .line 318
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 319
    .line 320
    .line 321
    iput-object v3, v9, La/esg0;->a:Ljava/lang/Object;

    .line 322
    .line 323
    new-instance v13, La/w0;

    .line 324
    .line 325
    invoke-direct {v13, v9, v0}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, v13}, La/eu00;->c(Lkotlin/jvm/functions/Function1;)La/zt00;

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    iput-object v13, v9, La/esg0;->b:Ljava/lang/Object;

    .line 333
    .line 334
    iput-object v7, v9, La/esg0;->c:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v1, v9, La/esg0;->d:Ljava/lang/Object;

    .line 337
    .line 338
    new-instance v13, La/ehf0;

    .line 339
    .line 340
    invoke-direct {v13, v7, v1}, La/ehf0;-><init>(La/ym40;La/n660;)V

    .line 341
    .line 342
    .line 343
    iput-object v13, v9, La/esg0;->e:Ljava/lang/Object;

    .line 344
    .line 345
    sget-object v13, La/vd40;->g:La/vd40;

    .line 346
    .line 347
    iput-object v13, v9, La/esg0;->f:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v6, v9, La/esg0;->f:Ljava/lang/Object;

    .line 350
    .line 351
    sget-object v6, La/uyj;->a:La/uyj;

    .line 352
    .line 353
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v20

    .line 357
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object v6, v7, La/zm40;->e:La/ary;

    .line 361
    .line 362
    instance-of v13, v6, La/jey;

    .line 363
    .line 364
    if-eqz v13, :cond_5

    .line 365
    .line 366
    move-object/from16 v19, v6

    .line 367
    .line 368
    check-cast v19, La/jey;

    .line 369
    .line 370
    :cond_5
    move-object v6, v5

    .line 371
    new-instance v5, La/f6i;

    .line 372
    .line 373
    move-object v13, v12

    .line 374
    sget-object v12, La/jtv;->l:La/jtv;

    .line 375
    .line 376
    if-eqz v19, :cond_6

    .line 377
    .line 378
    invoke-virtual/range {v19 .. v19}, La/jey;->L()La/mey;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    if-eqz v14, :cond_6

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :cond_6
    sget-object v14, La/rv00;->b:La/rv00;

    .line 386
    .line 387
    :goto_2
    if-eqz v19, :cond_7

    .line 388
    .line 389
    invoke-virtual/range {v19 .. v19}, La/jey;->L()La/mey;

    .line 390
    .line 391
    .line 392
    move-result-object v16

    .line 393
    if-eqz v16, :cond_7

    .line 394
    .line 395
    goto :goto_3

    .line 396
    :cond_7
    sget-object v16, La/lwf;->y:La/lwf;

    .line 397
    .line 398
    :goto_3
    sget-object v17, La/egy;->a:La/sso;

    .line 399
    .line 400
    move/from16 v39, v0

    .line 401
    .line 402
    new-instance v0, La/zie0;

    .line 403
    .line 404
    invoke-direct {v0, v4, v2}, La/zie0;-><init>(La/eu00;La/iun;)V

    .line 405
    .line 406
    .line 407
    move-object/from16 v19, v14

    .line 408
    .line 409
    move-object v14, v1

    .line 410
    move-object v1, v13

    .line 411
    move-object v13, v2

    .line 412
    move v2, v11

    .line 413
    move-object/from16 v11, v18

    .line 414
    .line 415
    move-object/from16 v18, v15

    .line 416
    .line 417
    move-object/from16 v15, v19

    .line 418
    .line 419
    move-object/from16 v19, v0

    .line 420
    .line 421
    move-object v0, v6

    .line 422
    move-object v6, v4

    .line 423
    invoke-direct/range {v5 .. v21}, La/f6i;-><init>(La/eu00;La/ym40;La/hlc;La/m83;La/pg80;La/q1o;La/lkq;Ljava/lang/Iterable;La/n660;La/fx;La/qv90;La/sso;La/km50;La/zie0;Ljava/util/List;La/b0o;)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v15, v18

    .line 427
    .line 428
    iput-object v5, v0, La/jfk;->a:La/f6i;

    .line 429
    .line 430
    new-instance v6, La/yox;

    .line 431
    .line 432
    invoke-direct {v6, v10}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    iput-object v6, v1, La/epi0;->b:Ljava/lang/Object;

    .line 436
    .line 437
    new-instance v1, La/oey;

    .line 438
    .line 439
    invoke-virtual/range {p0 .. p0}, La/jey;->L()La/mey;

    .line 440
    .line 441
    .line 442
    move-result-object v30

    .line 443
    invoke-virtual/range {p0 .. p0}, La/jey;->L()La/mey;

    .line 444
    .line 445
    .line 446
    move-result-object v31

    .line 447
    new-instance v6, La/zie0;

    .line 448
    .line 449
    invoke-direct {v6, v4, v13}, La/zie0;-><init>(La/eu00;La/iun;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    move-object/from16 v8, v23

    .line 459
    .line 460
    invoke-direct {v1, v4, v8, v7}, La/oey;-><init>(La/eu00;La/yox;La/zm40;)V

    .line 461
    .line 462
    .line 463
    new-instance v22, La/f6i;

    .line 464
    .line 465
    new-instance v8, La/cad;

    .line 466
    .line 467
    invoke-direct {v8, v1, v2}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 468
    .line 469
    .line 470
    new-instance v2, La/chf0;

    .line 471
    .line 472
    sget-object v9, La/zc9;->m:La/zc9;

    .line 473
    .line 474
    invoke-direct {v2, v7, v14, v9}, La/chf0;-><init>(La/ym40;La/n660;La/zc9;)V

    .line 475
    .line 476
    .line 477
    new-instance v11, La/xc9;

    .line 478
    .line 479
    invoke-direct {v11, v4, v7}, La/xc9;-><init>(La/eu00;La/zm40;)V

    .line 480
    .line 481
    .line 482
    new-instance v12, La/fey;

    .line 483
    .line 484
    invoke-direct {v12, v4, v7}, La/fey;-><init>(La/eu00;La/zm40;)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v27, v1

    .line 488
    .line 489
    const/4 v1, 0x2

    .line 490
    move-object/from16 v26, v2

    .line 491
    .line 492
    new-array v2, v1, [La/klc;

    .line 493
    .line 494
    aput-object v11, v2, v39

    .line 495
    .line 496
    aput-object v12, v2, v38

    .line 497
    .line 498
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v28

    .line 502
    iget-object v2, v9, La/zc9;->a:La/sso;

    .line 503
    .line 504
    const/high16 v35, 0x40000

    .line 505
    .line 506
    move-object/from16 v32, v2

    .line 507
    .line 508
    move-object/from16 v23, v4

    .line 509
    .line 510
    move-object/from16 v34, v6

    .line 511
    .line 512
    move-object/from16 v24, v7

    .line 513
    .line 514
    move-object/from16 v25, v8

    .line 515
    .line 516
    move-object/from16 v29, v14

    .line 517
    .line 518
    move-object/from16 v33, v15

    .line 519
    .line 520
    invoke-direct/range {v22 .. v35}, La/f6i;-><init>(La/eu00;La/ym40;La/cad;La/chf0;La/pg80;Ljava/lang/Iterable;La/n660;La/fx;La/qv90;La/sso;La/km50;La/zie0;I)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v4, v22

    .line 524
    .line 525
    move-object/from16 v2, v27

    .line 526
    .line 527
    iput-object v4, v2, La/oey;->c:La/f6i;

    .line 528
    .line 529
    filled-new-array {v7}, [La/zm40;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    invoke-static {v4}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    sget-object v6, La/xun;->a:La/xun;

    .line 541
    .line 542
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    new-instance v8, La/yuu;

    .line 546
    .line 547
    invoke-direct {v8, v4, v6, v13, v6}, La/yuu;-><init>(Ljava/util/List;La/xun;La/iun;La/xun;)V

    .line 548
    .line 549
    .line 550
    iput-object v8, v7, La/zm40;->h:La/yuu;

    .line 551
    .line 552
    new-instance v4, La/hld;

    .line 553
    .line 554
    new-array v1, v1, [La/pg80;

    .line 555
    .line 556
    aput-object v10, v1, v39

    .line 557
    .line 558
    aput-object v2, v1, v38

    .line 559
    .line 560
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    new-instance v2, Ljava/lang/StringBuilder;

    .line 565
    .line 566
    const-string v6, "CompositeProvider@RuntimeModuleData for "

    .line 567
    .line 568
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-direct {v4, v1, v2}, La/hld;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    iput-object v4, v7, La/zm40;->i:La/pg80;

    .line 582
    .line 583
    new-instance v1, La/pog0;

    .line 584
    .line 585
    new-instance v2, La/yuu;

    .line 586
    .line 587
    invoke-direct {v2, v0, v3}, La/yuu;-><init>(La/jfk;La/yox;)V

    .line 588
    .line 589
    .line 590
    invoke-direct {v1, v5, v2}, La/pog0;-><init>(La/f6i;La/yuu;)V

    .line 591
    .line 592
    .line 593
    :goto_4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 594
    .line 595
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    move-object/from16 v2, v36

    .line 599
    .line 600
    move-object/from16 v3, v37

    .line 601
    .line 602
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 607
    .line 608
    if-nez v0, :cond_8

    .line 609
    .line 610
    return-object v1

    .line 611
    :cond_8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    check-cast v4, La/pog0;

    .line 616
    .line 617
    if-eqz v4, :cond_9

    .line 618
    .line 619
    return-object v4

    .line 620
    :cond_9
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-object/from16 v36, v2

    .line 624
    .line 625
    move-object/from16 v37, v3

    .line 626
    .line 627
    goto :goto_4

    .line 628
    :cond_a
    move-object/from16 p0, v7

    .line 629
    .line 630
    move-object v7, v11

    .line 631
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 632
    .line 633
    new-instance v1, Ljava/lang/StringBuilder;

    .line 634
    .line 635
    const-string v2, "Built-ins module is already set: "

    .line 636
    .line 637
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    move-object/from16 v2, p0

    .line 641
    .line 642
    iget-object v2, v2, La/ary;->a:La/zm40;

    .line 643
    .line 644
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    const-string v2, " (attempting to reset to "

    .line 648
    .line 649
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    const-string v2, ")"

    .line 656
    .line 657
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 668
    :catchall_0
    move-exception v0

    .line 669
    :try_start_2
    iget-object v1, v4, La/eu00;->b:La/jtv;

    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 675
    :catchall_1
    move-exception v0

    .line 676
    invoke-interface {v8}, La/jyj0;->unlock()V

    .line 677
    .line 678
    .line 679
    throw v0
.end method
