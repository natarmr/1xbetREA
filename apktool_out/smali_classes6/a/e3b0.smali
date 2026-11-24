.class public final synthetic La/e3b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(BJ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/e3b0;->a:B

    iput-wide p2, p0, La/e3b0;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/e3b0;->a:B

    iput-wide p1, p0, La/e3b0;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e3b0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-wide/16 v4, 0x3c

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-wide v7, v0, La/e3b0;->b:J

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, La/fet;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v6}, La/x8x;->L(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v7, v8, v0, v1}, La/k7n0;->c(JLa/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, La/fet;

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v6}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v7, v8, v0, v1}, La/hmw0;->T(JLa/fet;I)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    move-object/from16 v0, p1

    .line 59
    .line 60
    check-cast v0, La/oyg0;

    .line 61
    .line 62
    move-object/from16 v9, p2

    .line 63
    .line 64
    check-cast v9, La/dvk0;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, v9, La/dvk0;->p:La/jwk0;

    .line 73
    .line 74
    long-to-int v1, v7

    .line 75
    const/4 v2, 0x3

    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-static {v0, v3, v3, v1, v2}, La/jwk0;->a(La/jwk0;La/btk0;Ljava/util/List;II)La/jwk0;

    .line 78
    .line 79
    .line 80
    move-result-object v24

    .line 81
    const/16 v36, 0x0

    .line 82
    .line 83
    const v37, 0x3fff7fff

    .line 84
    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    const/4 v11, 0x0

    .line 88
    const/4 v12, 0x0

    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const/16 v18, 0x0

    .line 97
    .line 98
    const/16 v19, 0x0

    .line 99
    .line 100
    const/16 v20, 0x0

    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const/16 v22, 0x0

    .line 105
    .line 106
    const/16 v23, 0x0

    .line 107
    .line 108
    const/16 v25, 0x0

    .line 109
    .line 110
    const/16 v26, 0x0

    .line 111
    .line 112
    const/16 v27, 0x0

    .line 113
    .line 114
    const/16 v28, 0x0

    .line 115
    .line 116
    const/16 v29, 0x0

    .line 117
    .line 118
    const/16 v30, 0x0

    .line 119
    .line 120
    const/16 v31, 0x0

    .line 121
    .line 122
    const/16 v32, 0x0

    .line 123
    .line 124
    const/16 v33, 0x0

    .line 125
    .line 126
    const/16 v34, 0x0

    .line 127
    .line 128
    const/16 v35, 0x0

    .line 129
    .line 130
    invoke-static/range {v9 .. v37}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :pswitch_2
    move-object/from16 v0, p1

    .line 136
    .line 137
    check-cast v0, La/oyg0;

    .line 138
    .line 139
    move-object/from16 v9, p2

    .line 140
    .line 141
    check-cast v9, La/pfj0;

    .line 142
    .line 143
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    cmp-long v0, v0, v4

    .line 148
    .line 149
    if-lez v0, :cond_0

    .line 150
    .line 151
    move/from16 v33, v6

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    move/from16 v33, v3

    .line 155
    .line 156
    :goto_0
    const v40, -0x2000001

    .line 157
    .line 158
    .line 159
    const v41, 0xfffff

    .line 160
    .line 161
    .line 162
    const/4 v10, 0x0

    .line 163
    const/4 v11, 0x0

    .line 164
    const/4 v12, 0x0

    .line 165
    const/4 v13, 0x0

    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v15, 0x0

    .line 168
    const/16 v16, 0x0

    .line 169
    .line 170
    const/16 v17, 0x0

    .line 171
    .line 172
    const/16 v18, 0x0

    .line 173
    .line 174
    const/16 v19, 0x0

    .line 175
    .line 176
    const/16 v20, 0x0

    .line 177
    .line 178
    const/16 v21, 0x0

    .line 179
    .line 180
    const/16 v22, 0x0

    .line 181
    .line 182
    const/16 v23, 0x0

    .line 183
    .line 184
    const/16 v24, 0x0

    .line 185
    .line 186
    const/16 v25, 0x0

    .line 187
    .line 188
    const/16 v26, 0x0

    .line 189
    .line 190
    const/16 v27, 0x0

    .line 191
    .line 192
    const/16 v28, 0x0

    .line 193
    .line 194
    const/16 v29, 0x0

    .line 195
    .line 196
    const/16 v30, 0x0

    .line 197
    .line 198
    const/16 v31, 0x0

    .line 199
    .line 200
    const/16 v32, 0x0

    .line 201
    .line 202
    const/16 v34, 0x0

    .line 203
    .line 204
    const/16 v35, 0x0

    .line 205
    .line 206
    const/16 v36, 0x0

    .line 207
    .line 208
    const/16 v37, 0x0

    .line 209
    .line 210
    const/16 v38, 0x0

    .line 211
    .line 212
    const/16 v39, 0x0

    .line 213
    .line 214
    invoke-static/range {v9 .. v41}, La/pfj0;->a(La/pfj0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/j6d0;ZZLa/jph0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/pfj0;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    return-object v0

    .line 219
    :pswitch_3
    move-object/from16 v0, p1

    .line 220
    .line 221
    check-cast v0, La/oyg0;

    .line 222
    .line 223
    move-object/from16 v9, p2

    .line 224
    .line 225
    check-cast v9, La/tcj0;

    .line 226
    .line 227
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 228
    .line 229
    .line 230
    move-result-wide v0

    .line 231
    cmp-long v0, v0, v4

    .line 232
    .line 233
    if-lez v0, :cond_1

    .line 234
    .line 235
    move/from16 v32, v6

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_1
    move/from16 v32, v3

    .line 239
    .line 240
    :goto_1
    const v41, -0x4000001

    .line 241
    .line 242
    .line 243
    const v42, 0x1fffff

    .line 244
    .line 245
    .line 246
    const/4 v10, 0x0

    .line 247
    const/4 v11, 0x0

    .line 248
    const/4 v12, 0x0

    .line 249
    const/4 v13, 0x0

    .line 250
    const/4 v14, 0x0

    .line 251
    const/4 v15, 0x0

    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const/16 v18, 0x0

    .line 257
    .line 258
    const/16 v19, 0x0

    .line 259
    .line 260
    const/16 v20, 0x0

    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    const/16 v23, 0x0

    .line 267
    .line 268
    const/16 v24, 0x0

    .line 269
    .line 270
    const/16 v25, 0x0

    .line 271
    .line 272
    const/16 v26, 0x0

    .line 273
    .line 274
    const/16 v27, 0x0

    .line 275
    .line 276
    const/16 v28, 0x0

    .line 277
    .line 278
    const/16 v29, 0x0

    .line 279
    .line 280
    const/16 v30, 0x0

    .line 281
    .line 282
    const/16 v31, 0x0

    .line 283
    .line 284
    const/16 v33, 0x0

    .line 285
    .line 286
    const/16 v34, 0x0

    .line 287
    .line 288
    const/16 v35, 0x0

    .line 289
    .line 290
    const/16 v36, 0x0

    .line 291
    .line 292
    const/16 v37, 0x0

    .line 293
    .line 294
    const/16 v38, 0x0

    .line 295
    .line 296
    const/16 v39, 0x0

    .line 297
    .line 298
    const/16 v40, 0x0

    .line 299
    .line 300
    invoke-static/range {v9 .. v42}, La/tcj0;->a(La/tcj0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZLa/hh5;ZZIII)La/tcj0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    return-object v0

    .line 305
    :pswitch_4
    move-object/from16 v0, p1

    .line 306
    .line 307
    check-cast v0, La/oyg0;

    .line 308
    .line 309
    move-object/from16 v9, p2

    .line 310
    .line 311
    check-cast v9, La/twi0;

    .line 312
    .line 313
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 314
    .line 315
    .line 316
    move-result-wide v0

    .line 317
    cmp-long v0, v0, v4

    .line 318
    .line 319
    if-lez v0, :cond_2

    .line 320
    .line 321
    move/from16 v34, v6

    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_2
    move/from16 v34, v3

    .line 325
    .line 326
    :goto_2
    const v41, -0x4000001

    .line 327
    .line 328
    .line 329
    const v42, 0x1fffff

    .line 330
    .line 331
    .line 332
    const/4 v10, 0x0

    .line 333
    const/4 v11, 0x0

    .line 334
    const/4 v12, 0x0

    .line 335
    const/4 v13, 0x0

    .line 336
    const/4 v14, 0x0

    .line 337
    const/4 v15, 0x0

    .line 338
    const/16 v16, 0x0

    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const/16 v18, 0x0

    .line 343
    .line 344
    const/16 v19, 0x0

    .line 345
    .line 346
    const/16 v20, 0x0

    .line 347
    .line 348
    const/16 v21, 0x0

    .line 349
    .line 350
    const/16 v22, 0x0

    .line 351
    .line 352
    const/16 v23, 0x0

    .line 353
    .line 354
    const/16 v24, 0x0

    .line 355
    .line 356
    const/16 v25, 0x0

    .line 357
    .line 358
    const/16 v26, 0x0

    .line 359
    .line 360
    const/16 v27, 0x0

    .line 361
    .line 362
    const/16 v28, 0x0

    .line 363
    .line 364
    const/16 v29, 0x0

    .line 365
    .line 366
    const/16 v30, 0x0

    .line 367
    .line 368
    const/16 v31, 0x0

    .line 369
    .line 370
    const/16 v32, 0x0

    .line 371
    .line 372
    const/16 v33, 0x0

    .line 373
    .line 374
    const/16 v35, 0x0

    .line 375
    .line 376
    const/16 v36, 0x0

    .line 377
    .line 378
    const/16 v37, 0x0

    .line 379
    .line 380
    const/16 v38, 0x0

    .line 381
    .line 382
    const/16 v39, 0x0

    .line 383
    .line 384
    const/16 v40, 0x0

    .line 385
    .line 386
    invoke-static/range {v9 .. v42}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    return-object v0

    .line 391
    :pswitch_5
    move-object/from16 v0, p1

    .line 392
    .line 393
    check-cast v0, La/fet;

    .line 394
    .line 395
    move-object/from16 v1, p2

    .line 396
    .line 397
    check-cast v1, Ljava/lang/Integer;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-static {v6}, La/x8x;->L(I)I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    invoke-static {v7, v8, v0, v1}, La/hp4;->t(JLa/fet;I)V

    .line 407
    .line 408
    .line 409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_6
    move-object/from16 v1, p1

    .line 413
    .line 414
    check-cast v1, La/oyg0;

    .line 415
    .line 416
    move-object/from16 v2, p2

    .line 417
    .line 418
    check-cast v2, La/qyd0;

    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    iget-object v3, v2, La/qyd0;->j:La/ixd0;

    .line 427
    .line 428
    const/4 v11, 0x0

    .line 429
    const/16 v12, 0x1b

    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    const-wide/16 v5, 0x0

    .line 433
    .line 434
    iget-wide v7, v0, La/e3b0;->b:J

    .line 435
    .line 436
    const-wide/16 v9, 0x0

    .line 437
    .line 438
    invoke-static/range {v3 .. v12}, La/ixd0;->a(La/ixd0;La/o4i0;JJJZI)La/ixd0;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    const/16 v18, 0x0

    .line 443
    .line 444
    const v19, 0x7fffdff

    .line 445
    .line 446
    .line 447
    const/4 v3, 0x0

    .line 448
    const/4 v5, 0x0

    .line 449
    const/4 v6, 0x0

    .line 450
    const/4 v7, 0x0

    .line 451
    const/4 v8, 0x0

    .line 452
    const/4 v9, 0x0

    .line 453
    const/4 v11, 0x0

    .line 454
    const/4 v12, 0x0

    .line 455
    const/4 v13, 0x0

    .line 456
    const/4 v14, 0x0

    .line 457
    const/4 v15, 0x0

    .line 458
    const/16 v16, 0x0

    .line 459
    .line 460
    const/16 v17, 0x0

    .line 461
    .line 462
    invoke-static/range {v2 .. v19}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    return-object v0

    .line 467
    :pswitch_7
    move-object/from16 v1, p1

    .line 468
    .line 469
    check-cast v1, La/oyg0;

    .line 470
    .line 471
    move-object/from16 v2, p2

    .line 472
    .line 473
    check-cast v2, La/qyd0;

    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    iget-object v3, v2, La/qyd0;->j:La/ixd0;

    .line 482
    .line 483
    const/4 v11, 0x0

    .line 484
    const/16 v12, 0x17

    .line 485
    .line 486
    const/4 v4, 0x0

    .line 487
    const-wide/16 v5, 0x0

    .line 488
    .line 489
    const-wide/16 v7, 0x0

    .line 490
    .line 491
    iget-wide v9, v0, La/e3b0;->b:J

    .line 492
    .line 493
    invoke-static/range {v3 .. v12}, La/ixd0;->a(La/ixd0;La/o4i0;JJJZI)La/ixd0;

    .line 494
    .line 495
    .line 496
    move-result-object v10

    .line 497
    const/16 v18, 0x0

    .line 498
    .line 499
    const v19, 0x7fffdff

    .line 500
    .line 501
    .line 502
    const/4 v3, 0x0

    .line 503
    const/4 v5, 0x0

    .line 504
    const/4 v6, 0x0

    .line 505
    const/4 v7, 0x0

    .line 506
    const/4 v8, 0x0

    .line 507
    const/4 v9, 0x0

    .line 508
    const/4 v11, 0x0

    .line 509
    const/4 v12, 0x0

    .line 510
    const/4 v13, 0x0

    .line 511
    const/4 v14, 0x0

    .line 512
    const/4 v15, 0x0

    .line 513
    const/16 v16, 0x0

    .line 514
    .line 515
    const/16 v17, 0x0

    .line 516
    .line 517
    invoke-static/range {v2 .. v19}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    return-object v0

    .line 522
    :pswitch_8
    move-object/from16 v1, p1

    .line 523
    .line 524
    check-cast v1, La/oyg0;

    .line 525
    .line 526
    move-object/from16 v2, p2

    .line 527
    .line 528
    check-cast v2, La/qyd0;

    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    iget-object v3, v2, La/qyd0;->j:La/ixd0;

    .line 537
    .line 538
    const/4 v11, 0x0

    .line 539
    const/16 v12, 0x1d

    .line 540
    .line 541
    const/4 v4, 0x0

    .line 542
    iget-wide v5, v0, La/e3b0;->b:J

    .line 543
    .line 544
    const-wide/16 v7, 0x0

    .line 545
    .line 546
    const-wide/16 v9, 0x0

    .line 547
    .line 548
    invoke-static/range {v3 .. v12}, La/ixd0;->a(La/ixd0;La/o4i0;JJJZI)La/ixd0;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    const/16 v18, 0x0

    .line 553
    .line 554
    const v19, 0x7fffdff

    .line 555
    .line 556
    .line 557
    const/4 v3, 0x0

    .line 558
    const/4 v5, 0x0

    .line 559
    const/4 v6, 0x0

    .line 560
    const/4 v7, 0x0

    .line 561
    const/4 v8, 0x0

    .line 562
    const/4 v9, 0x0

    .line 563
    const/4 v11, 0x0

    .line 564
    const/4 v12, 0x0

    .line 565
    const/4 v13, 0x0

    .line 566
    const/4 v14, 0x0

    .line 567
    const/4 v15, 0x0

    .line 568
    const/16 v16, 0x0

    .line 569
    .line 570
    const/16 v17, 0x0

    .line 571
    .line 572
    invoke-static/range {v2 .. v19}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    return-object v0

    .line 577
    :pswitch_9
    move-object/from16 v0, p1

    .line 578
    .line 579
    check-cast v0, La/oyg0;

    .line 580
    .line 581
    move-object/from16 v9, p2

    .line 582
    .line 583
    check-cast v9, La/u2b0;

    .line 584
    .line 585
    iget-object v0, v9, La/u2b0;->l:Ljava/util/List;

    .line 586
    .line 587
    new-instance v1, Ljava/util/ArrayList;

    .line 588
    .line 589
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 594
    .line 595
    .line 596
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    if-eqz v2, :cond_4

    .line 605
    .line 606
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    check-cast v2, La/df40;

    .line 611
    .line 612
    instance-of v3, v2, La/pe40;

    .line 613
    .line 614
    if-eqz v3, :cond_3

    .line 615
    .line 616
    move-object v3, v2

    .line 617
    check-cast v3, La/pe40;

    .line 618
    .line 619
    iget-object v3, v3, La/pe40;->a:La/w4t;

    .line 620
    .line 621
    instance-of v4, v3, La/q4t;

    .line 622
    .line 623
    if-eqz v4, :cond_3

    .line 624
    .line 625
    move-object v4, v3

    .line 626
    check-cast v4, La/q4t;

    .line 627
    .line 628
    iget-wide v4, v4, La/q4t;->a:J

    .line 629
    .line 630
    cmp-long v4, v4, v7

    .line 631
    .line 632
    if-nez v4, :cond_3

    .line 633
    .line 634
    new-instance v2, La/pe40;

    .line 635
    .line 636
    sget-object v4, La/eyx;->a:La/eyx;

    .line 637
    .line 638
    invoke-direct {v2, v3, v4}, La/pe40;-><init>(La/w4t;La/fyx;)V

    .line 639
    .line 640
    .line 641
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    goto :goto_3

    .line 645
    :cond_4
    const/16 v17, 0x7ff

    .line 646
    .line 647
    const/4 v10, 0x0

    .line 648
    const/4 v11, 0x0

    .line 649
    const/4 v12, 0x0

    .line 650
    const/4 v13, 0x0

    .line 651
    const/4 v14, 0x0

    .line 652
    const/4 v15, 0x0

    .line 653
    move-object/from16 v16, v1

    .line 654
    .line 655
    invoke-static/range {v9 .. v17}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    return-object v0

    .line 660
    :pswitch_a
    move-object/from16 v0, p1

    .line 661
    .line 662
    check-cast v0, La/oyg0;

    .line 663
    .line 664
    move-object/from16 v9, p2

    .line 665
    .line 666
    check-cast v9, La/u2b0;

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    iget-object v0, v9, La/u2b0;->l:Ljava/util/List;

    .line 675
    .line 676
    new-instance v1, Ljava/util/ArrayList;

    .line 677
    .line 678
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 683
    .line 684
    .line 685
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    if-eqz v2, :cond_6

    .line 694
    .line 695
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    check-cast v2, La/df40;

    .line 700
    .line 701
    instance-of v3, v2, La/pe40;

    .line 702
    .line 703
    if-eqz v3, :cond_5

    .line 704
    .line 705
    move-object v3, v2

    .line 706
    check-cast v3, La/pe40;

    .line 707
    .line 708
    iget-object v3, v3, La/pe40;->a:La/w4t;

    .line 709
    .line 710
    instance-of v4, v3, La/q4t;

    .line 711
    .line 712
    if-eqz v4, :cond_5

    .line 713
    .line 714
    move-object v4, v3

    .line 715
    check-cast v4, La/q4t;

    .line 716
    .line 717
    iget-wide v4, v4, La/q4t;->a:J

    .line 718
    .line 719
    cmp-long v4, v4, v7

    .line 720
    .line 721
    if-nez v4, :cond_5

    .line 722
    .line 723
    new-instance v2, La/pe40;

    .line 724
    .line 725
    sget-object v4, La/ayx;->a:La/ayx;

    .line 726
    .line 727
    invoke-direct {v2, v3, v4}, La/pe40;-><init>(La/w4t;La/fyx;)V

    .line 728
    .line 729
    .line 730
    :cond_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    goto :goto_4

    .line 734
    :cond_6
    const/16 v17, 0x7ff

    .line 735
    .line 736
    const/4 v10, 0x0

    .line 737
    const/4 v11, 0x0

    .line 738
    const/4 v12, 0x0

    .line 739
    const/4 v13, 0x0

    .line 740
    const/4 v14, 0x0

    .line 741
    const/4 v15, 0x0

    .line 742
    move-object/from16 v16, v1

    .line 743
    .line 744
    invoke-static/range {v9 .. v17}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    return-object v0

    .line 749
    :pswitch_data_0
    .packed-switch 0x0
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
