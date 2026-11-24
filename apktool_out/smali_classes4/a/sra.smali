.class public final synthetic La/sra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xra;


# direct methods
.method public synthetic constructor <init>(La/xra;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sra;->a:B

    iput-object p1, p0, La/sra;->b:La/xra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sra;->a:B

    .line 4
    .line 5
    const-string v2, "Cannot create dependency "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/sra;->b:La/xra;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/xra;->X1:La/cl5;

    .line 14
    .line 15
    new-instance v1, La/q0h0;

    .line 16
    .line 17
    iget-object v0, v0, La/xra;->N1:La/a8z;

    .line 18
    .line 19
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/qgi;

    .line 24
    .line 25
    iget-object v0, v0, La/qgi;->S:La/n5d0;

    .line 26
    .line 27
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/pgi;

    .line 32
    .line 33
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    sget-object v1, La/xra;->X1:La/cl5;

    .line 38
    .line 39
    new-instance v1, La/q0h0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, La/pbi;->c0:La/n5d0;

    .line 46
    .line 47
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/nbi;

    .line 52
    .line 53
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :pswitch_1
    sget-object v1, La/xra;->X1:La/cl5;

    .line 58
    .line 59
    new-instance v1, La/q0h0;

    .line 60
    .line 61
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v0, v0, La/pbi;->b0:La/n5d0;

    .line 66
    .line 67
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/mbi;

    .line 72
    .line 73
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :pswitch_2
    sget-object v1, La/xra;->X1:La/cl5;

    .line 78
    .line 79
    new-instance v1, La/q0h0;

    .line 80
    .line 81
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v0, v0, La/pbi;->a0:La/n5d0;

    .line 86
    .line 87
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/lbi;

    .line 92
    .line 93
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_3
    sget-object v1, La/xra;->X1:La/cl5;

    .line 98
    .line 99
    new-instance v1, La/q0h0;

    .line 100
    .line 101
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/pbi;->Y:La/n5d0;

    .line 106
    .line 107
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, La/jbi;

    .line 112
    .line 113
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :pswitch_4
    sget-object v1, La/xra;->X1:La/cl5;

    .line 118
    .line 119
    new-instance v1, La/q0h0;

    .line 120
    .line 121
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, La/pbi;->Z:La/n5d0;

    .line 126
    .line 127
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, La/kbi;

    .line 132
    .line 133
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 134
    .line 135
    .line 136
    return-object v1

    .line 137
    :pswitch_5
    sget-object v1, La/xra;->X1:La/cl5;

    .line 138
    .line 139
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    instance-of v4, v1, La/af3;

    .line 151
    .line 152
    if-eqz v4, :cond_0

    .line 153
    .line 154
    check-cast v1, La/af3;

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    move-object v1, v3

    .line 158
    :goto_0
    const-class v4, La/eep;

    .line 159
    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    check-cast v1, La/o5d0;

    .line 171
    .line 172
    if-eqz v1, :cond_1

    .line 173
    .line 174
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, La/ze3;

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_1
    move-object v1, v3

    .line 182
    :goto_1
    instance-of v5, v1, La/eep;

    .line 183
    .line 184
    if-nez v5, :cond_2

    .line 185
    .line 186
    move-object v1, v3

    .line 187
    :cond_2
    check-cast v1, La/eep;

    .line 188
    .line 189
    if-eqz v1, :cond_3

    .line 190
    .line 191
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v1, v0}, La/eep;->a(La/i1w0;)La/qgi;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    goto :goto_2

    .line 200
    :cond_3
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :goto_2
    return-object v3

    .line 208
    :pswitch_6
    sget-object v1, La/xra;->X1:La/cl5;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    instance-of v4, v1, La/af3;

    .line 222
    .line 223
    if-eqz v4, :cond_4

    .line 224
    .line 225
    check-cast v1, La/af3;

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_4
    move-object v1, v3

    .line 229
    :goto_3
    const-class v4, La/xsa;

    .line 230
    .line 231
    if-eqz v1, :cond_7

    .line 232
    .line 233
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, La/o5d0;

    .line 242
    .line 243
    if-eqz v1, :cond_5

    .line 244
    .line 245
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, La/ze3;

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_5
    move-object v1, v3

    .line 253
    :goto_4
    instance-of v5, v1, La/xsa;

    .line 254
    .line 255
    if-nez v5, :cond_6

    .line 256
    .line 257
    move-object v1, v3

    .line 258
    :cond_6
    check-cast v1, La/xsa;

    .line 259
    .line 260
    if-eqz v1, :cond_7

    .line 261
    .line 262
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 263
    .line 264
    .line 265
    move-result-object v34

    .line 266
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget-object v6, v1, La/xsa;->c:La/fvt0;

    .line 270
    .line 271
    iget-object v8, v1, La/xsa;->a:La/sue;

    .line 272
    .line 273
    iget-object v7, v1, La/xsa;->b:La/ljf0;

    .line 274
    .line 275
    iget-object v10, v1, La/xsa;->e:La/a1d;

    .line 276
    .line 277
    iget-object v9, v1, La/xsa;->f:La/nr00;

    .line 278
    .line 279
    iget-object v12, v1, La/xsa;->g:La/ugf0;

    .line 280
    .line 281
    iget-object v15, v1, La/xsa;->k:La/iip;

    .line 282
    .line 283
    iget-object v11, v1, La/xsa;->i:La/wdd0;

    .line 284
    .line 285
    iget-object v0, v1, La/xsa;->l:La/clc;

    .line 286
    .line 287
    iget-object v2, v1, La/xsa;->n:La/v88;

    .line 288
    .line 289
    iget-object v3, v1, La/xsa;->Q:La/y3v;

    .line 290
    .line 291
    iget-object v4, v1, La/xsa;->m:La/cad;

    .line 292
    .line 293
    iget-object v5, v1, La/xsa;->p:La/pru;

    .line 294
    .line 295
    iget-object v13, v1, La/xsa;->q:La/duj;

    .line 296
    .line 297
    iget-object v14, v1, La/xsa;->s:La/s31;

    .line 298
    .line 299
    move-object/from16 v19, v0

    .line 300
    .line 301
    iget-object v0, v1, La/xsa;->d:La/oct;

    .line 302
    .line 303
    move-object/from16 v30, v0

    .line 304
    .line 305
    iget-object v0, v1, La/xsa;->r:La/lbu;

    .line 306
    .line 307
    move-object/from16 v35, v0

    .line 308
    .line 309
    iget-object v0, v1, La/xsa;->v:La/pyg;

    .line 310
    .line 311
    move-object/from16 v16, v0

    .line 312
    .line 313
    iget-object v0, v1, La/xsa;->w:La/bwl;

    .line 314
    .line 315
    move-object/from16 v17, v0

    .line 316
    .line 317
    iget-object v0, v1, La/xsa;->x:La/ii;

    .line 318
    .line 319
    move-object/from16 v21, v0

    .line 320
    .line 321
    iget-object v0, v1, La/xsa;->y:La/e720;

    .line 322
    .line 323
    move-object/from16 v48, v0

    .line 324
    .line 325
    iget-object v0, v1, La/xsa;->z:La/mne;

    .line 326
    .line 327
    move-object/from16 v37, v0

    .line 328
    .line 329
    iget-object v0, v1, La/xsa;->A:La/qe50;

    .line 330
    .line 331
    move-object/from16 v18, v0

    .line 332
    .line 333
    iget-object v0, v1, La/xsa;->u:La/wsf0;

    .line 334
    .line 335
    move-object/from16 v20, v0

    .line 336
    .line 337
    iget-object v0, v1, La/xsa;->C:La/r9u;

    .line 338
    .line 339
    move-object/from16 v32, v0

    .line 340
    .line 341
    iget-object v0, v1, La/xsa;->o:La/t6p;

    .line 342
    .line 343
    move-object/from16 v25, v0

    .line 344
    .line 345
    iget-object v0, v1, La/xsa;->t:La/dn0;

    .line 346
    .line 347
    move-object/from16 v28, v0

    .line 348
    .line 349
    iget-object v0, v1, La/xsa;->B:La/hr00;

    .line 350
    .line 351
    move-object/from16 v22, v0

    .line 352
    .line 353
    iget-object v0, v1, La/xsa;->G:La/gst0;

    .line 354
    .line 355
    move-object/from16 v27, v0

    .line 356
    .line 357
    iget-object v0, v1, La/xsa;->E:La/wdk0;

    .line 358
    .line 359
    move-object/from16 v41, v0

    .line 360
    .line 361
    iget-object v0, v1, La/xsa;->D:La/m1e;

    .line 362
    .line 363
    move-object/from16 v26, v0

    .line 364
    .line 365
    iget-object v0, v1, La/xsa;->F:La/ctf0;

    .line 366
    .line 367
    move-object/from16 v42, v0

    .line 368
    .line 369
    iget-object v0, v1, La/xsa;->J:La/gg5;

    .line 370
    .line 371
    move-object/from16 v31, v13

    .line 372
    .line 373
    iget-object v13, v1, La/xsa;->j:La/xri;

    .line 374
    .line 375
    move-object/from16 v33, v14

    .line 376
    .line 377
    iget-object v14, v1, La/xsa;->h:La/itr;

    .line 378
    .line 379
    move-object/from16 v43, v0

    .line 380
    .line 381
    iget-object v0, v1, La/xsa;->K:La/y78;

    .line 382
    .line 383
    move-object/from16 v44, v0

    .line 384
    .line 385
    iget-object v0, v1, La/xsa;->H:La/ali;

    .line 386
    .line 387
    move-object/from16 v38, v0

    .line 388
    .line 389
    iget-object v0, v1, La/xsa;->I:La/ntu;

    .line 390
    .line 391
    move-object/from16 v39, v0

    .line 392
    .line 393
    iget-object v0, v1, La/xsa;->L:La/g2v;

    .line 394
    .line 395
    move-object/from16 v45, v0

    .line 396
    .line 397
    iget-object v0, v1, La/xsa;->O:La/h3c;

    .line 398
    .line 399
    move-object/from16 v46, v0

    .line 400
    .line 401
    iget-object v0, v1, La/xsa;->P:La/qv2;

    .line 402
    .line 403
    move-object/from16 v47, v0

    .line 404
    .line 405
    iget-object v0, v1, La/xsa;->M:La/cyu;

    .line 406
    .line 407
    move-object/from16 v23, v0

    .line 408
    .line 409
    iget-object v0, v1, La/xsa;->N:La/b3c0;

    .line 410
    .line 411
    move-object/from16 v24, v0

    .line 412
    .line 413
    iget-object v0, v1, La/xsa;->S:La/x20;

    .line 414
    .line 415
    move-object/from16 v49, v0

    .line 416
    .line 417
    iget-object v0, v1, La/xsa;->T:La/kt2;

    .line 418
    .line 419
    move-object/from16 v29, v0

    .line 420
    .line 421
    iget-object v0, v1, La/xsa;->R:La/mii0;

    .line 422
    .line 423
    move-object/from16 v50, v0

    .line 424
    .line 425
    iget-object v0, v1, La/xsa;->U:La/bn6;

    .line 426
    .line 427
    move-object/from16 v51, v0

    .line 428
    .line 429
    iget-object v0, v1, La/xsa;->V:La/je;

    .line 430
    .line 431
    move-object/from16 v52, v0

    .line 432
    .line 433
    iget-object v0, v1, La/xsa;->W:La/hsj;

    .line 434
    .line 435
    move-object/from16 v53, v0

    .line 436
    .line 437
    iget-object v0, v1, La/xsa;->X:La/s31;

    .line 438
    .line 439
    move-object/from16 v54, v0

    .line 440
    .line 441
    iget-object v0, v1, La/xsa;->Y:La/cyu;

    .line 442
    .line 443
    move-object/from16 v55, v0

    .line 444
    .line 445
    iget-object v0, v1, La/xsa;->Z:La/poq0;

    .line 446
    .line 447
    iget-object v1, v1, La/xsa;->a0:La/kys0;

    .line 448
    .line 449
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    move-object/from16 v36, v5

    .line 501
    .line 502
    new-instance v5, La/pbi;

    .line 503
    .line 504
    move-object/from16 v56, v1

    .line 505
    .line 506
    move-object/from16 v29, v2

    .line 507
    .line 508
    move-object/from16 v22, v3

    .line 509
    .line 510
    move-object/from16 v40, v4

    .line 511
    .line 512
    move-object/from16 v18, v20

    .line 513
    .line 514
    move-object/from16 v20, v0

    .line 515
    .line 516
    invoke-direct/range {v5 .. v56}, La/pbi;-><init>(La/fvt0;La/ljf0;La/sue;La/nr00;La/a1d;La/wdd0;La/ugf0;La/xri;La/itr;La/iip;La/pyg;La/bwl;La/wsf0;La/clc;La/poq0;La/ii;La/y3v;La/cyu;La/b3c0;La/t6p;La/m1e;La/gst0;La/dn0;La/v88;La/oct;La/duj;La/r9u;La/s31;La/i1w0;La/lbu;La/pru;La/mne;La/ali;La/ntu;La/cad;La/wdk0;La/ctf0;La/gg5;La/y78;La/g2v;La/h3c;La/qv2;La/e720;La/x20;La/mii0;La/bn6;La/je;La/hsj;La/s31;La/cyu;La/kys0;)V

    .line 517
    .line 518
    .line 519
    move-object v3, v5

    .line 520
    goto :goto_5

    .line 521
    :cond_7
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    :goto_5
    return-object v3

    .line 529
    :pswitch_7
    sget-object v1, La/xra;->X1:La/cl5;

    .line 530
    .line 531
    invoke-virtual {v0}, La/xra;->S0()La/k3t0;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sget-object v1, La/em2;->a:La/em2;

    .line 536
    .line 537
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_8
    sget-object v1, La/xra;->X1:La/cl5;

    .line 544
    .line 545
    invoke-virtual {v0}, La/xra;->R0()La/k3t0;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    sget-object v1, La/wi2;->a:La/wi2;

    .line 550
    .line 551
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_9
    sget-object v1, La/xra;->X1:La/cl5;

    .line 558
    .line 559
    invoke-virtual {v0}, La/xra;->Q0()La/k3t0;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sget-object v1, La/oh2;->a:La/oh2;

    .line 564
    .line 565
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_a
    sget-object v1, La/xra;->X1:La/cl5;

    .line 572
    .line 573
    invoke-virtual {v0}, La/xra;->M0()La/k3t0;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    sget-object v1, La/pk2;->a:La/pk2;

    .line 578
    .line 579
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_b
    sget-object v1, La/xra;->X1:La/cl5;

    .line 586
    .line 587
    invoke-virtual {v0}, La/xra;->S0()La/k3t0;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    sget-object v1, La/mm2;->a:La/mm2;

    .line 592
    .line 593
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_c
    sget-object v1, La/xra;->X1:La/cl5;

    .line 600
    .line 601
    invoke-virtual {v0}, La/xra;->P0()La/k3t0;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    sget-object v1, La/wf2;->a:La/wf2;

    .line 606
    .line 607
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object v0

    .line 613
    :pswitch_d
    sget-object v1, La/xra;->X1:La/cl5;

    .line 614
    .line 615
    invoke-virtual {v0}, La/xra;->M0()La/k3t0;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    sget-object v1, La/ok2;->a:La/ok2;

    .line 620
    .line 621
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_e
    sget-object v1, La/xra;->X1:La/cl5;

    .line 628
    .line 629
    new-instance v1, La/q0h0;

    .line 630
    .line 631
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    iget-object v0, v0, La/pbi;->d0:La/n5d0;

    .line 636
    .line 637
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    check-cast v0, La/obi;

    .line 642
    .line 643
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 644
    .line 645
    .line 646
    return-object v1

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
