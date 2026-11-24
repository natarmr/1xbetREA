.class public final synthetic La/ywi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xxi0;


# direct methods
.method public synthetic constructor <init>(La/xxi0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ywi0;->a:B

    iput-object p1, p0, La/ywi0;->b:La/xxi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ywi0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, La/ywi0;->b:La/xxi0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 17
    .line 18
    new-instance v0, La/kui0;

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/xxi0;->E:La/uuz;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p0, Lorg/xplatform/mailing/impl/navigation/MailingScreenFactoryImpl$getMailingManagementFragment$1;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, La/c8d;

    .line 52
    .line 53
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 54
    .line 55
    new-instance v0, La/bjk;

    .line 56
    .line 57
    invoke-direct {v0, v1, v2, v2, v3}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/v7d;

    .line 61
    .line 62
    invoke-direct {v1, v3, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/xxi0;->M0:La/hfk0;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance p0, Lorg/xplatform/auth_history/impl/navigation/AuthHistoryScreenFactoryImpl$getScreen$1;

    .line 81
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, La/c8d;

    .line 92
    .line 93
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 94
    .line 95
    new-instance v0, La/bjk;

    .line 96
    .line 97
    invoke-direct {v0, v1, v2, v2, v3}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 98
    .line 99
    .line 100
    new-instance v1, La/v7d;

    .line 101
    .line 102
    invoke-direct {v1, v3, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 116
    .line 117
    new-instance v0, La/kui0;

    .line 118
    .line 119
    const/16 v1, 0xa

    .line 120
    .line 121
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 136
    .line 137
    new-instance v0, La/kui0;

    .line 138
    .line 139
    const/16 v1, 0x8

    .line 140
    .line 141
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 156
    .line 157
    new-instance v0, La/kui0;

    .line 158
    .line 159
    const/16 v1, 0x15

    .line 160
    .line 161
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, La/xxi0;->R:La/duj;

    .line 176
    .line 177
    new-instance v1, La/bxi0;

    .line 178
    .line 179
    invoke-direct {v1, p0, v3}, La/bxi0;-><init>(La/xxi0;B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_6
    check-cast p1, La/igc;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object p1, La/d1j0;->a:La/d1j0;

    .line 194
    .line 195
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 207
    .line 208
    new-instance v0, La/kui0;

    .line 209
    .line 210
    const/16 v1, 0xe

    .line 211
    .line 212
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 216
    .line 217
    .line 218
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 227
    .line 228
    new-instance v0, La/kui0;

    .line 229
    .line 230
    const/16 v1, 0xd

    .line 231
    .line 232
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 236
    .line 237
    .line 238
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    instance-of v0, p1, La/zed0;

    .line 247
    .line 248
    if-eqz v0, :cond_0

    .line 249
    .line 250
    iget-object p1, p0, La/xxi0;->p0:La/ubu;

    .line 251
    .line 252
    invoke-virtual {p1}, La/ubu;->a()Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    xor-int/2addr p1, v3

    .line 257
    invoke-virtual {p0, p1}, La/xxi0;->U(Z)V

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_0
    invoke-virtual {p0, v2}, La/xxi0;->U(Z)V

    .line 262
    .line 263
    .line 264
    instance-of v0, p1, La/zhi0;

    .line 265
    .line 266
    if-eqz v0, :cond_1

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-nez v0, :cond_2

    .line 273
    .line 274
    const-string v0, ""

    .line 275
    .line 276
    goto :goto_0

    .line 277
    :cond_1
    iget-object v0, p0, La/xxi0;->F:La/ctf0;

    .line 278
    .line 279
    new-array v1, v2, [Ljava/lang/Object;

    .line 280
    .line 281
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 282
    .line 283
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    const v2, 0x7f1304e3

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :cond_2
    :goto_0
    new-instance v1, La/i1j0;

    .line 295
    .line 296
    invoke-direct {v1, v0}, La/i1j0;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 303
    .line 304
    new-instance v0, La/kui0;

    .line 305
    .line 306
    const/16 v1, 0x10

    .line 307
    .line 308
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 312
    .line 313
    .line 314
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 323
    .line 324
    new-instance v0, La/kui0;

    .line 325
    .line 326
    const/16 v1, 0x11

    .line 327
    .line 328
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 332
    .line 333
    .line 334
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    return-object p0

    .line 337
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    iget-object v0, p0, La/xxi0;->R:La/duj;

    .line 343
    .line 344
    new-instance v1, La/bxi0;

    .line 345
    .line 346
    invoke-direct {v1, p0, v2}, La/bxi0;-><init>(La/xxi0;B)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 350
    .line 351
    .line 352
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object p0

    .line 355
    :pswitch_c
    check-cast p1, La/k0w0;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object p0, p0, La/xxi0;->V:La/nh70;

    .line 361
    .line 362
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 366
    .line 367
    const-string v0, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 368
    .line 369
    const-string v1, "SETTINGS_QR_SCANNER_BUNDLE_KEY"

    .line 370
    .line 371
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 375
    .line 376
    .line 377
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object p0

    .line 380
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iget-object p0, p0, La/xxi0;->R:La/duj;

    .line 386
    .line 387
    new-instance v0, La/kui0;

    .line 388
    .line 389
    const/16 v1, 0x9

    .line 390
    .line 391
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 395
    .line 396
    .line 397
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_e
    check-cast p1, La/k0w0;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    new-instance v0, La/zwi0;

    .line 406
    .line 407
    invoke-direct {v0, p0, v3}, La/zwi0;-><init>(La/xxi0;B)V

    .line 408
    .line 409
    .line 410
    new-instance p0, La/a1w0;

    .line 411
    .line 412
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast p0, La/c8d;

    .line 422
    .line 423
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 424
    .line 425
    new-instance v0, La/bjk;

    .line 426
    .line 427
    invoke-direct {v0, v1, v2, v2, v3}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 428
    .line 429
    .line 430
    new-instance v1, La/v7d;

    .line 431
    .line 432
    invoke-direct {v1, v3, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 433
    .line 434
    .line 435
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 436
    .line 437
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object p0

    .line 440
    :pswitch_f
    check-cast p1, La/k0w0;

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    iget-object p0, p0, La/xxi0;->q:La/mi70;

    .line 446
    .line 447
    new-instance v0, La/i38;

    .line 448
    .line 449
    invoke-direct {v0, v2}, La/i38;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 456
    .line 457
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 461
    .line 462
    .line 463
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object p0

    .line 466
    :pswitch_10
    check-cast p1, La/k0w0;

    .line 467
    .line 468
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    iget-object p0, p0, La/xxi0;->X:La/y3j0;

    .line 472
    .line 473
    invoke-static {p0}, La/y3j0;->a(La/y3j0;)Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast p0, La/c8d;

    .line 484
    .line 485
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 486
    .line 487
    new-instance v0, La/bjk;

    .line 488
    .line 489
    invoke-direct {v0, v1, v2, v2, v3}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 490
    .line 491
    .line 492
    new-instance v1, La/v7d;

    .line 493
    .line 494
    invoke-direct {v1, v3, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 495
    .line 496
    .line 497
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 498
    .line 499
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object p0

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
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
