.class public final synthetic La/bsk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/csk;


# direct methods
.method public synthetic constructor <init>(La/csk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bsk;->a:B

    iput-object p1, p0, La/bsk;->b:La/csk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/bsk;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/bsk;->b:La/csk;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/csk;->b:La/ctf0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x5

    .line 26
    if-ge v0, v2, :cond_0

    .line 27
    .line 28
    sget-object p0, La/iun;->a:La/iun;

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v2, La/ork;

    .line 37
    .line 38
    new-instance v4, La/v7m;

    .line 39
    .line 40
    new-instance v5, La/c8m;

    .line 41
    .line 42
    new-array v6, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 45
    .line 46
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const v7, 0x7f130053

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object v6, La/n7m;->a:La/n7m;

    .line 58
    .line 59
    invoke-direct {v5, p0, v6}, La/c8m;-><init>(Ljava/lang/CharSequence;La/o7m;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v4, v5}, La/v7m;-><init>(La/c8m;)V

    .line 63
    .line 64
    .line 65
    const/16 p0, 0xa

    .line 66
    .line 67
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v5, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {p1, p0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :goto_0
    move v7, v3

    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    add-int/lit8 v3, v7, 0x1

    .line 96
    .line 97
    if-ltz v7, :cond_1

    .line 98
    .line 99
    check-cast p1, La/bm;

    .line 100
    .line 101
    new-instance v6, La/y8m;

    .line 102
    .line 103
    iget-wide v8, p1, La/bm;->a:J

    .line 104
    .line 105
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    new-instance v9, La/n0x;

    .line 110
    .line 111
    iget-object v10, p1, La/bm;->c:Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v9, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v10, p1, La/bm;->b:Ljava/lang/String;

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    invoke-direct/range {v6 .. v11}, La/y8m;-><init>(ILjava/lang/String;La/n0x;Ljava/lang/String;Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 127
    .line 128
    .line 129
    throw v1

    .line 130
    :cond_2
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance p1, La/d9m;

    .line 135
    .line 136
    invoke-direct {p1, p0}, La/d9m;-><init>(La/a4x;)V

    .line 137
    .line 138
    .line 139
    const-string p0, "ACTIVE_TEAMS"

    .line 140
    .line 141
    invoke-direct {v2, p0, v4, p1}, La/ork;-><init>(Ljava/lang/String;La/b8m;La/j9m;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :goto_1
    return-object p0

    .line 152
    :pswitch_0
    check-cast p1, La/zrk;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, La/csk;->a:La/ksk;

    .line 158
    .line 159
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 160
    .line 161
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 162
    .line 163
    iget-object p0, p0, La/csk;->b:La/ctf0;

    .line 164
    .line 165
    invoke-static {p1, v0, p0}, La/ask;->a(La/zrk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_1
    check-cast p1, La/zrk;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, La/csk;->a:La/ksk;

    .line 176
    .line 177
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 178
    .line 179
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 180
    .line 181
    iget-object p0, p0, La/csk;->b:La/ctf0;

    .line 182
    .line 183
    invoke-static {p1, v0, p0}, La/ask;->a(La/zrk;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/ctf0;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_2
    move-object v1, p1

    .line 189
    check-cast v1, La/btk;

    .line 190
    .line 191
    iget-object p1, p0, La/csk;->a:La/ksk;

    .line 192
    .line 193
    iget-object v0, p1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 194
    .line 195
    iget-object v6, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 196
    .line 197
    iget-byte v0, v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 198
    .line 199
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 200
    .line 201
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 202
    .line 203
    if-ne v0, v4, :cond_3

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_3
    move v2, v3

    .line 207
    :goto_2
    if-eqz v1, :cond_5

    .line 208
    .line 209
    iget-object v0, p0, La/csk;->d:La/y78;

    .line 210
    .line 211
    iget-object v3, p0, La/csk;->b:La/ctf0;

    .line 212
    .line 213
    iget-object p0, p0, La/csk;->e:La/n0o0;

    .line 214
    .line 215
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p0, La/fee;

    .line 220
    .line 221
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    check-cast p0, Ljava/lang/Boolean;

    .line 226
    .line 227
    if-eqz p0, :cond_4

    .line 228
    .line 229
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    :cond_4
    move v9, v2

    .line 234
    iget-boolean v7, p1, La/ksk;->g:Z

    .line 235
    .line 236
    iget-object v2, p1, La/ksk;->b:La/sff0;

    .line 237
    .line 238
    iget-object v5, p1, La/ksk;->e:Ljava/util/List;

    .line 239
    .line 240
    iget-object p0, v2, La/sff0;->g:La/mum0;

    .line 241
    .line 242
    iget-object v4, p0, La/mum0;->y:La/v5l0;

    .line 243
    .line 244
    iget-boolean v10, p1, La/ksk;->i:Z

    .line 245
    .line 246
    const/4 v8, 0x0

    .line 247
    invoke-static/range {v0 .. v10}, La/trk;->a(La/y78;La/btk;La/sff0;La/ctf0;La/v5l0;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZZZ)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    if-nez p0, :cond_6

    .line 252
    .line 253
    :cond_5
    sget-object p0, La/iun;->a:La/iun;

    .line 254
    .line 255
    :cond_6
    return-object p0

    .line 256
    :pswitch_3
    move-object v1, p1

    .line 257
    check-cast v1, La/btk;

    .line 258
    .line 259
    iget-object p1, p0, La/csk;->a:La/ksk;

    .line 260
    .line 261
    iget-object v0, p1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 262
    .line 263
    iget-object v6, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 264
    .line 265
    iget-byte v0, v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 266
    .line 267
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 268
    .line 269
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 270
    .line 271
    if-ne v0, v4, :cond_7

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_7
    move v2, v3

    .line 275
    :goto_3
    if-eqz v1, :cond_9

    .line 276
    .line 277
    iget-object v0, p0, La/csk;->d:La/y78;

    .line 278
    .line 279
    iget-object v3, p0, La/csk;->b:La/ctf0;

    .line 280
    .line 281
    iget-object p0, p0, La/csk;->e:La/n0o0;

    .line 282
    .line 283
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    check-cast p0, La/fee;

    .line 288
    .line 289
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    check-cast p0, Ljava/lang/Boolean;

    .line 294
    .line 295
    if-eqz p0, :cond_8

    .line 296
    .line 297
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    :cond_8
    move v9, v2

    .line 302
    iget-boolean v7, p1, La/ksk;->g:Z

    .line 303
    .line 304
    iget-object v2, p1, La/ksk;->b:La/sff0;

    .line 305
    .line 306
    iget-object v5, p1, La/ksk;->e:Ljava/util/List;

    .line 307
    .line 308
    iget-object p0, v2, La/sff0;->g:La/mum0;

    .line 309
    .line 310
    iget-object v4, p0, La/mum0;->y:La/v5l0;

    .line 311
    .line 312
    iget-boolean v10, p1, La/ksk;->i:Z

    .line 313
    .line 314
    const/4 v8, 0x1

    .line 315
    invoke-static/range {v0 .. v10}, La/trk;->a(La/y78;La/btk;La/sff0;La/ctf0;La/v5l0;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;ZZZZ)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    if-nez p0, :cond_a

    .line 320
    .line 321
    :cond_9
    sget-object p0, La/iun;->a:La/iun;

    .line 322
    .line 323
    :cond_a
    return-object p0

    .line 324
    :pswitch_4
    check-cast p1, La/j0g0;

    .line 325
    .line 326
    iget-object v0, p0, La/csk;->a:La/ksk;

    .line 327
    .line 328
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 329
    .line 330
    iget-wide v4, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 331
    .line 332
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 333
    .line 334
    iget-object p0, p0, La/csk;->b:La/ctf0;

    .line 335
    .line 336
    sget-object v6, La/qrk;->a:Ljava/util/List;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    new-instance v6, La/prk;

    .line 345
    .line 346
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 347
    .line 348
    if-eqz p1, :cond_c

    .line 349
    .line 350
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 351
    .line 352
    instance-of v7, p1, La/g0g0;

    .line 353
    .line 354
    if-eqz v7, :cond_b

    .line 355
    .line 356
    move-object p1, v1

    .line 357
    :cond_b
    check-cast p1, La/jtk;

    .line 358
    .line 359
    if-eqz p1, :cond_c

    .line 360
    .line 361
    iget-object p1, p1, La/jtk;->c:La/itk;

    .line 362
    .line 363
    if-eqz p1, :cond_c

    .line 364
    .line 365
    iget-boolean p1, p1, La/itk;->a:Z

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_c
    move p1, v3

    .line 369
    :goto_4
    sget-object v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 370
    .line 371
    iget-byte v7, v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 372
    .line 373
    if-ne v0, v7, :cond_d

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_d
    move v2, v3

    .line 377
    :goto_5
    invoke-static {}, La/gql0;->e()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    sget-object v7, La/qrk;->a:Ljava/util/List;

    .line 390
    .line 391
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-interface {v7, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    const/4 v7, 0x6

    .line 404
    if-eqz v0, :cond_e

    .line 405
    .line 406
    if-eqz v2, :cond_e

    .line 407
    .line 408
    new-instance v0, La/ona;

    .line 409
    .line 410
    new-instance v8, La/m0x;

    .line 411
    .line 412
    const v9, 0x7f080624

    .line 413
    .line 414
    .line 415
    invoke-direct {v8, v9, v1, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 416
    .line 417
    .line 418
    new-array v9, v3, [Ljava/lang/Object;

    .line 419
    .line 420
    iget-object v10, p0, La/ctf0;->b:La/lsm0;

    .line 421
    .line 422
    invoke-static {v9, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    const v11, 0x7f1305f3

    .line 427
    .line 428
    .line 429
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    const-wide/16 v10, 0x2

    .line 434
    .line 435
    invoke-direct {v0, v10, v11, v8, v9}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v5, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    :cond_e
    if-eqz v4, :cond_f

    .line 442
    .line 443
    if-eqz v2, :cond_f

    .line 444
    .line 445
    new-instance v0, La/ona;

    .line 446
    .line 447
    new-instance v2, La/m0x;

    .line 448
    .line 449
    const v4, 0x7f080622

    .line 450
    .line 451
    .line 452
    invoke-direct {v2, v4, v1, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 453
    .line 454
    .line 455
    new-array v4, v3, [Ljava/lang/Object;

    .line 456
    .line 457
    iget-object v8, p0, La/ctf0;->b:La/lsm0;

    .line 458
    .line 459
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    const v9, 0x7f1305f1

    .line 464
    .line 465
    .line 466
    invoke-virtual {v8, v9, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    const-wide/16 v8, 0x1

    .line 471
    .line 472
    invoke-direct {v0, v8, v9, v2, v4}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v5, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    :cond_f
    new-instance v0, La/ona;

    .line 479
    .line 480
    new-instance v2, La/m0x;

    .line 481
    .line 482
    const v4, 0x7f080623

    .line 483
    .line 484
    .line 485
    invoke-direct {v2, v4, v1, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 486
    .line 487
    .line 488
    new-array v4, v3, [Ljava/lang/Object;

    .line 489
    .line 490
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 491
    .line 492
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    const v8, 0x7f1305f2

    .line 497
    .line 498
    .line 499
    invoke-virtual {p0, v8, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    const-wide/16 v8, 0x0

    .line 504
    .line 505
    invoke-direct {v0, v8, v9, v2, v4}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v5, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    if-eqz p1, :cond_10

    .line 512
    .line 513
    new-instance p1, La/ona;

    .line 514
    .line 515
    new-instance v0, La/m0x;

    .line 516
    .line 517
    const v2, 0x7f080621

    .line 518
    .line 519
    .line 520
    invoke-direct {v0, v2, v1, v7}, La/m0x;-><init>(ILa/bzw;I)V

    .line 521
    .line 522
    .line 523
    new-array v1, v3, [Ljava/lang/Object;

    .line 524
    .line 525
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    const v2, 0x7f1305f0

    .line 530
    .line 531
    .line 532
    invoke-virtual {p0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    const-wide/16 v1, 0x3

    .line 537
    .line 538
    invoke-direct {p1, v1, v2, v0, p0}, La/ona;-><init>(JLa/m0x;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    :cond_10
    invoke-static {v5}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    invoke-static {p0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    new-instance p1, La/yna;

    .line 553
    .line 554
    invoke-direct {p1, p0}, La/yna;-><init>(La/a4x;)V

    .line 555
    .line 556
    .line 557
    const-string p0, "CHIPS_BLOCK"

    .line 558
    .line 559
    invoke-direct {v6, p0, p1}, La/prk;-><init>(Ljava/lang/String;La/eoa;)V

    .line 560
    .line 561
    .line 562
    return-object v6

    .line 563
    :pswitch_5
    check-cast p1, La/j0g0;

    .line 564
    .line 565
    iget-object v0, p0, La/csk;->a:La/ksk;

    .line 566
    .line 567
    iget-boolean v0, v0, La/ksk;->f:Z

    .line 568
    .line 569
    iget-object p0, p0, La/csk;->e:La/n0o0;

    .line 570
    .line 571
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    check-cast p0, La/fee;

    .line 576
    .line 577
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    move-object v9, p0

    .line 582
    check-cast v9, La/qt20;

    .line 583
    .line 584
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    if-eqz p1, :cond_12

    .line 588
    .line 589
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 590
    .line 591
    instance-of p1, p0, La/g0g0;

    .line 592
    .line 593
    if-eqz p1, :cond_11

    .line 594
    .line 595
    goto :goto_6

    .line 596
    :cond_11
    move-object v1, p0

    .line 597
    :goto_6
    check-cast v1, La/jtk;

    .line 598
    .line 599
    :cond_12
    new-instance v4, La/psk;

    .line 600
    .line 601
    new-instance p0, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    sget-object p1, La/ujn;->h:Ljava/lang/String;

    .line 604
    .line 605
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    const-string p1, ""

    .line 609
    .line 610
    if-eqz v0, :cond_14

    .line 611
    .line 612
    if-eqz v1, :cond_13

    .line 613
    .line 614
    iget-object v5, v1, La/jtk;->b:La/ypl0;

    .line 615
    .line 616
    if-eqz v5, :cond_13

    .line 617
    .line 618
    iget-object v5, v5, La/ypl0;->c:La/lel0;

    .line 619
    .line 620
    if-eqz v5, :cond_13

    .line 621
    .line 622
    iget-object v5, v5, La/lel0;->d:Ljava/lang/String;

    .line 623
    .line 624
    if-nez v5, :cond_15

    .line 625
    .line 626
    :cond_13
    :goto_7
    move-object v5, p1

    .line 627
    goto :goto_8

    .line 628
    :cond_14
    if-eqz v1, :cond_13

    .line 629
    .line 630
    iget-object v5, v1, La/jtk;->b:La/ypl0;

    .line 631
    .line 632
    if-eqz v5, :cond_13

    .line 633
    .line 634
    iget-object v5, v5, La/ypl0;->c:La/lel0;

    .line 635
    .line 636
    if-eqz v5, :cond_13

    .line 637
    .line 638
    iget-object v5, v5, La/lel0;->c:Ljava/lang/String;

    .line 639
    .line 640
    if-nez v5, :cond_15

    .line 641
    .line 642
    goto :goto_7

    .line 643
    :cond_15
    :goto_8
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 644
    .line 645
    .line 646
    move-result v6

    .line 647
    const-string v7, "/"

    .line 648
    .line 649
    const-string v8, "https://"

    .line 650
    .line 651
    const/16 v10, 0x2f

    .line 652
    .line 653
    if-nez v6, :cond_16

    .line 654
    .line 655
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 656
    .line 657
    .line 658
    goto :goto_a

    .line 659
    :cond_16
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 660
    .line 661
    invoke-static {v5, v6, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    if-nez v6, :cond_19

    .line 666
    .line 667
    invoke-static {v5, v8, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 668
    .line 669
    .line 670
    move-result v6

    .line 671
    if-eqz v6, :cond_17

    .line 672
    .line 673
    goto :goto_9

    .line 674
    :cond_17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 675
    .line 676
    .line 677
    move-result v6

    .line 678
    if-lez v6, :cond_18

    .line 679
    .line 680
    invoke-static {p0, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 681
    .line 682
    .line 683
    move-result v6

    .line 684
    if-nez v6, :cond_18

    .line 685
    .line 686
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    :cond_18
    new-array v6, v2, [C

    .line 690
    .line 691
    aput-char v10, v6, v3

    .line 692
    .line 693
    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    goto :goto_a

    .line 701
    :cond_19
    :goto_9
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    :goto_a
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    if-eqz v0, :cond_1a

    .line 712
    .line 713
    const p0, 0x7f08045e

    .line 714
    .line 715
    .line 716
    :goto_b
    move v6, p0

    .line 717
    goto :goto_c

    .line 718
    :cond_1a
    const p0, 0x7f080459

    .line 719
    .line 720
    .line 721
    goto :goto_b

    .line 722
    :goto_c
    new-instance p0, Ljava/lang/StringBuilder;

    .line 723
    .line 724
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 725
    .line 726
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    if-eqz v1, :cond_1b

    .line 730
    .line 731
    iget-object v0, v1, La/jtk;->b:La/ypl0;

    .line 732
    .line 733
    if-eqz v0, :cond_1b

    .line 734
    .line 735
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 736
    .line 737
    if-eqz v0, :cond_1b

    .line 738
    .line 739
    iget-object v0, v0, La/lel0;->n:Ljava/lang/String;

    .line 740
    .line 741
    if-nez v0, :cond_1c

    .line 742
    .line 743
    :cond_1b
    move-object v0, p1

    .line 744
    :cond_1c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 745
    .line 746
    .line 747
    move-result v11

    .line 748
    if-nez v11, :cond_1d

    .line 749
    .line 750
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 751
    .line 752
    .line 753
    goto :goto_e

    .line 754
    :cond_1d
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 755
    .line 756
    invoke-static {v0, v11, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 757
    .line 758
    .line 759
    move-result v11

    .line 760
    if-nez v11, :cond_20

    .line 761
    .line 762
    invoke-static {v0, v8, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 763
    .line 764
    .line 765
    move-result v8

    .line 766
    if-eqz v8, :cond_1e

    .line 767
    .line 768
    goto :goto_d

    .line 769
    :cond_1e
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 770
    .line 771
    .line 772
    move-result v8

    .line 773
    if-lez v8, :cond_1f

    .line 774
    .line 775
    invoke-static {p0, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    if-nez v7, :cond_1f

    .line 780
    .line 781
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    :cond_1f
    new-array v2, v2, [C

    .line 785
    .line 786
    aput-char v10, v2, v3

    .line 787
    .line 788
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    .line 795
    goto :goto_e

    .line 796
    :cond_20
    :goto_d
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    :goto_e
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v7

    .line 806
    if-eqz v1, :cond_22

    .line 807
    .line 808
    iget-object p0, v1, La/jtk;->b:La/ypl0;

    .line 809
    .line 810
    if-eqz p0, :cond_22

    .line 811
    .line 812
    iget-object p0, p0, La/ypl0;->b:Ljava/lang/String;

    .line 813
    .line 814
    if-nez p0, :cond_21

    .line 815
    .line 816
    goto :goto_f

    .line 817
    :cond_21
    move-object v8, p0

    .line 818
    goto :goto_10

    .line 819
    :cond_22
    :goto_f
    move-object v8, p1

    .line 820
    :goto_10
    invoke-direct/range {v4 .. v9}, La/psk;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;La/qt20;)V

    .line 821
    .line 822
    .line 823
    return-object v4

    .line 824
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 825
    .line 826
    if-eqz p1, :cond_23

    .line 827
    .line 828
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 829
    .line 830
    .line 831
    move-result p1

    .line 832
    iget-object p0, p0, La/csk;->a:La/ksk;

    .line 833
    .line 834
    iget-object p0, p0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 835
    .line 836
    iget-object p0, p0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 837
    .line 838
    iget-byte p0, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 839
    .line 840
    invoke-static {p0, p1}, La/rt20;->a(IZ)La/qt20;

    .line 841
    .line 842
    .line 843
    move-result-object p0

    .line 844
    goto :goto_11

    .line 845
    :cond_23
    sget-object p0, La/pt20;->a:La/pt20;

    .line 846
    .line 847
    :goto_11
    return-object p0

    .line 848
    nop

    .line 849
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
