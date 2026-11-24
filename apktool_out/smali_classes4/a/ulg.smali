.class public final La/ulg;
.super La/x2t0;
.source "SourceFile"

# interfaces
.implements La/alg;


# static fields
.field public static final synthetic s:I


# instance fields
.field public final h:La/hzg;

.field public final i:La/pru;

.field public final j:La/ih5;

.field public final k:La/zr1;

.field public final l:La/zg;

.field public final m:La/gg5;

.field public final n:La/oeg0;

.field public final o:La/ivn;

.field public final p:La/fvt0;

.field public final q:La/nv20;

.field public final r:La/ctf0;


# direct methods
.method public constructor <init>(La/hzg;La/pru;La/luu;La/ih5;La/zr1;La/zg;La/gg5;La/oeg0;La/ivn;La/fvt0;La/nv20;La/ctf0;)V
    .locals 2

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/rlg;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p3, v1}, La/rlg;-><init>(La/luu;B)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ulg;->h:La/hzg;

    .line 17
    .line 18
    iput-object p2, p0, La/ulg;->i:La/pru;

    .line 19
    .line 20
    iput-object p4, p0, La/ulg;->j:La/ih5;

    .line 21
    .line 22
    iput-object p5, p0, La/ulg;->k:La/zr1;

    .line 23
    .line 24
    iput-object p6, p0, La/ulg;->l:La/zg;

    .line 25
    .line 26
    iput-object p7, p0, La/ulg;->m:La/gg5;

    .line 27
    .line 28
    iput-object p8, p0, La/ulg;->n:La/oeg0;

    .line 29
    .line 30
    iput-object p9, p0, La/ulg;->o:La/ivn;

    .line 31
    .line 32
    iput-object p10, p0, La/ulg;->p:La/fvt0;

    .line 33
    .line 34
    iput-object p11, p0, La/ulg;->q:La/nv20;

    .line 35
    .line 36
    iput-object p12, p0, La/ulg;->r:La/ctf0;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/qlg;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/ulg;->i(La/qlg;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(La/qlg;La/zje;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/slg;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/slg;

    .line 13
    .line 14
    iget v4, v3, La/slg;->l:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/slg;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/slg;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/slg;-><init>(La/ulg;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/slg;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/slg;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v7, :cond_1

    .line 42
    .line 43
    iget-object v1, v3, La/slg;->i:La/qlg;

    .line 44
    .line 45
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, v3, La/slg;->i:La/qlg;

    .line 59
    .line 60
    iput v7, v3, La/slg;->l:I

    .line 61
    .line 62
    invoke-static {v0, v1, v3}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-ne v2, v4, :cond_3

    .line 67
    .line 68
    return-object v4

    .line 69
    :cond_3
    :goto_1
    instance-of v2, v1, La/blg;

    .line 70
    .line 71
    iget-object v3, v0, La/x2t0;->b:La/ocj;

    .line 72
    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 79
    .line 80
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v3, v0

    .line 85
    check-cast v3, La/wlg;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-object v4, v1

    .line 91
    check-cast v4, La/blg;

    .line 92
    .line 93
    iget-object v5, v4, La/blg;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 94
    .line 95
    iget-object v7, v4, La/blg;->a:La/lr2;

    .line 96
    .line 97
    const/16 v8, 0x16

    .line 98
    .line 99
    move-object v4, v5

    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-static/range {v3 .. v8}, La/wlg;->a(La/wlg;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;Ljava/util/List;Ljava/util/List;La/lr2;I)La/wlg;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_5
    instance-of v2, v1, La/clg;

    .line 115
    .line 116
    if-eqz v2, :cond_7

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 122
    .line 123
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object v3, v0

    .line 128
    check-cast v3, La/wlg;

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-object v4, v1

    .line 134
    check-cast v4, La/clg;

    .line 135
    .line 136
    iget-object v6, v4, La/clg;->a:Ljava/util/List;

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/16 v8, 0x1b

    .line 140
    .line 141
    const/4 v4, 0x0

    .line 142
    const/4 v5, 0x0

    .line 143
    invoke-static/range {v3 .. v8}, La/wlg;->a(La/wlg;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;Ljava/util/List;Ljava/util/List;La/lr2;I)La/wlg;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :cond_7
    instance-of v2, v1, La/dlg;

    .line 156
    .line 157
    if-eqz v2, :cond_9

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v2, v3, La/ocj;->a:La/p7m0;

    .line 163
    .line 164
    :cond_8
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move-object v3, v0

    .line 169
    check-cast v3, La/wlg;

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-object v4, v1

    .line 175
    check-cast v4, La/dlg;

    .line 176
    .line 177
    iget-object v5, v4, La/dlg;->a:Ljava/util/List;

    .line 178
    .line 179
    const/4 v7, 0x0

    .line 180
    const/16 v8, 0x1d

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v6, 0x0

    .line 184
    invoke-static/range {v3 .. v8}, La/wlg;->a(La/wlg;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;Ljava/util/List;Ljava/util/List;La/lr2;I)La/wlg;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_8

    .line 193
    .line 194
    goto/16 :goto_3

    .line 195
    .line 196
    :cond_9
    instance-of v2, v1, La/jlg;

    .line 197
    .line 198
    iget-object v3, v0, La/ulg;->h:La/hzg;

    .line 199
    .line 200
    if-eqz v2, :cond_11

    .line 201
    .line 202
    check-cast v1, La/jlg;

    .line 203
    .line 204
    iget-wide v1, v1, La/jlg;->a:J

    .line 205
    .line 206
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, La/wlg;

    .line 211
    .line 212
    iget-object v4, v4, La/wlg;->c:Ljava/util/List;

    .line 213
    .line 214
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_b

    .line 223
    .line 224
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    move-object v8, v5

    .line 229
    check-cast v8, La/xah;

    .line 230
    .line 231
    iget-wide v8, v8, La/xah;->g:J

    .line 232
    .line 233
    cmp-long v8, v8, v1

    .line 234
    .line 235
    if-nez v8, :cond_a

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_b
    move-object v5, v6

    .line 239
    :goto_2
    check-cast v5, La/xah;

    .line 240
    .line 241
    if-nez v5, :cond_c

    .line 242
    .line 243
    goto/16 :goto_3

    .line 244
    .line 245
    :cond_c
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, La/wlg;

    .line 250
    .line 251
    iget-object v1, v1, La/wlg;->e:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_e

    .line 262
    .line 263
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    move-object v4, v2

    .line 268
    check-cast v4, La/lok0;

    .line 269
    .line 270
    iget v8, v4, La/lok0;->a:I

    .line 271
    .line 272
    iget v9, v5, La/xah;->h:I

    .line 273
    .line 274
    if-ne v8, v9, :cond_d

    .line 275
    .line 276
    iget-object v4, v4, La/lok0;->t:Ljava/util/List;

    .line 277
    .line 278
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-interface {v4, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-eqz v4, :cond_d

    .line 287
    .line 288
    move-object v6, v2

    .line 289
    :cond_e
    check-cast v6, La/lok0;

    .line 290
    .line 291
    iget-object v1, v0, La/ulg;->i:La/pru;

    .line 292
    .line 293
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    iget-object v1, v1, La/sff0;->c:La/ech;

    .line 298
    .line 299
    iget-object v1, v1, La/ech;->p:Ljava/util/List;

    .line 300
    .line 301
    iget-wide v7, v5, La/xah;->g:J

    .line 302
    .line 303
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_f

    .line 312
    .line 313
    check-cast v3, La/uzg;

    .line 314
    .line 315
    invoke-virtual {v3}, La/uzg;->g()V

    .line 316
    .line 317
    .line 318
    goto/16 :goto_3

    .line 319
    .line 320
    :cond_f
    if-eqz v6, :cond_10

    .line 321
    .line 322
    iget v1, v6, La/lok0;->a:I

    .line 323
    .line 324
    int-to-long v8, v1

    .line 325
    iget-wide v10, v6, La/lok0;->f:J

    .line 326
    .line 327
    iget-wide v13, v6, La/lok0;->g:J

    .line 328
    .line 329
    iget-boolean v15, v5, La/xah;->n:Z

    .line 330
    .line 331
    iget-object v7, v0, La/ulg;->j:La/ih5;

    .line 332
    .line 333
    move-wide v11, v10

    .line 334
    sget-object v10, La/r1g;->e:La/r1g;

    .line 335
    .line 336
    invoke-virtual/range {v7 .. v15}, La/ih5;->k(JLa/r1g;JJZ)V

    .line 337
    .line 338
    .line 339
    iget-object v7, v0, La/ulg;->k:La/zr1;

    .line 340
    .line 341
    move-wide v10, v11

    .line 342
    move-wide v12, v13

    .line 343
    const-string v14, "popular_top"

    .line 344
    .line 345
    invoke-virtual/range {v7 .. v15}, La/zr1;->l(JJJLjava/lang/String;Z)V

    .line 346
    .line 347
    .line 348
    iget-object v0, v6, La/lok0;->b:Ljava/lang/String;

    .line 349
    .line 350
    check-cast v3, La/uzg;

    .line 351
    .line 352
    invoke-virtual {v3, v8, v9, v0}, La/uzg;->o(JLjava/lang/String;)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_3

    .line 356
    .line 357
    :cond_10
    iget-wide v11, v5, La/xah;->g:J

    .line 358
    .line 359
    iget-wide v13, v5, La/xah;->i:J

    .line 360
    .line 361
    iget-wide v1, v5, La/xah;->k:J

    .line 362
    .line 363
    iget-boolean v4, v5, La/xah;->n:Z

    .line 364
    .line 365
    iget-object v10, v0, La/ulg;->j:La/ih5;

    .line 366
    .line 367
    move-wide v14, v13

    .line 368
    sget-object v13, La/r1g;->e:La/r1g;

    .line 369
    .line 370
    move-wide/from16 v16, v1

    .line 371
    .line 372
    move/from16 v18, v4

    .line 373
    .line 374
    invoke-virtual/range {v10 .. v18}, La/ih5;->k(JLa/r1g;JJZ)V

    .line 375
    .line 376
    .line 377
    iget-object v10, v0, La/ulg;->k:La/zr1;

    .line 378
    .line 379
    move-wide v13, v14

    .line 380
    move-wide/from16 v15, v16

    .line 381
    .line 382
    const-string v17, "popular_top"

    .line 383
    .line 384
    invoke-virtual/range {v10 .. v18}, La/zr1;->l(JJJLjava/lang/String;Z)V

    .line 385
    .line 386
    .line 387
    iget-wide v0, v5, La/xah;->k:J

    .line 388
    .line 389
    iget-wide v6, v5, La/xah;->g:J

    .line 390
    .line 391
    iget-object v2, v5, La/xah;->f:Ljava/lang/String;

    .line 392
    .line 393
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 394
    .line 395
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 396
    .line 397
    sget-object v5, La/k1g;->b:La/k1g;

    .line 398
    .line 399
    move-object/from16 v19, v3

    .line 400
    .line 401
    check-cast v19, La/uzg;

    .line 402
    .line 403
    move-wide/from16 v21, v0

    .line 404
    .line 405
    move-object/from16 v20, v2

    .line 406
    .line 407
    move/from16 v25, v4

    .line 408
    .line 409
    move-wide/from16 v23, v6

    .line 410
    .line 411
    invoke-virtual/range {v19 .. v25}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_3

    .line 415
    .line 416
    :cond_11
    instance-of v2, v1, La/llg;

    .line 417
    .line 418
    if-eqz v2, :cond_15

    .line 419
    .line 420
    check-cast v1, La/llg;

    .line 421
    .line 422
    iget-wide v1, v1, La/llg;->a:J

    .line 423
    .line 424
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    check-cast v3, La/wlg;

    .line 429
    .line 430
    iget-object v3, v3, La/wlg;->c:Ljava/util/List;

    .line 431
    .line 432
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    :cond_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-eqz v4, :cond_13

    .line 441
    .line 442
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    move-object v5, v4

    .line 447
    check-cast v5, La/xah;

    .line 448
    .line 449
    iget-wide v7, v5, La/xah;->g:J

    .line 450
    .line 451
    cmp-long v5, v7, v1

    .line 452
    .line 453
    if-nez v5, :cond_12

    .line 454
    .line 455
    move-object v6, v4

    .line 456
    :cond_13
    check-cast v6, La/xah;

    .line 457
    .line 458
    if-nez v6, :cond_14

    .line 459
    .line 460
    goto/16 :goto_3

    .line 461
    .line 462
    :cond_14
    iget-wide v8, v6, La/xah;->i:J

    .line 463
    .line 464
    iget-wide v10, v6, La/xah;->k:J

    .line 465
    .line 466
    iget-wide v12, v6, La/xah;->g:J

    .line 467
    .line 468
    sget-object v14, La/r1g;->f:La/r1g;

    .line 469
    .line 470
    iget-boolean v15, v6, La/xah;->n:Z

    .line 471
    .line 472
    iget-boolean v1, v6, La/xah;->m:Z

    .line 473
    .line 474
    iget-object v7, v0, La/ulg;->j:La/ih5;

    .line 475
    .line 476
    move/from16 v16, v1

    .line 477
    .line 478
    invoke-virtual/range {v7 .. v16}, La/ih5;->b(JJJLa/r1g;ZZ)V

    .line 479
    .line 480
    .line 481
    iget-wide v1, v6, La/xah;->i:J

    .line 482
    .line 483
    iget-wide v3, v6, La/xah;->k:J

    .line 484
    .line 485
    iget-wide v7, v6, La/xah;->g:J

    .line 486
    .line 487
    iget-boolean v5, v6, La/xah;->n:Z

    .line 488
    .line 489
    iget-boolean v9, v6, La/xah;->m:Z

    .line 490
    .line 491
    iget-object v10, v0, La/ulg;->k:La/zr1;

    .line 492
    .line 493
    const-string v23, "popular_new_top"

    .line 494
    .line 495
    move-wide/from16 v17, v1

    .line 496
    .line 497
    move-wide/from16 v19, v3

    .line 498
    .line 499
    move/from16 v24, v5

    .line 500
    .line 501
    move-wide/from16 v21, v7

    .line 502
    .line 503
    move/from16 v25, v9

    .line 504
    .line 505
    move-object/from16 v16, v10

    .line 506
    .line 507
    invoke-virtual/range {v16 .. v25}, La/zr1;->d(JJJLjava/lang/String;ZZ)V

    .line 508
    .line 509
    .line 510
    iget-object v1, v0, La/ulg;->n:La/oeg0;

    .line 511
    .line 512
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    new-instance v2, La/v4f;

    .line 517
    .line 518
    const/16 v3, 0x15

    .line 519
    .line 520
    invoke-direct {v2, v0, v6, v3}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 524
    .line 525
    .line 526
    goto/16 :goto_3

    .line 527
    .line 528
    :cond_15
    instance-of v2, v1, La/klg;

    .line 529
    .line 530
    if-eqz v2, :cond_19

    .line 531
    .line 532
    check-cast v1, La/klg;

    .line 533
    .line 534
    iget-wide v1, v1, La/klg;->a:J

    .line 535
    .line 536
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    check-cast v4, La/wlg;

    .line 541
    .line 542
    iget-object v4, v4, La/wlg;->c:Ljava/util/List;

    .line 543
    .line 544
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    :cond_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 549
    .line 550
    .line 551
    move-result v5

    .line 552
    if-eqz v5, :cond_17

    .line 553
    .line 554
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    move-object v7, v5

    .line 559
    check-cast v7, La/xah;

    .line 560
    .line 561
    iget-wide v7, v7, La/xah;->g:J

    .line 562
    .line 563
    cmp-long v7, v7, v1

    .line 564
    .line 565
    if-nez v7, :cond_16

    .line 566
    .line 567
    move-object v6, v5

    .line 568
    :cond_17
    check-cast v6, La/xah;

    .line 569
    .line 570
    if-nez v6, :cond_18

    .line 571
    .line 572
    goto/16 :goto_3

    .line 573
    .line 574
    :cond_18
    iget-wide v8, v6, La/xah;->i:J

    .line 575
    .line 576
    iget-wide v10, v6, La/xah;->k:J

    .line 577
    .line 578
    sget-object v12, La/r1g;->f:La/r1g;

    .line 579
    .line 580
    iget-wide v1, v6, La/xah;->g:J

    .line 581
    .line 582
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 583
    .line 584
    .line 585
    move-result-object v13

    .line 586
    iget-boolean v4, v6, La/xah;->n:Z

    .line 587
    .line 588
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 589
    .line 590
    .line 591
    move-result-object v14

    .line 592
    iget-object v7, v0, La/ulg;->j:La/ih5;

    .line 593
    .line 594
    invoke-virtual/range {v7 .. v14}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 595
    .line 596
    .line 597
    iget-wide v7, v6, La/xah;->i:J

    .line 598
    .line 599
    iget-wide v9, v6, La/xah;->k:J

    .line 600
    .line 601
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 602
    .line 603
    .line 604
    move-result-object v21

    .line 605
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 606
    .line 607
    .line 608
    move-result-object v22

    .line 609
    iget-object v15, v0, La/ulg;->k:La/zr1;

    .line 610
    .line 611
    const-string v20, "popular_new_top"

    .line 612
    .line 613
    move-wide/from16 v16, v7

    .line 614
    .line 615
    move-wide/from16 v18, v9

    .line 616
    .line 617
    invoke-virtual/range {v15 .. v22}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 618
    .line 619
    .line 620
    iget-wide v0, v6, La/xah;->k:J

    .line 621
    .line 622
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 623
    .line 624
    sget-object v4, La/k1g;->b:La/k1g;

    .line 625
    .line 626
    check-cast v3, La/uzg;

    .line 627
    .line 628
    invoke-virtual {v3, v0, v1, v2, v4}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 629
    .line 630
    .line 631
    goto/16 :goto_3

    .line 632
    .line 633
    :cond_19
    instance-of v2, v1, La/mlg;

    .line 634
    .line 635
    if-eqz v2, :cond_1d

    .line 636
    .line 637
    check-cast v1, La/mlg;

    .line 638
    .line 639
    iget v1, v1, La/mlg;->a:I

    .line 640
    .line 641
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    check-cast v2, La/wlg;

    .line 646
    .line 647
    iget-object v2, v2, La/wlg;->b:Ljava/util/List;

    .line 648
    .line 649
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    :cond_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 654
    .line 655
    .line 656
    move-result v4

    .line 657
    if-eqz v4, :cond_1b

    .line 658
    .line 659
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    move-object v5, v4

    .line 664
    check-cast v5, La/ypl0;

    .line 665
    .line 666
    iget-wide v7, v5, La/ypl0;->a:J

    .line 667
    .line 668
    int-to-long v9, v1

    .line 669
    cmp-long v5, v7, v9

    .line 670
    .line 671
    if-nez v5, :cond_1a

    .line 672
    .line 673
    move-object v6, v4

    .line 674
    :cond_1b
    check-cast v6, La/ypl0;

    .line 675
    .line 676
    if-nez v6, :cond_1c

    .line 677
    .line 678
    goto/16 :goto_3

    .line 679
    .line 680
    :cond_1c
    iget-wide v1, v6, La/ypl0;->a:J

    .line 681
    .line 682
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 683
    .line 684
    invoke-static {v1, v2, v4}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v6, Ljava/lang/Number;

    .line 691
    .line 692
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 693
    .line 694
    .line 695
    move-result-wide v8

    .line 696
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v5, Ljava/lang/Number;

    .line 699
    .line 700
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 701
    .line 702
    .line 703
    move-result-wide v10

    .line 704
    sget-object v12, La/r1g;->f:La/r1g;

    .line 705
    .line 706
    const/4 v13, 0x0

    .line 707
    const/4 v14, 0x0

    .line 708
    iget-object v7, v0, La/ulg;->j:La/ih5;

    .line 709
    .line 710
    invoke-virtual/range {v7 .. v14}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 711
    .line 712
    .line 713
    iget-object v7, v0, La/ulg;->k:La/zr1;

    .line 714
    .line 715
    const-string v12, "popular_new_top"

    .line 716
    .line 717
    invoke-virtual/range {v7 .. v14}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 718
    .line 719
    .line 720
    sget-object v0, La/k1g;->b:La/k1g;

    .line 721
    .line 722
    check-cast v3, La/uzg;

    .line 723
    .line 724
    invoke-virtual {v3, v1, v2, v4, v0}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 725
    .line 726
    .line 727
    goto/16 :goto_3

    .line 728
    .line 729
    :cond_1d
    sget-object v2, La/ilg;->a:La/ilg;

    .line 730
    .line 731
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    iget-object v4, v0, La/ulg;->m:La/gg5;

    .line 736
    .line 737
    const-string v5, "option"

    .line 738
    .line 739
    const-string v8, "popular_top_all_click"

    .line 740
    .line 741
    iget-object v0, v0, La/ulg;->l:La/zg;

    .line 742
    .line 743
    if-eqz v2, :cond_1e

    .line 744
    .line 745
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 746
    .line 747
    const-string v1, "cybersport_popular_live"

    .line 748
    .line 749
    invoke-static {v5, v1, v0, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    sget-object v0, La/y1p;->q:La/y1p;

    .line 753
    .line 754
    invoke-virtual {v4, v0}, La/gg5;->t(La/y1p;)V

    .line 755
    .line 756
    .line 757
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 758
    .line 759
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 760
    .line 761
    check-cast v3, La/uzg;

    .line 762
    .line 763
    iget-object v1, v3, La/uzg;->a:La/oeg0;

    .line 764
    .line 765
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    new-instance v2, La/izg;

    .line 770
    .line 771
    invoke-direct {v2, v3, v0, v7}, La/izg;-><init>(La/uzg;IZ)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 775
    .line 776
    .line 777
    goto/16 :goto_3

    .line 778
    .line 779
    :cond_1e
    sget-object v2, La/glg;->a:La/glg;

    .line 780
    .line 781
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    const/4 v9, 0x0

    .line 786
    if-eqz v2, :cond_1f

    .line 787
    .line 788
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 789
    .line 790
    const-string v1, "cybersport_popular_line"

    .line 791
    .line 792
    invoke-static {v5, v1, v0, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    sget-object v0, La/y1p;->r:La/y1p;

    .line 796
    .line 797
    invoke-virtual {v4, v0}, La/gg5;->t(La/y1p;)V

    .line 798
    .line 799
    .line 800
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 801
    .line 802
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 803
    .line 804
    check-cast v3, La/uzg;

    .line 805
    .line 806
    iget-object v1, v3, La/uzg;->a:La/oeg0;

    .line 807
    .line 808
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    new-instance v2, La/izg;

    .line 813
    .line 814
    invoke-direct {v2, v3, v0, v9}, La/izg;-><init>(La/uzg;IZ)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 818
    .line 819
    .line 820
    goto/16 :goto_3

    .line 821
    .line 822
    :cond_1f
    sget-object v2, La/hlg;->a:La/hlg;

    .line 823
    .line 824
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    move-result v2

    .line 828
    if-eqz v2, :cond_20

    .line 829
    .line 830
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 831
    .line 832
    const-string v1, "cybersport_tournaments_live"

    .line 833
    .line 834
    invoke-static {v5, v1, v0, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    sget-object v0, La/y1p;->s:La/y1p;

    .line 838
    .line 839
    invoke-virtual {v4, v0}, La/gg5;->t(La/y1p;)V

    .line 840
    .line 841
    .line 842
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 843
    .line 844
    iget-byte v5, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 845
    .line 846
    sget-object v8, La/iun;->a:La/iun;

    .line 847
    .line 848
    move-object v4, v3

    .line 849
    check-cast v4, La/uzg;

    .line 850
    .line 851
    const-wide/16 v6, 0x28

    .line 852
    .line 853
    const/4 v9, 0x1

    .line 854
    invoke-virtual/range {v4 .. v9}, La/uzg;->k(IJLjava/util/List;Z)V

    .line 855
    .line 856
    .line 857
    goto/16 :goto_3

    .line 858
    .line 859
    :cond_20
    sget-object v2, La/flg;->a:La/flg;

    .line 860
    .line 861
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    move-result v2

    .line 865
    if-eqz v2, :cond_21

    .line 866
    .line 867
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 868
    .line 869
    const-string v1, "cybersport_tournaments_line"

    .line 870
    .line 871
    invoke-static {v5, v1, v0, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    sget-object v0, La/y1p;->t:La/y1p;

    .line 875
    .line 876
    invoke-virtual {v4, v0}, La/gg5;->t(La/y1p;)V

    .line 877
    .line 878
    .line 879
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 880
    .line 881
    iget-byte v5, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 882
    .line 883
    sget-object v8, La/iun;->a:La/iun;

    .line 884
    .line 885
    move-object v4, v3

    .line 886
    check-cast v4, La/uzg;

    .line 887
    .line 888
    const-wide/16 v6, 0x28

    .line 889
    .line 890
    const/4 v9, 0x0

    .line 891
    invoke-virtual/range {v4 .. v9}, La/uzg;->k(IJLjava/util/List;Z)V

    .line 892
    .line 893
    .line 894
    goto :goto_3

    .line 895
    :cond_21
    sget-object v2, La/elg;->a:La/elg;

    .line 896
    .line 897
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    if-eqz v2, :cond_22

    .line 902
    .line 903
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 904
    .line 905
    const-string v1, "cybersport_disciplines"

    .line 906
    .line 907
    invoke-static {v5, v1, v0, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    sget-object v0, La/y1p;->p:La/y1p;

    .line 911
    .line 912
    invoke-virtual {v4, v0}, La/gg5;->t(La/y1p;)V

    .line 913
    .line 914
    .line 915
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 916
    .line 917
    check-cast v3, La/uzg;

    .line 918
    .line 919
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    iget-object v1, v3, La/uzg;->a:La/oeg0;

    .line 926
    .line 927
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    new-instance v2, La/v4f;

    .line 932
    .line 933
    const/16 v4, 0x18

    .line 934
    .line 935
    invoke-direct {v2, v3, v0, v4}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 939
    .line 940
    .line 941
    goto :goto_3

    .line 942
    :cond_22
    instance-of v0, v1, La/nlg;

    .line 943
    .line 944
    if-eqz v0, :cond_23

    .line 945
    .line 946
    check-cast v1, La/nlg;

    .line 947
    .line 948
    iget-wide v0, v1, La/nlg;->a:J

    .line 949
    .line 950
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 951
    .line 952
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 953
    .line 954
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    check-cast v3, La/uzg;

    .line 963
    .line 964
    invoke-virtual {v3, v2, v0, v9}, La/uzg;->d(ILjava/util/List;Z)V

    .line 965
    .line 966
    .line 967
    goto :goto_3

    .line 968
    :cond_23
    instance-of v0, v1, La/olg;

    .line 969
    .line 970
    if-eqz v0, :cond_24

    .line 971
    .line 972
    check-cast v1, La/olg;

    .line 973
    .line 974
    iget-wide v0, v1, La/olg;->a:J

    .line 975
    .line 976
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 977
    .line 978
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 979
    .line 980
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    check-cast v3, La/uzg;

    .line 989
    .line 990
    invoke-virtual {v3, v2, v0, v7}, La/uzg;->d(ILjava/util/List;Z)V

    .line 991
    .line 992
    .line 993
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 994
    .line 995
    return-object v0

    .line 996
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 997
    .line 998
    .line 999
    return-object v6
.end method

.method public final j(La/xah;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/tlg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/tlg;

    .line 7
    .line 8
    iget v1, v0, La/tlg;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/tlg;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/tlg;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/tlg;-><init>(La/ulg;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, La/tlg;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/tlg;->k:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v3, :cond_1

    .line 38
    .line 39
    if-ne v1, v2, :cond_2

    .line 40
    .line 41
    :cond_1
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_5

    .line 49
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iget-wide v4, p1, La/xah;->g:J

    .line 60
    .line 61
    move p2, v2

    .line 62
    move v1, v3

    .line 63
    iget-wide v2, p1, La/xah;->i:J

    .line 64
    .line 65
    iget-wide v7, p1, La/xah;->k:J

    .line 66
    .line 67
    new-instance v9, Ljava/lang/Long;

    .line 68
    .line 69
    invoke-direct {v9, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 70
    .line 71
    .line 72
    move-wide v7, v4

    .line 73
    iget-boolean v4, p1, La/xah;->n:Z

    .line 74
    .line 75
    iget-boolean p1, p1, La/xah;->m:Z

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    iget-object p1, p0, La/ulg;->q:La/nv20;

    .line 80
    .line 81
    iput v1, v6, La/tlg;->k:I

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance p2, La/qgb;

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    invoke-direct {p2, v7, v8, v1, v2}, La/qgb;-><init>(JJ)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p1, La/nv20;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, La/khf0;

    .line 98
    .line 99
    invoke-virtual {p1, p2, v6}, La/khf0;->D(La/sgb;La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v0, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    :goto_2
    if-ne p1, v0, :cond_7

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    iget-object p1, p0, La/ulg;->p:La/fvt0;

    .line 112
    .line 113
    iput p2, v6, La/tlg;->k:I

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v5, La/qgb;

    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v9

    .line 124
    invoke-direct {v5, v7, v8, v9, v10}, La/qgb;-><init>(JJ)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p1, La/fvt0;->a:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v1, p1

    .line 130
    check-cast v1, La/nr;

    .line 131
    .line 132
    invoke-virtual/range {v1 .. v6}, La/nr;->u(JZLa/sgb;La/zje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v0, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    .line 141
    :goto_3
    if-ne p1, v0, :cond_7

    .line 142
    .line 143
    :goto_4
    return-object v0

    .line 144
    :goto_5
    new-instance p2, La/hfg;

    .line 145
    .line 146
    const/4 v0, 0x7

    .line 147
    invoke-direct {p2, p0, v0}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    iget-object p0, p0, La/ulg;->o:La/ivn;

    .line 151
    .line 152
    invoke-virtual {p0, p1, p2}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 153
    .line 154
    .line 155
    :cond_7
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0
.end method
