.class public final La/g91;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/String;

.field public k:J

.field public l:J

.field public m:B

.field public final synthetic n:La/n91;


# direct methods
.method public constructor <init>(La/n91;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/g91;->n:La/n91;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/g91;

    .line 2
    .line 3
    iget-object p0, p0, La/g91;->n:La/n91;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/g91;-><init>(La/n91;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/g91;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g91;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/g91;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v11, v8, La/g91;->n:La/n91;

    .line 4
    .line 5
    iget-object v0, v11, La/n91;->y:La/ntu;

    .line 6
    .line 7
    iget-object v12, v11, La/i3t0;->i:La/ocj;

    .line 8
    .line 9
    sget-object v13, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v1, v8, La/g91;->m:B

    .line 12
    .line 13
    const-string v14, ""

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    const/4 v3, 0x4

    .line 17
    const/4 v4, 0x3

    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v15, 0x0

    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    if-eq v1, v6, :cond_4

    .line 24
    .line 25
    if-eq v1, v5, :cond_3

    .line 26
    .line 27
    if-eq v1, v4, :cond_2

    .line 28
    .line 29
    if-eq v1, v3, :cond_1

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v15

    .line 46
    :cond_1
    iget-wide v0, v8, La/g91;->k:J

    .line 47
    .line 48
    iget-object v3, v8, La/g91;->j:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v4, v8, La/g91;->i:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, La/gv70;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-wide v5, v0

    .line 58
    move-object/from16 v1, p1

    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v0, p1

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    iget-wide v0, v8, La/g91;->l:J

    .line 70
    .line 71
    iget-wide v2, v8, La/g91;->k:J

    .line 72
    .line 73
    iget-object v5, v8, La/g91;->j:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v7, v8, La/g91;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v7, La/fv70;

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-wide v9, v0

    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget v1, La/n91;->f0:I

    .line 95
    .line 96
    iget-object v1, v12, La/ocj;->a:La/p7m0;

    .line 97
    .line 98
    :goto_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-object/from16 v16, v7

    .line 106
    .line 107
    check-cast v16, La/u81;

    .line 108
    .line 109
    const/16 v32, 0x0

    .line 110
    .line 111
    const v33, 0x1fffef

    .line 112
    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    const/16 v19, 0x1

    .line 119
    .line 120
    const/16 v20, 0x0

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const/16 v22, 0x0

    .line 125
    .line 126
    const-wide/16 v23, 0x0

    .line 127
    .line 128
    const/16 v25, 0x0

    .line 129
    .line 130
    const/16 v26, 0x0

    .line 131
    .line 132
    const/16 v27, 0x0

    .line 133
    .line 134
    const/16 v28, 0x0

    .line 135
    .line 136
    const/16 v29, 0x0

    .line 137
    .line 138
    const/16 v30, 0x0

    .line 139
    .line 140
    const/16 v31, 0x0

    .line 141
    .line 142
    invoke-static/range {v16 .. v33}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    invoke-virtual {v1, v7, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-eqz v7, :cond_17

    .line 151
    .line 152
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, La/u81;

    .line 157
    .line 158
    iget-boolean v1, v1, La/u81;->l:Z

    .line 159
    .line 160
    if-eqz v1, :cond_9

    .line 161
    .line 162
    iget-object v1, v11, La/n91;->I:La/do20;

    .line 163
    .line 164
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, La/u81;

    .line 169
    .line 170
    iget-object v2, v2, La/u81;->a:La/mlr;

    .line 171
    .line 172
    iget-wide v2, v2, La/mlr;->a:J

    .line 173
    .line 174
    iput-byte v6, v8, La/g91;->m:B

    .line 175
    .line 176
    invoke-virtual {v1, v2, v3, v8}, La/do20;->j(JLa/zje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-ne v1, v13, :cond_6

    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :cond_6
    :goto_1
    iget-object v7, v11, La/n91;->w:La/fv70;

    .line 185
    .line 186
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, La/u81;

    .line 191
    .line 192
    iget-object v1, v1, La/u81;->a:La/mlr;

    .line 193
    .line 194
    iget-wide v2, v1, La/mlr;->a:J

    .line 195
    .line 196
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, La/u81;

    .line 201
    .line 202
    iget-wide v9, v1, La/u81;->i:J

    .line 203
    .line 204
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iput-object v7, v8, La/g91;->i:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v0, v8, La/g91;->j:Ljava/lang/String;

    .line 211
    .line 212
    iput-wide v2, v8, La/g91;->k:J

    .line 213
    .line 214
    iput-wide v9, v8, La/g91;->l:J

    .line 215
    .line 216
    iput-byte v5, v8, La/g91;->m:B

    .line 217
    .line 218
    invoke-virtual {v11, v8}, La/n91;->Q(La/zje;)Ljava/io/Serializable;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-ne v1, v13, :cond_7

    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_7
    move-object v5, v0

    .line 227
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, La/u81;

    .line 234
    .line 235
    iget-boolean v0, v0, La/u81;->d:Z

    .line 236
    .line 237
    xor-int/2addr v0, v6

    .line 238
    iput-object v15, v8, La/g91;->i:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v15, v8, La/g91;->j:Ljava/lang/String;

    .line 241
    .line 242
    iput-byte v4, v8, La/g91;->m:B

    .line 243
    .line 244
    iget-object v4, v7, La/fv70;->a:La/iw20;

    .line 245
    .line 246
    iget-object v6, v7, La/fv70;->b:La/uyn;

    .line 247
    .line 248
    invoke-virtual {v6, v14}, La/uyn;->g(Ljava/lang/String;)La/lu0;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    iget-object v4, v4, La/iw20;->a:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v4, La/pl1;

    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    move-object/from16 v34, v8

    .line 258
    .line 259
    move v8, v0

    .line 260
    move-object v0, v4

    .line 261
    move-object/from16 v35, v6

    .line 262
    .line 263
    move-object v6, v1

    .line 264
    move-wide v1, v2

    .line 265
    move-wide v3, v9

    .line 266
    move-object/from16 v9, v35

    .line 267
    .line 268
    move-object/from16 v10, v34

    .line 269
    .line 270
    invoke-static/range {v0 .. v10}, La/pl1;->b(La/pl1;JJLjava/lang/String;Ljava/lang/String;IZLa/lu0;La/zje;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-ne v0, v13, :cond_8

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_8
    :goto_3
    check-cast v0, La/f02;

    .line 278
    .line 279
    :goto_4
    move-object/from16 v17, v0

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_9
    iget-object v4, v11, La/n91;->x:La/gv70;

    .line 283
    .line 284
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, La/u81;

    .line 289
    .line 290
    iget-object v1, v1, La/u81;->a:La/mlr;

    .line 291
    .line 292
    iget-wide v5, v1, La/mlr;->a:J

    .line 293
    .line 294
    invoke-virtual {v0}, La/ntu;->a()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    iput-object v4, v8, La/g91;->i:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v0, v8, La/g91;->j:Ljava/lang/String;

    .line 301
    .line 302
    iput-wide v5, v8, La/g91;->k:J

    .line 303
    .line 304
    iput-byte v3, v8, La/g91;->m:B

    .line 305
    .line 306
    invoke-virtual {v11, v8}, La/n91;->Q(La/zje;)Ljava/io/Serializable;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    if-ne v1, v13, :cond_a

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_a
    move-object v3, v0

    .line 314
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 315
    .line 316
    iput-object v15, v8, La/g91;->i:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v15, v8, La/g91;->j:Ljava/lang/String;

    .line 319
    .line 320
    iput-byte v2, v8, La/g91;->m:B

    .line 321
    .line 322
    iget-object v0, v4, La/gv70;->a:La/jw20;

    .line 323
    .line 324
    iget-object v2, v4, La/gv70;->b:La/uyn;

    .line 325
    .line 326
    invoke-virtual {v2, v14}, La/uyn;->g(Ljava/lang/String;)La/lu0;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    iget-object v0, v0, La/jw20;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, La/pl1;

    .line 333
    .line 334
    move-object v4, v1

    .line 335
    move-wide v1, v5

    .line 336
    const/4 v5, 0x0

    .line 337
    const/4 v6, 0x1

    .line 338
    invoke-static/range {v0 .. v8}, La/pl1;->c(La/pl1;JLjava/lang/String;Ljava/lang/String;IZLa/lu0;La/zje;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-ne v0, v13, :cond_b

    .line 343
    .line 344
    :goto_6
    return-object v13

    .line 345
    :cond_b
    :goto_7
    check-cast v0, La/f02;

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :goto_8
    sget v0, La/n91;->f0:I

    .line 349
    .line 350
    iget-object v7, v12, La/ocj;->a:La/p7m0;

    .line 351
    .line 352
    :goto_9
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-object/from16 v16, v0

    .line 360
    .line 361
    check-cast v16, La/u81;

    .line 362
    .line 363
    const/16 v32, 0x0

    .line 364
    .line 365
    const v33, 0x1ffffd

    .line 366
    .line 367
    .line 368
    const/16 v18, 0x0

    .line 369
    .line 370
    const/16 v19, 0x0

    .line 371
    .line 372
    const/16 v20, 0x0

    .line 373
    .line 374
    const/16 v21, 0x0

    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    const-wide/16 v23, 0x0

    .line 379
    .line 380
    const/16 v25, 0x0

    .line 381
    .line 382
    const/16 v26, 0x0

    .line 383
    .line 384
    const/16 v27, 0x0

    .line 385
    .line 386
    const/16 v28, 0x0

    .line 387
    .line 388
    const/16 v29, 0x0

    .line 389
    .line 390
    const/16 v30, 0x0

    .line 391
    .line 392
    const/16 v31, 0x0

    .line 393
    .line 394
    invoke-static/range {v16 .. v33}, La/u81;->a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    move-object/from16 v8, v17

    .line 399
    .line 400
    invoke-virtual {v7, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-eqz v0, :cond_16

    .line 405
    .line 406
    iget-object v0, v8, La/f02;->b:Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-nez v0, :cond_c

    .line 413
    .line 414
    sget-object v0, La/h81;->a:La/h81;

    .line 415
    .line 416
    invoke-virtual {v11, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :cond_c
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, La/u81;

    .line 427
    .line 428
    iget-boolean v0, v0, La/u81;->d:Z

    .line 429
    .line 430
    if-nez v0, :cond_d

    .line 431
    .line 432
    invoke-virtual {v11}, La/n91;->M()V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_d

    .line 436
    .line 437
    :cond_d
    iget-object v0, v11, La/n91;->F:La/yzn0;

    .line 438
    .line 439
    invoke-virtual {v0}, La/yzn0;->m()Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_13

    .line 444
    .line 445
    iget-object v0, v11, La/n91;->G:La/ubu;

    .line 446
    .line 447
    invoke-virtual {v0}, La/ubu;->a()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_12

    .line 452
    .line 453
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    check-cast v0, La/u81;

    .line 458
    .line 459
    iget-object v0, v0, La/u81;->b:La/f02;

    .line 460
    .line 461
    if-eqz v0, :cond_e

    .line 462
    .line 463
    iget-object v0, v0, La/f02;->f:Ljava/lang/String;

    .line 464
    .line 465
    goto :goto_a

    .line 466
    :cond_e
    move-object v0, v15

    .line 467
    :goto_a
    if-eqz v0, :cond_12

    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-nez v0, :cond_f

    .line 474
    .line 475
    goto :goto_c

    .line 476
    :cond_f
    new-instance v0, La/e81;

    .line 477
    .line 478
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    check-cast v1, La/u81;

    .line 483
    .line 484
    iget-object v1, v1, La/u81;->b:La/f02;

    .line 485
    .line 486
    if-eqz v1, :cond_10

    .line 487
    .line 488
    iget-object v15, v1, La/f02;->f:Ljava/lang/String;

    .line 489
    .line 490
    :cond_10
    if-nez v15, :cond_11

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_11
    move-object v14, v15

    .line 494
    :goto_b
    invoke-direct {v0, v14}, La/e81;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v11, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_12
    :goto_c
    invoke-virtual {v11}, La/n91;->M()V

    .line 502
    .line 503
    .line 504
    goto :goto_d

    .line 505
    :cond_13
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    check-cast v0, La/u81;

    .line 510
    .line 511
    iget-object v0, v0, La/u81;->b:La/f02;

    .line 512
    .line 513
    if-eqz v0, :cond_15

    .line 514
    .line 515
    iget-object v0, v0, La/f02;->f:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-nez v1, :cond_14

    .line 522
    .line 523
    invoke-virtual {v11}, La/n91;->M()V

    .line 524
    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_14
    new-instance v1, La/j81;

    .line 528
    .line 529
    invoke-direct {v1, v0}, La/j81;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v11, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_15
    sget-object v0, La/g81;->a:La/g81;

    .line 537
    .line 538
    invoke-virtual {v11, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 542
    .line 543
    return-object v0

    .line 544
    :cond_16
    move-object/from16 v17, v8

    .line 545
    .line 546
    goto/16 :goto_9

    .line 547
    .line 548
    :cond_17
    move-object/from16 v8, p0

    .line 549
    .line 550
    goto/16 :goto_0
.end method
