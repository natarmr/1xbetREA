.class public final La/fdw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/Map;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/util/List;

.field public m:La/xzp;

.field public n:La/sgs;

.field public o:Ljava/util/Iterator;

.field public p:B

.field public final synthetic q:La/xzp;

.field public final synthetic r:La/sgs;

.field public final synthetic s:La/zos;

.field public final synthetic t:La/jo20;

.field public final synthetic u:Z

.field public final synthetic v:Z

.field public final synthetic w:Z


# direct methods
.method public constructor <init>(La/xzp;La/sgs;La/zos;La/jo20;ZZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fdw;->q:La/xzp;

    .line 2
    .line 3
    iput-object p2, p0, La/fdw;->r:La/sgs;

    .line 4
    .line 5
    iput-object p3, p0, La/fdw;->s:La/zos;

    .line 6
    .line 7
    iput-object p4, p0, La/fdw;->t:La/jo20;

    .line 8
    .line 9
    iput-boolean p5, p0, La/fdw;->u:Z

    .line 10
    .line 11
    iput-boolean p6, p0, La/fdw;->v:Z

    .line 12
    .line 13
    iput-boolean p7, p0, La/fdw;->w:Z

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/fdw;

    .line 2
    .line 3
    iget-boolean v6, p0, La/fdw;->v:Z

    .line 4
    .line 5
    iget-boolean v7, p0, La/fdw;->w:Z

    .line 6
    .line 7
    iget-object v1, p0, La/fdw;->q:La/xzp;

    .line 8
    .line 9
    iget-object v2, p0, La/fdw;->r:La/sgs;

    .line 10
    .line 11
    iget-object v3, p0, La/fdw;->s:La/zos;

    .line 12
    .line 13
    iget-object v4, p0, La/fdw;->t:La/jo20;

    .line 14
    .line 15
    iget-boolean v5, p0, La/fdw;->u:Z

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/fdw;-><init>(La/xzp;La/sgs;La/zos;La/jo20;ZZZLa/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/fdw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/fdw;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/fdw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, La/fdw;->q:La/xzp;

    .line 4
    .line 5
    iget-object v1, v0, La/xzp;->c:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v9, v1

    .line 8
    check-cast v9, La/n530;

    .line 9
    .line 10
    sget-object v10, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-byte v1, v8, La/fdw;->p:B

    .line 13
    .line 14
    const-wide/16 v11, -0x1a

    .line 15
    .line 16
    const/4 v13, 0x5

    .line 17
    const/4 v14, 0x4

    .line 18
    const/4 v2, 0x3

    .line 19
    const/4 v3, 0x2

    .line 20
    const/4 v4, 0x1

    .line 21
    iget-object v5, v8, La/fdw;->r:La/sgs;

    .line 22
    .line 23
    const/4 v15, 0x0

    .line 24
    if-eqz v1, :cond_5

    .line 25
    .line 26
    if-eq v1, v4, :cond_4

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    if-eq v1, v2, :cond_2

    .line 31
    .line 32
    if-eq v1, v14, :cond_1

    .line 33
    .line 34
    if-ne v1, v13, :cond_0

    .line 35
    .line 36
    iget-object v0, v8, La/fdw;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/Set;

    .line 39
    .line 40
    iget-object v0, v8, La/fdw;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, La/m9s;

    .line 43
    .line 44
    iget-object v1, v8, La/fdw;->i:Ljava/util/Map;

    .line 45
    .line 46
    check-cast v1, Ljava/util/Map;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v15

    .line 59
    :cond_1
    iget-object v0, v8, La/fdw;->o:Ljava/util/Iterator;

    .line 60
    .line 61
    iget-object v1, v8, La/fdw;->n:La/sgs;

    .line 62
    .line 63
    iget-object v2, v8, La/fdw;->m:La/xzp;

    .line 64
    .line 65
    iget-object v3, v8, La/fdw;->k:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/util/Set;

    .line 68
    .line 69
    iget-object v4, v8, La/fdw;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, La/m9s;

    .line 72
    .line 73
    iget-object v5, v8, La/fdw;->i:Ljava/util/Map;

    .line 74
    .line 75
    check-cast v5, Ljava/util/Map;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object v11, v0

    .line 81
    move-object v0, v2

    .line 82
    move-object v12, v4

    .line 83
    move/from16 v18, v14

    .line 84
    .line 85
    move-object v2, v1

    .line 86
    move-object v1, v3

    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_2
    iget-object v1, v8, La/fdw;->l:Ljava/util/List;

    .line 90
    .line 91
    iget-object v2, v8, La/fdw;->k:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, Ljava/util/Map;

    .line 94
    .line 95
    iget-object v3, v8, La/fdw;->j:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, La/f5h;

    .line 98
    .line 99
    iget-object v4, v8, La/fdw;->i:Ljava/util/Map;

    .line 100
    .line 101
    check-cast v4, Ljava/util/Map;

    .line 102
    .line 103
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object/from16 v18, v1

    .line 107
    .line 108
    move-object/from16 v17, v2

    .line 109
    .line 110
    move-object/from16 v16, v3

    .line 111
    .line 112
    move-object/from16 v2, p1

    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :cond_3
    iget-object v1, v8, La/fdw;->k:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Ljava/util/Map;

    .line 119
    .line 120
    iget-object v3, v8, La/fdw;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, La/f5h;

    .line 123
    .line 124
    iget-object v4, v8, La/fdw;->i:Ljava/util/Map;

    .line 125
    .line 126
    check-cast v4, Ljava/util/Map;

    .line 127
    .line 128
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move-object v4, v3

    .line 132
    move-object/from16 v3, p1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    iget-object v1, v8, La/fdw;->i:Ljava/util/Map;

    .line 136
    .line 137
    check-cast v1, Ljava/util/Map;

    .line 138
    .line 139
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    move-object/from16 v4, p1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iget-wide v6, v5, La/sgs;->f:J

    .line 149
    .line 150
    invoke-virtual {v9, v6, v7, v11, v12}, La/n530;->c(JJ)Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-object v6, v0, La/xzp;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v6, La/hnu;

    .line 157
    .line 158
    iget-object v7, v8, La/fdw;->s:La/zos;

    .line 159
    .line 160
    iget-object v7, v7, La/zos;->b:La/sip;

    .line 161
    .line 162
    move-object v11, v1

    .line 163
    check-cast v11, Ljava/util/Map;

    .line 164
    .line 165
    iput-object v11, v8, La/fdw;->i:Ljava/util/Map;

    .line 166
    .line 167
    iput-byte v4, v8, La/fdw;->p:B

    .line 168
    .line 169
    iget-object v4, v8, La/fdw;->t:La/jo20;

    .line 170
    .line 171
    invoke-virtual {v6, v7, v4, v8}, La/hnu;->a(La/sip;La/jo20;La/zje;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-ne v4, v10, :cond_6

    .line 176
    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :cond_6
    :goto_0
    check-cast v4, La/f5h;

    .line 180
    .line 181
    iget-object v6, v0, La/xzp;->e:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v6, La/eio;

    .line 184
    .line 185
    iput-object v15, v8, La/fdw;->i:Ljava/util/Map;

    .line 186
    .line 187
    iput-object v4, v8, La/fdw;->j:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v1, v8, La/fdw;->k:Ljava/lang/Object;

    .line 190
    .line 191
    iput-byte v3, v8, La/fdw;->p:B

    .line 192
    .line 193
    invoke-virtual {v6, v8}, La/eio;->b(La/bnn0;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    if-ne v3, v10, :cond_7

    .line 198
    .line 199
    goto/16 :goto_5

    .line 200
    .line 201
    :cond_7
    :goto_1
    check-cast v3, Ljava/util/List;

    .line 202
    .line 203
    iget-object v6, v0, La/xzp;->f:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v6, La/he1;

    .line 206
    .line 207
    iput-object v15, v8, La/fdw;->i:Ljava/util/Map;

    .line 208
    .line 209
    iput-object v4, v8, La/fdw;->j:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v1, v8, La/fdw;->k:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v3, v8, La/fdw;->l:Ljava/util/List;

    .line 214
    .line 215
    iput-byte v2, v8, La/fdw;->p:B

    .line 216
    .line 217
    invoke-virtual {v6, v8}, La/he1;->b(La/bnn0;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-ne v2, v10, :cond_8

    .line 222
    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :cond_8
    move-object/from16 v17, v1

    .line 226
    .line 227
    move-object/from16 v18, v3

    .line 228
    .line 229
    move-object/from16 v16, v4

    .line 230
    .line 231
    :goto_2
    move-object/from16 v19, v2

    .line 232
    .line 233
    check-cast v19, Ljava/util/List;

    .line 234
    .line 235
    iget-boolean v1, v5, La/sgs;->d:Z

    .line 236
    .line 237
    iget-object v2, v0, La/xzp;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v2, La/us3;

    .line 240
    .line 241
    invoke-virtual {v2}, La/us3;->a()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v21

    .line 245
    iget-object v2, v0, La/xzp;->g:Ljava/lang/Object;

    .line 246
    .line 247
    move-object/from16 v23, v2

    .line 248
    .line 249
    check-cast v23, La/vby;

    .line 250
    .line 251
    iget-object v2, v0, La/xzp;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v2, La/knf0;

    .line 254
    .line 255
    invoke-virtual {v2}, La/knf0;->e()Z

    .line 256
    .line 257
    .line 258
    move-result v24

    .line 259
    iget-boolean v2, v8, La/fdw;->v:Z

    .line 260
    .line 261
    iget-boolean v3, v8, La/fdw;->w:Z

    .line 262
    .line 263
    iget-boolean v4, v8, La/fdw;->u:Z

    .line 264
    .line 265
    move/from16 v20, v1

    .line 266
    .line 267
    move/from16 v25, v2

    .line 268
    .line 269
    move/from16 v26, v3

    .line 270
    .line 271
    move/from16 v22, v4

    .line 272
    .line 273
    invoke-static/range {v16 .. v26}, La/gkb;->e0(La/f5h;Ljava/util/Map;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLa/vby;ZZZ)La/m9s;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 278
    .line 279
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 280
    .line 281
    .line 282
    iget-object v3, v1, La/m9s;->H:Ljava/util/List;

    .line 283
    .line 284
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    move-object v12, v1

    .line 289
    move-object v1, v2

    .line 290
    move-object v11, v3

    .line 291
    move-object v2, v5

    .line 292
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_a

    .line 297
    .line 298
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    check-cast v3, La/xum0;

    .line 303
    .line 304
    iget-wide v4, v3, La/xum0;->b:J

    .line 305
    .line 306
    new-instance v6, Ljava/lang/Long;

    .line 307
    .line 308
    invoke-direct {v6, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    iget-object v4, v0, La/xzp;->c:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v4, La/n530;

    .line 317
    .line 318
    iget-wide v5, v2, La/sgs;->f:J

    .line 319
    .line 320
    iget-wide v13, v3, La/xum0;->b:J

    .line 321
    .line 322
    iget-object v3, v3, La/xum0;->f:Ljava/util/List;

    .line 323
    .line 324
    iput-object v15, v8, La/fdw;->i:Ljava/util/Map;

    .line 325
    .line 326
    iput-object v12, v8, La/fdw;->j:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v1, v8, La/fdw;->k:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v15, v8, La/fdw;->l:Ljava/util/List;

    .line 331
    .line 332
    iput-object v0, v8, La/fdw;->m:La/xzp;

    .line 333
    .line 334
    iput-object v2, v8, La/fdw;->n:La/sgs;

    .line 335
    .line 336
    iput-object v11, v8, La/fdw;->o:Ljava/util/Iterator;

    .line 337
    .line 338
    const/4 v7, 0x4

    .line 339
    iput-byte v7, v8, La/fdw;->p:B

    .line 340
    .line 341
    move-object/from16 v17, v2

    .line 342
    .line 343
    move/from16 v18, v7

    .line 344
    .line 345
    move-wide/from16 v27, v5

    .line 346
    .line 347
    move-object v5, v1

    .line 348
    move-wide/from16 v1, v27

    .line 349
    .line 350
    const-wide/16 v6, -0x1a

    .line 351
    .line 352
    move-wide/from16 v27, v13

    .line 353
    .line 354
    move-object v14, v0

    .line 355
    move-object v0, v4

    .line 356
    move-object v13, v5

    .line 357
    move-object v5, v3

    .line 358
    move-wide/from16 v3, v27

    .line 359
    .line 360
    invoke-virtual/range {v0 .. v8}, La/n530;->d(JJLjava/util/List;JLa/zje;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    if-ne v0, v10, :cond_9

    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_9
    move-object v1, v13

    .line 368
    move-object v0, v14

    .line 369
    move-object/from16 v2, v17

    .line 370
    .line 371
    :goto_4
    move/from16 v14, v18

    .line 372
    .line 373
    const/4 v13, 0x5

    .line 374
    goto :goto_3

    .line 375
    :cond_a
    move-object v13, v1

    .line 376
    iput-object v15, v8, La/fdw;->i:Ljava/util/Map;

    .line 377
    .line 378
    iput-object v12, v8, La/fdw;->j:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v15, v8, La/fdw;->k:Ljava/lang/Object;

    .line 381
    .line 382
    iput-object v15, v8, La/fdw;->l:Ljava/util/List;

    .line 383
    .line 384
    iput-object v15, v8, La/fdw;->m:La/xzp;

    .line 385
    .line 386
    iput-object v15, v8, La/fdw;->n:La/sgs;

    .line 387
    .line 388
    iput-object v15, v8, La/fdw;->o:Ljava/util/Iterator;

    .line 389
    .line 390
    const/4 v0, 0x5

    .line 391
    iput-byte v0, v8, La/fdw;->p:B

    .line 392
    .line 393
    const-wide/16 v0, -0x1a

    .line 394
    .line 395
    invoke-virtual {v9, v0, v1, v8, v13}, La/n530;->a(JLa/zje;Ljava/util/Set;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    if-ne v0, v10, :cond_b

    .line 400
    .line 401
    :goto_5
    return-object v10

    .line 402
    :cond_b
    move-object v0, v12

    .line 403
    :goto_6
    new-instance v1, La/j0g0;

    .line 404
    .line 405
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    return-object v1
.end method
