.class public final synthetic La/kej0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/settings/impl/presentation/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/settings/impl/presentation/a;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kej0;->a:B

    iput-object p1, p0, La/kej0;->b:Lorg/xplatform/settings/impl/presentation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/kej0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, La/kej0;->b:Lorg/xplatform/settings/impl/presentation/a;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Throwable;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 18
    .line 19
    new-instance v0, La/mej0;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 37
    .line 38
    new-instance v0, La/mej0;

    .line 39
    .line 40
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->y0:La/hfk0;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance p0, Lorg/xplatform/auth_history/impl/navigation/AuthHistoryScreenFactoryImpl$getScreen$1;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, La/c8d;

    .line 71
    .line 72
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 73
    .line 74
    new-instance v0, La/bjk;

    .line 75
    .line 76
    invoke-direct {v0, v3, v4, v4, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 77
    .line 78
    .line 79
    new-instance v1, La/v7d;

    .line 80
    .line 81
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->I:La/y3j0;

    .line 95
    .line 96
    invoke-static {p0}, La/y3j0;->a(La/y3j0;)Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, La/c8d;

    .line 107
    .line 108
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 109
    .line 110
    new-instance v0, La/bjk;

    .line 111
    .line 112
    invoke-direct {v0, v3, v4, v4, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 113
    .line 114
    .line 115
    new-instance v1, La/v7d;

    .line 116
    .line 117
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 131
    .line 132
    new-instance v1, La/mej0;

    .line 133
    .line 134
    invoke-direct {v1, v2}, La/mej0;-><init>(B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 141
    .line 142
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->p:La/uuz;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance p0, Lorg/xplatform/mailing/impl/navigation/MailingScreenFactoryImpl$getMailingManagementFragment$1;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 157
    .line 158
    .line 159
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 160
    .line 161
    invoke-static {p1, p0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    :goto_0
    move-object v0, p0

    .line 166
    check-cast v0, La/paw;

    .line 167
    .line 168
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_0

    .line 173
    .line 174
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/oe50;

    .line 179
    .line 180
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 193
    .line 194
    new-instance v0, La/mej0;

    .line 195
    .line 196
    const/4 v1, 0x3

    .line 197
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 212
    .line 213
    new-instance v0, La/mej0;

    .line 214
    .line 215
    const/16 v1, 0xb

    .line 216
    .line 217
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_6
    check-cast p1, La/k0w0;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->G:La/nh70;

    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 237
    .line 238
    const-string v0, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 239
    .line 240
    const-string v1, "SETTINGS_QR_SCANNER_BUNDLE_KEY"

    .line 241
    .line 242
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 246
    .line 247
    .line 248
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 257
    .line 258
    new-instance v0, La/mej0;

    .line 259
    .line 260
    const/4 v1, 0x5

    .line 261
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 265
    .line 266
    .line 267
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_8
    check-cast p1, La/k0w0;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->p:La/uuz;

    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    new-instance p0, Lorg/xplatform/mailing/impl/navigation/MailingScreenFactoryImpl$getMailingManagementFragment$1;

    .line 281
    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast p0, La/c8d;

    .line 292
    .line 293
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 294
    .line 295
    new-instance v0, La/bjk;

    .line 296
    .line 297
    invoke-direct {v0, v3, v4, v4, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 298
    .line 299
    .line 300
    new-instance v1, La/v7d;

    .line 301
    .line 302
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 303
    .line 304
    .line 305
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 306
    .line 307
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 316
    .line 317
    new-instance v0, La/mej0;

    .line 318
    .line 319
    const/16 v1, 0x8

    .line 320
    .line 321
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 325
    .line 326
    .line 327
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object p0

    .line 330
    :pswitch_a
    check-cast p1, La/igc;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    sget-object p1, La/d1j0;->a:La/d1j0;

    .line 336
    .line 337
    invoke-virtual {p0, p1, v3}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 338
    .line 339
    .line 340
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 344
    .line 345
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 349
    .line 350
    new-instance v0, La/mej0;

    .line 351
    .line 352
    const/16 v1, 0xa

    .line 353
    .line 354
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object p0

    .line 363
    :pswitch_c
    check-cast p1, La/k0w0;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v0, La/lej0;

    .line 369
    .line 370
    invoke-direct {v0, p0, v1}, La/lej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 371
    .line 372
    .line 373
    new-instance p0, La/a1w0;

    .line 374
    .line 375
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p0, La/c8d;

    .line 385
    .line 386
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 387
    .line 388
    new-instance v0, La/bjk;

    .line 389
    .line 390
    invoke-direct {v0, v3, v4, v4, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 391
    .line 392
    .line 393
    new-instance v1, La/v7d;

    .line 394
    .line 395
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 396
    .line 397
    .line 398
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 404
    .line 405
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 409
    .line 410
    new-instance v0, La/mej0;

    .line 411
    .line 412
    const/4 v1, 0x6

    .line 413
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 417
    .line 418
    .line 419
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object p0

    .line 422
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 423
    .line 424
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    instance-of v0, p1, La/zed0;

    .line 428
    .line 429
    if-eqz v0, :cond_1

    .line 430
    .line 431
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->b0:La/ubu;

    .line 432
    .line 433
    invoke-virtual {p1}, La/ubu;->a()Z

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    xor-int/2addr p1, v2

    .line 438
    invoke-virtual {p0, p1}, Lorg/xplatform/settings/impl/presentation/a;->I(Z)V

    .line 439
    .line 440
    .line 441
    goto :goto_2

    .line 442
    :cond_1
    invoke-virtual {p0, v4}, Lorg/xplatform/settings/impl/presentation/a;->I(Z)V

    .line 443
    .line 444
    .line 445
    instance-of v0, p1, La/zhi0;

    .line 446
    .line 447
    if-eqz v0, :cond_2

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    if-nez v0, :cond_3

    .line 454
    .line 455
    const-string v0, ""

    .line 456
    .line 457
    goto :goto_1

    .line 458
    :cond_2
    iget-object v0, p0, Lorg/xplatform/settings/impl/presentation/a;->q:La/ctf0;

    .line 459
    .line 460
    new-array v1, v4, [Ljava/lang/Object;

    .line 461
    .line 462
    const v2, 0x7f1304e3

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v2, v1}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    :cond_3
    :goto_1
    new-instance v1, La/i1j0;

    .line 470
    .line 471
    invoke-direct {v1, v0}, La/i1j0;-><init>(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {p0, v1, v3}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 475
    .line 476
    .line 477
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 478
    .line 479
    new-instance v0, La/mej0;

    .line 480
    .line 481
    const/4 v1, 0x7

    .line 482
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 486
    .line 487
    .line 488
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 497
    .line 498
    new-instance v0, La/mej0;

    .line 499
    .line 500
    invoke-direct {v0, v4}, La/mej0;-><init>(B)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 504
    .line 505
    .line 506
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    return-object p0

    .line 509
    :pswitch_10
    check-cast p1, La/k0w0;

    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p1, v3}, La/k0w0;->c(La/m7h0;)V

    .line 515
    .line 516
    .line 517
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->G0:La/mi70;

    .line 518
    .line 519
    new-instance v0, La/i38;

    .line 520
    .line 521
    invoke-direct {v0, v4}, La/i38;-><init>(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 528
    .line 529
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 533
    .line 534
    .line 535
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object p0

    .line 538
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 539
    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 544
    .line 545
    new-instance v1, La/uph0;

    .line 546
    .line 547
    const/16 v2, 0x16

    .line 548
    .line 549
    invoke-direct {v1, p0, v2}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 556
    .line 557
    return-object p0

    .line 558
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    iget-object p0, p0, Lorg/xplatform/settings/impl/presentation/a;->C:La/duj;

    .line 564
    .line 565
    new-instance v0, La/r3j0;

    .line 566
    .line 567
    const/16 v1, 0x1d

    .line 568
    .line 569
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 573
    .line 574
    .line 575
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object p0

    .line 578
    nop

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
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
