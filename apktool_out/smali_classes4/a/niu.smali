.class public final La/niu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/hhq0;

.field public synthetic k:Z

.field public final synthetic l:La/ywq0;

.field public final synthetic m:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;


# direct methods
.method public constructor <init>(La/ywq0;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/niu;->l:La/ywq0;

    .line 2
    .line 3
    iput-object p2, p0, La/niu;->m:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/hhq0;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    new-instance v0, La/niu;

    .line 12
    .line 13
    iget-object v1, p0, La/niu;->l:La/ywq0;

    .line 14
    .line 15
    iget-object p0, p0, La/niu;->m:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, p3}, La/niu;-><init>(La/ywq0;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/niu;->j:La/hhq0;

    .line 21
    .line 22
    iput-boolean p2, v0, La/niu;->k:Z

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/niu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/niu;->j:La/hhq0;

    .line 4
    .line 5
    iget-boolean v2, v0, La/niu;->k:Z

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, v0, La/niu;->i:Z

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, La/niu;->l:La/ywq0;

    .line 15
    .line 16
    iget-object v9, v0, La/niu;->m:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    if-ne v4, v7, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v5

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, v8, La/ywq0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, La/rtu;

    .line 40
    .line 41
    invoke-interface {v9}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->e()Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    iput-object v1, v0, La/niu;->j:La/hhq0;

    .line 46
    .line 47
    iput-boolean v2, v0, La/niu;->k:Z

    .line 48
    .line 49
    iput-boolean v7, v0, La/niu;->i:Z

    .line 50
    .line 51
    invoke-virtual {v4, v10, v6, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-ne v0, v3, :cond_2

    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_2
    :goto_0
    check-cast v0, La/c3c0;

    .line 59
    .line 60
    invoke-interface {v9}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->e()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v2, v6

    .line 68
    :goto_1
    instance-of v3, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;

    .line 69
    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    iget-object v1, v8, La/ywq0;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/khf0;

    .line 75
    .line 76
    check-cast v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;

    .line 77
    .line 78
    iget v3, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;->a:I

    .line 79
    .line 80
    invoke-static {v3}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    sget-object v3, La/sip;->a:La/bek;

    .line 85
    .line 86
    iget-boolean v4, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;->b:Z

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {v4}, La/bek;->f(Z)La/sip;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v3, v1, La/khf0;->b:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v11, v3

    .line 101
    check-cast v11, La/sb6;

    .line 102
    .line 103
    iget-object v3, v1, La/khf0;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, La/uzc;

    .line 106
    .line 107
    invoke-virtual {v3}, La/uzc;->b()La/jvn;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget-object v1, v1, La/khf0;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, La/gst0;

    .line 114
    .line 115
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iget-object v4, v11, La/sb6;->a:La/knf0;

    .line 120
    .line 121
    invoke-virtual {v4}, La/knf0;->d()La/lnf0;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    new-instance v5, La/jo20;

    .line 126
    .line 127
    invoke-direct {v5}, La/jo20;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-static {v5, v3}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 131
    .line 132
    .line 133
    iget v3, v0, La/c3c0;->a:I

    .line 134
    .line 135
    invoke-static {v5, v3, v1}, La/qbt;->d(Ljava/util/Map;IZ)V

    .line 136
    .line 137
    .line 138
    iget v1, v4, La/lnf0;->b:I

    .line 139
    .line 140
    invoke-static {v1, v5}, La/qbt;->g(ILjava/util/Map;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5}, La/qbt;->h(Ljava/util/Map;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v5, v2}, La/qbt;->i(La/jo20;Z)V

    .line 147
    .line 148
    .line 149
    iget-object v1, v4, La/lnf0;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v1, v5}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v5}, La/qbt;->l(Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    iget-boolean v1, v0, La/c3c0;->b:Z

    .line 158
    .line 159
    iget-wide v2, v0, La/c3c0;->c:J

    .line 160
    .line 161
    invoke-static {v5, v1, v2, v3}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 162
    .line 163
    .line 164
    invoke-static {v5}, La/qbt;->p(Ljava/util/Map;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, La/jo20;->b()La/jo20;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    iget-object v0, v11, La/sb6;->b:La/yzn0;

    .line 172
    .line 173
    invoke-virtual {v0, v14, v12}, La/yzn0;->h(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;)La/or30;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {v12}, La/kpb;->v(La/sip;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v2

    .line 181
    new-instance v4, La/o85;

    .line 182
    .line 183
    const/16 v0, 0x17

    .line 184
    .line 185
    invoke-direct {v4, v0}, La/o85;-><init>(B)V

    .line 186
    .line 187
    .line 188
    new-instance v5, La/rb6;

    .line 189
    .line 190
    const/4 v15, 0x0

    .line 191
    move-object v10, v5

    .line 192
    invoke-direct/range {v10 .. v15}, La/rb6;-><init>(La/sb6;La/sip;La/jo20;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/yje;)V

    .line 193
    .line 194
    .line 195
    const/16 v6, 0x3c

    .line 196
    .line 197
    invoke-static/range {v1 .. v6}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v1, La/ak9;

    .line 202
    .line 203
    const/4 v2, 0x2

    .line 204
    invoke-direct {v1, v0, v2}, La/ak9;-><init>(La/vsg0;B)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :cond_4
    instance-of v3, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;

    .line 209
    .line 210
    if-eqz v3, :cond_5

    .line 211
    .line 212
    iget-object v3, v8, La/ywq0;->e:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v3, La/edu;

    .line 215
    .line 216
    check-cast v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;

    .line 217
    .line 218
    iget-object v4, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;->c:Ljava/util/List;

    .line 219
    .line 220
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    sget-object v5, La/sip;->a:La/bek;

    .line 225
    .line 226
    iget-boolean v6, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;->b:Z

    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-static {v6}, La/bek;->f(Z)La/sip;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-virtual {v3, v4, v5, v0, v2}, La/edu;->h(Ljava/util/Set;La/sip;La/c3c0;Z)La/vsg0;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v2, La/zj2;

    .line 240
    .line 241
    const/16 v3, 0xc

    .line 242
    .line 243
    invoke-direct {v2, v0, v8, v1, v3}, La/zj2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    return-object v2

    .line 247
    :cond_5
    instance-of v3, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;

    .line 248
    .line 249
    if-eqz v3, :cond_a

    .line 250
    .line 251
    check-cast v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;

    .line 252
    .line 253
    iget v3, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->d:I

    .line 254
    .line 255
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 256
    .line 257
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 258
    .line 259
    if-ne v3, v4, :cond_6

    .line 260
    .line 261
    iget-wide v10, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->b:J

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_6
    iget-wide v10, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->a:J

    .line 265
    .line 266
    :goto_2
    iget-object v4, v8, La/ywq0;->d:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v4, La/u8u;

    .line 269
    .line 270
    sget-object v6, La/sip;->a:La/bek;

    .line 271
    .line 272
    iget-boolean v8, v9, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->c:Z

    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-static {v8}, La/bek;->f(Z)La/sip;

    .line 278
    .line 279
    .line 280
    move-result-object v14

    .line 281
    invoke-static {v3}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 282
    .line 283
    .line 284
    move-result-object v15

    .line 285
    iget-wide v8, v1, La/hhq0;->b:J

    .line 286
    .line 287
    iget-wide v12, v1, La/hhq0;->c:J

    .line 288
    .line 289
    iget-object v1, v1, La/hhq0;->a:La/ygq0;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v3, v4, La/u8u;->c:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, La/phf0;

    .line 300
    .line 301
    iget-object v4, v4, La/u8u;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, La/uzc;

    .line 304
    .line 305
    invoke-virtual {v4}, La/uzc;->b()La/jvn;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    iget v6, v0, La/c3c0;->a:I

    .line 310
    .line 311
    move-object/from16 v16, v5

    .line 312
    .line 313
    iget-object v5, v3, La/phf0;->c:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v5, La/knf0;

    .line 316
    .line 317
    invoke-virtual {v5}, La/knf0;->d()La/lnf0;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    new-instance v7, La/jo20;

    .line 322
    .line 323
    invoke-direct {v7}, La/jo20;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-static {v7, v4}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v6, v7}, La/qbt;->c(ILjava/util/Map;)V

    .line 330
    .line 331
    .line 332
    const-wide/16 v18, -0x1

    .line 333
    .line 334
    cmp-long v4, v8, v18

    .line 335
    .line 336
    if-eqz v4, :cond_7

    .line 337
    .line 338
    cmp-long v4, v12, v18

    .line 339
    .line 340
    if-eqz v4, :cond_7

    .line 341
    .line 342
    sget-object v4, La/ygq0;->p:La/ygq0;

    .line 343
    .line 344
    if-ne v1, v4, :cond_7

    .line 345
    .line 346
    const-wide/16 v18, 0x3e8

    .line 347
    .line 348
    div-long v8, v8, v18

    .line 349
    .line 350
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    const-string v6, "dateFrom"

    .line 355
    .line 356
    invoke-virtual {v7, v6, v4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    div-long v12, v12, v18

    .line 360
    .line 361
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    const-string v6, "dateTo"

    .line 366
    .line 367
    invoke-virtual {v7, v6, v4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    :cond_7
    iget v4, v5, La/lnf0;->b:I

    .line 371
    .line 372
    invoke-static {v4, v7}, La/qbt;->g(ILjava/util/Map;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v7}, La/qbt;->h(Ljava/util/Map;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v7, v2}, La/qbt;->i(La/jo20;Z)V

    .line 379
    .line 380
    .line 381
    iget-object v2, v5, La/lnf0;->a:Ljava/lang/String;

    .line 382
    .line 383
    invoke-static {v2, v7}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v7, v1}, La/qbt;->e(La/jo20;La/ygq0;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v7}, La/qbt;->l(Ljava/util/Map;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v7, v15, v10, v11}, La/qbt;->m(La/jo20;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;J)V

    .line 393
    .line 394
    .line 395
    iget-boolean v1, v0, La/c3c0;->b:Z

    .line 396
    .line 397
    iget-wide v4, v0, La/c3c0;->c:J

    .line 398
    .line 399
    invoke-static {v7, v1, v4, v5}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 400
    .line 401
    .line 402
    invoke-static {v7}, La/qbt;->p(Ljava/util/Map;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7}, La/jo20;->b()La/jo20;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    iget-object v1, v3, La/phf0;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v1, La/c5k;

    .line 412
    .line 413
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-eqz v2, :cond_9

    .line 418
    .line 419
    const/4 v4, 0x1

    .line 420
    if-ne v2, v4, :cond_8

    .line 421
    .line 422
    iget-object v1, v1, La/c5k;->a:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v1, La/or30;

    .line 425
    .line 426
    :goto_3
    move-object v4, v1

    .line 427
    goto :goto_4

    .line 428
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 429
    .line 430
    .line 431
    return-object v16

    .line 432
    :cond_9
    iget-object v1, v1, La/c5k;->b:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v1, La/or30;

    .line 435
    .line 436
    goto :goto_3

    .line 437
    :goto_4
    invoke-static {v14}, La/kpb;->v(La/sip;)J

    .line 438
    .line 439
    .line 440
    move-result-wide v5

    .line 441
    new-instance v8, La/bm4;

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const/16 v18, 0x3

    .line 446
    .line 447
    move-object/from16 v16, v0

    .line 448
    .line 449
    move-object v13, v3

    .line 450
    move-object v12, v8

    .line 451
    invoke-direct/range {v12 .. v18}, La/bm4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 452
    .line 453
    .line 454
    const/16 v9, 0xfc

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    invoke-static/range {v4 .. v9}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    return-object v0

    .line 462
    :cond_a
    move-object/from16 v16, v5

    .line 463
    .line 464
    invoke-static {}, La/t9f;->b()V

    .line 465
    .line 466
    .line 467
    return-object v16
.end method
