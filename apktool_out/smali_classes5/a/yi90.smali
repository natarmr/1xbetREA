.class public final synthetic La/yi90;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/yi90;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yi90;->a:B

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/16 v5, 0x14

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/dka0;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/k3t0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Throwable;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/cma0;

    .line 44
    .line 45
    iget-object v2, v0, La/cma0;->G:La/duj;

    .line 46
    .line 47
    new-instance v3, La/cz90;

    .line 48
    .line 49
    const/16 v4, 0x1b

    .line 50
    .line 51
    invoke-direct {v3, v0, v4}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_1
    move-object/from16 v1, p1

    .line 61
    .line 62
    check-cast v1, La/yka0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/k3t0;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_2
    move-object/from16 v1, p1

    .line 78
    .line 79
    check-cast v1, La/mka0;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La/k3t0;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_3
    move-object/from16 v1, p1

    .line 95
    .line 96
    check-cast v1, Ljava/lang/Throwable;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/xja0;

    .line 104
    .line 105
    iget-object v2, v0, La/xja0;->u:La/duj;

    .line 106
    .line 107
    new-instance v3, La/cz90;

    .line 108
    .line 109
    invoke-direct {v3, v0, v5}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_4
    move-object/from16 v1, p1

    .line 119
    .line 120
    check-cast v1, Ljava/lang/Throwable;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, La/xja0;

    .line 128
    .line 129
    iget-object v2, v0, La/xja0;->u:La/duj;

    .line 130
    .line 131
    new-instance v3, La/cz90;

    .line 132
    .line 133
    invoke-direct {v3, v0, v5}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_5
    move-object/from16 v1, p1

    .line 143
    .line 144
    check-cast v1, La/nha0;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, La/k3t0;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_6
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, Ljava/lang/Throwable;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, La/iha0;

    .line 169
    .line 170
    iget-object v2, v0, La/iha0;->s:La/duj;

    .line 171
    .line 172
    new-instance v3, La/cz90;

    .line 173
    .line 174
    invoke-direct {v3, v0, v4}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_7
    move-object/from16 v1, p1

    .line 184
    .line 185
    check-cast v1, Ljava/lang/Throwable;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, La/iha0;

    .line 193
    .line 194
    iget-object v2, v0, La/iha0;->s:La/duj;

    .line 195
    .line 196
    new-instance v3, La/cz90;

    .line 197
    .line 198
    invoke-direct {v3, v0, v4}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_8
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, La/yga0;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, La/k3t0;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_9
    move-object/from16 v1, p1

    .line 225
    .line 226
    check-cast v1, La/n7a0;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, La/k3t0;

    .line 234
    .line 235
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_a
    move-object/from16 v1, p1

    .line 242
    .line 243
    check-cast v1, La/q6a0;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, La/k3t0;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_b
    move-object/from16 v1, p1

    .line 259
    .line 260
    check-cast v1, La/o5a0;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, La/k3t0;

    .line 268
    .line 269
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_c
    move-object/from16 v1, p1

    .line 276
    .line 277
    check-cast v1, Ljava/lang/Throwable;

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, La/u3a0;

    .line 285
    .line 286
    iget-object v2, v0, La/u3a0;->s:La/duj;

    .line 287
    .line 288
    new-instance v3, La/cz90;

    .line 289
    .line 290
    const/4 v4, 0x7

    .line 291
    invoke-direct {v3, v0, v4}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 295
    .line 296
    .line 297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_d
    move-object/from16 v1, p1

    .line 301
    .line 302
    check-cast v1, La/g3a0;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, La/k3t0;

    .line 310
    .line 311
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_e
    move-object/from16 v1, p1

    .line 318
    .line 319
    check-cast v1, La/w1a0;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, La/k3t0;

    .line 327
    .line 328
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_f
    move-object/from16 v1, p1

    .line 335
    .line 336
    check-cast v1, La/n2a0;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 342
    .line 343
    move-object v10, v0

    .line 344
    check-cast v10, La/z1a0;

    .line 345
    .line 346
    sget-object v0, La/z1a0;->U1:La/fl70;

    .line 347
    .line 348
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    instance-of v0, v1, La/h2a0;

    .line 352
    .line 353
    if-eqz v0, :cond_1

    .line 354
    .line 355
    sget-object v0, La/vbn;->n2:La/nek;

    .line 356
    .line 357
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    check-cast v1, La/h2a0;

    .line 365
    .line 366
    iget-object v1, v1, La/h2a0;->a:La/wdn;

    .line 367
    .line 368
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    const-string v0, "DUEL_BUILDER_DIALOG_TAG"

    .line 372
    .line 373
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    if-eqz v3, :cond_0

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :cond_0
    new-instance v3, La/vbn;

    .line 382
    .line 383
    invoke-direct {v3}, La/vbn;-><init>()V

    .line 384
    .line 385
    .line 386
    sget-object v4, La/vbn;->o2:[La/iiy;

    .line 387
    .line 388
    aget-object v4, v4, v6

    .line 389
    .line 390
    iget-object v5, v3, La/vbn;->l2:La/yzn0;

    .line 391
    .line 392
    invoke-virtual {v5, v3, v4, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3, v2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_1
    instance-of v0, v1, La/m2a0;

    .line 401
    .line 402
    if-eqz v0, :cond_3

    .line 403
    .line 404
    sget-object v0, La/snn0;->n2:La/j6m0;

    .line 405
    .line 406
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    check-cast v1, La/m2a0;

    .line 414
    .line 415
    iget-wide v3, v1, La/m2a0;->a:J

    .line 416
    .line 417
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    const-string v0, "SWAP_PLAYERS_TEAM_DIALOG_TAG"

    .line 421
    .line 422
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    if-eqz v1, :cond_2

    .line 427
    .line 428
    goto/16 :goto_0

    .line 429
    .line 430
    :cond_2
    new-instance v1, La/snn0;

    .line 431
    .line 432
    invoke-direct {v1}, La/snn0;-><init>()V

    .line 433
    .line 434
    .line 435
    sget-object v5, La/snn0;->o2:[La/iiy;

    .line 436
    .line 437
    aget-object v5, v5, v6

    .line 438
    .line 439
    iget-object v6, v1, La/snn0;->l2:La/r34;

    .line 440
    .line 441
    invoke-virtual {v6, v1, v5, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :cond_3
    instance-of v0, v1, La/i2a0;

    .line 450
    .line 451
    if-eqz v0, :cond_5

    .line 452
    .line 453
    iget-object v0, v10, La/z1a0;->N1:La/ii;

    .line 454
    .line 455
    if-eqz v0, :cond_4

    .line 456
    .line 457
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 458
    .line 459
    const v1, 0x7f1307bb

    .line 460
    .line 461
    .line 462
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v12

    .line 466
    const v1, 0x7f130fac

    .line 467
    .line 468
    .line 469
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v13

    .line 473
    const v1, 0x7f130e5e

    .line 474
    .line 475
    .line 476
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v14

    .line 480
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    sget-object v20, La/n12;->b:La/n12;

    .line 484
    .line 485
    const/16 v21, 0x0

    .line 486
    .line 487
    const/16 v22, 0x5d8

    .line 488
    .line 489
    const/4 v15, 0x0

    .line 490
    const/16 v16, 0x0

    .line 491
    .line 492
    const-string v17, "PLAYERS_DUEL_UNAVAILABLE_REQUEST_KEY"

    .line 493
    .line 494
    const/16 v18, 0x0

    .line 495
    .line 496
    const/16 v19, 0x0

    .line 497
    .line 498
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 509
    .line 510
    .line 511
    goto/16 :goto_0

    .line 512
    .line 513
    :cond_4
    const-string v0, "actionDialogManager"

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    throw v7

    .line 519
    :cond_5
    instance-of v0, v1, La/l2a0;

    .line 520
    .line 521
    if-eqz v0, :cond_7

    .line 522
    .line 523
    iget-object v0, v10, La/z1a0;->O1:La/xi70;

    .line 524
    .line 525
    if-eqz v0, :cond_6

    .line 526
    .line 527
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 535
    .line 536
    .line 537
    goto :goto_0

    .line 538
    :cond_6
    const-string v0, "quickBetDialogNavigator"

    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    throw v7

    .line 544
    :cond_7
    instance-of v0, v1, La/j2a0;

    .line 545
    .line 546
    const-string v2, "snackbarManager"

    .line 547
    .line 548
    if-eqz v0, :cond_9

    .line 549
    .line 550
    iget-object v8, v10, La/z1a0;->M1:La/wdk0;

    .line 551
    .line 552
    if-eqz v8, :cond_8

    .line 553
    .line 554
    new-instance v9, La/xdk0;

    .line 555
    .line 556
    sget-object v12, La/qek0;->a:La/qek0;

    .line 557
    .line 558
    const v0, 0x7f130e86

    .line 559
    .line 560
    .line 561
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v13

    .line 565
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/16 v18, 0x7c

    .line 571
    .line 572
    const/4 v14, 0x0

    .line 573
    const/4 v15, 0x0

    .line 574
    const/16 v16, 0x0

    .line 575
    .line 576
    move-object v11, v9

    .line 577
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 578
    .line 579
    .line 580
    const/16 v15, 0x3fc

    .line 581
    .line 582
    const/4 v11, 0x0

    .line 583
    const/4 v12, 0x0

    .line 584
    const/4 v13, 0x0

    .line 585
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 586
    .line 587
    .line 588
    goto :goto_0

    .line 589
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    throw v7

    .line 593
    :cond_9
    instance-of v0, v1, La/k2a0;

    .line 594
    .line 595
    if-eqz v0, :cond_b

    .line 596
    .line 597
    iget-object v8, v10, La/z1a0;->M1:La/wdk0;

    .line 598
    .line 599
    if-eqz v8, :cond_a

    .line 600
    .line 601
    new-instance v9, La/xdk0;

    .line 602
    .line 603
    sget-object v12, La/pek0;->a:La/pek0;

    .line 604
    .line 605
    const v0, 0x7f130fad

    .line 606
    .line 607
    .line 608
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v13

    .line 612
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    const/16 v17, 0x0

    .line 616
    .line 617
    const/16 v18, 0x7c

    .line 618
    .line 619
    const/4 v14, 0x0

    .line 620
    const/4 v15, 0x0

    .line 621
    const/16 v16, 0x0

    .line 622
    .line 623
    move-object v11, v9

    .line 624
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 625
    .line 626
    .line 627
    const/16 v15, 0x3fc

    .line 628
    .line 629
    const/4 v11, 0x0

    .line 630
    const/4 v12, 0x0

    .line 631
    const/4 v13, 0x0

    .line 632
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 633
    .line 634
    .line 635
    :goto_0
    invoke-virtual {v10}, La/z1a0;->G0()La/k3t0;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    sget-object v1, La/p1a0;->a:La/p1a0;

    .line 640
    .line 641
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 645
    .line 646
    goto :goto_1

    .line 647
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    throw v7

    .line 651
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 652
    .line 653
    .line 654
    :goto_1
    return-object v7

    .line 655
    :pswitch_10
    move-object/from16 v1, p1

    .line 656
    .line 657
    check-cast v1, Ljava/lang/Throwable;

    .line 658
    .line 659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, La/r0a0;

    .line 665
    .line 666
    iget-object v2, v0, La/r0a0;->w:La/duj;

    .line 667
    .line 668
    new-instance v4, La/cz90;

    .line 669
    .line 670
    invoke-direct {v4, v0, v3}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 674
    .line 675
    .line 676
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 677
    .line 678
    return-object v0

    .line 679
    :pswitch_11
    move-object/from16 v1, p1

    .line 680
    .line 681
    check-cast v1, La/d0a0;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v0, La/k3t0;

    .line 689
    .line 690
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 694
    .line 695
    return-object v0

    .line 696
    :pswitch_12
    move-object/from16 v1, p1

    .line 697
    .line 698
    check-cast v1, La/k48;

    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, La/k3t0;

    .line 706
    .line 707
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 711
    .line 712
    return-object v0

    .line 713
    :pswitch_13
    move-object/from16 v1, p1

    .line 714
    .line 715
    check-cast v1, La/vqd0;

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v0, La/k3t0;

    .line 723
    .line 724
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_14
    move-object/from16 v1, p1

    .line 731
    .line 732
    check-cast v1, Ljava/lang/Throwable;

    .line 733
    .line 734
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, La/gu90;

    .line 740
    .line 741
    sget v3, La/gu90;->i:I

    .line 742
    .line 743
    iget-object v0, v0, La/gu90;->f:La/duj;

    .line 744
    .line 745
    new-instance v3, La/so90;

    .line 746
    .line 747
    invoke-direct {v3, v2}, La/so90;-><init>(B)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 751
    .line 752
    .line 753
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    return-object v0

    .line 756
    :pswitch_15
    move-object/from16 v1, p1

    .line 757
    .line 758
    check-cast v1, Ljava/lang/Throwable;

    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast v0, La/gu90;

    .line 766
    .line 767
    iget-object v0, v0, La/gu90;->f:La/duj;

    .line 768
    .line 769
    new-instance v3, La/so90;

    .line 770
    .line 771
    invoke-direct {v3, v2}, La/so90;-><init>(B)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 775
    .line 776
    .line 777
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 778
    .line 779
    return-object v0

    .line 780
    :pswitch_16
    move-object/from16 v1, p1

    .line 781
    .line 782
    check-cast v1, Ljava/lang/Throwable;

    .line 783
    .line 784
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v0, La/kt90;

    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 795
    .line 796
    .line 797
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 798
    .line 799
    .line 800
    move-result-object v8

    .line 801
    sget-object v9, La/jt90;->a:La/jt90;

    .line 802
    .line 803
    new-instance v12, La/o690;

    .line 804
    .line 805
    const/4 v2, 0x4

    .line 806
    invoke-direct {v12, v0, v1, v7, v2}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 807
    .line 808
    .line 809
    const/16 v13, 0xe

    .line 810
    .line 811
    const/4 v10, 0x0

    .line 812
    const/4 v11, 0x0

    .line 813
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 814
    .line 815
    .line 816
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 817
    .line 818
    return-object v0

    .line 819
    :pswitch_17
    move-object/from16 v1, p1

    .line 820
    .line 821
    check-cast v1, Ljava/lang/Number;

    .line 822
    .line 823
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast v0, La/es90;

    .line 830
    .line 831
    iget-object v2, v0, La/es90;->i:La/g090;

    .line 832
    .line 833
    iget-object v2, v2, La/g090;->b:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v2, La/p7m0;

    .line 836
    .line 837
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    check-cast v2, La/cr90;

    .line 842
    .line 843
    iget-object v2, v2, La/cr90;->e:Ljava/util/List;

    .line 844
    .line 845
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    if-eqz v3, :cond_d

    .line 854
    .line 855
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    move-object v4, v3

    .line 860
    check-cast v4, La/nq90;

    .line 861
    .line 862
    invoke-interface {v4}, La/nq90;->getId()I

    .line 863
    .line 864
    .line 865
    move-result v4

    .line 866
    if-ne v4, v1, :cond_c

    .line 867
    .line 868
    goto :goto_2

    .line 869
    :cond_d
    move-object v3, v7

    .line 870
    :goto_2
    check-cast v3, La/nq90;

    .line 871
    .line 872
    if-eqz v3, :cond_e

    .line 873
    .line 874
    iget-object v2, v0, La/es90;->j:La/cyu;

    .line 875
    .line 876
    invoke-virtual {v2, v3}, La/cyu;->B(La/nq90;)V

    .line 877
    .line 878
    .line 879
    :cond_e
    iget-object v0, v0, La/es90;->k:La/p7m0;

    .line 880
    .line 881
    new-instance v2, La/mp90;

    .line 882
    .line 883
    invoke-direct {v2, v1}, La/mp90;-><init>(I)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v0, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 893
    .line 894
    return-object v0

    .line 895
    :pswitch_18
    move-object/from16 v1, p1

    .line 896
    .line 897
    check-cast v1, La/io90;

    .line 898
    .line 899
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v0, La/k3t0;

    .line 905
    .line 906
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 910
    .line 911
    return-object v0

    .line 912
    :pswitch_19
    move-object/from16 v1, p1

    .line 913
    .line 914
    check-cast v1, La/io90;

    .line 915
    .line 916
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v0, La/k3t0;

    .line 922
    .line 923
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 927
    .line 928
    return-object v0

    .line 929
    :pswitch_1a
    move-object/from16 v1, p1

    .line 930
    .line 931
    check-cast v1, La/jo90;

    .line 932
    .line 933
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v0, La/ao90;

    .line 939
    .line 940
    sget-object v2, La/ao90;->o2:La/xi70;

    .line 941
    .line 942
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    iget-object v1, v1, La/jo90;->a:La/jq90;

    .line 946
    .line 947
    iget v1, v1, La/jq90;->a:I

    .line 948
    .line 949
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    new-instance v2, Lkotlin/Pair;

    .line 954
    .line 955
    const-string v3, "KEY_PICKER_MODEL_REQUEST"

    .line 956
    .line 957
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 958
    .line 959
    .line 960
    iget-object v1, v0, La/ao90;->m2:La/khf0;

    .line 961
    .line 962
    sget-object v4, La/ao90;->p2:[La/iiy;

    .line 963
    .line 964
    aget-object v4, v4, v6

    .line 965
    .line 966
    invoke-virtual {v1, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    check-cast v1, Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 971
    .line 972
    new-instance v4, Lkotlin/Pair;

    .line 973
    .line 974
    const-string v5, "PICKER_PARAMS_KEY"

    .line 975
    .line 976
    invoke-direct {v4, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    filled-new-array {v2, v4}, [Lkotlin/Pair;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    invoke-static {v1, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 991
    .line 992
    .line 993
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 994
    .line 995
    return-object v0

    .line 996
    :pswitch_1b
    move-object/from16 v1, p1

    .line 997
    .line 998
    check-cast v1, La/fn90;

    .line 999
    .line 1000
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v0, La/dn90;

    .line 1006
    .line 1007
    sget v2, La/dn90;->m2:I

    .line 1008
    .line 1009
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    sget-object v2, La/fn90;->a:La/fn90;

    .line 1013
    .line 1014
    invoke-virtual {v1, v2}, La/fn90;->equals(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v1

    .line 1018
    if-eqz v1, :cond_f

    .line 1019
    .line 1020
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1021
    .line 1022
    .line 1023
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1024
    .line 1025
    goto :goto_3

    .line 1026
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 1027
    .line 1028
    .line 1029
    :goto_3
    return-object v7

    .line 1030
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1031
    .line 1032
    check-cast v1, Ljava/lang/Boolean;

    .line 1033
    .line 1034
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v0, La/kk90;

    .line 1041
    .line 1042
    if-eqz v1, :cond_10

    .line 1043
    .line 1044
    iget-object v2, v0, La/kk90;->r:La/ik4;

    .line 1045
    .line 1046
    iget-object v2, v2, La/ik4;->a:La/s1p;

    .line 1047
    .line 1048
    new-instance v4, La/j1p;

    .line 1049
    .line 1050
    const-string v5, "acc_personal"

    .line 1051
    .line 1052
    invoke-direct {v4, v5, v6}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1053
    .line 1054
    .line 1055
    new-instance v8, La/j1p;

    .line 1056
    .line 1057
    const-string v9, "bottom_managment"

    .line 1058
    .line 1059
    const/4 v10, 0x1

    .line 1060
    invoke-direct {v8, v9, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1061
    .line 1062
    .line 1063
    new-array v3, v3, [La/k1p;

    .line 1064
    .line 1065
    aput-object v4, v3, v6

    .line 1066
    .line 1067
    aput-object v8, v3, v10

    .line 1068
    .line 1069
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    const-wide/16 v10, 0xc9f

    .line 1074
    .line 1075
    invoke-virtual {v2, v3, v10, v11}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v2, v0, La/kk90;->s:La/vd1;

    .line 1079
    .line 1080
    iget-object v2, v2, La/vd1;->a:La/kt2;

    .line 1081
    .line 1082
    new-instance v3, Lkotlin/Pair;

    .line 1083
    .line 1084
    const-string v4, "screen"

    .line 1085
    .line 1086
    invoke-direct {v3, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1087
    .line 1088
    .line 1089
    new-instance v4, Lkotlin/Pair;

    .line 1090
    .line 1091
    const-string v5, "element"

    .line 1092
    .line 1093
    invoke-direct {v4, v5, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    filled-new-array {v3, v4}, [Lkotlin/Pair;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v3

    .line 1100
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v3

    .line 1104
    const-string v4, "acc_add_phone_call"

    .line 1105
    .line 1106
    invoke-interface {v2, v4, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_4

    .line 1110
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    :goto_4
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v8

    .line 1117
    iget-object v2, v0, La/kk90;->m:La/mne;

    .line 1118
    .line 1119
    iget-object v11, v2, La/mne;->b:La/dvj;

    .line 1120
    .line 1121
    sget-object v9, La/gk90;->a:La/gk90;

    .line 1122
    .line 1123
    new-instance v12, La/fj3;

    .line 1124
    .line 1125
    const/16 v2, 0xf

    .line 1126
    .line 1127
    invoke-direct {v12, v1, v0, v7, v2}, La/fj3;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 1128
    .line 1129
    .line 1130
    const/16 v13, 0xa

    .line 1131
    .line 1132
    const/4 v10, 0x0

    .line 1133
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1134
    .line 1135
    .line 1136
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1137
    .line 1138
    return-object v0

    .line 1139
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
