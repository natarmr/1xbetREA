.class public final synthetic La/zbm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zbm0;->a:B

    iput-object p1, p0, La/zbm0;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/zbm0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const v2, 0x7f040b55

    .line 5
    .line 6
    .line 7
    const/16 v3, 0xd

    .line 8
    .line 9
    const/16 v4, 0xe

    .line 10
    .line 11
    sget-object v5, La/h17;->a:La/h17;

    .line 12
    .line 13
    const/16 v6, 0xc

    .line 14
    .line 15
    iget-object p0, p0, La/zbm0;->b:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    new-instance v0, La/yu30;

    .line 27
    .line 28
    invoke-direct {v0, p1}, La/yu30;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    new-instance v0, La/yu30;

    .line 55
    .line 56
    invoke-direct {v0, p1}, La/yu30;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    const/16 v0, 0x19

    .line 74
    .line 75
    if-eq p1, v0, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    sget-object p1, La/j27;->a:La/j27;

    .line 79
    .line 80
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    invoke-interface {p0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_3
    check-cast p1, La/cp;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 96
    .line 97
    check-cast v0, La/xrx;

    .line 98
    .line 99
    iget-object v0, v0, La/xrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v1, La/o7x;

    .line 105
    .line 106
    invoke-direct {v1, p0, p1, v4}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 110
    .line 111
    .line 112
    new-instance p0, La/kzi0;

    .line 113
    .line 114
    const/16 v0, 0x10

    .line 115
    .line 116
    invoke-direct {p0, p1, v0}, La/kzi0;-><init>(La/cp;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    new-instance v0, La/heo0;

    .line 131
    .line 132
    invoke-direct {v0, p1}, La/heo0;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    new-instance v0, La/rqk0;

    .line 148
    .line 149
    invoke-direct {v0, p1}, La/rqk0;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_6
    check-cast p1, Ljava/lang/Long;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    new-instance p1, La/erk0;

    .line 165
    .line 166
    invoke-direct {p1, v0, v1}, La/erk0;-><init>(J)V

    .line 167
    .line 168
    .line 169
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    new-instance v0, La/rqk0;

    .line 182
    .line 183
    invoke-direct {v0, p1}, La/rqk0;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_8
    check-cast p1, Ljava/lang/Long;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    new-instance p1, La/erk0;

    .line 199
    .line 200
    invoke-direct {p1, v0, v1}, La/erk0;-><init>(J)V

    .line 201
    .line 202
    .line 203
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    new-instance v0, La/t6o0;

    .line 216
    .line 217
    invoke-direct {v0, p1}, La/t6o0;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    new-instance p1, La/v6o0;

    .line 233
    .line 234
    invoke-direct {p1, v0, v1}, La/v6o0;-><init>(J)V

    .line 235
    .line 236
    .line 237
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object p0

    .line 243
    :pswitch_b
    check-cast p1, La/bem;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    instance-of v0, p1, La/wdm;

    .line 249
    .line 250
    if-eqz v0, :cond_2

    .line 251
    .line 252
    check-cast p1, La/wdm;

    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_2
    const/4 p1, 0x0

    .line 256
    :goto_1
    if-eqz p1, :cond_3

    .line 257
    .line 258
    iget-wide v0, p1, La/wdm;->a:J

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_3
    const-wide/16 v0, 0x0

    .line 262
    .line 263
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_d
    check-cast p1, La/cp;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 290
    .line 291
    check-cast v0, La/lyx;

    .line 292
    .line 293
    iget-object v0, v0, La/lyx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 294
    .line 295
    new-instance v1, La/o7x;

    .line 296
    .line 297
    invoke-direct {v1, p0, p1, v3}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 301
    .line 302
    .line 303
    new-instance p0, La/pgj0;

    .line 304
    .line 305
    invoke-direct {p0, p1, p1, v6}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 309
    .line 310
    .line 311
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-nez p1, :cond_4

    .line 321
    .line 322
    sget-object p1, La/ivn0;->a:La/ivn0;

    .line 323
    .line 324
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object p0

    .line 330
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    return-object p0

    .line 340
    :pswitch_10
    check-cast p1, La/cp;

    .line 341
    .line 342
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 346
    .line 347
    check-cast v0, La/kwx;

    .line 348
    .line 349
    iget-object v1, v0, La/kwx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    new-instance v3, La/o7x;

    .line 355
    .line 356
    invoke-direct {v3, p0, p1, v6}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 357
    .line 358
    .line 359
    invoke-static {v1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 360
    .line 361
    .line 362
    iget-object p0, v0, La/kwx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 363
    .line 364
    iget-object v1, p1, La/cp;->w:Landroid/content/Context;

    .line 365
    .line 366
    const v3, 0x7f040b5f

    .line 367
    .line 368
    .line 369
    invoke-static {v3, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterColor(I)V

    .line 374
    .line 375
    .line 376
    iget-object p0, v0, La/kwx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 377
    .line 378
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterBackgroundColor(Ljava/lang/Integer;)V

    .line 387
    .line 388
    .line 389
    new-instance p0, La/kzi0;

    .line 390
    .line 391
    invoke-direct {p0, p1, v4}, La/kzi0;-><init>(La/cp;B)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_11
    check-cast p1, La/cp;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 406
    .line 407
    check-cast v0, La/itx;

    .line 408
    .line 409
    iget-object v1, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 410
    .line 411
    new-instance v4, La/o7x;

    .line 412
    .line 413
    const/16 v5, 0xb

    .line 414
    .line 415
    invoke-direct {v4, p0, p1, v5}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 416
    .line 417
    .line 418
    invoke-static {v1, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 419
    .line 420
    .line 421
    iget-object p0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 422
    .line 423
    iget-object v0, p1, La/cp;->w:Landroid/content/Context;

    .line 424
    .line 425
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->f1:La/ape;

    .line 430
    .line 431
    iget-object p0, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 432
    .line 433
    if-eqz p0, :cond_5

    .line 434
    .line 435
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;->h(Ljava/lang/Integer;)V

    .line 440
    .line 441
    .line 442
    :cond_5
    new-instance p0, La/kzi0;

    .line 443
    .line 444
    invoke-direct {p0, p1, v3}, La/kzi0;-><init>(La/cp;B)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 448
    .line 449
    .line 450
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object p0

    .line 453
    :pswitch_12
    check-cast p1, La/kim;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    instance-of v0, p1, La/eim;

    .line 459
    .line 460
    if-eqz v0, :cond_6

    .line 461
    .line 462
    sget-object p1, La/bcn0;->a:La/bcn0;

    .line 463
    .line 464
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    goto :goto_3

    .line 468
    :cond_6
    instance-of v0, p1, La/fim;

    .line 469
    .line 470
    if-eqz v0, :cond_7

    .line 471
    .line 472
    check-cast p1, La/fim;

    .line 473
    .line 474
    iget p1, p1, La/fim;->a:I

    .line 475
    .line 476
    if-ne p1, v6, :cond_8

    .line 477
    .line 478
    sget-object p1, La/ccn0;->a:La/ccn0;

    .line 479
    .line 480
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    goto :goto_3

    .line 484
    :cond_7
    instance-of v0, p1, La/jim;

    .line 485
    .line 486
    if-eqz v0, :cond_8

    .line 487
    .line 488
    new-instance v0, La/dcn0;

    .line 489
    .line 490
    check-cast p1, La/jim;

    .line 491
    .line 492
    iget p1, p1, La/jim;->a:I

    .line 493
    .line 494
    invoke-direct {v0, p1}, La/dcn0;-><init>(I)V

    .line 495
    .line 496
    .line 497
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object p0

    .line 503
    :pswitch_13
    check-cast p1, La/bem;

    .line 504
    .line 505
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    new-instance v0, La/ian0;

    .line 509
    .line 510
    invoke-direct {v0, p1}, La/ian0;-><init>(La/bem;)V

    .line 511
    .line 512
    .line 513
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object p0

    .line 519
    :pswitch_14
    check-cast p1, La/kim;

    .line 520
    .line 521
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    instance-of v0, p1, La/eim;

    .line 525
    .line 526
    if-eqz v0, :cond_9

    .line 527
    .line 528
    sget-object p1, La/nan0;->a:La/nan0;

    .line 529
    .line 530
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    goto :goto_4

    .line 534
    :cond_9
    instance-of v0, p1, La/fim;

    .line 535
    .line 536
    if-eqz v0, :cond_a

    .line 537
    .line 538
    check-cast p1, La/fim;

    .line 539
    .line 540
    iget p1, p1, La/fim;->a:I

    .line 541
    .line 542
    if-ne p1, v1, :cond_a

    .line 543
    .line 544
    sget-object p1, La/pan0;->a:La/pan0;

    .line 545
    .line 546
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    :cond_a
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object p0

    .line 552
    :pswitch_15
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
    check-cast v0, La/iyx;

    .line 560
    .line 561
    iget-object v0, v0, La/iyx;->b:Landroid/widget/TextView;

    .line 562
    .line 563
    new-instance v1, La/o7x;

    .line 564
    .line 565
    const/16 v2, 0xa

    .line 566
    .line 567
    invoke-direct {v1, p0, p1, v2}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 568
    .line 569
    .line 570
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 571
    .line 572
    .line 573
    new-instance p0, La/kzi0;

    .line 574
    .line 575
    invoke-direct {p0, p1, v6}, La/kzi0;-><init>(La/cp;B)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 579
    .line 580
    .line 581
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 582
    .line 583
    return-object p0

    .line 584
    :pswitch_16
    check-cast p1, La/wgl0;

    .line 585
    .line 586
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    instance-of v0, p1, La/vgl0;

    .line 590
    .line 591
    if-eqz v0, :cond_b

    .line 592
    .line 593
    new-instance v0, La/a6b;

    .line 594
    .line 595
    new-instance v1, La/y030;

    .line 596
    .line 597
    check-cast p1, La/vgl0;

    .line 598
    .line 599
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 600
    .line 601
    invoke-direct {v1, p1}, La/y030;-><init>(La/xgl0;)V

    .line 602
    .line 603
    .line 604
    invoke-direct {v0, v1}, La/a6b;-><init>(La/g130;)V

    .line 605
    .line 606
    .line 607
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object p0

    .line 613
    :pswitch_17
    check-cast p1, La/ny20;

    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    instance-of v0, p1, La/jy20;

    .line 619
    .line 620
    if-eqz v0, :cond_c

    .line 621
    .line 622
    new-instance v0, La/a6b;

    .line 623
    .line 624
    check-cast p1, La/jy20;

    .line 625
    .line 626
    iget-object p1, p1, La/jy20;->a:La/g130;

    .line 627
    .line 628
    invoke-direct {v0, p1}, La/a6b;-><init>(La/g130;)V

    .line 629
    .line 630
    .line 631
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object p0

    .line 637
    :pswitch_18
    check-cast p1, La/xgl0;

    .line 638
    .line 639
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    new-instance v0, La/a6b;

    .line 643
    .line 644
    new-instance v1, La/z030;

    .line 645
    .line 646
    invoke-direct {v1, p1}, La/z030;-><init>(La/xgl0;)V

    .line 647
    .line 648
    .line 649
    invoke-direct {v0, v1}, La/a6b;-><init>(La/g130;)V

    .line 650
    .line 651
    .line 652
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 656
    .line 657
    return-object p0

    .line 658
    :pswitch_19
    check-cast p1, La/wgl0;

    .line 659
    .line 660
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    instance-of v0, p1, La/vgl0;

    .line 664
    .line 665
    if-eqz v0, :cond_d

    .line 666
    .line 667
    new-instance v0, La/a6b;

    .line 668
    .line 669
    new-instance v1, La/y030;

    .line 670
    .line 671
    check-cast p1, La/vgl0;

    .line 672
    .line 673
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 674
    .line 675
    invoke-direct {v1, p1}, La/y030;-><init>(La/xgl0;)V

    .line 676
    .line 677
    .line 678
    invoke-direct {v0, v1}, La/a6b;-><init>(La/g130;)V

    .line 679
    .line 680
    .line 681
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    return-object p0

    .line 687
    :pswitch_1a
    check-cast p1, La/xgl0;

    .line 688
    .line 689
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    new-instance v0, La/a6b;

    .line 693
    .line 694
    new-instance v1, La/z030;

    .line 695
    .line 696
    invoke-direct {v1, p1}, La/z030;-><init>(La/xgl0;)V

    .line 697
    .line 698
    .line 699
    invoke-direct {v0, v1}, La/a6b;-><init>(La/g130;)V

    .line 700
    .line 701
    .line 702
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 706
    .line 707
    return-object p0

    .line 708
    :pswitch_1b
    check-cast p1, Ljava/lang/Integer;

    .line 709
    .line 710
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 711
    .line 712
    .line 713
    move-result p1

    .line 714
    if-eqz p1, :cond_f

    .line 715
    .line 716
    if-eq p1, v1, :cond_e

    .line 717
    .line 718
    goto :goto_5

    .line 719
    :cond_e
    sget-object p1, La/j17;->a:La/j17;

    .line 720
    .line 721
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    goto :goto_5

    .line 725
    :cond_f
    invoke-interface {p0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 729
    .line 730
    return-object p0

    .line 731
    :pswitch_1c
    check-cast p1, La/tdb;

    .line 732
    .line 733
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    new-instance v0, La/pbm0;

    .line 737
    .line 738
    invoke-direct {v0, p1}, La/pbm0;-><init>(La/tdb;)V

    .line 739
    .line 740
    .line 741
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 745
    .line 746
    return-object p0

    .line 747
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
