.class public final synthetic La/rx60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rw;


# direct methods
.method public synthetic constructor <init>(La/rw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rx60;->a:B

    iput-object p1, p0, La/rx60;->b:La/rw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rx60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v0, v0, La/rx60;->b:La/rw;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/cfp;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, v1, La/cfp;->a:Ljava/util/List;

    .line 20
    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 24
    .line 25
    const v4, 0x7f0807c1

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v4, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/16 v5, 0xa

    .line 38
    .line 39
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_4

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, La/pbv;

    .line 61
    .line 62
    iget-object v6, v5, La/pbv;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v12, v5, La/pbv;->c:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v7, v5, La/pbv;->d:La/hcs;

    .line 67
    .line 68
    iget-boolean v9, v5, La/pbv;->o:Z

    .line 69
    .line 70
    iget-object v10, v5, La/pbv;->n:La/hds;

    .line 71
    .line 72
    invoke-static {v6}, La/wvb;->O(Ljava/lang/String;)D

    .line 73
    .line 74
    .line 75
    move-result-wide v13

    .line 76
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    .line 77
    .line 78
    cmpl-double v6, v13, v15

    .line 79
    .line 80
    if-lez v6, :cond_0

    .line 81
    .line 82
    new-instance v6, La/y9n;

    .line 83
    .line 84
    new-array v13, v3, [Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v14, v0, La/ctf0;->b:La/lsm0;

    .line 87
    .line 88
    invoke-static {v13, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    const v15, 0x7f131812

    .line 93
    .line 94
    .line 95
    invoke-virtual {v14, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    sget-object v14, La/pn40;->a:La/pn40;

    .line 100
    .line 101
    iget-object v14, v5, La/pbv;->f:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v14}, La/wvb;->O(Ljava/lang/String;)D

    .line 104
    .line 105
    .line 106
    move-result-wide v14

    .line 107
    sget-object v11, La/p3u0;->c:La/p3u0;

    .line 108
    .line 109
    invoke-static {v14, v15, v11}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    const-string v14, "x"

    .line 114
    .line 115
    invoke-virtual {v14, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-direct {v6, v13, v11}, La/y9n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    move-object v11, v6

    .line 123
    goto :goto_1

    .line 124
    :cond_0
    const/4 v11, 0x0

    .line 125
    :goto_1
    new-instance v13, La/l9n;

    .line 126
    .line 127
    iget-wide v14, v5, La/pbv;->a:J

    .line 128
    .line 129
    iget-boolean v5, v5, La/pbv;->p:Z

    .line 130
    .line 131
    if-eqz v5, :cond_2

    .line 132
    .line 133
    if-eqz v9, :cond_1

    .line 134
    .line 135
    sget-object v11, La/p9n;->f:La/p9n;

    .line 136
    .line 137
    move-object v9, v11

    .line 138
    goto :goto_2

    .line 139
    :cond_1
    const/4 v9, 0x0

    .line 140
    :goto_2
    invoke-static {v7}, La/cww;->K(La/hcs;)La/p9n;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    new-instance v6, La/n0x;

    .line 145
    .line 146
    iget-object v7, v10, La/hds;->a:Ljava/lang/String;

    .line 147
    .line 148
    invoke-direct {v6, v7}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v7, La/n0x;

    .line 152
    .line 153
    iget-object v10, v10, La/hds;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v10}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-direct {v7, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    move-object v10, v5

    .line 163
    new-instance v5, La/t9n;

    .line 164
    .line 165
    invoke-direct/range {v5 .. v10}, La/t9n;-><init>(La/o0x;La/o0x;Ljava/lang/Integer;La/p9n;La/p9n;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_2
    new-instance v6, La/n0x;

    .line 170
    .line 171
    iget-object v5, v10, La/hds;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-direct {v6, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move-object v5, v7

    .line 177
    new-instance v7, La/n0x;

    .line 178
    .line 179
    iget-object v10, v10, La/hds;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v10}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-direct {v7, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    if-eqz v9, :cond_3

    .line 189
    .line 190
    sget-object v9, La/p9n;->f:La/p9n;

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_3
    const/4 v9, 0x0

    .line 194
    :goto_3
    invoke-static {v5}, La/cww;->K(La/hcs;)La/p9n;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    new-instance v5, La/u9n;

    .line 199
    .line 200
    invoke-direct/range {v5 .. v11}, La/u9n;-><init>(La/o0x;La/o0x;Ljava/lang/Integer;La/p9n;La/p9n;La/y9n;)V

    .line 201
    .line 202
    .line 203
    :goto_4
    new-instance v6, La/g9n;

    .line 204
    .line 205
    invoke-direct {v6, v12, v2}, La/g9n;-><init>(Ljava/lang/String;Z)V

    .line 206
    .line 207
    .line 208
    invoke-direct {v13, v14, v15, v5, v6}, La/l9n;-><init>(JLa/x9n;La/j9n;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_4
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    new-instance v1, La/ftr;

    .line 221
    .line 222
    invoke-direct {v1, v0}, La/ftr;-><init>(La/a4x;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_5
    new-instance v1, La/gtr;

    .line 227
    .line 228
    invoke-direct {v1, v2}, La/gtr;-><init>(Z)V

    .line 229
    .line 230
    .line 231
    :goto_5
    return-object v1

    .line 232
    :pswitch_0
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, La/kg;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    new-instance v4, La/imm;

    .line 240
    .line 241
    new-instance v5, La/ilm;

    .line 242
    .line 243
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 244
    .line 245
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 250
    .line 251
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 252
    .line 253
    .line 254
    move-result-wide v1

    .line 255
    invoke-direct {v5, v1, v2}, La/ilm;-><init>(J)V

    .line 256
    .line 257
    .line 258
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 259
    .line 260
    new-array v1, v3, [Ljava/lang/Object;

    .line 261
    .line 262
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 263
    .line 264
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const v2, 0x7f13086b

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 280
    .line 281
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 282
    .line 283
    .line 284
    move-result-wide v9

    .line 285
    sget-object v8, La/ha50;->b:La/ha50;

    .line 286
    .line 287
    new-instance v6, La/plm;

    .line 288
    .line 289
    sget-object v11, La/fa50;->a:La/fa50;

    .line 290
    .line 291
    invoke-direct/range {v6 .. v11}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 292
    .line 293
    .line 294
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 299
    .line 300
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 301
    .line 302
    .line 303
    move-result-wide v8

    .line 304
    const/4 v10, 0x0

    .line 305
    const/4 v11, 0x0

    .line 306
    sget-object v7, La/fmm;->a:La/fmm;

    .line 307
    .line 308
    invoke-direct/range {v4 .. v11}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 309
    .line 310
    .line 311
    new-instance v0, La/cd50;

    .line 312
    .line 313
    invoke-direct {v0, v4}, La/cd50;-><init>(La/imm;)V

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_1
    move-object/from16 v1, p1

    .line 318
    .line 319
    check-cast v1, La/gep;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    new-instance v4, La/in5;

    .line 325
    .line 326
    iget-boolean v13, v1, La/gep;->d:Z

    .line 327
    .line 328
    iget-object v5, v0, La/rw;->c:La/n0o0;

    .line 329
    .line 330
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    check-cast v5, La/fee;

    .line 335
    .line 336
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    check-cast v5, Ljava/lang/Boolean;

    .line 341
    .line 342
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    xor-int/lit8 v14, v5, 0x1

    .line 347
    .line 348
    iget-object v7, v1, La/gep;->b:Ljava/lang/String;

    .line 349
    .line 350
    iget-object v8, v1, La/gep;->c:Ljava/lang/String;

    .line 351
    .line 352
    iget-object v9, v1, La/gep;->a:Ljava/lang/String;

    .line 353
    .line 354
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 355
    .line 356
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 361
    .line 362
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 363
    .line 364
    .line 365
    move-result-wide v5

    .line 366
    iget-object v0, v0, La/rw;->b:La/ctf0;

    .line 367
    .line 368
    new-array v1, v3, [Ljava/lang/Object;

    .line 369
    .line 370
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 371
    .line 372
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    const v10, 0x7f1302fa

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v10, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    new-array v1, v3, [Ljava/lang/Object;

    .line 384
    .line 385
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 386
    .line 387
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    const v2, 0x7f13112e

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    new-array v1, v3, [Ljava/lang/Object;

    .line 399
    .line 400
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    const v2, 0x7f1315e0

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v12

    .line 411
    invoke-direct/range {v4 .. v14}, La/in5;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 412
    .line 413
    .line 414
    return-object v4

    .line 415
    :pswitch_2
    iget-object v0, v0, La/rw;->k:Ljava/lang/Object;

    .line 416
    .line 417
    move-object v1, v0

    .line 418
    check-cast v1, La/g2v;

    .line 419
    .line 420
    move-object/from16 v0, p1

    .line 421
    .line 422
    check-cast v0, Ljava/lang/Throwable;

    .line 423
    .line 424
    if-nez v0, :cond_6

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_6
    instance-of v2, v0, La/j7t0;

    .line 428
    .line 429
    if-eqz v2, :cond_7

    .line 430
    .line 431
    sget-object v2, La/pb10;->g:La/pb10;

    .line 432
    .line 433
    sget-object v3, La/pdm;->a:La/pdm;

    .line 434
    .line 435
    sget-object v4, La/ldm;->a:La/ldm;

    .line 436
    .line 437
    const-wide/16 v12, 0x0

    .line 438
    .line 439
    const/16 v14, 0x3d0

    .line 440
    .line 441
    const v5, 0x7f080836

    .line 442
    .line 443
    .line 444
    const/4 v6, 0x0

    .line 445
    const v7, 0x7f1316f2

    .line 446
    .line 447
    .line 448
    const/4 v8, 0x0

    .line 449
    const/4 v9, 0x0

    .line 450
    const-wide/16 v10, 0x0

    .line 451
    .line 452
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    goto :goto_8

    .line 457
    :cond_7
    instance-of v2, v0, La/sq60;

    .line 458
    .line 459
    if-eqz v2, :cond_8

    .line 460
    .line 461
    sget-object v2, La/pb10;->r1:La/pb10;

    .line 462
    .line 463
    sget-object v3, La/pdm;->b:La/pdm;

    .line 464
    .line 465
    const-wide/16 v12, 0x0

    .line 466
    .line 467
    const/16 v14, 0x354

    .line 468
    .line 469
    const/4 v4, 0x0

    .line 470
    const v5, 0x7f080836

    .line 471
    .line 472
    .line 473
    const/4 v6, 0x0

    .line 474
    const v7, 0x7f13095d

    .line 475
    .line 476
    .line 477
    const/4 v8, 0x0

    .line 478
    const v9, 0x7f1304f9

    .line 479
    .line 480
    .line 481
    const-wide/16 v10, 0x0

    .line 482
    .line 483
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    goto :goto_8

    .line 488
    :cond_8
    instance-of v2, v0, Ljava/net/SocketTimeoutException;

    .line 489
    .line 490
    if-eqz v2, :cond_9

    .line 491
    .line 492
    goto :goto_6

    .line 493
    :cond_9
    instance-of v0, v0, Ljava/net/UnknownHostException;

    .line 494
    .line 495
    if-eqz v0, :cond_a

    .line 496
    .line 497
    :goto_6
    sget-object v2, La/pb10;->g:La/pb10;

    .line 498
    .line 499
    sget-object v3, La/pdm;->a:La/pdm;

    .line 500
    .line 501
    sget-object v4, La/ldm;->a:La/ldm;

    .line 502
    .line 503
    const-wide/16 v12, 0x0

    .line 504
    .line 505
    const/16 v14, 0x200

    .line 506
    .line 507
    const/4 v5, 0x0

    .line 508
    const v6, 0x7f130792

    .line 509
    .line 510
    .line 511
    const v7, 0x7f130677

    .line 512
    .line 513
    .line 514
    const v8, 0x7f130792

    .line 515
    .line 516
    .line 517
    const v9, 0x7f131690

    .line 518
    .line 519
    .line 520
    const-wide/16 v10, 0x2710

    .line 521
    .line 522
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    goto :goto_8

    .line 527
    :cond_a
    :goto_7
    sget-object v2, La/pb10;->g:La/pb10;

    .line 528
    .line 529
    sget-object v3, La/pdm;->a:La/pdm;

    .line 530
    .line 531
    sget-object v4, La/ldm;->a:La/ldm;

    .line 532
    .line 533
    const-wide/16 v12, 0x0

    .line 534
    .line 535
    const/16 v14, 0x200

    .line 536
    .line 537
    const/4 v5, 0x0

    .line 538
    const v6, 0x7f130792

    .line 539
    .line 540
    .line 541
    const v7, 0x7f130677

    .line 542
    .line 543
    .line 544
    const v8, 0x7f130792

    .line 545
    .line 546
    .line 547
    const v9, 0x7f131690

    .line 548
    .line 549
    .line 550
    const-wide/16 v10, 0x2710

    .line 551
    .line 552
    invoke-static/range {v1 .. v14}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    :goto_8
    return-object v0

    .line 557
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
