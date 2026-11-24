.class public final synthetic La/wt7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/au7;


# direct methods
.method public synthetic constructor <init>(La/au7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wt7;->a:B

    iput-object p1, p0, La/wt7;->b:La/au7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wt7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/wt7;->b:La/au7;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/au7;->U1:La/yk5;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/au7;->U1:La/yk5;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    sget-object v1, La/au7;->U1:La/yk5;

    .line 40
    .line 41
    iget-object v0, v0, La/au7;->Q1:La/fiu0;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    const-string v0, "viewModelFactory"

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v2

    .line 52
    :pswitch_2
    sget-object v1, La/au7;->U1:La/yk5;

    .line 53
    .line 54
    invoke-virtual {v0}, La/au7;->H0()La/k3t0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v1, La/pt7;->a:La/pt7;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_3
    sget-object v1, La/au7;->U1:La/yk5;

    .line 67
    .line 68
    invoke-virtual {v0}, La/au7;->H0()La/k3t0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, La/jt7;->a:La/jt7;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_4
    sget-object v1, La/au7;->U1:La/yk5;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :goto_0
    if-eqz v1, :cond_e

    .line 87
    .line 88
    invoke-virtual {v1}, Landroidx/fragment/app/e;->P()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    add-int/lit8 v3, v3, -0x1

    .line 93
    .line 94
    :goto_1
    if-ltz v3, :cond_c

    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget-object v4, v4, La/zb5;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v1, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    instance-of v5, v4, La/ocl0;

    .line 107
    .line 108
    if-eqz v5, :cond_b

    .line 109
    .line 110
    check-cast v4, La/ocl0;

    .line 111
    .line 112
    new-instance v1, La/wt7;

    .line 113
    .line 114
    const/4 v3, 0x7

    .line 115
    invoke-direct {v1, v0, v3}, La/wt7;-><init>(La/au7;B)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v4, v1}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    sget-object v1, La/tt7;->a:Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-virtual {v0}, La/au7;->G0()Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget-wide v3, v1, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;->a:J

    .line 129
    .line 130
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v1, v1, La/cb50;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v3, v4, v1}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    new-instance v3, La/wt7;

    .line 141
    .line 142
    const/16 v4, 0x8

    .line 143
    .line 144
    invoke-direct {v3, v0, v4}, La/wt7;-><init>(La/au7;B)V

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v3}, La/tt7;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)La/eai;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    sget-object v1, La/st7;->a:Ljava/util/LinkedHashMap;

    .line 152
    .line 153
    invoke-virtual {v0}, La/au7;->G0()Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-wide v3, v1, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;->a:J

    .line 158
    .line 159
    invoke-static {v0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-object v1, v1, La/cb50;->a:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v3, v4, v1}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iget-object v3, v8, La/eai;->g:La/n5d0;

    .line 170
    .line 171
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, La/tga0;

    .line 176
    .line 177
    invoke-virtual {v8}, La/eai;->a()La/b8h0;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    iget-object v5, v8, La/eai;->i:La/n5d0;

    .line 182
    .line 183
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, La/hqp0;

    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    sget-object v6, La/st7;->a:Ljava/util/LinkedHashMap;

    .line 199
    .line 200
    invoke-virtual {v6, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    check-cast v9, La/cai;

    .line 205
    .line 206
    const-string v10, "Cannot create dependency "

    .line 207
    .line 208
    if-nez v9, :cond_5

    .line 209
    .line 210
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    invoke-virtual {v9}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    instance-of v11, v9, La/af3;

    .line 222
    .line 223
    if-eqz v11, :cond_1

    .line 224
    .line 225
    check-cast v9, La/af3;

    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_1
    move-object v9, v2

    .line 229
    :goto_2
    const-class v11, La/ut7;

    .line 230
    .line 231
    if-eqz v9, :cond_4

    .line 232
    .line 233
    invoke-interface {v9}, La/af3;->d()La/wcf0;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-virtual {v9, v11}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    check-cast v9, La/o5d0;

    .line 242
    .line 243
    if-eqz v9, :cond_2

    .line 244
    .line 245
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    check-cast v9, La/ze3;

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_2
    move-object v9, v2

    .line 253
    :goto_3
    instance-of v12, v9, La/ut7;

    .line 254
    .line 255
    if-nez v12, :cond_3

    .line 256
    .line 257
    move-object v9, v2

    .line 258
    :cond_3
    check-cast v9, La/ut7;

    .line 259
    .line 260
    if-eqz v9, :cond_4

    .line 261
    .line 262
    new-instance v9, La/cai;

    .line 263
    .line 264
    invoke-direct {v9, v3, v4, v5}, La/cai;-><init>(La/tga0;La/b8h0;La/hqp0;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v6, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_4
    invoke-static {v11, v10}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_7

    .line 279
    .line 280
    :cond_5
    :goto_4
    iput-object v9, v0, La/au7;->O1:La/cai;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    instance-of v3, v1, La/af3;

    .line 294
    .line 295
    if-eqz v3, :cond_6

    .line 296
    .line 297
    check-cast v1, La/af3;

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_6
    move-object v1, v2

    .line 301
    :goto_5
    const-class v3, La/bu7;

    .line 302
    .line 303
    if-eqz v1, :cond_a

    .line 304
    .line 305
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, La/o5d0;

    .line 314
    .line 315
    if-eqz v1, :cond_7

    .line 316
    .line 317
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, La/ze3;

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_7
    move-object v1, v2

    .line 325
    :goto_6
    instance-of v4, v1, La/bu7;

    .line 326
    .line 327
    if-nez v4, :cond_8

    .line 328
    .line 329
    move-object v1, v2

    .line 330
    :cond_8
    check-cast v1, La/bu7;

    .line 331
    .line 332
    if-eqz v1, :cond_a

    .line 333
    .line 334
    invoke-virtual {v0}, La/au7;->G0()Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    iget-object v9, v0, La/au7;->O1:La/cai;

    .line 343
    .line 344
    if-eqz v9, :cond_9

    .line 345
    .line 346
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v6, v1, La/bu7;->a:La/cad;

    .line 353
    .line 354
    iget-object v12, v1, La/bu7;->b:La/ctf0;

    .line 355
    .line 356
    iget-object v13, v1, La/bu7;->c:La/m1e;

    .line 357
    .line 358
    iget-object v14, v1, La/bu7;->d:La/pmi;

    .line 359
    .line 360
    iget-object v15, v1, La/bu7;->e:La/gst0;

    .line 361
    .line 362
    iget-object v0, v1, La/bu7;->f:La/ntu;

    .line 363
    .line 364
    iget-object v2, v1, La/bu7;->g:La/xi70;

    .line 365
    .line 366
    iget-object v3, v1, La/bu7;->h:La/s64;

    .line 367
    .line 368
    iget-object v4, v1, La/bu7;->i:La/kt2;

    .line 369
    .line 370
    iget-object v5, v1, La/bu7;->j:La/pru;

    .line 371
    .line 372
    iget-object v1, v1, La/bu7;->k:La/bzt;

    .line 373
    .line 374
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-object/from16 v20, v5

    .line 387
    .line 388
    new-instance v5, La/dai;

    .line 389
    .line 390
    move-object/from16 v16, v0

    .line 391
    .line 392
    move-object/from16 v21, v1

    .line 393
    .line 394
    move-object/from16 v17, v2

    .line 395
    .line 396
    move-object/from16 v18, v3

    .line 397
    .line 398
    move-object/from16 v19, v4

    .line 399
    .line 400
    invoke-direct/range {v5 .. v21}, La/dai;-><init>(La/cad;La/pcl0;La/eai;La/cai;Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;La/i1w0;La/ctf0;La/m1e;La/pmi;La/gst0;La/ntu;La/xi70;La/s64;La/kt2;La/pru;La/bzt;)V

    .line 401
    .line 402
    .line 403
    move-object v2, v5

    .line 404
    goto :goto_7

    .line 405
    :cond_9
    const-string v0, "betsOnPlayersFeature"

    .line 406
    .line 407
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v2

    .line 411
    :cond_a
    invoke-static {v3, v10}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_b
    add-int/lit8 v3, v3, -0x1

    .line 420
    .line 421
    goto/16 :goto_1

    .line 422
    .line 423
    :cond_c
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 424
    .line 425
    if-eqz v1, :cond_d

    .line 426
    .line 427
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_d
    move-object v1, v2

    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :cond_e
    const-string v0, "Can\'t find feature provider!"

    .line 437
    .line 438
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :goto_7
    return-object v2

    .line 442
    :pswitch_5
    sget-object v1, La/au7;->U1:La/yk5;

    .line 443
    .line 444
    invoke-virtual {v0}, La/au7;->H0()La/k3t0;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    sget-object v1, La/ot7;->a:La/ot7;

    .line 449
    .line 450
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_6
    sget-object v1, La/au7;->U1:La/yk5;

    .line 457
    .line 458
    invoke-virtual {v0}, La/au7;->H0()La/k3t0;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    sget-object v1, La/gt7;->a:La/gt7;

    .line 463
    .line 464
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_7
    sget-object v1, La/au7;->U1:La/yk5;

    .line 471
    .line 472
    invoke-virtual {v0}, La/au7;->H0()La/k3t0;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    sget-object v1, La/it7;->a:La/it7;

    .line 477
    .line 478
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object v0

    .line 484
    nop

    .line 485
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
