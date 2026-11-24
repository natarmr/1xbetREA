.class public final La/hjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ctf0;

.field public final c:La/g2v;

.field public final d:La/n0o0;


# direct methods
.method public constructor <init>(La/g2v;La/ctf0;La/sig;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/hjg;->a:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/hjg;->c:La/g2v;

    .line 11
    .line 12
    iput-object p2, p0, La/hjg;->b:La/ctf0;

    .line 13
    .line 14
    new-instance v1, La/lig;

    .line 15
    .line 16
    sget-object v2, La/iun;->a:La/iun;

    .line 17
    .line 18
    iget-object v3, p3, La/sig;->g:La/wcb;

    .line 19
    .line 20
    iget-object v4, p3, La/sig;->j:Ljava/util/List;

    .line 21
    .line 22
    sget-object v9, La/lun;->a:La/lun;

    .line 23
    .line 24
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v5, ""

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    move-object v7, v2

    .line 32
    invoke-direct/range {v1 .. v9}, La/lig;-><init>(Ljava/util/List;La/wcb;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Map;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, La/hfg;

    .line 36
    .line 37
    const/4 p2, 0x6

    .line 38
    invoke-direct {p1, p3, p2}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p2, La/yw9;

    .line 42
    .line 43
    const/16 p3, 0x14

    .line 44
    .line 45
    invoke-direct {p2, v1, p1, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, La/hjg;->d:La/n0o0;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(La/pyy;La/ctf0;La/g2v;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/hjg;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p2, p0, La/hjg;->b:La/ctf0;

    .line 57
    iput-object p3, p0, La/hjg;->c:La/g2v;

    .line 58
    new-instance p2, La/adw;

    const/16 p3, 0x16

    invoke-direct {p2, p0, p3}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 59
    new-instance p3, La/yw9;

    const/16 v0, 0x14

    invoke-direct {p3, p1, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 60
    iput-object p1, p0, La/hjg;->d:La/n0o0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hjg;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/pyy;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v4, v1, La/pyy;->c:La/j0g0;

    .line 18
    .line 19
    iget-object v5, v0, La/hjg;->c:La/g2v;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    iget-boolean v6, v1, La/pyy;->a:Z

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    new-instance v0, La/qyy;

    .line 28
    .line 29
    new-instance v1, La/myy;

    .line 30
    .line 31
    sget-object v2, La/ldm;->a:La/ldm;

    .line 32
    .line 33
    invoke-static {v5, v2}, La/yyw;->N(La/g2v;La/ldm;)La/mdm;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v1, v2}, La/myy;-><init>(La/mdm;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1}, La/qyy;-><init>(La/myy;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_0
    sget-object v6, La/lyy;->a:La/lyy;

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    new-instance v0, La/qyy;

    .line 50
    .line 51
    iget-object v4, v1, La/pyy;->f:La/sff0;

    .line 52
    .line 53
    iget-object v4, v4, La/sff0;->g:La/mum0;

    .line 54
    .line 55
    iget-object v4, v4, La/mum0;->y:La/v5l0;

    .line 56
    .line 57
    iget-boolean v1, v1, La/pyy;->g:Z

    .line 58
    .line 59
    new-instance v5, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge v2, v3, :cond_1

    .line 65
    .line 66
    invoke-static {v4}, La/hkb;->G(La/v5l0;)La/mla;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    new-instance v3, La/jyy;

    .line 81
    .line 82
    const-string v4, "RESULT_CARD_SHIMMER_KEY"

    .line 83
    .line 84
    invoke-direct {v3, v2, v4, v1}, La/jyy;-><init>(La/a4x;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    filled-new-array {v3}, [La/jyy;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-direct {v0, v6, v1}, La/qyy;-><init>(La/nyy;La/a4x;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    iget-object v2, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 100
    .line 101
    instance-of v2, v2, La/g0g0;

    .line 102
    .line 103
    if-eqz v2, :cond_3

    .line 104
    .line 105
    new-instance v0, La/qyy;

    .line 106
    .line 107
    new-instance v1, La/myy;

    .line 108
    .line 109
    sget-object v2, La/ldm;->a:La/ldm;

    .line 110
    .line 111
    invoke-static {v5, v2}, La/yyw;->N(La/g2v;La/ldm;)La/mdm;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-direct {v1, v2}, La/myy;-><init>(La/mdm;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v1}, La/qyy;-><init>(La/myy;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    iget-object v0, v0, La/hjg;->d:La/n0o0;

    .line 123
    .line 124
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, La/fee;

    .line 129
    .line 130
    invoke-virtual {v2, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, La/fee;

    .line 142
    .line 143
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/util/Collection;

    .line 148
    .line 149
    invoke-static {v1, v0, v1}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_4

    .line 158
    .line 159
    new-instance v0, La/qyy;

    .line 160
    .line 161
    new-instance v1, La/myy;

    .line 162
    .line 163
    invoke-static {v5}, La/yyw;->M(La/g2v;)La/mdm;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-direct {v1, v2}, La/myy;-><init>(La/mdm;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v0, v1}, La/qyy;-><init>(La/myy;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_4
    new-instance v1, La/qyy;

    .line 175
    .line 176
    invoke-direct {v1, v6, v0}, La/qyy;-><init>(La/nyy;La/a4x;)V

    .line 177
    .line 178
    .line 179
    move-object v0, v1

    .line 180
    :goto_1
    return-object v0

    .line 181
    :pswitch_0
    move-object/from16 v1, p1

    .line 182
    .line 183
    check-cast v1, La/sig;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v4, v1, La/sig;->i:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v5, v1, La/sig;->l:Ljava/util/List;

    .line 191
    .line 192
    iget-object v6, v1, La/sig;->h:La/mig;

    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    if-eqz v6, :cond_5

    .line 196
    .line 197
    iget-object v6, v6, La/mig;->a:Ljava/lang/Object;

    .line 198
    .line 199
    new-instance v8, La/j0g0;

    .line 200
    .line 201
    invoke-direct {v8, v6}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_5
    move-object v8, v7

    .line 206
    :goto_2
    iget-object v6, v1, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 207
    .line 208
    iget-wide v9, v6, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->b:J

    .line 209
    .line 210
    new-instance v6, La/vef;

    .line 211
    .line 212
    const/4 v11, 0x5

    .line 213
    invoke-direct {v6, v0, v1, v11}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    iget-boolean v11, v1, La/sig;->f:Z

    .line 217
    .line 218
    iget-object v12, v0, La/hjg;->c:La/g2v;

    .line 219
    .line 220
    if-nez v8, :cond_6

    .line 221
    .line 222
    if-nez v11, :cond_6

    .line 223
    .line 224
    invoke-static {v9, v10, v12}, La/rcb;->e0(JLa/g2v;)La/lgg;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    goto/16 :goto_a

    .line 229
    .line 230
    :cond_6
    sget-object v11, La/mgg;->a:La/mgg;

    .line 231
    .line 232
    if-nez v8, :cond_9

    .line 233
    .line 234
    new-instance v6, La/lgg;

    .line 235
    .line 236
    new-instance v7, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    move v8, v2

    .line 242
    :goto_3
    if-ge v8, v3, :cond_8

    .line 243
    .line 244
    new-instance v9, La/ncg;

    .line 245
    .line 246
    const-string v10, "CHAMP_HEADER_SHIMMER_KEY"

    .line 247
    .line 248
    invoke-static {v8, v10}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    new-instance v12, La/ijm;

    .line 253
    .line 254
    new-instance v13, La/qjm;

    .line 255
    .line 256
    invoke-direct {v13}, La/qjm;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-direct {v12, v13}, La/ijm;-><init>(La/qjm;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {v9, v10, v12}, La/ncg;-><init>(Ljava/lang/String;La/jjm;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move v9, v2

    .line 269
    :goto_4
    const/4 v10, 0x3

    .line 270
    if-ge v9, v10, :cond_7

    .line 271
    .line 272
    new-instance v10, La/acg;

    .line 273
    .line 274
    const-string v12, "CHAMP_CELL_SHIMMER_KEY"

    .line 275
    .line 276
    const-string v13, "_"

    .line 277
    .line 278
    invoke-static {v8, v12, v9, v13}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    invoke-direct {v10, v12}, La/acg;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    add-int/lit8 v9, v9, 0x1

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_8
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-direct {v6, v3, v11}, La/lgg;-><init>(La/a4x;La/ogg;)V

    .line 299
    .line 300
    .line 301
    :goto_5
    move-object v3, v6

    .line 302
    goto/16 :goto_a

    .line 303
    .line 304
    :cond_9
    iget-object v3, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 305
    .line 306
    instance-of v8, v3, La/g0g0;

    .line 307
    .line 308
    if-eqz v8, :cond_a

    .line 309
    .line 310
    move-object v13, v7

    .line 311
    goto :goto_6

    .line 312
    :cond_a
    move-object v13, v3

    .line 313
    :goto_6
    if-nez v13, :cond_b

    .line 314
    .line 315
    invoke-static {v9, v10, v12}, La/rcb;->e0(JLa/g2v;)La/lgg;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    goto/16 :goto_a

    .line 320
    .line 321
    :cond_b
    if-eqz v8, :cond_c

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_c
    move-object v7, v3

    .line 325
    :goto_7
    check-cast v7, Ljava/util/List;

    .line 326
    .line 327
    if-nez v7, :cond_d

    .line 328
    .line 329
    sget-object v7, La/iun;->a:La/iun;

    .line 330
    .line 331
    :cond_d
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-eqz v3, :cond_e

    .line 336
    .line 337
    sget-object v3, La/lak0;->c:La/lak0;

    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_e
    invoke-virtual {v6}, La/vef;->invoke()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, La/a4x;

    .line 345
    .line 346
    :goto_8
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    if-eqz v6, :cond_10

    .line 351
    .line 352
    new-instance v3, La/lgg;

    .line 353
    .line 354
    sget-object v6, La/lak0;->c:La/lak0;

    .line 355
    .line 356
    new-instance v7, La/ngg;

    .line 357
    .line 358
    invoke-static {v4}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    const-wide/16 v13, -0x1

    .line 363
    .line 364
    if-nez v8, :cond_f

    .line 365
    .line 366
    invoke-static {v9, v10, v13, v14}, La/ozb;->N(JJ)La/pb10;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    const-wide/16 v23, 0x0

    .line 371
    .line 372
    const/16 v25, 0x3de

    .line 373
    .line 374
    const/4 v14, 0x0

    .line 375
    const/4 v15, 0x0

    .line 376
    const/16 v16, 0x0

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const v18, 0x7f130e37

    .line 381
    .line 382
    .line 383
    const/16 v19, 0x0

    .line 384
    .line 385
    const/16 v20, 0x0

    .line 386
    .line 387
    const-wide/16 v21, 0x0

    .line 388
    .line 389
    invoke-static/range {v12 .. v25}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    goto :goto_9

    .line 394
    :cond_f
    invoke-static {v9, v10, v13, v14}, La/ozb;->N(JJ)La/pb10;

    .line 395
    .line 396
    .line 397
    move-result-object v13

    .line 398
    const-wide/16 v23, 0x0

    .line 399
    .line 400
    const/16 v25, 0x25e

    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const/4 v15, 0x0

    .line 404
    const/16 v16, 0x0

    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const v18, 0x7f1305c0

    .line 409
    .line 410
    .line 411
    const/16 v19, 0x0

    .line 412
    .line 413
    const v20, 0x7f131111

    .line 414
    .line 415
    .line 416
    const-wide/16 v21, 0x2710

    .line 417
    .line 418
    invoke-static/range {v12 .. v25}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    :goto_9
    invoke-direct {v7, v8}, La/ngg;-><init>(La/mdm;)V

    .line 423
    .line 424
    .line 425
    invoke-direct {v3, v6, v7}, La/lgg;-><init>(La/a4x;La/ogg;)V

    .line 426
    .line 427
    .line 428
    goto :goto_a

    .line 429
    :cond_10
    new-instance v6, La/lgg;

    .line 430
    .line 431
    invoke-direct {v6, v3, v11}, La/lgg;-><init>(La/a4x;La/ogg;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_5

    .line 435
    .line 436
    :goto_a
    new-instance v6, La/kgg;

    .line 437
    .line 438
    iget-boolean v1, v1, La/sig;->k:Z

    .line 439
    .line 440
    new-instance v10, La/ue9;

    .line 441
    .line 442
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    const-string v8, "10"

    .line 451
    .line 452
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    iget-object v0, v0, La/hjg;->b:La/ctf0;

    .line 457
    .line 458
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 459
    .line 460
    const/4 v9, 0x2

    .line 461
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    const v9, 0x7f131222

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    invoke-direct {v10, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    sget-object v8, La/lul;->e:La/lul;

    .line 476
    .line 477
    sget-object v9, La/oe9;->b:La/oe9;

    .line 478
    .line 479
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    if-lez v5, :cond_11

    .line 484
    .line 485
    const/4 v5, 0x1

    .line 486
    move v11, v5

    .line 487
    goto :goto_b

    .line 488
    :cond_11
    move v11, v2

    .line 489
    :goto_b
    new-instance v7, La/wul;

    .line 490
    .line 491
    const/4 v12, 0x0

    .line 492
    const/4 v13, 0x0

    .line 493
    invoke-direct/range {v7 .. v13}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 494
    .line 495
    .line 496
    new-instance v14, La/ue9;

    .line 497
    .line 498
    new-array v5, v2, [Ljava/lang/Object;

    .line 499
    .line 500
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 501
    .line 502
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    const v5, 0x7f13032f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-direct {v14, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    sget-object v12, La/nul;->e:La/nul;

    .line 517
    .line 518
    new-instance v11, La/wul;

    .line 519
    .line 520
    const/16 v16, 0x0

    .line 521
    .line 522
    const/16 v17, 0x0

    .line 523
    .line 524
    const/4 v15, 0x1

    .line 525
    move-object v13, v9

    .line 526
    invoke-direct/range {v11 .. v17}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 527
    .line 528
    .line 529
    invoke-direct {v6, v1, v7, v11}, La/kgg;-><init>(ZLa/wul;La/wul;)V

    .line 530
    .line 531
    .line 532
    new-instance v0, La/tig;

    .line 533
    .line 534
    invoke-direct {v0, v3, v6, v4}, La/tig;-><init>(La/lgg;La/kgg;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    return-object v0

    .line 538
    nop

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
