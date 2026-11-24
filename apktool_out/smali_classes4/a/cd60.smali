.class public final synthetic La/cd60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cl80;La/qah0;)V
    .locals 0

    .line 1
    const/16 p2, 0x1c

    iput-byte p2, p0, La/cd60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cd60;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/cd60;->a:B

    iput-object p1, p0, La/cd60;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cd60;->a:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    sget-object v3, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 7
    .line 8
    sget-object v4, La/wx70;->a:La/wx70;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0xa

    .line 12
    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    iget-object v0, v0, La/cd60;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v0, La/t3w;

    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/h7d;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, v1, La/h7d;->c:La/mva;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/q4;->F(La/mva;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    check-cast v0, La/cl80;

    .line 40
    .line 41
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Float;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v0, v0, La/cl80;->b:La/xk80;

    .line 50
    .line 51
    invoke-virtual {v0}, La/xk80;->p()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0}, La/xk80;->p()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    int-to-float v2, v2

    .line 62
    div-float/2addr v1, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 v1, 0x0

    .line 65
    :goto_0
    invoke-static {v1}, La/si30;->b(F)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {v0}, La/xk80;->k()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    add-int/2addr v2, v1

    .line 74
    invoke-virtual {v0, v2}, La/xk80;->j(I)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget-object v0, v0, La/xk80;->q:La/cgk0;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/cgk0;->m(I)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_1
    check-cast v0, La/xc80;

    .line 87
    .line 88
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, La/f240;

    .line 91
    .line 92
    sget-object v2, La/xc80;->O1:La/mi70;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v0, v0, La/xc80;->M1:La/kiu0;

    .line 98
    .line 99
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/rio0;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, La/rio0;->E(La/f240;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_2
    check-cast v0, La/mdm;

    .line 112
    .line 113
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, La/hcz;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance v2, La/uc80;

    .line 121
    .line 122
    invoke-direct {v2, v0, v9}, La/uc80;-><init>(La/mdm;B)V

    .line 123
    .line 124
    .line 125
    new-instance v0, La/ugd;

    .line 126
    .line 127
    const v3, -0x7534adfc

    .line 128
    .line 129
    .line 130
    invoke-direct {v0, v3, v9, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v1, v10, v10, v0, v7}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 134
    .line 135
    .line 136
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_3
    check-cast v0, La/kc80;

    .line 140
    .line 141
    move-object/from16 v1, p1

    .line 142
    .line 143
    check-cast v1, La/f240;

    .line 144
    .line 145
    sget-object v2, La/kc80;->O1:La/nh70;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v0, v0, La/kc80;->M1:La/kiu0;

    .line 151
    .line 152
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, La/fho0;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, La/fho0;->F(La/f240;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_4
    check-cast v0, La/z880;

    .line 165
    .line 166
    move-object/from16 v1, p1

    .line 167
    .line 168
    check-cast v1, Landroid/view/View;

    .line 169
    .line 170
    sget-object v2, La/z880;->U1:La/xi70;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v1, v0, La/aa80;->r:La/tkt0;

    .line 180
    .line 181
    iget-object v2, v0, La/aa80;->z:La/p7m0;

    .line 182
    .line 183
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, La/d980;

    .line 188
    .line 189
    iget-object v3, v3, La/d980;->e:La/b980;

    .line 190
    .line 191
    iget-object v3, v3, La/b980;->a:Ljava/util/List;

    .line 192
    .line 193
    new-instance v4, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-static {v3, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eqz v5, :cond_1

    .line 211
    .line 212
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    check-cast v5, La/bt9;

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v6, La/jq90;

    .line 222
    .line 223
    iget v7, v5, La/bt9;->a:I

    .line 224
    .line 225
    iget-object v5, v5, La/bt9;->b:Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v6, v7, v5}, La/jq90;-><init>(ILjava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object v1, v1, La/tkt0;->a:La/dq00;

    .line 238
    .line 239
    invoke-virtual {v1, v4}, La/dq00;->k(Ljava/util/List;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, v0, La/aa80;->A:La/p7m0;

    .line 243
    .line 244
    new-instance v1, La/v880;

    .line 245
    .line 246
    new-instance v3, Lorg/xplatform/picker/api/presentation/PickerParams$Language;

    .line 247
    .line 248
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, La/d980;

    .line 253
    .line 254
    iget-object v2, v2, La/d980;->e:La/b980;

    .line 255
    .line 256
    iget-object v2, v2, La/b980;->b:La/bt9;

    .line 257
    .line 258
    if-eqz v2, :cond_2

    .line 259
    .line 260
    iget v2, v2, La/bt9;->a:I

    .line 261
    .line 262
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-direct {v3, v2}, Lorg/xplatform/picker/api/presentation/PickerParams$Language;-><init>(Ljava/lang/Integer;)V

    .line 267
    .line 268
    .line 269
    invoke-direct {v1, v3}, La/v880;-><init>(Lorg/xplatform/picker/api/presentation/PickerParams$Language;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_5
    move-object v1, v0

    .line 282
    check-cast v1, La/cy70;

    .line 283
    .line 284
    move-object/from16 v0, p1

    .line 285
    .line 286
    check-cast v0, Ljava/lang/Throwable;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 292
    .line 293
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 294
    .line 295
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 303
    .line 304
    move-object v5, v0

    .line 305
    check-cast v5, La/ay70;

    .line 306
    .line 307
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-static {v5, v8}, La/ay70;->a(La/ay70;Z)La/ay70;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_3

    .line 319
    .line 320
    iget-object v0, v1, La/cy70;->o:La/ctf0;

    .line 321
    .line 322
    new-array v2, v8, [Ljava/lang/Object;

    .line 323
    .line 324
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 325
    .line 326
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    const v3, 0x7f1307d0

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    new-instance v2, La/yx70;

    .line 338
    .line 339
    invoke-direct {v2, v0}, La/yx70;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_6
    move-object v3, v0

    .line 352
    check-cast v3, La/ox70;

    .line 353
    .line 354
    iget-object v0, v3, La/ox70;->k2:La/a8z;

    .line 355
    .line 356
    move-object/from16 v1, p1

    .line 357
    .line 358
    check-cast v1, La/zx70;

    .line 359
    .line 360
    sget-object v2, La/ox70;->n2:La/mi70;

    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    instance-of v2, v1, La/xx70;

    .line 366
    .line 367
    if-eqz v2, :cond_5

    .line 368
    .line 369
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    if-eqz v2, :cond_4

    .line 374
    .line 375
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, La/ymi;

    .line 380
    .line 381
    iget-object v0, v0, La/ymi;->a:La/xzp;

    .line 382
    .line 383
    iget-object v0, v0, La/xzp;->c:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, La/wdk0;

    .line 386
    .line 387
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    const v4, 0x7f131316

    .line 391
    .line 392
    .line 393
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    check-cast v1, La/xx70;

    .line 401
    .line 402
    iget-object v1, v1, La/xx70;->a:Ljava/lang/String;

    .line 403
    .line 404
    const-string v5, "org.telegram.messenger"

    .line 405
    .line 406
    invoke-static {v2, v0, v4, v5, v1}, La/n6x;->i0(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    :cond_4
    invoke-virtual {v3}, La/yo8;->y0()V

    .line 410
    .line 411
    .line 412
    goto :goto_2

    .line 413
    :cond_5
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-eqz v2, :cond_6

    .line 418
    .line 419
    invoke-virtual {v3}, La/yo8;->y0()V

    .line 420
    .line 421
    .line 422
    goto :goto_2

    .line 423
    :cond_6
    instance-of v2, v1, La/yx70;

    .line 424
    .line 425
    if-eqz v2, :cond_7

    .line 426
    .line 427
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v0, La/ymi;

    .line 432
    .line 433
    iget-object v0, v0, La/ymi;->a:La/xzp;

    .line 434
    .line 435
    iget-object v0, v0, La/xzp;->c:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, La/wdk0;

    .line 438
    .line 439
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    new-instance v2, La/xdk0;

    .line 443
    .line 444
    sget-object v5, La/rek0;->b:La/rek0;

    .line 445
    .line 446
    check-cast v1, La/yx70;

    .line 447
    .line 448
    iget-object v6, v1, La/yx70;->a:Ljava/lang/String;

    .line 449
    .line 450
    const/4 v10, 0x0

    .line 451
    const/16 v11, 0x7c

    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const/4 v8, 0x0

    .line 455
    const/4 v9, 0x0

    .line 456
    move-object v4, v2

    .line 457
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 458
    .line 459
    .line 460
    const/16 v8, 0x3fc

    .line 461
    .line 462
    const/4 v4, 0x0

    .line 463
    const/4 v5, 0x0

    .line 464
    const/4 v6, 0x0

    .line 465
    move-object v1, v0

    .line 466
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 467
    .line 468
    .line 469
    :goto_2
    invoke-virtual {v3}, La/ox70;->P0()La/k3t0;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    sget-object v1, La/qx70;->a:La/qx70;

    .line 474
    .line 475
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    goto :goto_3

    .line 481
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 482
    .line 483
    .line 484
    :goto_3
    return-object v10

    .line 485
    :pswitch_7
    check-cast v0, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;

    .line 486
    .line 487
    move-object/from16 v1, p1

    .line 488
    .line 489
    check-cast v1, La/ht70;

    .line 490
    .line 491
    sget-object v2, Lorg/xplatform/feature/online_call/impl/service/OnlineCallService;->d:Ljava/lang/String;

    .line 492
    .line 493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    sget-object v2, La/ht70;->a:La/ht70;

    .line 497
    .line 498
    invoke-virtual {v1, v2}, La/ht70;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_8

    .line 503
    .line 504
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 505
    .line 506
    .line 507
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    goto :goto_4

    .line 510
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 511
    .line 512
    .line 513
    :goto_4
    return-object v10

    .line 514
    :pswitch_8
    check-cast v0, La/sp70;

    .line 515
    .line 516
    move-object/from16 v1, p1

    .line 517
    .line 518
    check-cast v1, La/k0w0;

    .line 519
    .line 520
    iget-object v2, v0, La/sp70;->H:La/oct;

    .line 521
    .line 522
    iget-object v3, v0, La/sp70;->I:La/y5s;

    .line 523
    .line 524
    iget-object v3, v3, La/y5s;->a:La/s470;

    .line 525
    .line 526
    invoke-virtual {v3}, La/s470;->a()J

    .line 527
    .line 528
    .line 529
    move-result-wide v3

    .line 530
    iget-object v0, v0, La/sp70;->g:La/ztt;

    .line 531
    .line 532
    invoke-virtual {v0}, La/ztt;->a()La/csr;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v2, v3, v4, v0, v10}, La/oct;->c(JLa/csr;Ljava/lang/String;)Lorg/xplatform/games_section/feature/bonuses/di/BonusesScreenFactoryImpl$getGameBonusesScreen$1;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 541
    .line 542
    .line 543
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    return-object v0

    .line 546
    :pswitch_9
    check-cast v0, La/to70;

    .line 547
    .line 548
    move-object/from16 v1, p1

    .line 549
    .line 550
    check-cast v1, Ljava/lang/Throwable;

    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    iget-object v0, v0, La/to70;->K:La/duj;

    .line 556
    .line 557
    new-instance v2, La/yr0;

    .line 558
    .line 559
    const/16 v3, 0x11

    .line 560
    .line 561
    invoke-direct {v2, v1, v3}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 565
    .line 566
    .line 567
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 568
    .line 569
    return-object v0

    .line 570
    :pswitch_a
    check-cast v0, La/sf70;

    .line 571
    .line 572
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, Landroid/view/View;

    .line 575
    .line 576
    sget-object v2, La/sf70;->M1:[La/iiy;

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, La/sf70;->H0()La/uf70;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-virtual {v1}, La/uf70;->x()V

    .line 586
    .line 587
    .line 588
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_b
    check-cast v0, La/oe70;

    .line 595
    .line 596
    move-object/from16 v1, p1

    .line 597
    .line 598
    check-cast v1, Landroid/os/Bundle;

    .line 599
    .line 600
    sget-object v2, La/oe70;->Q1:[La/iiy;

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    const-string v2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 606
    .line 607
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-eqz v3, :cond_9

    .line 612
    .line 613
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    instance-of v2, v1, La/ql5;

    .line 618
    .line 619
    if-eqz v2, :cond_9

    .line 620
    .line 621
    invoke-virtual {v0}, La/oe70;->H0()La/qf70;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    check-cast v1, La/ql5;

    .line 626
    .line 627
    invoke-virtual {v0, v1}, La/qf70;->x(La/ql5;)V

    .line 628
    .line 629
    .line 630
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object v0

    .line 633
    :pswitch_c
    check-cast v0, Landroid/webkit/WebView;

    .line 634
    .line 635
    move-object/from16 v1, p1

    .line 636
    .line 637
    check-cast v1, Landroid/content/Context;

    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    new-instance v2, Landroid/widget/FrameLayout;

    .line 643
    .line 644
    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 645
    .line 646
    .line 647
    if-eqz v0, :cond_a

    .line 648
    .line 649
    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->setOverScrollMode(I)V

    .line 650
    .line 651
    .line 652
    sget-wide v3, La/y3d;->f:J

    .line 653
    .line 654
    invoke-static {v3, v4}, La/fbc;->U(J)I

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 662
    .line 663
    .line 664
    :cond_a
    return-object v2

    .line 665
    :pswitch_d
    check-cast v0, Landroid/app/Activity;

    .line 666
    .line 667
    move-object/from16 v1, p1

    .line 668
    .line 669
    check-cast v1, La/lwk;

    .line 670
    .line 671
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    if-eqz v0, :cond_b

    .line 675
    .line 676
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    if-eqz v1, :cond_b

    .line 681
    .line 682
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    if-eqz v1, :cond_b

    .line 687
    .line 688
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 689
    .line 690
    goto :goto_5

    .line 691
    :cond_b
    const/16 v1, 0x20

    .line 692
    .line 693
    :goto_5
    if-eqz v0, :cond_c

    .line 694
    .line 695
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    if-eqz v2, :cond_c

    .line 700
    .line 701
    const/16 v3, 0x30

    .line 702
    .line 703
    invoke-virtual {v2, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 704
    .line 705
    .line 706
    :cond_c
    new-instance v2, La/oa70;

    .line 707
    .line 708
    invoke-direct {v2, v0, v1, v9}, La/oa70;-><init>(Ljava/lang/Object;IB)V

    .line 709
    .line 710
    .line 711
    return-object v2

    .line 712
    :pswitch_e
    move-object v12, v0

    .line 713
    check-cast v12, La/ca70;

    .line 714
    .line 715
    move-object/from16 v0, p1

    .line 716
    .line 717
    check-cast v0, La/wb70;

    .line 718
    .line 719
    sget-object v1, La/ca70;->U1:La/htz;

    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    instance-of v1, v0, La/ra70;

    .line 725
    .line 726
    const/4 v15, 0x0

    .line 727
    if-eqz v1, :cond_d

    .line 728
    .line 729
    move-object v11, v0

    .line 730
    check-cast v11, La/ra70;

    .line 731
    .line 732
    iget-object v0, v11, La/ra70;->b:La/mne;

    .line 733
    .line 734
    iget-object v1, v12, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 735
    .line 736
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    iget-object v5, v0, La/mne;->c:La/vs10;

    .line 741
    .line 742
    new-instance v6, La/wmq;

    .line 743
    .line 744
    const/16 v16, 0xc

    .line 745
    .line 746
    const/4 v13, 0x0

    .line 747
    move-object v10, v6

    .line 748
    move-object v14, v12

    .line 749
    move-object v12, v0

    .line 750
    invoke-direct/range {v10 .. v16}, La/wmq;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 751
    .line 752
    .line 753
    move-object v12, v14

    .line 754
    const/16 v7, 0xb

    .line 755
    .line 756
    const/4 v3, 0x0

    .line 757
    const/4 v4, 0x0

    .line 758
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 759
    .line 760
    .line 761
    goto/16 :goto_7

    .line 762
    .line 763
    :cond_d
    instance-of v1, v0, La/sa70;

    .line 764
    .line 765
    if-eqz v1, :cond_e

    .line 766
    .line 767
    new-instance v0, Landroid/content/Intent;

    .line 768
    .line 769
    const-string v1, "android.settings.SETTINGS"

    .line 770
    .line 771
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 775
    .line 776
    .line 777
    goto/16 :goto_7

    .line 778
    .line 779
    :cond_e
    instance-of v1, v0, La/db70;

    .line 780
    .line 781
    const-string v2, "snackbarManager"

    .line 782
    .line 783
    if-eqz v1, :cond_10

    .line 784
    .line 785
    iget-object v0, v12, La/ca70;->M1:La/z7z;

    .line 786
    .line 787
    if-eqz v0, :cond_f

    .line 788
    .line 789
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    move-object v10, v0

    .line 797
    check-cast v10, La/wdk0;

    .line 798
    .line 799
    new-instance v0, La/xdk0;

    .line 800
    .line 801
    sget-object v1, La/pek0;->a:La/pek0;

    .line 802
    .line 803
    const v2, 0x7f1306b3

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    sget-object v4, La/lwf;->Y:La/lwf;

    .line 814
    .line 815
    const/4 v6, 0x0

    .line 816
    const/16 v7, 0x74

    .line 817
    .line 818
    const/4 v3, 0x0

    .line 819
    const/4 v5, 0x0

    .line 820
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 821
    .line 822
    .line 823
    const/16 v16, 0x0

    .line 824
    .line 825
    const/16 v17, 0x3fc

    .line 826
    .line 827
    const/4 v13, 0x0

    .line 828
    const/4 v14, 0x0

    .line 829
    const/4 v15, 0x0

    .line 830
    move-object v11, v0

    .line 831
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 832
    .line 833
    .line 834
    goto/16 :goto_7

    .line 835
    .line 836
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    throw v15

    .line 840
    :cond_10
    instance-of v1, v0, La/qa70;

    .line 841
    .line 842
    const-string v4, "OneXGamesWebGameDisableDemoBottomDialog.TAG"

    .line 843
    .line 844
    if-eqz v1, :cond_12

    .line 845
    .line 846
    check-cast v0, La/qa70;

    .line 847
    .line 848
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    invoke-virtual {v1, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    instance-of v2, v1, La/h970;

    .line 857
    .line 858
    if-eqz v2, :cond_11

    .line 859
    .line 860
    move-object v15, v1

    .line 861
    check-cast v15, La/h970;

    .line 862
    .line 863
    :cond_11
    if-eqz v15, :cond_3b

    .line 864
    .line 865
    iget-boolean v0, v0, La/qa70;->a:Z

    .line 866
    .line 867
    iget-object v1, v15, La/h970;->n2:La/a8z;

    .line 868
    .line 869
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    check-cast v1, La/k3t0;

    .line 874
    .line 875
    new-instance v2, La/j970;

    .line 876
    .line 877
    invoke-direct {v2, v0}, La/j970;-><init>(Z)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    goto/16 :goto_7

    .line 884
    .line 885
    :cond_12
    instance-of v1, v0, La/ab70;

    .line 886
    .line 887
    const v5, 0x7f13032f

    .line 888
    .line 889
    .line 890
    const v7, 0x7f1304f9

    .line 891
    .line 892
    .line 893
    const v11, 0x7f130162

    .line 894
    .line 895
    .line 896
    if-eqz v1, :cond_13

    .line 897
    .line 898
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    check-cast v0, La/ii;

    .line 907
    .line 908
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 909
    .line 910
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v14

    .line 914
    const v1, 0x7f13094b

    .line 915
    .line 916
    .line 917
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v15

    .line 921
    invoke-virtual {v12, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v16

    .line 925
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v17

    .line 932
    sget-object v22, La/n12;->a:La/n12;

    .line 933
    .line 934
    const/16 v23, 0x0

    .line 935
    .line 936
    const/16 v24, 0x5d0

    .line 937
    .line 938
    const/16 v18, 0x0

    .line 939
    .line 940
    const-string v19, "DEMO_BONUS_DIALOG"

    .line 941
    .line 942
    const/16 v20, 0x0

    .line 943
    .line 944
    const/16 v21, 0x0

    .line 945
    .line 946
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_7

    .line 960
    .line 961
    :cond_13
    instance-of v1, v0, La/bb70;

    .line 962
    .line 963
    if-eqz v1, :cond_18

    .line 964
    .line 965
    check-cast v0, La/bb70;

    .line 966
    .line 967
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    invoke-virtual {v1, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    instance-of v2, v1, La/sik;

    .line 976
    .line 977
    if-eqz v2, :cond_14

    .line 978
    .line 979
    move-object v15, v1

    .line 980
    check-cast v15, La/sik;

    .line 981
    .line 982
    :cond_14
    if-eqz v15, :cond_15

    .line 983
    .line 984
    iget-boolean v1, v15, Landroidx/fragment/app/Fragment;->m:Z

    .line 985
    .line 986
    if-nez v1, :cond_15

    .line 987
    .line 988
    goto/16 :goto_7

    .line 989
    .line 990
    :cond_15
    if-eqz v15, :cond_16

    .line 991
    .line 992
    invoke-virtual {v15}, La/sik;->y0()V

    .line 993
    .line 994
    .line 995
    :cond_16
    sget-object v1, La/h970;->o2:La/atz;

    .line 996
    .line 997
    iget-object v2, v0, La/bb70;->a:Ljava/lang/String;

    .line 998
    .line 999
    iget-object v3, v0, La/bb70;->b:Ljava/lang/String;

    .line 1000
    .line 1001
    iget-boolean v0, v0, La/bb70;->c:Z

    .line 1002
    .line 1003
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    new-instance v1, La/h970;

    .line 1007
    .line 1008
    invoke-direct {v1}, La/h970;-><init>()V

    .line 1009
    .line 1010
    .line 1011
    sget-object v5, La/h970;->p2:[La/iiy;

    .line 1012
    .line 1013
    aget-object v5, v5, v8

    .line 1014
    .line 1015
    iget-object v6, v1, La/h970;->k2:La/phf0;

    .line 1016
    .line 1017
    const-string v7, "DEMO_DISABLE_DIALOG"

    .line 1018
    .line 1019
    invoke-virtual {v6, v1, v5, v7}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v5, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 1023
    .line 1024
    if-nez v5, :cond_17

    .line 1025
    .line 1026
    new-instance v5, Landroid/os/Bundle;

    .line 1027
    .line 1028
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    :cond_17
    const-string v6, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_BALANCE"

    .line 1032
    .line 1033
    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    const-string v2, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_TOTAL_SUM"

    .line 1037
    .line 1038
    invoke-virtual {v5, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    const-string v2, "OneXGamesWebGame.DISABLE_DEMO_DIALOG_BUNDLE_EXIT_ENABLE"

    .line 1042
    .line 1043
    invoke-virtual {v5, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v1, v5}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    invoke-static {v1, v0, v4}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    goto/16 :goto_7

    .line 1060
    .line 1061
    :cond_18
    instance-of v1, v0, La/cb70;

    .line 1062
    .line 1063
    const-string v13, "OneXGamesWebGameUnauthorizedDemoBottomDialog.TAG"

    .line 1064
    .line 1065
    if-eqz v1, :cond_1a

    .line 1066
    .line 1067
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-virtual {v0, v13}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    if-eqz v0, :cond_19

    .line 1076
    .line 1077
    goto/16 :goto_7

    .line 1078
    .line 1079
    :cond_19
    sget-object v0, La/lc70;->n2:La/uuz;

    .line 1080
    .line 1081
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    const-string v0, "DEMO_UNAUTHORIZED_DIALOG"

    .line 1085
    .line 1086
    invoke-static {v0, v9}, La/uuz;->i(Ljava/lang/String;Z)La/lc70;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1095
    .line 1096
    .line 1097
    invoke-static {v0, v1, v13}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    goto/16 :goto_7

    .line 1101
    .line 1102
    :cond_1a
    instance-of v1, v0, La/pa70;

    .line 1103
    .line 1104
    if-eqz v1, :cond_1c

    .line 1105
    .line 1106
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    invoke-virtual {v0, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    instance-of v1, v0, La/sik;

    .line 1115
    .line 1116
    if-eqz v1, :cond_1b

    .line 1117
    .line 1118
    move-object v15, v0

    .line 1119
    check-cast v15, La/sik;

    .line 1120
    .line 1121
    :cond_1b
    if-eqz v15, :cond_3b

    .line 1122
    .line 1123
    invoke-virtual {v15}, La/sik;->y0()V

    .line 1124
    .line 1125
    .line 1126
    goto/16 :goto_7

    .line 1127
    .line 1128
    :cond_1c
    instance-of v1, v0, La/eb70;

    .line 1129
    .line 1130
    if-eqz v1, :cond_1d

    .line 1131
    .line 1132
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    check-cast v0, La/ii;

    .line 1141
    .line 1142
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1143
    .line 1144
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v14

    .line 1148
    const v1, 0x7f1306af

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v15

    .line 1155
    invoke-virtual {v12, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v16

    .line 1159
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v17

    .line 1166
    sget-object v22, La/n12;->b:La/n12;

    .line 1167
    .line 1168
    const/16 v23, 0x0

    .line 1169
    .line 1170
    const/16 v24, 0x5d0

    .line 1171
    .line 1172
    const/16 v18, 0x0

    .line 1173
    .line 1174
    const-string v19, "DEMO_REPLENISH_DIALOG"

    .line 1175
    .line 1176
    const/16 v20, 0x0

    .line 1177
    .line 1178
    const/16 v21, 0x0

    .line 1179
    .line 1180
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v1

    .line 1187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1191
    .line 1192
    .line 1193
    goto/16 :goto_7

    .line 1194
    .line 1195
    :cond_1d
    instance-of v1, v0, La/fb70;

    .line 1196
    .line 1197
    if-eqz v1, :cond_20

    .line 1198
    .line 1199
    check-cast v0, La/fb70;

    .line 1200
    .line 1201
    iget-boolean v0, v0, La/fb70;->a:Z

    .line 1202
    .line 1203
    if-eqz v0, :cond_1e

    .line 1204
    .line 1205
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    check-cast v0, La/ii;

    .line 1214
    .line 1215
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1216
    .line 1217
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v14

    .line 1221
    const v1, 0x7f1306ab

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v15

    .line 1228
    const v1, 0x7f1306ac

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v16

    .line 1235
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1236
    .line 1237
    .line 1238
    sget-object v22, La/n12;->b:La/n12;

    .line 1239
    .line 1240
    const/16 v23, 0x0

    .line 1241
    .line 1242
    const/16 v24, 0x5d8

    .line 1243
    .line 1244
    const/16 v17, 0x0

    .line 1245
    .line 1246
    const/16 v18, 0x0

    .line 1247
    .line 1248
    const-string v19, "DEMO_UNAVAILABLE_DIALOG"

    .line 1249
    .line 1250
    const/16 v20, 0x0

    .line 1251
    .line 1252
    const/16 v21, 0x0

    .line 1253
    .line 1254
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1265
    .line 1266
    .line 1267
    goto/16 :goto_7

    .line 1268
    .line 1269
    :cond_1e
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v0

    .line 1273
    invoke-virtual {v0, v13}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    if-eqz v0, :cond_1f

    .line 1278
    .line 1279
    goto/16 :goto_7

    .line 1280
    .line 1281
    :cond_1f
    sget-object v0, La/lc70;->n2:La/uuz;

    .line 1282
    .line 1283
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    const-string v0, "DEMO_UNAVAILABLE_DIALOG"

    .line 1287
    .line 1288
    invoke-static {v0, v8}, La/uuz;->i(Ljava/lang/String;Z)La/lc70;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    invoke-static {v0, v1, v13}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    goto/16 :goto_7

    .line 1303
    .line 1304
    :cond_20
    instance-of v1, v0, La/za70;

    .line 1305
    .line 1306
    const v4, 0x7f130e5d

    .line 1307
    .line 1308
    .line 1309
    if-eqz v1, :cond_21

    .line 1310
    .line 1311
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    check-cast v0, La/ii;

    .line 1320
    .line 1321
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1322
    .line 1323
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v14

    .line 1327
    const v1, 0x7f1302c6

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v15

    .line 1334
    invoke-virtual {v12, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v16

    .line 1338
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1339
    .line 1340
    .line 1341
    sget-object v22, La/n12;->b:La/n12;

    .line 1342
    .line 1343
    const/16 v23, 0x0

    .line 1344
    .line 1345
    const/16 v24, 0x5d8

    .line 1346
    .line 1347
    const/16 v17, 0x0

    .line 1348
    .line 1349
    const/16 v18, 0x0

    .line 1350
    .line 1351
    const-string v19, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG"

    .line 1352
    .line 1353
    const/16 v20, 0x0

    .line 1354
    .line 1355
    const/16 v21, 0x0

    .line 1356
    .line 1357
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1368
    .line 1369
    .line 1370
    goto/16 :goto_7

    .line 1371
    .line 1372
    :cond_21
    instance-of v1, v0, La/ya70;

    .line 1373
    .line 1374
    if-eqz v1, :cond_22

    .line 1375
    .line 1376
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    check-cast v0, La/ii;

    .line 1385
    .line 1386
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1387
    .line 1388
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v14

    .line 1392
    const v1, 0x7f1302c4

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v15

    .line 1399
    invoke-virtual {v12, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v16

    .line 1403
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1404
    .line 1405
    .line 1406
    sget-object v22, La/n12;->b:La/n12;

    .line 1407
    .line 1408
    const/16 v23, 0x0

    .line 1409
    .line 1410
    const/16 v24, 0x5d8

    .line 1411
    .line 1412
    const/16 v17, 0x0

    .line 1413
    .line 1414
    const/16 v18, 0x0

    .line 1415
    .line 1416
    const-string v19, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG"

    .line 1417
    .line 1418
    const/16 v20, 0x0

    .line 1419
    .line 1420
    const/16 v21, 0x0

    .line 1421
    .line 1422
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1433
    .line 1434
    .line 1435
    goto/16 :goto_7

    .line 1436
    .line 1437
    :cond_22
    instance-of v1, v0, La/xa70;

    .line 1438
    .line 1439
    if-eqz v1, :cond_23

    .line 1440
    .line 1441
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    check-cast v0, La/ii;

    .line 1450
    .line 1451
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1452
    .line 1453
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v14

    .line 1457
    const v1, 0x7f130ea9

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v15

    .line 1464
    invoke-virtual {v12, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v16

    .line 1468
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1469
    .line 1470
    .line 1471
    sget-object v22, La/n12;->b:La/n12;

    .line 1472
    .line 1473
    const/16 v23, 0x0

    .line 1474
    .line 1475
    const/16 v24, 0x5d8

    .line 1476
    .line 1477
    const/16 v17, 0x0

    .line 1478
    .line 1479
    const/16 v18, 0x0

    .line 1480
    .line 1481
    const-string v19, "CHANGE_ACCOUNT_TO_PRIMARY_DIALOG"

    .line 1482
    .line 1483
    const/16 v20, 0x0

    .line 1484
    .line 1485
    const/16 v21, 0x0

    .line 1486
    .line 1487
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v1

    .line 1494
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1498
    .line 1499
    .line 1500
    goto/16 :goto_7

    .line 1501
    .line 1502
    :cond_23
    instance-of v1, v0, La/gb70;

    .line 1503
    .line 1504
    if-eqz v1, :cond_24

    .line 1505
    .line 1506
    invoke-virtual {v12, v8}, La/ca70;->I0(Z)V

    .line 1507
    .line 1508
    .line 1509
    goto/16 :goto_7

    .line 1510
    .line 1511
    :cond_24
    instance-of v1, v0, La/jb70;

    .line 1512
    .line 1513
    if-eqz v1, :cond_25

    .line 1514
    .line 1515
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v0

    .line 1523
    check-cast v0, La/ii;

    .line 1524
    .line 1525
    sget v1, La/xgs;->f2:I

    .line 1526
    .line 1527
    const v1, 0x7f1316f5

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v14

    .line 1534
    const v1, 0x7f130926

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v15

    .line 1541
    const v1, 0x7f130927

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v16

    .line 1548
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1549
    .line 1550
    .line 1551
    const v1, 0x7f130928

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v17

    .line 1558
    const v1, 0x7f130929

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v20

    .line 1565
    sget-object v22, La/n12;->a:La/n12;

    .line 1566
    .line 1567
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1568
    .line 1569
    const/16 v23, 0x0

    .line 1570
    .line 1571
    const/16 v24, 0x590

    .line 1572
    .line 1573
    const/16 v18, 0x0

    .line 1574
    .line 1575
    const-string v19, "UNFINISHED_GAME_DIALOG"

    .line 1576
    .line 1577
    const/16 v21, 0x0

    .line 1578
    .line 1579
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1580
    .line 1581
    .line 1582
    new-instance v1, La/xgs;

    .line 1583
    .line 1584
    invoke-direct {v1}, La/xgs;-><init>()V

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual {v1, v13}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v2

    .line 1594
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 1598
    .line 1599
    .line 1600
    goto/16 :goto_7

    .line 1601
    .line 1602
    :cond_25
    instance-of v1, v0, La/va70;

    .line 1603
    .line 1604
    if-eqz v1, :cond_27

    .line 1605
    .line 1606
    check-cast v0, La/va70;

    .line 1607
    .line 1608
    iget-object v1, v12, La/ca70;->N1:La/z7z;

    .line 1609
    .line 1610
    if-eqz v1, :cond_26

    .line 1611
    .line 1612
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v1

    .line 1616
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1617
    .line 1618
    .line 1619
    move-object v2, v1

    .line 1620
    check-cast v2, La/ynb;

    .line 1621
    .line 1622
    iget-object v3, v0, La/va70;->a:La/bm5;

    .line 1623
    .line 1624
    iget-boolean v6, v0, La/va70;->b:Z

    .line 1625
    .line 1626
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v5

    .line 1630
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1631
    .line 1632
    .line 1633
    const-string v7, "BALANCE_SELECTOR"

    .line 1634
    .line 1635
    const/16 v8, 0xce

    .line 1636
    .line 1637
    const/4 v4, 0x0

    .line 1638
    invoke-static/range {v2 .. v8}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1639
    .line 1640
    .line 1641
    goto/16 :goto_7

    .line 1642
    .line 1643
    :cond_26
    const-string v0, "changeBalanceDialogProvider"

    .line 1644
    .line 1645
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1646
    .line 1647
    .line 1648
    throw v15

    .line 1649
    :cond_27
    instance-of v1, v0, La/ua70;

    .line 1650
    .line 1651
    if-eqz v1, :cond_2b

    .line 1652
    .line 1653
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v0

    .line 1657
    if-eqz v0, :cond_28

    .line 1658
    .line 1659
    invoke-static {v0}, La/sj3;->J(Landroid/content/Context;)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v0

    .line 1663
    goto :goto_6

    .line 1664
    :cond_28
    move v0, v9

    .line 1665
    :goto_6
    if-eqz v0, :cond_29

    .line 1666
    .line 1667
    invoke-virtual {v12}, La/ca70;->H0()La/k3t0;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v0

    .line 1671
    sget-object v1, La/b770;->a:La/b770;

    .line 1672
    .line 1673
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1674
    .line 1675
    .line 1676
    :cond_29
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    if-eqz v0, :cond_2a

    .line 1681
    .line 1682
    invoke-static {v0}, La/sj3;->J(Landroid/content/Context;)Z

    .line 1683
    .line 1684
    .line 1685
    move-result v9

    .line 1686
    :cond_2a
    new-instance v0, La/w970;

    .line 1687
    .line 1688
    invoke-direct {v0, v12, v6}, La/w970;-><init>(La/ca70;B)V

    .line 1689
    .line 1690
    .line 1691
    new-instance v1, La/w970;

    .line 1692
    .line 1693
    const/16 v2, 0xb

    .line 1694
    .line 1695
    invoke-direct {v1, v12, v2}, La/w970;-><init>(La/ca70;B)V

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v2

    .line 1702
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v2

    .line 1706
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1707
    .line 1708
    .line 1709
    check-cast v2, La/ii;

    .line 1710
    .line 1711
    invoke-static {v12, v9, v0, v1, v2}, La/kpb;->w0(Landroidx/fragment/app/Fragment;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ii;)V

    .line 1712
    .line 1713
    .line 1714
    goto/16 :goto_7

    .line 1715
    .line 1716
    :cond_2b
    instance-of v1, v0, La/hb70;

    .line 1717
    .line 1718
    const v5, 0x7f130e5c

    .line 1719
    .line 1720
    .line 1721
    if-eqz v1, :cond_2c

    .line 1722
    .line 1723
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v0

    .line 1727
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v0

    .line 1731
    check-cast v0, La/ii;

    .line 1732
    .line 1733
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1734
    .line 1735
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v14

    .line 1739
    const v1, 0x7f13123b

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v15

    .line 1746
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v16

    .line 1750
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1751
    .line 1752
    .line 1753
    sget-object v22, La/n12;->b:La/n12;

    .line 1754
    .line 1755
    const/16 v23, 0x0

    .line 1756
    .line 1757
    const/16 v24, 0x5d8

    .line 1758
    .line 1759
    const/16 v17, 0x0

    .line 1760
    .line 1761
    const/16 v18, 0x0

    .line 1762
    .line 1763
    const-string v19, "SECTION_BALANCE_EXPIRED_DIALOG"

    .line 1764
    .line 1765
    const/16 v20, 0x0

    .line 1766
    .line 1767
    const/16 v21, 0x0

    .line 1768
    .line 1769
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v1

    .line 1776
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1780
    .line 1781
    .line 1782
    goto/16 :goto_7

    .line 1783
    .line 1784
    :cond_2c
    instance-of v1, v0, La/wa70;

    .line 1785
    .line 1786
    if-eqz v1, :cond_2d

    .line 1787
    .line 1788
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v0

    .line 1792
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    check-cast v0, La/ii;

    .line 1797
    .line 1798
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1799
    .line 1800
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v14

    .line 1804
    const v1, 0x7f13092f

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v15

    .line 1811
    invoke-virtual {v12, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v16

    .line 1815
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1816
    .line 1817
    .line 1818
    sget-object v22, La/n12;->b:La/n12;

    .line 1819
    .line 1820
    const/16 v23, 0x0

    .line 1821
    .line 1822
    const/16 v24, 0x5d8

    .line 1823
    .line 1824
    const/16 v17, 0x0

    .line 1825
    .line 1826
    const/16 v18, 0x0

    .line 1827
    .line 1828
    const-string v19, "BONUS_BALANCE_UNAVAILABLE_DIALOG"

    .line 1829
    .line 1830
    const/16 v20, 0x0

    .line 1831
    .line 1832
    const/16 v21, 0x0

    .line 1833
    .line 1834
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1835
    .line 1836
    .line 1837
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v1

    .line 1841
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1845
    .line 1846
    .line 1847
    goto/16 :goto_7

    .line 1848
    .line 1849
    :cond_2d
    instance-of v1, v0, La/ib70;

    .line 1850
    .line 1851
    if-eqz v1, :cond_2e

    .line 1852
    .line 1853
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v0

    .line 1857
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v0

    .line 1861
    check-cast v0, La/ii;

    .line 1862
    .line 1863
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1864
    .line 1865
    invoke-virtual {v12, v11}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v14

    .line 1869
    const v1, 0x7f1316f0

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v15

    .line 1876
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v16

    .line 1880
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1881
    .line 1882
    .line 1883
    sget-object v22, La/n12;->b:La/n12;

    .line 1884
    .line 1885
    const/16 v23, 0x0

    .line 1886
    .line 1887
    const/16 v24, 0x5d8

    .line 1888
    .line 1889
    const/16 v17, 0x0

    .line 1890
    .line 1891
    const/16 v18, 0x0

    .line 1892
    .line 1893
    const-string v19, "SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG"

    .line 1894
    .line 1895
    const/16 v20, 0x0

    .line 1896
    .line 1897
    const/16 v21, 0x0

    .line 1898
    .line 1899
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v1

    .line 1906
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1907
    .line 1908
    .line 1909
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1910
    .line 1911
    .line 1912
    goto/16 :goto_7

    .line 1913
    .line 1914
    :cond_2e
    instance-of v1, v0, La/kb70;

    .line 1915
    .line 1916
    if-eqz v1, :cond_30

    .line 1917
    .line 1918
    iget-object v0, v12, La/ca70;->M1:La/z7z;

    .line 1919
    .line 1920
    if-eqz v0, :cond_2f

    .line 1921
    .line 1922
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v0

    .line 1926
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1927
    .line 1928
    .line 1929
    move-object v10, v0

    .line 1930
    check-cast v10, La/wdk0;

    .line 1931
    .line 1932
    new-instance v0, La/xdk0;

    .line 1933
    .line 1934
    sget-object v1, La/rek0;->b:La/rek0;

    .line 1935
    .line 1936
    const-string v2, "WebView"

    .line 1937
    .line 1938
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v2

    .line 1942
    const v3, 0x7f1307c8

    .line 1943
    .line 1944
    .line 1945
    invoke-virtual {v12, v3, v2}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v2

    .line 1949
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1950
    .line 1951
    .line 1952
    const/4 v6, 0x0

    .line 1953
    const/16 v7, 0x7c

    .line 1954
    .line 1955
    const/4 v3, 0x0

    .line 1956
    const/4 v4, 0x0

    .line 1957
    const/4 v5, 0x0

    .line 1958
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1959
    .line 1960
    .line 1961
    const/16 v16, 0x0

    .line 1962
    .line 1963
    const/16 v17, 0x3fc

    .line 1964
    .line 1965
    const/4 v13, 0x0

    .line 1966
    const/4 v14, 0x0

    .line 1967
    const/4 v15, 0x0

    .line 1968
    move-object v11, v0

    .line 1969
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1970
    .line 1971
    .line 1972
    goto/16 :goto_7

    .line 1973
    .line 1974
    :cond_2f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1975
    .line 1976
    .line 1977
    throw v15

    .line 1978
    :cond_30
    instance-of v1, v0, La/ta70;

    .line 1979
    .line 1980
    if-eqz v1, :cond_31

    .line 1981
    .line 1982
    check-cast v0, La/ta70;

    .line 1983
    .line 1984
    iget-object v0, v0, La/ta70;->a:La/csr;

    .line 1985
    .line 1986
    new-instance v1, Landroid/os/Bundle;

    .line 1987
    .line 1988
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1989
    .line 1990
    .line 1991
    const-string v2, "OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY"

    .line 1992
    .line 1993
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 1994
    .line 1995
    .line 1996
    const-string v0, "OneXGames.BONUS_NOT_USED_RESULT_KEY"

    .line 1997
    .line 1998
    invoke-static {v1, v12, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1999
    .line 2000
    .line 2001
    goto/16 :goto_7

    .line 2002
    .line 2003
    :cond_31
    instance-of v1, v0, La/vb70;

    .line 2004
    .line 2005
    if-eqz v1, :cond_37

    .line 2006
    .line 2007
    check-cast v0, La/vb70;

    .line 2008
    .line 2009
    instance-of v1, v0, La/qb70;

    .line 2010
    .line 2011
    if-eqz v1, :cond_32

    .line 2012
    .line 2013
    check-cast v0, La/qb70;

    .line 2014
    .line 2015
    iget-object v0, v0, La/qb70;->a:La/c5v0;

    .line 2016
    .line 2017
    if-eqz v0, :cond_3b

    .line 2018
    .line 2019
    iget-object v0, v0, La/c5v0;->d:Landroid/webkit/WebView;

    .line 2020
    .line 2021
    if-eqz v0, :cond_3b

    .line 2022
    .line 2023
    invoke-virtual {v0, v9}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 2024
    .line 2025
    .line 2026
    goto/16 :goto_7

    .line 2027
    .line 2028
    :cond_32
    instance-of v1, v0, La/rb70;

    .line 2029
    .line 2030
    if-eqz v1, :cond_33

    .line 2031
    .line 2032
    check-cast v0, La/rb70;

    .line 2033
    .line 2034
    iget-object v0, v0, La/rb70;->a:La/c5v0;

    .line 2035
    .line 2036
    if-eqz v0, :cond_3b

    .line 2037
    .line 2038
    iget-object v0, v0, La/c5v0;->d:Landroid/webkit/WebView;

    .line 2039
    .line 2040
    if-eqz v0, :cond_3b

    .line 2041
    .line 2042
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 2043
    .line 2044
    .line 2045
    goto/16 :goto_7

    .line 2046
    .line 2047
    :cond_33
    instance-of v1, v0, La/sb70;

    .line 2048
    .line 2049
    if-eqz v1, :cond_34

    .line 2050
    .line 2051
    check-cast v0, La/sb70;

    .line 2052
    .line 2053
    iget-object v1, v0, La/sb70;->b:Ljava/lang/String;

    .line 2054
    .line 2055
    const-string v2, "OneXGamesWebGame js:"

    .line 2056
    .line 2057
    invoke-static {v1}, La/ntm0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v3

    .line 2061
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2062
    .line 2063
    .line 2064
    iget-object v0, v0, La/sb70;->a:La/c5v0;

    .line 2065
    .line 2066
    if-eqz v0, :cond_3b

    .line 2067
    .line 2068
    iget-object v0, v0, La/c5v0;->d:Landroid/webkit/WebView;

    .line 2069
    .line 2070
    if-eqz v0, :cond_3b

    .line 2071
    .line 2072
    invoke-virtual {v0, v1, v15}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 2073
    .line 2074
    .line 2075
    goto/16 :goto_7

    .line 2076
    .line 2077
    :cond_34
    instance-of v1, v0, La/tb70;

    .line 2078
    .line 2079
    if-eqz v1, :cond_35

    .line 2080
    .line 2081
    check-cast v0, La/tb70;

    .line 2082
    .line 2083
    iget-object v1, v0, La/tb70;->a:La/c5v0;

    .line 2084
    .line 2085
    if-eqz v1, :cond_3b

    .line 2086
    .line 2087
    iget-object v1, v1, La/c5v0;->d:Landroid/webkit/WebView;

    .line 2088
    .line 2089
    if-eqz v1, :cond_3b

    .line 2090
    .line 2091
    iget-object v2, v0, La/tb70;->b:Ljava/lang/String;

    .line 2092
    .line 2093
    iget-object v0, v0, La/tb70;->c:Ljava/util/Map;

    .line 2094
    .line 2095
    invoke-virtual {v1, v2, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 2096
    .line 2097
    .line 2098
    goto/16 :goto_7

    .line 2099
    .line 2100
    :cond_35
    instance-of v1, v0, La/ub70;

    .line 2101
    .line 2102
    if-eqz v1, :cond_36

    .line 2103
    .line 2104
    check-cast v0, La/ub70;

    .line 2105
    .line 2106
    iget-object v0, v0, La/ub70;->a:La/c5v0;

    .line 2107
    .line 2108
    if-eqz v0, :cond_3b

    .line 2109
    .line 2110
    iget-object v0, v0, La/c5v0;->d:Landroid/webkit/WebView;

    .line 2111
    .line 2112
    if-eqz v0, :cond_3b

    .line 2113
    .line 2114
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 2115
    .line 2116
    .line 2117
    const-string v1, "about:blank"

    .line 2118
    .line 2119
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 2120
    .line 2121
    .line 2122
    goto/16 :goto_7

    .line 2123
    .line 2124
    :cond_36
    invoke-static {}, La/t9f;->b()V

    .line 2125
    .line 2126
    .line 2127
    goto/16 :goto_8

    .line 2128
    .line 2129
    :cond_37
    instance-of v1, v0, La/pb70;

    .line 2130
    .line 2131
    if-eqz v1, :cond_3d

    .line 2132
    .line 2133
    check-cast v0, La/pb70;

    .line 2134
    .line 2135
    instance-of v1, v0, La/ob70;

    .line 2136
    .line 2137
    if-eqz v1, :cond_38

    .line 2138
    .line 2139
    invoke-virtual {v12}, La/ca70;->G0()La/z7z;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v0

    .line 2143
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v0

    .line 2147
    check-cast v0, La/ii;

    .line 2148
    .line 2149
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2150
    .line 2151
    const v1, 0x7f1314d4

    .line 2152
    .line 2153
    .line 2154
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v14

    .line 2158
    const v1, 0x7f13093b

    .line 2159
    .line 2160
    .line 2161
    invoke-virtual {v12, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v15

    .line 2165
    invoke-virtual {v12, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v16

    .line 2169
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2170
    .line 2171
    .line 2172
    sget-object v22, La/n12;->b:La/n12;

    .line 2173
    .line 2174
    const/16 v23, 0x0

    .line 2175
    .line 2176
    const/16 v24, 0x5d8

    .line 2177
    .line 2178
    const/16 v17, 0x0

    .line 2179
    .line 2180
    const/16 v18, 0x0

    .line 2181
    .line 2182
    const-string v19, "TECHNICAL_WORKS_DIALOG_REQUEST_KEY"

    .line 2183
    .line 2184
    const/16 v20, 0x0

    .line 2185
    .line 2186
    const/16 v21, 0x0

    .line 2187
    .line 2188
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2189
    .line 2190
    .line 2191
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v1

    .line 2195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2199
    .line 2200
    .line 2201
    goto :goto_7

    .line 2202
    :cond_38
    instance-of v1, v0, La/mb70;

    .line 2203
    .line 2204
    const-string v2, ""

    .line 2205
    .line 2206
    if-eqz v1, :cond_39

    .line 2207
    .line 2208
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v1

    .line 2212
    check-cast v0, La/mb70;

    .line 2213
    .line 2214
    iget-wide v3, v0, La/mb70;->a:J

    .line 2215
    .line 2216
    invoke-static {v1, v3, v4, v2}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 2217
    .line 2218
    .line 2219
    goto :goto_7

    .line 2220
    :cond_39
    instance-of v1, v0, La/lb70;

    .line 2221
    .line 2222
    if-eqz v1, :cond_3a

    .line 2223
    .line 2224
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    sget-object v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;

    .line 2229
    .line 2230
    invoke-static {v0, v1, v2}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 2231
    .line 2232
    .line 2233
    goto :goto_7

    .line 2234
    :cond_3a
    instance-of v0, v0, La/nb70;

    .line 2235
    .line 2236
    if-eqz v0, :cond_3c

    .line 2237
    .line 2238
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v0

    .line 2242
    invoke-static {v0, v3, v2}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 2243
    .line 2244
    .line 2245
    :cond_3b
    :goto_7
    invoke-virtual {v12}, La/ca70;->H0()La/k3t0;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v0

    .line 2249
    sget-object v1, La/n670;->a:La/n670;

    .line 2250
    .line 2251
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2252
    .line 2253
    .line 2254
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2255
    .line 2256
    goto :goto_8

    .line 2257
    :cond_3c
    invoke-static {}, La/t9f;->b()V

    .line 2258
    .line 2259
    .line 2260
    goto :goto_8

    .line 2261
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 2262
    .line 2263
    .line 2264
    :goto_8
    return-object v10

    .line 2265
    :pswitch_f
    check-cast v0, La/y370;

    .line 2266
    .line 2267
    move-object/from16 v1, p1

    .line 2268
    .line 2269
    check-cast v1, La/k0w0;

    .line 2270
    .line 2271
    sget-object v3, La/y370;->Y1:La/wsz;

    .line 2272
    .line 2273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2274
    .line 2275
    .line 2276
    sget-object v3, La/y370;->Z1:[La/iiy;

    .line 2277
    .line 2278
    iget-object v4, v0, La/y370;->V1:La/a8z;

    .line 2279
    .line 2280
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v4

    .line 2284
    check-cast v4, La/r270;

    .line 2285
    .line 2286
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 2287
    .line 2288
    .line 2289
    move-result v4

    .line 2290
    if-eqz v4, :cond_44

    .line 2291
    .line 2292
    const-string v6, "appScreensProvider"

    .line 2293
    .line 2294
    if-eq v4, v9, :cond_42

    .line 2295
    .line 2296
    if-eq v4, v5, :cond_3f

    .line 2297
    .line 2298
    if-ne v4, v7, :cond_3e

    .line 2299
    .line 2300
    new-instance v0, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesFavoritesScreen;

    .line 2301
    .line 2302
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2303
    .line 2304
    .line 2305
    goto :goto_a

    .line 2306
    :cond_3e
    invoke-static {}, La/t9f;->b()V

    .line 2307
    .line 2308
    .line 2309
    goto :goto_b

    .line 2310
    :cond_3f
    iget-object v0, v0, La/y370;->N1:La/uf3;

    .line 2311
    .line 2312
    if-eqz v0, :cond_41

    .line 2313
    .line 2314
    iget-object v0, v0, La/uf3;->a:La/oct;

    .line 2315
    .line 2316
    iget-object v0, v0, La/oct;->b:La/r9u;

    .line 2317
    .line 2318
    sget-object v2, La/ygp;->y1:La/ygp;

    .line 2319
    .line 2320
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2321
    .line 2322
    .line 2323
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 2324
    .line 2325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2326
    .line 2327
    .line 2328
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 2329
    .line 2330
    invoke-virtual {v0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 2331
    .line 2332
    .line 2333
    move-result v0

    .line 2334
    const-string v2, "OneXGamesTabContainerFragment.UM_RESULT_KEY"

    .line 2335
    .line 2336
    if-eqz v0, :cond_40

    .line 2337
    .line 2338
    new-instance v0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesCashbackFragmentScreen;

    .line 2339
    .line 2340
    invoke-direct {v0, v2}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesCashbackFragmentScreen;-><init>(Ljava/lang/String;)V

    .line 2341
    .line 2342
    .line 2343
    goto :goto_a

    .line 2344
    :cond_40
    new-instance v0, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesCashbackFragmentScreenOld;

    .line 2345
    .line 2346
    invoke-direct {v0, v2}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesCashbackFragmentScreenOld;-><init>(Ljava/lang/String;)V

    .line 2347
    .line 2348
    .line 2349
    goto :goto_a

    .line 2350
    :cond_41
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2351
    .line 2352
    .line 2353
    throw v10

    .line 2354
    :cond_42
    iget-object v4, v0, La/y370;->N1:La/uf3;

    .line 2355
    .line 2356
    if-eqz v4, :cond_43

    .line 2357
    .line 2358
    iget-object v4, v0, La/y370;->U1:La/zz2;

    .line 2359
    .line 2360
    aget-object v2, v3, v2

    .line 2361
    .line 2362
    invoke-virtual {v4, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v0

    .line 2366
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2367
    .line 2368
    .line 2369
    move-result v0

    .line 2370
    new-instance v2, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesPromoScreen;

    .line 2371
    .line 2372
    invoke-direct {v2, v0}, Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesPromoScreen;-><init>(I)V

    .line 2373
    .line 2374
    .line 2375
    :goto_9
    move-object v0, v2

    .line 2376
    goto :goto_a

    .line 2377
    :cond_43
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2378
    .line 2379
    .line 2380
    throw v10

    .line 2381
    :cond_44
    new-instance v2, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;

    .line 2382
    .line 2383
    iget-object v4, v0, La/y370;->S1:La/r34;

    .line 2384
    .line 2385
    aget-object v5, v3, v7

    .line 2386
    .line 2387
    invoke-virtual {v4, v0, v5}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 2388
    .line 2389
    .line 2390
    move-result-object v4

    .line 2391
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 2392
    .line 2393
    .line 2394
    move-result-wide v4

    .line 2395
    iget-object v6, v0, La/y370;->Q1:La/phf0;

    .line 2396
    .line 2397
    aget-object v3, v3, v9

    .line 2398
    .line 2399
    invoke-virtual {v6, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v0

    .line 2403
    invoke-direct {v2, v4, v5, v0}, Lorg/xplatform/games_list/features/common/OneXGamesScreens$OneXGamesAllGamesScreen;-><init>(JLjava/lang/String;)V

    .line 2404
    .line 2405
    .line 2406
    goto :goto_9

    .line 2407
    :goto_a
    new-instance v2, La/y0w0;

    .line 2408
    .line 2409
    invoke-direct {v2, v0}, La/y0w0;-><init>(La/m7h0;)V

    .line 2410
    .line 2411
    .line 2412
    invoke-virtual {v1, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 2413
    .line 2414
    .line 2415
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2416
    .line 2417
    :goto_b
    return-object v10

    .line 2418
    :pswitch_10
    check-cast v0, La/p170;

    .line 2419
    .line 2420
    move-object/from16 v1, p1

    .line 2421
    .line 2422
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 2423
    .line 2424
    sget-object v2, La/p170;->Q1:La/xuz;

    .line 2425
    .line 2426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2427
    .line 2428
    .line 2429
    iget-object v2, v0, La/p170;->P1:La/phf0;

    .line 2430
    .line 2431
    sget-object v4, La/p170;->R1:[La/iiy;

    .line 2432
    .line 2433
    aget-object v5, v4, v9

    .line 2434
    .line 2435
    invoke-virtual {v2, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v5

    .line 2439
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 2440
    .line 2441
    .line 2442
    move-result v5

    .line 2443
    if-lez v5, :cond_45

    .line 2444
    .line 2445
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v5

    .line 2449
    aget-object v4, v4, v9

    .line 2450
    .line 2451
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v2

    .line 2455
    invoke-static {v5, v1, v2}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 2456
    .line 2457
    .line 2458
    :cond_45
    instance-of v2, v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 2459
    .line 2460
    if-eqz v2, :cond_46

    .line 2461
    .line 2462
    invoke-virtual {v0}, La/p170;->G0()La/k3t0;

    .line 2463
    .line 2464
    .line 2465
    move-result-object v0

    .line 2466
    new-instance v2, La/t070;

    .line 2467
    .line 2468
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 2469
    .line 2470
    iget-wide v3, v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;->a:J

    .line 2471
    .line 2472
    invoke-direct {v2, v3, v4}, La/t070;-><init>(J)V

    .line 2473
    .line 2474
    .line 2475
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2476
    .line 2477
    .line 2478
    goto :goto_c

    .line 2479
    :cond_46
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2480
    .line 2481
    .line 2482
    move-result v1

    .line 2483
    if-eqz v1, :cond_47

    .line 2484
    .line 2485
    invoke-virtual {v0}, La/p170;->G0()La/k3t0;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v0

    .line 2489
    sget-object v1, La/u070;->a:La/u070;

    .line 2490
    .line 2491
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2492
    .line 2493
    .line 2494
    :cond_47
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2495
    .line 2496
    return-object v0

    .line 2497
    :pswitch_11
    check-cast v0, La/uw50;

    .line 2498
    .line 2499
    move-object/from16 v1, p1

    .line 2500
    .line 2501
    check-cast v1, Ljava/lang/Throwable;

    .line 2502
    .line 2503
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2504
    .line 2505
    .line 2506
    iget-object v0, v0, La/uw50;->b:La/duj;

    .line 2507
    .line 2508
    new-instance v2, La/cr60;

    .line 2509
    .line 2510
    const/16 v3, 0xd

    .line 2511
    .line 2512
    invoke-direct {v2, v3}, La/cr60;-><init>(B)V

    .line 2513
    .line 2514
    .line 2515
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2516
    .line 2517
    .line 2518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2519
    .line 2520
    return-object v0

    .line 2521
    :pswitch_12
    check-cast v0, La/vy60;

    .line 2522
    .line 2523
    move-object/from16 v1, p1

    .line 2524
    .line 2525
    check-cast v1, Ljava/lang/Throwable;

    .line 2526
    .line 2527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2528
    .line 2529
    .line 2530
    iget-object v0, v0, La/vy60;->u:La/duj;

    .line 2531
    .line 2532
    new-instance v2, La/cr60;

    .line 2533
    .line 2534
    const/16 v3, 0xc

    .line 2535
    .line 2536
    invoke-direct {v2, v3}, La/cr60;-><init>(B)V

    .line 2537
    .line 2538
    .line 2539
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2540
    .line 2541
    .line 2542
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2543
    .line 2544
    return-object v0

    .line 2545
    :pswitch_13
    check-cast v0, La/py60;

    .line 2546
    .line 2547
    move-object/from16 v1, p1

    .line 2548
    .line 2549
    check-cast v1, La/ly60;

    .line 2550
    .line 2551
    sget-object v2, La/py60;->P1:[La/iiy;

    .line 2552
    .line 2553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2554
    .line 2555
    .line 2556
    iget-object v0, v0, La/py60;->O1:La/a8z;

    .line 2557
    .line 2558
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v0

    .line 2562
    check-cast v0, La/k3t0;

    .line 2563
    .line 2564
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2565
    .line 2566
    .line 2567
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2568
    .line 2569
    return-object v0

    .line 2570
    :pswitch_14
    check-cast v0, La/vra;

    .line 2571
    .line 2572
    move-object/from16 v1, p1

    .line 2573
    .line 2574
    check-cast v1, La/cp;

    .line 2575
    .line 2576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2577
    .line 2578
    .line 2579
    new-instance v2, La/xg;

    .line 2580
    .line 2581
    invoke-direct {v2, v1, v0, v1, v6}, La/xg;-><init>(La/cp;Ljava/lang/Object;La/cp;B)V

    .line 2582
    .line 2583
    .line 2584
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 2585
    .line 2586
    .line 2587
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2588
    .line 2589
    return-object v0

    .line 2590
    :pswitch_15
    check-cast v0, La/b430;

    .line 2591
    .line 2592
    move-object/from16 v1, p1

    .line 2593
    .line 2594
    check-cast v1, La/ewa;

    .line 2595
    .line 2596
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2597
    .line 2598
    .line 2599
    iget-object v3, v0, La/b430;->b:Ljava/lang/Object;

    .line 2600
    .line 2601
    check-cast v3, La/ctf0;

    .line 2602
    .line 2603
    iget-object v4, v0, La/b430;->e:La/n0o0;

    .line 2604
    .line 2605
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v4

    .line 2609
    check-cast v4, La/fee;

    .line 2610
    .line 2611
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 2612
    .line 2613
    .line 2614
    move-result-object v4

    .line 2615
    check-cast v4, Ljava/lang/Boolean;

    .line 2616
    .line 2617
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2618
    .line 2619
    .line 2620
    move-result v4

    .line 2621
    if-nez v4, :cond_48

    .line 2622
    .line 2623
    new-instance v10, La/yva;

    .line 2624
    .line 2625
    new-array v0, v8, [Ljava/lang/Object;

    .line 2626
    .line 2627
    iget-object v1, v3, La/ctf0;->b:La/lsm0;

    .line 2628
    .line 2629
    invoke-static {v0, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v0

    .line 2633
    const v2, 0x7f1302fa

    .line 2634
    .line 2635
    .line 2636
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2637
    .line 2638
    .line 2639
    move-result-object v0

    .line 2640
    new-array v1, v8, [Ljava/lang/Object;

    .line 2641
    .line 2642
    iget-object v2, v3, La/ctf0;->b:La/lsm0;

    .line 2643
    .line 2644
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v1

    .line 2648
    const v3, 0x7f13112e

    .line 2649
    .line 2650
    .line 2651
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v1

    .line 2655
    invoke-direct {v10, v0, v1}, La/yva;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2656
    .line 2657
    .line 2658
    goto :goto_e

    .line 2659
    :cond_48
    new-instance v4, La/xva;

    .line 2660
    .line 2661
    iget-object v6, v1, La/ewa;->a:Ljava/lang/String;

    .line 2662
    .line 2663
    move-object v11, v4

    .line 2664
    iget-object v4, v1, La/ewa;->b:Ljava/lang/String;

    .line 2665
    .line 2666
    iget-object v1, v1, La/ewa;->c:Ljava/lang/String;

    .line 2667
    .line 2668
    iget-object v0, v0, La/b430;->d:La/n0o0;

    .line 2669
    .line 2670
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v0

    .line 2674
    check-cast v0, La/fee;

    .line 2675
    .line 2676
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 2677
    .line 2678
    .line 2679
    move-result-object v0

    .line 2680
    check-cast v0, La/kg;

    .line 2681
    .line 2682
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2683
    .line 2684
    .line 2685
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2686
    .line 2687
    .line 2688
    move-result v0

    .line 2689
    if-eqz v0, :cond_4d

    .line 2690
    .line 2691
    if-eq v0, v9, :cond_4c

    .line 2692
    .line 2693
    if-eq v0, v5, :cond_4b

    .line 2694
    .line 2695
    if-eq v0, v7, :cond_4a

    .line 2696
    .line 2697
    if-ne v0, v2, :cond_49

    .line 2698
    .line 2699
    sget-object v0, La/ijl;->e:La/ijl;

    .line 2700
    .line 2701
    goto :goto_d

    .line 2702
    :cond_49
    invoke-static {}, La/t9f;->b()V

    .line 2703
    .line 2704
    .line 2705
    goto :goto_e

    .line 2706
    :cond_4a
    sget-object v0, La/ijl;->d:La/ijl;

    .line 2707
    .line 2708
    goto :goto_d

    .line 2709
    :cond_4b
    sget-object v0, La/ijl;->c:La/ijl;

    .line 2710
    .line 2711
    goto :goto_d

    .line 2712
    :cond_4c
    sget-object v0, La/ijl;->b:La/ijl;

    .line 2713
    .line 2714
    goto :goto_d

    .line 2715
    :cond_4d
    sget-object v0, La/ijl;->a:La/ijl;

    .line 2716
    .line 2717
    :goto_d
    new-array v2, v8, [Ljava/lang/Object;

    .line 2718
    .line 2719
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 2720
    .line 2721
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v2

    .line 2725
    const v5, 0x7f1315e0

    .line 2726
    .line 2727
    .line 2728
    invoke-virtual {v3, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v7

    .line 2732
    move-object v5, v1

    .line 2733
    move-object v3, v6

    .line 2734
    move-object v2, v11

    .line 2735
    move-object v6, v0

    .line 2736
    invoke-direct/range {v2 .. v7}, La/xva;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ijl;Ljava/lang/String;)V

    .line 2737
    .line 2738
    .line 2739
    move-object v10, v2

    .line 2740
    :goto_e
    return-object v10

    .line 2741
    :pswitch_16
    check-cast v0, La/wn60;

    .line 2742
    .line 2743
    move-object/from16 v1, p1

    .line 2744
    .line 2745
    check-cast v1, Landroid/view/View;

    .line 2746
    .line 2747
    sget-object v2, La/wn60;->O1:[La/iiy;

    .line 2748
    .line 2749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2750
    .line 2751
    .line 2752
    iget-object v0, v0, La/wn60;->N1:La/kiu0;

    .line 2753
    .line 2754
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 2755
    .line 2756
    .line 2757
    move-result-object v0

    .line 2758
    check-cast v0, La/yn60;

    .line 2759
    .line 2760
    iget-object v1, v0, La/yn60;->d:La/lzt;

    .line 2761
    .line 2762
    invoke-virtual {v1}, La/lzt;->a()Z

    .line 2763
    .line 2764
    .line 2765
    move-result v1

    .line 2766
    if-nez v1, :cond_4e

    .line 2767
    .line 2768
    goto :goto_f

    .line 2769
    :cond_4e
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v2

    .line 2773
    iget-object v1, v0, La/yn60;->c:La/mne;

    .line 2774
    .line 2775
    iget-object v5, v1, La/mne;->a:La/rwj;

    .line 2776
    .line 2777
    sget-object v3, La/xn60;->a:La/xn60;

    .line 2778
    .line 2779
    new-instance v6, La/w620;

    .line 2780
    .line 2781
    const/16 v1, 0x1d

    .line 2782
    .line 2783
    invoke-direct {v6, v0, v10, v1}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 2784
    .line 2785
    .line 2786
    const/16 v7, 0xa

    .line 2787
    .line 2788
    const/4 v4, 0x0

    .line 2789
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2790
    .line 2791
    .line 2792
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2793
    .line 2794
    return-object v0

    .line 2795
    :pswitch_17
    check-cast v0, La/jw50;

    .line 2796
    .line 2797
    move-object/from16 v1, p1

    .line 2798
    .line 2799
    check-cast v1, La/cp;

    .line 2800
    .line 2801
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2802
    .line 2803
    .line 2804
    iget-object v2, v1, La/xhe0;->a:Landroid/view/View;

    .line 2805
    .line 2806
    new-instance v3, La/bs50;

    .line 2807
    .line 2808
    invoke-direct {v3, v0, v1, v7}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2809
    .line 2810
    .line 2811
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2812
    .line 2813
    .line 2814
    new-instance v0, La/b1w;

    .line 2815
    .line 2816
    const/16 v2, 0x1c

    .line 2817
    .line 2818
    invoke-direct {v0, v1, v2}, La/b1w;-><init>(La/cp;B)V

    .line 2819
    .line 2820
    .line 2821
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 2822
    .line 2823
    .line 2824
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2825
    .line 2826
    return-object v0

    .line 2827
    :pswitch_18
    check-cast v0, La/oj60;

    .line 2828
    .line 2829
    move-object/from16 v1, p1

    .line 2830
    .line 2831
    check-cast v1, La/iqt0;

    .line 2832
    .line 2833
    sget-object v2, La/oj60;->P1:[La/iiy;

    .line 2834
    .line 2835
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2836
    .line 2837
    .line 2838
    invoke-virtual {v0}, La/oj60;->G0()La/hl60;

    .line 2839
    .line 2840
    .line 2841
    move-result-object v0

    .line 2842
    iget-object v0, v0, La/hl60;->l:La/z4w0;

    .line 2843
    .line 2844
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 2845
    .line 2846
    .line 2847
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2848
    .line 2849
    return-object v0

    .line 2850
    :pswitch_19
    check-cast v0, La/of60;

    .line 2851
    .line 2852
    move-object/from16 v1, p1

    .line 2853
    .line 2854
    check-cast v1, Ljava/lang/Throwable;

    .line 2855
    .line 2856
    sget-object v2, La/of60;->i2:La/evz;

    .line 2857
    .line 2858
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2859
    .line 2860
    .line 2861
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v1

    .line 2865
    const v2, 0x7f13131f

    .line 2866
    .line 2867
    .line 2868
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2869
    .line 2870
    .line 2871
    move-result-object v2

    .line 2872
    new-instance v3, Lkotlin/Pair;

    .line 2873
    .line 2874
    const-string v4, "ERROR_SOCIAL"

    .line 2875
    .line 2876
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2877
    .line 2878
    .line 2879
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 2880
    .line 2881
    .line 2882
    move-result-object v2

    .line 2883
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 2884
    .line 2885
    .line 2886
    move-result-object v2

    .line 2887
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 2888
    .line 2889
    .line 2890
    invoke-virtual {v0}, La/sik;->y0()V

    .line 2891
    .line 2892
    .line 2893
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2894
    .line 2895
    return-object v0

    .line 2896
    :pswitch_1a
    check-cast v0, La/ufk0;

    .line 2897
    .line 2898
    move-object/from16 v1, p1

    .line 2899
    .line 2900
    check-cast v1, La/lwk;

    .line 2901
    .line 2902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2903
    .line 2904
    .line 2905
    new-instance v1, La/ty2;

    .line 2906
    .line 2907
    const/16 v2, 0xf

    .line 2908
    .line 2909
    invoke-direct {v1, v0, v2}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 2910
    .line 2911
    .line 2912
    return-object v1

    .line 2913
    :pswitch_1b
    check-cast v0, La/rrd;

    .line 2914
    .line 2915
    move-object/from16 v1, p1

    .line 2916
    .line 2917
    check-cast v1, Ljava/lang/Throwable;

    .line 2918
    .line 2919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2920
    .line 2921
    .line 2922
    instance-of v2, v1, La/zhi0;

    .line 2923
    .line 2924
    if-eqz v2, :cond_4f

    .line 2925
    .line 2926
    check-cast v1, La/zhi0;

    .line 2927
    .line 2928
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 2929
    .line 2930
    sget-object v2, La/i2o;->D2:La/i2o;

    .line 2931
    .line 2932
    if-ne v1, v2, :cond_4f

    .line 2933
    .line 2934
    iget-object v0, v0, La/rrd;->e:Ljava/lang/Object;

    .line 2935
    .line 2936
    check-cast v0, La/x4v;

    .line 2937
    .line 2938
    iget-object v0, v0, La/x4v;->a:La/gst0;

    .line 2939
    .line 2940
    invoke-virtual {v0}, La/gst0;->j()V

    .line 2941
    .line 2942
    .line 2943
    move v8, v9

    .line 2944
    :cond_4f
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2945
    .line 2946
    .line 2947
    move-result-object v0

    .line 2948
    return-object v0

    .line 2949
    :pswitch_1c
    check-cast v0, La/rrd;

    .line 2950
    .line 2951
    move-object/from16 v1, p1

    .line 2952
    .line 2953
    check-cast v1, Ljava/lang/Throwable;

    .line 2954
    .line 2955
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2956
    .line 2957
    .line 2958
    instance-of v2, v1, La/zhi0;

    .line 2959
    .line 2960
    if-eqz v2, :cond_50

    .line 2961
    .line 2962
    check-cast v1, La/zhi0;

    .line 2963
    .line 2964
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 2965
    .line 2966
    sget-object v2, La/i2o;->D2:La/i2o;

    .line 2967
    .line 2968
    if-ne v1, v2, :cond_50

    .line 2969
    .line 2970
    iget-object v0, v0, La/rrd;->e:Ljava/lang/Object;

    .line 2971
    .line 2972
    check-cast v0, La/r4v;

    .line 2973
    .line 2974
    iget-object v0, v0, La/r4v;->a:La/gst0;

    .line 2975
    .line 2976
    invoke-virtual {v0}, La/gst0;->i()V

    .line 2977
    .line 2978
    .line 2979
    move v8, v9

    .line 2980
    :cond_50
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2981
    .line 2982
    .line 2983
    move-result-object v0

    .line 2984
    return-object v0

    .line 2985
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
