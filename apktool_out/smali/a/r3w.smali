.class public final synthetic La/r3w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r3w;->a:B

    iput-object p1, p0, La/r3w;->b:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/r3w;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/r3w;->b:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/iz3;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_6
    check-cast p1, La/jtl;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_7
    check-cast p1, La/jtl;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_8
    check-cast p1, La/abi0;

    .line 118
    .line 119
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    move-object v0, p0

    .line 124
    check-cast v0, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_4

    .line 135
    .line 136
    move-object v2, p0

    .line 137
    :cond_4
    check-cast v2, Ljava/lang/Float;

    .line 138
    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    goto :goto_0

    .line 146
    :cond_5
    move p0, v3

    .line 147
    :goto_0
    new-instance v0, La/cvc;

    .line 148
    .line 149
    invoke-direct {v0, v3, v1}, La/cvc;-><init>(FF)V

    .line 150
    .line 151
    .line 152
    new-instance v1, La/g3c0;

    .line 153
    .line 154
    invoke-direct {v1, p0, v0}, La/g3c0;-><init>(FLa/cvc;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1, v1}, La/yai0;->d(La/abi0;La/g3c0;)V

    .line 158
    .line 159
    .line 160
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_9
    check-cast p1, La/abi0;

    .line 164
    .line 165
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    move-object v0, p0

    .line 170
    check-cast v0, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_6

    .line 181
    .line 182
    move-object v2, p0

    .line 183
    :cond_6
    check-cast v2, Ljava/lang/Float;

    .line 184
    .line 185
    if-eqz v2, :cond_7

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    goto :goto_1

    .line 192
    :cond_7
    move p0, v3

    .line 193
    :goto_1
    new-instance v0, La/cvc;

    .line 194
    .line 195
    invoke-direct {v0, v3, v1}, La/cvc;-><init>(FF)V

    .line 196
    .line 197
    .line 198
    new-instance v1, La/g3c0;

    .line 199
    .line 200
    invoke-direct {v1, p0, v0}, La/g3c0;-><init>(FLa/cvc;)V

    .line 201
    .line 202
    .line 203
    invoke-static {p1, v1}, La/yai0;->d(La/abi0;La/g3c0;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_a
    check-cast p1, Landroid/view/View;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_b
    check-cast p1, Landroid/view/View;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_c
    check-cast p1, Landroid/view/View;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    if-nez p1, :cond_8

    .line 249
    .line 250
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_e
    check-cast p1, La/abi0;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast p0, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    if-eqz p0, :cond_9

    .line 272
    .line 273
    sget-object p0, La/oie;->a:La/mie;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    sget-object p0, La/mie;->b:La/ky2;

    .line 279
    .line 280
    sget-object v0, La/mie;->d:La/ky2;

    .line 281
    .line 282
    invoke-virtual {p0, v0}, La/ky2;->a(La/oie;)La/ky2;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    goto :goto_2

    .line 287
    :cond_9
    sget-object p0, La/oie;->a:La/mie;

    .line 288
    .line 289
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    sget-object p0, La/mie;->k:La/ky2;

    .line 293
    .line 294
    sget-object v0, La/mie;->l:La/ky2;

    .line 295
    .line 296
    invoke-virtual {p0, v0}, La/ky2;->a(La/oie;)La/ky2;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    sget-object v0, La/mie;->m:La/ky2;

    .line 301
    .line 302
    invoke-virtual {p0, v0}, La/ky2;->a(La/oie;)La/ky2;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    :goto_2
    invoke-static {p1, p0}, La/yai0;->c(La/abi0;La/oie;)V

    .line 307
    .line 308
    .line 309
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_f
    check-cast p1, La/ne60;

    .line 313
    .line 314
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 321
    .line 322
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object p0

    .line 328
    :pswitch_11
    check-cast p1, Landroid/view/View;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object p0

    .line 339
    :pswitch_12
    check-cast p1, Landroid/view/View;

    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object p0

    .line 350
    :pswitch_13
    check-cast p1, Landroid/view/View;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_14
    check-cast p1, Landroid/view/View;

    .line 362
    .line 363
    sget v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->e:I

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_15
    check-cast p1, Landroid/view/View;

    .line 375
    .line 376
    sget v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->e:I

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object p0

    .line 387
    :pswitch_16
    check-cast p1, Landroid/view/View;

    .line 388
    .line 389
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->t:I

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_17
    check-cast p1, Landroid/view/View;

    .line 401
    .line 402
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceView;->b:I

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object p0

    .line 413
    :pswitch_18
    check-cast p1, Landroid/view/View;

    .line 414
    .line 415
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceView;->b:I

    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object p0

    .line 426
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object p0

    .line 437
    :pswitch_1a
    check-cast p1, Landroid/view/View;

    .line 438
    .line 439
    sget v0, Lorg/xplatform/uikit/components/lottie/LottieView;->o1:I

    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    return-object p0

    .line 450
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 451
    .line 452
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 456
    .line 457
    return-object p0

    .line 458
    :pswitch_1c
    check-cast p1, La/abi0;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    move-object v0, p0

    .line 468
    check-cast v0, Ljava/lang/Number;

    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-nez v0, :cond_a

    .line 479
    .line 480
    move-object v2, p0

    .line 481
    :cond_a
    check-cast v2, Ljava/lang/Float;

    .line 482
    .line 483
    if-eqz v2, :cond_b

    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 486
    .line 487
    .line 488
    move-result p0

    .line 489
    goto :goto_3

    .line 490
    :cond_b
    move p0, v3

    .line 491
    :goto_3
    new-instance v0, La/cvc;

    .line 492
    .line 493
    invoke-direct {v0, v3, v1}, La/cvc;-><init>(FF)V

    .line 494
    .line 495
    .line 496
    new-instance v1, La/g3c0;

    .line 497
    .line 498
    invoke-direct {v1, p0, v0}, La/g3c0;-><init>(FLa/cvc;)V

    .line 499
    .line 500
    .line 501
    invoke-static {p1, v1}, La/yai0;->d(La/abi0;La/g3c0;)V

    .line 502
    .line 503
    .line 504
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object p0

    .line 507
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
