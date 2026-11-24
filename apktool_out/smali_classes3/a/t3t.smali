.class public final synthetic La/t3t;
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
    iput-byte p2, p0, La/t3t;->a:B

    iput-object p1, p0, La/t3t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/t3t;->a:B

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object p0, p0, La/t3t;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/y6w;

    .line 15
    .line 16
    check-cast p1, La/x3q;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/i26;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/util/List;

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sub-int/2addr v0, v5

    .line 40
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/p6t0;

    .line 45
    .line 46
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast p0, La/x6w;

    .line 56
    .line 57
    check-cast p1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 58
    .line 59
    sget-object v0, La/x6w;->k2:La/art;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/x6w;->U0()La/wnm0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iget-boolean v0, p1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->b:Z

    .line 69
    .line 70
    iget-object v1, p0, La/wnm0;->h:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_3

    .line 81
    .line 82
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    move-object v8, v7

    .line 87
    check-cast v8, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 88
    .line 89
    iget-object v8, v8, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a:La/e4f;

    .line 90
    .line 91
    iget-object v9, p1, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a:La/e4f;

    .line 92
    .line 93
    if-ne v8, v9, :cond_2

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    move-object v7, v3

    .line 97
    :goto_1
    check-cast v7, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 98
    .line 99
    if-eqz v7, :cond_4

    .line 100
    .line 101
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    xor-int/lit8 v7, v0, 0x1

    .line 106
    .line 107
    const/4 v8, 0x5

    .line 108
    invoke-static {p1, v7, v4, v8}, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->a(Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;ZZI)Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v1, v6, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    move v6, v4

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    move v6, v4

    .line 128
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_8

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 139
    .line 140
    iget-boolean v7, v7, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->b:Z

    .line 141
    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    add-int/lit8 v6, v6, 0x1

    .line 145
    .line 146
    if-ltz v6, :cond_7

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_7
    invoke-static {}, La/q3d;->o()V

    .line 150
    .line 151
    .line 152
    throw v3

    .line 153
    :cond_8
    :goto_3
    if-eq v6, v5, :cond_a

    .line 154
    .line 155
    if-eq v6, v2, :cond_9

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    if-nez v0, :cond_d

    .line 159
    .line 160
    invoke-virtual {p0}, La/wnm0;->x()V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_a
    if-eqz v0, :cond_d

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_c

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    move-object v7, v0

    .line 181
    check-cast v7, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 182
    .line 183
    iget-boolean v7, v7, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;->b:Z

    .line 184
    .line 185
    if-eqz v7, :cond_b

    .line 186
    .line 187
    move-object v3, v0

    .line 188
    :cond_c
    check-cast v3, Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;

    .line 189
    .line 190
    if-eqz v3, :cond_d

    .line 191
    .line 192
    invoke-virtual {p0, v3}, La/wnm0;->y(Lorg/xplatform/bethistory/history/domain/model/BetHistoryFilterItemModel;)V

    .line 193
    .line 194
    .line 195
    :cond_d
    :goto_4
    invoke-virtual {p0}, La/wnm0;->w()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, La/wnm0;->z()V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, La/wnm0;->j:La/p7m0;

    .line 202
    .line 203
    :cond_e
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    move-object p1, p0

    .line 208
    check-cast p1, La/o9h0;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-ne v3, v6, :cond_f

    .line 215
    .line 216
    move v3, v5

    .line 217
    goto :goto_5

    .line 218
    :cond_f
    move v3, v4

    .line 219
    :goto_5
    invoke-static {p1, v3, v4, v2}, La/o9h0;->a(La/o9h0;ZZI)La/o9h0;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    if-eqz p0, :cond_e

    .line 228
    .line 229
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_1
    check-cast p0, La/q5w;

    .line 233
    .line 234
    check-cast p1, Ljava/lang/Throwable;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v0, p0, La/q5w;->w:La/duj;

    .line 240
    .line 241
    new-instance v1, La/l5w;

    .line 242
    .line 243
    invoke-direct {v1, p0, v5}, La/l5w;-><init>(La/q5w;B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 247
    .line 248
    .line 249
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_2
    check-cast p0, La/c4w;

    .line 253
    .line 254
    check-cast p1, La/hcz;

    .line 255
    .line 256
    sget-object v0, La/c4w;->n2:La/tqt;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v0, p0, La/c4w;->m2:La/lhf0;

    .line 262
    .line 263
    sget-object v1, La/c4w;->o2:[La/iiy;

    .line 264
    .line 265
    aget-object v1, v1, v2

    .line 266
    .line 267
    invoke-virtual {v0, p0, v1}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    new-instance v2, La/far;

    .line 276
    .line 277
    const/16 v4, 0x10

    .line 278
    .line 279
    invoke-direct {v2, v0, v4}, La/far;-><init>(Ljava/util/List;B)V

    .line 280
    .line 281
    .line 282
    new-instance v4, La/xe4;

    .line 283
    .line 284
    const/16 v6, 0x8

    .line 285
    .line 286
    invoke-direct {v4, v0, p0, v6}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 287
    .line 288
    .line 289
    new-instance p0, La/ugd;

    .line 290
    .line 291
    const v0, 0x799532c4

    .line 292
    .line 293
    .line 294
    invoke-direct {p0, v0, v5, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, v1, v3, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 298
    .line 299
    .line 300
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_3
    check-cast p0, La/t3t;

    .line 304
    .line 305
    check-cast p1, La/cp;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    new-instance v0, La/f3s;

    .line 311
    .line 312
    const/16 v1, 0x19

    .line 313
    .line 314
    invoke-direct {v0, p1, p0, v1}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 318
    .line 319
    .line 320
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object p0

    .line 323
    :pswitch_4
    check-cast p0, La/y3w;

    .line 324
    .line 325
    check-cast p1, La/d4w;

    .line 326
    .line 327
    sget-object v0, La/y3w;->n2:La/sqt;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object p0, p0, La/y3w;->k2:La/kiu0;

    .line 333
    .line 334
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    check-cast p0, La/b4w;

    .line 339
    .line 340
    iget-object p0, p0, La/b4w;->h:La/qoj0;

    .line 341
    .line 342
    new-instance v0, La/a4w;

    .line 343
    .line 344
    invoke-direct {v0, p1}, La/a4w;-><init>(La/d4w;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_5
    check-cast p0, La/li8;

    .line 354
    .line 355
    check-cast p1, La/cp;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 361
    .line 362
    check-cast v0, La/kvx;

    .line 363
    .line 364
    iget-object v0, v0, La/kvx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 365
    .line 366
    new-instance v2, La/wg;

    .line 367
    .line 368
    invoke-direct {v2, p0, p1, v1}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 372
    .line 373
    .line 374
    new-instance p0, La/b1w;

    .line 375
    .line 376
    invoke-direct {p0, p1, v4}, La/b1w;-><init>(La/cp;B)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_6
    check-cast p0, La/q0w;

    .line 386
    .line 387
    check-cast p1, La/hcz;

    .line 388
    .line 389
    sget-object v0, La/q0w;->m2:La/tqt;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v0, p0, La/q0w;->l2:La/lhf0;

    .line 395
    .line 396
    sget-object v1, La/q0w;->n2:[La/iiy;

    .line 397
    .line 398
    aget-object v1, v1, v5

    .line 399
    .line 400
    invoke-virtual {v0, p0, v1}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    new-instance v2, La/far;

    .line 409
    .line 410
    const/16 v4, 0xf

    .line 411
    .line 412
    invoke-direct {v2, v0, v4}, La/far;-><init>(Ljava/util/List;B)V

    .line 413
    .line 414
    .line 415
    new-instance v4, La/xe4;

    .line 416
    .line 417
    const/4 v6, 0x7

    .line 418
    invoke-direct {v4, v0, p0, v6}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 419
    .line 420
    .line 421
    new-instance p0, La/ugd;

    .line 422
    .line 423
    const v0, 0x2fd4df92

    .line 424
    .line 425
    .line 426
    invoke-direct {p0, v0, v5, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1, v1, v3, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 430
    .line 431
    .line 432
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    return-object p0

    .line 435
    :pswitch_7
    check-cast p0, La/vft;

    .line 436
    .line 437
    check-cast p1, La/cp;

    .line 438
    .line 439
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 443
    .line 444
    new-instance v1, La/wg;

    .line 445
    .line 446
    const/16 v2, 0x16

    .line 447
    .line 448
    invoke-direct {v1, p0, p1, v2}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    .line 453
    .line 454
    new-instance p0, La/kgh;

    .line 455
    .line 456
    const/16 v0, 0x1d

    .line 457
    .line 458
    invoke-direct {p0, p1, v0}, La/kgh;-><init>(La/cp;B)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 462
    .line 463
    .line 464
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object p0

    .line 467
    :pswitch_8
    check-cast p0, La/vft;

    .line 468
    .line 469
    check-cast p1, La/cp;

    .line 470
    .line 471
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 475
    .line 476
    check-cast v0, La/pxx;

    .line 477
    .line 478
    iget-object v1, v0, La/pxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 479
    .line 480
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setDefaultClickHandleEnabled(Z)V

    .line 481
    .line 482
    .line 483
    iget-object v1, v0, La/pxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 484
    .line 485
    invoke-virtual {v1, v4}, Landroid/view/View;->setClickable(Z)V

    .line 486
    .line 487
    .line 488
    iget-object v0, v0, La/pxx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    new-instance v1, La/f3s;

    .line 494
    .line 495
    const/16 v2, 0x11

    .line 496
    .line 497
    invoke-direct {v1, p0, p1, v2}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 498
    .line 499
    .line 500
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 501
    .line 502
    .line 503
    new-instance p0, La/k2l;

    .line 504
    .line 505
    const/16 v0, 0x1c

    .line 506
    .line 507
    invoke-direct {p0, p1, p1, v0}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 511
    .line 512
    .line 513
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    return-object p0

    .line 516
    :pswitch_9
    check-cast p0, La/vft;

    .line 517
    .line 518
    check-cast p1, La/cp;

    .line 519
    .line 520
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 524
    .line 525
    check-cast v0, La/oxx;

    .line 526
    .line 527
    iget-object v0, v0, La/oxx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 528
    .line 529
    new-instance v1, La/okv;

    .line 530
    .line 531
    invoke-direct {v1, v4, p0, p1}, La/okv;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 535
    .line 536
    .line 537
    new-instance p0, La/k2l;

    .line 538
    .line 539
    const/16 v0, 0x1b

    .line 540
    .line 541
    invoke-direct {p0, p1, p1, v0}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 545
    .line 546
    .line 547
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object p0

    .line 550
    :pswitch_a
    check-cast p0, La/vft;

    .line 551
    .line 552
    check-cast p1, La/cp;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 558
    .line 559
    check-cast v0, La/ohv;

    .line 560
    .line 561
    iget-object v3, v0, La/ohv;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 562
    .line 563
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLines(I)V

    .line 564
    .line 565
    .line 566
    iget-object v2, v0, La/ohv;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 567
    .line 568
    new-instance v3, La/qhv;

    .line 569
    .line 570
    invoke-direct {v3, v4, p1, p0}, La/qhv;-><init>(BLa/cp;La/vft;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 574
    .line 575
    .line 576
    iget-object v0, v0, La/ohv;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;

    .line 577
    .line 578
    new-instance v2, La/qhv;

    .line 579
    .line 580
    invoke-direct {v2, v5, p1, p0}, La/qhv;-><init>(BLa/cp;La/vft;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 584
    .line 585
    .line 586
    new-instance p0, La/kgh;

    .line 587
    .line 588
    invoke-direct {p0, p1, v1}, La/kgh;-><init>(La/cp;B)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 592
    .line 593
    .line 594
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object p0

    .line 597
    :pswitch_b
    check-cast p0, La/wgv;

    .line 598
    .line 599
    check-cast p1, La/hwt0;

    .line 600
    .line 601
    invoke-virtual {p0, p1}, La/wgv;->g(La/hwt0;)V

    .line 602
    .line 603
    .line 604
    iget-object p0, p0, La/wgv;->i:Lkotlin/jvm/functions/Function1;

    .line 605
    .line 606
    if-eqz p0, :cond_10

    .line 607
    .line 608
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 612
    .line 613
    return-object p0

    .line 614
    :pswitch_c
    check-cast p0, La/gfv;

    .line 615
    .line 616
    check-cast p1, La/fhl;

    .line 617
    .line 618
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0}, La/nr;->i()La/x5a;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    iget-object p0, p0, La/gfv;->d:Lkotlin/jvm/functions/Function2;

    .line 627
    .line 628
    if-eqz p0, :cond_11

    .line 629
    .line 630
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 631
    .line 632
    .line 633
    move-result-object p1

    .line 634
    iget-object p1, p1, La/nr;->c:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast p1, La/dfv;

    .line 637
    .line 638
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    :cond_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 642
    .line 643
    return-object p0

    .line 644
    :pswitch_d
    check-cast p0, La/ywu;

    .line 645
    .line 646
    check-cast p1, Ljava/lang/Void;

    .line 647
    .line 648
    new-instance p1, La/md3;

    .line 649
    .line 650
    const/4 v0, 0x4

    .line 651
    invoke-direct {p1, p0, v0}, La/md3;-><init>(Ljava/lang/Object;B)V

    .line 652
    .line 653
    .line 654
    iput-object p1, p0, La/ywu;->d:Ljava/lang/Object;

    .line 655
    .line 656
    new-instance p1, Landroid/content/IntentFilter;

    .line 657
    .line 658
    const-string v0, "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"

    .line 659
    .line 660
    invoke-direct {p1, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    iget-object v0, p0, La/ywu;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, La/us00;

    .line 666
    .line 667
    iget-object p0, p0, La/ywu;->d:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast p0, La/md3;

    .line 670
    .line 671
    invoke-static {v0, p0, p1}, La/jiq0;->t0(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 672
    .line 673
    .line 674
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 675
    .line 676
    return-object p0

    .line 677
    :pswitch_e
    check-cast p0, La/wav;

    .line 678
    .line 679
    check-cast p1, Ljava/lang/Throwable;

    .line 680
    .line 681
    sget-object v0, La/wav;->h2:La/sqt;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    iget-object v4, p0, La/wav;->e2:La/sje;

    .line 687
    .line 688
    if-eqz v4, :cond_13

    .line 689
    .line 690
    iget-object v0, p0, La/wav;->g2:La/mne;

    .line 691
    .line 692
    if-eqz v0, :cond_12

    .line 693
    .line 694
    iget-object v7, v0, La/mne;->c:La/vs10;

    .line 695
    .line 696
    sget-object v5, La/vav;->a:La/vav;

    .line 697
    .line 698
    new-instance v8, La/j0s;

    .line 699
    .line 700
    const/16 v0, 0x14

    .line 701
    .line 702
    invoke-direct {v8, p1, p0, v3, v0}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 703
    .line 704
    .line 705
    const/16 v9, 0xa

    .line 706
    .line 707
    const/4 v6, 0x0

    .line 708
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 709
    .line 710
    .line 711
    goto :goto_6

    .line 712
    :cond_12
    const-string p0, "coroutineDispatchers"

    .line 713
    .line 714
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v3

    .line 718
    :cond_13
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 719
    .line 720
    return-object p0

    .line 721
    :pswitch_f
    check-cast p0, La/enm;

    .line 722
    .line 723
    check-cast p1, Lkotlin/Pair;

    .line 724
    .line 725
    invoke-virtual {p0, p1}, La/enm;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 729
    .line 730
    return-object p0

    .line 731
    :pswitch_10
    check-cast p0, La/q99;

    .line 732
    .line 733
    sget-object p1, La/y8v;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 734
    .line 735
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 736
    .line 737
    .line 738
    move-result p1

    .line 739
    if-eqz p1, :cond_14

    .line 740
    .line 741
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    :cond_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 747
    .line 748
    return-object p0

    .line 749
    :pswitch_11
    check-cast p0, La/v1v;

    .line 750
    .line 751
    check-cast p1, Ljava/lang/Throwable;

    .line 752
    .line 753
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    instance-of v0, p1, La/zhi0;

    .line 757
    .line 758
    if-eqz v0, :cond_15

    .line 759
    .line 760
    check-cast p1, La/zhi0;

    .line 761
    .line 762
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 763
    .line 764
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 765
    .line 766
    if-ne p1, v0, :cond_15

    .line 767
    .line 768
    iget-object p0, p0, La/v1v;->d:La/gst0;

    .line 769
    .line 770
    invoke-virtual {p0, v4, v4}, La/gst0;->h(ZZ)V

    .line 771
    .line 772
    .line 773
    move v4, v5

    .line 774
    :cond_15
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 775
    .line 776
    .line 777
    move-result-object p0

    .line 778
    return-object p0

    .line 779
    :pswitch_12
    check-cast p0, La/f1v;

    .line 780
    .line 781
    check-cast p1, Ljava/lang/Throwable;

    .line 782
    .line 783
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    instance-of v0, p1, La/zhi0;

    .line 787
    .line 788
    if-eqz v0, :cond_16

    .line 789
    .line 790
    check-cast p1, La/zhi0;

    .line 791
    .line 792
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 793
    .line 794
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 795
    .line 796
    if-ne p1, v0, :cond_16

    .line 797
    .line 798
    iget-object p0, p0, La/f1v;->d:La/gst0;

    .line 799
    .line 800
    invoke-virtual {p0, v4, v4}, La/gst0;->h(ZZ)V

    .line 801
    .line 802
    .line 803
    move v4, v5

    .line 804
    :cond_16
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    return-object p0

    .line 809
    :pswitch_13
    check-cast p0, La/qgd;

    .line 810
    .line 811
    check-cast p1, Ljava/lang/Throwable;

    .line 812
    .line 813
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    instance-of v0, p1, La/zhi0;

    .line 820
    .line 821
    if-eqz v0, :cond_17

    .line 822
    .line 823
    check-cast p1, La/zhi0;

    .line 824
    .line 825
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 826
    .line 827
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 828
    .line 829
    if-ne p1, v0, :cond_17

    .line 830
    .line 831
    iget-object p0, p0, La/qgd;->g:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast p0, La/wsc;

    .line 834
    .line 835
    iget-object p0, p0, La/wsc;->a:La/gst0;

    .line 836
    .line 837
    invoke-virtual {p0}, La/gst0;->j()V

    .line 838
    .line 839
    .line 840
    move v4, v5

    .line 841
    :cond_17
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 842
    .line 843
    .line 844
    move-result-object p0

    .line 845
    return-object p0

    .line 846
    :pswitch_14
    check-cast p0, La/ywq0;

    .line 847
    .line 848
    check-cast p1, Ljava/lang/Throwable;

    .line 849
    .line 850
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    instance-of v0, p1, La/zhi0;

    .line 857
    .line 858
    if-eqz v0, :cond_18

    .line 859
    .line 860
    check-cast p1, La/zhi0;

    .line 861
    .line 862
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 863
    .line 864
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 865
    .line 866
    if-ne p1, v0, :cond_18

    .line 867
    .line 868
    iget-object p0, p0, La/ywq0;->f:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast p0, La/s4v;

    .line 871
    .line 872
    iget-object p0, p0, La/s4v;->a:La/gst0;

    .line 873
    .line 874
    invoke-virtual {p0}, La/gst0;->i()V

    .line 875
    .line 876
    .line 877
    move v4, v5

    .line 878
    :cond_18
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 879
    .line 880
    .line 881
    move-result-object p0

    .line 882
    return-object p0

    .line 883
    :pswitch_15
    check-cast p0, La/xzp;

    .line 884
    .line 885
    check-cast p1, Ljava/lang/Throwable;

    .line 886
    .line 887
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    instance-of v0, p1, La/zhi0;

    .line 891
    .line 892
    if-eqz v0, :cond_19

    .line 893
    .line 894
    check-cast p1, La/zhi0;

    .line 895
    .line 896
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 897
    .line 898
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 899
    .line 900
    if-ne p1, v0, :cond_19

    .line 901
    .line 902
    iget-object p0, p0, La/xzp;->b:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast p0, La/ort;

    .line 905
    .line 906
    invoke-virtual {p0, v4, v4}, La/ort;->c(ZZ)V

    .line 907
    .line 908
    .line 909
    move v4, v5

    .line 910
    :cond_19
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 911
    .line 912
    .line 913
    move-result-object p0

    .line 914
    return-object p0

    .line 915
    :pswitch_16
    check-cast p0, La/rrd;

    .line 916
    .line 917
    check-cast p1, Ljava/lang/Throwable;

    .line 918
    .line 919
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    instance-of v0, p1, La/zhi0;

    .line 923
    .line 924
    if-eqz v0, :cond_1a

    .line 925
    .line 926
    check-cast p1, La/zhi0;

    .line 927
    .line 928
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 929
    .line 930
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 931
    .line 932
    if-ne p1, v0, :cond_1a

    .line 933
    .line 934
    iget-object p0, p0, La/rrd;->c:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast p0, La/ort;

    .line 937
    .line 938
    invoke-virtual {p0, v4, v4}, La/ort;->c(ZZ)V

    .line 939
    .line 940
    .line 941
    move v4, v5

    .line 942
    :cond_1a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 943
    .line 944
    .line 945
    move-result-object p0

    .line 946
    return-object p0

    .line 947
    :pswitch_17
    check-cast p0, La/xzp;

    .line 948
    .line 949
    check-cast p1, Ljava/lang/Throwable;

    .line 950
    .line 951
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    instance-of v0, p1, La/zhi0;

    .line 955
    .line 956
    if-eqz v0, :cond_1b

    .line 957
    .line 958
    check-cast p1, La/zhi0;

    .line 959
    .line 960
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 961
    .line 962
    sget-object v0, La/i2o;->D2:La/i2o;

    .line 963
    .line 964
    if-ne p1, v0, :cond_1b

    .line 965
    .line 966
    iget-object p0, p0, La/xzp;->e:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast p0, La/gst0;

    .line 969
    .line 970
    invoke-virtual {p0, v4, v4}, La/gst0;->h(ZZ)V

    .line 971
    .line 972
    .line 973
    move v4, v5

    .line 974
    :cond_1b
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 975
    .line 976
    .line 977
    move-result-object p0

    .line 978
    return-object p0

    .line 979
    :pswitch_18
    check-cast p0, La/v8d;

    .line 980
    .line 981
    check-cast p1, La/iz30;

    .line 982
    .line 983
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    sget-object v0, La/iz30;->w:La/iz30;

    .line 987
    .line 988
    if-ne p1, v0, :cond_1c

    .line 989
    .line 990
    iget-boolean v0, p0, La/v8d;->D:Z

    .line 991
    .line 992
    if-nez v0, :cond_1c

    .line 993
    .line 994
    goto :goto_7

    .line 995
    :cond_1c
    sget-object v0, La/iz30;->p:La/iz30;

    .line 996
    .line 997
    if-ne p1, v0, :cond_1d

    .line 998
    .line 999
    iget-boolean p0, p0, La/v8d;->E:Z

    .line 1000
    .line 1001
    if-nez p0, :cond_1d

    .line 1002
    .line 1003
    goto :goto_7

    .line 1004
    :cond_1d
    move v4, v5

    .line 1005
    :goto_7
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1006
    .line 1007
    .line 1008
    move-result-object p0

    .line 1009
    return-object p0

    .line 1010
    :pswitch_19
    check-cast p0, La/wbq;

    .line 1011
    .line 1012
    check-cast p1, La/sbq;

    .line 1013
    .line 1014
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    iget-object p1, p1, La/sbq;->e:La/wbq;

    .line 1018
    .line 1019
    if-ne p1, p0, :cond_1e

    .line 1020
    .line 1021
    move v4, v5

    .line 1022
    :cond_1e
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1023
    .line 1024
    .line 1025
    move-result-object p0

    .line 1026
    return-object p0

    .line 1027
    :pswitch_1a
    check-cast p0, La/a9t;

    .line 1028
    .line 1029
    check-cast p1, Ljava/lang/Throwable;

    .line 1030
    .line 1031
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    instance-of v0, p1, La/qct;

    .line 1035
    .line 1036
    if-eqz v0, :cond_1f

    .line 1037
    .line 1038
    move-object v0, p1

    .line 1039
    check-cast v0, La/qct;

    .line 1040
    .line 1041
    sget-object v1, La/l5t;->g:La/l5t;

    .line 1042
    .line 1043
    sget-object v2, La/l5t;->b:La/l5t;

    .line 1044
    .line 1045
    sget-object v3, La/l5t;->a:La/l5t;

    .line 1046
    .line 1047
    sget-object v4, La/l5t;->e:La/l5t;

    .line 1048
    .line 1049
    filled-new-array {v1, v2, v3, v4}, [La/l5t;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    iget-object v0, v0, La/qct;->b:La/l5t;

    .line 1058
    .line 1059
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    if-nez v0, :cond_20

    .line 1064
    .line 1065
    :cond_1f
    invoke-virtual {p0, p1}, La/a9t;->x(Ljava/lang/Throwable;)V

    .line 1066
    .line 1067
    .line 1068
    :cond_20
    iget-object v0, p0, La/a9t;->o:La/p7m0;

    .line 1069
    .line 1070
    :cond_21
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object p0

    .line 1074
    move-object p1, p0

    .line 1075
    check-cast p1, Ljava/lang/Boolean;

    .line 1076
    .line 1077
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1081
    .line 1082
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result p0

    .line 1086
    if-eqz p0, :cond_21

    .line 1087
    .line 1088
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1089
    .line 1090
    return-object p0

    .line 1091
    :pswitch_1b
    check-cast p0, La/ur6;

    .line 1092
    .line 1093
    check-cast p1, La/cp;

    .line 1094
    .line 1095
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 1099
    .line 1100
    check-cast v0, La/hsx;

    .line 1101
    .line 1102
    iget-object v0, v0, La/hsx;->b:Landroid/widget/TextView;

    .line 1103
    .line 1104
    new-instance v1, La/f3s;

    .line 1105
    .line 1106
    const/16 v2, 0xd

    .line 1107
    .line 1108
    invoke-direct {v1, p0, p1, v2}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1112
    .line 1113
    .line 1114
    new-instance p0, La/k2l;

    .line 1115
    .line 1116
    const/16 v0, 0x1a

    .line 1117
    .line 1118
    invoke-direct {p0, p1, p1, v0}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1122
    .line 1123
    .line 1124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1125
    .line 1126
    return-object p0

    .line 1127
    :pswitch_1c
    check-cast p0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;

    .line 1128
    .line 1129
    check-cast p1, Landroid/view/View;

    .line 1130
    .line 1131
    sget v0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->g:I

    .line 1132
    .line 1133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    iget-boolean p1, p0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->f:Z

    .line 1137
    .line 1138
    xor-int/2addr p1, v5

    .line 1139
    iput-boolean p1, p0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->f:Z

    .line 1140
    .line 1141
    iget-object v0, p0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->e:La/s3t;

    .line 1142
    .line 1143
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1144
    .line 1145
    .line 1146
    move-result-object p1

    .line 1147
    iget-object p0, p0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->d:La/csr;

    .line 1148
    .line 1149
    invoke-virtual {v0, p1, p0}, La/s3t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1153
    .line 1154
    return-object p0

    .line 1155
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
