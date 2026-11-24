.class public final synthetic La/olh;
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
    iput-byte p2, p0, La/olh;->a:B

    iput-object p1, p0, La/olh;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/olh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/olh;->b:Lkotlin/jvm/functions/Function1;

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
    if-nez p1, :cond_0

    .line 18
    .line 19
    sget-object p1, La/sak;->a:La/sak;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, La/jtl;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v0, La/rk;->h:La/rk;

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    sget-object p1, La/rak;->a:La/rak;

    .line 41
    .line 42
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object v0, La/rk;->p:La/rk;

    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    sget-object p1, La/qak;->a:La/qak;

    .line 55
    .line 56
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p1, La/jtl;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object p1, La/v7k;->a:La/v7k;

    .line 68
    .line 69
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    check-cast p1, La/x5q0;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    instance-of v0, p1, La/w5q0;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    new-instance v0, La/x7k;

    .line 85
    .line 86
    check-cast p1, La/w5q0;

    .line 87
    .line 88
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {v0, p1}, La/x7k;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eq p1, v2, :cond_5

    .line 106
    .line 107
    const/4 v0, 0x2

    .line 108
    if-eq p1, v0, :cond_4

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    sget-object p1, La/hhw;->a:La/hhw;

    .line 112
    .line 113
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    sget-object p1, La/rgw;->a:La/rgw;

    .line 118
    .line 119
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_4
    check-cast p1, Ljava/lang/Long;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    new-instance p1, La/ugw;

    .line 132
    .line 133
    invoke-direct {p1, v0, v1}, La/ugw;-><init>(J)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_5
    check-cast p1, Ljava/lang/Long;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v0

    .line 148
    new-instance p1, La/vgw;

    .line 149
    .line 150
    invoke-direct {p1, v0, v1}, La/vgw;-><init>(J)V

    .line 151
    .line 152
    .line 153
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_6
    check-cast p1, Ljava/lang/Long;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    new-instance p1, La/wgw;

    .line 166
    .line 167
    invoke-direct {p1, v0, v1}, La/wgw;-><init>(J)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_7
    check-cast p1, Ljava/lang/Long;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    new-instance p1, La/tgw;

    .line 183
    .line 184
    invoke-direct {p1, v0, v1}, La/tgw;-><init>(J)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_8
    check-cast p1, Ljava/lang/Long;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 196
    .line 197
    .line 198
    move-result-wide v0

    .line 199
    new-instance p1, La/ohw;

    .line 200
    .line 201
    invoke-direct {p1, v0, v1}, La/ohw;-><init>(J)V

    .line 202
    .line 203
    .line 204
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    new-instance v0, La/zgw;

    .line 217
    .line 218
    int-to-long v1, p1

    .line 219
    invoke-direct {v0, v1, v2}, La/zgw;-><init>(J)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 231
    .line 232
    .line 233
    move-result-wide v0

    .line 234
    new-instance p1, La/xgw;

    .line 235
    .line 236
    invoke-direct {p1, v0, v1}, La/xgw;-><init>(J)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_b
    check-cast p1, La/y8m;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v0, La/nhw;

    .line 251
    .line 252
    iget-object p1, p1, La/y8m;->d:Ljava/lang/String;

    .line 253
    .line 254
    invoke-direct {v0, p1}, La/nhw;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_c
    check-cast p1, La/cp;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 269
    .line 270
    check-cast v0, La/wtx;

    .line 271
    .line 272
    iget-object v0, v0, La/wtx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    new-instance v2, La/xb;

    .line 278
    .line 279
    const/16 v3, 0x16

    .line 280
    .line 281
    invoke-direct {v2, p0, p1, v3}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 285
    .line 286
    .line 287
    new-instance p0, La/kgh;

    .line 288
    .line 289
    invoke-direct {p0, p1, v1}, La/kgh;-><init>(La/cp;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 293
    .line 294
    .line 295
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_d
    check-cast p1, Landroid/view/View;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_e
    check-cast p1, Landroid/view/View;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_f
    check-cast p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v0, La/w2w0;

    .line 326
    .line 327
    iget v1, p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 328
    .line 329
    iget p1, p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->b:I

    .line 330
    .line 331
    sub-int/2addr p1, v2

    .line 332
    invoke-direct {v0, v1, p1}, La/w2w0;-><init>(II)V

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
    :pswitch_10
    check-cast p1, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    new-instance v0, La/p3j;

    .line 348
    .line 349
    invoke-direct {v0, p1}, La/p3j;-><init>(I)V

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
    :pswitch_11
    check-cast p1, Ljava/lang/Long;

    .line 359
    .line 360
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 361
    .line 362
    .line 363
    move-result-wide v0

    .line 364
    new-instance p1, La/i11;

    .line 365
    .line 366
    const/16 v2, 0x8

    .line 367
    .line 368
    invoke-direct {p1, v2, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 369
    .line 370
    .line 371
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 372
    .line 373
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    invoke-virtual {p0}, La/bjj;->a()V

    .line 378
    .line 379
    .line 380
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_12
    check-cast p1, Ljava/lang/Long;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    new-instance p1, La/i11;

    .line 390
    .line 391
    const/4 v2, 0x7

    .line 392
    invoke-direct {p1, v2, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 393
    .line 394
    .line 395
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 396
    .line 397
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-virtual {p0}, La/bjj;->a()V

    .line 402
    .line 403
    .line 404
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    return-object p0

    .line 407
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance p1, La/ouh;

    .line 413
    .line 414
    const/16 v0, 0xc

    .line 415
    .line 416
    invoke-direct {p1, p0, v0}, La/ouh;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 417
    .line 418
    .line 419
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 420
    .line 421
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    invoke-virtual {p0}, La/bjj;->a()V

    .line 426
    .line 427
    .line 428
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object p0

    .line 431
    :pswitch_14
    check-cast p1, La/o0x;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    instance-of v0, p1, La/n0x;

    .line 437
    .line 438
    if-eqz v0, :cond_6

    .line 439
    .line 440
    move-object v3, p1

    .line 441
    check-cast v3, La/n0x;

    .line 442
    .line 443
    :cond_6
    if-eqz v3, :cond_7

    .line 444
    .line 445
    iget-object p1, v3, La/n0x;->a:Ljava/lang/String;

    .line 446
    .line 447
    if-eqz p1, :cond_7

    .line 448
    .line 449
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    return-object p0

    .line 455
    :pswitch_15
    check-cast p1, La/o0x;

    .line 456
    .line 457
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    instance-of v0, p1, La/n0x;

    .line 461
    .line 462
    if-eqz v0, :cond_8

    .line 463
    .line 464
    move-object v3, p1

    .line 465
    check-cast v3, La/n0x;

    .line 466
    .line 467
    :cond_8
    if-eqz v3, :cond_9

    .line 468
    .line 469
    iget-object p1, v3, La/n0x;->a:Ljava/lang/String;

    .line 470
    .line 471
    if-eqz p1, :cond_9

    .line 472
    .line 473
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object p0

    .line 479
    :pswitch_16
    check-cast p1, La/o0x;

    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    instance-of v0, p1, La/n0x;

    .line 485
    .line 486
    if-eqz v0, :cond_a

    .line 487
    .line 488
    move-object v3, p1

    .line 489
    check-cast v3, La/n0x;

    .line 490
    .line 491
    :cond_a
    if-eqz v3, :cond_b

    .line 492
    .line 493
    iget-object p1, v3, La/n0x;->a:Ljava/lang/String;

    .line 494
    .line 495
    if-eqz p1, :cond_b

    .line 496
    .line 497
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object p0

    .line 503
    :pswitch_17
    check-cast p1, Landroid/content/Context;

    .line 504
    .line 505
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 509
    .line 510
    const/4 v2, 0x0

    .line 511
    invoke-direct {v0, p1, v3, v2}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 512
    .line 513
    .line 514
    new-instance p1, La/jxh;

    .line 515
    .line 516
    new-instance v2, La/olh;

    .line 517
    .line 518
    invoke-direct {v2, p0, v1}, La/olh;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 519
    .line 520
    .line 521
    invoke-direct {p1, v0, v2}, La/jxh;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;La/olh;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 525
    .line 526
    .line 527
    return-object v0

    .line 528
    :pswitch_18
    check-cast p1, Ljava/lang/Long;

    .line 529
    .line 530
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 531
    .line 532
    .line 533
    move-result-wide v0

    .line 534
    new-instance p1, La/fxh;

    .line 535
    .line 536
    invoke-direct {p1, v0, v1}, La/fxh;-><init>(J)V

    .line 537
    .line 538
    .line 539
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 543
    .line 544
    return-object p0

    .line 545
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 546
    .line 547
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v0, La/gxh;

    .line 551
    .line 552
    invoke-direct {v0, p1}, La/gxh;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    return-object p0

    .line 561
    :pswitch_1a
    check-cast p1, La/dfm0;

    .line 562
    .line 563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    instance-of v0, p1, La/lvh;

    .line 567
    .line 568
    if-eqz v0, :cond_c

    .line 569
    .line 570
    check-cast p1, La/lvh;

    .line 571
    .line 572
    new-instance v0, La/huh;

    .line 573
    .line 574
    invoke-direct {v0, p1}, La/huh;-><init>(La/lvh;)V

    .line 575
    .line 576
    .line 577
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    return-object p0

    .line 583
    :pswitch_1b
    check-cast p1, La/dfm0;

    .line 584
    .line 585
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    instance-of v0, p1, La/lvh;

    .line 589
    .line 590
    if-eqz v0, :cond_d

    .line 591
    .line 592
    check-cast p1, La/lvh;

    .line 593
    .line 594
    new-instance v0, La/huh;

    .line 595
    .line 596
    invoke-direct {v0, p1}, La/huh;-><init>(La/lvh;)V

    .line 597
    .line 598
    .line 599
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    return-object p0

    .line 605
    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    .line 606
    .line 607
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result p1

    .line 611
    new-instance v0, La/qih;

    .line 612
    .line 613
    invoke-direct {v0, p1}, La/qih;-><init>(I)V

    .line 614
    .line 615
    .line 616
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object p0

    .line 622
    nop

    .line 623
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
