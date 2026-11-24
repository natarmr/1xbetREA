.class public final La/t5i;
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
    iput-byte p2, p0, La/t5i;->a:B

    iput-object p1, p0, La/t5i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t5i;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x5

    .line 7
    const/16 v4, 0xe

    .line 8
    .line 9
    const/16 v5, 0x1c

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/16 v7, 0xa

    .line 13
    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x1

    .line 16
    iget-object v10, v0, La/t5i;->b:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance v0, La/bh3;

    .line 22
    .line 23
    check-cast v10, La/h8i;

    .line 24
    .line 25
    iget-object v1, v10, La/h8i;->a:La/r9u;

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/bh3;-><init>(La/r9u;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    new-instance v2, La/gp2;

    .line 32
    .line 33
    check-cast v10, La/o3c;

    .line 34
    .line 35
    iget-object v0, v10, La/o3c;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    new-instance v5, La/fvt0;

    .line 44
    .line 45
    new-instance v0, La/mii0;

    .line 46
    .line 47
    iget-object v1, v10, La/o3c;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, La/cad;

    .line 50
    .line 51
    iget-object v6, v1, La/cad;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, La/psc;

    .line 54
    .line 55
    invoke-virtual {v6}, La/psc;->h()La/mne;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v7, La/yk50;

    .line 63
    .line 64
    iget-object v9, v10, La/o3c;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v9, La/gii0;

    .line 67
    .line 68
    invoke-direct {v7, v9, v8}, La/yk50;-><init>(La/gii0;B)V

    .line 69
    .line 70
    .line 71
    iget-object v8, v10, La/o3c;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, La/knf0;

    .line 74
    .line 75
    iget-object v9, v10, La/o3c;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, La/btt0;

    .line 78
    .line 79
    invoke-direct {v0, v6, v7, v8, v9}, La/mii0;-><init>(La/mne;La/yk50;La/knf0;La/btt0;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v5, v0}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v10, La/o3c;->f:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v6, v0

    .line 88
    check-cast v6, La/sa10;

    .line 89
    .line 90
    iget-object v0, v10, La/o3c;->g:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v7, v0

    .line 93
    check-cast v7, La/m1e;

    .line 94
    .line 95
    iget-object v0, v1, La/cad;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, La/psc;

    .line 98
    .line 99
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v10, La/o3c;->h:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v9, v0

    .line 109
    check-cast v9, La/i1w0;

    .line 110
    .line 111
    iget-object v0, v10, La/o3c;->i:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, La/duj;

    .line 114
    .line 115
    iget-object v1, v10, La/o3c;->j:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v11, v1

    .line 118
    check-cast v11, La/r9u;

    .line 119
    .line 120
    move-object v10, v0

    .line 121
    invoke-direct/range {v2 .. v11}, La/gp2;-><init>(JLa/fvt0;La/sa10;La/m1e;La/mne;La/i1w0;La/duj;La/r9u;)V

    .line 122
    .line 123
    .line 124
    return-object v2

    .line 125
    :pswitch_1
    new-instance v1, La/a8i;

    .line 126
    .line 127
    invoke-direct {v1, v0}, La/a8i;-><init>(La/t5i;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_2
    new-instance v2, La/bs60;

    .line 132
    .line 133
    check-cast v10, La/z7i;

    .line 134
    .line 135
    iget-object v3, v10, La/z7i;->a:Landroid/os/Bundle;

    .line 136
    .line 137
    iget-object v4, v10, La/z7i;->b:La/ih5;

    .line 138
    .line 139
    iget-object v5, v10, La/z7i;->c:La/s31;

    .line 140
    .line 141
    iget-object v6, v10, La/z7i;->d:La/l7k;

    .line 142
    .line 143
    iget-object v7, v10, La/z7i;->e:La/cmt;

    .line 144
    .line 145
    iget-object v8, v10, La/z7i;->f:La/cyu;

    .line 146
    .line 147
    iget-object v9, v10, La/z7i;->g:La/hs60;

    .line 148
    .line 149
    iget-object v0, v10, La/z7i;->h:La/gw60;

    .line 150
    .line 151
    iget-object v11, v10, La/z7i;->i:La/wsf0;

    .line 152
    .line 153
    iget-object v1, v10, La/z7i;->j:La/bw60;

    .line 154
    .line 155
    invoke-interface {v1}, La/bw60;->a()La/nn60;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-object v13, v10, La/z7i;->k:La/oeg0;

    .line 163
    .line 164
    iget-object v14, v10, La/z7i;->l:La/i1w0;

    .line 165
    .line 166
    iget-object v15, v10, La/z7i;->m:La/ouu;

    .line 167
    .line 168
    iget-object v1, v10, La/z7i;->n:La/ctf0;

    .line 169
    .line 170
    move-object/from16 v16, v0

    .line 171
    .line 172
    iget-object v0, v10, La/z7i;->o:La/duj;

    .line 173
    .line 174
    move-object/from16 v17, v0

    .line 175
    .line 176
    iget-object v0, v10, La/z7i;->p:La/cad;

    .line 177
    .line 178
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/psc;

    .line 181
    .line 182
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 183
    .line 184
    .line 185
    move-result-object v18

    .line 186
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iget-object v0, v10, La/z7i;->q:La/v88;

    .line 190
    .line 191
    move-object/from16 v19, v0

    .line 192
    .line 193
    iget-object v0, v10, La/z7i;->r:La/m1e;

    .line 194
    .line 195
    move-object/from16 v20, v0

    .line 196
    .line 197
    iget-object v0, v10, La/z7i;->s:La/hnu;

    .line 198
    .line 199
    move-object/from16 v21, v0

    .line 200
    .line 201
    iget-object v0, v10, La/z7i;->t:La/iw20;

    .line 202
    .line 203
    move-object/from16 v22, v1

    .line 204
    .line 205
    iget-object v1, v0, La/iw20;->a:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v1, La/uii;

    .line 208
    .line 209
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    move-object/from16 p0, v1

    .line 214
    .line 215
    iget-object v1, v10, La/z7i;->u:La/b8u;

    .line 216
    .line 217
    move-object/from16 v23, v1

    .line 218
    .line 219
    iget-object v1, v10, La/z7i;->v:La/lqc;

    .line 220
    .line 221
    move-object/from16 v24, v1

    .line 222
    .line 223
    iget-object v1, v10, La/z7i;->w:La/lqc;

    .line 224
    .line 225
    move-object/from16 v25, v1

    .line 226
    .line 227
    iget-object v1, v10, La/z7i;->x:La/foi0;

    .line 228
    .line 229
    move-object/from16 v26, v1

    .line 230
    .line 231
    iget-object v1, v10, La/z7i;->y:La/ali;

    .line 232
    .line 233
    move-object/from16 v27, v1

    .line 234
    .line 235
    iget-object v1, v10, La/z7i;->z:La/nr;

    .line 236
    .line 237
    move-object/from16 v28, v1

    .line 238
    .line 239
    iget-object v1, v10, La/z7i;->A:La/yuu;

    .line 240
    .line 241
    move-object/from16 v29, v1

    .line 242
    .line 243
    iget-object v1, v10, La/z7i;->B:La/x4u;

    .line 244
    .line 245
    move-object/from16 v30, v1

    .line 246
    .line 247
    new-instance v1, La/jqt;

    .line 248
    .line 249
    move-object/from16 v31, v2

    .line 250
    .line 251
    iget-object v2, v10, La/z7i;->C:La/gst0;

    .line 252
    .line 253
    invoke-direct {v1, v2}, La/jqt;-><init>(La/gst0;)V

    .line 254
    .line 255
    .line 256
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, La/uii;

    .line 259
    .line 260
    invoke-virtual {v0}, La/uii;->i()La/dmt;

    .line 261
    .line 262
    .line 263
    move-result-object v32

    .line 264
    iget-object v0, v10, La/z7i;->D:La/l570;

    .line 265
    .line 266
    iget-object v2, v10, La/z7i;->E:La/jtj;

    .line 267
    .line 268
    move-object/from16 v33, v0

    .line 269
    .line 270
    iget-object v0, v10, La/z7i;->F:La/kyg0;

    .line 271
    .line 272
    iget-object v10, v10, La/z7i;->G:La/g2v;

    .line 273
    .line 274
    move-object/from16 v35, v0

    .line 275
    .line 276
    move-object/from16 v34, v2

    .line 277
    .line 278
    move-object/from16 v36, v10

    .line 279
    .line 280
    move-object/from16 v10, v16

    .line 281
    .line 282
    move-object/from16 v16, v22

    .line 283
    .line 284
    move-object/from16 v2, v31

    .line 285
    .line 286
    move-object/from16 v22, p0

    .line 287
    .line 288
    move-object/from16 v31, v1

    .line 289
    .line 290
    invoke-direct/range {v2 .. v36}, La/bs60;-><init>(Landroid/os/Bundle;La/ih5;La/s31;La/l7k;La/cmt;La/cyu;La/hs60;La/gw60;La/wsf0;La/nn60;La/oeg0;La/i1w0;La/ouu;La/ctf0;La/duj;La/mne;La/v88;La/m1e;La/hnu;La/pru;La/b8u;La/lqc;La/lqc;La/foi0;La/ali;La/nr;La/yuu;La/x4u;La/jqt;La/dmt;La/l570;La/jtj;La/kyg0;La/g2v;)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v31, v2

    .line 294
    .line 295
    return-object v31

    .line 296
    :pswitch_3
    new-instance v0, La/h52;

    .line 297
    .line 298
    check-cast v10, La/ru;

    .line 299
    .line 300
    iget-object v1, v10, La/ru;->a:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 303
    .line 304
    iget-object v2, v10, La/ru;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, La/f8w;

    .line 307
    .line 308
    new-instance v3, La/uyn;

    .line 309
    .line 310
    new-instance v4, La/ok50;

    .line 311
    .line 312
    iget-object v6, v10, La/ru;->c:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v6, La/t37;

    .line 315
    .line 316
    invoke-direct {v4, v6}, La/ok50;-><init>(La/t37;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v3, v4}, La/uyn;-><init>(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    new-instance v4, La/o470;

    .line 323
    .line 324
    new-instance v7, La/ok50;

    .line 325
    .line 326
    invoke-direct {v7, v6}, La/ok50;-><init>(La/t37;)V

    .line 327
    .line 328
    .line 329
    invoke-direct {v4, v7}, La/o470;-><init>(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    new-instance v6, La/ugf0;

    .line 333
    .line 334
    new-instance v7, La/dpi0;

    .line 335
    .line 336
    iget-object v8, v10, La/ru;->d:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v8, La/j77;

    .line 339
    .line 340
    invoke-direct {v7, v8}, La/dpi0;-><init>(La/j77;)V

    .line 341
    .line 342
    .line 343
    invoke-direct {v6, v7}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    iget-object v7, v10, La/ru;->f:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v7, La/pru;

    .line 349
    .line 350
    iget-object v11, v10, La/ru;->e:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v11, La/ctf0;

    .line 353
    .line 354
    new-instance v12, La/f4u;

    .line 355
    .line 356
    new-instance v13, La/prc;

    .line 357
    .line 358
    iget-object v14, v10, La/ru;->g:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v14, La/xdj;

    .line 361
    .line 362
    invoke-direct {v13, v14}, La/prc;-><init>(La/xdj;)V

    .line 363
    .line 364
    .line 365
    invoke-direct {v12, v13, v9}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 366
    .line 367
    .line 368
    new-instance v9, La/epi0;

    .line 369
    .line 370
    new-instance v13, La/prc;

    .line 371
    .line 372
    invoke-direct {v13, v14}, La/prc;-><init>(La/xdj;)V

    .line 373
    .line 374
    .line 375
    invoke-direct {v9, v13, v5}, La/epi0;-><init>(Ljava/lang/Object;B)V

    .line 376
    .line 377
    .line 378
    iget-object v5, v10, La/ru;->h:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v5, La/r9u;

    .line 381
    .line 382
    move-object v13, v5

    .line 383
    move-object v5, v6

    .line 384
    move-object v6, v7

    .line 385
    move-object v7, v11

    .line 386
    new-instance v11, La/hnu;

    .line 387
    .line 388
    new-instance v14, La/dpi0;

    .line 389
    .line 390
    invoke-direct {v14, v8}, La/dpi0;-><init>(La/j77;)V

    .line 391
    .line 392
    .line 393
    invoke-direct {v11, v14}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    iget-object v8, v10, La/ru;->i:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v8, La/cad;

    .line 399
    .line 400
    iget-object v8, v8, La/cad;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v8, La/psc;

    .line 403
    .line 404
    invoke-virtual {v8}, La/psc;->h()La/mne;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    move-object v10, v12

    .line 412
    move-object v12, v8

    .line 413
    move-object v8, v10

    .line 414
    move-object v10, v13

    .line 415
    invoke-direct/range {v0 .. v12}, La/h52;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;La/uyn;La/o470;La/ugf0;La/pru;La/ctf0;La/f4u;La/epi0;La/r9u;La/hnu;La/mne;)V

    .line 416
    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_4
    new-instance v1, La/x7i;

    .line 420
    .line 421
    invoke-direct {v1, v0}, La/x7i;-><init>(La/t5i;)V

    .line 422
    .line 423
    .line 424
    return-object v1

    .line 425
    :pswitch_5
    new-instance v2, La/wk1;

    .line 426
    .line 427
    check-cast v10, La/v7i;

    .line 428
    .line 429
    iget-object v0, v10, La/v7i;->i:Ljava/lang/Object;

    .line 430
    .line 431
    move-object v3, v0

    .line 432
    check-cast v3, La/rl1;

    .line 433
    .line 434
    iget-object v0, v10, La/v7i;->g:Ljava/lang/Object;

    .line 435
    .line 436
    move-object v4, v0

    .line 437
    check-cast v4, La/duj;

    .line 438
    .line 439
    iget-object v0, v10, La/v7i;->e:Ljava/lang/Object;

    .line 440
    .line 441
    move-object v5, v0

    .line 442
    check-cast v5, La/vw3;

    .line 443
    .line 444
    iget-object v0, v10, La/v7i;->f:Ljava/lang/Object;

    .line 445
    .line 446
    move-object v6, v0

    .line 447
    check-cast v6, La/oeg0;

    .line 448
    .line 449
    iget-object v0, v10, La/v7i;->c:Ljava/lang/Object;

    .line 450
    .line 451
    move-object v7, v0

    .line 452
    check-cast v7, La/ctf0;

    .line 453
    .line 454
    iget-object v0, v10, La/v7i;->d:Ljava/lang/Object;

    .line 455
    .line 456
    move-object v8, v0

    .line 457
    check-cast v8, La/m1e;

    .line 458
    .line 459
    iget-object v0, v10, La/v7i;->h:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, La/cad;

    .line 462
    .line 463
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, La/psc;

    .line 466
    .line 467
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    iget-object v0, v10, La/v7i;->j:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v0, La/uyu;

    .line 477
    .line 478
    iget-object v1, v10, La/v7i;->k:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v11, v1

    .line 481
    check-cast v11, La/bzt;

    .line 482
    .line 483
    iget-object v1, v10, La/v7i;->l:Ljava/lang/Object;

    .line 484
    .line 485
    move-object v12, v1

    .line 486
    check-cast v12, La/r9u;

    .line 487
    .line 488
    new-instance v13, La/dgu;

    .line 489
    .line 490
    new-instance v1, La/pou;

    .line 491
    .line 492
    iget-object v14, v10, La/v7i;->a:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v14, La/ehf0;

    .line 495
    .line 496
    iget-object v14, v14, La/ehf0;->b:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v14, La/i7i;

    .line 499
    .line 500
    invoke-virtual {v14}, La/i7i;->c()La/qgd;

    .line 501
    .line 502
    .line 503
    move-result-object v14

    .line 504
    invoke-direct {v1, v14}, La/pou;-><init>(La/qgd;)V

    .line 505
    .line 506
    .line 507
    iget-object v14, v10, La/v7i;->m:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v14, La/ieu;

    .line 510
    .line 511
    iget-object v15, v10, La/v7i;->b:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v15, La/ntu;

    .line 514
    .line 515
    iget-object v10, v10, La/v7i;->n:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v10, La/wyu;

    .line 518
    .line 519
    invoke-direct {v13, v1, v14, v15, v10}, La/dgu;-><init>(La/pou;La/ieu;La/ntu;La/wyu;)V

    .line 520
    .line 521
    .line 522
    move-object v10, v0

    .line 523
    invoke-direct/range {v2 .. v13}, La/wk1;-><init>(La/rl1;La/duj;La/vw3;La/oeg0;La/ctf0;La/m1e;La/mne;La/uyu;La/bzt;La/r9u;La/dgu;)V

    .line 524
    .line 525
    .line 526
    return-object v2

    .line 527
    :pswitch_6
    new-instance v3, La/ce1;

    .line 528
    .line 529
    check-cast v10, La/rrd;

    .line 530
    .line 531
    iget-object v0, v10, La/rrd;->b:Ljava/lang/Object;

    .line 532
    .line 533
    move-object v4, v0

    .line 534
    check-cast v4, La/i1w0;

    .line 535
    .line 536
    iget-object v0, v10, La/rrd;->c:Ljava/lang/Object;

    .line 537
    .line 538
    move-object v5, v0

    .line 539
    check-cast v5, La/ctf0;

    .line 540
    .line 541
    iget-object v0, v10, La/rrd;->d:Ljava/lang/Object;

    .line 542
    .line 543
    move-object v6, v0

    .line 544
    check-cast v6, La/peg0;

    .line 545
    .line 546
    iget-object v0, v10, La/rrd;->e:Ljava/lang/Object;

    .line 547
    .line 548
    move-object v7, v0

    .line 549
    check-cast v7, La/b4j;

    .line 550
    .line 551
    iget-object v0, v10, La/rrd;->f:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v0, La/d1p;

    .line 554
    .line 555
    invoke-interface {v0}, La/d1p;->S0()La/je;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    iget-object v0, v10, La/rrd;->g:Ljava/lang/Object;

    .line 560
    .line 561
    move-object v9, v0

    .line 562
    check-cast v9, Ljava/util/List;

    .line 563
    .line 564
    iget-object v0, v10, La/rrd;->h:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, La/cad;

    .line 567
    .line 568
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v0, La/psc;

    .line 571
    .line 572
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 573
    .line 574
    .line 575
    move-result-object v10

    .line 576
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    invoke-direct/range {v3 .. v10}, La/ce1;-><init>(La/i1w0;La/ctf0;La/peg0;La/b4j;La/je;Ljava/util/List;La/mne;)V

    .line 580
    .line 581
    .line 582
    return-object v3

    .line 583
    :pswitch_7
    new-instance v4, La/kc1;

    .line 584
    .line 585
    check-cast v10, La/gud;

    .line 586
    .line 587
    iget-object v0, v10, La/gud;->a:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, La/cad;

    .line 590
    .line 591
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, La/psc;

    .line 594
    .line 595
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    iget-object v0, v10, La/gud;->b:Ljava/lang/Object;

    .line 603
    .line 604
    move-object v6, v0

    .line 605
    check-cast v6, La/oeg0;

    .line 606
    .line 607
    new-instance v0, La/iqt;

    .line 608
    .line 609
    iget-object v1, v10, La/gud;->c:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v1, La/gst0;

    .line 612
    .line 613
    invoke-direct {v0, v1}, La/iqt;-><init>(La/gst0;)V

    .line 614
    .line 615
    .line 616
    iget-object v1, v10, La/gud;->d:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v1, La/wsf0;

    .line 619
    .line 620
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v2, La/g45;

    .line 623
    .line 624
    invoke-virtual {v2}, La/g45;->G()La/khf0;

    .line 625
    .line 626
    .line 627
    move-result-object v8

    .line 628
    new-instance v9, La/fv70;

    .line 629
    .line 630
    new-instance v2, La/iw20;

    .line 631
    .line 632
    iget-object v3, v10, La/gud;->e:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v3, La/pl1;

    .line 635
    .line 636
    invoke-direct {v2, v3}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    iget-object v11, v10, La/gud;->f:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v11, La/wsf0;

    .line 642
    .line 643
    iget-object v12, v11, La/wsf0;->b:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v12, La/rrc;

    .line 646
    .line 647
    invoke-virtual {v12}, La/rrc;->x()La/uyn;

    .line 648
    .line 649
    .line 650
    move-result-object v12

    .line 651
    invoke-direct {v9, v2, v12}, La/fv70;-><init>(La/iw20;La/uyn;)V

    .line 652
    .line 653
    .line 654
    new-instance v2, La/gv70;

    .line 655
    .line 656
    new-instance v12, La/jw20;

    .line 657
    .line 658
    invoke-direct {v12, v3, v7}, La/jw20;-><init>(Ljava/lang/Object;B)V

    .line 659
    .line 660
    .line 661
    iget-object v3, v11, La/wsf0;->b:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v3, La/rrc;

    .line 664
    .line 665
    invoke-virtual {v3}, La/rrc;->x()La/uyn;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-direct {v2, v12, v3}, La/gv70;-><init>(La/jw20;La/uyn;)V

    .line 670
    .line 671
    .line 672
    iget-object v3, v10, La/gud;->g:Ljava/lang/Object;

    .line 673
    .line 674
    move-object v11, v3

    .line 675
    check-cast v11, La/ntu;

    .line 676
    .line 677
    iget-object v3, v10, La/gud;->h:Ljava/lang/Object;

    .line 678
    .line 679
    move-object v12, v3

    .line 680
    check-cast v12, La/a6u;

    .line 681
    .line 682
    iget-object v3, v10, La/gud;->i:Ljava/lang/Object;

    .line 683
    .line 684
    move-object v13, v3

    .line 685
    check-cast v13, La/u58;

    .line 686
    .line 687
    iget-object v3, v10, La/gud;->j:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v3, La/d1p;

    .line 690
    .line 691
    invoke-interface {v3}, La/d1p;->E()La/au0;

    .line 692
    .line 693
    .line 694
    move-result-object v14

    .line 695
    iget-object v7, v10, La/gud;->k:Ljava/lang/Object;

    .line 696
    .line 697
    move-object v15, v7

    .line 698
    check-cast v15, La/bzu;

    .line 699
    .line 700
    iget-object v7, v10, La/gud;->l:Ljava/lang/Object;

    .line 701
    .line 702
    move-object/from16 v16, v7

    .line 703
    .line 704
    check-cast v16, La/duj;

    .line 705
    .line 706
    iget-object v7, v10, La/gud;->m:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v7, La/fvt0;

    .line 709
    .line 710
    move-object/from16 p0, v0

    .line 711
    .line 712
    iget-object v0, v7, La/fvt0;->a:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v0, La/h7i;

    .line 715
    .line 716
    invoke-virtual {v0}, La/h7i;->f()La/es;

    .line 717
    .line 718
    .line 719
    move-result-object v17

    .line 720
    iget-object v0, v7, La/fvt0;->a:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v0, La/h7i;

    .line 723
    .line 724
    invoke-virtual {v0}, La/h7i;->c()La/kki;

    .line 725
    .line 726
    .line 727
    move-result-object v18

    .line 728
    iget-object v0, v10, La/gud;->n:Ljava/lang/Object;

    .line 729
    .line 730
    move-object/from16 v19, v0

    .line 731
    .line 732
    check-cast v19, La/do20;

    .line 733
    .line 734
    iget-object v0, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v0, La/g45;

    .line 737
    .line 738
    invoke-virtual {v0}, La/g45;->o0()La/hcp0;

    .line 739
    .line 740
    .line 741
    move-result-object v20

    .line 742
    iget-object v0, v7, La/fvt0;->a:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v0, La/h7i;

    .line 745
    .line 746
    invoke-virtual {v0}, La/h7i;->o()La/qoc;

    .line 747
    .line 748
    .line 749
    move-result-object v21

    .line 750
    invoke-virtual {v1}, La/wsf0;->s()La/trm0;

    .line 751
    .line 752
    .line 753
    move-result-object v22

    .line 754
    iget-object v0, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v0, La/g45;

    .line 757
    .line 758
    invoke-virtual {v0}, La/g45;->E()La/nou;

    .line 759
    .line 760
    .line 761
    move-result-object v23

    .line 762
    iget-object v0, v10, La/gud;->o:Ljava/lang/Object;

    .line 763
    .line 764
    move-object/from16 v24, v0

    .line 765
    .line 766
    check-cast v24, La/lrc;

    .line 767
    .line 768
    iget-object v0, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v0, La/g45;

    .line 771
    .line 772
    invoke-virtual {v0}, La/g45;->q()La/nrt;

    .line 773
    .line 774
    .line 775
    move-result-object v25

    .line 776
    iget-object v0, v10, La/gud;->p:Ljava/lang/Object;

    .line 777
    .line 778
    move-object/from16 v26, v0

    .line 779
    .line 780
    check-cast v26, La/yzn0;

    .line 781
    .line 782
    iget-object v0, v10, La/gud;->q:Ljava/lang/Object;

    .line 783
    .line 784
    move-object/from16 v27, v0

    .line 785
    .line 786
    check-cast v27, La/ubu;

    .line 787
    .line 788
    iget-object v0, v10, La/gud;->r:Ljava/lang/Object;

    .line 789
    .line 790
    move-object/from16 v28, v0

    .line 791
    .line 792
    check-cast v28, La/tqx;

    .line 793
    .line 794
    iget-object v0, v7, La/fvt0;->a:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v0, La/h7i;

    .line 797
    .line 798
    invoke-virtual {v0}, La/h7i;->l()La/es;

    .line 799
    .line 800
    .line 801
    move-result-object v29

    .line 802
    iget-object v0, v10, La/gud;->s:Ljava/lang/Object;

    .line 803
    .line 804
    move-object/from16 v30, v0

    .line 805
    .line 806
    check-cast v30, La/s31;

    .line 807
    .line 808
    invoke-interface {v3}, La/d1p;->r0()La/s64;

    .line 809
    .line 810
    .line 811
    move-result-object v31

    .line 812
    iget-object v0, v10, La/gud;->t:Ljava/lang/Object;

    .line 813
    .line 814
    move-object/from16 v32, v0

    .line 815
    .line 816
    check-cast v32, La/ctf0;

    .line 817
    .line 818
    iget-object v0, v10, La/gud;->u:Ljava/lang/Object;

    .line 819
    .line 820
    move-object/from16 v33, v0

    .line 821
    .line 822
    check-cast v33, La/db1;

    .line 823
    .line 824
    iget-object v0, v10, La/gud;->v:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v0, Ljava/lang/Boolean;

    .line 827
    .line 828
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 829
    .line 830
    .line 831
    move-result v34

    .line 832
    move-object/from16 v7, p0

    .line 833
    .line 834
    move-object v10, v2

    .line 835
    invoke-direct/range {v4 .. v34}, La/kc1;-><init>(La/mne;La/oeg0;La/iqt;La/khf0;La/fv70;La/gv70;La/ntu;La/a6u;La/u58;La/au0;La/bzu;La/duj;La/es;La/kki;La/do20;La/hcp0;La/qoc;La/trm0;La/nou;La/lrc;La/nrt;La/yzn0;La/ubu;La/tqx;La/es;La/s31;La/s64;La/ctf0;La/db1;Z)V

    .line 836
    .line 837
    .line 838
    return-object v4

    .line 839
    :pswitch_8
    new-instance v9, La/ja1;

    .line 840
    .line 841
    check-cast v10, La/gr00;

    .line 842
    .line 843
    iget-object v0, v10, La/gr00;->a:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v0, La/ctf0;

    .line 846
    .line 847
    iget-object v1, v10, La/gr00;->b:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v1, La/iqt;

    .line 850
    .line 851
    iget-object v2, v10, La/gr00;->c:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v2, La/cad;

    .line 854
    .line 855
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v2, La/psc;

    .line 858
    .line 859
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    iget-object v3, v10, La/gr00;->d:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v3, La/kc60;

    .line 869
    .line 870
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    new-instance v11, La/nc;

    .line 874
    .line 875
    const/16 v4, 0x11

    .line 876
    .line 877
    invoke-direct {v11, v1, v4}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 878
    .line 879
    .line 880
    new-instance v12, La/uc;

    .line 881
    .line 882
    invoke-direct {v12, v0, v7}, La/uc;-><init>(La/ctf0;B)V

    .line 883
    .line 884
    .line 885
    iget-object v0, v2, La/mne;->c:La/vs10;

    .line 886
    .line 887
    iget-object v1, v2, La/mne;->a:La/rwj;

    .line 888
    .line 889
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 890
    .line 891
    .line 892
    move-result-object v13

    .line 893
    const/4 v14, 0x0

    .line 894
    const/4 v10, 0x0

    .line 895
    invoke-direct/range {v9 .. v14}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v3}, La/kc60;->a()La/p7m0;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    new-instance v1, La/qa;

    .line 903
    .line 904
    const/16 v3, 0x12

    .line 905
    .line 906
    invoke-direct {v1, v9, v6, v3}, La/qa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 907
    .line 908
    .line 909
    new-instance v3, La/fnq;

    .line 910
    .line 911
    invoke-direct {v3, v0, v1, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 912
    .line 913
    .line 914
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    iget-object v1, v2, La/mne;->b:La/dvj;

    .line 919
    .line 920
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    sget-object v1, La/ia1;->h:La/ia1;

    .line 925
    .line 926
    invoke-static {v3, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 927
    .line 928
    .line 929
    return-object v9

    .line 930
    :pswitch_9
    move-object v0, v10

    .line 931
    new-instance v10, La/n91;

    .line 932
    .line 933
    check-cast v0, La/h7i;

    .line 934
    .line 935
    iget-object v1, v0, La/h7i;->h:Ljava/lang/Object;

    .line 936
    .line 937
    move-object v11, v1

    .line 938
    check-cast v11, La/us00;

    .line 939
    .line 940
    iget-object v1, v0, La/h7i;->i:Ljava/lang/Object;

    .line 941
    .line 942
    move-object v12, v1

    .line 943
    check-cast v12, La/n71;

    .line 944
    .line 945
    iget-object v13, v0, La/h7i;->a:La/ctf0;

    .line 946
    .line 947
    iget-object v1, v0, La/h7i;->j:Ljava/lang/Object;

    .line 948
    .line 949
    move-object v14, v1

    .line 950
    check-cast v14, La/duj;

    .line 951
    .line 952
    iget-object v1, v0, La/h7i;->b:La/cad;

    .line 953
    .line 954
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v1, La/psc;

    .line 957
    .line 958
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 959
    .line 960
    .line 961
    move-result-object v15

    .line 962
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    iget-object v1, v0, La/h7i;->k:Ljava/lang/Object;

    .line 966
    .line 967
    move-object/from16 v16, v1

    .line 968
    .line 969
    check-cast v16, La/i1w0;

    .line 970
    .line 971
    iget-object v1, v0, La/h7i;->c:La/j1q0;

    .line 972
    .line 973
    iget-object v2, v0, La/h7i;->d:La/wsf0;

    .line 974
    .line 975
    iget-object v3, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 976
    .line 977
    check-cast v3, La/g45;

    .line 978
    .line 979
    invoke-virtual {v3}, La/g45;->o0()La/hcp0;

    .line 980
    .line 981
    .line 982
    move-result-object v18

    .line 983
    iget-object v3, v0, La/h7i;->l:Ljava/lang/Object;

    .line 984
    .line 985
    move-object/from16 v19, v3

    .line 986
    .line 987
    check-cast v19, La/iqt;

    .line 988
    .line 989
    new-instance v3, La/kc60;

    .line 990
    .line 991
    iget-object v4, v0, La/h7i;->e:La/gst0;

    .line 992
    .line 993
    invoke-direct {v3, v4}, La/kc60;-><init>(La/gst0;)V

    .line 994
    .line 995
    .line 996
    iget-object v4, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 997
    .line 998
    check-cast v4, La/g45;

    .line 999
    .line 1000
    invoke-virtual {v4}, La/g45;->G()La/khf0;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v21

    .line 1004
    iget-object v4, v0, La/h7i;->m:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast v4, La/fvt0;

    .line 1007
    .line 1008
    iget-object v5, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v5, La/h7i;

    .line 1011
    .line 1012
    invoke-virtual {v5}, La/h7i;->b()La/xex;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v22

    .line 1016
    iget-object v5, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v5, La/h7i;

    .line 1019
    .line 1020
    invoke-virtual {v5}, La/h7i;->n()La/zn00;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v23

    .line 1024
    new-instance v5, La/fv70;

    .line 1025
    .line 1026
    new-instance v6, La/iw20;

    .line 1027
    .line 1028
    iget-object v8, v0, La/h7i;->n:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v8, La/pl1;

    .line 1031
    .line 1032
    invoke-direct {v6, v8}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    iget-object v9, v0, La/h7i;->f:La/wsf0;

    .line 1036
    .line 1037
    iget-object v7, v9, La/wsf0;->b:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v7, La/rrc;

    .line 1040
    .line 1041
    invoke-virtual {v7}, La/rrc;->x()La/uyn;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v7

    .line 1045
    invoke-direct {v5, v6, v7}, La/fv70;-><init>(La/iw20;La/uyn;)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v6, La/gv70;

    .line 1049
    .line 1050
    new-instance v7, La/jw20;

    .line 1051
    .line 1052
    move-object/from16 v20, v1

    .line 1053
    .line 1054
    const/16 v1, 0xa

    .line 1055
    .line 1056
    invoke-direct {v7, v8, v1}, La/jw20;-><init>(Ljava/lang/Object;B)V

    .line 1057
    .line 1058
    .line 1059
    iget-object v1, v9, La/wsf0;->b:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v1, La/rrc;

    .line 1062
    .line 1063
    invoke-virtual {v1}, La/rrc;->x()La/uyn;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-direct {v6, v7, v1}, La/gv70;-><init>(La/jw20;La/uyn;)V

    .line 1068
    .line 1069
    .line 1070
    iget-object v1, v0, La/h7i;->g:La/ntu;

    .line 1071
    .line 1072
    iget-object v7, v0, La/h7i;->o:Ljava/lang/Object;

    .line 1073
    .line 1074
    move-object/from16 v27, v7

    .line 1075
    .line 1076
    check-cast v27, La/a6u;

    .line 1077
    .line 1078
    iget-object v7, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v7, La/h7i;

    .line 1081
    .line 1082
    invoke-virtual {v7}, La/h7i;->f()La/es;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v28

    .line 1086
    iget-object v7, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 1087
    .line 1088
    check-cast v7, La/h7i;

    .line 1089
    .line 1090
    invoke-virtual {v7}, La/h7i;->c()La/kki;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v29

    .line 1094
    invoke-virtual {v2}, La/wsf0;->s()La/trm0;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v30

    .line 1098
    invoke-virtual {v4}, La/fvt0;->p()La/wyb;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v31

    .line 1102
    iget-object v7, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 1103
    .line 1104
    check-cast v7, La/h7i;

    .line 1105
    .line 1106
    invoke-virtual {v7}, La/h7i;->o()La/qoc;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v32

    .line 1110
    iget-object v7, v0, La/h7i;->p:Ljava/lang/Object;

    .line 1111
    .line 1112
    move-object/from16 v33, v7

    .line 1113
    .line 1114
    check-cast v33, La/yzn0;

    .line 1115
    .line 1116
    iget-object v7, v0, La/h7i;->q:Ljava/lang/Object;

    .line 1117
    .line 1118
    move-object/from16 v34, v7

    .line 1119
    .line 1120
    check-cast v34, La/ubu;

    .line 1121
    .line 1122
    iget-object v7, v0, La/h7i;->r:Ljava/lang/Object;

    .line 1123
    .line 1124
    move-object/from16 v35, v7

    .line 1125
    .line 1126
    check-cast v35, La/tqx;

    .line 1127
    .line 1128
    iget-object v7, v0, La/h7i;->s:Ljava/lang/Object;

    .line 1129
    .line 1130
    move-object/from16 v36, v7

    .line 1131
    .line 1132
    check-cast v36, La/do20;

    .line 1133
    .line 1134
    iget-object v7, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v7, La/g45;

    .line 1137
    .line 1138
    invoke-virtual {v7}, La/g45;->q()La/nrt;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v37

    .line 1142
    invoke-virtual {v2}, La/wsf0;->g()La/urt;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v38

    .line 1146
    iget-object v4, v4, La/fvt0;->a:Ljava/lang/Object;

    .line 1147
    .line 1148
    check-cast v4, La/h7i;

    .line 1149
    .line 1150
    new-instance v39, La/mii0;

    .line 1151
    .line 1152
    new-instance v7, La/ehf0;

    .line 1153
    .line 1154
    iget-object v8, v4, La/h7i;->A:Ljava/lang/Object;

    .line 1155
    .line 1156
    check-cast v8, La/n5d0;

    .line 1157
    .line 1158
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v8

    .line 1162
    check-cast v8, La/dn0;

    .line 1163
    .line 1164
    iget-object v9, v4, La/h7i;->b:La/cad;

    .line 1165
    .line 1166
    iget-object v9, v9, La/cad;->b:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v9, La/psc;

    .line 1169
    .line 1170
    invoke-virtual {v9}, La/psc;->h()La/mne;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v9

    .line 1174
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    invoke-direct {v7, v8, v9}, La/ehf0;-><init>(La/dn0;La/mne;)V

    .line 1178
    .line 1179
    .line 1180
    iget-object v8, v4, La/h7i;->g:La/ntu;

    .line 1181
    .line 1182
    new-instance v9, La/iqt;

    .line 1183
    .line 1184
    move-object/from16 v26, v1

    .line 1185
    .line 1186
    iget-object v1, v4, La/h7i;->e:La/gst0;

    .line 1187
    .line 1188
    invoke-direct {v9, v1}, La/iqt;-><init>(La/gst0;)V

    .line 1189
    .line 1190
    .line 1191
    iget-object v1, v4, La/h7i;->m:Ljava/lang/Object;

    .line 1192
    .line 1193
    move-object/from16 v43, v1

    .line 1194
    .line 1195
    check-cast v43, La/pru;

    .line 1196
    .line 1197
    const/16 v44, 0xf

    .line 1198
    .line 1199
    move-object/from16 v40, v7

    .line 1200
    .line 1201
    move-object/from16 v41, v8

    .line 1202
    .line 1203
    move-object/from16 v42, v9

    .line 1204
    .line 1205
    invoke-direct/range {v39 .. v44}, La/mii0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1206
    .line 1207
    .line 1208
    iget-object v1, v0, La/h7i;->t:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v1, La/iw20;

    .line 1211
    .line 1212
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v1, La/uii;

    .line 1215
    .line 1216
    invoke-virtual {v1}, La/uii;->r()La/pru;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v40

    .line 1220
    iget-object v1, v0, La/h7i;->u:Ljava/lang/Object;

    .line 1221
    .line 1222
    move-object/from16 v41, v1

    .line 1223
    .line 1224
    check-cast v41, La/v88;

    .line 1225
    .line 1226
    iget-object v1, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1227
    .line 1228
    check-cast v1, La/g45;

    .line 1229
    .line 1230
    invoke-virtual {v1}, La/g45;->p()La/mrt;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v42

    .line 1234
    iget-object v1, v2, La/wsf0;->b:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v1, La/g45;

    .line 1237
    .line 1238
    invoke-virtual {v1}, La/g45;->E()La/nou;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v43

    .line 1242
    iget-object v1, v0, La/h7i;->v:Ljava/lang/Object;

    .line 1243
    .line 1244
    move-object/from16 v44, v1

    .line 1245
    .line 1246
    check-cast v44, La/lrc;

    .line 1247
    .line 1248
    iget-object v1, v0, La/h7i;->w:Ljava/lang/Object;

    .line 1249
    .line 1250
    move-object/from16 v45, v1

    .line 1251
    .line 1252
    check-cast v45, La/ih5;

    .line 1253
    .line 1254
    iget-object v1, v0, La/h7i;->x:Ljava/lang/Object;

    .line 1255
    .line 1256
    check-cast v1, La/d1p;

    .line 1257
    .line 1258
    invoke-interface {v1}, La/d1p;->C()La/l7k;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v46

    .line 1262
    invoke-interface {v1}, La/d1p;->b()La/s64;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v47

    .line 1266
    invoke-interface {v1}, La/d1p;->D0()La/cmt;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v48

    .line 1270
    iget-object v2, v0, La/h7i;->y:Ljava/lang/Object;

    .line 1271
    .line 1272
    move-object/from16 v49, v2

    .line 1273
    .line 1274
    check-cast v49, La/zg;

    .line 1275
    .line 1276
    invoke-interface {v1}, La/d1p;->n()La/au0;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v50

    .line 1280
    iget-object v1, v0, La/h7i;->z:Ljava/lang/Object;

    .line 1281
    .line 1282
    move-object/from16 v51, v1

    .line 1283
    .line 1284
    check-cast v51, La/bzt;

    .line 1285
    .line 1286
    iget-object v0, v0, La/h7i;->A:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v0, La/nr00;

    .line 1289
    .line 1290
    iget-object v0, v0, La/nr00;->a:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast v0, La/vqc;

    .line 1293
    .line 1294
    invoke-virtual {v0}, La/vqc;->o()La/ytt;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v52

    .line 1298
    move-object/from16 v24, v5

    .line 1299
    .line 1300
    move-object/from16 v25, v6

    .line 1301
    .line 1302
    move-object/from16 v17, v20

    .line 1303
    .line 1304
    move-object/from16 v20, v3

    .line 1305
    .line 1306
    invoke-direct/range {v10 .. v52}, La/n91;-><init>(La/us00;La/n71;La/ctf0;La/duj;La/mne;La/i1w0;La/j1q0;La/hcp0;La/iqt;La/kc60;La/khf0;La/xex;La/zn00;La/fv70;La/gv70;La/ntu;La/a6u;La/es;La/kki;La/trm0;La/wyb;La/qoc;La/yzn0;La/ubu;La/tqx;La/do20;La/nrt;La/urt;La/mii0;La/pru;La/v88;La/mrt;La/nou;La/lrc;La/ih5;La/l7k;La/s64;La/cmt;La/zg;La/au0;La/bzt;La/ytt;)V

    .line 1307
    .line 1308
    .line 1309
    return-object v10

    .line 1310
    :pswitch_a
    move-object v1, v10

    .line 1311
    new-instance v0, La/c41;

    .line 1312
    .line 1313
    move-object v10, v1

    .line 1314
    check-cast v10, La/ywq0;

    .line 1315
    .line 1316
    iget-object v1, v10, La/ywq0;->a:Ljava/lang/Object;

    .line 1317
    .line 1318
    check-cast v1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

    .line 1319
    .line 1320
    iget-object v2, v10, La/ywq0;->b:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v2, La/grj;

    .line 1323
    .line 1324
    iget-object v3, v10, La/ywq0;->c:Ljava/lang/Object;

    .line 1325
    .line 1326
    check-cast v3, La/e41;

    .line 1327
    .line 1328
    iget-object v4, v10, La/ywq0;->d:Ljava/lang/Object;

    .line 1329
    .line 1330
    check-cast v4, La/s31;

    .line 1331
    .line 1332
    iget-object v5, v10, La/ywq0;->e:Ljava/lang/Object;

    .line 1333
    .line 1334
    check-cast v5, La/cad;

    .line 1335
    .line 1336
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v5, La/psc;

    .line 1339
    .line 1340
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v5

    .line 1344
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    iget-object v6, v10, La/ywq0;->f:Ljava/lang/Object;

    .line 1348
    .line 1349
    check-cast v6, La/ctf0;

    .line 1350
    .line 1351
    invoke-direct/range {v0 .. v6}, La/c41;-><init>(Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;La/grj;La/e41;La/s31;La/mne;La/ctf0;)V

    .line 1352
    .line 1353
    .line 1354
    return-object v0

    .line 1355
    :pswitch_b
    new-instance v1, La/r7i;

    .line 1356
    .line 1357
    invoke-direct {v1, v0}, La/r7i;-><init>(La/t5i;)V

    .line 1358
    .line 1359
    .line 1360
    return-object v1

    .line 1361
    :pswitch_c
    move-object v1, v10

    .line 1362
    new-instance v0, La/pv0;

    .line 1363
    .line 1364
    move-object v10, v1

    .line 1365
    check-cast v10, La/nr;

    .line 1366
    .line 1367
    iget-object v1, v10, La/nr;->b:Ljava/lang/Object;

    .line 1368
    .line 1369
    check-cast v1, La/ctf0;

    .line 1370
    .line 1371
    iget-object v2, v10, La/nr;->c:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v2, La/cad;

    .line 1374
    .line 1375
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v2, La/psc;

    .line 1378
    .line 1379
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    iget-object v3, v2, La/mne;->c:La/vs10;

    .line 1390
    .line 1391
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 1392
    .line 1393
    invoke-static {v3, v2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    new-instance v3, La/mg0;

    .line 1398
    .line 1399
    invoke-direct {v3, v4}, La/mg0;-><init>(B)V

    .line 1400
    .line 1401
    .line 1402
    new-instance v4, La/uc;

    .line 1403
    .line 1404
    const/4 v5, 0x6

    .line 1405
    invoke-direct {v4, v1, v5}, La/uc;-><init>(La/ctf0;B)V

    .line 1406
    .line 1407
    .line 1408
    invoke-direct {v0, v3, v2, v4, v6}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 1409
    .line 1410
    .line 1411
    return-object v0

    .line 1412
    :pswitch_d
    move-object v1, v10

    .line 1413
    new-instance v9, La/zu0;

    .line 1414
    .line 1415
    move-object v10, v1

    .line 1416
    check-cast v10, La/esg0;

    .line 1417
    .line 1418
    iget-object v0, v10, La/esg0;->a:Ljava/lang/Object;

    .line 1419
    .line 1420
    check-cast v0, Ljava/lang/String;

    .line 1421
    .line 1422
    iget-object v1, v10, La/esg0;->b:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v1, La/ctf0;

    .line 1425
    .line 1426
    iget-object v2, v10, La/esg0;->c:Ljava/lang/Object;

    .line 1427
    .line 1428
    check-cast v2, La/iqt;

    .line 1429
    .line 1430
    iget-object v5, v10, La/esg0;->d:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v5, La/cad;

    .line 1433
    .line 1434
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 1435
    .line 1436
    check-cast v5, La/psc;

    .line 1437
    .line 1438
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v5

    .line 1442
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1443
    .line 1444
    .line 1445
    iget-object v7, v10, La/esg0;->e:Ljava/lang/Object;

    .line 1446
    .line 1447
    check-cast v7, La/kc60;

    .line 1448
    .line 1449
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1450
    .line 1451
    .line 1452
    new-instance v11, La/mc;

    .line 1453
    .line 1454
    const/16 v10, 0x9

    .line 1455
    .line 1456
    invoke-direct {v11, v0, v2, v10}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1457
    .line 1458
    .line 1459
    new-instance v12, La/uc;

    .line 1460
    .line 1461
    invoke-direct {v12, v1, v3}, La/uc;-><init>(La/ctf0;B)V

    .line 1462
    .line 1463
    .line 1464
    iget-object v0, v5, La/mne;->c:La/vs10;

    .line 1465
    .line 1466
    iget-object v1, v5, La/mne;->a:La/rwj;

    .line 1467
    .line 1468
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v13

    .line 1472
    const/4 v14, 0x0

    .line 1473
    const/4 v10, 0x0

    .line 1474
    invoke-direct/range {v9 .. v14}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v7}, La/kc60;->a()La/p7m0;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    new-instance v1, La/qa;

    .line 1482
    .line 1483
    invoke-direct {v1, v9, v6, v4}, La/qa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1484
    .line 1485
    .line 1486
    new-instance v2, La/fnq;

    .line 1487
    .line 1488
    invoke-direct {v2, v0, v1, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1489
    .line 1490
    .line 1491
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    iget-object v1, v5, La/mne;->b:La/dvj;

    .line 1496
    .line 1497
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v0

    .line 1501
    sget-object v1, La/yu0;->h:La/yu0;

    .line 1502
    .line 1503
    invoke-static {v2, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1504
    .line 1505
    .line 1506
    return-object v9

    .line 1507
    :pswitch_e
    move-object v1, v10

    .line 1508
    new-instance v10, La/tw0;

    .line 1509
    .line 1510
    move-object v0, v1

    .line 1511
    check-cast v0, La/ru;

    .line 1512
    .line 1513
    iget-object v1, v0, La/ru;->a:Ljava/lang/Object;

    .line 1514
    .line 1515
    move-object v11, v1

    .line 1516
    check-cast v11, La/us00;

    .line 1517
    .line 1518
    iget-object v1, v0, La/ru;->c:Ljava/lang/Object;

    .line 1519
    .line 1520
    move-object v12, v1

    .line 1521
    check-cast v12, La/bv0;

    .line 1522
    .line 1523
    iget-object v1, v0, La/ru;->e:Ljava/lang/Object;

    .line 1524
    .line 1525
    move-object v13, v1

    .line 1526
    check-cast v13, La/ctf0;

    .line 1527
    .line 1528
    iget-object v1, v0, La/ru;->b:Ljava/lang/Object;

    .line 1529
    .line 1530
    move-object v14, v1

    .line 1531
    check-cast v14, La/duj;

    .line 1532
    .line 1533
    iget-object v1, v0, La/ru;->d:Ljava/lang/Object;

    .line 1534
    .line 1535
    check-cast v1, La/cad;

    .line 1536
    .line 1537
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 1538
    .line 1539
    check-cast v1, La/psc;

    .line 1540
    .line 1541
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v15

    .line 1545
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1546
    .line 1547
    .line 1548
    iget-object v1, v0, La/ru;->f:Ljava/lang/Object;

    .line 1549
    .line 1550
    move-object/from16 v16, v1

    .line 1551
    .line 1552
    check-cast v16, La/oeg0;

    .line 1553
    .line 1554
    iget-object v1, v0, La/ru;->g:Ljava/lang/Object;

    .line 1555
    .line 1556
    move-object/from16 v17, v1

    .line 1557
    .line 1558
    check-cast v17, La/j1q0;

    .line 1559
    .line 1560
    iget-object v1, v0, La/ru;->h:Ljava/lang/Object;

    .line 1561
    .line 1562
    check-cast v1, La/wsf0;

    .line 1563
    .line 1564
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 1565
    .line 1566
    check-cast v1, La/g45;

    .line 1567
    .line 1568
    invoke-virtual {v1}, La/g45;->o0()La/hcp0;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v18

    .line 1572
    iget-object v0, v0, La/ru;->i:Ljava/lang/Object;

    .line 1573
    .line 1574
    move-object/from16 v19, v0

    .line 1575
    .line 1576
    check-cast v19, La/bzt;

    .line 1577
    .line 1578
    invoke-direct/range {v10 .. v19}, La/tw0;-><init>(La/us00;La/bv0;La/ctf0;La/duj;La/mne;La/oeg0;La/j1q0;La/hcp0;La/bzt;)V

    .line 1579
    .line 1580
    .line 1581
    return-object v10

    .line 1582
    :pswitch_f
    new-instance v1, La/j7i;

    .line 1583
    .line 1584
    invoke-direct {v1, v0}, La/j7i;-><init>(La/t5i;)V

    .line 1585
    .line 1586
    .line 1587
    return-object v1

    .line 1588
    :pswitch_10
    move-object v1, v10

    .line 1589
    new-instance v2, La/dn0;

    .line 1590
    .line 1591
    move-object v10, v1

    .line 1592
    check-cast v10, La/nc0;

    .line 1593
    .line 1594
    new-instance v3, La/xzp;

    .line 1595
    .line 1596
    iget-object v0, v10, La/nc0;->d:Ljava/lang/Object;

    .line 1597
    .line 1598
    check-cast v0, La/gii0;

    .line 1599
    .line 1600
    iget-object v1, v10, La/nc0;->e:Ljava/lang/Object;

    .line 1601
    .line 1602
    check-cast v1, La/x2c0;

    .line 1603
    .line 1604
    invoke-direct {v3, v0, v1}, La/xzp;-><init>(La/gii0;La/x2c0;)V

    .line 1605
    .line 1606
    .line 1607
    iget-object v0, v10, La/nc0;->h:Ljava/lang/Object;

    .line 1608
    .line 1609
    move-object v4, v0

    .line 1610
    check-cast v4, La/j51;

    .line 1611
    .line 1612
    iget-object v0, v10, La/nc0;->i:Ljava/lang/Object;

    .line 1613
    .line 1614
    move-object v5, v0

    .line 1615
    check-cast v5, La/xk0;

    .line 1616
    .line 1617
    iget-object v0, v10, La/nc0;->f:Ljava/lang/Object;

    .line 1618
    .line 1619
    move-object v6, v0

    .line 1620
    check-cast v6, La/knf0;

    .line 1621
    .line 1622
    iget-object v0, v10, La/nc0;->e:Ljava/lang/Object;

    .line 1623
    .line 1624
    move-object v7, v0

    .line 1625
    check-cast v7, La/x2c0;

    .line 1626
    .line 1627
    iget-object v0, v10, La/nc0;->j:Ljava/lang/Object;

    .line 1628
    .line 1629
    move-object v8, v0

    .line 1630
    check-cast v8, La/btt0;

    .line 1631
    .line 1632
    invoke-direct/range {v2 .. v8}, La/dn0;-><init>(La/xzp;La/j51;La/xk0;La/knf0;La/x2c0;La/btt0;)V

    .line 1633
    .line 1634
    .line 1635
    return-object v2

    .line 1636
    :pswitch_11
    new-instance v1, La/d7i;

    .line 1637
    .line 1638
    invoke-direct {v1, v0}, La/d7i;-><init>(La/t5i;)V

    .line 1639
    .line 1640
    .line 1641
    return-object v1

    .line 1642
    :pswitch_12
    new-instance v1, La/g6i;

    .line 1643
    .line 1644
    invoke-direct {v1, v0}, La/g6i;-><init>(La/t5i;)V

    .line 1645
    .line 1646
    .line 1647
    return-object v1

    .line 1648
    :pswitch_13
    new-instance v1, La/e6i;

    .line 1649
    .line 1650
    invoke-direct {v1, v0}, La/e6i;-><init>(La/t5i;)V

    .line 1651
    .line 1652
    .line 1653
    return-object v1

    .line 1654
    :pswitch_14
    new-instance v1, La/c6i;

    .line 1655
    .line 1656
    invoke-direct {v1, v0}, La/c6i;-><init>(La/t5i;)V

    .line 1657
    .line 1658
    .line 1659
    return-object v1

    .line 1660
    :pswitch_15
    move-object v1, v10

    .line 1661
    new-instance v2, La/ez;

    .line 1662
    .line 1663
    move-object v10, v1

    .line 1664
    check-cast v10, La/daf;

    .line 1665
    .line 1666
    iget-object v0, v10, La/daf;->b:Ljava/lang/Object;

    .line 1667
    .line 1668
    check-cast v0, Ljava/lang/Long;

    .line 1669
    .line 1670
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1671
    .line 1672
    .line 1673
    move-result-wide v0

    .line 1674
    new-instance v5, La/ivn;

    .line 1675
    .line 1676
    new-instance v4, La/nhf0;

    .line 1677
    .line 1678
    new-instance v6, La/h03;

    .line 1679
    .line 1680
    iget-object v7, v10, La/daf;->c:Ljava/lang/Object;

    .line 1681
    .line 1682
    check-cast v7, La/gii0;

    .line 1683
    .line 1684
    invoke-direct {v6, v7, v3}, La/h03;-><init>(La/gii0;B)V

    .line 1685
    .line 1686
    .line 1687
    iget-object v3, v10, La/daf;->d:Ljava/lang/Object;

    .line 1688
    .line 1689
    check-cast v3, La/cad;

    .line 1690
    .line 1691
    iget-object v7, v3, La/cad;->b:Ljava/lang/Object;

    .line 1692
    .line 1693
    check-cast v7, La/psc;

    .line 1694
    .line 1695
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v7

    .line 1699
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1700
    .line 1701
    .line 1702
    iget-object v8, v10, La/daf;->e:Ljava/lang/Object;

    .line 1703
    .line 1704
    check-cast v8, La/knf0;

    .line 1705
    .line 1706
    iget-object v9, v10, La/daf;->f:Ljava/lang/Object;

    .line 1707
    .line 1708
    check-cast v9, La/btt0;

    .line 1709
    .line 1710
    invoke-direct {v4, v6, v7, v8, v9}, La/nhf0;-><init>(La/h03;La/mne;La/knf0;La/btt0;)V

    .line 1711
    .line 1712
    .line 1713
    invoke-direct {v5, v4}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 1714
    .line 1715
    .line 1716
    iget-object v4, v10, La/daf;->g:Ljava/lang/Object;

    .line 1717
    .line 1718
    move-object v6, v4

    .line 1719
    check-cast v6, La/m1e;

    .line 1720
    .line 1721
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 1722
    .line 1723
    check-cast v3, La/psc;

    .line 1724
    .line 1725
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v7

    .line 1729
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1730
    .line 1731
    .line 1732
    iget-object v3, v10, La/daf;->h:Ljava/lang/Object;

    .line 1733
    .line 1734
    move-object v8, v3

    .line 1735
    check-cast v8, La/duj;

    .line 1736
    .line 1737
    iget-object v3, v10, La/daf;->i:Ljava/lang/Object;

    .line 1738
    .line 1739
    move-object v9, v3

    .line 1740
    check-cast v9, La/ctf0;

    .line 1741
    .line 1742
    iget-object v3, v10, La/daf;->j:Ljava/lang/Object;

    .line 1743
    .line 1744
    check-cast v3, La/ocl;

    .line 1745
    .line 1746
    iget-object v4, v10, La/daf;->k:Ljava/lang/Object;

    .line 1747
    .line 1748
    move-object v11, v4

    .line 1749
    check-cast v11, La/i1w0;

    .line 1750
    .line 1751
    iget-object v4, v10, La/daf;->l:Ljava/lang/Object;

    .line 1752
    .line 1753
    move-object v12, v4

    .line 1754
    check-cast v12, La/r9u;

    .line 1755
    .line 1756
    move-object v10, v3

    .line 1757
    move-wide v3, v0

    .line 1758
    invoke-direct/range {v2 .. v12}, La/ez;-><init>(JLa/ivn;La/m1e;La/mne;La/duj;La/ctf0;La/ocl;La/i1w0;La/r9u;)V

    .line 1759
    .line 1760
    .line 1761
    return-object v2

    .line 1762
    :pswitch_16
    move-object v1, v10

    .line 1763
    new-instance v3, La/ww;

    .line 1764
    .line 1765
    move-object v10, v1

    .line 1766
    check-cast v10, La/ru;

    .line 1767
    .line 1768
    iget-object v0, v10, La/ru;->a:Ljava/lang/Object;

    .line 1769
    .line 1770
    move-object v4, v0

    .line 1771
    check-cast v4, La/zg;

    .line 1772
    .line 1773
    iget-object v0, v10, La/ru;->b:Ljava/lang/Object;

    .line 1774
    .line 1775
    check-cast v0, La/cad;

    .line 1776
    .line 1777
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1778
    .line 1779
    check-cast v0, La/psc;

    .line 1780
    .line 1781
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v5

    .line 1785
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1786
    .line 1787
    .line 1788
    iget-object v0, v10, La/ru;->g:Ljava/lang/Object;

    .line 1789
    .line 1790
    move-object v6, v0

    .line 1791
    check-cast v6, La/rou;

    .line 1792
    .line 1793
    iget-object v0, v10, La/ru;->c:Ljava/lang/Object;

    .line 1794
    .line 1795
    move-object v7, v0

    .line 1796
    check-cast v7, La/nr;

    .line 1797
    .line 1798
    iget-object v0, v10, La/ru;->d:Ljava/lang/Object;

    .line 1799
    .line 1800
    check-cast v0, La/wsf0;

    .line 1801
    .line 1802
    iget-object v1, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 1803
    .line 1804
    check-cast v1, La/g45;

    .line 1805
    .line 1806
    invoke-virtual {v1}, La/g45;->t()La/m0u;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v8

    .line 1810
    iget-object v1, v10, La/ru;->e:Ljava/lang/Object;

    .line 1811
    .line 1812
    move-object v9, v1

    .line 1813
    check-cast v9, La/ctf0;

    .line 1814
    .line 1815
    iget-object v1, v10, La/ru;->f:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v1, La/pp90;

    .line 1818
    .line 1819
    invoke-interface {v1}, La/pp90;->b()La/h0q0;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v1

    .line 1823
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1824
    .line 1825
    .line 1826
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 1827
    .line 1828
    check-cast v0, La/g45;

    .line 1829
    .line 1830
    invoke-virtual {v0}, La/g45;->o()La/a7q;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v11

    .line 1834
    iget-object v0, v10, La/ru;->h:Ljava/lang/Object;

    .line 1835
    .line 1836
    check-cast v0, La/d1p;

    .line 1837
    .line 1838
    invoke-interface {v0}, La/d1p;->g0()La/je;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v12

    .line 1842
    iget-object v0, v10, La/ru;->i:Ljava/lang/Object;

    .line 1843
    .line 1844
    move-object v13, v0

    .line 1845
    check-cast v13, La/i1w0;

    .line 1846
    .line 1847
    move-object v10, v1

    .line 1848
    invoke-direct/range {v3 .. v13}, La/ww;-><init>(La/zg;La/mne;La/rou;La/nr;La/m0u;La/ctf0;La/h0q0;La/a7q;La/je;La/i1w0;)V

    .line 1849
    .line 1850
    .line 1851
    return-object v3

    .line 1852
    :pswitch_17
    new-instance v1, La/a6i;

    .line 1853
    .line 1854
    invoke-direct {v1, v0}, La/a6i;-><init>(La/t5i;)V

    .line 1855
    .line 1856
    .line 1857
    return-object v1

    .line 1858
    :pswitch_18
    new-instance v1, La/y5i;

    .line 1859
    .line 1860
    invoke-direct {v1, v0}, La/y5i;-><init>(La/t5i;)V

    .line 1861
    .line 1862
    .line 1863
    return-object v1

    .line 1864
    :pswitch_19
    move-object v1, v10

    .line 1865
    new-instance v0, La/qn;

    .line 1866
    .line 1867
    move-object v10, v1

    .line 1868
    check-cast v10, La/w5i;

    .line 1869
    .line 1870
    iget-object v3, v10, La/w5i;->a:Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 1871
    .line 1872
    iget-object v1, v10, La/w5i;->b:La/pyg;

    .line 1873
    .line 1874
    invoke-interface {v1}, La/pyg;->a()La/hzg;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v4

    .line 1878
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1879
    .line 1880
    .line 1881
    new-instance v1, La/cad;

    .line 1882
    .line 1883
    new-instance v6, La/c5k;

    .line 1884
    .line 1885
    new-instance v7, La/wsf0;

    .line 1886
    .line 1887
    iget-object v8, v10, La/w5i;->c:La/gii0;

    .line 1888
    .line 1889
    invoke-direct {v7, v8, v9}, La/wsf0;-><init>(La/gii0;B)V

    .line 1890
    .line 1891
    .line 1892
    new-instance v8, La/h03;

    .line 1893
    .line 1894
    const/4 v11, 0x3

    .line 1895
    invoke-direct {v8, v11, v2}, La/h03;-><init>(BZ)V

    .line 1896
    .line 1897
    .line 1898
    invoke-direct {v6, v7, v8}, La/c5k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1899
    .line 1900
    .line 1901
    invoke-direct {v1, v6, v5}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 1902
    .line 1903
    .line 1904
    iget-object v6, v10, La/w5i;->d:La/ctf0;

    .line 1905
    .line 1906
    iget-object v2, v10, La/w5i;->e:La/cad;

    .line 1907
    .line 1908
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 1909
    .line 1910
    check-cast v2, La/psc;

    .line 1911
    .line 1912
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v7

    .line 1916
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1917
    .line 1918
    .line 1919
    iget-object v8, v10, La/w5i;->f:La/m1e;

    .line 1920
    .line 1921
    iget-object v2, v10, La/w5i;->g:La/g2v;

    .line 1922
    .line 1923
    new-instance v5, La/ih5;

    .line 1924
    .line 1925
    iget-object v11, v10, La/w5i;->h:La/kt2;

    .line 1926
    .line 1927
    invoke-direct {v5, v11, v9}, La/ih5;-><init>(La/kt2;B)V

    .line 1928
    .line 1929
    .line 1930
    iget-object v11, v10, La/w5i;->i:La/zr1;

    .line 1931
    .line 1932
    move-object v9, v2

    .line 1933
    move-object v10, v5

    .line 1934
    move-object v2, v0

    .line 1935
    move-object v5, v1

    .line 1936
    invoke-direct/range {v2 .. v11}, La/qn;-><init>(Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;La/hzg;La/cad;La/ctf0;La/mne;La/m1e;La/g2v;La/ih5;La/zr1;)V

    .line 1937
    .line 1938
    .line 1939
    return-object v2

    .line 1940
    :pswitch_1a
    move-object v1, v10

    .line 1941
    new-instance v3, La/wj;

    .line 1942
    .line 1943
    move-object v10, v1

    .line 1944
    check-cast v10, La/v5i;

    .line 1945
    .line 1946
    iget-object v0, v10, La/v5i;->e:Ljava/lang/Object;

    .line 1947
    .line 1948
    move-object v4, v0

    .line 1949
    check-cast v4, Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 1950
    .line 1951
    iget-object v0, v10, La/v5i;->f:Ljava/lang/Object;

    .line 1952
    .line 1953
    move-object v5, v0

    .line 1954
    check-cast v5, La/i1w0;

    .line 1955
    .line 1956
    iget-object v0, v10, La/v5i;->g:Ljava/lang/Object;

    .line 1957
    .line 1958
    check-cast v0, La/roi0;

    .line 1959
    .line 1960
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 1961
    .line 1962
    check-cast v0, La/daf;

    .line 1963
    .line 1964
    invoke-virtual {v0}, La/daf;->Z()La/zfm0;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v6

    .line 1968
    iget-object v0, v10, La/v5i;->c:Ljava/lang/Object;

    .line 1969
    .line 1970
    move-object v7, v0

    .line 1971
    check-cast v7, La/duj;

    .line 1972
    .line 1973
    iget-object v0, v10, La/v5i;->h:Ljava/lang/Object;

    .line 1974
    .line 1975
    check-cast v0, La/iip;

    .line 1976
    .line 1977
    invoke-interface {v0}, La/iip;->O()La/atz;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v8

    .line 1981
    iget-object v1, v10, La/v5i;->i:Ljava/lang/Object;

    .line 1982
    .line 1983
    check-cast v1, La/pcl0;

    .line 1984
    .line 1985
    invoke-interface {v1}, La/pcl0;->g()La/oif0;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v9

    .line 1989
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1990
    .line 1991
    .line 1992
    iget-object v2, v10, La/v5i;->j:Ljava/lang/Object;

    .line 1993
    .line 1994
    check-cast v2, La/jw20;

    .line 1995
    .line 1996
    iget-object v2, v2, La/jw20;->b:Ljava/lang/Object;

    .line 1997
    .line 1998
    check-cast v2, La/kki;

    .line 1999
    .line 2000
    invoke-virtual {v2}, La/kki;->i()La/nku;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v2

    .line 2004
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2005
    .line 2006
    .line 2007
    invoke-interface {v1}, La/pcl0;->O()La/es;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v11

    .line 2011
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2012
    .line 2013
    .line 2014
    iget-object v12, v10, La/v5i;->k:Ljava/lang/Object;

    .line 2015
    .line 2016
    check-cast v12, La/atz;

    .line 2017
    .line 2018
    iget-object v13, v10, La/v5i;->l:Ljava/lang/Object;

    .line 2019
    .line 2020
    check-cast v13, La/gl5;

    .line 2021
    .line 2022
    iget-object v14, v10, La/v5i;->m:Ljava/lang/Object;

    .line 2023
    .line 2024
    check-cast v14, La/a1d;

    .line 2025
    .line 2026
    iget-object v15, v14, La/a1d;->b:Ljava/lang/Object;

    .line 2027
    .line 2028
    check-cast v15, La/qv2;

    .line 2029
    .line 2030
    invoke-virtual {v15}, La/qv2;->A()La/njt0;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v15

    .line 2034
    move-object/from16 v16, v15

    .line 2035
    .line 2036
    invoke-virtual {v14}, La/a1d;->e()La/z8u;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v15

    .line 2040
    move-object/from16 p0, v0

    .line 2041
    .line 2042
    iget-object v0, v10, La/v5i;->n:Ljava/lang/Object;

    .line 2043
    .line 2044
    check-cast v0, La/lbu;

    .line 2045
    .line 2046
    iget-object v14, v14, La/a1d;->b:Ljava/lang/Object;

    .line 2047
    .line 2048
    check-cast v14, La/qv2;

    .line 2049
    .line 2050
    invoke-virtual {v14}, La/qv2;->g()La/ivn;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v17

    .line 2054
    invoke-interface/range {p0 .. p0}, La/iip;->s()La/b3c;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v18

    .line 2058
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2059
    .line 2060
    .line 2061
    iget-object v14, v10, La/v5i;->b:Ljava/lang/Object;

    .line 2062
    .line 2063
    move-object/from16 v19, v14

    .line 2064
    .line 2065
    check-cast v19, La/ctf0;

    .line 2066
    .line 2067
    iget-object v14, v10, La/v5i;->o:Ljava/lang/Object;

    .line 2068
    .line 2069
    check-cast v14, La/cad;

    .line 2070
    .line 2071
    iget-object v14, v14, La/cad;->b:Ljava/lang/Object;

    .line 2072
    .line 2073
    check-cast v14, La/psc;

    .line 2074
    .line 2075
    invoke-virtual {v14}, La/psc;->h()La/mne;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v20

    .line 2079
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2080
    .line 2081
    .line 2082
    new-instance v14, La/xr;

    .line 2083
    .line 2084
    move-object/from16 p0, v0

    .line 2085
    .line 2086
    iget-object v0, v10, La/v5i;->p:Ljava/lang/Object;

    .line 2087
    .line 2088
    check-cast v0, La/bn6;

    .line 2089
    .line 2090
    move-object/from16 v21, v1

    .line 2091
    .line 2092
    iget-object v1, v10, La/v5i;->q:Ljava/lang/Object;

    .line 2093
    .line 2094
    check-cast v1, La/je;

    .line 2095
    .line 2096
    invoke-direct {v14, v0, v1}, La/xr;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2097
    .line 2098
    .line 2099
    invoke-interface/range {v21 .. v21}, La/pcl0;->c()La/reu;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v22

    .line 2103
    invoke-static/range {v22 .. v22}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2104
    .line 2105
    .line 2106
    invoke-interface/range {v21 .. v21}, La/pcl0;->T()La/n1d;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v23

    .line 2110
    invoke-static/range {v23 .. v23}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2111
    .line 2112
    .line 2113
    invoke-interface/range {v21 .. v21}, La/pcl0;->Y()La/cad;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v24

    .line 2117
    invoke-static/range {v24 .. v24}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2118
    .line 2119
    .line 2120
    iget-object v0, v10, La/v5i;->r:Ljava/lang/Object;

    .line 2121
    .line 2122
    move-object/from16 v25, v0

    .line 2123
    .line 2124
    check-cast v25, La/cl5;

    .line 2125
    .line 2126
    iget-object v0, v10, La/v5i;->s:Ljava/lang/Object;

    .line 2127
    .line 2128
    move-object/from16 v26, v0

    .line 2129
    .line 2130
    check-cast v26, La/evz;

    .line 2131
    .line 2132
    iget-object v0, v10, La/v5i;->t:Ljava/lang/Object;

    .line 2133
    .line 2134
    move-object/from16 v27, v0

    .line 2135
    .line 2136
    check-cast v27, La/gua;

    .line 2137
    .line 2138
    iget-object v0, v10, La/v5i;->u:Ljava/lang/Object;

    .line 2139
    .line 2140
    check-cast v0, La/wsf0;

    .line 2141
    .line 2142
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 2143
    .line 2144
    check-cast v0, La/gr00;

    .line 2145
    .line 2146
    new-instance v1, La/hwt;

    .line 2147
    .line 2148
    invoke-virtual {v0}, La/gr00;->h()La/fua;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v0

    .line 2152
    invoke-direct {v1, v0}, La/hwt;-><init>(La/fua;)V

    .line 2153
    .line 2154
    .line 2155
    iget-object v0, v10, La/v5i;->d:Ljava/lang/Object;

    .line 2156
    .line 2157
    move-object/from16 v29, v0

    .line 2158
    .line 2159
    check-cast v29, La/pru;

    .line 2160
    .line 2161
    move-object/from16 v28, v1

    .line 2162
    .line 2163
    move-object v10, v2

    .line 2164
    move-object/from16 v21, v14

    .line 2165
    .line 2166
    move-object/from16 v14, v16

    .line 2167
    .line 2168
    move-object/from16 v16, p0

    .line 2169
    .line 2170
    invoke-direct/range {v3 .. v29}, La/wj;-><init>(Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;La/i1w0;La/yfm0;La/duj;La/atz;La/oif0;La/nku;La/es;La/atz;La/gl5;La/njt0;La/z8u;La/lbu;La/ivn;La/b3c;La/ctf0;La/mne;La/xr;La/reu;La/n1d;La/cad;La/cl5;La/evz;La/gua;La/hwt;La/pru;)V

    .line 2171
    .line 2172
    .line 2173
    return-object v3

    .line 2174
    :pswitch_1b
    new-instance v1, La/u5i;

    .line 2175
    .line 2176
    invoke-direct {v1, v0}, La/u5i;-><init>(La/t5i;)V

    .line 2177
    .line 2178
    .line 2179
    return-object v1

    .line 2180
    :pswitch_1c
    move-object v1, v10

    .line 2181
    new-instance v0, La/vc;

    .line 2182
    .line 2183
    move-object v10, v1

    .line 2184
    check-cast v10, La/nhf0;

    .line 2185
    .line 2186
    iget-object v1, v10, La/nhf0;->a:Ljava/lang/Object;

    .line 2187
    .line 2188
    check-cast v1, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;

    .line 2189
    .line 2190
    iget-object v3, v10, La/nhf0;->b:Ljava/lang/Object;

    .line 2191
    .line 2192
    check-cast v3, La/ctf0;

    .line 2193
    .line 2194
    iget-object v4, v10, La/nhf0;->c:Ljava/lang/Object;

    .line 2195
    .line 2196
    check-cast v4, La/cad;

    .line 2197
    .line 2198
    iget-object v4, v4, La/cad;->b:Ljava/lang/Object;

    .line 2199
    .line 2200
    check-cast v4, La/psc;

    .line 2201
    .line 2202
    invoke-virtual {v4}, La/psc;->h()La/mne;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v4

    .line 2206
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2210
    .line 2211
    .line 2212
    new-instance v5, La/nc;

    .line 2213
    .line 2214
    invoke-direct {v5, v1, v9}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 2215
    .line 2216
    .line 2217
    move-object v1, v5

    .line 2218
    new-instance v5, La/uc;

    .line 2219
    .line 2220
    invoke-direct {v5, v3, v2}, La/uc;-><init>(La/ctf0;B)V

    .line 2221
    .line 2222
    .line 2223
    iget-object v2, v4, La/mne;->a:La/rwj;

    .line 2224
    .line 2225
    invoke-static {v2, v2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v6

    .line 2229
    const/4 v7, 0x0

    .line 2230
    const/4 v3, 0x0

    .line 2231
    move-object v2, v0

    .line 2232
    move-object v4, v1

    .line 2233
    invoke-direct/range {v2 .. v7}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 2234
    .line 2235
    .line 2236
    return-object v2

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
