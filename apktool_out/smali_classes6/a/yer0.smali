.class public final synthetic La/yer0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zer0;

.field public final synthetic c:La/y78;


# direct methods
.method public synthetic constructor <init>(La/zer0;La/y78;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yer0;->a:B

    iput-object p1, p0, La/yer0;->b:La/zer0;

    iput-object p2, p0, La/yer0;->c:La/y78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yer0;->a:B

    .line 4
    .line 5
    sget-object v3, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$SportTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$SportTag;

    .line 6
    .line 7
    sget-object v4, La/l5l0;->a:La/l5l0;

    .line 8
    .line 9
    sget-object v5, La/i5l0;->a:La/i5l0;

    .line 10
    .line 11
    const/16 v6, 0xa

    .line 12
    .line 13
    const-string v7, ""

    .line 14
    .line 15
    sget-object v9, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$CyberTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$CyberTag;

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    iget-object v12, v0, La/yer0;->b:La/zer0;

    .line 19
    .line 20
    const/4 v13, 0x2

    .line 21
    const/4 v14, 0x1

    .line 22
    const/4 v15, 0x0

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/a3r0;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v2, La/t7r0;

    .line 34
    .line 35
    new-instance v3, La/ijm;

    .line 36
    .line 37
    invoke-direct {v3}, La/ijm;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object v4, La/kjm;->a:La/kjm;

    .line 41
    .line 42
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Games$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Games$Line;

    .line 43
    .line 44
    invoke-direct {v2, v4, v11, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v12}, La/zer0;->a()La/a4x;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, La/xdr0;

    .line 64
    .line 65
    iget-boolean v5, v5, La/xdr0;->M:Z

    .line 66
    .line 67
    new-instance v6, La/p2r0;

    .line 68
    .line 69
    invoke-direct {v6, v3, v5}, La/p2r0;-><init>(La/a4x;Z)V

    .line 70
    .line 71
    .line 72
    new-array v3, v13, [La/qdr0;

    .line 73
    .line 74
    aput-object v2, v3, v15

    .line 75
    .line 76
    aput-object v6, v3, v14

    .line 77
    .line 78
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v3, v1, La/a3r0;->c:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, La/xdr0;

    .line 93
    .line 94
    iget-object v6, v12, La/zer0;->a:La/ctf0;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_0

    .line 110
    .line 111
    sget-object v0, La/iun;->a:La/iun;

    .line 112
    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-eqz v11, :cond_1

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    move-object/from16 v16, v11

    .line 135
    .line 136
    check-cast v16, La/eih;

    .line 137
    .line 138
    iget-object v11, v5, La/xdr0;->K:La/v5l0;

    .line 139
    .line 140
    iget-boolean v12, v5, La/xdr0;->i:Z

    .line 141
    .line 142
    move/from16 v24, v14

    .line 143
    .line 144
    iget-object v14, v5, La/xdr0;->B:Ljava/util/List;

    .line 145
    .line 146
    iget-boolean v13, v5, La/xdr0;->j:Z

    .line 147
    .line 148
    iget-boolean v10, v5, La/xdr0;->M:Z

    .line 149
    .line 150
    iget-object v8, v0, La/yer0;->c:La/y78;

    .line 151
    .line 152
    move-object/from16 v19, v6

    .line 153
    .line 154
    move-object/from16 v18, v8

    .line 155
    .line 156
    move/from16 v23, v10

    .line 157
    .line 158
    move-object/from16 v17, v11

    .line 159
    .line 160
    move/from16 v20, v12

    .line 161
    .line 162
    move/from16 v22, v13

    .line 163
    .line 164
    move-object/from16 v21, v14

    .line 165
    .line 166
    invoke-static/range {v16 .. v23}, La/r2r0;->a(La/eih;La/v5l0;La/y78;La/ctf0;ZLjava/util/List;ZZ)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    move-object/from16 v8, v19

    .line 171
    .line 172
    invoke-static {v7, v6}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 173
    .line 174
    .line 175
    move-object v6, v8

    .line 176
    move/from16 v14, v24

    .line 177
    .line 178
    const/4 v13, 0x2

    .line 179
    goto :goto_0

    .line 180
    :cond_1
    move-object v8, v6

    .line 181
    move/from16 v24, v14

    .line 182
    .line 183
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v3, La/t7r0;

    .line 188
    .line 189
    new-array v6, v15, [Ljava/lang/Object;

    .line 190
    .line 191
    iget-object v7, v8, La/ctf0;->b:La/lsm0;

    .line 192
    .line 193
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    const v8, 0x7f130636

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v27

    .line 204
    new-array v6, v15, [Ljava/lang/Object;

    .line 205
    .line 206
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    const v8, 0x7f130366

    .line 211
    .line 212
    .line 213
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v34

    .line 217
    new-instance v6, La/ue9;

    .line 218
    .line 219
    new-array v8, v15, [Ljava/lang/Object;

    .line 220
    .line 221
    invoke-static {v8, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    const v10, 0x7f1300e4

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-direct {v6, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    new-instance v26, La/hjm;

    .line 236
    .line 237
    const/16 v38, 0x0

    .line 238
    .line 239
    const/16 v39, 0x1a7e

    .line 240
    .line 241
    const/16 v28, 0x0

    .line 242
    .line 243
    const/16 v29, 0x0

    .line 244
    .line 245
    const/16 v30, 0x0

    .line 246
    .line 247
    const/16 v31, 0x0

    .line 248
    .line 249
    const/16 v32, 0x0

    .line 250
    .line 251
    const/16 v33, 0x0

    .line 252
    .line 253
    sget-object v35, La/cso0;->a:La/cso0;

    .line 254
    .line 255
    const/16 v36, 0x0

    .line 256
    .line 257
    move-object/from16 v37, v6

    .line 258
    .line 259
    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v6, v26

    .line 263
    .line 264
    sget-object v7, La/kjm;->a:La/kjm;

    .line 265
    .line 266
    invoke-direct {v3, v4, v9, v6}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 267
    .line 268
    .line 269
    new-instance v4, La/p2r0;

    .line 270
    .line 271
    iget-boolean v5, v5, La/xdr0;->M:Z

    .line 272
    .line 273
    invoke-direct {v4, v0, v5}, La/p2r0;-><init>(La/a4x;Z)V

    .line 274
    .line 275
    .line 276
    const/4 v0, 0x2

    .line 277
    new-array v0, v0, [La/qdr0;

    .line 278
    .line 279
    aput-object v3, v0, v15

    .line 280
    .line 281
    aput-object v4, v0, v24

    .line 282
    .line 283
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    :goto_1
    invoke-static {v1, v2, v0}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    :pswitch_0
    move/from16 v24, v14

    .line 293
    .line 294
    move-object/from16 v1, p1

    .line 295
    .line 296
    check-cast v1, La/b3r0;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    new-instance v2, La/t7r0;

    .line 302
    .line 303
    new-instance v3, La/ijm;

    .line 304
    .line 305
    invoke-direct {v3}, La/ijm;-><init>()V

    .line 306
    .line 307
    .line 308
    sget-object v4, La/kjm;->a:La/kjm;

    .line 309
    .line 310
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Games$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Games$Live;

    .line 311
    .line 312
    invoke-direct {v2, v4, v11, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 313
    .line 314
    .line 315
    new-instance v3, La/q2r0;

    .line 316
    .line 317
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    check-cast v5, La/xdr0;

    .line 326
    .line 327
    iget-boolean v5, v5, La/xdr0;->M:Z

    .line 328
    .line 329
    invoke-virtual {v12}, La/zer0;->a()La/a4x;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-direct {v3, v6, v5}, La/q2r0;-><init>(La/a4x;Z)V

    .line 338
    .line 339
    .line 340
    const/4 v5, 0x2

    .line 341
    new-array v6, v5, [La/qdr0;

    .line 342
    .line 343
    aput-object v2, v6, v15

    .line 344
    .line 345
    aput-object v3, v6, v24

    .line 346
    .line 347
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    iget-object v3, v1, La/b3r0;->c:Ljava/util/List;

    .line 352
    .line 353
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    check-cast v5, La/xdr0;

    .line 362
    .line 363
    iget-object v6, v12, La/zer0;->a:La/ctf0;

    .line 364
    .line 365
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    if-eqz v7, :cond_2

    .line 379
    .line 380
    sget-object v0, La/iun;->a:La/iun;

    .line 381
    .line 382
    goto/16 :goto_3

    .line 383
    .line 384
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    if-eqz v8, :cond_3

    .line 398
    .line 399
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    move-object/from16 v16, v8

    .line 404
    .line 405
    check-cast v16, La/eih;

    .line 406
    .line 407
    iget-object v8, v5, La/xdr0;->K:La/v5l0;

    .line 408
    .line 409
    iget-boolean v10, v5, La/xdr0;->i:Z

    .line 410
    .line 411
    iget-object v11, v5, La/xdr0;->B:Ljava/util/List;

    .line 412
    .line 413
    iget-boolean v12, v5, La/xdr0;->j:Z

    .line 414
    .line 415
    iget-boolean v13, v5, La/xdr0;->M:Z

    .line 416
    .line 417
    iget-object v14, v0, La/yer0;->c:La/y78;

    .line 418
    .line 419
    move-object/from16 v19, v6

    .line 420
    .line 421
    move-object/from16 v17, v8

    .line 422
    .line 423
    move/from16 v20, v10

    .line 424
    .line 425
    move-object/from16 v21, v11

    .line 426
    .line 427
    move/from16 v22, v12

    .line 428
    .line 429
    move/from16 v23, v13

    .line 430
    .line 431
    move-object/from16 v18, v14

    .line 432
    .line 433
    invoke-static/range {v16 .. v23}, La/r2r0;->a(La/eih;La/v5l0;La/y78;La/ctf0;ZLjava/util/List;ZZ)Ljava/util/ArrayList;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    move-object/from16 v8, v19

    .line 438
    .line 439
    invoke-static {v7, v6}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 440
    .line 441
    .line 442
    move-object v6, v8

    .line 443
    goto :goto_2

    .line 444
    :cond_3
    move-object v8, v6

    .line 445
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    new-instance v3, La/t7r0;

    .line 450
    .line 451
    new-array v6, v15, [Ljava/lang/Object;

    .line 452
    .line 453
    iget-object v7, v8, La/ctf0;->b:La/lsm0;

    .line 454
    .line 455
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    const v8, 0x7f130637

    .line 460
    .line 461
    .line 462
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v27

    .line 466
    new-array v6, v15, [Ljava/lang/Object;

    .line 467
    .line 468
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    const v8, 0x7f130366

    .line 473
    .line 474
    .line 475
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v34

    .line 479
    new-instance v6, La/ue9;

    .line 480
    .line 481
    new-array v8, v15, [Ljava/lang/Object;

    .line 482
    .line 483
    invoke-static {v8, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    const v10, 0x7f1300e4

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    invoke-direct {v6, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    new-instance v26, La/hjm;

    .line 498
    .line 499
    const/16 v38, 0x0

    .line 500
    .line 501
    const/16 v39, 0x1a7e

    .line 502
    .line 503
    const/16 v28, 0x0

    .line 504
    .line 505
    const/16 v29, 0x0

    .line 506
    .line 507
    const/16 v30, 0x0

    .line 508
    .line 509
    const/16 v31, 0x0

    .line 510
    .line 511
    const/16 v32, 0x0

    .line 512
    .line 513
    const/16 v33, 0x0

    .line 514
    .line 515
    sget-object v35, La/cso0;->a:La/cso0;

    .line 516
    .line 517
    const/16 v36, 0x0

    .line 518
    .line 519
    move-object/from16 v37, v6

    .line 520
    .line 521
    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 522
    .line 523
    .line 524
    move-object/from16 v6, v26

    .line 525
    .line 526
    sget-object v7, La/kjm;->a:La/kjm;

    .line 527
    .line 528
    invoke-direct {v3, v4, v9, v6}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 529
    .line 530
    .line 531
    new-instance v4, La/q2r0;

    .line 532
    .line 533
    iget-boolean v5, v5, La/xdr0;->M:Z

    .line 534
    .line 535
    invoke-direct {v4, v0, v5}, La/q2r0;-><init>(La/a4x;Z)V

    .line 536
    .line 537
    .line 538
    const/4 v0, 0x2

    .line 539
    new-array v0, v0, [La/qdr0;

    .line 540
    .line 541
    aput-object v3, v0, v15

    .line 542
    .line 543
    aput-object v4, v0, v24

    .line 544
    .line 545
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    :goto_3
    invoke-static {v1, v2, v0}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    return-object v0

    .line 554
    :pswitch_1
    move/from16 v24, v14

    .line 555
    .line 556
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, La/per0;

    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    new-instance v8, La/t7r0;

    .line 564
    .line 565
    new-instance v9, La/ijm;

    .line 566
    .line 567
    invoke-direct {v9}, La/ijm;-><init>()V

    .line 568
    .line 569
    .line 570
    sget-object v10, La/kjm;->a:La/kjm;

    .line 571
    .line 572
    sget-object v10, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Sport$Games$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Sport$Games$Line;

    .line 573
    .line 574
    invoke-direct {v8, v10, v11, v9}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 575
    .line 576
    .line 577
    new-instance v9, La/ner0;

    .line 578
    .line 579
    invoke-virtual {v12}, La/zer0;->a()La/a4x;

    .line 580
    .line 581
    .line 582
    move-result-object v13

    .line 583
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 584
    .line 585
    .line 586
    move-result-object v14

    .line 587
    invoke-virtual {v14}, La/fee;->c()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v14

    .line 591
    check-cast v14, La/xdr0;

    .line 592
    .line 593
    iget-boolean v14, v14, La/xdr0;->M:Z

    .line 594
    .line 595
    move/from16 v11, v24

    .line 596
    .line 597
    invoke-direct {v9, v13, v14, v11}, La/ner0;-><init>(La/a4x;ZZ)V

    .line 598
    .line 599
    .line 600
    const/4 v13, 0x2

    .line 601
    new-array v14, v13, [La/qdr0;

    .line 602
    .line 603
    aput-object v8, v14, v15

    .line 604
    .line 605
    aput-object v9, v14, v11

    .line 606
    .line 607
    invoke-static {v14}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    iget-object v9, v1, La/per0;->c:Ljava/util/List;

    .line 612
    .line 613
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 614
    .line 615
    .line 616
    move-result-object v11

    .line 617
    invoke-virtual {v11}, La/fee;->c()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v11

    .line 621
    check-cast v11, La/xdr0;

    .line 622
    .line 623
    iget-object v12, v12, La/zer0;->a:La/ctf0;

    .line 624
    .line 625
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    iget-object v13, v11, La/xdr0;->B:Ljava/util/List;

    .line 632
    .line 633
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 637
    .line 638
    .line 639
    move-result v14

    .line 640
    if-eqz v14, :cond_4

    .line 641
    .line 642
    sget-object v0, La/iun;->a:La/iun;

    .line 643
    .line 644
    move-object v2, v8

    .line 645
    goto/16 :goto_f

    .line 646
    .line 647
    :cond_4
    new-instance v14, Ljava/util/ArrayList;

    .line 648
    .line 649
    invoke-static {v9, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    invoke-direct {v14, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 654
    .line 655
    .line 656
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 661
    .line 662
    .line 663
    move-result v9

    .line 664
    if-eqz v9, :cond_f

    .line 665
    .line 666
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v9

    .line 670
    check-cast v9, La/d0t;

    .line 671
    .line 672
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 673
    .line 674
    .line 675
    move-result-object v18

    .line 676
    :goto_5
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 677
    .line 678
    .line 679
    move-result v19

    .line 680
    if-eqz v19, :cond_6

    .line 681
    .line 682
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v19

    .line 686
    move-object/from16 v15, v19

    .line 687
    .line 688
    check-cast v15, La/lok0;

    .line 689
    .line 690
    iget v15, v15, La/lok0;->a:I

    .line 691
    .line 692
    iget v6, v9, La/d0t;->O:I

    .line 693
    .line 694
    if-ne v15, v6, :cond_5

    .line 695
    .line 696
    goto :goto_6

    .line 697
    :cond_5
    const/16 v6, 0xa

    .line 698
    .line 699
    const/4 v15, 0x0

    .line 700
    goto :goto_5

    .line 701
    :cond_6
    const/16 v19, 0x0

    .line 702
    .line 703
    :goto_6
    move-object/from16 v6, v19

    .line 704
    .line 705
    check-cast v6, La/lok0;

    .line 706
    .line 707
    iget-boolean v15, v11, La/xdr0;->i:Z

    .line 708
    .line 709
    move-object/from16 p1, v2

    .line 710
    .line 711
    iget-boolean v2, v11, La/xdr0;->j:Z

    .line 712
    .line 713
    move/from16 v29, v2

    .line 714
    .line 715
    iget-object v2, v11, La/xdr0;->v:La/wcb;

    .line 716
    .line 717
    move-object/from16 v18, v4

    .line 718
    .line 719
    move-object/from16 v19, v5

    .line 720
    .line 721
    if-eqz v2, :cond_7

    .line 722
    .line 723
    iget-wide v4, v9, La/d0t;->v:J

    .line 724
    .line 725
    move-object/from16 v23, v7

    .line 726
    .line 727
    move-object/from16 v22, v8

    .line 728
    .line 729
    iget-wide v7, v9, La/d0t;->u:J

    .line 730
    .line 731
    invoke-virtual {v2, v4, v5, v7, v8}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    goto :goto_7

    .line 736
    :cond_7
    move-object/from16 v23, v7

    .line 737
    .line 738
    move-object/from16 v22, v8

    .line 739
    .line 740
    const/4 v2, 0x0

    .line 741
    :goto_7
    if-nez v2, :cond_8

    .line 742
    .line 743
    move-object/from16 v30, v23

    .line 744
    .line 745
    goto :goto_8

    .line 746
    :cond_8
    move-object/from16 v30, v2

    .line 747
    .line 748
    :goto_8
    new-instance v2, Ljava/util/ArrayList;

    .line 749
    .line 750
    const/16 v4, 0xa

    .line 751
    .line 752
    invoke-static {v13, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 757
    .line 758
    .line 759
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 764
    .line 765
    .line 766
    move-result v5

    .line 767
    if-eqz v5, :cond_9

    .line 768
    .line 769
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    check-cast v5, La/lok0;

    .line 774
    .line 775
    iget v5, v5, La/lok0;->a:I

    .line 776
    .line 777
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 778
    .line 779
    .line 780
    move-result-object v5

    .line 781
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    goto :goto_9

    .line 785
    :cond_9
    if-eqz v6, :cond_a

    .line 786
    .line 787
    iget-boolean v4, v6, La/lok0;->n:Z

    .line 788
    .line 789
    move/from16 v33, v4

    .line 790
    .line 791
    goto :goto_a

    .line 792
    :cond_a
    const/16 v33, 0x0

    .line 793
    .line 794
    :goto_a
    if-eqz v6, :cond_b

    .line 795
    .line 796
    iget-boolean v4, v6, La/lok0;->p:Z

    .line 797
    .line 798
    move/from16 v34, v4

    .line 799
    .line 800
    goto :goto_b

    .line 801
    :cond_b
    const/16 v34, 0x0

    .line 802
    .line 803
    :goto_b
    iget-object v4, v11, La/xdr0;->K:La/v5l0;

    .line 804
    .line 805
    iget-object v5, v9, La/d0t;->K:Ljava/util/List;

    .line 806
    .line 807
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 808
    .line 809
    .line 810
    move-result v5

    .line 811
    if-eqz v5, :cond_c

    .line 812
    .line 813
    move-object/from16 v37, v19

    .line 814
    .line 815
    goto :goto_c

    .line 816
    :cond_c
    move-object/from16 v37, v18

    .line 817
    .line 818
    :goto_c
    if-eqz v6, :cond_d

    .line 819
    .line 820
    iget-object v5, v6, La/lok0;->u:Ljava/lang/String;

    .line 821
    .line 822
    goto :goto_d

    .line 823
    :cond_d
    const/4 v5, 0x0

    .line 824
    :goto_d
    if-nez v5, :cond_e

    .line 825
    .line 826
    move-object/from16 v38, v23

    .line 827
    .line 828
    goto :goto_e

    .line 829
    :cond_e
    move-object/from16 v38, v5

    .line 830
    .line 831
    :goto_e
    iget-boolean v5, v11, La/xdr0;->M:Z

    .line 832
    .line 833
    iget-object v6, v0, La/yer0;->c:La/y78;

    .line 834
    .line 835
    const/16 v31, 0x0

    .line 836
    .line 837
    const/16 v35, 0x0

    .line 838
    .line 839
    move-object/from16 v32, v2

    .line 840
    .line 841
    move-object/from16 v36, v4

    .line 842
    .line 843
    move/from16 v39, v5

    .line 844
    .line 845
    move-object/from16 v27, v6

    .line 846
    .line 847
    move-object/from16 v25, v9

    .line 848
    .line 849
    move-object/from16 v26, v12

    .line 850
    .line 851
    move/from16 v28, v15

    .line 852
    .line 853
    invoke-static/range {v25 .. v39}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    move-object/from16 v4, v26

    .line 858
    .line 859
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-object/from16 v2, p1

    .line 863
    .line 864
    move-object v12, v4

    .line 865
    move-object/from16 v4, v18

    .line 866
    .line 867
    move-object/from16 v5, v19

    .line 868
    .line 869
    move-object/from16 v8, v22

    .line 870
    .line 871
    move-object/from16 v7, v23

    .line 872
    .line 873
    const/16 v6, 0xa

    .line 874
    .line 875
    const/4 v15, 0x0

    .line 876
    goto/16 :goto_4

    .line 877
    .line 878
    :cond_f
    move-object/from16 v22, v8

    .line 879
    .line 880
    move-object v4, v12

    .line 881
    new-instance v0, La/t7r0;

    .line 882
    .line 883
    const/4 v2, 0x0

    .line 884
    new-array v5, v2, [Ljava/lang/Object;

    .line 885
    .line 886
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 887
    .line 888
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v5

    .line 892
    const v6, 0x7f130fd3

    .line 893
    .line 894
    .line 895
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v26

    .line 899
    new-array v5, v2, [Ljava/lang/Object;

    .line 900
    .line 901
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v5

    .line 905
    const v6, 0x7f131487

    .line 906
    .line 907
    .line 908
    invoke-virtual {v4, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v33

    .line 912
    new-instance v5, La/ue9;

    .line 913
    .line 914
    new-array v6, v2, [Ljava/lang/Object;

    .line 915
    .line 916
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v6

    .line 920
    const v2, 0x7f1300e4

    .line 921
    .line 922
    .line 923
    invoke-virtual {v4, v2, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-direct {v5, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    new-instance v25, La/hjm;

    .line 931
    .line 932
    const/16 v37, 0x0

    .line 933
    .line 934
    const/16 v38, 0x1a7e

    .line 935
    .line 936
    const/16 v27, 0x0

    .line 937
    .line 938
    const/16 v28, 0x0

    .line 939
    .line 940
    const/16 v29, 0x0

    .line 941
    .line 942
    const/16 v30, 0x0

    .line 943
    .line 944
    const/16 v31, 0x0

    .line 945
    .line 946
    const/16 v32, 0x0

    .line 947
    .line 948
    sget-object v34, La/sqo0;->a:La/sqo0;

    .line 949
    .line 950
    const/16 v35, 0x0

    .line 951
    .line 952
    move-object/from16 v36, v5

    .line 953
    .line 954
    invoke-direct/range {v25 .. v38}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 955
    .line 956
    .line 957
    move-object/from16 v2, v25

    .line 958
    .line 959
    sget-object v4, La/kjm;->a:La/kjm;

    .line 960
    .line 961
    invoke-direct {v0, v10, v3, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 962
    .line 963
    .line 964
    new-instance v2, La/ner0;

    .line 965
    .line 966
    invoke-static {v14}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    iget-boolean v4, v11, La/xdr0;->M:Z

    .line 971
    .line 972
    const/4 v5, 0x0

    .line 973
    invoke-direct {v2, v3, v4, v5}, La/ner0;-><init>(La/a4x;ZZ)V

    .line 974
    .line 975
    .line 976
    const/4 v13, 0x2

    .line 977
    new-array v3, v13, [La/qdr0;

    .line 978
    .line 979
    aput-object v0, v3, v5

    .line 980
    .line 981
    const/16 v24, 0x1

    .line 982
    .line 983
    aput-object v2, v3, v24

    .line 984
    .line 985
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    move-object/from16 v2, v22

    .line 990
    .line 991
    :goto_f
    invoke-static {v1, v2, v0}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    return-object v0

    .line 996
    :pswitch_2
    move-object/from16 v18, v4

    .line 997
    .line 998
    move-object/from16 v19, v5

    .line 999
    .line 1000
    move-object/from16 v23, v7

    .line 1001
    .line 1002
    move-object/from16 v1, p1

    .line 1003
    .line 1004
    check-cast v1, La/qer0;

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    new-instance v2, La/t7r0;

    .line 1010
    .line 1011
    new-instance v4, La/ijm;

    .line 1012
    .line 1013
    invoke-direct {v4}, La/ijm;-><init>()V

    .line 1014
    .line 1015
    .line 1016
    sget-object v5, La/kjm;->a:La/kjm;

    .line 1017
    .line 1018
    sget-object v5, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Sport$Games$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Sport$Games$Live;

    .line 1019
    .line 1020
    const/4 v6, 0x0

    .line 1021
    invoke-direct {v2, v5, v6, v4}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12}, La/zer0;->a()La/a4x;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v4

    .line 1028
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v7

    .line 1032
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v7

    .line 1036
    check-cast v7, La/xdr0;

    .line 1037
    .line 1038
    iget-boolean v7, v7, La/xdr0;->M:Z

    .line 1039
    .line 1040
    new-instance v8, La/oer0;

    .line 1041
    .line 1042
    const/4 v11, 0x1

    .line 1043
    invoke-direct {v8, v4, v11, v7}, La/oer0;-><init>(La/a4x;ZZ)V

    .line 1044
    .line 1045
    .line 1046
    const/4 v13, 0x2

    .line 1047
    new-array v4, v13, [La/qdr0;

    .line 1048
    .line 1049
    const/16 v20, 0x0

    .line 1050
    .line 1051
    aput-object v2, v4, v20

    .line 1052
    .line 1053
    aput-object v8, v4, v11

    .line 1054
    .line 1055
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    iget-object v4, v1, La/qer0;->c:Ljava/util/List;

    .line 1060
    .line 1061
    invoke-virtual {v12}, La/zer0;->b()La/fee;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v7

    .line 1065
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v7

    .line 1069
    check-cast v7, La/xdr0;

    .line 1070
    .line 1071
    iget-object v8, v12, La/zer0;->a:La/ctf0;

    .line 1072
    .line 1073
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    iget-object v9, v7, La/xdr0;->B:Ljava/util/List;

    .line 1080
    .line 1081
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v10

    .line 1088
    if-eqz v10, :cond_10

    .line 1089
    .line 1090
    sget-object v0, La/iun;->a:La/iun;

    .line 1091
    .line 1092
    goto/16 :goto_1b

    .line 1093
    .line 1094
    :cond_10
    new-instance v10, Ljava/util/ArrayList;

    .line 1095
    .line 1096
    const/16 v11, 0xa

    .line 1097
    .line 1098
    invoke-static {v4, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v12

    .line 1102
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 1103
    .line 1104
    .line 1105
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v4

    .line 1109
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1110
    .line 1111
    .line 1112
    move-result v11

    .line 1113
    if-eqz v11, :cond_1b

    .line 1114
    .line 1115
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v11

    .line 1119
    check-cast v11, La/d0t;

    .line 1120
    .line 1121
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v12

    .line 1125
    :cond_11
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1126
    .line 1127
    .line 1128
    move-result v13

    .line 1129
    if-eqz v13, :cond_12

    .line 1130
    .line 1131
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v13

    .line 1135
    move-object v14, v13

    .line 1136
    check-cast v14, La/lok0;

    .line 1137
    .line 1138
    iget v14, v14, La/lok0;->a:I

    .line 1139
    .line 1140
    iget v15, v11, La/d0t;->O:I

    .line 1141
    .line 1142
    if-ne v14, v15, :cond_11

    .line 1143
    .line 1144
    goto :goto_11

    .line 1145
    :cond_12
    move-object v13, v6

    .line 1146
    :goto_11
    check-cast v13, La/lok0;

    .line 1147
    .line 1148
    iget-boolean v12, v7, La/xdr0;->i:Z

    .line 1149
    .line 1150
    iget-boolean v14, v7, La/xdr0;->j:Z

    .line 1151
    .line 1152
    iget-object v15, v7, La/xdr0;->v:La/wcb;

    .line 1153
    .line 1154
    if-eqz v15, :cond_13

    .line 1155
    .line 1156
    move-object/from16 p1, v7

    .line 1157
    .line 1158
    iget-wide v6, v11, La/d0t;->v:J

    .line 1159
    .line 1160
    move-object/from16 v22, v1

    .line 1161
    .line 1162
    move-object/from16 v40, v2

    .line 1163
    .line 1164
    iget-wide v1, v11, La/d0t;->u:J

    .line 1165
    .line 1166
    invoke-virtual {v15, v6, v7, v1, v2}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v1

    .line 1170
    goto :goto_12

    .line 1171
    :cond_13
    move-object/from16 v22, v1

    .line 1172
    .line 1173
    move-object/from16 v40, v2

    .line 1174
    .line 1175
    move-object/from16 p1, v7

    .line 1176
    .line 1177
    const/4 v1, 0x0

    .line 1178
    :goto_12
    if-nez v1, :cond_14

    .line 1179
    .line 1180
    move-object/from16 v30, v23

    .line 1181
    .line 1182
    goto :goto_13

    .line 1183
    :cond_14
    move-object/from16 v30, v1

    .line 1184
    .line 1185
    :goto_13
    new-instance v1, Ljava/util/ArrayList;

    .line 1186
    .line 1187
    const/16 v2, 0xa

    .line 1188
    .line 1189
    invoke-static {v9, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1190
    .line 1191
    .line 1192
    move-result v6

    .line 1193
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1194
    .line 1195
    .line 1196
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v6

    .line 1200
    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1201
    .line 1202
    .line 1203
    move-result v7

    .line 1204
    if-eqz v7, :cond_15

    .line 1205
    .line 1206
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v7

    .line 1210
    check-cast v7, La/lok0;

    .line 1211
    .line 1212
    iget v7, v7, La/lok0;->a:I

    .line 1213
    .line 1214
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v7

    .line 1218
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    goto :goto_14

    .line 1222
    :cond_15
    if-eqz v13, :cond_16

    .line 1223
    .line 1224
    iget-boolean v6, v13, La/lok0;->n:Z

    .line 1225
    .line 1226
    move/from16 v33, v6

    .line 1227
    .line 1228
    goto :goto_15

    .line 1229
    :cond_16
    const/16 v33, 0x0

    .line 1230
    .line 1231
    :goto_15
    if-eqz v13, :cond_17

    .line 1232
    .line 1233
    iget-boolean v6, v13, La/lok0;->p:Z

    .line 1234
    .line 1235
    move/from16 v34, v6

    .line 1236
    .line 1237
    :goto_16
    move-object/from16 v7, p1

    .line 1238
    .line 1239
    goto :goto_17

    .line 1240
    :cond_17
    const/16 v34, 0x0

    .line 1241
    .line 1242
    goto :goto_16

    .line 1243
    :goto_17
    iget-object v6, v7, La/xdr0;->K:La/v5l0;

    .line 1244
    .line 1245
    iget-object v15, v11, La/d0t;->K:Ljava/util/List;

    .line 1246
    .line 1247
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v15

    .line 1251
    if-eqz v15, :cond_18

    .line 1252
    .line 1253
    move-object/from16 v37, v19

    .line 1254
    .line 1255
    goto :goto_18

    .line 1256
    :cond_18
    move-object/from16 v37, v18

    .line 1257
    .line 1258
    :goto_18
    if-eqz v13, :cond_19

    .line 1259
    .line 1260
    iget-object v13, v13, La/lok0;->u:Ljava/lang/String;

    .line 1261
    .line 1262
    goto :goto_19

    .line 1263
    :cond_19
    const/4 v13, 0x0

    .line 1264
    :goto_19
    if-nez v13, :cond_1a

    .line 1265
    .line 1266
    move-object/from16 v38, v23

    .line 1267
    .line 1268
    goto :goto_1a

    .line 1269
    :cond_1a
    move-object/from16 v38, v13

    .line 1270
    .line 1271
    :goto_1a
    iget-boolean v13, v7, La/xdr0;->M:Z

    .line 1272
    .line 1273
    iget-object v15, v0, La/yer0;->c:La/y78;

    .line 1274
    .line 1275
    const/16 v31, 0x0

    .line 1276
    .line 1277
    const/16 v35, 0x0

    .line 1278
    .line 1279
    move-object/from16 v32, v1

    .line 1280
    .line 1281
    move-object/from16 v36, v6

    .line 1282
    .line 1283
    move-object/from16 v26, v8

    .line 1284
    .line 1285
    move-object/from16 v25, v11

    .line 1286
    .line 1287
    move/from16 v28, v12

    .line 1288
    .line 1289
    move/from16 v39, v13

    .line 1290
    .line 1291
    move/from16 v29, v14

    .line 1292
    .line 1293
    move-object/from16 v27, v15

    .line 1294
    .line 1295
    invoke-static/range {v25 .. v39}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v1

    .line 1299
    move-object/from16 v6, v26

    .line 1300
    .line 1301
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1302
    .line 1303
    .line 1304
    move-object v8, v6

    .line 1305
    move-object/from16 v1, v22

    .line 1306
    .line 1307
    move-object/from16 v2, v40

    .line 1308
    .line 1309
    const/4 v6, 0x0

    .line 1310
    goto/16 :goto_10

    .line 1311
    .line 1312
    :cond_1b
    move-object/from16 v22, v1

    .line 1313
    .line 1314
    move-object/from16 v40, v2

    .line 1315
    .line 1316
    move-object v6, v8

    .line 1317
    new-instance v0, La/t7r0;

    .line 1318
    .line 1319
    const/4 v2, 0x0

    .line 1320
    new-array v1, v2, [Ljava/lang/Object;

    .line 1321
    .line 1322
    iget-object v4, v6, La/ctf0;->b:La/lsm0;

    .line 1323
    .line 1324
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    const v6, 0x7f131355

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v4, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v26

    .line 1335
    new-array v1, v2, [Ljava/lang/Object;

    .line 1336
    .line 1337
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v1

    .line 1341
    const v6, 0x7f131487

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v4, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v33

    .line 1348
    new-instance v1, La/ue9;

    .line 1349
    .line 1350
    new-array v6, v2, [Ljava/lang/Object;

    .line 1351
    .line 1352
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v6

    .line 1356
    const v2, 0x7f1300e4

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v4, v2, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v2

    .line 1363
    invoke-direct {v1, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 1364
    .line 1365
    .line 1366
    new-instance v25, La/hjm;

    .line 1367
    .line 1368
    const/16 v37, 0x0

    .line 1369
    .line 1370
    const/16 v38, 0x1a7e

    .line 1371
    .line 1372
    const/16 v27, 0x0

    .line 1373
    .line 1374
    const/16 v28, 0x0

    .line 1375
    .line 1376
    const/16 v29, 0x0

    .line 1377
    .line 1378
    const/16 v30, 0x0

    .line 1379
    .line 1380
    const/16 v31, 0x0

    .line 1381
    .line 1382
    const/16 v32, 0x0

    .line 1383
    .line 1384
    sget-object v34, La/sqo0;->a:La/sqo0;

    .line 1385
    .line 1386
    const/16 v35, 0x0

    .line 1387
    .line 1388
    move-object/from16 v36, v1

    .line 1389
    .line 1390
    invoke-direct/range {v25 .. v38}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1391
    .line 1392
    .line 1393
    move-object/from16 v1, v25

    .line 1394
    .line 1395
    sget-object v2, La/kjm;->a:La/kjm;

    .line 1396
    .line 1397
    invoke-direct {v0, v5, v3, v1}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-static {v10}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v1

    .line 1404
    iget-boolean v2, v7, La/xdr0;->M:Z

    .line 1405
    .line 1406
    new-instance v3, La/oer0;

    .line 1407
    .line 1408
    const/4 v5, 0x0

    .line 1409
    invoke-direct {v3, v1, v5, v2}, La/oer0;-><init>(La/a4x;ZZ)V

    .line 1410
    .line 1411
    .line 1412
    const/4 v13, 0x2

    .line 1413
    new-array v1, v13, [La/qdr0;

    .line 1414
    .line 1415
    aput-object v0, v1, v5

    .line 1416
    .line 1417
    const/16 v24, 0x1

    .line 1418
    .line 1419
    aput-object v3, v1, v24

    .line 1420
    .line 1421
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v0

    .line 1425
    move-object/from16 v1, v22

    .line 1426
    .line 1427
    move-object/from16 v2, v40

    .line 1428
    .line 1429
    :goto_1b
    invoke-static {v1, v2, v0}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    return-object v0

    .line 1434
    nop

    .line 1435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
