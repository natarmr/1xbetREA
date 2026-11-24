.class public final La/ezg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/mm40;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/mm40;ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ezg;->a:B

    iput-object p1, p0, La/ezg;->b:Ljava/util/List;

    iput-object p2, p0, La/ezg;->c:La/mm40;

    iput-boolean p3, p0, La/ezg;->d:Z

    iput-object p4, p0, La/ezg;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ezg;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/ezg;->b:Ljava/util/List;

    .line 6
    .line 7
    const/16 v3, 0x92

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    iget-object v8, v0, La/ezg;->e:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    sget-object v10, La/ukd;->a:La/cl5;

    .line 19
    .line 20
    const/4 v11, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/g9z;

    .line 27
    .line 28
    move-object/from16 v12, p2

    .line 29
    .line 30
    check-cast v12, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    move-object/from16 v13, p3

    .line 37
    .line 38
    check-cast v13, La/fet;

    .line 39
    .line 40
    move-object/from16 v14, p4

    .line 41
    .line 42
    check-cast v14, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    and-int/lit8 v15, v14, 0x6

    .line 49
    .line 50
    if-nez v15, :cond_1

    .line 51
    .line 52
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    move v6, v7

    .line 59
    :cond_0
    or-int v1, v14, v6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v1, v14

    .line 63
    :goto_0
    and-int/lit8 v6, v14, 0x30

    .line 64
    .line 65
    if-nez v6, :cond_3

    .line 66
    .line 67
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_2

    .line 72
    .line 73
    move v4, v5

    .line 74
    :cond_2
    or-int/2addr v1, v4

    .line 75
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 76
    .line 77
    if-eq v4, v3, :cond_4

    .line 78
    .line 79
    move v3, v9

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move v3, v11

    .line 82
    :goto_1
    and-int/2addr v1, v9

    .line 83
    invoke-virtual {v13, v1, v3}, La/fet;->U(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_c

    .line 88
    .line 89
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/a2n;

    .line 94
    .line 95
    const v2, -0x47e185cd

    .line 96
    .line 97
    .line 98
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    move-object v2, v13

    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :cond_5
    instance-of v2, v1, La/y56;

    .line 107
    .line 108
    if-eqz v2, :cond_8

    .line 109
    .line 110
    const v2, -0x47e092c5

    .line 111
    .line 112
    .line 113
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 114
    .line 115
    .line 116
    move-object v14, v1

    .line 117
    check-cast v14, La/y56;

    .line 118
    .line 119
    invoke-virtual {v13, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-nez v1, :cond_6

    .line 128
    .line 129
    if-ne v2, v10, :cond_7

    .line 130
    .line 131
    :cond_6
    new-instance v2, La/qr0;

    .line 132
    .line 133
    const/16 v1, 0x1d

    .line 134
    .line 135
    invoke-direct {v2, v8, v1}, La/qr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    move-object/from16 v16, v2

    .line 142
    .line 143
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 144
    .line 145
    const/16 v19, 0x0

    .line 146
    .line 147
    const/16 v20, 0x10

    .line 148
    .line 149
    move-object/from16 v18, v13

    .line 150
    .line 151
    iget-object v13, v0, La/ezg;->c:La/mm40;

    .line 152
    .line 153
    iget-boolean v15, v0, La/ezg;->d:Z

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    invoke-static/range {v13 .. v20}, La/vcc;->i(La/mm40;La/y56;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 158
    .line 159
    .line 160
    move-object/from16 v2, v18

    .line 161
    .line 162
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_8
    move-object v2, v13

    .line 167
    instance-of v3, v1, La/c2o0;

    .line 168
    .line 169
    if-eqz v3, :cond_b

    .line 170
    .line 171
    const v3, -0x47d9fe7a

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 175
    .line 176
    .line 177
    move-object v14, v1

    .line 178
    check-cast v14, La/c2o0;

    .line 179
    .line 180
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-nez v1, :cond_9

    .line 189
    .line 190
    if-ne v3, v10, :cond_a

    .line 191
    .line 192
    :cond_9
    new-instance v3, La/fzg;

    .line 193
    .line 194
    invoke-direct {v3, v8, v11}, La/fzg;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_a
    move-object/from16 v16, v3

    .line 201
    .line 202
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 203
    .line 204
    const/16 v19, 0x0

    .line 205
    .line 206
    const/16 v20, 0x10

    .line 207
    .line 208
    iget-object v13, v0, La/ezg;->c:La/mm40;

    .line 209
    .line 210
    iget-boolean v15, v0, La/ezg;->d:Z

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    move-object/from16 v18, v2

    .line 215
    .line 216
    invoke-static/range {v13 .. v20}, La/hkb;->n(La/mm40;La/c2o0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_b
    :goto_2
    const v0, -0x47d39798

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    :goto_3
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_c
    move-object v2, v13

    .line 237
    invoke-virtual {v2}, La/fet;->X()V

    .line 238
    .line 239
    .line 240
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_0
    move-object/from16 v1, p1

    .line 244
    .line 245
    check-cast v1, La/g9z;

    .line 246
    .line 247
    move-object/from16 v12, p2

    .line 248
    .line 249
    check-cast v12, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    move-object/from16 v13, p3

    .line 256
    .line 257
    check-cast v13, La/fet;

    .line 258
    .line 259
    move-object/from16 v14, p4

    .line 260
    .line 261
    check-cast v14, Ljava/lang/Number;

    .line 262
    .line 263
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v14

    .line 267
    and-int/lit8 v15, v14, 0x6

    .line 268
    .line 269
    if-nez v15, :cond_e

    .line 270
    .line 271
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-eqz v1, :cond_d

    .line 276
    .line 277
    move v6, v7

    .line 278
    :cond_d
    or-int v1, v14, v6

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_e
    move v1, v14

    .line 282
    :goto_5
    and-int/lit8 v6, v14, 0x30

    .line 283
    .line 284
    if-nez v6, :cond_10

    .line 285
    .line 286
    invoke-virtual {v13, v12}, La/fet;->e(I)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-eqz v6, :cond_f

    .line 291
    .line 292
    move v4, v5

    .line 293
    :cond_f
    or-int/2addr v1, v4

    .line 294
    :cond_10
    and-int/lit16 v4, v1, 0x93

    .line 295
    .line 296
    if-eq v4, v3, :cond_11

    .line 297
    .line 298
    move v3, v9

    .line 299
    goto :goto_6

    .line 300
    :cond_11
    move v3, v11

    .line 301
    :goto_6
    and-int/2addr v1, v9

    .line 302
    invoke-virtual {v13, v1, v3}, La/fet;->U(IZ)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_19

    .line 307
    .line 308
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    check-cast v1, La/a2n;

    .line 313
    .line 314
    const v2, -0x54c814be

    .line 315
    .line 316
    .line 317
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 318
    .line 319
    .line 320
    if-nez v1, :cond_12

    .line 321
    .line 322
    move-object v2, v13

    .line 323
    goto/16 :goto_7

    .line 324
    .line 325
    :cond_12
    instance-of v2, v1, La/y56;

    .line 326
    .line 327
    if-eqz v2, :cond_15

    .line 328
    .line 329
    const v2, -0x54c780a6

    .line 330
    .line 331
    .line 332
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 333
    .line 334
    .line 335
    move-object v14, v1

    .line 336
    check-cast v14, La/y56;

    .line 337
    .line 338
    invoke-virtual {v13, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    if-nez v1, :cond_13

    .line 347
    .line 348
    if-ne v2, v10, :cond_14

    .line 349
    .line 350
    :cond_13
    new-instance v2, La/qr0;

    .line 351
    .line 352
    const/16 v1, 0x1b

    .line 353
    .line 354
    invoke-direct {v2, v8, v1}, La/qr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_14
    move-object/from16 v16, v2

    .line 361
    .line 362
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 363
    .line 364
    const/16 v19, 0x0

    .line 365
    .line 366
    const/16 v20, 0x10

    .line 367
    .line 368
    move-object/from16 v18, v13

    .line 369
    .line 370
    iget-object v13, v0, La/ezg;->c:La/mm40;

    .line 371
    .line 372
    iget-boolean v15, v0, La/ezg;->d:Z

    .line 373
    .line 374
    const/16 v17, 0x0

    .line 375
    .line 376
    invoke-static/range {v13 .. v20}, La/vcc;->i(La/mm40;La/y56;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 377
    .line 378
    .line 379
    move-object/from16 v2, v18

    .line 380
    .line 381
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 382
    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_15
    move-object v2, v13

    .line 386
    instance-of v3, v1, La/c2o0;

    .line 387
    .line 388
    if-eqz v3, :cond_18

    .line 389
    .line 390
    const v3, -0x54c089aa

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 394
    .line 395
    .line 396
    move-object v14, v1

    .line 397
    check-cast v14, La/c2o0;

    .line 398
    .line 399
    invoke-virtual {v2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    if-nez v1, :cond_16

    .line 408
    .line 409
    if-ne v3, v10, :cond_17

    .line 410
    .line 411
    :cond_16
    new-instance v3, La/qr0;

    .line 412
    .line 413
    const/16 v1, 0x1c

    .line 414
    .line 415
    invoke-direct {v3, v8, v1}, La/qr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_17
    move-object/from16 v16, v3

    .line 422
    .line 423
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 424
    .line 425
    const/16 v19, 0x0

    .line 426
    .line 427
    const/16 v20, 0x10

    .line 428
    .line 429
    iget-object v13, v0, La/ezg;->c:La/mm40;

    .line 430
    .line 431
    iget-boolean v15, v0, La/ezg;->d:Z

    .line 432
    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    move-object/from16 v18, v2

    .line 436
    .line 437
    invoke-static/range {v13 .. v20}, La/hkb;->n(La/mm40;La/c2o0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 441
    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_18
    :goto_7
    const v0, -0x54ba22c8

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 451
    .line 452
    .line 453
    :goto_8
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 454
    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_19
    move-object v2, v13

    .line 458
    invoke-virtual {v2}, La/fet;->X()V

    .line 459
    .line 460
    .line 461
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    nop

    .line 465
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
