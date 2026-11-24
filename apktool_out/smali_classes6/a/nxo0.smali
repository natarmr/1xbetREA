.class public final synthetic La/nxo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nxo0;->a:B

    iput-object p1, p0, La/nxo0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/nxo0;->a:B

    .line 2
    .line 3
    const-string v1, "viewModelFactory"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/nxo0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/l2q0;

    .line 12
    .line 13
    iput-object v2, p0, La/l2q0;->f1:La/k2q0;

    .line 14
    .line 15
    invoke-static {p0}, La/s0x;->S(La/qai0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, La/n7x;->I(La/v6z;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p0, La/b0q0;

    .line 28
    .line 29
    sget-object v0, La/b0q0;->P1:La/g9m0;

    .line 30
    .line 31
    iget-object p0, p0, La/b0q0;->M1:La/fiu0;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v2

    .line 40
    :pswitch_1
    check-cast p0, La/ryp0;

    .line 41
    .line 42
    new-instance v0, La/q0h0;

    .line 43
    .line 44
    iget-object p0, p0, La/ryp0;->K1:La/wwi;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v2

    .line 56
    :pswitch_2
    check-cast p0, La/mne;

    .line 57
    .line 58
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object p0, p0, La/mne;->a:La/rwj;

    .line 63
    .line 64
    invoke-static {v0, p0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_3
    check-cast p0, La/fwp0;

    .line 74
    .line 75
    sget-object v0, La/fwp0;->h2:La/g9m0;

    .line 76
    .line 77
    iget-object v0, p0, La/fwp0;->f2:La/phf0;

    .line 78
    .line 79
    sget-object v1, La/fwp0;->i2:[La/iiy;

    .line 80
    .line 81
    const/4 v2, 0x1

    .line 82
    aget-object v1, v1, v2

    .line 83
    .line 84
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_4
    check-cast p0, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;

    .line 90
    .line 91
    new-instance v0, La/tup0;

    .line 92
    .line 93
    iget-object v1, p0, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;->b:Ljava/lang/String;

    .line 94
    .line 95
    iget-object p0, p0, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v0, v1, p0}, La/tup0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_5
    check-cast p0, La/cgk0;

    .line 102
    .line 103
    invoke-virtual {p0}, La/cgk0;->l()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_6
    check-cast p0, La/ftp0;

    .line 113
    .line 114
    iget p0, p0, La/ftp0;->d:I

    .line 115
    .line 116
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_7
    check-cast p0, La/bsp0;

    .line 122
    .line 123
    sget-object v0, La/bsp0;->R1:La/j6m0;

    .line 124
    .line 125
    iget-object p0, p0, La/bsp0;->Q1:La/fiu0;

    .line 126
    .line 127
    if-eqz p0, :cond_2

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v2

    .line 134
    :pswitch_8
    check-cast p0, La/fck0;

    .line 135
    .line 136
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, La/gii0;

    .line 139
    .line 140
    const-class v0, La/bpp0;

    .line 141
    .line 142
    sget-object v1, La/sre0;->a:La/tre0;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, La/bpp0;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_9
    check-cast p0, La/lop0;

    .line 156
    .line 157
    sget-object v0, La/lop0;->Q1:La/s9m0;

    .line 158
    .line 159
    iget-object p0, p0, La/lop0;->O1:La/fiu0;

    .line 160
    .line 161
    if-eqz p0, :cond_3

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v2

    .line 168
    :pswitch_a
    check-cast p0, La/inp0;

    .line 169
    .line 170
    new-instance v0, La/q0h0;

    .line 171
    .line 172
    iget-object p0, p0, La/inp0;->N1:La/owi;

    .line 173
    .line 174
    if-eqz p0, :cond_4

    .line 175
    .line 176
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v2

    .line 184
    :pswitch_b
    check-cast p0, La/afm0;

    .line 185
    .line 186
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, La/gii0;

    .line 189
    .line 190
    const-class v0, La/omp0;

    .line 191
    .line 192
    sget-object v1, La/sre0;->a:La/tre0;

    .line 193
    .line 194
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, La/omp0;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_c
    check-cast p0, La/g090;

    .line 206
    .line 207
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p0, La/gii0;

    .line 210
    .line 211
    const-class v0, La/slp0;

    .line 212
    .line 213
    sget-object v1, La/sre0;->a:La/tre0;

    .line 214
    .line 215
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, La/slp0;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_d
    check-cast p0, La/jkp0;

    .line 227
    .line 228
    new-instance v0, La/q0h0;

    .line 229
    .line 230
    iget-object p0, p0, La/jkp0;->N1:La/nwi;

    .line 231
    .line 232
    if-eqz p0, :cond_5

    .line 233
    .line 234
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v2

    .line 242
    :pswitch_e
    check-cast p0, La/fuj0;

    .line 243
    .line 244
    iget-object p0, p0, La/fuj0;->a:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p0, La/gii0;

    .line 247
    .line 248
    const-class v0, La/yjp0;

    .line 249
    .line 250
    sget-object v1, La/sre0;->a:La/tre0;

    .line 251
    .line 252
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    check-cast p0, La/yjp0;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_f
    check-cast p0, La/ajp0;

    .line 264
    .line 265
    sget-object v0, La/ajp0;->r2:La/s9m0;

    .line 266
    .line 267
    iget-object p0, p0, La/ajp0;->k2:La/fiu0;

    .line 268
    .line 269
    if-eqz p0, :cond_6

    .line 270
    .line 271
    return-object p0

    .line 272
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v2

    .line 276
    :pswitch_10
    check-cast p0, La/xgp0;

    .line 277
    .line 278
    sget-object v0, La/xgp0;->P1:La/m6m0;

    .line 279
    .line 280
    iget-object p0, p0, La/xgp0;->L1:La/fiu0;

    .line 281
    .line 282
    if-eqz p0, :cond_7

    .line 283
    .line 284
    return-object p0

    .line 285
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw v2

    .line 289
    :pswitch_11
    check-cast p0, La/trm0;

    .line 290
    .line 291
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast p0, La/gii0;

    .line 294
    .line 295
    const-class v0, La/ogp0;

    .line 296
    .line 297
    sget-object v1, La/sre0;->a:La/tre0;

    .line 298
    .line 299
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    check-cast p0, La/ogp0;

    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_12
    check-cast p0, La/hcp0;

    .line 311
    .line 312
    iget-object p0, p0, La/hcp0;->b:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast p0, La/gii0;

    .line 315
    .line 316
    const-class v0, La/gcp0;

    .line 317
    .line 318
    sget-object v1, La/sre0;->a:La/tre0;

    .line 319
    .line 320
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    check-cast p0, La/gcp0;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_13
    check-cast p0, La/pap0;

    .line 332
    .line 333
    iget-object p0, p0, La/pap0;->a:La/mdm;

    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_14
    check-cast p0, La/i7p0;

    .line 337
    .line 338
    iget-object p0, p0, La/i7p0;->a:La/mdm;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_15
    check-cast p0, La/fck0;

    .line 342
    .line 343
    iget-object p0, p0, La/fck0;->b:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast p0, La/gii0;

    .line 346
    .line 347
    const-class v0, La/x6p0;

    .line 348
    .line 349
    sget-object v1, La/sre0;->a:La/tre0;

    .line 350
    .line 351
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    check-cast p0, La/x6p0;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_16
    check-cast p0, La/t5p0;

    .line 363
    .line 364
    iget-object p0, p0, La/t5p0;->N1:La/fiu0;

    .line 365
    .line 366
    if-eqz p0, :cond_8

    .line 367
    .line 368
    return-object p0

    .line 369
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v2

    .line 373
    :pswitch_17
    check-cast p0, La/afm0;

    .line 374
    .line 375
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p0, La/gii0;

    .line 378
    .line 379
    const-class v0, La/d5p0;

    .line 380
    .line 381
    sget-object v1, La/sre0;->a:La/tre0;

    .line 382
    .line 383
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    check-cast p0, La/d5p0;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_18
    check-cast p0, La/wcp;

    .line 395
    .line 396
    new-instance v0, La/t6n;

    .line 397
    .line 398
    sget-object v1, La/d4d;->t:La/d4d;

    .line 399
    .line 400
    sget-object v2, La/w6n;->h:La/w6n;

    .line 401
    .line 402
    new-instance v3, La/c280;

    .line 403
    .line 404
    iget-object p0, p0, La/wcp;->d:Ljava/lang/String;

    .line 405
    .line 406
    const v4, 0x7f0809ae

    .line 407
    .line 408
    .line 409
    invoke-direct {v3, p0, v4}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 410
    .line 411
    .line 412
    invoke-direct {v0, v1, v2, v3}, La/t6n;-><init>(La/d4d;La/w6n;La/c280;)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_19
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 417
    .line 418
    iget-object v3, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->e:Ljava/lang/String;

    .line 419
    .line 420
    new-instance v0, La/z2p0;

    .line 421
    .line 422
    const/4 v6, 0x1

    .line 423
    const/4 v7, 0x0

    .line 424
    const/4 v1, 0x0

    .line 425
    const/4 v2, 0x0

    .line 426
    const/4 v4, 0x0

    .line 427
    const/4 v5, 0x0

    .line 428
    invoke-direct/range {v0 .. v7}, La/z2p0;-><init>(La/t1p0;La/nfp0;Ljava/lang/String;ZLa/x2p0;ZZ)V

    .line 429
    .line 430
    .line 431
    return-object v0

    .line 432
    :pswitch_1a
    check-cast p0, La/lyo0;

    .line 433
    .line 434
    iget-object p0, p0, La/lyo0;->d:La/j3p0;

    .line 435
    .line 436
    iget-boolean p0, p0, La/j3p0;->a:Z

    .line 437
    .line 438
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    return-object p0

    .line 443
    :pswitch_1b
    check-cast p0, La/sxo0;

    .line 444
    .line 445
    new-instance v0, La/uxo0;

    .line 446
    .line 447
    sget-object v1, La/bop0;->b:La/m6m0;

    .line 448
    .line 449
    iget p0, p0, La/sxo0;->a:I

    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    invoke-static {p0}, La/m6m0;->j(I)La/bop0;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    invoke-direct {v0, p0}, La/uxo0;-><init>(La/bop0;)V

    .line 459
    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_1c
    check-cast p0, La/oxo0;

    .line 463
    .line 464
    sget-object v0, La/oxo0;->q2:La/s2m0;

    .line 465
    .line 466
    iget-object p0, p0, La/oxo0;->k2:La/fiu0;

    .line 467
    .line 468
    if-eqz p0, :cond_9

    .line 469
    .line 470
    return-object p0

    .line 471
    :cond_9
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v2

    .line 475
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
