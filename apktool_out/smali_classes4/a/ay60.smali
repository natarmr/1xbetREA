.class public final La/ay60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dy60;


# direct methods
.method public synthetic constructor <init>(La/dy60;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ay60;->i:B

    iput-object p1, p0, La/ay60;->k:La/dy60;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ay60;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ay60;->k:La/dy60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ay60;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ay60;-><init>(La/dy60;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ay60;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ay60;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ay60;-><init>(La/dy60;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ay60;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ay60;->i:B

    .line 2
    .line 3
    check-cast p1, Lkotlin/Pair;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ay60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ay60;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ay60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ay60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ay60;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ay60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ay60;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/ay60;->k:La/dy60;

    .line 7
    .line 8
    iget-object v0, v0, La/ay60;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lkotlin/Pair;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, Ljava/util/List;

    .line 28
    .line 29
    iget-object v0, v3, La/i3t0;->f:La/oyg0;

    .line 30
    .line 31
    iget-object v5, v3, La/i3t0;->i:La/ocj;

    .line 32
    .line 33
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, La/qx60;

    .line 38
    .line 39
    iget-boolean v6, v6, La/qx60;->d:Z

    .line 40
    .line 41
    if-nez v6, :cond_0

    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_2

    .line 61
    .line 62
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    move-object v9, v8

    .line 67
    check-cast v9, La/pbv;

    .line 68
    .line 69
    iget-boolean v9, v9, La/pbv;->q:Z

    .line 70
    .line 71
    if-eqz v9, :cond_1

    .line 72
    .line 73
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const/16 v7, 0xa

    .line 78
    .line 79
    invoke-static {v6, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-static {v8}, La/wp20;->a(I)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    const/16 v9, 0x10

    .line 88
    .line 89
    if-ge v8, v9, :cond_3

    .line 90
    .line 91
    move v8, v9

    .line 92
    :cond_3
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-direct {v9, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_4

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    move-object v10, v8

    .line 112
    check-cast v10, La/pbv;

    .line 113
    .line 114
    iget-wide v10, v10, La/pbv;->a:J

    .line 115
    .line 116
    new-instance v12, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-direct {v12, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v9, v12, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    :cond_5
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-eqz v10, :cond_6

    .line 139
    .line 140
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    check-cast v10, La/i8p;

    .line 145
    .line 146
    iget-wide v10, v10, La/i8p;->a:J

    .line 147
    .line 148
    new-instance v12, Ljava/lang/Long;

    .line 149
    .line 150
    invoke-direct {v12, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    check-cast v10, La/pbv;

    .line 158
    .line 159
    if-eqz v10, :cond_5

    .line 160
    .line 161
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_c

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_7

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    :cond_8
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    if-eqz v9, :cond_9

    .line 187
    .line 188
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    check-cast v9, La/pbv;

    .line 193
    .line 194
    iget-boolean v10, v9, La/pbv;->p:Z

    .line 195
    .line 196
    if-nez v10, :cond_8

    .line 197
    .line 198
    iget-boolean v9, v9, La/pbv;->q:Z

    .line 199
    .line 200
    if-nez v9, :cond_c

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_9
    :goto_4
    new-instance v16, La/sq60;

    .line 204
    .line 205
    invoke-direct/range {v16 .. v16}, Ljava/io/IOException;-><init>()V

    .line 206
    .line 207
    .line 208
    iget-object v8, v5, La/ocj;->a:La/p7m0;

    .line 209
    .line 210
    :cond_a
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-object v10, v1

    .line 218
    check-cast v10, La/qx60;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    const/4 v15, 0x0

    .line 224
    const/16 v17, 0x7f

    .line 225
    .line 226
    const/4 v11, 0x0

    .line 227
    const/4 v12, 0x0

    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    invoke-static/range {v10 .. v17}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v8, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_a

    .line 239
    .line 240
    new-instance v0, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-static {v4, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_b

    .line 258
    .line 259
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    check-cast v2, La/pbv;

    .line 264
    .line 265
    iget-wide v4, v2, La/pbv;->a:J

    .line 266
    .line 267
    invoke-static {v4, v5, v0}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_b
    invoke-virtual {v3, v0}, La/dy60;->R(Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    goto/16 :goto_9

    .line 277
    .line 278
    :cond_c
    iget-object v5, v5, La/ocj;->a:La/p7m0;

    .line 279
    .line 280
    :cond_d
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-object v8, v0

    .line 288
    check-cast v8, La/qx60;

    .line 289
    .line 290
    new-instance v10, La/cfp;

    .line 291
    .line 292
    invoke-direct {v10, v6, v1}, La/cfp;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 293
    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const/16 v15, 0x7b

    .line 297
    .line 298
    const/4 v9, 0x0

    .line 299
    const/4 v11, 0x0

    .line 300
    const/4 v12, 0x0

    .line 301
    const/4 v13, 0x0

    .line 302
    invoke-static/range {v8 .. v15}, La/qx60;->a(La/qx60;La/gep;La/cfp;ZZZLjava/lang/Throwable;I)La/qx60;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    invoke-virtual {v5, v0, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_d

    .line 311
    .line 312
    iget-object v0, v3, La/dy60;->D:La/nn60;

    .line 313
    .line 314
    new-instance v5, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-eqz v6, :cond_e

    .line 332
    .line 333
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    check-cast v6, La/i8p;

    .line 338
    .line 339
    iget-wide v8, v6, La/i8p;->a:J

    .line 340
    .line 341
    invoke-static {v8, v9, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_e
    new-instance v1, La/xm60;

    .line 346
    .line 347
    invoke-direct {v1, v5}, La/xm60;-><init>(Ljava/util/ArrayList;)V

    .line 348
    .line 349
    .line 350
    new-array v2, v2, [La/en60;

    .line 351
    .line 352
    const/4 v5, 0x0

    .line 353
    aput-object v1, v2, v5

    .line 354
    .line 355
    invoke-static {v3, v0, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 356
    .line 357
    .line 358
    new-instance v0, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    :cond_f
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_11

    .line 372
    .line 373
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    move-object v4, v2

    .line 378
    check-cast v4, La/pbv;

    .line 379
    .line 380
    iget-boolean v5, v4, La/pbv;->p:Z

    .line 381
    .line 382
    if-nez v5, :cond_10

    .line 383
    .line 384
    iget-boolean v4, v4, La/pbv;->q:Z

    .line 385
    .line 386
    if-nez v4, :cond_f

    .line 387
    .line 388
    :cond_10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_11
    new-instance v1, Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-eqz v2, :cond_12

    .line 410
    .line 411
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    check-cast v2, La/pbv;

    .line 416
    .line 417
    iget-wide v4, v2, La/pbv;->a:J

    .line 418
    .line 419
    invoke-static {v4, v5, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 420
    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-nez v0, :cond_13

    .line 428
    .line 429
    invoke-virtual {v3, v1}, La/dy60;->R(Ljava/util/List;)V

    .line 430
    .line 431
    .line 432
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    :goto_9
    return-object v0

    .line 435
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 436
    .line 437
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v1, La/pat;

    .line 443
    .line 444
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v0, La/pat;

    .line 447
    .line 448
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    check-cast v4, La/qx60;

    .line 453
    .line 454
    iget-boolean v4, v4, La/qx60;->d:Z

    .line 455
    .line 456
    sget-object v5, La/dun;->a:La/dun;

    .line 457
    .line 458
    if-nez v4, :cond_14

    .line 459
    .line 460
    goto :goto_c

    .line 461
    :cond_14
    :try_start_0
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 462
    .line 463
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    instance-of v4, v1, La/oat;

    .line 470
    .line 471
    if-nez v4, :cond_17

    .line 472
    .line 473
    instance-of v4, v0, La/oat;

    .line 474
    .line 475
    if-nez v4, :cond_17

    .line 476
    .line 477
    instance-of v4, v1, La/mat;

    .line 478
    .line 479
    if-nez v4, :cond_16

    .line 480
    .line 481
    instance-of v4, v0, La/mat;

    .line 482
    .line 483
    if-nez v4, :cond_16

    .line 484
    .line 485
    instance-of v1, v1, La/lat;

    .line 486
    .line 487
    if-nez v1, :cond_15

    .line 488
    .line 489
    instance-of v0, v0, La/lat;

    .line 490
    .line 491
    if-nez v0, :cond_15

    .line 492
    .line 493
    iget-object v0, v3, La/dy60;->r:La/ali;

    .line 494
    .line 495
    invoke-virtual {v0, v2}, La/ali;->p(Z)La/ewt;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    goto :goto_b

    .line 500
    :catchall_0
    move-exception v0

    .line 501
    goto :goto_a

    .line 502
    :cond_15
    new-instance v0, La/bun;

    .line 503
    .line 504
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 505
    .line 506
    .line 507
    throw v0

    .line 508
    :cond_16
    new-instance v0, La/vub0;

    .line 509
    .line 510
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 511
    .line 512
    .line 513
    throw v0

    .line 514
    :cond_17
    new-instance v0, La/sq60;

    .line 515
    .line 516
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 517
    .line 518
    .line 519
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 520
    :goto_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 521
    .line 522
    new-instance v1, La/g0g0;

    .line 523
    .line 524
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 525
    .line 526
    .line 527
    move-object v0, v1

    .line 528
    :goto_b
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    if-eqz v1, :cond_18

    .line 533
    .line 534
    invoke-virtual {v3, v1}, La/dy60;->M(Ljava/lang/Throwable;)V

    .line 535
    .line 536
    .line 537
    :cond_18
    instance-of v1, v0, La/g0g0;

    .line 538
    .line 539
    if-eqz v1, :cond_19

    .line 540
    .line 541
    goto :goto_c

    .line 542
    :cond_19
    move-object v5, v0

    .line 543
    :goto_c
    return-object v5

    .line 544
    nop

    .line 545
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
