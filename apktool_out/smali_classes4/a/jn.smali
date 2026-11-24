.class public final synthetic La/jn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kn;


# direct methods
.method public synthetic constructor <init>(La/kn;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jn;->a:B

    iput-object p1, p0, La/jn;->b:La/kn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jn;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/jn;->b:La/kn;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/ln;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v5, v1, La/ln;->b:La/j0g0;

    .line 22
    .line 23
    iget-object v1, v1, La/ln;->d:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 28
    .line 29
    instance-of v6, v5, La/g0g0;

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    move-object v5, v3

    .line 34
    :cond_0
    check-cast v5, Ljava/util/List;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v5, v3

    .line 38
    :goto_0
    if-nez v5, :cond_2

    .line 39
    .line 40
    sget-object v5, La/iun;->a:La/iun;

    .line 41
    .line 42
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_5

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    move-object v8, v7

    .line 62
    check-cast v8, La/bm;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-nez v9, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget-object v8, v8, La/bm;->b:Ljava/lang/String;

    .line 72
    .line 73
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 74
    .line 75
    invoke-static {v8, v9, v1, v4}, La/vqd;->A(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    :goto_2
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v6, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    add-int/lit8 v6, v4, 0x1

    .line 109
    .line 110
    if-ltz v4, :cond_6

    .line 111
    .line 112
    check-cast v5, La/bm;

    .line 113
    .line 114
    iget-object v7, v0, La/kn;->a:La/ctf0;

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v8, La/fm;

    .line 123
    .line 124
    iget-wide v9, v5, La/bm;->a:J

    .line 125
    .line 126
    iget-object v11, v5, La/bm;->b:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v12, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    new-instance v12, La/zrm;

    .line 147
    .line 148
    new-instance v13, La/b2l0;

    .line 149
    .line 150
    const v9, 0x7f040b72

    .line 151
    .line 152
    .line 153
    invoke-static {v9, v7}, La/ctf0;->b(ILa/ctf0;)I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    invoke-static {v9}, La/fbc;->d(I)J

    .line 158
    .line 159
    .line 160
    move-result-wide v9

    .line 161
    invoke-direct {v13, v11, v9, v10}, La/b2l0;-><init>(Ljava/lang/String;J)V

    .line 162
    .line 163
    .line 164
    new-instance v14, La/t1l0;

    .line 165
    .line 166
    sget-object v15, La/p1l0;->f:La/p1l0;

    .line 167
    .line 168
    const v9, 0x7f040b10

    .line 169
    .line 170
    .line 171
    invoke-static {v9, v7}, La/ctf0;->b(ILa/ctf0;)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    invoke-static {v7}, La/fbc;->d(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v9

    .line 179
    new-instance v7, La/y3d;

    .line 180
    .line 181
    invoke-direct {v7, v9, v10}, La/y3d;-><init>(J)V

    .line 182
    .line 183
    .line 184
    iget-object v5, v5, La/bm;->c:Ljava/lang/String;

    .line 185
    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    const/16 v21, 0xf8

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    move-object/from16 v17, v5

    .line 195
    .line 196
    move-object/from16 v16, v7

    .line 197
    .line 198
    invoke-direct/range {v14 .. v21}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 199
    .line 200
    .line 201
    new-instance v5, La/l3l0;

    .line 202
    .line 203
    sget-object v7, La/qmk;->a:La/zcl;

    .line 204
    .line 205
    const/high16 v7, 0x41800000    # 16.0f

    .line 206
    .line 207
    invoke-direct {v5, v7}, La/l3l0;-><init>(F)V

    .line 208
    .line 209
    .line 210
    const/16 v18, 0x2c

    .line 211
    .line 212
    const/4 v15, 0x0

    .line 213
    const/16 v16, 0x0

    .line 214
    .line 215
    move-object/from16 v17, v5

    .line 216
    .line 217
    invoke-direct/range {v12 .. v18}, La/zrm;-><init>(La/f2l0;La/u1l0;La/g3l0;La/d4d;La/n3l0;I)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v8, v4, v12}, La/fm;-><init>(Ljava/lang/String;La/zrm;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move v4, v6

    .line 227
    goto/16 :goto_3

    .line 228
    .line 229
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 230
    .line 231
    .line 232
    throw v3

    .line 233
    :cond_7
    return-object v1

    .line 234
    :pswitch_0
    move-object/from16 v1, p1

    .line 235
    .line 236
    check-cast v1, La/ln;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-boolean v5, v1, La/ln;->c:Z

    .line 242
    .line 243
    iget-object v6, v1, La/ln;->d:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v0, v0, La/kn;->a:La/ctf0;

    .line 246
    .line 247
    iget-object v7, v1, La/ln;->b:La/j0g0;

    .line 248
    .line 249
    iget-boolean v1, v1, La/ln;->a:Z

    .line 250
    .line 251
    const/4 v8, 0x1

    .line 252
    if-eqz v7, :cond_a

    .line 253
    .line 254
    iget-object v9, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 255
    .line 256
    instance-of v10, v9, La/g0g0;

    .line 257
    .line 258
    xor-int/lit8 v11, v10, 0x1

    .line 259
    .line 260
    if-ne v11, v8, :cond_a

    .line 261
    .line 262
    if-eqz v10, :cond_8

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    move-object v3, v9

    .line 266
    :goto_4
    check-cast v3, Ljava/util/Collection;

    .line 267
    .line 268
    if-eqz v3, :cond_9

    .line 269
    .line 270
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_a

    .line 275
    .line 276
    :cond_9
    move v3, v8

    .line 277
    goto :goto_5

    .line 278
    :cond_a
    move v3, v4

    .line 279
    :goto_5
    if-nez v7, :cond_b

    .line 280
    .line 281
    if-nez v1, :cond_e

    .line 282
    .line 283
    :cond_b
    if-eqz v7, :cond_c

    .line 284
    .line 285
    iget-object v9, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 286
    .line 287
    instance-of v9, v9, La/g0g0;

    .line 288
    .line 289
    if-ne v9, v8, :cond_c

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_c
    if-nez v3, :cond_d

    .line 293
    .line 294
    if-nez v7, :cond_f

    .line 295
    .line 296
    :cond_d
    if-nez v1, :cond_f

    .line 297
    .line 298
    :cond_e
    :goto_6
    move v1, v8

    .line 299
    goto :goto_7

    .line 300
    :cond_f
    move v1, v4

    .line 301
    :goto_7
    xor-int/lit8 v12, v1, 0x1

    .line 302
    .line 303
    new-array v1, v4, [Ljava/lang/Object;

    .line 304
    .line 305
    iget-object v3, v0, La/ctf0;->b:La/lsm0;

    .line 306
    .line 307
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    const v7, 0x7f130053

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v7, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    new-array v3, v4, [Ljava/lang/Object;

    .line 319
    .line 320
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 321
    .line 322
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    const v7, 0x7f1311bf

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-eqz v5, :cond_10

    .line 334
    .line 335
    new-instance v13, La/imm;

    .line 336
    .line 337
    new-instance v14, La/ilm;

    .line 338
    .line 339
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 340
    .line 341
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 346
    .line 347
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 348
    .line 349
    .line 350
    move-result-wide v7

    .line 351
    invoke-direct {v14, v7, v8}, La/ilm;-><init>(J)V

    .line 352
    .line 353
    .line 354
    new-instance v15, La/nlm;

    .line 355
    .line 356
    new-instance v1, La/hmm;

    .line 357
    .line 358
    invoke-direct {v1, v2, v6, v0, v4}, La/hmm;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 359
    .line 360
    .line 361
    invoke-direct {v15, v1}, La/nlm;-><init>(La/hmm;)V

    .line 362
    .line 363
    .line 364
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 369
    .line 370
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 371
    .line 372
    .line 373
    move-result-wide v17

    .line 374
    const/16 v19, 0x1

    .line 375
    .line 376
    const/16 v20, 0x0

    .line 377
    .line 378
    sget-object v16, La/fmm;->a:La/fmm;

    .line 379
    .line 380
    invoke-direct/range {v13 .. v20}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 381
    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_10
    new-instance v0, La/imm;

    .line 385
    .line 386
    new-instance v2, La/ilm;

    .line 387
    .line 388
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 389
    .line 390
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 395
    .line 396
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 397
    .line 398
    .line 399
    move-result-wide v3

    .line 400
    invoke-direct {v2, v3, v4}, La/ilm;-><init>(J)V

    .line 401
    .line 402
    .line 403
    move-object v3, v2

    .line 404
    new-instance v2, La/plm;

    .line 405
    .line 406
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 411
    .line 412
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 413
    .line 414
    .line 415
    move-result-wide v4

    .line 416
    sget-object v6, La/fa50;->a:La/fa50;

    .line 417
    .line 418
    invoke-direct {v2, v1, v4, v5, v6}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 419
    .line 420
    .line 421
    move-object v1, v3

    .line 422
    new-instance v3, La/dmm;

    .line 423
    .line 424
    new-instance v4, La/ta50;

    .line 425
    .line 426
    new-instance v9, La/wkm;

    .line 427
    .line 428
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 433
    .line 434
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 435
    .line 436
    .line 437
    move-result-wide v14

    .line 438
    const/4 v10, 0x1

    .line 439
    const v11, 0x7f0809ee

    .line 440
    .line 441
    .line 442
    sget-object v13, La/ra50;->a:La/ra50;

    .line 443
    .line 444
    invoke-direct/range {v9 .. v15}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 445
    .line 446
    .line 447
    invoke-direct {v4, v9}, La/ta50;-><init>(La/wkm;)V

    .line 448
    .line 449
    .line 450
    invoke-direct {v3, v4}, La/dmm;-><init>(La/wa50;)V

    .line 451
    .line 452
    .line 453
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 458
    .line 459
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 460
    .line 461
    .line 462
    move-result-wide v4

    .line 463
    const/4 v6, 0x1

    .line 464
    const/4 v7, 0x0

    .line 465
    invoke-direct/range {v0 .. v7}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 466
    .line 467
    .line 468
    move-object v13, v0

    .line 469
    :goto_8
    return-object v13

    .line 470
    nop

    .line 471
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
