.class public final synthetic La/ck60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ck60;->a:B

    iput-object p1, p0, La/ck60;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ck60;->c:Ljava/lang/Object;

    iput-object p3, p0, La/ck60;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ck60;->a:B

    .line 4
    .line 5
    const v2, 0x7f1300e4

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, La/ck60;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/ck60;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, La/ck60;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, La/gjs0;

    .line 21
    .line 22
    check-cast v7, Ljava/lang/String;

    .line 23
    .line 24
    check-cast v6, La/nks0;

    .line 25
    .line 26
    sget-object v1, La/gjs0;->R1:La/j6m0;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1, v7}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v1, La/uks0;->l2:La/s9m0;

    .line 42
    .line 43
    iget-object v2, v6, La/nks0;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/timefilter/model/TransfersTimeFilterBottomParams;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v1, La/uks0;

    .line 49
    .line 50
    invoke-direct {v1}, La/uks0;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v3, La/uks0;->m2:[La/iiy;

    .line 54
    .line 55
    aget-object v3, v3, v5

    .line 56
    .line 57
    iget-object v4, v1, La/uks0;->k2:La/khf0;

    .line 58
    .line 59
    invoke-virtual {v4, v1, v3, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v1, v0, v7}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    :goto_0
    return-object v0

    .line 72
    :pswitch_0
    check-cast v0, La/gjs0;

    .line 73
    .line 74
    check-cast v7, Ljava/lang/String;

    .line 75
    .line 76
    check-cast v6, La/lks0;

    .line 77
    .line 78
    sget-object v1, La/gjs0;->R1:La/j6m0;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1, v7}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    sget-object v1, La/zis0;->m2:La/y2m0;

    .line 94
    .line 95
    iget-object v2, v6, La/lks0;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilterBottomParams;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v1, La/zis0;

    .line 101
    .line 102
    invoke-direct {v1}, La/zis0;-><init>()V

    .line 103
    .line 104
    .line 105
    sget-object v3, La/zis0;->n2:[La/iiy;

    .line 106
    .line 107
    aget-object v3, v3, v5

    .line 108
    .line 109
    iget-object v4, v1, La/zis0;->l2:La/khf0;

    .line 110
    .line 111
    invoke-virtual {v4, v1, v3, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v1, v0, v7}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_1
    return-object v0

    .line 124
    :pswitch_1
    check-cast v0, La/wiu;

    .line 125
    .line 126
    check-cast v7, La/crm0;

    .line 127
    .line 128
    check-cast v6, La/bzt;

    .line 129
    .line 130
    new-instance v8, La/e7s0;

    .line 131
    .line 132
    invoke-virtual {v0}, La/wiu;->a()Ljava/util/Locale;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    iget-wide v10, v7, La/crm0;->a:J

    .line 137
    .line 138
    iget-object v12, v7, La/crm0;->b:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v13, v7, La/crm0;->c:Ljava/lang/String;

    .line 141
    .line 142
    sget-object v16, La/gqt0;->h:La/gqt0;

    .line 143
    .line 144
    iget-object v0, v6, La/bzt;->a:La/fsd;

    .line 145
    .line 146
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget v0, v0, La/v8d;->r:I

    .line 151
    .line 152
    const/16 v18, 0x0

    .line 153
    .line 154
    sget-object v14, La/r7s0;->a:La/r7s0;

    .line 155
    .line 156
    const/4 v15, 0x0

    .line 157
    move/from16 v17, v0

    .line 158
    .line 159
    invoke-direct/range {v8 .. v18}, La/e7s0;-><init>(Ljava/util/Locale;JLjava/lang/String;Ljava/lang/String;La/s7s0;ZLa/gqt0;IZ)V

    .line 160
    .line 161
    .line 162
    return-object v8

    .line 163
    :pswitch_2
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    check-cast v7, Ljava/lang/String;

    .line 166
    .line 167
    check-cast v6, La/dxr0;

    .line 168
    .line 169
    iget-object v1, v6, La/dxr0;->c:Ljava/lang/String;

    .line 170
    .line 171
    invoke-interface {v0, v7, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_3
    check-cast v0, La/ctf0;

    .line 178
    .line 179
    check-cast v7, La/ctu;

    .line 180
    .line 181
    check-cast v6, La/wyu;

    .line 182
    .line 183
    invoke-static {}, La/fem0;->j()La/uvr0;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-static {}, La/fem0;->j()La/uvr0;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iget-object v1, v1, La/uvr0;->a:La/vvr0;

    .line 192
    .line 193
    iget-object v1, v1, La/vvr0;->b:La/mtr0;

    .line 194
    .line 195
    new-array v2, v5, [Ljava/lang/Object;

    .line 196
    .line 197
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 198
    .line 199
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const v3, 0x7f13161b

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v2, v7, La/ctu;->a:La/rkr0;

    .line 211
    .line 212
    invoke-interface {v2}, La/rkr0;->r()La/lmr0;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v3, v3, La/lmr0;->b:Ljava/lang/String;

    .line 217
    .line 218
    const/16 v4, 0xc

    .line 219
    .line 220
    invoke-static {v1, v0, v3, v5, v4}, La/mtr0;->a(La/mtr0;Ljava/lang/String;Ljava/lang/String;ZI)La/mtr0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-interface {v2}, La/rkr0;->r()La/lmr0;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object v1, v1, La/lmr0;->c:La/ulr0;

    .line 229
    .line 230
    invoke-static {v1}, La/hfm0;->F(La/ulr0;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v3

    .line 234
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 235
    .line 236
    invoke-virtual {v6}, La/wyu;->a()La/uaq0;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {v5}, La/s9m0;->k(La/uaq0;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-static {v1, v3, v4}, La/p7x;->z(ZJ)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    new-instance v9, La/vvr0;

    .line 252
    .line 253
    sget-object v3, La/crq0;->a:La/crq0;

    .line 254
    .line 255
    invoke-direct {v9, v1, v0, v3}, La/vvr0;-><init>(Ljava/lang/String;La/mtr0;La/erq0;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v2}, La/rkr0;->r()La/lmr0;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget v12, v0, La/lmr0;->a:I

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/16 v18, 0x1ee

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    const/4 v11, 0x0

    .line 270
    const-wide/16 v13, 0x0

    .line 271
    .line 272
    const/4 v15, 0x0

    .line 273
    const/16 v16, 0x0

    .line 274
    .line 275
    invoke-static/range {v8 .. v18}, La/uvr0;->a(La/uvr0;La/vvr0;La/plr0;ZIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)La/uvr0;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0

    .line 280
    :pswitch_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 281
    .line 282
    check-cast v7, La/xww;

    .line 283
    .line 284
    check-cast v6, Ljava/lang/String;

    .line 285
    .line 286
    new-instance v1, La/t27;

    .line 287
    .line 288
    invoke-virtual {v7}, La/xww;->C()Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-direct {v1, v2, v6}, La/t27;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_5
    check-cast v0, La/v2t0;

    .line 302
    .line 303
    check-cast v7, Landroidx/fragment/app/Fragment;

    .line 304
    .line 305
    check-cast v6, La/ujd;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 318
    .line 319
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {v7}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 326
    .line 327
    .line 328
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_6
    check-cast v0, La/vxi;

    .line 332
    .line 333
    check-cast v7, Landroidx/fragment/app/Fragment;

    .line 334
    .line 335
    check-cast v6, La/k3t0;

    .line 336
    .line 337
    iget-object v1, v0, La/vxi;->p:La/itr;

    .line 338
    .line 339
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    new-instance v2, La/kr2;

    .line 347
    .line 348
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 349
    .line 350
    .line 351
    new-instance v3, La/ebh;

    .line 352
    .line 353
    const/16 v4, 0xa

    .line 354
    .line 355
    invoke-direct {v3, v6, v4}, La/ebh;-><init>(La/k3t0;B)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v7, v2, v3}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 359
    .line 360
    .line 361
    iget-object v0, v0, La/vxi;->n:La/yqc;

    .line 362
    .line 363
    iget-object v0, v0, La/yqc;->b:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, La/nc0;

    .line 366
    .line 367
    invoke-virtual {v0}, La/nc0;->r()La/dq00;

    .line 368
    .line 369
    .line 370
    new-instance v0, La/ebh;

    .line 371
    .line 372
    const/16 v1, 0xb

    .line 373
    .line 374
    invoke-direct {v0, v6, v1}, La/ebh;-><init>(La/k3t0;B)V

    .line 375
    .line 376
    .line 377
    new-instance v1, La/a7g0;

    .line 378
    .line 379
    const/16 v2, 0x10

    .line 380
    .line 381
    invoke-direct {v1, v0, v2}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 382
    .line 383
    .line 384
    const-string v0, "REQUEST_EXPRESS_DIALOG_EXPRESS"

    .line 385
    .line 386
    invoke-static {v7, v0, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 387
    .line 388
    .line 389
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_7
    check-cast v0, La/kie0;

    .line 393
    .line 394
    check-cast v7, La/kie0;

    .line 395
    .line 396
    check-cast v6, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 397
    .line 398
    sget v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 399
    .line 400
    iget v1, v0, La/kie0;->a:I

    .line 401
    .line 402
    add-int/2addr v1, v4

    .line 403
    iput v1, v0, La/kie0;->a:I

    .line 404
    .line 405
    iget v0, v7, La/kie0;->a:I

    .line 406
    .line 407
    if-ne v0, v1, :cond_2

    .line 408
    .line 409
    invoke-virtual {v6}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->c()V

    .line 410
    .line 411
    .line 412
    iget-object v0, v6, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->e:Lkotlin/jvm/functions/Function0;

    .line 413
    .line 414
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    return-object v0

    .line 420
    :pswitch_8
    move-object v2, v0

    .line 421
    check-cast v2, Ljava/lang/String;

    .line 422
    .line 423
    check-cast v7, La/vzg0;

    .line 424
    .line 425
    check-cast v6, La/pru;

    .line 426
    .line 427
    new-instance v1, La/knp0;

    .line 428
    .line 429
    move v8, v5

    .line 430
    sget-object v5, La/iun;->a:La/iun;

    .line 431
    .line 432
    const-string v0, "KEY_CURRENT_TAB"

    .line 433
    .line 434
    invoke-virtual {v7, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Ljava/lang/Integer;

    .line 439
    .line 440
    if-eqz v0, :cond_3

    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    move-object/from16 v27, v6

    .line 447
    .line 448
    move v6, v0

    .line 449
    move-object/from16 v0, v27

    .line 450
    .line 451
    goto :goto_2

    .line 452
    :cond_3
    move-object v0, v6

    .line 453
    move v6, v8

    .line 454
    :goto_2
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 459
    .line 460
    iget-object v0, v0, La/mum0;->x:La/zvh0;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-eqz v0, :cond_7

    .line 467
    .line 468
    if-eq v0, v4, :cond_6

    .line 469
    .line 470
    const/4 v4, 0x2

    .line 471
    if-eq v0, v4, :cond_5

    .line 472
    .line 473
    const/4 v4, 0x3

    .line 474
    if-ne v0, v4, :cond_4

    .line 475
    .line 476
    sget-object v0, La/bxh0;->a:La/bxh0;

    .line 477
    .line 478
    :goto_3
    move-object v7, v0

    .line 479
    goto :goto_4

    .line 480
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 481
    .line 482
    .line 483
    goto :goto_5

    .line 484
    :cond_5
    sget-object v0, La/cxh0;->a:La/cxh0;

    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_6
    sget-object v0, La/zwh0;->a:La/zwh0;

    .line 488
    .line 489
    goto :goto_3

    .line 490
    :cond_7
    sget-object v0, La/axh0;->a:La/axh0;

    .line 491
    .line 492
    goto :goto_3

    .line 493
    :goto_4
    const/4 v3, 0x1

    .line 494
    const/4 v4, 0x0

    .line 495
    invoke-direct/range {v1 .. v7}, La/knp0;-><init>(Ljava/lang/String;ZZLjava/util/List;ILa/dxh0;)V

    .line 496
    .line 497
    .line 498
    move-object v3, v1

    .line 499
    :goto_5
    return-object v3

    .line 500
    :pswitch_9
    check-cast v0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;

    .line 501
    .line 502
    check-cast v7, La/pru;

    .line 503
    .line 504
    check-cast v6, La/r9u;

    .line 505
    .line 506
    new-instance v8, La/wap0;

    .line 507
    .line 508
    iget-object v10, v0, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;->c:Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v7}, La/pru;->a()La/sff0;

    .line 511
    .line 512
    .line 513
    move-result-object v12

    .line 514
    sget-object v0, La/ygp;->t:La/ygp;

    .line 515
    .line 516
    iget-object v1, v6, La/r9u;->a:La/j1q0;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 522
    .line 523
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 524
    .line 525
    .line 526
    move-result v13

    .line 527
    const/4 v9, 0x1

    .line 528
    const/4 v11, 0x0

    .line 529
    invoke-direct/range {v8 .. v13}, La/wap0;-><init>(ZLjava/lang/Integer;La/j0g0;La/sff0;Z)V

    .line 530
    .line 531
    .line 532
    return-object v8

    .line 533
    :pswitch_a
    check-cast v0, La/m0n0;

    .line 534
    .line 535
    check-cast v7, La/pvi0;

    .line 536
    .line 537
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 538
    .line 539
    if-nez v0, :cond_8

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_8
    instance-of v1, v0, La/e2n0;

    .line 543
    .line 544
    if-eqz v1, :cond_9

    .line 545
    .line 546
    instance-of v1, v7, La/ovi0;

    .line 547
    .line 548
    if-eqz v1, :cond_a

    .line 549
    .line 550
    new-instance v1, La/a0n0;

    .line 551
    .line 552
    check-cast v0, La/e2n0;

    .line 553
    .line 554
    check-cast v7, La/ovi0;

    .line 555
    .line 556
    iget-boolean v2, v7, La/ovi0;->a:Z

    .line 557
    .line 558
    invoke-direct {v1, v0, v2}, La/a0n0;-><init>(La/e2n0;Z)V

    .line 559
    .line 560
    .line 561
    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    goto :goto_6

    .line 565
    :cond_9
    instance-of v1, v0, La/r0n0;

    .line 566
    .line 567
    if-eqz v1, :cond_a

    .line 568
    .line 569
    instance-of v1, v7, La/nvi0;

    .line 570
    .line 571
    if-eqz v1, :cond_a

    .line 572
    .line 573
    new-instance v1, La/yzm0;

    .line 574
    .line 575
    check-cast v0, La/r0n0;

    .line 576
    .line 577
    invoke-direct {v1, v0}, La/yzm0;-><init>(La/r0n0;)V

    .line 578
    .line 579
    .line 580
    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    :cond_a
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object v0

    .line 586
    :pswitch_b
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 587
    .line 588
    check-cast v7, La/pz40;

    .line 589
    .line 590
    check-cast v6, La/i8b;

    .line 591
    .line 592
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    check-cast v1, Ljava/lang/Boolean;

    .line 597
    .line 598
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    xor-int/2addr v1, v4

    .line 603
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    iget-wide v2, v6, La/i8b;->a:J

    .line 608
    .line 609
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 617
    .line 618
    return-object v0

    .line 619
    :pswitch_c
    check-cast v0, La/x4u;

    .line 620
    .line 621
    check-cast v7, Ljava/lang/String;

    .line 622
    .line 623
    check-cast v6, Ljava/lang/String;

    .line 624
    .line 625
    new-instance v1, La/a5g0;

    .line 626
    .line 627
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    iget-object v0, v0, La/x4u;->a:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, La/z220;

    .line 636
    .line 637
    iget-object v0, v0, La/z220;->c:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v0, La/k7g0;

    .line 640
    .line 641
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    iget-object v0, v0, La/k7g0;->b:Ljava/util/LinkedHashMap;

    .line 645
    .line 646
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    check-cast v0, Ljava/util/List;

    .line 651
    .line 652
    if-nez v0, :cond_b

    .line 653
    .line 654
    sget-object v0, La/iun;->a:La/iun;

    .line 655
    .line 656
    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    .line 657
    .line 658
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 659
    .line 660
    .line 661
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    :cond_c
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    if-eqz v3, :cond_d

    .line 670
    .line 671
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    move-object v4, v3

    .line 676
    check-cast v4, La/e8g0;

    .line 677
    .line 678
    iget-object v4, v4, La/e8g0;->b:La/ufp0;

    .line 679
    .line 680
    iget-object v4, v4, La/ufp0;->a:Ljava/lang/String;

    .line 681
    .line 682
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    if-eqz v4, :cond_c

    .line 687
    .line 688
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    goto :goto_7

    .line 692
    :cond_d
    invoke-direct {v1, v2}, La/a5g0;-><init>(Ljava/util/ArrayList;)V

    .line 693
    .line 694
    .line 695
    return-object v1

    .line 696
    :pswitch_d
    check-cast v0, La/wpq;

    .line 697
    .line 698
    check-cast v7, La/pkk0;

    .line 699
    .line 700
    check-cast v6, La/z3f0;

    .line 701
    .line 702
    sget-object v1, La/z3f0;->Y1:La/zie0;

    .line 703
    .line 704
    invoke-static {v0}, La/wpq;->a(La/wpq;)V

    .line 705
    .line 706
    .line 707
    if-eqz v7, :cond_e

    .line 708
    .line 709
    check-cast v7, La/r3k;

    .line 710
    .line 711
    invoke-virtual {v7}, La/r3k;->a()V

    .line 712
    .line 713
    .line 714
    :cond_e
    invoke-virtual {v6}, La/z3f0;->H0()La/k3t0;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    sget-object v1, La/q2f0;->a:La/q2f0;

    .line 719
    .line 720
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 724
    .line 725
    return-object v0

    .line 726
    :pswitch_e
    check-cast v0, La/wpq;

    .line 727
    .line 728
    check-cast v7, La/pkk0;

    .line 729
    .line 730
    check-cast v6, La/pz40;

    .line 731
    .line 732
    check-cast v0, La/ypq;

    .line 733
    .line 734
    invoke-virtual {v0, v4}, La/ypq;->b(Z)V

    .line 735
    .line 736
    .line 737
    if-eqz v7, :cond_f

    .line 738
    .line 739
    check-cast v7, La/r3k;

    .line 740
    .line 741
    invoke-virtual {v7}, La/r3k;->a()V

    .line 742
    .line 743
    .line 744
    :cond_f
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 749
    .line 750
    sget-object v1, La/pve0;->a:La/pve0;

    .line 751
    .line 752
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 756
    .line 757
    return-object v0

    .line 758
    :pswitch_f
    move v8, v5

    .line 759
    check-cast v0, La/pru;

    .line 760
    .line 761
    check-cast v7, La/ctf0;

    .line 762
    .line 763
    move-object/from16 v19, v6

    .line 764
    .line 765
    check-cast v19, La/qho;

    .line 766
    .line 767
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    iget-object v1, v1, La/sff0;->l:La/toc0;

    .line 772
    .line 773
    new-instance v9, La/mmc0;

    .line 774
    .line 775
    new-array v3, v8, [Ljava/lang/Object;

    .line 776
    .line 777
    iget-object v4, v7, La/ctf0;->b:La/lsm0;

    .line 778
    .line 779
    iget-object v5, v7, La/ctf0;->b:La/lsm0;

    .line 780
    .line 781
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    const v6, 0x7f131049

    .line 786
    .line 787
    .line 788
    invoke-virtual {v4, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v10

    .line 792
    iget-boolean v11, v1, La/toc0;->k:Z

    .line 793
    .line 794
    iget-boolean v12, v1, La/toc0;->a:Z

    .line 795
    .line 796
    sget-object v1, La/yee;->a:La/yee;

    .line 797
    .line 798
    sget-object v15, La/dfe;->a:La/dfe;

    .line 799
    .line 800
    if-eqz v11, :cond_10

    .line 801
    .line 802
    move-object v13, v15

    .line 803
    goto :goto_8

    .line 804
    :cond_10
    move-object v13, v1

    .line 805
    :goto_8
    if-eqz v12, :cond_11

    .line 806
    .line 807
    move-object v14, v15

    .line 808
    goto :goto_9

    .line 809
    :cond_11
    move-object v14, v1

    .line 810
    :goto_9
    new-array v1, v8, [Ljava/lang/Object;

    .line 811
    .line 812
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    const v3, 0x7f131019

    .line 817
    .line 818
    .line 819
    invoke-virtual {v5, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v16

    .line 823
    new-array v1, v8, [Ljava/lang/Object;

    .line 824
    .line 825
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    invoke-virtual {v5, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v17

    .line 833
    new-array v1, v8, [Ljava/lang/Object;

    .line 834
    .line 835
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    const v2, 0x7f130073

    .line 840
    .line 841
    .line 842
    invoke-virtual {v5, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v18

    .line 846
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    iget-object v0, v0, La/sff0;->Z1:Ljava/lang/String;

    .line 851
    .line 852
    move-object/from16 v20, v0

    .line 853
    .line 854
    invoke-direct/range {v9 .. v20}, La/mmc0;-><init>(Ljava/lang/String;ZZLa/gfe;La/gfe;La/gfe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/qho;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    return-object v9

    .line 858
    :pswitch_10
    move v8, v5

    .line 859
    check-cast v0, La/pru;

    .line 860
    .line 861
    check-cast v7, La/ctf0;

    .line 862
    .line 863
    move-object v9, v6

    .line 864
    check-cast v9, La/g2v;

    .line 865
    .line 866
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    iget-object v0, v0, La/sff0;->l:La/toc0;

    .line 871
    .line 872
    sget-object v1, La/iun;->a:La/iun;

    .line 873
    .line 874
    iget-boolean v3, v0, La/toc0;->c:Z

    .line 875
    .line 876
    iget-boolean v0, v0, La/toc0;->e:Z

    .line 877
    .line 878
    new-array v4, v8, [Ljava/lang/Object;

    .line 879
    .line 880
    iget-object v5, v7, La/ctf0;->b:La/lsm0;

    .line 881
    .line 882
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v4

    .line 886
    const v6, 0x7f13101c

    .line 887
    .line 888
    .line 889
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v23

    .line 893
    new-array v4, v8, [Ljava/lang/Object;

    .line 894
    .line 895
    iget-object v5, v7, La/ctf0;->b:La/lsm0;

    .line 896
    .line 897
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    const v6, 0x7f13107e

    .line 902
    .line 903
    .line 904
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v24

    .line 908
    new-array v4, v8, [Ljava/lang/Object;

    .line 909
    .line 910
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    const v6, 0x7f13101b

    .line 915
    .line 916
    .line 917
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v25

    .line 921
    new-array v4, v8, [Ljava/lang/Object;

    .line 922
    .line 923
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v4

    .line 927
    invoke-virtual {v5, v2, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v26

    .line 931
    sget-object v10, La/pb10;->e:La/pb10;

    .line 932
    .line 933
    const-wide/16 v20, 0x0

    .line 934
    .line 935
    const/16 v22, 0x3de

    .line 936
    .line 937
    const/4 v11, 0x0

    .line 938
    const/4 v12, 0x0

    .line 939
    const/4 v13, 0x0

    .line 940
    const/4 v14, 0x0

    .line 941
    const v15, 0x7f1305c0

    .line 942
    .line 943
    .line 944
    const/16 v16, 0x0

    .line 945
    .line 946
    const/16 v17, 0x0

    .line 947
    .line 948
    const-wide/16 v18, 0x0

    .line 949
    .line 950
    invoke-static/range {v9 .. v22}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    sget-object v10, La/pb10;->g:La/pb10;

    .line 955
    .line 956
    const/16 v22, 0x25e

    .line 957
    .line 958
    const v15, 0x7f130677

    .line 959
    .line 960
    .line 961
    const v17, 0x7f131690

    .line 962
    .line 963
    .line 964
    const-wide/16 v18, 0x2328

    .line 965
    .line 966
    invoke-static/range {v9 .. v22}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 967
    .line 968
    .line 969
    move-result-object v22

    .line 970
    new-instance v10, La/rrc0;

    .line 971
    .line 972
    const/16 v19, 0x0

    .line 973
    .line 974
    const/16 v20, 0x0

    .line 975
    .line 976
    const/4 v12, 0x0

    .line 977
    const/16 v16, 0x1

    .line 978
    .line 979
    const-string v17, ""

    .line 980
    .line 981
    const/16 v18, 0x1

    .line 982
    .line 983
    move v15, v0

    .line 984
    move-object v11, v1

    .line 985
    move-object/from16 v21, v2

    .line 986
    .line 987
    move v14, v3

    .line 988
    invoke-direct/range {v10 .. v26}, La/rrc0;-><init>(Ljava/util/List;IZZZZLjava/lang/String;ZZZLa/mdm;La/mdm;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    return-object v10

    .line 992
    :pswitch_11
    move v8, v5

    .line 993
    check-cast v0, La/ctf0;

    .line 994
    .line 995
    check-cast v7, La/vzg0;

    .line 996
    .line 997
    check-cast v6, La/pru;

    .line 998
    .line 999
    new-array v1, v8, [Ljava/lang/Object;

    .line 1000
    .line 1001
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1002
    .line 1003
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    const v2, 0x7f130049

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v10

    .line 1014
    const-string v0, "CONTENT_STATE_KEY"

    .line 1015
    .line 1016
    invoke-virtual {v7, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    move-object v11, v0

    .line 1021
    check-cast v11, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;

    .line 1022
    .line 1023
    const-string v0, "KEY_WAS_KEYBOARD_OPEN"

    .line 1024
    .line 1025
    invoke-virtual {v7, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    check-cast v0, Ljava/lang/Boolean;

    .line 1030
    .line 1031
    if-eqz v0, :cond_12

    .line 1032
    .line 1033
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1034
    .line 1035
    .line 1036
    move-result v5

    .line 1037
    move/from16 v22, v5

    .line 1038
    .line 1039
    goto :goto_a

    .line 1040
    :cond_12
    move/from16 v22, v8

    .line 1041
    .line 1042
    :goto_a
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 1047
    .line 1048
    iget-boolean v0, v0, La/hl1;->z:Z

    .line 1049
    .line 1050
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 1055
    .line 1056
    iget-boolean v1, v1, La/hl1;->A:Z

    .line 1057
    .line 1058
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    iget-object v2, v2, La/sff0;->b:La/hl1;

    .line 1063
    .line 1064
    iget v2, v2, La/hl1;->B:I

    .line 1065
    .line 1066
    sget-object v15, La/iun;->a:La/iun;

    .line 1067
    .line 1068
    new-instance v9, La/iac0;

    .line 1069
    .line 1070
    const/16 v17, 0x0

    .line 1071
    .line 1072
    const/16 v18, 0x0

    .line 1073
    .line 1074
    const/4 v12, 0x0

    .line 1075
    const-string v13, ""

    .line 1076
    .line 1077
    const-string v14, ""

    .line 1078
    .line 1079
    const-string v16, ""

    .line 1080
    .line 1081
    move/from16 v19, v0

    .line 1082
    .line 1083
    move/from16 v20, v1

    .line 1084
    .line 1085
    move/from16 v21, v2

    .line 1086
    .line 1087
    invoke-direct/range {v9 .. v22}, La/iac0;-><init>(Ljava/lang/String;Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZIZ)V

    .line 1088
    .line 1089
    .line 1090
    return-object v9

    .line 1091
    :pswitch_12
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1092
    .line 1093
    check-cast v7, La/st0;

    .line 1094
    .line 1095
    check-cast v6, La/mza0;

    .line 1096
    .line 1097
    new-instance v8, La/tya0;

    .line 1098
    .line 1099
    iget-wide v9, v7, La/st0;->a:J

    .line 1100
    .line 1101
    iget-wide v11, v6, La/mza0;->b:J

    .line 1102
    .line 1103
    iget-object v13, v6, La/mza0;->a:La/fza0;

    .line 1104
    .line 1105
    iget-object v14, v7, La/st0;->g:Ljava/lang/Integer;

    .line 1106
    .line 1107
    invoke-direct/range {v8 .. v14}, La/tya0;-><init>(JJLa/fza0;Ljava/lang/Integer;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-interface {v0, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1114
    .line 1115
    return-object v0

    .line 1116
    :pswitch_13
    move-object v3, v0

    .line 1117
    check-cast v3, La/g9b0;

    .line 1118
    .line 1119
    check-cast v7, La/a570;

    .line 1120
    .line 1121
    move-object v0, v6

    .line 1122
    check-cast v0, Ljava/lang/String;

    .line 1123
    .line 1124
    move-object v2, v7

    .line 1125
    check-cast v2, La/z470;

    .line 1126
    .line 1127
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v13

    .line 1131
    iget-object v1, v3, La/g9b0;->h:La/mne;

    .line 1132
    .line 1133
    iget-object v14, v1, La/mne;->b:La/dvj;

    .line 1134
    .line 1135
    new-instance v5, La/wma0;

    .line 1136
    .line 1137
    const/4 v11, 0x0

    .line 1138
    const/16 v12, 0x1d

    .line 1139
    .line 1140
    const/4 v6, 0x1

    .line 1141
    const-class v8, La/g9b0;

    .line 1142
    .line 1143
    const-string v9, "handleGameError"

    .line 1144
    .line 1145
    const-string v10, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1146
    .line 1147
    move-object v7, v3

    .line 1148
    invoke-direct/range {v5 .. v12}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1149
    .line 1150
    .line 1151
    move-object v7, v5

    .line 1152
    new-instance v8, La/k8b0;

    .line 1153
    .line 1154
    invoke-direct {v8, v3, v4}, La/k8b0;-><init>(La/g9b0;B)V

    .line 1155
    .line 1156
    .line 1157
    new-instance v1, La/up6;

    .line 1158
    .line 1159
    const/4 v5, 0x0

    .line 1160
    const/4 v6, 0x5

    .line 1161
    move-object v4, v0

    .line 1162
    invoke-direct/range {v1 .. v6}, La/up6;-><init>(La/z470;Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 1163
    .line 1164
    .line 1165
    const/16 v10, 0x8

    .line 1166
    .line 1167
    move-object v9, v1

    .line 1168
    move-object v6, v7

    .line 1169
    move-object v7, v8

    .line 1170
    move-object v5, v13

    .line 1171
    move-object v8, v14

    .line 1172
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1173
    .line 1174
    .line 1175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1176
    .line 1177
    return-object v0

    .line 1178
    :pswitch_14
    check-cast v0, La/xcz;

    .line 1179
    .line 1180
    check-cast v7, La/l7m0;

    .line 1181
    .line 1182
    check-cast v6, La/pz40;

    .line 1183
    .line 1184
    new-instance v1, La/prs0;

    .line 1185
    .line 1186
    sget v2, La/ys90;->a:F

    .line 1187
    .line 1188
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v2

    .line 1192
    check-cast v2, Ljava/lang/Number;

    .line 1193
    .line 1194
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1195
    .line 1196
    .line 1197
    move-result v2

    .line 1198
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    iget-object v0, v0, La/xcz;->j:La/ywj;

    .line 1203
    .line 1204
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v3

    .line 1216
    check-cast v3, Ljava/lang/Boolean;

    .line 1217
    .line 1218
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1219
    .line 1220
    .line 1221
    invoke-direct {v1, v2, v0, v3}, La/prs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1222
    .line 1223
    .line 1224
    return-object v1

    .line 1225
    :pswitch_15
    check-cast v0, La/bet;

    .line 1226
    .line 1227
    check-cast v7, La/t9k0;

    .line 1228
    .line 1229
    check-cast v6, La/s080;

    .line 1230
    .line 1231
    if-eqz v0, :cond_13

    .line 1232
    .line 1233
    invoke-virtual {v7, v0}, La/t9k0;->c(La/bet;)I

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    iget v1, v7, La/t9k0;->t:I

    .line 1238
    .line 1239
    sub-int/2addr v0, v1

    .line 1240
    invoke-virtual {v7, v0}, La/t9k0;->a(I)V

    .line 1241
    .line 1242
    .line 1243
    :cond_13
    iget v0, v7, La/t9k0;->t:I

    .line 1244
    .line 1245
    invoke-static {v7, v3, v0, v3}, La/aac;->O(La/t9k0;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    check-cast v1, La/kkd;

    .line 1254
    .line 1255
    if-eqz v1, :cond_14

    .line 1256
    .line 1257
    iget-object v1, v1, La/kkd;->b:Ljava/lang/Integer;

    .line 1258
    .line 1259
    goto :goto_b

    .line 1260
    :cond_14
    move-object v1, v3

    .line 1261
    :goto_b
    invoke-interface {v6, v1}, La/s080;->a(Ljava/lang/Integer;)Ljava/util/List;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v2

    .line 1265
    if-eqz v1, :cond_16

    .line 1266
    .line 1267
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1268
    .line 1269
    .line 1270
    move-result v5

    .line 1271
    if-eqz v5, :cond_15

    .line 1272
    .line 1273
    goto :goto_c

    .line 1274
    :cond_15
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v5

    .line 1278
    check-cast v5, La/kkd;

    .line 1279
    .line 1280
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v2

    .line 1284
    iget v4, v5, La/kkd;->a:I

    .line 1285
    .line 1286
    new-instance v5, La/kkd;

    .line 1287
    .line 1288
    invoke-direct {v5, v4, v3, v1}, La/kkd;-><init>(ILa/fww;Ljava/lang/Integer;)V

    .line 1289
    .line 1290
    .line 1291
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v1

    .line 1295
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    :cond_16
    :goto_c
    new-instance v1, La/ikd;

    .line 1300
    .line 1301
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    invoke-interface {v6}, La/s080;->b()Z

    .line 1306
    .line 1307
    .line 1308
    move-result v2

    .line 1309
    invoke-direct {v1, v0, v2}, La/ikd;-><init>(Ljava/util/List;Z)V

    .line 1310
    .line 1311
    .line 1312
    return-object v1

    .line 1313
    :pswitch_16
    check-cast v0, La/mh70;

    .line 1314
    .line 1315
    check-cast v7, Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 1316
    .line 1317
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1318
    .line 1319
    iget-boolean v1, v0, La/mh70;->P1:Z

    .line 1320
    .line 1321
    if-eqz v1, :cond_18

    .line 1322
    .line 1323
    invoke-virtual {v7}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    invoke-virtual {v0}, La/mh70;->I0()La/ji70;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v10

    .line 1331
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v0

    .line 1335
    iget-object v1, v10, La/ji70;->k:La/r8u;

    .line 1336
    .line 1337
    invoke-virtual {v1}, La/r8u;->a()Z

    .line 1338
    .line 1339
    .line 1340
    move-result v1

    .line 1341
    if-nez v1, :cond_17

    .line 1342
    .line 1343
    goto :goto_d

    .line 1344
    :cond_17
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v1

    .line 1348
    new-instance v8, La/cf70;

    .line 1349
    .line 1350
    const/4 v14, 0x0

    .line 1351
    const/16 v15, 0x16

    .line 1352
    .line 1353
    const/4 v9, 0x1

    .line 1354
    const-class v11, La/ji70;

    .line 1355
    .line 1356
    const-string v12, "handleGameError"

    .line 1357
    .line 1358
    const-string v13, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1359
    .line 1360
    invoke-direct/range {v8 .. v15}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1361
    .line 1362
    .line 1363
    iget-object v2, v10, La/ji70;->l:La/mne;

    .line 1364
    .line 1365
    iget-object v14, v2, La/mne;->b:La/dvj;

    .line 1366
    .line 1367
    new-instance v15, La/wg70;

    .line 1368
    .line 1369
    invoke-direct {v15, v10, v0, v3, v4}, La/wg70;-><init>(La/w46;Ljava/lang/String;La/yje;B)V

    .line 1370
    .line 1371
    .line 1372
    const/16 v16, 0xa

    .line 1373
    .line 1374
    const/4 v13, 0x0

    .line 1375
    move-object v11, v1

    .line 1376
    move-object v12, v8

    .line 1377
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1378
    .line 1379
    .line 1380
    :cond_18
    :goto_d
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v7}, Landroid/view/View;->clearFocus()V

    .line 1384
    .line 1385
    .line 1386
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1387
    .line 1388
    return-object v0

    .line 1389
    :pswitch_17
    move v8, v5

    .line 1390
    check-cast v0, La/dg70;

    .line 1391
    .line 1392
    check-cast v7, Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 1393
    .line 1394
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1395
    .line 1396
    iget-boolean v1, v0, La/dg70;->P1:Z

    .line 1397
    .line 1398
    if-eqz v1, :cond_1a

    .line 1399
    .line 1400
    invoke-virtual {v7}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v1

    .line 1404
    invoke-virtual {v0}, La/dg70;->J0()La/eh70;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v11

    .line 1408
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    iget-object v1, v11, La/eh70;->k:La/r8u;

    .line 1413
    .line 1414
    invoke-virtual {v1}, La/r8u;->a()Z

    .line 1415
    .line 1416
    .line 1417
    move-result v1

    .line 1418
    if-nez v1, :cond_19

    .line 1419
    .line 1420
    goto :goto_e

    .line 1421
    :cond_19
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v1

    .line 1425
    new-instance v9, La/cf70;

    .line 1426
    .line 1427
    const/4 v15, 0x0

    .line 1428
    const/16 v16, 0xd

    .line 1429
    .line 1430
    const/4 v10, 0x1

    .line 1431
    const-class v12, La/eh70;

    .line 1432
    .line 1433
    const-string v13, "handleGameError"

    .line 1434
    .line 1435
    const-string v14, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1436
    .line 1437
    invoke-direct/range {v9 .. v16}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1438
    .line 1439
    .line 1440
    iget-object v2, v11, La/eh70;->l:La/mne;

    .line 1441
    .line 1442
    iget-object v15, v2, La/mne;->a:La/rwj;

    .line 1443
    .line 1444
    new-instance v2, La/wg70;

    .line 1445
    .line 1446
    invoke-direct {v2, v11, v0, v3, v8}, La/wg70;-><init>(La/w46;Ljava/lang/String;La/yje;B)V

    .line 1447
    .line 1448
    .line 1449
    const/16 v17, 0xa

    .line 1450
    .line 1451
    const/4 v14, 0x0

    .line 1452
    move-object v12, v1

    .line 1453
    move-object/from16 v16, v2

    .line 1454
    .line 1455
    move-object v13, v9

    .line 1456
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1457
    .line 1458
    .line 1459
    :cond_1a
    :goto_e
    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v7}, Landroid/view/View;->clearFocus()V

    .line 1463
    .line 1464
    .line 1465
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1466
    .line 1467
    return-object v0

    .line 1468
    :pswitch_18
    check-cast v0, La/bxa;

    .line 1469
    .line 1470
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1471
    .line 1472
    check-cast v6, La/pz40;

    .line 1473
    .line 1474
    iget-object v0, v0, La/bxa;->a:La/cza;

    .line 1475
    .line 1476
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v1

    .line 1480
    check-cast v1, Ljava/lang/String;

    .line 1481
    .line 1482
    invoke-static {v0, v1, v7}, La/jiq0;->s0(La/cza;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 1483
    .line 1484
    .line 1485
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1486
    .line 1487
    return-object v0

    .line 1488
    :pswitch_19
    move v8, v5

    .line 1489
    check-cast v0, La/pru;

    .line 1490
    .line 1491
    check-cast v7, La/ctf0;

    .line 1492
    .line 1493
    check-cast v6, Landroid/os/Bundle;

    .line 1494
    .line 1495
    new-instance v9, La/rc50;

    .line 1496
    .line 1497
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v1

    .line 1501
    iget-object v1, v1, La/sff0;->d:La/q1w0;

    .line 1502
    .line 1503
    iget-object v1, v1, La/q1w0;->a:La/dyv0;

    .line 1504
    .line 1505
    iget-object v10, v1, La/dyv0;->b:Ljava/lang/String;

    .line 1506
    .line 1507
    new-array v1, v8, [Ljava/lang/Object;

    .line 1508
    .line 1509
    iget-object v2, v7, La/ctf0;->b:La/lsm0;

    .line 1510
    .line 1511
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    const v5, 0x7f1311c4

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v2, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v12

    .line 1522
    const/4 v14, 0x0

    .line 1523
    const/4 v15, 0x0

    .line 1524
    const-string v11, ""

    .line 1525
    .line 1526
    const/4 v13, 0x1

    .line 1527
    invoke-direct/range {v9 .. v15}, La/rc50;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 1528
    .line 1529
    .line 1530
    new-instance v14, La/zm5;

    .line 1531
    .line 1532
    invoke-direct {v14, v3, v3, v3, v4}, La/zm5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v15, La/tdt;

    .line 1536
    .line 1537
    const/16 v16, 0x0

    .line 1538
    .line 1539
    const/16 v17, 0x0

    .line 1540
    .line 1541
    const/16 v18, 0x0

    .line 1542
    .line 1543
    const/16 v19, 0x0

    .line 1544
    .line 1545
    const/16 v20, 0x0

    .line 1546
    .line 1547
    invoke-direct/range {v15 .. v20}, La/tdt;-><init>(IILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 1548
    .line 1549
    .line 1550
    new-instance v16, La/f3b;

    .line 1551
    .line 1552
    invoke-direct/range {v16 .. v16}, La/f3b;-><init>()V

    .line 1553
    .line 1554
    .line 1555
    if-eqz v6, :cond_1b

    .line 1556
    .line 1557
    const-string v1, "GAME_ID_TO_OPEN_BUNDLE_KEY"

    .line 1558
    .line 1559
    invoke-virtual {v6, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 1560
    .line 1561
    .line 1562
    move-result-wide v1

    .line 1563
    :goto_f
    move-wide/from16 v17, v1

    .line 1564
    .line 1565
    goto :goto_10

    .line 1566
    :cond_1b
    const-wide/16 v1, 0x0

    .line 1567
    .line 1568
    goto :goto_f

    .line 1569
    :goto_10
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v1

    .line 1573
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 1574
    .line 1575
    iget-object v1, v1, La/mum0;->e:La/kg;

    .line 1576
    .line 1577
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v0

    .line 1581
    iget-object v0, v0, La/sff0;->d:La/q1w0;

    .line 1582
    .line 1583
    iget-object v0, v0, La/q1w0;->a:La/dyv0;

    .line 1584
    .line 1585
    iget-boolean v0, v0, La/dyv0;->d:Z

    .line 1586
    .line 1587
    move-object v13, v9

    .line 1588
    new-instance v9, La/w370;

    .line 1589
    .line 1590
    const/16 v21, 0x0

    .line 1591
    .line 1592
    const/16 v22, 0x0

    .line 1593
    .line 1594
    const/4 v10, 0x1

    .line 1595
    const/4 v11, 0x0

    .line 1596
    const/4 v12, 0x0

    .line 1597
    const/16 v19, 0x1

    .line 1598
    .line 1599
    const/16 v20, 0x0

    .line 1600
    .line 1601
    move/from16 v24, v0

    .line 1602
    .line 1603
    move-object/from16 v23, v1

    .line 1604
    .line 1605
    invoke-direct/range {v9 .. v24}, La/w370;-><init>(ZZLa/mdm;La/rc50;La/zm5;La/tdt;La/f3b;JZZZZLa/kg;Z)V

    .line 1606
    .line 1607
    .line 1608
    return-object v9

    .line 1609
    :pswitch_1a
    move-object v2, v0

    .line 1610
    check-cast v2, La/pm60;

    .line 1611
    .line 1612
    check-cast v7, La/a570;

    .line 1613
    .line 1614
    move-object v8, v6

    .line 1615
    check-cast v8, Ljava/lang/String;

    .line 1616
    .line 1617
    move-object v9, v7

    .line 1618
    check-cast v9, La/z470;

    .line 1619
    .line 1620
    invoke-virtual {v2}, La/eiu0;->s()La/diu0;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v10

    .line 1628
    iget-object v0, v2, La/pm60;->h:La/mne;

    .line 1629
    .line 1630
    iget-object v13, v0, La/mne;->b:La/dvj;

    .line 1631
    .line 1632
    new-instance v0, La/jw50;

    .line 1633
    .line 1634
    const/4 v6, 0x0

    .line 1635
    const/16 v7, 0x14

    .line 1636
    .line 1637
    const/4 v1, 0x1

    .line 1638
    const-class v3, La/pm60;

    .line 1639
    .line 1640
    const-string v4, "handleGameError"

    .line 1641
    .line 1642
    const-string v5, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1643
    .line 1644
    invoke-direct/range {v0 .. v7}, La/jw50;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1645
    .line 1646
    .line 1647
    move-object v11, v0

    .line 1648
    new-instance v0, La/up6;

    .line 1649
    .line 1650
    const/4 v4, 0x0

    .line 1651
    const/4 v5, 0x4

    .line 1652
    move-object v3, v8

    .line 1653
    move-object v1, v9

    .line 1654
    invoke-direct/range {v0 .. v5}, La/up6;-><init>(La/z470;Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 1655
    .line 1656
    .line 1657
    const/16 v15, 0xa

    .line 1658
    .line 1659
    const/4 v12, 0x0

    .line 1660
    move-object v14, v0

    .line 1661
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1662
    .line 1663
    .line 1664
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1665
    .line 1666
    return-object v0

    .line 1667
    :pswitch_1b
    move-object v1, v0

    .line 1668
    check-cast v1, Landroid/view/Window;

    .line 1669
    .line 1670
    move-object v2, v7

    .line 1671
    check-cast v2, Landroid/content/Context;

    .line 1672
    .line 1673
    check-cast v6, La/a8z;

    .line 1674
    .line 1675
    if-eqz v1, :cond_1c

    .line 1676
    .line 1677
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    check-cast v0, La/k9o0;

    .line 1682
    .line 1683
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1684
    .line 1685
    .line 1686
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    check-cast v0, La/k9o0;

    .line 1691
    .line 1692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1693
    .line 1694
    .line 1695
    const/4 v5, 0x0

    .line 1696
    const/4 v6, 0x0

    .line 1697
    const v3, 0x7f040b5d

    .line 1698
    .line 1699
    .line 1700
    const v4, 0x7f040b5d

    .line 1701
    .line 1702
    .line 1703
    invoke-static/range {v1 .. v6}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 1704
    .line 1705
    .line 1706
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1707
    .line 1708
    return-object v0

    .line 1709
    :pswitch_1c
    check-cast v0, La/ak60;

    .line 1710
    .line 1711
    check-cast v7, La/xkb0;

    .line 1712
    .line 1713
    check-cast v6, La/i3t0;

    .line 1714
    .line 1715
    iget-object v0, v0, La/ak60;->g:La/av9;

    .line 1716
    .line 1717
    if-nez v0, :cond_1d

    .line 1718
    .line 1719
    new-instance v0, La/yu9;

    .line 1720
    .line 1721
    invoke-interface {v7}, La/xkb0;->a()La/sh60;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v1

    .line 1725
    invoke-interface {v7}, La/xkb0;->b()La/skb0;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v2

    .line 1729
    invoke-direct {v0, v1, v2}, La/yu9;-><init>(La/sh60;La/skb0;)V

    .line 1730
    .line 1731
    .line 1732
    :cond_1d
    new-instance v1, La/uh60;

    .line 1733
    .line 1734
    invoke-direct {v1, v0}, La/uh60;-><init>(La/av9;)V

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v6, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 1738
    .line 1739
    .line 1740
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1741
    .line 1742
    return-object v0

    .line 1743
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
