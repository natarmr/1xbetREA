.class public final La/ugi;
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
    iput-byte p2, p0, La/ugi;->a:B

    iput-object p1, p0, La/ugi;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ugi;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/ugi;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v5, La/l0w;

    .line 13
    .line 14
    check-cast v4, La/ywq0;

    .line 15
    .line 16
    iget-object v0, v4, La/ywq0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 20
    .line 21
    iget-object v0, v4, La/ywq0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v7, v0

    .line 24
    check-cast v7, La/f8w;

    .line 25
    .line 26
    iget-object v0, v4, La/ywq0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/cad;

    .line 29
    .line 30
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/psc;

    .line 33
    .line 34
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v4, La/ywq0;->d:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v9, v0

    .line 44
    check-cast v9, La/pru;

    .line 45
    .line 46
    iget-object v0, v4, La/ywq0;->e:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v10, v0

    .line 49
    check-cast v10, La/ctf0;

    .line 50
    .line 51
    new-instance v11, La/hnu;

    .line 52
    .line 53
    new-instance v0, La/dpi0;

    .line 54
    .line 55
    iget-object v1, v4, La/ywq0;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, La/j77;

    .line 58
    .line 59
    invoke-direct {v0, v1}, La/dpi0;-><init>(La/j77;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v11, v0}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v12, La/ugf0;

    .line 66
    .line 67
    new-instance v0, La/dpi0;

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/dpi0;-><init>(La/j77;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {v12, v0}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-direct/range {v5 .. v12}, La/l0w;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;La/mne;La/pru;La/ctf0;La/hnu;La/ugf0;)V

    .line 76
    .line 77
    .line 78
    return-object v5

    .line 79
    :pswitch_0
    new-instance v1, La/nii;

    .line 80
    .line 81
    invoke-direct {v1, v0}, La/nii;-><init>(La/ugi;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :pswitch_1
    new-instance v0, La/uwv;

    .line 86
    .line 87
    check-cast v4, La/gr00;

    .line 88
    .line 89
    new-instance v1, La/svu;

    .line 90
    .line 91
    new-instance v2, La/y3v;

    .line 92
    .line 93
    iget-object v3, v4, La/gr00;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, La/knf0;

    .line 96
    .line 97
    new-instance v5, La/xsu;

    .line 98
    .line 99
    iget-object v6, v4, La/gr00;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v6, La/gii0;

    .line 102
    .line 103
    invoke-direct {v5, v6}, La/xsu;-><init>(La/gii0;)V

    .line 104
    .line 105
    .line 106
    iget-object v7, v4, La/gr00;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v7, La/q7d0;

    .line 109
    .line 110
    invoke-direct {v2, v3, v5, v7}, La/y3v;-><init>(La/knf0;La/xsu;La/q7d0;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v1, v2}, La/svu;-><init>(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, La/hnu;

    .line 117
    .line 118
    new-instance v5, La/y3v;

    .line 119
    .line 120
    new-instance v8, La/xsu;

    .line 121
    .line 122
    invoke-direct {v8, v6}, La/xsu;-><init>(La/gii0;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v5, v3, v8, v7}, La/y3v;-><init>(La/knf0;La/xsu;La/q7d0;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {v2, v5}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, v4, La/gr00;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, La/i1w0;

    .line 134
    .line 135
    invoke-direct {v0, v1, v2, v3}, La/uwv;-><init>(La/svu;La/hnu;La/i1w0;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_2
    new-instance v1, La/mii;

    .line 140
    .line 141
    invoke-direct {v1, v0}, La/mii;-><init>(La/ugi;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :pswitch_3
    new-instance v1, La/kii;

    .line 146
    .line 147
    invoke-direct {v1, v0}, La/kii;-><init>(La/ugi;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_4
    new-instance v0, La/mgv;

    .line 152
    .line 153
    check-cast v4, La/yzn0;

    .line 154
    .line 155
    iget-object v1, v4, La/yzn0;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, La/wyu;

    .line 158
    .line 159
    invoke-direct {v0, v1}, La/mgv;-><init>(La/wyu;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_5
    new-instance v0, La/lgv;

    .line 164
    .line 165
    check-cast v4, La/ehf0;

    .line 166
    .line 167
    iget-object v1, v4, La/ehf0;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, La/wyu;

    .line 170
    .line 171
    invoke-direct {v0, v1}, La/lgv;-><init>(La/wyu;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_6
    new-instance v2, La/ndv;

    .line 176
    .line 177
    check-cast v4, La/o3c;

    .line 178
    .line 179
    iget-object v0, v4, La/o3c;->a:Ljava/lang/Object;

    .line 180
    .line 181
    move-object v3, v0

    .line 182
    check-cast v3, La/ctf0;

    .line 183
    .line 184
    iget-object v0, v4, La/o3c;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Ljava/lang/String;

    .line 187
    .line 188
    iget-object v1, v4, La/o3c;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, La/cad;

    .line 191
    .line 192
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, La/psc;

    .line 195
    .line 196
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v1, v4, La/o3c;->d:Ljava/lang/Object;

    .line 204
    .line 205
    move-object v6, v1

    .line 206
    check-cast v6, La/i1w0;

    .line 207
    .line 208
    new-instance v7, La/pyu;

    .line 209
    .line 210
    invoke-virtual {v4}, La/o3c;->l()La/dgu;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-direct {v7, v1}, La/pyu;-><init>(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    new-instance v8, La/n1u;

    .line 218
    .line 219
    invoke-virtual {v4}, La/o3c;->l()La/dgu;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-direct {v8, v1}, La/n1u;-><init>(La/dgu;)V

    .line 224
    .line 225
    .line 226
    new-instance v9, La/n1u;

    .line 227
    .line 228
    invoke-virtual {v4}, La/o3c;->l()La/dgu;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-direct {v9, v1}, La/n1u;-><init>(La/dgu;)V

    .line 233
    .line 234
    .line 235
    new-instance v10, La/fvt0;

    .line 236
    .line 237
    invoke-virtual {v4}, La/o3c;->l()La/dgu;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-direct {v10, v1}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    new-instance v11, La/n1u;

    .line 245
    .line 246
    invoke-virtual {v4}, La/o3c;->l()La/dgu;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-direct {v11, v1}, La/n1u;-><init>(La/dgu;)V

    .line 251
    .line 252
    .line 253
    new-instance v12, La/yfu;

    .line 254
    .line 255
    invoke-virtual {v4}, La/o3c;->l()La/dgu;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v12, v1}, La/yfu;-><init>(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget-object v1, v4, La/o3c;->h:Ljava/lang/Object;

    .line 263
    .line 264
    move-object v13, v1

    .line 265
    check-cast v13, La/ocl;

    .line 266
    .line 267
    iget-object v1, v4, La/o3c;->i:Ljava/lang/Object;

    .line 268
    .line 269
    move-object v14, v1

    .line 270
    check-cast v14, La/m1e;

    .line 271
    .line 272
    iget-object v1, v4, La/o3c;->j:Ljava/lang/Object;

    .line 273
    .line 274
    move-object v15, v1

    .line 275
    check-cast v15, La/duj;

    .line 276
    .line 277
    move-object v4, v0

    .line 278
    invoke-direct/range {v2 .. v15}, La/ndv;-><init>(La/ctf0;Ljava/lang/String;La/mne;La/i1w0;La/pyu;La/n1u;La/n1u;La/fvt0;La/n1u;La/yfu;La/ocl;La/m1e;La/duj;)V

    .line 279
    .line 280
    .line 281
    return-object v2

    .line 282
    :pswitch_7
    new-instance v1, La/hii;

    .line 283
    .line 284
    invoke-direct {v1, v0}, La/hii;-><init>(La/ugi;)V

    .line 285
    .line 286
    .line 287
    return-object v1

    .line 288
    :pswitch_8
    new-instance v2, La/mkt;

    .line 289
    .line 290
    check-cast v4, La/qv2;

    .line 291
    .line 292
    iget-object v0, v4, La/qv2;->b:Ljava/lang/Object;

    .line 293
    .line 294
    move-object v3, v0

    .line 295
    check-cast v3, La/wyu;

    .line 296
    .line 297
    iget-object v0, v4, La/qv2;->c:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, La/xak;

    .line 300
    .line 301
    iget-object v1, v4, La/qv2;->d:Ljava/lang/Object;

    .line 302
    .line 303
    move-object v5, v1

    .line 304
    check-cast v5, La/a6u;

    .line 305
    .line 306
    iget-object v1, v4, La/qv2;->e:Ljava/lang/Object;

    .line 307
    .line 308
    move-object v6, v1

    .line 309
    check-cast v6, La/y3v;

    .line 310
    .line 311
    iget-object v1, v4, La/qv2;->f:Ljava/lang/Object;

    .line 312
    .line 313
    move-object v7, v1

    .line 314
    check-cast v7, La/evz;

    .line 315
    .line 316
    iget-object v1, v4, La/qv2;->g:Ljava/lang/Object;

    .line 317
    .line 318
    move-object v8, v1

    .line 319
    check-cast v8, La/i1w0;

    .line 320
    .line 321
    iget-object v1, v4, La/qv2;->h:Ljava/lang/Object;

    .line 322
    .line 323
    move-object v9, v1

    .line 324
    check-cast v9, La/mne;

    .line 325
    .line 326
    iget-object v1, v4, La/qv2;->i:Ljava/lang/Object;

    .line 327
    .line 328
    move-object v10, v1

    .line 329
    check-cast v10, La/s64;

    .line 330
    .line 331
    iget-object v1, v4, La/qv2;->j:Ljava/lang/Object;

    .line 332
    .line 333
    move-object v11, v1

    .line 334
    check-cast v11, La/wgu;

    .line 335
    .line 336
    iget-object v1, v4, La/qv2;->k:Ljava/lang/Object;

    .line 337
    .line 338
    move-object v12, v1

    .line 339
    check-cast v12, La/dpc;

    .line 340
    .line 341
    iget-object v1, v4, La/qv2;->l:Ljava/lang/Object;

    .line 342
    .line 343
    move-object v13, v1

    .line 344
    check-cast v13, La/ani0;

    .line 345
    .line 346
    iget-object v1, v4, La/qv2;->m:Ljava/lang/Object;

    .line 347
    .line 348
    move-object v14, v1

    .line 349
    check-cast v14, La/duj;

    .line 350
    .line 351
    move-object v4, v0

    .line 352
    invoke-direct/range {v2 .. v14}, La/mkt;-><init>(La/wyu;La/xak;La/a6u;La/y3v;La/evz;La/i1w0;La/mne;La/s64;La/wgu;La/dpc;La/ani0;La/duj;)V

    .line 353
    .line 354
    .line 355
    return-object v2

    .line 356
    :pswitch_9
    new-instance v1, La/gii;

    .line 357
    .line 358
    invoke-direct {v1, v0}, La/gii;-><init>(La/ugi;)V

    .line 359
    .line 360
    .line 361
    return-object v1

    .line 362
    :pswitch_a
    new-instance v1, La/eii;

    .line 363
    .line 364
    invoke-direct {v1, v0}, La/eii;-><init>(La/ugi;)V

    .line 365
    .line 366
    .line 367
    return-object v1

    .line 368
    :pswitch_b
    new-instance v2, La/dy60;

    .line 369
    .line 370
    check-cast v4, La/bii;

    .line 371
    .line 372
    iget-object v3, v4, La/bii;->a:La/i1w0;

    .line 373
    .line 374
    iget-object v0, v4, La/bii;->b:La/ouu;

    .line 375
    .line 376
    iget-object v5, v4, La/bii;->c:La/wsf0;

    .line 377
    .line 378
    iget-object v6, v4, La/bii;->d:La/ali;

    .line 379
    .line 380
    iget-object v7, v4, La/bii;->e:La/yoc;

    .line 381
    .line 382
    iget-object v8, v4, La/bii;->f:La/yoc;

    .line 383
    .line 384
    iget-object v9, v4, La/bii;->g:La/m1e;

    .line 385
    .line 386
    iget-object v10, v4, La/bii;->h:La/ih5;

    .line 387
    .line 388
    iget-object v11, v4, La/bii;->i:La/l7k;

    .line 389
    .line 390
    iget-object v12, v4, La/bii;->j:La/v88;

    .line 391
    .line 392
    iget-object v1, v4, La/bii;->k:La/iw20;

    .line 393
    .line 394
    iget-object v13, v1, La/iw20;->a:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v13, La/uii;

    .line 397
    .line 398
    invoke-virtual {v13}, La/uii;->r()La/pru;

    .line 399
    .line 400
    .line 401
    move-result-object v13

    .line 402
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v1, La/uii;

    .line 405
    .line 406
    invoke-virtual {v1}, La/uii;->i()La/dmt;

    .line 407
    .line 408
    .line 409
    move-result-object v14

    .line 410
    iget-object v15, v4, La/bii;->l:La/duj;

    .line 411
    .line 412
    iget-object v1, v4, La/bii;->m:La/g2v;

    .line 413
    .line 414
    move-object/from16 v16, v0

    .line 415
    .line 416
    iget-object v0, v4, La/bii;->n:La/ctf0;

    .line 417
    .line 418
    move-object/from16 v17, v0

    .line 419
    .line 420
    iget-object v0, v4, La/bii;->o:La/foi0;

    .line 421
    .line 422
    move-object/from16 v18, v0

    .line 423
    .line 424
    iget-object v0, v4, La/bii;->p:La/cad;

    .line 425
    .line 426
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v0, La/psc;

    .line 429
    .line 430
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 431
    .line 432
    .line 433
    move-result-object v19

    .line 434
    invoke-static/range {v19 .. v19}, La/x1x;->x(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget-object v0, v4, La/bii;->q:La/bw60;

    .line 438
    .line 439
    invoke-interface {v0}, La/bw60;->a()La/nn60;

    .line 440
    .line 441
    .line 442
    move-result-object v20

    .line 443
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object v0, v4, La/bii;->r:La/jqt;

    .line 447
    .line 448
    move-object/from16 v21, v0

    .line 449
    .line 450
    iget-object v0, v4, La/bii;->s:La/oeg0;

    .line 451
    .line 452
    move-object/from16 v22, v0

    .line 453
    .line 454
    iget-object v0, v4, La/bii;->t:La/ih5;

    .line 455
    .line 456
    move-object/from16 v23, v0

    .line 457
    .line 458
    iget-object v0, v4, La/bii;->u:La/bn6;

    .line 459
    .line 460
    move-object/from16 v24, v0

    .line 461
    .line 462
    iget-object v0, v4, La/bii;->v:La/gg5;

    .line 463
    .line 464
    move-object/from16 v25, v0

    .line 465
    .line 466
    iget-object v0, v4, La/bii;->w:La/s64;

    .line 467
    .line 468
    move-object/from16 v26, v0

    .line 469
    .line 470
    iget-object v0, v4, La/bii;->x:La/cmt;

    .line 471
    .line 472
    iget-object v4, v4, La/bii;->y:La/bzt;

    .line 473
    .line 474
    move-object/from16 v27, v0

    .line 475
    .line 476
    move-object/from16 v28, v4

    .line 477
    .line 478
    move-object/from16 v4, v16

    .line 479
    .line 480
    move-object/from16 v16, v1

    .line 481
    .line 482
    invoke-direct/range {v2 .. v28}, La/dy60;-><init>(La/i1w0;La/ouu;La/wsf0;La/ali;La/yoc;La/yoc;La/m1e;La/ih5;La/l7k;La/v88;La/pru;La/dmt;La/duj;La/g2v;La/ctf0;La/foi0;La/mne;La/nn60;La/jqt;La/oeg0;La/ih5;La/bn6;La/gg5;La/s64;La/cmt;La/bzt;)V

    .line 483
    .line 484
    .line 485
    return-object v2

    .line 486
    :pswitch_c
    new-instance v1, La/zhi;

    .line 487
    .line 488
    invoke-direct {v1, v0}, La/zhi;-><init>(La/ugi;)V

    .line 489
    .line 490
    .line 491
    return-object v1

    .line 492
    :pswitch_d
    new-instance v1, La/vhi;

    .line 493
    .line 494
    invoke-direct {v1, v0}, La/vhi;-><init>(La/ugi;)V

    .line 495
    .line 496
    .line 497
    return-object v1

    .line 498
    :pswitch_e
    new-instance v1, La/thi;

    .line 499
    .line 500
    invoke-direct {v1, v0}, La/thi;-><init>(La/ugi;)V

    .line 501
    .line 502
    .line 503
    return-object v1

    .line 504
    :pswitch_f
    new-instance v1, La/phi;

    .line 505
    .line 506
    invoke-direct {v1, v0}, La/phi;-><init>(La/ugi;)V

    .line 507
    .line 508
    .line 509
    return-object v1

    .line 510
    :pswitch_10
    new-instance v1, La/mhi;

    .line 511
    .line 512
    invoke-direct {v1, v0}, La/mhi;-><init>(La/ugi;)V

    .line 513
    .line 514
    .line 515
    return-object v1

    .line 516
    :pswitch_11
    new-instance v1, La/khi;

    .line 517
    .line 518
    invoke-direct {v1, v0}, La/khi;-><init>(La/ugi;)V

    .line 519
    .line 520
    .line 521
    return-object v1

    .line 522
    :pswitch_12
    new-instance v2, La/wcr;

    .line 523
    .line 524
    check-cast v4, La/ru;

    .line 525
    .line 526
    iget-object v0, v4, La/ru;->a:Ljava/lang/Object;

    .line 527
    .line 528
    move-object v3, v0

    .line 529
    check-cast v3, Ljava/lang/String;

    .line 530
    .line 531
    iget-object v0, v4, La/ru;->b:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Ljava/lang/Integer;

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    iget-object v1, v4, La/ru;->c:Ljava/lang/Object;

    .line 540
    .line 541
    move-object v5, v1

    .line 542
    check-cast v5, La/i1w0;

    .line 543
    .line 544
    new-instance v6, La/yiu;

    .line 545
    .line 546
    iget-object v1, v4, La/ru;->d:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v1, La/j1q0;

    .line 549
    .line 550
    const/4 v7, 0x1

    .line 551
    invoke-direct {v6, v1, v7}, La/yiu;-><init>(La/j1q0;B)V

    .line 552
    .line 553
    .line 554
    iget-object v1, v4, La/ru;->f:Ljava/lang/Object;

    .line 555
    .line 556
    move-object v7, v1

    .line 557
    check-cast v7, La/ocl;

    .line 558
    .line 559
    iget-object v1, v4, La/ru;->h:Ljava/lang/Object;

    .line 560
    .line 561
    move-object v8, v1

    .line 562
    check-cast v8, La/m1e;

    .line 563
    .line 564
    iget-object v1, v4, La/ru;->g:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v1, La/cad;

    .line 567
    .line 568
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v1, La/psc;

    .line 571
    .line 572
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    iget-object v1, v4, La/ru;->i:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v1, La/roi0;

    .line 582
    .line 583
    iget-object v1, v1, La/roi0;->a:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v1, La/daf;

    .line 586
    .line 587
    invoke-virtual {v1}, La/daf;->B()La/nvu;

    .line 588
    .line 589
    .line 590
    move-result-object v10

    .line 591
    iget-object v1, v4, La/ru;->e:Ljava/lang/Object;

    .line 592
    .line 593
    move-object v11, v1

    .line 594
    check-cast v11, La/ctf0;

    .line 595
    .line 596
    move v4, v0

    .line 597
    invoke-direct/range {v2 .. v11}, La/wcr;-><init>(Ljava/lang/String;ILa/i1w0;La/yiu;La/ocl;La/m1e;La/mne;La/nvu;La/ctf0;)V

    .line 598
    .line 599
    .line 600
    return-object v2

    .line 601
    :pswitch_13
    new-instance v3, La/abr;

    .line 602
    .line 603
    check-cast v4, La/g45;

    .line 604
    .line 605
    iget-object v0, v4, La/g45;->g:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, Ljava/lang/String;

    .line 608
    .line 609
    new-instance v5, La/rpt;

    .line 610
    .line 611
    new-instance v1, La/khf0;

    .line 612
    .line 613
    iget-object v2, v4, La/g45;->a:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v2, La/cad;

    .line 616
    .line 617
    iget-object v6, v2, La/cad;->b:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v6, La/psc;

    .line 620
    .line 621
    invoke-virtual {v6}, La/psc;->h()La/mne;

    .line 622
    .line 623
    .line 624
    move-result-object v6

    .line 625
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    new-instance v7, La/nmo;

    .line 629
    .line 630
    iget-object v8, v4, La/g45;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v8, La/gii0;

    .line 633
    .line 634
    const/4 v9, 0x5

    .line 635
    invoke-direct {v7, v8, v9}, La/nmo;-><init>(La/gii0;B)V

    .line 636
    .line 637
    .line 638
    iget-object v8, v4, La/g45;->c:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v8, La/knf0;

    .line 641
    .line 642
    invoke-direct {v1, v6, v7, v8}, La/khf0;-><init>(La/mne;La/nmo;La/knf0;)V

    .line 643
    .line 644
    .line 645
    invoke-direct {v5, v1}, La/rpt;-><init>(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    iget-object v1, v4, La/g45;->d:Ljava/lang/Object;

    .line 649
    .line 650
    move-object v6, v1

    .line 651
    check-cast v6, La/duj;

    .line 652
    .line 653
    iget-object v1, v4, La/g45;->e:Ljava/lang/Object;

    .line 654
    .line 655
    move-object v7, v1

    .line 656
    check-cast v7, La/ocl;

    .line 657
    .line 658
    iget-object v1, v4, La/g45;->f:Ljava/lang/Object;

    .line 659
    .line 660
    move-object v8, v1

    .line 661
    check-cast v8, La/m1e;

    .line 662
    .line 663
    iget-object v1, v2, La/cad;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v1, La/psc;

    .line 666
    .line 667
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    iget-object v1, v4, La/g45;->h:Ljava/lang/Object;

    .line 675
    .line 676
    move-object v10, v1

    .line 677
    check-cast v10, La/i1w0;

    .line 678
    .line 679
    move-object v4, v0

    .line 680
    invoke-direct/range {v3 .. v10}, La/abr;-><init>(Ljava/lang/String;La/rpt;La/duj;La/ocl;La/m1e;La/mne;La/i1w0;)V

    .line 681
    .line 682
    .line 683
    return-object v3

    .line 684
    :pswitch_14
    move-object v0, v4

    .line 685
    new-instance v4, La/ivq;

    .line 686
    .line 687
    check-cast v0, La/v7i;

    .line 688
    .line 689
    iget-object v1, v0, La/v7i;->i:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v1, La/nmo;

    .line 692
    .line 693
    iget-object v1, v1, La/nmo;->a:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v1, La/chf0;

    .line 696
    .line 697
    invoke-virtual {v1}, La/chf0;->G()La/x4u;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    iget-object v1, v0, La/v7i;->e:Ljava/lang/Object;

    .line 702
    .line 703
    move-object v6, v1

    .line 704
    check-cast v6, Ljava/lang/String;

    .line 705
    .line 706
    iget-object v1, v0, La/v7i;->f:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v1, Ljava/lang/Long;

    .line 709
    .line 710
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 711
    .line 712
    .line 713
    move-result-wide v7

    .line 714
    iget-object v1, v0, La/v7i;->g:Ljava/lang/Object;

    .line 715
    .line 716
    move-object v9, v1

    .line 717
    check-cast v9, La/duj;

    .line 718
    .line 719
    iget-object v1, v0, La/v7i;->k:Ljava/lang/Object;

    .line 720
    .line 721
    move-object v10, v1

    .line 722
    check-cast v10, La/ocl;

    .line 723
    .line 724
    iget-object v1, v0, La/v7i;->h:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v1, La/cad;

    .line 727
    .line 728
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v1, La/psc;

    .line 731
    .line 732
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 733
    .line 734
    .line 735
    move-result-object v11

    .line 736
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    new-instance v12, La/weu;

    .line 740
    .line 741
    iget-object v1, v0, La/v7i;->a:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v1, La/pmi0;

    .line 744
    .line 745
    iget-object v13, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v13, La/daf;

    .line 748
    .line 749
    invoke-virtual {v13}, La/daf;->A()La/nfm0;

    .line 750
    .line 751
    .line 752
    move-result-object v13

    .line 753
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    invoke-direct {v12, v13, v3}, La/weu;-><init>(La/nfm0;B)V

    .line 757
    .line 758
    .line 759
    iget-object v13, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v13, La/daf;

    .line 762
    .line 763
    invoke-virtual {v13}, La/daf;->r()La/fhj;

    .line 764
    .line 765
    .line 766
    move-result-object v13

    .line 767
    new-instance v14, La/qzt;

    .line 768
    .line 769
    iget-object v15, v0, La/v7i;->m:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v15, La/pru;

    .line 772
    .line 773
    invoke-direct {v14, v15, v3}, La/qzt;-><init>(La/pru;B)V

    .line 774
    .line 775
    .line 776
    iget-object v3, v0, La/v7i;->n:Ljava/lang/Object;

    .line 777
    .line 778
    move-object v15, v3

    .line 779
    check-cast v15, La/wyu;

    .line 780
    .line 781
    iget-object v3, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v3, La/daf;

    .line 784
    .line 785
    invoke-virtual {v3}, La/daf;->s()La/f7u;

    .line 786
    .line 787
    .line 788
    move-result-object v16

    .line 789
    new-instance v3, La/jwu;

    .line 790
    .line 791
    iget-object v1, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v1, La/daf;

    .line 794
    .line 795
    invoke-virtual {v1}, La/daf;->A()La/nfm0;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    invoke-direct {v3, v1, v2}, La/jwu;-><init>(La/nfm0;B)V

    .line 803
    .line 804
    .line 805
    iget-object v1, v0, La/v7i;->c:Ljava/lang/Object;

    .line 806
    .line 807
    move-object/from16 v18, v1

    .line 808
    .line 809
    check-cast v18, La/ctf0;

    .line 810
    .line 811
    iget-object v1, v0, La/v7i;->j:Ljava/lang/Object;

    .line 812
    .line 813
    move-object/from16 v19, v1

    .line 814
    .line 815
    check-cast v19, La/uyu;

    .line 816
    .line 817
    iget-object v1, v0, La/v7i;->d:Ljava/lang/Object;

    .line 818
    .line 819
    move-object/from16 v20, v1

    .line 820
    .line 821
    check-cast v20, La/m1e;

    .line 822
    .line 823
    iget-object v1, v0, La/v7i;->b:Ljava/lang/Object;

    .line 824
    .line 825
    move-object/from16 v21, v1

    .line 826
    .line 827
    check-cast v21, La/i1w0;

    .line 828
    .line 829
    iget-object v0, v0, La/v7i;->l:Ljava/lang/Object;

    .line 830
    .line 831
    move-object/from16 v22, v0

    .line 832
    .line 833
    check-cast v22, La/r9u;

    .line 834
    .line 835
    move-object/from16 v17, v3

    .line 836
    .line 837
    invoke-direct/range {v4 .. v22}, La/ivq;-><init>(La/x4u;Ljava/lang/String;JLa/duj;La/ocl;La/mne;La/weu;La/fhj;La/qzt;La/wyu;La/f7u;La/jwu;La/ctf0;La/uyu;La/m1e;La/i1w0;La/r9u;)V

    .line 838
    .line 839
    .line 840
    return-object v4

    .line 841
    :pswitch_15
    move-object v0, v4

    .line 842
    new-instance v5, La/q5q;

    .line 843
    .line 844
    move-object v4, v0

    .line 845
    check-cast v4, La/esg0;

    .line 846
    .line 847
    iget-object v0, v4, La/esg0;->a:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v0, La/cad;

    .line 850
    .line 851
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v0, La/psc;

    .line 854
    .line 855
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 856
    .line 857
    .line 858
    move-result-object v6

    .line 859
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    iget-object v0, v4, La/esg0;->b:Ljava/lang/Object;

    .line 863
    .line 864
    move-object v7, v0

    .line 865
    check-cast v7, La/ctf0;

    .line 866
    .line 867
    iget-object v0, v4, La/esg0;->c:Ljava/lang/Object;

    .line 868
    .line 869
    move-object v8, v0

    .line 870
    check-cast v8, La/nmy;

    .line 871
    .line 872
    iget-object v0, v4, La/esg0;->d:Ljava/lang/Object;

    .line 873
    .line 874
    move-object v9, v0

    .line 875
    check-cast v9, La/cny;

    .line 876
    .line 877
    iget-object v0, v4, La/esg0;->e:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, La/iw20;

    .line 880
    .line 881
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v0, La/uii;

    .line 884
    .line 885
    new-instance v10, La/noc;

    .line 886
    .line 887
    iget-object v0, v0, La/uii;->a:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v0, La/vff0;

    .line 890
    .line 891
    invoke-direct {v10, v0, v2}, La/noc;-><init>(La/vff0;B)V

    .line 892
    .line 893
    .line 894
    invoke-direct/range {v5 .. v10}, La/q5q;-><init>(La/mne;La/ctf0;La/nmy;La/cny;La/noc;)V

    .line 895
    .line 896
    .line 897
    return-object v5

    .line 898
    :pswitch_16
    move-object v0, v4

    .line 899
    new-instance v6, La/vy60;

    .line 900
    .line 901
    move-object v4, v0

    .line 902
    check-cast v4, La/ehi;

    .line 903
    .line 904
    iget-object v7, v4, La/ehi;->a:La/jtj;

    .line 905
    .line 906
    iget-object v8, v4, La/ehi;->b:La/b8u;

    .line 907
    .line 908
    new-instance v9, La/x4u;

    .line 909
    .line 910
    iget-object v0, v4, La/ehi;->c:La/uyn;

    .line 911
    .line 912
    invoke-direct {v9, v0}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    new-instance v10, La/lqc;

    .line 916
    .line 917
    invoke-direct {v10, v0}, La/lqc;-><init>(La/uyn;)V

    .line 918
    .line 919
    .line 920
    new-instance v11, La/qxg0;

    .line 921
    .line 922
    invoke-direct {v11, v0}, La/qxg0;-><init>(La/uyn;)V

    .line 923
    .line 924
    .line 925
    iget-object v12, v4, La/ehi;->d:La/lbu;

    .line 926
    .line 927
    iget-object v13, v4, La/ehi;->e:La/hnu;

    .line 928
    .line 929
    iget-object v0, v4, La/ehi;->f:La/cad;

    .line 930
    .line 931
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v0, La/psc;

    .line 934
    .line 935
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 936
    .line 937
    .line 938
    move-result-object v14

    .line 939
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 940
    .line 941
    .line 942
    iget-object v15, v4, La/ehi;->g:La/duj;

    .line 943
    .line 944
    iget-object v0, v4, La/ehi;->h:La/ctf0;

    .line 945
    .line 946
    iget-object v1, v4, La/ehi;->i:La/gw60;

    .line 947
    .line 948
    iget-object v2, v4, La/ehi;->j:La/hs60;

    .line 949
    .line 950
    iget-object v3, v4, La/ehi;->k:La/iw20;

    .line 951
    .line 952
    iget-object v3, v3, La/iw20;->a:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v3, La/uii;

    .line 955
    .line 956
    invoke-virtual {v3}, La/uii;->r()La/pru;

    .line 957
    .line 958
    .line 959
    move-result-object v19

    .line 960
    move-object/from16 v16, v0

    .line 961
    .line 962
    move-object/from16 v17, v1

    .line 963
    .line 964
    move-object/from16 v18, v2

    .line 965
    .line 966
    invoke-direct/range {v6 .. v19}, La/vy60;-><init>(La/jtj;La/b8u;La/x4u;La/lqc;La/qxg0;La/lbu;La/hnu;La/mne;La/duj;La/ctf0;La/gw60;La/hs60;La/pru;)V

    .line 967
    .line 968
    .line 969
    return-object v6

    .line 970
    :pswitch_17
    move-object v0, v4

    .line 971
    new-instance v7, La/pup;

    .line 972
    .line 973
    move-object v4, v0

    .line 974
    check-cast v4, La/h6i;

    .line 975
    .line 976
    iget-object v0, v4, La/h6i;->d:Ljava/lang/Object;

    .line 977
    .line 978
    move-object v8, v0

    .line 979
    check-cast v8, Ljava/lang/String;

    .line 980
    .line 981
    iget-object v0, v4, La/h6i;->b:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v0, Ljava/lang/Long;

    .line 984
    .line 985
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 986
    .line 987
    .line 988
    move-result-wide v9

    .line 989
    iget-object v0, v4, La/h6i;->f:Ljava/lang/Object;

    .line 990
    .line 991
    move-object v11, v0

    .line 992
    check-cast v11, La/i1w0;

    .line 993
    .line 994
    iget-object v0, v4, La/h6i;->g:Ljava/lang/Object;

    .line 995
    .line 996
    check-cast v0, La/cad;

    .line 997
    .line 998
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v0, La/psc;

    .line 1001
    .line 1002
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v12

    .line 1006
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    iget-object v0, v4, La/h6i;->a:Ljava/lang/Object;

    .line 1010
    .line 1011
    move-object v13, v0

    .line 1012
    check-cast v13, La/ctf0;

    .line 1013
    .line 1014
    iget-object v0, v4, La/h6i;->e:Ljava/lang/Object;

    .line 1015
    .line 1016
    move-object v14, v0

    .line 1017
    check-cast v14, La/m1e;

    .line 1018
    .line 1019
    new-instance v15, La/jwu;

    .line 1020
    .line 1021
    iget-object v0, v4, La/h6i;->h:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v0, La/pmi0;

    .line 1024
    .line 1025
    iget-object v1, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v1, La/daf;

    .line 1028
    .line 1029
    invoke-virtual {v1}, La/daf;->A()La/nfm0;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-direct {v15, v1, v2}, La/jwu;-><init>(La/nfm0;B)V

    .line 1037
    .line 1038
    .line 1039
    iget-object v1, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v1, La/daf;

    .line 1042
    .line 1043
    invoke-virtual {v1}, La/daf;->s()La/f7u;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v16

    .line 1047
    new-instance v1, La/qzt;

    .line 1048
    .line 1049
    iget-object v2, v4, La/h6i;->i:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v2, La/pru;

    .line 1052
    .line 1053
    invoke-direct {v1, v2, v3}, La/qzt;-><init>(La/pru;B)V

    .line 1054
    .line 1055
    .line 1056
    iget-object v2, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v2, La/daf;

    .line 1059
    .line 1060
    invoke-virtual {v2}, La/daf;->r()La/fhj;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v18

    .line 1064
    new-instance v2, La/weu;

    .line 1065
    .line 1066
    iget-object v0, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 1067
    .line 1068
    check-cast v0, La/daf;

    .line 1069
    .line 1070
    invoke-virtual {v0}, La/daf;->A()La/nfm0;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1075
    .line 1076
    .line 1077
    invoke-direct {v2, v0, v3}, La/weu;-><init>(La/nfm0;B)V

    .line 1078
    .line 1079
    .line 1080
    iget-object v0, v4, La/h6i;->j:Ljava/lang/Object;

    .line 1081
    .line 1082
    move-object/from16 v20, v0

    .line 1083
    .line 1084
    check-cast v20, La/uyu;

    .line 1085
    .line 1086
    iget-object v0, v4, La/h6i;->k:Ljava/lang/Object;

    .line 1087
    .line 1088
    move-object/from16 v21, v0

    .line 1089
    .line 1090
    check-cast v21, La/wyu;

    .line 1091
    .line 1092
    iget-object v0, v4, La/h6i;->l:Ljava/lang/Object;

    .line 1093
    .line 1094
    move-object/from16 v22, v0

    .line 1095
    .line 1096
    check-cast v22, La/duj;

    .line 1097
    .line 1098
    new-instance v0, La/a7q;

    .line 1099
    .line 1100
    new-instance v3, La/wti;

    .line 1101
    .line 1102
    new-instance v5, La/zri;

    .line 1103
    .line 1104
    iget-object v6, v4, La/h6i;->m:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v6, La/gii0;

    .line 1107
    .line 1108
    move-object/from16 v17, v1

    .line 1109
    .line 1110
    const/16 v1, 0xc

    .line 1111
    .line 1112
    invoke-direct {v5, v6, v1}, La/zri;-><init>(La/gii0;B)V

    .line 1113
    .line 1114
    .line 1115
    iget-object v1, v4, La/h6i;->n:Ljava/lang/Object;

    .line 1116
    .line 1117
    check-cast v1, La/knf0;

    .line 1118
    .line 1119
    invoke-direct {v3, v5, v1}, La/wti;-><init>(La/zri;La/knf0;)V

    .line 1120
    .line 1121
    .line 1122
    invoke-direct {v0, v3}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    iget-object v1, v4, La/h6i;->o:Ljava/lang/Object;

    .line 1126
    .line 1127
    move-object/from16 v24, v1

    .line 1128
    .line 1129
    check-cast v24, La/r9u;

    .line 1130
    .line 1131
    iget-object v1, v4, La/h6i;->p:Ljava/lang/Object;

    .line 1132
    .line 1133
    move-object/from16 v25, v1

    .line 1134
    .line 1135
    check-cast v25, La/ocl;

    .line 1136
    .line 1137
    move-object/from16 v23, v0

    .line 1138
    .line 1139
    move-object/from16 v19, v2

    .line 1140
    .line 1141
    invoke-direct/range {v7 .. v25}, La/pup;-><init>(Ljava/lang/String;JLa/i1w0;La/mne;La/ctf0;La/m1e;La/jwu;La/f7u;La/qzt;La/fhj;La/weu;La/uyu;La/wyu;La/duj;La/a7q;La/r9u;La/ocl;)V

    .line 1142
    .line 1143
    .line 1144
    return-object v7

    .line 1145
    :pswitch_18
    new-instance v1, La/chi;

    .line 1146
    .line 1147
    invoke-direct {v1, v0}, La/chi;-><init>(La/ugi;)V

    .line 1148
    .line 1149
    .line 1150
    return-object v1

    .line 1151
    :pswitch_19
    new-instance v1, La/ahi;

    .line 1152
    .line 1153
    invoke-direct {v1, v0}, La/ahi;-><init>(La/ugi;)V

    .line 1154
    .line 1155
    .line 1156
    return-object v1

    .line 1157
    :pswitch_1a
    new-instance v1, La/ygi;

    .line 1158
    .line 1159
    invoke-direct {v1, v0}, La/ygi;-><init>(La/ugi;)V

    .line 1160
    .line 1161
    .line 1162
    return-object v1

    .line 1163
    :pswitch_1b
    new-instance v1, La/wgi;

    .line 1164
    .line 1165
    invoke-direct {v1, v0}, La/wgi;-><init>(La/ugi;)V

    .line 1166
    .line 1167
    .line 1168
    return-object v1

    .line 1169
    :pswitch_1c
    move-object v0, v4

    .line 1170
    new-instance v2, La/khp;

    .line 1171
    .line 1172
    move-object v4, v0

    .line 1173
    check-cast v4, La/esg0;

    .line 1174
    .line 1175
    iget-object v0, v4, La/esg0;->a:Ljava/lang/Object;

    .line 1176
    .line 1177
    move-object v3, v0

    .line 1178
    check-cast v3, La/ctf0;

    .line 1179
    .line 1180
    iget-object v0, v4, La/esg0;->b:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v0, La/cad;

    .line 1183
    .line 1184
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v0, La/psc;

    .line 1187
    .line 1188
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1193
    .line 1194
    .line 1195
    iget-object v1, v4, La/esg0;->c:Ljava/lang/Object;

    .line 1196
    .line 1197
    move-object v5, v1

    .line 1198
    check-cast v5, La/dot;

    .line 1199
    .line 1200
    iget-object v1, v4, La/esg0;->d:Ljava/lang/Object;

    .line 1201
    .line 1202
    move-object v6, v1

    .line 1203
    check-cast v6, La/dot;

    .line 1204
    .line 1205
    iget-object v1, v4, La/esg0;->e:Ljava/lang/Object;

    .line 1206
    .line 1207
    move-object v7, v1

    .line 1208
    check-cast v7, La/i1w0;

    .line 1209
    .line 1210
    move-object v4, v0

    .line 1211
    invoke-direct/range {v2 .. v7}, La/khp;-><init>(La/ctf0;La/mne;La/dot;La/dot;La/i1w0;)V

    .line 1212
    .line 1213
    .line 1214
    return-object v2

    .line 1215
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
