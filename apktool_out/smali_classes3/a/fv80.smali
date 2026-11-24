.class public final synthetic La/fv80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gv80;


# direct methods
.method public synthetic constructor <init>(La/gv80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fv80;->a:B

    iput-object p1, p0, La/fv80;->b:La/gv80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/fv80;->a:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object p0, p0, La/fv80;->b:La/gv80;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, La/gv80;->r:La/n0o0;

    .line 17
    .line 18
    sget-object v2, La/xll;->a:La/xll;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p0, La/aml;

    .line 23
    .line 24
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, La/fee;

    .line 29
    .line 30
    invoke-virtual {p1}, La/fee;->b()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/pt0;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-direct {p0, p1, v2, v0}, La/aml;-><init>(La/pt0;La/yll;Z)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/fee;

    .line 47
    .line 48
    invoke-virtual {p1}, La/fee;->b()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, La/pt0;

    .line 53
    .line 54
    iget-object v3, p0, La/gv80;->j:La/n0o0;

    .line 55
    .line 56
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, La/fee;

    .line 61
    .line 62
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/Iterable;

    .line 67
    .line 68
    new-instance v4, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {v3, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    move-object v5, v3

    .line 92
    check-cast v5, La/mlr;

    .line 93
    .line 94
    iget-object v6, p0, La/gv80;->a:La/ctf0;

    .line 95
    .line 96
    iget-object v3, p0, La/gv80;->e:La/n0o0;

    .line 97
    .line 98
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, La/fee;

    .line 103
    .line 104
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    iget-object v3, p0, La/gv80;->h:La/n0o0;

    .line 115
    .line 116
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, La/fee;

    .line 121
    .line 122
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    iget-object v3, p0, La/gv80;->k:La/n0o0;

    .line 133
    .line 134
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, La/fee;

    .line 139
    .line 140
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/util/Set;

    .line 145
    .line 146
    iget-wide v9, v5, La/mlr;->a:J

    .line 147
    .line 148
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, La/fee;

    .line 161
    .line 162
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    move-object v10, v3

    .line 167
    check-cast v10, La/pt0;

    .line 168
    .line 169
    const/4 v11, 0x0

    .line 170
    invoke-static/range {v5 .. v11}, La/ccq0;->Z(La/mlr;La/ctf0;ZZZLa/pt0;Ljava/lang/Integer;)La/st0;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_1
    new-instance p0, La/zll;

    .line 179
    .line 180
    invoke-direct {p0, p1, v2, v4}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    :goto_1
    return-object p0

    .line 184
    :pswitch_0
    check-cast p1, La/gu80;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, La/gv80;->q:La/n0o0;

    .line 190
    .line 191
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, La/fee;

    .line 196
    .line 197
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/lq5;

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    instance-of v0, p1, La/du80;

    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    if-eqz v0, :cond_9

    .line 210
    .line 211
    new-instance v0, La/hu80;

    .line 212
    .line 213
    check-cast p1, La/du80;

    .line 214
    .line 215
    iget-object p1, p1, La/du80;->a:Ljava/util/List;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v3, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_8

    .line 238
    .line 239
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, La/lr5;

    .line 244
    .line 245
    new-instance v4, La/fr5;

    .line 246
    .line 247
    iget v5, v1, La/lr5;->a:I

    .line 248
    .line 249
    new-instance v6, La/n0x;

    .line 250
    .line 251
    sget-object v7, La/gq5;->a:La/gq5;

    .line 252
    .line 253
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-nez v7, :cond_7

    .line 258
    .line 259
    sget-object v7, La/fq5;->a:La/fq5;

    .line 260
    .line 261
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_2

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_2
    sget-object v7, La/hq5;->a:La/hq5;

    .line 269
    .line 270
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-nez v7, :cond_6

    .line 275
    .line 276
    sget-object v7, La/iq5;->a:La/iq5;

    .line 277
    .line 278
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    if-nez v7, :cond_6

    .line 283
    .line 284
    sget-object v7, La/kq5;->a:La/kq5;

    .line 285
    .line 286
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v7, :cond_6

    .line 291
    .line 292
    instance-of v7, p0, La/jq5;

    .line 293
    .line 294
    if-eqz v7, :cond_3

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_3
    sget-object v7, La/dq5;->a:La/dq5;

    .line 298
    .line 299
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    if-nez v7, :cond_5

    .line 304
    .line 305
    sget-object v7, La/eq5;->a:La/eq5;

    .line 306
    .line 307
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    if-nez v7, :cond_5

    .line 312
    .line 313
    sget-object v7, La/cq5;->a:La/cq5;

    .line 314
    .line 315
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eqz v7, :cond_4

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 323
    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_5
    :goto_3
    iget-object v7, v1, La/lr5;->d:Ljava/lang/String;

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_6
    :goto_4
    iget-object v7, v1, La/lr5;->b:Ljava/lang/String;

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_7
    :goto_5
    iget-object v7, v1, La/lr5;->c:Ljava/lang/String;

    .line 333
    .line 334
    :goto_6
    invoke-direct {v6, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    iget-object v8, v1, La/lr5;->e:Ljava/lang/String;

    .line 338
    .line 339
    iget-object v9, v1, La/lr5;->f:Ljava/lang/String;

    .line 340
    .line 341
    const/4 v10, 0x0

    .line 342
    const/16 v11, 0x44

    .line 343
    .line 344
    const/4 v7, 0x0

    .line 345
    invoke-direct/range {v4 .. v11}, La/fr5;-><init>(ILa/n0x;La/n0x;Ljava/lang/String;Ljava/lang/String;La/er5;I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_8
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-direct {v0, p0, p1}, La/hu80;-><init>(La/lq5;La/a4x;)V

    .line 357
    .line 358
    .line 359
    move-object v2, v0

    .line 360
    goto :goto_7

    .line 361
    :cond_9
    sget-object v0, La/fu80;->a:La/fu80;

    .line 362
    .line 363
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_a

    .line 368
    .line 369
    new-instance v2, La/ju80;

    .line 370
    .line 371
    invoke-direct {v2, p0}, La/ju80;-><init>(La/lq5;)V

    .line 372
    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_a
    sget-object v0, La/eu80;->a:La/eu80;

    .line 376
    .line 377
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result p1

    .line 381
    if-eqz p1, :cond_b

    .line 382
    .line 383
    new-instance v2, La/iu80;

    .line 384
    .line 385
    invoke-direct {v2, p0}, La/iu80;-><init>(La/lq5;)V

    .line 386
    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 390
    .line 391
    .line 392
    :goto_7
    return-object v2

    .line 393
    :pswitch_1
    iget-object v0, p0, La/gv80;->p:La/n0o0;

    .line 394
    .line 395
    check-cast p1, Ljava/lang/Boolean;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    if-eqz p1, :cond_f

    .line 402
    .line 403
    iget-object p1, p0, La/gv80;->m:La/n0o0;

    .line 404
    .line 405
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    check-cast p1, La/fee;

    .line 410
    .line 411
    iget-object p0, p0, La/gv80;->a:La/ctf0;

    .line 412
    .line 413
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    check-cast p1, La/ql5;

    .line 418
    .line 419
    const v1, 0x7f1315e0

    .line 420
    .line 421
    .line 422
    const/4 v2, 0x0

    .line 423
    if-nez p1, :cond_c

    .line 424
    .line 425
    new-instance p1, La/lt80;

    .line 426
    .line 427
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v0, La/fee;

    .line 432
    .line 433
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, La/ijl;

    .line 438
    .line 439
    new-instance v3, La/jjl;

    .line 440
    .line 441
    new-array v4, v2, [Ljava/lang/Object;

    .line 442
    .line 443
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 444
    .line 445
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {p0, v1, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    const-string v1, ""

    .line 454
    .line 455
    invoke-direct {v3, v1, v1, p0, v1}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-direct {p1, v0, v3}, La/lt80;-><init>(La/ijl;La/jjl;)V

    .line 459
    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_c
    iget-object v3, p1, La/ql5;->j:Ljava/lang/String;

    .line 463
    .line 464
    new-instance v4, La/kt80;

    .line 465
    .line 466
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    check-cast v5, La/fee;

    .line 471
    .line 472
    invoke-virtual {v5}, La/fee;->b()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    check-cast v5, La/ijl;

    .line 477
    .line 478
    new-instance v6, La/jjl;

    .line 479
    .line 480
    sget-object v7, La/pn40;->a:La/pn40;

    .line 481
    .line 482
    iget-wide v7, p1, La/ql5;->b:D

    .line 483
    .line 484
    sget-object v9, La/p3u0;->c:La/p3u0;

    .line 485
    .line 486
    invoke-static {v7, v8, v9}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    iget-object v8, p1, La/ql5;->f:Ljava/lang/String;

    .line 491
    .line 492
    new-array v9, v2, [Ljava/lang/Object;

    .line 493
    .line 494
    iget-object v10, p0, La/ctf0;->b:La/lsm0;

    .line 495
    .line 496
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    invoke-virtual {v10, v1, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    check-cast v0, La/fee;

    .line 509
    .line 510
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    check-cast v0, La/ijl;

    .line 515
    .line 516
    sget-object v9, La/ijl;->b:La/ijl;

    .line 517
    .line 518
    if-ne v0, v9, :cond_d

    .line 519
    .line 520
    new-array p1, v2, [Ljava/lang/Object;

    .line 521
    .line 522
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 523
    .line 524
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    const v0, 0x7f1300e5

    .line 529
    .line 530
    .line 531
    invoke-virtual {p0, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    goto :goto_8

    .line 536
    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 537
    .line 538
    .line 539
    move-result p0

    .line 540
    if-lez p0, :cond_e

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_e
    iget-object v3, p1, La/ql5;->k:Ljava/lang/String;

    .line 544
    .line 545
    :goto_8
    invoke-direct {v6, v7, v8, v1, v3}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-direct {v4, v5, v6}, La/kt80;-><init>(La/ijl;La/jjl;)V

    .line 549
    .line 550
    .line 551
    move-object p1, v4

    .line 552
    goto :goto_9

    .line 553
    :cond_f
    sget-object p1, La/nt80;->a:La/nt80;

    .line 554
    .line 555
    :goto_9
    return-object p1

    .line 556
    :pswitch_2
    check-cast p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    new-instance v0, La/imm;

    .line 562
    .line 563
    new-instance v1, La/ilm;

    .line 564
    .line 565
    iget-object v2, p0, La/gv80;->a:La/ctf0;

    .line 566
    .line 567
    const v3, 0x7f040b0b

    .line 568
    .line 569
    .line 570
    invoke-static {v3, v2}, La/ctf0;->b(ILa/ctf0;)I

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    invoke-static {v4}, La/fbc;->d(I)J

    .line 575
    .line 576
    .line 577
    move-result-wide v4

    .line 578
    invoke-direct {v1, v4, v5}, La/ilm;-><init>(J)V

    .line 579
    .line 580
    .line 581
    move-object v4, v2

    .line 582
    new-instance v2, La/plm;

    .line 583
    .line 584
    iget-object p1, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->a:Ljava/lang/String;

    .line 585
    .line 586
    invoke-static {v3, v4}, La/ctf0;->b(ILa/ctf0;)I

    .line 587
    .line 588
    .line 589
    move-result v5

    .line 590
    invoke-static {v5}, La/fbc;->d(I)J

    .line 591
    .line 592
    .line 593
    move-result-wide v5

    .line 594
    sget-object v7, La/fa50;->a:La/fa50;

    .line 595
    .line 596
    invoke-direct {v2, p1, v5, v6, v7}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 597
    .line 598
    .line 599
    iget-object p0, p0, La/gv80;->i:La/n0o0;

    .line 600
    .line 601
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    check-cast p1, La/fee;

    .line 606
    .line 607
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    check-cast p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 612
    .line 613
    iget-object p1, p1, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 614
    .line 615
    instance-of p1, p1, La/im1;

    .line 616
    .line 617
    if-eqz p1, :cond_10

    .line 618
    .line 619
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    check-cast p0, La/fee;

    .line 624
    .line 625
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    check-cast p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 630
    .line 631
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;->d:La/tm1;

    .line 632
    .line 633
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    check-cast p0, La/im1;

    .line 637
    .line 638
    iget-boolean p0, p0, La/im1;->a:Z

    .line 639
    .line 640
    if-eqz p0, :cond_10

    .line 641
    .line 642
    sget-object p0, La/fmm;->a:La/fmm;

    .line 643
    .line 644
    :goto_a
    move-object v3, p0

    .line 645
    goto :goto_b

    .line 646
    :cond_10
    new-instance p0, La/dmm;

    .line 647
    .line 648
    new-instance p1, La/ta50;

    .line 649
    .line 650
    new-instance v5, La/wkm;

    .line 651
    .line 652
    invoke-static {v3, v4}, La/ctf0;->b(ILa/ctf0;)I

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    invoke-static {v3}, La/fbc;->d(I)J

    .line 657
    .line 658
    .line 659
    move-result-wide v10

    .line 660
    const/4 v6, 0x0

    .line 661
    const v7, 0x7f0809ee

    .line 662
    .line 663
    .line 664
    const/4 v8, 0x1

    .line 665
    sget-object v9, La/ra50;->a:La/ra50;

    .line 666
    .line 667
    invoke-direct/range {v5 .. v11}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 668
    .line 669
    .line 670
    invoke-direct {p1, v5}, La/ta50;-><init>(La/wkm;)V

    .line 671
    .line 672
    .line 673
    invoke-direct {p0, p1}, La/dmm;-><init>(La/wa50;)V

    .line 674
    .line 675
    .line 676
    goto :goto_a

    .line 677
    :goto_b
    const p0, 0x7f040ae3

    .line 678
    .line 679
    .line 680
    invoke-static {p0, v4}, La/ctf0;->b(ILa/ctf0;)I

    .line 681
    .line 682
    .line 683
    move-result p0

    .line 684
    invoke-static {p0}, La/fbc;->d(I)J

    .line 685
    .line 686
    .line 687
    move-result-wide v4

    .line 688
    const/4 v6, 0x0

    .line 689
    const/4 v7, 0x0

    .line 690
    invoke-direct/range {v0 .. v7}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 691
    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 695
    .line 696
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object p1, p0, La/gv80;->c:La/n0o0;

    .line 700
    .line 701
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    check-cast p1, La/fee;

    .line 706
    .line 707
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    check-cast p1, Ljava/lang/Boolean;

    .line 712
    .line 713
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 714
    .line 715
    .line 716
    move-result p1

    .line 717
    if-eqz p1, :cond_11

    .line 718
    .line 719
    new-instance p1, La/bv80;

    .line 720
    .line 721
    iget-object p0, p0, La/gv80;->o:La/n0o0;

    .line 722
    .line 723
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object p0

    .line 727
    check-cast p0, La/fee;

    .line 728
    .line 729
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object p0

    .line 733
    check-cast p0, La/mdm;

    .line 734
    .line 735
    invoke-direct {p1, p0}, La/bv80;-><init>(La/mdm;)V

    .line 736
    .line 737
    .line 738
    goto :goto_c

    .line 739
    :cond_11
    iget-object p1, p0, La/gv80;->d:La/n0o0;

    .line 740
    .line 741
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    check-cast p1, La/fee;

    .line 746
    .line 747
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object p1

    .line 751
    check-cast p1, Ljava/lang/Boolean;

    .line 752
    .line 753
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 754
    .line 755
    .line 756
    move-result p1

    .line 757
    if-eqz p1, :cond_12

    .line 758
    .line 759
    new-instance p1, La/av80;

    .line 760
    .line 761
    iget-object p0, p0, La/gv80;->n:La/n0o0;

    .line 762
    .line 763
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object p0

    .line 767
    check-cast p0, La/fee;

    .line 768
    .line 769
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object p0

    .line 773
    check-cast p0, La/mdm;

    .line 774
    .line 775
    invoke-direct {p1, p0}, La/av80;-><init>(La/mdm;)V

    .line 776
    .line 777
    .line 778
    goto :goto_c

    .line 779
    :cond_12
    new-instance p1, La/zu80;

    .line 780
    .line 781
    iget-object p0, p0, La/gv80;->v:La/n0o0;

    .line 782
    .line 783
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object p0

    .line 787
    check-cast p0, La/fee;

    .line 788
    .line 789
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object p0

    .line 793
    check-cast p0, La/bml;

    .line 794
    .line 795
    invoke-direct {p1, p0}, La/zu80;-><init>(La/bml;)V

    .line 796
    .line 797
    .line 798
    :goto_c
    return-object p1

    .line 799
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
