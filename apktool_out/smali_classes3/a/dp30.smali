.class public final synthetic La/dp30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fp30;

.field public final synthetic c:La/ctf0;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/fp30;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/dp30;->a:B

    iput-object p1, p0, La/dp30;->c:La/ctf0;

    iput-object p2, p0, La/dp30;->b:La/fp30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/fp30;La/ctf0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/dp30;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dp30;->b:La/fp30;

    iput-object p2, p0, La/dp30;->c:La/ctf0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dp30;->a:B

    .line 4
    .line 5
    const-string v5, ""

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    iget-object v9, v0, La/dp30;->b:La/fp30;

    .line 9
    .line 10
    iget-object v0, v0, La/dp30;->c:La/ctf0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fee;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/jfc0;

    .line 27
    .line 28
    if-eqz v1, :cond_6

    .line 29
    .line 30
    iget-object v2, v9, La/fp30;->i:La/n0o0;

    .line 31
    .line 32
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, La/fee;

    .line 37
    .line 38
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v9, La/a7c0;

    .line 52
    .line 53
    iget-object v10, v1, La/jfc0;->a:La/azc0;

    .line 54
    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    sget-object v3, La/wyc0;->b:La/wyc0;

    .line 58
    .line 59
    :goto_0
    move-object v11, v3

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iget-object v3, v1, La/jfc0;->b:La/wyc0;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :goto_1
    iget-object v3, v1, La/jfc0;->c:La/rlc0;

    .line 65
    .line 66
    iget-wide v12, v3, La/rlc0;->a:D

    .line 67
    .line 68
    new-instance v14, La/mlc0;

    .line 69
    .line 70
    new-array v15, v6, [Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 73
    .line 74
    invoke-static {v15, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    const v8, 0x7f130270

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v8, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    sget v15, La/cy7;->a:I

    .line 86
    .line 87
    sget-object v15, La/pn40;->a:La/pn40;

    .line 88
    .line 89
    iget-object v15, v3, La/rlc0;->c:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v4, La/p3u0;->c:La/p3u0;

    .line 92
    .line 93
    invoke-static {v12, v13, v15, v4}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v16

    .line 97
    invoke-static/range {v16 .. v16}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-direct {v14, v8, v7, v6}, La/mlc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    new-instance v7, La/mlc0;

    .line 105
    .line 106
    new-array v8, v6, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    const v6, 0x7f130d21

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v6, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    iget-object v8, v3, La/rlc0;->b:Ljava/lang/String;

    .line 120
    .line 121
    move/from16 p0, v2

    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    invoke-direct {v7, v6, v8, v2}, La/mlc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    iget-boolean v6, v3, La/rlc0;->f:Z

    .line 128
    .line 129
    if-eqz v6, :cond_1

    .line 130
    .line 131
    new-instance v6, La/mlc0;

    .line 132
    .line 133
    new-array v8, v2, [Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v8, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    const v2, 0x7f13025a

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    move-object/from16 p1, v9

    .line 147
    .line 148
    iget-wide v8, v3, La/rlc0;->e:D

    .line 149
    .line 150
    invoke-static {v8, v9, v15, v4}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-static {v8}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const/4 v9, 0x1

    .line 159
    invoke-direct {v6, v2, v8, v9}, La/mlc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_1
    move-object/from16 p1, v9

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    :goto_2
    iget-boolean v2, v3, La/rlc0;->g:Z

    .line 167
    .line 168
    if-eqz v2, :cond_2

    .line 169
    .line 170
    new-instance v2, La/mlc0;

    .line 171
    .line 172
    const/4 v8, 0x0

    .line 173
    new-array v9, v8, [Ljava/lang/Object;

    .line 174
    .line 175
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    const v8, 0x7f130259

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v8, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    move-object/from16 v18, v10

    .line 187
    .line 188
    iget-wide v9, v3, La/rlc0;->d:D

    .line 189
    .line 190
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 191
    .line 192
    sub-double v9, v9, v19

    .line 193
    .line 194
    mul-double/2addr v9, v12

    .line 195
    invoke-static {v9, v10, v15, v4}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-static {v4}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const/4 v10, 0x1

    .line 204
    invoke-direct {v2, v8, v4, v10}, La/mlc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_2
    move-object/from16 v18, v10

    .line 209
    .line 210
    const/4 v10, 0x1

    .line 211
    const/4 v2, 0x0

    .line 212
    :goto_3
    filled-new-array {v14, v7, v6, v2}, [La/mlc0;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v2}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    new-instance v12, La/slc0;

    .line 225
    .line 226
    iget-boolean v3, v3, La/rlc0;->h:Z

    .line 227
    .line 228
    invoke-direct {v12, v2, v3}, La/slc0;-><init>(La/a4x;Z)V

    .line 229
    .line 230
    .line 231
    iget-boolean v2, v1, La/jfc0;->d:Z

    .line 232
    .line 233
    const/4 v8, 0x0

    .line 234
    new-array v3, v8, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    const v4, 0x7f130dcf

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    new-array v4, v8, [Ljava/lang/Object;

    .line 248
    .line 249
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    const v6, 0x7f13025e

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    const-string v6, "\n"

    .line 261
    .line 262
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    if-eqz v2, :cond_3

    .line 267
    .line 268
    move-object v8, v4

    .line 269
    goto :goto_4

    .line 270
    :cond_3
    const/4 v8, 0x0

    .line 271
    :goto_4
    if-nez v8, :cond_4

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_4
    move-object v5, v8

    .line 275
    :goto_5
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    new-instance v14, La/wul;

    .line 280
    .line 281
    sget-object v3, La/iul;->e:La/iul;

    .line 282
    .line 283
    sget-object v4, La/oe9;->a:La/oe9;

    .line 284
    .line 285
    new-instance v5, La/ue9;

    .line 286
    .line 287
    const/4 v8, 0x0

    .line 288
    new-array v2, v8, [Ljava/lang/Object;

    .line 289
    .line 290
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const v6, 0x7f130528

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-direct {v5, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    iget-boolean v0, v1, La/jfc0;->e:Z

    .line 305
    .line 306
    if-eqz v0, :cond_5

    .line 307
    .line 308
    if-nez p0, :cond_5

    .line 309
    .line 310
    move v6, v10

    .line 311
    goto :goto_6

    .line 312
    :cond_5
    const/4 v6, 0x0

    .line 313
    :goto_6
    const/4 v7, 0x0

    .line 314
    const/4 v8, 0x1

    .line 315
    move-object v2, v14

    .line 316
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 317
    .line 318
    .line 319
    move-object/from16 v9, p1

    .line 320
    .line 321
    move-object/from16 v10, v18

    .line 322
    .line 323
    invoke-direct/range {v9 .. v14}, La/a7c0;-><init>(La/azc0;La/wyc0;La/slc0;Ljava/lang/String;La/wul;)V

    .line 324
    .line 325
    .line 326
    move-object v8, v9

    .line 327
    goto :goto_7

    .line 328
    :cond_6
    const/4 v8, 0x0

    .line 329
    :goto_7
    return-object v8

    .line 330
    :pswitch_0
    const/4 v10, 0x1

    .line 331
    move-object/from16 v1, p1

    .line 332
    .line 333
    check-cast v1, La/fee;

    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    check-cast v1, La/svj0;

    .line 343
    .line 344
    iget-object v4, v9, La/fp30;->c:La/n0o0;

    .line 345
    .line 346
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    check-cast v4, La/fee;

    .line 351
    .line 352
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    check-cast v4, La/bn5;

    .line 357
    .line 358
    iget-object v4, v4, La/bn5;->c:La/ql5;

    .line 359
    .line 360
    iget-object v4, v4, La/ql5;->f:Ljava/lang/String;

    .line 361
    .line 362
    iget-object v6, v9, La/fp30;->i:La/n0o0;

    .line 363
    .line 364
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    check-cast v6, La/fee;

    .line 369
    .line 370
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    check-cast v6, Ljava/lang/Boolean;

    .line 375
    .line 376
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    new-instance v7, La/awj0;

    .line 390
    .line 391
    iget-object v8, v1, La/svj0;->a:La/ex6;

    .line 392
    .line 393
    iget-object v9, v1, La/svj0;->b:La/nnb0;

    .line 394
    .line 395
    iget-object v11, v8, La/ex6;->b:La/ww6;

    .line 396
    .line 397
    iget-wide v12, v11, La/ww6;->e:D

    .line 398
    .line 399
    iget-wide v14, v11, La/ww6;->d:D

    .line 400
    .line 401
    new-instance v17, La/nx6;

    .line 402
    .line 403
    iget-object v8, v8, La/ex6;->a:La/a8q0;

    .line 404
    .line 405
    const/4 v2, 0x0

    .line 406
    const-wide/16 v25, 0x0

    .line 407
    .line 408
    new-array v3, v2, [Ljava/lang/Object;

    .line 409
    .line 410
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 411
    .line 412
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    const v2, 0x7f130f56

    .line 417
    .line 418
    .line 419
    invoke-virtual {v10, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v19

    .line 423
    iget-boolean v2, v11, La/ww6;->m:Z

    .line 424
    .line 425
    iget-boolean v3, v11, La/ww6;->i:Z

    .line 426
    .line 427
    const/16 v21, 0x1

    .line 428
    .line 429
    const/16 v22, 0x0

    .line 430
    .line 431
    move/from16 v20, v2

    .line 432
    .line 433
    move-object/from16 v18, v8

    .line 434
    .line 435
    invoke-direct/range {v17 .. v22}, La/nx6;-><init>(La/a8q0;Ljava/lang/String;ZZZ)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v2, v17

    .line 439
    .line 440
    new-instance v8, La/pln0;

    .line 441
    .line 442
    move-object/from16 v23, v2

    .line 443
    .line 444
    move/from16 p1, v3

    .line 445
    .line 446
    iget-wide v2, v11, La/ww6;->a:D

    .line 447
    .line 448
    move-wide/from16 v27, v2

    .line 449
    .line 450
    iget-wide v2, v11, La/ww6;->d:D

    .line 451
    .line 452
    move-wide/from16 v18, v2

    .line 453
    .line 454
    iget-wide v2, v11, La/ww6;->e:D

    .line 455
    .line 456
    cmpg-double v17, v18, v27

    .line 457
    .line 458
    const-wide/high16 v29, -0x4010000000000000L    # -1.0

    .line 459
    .line 460
    if-gtz v17, :cond_7

    .line 461
    .line 462
    cmpg-double v17, v27, v2

    .line 463
    .line 464
    if-gtz v17, :cond_7

    .line 465
    .line 466
    goto :goto_8

    .line 467
    :cond_7
    cmpg-double v17, v27, v29

    .line 468
    .line 469
    if-nez v17, :cond_8

    .line 470
    .line 471
    :goto_8
    const/16 v17, 0x0

    .line 472
    .line 473
    move-wide/from16 v21, v2

    .line 474
    .line 475
    move-object/from16 v20, v4

    .line 476
    .line 477
    invoke-static/range {v17 .. v22}, La/l8x;->R(ZDLjava/lang/String;D)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    move-object/from16 v2, v20

    .line 482
    .line 483
    move/from16 v31, v6

    .line 484
    .line 485
    move-object/from16 v32, v7

    .line 486
    .line 487
    :goto_9
    const/4 v3, 0x0

    .line 488
    goto :goto_a

    .line 489
    :cond_8
    move/from16 v31, v6

    .line 490
    .line 491
    move-object/from16 v32, v7

    .line 492
    .line 493
    move-wide v6, v2

    .line 494
    move-object v2, v4

    .line 495
    move-wide/from16 v3, v18

    .line 496
    .line 497
    cmpg-double v17, v27, v3

    .line 498
    .line 499
    if-gez v17, :cond_9

    .line 500
    .line 501
    invoke-static {v0, v3, v4, v2}, La/l8x;->T(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    goto :goto_9

    .line 506
    :cond_9
    cmpl-double v3, v27, v6

    .line 507
    .line 508
    if-lez v3, :cond_a

    .line 509
    .line 510
    invoke-static {v0, v6, v7, v2}, La/l8x;->S(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    goto :goto_9

    .line 515
    :cond_a
    move-object v0, v5

    .line 516
    goto :goto_9

    .line 517
    :goto_a
    invoke-direct {v8, v0, v3, v3}, La/pln0;-><init>(Ljava/lang/String;ZZ)V

    .line 518
    .line 519
    .line 520
    iget-object v0, v9, La/nnb0;->b:Ljava/lang/String;

    .line 521
    .line 522
    iget-object v3, v9, La/nnb0;->c:Ljava/lang/String;

    .line 523
    .line 524
    if-nez v31, :cond_b

    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_b
    const/4 v3, 0x0

    .line 528
    :goto_b
    if-nez v3, :cond_c

    .line 529
    .line 530
    move-object v3, v5

    .line 531
    :cond_c
    iget-boolean v4, v9, La/nnb0;->a:Z

    .line 532
    .line 533
    new-instance v6, La/wnb0;

    .line 534
    .line 535
    invoke-direct {v6, v0, v3, v4}, La/wnb0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 536
    .line 537
    .line 538
    new-instance v0, La/kke;

    .line 539
    .line 540
    iget-boolean v3, v11, La/ww6;->k:Z

    .line 541
    .line 542
    cmpl-double v4, v27, v14

    .line 543
    .line 544
    if-lez v4, :cond_d

    .line 545
    .line 546
    if-eqz p1, :cond_d

    .line 547
    .line 548
    if-nez v31, :cond_d

    .line 549
    .line 550
    const/4 v4, 0x1

    .line 551
    goto :goto_c

    .line 552
    :cond_d
    const/4 v4, 0x0

    .line 553
    :goto_c
    cmpg-double v7, v27, v12

    .line 554
    .line 555
    if-gez v7, :cond_e

    .line 556
    .line 557
    if-eqz p1, :cond_e

    .line 558
    .line 559
    if-nez v31, :cond_e

    .line 560
    .line 561
    const/4 v9, 0x1

    .line 562
    goto :goto_d

    .line 563
    :cond_e
    const/4 v9, 0x0

    .line 564
    :goto_d
    invoke-direct {v0, v3, v3, v4, v9}, La/kke;-><init>(ZZZZ)V

    .line 565
    .line 566
    .line 567
    iget-boolean v3, v11, La/ww6;->l:Z

    .line 568
    .line 569
    if-nez v3, :cond_12

    .line 570
    .line 571
    if-eqz v31, :cond_f

    .line 572
    .line 573
    goto :goto_10

    .line 574
    :cond_f
    cmpg-double v3, v14, v27

    .line 575
    .line 576
    if-gtz v3, :cond_10

    .line 577
    .line 578
    if-gtz v7, :cond_10

    .line 579
    .line 580
    goto :goto_e

    .line 581
    :cond_10
    cmpg-double v3, v27, v29

    .line 582
    .line 583
    if-nez v3, :cond_11

    .line 584
    .line 585
    :goto_e
    sget-object v3, La/gx6;->a:La/gx6;

    .line 586
    .line 587
    :goto_f
    move-object/from16 v22, v3

    .line 588
    .line 589
    goto :goto_11

    .line 590
    :cond_11
    sget-object v3, La/gx6;->b:La/gx6;

    .line 591
    .line 592
    goto :goto_f

    .line 593
    :cond_12
    :goto_10
    sget-object v3, La/gx6;->c:La/gx6;

    .line 594
    .line 595
    goto :goto_f

    .line 596
    :goto_11
    new-instance v17, La/zv6;

    .line 597
    .line 598
    const/16 v24, 0x1

    .line 599
    .line 600
    move-object/from16 v21, v0

    .line 601
    .line 602
    move-object/from16 v20, v6

    .line 603
    .line 604
    move-object/from16 v19, v8

    .line 605
    .line 606
    move-object/from16 v18, v23

    .line 607
    .line 608
    move-object/from16 v23, v2

    .line 609
    .line 610
    invoke-direct/range {v17 .. v24}, La/zv6;-><init>(La/nx6;La/pln0;La/wnb0;La/kke;La/gx6;Ljava/lang/String;Z)V

    .line 611
    .line 612
    .line 613
    iget-object v0, v1, La/svj0;->c:La/lwo0;

    .line 614
    .line 615
    iget-boolean v1, v0, La/lwo0;->a:Z

    .line 616
    .line 617
    iget-wide v3, v0, La/lwo0;->d:D

    .line 618
    .line 619
    iget-object v6, v0, La/lwo0;->c:Ljava/lang/String;

    .line 620
    .line 621
    iget-boolean v7, v0, La/lwo0;->b:Z

    .line 622
    .line 623
    if-nez v7, :cond_16

    .line 624
    .line 625
    if-eqz v31, :cond_13

    .line 626
    .line 627
    goto :goto_14

    .line 628
    :cond_13
    cmpg-double v8, v3, v25

    .line 629
    .line 630
    if-nez v8, :cond_14

    .line 631
    .line 632
    const/16 v21, 0x0

    .line 633
    .line 634
    goto :goto_15

    .line 635
    :cond_14
    new-instance v8, La/ywo0;

    .line 636
    .line 637
    sget v9, La/cy7;->a:I

    .line 638
    .line 639
    sget-object v9, La/pn40;->a:La/pn40;

    .line 640
    .line 641
    invoke-static {v2, v3, v4}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    invoke-static {v2}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    cmpl-double v3, v3, v25

    .line 650
    .line 651
    if-lez v3, :cond_15

    .line 652
    .line 653
    sget-object v3, La/d4d;->j:La/d4d;

    .line 654
    .line 655
    goto :goto_12

    .line 656
    :cond_15
    sget-object v3, La/d4d;->y:La/d4d;

    .line 657
    .line 658
    :goto_12
    invoke-direct {v8, v2, v3}, La/ywo0;-><init>(Ljava/lang/String;La/d4d;)V

    .line 659
    .line 660
    .line 661
    :goto_13
    move-object/from16 v21, v8

    .line 662
    .line 663
    goto :goto_15

    .line 664
    :cond_16
    :goto_14
    sget-object v8, La/wwo0;->a:La/wwo0;

    .line 665
    .line 666
    goto :goto_13

    .line 667
    :goto_15
    iget-object v2, v0, La/lwo0;->e:Ljava/lang/String;

    .line 668
    .line 669
    if-nez v7, :cond_19

    .line 670
    .line 671
    if-eqz v31, :cond_17

    .line 672
    .line 673
    goto :goto_18

    .line 674
    :cond_17
    iget-object v0, v0, La/lwo0;->f:Ljava/util/List;

    .line 675
    .line 676
    new-instance v3, Ljava/util/ArrayList;

    .line 677
    .line 678
    const/16 v4, 0xa

    .line 679
    .line 680
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 685
    .line 686
    .line 687
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-eqz v4, :cond_18

    .line 696
    .line 697
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    check-cast v4, La/mvo0;

    .line 702
    .line 703
    new-instance v7, La/fuy;

    .line 704
    .line 705
    iget-object v8, v4, La/mvo0;->a:Ljava/lang/String;

    .line 706
    .line 707
    iget-object v4, v4, La/mvo0;->b:Ljava/lang/String;

    .line 708
    .line 709
    invoke-direct {v7, v8, v4}, La/fuy;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    goto :goto_16

    .line 716
    :cond_18
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    new-instance v3, La/sn7;

    .line 721
    .line 722
    invoke-direct {v3, v0}, La/sn7;-><init>(La/i4;)V

    .line 723
    .line 724
    .line 725
    :goto_17
    move-object/from16 v23, v3

    .line 726
    .line 727
    goto :goto_19

    .line 728
    :cond_19
    :goto_18
    sget-object v3, La/rn7;->a:La/rn7;

    .line 729
    .line 730
    goto :goto_17

    .line 731
    :goto_19
    new-instance v18, La/hxo0;

    .line 732
    .line 733
    move/from16 v19, v1

    .line 734
    .line 735
    move-object/from16 v22, v2

    .line 736
    .line 737
    move-object/from16 v20, v6

    .line 738
    .line 739
    invoke-direct/range {v18 .. v23}, La/hxo0;-><init>(ZLjava/lang/String;La/axo0;Ljava/lang/String;La/tn7;)V

    .line 740
    .line 741
    .line 742
    new-instance v0, La/f9x;

    .line 743
    .line 744
    const/4 v8, 0x0

    .line 745
    invoke-direct {v0, v5, v8}, La/f9x;-><init>(Ljava/lang/String;Z)V

    .line 746
    .line 747
    .line 748
    new-instance v19, La/wul;

    .line 749
    .line 750
    sget-object v20, La/iul;->e:La/iul;

    .line 751
    .line 752
    sget-object v21, La/oe9;->a:La/oe9;

    .line 753
    .line 754
    new-instance v1, La/ue9;

    .line 755
    .line 756
    new-array v2, v8, [Ljava/lang/Object;

    .line 757
    .line 758
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    const v6, 0x7f130528

    .line 763
    .line 764
    .line 765
    invoke-virtual {v10, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    invoke-direct {v1, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    if-eqz p1, :cond_1c

    .line 773
    .line 774
    cmpg-double v2, v27, v29

    .line 775
    .line 776
    if-nez v2, :cond_1a

    .line 777
    .line 778
    goto :goto_1a

    .line 779
    :cond_1a
    cmpg-double v2, v14, v27

    .line 780
    .line 781
    if-gtz v2, :cond_1b

    .line 782
    .line 783
    cmpg-double v2, v27, v12

    .line 784
    .line 785
    if-gtz v2, :cond_1b

    .line 786
    .line 787
    const/4 v2, 0x1

    .line 788
    goto :goto_1b

    .line 789
    :cond_1b
    :goto_1a
    move v2, v8

    .line 790
    goto :goto_1b

    .line 791
    :cond_1c
    iget-boolean v2, v11, La/ww6;->j:Z

    .line 792
    .line 793
    :goto_1b
    if-eqz v2, :cond_1d

    .line 794
    .line 795
    if-nez v31, :cond_1d

    .line 796
    .line 797
    const/16 v23, 0x1

    .line 798
    .line 799
    goto :goto_1c

    .line 800
    :cond_1d
    move/from16 v23, v8

    .line 801
    .line 802
    :goto_1c
    const/16 v24, 0x0

    .line 803
    .line 804
    const/16 v25, 0x1

    .line 805
    .line 806
    move-object/from16 v22, v1

    .line 807
    .line 808
    invoke-direct/range {v19 .. v25}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 809
    .line 810
    .line 811
    const/16 v20, 0x0

    .line 812
    .line 813
    move-object/from16 v21, v0

    .line 814
    .line 815
    move-object/from16 v22, v19

    .line 816
    .line 817
    move-object/from16 v19, v18

    .line 818
    .line 819
    move-object/from16 v18, v17

    .line 820
    .line 821
    move-object/from16 v17, v32

    .line 822
    .line 823
    invoke-direct/range {v17 .. v22}, La/awj0;-><init>(La/zv6;La/hxo0;La/knd0;La/f9x;La/wul;)V

    .line 824
    .line 825
    .line 826
    return-object v32

    .line 827
    :pswitch_1
    move v8, v6

    .line 828
    const-wide/16 v25, 0x0

    .line 829
    .line 830
    move-object/from16 v1, p1

    .line 831
    .line 832
    check-cast v1, La/fee;

    .line 833
    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    check-cast v1, La/bn5;

    .line 842
    .line 843
    iget-object v2, v9, La/fp30;->d:La/n0o0;

    .line 844
    .line 845
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    check-cast v2, La/fee;

    .line 850
    .line 851
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    check-cast v2, La/go7;

    .line 856
    .line 857
    sget-object v3, La/do7;->a:La/do7;

    .line 858
    .line 859
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    if-eqz v3, :cond_1e

    .line 864
    .line 865
    iget-object v2, v9, La/fp30;->e:La/n0o0;

    .line 866
    .line 867
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    check-cast v2, La/fee;

    .line 872
    .line 873
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    check-cast v2, La/svj0;

    .line 878
    .line 879
    iget-object v2, v2, La/svj0;->a:La/ex6;

    .line 880
    .line 881
    iget-object v2, v2, La/ex6;->b:La/ww6;

    .line 882
    .line 883
    iget-wide v2, v2, La/ww6;->a:D

    .line 884
    .line 885
    goto :goto_1d

    .line 886
    :cond_1e
    sget-object v3, La/ao7;->a:La/ao7;

    .line 887
    .line 888
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-eqz v2, :cond_21

    .line 893
    .line 894
    move-wide/from16 v2, v25

    .line 895
    .line 896
    :goto_1d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    iget-object v4, v1, La/bn5;->c:La/ql5;

    .line 900
    .line 901
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    iget-object v5, v4, La/ql5;->f:Ljava/lang/String;

    .line 905
    .line 906
    iget-wide v6, v4, La/ql5;->b:D

    .line 907
    .line 908
    new-instance v9, La/ff6;

    .line 909
    .line 910
    new-instance v10, La/h30;

    .line 911
    .line 912
    invoke-direct {v10}, La/h30;-><init>()V

    .line 913
    .line 914
    .line 915
    new-instance v11, La/sw7;

    .line 916
    .line 917
    sget-object v12, La/pn40;->a:La/pn40;

    .line 918
    .line 919
    sget-object v12, La/p3u0;->c:La/p3u0;

    .line 920
    .line 921
    invoke-static {v6, v7, v12}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v12

    .line 925
    cmpg-double v13, v6, v25

    .line 926
    .line 927
    if-nez v13, :cond_1f

    .line 928
    .line 929
    goto :goto_1e

    .line 930
    :cond_1f
    cmpl-double v2, v2, v6

    .line 931
    .line 932
    if-lez v2, :cond_20

    .line 933
    .line 934
    :goto_1e
    iget-wide v2, v4, La/ql5;->a:J

    .line 935
    .line 936
    const-wide/16 v6, 0x0

    .line 937
    .line 938
    cmp-long v2, v2, v6

    .line 939
    .line 940
    if-eqz v2, :cond_20

    .line 941
    .line 942
    invoke-virtual {v0}, La/ctf0;->i()Z

    .line 943
    .line 944
    .line 945
    move-result v0

    .line 946
    if-eqz v0, :cond_20

    .line 947
    .line 948
    const/4 v6, 0x1

    .line 949
    goto :goto_1f

    .line 950
    :cond_20
    move v6, v8

    .line 951
    :goto_1f
    iget-boolean v0, v1, La/bn5;->d:Z

    .line 952
    .line 953
    invoke-direct {v11, v12, v5, v6, v0}, La/sw7;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 954
    .line 955
    .line 956
    invoke-direct {v9, v10, v11}, La/ff6;-><init>(La/w30;La/sw7;)V

    .line 957
    .line 958
    .line 959
    move-object v8, v9

    .line 960
    goto :goto_20

    .line 961
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 962
    .line 963
    .line 964
    const/4 v8, 0x0

    .line 965
    :goto_20
    return-object v8

    .line 966
    nop

    .line 967
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
