.class public final La/vfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vcn;


# instance fields
.field public final synthetic a:La/yei;


# direct methods
.method public constructor <init>(La/yei;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vfi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 57

    .line 1
    new-instance v0, La/sdn;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/vfi;->a:La/yei;

    .line 6
    .line 7
    iget-object v1, v1, La/yei;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/wfi;

    .line 10
    .line 11
    iget-object v2, v1, La/wfi;->a:Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 12
    .line 13
    iget-object v3, v1, La/wfi;->b:La/cad;

    .line 14
    .line 15
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/psc;

    .line 18
    .line 19
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v1, La/wfi;->c:La/ctf0;

    .line 27
    .line 28
    iget-object v5, v1, La/wfi;->d:La/pcl0;

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    invoke-interface {v6}, La/pcl0;->P()La/x4u;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v7, v6

    .line 39
    invoke-interface {v7}, La/pcl0;->W()La/f2v;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v8, v7

    .line 47
    new-instance v7, La/w5z;

    .line 48
    .line 49
    new-instance v9, La/f7u;

    .line 50
    .line 51
    iget-object v10, v1, La/wfi;->e:La/adn;

    .line 52
    .line 53
    iget-object v11, v1, La/wfi;->f:La/j1q0;

    .line 54
    .line 55
    iget-object v12, v1, La/wfi;->g:La/edo;

    .line 56
    .line 57
    iget-object v13, v1, La/wfi;->h:La/zfo;

    .line 58
    .line 59
    invoke-direct {v9, v10, v11, v12, v13}, La/f7u;-><init>(La/adn;La/j1q0;La/edo;La/zfo;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v8}, La/pcl0;->I()La/f4u;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v8}, La/pcl0;->d()La/a1d;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v13, v1, La/wfi;->i:La/iw20;

    .line 77
    .line 78
    iget-object v14, v13, La/iw20;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v14, La/uii;

    .line 81
    .line 82
    invoke-virtual {v14}, La/uii;->r()La/pru;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    invoke-direct {v7, v9, v11, v12, v14}, La/w5z;-><init>(La/f7u;La/f4u;La/a1d;La/pru;)V

    .line 87
    .line 88
    .line 89
    iget-object v9, v13, La/iw20;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v9, La/uii;

    .line 92
    .line 93
    invoke-virtual {v9}, La/uii;->r()La/pru;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    new-instance v14, La/o030;

    .line 98
    .line 99
    iget-object v15, v1, La/wfi;->j:La/i1w0;

    .line 100
    .line 101
    iget-object v11, v1, La/wfi;->k:La/onv;

    .line 102
    .line 103
    iget-object v11, v11, La/onv;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v11, La/daf;

    .line 106
    .line 107
    invoke-virtual {v11}, La/daf;->n()La/e1u;

    .line 108
    .line 109
    .line 110
    move-result-object v16

    .line 111
    invoke-virtual {v11}, La/daf;->m()La/jtj;

    .line 112
    .line 113
    .line 114
    move-result-object v17

    .line 115
    invoke-virtual {v11}, La/daf;->l()La/pq;

    .line 116
    .line 117
    .line 118
    move-result-object v18

    .line 119
    invoke-virtual {v11}, La/daf;->p()La/npx;

    .line 120
    .line 121
    .line 122
    move-result-object v19

    .line 123
    iget-object v12, v1, La/wfi;->c:La/ctf0;

    .line 124
    .line 125
    move-object/from16 v53, v0

    .line 126
    .line 127
    new-instance v0, La/mii0;

    .line 128
    .line 129
    move-object/from16 p0, v2

    .line 130
    .line 131
    iget-object v2, v1, La/wfi;->l:La/kt2;

    .line 132
    .line 133
    move-object/from16 v54, v3

    .line 134
    .line 135
    iget-object v3, v1, La/wfi;->m:La/knf0;

    .line 136
    .line 137
    move-object/from16 v55, v4

    .line 138
    .line 139
    iget-object v4, v1, La/wfi;->n:La/peg0;

    .line 140
    .line 141
    move-object/from16 v56, v5

    .line 142
    .line 143
    iget-object v5, v1, La/wfi;->o:La/gst0;

    .line 144
    .line 145
    invoke-direct {v0, v2, v3, v4, v5}, La/mii0;-><init>(La/kt2;La/knf0;La/peg0;La/gst0;)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v26, v0

    .line 149
    .line 150
    iget-object v0, v1, La/wfi;->p:La/d1p;

    .line 151
    .line 152
    invoke-interface {v0}, La/d1p;->F()La/x20;

    .line 153
    .line 154
    .line 155
    move-result-object v27

    .line 156
    invoke-interface {v0}, La/d1p;->n0()La/je;

    .line 157
    .line 158
    .line 159
    move-result-object v28

    .line 160
    new-instance v20, La/bn6;

    .line 161
    .line 162
    const/16 v25, 0x1

    .line 163
    .line 164
    move-object/from16 v22, v2

    .line 165
    .line 166
    move-object/from16 v23, v3

    .line 167
    .line 168
    move-object/from16 v24, v4

    .line 169
    .line 170
    move-object/from16 v21, v5

    .line 171
    .line 172
    invoke-direct/range {v20 .. v25}, La/bn6;-><init>(La/gst0;La/kt2;La/knf0;La/peg0;B)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v2, v21

    .line 176
    .line 177
    invoke-virtual {v11}, La/daf;->a()La/ywq0;

    .line 178
    .line 179
    .line 180
    move-result-object v25

    .line 181
    iget-object v3, v1, La/wfi;->q:La/ouu;

    .line 182
    .line 183
    iget-object v4, v1, La/wfi;->r:La/rmd0;

    .line 184
    .line 185
    move-object/from16 v22, v27

    .line 186
    .line 187
    invoke-interface {v4}, La/rmd0;->d()La/yk50;

    .line 188
    .line 189
    .line 190
    move-result-object v27

    .line 191
    invoke-static/range {v27 .. v27}, La/x1x;->x(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object v5, v1, La/wfi;->s:La/wsf0;

    .line 195
    .line 196
    iget-object v5, v5, La/wsf0;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v5, La/g45;

    .line 199
    .line 200
    move-object/from16 v23, v28

    .line 201
    .line 202
    invoke-virtual {v5}, La/g45;->t()La/m0u;

    .line 203
    .line 204
    .line 205
    move-result-object v28

    .line 206
    invoke-virtual {v5}, La/g45;->y()La/ahu;

    .line 207
    .line 208
    .line 209
    move-result-object v29

    .line 210
    iget-object v11, v1, La/wfi;->t:La/bzu;

    .line 211
    .line 212
    iget-object v11, v11, La/bzu;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v11, La/o3c;

    .line 215
    .line 216
    invoke-virtual {v11}, La/o3c;->s()La/z220;

    .line 217
    .line 218
    .line 219
    move-result-object v30

    .line 220
    invoke-virtual {v5}, La/g45;->F()La/xru;

    .line 221
    .line 222
    .line 223
    move-result-object v31

    .line 224
    invoke-interface {v4}, La/rmd0;->b()La/oif0;

    .line 225
    .line 226
    .line 227
    move-result-object v32

    .line 228
    invoke-static/range {v32 .. v32}, La/x1x;->x(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v4, v1, La/wfi;->u:La/o2j0;

    .line 232
    .line 233
    invoke-interface {v4}, La/o2j0;->a()La/vyt;

    .line 234
    .line 235
    .line 236
    move-result-object v33

    .line 237
    iget-object v4, v1, La/wfi;->v:La/vqc;

    .line 238
    .line 239
    iget-object v11, v4, La/vqc;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v11, La/cih;

    .line 242
    .line 243
    invoke-virtual {v11}, La/cih;->c()La/k7u;

    .line 244
    .line 245
    .line 246
    move-result-object v34

    .line 247
    iget-object v11, v1, La/wfi;->w:La/iip;

    .line 248
    .line 249
    invoke-interface {v11}, La/iip;->v()La/n660;

    .line 250
    .line 251
    .line 252
    move-result-object v35

    .line 253
    invoke-static/range {v35 .. v35}, La/x1x;->x(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    iget-object v11, v1, La/wfi;->x:La/drm0;

    .line 257
    .line 258
    iget-object v11, v11, La/drm0;->a:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v11, La/ali;

    .line 261
    .line 262
    invoke-virtual {v11}, La/ali;->j()La/reu;

    .line 263
    .line 264
    .line 265
    move-result-object v36

    .line 266
    iget-object v11, v1, La/wfi;->y:La/sue;

    .line 267
    .line 268
    invoke-interface {v11}, La/sue;->c()La/ali;

    .line 269
    .line 270
    .line 271
    move-result-object v37

    .line 272
    invoke-static/range {v37 .. v37}, La/x1x;->x(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    move-object/from16 v21, v0

    .line 276
    .line 277
    new-instance v0, La/cl5;

    .line 278
    .line 279
    move-object/from16 v24, v3

    .line 280
    .line 281
    const/16 v3, 0xf

    .line 282
    .line 283
    invoke-direct {v0, v3}, La/cl5;-><init>(B)V

    .line 284
    .line 285
    .line 286
    iget-object v3, v1, La/wfi;->z:La/fvt0;

    .line 287
    .line 288
    iget-object v3, v3, La/fvt0;->a:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v3, La/o3c;

    .line 291
    .line 292
    invoke-virtual {v3}, La/o3c;->d()La/hpc;

    .line 293
    .line 294
    .line 295
    move-result-object v39

    .line 296
    iget-object v3, v1, La/wfi;->A:La/duj;

    .line 297
    .line 298
    iget-object v13, v13, La/iw20;->a:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v13, La/uii;

    .line 301
    .line 302
    invoke-virtual {v13}, La/uii;->D()La/lbu;

    .line 303
    .line 304
    .line 305
    move-result-object v41

    .line 306
    invoke-interface {v11}, La/sue;->q()La/gud;

    .line 307
    .line 308
    .line 309
    move-result-object v42

    .line 310
    invoke-static/range {v42 .. v42}, La/x1x;->x(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v11}, La/sue;->k()La/xzp;

    .line 314
    .line 315
    .line 316
    move-result-object v43

    .line 317
    invoke-static/range {v43 .. v43}, La/x1x;->x(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v11}, La/sue;->r()La/esg0;

    .line 321
    .line 322
    .line 323
    move-result-object v44

    .line 324
    invoke-static/range {v44 .. v44}, La/x1x;->x(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-interface/range {v21 .. v21}, La/d1p;->Z()La/x20;

    .line 328
    .line 329
    .line 330
    move-result-object v45

    .line 331
    move-object/from16 v38, v0

    .line 332
    .line 333
    iget-object v0, v1, La/wfi;->B:La/v88;

    .line 334
    .line 335
    invoke-interface {v8}, La/pcl0;->H()La/hmt0;

    .line 336
    .line 337
    .line 338
    move-result-object v47

    .line 339
    invoke-static/range {v47 .. v47}, La/x1x;->x(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v11}, La/sue;->h()La/cr;

    .line 343
    .line 344
    .line 345
    move-result-object v48

    .line 346
    move-object/from16 v46, v0

    .line 347
    .line 348
    iget-object v0, v1, La/wfi;->C:La/qoi;

    .line 349
    .line 350
    invoke-virtual {v0}, La/qoi;->b()La/drc;

    .line 351
    .line 352
    .line 353
    move-result-object v49

    .line 354
    invoke-static/range {v49 .. v49}, La/x1x;->x(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v11}, La/sue;->e()La/fht0;

    .line 358
    .line 359
    .line 360
    move-result-object v50

    .line 361
    invoke-virtual {v5}, La/g45;->E()La/nou;

    .line 362
    .line 363
    .line 364
    move-result-object v51

    .line 365
    invoke-virtual {v13}, La/uii;->r()La/pru;

    .line 366
    .line 367
    .line 368
    move-result-object v52

    .line 369
    move-object/from16 v40, v3

    .line 370
    .line 371
    move-object/from16 v21, v26

    .line 372
    .line 373
    move-object/from16 v26, v24

    .line 374
    .line 375
    move-object/from16 v24, v20

    .line 376
    .line 377
    move-object/from16 v20, v12

    .line 378
    .line 379
    invoke-direct/range {v14 .. v52}, La/o030;-><init>(La/i1w0;La/e1u;La/jtj;La/pq;La/npx;La/ctf0;La/mii0;La/x20;La/je;La/bn6;La/ywq0;La/ouu;La/yk50;La/m0u;La/ahu;La/z220;La/xru;La/oif0;La/vyt;La/k7u;La/n660;La/reu;La/ali;La/cl5;La/hpc;La/duj;La/lbu;La/gud;La/xzp;La/esg0;La/x20;La/v88;La/hmt0;La/cr;La/drc;La/fht0;La/nou;La/pru;)V

    .line 380
    .line 381
    .line 382
    new-instance v0, La/xpr;

    .line 383
    .line 384
    invoke-interface {v8}, La/pcl0;->o()La/uyn;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v8}, La/pcl0;->d()La/a1d;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    iget-object v8, v1, La/wfi;->D:La/jw20;

    .line 399
    .line 400
    iget-object v8, v8, La/jw20;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v8, La/kki;

    .line 403
    .line 404
    invoke-virtual {v8}, La/kki;->t()La/eu90;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-direct {v0, v3, v5, v8}, La/xpr;-><init>(La/uyn;La/a1d;La/eu90;)V

    .line 412
    .line 413
    .line 414
    new-instance v11, La/es;

    .line 415
    .line 416
    iget-object v3, v4, La/vqc;->b:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v3, La/cih;

    .line 419
    .line 420
    invoke-virtual {v3}, La/cih;->a()La/uzc;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 428
    .line 429
    .line 430
    iput-object v2, v11, La/es;->a:Ljava/lang/Object;

    .line 431
    .line 432
    iput-object v10, v11, La/es;->b:Ljava/lang/Object;

    .line 433
    .line 434
    iput-object v3, v11, La/es;->c:Ljava/lang/Object;

    .line 435
    .line 436
    iget-object v12, v1, La/wfi;->E:La/pmi;

    .line 437
    .line 438
    iget-object v13, v1, La/wfi;->F:La/r9u;

    .line 439
    .line 440
    iget-object v3, v1, La/wfi;->G:La/pdf0;

    .line 441
    .line 442
    invoke-interface {v3}, La/pdf0;->c()La/owp0;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    iget-object v15, v1, La/wfi;->H:La/u8u;

    .line 450
    .line 451
    iget-object v4, v1, La/wfi;->I:La/edu;

    .line 452
    .line 453
    iget-object v1, v1, La/wfi;->J:La/h7u;

    .line 454
    .line 455
    new-instance v5, La/clc;

    .line 456
    .line 457
    const/4 v8, 0x5

    .line 458
    invoke-direct {v5, v10, v8}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 459
    .line 460
    .line 461
    new-instance v8, La/jqt;

    .line 462
    .line 463
    invoke-direct {v8, v2}, La/jqt;-><init>(La/gst0;)V

    .line 464
    .line 465
    .line 466
    move-object/from16 v2, p0

    .line 467
    .line 468
    move-object v10, v0

    .line 469
    move-object/from16 v17, v1

    .line 470
    .line 471
    move-object/from16 v16, v4

    .line 472
    .line 473
    move-object/from16 v18, v5

    .line 474
    .line 475
    move-object/from16 v19, v8

    .line 476
    .line 477
    move-object v8, v9

    .line 478
    move-object v9, v14

    .line 479
    move-object/from16 v0, v53

    .line 480
    .line 481
    move-object/from16 v4, v55

    .line 482
    .line 483
    move-object/from16 v5, v56

    .line 484
    .line 485
    move-object/from16 v1, p1

    .line 486
    .line 487
    move-object v14, v3

    .line 488
    move-object/from16 v3, v54

    .line 489
    .line 490
    invoke-direct/range {v0 .. v19}, La/sdn;-><init>(La/vzg0;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/mne;La/ctf0;La/x4u;La/f2v;La/w5z;La/pru;La/o030;La/xpr;La/es;La/pmi;La/r9u;La/owp0;La/u8u;La/edu;La/h7u;La/clc;La/jqt;)V

    .line 491
    .line 492
    .line 493
    return-object v0
.end method
