.class public final synthetic La/k9v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/k9v;->a:B

    iput-object p1, p0, La/k9v;->c:Ljava/lang/Object;

    iput-object p2, p0, La/k9v;->b:Ljava/lang/Object;

    iput-object p3, p0, La/k9v;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mtv;Ljava/lang/String;Ljava/lang/String;La/zsb0;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput-byte p1, p0, La/k9v;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/k9v;->b:Ljava/lang/Object;

    iput-object p3, p0, La/k9v;->c:Ljava/lang/Object;

    iput-object p4, p0, La/k9v;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/k9v;->a:B

    iput-object p1, p0, La/k9v;->b:Ljava/lang/Object;

    iput-object p2, p0, La/k9v;->c:Ljava/lang/Object;

    iput-object p3, p0, La/k9v;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k9v;->a:B

    .line 4
    .line 5
    sget-object v2, La/axh0;->a:La/axh0;

    .line 6
    .line 7
    sget-object v3, La/zwh0;->a:La/zwh0;

    .line 8
    .line 9
    sget-object v4, La/cxh0;->a:La/cxh0;

    .line 10
    .line 11
    sget-object v5, La/bxh0;->a:La/bxh0;

    .line 12
    .line 13
    sget-object v7, La/ej80;->a:La/ej80;

    .line 14
    .line 15
    sget-object v8, La/bwh0;->a:La/bwh0;

    .line 16
    .line 17
    const v9, 0x7f130276

    .line 18
    .line 19
    .line 20
    sget-object v10, La/hj80;->a:La/hj80;

    .line 21
    .line 22
    const/16 v13, 0x19

    .line 23
    .line 24
    const-string v14, ""

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    iget-object v15, v0, La/k9v;->d:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v12, v0, La/k9v;->c:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v0, v0, La/k9v;->b:Ljava/lang/Object;

    .line 32
    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, La/m940;

    .line 38
    .line 39
    move-object v2, v12

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    move-object v3, v15

    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    move-object/from16 v4, p1

    .line 46
    .line 47
    check-cast v4, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 53
    .line 54
    iget-object v5, v0, La/ocj;->a:La/p7m0;

    .line 55
    .line 56
    :cond_0
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v6, v1, La/i3t0;->f:La/oyg0;

    .line 64
    .line 65
    move-object v7, v0

    .line 66
    check-cast v7, La/n940;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v6, v7, La/n940;->c:Ljava/util/Set;

    .line 72
    .line 73
    invoke-static {v6, v2}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    const/4 v11, 0x0

    .line 78
    const/16 v12, 0xb

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    invoke-static/range {v7 .. v12}, La/n940;->a(La/n940;La/d940;ZLjava/util/LinkedHashSet;Ljava/util/List;I)La/n940;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v5, v0, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    iget-object v0, v1, La/m940;->q:La/b4j;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 101
    .line 102
    const-string v2, "msg_promocode_error"

    .line 103
    .line 104
    const-string v5, "promocode"

    .line 105
    .line 106
    invoke-static {v5, v3, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, v1, La/m940;->r:La/je;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v0, v0, La/je;->a:La/s1p;

    .line 115
    .line 116
    const-wide/16 v5, 0xc46

    .line 117
    .line 118
    invoke-static {v3, v0, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 119
    .line 120
    .line 121
    iget-object v0, v1, La/m940;->C:La/duj;

    .line 122
    .line 123
    new-instance v2, La/b120;

    .line 124
    .line 125
    invoke-direct {v2, v1, v13}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v4, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    check-cast v0, La/ql5;

    .line 135
    .line 136
    check-cast v12, La/xw30;

    .line 137
    .line 138
    check-cast v15, La/kzv;

    .line 139
    .line 140
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, La/k0w0;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-wide v2, v0, La/ql5;->a:J

    .line 148
    .line 149
    invoke-virtual {v12}, La/x2t0;->d()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, La/lx30;

    .line 154
    .line 155
    iget-object v4, v4, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 156
    .line 157
    iget-byte v4, v4, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->a:B

    .line 158
    .line 159
    iget-object v5, v15, La/kzv;->a:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v12}, La/x2t0;->d()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    check-cast v6, La/lx30;

    .line 166
    .line 167
    iget-object v6, v6, La/lx30;->a:Ljava/lang/String;

    .line 168
    .line 169
    iget-wide v7, v15, La/kzv;->d:J

    .line 170
    .line 171
    iget-wide v9, v15, La/kzv;->f:D

    .line 172
    .line 173
    iget-object v0, v0, La/ql5;->f:Ljava/lang/String;

    .line 174
    .line 175
    iget-wide v11, v15, La/kzv;->m:D

    .line 176
    .line 177
    iget-wide v13, v15, La/kzv;->M:D

    .line 178
    .line 179
    move-object/from16 v32, v0

    .line 180
    .line 181
    iget-object v0, v15, La/kzv;->B:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v15, v15, La/kzv;->i:Ljava/lang/String;

    .line 184
    .line 185
    new-instance v16, Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;

    .line 186
    .line 187
    move-object/from16 v30, v0

    .line 188
    .line 189
    move-wide/from16 v24, v2

    .line 190
    .line 191
    move/from16 v23, v4

    .line 192
    .line 193
    move-object/from16 v28, v5

    .line 194
    .line 195
    move-object/from16 v29, v6

    .line 196
    .line 197
    move-wide/from16 v26, v7

    .line 198
    .line 199
    move-wide/from16 v17, v9

    .line 200
    .line 201
    move-wide/from16 v19, v11

    .line 202
    .line 203
    move-wide/from16 v21, v13

    .line 204
    .line 205
    move-object/from16 v31, v15

    .line 206
    .line 207
    invoke-direct/range {v16 .. v32}, Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;-><init>(DDDIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v0, v16

    .line 211
    .line 212
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 213
    .line 214
    .line 215
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_1
    check-cast v0, La/ctf0;

    .line 219
    .line 220
    check-cast v12, La/zvh0;

    .line 221
    .line 222
    check-cast v15, La/fp30;

    .line 223
    .line 224
    move-object/from16 v1, p1

    .line 225
    .line 226
    check-cast v1, La/fee;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance v13, La/nj80;

    .line 232
    .line 233
    new-instance v14, La/yvh0;

    .line 234
    .line 235
    new-array v6, v11, [Ljava/lang/Object;

    .line 236
    .line 237
    move-object/from16 p0, v1

    .line 238
    .line 239
    iget-object v1, v0, La/ctf0;->b:La/lsm0;

    .line 240
    .line 241
    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-virtual {v1, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-direct {v14, v1, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v13, v10, v14}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 253
    .line 254
    .line 255
    new-instance v1, La/nj80;

    .line 256
    .line 257
    new-instance v6, La/yvh0;

    .line 258
    .line 259
    new-array v9, v11, [Ljava/lang/Object;

    .line 260
    .line 261
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 262
    .line 263
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    const v10, 0x7f130275

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-direct {v6, v0, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 275
    .line 276
    .line 277
    invoke-direct {v1, v7, v6}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, v15, La/fp30;->f:La/n0o0;

    .line 281
    .line 282
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, La/fee;

    .line 287
    .line 288
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_1

    .line 293
    .line 294
    goto :goto_0

    .line 295
    :cond_1
    const/4 v1, 0x0

    .line 296
    :goto_0
    filled-new-array {v13, v1}, [La/nj80;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual/range {p0 .. p0}, La/fee;->c()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    check-cast v1, La/go7;

    .line 313
    .line 314
    if-eqz v1, :cond_7

    .line 315
    .line 316
    instance-of v6, v1, La/do7;

    .line 317
    .line 318
    if-eqz v6, :cond_2

    .line 319
    .line 320
    goto :goto_1

    .line 321
    :cond_2
    instance-of v1, v1, La/ao7;

    .line 322
    .line 323
    if-eqz v1, :cond_7

    .line 324
    .line 325
    const/4 v11, 0x1

    .line 326
    :goto_1
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_6

    .line 331
    .line 332
    const/4 v6, 0x1

    .line 333
    if-eq v1, v6, :cond_5

    .line 334
    .line 335
    const/4 v2, 0x2

    .line 336
    if-eq v1, v2, :cond_4

    .line 337
    .line 338
    const/4 v2, 0x3

    .line 339
    if-ne v1, v2, :cond_3

    .line 340
    .line 341
    move-object v2, v5

    .line 342
    goto :goto_3

    .line 343
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 344
    .line 345
    .line 346
    :goto_2
    const/4 v12, 0x0

    .line 347
    goto :goto_4

    .line 348
    :cond_4
    move-object v2, v4

    .line 349
    goto :goto_3

    .line 350
    :cond_5
    move-object v2, v3

    .line 351
    :cond_6
    :goto_3
    new-instance v12, La/vwh0;

    .line 352
    .line 353
    invoke-direct {v12, v11, v0, v2}, La/vwh0;-><init>(ILa/a4x;La/dxh0;)V

    .line 354
    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 358
    .line 359
    .line 360
    goto :goto_2

    .line 361
    :goto_4
    return-object v12

    .line 362
    :pswitch_2
    check-cast v0, La/ctf0;

    .line 363
    .line 364
    check-cast v12, La/c69;

    .line 365
    .line 366
    check-cast v15, La/zvh0;

    .line 367
    .line 368
    move-object/from16 v1, p1

    .line 369
    .line 370
    check-cast v1, La/fee;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    new-instance v6, La/vwh0;

    .line 376
    .line 377
    new-instance v13, La/nj80;

    .line 378
    .line 379
    new-instance v14, La/yvh0;

    .line 380
    .line 381
    new-array v9, v11, [Ljava/lang/Object;

    .line 382
    .line 383
    move-object/from16 p0, v1

    .line 384
    .line 385
    iget-object v1, v0, La/ctf0;->b:La/lsm0;

    .line 386
    .line 387
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v9

    .line 391
    const v11, 0x7f130276

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-direct {v14, v1, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v13, v10, v14}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 402
    .line 403
    .line 404
    iget-object v1, v12, La/c69;->f:La/n0o0;

    .line 405
    .line 406
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    check-cast v1, La/fee;

    .line 411
    .line 412
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    check-cast v1, La/ifc0;

    .line 417
    .line 418
    iget-boolean v1, v1, La/ifc0;->g:Z

    .line 419
    .line 420
    if-eqz v1, :cond_8

    .line 421
    .line 422
    new-instance v1, La/nj80;

    .line 423
    .line 424
    new-instance v9, La/yvh0;

    .line 425
    .line 426
    const/4 v10, 0x0

    .line 427
    new-array v11, v10, [Ljava/lang/Object;

    .line 428
    .line 429
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 430
    .line 431
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    const v10, 0x7f130275

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v10, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-direct {v9, v0, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 443
    .line 444
    .line 445
    invoke-direct {v1, v7, v9}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 446
    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_8
    const/4 v1, 0x0

    .line 450
    :goto_5
    filled-new-array {v13, v1}, [La/nj80;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual/range {p0 .. p0}, La/fee;->c()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, La/eo7;

    .line 467
    .line 468
    if-eqz v1, :cond_e

    .line 469
    .line 470
    instance-of v7, v1, La/bo7;

    .line 471
    .line 472
    if-eqz v7, :cond_9

    .line 473
    .line 474
    const/4 v11, 0x0

    .line 475
    goto :goto_6

    .line 476
    :cond_9
    instance-of v1, v1, La/yn7;

    .line 477
    .line 478
    if-eqz v1, :cond_e

    .line 479
    .line 480
    const/4 v11, 0x1

    .line 481
    :goto_6
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-eqz v1, :cond_d

    .line 486
    .line 487
    const/4 v7, 0x1

    .line 488
    if-eq v1, v7, :cond_c

    .line 489
    .line 490
    const/4 v2, 0x2

    .line 491
    if-eq v1, v2, :cond_b

    .line 492
    .line 493
    const/4 v2, 0x3

    .line 494
    if-ne v1, v2, :cond_a

    .line 495
    .line 496
    move-object v2, v5

    .line 497
    goto :goto_8

    .line 498
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 499
    .line 500
    .line 501
    :goto_7
    const/4 v12, 0x0

    .line 502
    goto :goto_9

    .line 503
    :cond_b
    move-object v2, v4

    .line 504
    goto :goto_8

    .line 505
    :cond_c
    move-object v2, v3

    .line 506
    :cond_d
    :goto_8
    invoke-direct {v6, v11, v0, v2}, La/vwh0;-><init>(ILa/a4x;La/dxh0;)V

    .line 507
    .line 508
    .line 509
    move-object v12, v6

    .line 510
    goto :goto_9

    .line 511
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 512
    .line 513
    .line 514
    goto :goto_7

    .line 515
    :goto_9
    return-object v12

    .line 516
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 517
    .line 518
    check-cast v12, La/vne;

    .line 519
    .line 520
    move-object v2, v15

    .line 521
    check-cast v2, La/kwj;

    .line 522
    .line 523
    move-object/from16 v1, p1

    .line 524
    .line 525
    check-cast v1, Ljava/lang/Long;

    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 528
    .line 529
    .line 530
    move-result-wide v3

    .line 531
    new-instance v1, La/sb30;

    .line 532
    .line 533
    invoke-direct {v1, v3, v4}, La/sb30;-><init>(J)V

    .line 534
    .line 535
    .line 536
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    new-instance v1, La/wn10;

    .line 540
    .line 541
    const/4 v6, 0x2

    .line 542
    const/4 v5, 0x0

    .line 543
    invoke-direct/range {v1 .. v6}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 544
    .line 545
    .line 546
    const/4 v2, 0x3

    .line 547
    invoke-static {v12, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_4
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 554
    .line 555
    check-cast v12, La/fli;

    .line 556
    .line 557
    check-cast v15, La/k3t0;

    .line 558
    .line 559
    move-object/from16 v1, p1

    .line 560
    .line 561
    check-cast v1, La/cz20;

    .line 562
    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    sget-object v2, La/cz20;->a:La/cz20;

    .line 567
    .line 568
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    if-eqz v2, :cond_f

    .line 573
    .line 574
    new-instance v1, La/ti6;

    .line 575
    .line 576
    invoke-direct {v1, v12, v0}, La/ti6;-><init>(La/fli;Landroidx/fragment/app/Fragment;)V

    .line 577
    .line 578
    .line 579
    invoke-static {v0, v1}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 580
    .line 581
    .line 582
    goto :goto_a

    .line 583
    :cond_f
    sget-object v2, La/cz20;->b:La/cz20;

    .line 584
    .line 585
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    if-eqz v1, :cond_10

    .line 590
    .line 591
    iget-object v1, v12, La/fli;->s:La/roq0;

    .line 592
    .line 593
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    sget-object v2, La/fk60;->b:La/uuz;

    .line 601
    .line 602
    const/16 v2, 0x21

    .line 603
    .line 604
    invoke-virtual {v1, v0, v2, v14}, La/roq0;->d(Landroidx/fragment/app/e;ILjava/lang/String;)V

    .line 605
    .line 606
    .line 607
    :goto_a
    sget-object v0, La/vy20;->a:La/vy20;

    .line 608
    .line 609
    invoke-virtual {v15, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    goto :goto_b

    .line 615
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 616
    .line 617
    .line 618
    const/4 v12, 0x0

    .line 619
    :goto_b
    return-object v12

    .line 620
    :pswitch_5
    check-cast v0, La/ua20;

    .line 621
    .line 622
    check-cast v12, La/ctf0;

    .line 623
    .line 624
    check-cast v15, La/pru;

    .line 625
    .line 626
    move-object/from16 v1, p1

    .line 627
    .line 628
    check-cast v1, La/sg20;

    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    const/4 v2, 0x2

    .line 638
    if-eq v0, v2, :cond_12

    .line 639
    .line 640
    const/4 v2, 0x3

    .line 641
    if-eq v0, v2, :cond_11

    .line 642
    .line 643
    new-instance v0, La/c69;

    .line 644
    .line 645
    invoke-virtual {v15}, La/pru;->a()La/sff0;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 650
    .line 651
    iget-object v2, v2, La/mum0;->x:La/zvh0;

    .line 652
    .line 653
    invoke-direct {v0, v1, v12, v2}, La/c69;-><init>(La/sg20;La/ctf0;La/zvh0;)V

    .line 654
    .line 655
    .line 656
    goto :goto_c

    .line 657
    :cond_11
    new-instance v0, La/zn0;

    .line 658
    .line 659
    invoke-virtual {v15}, La/pru;->a()La/sff0;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 664
    .line 665
    iget-object v2, v2, La/mum0;->x:La/zvh0;

    .line 666
    .line 667
    invoke-direct {v0, v1, v12, v2}, La/zn0;-><init>(La/sg20;La/ctf0;La/zvh0;)V

    .line 668
    .line 669
    .line 670
    goto :goto_c

    .line 671
    :cond_12
    new-instance v0, La/z19;

    .line 672
    .line 673
    invoke-virtual {v15}, La/pru;->a()La/sff0;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 678
    .line 679
    iget-object v2, v2, La/mum0;->x:La/zvh0;

    .line 680
    .line 681
    invoke-direct {v0, v1, v12, v2}, La/z19;-><init>(La/sg20;La/ctf0;La/zvh0;)V

    .line 682
    .line 683
    .line 684
    :goto_c
    return-object v0

    .line 685
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 686
    .line 687
    check-cast v12, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 688
    .line 689
    check-cast v15, La/ra10;

    .line 690
    .line 691
    move-object/from16 v1, p1

    .line 692
    .line 693
    check-cast v1, Landroid/view/View;

    .line 694
    .line 695
    invoke-static {v0, v12, v15, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->y(Lkotlin/jvm/functions/Function0;Lorg/xplatform/uikit/components/lottie/LottieView;La/ra10;Landroid/view/View;)Lkotlin/Unit;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    return-object v0

    .line 700
    :pswitch_7
    check-cast v0, La/szj0;

    .line 701
    .line 702
    move-object v1, v12

    .line 703
    check-cast v1, La/u610;

    .line 704
    .line 705
    check-cast v15, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 706
    .line 707
    move-object/from16 v7, p1

    .line 708
    .line 709
    check-cast v7, La/k0w0;

    .line 710
    .line 711
    iget-object v0, v0, La/szj0;->e:La/rzj0;

    .line 712
    .line 713
    sget-object v2, La/pzj0;->a:La/pzj0;

    .line 714
    .line 715
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    if-eqz v2, :cond_13

    .line 720
    .line 721
    iget-object v2, v1, La/u610;->R:La/xpr;

    .line 722
    .line 723
    new-instance v3, La/vpr;

    .line 724
    .line 725
    const/4 v10, 0x0

    .line 726
    invoke-direct {v3, v10}, La/vpr;-><init>(Z)V

    .line 727
    .line 728
    .line 729
    const/4 v5, 0x0

    .line 730
    const/4 v6, 0x6

    .line 731
    const/4 v4, 0x0

    .line 732
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v7, v15}, La/k0w0;->c(La/m7h0;)V

    .line 736
    .line 737
    .line 738
    goto :goto_d

    .line 739
    :cond_13
    sget-object v2, La/qzj0;->a:La/qzj0;

    .line 740
    .line 741
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-eqz v0, :cond_14

    .line 746
    .line 747
    iget-object v2, v1, La/u610;->R:La/xpr;

    .line 748
    .line 749
    new-instance v3, La/vpr;

    .line 750
    .line 751
    const/4 v6, 0x1

    .line 752
    invoke-direct {v3, v6}, La/vpr;-><init>(Z)V

    .line 753
    .line 754
    .line 755
    const/4 v5, 0x0

    .line 756
    const/4 v6, 0x6

    .line 757
    const/4 v4, 0x0

    .line 758
    invoke-static/range {v1 .. v6}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v7, v15}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 762
    .line 763
    .line 764
    :goto_d
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 765
    .line 766
    goto :goto_e

    .line 767
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 768
    .line 769
    .line 770
    const/4 v12, 0x0

    .line 771
    :goto_e
    return-object v12

    .line 772
    :pswitch_8
    check-cast v0, La/syp;

    .line 773
    .line 774
    move-object/from16 v27, v12

    .line 775
    .line 776
    check-cast v27, La/ctf0;

    .line 777
    .line 778
    move-object/from16 v28, v15

    .line 779
    .line 780
    check-cast v28, La/y78;

    .line 781
    .line 782
    move-object/from16 v1, p1

    .line 783
    .line 784
    check-cast v1, Ljava/util/List;

    .line 785
    .line 786
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    iget-object v2, v0, La/syp;->b:La/n0o0;

    .line 790
    .line 791
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    check-cast v2, La/fee;

    .line 796
    .line 797
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    check-cast v2, La/mj00;

    .line 802
    .line 803
    if-nez v2, :cond_15

    .line 804
    .line 805
    sget-object v12, La/lak0;->c:La/lak0;

    .line 806
    .line 807
    goto/16 :goto_2f

    .line 808
    .line 809
    :cond_15
    iget-object v3, v2, La/mj00;->b:Ljava/util/List;

    .line 810
    .line 811
    new-instance v4, Ljava/util/ArrayList;

    .line 812
    .line 813
    const/16 v5, 0xa

    .line 814
    .line 815
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 816
    .line 817
    .line 818
    move-result v6

    .line 819
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 820
    .line 821
    .line 822
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 827
    .line 828
    .line 829
    move-result v5

    .line 830
    if-eqz v5, :cond_36

    .line 831
    .line 832
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    check-cast v5, La/d0t;

    .line 837
    .line 838
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 839
    .line 840
    .line 841
    move-result-object v6

    .line 842
    :cond_16
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    if-eqz v7, :cond_17

    .line 847
    .line 848
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v7

    .line 852
    move-object v8, v7

    .line 853
    check-cast v8, La/lok0;

    .line 854
    .line 855
    iget v8, v8, La/lok0;->a:I

    .line 856
    .line 857
    iget v9, v5, La/d0t;->O:I

    .line 858
    .line 859
    if-ne v8, v9, :cond_16

    .line 860
    .line 861
    goto :goto_10

    .line 862
    :cond_17
    const/4 v7, 0x0

    .line 863
    :goto_10
    check-cast v7, La/lok0;

    .line 864
    .line 865
    iget-boolean v6, v2, La/mj00;->c:Z

    .line 866
    .line 867
    sget-object v8, La/li00;->a:La/ai00;

    .line 868
    .line 869
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    iget-wide v8, v5, La/d0t;->a:J

    .line 873
    .line 874
    iget-object v10, v5, La/d0t;->K:Ljava/util/List;

    .line 875
    .line 876
    new-instance v11, Ljava/util/ArrayList;

    .line 877
    .line 878
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 879
    .line 880
    .line 881
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 882
    .line 883
    .line 884
    move-result-object v12

    .line 885
    :goto_11
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 886
    .line 887
    .line 888
    move-result v13

    .line 889
    if-eqz v13, :cond_22

    .line 890
    .line 891
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v13

    .line 895
    check-cast v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 896
    .line 897
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 898
    .line 899
    .line 900
    move-result-object v15

    .line 901
    move-object/from16 p0, v1

    .line 902
    .line 903
    iget-object v1, v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 904
    .line 905
    move/from16 v16, v6

    .line 906
    .line 907
    new-instance v6, La/wpv;

    .line 908
    .line 909
    move-wide/from16 v23, v8

    .line 910
    .line 911
    const/16 v8, 0x18

    .line 912
    .line 913
    invoke-direct {v6, v8}, La/wpv;-><init>(B)V

    .line 914
    .line 915
    .line 916
    new-instance v8, La/sr0;

    .line 917
    .line 918
    const/4 v9, 0x3

    .line 919
    invoke-direct {v8, v6, v13, v9}, La/sr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 920
    .line 921
    .line 922
    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    new-instance v6, Ljava/util/ArrayList;

    .line 927
    .line 928
    const/16 v8, 0xa

    .line 929
    .line 930
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 935
    .line 936
    .line 937
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 942
    .line 943
    .line 944
    move-result v8

    .line 945
    if-eqz v8, :cond_21

    .line 946
    .line 947
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v8

    .line 951
    check-cast v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 952
    .line 953
    move-object/from16 v26, v10

    .line 954
    .line 955
    iget-wide v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 956
    .line 957
    const-wide/16 v29, 0x0

    .line 958
    .line 959
    cmpg-double v9, v9, v29

    .line 960
    .line 961
    if-nez v9, :cond_19

    .line 962
    .line 963
    :cond_18
    move-object/from16 p1, v1

    .line 964
    .line 965
    goto/16 :goto_1b

    .line 966
    .line 967
    :cond_19
    iget-object v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 968
    .line 969
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 970
    .line 971
    .line 972
    move-result v9

    .line 973
    if-lez v9, :cond_18

    .line 974
    .line 975
    new-instance v29, La/wyc;

    .line 976
    .line 977
    iget-wide v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 978
    .line 979
    move-wide/from16 v30, v9

    .line 980
    .line 981
    iget-wide v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->m:J

    .line 982
    .line 983
    const-wide/16 v32, 0x0

    .line 984
    .line 985
    cmp-long v32, v9, v32

    .line 986
    .line 987
    if-eqz v32, :cond_1a

    .line 988
    .line 989
    move-wide/from16 v32, v9

    .line 990
    .line 991
    goto :goto_13

    .line 992
    :cond_1a
    move-wide/from16 v32, v23

    .line 993
    .line 994
    :goto_13
    iget-object v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->t:Ljava/lang/String;

    .line 995
    .line 996
    const/4 v10, 0x0

    .line 997
    invoke-static {v8, v10}, La/ju70;->M(Lorg/xplatform/betting/core/zip/model/zip/BetZip;Z)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v35

    .line 1001
    iget-boolean v10, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->y:Z

    .line 1002
    .line 1003
    move-object/from16 p1, v1

    .line 1004
    .line 1005
    iget-boolean v1, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 1006
    .line 1007
    move/from16 v37, v1

    .line 1008
    .line 1009
    iget-object v1, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->v:La/izc;

    .line 1010
    .line 1011
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1012
    .line 1013
    .line 1014
    move-result v1

    .line 1015
    if-eqz v1, :cond_1d

    .line 1016
    .line 1017
    move-object/from16 v34, v9

    .line 1018
    .line 1019
    const/4 v9, 0x1

    .line 1020
    if-eq v1, v9, :cond_1c

    .line 1021
    .line 1022
    const/4 v9, 0x2

    .line 1023
    if-ne v1, v9, :cond_1b

    .line 1024
    .line 1025
    sget-object v1, La/vyc;->a:La/vyc;

    .line 1026
    .line 1027
    :goto_14
    move-object/from16 v38, v1

    .line 1028
    .line 1029
    goto :goto_15

    .line 1030
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 1031
    .line 1032
    .line 1033
    const/4 v12, 0x0

    .line 1034
    goto/16 :goto_2f

    .line 1035
    .line 1036
    :cond_1c
    sget-object v1, La/vyc;->c:La/vyc;

    .line 1037
    .line 1038
    goto :goto_14

    .line 1039
    :cond_1d
    move-object/from16 v34, v9

    .line 1040
    .line 1041
    sget-object v1, La/vyc;->b:La/vyc;

    .line 1042
    .line 1043
    goto :goto_14

    .line 1044
    :goto_15
    iget-boolean v1, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->f:Z

    .line 1045
    .line 1046
    if-eqz v1, :cond_1e

    .line 1047
    .line 1048
    const v9, 0x3ee66666    # 0.45f

    .line 1049
    .line 1050
    .line 1051
    :goto_16
    move/from16 v39, v9

    .line 1052
    .line 1053
    goto :goto_17

    .line 1054
    :cond_1e
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1055
    .line 1056
    goto :goto_16

    .line 1057
    :goto_17
    iget-boolean v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->w:Z

    .line 1058
    .line 1059
    if-eqz v9, :cond_1f

    .line 1060
    .line 1061
    const v9, 0x7f08071a

    .line 1062
    .line 1063
    .line 1064
    move/from16 v40, v9

    .line 1065
    .line 1066
    goto :goto_18

    .line 1067
    :cond_1f
    const/16 v40, 0x0

    .line 1068
    .line 1069
    :goto_18
    if-eqz v1, :cond_20

    .line 1070
    .line 1071
    const v1, 0x7f080ab1

    .line 1072
    .line 1073
    .line 1074
    move/from16 v41, v1

    .line 1075
    .line 1076
    :goto_19
    move/from16 v36, v10

    .line 1077
    .line 1078
    goto :goto_1a

    .line 1079
    :cond_20
    const/16 v41, 0x0

    .line 1080
    .line 1081
    goto :goto_19

    .line 1082
    :goto_1a
    iget-wide v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 1083
    .line 1084
    move-wide/from16 v42, v9

    .line 1085
    .line 1086
    iget-wide v9, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 1087
    .line 1088
    move-wide/from16 v44, v9

    .line 1089
    .line 1090
    iget-wide v8, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->c:J

    .line 1091
    .line 1092
    move-wide/from16 v46, v8

    .line 1093
    .line 1094
    invoke-direct/range {v29 .. v47}, La/wyc;-><init>(JJLjava/lang/String;Ljava/lang/String;ZZLa/vyc;FIIDDJ)V

    .line 1095
    .line 1096
    .line 1097
    move-object/from16 v1, v29

    .line 1098
    .line 1099
    new-instance v8, La/r8d;

    .line 1100
    .line 1101
    invoke-direct {v8, v1}, La/r8d;-><init>(La/wyc;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v15, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    :goto_1b
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1108
    .line 1109
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-object/from16 v1, p1

    .line 1113
    .line 1114
    move-object/from16 v10, v26

    .line 1115
    .line 1116
    goto/16 :goto_12

    .line 1117
    .line 1118
    :cond_21
    move-object/from16 v26, v10

    .line 1119
    .line 1120
    invoke-static {v15}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v34

    .line 1124
    new-instance v29, La/ai00;

    .line 1125
    .line 1126
    iget-wide v8, v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 1127
    .line 1128
    iget-object v1, v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->c:Ljava/lang/String;

    .line 1129
    .line 1130
    const/16 v35, 0x0

    .line 1131
    .line 1132
    iget v6, v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->e:I

    .line 1133
    .line 1134
    move-object/from16 v33, v1

    .line 1135
    .line 1136
    move/from16 v30, v6

    .line 1137
    .line 1138
    move-wide/from16 v31, v8

    .line 1139
    .line 1140
    invoke-direct/range {v29 .. v35}, La/ai00;-><init>(IJLjava/lang/String;Ljava/util/List;Z)V

    .line 1141
    .line 1142
    .line 1143
    move-object/from16 v1, v29

    .line 1144
    .line 1145
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-object/from16 v1, p0

    .line 1149
    .line 1150
    move/from16 v6, v16

    .line 1151
    .line 1152
    move-wide/from16 v8, v23

    .line 1153
    .line 1154
    goto/16 :goto_11

    .line 1155
    .line 1156
    :cond_22
    move-object/from16 p0, v1

    .line 1157
    .line 1158
    move/from16 v16, v6

    .line 1159
    .line 1160
    move-wide/from16 v23, v8

    .line 1161
    .line 1162
    move-object/from16 v26, v10

    .line 1163
    .line 1164
    if-nez v16, :cond_24

    .line 1165
    .line 1166
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    if-eqz v1, :cond_23

    .line 1171
    .line 1172
    goto :goto_1c

    .line 1173
    :cond_23
    const/4 v1, 0x0

    .line 1174
    goto :goto_1d

    .line 1175
    :cond_24
    :goto_1c
    const/4 v1, 0x1

    .line 1176
    :goto_1d
    new-instance v6, Ljava/util/ArrayList;

    .line 1177
    .line 1178
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1179
    .line 1180
    .line 1181
    if-eqz v1, :cond_25

    .line 1182
    .line 1183
    sget-object v1, La/li00;->a:La/ai00;

    .line 1184
    .line 1185
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1186
    .line 1187
    .line 1188
    goto :goto_1f

    .line 1189
    :cond_25
    new-instance v6, Ljava/util/ArrayList;

    .line 1190
    .line 1191
    const/16 v8, 0xa

    .line 1192
    .line 1193
    invoke-static {v11, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1194
    .line 1195
    .line 1196
    move-result v1

    .line 1197
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v8

    .line 1208
    if-eqz v8, :cond_26

    .line 1209
    .line 1210
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v8

    .line 1214
    check-cast v8, La/ai00;

    .line 1215
    .line 1216
    new-instance v29, La/ai00;

    .line 1217
    .line 1218
    iget-wide v9, v8, La/ai00;->a:J

    .line 1219
    .line 1220
    iget-object v11, v8, La/ai00;->b:Ljava/lang/String;

    .line 1221
    .line 1222
    iget-boolean v12, v8, La/ai00;->c:Z

    .line 1223
    .line 1224
    iget-object v13, v8, La/ai00;->d:Ljava/util/List;

    .line 1225
    .line 1226
    iget v8, v8, La/ai00;->e:I

    .line 1227
    .line 1228
    move/from16 v30, v8

    .line 1229
    .line 1230
    move-wide/from16 v31, v9

    .line 1231
    .line 1232
    move-object/from16 v33, v11

    .line 1233
    .line 1234
    move/from16 v35, v12

    .line 1235
    .line 1236
    move-object/from16 v34, v13

    .line 1237
    .line 1238
    invoke-direct/range {v29 .. v35}, La/ai00;-><init>(IJLjava/lang/String;Ljava/util/List;Z)V

    .line 1239
    .line 1240
    .line 1241
    move-object/from16 v8, v29

    .line 1242
    .line 1243
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    goto :goto_1e

    .line 1247
    :cond_26
    :goto_1f
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v1

    .line 1251
    check-cast v1, La/ai00;

    .line 1252
    .line 1253
    if-eqz v1, :cond_27

    .line 1254
    .line 1255
    iget v8, v1, La/ai00;->e:I

    .line 1256
    .line 1257
    goto :goto_20

    .line 1258
    :cond_27
    const/4 v8, 0x0

    .line 1259
    :goto_20
    if-eqz v1, :cond_28

    .line 1260
    .line 1261
    iget-object v1, v1, La/ai00;->d:Ljava/util/List;

    .line 1262
    .line 1263
    if-eqz v1, :cond_28

    .line 1264
    .line 1265
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1266
    .line 1267
    .line 1268
    move-result v1

    .line 1269
    goto :goto_21

    .line 1270
    :cond_28
    const/4 v1, 0x0

    .line 1271
    :goto_21
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1272
    .line 1273
    .line 1274
    move-result v6

    .line 1275
    const/4 v9, 0x1

    .line 1276
    if-le v6, v9, :cond_29

    .line 1277
    .line 1278
    const/4 v6, 0x1

    .line 1279
    goto :goto_22

    .line 1280
    :cond_29
    const/4 v6, 0x0

    .line 1281
    :goto_22
    if-le v1, v8, :cond_2a

    .line 1282
    .line 1283
    const/4 v1, 0x1

    .line 1284
    goto :goto_23

    .line 1285
    :cond_2a
    const/4 v1, 0x0

    .line 1286
    :goto_23
    if-nez v6, :cond_2c

    .line 1287
    .line 1288
    if-eqz v1, :cond_2b

    .line 1289
    .line 1290
    goto :goto_24

    .line 1291
    :cond_2b
    const/4 v1, 0x0

    .line 1292
    goto :goto_25

    .line 1293
    :cond_2c
    :goto_24
    const/4 v1, 0x1

    .line 1294
    :goto_25
    iget-object v6, v2, La/mj00;->a:La/wcb;

    .line 1295
    .line 1296
    if-eqz v6, :cond_2e

    .line 1297
    .line 1298
    iget-wide v8, v5, La/d0t;->v:J

    .line 1299
    .line 1300
    iget-wide v10, v5, La/d0t;->u:J

    .line 1301
    .line 1302
    invoke-virtual {v6, v8, v9, v10, v11}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v6

    .line 1306
    if-nez v6, :cond_2d

    .line 1307
    .line 1308
    goto :goto_26

    .line 1309
    :cond_2d
    move-object/from16 v31, v6

    .line 1310
    .line 1311
    goto :goto_27

    .line 1312
    :cond_2e
    :goto_26
    move-object/from16 v31, v14

    .line 1313
    .line 1314
    :goto_27
    new-instance v6, Ljava/util/ArrayList;

    .line 1315
    .line 1316
    const/16 v8, 0xa

    .line 1317
    .line 1318
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1319
    .line 1320
    .line 1321
    move-result v9

    .line 1322
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1323
    .line 1324
    .line 1325
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v8

    .line 1329
    :goto_28
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1330
    .line 1331
    .line 1332
    move-result v9

    .line 1333
    if-eqz v9, :cond_2f

    .line 1334
    .line 1335
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v9

    .line 1339
    check-cast v9, La/lok0;

    .line 1340
    .line 1341
    iget v9, v9, La/lok0;->a:I

    .line 1342
    .line 1343
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v9

    .line 1347
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1348
    .line 1349
    .line 1350
    goto :goto_28

    .line 1351
    :cond_2f
    iget-object v8, v2, La/mj00;->f:La/v5l0;

    .line 1352
    .line 1353
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->isEmpty()Z

    .line 1354
    .line 1355
    .line 1356
    move-result v9

    .line 1357
    if-eqz v9, :cond_30

    .line 1358
    .line 1359
    sget-object v1, La/i5l0;->a:La/i5l0;

    .line 1360
    .line 1361
    :goto_29
    move-object/from16 v38, v1

    .line 1362
    .line 1363
    goto :goto_2a

    .line 1364
    :cond_30
    if-eqz v1, :cond_31

    .line 1365
    .line 1366
    new-instance v1, La/j5l0;

    .line 1367
    .line 1368
    iget-object v9, v0, La/syp;->c:La/n0o0;

    .line 1369
    .line 1370
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v9

    .line 1374
    check-cast v9, La/fee;

    .line 1375
    .line 1376
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v9

    .line 1380
    check-cast v9, Ljava/util/Set;

    .line 1381
    .line 1382
    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v10

    .line 1386
    invoke-interface {v9, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v9

    .line 1390
    const/16 v22, 0x1

    .line 1391
    .line 1392
    xor-int/lit8 v9, v9, 0x1

    .line 1393
    .line 1394
    invoke-direct {v1, v9}, La/j5l0;-><init>(Z)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_29

    .line 1398
    :cond_31
    sget-object v1, La/l5l0;->a:La/l5l0;

    .line 1399
    .line 1400
    goto :goto_29

    .line 1401
    :goto_2a
    iget-boolean v1, v2, La/mj00;->c:Z

    .line 1402
    .line 1403
    iget-boolean v9, v2, La/mj00;->d:Z

    .line 1404
    .line 1405
    if-eqz v7, :cond_32

    .line 1406
    .line 1407
    iget-boolean v10, v7, La/lok0;->p:Z

    .line 1408
    .line 1409
    move/from16 v35, v10

    .line 1410
    .line 1411
    goto :goto_2b

    .line 1412
    :cond_32
    const/16 v35, 0x0

    .line 1413
    .line 1414
    :goto_2b
    if-eqz v7, :cond_33

    .line 1415
    .line 1416
    iget-boolean v10, v7, La/lok0;->n:Z

    .line 1417
    .line 1418
    move/from16 v34, v10

    .line 1419
    .line 1420
    goto :goto_2c

    .line 1421
    :cond_33
    const/16 v34, 0x0

    .line 1422
    .line 1423
    :goto_2c
    if-eqz v7, :cond_34

    .line 1424
    .line 1425
    iget-object v7, v7, La/lok0;->u:Ljava/lang/String;

    .line 1426
    .line 1427
    goto :goto_2d

    .line 1428
    :cond_34
    const/4 v7, 0x0

    .line 1429
    :goto_2d
    if-nez v7, :cond_35

    .line 1430
    .line 1431
    move-object/from16 v39, v14

    .line 1432
    .line 1433
    goto :goto_2e

    .line 1434
    :cond_35
    move-object/from16 v39, v7

    .line 1435
    .line 1436
    :goto_2e
    iget-boolean v7, v2, La/mj00;->g:Z

    .line 1437
    .line 1438
    const/16 v32, 0x0

    .line 1439
    .line 1440
    const/16 v36, 0x0

    .line 1441
    .line 1442
    move/from16 v29, v1

    .line 1443
    .line 1444
    move-object/from16 v26, v5

    .line 1445
    .line 1446
    move-object/from16 v33, v6

    .line 1447
    .line 1448
    move/from16 v40, v7

    .line 1449
    .line 1450
    move-object/from16 v37, v8

    .line 1451
    .line 1452
    move/from16 v30, v9

    .line 1453
    .line 1454
    invoke-static/range {v26 .. v40}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1459
    .line 1460
    .line 1461
    move-object/from16 v1, p0

    .line 1462
    .line 1463
    goto/16 :goto_f

    .line 1464
    .line 1465
    :cond_36
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v12

    .line 1469
    :goto_2f
    return-object v12

    .line 1470
    :pswitch_9
    check-cast v0, La/fe40;

    .line 1471
    .line 1472
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 1473
    .line 1474
    check-cast v15, La/gna0;

    .line 1475
    .line 1476
    move-object/from16 v1, p1

    .line 1477
    .line 1478
    check-cast v1, La/i8z;

    .line 1479
    .line 1480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1481
    .line 1482
    .line 1483
    iget-object v0, v0, La/fe40;->a:La/a4x;

    .line 1484
    .line 1485
    new-instance v2, La/w800;

    .line 1486
    .line 1487
    const/4 v9, 0x3

    .line 1488
    invoke-direct {v2, v9}, La/w800;-><init>(B)V

    .line 1489
    .line 1490
    .line 1491
    invoke-static {v0, v2}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v2

    .line 1495
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1496
    .line 1497
    .line 1498
    move-result v3

    .line 1499
    move v4, v3

    .line 1500
    new-instance v3, La/bgz;

    .line 1501
    .line 1502
    const/16 v5, 0x14

    .line 1503
    .line 1504
    invoke-direct {v3, v2, v5}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1505
    .line 1506
    .line 1507
    new-instance v5, La/bgz;

    .line 1508
    .line 1509
    const/16 v2, 0x15

    .line 1510
    .line 1511
    invoke-direct {v5, v0, v2}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1512
    .line 1513
    .line 1514
    new-instance v2, La/h8w;

    .line 1515
    .line 1516
    const/4 v6, 0x5

    .line 1517
    invoke-direct {v2, v0, v12, v15, v6}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1518
    .line 1519
    .line 1520
    new-instance v6, La/ugd;

    .line 1521
    .line 1522
    const v0, -0x7ca43062

    .line 1523
    .line 1524
    .line 1525
    const/4 v9, 0x1

    .line 1526
    invoke-direct {v6, v0, v9, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1527
    .line 1528
    .line 1529
    move v2, v4

    .line 1530
    const/4 v4, 0x0

    .line 1531
    invoke-virtual/range {v1 .. v6}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 1532
    .line 1533
    .line 1534
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1535
    .line 1536
    return-object v0

    .line 1537
    :pswitch_a
    move-object v3, v0

    .line 1538
    check-cast v3, La/frz;

    .line 1539
    .line 1540
    move-object v4, v12

    .line 1541
    check-cast v4, La/hh80;

    .line 1542
    .line 1543
    move-object v5, v15

    .line 1544
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1545
    .line 1546
    move-object/from16 v0, p1

    .line 1547
    .line 1548
    check-cast v0, La/hcz;

    .line 1549
    .line 1550
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1551
    .line 1552
    .line 1553
    iget-object v2, v3, La/frz;->a:La/a4x;

    .line 1554
    .line 1555
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1556
    .line 1557
    .line 1558
    move-result v7

    .line 1559
    new-instance v8, La/bgz;

    .line 1560
    .line 1561
    const/16 v1, 0x8

    .line 1562
    .line 1563
    invoke-direct {v8, v2, v1}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1564
    .line 1565
    .line 1566
    new-instance v1, La/gq4;

    .line 1567
    .line 1568
    const/4 v6, 0x6

    .line 1569
    invoke-direct/range {v1 .. v6}, La/gq4;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1570
    .line 1571
    .line 1572
    new-instance v2, La/ugd;

    .line 1573
    .line 1574
    const v3, 0x799532c4

    .line 1575
    .line 1576
    .line 1577
    const/4 v9, 0x1

    .line 1578
    invoke-direct {v2, v3, v9, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1579
    .line 1580
    .line 1581
    const/4 v1, 0x0

    .line 1582
    invoke-virtual {v0, v7, v1, v8, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1583
    .line 1584
    .line 1585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1586
    .line 1587
    return-object v0

    .line 1588
    :pswitch_b
    const/4 v1, 0x0

    .line 1589
    move-object v4, v0

    .line 1590
    check-cast v4, La/kqz;

    .line 1591
    .line 1592
    move-object v5, v12

    .line 1593
    check-cast v5, La/hh80;

    .line 1594
    .line 1595
    move-object v6, v15

    .line 1596
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1597
    .line 1598
    move-object/from16 v0, p1

    .line 1599
    .line 1600
    check-cast v0, La/hcz;

    .line 1601
    .line 1602
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1603
    .line 1604
    .line 1605
    sget-object v2, La/y0x0;->d:La/ugd;

    .line 1606
    .line 1607
    const/4 v9, 0x3

    .line 1608
    invoke-static {v0, v1, v1, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1609
    .line 1610
    .line 1611
    iget-object v3, v4, La/kqz;->a:La/a4x;

    .line 1612
    .line 1613
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1614
    .line 1615
    .line 1616
    move-result v8

    .line 1617
    new-instance v9, La/bgz;

    .line 1618
    .line 1619
    const/4 v2, 0x7

    .line 1620
    invoke-direct {v9, v3, v2}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1621
    .line 1622
    .line 1623
    new-instance v2, La/gq4;

    .line 1624
    .line 1625
    const/4 v7, 0x5

    .line 1626
    invoke-direct/range {v2 .. v7}, La/gq4;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1627
    .line 1628
    .line 1629
    new-instance v3, La/ugd;

    .line 1630
    .line 1631
    const v4, 0x799532c4

    .line 1632
    .line 1633
    .line 1634
    const/4 v6, 0x1

    .line 1635
    invoke-direct {v3, v4, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual {v0, v8, v1, v9, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1639
    .line 1640
    .line 1641
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1642
    .line 1643
    return-object v0

    .line 1644
    :pswitch_c
    const/4 v1, 0x0

    .line 1645
    move-object v4, v0

    .line 1646
    check-cast v4, La/ppz;

    .line 1647
    .line 1648
    move-object v5, v12

    .line 1649
    check-cast v5, La/hh80;

    .line 1650
    .line 1651
    move-object v6, v15

    .line 1652
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1653
    .line 1654
    move-object/from16 v0, p1

    .line 1655
    .line 1656
    check-cast v0, La/hcz;

    .line 1657
    .line 1658
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1659
    .line 1660
    .line 1661
    sget-object v2, La/m0x0;->f:La/ugd;

    .line 1662
    .line 1663
    const/4 v9, 0x3

    .line 1664
    invoke-static {v0, v1, v1, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1665
    .line 1666
    .line 1667
    iget-object v3, v4, La/ppz;->a:La/a4x;

    .line 1668
    .line 1669
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1670
    .line 1671
    .line 1672
    move-result v8

    .line 1673
    new-instance v9, La/bgz;

    .line 1674
    .line 1675
    const/4 v2, 0x6

    .line 1676
    invoke-direct {v9, v3, v2}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1677
    .line 1678
    .line 1679
    new-instance v2, La/gq4;

    .line 1680
    .line 1681
    const/4 v7, 0x4

    .line 1682
    invoke-direct/range {v2 .. v7}, La/gq4;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1683
    .line 1684
    .line 1685
    new-instance v3, La/ugd;

    .line 1686
    .line 1687
    const v4, 0x799532c4

    .line 1688
    .line 1689
    .line 1690
    const/4 v6, 0x1

    .line 1691
    invoke-direct {v3, v4, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v0, v8, v1, v9, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1695
    .line 1696
    .line 1697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1698
    .line 1699
    return-object v0

    .line 1700
    :pswitch_d
    const/4 v1, 0x0

    .line 1701
    move-object v4, v0

    .line 1702
    check-cast v4, La/voz;

    .line 1703
    .line 1704
    move-object v5, v12

    .line 1705
    check-cast v5, La/hh80;

    .line 1706
    .line 1707
    move-object v6, v15

    .line 1708
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1709
    .line 1710
    move-object/from16 v0, p1

    .line 1711
    .line 1712
    check-cast v0, La/hcz;

    .line 1713
    .line 1714
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1715
    .line 1716
    .line 1717
    sget-object v2, La/nnw0;->g:La/ugd;

    .line 1718
    .line 1719
    const/4 v9, 0x3

    .line 1720
    invoke-static {v0, v1, v1, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1721
    .line 1722
    .line 1723
    iget-object v3, v4, La/voz;->a:La/a4x;

    .line 1724
    .line 1725
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1726
    .line 1727
    .line 1728
    move-result v8

    .line 1729
    new-instance v9, La/bgz;

    .line 1730
    .line 1731
    const/4 v2, 0x5

    .line 1732
    invoke-direct {v9, v3, v2}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1733
    .line 1734
    .line 1735
    new-instance v2, La/gq4;

    .line 1736
    .line 1737
    const/4 v7, 0x3

    .line 1738
    invoke-direct/range {v2 .. v7}, La/gq4;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1739
    .line 1740
    .line 1741
    new-instance v3, La/ugd;

    .line 1742
    .line 1743
    const v4, 0x799532c4

    .line 1744
    .line 1745
    .line 1746
    const/4 v6, 0x1

    .line 1747
    invoke-direct {v3, v4, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v0, v8, v1, v9, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1751
    .line 1752
    .line 1753
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1754
    .line 1755
    return-object v0

    .line 1756
    :pswitch_e
    const/4 v6, 0x1

    .line 1757
    check-cast v0, La/clz;

    .line 1758
    .line 1759
    check-cast v12, La/nlz;

    .line 1760
    .line 1761
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 1762
    .line 1763
    move-object/from16 v1, p1

    .line 1764
    .line 1765
    check-cast v1, La/lwk;

    .line 1766
    .line 1767
    new-instance v1, La/mie0;

    .line 1768
    .line 1769
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1770
    .line 1771
    .line 1772
    new-instance v2, La/wb3;

    .line 1773
    .line 1774
    invoke-direct {v2, v12, v1, v15, v6}, La/wb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1775
    .line 1776
    .line 1777
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v3

    .line 1781
    invoke-virtual {v3, v2}, La/glz;->a(La/blz;)V

    .line 1782
    .line 1783
    .line 1784
    new-instance v3, La/u43;

    .line 1785
    .line 1786
    const/4 v9, 0x3

    .line 1787
    invoke-direct {v3, v0, v2, v1, v9}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1788
    .line 1789
    .line 1790
    return-object v3

    .line 1791
    :pswitch_f
    check-cast v0, La/clz;

    .line 1792
    .line 1793
    check-cast v12, La/ilz;

    .line 1794
    .line 1795
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 1796
    .line 1797
    move-object/from16 v1, p1

    .line 1798
    .line 1799
    check-cast v1, La/lwk;

    .line 1800
    .line 1801
    new-instance v1, La/mie0;

    .line 1802
    .line 1803
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1804
    .line 1805
    .line 1806
    new-instance v2, La/wb3;

    .line 1807
    .line 1808
    const/4 v9, 0x2

    .line 1809
    invoke-direct {v2, v12, v1, v15, v9}, La/wb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1810
    .line 1811
    .line 1812
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v3

    .line 1816
    invoke-virtual {v3, v2}, La/glz;->a(La/blz;)V

    .line 1817
    .line 1818
    .line 1819
    new-instance v3, La/u43;

    .line 1820
    .line 1821
    invoke-direct {v3, v0, v2, v1, v9}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1822
    .line 1823
    .line 1824
    return-object v3

    .line 1825
    :pswitch_10
    check-cast v0, La/clz;

    .line 1826
    .line 1827
    check-cast v12, La/kkz;

    .line 1828
    .line 1829
    check-cast v15, La/pz40;

    .line 1830
    .line 1831
    move-object/from16 v1, p1

    .line 1832
    .line 1833
    check-cast v1, La/lwk;

    .line 1834
    .line 1835
    new-instance v1, La/sfd;

    .line 1836
    .line 1837
    const/4 v6, 0x1

    .line 1838
    invoke-direct {v1, v12, v15, v6}, La/sfd;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1839
    .line 1840
    .line 1841
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v2

    .line 1845
    invoke-virtual {v2, v1}, La/glz;->a(La/blz;)V

    .line 1846
    .line 1847
    .line 1848
    new-instance v2, La/pr0;

    .line 1849
    .line 1850
    const/16 v3, 0xe

    .line 1851
    .line 1852
    invoke-direct {v2, v0, v1, v3}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1853
    .line 1854
    .line 1855
    return-object v2

    .line 1856
    :pswitch_11
    check-cast v0, La/rrd;

    .line 1857
    .line 1858
    check-cast v12, La/j4a;

    .line 1859
    .line 1860
    check-cast v15, Landroid/content/Context;

    .line 1861
    .line 1862
    move-object/from16 v1, p1

    .line 1863
    .line 1864
    check-cast v1, Ljava/lang/Void;

    .line 1865
    .line 1866
    invoke-static {v15}, La/uje;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v2

    .line 1870
    invoke-virtual {v0, v12, v2}, La/rrd;->u(La/j4a;Landroid/content/Context;)V

    .line 1871
    .line 1872
    .line 1873
    return-object v1

    .line 1874
    :pswitch_12
    move-object v1, v0

    .line 1875
    check-cast v1, La/g7z;

    .line 1876
    .line 1877
    iget-object v2, v1, La/g7z;->a:La/a6a;

    .line 1878
    .line 1879
    check-cast v12, La/ehl;

    .line 1880
    .line 1881
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 1882
    .line 1883
    move-object/from16 v0, p1

    .line 1884
    .line 1885
    check-cast v0, La/fhl;

    .line 1886
    .line 1887
    iget-object v3, v1, La/g7z;->b:La/ehl;

    .line 1888
    .line 1889
    iput-object v12, v1, La/g7z;->b:La/ehl;

    .line 1890
    .line 1891
    :try_start_0
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v4

    .line 1895
    invoke-virtual {v4}, La/nr;->j()La/w6k;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v4

    .line 1899
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v5

    .line 1903
    invoke-virtual {v5}, La/nr;->o()La/k6z;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v5

    .line 1907
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v6

    .line 1911
    invoke-virtual {v6}, La/nr;->i()La/x5a;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v6

    .line 1915
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v7

    .line 1919
    invoke-virtual {v7}, La/nr;->p()J

    .line 1920
    .line 1921
    .line 1922
    move-result-wide v7

    .line 1923
    invoke-interface {v0}, La/fhl;->A0()La/nr;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    iget-object v0, v0, La/nr;->c:Ljava/lang/Object;

    .line 1928
    .line 1929
    check-cast v0, La/dfv;

    .line 1930
    .line 1931
    iget-object v9, v2, La/a6a;->b:La/nr;

    .line 1932
    .line 1933
    invoke-virtual {v9}, La/nr;->j()La/w6k;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v9

    .line 1937
    iget-object v10, v2, La/a6a;->b:La/nr;

    .line 1938
    .line 1939
    invoke-virtual {v10}, La/nr;->o()La/k6z;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v10

    .line 1943
    iget-object v11, v2, La/a6a;->b:La/nr;

    .line 1944
    .line 1945
    invoke-virtual {v11}, La/nr;->i()La/x5a;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v11

    .line 1949
    iget-object v12, v2, La/a6a;->b:La/nr;

    .line 1950
    .line 1951
    invoke-virtual {v12}, La/nr;->p()J

    .line 1952
    .line 1953
    .line 1954
    move-result-wide v12

    .line 1955
    iget-object v14, v2, La/a6a;->b:La/nr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 1956
    .line 1957
    move-object/from16 v16, v3

    .line 1958
    .line 1959
    :try_start_1
    iget-object v3, v14, La/nr;->c:Ljava/lang/Object;

    .line 1960
    .line 1961
    check-cast v3, La/dfv;

    .line 1962
    .line 1963
    invoke-virtual {v14, v4}, La/nr;->F(La/w6k;)V

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v14, v5}, La/nr;->G(La/k6z;)V

    .line 1967
    .line 1968
    .line 1969
    invoke-virtual {v14, v6}, La/nr;->E(La/x5a;)V

    .line 1970
    .line 1971
    .line 1972
    invoke-virtual {v14, v7, v8}, La/nr;->H(J)V

    .line 1973
    .line 1974
    .line 1975
    iput-object v0, v14, La/nr;->c:Ljava/lang/Object;

    .line 1976
    .line 1977
    invoke-interface {v6}, La/x5a;->l()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1978
    .line 1979
    .line 1980
    :try_start_2
    invoke-interface {v15, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1981
    .line 1982
    .line 1983
    :try_start_3
    invoke-interface {v6}, La/x5a;->i()V

    .line 1984
    .line 1985
    .line 1986
    iget-object v0, v2, La/a6a;->b:La/nr;

    .line 1987
    .line 1988
    invoke-virtual {v0, v9}, La/nr;->F(La/w6k;)V

    .line 1989
    .line 1990
    .line 1991
    invoke-virtual {v0, v10}, La/nr;->G(La/k6z;)V

    .line 1992
    .line 1993
    .line 1994
    invoke-virtual {v0, v11}, La/nr;->E(La/x5a;)V

    .line 1995
    .line 1996
    .line 1997
    invoke-virtual {v0, v12, v13}, La/nr;->H(J)V

    .line 1998
    .line 1999
    .line 2000
    iput-object v3, v0, La/nr;->c:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2001
    .line 2002
    move-object/from16 v4, v16

    .line 2003
    .line 2004
    iput-object v4, v1, La/g7z;->b:La/ehl;

    .line 2005
    .line 2006
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2007
    .line 2008
    return-object v0

    .line 2009
    :catchall_0
    move-exception v0

    .line 2010
    move-object/from16 v4, v16

    .line 2011
    .line 2012
    goto :goto_30

    .line 2013
    :catchall_1
    move-exception v0

    .line 2014
    move-object/from16 v4, v16

    .line 2015
    .line 2016
    :try_start_4
    invoke-interface {v6}, La/x5a;->i()V

    .line 2017
    .line 2018
    .line 2019
    iget-object v2, v2, La/a6a;->b:La/nr;

    .line 2020
    .line 2021
    invoke-virtual {v2, v9}, La/nr;->F(La/w6k;)V

    .line 2022
    .line 2023
    .line 2024
    invoke-virtual {v2, v10}, La/nr;->G(La/k6z;)V

    .line 2025
    .line 2026
    .line 2027
    invoke-virtual {v2, v11}, La/nr;->E(La/x5a;)V

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v2, v12, v13}, La/nr;->H(J)V

    .line 2031
    .line 2032
    .line 2033
    iput-object v3, v2, La/nr;->c:Ljava/lang/Object;

    .line 2034
    .line 2035
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 2036
    :catchall_2
    move-exception v0

    .line 2037
    goto :goto_30

    .line 2038
    :catchall_3
    move-exception v0

    .line 2039
    move-object v4, v3

    .line 2040
    :goto_30
    iput-object v4, v1, La/g7z;->b:La/ehl;

    .line 2041
    .line 2042
    throw v0

    .line 2043
    :pswitch_13
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;

    .line 2044
    .line 2045
    check-cast v12, La/n0x;

    .line 2046
    .line 2047
    check-cast v15, La/n0x;

    .line 2048
    .line 2049
    move-object/from16 v1, p1

    .line 2050
    .line 2051
    check-cast v1, Ljava/lang/Throwable;

    .line 2052
    .line 2053
    invoke-static {v0, v12, v15}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->a(Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;La/n0x;La/n0x;)V

    .line 2054
    .line 2055
    .line 2056
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2057
    .line 2058
    return-object v0

    .line 2059
    :pswitch_14
    check-cast v12, La/l7m0;

    .line 2060
    .line 2061
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2062
    .line 2063
    check-cast v15, La/ugd;

    .line 2064
    .line 2065
    move-object/from16 v1, p1

    .line 2066
    .line 2067
    check-cast v1, La/hcz;

    .line 2068
    .line 2069
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2070
    .line 2071
    .line 2072
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v2

    .line 2076
    check-cast v2, Ljava/util/List;

    .line 2077
    .line 2078
    new-instance v3, La/djx;

    .line 2079
    .line 2080
    const/4 v4, 0x7

    .line 2081
    invoke-direct {v3, v4}, La/djx;-><init>(B)V

    .line 2082
    .line 2083
    .line 2084
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2085
    .line 2086
    .line 2087
    move-result v4

    .line 2088
    if-eqz v0, :cond_37

    .line 2089
    .line 2090
    new-instance v12, La/d2p;

    .line 2091
    .line 2092
    const/16 v5, 0x1c

    .line 2093
    .line 2094
    invoke-direct {v12, v0, v2, v5}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2095
    .line 2096
    .line 2097
    goto :goto_31

    .line 2098
    :cond_37
    const/4 v12, 0x0

    .line 2099
    :goto_31
    new-instance v0, La/d2p;

    .line 2100
    .line 2101
    const/16 v5, 0x1d

    .line 2102
    .line 2103
    invoke-direct {v0, v3, v2, v5}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2104
    .line 2105
    .line 2106
    new-instance v3, La/c9m;

    .line 2107
    .line 2108
    const/4 v6, 0x1

    .line 2109
    invoke-direct {v3, v2, v15, v6}, La/c9m;-><init>(Ljava/util/List;La/ugd;B)V

    .line 2110
    .line 2111
    .line 2112
    new-instance v2, La/ugd;

    .line 2113
    .line 2114
    const v5, 0x2fd4df92

    .line 2115
    .line 2116
    .line 2117
    invoke-direct {v2, v5, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2118
    .line 2119
    .line 2120
    invoke-virtual {v1, v4, v12, v0, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2121
    .line 2122
    .line 2123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2124
    .line 2125
    return-object v0

    .line 2126
    :pswitch_15
    check-cast v0, La/cp;

    .line 2127
    .line 2128
    check-cast v12, La/x6f;

    .line 2129
    .line 2130
    check-cast v15, La/x6f;

    .line 2131
    .line 2132
    move-object/from16 v1, p1

    .line 2133
    .line 2134
    check-cast v1, Ljava/util/List;

    .line 2135
    .line 2136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2137
    .line 2138
    .line 2139
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 2140
    .line 2141
    check-cast v1, La/vjd;

    .line 2142
    .line 2143
    iget-object v1, v1, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 2144
    .line 2145
    new-instance v2, La/hpr;

    .line 2146
    .line 2147
    const/16 v3, 0xf

    .line 2148
    .line 2149
    invoke-direct {v2, v0, v12, v15, v3}, La/hpr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2150
    .line 2151
    .line 2152
    new-instance v0, La/ugd;

    .line 2153
    .line 2154
    const v3, 0xeae9934

    .line 2155
    .line 2156
    .line 2157
    const/4 v6, 0x1

    .line 2158
    invoke-direct {v0, v3, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2159
    .line 2160
    .line 2161
    invoke-virtual {v1, v0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 2162
    .line 2163
    .line 2164
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2165
    .line 2166
    return-object v0

    .line 2167
    :pswitch_16
    check-cast v12, La/l7m0;

    .line 2168
    .line 2169
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2170
    .line 2171
    check-cast v15, La/l7m0;

    .line 2172
    .line 2173
    move-object/from16 v1, p1

    .line 2174
    .line 2175
    check-cast v1, La/hcz;

    .line 2176
    .line 2177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2178
    .line 2179
    .line 2180
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v2

    .line 2184
    check-cast v2, La/l7m0;

    .line 2185
    .line 2186
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v2

    .line 2190
    check-cast v2, Ljava/util/List;

    .line 2191
    .line 2192
    new-instance v3, La/h7w;

    .line 2193
    .line 2194
    const/16 v4, 0x17

    .line 2195
    .line 2196
    invoke-direct {v3, v4}, La/h7w;-><init>(B)V

    .line 2197
    .line 2198
    .line 2199
    new-instance v4, La/h7w;

    .line 2200
    .line 2201
    const/16 v8, 0x18

    .line 2202
    .line 2203
    invoke-direct {v4, v8}, La/h7w;-><init>(B)V

    .line 2204
    .line 2205
    .line 2206
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2207
    .line 2208
    .line 2209
    move-result v5

    .line 2210
    new-instance v6, La/d2p;

    .line 2211
    .line 2212
    invoke-direct {v6, v3, v2, v8}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2213
    .line 2214
    .line 2215
    new-instance v3, La/d2p;

    .line 2216
    .line 2217
    invoke-direct {v3, v4, v2, v13}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2218
    .line 2219
    .line 2220
    new-instance v4, La/h8w;

    .line 2221
    .line 2222
    const/4 v9, 0x3

    .line 2223
    invoke-direct {v4, v2, v0, v15, v9}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2224
    .line 2225
    .line 2226
    new-instance v0, La/ugd;

    .line 2227
    .line 2228
    const v2, 0x2fd4df92

    .line 2229
    .line 2230
    .line 2231
    const/4 v9, 0x1

    .line 2232
    invoke-direct {v0, v2, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v1, v5, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2236
    .line 2237
    .line 2238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2239
    .line 2240
    return-object v0

    .line 2241
    :pswitch_17
    check-cast v0, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 2242
    .line 2243
    check-cast v12, La/ctf0;

    .line 2244
    .line 2245
    move-object/from16 v26, v15

    .line 2246
    .line 2247
    check-cast v26, La/ocl;

    .line 2248
    .line 2249
    move-object/from16 v1, p1

    .line 2250
    .line 2251
    check-cast v1, La/gnw;

    .line 2252
    .line 2253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2254
    .line 2255
    .line 2256
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2257
    .line 2258
    .line 2259
    iget-object v2, v1, La/gnw;->g:La/nc5;

    .line 2260
    .line 2261
    invoke-static {v2}, La/ydx;->c0(La/nc5;)La/j9m0;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v2

    .line 2265
    iget-object v3, v1, La/gnw;->f:La/wmw;

    .line 2266
    .line 2267
    iget-object v4, v3, La/wmw;->b:La/hmw;

    .line 2268
    .line 2269
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 2270
    .line 2271
    .line 2272
    move-result v4

    .line 2273
    if-eqz v4, :cond_3b

    .line 2274
    .line 2275
    const/4 v6, 0x1

    .line 2276
    if-eq v4, v6, :cond_3a

    .line 2277
    .line 2278
    const/4 v9, 0x2

    .line 2279
    if-eq v4, v9, :cond_39

    .line 2280
    .line 2281
    const/4 v9, 0x3

    .line 2282
    if-ne v4, v9, :cond_38

    .line 2283
    .line 2284
    goto :goto_32

    .line 2285
    :cond_38
    invoke-static {}, La/t9f;->b()V

    .line 2286
    .line 2287
    .line 2288
    const/4 v12, 0x0

    .line 2289
    goto/16 :goto_34

    .line 2290
    .line 2291
    :cond_39
    const/4 v10, 0x0

    .line 2292
    new-array v4, v10, [Ljava/lang/Object;

    .line 2293
    .line 2294
    iget-object v5, v12, La/ctf0;->b:La/lsm0;

    .line 2295
    .line 2296
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v4

    .line 2300
    const v6, 0x7f13139b

    .line 2301
    .line 2302
    .line 2303
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v14

    .line 2307
    goto :goto_32

    .line 2308
    :cond_3a
    const/4 v10, 0x0

    .line 2309
    new-array v4, v10, [Ljava/lang/Object;

    .line 2310
    .line 2311
    const v5, 0x7f13182a

    .line 2312
    .line 2313
    .line 2314
    invoke-virtual {v12, v5, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v14

    .line 2318
    goto :goto_32

    .line 2319
    :cond_3b
    const/4 v10, 0x0

    .line 2320
    new-array v4, v10, [Ljava/lang/Object;

    .line 2321
    .line 2322
    iget-object v5, v12, La/ctf0;->b:La/lsm0;

    .line 2323
    .line 2324
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v4

    .line 2328
    const v6, 0x7f130c99

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v14

    .line 2335
    :goto_32
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 2336
    .line 2337
    .line 2338
    move-result v4

    .line 2339
    if-nez v4, :cond_3c

    .line 2340
    .line 2341
    iget-object v14, v0, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;->d:Ljava/lang/String;

    .line 2342
    .line 2343
    :cond_3c
    iget-object v4, v3, La/wmw;->a:Ljava/lang/String;

    .line 2344
    .line 2345
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 2346
    .line 2347
    .line 2348
    move-result v5

    .line 2349
    if-nez v5, :cond_3d

    .line 2350
    .line 2351
    iget-object v4, v0, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;->c:Ljava/lang/String;

    .line 2352
    .line 2353
    :cond_3d
    const/4 v10, 0x0

    .line 2354
    new-array v5, v10, [Ljava/lang/Object;

    .line 2355
    .line 2356
    iget-object v6, v12, La/ctf0;->b:La/lsm0;

    .line 2357
    .line 2358
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v5

    .line 2362
    const v7, 0x7f13139c

    .line 2363
    .line 2364
    .line 2365
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2366
    .line 2367
    .line 2368
    move-result-object v5

    .line 2369
    const-string v7, " "

    .line 2370
    .line 2371
    invoke-static {v5, v7, v14}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v5

    .line 2375
    new-array v8, v10, [Ljava/lang/Object;

    .line 2376
    .line 2377
    invoke-static {v8, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2378
    .line 2379
    .line 2380
    move-result-object v8

    .line 2381
    const v9, 0x7f131397

    .line 2382
    .line 2383
    .line 2384
    invoke-virtual {v6, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v8

    .line 2388
    iget-object v9, v3, La/wmw;->c:Ljava/lang/String;

    .line 2389
    .line 2390
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 2391
    .line 2392
    .line 2393
    move-result v10

    .line 2394
    if-nez v10, :cond_3e

    .line 2395
    .line 2396
    iget-object v9, v0, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;->e:Ljava/lang/String;

    .line 2397
    .line 2398
    :cond_3e
    new-instance v10, Ljava/lang/StringBuilder;

    .line 2399
    .line 2400
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2401
    .line 2402
    .line 2403
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2407
    .line 2408
    .line 2409
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v8

    .line 2413
    const/4 v10, 0x0

    .line 2414
    new-array v9, v10, [Ljava/lang/Object;

    .line 2415
    .line 2416
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2417
    .line 2418
    .line 2419
    move-result-object v9

    .line 2420
    const v10, 0x7f131399

    .line 2421
    .line 2422
    .line 2423
    invoke-virtual {v6, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v6

    .line 2427
    iget-object v3, v3, La/wmw;->d:Ljava/lang/String;

    .line 2428
    .line 2429
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 2430
    .line 2431
    .line 2432
    move-result v9

    .line 2433
    if-nez v9, :cond_3f

    .line 2434
    .line 2435
    iget-object v3, v0, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;->f:Ljava/lang/String;

    .line 2436
    .line 2437
    :cond_3f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2438
    .line 2439
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2440
    .line 2441
    .line 2442
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2443
    .line 2444
    .line 2445
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2446
    .line 2447
    .line 2448
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v0

    .line 2452
    new-instance v3, La/xmw;

    .line 2453
    .line 2454
    invoke-direct {v3, v4, v5, v8, v0}, La/xmw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2455
    .line 2456
    .line 2457
    iget-boolean v0, v1, La/gnw;->a:Z

    .line 2458
    .line 2459
    if-eqz v0, :cond_40

    .line 2460
    .line 2461
    new-instance v12, La/nnw;

    .line 2462
    .line 2463
    invoke-direct {v12, v3, v2}, La/nnw;-><init>(La/xmw;La/j9m0;)V

    .line 2464
    .line 2465
    .line 2466
    goto/16 :goto_34

    .line 2467
    .line 2468
    :cond_40
    iget-boolean v0, v1, La/gnw;->c:Z

    .line 2469
    .line 2470
    if-eqz v0, :cond_41

    .line 2471
    .line 2472
    new-instance v12, La/lnw;

    .line 2473
    .line 2474
    sget-object v27, La/pb10;->g:La/pb10;

    .line 2475
    .line 2476
    const-wide/16 v35, 0x0

    .line 2477
    .line 2478
    const/16 v37, 0x3de

    .line 2479
    .line 2480
    const/16 v28, 0x0

    .line 2481
    .line 2482
    const/16 v29, 0x0

    .line 2483
    .line 2484
    const/16 v30, 0x0

    .line 2485
    .line 2486
    const v31, 0x7f130674

    .line 2487
    .line 2488
    .line 2489
    const/16 v32, 0x0

    .line 2490
    .line 2491
    const-wide/16 v33, 0x0

    .line 2492
    .line 2493
    invoke-static/range {v26 .. v37}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 2494
    .line 2495
    .line 2496
    move-result-object v0

    .line 2497
    invoke-direct {v12, v0, v3, v2}, La/lnw;-><init>(La/mdm;La/xmw;La/j9m0;)V

    .line 2498
    .line 2499
    .line 2500
    goto :goto_34

    .line 2501
    :cond_41
    iget-boolean v0, v1, La/gnw;->b:Z

    .line 2502
    .line 2503
    if-eqz v0, :cond_42

    .line 2504
    .line 2505
    new-instance v12, La/mnw;

    .line 2506
    .line 2507
    sget-object v27, La/pb10;->g:La/pb10;

    .line 2508
    .line 2509
    const-wide/16 v35, 0x0

    .line 2510
    .line 2511
    const/16 v37, 0x25e

    .line 2512
    .line 2513
    const/16 v28, 0x0

    .line 2514
    .line 2515
    const/16 v29, 0x0

    .line 2516
    .line 2517
    const/16 v30, 0x0

    .line 2518
    .line 2519
    const v31, 0x7f130677

    .line 2520
    .line 2521
    .line 2522
    const v32, 0x7f131690

    .line 2523
    .line 2524
    .line 2525
    const-wide/16 v33, 0x2710

    .line 2526
    .line 2527
    invoke-static/range {v26 .. v37}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v0

    .line 2531
    invoke-direct {v12, v0, v3, v2}, La/mnw;-><init>(La/mdm;La/xmw;La/j9m0;)V

    .line 2532
    .line 2533
    .line 2534
    goto :goto_34

    .line 2535
    :cond_42
    iget-object v0, v1, La/gnw;->e:Ljava/util/List;

    .line 2536
    .line 2537
    new-instance v1, Ljava/util/ArrayList;

    .line 2538
    .line 2539
    const/16 v8, 0xa

    .line 2540
    .line 2541
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2542
    .line 2543
    .line 2544
    move-result v4

    .line 2545
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2546
    .line 2547
    .line 2548
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v0

    .line 2552
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2553
    .line 2554
    .line 2555
    move-result v4

    .line 2556
    if-eqz v4, :cond_43

    .line 2557
    .line 2558
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v4

    .line 2562
    check-cast v4, La/ymw;

    .line 2563
    .line 2564
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2565
    .line 2566
    .line 2567
    new-instance v5, La/zmw;

    .line 2568
    .line 2569
    iget-object v6, v4, La/ymw;->a:Ljava/lang/String;

    .line 2570
    .line 2571
    iget-object v4, v4, La/ymw;->b:La/jnw;

    .line 2572
    .line 2573
    invoke-direct {v5, v6, v4}, La/zmw;-><init>(Ljava/lang/String;La/jnw;)V

    .line 2574
    .line 2575
    .line 2576
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2577
    .line 2578
    .line 2579
    goto :goto_33

    .line 2580
    :cond_43
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v0

    .line 2584
    new-instance v12, La/knw;

    .line 2585
    .line 2586
    invoke-direct {v12, v0, v3, v2}, La/knw;-><init>(La/a4x;La/xmw;La/j9m0;)V

    .line 2587
    .line 2588
    .line 2589
    :goto_34
    return-object v12

    .line 2590
    :pswitch_18
    move-object v1, v0

    .line 2591
    check-cast v1, La/ukw;

    .line 2592
    .line 2593
    move-object v2, v12

    .line 2594
    check-cast v2, La/npn;

    .line 2595
    .line 2596
    move-object v3, v15

    .line 2597
    check-cast v3, La/xah;

    .line 2598
    .line 2599
    move-object/from16 v6, p1

    .line 2600
    .line 2601
    check-cast v6, La/k0w0;

    .line 2602
    .line 2603
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2604
    .line 2605
    .line 2606
    new-instance v0, La/xg0;

    .line 2607
    .line 2608
    const/4 v4, 0x0

    .line 2609
    const/16 v5, 0xd

    .line 2610
    .line 2611
    invoke-direct/range {v0 .. v5}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2612
    .line 2613
    .line 2614
    new-instance v1, La/b1w0;

    .line 2615
    .line 2616
    invoke-direct {v1, v0}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 2617
    .line 2618
    .line 2619
    invoke-virtual {v6, v1}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 2620
    .line 2621
    .line 2622
    move-result-object v0

    .line 2623
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 2624
    .line 2625
    check-cast v0, La/c8d;

    .line 2626
    .line 2627
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 2628
    .line 2629
    new-instance v2, La/v7d;

    .line 2630
    .line 2631
    const/4 v6, 0x1

    .line 2632
    invoke-direct {v2, v6, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 2633
    .line 2634
    .line 2635
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 2636
    .line 2637
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2638
    .line 2639
    return-object v0

    .line 2640
    :pswitch_19
    check-cast v0, La/idw;

    .line 2641
    .line 2642
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 2643
    .line 2644
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 2645
    .line 2646
    move-object/from16 v1, p1

    .line 2647
    .line 2648
    check-cast v1, La/hcz;

    .line 2649
    .line 2650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2651
    .line 2652
    .line 2653
    iget-object v0, v0, La/idw;->d:Ljava/util/List;

    .line 2654
    .line 2655
    new-instance v2, La/x2w;

    .line 2656
    .line 2657
    const/16 v8, 0xa

    .line 2658
    .line 2659
    invoke-direct {v2, v8}, La/x2w;-><init>(B)V

    .line 2660
    .line 2661
    .line 2662
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2663
    .line 2664
    .line 2665
    move-result v3

    .line 2666
    new-instance v4, La/d2p;

    .line 2667
    .line 2668
    const/16 v5, 0x15

    .line 2669
    .line 2670
    invoke-direct {v4, v2, v0, v5}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2671
    .line 2672
    .line 2673
    new-instance v2, La/far;

    .line 2674
    .line 2675
    const/16 v5, 0x12

    .line 2676
    .line 2677
    invoke-direct {v2, v0, v5}, La/far;-><init>(Ljava/util/List;B)V

    .line 2678
    .line 2679
    .line 2680
    new-instance v5, La/h8w;

    .line 2681
    .line 2682
    const/4 v6, 0x1

    .line 2683
    invoke-direct {v5, v0, v12, v15, v6}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2684
    .line 2685
    .line 2686
    new-instance v0, La/ugd;

    .line 2687
    .line 2688
    const v7, 0x799532c4

    .line 2689
    .line 2690
    .line 2691
    invoke-direct {v0, v7, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2692
    .line 2693
    .line 2694
    invoke-virtual {v1, v3, v4, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2695
    .line 2696
    .line 2697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2698
    .line 2699
    return-object v0

    .line 2700
    :pswitch_1a
    check-cast v0, La/cp;

    .line 2701
    .line 2702
    check-cast v12, La/t3t;

    .line 2703
    .line 2704
    check-cast v15, La/t3t;

    .line 2705
    .line 2706
    move-object/from16 v1, p1

    .line 2707
    .line 2708
    check-cast v1, Ljava/util/List;

    .line 2709
    .line 2710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2711
    .line 2712
    .line 2713
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2714
    .line 2715
    .line 2716
    move-result-object v1

    .line 2717
    check-cast v1, La/x3q;

    .line 2718
    .line 2719
    iget-object v1, v1, La/x3q;->a:Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 2720
    .line 2721
    iget-object v2, v0, La/xhe0;->a:Landroid/view/View;

    .line 2722
    .line 2723
    iget-object v3, v0, La/cp;->u:La/yfu0;

    .line 2724
    .line 2725
    check-cast v3, La/j1w;

    .line 2726
    .line 2727
    iget-object v4, v3, La/j1w;->d:Landroid/view/View;

    .line 2728
    .line 2729
    iget-object v5, v3, La/j1w;->c:Landroid/widget/TextView;

    .line 2730
    .line 2731
    iget-object v3, v3, La/j1w;->b:Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 2732
    .line 2733
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v6

    .line 2737
    invoke-virtual {v12, v6}, La/t3t;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2738
    .line 2739
    .line 2740
    move-result-object v6

    .line 2741
    check-cast v6, Ljava/lang/Boolean;

    .line 2742
    .line 2743
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2744
    .line 2745
    .line 2746
    move-result v6

    .line 2747
    if-nez v6, :cond_44

    .line 2748
    .line 2749
    const/4 v10, 0x0

    .line 2750
    goto :goto_35

    .line 2751
    :cond_44
    const/16 v10, 0x8

    .line 2752
    .line 2753
    :goto_35
    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 2754
    .line 2755
    .line 2756
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2757
    .line 2758
    .line 2759
    move-result-object v4

    .line 2760
    iget-object v6, v1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a:La/e4f;

    .line 2761
    .line 2762
    iget-boolean v7, v1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->c:Z

    .line 2763
    .line 2764
    invoke-static {v6}, La/feb;->X(La/e4f;)I

    .line 2765
    .line 2766
    .line 2767
    move-result v6

    .line 2768
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 2769
    .line 2770
    .line 2771
    move-result-object v4

    .line 2772
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2773
    .line 2774
    .line 2775
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v4

    .line 2779
    check-cast v4, La/x3q;

    .line 2780
    .line 2781
    iget v4, v4, La/x3q;->b:I

    .line 2782
    .line 2783
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 2784
    .line 2785
    .line 2786
    iget-boolean v4, v1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->b:Z

    .line 2787
    .line 2788
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->setChecked(Z)V

    .line 2789
    .line 2790
    .line 2791
    new-instance v4, La/wg;

    .line 2792
    .line 2793
    invoke-direct {v4, v15, v1, v13}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2794
    .line 2795
    .line 2796
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2797
    .line 2798
    .line 2799
    new-instance v1, La/s6w;

    .line 2800
    .line 2801
    const/4 v10, 0x0

    .line 2802
    invoke-direct {v1, v0, v10}, La/s6w;-><init>(La/cp;B)V

    .line 2803
    .line 2804
    .line 2805
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2806
    .line 2807
    .line 2808
    invoke-virtual {v3, v7}, Landroid/view/View;->setClickable(Z)V

    .line 2809
    .line 2810
    .line 2811
    invoke-virtual {v2, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 2812
    .line 2813
    .line 2814
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2815
    .line 2816
    return-object v0

    .line 2817
    :pswitch_1b
    check-cast v0, Ljava/lang/String;

    .line 2818
    .line 2819
    check-cast v12, Ljava/lang/String;

    .line 2820
    .line 2821
    check-cast v15, La/zsb0;

    .line 2822
    .line 2823
    move-object/from16 v1, p1

    .line 2824
    .line 2825
    check-cast v1, La/az40;

    .line 2826
    .line 2827
    const-wide/16 v2, 0x0

    .line 2828
    .line 2829
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2830
    .line 2831
    .line 2832
    move-result-object v2

    .line 2833
    sget-object v3, La/mtv;->c:La/zsb0;

    .line 2834
    .line 2835
    sget-object v4, La/mtv;->d:La/zsb0;

    .line 2836
    .line 2837
    invoke-static {v1, v4, v14}, La/efx;->w(La/az40;La/zsb0;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 2838
    .line 2839
    .line 2840
    move-result-object v5

    .line 2841
    check-cast v5, Ljava/lang/String;

    .line 2842
    .line 2843
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2844
    .line 2845
    .line 2846
    move-result v5

    .line 2847
    if-eqz v5, :cond_47

    .line 2848
    .line 2849
    invoke-static {v1, v0}, La/mtv;->c(La/az40;Ljava/lang/String;)La/zsb0;

    .line 2850
    .line 2851
    .line 2852
    move-result-object v2

    .line 2853
    if-nez v2, :cond_45

    .line 2854
    .line 2855
    goto :goto_36

    .line 2856
    :cond_45
    iget-object v2, v2, La/zsb0;->a:Ljava/lang/String;

    .line 2857
    .line 2858
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2859
    .line 2860
    .line 2861
    move-result v2

    .line 2862
    if-eqz v2, :cond_46

    .line 2863
    .line 2864
    :goto_36
    const/16 v20, 0x0

    .line 2865
    .line 2866
    goto/16 :goto_3a

    .line 2867
    .line 2868
    :cond_46
    invoke-static {v1, v0}, La/mtv;->d(La/az40;Ljava/lang/String;)V

    .line 2869
    .line 2870
    .line 2871
    new-instance v2, Ljava/util/HashSet;

    .line 2872
    .line 2873
    new-instance v3, Ljava/util/HashSet;

    .line 2874
    .line 2875
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 2876
    .line 2877
    .line 2878
    invoke-static {v1, v15, v3}, La/efx;->w(La/az40;La/zsb0;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v3

    .line 2882
    check-cast v3, Ljava/util/Collection;

    .line 2883
    .line 2884
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 2885
    .line 2886
    .line 2887
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2888
    .line 2889
    .line 2890
    invoke-virtual {v1, v15, v2}, La/az40;->d(La/zsb0;Ljava/lang/Object;)V

    .line 2891
    .line 2892
    .line 2893
    goto :goto_36

    .line 2894
    :cond_47
    invoke-static {v1, v3, v2}, La/efx;->w(La/az40;La/zsb0;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 2895
    .line 2896
    .line 2897
    move-result-object v5

    .line 2898
    check-cast v5, Ljava/lang/Long;

    .line 2899
    .line 2900
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 2901
    .line 2902
    .line 2903
    move-result-wide v5

    .line 2904
    const-wide/16 v7, 0x1

    .line 2905
    .line 2906
    add-long v9, v5, v7

    .line 2907
    .line 2908
    const-wide/16 v11, 0x1e

    .line 2909
    .line 2910
    cmp-long v9, v9, v11

    .line 2911
    .line 2912
    if-nez v9, :cond_4c

    .line 2913
    .line 2914
    invoke-static {v1, v3, v2}, La/efx;->w(La/az40;La/zsb0;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v2

    .line 2918
    check-cast v2, Ljava/lang/Long;

    .line 2919
    .line 2920
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 2921
    .line 2922
    .line 2923
    move-result-wide v5

    .line 2924
    new-instance v2, Ljava/util/HashSet;

    .line 2925
    .line 2926
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 2927
    .line 2928
    .line 2929
    invoke-virtual {v1}, La/az40;->a()Ljava/util/Map;

    .line 2930
    .line 2931
    .line 2932
    move-result-object v9

    .line 2933
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2934
    .line 2935
    .line 2936
    move-result-object v9

    .line 2937
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2938
    .line 2939
    .line 2940
    move-result-object v9

    .line 2941
    move-object v10, v2

    .line 2942
    const/4 v2, 0x0

    .line 2943
    :goto_37
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2944
    .line 2945
    .line 2946
    move-result v11

    .line 2947
    if-eqz v11, :cond_4b

    .line 2948
    .line 2949
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2950
    .line 2951
    .line 2952
    move-result-object v11

    .line 2953
    check-cast v11, Ljava/util/Map$Entry;

    .line 2954
    .line 2955
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v12

    .line 2959
    instance-of v12, v12, Ljava/util/Set;

    .line 2960
    .line 2961
    if-eqz v12, :cond_4a

    .line 2962
    .line 2963
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2964
    .line 2965
    .line 2966
    move-result-object v12

    .line 2967
    check-cast v12, Ljava/util/Set;

    .line 2968
    .line 2969
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2970
    .line 2971
    .line 2972
    move-result-object v13

    .line 2973
    :goto_38
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 2974
    .line 2975
    .line 2976
    move-result v16

    .line 2977
    if-eqz v16, :cond_4a

    .line 2978
    .line 2979
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2980
    .line 2981
    .line 2982
    move-result-object v16

    .line 2983
    move-wide/from16 p0, v7

    .line 2984
    .line 2985
    move-object/from16 v7, v16

    .line 2986
    .line 2987
    check-cast v7, Ljava/lang/String;

    .line 2988
    .line 2989
    if-eqz v2, :cond_48

    .line 2990
    .line 2991
    invoke-virtual {v2, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 2992
    .line 2993
    .line 2994
    move-result v8

    .line 2995
    if-lez v8, :cond_49

    .line 2996
    .line 2997
    :cond_48
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2998
    .line 2999
    .line 3000
    move-result-object v2

    .line 3001
    check-cast v2, La/zsb0;

    .line 3002
    .line 3003
    iget-object v2, v2, La/zsb0;->a:Ljava/lang/String;

    .line 3004
    .line 3005
    move-object v14, v2

    .line 3006
    move-object v2, v7

    .line 3007
    move-object v10, v12

    .line 3008
    :cond_49
    move-wide/from16 v7, p0

    .line 3009
    .line 3010
    goto :goto_38

    .line 3011
    :cond_4a
    move-wide/from16 p0, v7

    .line 3012
    .line 3013
    move-wide/from16 v7, p0

    .line 3014
    .line 3015
    goto :goto_37

    .line 3016
    :cond_4b
    move-wide/from16 p0, v7

    .line 3017
    .line 3018
    new-instance v7, Ljava/util/HashSet;

    .line 3019
    .line 3020
    invoke-direct {v7, v10}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 3021
    .line 3022
    .line 3023
    invoke-virtual {v7, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 3024
    .line 3025
    .line 3026
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3027
    .line 3028
    .line 3029
    new-instance v2, La/zsb0;

    .line 3030
    .line 3031
    invoke-direct {v2, v14}, La/zsb0;-><init>(Ljava/lang/String;)V

    .line 3032
    .line 3033
    .line 3034
    invoke-virtual {v1, v2, v7}, La/az40;->d(La/zsb0;Ljava/lang/Object;)V

    .line 3035
    .line 3036
    .line 3037
    sub-long v5, v5, p0

    .line 3038
    .line 3039
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3040
    .line 3041
    .line 3042
    move-result-object v2

    .line 3043
    invoke-virtual {v1, v3, v2}, La/az40;->d(La/zsb0;Ljava/lang/Object;)V

    .line 3044
    .line 3045
    .line 3046
    goto :goto_39

    .line 3047
    :cond_4c
    move-wide/from16 p0, v7

    .line 3048
    .line 3049
    :goto_39
    new-instance v2, Ljava/util/HashSet;

    .line 3050
    .line 3051
    new-instance v7, Ljava/util/HashSet;

    .line 3052
    .line 3053
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 3054
    .line 3055
    .line 3056
    invoke-static {v1, v15, v7}, La/efx;->w(La/az40;La/zsb0;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v7

    .line 3060
    check-cast v7, Ljava/util/Collection;

    .line 3061
    .line 3062
    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 3063
    .line 3064
    .line 3065
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 3066
    .line 3067
    .line 3068
    add-long v5, v5, p0

    .line 3069
    .line 3070
    invoke-virtual {v1, v15, v2}, La/az40;->d(La/zsb0;Ljava/lang/Object;)V

    .line 3071
    .line 3072
    .line 3073
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3074
    .line 3075
    .line 3076
    move-result-object v2

    .line 3077
    invoke-virtual {v1, v3, v2}, La/az40;->d(La/zsb0;Ljava/lang/Object;)V

    .line 3078
    .line 3079
    .line 3080
    invoke-virtual {v1, v4, v0}, La/az40;->d(La/zsb0;Ljava/lang/Object;)V

    .line 3081
    .line 3082
    .line 3083
    goto/16 :goto_36

    .line 3084
    .line 3085
    :goto_3a
    return-object v20

    .line 3086
    :pswitch_1c
    check-cast v0, La/t33;

    .line 3087
    .line 3088
    check-cast v12, La/l7m0;

    .line 3089
    .line 3090
    check-cast v15, La/l7m0;

    .line 3091
    .line 3092
    move-object/from16 v1, p1

    .line 3093
    .line 3094
    check-cast v1, La/uag0;

    .line 3095
    .line 3096
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3097
    .line 3098
    .line 3099
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 3100
    .line 3101
    .line 3102
    move-result-object v2

    .line 3103
    check-cast v2, Ljava/lang/Number;

    .line 3104
    .line 3105
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 3106
    .line 3107
    .line 3108
    move-result v2

    .line 3109
    invoke-virtual {v1, v2}, La/uag0;->w(F)V

    .line 3110
    .line 3111
    .line 3112
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 3113
    .line 3114
    .line 3115
    move-result-object v0

    .line 3116
    check-cast v0, Ljava/lang/Number;

    .line 3117
    .line 3118
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 3119
    .line 3120
    .line 3121
    move-result v0

    .line 3122
    invoke-virtual {v1, v0}, La/uag0;->y(F)V

    .line 3123
    .line 3124
    .line 3125
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 3126
    .line 3127
    .line 3128
    move-result-object v0

    .line 3129
    check-cast v0, Ljava/lang/Number;

    .line 3130
    .line 3131
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 3132
    .line 3133
    .line 3134
    move-result v0

    .line 3135
    invoke-virtual {v1, v0}, La/uag0;->H(F)V

    .line 3136
    .line 3137
    .line 3138
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 3139
    .line 3140
    .line 3141
    move-result-object v0

    .line 3142
    check-cast v0, Ljava/lang/Number;

    .line 3143
    .line 3144
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 3145
    .line 3146
    .line 3147
    move-result v0

    .line 3148
    invoke-virtual {v1, v0}, La/uag0;->I(F)V

    .line 3149
    .line 3150
    .line 3151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3152
    .line 3153
    return-object v0

    .line 3154
    nop

    .line 3155
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
