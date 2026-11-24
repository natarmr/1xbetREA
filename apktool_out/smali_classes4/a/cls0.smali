.class public final synthetic La/cls0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/g2v;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/g2v;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/cls0;->a:B

    iput-object p1, p0, La/cls0;->b:La/ctf0;

    iput-object p2, p0, La/cls0;->c:La/g2v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/g2v;La/ctf0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cls0;->a:B

    iput-object p1, p0, La/cls0;->c:La/g2v;

    iput-object p2, p0, La/cls0;->b:La/ctf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cls0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v0, La/cls0;->c:La/g2v;

    .line 10
    .line 11
    iget-object v7, v0, La/cls0;->b:La/ctf0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, La/j0v0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, La/ov0;

    .line 24
    .line 25
    invoke-direct {v1, v0, v6, v7}, La/ov0;-><init>(La/j0v0;La/g2v;La/ctf0;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    move-object/from16 v0, p1

    .line 30
    .line 31
    check-cast v0, La/wtu0;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v1, La/lib;

    .line 37
    .line 38
    invoke-direct {v1, v0, v7, v6}, La/lib;-><init>(La/wtu0;La/ctf0;La/g2v;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    move-object/from16 v0, p1

    .line 43
    .line 44
    check-cast v0, La/fru0;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v1, La/e3p0;

    .line 50
    .line 51
    invoke-direct {v1, v0, v7, v6}, La/e3p0;-><init>(La/fru0;La/ctf0;La/g2v;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_2
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, La/kou0;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v1, La/e3p0;

    .line 63
    .line 64
    invoke-direct {v1, v0, v7, v6}, La/e3p0;-><init>(La/kou0;La/ctf0;La/g2v;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :pswitch_3
    move-object/from16 v1, p1

    .line 69
    .line 70
    check-cast v1, La/ebu0;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v6, La/gbu0;

    .line 79
    .line 80
    new-instance v8, La/imm;

    .line 81
    .line 82
    new-instance v9, La/ilm;

    .line 83
    .line 84
    sget-object v10, La/s6t0;->a:La/pz40;

    .line 85
    .line 86
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    iget-object v10, v10, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 91
    .line 92
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    invoke-direct {v9, v10, v11}, La/ilm;-><init>(J)V

    .line 97
    .line 98
    .line 99
    new-instance v10, La/plm;

    .line 100
    .line 101
    iget-object v13, v1, La/ebu0;->a:Ljava/lang/String;

    .line 102
    .line 103
    sget-object v14, La/ha50;->b:La/ha50;

    .line 104
    .line 105
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    iget-object v11, v11, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 110
    .line 111
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 112
    .line 113
    .line 114
    move-result-wide v15

    .line 115
    sget-object v17, La/fa50;->a:La/fa50;

    .line 116
    .line 117
    move-object v12, v10

    .line 118
    invoke-direct/range {v12 .. v17}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    iget-object v11, v11, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 126
    .line 127
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 128
    .line 129
    .line 130
    move-result-wide v12

    .line 131
    const/4 v14, 0x1

    .line 132
    const/4 v15, 0x0

    .line 133
    sget-object v11, La/fmm;->a:La/fmm;

    .line 134
    .line 135
    invoke-direct/range {v8 .. v15}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 136
    .line 137
    .line 138
    iget-boolean v9, v1, La/ebu0;->d:Z

    .line 139
    .line 140
    iget-object v10, v1, La/ebu0;->e:La/lxw;

    .line 141
    .line 142
    iget-object v11, v1, La/ebu0;->c:La/x9u0;

    .line 143
    .line 144
    iget-object v1, v1, La/ebu0;->b:La/cau0;

    .line 145
    .line 146
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-eqz v11, :cond_4

    .line 151
    .line 152
    if-eq v11, v4, :cond_1

    .line 153
    .line 154
    if-ne v11, v2, :cond_0

    .line 155
    .line 156
    new-instance v2, La/z9u0;

    .line 157
    .line 158
    sget-object v10, La/pb10;->g:La/pb10;

    .line 159
    .line 160
    const-wide/16 v20, 0x0

    .line 161
    .line 162
    const/16 v22, 0x25e

    .line 163
    .line 164
    iget-object v9, v0, La/cls0;->c:La/g2v;

    .line 165
    .line 166
    const/4 v11, 0x0

    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, 0x7f130677

    .line 171
    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    const v17, 0x7f131690

    .line 176
    .line 177
    .line 178
    const-wide/16 v18, 0x2710

    .line 179
    .line 180
    invoke-static/range {v9 .. v22}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-direct {v2, v0}, La/z9u0;-><init>(La/mdm;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_3

    .line 193
    .line 194
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    packed-switch v0, :pswitch_data_1

    .line 199
    .line 200
    .line 201
    invoke-static {}, La/t9f;->b()V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_3

    .line 205
    .line 206
    :pswitch_4
    const v0, 0x7f08071e

    .line 207
    .line 208
    .line 209
    goto :goto_0

    .line 210
    :pswitch_5
    const v0, 0x7f080756

    .line 211
    .line 212
    .line 213
    goto :goto_0

    .line 214
    :pswitch_6
    const v0, 0x7f080a7a

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :pswitch_7
    const v0, 0x7f0805fc

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :pswitch_8
    const v0, 0x7f080b78

    .line 223
    .line 224
    .line 225
    :goto_0
    invoke-static {v1}, La/rsm0;->v(La/cau0;)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    if-eqz v2, :cond_2

    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    new-array v11, v3, [Ljava/lang/Object;

    .line 236
    .line 237
    iget-object v12, v7, La/ctf0;->b:La/lsm0;

    .line 238
    .line 239
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-virtual {v12, v2, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    goto :goto_1

    .line 248
    :cond_2
    move-object v2, v5

    .line 249
    :goto_1
    invoke-static {v1, v9}, La/rsm0;->t(La/cau0;Z)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    new-array v11, v3, [Ljava/lang/Object;

    .line 258
    .line 259
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 260
    .line 261
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-virtual {v7, v9, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-static {v1, v10}, La/rsm0;->u(La/cau0;La/lxw;)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v10

    .line 273
    if-eqz v10, :cond_3

    .line 274
    .line 275
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    new-instance v10, La/mtl;

    .line 280
    .line 281
    new-instance v11, La/itl;

    .line 282
    .line 283
    new-instance v12, La/wul;

    .line 284
    .line 285
    sget-object v13, La/lul;->e:La/lul;

    .line 286
    .line 287
    sget-object v14, La/oe9;->a:La/oe9;

    .line 288
    .line 289
    new-instance v15, La/ue9;

    .line 290
    .line 291
    new-array v4, v3, [Ljava/lang/Object;

    .line 292
    .line 293
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v7, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-direct {v15, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    const/16 v17, 0x0

    .line 305
    .line 306
    const/16 v18, 0x1

    .line 307
    .line 308
    const/16 v16, 0x1

    .line 309
    .line 310
    invoke-direct/range {v12 .. v18}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 311
    .line 312
    .line 313
    sget-object v4, La/rk;->m:La/rk;

    .line 314
    .line 315
    invoke-direct {v11, v12, v4}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 316
    .line 317
    .line 318
    filled-new-array {v11}, [La/itl;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-direct {v10, v4}, La/mtl;-><init>(La/a4x;)V

    .line 327
    .line 328
    .line 329
    move-object v5, v10

    .line 330
    :cond_3
    new-instance v4, La/y9u0;

    .line 331
    .line 332
    invoke-direct {v4, v0, v2, v9, v5}, La/y9u0;-><init>(ILjava/lang/String;Ljava/lang/String;La/mtl;)V

    .line 333
    .line 334
    .line 335
    move-object v2, v4

    .line 336
    goto :goto_2

    .line 337
    :cond_4
    sget-object v2, La/aau0;->a:La/aau0;

    .line 338
    .line 339
    :goto_2
    sget-object v0, La/cau0;->f:La/cau0;

    .line 340
    .line 341
    if-eq v1, v0, :cond_5

    .line 342
    .line 343
    const/4 v3, 0x1

    .line 344
    :cond_5
    invoke-direct {v6, v8, v2, v3}, La/gbu0;-><init>(La/imm;La/bau0;Z)V

    .line 345
    .line 346
    .line 347
    move-object v5, v6

    .line 348
    :goto_3
    return-object v5

    .line 349
    :pswitch_9
    move-object/from16 v1, p1

    .line 350
    .line 351
    check-cast v1, La/n9u0;

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    new-instance v4, La/o9u0;

    .line 360
    .line 361
    new-instance v8, La/imm;

    .line 362
    .line 363
    new-instance v9, La/ilm;

    .line 364
    .line 365
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 366
    .line 367
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 372
    .line 373
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v10

    .line 377
    invoke-direct {v9, v10, v11}, La/ilm;-><init>(J)V

    .line 378
    .line 379
    .line 380
    new-instance v10, La/plm;

    .line 381
    .line 382
    new-array v6, v3, [Ljava/lang/Object;

    .line 383
    .line 384
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 385
    .line 386
    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    const v11, 0x7f131767

    .line 391
    .line 392
    .line 393
    invoke-virtual {v7, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v13

    .line 397
    sget-object v14, La/ha50;->b:La/ha50;

    .line 398
    .line 399
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 404
    .line 405
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 406
    .line 407
    .line 408
    move-result-wide v15

    .line 409
    sget-object v17, La/fa50;->a:La/fa50;

    .line 410
    .line 411
    move-object v12, v10

    .line 412
    invoke-direct/range {v12 .. v17}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 413
    .line 414
    .line 415
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 416
    .line 417
    .line 418
    move-result-object v6

    .line 419
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 420
    .line 421
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v12

    .line 425
    const/4 v14, 0x0

    .line 426
    const/4 v15, 0x0

    .line 427
    sget-object v11, La/fmm;->a:La/fmm;

    .line 428
    .line 429
    invoke-direct/range {v8 .. v15}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 430
    .line 431
    .line 432
    iget-object v6, v1, La/n9u0;->b:La/o8u0;

    .line 433
    .line 434
    iget-object v1, v1, La/n9u0;->a:Ljava/util/List;

    .line 435
    .line 436
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    if-eqz v6, :cond_10

    .line 441
    .line 442
    iget-object v0, v0, La/cls0;->c:La/g2v;

    .line 443
    .line 444
    const/4 v7, 0x1

    .line 445
    if-eq v6, v7, :cond_7

    .line 446
    .line 447
    if-ne v6, v2, :cond_6

    .line 448
    .line 449
    new-instance v1, La/q8u0;

    .line 450
    .line 451
    sget-object v21, La/pb10;->g:La/pb10;

    .line 452
    .line 453
    const-wide/16 v31, 0x0

    .line 454
    .line 455
    const/16 v33, 0x25e

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    const/16 v23, 0x0

    .line 460
    .line 461
    const/16 v24, 0x0

    .line 462
    .line 463
    const/16 v25, 0x0

    .line 464
    .line 465
    const v26, 0x7f130677

    .line 466
    .line 467
    .line 468
    const/16 v27, 0x0

    .line 469
    .line 470
    const v28, 0x7f131690

    .line 471
    .line 472
    .line 473
    const-wide/16 v29, 0x2710

    .line 474
    .line 475
    move-object/from16 v20, v0

    .line 476
    .line 477
    invoke-static/range {v20 .. v33}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-direct {v1, v0}, La/q8u0;-><init>(La/mdm;)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_9

    .line 485
    .line 486
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_a

    .line 490
    .line 491
    :cond_7
    move-object/from16 v20, v0

    .line 492
    .line 493
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_8

    .line 498
    .line 499
    new-instance v1, La/q8u0;

    .line 500
    .line 501
    sget-object v21, La/pb10;->g:La/pb10;

    .line 502
    .line 503
    const-wide/16 v31, 0x0

    .line 504
    .line 505
    const/16 v33, 0x25e

    .line 506
    .line 507
    const/16 v22, 0x0

    .line 508
    .line 509
    const/16 v23, 0x0

    .line 510
    .line 511
    const/16 v24, 0x0

    .line 512
    .line 513
    const/16 v25, 0x0

    .line 514
    .line 515
    const v26, 0x7f130677

    .line 516
    .line 517
    .line 518
    const/16 v27, 0x0

    .line 519
    .line 520
    const v28, 0x7f131690

    .line 521
    .line 522
    .line 523
    const-wide/16 v29, 0x2710

    .line 524
    .line 525
    invoke-static/range {v20 .. v33}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-direct {v1, v0}, La/q8u0;-><init>(La/mdm;)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_9

    .line 533
    .line 534
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 535
    .line 536
    const/16 v2, 0xa

    .line 537
    .line 538
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 543
    .line 544
    .line 545
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    if-eqz v2, :cond_f

    .line 554
    .line 555
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    check-cast v2, La/c8u0;

    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    new-instance v6, La/s7u0;

    .line 565
    .line 566
    iget-object v7, v2, La/c8u0;->a:La/mbu0;

    .line 567
    .line 568
    iget v7, v7, La/mbu0;->a:I

    .line 569
    .line 570
    iget-object v9, v2, La/c8u0;->e:Ljava/lang/String;

    .line 571
    .line 572
    new-instance v21, La/uui0;

    .line 573
    .line 574
    iget-object v11, v2, La/c8u0;->b:Ljava/lang/String;

    .line 575
    .line 576
    iget-object v13, v2, La/c8u0;->c:Ljava/lang/String;

    .line 577
    .line 578
    const/4 v15, 0x0

    .line 579
    const/16 v16, 0x3a

    .line 580
    .line 581
    const/4 v12, 0x0

    .line 582
    const/4 v14, 0x0

    .line 583
    move-object/from16 v10, v21

    .line 584
    .line 585
    invoke-direct/range {v10 .. v16}, La/uui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;Ljava/lang/Integer;I)V

    .line 586
    .line 587
    .line 588
    new-instance v13, La/n0x;

    .line 589
    .line 590
    new-instance v10, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 593
    .line 594
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    iget-object v2, v2, La/c8u0;->d:Ljava/lang/String;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 600
    .line 601
    .line 602
    move-result v11

    .line 603
    if-nez v11, :cond_9

    .line 604
    .line 605
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 606
    .line 607
    .line 608
    const/4 v11, 0x1

    .line 609
    goto :goto_6

    .line 610
    :cond_9
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 611
    .line 612
    invoke-static {v2, v11, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 613
    .line 614
    .line 615
    move-result v11

    .line 616
    if-nez v11, :cond_a

    .line 617
    .line 618
    const-string v11, "https://"

    .line 619
    .line 620
    invoke-static {v2, v11, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 621
    .line 622
    .line 623
    move-result v11

    .line 624
    if-eqz v11, :cond_b

    .line 625
    .line 626
    :cond_a
    const/4 v11, 0x1

    .line 627
    goto :goto_5

    .line 628
    :cond_b
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 629
    .line 630
    .line 631
    move-result v11

    .line 632
    const/16 v12, 0x2f

    .line 633
    .line 634
    if-lez v11, :cond_c

    .line 635
    .line 636
    const-string v11, "/"

    .line 637
    .line 638
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 639
    .line 640
    .line 641
    move-result v11

    .line 642
    if-nez v11, :cond_c

    .line 643
    .line 644
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    :cond_c
    const/4 v11, 0x1

    .line 648
    new-array v14, v11, [C

    .line 649
    .line 650
    aput-char v12, v14, v3

    .line 651
    .line 652
    invoke-static {v2, v14}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v12

    .line 656
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    goto :goto_6

    .line 660
    :goto_5
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    :goto_6
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v10

    .line 670
    invoke-direct {v13, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    const-string v10, "/glyph/"

    .line 674
    .line 675
    invoke-static {v2, v10, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 676
    .line 677
    .line 678
    move-result v10

    .line 679
    if-nez v10, :cond_e

    .line 680
    .line 681
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    if-nez v2, :cond_d

    .line 686
    .line 687
    goto :goto_7

    .line 688
    :cond_d
    move-object v14, v5

    .line 689
    goto :goto_8

    .line 690
    :cond_e
    :goto_7
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 691
    .line 692
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 697
    .line 698
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 699
    .line 700
    .line 701
    move-result-wide v14

    .line 702
    new-instance v2, La/y3d;

    .line 703
    .line 704
    invoke-direct {v2, v14, v15}, La/y3d;-><init>(J)V

    .line 705
    .line 706
    .line 707
    move-object v14, v2

    .line 708
    :goto_8
    new-instance v22, La/nui0;

    .line 709
    .line 710
    const v2, 0x7f080f81

    .line 711
    .line 712
    .line 713
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    const/16 v17, 0x0

    .line 718
    .line 719
    const/16 v18, 0xf2

    .line 720
    .line 721
    const/4 v12, 0x0

    .line 722
    const/4 v15, 0x0

    .line 723
    const/16 v16, 0x0

    .line 724
    .line 725
    move/from16 v19, v11

    .line 726
    .line 727
    move-object/from16 v10, v22

    .line 728
    .line 729
    move-object v11, v2

    .line 730
    invoke-direct/range {v10 .. v18}, La/nui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;La/y3d;La/rc5;FI)V

    .line 731
    .line 732
    .line 733
    new-instance v2, La/fvi0;

    .line 734
    .line 735
    invoke-direct {v2, v5}, La/fvi0;-><init>(La/y3d;)V

    .line 736
    .line 737
    .line 738
    sget-object v26, La/wui0;->b:La/wui0;

    .line 739
    .line 740
    new-instance v20, La/rqm;

    .line 741
    .line 742
    const/16 v28, 0x0

    .line 743
    .line 744
    const/16 v29, 0x138

    .line 745
    .line 746
    const/16 v24, 0x0

    .line 747
    .line 748
    const/16 v25, 0x0

    .line 749
    .line 750
    const/16 v27, 0x1

    .line 751
    .line 752
    move-object/from16 v23, v2

    .line 753
    .line 754
    invoke-direct/range {v20 .. v29}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 755
    .line 756
    .line 757
    move-object/from16 v2, v20

    .line 758
    .line 759
    invoke-direct {v6, v7, v9, v2}, La/s7u0;-><init>(ILjava/lang/String;La/rqm;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    goto/16 :goto_4

    .line 766
    .line 767
    :cond_f
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    new-instance v1, La/p8u0;

    .line 772
    .line 773
    invoke-direct {v1, v0}, La/p8u0;-><init>(La/a4x;)V

    .line 774
    .line 775
    .line 776
    goto :goto_9

    .line 777
    :cond_10
    sget-object v1, La/r8u0;->a:La/r8u0;

    .line 778
    .line 779
    :goto_9
    invoke-direct {v4, v8, v1}, La/o9u0;-><init>(La/imm;La/s8u0;)V

    .line 780
    .line 781
    .line 782
    move-object v5, v4

    .line 783
    :goto_a
    return-object v5

    .line 784
    :pswitch_a
    move-object/from16 v0, p1

    .line 785
    .line 786
    check-cast v0, La/b0u0;

    .line 787
    .line 788
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    new-instance v1, La/v6o;

    .line 792
    .line 793
    invoke-direct {v1, v0, v7, v6}, La/v6o;-><init>(La/b0u0;La/ctf0;La/g2v;)V

    .line 794
    .line 795
    .line 796
    return-object v1

    .line 797
    :pswitch_b
    move-object/from16 v0, p1

    .line 798
    .line 799
    check-cast v0, La/ubt0;

    .line 800
    .line 801
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    new-instance v1, La/ov0;

    .line 805
    .line 806
    invoke-direct {v1, v0, v7, v6}, La/ov0;-><init>(La/ubt0;La/ctf0;La/g2v;)V

    .line 807
    .line 808
    .line 809
    return-object v1

    .line 810
    :pswitch_c
    move-object/from16 v0, p1

    .line 811
    .line 812
    check-cast v0, La/wat0;

    .line 813
    .line 814
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    new-instance v1, La/s7p0;

    .line 818
    .line 819
    invoke-direct {v1, v0, v7, v6}, La/s7p0;-><init>(La/wat0;La/ctf0;La/g2v;)V

    .line 820
    .line 821
    .line 822
    return-object v1

    .line 823
    :pswitch_d
    move-object/from16 v0, p1

    .line 824
    .line 825
    check-cast v0, La/aat0;

    .line 826
    .line 827
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    new-instance v1, La/s7p0;

    .line 831
    .line 832
    invoke-direct {v1, v0, v7, v6}, La/s7p0;-><init>(La/aat0;La/ctf0;La/g2v;)V

    .line 833
    .line 834
    .line 835
    return-object v1

    .line 836
    :pswitch_e
    move-object/from16 v0, p1

    .line 837
    .line 838
    check-cast v0, La/s5t0;

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    new-instance v1, La/by8;

    .line 844
    .line 845
    invoke-direct {v1, v0, v7, v6}, La/by8;-><init>(La/s5t0;La/ctf0;La/g2v;)V

    .line 846
    .line 847
    .line 848
    return-object v1

    .line 849
    :pswitch_f
    move-object/from16 v0, p1

    .line 850
    .line 851
    check-cast v0, La/pks0;

    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    new-instance v1, La/mya;

    .line 857
    .line 858
    invoke-direct {v1, v0, v6, v7}, La/mya;-><init>(La/pks0;La/g2v;La/ctf0;)V

    .line 859
    .line 860
    .line 861
    return-object v1

    .line 862
    nop

    .line 863
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_8
        :pswitch_4
        :pswitch_5
        :pswitch_8
    .end packed-switch
.end method
