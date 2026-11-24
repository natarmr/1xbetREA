.class public final synthetic La/xer0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zer0;


# direct methods
.method public synthetic constructor <init>(La/zer0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xer0;->a:B

    iput-object p1, p0, La/xer0;->b:La/zer0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/t8r0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La/t7r0;

    .line 9
    .line 10
    new-instance v2, La/ijm;

    .line 11
    .line 12
    invoke-direct {v2}, La/ijm;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v3, La/kjm;->a:La/kjm;

    .line 16
    .line 17
    sget-object v3, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$OneXGames$Spotlight;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$OneXGames$Spotlight;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct {v1, v3, v4, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/u370;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    new-array v6, v5, [La/qdr0;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    aput-object v1, v6, v7

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    aput-object v2, v6, v1

    .line 36
    .line 37
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v6, v0, La/t8r0;->c:Ljava/util/List;

    .line 42
    .line 43
    new-instance v8, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-eqz v9, :cond_5

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    check-cast v9, La/a4b;

    .line 63
    .line 64
    move-object/from16 v10, p0

    .line 65
    .line 66
    iget-object v11, v10, La/xer0;->b:La/zer0;

    .line 67
    .line 68
    iget-object v12, v11, La/zer0;->a:La/ctf0;

    .line 69
    .line 70
    invoke-virtual {v11}, La/zer0;->b()La/fee;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    invoke-virtual {v11}, La/fee;->c()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    check-cast v11, La/xdr0;

    .line 79
    .line 80
    iget-object v11, v11, La/xdr0;->z:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-array v13, v7, [Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v12, v12, La/ctf0;->b:La/lsm0;

    .line 91
    .line 92
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    const v14, 0x7f130fcc

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v16

    .line 103
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    if-nez v13, :cond_0

    .line 108
    .line 109
    new-array v11, v7, [Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    const v13, 0x7f131486

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    :cond_0
    move-object/from16 v23, v11

    .line 123
    .line 124
    new-instance v15, La/hjm;

    .line 125
    .line 126
    const/16 v27, 0x0

    .line 127
    .line 128
    const/16 v28, 0x1e7e

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const/16 v18, 0x0

    .line 133
    .line 134
    const/16 v19, 0x0

    .line 135
    .line 136
    const/16 v20, 0x0

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    const/16 v22, 0x0

    .line 141
    .line 142
    sget-object v24, La/vro0;->a:La/vro0;

    .line 143
    .line 144
    const/16 v25, 0x0

    .line 145
    .line 146
    const/16 v26, 0x0

    .line 147
    .line 148
    invoke-direct/range {v15 .. v28}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 149
    .line 150
    .line 151
    sget-object v11, La/kjm;->a:La/kjm;

    .line 152
    .line 153
    new-instance v11, La/t7r0;

    .line 154
    .line 155
    sget-object v12, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$OneXGamesTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$OneXGamesTag;

    .line 156
    .line 157
    invoke-direct {v11, v3, v12, v15}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 158
    .line 159
    .line 160
    iget-object v12, v9, La/a4b;->k:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-le v13, v1, :cond_3

    .line 167
    .line 168
    new-instance v13, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v14, 0xa

    .line 171
    .line 172
    invoke-static {v12, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    move v14, v7

    .line 184
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    if-eqz v15, :cond_2

    .line 189
    .line 190
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    add-int/lit8 v24, v14, 0x1

    .line 195
    .line 196
    if-ltz v14, :cond_1

    .line 197
    .line 198
    check-cast v15, La/mz60;

    .line 199
    .line 200
    new-instance v16, La/r370;

    .line 201
    .line 202
    iget v14, v9, La/a4b;->j:I

    .line 203
    .line 204
    move-object/from16 p1, v4

    .line 205
    .line 206
    iget-object v4, v15, La/mz60;->b:La/a570;

    .line 207
    .line 208
    move/from16 v25, v7

    .line 209
    .line 210
    iget-object v7, v15, La/mz60;->d:La/hds;

    .line 211
    .line 212
    invoke-static {v4}, La/x1x;->D(La/a570;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v18

    .line 216
    new-instance v4, La/n0x;

    .line 217
    .line 218
    move/from16 v26, v1

    .line 219
    .line 220
    iget-object v1, v7, La/hds;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-direct {v4, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v1, La/n0x;

    .line 226
    .line 227
    iget-object v7, v7, La/hds;->a:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v7}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-direct {v1, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    iget-object v7, v15, La/mz60;->a:Ljava/lang/String;

    .line 237
    .line 238
    move-object/from16 v21, v1

    .line 239
    .line 240
    move-object/from16 v20, v4

    .line 241
    .line 242
    move-object/from16 v22, v7

    .line 243
    .line 244
    move/from16 v17, v14

    .line 245
    .line 246
    move-object/from16 v23, v15

    .line 247
    .line 248
    invoke-direct/range {v16 .. v24}, La/r370;-><init>(IJLa/n0x;La/n0x;Ljava/lang/String;La/mz60;I)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v1, v16

    .line 252
    .line 253
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-object/from16 v4, p1

    .line 257
    .line 258
    move/from16 v14, v24

    .line 259
    .line 260
    move/from16 v7, v25

    .line 261
    .line 262
    move/from16 v1, v26

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_1
    move-object/from16 p1, v4

    .line 266
    .line 267
    invoke-static {}, La/q3d;->p()V

    .line 268
    .line 269
    .line 270
    throw p1

    .line 271
    :cond_2
    move/from16 v26, v1

    .line 272
    .line 273
    move-object/from16 p1, v4

    .line 274
    .line 275
    move/from16 v25, v7

    .line 276
    .line 277
    invoke-static {v13}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    new-instance v4, La/s370;

    .line 282
    .line 283
    invoke-direct {v4, v1}, La/s370;-><init>(La/a4x;)V

    .line 284
    .line 285
    .line 286
    new-array v1, v5, [La/qdr0;

    .line 287
    .line 288
    aput-object v11, v1, v25

    .line 289
    .line 290
    aput-object v4, v1, v26

    .line 291
    .line 292
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    goto :goto_2

    .line 297
    :cond_3
    move/from16 v26, v1

    .line 298
    .line 299
    move-object/from16 p1, v4

    .line 300
    .line 301
    move/from16 v25, v7

    .line 302
    .line 303
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    move/from16 v4, v26

    .line 308
    .line 309
    if-ne v1, v4, :cond_4

    .line 310
    .line 311
    new-instance v1, La/t370;

    .line 312
    .line 313
    new-instance v13, La/r370;

    .line 314
    .line 315
    iget v14, v9, La/a4b;->j:I

    .line 316
    .line 317
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    check-cast v4, La/mz60;

    .line 322
    .line 323
    iget-object v4, v4, La/mz60;->b:La/a570;

    .line 324
    .line 325
    invoke-static {v4}, La/x1x;->D(La/a570;)J

    .line 326
    .line 327
    .line 328
    move-result-wide v15

    .line 329
    new-instance v4, La/n0x;

    .line 330
    .line 331
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    check-cast v7, La/mz60;

    .line 336
    .line 337
    iget-object v7, v7, La/mz60;->d:La/hds;

    .line 338
    .line 339
    iget-object v7, v7, La/hds;->a:Ljava/lang/String;

    .line 340
    .line 341
    invoke-direct {v4, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    new-instance v7, La/n0x;

    .line 345
    .line 346
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    check-cast v9, La/mz60;

    .line 351
    .line 352
    iget-object v9, v9, La/mz60;->d:La/hds;

    .line 353
    .line 354
    iget-object v9, v9, La/hds;->a:Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {v9}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    invoke-direct {v7, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    check-cast v9, La/mz60;

    .line 368
    .line 369
    iget-object v9, v9, La/mz60;->a:Ljava/lang/String;

    .line 370
    .line 371
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v12

    .line 375
    move-object/from16 v20, v12

    .line 376
    .line 377
    check-cast v20, La/mz60;

    .line 378
    .line 379
    const/16 v21, 0x1

    .line 380
    .line 381
    move-object/from16 v17, v4

    .line 382
    .line 383
    move-object/from16 v18, v7

    .line 384
    .line 385
    move-object/from16 v19, v9

    .line 386
    .line 387
    invoke-direct/range {v13 .. v21}, La/r370;-><init>(IJLa/n0x;La/n0x;Ljava/lang/String;La/mz60;I)V

    .line 388
    .line 389
    .line 390
    invoke-direct {v1, v13}, La/t370;-><init>(La/r370;)V

    .line 391
    .line 392
    .line 393
    new-array v4, v5, [La/qdr0;

    .line 394
    .line 395
    aput-object v11, v4, v25

    .line 396
    .line 397
    const/16 v26, 0x1

    .line 398
    .line 399
    aput-object v1, v4, v26

    .line 400
    .line 401
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    goto :goto_2

    .line 406
    :cond_4
    move/from16 v26, v4

    .line 407
    .line 408
    sget-object v1, La/iun;->a:La/iun;

    .line 409
    .line 410
    :goto_2
    invoke-static {v8, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 411
    .line 412
    .line 413
    move-object/from16 v4, p1

    .line 414
    .line 415
    move/from16 v7, v25

    .line 416
    .line 417
    move/from16 v1, v26

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_5
    invoke-static {v0, v2, v8}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    return-object v0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/xxq0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La/t7r0;

    .line 9
    .line 10
    new-instance v2, La/ijm;

    .line 11
    .line 12
    invoke-direct {v2}, La/ijm;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v3, La/kjm;->a:La/kjm;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$Categories;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$Categories;

    .line 19
    .line 20
    invoke-direct {v1, v4, v3, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/yxq0;

    .line 24
    .line 25
    sget-object v3, La/avl;->a:La/avl;

    .line 26
    .line 27
    invoke-direct {v2, v3}, La/yxq0;-><init>(La/bvl;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    new-array v5, v3, [La/qdr0;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    aput-object v1, v5, v6

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    aput-object v2, v5, v1

    .line 38
    .line 39
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v5, v0, La/xxq0;->c:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v7, p0

    .line 46
    .line 47
    iget-object v7, v7, La/xer0;->b:La/zer0;

    .line 48
    .line 49
    iget-object v8, v7, La/zer0;->a:La/ctf0;

    .line 50
    .line 51
    invoke-virtual {v7}, La/zer0;->b()La/fee;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, La/xdr0;

    .line 60
    .line 61
    iget-boolean v7, v7, La/xdr0;->s:Z

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-nez v9, :cond_6

    .line 74
    .line 75
    if-eqz v7, :cond_0

    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 80
    .line 81
    const/16 v9, 0xa

    .line 82
    .line 83
    invoke-static {v5, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_5

    .line 99
    .line 100
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, La/vh0;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v10, La/cvl;

    .line 110
    .line 111
    iget-wide v11, v9, La/vh0;->a:J

    .line 112
    .line 113
    long-to-int v11, v11

    .line 114
    new-instance v12, La/n0x;

    .line 115
    .line 116
    new-instance v13, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object v14, v9, La/vh0;->c:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    if-nez v15, :cond_1

    .line 130
    .line 131
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v14, v15, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    if-nez v15, :cond_4

    .line 142
    .line 143
    const-string v15, "https://"

    .line 144
    .line 145
    invoke-static {v14, v15, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v15

    .line 149
    if-eqz v15, :cond_2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 153
    .line 154
    .line 155
    move-result v15

    .line 156
    const/16 v3, 0x2f

    .line 157
    .line 158
    if-lez v15, :cond_3

    .line 159
    .line 160
    const-string v15, "/"

    .line 161
    .line 162
    invoke-static {v13, v15}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    if-nez v15, :cond_3

    .line 167
    .line 168
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    :cond_3
    new-array v15, v1, [C

    .line 172
    .line 173
    aput-char v3, v15, v6

    .line 174
    .line 175
    invoke-static {v14, v15}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_4
    :goto_1
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    :goto_2
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-direct {v12, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const v3, 0x7f08032d

    .line 197
    .line 198
    .line 199
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    iget-object v9, v9, La/vh0;->b:Ljava/lang/String;

    .line 204
    .line 205
    invoke-direct {v10, v11, v12, v3, v9}, La/cvl;-><init>(ILa/n0x;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    const/4 v3, 0x2

    .line 212
    goto :goto_0

    .line 213
    :cond_5
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    new-instance v5, La/t7r0;

    .line 218
    .line 219
    new-array v7, v6, [Ljava/lang/Object;

    .line 220
    .line 221
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 222
    .line 223
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    const v9, 0x7f1303f8

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    new-array v7, v6, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    const v9, 0x7f1303ce

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v18

    .line 247
    new-instance v7, La/ue9;

    .line 248
    .line 249
    new-array v9, v6, [Ljava/lang/Object;

    .line 250
    .line 251
    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    const v10, 0x7f1300e4

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    invoke-direct {v7, v8}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    new-instance v10, La/hjm;

    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const/16 v23, 0x1a7e

    .line 270
    .line 271
    const/4 v12, 0x0

    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v14, 0x0

    .line 274
    const/4 v15, 0x0

    .line 275
    const/16 v16, 0x0

    .line 276
    .line 277
    const/16 v17, 0x0

    .line 278
    .line 279
    sget-object v19, La/oqo0;->a:La/oqo0;

    .line 280
    .line 281
    const/16 v20, 0x0

    .line 282
    .line 283
    move-object/from16 v21, v7

    .line 284
    .line 285
    invoke-direct/range {v10 .. v23}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 286
    .line 287
    .line 288
    sget-object v7, La/kjm;->a:La/kjm;

    .line 289
    .line 290
    sget-object v7, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;

    .line 291
    .line 292
    invoke-direct {v5, v4, v7, v10}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 293
    .line 294
    .line 295
    new-instance v4, La/yxq0;

    .line 296
    .line 297
    new-instance v7, La/zul;

    .line 298
    .line 299
    invoke-direct {v7, v3}, La/zul;-><init>(La/a4x;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {v4, v7}, La/yxq0;-><init>(La/bvl;)V

    .line 303
    .line 304
    .line 305
    const/4 v3, 0x2

    .line 306
    new-array v3, v3, [La/qdr0;

    .line 307
    .line 308
    aput-object v5, v3, v6

    .line 309
    .line 310
    aput-object v4, v3, v1

    .line 311
    .line 312
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    goto :goto_4

    .line 317
    :cond_6
    :goto_3
    sget-object v1, La/iun;->a:La/iun;

    .line 318
    .line 319
    :goto_4
    invoke-static {v0, v2, v1}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/s8r0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La/t7r0;

    .line 9
    .line 10
    new-instance v2, La/ijm;

    .line 11
    .line 12
    invoke-direct {v2}, La/ijm;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v3, La/kjm;->a:La/kjm;

    .line 16
    .line 17
    sget-object v3, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$OneXGames$Categories;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$OneXGames$Categories;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct {v1, v3, v4, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/jv60;

    .line 24
    .line 25
    sget-object v5, La/avl;->a:La/avl;

    .line 26
    .line 27
    invoke-direct {v2, v5}, La/jv60;-><init>(La/bvl;)V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    new-array v5, v5, [La/qdr0;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    aput-object v1, v5, v6

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    aput-object v2, v5, v1

    .line 38
    .line 39
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v5, v0, La/s8r0;->c:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v7, p0

    .line 46
    .line 47
    iget-object v7, v7, La/xer0;->b:La/zer0;

    .line 48
    .line 49
    iget-object v8, v7, La/zer0;->a:La/ctf0;

    .line 50
    .line 51
    invoke-virtual {v7}, La/zer0;->b()La/fee;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, La/xdr0;

    .line 60
    .line 61
    iget-object v7, v7, La/xdr0;->w:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v9, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    if-eqz v11, :cond_1

    .line 83
    .line 84
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    instance-of v12, v11, La/b4b;

    .line 89
    .line 90
    if-eqz v12, :cond_0

    .line 91
    .line 92
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-eqz v10, :cond_3

    .line 101
    .line 102
    :cond_2
    move v10, v1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    :cond_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_2

    .line 113
    .line 114
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, La/b4b;

    .line 119
    .line 120
    iget-object v11, v11, La/b4b;->j:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-nez v11, :cond_4

    .line 127
    .line 128
    move v10, v6

    .line 129
    :goto_1
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-nez v5, :cond_10

    .line 134
    .line 135
    if-eqz v10, :cond_5

    .line 136
    .line 137
    goto/16 :goto_9

    .line 138
    .line 139
    :cond_5
    new-instance v5, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_f

    .line 153
    .line 154
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    check-cast v10, La/b4b;

    .line 159
    .line 160
    iget-object v10, v10, La/b4b;->j:Ljava/util/ArrayList;

    .line 161
    .line 162
    new-instance v11, Ljava/util/ArrayList;

    .line 163
    .line 164
    const/16 v12, 0xa

    .line 165
    .line 166
    invoke-static {v10, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-eqz v12, :cond_e

    .line 182
    .line 183
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    check-cast v12, La/c4b;

    .line 188
    .line 189
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget v13, v12, La/c4b;->j:I

    .line 193
    .line 194
    new-instance v14, La/cvl;

    .line 195
    .line 196
    new-instance v15, La/n0x;

    .line 197
    .line 198
    new-instance v4, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 201
    .line 202
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    sget-object v1, La/z4t;->c:La/pek;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {}, La/z4t;->values()[La/z4t;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    array-length v6, v1

    .line 215
    move-object/from16 p0, v1

    .line 216
    .line 217
    const/4 v1, 0x0

    .line 218
    :goto_4
    if-ge v1, v6, :cond_7

    .line 219
    .line 220
    move/from16 v18, v1

    .line 221
    .line 222
    aget-object v1, p0, v18

    .line 223
    .line 224
    move/from16 v19, v6

    .line 225
    .line 226
    iget v6, v1, La/z4t;->a:I

    .line 227
    .line 228
    if-ne v6, v13, :cond_6

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_6
    add-int/lit8 v1, v18, 0x1

    .line 232
    .line 233
    move/from16 v6, v19

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_7
    const/4 v1, 0x0

    .line 237
    :goto_5
    if-eqz v1, :cond_8

    .line 238
    .line 239
    iget-object v1, v1, La/z4t;->b:Ljava/lang/String;

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_8
    const/4 v1, 0x0

    .line 243
    :goto_6
    if-nez v1, :cond_9

    .line 244
    .line 245
    const-string v1, ""

    .line 246
    .line 247
    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-nez v6, :cond_a

    .line 252
    .line 253
    const/4 v6, 0x0

    .line 254
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v18, v7

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_a
    move-object/from16 v18, v7

    .line 261
    .line 262
    const/4 v6, 0x0

    .line 263
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 264
    .line 265
    invoke-static {v1, v7, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-nez v7, :cond_d

    .line 270
    .line 271
    const-string v7, "https://"

    .line 272
    .line 273
    invoke-static {v1, v7, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    if-eqz v7, :cond_b

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    goto :goto_7

    .line 281
    :cond_b
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    const/16 v7, 0x2f

    .line 286
    .line 287
    if-lez v6, :cond_c

    .line 288
    .line 289
    const-string v6, "/"

    .line 290
    .line 291
    invoke-static {v4, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 292
    .line 293
    .line 294
    move-result v6

    .line 295
    if-nez v6, :cond_c

    .line 296
    .line 297
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    :cond_c
    move/from16 p0, v7

    .line 301
    .line 302
    const/4 v6, 0x1

    .line 303
    new-array v7, v6, [C

    .line 304
    .line 305
    const/4 v6, 0x0

    .line 306
    aput-char p0, v7, v6

    .line 307
    .line 308
    invoke-static {v1, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_d
    :goto_7
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    :goto_8
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-direct {v15, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    const v1, 0x7f080590

    .line 330
    .line 331
    .line 332
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    iget-object v4, v12, La/c4b;->k:Ljava/lang/String;

    .line 337
    .line 338
    invoke-direct {v14, v13, v15, v1, v4}, La/cvl;-><init>(ILa/n0x;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-object/from16 v7, v18

    .line 345
    .line 346
    const/4 v1, 0x1

    .line 347
    const/4 v4, 0x0

    .line 348
    const/4 v6, 0x0

    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :cond_e
    move-object/from16 v18, v7

    .line 352
    .line 353
    invoke-static {v5, v11}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 354
    .line 355
    .line 356
    const/4 v1, 0x1

    .line 357
    const/4 v4, 0x0

    .line 358
    const/4 v6, 0x0

    .line 359
    goto/16 :goto_2

    .line 360
    .line 361
    :cond_f
    move-object/from16 v18, v7

    .line 362
    .line 363
    invoke-static {v5}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    new-instance v5, La/t7r0;

    .line 372
    .line 373
    const/4 v6, 0x0

    .line 374
    new-array v7, v6, [Ljava/lang/Object;

    .line 375
    .line 376
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 377
    .line 378
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    const v7, 0x7f1303f8

    .line 383
    .line 384
    .line 385
    invoke-virtual {v8, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v10

    .line 389
    new-instance v9, La/hjm;

    .line 390
    .line 391
    const/16 v21, 0x0

    .line 392
    .line 393
    const/16 v22, 0x1e7e

    .line 394
    .line 395
    const/4 v11, 0x0

    .line 396
    const/4 v12, 0x0

    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    move-object/from16 v17, v18

    .line 403
    .line 404
    sget-object v18, La/vro0;->a:La/vro0;

    .line 405
    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v20, 0x0

    .line 409
    .line 410
    invoke-direct/range {v9 .. v22}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 411
    .line 412
    .line 413
    sget-object v6, La/kjm;->a:La/kjm;

    .line 414
    .line 415
    sget-object v6, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$OneXGamesTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$OneXGamesTag;

    .line 416
    .line 417
    invoke-direct {v5, v3, v6, v9}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    new-instance v3, La/jv60;

    .line 424
    .line 425
    new-instance v5, La/zul;

    .line 426
    .line 427
    invoke-direct {v5, v1}, La/zul;-><init>(La/a4x;)V

    .line 428
    .line 429
    .line 430
    invoke-direct {v3, v5}, La/jv60;-><init>(La/bvl;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    goto :goto_a

    .line 441
    :cond_10
    :goto_9
    sget-object v1, La/iun;->a:La/iun;

    .line 442
    .line 443
    :goto_a
    invoke-static {v0, v2, v1}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    return-object v0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/iyq0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La/t7r0;

    .line 9
    .line 10
    new-instance v2, La/ijm;

    .line 11
    .line 12
    invoke-direct {v2}, La/ijm;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v3, La/kjm;->a:La/kjm;

    .line 16
    .line 17
    sget-object v3, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$Tournaments;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$Tournaments;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct {v1, v3, v4, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/jyq0;

    .line 24
    .line 25
    sget-object v5, La/fql;->a:La/fql;

    .line 26
    .line 27
    invoke-direct {v2, v5}, La/jyq0;-><init>(La/gql;)V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    new-array v6, v5, [La/qdr0;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    aput-object v1, v6, v7

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    aput-object v2, v6, v1

    .line 38
    .line 39
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v6, v0, La/iyq0;->c:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v8, p0

    .line 46
    .line 47
    iget-object v8, v8, La/xer0;->b:La/zer0;

    .line 48
    .line 49
    iget-object v8, v8, La/zer0;->a:La/ctf0;

    .line 50
    .line 51
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v9, La/t7r0;

    .line 58
    .line 59
    new-array v10, v7, [Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 62
    .line 63
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    const v11, 0x7f131662

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    new-array v10, v7, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    const v11, 0x7f1303ce

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v20

    .line 87
    new-instance v10, La/ue9;

    .line 88
    .line 89
    new-array v11, v7, [Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    const v12, 0x7f1300e4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    invoke-direct {v10, v11}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v12, La/hjm;

    .line 106
    .line 107
    const/16 v24, 0x0

    .line 108
    .line 109
    const/16 v25, 0x1a7e

    .line 110
    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    sget-object v21, La/oqo0;->a:La/oqo0;

    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    move-object/from16 v23, v10

    .line 126
    .line 127
    invoke-direct/range {v12 .. v25}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 128
    .line 129
    .line 130
    sget-object v10, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;

    .line 131
    .line 132
    invoke-direct {v9, v3, v10, v12}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 133
    .line 134
    .line 135
    const/16 v3, 0x8

    .line 136
    .line 137
    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    new-instance v6, Ljava/util/ArrayList;

    .line 142
    .line 143
    const/16 v10, 0xa

    .line 144
    .line 145
    invoke-static {v3, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    if-eqz v10, :cond_b

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    check-cast v10, La/myr0;

    .line 167
    .line 168
    sget-object v11, La/jdk0;->e:La/jdk0;

    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v12, La/cql;

    .line 174
    .line 175
    iget-wide v13, v10, La/myr0;->a:J

    .line 176
    .line 177
    iget-object v15, v10, La/myr0;->f:La/hyr0;

    .line 178
    .line 179
    move/from16 p1, v1

    .line 180
    .line 181
    iget-object v1, v15, La/hyr0;->h:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v5, v15, La/hyr0;->a:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v4, v10, La/myr0;->d:La/kyr0;

    .line 186
    .line 187
    sget-object v7, La/pek0;->e:La/pek0;

    .line 188
    .line 189
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    move-object/from16 v17, v1

    .line 194
    .line 195
    sget-object v1, La/jyr0;->a:La/jyr0;

    .line 196
    .line 197
    if-eqz v16, :cond_0

    .line 198
    .line 199
    sget-object v16, La/hql;->a:La/hql;

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_0
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v16

    .line 206
    if-eqz v16, :cond_1

    .line 207
    .line 208
    sget-object v16, La/hql;->b:La/hql;

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_1
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v16

    .line 215
    if-eqz v16, :cond_a

    .line 216
    .line 217
    sget-object v16, La/hql;->c:La/hql;

    .line 218
    .line 219
    :goto_1
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_2

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    new-array v1, v7, [Ljava/lang/Object;

    .line 227
    .line 228
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const v4, 0x7f131657

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    :goto_2
    move-object/from16 v18, v1

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_2
    const/4 v7, 0x0

    .line 243
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    if-eqz v11, :cond_3

    .line 248
    .line 249
    new-array v1, v7, [Ljava/lang/Object;

    .line 250
    .line 251
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    const v4, 0x7f131655

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    goto :goto_2

    .line 263
    :cond_3
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_9

    .line 268
    .line 269
    new-array v1, v7, [Ljava/lang/Object;

    .line 270
    .line 271
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const v4, 0x7f131656

    .line 276
    .line 277
    .line 278
    invoke-virtual {v8, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    goto :goto_2

    .line 283
    :goto_3
    new-instance v1, La/n0x;

    .line 284
    .line 285
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 286
    .line 287
    iget-object v4, v10, La/myr0;->e:La/iyr0;

    .line 288
    .line 289
    iget-object v4, v4, La/iyr0;->c:Ljava/lang/String;

    .line 290
    .line 291
    invoke-static {v4}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-direct {v1, v4}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v4, v15, La/hyr0;->l:La/fyr0;

    .line 299
    .line 300
    iget-object v7, v4, La/fyr0;->d:Ljava/lang/Long;

    .line 301
    .line 302
    iget-object v11, v4, La/fyr0;->e:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 305
    .line 306
    .line 307
    move-result-wide v19

    .line 308
    iget-object v4, v4, La/fyr0;->a:La/gyr0;

    .line 309
    .line 310
    sget-object v15, La/gyr0;->c:La/gyr0;

    .line 311
    .line 312
    if-eq v4, v15, :cond_5

    .line 313
    .line 314
    invoke-static {v11}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_4

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_4
    const-wide/16 v25, 0x0

    .line 322
    .line 323
    cmp-long v4, v19, v25

    .line 324
    .line 325
    if-lez v4, :cond_5

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_5
    :goto_4
    const/4 v7, 0x0

    .line 329
    :goto_5
    if-eqz v7, :cond_6

    .line 330
    .line 331
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 332
    .line 333
    .line 334
    move-result-wide v26

    .line 335
    new-instance v25, La/wzr0;

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    new-array v4, v7, [Ljava/lang/Object;

    .line 339
    .line 340
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    const v7, 0x7f130682

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v29

    .line 351
    new-instance v4, La/m0x;

    .line 352
    .line 353
    const v7, 0x7f0809d3

    .line 354
    .line 355
    .line 356
    const/4 v15, 0x6

    .line 357
    move-object/from16 v19, v1

    .line 358
    .line 359
    const/4 v1, 0x0

    .line 360
    invoke-direct {v4, v7, v1, v15}, La/m0x;-><init>(ILa/bzw;I)V

    .line 361
    .line 362
    .line 363
    move-object/from16 v30, v4

    .line 364
    .line 365
    move-object/from16 v28, v11

    .line 366
    .line 367
    invoke-direct/range {v25 .. v30}, La/wzr0;-><init>(JLjava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v20, v25

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_6
    move-object/from16 v19, v1

    .line 374
    .line 375
    const/16 v20, 0x0

    .line 376
    .line 377
    :goto_6
    iget-object v1, v10, La/myr0;->c:La/lyr0;

    .line 378
    .line 379
    sget-object v4, La/rek0;->f:La/rek0;

    .line 380
    .line 381
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    if-eqz v4, :cond_7

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    :goto_7
    move-object/from16 v15, v17

    .line 390
    .line 391
    move-object/from16 v17, v16

    .line 392
    .line 393
    move-object/from16 v16, v5

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_7
    sget-object v4, La/qek0;->f:La/qek0;

    .line 397
    .line 398
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_8

    .line 403
    .line 404
    const/4 v7, 0x0

    .line 405
    new-array v1, v7, [Ljava/lang/Object;

    .line 406
    .line 407
    invoke-static {v1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    const v4, 0x7f13165f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v8, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    move-object/from16 v21, v1

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :goto_8
    invoke-direct/range {v12 .. v21}, La/cql;-><init>(JLjava/lang/String;Ljava/lang/String;La/hql;Ljava/lang/String;La/n0x;La/wzr0;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move/from16 v1, p1

    .line 428
    .line 429
    const/4 v4, 0x0

    .line 430
    const/4 v5, 0x2

    .line 431
    const/4 v7, 0x0

    .line 432
    goto/16 :goto_0

    .line 433
    .line 434
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 435
    .line 436
    .line 437
    const/16 v23, 0x0

    .line 438
    .line 439
    return-object v23

    .line 440
    :cond_9
    const/16 v23, 0x0

    .line 441
    .line 442
    invoke-static {}, La/t9f;->b()V

    .line 443
    .line 444
    .line 445
    return-object v23

    .line 446
    :cond_a
    const/16 v23, 0x0

    .line 447
    .line 448
    invoke-static {}, La/t9f;->b()V

    .line 449
    .line 450
    .line 451
    return-object v23

    .line 452
    :cond_b
    move/from16 p1, v1

    .line 453
    .line 454
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    new-instance v3, La/eql;

    .line 459
    .line 460
    invoke-direct {v3, v1}, La/eql;-><init>(La/a4x;)V

    .line 461
    .line 462
    .line 463
    new-instance v1, La/jyq0;

    .line 464
    .line 465
    invoke-direct {v1, v3}, La/jyq0;-><init>(La/gql;)V

    .line 466
    .line 467
    .line 468
    const/4 v3, 0x2

    .line 469
    new-array v3, v3, [La/qdr0;

    .line 470
    .line 471
    const/16 v24, 0x0

    .line 472
    .line 473
    aput-object v9, v3, v24

    .line 474
    .line 475
    aput-object v1, v3, p1

    .line 476
    .line 477
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-static {v0, v2, v1}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    return-object v0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/hyq0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, La/xer0;->b:La/zer0;

    .line 11
    .line 12
    invoke-virtual {v1}, La/zer0;->b()La/fee;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, La/xdr0;

    .line 21
    .line 22
    iget-object v2, v2, La/xdr0;->A:La/ot0;

    .line 23
    .line 24
    invoke-static {v2}, La/fre0;->d0(La/ot0;)La/pt0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, La/t7r0;

    .line 29
    .line 30
    new-instance v4, La/ijm;

    .line 31
    .line 32
    invoke-direct {v4}, La/ijm;-><init>()V

    .line 33
    .line 34
    .line 35
    sget-object v5, La/kjm;->a:La/kjm;

    .line 36
    .line 37
    sget-object v5, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$Recommended;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$Recommended;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v3, v5, v6, v4}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, La/gyq0;

    .line 44
    .line 45
    new-instance v7, La/aml;

    .line 46
    .line 47
    new-instance v8, La/wll;

    .line 48
    .line 49
    sget-object v9, La/o0s;->a:La/o0s;

    .line 50
    .line 51
    invoke-direct {v8, v9}, La/wll;-><init>(La/p0s;)V

    .line 52
    .line 53
    .line 54
    const/4 v10, 0x1

    .line 55
    invoke-direct {v7, v2, v8, v10}, La/aml;-><init>(La/pt0;La/yll;Z)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v7}, La/gyq0;-><init>(La/bml;)V

    .line 59
    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    new-array v7, v7, [La/qdr0;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    aput-object v3, v7, v8

    .line 66
    .line 67
    aput-object v4, v7, v10

    .line 68
    .line 69
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v4, v0, La/hyq0;->c:Ljava/util/List;

    .line 74
    .line 75
    iget-object v7, v1, La/zer0;->a:La/ctf0;

    .line 76
    .line 77
    iget-object v11, v1, La/zer0;->c:La/n0o0;

    .line 78
    .line 79
    invoke-virtual {v11}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, La/fee;

    .line 84
    .line 85
    invoke-virtual {v11}, La/fee;->c()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    check-cast v11, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    invoke-virtual {v1}, La/zer0;->b()La/fee;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/xdr0;

    .line 104
    .line 105
    iget-boolean v1, v1, La/xdr0;->I:Z

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, La/vh0;

    .line 118
    .line 119
    if-eqz v4, :cond_19

    .line 120
    .line 121
    iget-object v12, v4, La/vh0;->l:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    if-nez v12, :cond_0

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_0
    move-object v4, v6

    .line 131
    :goto_0
    if-eqz v4, :cond_19

    .line 132
    .line 133
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    new-instance v13, La/t7r0;

    .line 138
    .line 139
    new-array v14, v8, [Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 142
    .line 143
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    const v15, 0x7f1310d7

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v15, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v17

    .line 154
    new-array v14, v8, [Ljava/lang/Object;

    .line 155
    .line 156
    invoke-static {v14, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    const v15, 0x7f1303ce

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v15, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v24

    .line 167
    new-instance v14, La/ue9;

    .line 168
    .line 169
    new-array v15, v8, [Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {v15, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    const v10, 0x7f1300e4

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v10, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-direct {v14, v10}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    new-instance v16, La/hjm;

    .line 186
    .line 187
    const/16 v28, 0x0

    .line 188
    .line 189
    const/16 v29, 0x1a7e

    .line 190
    .line 191
    const/16 v18, 0x0

    .line 192
    .line 193
    const/16 v19, 0x0

    .line 194
    .line 195
    const/16 v20, 0x0

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const/16 v23, 0x0

    .line 202
    .line 203
    sget-object v25, La/oqo0;->a:La/oqo0;

    .line 204
    .line 205
    const/16 v26, 0x0

    .line 206
    .line 207
    move-object/from16 v27, v14

    .line 208
    .line 209
    invoke-direct/range {v16 .. v29}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 210
    .line 211
    .line 212
    move-object/from16 v10, v16

    .line 213
    .line 214
    sget-object v14, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;

    .line 215
    .line 216
    invoke-direct {v13, v5, v14, v10}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    new-instance v5, La/wll;

    .line 223
    .line 224
    invoke-direct {v5, v9}, La/wll;-><init>(La/p0s;)V

    .line 225
    .line 226
    .line 227
    iget-object v9, v4, La/vh0;->l:Ljava/util/List;

    .line 228
    .line 229
    new-instance v10, Ljava/util/ArrayList;

    .line 230
    .line 231
    const/16 v13, 0xa

    .line 232
    .line 233
    invoke-static {v9, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    if-eqz v13, :cond_18

    .line 249
    .line 250
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    check-cast v13, La/mlr;

    .line 255
    .line 256
    iget-object v14, v4, La/vh0;->m:Ljava/util/List;

    .line 257
    .line 258
    if-eqz v14, :cond_1

    .line 259
    .line 260
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    if-eqz v15, :cond_1

    .line 265
    .line 266
    move-object/from16 v16, v7

    .line 267
    .line 268
    move-object/from16 v17, v9

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_1
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v15

    .line 279
    if-eqz v15, :cond_3

    .line 280
    .line 281
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v15

    .line 285
    check-cast v15, La/mlr;

    .line 286
    .line 287
    move-object/from16 v16, v7

    .line 288
    .line 289
    iget-wide v6, v15, La/mlr;->a:J

    .line 290
    .line 291
    move-object/from16 v17, v9

    .line 292
    .line 293
    iget-wide v8, v13, La/mlr;->a:J

    .line 294
    .line 295
    cmp-long v6, v6, v8

    .line 296
    .line 297
    if-nez v6, :cond_2

    .line 298
    .line 299
    const/4 v8, 0x1

    .line 300
    goto :goto_3

    .line 301
    :cond_2
    move-object/from16 v7, v16

    .line 302
    .line 303
    move-object/from16 v9, v17

    .line 304
    .line 305
    const/4 v6, 0x0

    .line 306
    const/4 v8, 0x0

    .line 307
    goto :goto_2

    .line 308
    :cond_3
    move-object/from16 v16, v7

    .line 309
    .line 310
    move-object/from16 v17, v9

    .line 311
    .line 312
    const/4 v8, 0x0

    .line 313
    :goto_3
    iget-boolean v6, v13, La/mlr;->k:Z

    .line 314
    .line 315
    iget-boolean v7, v13, La/mlr;->j:Z

    .line 316
    .line 317
    if-eqz v6, :cond_4

    .line 318
    .line 319
    const/4 v15, 0x0

    .line 320
    new-array v6, v15, [Ljava/lang/Object;

    .line 321
    .line 322
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    const v9, 0x7f1303e6

    .line 327
    .line 328
    .line 329
    move-object/from16 v14, v16

    .line 330
    .line 331
    invoke-virtual {v14, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    goto :goto_4

    .line 336
    :cond_4
    move-object/from16 v14, v16

    .line 337
    .line 338
    const/4 v15, 0x0

    .line 339
    if-eqz v7, :cond_5

    .line 340
    .line 341
    new-array v6, v15, [Ljava/lang/Object;

    .line 342
    .line 343
    invoke-static {v6, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    const v9, 0x7f1303e2

    .line 348
    .line 349
    .line 350
    invoke-virtual {v14, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    goto :goto_4

    .line 355
    :cond_5
    const-string v6, ""

    .line 356
    .line 357
    :goto_4
    new-instance v18, La/st0;

    .line 358
    .line 359
    move-object/from16 v16, v14

    .line 360
    .line 361
    iget-wide v14, v13, La/mlr;->a:J

    .line 362
    .line 363
    iget-object v9, v13, La/mlr;->f:Ljava/lang/String;

    .line 364
    .line 365
    move/from16 v29, v1

    .line 366
    .line 367
    iget-object v1, v13, La/mlr;->e:Ljava/lang/String;

    .line 368
    .line 369
    move-object/from16 v22, v1

    .line 370
    .line 371
    new-instance v1, La/mtr;

    .line 372
    .line 373
    if-nez v11, :cond_6

    .line 374
    .line 375
    move-object/from16 v30, v4

    .line 376
    .line 377
    const/4 v4, 0x0

    .line 378
    goto :goto_6

    .line 379
    :cond_6
    if-eqz v8, :cond_7

    .line 380
    .line 381
    const v19, 0x7f080797

    .line 382
    .line 383
    .line 384
    :goto_5
    move-object/from16 v30, v4

    .line 385
    .line 386
    move/from16 v4, v19

    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_7
    const v19, 0x7f080798

    .line 390
    .line 391
    .line 392
    goto :goto_5

    .line 393
    :goto_6
    invoke-direct {v1, v4, v8}, La/mtr;-><init>(IZ)V

    .line 394
    .line 395
    .line 396
    new-instance v4, La/n0x;

    .line 397
    .line 398
    iget-object v8, v13, La/mlr;->g:Ljava/lang/String;

    .line 399
    .line 400
    invoke-direct {v4, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    new-instance v8, La/m0x;

    .line 404
    .line 405
    if-eqz v29, :cond_8

    .line 406
    .line 407
    const v19, 0x7f0807c1

    .line 408
    .line 409
    .line 410
    :goto_7
    move-object/from16 v23, v1

    .line 411
    .line 412
    move-object/from16 v24, v4

    .line 413
    .line 414
    move/from16 v1, v19

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_8
    const v19, 0x7f08061a

    .line 418
    .line 419
    .line 420
    goto :goto_7

    .line 421
    :goto_8
    const/4 v4, 0x6

    .line 422
    move/from16 v19, v7

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    invoke-direct {v8, v1, v7, v4}, La/m0x;-><init>(ILa/bzw;I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-nez v1, :cond_9

    .line 433
    .line 434
    sget-object v1, La/lur;->a:La/lur;

    .line 435
    .line 436
    :goto_9
    move-object/from16 v27, v1

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :cond_9
    new-instance v1, La/mur;

    .line 440
    .line 441
    iget-boolean v4, v13, La/mlr;->k:Z

    .line 442
    .line 443
    sget-object v13, La/pt0;->a:La/pt0;

    .line 444
    .line 445
    if-ne v2, v13, :cond_a

    .line 446
    .line 447
    if-nez v4, :cond_c

    .line 448
    .line 449
    :cond_a
    sget-object v7, La/pt0;->c:La/pt0;

    .line 450
    .line 451
    if-ne v2, v7, :cond_b

    .line 452
    .line 453
    if-nez v4, :cond_c

    .line 454
    .line 455
    :cond_b
    move/from16 v20, v4

    .line 456
    .line 457
    sget-object v4, La/pt0;->d:La/pt0;

    .line 458
    .line 459
    if-ne v2, v4, :cond_d

    .line 460
    .line 461
    if-eqz v20, :cond_d

    .line 462
    .line 463
    :cond_c
    new-instance v4, La/lro0;

    .line 464
    .line 465
    sget-object v7, La/d4d;->a:La/d4d;

    .line 466
    .line 467
    invoke-direct {v4}, La/lro0;-><init>()V

    .line 468
    .line 469
    .line 470
    goto :goto_a

    .line 471
    :cond_d
    if-ne v2, v13, :cond_e

    .line 472
    .line 473
    if-nez v19, :cond_10

    .line 474
    .line 475
    :cond_e
    if-ne v2, v7, :cond_f

    .line 476
    .line 477
    if-nez v19, :cond_10

    .line 478
    .line 479
    :cond_f
    if-ne v2, v4, :cond_11

    .line 480
    .line 481
    if-eqz v19, :cond_11

    .line 482
    .line 483
    :cond_10
    new-instance v4, La/eqo0;

    .line 484
    .line 485
    sget-object v7, La/d4d;->a:La/d4d;

    .line 486
    .line 487
    invoke-direct {v4}, La/eqo0;-><init>()V

    .line 488
    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_11
    sget-object v4, La/pt0;->b:La/pt0;

    .line 492
    .line 493
    if-ne v2, v4, :cond_12

    .line 494
    .line 495
    if-nez v20, :cond_13

    .line 496
    .line 497
    :cond_12
    sget-object v7, La/pt0;->e:La/pt0;

    .line 498
    .line 499
    if-ne v2, v7, :cond_14

    .line 500
    .line 501
    if-eqz v20, :cond_14

    .line 502
    .line 503
    :cond_13
    sget-object v4, La/kro0;->a:La/kro0;

    .line 504
    .line 505
    goto :goto_a

    .line 506
    :cond_14
    if-ne v2, v4, :cond_15

    .line 507
    .line 508
    if-nez v19, :cond_16

    .line 509
    .line 510
    :cond_15
    if-ne v2, v7, :cond_17

    .line 511
    .line 512
    if-eqz v19, :cond_17

    .line 513
    .line 514
    :cond_16
    sget-object v4, La/dqo0;->a:La/dqo0;

    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_17
    new-instance v4, La/uqo0;

    .line 518
    .line 519
    sget-object v7, La/d4d;->a:La/d4d;

    .line 520
    .line 521
    invoke-direct {v4, v7}, La/uqo0;-><init>(La/d4d;)V

    .line 522
    .line 523
    .line 524
    :goto_a
    invoke-direct {v1, v6, v4}, La/mur;-><init>(Ljava/lang/String;La/sso0;)V

    .line 525
    .line 526
    .line 527
    goto :goto_9

    .line 528
    :goto_b
    const/16 v26, 0x0

    .line 529
    .line 530
    move-object/from16 v25, v8

    .line 531
    .line 532
    move-object/from16 v21, v9

    .line 533
    .line 534
    move-wide/from16 v19, v14

    .line 535
    .line 536
    invoke-direct/range {v18 .. v27}, La/st0;-><init>(JLjava/lang/String;Ljava/lang/String;La/mtr;La/o0x;La/o0x;Ljava/lang/Integer;La/nur;)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v1, v18

    .line 540
    .line 541
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-object/from16 v7, v16

    .line 545
    .line 546
    move-object/from16 v9, v17

    .line 547
    .line 548
    move/from16 v1, v29

    .line 549
    .line 550
    move-object/from16 v4, v30

    .line 551
    .line 552
    const/4 v6, 0x0

    .line 553
    const/4 v8, 0x0

    .line 554
    goto/16 :goto_1

    .line 555
    .line 556
    :cond_18
    new-instance v1, La/zll;

    .line 557
    .line 558
    invoke-direct {v1, v2, v5, v10}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 559
    .line 560
    .line 561
    new-instance v2, La/gyq0;

    .line 562
    .line 563
    invoke-direct {v2, v1}, La/gyq0;-><init>(La/bml;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    invoke-static {v12}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    if-nez v1, :cond_1a

    .line 574
    .line 575
    :cond_19
    sget-object v1, La/iun;->a:La/iun;

    .line 576
    .line 577
    :cond_1a
    invoke-static {v0, v3, v1}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    return-object v0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/pfr0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, La/xer0;->b:La/zer0;

    .line 11
    .line 12
    invoke-virtual {v1}, La/zer0;->b()La/fee;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, La/xdr0;

    .line 21
    .line 22
    iget-object v2, v2, La/xdr0;->A:La/ot0;

    .line 23
    .line 24
    invoke-static {v2}, La/fre0;->d0(La/ot0;)La/pt0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    :goto_0
    const/4 v6, 0x0

    .line 35
    sget-object v7, La/o0s;->a:La/o0s;

    .line 36
    .line 37
    const-string v8, ""

    .line 38
    .line 39
    const/4 v9, 0x3

    .line 40
    if-ge v5, v9, :cond_0

    .line 41
    .line 42
    const-wide/16 v9, -0x1

    .line 43
    .line 44
    int-to-long v11, v5

    .line 45
    sub-long/2addr v9, v11

    .line 46
    new-instance v11, La/t7r0;

    .line 47
    .line 48
    new-instance v12, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$VirtualGames;

    .line 49
    .line 50
    invoke-direct {v12, v9, v10, v8}, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$VirtualGames;-><init>(JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v8, La/ijm;

    .line 54
    .line 55
    invoke-direct {v8}, La/ijm;-><init>()V

    .line 56
    .line 57
    .line 58
    sget-object v13, La/kjm;->a:La/kjm;

    .line 59
    .line 60
    invoke-direct {v11, v12, v6, v8}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v11}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance v6, La/qfr0;

    .line 67
    .line 68
    new-instance v8, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;

    .line 69
    .line 70
    invoke-direct {v8, v9, v10}, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;-><init>(J)V

    .line 71
    .line 72
    .line 73
    new-instance v9, La/aml;

    .line 74
    .line 75
    new-instance v10, La/wll;

    .line 76
    .line 77
    invoke-direct {v10, v7}, La/wll;-><init>(La/p0s;)V

    .line 78
    .line 79
    .line 80
    const/4 v7, 0x1

    .line 81
    invoke-direct {v9, v2, v10, v7}, La/aml;-><init>(La/pt0;La/yll;Z)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v6, v8, v9}, La/qfr0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;La/bml;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget-object v5, v0, La/pfr0;->c:Ljava/util/List;

    .line 98
    .line 99
    iget-object v9, v1, La/zer0;->a:La/ctf0;

    .line 100
    .line 101
    iget-object v1, v1, La/zer0;->c:La/n0o0;

    .line 102
    .line 103
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, La/fee;

    .line 108
    .line 109
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_1

    .line 130
    .line 131
    sget-object v1, La/iun;->a:La/iun;

    .line 132
    .line 133
    goto/16 :goto_9

    .line 134
    .line 135
    :cond_1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    if-eqz v11, :cond_16

    .line 148
    .line 149
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    check-cast v11, La/vh0;

    .line 154
    .line 155
    new-instance v12, La/t7r0;

    .line 156
    .line 157
    new-instance v13, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$VirtualGames;

    .line 158
    .line 159
    iget-wide v14, v11, La/vh0;->a:J

    .line 160
    .line 161
    iget-object v6, v11, La/vh0;->b:Ljava/lang/String;

    .line 162
    .line 163
    invoke-direct {v13, v14, v15, v6}, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$VirtualGames;-><init>(JLjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object v6, v11, La/vh0;->b:Ljava/lang/String;

    .line 167
    .line 168
    move/from16 p1, v1

    .line 169
    .line 170
    new-array v1, v4, [Ljava/lang/Object;

    .line 171
    .line 172
    move-object/from16 v30, v5

    .line 173
    .line 174
    iget-object v5, v9, La/ctf0;->b:La/lsm0;

    .line 175
    .line 176
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const v4, 0x7f1317c7

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v24

    .line 187
    new-instance v1, La/ue9;

    .line 188
    .line 189
    move-object/from16 v17, v6

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    new-array v6, v4, [Ljava/lang/Object;

    .line 193
    .line 194
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    const v4, 0x7f1300e4

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5, v4, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-direct {v1, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance v16, La/hjm;

    .line 209
    .line 210
    const/16 v28, 0x0

    .line 211
    .line 212
    const/16 v29, 0x1a7e

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    const/16 v19, 0x0

    .line 217
    .line 218
    const/16 v20, 0x0

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const/16 v23, 0x0

    .line 225
    .line 226
    sget-object v25, La/oqo0;->a:La/oqo0;

    .line 227
    .line 228
    const/16 v26, 0x0

    .line 229
    .line 230
    move-object/from16 v27, v1

    .line 231
    .line 232
    invoke-direct/range {v16 .. v29}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v1, v16

    .line 236
    .line 237
    sget-object v4, La/kjm;->a:La/kjm;

    .line 238
    .line 239
    sget-object v4, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;

    .line 240
    .line 241
    invoke-direct {v12, v13, v4, v1}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v10, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    long-to-int v1, v14

    .line 248
    new-instance v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;

    .line 249
    .line 250
    invoke-direct {v4, v14, v15}, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;-><init>(J)V

    .line 251
    .line 252
    .line 253
    new-instance v6, La/wll;

    .line 254
    .line 255
    invoke-direct {v6, v7}, La/wll;-><init>(La/p0s;)V

    .line 256
    .line 257
    .line 258
    iget-object v12, v11, La/vh0;->l:Ljava/util/List;

    .line 259
    .line 260
    new-instance v13, Ljava/util/ArrayList;

    .line 261
    .line 262
    const/16 v14, 0xa

    .line 263
    .line 264
    invoke-static {v12, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v12

    .line 275
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v14

    .line 279
    if-eqz v14, :cond_15

    .line 280
    .line 281
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    check-cast v14, La/mlr;

    .line 286
    .line 287
    iget-object v15, v11, La/vh0;->m:Ljava/util/List;

    .line 288
    .line 289
    invoke-interface {v15, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v15

    .line 293
    if-nez p1, :cond_2

    .line 294
    .line 295
    move/from16 v17, v1

    .line 296
    .line 297
    move-object/from16 v16, v7

    .line 298
    .line 299
    const/4 v1, 0x0

    .line 300
    goto :goto_4

    .line 301
    :cond_2
    if-eqz v15, :cond_3

    .line 302
    .line 303
    const v16, 0x7f080797

    .line 304
    .line 305
    .line 306
    :goto_3
    move/from16 v17, v1

    .line 307
    .line 308
    move/from16 v1, v16

    .line 309
    .line 310
    move-object/from16 v16, v7

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_3
    const v16, 0x7f080798

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :goto_4
    iget-boolean v7, v14, La/mlr;->k:Z

    .line 318
    .line 319
    move/from16 v18, v7

    .line 320
    .line 321
    iget-boolean v7, v14, La/mlr;->j:Z

    .line 322
    .line 323
    if-eqz v18, :cond_4

    .line 324
    .line 325
    move/from16 v18, v7

    .line 326
    .line 327
    move-object/from16 v19, v8

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    new-array v8, v7, [Ljava/lang/Object;

    .line 331
    .line 332
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    const v7, 0x7f1303e6

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5, v7, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    goto :goto_5

    .line 344
    :cond_4
    move/from16 v18, v7

    .line 345
    .line 346
    move-object/from16 v19, v8

    .line 347
    .line 348
    if-eqz v18, :cond_5

    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    new-array v8, v7, [Ljava/lang/Object;

    .line 352
    .line 353
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    const v7, 0x7f1303e2

    .line 358
    .line 359
    .line 360
    invoke-virtual {v5, v7, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    goto :goto_5

    .line 365
    :cond_5
    move-object/from16 v7, v19

    .line 366
    .line 367
    :goto_5
    new-instance v20, La/st0;

    .line 368
    .line 369
    move-object/from16 v31, v9

    .line 370
    .line 371
    iget-wide v8, v14, La/mlr;->a:J

    .line 372
    .line 373
    move-object/from16 v32, v5

    .line 374
    .line 375
    iget-object v5, v14, La/mlr;->f:Ljava/lang/String;

    .line 376
    .line 377
    move-object/from16 v23, v5

    .line 378
    .line 379
    iget-object v5, v14, La/mlr;->e:Ljava/lang/String;

    .line 380
    .line 381
    move-object/from16 v24, v5

    .line 382
    .line 383
    new-instance v5, La/mtr;

    .line 384
    .line 385
    invoke-direct {v5, v1, v15}, La/mtr;-><init>(IZ)V

    .line 386
    .line 387
    .line 388
    new-instance v1, La/n0x;

    .line 389
    .line 390
    iget-object v15, v14, La/mlr;->g:Ljava/lang/String;

    .line 391
    .line 392
    invoke-direct {v1, v15}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    new-instance v15, La/m0x;

    .line 396
    .line 397
    move-object/from16 v26, v1

    .line 398
    .line 399
    const v1, 0x7f0807c1

    .line 400
    .line 401
    .line 402
    move-object/from16 v25, v5

    .line 403
    .line 404
    const/4 v5, 0x6

    .line 405
    move-wide/from16 v21, v8

    .line 406
    .line 407
    const/4 v8, 0x0

    .line 408
    invoke-direct {v15, v1, v8, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 409
    .line 410
    .line 411
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v28

    .line 415
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-nez v1, :cond_6

    .line 420
    .line 421
    sget-object v1, La/lur;->a:La/lur;

    .line 422
    .line 423
    :goto_6
    move-object/from16 v29, v1

    .line 424
    .line 425
    move-object/from16 v27, v15

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_6
    new-instance v1, La/mur;

    .line 429
    .line 430
    iget-boolean v5, v14, La/mlr;->k:Z

    .line 431
    .line 432
    sget-object v9, La/pt0;->a:La/pt0;

    .line 433
    .line 434
    if-ne v2, v9, :cond_7

    .line 435
    .line 436
    if-nez v5, :cond_9

    .line 437
    .line 438
    :cond_7
    sget-object v14, La/pt0;->c:La/pt0;

    .line 439
    .line 440
    if-ne v2, v14, :cond_8

    .line 441
    .line 442
    if-nez v5, :cond_9

    .line 443
    .line 444
    :cond_8
    sget-object v8, La/pt0;->d:La/pt0;

    .line 445
    .line 446
    if-ne v2, v8, :cond_a

    .line 447
    .line 448
    if-eqz v5, :cond_a

    .line 449
    .line 450
    :cond_9
    new-instance v5, La/lro0;

    .line 451
    .line 452
    sget-object v8, La/d4d;->a:La/d4d;

    .line 453
    .line 454
    invoke-direct {v5}, La/lro0;-><init>()V

    .line 455
    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_a
    if-ne v2, v9, :cond_b

    .line 459
    .line 460
    if-nez v18, :cond_d

    .line 461
    .line 462
    :cond_b
    if-ne v2, v14, :cond_c

    .line 463
    .line 464
    if-nez v18, :cond_d

    .line 465
    .line 466
    :cond_c
    if-ne v2, v8, :cond_e

    .line 467
    .line 468
    if-eqz v18, :cond_e

    .line 469
    .line 470
    :cond_d
    new-instance v5, La/eqo0;

    .line 471
    .line 472
    sget-object v8, La/d4d;->a:La/d4d;

    .line 473
    .line 474
    invoke-direct {v5}, La/eqo0;-><init>()V

    .line 475
    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_e
    sget-object v8, La/pt0;->b:La/pt0;

    .line 479
    .line 480
    if-ne v2, v8, :cond_f

    .line 481
    .line 482
    if-nez v5, :cond_10

    .line 483
    .line 484
    :cond_f
    sget-object v9, La/pt0;->e:La/pt0;

    .line 485
    .line 486
    if-ne v2, v9, :cond_11

    .line 487
    .line 488
    if-eqz v5, :cond_11

    .line 489
    .line 490
    :cond_10
    sget-object v5, La/kro0;->a:La/kro0;

    .line 491
    .line 492
    goto :goto_7

    .line 493
    :cond_11
    if-ne v2, v8, :cond_12

    .line 494
    .line 495
    if-nez v18, :cond_13

    .line 496
    .line 497
    :cond_12
    if-ne v2, v9, :cond_14

    .line 498
    .line 499
    if-eqz v18, :cond_14

    .line 500
    .line 501
    :cond_13
    sget-object v5, La/dqo0;->a:La/dqo0;

    .line 502
    .line 503
    goto :goto_7

    .line 504
    :cond_14
    new-instance v5, La/uqo0;

    .line 505
    .line 506
    sget-object v8, La/d4d;->a:La/d4d;

    .line 507
    .line 508
    invoke-direct {v5, v8}, La/uqo0;-><init>(La/d4d;)V

    .line 509
    .line 510
    .line 511
    :goto_7
    invoke-direct {v1, v7, v5}, La/mur;-><init>(Ljava/lang/String;La/sso0;)V

    .line 512
    .line 513
    .line 514
    goto :goto_6

    .line 515
    :goto_8
    invoke-direct/range {v20 .. v29}, La/st0;-><init>(JLjava/lang/String;Ljava/lang/String;La/mtr;La/o0x;La/o0x;Ljava/lang/Integer;La/nur;)V

    .line 516
    .line 517
    .line 518
    move-object/from16 v1, v20

    .line 519
    .line 520
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-object/from16 v7, v16

    .line 524
    .line 525
    move/from16 v1, v17

    .line 526
    .line 527
    move-object/from16 v8, v19

    .line 528
    .line 529
    move-object/from16 v9, v31

    .line 530
    .line 531
    move-object/from16 v5, v32

    .line 532
    .line 533
    goto/16 :goto_2

    .line 534
    .line 535
    :cond_15
    move-object/from16 v16, v7

    .line 536
    .line 537
    move-object/from16 v19, v8

    .line 538
    .line 539
    move-object/from16 v31, v9

    .line 540
    .line 541
    new-instance v1, La/zll;

    .line 542
    .line 543
    invoke-direct {v1, v2, v6, v13}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 544
    .line 545
    .line 546
    new-instance v5, La/qfr0;

    .line 547
    .line 548
    invoke-direct {v5, v4, v1}, La/qfr0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$VirtualGames;La/bml;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v10, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move/from16 v1, p1

    .line 555
    .line 556
    move-object/from16 v5, v30

    .line 557
    .line 558
    const/4 v4, 0x0

    .line 559
    const/4 v6, 0x0

    .line 560
    goto/16 :goto_1

    .line 561
    .line 562
    :cond_16
    invoke-static {v10}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    :goto_9
    invoke-static {v0, v3, v1}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xer0;->a:B

    .line 4
    .line 5
    const-string v3, "static"

    .line 6
    .line 7
    const-string v4, "svg"

    .line 8
    .line 9
    const-string v5, "sports_v2"

    .line 10
    .line 11
    const-string v6, ".svg"

    .line 12
    .line 13
    const-string v9, ""

    .line 14
    .line 15
    sget-object v12, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$CyberTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$CyberTag;

    .line 16
    .line 17
    const-string v13, "/"

    .line 18
    .line 19
    const-string v14, "https://"

    .line 20
    .line 21
    const-wide/16 v16, 0x0

    .line 22
    .line 23
    const/16 v8, 0xa

    .line 24
    .line 25
    iget-object v2, v0, La/xer0;->b:La/zer0;

    .line 26
    .line 27
    const/4 v10, 0x2

    .line 28
    const/4 v7, 0x0

    .line 29
    const/16 v22, 0x1

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    move-object/from16 v0, p1

    .line 36
    .line 37
    check-cast v0, La/n2r0;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v1, La/t7r0;

    .line 43
    .line 44
    new-instance v3, La/ijm;

    .line 45
    .line 46
    invoke-direct {v3}, La/ijm;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v4, La/kjm;->a:La/kjm;

    .line 50
    .line 51
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Disciplines;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Disciplines;

    .line 52
    .line 53
    invoke-direct {v1, v4, v7, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, La/o2r0;

    .line 57
    .line 58
    sget-object v5, La/avl;->a:La/avl;

    .line 59
    .line 60
    invoke-direct {v3, v5}, La/o2r0;-><init>(La/bvl;)V

    .line 61
    .line 62
    .line 63
    new-array v5, v10, [La/qdr0;

    .line 64
    .line 65
    aput-object v1, v5, v11

    .line 66
    .line 67
    aput-object v3, v5, v22

    .line 68
    .line 69
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v3, v0, La/n2r0;->c:Ljava/util/List;

    .line 74
    .line 75
    iget-object v2, v2, La/zer0;->a:La/ctf0;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_0

    .line 88
    .line 89
    sget-object v2, La/iun;->a:La/iun;

    .line 90
    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, La/ypl0;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v7, La/cvl;

    .line 122
    .line 123
    iget-wide v8, v6, La/ypl0;->a:J

    .line 124
    .line 125
    long-to-int v8, v8

    .line 126
    new-instance v9, La/n0x;

    .line 127
    .line 128
    new-instance v10, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v10, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v15, v6, La/ypl0;->c:La/lel0;

    .line 136
    .line 137
    iget-object v15, v15, La/lel0;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    if-nez v16, :cond_1

    .line 147
    .line 148
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 149
    .line 150
    .line 151
    move-object/from16 p0, v3

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_1
    move-object/from16 p0, v3

    .line 155
    .line 156
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v15, v3, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-nez v3, :cond_2

    .line 163
    .line 164
    invoke-static {v15, v14, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_3

    .line 169
    .line 170
    :cond_2
    move v3, v11

    .line 171
    goto :goto_2

    .line 172
    :cond_3
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-lez v3, :cond_4

    .line 177
    .line 178
    invoke-static {v10, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_4

    .line 183
    .line 184
    const/16 v3, 0x2f

    .line 185
    .line 186
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    move/from16 v24, v3

    .line 190
    .line 191
    move/from16 v25, v11

    .line 192
    .line 193
    move/from16 v3, v22

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_4
    move/from16 v25, v11

    .line 197
    .line 198
    move/from16 v3, v22

    .line 199
    .line 200
    const/16 v24, 0x2f

    .line 201
    .line 202
    :goto_1
    new-array v11, v3, [C

    .line 203
    .line 204
    aput-char v24, v11, v25

    .line 205
    .line 206
    invoke-static {v15, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :goto_2
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    :goto_3
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-direct {v9, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const v3, 0x7f080457

    .line 228
    .line 229
    .line 230
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-object v6, v6, La/ypl0;->b:Ljava/lang/String;

    .line 235
    .line 236
    invoke-direct {v7, v8, v9, v3, v6}, La/cvl;-><init>(ILa/n0x;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-object/from16 v3, p0

    .line 243
    .line 244
    const/4 v10, 0x2

    .line 245
    const/4 v11, 0x0

    .line 246
    const/16 v22, 0x1

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_5
    invoke-static {v5}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    new-instance v5, La/t7r0;

    .line 255
    .line 256
    const/4 v6, 0x0

    .line 257
    new-array v7, v6, [Ljava/lang/Object;

    .line 258
    .line 259
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 260
    .line 261
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    const v8, 0x7f1306e2

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v27

    .line 272
    new-array v7, v6, [Ljava/lang/Object;

    .line 273
    .line 274
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    const v8, 0x7f130366

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v34

    .line 285
    new-instance v7, La/ue9;

    .line 286
    .line 287
    new-array v8, v6, [Ljava/lang/Object;

    .line 288
    .line 289
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    const v6, 0x7f1300e4

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v6, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-direct {v7, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    new-instance v26, La/hjm;

    .line 304
    .line 305
    const/16 v38, 0x0

    .line 306
    .line 307
    const/16 v39, 0x1a7e

    .line 308
    .line 309
    const/16 v28, 0x0

    .line 310
    .line 311
    const/16 v29, 0x0

    .line 312
    .line 313
    const/16 v30, 0x0

    .line 314
    .line 315
    const/16 v31, 0x0

    .line 316
    .line 317
    const/16 v32, 0x0

    .line 318
    .line 319
    const/16 v33, 0x0

    .line 320
    .line 321
    sget-object v35, La/cso0;->a:La/cso0;

    .line 322
    .line 323
    const/16 v36, 0x0

    .line 324
    .line 325
    move-object/from16 v37, v7

    .line 326
    .line 327
    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v2, v26

    .line 331
    .line 332
    sget-object v6, La/kjm;->a:La/kjm;

    .line 333
    .line 334
    invoke-direct {v5, v4, v12, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 335
    .line 336
    .line 337
    new-instance v2, La/o2r0;

    .line 338
    .line 339
    new-instance v4, La/zul;

    .line 340
    .line 341
    invoke-direct {v4, v3}, La/zul;-><init>(La/a4x;)V

    .line 342
    .line 343
    .line 344
    invoke-direct {v2, v4}, La/o2r0;-><init>(La/bvl;)V

    .line 345
    .line 346
    .line 347
    const/4 v3, 0x2

    .line 348
    new-array v3, v3, [La/qdr0;

    .line 349
    .line 350
    const/16 v25, 0x0

    .line 351
    .line 352
    aput-object v5, v3, v25

    .line 353
    .line 354
    const/16 v22, 0x1

    .line 355
    .line 356
    aput-object v2, v3, v22

    .line 357
    .line 358
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    :goto_4
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    return-object v0

    .line 367
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/xer0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    return-object v0

    .line 372
    :pswitch_1
    move-object/from16 v0, p1

    .line 373
    .line 374
    check-cast v0, La/eyq0;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    new-instance v1, La/fyq0;

    .line 380
    .line 381
    sget-object v3, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$PromoGames;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$PromoGames;

    .line 382
    .line 383
    sget-object v4, La/iml;->a:La/iml;

    .line 384
    .line 385
    invoke-direct {v1, v3, v4}, La/fyq0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;La/jml;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    iget-object v3, v0, La/eyq0;->c:La/cic0;

    .line 393
    .line 394
    if-eqz v3, :cond_a

    .line 395
    .line 396
    iget-object v4, v2, La/zer0;->a:La/ctf0;

    .line 397
    .line 398
    iget-object v2, v2, La/zer0;->c:La/n0o0;

    .line 399
    .line 400
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    check-cast v2, La/fee;

    .line 405
    .line 406
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    check-cast v2, Ljava/lang/Boolean;

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iget-object v5, v3, La/cic0;->a:La/uhc0;

    .line 420
    .line 421
    iget-object v3, v3, La/cic0;->b:Ljava/util/List;

    .line 422
    .line 423
    iget-object v6, v5, La/uhc0;->a:La/jic0;

    .line 424
    .line 425
    iget-object v8, v5, La/uhc0;->b:La/jic0;

    .line 426
    .line 427
    iget-boolean v9, v8, La/jic0;->k:Z

    .line 428
    .line 429
    iget-boolean v10, v6, La/jic0;->k:Z

    .line 430
    .line 431
    if-eqz v10, :cond_6

    .line 432
    .line 433
    sget-object v10, La/nw80;->b:La/nw80;

    .line 434
    .line 435
    invoke-static {v6, v2, v3, v10, v4}, La/k5n0;->F(La/jic0;ZLjava/util/List;La/nw80;La/ctf0;)La/eml;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    goto :goto_5

    .line 440
    :cond_6
    if-eqz v9, :cond_9

    .line 441
    .line 442
    sget-object v6, La/nw80;->a:La/nw80;

    .line 443
    .line 444
    invoke-static {v8, v2, v3, v6, v4}, La/k5n0;->F(La/jic0;ZLjava/util/List;La/nw80;La/ctf0;)La/eml;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    :goto_5
    iget-object v5, v5, La/uhc0;->a:La/jic0;

    .line 449
    .line 450
    iget-boolean v5, v5, La/jic0;->k:Z

    .line 451
    .line 452
    if-eqz v5, :cond_7

    .line 453
    .line 454
    if-eqz v9, :cond_7

    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_7
    move-object v8, v7

    .line 458
    :goto_6
    if-eqz v8, :cond_8

    .line 459
    .line 460
    sget-object v5, La/nw80;->a:La/nw80;

    .line 461
    .line 462
    invoke-static {v8, v2, v3, v5, v4}, La/k5n0;->F(La/jic0;ZLjava/util/List;La/nw80;La/ctf0;)La/eml;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    :cond_8
    new-instance v2, La/fyq0;

    .line 467
    .line 468
    new-instance v3, La/hml;

    .line 469
    .line 470
    invoke-direct {v3, v6, v7}, La/hml;-><init>(La/eml;La/eml;)V

    .line 471
    .line 472
    .line 473
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$PromoGames;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Aggregator$PromoGames;

    .line 474
    .line 475
    invoke-direct {v2, v4, v3}, La/fyq0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey;La/jml;)V

    .line 476
    .line 477
    .line 478
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    goto :goto_7

    .line 483
    :cond_9
    sget-object v2, La/iun;->a:La/iun;

    .line 484
    .line 485
    :goto_7
    if-nez v2, :cond_b

    .line 486
    .line 487
    :cond_a
    sget-object v2, La/iun;->a:La/iun;

    .line 488
    .line 489
    :cond_b
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    return-object v0

    .line 494
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/xer0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    return-object v0

    .line 499
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/xer0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    return-object v0

    .line 504
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/xer0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    return-object v0

    .line 509
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/xer0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    return-object v0

    .line 514
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/xer0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    return-object v0

    .line 519
    :pswitch_7
    move-object/from16 v0, p1

    .line 520
    .line 521
    check-cast v0, La/zxq0;

    .line 522
    .line 523
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    new-instance v1, La/t7r0;

    .line 527
    .line 528
    new-instance v3, La/ijm;

    .line 529
    .line 530
    invoke-direct {v3}, La/ijm;-><init>()V

    .line 531
    .line 532
    .line 533
    sget-object v4, La/kjm;->a:La/kjm;

    .line 534
    .line 535
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$MonthProvider;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Aggregator$MonthProvider;

    .line 536
    .line 537
    invoke-direct {v1, v4, v7, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 538
    .line 539
    .line 540
    new-instance v3, La/byq0;

    .line 541
    .line 542
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 543
    .line 544
    .line 545
    const/4 v5, 0x2

    .line 546
    new-array v5, v5, [La/qdr0;

    .line 547
    .line 548
    const/16 v25, 0x0

    .line 549
    .line 550
    aput-object v1, v5, v25

    .line 551
    .line 552
    const/16 v22, 0x1

    .line 553
    .line 554
    aput-object v3, v5, v22

    .line 555
    .line 556
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    iget-object v3, v0, La/zxq0;->c:La/uhc0;

    .line 561
    .line 562
    if-eqz v3, :cond_13

    .line 563
    .line 564
    iget-object v5, v2, La/zer0;->a:La/ctf0;

    .line 565
    .line 566
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    check-cast v2, La/xdr0;

    .line 575
    .line 576
    iget-boolean v2, v2, La/xdr0;->h:Z

    .line 577
    .line 578
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    new-instance v7, La/t7r0;

    .line 586
    .line 587
    const/4 v8, 0x0

    .line 588
    new-array v9, v8, [Ljava/lang/Object;

    .line 589
    .line 590
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 591
    .line 592
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v9

    .line 596
    const v10, 0x7f131241

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v27

    .line 603
    new-array v9, v8, [Ljava/lang/Object;

    .line 604
    .line 605
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v9

    .line 609
    const v8, 0x7f1303ce

    .line 610
    .line 611
    .line 612
    invoke-virtual {v5, v8, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v34

    .line 616
    new-instance v26, La/hjm;

    .line 617
    .line 618
    const/16 v38, 0x0

    .line 619
    .line 620
    const/16 v39, 0x1e7e

    .line 621
    .line 622
    const/16 v28, 0x0

    .line 623
    .line 624
    const/16 v29, 0x0

    .line 625
    .line 626
    const/16 v30, 0x0

    .line 627
    .line 628
    const/16 v31, 0x0

    .line 629
    .line 630
    const/16 v32, 0x0

    .line 631
    .line 632
    const/16 v33, 0x0

    .line 633
    .line 634
    sget-object v35, La/oqo0;->a:La/oqo0;

    .line 635
    .line 636
    const/16 v36, 0x0

    .line 637
    .line 638
    const/16 v37, 0x0

    .line 639
    .line 640
    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 641
    .line 642
    .line 643
    move-object/from16 v8, v26

    .line 644
    .line 645
    sget-object v9, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$AggregatorTag;

    .line 646
    .line 647
    invoke-direct {v7, v4, v9, v8}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    iget-object v3, v3, La/uhc0;->c:La/eoc0;

    .line 654
    .line 655
    iget-boolean v4, v3, La/eoc0;->g:Z

    .line 656
    .line 657
    if-eqz v4, :cond_12

    .line 658
    .line 659
    new-instance v4, Ljava/lang/StringBuilder;

    .line 660
    .line 661
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 662
    .line 663
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    if-eqz v2, :cond_c

    .line 667
    .line 668
    iget-object v2, v3, La/eoc0;->b:Ljava/lang/String;

    .line 669
    .line 670
    goto :goto_8

    .line 671
    :cond_c
    iget-object v2, v3, La/eoc0;->c:Ljava/lang/String;

    .line 672
    .line 673
    :goto_8
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    if-eqz v7, :cond_d

    .line 678
    .line 679
    iget-object v2, v3, La/eoc0;->a:Ljava/lang/String;

    .line 680
    .line 681
    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    if-nez v7, :cond_e

    .line 686
    .line 687
    const/4 v8, 0x0

    .line 688
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 689
    .line 690
    .line 691
    move v9, v8

    .line 692
    goto :goto_c

    .line 693
    :cond_e
    const/4 v8, 0x0

    .line 694
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 695
    .line 696
    invoke-static {v2, v7, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    if-nez v7, :cond_11

    .line 701
    .line 702
    invoke-static {v2, v14, v8}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 703
    .line 704
    .line 705
    move-result v7

    .line 706
    if-eqz v7, :cond_f

    .line 707
    .line 708
    const/4 v9, 0x0

    .line 709
    goto :goto_b

    .line 710
    :cond_f
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 711
    .line 712
    .line 713
    move-result v7

    .line 714
    if-lez v7, :cond_10

    .line 715
    .line 716
    invoke-static {v4, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 717
    .line 718
    .line 719
    move-result v7

    .line 720
    if-nez v7, :cond_10

    .line 721
    .line 722
    const/16 v7, 0x2f

    .line 723
    .line 724
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    :goto_9
    const/4 v8, 0x1

    .line 728
    goto :goto_a

    .line 729
    :cond_10
    const/16 v7, 0x2f

    .line 730
    .line 731
    goto :goto_9

    .line 732
    :goto_a
    new-array v8, v8, [C

    .line 733
    .line 734
    const/4 v9, 0x0

    .line 735
    aput-char v7, v8, v9

    .line 736
    .line 737
    invoke-static {v2, v8}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    goto :goto_c

    .line 745
    :cond_11
    move v9, v8

    .line 746
    :goto_b
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    :goto_c
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v11

    .line 756
    iget v12, v3, La/eoc0;->e:I

    .line 757
    .line 758
    iget-object v13, v3, La/eoc0;->f:Ljava/lang/String;

    .line 759
    .line 760
    new-array v2, v9, [Ljava/lang/Object;

    .line 761
    .line 762
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    const v4, 0x7f1303e9

    .line 767
    .line 768
    .line 769
    invoke-virtual {v5, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v14

    .line 773
    iget-object v15, v3, La/eoc0;->h:Ljava/lang/String;

    .line 774
    .line 775
    iget-object v2, v3, La/eoc0;->j:Ljava/util/List;

    .line 776
    .line 777
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 778
    .line 779
    .line 780
    move-result-object v17

    .line 781
    iget-object v2, v3, La/eoc0;->i:La/gz8;

    .line 782
    .line 783
    iget-object v3, v3, La/eoc0;->d:Ljava/lang/String;

    .line 784
    .line 785
    new-instance v10, La/ayq0;

    .line 786
    .line 787
    move-object/from16 v16, v2

    .line 788
    .line 789
    move-object/from16 v18, v3

    .line 790
    .line 791
    invoke-direct/range {v10 .. v18}, La/ayq0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/gz8;La/a4x;Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v6, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    :cond_12
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    if-nez v2, :cond_14

    .line 802
    .line 803
    :cond_13
    sget-object v2, La/iun;->a:La/iun;

    .line 804
    .line 805
    :cond_14
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    return-object v0

    .line 810
    :pswitch_8
    move-object/from16 v0, p1

    .line 811
    .line 812
    check-cast v0, La/her0;

    .line 813
    .line 814
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    new-instance v1, La/t7r0;

    .line 818
    .line 819
    new-instance v3, La/ijm;

    .line 820
    .line 821
    invoke-direct {v3}, La/ijm;-><init>()V

    .line 822
    .line 823
    .line 824
    sget-object v4, La/kjm;->a:La/kjm;

    .line 825
    .line 826
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Sport$Champs$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Sport$Champs$Live;

    .line 827
    .line 828
    invoke-direct {v1, v4, v7, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 829
    .line 830
    .line 831
    new-instance v3, La/jer0;

    .line 832
    .line 833
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 834
    .line 835
    .line 836
    const/4 v5, 0x2

    .line 837
    new-array v6, v5, [La/qdr0;

    .line 838
    .line 839
    const/16 v25, 0x0

    .line 840
    .line 841
    aput-object v1, v6, v25

    .line 842
    .line 843
    const/16 v22, 0x1

    .line 844
    .line 845
    aput-object v3, v6, v22

    .line 846
    .line 847
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    iget-object v3, v0, La/her0;->c:Ljava/util/List;

    .line 852
    .line 853
    iget-object v5, v2, La/zer0;->a:La/ctf0;

    .line 854
    .line 855
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 856
    .line 857
    .line 858
    move-result-object v6

    .line 859
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v6

    .line 863
    check-cast v6, La/xdr0;

    .line 864
    .line 865
    iget-object v6, v6, La/xdr0;->v:La/wcb;

    .line 866
    .line 867
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    check-cast v2, La/xdr0;

    .line 876
    .line 877
    iget-boolean v2, v2, La/xdr0;->i:Z

    .line 878
    .line 879
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 886
    .line 887
    .line 888
    move-result v10

    .line 889
    if-eqz v10, :cond_15

    .line 890
    .line 891
    sget-object v2, La/iun;->a:La/iun;

    .line 892
    .line 893
    goto/16 :goto_19

    .line 894
    .line 895
    :cond_15
    new-instance v10, Ljava/util/ArrayList;

    .line 896
    .line 897
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 898
    .line 899
    .line 900
    move-result v11

    .line 901
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 902
    .line 903
    .line 904
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 909
    .line 910
    .line 911
    move-result v11

    .line 912
    if-eqz v11, :cond_1b

    .line 913
    .line 914
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v11

    .line 918
    check-cast v11, La/rbb;

    .line 919
    .line 920
    if-eqz v6, :cond_17

    .line 921
    .line 922
    iget-wide v12, v11, La/rbb;->n:J

    .line 923
    .line 924
    iget-object v14, v11, La/rbb;->d:Ljava/util/List;

    .line 925
    .line 926
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v14

    .line 930
    check-cast v14, La/sum0;

    .line 931
    .line 932
    if-eqz v14, :cond_16

    .line 933
    .line 934
    iget-wide v14, v14, La/sum0;->l:J

    .line 935
    .line 936
    goto :goto_e

    .line 937
    :cond_16
    iget-wide v14, v11, La/rbb;->n:J

    .line 938
    .line 939
    :goto_e
    invoke-virtual {v6, v12, v13, v14, v15}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v12

    .line 943
    goto :goto_f

    .line 944
    :cond_17
    move-object v12, v7

    .line 945
    :goto_f
    if-nez v12, :cond_18

    .line 946
    .line 947
    move-object/from16 v40, v9

    .line 948
    .line 949
    goto :goto_10

    .line 950
    :cond_18
    move-object/from16 v40, v12

    .line 951
    .line 952
    :goto_10
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    iget-wide v12, v11, La/rbb;->a:J

    .line 956
    .line 957
    iget-wide v14, v11, La/rbb;->b:J

    .line 958
    .line 959
    iget-object v7, v11, La/rbb;->c:Ljava/lang/String;

    .line 960
    .line 961
    iget-object v8, v11, La/rbb;->g:Ljava/lang/String;

    .line 962
    .line 963
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    move/from16 v38, v2

    .line 967
    .line 968
    new-instance v2, La/pcb;

    .line 969
    .line 970
    invoke-direct {v2, v8}, La/pcb;-><init>(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    iget-object v8, v11, La/rbb;->h:Ljava/lang/String;

    .line 974
    .line 975
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    move-object/from16 p0, v3

    .line 979
    .line 980
    new-instance v3, La/pcb;

    .line 981
    .line 982
    invoke-direct {v3, v8}, La/pcb;-><init>(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    iget v8, v11, La/rbb;->k:I

    .line 986
    .line 987
    move-object/from16 v18, v6

    .line 988
    .line 989
    move-object/from16 v35, v7

    .line 990
    .line 991
    int-to-long v6, v8

    .line 992
    invoke-static {v2, v3, v6, v7}, La/rcb;->d0(La/qcb;La/qcb;J)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v36

    .line 996
    iget-boolean v2, v11, La/rbb;->l:Z

    .line 997
    .line 998
    iget-object v3, v11, La/rbb;->o:La/pgb;

    .line 999
    .line 1000
    iget-wide v6, v11, La/rbb;->n:J

    .line 1001
    .line 1002
    iget-object v8, v11, La/rbb;->p:Ljava/util/List;

    .line 1003
    .line 1004
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v21

    .line 1008
    move/from16 v37, v2

    .line 1009
    .line 1010
    move-object/from16 v2, v21

    .line 1011
    .line 1012
    check-cast v2, La/ygs;

    .line 1013
    .line 1014
    move-object/from16 v39, v3

    .line 1015
    .line 1016
    if-eqz v2, :cond_19

    .line 1017
    .line 1018
    iget-wide v2, v2, La/ygs;->B:J

    .line 1019
    .line 1020
    move-wide/from16 v31, v2

    .line 1021
    .line 1022
    goto :goto_11

    .line 1023
    :cond_19
    move-wide/from16 v31, v16

    .line 1024
    .line 1025
    :goto_11
    iget-boolean v2, v11, La/rbb;->m:Z

    .line 1026
    .line 1027
    move/from16 v41, v2

    .line 1028
    .line 1029
    iget-wide v2, v11, La/rbb;->f:J

    .line 1030
    .line 1031
    long-to-int v2, v2

    .line 1032
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v3

    .line 1036
    check-cast v3, La/ygs;

    .line 1037
    .line 1038
    move/from16 v42, v2

    .line 1039
    .line 1040
    if-eqz v3, :cond_1a

    .line 1041
    .line 1042
    iget-wide v2, v3, La/ygs;->a:J

    .line 1043
    .line 1044
    move-wide/from16 v43, v2

    .line 1045
    .line 1046
    goto :goto_12

    .line 1047
    :cond_1a
    move-wide/from16 v43, v16

    .line 1048
    .line 1049
    :goto_12
    new-instance v26, La/l1b0;

    .line 1050
    .line 1051
    move-wide/from16 v29, v6

    .line 1052
    .line 1053
    move-wide/from16 v27, v12

    .line 1054
    .line 1055
    move-wide/from16 v33, v14

    .line 1056
    .line 1057
    invoke-direct/range {v26 .. v44}, La/l1b0;-><init>(JJJJLjava/lang/String;Ljava/lang/String;ZZLa/pgb;Ljava/lang/String;ZIJ)V

    .line 1058
    .line 1059
    .line 1060
    move-object/from16 v2, v26

    .line 1061
    .line 1062
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    move-object/from16 v3, p0

    .line 1066
    .line 1067
    move-object/from16 v6, v18

    .line 1068
    .line 1069
    move/from16 v2, v38

    .line 1070
    .line 1071
    const/4 v7, 0x0

    .line 1072
    const/16 v8, 0xa

    .line 1073
    .line 1074
    goto/16 :goto_d

    .line 1075
    .line 1076
    :cond_1b
    new-instance v2, Ljava/util/ArrayList;

    .line 1077
    .line 1078
    const/16 v3, 0xa

    .line 1079
    .line 1080
    invoke-static {v10, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1081
    .line 1082
    .line 1083
    move-result v3

    .line 1084
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v3

    .line 1091
    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v6

    .line 1095
    if-eqz v6, :cond_21

    .line 1096
    .line 1097
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v6

    .line 1101
    check-cast v6, La/l1b0;

    .line 1102
    .line 1103
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1104
    .line 1105
    .line 1106
    iget-wide v7, v6, La/l1b0;->a:J

    .line 1107
    .line 1108
    new-instance v9, La/zrm;

    .line 1109
    .line 1110
    new-instance v10, La/a2l0;

    .line 1111
    .line 1112
    iget-object v11, v6, La/l1b0;->e:Ljava/lang/String;

    .line 1113
    .line 1114
    const v12, 0x7f040b72

    .line 1115
    .line 1116
    .line 1117
    invoke-static {v12, v5}, La/ctf0;->b(ILa/ctf0;)I

    .line 1118
    .line 1119
    .line 1120
    move-result v12

    .line 1121
    invoke-static {v12}, La/fbc;->d(I)J

    .line 1122
    .line 1123
    .line 1124
    move-result-wide v12

    .line 1125
    invoke-direct {v10, v11, v12, v13}, La/a2l0;-><init>(Ljava/lang/String;J)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v27, La/p1l0;->c:La/p1l0;

    .line 1129
    .line 1130
    sget-object v11, La/p1l0;->b:La/p1l0;

    .line 1131
    .line 1132
    iget-object v11, v6, La/l1b0;->f:Ljava/lang/String;

    .line 1133
    .line 1134
    iget-object v12, v6, La/l1b0;->j:Ljava/lang/String;

    .line 1135
    .line 1136
    iget-object v13, v6, La/l1b0;->i:La/pgb;

    .line 1137
    .line 1138
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 1139
    .line 1140
    .line 1141
    move-result v13

    .line 1142
    if-eqz v13, :cond_1e

    .line 1143
    .line 1144
    const/4 v14, 0x1

    .line 1145
    if-eq v13, v14, :cond_1d

    .line 1146
    .line 1147
    const/4 v14, 0x2

    .line 1148
    if-ne v13, v14, :cond_1c

    .line 1149
    .line 1150
    new-instance v13, La/of5;

    .line 1151
    .line 1152
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1153
    .line 1154
    .line 1155
    :goto_14
    move-object/from16 v28, v13

    .line 1156
    .line 1157
    goto :goto_15

    .line 1158
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1159
    .line 1160
    .line 1161
    const/4 v7, 0x0

    .line 1162
    goto/16 :goto_1a

    .line 1163
    .line 1164
    :cond_1d
    new-instance v13, La/pf5;

    .line 1165
    .line 1166
    const/4 v14, 0x3

    .line 1167
    const/4 v15, 0x0

    .line 1168
    invoke-direct {v13, v14, v15}, La/pf5;-><init>(ILa/y3d;)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_14

    .line 1172
    :cond_1e
    const/16 v28, 0x0

    .line 1173
    .line 1174
    :goto_15
    sget-object v13, La/s6t0;->a:La/pz40;

    .line 1175
    .line 1176
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v13

    .line 1180
    iget-object v13, v13, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1181
    .line 1182
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1183
    .line 1184
    .line 1185
    move-result-wide v13

    .line 1186
    new-instance v26, La/s1l0;

    .line 1187
    .line 1188
    new-instance v15, La/y3d;

    .line 1189
    .line 1190
    invoke-direct {v15, v13, v14}, La/y3d;-><init>(J)V

    .line 1191
    .line 1192
    .line 1193
    const/16 v32, 0x20

    .line 1194
    .line 1195
    move-object/from16 v29, v11

    .line 1196
    .line 1197
    move-object/from16 v30, v12

    .line 1198
    .line 1199
    move-object/from16 v31, v15

    .line 1200
    .line 1201
    invoke-direct/range {v26 .. v32}, La/s1l0;-><init>(La/p1l0;La/uf5;Ljava/lang/String;Ljava/lang/String;La/y3d;I)V

    .line 1202
    .line 1203
    .line 1204
    iget-boolean v11, v6, La/l1b0;->h:Z

    .line 1205
    .line 1206
    if-nez v11, :cond_20

    .line 1207
    .line 1208
    new-instance v11, La/e3l0;

    .line 1209
    .line 1210
    iget v12, v6, La/l1b0;->l:I

    .line 1211
    .line 1212
    new-instance v13, La/kpe;

    .line 1213
    .line 1214
    invoke-direct {v13}, La/kpe;-><init>()V

    .line 1215
    .line 1216
    .line 1217
    iget-boolean v14, v6, La/l1b0;->g:Z

    .line 1218
    .line 1219
    if-eqz v14, :cond_1f

    .line 1220
    .line 1221
    const v14, 0x7f08090a

    .line 1222
    .line 1223
    .line 1224
    :goto_16
    const/4 v15, 0x0

    .line 1225
    goto :goto_17

    .line 1226
    :cond_1f
    const v14, 0x7f08090b

    .line 1227
    .line 1228
    .line 1229
    goto :goto_16

    .line 1230
    :goto_17
    invoke-direct {v11, v12, v13, v14, v15}, La/e3l0;-><init>(ILa/ope;ILjava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    move-object v12, v11

    .line 1234
    goto :goto_18

    .line 1235
    :cond_20
    const/4 v12, 0x0

    .line 1236
    :goto_18
    sget-object v13, La/d4d;->B:La/d4d;

    .line 1237
    .line 1238
    new-instance v14, La/l3l0;

    .line 1239
    .line 1240
    sget-object v11, La/qmk;->a:La/zcl;

    .line 1241
    .line 1242
    const/high16 v11, 0x41800000    # 16.0f

    .line 1243
    .line 1244
    invoke-direct {v14, v11}, La/l3l0;-><init>(F)V

    .line 1245
    .line 1246
    .line 1247
    const/16 v15, 0x20

    .line 1248
    .line 1249
    move-object/from16 v11, v26

    .line 1250
    .line 1251
    invoke-direct/range {v9 .. v15}, La/zrm;-><init>(La/f2l0;La/u1l0;La/g3l0;La/d4d;La/n3l0;I)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v10, La/ger0;

    .line 1255
    .line 1256
    invoke-direct {v10, v7, v8, v9, v6}, La/ger0;-><init>(JLa/zrm;La/l1b0;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1260
    .line 1261
    .line 1262
    goto/16 :goto_13

    .line 1263
    .line 1264
    :cond_21
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    new-instance v3, La/t7r0;

    .line 1269
    .line 1270
    const/4 v8, 0x0

    .line 1271
    new-array v6, v8, [Ljava/lang/Object;

    .line 1272
    .line 1273
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 1274
    .line 1275
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v6

    .line 1279
    const v7, 0x7f131343

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v5, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v27

    .line 1286
    new-array v6, v8, [Ljava/lang/Object;

    .line 1287
    .line 1288
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v6

    .line 1292
    const v7, 0x7f131487

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v5, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v34

    .line 1299
    new-instance v6, La/ue9;

    .line 1300
    .line 1301
    new-array v7, v8, [Ljava/lang/Object;

    .line 1302
    .line 1303
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v7

    .line 1307
    const v8, 0x7f1300e4

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v5, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    invoke-direct {v6, v5}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    new-instance v26, La/hjm;

    .line 1318
    .line 1319
    const/16 v38, 0x0

    .line 1320
    .line 1321
    const/16 v39, 0x1a7e

    .line 1322
    .line 1323
    const/16 v28, 0x0

    .line 1324
    .line 1325
    const/16 v29, 0x0

    .line 1326
    .line 1327
    const/16 v30, 0x0

    .line 1328
    .line 1329
    const/16 v31, 0x0

    .line 1330
    .line 1331
    const/16 v32, 0x0

    .line 1332
    .line 1333
    const/16 v33, 0x0

    .line 1334
    .line 1335
    sget-object v35, La/sqo0;->a:La/sqo0;

    .line 1336
    .line 1337
    const/16 v36, 0x0

    .line 1338
    .line 1339
    move-object/from16 v37, v6

    .line 1340
    .line 1341
    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1342
    .line 1343
    .line 1344
    move-object/from16 v5, v26

    .line 1345
    .line 1346
    sget-object v6, La/kjm;->a:La/kjm;

    .line 1347
    .line 1348
    sget-object v6, Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$SportTag;->a:Lorg/xplatform/top/api/presentation/header/TopHeaderTagType$SportTag;

    .line 1349
    .line 1350
    invoke-direct {v3, v4, v6, v5}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 1351
    .line 1352
    .line 1353
    new-instance v4, La/ier0;

    .line 1354
    .line 1355
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1356
    .line 1357
    .line 1358
    move-result v5

    .line 1359
    const/4 v14, 0x3

    .line 1360
    invoke-static {v5, v14}, Ljava/lang/Math;->min(II)I

    .line 1361
    .line 1362
    .line 1363
    move-result v5

    .line 1364
    invoke-direct {v4, v5, v2}, La/ier0;-><init>(ILa/a4x;)V

    .line 1365
    .line 1366
    .line 1367
    const/4 v5, 0x2

    .line 1368
    new-array v2, v5, [La/qdr0;

    .line 1369
    .line 1370
    const/16 v25, 0x0

    .line 1371
    .line 1372
    aput-object v3, v2, v25

    .line 1373
    .line 1374
    const/16 v22, 0x1

    .line 1375
    .line 1376
    aput-object v4, v2, v22

    .line 1377
    .line 1378
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    :goto_19
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v7

    .line 1386
    :goto_1a
    return-object v7

    .line 1387
    :pswitch_9
    move-object/from16 v0, p1

    .line 1388
    .line 1389
    check-cast v0, La/c4r0;

    .line 1390
    .line 1391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1392
    .line 1393
    .line 1394
    sget-object v1, La/iun;->a:La/iun;

    .line 1395
    .line 1396
    iget-object v7, v0, La/c4r0;->c:Ljava/util/List;

    .line 1397
    .line 1398
    iget-object v8, v2, La/zer0;->a:La/ctf0;

    .line 1399
    .line 1400
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v2

    .line 1408
    check-cast v2, La/xdr0;

    .line 1409
    .line 1410
    iget-object v2, v2, La/xdr0;->C:Ljava/util/List;

    .line 1411
    .line 1412
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v10

    .line 1425
    if-eqz v10, :cond_22

    .line 1426
    .line 1427
    move-object v2, v1

    .line 1428
    move-object v1, v0

    .line 1429
    move-object v0, v2

    .line 1430
    goto/16 :goto_26

    .line 1431
    .line 1432
    :cond_22
    new-instance v10, Ljava/util/ArrayList;

    .line 1433
    .line 1434
    const/16 v11, 0xa

    .line 1435
    .line 1436
    invoke-static {v7, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1437
    .line 1438
    .line 1439
    move-result v12

    .line 1440
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 1441
    .line 1442
    .line 1443
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v7

    .line 1447
    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1448
    .line 1449
    .line 1450
    move-result v11

    .line 1451
    if-eqz v11, :cond_2c

    .line 1452
    .line 1453
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v11

    .line 1457
    check-cast v11, La/lok0;

    .line 1458
    .line 1459
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1460
    .line 1461
    .line 1462
    move-object/from16 p0, v0

    .line 1463
    .line 1464
    move-object/from16 p1, v1

    .line 1465
    .line 1466
    iget-wide v0, v11, La/lok0;->g:J

    .line 1467
    .line 1468
    iget-object v12, v11, La/lok0;->u:Ljava/lang/String;

    .line 1469
    .line 1470
    move-wide/from16 v20, v0

    .line 1471
    .line 1472
    iget-wide v0, v11, La/lok0;->f:J

    .line 1473
    .line 1474
    iget v15, v11, La/lok0;->a:I

    .line 1475
    .line 1476
    cmp-long v18, v20, v16

    .line 1477
    .line 1478
    if-eqz v18, :cond_2b

    .line 1479
    .line 1480
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v18

    .line 1484
    :goto_1c
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 1485
    .line 1486
    .line 1487
    move-result v26

    .line 1488
    if-eqz v26, :cond_24

    .line 1489
    .line 1490
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v26

    .line 1494
    move-object/from16 v27, v2

    .line 1495
    .line 1496
    move-object/from16 v2, v26

    .line 1497
    .line 1498
    check-cast v2, La/f3n0;

    .line 1499
    .line 1500
    move-object/from16 v29, v7

    .line 1501
    .line 1502
    move-object/from16 v28, v8

    .line 1503
    .line 1504
    iget-wide v7, v2, La/f3n0;->a:J

    .line 1505
    .line 1506
    cmp-long v2, v7, v20

    .line 1507
    .line 1508
    if-nez v2, :cond_23

    .line 1509
    .line 1510
    goto :goto_1d

    .line 1511
    :cond_23
    move-object/from16 v2, v27

    .line 1512
    .line 1513
    move-object/from16 v8, v28

    .line 1514
    .line 1515
    move-object/from16 v7, v29

    .line 1516
    .line 1517
    goto :goto_1c

    .line 1518
    :cond_24
    move-object/from16 v27, v2

    .line 1519
    .line 1520
    move-object/from16 v29, v7

    .line 1521
    .line 1522
    move-object/from16 v28, v8

    .line 1523
    .line 1524
    const/16 v26, 0x0

    .line 1525
    .line 1526
    :goto_1d
    move-object/from16 v2, v26

    .line 1527
    .line 1528
    check-cast v2, La/f3n0;

    .line 1529
    .line 1530
    if-eqz v2, :cond_29

    .line 1531
    .line 1532
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1533
    .line 1534
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 1535
    .line 1536
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1537
    .line 1538
    .line 1539
    iget-object v1, v2, La/f3n0;->c:La/lel0;

    .line 1540
    .line 1541
    iget-object v1, v1, La/lel0;->j:Ljava/lang/String;

    .line 1542
    .line 1543
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1547
    .line 1548
    .line 1549
    move-result v2

    .line 1550
    if-nez v2, :cond_25

    .line 1551
    .line 1552
    const/4 v8, 0x0

    .line 1553
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1554
    .line 1555
    .line 1556
    const/16 v7, 0x2f

    .line 1557
    .line 1558
    goto :goto_21

    .line 1559
    :cond_25
    const/4 v8, 0x0

    .line 1560
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 1561
    .line 1562
    invoke-static {v1, v2, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v2

    .line 1566
    if-nez v2, :cond_26

    .line 1567
    .line 1568
    invoke-static {v1, v14, v8}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1569
    .line 1570
    .line 1571
    move-result v2

    .line 1572
    if-eqz v2, :cond_27

    .line 1573
    .line 1574
    const/4 v8, 0x0

    .line 1575
    :cond_26
    const/16 v7, 0x2f

    .line 1576
    .line 1577
    goto :goto_20

    .line 1578
    :cond_27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1579
    .line 1580
    .line 1581
    move-result v2

    .line 1582
    if-lez v2, :cond_28

    .line 1583
    .line 1584
    invoke-static {v0, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v2

    .line 1588
    if-nez v2, :cond_28

    .line 1589
    .line 1590
    const/16 v7, 0x2f

    .line 1591
    .line 1592
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1593
    .line 1594
    .line 1595
    :goto_1e
    const/4 v8, 0x1

    .line 1596
    goto :goto_1f

    .line 1597
    :cond_28
    const/16 v7, 0x2f

    .line 1598
    .line 1599
    goto :goto_1e

    .line 1600
    :goto_1f
    new-array v2, v8, [C

    .line 1601
    .line 1602
    const/4 v8, 0x0

    .line 1603
    aput-char v7, v2, v8

    .line 1604
    .line 1605
    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v1

    .line 1609
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1610
    .line 1611
    .line 1612
    goto :goto_21

    .line 1613
    :goto_20
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1617
    .line 1618
    .line 1619
    :goto_21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    goto :goto_22

    .line 1624
    :cond_29
    const/16 v7, 0x2f

    .line 1625
    .line 1626
    cmp-long v2, v0, v16

    .line 1627
    .line 1628
    if-eqz v2, :cond_2a

    .line 1629
    .line 1630
    invoke-static {v3, v4, v5}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v2

    .line 1634
    invoke-static {v0, v1, v6, v2}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 1635
    .line 1636
    .line 1637
    iget-object v0, v2, La/bzu;->b:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v0, Ljava/lang/StringBuilder;

    .line 1640
    .line 1641
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    goto :goto_22

    .line 1646
    :cond_2a
    move-object v0, v9

    .line 1647
    goto :goto_22

    .line 1648
    :cond_2b
    move-object/from16 v27, v2

    .line 1649
    .line 1650
    move-object/from16 v29, v7

    .line 1651
    .line 1652
    move-object/from16 v28, v8

    .line 1653
    .line 1654
    const/16 v7, 0x2f

    .line 1655
    .line 1656
    cmp-long v2, v0, v16

    .line 1657
    .line 1658
    if-eqz v2, :cond_2a

    .line 1659
    .line 1660
    invoke-static {v3, v4, v5}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v2

    .line 1664
    invoke-static {v0, v1, v6, v2}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 1665
    .line 1666
    .line 1667
    iget-object v0, v2, La/bzu;->b:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v0, Ljava/lang/StringBuilder;

    .line 1670
    .line 1671
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v0

    .line 1675
    :goto_22
    invoke-static {v15, v12}, La/q5x;->D(ILjava/lang/String;)Ljava/lang/String;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v1

    .line 1679
    invoke-static {v15, v12}, La/q5x;->E(ILjava/lang/String;)Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v2

    .line 1683
    new-instance v8, La/y3r0;

    .line 1684
    .line 1685
    iget-object v12, v11, La/lok0;->b:Ljava/lang/String;

    .line 1686
    .line 1687
    new-instance v7, La/n0x;

    .line 1688
    .line 1689
    invoke-direct {v7, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1690
    .line 1691
    .line 1692
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 1693
    .line 1694
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1695
    .line 1696
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1697
    .line 1698
    .line 1699
    move-result-wide v32

    .line 1700
    new-instance v0, La/qc5;

    .line 1701
    .line 1702
    move-object/from16 v31, v7

    .line 1703
    .line 1704
    new-instance v7, La/n0x;

    .line 1705
    .line 1706
    invoke-direct {v7, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1707
    .line 1708
    .line 1709
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v1

    .line 1713
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1714
    .line 1715
    move-object/from16 v21, v13

    .line 1716
    .line 1717
    move-object/from16 v20, v14

    .line 1718
    .line 1719
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1720
    .line 1721
    .line 1722
    move-result-wide v13

    .line 1723
    new-instance v1, La/y3d;

    .line 1724
    .line 1725
    invoke-direct {v1, v13, v14}, La/y3d;-><init>(J)V

    .line 1726
    .line 1727
    .line 1728
    const/4 v13, 0x0

    .line 1729
    invoke-direct {v0, v13, v7, v1}, La/qc5;-><init>(Ljava/lang/Integer;La/n0x;La/y3d;)V

    .line 1730
    .line 1731
    .line 1732
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v1

    .line 1736
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1737
    .line 1738
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1739
    .line 1740
    .line 1741
    move-result-wide v36

    .line 1742
    new-instance v30, La/rx30;

    .line 1743
    .line 1744
    const/16 v34, 0x0

    .line 1745
    .line 1746
    const/16 v39, 0x1a4

    .line 1747
    .line 1748
    const v35, 0x7f08080a

    .line 1749
    .line 1750
    .line 1751
    move-object/from16 v38, v0

    .line 1752
    .line 1753
    invoke-direct/range {v30 .. v39}, La/rx30;-><init>(La/o0x;JLa/miz;IJLa/rc5;I)V

    .line 1754
    .line 1755
    .line 1756
    new-instance v31, La/ux30;

    .line 1757
    .line 1758
    iget-object v0, v11, La/lok0;->b:Ljava/lang/String;

    .line 1759
    .line 1760
    const/16 v36, 0x0

    .line 1761
    .line 1762
    const/16 v32, 0xe

    .line 1763
    .line 1764
    const-wide/16 v33, 0x0

    .line 1765
    .line 1766
    move-object/from16 v35, v0

    .line 1767
    .line 1768
    invoke-direct/range {v31 .. v36}, La/ux30;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 1769
    .line 1770
    .line 1771
    new-instance v0, La/zx30;

    .line 1772
    .line 1773
    new-instance v1, La/n0x;

    .line 1774
    .line 1775
    invoke-direct {v1, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1776
    .line 1777
    .line 1778
    const/4 v14, 0x3

    .line 1779
    invoke-direct {v0, v1, v14}, La/zx30;-><init>(La/o0x;I)V

    .line 1780
    .line 1781
    .line 1782
    new-instance v45, La/gy30;

    .line 1783
    .line 1784
    const/16 v52, 0x0

    .line 1785
    .line 1786
    const/16 v53, 0xf8

    .line 1787
    .line 1788
    const-wide/16 v49, 0x0

    .line 1789
    .line 1790
    const/16 v51, 0x0

    .line 1791
    .line 1792
    move-object/from16 v48, v0

    .line 1793
    .line 1794
    move-object/from16 v47, v30

    .line 1795
    .line 1796
    move-object/from16 v46, v31

    .line 1797
    .line 1798
    invoke-direct/range {v45 .. v53}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 1799
    .line 1800
    .line 1801
    move-object/from16 v0, v45

    .line 1802
    .line 1803
    invoke-direct {v8, v15, v12, v0}, La/y3r0;-><init>(ILjava/lang/String;La/gy30;)V

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1807
    .line 1808
    .line 1809
    move-object/from16 v0, p0

    .line 1810
    .line 1811
    move-object/from16 v1, p1

    .line 1812
    .line 1813
    move-object/from16 v14, v20

    .line 1814
    .line 1815
    move-object/from16 v13, v21

    .line 1816
    .line 1817
    move-object/from16 v2, v27

    .line 1818
    .line 1819
    move-object/from16 v8, v28

    .line 1820
    .line 1821
    move-object/from16 v7, v29

    .line 1822
    .line 1823
    goto/16 :goto_1b

    .line 1824
    .line 1825
    :cond_2c
    move-object/from16 p0, v0

    .line 1826
    .line 1827
    move-object/from16 p1, v1

    .line 1828
    .line 1829
    move-object/from16 v28, v8

    .line 1830
    .line 1831
    const/4 v14, 0x3

    .line 1832
    invoke-static {v10, v14, v14}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v0

    .line 1836
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1837
    .line 1838
    .line 1839
    move-result v1

    .line 1840
    const/4 v8, 0x1

    .line 1841
    if-gt v1, v8, :cond_2e

    .line 1842
    .line 1843
    new-instance v1, La/e4r0;

    .line 1844
    .line 1845
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v0

    .line 1849
    check-cast v0, Ljava/util/List;

    .line 1850
    .line 1851
    if-nez v0, :cond_2d

    .line 1852
    .line 1853
    sget-object v0, La/iun;->a:La/iun;

    .line 1854
    .line 1855
    :cond_2d
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    invoke-direct {v1, v0}, La/e4r0;-><init>(La/i4;)V

    .line 1860
    .line 1861
    .line 1862
    goto :goto_25

    .line 1863
    :cond_2e
    new-instance v1, Ljava/util/ArrayList;

    .line 1864
    .line 1865
    const/16 v3, 0xa

    .line 1866
    .line 1867
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1868
    .line 1869
    .line 1870
    move-result v2

    .line 1871
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1872
    .line 1873
    .line 1874
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v0

    .line 1878
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1879
    .line 1880
    .line 1881
    move-result v2

    .line 1882
    if-eqz v2, :cond_30

    .line 1883
    .line 1884
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v2

    .line 1888
    check-cast v2, Ljava/util/List;

    .line 1889
    .line 1890
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1891
    .line 1892
    .line 1893
    move-result v3

    .line 1894
    const/16 v19, 0x3

    .line 1895
    .line 1896
    rsub-int/lit8 v10, v3, 0x3

    .line 1897
    .line 1898
    new-instance v3, Ljava/util/ArrayList;

    .line 1899
    .line 1900
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1901
    .line 1902
    .line 1903
    const/4 v4, 0x0

    .line 1904
    :goto_24
    if-ge v4, v10, :cond_2f

    .line 1905
    .line 1906
    sget-object v5, La/z3r0;->a:La/z3r0;

    .line 1907
    .line 1908
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1909
    .line 1910
    .line 1911
    add-int/lit8 v4, v4, 0x1

    .line 1912
    .line 1913
    goto :goto_24

    .line 1914
    :cond_2f
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v2

    .line 1918
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v2

    .line 1922
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1923
    .line 1924
    .line 1925
    goto :goto_23

    .line 1926
    :cond_30
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v0

    .line 1930
    new-instance v1, La/d4r0;

    .line 1931
    .line 1932
    invoke-direct {v1, v0}, La/d4r0;-><init>(La/i4;)V

    .line 1933
    .line 1934
    .line 1935
    :goto_25
    new-instance v0, La/t7r0;

    .line 1936
    .line 1937
    new-instance v2, La/hjm;

    .line 1938
    .line 1939
    const/4 v8, 0x0

    .line 1940
    new-array v3, v8, [Ljava/lang/Object;

    .line 1941
    .line 1942
    move-object/from16 v4, v28

    .line 1943
    .line 1944
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 1945
    .line 1946
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v3

    .line 1950
    const v5, 0x7f1315d8

    .line 1951
    .line 1952
    .line 1953
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v3

    .line 1957
    const/4 v14, 0x0

    .line 1958
    const/16 v15, 0x1ffe

    .line 1959
    .line 1960
    const/4 v4, 0x0

    .line 1961
    const/4 v5, 0x0

    .line 1962
    const/4 v6, 0x0

    .line 1963
    const/4 v7, 0x0

    .line 1964
    const/4 v8, 0x0

    .line 1965
    const/4 v9, 0x0

    .line 1966
    const/4 v10, 0x0

    .line 1967
    const/4 v11, 0x0

    .line 1968
    const/4 v12, 0x0

    .line 1969
    const/4 v13, 0x0

    .line 1970
    invoke-direct/range {v2 .. v15}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1971
    .line 1972
    .line 1973
    sget-object v3, La/kjm;->a:La/kjm;

    .line 1974
    .line 1975
    sget-object v3, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$TopEvents;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$TopEvents;

    .line 1976
    .line 1977
    const/4 v15, 0x0

    .line 1978
    invoke-direct {v0, v3, v15, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 1979
    .line 1980
    .line 1981
    const/4 v5, 0x2

    .line 1982
    new-array v2, v5, [La/qdr0;

    .line 1983
    .line 1984
    const/16 v25, 0x0

    .line 1985
    .line 1986
    aput-object v0, v2, v25

    .line 1987
    .line 1988
    const/16 v22, 0x1

    .line 1989
    .line 1990
    aput-object v1, v2, v22

    .line 1991
    .line 1992
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v0

    .line 1996
    move-object/from16 v1, p0

    .line 1997
    .line 1998
    move-object/from16 v2, p1

    .line 1999
    .line 2000
    :goto_26
    invoke-static {v1, v2, v0}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v0

    .line 2004
    return-object v0

    .line 2005
    :pswitch_a
    move-object/from16 v0, p1

    .line 2006
    .line 2007
    check-cast v0, La/u8r0;

    .line 2008
    .line 2009
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2010
    .line 2011
    .line 2012
    new-instance v1, La/v8r0;

    .line 2013
    .line 2014
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v3

    .line 2018
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v3

    .line 2022
    check-cast v3, La/xdr0;

    .line 2023
    .line 2024
    iget-object v3, v3, La/xdr0;->y:La/f3v0;

    .line 2025
    .line 2026
    sget-object v4, La/abn;->a:La/abn;

    .line 2027
    .line 2028
    invoke-direct {v1, v3, v4}, La/v8r0;-><init>(La/f3v0;La/bbn;)V

    .line 2029
    .line 2030
    .line 2031
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v1

    .line 2035
    iget-object v3, v0, La/u8r0;->c:Ljava/util/List;

    .line 2036
    .line 2037
    iget-object v4, v2, La/zer0;->a:La/ctf0;

    .line 2038
    .line 2039
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v5

    .line 2043
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v5

    .line 2047
    check-cast v5, La/xdr0;

    .line 2048
    .line 2049
    iget-object v5, v5, La/xdr0;->y:La/f3v0;

    .line 2050
    .line 2051
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v2

    .line 2055
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v2

    .line 2059
    check-cast v2, La/xdr0;

    .line 2060
    .line 2061
    iget-object v2, v2, La/xdr0;->z:Ljava/lang/String;

    .line 2062
    .line 2063
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2067
    .line 2068
    .line 2069
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 2070
    .line 2071
    .line 2072
    move-result v6

    .line 2073
    if-eqz v6, :cond_31

    .line 2074
    .line 2075
    sget-object v2, La/iun;->a:La/iun;

    .line 2076
    .line 2077
    goto/16 :goto_34

    .line 2078
    .line 2079
    :cond_31
    instance-of v6, v5, La/c3v0;

    .line 2080
    .line 2081
    sget-object v7, La/e3v0;->a:La/e3v0;

    .line 2082
    .line 2083
    if-nez v6, :cond_33

    .line 2084
    .line 2085
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2086
    .line 2087
    .line 2088
    move-result v6

    .line 2089
    if-eqz v6, :cond_32

    .line 2090
    .line 2091
    goto :goto_27

    .line 2092
    :cond_32
    const/4 v11, 0x1

    .line 2093
    goto :goto_28

    .line 2094
    :cond_33
    :goto_27
    const/4 v11, 0x0

    .line 2095
    :goto_28
    new-instance v6, Ljava/util/ArrayList;

    .line 2096
    .line 2097
    const/16 v8, 0xa

    .line 2098
    .line 2099
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2100
    .line 2101
    .line 2102
    move-result v8

    .line 2103
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2104
    .line 2105
    .line 2106
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v3

    .line 2110
    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2111
    .line 2112
    .line 2113
    move-result v8

    .line 2114
    if-eqz v8, :cond_3e

    .line 2115
    .line 2116
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v8

    .line 2120
    check-cast v8, La/mz60;

    .line 2121
    .line 2122
    sget-object v9, La/b3v0;->a:La/b3v0;

    .line 2123
    .line 2124
    invoke-virtual {v5, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2125
    .line 2126
    .line 2127
    move-result v9

    .line 2128
    sget-object v10, La/c3v0;->a:La/c3v0;

    .line 2129
    .line 2130
    if-eqz v9, :cond_34

    .line 2131
    .line 2132
    const v9, 0x7f0807c1

    .line 2133
    .line 2134
    .line 2135
    goto :goto_2b

    .line 2136
    :cond_34
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2137
    .line 2138
    .line 2139
    move-result v9

    .line 2140
    if-nez v9, :cond_36

    .line 2141
    .line 2142
    sget-object v9, La/d3v0;->a:La/d3v0;

    .line 2143
    .line 2144
    invoke-virtual {v5, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2145
    .line 2146
    .line 2147
    move-result v9

    .line 2148
    if-nez v9, :cond_36

    .line 2149
    .line 2150
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2151
    .line 2152
    .line 2153
    move-result v9

    .line 2154
    if-eqz v9, :cond_35

    .line 2155
    .line 2156
    goto :goto_2a

    .line 2157
    :cond_35
    invoke-static {}, La/t9f;->b()V

    .line 2158
    .line 2159
    .line 2160
    const/4 v7, 0x0

    .line 2161
    goto/16 :goto_35

    .line 2162
    .line 2163
    :cond_36
    :goto_2a
    const v9, 0x7f0807c2

    .line 2164
    .line 2165
    .line 2166
    :goto_2b
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2167
    .line 2168
    .line 2169
    iget-object v12, v8, La/mz60;->b:La/a570;

    .line 2170
    .line 2171
    iget-object v13, v8, La/mz60;->d:La/hds;

    .line 2172
    .line 2173
    invoke-static {v12}, La/x1x;->G(La/a570;)Z

    .line 2174
    .line 2175
    .line 2176
    move-result v14

    .line 2177
    if-eqz v14, :cond_3c

    .line 2178
    .line 2179
    iget-boolean v14, v8, La/mz60;->e:Z

    .line 2180
    .line 2181
    if-eqz v14, :cond_39

    .line 2182
    .line 2183
    new-instance v26, La/ajm;

    .line 2184
    .line 2185
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2186
    .line 2187
    .line 2188
    move-result v14

    .line 2189
    if-eqz v14, :cond_37

    .line 2190
    .line 2191
    new-instance v14, La/n0x;

    .line 2192
    .line 2193
    iget-object v15, v13, La/hds;->c:Ljava/lang/String;

    .line 2194
    .line 2195
    invoke-direct {v14, v15}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2196
    .line 2197
    .line 2198
    :goto_2c
    move-object/from16 v27, v14

    .line 2199
    .line 2200
    goto :goto_2d

    .line 2201
    :cond_37
    new-instance v14, La/n0x;

    .line 2202
    .line 2203
    iget-object v15, v13, La/hds;->b:Ljava/lang/String;

    .line 2204
    .line 2205
    invoke-direct {v14, v15}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2206
    .line 2207
    .line 2208
    goto :goto_2c

    .line 2209
    :goto_2d
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v10

    .line 2213
    if-eqz v10, :cond_38

    .line 2214
    .line 2215
    new-instance v10, La/n0x;

    .line 2216
    .line 2217
    iget-object v14, v13, La/hds;->c:Ljava/lang/String;

    .line 2218
    .line 2219
    invoke-static {v14}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v14

    .line 2223
    invoke-direct {v10, v14}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2224
    .line 2225
    .line 2226
    :goto_2e
    move-object/from16 v28, v10

    .line 2227
    .line 2228
    goto :goto_2f

    .line 2229
    :cond_38
    new-instance v10, La/n0x;

    .line 2230
    .line 2231
    iget-object v14, v13, La/hds;->b:Ljava/lang/String;

    .line 2232
    .line 2233
    invoke-static {v14}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v14

    .line 2237
    invoke-direct {v10, v14}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2238
    .line 2239
    .line 2240
    goto :goto_2e

    .line 2241
    :goto_2f
    new-instance v10, La/n0x;

    .line 2242
    .line 2243
    iget-object v14, v13, La/hds;->a:Ljava/lang/String;

    .line 2244
    .line 2245
    invoke-direct {v10, v14}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2246
    .line 2247
    .line 2248
    new-instance v14, La/n0x;

    .line 2249
    .line 2250
    iget-object v13, v13, La/hds;->a:Ljava/lang/String;

    .line 2251
    .line 2252
    invoke-static {v13}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v13

    .line 2256
    invoke-direct {v14, v13}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2257
    .line 2258
    .line 2259
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v31

    .line 2263
    const v9, 0x7f080a22

    .line 2264
    .line 2265
    .line 2266
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v32

    .line 2270
    const/16 v33, 0x20

    .line 2271
    .line 2272
    move-object/from16 v29, v10

    .line 2273
    .line 2274
    move-object/from16 v30, v14

    .line 2275
    .line 2276
    invoke-direct/range {v26 .. v33}, La/ajm;-><init>(La/o0x;La/o0x;La/o0x;La/o0x;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 2277
    .line 2278
    .line 2279
    move-object/from16 p0, v3

    .line 2280
    .line 2281
    move-object/from16 v3, v26

    .line 2282
    .line 2283
    goto/16 :goto_32

    .line 2284
    .line 2285
    :cond_39
    new-instance v14, La/zim;

    .line 2286
    .line 2287
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2288
    .line 2289
    .line 2290
    move-result v15

    .line 2291
    if-eqz v15, :cond_3a

    .line 2292
    .line 2293
    new-instance v15, La/n0x;

    .line 2294
    .line 2295
    move-object/from16 p0, v3

    .line 2296
    .line 2297
    iget-object v3, v13, La/hds;->c:Ljava/lang/String;

    .line 2298
    .line 2299
    invoke-direct {v15, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2300
    .line 2301
    .line 2302
    goto :goto_30

    .line 2303
    :cond_3a
    move-object/from16 p0, v3

    .line 2304
    .line 2305
    new-instance v15, La/n0x;

    .line 2306
    .line 2307
    iget-object v3, v13, La/hds;->b:Ljava/lang/String;

    .line 2308
    .line 2309
    invoke-direct {v15, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2310
    .line 2311
    .line 2312
    :goto_30
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2313
    .line 2314
    .line 2315
    move-result v3

    .line 2316
    if-eqz v3, :cond_3b

    .line 2317
    .line 2318
    new-instance v3, La/n0x;

    .line 2319
    .line 2320
    iget-object v10, v13, La/hds;->c:Ljava/lang/String;

    .line 2321
    .line 2322
    invoke-static {v10}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v10

    .line 2326
    invoke-direct {v3, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2327
    .line 2328
    .line 2329
    goto :goto_31

    .line 2330
    :cond_3b
    new-instance v3, La/n0x;

    .line 2331
    .line 2332
    iget-object v10, v13, La/hds;->b:Ljava/lang/String;

    .line 2333
    .line 2334
    invoke-static {v10}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v10

    .line 2338
    invoke-direct {v3, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2339
    .line 2340
    .line 2341
    :goto_31
    new-instance v10, La/n0x;

    .line 2342
    .line 2343
    move-object/from16 p1, v3

    .line 2344
    .line 2345
    iget-object v3, v13, La/hds;->a:Ljava/lang/String;

    .line 2346
    .line 2347
    invoke-direct {v10, v3}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2348
    .line 2349
    .line 2350
    new-instance v3, La/n0x;

    .line 2351
    .line 2352
    iget-object v13, v13, La/hds;->a:Ljava/lang/String;

    .line 2353
    .line 2354
    invoke-static {v13}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v13

    .line 2358
    invoke-direct {v3, v13}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2359
    .line 2360
    .line 2361
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v18

    .line 2365
    const/16 v19, 0x20

    .line 2366
    .line 2367
    move-object/from16 v17, v3

    .line 2368
    .line 2369
    move-object/from16 v16, v10

    .line 2370
    .line 2371
    move-object v13, v14

    .line 2372
    move-object v14, v15

    .line 2373
    move-object/from16 v15, p1

    .line 2374
    .line 2375
    invoke-direct/range {v13 .. v19}, La/zim;-><init>(La/o0x;La/o0x;La/o0x;La/o0x;Ljava/lang/Integer;I)V

    .line 2376
    .line 2377
    .line 2378
    move-object v3, v13

    .line 2379
    goto :goto_32

    .line 2380
    :cond_3c
    move-object/from16 p0, v3

    .line 2381
    .line 2382
    new-instance v3, La/yim;

    .line 2383
    .line 2384
    const v9, 0x7f080921

    .line 2385
    .line 2386
    .line 2387
    invoke-direct {v3, v9}, La/yim;-><init>(I)V

    .line 2388
    .line 2389
    .line 2390
    :goto_32
    new-instance v9, La/wim;

    .line 2391
    .line 2392
    invoke-static {v12}, La/x1x;->D(La/a570;)J

    .line 2393
    .line 2394
    .line 2395
    move-result-wide v12

    .line 2396
    long-to-int v10, v12

    .line 2397
    instance-of v12, v3, La/yim;

    .line 2398
    .line 2399
    if-eqz v12, :cond_3d

    .line 2400
    .line 2401
    const/4 v12, 0x0

    .line 2402
    new-array v8, v12, [Ljava/lang/Object;

    .line 2403
    .line 2404
    iget-object v13, v4, La/ctf0;->b:La/lsm0;

    .line 2405
    .line 2406
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v8

    .line 2410
    const v14, 0x7f1300e7

    .line 2411
    .line 2412
    .line 2413
    invoke-virtual {v13, v14, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v8

    .line 2417
    goto :goto_33

    .line 2418
    :cond_3d
    const/4 v12, 0x0

    .line 2419
    iget-object v8, v8, La/mz60;->a:Ljava/lang/String;

    .line 2420
    .line 2421
    :goto_33
    invoke-direct {v9, v10, v3, v8}, La/wim;-><init>(ILa/bjm;Ljava/lang/String;)V

    .line 2422
    .line 2423
    .line 2424
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2425
    .line 2426
    .line 2427
    move-object/from16 v3, p0

    .line 2428
    .line 2429
    goto/16 :goto_29

    .line 2430
    .line 2431
    :cond_3e
    const/4 v12, 0x0

    .line 2432
    invoke-static {v6, v11}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v3

    .line 2436
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v3

    .line 2440
    new-array v6, v12, [Ljava/lang/Object;

    .line 2441
    .line 2442
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 2443
    .line 2444
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v6

    .line 2448
    const v7, 0x7f130fd8

    .line 2449
    .line 2450
    .line 2451
    invoke-virtual {v4, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v6

    .line 2455
    new-instance v7, La/ue9;

    .line 2456
    .line 2457
    new-array v8, v12, [Ljava/lang/Object;

    .line 2458
    .line 2459
    invoke-static {v8, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v8

    .line 2463
    const v9, 0x7f1300e4

    .line 2464
    .line 2465
    .line 2466
    invoke-virtual {v4, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v4

    .line 2470
    invoke-direct {v7, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2471
    .line 2472
    .line 2473
    new-instance v4, La/zan;

    .line 2474
    .line 2475
    invoke-direct {v4, v3, v6, v2, v7}, La/zan;-><init>(La/i4;Ljava/lang/String;Ljava/lang/String;La/ue9;)V

    .line 2476
    .line 2477
    .line 2478
    new-instance v2, La/v8r0;

    .line 2479
    .line 2480
    invoke-direct {v2, v5, v4}, La/v8r0;-><init>(La/f3v0;La/bbn;)V

    .line 2481
    .line 2482
    .line 2483
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v2

    .line 2487
    :goto_34
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v7

    .line 2491
    :goto_35
    return-object v7

    .line 2492
    :pswitch_b
    move-object/from16 v0, p1

    .line 2493
    .line 2494
    check-cast v0, La/zyq0;

    .line 2495
    .line 2496
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2497
    .line 2498
    .line 2499
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 2500
    .line 2501
    .line 2502
    move-result-object v1

    .line 2503
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 2504
    .line 2505
    .line 2506
    move-result-object v1

    .line 2507
    check-cast v1, La/xdr0;

    .line 2508
    .line 2509
    iget-object v1, v1, La/xdr0;->t:La/lq5;

    .line 2510
    .line 2511
    new-instance v3, La/azq0;

    .line 2512
    .line 2513
    sget-object v4, La/lak0;->c:La/lak0;

    .line 2514
    .line 2515
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v5

    .line 2519
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v5

    .line 2523
    check-cast v5, La/xdr0;

    .line 2524
    .line 2525
    iget-object v5, v5, La/xdr0;->t:La/lq5;

    .line 2526
    .line 2527
    const/4 v8, 0x1

    .line 2528
    invoke-direct {v3, v5, v4, v8}, La/azq0;-><init>(La/lq5;La/a4x;Z)V

    .line 2529
    .line 2530
    .line 2531
    instance-of v4, v1, La/fq5;

    .line 2532
    .line 2533
    sget-object v5, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$BannerTape;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$BannerTape;

    .line 2534
    .line 2535
    if-eqz v4, :cond_3f

    .line 2536
    .line 2537
    new-instance v6, La/t7r0;

    .line 2538
    .line 2539
    new-instance v7, La/ijm;

    .line 2540
    .line 2541
    invoke-direct {v7}, La/ijm;-><init>()V

    .line 2542
    .line 2543
    .line 2544
    sget-object v9, La/kjm;->a:La/kjm;

    .line 2545
    .line 2546
    const/4 v15, 0x0

    .line 2547
    invoke-direct {v6, v5, v15, v7}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 2548
    .line 2549
    .line 2550
    const/4 v14, 0x2

    .line 2551
    new-array v7, v14, [La/qdr0;

    .line 2552
    .line 2553
    const/16 v25, 0x0

    .line 2554
    .line 2555
    aput-object v6, v7, v25

    .line 2556
    .line 2557
    aput-object v3, v7, v8

    .line 2558
    .line 2559
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v3

    .line 2563
    goto :goto_36

    .line 2564
    :cond_3f
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v3

    .line 2568
    :goto_36
    iget-object v6, v0, La/zyq0;->c:Ljava/util/List;

    .line 2569
    .line 2570
    iget-object v2, v2, La/zer0;->a:La/ctf0;

    .line 2571
    .line 2572
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2573
    .line 2574
    .line 2575
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2576
    .line 2577
    .line 2578
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 2579
    .line 2580
    .line 2581
    move-result v7

    .line 2582
    if-eqz v7, :cond_40

    .line 2583
    .line 2584
    sget-object v1, La/iun;->a:La/iun;

    .line 2585
    .line 2586
    goto/16 :goto_3c

    .line 2587
    .line 2588
    :cond_40
    new-instance v7, Ljava/util/ArrayList;

    .line 2589
    .line 2590
    const/16 v8, 0xa

    .line 2591
    .line 2592
    invoke-static {v6, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2593
    .line 2594
    .line 2595
    move-result v8

    .line 2596
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2597
    .line 2598
    .line 2599
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2600
    .line 2601
    .line 2602
    move-result-object v6

    .line 2603
    :goto_37
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2604
    .line 2605
    .line 2606
    move-result v8

    .line 2607
    if-eqz v8, :cond_4a

    .line 2608
    .line 2609
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v8

    .line 2613
    check-cast v8, La/lr5;

    .line 2614
    .line 2615
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2616
    .line 2617
    .line 2618
    instance-of v9, v1, La/gq5;

    .line 2619
    .line 2620
    if-eqz v9, :cond_41

    .line 2621
    .line 2622
    goto :goto_38

    .line 2623
    :cond_41
    if-eqz v4, :cond_42

    .line 2624
    .line 2625
    :goto_38
    iget-object v9, v8, La/lr5;->c:Ljava/lang/String;

    .line 2626
    .line 2627
    goto :goto_3b

    .line 2628
    :cond_42
    instance-of v9, v1, La/hq5;

    .line 2629
    .line 2630
    if-eqz v9, :cond_43

    .line 2631
    .line 2632
    goto :goto_39

    .line 2633
    :cond_43
    instance-of v9, v1, La/iq5;

    .line 2634
    .line 2635
    if-eqz v9, :cond_44

    .line 2636
    .line 2637
    goto :goto_39

    .line 2638
    :cond_44
    instance-of v9, v1, La/kq5;

    .line 2639
    .line 2640
    if-eqz v9, :cond_45

    .line 2641
    .line 2642
    goto :goto_39

    .line 2643
    :cond_45
    instance-of v9, v1, La/jq5;

    .line 2644
    .line 2645
    if-eqz v9, :cond_46

    .line 2646
    .line 2647
    :goto_39
    iget-object v9, v8, La/lr5;->b:Ljava/lang/String;

    .line 2648
    .line 2649
    goto :goto_3b

    .line 2650
    :cond_46
    instance-of v9, v1, La/dq5;

    .line 2651
    .line 2652
    if-eqz v9, :cond_47

    .line 2653
    .line 2654
    goto :goto_3a

    .line 2655
    :cond_47
    instance-of v9, v1, La/eq5;

    .line 2656
    .line 2657
    if-eqz v9, :cond_48

    .line 2658
    .line 2659
    goto :goto_3a

    .line 2660
    :cond_48
    instance-of v9, v1, La/cq5;

    .line 2661
    .line 2662
    if-eqz v9, :cond_49

    .line 2663
    .line 2664
    :goto_3a
    iget-object v9, v8, La/lr5;->d:Ljava/lang/String;

    .line 2665
    .line 2666
    :goto_3b
    new-instance v10, La/fr5;

    .line 2667
    .line 2668
    iget v11, v8, La/lr5;->a:I

    .line 2669
    .line 2670
    new-instance v12, La/n0x;

    .line 2671
    .line 2672
    invoke-direct {v12, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2673
    .line 2674
    .line 2675
    new-instance v13, La/n0x;

    .line 2676
    .line 2677
    invoke-static {v9}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 2678
    .line 2679
    .line 2680
    move-result-object v9

    .line 2681
    invoke-direct {v13, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2682
    .line 2683
    .line 2684
    iget-object v14, v8, La/lr5;->e:Ljava/lang/String;

    .line 2685
    .line 2686
    iget-object v15, v8, La/lr5;->f:Ljava/lang/String;

    .line 2687
    .line 2688
    const/16 v16, 0x0

    .line 2689
    .line 2690
    const/16 v17, 0x40

    .line 2691
    .line 2692
    invoke-direct/range {v10 .. v17}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 2693
    .line 2694
    .line 2695
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2696
    .line 2697
    .line 2698
    goto :goto_37

    .line 2699
    :cond_49
    invoke-static {}, La/t9f;->b()V

    .line 2700
    .line 2701
    .line 2702
    const/4 v7, 0x0

    .line 2703
    goto :goto_3d

    .line 2704
    :cond_4a
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v6

    .line 2708
    new-instance v7, La/azq0;

    .line 2709
    .line 2710
    const/4 v8, 0x0

    .line 2711
    invoke-direct {v7, v1, v6, v8}, La/azq0;-><init>(La/lq5;La/a4x;Z)V

    .line 2712
    .line 2713
    .line 2714
    if-eqz v4, :cond_4b

    .line 2715
    .line 2716
    new-instance v1, La/t7r0;

    .line 2717
    .line 2718
    new-instance v26, La/hjm;

    .line 2719
    .line 2720
    new-array v4, v8, [Ljava/lang/Object;

    .line 2721
    .line 2722
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 2723
    .line 2724
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2725
    .line 2726
    .line 2727
    move-result-object v4

    .line 2728
    const v6, 0x7f130df4

    .line 2729
    .line 2730
    .line 2731
    invoke-virtual {v2, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2732
    .line 2733
    .line 2734
    move-result-object v27

    .line 2735
    new-instance v4, La/ue9;

    .line 2736
    .line 2737
    new-array v6, v8, [Ljava/lang/Object;

    .line 2738
    .line 2739
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2740
    .line 2741
    .line 2742
    move-result-object v6

    .line 2743
    const v8, 0x7f1300e4

    .line 2744
    .line 2745
    .line 2746
    invoke-virtual {v2, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2747
    .line 2748
    .line 2749
    move-result-object v2

    .line 2750
    invoke-direct {v4, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2751
    .line 2752
    .line 2753
    const/16 v38, 0x0

    .line 2754
    .line 2755
    const/16 v39, 0x1bfe

    .line 2756
    .line 2757
    const/16 v28, 0x0

    .line 2758
    .line 2759
    const/16 v29, 0x0

    .line 2760
    .line 2761
    const/16 v30, 0x0

    .line 2762
    .line 2763
    const/16 v31, 0x0

    .line 2764
    .line 2765
    const/16 v32, 0x0

    .line 2766
    .line 2767
    const/16 v33, 0x0

    .line 2768
    .line 2769
    const/16 v34, 0x0

    .line 2770
    .line 2771
    const/16 v35, 0x0

    .line 2772
    .line 2773
    const/16 v36, 0x0

    .line 2774
    .line 2775
    move-object/from16 v37, v4

    .line 2776
    .line 2777
    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2778
    .line 2779
    .line 2780
    move-object/from16 v2, v26

    .line 2781
    .line 2782
    sget-object v4, La/kjm;->a:La/kjm;

    .line 2783
    .line 2784
    const/4 v15, 0x0

    .line 2785
    invoke-direct {v1, v5, v15, v2}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 2786
    .line 2787
    .line 2788
    const/4 v5, 0x2

    .line 2789
    new-array v2, v5, [La/qdr0;

    .line 2790
    .line 2791
    const/16 v25, 0x0

    .line 2792
    .line 2793
    aput-object v1, v2, v25

    .line 2794
    .line 2795
    const/16 v22, 0x1

    .line 2796
    .line 2797
    aput-object v7, v2, v22

    .line 2798
    .line 2799
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2800
    .line 2801
    .line 2802
    move-result-object v1

    .line 2803
    goto :goto_3c

    .line 2804
    :cond_4b
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v1

    .line 2808
    :goto_3c
    invoke-static {v0, v3, v1}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 2809
    .line 2810
    .line 2811
    move-result-object v7

    .line 2812
    :goto_3d
    return-object v7

    .line 2813
    :pswitch_c
    move-object/from16 v0, p1

    .line 2814
    .line 2815
    check-cast v0, La/h2r0;

    .line 2816
    .line 2817
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2818
    .line 2819
    .line 2820
    iget-object v1, v2, La/zer0;->w:La/n0o0;

    .line 2821
    .line 2822
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v1

    .line 2826
    check-cast v1, La/fee;

    .line 2827
    .line 2828
    iget-object v1, v1, La/fee;->d:La/pz40;

    .line 2829
    .line 2830
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v1

    .line 2834
    check-cast v1, La/j2r0;

    .line 2835
    .line 2836
    iget-object v1, v1, La/j2r0;->c:Ljava/util/List;

    .line 2837
    .line 2838
    new-instance v3, Ljava/util/ArrayList;

    .line 2839
    .line 2840
    const/16 v8, 0xa

    .line 2841
    .line 2842
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2843
    .line 2844
    .line 2845
    move-result v4

    .line 2846
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2847
    .line 2848
    .line 2849
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2850
    .line 2851
    .line 2852
    move-result-object v1

    .line 2853
    :goto_3e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2854
    .line 2855
    .line 2856
    move-result v4

    .line 2857
    if-eqz v4, :cond_4c

    .line 2858
    .line 2859
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2860
    .line 2861
    .line 2862
    move-result-object v4

    .line 2863
    check-cast v4, La/xah;

    .line 2864
    .line 2865
    iget-wide v4, v4, La/xah;->g:J

    .line 2866
    .line 2867
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2868
    .line 2869
    .line 2870
    move-result-object v4

    .line 2871
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2872
    .line 2873
    .line 2874
    goto :goto_3e

    .line 2875
    :cond_4c
    new-instance v1, La/t7r0;

    .line 2876
    .line 2877
    new-instance v4, La/ijm;

    .line 2878
    .line 2879
    invoke-direct {v4}, La/ijm;-><init>()V

    .line 2880
    .line 2881
    .line 2882
    sget-object v5, La/kjm;->a:La/kjm;

    .line 2883
    .line 2884
    sget-object v5, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Champs$Line;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Champs$Line;

    .line 2885
    .line 2886
    const/4 v15, 0x0

    .line 2887
    invoke-direct {v1, v5, v15, v4}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 2888
    .line 2889
    .line 2890
    new-instance v4, La/i2r0;

    .line 2891
    .line 2892
    new-instance v6, La/z2m;

    .line 2893
    .line 2894
    const v7, 0x3f666666    # 0.9f

    .line 2895
    .line 2896
    .line 2897
    invoke-direct {v6, v7}, La/z2m;-><init>(F)V

    .line 2898
    .line 2899
    .line 2900
    new-instance v8, La/z2m;

    .line 2901
    .line 2902
    invoke-direct {v8, v7}, La/z2m;-><init>(F)V

    .line 2903
    .line 2904
    .line 2905
    new-instance v9, La/z2m;

    .line 2906
    .line 2907
    invoke-direct {v9, v7}, La/z2m;-><init>(F)V

    .line 2908
    .line 2909
    .line 2910
    filled-new-array {v6, v8, v9}, [La/z2m;

    .line 2911
    .line 2912
    .line 2913
    move-result-object v6

    .line 2914
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 2915
    .line 2916
    .line 2917
    move-result-object v6

    .line 2918
    invoke-direct {v4, v6}, La/i2r0;-><init>(La/a4x;)V

    .line 2919
    .line 2920
    .line 2921
    const/4 v14, 0x2

    .line 2922
    new-array v6, v14, [La/qdr0;

    .line 2923
    .line 2924
    const/16 v25, 0x0

    .line 2925
    .line 2926
    aput-object v1, v6, v25

    .line 2927
    .line 2928
    const/16 v22, 0x1

    .line 2929
    .line 2930
    aput-object v4, v6, v22

    .line 2931
    .line 2932
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2933
    .line 2934
    .line 2935
    move-result-object v1

    .line 2936
    iget-object v4, v0, La/h2r0;->c:Ljava/util/List;

    .line 2937
    .line 2938
    new-instance v6, Ljava/util/ArrayList;

    .line 2939
    .line 2940
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2941
    .line 2942
    .line 2943
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2944
    .line 2945
    .line 2946
    move-result-object v4

    .line 2947
    :cond_4d
    :goto_3f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2948
    .line 2949
    .line 2950
    move-result v7

    .line 2951
    if-eqz v7, :cond_4e

    .line 2952
    .line 2953
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2954
    .line 2955
    .line 2956
    move-result-object v7

    .line 2957
    move-object v8, v7

    .line 2958
    check-cast v8, La/xah;

    .line 2959
    .line 2960
    iget-wide v8, v8, La/xah;->g:J

    .line 2961
    .line 2962
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2963
    .line 2964
    .line 2965
    move-result-object v8

    .line 2966
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2967
    .line 2968
    .line 2969
    move-result v8

    .line 2970
    if-nez v8, :cond_4d

    .line 2971
    .line 2972
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2973
    .line 2974
    .line 2975
    goto :goto_3f

    .line 2976
    :cond_4e
    iget-object v3, v2, La/zer0;->a:La/ctf0;

    .line 2977
    .line 2978
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 2979
    .line 2980
    .line 2981
    move-result-object v2

    .line 2982
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v2

    .line 2986
    check-cast v2, La/xdr0;

    .line 2987
    .line 2988
    iget-boolean v2, v2, La/xdr0;->k:Z

    .line 2989
    .line 2990
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2991
    .line 2992
    .line 2993
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2994
    .line 2995
    .line 2996
    move-result v4

    .line 2997
    if-eqz v4, :cond_4f

    .line 2998
    .line 2999
    sget-object v2, La/iun;->a:La/iun;

    .line 3000
    .line 3001
    goto/16 :goto_41

    .line 3002
    .line 3003
    :cond_4f
    new-instance v4, Ljava/util/ArrayList;

    .line 3004
    .line 3005
    const/16 v8, 0xa

    .line 3006
    .line 3007
    invoke-static {v6, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3008
    .line 3009
    .line 3010
    move-result v7

    .line 3011
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 3012
    .line 3013
    .line 3014
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3015
    .line 3016
    .line 3017
    move-result-object v6

    .line 3018
    :goto_40
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 3019
    .line 3020
    .line 3021
    move-result v7

    .line 3022
    if-eqz v7, :cond_50

    .line 3023
    .line 3024
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3025
    .line 3026
    .line 3027
    move-result-object v7

    .line 3028
    check-cast v7, La/xah;

    .line 3029
    .line 3030
    invoke-static {v7, v2}, La/qzb;->c1(La/xah;Z)La/y2m;

    .line 3031
    .line 3032
    .line 3033
    move-result-object v7

    .line 3034
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3035
    .line 3036
    .line 3037
    goto :goto_40

    .line 3038
    :cond_50
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v2

    .line 3042
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3043
    .line 3044
    .line 3045
    move-result-object v4

    .line 3046
    new-instance v6, La/t7r0;

    .line 3047
    .line 3048
    const/4 v8, 0x0

    .line 3049
    new-array v7, v8, [Ljava/lang/Object;

    .line 3050
    .line 3051
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 3052
    .line 3053
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3054
    .line 3055
    .line 3056
    move-result-object v7

    .line 3057
    const v9, 0x7f131666

    .line 3058
    .line 3059
    .line 3060
    invoke-virtual {v3, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3061
    .line 3062
    .line 3063
    move-result-object v23

    .line 3064
    new-array v7, v8, [Ljava/lang/Object;

    .line 3065
    .line 3066
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3067
    .line 3068
    .line 3069
    move-result-object v7

    .line 3070
    const v9, 0x7f130366

    .line 3071
    .line 3072
    .line 3073
    invoke-virtual {v3, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3074
    .line 3075
    .line 3076
    move-result-object v30

    .line 3077
    new-instance v7, La/ue9;

    .line 3078
    .line 3079
    new-array v9, v8, [Ljava/lang/Object;

    .line 3080
    .line 3081
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3082
    .line 3083
    .line 3084
    move-result-object v8

    .line 3085
    const v9, 0x7f1300e4

    .line 3086
    .line 3087
    .line 3088
    invoke-virtual {v3, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3089
    .line 3090
    .line 3091
    move-result-object v3

    .line 3092
    invoke-direct {v7, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 3093
    .line 3094
    .line 3095
    new-instance v22, La/hjm;

    .line 3096
    .line 3097
    const/16 v34, 0x0

    .line 3098
    .line 3099
    const/16 v35, 0x1a7e

    .line 3100
    .line 3101
    const/16 v24, 0x0

    .line 3102
    .line 3103
    const/16 v25, 0x0

    .line 3104
    .line 3105
    const/16 v26, 0x0

    .line 3106
    .line 3107
    const/16 v27, 0x0

    .line 3108
    .line 3109
    const/16 v28, 0x0

    .line 3110
    .line 3111
    const/16 v29, 0x0

    .line 3112
    .line 3113
    sget-object v31, La/cso0;->a:La/cso0;

    .line 3114
    .line 3115
    const/16 v32, 0x0

    .line 3116
    .line 3117
    move-object/from16 v33, v7

    .line 3118
    .line 3119
    invoke-direct/range {v22 .. v35}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 3120
    .line 3121
    .line 3122
    move-object/from16 v3, v22

    .line 3123
    .line 3124
    sget-object v7, La/kjm;->a:La/kjm;

    .line 3125
    .line 3126
    invoke-direct {v6, v5, v12, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 3127
    .line 3128
    .line 3129
    invoke-virtual {v4, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3130
    .line 3131
    .line 3132
    new-instance v3, La/i2r0;

    .line 3133
    .line 3134
    invoke-direct {v3, v2}, La/i2r0;-><init>(La/a4x;)V

    .line 3135
    .line 3136
    .line 3137
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 3138
    .line 3139
    .line 3140
    move-result-object v2

    .line 3141
    invoke-virtual {v4, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3142
    .line 3143
    .line 3144
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3145
    .line 3146
    .line 3147
    move-result-object v2

    .line 3148
    :goto_41
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 3149
    .line 3150
    .line 3151
    move-result-object v0

    .line 3152
    return-object v0

    .line 3153
    :pswitch_d
    move-object/from16 v0, p1

    .line 3154
    .line 3155
    check-cast v0, La/ler0;

    .line 3156
    .line 3157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3158
    .line 3159
    .line 3160
    new-instance v1, La/mer0;

    .line 3161
    .line 3162
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 3163
    .line 3164
    .line 3165
    move-result-object v7

    .line 3166
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 3167
    .line 3168
    .line 3169
    move-result-object v7

    .line 3170
    check-cast v7, La/xdr0;

    .line 3171
    .line 3172
    iget-object v7, v7, La/xdr0;->u:La/uql0;

    .line 3173
    .line 3174
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 3175
    .line 3176
    .line 3177
    move-result v7

    .line 3178
    const/4 v8, 0x4

    .line 3179
    if-eqz v7, :cond_55

    .line 3180
    .line 3181
    const/4 v14, 0x1

    .line 3182
    if-eq v7, v14, :cond_54

    .line 3183
    .line 3184
    const/4 v14, 0x2

    .line 3185
    if-eq v7, v14, :cond_53

    .line 3186
    .line 3187
    const/4 v14, 0x3

    .line 3188
    if-eq v7, v14, :cond_52

    .line 3189
    .line 3190
    if-ne v7, v8, :cond_51

    .line 3191
    .line 3192
    sget-object v7, La/ism;->a:La/ism;

    .line 3193
    .line 3194
    goto :goto_43

    .line 3195
    :cond_51
    invoke-static {}, La/t9f;->b()V

    .line 3196
    .line 3197
    .line 3198
    :goto_42
    const/4 v7, 0x0

    .line 3199
    goto/16 :goto_48

    .line 3200
    .line 3201
    :cond_52
    sget-object v7, La/lsm;->a:La/lsm;

    .line 3202
    .line 3203
    goto :goto_43

    .line 3204
    :cond_53
    sget-object v7, La/osm;->a:La/osm;

    .line 3205
    .line 3206
    goto :goto_43

    .line 3207
    :cond_54
    sget-object v7, La/fsm;->a:La/fsm;

    .line 3208
    .line 3209
    goto :goto_43

    .line 3210
    :cond_55
    sget-object v7, La/rsm;->a:La/rsm;

    .line 3211
    .line 3212
    :goto_43
    invoke-direct {v1, v7}, La/mer0;-><init>(La/tsm;)V

    .line 3213
    .line 3214
    .line 3215
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 3216
    .line 3217
    .line 3218
    move-result-object v1

    .line 3219
    iget-object v7, v0, La/ler0;->c:Ljava/util/List;

    .line 3220
    .line 3221
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 3222
    .line 3223
    .line 3224
    move-result-object v10

    .line 3225
    invoke-virtual {v10}, La/fee;->c()Ljava/lang/Object;

    .line 3226
    .line 3227
    .line 3228
    move-result-object v10

    .line 3229
    check-cast v10, La/xdr0;

    .line 3230
    .line 3231
    iget-object v10, v10, La/xdr0;->u:La/uql0;

    .line 3232
    .line 3233
    iget-object v2, v2, La/zer0;->a:La/ctf0;

    .line 3234
    .line 3235
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3236
    .line 3237
    .line 3238
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3239
    .line 3240
    .line 3241
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 3242
    .line 3243
    .line 3244
    move-result v11

    .line 3245
    if-eqz v11, :cond_56

    .line 3246
    .line 3247
    sget-object v2, La/iun;->a:La/iun;

    .line 3248
    .line 3249
    goto/16 :goto_47

    .line 3250
    .line 3251
    :cond_56
    new-instance v11, Ljava/util/ArrayList;

    .line 3252
    .line 3253
    const/16 v12, 0xa

    .line 3254
    .line 3255
    invoke-static {v7, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3256
    .line 3257
    .line 3258
    move-result v12

    .line 3259
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 3260
    .line 3261
    .line 3262
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3263
    .line 3264
    .line 3265
    move-result-object v7

    .line 3266
    :goto_44
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 3267
    .line 3268
    .line 3269
    move-result v12

    .line 3270
    if-eqz v12, :cond_58

    .line 3271
    .line 3272
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3273
    .line 3274
    .line 3275
    move-result-object v12

    .line 3276
    check-cast v12, La/ril0;

    .line 3277
    .line 3278
    iget-wide v13, v12, La/ril0;->a:J

    .line 3279
    .line 3280
    long-to-int v15, v13

    .line 3281
    iget-object v12, v12, La/ril0;->b:Ljava/lang/String;

    .line 3282
    .line 3283
    new-instance v8, La/n0x;

    .line 3284
    .line 3285
    cmp-long v18, v13, v16

    .line 3286
    .line 3287
    move-object/from16 p1, v7

    .line 3288
    .line 3289
    if-eqz v18, :cond_57

    .line 3290
    .line 3291
    invoke-static {v3, v4, v5}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 3292
    .line 3293
    .line 3294
    move-result-object v7

    .line 3295
    invoke-static {v13, v14, v6, v7}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 3296
    .line 3297
    .line 3298
    iget-object v7, v7, La/bzu;->b:Ljava/lang/Object;

    .line 3299
    .line 3300
    check-cast v7, Ljava/lang/StringBuilder;

    .line 3301
    .line 3302
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3303
    .line 3304
    .line 3305
    move-result-object v7

    .line 3306
    goto :goto_45

    .line 3307
    :cond_57
    move-object v7, v9

    .line 3308
    :goto_45
    invoke-direct {v8, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 3309
    .line 3310
    .line 3311
    new-instance v7, La/usm;

    .line 3312
    .line 3313
    invoke-direct {v7, v15, v8, v12}, La/usm;-><init>(ILa/o0x;Ljava/lang/String;)V

    .line 3314
    .line 3315
    .line 3316
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3317
    .line 3318
    .line 3319
    move-object/from16 v7, p1

    .line 3320
    .line 3321
    const/4 v8, 0x4

    .line 3322
    goto :goto_44

    .line 3323
    :cond_58
    invoke-static {v11}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 3324
    .line 3325
    .line 3326
    move-result-object v3

    .line 3327
    const/4 v8, 0x0

    .line 3328
    new-array v4, v8, [Ljava/lang/Object;

    .line 3329
    .line 3330
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 3331
    .line 3332
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3333
    .line 3334
    .line 3335
    move-result-object v4

    .line 3336
    const v5, 0x7f13134d

    .line 3337
    .line 3338
    .line 3339
    invoke-virtual {v2, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v4

    .line 3343
    new-array v5, v8, [Ljava/lang/Object;

    .line 3344
    .line 3345
    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3346
    .line 3347
    .line 3348
    move-result-object v5

    .line 3349
    const v6, 0x7f13134e

    .line 3350
    .line 3351
    .line 3352
    invoke-virtual {v2, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3353
    .line 3354
    .line 3355
    move-result-object v5

    .line 3356
    new-instance v6, La/mer0;

    .line 3357
    .line 3358
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 3359
    .line 3360
    .line 3361
    move-result v7

    .line 3362
    if-eqz v7, :cond_5d

    .line 3363
    .line 3364
    const/4 v8, 0x1

    .line 3365
    if-eq v7, v8, :cond_5c

    .line 3366
    .line 3367
    const/4 v14, 0x2

    .line 3368
    if-eq v7, v14, :cond_5b

    .line 3369
    .line 3370
    const/4 v14, 0x3

    .line 3371
    if-eq v7, v14, :cond_5a

    .line 3372
    .line 3373
    const/4 v2, 0x4

    .line 3374
    if-ne v7, v2, :cond_59

    .line 3375
    .line 3376
    new-instance v2, La/hsm;

    .line 3377
    .line 3378
    invoke-direct {v2, v3, v5, v4}, La/hsm;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 3379
    .line 3380
    .line 3381
    goto :goto_46

    .line 3382
    :cond_59
    invoke-static {}, La/t9f;->b()V

    .line 3383
    .line 3384
    .line 3385
    goto/16 :goto_42

    .line 3386
    .line 3387
    :cond_5a
    new-instance v2, La/ksm;

    .line 3388
    .line 3389
    invoke-direct {v2, v3, v5, v4}, La/ksm;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 3390
    .line 3391
    .line 3392
    goto :goto_46

    .line 3393
    :cond_5b
    new-instance v2, La/nsm;

    .line 3394
    .line 3395
    invoke-direct {v2, v3, v5, v4}, La/nsm;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 3396
    .line 3397
    .line 3398
    goto :goto_46

    .line 3399
    :cond_5c
    new-instance v2, La/esm;

    .line 3400
    .line 3401
    invoke-direct {v2, v3, v5, v4}, La/esm;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 3402
    .line 3403
    .line 3404
    goto :goto_46

    .line 3405
    :cond_5d
    new-instance v5, La/qsm;

    .line 3406
    .line 3407
    const/4 v8, 0x0

    .line 3408
    new-array v7, v8, [Ljava/lang/Object;

    .line 3409
    .line 3410
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3411
    .line 3412
    .line 3413
    move-result-object v7

    .line 3414
    const v8, 0x7f130aa2

    .line 3415
    .line 3416
    .line 3417
    invoke-virtual {v2, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3418
    .line 3419
    .line 3420
    move-result-object v2

    .line 3421
    invoke-direct {v5, v3, v2, v4}, La/qsm;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 3422
    .line 3423
    .line 3424
    move-object v2, v5

    .line 3425
    :goto_46
    invoke-direct {v6, v2}, La/mer0;-><init>(La/tsm;)V

    .line 3426
    .line 3427
    .line 3428
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 3429
    .line 3430
    .line 3431
    move-result-object v2

    .line 3432
    :goto_47
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 3433
    .line 3434
    .line 3435
    move-result-object v7

    .line 3436
    :goto_48
    return-object v7

    .line 3437
    :pswitch_e
    move-object/from16 v0, p1

    .line 3438
    .line 3439
    check-cast v0, La/j2r0;

    .line 3440
    .line 3441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3442
    .line 3443
    .line 3444
    new-instance v1, La/t7r0;

    .line 3445
    .line 3446
    new-instance v3, La/ijm;

    .line 3447
    .line 3448
    invoke-direct {v3}, La/ijm;-><init>()V

    .line 3449
    .line 3450
    .line 3451
    sget-object v4, La/kjm;->a:La/kjm;

    .line 3452
    .line 3453
    sget-object v4, Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Champs$Live;->a:Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header$Cyber$Champs$Live;

    .line 3454
    .line 3455
    const/4 v15, 0x0

    .line 3456
    invoke-direct {v1, v4, v15, v3}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 3457
    .line 3458
    .line 3459
    new-instance v3, La/k2r0;

    .line 3460
    .line 3461
    new-instance v5, La/z2m;

    .line 3462
    .line 3463
    const v7, 0x3f666666    # 0.9f

    .line 3464
    .line 3465
    .line 3466
    invoke-direct {v5, v7}, La/z2m;-><init>(F)V

    .line 3467
    .line 3468
    .line 3469
    new-instance v6, La/z2m;

    .line 3470
    .line 3471
    invoke-direct {v6, v7}, La/z2m;-><init>(F)V

    .line 3472
    .line 3473
    .line 3474
    new-instance v8, La/z2m;

    .line 3475
    .line 3476
    invoke-direct {v8, v7}, La/z2m;-><init>(F)V

    .line 3477
    .line 3478
    .line 3479
    filled-new-array {v5, v6, v8}, [La/z2m;

    .line 3480
    .line 3481
    .line 3482
    move-result-object v5

    .line 3483
    invoke-static {v5}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 3484
    .line 3485
    .line 3486
    move-result-object v5

    .line 3487
    invoke-direct {v3, v5}, La/k2r0;-><init>(La/a4x;)V

    .line 3488
    .line 3489
    .line 3490
    const/4 v14, 0x2

    .line 3491
    new-array v5, v14, [La/qdr0;

    .line 3492
    .line 3493
    const/16 v25, 0x0

    .line 3494
    .line 3495
    aput-object v1, v5, v25

    .line 3496
    .line 3497
    const/16 v22, 0x1

    .line 3498
    .line 3499
    aput-object v3, v5, v22

    .line 3500
    .line 3501
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 3502
    .line 3503
    .line 3504
    move-result-object v1

    .line 3505
    iget-object v3, v0, La/j2r0;->c:Ljava/util/List;

    .line 3506
    .line 3507
    iget-object v5, v2, La/zer0;->a:La/ctf0;

    .line 3508
    .line 3509
    invoke-virtual {v2}, La/zer0;->b()La/fee;

    .line 3510
    .line 3511
    .line 3512
    move-result-object v2

    .line 3513
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 3514
    .line 3515
    .line 3516
    move-result-object v2

    .line 3517
    check-cast v2, La/xdr0;

    .line 3518
    .line 3519
    iget-boolean v2, v2, La/xdr0;->k:Z

    .line 3520
    .line 3521
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3522
    .line 3523
    .line 3524
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3525
    .line 3526
    .line 3527
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 3528
    .line 3529
    .line 3530
    move-result v6

    .line 3531
    if-eqz v6, :cond_5e

    .line 3532
    .line 3533
    sget-object v2, La/iun;->a:La/iun;

    .line 3534
    .line 3535
    goto/16 :goto_4a

    .line 3536
    .line 3537
    :cond_5e
    new-instance v6, Ljava/util/ArrayList;

    .line 3538
    .line 3539
    const/16 v8, 0xa

    .line 3540
    .line 3541
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3542
    .line 3543
    .line 3544
    move-result v7

    .line 3545
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 3546
    .line 3547
    .line 3548
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3549
    .line 3550
    .line 3551
    move-result-object v3

    .line 3552
    :goto_49
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 3553
    .line 3554
    .line 3555
    move-result v7

    .line 3556
    if-eqz v7, :cond_5f

    .line 3557
    .line 3558
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3559
    .line 3560
    .line 3561
    move-result-object v7

    .line 3562
    check-cast v7, La/xah;

    .line 3563
    .line 3564
    invoke-static {v7, v2}, La/qzb;->c1(La/xah;Z)La/y2m;

    .line 3565
    .line 3566
    .line 3567
    move-result-object v7

    .line 3568
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3569
    .line 3570
    .line 3571
    goto :goto_49

    .line 3572
    :cond_5f
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3573
    .line 3574
    .line 3575
    move-result-object v2

    .line 3576
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3577
    .line 3578
    .line 3579
    move-result-object v3

    .line 3580
    new-instance v6, La/t7r0;

    .line 3581
    .line 3582
    const/4 v8, 0x0

    .line 3583
    new-array v7, v8, [Ljava/lang/Object;

    .line 3584
    .line 3585
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 3586
    .line 3587
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3588
    .line 3589
    .line 3590
    move-result-object v7

    .line 3591
    const v9, 0x7f131667

    .line 3592
    .line 3593
    .line 3594
    invoke-virtual {v5, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3595
    .line 3596
    .line 3597
    move-result-object v23

    .line 3598
    new-array v7, v8, [Ljava/lang/Object;

    .line 3599
    .line 3600
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3601
    .line 3602
    .line 3603
    move-result-object v7

    .line 3604
    const v9, 0x7f130366

    .line 3605
    .line 3606
    .line 3607
    invoke-virtual {v5, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3608
    .line 3609
    .line 3610
    move-result-object v30

    .line 3611
    new-instance v7, La/ue9;

    .line 3612
    .line 3613
    new-array v9, v8, [Ljava/lang/Object;

    .line 3614
    .line 3615
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3616
    .line 3617
    .line 3618
    move-result-object v8

    .line 3619
    const v9, 0x7f1300e4

    .line 3620
    .line 3621
    .line 3622
    invoke-virtual {v5, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3623
    .line 3624
    .line 3625
    move-result-object v5

    .line 3626
    invoke-direct {v7, v5}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 3627
    .line 3628
    .line 3629
    new-instance v22, La/hjm;

    .line 3630
    .line 3631
    const/16 v34, 0x0

    .line 3632
    .line 3633
    const/16 v35, 0x1a7e

    .line 3634
    .line 3635
    const/16 v24, 0x0

    .line 3636
    .line 3637
    const/16 v25, 0x0

    .line 3638
    .line 3639
    const/16 v26, 0x0

    .line 3640
    .line 3641
    const/16 v27, 0x0

    .line 3642
    .line 3643
    const/16 v28, 0x0

    .line 3644
    .line 3645
    const/16 v29, 0x0

    .line 3646
    .line 3647
    sget-object v31, La/cso0;->a:La/cso0;

    .line 3648
    .line 3649
    const/16 v32, 0x0

    .line 3650
    .line 3651
    move-object/from16 v33, v7

    .line 3652
    .line 3653
    invoke-direct/range {v22 .. v35}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 3654
    .line 3655
    .line 3656
    move-object/from16 v5, v22

    .line 3657
    .line 3658
    sget-object v7, La/kjm;->a:La/kjm;

    .line 3659
    .line 3660
    invoke-direct {v6, v4, v12, v5}, La/t7r0;-><init>(Lorg/xplatform/top/impl/presentation/ui/model/TopSectionKey$Header;Lorg/xplatform/top/api/presentation/header/TopHeaderTagType;La/jjm;)V

    .line 3661
    .line 3662
    .line 3663
    invoke-virtual {v3, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3664
    .line 3665
    .line 3666
    new-instance v4, La/k2r0;

    .line 3667
    .line 3668
    invoke-direct {v4, v2}, La/k2r0;-><init>(La/a4x;)V

    .line 3669
    .line 3670
    .line 3671
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 3672
    .line 3673
    .line 3674
    move-result-object v2

    .line 3675
    invoke-virtual {v3, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 3676
    .line 3677
    .line 3678
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3679
    .line 3680
    .line 3681
    move-result-object v2

    .line 3682
    :goto_4a
    invoke-static {v0, v1, v2}, La/zer0;->c(La/f0r0;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 3683
    .line 3684
    .line 3685
    move-result-object v0

    .line 3686
    return-object v0

    .line 3687
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
