.class public final La/kzi;
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
    iput-byte p2, p0, La/kzi;->a:B

    iput-object p1, p0, La/kzi;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kzi;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/kzi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v1, La/uzi;

    .line 11
    .line 12
    invoke-direct {v1, v0}, La/uzi;-><init>(La/kzi;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    move-object v0, v2

    .line 17
    new-instance v2, La/tmv0;

    .line 18
    .line 19
    check-cast v0, La/tzi;

    .line 20
    .line 21
    new-instance v3, La/n4u;

    .line 22
    .line 23
    new-instance v1, La/gxu;

    .line 24
    .line 25
    new-instance v4, La/j910;

    .line 26
    .line 27
    iget-object v5, v0, La/tzi;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, La/gii0;

    .line 30
    .line 31
    const/16 v6, 0xc

    .line 32
    .line 33
    invoke-direct {v4, v5, v6}, La/j910;-><init>(La/gii0;B)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v0, La/tzi;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, La/knf0;

    .line 39
    .line 40
    iget-object v6, v0, La/tzi;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, La/cad;

    .line 43
    .line 44
    iget-object v7, v6, La/cad;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, La/psc;

    .line 47
    .line 48
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v4, v1, La/gxu;->a:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v5, v1, La/gxu;->b:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v7, v1, La/gxu;->c:Ljava/lang/Object;

    .line 66
    .line 67
    const/16 v4, 0x19

    .line 68
    .line 69
    invoke-direct {v3, v1, v4}, La/n4u;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, La/tzi;->e:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v4, v1

    .line 75
    check-cast v4, La/m1e;

    .line 76
    .line 77
    iget-object v1, v6, La/cad;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, La/psc;

    .line 80
    .line 81
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, La/tzi;->f:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v6, v1

    .line 91
    check-cast v6, La/i1w0;

    .line 92
    .line 93
    iget-object v1, v0, La/tzi;->g:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v7, v1

    .line 96
    check-cast v7, La/duj;

    .line 97
    .line 98
    iget-object v1, v0, La/tzi;->h:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v8, v1

    .line 101
    check-cast v8, La/ocl;

    .line 102
    .line 103
    iget-object v1, v0, La/tzi;->i:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v9, v1

    .line 106
    check-cast v9, La/ctf0;

    .line 107
    .line 108
    iget-object v0, v0, La/tzi;->j:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v10, v0

    .line 111
    check-cast v10, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct/range {v2 .. v10}, La/tmv0;-><init>(La/n4u;La/m1e;La/mne;La/i1w0;La/duj;La/ocl;La/ctf0;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v2

    .line 117
    :pswitch_1
    move-object v0, v2

    .line 118
    new-instance v3, La/emv0;

    .line 119
    .line 120
    move-object v2, v0

    .line 121
    check-cast v2, La/h6i;

    .line 122
    .line 123
    iget-object v0, v2, La/h6i;->d:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v4, v0

    .line 126
    check-cast v4, La/qzt;

    .line 127
    .line 128
    iget-object v0, v2, La/h6i;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, La/pmi0;

    .line 131
    .line 132
    iget-object v1, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, La/daf;

    .line 135
    .line 136
    invoke-virtual {v1}, La/daf;->r()La/fhj;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    new-instance v6, La/bzu;

    .line 141
    .line 142
    new-instance v1, La/ykv0;

    .line 143
    .line 144
    new-instance v7, La/trm0;

    .line 145
    .line 146
    iget-object v8, v2, La/h6i;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v8, La/gii0;

    .line 149
    .line 150
    const/16 v9, 0xf

    .line 151
    .line 152
    invoke-direct {v7, v8, v9}, La/trm0;-><init>(La/gii0;B)V

    .line 153
    .line 154
    .line 155
    iget-object v8, v2, La/h6i;->f:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v8, La/knf0;

    .line 158
    .line 159
    iget-object v9, v2, La/h6i;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v9, La/cad;

    .line 162
    .line 163
    iget-object v10, v9, La/cad;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v10, La/psc;

    .line 166
    .line 167
    invoke-virtual {v10}, La/psc;->h()La/mne;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v1, v7, v8, v10}, La/ykv0;-><init>(La/trm0;La/knf0;La/mne;)V

    .line 175
    .line 176
    .line 177
    const/16 v7, 0xa

    .line 178
    .line 179
    invoke-direct {v6, v1, v7}, La/bzu;-><init>(Ljava/lang/Object;B)V

    .line 180
    .line 181
    .line 182
    iget-object v1, v2, La/h6i;->h:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v7, v1

    .line 185
    check-cast v7, La/wyu;

    .line 186
    .line 187
    iget-object v1, v2, La/h6i;->i:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v8, v1

    .line 190
    check-cast v8, Ljava/lang/String;

    .line 191
    .line 192
    iget-object v1, v2, La/h6i;->j:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, Ljava/lang/Long;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 197
    .line 198
    .line 199
    move-result-wide v10

    .line 200
    iget-object v1, v2, La/h6i;->k:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, La/i1w0;

    .line 203
    .line 204
    iget-object v12, v2, La/h6i;->l:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v12, La/duj;

    .line 207
    .line 208
    iget-object v13, v2, La/h6i;->e:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v13, La/m1e;

    .line 211
    .line 212
    new-instance v14, La/zqu;

    .line 213
    .line 214
    iget-object v15, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v15, La/daf;

    .line 217
    .line 218
    invoke-virtual {v15}, La/daf;->A()La/nfm0;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    move-object/from16 p0, v1

    .line 226
    .line 227
    const/4 v1, 0x1

    .line 228
    invoke-direct {v14, v15, v1}, La/zqu;-><init>(La/nfm0;B)V

    .line 229
    .line 230
    .line 231
    iget-object v1, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, La/daf;

    .line 234
    .line 235
    invoke-virtual {v1}, La/daf;->y()La/ieu;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    new-instance v1, La/do20;

    .line 240
    .line 241
    iget-object v0, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, La/daf;

    .line 244
    .line 245
    invoke-virtual {v0}, La/daf;->A()La/nfm0;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v1, v0}, La/do20;-><init>(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object v0, v2, La/h6i;->m:Ljava/lang/Object;

    .line 256
    .line 257
    move-object/from16 v17, v0

    .line 258
    .line 259
    check-cast v17, La/ocl;

    .line 260
    .line 261
    iget-object v0, v9, La/cad;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, La/psc;

    .line 264
    .line 265
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 266
    .line 267
    .line 268
    move-result-object v18

    .line 269
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v0, v2, La/h6i;->n:Ljava/lang/Object;

    .line 273
    .line 274
    move-object/from16 v19, v0

    .line 275
    .line 276
    check-cast v19, La/uyu;

    .line 277
    .line 278
    iget-object v0, v2, La/h6i;->o:Ljava/lang/Object;

    .line 279
    .line 280
    move-object/from16 v20, v0

    .line 281
    .line 282
    check-cast v20, La/pru;

    .line 283
    .line 284
    new-instance v0, La/cge0;

    .line 285
    .line 286
    const/16 v9, 0x1d

    .line 287
    .line 288
    invoke-direct {v0, v9}, La/cge0;-><init>(B)V

    .line 289
    .line 290
    .line 291
    iget-object v2, v2, La/h6i;->p:Ljava/lang/Object;

    .line 292
    .line 293
    move-object/from16 v22, v2

    .line 294
    .line 295
    check-cast v22, La/r9u;

    .line 296
    .line 297
    move-object/from16 v21, v0

    .line 298
    .line 299
    move-object/from16 v16, v1

    .line 300
    .line 301
    move-wide v9, v10

    .line 302
    move-object/from16 v11, p0

    .line 303
    .line 304
    invoke-direct/range {v3 .. v22}, La/emv0;-><init>(La/qzt;La/fhj;La/bzu;La/wyu;Ljava/lang/String;JLa/i1w0;La/duj;La/m1e;La/zqu;La/ieu;La/do20;La/ocl;La/mne;La/uyu;La/pru;La/cge0;La/r9u;)V

    .line 305
    .line 306
    .line 307
    return-object v3

    .line 308
    :pswitch_2
    new-instance v1, La/pzi;

    .line 309
    .line 310
    invoke-direct {v1, v0}, La/pzi;-><init>(La/kzi;)V

    .line 311
    .line 312
    .line 313
    return-object v1

    .line 314
    :pswitch_3
    move-object v0, v2

    .line 315
    new-instance v2, La/fo3;

    .line 316
    .line 317
    check-cast v0, La/uii;

    .line 318
    .line 319
    iget-object v1, v0, La/uii;->a:Ljava/lang/Object;

    .line 320
    .line 321
    move-object v3, v1

    .line 322
    check-cast v3, La/a6u;

    .line 323
    .line 324
    new-instance v4, La/p4u;

    .line 325
    .line 326
    iget-object v1, v0, La/uii;->b:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, La/esg0;

    .line 329
    .line 330
    new-instance v5, La/nmt0;

    .line 331
    .line 332
    iget-object v1, v1, La/esg0;->f:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, La/n5d0;

    .line 335
    .line 336
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, La/fmg0;

    .line 341
    .line 342
    invoke-direct {v5, v1}, La/nmt0;-><init>(La/fmg0;)V

    .line 343
    .line 344
    .line 345
    invoke-direct {v4, v5}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    iget-object v1, v0, La/uii;->c:Ljava/lang/Object;

    .line 349
    .line 350
    move-object v5, v1

    .line 351
    check-cast v5, La/ctf0;

    .line 352
    .line 353
    new-instance v6, La/wgu;

    .line 354
    .line 355
    iget-object v1, v0, La/uii;->d:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v1, La/yox;

    .line 358
    .line 359
    invoke-direct {v6, v1}, La/wgu;-><init>(La/yox;)V

    .line 360
    .line 361
    .line 362
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, La/cad;

    .line 365
    .line 366
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, La/psc;

    .line 369
    .line 370
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-direct/range {v2 .. v7}, La/fo3;-><init>(La/a6u;La/p4u;La/ctf0;La/wgu;La/mne;)V

    .line 378
    .line 379
    .line 380
    return-object v2

    .line 381
    :pswitch_4
    move-object v0, v2

    .line 382
    new-instance v3, La/c8v0;

    .line 383
    .line 384
    move-object v2, v0

    .line 385
    check-cast v2, La/nzi;

    .line 386
    .line 387
    iget-object v4, v2, La/nzi;->a:Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 388
    .line 389
    iget-object v5, v2, La/nzi;->b:La/i1w0;

    .line 390
    .line 391
    iget-object v6, v2, La/nzi;->c:La/m1e;

    .line 392
    .line 393
    new-instance v7, La/x4u;

    .line 394
    .line 395
    new-instance v0, La/zpu;

    .line 396
    .line 397
    new-instance v1, La/lbu;

    .line 398
    .line 399
    iget-object v8, v2, La/nzi;->d:La/gii0;

    .line 400
    .line 401
    const/16 v9, 0x1c

    .line 402
    .line 403
    invoke-direct {v1, v8, v9}, La/lbu;-><init>(La/gii0;B)V

    .line 404
    .line 405
    .line 406
    new-instance v8, La/lgz;

    .line 407
    .line 408
    invoke-direct {v8}, La/lgz;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-direct {v0, v1, v8}, La/zpu;-><init>(La/lbu;La/lgz;)V

    .line 412
    .line 413
    .line 414
    invoke-direct {v7, v0}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    iget-object v8, v2, La/nzi;->e:La/g2v;

    .line 418
    .line 419
    iget-object v9, v2, La/nzi;->f:La/ctf0;

    .line 420
    .line 421
    iget-object v0, v2, La/nzi;->g:La/cad;

    .line 422
    .line 423
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v0, La/psc;

    .line 426
    .line 427
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    iget-object v11, v2, La/nzi;->h:La/kys0;

    .line 435
    .line 436
    invoke-direct/range {v3 .. v11}, La/c8v0;-><init>(Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;La/i1w0;La/m1e;La/x4u;La/g2v;La/ctf0;La/mne;La/kys0;)V

    .line 437
    .line 438
    .line 439
    return-object v3

    .line 440
    :pswitch_5
    new-instance v1, La/lzi;

    .line 441
    .line 442
    invoke-direct {v1, v0}, La/lzi;-><init>(La/kzi;)V

    .line 443
    .line 444
    .line 445
    return-object v1

    .line 446
    :pswitch_6
    move-object v0, v2

    .line 447
    new-instance v2, La/ayc0;

    .line 448
    .line 449
    check-cast v0, La/t7i;

    .line 450
    .line 451
    iget-object v1, v0, La/t7i;->i:Ljava/lang/Object;

    .line 452
    .line 453
    move-object v3, v1

    .line 454
    check-cast v3, Ljava/lang/String;

    .line 455
    .line 456
    iget-object v1, v0, La/t7i;->a:Ljava/lang/Object;

    .line 457
    .line 458
    move-object v4, v1

    .line 459
    check-cast v4, La/hse0;

    .line 460
    .line 461
    iget-object v1, v0, La/t7i;->l:Ljava/lang/Object;

    .line 462
    .line 463
    move-object v5, v1

    .line 464
    check-cast v5, La/b8u;

    .line 465
    .line 466
    iget-object v1, v0, La/t7i;->f:Ljava/lang/Object;

    .line 467
    .line 468
    move-object v6, v1

    .line 469
    check-cast v6, La/i1w0;

    .line 470
    .line 471
    iget-object v1, v0, La/t7i;->g:Ljava/lang/Object;

    .line 472
    .line 473
    move-object v7, v1

    .line 474
    check-cast v7, La/g2v;

    .line 475
    .line 476
    iget-object v8, v0, La/t7i;->e:La/m1e;

    .line 477
    .line 478
    iget-object v1, v0, La/t7i;->m:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v9, v1

    .line 481
    check-cast v9, La/mne;

    .line 482
    .line 483
    iget-object v10, v0, La/t7i;->h:La/duj;

    .line 484
    .line 485
    iget-object v1, v0, La/t7i;->n:Ljava/lang/Object;

    .line 486
    .line 487
    move-object v11, v1

    .line 488
    check-cast v11, La/j1q0;

    .line 489
    .line 490
    iget-object v1, v0, La/t7i;->o:Ljava/lang/Object;

    .line 491
    .line 492
    move-object v12, v1

    .line 493
    check-cast v12, La/ntu;

    .line 494
    .line 495
    iget-object v1, v0, La/t7i;->p:Ljava/lang/Object;

    .line 496
    .line 497
    move-object v13, v1

    .line 498
    check-cast v13, La/n4u;

    .line 499
    .line 500
    iget-object v14, v0, La/t7i;->c:La/ctf0;

    .line 501
    .line 502
    iget-object v1, v0, La/t7i;->q:Ljava/lang/Object;

    .line 503
    .line 504
    move-object v15, v1

    .line 505
    check-cast v15, La/wgu;

    .line 506
    .line 507
    iget-object v1, v0, La/t7i;->j:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v1, La/wsf0;

    .line 510
    .line 511
    move-object/from16 p0, v2

    .line 512
    .line 513
    iget-object v2, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v2, La/g45;

    .line 516
    .line 517
    invoke-virtual {v2}, La/g45;->E()La/nou;

    .line 518
    .line 519
    .line 520
    move-result-object v16

    .line 521
    iget-object v2, v0, La/t7i;->r:Ljava/lang/Object;

    .line 522
    .line 523
    move-object/from16 v17, v2

    .line 524
    .line 525
    check-cast v17, La/uzc0;

    .line 526
    .line 527
    iget-object v2, v0, La/t7i;->b:Ljava/lang/Object;

    .line 528
    .line 529
    move-object/from16 v18, v2

    .line 530
    .line 531
    check-cast v18, La/x0u;

    .line 532
    .line 533
    iget-object v2, v0, La/t7i;->s:Ljava/lang/Object;

    .line 534
    .line 535
    move-object/from16 v19, v2

    .line 536
    .line 537
    check-cast v19, La/yfu;

    .line 538
    .line 539
    iget-object v2, v0, La/t7i;->t:Ljava/lang/Object;

    .line 540
    .line 541
    move-object/from16 v20, v2

    .line 542
    .line 543
    check-cast v20, La/ieu;

    .line 544
    .line 545
    iget-object v2, v0, La/t7i;->u:Ljava/lang/Object;

    .line 546
    .line 547
    move-object/from16 v21, v2

    .line 548
    .line 549
    check-cast v21, La/ocl;

    .line 550
    .line 551
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v1, La/g45;

    .line 554
    .line 555
    invoke-virtual {v1}, La/g45;->t()La/m0u;

    .line 556
    .line 557
    .line 558
    move-result-object v22

    .line 559
    iget-object v1, v0, La/t7i;->v:Ljava/lang/Object;

    .line 560
    .line 561
    move-object/from16 v23, v1

    .line 562
    .line 563
    check-cast v23, La/yfu;

    .line 564
    .line 565
    iget-object v1, v0, La/t7i;->w:Ljava/lang/Object;

    .line 566
    .line 567
    move-object/from16 v24, v1

    .line 568
    .line 569
    check-cast v24, La/ocl;

    .line 570
    .line 571
    new-instance v1, La/iqt;

    .line 572
    .line 573
    iget-object v2, v0, La/t7i;->d:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v2, La/gst0;

    .line 576
    .line 577
    invoke-direct {v1, v2}, La/iqt;-><init>(La/gst0;)V

    .line 578
    .line 579
    .line 580
    iget-object v2, v0, La/t7i;->x:Ljava/lang/Object;

    .line 581
    .line 582
    move-object/from16 v26, v2

    .line 583
    .line 584
    check-cast v26, La/hru;

    .line 585
    .line 586
    iget-object v0, v0, La/t7i;->k:Ljava/lang/Object;

    .line 587
    .line 588
    move-object/from16 v27, v0

    .line 589
    .line 590
    check-cast v27, La/jqt;

    .line 591
    .line 592
    move-object/from16 v2, p0

    .line 593
    .line 594
    move-object/from16 v25, v1

    .line 595
    .line 596
    invoke-direct/range {v2 .. v27}, La/ayc0;-><init>(Ljava/lang/String;La/hse0;La/b8u;La/i1w0;La/g2v;La/m1e;La/mne;La/duj;La/j1q0;La/ntu;La/n4u;La/ctf0;La/wgu;La/nou;La/uzc0;La/x0u;La/yfu;La/ieu;La/ocl;La/m0u;La/yfu;La/ocl;La/iqt;La/hru;La/jqt;)V

    .line 597
    .line 598
    .line 599
    return-object v2

    .line 600
    :pswitch_7
    move-object v0, v2

    .line 601
    new-instance v3, La/gxc0;

    .line 602
    .line 603
    move-object v2, v0

    .line 604
    check-cast v2, La/v9i;

    .line 605
    .line 606
    iget-object v0, v2, La/v9i;->f:Ljava/lang/Object;

    .line 607
    .line 608
    move-object v4, v0

    .line 609
    check-cast v4, Ljava/lang/String;

    .line 610
    .line 611
    iget-object v0, v2, La/v9i;->g:Ljava/lang/Object;

    .line 612
    .line 613
    move-object v5, v0

    .line 614
    check-cast v5, La/hse0;

    .line 615
    .line 616
    iget-object v0, v2, La/v9i;->c:Ljava/lang/Object;

    .line 617
    .line 618
    move-object v6, v0

    .line 619
    check-cast v6, La/yfu;

    .line 620
    .line 621
    iget-object v0, v2, La/v9i;->h:Ljava/lang/Object;

    .line 622
    .line 623
    move-object v7, v0

    .line 624
    check-cast v7, La/b8u;

    .line 625
    .line 626
    iget-object v0, v2, La/v9i;->q:Ljava/lang/Object;

    .line 627
    .line 628
    move-object v8, v0

    .line 629
    check-cast v8, La/i1w0;

    .line 630
    .line 631
    iget-object v0, v2, La/v9i;->i:Ljava/lang/Object;

    .line 632
    .line 633
    move-object v9, v0

    .line 634
    check-cast v9, La/g2v;

    .line 635
    .line 636
    iget-object v10, v2, La/v9i;->b:La/m1e;

    .line 637
    .line 638
    iget-object v0, v2, La/v9i;->j:Ljava/lang/Object;

    .line 639
    .line 640
    move-object v11, v0

    .line 641
    check-cast v11, La/mne;

    .line 642
    .line 643
    iget-object v0, v2, La/v9i;->r:Ljava/lang/Object;

    .line 644
    .line 645
    move-object v12, v0

    .line 646
    check-cast v12, La/duj;

    .line 647
    .line 648
    iget-object v0, v2, La/v9i;->k:Ljava/lang/Object;

    .line 649
    .line 650
    move-object v13, v0

    .line 651
    check-cast v13, La/j1q0;

    .line 652
    .line 653
    iget-object v0, v2, La/v9i;->l:Ljava/lang/Object;

    .line 654
    .line 655
    move-object v14, v0

    .line 656
    check-cast v14, La/ntu;

    .line 657
    .line 658
    iget-object v0, v2, La/v9i;->m:Ljava/lang/Object;

    .line 659
    .line 660
    move-object v15, v0

    .line 661
    check-cast v15, La/wgu;

    .line 662
    .line 663
    iget-object v0, v2, La/v9i;->n:Ljava/lang/Object;

    .line 664
    .line 665
    move-object/from16 v16, v0

    .line 666
    .line 667
    check-cast v16, La/n4u;

    .line 668
    .line 669
    iget-object v0, v2, La/v9i;->e:La/ctf0;

    .line 670
    .line 671
    iget-object v1, v2, La/v9i;->o:Ljava/lang/Object;

    .line 672
    .line 673
    move-object/from16 v18, v1

    .line 674
    .line 675
    check-cast v18, La/iqt;

    .line 676
    .line 677
    iget-object v1, v2, La/v9i;->p:Ljava/lang/Object;

    .line 678
    .line 679
    move-object/from16 v19, v1

    .line 680
    .line 681
    check-cast v19, La/uzc0;

    .line 682
    .line 683
    iget-object v1, v2, La/v9i;->t:Ljava/lang/Object;

    .line 684
    .line 685
    move-object/from16 v20, v1

    .line 686
    .line 687
    check-cast v20, La/wsf0;

    .line 688
    .line 689
    iget-object v1, v2, La/v9i;->s:Ljava/lang/Object;

    .line 690
    .line 691
    move-object/from16 v21, v1

    .line 692
    .line 693
    check-cast v21, La/x0u;

    .line 694
    .line 695
    iget-object v1, v2, La/v9i;->d:Ljava/lang/Object;

    .line 696
    .line 697
    move-object/from16 v22, v1

    .line 698
    .line 699
    check-cast v22, La/yfu;

    .line 700
    .line 701
    iget-object v1, v2, La/v9i;->u:Ljava/lang/Object;

    .line 702
    .line 703
    move-object/from16 v23, v1

    .line 704
    .line 705
    check-cast v23, La/ocl;

    .line 706
    .line 707
    iget-object v1, v2, La/v9i;->v:Ljava/lang/Object;

    .line 708
    .line 709
    move-object/from16 v24, v1

    .line 710
    .line 711
    check-cast v24, La/hru;

    .line 712
    .line 713
    iget-object v1, v2, La/v9i;->w:Ljava/lang/Object;

    .line 714
    .line 715
    move-object/from16 v25, v1

    .line 716
    .line 717
    check-cast v25, La/jqt;

    .line 718
    .line 719
    iget-object v1, v2, La/v9i;->x:Ljava/lang/Object;

    .line 720
    .line 721
    move-object/from16 v26, v1

    .line 722
    .line 723
    check-cast v26, La/ytt;

    .line 724
    .line 725
    move-object/from16 v17, v0

    .line 726
    .line 727
    invoke-direct/range {v3 .. v26}, La/gxc0;-><init>(Ljava/lang/String;La/hse0;La/yfu;La/b8u;La/i1w0;La/g2v;La/m1e;La/mne;La/duj;La/j1q0;La/ntu;La/wgu;La/n4u;La/ctf0;La/iqt;La/uzc0;La/wsf0;La/x0u;La/yfu;La/ocl;La/hru;La/jqt;La/ytt;)V

    .line 728
    .line 729
    .line 730
    return-object v3

    .line 731
    :pswitch_8
    new-instance v1, La/jzi;

    .line 732
    .line 733
    invoke-direct {v1, v0}, La/jzi;-><init>(La/kzi;)V

    .line 734
    .line 735
    .line 736
    return-object v1

    .line 737
    :pswitch_data_0
    .packed-switch 0x0
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
