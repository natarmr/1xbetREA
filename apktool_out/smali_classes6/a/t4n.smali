.class public final synthetic La/t4n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/slm0;


# direct methods
.method public synthetic constructor <init>(La/slm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t4n;->a:B

    iput-object p1, p0, La/t4n;->b:La/slm0;

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
    iget-byte v1, v0, La/t4n;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41000000    # 8.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x12

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    iget-object v0, v0, La/t4n;->b:La/slm0;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/mm40;

    .line 22
    .line 23
    move-object/from16 v9, p2

    .line 24
    .line 25
    check-cast v9, La/fet;

    .line 26
    .line 27
    move-object/from16 v10, p3

    .line 28
    .line 29
    check-cast v10, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v11, v10, 0x6

    .line 39
    .line 40
    if-nez v11, :cond_1

    .line 41
    .line 42
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    if-eqz v11, :cond_0

    .line 47
    .line 48
    move v5, v6

    .line 49
    :cond_0
    or-int/2addr v10, v5

    .line 50
    :cond_1
    and-int/lit8 v5, v10, 0x13

    .line 51
    .line 52
    if-eq v5, v4, :cond_2

    .line 53
    .line 54
    move v4, v7

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v4, v8

    .line 57
    :goto_0
    and-int/lit8 v5, v10, 0x1

    .line 58
    .line 59
    invoke-virtual {v9, v5, v4}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    sget-object v4, La/qmk;->a:La/zcl;

    .line 66
    .line 67
    invoke-static {v1, v3, v2, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v10, La/n4i;

    .line 72
    .line 73
    check-cast v0, La/rlm0;

    .line 74
    .line 75
    iget-object v11, v0, La/rlm0;->a:La/r3i;

    .line 76
    .line 77
    iget-object v12, v0, La/rlm0;->b:La/r3i;

    .line 78
    .line 79
    iget-object v13, v0, La/rlm0;->c:La/q3i;

    .line 80
    .line 81
    iget-object v14, v0, La/rlm0;->d:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v15, v0, La/rlm0;->e:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v0, v0, La/rlm0;->f:Ljava/lang/String;

    .line 86
    .line 87
    move-object/from16 v16, v0

    .line 88
    .line 89
    invoke-direct/range {v10 .. v16}, La/n4i;-><init>(La/r3i;La/r3i;La/q3i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v10, v9, v8}, La/feb;->o(La/mm40;La/n4i;La/fet;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_0
    move-object/from16 v1, p1

    .line 103
    .line 104
    check-cast v1, La/mm40;

    .line 105
    .line 106
    move-object/from16 v9, p2

    .line 107
    .line 108
    check-cast v9, La/fet;

    .line 109
    .line 110
    move-object/from16 v10, p3

    .line 111
    .line 112
    check-cast v10, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    and-int/lit8 v11, v10, 0x6

    .line 122
    .line 123
    if-nez v11, :cond_5

    .line 124
    .line 125
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-eqz v11, :cond_4

    .line 130
    .line 131
    move v5, v6

    .line 132
    :cond_4
    or-int/2addr v10, v5

    .line 133
    :cond_5
    and-int/lit8 v5, v10, 0x13

    .line 134
    .line 135
    if-eq v5, v4, :cond_6

    .line 136
    .line 137
    move v8, v7

    .line 138
    :cond_6
    and-int/lit8 v4, v10, 0x1

    .line 139
    .line 140
    invoke-virtual {v9, v4, v8}, La/fet;->U(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_7

    .line 145
    .line 146
    sget-object v4, La/qmk;->a:La/zcl;

    .line 147
    .line 148
    invoke-static {v1, v3, v2, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v0, La/qlm0;

    .line 153
    .line 154
    iget-object v10, v0, La/qlm0;->a:La/h1n;

    .line 155
    .line 156
    iget-object v11, v0, La/qlm0;->b:La/h1n;

    .line 157
    .line 158
    iget-object v12, v0, La/qlm0;->c:La/mpm;

    .line 159
    .line 160
    iget-object v13, v0, La/qlm0;->d:Ljava/lang/String;

    .line 161
    .line 162
    iget-object v14, v0, La/qlm0;->e:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v15, v0, La/qlm0;->f:Ljava/lang/String;

    .line 165
    .line 166
    sget-object v0, La/x0m;->a:La/x0m;

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    move-object/from16 v16, v9

    .line 171
    .line 172
    move-object v9, v1

    .line 173
    invoke-static/range {v9 .. v17}, La/n4c;->n(La/mm40;La/h1n;La/h1n;La/mpm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_7
    move-object/from16 v16, v9

    .line 178
    .line 179
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_1
    move-object/from16 v1, p1

    .line 186
    .line 187
    check-cast v1, La/mm40;

    .line 188
    .line 189
    move-object/from16 v9, p2

    .line 190
    .line 191
    check-cast v9, La/fet;

    .line 192
    .line 193
    move-object/from16 v10, p3

    .line 194
    .line 195
    check-cast v10, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    and-int/lit8 v11, v10, 0x6

    .line 205
    .line 206
    if-nez v11, :cond_9

    .line 207
    .line 208
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-eqz v11, :cond_8

    .line 213
    .line 214
    move v5, v6

    .line 215
    :cond_8
    or-int/2addr v10, v5

    .line 216
    :cond_9
    and-int/lit8 v5, v10, 0x13

    .line 217
    .line 218
    if-eq v5, v4, :cond_a

    .line 219
    .line 220
    move v8, v7

    .line 221
    :cond_a
    and-int/lit8 v4, v10, 0x1

    .line 222
    .line 223
    invoke-virtual {v9, v4, v8}, La/fet;->U(IZ)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_b

    .line 228
    .line 229
    sget-object v4, La/qmk;->a:La/zcl;

    .line 230
    .line 231
    invoke-static {v1, v3, v2, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v0, La/plm0;

    .line 236
    .line 237
    iget-object v10, v0, La/plm0;->a:La/h1n;

    .line 238
    .line 239
    iget-object v11, v0, La/plm0;->b:La/h1n;

    .line 240
    .line 241
    iget-object v12, v0, La/plm0;->c:La/mpm;

    .line 242
    .line 243
    iget-object v13, v0, La/plm0;->d:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v14, v0, La/plm0;->e:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v15, v0, La/plm0;->f:Ljava/lang/String;

    .line 248
    .line 249
    sget-object v0, La/x0m;->a:La/x0m;

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    move-object/from16 v16, v9

    .line 254
    .line 255
    move-object v9, v1

    .line 256
    invoke-static/range {v9 .. v17}, La/n4c;->n(La/mm40;La/h1n;La/h1n;La/mpm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_b
    move-object/from16 v16, v9

    .line 261
    .line 262
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_2
    move-object/from16 v1, p1

    .line 269
    .line 270
    check-cast v1, La/mm40;

    .line 271
    .line 272
    move v2, v5

    .line 273
    move-object/from16 v5, p2

    .line 274
    .line 275
    check-cast v5, La/fet;

    .line 276
    .line 277
    move-object/from16 v3, p3

    .line 278
    .line 279
    check-cast v3, Ljava/lang/Integer;

    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    and-int/lit8 v9, v3, 0x6

    .line 289
    .line 290
    if-nez v9, :cond_d

    .line 291
    .line 292
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    if-eqz v9, :cond_c

    .line 297
    .line 298
    move v2, v6

    .line 299
    :cond_c
    or-int/2addr v3, v2

    .line 300
    :cond_d
    and-int/lit8 v2, v3, 0x13

    .line 301
    .line 302
    if-eq v2, v4, :cond_e

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_e
    move v7, v8

    .line 306
    :goto_4
    and-int/lit8 v2, v3, 0x1

    .line 307
    .line 308
    invoke-virtual {v5, v2, v7}, La/fet;->U(IZ)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_f

    .line 313
    .line 314
    check-cast v0, La/nlm0;

    .line 315
    .line 316
    iget-object v2, v0, La/nlm0;->a:La/ixm;

    .line 317
    .line 318
    move v4, v3

    .line 319
    iget-object v3, v0, La/nlm0;->b:La/ixm;

    .line 320
    .line 321
    iget-object v0, v0, La/nlm0;->c:Ljava/lang/String;

    .line 322
    .line 323
    and-int/lit8 v6, v4, 0xe

    .line 324
    .line 325
    move-object v4, v0

    .line 326
    invoke-static/range {v1 .. v6}, La/vbc;->y(La/mm40;La/ixm;La/ixm;Ljava/lang/String;La/fet;I)V

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_f
    invoke-virtual {v5}, La/fet;->X()V

    .line 331
    .line 332
    .line 333
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_3
    move v2, v5

    .line 337
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, La/mm40;

    .line 340
    .line 341
    move-object/from16 v3, p2

    .line 342
    .line 343
    check-cast v3, La/fet;

    .line 344
    .line 345
    move-object/from16 v5, p3

    .line 346
    .line 347
    check-cast v5, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    and-int/lit8 v9, v5, 0x6

    .line 357
    .line 358
    if-nez v9, :cond_11

    .line 359
    .line 360
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    if-eqz v9, :cond_10

    .line 365
    .line 366
    move v2, v6

    .line 367
    :cond_10
    or-int/2addr v5, v2

    .line 368
    :cond_11
    and-int/lit8 v2, v5, 0x13

    .line 369
    .line 370
    if-eq v2, v4, :cond_12

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_12
    move v7, v8

    .line 374
    :goto_6
    and-int/lit8 v2, v5, 0x1

    .line 375
    .line 376
    invoke-virtual {v3, v2, v7}, La/fet;->U(IZ)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_13

    .line 381
    .line 382
    new-instance v6, La/xtm;

    .line 383
    .line 384
    check-cast v0, La/mlm0;

    .line 385
    .line 386
    iget-object v7, v0, La/mlm0;->a:Ljava/lang/String;

    .line 387
    .line 388
    iget-object v8, v0, La/mlm0;->b:Ljava/lang/String;

    .line 389
    .line 390
    iget-wide v9, v0, La/mlm0;->c:J

    .line 391
    .line 392
    iget-object v11, v0, La/mlm0;->d:La/c280;

    .line 393
    .line 394
    iget-object v12, v0, La/mlm0;->e:La/c280;

    .line 395
    .line 396
    iget-object v13, v0, La/mlm0;->f:Ljava/lang/String;

    .line 397
    .line 398
    iget-object v14, v0, La/mlm0;->g:Ljava/lang/String;

    .line 399
    .line 400
    move/from16 p0, v5

    .line 401
    .line 402
    iget-wide v4, v0, La/mlm0;->h:J

    .line 403
    .line 404
    iget-object v2, v0, La/mlm0;->i:Ljava/lang/String;

    .line 405
    .line 406
    iget-object v15, v0, La/mlm0;->j:Ljava/lang/String;

    .line 407
    .line 408
    iget-object v0, v0, La/mlm0;->k:Ljava/lang/String;

    .line 409
    .line 410
    move-object/from16 v19, v0

    .line 411
    .line 412
    move-object/from16 v17, v2

    .line 413
    .line 414
    move-object/from16 v18, v15

    .line 415
    .line 416
    move-wide v15, v4

    .line 417
    invoke-direct/range {v6 .. v19}, La/xtm;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/c280;La/c280;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    and-int/lit8 v0, p0, 0xe

    .line 421
    .line 422
    invoke-static {v1, v6, v3, v0}, La/w9x;->y(La/mm40;La/xtm;La/fet;I)V

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_13
    invoke-virtual {v3}, La/fet;->X()V

    .line 427
    .line 428
    .line 429
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    return-object v0

    .line 432
    nop

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
