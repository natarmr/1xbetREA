.class public final synthetic La/itn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/itn0;->a:B

    iput-object p1, p0, La/itn0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/itn0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/itn0;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    const v6, 0x799532c4

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    iget-object v11, v0, La/itn0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, v0, La/itn0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/pz40;

    .line 26
    .line 27
    check-cast v11, La/gy40;

    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, La/lwk;

    .line 32
    .line 33
    new-instance v1, La/pr0;

    .line 34
    .line 35
    const/16 v2, 0x15

    .line 36
    .line 37
    invoke-direct {v1, v0, v11, v2}, La/pr0;-><init>(La/pz40;Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_0
    check-cast v0, La/mie0;

    .line 42
    .line 43
    check-cast v11, La/x0q0;

    .line 44
    .line 45
    move-object/from16 v1, p1

    .line 46
    .line 47
    check-cast v1, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/bby;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    invoke-interface {v0, v9}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object v0, v11, La/x0q0;->y:La/duj;

    .line 62
    .line 63
    new-instance v2, La/a6p0;

    .line 64
    .line 65
    const/16 v3, 0xa

    .line 66
    .line 67
    invoke-direct {v2, v1, v11, v3}, La/a6p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_1
    check-cast v0, La/ctf0;

    .line 77
    .line 78
    check-cast v11, La/rpt;

    .line 79
    .line 80
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, La/tup0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v11}, La/rpt;->k()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v11, La/uup0;

    .line 95
    .line 96
    new-array v3, v7, [Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 99
    .line 100
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const v4, 0x7f1314e0

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    new-array v3, v7, [Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const v4, 0x7f1314df

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const v3, 0x7f1314de

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    iget-object v15, v1, La/tup0;->a:Ljava/lang/String;

    .line 140
    .line 141
    new-instance v16, La/wul;

    .line 142
    .line 143
    sget-object v17, La/lul;->e:La/lul;

    .line 144
    .line 145
    sget-object v18, La/oe9;->a:La/oe9;

    .line 146
    .line 147
    new-instance v1, La/ue9;

    .line 148
    .line 149
    new-array v2, v7, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const v3, 0x7f1314d9

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-direct {v1, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const/16 v22, 0x1

    .line 168
    .line 169
    const/16 v20, 0x1

    .line 170
    .line 171
    move-object/from16 v19, v1

    .line 172
    .line 173
    invoke-direct/range {v16 .. v22}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 174
    .line 175
    .line 176
    new-instance v1, La/wul;

    .line 177
    .line 178
    new-instance v2, La/ue9;

    .line 179
    .line 180
    new-array v3, v7, [Ljava/lang/Object;

    .line 181
    .line 182
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const v4, 0x7f13032f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-direct {v2, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v23, 0x1

    .line 199
    .line 200
    const/16 v21, 0x1

    .line 201
    .line 202
    move-object/from16 v20, v2

    .line 203
    .line 204
    move-object/from16 v19, v18

    .line 205
    .line 206
    move-object/from16 v18, v17

    .line 207
    .line 208
    move-object/from16 v17, v1

    .line 209
    .line 210
    invoke-direct/range {v17 .. v23}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 211
    .line 212
    .line 213
    invoke-direct/range {v11 .. v17}, La/uup0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/wul;La/wul;)V

    .line 214
    .line 215
    .line 216
    return-object v11

    .line 217
    :pswitch_2
    check-cast v0, La/ykp0;

    .line 218
    .line 219
    check-cast v11, La/gkp0;

    .line 220
    .line 221
    move-object/from16 v1, p1

    .line 222
    .line 223
    check-cast v1, La/k0w0;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v2, v0, La/ykp0;->v:La/rl70;

    .line 229
    .line 230
    check-cast v11, La/ekp0;

    .line 231
    .line 232
    iget-object v3, v11, La/ekp0;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, La/qkp0;

    .line 239
    .line 240
    iget-wide v4, v4, La/qkp0;->a:J

    .line 241
    .line 242
    iget-object v0, v0, La/ykp0;->u:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v4, v5, v3, v0}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_3
    check-cast v0, La/gjp0;

    .line 258
    .line 259
    check-cast v11, La/ajp0;

    .line 260
    .line 261
    move-object/from16 v1, p1

    .line 262
    .line 263
    check-cast v1, La/hcz;

    .line 264
    .line 265
    sget-object v2, La/ajp0;->r2:La/s9m0;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object v2, v0, La/gjp0;->a:La/a4x;

    .line 271
    .line 272
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    new-instance v4, La/adn0;

    .line 277
    .line 278
    const/16 v5, 0x13

    .line 279
    .line 280
    invoke-direct {v4, v2, v5}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 281
    .line 282
    .line 283
    new-instance v5, La/zip0;

    .line 284
    .line 285
    invoke-direct {v5, v2, v11, v0, v7}, La/zip0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 286
    .line 287
    .line 288
    new-instance v0, La/ugd;

    .line 289
    .line 290
    invoke-direct {v0, v6, v10, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v3, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 294
    .line 295
    .line 296
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object v0

    .line 299
    :pswitch_4
    check-cast v0, La/ngp0;

    .line 300
    .line 301
    check-cast v11, La/cp;

    .line 302
    .line 303
    move-object/from16 v1, p1

    .line 304
    .line 305
    check-cast v1, Landroid/view/View;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    iget-object v0, v0, La/ngp0;->g:La/yj5;

    .line 311
    .line 312
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v0, v1}, La/yj5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_5
    check-cast v0, La/wbp0;

    .line 323
    .line 324
    check-cast v11, La/l8p0;

    .line 325
    .line 326
    move-object/from16 v1, p1

    .line 327
    .line 328
    check-cast v1, La/k0w0;

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v2, v0, La/wbp0;->u:La/vqc;

    .line 334
    .line 335
    new-instance v3, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 336
    .line 337
    iget-object v0, v0, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 338
    .line 339
    iget-wide v4, v0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 340
    .line 341
    iget-object v0, v11, La/l8p0;->a:Ljava/lang/String;

    .line 342
    .line 343
    invoke-direct {v3, v4, v5, v0}, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;-><init>(JLjava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$playerTransfersScreen$1;

    .line 350
    .line 351
    invoke-direct {v0, v2, v3}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$playerTransfersScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_6
    check-cast v0, La/wbp0;

    .line 361
    .line 362
    check-cast v11, La/a8p0;

    .line 363
    .line 364
    move-object/from16 v1, p1

    .line 365
    .line 366
    check-cast v1, La/k0w0;

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object v2, v0, La/wbp0;->u:La/vqc;

    .line 372
    .line 373
    new-instance v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 374
    .line 375
    iget-wide v4, v11, La/a8p0;->a:J

    .line 376
    .line 377
    iget-object v0, v0, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 378
    .line 379
    iget-wide v6, v0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->b:J

    .line 380
    .line 381
    iget-object v8, v0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->c:Ljava/lang/String;

    .line 382
    .line 383
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;-><init>(JJLjava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;

    .line 390
    .line 391
    invoke-direct {v0, v2, v3}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 395
    .line 396
    .line 397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object v0

    .line 400
    :pswitch_7
    check-cast v0, La/qbp0;

    .line 401
    .line 402
    check-cast v11, La/pz40;

    .line 403
    .line 404
    move-object/from16 v1, p1

    .line 405
    .line 406
    check-cast v1, La/iz3;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    iget-object v0, v0, La/qbp0;->d:Ljava/lang/String;

    .line 412
    .line 413
    invoke-interface {v11, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_8
    check-cast v0, La/v8p0;

    .line 420
    .line 421
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 422
    .line 423
    move-object/from16 v1, p1

    .line 424
    .line 425
    check-cast v1, La/hcz;

    .line 426
    .line 427
    sget-object v2, La/x8p0;->l2:La/s2m0;

    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iget-object v2, v0, La/v8p0;->a:La/a4x;

    .line 433
    .line 434
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 435
    .line 436
    .line 437
    move-result v4

    .line 438
    new-instance v5, La/adn0;

    .line 439
    .line 440
    invoke-direct {v5, v2, v3}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 441
    .line 442
    .line 443
    new-instance v3, La/h8w;

    .line 444
    .line 445
    const/16 v7, 0x1d

    .line 446
    .line 447
    invoke-direct {v3, v2, v0, v11, v7}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 448
    .line 449
    .line 450
    new-instance v0, La/ugd;

    .line 451
    .line 452
    invoke-direct {v0, v6, v10, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v4, v9, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 456
    .line 457
    .line 458
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object v0

    .line 461
    :pswitch_9
    check-cast v0, La/q4p0;

    .line 462
    .line 463
    check-cast v11, La/xcp;

    .line 464
    .line 465
    move-object/from16 v1, p1

    .line 466
    .line 467
    check-cast v1, La/k0w0;

    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    iget-object v12, v0, La/q4p0;->v:La/ifp;

    .line 473
    .line 474
    iget-wide v13, v11, La/xcp;->a:J

    .line 475
    .line 476
    iget-object v15, v11, La/xcp;->b:La/tnp0;

    .line 477
    .line 478
    iget-object v0, v11, La/xcp;->c:Ljava/lang/String;

    .line 479
    .line 480
    invoke-interface {v15}, La/tnp0;->c()J

    .line 481
    .line 482
    .line 483
    move-result-wide v17

    .line 484
    instance-of v2, v15, La/rnp0;

    .line 485
    .line 486
    if-eqz v2, :cond_1

    .line 487
    .line 488
    move-object v9, v15

    .line 489
    check-cast v9, La/rnp0;

    .line 490
    .line 491
    :cond_1
    if-eqz v9, :cond_2

    .line 492
    .line 493
    iget-wide v4, v9, La/rnp0;->c:J

    .line 494
    .line 495
    :cond_2
    move-wide/from16 v19, v4

    .line 496
    .line 497
    iget-object v2, v11, La/xcp;->i:Ljava/lang/String;

    .line 498
    .line 499
    move-object/from16 v16, v0

    .line 500
    .line 501
    move-object/from16 v21, v2

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v21}, La/ifp;->a(JLa/tnp0;Ljava/lang/String;JJLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 508
    .line 509
    .line 510
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 511
    .line 512
    return-object v0

    .line 513
    :pswitch_a
    check-cast v0, La/mhe;

    .line 514
    .line 515
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 516
    .line 517
    move-object/from16 v1, p1

    .line 518
    .line 519
    check-cast v1, La/hcz;

    .line 520
    .line 521
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    iget-object v0, v0, La/mhe;->b:La/a4x;

    .line 525
    .line 526
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    new-instance v4, La/adn0;

    .line 531
    .line 532
    const/16 v5, 0xc

    .line 533
    .line 534
    invoke-direct {v4, v0, v5}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 535
    .line 536
    .line 537
    new-instance v5, La/njh0;

    .line 538
    .line 539
    invoke-direct {v5, v0, v11, v3}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 540
    .line 541
    .line 542
    new-instance v0, La/ugd;

    .line 543
    .line 544
    const v3, 0x2fd4df92

    .line 545
    .line 546
    .line 547
    invoke-direct {v0, v3, v10, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1, v2, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 551
    .line 552
    .line 553
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0

    .line 556
    :pswitch_b
    check-cast v0, La/x77;

    .line 557
    .line 558
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 559
    .line 560
    move-object/from16 v1, p1

    .line 561
    .line 562
    check-cast v1, La/hcz;

    .line 563
    .line 564
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    iget-object v2, v0, La/x77;->h:La/rv7;

    .line 568
    .line 569
    instance-of v2, v2, La/pv7;

    .line 570
    .line 571
    const/4 v3, 0x3

    .line 572
    if-eqz v2, :cond_3

    .line 573
    .line 574
    new-instance v2, La/nhl0;

    .line 575
    .line 576
    const/16 v4, 0xf

    .line 577
    .line 578
    invoke-direct {v2, v0, v11, v4}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 579
    .line 580
    .line 581
    new-instance v4, La/ugd;

    .line 582
    .line 583
    const v5, -0x5c39e5e4

    .line 584
    .line 585
    .line 586
    invoke-direct {v4, v5, v10, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    invoke-static {v1, v9, v9, v4, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 590
    .line 591
    .line 592
    :cond_3
    iget-object v2, v0, La/x77;->g:Ljava/util/ArrayList;

    .line 593
    .line 594
    new-instance v4, La/ofo0;

    .line 595
    .line 596
    const/4 v5, 0x6

    .line 597
    invoke-direct {v4, v5}, La/ofo0;-><init>(B)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 601
    .line 602
    .line 603
    move-result v7

    .line 604
    new-instance v8, La/zcn0;

    .line 605
    .line 606
    invoke-direct {v8, v4, v2, v5}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 607
    .line 608
    .line 609
    new-instance v4, La/t9l0;

    .line 610
    .line 611
    invoke-direct {v4, v2, v5}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 612
    .line 613
    .line 614
    new-instance v5, La/h8w;

    .line 615
    .line 616
    const/16 v12, 0x1c

    .line 617
    .line 618
    invoke-direct {v5, v2, v0, v11, v12}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 619
    .line 620
    .line 621
    new-instance v2, La/ugd;

    .line 622
    .line 623
    invoke-direct {v2, v6, v10, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v7, v8, v4, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 627
    .line 628
    .line 629
    iget-boolean v2, v0, La/x77;->j:Z

    .line 630
    .line 631
    if-eqz v2, :cond_4

    .line 632
    .line 633
    iget-boolean v0, v0, La/x77;->k:Z

    .line 634
    .line 635
    if-nez v0, :cond_4

    .line 636
    .line 637
    sget-object v0, La/gq80;->f:La/ugd;

    .line 638
    .line 639
    invoke-static {v1, v9, v9, v0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 640
    .line 641
    .line 642
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_c
    check-cast v0, La/rio0;

    .line 646
    .line 647
    check-cast v11, La/gx10;

    .line 648
    .line 649
    move-object/from16 v1, p1

    .line 650
    .line 651
    check-cast v1, La/k0w0;

    .line 652
    .line 653
    iget-object v0, v0, La/rio0;->f0:La/jdk0;

    .line 654
    .line 655
    iget-object v2, v11, La/gx10;->b:La/vh0;

    .line 656
    .line 657
    iget-wide v11, v2, La/vh0;->g:J

    .line 658
    .line 659
    iget-object v13, v2, La/vh0;->b:Ljava/lang/String;

    .line 660
    .line 661
    iget-boolean v3, v2, La/vh0;->i:Z

    .line 662
    .line 663
    iget-wide v4, v2, La/vh0;->h:J

    .line 664
    .line 665
    iget-boolean v2, v2, La/vh0;->j:Z

    .line 666
    .line 667
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    const-wide/16 v14, 0x0

    .line 671
    .line 672
    const/16 v20, 0x1

    .line 673
    .line 674
    const/16 v21, 0x0

    .line 675
    .line 676
    const/16 v22, 0x0

    .line 677
    .line 678
    const/16 v23, 0x0

    .line 679
    .line 680
    const/16 v24, 0x0

    .line 681
    .line 682
    const-string v25, ""

    .line 683
    .line 684
    const/16 v26, 0x1

    .line 685
    .line 686
    move/from16 v19, v2

    .line 687
    .line 688
    move/from16 v16, v3

    .line 689
    .line 690
    move-wide/from16 v17, v4

    .line 691
    .line 692
    invoke-static/range {v11 .. v26}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v0, La/c8d;

    .line 703
    .line 704
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 705
    .line 706
    new-instance v2, La/v7d;

    .line 707
    .line 708
    invoke-direct {v2, v10, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 709
    .line 710
    .line 711
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 712
    .line 713
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 714
    .line 715
    return-object v0

    .line 716
    :pswitch_d
    check-cast v0, La/rio0;

    .line 717
    .line 718
    check-cast v11, La/vh0;

    .line 719
    .line 720
    move-object/from16 v1, p1

    .line 721
    .line 722
    check-cast v1, La/k0w0;

    .line 723
    .line 724
    iget-object v0, v0, La/rio0;->f0:La/jdk0;

    .line 725
    .line 726
    iget-wide v12, v11, La/vh0;->g:J

    .line 727
    .line 728
    iget-object v14, v11, La/vh0;->b:Ljava/lang/String;

    .line 729
    .line 730
    iget-boolean v2, v11, La/vh0;->i:Z

    .line 731
    .line 732
    iget-wide v3, v11, La/vh0;->h:J

    .line 733
    .line 734
    iget-boolean v5, v11, La/vh0;->j:Z

    .line 735
    .line 736
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    const-wide/16 v15, 0x0

    .line 740
    .line 741
    const/16 v21, 0x1

    .line 742
    .line 743
    const/16 v22, 0x0

    .line 744
    .line 745
    const/16 v23, 0x0

    .line 746
    .line 747
    const/16 v24, 0x0

    .line 748
    .line 749
    const/16 v25, 0x0

    .line 750
    .line 751
    const-string v26, ""

    .line 752
    .line 753
    const/16 v27, 0x1

    .line 754
    .line 755
    move/from16 v17, v2

    .line 756
    .line 757
    move-wide/from16 v18, v3

    .line 758
    .line 759
    move/from16 v20, v5

    .line 760
    .line 761
    invoke-static/range {v12 .. v27}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v0, La/c8d;

    .line 772
    .line 773
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 774
    .line 775
    new-instance v2, La/v7d;

    .line 776
    .line 777
    invoke-direct {v2, v10, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 778
    .line 779
    .line 780
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 781
    .line 782
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 783
    .line 784
    return-object v0

    .line 785
    :pswitch_e
    check-cast v0, La/rio0;

    .line 786
    .line 787
    move-object v6, v11

    .line 788
    check-cast v6, La/t270;

    .line 789
    .line 790
    move-object/from16 v9, p1

    .line 791
    .line 792
    check-cast v9, La/k0w0;

    .line 793
    .line 794
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    iget-object v1, v0, La/rio0;->o:La/oct;

    .line 798
    .line 799
    const/4 v7, 0x0

    .line 800
    const/16 v8, 0x17

    .line 801
    .line 802
    const-wide/16 v2, 0x0

    .line 803
    .line 804
    const/4 v4, 0x0

    .line 805
    const/4 v5, 0x0

    .line 806
    invoke-static/range {v1 .. v8}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v9, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 811
    .line 812
    .line 813
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 814
    .line 815
    return-object v0

    .line 816
    :pswitch_f
    check-cast v0, La/rio0;

    .line 817
    .line 818
    check-cast v11, La/d240;

    .line 819
    .line 820
    move-object/from16 v1, p1

    .line 821
    .line 822
    check-cast v1, La/k0w0;

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    iget-object v0, v0, La/rio0;->n:La/peg0;

    .line 828
    .line 829
    new-instance v2, La/fr1;

    .line 830
    .line 831
    new-instance v12, La/fs80;

    .line 832
    .line 833
    iget-object v13, v11, La/d240;->g:Ljava/lang/String;

    .line 834
    .line 835
    iget-wide v14, v11, La/d240;->d:J

    .line 836
    .line 837
    const/16 v20, 0x1

    .line 838
    .line 839
    const/16 v21, 0x5c

    .line 840
    .line 841
    const/16 v16, 0x0

    .line 842
    .line 843
    const/16 v17, 0x0

    .line 844
    .line 845
    const-wide/16 v18, 0x0

    .line 846
    .line 847
    invoke-direct/range {v12 .. v21}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 848
    .line 849
    .line 850
    invoke-direct {v2, v12, v9, v8}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 858
    .line 859
    .line 860
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 861
    .line 862
    return-object v0

    .line 863
    :pswitch_10
    check-cast v0, La/rio0;

    .line 864
    .line 865
    check-cast v11, La/c240;

    .line 866
    .line 867
    move-object/from16 v1, p1

    .line 868
    .line 869
    check-cast v1, La/k0w0;

    .line 870
    .line 871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    iget-object v0, v0, La/rio0;->n:La/peg0;

    .line 875
    .line 876
    iget-object v3, v11, La/c240;->g:Ljava/lang/String;

    .line 877
    .line 878
    iget-wide v6, v11, La/c240;->e:J

    .line 879
    .line 880
    cmp-long v4, v6, v4

    .line 881
    .line 882
    if-gtz v4, :cond_5

    .line 883
    .line 884
    goto :goto_0

    .line 885
    :cond_5
    move-object v3, v9

    .line 886
    :goto_0
    if-nez v3, :cond_6

    .line 887
    .line 888
    move-object v13, v2

    .line 889
    goto :goto_1

    .line 890
    :cond_6
    move-object v13, v3

    .line 891
    :goto_1
    iget-wide v14, v11, La/c240;->d:J

    .line 892
    .line 893
    new-instance v12, La/fs80;

    .line 894
    .line 895
    const/16 v16, 0x0

    .line 896
    .line 897
    const/16 v17, 0x0

    .line 898
    .line 899
    const/16 v20, 0x0

    .line 900
    .line 901
    const/16 v21, 0x6c

    .line 902
    .line 903
    move-wide/from16 v18, v6

    .line 904
    .line 905
    invoke-direct/range {v12 .. v21}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 906
    .line 907
    .line 908
    new-instance v2, La/fr1;

    .line 909
    .line 910
    invoke-direct {v2, v12, v9, v8}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 918
    .line 919
    .line 920
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 921
    .line 922
    return-object v0

    .line 923
    :pswitch_11
    check-cast v0, La/fho0;

    .line 924
    .line 925
    check-cast v11, La/gx10;

    .line 926
    .line 927
    move-object/from16 v1, p1

    .line 928
    .line 929
    check-cast v1, La/k0w0;

    .line 930
    .line 931
    iget-object v0, v0, La/fho0;->X:La/jdk0;

    .line 932
    .line 933
    iget-object v2, v11, La/gx10;->b:La/vh0;

    .line 934
    .line 935
    iget-wide v11, v2, La/vh0;->g:J

    .line 936
    .line 937
    iget-object v13, v2, La/vh0;->b:Ljava/lang/String;

    .line 938
    .line 939
    iget-boolean v3, v2, La/vh0;->i:Z

    .line 940
    .line 941
    iget-wide v4, v2, La/vh0;->h:J

    .line 942
    .line 943
    iget-boolean v2, v2, La/vh0;->j:Z

    .line 944
    .line 945
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    const-wide/16 v14, 0x0

    .line 949
    .line 950
    const/16 v20, 0x1

    .line 951
    .line 952
    const/16 v21, 0x0

    .line 953
    .line 954
    const/16 v22, 0x0

    .line 955
    .line 956
    const/16 v23, 0x0

    .line 957
    .line 958
    const/16 v24, 0x0

    .line 959
    .line 960
    const-string v25, ""

    .line 961
    .line 962
    const/16 v26, 0x1

    .line 963
    .line 964
    move/from16 v19, v2

    .line 965
    .line 966
    move/from16 v16, v3

    .line 967
    .line 968
    move-wide/from16 v17, v4

    .line 969
    .line 970
    invoke-static/range {v11 .. v26}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v0, La/c8d;

    .line 981
    .line 982
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 983
    .line 984
    new-instance v2, La/v7d;

    .line 985
    .line 986
    invoke-direct {v2, v10, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 987
    .line 988
    .line 989
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 990
    .line 991
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    return-object v0

    .line 994
    :pswitch_12
    check-cast v0, La/fho0;

    .line 995
    .line 996
    check-cast v11, La/zuc0;

    .line 997
    .line 998
    move-object/from16 v1, p1

    .line 999
    .line 1000
    check-cast v1, La/k0w0;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    iget-object v0, v0, La/fho0;->p:La/jh70;

    .line 1006
    .line 1007
    invoke-static {v0, v11}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v0, La/c8d;

    .line 1018
    .line 1019
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1020
    .line 1021
    new-instance v2, La/v7d;

    .line 1022
    .line 1023
    invoke-direct {v2, v10, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1024
    .line 1025
    .line 1026
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1027
    .line 1028
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :pswitch_13
    check-cast v0, La/fho0;

    .line 1032
    .line 1033
    move-object v6, v11

    .line 1034
    check-cast v6, La/t270;

    .line 1035
    .line 1036
    move-object/from16 v9, p1

    .line 1037
    .line 1038
    check-cast v9, La/k0w0;

    .line 1039
    .line 1040
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    iget-object v1, v0, La/fho0;->n:La/oct;

    .line 1044
    .line 1045
    const/4 v7, 0x0

    .line 1046
    const/16 v8, 0x17

    .line 1047
    .line 1048
    const-wide/16 v2, 0x0

    .line 1049
    .line 1050
    const/4 v4, 0x0

    .line 1051
    const/4 v5, 0x0

    .line 1052
    invoke-static/range {v1 .. v8}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    invoke-virtual {v9, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1057
    .line 1058
    .line 1059
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1060
    .line 1061
    return-object v0

    .line 1062
    :pswitch_14
    check-cast v0, La/fho0;

    .line 1063
    .line 1064
    check-cast v11, La/c240;

    .line 1065
    .line 1066
    move-object/from16 v1, p1

    .line 1067
    .line 1068
    check-cast v1, La/k0w0;

    .line 1069
    .line 1070
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1071
    .line 1072
    .line 1073
    iget-object v0, v0, La/fho0;->m:La/peg0;

    .line 1074
    .line 1075
    iget-object v3, v11, La/c240;->g:Ljava/lang/String;

    .line 1076
    .line 1077
    iget-wide v6, v11, La/c240;->e:J

    .line 1078
    .line 1079
    cmp-long v4, v6, v4

    .line 1080
    .line 1081
    if-gtz v4, :cond_7

    .line 1082
    .line 1083
    goto :goto_2

    .line 1084
    :cond_7
    move-object v3, v9

    .line 1085
    :goto_2
    if-nez v3, :cond_8

    .line 1086
    .line 1087
    move-object v13, v2

    .line 1088
    goto :goto_3

    .line 1089
    :cond_8
    move-object v13, v3

    .line 1090
    :goto_3
    iget-wide v14, v11, La/c240;->d:J

    .line 1091
    .line 1092
    new-instance v12, La/fs80;

    .line 1093
    .line 1094
    const/16 v16, 0x0

    .line 1095
    .line 1096
    const/16 v17, 0x0

    .line 1097
    .line 1098
    const/16 v20, 0x0

    .line 1099
    .line 1100
    const/16 v21, 0x6c

    .line 1101
    .line 1102
    move-wide/from16 v18, v6

    .line 1103
    .line 1104
    invoke-direct/range {v12 .. v21}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1105
    .line 1106
    .line 1107
    new-instance v2, La/fr1;

    .line 1108
    .line 1109
    invoke-direct {v2, v12, v9, v8}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1117
    .line 1118
    .line 1119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1120
    .line 1121
    return-object v0

    .line 1122
    :pswitch_15
    check-cast v0, La/fho0;

    .line 1123
    .line 1124
    check-cast v11, La/d240;

    .line 1125
    .line 1126
    move-object/from16 v1, p1

    .line 1127
    .line 1128
    check-cast v1, La/k0w0;

    .line 1129
    .line 1130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    iget-object v0, v0, La/fho0;->m:La/peg0;

    .line 1134
    .line 1135
    new-instance v2, La/fr1;

    .line 1136
    .line 1137
    new-instance v12, La/fs80;

    .line 1138
    .line 1139
    iget-object v13, v11, La/d240;->g:Ljava/lang/String;

    .line 1140
    .line 1141
    iget-wide v14, v11, La/d240;->d:J

    .line 1142
    .line 1143
    const/16 v20, 0x0

    .line 1144
    .line 1145
    const/16 v21, 0x7c

    .line 1146
    .line 1147
    const/16 v16, 0x0

    .line 1148
    .line 1149
    const/16 v17, 0x0

    .line 1150
    .line 1151
    const-wide/16 v18, 0x0

    .line 1152
    .line 1153
    invoke-direct/range {v12 .. v21}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1154
    .line 1155
    .line 1156
    invoke-direct {v2, v12, v9, v8}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1164
    .line 1165
    .line 1166
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1167
    .line 1168
    return-object v0

    .line 1169
    :pswitch_16
    check-cast v0, La/zco0;

    .line 1170
    .line 1171
    check-cast v11, La/kxv;

    .line 1172
    .line 1173
    iget-object v1, v11, La/kxv;->c:Ljava/lang/String;

    .line 1174
    .line 1175
    move-object/from16 v2, p1

    .line 1176
    .line 1177
    check-cast v2, La/k0w0;

    .line 1178
    .line 1179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    iget-object v12, v0, La/zco0;->d0:La/vjp;

    .line 1183
    .line 1184
    iget-boolean v0, v11, La/kxv;->i:Z

    .line 1185
    .line 1186
    if-eqz v0, :cond_9

    .line 1187
    .line 1188
    sget-object v0, La/j700;->b:La/j700;

    .line 1189
    .line 1190
    :goto_4
    move-object v13, v0

    .line 1191
    goto :goto_5

    .line 1192
    :cond_9
    sget-object v0, La/j700;->a:La/j700;

    .line 1193
    .line 1194
    goto :goto_4

    .line 1195
    :goto_5
    new-instance v14, La/m8h0;

    .line 1196
    .line 1197
    sget-object v0, La/xun;->a:La/xun;

    .line 1198
    .line 1199
    invoke-direct {v14, v1, v0, v7}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 1200
    .line 1201
    .line 1202
    iget-wide v3, v11, La/kxv;->a:J

    .line 1203
    .line 1204
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v15

    .line 1212
    iget-wide v3, v11, La/kxv;->b:J

    .line 1213
    .line 1214
    move-object/from16 v18, v1

    .line 1215
    .line 1216
    move-wide/from16 v16, v3

    .line 1217
    .line 1218
    invoke-virtual/range {v12 .. v18}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1223
    .line 1224
    .line 1225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1226
    .line 1227
    return-object v0

    .line 1228
    :pswitch_17
    check-cast v0, La/s9o0;

    .line 1229
    .line 1230
    check-cast v11, La/r9o0;

    .line 1231
    .line 1232
    move-object/from16 v1, p1

    .line 1233
    .line 1234
    check-cast v1, La/qpg0;

    .line 1235
    .line 1236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    iget-object v0, v0, La/s9o0;->b:La/f7k;

    .line 1240
    .line 1241
    invoke-virtual {v0, v1, v11}, La/f7k;->U(La/qpg0;Ljava/lang/Object;)V

    .line 1242
    .line 1243
    .line 1244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1245
    .line 1246
    return-object v0

    .line 1247
    :pswitch_18
    check-cast v0, La/zyn0;

    .line 1248
    .line 1249
    check-cast v11, La/g5l0;

    .line 1250
    .line 1251
    move-object/from16 v1, p1

    .line 1252
    .line 1253
    check-cast v1, La/k0w0;

    .line 1254
    .line 1255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    iget-object v0, v0, La/zyn0;->v:La/m6m0;

    .line 1259
    .line 1260
    iget-wide v2, v11, La/g5l0;->a:J

    .line 1261
    .line 1262
    iget-wide v4, v11, La/g5l0;->b:J

    .line 1263
    .line 1264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    new-instance v0, Lorg/xplatform/swipex/impl/navigation/SwipexInternalScreenFactory$getSwipexFilterScreen$1;

    .line 1268
    .line 1269
    invoke-direct {v0, v2, v3, v4, v5}, Lorg/xplatform/swipex/impl/navigation/SwipexInternalScreenFactory$getSwipexFilterScreen$1;-><init>(JJ)V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1273
    .line 1274
    .line 1275
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1276
    .line 1277
    return-object v0

    .line 1278
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1279
    .line 1280
    check-cast v11, La/t3q;

    .line 1281
    .line 1282
    move-object/from16 v1, p1

    .line 1283
    .line 1284
    check-cast v1, La/h2l0;

    .line 1285
    .line 1286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1290
    .line 1291
    .line 1292
    move-result v1

    .line 1293
    if-eq v1, v10, :cond_b

    .line 1294
    .line 1295
    if-eq v1, v8, :cond_a

    .line 1296
    .line 1297
    goto :goto_6

    .line 1298
    :cond_a
    new-instance v1, La/mvn0;

    .line 1299
    .line 1300
    invoke-direct {v1, v11}, La/mvn0;-><init>(La/t3q;)V

    .line 1301
    .line 1302
    .line 1303
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    goto :goto_6

    .line 1307
    :cond_b
    new-instance v1, La/lvn0;

    .line 1308
    .line 1309
    invoke-direct {v1, v11}, La/lvn0;-><init>(La/t3q;)V

    .line 1310
    .line 1311
    .line 1312
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1313
    .line 1314
    .line 1315
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1316
    .line 1317
    return-object v0

    .line 1318
    :pswitch_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1319
    .line 1320
    check-cast v11, La/b3q;

    .line 1321
    .line 1322
    move-object/from16 v1, p1

    .line 1323
    .line 1324
    check-cast v1, La/h2l0;

    .line 1325
    .line 1326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    sget-object v2, La/vtn0;->a:[I

    .line 1330
    .line 1331
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1332
    .line 1333
    .line 1334
    move-result v1

    .line 1335
    aget v1, v2, v1

    .line 1336
    .line 1337
    if-ne v1, v10, :cond_c

    .line 1338
    .line 1339
    new-instance v1, La/kvn0;

    .line 1340
    .line 1341
    invoke-direct {v1, v11}, La/kvn0;-><init>(La/b3q;)V

    .line 1342
    .line 1343
    .line 1344
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1348
    .line 1349
    return-object v0

    .line 1350
    :pswitch_1b
    check-cast v0, La/ktn0;

    .line 1351
    .line 1352
    check-cast v11, La/cp;

    .line 1353
    .line 1354
    move-object/from16 v1, p1

    .line 1355
    .line 1356
    check-cast v1, Ljava/lang/Throwable;

    .line 1357
    .line 1358
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1359
    .line 1360
    iget-object v0, v0, La/ktn0;->p:Landroid/widget/ImageView;

    .line 1361
    .line 1362
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v1

    .line 1366
    check-cast v1, La/stn0;

    .line 1367
    .line 1368
    iget-object v1, v1, La/stn0;->e:Ljava/lang/String;

    .line 1369
    .line 1370
    invoke-static {v0, v1}, La/u0d;->l(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1374
    .line 1375
    return-object v0

    .line 1376
    :pswitch_1c
    check-cast v0, La/jtn0;

    .line 1377
    .line 1378
    check-cast v11, La/cp;

    .line 1379
    .line 1380
    move-object/from16 v1, p1

    .line 1381
    .line 1382
    check-cast v1, Ljava/lang/Throwable;

    .line 1383
    .line 1384
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1385
    .line 1386
    iget-object v0, v0, La/jtn0;->k:Landroid/widget/ImageView;

    .line 1387
    .line 1388
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v1

    .line 1392
    check-cast v1, La/htn0;

    .line 1393
    .line 1394
    iget-object v1, v1, La/htn0;->e:Ljava/lang/String;

    .line 1395
    .line 1396
    invoke-static {v0, v1}, La/u0d;->l(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1400
    .line 1401
    return-object v0

    .line 1402
    nop

    .line 1403
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
