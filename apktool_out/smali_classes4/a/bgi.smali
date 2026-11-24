.class public final La/bgi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/dci;


# direct methods
.method public constructor <init>(La/dci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bgi;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 35

    .line 1
    new-instance v0, La/b7o;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/bgi;->a:La/dci;

    .line 6
    .line 7
    iget-object v1, v1, La/dci;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/cgi;

    .line 10
    .line 11
    iget-object v2, v1, La/cgi;->a:Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;

    .line 12
    .line 13
    iget-object v3, v1, La/cgi;->b:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v4, La/ywq0;

    .line 16
    .line 17
    new-instance v5, La/rpt;

    .line 18
    .line 19
    iget-object v6, v1, La/cgi;->C:La/n5d0;

    .line 20
    .line 21
    invoke-interface {v6}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, La/irh;

    .line 26
    .line 27
    invoke-direct {v5, v6}, La/rpt;-><init>(La/irh;)V

    .line 28
    .line 29
    .line 30
    iget-object v6, v1, La/cgi;->c:La/clc;

    .line 31
    .line 32
    iget-object v6, v6, La/clc;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, La/v7i;

    .line 35
    .line 36
    new-instance v7, La/zn00;

    .line 37
    .line 38
    new-instance v8, La/jw20;

    .line 39
    .line 40
    iget-object v9, v6, La/v7i;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v9, La/t0d;

    .line 43
    .line 44
    const/16 v10, 0xe

    .line 45
    .line 46
    invoke-direct {v8, v9, v10}, La/jw20;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v8, v7, La/zn00;->a:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v8, La/cug;->d:La/cug;

    .line 55
    .line 56
    iget-wide v8, v8, La/yxg;->b:J

    .line 57
    .line 58
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    sget-object v8, La/wrg;->d:La/wrg;

    .line 63
    .line 64
    iget-wide v8, v8, La/yxg;->b:J

    .line 65
    .line 66
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    sget-object v8, La/mxg;->d:La/mxg;

    .line 71
    .line 72
    iget-wide v8, v8, La/yxg;->b:J

    .line 73
    .line 74
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    sget-object v8, La/vrg;->d:La/vrg;

    .line 79
    .line 80
    iget-wide v8, v8, La/yxg;->b:J

    .line 81
    .line 82
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    sget-object v8, La/ntg;->d:La/ntg;

    .line 87
    .line 88
    iget-wide v8, v8, La/yxg;->b:J

    .line 89
    .line 90
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v14

    .line 94
    sget-object v8, La/lxg;->d:La/lxg;

    .line 95
    .line 96
    iget-wide v8, v8, La/yxg;->b:J

    .line 97
    .line 98
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    sget-object v8, La/jrg;->d:La/jrg;

    .line 103
    .line 104
    iget-wide v8, v8, La/yxg;->b:J

    .line 105
    .line 106
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v16

    .line 110
    sget-object v8, La/ovg;->d:La/ovg;

    .line 111
    .line 112
    iget-wide v8, v8, La/yxg;->b:J

    .line 113
    .line 114
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v17

    .line 118
    sget-object v8, La/awg;->d:La/awg;

    .line 119
    .line 120
    iget-wide v8, v8, La/yxg;->b:J

    .line 121
    .line 122
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v18

    .line 126
    sget-object v8, La/qtg;->d:La/qtg;

    .line 127
    .line 128
    iget-wide v8, v8, La/yxg;->b:J

    .line 129
    .line 130
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v19

    .line 134
    filled-new-array/range {v10 .. v19}, [Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    iput-object v8, v7, La/zn00;->b:Ljava/lang/Object;

    .line 143
    .line 144
    new-instance v8, La/bzu;

    .line 145
    .line 146
    new-instance v9, La/cyu;

    .line 147
    .line 148
    new-instance v10, La/w4p0;

    .line 149
    .line 150
    iget-object v11, v1, La/cgi;->d:La/gii0;

    .line 151
    .line 152
    const/4 v12, 0x4

    .line 153
    invoke-direct {v10, v11, v12}, La/w4p0;-><init>(La/gii0;B)V

    .line 154
    .line 155
    .line 156
    new-instance v11, La/owp0;

    .line 157
    .line 158
    const/4 v13, 0x3

    .line 159
    const/4 v14, 0x0

    .line 160
    invoke-direct {v11, v13, v14}, La/owp0;-><init>(BZ)V

    .line 161
    .line 162
    .line 163
    iget-object v13, v1, La/cgi;->e:La/knf0;

    .line 164
    .line 165
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object v10, v9, La/cyu;->a:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v11, v9, La/cyu;->b:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v13, v9, La/cyu;->c:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-direct {v8, v9, v12}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 178
    .line 179
    .line 180
    new-instance v9, La/yox;

    .line 181
    .line 182
    new-instance v10, La/w4p0;

    .line 183
    .line 184
    iget-object v6, v6, La/v7i;->j:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v6, La/x0t0;

    .line 187
    .line 188
    const/4 v11, 0x6

    .line 189
    invoke-direct {v10, v6, v11}, La/w4p0;-><init>(Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    invoke-direct {v9, v10}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object v6, v1, La/cgi;->f:La/ivn;

    .line 196
    .line 197
    iget-object v6, v6, La/ivn;->a:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v6, La/v5i;

    .line 200
    .line 201
    invoke-virtual {v6}, La/v5i;->f()La/lbu;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    iget-object v10, v1, La/cgi;->g:La/xhi;

    .line 206
    .line 207
    invoke-virtual {v10}, La/xhi;->e()La/b8u;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object v5, v4, La/ywq0;->a:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v7, v4, La/ywq0;->b:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object v8, v4, La/ywq0;->c:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v9, v4, La/ywq0;->d:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v6, v4, La/ywq0;->e:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object v10, v4, La/ywq0;->f:Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v5, v1, La/cgi;->c:La/clc;

    .line 227
    .line 228
    iget-object v6, v5, La/clc;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, La/v7i;

    .line 231
    .line 232
    invoke-virtual {v6}, La/v7i;->h()La/a7q;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    iget-object v7, v1, La/cgi;->h:La/xri;

    .line 237
    .line 238
    invoke-virtual {v7}, La/xri;->a()La/svu;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    move-object v8, v6

    .line 246
    move-object v6, v7

    .line 247
    iget-object v7, v1, La/cgi;->i:La/m1e;

    .line 248
    .line 249
    move-object v9, v8

    .line 250
    iget-object v8, v1, La/cgi;->j:La/ctf0;

    .line 251
    .line 252
    move-object v10, v9

    .line 253
    iget-object v9, v1, La/cgi;->k:La/g2v;

    .line 254
    .line 255
    iget-object v11, v1, La/cgi;->f:La/ivn;

    .line 256
    .line 257
    iget-object v12, v11, La/ivn;->a:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v12, La/v5i;

    .line 260
    .line 261
    invoke-virtual {v12}, La/v5i;->b()La/kut;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    iget-object v13, v11, La/ivn;->a:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v13, La/v5i;

    .line 268
    .line 269
    invoke-virtual {v13}, La/v5i;->d()La/rpt;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    iget-object v15, v1, La/cgi;->l:La/rmd0;

    .line 274
    .line 275
    invoke-interface {v15}, La/rmd0;->a()La/vpu;

    .line 276
    .line 277
    .line 278
    move-result-object v15

    .line 279
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iget-object v14, v1, La/cgi;->g:La/xhi;

    .line 283
    .line 284
    move-object/from16 v16, v13

    .line 285
    .line 286
    invoke-virtual {v14}, La/xhi;->a()La/z0s;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    move-object/from16 v17, v14

    .line 291
    .line 292
    iget-object v14, v1, La/cgi;->m:La/lbu;

    .line 293
    .line 294
    move-object/from16 v18, v0

    .line 295
    .line 296
    iget-object v0, v1, La/cgi;->n:La/ugf0;

    .line 297
    .line 298
    iget-object v0, v0, La/ugf0;->a:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, La/daf;

    .line 301
    .line 302
    invoke-virtual {v0}, La/daf;->w()La/luu;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    move-object/from16 v19, v0

    .line 310
    .line 311
    new-instance v0, La/e1u;

    .line 312
    .line 313
    move-object/from16 v20, v2

    .line 314
    .line 315
    iget-object v2, v5, La/clc;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v2, La/v7i;

    .line 318
    .line 319
    invoke-virtual {v2}, La/v7i;->d()La/wrh;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    move-object/from16 v21, v3

    .line 327
    .line 328
    const/4 v3, 0x1

    .line 329
    invoke-direct {v0, v2, v3}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 330
    .line 331
    .line 332
    iget-object v2, v1, La/cgi;->o:La/a1d;

    .line 333
    .line 334
    iget-object v2, v2, La/a1d;->b:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v2, La/qv2;

    .line 337
    .line 338
    invoke-virtual {v2}, La/qv2;->i()La/hqc;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    move-object/from16 v3, v16

    .line 343
    .line 344
    move-object/from16 v16, v0

    .line 345
    .line 346
    move-object/from16 v0, v18

    .line 347
    .line 348
    invoke-virtual/range {v17 .. v17}, La/xhi;->h()La/iw20;

    .line 349
    .line 350
    .line 351
    move-result-object v18

    .line 352
    move-object/from16 v22, v0

    .line 353
    .line 354
    iget-object v0, v1, La/cgi;->p:La/cad;

    .line 355
    .line 356
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, La/psc;

    .line 359
    .line 360
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v23, v17

    .line 368
    .line 369
    move-object/from16 v17, v2

    .line 370
    .line 371
    move-object/from16 v2, v20

    .line 372
    .line 373
    invoke-virtual/range {v23 .. v23}, La/xhi;->b()La/tzi;

    .line 374
    .line 375
    .line 376
    move-result-object v20

    .line 377
    move-object/from16 v24, v3

    .line 378
    .line 379
    move-object/from16 v3, v21

    .line 380
    .line 381
    invoke-virtual/range {v23 .. v23}, La/xhi;->j()La/sbu;

    .line 382
    .line 383
    .line 384
    move-result-object v21

    .line 385
    move-object/from16 v25, v10

    .line 386
    .line 387
    move-object v10, v12

    .line 388
    move-object v12, v15

    .line 389
    move-object/from16 v15, v19

    .line 390
    .line 391
    move-object/from16 v19, v0

    .line 392
    .line 393
    move-object/from16 v0, v22

    .line 394
    .line 395
    invoke-virtual/range {v23 .. v23}, La/xhi;->k()La/drm0;

    .line 396
    .line 397
    .line 398
    move-result-object v22

    .line 399
    iget-object v5, v5, La/clc;->b:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v5, La/v7i;

    .line 402
    .line 403
    invoke-virtual {v5}, La/v7i;->e()La/rus;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    move-object/from16 v26, v24

    .line 408
    .line 409
    invoke-virtual/range {v23 .. v23}, La/xhi;->g()La/g3j;

    .line 410
    .line 411
    .line 412
    move-result-object v24

    .line 413
    move-object/from16 v27, v0

    .line 414
    .line 415
    new-instance v0, La/j3c;

    .line 416
    .line 417
    move-object/from16 v28, v2

    .line 418
    .line 419
    iget-object v2, v1, La/cgi;->q:La/sjl0;

    .line 420
    .line 421
    move-object/from16 v29, v3

    .line 422
    .line 423
    const/4 v3, 0x0

    .line 424
    invoke-direct {v0, v2, v3}, La/j3c;-><init>(La/sjl0;B)V

    .line 425
    .line 426
    .line 427
    iget-object v2, v1, La/cgi;->r:La/iip;

    .line 428
    .line 429
    invoke-interface {v2}, La/iip;->V()La/j3c;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    iget-object v3, v1, La/cgi;->s:La/r9u;

    .line 437
    .line 438
    invoke-virtual/range {v23 .. v23}, La/xhi;->c()La/xpr;

    .line 439
    .line 440
    .line 441
    move-result-object v23

    .line 442
    iget-object v11, v11, La/ivn;->a:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v11, La/v5i;

    .line 445
    .line 446
    invoke-virtual {v11}, La/v5i;->e()La/zsr;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    move-object/from16 p0, v0

    .line 451
    .line 452
    iget-object v0, v1, La/cgi;->t:La/pyg;

    .line 453
    .line 454
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 455
    .line 456
    .line 457
    move-result-object v30

    .line 458
    invoke-static/range {v30 .. v30}, La/x1x;->x(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    iget-object v0, v1, La/cgi;->u:La/oeg0;

    .line 462
    .line 463
    move-object/from16 v31, v0

    .line 464
    .line 465
    iget-object v0, v1, La/cgi;->v:La/h3c;

    .line 466
    .line 467
    move-object/from16 v32, v0

    .line 468
    .line 469
    iget-object v0, v1, La/cgi;->w:La/qv2;

    .line 470
    .line 471
    iget-object v1, v1, La/cgi;->x:La/pru;

    .line 472
    .line 473
    move-object/from16 v33, v0

    .line 474
    .line 475
    move-object/from16 v34, v1

    .line 476
    .line 477
    move-object/from16 v0, v27

    .line 478
    .line 479
    move-object/from16 v1, p1

    .line 480
    .line 481
    move-object/from16 v27, v3

    .line 482
    .line 483
    move-object/from16 v3, v29

    .line 484
    .line 485
    move-object/from16 v29, v11

    .line 486
    .line 487
    move-object/from16 v11, v26

    .line 488
    .line 489
    move-object/from16 v26, v2

    .line 490
    .line 491
    move-object/from16 v2, v28

    .line 492
    .line 493
    move-object/from16 v28, v23

    .line 494
    .line 495
    move-object/from16 v23, v5

    .line 496
    .line 497
    move-object/from16 v5, v25

    .line 498
    .line 499
    move-object/from16 v25, p0

    .line 500
    .line 501
    invoke-direct/range {v0 .. v34}, La/b7o;-><init>(La/vzg0;Lorg/xplatform/cyber/game/universal/api/EsportsUniversalScreenParams;Ljava/lang/String;La/ywq0;La/a7q;La/svu;La/m1e;La/ctf0;La/g2v;La/kut;La/rpt;La/vpu;La/z0s;La/lbu;La/luu;La/e1u;La/hqc;La/iw20;La/mne;La/tzi;La/sbu;La/drm0;La/rus;La/g3j;La/j3c;La/j3c;La/r9u;La/xpr;La/zsr;La/hzg;La/oeg0;La/h3c;La/qv2;La/pru;)V

    .line 502
    .line 503
    .line 504
    return-object v0
.end method
