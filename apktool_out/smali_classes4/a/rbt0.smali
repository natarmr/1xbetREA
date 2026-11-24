.class public final synthetic La/rbt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rbt0;->a:B

    iput-object p1, p0, La/rbt0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/rbt0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const-string v4, "viewModelFactory"

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object p0, p0, La/rbt0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/ulv0;

    .line 15
    .line 16
    sget-object v0, La/ulv0;->R1:La/uxs0;

    .line 17
    .line 18
    iget-object p0, p0, La/ulv0;->P1:La/fiu0;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v5

    .line 27
    :pswitch_0
    check-cast p0, La/trm0;

    .line 28
    .line 29
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/gii0;

    .line 32
    .line 33
    const-class v0, La/okv0;

    .line 34
    .line 35
    sget-object v1, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/okv0;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p0, La/qdv0;

    .line 49
    .line 50
    new-instance v0, La/u6n;

    .line 51
    .line 52
    sget-object v1, La/d4d;->Q1:La/d4d;

    .line 53
    .line 54
    sget-object v2, La/w6n;->f:La/w6n;

    .line 55
    .line 56
    new-instance v3, La/c280;

    .line 57
    .line 58
    iget-object p0, p0, La/qdv0;->a:Ljava/lang/String;

    .line 59
    .line 60
    const v4, 0x7f0809ae

    .line 61
    .line 62
    .line 63
    invoke-direct {v3, p0, v4}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1, v2, v3}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_2
    check-cast p0, La/ocv0;

    .line 71
    .line 72
    sget-object v0, La/ccv0;->Q1:La/uxs0;

    .line 73
    .line 74
    iget-object p0, p0, La/ocv0;->b:La/oxh0;

    .line 75
    .line 76
    iget p0, p0, La/oxh0;->a:I

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    check-cast p0, La/m6v0;

    .line 84
    .line 85
    iget-object p0, p0, La/m6v0;->a:La/gii0;

    .line 86
    .line 87
    const-class v0, La/e7v0;

    .line 88
    .line 89
    sget-object v1, La/sre0;->a:La/tre0;

    .line 90
    .line 91
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/e7v0;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_4
    check-cast p0, La/hcp0;

    .line 103
    .line 104
    iget-object p0, p0, La/hcp0;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, La/gii0;

    .line 107
    .line 108
    const-class v0, La/t4v0;

    .line 109
    .line 110
    sget-object v1, La/sre0;->a:La/tre0;

    .line 111
    .line 112
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, La/t4v0;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_5
    check-cast p0, La/c4v0;

    .line 124
    .line 125
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    new-instance v7, La/x3v0;

    .line 130
    .line 131
    invoke-direct {v7, p0, v3}, La/x3v0;-><init>(La/c4v0;B)V

    .line 132
    .line 133
    .line 134
    new-instance v10, La/n7t0;

    .line 135
    .line 136
    const/16 v0, 0xd

    .line 137
    .line 138
    invoke-direct {v10, p0, v5, v0}, La/n7t0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 139
    .line 140
    .line 141
    const/16 v11, 0xe

    .line 142
    .line 143
    const/4 v8, 0x0

    .line 144
    const/4 v9, 0x0

    .line 145
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 146
    .line 147
    .line 148
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_6
    check-cast p0, La/u3v0;

    .line 152
    .line 153
    sget-object v0, La/u3v0;->P1:La/kys0;

    .line 154
    .line 155
    new-instance v0, La/ry3;

    .line 156
    .line 157
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget-object p0, p0, La/u3v0;->K1:La/lzi;

    .line 162
    .line 163
    if-eqz p0, :cond_1

    .line 164
    .line 165
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v5

    .line 173
    :pswitch_7
    check-cast p0, La/w1v0;

    .line 174
    .line 175
    sget-object v0, La/w1v0;->j2:La/bzs0;

    .line 176
    .line 177
    new-instance v0, La/ko60;

    .line 178
    .line 179
    const/16 v1, 0xc

    .line 180
    .line 181
    invoke-direct {v0, p0, v1}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 182
    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_8
    check-cast p0, La/eqx;

    .line 186
    .line 187
    new-instance v0, La/j0v0;

    .line 188
    .line 189
    iget-object p0, p0, La/eqx;->a:La/b3c0;

    .line 190
    .line 191
    invoke-virtual {p0}, La/b3c0;->c()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    sget-object v5, La/iun;->a:La/iun;

    .line 196
    .line 197
    sget-object v6, La/lun;->a:La/lun;

    .line 198
    .line 199
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const-wide/16 v10, 0x0

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v1, 0x0

    .line 206
    const/4 v2, 0x0

    .line 207
    const/4 v4, 0x0

    .line 208
    const/4 v7, 0x0

    .line 209
    const/4 v8, 0x0

    .line 210
    const/4 v9, 0x0

    .line 211
    invoke-direct/range {v0 .. v12}, La/j0v0;-><init>(ZZZZLjava/util/List;Ljava/util/Map;La/ql5;La/ql5;La/ql5;JZ)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_9
    check-cast p0, La/okt0;

    .line 216
    .line 217
    iget-object p0, p0, La/okt0;->a:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p0, La/gii0;

    .line 220
    .line 221
    const-class v0, La/qyu0;

    .line 222
    .line 223
    sget-object v1, La/sre0;->a:La/tre0;

    .line 224
    .line 225
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, La/qyu0;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_a
    check-cast p0, La/trm0;

    .line 237
    .line 238
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, La/gii0;

    .line 241
    .line 242
    const-class v0, La/iwu0;

    .line 243
    .line 244
    sget-object v1, La/sre0;->a:La/tre0;

    .line 245
    .line 246
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, La/iwu0;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_b
    move-object v2, p0

    .line 258
    check-cast v2, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 259
    .line 260
    new-instance v0, La/wtu0;

    .line 261
    .line 262
    sget-object p0, La/xtu0;->c:La/xtu0;

    .line 263
    .line 264
    const-wide/16 v3, 0x1

    .line 265
    .line 266
    const/4 v5, 0x0

    .line 267
    const/4 v1, 0x1

    .line 268
    invoke-direct/range {v0 .. v5}, La/wtu0;-><init>(ZLorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;JLa/j0g0;)V

    .line 269
    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_c
    check-cast p0, La/rsu0;

    .line 273
    .line 274
    sget-object v0, La/rsu0;->O1:La/sxs0;

    .line 275
    .line 276
    iget-object p0, p0, La/rsu0;->L1:La/fiu0;

    .line 277
    .line 278
    if-eqz p0, :cond_2

    .line 279
    .line 280
    return-object p0

    .line 281
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v5

    .line 285
    :pswitch_d
    check-cast p0, La/hsu0;

    .line 286
    .line 287
    sget-object v0, La/hsu0;->O1:La/svs0;

    .line 288
    .line 289
    new-instance v0, La/tio0;

    .line 290
    .line 291
    new-instance v4, La/fsu0;

    .line 292
    .line 293
    invoke-direct {v4, p0, v2}, La/fsu0;-><init>(La/hsu0;B)V

    .line 294
    .line 295
    .line 296
    new-instance v2, La/fsu0;

    .line 297
    .line 298
    invoke-direct {v2, p0, v3}, La/fsu0;-><init>(La/hsu0;B)V

    .line 299
    .line 300
    .line 301
    new-instance v3, La/fsu0;

    .line 302
    .line 303
    invoke-direct {v3, p0, v1}, La/fsu0;-><init>(La/hsu0;B)V

    .line 304
    .line 305
    .line 306
    sget-object p0, La/ek5;->h:La/ek5;

    .line 307
    .line 308
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 309
    .line 310
    .line 311
    new-instance p0, La/b4u0;

    .line 312
    .line 313
    const/16 v1, 0x15

    .line 314
    .line 315
    invoke-direct {p0, v1}, La/b4u0;-><init>(B)V

    .line 316
    .line 317
    .line 318
    new-instance v1, La/sbt0;

    .line 319
    .line 320
    const/16 v5, 0x1a

    .line 321
    .line 322
    invoke-direct {v1, v2, v5}, La/sbt0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 323
    .line 324
    .line 325
    new-instance v2, La/d8q0;

    .line 326
    .line 327
    const/4 v5, 0x3

    .line 328
    const/16 v6, 0x18

    .line 329
    .line 330
    invoke-direct {v2, v5, v6}, La/d8q0;-><init>(IB)V

    .line 331
    .line 332
    .line 333
    sget-object v5, La/mnu0;->c:La/mnu0;

    .line 334
    .line 335
    new-instance v6, La/gbn;

    .line 336
    .line 337
    invoke-direct {v6, p0, v2, v1, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 338
    .line 339
    .line 340
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 341
    .line 342
    invoke-virtual {p0, v6}, La/dp;->b(La/gbn;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v4}, La/ycm0;->r(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-virtual {p0, v1}, La/dp;->b(La/gbn;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v3}, La/p8a;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {p0, v1}, La/dp;->b(La/gbn;)V

    .line 357
    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_e
    check-cast p0, La/xru0;

    .line 361
    .line 362
    sget-object v0, La/xru0;->O1:La/kys0;

    .line 363
    .line 364
    new-instance v0, La/uru0;

    .line 365
    .line 366
    new-instance v4, La/vru0;

    .line 367
    .line 368
    invoke-direct {v4, p0, v2}, La/vru0;-><init>(La/xru0;B)V

    .line 369
    .line 370
    .line 371
    new-instance v2, La/vru0;

    .line 372
    .line 373
    invoke-direct {v2, p0, v3}, La/vru0;-><init>(La/xru0;B)V

    .line 374
    .line 375
    .line 376
    new-instance v3, La/vru0;

    .line 377
    .line 378
    invoke-direct {v3, p0, v1}, La/vru0;-><init>(La/xru0;B)V

    .line 379
    .line 380
    .line 381
    sget-object p0, La/ek5;->h:La/ek5;

    .line 382
    .line 383
    invoke-direct {v0, p0}, La/qv5;-><init>(La/dtb;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v2}, La/ihm0;->m(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    iget-object v1, v0, La/zz3;->d:La/dp;

    .line 391
    .line 392
    invoke-virtual {v1, p0}, La/dp;->b(La/gbn;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v4}, La/ycm0;->r(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-virtual {v1, p0}, La/dp;->b(La/gbn;)V

    .line 400
    .line 401
    .line 402
    invoke-static {v3}, La/p8a;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-virtual {v1, p0}, La/dp;->b(La/gbn;)V

    .line 407
    .line 408
    .line 409
    return-object v0

    .line 410
    :pswitch_f
    check-cast p0, La/bru0;

    .line 411
    .line 412
    check-cast p0, La/aru0;

    .line 413
    .line 414
    iget-object p0, p0, La/aru0;->a:La/mdm;

    .line 415
    .line 416
    return-object p0

    .line 417
    :pswitch_10
    check-cast p0, La/gou0;

    .line 418
    .line 419
    check-cast p0, La/fou0;

    .line 420
    .line 421
    iget-object p0, p0, La/fou0;->a:La/mdm;

    .line 422
    .line 423
    return-object p0

    .line 424
    :pswitch_11
    check-cast p0, La/xiu0;

    .line 425
    .line 426
    iget-object v0, p0, La/xiu0;->a:La/piu0;

    .line 427
    .line 428
    if-eqz v0, :cond_4

    .line 429
    .line 430
    iget-object p0, p0, La/xiu0;->b:Ljava/lang/Long;

    .line 431
    .line 432
    iget-object v0, v0, La/piu0;->a:Ljava/util/LinkedHashMap;

    .line 433
    .line 434
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    if-nez v1, :cond_3

    .line 439
    .line 440
    new-instance v1, La/wiu0;

    .line 441
    .line 442
    invoke-direct {v1}, La/wiu0;-><init>()V

    .line 443
    .line 444
    .line 445
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    :cond_3
    check-cast v1, La/diu0;

    .line 449
    .line 450
    check-cast v1, La/wiu0;

    .line 451
    .line 452
    goto :goto_0

    .line 453
    :cond_4
    new-instance v1, La/wiu0;

    .line 454
    .line 455
    invoke-direct {v1}, La/wiu0;-><init>()V

    .line 456
    .line 457
    .line 458
    :goto_0
    return-object v1

    .line 459
    :pswitch_12
    check-cast p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;

    .line 460
    .line 461
    new-instance v0, La/yoe;

    .line 462
    .line 463
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 464
    .line 465
    invoke-direct {v0, p0, v5}, La/yoe;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 466
    .line 467
    .line 468
    return-object v0

    .line 469
    :pswitch_13
    check-cast p0, La/sbu0;

    .line 470
    .line 471
    iget v0, p0, La/sbu0;->a:I

    .line 472
    .line 473
    int-to-long v0, v0

    .line 474
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    const/16 v1, 0x20

    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    iget v2, p0, La/sbu0;->b:I

    .line 485
    .line 486
    int-to-long v2, v2

    .line 487
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    iget p0, p0, La/sbu0;->c:I

    .line 500
    .line 501
    int-to-long v1, p0

    .line 502
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    return-object p0

    .line 511
    :pswitch_14
    check-cast p0, La/w7u0;

    .line 512
    .line 513
    sget-object v0, La/w7u0;->e2:La/svs0;

    .line 514
    .line 515
    new-instance v0, La/ry3;

    .line 516
    .line 517
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    iget-object p0, p0, La/w7u0;->c2:La/vyi;

    .line 522
    .line 523
    if-eqz p0, :cond_5

    .line 524
    .line 525
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 526
    .line 527
    .line 528
    return-object v0

    .line 529
    :cond_5
    const-string p0, "verificationStatusViewModelFactory"

    .line 530
    .line 531
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v5

    .line 535
    :pswitch_15
    check-cast p0, La/s4u0;

    .line 536
    .line 537
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 538
    .line 539
    iget-object p0, p0, La/s4u0;->j:La/pz40;

    .line 540
    .line 541
    check-cast p0, La/hgk0;

    .line 542
    .line 543
    invoke-virtual {p0, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    return-object v0

    .line 547
    :pswitch_16
    check-cast p0, La/bsf;

    .line 548
    .line 549
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget-object v1, p0, La/bsf;->m:La/n0o0;

    .line 554
    .line 555
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, La/fee;

    .line 560
    .line 561
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    check-cast v1, Ljava/util/Collection;

    .line 566
    .line 567
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 568
    .line 569
    .line 570
    iget-object v1, p0, La/bsf;->n:La/n0o0;

    .line 571
    .line 572
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, La/fee;

    .line 577
    .line 578
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    check-cast v1, Ljava/util/Collection;

    .line 583
    .line 584
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 585
    .line 586
    .line 587
    iget-object v1, p0, La/bsf;->p:La/n0o0;

    .line 588
    .line 589
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    check-cast v1, La/fee;

    .line 594
    .line 595
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    check-cast v1, Ljava/util/Collection;

    .line 600
    .line 601
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 602
    .line 603
    .line 604
    iget-object p0, p0, La/bsf;->o:La/n0o0;

    .line 605
    .line 606
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object p0

    .line 610
    check-cast p0, La/fee;

    .line 611
    .line 612
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    check-cast p0, Ljava/util/Collection;

    .line 617
    .line 618
    invoke-static {v0, p0, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 619
    .line 620
    .line 621
    move-result-object p0

    .line 622
    return-object p0

    .line 623
    :pswitch_17
    check-cast p0, La/afm0;

    .line 624
    .line 625
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast p0, La/gii0;

    .line 628
    .line 629
    const-class v0, La/mxt0;

    .line 630
    .line 631
    sget-object v1, La/sre0;->a:La/tre0;

    .line 632
    .line 633
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object p0

    .line 641
    check-cast p0, La/mxt0;

    .line 642
    .line 643
    return-object p0

    .line 644
    :pswitch_18
    check-cast p0, La/sxt0;

    .line 645
    .line 646
    new-instance v0, La/q0h0;

    .line 647
    .line 648
    iget-object p0, p0, La/sxt0;->L1:La/pyi;

    .line 649
    .line 650
    if-eqz p0, :cond_6

    .line 651
    .line 652
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 653
    .line 654
    .line 655
    return-object v0

    .line 656
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    throw v5

    .line 660
    :pswitch_19
    check-cast p0, La/h0q0;

    .line 661
    .line 662
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast p0, La/i2a;

    .line 665
    .line 666
    invoke-virtual {p0}, La/i2a;->a()La/kpd0;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    const-class v0, Landroidx/camera/camera2/compat/quirk/UltraWideFlashCaptureUnderexposureQuirk;

    .line 671
    .line 672
    invoke-virtual {p0, v0}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 673
    .line 674
    .line 675
    move-result p0

    .line 676
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 677
    .line 678
    .line 679
    move-result-object p0

    .line 680
    return-object p0

    .line 681
    :pswitch_1a
    check-cast p0, La/trm0;

    .line 682
    .line 683
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast p0, La/gii0;

    .line 686
    .line 687
    const-class v0, La/rgt0;

    .line 688
    .line 689
    sget-object v1, La/sre0;->a:La/tre0;

    .line 690
    .line 691
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p0

    .line 699
    check-cast p0, La/rgt0;

    .line 700
    .line 701
    return-object p0

    .line 702
    :pswitch_1b
    check-cast p0, La/igt0;

    .line 703
    .line 704
    sget-object v0, La/igt0;->Q1:La/bzs0;

    .line 705
    .line 706
    iget-object p0, p0, La/igt0;->N1:La/fiu0;

    .line 707
    .line 708
    if-eqz p0, :cond_7

    .line 709
    .line 710
    return-object p0

    .line 711
    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    throw v5

    .line 715
    :pswitch_1c
    check-cast p0, La/lbt0;

    .line 716
    .line 717
    iget-object p0, p0, La/lbt0;->a:La/mdm;

    .line 718
    .line 719
    return-object p0

    .line 720
    nop

    .line 721
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
