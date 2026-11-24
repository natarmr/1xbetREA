.class public final La/tii;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tii;->a:B

    iput-object p1, p0, La/tii;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tii;->a:B

    .line 4
    .line 5
    const/4 v4, 0x2

    .line 6
    const/16 v5, 0x12

    .line 7
    .line 8
    const/4 v6, 0x3

    .line 9
    const/4 v8, 0x0

    .line 10
    iget-object v9, v0, La/tii;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v0, La/qi10;

    .line 16
    .line 17
    check-cast v9, La/mii0;

    .line 18
    .line 19
    new-instance v1, La/pyu;

    .line 20
    .line 21
    iget-object v2, v9, La/mii0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/gii0;

    .line 24
    .line 25
    const/16 v3, 0x16

    .line 26
    .line 27
    invoke-direct {v1, v2, v3}, La/pyu;-><init>(La/gii0;B)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v9, La/mii0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, La/btt0;

    .line 33
    .line 34
    invoke-direct {v0, v1, v2}, La/qi10;-><init>(La/pyu;La/btt0;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    new-instance v3, La/be10;

    .line 39
    .line 40
    check-cast v9, La/cr;

    .line 41
    .line 42
    iget-object v0, v9, La/cr;->c:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, v0

    .line 45
    check-cast v4, La/m1e;

    .line 46
    .line 47
    new-instance v5, La/o470;

    .line 48
    .line 49
    new-instance v0, La/hd10;

    .line 50
    .line 51
    iget-object v1, v9, La/cr;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, La/btt0;

    .line 54
    .line 55
    iget-object v2, v9, La/cr;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, La/knf0;

    .line 58
    .line 59
    iget-object v6, v9, La/cr;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v6, La/vby;

    .line 62
    .line 63
    iget-object v7, v9, La/cr;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, La/gii0;

    .line 66
    .line 67
    invoke-direct {v0, v1, v2, v6, v7}, La/hd10;-><init>(La/btt0;La/knf0;La/vby;La/gii0;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v5, v0}, La/o470;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v9, La/cr;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/cad;

    .line 76
    .line 77
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/psc;

    .line 80
    .line 81
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v9, La/cr;->i:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v7, v0

    .line 91
    check-cast v7, La/a6u;

    .line 92
    .line 93
    iget-object v0, v9, La/cr;->j:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v8, v0

    .line 96
    check-cast v8, La/ntu;

    .line 97
    .line 98
    iget-object v0, v9, La/cr;->k:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, La/wsf0;

    .line 101
    .line 102
    iget-object v1, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, La/g45;

    .line 105
    .line 106
    invoke-virtual {v1}, La/g45;->F()La/xru;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/g45;

    .line 113
    .line 114
    invoke-virtual {v0}, La/g45;->o0()La/hcp0;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    iget-object v0, v9, La/cr;->l:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v11, v0

    .line 121
    check-cast v11, La/j1q0;

    .line 122
    .line 123
    iget-object v0, v9, La/cr;->m:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v12, v0

    .line 126
    check-cast v12, La/v88;

    .line 127
    .line 128
    iget-object v0, v9, La/cr;->n:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v13, v0

    .line 131
    check-cast v13, La/i1w0;

    .line 132
    .line 133
    iget-object v0, v9, La/cr;->o:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v14, v0

    .line 136
    check-cast v14, La/ocl;

    .line 137
    .line 138
    iget-object v0, v9, La/cr;->p:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v15, v0

    .line 141
    check-cast v15, La/ctf0;

    .line 142
    .line 143
    iget-object v0, v9, La/cr;->b:Ljava/lang/Object;

    .line 144
    .line 145
    move-object/from16 v16, v0

    .line 146
    .line 147
    check-cast v16, La/duj;

    .line 148
    .line 149
    iget-object v0, v9, La/cr;->q:Ljava/lang/Object;

    .line 150
    .line 151
    move-object/from16 v17, v0

    .line 152
    .line 153
    check-cast v17, La/fd10;

    .line 154
    .line 155
    move-object v9, v1

    .line 156
    invoke-direct/range {v3 .. v17}, La/be10;-><init>(La/m1e;La/o470;La/mne;La/a6u;La/ntu;La/xru;La/hcp0;La/j1q0;La/v88;La/i1w0;La/ocl;La/ctf0;La/duj;La/fd10;)V

    .line 157
    .line 158
    .line 159
    return-object v3

    .line 160
    :pswitch_1
    new-instance v4, La/wx00;

    .line 161
    .line 162
    check-cast v9, La/v5i;

    .line 163
    .line 164
    iget-object v0, v9, La/v5i;->e:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    iget-object v0, v9, La/v5i;->f:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v6, v0

    .line 175
    check-cast v6, Ljava/lang/String;

    .line 176
    .line 177
    new-instance v7, La/yox;

    .line 178
    .line 179
    new-instance v0, La/zpu;

    .line 180
    .line 181
    new-instance v1, La/jru;

    .line 182
    .line 183
    iget-object v2, v9, La/v5i;->g:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, La/gii0;

    .line 186
    .line 187
    invoke-direct {v1, v2}, La/jru;-><init>(La/gii0;)V

    .line 188
    .line 189
    .line 190
    iget-object v2, v9, La/v5i;->h:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v2, La/btt0;

    .line 193
    .line 194
    invoke-direct {v0, v1, v2}, La/zpu;-><init>(La/jru;La/btt0;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {v7, v0}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget-object v0, v9, La/v5i;->i:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, La/iw20;

    .line 203
    .line 204
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, La/uii;

    .line 207
    .line 208
    invoke-virtual {v0}, La/uii;->e()La/noc;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    iget-object v0, v9, La/v5i;->j:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, La/pv00;

    .line 215
    .line 216
    iget-object v0, v0, La/pv00;->a:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, La/w9i;

    .line 219
    .line 220
    invoke-virtual {v0}, La/w9i;->b()La/woc;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v10, La/pek0;

    .line 225
    .line 226
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 227
    .line 228
    .line 229
    iget-object v1, v9, La/v5i;->k:Ljava/lang/Object;

    .line 230
    .line 231
    move-object v11, v1

    .line 232
    check-cast v11, La/nr;

    .line 233
    .line 234
    new-instance v12, La/wsf0;

    .line 235
    .line 236
    iget-object v1, v9, La/v5i;->l:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v1, La/sv3;

    .line 239
    .line 240
    invoke-direct {v12, v1}, La/wsf0;-><init>(La/sv3;)V

    .line 241
    .line 242
    .line 243
    iget-object v1, v9, La/v5i;->m:Ljava/lang/Object;

    .line 244
    .line 245
    move-object v13, v1

    .line 246
    check-cast v13, La/zsr;

    .line 247
    .line 248
    iget-object v1, v9, La/v5i;->c:Ljava/lang/Object;

    .line 249
    .line 250
    move-object v14, v1

    .line 251
    check-cast v14, La/duj;

    .line 252
    .line 253
    iget-object v1, v9, La/v5i;->n:Ljava/lang/Object;

    .line 254
    .line 255
    move-object v15, v1

    .line 256
    check-cast v15, La/rqj0;

    .line 257
    .line 258
    iget-object v1, v9, La/v5i;->b:Ljava/lang/Object;

    .line 259
    .line 260
    move-object/from16 v16, v1

    .line 261
    .line 262
    check-cast v16, La/ctf0;

    .line 263
    .line 264
    iget-object v1, v9, La/v5i;->o:Ljava/lang/Object;

    .line 265
    .line 266
    move-object/from16 v17, v1

    .line 267
    .line 268
    check-cast v17, La/mne;

    .line 269
    .line 270
    iget-object v1, v9, La/v5i;->p:Ljava/lang/Object;

    .line 271
    .line 272
    move-object/from16 v18, v1

    .line 273
    .line 274
    check-cast v18, La/s64;

    .line 275
    .line 276
    iget-object v1, v9, La/v5i;->q:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v1, La/kib0;

    .line 279
    .line 280
    invoke-interface {v1}, La/kib0;->f()La/nrc;

    .line 281
    .line 282
    .line 283
    move-result-object v19

    .line 284
    invoke-static/range {v19 .. v19}, La/x1x;->x(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object v1, v9, La/v5i;->r:Ljava/lang/Object;

    .line 288
    .line 289
    move-object/from16 v20, v1

    .line 290
    .line 291
    check-cast v20, La/psc;

    .line 292
    .line 293
    iget-object v1, v9, La/v5i;->s:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, La/sue;

    .line 296
    .line 297
    invoke-interface {v1}, La/sue;->g()La/yzn0;

    .line 298
    .line 299
    .line 300
    move-result-object v21

    .line 301
    invoke-static/range {v21 .. v21}, La/x1x;->x(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v9, La/v5i;->t:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, La/epi0;

    .line 307
    .line 308
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v1, La/xzp;

    .line 311
    .line 312
    invoke-virtual {v1}, La/xzp;->F()La/ljf0;

    .line 313
    .line 314
    .line 315
    move-result-object v22

    .line 316
    iget-object v1, v9, La/v5i;->u:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v1, La/ok50;

    .line 319
    .line 320
    iget-object v1, v1, La/ok50;->a:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v1, La/v8i;

    .line 323
    .line 324
    invoke-virtual {v1}, La/v8i;->b()La/gxu;

    .line 325
    .line 326
    .line 327
    move-result-object v23

    .line 328
    iget-object v1, v9, La/v5i;->d:Ljava/lang/Object;

    .line 329
    .line 330
    move-object/from16 v24, v1

    .line 331
    .line 332
    check-cast v24, La/sqx;

    .line 333
    .line 334
    move-object v9, v0

    .line 335
    invoke-direct/range {v4 .. v24}, La/wx00;-><init>(ZLjava/lang/String;La/yox;La/noc;La/woc;La/pek0;La/nr;La/wsf0;La/zsr;La/duj;La/rqj0;La/ctf0;La/mne;La/s64;La/nrc;La/psc;La/yzn0;La/ljf0;La/gxu;La/sqx;)V

    .line 336
    .line 337
    .line 338
    return-object v4

    .line 339
    :pswitch_2
    new-instance v1, La/yji;

    .line 340
    .line 341
    invoke-direct {v1, v0}, La/yji;-><init>(La/tii;)V

    .line 342
    .line 343
    .line 344
    return-object v1

    .line 345
    :pswitch_3
    new-instance v2, La/xm00;

    .line 346
    .line 347
    check-cast v9, La/gud;

    .line 348
    .line 349
    iget-object v0, v9, La/gud;->a:Ljava/lang/Object;

    .line 350
    .line 351
    move-object v3, v0

    .line 352
    check-cast v3, La/duj;

    .line 353
    .line 354
    iget-object v0, v9, La/gud;->b:Ljava/lang/Object;

    .line 355
    .line 356
    move-object v4, v0

    .line 357
    check-cast v4, La/ctf0;

    .line 358
    .line 359
    new-instance v5, La/gxu;

    .line 360
    .line 361
    iget-object v0, v9, La/gud;->c:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, La/gst0;

    .line 364
    .line 365
    new-instance v1, La/ywu;

    .line 366
    .line 367
    iget-object v6, v9, La/gud;->d:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v6, La/knf0;

    .line 370
    .line 371
    new-instance v10, La/svu;

    .line 372
    .line 373
    iget-object v11, v9, La/gud;->e:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v11, La/gii0;

    .line 376
    .line 377
    const/16 v12, 0x18

    .line 378
    .line 379
    invoke-direct {v10, v11, v12}, La/svu;-><init>(La/gii0;B)V

    .line 380
    .line 381
    .line 382
    iget-object v11, v9, La/gud;->f:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v11, La/cad;

    .line 385
    .line 386
    iget-object v12, v11, La/cad;->b:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v12, La/psc;

    .line 389
    .line 390
    invoke-virtual {v12}, La/psc;->h()La/mne;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    invoke-direct {v1, v6, v10, v12}, La/ywu;-><init>(La/knf0;La/svu;La/mne;)V

    .line 398
    .line 399
    .line 400
    iget-object v6, v9, La/gud;->g:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v6, La/vqc;

    .line 403
    .line 404
    iget-object v6, v6, La/vqc;->b:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v6, La/cih;

    .line 407
    .line 408
    invoke-virtual {v6}, La/cih;->a()La/uzc;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    invoke-direct {v5, v0, v1, v6}, La/gxu;-><init>(La/gst0;La/ywu;La/uzc;)V

    .line 413
    .line 414
    .line 415
    iget-object v0, v11, La/cad;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, La/psc;

    .line 418
    .line 419
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    new-instance v10, La/gbi;

    .line 427
    .line 428
    new-instance v11, La/gr00;

    .line 429
    .line 430
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    iget-object v0, v9, La/gud;->n:Ljava/lang/Object;

    .line 435
    .line 436
    move-object v13, v0

    .line 437
    check-cast v13, La/zfo;

    .line 438
    .line 439
    iget-object v0, v9, La/gud;->o:Ljava/lang/Object;

    .line 440
    .line 441
    move-object v14, v0

    .line 442
    check-cast v14, La/edo;

    .line 443
    .line 444
    iget-object v0, v9, La/gud;->p:Ljava/lang/Object;

    .line 445
    .line 446
    move-object v15, v0

    .line 447
    check-cast v15, La/ulk;

    .line 448
    .line 449
    iget-object v0, v9, La/gud;->q:Ljava/lang/Object;

    .line 450
    .line 451
    move-object/from16 v16, v0

    .line 452
    .line 453
    check-cast v16, La/j1q0;

    .line 454
    .line 455
    invoke-direct/range {v11 .. v16}, La/gr00;-><init>(La/g45;La/zfo;La/edo;La/ulk;La/j1q0;)V

    .line 456
    .line 457
    .line 458
    new-instance v12, La/yiu;

    .line 459
    .line 460
    iget-object v0, v9, La/gud;->q:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, La/j1q0;

    .line 463
    .line 464
    invoke-direct {v12, v0, v8}, La/yiu;-><init>(La/j1q0;B)V

    .line 465
    .line 466
    .line 467
    new-instance v13, La/vit0;

    .line 468
    .line 469
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 470
    .line 471
    .line 472
    move-result-object v14

    .line 473
    new-instance v15, La/xre;

    .line 474
    .line 475
    iget-object v0, v9, La/gud;->j:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, La/ave;

    .line 478
    .line 479
    invoke-direct {v15, v0, v8}, La/xre;-><init>(La/ave;B)V

    .line 480
    .line 481
    .line 482
    new-instance v1, La/chf0;

    .line 483
    .line 484
    iget-object v7, v9, La/gud;->r:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v7, La/rrc;

    .line 487
    .line 488
    iget-object v8, v9, La/gud;->s:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v8, La/vby;

    .line 491
    .line 492
    invoke-direct {v1, v7, v8}, La/chf0;-><init>(La/rrc;La/vby;)V

    .line 493
    .line 494
    .line 495
    move-object/from16 v16, v1

    .line 496
    .line 497
    new-instance v1, La/oif0;

    .line 498
    .line 499
    move-object/from16 p0, v2

    .line 500
    .line 501
    iget-object v2, v9, La/gud;->h:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v2, La/lye;

    .line 504
    .line 505
    move-object/from16 v29, v3

    .line 506
    .line 507
    iget-object v3, v9, La/gud;->i:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v3, La/m0f;

    .line 510
    .line 511
    invoke-direct {v1, v2, v3, v0}, La/oif0;-><init>(La/lye;La/m0f;La/ave;)V

    .line 512
    .line 513
    .line 514
    move-object/from16 v17, v1

    .line 515
    .line 516
    iget-object v1, v9, La/gud;->t:Ljava/lang/Object;

    .line 517
    .line 518
    move-object/from16 v18, v1

    .line 519
    .line 520
    check-cast v18, La/etj;

    .line 521
    .line 522
    const/16 v19, 0x1

    .line 523
    .line 524
    invoke-direct/range {v13 .. v19}, La/vit0;-><init>(La/g45;La/xre;La/chf0;La/oif0;La/etj;B)V

    .line 525
    .line 526
    .line 527
    new-instance v14, La/mpc;

    .line 528
    .line 529
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-direct {v14, v1}, La/mpc;-><init>(La/g45;)V

    .line 534
    .line 535
    .line 536
    new-instance v15, La/ni9;

    .line 537
    .line 538
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-direct {v15, v1}, La/ni9;-><init>(La/g45;)V

    .line 543
    .line 544
    .line 545
    new-instance v1, La/ert;

    .line 546
    .line 547
    move-object/from16 v30, v4

    .line 548
    .line 549
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    invoke-direct {v1, v4}, La/ert;-><init>(La/g45;)V

    .line 554
    .line 555
    .line 556
    new-instance v4, La/moi0;

    .line 557
    .line 558
    move-object/from16 v16, v1

    .line 559
    .line 560
    new-instance v1, La/khf0;

    .line 561
    .line 562
    move-object/from16 v31, v5

    .line 563
    .line 564
    iget-object v5, v9, La/gud;->l:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v5, La/q7d0;

    .line 567
    .line 568
    invoke-direct {v1, v2, v0, v5}, La/khf0;-><init>(La/lye;La/ave;La/q7d0;)V

    .line 569
    .line 570
    .line 571
    invoke-direct {v4, v1}, La/moi0;-><init>(La/khf0;)V

    .line 572
    .line 573
    .line 574
    new-instance v1, La/xzt;

    .line 575
    .line 576
    iget-object v5, v9, La/gud;->u:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v5, La/pru;

    .line 579
    .line 580
    move-object/from16 v17, v4

    .line 581
    .line 582
    const/4 v4, 0x0

    .line 583
    invoke-direct {v1, v5, v4}, La/xzt;-><init>(La/pru;B)V

    .line 584
    .line 585
    .line 586
    new-instance v19, La/vit0;

    .line 587
    .line 588
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 589
    .line 590
    .line 591
    move-result-object v22

    .line 592
    move-object/from16 v18, v1

    .line 593
    .line 594
    new-instance v1, La/xre;

    .line 595
    .line 596
    invoke-direct {v1, v0, v4}, La/xre;-><init>(La/ave;B)V

    .line 597
    .line 598
    .line 599
    new-instance v4, La/chf0;

    .line 600
    .line 601
    invoke-direct {v4, v7, v8}, La/chf0;-><init>(La/rrc;La/vby;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v23, v1

    .line 605
    .line 606
    new-instance v1, La/oif0;

    .line 607
    .line 608
    invoke-direct {v1, v2, v3, v0}, La/oif0;-><init>(La/lye;La/m0f;La/ave;)V

    .line 609
    .line 610
    .line 611
    iget-object v0, v9, La/gud;->t:Ljava/lang/Object;

    .line 612
    .line 613
    move-object/from16 v26, v0

    .line 614
    .line 615
    check-cast v26, La/etj;

    .line 616
    .line 617
    const/16 v27, 0x0

    .line 618
    .line 619
    move-object/from16 v25, v1

    .line 620
    .line 621
    move-object/from16 v24, v4

    .line 622
    .line 623
    move-object/from16 v21, v19

    .line 624
    .line 625
    invoke-direct/range {v21 .. v27}, La/vit0;-><init>(La/g45;La/xre;La/chf0;La/oif0;La/etj;B)V

    .line 626
    .line 627
    .line 628
    new-instance v0, La/znt;

    .line 629
    .line 630
    new-instance v1, La/chf0;

    .line 631
    .line 632
    invoke-direct {v1, v7, v8}, La/chf0;-><init>(La/rrc;La/vby;)V

    .line 633
    .line 634
    .line 635
    invoke-direct {v0, v1}, La/znt;-><init>(La/chf0;)V

    .line 636
    .line 637
    .line 638
    new-instance v1, La/mpc;

    .line 639
    .line 640
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-direct {v1, v2}, La/mpc;-><init>(La/g45;)V

    .line 645
    .line 646
    .line 647
    new-instance v2, La/jtj;

    .line 648
    .line 649
    new-instance v3, La/chf0;

    .line 650
    .line 651
    invoke-direct {v3, v7, v8}, La/chf0;-><init>(La/rrc;La/vby;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    const/4 v7, 0x1

    .line 659
    invoke-direct {v2, v3, v4, v7}, La/jtj;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 660
    .line 661
    .line 662
    new-instance v3, La/gs;

    .line 663
    .line 664
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    invoke-direct {v3, v4}, La/gs;-><init>(La/g45;)V

    .line 669
    .line 670
    .line 671
    new-instance v4, La/j9c;

    .line 672
    .line 673
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 674
    .line 675
    .line 676
    move-result-object v7

    .line 677
    invoke-direct {v4, v7}, La/j9c;-><init>(La/g45;)V

    .line 678
    .line 679
    .line 680
    new-instance v7, La/jtt;

    .line 681
    .line 682
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 683
    .line 684
    .line 685
    move-result-object v8

    .line 686
    invoke-direct {v7, v8}, La/jtt;-><init>(La/g45;)V

    .line 687
    .line 688
    .line 689
    new-instance v8, La/jtt;

    .line 690
    .line 691
    move-object/from16 v20, v0

    .line 692
    .line 693
    invoke-virtual {v9}, La/gud;->c()La/g45;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-direct {v8, v0}, La/jtt;-><init>(La/g45;)V

    .line 698
    .line 699
    .line 700
    iget-object v0, v9, La/gud;->w:Ljava/lang/Object;

    .line 701
    .line 702
    move-object/from16 v28, v0

    .line 703
    .line 704
    check-cast v28, La/r9u;

    .line 705
    .line 706
    move-object/from16 v21, v1

    .line 707
    .line 708
    move-object/from16 v22, v2

    .line 709
    .line 710
    move-object/from16 v23, v3

    .line 711
    .line 712
    move-object/from16 v24, v4

    .line 713
    .line 714
    move-object/from16 v27, v5

    .line 715
    .line 716
    move-object/from16 v25, v7

    .line 717
    .line 718
    move-object/from16 v26, v8

    .line 719
    .line 720
    invoke-direct/range {v10 .. v28}, La/gbi;-><init>(La/gr00;La/yiu;La/vit0;La/mpc;La/ni9;La/ert;La/moi0;La/xzt;La/vit0;La/znt;La/mpc;La/jtj;La/gs;La/j9c;La/jtt;La/jtt;La/pru;La/r9u;)V

    .line 721
    .line 722
    .line 723
    move-object/from16 v2, p0

    .line 724
    .line 725
    move-object v7, v10

    .line 726
    move-object/from16 v3, v29

    .line 727
    .line 728
    move-object/from16 v4, v30

    .line 729
    .line 730
    move-object/from16 v5, v31

    .line 731
    .line 732
    invoke-direct/range {v2 .. v7}, La/xm00;-><init>(La/duj;La/ctf0;La/gxu;La/mne;La/gbi;)V

    .line 733
    .line 734
    .line 735
    return-object v2

    .line 736
    :pswitch_4
    new-instance v1, La/vji;

    .line 737
    .line 738
    invoke-direct {v1, v0}, La/vji;-><init>(La/tii;)V

    .line 739
    .line 740
    .line 741
    return-object v1

    .line 742
    :pswitch_5
    new-instance v2, La/gb00;

    .line 743
    .line 744
    check-cast v9, La/v7i;

    .line 745
    .line 746
    iget-object v0, v9, La/v7i;->i:Ljava/lang/Object;

    .line 747
    .line 748
    move-object v3, v0

    .line 749
    check-cast v3, Ljava/lang/String;

    .line 750
    .line 751
    iget-object v0, v9, La/v7i;->e:Ljava/lang/Object;

    .line 752
    .line 753
    check-cast v0, Ljava/lang/Long;

    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 756
    .line 757
    .line 758
    move-result-wide v4

    .line 759
    iget-object v0, v9, La/v7i;->f:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v0, Ljava/lang/Integer;

    .line 762
    .line 763
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 764
    .line 765
    .line 766
    move-result v6

    .line 767
    iget-object v0, v9, La/v7i;->h:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v0, La/cad;

    .line 770
    .line 771
    iget-object v1, v0, La/cad;->b:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v1, La/psc;

    .line 774
    .line 775
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 776
    .line 777
    .line 778
    move-result-object v7

    .line 779
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    iget-object v1, v9, La/v7i;->k:Ljava/lang/Object;

    .line 783
    .line 784
    move-object v8, v1

    .line 785
    check-cast v8, La/i1w0;

    .line 786
    .line 787
    iget-object v1, v9, La/v7i;->a:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v1, La/ocl;

    .line 790
    .line 791
    iget-object v10, v9, La/v7i;->d:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v10, La/m1e;

    .line 794
    .line 795
    new-instance v11, La/e1u;

    .line 796
    .line 797
    new-instance v12, La/ywu;

    .line 798
    .line 799
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v0, La/psc;

    .line 802
    .line 803
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    new-instance v13, La/afm0;

    .line 811
    .line 812
    iget-object v14, v9, La/v7i;->m:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast v14, La/gii0;

    .line 815
    .line 816
    const/4 v15, 0x0

    .line 817
    invoke-direct {v13, v14, v15}, La/afm0;-><init>(La/gii0;B)V

    .line 818
    .line 819
    .line 820
    iget-object v14, v9, La/v7i;->b:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v14, La/knf0;

    .line 823
    .line 824
    invoke-direct {v12, v0, v13, v14}, La/ywu;-><init>(La/mne;La/afm0;La/knf0;)V

    .line 825
    .line 826
    .line 827
    const/16 v0, 0x17

    .line 828
    .line 829
    invoke-direct {v11, v12, v0}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 830
    .line 831
    .line 832
    iget-object v0, v9, La/v7i;->g:Ljava/lang/Object;

    .line 833
    .line 834
    move-object v12, v0

    .line 835
    check-cast v12, La/duj;

    .line 836
    .line 837
    new-instance v13, La/rl70;

    .line 838
    .line 839
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 840
    .line 841
    .line 842
    iget-object v0, v9, La/v7i;->n:Ljava/lang/Object;

    .line 843
    .line 844
    move-object v14, v0

    .line 845
    check-cast v14, La/wyu;

    .line 846
    .line 847
    iget-object v0, v9, La/v7i;->j:Ljava/lang/Object;

    .line 848
    .line 849
    move-object v15, v0

    .line 850
    check-cast v15, La/uyu;

    .line 851
    .line 852
    iget-object v0, v9, La/v7i;->l:Ljava/lang/Object;

    .line 853
    .line 854
    move-object/from16 v16, v0

    .line 855
    .line 856
    check-cast v16, La/r9u;

    .line 857
    .line 858
    iget-object v0, v9, La/v7i;->c:Ljava/lang/Object;

    .line 859
    .line 860
    move-object/from16 v17, v0

    .line 861
    .line 862
    check-cast v17, La/ctf0;

    .line 863
    .line 864
    move-object v9, v1

    .line 865
    invoke-direct/range {v2 .. v17}, La/gb00;-><init>(Ljava/lang/String;JILa/mne;La/i1w0;La/ocl;La/m1e;La/e1u;La/duj;La/rl70;La/wyu;La/uyu;La/r9u;La/ctf0;)V

    .line 866
    .line 867
    .line 868
    return-object v2

    .line 869
    :pswitch_6
    new-instance v1, La/qji;

    .line 870
    .line 871
    invoke-direct {v1, v0}, La/qji;-><init>(La/tii;)V

    .line 872
    .line 873
    .line 874
    return-object v1

    .line 875
    :pswitch_7
    new-instance v1, La/oji;

    .line 876
    .line 877
    invoke-direct {v1, v0}, La/oji;-><init>(La/tii;)V

    .line 878
    .line 879
    .line 880
    return-object v1

    .line 881
    :pswitch_8
    new-instance v2, La/eiz;

    .line 882
    .line 883
    check-cast v9, La/nji;

    .line 884
    .line 885
    iget-object v3, v9, La/nji;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 886
    .line 887
    iget-object v0, v9, La/nji;->b:La/cad;

    .line 888
    .line 889
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v0, La/psc;

    .line 892
    .line 893
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    iget-object v1, v9, La/nji;->c:La/m1e;

    .line 901
    .line 902
    iget-object v6, v9, La/nji;->d:La/g2v;

    .line 903
    .line 904
    iget-object v7, v9, La/nji;->e:La/ctf0;

    .line 905
    .line 906
    iget-object v8, v9, La/nji;->f:La/pyg;

    .line 907
    .line 908
    move-object v10, v8

    .line 909
    invoke-interface {v10}, La/pyg;->a()La/hzg;

    .line 910
    .line 911
    .line 912
    move-result-object v8

    .line 913
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    iget-object v11, v9, La/nji;->g:La/iip;

    .line 917
    .line 918
    invoke-interface {v11}, La/iip;->V()La/j3c;

    .line 919
    .line 920
    .line 921
    move-result-object v11

    .line 922
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    move-object v12, v10

    .line 926
    new-instance v10, La/cmt;

    .line 927
    .line 928
    invoke-interface {v12}, La/pyg;->b()La/dzg;

    .line 929
    .line 930
    .line 931
    move-result-object v13

    .line 932
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    invoke-direct {v10, v13, v5}, La/cmt;-><init>(Ljava/lang/Object;B)V

    .line 936
    .line 937
    .line 938
    move-object v5, v11

    .line 939
    new-instance v11, La/e1u;

    .line 940
    .line 941
    invoke-interface {v12}, La/pyg;->b()La/dzg;

    .line 942
    .line 943
    .line 944
    move-result-object v13

    .line 945
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    const/4 v14, 0x7

    .line 949
    invoke-direct {v11, v13, v14}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 950
    .line 951
    .line 952
    move-object v13, v12

    .line 953
    new-instance v12, La/n4u;

    .line 954
    .line 955
    invoke-interface {v13}, La/pyg;->b()La/dzg;

    .line 956
    .line 957
    .line 958
    move-result-object v14

    .line 959
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 960
    .line 961
    .line 962
    invoke-direct {v12, v14, v4}, La/n4u;-><init>(Ljava/lang/Object;B)V

    .line 963
    .line 964
    .line 965
    move-object v4, v13

    .line 966
    new-instance v13, La/rpt;

    .line 967
    .line 968
    invoke-interface {v4}, La/pyg;->b()La/dzg;

    .line 969
    .line 970
    .line 971
    move-result-object v4

    .line 972
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    invoke-direct {v13, v4}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    new-instance v14, La/ih5;

    .line 979
    .line 980
    iget-object v4, v9, La/nji;->h:La/kt2;

    .line 981
    .line 982
    const/4 v15, 0x1

    .line 983
    invoke-direct {v14, v4, v15}, La/ih5;-><init>(La/kt2;B)V

    .line 984
    .line 985
    .line 986
    iget-object v15, v9, La/nji;->i:La/zr1;

    .line 987
    .line 988
    move-object v4, v0

    .line 989
    move-object v9, v5

    .line 990
    move-object v5, v1

    .line 991
    invoke-direct/range {v2 .. v15}, La/eiz;-><init>(Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;La/mne;La/m1e;La/g2v;La/ctf0;La/hzg;La/j3c;La/cmt;La/e1u;La/n4u;La/rpt;La/ih5;La/zr1;)V

    .line 992
    .line 993
    .line 994
    return-object v2

    .line 995
    :pswitch_9
    new-instance v3, La/wzy;

    .line 996
    .line 997
    check-cast v9, La/daf;

    .line 998
    .line 999
    iget-object v0, v9, La/daf;->b:Ljava/lang/Object;

    .line 1000
    .line 1001
    move-object v4, v0

    .line 1002
    check-cast v4, La/duj;

    .line 1003
    .line 1004
    new-instance v5, La/reu;

    .line 1005
    .line 1006
    new-instance v0, La/yuu;

    .line 1007
    .line 1008
    new-instance v1, La/g090;

    .line 1009
    .line 1010
    iget-object v2, v9, La/daf;->c:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v2, La/gii0;

    .line 1013
    .line 1014
    invoke-direct {v1, v2, v6}, La/g090;-><init>(La/gii0;B)V

    .line 1015
    .line 1016
    .line 1017
    iget-object v2, v9, La/daf;->d:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v2, La/knf0;

    .line 1020
    .line 1021
    iget-object v6, v9, La/daf;->e:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v6, La/cad;

    .line 1024
    .line 1025
    iget-object v7, v6, La/cad;->b:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v7, La/psc;

    .line 1028
    .line 1029
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v7

    .line 1033
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-direct {v0, v7, v1, v2}, La/yuu;-><init>(La/mne;La/g090;La/knf0;)V

    .line 1037
    .line 1038
    .line 1039
    const/16 v1, 0x8

    .line 1040
    .line 1041
    invoke-direct {v5, v0, v1}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 1042
    .line 1043
    .line 1044
    iget-object v0, v9, La/daf;->f:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v0, La/m1e;

    .line 1047
    .line 1048
    iget-object v1, v9, La/daf;->g:Ljava/lang/Object;

    .line 1049
    .line 1050
    move-object v7, v1

    .line 1051
    check-cast v7, La/i1w0;

    .line 1052
    .line 1053
    iget-object v1, v9, La/daf;->h:Ljava/lang/Object;

    .line 1054
    .line 1055
    move-object v8, v1

    .line 1056
    check-cast v8, La/kki;

    .line 1057
    .line 1058
    iget-object v1, v9, La/daf;->i:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v1, La/ocl;

    .line 1061
    .line 1062
    iget-object v2, v9, La/daf;->j:Ljava/lang/Object;

    .line 1063
    .line 1064
    move-object v10, v2

    .line 1065
    check-cast v10, Ljava/lang/String;

    .line 1066
    .line 1067
    iget-object v2, v9, La/daf;->k:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v2, Ljava/lang/Long;

    .line 1070
    .line 1071
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v11

    .line 1075
    iget-object v2, v6, La/cad;->b:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v2, La/psc;

    .line 1078
    .line 1079
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v13

    .line 1083
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    iget-object v2, v9, La/daf;->l:Ljava/lang/Object;

    .line 1087
    .line 1088
    move-object v14, v2

    .line 1089
    check-cast v14, La/r9u;

    .line 1090
    .line 1091
    move-object v6, v0

    .line 1092
    move-object v9, v1

    .line 1093
    invoke-direct/range {v3 .. v14}, La/wzy;-><init>(La/duj;La/reu;La/m1e;La/i1w0;La/kki;La/ocl;Ljava/lang/String;JLa/mne;La/r9u;)V

    .line 1094
    .line 1095
    .line 1096
    return-object v3

    .line 1097
    :pswitch_a
    new-instance v4, La/ryy;

    .line 1098
    .line 1099
    check-cast v9, La/nc0;

    .line 1100
    .line 1101
    iget-object v0, v9, La/nc0;->d:Ljava/lang/Object;

    .line 1102
    .line 1103
    move-object v5, v0

    .line 1104
    check-cast v5, La/i1w0;

    .line 1105
    .line 1106
    iget-object v0, v9, La/nc0;->e:Ljava/lang/Object;

    .line 1107
    .line 1108
    move-object v6, v0

    .line 1109
    check-cast v6, Lorg/xplatform/ufc/api/last_fights/LastFightsParams;

    .line 1110
    .line 1111
    iget-object v0, v9, La/nc0;->c:Ljava/lang/Object;

    .line 1112
    .line 1113
    move-object v7, v0

    .line 1114
    check-cast v7, La/ctf0;

    .line 1115
    .line 1116
    iget-object v0, v9, La/nc0;->f:Ljava/lang/Object;

    .line 1117
    .line 1118
    move-object v8, v0

    .line 1119
    check-cast v8, La/kys0;

    .line 1120
    .line 1121
    iget-object v0, v9, La/nc0;->g:Ljava/lang/Object;

    .line 1122
    .line 1123
    check-cast v0, La/m1e;

    .line 1124
    .line 1125
    iget-object v1, v9, La/nc0;->b:Ljava/lang/Object;

    .line 1126
    .line 1127
    move-object v10, v1

    .line 1128
    check-cast v10, La/pru;

    .line 1129
    .line 1130
    iget-object v1, v9, La/nc0;->a:Ljava/lang/Object;

    .line 1131
    .line 1132
    move-object v11, v1

    .line 1133
    check-cast v11, La/g2v;

    .line 1134
    .line 1135
    iget-object v1, v9, La/nc0;->h:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v1, La/epi0;

    .line 1138
    .line 1139
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 1140
    .line 1141
    check-cast v1, La/xzp;

    .line 1142
    .line 1143
    invoke-virtual {v1}, La/xzp;->C()La/r9u;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v12

    .line 1147
    iget-object v1, v9, La/nc0;->i:Ljava/lang/Object;

    .line 1148
    .line 1149
    check-cast v1, La/iip;

    .line 1150
    .line 1151
    invoke-interface {v1}, La/iip;->V()La/j3c;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v13

    .line 1155
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1156
    .line 1157
    .line 1158
    iget-object v1, v9, La/nc0;->j:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v1, La/ugf0;

    .line 1161
    .line 1162
    iget-object v1, v1, La/ugf0;->a:Ljava/lang/Object;

    .line 1163
    .line 1164
    check-cast v1, La/daf;

    .line 1165
    .line 1166
    invoke-virtual {v1}, La/daf;->w()La/luu;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v14

    .line 1170
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1171
    .line 1172
    .line 1173
    new-instance v15, La/f4u;

    .line 1174
    .line 1175
    new-instance v1, La/edu;

    .line 1176
    .line 1177
    iget-object v2, v9, La/nc0;->k:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast v2, La/knf0;

    .line 1180
    .line 1181
    new-instance v3, La/zri;

    .line 1182
    .line 1183
    move-object/from16 p0, v0

    .line 1184
    .line 1185
    iget-object v0, v9, La/nc0;->l:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v0, La/gii0;

    .line 1188
    .line 1189
    move-object/from16 v16, v4

    .line 1190
    .line 1191
    const/16 v4, 0xd

    .line 1192
    .line 1193
    invoke-direct {v3, v0, v4}, La/zri;-><init>(La/gii0;B)V

    .line 1194
    .line 1195
    .line 1196
    invoke-direct {v1, v2, v3}, La/edu;-><init>(La/knf0;La/zri;)V

    .line 1197
    .line 1198
    .line 1199
    const/16 v0, 0xb

    .line 1200
    .line 1201
    invoke-direct {v15, v1, v0}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 1202
    .line 1203
    .line 1204
    iget-object v0, v9, La/nc0;->m:Ljava/lang/Object;

    .line 1205
    .line 1206
    check-cast v0, La/cad;

    .line 1207
    .line 1208
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v0, La/psc;

    .line 1211
    .line 1212
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1217
    .line 1218
    .line 1219
    move-object/from16 v9, p0

    .line 1220
    .line 1221
    move-object/from16 v4, v16

    .line 1222
    .line 1223
    move-object/from16 v16, v0

    .line 1224
    .line 1225
    invoke-direct/range {v4 .. v16}, La/ryy;-><init>(La/i1w0;Lorg/xplatform/ufc/api/last_fights/LastFightsParams;La/ctf0;La/kys0;La/m1e;La/pru;La/g2v;La/r9u;La/j3c;La/luu;La/f4u;La/mne;)V

    .line 1226
    .line 1227
    .line 1228
    move-object/from16 v16, v4

    .line 1229
    .line 1230
    return-object v16

    .line 1231
    :pswitch_b
    new-instance v1, La/lji;

    .line 1232
    .line 1233
    invoke-direct {v1, v0}, La/lji;-><init>(La/tii;)V

    .line 1234
    .line 1235
    .line 1236
    return-object v1

    .line 1237
    :pswitch_c
    new-instance v0, La/gj50;

    .line 1238
    .line 1239
    check-cast v9, La/oif0;

    .line 1240
    .line 1241
    iget-object v1, v9, La/oif0;->b:Ljava/lang/Object;

    .line 1242
    .line 1243
    check-cast v1, La/i1w0;

    .line 1244
    .line 1245
    iget-object v2, v9, La/oif0;->c:Ljava/lang/Object;

    .line 1246
    .line 1247
    check-cast v2, La/ilp0;

    .line 1248
    .line 1249
    iget-object v2, v2, La/ilp0;->a:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast v2, La/es;

    .line 1252
    .line 1253
    invoke-virtual {v2}, La/es;->k()La/drm0;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    invoke-direct {v0, v1, v2}, La/gj50;-><init>(La/i1w0;La/drm0;)V

    .line 1258
    .line 1259
    .line 1260
    return-object v0

    .line 1261
    :pswitch_d
    new-instance v0, La/oty;

    .line 1262
    .line 1263
    check-cast v9, La/c5k;

    .line 1264
    .line 1265
    iget-object v1, v9, La/c5k;->a:Ljava/lang/Object;

    .line 1266
    .line 1267
    check-cast v1, La/uyu;

    .line 1268
    .line 1269
    invoke-direct {v0, v1}, La/oty;-><init>(La/uyu;)V

    .line 1270
    .line 1271
    .line 1272
    return-object v0

    .line 1273
    :pswitch_e
    new-instance v1, La/kji;

    .line 1274
    .line 1275
    invoke-direct {v1, v0}, La/kji;-><init>(La/tii;)V

    .line 1276
    .line 1277
    .line 1278
    return-object v1

    .line 1279
    :pswitch_f
    new-instance v1, La/jji;

    .line 1280
    .line 1281
    invoke-direct {v1, v0}, La/jji;-><init>(La/tii;)V

    .line 1282
    .line 1283
    .line 1284
    return-object v1

    .line 1285
    :pswitch_10
    new-instance v1, La/hji;

    .line 1286
    .line 1287
    invoke-direct {v1, v0}, La/hji;-><init>(La/tii;)V

    .line 1288
    .line 1289
    .line 1290
    return-object v1

    .line 1291
    :pswitch_11
    new-instance v0, La/psr0;

    .line 1292
    .line 1293
    check-cast v9, La/cr;

    .line 1294
    .line 1295
    iget-object v1, v9, La/cr;->c:Ljava/lang/Object;

    .line 1296
    .line 1297
    check-cast v1, La/i1w0;

    .line 1298
    .line 1299
    iget-object v4, v9, La/cr;->d:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v4, La/duj;

    .line 1302
    .line 1303
    iget-object v5, v9, La/cr;->e:Ljava/lang/Object;

    .line 1304
    .line 1305
    check-cast v5, La/gle0;

    .line 1306
    .line 1307
    iget-object v7, v9, La/cr;->f:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v7, La/ctf0;

    .line 1310
    .line 1311
    iget-object v8, v9, La/cr;->g:Ljava/lang/Object;

    .line 1312
    .line 1313
    check-cast v8, La/sa10;

    .line 1314
    .line 1315
    iget-object v10, v9, La/cr;->h:Ljava/lang/Object;

    .line 1316
    .line 1317
    check-cast v10, La/m1e;

    .line 1318
    .line 1319
    iget-object v11, v9, La/cr;->i:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v11, La/cad;

    .line 1322
    .line 1323
    iget-object v11, v11, La/cad;->b:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v11, La/psc;

    .line 1326
    .line 1327
    invoke-virtual {v11}, La/psc;->h()La/mne;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v11

    .line 1331
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1332
    .line 1333
    .line 1334
    iget-object v12, v9, La/cr;->b:Ljava/lang/Object;

    .line 1335
    .line 1336
    check-cast v12, La/pru;

    .line 1337
    .line 1338
    move-object v13, v11

    .line 1339
    new-instance v11, La/lsn;

    .line 1340
    .line 1341
    new-instance v14, La/gxu;

    .line 1342
    .line 1343
    iget-object v15, v9, La/cr;->j:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v15, La/csr0;

    .line 1346
    .line 1347
    new-instance v2, La/ilp0;

    .line 1348
    .line 1349
    iget-object v3, v9, La/cr;->k:Ljava/lang/Object;

    .line 1350
    .line 1351
    check-cast v3, La/gii0;

    .line 1352
    .line 1353
    invoke-direct {v2, v3, v6}, La/ilp0;-><init>(La/gii0;B)V

    .line 1354
    .line 1355
    .line 1356
    iget-object v3, v9, La/cr;->l:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v3, La/knf0;

    .line 1359
    .line 1360
    invoke-direct {v14, v15, v2, v3}, La/gxu;-><init>(La/csr0;La/ilp0;La/knf0;)V

    .line 1361
    .line 1362
    .line 1363
    invoke-direct {v11, v14}, La/lsn;-><init>(Ljava/lang/Object;)V

    .line 1364
    .line 1365
    .line 1366
    move-object v2, v7

    .line 1367
    move-object v7, v8

    .line 1368
    move-object v8, v10

    .line 1369
    move-object v10, v12

    .line 1370
    new-instance v12, La/lhf0;

    .line 1371
    .line 1372
    new-instance v3, La/ngu;

    .line 1373
    .line 1374
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v14

    .line 1378
    invoke-direct {v3, v14}, La/ngu;-><init>(La/pzu;)V

    .line 1379
    .line 1380
    .line 1381
    iget-object v14, v9, La/cr;->p:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v14, La/wsf0;

    .line 1384
    .line 1385
    iget-object v15, v14, La/wsf0;->b:Ljava/lang/Object;

    .line 1386
    .line 1387
    check-cast v15, La/g45;

    .line 1388
    .line 1389
    invoke-virtual {v15}, La/g45;->y()La/ahu;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v15

    .line 1393
    invoke-virtual {v14}, La/wsf0;->b()La/ot;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v6

    .line 1397
    move-object/from16 p0, v0

    .line 1398
    .line 1399
    const/16 v0, 0x19

    .line 1400
    .line 1401
    invoke-direct {v12, v3, v15, v6, v0}, La/lhf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1402
    .line 1403
    .line 1404
    move-object v0, v13

    .line 1405
    new-instance v13, La/cmt;

    .line 1406
    .line 1407
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v3

    .line 1411
    const/4 v15, 0x1

    .line 1412
    invoke-direct {v13, v3, v15}, La/cmt;-><init>(Ljava/lang/Object;B)V

    .line 1413
    .line 1414
    .line 1415
    new-instance v3, La/ivn;

    .line 1416
    .line 1417
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v6

    .line 1421
    invoke-direct {v3, v6}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 1422
    .line 1423
    .line 1424
    new-instance v15, La/rqt;

    .line 1425
    .line 1426
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 1427
    .line 1428
    .line 1429
    new-instance v6, La/p4u;

    .line 1430
    .line 1431
    move-object/from16 v17, v0

    .line 1432
    .line 1433
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    invoke-direct {v6, v0}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 1438
    .line 1439
    .line 1440
    new-instance v0, La/x4u;

    .line 1441
    .line 1442
    move-object/from16 v19, v1

    .line 1443
    .line 1444
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    invoke-direct {v0, v1}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 1449
    .line 1450
    .line 1451
    new-instance v1, La/cu;

    .line 1452
    .line 1453
    move-object/from16 v20, v0

    .line 1454
    .line 1455
    new-instance v0, La/ngu;

    .line 1456
    .line 1457
    move-object/from16 v21, v2

    .line 1458
    .line 1459
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v2

    .line 1463
    invoke-direct {v0, v2}, La/ngu;-><init>(La/pzu;)V

    .line 1464
    .line 1465
    .line 1466
    new-instance v2, La/ivn;

    .line 1467
    .line 1468
    move-object/from16 v22, v3

    .line 1469
    .line 1470
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v3

    .line 1474
    invoke-direct {v2, v3}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 1475
    .line 1476
    .line 1477
    new-instance v3, La/hrc;

    .line 1478
    .line 1479
    move-object/from16 v23, v4

    .line 1480
    .line 1481
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v4

    .line 1485
    invoke-direct {v3, v4}, La/hrc;-><init>(La/pzu;)V

    .line 1486
    .line 1487
    .line 1488
    const/16 v4, 0xa

    .line 1489
    .line 1490
    invoke-direct {v1, v0, v2, v3, v4}, La/cu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1491
    .line 1492
    .line 1493
    new-instance v0, La/i1e0;

    .line 1494
    .line 1495
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v2

    .line 1499
    invoke-direct {v0, v2}, La/i1e0;-><init>(La/pzu;)V

    .line 1500
    .line 1501
    .line 1502
    new-instance v2, La/hrc;

    .line 1503
    .line 1504
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v3

    .line 1508
    invoke-direct {v2, v3}, La/hrc;-><init>(La/pzu;)V

    .line 1509
    .line 1510
    .line 1511
    new-instance v3, La/ngu;

    .line 1512
    .line 1513
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v4

    .line 1517
    invoke-direct {v3, v4}, La/ngu;-><init>(La/pzu;)V

    .line 1518
    .line 1519
    .line 1520
    new-instance v4, La/prc;

    .line 1521
    .line 1522
    move-object/from16 v16, v0

    .line 1523
    .line 1524
    invoke-virtual {v9}, La/cr;->h()La/pzu;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    move-object/from16 v24, v1

    .line 1529
    .line 1530
    const/4 v1, 0x3

    .line 1531
    invoke-direct {v4, v0, v1}, La/prc;-><init>(Ljava/lang/Object;B)V

    .line 1532
    .line 1533
    .line 1534
    iget-object v0, v14, La/wsf0;->b:Ljava/lang/Object;

    .line 1535
    .line 1536
    check-cast v0, La/g45;

    .line 1537
    .line 1538
    invoke-virtual {v0}, La/g45;->g()La/xex;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    iget-object v1, v9, La/cr;->r:Ljava/lang/Object;

    .line 1543
    .line 1544
    check-cast v1, La/r9u;

    .line 1545
    .line 1546
    move-object/from16 v9, v21

    .line 1547
    .line 1548
    move-object/from16 v21, v3

    .line 1549
    .line 1550
    move-object/from16 v3, v19

    .line 1551
    .line 1552
    move-object/from16 v19, v16

    .line 1553
    .line 1554
    move-object/from16 v16, v6

    .line 1555
    .line 1556
    move-object v6, v9

    .line 1557
    move-object/from16 v9, v17

    .line 1558
    .line 1559
    move-object/from16 v17, v20

    .line 1560
    .line 1561
    move-object/from16 v14, v22

    .line 1562
    .line 1563
    move-object/from16 v18, v24

    .line 1564
    .line 1565
    move-object/from16 v24, v1

    .line 1566
    .line 1567
    move-object/from16 v20, v2

    .line 1568
    .line 1569
    move-object/from16 v22, v4

    .line 1570
    .line 1571
    move-object/from16 v4, v23

    .line 1572
    .line 1573
    move-object/from16 v2, p0

    .line 1574
    .line 1575
    move-object/from16 v23, v0

    .line 1576
    .line 1577
    invoke-direct/range {v2 .. v24}, La/psr0;-><init>(La/i1w0;La/duj;La/gle0;La/ctf0;La/sa10;La/m1e;La/mne;La/pru;La/lsn;La/lhf0;La/cmt;La/ivn;La/rqt;La/p4u;La/x4u;La/cu;La/i1e0;La/hrc;La/ngu;La/prc;La/xex;La/r9u;)V

    .line 1578
    .line 1579
    .line 1580
    return-object v2

    .line 1581
    :pswitch_12
    new-instance v1, La/dji;

    .line 1582
    .line 1583
    invoke-direct {v1, v0}, La/dji;-><init>(La/tii;)V

    .line 1584
    .line 1585
    .line 1586
    return-object v1

    .line 1587
    :pswitch_13
    new-instance v2, La/hcx;

    .line 1588
    .line 1589
    check-cast v9, La/g45;

    .line 1590
    .line 1591
    new-instance v3, La/e1u;

    .line 1592
    .line 1593
    new-instance v0, La/yuu;

    .line 1594
    .line 1595
    new-instance v1, La/abu;

    .line 1596
    .line 1597
    iget-object v4, v9, La/g45;->a:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v4, La/gii0;

    .line 1600
    .line 1601
    invoke-direct {v1, v4, v5}, La/abu;-><init>(La/gii0;B)V

    .line 1602
    .line 1603
    .line 1604
    iget-object v4, v9, La/g45;->b:Ljava/lang/Object;

    .line 1605
    .line 1606
    check-cast v4, La/knf0;

    .line 1607
    .line 1608
    iget-object v5, v9, La/g45;->c:Ljava/lang/Object;

    .line 1609
    .line 1610
    check-cast v5, La/cad;

    .line 1611
    .line 1612
    iget-object v6, v5, La/cad;->b:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v6, La/psc;

    .line 1615
    .line 1616
    invoke-virtual {v6}, La/psc;->h()La/mne;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v6

    .line 1620
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1621
    .line 1622
    .line 1623
    invoke-direct {v0, v1, v4, v6}, La/yuu;-><init>(La/abu;La/knf0;La/mne;)V

    .line 1624
    .line 1625
    .line 1626
    const/16 v1, 0x13

    .line 1627
    .line 1628
    invoke-direct {v3, v0, v1}, La/e1u;-><init>(Ljava/lang/Object;B)V

    .line 1629
    .line 1630
    .line 1631
    iget-object v0, v9, La/g45;->d:Ljava/lang/Object;

    .line 1632
    .line 1633
    move-object v4, v0

    .line 1634
    check-cast v4, La/m1e;

    .line 1635
    .line 1636
    iget-object v0, v9, La/g45;->g:Ljava/lang/Object;

    .line 1637
    .line 1638
    check-cast v0, Ljava/lang/String;

    .line 1639
    .line 1640
    iget-object v1, v9, La/g45;->e:Ljava/lang/Object;

    .line 1641
    .line 1642
    move-object v6, v1

    .line 1643
    check-cast v6, La/i1w0;

    .line 1644
    .line 1645
    iget-object v1, v9, La/g45;->f:Ljava/lang/Object;

    .line 1646
    .line 1647
    move-object v7, v1

    .line 1648
    check-cast v7, La/ctf0;

    .line 1649
    .line 1650
    iget-object v1, v9, La/g45;->h:Ljava/lang/Object;

    .line 1651
    .line 1652
    move-object v8, v1

    .line 1653
    check-cast v8, La/ocl;

    .line 1654
    .line 1655
    iget-object v1, v5, La/cad;->b:Ljava/lang/Object;

    .line 1656
    .line 1657
    check-cast v1, La/psc;

    .line 1658
    .line 1659
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v9

    .line 1663
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1664
    .line 1665
    .line 1666
    move-object v5, v0

    .line 1667
    invoke-direct/range {v2 .. v9}, La/hcx;-><init>(La/e1u;La/m1e;Ljava/lang/String;La/i1w0;La/ctf0;La/ocl;La/mne;)V

    .line 1668
    .line 1669
    .line 1670
    return-object v2

    .line 1671
    :pswitch_14
    new-instance v1, La/cji;

    .line 1672
    .line 1673
    invoke-direct {v1, v0}, La/cji;-><init>(La/tii;)V

    .line 1674
    .line 1675
    .line 1676
    return-object v1

    .line 1677
    :pswitch_15
    new-instance v1, La/aji;

    .line 1678
    .line 1679
    invoke-direct {v1, v0}, La/aji;-><init>(La/tii;)V

    .line 1680
    .line 1681
    .line 1682
    return-object v1

    .line 1683
    :pswitch_16
    new-instance v2, La/krw;

    .line 1684
    .line 1685
    check-cast v9, La/o3c;

    .line 1686
    .line 1687
    iget-object v0, v9, La/o3c;->a:Ljava/lang/Object;

    .line 1688
    .line 1689
    move-object v3, v0

    .line 1690
    check-cast v3, Ljava/lang/String;

    .line 1691
    .line 1692
    iget-object v0, v9, La/o3c;->b:Ljava/lang/Object;

    .line 1693
    .line 1694
    check-cast v0, Ljava/lang/Long;

    .line 1695
    .line 1696
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1697
    .line 1698
    .line 1699
    move-result-wide v4

    .line 1700
    new-instance v6, La/reu;

    .line 1701
    .line 1702
    new-instance v0, La/ouu;

    .line 1703
    .line 1704
    iget-object v1, v9, La/o3c;->c:Ljava/lang/Object;

    .line 1705
    .line 1706
    check-cast v1, La/cad;

    .line 1707
    .line 1708
    iget-object v7, v1, La/cad;->b:Ljava/lang/Object;

    .line 1709
    .line 1710
    check-cast v7, La/psc;

    .line 1711
    .line 1712
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v7

    .line 1716
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1717
    .line 1718
    .line 1719
    new-instance v8, La/zpu;

    .line 1720
    .line 1721
    iget-object v10, v9, La/o3c;->d:Ljava/lang/Object;

    .line 1722
    .line 1723
    check-cast v10, La/gii0;

    .line 1724
    .line 1725
    const/16 v11, 0xa

    .line 1726
    .line 1727
    invoke-direct {v8, v10, v11}, La/zpu;-><init>(La/gii0;B)V

    .line 1728
    .line 1729
    .line 1730
    iget-object v10, v9, La/o3c;->e:Ljava/lang/Object;

    .line 1731
    .line 1732
    check-cast v10, La/knf0;

    .line 1733
    .line 1734
    invoke-direct {v0, v7, v8, v10}, La/ouu;-><init>(La/mne;La/zpu;La/knf0;)V

    .line 1735
    .line 1736
    .line 1737
    const/4 v15, 0x1

    .line 1738
    invoke-direct {v6, v0, v15}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 1739
    .line 1740
    .line 1741
    iget-object v0, v9, La/o3c;->f:Ljava/lang/Object;

    .line 1742
    .line 1743
    move-object v7, v0

    .line 1744
    check-cast v7, La/duj;

    .line 1745
    .line 1746
    iget-object v0, v9, La/o3c;->g:Ljava/lang/Object;

    .line 1747
    .line 1748
    move-object v8, v0

    .line 1749
    check-cast v8, La/ocl;

    .line 1750
    .line 1751
    iget-object v0, v9, La/o3c;->h:Ljava/lang/Object;

    .line 1752
    .line 1753
    check-cast v0, La/i1w0;

    .line 1754
    .line 1755
    iget-object v10, v9, La/o3c;->i:Ljava/lang/Object;

    .line 1756
    .line 1757
    check-cast v10, La/m1e;

    .line 1758
    .line 1759
    iget-object v9, v9, La/o3c;->j:Ljava/lang/Object;

    .line 1760
    .line 1761
    move-object v11, v9

    .line 1762
    check-cast v11, La/ctf0;

    .line 1763
    .line 1764
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 1765
    .line 1766
    check-cast v1, La/psc;

    .line 1767
    .line 1768
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v12

    .line 1772
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1773
    .line 1774
    .line 1775
    move-object v9, v0

    .line 1776
    invoke-direct/range {v2 .. v12}, La/krw;-><init>(Ljava/lang/String;JLa/reu;La/duj;La/ocl;La/i1w0;La/m1e;La/ctf0;La/mne;)V

    .line 1777
    .line 1778
    .line 1779
    return-object v2

    .line 1780
    :pswitch_17
    new-instance v3, La/qqw;

    .line 1781
    .line 1782
    check-cast v9, La/v7i;

    .line 1783
    .line 1784
    iget-object v0, v9, La/v7i;->i:Ljava/lang/Object;

    .line 1785
    .line 1786
    check-cast v0, Ljava/lang/String;

    .line 1787
    .line 1788
    iget-object v1, v9, La/v7i;->g:Ljava/lang/Object;

    .line 1789
    .line 1790
    check-cast v1, Ljava/lang/Long;

    .line 1791
    .line 1792
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1793
    .line 1794
    .line 1795
    move-result-wide v5

    .line 1796
    new-instance v7, La/yfu;

    .line 1797
    .line 1798
    new-instance v1, La/cyu;

    .line 1799
    .line 1800
    iget-object v2, v9, La/v7i;->h:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v2, La/cad;

    .line 1803
    .line 1804
    iget-object v8, v2, La/cad;->b:Ljava/lang/Object;

    .line 1805
    .line 1806
    check-cast v8, La/psc;

    .line 1807
    .line 1808
    invoke-virtual {v8}, La/psc;->h()La/mne;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v8

    .line 1812
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1813
    .line 1814
    .line 1815
    new-instance v10, La/lbu;

    .line 1816
    .line 1817
    iget-object v11, v9, La/v7i;->e:Ljava/lang/Object;

    .line 1818
    .line 1819
    check-cast v11, La/gii0;

    .line 1820
    .line 1821
    const/16 v12, 0x15

    .line 1822
    .line 1823
    invoke-direct {v10, v11, v12}, La/lbu;-><init>(La/gii0;B)V

    .line 1824
    .line 1825
    .line 1826
    iget-object v11, v9, La/v7i;->f:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast v11, La/knf0;

    .line 1829
    .line 1830
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1831
    .line 1832
    .line 1833
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1834
    .line 1835
    .line 1836
    iput-object v8, v1, La/cyu;->a:Ljava/lang/Object;

    .line 1837
    .line 1838
    iput-object v10, v1, La/cyu;->b:Ljava/lang/Object;

    .line 1839
    .line 1840
    iput-object v11, v1, La/cyu;->c:Ljava/lang/Object;

    .line 1841
    .line 1842
    invoke-direct {v7, v1}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    new-instance v8, La/do20;

    .line 1846
    .line 1847
    iget-object v1, v9, La/v7i;->k:Ljava/lang/Object;

    .line 1848
    .line 1849
    check-cast v1, La/pmi0;

    .line 1850
    .line 1851
    iget-object v10, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 1852
    .line 1853
    check-cast v10, La/daf;

    .line 1854
    .line 1855
    invoke-virtual {v10}, La/daf;->A()La/nfm0;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v10

    .line 1859
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1860
    .line 1861
    .line 1862
    invoke-direct {v8, v10}, La/do20;-><init>(Ljava/lang/Object;)V

    .line 1863
    .line 1864
    .line 1865
    new-instance v10, La/jwu;

    .line 1866
    .line 1867
    iget-object v11, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 1868
    .line 1869
    check-cast v11, La/daf;

    .line 1870
    .line 1871
    invoke-virtual {v11}, La/daf;->A()La/nfm0;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v11

    .line 1875
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1876
    .line 1877
    .line 1878
    invoke-direct {v10, v11, v4}, La/jwu;-><init>(La/nfm0;B)V

    .line 1879
    .line 1880
    .line 1881
    move-object v4, v10

    .line 1882
    new-instance v10, La/qzt;

    .line 1883
    .line 1884
    iget-object v11, v9, La/v7i;->a:Ljava/lang/Object;

    .line 1885
    .line 1886
    check-cast v11, La/pru;

    .line 1887
    .line 1888
    const/4 v15, 0x0

    .line 1889
    invoke-direct {v10, v11, v15}, La/qzt;-><init>(La/pru;B)V

    .line 1890
    .line 1891
    .line 1892
    iget-object v1, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 1893
    .line 1894
    check-cast v1, La/daf;

    .line 1895
    .line 1896
    invoke-virtual {v1}, La/daf;->r()La/fhj;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v11

    .line 1900
    iget-object v1, v9, La/v7i;->j:Ljava/lang/Object;

    .line 1901
    .line 1902
    move-object v12, v1

    .line 1903
    check-cast v12, La/uyu;

    .line 1904
    .line 1905
    iget-object v1, v9, La/v7i;->n:Ljava/lang/Object;

    .line 1906
    .line 1907
    move-object v13, v1

    .line 1908
    check-cast v13, La/wyu;

    .line 1909
    .line 1910
    iget-object v1, v9, La/v7i;->m:Ljava/lang/Object;

    .line 1911
    .line 1912
    move-object v14, v1

    .line 1913
    check-cast v14, La/ocl;

    .line 1914
    .line 1915
    iget-object v1, v9, La/v7i;->c:Ljava/lang/Object;

    .line 1916
    .line 1917
    move-object v15, v1

    .line 1918
    check-cast v15, La/ctf0;

    .line 1919
    .line 1920
    iget-object v1, v9, La/v7i;->d:Ljava/lang/Object;

    .line 1921
    .line 1922
    move-object/from16 v16, v1

    .line 1923
    .line 1924
    check-cast v16, La/m1e;

    .line 1925
    .line 1926
    iget-object v1, v2, La/cad;->b:Ljava/lang/Object;

    .line 1927
    .line 1928
    check-cast v1, La/psc;

    .line 1929
    .line 1930
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v17

    .line 1934
    invoke-static/range {v17 .. v17}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1935
    .line 1936
    .line 1937
    iget-object v1, v9, La/v7i;->b:Ljava/lang/Object;

    .line 1938
    .line 1939
    move-object/from16 v18, v1

    .line 1940
    .line 1941
    check-cast v18, La/i1w0;

    .line 1942
    .line 1943
    iget-object v1, v9, La/v7i;->l:Ljava/lang/Object;

    .line 1944
    .line 1945
    move-object/from16 v19, v1

    .line 1946
    .line 1947
    check-cast v19, La/r9u;

    .line 1948
    .line 1949
    move-object v9, v4

    .line 1950
    move-object v4, v0

    .line 1951
    invoke-direct/range {v3 .. v19}, La/qqw;-><init>(Ljava/lang/String;JLa/yfu;La/do20;La/jwu;La/qzt;La/fhj;La/uyu;La/wyu;La/ocl;La/ctf0;La/m1e;La/mne;La/i1w0;La/r9u;)V

    .line 1952
    .line 1953
    .line 1954
    return-object v3

    .line 1955
    :pswitch_18
    new-instance v4, La/yow;

    .line 1956
    .line 1957
    check-cast v9, La/ru;

    .line 1958
    .line 1959
    iget-object v0, v9, La/ru;->a:Ljava/lang/Object;

    .line 1960
    .line 1961
    move-object v5, v0

    .line 1962
    check-cast v5, Ljava/lang/String;

    .line 1963
    .line 1964
    new-instance v6, La/xfu;

    .line 1965
    .line 1966
    new-instance v0, La/abu;

    .line 1967
    .line 1968
    new-instance v1, La/ieu;

    .line 1969
    .line 1970
    iget-object v2, v9, La/ru;->c:Ljava/lang/Object;

    .line 1971
    .line 1972
    check-cast v2, La/gii0;

    .line 1973
    .line 1974
    const/16 v3, 0x11

    .line 1975
    .line 1976
    invoke-direct {v1, v2, v3}, La/ieu;-><init>(La/gii0;B)V

    .line 1977
    .line 1978
    .line 1979
    iget-object v2, v9, La/ru;->d:Ljava/lang/Object;

    .line 1980
    .line 1981
    check-cast v2, La/knf0;

    .line 1982
    .line 1983
    invoke-direct {v0, v1, v2}, La/abu;-><init>(La/ieu;La/knf0;)V

    .line 1984
    .line 1985
    .line 1986
    invoke-direct {v6, v0}, La/xfu;-><init>(Ljava/lang/Object;)V

    .line 1987
    .line 1988
    .line 1989
    iget-object v0, v9, La/ru;->b:Ljava/lang/Object;

    .line 1990
    .line 1991
    move-object v7, v0

    .line 1992
    check-cast v7, La/duj;

    .line 1993
    .line 1994
    iget-object v0, v9, La/ru;->f:Ljava/lang/Object;

    .line 1995
    .line 1996
    move-object v8, v0

    .line 1997
    check-cast v8, La/ocl;

    .line 1998
    .line 1999
    iget-object v0, v9, La/ru;->g:Ljava/lang/Object;

    .line 2000
    .line 2001
    check-cast v0, La/i1w0;

    .line 2002
    .line 2003
    iget-object v1, v9, La/ru;->h:Ljava/lang/Object;

    .line 2004
    .line 2005
    move-object v10, v1

    .line 2006
    check-cast v10, La/m1e;

    .line 2007
    .line 2008
    iget-object v1, v9, La/ru;->e:Ljava/lang/Object;

    .line 2009
    .line 2010
    move-object v11, v1

    .line 2011
    check-cast v11, La/ctf0;

    .line 2012
    .line 2013
    iget-object v1, v9, La/ru;->i:Ljava/lang/Object;

    .line 2014
    .line 2015
    check-cast v1, La/cad;

    .line 2016
    .line 2017
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 2018
    .line 2019
    check-cast v1, La/psc;

    .line 2020
    .line 2021
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v12

    .line 2025
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2026
    .line 2027
    .line 2028
    move-object v9, v0

    .line 2029
    invoke-direct/range {v4 .. v12}, La/yow;-><init>(Ljava/lang/String;La/xfu;La/duj;La/ocl;La/i1w0;La/m1e;La/ctf0;La/mne;)V

    .line 2030
    .line 2031
    .line 2032
    return-object v4

    .line 2033
    :pswitch_19
    new-instance v5, La/snw;

    .line 2034
    .line 2035
    check-cast v9, La/o3c;

    .line 2036
    .line 2037
    iget-object v0, v9, La/o3c;->a:Ljava/lang/Object;

    .line 2038
    .line 2039
    move-object v6, v0

    .line 2040
    check-cast v6, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 2041
    .line 2042
    new-instance v7, La/p4u;

    .line 2043
    .line 2044
    new-instance v0, La/u8u;

    .line 2045
    .line 2046
    new-instance v1, La/edu;

    .line 2047
    .line 2048
    iget-object v2, v9, La/o3c;->b:Ljava/lang/Object;

    .line 2049
    .line 2050
    check-cast v2, La/gii0;

    .line 2051
    .line 2052
    invoke-direct {v1, v2}, La/edu;-><init>(La/gii0;)V

    .line 2053
    .line 2054
    .line 2055
    iget-object v2, v9, La/o3c;->c:Ljava/lang/Object;

    .line 2056
    .line 2057
    check-cast v2, La/knf0;

    .line 2058
    .line 2059
    invoke-direct {v0, v1, v2}, La/u8u;-><init>(La/edu;La/knf0;)V

    .line 2060
    .line 2061
    .line 2062
    invoke-direct {v7, v0}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 2063
    .line 2064
    .line 2065
    iget-object v0, v9, La/o3c;->d:Ljava/lang/Object;

    .line 2066
    .line 2067
    move-object v8, v0

    .line 2068
    check-cast v8, La/uyu;

    .line 2069
    .line 2070
    iget-object v0, v9, La/o3c;->e:Ljava/lang/Object;

    .line 2071
    .line 2072
    check-cast v0, La/wyu;

    .line 2073
    .line 2074
    iget-object v1, v9, La/o3c;->f:Ljava/lang/Object;

    .line 2075
    .line 2076
    move-object v10, v1

    .line 2077
    check-cast v10, La/ocl;

    .line 2078
    .line 2079
    iget-object v1, v9, La/o3c;->g:Ljava/lang/Object;

    .line 2080
    .line 2081
    move-object v11, v1

    .line 2082
    check-cast v11, La/ctf0;

    .line 2083
    .line 2084
    iget-object v1, v9, La/o3c;->h:Ljava/lang/Object;

    .line 2085
    .line 2086
    move-object v12, v1

    .line 2087
    check-cast v12, La/m1e;

    .line 2088
    .line 2089
    iget-object v1, v9, La/o3c;->i:Ljava/lang/Object;

    .line 2090
    .line 2091
    check-cast v1, La/cad;

    .line 2092
    .line 2093
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 2094
    .line 2095
    check-cast v1, La/psc;

    .line 2096
    .line 2097
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v13

    .line 2101
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2102
    .line 2103
    .line 2104
    iget-object v1, v9, La/o3c;->j:Ljava/lang/Object;

    .line 2105
    .line 2106
    move-object v14, v1

    .line 2107
    check-cast v14, La/i1w0;

    .line 2108
    .line 2109
    move-object v9, v0

    .line 2110
    invoke-direct/range {v5 .. v14}, La/snw;-><init>(Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;La/p4u;La/uyu;La/wyu;La/ocl;La/ctf0;La/m1e;La/mne;La/i1w0;)V

    .line 2111
    .line 2112
    .line 2113
    return-object v5

    .line 2114
    :pswitch_1a
    new-instance v6, La/ukw;

    .line 2115
    .line 2116
    check-cast v9, La/yii;

    .line 2117
    .line 2118
    iget-object v7, v9, La/yii;->e:Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 2119
    .line 2120
    iget-object v0, v9, La/yii;->f:La/pyg;

    .line 2121
    .line 2122
    invoke-interface {v0}, La/pyg;->a()La/hzg;

    .line 2123
    .line 2124
    .line 2125
    move-result-object v8

    .line 2126
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2127
    .line 2128
    .line 2129
    new-instance v21, La/d4u;

    .line 2130
    .line 2131
    iget-object v15, v9, La/yii;->g:La/lbu;

    .line 2132
    .line 2133
    new-instance v1, La/f3u;

    .line 2134
    .line 2135
    invoke-interface {v0}, La/pyg;->g()La/img;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v2

    .line 2139
    iget-object v3, v9, La/yii;->h:La/sjl0;

    .line 2140
    .line 2141
    invoke-direct {v1, v2, v3}, La/f3u;-><init>(La/img;La/sjl0;)V

    .line 2142
    .line 2143
    .line 2144
    new-instance v2, La/u8u;

    .line 2145
    .line 2146
    iget-object v4, v9, La/yii;->i:La/n660;

    .line 2147
    .line 2148
    iget-object v5, v9, La/yii;->j:La/vqc;

    .line 2149
    .line 2150
    iget-object v5, v5, La/vqc;->b:Ljava/lang/Object;

    .line 2151
    .line 2152
    check-cast v5, La/cih;

    .line 2153
    .line 2154
    invoke-virtual {v5}, La/cih;->a()La/uzc;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v5

    .line 2158
    const/16 v10, 0xf

    .line 2159
    .line 2160
    invoke-direct {v2, v4, v5, v10}, La/u8u;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2161
    .line 2162
    .line 2163
    iget-object v4, v9, La/yii;->k:La/lsn;

    .line 2164
    .line 2165
    iget-object v4, v4, La/lsn;->a:Ljava/lang/Object;

    .line 2166
    .line 2167
    check-cast v4, La/gbi;

    .line 2168
    .line 2169
    invoke-virtual {v4}, La/gbi;->k()La/v7i;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v25

    .line 2173
    iget-object v4, v9, La/yii;->l:La/rtu;

    .line 2174
    .line 2175
    iget-object v5, v9, La/yii;->m:La/pmi;

    .line 2176
    .line 2177
    iget-object v10, v9, La/yii;->n:La/iip;

    .line 2178
    .line 2179
    invoke-interface {v10}, La/iip;->V()La/j3c;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v28

    .line 2183
    invoke-static/range {v28 .. v28}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2184
    .line 2185
    .line 2186
    new-instance v10, La/yuu;

    .line 2187
    .line 2188
    invoke-interface {v0}, La/pyg;->k()La/cyu;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v11

    .line 2192
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2193
    .line 2194
    .line 2195
    iget-object v12, v9, La/yii;->o:La/gst0;

    .line 2196
    .line 2197
    invoke-direct {v10, v11, v3, v12}, La/yuu;-><init>(La/cyu;La/sjl0;La/gst0;)V

    .line 2198
    .line 2199
    .line 2200
    iget-object v11, v9, La/yii;->b:La/pru;

    .line 2201
    .line 2202
    iget-object v12, v9, La/yii;->p:La/gt5;

    .line 2203
    .line 2204
    invoke-interface {v12}, La/gt5;->a()La/q8u;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v31

    .line 2208
    invoke-static/range {v31 .. v31}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2209
    .line 2210
    .line 2211
    invoke-interface {v12}, La/gt5;->J()La/bnu;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v32

    .line 2215
    invoke-static/range {v32 .. v32}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2216
    .line 2217
    .line 2218
    invoke-interface {v12}, La/gt5;->e()La/cyg0;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v33

    .line 2222
    invoke-static/range {v33 .. v33}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2223
    .line 2224
    .line 2225
    invoke-interface {v12}, La/gt5;->L()La/lyt;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v34

    .line 2229
    invoke-static/range {v34 .. v34}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2230
    .line 2231
    .line 2232
    new-instance v13, La/xsu;

    .line 2233
    .line 2234
    iget-object v14, v9, La/yii;->q:La/nru0;

    .line 2235
    .line 2236
    invoke-direct {v13, v14}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 2237
    .line 2238
    .line 2239
    new-instance v14, La/wti;

    .line 2240
    .line 2241
    move-object/from16 v16, v0

    .line 2242
    .line 2243
    invoke-interface/range {v16 .. v16}, La/pyg;->k()La/cyu;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v0

    .line 2247
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2248
    .line 2249
    .line 2250
    invoke-direct {v14, v0, v3}, La/wti;-><init>(La/cyu;La/sjl0;)V

    .line 2251
    .line 2252
    .line 2253
    iget-object v0, v9, La/yii;->r:La/ocl;

    .line 2254
    .line 2255
    move-object/from16 v37, v0

    .line 2256
    .line 2257
    move-object/from16 v23, v1

    .line 2258
    .line 2259
    move-object/from16 v24, v2

    .line 2260
    .line 2261
    move-object/from16 v26, v4

    .line 2262
    .line 2263
    move-object/from16 v27, v5

    .line 2264
    .line 2265
    move-object/from16 v29, v10

    .line 2266
    .line 2267
    move-object/from16 v30, v11

    .line 2268
    .line 2269
    move-object/from16 v35, v13

    .line 2270
    .line 2271
    move-object/from16 v36, v14

    .line 2272
    .line 2273
    move-object/from16 v22, v15

    .line 2274
    .line 2275
    invoke-direct/range {v21 .. v37}, La/d4u;-><init>(La/lbu;La/f3u;La/u8u;La/v7i;La/rtu;La/pmi;La/j3c;La/yuu;La/pru;La/q8u;La/bnu;La/cyg0;La/lyt;La/xsu;La/wti;La/ocl;)V

    .line 2276
    .line 2277
    .line 2278
    move-object/from16 v10, v30

    .line 2279
    .line 2280
    iget-object v11, v9, La/yii;->s:La/ctf0;

    .line 2281
    .line 2282
    iget-object v0, v9, La/yii;->t:La/cad;

    .line 2283
    .line 2284
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 2285
    .line 2286
    check-cast v0, La/psc;

    .line 2287
    .line 2288
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v0

    .line 2292
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2293
    .line 2294
    .line 2295
    iget-object v13, v9, La/yii;->u:La/m1e;

    .line 2296
    .line 2297
    iget-object v1, v9, La/yii;->v:La/ugf0;

    .line 2298
    .line 2299
    iget-object v1, v1, La/ugf0;->a:Ljava/lang/Object;

    .line 2300
    .line 2301
    check-cast v1, La/daf;

    .line 2302
    .line 2303
    invoke-virtual {v1}, La/daf;->w()La/luu;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v14

    .line 2307
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2308
    .line 2309
    .line 2310
    iget-object v1, v9, La/yii;->w:La/g2v;

    .line 2311
    .line 2312
    iget-object v2, v9, La/yii;->x:La/y78;

    .line 2313
    .line 2314
    iget-object v3, v9, La/yii;->a:La/itr;

    .line 2315
    .line 2316
    invoke-interface {v3}, La/itr;->a()La/hjd;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v18

    .line 2320
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2321
    .line 2322
    .line 2323
    new-instance v3, La/ih5;

    .line 2324
    .line 2325
    iget-object v4, v9, La/yii;->y:La/kt2;

    .line 2326
    .line 2327
    const/4 v5, 0x1

    .line 2328
    invoke-direct {v3, v4, v5}, La/ih5;-><init>(La/kt2;B)V

    .line 2329
    .line 2330
    .line 2331
    new-instance v5, La/yo4;

    .line 2332
    .line 2333
    move-object/from16 p0, v0

    .line 2334
    .line 2335
    const/4 v0, 0x5

    .line 2336
    invoke-direct {v5, v4, v0}, La/yo4;-><init>(La/kt2;B)V

    .line 2337
    .line 2338
    .line 2339
    iget-object v0, v9, La/yii;->z:La/zr1;

    .line 2340
    .line 2341
    move-object/from16 v19, v1

    .line 2342
    .line 2343
    new-instance v1, La/chf0;

    .line 2344
    .line 2345
    move-object/from16 v22, v2

    .line 2346
    .line 2347
    new-instance v2, La/ih5;

    .line 2348
    .line 2349
    move-object/from16 v23, v3

    .line 2350
    .line 2351
    const/4 v3, 0x1

    .line 2352
    invoke-direct {v2, v4, v3}, La/ih5;-><init>(La/kt2;B)V

    .line 2353
    .line 2354
    .line 2355
    const/16 v3, 0x19

    .line 2356
    .line 2357
    invoke-direct {v1, v2, v0, v3}, La/chf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2358
    .line 2359
    .line 2360
    iget-object v2, v9, La/yii;->A:La/grj;

    .line 2361
    .line 2362
    iget-object v3, v9, La/yii;->B:La/duj;

    .line 2363
    .line 2364
    invoke-interface {v12}, La/gt5;->F()La/hvt;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v25

    .line 2368
    invoke-static/range {v25 .. v25}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2369
    .line 2370
    .line 2371
    new-instance v4, La/rpt;

    .line 2372
    .line 2373
    move-object/from16 v17, v0

    .line 2374
    .line 2375
    invoke-interface/range {v16 .. v16}, La/pyg;->m()La/dih;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v0

    .line 2379
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2380
    .line 2381
    .line 2382
    invoke-direct {v4, v0}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 2383
    .line 2384
    .line 2385
    iget-object v0, v9, La/yii;->C:La/oeg0;

    .line 2386
    .line 2387
    move-object/from16 v27, v0

    .line 2388
    .line 2389
    iget-object v0, v9, La/yii;->D:La/y3v;

    .line 2390
    .line 2391
    invoke-interface/range {v16 .. v16}, La/pyg;->i()La/vqc;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v29

    .line 2395
    move-object/from16 v28, v0

    .line 2396
    .line 2397
    iget-object v0, v9, La/yii;->E:La/vqc;

    .line 2398
    .line 2399
    move-object/from16 v30, v0

    .line 2400
    .line 2401
    iget-object v0, v9, La/yii;->d:La/poq0;

    .line 2402
    .line 2403
    move-object/from16 v31, v0

    .line 2404
    .line 2405
    iget-object v0, v9, La/yii;->F:La/xri;

    .line 2406
    .line 2407
    invoke-virtual {v0}, La/xri;->a()La/svu;

    .line 2408
    .line 2409
    .line 2410
    move-result-object v32

    .line 2411
    invoke-static/range {v32 .. v32}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2412
    .line 2413
    .line 2414
    iget-object v0, v9, La/yii;->G:La/r9u;

    .line 2415
    .line 2416
    invoke-interface {v12}, La/gt5;->y()La/pyg0;

    .line 2417
    .line 2418
    .line 2419
    move-result-object v34

    .line 2420
    invoke-static/range {v34 .. v34}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2421
    .line 2422
    .line 2423
    invoke-interface {v12}, La/gt5;->v()La/qyg0;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v35

    .line 2427
    invoke-static/range {v35 .. v35}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2428
    .line 2429
    .line 2430
    iget-object v12, v9, La/yii;->H:La/r2u;

    .line 2431
    .line 2432
    move-object/from16 v33, v0

    .line 2433
    .line 2434
    iget-object v0, v9, La/yii;->I:La/bwl;

    .line 2435
    .line 2436
    move-object/from16 v16, v1

    .line 2437
    .line 2438
    iget-object v1, v0, La/bwl;->a:Ljava/lang/Object;

    .line 2439
    .line 2440
    check-cast v1, La/dbi;

    .line 2441
    .line 2442
    invoke-virtual {v1}, La/dbi;->j()La/fvt0;

    .line 2443
    .line 2444
    .line 2445
    move-result-object v37

    .line 2446
    iget-object v0, v0, La/bwl;->a:Ljava/lang/Object;

    .line 2447
    .line 2448
    check-cast v0, La/dbi;

    .line 2449
    .line 2450
    invoke-virtual {v0}, La/dbi;->m()La/nv20;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v38

    .line 2454
    iget-object v0, v9, La/yii;->J:La/ivn;

    .line 2455
    .line 2456
    iget-object v1, v9, La/yii;->K:La/jw20;

    .line 2457
    .line 2458
    iget-object v1, v1, La/jw20;->b:Ljava/lang/Object;

    .line 2459
    .line 2460
    check-cast v1, La/yqc;

    .line 2461
    .line 2462
    invoke-virtual {v1}, La/yqc;->z()La/rkt0;

    .line 2463
    .line 2464
    .line 2465
    move-result-object v40

    .line 2466
    move-object/from16 v39, v0

    .line 2467
    .line 2468
    move-object/from16 v24, v3

    .line 2469
    .line 2470
    move-object/from16 v26, v4

    .line 2471
    .line 2472
    move-object/from16 v20, v5

    .line 2473
    .line 2474
    move-object/from16 v36, v12

    .line 2475
    .line 2476
    move-object/from16 v9, v21

    .line 2477
    .line 2478
    move-object/from16 v12, p0

    .line 2479
    .line 2480
    move-object/from16 v21, v17

    .line 2481
    .line 2482
    move-object/from16 v17, v22

    .line 2483
    .line 2484
    move-object/from16 v22, v16

    .line 2485
    .line 2486
    move-object/from16 v16, v19

    .line 2487
    .line 2488
    move-object/from16 v19, v23

    .line 2489
    .line 2490
    move-object/from16 v23, v2

    .line 2491
    .line 2492
    invoke-direct/range {v6 .. v40}, La/ukw;-><init>(Lorg/xplatform/cyber/section/api/home/CyberHomeParams;La/hzg;La/d4u;La/pru;La/ctf0;La/mne;La/m1e;La/luu;La/lbu;La/g2v;La/y78;La/hjd;La/ih5;La/yo4;La/zr1;La/chf0;La/grj;La/duj;La/hvt;La/rpt;La/oeg0;La/y3v;La/vqc;La/vqc;La/poq0;La/svu;La/r9u;La/pyg0;La/qyg0;La/r2u;La/fvt0;La/nv20;La/ivn;La/rkt0;)V

    .line 2493
    .line 2494
    .line 2495
    return-object v6

    .line 2496
    :pswitch_1b
    new-instance v7, La/k8w;

    .line 2497
    .line 2498
    check-cast v9, La/qgd;

    .line 2499
    .line 2500
    iget-object v0, v9, La/qgd;->b:Ljava/lang/Object;

    .line 2501
    .line 2502
    move-object v8, v0

    .line 2503
    check-cast v8, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 2504
    .line 2505
    iget-object v0, v9, La/qgd;->c:Ljava/lang/Object;

    .line 2506
    .line 2507
    check-cast v0, La/ql5;

    .line 2508
    .line 2509
    iget-object v1, v9, La/qgd;->d:Ljava/lang/Object;

    .line 2510
    .line 2511
    move-object v10, v1

    .line 2512
    check-cast v10, La/f8w;

    .line 2513
    .line 2514
    iget-object v1, v9, La/qgd;->e:Ljava/lang/Object;

    .line 2515
    .line 2516
    check-cast v1, La/cad;

    .line 2517
    .line 2518
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 2519
    .line 2520
    check-cast v1, La/psc;

    .line 2521
    .line 2522
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v11

    .line 2526
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2527
    .line 2528
    .line 2529
    new-instance v12, La/bst;

    .line 2530
    .line 2531
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 2532
    .line 2533
    .line 2534
    iget-object v1, v9, La/qgd;->f:Ljava/lang/Object;

    .line 2535
    .line 2536
    move-object v13, v1

    .line 2537
    check-cast v13, La/pru;

    .line 2538
    .line 2539
    iget-object v1, v9, La/qgd;->g:Ljava/lang/Object;

    .line 2540
    .line 2541
    move-object v14, v1

    .line 2542
    check-cast v14, La/ctf0;

    .line 2543
    .line 2544
    move-object v9, v0

    .line 2545
    invoke-direct/range {v7 .. v14}, La/k8w;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/ql5;La/f8w;La/mne;La/bst;La/pru;La/ctf0;)V

    .line 2546
    .line 2547
    .line 2548
    return-object v7

    .line 2549
    :pswitch_1c
    new-instance v0, La/b4w;

    .line 2550
    .line 2551
    check-cast v9, La/uii;

    .line 2552
    .line 2553
    iget-object v1, v9, La/uii;->a:Ljava/lang/Object;

    .line 2554
    .line 2555
    check-cast v1, La/iw20;

    .line 2556
    .line 2557
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 2558
    .line 2559
    check-cast v1, La/uii;

    .line 2560
    .line 2561
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v1

    .line 2565
    iget-object v2, v9, La/uii;->b:Ljava/lang/Object;

    .line 2566
    .line 2567
    check-cast v2, La/n3w;

    .line 2568
    .line 2569
    iget-object v3, v9, La/uii;->c:Ljava/lang/Object;

    .line 2570
    .line 2571
    check-cast v3, La/sys0;

    .line 2572
    .line 2573
    iget-object v4, v9, La/uii;->d:Ljava/lang/Object;

    .line 2574
    .line 2575
    check-cast v4, Ljava/lang/Boolean;

    .line 2576
    .line 2577
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2578
    .line 2579
    .line 2580
    move-result v4

    .line 2581
    iget-object v5, v9, La/uii;->e:Ljava/lang/Object;

    .line 2582
    .line 2583
    check-cast v5, Ljava/lang/Boolean;

    .line 2584
    .line 2585
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2586
    .line 2587
    .line 2588
    move-result v5

    .line 2589
    invoke-direct/range {v0 .. v5}, La/b4w;-><init>(La/pru;La/n3w;La/sys0;ZZ)V

    .line 2590
    .line 2591
    .line 2592
    return-object v0

    .line 2593
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
