.class public final La/pec0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/kmq;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/sec0;


# direct methods
.method public synthetic constructor <init>(La/sec0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pec0;->i:B

    iput-object p1, p0, La/pec0;->m:La/sec0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pec0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pec0;->m:La/sec0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pec0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/pec0;-><init>(La/sec0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/pec0;->l:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/pec0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/pec0;-><init>(La/sec0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/pec0;->l:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pec0;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/pec0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pec0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pec0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pec0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pec0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pec0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pec0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/pec0;->m:La/sec0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, La/pec0;->l:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/kmq;

    .line 18
    .line 19
    sget-object v7, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v8, v0, La/pec0;->k:B

    .line 22
    .line 23
    if-eqz v8, :cond_2

    .line 24
    .line 25
    if-eq v8, v4, :cond_1

    .line 26
    .line 27
    if-ne v8, v5, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    iget-object v1, v0, La/pec0;->j:La/kmq;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v2, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v2, La/sec0;->q:La/lbu;

    .line 49
    .line 50
    iput-object v6, v0, La/pec0;->l:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v1, v0, La/pec0;->j:La/kmq;

    .line 53
    .line 54
    iput-byte v4, v0, La/pec0;->k:B

    .line 55
    .line 56
    invoke-virtual {v2, v0}, La/lbu;->e(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-ne v2, v7, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    iput-object v6, v0, La/pec0;->l:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v6, v0, La/pec0;->j:La/kmq;

    .line 66
    .line 67
    iput-byte v5, v0, La/pec0;->k:B

    .line 68
    .line 69
    invoke-interface {v1, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-ne v0, v7, :cond_4

    .line 74
    .line 75
    :goto_1
    move-object v6, v7

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_3
    return-object v6

    .line 80
    :pswitch_0
    iget-object v1, v0, La/pec0;->l:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, La/kmq;

    .line 83
    .line 84
    sget-object v7, La/wne;->a:La/wne;

    .line 85
    .line 86
    iget-byte v8, v0, La/pec0;->k:B

    .line 87
    .line 88
    if-eqz v8, :cond_7

    .line 89
    .line 90
    if-eq v8, v4, :cond_6

    .line 91
    .line 92
    if-ne v8, v5, :cond_5

    .line 93
    .line 94
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_15

    .line 98
    .line 99
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_16

    .line 103
    .line 104
    :cond_6
    iget-object v1, v0, La/pec0;->j:La/kmq;

    .line 105
    .line 106
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object/from16 v3, p1

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v3, v2, La/sec0;->p:La/hnu;

    .line 116
    .line 117
    iput-object v6, v0, La/pec0;->l:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v1, v0, La/pec0;->j:La/kmq;

    .line 120
    .line 121
    iput-byte v4, v0, La/pec0;->k:B

    .line 122
    .line 123
    iget-object v3, v3, La/hnu;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, La/w5z;

    .line 126
    .line 127
    iget-object v8, v3, La/w5z;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v8, La/xyt;

    .line 130
    .line 131
    invoke-virtual {v8}, La/xyt;->a()I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    invoke-virtual {v3, v8, v0}, La/w5z;->Y(ILa/zje;)Ljava/io/Serializable;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    if-ne v3, v7, :cond_8

    .line 140
    .line 141
    goto/16 :goto_14

    .line 142
    .line 143
    :cond_8
    :goto_4
    check-cast v3, Ljava/lang/Iterable;

    .line 144
    .line 145
    new-instance v8, Ljava/util/ArrayList;

    .line 146
    .line 147
    const/16 v9, 0xa

    .line 148
    .line 149
    invoke-static {v3, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_23

    .line 165
    .line 166
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    check-cast v10, La/zec0;

    .line 171
    .line 172
    iget-object v11, v2, La/sec0;->v:La/ctf0;

    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-wide v12, v10, La/zec0;->g:J

    .line 178
    .line 179
    iget-wide v14, v10, La/zec0;->f:J

    .line 180
    .line 181
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    sget-object v16, La/ydc0;->b:La/nh70;

    .line 185
    .line 186
    iget v6, v10, La/zec0;->i:I

    .line 187
    .line 188
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    const/4 v9, 0x3

    .line 192
    if-eq v6, v4, :cond_c

    .line 193
    .line 194
    if-eq v6, v5, :cond_b

    .line 195
    .line 196
    if-eq v6, v9, :cond_a

    .line 197
    .line 198
    const/4 v9, 0x4

    .line 199
    if-eq v6, v9, :cond_9

    .line 200
    .line 201
    sget-object v6, La/ydc0;->c:La/ydc0;

    .line 202
    .line 203
    :goto_6
    move-object/from16 v22, v6

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_9
    sget-object v6, La/ydc0;->e:La/ydc0;

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_a
    sget-object v6, La/ydc0;->g:La/ydc0;

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_b
    sget-object v6, La/ydc0;->f:La/ydc0;

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_c
    sget-object v6, La/ydc0;->d:La/ydc0;

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :goto_7
    new-instance v17, La/aec0;

    .line 219
    .line 220
    iget-wide v5, v10, La/zec0;->j:J

    .line 221
    .line 222
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    const-string v19, "IllegalStateException"

    .line 227
    .line 228
    if-eqz v9, :cond_22

    .line 229
    .line 230
    if-eq v9, v4, :cond_10

    .line 231
    .line 232
    const/4 v4, 0x2

    .line 233
    if-eq v9, v4, :cond_f

    .line 234
    .line 235
    const/4 v4, 0x3

    .line 236
    if-eq v9, v4, :cond_e

    .line 237
    .line 238
    const/4 v4, 0x4

    .line 239
    if-ne v9, v4, :cond_d

    .line 240
    .line 241
    const v4, 0x7f080b50

    .line 242
    .line 243
    .line 244
    :goto_8
    move/from16 v20, v4

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 248
    .line 249
    .line 250
    :goto_9
    const/4 v6, 0x0

    .line 251
    goto/16 :goto_16

    .line 252
    .line 253
    :cond_e
    const v4, 0x7f080b52

    .line 254
    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_f
    const v4, 0x7f080b53

    .line 258
    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_10
    const v4, 0x7f080b4f

    .line 262
    .line 263
    .line 264
    goto :goto_8

    .line 265
    :goto_a
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-eqz v4, :cond_21

    .line 270
    .line 271
    const/4 v9, 0x1

    .line 272
    if-eq v4, v9, :cond_14

    .line 273
    .line 274
    const/4 v9, 0x2

    .line 275
    if-eq v4, v9, :cond_13

    .line 276
    .line 277
    const v18, 0x7f0606be

    .line 278
    .line 279
    .line 280
    const/4 v9, 0x3

    .line 281
    if-eq v4, v9, :cond_11

    .line 282
    .line 283
    const/4 v9, 0x4

    .line 284
    if-ne v4, v9, :cond_12

    .line 285
    .line 286
    :cond_11
    :goto_b
    move/from16 v21, v18

    .line 287
    .line 288
    goto :goto_c

    .line 289
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 290
    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_13
    const v18, 0x7f0606d0

    .line 294
    .line 295
    .line 296
    goto :goto_b

    .line 297
    :cond_14
    const v18, 0x7f0606c1

    .line 298
    .line 299
    .line 300
    goto :goto_b

    .line 301
    :goto_c
    iget-object v4, v10, La/zec0;->a:Ljava/lang/String;

    .line 302
    .line 303
    iget-object v9, v10, La/zec0;->b:Ljava/lang/String;

    .line 304
    .line 305
    move-object/from16 v26, v2

    .line 306
    .line 307
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    move-object/from16 v27, v3

    .line 312
    .line 313
    iget-object v3, v10, La/zec0;->c:Ljava/util/List;

    .line 314
    .line 315
    move-object/from16 v23, v4

    .line 316
    .line 317
    new-instance v4, Ljava/util/ArrayList;

    .line 318
    .line 319
    move-wide/from16 v24, v5

    .line 320
    .line 321
    const/16 v5, 0xa

    .line 322
    .line 323
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    move/from16 v18, v5

    .line 339
    .line 340
    if-eqz v18, :cond_15

    .line 341
    .line 342
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v18

    .line 346
    move-object/from16 v5, v18

    .line 347
    .line 348
    check-cast v5, La/wcc0;

    .line 349
    .line 350
    new-instance v6, La/zdc0;

    .line 351
    .line 352
    move-object/from16 v18, v3

    .line 353
    .line 354
    iget-object v3, v5, La/wcc0;->c:Ljava/lang/String;

    .line 355
    .line 356
    iget-object v5, v5, La/wcc0;->d:Ljava/lang/String;

    .line 357
    .line 358
    move-wide/from16 v30, v12

    .line 359
    .line 360
    const-wide/16 v12, 0x0

    .line 361
    .line 362
    invoke-direct {v6, v3, v5, v12, v13}, La/zdc0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-object/from16 v3, v18

    .line 369
    .line 370
    move-wide/from16 v12, v30

    .line 371
    .line 372
    goto :goto_d

    .line 373
    :cond_15
    move-wide/from16 v30, v12

    .line 374
    .line 375
    invoke-virtual {v2, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 376
    .line 377
    .line 378
    new-instance v3, La/zdc0;

    .line 379
    .line 380
    const/4 v4, 0x0

    .line 381
    new-array v5, v4, [Ljava/lang/Object;

    .line 382
    .line 383
    iget-object v6, v11, La/ctf0;->b:La/lsm0;

    .line 384
    .line 385
    const v12, 0x7f131418

    .line 386
    .line 387
    .line 388
    invoke-virtual {v11, v12, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    sget-object v12, La/pn40;->a:La/pn40;

    .line 393
    .line 394
    iget-wide v12, v10, La/zec0;->d:D

    .line 395
    .line 396
    iget-object v10, v10, La/zec0;->e:Ljava/lang/String;

    .line 397
    .line 398
    sget-object v4, La/p3u0;->c:La/p3u0;

    .line 399
    .line 400
    invoke-static {v12, v13, v10, v4}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    const-wide/16 v12, 0x0

    .line 405
    .line 406
    invoke-direct {v3, v5, v4, v12, v13}, La/zdc0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    const/4 v4, 0x1

    .line 417
    if-eq v3, v4, :cond_17

    .line 418
    .line 419
    const/4 v5, 0x2

    .line 420
    if-eq v3, v5, :cond_16

    .line 421
    .line 422
    const-wide/16 v12, 0x0

    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_16
    move-wide v12, v14

    .line 426
    goto :goto_e

    .line 427
    :cond_17
    const/4 v5, 0x2

    .line 428
    move-wide/from16 v12, v30

    .line 429
    .line 430
    :goto_e
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_1c

    .line 435
    .line 436
    if-eq v3, v4, :cond_1b

    .line 437
    .line 438
    if-eq v3, v5, :cond_1a

    .line 439
    .line 440
    move-object v4, v9

    .line 441
    const/4 v5, 0x3

    .line 442
    if-eq v3, v5, :cond_19

    .line 443
    .line 444
    const/4 v5, 0x4

    .line 445
    if-ne v3, v5, :cond_18

    .line 446
    .line 447
    const v3, 0x7f131022

    .line 448
    .line 449
    .line 450
    :goto_f
    const/4 v5, 0x0

    .line 451
    goto :goto_10

    .line 452
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_9

    .line 456
    .line 457
    :cond_19
    const v3, 0x7f131021

    .line 458
    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_1a
    move-object v4, v9

    .line 462
    const v3, 0x7f131026

    .line 463
    .line 464
    .line 465
    goto :goto_f

    .line 466
    :cond_1b
    move-object v4, v9

    .line 467
    const v3, 0x7f131020

    .line 468
    .line 469
    .line 470
    goto :goto_f

    .line 471
    :cond_1c
    move-object v4, v9

    .line 472
    const v3, 0x7f130792

    .line 473
    .line 474
    .line 475
    goto :goto_f

    .line 476
    :goto_10
    new-array v10, v5, [Ljava/lang/Object;

    .line 477
    .line 478
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    invoke-virtual {v6, v3, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    new-array v10, v5, [Ljava/lang/Object;

    .line 487
    .line 488
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v10

    .line 492
    const v5, 0x7f1313ef    # 1.9550002E38f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v6, v5, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    const-wide/16 v28, 0x0

    .line 500
    .line 501
    cmp-long v6, v12, v28

    .line 502
    .line 503
    if-nez v6, :cond_1d

    .line 504
    .line 505
    goto :goto_11

    .line 506
    :cond_1d
    sget-object v6, La/rdj;->a:La/rdj;

    .line 507
    .line 508
    invoke-virtual {v11}, La/ctf0;->h()Z

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    sget-object v10, La/efj;->c:La/efj;

    .line 513
    .line 514
    new-instance v11, La/znq0;

    .line 515
    .line 516
    invoke-direct {v11, v12, v13}, La/znq0;-><init>(J)V

    .line 517
    .line 518
    .line 519
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    const/16 v12, 0x38

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    invoke-static {v11, v10, v6, v13, v12}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v6

    .line 530
    const-string v10, "\u00a0"

    .line 531
    .line 532
    const-string v11, " "

    .line 533
    .line 534
    invoke-static {v6, v11, v10, v13}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    invoke-static {v3, v11, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    :goto_11
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    const/4 v10, 0x1

    .line 547
    if-eq v6, v10, :cond_1f

    .line 548
    .line 549
    const/4 v9, 0x2

    .line 550
    if-eq v6, v9, :cond_1e

    .line 551
    .line 552
    move-wide/from16 v12, v28

    .line 553
    .line 554
    goto :goto_12

    .line 555
    :cond_1e
    move-wide v12, v14

    .line 556
    goto :goto_12

    .line 557
    :cond_1f
    move-wide/from16 v12, v30

    .line 558
    .line 559
    :goto_12
    new-instance v6, La/zdc0;

    .line 560
    .line 561
    invoke-direct {v6, v5, v3, v12, v13}, La/zdc0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    new-instance v3, Ljava/util/ArrayList;

    .line 572
    .line 573
    const/16 v5, 0xa

    .line 574
    .line 575
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 576
    .line 577
    .line 578
    move-result v6

    .line 579
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 580
    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    invoke-virtual {v2, v13}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    :goto_13
    move-object v6, v2

    .line 588
    check-cast v6, La/paw;

    .line 589
    .line 590
    invoke-virtual {v6}, La/paw;->hasNext()Z

    .line 591
    .line 592
    .line 593
    move-result v11

    .line 594
    if-eqz v11, :cond_20

    .line 595
    .line 596
    invoke-virtual {v6}, La/paw;->next()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    check-cast v6, La/zdc0;

    .line 601
    .line 602
    iget-object v11, v6, La/zdc0;->a:Ljava/lang/String;

    .line 603
    .line 604
    const-string v12, ":"

    .line 605
    .line 606
    invoke-static {v11, v12}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v11

    .line 610
    iget-object v12, v6, La/zdc0;->b:Ljava/lang/String;

    .line 611
    .line 612
    iget-wide v13, v6, La/zdc0;->c:J

    .line 613
    .line 614
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    new-instance v6, La/zdc0;

    .line 618
    .line 619
    invoke-direct {v6, v11, v12, v13, v14}, La/zdc0;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    goto :goto_13

    .line 626
    :cond_20
    move-wide/from16 v18, v24

    .line 627
    .line 628
    move-object/from16 v25, v3

    .line 629
    .line 630
    move-object/from16 v24, v4

    .line 631
    .line 632
    invoke-direct/range {v17 .. v25}, La/aec0;-><init>(JIILa/ydc0;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 633
    .line 634
    .line 635
    move-object/from16 v2, v17

    .line 636
    .line 637
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move v9, v5

    .line 641
    move v4, v10

    .line 642
    move-object/from16 v2, v26

    .line 643
    .line 644
    move-object/from16 v3, v27

    .line 645
    .line 646
    const/4 v5, 0x2

    .line 647
    const/4 v6, 0x0

    .line 648
    goto/16 :goto_5

    .line 649
    .line 650
    :cond_21
    invoke-static/range {v19 .. v19}, La/jf4;->n(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    goto/16 :goto_9

    .line 654
    .line 655
    :cond_22
    invoke-static/range {v19 .. v19}, La/jf4;->n(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    goto/16 :goto_9

    .line 659
    .line 660
    :cond_23
    invoke-static {v8}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/4 v3, 0x0

    .line 665
    iput-object v3, v0, La/pec0;->l:Ljava/lang/Object;

    .line 666
    .line 667
    iput-object v3, v0, La/pec0;->j:La/kmq;

    .line 668
    .line 669
    const/4 v9, 0x2

    .line 670
    iput-byte v9, v0, La/pec0;->k:B

    .line 671
    .line 672
    invoke-interface {v1, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    if-ne v0, v7, :cond_24

    .line 677
    .line 678
    :goto_14
    move-object v6, v7

    .line 679
    goto :goto_16

    .line 680
    :cond_24
    :goto_15
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    :goto_16
    return-object v6

    .line 683
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
