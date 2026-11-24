.class public final synthetic La/jz1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rw;


# direct methods
.method public synthetic constructor <init>(La/rw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jz1;->a:B

    iput-object p1, p0, La/jz1;->b:La/rw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jz1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/jz1;->b:La/rw;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/rw;->l:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, La/g2v;

    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/bie;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    instance-of v5, v1, La/xhe;

    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    new-instance v3, La/cbs0;

    .line 29
    .line 30
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    if-ge v2, v6, :cond_0

    .line 35
    .line 36
    sget-object v1, La/qy1;->a:La/qy1;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {v3, v0}, La/cbs0;-><init>(La/i4;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_1
    instance-of v5, v1, La/vge;

    .line 58
    .line 59
    if-eqz v5, :cond_f

    .line 60
    .line 61
    check-cast v1, La/vge;

    .line 62
    .line 63
    iget-object v1, v1, La/vge;->a:La/a4x;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-nez v5, :cond_e

    .line 70
    .line 71
    new-instance v4, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v5, 0xa

    .line 74
    .line 75
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_d

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, La/myr0;

    .line 97
    .line 98
    iget-object v7, v0, La/rw;->m:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v9, v7

    .line 101
    check-cast v9, La/ky1;

    .line 102
    .line 103
    iget-object v7, v0, La/rw;->b:La/ctf0;

    .line 104
    .line 105
    iget-object v8, v0, La/rw;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v8, Ljava/util/Locale;

    .line 108
    .line 109
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v10, v5, La/myr0;->d:La/kyr0;

    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v11, v5, La/myr0;->c:La/lyr0;

    .line 121
    .line 122
    iget-object v12, v5, La/myr0;->f:La/hyr0;

    .line 123
    .line 124
    iget-object v13, v12, La/hyr0;->e:Ljava/util/Date;

    .line 125
    .line 126
    iget-object v14, v12, La/hyr0;->d:Ljava/util/Date;

    .line 127
    .line 128
    sget-object v15, La/pek0;->e:La/pek0;

    .line 129
    .line 130
    invoke-virtual {v10, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    if-eqz v15, :cond_2

    .line 135
    .line 136
    new-instance v15, La/my1;

    .line 137
    .line 138
    new-array v3, v2, [Ljava/lang/Object;

    .line 139
    .line 140
    iget-object v6, v7, La/ctf0;->b:La/lsm0;

    .line 141
    .line 142
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const v2, 0x7f131657

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    sget-object v3, La/ly1;->a:La/ly1;

    .line 154
    .line 155
    invoke-direct {v15, v2, v3}, La/my1;-><init>(Ljava/lang/String;La/ly1;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    sget-object v2, La/jdk0;->e:La/jdk0;

    .line 160
    .line 161
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_3

    .line 166
    .line 167
    new-instance v15, La/my1;

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    new-array v3, v2, [Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v6, v7, La/ctf0;->b:La/lsm0;

    .line 173
    .line 174
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    const v2, 0x7f131655

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    sget-object v3, La/ly1;->b:La/ly1;

    .line 186
    .line 187
    invoke-direct {v15, v2, v3}, La/my1;-><init>(Ljava/lang/String;La/ly1;)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_3
    sget-object v2, La/jyr0;->a:La/jyr0;

    .line 192
    .line 193
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_c

    .line 198
    .line 199
    new-instance v15, La/my1;

    .line 200
    .line 201
    const/4 v2, 0x0

    .line 202
    new-array v3, v2, [Ljava/lang/Object;

    .line 203
    .line 204
    iget-object v6, v7, La/ctf0;->b:La/lsm0;

    .line 205
    .line 206
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    const v2, 0x7f131656

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    sget-object v3, La/ly1;->c:La/ly1;

    .line 218
    .line 219
    invoke-direct {v15, v2, v3}, La/my1;-><init>(Ljava/lang/String;La/ly1;)V

    .line 220
    .line 221
    .line 222
    :goto_2
    instance-of v2, v10, La/jyr0;

    .line 223
    .line 224
    move-object v3, v1

    .line 225
    move v6, v2

    .line 226
    iget-wide v1, v5, La/myr0;->a:J

    .line 227
    .line 228
    sget-object v10, La/u0d;->a:Ljava/util/List;

    .line 229
    .line 230
    iget-object v10, v5, La/myr0;->e:La/iyr0;

    .line 231
    .line 232
    iget-object v10, v10, La/iyr0;->c:Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v10}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    move-wide/from16 v16, v1

    .line 239
    .line 240
    iget-object v1, v12, La/hyr0;->g:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v2, v12, La/hyr0;->h:Ljava/lang/String;

    .line 243
    .line 244
    move-object/from16 v18, v1

    .line 245
    .line 246
    iget-object v1, v12, La/hyr0;->a:Ljava/lang/String;

    .line 247
    .line 248
    move-wide/from16 v19, v16

    .line 249
    .line 250
    invoke-virtual {v0, v8, v12}, La/rw;->b(Ljava/util/Locale;La/hyr0;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v17

    .line 254
    move-object/from16 v16, v18

    .line 255
    .line 256
    invoke-virtual {v0, v11, v8, v12}, La/rw;->a(La/lyr0;Ljava/util/Locale;La/hyr0;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v18

    .line 260
    move-object/from16 v21, v1

    .line 261
    .line 262
    invoke-virtual {v0, v8, v12}, La/rw;->b(Ljava/util/Locale;La/hyr0;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    move-object/from16 v22, v2

    .line 267
    .line 268
    invoke-virtual {v0, v11, v8, v12}, La/rw;->a(La/lyr0;Ljava/util/Locale;La/hyr0;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    move-object/from16 v28, v3

    .line 273
    .line 274
    invoke-static {}, La/by7;->c()La/by7;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    iget-boolean v3, v3, La/by7;->a:Z

    .line 279
    .line 280
    move/from16 v23, v3

    .line 281
    .line 282
    const-string v3, " - "

    .line 283
    .line 284
    if-eqz v23, :cond_4

    .line 285
    .line 286
    invoke-static {v2, v3, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    goto :goto_3

    .line 291
    :cond_4
    invoke-static {v1, v3, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    :goto_3
    iget-object v2, v12, La/hyr0;->l:La/fyr0;

    .line 296
    .line 297
    iget-object v3, v2, La/fyr0;->e:Ljava/lang/String;

    .line 298
    .line 299
    new-instance v29, La/kdm;

    .line 300
    .line 301
    iget-object v12, v2, La/fyr0;->c:Ljava/util/Date;

    .line 302
    .line 303
    iget-object v2, v2, La/fyr0;->d:Ljava/lang/Long;

    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 306
    .line 307
    .line 308
    move-result-wide v32

    .line 309
    new-instance v2, La/mnl;

    .line 310
    .line 311
    move-object/from16 v23, v1

    .line 312
    .line 313
    move-object/from16 v30, v3

    .line 314
    .line 315
    const/4 v1, 0x0

    .line 316
    new-array v3, v1, [Ljava/lang/Object;

    .line 317
    .line 318
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 319
    .line 320
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    move/from16 v24, v6

    .line 325
    .line 326
    const v6, 0x7f130682

    .line 327
    .line 328
    .line 329
    invoke-virtual {v7, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    new-array v6, v1, [Ljava/lang/Object;

    .line 334
    .line 335
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    move-object/from16 v25, v9

    .line 340
    .line 341
    const v9, 0x7f130a11

    .line 342
    .line 343
    .line 344
    invoke-virtual {v7, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    new-array v9, v1, [Ljava/lang/Object;

    .line 349
    .line 350
    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    move-object/from16 v26, v10

    .line 355
    .line 356
    const v10, 0x7f130d30

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    new-array v10, v1, [Ljava/lang/Object;

    .line 364
    .line 365
    invoke-static {v10, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    const v1, 0x7f1311d6

    .line 370
    .line 371
    .line 372
    invoke-virtual {v7, v1, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-direct {v2, v3, v6, v9, v1}, La/mnl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    move-object/from16 v34, v2

    .line 380
    .line 381
    move-object/from16 v31, v12

    .line 382
    .line 383
    invoke-direct/range {v29 .. v34}, La/kdm;-><init>(Ljava/lang/String;Ljava/util/Date;JLa/mnl;)V

    .line 384
    .line 385
    .line 386
    sget-object v1, La/rdj;->a:La/rdj;

    .line 387
    .line 388
    sget-object v1, La/wjo;->b:La/wjo;

    .line 389
    .line 390
    move-object/from16 v2, v22

    .line 391
    .line 392
    invoke-static {v1, v14, v8}, La/rdj;->e(La/wjo;Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v22

    .line 396
    sget-object v3, La/wjo;->c:La/wjo;

    .line 397
    .line 398
    invoke-static {v3, v14, v8}, La/rdj;->e(La/wjo;Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-static {v1, v13, v8}, La/rdj;->e(La/wjo;Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-static {v3, v13, v8}, La/rdj;->e(La/wjo;Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    new-instance v8, La/fy1;

    .line 411
    .line 412
    iget-object v9, v5, La/myr0;->i:Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 413
    .line 414
    iget-object v10, v9, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;->b:La/gqt0;

    .line 415
    .line 416
    iget-object v9, v9, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;->a:Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 419
    .line 420
    .line 421
    move-result v10

    .line 422
    const/4 v12, 0x1

    .line 423
    if-eqz v10, :cond_7

    .line 424
    .line 425
    if-eq v10, v12, :cond_8

    .line 426
    .line 427
    const/4 v13, 0x2

    .line 428
    if-eq v10, v13, :cond_7

    .line 429
    .line 430
    const/4 v13, 0x3

    .line 431
    if-eq v10, v13, :cond_6

    .line 432
    .line 433
    if-eqz v24, :cond_5

    .line 434
    .line 435
    new-instance v9, La/oy1;

    .line 436
    .line 437
    const/4 v10, 0x0

    .line 438
    new-array v14, v10, [Ljava/lang/Object;

    .line 439
    .line 440
    invoke-static {v14, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v14

    .line 444
    const v10, 0x7f13118e

    .line 445
    .line 446
    .line 447
    invoke-virtual {v7, v10, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v10

    .line 451
    sget-object v14, La/cy1;->a:La/cy1;

    .line 452
    .line 453
    invoke-direct {v9, v10, v14}, La/oy1;-><init>(Ljava/lang/String;La/cy1;)V

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_5
    const/4 v9, 0x0

    .line 458
    goto :goto_6

    .line 459
    :cond_6
    new-instance v10, La/oy1;

    .line 460
    .line 461
    sget-object v14, La/cy1;->c:La/cy1;

    .line 462
    .line 463
    invoke-direct {v10, v9, v14}, La/oy1;-><init>(Ljava/lang/String;La/cy1;)V

    .line 464
    .line 465
    .line 466
    :goto_4
    move-object v9, v10

    .line 467
    goto :goto_6

    .line 468
    :cond_7
    const/4 v13, 0x3

    .line 469
    goto :goto_5

    .line 470
    :cond_8
    const/4 v13, 0x3

    .line 471
    new-instance v10, La/oy1;

    .line 472
    .line 473
    sget-object v14, La/cy1;->b:La/cy1;

    .line 474
    .line 475
    invoke-direct {v10, v9, v14}, La/oy1;-><init>(Ljava/lang/String;La/cy1;)V

    .line 476
    .line 477
    .line 478
    goto :goto_4

    .line 479
    :goto_5
    new-instance v10, La/oy1;

    .line 480
    .line 481
    sget-object v14, La/cy1;->a:La/cy1;

    .line 482
    .line 483
    invoke-direct {v10, v9, v14}, La/oy1;-><init>(Ljava/lang/String;La/cy1;)V

    .line 484
    .line 485
    .line 486
    goto :goto_4

    .line 487
    :goto_6
    iget-object v5, v5, La/myr0;->k:Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;

    .line 488
    .line 489
    iget-object v10, v5, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;->b:La/gqt0;

    .line 490
    .line 491
    sget-object v14, La/fqt0;->a:[I

    .line 492
    .line 493
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    aget v10, v14, v10

    .line 498
    .line 499
    if-ne v10, v12, :cond_9

    .line 500
    .line 501
    iget-object v5, v5, Lorg/xplatform/aggregator/api/model/tournaments/UserActionButtonModel;->a:Ljava/lang/String;

    .line 502
    .line 503
    goto :goto_7

    .line 504
    :cond_9
    const/4 v5, 0x0

    .line 505
    :goto_7
    invoke-direct {v8, v9, v5}, La/fy1;-><init>(La/oy1;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    new-instance v5, La/ny1;

    .line 509
    .line 510
    sget-object v9, La/rek0;->f:La/rek0;

    .line 511
    .line 512
    invoke-virtual {v11, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    if-eqz v9, :cond_a

    .line 517
    .line 518
    const/4 v9, 0x0

    .line 519
    const/4 v10, 0x0

    .line 520
    goto :goto_8

    .line 521
    :cond_a
    sget-object v9, La/qek0;->f:La/qek0;

    .line 522
    .line 523
    invoke-virtual {v11, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    if-eqz v9, :cond_b

    .line 528
    .line 529
    const/4 v10, 0x0

    .line 530
    new-array v9, v10, [Ljava/lang/Object;

    .line 531
    .line 532
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    const v11, 0x7f13165f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v7, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v9

    .line 543
    :goto_8
    invoke-direct {v5, v15, v9}, La/ny1;-><init>(La/my1;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    new-array v9, v10, [Ljava/lang/Object;

    .line 547
    .line 548
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v9

    .line 552
    const v10, 0x7f13067d

    .line 553
    .line 554
    .line 555
    invoke-virtual {v7, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v14

    .line 559
    move-object/from16 v12, v26

    .line 560
    .line 561
    move-object/from16 v26, v8

    .line 562
    .line 563
    new-instance v8, La/py1;

    .line 564
    .line 565
    move-object/from16 v24, v1

    .line 566
    .line 567
    move-object v15, v2

    .line 568
    move-object/from16 v27, v5

    .line 569
    .line 570
    move v1, v13

    .line 571
    move-object/from16 v13, v16

    .line 572
    .line 573
    move-wide/from16 v10, v19

    .line 574
    .line 575
    move-object/from16 v16, v21

    .line 576
    .line 577
    move-object/from16 v19, v23

    .line 578
    .line 579
    move-object/from16 v9, v25

    .line 580
    .line 581
    move-object/from16 v21, v29

    .line 582
    .line 583
    move-object/from16 v20, v30

    .line 584
    .line 585
    move-object/from16 v25, v3

    .line 586
    .line 587
    move-object/from16 v23, v6

    .line 588
    .line 589
    invoke-direct/range {v8 .. v27}, La/py1;-><init>(La/ky1;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/kdm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fy1;La/ny1;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move v6, v1

    .line 596
    move-object/from16 v1, v28

    .line 597
    .line 598
    const/4 v2, 0x0

    .line 599
    goto/16 :goto_1

    .line 600
    .line 601
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 602
    .line 603
    .line 604
    :goto_9
    const/4 v3, 0x0

    .line 605
    goto :goto_a

    .line 606
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 607
    .line 608
    .line 609
    goto :goto_9

    .line 610
    :cond_d
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    new-instance v3, La/abs0;

    .line 615
    .line 616
    invoke-direct {v3, v0}, La/abs0;-><init>(La/i4;)V

    .line 617
    .line 618
    .line 619
    goto :goto_a

    .line 620
    :cond_e
    new-instance v3, La/bbs0;

    .line 621
    .line 622
    sget-object v5, La/pb10;->i:La/pb10;

    .line 623
    .line 624
    const-wide/16 v15, 0x0

    .line 625
    .line 626
    const/16 v17, 0x3de

    .line 627
    .line 628
    const/4 v6, 0x0

    .line 629
    const/4 v7, 0x0

    .line 630
    const/4 v8, 0x0

    .line 631
    const/4 v9, 0x0

    .line 632
    const v10, 0x7f131669

    .line 633
    .line 634
    .line 635
    const/4 v11, 0x0

    .line 636
    const/4 v12, 0x0

    .line 637
    const-wide/16 v13, 0x0

    .line 638
    .line 639
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-direct {v3, v0}, La/bbs0;-><init>(La/mdm;)V

    .line 644
    .line 645
    .line 646
    goto :goto_a

    .line 647
    :cond_f
    new-instance v3, La/bbs0;

    .line 648
    .line 649
    sget-object v5, La/pb10;->g:La/pb10;

    .line 650
    .line 651
    const-wide/16 v15, 0x0

    .line 652
    .line 653
    const/16 v17, 0x25e

    .line 654
    .line 655
    const/4 v6, 0x0

    .line 656
    const/4 v7, 0x0

    .line 657
    const/4 v8, 0x0

    .line 658
    const/4 v9, 0x0

    .line 659
    const v10, 0x7f130677

    .line 660
    .line 661
    .line 662
    const/4 v11, 0x0

    .line 663
    const v12, 0x7f131690

    .line 664
    .line 665
    .line 666
    const-wide/16 v13, 0x2710

    .line 667
    .line 668
    invoke-static/range {v4 .. v17}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-direct {v3, v0}, La/bbs0;-><init>(La/mdm;)V

    .line 673
    .line 674
    .line 675
    :goto_a
    return-object v3

    .line 676
    :pswitch_0
    iget-object v1, v0, La/rw;->h:La/n0o0;

    .line 677
    .line 678
    iget-object v2, v0, La/rw;->b:La/ctf0;

    .line 679
    .line 680
    move-object/from16 v3, p1

    .line 681
    .line 682
    check-cast v3, Ljava/lang/Boolean;

    .line 683
    .line 684
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    if-eqz v3, :cond_18

    .line 689
    .line 690
    iget-object v0, v0, La/rw;->f:La/n0o0;

    .line 691
    .line 692
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    check-cast v0, La/fee;

    .line 697
    .line 698
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    check-cast v0, La/ql5;

    .line 703
    .line 704
    if-eqz v0, :cond_12

    .line 705
    .line 706
    iget-object v3, v0, La/ql5;->j:Ljava/lang/String;

    .line 707
    .line 708
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    check-cast v4, La/fee;

    .line 713
    .line 714
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v4

    .line 718
    check-cast v4, La/kg;

    .line 719
    .line 720
    sget-object v5, La/kg;->c:La/kg;

    .line 721
    .line 722
    if-ne v4, v5, :cond_10

    .line 723
    .line 724
    const/4 v10, 0x0

    .line 725
    new-array v3, v10, [Ljava/lang/Object;

    .line 726
    .line 727
    iget-object v4, v2, La/ctf0;->b:La/lsm0;

    .line 728
    .line 729
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    const v5, 0x7f1300e5

    .line 734
    .line 735
    .line 736
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    goto :goto_b

    .line 741
    :cond_10
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    if-lez v4, :cond_11

    .line 746
    .line 747
    goto :goto_b

    .line 748
    :cond_11
    iget-object v3, v0, La/ql5;->k:Ljava/lang/String;

    .line 749
    .line 750
    goto :goto_b

    .line 751
    :cond_12
    const/4 v3, 0x0

    .line 752
    :goto_b
    const-string v4, ""

    .line 753
    .line 754
    if-nez v3, :cond_13

    .line 755
    .line 756
    move-object v9, v4

    .line 757
    goto :goto_c

    .line 758
    :cond_13
    move-object v9, v3

    .line 759
    :goto_c
    if-eqz v0, :cond_14

    .line 760
    .line 761
    iget-wide v5, v0, La/ql5;->b:D

    .line 762
    .line 763
    sget-object v3, La/pn40;->a:La/pn40;

    .line 764
    .line 765
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 766
    .line 767
    invoke-static {v5, v6, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    goto :goto_d

    .line 772
    :cond_14
    const/4 v3, 0x0

    .line 773
    :goto_d
    if-nez v3, :cond_15

    .line 774
    .line 775
    move-object v6, v4

    .line 776
    goto :goto_e

    .line 777
    :cond_15
    move-object v6, v3

    .line 778
    :goto_e
    if-eqz v0, :cond_16

    .line 779
    .line 780
    iget-object v3, v0, La/ql5;->f:Ljava/lang/String;

    .line 781
    .line 782
    goto :goto_f

    .line 783
    :cond_16
    const/4 v3, 0x0

    .line 784
    :goto_f
    if-nez v3, :cond_17

    .line 785
    .line 786
    move-object v7, v4

    .line 787
    :goto_10
    const/4 v10, 0x0

    .line 788
    goto :goto_11

    .line 789
    :cond_17
    move-object v7, v3

    .line 790
    goto :goto_10

    .line 791
    :goto_11
    new-array v0, v10, [Ljava/lang/Object;

    .line 792
    .line 793
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 794
    .line 795
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    const v3, 0x7f1315e0

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v8

    .line 806
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 807
    .line 808
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 809
    .line 810
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 811
    .line 812
    .line 813
    move-result-wide v2

    .line 814
    new-instance v10, La/y3d;

    .line 815
    .line 816
    invoke-direct {v10, v2, v3}, La/y3d;-><init>(J)V

    .line 817
    .line 818
    .line 819
    new-instance v5, La/jjl;

    .line 820
    .line 821
    invoke-direct/range {v5 .. v10}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/y3d;)V

    .line 822
    .line 823
    .line 824
    new-instance v0, La/wa0;

    .line 825
    .line 826
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    check-cast v1, La/fee;

    .line 831
    .line 832
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    check-cast v1, La/ijl;

    .line 837
    .line 838
    invoke-direct {v0, v1, v5}, La/wa0;-><init>(La/ijl;La/jjl;)V

    .line 839
    .line 840
    .line 841
    goto :goto_12

    .line 842
    :cond_18
    new-instance v0, La/xa0;

    .line 843
    .line 844
    const/4 v10, 0x0

    .line 845
    new-array v1, v10, [Ljava/lang/Object;

    .line 846
    .line 847
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 848
    .line 849
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    const v4, 0x7f1302fa

    .line 854
    .line 855
    .line 856
    invoke-virtual {v3, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    new-array v3, v10, [Ljava/lang/Object;

    .line 861
    .line 862
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 863
    .line 864
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v3

    .line 868
    const v4, 0x7f13112e

    .line 869
    .line 870
    .line 871
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    invoke-direct {v0, v1, v2}, La/xa0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    :goto_12
    return-object v0

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
