.class public final synthetic La/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/z;->a:B

    iput-boolean p2, p0, La/z;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/zrj;Z)V
    .locals 0

    .line 1
    const/16 p1, 0xc

    iput-byte p1, p0, La/z;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, La/z;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/z;->a:B

    .line 2
    .line 3
    sget-object v1, La/n0w0;->a:La/n0w0;

    .line 4
    .line 5
    const-string v2, "unchecked"

    .line 6
    .line 7
    const-string v3, "checked"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/high16 v6, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/high16 v7, -0x40800000    # -1.0f

    .line 14
    .line 15
    iget-boolean p0, p0, La/z;->b:Z

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, La/abi0;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p0}, La/p8n;->c(La/abi0;Z)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/abi0;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p0}, La/p8n;->c(La/abi0;Z)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    check-cast p1, La/abi0;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_2
    check-cast p1, La/abi0;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_3
    check-cast p1, La/abi0;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_4
    check-cast p1, La/abi0;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    if-eqz p0, :cond_0

    .line 81
    .line 82
    const-string p0, "Expanded"

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const-string p0, "Collapsed"

    .line 86
    .line 87
    :goto_0
    invoke-static {p1, p0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_5
    check-cast p1, La/abi0;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    if-eqz p0, :cond_1

    .line 99
    .line 100
    move-object v2, v3

    .line 101
    :cond_1
    invoke-static {p1, v2}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, La/xai0;->L:La/zai0;

    .line 105
    .line 106
    if-eqz p0, :cond_2

    .line 107
    .line 108
    sget-object p0, La/evq0;->a:La/evq0;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    sget-object p0, La/evq0;->b:La/evq0;

    .line 112
    .line 113
    :goto_1
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_6
    check-cast p1, La/abi0;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    if-eqz p0, :cond_3

    .line 125
    .line 126
    move-object v2, v3

    .line 127
    :cond_3
    invoke-static {p1, v2}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_7
    check-cast p1, La/abi0;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_8
    check-cast p1, La/abi0;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    if-eqz p0, :cond_4

    .line 150
    .line 151
    const-string p0, "Active"

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    const-string p0, "Inactive"

    .line 155
    .line 156
    :goto_2
    invoke-static {p1, p0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_9
    check-cast p1, La/abi0;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v0, La/i2m;->b:La/zai0;

    .line 168
    .line 169
    sget-object v1, La/i2m;->a:[La/iiy;

    .line 170
    .line 171
    aget-object v1, v1, v4

    .line 172
    .line 173
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_a
    check-cast p1, La/uag0;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    if-eqz p0, :cond_5

    .line 192
    .line 193
    move v6, v7

    .line 194
    :cond_5
    invoke-virtual {p1, v6}, La/uag0;->w(F)V

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_b
    check-cast p1, La/uag0;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    if-eqz p0, :cond_6

    .line 206
    .line 207
    move v6, v7

    .line 208
    :cond_6
    invoke-virtual {p1, v6}, La/uag0;->w(F)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_c
    check-cast p1, La/uag0;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    if-eqz p0, :cond_7

    .line 220
    .line 221
    move v6, v7

    .line 222
    :cond_7
    invoke-virtual {p1, v6}, La/uag0;->w(F)V

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_d
    check-cast p1, La/uag0;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    if-eqz p0, :cond_8

    .line 234
    .line 235
    move v6, v7

    .line 236
    :cond_8
    invoke-virtual {p1, v6}, La/uag0;->w(F)V

    .line 237
    .line 238
    .line 239
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_e
    check-cast p1, La/uag0;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    if-eqz p0, :cond_9

    .line 248
    .line 249
    invoke-virtual {p1, v7}, La/uag0;->w(F)V

    .line 250
    .line 251
    .line 252
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_f
    check-cast p1, La/k0w0;

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v1}, La/k0w0;->a(La/g1w0;)La/okt0;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1}, La/okt0;->c()La/t44;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v1, La/bjk;

    .line 272
    .line 273
    invoke-direct {v1, v5, v4, v4, p0}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 274
    .line 275
    .line 276
    iput-object v1, v0, La/t44;->a:La/bjk;

    .line 277
    .line 278
    iget-object p0, p1, La/okt0;->a:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p0, La/c8d;

    .line 281
    .line 282
    invoke-virtual {p1}, La/okt0;->c()La/t44;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-virtual {p1}, La/t44;->a()La/u7d;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    iput-object p1, p0, La/c8d;->a:La/w7d;

    .line 291
    .line 292
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_10
    check-cast p1, La/k0w0;

    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    new-instance v0, Lorg/xplatform/cashback/impl/navigation/CashbackScreenFactoryImpl$getCashbackScreen$1;

    .line 301
    .line 302
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p1, La/c8d;

    .line 312
    .line 313
    sget-object v0, La/cfx0;->o:La/bjk;

    .line 314
    .line 315
    new-instance v1, La/bjk;

    .line 316
    .line 317
    invoke-direct {v1, v5, v4, v4, p0}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 318
    .line 319
    .line 320
    new-instance p0, La/v7d;

    .line 321
    .line 322
    const/4 v2, 0x1

    .line 323
    invoke-direct {p0, v2, v0, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 324
    .line 325
    .line 326
    iput-object p0, p1, La/c8d;->a:La/w7d;

    .line 327
    .line 328
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_11
    check-cast p1, La/n1g;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance v0, La/mq2;

    .line 337
    .line 338
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 339
    .line 340
    .line 341
    iput-object v0, p1, La/n1g;->e:La/ms2;

    .line 342
    .line 343
    sget-object v0, La/l1g;->b:La/l1g;

    .line 344
    .line 345
    iput-object v0, p1, La/n1g;->f:La/l1g;

    .line 346
    .line 347
    if-eqz p0, :cond_a

    .line 348
    .line 349
    sget-object p0, La/k1g;->c:La/k1g;

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :cond_a
    sget-object p0, La/k1g;->d:La/k1g;

    .line 353
    .line 354
    :goto_3
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 355
    .line 356
    sget-object p0, La/j1g;->c:La/j1g;

    .line 357
    .line 358
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 359
    .line 360
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_12
    check-cast p1, Landroid/content/Context;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 369
    .line 370
    const/4 v1, 0x6

    .line 371
    invoke-direct {v0, p1, v5, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setCenterInParent(Z)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_13
    check-cast p1, La/uag0;

    .line 379
    .line 380
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    if-eqz p0, :cond_b

    .line 384
    .line 385
    move v6, v7

    .line 386
    :cond_b
    invoke-virtual {p1, v6}, La/uag0;->w(F)V

    .line 387
    .line 388
    .line 389
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object p0

    .line 392
    :pswitch_14
    check-cast p1, La/abi0;

    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 398
    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_15
    check-cast p1, La/abi0;

    .line 404
    .line 405
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 409
    .line 410
    .line 411
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object p0

    .line 414
    :pswitch_16
    check-cast p1, La/abi0;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 420
    .line 421
    .line 422
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object p0

    .line 425
    :pswitch_17
    check-cast p1, La/abi0;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 431
    .line 432
    .line 433
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object p0

    .line 436
    :pswitch_18
    check-cast p1, La/abi0;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {p1, p0}, La/yai0;->f(La/abi0;Z)V

    .line 442
    .line 443
    .line 444
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object p0

    .line 447
    :pswitch_19
    check-cast p1, La/uag0;

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    if-eqz p0, :cond_c

    .line 453
    .line 454
    move v6, v7

    .line 455
    :cond_c
    invoke-virtual {p1, v6}, La/uag0;->w(F)V

    .line 456
    .line 457
    .line 458
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object p0

    .line 461
    :pswitch_1a
    check-cast p1, La/k0w0;

    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-virtual {p1, v1}, La/k0w0;->a(La/g1w0;)La/okt0;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p1}, La/okt0;->c()La/t44;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    new-instance v1, Ljava/util/ArrayList;

    .line 478
    .line 479
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 480
    .line 481
    .line 482
    if-eqz p0, :cond_d

    .line 483
    .line 484
    new-instance p0, La/q0w0;

    .line 485
    .line 486
    invoke-direct {p0, v5}, La/q0w0;-><init>(La/m7h0;)V

    .line 487
    .line 488
    .line 489
    new-instance v2, La/ho4;

    .line 490
    .line 491
    sget-object v3, La/y7d;->a:La/v7d;

    .line 492
    .line 493
    invoke-direct {v2, p0, v3}, La/ho4;-><init>(La/q0w0;La/w7d;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    :cond_d
    iput-object v1, v0, La/t44;->b:Ljava/util/List;

    .line 500
    .line 501
    iget-object p0, p1, La/okt0;->a:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast p0, La/c8d;

    .line 504
    .line 505
    invoke-virtual {p1}, La/okt0;->c()La/t44;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-virtual {p1}, La/t44;->a()La/u7d;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    iput-object p1, p0, La/c8d;->a:La/w7d;

    .line 514
    .line 515
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object p0

    .line 518
    :pswitch_1b
    check-cast p1, La/uag0;

    .line 519
    .line 520
    sget-object v0, La/cl1;->o2:La/gfk0;

    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    if-eqz p0, :cond_e

    .line 526
    .line 527
    const/high16 p0, 0x43340000    # 180.0f

    .line 528
    .line 529
    goto :goto_4

    .line 530
    :cond_e
    const/4 p0, 0x0

    .line 531
    :goto_4
    invoke-virtual {p1, p0}, La/uag0;->v(F)V

    .line 532
    .line 533
    .line 534
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 535
    .line 536
    return-object p0

    .line 537
    :pswitch_1c
    check-cast p1, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 538
    .line 539
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 543
    .line 544
    .line 545
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    return-object p0

    .line 548
    nop

    .line 549
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
