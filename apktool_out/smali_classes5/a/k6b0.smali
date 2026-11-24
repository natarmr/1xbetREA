.class public final synthetic La/k6b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u6b0;


# direct methods
.method public synthetic constructor <init>(La/u6b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k6b0;->a:B

    iput-object p1, p0, La/k6b0;->b:La/u6b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 75

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k6b0;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x7

    .line 8
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x3

    .line 11
    iget-object v8, v0, La/k6b0;->b:La/u6b0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 17
    .line 18
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string v1, "sensor"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v6

    .line 32
    :goto_0
    instance-of v1, v0, Landroid/hardware/SensorManager;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move-object v6, v0

    .line 37
    check-cast v6, Landroid/hardware/SensorManager;

    .line 38
    .line 39
    :cond_1
    return-object v6

    .line 40
    :pswitch_0
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 41
    .line 42
    new-instance v0, La/gkv;

    .line 43
    .line 44
    new-instance v9, La/cz60;

    .line 45
    .line 46
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x18

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const-class v12, La/sbb0;

    .line 55
    .line 56
    const-string v13, "onShake"

    .line 57
    .line 58
    const-string v14, "onShake()V"

    .line 59
    .line 60
    invoke-direct/range {v9 .. v16}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v9}, La/gkv;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_1
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 68
    .line 69
    new-instance v0, La/q0h0;

    .line 70
    .line 71
    iget-object v1, v8, La/u6b0;->W1:La/n0o0;

    .line 72
    .line 73
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, La/cpi;

    .line 78
    .line 79
    iget-object v1, v1, La/cpi;->l0:La/n5d0;

    .line 80
    .line 81
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/bpi;

    .line 86
    .line 87
    invoke-direct {v0, v1}, La/q0h0;-><init>(La/p0h0;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_2
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 92
    .line 93
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    instance-of v1, v0, La/af3;

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    check-cast v0, La/af3;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move-object v0, v6

    .line 112
    :goto_1
    const-class v1, La/l9b0;

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/o5d0;

    .line 125
    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/ze3;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    move-object v0, v6

    .line 136
    :goto_2
    instance-of v2, v0, La/l9b0;

    .line 137
    .line 138
    if-nez v2, :cond_4

    .line 139
    .line 140
    move-object v0, v6

    .line 141
    :cond_4
    check-cast v0, La/l9b0;

    .line 142
    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    invoke-static {v8}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 146
    .line 147
    .line 148
    move-result-object v33

    .line 149
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v1, v0, La/l9b0;->Z:La/y3v;

    .line 153
    .line 154
    iget-object v10, v0, La/l9b0;->c:La/fvt0;

    .line 155
    .line 156
    iget-object v2, v0, La/l9b0;->e:La/nv20;

    .line 157
    .line 158
    iget-object v3, v0, La/l9b0;->R:La/pmi0;

    .line 159
    .line 160
    iget-object v4, v0, La/l9b0;->b:La/ugf0;

    .line 161
    .line 162
    iget-object v11, v0, La/l9b0;->d:La/jw20;

    .line 163
    .line 164
    iget-object v5, v0, La/l9b0;->f:La/iw20;

    .line 165
    .line 166
    iget-object v12, v0, La/l9b0;->g:La/hfk0;

    .line 167
    .line 168
    iget-object v13, v0, La/l9b0;->a:La/cad;

    .line 169
    .line 170
    iget-object v6, v0, La/l9b0;->S:La/wsf0;

    .line 171
    .line 172
    iget-object v15, v0, La/l9b0;->h:La/nr00;

    .line 173
    .line 174
    iget-object v7, v0, La/l9b0;->l:La/mct;

    .line 175
    .line 176
    iget-object v8, v0, La/l9b0;->M:La/ii;

    .line 177
    .line 178
    iget-object v9, v0, La/l9b0;->i:La/pyg;

    .line 179
    .line 180
    iget-object v14, v0, La/l9b0;->j:La/zx10;

    .line 181
    .line 182
    move-object/from16 v42, v1

    .line 183
    .line 184
    iget-object v1, v0, La/l9b0;->k:La/ljf0;

    .line 185
    .line 186
    move-object/from16 v18, v1

    .line 187
    .line 188
    iget-object v1, v0, La/l9b0;->m:La/m1e;

    .line 189
    .line 190
    move-object/from16 v16, v1

    .line 191
    .line 192
    iget-object v1, v0, La/l9b0;->n:La/pru;

    .line 193
    .line 194
    move-object/from16 v38, v1

    .line 195
    .line 196
    iget-object v1, v0, La/l9b0;->p:La/ctf0;

    .line 197
    .line 198
    move-object/from16 v39, v1

    .line 199
    .line 200
    iget-object v1, v0, La/l9b0;->q:La/vqc;

    .line 201
    .line 202
    move-object/from16 v40, v1

    .line 203
    .line 204
    iget-object v1, v0, La/l9b0;->r:La/uyu;

    .line 205
    .line 206
    move-object/from16 v45, v1

    .line 207
    .line 208
    iget-object v1, v0, La/l9b0;->s:La/wyu;

    .line 209
    .line 210
    move-object/from16 v46, v1

    .line 211
    .line 212
    iget-object v1, v0, La/l9b0;->t:La/lbu;

    .line 213
    .line 214
    move-object/from16 v47, v1

    .line 215
    .line 216
    iget-object v1, v0, La/l9b0;->u:La/v88;

    .line 217
    .line 218
    move-object/from16 v48, v1

    .line 219
    .line 220
    iget-object v1, v0, La/l9b0;->w:La/duj;

    .line 221
    .line 222
    move-object/from16 v49, v1

    .line 223
    .line 224
    iget-object v1, v0, La/l9b0;->x:La/lbu;

    .line 225
    .line 226
    move-object/from16 v50, v1

    .line 227
    .line 228
    iget-object v1, v0, La/l9b0;->y:La/ani0;

    .line 229
    .line 230
    move-object/from16 v51, v1

    .line 231
    .line 232
    iget-object v1, v0, La/l9b0;->z:La/poq0;

    .line 233
    .line 234
    move-object/from16 v52, v1

    .line 235
    .line 236
    iget-object v1, v0, La/l9b0;->A:La/std;

    .line 237
    .line 238
    move-object/from16 v53, v1

    .line 239
    .line 240
    iget-object v1, v0, La/l9b0;->v:La/sd60;

    .line 241
    .line 242
    move-object/from16 v37, v1

    .line 243
    .line 244
    iget-object v1, v0, La/l9b0;->B:La/qe50;

    .line 245
    .line 246
    move-object/from16 v17, v1

    .line 247
    .line 248
    iget-object v1, v0, La/l9b0;->I:La/btt0;

    .line 249
    .line 250
    move-object/from16 v19, v1

    .line 251
    .line 252
    iget-object v1, v0, La/l9b0;->H:La/b3c0;

    .line 253
    .line 254
    move-object/from16 v41, v1

    .line 255
    .line 256
    iget-object v1, v0, La/l9b0;->C:La/ouu;

    .line 257
    .line 258
    move-object/from16 v54, v1

    .line 259
    .line 260
    iget-object v1, v0, La/l9b0;->D:La/s31;

    .line 261
    .line 262
    move-object/from16 v55, v1

    .line 263
    .line 264
    iget-object v1, v0, La/l9b0;->E:La/zg;

    .line 265
    .line 266
    move-object/from16 v56, v1

    .line 267
    .line 268
    iget-object v1, v0, La/l9b0;->F:La/yo4;

    .line 269
    .line 270
    move-object/from16 v57, v1

    .line 271
    .line 272
    iget-object v1, v0, La/l9b0;->K:La/ntu;

    .line 273
    .line 274
    move-object/from16 v58, v1

    .line 275
    .line 276
    iget-object v1, v0, La/l9b0;->L:La/rrc;

    .line 277
    .line 278
    move-object/from16 v59, v1

    .line 279
    .line 280
    iget-object v1, v0, La/l9b0;->G:La/gst0;

    .line 281
    .line 282
    move-object/from16 v36, v1

    .line 283
    .line 284
    iget-object v1, v0, La/l9b0;->N:La/ljf0;

    .line 285
    .line 286
    move-object/from16 v20, v1

    .line 287
    .line 288
    iget-object v1, v0, La/l9b0;->O:La/xri;

    .line 289
    .line 290
    move-object/from16 v21, v1

    .line 291
    .line 292
    iget-object v1, v0, La/l9b0;->P:La/itr;

    .line 293
    .line 294
    move-object/from16 v22, v1

    .line 295
    .line 296
    iget-object v1, v0, La/l9b0;->Q:La/j1q0;

    .line 297
    .line 298
    move-object/from16 v23, v1

    .line 299
    .line 300
    iget-object v1, v0, La/l9b0;->T:La/hzu;

    .line 301
    .line 302
    move-object/from16 v43, v1

    .line 303
    .line 304
    iget-object v1, v0, La/l9b0;->U:La/lyt;

    .line 305
    .line 306
    move-object/from16 v44, v1

    .line 307
    .line 308
    iget-object v1, v0, La/l9b0;->W:La/lbu;

    .line 309
    .line 310
    move-object/from16 v35, v1

    .line 311
    .line 312
    iget-object v1, v0, La/l9b0;->X:La/kl5;

    .line 313
    .line 314
    move-object/from16 v60, v1

    .line 315
    .line 316
    iget-object v1, v0, La/l9b0;->V:La/uzc0;

    .line 317
    .line 318
    move-object/from16 v34, v1

    .line 319
    .line 320
    iget-object v1, v0, La/l9b0;->Y:La/wdk0;

    .line 321
    .line 322
    move-object/from16 v61, v1

    .line 323
    .line 324
    iget-object v1, v0, La/l9b0;->p0:La/n4u;

    .line 325
    .line 326
    move-object/from16 v62, v1

    .line 327
    .line 328
    iget-object v1, v0, La/l9b0;->a0:La/hn4;

    .line 329
    .line 330
    move-object/from16 v24, v1

    .line 331
    .line 332
    iget-object v1, v0, La/l9b0;->o:La/kib0;

    .line 333
    .line 334
    move-object/from16 v27, v1

    .line 335
    .line 336
    iget-object v1, v0, La/l9b0;->b0:La/d1p;

    .line 337
    .line 338
    move-object/from16 v28, v1

    .line 339
    .line 340
    iget-object v1, v0, La/l9b0;->c0:La/wdd0;

    .line 341
    .line 342
    move-object/from16 v29, v1

    .line 343
    .line 344
    iget-object v1, v0, La/l9b0;->d0:La/grj;

    .line 345
    .line 346
    move-object/from16 v63, v1

    .line 347
    .line 348
    iget-object v1, v0, La/l9b0;->e0:La/jlx;

    .line 349
    .line 350
    move-object/from16 v64, v1

    .line 351
    .line 352
    iget-object v1, v0, La/l9b0;->f0:La/qho;

    .line 353
    .line 354
    move-object/from16 v65, v1

    .line 355
    .line 356
    iget-object v1, v0, La/l9b0;->g0:La/qyg0;

    .line 357
    .line 358
    move-object/from16 v66, v1

    .line 359
    .line 360
    iget-object v1, v0, La/l9b0;->h0:La/pyg0;

    .line 361
    .line 362
    move-object/from16 v67, v1

    .line 363
    .line 364
    iget-object v1, v0, La/l9b0;->i0:La/vwb0;

    .line 365
    .line 366
    move-object/from16 v68, v1

    .line 367
    .line 368
    iget-object v1, v0, La/l9b0;->j0:La/svs0;

    .line 369
    .line 370
    move-object/from16 v69, v1

    .line 371
    .line 372
    iget-object v1, v0, La/l9b0;->k0:La/pbt;

    .line 373
    .line 374
    move-object/from16 v25, v1

    .line 375
    .line 376
    iget-object v1, v0, La/l9b0;->l0:La/l570;

    .line 377
    .line 378
    move-object/from16 v70, v1

    .line 379
    .line 380
    iget-object v1, v0, La/l9b0;->m0:La/n4u;

    .line 381
    .line 382
    move-object/from16 v71, v1

    .line 383
    .line 384
    iget-object v1, v0, La/l9b0;->n0:La/o3c;

    .line 385
    .line 386
    move-object/from16 v72, v1

    .line 387
    .line 388
    iget-object v1, v0, La/l9b0;->o0:La/ytt;

    .line 389
    .line 390
    move-object/from16 v73, v1

    .line 391
    .line 392
    iget-object v1, v0, La/l9b0;->J:La/onv;

    .line 393
    .line 394
    iget-object v0, v0, La/l9b0;->q0:La/c8c;

    .line 395
    .line 396
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v61 .. v61}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v68 .. v68}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-object/from16 v16, v9

    .line 460
    .line 461
    new-instance v9, La/cpi;

    .line 462
    .line 463
    move-object/from16 v74, v0

    .line 464
    .line 465
    move-object/from16 v30, v1

    .line 466
    .line 467
    move-object/from16 v25, v2

    .line 468
    .line 469
    move-object/from16 v32, v3

    .line 470
    .line 471
    move-object/from16 v23, v5

    .line 472
    .line 473
    move-object/from16 v19, v6

    .line 474
    .line 475
    move-object/from16 v26, v7

    .line 476
    .line 477
    move-object/from16 v31, v8

    .line 478
    .line 479
    move-object/from16 v17, v24

    .line 480
    .line 481
    move-object/from16 v24, v4

    .line 482
    .line 483
    invoke-direct/range {v9 .. v74}, La/cpi;-><init>(La/fvt0;La/jw20;La/hfk0;La/cad;La/zx10;La/nr00;La/pyg;La/hn4;La/ljf0;La/wsf0;La/ljf0;La/xri;La/itr;La/iw20;La/ugf0;La/nv20;La/mct;La/kib0;La/d1p;La/wdd0;La/onv;La/ii;La/pmi0;La/i1w0;La/uzc0;La/lbu;La/gst0;La/sd60;La/pru;La/ctf0;La/vqc;La/b3c0;La/y3v;La/hzu;La/lyt;La/uyu;La/wyu;La/lbu;La/v88;La/duj;La/lbu;La/ani0;La/poq0;La/std;La/ouu;La/s31;La/zg;La/yo4;La/ntu;La/rrc;La/kl5;La/wdk0;La/n4u;La/grj;La/jlx;La/qho;La/qyg0;La/pyg0;La/vwb0;La/svs0;La/l570;La/n4u;La/o3c;La/ytt;La/c8c;)V

    .line 484
    .line 485
    .line 486
    move-object v6, v9

    .line 487
    goto :goto_3

    .line 488
    :cond_5
    const-string v0, "Cannot create dependency "

    .line 489
    .line 490
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    :goto_3
    return-object v6

    .line 498
    :pswitch_3
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 499
    .line 500
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    iget-object v0, v0, La/sbb0;->A:La/ouu;

    .line 505
    .line 506
    new-instance v1, La/za50;

    .line 507
    .line 508
    const-wide/16 v6, 0x0

    .line 509
    .line 510
    const/4 v3, 0x7

    .line 511
    const/4 v2, 0x0

    .line 512
    const-wide/16 v4, 0x0

    .line 513
    .line 514
    invoke-direct/range {v1 .. v7}, La/za50;-><init>(IIJJ)V

    .line 515
    .line 516
    .line 517
    iget-object v0, v0, La/ouu;->b:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v0, La/qe50;

    .line 520
    .line 521
    invoke-virtual {v0, v1, v2}, La/qe50;->a(La/cb50;Z)V

    .line 522
    .line 523
    .line 524
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_4
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 528
    .line 529
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 534
    .line 535
    .line 536
    move-result-object v8

    .line 537
    iget-object v1, v0, La/sbb0;->q:La/mne;

    .line 538
    .line 539
    iget-object v11, v1, La/mne;->a:La/rwj;

    .line 540
    .line 541
    new-instance v9, La/gab0;

    .line 542
    .line 543
    invoke-direct {v9, v0, v4}, La/gab0;-><init>(La/sbb0;B)V

    .line 544
    .line 545
    .line 546
    new-instance v12, La/mab0;

    .line 547
    .line 548
    invoke-direct {v12, v0, v6, v7}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 549
    .line 550
    .line 551
    const/16 v13, 0xa

    .line 552
    .line 553
    const/4 v10, 0x0

    .line 554
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 555
    .line 556
    .line 557
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_5
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 561
    .line 562
    iget-object v2, v0, La/k6b0;->b:La/u6b0;

    .line 563
    .line 564
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 565
    .line 566
    if-eqz v0, :cond_7

    .line 567
    .line 568
    const-string v1, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 569
    .line 570
    const-string v3, ""

    .line 571
    .line 572
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    if-nez v4, :cond_6

    .line 577
    .line 578
    goto :goto_4

    .line 579
    :cond_6
    invoke-virtual {v2}, La/u6b0;->H0()La/wdk0;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    const v0, 0x7f130671

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    const v0, 0x7f080467

    .line 594
    .line 595
    .line 596
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    invoke-virtual {v2}, La/u6b0;->I0()La/m9b0;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    iget-object v9, v0, La/m9b0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 605
    .line 606
    const/16 v10, 0x10

    .line 607
    .line 608
    const/4 v7, 0x0

    .line 609
    move-object v5, v4

    .line 610
    invoke-static/range {v2 .. v10}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 611
    .line 612
    .line 613
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 614
    .line 615
    goto :goto_5

    .line 616
    :cond_7
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 617
    .line 618
    :goto_5
    return-object v0

    .line 619
    :pswitch_6
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 620
    .line 621
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    iget-object v1, v0, La/sbb0;->i:La/v88;

    .line 626
    .line 627
    iget-object v0, v0, La/sbb0;->h:La/i1w0;

    .line 628
    .line 629
    invoke-static {v1, v0, v2, v3, v5}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 630
    .line 631
    .line 632
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_7
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 636
    .line 637
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    iget-object v1, v0, La/sbb0;->i:La/v88;

    .line 642
    .line 643
    iget-object v0, v0, La/sbb0;->h:La/i1w0;

    .line 644
    .line 645
    invoke-static {v1, v0, v2, v3, v5}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 646
    .line 647
    .line 648
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 649
    .line 650
    return-object v0

    .line 651
    :pswitch_8
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 652
    .line 653
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    iget-object v1, v0, La/sbb0;->h:La/i1w0;

    .line 658
    .line 659
    new-instance v2, La/gab0;

    .line 660
    .line 661
    invoke-direct {v2, v0, v7}, La/gab0;-><init>(La/sbb0;B)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 665
    .line 666
    .line 667
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_9
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 671
    .line 672
    new-instance v0, La/rwk0;

    .line 673
    .line 674
    new-instance v9, La/wma0;

    .line 675
    .line 676
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 677
    .line 678
    .line 679
    move-result-object v11

    .line 680
    const/4 v15, 0x0

    .line 681
    const/16 v16, 0x19

    .line 682
    .line 683
    const/4 v10, 0x1

    .line 684
    const-class v12, La/sbb0;

    .line 685
    .line 686
    const-string v13, "onSpecialEventClick"

    .line 687
    .line 688
    const-string v14, "onSpecialEventClick(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/adapters/special_events/models/SpecialEventUiModel;)V"

    .line 689
    .line 690
    invoke-direct/range {v9 .. v16}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 691
    .line 692
    .line 693
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 694
    .line 695
    .line 696
    new-instance v1, La/jak0;

    .line 697
    .line 698
    invoke-direct {v1, v4}, La/jak0;-><init>(B)V

    .line 699
    .line 700
    .line 701
    new-instance v2, La/ejk0;

    .line 702
    .line 703
    invoke-direct {v2, v5}, La/ejk0;-><init>(B)V

    .line 704
    .line 705
    .line 706
    new-instance v3, La/asj0;

    .line 707
    .line 708
    invoke-direct {v3, v7, v7}, La/asj0;-><init>(IB)V

    .line 709
    .line 710
    .line 711
    sget-object v4, La/wjj0;->j:La/wjj0;

    .line 712
    .line 713
    new-instance v5, La/gbn;

    .line 714
    .line 715
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 716
    .line 717
    .line 718
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 719
    .line 720
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 721
    .line 722
    .line 723
    new-instance v2, La/jak0;

    .line 724
    .line 725
    const/16 v3, 0xf

    .line 726
    .line 727
    invoke-direct {v2, v3}, La/jak0;-><init>(B)V

    .line 728
    .line 729
    .line 730
    new-instance v3, La/rai0;

    .line 731
    .line 732
    const/16 v4, 0x1c

    .line 733
    .line 734
    invoke-direct {v3, v9, v4}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 735
    .line 736
    .line 737
    new-instance v4, La/asj0;

    .line 738
    .line 739
    const/4 v5, 0x4

    .line 740
    invoke-direct {v4, v7, v5}, La/asj0;-><init>(IB)V

    .line 741
    .line 742
    .line 743
    sget-object v5, La/wjj0;->k:La/wjj0;

    .line 744
    .line 745
    new-instance v6, La/gbn;

    .line 746
    .line 747
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v1, v6}, La/dp;->b(La/gbn;)V

    .line 751
    .line 752
    .line 753
    return-object v0

    .line 754
    :pswitch_a
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 755
    .line 756
    new-instance v0, La/kie0;

    .line 757
    .line 758
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 759
    .line 760
    .line 761
    new-instance v1, La/n6b0;

    .line 762
    .line 763
    invoke-direct {v1, v0, v8}, La/n6b0;-><init>(La/kie0;La/u6b0;)V

    .line 764
    .line 765
    .line 766
    return-object v1

    .line 767
    :pswitch_b
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 768
    .line 769
    invoke-virtual {v8}, La/u6b0;->J0()La/sbb0;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    iget-object v1, v0, La/sbb0;->h:La/i1w0;

    .line 774
    .line 775
    new-instance v2, La/gab0;

    .line 776
    .line 777
    invoke-direct {v2, v0, v7}, La/gab0;-><init>(La/sbb0;B)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 781
    .line 782
    .line 783
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 784
    .line 785
    return-object v0

    .line 786
    nop

    .line 787
    :pswitch_data_0
    .packed-switch 0x0
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
