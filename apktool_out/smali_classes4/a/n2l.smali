.class public final synthetic La/n2l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/n2l;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte p0, p0, La/n2l;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    instance-of v1, v1, Ljava/lang/Integer;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Ljava/util/Map$Entry;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p1, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, La/wp20;->a(I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/util/Map$Entry;

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v1

    .line 152
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_4
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v0}, La/wp20;->a(I)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Ljava/lang/Iterable;

    .line 182
    .line 183
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_5

    .line 192
    .line 193
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, Ljava/util/Map$Entry;

    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    check-cast v0, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-static {v0}, La/fbc;->d(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v2

    .line 220
    new-instance v0, La/y3d;

    .line 221
    .line 222
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 223
    .line 224
    .line 225
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_5
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 230
    .line 231
    invoke-direct {p0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 232
    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    sget p0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldGameView;->u:I

    .line 241
    .line 242
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_1
    check-cast p1, La/lpa0;

    .line 246
    .line 247
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_2
    check-cast p1, La/ne60;

    .line 251
    .line 252
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_4
    check-cast p1, La/xa30;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance p0, La/a7l;

    .line 272
    .line 273
    invoke-direct {p0, p1}, La/a7l;-><init>(La/xa30;)V

    .line 274
    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_5
    check-cast p1, La/wus;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance p0, La/b7l;

    .line 283
    .line 284
    invoke-direct {p0, p1}, La/b7l;-><init>(La/wus;)V

    .line 285
    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_6
    check-cast p1, La/fee;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    check-cast p0, La/bqr;

    .line 298
    .line 299
    invoke-static {p0, v1}, La/kpb;->o0(La/bqr;Z)La/cqr;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    return-object p0

    .line 304
    :pswitch_7
    check-cast p1, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_8
    check-cast p1, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_9
    check-cast p1, Landroid/content/Context;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 326
    .line 327
    invoke-direct {p0, p1, v0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 328
    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_a
    check-cast p1, La/mbp0;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    iget-object p0, p1, La/mbp0;->h:La/fbp0;

    .line 337
    .line 338
    iget-object v0, p1, La/mbp0;->f:La/sff0;

    .line 339
    .line 340
    invoke-static {v0}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    iget-boolean v1, p1, La/mbp0;->a:Z

    .line 345
    .line 346
    iget-object v2, p1, La/mbp0;->l:La/obp0;

    .line 347
    .line 348
    iget-object p1, p1, La/mbp0;->k:La/e9p0;

    .line 349
    .line 350
    invoke-static {p0, v0, v1, p1, v2}, La/qim0;->k(La/fbp0;La/dxh0;ZLa/e9p0;La/obp0;)La/gbp0;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    return-object p0

    .line 355
    :pswitch_b
    check-cast p1, La/mbp0;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 361
    .line 362
    iget-object v1, p1, La/mbp0;->d:Ljava/util/Map;

    .line 363
    .line 364
    iget-object v2, p1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 365
    .line 366
    iget-boolean v3, p1, La/mbp0;->e:Z

    .line 367
    .line 368
    iget-object v4, p1, La/mbp0;->g:La/v8d;

    .line 369
    .line 370
    iget-boolean v5, p1, La/mbp0;->a:Z

    .line 371
    .line 372
    invoke-static/range {v0 .. v5}, La/xnm0;->h(La/o9p0;Ljava/util/Map;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;ZLa/v8d;Z)La/qbp0;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_c
    check-cast p1, La/cp;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    iget-object p0, p1, La/xhe0;->a:Landroid/view/View;

    .line 383
    .line 384
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 385
    .line 386
    .line 387
    new-instance p0, La/k2l;

    .line 388
    .line 389
    const/4 v0, 0x3

    .line 390
    invoke-direct {p0, p1, p1, v0}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 394
    .line 395
    .line 396
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 397
    .line 398
    return-object p0

    .line 399
    :pswitch_d
    check-cast p1, La/cp;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    iget-object p0, p1, La/xhe0;->a:Landroid/view/View;

    .line 405
    .line 406
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 407
    .line 408
    .line 409
    new-instance p0, La/k2l;

    .line 410
    .line 411
    const/4 v0, 0x2

    .line 412
    invoke-direct {p0, p1, p1, v0}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 416
    .line 417
    .line 418
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object p0

    .line 421
    :pswitch_e
    check-cast p1, La/i8l;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_f
    check-cast p1, La/i8l;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object p0

    .line 437
    :pswitch_10
    check-cast p1, Landroid/content/Context;

    .line 438
    .line 439
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    new-instance p0, La/i8l;

    .line 443
    .line 444
    invoke-direct {p0, p1}, La/i8l;-><init>(Landroid/content/Context;)V

    .line 445
    .line 446
    .line 447
    return-object p0

    .line 448
    :pswitch_11
    check-cast p1, La/d9l;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    return-object p0

    .line 456
    :pswitch_12
    check-cast p1, La/d9l;

    .line 457
    .line 458
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object p0

    .line 464
    :pswitch_13
    check-cast p1, Landroid/content/Context;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    new-instance p0, La/d9l;

    .line 470
    .line 471
    invoke-direct {p0, p1}, La/d9l;-><init>(Landroid/content/Context;)V

    .line 472
    .line 473
    .line 474
    return-object p0

    .line 475
    :pswitch_14
    check-cast p1, La/j7l;

    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object p0

    .line 483
    :pswitch_15
    check-cast p1, La/y6l;

    .line 484
    .line 485
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_16
    check-cast p1, La/y6l;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object p0

    .line 499
    :pswitch_17
    check-cast p1, Landroid/content/Context;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    new-instance p0, La/y6l;

    .line 505
    .line 506
    invoke-direct {p0, p1}, La/y6l;-><init>(Landroid/content/Context;)V

    .line 507
    .line 508
    .line 509
    return-object p0

    .line 510
    :pswitch_18
    check-cast p1, La/m5l;

    .line 511
    .line 512
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object p0

    .line 518
    :pswitch_19
    check-cast p1, La/cp;

    .line 519
    .line 520
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 524
    .line 525
    check-cast p0, La/w2l;

    .line 526
    .line 527
    iget-object p0, p0, La/w2l;->b:Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 528
    .line 529
    iget-object v0, p1, La/cp;->w:Landroid/content/Context;

    .line 530
    .line 531
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    const v1, 0x7f0706f8

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    invoke-static {p0, v0}, La/hxm0;->x(Landroid/view/View;I)V

    .line 543
    .line 544
    .line 545
    new-instance p0, La/k2l;

    .line 546
    .line 547
    const/4 v0, 0x1

    .line 548
    invoke-direct {p0, p1, p1, v0}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 552
    .line 553
    .line 554
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object p0

    .line 557
    :pswitch_1a
    check-cast p1, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    return-object p0

    .line 565
    :pswitch_1b
    check-cast p1, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 566
    .line 567
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    return-object p0

    .line 573
    :pswitch_1c
    check-cast p1, Landroid/content/Context;

    .line 574
    .line 575
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    new-instance p0, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 579
    .line 580
    const/4 v1, 0x6

    .line 581
    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 582
    .line 583
    .line 584
    return-object p0

    .line 585
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
