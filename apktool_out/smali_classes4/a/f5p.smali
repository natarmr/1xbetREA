.class public final synthetic La/f5p;
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
    iput-byte p3, p0, La/f5p;->a:B

    iput-object p1, p0, La/f5p;->b:Ljava/lang/Object;

    iput-object p2, p0, La/f5p;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f5p;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const v4, 0x7f130274

    .line 7
    .line 8
    .line 9
    const/4 v5, 0x3

    .line 10
    const/16 v6, 0xb

    .line 11
    .line 12
    const v7, 0x7f130275

    .line 13
    .line 14
    .line 15
    const v8, 0x7f130276

    .line 16
    .line 17
    .line 18
    const/16 v9, 0xa

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x1

    .line 22
    const/4 v12, 0x0

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/j2s;

    .line 33
    .line 34
    move-object/from16 v2, p1

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sget-object v3, La/j2s;->b2:La/xak;

    .line 43
    .line 44
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, La/j2s;->J0()La/k3t0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, La/i1s;

    .line 52
    .line 53
    invoke-direct {v1, v2}, La/i1s;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_0
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, La/l7m0;

    .line 65
    .line 66
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/j2s;

    .line 69
    .line 70
    move-object/from16 v2, p1

    .line 71
    .line 72
    check-cast v2, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    sget-object v3, La/j2s;->b2:La/xak;

    .line 79
    .line 80
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, La/n930;

    .line 85
    .line 86
    iget-object v1, v1, La/n930;->g:La/a4x;

    .line 87
    .line 88
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, La/m930;

    .line 93
    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    instance-of v2, v1, La/l930;

    .line 97
    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    invoke-virtual {v0}, La/j2s;->J0()La/k3t0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v1, La/l1s;->a:La/l1s;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    instance-of v1, v1, La/k930;

    .line 111
    .line 112
    if-eqz v1, :cond_1

    .line 113
    .line 114
    invoke-virtual {v0}, La/j2s;->J0()La/k3t0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v1, La/f1s;->a:La/f1s;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    :goto_0
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    :goto_1
    return-object v12

    .line 131
    :pswitch_1
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, La/l0s;

    .line 134
    .line 135
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, La/mie0;

    .line 138
    .line 139
    move-object/from16 v2, p1

    .line 140
    .line 141
    check-cast v2, La/k0w0;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v3, La/gmo;

    .line 147
    .line 148
    const/16 v4, 0x15

    .line 149
    .line 150
    invoke-direct {v3, v1, v0, v4}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    new-instance v0, La/a1w0;

    .line 154
    .line 155
    invoke-direct {v0, v3}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, La/c8d;

    .line 165
    .line 166
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 167
    .line 168
    new-instance v2, La/v7d;

    .line 169
    .line 170
    invoke-direct {v2, v11, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 171
    .line 172
    .line 173
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 174
    .line 175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_2
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, La/ali;

    .line 181
    .line 182
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Ljava/lang/String;

    .line 185
    .line 186
    move-object/from16 v2, p1

    .line 187
    .line 188
    check-cast v2, La/k0w0;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v1, v1, La/ali;->c:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, La/mi70;

    .line 196
    .line 197
    new-instance v3, La/ybi0;

    .line 198
    .line 199
    invoke-direct {v3, v0, v10}, La/ybi0;-><init>(Ljava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 206
    .line 207
    invoke-direct {v0, v3}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v0}, La/k0w0;->m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;

    .line 211
    .line 212
    .line 213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_3
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v1, La/spr;

    .line 219
    .line 220
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, La/umr;

    .line 223
    .line 224
    move-object/from16 v2, p1

    .line 225
    .line 226
    check-cast v2, La/k0w0;

    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object v3, v1, La/spr;->L:La/yfm0;

    .line 232
    .line 233
    check-cast v0, La/smr;

    .line 234
    .line 235
    iget-object v0, v0, La/smr;->a:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, La/qnr;

    .line 242
    .line 243
    iget-wide v4, v1, La/qnr;->e:J

    .line 244
    .line 245
    check-cast v3, La/zfm0;

    .line 246
    .line 247
    invoke-virtual {v3, v4, v5, v0}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_4
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v1, La/spr;

    .line 260
    .line 261
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Ljava/lang/String;

    .line 264
    .line 265
    move-object/from16 v2, p1

    .line 266
    .line 267
    check-cast v2, La/k0w0;

    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v3, v1, La/spr;->s:La/rl70;

    .line 273
    .line 274
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, La/qnr;

    .line 279
    .line 280
    iget-object v4, v4, La/qnr;->b:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    check-cast v1, La/qnr;

    .line 287
    .line 288
    iget-wide v5, v1, La/qnr;->e:J

    .line 289
    .line 290
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-static {v5, v6, v0, v4}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 298
    .line 299
    .line 300
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_5
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 306
    .line 307
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, La/dnr;

    .line 310
    .line 311
    move-object/from16 v2, p1

    .line 312
    .line 313
    check-cast v2, Ljava/lang/Boolean;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    sget-object v3, La/dnr;->c2:La/ddk;

    .line 320
    .line 321
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, La/dnr;->I0()La/k3t0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    new-instance v1, La/mmr;

    .line 329
    .line 330
    invoke-direct {v1, v2}, La/mmr;-><init>(Z)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_6
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v1, La/fkr;

    .line 342
    .line 343
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 346
    .line 347
    move-object/from16 v2, p1

    .line 348
    .line 349
    check-cast v2, La/hcz;

    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    new-instance v3, La/elm;

    .line 355
    .line 356
    invoke-direct {v3, v1, v6}, La/elm;-><init>(Ljava/lang/Object;B)V

    .line 357
    .line 358
    .line 359
    new-instance v4, La/ugd;

    .line 360
    .line 361
    const v6, -0x18262028

    .line 362
    .line 363
    .line 364
    invoke-direct {v4, v6, v11, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v2, v12, v12, v4, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 368
    .line 369
    .line 370
    sget-object v3, La/knx;->d:La/ugd;

    .line 371
    .line 372
    invoke-static {v2, v12, v12, v3, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 373
    .line 374
    .line 375
    iget-object v1, v1, La/fkr;->c:La/a4x;

    .line 376
    .line 377
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    new-instance v4, La/far;

    .line 382
    .line 383
    invoke-direct {v4, v1, v11}, La/far;-><init>(Ljava/util/List;B)V

    .line 384
    .line 385
    .line 386
    new-instance v5, La/yul;

    .line 387
    .line 388
    invoke-direct {v5, v1, v0, v9}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 389
    .line 390
    .line 391
    new-instance v0, La/ugd;

    .line 392
    .line 393
    const v1, 0x2fd4df92

    .line 394
    .line 395
    .line 396
    invoke-direct {v0, v1, v11, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v3, v12, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 400
    .line 401
    .line 402
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_7
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, Ljava/lang/String;

    .line 408
    .line 409
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, La/th90;

    .line 412
    .line 413
    move-object/from16 v2, p1

    .line 414
    .line 415
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v1, v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_8
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, La/ecr;

    .line 429
    .line 430
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, La/zvh0;

    .line 433
    .line 434
    move-object/from16 v2, p1

    .line 435
    .line 436
    check-cast v2, La/jwh0;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-object v1, v1, La/ecr;->b:La/ctf0;

    .line 442
    .line 443
    sget-object v5, La/cj80;->a:La/cj80;

    .line 444
    .line 445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    new-instance v6, La/oj80;

    .line 449
    .line 450
    sget-object v11, La/ij80;->a:La/ij80;

    .line 451
    .line 452
    new-instance v13, La/yvh0;

    .line 453
    .line 454
    new-array v14, v10, [Ljava/lang/Object;

    .line 455
    .line 456
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 457
    .line 458
    invoke-static {v14, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v14

    .line 462
    invoke-virtual {v1, v8, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    sget-object v14, La/bwh0;->a:La/bwh0;

    .line 467
    .line 468
    invoke-direct {v13, v8, v14}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 469
    .line 470
    .line 471
    invoke-direct {v6, v11, v13}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 472
    .line 473
    .line 474
    new-instance v8, La/oj80;

    .line 475
    .line 476
    sget-object v13, La/fj80;->a:La/fj80;

    .line 477
    .line 478
    new-instance v15, La/yvh0;

    .line 479
    .line 480
    new-array v3, v10, [Ljava/lang/Object;

    .line 481
    .line 482
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v1, v7, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    invoke-direct {v15, v3, v14}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 491
    .line 492
    .line 493
    invoke-direct {v8, v13, v15}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 494
    .line 495
    .line 496
    iget-boolean v3, v2, La/jwh0;->b:Z

    .line 497
    .line 498
    iget-object v7, v2, La/jwh0;->a:La/ko7;

    .line 499
    .line 500
    if-eqz v3, :cond_3

    .line 501
    .line 502
    goto :goto_2

    .line 503
    :cond_3
    move-object v8, v12

    .line 504
    :goto_2
    new-instance v3, La/oj80;

    .line 505
    .line 506
    new-instance v15, La/yvh0;

    .line 507
    .line 508
    new-array v12, v10, [Ljava/lang/Object;

    .line 509
    .line 510
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v12

    .line 514
    invoke-virtual {v1, v4, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-direct {v15, v1, v14}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 519
    .line 520
    .line 521
    invoke-direct {v3, v5, v15}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 522
    .line 523
    .line 524
    iget-boolean v1, v2, La/jwh0;->c:Z

    .line 525
    .line 526
    if-eqz v1, :cond_4

    .line 527
    .line 528
    goto :goto_3

    .line 529
    :cond_4
    const/4 v3, 0x0

    .line 530
    :goto_3
    filled-new-array {v6, v8, v3}, [La/oj80;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-virtual {v1, v10}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    move v3, v10

    .line 547
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_9

    .line 552
    .line 553
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    check-cast v4, La/oj80;

    .line 558
    .line 559
    iget-object v4, v4, La/oj80;->a:La/lj80;

    .line 560
    .line 561
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v6

    .line 565
    if-eqz v6, :cond_5

    .line 566
    .line 567
    instance-of v4, v7, La/jo7;

    .line 568
    .line 569
    goto :goto_5

    .line 570
    :cond_5
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-eqz v6, :cond_6

    .line 575
    .line 576
    instance-of v4, v7, La/io7;

    .line 577
    .line 578
    goto :goto_5

    .line 579
    :cond_6
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eqz v4, :cond_8

    .line 584
    .line 585
    instance-of v4, v7, La/ho7;

    .line 586
    .line 587
    :goto_5
    if-eqz v4, :cond_7

    .line 588
    .line 589
    goto :goto_6

    .line 590
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 591
    .line 592
    goto :goto_4

    .line 593
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 594
    .line 595
    .line 596
    const/4 v12, 0x0

    .line 597
    goto :goto_8

    .line 598
    :cond_9
    const/4 v3, -0x1

    .line 599
    :goto_6
    if-gez v3, :cond_a

    .line 600
    .line 601
    move v3, v10

    .line 602
    :cond_a
    new-instance v2, Ljava/util/ArrayList;

    .line 603
    .line 604
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 605
    .line 606
    .line 607
    move-result v4

    .line 608
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1, v10}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 616
    .line 617
    .line 618
    move-result v5

    .line 619
    if-eqz v5, :cond_b

    .line 620
    .line 621
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v5

    .line 625
    check-cast v5, La/oj80;

    .line 626
    .line 627
    iget-object v5, v5, La/oj80;->b:La/yvh0;

    .line 628
    .line 629
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    goto :goto_7

    .line 633
    :cond_b
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    invoke-static {v0}, La/tfx;->M(La/zvh0;)La/dxh0;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    new-instance v12, La/wwh0;

    .line 642
    .line 643
    invoke-direct {v12, v1, v2, v0, v3}, La/wwh0;-><init>(La/i4;La/a4x;La/dxh0;I)V

    .line 644
    .line 645
    .line 646
    :goto_8
    return-object v12

    .line 647
    :pswitch_9
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v1, La/ecr;

    .line 650
    .line 651
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v0, La/zvh0;

    .line 654
    .line 655
    move-object/from16 v2, p1

    .line 656
    .line 657
    check-cast v2, La/gwh0;

    .line 658
    .line 659
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    iget-object v1, v1, La/ecr;->b:La/ctf0;

    .line 663
    .line 664
    sget-object v3, La/cj80;->a:La/cj80;

    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    new-instance v5, La/oj80;

    .line 670
    .line 671
    sget-object v6, La/ij80;->a:La/ij80;

    .line 672
    .line 673
    new-instance v11, La/yvh0;

    .line 674
    .line 675
    new-array v12, v10, [Ljava/lang/Object;

    .line 676
    .line 677
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 678
    .line 679
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v12

    .line 683
    invoke-virtual {v1, v8, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v8

    .line 687
    sget-object v12, La/bwh0;->a:La/bwh0;

    .line 688
    .line 689
    invoke-direct {v11, v8, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 690
    .line 691
    .line 692
    invoke-direct {v5, v6, v11}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 693
    .line 694
    .line 695
    new-instance v8, La/oj80;

    .line 696
    .line 697
    sget-object v11, La/fj80;->a:La/fj80;

    .line 698
    .line 699
    new-instance v13, La/yvh0;

    .line 700
    .line 701
    new-array v14, v10, [Ljava/lang/Object;

    .line 702
    .line 703
    invoke-static {v14, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v14

    .line 707
    invoke-virtual {v1, v7, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v7

    .line 711
    invoke-direct {v13, v7, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 712
    .line 713
    .line 714
    invoke-direct {v8, v11, v13}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 715
    .line 716
    .line 717
    iget-boolean v7, v2, La/gwh0;->b:Z

    .line 718
    .line 719
    iget-object v13, v2, La/gwh0;->a:La/fo7;

    .line 720
    .line 721
    if-eqz v7, :cond_c

    .line 722
    .line 723
    goto :goto_9

    .line 724
    :cond_c
    const/4 v8, 0x0

    .line 725
    :goto_9
    new-instance v7, La/oj80;

    .line 726
    .line 727
    new-instance v14, La/yvh0;

    .line 728
    .line 729
    new-array v15, v10, [Ljava/lang/Object;

    .line 730
    .line 731
    invoke-static {v15, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v15

    .line 735
    invoke-virtual {v1, v4, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    invoke-direct {v14, v1, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 740
    .line 741
    .line 742
    invoke-direct {v7, v3, v14}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 743
    .line 744
    .line 745
    iget-boolean v1, v2, La/gwh0;->c:Z

    .line 746
    .line 747
    if-eqz v1, :cond_d

    .line 748
    .line 749
    goto :goto_a

    .line 750
    :cond_d
    const/4 v7, 0x0

    .line 751
    :goto_a
    filled-new-array {v5, v8, v7}, [La/oj80;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    invoke-virtual {v1, v10}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    move v4, v10

    .line 768
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 769
    .line 770
    .line 771
    move-result v5

    .line 772
    if-eqz v5, :cond_12

    .line 773
    .line 774
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    check-cast v5, La/oj80;

    .line 779
    .line 780
    iget-object v5, v5, La/oj80;->a:La/lj80;

    .line 781
    .line 782
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v7

    .line 786
    if-eqz v7, :cond_e

    .line 787
    .line 788
    instance-of v5, v13, La/co7;

    .line 789
    .line 790
    goto :goto_c

    .line 791
    :cond_e
    invoke-virtual {v5, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v7

    .line 795
    if-eqz v7, :cond_f

    .line 796
    .line 797
    instance-of v5, v13, La/zn7;

    .line 798
    .line 799
    goto :goto_c

    .line 800
    :cond_f
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    if-eqz v5, :cond_11

    .line 805
    .line 806
    instance-of v5, v13, La/xn7;

    .line 807
    .line 808
    :goto_c
    if-eqz v5, :cond_10

    .line 809
    .line 810
    move v3, v4

    .line 811
    goto :goto_d

    .line 812
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 813
    .line 814
    goto :goto_b

    .line 815
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 816
    .line 817
    .line 818
    const/4 v12, 0x0

    .line 819
    goto :goto_f

    .line 820
    :cond_12
    const/4 v3, -0x1

    .line 821
    :goto_d
    if-gez v3, :cond_13

    .line 822
    .line 823
    move v3, v10

    .line 824
    :cond_13
    new-instance v2, Ljava/util/ArrayList;

    .line 825
    .line 826
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1, v10}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 834
    .line 835
    .line 836
    move-result-object v4

    .line 837
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 838
    .line 839
    .line 840
    move-result v5

    .line 841
    if-eqz v5, :cond_14

    .line 842
    .line 843
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v5

    .line 847
    check-cast v5, La/oj80;

    .line 848
    .line 849
    iget-object v5, v5, La/oj80;->b:La/yvh0;

    .line 850
    .line 851
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    goto :goto_e

    .line 855
    :cond_14
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    invoke-static {v0}, La/gfx;->V(La/zvh0;)La/dxh0;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    new-instance v12, La/wwh0;

    .line 864
    .line 865
    invoke-direct {v12, v1, v2, v0, v3}, La/wwh0;-><init>(La/i4;La/a4x;La/dxh0;I)V

    .line 866
    .line 867
    .line 868
    :goto_f
    return-object v12

    .line 869
    :pswitch_a
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v1, La/z19;

    .line 872
    .line 873
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, La/zvh0;

    .line 876
    .line 877
    move-object/from16 v2, p1

    .line 878
    .line 879
    check-cast v2, La/fee;

    .line 880
    .line 881
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    new-instance v3, La/oj80;

    .line 885
    .line 886
    sget-object v4, La/ij80;->a:La/ij80;

    .line 887
    .line 888
    new-instance v5, La/yvh0;

    .line 889
    .line 890
    iget-object v6, v1, La/z19;->b:La/ctf0;

    .line 891
    .line 892
    new-array v12, v10, [Ljava/lang/Object;

    .line 893
    .line 894
    iget-object v13, v6, La/ctf0;->b:La/lsm0;

    .line 895
    .line 896
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v12

    .line 900
    invoke-virtual {v13, v8, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v8

    .line 904
    sget-object v12, La/bwh0;->a:La/bwh0;

    .line 905
    .line 906
    invoke-direct {v5, v8, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 907
    .line 908
    .line 909
    invoke-direct {v3, v4, v5}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 910
    .line 911
    .line 912
    new-instance v4, La/oj80;

    .line 913
    .line 914
    sget-object v5, La/fj80;->a:La/fj80;

    .line 915
    .line 916
    new-instance v8, La/yvh0;

    .line 917
    .line 918
    new-array v13, v10, [Ljava/lang/Object;

    .line 919
    .line 920
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 921
    .line 922
    invoke-static {v13, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v13

    .line 926
    invoke-virtual {v6, v7, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v6

    .line 930
    invoke-direct {v8, v6, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 931
    .line 932
    .line 933
    invoke-direct {v4, v5, v8}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 934
    .line 935
    .line 936
    iget-object v1, v1, La/z19;->g:La/n0o0;

    .line 937
    .line 938
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    check-cast v1, La/fee;

    .line 943
    .line 944
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    if-eqz v1, :cond_15

    .line 949
    .line 950
    goto :goto_10

    .line 951
    :cond_15
    const/4 v4, 0x0

    .line 952
    :goto_10
    filled-new-array {v3, v4}, [La/oj80;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    new-instance v3, Ljava/util/ArrayList;

    .line 965
    .line 966
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 967
    .line 968
    .line 969
    move-result v4

    .line 970
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1, v10}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    if-eqz v5, :cond_16

    .line 982
    .line 983
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    check-cast v5, La/oj80;

    .line 988
    .line 989
    iget-object v5, v5, La/oj80;->b:La/yvh0;

    .line 990
    .line 991
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    goto :goto_11

    .line 995
    :cond_16
    invoke-static {v3}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    invoke-static {v0}, La/zdx;->O(La/zvh0;)La/dxh0;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    check-cast v2, La/go7;

    .line 1008
    .line 1009
    if-eqz v2, :cond_18

    .line 1010
    .line 1011
    instance-of v4, v2, La/do7;

    .line 1012
    .line 1013
    if-eqz v4, :cond_17

    .line 1014
    .line 1015
    goto :goto_12

    .line 1016
    :cond_17
    instance-of v2, v2, La/ao7;

    .line 1017
    .line 1018
    if-eqz v2, :cond_18

    .line 1019
    .line 1020
    move v10, v11

    .line 1021
    :goto_12
    new-instance v12, La/wwh0;

    .line 1022
    .line 1023
    invoke-direct {v12, v1, v3, v0, v10}, La/wwh0;-><init>(La/i4;La/a4x;La/dxh0;I)V

    .line 1024
    .line 1025
    .line 1026
    goto :goto_13

    .line 1027
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 1028
    .line 1029
    .line 1030
    const/4 v12, 0x0

    .line 1031
    :goto_13
    return-object v12

    .line 1032
    :pswitch_b
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v1, La/zn0;

    .line 1035
    .line 1036
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, La/zvh0;

    .line 1039
    .line 1040
    move-object/from16 v2, p1

    .line 1041
    .line 1042
    check-cast v2, La/fee;

    .line 1043
    .line 1044
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1045
    .line 1046
    .line 1047
    new-instance v3, La/oj80;

    .line 1048
    .line 1049
    sget-object v4, La/ij80;->a:La/ij80;

    .line 1050
    .line 1051
    new-instance v5, La/yvh0;

    .line 1052
    .line 1053
    iget-object v6, v1, La/zn0;->b:La/ctf0;

    .line 1054
    .line 1055
    new-array v12, v10, [Ljava/lang/Object;

    .line 1056
    .line 1057
    iget-object v13, v6, La/ctf0;->b:La/lsm0;

    .line 1058
    .line 1059
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v12

    .line 1063
    invoke-virtual {v13, v8, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v8

    .line 1067
    sget-object v12, La/bwh0;->a:La/bwh0;

    .line 1068
    .line 1069
    invoke-direct {v5, v8, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1070
    .line 1071
    .line 1072
    invoke-direct {v3, v4, v5}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 1073
    .line 1074
    .line 1075
    iget-object v1, v1, La/zn0;->g:La/n0o0;

    .line 1076
    .line 1077
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    check-cast v1, La/fee;

    .line 1082
    .line 1083
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    check-cast v1, La/ifc0;

    .line 1088
    .line 1089
    iget-boolean v1, v1, La/ifc0;->g:Z

    .line 1090
    .line 1091
    if-eqz v1, :cond_19

    .line 1092
    .line 1093
    new-instance v1, La/oj80;

    .line 1094
    .line 1095
    sget-object v4, La/fj80;->a:La/fj80;

    .line 1096
    .line 1097
    new-instance v5, La/yvh0;

    .line 1098
    .line 1099
    new-array v8, v10, [Ljava/lang/Object;

    .line 1100
    .line 1101
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 1102
    .line 1103
    invoke-static {v8, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v8

    .line 1107
    invoke-virtual {v6, v7, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v6

    .line 1111
    invoke-direct {v5, v6, v12}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-direct {v1, v4, v5}, La/oj80;-><init>(La/lj80;La/yvh0;)V

    .line 1115
    .line 1116
    .line 1117
    goto :goto_14

    .line 1118
    :cond_19
    const/4 v1, 0x0

    .line 1119
    :goto_14
    filled-new-array {v3, v1}, [La/oj80;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v1

    .line 1123
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v1

    .line 1127
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v2

    .line 1135
    check-cast v2, La/eo7;

    .line 1136
    .line 1137
    if-eqz v2, :cond_1c

    .line 1138
    .line 1139
    instance-of v3, v2, La/bo7;

    .line 1140
    .line 1141
    if-eqz v3, :cond_1a

    .line 1142
    .line 1143
    move v11, v10

    .line 1144
    goto :goto_15

    .line 1145
    :cond_1a
    instance-of v2, v2, La/yn7;

    .line 1146
    .line 1147
    if-eqz v2, :cond_1c

    .line 1148
    .line 1149
    :goto_15
    invoke-static {v0}, La/wdx;->h0(La/zvh0;)La/dxh0;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    new-instance v2, Ljava/util/ArrayList;

    .line 1154
    .line 1155
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1156
    .line 1157
    .line 1158
    move-result v3

    .line 1159
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v1, v10}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v3

    .line 1166
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v4

    .line 1170
    if-eqz v4, :cond_1b

    .line 1171
    .line 1172
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v4

    .line 1176
    check-cast v4, La/oj80;

    .line 1177
    .line 1178
    iget-object v4, v4, La/oj80;->b:La/yvh0;

    .line 1179
    .line 1180
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1181
    .line 1182
    .line 1183
    goto :goto_16

    .line 1184
    :cond_1b
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    new-instance v12, La/wwh0;

    .line 1189
    .line 1190
    invoke-direct {v12, v1, v2, v0, v11}, La/wwh0;-><init>(La/i4;La/a4x;La/dxh0;I)V

    .line 1191
    .line 1192
    .line 1193
    goto :goto_17

    .line 1194
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1195
    .line 1196
    .line 1197
    const/4 v12, 0x0

    .line 1198
    :goto_17
    return-object v12

    .line 1199
    :pswitch_c
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 1200
    .line 1201
    check-cast v1, La/vft;

    .line 1202
    .line 1203
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, La/cp;

    .line 1206
    .line 1207
    move-object/from16 v2, p1

    .line 1208
    .line 1209
    check-cast v2, Landroid/view/View;

    .line 1210
    .line 1211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    check-cast v0, La/fbr;

    .line 1219
    .line 1220
    iget-object v0, v0, La/fbr;->a:Ljava/lang/String;

    .line 1221
    .line 1222
    invoke-virtual {v1, v0}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1226
    .line 1227
    return-object v0

    .line 1228
    :pswitch_d
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v1, La/mie0;

    .line 1231
    .line 1232
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 1233
    .line 1234
    check-cast v0, La/abr;

    .line 1235
    .line 1236
    move-object/from16 v2, p1

    .line 1237
    .line 1238
    check-cast v2, Ljava/lang/Throwable;

    .line 1239
    .line 1240
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1241
    .line 1242
    .line 1243
    iget-object v1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v1, La/bby;

    .line 1246
    .line 1247
    if-eqz v1, :cond_1d

    .line 1248
    .line 1249
    const/4 v3, 0x0

    .line 1250
    invoke-interface {v1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1251
    .line 1252
    .line 1253
    :cond_1d
    iget-object v1, v0, La/abr;->q:La/duj;

    .line 1254
    .line 1255
    new-instance v3, La/gup;

    .line 1256
    .line 1257
    const/16 v4, 0xd

    .line 1258
    .line 1259
    invoke-direct {v3, v2, v0, v4}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v1, v2, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1263
    .line 1264
    .line 1265
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1266
    .line 1267
    return-object v0

    .line 1268
    :pswitch_e
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v1, La/k4f;

    .line 1271
    .line 1272
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v0, La/cp;

    .line 1275
    .line 1276
    move-object/from16 v2, p1

    .line 1277
    .line 1278
    check-cast v2, Ljava/util/List;

    .line 1279
    .line 1280
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v2

    .line 1287
    check-cast v2, La/pjj0;

    .line 1288
    .line 1289
    iget-object v2, v2, La/pjj0;->a:Ljava/util/List;

    .line 1290
    .line 1291
    iput-object v2, v1, La/i26;->f:Ljava/lang/Object;

    .line 1292
    .line 1293
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1294
    .line 1295
    check-cast v1, La/vcu0;

    .line 1296
    .line 1297
    iget-object v1, v1, La/vcu0;->a:Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 1298
    .line 1299
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v2

    .line 1303
    if-eqz v2, :cond_1e

    .line 1304
    .line 1305
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    check-cast v0, La/pjj0;

    .line 1310
    .line 1311
    iget v0, v0, La/pjj0;->b:I

    .line 1312
    .line 1313
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1314
    .line 1315
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1316
    .line 1317
    .line 1318
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1319
    .line 1320
    goto :goto_18

    .line 1321
    :cond_1e
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 1322
    .line 1323
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    const/4 v12, 0x0

    .line 1327
    :goto_18
    return-object v12

    .line 1328
    :pswitch_f
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 1329
    .line 1330
    check-cast v1, La/orq;

    .line 1331
    .line 1332
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 1333
    .line 1334
    move-object v5, v0

    .line 1335
    check-cast v5, La/y0t0;

    .line 1336
    .line 1337
    move-object/from16 v7, p1

    .line 1338
    .line 1339
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1340
    .line 1341
    iget-object v0, v1, La/orq;->d:La/srq;

    .line 1342
    .line 1343
    iget-object v8, v1, La/orq;->a:La/hz2;

    .line 1344
    .line 1345
    iget-object v2, v1, La/orq;->f:La/g7p;

    .line 1346
    .line 1347
    iget-object v3, v5, La/y0t0;->a:La/nrq;

    .line 1348
    .line 1349
    instance-of v4, v3, La/qrq;

    .line 1350
    .line 1351
    if-nez v4, :cond_1f

    .line 1352
    .line 1353
    const/4 v3, 0x0

    .line 1354
    goto/16 :goto_33

    .line 1355
    .line 1356
    :cond_1f
    check-cast v3, La/qrq;

    .line 1357
    .line 1358
    iget-object v3, v3, La/qrq;->f:Ljava/util/List;

    .line 1359
    .line 1360
    iget-object v4, v5, La/y0t0;->b:La/psq;

    .line 1361
    .line 1362
    iget v6, v5, La/y0t0;->c:I

    .line 1363
    .line 1364
    new-instance v9, Ljava/util/ArrayList;

    .line 1365
    .line 1366
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1367
    .line 1368
    .line 1369
    move-result v12

    .line 1370
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 1371
    .line 1372
    .line 1373
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1374
    .line 1375
    .line 1376
    move-result v12

    .line 1377
    move v13, v10

    .line 1378
    :goto_19
    if-ge v13, v12, :cond_21

    .line 1379
    .line 1380
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v14

    .line 1384
    move-object v15, v14

    .line 1385
    check-cast v15, La/atf0;

    .line 1386
    .line 1387
    iget-object v15, v15, La/atf0;->b:La/psq;

    .line 1388
    .line 1389
    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v15

    .line 1393
    if-eqz v15, :cond_20

    .line 1394
    .line 1395
    if-nez v6, :cond_20

    .line 1396
    .line 1397
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    :cond_20
    add-int/lit8 v13, v13, 0x1

    .line 1401
    .line 1402
    goto :goto_19

    .line 1403
    :cond_21
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1404
    .line 1405
    .line 1406
    move-result v12

    .line 1407
    if-nez v12, :cond_22

    .line 1408
    .line 1409
    goto/16 :goto_2b

    .line 1410
    .line 1411
    :cond_22
    new-instance v9, Ljava/util/ArrayList;

    .line 1412
    .line 1413
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1414
    .line 1415
    .line 1416
    move-result v12

    .line 1417
    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 1418
    .line 1419
    .line 1420
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1421
    .line 1422
    .line 1423
    move-result v12

    .line 1424
    move v13, v10

    .line 1425
    :goto_1a
    if-ge v13, v12, :cond_24

    .line 1426
    .line 1427
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v14

    .line 1431
    move-object v15, v14

    .line 1432
    check-cast v15, La/atf0;

    .line 1433
    .line 1434
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1435
    .line 1436
    .line 1437
    if-nez v6, :cond_23

    .line 1438
    .line 1439
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1440
    .line 1441
    .line 1442
    :cond_23
    add-int/lit8 v13, v13, 0x1

    .line 1443
    .line 1444
    goto :goto_1a

    .line 1445
    :cond_24
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1446
    .line 1447
    .line 1448
    move-result v6

    .line 1449
    if-eqz v6, :cond_25

    .line 1450
    .line 1451
    goto :goto_1b

    .line 1452
    :cond_25
    move-object v3, v9

    .line 1453
    :goto_1b
    sget-object v6, La/psq;->b:La/psq;

    .line 1454
    .line 1455
    invoke-virtual {v4, v6}, La/psq;->a(La/psq;)I

    .line 1456
    .line 1457
    .line 1458
    move-result v6

    .line 1459
    iget v9, v4, La/psq;->a:I

    .line 1460
    .line 1461
    if-gez v6, :cond_2e

    .line 1462
    .line 1463
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1464
    .line 1465
    .line 1466
    move-result v4

    .line 1467
    move v13, v10

    .line 1468
    const/4 v6, 0x0

    .line 1469
    const/4 v12, 0x0

    .line 1470
    :goto_1c
    if-ge v13, v4, :cond_2b

    .line 1471
    .line 1472
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v14

    .line 1476
    check-cast v14, La/atf0;

    .line 1477
    .line 1478
    iget-object v14, v14, La/atf0;->b:La/psq;

    .line 1479
    .line 1480
    iget v15, v14, La/psq;->a:I

    .line 1481
    .line 1482
    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1483
    .line 1484
    .line 1485
    move-result v16

    .line 1486
    if-gez v16, :cond_27

    .line 1487
    .line 1488
    if-eqz v6, :cond_26

    .line 1489
    .line 1490
    iget v11, v6, La/psq;->a:I

    .line 1491
    .line 1492
    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1493
    .line 1494
    .line 1495
    move-result v11

    .line 1496
    if-lez v11, :cond_29

    .line 1497
    .line 1498
    :cond_26
    move-object v6, v14

    .line 1499
    goto :goto_1d

    .line 1500
    :cond_27
    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1501
    .line 1502
    .line 1503
    move-result v11

    .line 1504
    if-lez v11, :cond_2a

    .line 1505
    .line 1506
    if-eqz v12, :cond_28

    .line 1507
    .line 1508
    iget v11, v12, La/psq;->a:I

    .line 1509
    .line 1510
    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1511
    .line 1512
    .line 1513
    move-result v11

    .line 1514
    if-gez v11, :cond_29

    .line 1515
    .line 1516
    :cond_28
    move-object v12, v14

    .line 1517
    :cond_29
    :goto_1d
    add-int/lit8 v13, v13, 0x1

    .line 1518
    .line 1519
    const/4 v11, 0x1

    .line 1520
    goto :goto_1c

    .line 1521
    :cond_2a
    move-object v6, v14

    .line 1522
    move-object v12, v6

    .line 1523
    :cond_2b
    if-nez v6, :cond_2c

    .line 1524
    .line 1525
    move-object v6, v12

    .line 1526
    :cond_2c
    new-instance v9, Ljava/util/ArrayList;

    .line 1527
    .line 1528
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1529
    .line 1530
    .line 1531
    move-result v4

    .line 1532
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1533
    .line 1534
    .line 1535
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1536
    .line 1537
    .line 1538
    move-result v4

    .line 1539
    move v11, v10

    .line 1540
    :goto_1e
    if-ge v11, v4, :cond_4c

    .line 1541
    .line 1542
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v12

    .line 1546
    move-object v13, v12

    .line 1547
    check-cast v13, La/atf0;

    .line 1548
    .line 1549
    iget-object v13, v13, La/atf0;->b:La/psq;

    .line 1550
    .line 1551
    invoke-static {v13, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1552
    .line 1553
    .line 1554
    move-result v13

    .line 1555
    if-eqz v13, :cond_2d

    .line 1556
    .line 1557
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1558
    .line 1559
    .line 1560
    :cond_2d
    add-int/lit8 v11, v11, 0x1

    .line 1561
    .line 1562
    goto :goto_1e

    .line 1563
    :cond_2e
    sget-object v6, La/psq;->c:La/psq;

    .line 1564
    .line 1565
    invoke-virtual {v4, v6}, La/psq;->a(La/psq;)I

    .line 1566
    .line 1567
    .line 1568
    move-result v4

    .line 1569
    if-lez v4, :cond_37

    .line 1570
    .line 1571
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1572
    .line 1573
    .line 1574
    move-result v4

    .line 1575
    move v12, v10

    .line 1576
    const/4 v6, 0x0

    .line 1577
    const/4 v11, 0x0

    .line 1578
    :goto_1f
    if-ge v12, v4, :cond_34

    .line 1579
    .line 1580
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v13

    .line 1584
    check-cast v13, La/atf0;

    .line 1585
    .line 1586
    iget-object v13, v13, La/atf0;->b:La/psq;

    .line 1587
    .line 1588
    iget v14, v13, La/psq;->a:I

    .line 1589
    .line 1590
    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1591
    .line 1592
    .line 1593
    move-result v15

    .line 1594
    if-gez v15, :cond_30

    .line 1595
    .line 1596
    if-eqz v6, :cond_2f

    .line 1597
    .line 1598
    iget v15, v6, La/psq;->a:I

    .line 1599
    .line 1600
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1601
    .line 1602
    .line 1603
    move-result v14

    .line 1604
    if-lez v14, :cond_32

    .line 1605
    .line 1606
    :cond_2f
    move-object v6, v13

    .line 1607
    goto :goto_20

    .line 1608
    :cond_30
    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1609
    .line 1610
    .line 1611
    move-result v15

    .line 1612
    if-lez v15, :cond_33

    .line 1613
    .line 1614
    if-eqz v11, :cond_31

    .line 1615
    .line 1616
    iget v15, v11, La/psq;->a:I

    .line 1617
    .line 1618
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1619
    .line 1620
    .line 1621
    move-result v14

    .line 1622
    if-gez v14, :cond_32

    .line 1623
    .line 1624
    :cond_31
    move-object v11, v13

    .line 1625
    :cond_32
    :goto_20
    add-int/lit8 v12, v12, 0x1

    .line 1626
    .line 1627
    goto :goto_1f

    .line 1628
    :cond_33
    move-object v6, v13

    .line 1629
    move-object v11, v6

    .line 1630
    :cond_34
    if-nez v11, :cond_35

    .line 1631
    .line 1632
    goto :goto_21

    .line 1633
    :cond_35
    move-object v6, v11

    .line 1634
    :goto_21
    new-instance v9, Ljava/util/ArrayList;

    .line 1635
    .line 1636
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1637
    .line 1638
    .line 1639
    move-result v4

    .line 1640
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1641
    .line 1642
    .line 1643
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1644
    .line 1645
    .line 1646
    move-result v4

    .line 1647
    move v11, v10

    .line 1648
    :goto_22
    if-ge v11, v4, :cond_4c

    .line 1649
    .line 1650
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v12

    .line 1654
    move-object v13, v12

    .line 1655
    check-cast v13, La/atf0;

    .line 1656
    .line 1657
    iget-object v13, v13, La/atf0;->b:La/psq;

    .line 1658
    .line 1659
    invoke-static {v13, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v13

    .line 1663
    if-eqz v13, :cond_36

    .line 1664
    .line 1665
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1666
    .line 1667
    .line 1668
    :cond_36
    add-int/lit8 v11, v11, 0x1

    .line 1669
    .line 1670
    goto :goto_22

    .line 1671
    :cond_37
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1672
    .line 1673
    .line 1674
    move-result v4

    .line 1675
    move v13, v10

    .line 1676
    const/4 v11, 0x0

    .line 1677
    const/4 v12, 0x0

    .line 1678
    :goto_23
    if-ge v13, v4, :cond_3e

    .line 1679
    .line 1680
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v14

    .line 1684
    check-cast v14, La/atf0;

    .line 1685
    .line 1686
    iget-object v14, v14, La/atf0;->b:La/psq;

    .line 1687
    .line 1688
    iget v15, v14, La/psq;->a:I

    .line 1689
    .line 1690
    iget v10, v6, La/psq;->a:I

    .line 1691
    .line 1692
    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1693
    .line 1694
    .line 1695
    move-result v10

    .line 1696
    if-lez v10, :cond_38

    .line 1697
    .line 1698
    goto :goto_24

    .line 1699
    :cond_38
    iget v10, v14, La/psq;->a:I

    .line 1700
    .line 1701
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1702
    .line 1703
    .line 1704
    move-result v15

    .line 1705
    if-gez v15, :cond_3a

    .line 1706
    .line 1707
    if-eqz v11, :cond_39

    .line 1708
    .line 1709
    iget v15, v11, La/psq;->a:I

    .line 1710
    .line 1711
    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1712
    .line 1713
    .line 1714
    move-result v10

    .line 1715
    if-lez v10, :cond_3c

    .line 1716
    .line 1717
    :cond_39
    move-object v11, v14

    .line 1718
    goto :goto_24

    .line 1719
    :cond_3a
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1720
    .line 1721
    .line 1722
    move-result v15

    .line 1723
    if-lez v15, :cond_3d

    .line 1724
    .line 1725
    if-eqz v12, :cond_3b

    .line 1726
    .line 1727
    iget v15, v12, La/psq;->a:I

    .line 1728
    .line 1729
    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1730
    .line 1731
    .line 1732
    move-result v10

    .line 1733
    if-gez v10, :cond_3c

    .line 1734
    .line 1735
    :cond_3b
    move-object v12, v14

    .line 1736
    :cond_3c
    :goto_24
    add-int/lit8 v13, v13, 0x1

    .line 1737
    .line 1738
    const/4 v10, 0x0

    .line 1739
    goto :goto_23

    .line 1740
    :cond_3d
    move-object v11, v14

    .line 1741
    move-object v12, v11

    .line 1742
    :cond_3e
    if-nez v12, :cond_3f

    .line 1743
    .line 1744
    goto :goto_25

    .line 1745
    :cond_3f
    move-object v11, v12

    .line 1746
    :goto_25
    new-instance v4, Ljava/util/ArrayList;

    .line 1747
    .line 1748
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1749
    .line 1750
    .line 1751
    move-result v6

    .line 1752
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1753
    .line 1754
    .line 1755
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1756
    .line 1757
    .line 1758
    move-result v6

    .line 1759
    const/4 v10, 0x0

    .line 1760
    :goto_26
    if-ge v10, v6, :cond_41

    .line 1761
    .line 1762
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v12

    .line 1766
    move-object v13, v12

    .line 1767
    check-cast v13, La/atf0;

    .line 1768
    .line 1769
    iget-object v13, v13, La/atf0;->b:La/psq;

    .line 1770
    .line 1771
    invoke-static {v13, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1772
    .line 1773
    .line 1774
    move-result v13

    .line 1775
    if-eqz v13, :cond_40

    .line 1776
    .line 1777
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1778
    .line 1779
    .line 1780
    :cond_40
    add-int/lit8 v10, v10, 0x1

    .line 1781
    .line 1782
    goto :goto_26

    .line 1783
    :cond_41
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1784
    .line 1785
    .line 1786
    move-result v6

    .line 1787
    if-eqz v6, :cond_4b

    .line 1788
    .line 1789
    sget-object v4, La/psq;->c:La/psq;

    .line 1790
    .line 1791
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1792
    .line 1793
    .line 1794
    move-result v6

    .line 1795
    const/4 v10, 0x0

    .line 1796
    const/4 v11, 0x0

    .line 1797
    const/4 v12, 0x0

    .line 1798
    :goto_27
    if-ge v12, v6, :cond_48

    .line 1799
    .line 1800
    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v13

    .line 1804
    check-cast v13, La/atf0;

    .line 1805
    .line 1806
    iget-object v13, v13, La/atf0;->b:La/psq;

    .line 1807
    .line 1808
    if-eqz v4, :cond_42

    .line 1809
    .line 1810
    iget v14, v13, La/psq;->a:I

    .line 1811
    .line 1812
    iget v15, v4, La/psq;->a:I

    .line 1813
    .line 1814
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1815
    .line 1816
    .line 1817
    move-result v14

    .line 1818
    if-gez v14, :cond_42

    .line 1819
    .line 1820
    goto :goto_28

    .line 1821
    :cond_42
    iget v14, v13, La/psq;->a:I

    .line 1822
    .line 1823
    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1824
    .line 1825
    .line 1826
    move-result v15

    .line 1827
    if-gez v15, :cond_44

    .line 1828
    .line 1829
    if-eqz v10, :cond_43

    .line 1830
    .line 1831
    iget v15, v10, La/psq;->a:I

    .line 1832
    .line 1833
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1834
    .line 1835
    .line 1836
    move-result v14

    .line 1837
    if-lez v14, :cond_46

    .line 1838
    .line 1839
    :cond_43
    move-object v10, v13

    .line 1840
    goto :goto_28

    .line 1841
    :cond_44
    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1842
    .line 1843
    .line 1844
    move-result v15

    .line 1845
    if-lez v15, :cond_47

    .line 1846
    .line 1847
    if-eqz v11, :cond_45

    .line 1848
    .line 1849
    iget v15, v11, La/psq;->a:I

    .line 1850
    .line 1851
    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 1852
    .line 1853
    .line 1854
    move-result v14

    .line 1855
    if-gez v14, :cond_46

    .line 1856
    .line 1857
    :cond_45
    move-object v11, v13

    .line 1858
    :cond_46
    :goto_28
    add-int/lit8 v12, v12, 0x1

    .line 1859
    .line 1860
    goto :goto_27

    .line 1861
    :cond_47
    move-object v10, v13

    .line 1862
    move-object v11, v10

    .line 1863
    :cond_48
    if-nez v11, :cond_49

    .line 1864
    .line 1865
    goto :goto_29

    .line 1866
    :cond_49
    move-object v10, v11

    .line 1867
    :goto_29
    new-instance v9, Ljava/util/ArrayList;

    .line 1868
    .line 1869
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1870
    .line 1871
    .line 1872
    move-result v4

    .line 1873
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1874
    .line 1875
    .line 1876
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1877
    .line 1878
    .line 1879
    move-result v4

    .line 1880
    const/4 v6, 0x0

    .line 1881
    :goto_2a
    if-ge v6, v4, :cond_4c

    .line 1882
    .line 1883
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v11

    .line 1887
    move-object v12, v11

    .line 1888
    check-cast v12, La/atf0;

    .line 1889
    .line 1890
    iget-object v12, v12, La/atf0;->b:La/psq;

    .line 1891
    .line 1892
    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1893
    .line 1894
    .line 1895
    move-result v12

    .line 1896
    if-eqz v12, :cond_4a

    .line 1897
    .line 1898
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1899
    .line 1900
    .line 1901
    :cond_4a
    add-int/lit8 v6, v6, 0x1

    .line 1902
    .line 1903
    goto :goto_2a

    .line 1904
    :cond_4b
    move-object v9, v4

    .line 1905
    :cond_4c
    :goto_2b
    iget-object v3, v0, La/srq;->a:La/phf0;

    .line 1906
    .line 1907
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 1908
    .line 1909
    .line 1910
    move-result v4

    .line 1911
    if-lez v4, :cond_51

    .line 1912
    .line 1913
    const/4 v4, 0x0

    .line 1914
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v4

    .line 1918
    check-cast v4, La/atf0;

    .line 1919
    .line 1920
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1921
    .line 1922
    .line 1923
    iget-object v6, v3, La/phf0;->c:Ljava/lang/Object;

    .line 1924
    .line 1925
    check-cast v6, La/j6m0;

    .line 1926
    .line 1927
    monitor-enter v6

    .line 1928
    :try_start_0
    new-instance v9, La/l04;

    .line 1929
    .line 1930
    invoke-direct {v9, v4}, La/l04;-><init>(La/atf0;)V

    .line 1931
    .line 1932
    .line 1933
    iget-object v10, v3, La/phf0;->a:Ljava/lang/Object;

    .line 1934
    .line 1935
    check-cast v10, La/dj10;

    .line 1936
    .line 1937
    invoke-virtual {v10, v9}, La/dj10;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v10

    .line 1941
    check-cast v10, La/k04;

    .line 1942
    .line 1943
    if-nez v10, :cond_4d

    .line 1944
    .line 1945
    iget-object v10, v3, La/phf0;->b:Ljava/lang/Object;

    .line 1946
    .line 1947
    check-cast v10, La/hz40;

    .line 1948
    .line 1949
    invoke-virtual {v10, v9}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v9

    .line 1953
    move-object v10, v9

    .line 1954
    check-cast v10, La/k04;

    .line 1955
    .line 1956
    goto :goto_2c

    .line 1957
    :catchall_0
    move-exception v0

    .line 1958
    goto :goto_31

    .line 1959
    :cond_4d
    :goto_2c
    if-eqz v10, :cond_4e

    .line 1960
    .line 1961
    iget-object v3, v10, La/k04;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1962
    .line 1963
    monitor-exit v6

    .line 1964
    goto :goto_2f

    .line 1965
    :cond_4e
    monitor-exit v6

    .line 1966
    :try_start_1
    invoke-virtual {v8, v4}, La/hz2;->b(La/atf0;)Landroid/graphics/Typeface;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1970
    goto :goto_2d

    .line 1971
    :catch_0
    invoke-virtual {v2, v5}, La/g7p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v6

    .line 1975
    :goto_2d
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1976
    .line 1977
    .line 1978
    new-instance v9, La/l04;

    .line 1979
    .line 1980
    invoke-direct {v9, v4}, La/l04;-><init>(La/atf0;)V

    .line 1981
    .line 1982
    .line 1983
    iget-object v10, v3, La/phf0;->c:Ljava/lang/Object;

    .line 1984
    .line 1985
    check-cast v10, La/j6m0;

    .line 1986
    .line 1987
    monitor-enter v10

    .line 1988
    if-nez v6, :cond_4f

    .line 1989
    .line 1990
    :try_start_2
    iget-object v3, v3, La/phf0;->b:Ljava/lang/Object;

    .line 1991
    .line 1992
    check-cast v3, La/hz40;

    .line 1993
    .line 1994
    new-instance v11, La/k04;

    .line 1995
    .line 1996
    const/4 v12, 0x0

    .line 1997
    invoke-direct {v11, v12}, La/k04;-><init>(Ljava/lang/Object;)V

    .line 1998
    .line 1999
    .line 2000
    invoke-virtual {v3, v9, v11}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2001
    .line 2002
    .line 2003
    goto :goto_2e

    .line 2004
    :catchall_1
    move-exception v0

    .line 2005
    goto :goto_30

    .line 2006
    :cond_4f
    iget-object v3, v3, La/phf0;->a:Ljava/lang/Object;

    .line 2007
    .line 2008
    check-cast v3, La/dj10;

    .line 2009
    .line 2010
    new-instance v11, La/k04;

    .line 2011
    .line 2012
    invoke-direct {v11, v6}, La/k04;-><init>(Ljava/lang/Object;)V

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v3, v9, v11}, La/dj10;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2016
    .line 2017
    .line 2018
    :goto_2e
    monitor-exit v10

    .line 2019
    move-object v3, v6

    .line 2020
    :goto_2f
    if-nez v3, :cond_50

    .line 2021
    .line 2022
    invoke-virtual {v2, v5}, La/g7p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v3

    .line 2026
    :cond_50
    iget v2, v5, La/y0t0;->d:I

    .line 2027
    .line 2028
    iget-object v6, v5, La/y0t0;->b:La/psq;

    .line 2029
    .line 2030
    iget v9, v5, La/y0t0;->c:I

    .line 2031
    .line 2032
    invoke-static {v2, v3, v4, v6, v9}, La/n4c;->Q(ILjava/lang/Object;La/atf0;La/psq;I)Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v2

    .line 2036
    new-instance v3, Lkotlin/Pair;

    .line 2037
    .line 2038
    const/4 v12, 0x0

    .line 2039
    invoke-direct {v3, v12, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2040
    .line 2041
    .line 2042
    goto :goto_32

    .line 2043
    :goto_30
    monitor-exit v10

    .line 2044
    throw v0

    .line 2045
    :goto_31
    monitor-exit v6

    .line 2046
    throw v0

    .line 2047
    :cond_51
    invoke-virtual {v2, v5}, La/g7p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v2

    .line 2051
    new-instance v3, Lkotlin/Pair;

    .line 2052
    .line 2053
    const/4 v12, 0x0

    .line 2054
    invoke-direct {v3, v12, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2055
    .line 2056
    .line 2057
    :goto_32
    iget-object v2, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2058
    .line 2059
    check-cast v2, Ljava/util/List;

    .line 2060
    .line 2061
    iget-object v4, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2062
    .line 2063
    if-nez v2, :cond_52

    .line 2064
    .line 2065
    new-instance v0, La/a1t0;

    .line 2066
    .line 2067
    const/4 v9, 0x1

    .line 2068
    invoke-direct {v0, v4, v9}, La/a1t0;-><init>(Ljava/lang/Object;Z)V

    .line 2069
    .line 2070
    .line 2071
    move-object v3, v0

    .line 2072
    goto :goto_33

    .line 2073
    :cond_52
    move-object v3, v2

    .line 2074
    const/4 v9, 0x1

    .line 2075
    new-instance v2, La/xy3;

    .line 2076
    .line 2077
    iget-object v6, v0, La/srq;->a:La/phf0;

    .line 2078
    .line 2079
    invoke-direct/range {v2 .. v8}, La/xy3;-><init>(Ljava/util/List;Ljava/lang/Object;La/y0t0;La/phf0;Lkotlin/jvm/functions/Function1;La/hz2;)V

    .line 2080
    .line 2081
    .line 2082
    iget-object v0, v0, La/srq;->b:La/sje;

    .line 2083
    .line 2084
    sget-object v3, La/yne;->d:La/yne;

    .line 2085
    .line 2086
    new-instance v4, La/hij;

    .line 2087
    .line 2088
    const/16 v6, 0x1c

    .line 2089
    .line 2090
    const/4 v12, 0x0

    .line 2091
    invoke-direct {v4, v2, v12, v6}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 2092
    .line 2093
    .line 2094
    invoke-static {v0, v12, v3, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2095
    .line 2096
    .line 2097
    new-instance v3, La/z0t0;

    .line 2098
    .line 2099
    invoke-direct {v3, v2}, La/z0t0;-><init>(La/xy3;)V

    .line 2100
    .line 2101
    .line 2102
    :goto_33
    if-nez v3, :cond_57

    .line 2103
    .line 2104
    iget-object v0, v1, La/orq;->e:La/pv00;

    .line 2105
    .line 2106
    iget-object v0, v0, La/pv00;->a:Ljava/lang/Object;

    .line 2107
    .line 2108
    check-cast v0, La/uw90;

    .line 2109
    .line 2110
    iget-object v1, v5, La/y0t0;->a:La/nrq;

    .line 2111
    .line 2112
    iget v2, v5, La/y0t0;->c:I

    .line 2113
    .line 2114
    iget-object v3, v5, La/y0t0;->b:La/psq;

    .line 2115
    .line 2116
    if-eqz v1, :cond_56

    .line 2117
    .line 2118
    instance-of v4, v1, La/juj;

    .line 2119
    .line 2120
    if-eqz v4, :cond_53

    .line 2121
    .line 2122
    goto :goto_34

    .line 2123
    :cond_53
    instance-of v4, v1, La/vjt;

    .line 2124
    .line 2125
    if-eqz v4, :cond_54

    .line 2126
    .line 2127
    check-cast v1, La/vjt;

    .line 2128
    .line 2129
    invoke-interface {v0, v1, v3, v2}, La/uw90;->b(La/vjt;La/psq;I)Landroid/graphics/Typeface;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v0

    .line 2133
    goto :goto_35

    .line 2134
    :cond_54
    instance-of v0, v1, La/hq00;

    .line 2135
    .line 2136
    if-eqz v0, :cond_55

    .line 2137
    .line 2138
    check-cast v1, La/hq00;

    .line 2139
    .line 2140
    iget-object v0, v1, La/hq00;->f:La/r7v;

    .line 2141
    .line 2142
    iget-object v0, v0, La/r7v;->a:Ljava/lang/Object;

    .line 2143
    .line 2144
    check-cast v0, Landroid/graphics/Typeface;

    .line 2145
    .line 2146
    goto :goto_35

    .line 2147
    :cond_55
    const/4 v3, 0x0

    .line 2148
    goto :goto_36

    .line 2149
    :cond_56
    :goto_34
    invoke-interface {v0, v3, v2}, La/uw90;->c(La/psq;I)Landroid/graphics/Typeface;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v0

    .line 2153
    :goto_35
    new-instance v3, La/a1t0;

    .line 2154
    .line 2155
    const/4 v9, 0x1

    .line 2156
    invoke-direct {v3, v0, v9}, La/a1t0;-><init>(Ljava/lang/Object;Z)V

    .line 2157
    .line 2158
    .line 2159
    :goto_36
    if-eqz v3, :cond_58

    .line 2160
    .line 2161
    :cond_57
    move-object v12, v3

    .line 2162
    goto :goto_37

    .line 2163
    :cond_58
    const-string v0, "Could not load font"

    .line 2164
    .line 2165
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 2166
    .line 2167
    .line 2168
    const/4 v12, 0x0

    .line 2169
    :goto_37
    return-object v12

    .line 2170
    :pswitch_10
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2171
    .line 2172
    check-cast v1, La/gy40;

    .line 2173
    .line 2174
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2175
    .line 2176
    check-cast v0, La/nlx;

    .line 2177
    .line 2178
    move-object/from16 v2, p1

    .line 2179
    .line 2180
    check-cast v2, Ljava/lang/Throwable;

    .line 2181
    .line 2182
    invoke-virtual {v1, v0}, La/gy40;->b(La/nlx;)V

    .line 2183
    .line 2184
    .line 2185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2186
    .line 2187
    return-object v0

    .line 2188
    :pswitch_11
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2189
    .line 2190
    check-cast v1, La/typ;

    .line 2191
    .line 2192
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2193
    .line 2194
    check-cast v0, La/swp;

    .line 2195
    .line 2196
    move-object/from16 v2, p1

    .line 2197
    .line 2198
    check-cast v2, La/k0w0;

    .line 2199
    .line 2200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2201
    .line 2202
    .line 2203
    iget-object v1, v1, La/typ;->x:La/kys0;

    .line 2204
    .line 2205
    iget-object v8, v0, La/swp;->t:Ljava/lang/String;

    .line 2206
    .line 2207
    iget-wide v4, v0, La/swp;->a:J

    .line 2208
    .line 2209
    iget-wide v6, v0, La/swp;->b:J

    .line 2210
    .line 2211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2212
    .line 2213
    .line 2214
    new-instance v3, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 2215
    .line 2216
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;-><init>(JJLjava/lang/String;)V

    .line 2217
    .line 2218
    .line 2219
    invoke-virtual {v2, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2220
    .line 2221
    .line 2222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2223
    .line 2224
    return-object v0

    .line 2225
    :pswitch_12
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2226
    .line 2227
    check-cast v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 2228
    .line 2229
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2230
    .line 2231
    move-object v2, v0

    .line 2232
    check-cast v2, La/fpp;

    .line 2233
    .line 2234
    move-object/from16 v0, p1

    .line 2235
    .line 2236
    check-cast v0, Ljava/util/Set;

    .line 2237
    .line 2238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2239
    .line 2240
    .line 2241
    iget-boolean v1, v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;->a:Z

    .line 2242
    .line 2243
    new-instance v8, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 2244
    .line 2245
    invoke-direct {v8, v0, v1}, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;-><init>(Ljava/util/Set;Z)V

    .line 2246
    .line 2247
    .line 2248
    iget-object v0, v2, La/fpp;->o:La/vzg0;

    .line 2249
    .line 2250
    const-string v1, "SELECTION_STATE_KEY"

    .line 2251
    .line 2252
    invoke-virtual {v0, v1, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2253
    .line 2254
    .line 2255
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 2256
    .line 2257
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 2258
    .line 2259
    :cond_59
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2264
    .line 2265
    .line 2266
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 2267
    .line 2268
    move-object v4, v3

    .line 2269
    move-object v3, v0

    .line 2270
    check-cast v3, La/ngl0;

    .line 2271
    .line 2272
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2273
    .line 2274
    .line 2275
    const/4 v12, 0x0

    .line 2276
    const/16 v13, 0x1fdf

    .line 2277
    .line 2278
    const/4 v4, 0x0

    .line 2279
    const/4 v5, 0x0

    .line 2280
    const/4 v6, 0x0

    .line 2281
    const/4 v7, 0x0

    .line 2282
    const/4 v9, 0x0

    .line 2283
    const/4 v10, 0x0

    .line 2284
    const/4 v11, 0x0

    .line 2285
    invoke-static/range {v3 .. v13}, La/ngl0;->a(La/ngl0;Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/mgl0;Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;ZZZZI)La/ngl0;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v3

    .line 2289
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2290
    .line 2291
    .line 2292
    move-result v0

    .line 2293
    if-eqz v0, :cond_59

    .line 2294
    .line 2295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2296
    .line 2297
    return-object v0

    .line 2298
    :pswitch_13
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2299
    .line 2300
    check-cast v1, La/nnp;

    .line 2301
    .line 2302
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2303
    .line 2304
    check-cast v0, La/ygs;

    .line 2305
    .line 2306
    move-object/from16 v2, p1

    .line 2307
    .line 2308
    check-cast v2, La/k0w0;

    .line 2309
    .line 2310
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2311
    .line 2312
    .line 2313
    new-instance v3, La/ffd;

    .line 2314
    .line 2315
    const/4 v12, 0x0

    .line 2316
    invoke-direct {v3, v1, v0, v12, v6}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2317
    .line 2318
    .line 2319
    new-instance v0, La/b1w0;

    .line 2320
    .line 2321
    invoke-direct {v0, v3}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 2322
    .line 2323
    .line 2324
    invoke-virtual {v2, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v0

    .line 2328
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 2329
    .line 2330
    check-cast v0, La/c8d;

    .line 2331
    .line 2332
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 2333
    .line 2334
    new-instance v2, La/v7d;

    .line 2335
    .line 2336
    const/4 v9, 0x1

    .line 2337
    invoke-direct {v2, v9, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 2338
    .line 2339
    .line 2340
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 2341
    .line 2342
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2343
    .line 2344
    return-object v0

    .line 2345
    :pswitch_14
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2346
    .line 2347
    check-cast v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 2348
    .line 2349
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2350
    .line 2351
    move-object v2, v0

    .line 2352
    check-cast v2, La/nnp;

    .line 2353
    .line 2354
    move-object/from16 v0, p1

    .line 2355
    .line 2356
    check-cast v0, Ljava/util/Set;

    .line 2357
    .line 2358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2359
    .line 2360
    .line 2361
    invoke-static {v1, v0}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->a(Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;Ljava/util/Set;)Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v8

    .line 2365
    iget-object v0, v2, La/nnp;->o:La/vzg0;

    .line 2366
    .line 2367
    const-string v1, "SELECTION_STATE_KEY"

    .line 2368
    .line 2369
    invoke-virtual {v0, v1, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2370
    .line 2371
    .line 2372
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 2373
    .line 2374
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 2375
    .line 2376
    :cond_5a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v0

    .line 2380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2381
    .line 2382
    .line 2383
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 2384
    .line 2385
    move-object v4, v3

    .line 2386
    move-object v3, v0

    .line 2387
    check-cast v3, La/xmp;

    .line 2388
    .line 2389
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2390
    .line 2391
    .line 2392
    const/4 v14, 0x0

    .line 2393
    const/16 v15, 0x3fef

    .line 2394
    .line 2395
    const/4 v4, 0x0

    .line 2396
    const/4 v5, 0x0

    .line 2397
    const/4 v6, 0x0

    .line 2398
    const/4 v7, 0x0

    .line 2399
    const/4 v9, 0x0

    .line 2400
    const/4 v10, 0x0

    .line 2401
    const/4 v11, 0x0

    .line 2402
    const/4 v12, 0x0

    .line 2403
    const/4 v13, 0x0

    .line 2404
    invoke-static/range {v3 .. v15}, La/xmp;->a(La/xmp;La/jnb;La/rlp;Ljava/lang/String;Ljava/util/LinkedHashSet;Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZZLjava/util/List;ZLa/zmb;ZI)La/xmp;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v3

    .line 2408
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2409
    .line 2410
    .line 2411
    move-result v0

    .line 2412
    if-eqz v0, :cond_5a

    .line 2413
    .line 2414
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2415
    .line 2416
    return-object v0

    .line 2417
    :pswitch_15
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2418
    .line 2419
    check-cast v1, La/jg60;

    .line 2420
    .line 2421
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2422
    .line 2423
    check-cast v0, La/kfp;

    .line 2424
    .line 2425
    move-object/from16 v2, p1

    .line 2426
    .line 2427
    check-cast v2, La/ilz;

    .line 2428
    .line 2429
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2430
    .line 2431
    .line 2432
    invoke-virtual {v1, v0}, La/jg60;->b(La/eg60;)V

    .line 2433
    .line 2434
    .line 2435
    new-instance v1, La/zhd;

    .line 2436
    .line 2437
    const/4 v9, 0x1

    .line 2438
    invoke-direct {v1, v2, v0, v9}, La/zhd;-><init>(La/ilz;Ljava/lang/Object;B)V

    .line 2439
    .line 2440
    .line 2441
    return-object v1

    .line 2442
    :pswitch_16
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2443
    .line 2444
    check-cast v1, La/bep;

    .line 2445
    .line 2446
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2447
    .line 2448
    check-cast v0, La/mlr;

    .line 2449
    .line 2450
    move-object/from16 v2, p1

    .line 2451
    .line 2452
    check-cast v2, La/k0w0;

    .line 2453
    .line 2454
    iget-object v3, v1, La/bep;->o:La/jdk0;

    .line 2455
    .line 2456
    iget-wide v4, v0, La/mlr;->a:J

    .line 2457
    .line 2458
    iget-object v6, v0, La/mlr;->f:Ljava/lang/String;

    .line 2459
    .line 2460
    iget-wide v7, v0, La/mlr;->c:J

    .line 2461
    .line 2462
    iget-boolean v9, v0, La/mlr;->l:Z

    .line 2463
    .line 2464
    iget-wide v10, v0, La/mlr;->b:J

    .line 2465
    .line 2466
    iget-boolean v12, v0, La/mlr;->m:Z

    .line 2467
    .line 2468
    iget-boolean v13, v0, La/mlr;->n:Z

    .line 2469
    .line 2470
    invoke-virtual {v1, v0}, La/bep;->M(La/mlr;)Ljava/lang/String;

    .line 2471
    .line 2472
    .line 2473
    move-result-object v31

    .line 2474
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2475
    .line 2476
    .line 2477
    const/16 v26, 0x0

    .line 2478
    .line 2479
    const/16 v27, 0x2009

    .line 2480
    .line 2481
    const/16 v29, 0x0

    .line 2482
    .line 2483
    const/16 v30, 0x0

    .line 2484
    .line 2485
    const/16 v32, 0x1

    .line 2486
    .line 2487
    move-wide/from16 v17, v4

    .line 2488
    .line 2489
    move-object/from16 v19, v6

    .line 2490
    .line 2491
    move-wide/from16 v20, v7

    .line 2492
    .line 2493
    move/from16 v22, v9

    .line 2494
    .line 2495
    move-wide/from16 v23, v10

    .line 2496
    .line 2497
    move/from16 v25, v12

    .line 2498
    .line 2499
    move/from16 v28, v13

    .line 2500
    .line 2501
    invoke-static/range {v17 .. v32}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v1

    .line 2505
    invoke-virtual {v2, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v1

    .line 2509
    iget-object v1, v1, La/ikt0;->a:Ljava/lang/Object;

    .line 2510
    .line 2511
    check-cast v1, La/c8d;

    .line 2512
    .line 2513
    sget-object v2, La/cfx0;->o:La/bjk;

    .line 2514
    .line 2515
    iget-boolean v0, v0, La/mlr;->n:Z

    .line 2516
    .line 2517
    const/16 v16, 0x1

    .line 2518
    .line 2519
    xor-int/lit8 v0, v0, 0x1

    .line 2520
    .line 2521
    new-instance v3, La/v7d;

    .line 2522
    .line 2523
    invoke-direct {v3, v0, v2, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 2524
    .line 2525
    .line 2526
    iput-object v3, v1, La/c8d;->a:La/w7d;

    .line 2527
    .line 2528
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2529
    .line 2530
    return-object v0

    .line 2531
    :pswitch_17
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2532
    .line 2533
    check-cast v1, La/sdp;

    .line 2534
    .line 2535
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2536
    .line 2537
    check-cast v0, La/pz40;

    .line 2538
    .line 2539
    move-object/from16 v2, p1

    .line 2540
    .line 2541
    check-cast v2, La/iz3;

    .line 2542
    .line 2543
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2544
    .line 2545
    .line 2546
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2547
    .line 2548
    .line 2549
    move-result-object v2

    .line 2550
    check-cast v2, Ljava/lang/String;

    .line 2551
    .line 2552
    iget-object v3, v1, La/sdp;->c:Ljava/lang/String;

    .line 2553
    .line 2554
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2555
    .line 2556
    .line 2557
    move-result v2

    .line 2558
    if-nez v2, :cond_5b

    .line 2559
    .line 2560
    iget-object v1, v1, La/sdp;->c:Ljava/lang/String;

    .line 2561
    .line 2562
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2563
    .line 2564
    .line 2565
    :cond_5b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2566
    .line 2567
    return-object v0

    .line 2568
    :pswitch_18
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2569
    .line 2570
    check-cast v1, La/ccp;

    .line 2571
    .line 2572
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2573
    .line 2574
    check-cast v0, La/mlr;

    .line 2575
    .line 2576
    move-object/from16 v2, p1

    .line 2577
    .line 2578
    check-cast v2, La/k0w0;

    .line 2579
    .line 2580
    iget-object v3, v1, La/ccp;->p:La/jdk0;

    .line 2581
    .line 2582
    iget-wide v4, v0, La/mlr;->a:J

    .line 2583
    .line 2584
    iget-object v6, v0, La/mlr;->f:Ljava/lang/String;

    .line 2585
    .line 2586
    iget-wide v7, v0, La/mlr;->c:J

    .line 2587
    .line 2588
    iget-boolean v9, v0, La/mlr;->l:Z

    .line 2589
    .line 2590
    iget-wide v10, v0, La/mlr;->b:J

    .line 2591
    .line 2592
    iget-boolean v12, v0, La/mlr;->m:Z

    .line 2593
    .line 2594
    iget-boolean v13, v0, La/mlr;->n:Z

    .line 2595
    .line 2596
    invoke-virtual {v1, v0}, La/ccp;->N(La/mlr;)Ljava/lang/String;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v31

    .line 2600
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2601
    .line 2602
    .line 2603
    const/16 v26, 0x0

    .line 2604
    .line 2605
    const/16 v27, 0x2009

    .line 2606
    .line 2607
    const/16 v29, 0x0

    .line 2608
    .line 2609
    const/16 v30, 0x0

    .line 2610
    .line 2611
    const/16 v32, 0x1

    .line 2612
    .line 2613
    move-wide/from16 v17, v4

    .line 2614
    .line 2615
    move-object/from16 v19, v6

    .line 2616
    .line 2617
    move-wide/from16 v20, v7

    .line 2618
    .line 2619
    move/from16 v22, v9

    .line 2620
    .line 2621
    move-wide/from16 v23, v10

    .line 2622
    .line 2623
    move/from16 v25, v12

    .line 2624
    .line 2625
    move/from16 v28, v13

    .line 2626
    .line 2627
    invoke-static/range {v17 .. v32}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 2628
    .line 2629
    .line 2630
    move-result-object v1

    .line 2631
    invoke-virtual {v2, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2632
    .line 2633
    .line 2634
    move-result-object v1

    .line 2635
    iget-object v1, v1, La/ikt0;->a:Ljava/lang/Object;

    .line 2636
    .line 2637
    check-cast v1, La/c8d;

    .line 2638
    .line 2639
    sget-object v2, La/cfx0;->o:La/bjk;

    .line 2640
    .line 2641
    iget-boolean v0, v0, La/mlr;->n:Z

    .line 2642
    .line 2643
    const/16 v16, 0x1

    .line 2644
    .line 2645
    xor-int/lit8 v0, v0, 0x1

    .line 2646
    .line 2647
    new-instance v3, La/v7d;

    .line 2648
    .line 2649
    invoke-direct {v3, v0, v2, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 2650
    .line 2651
    .line 2652
    iput-object v3, v1, La/c8d;->a:La/w7d;

    .line 2653
    .line 2654
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2655
    .line 2656
    return-object v0

    .line 2657
    :pswitch_19
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2658
    .line 2659
    check-cast v1, La/k6p;

    .line 2660
    .line 2661
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2662
    .line 2663
    check-cast v0, La/z5p;

    .line 2664
    .line 2665
    move-object/from16 v2, p1

    .line 2666
    .line 2667
    check-cast v2, La/k0w0;

    .line 2668
    .line 2669
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2670
    .line 2671
    .line 2672
    iget-object v1, v1, La/k6p;->j:La/ifp;

    .line 2673
    .line 2674
    new-instance v3, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;

    .line 2675
    .line 2676
    iget-wide v4, v0, La/z5p;->a:J

    .line 2677
    .line 2678
    iget-object v0, v0, La/z5p;->e:Ljava/lang/String;

    .line 2679
    .line 2680
    invoke-direct {v3, v4, v5, v0}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;-><init>(JLjava/lang/String;)V

    .line 2681
    .line 2682
    .line 2683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2684
    .line 2685
    .line 2686
    new-instance v0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 2687
    .line 2688
    invoke-direct {v0, v1, v3}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 2689
    .line 2690
    .line 2691
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2692
    .line 2693
    .line 2694
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2695
    .line 2696
    return-object v0

    .line 2697
    :pswitch_1a
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2698
    .line 2699
    check-cast v1, La/k4p;

    .line 2700
    .line 2701
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2702
    .line 2703
    check-cast v0, La/cp;

    .line 2704
    .line 2705
    move-object/from16 v2, p1

    .line 2706
    .line 2707
    check-cast v2, Landroid/view/View;

    .line 2708
    .line 2709
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2710
    .line 2711
    .line 2712
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2713
    .line 2714
    .line 2715
    move-result-object v0

    .line 2716
    invoke-virtual {v1, v0}, La/k4p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2717
    .line 2718
    .line 2719
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2720
    .line 2721
    return-object v0

    .line 2722
    :pswitch_1b
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2723
    .line 2724
    check-cast v1, La/k4p;

    .line 2725
    .line 2726
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2727
    .line 2728
    check-cast v0, La/k4p;

    .line 2729
    .line 2730
    move-object/from16 v3, p1

    .line 2731
    .line 2732
    check-cast v3, La/cp;

    .line 2733
    .line 2734
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2735
    .line 2736
    .line 2737
    iget-object v4, v3, La/cp;->u:La/yfu0;

    .line 2738
    .line 2739
    check-cast v4, La/f2k;

    .line 2740
    .line 2741
    iget-object v5, v4, La/f2k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 2742
    .line 2743
    new-instance v6, La/wg;

    .line 2744
    .line 2745
    const/16 v7, 0x14

    .line 2746
    .line 2747
    invoke-direct {v6, v1, v3, v7}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2748
    .line 2749
    .line 2750
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setActionIconClickListener(Landroid/view/View$OnClickListener;)V

    .line 2751
    .line 2752
    .line 2753
    iget-object v1, v3, La/xhe0;->a:Landroid/view/View;

    .line 2754
    .line 2755
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2756
    .line 2757
    .line 2758
    new-instance v5, La/f5p;

    .line 2759
    .line 2760
    invoke-direct {v5, v0, v3, v2}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2761
    .line 2762
    .line 2763
    invoke-static {v1, v5}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 2764
    .line 2765
    .line 2766
    iget-object v0, v4, La/f2k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 2767
    .line 2768
    const/4 v9, 0x1

    .line 2769
    invoke-virtual {v0, v9}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setFavoriteIcon(Z)V

    .line 2770
    .line 2771
    .line 2772
    new-instance v0, La/kgh;

    .line 2773
    .line 2774
    const/16 v1, 0x11

    .line 2775
    .line 2776
    invoke-direct {v0, v3, v1}, La/kgh;-><init>(La/cp;B)V

    .line 2777
    .line 2778
    .line 2779
    invoke-virtual {v3, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 2780
    .line 2781
    .line 2782
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2783
    .line 2784
    return-object v0

    .line 2785
    :pswitch_1c
    iget-object v1, v0, La/f5p;->b:Ljava/lang/Object;

    .line 2786
    .line 2787
    check-cast v1, La/t2f;

    .line 2788
    .line 2789
    iget-object v0, v0, La/f5p;->c:Ljava/lang/Object;

    .line 2790
    .line 2791
    move-object/from16 v17, v0

    .line 2792
    .line 2793
    check-cast v17, La/g2v;

    .line 2794
    .line 2795
    move-object/from16 v0, p1

    .line 2796
    .line 2797
    check-cast v0, La/f4p;

    .line 2798
    .line 2799
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2800
    .line 2801
    .line 2802
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2803
    .line 2804
    .line 2805
    move-result v0

    .line 2806
    if-eqz v0, :cond_60

    .line 2807
    .line 2808
    const/4 v9, 0x1

    .line 2809
    if-eq v0, v9, :cond_5f

    .line 2810
    .line 2811
    if-eq v0, v2, :cond_5e

    .line 2812
    .line 2813
    if-eq v0, v5, :cond_5d

    .line 2814
    .line 2815
    const/4 v1, 0x4

    .line 2816
    if-ne v0, v1, :cond_5c

    .line 2817
    .line 2818
    sget-object v18, La/pb10;->e:La/pb10;

    .line 2819
    .line 2820
    const-wide/16 v28, 0x0

    .line 2821
    .line 2822
    const/16 v30, 0x3de

    .line 2823
    .line 2824
    const/16 v19, 0x0

    .line 2825
    .line 2826
    const/16 v20, 0x0

    .line 2827
    .line 2828
    const/16 v21, 0x0

    .line 2829
    .line 2830
    const/16 v22, 0x0

    .line 2831
    .line 2832
    const v23, 0x7f130e37

    .line 2833
    .line 2834
    .line 2835
    const/16 v24, 0x0

    .line 2836
    .line 2837
    const/16 v25, 0x0

    .line 2838
    .line 2839
    const-wide/16 v26, 0x0

    .line 2840
    .line 2841
    invoke-static/range {v17 .. v30}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 2842
    .line 2843
    .line 2844
    move-result-object v12

    .line 2845
    goto :goto_38

    .line 2846
    :cond_5c
    invoke-static {}, La/t9f;->b()V

    .line 2847
    .line 2848
    .line 2849
    goto :goto_38

    .line 2850
    :cond_5d
    sget-object v18, La/pb10;->g:La/pb10;

    .line 2851
    .line 2852
    const-wide/16 v28, 0x0

    .line 2853
    .line 2854
    const/16 v30, 0x25e

    .line 2855
    .line 2856
    const/16 v19, 0x0

    .line 2857
    .line 2858
    const/16 v20, 0x0

    .line 2859
    .line 2860
    const/16 v21, 0x0

    .line 2861
    .line 2862
    const/16 v22, 0x0

    .line 2863
    .line 2864
    const v23, 0x7f1305c0

    .line 2865
    .line 2866
    .line 2867
    const/16 v24, 0x0

    .line 2868
    .line 2869
    const v25, 0x7f131111

    .line 2870
    .line 2871
    .line 2872
    const-wide/16 v26, 0x2710

    .line 2873
    .line 2874
    invoke-static/range {v17 .. v30}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v12

    .line 2878
    goto :goto_38

    .line 2879
    :cond_5e
    iget-object v0, v1, La/t2f;->d:La/n0o0;

    .line 2880
    .line 2881
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v0

    .line 2885
    check-cast v0, La/fee;

    .line 2886
    .line 2887
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v0

    .line 2891
    move-object v12, v0

    .line 2892
    check-cast v12, La/mdm;

    .line 2893
    .line 2894
    goto :goto_38

    .line 2895
    :cond_5f
    sget-object v18, La/pb10;->g:La/pb10;

    .line 2896
    .line 2897
    const-wide/16 v28, 0x0

    .line 2898
    .line 2899
    const/16 v30, 0x25e

    .line 2900
    .line 2901
    const/16 v19, 0x0

    .line 2902
    .line 2903
    const/16 v20, 0x0

    .line 2904
    .line 2905
    const/16 v21, 0x0

    .line 2906
    .line 2907
    const/16 v22, 0x0

    .line 2908
    .line 2909
    const v23, 0x7f130677

    .line 2910
    .line 2911
    .line 2912
    const/16 v24, 0x0

    .line 2913
    .line 2914
    const v25, 0x7f131690

    .line 2915
    .line 2916
    .line 2917
    const-wide/16 v26, 0x2710

    .line 2918
    .line 2919
    invoke-static/range {v17 .. v30}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 2920
    .line 2921
    .line 2922
    move-result-object v12

    .line 2923
    :cond_60
    :goto_38
    return-object v12

    .line 2924
    nop

    .line 2925
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
