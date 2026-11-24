.class public final synthetic La/vcj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/odj0;


# direct methods
.method public synthetic constructor <init>(La/odj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vcj0;->a:B

    iput-object p1, p0, La/vcj0;->b:La/odj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/vcj0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/vcj0;->b:La/odj0;

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
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 17
    .line 18
    new-instance v0, La/r3j0;

    .line 19
    .line 20
    const/4 v1, 0x7

    .line 21
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

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
    iget-object p0, p0, La/odj0;->U:La/nh70;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 41
    .line 42
    const-string v0, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 43
    .line 44
    const-string v1, "SETTINGS_QR_SCANNER_BUNDLE_KEY"

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, La/odj0;->q:La/mi70;

    .line 61
    .line 62
    new-instance v0, La/i38;

    .line 63
    .line 64
    invoke-direct {v0, v2}, La/i38;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 71
    .line 72
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 87
    .line 88
    new-instance v0, La/r3j0;

    .line 89
    .line 90
    const/4 v1, 0x5

    .line 91
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 106
    .line 107
    new-instance v0, La/r3j0;

    .line 108
    .line 109
    const/16 v1, 0x19

    .line 110
    .line 111
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_4
    check-cast p1, La/igc;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object p1, La/hcj0;->a:La/hcj0;

    .line 126
    .line 127
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 139
    .line 140
    new-instance v0, La/r3j0;

    .line 141
    .line 142
    const/16 v1, 0x13

    .line 143
    .line 144
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 159
    .line 160
    new-instance v0, La/r3j0;

    .line 161
    .line 162
    const/16 v1, 0x1a

    .line 163
    .line 164
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    instance-of v0, p1, La/zed0;

    .line 179
    .line 180
    if-eqz v0, :cond_0

    .line 181
    .line 182
    iget-object p1, p0, La/odj0;->m0:La/ubu;

    .line 183
    .line 184
    invoke-virtual {p1}, La/ubu;->a()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    xor-int/lit8 p1, p1, 0x1

    .line 189
    .line 190
    invoke-virtual {p0, p1}, La/odj0;->T(Z)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_0
    invoke-virtual {p0, v2}, La/odj0;->T(Z)V

    .line 195
    .line 196
    .line 197
    instance-of v0, p1, La/zhi0;

    .line 198
    .line 199
    if-eqz v0, :cond_1

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-nez v0, :cond_2

    .line 206
    .line 207
    const-string v0, ""

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_1
    iget-object v0, p0, La/odj0;->E:La/ctf0;

    .line 211
    .line 212
    new-array v1, v2, [Ljava/lang/Object;

    .line 213
    .line 214
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 215
    .line 216
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    const v2, 0x7f1304e3

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :cond_2
    :goto_0
    new-instance v1, La/mcj0;

    .line 228
    .line 229
    invoke-direct {v1, v0}, La/mcj0;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 236
    .line 237
    new-instance v0, La/r3j0;

    .line 238
    .line 239
    const/16 v1, 0x14

    .line 240
    .line 241
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 256
    .line 257
    new-instance v0, La/r3j0;

    .line 258
    .line 259
    const/16 v1, 0x12

    .line 260
    .line 261
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

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
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 276
    .line 277
    new-instance v0, La/r3j0;

    .line 278
    .line 279
    const/4 v1, 0x6

    .line 280
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 284
    .line 285
    .line 286
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object p0

    .line 289
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 295
    .line 296
    new-instance v0, La/r3j0;

    .line 297
    .line 298
    const/16 v1, 0x10

    .line 299
    .line 300
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 304
    .line 305
    .line 306
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 315
    .line 316
    new-instance v0, La/r3j0;

    .line 317
    .line 318
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

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
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, La/odj0;->Q:La/duj;

    .line 333
    .line 334
    new-instance v2, La/uph0;

    .line 335
    .line 336
    invoke-direct {v2, p0, v1}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 340
    .line 341
    .line 342
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 346
    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 351
    .line 352
    new-instance v0, La/r3j0;

    .line 353
    .line 354
    const/16 v1, 0xd

    .line 355
    .line 356
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 360
    .line 361
    .line 362
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object p0

    .line 365
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 371
    .line 372
    new-instance v0, La/r3j0;

    .line 373
    .line 374
    const/16 v1, 0x9

    .line 375
    .line 376
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 391
    .line 392
    new-instance v0, La/r3j0;

    .line 393
    .line 394
    const/16 v1, 0xc

    .line 395
    .line 396
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 400
    .line 401
    .line 402
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object p0

    .line 405
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-object p0, p0, La/odj0;->Q:La/duj;

    .line 411
    .line 412
    new-instance v0, La/r3j0;

    .line 413
    .line 414
    const/16 v1, 0x8

    .line 415
    .line 416
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 420
    .line 421
    .line 422
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object p0

    .line 425
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
