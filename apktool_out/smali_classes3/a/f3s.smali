.class public final synthetic La/f3s;
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
    iput-byte p3, p0, La/f3s;->a:B

    iput-object p1, p0, La/f3s;->b:Ljava/lang/Object;

    iput-object p2, p0, La/f3s;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f3s;->a:B

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    const/16 v3, 0x18

    .line 8
    .line 9
    const/16 v4, 0x14

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const v7, 0x799532c4

    .line 14
    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    iget-object v10, v0, La/f3s;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, v0, La/f3s;->b:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object v12, v0

    .line 26
    check-cast v12, La/n3w;

    .line 27
    .line 28
    check-cast v10, La/naw;

    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/k0w0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v11, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;

    .line 38
    .line 39
    iget-object v1, v10, La/naw;->C0:La/ql5;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-wide v1, v1, La/ql5;->a:J

    .line 44
    .line 45
    :goto_0
    move-wide v14, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-wide/16 v1, 0x0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :goto_1
    const/16 v16, 0x0

    .line 51
    .line 52
    iget-object v1, v10, La/naw;->d:La/sys0;

    .line 53
    .line 54
    const/4 v13, 0x0

    .line 55
    move-object/from16 v17, v1

    .line 56
    .line 57
    invoke-direct/range {v11 .. v17}, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;-><init>(La/n3w;ZJZLa/sys0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v11}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    check-cast v0, La/b8w;

    .line 67
    .line 68
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 69
    .line 70
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, La/hcz;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v2, v0, La/b8w;->a:La/i4;

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    new-instance v11, La/far;

    .line 84
    .line 85
    const/16 v12, 0x11

    .line 86
    .line 87
    invoke-direct {v11, v2, v12}, La/far;-><init>(Ljava/util/List;B)V

    .line 88
    .line 89
    .line 90
    new-instance v12, La/h8w;

    .line 91
    .line 92
    invoke-direct {v12, v2, v10, v0, v6}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    new-instance v2, La/ugd;

    .line 96
    .line 97
    invoke-direct {v2, v7, v8, v12}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3, v9, v11, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 101
    .line 102
    .line 103
    iget-boolean v0, v0, La/b8w;->b:Z

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    new-instance v0, La/gn;

    .line 108
    .line 109
    invoke-direct {v0, v10, v4}, La/gn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/ugd;

    .line 113
    .line 114
    const v3, -0x5e14e43d

    .line 115
    .line 116
    .line 117
    invoke-direct {v2, v3, v8, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v9, v9, v2, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 121
    .line 122
    .line 123
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_1
    check-cast v0, La/t3t;

    .line 127
    .line 128
    check-cast v10, La/t3t;

    .line 129
    .line 130
    move-object/from16 v1, p1

    .line 131
    .line 132
    check-cast v1, La/cp;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v2, La/k9v;

    .line 138
    .line 139
    const/4 v3, 0x2

    .line 140
    invoke-direct {v2, v1, v0, v10, v3}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 144
    .line 145
    .line 146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_2
    check-cast v0, La/z4w;

    .line 150
    .line 151
    check-cast v10, La/n3w;

    .line 152
    .line 153
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, La/k0w0;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v0, v0, La/z4w;->s:La/r9u;

    .line 161
    .line 162
    sget-object v2, La/ygp;->I1:La/ygp;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 168
    .line 169
    invoke-virtual {v0, v2}, La/j1q0;->a(La/ygp;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_2

    .line 174
    .line 175
    new-instance v0, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreen;

    .line 176
    .line 177
    iget-object v2, v10, La/n3w;->a:Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v0, v2}, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreen;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_2
    new-instance v0, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreenOld;

    .line 184
    .line 185
    iget-object v2, v10, La/n3w;->a:Ljava/lang/String;

    .line 186
    .line 187
    invoke-direct {v0, v2}, Lorg/xplatform/bethistory/share_coupon/presentation/ShareCouponScreenOld;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :goto_2
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 191
    .line 192
    .line 193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    check-cast v0, La/cp;

    .line 197
    .line 198
    check-cast v10, La/t3t;

    .line 199
    .line 200
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, Ljava/util/List;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v1, v0, La/xhe0;->a:Landroid/view/View;

    .line 208
    .line 209
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 210
    .line 211
    check-cast v2, La/fz30;

    .line 212
    .line 213
    iget-object v4, v2, La/fz30;->c:Landroid/widget/TextView;

    .line 214
    .line 215
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    check-cast v5, La/e4w;

    .line 224
    .line 225
    iget v5, v5, La/e4w;->a:I

    .line 226
    .line 227
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    iget-object v1, v2, La/fz30;->b:Landroid/widget/ImageView;

    .line 235
    .line 236
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, La/e4w;

    .line 241
    .line 242
    iget v4, v4, La/e4w;->b:I

    .line 243
    .line 244
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 245
    .line 246
    .line 247
    iget-object v1, v2, La/fz30;->a:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 248
    .line 249
    new-instance v2, La/wg;

    .line 250
    .line 251
    invoke-direct {v2, v10, v0, v3}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_4
    check-cast v0, La/f0w;

    .line 261
    .line 262
    check-cast v10, La/vzv;

    .line 263
    .line 264
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, La/hcz;

    .line 267
    .line 268
    sget-object v2, La/vzv;->p2:La/sqt;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v2, v0, La/f0w;->a:La/i4;

    .line 274
    .line 275
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    new-instance v4, La/pn7;

    .line 280
    .line 281
    invoke-direct {v4, v2, v5}, La/pn7;-><init>(La/i4;B)V

    .line 282
    .line 283
    .line 284
    new-instance v5, La/c8;

    .line 285
    .line 286
    const/16 v6, 0x1d

    .line 287
    .line 288
    invoke-direct {v5, v2, v10, v0, v6}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 289
    .line 290
    .line 291
    new-instance v0, La/ugd;

    .line 292
    .line 293
    invoke-direct {v0, v7, v8, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v3, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_5
    check-cast v0, La/izv;

    .line 303
    .line 304
    check-cast v10, La/n3w;

    .line 305
    .line 306
    move-object/from16 v1, p1

    .line 307
    .line 308
    check-cast v1, Landroid/view/View;

    .line 309
    .line 310
    sget-object v2, La/izv;->d2:La/rqt;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    iget-object v0, v0, La/jzv;->d:La/z4w;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iput-object v10, v0, La/z4w;->v:La/n3w;

    .line 325
    .line 326
    iget-object v1, v0, La/z4w;->r:La/q37;

    .line 327
    .line 328
    sget-object v2, La/a1w;->j:La/a1w;

    .line 329
    .line 330
    iget-object v3, v1, La/q37;->b:La/b4j;

    .line 331
    .line 332
    iget-object v3, v3, La/b4j;->a:La/kt2;

    .line 333
    .line 334
    invoke-virtual {v2}, La/a1w;->a()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-interface {v3, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    iget-object v1, v1, La/q37;->c:La/au0;

    .line 342
    .line 343
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 344
    .line 345
    const-wide/16 v2, 0xc86

    .line 346
    .line 347
    sget-object v4, La/xun;->a:La/xun;

    .line 348
    .line 349
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v10, v6}, La/z4w;->v(La/n3w;Z)V

    .line 353
    .line 354
    .line 355
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_6
    check-cast v0, Ljava/util/ArrayList;

    .line 359
    .line 360
    check-cast v10, La/axv;

    .line 361
    .line 362
    move-object/from16 v1, p1

    .line 363
    .line 364
    check-cast v1, La/hcz;

    .line 365
    .line 366
    sget-object v3, La/axv;->n2:La/art;

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    new-instance v4, La/j13;

    .line 376
    .line 377
    invoke-direct {v4, v0, v2, v6}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 378
    .line 379
    .line 380
    new-instance v2, La/c8;

    .line 381
    .line 382
    const/16 v5, 0x1c

    .line 383
    .line 384
    invoke-direct {v2, v0, v0, v10, v5}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 385
    .line 386
    .line 387
    new-instance v0, La/ugd;

    .line 388
    .line 389
    invoke-direct {v0, v7, v8, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v3, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_7
    check-cast v0, Ljava/util/List;

    .line 399
    .line 400
    check-cast v10, La/wyx;

    .line 401
    .line 402
    move-object/from16 v1, p1

    .line 403
    .line 404
    check-cast v1, La/hcz;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    new-instance v3, La/far;

    .line 414
    .line 415
    const/16 v4, 0xe

    .line 416
    .line 417
    invoke-direct {v3, v0, v4}, La/far;-><init>(Ljava/util/List;B)V

    .line 418
    .line 419
    .line 420
    new-instance v4, La/xe4;

    .line 421
    .line 422
    const/4 v5, 0x6

    .line 423
    invoke-direct {v4, v0, v10, v5}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 424
    .line 425
    .line 426
    new-instance v0, La/ugd;

    .line 427
    .line 428
    const v5, 0x2fd4df92

    .line 429
    .line 430
    .line 431
    invoke-direct {v0, v5, v8, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v2, v9, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 435
    .line 436
    .line 437
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_8
    check-cast v0, La/ztv;

    .line 441
    .line 442
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 443
    .line 444
    move-object/from16 v1, p1

    .line 445
    .line 446
    check-cast v1, La/hcz;

    .line 447
    .line 448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    new-instance v6, La/elm;

    .line 452
    .line 453
    invoke-direct {v6, v0, v2}, La/elm;-><init>(Ljava/lang/Object;B)V

    .line 454
    .line 455
    .line 456
    new-instance v2, La/ugd;

    .line 457
    .line 458
    const v11, -0x25793cb5

    .line 459
    .line 460
    .line 461
    invoke-direct {v2, v11, v8, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-static {v1, v9, v9, v2, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 465
    .line 466
    .line 467
    iget-object v2, v0, La/ztv;->a:La/nep0;

    .line 468
    .line 469
    iget-object v2, v2, La/nep0;->b:La/a4x;

    .line 470
    .line 471
    new-instance v5, La/s3t;

    .line 472
    .line 473
    invoke-direct {v5, v3}, La/s3t;-><init>(B)V

    .line 474
    .line 475
    .line 476
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    new-instance v6, La/d2p;

    .line 481
    .line 482
    invoke-direct {v6, v5, v2, v4}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 483
    .line 484
    .line 485
    new-instance v4, La/far;

    .line 486
    .line 487
    const/16 v5, 0xd

    .line 488
    .line 489
    invoke-direct {v4, v2, v5}, La/far;-><init>(Ljava/util/List;B)V

    .line 490
    .line 491
    .line 492
    new-instance v5, La/c8;

    .line 493
    .line 494
    const/16 v9, 0x1b

    .line 495
    .line 496
    invoke-direct {v5, v2, v0, v10, v9}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 497
    .line 498
    .line 499
    new-instance v0, La/ugd;

    .line 500
    .line 501
    invoke-direct {v0, v7, v8, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1, v3, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 505
    .line 506
    .line 507
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    return-object v0

    .line 510
    :pswitch_9
    check-cast v0, La/kie0;

    .line 511
    .line 512
    check-cast v10, La/kie0;

    .line 513
    .line 514
    move-object/from16 v1, p1

    .line 515
    .line 516
    check-cast v1, Lkotlin/text/MatchResult;

    .line 517
    .line 518
    iget v2, v0, La/kie0;->a:I

    .line 519
    .line 520
    const/4 v3, -0x1

    .line 521
    if-ne v2, v3, :cond_3

    .line 522
    .line 523
    invoke-interface {v1}, Lkotlin/text/MatchResult;->b()Lkotlin/ranges/IntRange;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    iget v2, v2, Lkotlin/ranges/a;->a:I

    .line 528
    .line 529
    iput v2, v0, La/kie0;->a:I

    .line 530
    .line 531
    :cond_3
    invoke-interface {v1}, Lkotlin/text/MatchResult;->b()Lkotlin/ranges/IntRange;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    iget v0, v0, Lkotlin/ranges/a;->b:I

    .line 536
    .line 537
    add-int/2addr v0, v8

    .line 538
    iput v0, v10, La/kie0;->a:I

    .line 539
    .line 540
    const-string v0, ""

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_a
    check-cast v0, La/hmv;

    .line 544
    .line 545
    check-cast v10, La/llo;

    .line 546
    .line 547
    move-object/from16 v1, p1

    .line 548
    .line 549
    check-cast v1, Ljava/lang/Throwable;

    .line 550
    .line 551
    iget-object v0, v0, La/hmv;->c:Landroid/os/Handler;

    .line 552
    .line 553
    invoke-virtual {v0, v10}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 554
    .line 555
    .line 556
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    return-object v0

    .line 559
    :pswitch_b
    check-cast v0, La/vft;

    .line 560
    .line 561
    check-cast v10, La/cp;

    .line 562
    .line 563
    move-object/from16 v1, p1

    .line 564
    .line 565
    check-cast v1, Landroid/view/View;

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v0, v1}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_c
    check-cast v0, La/jdv;

    .line 581
    .line 582
    check-cast v10, La/pz40;

    .line 583
    .line 584
    move-object/from16 v1, p1

    .line 585
    .line 586
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    check-cast v1, La/adv;

    .line 596
    .line 597
    if-eqz v1, :cond_4

    .line 598
    .line 599
    iget-object v0, v0, La/jdv;->a:La/gdv;

    .line 600
    .line 601
    iget-object v2, v0, La/gdv;->b:Ljava/util/ArrayList;

    .line 602
    .line 603
    iget-object v3, v0, La/gdv;->c:Ljava/util/List;

    .line 604
    .line 605
    iget-object v4, v0, La/gdv;->a:Ljava/util/List;

    .line 606
    .line 607
    iget-object v0, v0, La/gdv;->d:La/w8b;

    .line 608
    .line 609
    invoke-virtual {v1, v2, v3, v4, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 610
    .line 611
    .line 612
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    return-object v0

    .line 615
    :pswitch_d
    check-cast v0, La/nkt;

    .line 616
    .line 617
    check-cast v10, La/vne;

    .line 618
    .line 619
    move-object/from16 v1, p1

    .line 620
    .line 621
    check-cast v1, Ljava/lang/Throwable;

    .line 622
    .line 623
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    iget-object v2, v0, La/nkt;->i:La/p7m0;

    .line 630
    .line 631
    sget-object v3, La/i8d;->e:La/i8d;

    .line 632
    .line 633
    invoke-virtual {v2, v9, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v1, v10}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 637
    .line 638
    .line 639
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    return-object v0

    .line 642
    :pswitch_e
    check-cast v0, La/wpq;

    .line 643
    .line 644
    check-cast v10, La/pkk0;

    .line 645
    .line 646
    move-object/from16 v1, p1

    .line 647
    .line 648
    check-cast v1, La/jly;

    .line 649
    .line 650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    invoke-static {v0}, La/wpq;->a(La/wpq;)V

    .line 654
    .line 655
    .line 656
    if-eqz v10, :cond_5

    .line 657
    .line 658
    check-cast v10, La/r3k;

    .line 659
    .line 660
    invoke-virtual {v10}, La/r3k;->a()V

    .line 661
    .line 662
    .line 663
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 664
    .line 665
    return-object v0

    .line 666
    :pswitch_f
    check-cast v0, La/ur6;

    .line 667
    .line 668
    check-cast v10, La/cp;

    .line 669
    .line 670
    move-object/from16 v1, p1

    .line 671
    .line 672
    check-cast v1, Landroid/view/View;

    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-virtual {v0, v1}, La/ur6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    return-object v0

    .line 687
    :pswitch_10
    check-cast v0, La/c0t;

    .line 688
    .line 689
    check-cast v10, La/jlr;

    .line 690
    .line 691
    move-object/from16 v1, p1

    .line 692
    .line 693
    check-cast v1, La/k0w0;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    iget-object v2, v0, La/c0t;->M:La/kys0;

    .line 699
    .line 700
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    check-cast v0, La/wrs;

    .line 705
    .line 706
    iget-object v8, v0, La/wrs;->g:Ljava/lang/String;

    .line 707
    .line 708
    check-cast v10, La/clr;

    .line 709
    .line 710
    iget-wide v4, v10, La/clr;->b:J

    .line 711
    .line 712
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    new-instance v3, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 716
    .line 717
    const-wide/16 v6, 0xbd

    .line 718
    .line 719
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;-><init>(JJLjava/lang/String;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v1, v3}, La/k0w0;->k(La/m7h0;)V

    .line 723
    .line 724
    .line 725
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 726
    .line 727
    return-object v0

    .line 728
    :pswitch_11
    check-cast v0, La/c0t;

    .line 729
    .line 730
    check-cast v10, Ljava/lang/String;

    .line 731
    .line 732
    move-object/from16 v1, p1

    .line 733
    .line 734
    check-cast v1, La/k0w0;

    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    iget-object v2, v0, La/c0t;->M:La/kys0;

    .line 740
    .line 741
    iget-object v0, v0, La/c0t;->r:Lorg/xplatform/ufc/api/game/UfcGameParams;

    .line 742
    .line 743
    iget-wide v3, v0, Lorg/xplatform/ufc/api/game/UfcGameParams;->e:J

    .line 744
    .line 745
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    new-instance v0, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 749
    .line 750
    invoke-direct {v0, v3, v4, v10}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;-><init>(JLjava/lang/String;)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 754
    .line 755
    .line 756
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_12
    check-cast v0, La/c0t;

    .line 760
    .line 761
    check-cast v10, La/tlr;

    .line 762
    .line 763
    move-object/from16 v1, p1

    .line 764
    .line 765
    check-cast v1, La/k0w0;

    .line 766
    .line 767
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    iget-object v0, v0, La/c0t;->M:La/kys0;

    .line 771
    .line 772
    iget-object v7, v10, La/tlr;->a:Ljava/lang/String;

    .line 773
    .line 774
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 775
    .line 776
    .line 777
    new-instance v2, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 778
    .line 779
    const-wide/16 v3, -0x1

    .line 780
    .line 781
    const-wide/16 v5, 0xbd

    .line 782
    .line 783
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;-><init>(JJLjava/lang/String;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 787
    .line 788
    .line 789
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 790
    .line 791
    return-object v0

    .line 792
    :pswitch_13
    check-cast v0, La/i4;

    .line 793
    .line 794
    check-cast v10, La/pz40;

    .line 795
    .line 796
    move-object/from16 v1, p1

    .line 797
    .line 798
    check-cast v1, Ljava/lang/Integer;

    .line 799
    .line 800
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 801
    .line 802
    .line 803
    move-result v1

    .line 804
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    check-cast v0, La/bts;

    .line 809
    .line 810
    if-eqz v0, :cond_6

    .line 811
    .line 812
    invoke-interface {v10, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 816
    .line 817
    return-object v0

    .line 818
    :pswitch_14
    check-cast v0, La/pq8;

    .line 819
    .line 820
    check-cast v10, Landroid/view/View;

    .line 821
    .line 822
    move-object/from16 v1, p1

    .line 823
    .line 824
    check-cast v1, Landroid/widget/FrameLayout;

    .line 825
    .line 826
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 830
    .line 831
    invoke-static {v10}, Landroidx/fragment/app/e;->H(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    const-string v2, "video_fragment_tag"

    .line 843
    .line 844
    invoke-static {v1, v2}, La/zss;->d(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    const-string v2, "zone_fragment_tag"

    .line 848
    .line 849
    invoke-static {v1, v2}, La/zss;->d(Landroidx/fragment/app/e;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 850
    .line 851
    .line 852
    goto :goto_3

    .line 853
    :catchall_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 854
    .line 855
    :goto_3
    iput-object v9, v0, La/pq8;->a:Lkotlin/Pair;

    .line 856
    .line 857
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    return-object v0

    .line 860
    :pswitch_15
    check-cast v0, La/yks;

    .line 861
    .line 862
    check-cast v10, Ljava/lang/String;

    .line 863
    .line 864
    move-object/from16 v1, p1

    .line 865
    .line 866
    check-cast v1, La/k0w0;

    .line 867
    .line 868
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    iget-object v2, v0, La/yks;->s:La/rl70;

    .line 872
    .line 873
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    check-cast v3, La/njs;

    .line 878
    .line 879
    iget-object v3, v3, La/njs;->b:Ljava/lang/String;

    .line 880
    .line 881
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    check-cast v0, La/njs;

    .line 886
    .line 887
    iget-wide v4, v0, La/njs;->e:J

    .line 888
    .line 889
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    invoke-static {v4, v5, v10, v3}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 897
    .line 898
    .line 899
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_16
    check-cast v0, La/yks;

    .line 903
    .line 904
    check-cast v10, La/sis;

    .line 905
    .line 906
    move-object/from16 v1, p1

    .line 907
    .line 908
    check-cast v1, La/k0w0;

    .line 909
    .line 910
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    iget-object v2, v0, La/yks;->N:La/yfm0;

    .line 914
    .line 915
    check-cast v10, La/qis;

    .line 916
    .line 917
    iget-object v3, v10, La/qis;->a:Ljava/lang/String;

    .line 918
    .line 919
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    check-cast v0, La/njs;

    .line 924
    .line 925
    iget-wide v4, v0, La/njs;->e:J

    .line 926
    .line 927
    check-cast v2, La/zfm0;

    .line 928
    .line 929
    invoke-virtual {v2, v4, v5, v3}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 934
    .line 935
    .line 936
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 937
    .line 938
    return-object v0

    .line 939
    :pswitch_17
    check-cast v0, La/cgk0;

    .line 940
    .line 941
    check-cast v10, Ljava/util/ArrayList;

    .line 942
    .line 943
    move-object/from16 v1, p1

    .line 944
    .line 945
    check-cast v1, La/ou90;

    .line 946
    .line 947
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 951
    .line 952
    .line 953
    move-result v0

    .line 954
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 955
    .line 956
    .line 957
    move-result-object v2

    .line 958
    :cond_7
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 959
    .line 960
    .line 961
    move-result v3

    .line 962
    if-eqz v3, :cond_b

    .line 963
    .line 964
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v3

    .line 968
    check-cast v3, La/pu90;

    .line 969
    .line 970
    invoke-virtual {v3}, La/pu90;->n()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    instance-of v5, v4, La/mh00;

    .line 975
    .line 976
    if-eqz v5, :cond_8

    .line 977
    .line 978
    check-cast v4, La/mh00;

    .line 979
    .line 980
    goto :goto_5

    .line 981
    :cond_8
    move-object v4, v9

    .line 982
    :goto_5
    if-eqz v4, :cond_9

    .line 983
    .line 984
    iget-object v4, v4, La/mh00;->b:Ljava/lang/String;

    .line 985
    .line 986
    goto :goto_6

    .line 987
    :cond_9
    move-object v4, v9

    .line 988
    :goto_6
    const-string v5, "TOOLBAR_ID"

    .line 989
    .line 990
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-result v5

    .line 994
    const/4 v7, 0x0

    .line 995
    if-eqz v5, :cond_a

    .line 996
    .line 997
    invoke-virtual {v1, v3, v6, v0, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 998
    .line 999
    .line 1000
    iget v3, v3, La/pu90;->b:I

    .line 1001
    .line 1002
    add-int/2addr v0, v3

    .line 1003
    goto :goto_4

    .line 1004
    :cond_a
    const-string v5, "CONTENT_ID"

    .line 1005
    .line 1006
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v4

    .line 1010
    if-eqz v4, :cond_7

    .line 1011
    .line 1012
    invoke-virtual {v1, v3, v6, v0, v7}, La/ou90;->m(La/pu90;IIF)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_4

    .line 1016
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1017
    .line 1018
    return-object v0

    .line 1019
    :pswitch_18
    check-cast v0, La/sbs;

    .line 1020
    .line 1021
    check-cast v10, Ljava/lang/String;

    .line 1022
    .line 1023
    move-object/from16 v1, p1

    .line 1024
    .line 1025
    check-cast v1, La/k0w0;

    .line 1026
    .line 1027
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    iget-object v2, v0, La/sbs;->A:La/rl70;

    .line 1031
    .line 1032
    iget-object v3, v0, La/sbs;->s:Ljava/lang/String;

    .line 1033
    .line 1034
    iget-wide v4, v0, La/sbs;->r:J

    .line 1035
    .line 1036
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    invoke-static {v4, v5, v10, v3}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1044
    .line 1045
    .line 1046
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1047
    .line 1048
    return-object v0

    .line 1049
    :pswitch_19
    check-cast v0, La/g9s;

    .line 1050
    .line 1051
    check-cast v10, Ljava/lang/String;

    .line 1052
    .line 1053
    move-object/from16 v1, p1

    .line 1054
    .line 1055
    check-cast v1, La/k0w0;

    .line 1056
    .line 1057
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    iget-object v2, v0, La/g9s;->s:La/rl70;

    .line 1061
    .line 1062
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v3

    .line 1066
    check-cast v3, La/r7s;

    .line 1067
    .line 1068
    iget-object v3, v3, La/r7s;->b:Ljava/lang/String;

    .line 1069
    .line 1070
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    check-cast v0, La/r7s;

    .line 1075
    .line 1076
    iget-wide v4, v0, La/r7s;->e:J

    .line 1077
    .line 1078
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v4, v5, v10, v3}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1086
    .line 1087
    .line 1088
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1089
    .line 1090
    return-object v0

    .line 1091
    :pswitch_1a
    check-cast v0, La/g9s;

    .line 1092
    .line 1093
    check-cast v10, La/v6s;

    .line 1094
    .line 1095
    move-object/from16 v1, p1

    .line 1096
    .line 1097
    check-cast v1, La/k0w0;

    .line 1098
    .line 1099
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    iget-object v2, v0, La/g9s;->N:La/yfm0;

    .line 1103
    .line 1104
    check-cast v10, La/t6s;

    .line 1105
    .line 1106
    iget-object v3, v10, La/t6s;->a:Ljava/lang/String;

    .line 1107
    .line 1108
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    check-cast v0, La/r7s;

    .line 1113
    .line 1114
    iget-wide v4, v0, La/r7s;->e:J

    .line 1115
    .line 1116
    check-cast v2, La/zfm0;

    .line 1117
    .line 1118
    invoke-virtual {v2, v4, v5, v3}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1123
    .line 1124
    .line 1125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1126
    .line 1127
    return-object v0

    .line 1128
    :pswitch_1b
    check-cast v0, La/k4s;

    .line 1129
    .line 1130
    check-cast v10, La/v1s;

    .line 1131
    .line 1132
    move-object/from16 v1, p1

    .line 1133
    .line 1134
    check-cast v1, La/k0w0;

    .line 1135
    .line 1136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    iget-object v2, v0, La/k4s;->s:La/yfm0;

    .line 1140
    .line 1141
    check-cast v10, La/s1s;

    .line 1142
    .line 1143
    iget-object v3, v10, La/s1s;->a:Ljava/lang/String;

    .line 1144
    .line 1145
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    check-cast v0, La/z2s;

    .line 1150
    .line 1151
    iget-wide v4, v0, La/z2s;->e:J

    .line 1152
    .line 1153
    check-cast v2, La/zfm0;

    .line 1154
    .line 1155
    invoke-virtual {v2, v4, v5, v3}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1160
    .line 1161
    .line 1162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1163
    .line 1164
    return-object v0

    .line 1165
    :pswitch_1c
    check-cast v0, La/k4s;

    .line 1166
    .line 1167
    check-cast v10, Ljava/lang/String;

    .line 1168
    .line 1169
    move-object/from16 v1, p1

    .line 1170
    .line 1171
    check-cast v1, La/k0w0;

    .line 1172
    .line 1173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    iget-object v2, v0, La/k4s;->T:La/rl70;

    .line 1177
    .line 1178
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v3

    .line 1182
    check-cast v3, La/z2s;

    .line 1183
    .line 1184
    iget-object v3, v3, La/z2s;->b:Ljava/lang/String;

    .line 1185
    .line 1186
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    check-cast v0, La/z2s;

    .line 1191
    .line 1192
    iget-wide v4, v0, La/z2s;->e:J

    .line 1193
    .line 1194
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    invoke-static {v4, v5, v10, v3}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1202
    .line 1203
    .line 1204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    return-object v0

    .line 1207
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
