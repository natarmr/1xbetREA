.class public final synthetic La/trb;
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
    iput-byte p2, p0, La/trb;->a:B

    iput-object p1, p0, La/trb;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/trb;->a:B

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    iget-object p0, p0, La/trb;->b:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-instance p1, La/lkf;

    .line 21
    .line 22
    invoke-direct {p1, v0, v1}, La/lkf;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/uss;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, La/akf;

    .line 37
    .line 38
    invoke-direct {v0, p1}, La/akf;-><init>(La/uss;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    check-cast p1, La/hdb;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, La/zjf;

    .line 53
    .line 54
    invoke-direct {v0, p1}, La/zjf;-><init>(La/hdb;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, La/x5q0;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    instance-of v0, p1, La/w5q0;

    .line 69
    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    new-instance v0, La/v1f;

    .line 73
    .line 74
    check-cast p1, La/w5q0;

    .line 75
    .line 76
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {v0, p1}, La/v1f;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    new-instance v0, La/x1f;

    .line 94
    .line 95
    invoke-direct {v0, p1}, La/x1f;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_4
    check-cast p1, La/cp;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 110
    .line 111
    check-cast v0, La/scu0;

    .line 112
    .line 113
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 114
    .line 115
    new-instance v1, La/xb;

    .line 116
    .line 117
    const/16 v2, 0x12

    .line 118
    .line 119
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setCancelButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, La/ok;

    .line 126
    .line 127
    invoke-direct {p0, p1, p1, v2}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_5
    check-cast p1, La/cp;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 142
    .line 143
    check-cast v0, La/gtx;

    .line 144
    .line 145
    iget-object v0, v0, La/gtx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 146
    .line 147
    new-instance v1, La/xb;

    .line 148
    .line 149
    const/16 v3, 0x11

    .line 150
    .line 151
    invoke-direct {v1, p0, p1, v3}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 155
    .line 156
    .line 157
    new-instance p0, La/rn5;

    .line 158
    .line 159
    invoke-direct {p0, p1, v2}, La/rn5;-><init>(La/cp;B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_6
    check-cast p1, La/cp;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 174
    .line 175
    check-cast v0, La/ftx;

    .line 176
    .line 177
    iget-object v0, v0, La/ftx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 178
    .line 179
    new-instance v2, La/xb;

    .line 180
    .line 181
    const/16 v3, 0x10

    .line 182
    .line 183
    invoke-direct {v2, p0, p1, v3}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 187
    .line 188
    .line 189
    new-instance p0, La/rn5;

    .line 190
    .line 191
    invoke-direct {p0, p1, v1}, La/rn5;-><init>(La/cp;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_7
    check-cast p1, La/cp;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 206
    .line 207
    check-cast v0, La/ftx;

    .line 208
    .line 209
    iget-object v0, v0, La/ftx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 210
    .line 211
    new-instance v1, La/xb;

    .line 212
    .line 213
    const/16 v2, 0xf

    .line 214
    .line 215
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 219
    .line 220
    .line 221
    new-instance p0, La/rn5;

    .line 222
    .line 223
    invoke-direct {p0, p1, v3}, La/rn5;-><init>(La/cp;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 227
    .line 228
    .line 229
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_8
    check-cast p1, La/cp;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 238
    .line 239
    check-cast v0, La/ftx;

    .line 240
    .line 241
    iget-object v0, v0, La/ftx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 242
    .line 243
    new-instance v1, La/xb;

    .line 244
    .line 245
    const/16 v2, 0xe

    .line 246
    .line 247
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 251
    .line 252
    .line 253
    new-instance p0, La/rn5;

    .line 254
    .line 255
    const/16 v0, 0x8

    .line 256
    .line 257
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_9
    check-cast p1, La/cp;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 272
    .line 273
    check-cast v0, La/etx;

    .line 274
    .line 275
    iget-object v0, v0, La/etx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 276
    .line 277
    new-instance v1, La/xb;

    .line 278
    .line 279
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 280
    .line 281
    .line 282
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 283
    .line 284
    .line 285
    new-instance p0, La/rn5;

    .line 286
    .line 287
    const/4 v0, 0x7

    .line 288
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 292
    .line 293
    .line 294
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_a
    check-cast p1, La/cp;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 303
    .line 304
    check-cast v0, La/etx;

    .line 305
    .line 306
    iget-object v0, v0, La/etx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 307
    .line 308
    new-instance v2, La/xb;

    .line 309
    .line 310
    invoke-direct {v2, p0, p1, v1}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 311
    .line 312
    .line 313
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 314
    .line 315
    .line 316
    new-instance p0, La/rn5;

    .line 317
    .line 318
    const/4 v0, 0x6

    .line 319
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 323
    .line 324
    .line 325
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object p0

    .line 328
    :pswitch_b
    check-cast p1, La/cp;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 334
    .line 335
    check-cast v0, La/ftx;

    .line 336
    .line 337
    iget-object v0, v0, La/ftx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 338
    .line 339
    new-instance v1, La/xb;

    .line 340
    .line 341
    const/16 v2, 0xb

    .line 342
    .line 343
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 347
    .line 348
    .line 349
    new-instance p0, La/rn5;

    .line 350
    .line 351
    const/4 v0, 0x5

    .line 352
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 356
    .line 357
    .line 358
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_c
    check-cast p1, La/cp;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 367
    .line 368
    check-cast v0, La/ftx;

    .line 369
    .line 370
    iget-object v0, v0, La/ftx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 371
    .line 372
    new-instance v1, La/xb;

    .line 373
    .line 374
    invoke-direct {v1, p0, p1, v3}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 378
    .line 379
    .line 380
    new-instance p0, La/rn5;

    .line 381
    .line 382
    const/4 v0, 0x4

    .line 383
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 387
    .line 388
    .line 389
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object p0

    .line 392
    :pswitch_d
    check-cast p1, La/p8d;

    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    iget-object p1, p1, La/p8d;->a:Ljava/lang/Cloneable;

    .line 398
    .line 399
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object p0

    .line 405
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result p1

    .line 411
    new-instance v0, La/wmc;

    .line 412
    .line 413
    invoke-direct {v0, p1}, La/wmc;-><init>(I)V

    .line 414
    .line 415
    .line 416
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object p0

    .line 422
    :pswitch_f
    check-cast p1, La/thm;

    .line 423
    .line 424
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    instance-of v0, p1, La/ihm;

    .line 428
    .line 429
    if-eqz v0, :cond_1

    .line 430
    .line 431
    sget-object p1, La/qmc;->a:La/qmc;

    .line 432
    .line 433
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    goto :goto_0

    .line 437
    :cond_1
    instance-of v0, p1, La/phm;

    .line 438
    .line 439
    if-eqz v0, :cond_2

    .line 440
    .line 441
    check-cast p1, La/phm;

    .line 442
    .line 443
    iget p1, p1, La/phm;->a:I

    .line 444
    .line 445
    new-instance v0, La/umc;

    .line 446
    .line 447
    invoke-direct {v0, p1}, La/umc;-><init>(I)V

    .line 448
    .line 449
    .line 450
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    goto :goto_0

    .line 454
    :cond_2
    instance-of v0, p1, La/jhm;

    .line 455
    .line 456
    if-eqz v0, :cond_3

    .line 457
    .line 458
    sget-object p1, La/rmc;->a:La/rmc;

    .line 459
    .line 460
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    goto :goto_0

    .line 464
    :cond_3
    instance-of v0, p1, La/qhm;

    .line 465
    .line 466
    if-eqz v0, :cond_4

    .line 467
    .line 468
    check-cast p1, La/qhm;

    .line 469
    .line 470
    iget-object p1, p1, La/qhm;->a:Ljava/lang/String;

    .line 471
    .line 472
    new-instance v0, La/vmc;

    .line 473
    .line 474
    invoke-direct {v0, p1}, La/vmc;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    goto :goto_0

    .line 481
    :cond_4
    instance-of p1, p1, La/nhm;

    .line 482
    .line 483
    if-eqz p1, :cond_5

    .line 484
    .line 485
    sget-object p1, La/tmc;->a:La/tmc;

    .line 486
    .line 487
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    :cond_5
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    return-object p0

    .line 493
    :pswitch_10
    check-cast p1, La/x5q0;

    .line 494
    .line 495
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    instance-of v0, p1, La/w5q0;

    .line 499
    .line 500
    if-eqz v0, :cond_6

    .line 501
    .line 502
    check-cast p1, La/w5q0;

    .line 503
    .line 504
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 505
    .line 506
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    new-instance v0, La/fhc;

    .line 510
    .line 511
    invoke-direct {v0, p1}, La/fhc;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    return-object p0

    .line 520
    :pswitch_11
    check-cast p1, La/iqq;

    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 526
    .line 527
    .line 528
    move-result p1

    .line 529
    if-eqz p1, :cond_7

    .line 530
    .line 531
    sget-object p1, La/dhc;->a:La/dhc;

    .line 532
    .line 533
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    return-object p0

    .line 539
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 540
    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    new-instance v0, La/tgc;

    .line 545
    .line 546
    invoke-direct {v0, p1}, La/tgc;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 553
    .line 554
    return-object p0

    .line 555
    :pswitch_13
    check-cast p1, Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    new-instance v0, La/mfc;

    .line 561
    .line 562
    invoke-direct {v0, p1}, La/mfc;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object p0

    .line 571
    :pswitch_14
    check-cast p1, La/ap8;

    .line 572
    .line 573
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    new-instance v0, La/lfc;

    .line 577
    .line 578
    iget p1, p1, La/ap8;->a:I

    .line 579
    .line 580
    invoke-direct {v0, p1}, La/lfc;-><init>(I)V

    .line 581
    .line 582
    .line 583
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object p0

    .line 589
    :pswitch_15
    check-cast p1, La/x5q0;

    .line 590
    .line 591
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    instance-of v0, p1, La/w5q0;

    .line 595
    .line 596
    if-eqz v0, :cond_8

    .line 597
    .line 598
    new-instance v0, La/ddc;

    .line 599
    .line 600
    check-cast p1, La/w5q0;

    .line 601
    .line 602
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 603
    .line 604
    invoke-direct {v0, p1}, La/ddc;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object p0

    .line 613
    :pswitch_16
    check-cast p1, Landroid/content/Context;

    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    new-instance v0, Lorg/xplatform/uikit/components/chips/DsChips;

    .line 619
    .line 620
    const/4 v1, 0x0

    .line 621
    invoke-direct {v0, p1, v1}, Lorg/xplatform/uikit/components/chips/DsChips;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 622
    .line 623
    .line 624
    new-instance p1, La/ag0;

    .line 625
    .line 626
    const/16 v1, 0x16

    .line 627
    .line 628
    invoke-direct {p1, p0, v1}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/chips/DsChips;->setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 632
    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_17
    check-cast p1, Landroid/widget/HorizontalScrollView;

    .line 636
    .line 637
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    const/4 v0, 0x0

    .line 641
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 642
    .line 643
    .line 644
    move-result-object p1

    .line 645
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    check-cast p1, La/zac;

    .line 649
    .line 650
    new-instance v0, La/h6c;

    .line 651
    .line 652
    const/4 v1, 0x3

    .line 653
    invoke-direct {v0, p1, p0, v1}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {p1, v0}, La/zac;->setOnSelectChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 657
    .line 658
    .line 659
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 660
    .line 661
    return-object p0

    .line 662
    :pswitch_18
    check-cast p1, La/cp;

    .line 663
    .line 664
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    new-instance v1, La/xb;

    .line 673
    .line 674
    const/16 v2, 0x9

    .line 675
    .line 676
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 677
    .line 678
    .line 679
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 680
    .line 681
    .line 682
    new-instance p0, La/ok;

    .line 683
    .line 684
    invoke-direct {p0, p1, p1, v3}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 688
    .line 689
    .line 690
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 691
    .line 692
    return-object p0

    .line 693
    :pswitch_19
    check-cast p1, La/x5q0;

    .line 694
    .line 695
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    instance-of v0, p1, La/w5q0;

    .line 699
    .line 700
    if-eqz v0, :cond_9

    .line 701
    .line 702
    check-cast p1, La/w5q0;

    .line 703
    .line 704
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 705
    .line 706
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    new-instance v0, La/lrb;

    .line 710
    .line 711
    invoke-direct {v0, p1}, La/lrb;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 718
    .line 719
    return-object p0

    .line 720
    :pswitch_1a
    check-cast p1, La/x5q0;

    .line 721
    .line 722
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    instance-of v0, p1, La/w5q0;

    .line 726
    .line 727
    if-eqz v0, :cond_a

    .line 728
    .line 729
    check-cast p1, La/w5q0;

    .line 730
    .line 731
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    new-instance v0, La/krb;

    .line 737
    .line 738
    invoke-direct {v0, p1}, La/krb;-><init>(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 745
    .line 746
    return-object p0

    .line 747
    :pswitch_1b
    check-cast p1, La/x5q0;

    .line 748
    .line 749
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    instance-of v0, p1, La/w5q0;

    .line 753
    .line 754
    if-eqz v0, :cond_b

    .line 755
    .line 756
    check-cast p1, La/w5q0;

    .line 757
    .line 758
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 759
    .line 760
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    new-instance v0, La/mrb;

    .line 764
    .line 765
    invoke-direct {v0, p1}, La/mrb;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 772
    .line 773
    return-object p0

    .line 774
    :pswitch_1c
    check-cast p1, La/jtl;

    .line 775
    .line 776
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    sget-object p1, La/nrb;->a:La/nrb;

    .line 780
    .line 781
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 785
    .line 786
    return-object p0

    .line 787
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
