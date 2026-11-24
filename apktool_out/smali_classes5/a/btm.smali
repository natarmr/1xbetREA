.class public final synthetic La/btm;
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
    iput-byte p2, p0, La/btm;->a:B

    iput-object p1, p0, La/btm;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/btm;->a:B

    .line 2
    .line 3
    sget-object v1, La/m6n;->a:La/m6n;

    .line 4
    .line 5
    sget-object v2, La/l6n;->a:La/l6n;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object p0, p0, La/btm;->b:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/x5q0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    instance-of v0, p1, La/w5q0;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, La/sxo;

    .line 23
    .line 24
    check-cast p1, La/w5q0;

    .line 25
    .line 26
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v0, p1}, La/sxo;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    new-instance v0, La/eqo;

    .line 44
    .line 45
    invoke-direct {v0, p1}, La/eqo;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-ne p1, v3, :cond_1

    .line 61
    .line 62
    sget-object p1, La/bqo;->a:La/bqo;

    .line 63
    .line 64
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 71
    .line 72
    sget v0, Lorg/xplatform/coupon/impl/core/presentation/base/view/express_boost/ExpressBoostView;->r:I

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_3
    check-cast p1, La/owr0;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v0, La/j7o;

    .line 91
    .line 92
    invoke-direct {v0, p1}, La/j7o;-><init>(La/owr0;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_4
    check-cast p1, La/wnk;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v0, La/k7o;

    .line 107
    .line 108
    invoke-direct {v0, p1}, La/k7o;-><init>(La/wnk;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_5
    check-cast p1, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    new-instance p1, La/q7o;

    .line 124
    .line 125
    invoke-direct {p1, v0, v1}, La/q7o;-><init>(J)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_6
    check-cast p1, La/ims;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v0, La/j4o;

    .line 140
    .line 141
    invoke-direct {v0, p1}, La/j4o;-><init>(La/ims;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_7
    check-cast p1, La/nus;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance v0, La/r4o;

    .line 156
    .line 157
    invoke-direct {v0, p1}, La/r4o;-><init>(La/nus;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_8
    check-cast p1, Ljava/lang/Long;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v0

    .line 172
    new-instance p1, La/q4o;

    .line 173
    .line 174
    invoke-direct {p1, v0, v1}, La/q4o;-><init>(J)V

    .line 175
    .line 176
    .line 177
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_9
    check-cast p1, Ljava/lang/Long;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 186
    .line 187
    .line 188
    move-result-wide v0

    .line 189
    new-instance p1, La/q4o;

    .line 190
    .line 191
    invoke-direct {p1, v0, v1}, La/q4o;-><init>(J)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 203
    .line 204
    .line 205
    move-result-wide v0

    .line 206
    new-instance p1, La/q4o;

    .line 207
    .line 208
    invoke-direct {p1, v0, v1}, La/q4o;-><init>(J)V

    .line 209
    .line 210
    .line 211
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_b
    check-cast p1, Ljava/lang/Long;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 220
    .line 221
    .line 222
    move-result-wide v0

    .line 223
    new-instance p1, La/q4o;

    .line 224
    .line 225
    invoke-direct {p1, v0, v1}, La/q4o;-><init>(J)V

    .line 226
    .line 227
    .line 228
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_c
    check-cast p1, La/uss;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    new-instance v0, La/i4o;

    .line 240
    .line 241
    invoke-direct {v0, p1}, La/i4o;-><init>(La/uss;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_d
    check-cast p1, La/hdb;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v0, La/h4o;

    .line 256
    .line 257
    invoke-direct {v0, p1}, La/h4o;-><init>(La/hdb;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v0, La/a3o;

    .line 272
    .line 273
    invoke-direct {v0, p1}, La/a3o;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-eqz p1, :cond_6

    .line 289
    .line 290
    if-eq p1, v3, :cond_5

    .line 291
    .line 292
    const/4 v0, 0x2

    .line 293
    if-eq p1, v0, :cond_4

    .line 294
    .line 295
    const/4 v0, 0x3

    .line 296
    if-eq p1, v0, :cond_3

    .line 297
    .line 298
    goto :goto_0

    .line 299
    :cond_3
    sget-object p1, La/x2o;->a:La/x2o;

    .line 300
    .line 301
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    goto :goto_0

    .line 305
    :cond_4
    sget-object p1, La/c3o;->a:La/c3o;

    .line 306
    .line 307
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    goto :goto_0

    .line 311
    :cond_5
    sget-object p1, La/d3o;->a:La/d3o;

    .line 312
    .line 313
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    goto :goto_0

    .line 317
    :cond_6
    sget-object p1, La/z2o;->a:La/z2o;

    .line 318
    .line 319
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object p0

    .line 325
    :pswitch_10
    check-cast p1, La/bem;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    new-instance v0, La/s2o;

    .line 331
    .line 332
    invoke-direct {v0, p1}, La/s2o;-><init>(La/bem;)V

    .line 333
    .line 334
    .line 335
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    new-instance v0, La/b3o;

    .line 348
    .line 349
    invoke-direct {v0, p1}, La/b3o;-><init>(I)V

    .line 350
    .line 351
    .line 352
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object p0

    .line 358
    :pswitch_12
    check-cast p1, La/x5q0;

    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    instance-of v0, p1, La/w5q0;

    .line 364
    .line 365
    if-eqz v0, :cond_9

    .line 366
    .line 367
    check-cast p1, La/w5q0;

    .line 368
    .line 369
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 370
    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    const/4 v2, 0x0

    .line 381
    :goto_1
    if-ge v2, v1, :cond_8

    .line 382
    .line 383
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_7

    .line 392
    .line 393
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 394
    .line 395
    .line 396
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 397
    .line 398
    goto :goto_1

    .line 399
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object p0

    .line 409
    :pswitch_13
    check-cast p1, La/cp;

    .line 410
    .line 411
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 415
    .line 416
    check-cast v0, La/dux;

    .line 417
    .line 418
    iget-object v0, v0, La/dux;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    new-instance v1, La/xb;

    .line 424
    .line 425
    const/16 v2, 0x17

    .line 426
    .line 427
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 428
    .line 429
    .line 430
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 431
    .line 432
    .line 433
    new-instance p0, La/kgh;

    .line 434
    .line 435
    const/16 v0, 0xe

    .line 436
    .line 437
    invoke-direct {p0, p1, v0}, La/kgh;-><init>(La/cp;B)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 441
    .line 442
    .line 443
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object p0

    .line 446
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 449
    .line 450
    .line 451
    sget-object p1, La/rkn;->a:La/rkn;

    .line 452
    .line 453
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    return-object p0

    .line 459
    :pswitch_15
    check-cast p1, Landroid/view/View;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    if-eqz p0, :cond_a

    .line 465
    .line 466
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object p0

    .line 472
    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 475
    .line 476
    .line 477
    sget v0, Lorg/xplatform/uikit/components/text_field/DsTextField;->m1:I

    .line 478
    .line 479
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object p0

    .line 485
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 486
    .line 487
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result p1

    .line 491
    if-eqz p1, :cond_c

    .line 492
    .line 493
    if-eq p1, v3, :cond_b

    .line 494
    .line 495
    goto :goto_2

    .line 496
    :cond_b
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    goto :goto_2

    .line 500
    :cond_c
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    return-object p0

    .line 506
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 507
    .line 508
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 509
    .line 510
    .line 511
    move-result p1

    .line 512
    if-eqz p1, :cond_e

    .line 513
    .line 514
    if-eq p1, v3, :cond_d

    .line 515
    .line 516
    goto :goto_3

    .line 517
    :cond_d
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    goto :goto_3

    .line 521
    :cond_e
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object p0

    .line 527
    :pswitch_19
    check-cast p1, La/j6z;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object p0

    .line 538
    :pswitch_1a
    check-cast p1, La/j6z;

    .line 539
    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object p0

    .line 549
    :pswitch_1b
    check-cast p1, La/j6z;

    .line 550
    .line 551
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object p0

    .line 560
    :pswitch_1c
    check-cast p1, La/j6z;

    .line 561
    .line 562
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object p0

    .line 571
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
