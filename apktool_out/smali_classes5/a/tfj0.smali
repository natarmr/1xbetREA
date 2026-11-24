.class public final synthetic La/tfj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngj0;


# direct methods
.method public synthetic constructor <init>(La/ngj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tfj0;->a:B

    iput-object p1, p0, La/tfj0;->b:La/ngj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/tfj0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/tfj0;->b:La/ngj0;

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
    iget-object v0, p0, La/ngj0;->S:La/duj;

    .line 17
    .line 18
    new-instance v1, La/vfj0;

    .line 19
    .line 20
    invoke-direct {v1, p0, v3}, La/vfj0;-><init>(La/ngj0;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 35
    .line 36
    new-instance v0, La/mej0;

    .line 37
    .line 38
    const/16 v1, 0xc

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
    iget-object p0, p0, La/ngj0;->F:La/uuz;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance p0, Lorg/xplatform/mailing/impl/navigation/MailingScreenFactoryImpl$getMailingManagementFragment$1;

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
    invoke-direct {v0, v1, v3, v3, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

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
    check-cast p1, Ljava/lang/Throwable;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 95
    .line 96
    new-instance v0, La/mej0;

    .line 97
    .line 98
    const/16 v1, 0xd

    .line 99
    .line 100
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 115
    .line 116
    new-instance v0, La/mej0;

    .line 117
    .line 118
    const/16 v1, 0x1c

    .line 119
    .line 120
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 135
    .line 136
    new-instance v0, La/mej0;

    .line 137
    .line 138
    const/16 v1, 0xf

    .line 139
    .line 140
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_5
    check-cast p1, La/igc;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    sget-object p1, La/d1j0;->a:La/d1j0;

    .line 155
    .line 156
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_6
    check-cast p1, La/k0w0;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v1}, La/k0w0;->c(La/m7h0;)V

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, La/ngj0;->q:La/mi70;

    .line 171
    .line 172
    new-instance v0, La/i38;

    .line 173
    .line 174
    invoke-direct {v0, v3}, La/i38;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 181
    .line 182
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    instance-of v0, p1, La/zed0;

    .line 197
    .line 198
    if-eqz v0, :cond_0

    .line 199
    .line 200
    iget-object p1, p0, La/ngj0;->q0:La/ubu;

    .line 201
    .line 202
    invoke-virtual {p1}, La/ubu;->a()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    xor-int/2addr p1, v2

    .line 207
    invoke-virtual {p0, p1}, La/ngj0;->U(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_0
    invoke-virtual {p0, v3}, La/ngj0;->U(Z)V

    .line 212
    .line 213
    .line 214
    instance-of v0, p1, La/zhi0;

    .line 215
    .line 216
    if-eqz v0, :cond_1

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-nez v0, :cond_2

    .line 223
    .line 224
    const-string v0, ""

    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_1
    iget-object v0, p0, La/ngj0;->G:La/ctf0;

    .line 228
    .line 229
    new-array v1, v3, [Ljava/lang/Object;

    .line 230
    .line 231
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 232
    .line 233
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const v2, 0x7f1304e3

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :cond_2
    :goto_0
    new-instance v1, La/i1j0;

    .line 245
    .line 246
    invoke-direct {v1, v0}, La/i1j0;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 253
    .line 254
    new-instance v0, La/mej0;

    .line 255
    .line 256
    const/16 v1, 0x18

    .line 257
    .line 258
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 262
    .line 263
    .line 264
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 273
    .line 274
    new-instance v0, La/mej0;

    .line 275
    .line 276
    const/16 v1, 0x12

    .line 277
    .line 278
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 293
    .line 294
    new-instance v0, La/mej0;

    .line 295
    .line 296
    const/16 v1, 0x16

    .line 297
    .line 298
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 308
    .line 309
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 313
    .line 314
    new-instance v0, La/mej0;

    .line 315
    .line 316
    const/16 v1, 0x15

    .line 317
    .line 318
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object p0

    .line 327
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object p0, p0, La/ngj0;->S:La/duj;

    .line 333
    .line 334
    new-instance v0, La/mej0;

    .line 335
    .line 336
    const/16 v1, 0x11

    .line 337
    .line 338
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 342
    .line 343
    .line 344
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_c
    check-cast p1, La/k0w0;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object p0, p0, La/ngj0;->Y:La/y3j0;

    .line 353
    .line 354
    invoke-static {p0}, La/y3j0;->a(La/y3j0;)Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast p0, La/c8d;

    .line 365
    .line 366
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 367
    .line 368
    new-instance v0, La/bjk;

    .line 369
    .line 370
    invoke-direct {v0, v1, v3, v3, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 371
    .line 372
    .line 373
    new-instance v1, La/v7d;

    .line 374
    .line 375
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 376
    .line 377
    .line 378
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 379
    .line 380
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v0, p0, La/ngj0;->S:La/duj;

    .line 389
    .line 390
    new-instance v1, La/vfj0;

    .line 391
    .line 392
    invoke-direct {v1, p0, v2}, La/vfj0;-><init>(La/ngj0;B)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 396
    .line 397
    .line 398
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    return-object p0

    .line 401
    :pswitch_e
    check-cast p1, La/k0w0;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    new-instance v0, La/ufj0;

    .line 407
    .line 408
    invoke-direct {v0, p0, v2}, La/ufj0;-><init>(La/ngj0;B)V

    .line 409
    .line 410
    .line 411
    new-instance p0, La/a1w0;

    .line 412
    .line 413
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast p0, La/c8d;

    .line 423
    .line 424
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 425
    .line 426
    new-instance v0, La/bjk;

    .line 427
    .line 428
    invoke-direct {v0, v1, v3, v3, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 429
    .line 430
    .line 431
    new-instance v1, La/v7d;

    .line 432
    .line 433
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 434
    .line 435
    .line 436
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 437
    .line 438
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object p0

    .line 441
    :pswitch_f
    check-cast p1, La/k0w0;

    .line 442
    .line 443
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    iget-object p0, p0, La/ngj0;->L0:La/hfk0;

    .line 447
    .line 448
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    new-instance p0, Lorg/xplatform/auth_history/impl/navigation/AuthHistoryScreenFactoryImpl$getScreen$1;

    .line 452
    .line 453
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast p0, La/c8d;

    .line 463
    .line 464
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 465
    .line 466
    new-instance v0, La/bjk;

    .line 467
    .line 468
    invoke-direct {v0, v1, v3, v3, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 469
    .line 470
    .line 471
    new-instance v1, La/v7d;

    .line 472
    .line 473
    invoke-direct {v1, v2, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 474
    .line 475
    .line 476
    iput-object v1, p0, La/c8d;->a:La/w7d;

    .line 477
    .line 478
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object p0

    .line 481
    :pswitch_10
    check-cast p1, La/k0w0;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget-object p0, p0, La/ngj0;->W:La/nh70;

    .line 487
    .line 488
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 492
    .line 493
    const-string v0, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 494
    .line 495
    const-string v1, "SETTINGS_QR_SCANNER_BUNDLE_KEY"

    .line 496
    .line 497
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 501
    .line 502
    .line 503
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    return-object p0

    .line 506
    nop

    .line 507
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
