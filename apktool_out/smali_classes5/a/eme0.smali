.class public final synthetic La/eme0;
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
    iput-byte p2, p0, La/eme0;->a:B

    iput-object p1, p0, La/eme0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/eme0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x7

    .line 5
    const/16 v3, 0x11

    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x3

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    iget-object p0, p0, La/eme0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, La/zug0;

    .line 18
    .line 19
    check-cast p1, Landroid/view/View;

    .line 20
    .line 21
    sget-object v0, La/zug0;->V1:La/gne0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/zug0;->I0()La/cxg0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p1, p0, La/cxg0;->A:La/qoj0;

    .line 31
    .line 32
    iget-object v0, p0, La/cxg0;->k:La/nj7;

    .line 33
    .line 34
    iget-object v1, p0, La/cxg0;->l:La/n3w;

    .line 35
    .line 36
    invoke-static {v1}, La/xkb;->N(La/n3w;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v1}, La/xkb;->f0(La/n3w;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v4, v0, La/nj7;->a:La/b4j;

    .line 51
    .line 52
    sget-object v5, La/a1w;->k:La/a1w;

    .line 53
    .line 54
    sget-object v6, La/r6w;->j:La/r6w;

    .line 55
    .line 56
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-lez v8, :cond_0

    .line 66
    .line 67
    sget-object v8, La/a1w;->d:La/a1w;

    .line 68
    .line 69
    invoke-virtual {v8}, La/a1w;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-interface {v7, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-lez v8, :cond_1

    .line 81
    .line 82
    sget-object v8, La/a1w;->e:La/a1w;

    .line 83
    .line 84
    invoke-virtual {v8}, La/a1w;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface {v7, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :cond_1
    invoke-virtual {v4, v5, v6, v7}, La/b4j;->g(La/a1w;La/r6w;Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v0, La/nj7;->b:La/au0;

    .line 95
    .line 96
    invoke-virtual {v6}, La/r6w;->a()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v0, v4, v2, v3}, La/au0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-boolean v0, p0, La/cxg0;->q:Z

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    iget-boolean v0, p0, La/cxg0;->m:Z

    .line 108
    .line 109
    if-nez v0, :cond_2

    .line 110
    .line 111
    new-instance v0, La/kwg0;

    .line 112
    .line 113
    iget-object p0, p0, La/cxg0;->r:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 114
    .line 115
    iget-wide v2, p0, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;->c:D

    .line 116
    .line 117
    invoke-direct {v0, v1, v2, v3}, La/kwg0;-><init>(La/n3w;D)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    new-instance v4, La/lwg0;

    .line 125
    .line 126
    iget-object v5, p0, La/cxg0;->l:La/n3w;

    .line 127
    .line 128
    iget-object v6, p0, La/cxg0;->r:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 129
    .line 130
    iget-boolean v7, p0, La/cxg0;->m:Z

    .line 131
    .line 132
    iget-wide v8, p0, La/cxg0;->v:D

    .line 133
    .line 134
    invoke-direct/range {v4 .. v9}, La/lwg0;-><init>(La/n3w;Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;ZD)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v4}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_0
    check-cast p0, La/mog0;

    .line 144
    .line 145
    check-cast p1, Ljava/lang/Throwable;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v0, La/iog0;

    .line 151
    .line 152
    invoke-virtual {p0}, La/mog0;->w()La/jkm;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-direct {v0, v1}, La/iog0;-><init>(La/jkm;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, La/mog0;->s:La/p7m0;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v8, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    iget-object p0, p0, La/mog0;->h:La/duj;

    .line 168
    .line 169
    new-instance v0, La/vtf0;

    .line 170
    .line 171
    const/16 v1, 0x1a

    .line 172
    .line 173
    invoke-direct {v0, v1}, La/vtf0;-><init>(B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_1
    check-cast p0, La/dmg0;

    .line 183
    .line 184
    check-cast p1, La/uag0;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget v0, p0, La/dmg0;->a:I

    .line 190
    .line 191
    const/high16 v1, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/4 v2, 0x0

    .line 194
    if-lez v0, :cond_3

    .line 195
    .line 196
    iget-object v0, p0, La/dmg0;->b:La/agk0;

    .line 197
    .line 198
    invoke-virtual {v0}, La/agk0;->l()F

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iget p0, p0, La/dmg0;->a:I

    .line 203
    .line 204
    int-to-float p0, p0

    .line 205
    div-float/2addr v0, p0

    .line 206
    invoke-static {v0, v2, v1}, La/l1e0;->c(FFF)F

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    :cond_3
    sub-float/2addr v1, v2

    .line 211
    invoke-virtual {p1, v1}, La/uag0;->b(F)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_2
    check-cast p0, La/o470;

    .line 218
    .line 219
    check-cast p1, La/cp;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 225
    .line 226
    check-cast v0, La/u7z;

    .line 227
    .line 228
    iget-object v1, v0, La/u7z;->b:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 229
    .line 230
    new-instance v5, La/bs50;

    .line 231
    .line 232
    invoke-direct {v5, p1, p0, v2}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    .line 237
    .line 238
    iget-object v0, v0, La/u7z;->c:Landroid/widget/LinearLayout;

    .line 239
    .line 240
    new-instance v1, La/jpe0;

    .line 241
    .line 242
    invoke-direct {v1, p0, v4}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    .line 247
    .line 248
    new-instance p0, La/ui80;

    .line 249
    .line 250
    invoke-direct {p0, p1, v3}, La/ui80;-><init>(La/cp;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 254
    .line 255
    .line 256
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_3
    check-cast p0, La/i4;

    .line 260
    .line 261
    check-cast p1, La/hcz;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    new-instance v2, La/pn7;

    .line 271
    .line 272
    invoke-direct {v2, p0, v4}, La/pn7;-><init>(La/i4;B)V

    .line 273
    .line 274
    .line 275
    new-instance v3, La/qn7;

    .line 276
    .line 277
    invoke-direct {v3, p0, v1}, La/qn7;-><init>(La/i4;B)V

    .line 278
    .line 279
    .line 280
    new-instance p0, La/ugd;

    .line 281
    .line 282
    const v1, 0x2fd4df92

    .line 283
    .line 284
    .line 285
    invoke-direct {p0, v1, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, v0, v8, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 289
    .line 290
    .line 291
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    return-object p0

    .line 294
    :pswitch_4
    check-cast p0, La/feg0;

    .line 295
    .line 296
    check-cast p1, La/xpg0;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget v0, p0, La/feg0;->g:I

    .line 302
    .line 303
    if-gt v6, v0, :cond_b

    .line 304
    .line 305
    move v2, v6

    .line 306
    :goto_1
    iget-object v3, p0, La/feg0;->f:[I

    .line 307
    .line 308
    aget v3, v3, v2

    .line 309
    .line 310
    if-eq v3, v6, :cond_a

    .line 311
    .line 312
    if-eq v3, v1, :cond_9

    .line 313
    .line 314
    if-eq v3, v5, :cond_8

    .line 315
    .line 316
    const-string v7, "Required value was null."

    .line 317
    .line 318
    if-eq v3, v4, :cond_6

    .line 319
    .line 320
    const/4 v9, 0x5

    .line 321
    if-eq v3, v9, :cond_4

    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_4
    iget-object v3, p0, La/feg0;->e:[[B

    .line 325
    .line 326
    aget-object v3, v3, v2

    .line 327
    .line 328
    if-eqz v3, :cond_5

    .line 329
    .line 330
    invoke-interface {p1, v3, v2}, La/xpg0;->i([BI)V

    .line 331
    .line 332
    .line 333
    goto :goto_2

    .line 334
    :cond_5
    invoke-static {v7}, La/jf4;->o(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_6
    iget-object v3, p0, La/feg0;->d:[Ljava/lang/String;

    .line 339
    .line 340
    aget-object v3, v3, v2

    .line 341
    .line 342
    if-eqz v3, :cond_7

    .line 343
    .line 344
    invoke-interface {p1, v2, v3}, La/xpg0;->z(ILjava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto :goto_2

    .line 348
    :cond_7
    invoke-static {v7}, La/jf4;->o(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_8
    iget-object v3, p0, La/feg0;->c:[D

    .line 353
    .line 354
    aget-wide v9, v3, v2

    .line 355
    .line 356
    invoke-interface {p1, v9, v10, v2}, La/xpg0;->p(DI)V

    .line 357
    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_9
    iget-object v3, p0, La/feg0;->b:[J

    .line 361
    .line 362
    aget-wide v9, v3, v2

    .line 363
    .line 364
    invoke-interface {p1, v2, v9, v10}, La/xpg0;->o(IJ)V

    .line 365
    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_a
    invoke-interface {p1, v2}, La/xpg0;->s(I)V

    .line 369
    .line 370
    .line 371
    :goto_2
    if-eq v2, v0, :cond_b

    .line 372
    .line 373
    add-int/lit8 v2, v2, 0x1

    .line 374
    .line 375
    goto :goto_1

    .line 376
    :cond_b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    :goto_3
    return-object v8

    .line 379
    :pswitch_5
    check-cast p0, La/eme0;

    .line 380
    .line 381
    check-cast p1, La/xpg0;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    new-instance v0, La/a38;

    .line 387
    .line 388
    invoke-direct {v0, p1}, La/a38;-><init>(La/xpg0;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p0, v0}, La/eme0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object p0

    .line 397
    :pswitch_6
    check-cast p0, La/udg0;

    .line 398
    .line 399
    check-cast p1, La/w7r;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    iput-object p1, p0, La/udg0;->g:La/w7r;

    .line 405
    .line 406
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object p0

    .line 409
    :pswitch_7
    check-cast p0, La/tdg0;

    .line 410
    .line 411
    check-cast p1, La/qpg0;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    new-instance v0, La/k6d0;

    .line 417
    .line 418
    const/16 v1, 0x13

    .line 419
    .line 420
    invoke-direct {v0, p0, p1, v8, v1}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 421
    .line 422
    .line 423
    invoke-static {v0}, La/saj;->b0(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_8
    check-cast p0, La/cdg0;

    .line 430
    .line 431
    check-cast p1, La/abi0;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    iget-boolean p0, p0, La/cdg0;->e:Z

    .line 437
    .line 438
    sget-object v0, La/bdg0;->b:La/zai0;

    .line 439
    .line 440
    sget-object v1, La/bdg0;->a:[La/iiy;

    .line 441
    .line 442
    aget-object v1, v1, v7

    .line 443
    .line 444
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    return-object p0

    .line 457
    :pswitch_9
    check-cast p0, La/pbg0;

    .line 458
    .line 459
    check-cast p1, Ljava/lang/Throwable;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    iget-object v0, p0, La/pbg0;->f:La/duj;

    .line 465
    .line 466
    new-instance v1, La/dke0;

    .line 467
    .line 468
    invoke-direct {v1, p0, v3}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 472
    .line 473
    .line 474
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object p0

    .line 477
    :pswitch_a
    check-cast p0, La/y7g0;

    .line 478
    .line 479
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    instance-of v1, v0, La/x7g0;

    .line 489
    .line 490
    if-eqz v1, :cond_c

    .line 491
    .line 492
    move-object v8, v0

    .line 493
    check-cast v8, La/x7g0;

    .line 494
    .line 495
    :cond_c
    if-eqz v8, :cond_d

    .line 496
    .line 497
    iget-object v0, p0, La/y7g0;->b:Ljava/util/ArrayList;

    .line 498
    .line 499
    iget-object v1, p0, La/y7g0;->c:Ljava/util/ArrayList;

    .line 500
    .line 501
    iget-object v2, p0, La/y7g0;->a:Ljava/util/ArrayList;

    .line 502
    .line 503
    iget-object p0, p0, La/y7g0;->d:La/n6g0;

    .line 504
    .line 505
    invoke-virtual {v8, v0, v1, v2, p0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 506
    .line 507
    .line 508
    :cond_d
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 527
    .line 528
    .line 529
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_b
    check-cast p0, La/g2g0;

    .line 533
    .line 534
    check-cast p1, Ljava/lang/Integer;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result p1

    .line 540
    new-instance v0, La/h2g0;

    .line 541
    .line 542
    invoke-direct {v0, p1}, La/h2g0;-><init>(I)V

    .line 543
    .line 544
    .line 545
    sget p1, La/g2g0;->s:I

    .line 546
    .line 547
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object p0

    .line 553
    :pswitch_c
    check-cast p0, La/ayf0;

    .line 554
    .line 555
    check-cast p1, La/iqt0;

    .line 556
    .line 557
    sget-object v0, La/ayf0;->S1:La/eke0;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-virtual {p0}, La/ayf0;->H0()La/nyf0;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    iget-object p0, p0, La/nyf0;->p:La/z4w0;

    .line 567
    .line 568
    invoke-virtual {p0, p1}, La/z4w0;->a(La/iqt0;)V

    .line 569
    .line 570
    .line 571
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 572
    .line 573
    return-object p0

    .line 574
    :pswitch_d
    check-cast p0, La/aif0;

    .line 575
    .line 576
    check-cast p1, La/cp;

    .line 577
    .line 578
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    new-instance v0, La/dff0;

    .line 582
    .line 583
    const/16 v1, 0xa

    .line 584
    .line 585
    invoke-direct {v0, p1, p0, v1}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 589
    .line 590
    .line 591
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object p0

    .line 594
    :pswitch_e
    check-cast p0, La/due0;

    .line 595
    .line 596
    check-cast p1, La/cp;

    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    new-instance v0, La/utf0;

    .line 602
    .line 603
    invoke-direct {v0, p1, p0}, La/utf0;-><init>(La/cp;La/due0;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {p1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 607
    .line 608
    .line 609
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    return-object p0

    .line 612
    :pswitch_f
    check-cast p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 613
    .line 614
    check-cast p1, La/mrf0;

    .line 615
    .line 616
    sget v0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->m:I

    .line 617
    .line 618
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget-object v0, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->a:Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    iget v1, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->d:I

    .line 628
    .line 629
    add-int/2addr v1, v6

    .line 630
    iput v1, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->d:I

    .line 631
    .line 632
    if-lt v1, v0, :cond_e

    .line 633
    .line 634
    iget-object p0, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->c:Lkotlin/jvm/functions/Function1;

    .line 635
    .line 636
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    return-object p0

    .line 642
    :pswitch_10
    check-cast p0, La/gkf0;

    .line 643
    .line 644
    check-cast p1, La/gkf0;

    .line 645
    .line 646
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    iget-object p1, p1, La/gkf0;->a:La/ncz;

    .line 650
    .line 651
    iget p1, p1, La/ncz;->a:I

    .line 652
    .line 653
    iget-object p0, p0, La/gkf0;->a:La/ncz;

    .line 654
    .line 655
    iget p0, p0, La/ncz;->a:I

    .line 656
    .line 657
    if-eq p1, p0, :cond_f

    .line 658
    .line 659
    goto :goto_4

    .line 660
    :cond_f
    move v6, v7

    .line 661
    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    return-object p0

    .line 666
    :pswitch_11
    check-cast p0, La/jif0;

    .line 667
    .line 668
    check-cast p1, Ljava/lang/Throwable;

    .line 669
    .line 670
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    instance-of v0, p1, La/zhi0;

    .line 674
    .line 675
    sget-object v1, La/dif0;->a:La/dif0;

    .line 676
    .line 677
    if-nez v0, :cond_10

    .line 678
    .line 679
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    goto/16 :goto_9

    .line 683
    .line 684
    :cond_10
    move-object v0, p1

    .line 685
    check-cast v0, La/zhi0;

    .line 686
    .line 687
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 688
    .line 689
    sget-object v2, La/i2o;->v4:La/i2o;

    .line 690
    .line 691
    const-string v3, ""

    .line 692
    .line 693
    if-ne v0, v2, :cond_13

    .line 694
    .line 695
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    if-nez p1, :cond_11

    .line 700
    .line 701
    goto :goto_5

    .line 702
    :cond_11
    move-object v3, p1

    .line 703
    :goto_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 704
    .line 705
    .line 706
    move-result p1

    .line 707
    if-lez p1, :cond_12

    .line 708
    .line 709
    new-instance p1, La/eif0;

    .line 710
    .line 711
    invoke-direct {p1, v3}, La/eif0;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    :cond_12
    iget-object p0, p0, La/jif0;->s:La/i1w0;

    .line 718
    .line 719
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 720
    .line 721
    .line 722
    move-result-object p1

    .line 723
    new-instance v0, La/c8d;

    .line 724
    .line 725
    sget-object v1, La/y7d;->a:La/v7d;

    .line 726
    .line 727
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 728
    .line 729
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 730
    .line 731
    .line 732
    invoke-static {p1, v0, p0, p1, v7}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    :goto_6
    move-object v0, p1

    .line 737
    check-cast v0, La/paw;

    .line 738
    .line 739
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    if-eqz v1, :cond_17

    .line 744
    .line 745
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    check-cast v0, La/oe50;

    .line 750
    .line 751
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 752
    .line 753
    .line 754
    goto :goto_6

    .line 755
    :cond_13
    sget-object v2, La/i2o;->D4:La/i2o;

    .line 756
    .line 757
    if-eq v0, v2, :cond_15

    .line 758
    .line 759
    sget-object v2, La/i2o;->C4:La/i2o;

    .line 760
    .line 761
    if-ne v0, v2, :cond_14

    .line 762
    .line 763
    goto :goto_7

    .line 764
    :cond_14
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    goto :goto_9

    .line 768
    :cond_15
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object p1

    .line 772
    if-nez p1, :cond_16

    .line 773
    .line 774
    goto :goto_8

    .line 775
    :cond_16
    move-object v3, p1

    .line 776
    :goto_8
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 777
    .line 778
    .line 779
    move-result p1

    .line 780
    if-lez p1, :cond_17

    .line 781
    .line 782
    new-instance p1, La/eif0;

    .line 783
    .line 784
    invoke-direct {p1, v3}, La/eif0;-><init>(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 788
    .line 789
    .line 790
    :cond_17
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 791
    .line 792
    return-object p0

    .line 793
    :pswitch_12
    check-cast p0, La/u0h0;

    .line 794
    .line 795
    check-cast p1, La/pz40;

    .line 796
    .line 797
    instance-of v0, p1, La/fgk0;

    .line 798
    .line 799
    if-eqz v0, :cond_19

    .line 800
    .line 801
    check-cast p1, La/fgk0;

    .line 802
    .line 803
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    if-eqz v0, :cond_18

    .line 808
    .line 809
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    invoke-interface {p0, v0}, La/u0h0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v8

    .line 820
    :cond_18
    invoke-interface {p1}, La/fgk0;->d()La/igk0;

    .line 821
    .line 822
    .line 823
    move-result-object p0

    .line 824
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    invoke-static {v8, p0}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 828
    .line 829
    .line 830
    move-result-object v8

    .line 831
    goto :goto_a

    .line 832
    :cond_19
    const-string p0, "Failed requirement."

    .line 833
    .line 834
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    :goto_a
    return-object v8

    .line 838
    :pswitch_13
    check-cast p0, La/ye50;

    .line 839
    .line 840
    check-cast p1, La/lwk;

    .line 841
    .line 842
    new-instance p1, La/ty2;

    .line 843
    .line 844
    const/16 v0, 0x15

    .line 845
    .line 846
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 847
    .line 848
    .line 849
    return-object p1

    .line 850
    :pswitch_14
    check-cast p0, Landroid/view/Window;

    .line 851
    .line 852
    check-cast p1, La/lwk;

    .line 853
    .line 854
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    new-instance p1, La/taf0;

    .line 858
    .line 859
    invoke-direct {p1, p0, v7}, La/taf0;-><init>(Landroid/view/Window;B)V

    .line 860
    .line 861
    .line 862
    return-object p1

    .line 863
    :pswitch_15
    check-cast p0, La/d7f0;

    .line 864
    .line 865
    check-cast p1, La/k0w0;

    .line 866
    .line 867
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    iget-object p0, p0, La/d7f0;->J:La/mi70;

    .line 871
    .line 872
    new-instance v0, La/i38;

    .line 873
    .line 874
    invoke-direct {v0, v3}, La/i38;-><init>(I)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 881
    .line 882
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 886
    .line 887
    .line 888
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 889
    .line 890
    return-object p0

    .line 891
    :pswitch_16
    check-cast p0, La/lue0;

    .line 892
    .line 893
    check-cast p1, Ljava/lang/Throwable;

    .line 894
    .line 895
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    iget-object p0, p0, La/lue0;->p:La/duj;

    .line 899
    .line 900
    new-instance v0, La/yr0;

    .line 901
    .line 902
    const/16 v1, 0x18

    .line 903
    .line 904
    invoke-direct {v0, p1, v1}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 908
    .line 909
    .line 910
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 911
    .line 912
    return-object p0

    .line 913
    :pswitch_17
    check-cast p0, La/gue0;

    .line 914
    .line 915
    check-cast p1, Ljava/lang/Throwable;

    .line 916
    .line 917
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    iget-object p0, p0, La/gue0;->p:La/duj;

    .line 921
    .line 922
    new-instance v0, La/yr0;

    .line 923
    .line 924
    const/16 v1, 0x17

    .line 925
    .line 926
    invoke-direct {v0, p1, v1}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 930
    .line 931
    .line 932
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 933
    .line 934
    return-object p0

    .line 935
    :pswitch_18
    check-cast p0, La/mpe0;

    .line 936
    .line 937
    check-cast p1, La/cp;

    .line 938
    .line 939
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    new-instance v0, La/epe0;

    .line 943
    .line 944
    invoke-direct {v0, p1, p0}, La/epe0;-><init>(La/cp;La/mpe0;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {p1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 948
    .line 949
    .line 950
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    return-object p0

    .line 953
    :pswitch_19
    check-cast p0, La/zoe0;

    .line 954
    .line 955
    check-cast p1, Ljava/lang/Throwable;

    .line 956
    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    iget-object v0, p0, La/zoe0;->s:La/p7m0;

    .line 961
    .line 962
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    instance-of v0, p1, La/zhi0;

    .line 971
    .line 972
    if-eqz v0, :cond_1a

    .line 973
    .line 974
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    new-instance v1, La/k6d0;

    .line 979
    .line 980
    const/16 v2, 0x8

    .line 981
    .line 982
    invoke-direct {v1, p0, p1, v8, v2}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 983
    .line 984
    .line 985
    invoke-static {v0, v8, v8, v1, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 986
    .line 987
    .line 988
    goto :goto_b

    .line 989
    :cond_1a
    iget-object p0, p0, La/zoe0;->k:La/duj;

    .line 990
    .line 991
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 992
    .line 993
    .line 994
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 995
    .line 996
    return-object p0

    .line 997
    :pswitch_1a
    check-cast p0, La/xne0;

    .line 998
    .line 999
    check-cast p1, Ljava/lang/Throwable;

    .line 1000
    .line 1001
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    instance-of v0, p1, La/zhi0;

    .line 1005
    .line 1006
    if-eqz v0, :cond_1b

    .line 1007
    .line 1008
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    new-instance v1, La/k6d0;

    .line 1013
    .line 1014
    invoke-direct {v1, p0, p1, v8, v2}, La/k6d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1015
    .line 1016
    .line 1017
    invoke-static {v0, v8, v8, v1, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1018
    .line 1019
    .line 1020
    goto :goto_c

    .line 1021
    :cond_1b
    iget-object v0, p0, La/xne0;->h:La/duj;

    .line 1022
    .line 1023
    invoke-virtual {v0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 1024
    .line 1025
    .line 1026
    :goto_c
    invoke-virtual {p0, v7}, La/xne0;->x(Z)V

    .line 1027
    .line 1028
    .line 1029
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1030
    .line 1031
    return-object p0

    .line 1032
    :pswitch_1b
    check-cast p0, La/ume0;

    .line 1033
    .line 1034
    check-cast p1, Ljava/lang/Throwable;

    .line 1035
    .line 1036
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    iget-object p0, p0, La/ume0;->s:La/duj;

    .line 1040
    .line 1041
    new-instance v0, La/k8e0;

    .line 1042
    .line 1043
    const/16 v1, 0xd

    .line 1044
    .line 1045
    invoke-direct {v0, v1}, La/k8e0;-><init>(B)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1049
    .line 1050
    .line 1051
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1052
    .line 1053
    return-object p0

    .line 1054
    :pswitch_1c
    check-cast p0, La/gme0;

    .line 1055
    .line 1056
    check-cast p1, Ljava/lang/Throwable;

    .line 1057
    .line 1058
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    iget-object v0, p0, La/gme0;->q:La/duj;

    .line 1062
    .line 1063
    new-instance v1, La/dke0;

    .line 1064
    .line 1065
    invoke-direct {v1, p0, v5}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1069
    .line 1070
    .line 1071
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    return-object p0

    .line 1074
    nop

    .line 1075
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
