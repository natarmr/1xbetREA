.class public final synthetic La/dht;
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
    iput-byte p2, p0, La/dht;->a:B

    iput-object p1, p0, La/dht;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/dht;->a:B

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, La/dht;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    if-eq p1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object p1, La/aa7;->a:La/aa7;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object p1, La/ba7;->a:La/ba7;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, La/jtl;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v0, La/sh00;->r:La/sh00;

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    sget-object p1, La/s97;->a:La/s97;

    .line 50
    .line 51
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v0, La/sh00;->l:La/sh00;

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    sget-object p1, La/r97;->a:La/r97;

    .line 64
    .line 65
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    sget-object v0, La/sh00;->x:La/sh00;

    .line 70
    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    sget-object p1, La/t97;->a:La/t97;

    .line 78
    .line 79
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_1
    check-cast p1, La/cp;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 91
    .line 92
    check-cast v0, La/wxx;

    .line 93
    .line 94
    iget-object v0, v0, La/wxx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v2, La/xb;

    .line 100
    .line 101
    invoke-direct {v2, p0, p1, v1}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 105
    .line 106
    .line 107
    new-instance p0, La/b1w;

    .line 108
    .line 109
    const/16 v0, 0x8

    .line 110
    .line 111
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 115
    .line 116
    .line 117
    new-instance p0, La/bb;

    .line 118
    .line 119
    const/16 v0, 0x9

    .line 120
    .line 121
    invoke-direct {p0, p1, v0}, La/bb;-><init>(La/cp;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p0}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_2
    check-cast p1, La/cp;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 136
    .line 137
    check-cast v0, La/bwx;

    .line 138
    .line 139
    iget-object v0, v0, La/bwx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v1, La/xb;

    .line 145
    .line 146
    const/16 v2, 0x1b

    .line 147
    .line 148
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 152
    .line 153
    .line 154
    new-instance p0, La/b1w;

    .line 155
    .line 156
    const/4 v0, 0x7

    .line 157
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 161
    .line 162
    .line 163
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_3
    check-cast p1, La/cp;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 172
    .line 173
    check-cast v0, La/eux;

    .line 174
    .line 175
    iget-object v0, v0, La/eux;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v1, La/xb;

    .line 181
    .line 182
    const/16 v2, 0x1a

    .line 183
    .line 184
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 188
    .line 189
    .line 190
    new-instance p0, La/b1w;

    .line 191
    .line 192
    const/4 v0, 0x6

    .line 193
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 197
    .line 198
    .line 199
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_4
    check-cast p1, La/cp;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 208
    .line 209
    check-cast v0, La/wtx;

    .line 210
    .line 211
    iget-object v0, v0, La/wtx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance v1, La/xb;

    .line 217
    .line 218
    const/16 v2, 0x19

    .line 219
    .line 220
    invoke-direct {v1, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 224
    .line 225
    .line 226
    new-instance p0, La/b1w;

    .line 227
    .line 228
    const/4 v0, 0x5

    .line 229
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    sget-object p1, La/rqw;->a:La/rqw;

    .line 244
    .line 245
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_6
    check-cast p1, La/bem;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    new-instance v0, La/dhw;

    .line 257
    .line 258
    invoke-direct {v0, p1}, La/dhw;-><init>(La/bem;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_7
    check-cast p1, Ljava/lang/Long;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 270
    .line 271
    .line 272
    move-result-wide v0

    .line 273
    new-instance p1, La/pgw;

    .line 274
    .line 275
    invoke-direct {p1, v0, v1}, La/pgw;-><init>(J)V

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
    :pswitch_8
    check-cast p1, La/bem;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    new-instance v0, La/dhw;

    .line 290
    .line 291
    invoke-direct {v0, p1}, La/dhw;-><init>(La/bem;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object p0

    .line 300
    :pswitch_9
    check-cast p1, La/bem;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    new-instance v0, La/dhw;

    .line 306
    .line 307
    invoke-direct {v0, p1}, La/dhw;-><init>(La/bem;)V

    .line 308
    .line 309
    .line 310
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object p0

    .line 316
    :pswitch_a
    check-cast p1, La/cvl;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget p1, p1, La/cvl;->a:I

    .line 322
    .line 323
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_b
    check-cast p1, Ljava/lang/Long;

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 336
    .line 337
    .line 338
    move-result-wide v0

    .line 339
    new-instance p1, La/lcw;

    .line 340
    .line 341
    invoke-direct {p1, v0, v1}, La/lcw;-><init>(J)V

    .line 342
    .line 343
    .line 344
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object p0

    .line 350
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    new-instance v0, La/icw;

    .line 357
    .line 358
    invoke-direct {v0, p1}, La/icw;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object p0

    .line 367
    :pswitch_d
    check-cast p1, La/jfw;

    .line 368
    .line 369
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    new-instance v0, La/qcw;

    .line 373
    .line 374
    invoke-direct {v0, p1}, La/qcw;-><init>(La/jfw;)V

    .line 375
    .line 376
    .line 377
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    new-instance p1, La/mcw;

    .line 390
    .line 391
    invoke-direct {p1, v0, v1}, La/mcw;-><init>(J)V

    .line 392
    .line 393
    .line 394
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_f
    check-cast p1, La/uew;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    new-instance v0, La/ncw;

    .line 406
    .line 407
    invoke-direct {v0, p1}, La/ncw;-><init>(La/uew;)V

    .line 408
    .line 409
    .line 410
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    return-object p0

    .line 416
    :pswitch_10
    check-cast p1, Landroid/view/View;

    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_11
    check-cast p1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    new-instance v0, La/dht;

    .line 435
    .line 436
    const/16 v1, 0xc

    .line 437
    .line 438
    invoke-direct {v0, p0, v1}, La/dht;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 439
    .line 440
    .line 441
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 442
    .line 443
    .line 444
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object p0

    .line 447
    :pswitch_12
    check-cast p1, La/cp;

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    new-instance v2, La/xb;

    .line 458
    .line 459
    const/16 v3, 0x18

    .line 460
    .line 461
    invoke-direct {v2, p0, p1, v3}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 462
    .line 463
    .line 464
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 465
    .line 466
    .line 467
    new-instance p0, La/kgh;

    .line 468
    .line 469
    invoke-direct {p0, p1, v1}, La/kgh;-><init>(La/cp;B)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 473
    .line 474
    .line 475
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    return-object p0

    .line 478
    :pswitch_13
    check-cast p1, Ljava/lang/Long;

    .line 479
    .line 480
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 481
    .line 482
    .line 483
    move-result-wide v0

    .line 484
    new-instance p1, La/thv;

    .line 485
    .line 486
    invoke-direct {p1, v0, v1}, La/thv;-><init>(J)V

    .line 487
    .line 488
    .line 489
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    return-object p0

    .line 495
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result p1

    .line 501
    if-ne p1, v2, :cond_5

    .line 502
    .line 503
    sget-object p1, La/vcv;->a:La/vcv;

    .line 504
    .line 505
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 509
    .line 510
    return-object p0

    .line 511
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 512
    .line 513
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    new-instance v0, La/b8v;

    .line 517
    .line 518
    invoke-direct {v0, p1}, La/b8v;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object p0

    .line 527
    :pswitch_16
    check-cast p1, La/hps0;

    .line 528
    .line 529
    instance-of v0, p1, La/amt;

    .line 530
    .line 531
    if-eqz v0, :cond_6

    .line 532
    .line 533
    check-cast p1, La/amt;

    .line 534
    .line 535
    iget-object p1, p1, La/amt;->o:La/zlt;

    .line 536
    .line 537
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    check-cast p0, Ljava/lang/Boolean;

    .line 542
    .line 543
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 544
    .line 545
    .line 546
    move-result p0

    .line 547
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 548
    .line 549
    .line 550
    move-result-object p0

    .line 551
    goto :goto_2

    .line 552
    :cond_6
    const-string p0, "Node is not a GestureNode instance"

    .line 553
    .line 554
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    const/4 p0, 0x0

    .line 558
    :goto_2
    return-object p0

    .line 559
    :pswitch_17
    check-cast p1, La/x5q0;

    .line 560
    .line 561
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    sget-object p1, La/qgt;->a:La/qgt;

    .line 565
    .line 566
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object p0

    .line 572
    :pswitch_18
    check-cast p1, La/x5q0;

    .line 573
    .line 574
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    sget-object p1, La/ogt;->a:La/ogt;

    .line 578
    .line 579
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object p0

    .line 585
    :pswitch_19
    check-cast p1, La/x5q0;

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    instance-of v0, p1, La/w5q0;

    .line 591
    .line 592
    if-eqz v0, :cond_7

    .line 593
    .line 594
    check-cast p1, La/w5q0;

    .line 595
    .line 596
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    new-instance v0, La/ugt;

    .line 602
    .line 603
    invoke-direct {v0, p1}, La/ugt;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    return-object p0

    .line 612
    :pswitch_1a
    check-cast p1, La/x5q0;

    .line 613
    .line 614
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    instance-of v0, p1, La/w5q0;

    .line 618
    .line 619
    if-eqz v0, :cond_8

    .line 620
    .line 621
    check-cast p1, La/w5q0;

    .line 622
    .line 623
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 624
    .line 625
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    new-instance v0, La/kgt;

    .line 629
    .line 630
    invoke-direct {v0, p1}, La/kgt;-><init>(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object p0

    .line 639
    :pswitch_1b
    check-cast p1, Ljava/lang/Long;

    .line 640
    .line 641
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 642
    .line 643
    .line 644
    move-result-wide v0

    .line 645
    new-instance p1, La/tgt;

    .line 646
    .line 647
    invoke-direct {p1, v0, v1}, La/tgt;-><init>(J)V

    .line 648
    .line 649
    .line 650
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 654
    .line 655
    return-object p0

    .line 656
    :pswitch_1c
    check-cast p1, Ljava/lang/Long;

    .line 657
    .line 658
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 659
    .line 660
    .line 661
    move-result-wide v0

    .line 662
    new-instance p1, La/rgt;

    .line 663
    .line 664
    invoke-direct {p1, v0, v1}, La/rgt;-><init>(J)V

    .line 665
    .line 666
    .line 667
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 671
    .line 672
    return-object p0

    .line 673
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
