.class public final synthetic La/pu80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dv80;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/dv80;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pu80;->a:B

    iput-object p1, p0, La/pu80;->b:La/dv80;

    iput-object p2, p0, La/pu80;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pu80;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/pu80;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object v0, v0, La/pu80;->b:La/dv80;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    move-object/from16 v13, p1

    .line 15
    .line 16
    check-cast v13, La/fet;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v7, v1, 0x3

    .line 30
    .line 31
    if-eq v7, v2, :cond_0

    .line 32
    .line 33
    move v2, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v6

    .line 36
    :goto_0
    and-int/2addr v1, v4

    .line 37
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_f

    .line 42
    .line 43
    sget-object v1, La/uc9;->c:La/mw3;

    .line 44
    .line 45
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 46
    .line 47
    invoke-static {v1, v2, v13, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-wide v7, v13, La/fet;->T:J

    .line 52
    .line 53
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v13}, La/fet;->m()La/bh90;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    sget-object v8, La/jm40;->b:La/jm40;

    .line 62
    .line 63
    invoke-static {v13, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 68
    .line 69
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v13}, La/fet;->i0()V

    .line 73
    .line 74
    .line 75
    iget-boolean v10, v13, La/fet;->S:Z

    .line 76
    .line 77
    if-eqz v10, :cond_1

    .line 78
    .line 79
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 80
    .line 81
    invoke-virtual {v13, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v13}, La/fet;->r0()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v10, La/gqw0;->x:La/shd;

    .line 89
    .line 90
    invoke-static {v13, v1, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    sget-object v1, La/gqw0;->w:La/shd;

    .line 94
    .line 95
    invoke-static {v13, v7, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v2, La/gqw0;->y:La/shd;

    .line 103
    .line 104
    invoke-static {v13, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v13}, La/jpm0;->n(La/fet;)V

    .line 108
    .line 109
    .line 110
    sget-object v1, La/gqw0;->v:La/shd;

    .line 111
    .line 112
    invoke-static {v13, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, La/dv80;->c:La/ot80;

    .line 116
    .line 117
    iget-object v0, v0, La/dv80;->e:La/ku80;

    .line 118
    .line 119
    instance-of v2, v1, La/mt80;

    .line 120
    .line 121
    if-eqz v2, :cond_8

    .line 122
    .line 123
    const v2, 0x5338aa81

    .line 124
    .line 125
    .line 126
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 127
    .line 128
    .line 129
    check-cast v1, La/mt80;

    .line 130
    .line 131
    invoke-interface {v1}, La/mt80;->a()La/ijl;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-interface {v1}, La/mt80;->b()La/jjl;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    if-nez v2, :cond_2

    .line 148
    .line 149
    if-ne v9, v3, :cond_3

    .line 150
    .line 151
    :cond_2
    new-instance v9, La/ma70;

    .line 152
    .line 153
    const/16 v2, 0x1c

    .line 154
    .line 155
    invoke-direct {v9, v5, v2}, La/ma70;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v13, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_3
    move-object v10, v9

    .line 162
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 163
    .line 164
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    if-nez v2, :cond_4

    .line 173
    .line 174
    if-ne v9, v3, :cond_5

    .line 175
    .line 176
    :cond_4
    new-instance v9, La/ma70;

    .line 177
    .line 178
    const/16 v2, 0x1d

    .line 179
    .line 180
    invoke-direct {v9, v5, v2}, La/ma70;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v13, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_5
    move-object v11, v9

    .line 187
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 188
    .line 189
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    if-nez v2, :cond_6

    .line 198
    .line 199
    if-ne v9, v3, :cond_7

    .line 200
    .line 201
    :cond_6
    new-instance v9, La/qu80;

    .line 202
    .line 203
    invoke-direct {v9, v5, v6}, La/qu80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v13, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    move-object v12, v9

    .line 210
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x4

    .line 214
    const/4 v9, 0x0

    .line 215
    move-object/from16 v20, v8

    .line 216
    .line 217
    move-object v8, v1

    .line 218
    move-object/from16 v1, v20

    .line 219
    .line 220
    invoke-static/range {v7 .. v15}, La/feb;->k(La/ijl;La/jjl;La/gjl;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_8
    move-object v1, v8

    .line 228
    const v2, 0x53447866

    .line 229
    .line 230
    .line 231
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 235
    .line 236
    .line 237
    :goto_2
    const/4 v11, 0x6

    .line 238
    const/4 v12, 0x6

    .line 239
    sget-object v7, La/zfi0;->a:La/zfi0;

    .line 240
    .line 241
    const/4 v8, 0x0

    .line 242
    const/4 v9, 0x0

    .line 243
    move-object v10, v13

    .line 244
    invoke-static/range {v7 .. v12}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 245
    .line 246
    .line 247
    instance-of v2, v0, La/hu80;

    .line 248
    .line 249
    if-eqz v2, :cond_9

    .line 250
    .line 251
    move-object v7, v0

    .line 252
    check-cast v7, La/hu80;

    .line 253
    .line 254
    iget-object v7, v7, La/hu80;->b:La/a4x;

    .line 255
    .line 256
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_a

    .line 261
    .line 262
    :cond_9
    instance-of v7, v0, La/ju80;

    .line 263
    .line 264
    if-eqz v7, :cond_e

    .line 265
    .line 266
    :cond_a
    const v7, 0x534aa167

    .line 267
    .line 268
    .line 269
    invoke-virtual {v13, v7}, La/fet;->e0(I)V

    .line 270
    .line 271
    .line 272
    sget-object v7, La/qmk;->a:La/zcl;

    .line 273
    .line 274
    const/high16 v18, 0x41000000    # 8.0f

    .line 275
    .line 276
    const/16 v19, 0x5

    .line 277
    .line 278
    const/4 v15, 0x0

    .line 279
    const/high16 v16, 0x41000000    # 8.0f

    .line 280
    .line 281
    const/16 v17, 0x0

    .line 282
    .line 283
    move-object v14, v1

    .line 284
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    if-eqz v2, :cond_b

    .line 289
    .line 290
    move-object v1, v0

    .line 291
    check-cast v1, La/hu80;

    .line 292
    .line 293
    iget-object v1, v1, La/hu80;->b:La/a4x;

    .line 294
    .line 295
    :goto_3
    move-object v8, v1

    .line 296
    goto :goto_4

    .line 297
    :cond_b
    sget-object v1, La/lak0;->c:La/lak0;

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :goto_4
    invoke-interface {v0}, La/ku80;->a()La/lq5;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    instance-of v10, v0, La/ju80;

    .line 305
    .line 306
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-nez v0, :cond_c

    .line 315
    .line 316
    if-ne v1, v3, :cond_d

    .line 317
    .line 318
    :cond_c
    new-instance v1, La/ru80;

    .line 319
    .line 320
    invoke-direct {v1, v5, v6}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_d
    move-object v15, v1

    .line 327
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 328
    .line 329
    const/16 v17, 0x0

    .line 330
    .line 331
    const/16 v18, 0xf0

    .line 332
    .line 333
    const/4 v11, 0x0

    .line 334
    const/4 v12, 0x0

    .line 335
    move-object/from16 v16, v13

    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const/4 v14, 0x0

    .line 339
    invoke-static/range {v7 .. v18}, La/etl;->e(La/mm40;La/a4x;La/lq5;ZLa/xcz;FILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v13, v16

    .line 343
    .line 344
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 345
    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_e
    const v0, 0x5359a1a6

    .line 349
    .line 350
    .line 351
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 355
    .line 356
    .line 357
    :goto_5
    invoke-virtual {v13, v4}, La/fet;->r(Z)V

    .line 358
    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_f
    invoke-virtual {v13}, La/fet;->X()V

    .line 362
    .line 363
    .line 364
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_0
    move-object/from16 v1, p2

    .line 368
    .line 369
    check-cast v1, Ljava/lang/Integer;

    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    and-int/lit8 v7, v1, 0x3

    .line 376
    .line 377
    if-eq v7, v2, :cond_10

    .line 378
    .line 379
    move v6, v4

    .line 380
    :cond_10
    and-int/2addr v1, v4

    .line 381
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_15

    .line 386
    .line 387
    iget-object v2, v0, La/dv80;->b:La/imm;

    .line 388
    .line 389
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    if-nez v0, :cond_11

    .line 398
    .line 399
    if-ne v1, v3, :cond_12

    .line 400
    .line 401
    :cond_11
    new-instance v1, La/qu80;

    .line 402
    .line 403
    const/4 v0, 0x4

    .line 404
    invoke-direct {v1, v5, v0}, La/qu80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    :cond_12
    move-object v4, v1

    .line 411
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 412
    .line 413
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    if-nez v0, :cond_13

    .line 422
    .line 423
    if-ne v1, v3, :cond_14

    .line 424
    .line 425
    :cond_13
    new-instance v1, La/hs80;

    .line 426
    .line 427
    const/4 v0, 0x3

    .line 428
    invoke-direct {v1, v5, v0}, La/hs80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_14
    move-object v6, v1

    .line 435
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 436
    .line 437
    const/4 v15, 0x0

    .line 438
    const/16 v16, 0xfd5

    .line 439
    .line 440
    const/4 v1, 0x0

    .line 441
    const/4 v3, 0x0

    .line 442
    const/4 v5, 0x0

    .line 443
    const/4 v7, 0x0

    .line 444
    const/4 v8, 0x0

    .line 445
    const/4 v9, 0x0

    .line 446
    const/4 v10, 0x0

    .line 447
    const/4 v11, 0x0

    .line 448
    const/4 v12, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_15
    invoke-virtual {v13}, La/fet;->X()V

    .line 455
    .line 456
    .line 457
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
