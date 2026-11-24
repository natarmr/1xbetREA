.class public final synthetic La/y7;
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
    iput-byte p2, p0, La/y7;->a:B

    iput-object p1, p0, La/y7;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/y7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x3

    .line 7
    iget-object p0, p0, La/y7;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p1, La/nr0;

    .line 18
    .line 19
    const/16 v0, 0xb

    .line 20
    .line 21
    invoke-direct {p1, p0, v0}, La/nr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 22
    .line 23
    .line 24
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 25
    .line 26
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, La/bjj;->a()V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    new-instance p1, La/i11;

    .line 43
    .line 44
    invoke-direct {p1, v4, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 48
    .line 49
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, La/bjj;->a()V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    new-instance p1, La/i11;

    .line 66
    .line 67
    invoke-direct {p1, v3, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 71
    .line 72
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, La/bjj;->a()V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    new-instance p1, La/i11;

    .line 89
    .line 90
    invoke-direct {p1, v2, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 94
    .line 95
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, La/bjj;->a()V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    new-instance p1, La/i11;

    .line 112
    .line 113
    invoke-direct {p1, v1, v2, v3, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 117
    .line 118
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, La/bjj;->a()V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_4
    check-cast p1, La/jtl;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    instance-of v0, p1, La/ql1;

    .line 134
    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    sget-object v0, La/xp0;->a:La/xp0;

    .line 138
    .line 139
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    :cond_0
    instance-of p1, p1, La/va0;

    .line 143
    .line 144
    if-eqz p1, :cond_1

    .line 145
    .line 146
    sget-object p1, La/sp0;->a:La/sp0;

    .line 147
    .line 148
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    new-instance v0, La/nl0;

    .line 161
    .line 162
    invoke-direct {v0, p1}, La/nl0;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    sget-object p1, La/ml0;->a:La/ml0;

    .line 177
    .line 178
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_7
    check-cast p1, La/cvl;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v0, La/kxq0;

    .line 190
    .line 191
    new-instance v1, La/xj0;

    .line 192
    .line 193
    iget p1, p1, La/cvl;->a:I

    .line 194
    .line 195
    invoke-direct {v1, p1}, La/xj0;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, v1}, La/kxq0;-><init>(La/ik0;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_8
    check-cast p1, La/bkl;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v0, La/cf0;

    .line 213
    .line 214
    invoke-direct {v0, p1}, La/cf0;-><init>(La/bkl;)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_9
    check-cast p1, Ljava/lang/Long;

    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    new-instance p1, La/ve0;

    .line 230
    .line 231
    invoke-direct {p1, v0, v1}, La/ve0;-><init>(J)V

    .line 232
    .line 233
    .line 234
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    sget-object p1, La/bf0;->a:La/bf0;

    .line 246
    .line 247
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_b
    check-cast p1, La/eol;

    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-instance v0, La/dd0;

    .line 259
    .line 260
    invoke-direct {v0, p1}, La/dd0;-><init>(La/eol;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_c
    check-cast p1, La/cp;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 275
    .line 276
    check-cast v0, La/wrx;

    .line 277
    .line 278
    iget-object v0, v0, La/wrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 279
    .line 280
    new-instance v1, La/xb;

    .line 281
    .line 282
    invoke-direct {v1, p0, p1, v4}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 283
    .line 284
    .line 285
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 286
    .line 287
    .line 288
    new-instance p0, La/j9;

    .line 289
    .line 290
    const/16 v0, 0xf

    .line 291
    .line 292
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 296
    .line 297
    .line 298
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_d
    check-cast p1, La/cp;

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 307
    .line 308
    check-cast v0, La/vrx;

    .line 309
    .line 310
    iget-object v0, v0, La/vrx;->a:Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 311
    .line 312
    new-instance v2, La/xb;

    .line 313
    .line 314
    invoke-direct {v2, p0, p1, v1}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 315
    .line 316
    .line 317
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 318
    .line 319
    .line 320
    new-instance p0, La/j9;

    .line 321
    .line 322
    const/16 v0, 0xe

    .line 323
    .line 324
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 328
    .line 329
    .line 330
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_e
    check-cast p1, La/jtl;

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    sget-object p1, La/a10;->a:La/a10;

    .line 339
    .line 340
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_f
    check-cast p1, La/x5q0;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    instance-of v0, p1, La/w5q0;

    .line 352
    .line 353
    if-eqz v0, :cond_2

    .line 354
    .line 355
    new-instance v0, La/wv;

    .line 356
    .line 357
    check-cast p1, La/w5q0;

    .line 358
    .line 359
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 360
    .line 361
    invoke-direct {v0, p1}, La/wv;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    return-object p0

    .line 370
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object p0

    .line 381
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    new-instance v0, La/mm;

    .line 387
    .line 388
    invoke-direct {v0, p1}, La/mm;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object p0

    .line 397
    :pswitch_12
    check-cast p1, La/cp;

    .line 398
    .line 399
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 403
    .line 404
    check-cast v0, La/krx;

    .line 405
    .line 406
    iget-object v1, v0, La/krx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    new-instance v4, La/xb;

    .line 412
    .line 413
    invoke-direct {v4, p0, p1, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 414
    .line 415
    .line 416
    invoke-static {v1, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 417
    .line 418
    .line 419
    iget-object v0, v0, La/krx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightAccordion;

    .line 420
    .line 421
    new-instance v1, La/xb;

    .line 422
    .line 423
    invoke-direct {v1, p0, p1, v3}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 424
    .line 425
    .line 426
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 427
    .line 428
    .line 429
    new-instance p0, La/j9;

    .line 430
    .line 431
    const/16 v0, 0x9

    .line 432
    .line 433
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 437
    .line 438
    .line 439
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    return-object p0

    .line 442
    :pswitch_13
    check-cast p1, La/vdj0;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    new-instance v0, La/ryi0;

    .line 448
    .line 449
    invoke-direct {v0, p1}, La/ryi0;-><init>(La/vdj0;)V

    .line 450
    .line 451
    .line 452
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object p0

    .line 458
    :pswitch_14
    check-cast p1, La/g9;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    new-instance v0, La/hyi0;

    .line 464
    .line 465
    invoke-direct {v0, p1}, La/hyi0;-><init>(La/g9;)V

    .line 466
    .line 467
    .line 468
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_15
    check-cast p1, La/wy30;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    new-instance v0, La/pu30;

    .line 480
    .line 481
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 482
    .line 483
    .line 484
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    return-object p0

    .line 490
    :pswitch_16
    check-cast p1, La/wy30;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    new-instance v0, La/pu30;

    .line 496
    .line 497
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 498
    .line 499
    .line 500
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    return-object p0

    .line 506
    :pswitch_17
    check-cast p1, La/wy30;

    .line 507
    .line 508
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    new-instance v0, La/pu30;

    .line 512
    .line 513
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 514
    .line 515
    .line 516
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object p0

    .line 522
    :pswitch_18
    check-cast p1, La/wy30;

    .line 523
    .line 524
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    new-instance v0, La/pu30;

    .line 528
    .line 529
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 530
    .line 531
    .line 532
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object p0

    .line 538
    :pswitch_19
    check-cast p1, La/wy30;

    .line 539
    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    new-instance v0, La/pu30;

    .line 544
    .line 545
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 546
    .line 547
    .line 548
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    return-object p0

    .line 554
    :pswitch_1a
    check-cast p1, La/wy30;

    .line 555
    .line 556
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    new-instance v0, La/pu30;

    .line 560
    .line 561
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 562
    .line 563
    .line 564
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 568
    .line 569
    return-object p0

    .line 570
    :pswitch_1b
    check-cast p1, La/wy30;

    .line 571
    .line 572
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    new-instance v0, La/pu30;

    .line 576
    .line 577
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 578
    .line 579
    .line 580
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object p0

    .line 586
    :pswitch_1c
    check-cast p1, La/wy30;

    .line 587
    .line 588
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    new-instance v0, La/pu30;

    .line 592
    .line 593
    invoke-direct {v0, p1}, La/pu30;-><init>(La/wy30;)V

    .line 594
    .line 595
    .line 596
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object p0

    .line 602
    nop

    .line 603
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
