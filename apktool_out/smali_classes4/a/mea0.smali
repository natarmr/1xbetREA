.class public final La/mea0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/hzg;

.field public final p:La/u8u;

.field public final q:La/ctf0;

.field public final r:La/ih5;

.field public final s:La/zr1;

.field public t:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;La/mne;La/hzg;La/u8u;La/ctf0;La/g2v;La/ih5;La/zr1;)V
    .locals 2

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, La/l3a0;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance p1, La/o20;

    .line 18
    .line 19
    const/16 v1, 0x12

    .line 20
    .line 21
    invoke-direct {p1, p6, p5, v1}, La/o20;-><init>(La/g2v;La/ctf0;B)V

    .line 22
    .line 23
    .line 24
    const/4 p6, 0x0

    .line 25
    invoke-direct {p0, v0, p2, p1, p6}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, La/mea0;->o:La/hzg;

    .line 29
    .line 30
    iput-object p4, p0, La/mea0;->p:La/u8u;

    .line 31
    .line 32
    iput-object p5, p0, La/mea0;->q:La/ctf0;

    .line 33
    .line 34
    iput-object p7, p0, La/mea0;->r:La/ih5;

    .line 35
    .line 36
    iput-object p8, p0, La/mea0;->s:La/zr1;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, La/yca0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/xca0;

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_e

    .line 16
    .line 17
    check-cast p1, La/xca0;

    .line 18
    .line 19
    sget-object v0, La/uca0;->a:La/uca0;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v4, p0, La/mea0;->o:La/hzg;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    check-cast v4, La/uzg;

    .line 30
    .line 31
    invoke-virtual {v4}, La/uzg;->a()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    sget-object v0, La/vca0;->a:La/vca0;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, La/mea0;->t:La/bby;

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    new-instance p1, La/epp;

    .line 51
    .line 52
    invoke-direct {p1, p0, v3, v1}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/mea0;->t:La/bby;

    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    instance-of v0, p1, La/wca0;

    .line 63
    .line 64
    if-eqz v0, :cond_d

    .line 65
    .line 66
    check-cast p1, La/wca0;

    .line 67
    .line 68
    iget-wide v0, p1, La/wca0;->a:J

    .line 69
    .line 70
    const/4 v5, 0x5

    .line 71
    new-array v5, v5, [La/yxg;

    .line 72
    .line 73
    sget-object v6, La/ttg;->d:La/ttg;

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    aput-object v6, v5, v7

    .line 77
    .line 78
    sget-object v6, La/trg;->d:La/trg;

    .line 79
    .line 80
    const/4 v8, 0x1

    .line 81
    aput-object v6, v5, v8

    .line 82
    .line 83
    sget-object v6, La/oxg;->d:La/oxg;

    .line 84
    .line 85
    const/4 v9, 0x2

    .line 86
    aput-object v6, v5, v9

    .line 87
    .line 88
    sget-object v6, La/pug;->d:La/pug;

    .line 89
    .line 90
    aput-object v6, v5, v2

    .line 91
    .line 92
    sget-object v2, La/yvg;->d:La/yvg;

    .line 93
    .line 94
    const/4 v6, 0x4

    .line 95
    aput-object v2, v5, v6

    .line 96
    .line 97
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v5, Ljava/util/ArrayList;

    .line 102
    .line 103
    const/16 v6, 0xa

    .line 104
    .line 105
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_3

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, La/yxg;

    .line 127
    .line 128
    iget-wide v9, v6, La/yxg;->a:J

    .line 129
    .line 130
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, La/zda0;

    .line 143
    .line 144
    iget-object v2, v2, La/zda0;->b:La/j0g0;

    .line 145
    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 149
    .line 150
    instance-of v6, v2, La/g0g0;

    .line 151
    .line 152
    if-eqz v6, :cond_4

    .line 153
    .line 154
    move-object v2, v3

    .line 155
    :cond_4
    check-cast v2, La/jda0;

    .line 156
    .line 157
    if-eqz v2, :cond_7

    .line 158
    .line 159
    iget-object v2, v2, La/jda0;->b:Ljava/util/List;

    .line 160
    .line 161
    if-eqz v2, :cond_7

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_6

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    move-object v9, v6

    .line 178
    check-cast v9, La/fea0;

    .line 179
    .line 180
    iget-object v9, v9, La/fea0;->d:La/aea0;

    .line 181
    .line 182
    iget-wide v9, v9, La/aea0;->a:J

    .line 183
    .line 184
    cmp-long v9, v9, v0

    .line 185
    .line 186
    if-nez v9, :cond_5

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_6
    move-object v6, v3

    .line 190
    :goto_1
    check-cast v6, La/fea0;

    .line 191
    .line 192
    if-eqz v6, :cond_7

    .line 193
    .line 194
    iget-object v3, v6, La/fea0;->d:La/aea0;

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, La/zda0;

    .line 202
    .line 203
    iget-object v2, v2, La/zda0;->b:La/j0g0;

    .line 204
    .line 205
    if-eqz v2, :cond_b

    .line 206
    .line 207
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 208
    .line 209
    instance-of v6, v2, La/g0g0;

    .line 210
    .line 211
    if-eqz v6, :cond_8

    .line 212
    .line 213
    move-object v2, v3

    .line 214
    :cond_8
    check-cast v2, La/jda0;

    .line 215
    .line 216
    if-eqz v2, :cond_b

    .line 217
    .line 218
    iget-object v2, v2, La/jda0;->b:Ljava/util/List;

    .line 219
    .line 220
    if-eqz v2, :cond_b

    .line 221
    .line 222
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_a

    .line 231
    .line 232
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    move-object v9, v6

    .line 237
    check-cast v9, La/fea0;

    .line 238
    .line 239
    iget-object v9, v9, La/fea0;->e:La/aea0;

    .line 240
    .line 241
    iget-wide v9, v9, La/aea0;->a:J

    .line 242
    .line 243
    cmp-long v9, v9, v0

    .line 244
    .line 245
    if-nez v9, :cond_9

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_a
    move-object v6, v3

    .line 249
    :goto_2
    check-cast v6, La/fea0;

    .line 250
    .line 251
    if-eqz v6, :cond_b

    .line 252
    .line 253
    iget-object v3, v6, La/fea0;->e:La/aea0;

    .line 254
    .line 255
    :cond_b
    :goto_3
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, La/zda0;

    .line 260
    .line 261
    iget-object v0, v0, La/zda0;->a:Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 262
    .line 263
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;->a:J

    .line 264
    .line 265
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_c

    .line 274
    .line 275
    if-eqz v3, :cond_c

    .line 276
    .line 277
    iget-boolean v0, v3, La/aea0;->f:Z

    .line 278
    .line 279
    if-ne v0, v8, :cond_c

    .line 280
    .line 281
    sget-object v0, La/r1g;->y:La/r1g;

    .line 282
    .line 283
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, La/zda0;

    .line 288
    .line 289
    iget-object v1, v1, La/zda0;->a:Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 290
    .line 291
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;->a:J

    .line 292
    .line 293
    iget-object v3, p0, La/mea0;->r:La/ih5;

    .line 294
    .line 295
    invoke-virtual {v3, v0, v1, v2}, La/ih5;->p(La/r1g;J)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, La/zda0;

    .line 303
    .line 304
    iget-object v0, v0, La/zda0;->a:Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 305
    .line 306
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;->a:J

    .line 307
    .line 308
    iget-object v2, p0, La/mea0;->s:La/zr1;

    .line 309
    .line 310
    const-string v3, "player_transfers"

    .line 311
    .line 312
    invoke-virtual {v2, v0, v1, v3}, La/zr1;->z(JLjava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    check-cast p0, La/zda0;

    .line 320
    .line 321
    iget-object p0, p0, La/zda0;->a:Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 322
    .line 323
    iget-wide v6, p0, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;->a:J

    .line 324
    .line 325
    iget-wide v8, p1, La/wca0;->a:J

    .line 326
    .line 327
    iget-object v10, p1, La/wca0;->b:Ljava/lang/String;

    .line 328
    .line 329
    sget-object v11, La/k1g;->h:La/k1g;

    .line 330
    .line 331
    move-object v5, v4

    .line 332
    check-cast v5, La/uzg;

    .line 333
    .line 334
    invoke-virtual/range {v5 .. v11}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :cond_c
    new-array p1, v7, [Ljava/lang/Object;

    .line 339
    .line 340
    iget-object v0, p0, La/mea0;->q:La/ctf0;

    .line 341
    .line 342
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 343
    .line 344
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    const v1, 0x7f131302

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    new-instance v0, La/yda0;

    .line 356
    .line 357
    invoke-direct {v0, p1}, La/yda0;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_e
    instance-of v0, p1, La/tca0;

    .line 369
    .line 370
    if-eqz v0, :cond_14

    .line 371
    .line 372
    check-cast p1, La/tca0;

    .line 373
    .line 374
    sget-object v0, La/sca0;->a:La/sca0;

    .line 375
    .line 376
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_10

    .line 381
    .line 382
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    check-cast p1, La/zda0;

    .line 387
    .line 388
    iget-object p1, p1, La/zda0;->b:La/j0g0;

    .line 389
    .line 390
    if-nez p1, :cond_11

    .line 391
    .line 392
    iget-object p1, p0, La/mea0;->t:La/bby;

    .line 393
    .line 394
    if-eqz p1, :cond_f

    .line 395
    .line 396
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 397
    .line 398
    .line 399
    :cond_f
    new-instance p1, La/epp;

    .line 400
    .line 401
    invoke-direct {p1, p0, v3, v1}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 402
    .line 403
    .line 404
    invoke-static {p0, v3, v3, p1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    iput-object p1, p0, La/mea0;->t:La/bby;

    .line 409
    .line 410
    return-void

    .line 411
    :cond_10
    sget-object v0, La/rca0;->a:La/rca0;

    .line 412
    .line 413
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_12

    .line 418
    .line 419
    iget-object p0, p0, La/mea0;->t:La/bby;

    .line 420
    .line 421
    if-eqz p0, :cond_11

    .line 422
    .line 423
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 424
    .line 425
    .line 426
    :cond_11
    return-void

    .line 427
    :cond_12
    sget-object v0, La/qca0;->a:La/qca0;

    .line 428
    .line 429
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    if-eqz p1, :cond_13

    .line 434
    .line 435
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 444
    .line 445
    .line 446
    return-void
.end method
