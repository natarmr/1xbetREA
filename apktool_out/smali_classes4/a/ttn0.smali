.class public final synthetic La/ttn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ttn0;->a:B

    iput-object p1, p0, La/ttn0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ttn0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v0, v0, La/ttn0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/nfj0;

    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/cp;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 25
    .line 26
    check-cast v2, La/a3k;

    .line 27
    .line 28
    iget-object v2, v2, La/a3k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 29
    .line 30
    new-instance v3, La/bs50;

    .line 31
    .line 32
    const/16 v4, 0xd

    .line 33
    .line 34
    invoke-direct {v3, v0, v1, v4}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setListCheckBoxClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, La/pgj0;

    .line 41
    .line 42
    const/16 v2, 0xf

    .line 43
    .line 44
    invoke-direct {v0, v1, v1, v2}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_0
    move-object v1, v0

    .line 54
    check-cast v1, La/qnp0;

    .line 55
    .line 56
    move-object/from16 v0, p1

    .line 57
    .line 58
    check-cast v0, Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 64
    .line 65
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 75
    .line 76
    move-object v4, v0

    .line 77
    check-cast v4, La/knp0;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/16 v9, 0x39

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v6, 0x1

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-static/range {v4 .. v9}, La/knp0;->a(La/knp0;ZZLjava/util/List;II)La/knp0;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_1
    check-cast v0, La/ykp0;

    .line 102
    .line 103
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, Ljava/lang/Throwable;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, La/ykp0;->s:La/duj;

    .line 111
    .line 112
    new-instance v3, La/l7p0;

    .line 113
    .line 114
    const/4 v4, 0x6

    .line 115
    invoke-direct {v3, v0, v4}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_2
    check-cast v0, La/xip0;

    .line 125
    .line 126
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, La/bop0;

    .line 129
    .line 130
    sget-object v2, La/xip0;->n2:La/g9m0;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object v2, v0, La/xip0;->g2:La/phf0;

    .line 136
    .line 137
    sget-object v3, La/xip0;->o2:[La/iiy;

    .line 138
    .line 139
    aget-object v4, v3, v5

    .line 140
    .line 141
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    new-instance v4, La/ojp0;

    .line 146
    .line 147
    iget-object v5, v0, La/xip0;->i2:La/zz2;

    .line 148
    .line 149
    const/4 v6, 0x2

    .line 150
    aget-object v6, v3, v6

    .line 151
    .line 152
    invoke-virtual {v5, v0, v6}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    iget-object v6, v0, La/xip0;->j2:La/zz2;

    .line 161
    .line 162
    const/4 v7, 0x3

    .line 163
    aget-object v3, v3, v7

    .line 164
    .line 165
    invoke-virtual {v6, v0, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    iget-byte v1, v1, La/bop0;->a:B

    .line 174
    .line 175
    invoke-direct {v4, v5, v3, v1}, La/ojp0;-><init>(III)V

    .line 176
    .line 177
    .line 178
    new-instance v1, Lkotlin/Pair;

    .line 179
    .line 180
    const-string v3, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 181
    .line 182
    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 197
    .line 198
    .line 199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_3
    check-cast v0, La/rhp0;

    .line 203
    .line 204
    move-object/from16 v1, p1

    .line 205
    .line 206
    check-cast v1, Ljava/lang/Throwable;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v2, v0, La/rhp0;->p:La/duj;

    .line 212
    .line 213
    new-instance v3, La/qhp0;

    .line 214
    .line 215
    invoke-direct {v3, v0, v4}, La/qhp0;-><init>(La/rhp0;B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 219
    .line 220
    .line 221
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_4
    check-cast v0, La/ngp0;

    .line 225
    .line 226
    move-object/from16 v1, p1

    .line 227
    .line 228
    check-cast v1, La/cp;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 234
    .line 235
    check-cast v2, La/mgp0;

    .line 236
    .line 237
    iget-object v2, v2, La/mgp0;->c:Landroid/widget/ImageView;

    .line 238
    .line 239
    new-instance v3, La/itn0;

    .line 240
    .line 241
    const/16 v4, 0x18

    .line 242
    .line 243
    invoke-direct {v3, v0, v1, v4}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 247
    .line 248
    .line 249
    new-instance v0, La/kzi0;

    .line 250
    .line 251
    const/16 v2, 0x11

    .line 252
    .line 253
    invoke-direct {v0, v1, v2}, La/kzi0;-><init>(La/cp;B)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_5
    check-cast v0, La/sap0;

    .line 263
    .line 264
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, La/nap0;

    .line 267
    .line 268
    sget-object v2, La/sap0;->R1:La/j6m0;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, La/sap0;->G0()La/k3t0;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_6
    check-cast v0, La/x8p0;

    .line 284
    .line 285
    move-object/from16 v1, p1

    .line 286
    .line 287
    check-cast v1, Ljava/lang/Long;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    sget-object v2, La/x8p0;->l2:La/s2m0;

    .line 293
    .line 294
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-eqz v2, :cond_1

    .line 299
    .line 300
    goto :goto_0

    .line 301
    :cond_1
    new-instance v2, Lkotlin/Pair;

    .line 302
    .line 303
    const-string v3, "TEAM_DETAILS_DISCIPLINE_DIALOG_RESULT_KEY"

    .line 304
    .line 305
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-static {v1, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 320
    .line 321
    .line 322
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_7
    check-cast v0, La/s7p0;

    .line 326
    .line 327
    move-object/from16 v1, p1

    .line 328
    .line 329
    check-cast v1, La/p7p0;

    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    iget-object v1, v1, La/p7p0;->b:La/o9p0;

    .line 335
    .line 336
    if-eqz v1, :cond_2

    .line 337
    .line 338
    iget-object v1, v1, La/o9p0;->i:Ljava/util/List;

    .line 339
    .line 340
    iget-object v0, v0, La/s7p0;->b:La/ctf0;

    .line 341
    .line 342
    invoke-static {v0, v1}, La/idm0;->l(La/ctf0;Ljava/util/List;)La/i4;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    if-nez v0, :cond_3

    .line 347
    .line 348
    :cond_2
    sget-object v0, La/lak0;->c:La/lak0;

    .line 349
    .line 350
    :cond_3
    return-object v0

    .line 351
    :pswitch_8
    check-cast v0, La/m7p0;

    .line 352
    .line 353
    move-object/from16 v1, p1

    .line 354
    .line 355
    check-cast v1, La/g7p0;

    .line 356
    .line 357
    sget-object v2, La/m7p0;->P1:La/s9m0;

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v0, v0, La/m7p0;->M1:La/a8z;

    .line 363
    .line 364
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, La/k3t0;

    .line 369
    .line 370
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0

    .line 376
    :pswitch_9
    check-cast v0, La/o6p0;

    .line 377
    .line 378
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 379
    .line 380
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 381
    .line 382
    move-object/from16 v2, p1

    .line 383
    .line 384
    check-cast v2, Ljava/lang/Throwable;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    instance-of v2, v2, La/ff5;

    .line 390
    .line 391
    if-eqz v2, :cond_5

    .line 392
    .line 393
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 394
    .line 395
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-object v3, v0

    .line 403
    check-cast v3, La/z5p0;

    .line 404
    .line 405
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    const/4 v10, 0x0

    .line 409
    const/16 v11, 0xc7

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    const/4 v5, 0x0

    .line 413
    const/4 v6, 0x0

    .line 414
    const/4 v7, 0x0

    .line 415
    const/4 v8, 0x1

    .line 416
    const/4 v9, 0x0

    .line 417
    invoke-static/range {v3 .. v11}, La/z5p0;->a(La/z5p0;La/zdm0;La/nc5;ZZZZLa/cpp0;I)La/z5p0;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_4

    .line 426
    .line 427
    goto :goto_1

    .line 428
    :cond_5
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 429
    .line 430
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    move-object v3, v0

    .line 438
    check-cast v3, La/z5p0;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    const/4 v10, 0x0

    .line 444
    const/16 v11, 0xc7

    .line 445
    .line 446
    const/4 v4, 0x0

    .line 447
    const/4 v5, 0x0

    .line 448
    const/4 v6, 0x0

    .line 449
    const/4 v7, 0x1

    .line 450
    const/4 v8, 0x0

    .line 451
    const/4 v9, 0x0

    .line 452
    invoke-static/range {v3 .. v11}, La/z5p0;->a(La/z5p0;La/zdm0;La/nc5;ZZZZLa/cpp0;I)La/z5p0;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    if-eqz v0, :cond_6

    .line 461
    .line 462
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_a
    check-cast v0, La/i0p0;

    .line 466
    .line 467
    move-object/from16 v1, p1

    .line 468
    .line 469
    check-cast v1, La/uid;

    .line 470
    .line 471
    sget-object v2, La/i0p0;->Z1:La/j6m0;

    .line 472
    .line 473
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0}, La/i0p0;->I0()La/k3t0;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    new-instance v2, La/uyo0;

    .line 481
    .line 482
    invoke-direct {v2, v1}, La/uyo0;-><init>(La/uid;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object v0

    .line 491
    :pswitch_b
    check-cast v0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 492
    .line 493
    move-object/from16 v1, p1

    .line 494
    .line 495
    check-cast v1, La/vzg0;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    new-instance v2, La/kyo0;

    .line 501
    .line 502
    iget-object v4, v0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->b:Ljava/lang/String;

    .line 503
    .line 504
    const-string v3, "TEAN_IMAGE_KEY"

    .line 505
    .line 506
    const-string v5, ""

    .line 507
    .line 508
    invoke-static {v1, v3, v5}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    move-object v5, v3

    .line 513
    check-cast v5, Ljava/lang/String;

    .line 514
    .line 515
    iget-wide v6, v0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    .line 516
    .line 517
    const-string v0, "CURRENT_TAB_KEY"

    .line 518
    .line 519
    sget-object v3, La/j3p0;->c:La/j3p0;

    .line 520
    .line 521
    invoke-static {v1, v0, v3}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    move-object v8, v0

    .line 526
    check-cast v8, La/j3p0;

    .line 527
    .line 528
    const/4 v9, 0x0

    .line 529
    const/4 v10, 0x0

    .line 530
    const/4 v3, 0x0

    .line 531
    invoke-direct/range {v2 .. v10}, La/kyo0;-><init>(La/jyo0;Ljava/lang/String;Ljava/lang/String;JLa/j3p0;ZZ)V

    .line 532
    .line 533
    .line 534
    return-object v2

    .line 535
    :pswitch_c
    check-cast v0, La/s7p0;

    .line 536
    .line 537
    move-object/from16 v1, p1

    .line 538
    .line 539
    check-cast v1, La/a0o;

    .line 540
    .line 541
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    new-instance v3, Ljava/util/ArrayList;

    .line 545
    .line 546
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 551
    .line 552
    .line 553
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-eqz v2, :cond_7

    .line 562
    .line 563
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    check-cast v2, La/j3p0;

    .line 568
    .line 569
    iget-object v4, v0, La/s7p0;->b:La/ctf0;

    .line 570
    .line 571
    iget v2, v2, La/j3p0;->b:I

    .line 572
    .line 573
    new-array v6, v5, [Ljava/lang/Object;

    .line 574
    .line 575
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 576
    .line 577
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    invoke-virtual {v4, v2, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    new-instance v4, La/yvh0;

    .line 586
    .line 587
    sget-object v6, La/bwh0;->a:La/bwh0;

    .line 588
    .line 589
    invoke-direct {v4, v2, v6}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    goto :goto_2

    .line 596
    :cond_7
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    return-object v0

    .line 601
    :pswitch_d
    check-cast v0, La/rxo0;

    .line 602
    .line 603
    move-object/from16 v1, p1

    .line 604
    .line 605
    check-cast v1, Landroid/view/View;

    .line 606
    .line 607
    sget-object v2, La/rxo0;->j2:La/y2m0;

    .line 608
    .line 609
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    sget-object v1, La/bop0;->b:La/m6m0;

    .line 613
    .line 614
    invoke-virtual {v0, v5}, La/rxo0;->T0(I)V

    .line 615
    .line 616
    .line 617
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_e
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 621
    .line 622
    move-object/from16 v1, p1

    .line 623
    .line 624
    check-cast v1, Landroid/view/View;

    .line 625
    .line 626
    sget v2, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->k:I

    .line 627
    .line 628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    iget-object v1, v0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    if-eqz v1, :cond_9

    .line 638
    .line 639
    if-ne v1, v4, :cond_8

    .line 640
    .line 641
    sget-object v1, La/evo0;->a:La/evo0;

    .line 642
    .line 643
    goto :goto_3

    .line 644
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 645
    .line 646
    .line 647
    goto :goto_4

    .line 648
    :cond_9
    sget-object v1, La/evo0;->b:La/evo0;

    .line 649
    .line 650
    :goto_3
    iput-object v1, v0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 651
    .line 652
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->d()V

    .line 653
    .line 654
    .line 655
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 656
    .line 657
    :goto_4
    return-object v3

    .line 658
    :pswitch_f
    check-cast v0, La/zyn;

    .line 659
    .line 660
    move-object/from16 v1, p1

    .line 661
    .line 662
    check-cast v1, Ljava/lang/Float;

    .line 663
    .line 664
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    iget-object v0, v0, La/zyn;->a:La/oyq0;

    .line 669
    .line 670
    iget-object v2, v0, La/oyq0;->c:La/agk0;

    .line 671
    .line 672
    invoke-virtual {v2}, La/agk0;->l()F

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    add-float/2addr v2, v1

    .line 677
    invoke-virtual {v0, v2}, La/oyq0;->c(F)V

    .line 678
    .line 679
    .line 680
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 681
    .line 682
    return-object v0

    .line 683
    :pswitch_10
    check-cast v0, La/llo0;

    .line 684
    .line 685
    move-object/from16 v1, p1

    .line 686
    .line 687
    check-cast v1, La/abi0;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    new-instance v2, La/n0x;

    .line 693
    .line 694
    iget-object v0, v0, La/llo0;->a:Ljava/lang/String;

    .line 695
    .line 696
    invoke-direct {v2, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    invoke-static {v1, v2}, La/cbi0;->b(La/abi0;La/o0x;)V

    .line 700
    .line 701
    .line 702
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    return-object v0

    .line 705
    :pswitch_11
    check-cast v0, La/vlo0;

    .line 706
    .line 707
    move-object/from16 v1, p1

    .line 708
    .line 709
    check-cast v1, La/abi0;

    .line 710
    .line 711
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    iget-wide v2, v0, La/vlo0;->e:J

    .line 715
    .line 716
    invoke-static {v1, v2, v3}, La/cbi0;->a(La/abi0;J)V

    .line 717
    .line 718
    .line 719
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 720
    .line 721
    return-object v0

    .line 722
    :pswitch_12
    check-cast v0, La/cko0;

    .line 723
    .line 724
    move-object/from16 v1, p1

    .line 725
    .line 726
    check-cast v1, La/hcz;

    .line 727
    .line 728
    sget-object v2, La/cko0;->m2:La/m6m0;

    .line 729
    .line 730
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    iget-object v2, v0, La/cko0;->l2:La/es;

    .line 734
    .line 735
    sget-object v5, La/cko0;->n2:[La/iiy;

    .line 736
    .line 737
    aget-object v5, v5, v4

    .line 738
    .line 739
    invoke-virtual {v2, v0, v5}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    new-instance v5, La/adn0;

    .line 748
    .line 749
    const/4 v6, 0x7

    .line 750
    invoke-direct {v5, v0, v6}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 751
    .line 752
    .line 753
    new-instance v6, La/xy1;

    .line 754
    .line 755
    const/16 v7, 0x1c

    .line 756
    .line 757
    invoke-direct {v6, v0, v7}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 758
    .line 759
    .line 760
    new-instance v0, La/ugd;

    .line 761
    .line 762
    const v7, 0x799532c4

    .line 763
    .line 764
    .line 765
    invoke-direct {v0, v7, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v1, v2, v3, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 769
    .line 770
    .line 771
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 772
    .line 773
    return-object v0

    .line 774
    :pswitch_13
    check-cast v0, La/jho0;

    .line 775
    .line 776
    move-object/from16 v1, p1

    .line 777
    .line 778
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 779
    .line 780
    sget-object v2, La/jho0;->R1:La/y2m0;

    .line 781
    .line 782
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v0}, La/jho0;->H0()La/rio0;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {v0}, La/rio0;->H()V

    .line 790
    .line 791
    .line 792
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_14
    check-cast v0, La/ufo0;

    .line 796
    .line 797
    move-object/from16 v1, p1

    .line 798
    .line 799
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 800
    .line 801
    sget-object v2, La/ufo0;->Q1:La/s2m0;

    .line 802
    .line 803
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v0}, La/ufo0;->H0()La/fho0;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v0}, La/fho0;->H()V

    .line 811
    .line 812
    .line 813
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 814
    .line 815
    return-object v0

    .line 816
    :pswitch_15
    check-cast v0, La/nfo0;

    .line 817
    .line 818
    move-object/from16 v1, p1

    .line 819
    .line 820
    check-cast v1, La/f240;

    .line 821
    .line 822
    sget-object v2, La/nfo0;->O1:La/s9m0;

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    iget-object v0, v0, La/nfo0;->M1:La/kiu0;

    .line 828
    .line 829
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    check-cast v0, La/rio0;

    .line 834
    .line 835
    invoke-virtual {v0, v1}, La/rio0;->E(La/f240;)V

    .line 836
    .line 837
    .line 838
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 839
    .line 840
    return-object v0

    .line 841
    :pswitch_16
    check-cast v0, La/zco0;

    .line 842
    .line 843
    move-object/from16 v1, p1

    .line 844
    .line 845
    check-cast v1, Ljava/lang/Integer;

    .line 846
    .line 847
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    iget-object v2, v0, La/zco0;->z:La/ctf0;

    .line 852
    .line 853
    new-array v3, v5, [Ljava/lang/Object;

    .line 854
    .line 855
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 856
    .line 857
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    invoke-virtual {v2, v1, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    new-instance v2, La/dlb0;

    .line 866
    .line 867
    invoke-direct {v2, v1}, La/dlb0;-><init>(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_17
    move-object v1, v0

    .line 877
    check-cast v1, La/m7o0;

    .line 878
    .line 879
    move-object/from16 v0, p1

    .line 880
    .line 881
    check-cast v0, Ljava/lang/Throwable;

    .line 882
    .line 883
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 887
    .line 888
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 889
    .line 890
    :cond_a
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    iget-object v2, v1, La/i3t0;->f:La/oyg0;

    .line 898
    .line 899
    move-object v4, v0

    .line 900
    check-cast v4, La/i7o0;

    .line 901
    .line 902
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    const/4 v9, 0x0

    .line 906
    const/16 v10, 0xd7

    .line 907
    .line 908
    const/4 v5, 0x0

    .line 909
    const/4 v6, 0x0

    .line 910
    const/4 v7, 0x0

    .line 911
    const/4 v8, 0x0

    .line 912
    invoke-static/range {v4 .. v10}, La/i7o0;->a(La/i7o0;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;ZI)La/i7o0;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    move-result v0

    .line 920
    if-eqz v0, :cond_a

    .line 921
    .line 922
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 923
    .line 924
    return-object v0

    .line 925
    :pswitch_18
    check-cast v0, La/k7o0;

    .line 926
    .line 927
    move-object/from16 v1, p1

    .line 928
    .line 929
    check-cast v1, La/i7o0;

    .line 930
    .line 931
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    iget-object v3, v1, La/i7o0;->d:Ljava/util/List;

    .line 935
    .line 936
    iget-object v4, v1, La/i7o0;->b:Ljava/lang/Integer;

    .line 937
    .line 938
    if-eqz v4, :cond_b

    .line 939
    .line 940
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 941
    .line 942
    .line 943
    move-result v5

    .line 944
    :cond_b
    iget-object v0, v0, La/k7o0;->b:La/ctf0;

    .line 945
    .line 946
    iget-object v4, v1, La/i7o0;->g:La/sff0;

    .line 947
    .line 948
    iget-object v4, v4, La/sff0;->g:La/mum0;

    .line 949
    .line 950
    iget-object v4, v4, La/mum0;->y:La/v5l0;

    .line 951
    .line 952
    sget-object v6, La/q0s;->a:La/q0s;

    .line 953
    .line 954
    iget-boolean v1, v1, La/i7o0;->h:Z

    .line 955
    .line 956
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    if-eqz v3, :cond_f

    .line 960
    .line 961
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 962
    .line 963
    .line 964
    move-result v7

    .line 965
    if-eqz v7, :cond_c

    .line 966
    .line 967
    goto :goto_7

    .line 968
    :cond_c
    new-instance v7, Ljava/util/ArrayList;

    .line 969
    .line 970
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 971
    .line 972
    .line 973
    move-result v8

    .line 974
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 975
    .line 976
    .line 977
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 982
    .line 983
    .line 984
    move-result v8

    .line 985
    if-eqz v8, :cond_d

    .line 986
    .line 987
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v8

    .line 991
    check-cast v8, La/icg;

    .line 992
    .line 993
    invoke-static {v8, v6, v4, v0}, La/pzw;->Z(La/icg;La/q0s;La/v5l0;La/ctf0;)La/v0g0;

    .line 994
    .line 995
    .line 996
    move-result-object v8

    .line 997
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    goto :goto_5

    .line 1001
    :cond_d
    new-instance v0, Ljava/util/ArrayList;

    .line 1002
    .line 1003
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1004
    .line 1005
    .line 1006
    move-result v2

    .line 1007
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v2

    .line 1014
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    if-eqz v3, :cond_e

    .line 1019
    .line 1020
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v3

    .line 1024
    check-cast v3, La/x0g0;

    .line 1025
    .line 1026
    new-instance v4, La/f7o0;

    .line 1027
    .line 1028
    invoke-interface {v3}, La/a2n;->getKey()Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v6

    .line 1032
    const-string v7, "RESULTS"

    .line 1033
    .line 1034
    invoke-static {v5, v7, v6}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v6

    .line 1038
    invoke-direct {v4, v6, v3, v1}, La/f7o0;-><init>(Ljava/lang/String;La/x0g0;Z)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    goto :goto_6

    .line 1045
    :cond_e
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    goto :goto_8

    .line 1050
    :cond_f
    :goto_7
    sget-object v0, La/iun;->a:La/iun;

    .line 1051
    .line 1052
    :goto_8
    return-object v0

    .line 1053
    :pswitch_19
    check-cast v0, La/d7o0;

    .line 1054
    .line 1055
    move-object/from16 v1, p1

    .line 1056
    .line 1057
    check-cast v1, La/x6o0;

    .line 1058
    .line 1059
    sget-object v2, La/d7o0;->R1:La/s9m0;

    .line 1060
    .line 1061
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v0}, La/d7o0;->G0()La/k3t0;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1069
    .line 1070
    .line 1071
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    return-object v0

    .line 1074
    :pswitch_1a
    move-object v1, v0

    .line 1075
    check-cast v1, La/bvn0;

    .line 1076
    .line 1077
    move-object/from16 v2, p1

    .line 1078
    .line 1079
    check-cast v2, Ljava/lang/Throwable;

    .line 1080
    .line 1081
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1085
    .line 1086
    iget-object v6, v0, La/ocj;->a:La/p7m0;

    .line 1087
    .line 1088
    :cond_10
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1096
    .line 1097
    move-object v7, v0

    .line 1098
    check-cast v7, La/gvn0;

    .line 1099
    .line 1100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    const/4 v14, 0x0

    .line 1104
    const/16 v15, 0xfe

    .line 1105
    .line 1106
    const/4 v8, 0x1

    .line 1107
    const/4 v9, 0x0

    .line 1108
    const/4 v10, 0x0

    .line 1109
    const/4 v11, 0x0

    .line 1110
    const/4 v12, 0x0

    .line 1111
    const/4 v13, 0x0

    .line 1112
    invoke-static/range {v7 .. v15}, La/gvn0;->a(La/gvn0;ZZZZLjava/util/List;Ljava/util/List;Ljava/util/Set;I)La/gvn0;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    invoke-virtual {v6, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    if-eqz v0, :cond_10

    .line 1121
    .line 1122
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1123
    .line 1124
    .line 1125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1126
    .line 1127
    return-object v0

    .line 1128
    :pswitch_1b
    check-cast v0, La/bun0;

    .line 1129
    .line 1130
    move-object/from16 v1, p1

    .line 1131
    .line 1132
    check-cast v1, Landroid/text/Editable;

    .line 1133
    .line 1134
    sget-object v2, La/bun0;->g2:La/s2m0;

    .line 1135
    .line 1136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v0}, La/bun0;->R0()La/pun0;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    iget-object v2, v0, La/pun0;->v:La/xae0;

    .line 1151
    .line 1152
    iget-object v2, v2, La/xae0;->a:La/n7m0;

    .line 1153
    .line 1154
    invoke-interface {v2}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    check-cast v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;

    .line 1159
    .line 1160
    iget-object v2, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$UiState;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 1161
    .line 1162
    iget-object v2, v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;->a:Ljava/lang/String;

    .line 1163
    .line 1164
    if-eqz v2, :cond_11

    .line 1165
    .line 1166
    move v5, v4

    .line 1167
    :cond_11
    new-instance v2, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;

    .line 1168
    .line 1169
    if-eqz v5, :cond_12

    .line 1170
    .line 1171
    move-object v3, v1

    .line 1172
    :cond_12
    invoke-direct {v2, v3}, Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;-><init>(Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v0, v2, v4}, La/pun0;->w(Lorg/xplatform/swipex/impl/presentation/dialogs/change_bet_sum/SwipexChangeBetValueViewModel$BetValue;Z)V

    .line 1176
    .line 1177
    .line 1178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1179
    .line 1180
    return-object v0

    .line 1181
    :pswitch_1c
    check-cast v0, La/ktn0;

    .line 1182
    .line 1183
    move-object/from16 v1, p1

    .line 1184
    .line 1185
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 1186
    .line 1187
    if-eqz v1, :cond_13

    .line 1188
    .line 1189
    iget-object v0, v0, La/ktn0;->p:Landroid/widget/ImageView;

    .line 1190
    .line 1191
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1192
    .line 1193
    .line 1194
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1195
    .line 1196
    return-object v0

    .line 1197
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
