.class public final synthetic La/e280;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/e280;->a:B

    iput-object p1, p0, La/e280;->b:La/l7m0;

    iput-object p2, p0, La/e280;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/e280;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e280;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x4

    .line 11
    const/16 v6, 0x12

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    sget-object v9, La/ukd;->a:La/cl5;

    .line 16
    .line 17
    iget-object v10, v0, La/e280;->d:La/pz40;

    .line 18
    .line 19
    iget-object v11, v0, La/e280;->c:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/yhg0;

    .line 27
    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    check-cast v2, La/fet;

    .line 31
    .line 32
    move-object/from16 v3, p3

    .line 33
    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v1, v3, 0x11

    .line 44
    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    if-eq v1, v4, :cond_0

    .line 48
    .line 49
    move v7, v8

    .line 50
    :cond_0
    and-int/lit8 v1, v3, 0x1

    .line 51
    .line 52
    invoke-virtual {v2, v1, v7}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    new-instance v14, La/gil0;

    .line 59
    .line 60
    new-instance v7, La/zgl0;

    .line 61
    .line 62
    invoke-direct {v7}, La/zgl0;-><init>()V

    .line 63
    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    const/4 v4, 0x2

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    move-object v3, v14

    .line 70
    invoke-direct/range {v3 .. v8}, La/gil0;-><init>(ILa/y9q0;La/y9q0;La/zgl0;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v2, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    or-int/2addr v1, v3

    .line 82
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-nez v1, :cond_1

    .line 87
    .line 88
    if-ne v3, v9, :cond_2

    .line 89
    .line 90
    :cond_1
    new-instance v3, La/jg2;

    .line 91
    .line 92
    const/16 v1, 0x1b

    .line 93
    .line 94
    invoke-direct {v3, v11, v10, v1}, La/jg2;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    move-object v15, v3

    .line 101
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    invoke-virtual {v2, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {v2, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    or-int/2addr v1, v3

    .line 112
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-nez v1, :cond_3

    .line 117
    .line 118
    if-ne v3, v9, :cond_4

    .line 119
    .line 120
    :cond_3
    new-instance v3, La/jg2;

    .line 121
    .line 122
    const/16 v1, 0x1c

    .line 123
    .line 124
    invoke-direct {v3, v11, v10, v1}, La/jg2;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    move-object/from16 v16, v3

    .line 131
    .line 132
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    const/16 v18, 0x0

    .line 135
    .line 136
    const/16 v19, 0x1

    .line 137
    .line 138
    const/4 v12, 0x0

    .line 139
    iget-object v13, v0, La/e280;->b:La/l7m0;

    .line 140
    .line 141
    move-object/from16 v17, v2

    .line 142
    .line 143
    invoke-static/range {v12 .. v19}, La/vfc;->q(La/mm40;La/l7m0;La/qil0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_5
    move-object/from16 v17, v2

    .line 148
    .line 149
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 150
    .line 151
    .line 152
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_0
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, La/yhg0;

    .line 158
    .line 159
    move-object/from16 v12, p2

    .line 160
    .line 161
    check-cast v12, La/fet;

    .line 162
    .line 163
    move-object/from16 v13, p3

    .line 164
    .line 165
    check-cast v13, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    and-int/lit8 v14, v13, 0x6

    .line 175
    .line 176
    if-nez v14, :cond_7

    .line 177
    .line 178
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_6

    .line 183
    .line 184
    move v4, v5

    .line 185
    :cond_6
    or-int/2addr v13, v4

    .line 186
    :cond_7
    and-int/lit8 v4, v13, 0x13

    .line 187
    .line 188
    if-eq v4, v6, :cond_8

    .line 189
    .line 190
    move v7, v8

    .line 191
    :cond_8
    and-int/lit8 v4, v13, 0x1

    .line 192
    .line 193
    invoke-virtual {v12, v4, v7}, La/fet;->U(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_d

    .line 198
    .line 199
    invoke-interface {v1, v2, v3, v8}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    new-instance v14, La/gil0;

    .line 204
    .line 205
    new-instance v6, La/zgl0;

    .line 206
    .line 207
    invoke-direct {v6}, La/zgl0;-><init>()V

    .line 208
    .line 209
    .line 210
    const/4 v7, 0x6

    .line 211
    const/4 v3, 0x2

    .line 212
    const/4 v4, 0x0

    .line 213
    const/4 v5, 0x0

    .line 214
    move-object v2, v14

    .line 215
    invoke-direct/range {v2 .. v7}, La/gil0;-><init>(ILa/y9q0;La/y9q0;La/zgl0;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    or-int/2addr v2, v3

    .line 227
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    if-nez v2, :cond_9

    .line 232
    .line 233
    if-ne v3, v9, :cond_a

    .line 234
    .line 235
    :cond_9
    new-instance v3, La/jg2;

    .line 236
    .line 237
    const/16 v2, 0x19

    .line 238
    .line 239
    invoke-direct {v3, v11, v10, v2}, La/jg2;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    move-object v15, v3

    .line 246
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 247
    .line 248
    invoke-virtual {v12, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    or-int/2addr v2, v3

    .line 257
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    if-nez v2, :cond_b

    .line 262
    .line 263
    if-ne v3, v9, :cond_c

    .line 264
    .line 265
    :cond_b
    new-instance v3, La/jg2;

    .line 266
    .line 267
    const/16 v2, 0x1a

    .line 268
    .line 269
    invoke-direct {v3, v11, v10, v2}, La/jg2;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;B)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_c
    move-object/from16 v16, v3

    .line 276
    .line 277
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 278
    .line 279
    const/16 v18, 0x0

    .line 280
    .line 281
    const/16 v19, 0x0

    .line 282
    .line 283
    iget-object v13, v0, La/e280;->b:La/l7m0;

    .line 284
    .line 285
    move-object/from16 v17, v12

    .line 286
    .line 287
    move-object v12, v1

    .line 288
    invoke-static/range {v12 .. v19}, La/vfc;->q(La/mm40;La/l7m0;La/qil0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 289
    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_d
    move-object/from16 v17, v12

    .line 293
    .line 294
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_1
    move-object/from16 v1, p1

    .line 301
    .line 302
    check-cast v1, La/yhg0;

    .line 303
    .line 304
    move-object/from16 v12, p2

    .line 305
    .line 306
    check-cast v12, La/fet;

    .line 307
    .line 308
    move-object/from16 v13, p3

    .line 309
    .line 310
    check-cast v13, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v13

    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    and-int/lit8 v14, v13, 0x6

    .line 320
    .line 321
    if-nez v14, :cond_f

    .line 322
    .line 323
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    if-eqz v14, :cond_e

    .line 328
    .line 329
    move v4, v5

    .line 330
    :cond_e
    or-int/2addr v13, v4

    .line 331
    :cond_f
    and-int/lit8 v4, v13, 0x13

    .line 332
    .line 333
    if-eq v4, v6, :cond_10

    .line 334
    .line 335
    move v7, v8

    .line 336
    :cond_10
    and-int/lit8 v4, v13, 0x1

    .line 337
    .line 338
    invoke-virtual {v12, v4, v7}, La/fet;->U(IZ)Z

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    if-eqz v4, :cond_15

    .line 343
    .line 344
    invoke-interface {v1, v2, v3, v8}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    new-instance v13, La/gil0;

    .line 349
    .line 350
    new-instance v17, La/zgl0;

    .line 351
    .line 352
    invoke-direct/range {v17 .. v17}, La/zgl0;-><init>()V

    .line 353
    .line 354
    .line 355
    const/16 v18, 0x6

    .line 356
    .line 357
    const/4 v14, 0x2

    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    invoke-direct/range {v13 .. v18}, La/gil0;-><init>(ILa/y9q0;La/y9q0;La/zgl0;I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    or-int/2addr v2, v3

    .line 373
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    if-nez v2, :cond_11

    .line 378
    .line 379
    if-ne v3, v9, :cond_12

    .line 380
    .line 381
    :cond_11
    new-instance v3, La/jg2;

    .line 382
    .line 383
    invoke-direct {v3, v11, v10, v6}, La/jg2;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;B)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    :cond_12
    move-object v15, v3

    .line 390
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 391
    .line 392
    invoke-virtual {v12, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    invoke-virtual {v12, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    or-int/2addr v2, v3

    .line 401
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    if-nez v2, :cond_13

    .line 406
    .line 407
    if-ne v3, v9, :cond_14

    .line 408
    .line 409
    :cond_13
    new-instance v3, La/jg2;

    .line 410
    .line 411
    const/16 v2, 0x13

    .line 412
    .line 413
    invoke-direct {v3, v11, v10, v2}, La/jg2;-><init>(Lkotlin/jvm/functions/Function1;La/pz40;B)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    :cond_14
    move-object/from16 v16, v3

    .line 420
    .line 421
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 422
    .line 423
    const/16 v18, 0x0

    .line 424
    .line 425
    const/16 v19, 0x0

    .line 426
    .line 427
    iget-object v0, v0, La/e280;->b:La/l7m0;

    .line 428
    .line 429
    move-object/from16 v17, v12

    .line 430
    .line 431
    move-object v14, v13

    .line 432
    move-object v13, v0

    .line 433
    move-object v12, v1

    .line 434
    invoke-static/range {v12 .. v19}, La/vfc;->q(La/mm40;La/l7m0;La/qil0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 435
    .line 436
    .line 437
    goto :goto_2

    .line 438
    :cond_15
    move-object/from16 v17, v12

    .line 439
    .line 440
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 441
    .line 442
    .line 443
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object v0

    .line 446
    nop

    .line 447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
