.class public final synthetic La/c87;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f97;


# direct methods
.method public synthetic constructor <init>(La/f97;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/c87;->a:B

    iput-object p1, p0, La/c87;->b:La/f97;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/f97;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x6

    iput-byte p2, p0, La/c87;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c87;->b:La/f97;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/c87;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/c87;->b:La/f97;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 16
    .line 17
    new-instance v2, La/h87;

    .line 18
    .line 19
    invoke-direct {v2, p1, p0, v1}, La/h87;-><init>(Ljava/lang/Throwable;La/f97;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 34
    .line 35
    new-instance v0, La/os6;

    .line 36
    .line 37
    const/16 v1, 0x1b

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/f97;->H0:La/evz;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object p0, La/fd10;->c:La/fd10;

    .line 59
    .line 60
    new-instance v0, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;

    .line 61
    .line 62
    invoke-direct {v0, p0}, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;-><init>(La/fd10;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, La/c8d;

    .line 72
    .line 73
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 74
    .line 75
    new-instance v0, La/v7d;

    .line 76
    .line 77
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 91
    .line 92
    new-instance v1, La/g87;

    .line 93
    .line 94
    const/4 v2, 0x5

    .line 95
    invoke-direct {v1, p0, v2}, La/g87;-><init>(La/f97;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 110
    .line 111
    new-instance v0, La/os6;

    .line 112
    .line 113
    const/16 v1, 0x1d

    .line 114
    .line 115
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 130
    .line 131
    new-instance v0, La/os6;

    .line 132
    .line 133
    const/16 v1, 0x12

    .line 134
    .line 135
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 150
    .line 151
    new-instance v0, La/os6;

    .line 152
    .line 153
    const/16 v1, 0xb

    .line 154
    .line 155
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v0, La/os6;

    .line 170
    .line 171
    const/16 v2, 0x13

    .line 172
    .line 173
    invoke-direct {v0, v2}, La/os6;-><init>(B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 180
    .line 181
    new-instance v2, La/g87;

    .line 182
    .line 183
    invoke-direct {v2, p0, v1}, La/g87;-><init>(La/f97;B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    instance-of v0, p1, La/zhi0;

    .line 198
    .line 199
    if-eqz v0, :cond_0

    .line 200
    .line 201
    move-object v0, p1

    .line 202
    check-cast v0, La/zhi0;

    .line 203
    .line 204
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 205
    .line 206
    sget-object v1, La/i2o;->k1:La/i2o;

    .line 207
    .line 208
    if-ne v0, v1, :cond_0

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-eqz p1, :cond_0

    .line 215
    .line 216
    new-instance v0, La/g77;

    .line 217
    .line 218
    invoke-direct {v0, p1}, La/g77;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 233
    .line 234
    new-instance v1, La/g87;

    .line 235
    .line 236
    const/4 v2, 0x4

    .line 237
    invoke-direct {v1, p0, v2}, La/g87;-><init>(La/f97;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 252
    .line 253
    new-instance v0, La/os6;

    .line 254
    .line 255
    const/16 v1, 0x1c

    .line 256
    .line 257
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 272
    .line 273
    new-instance v1, La/g87;

    .line 274
    .line 275
    const/4 v2, 0x2

    .line 276
    invoke-direct {v1, p0, v2}, La/g87;-><init>(La/f97;B)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 280
    .line 281
    .line 282
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 291
    .line 292
    new-instance v0, La/os6;

    .line 293
    .line 294
    const/16 v1, 0x15

    .line 295
    .line 296
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    instance-of v0, p1, La/zhi0;

    .line 311
    .line 312
    if-eqz v0, :cond_1

    .line 313
    .line 314
    iget-object v0, p0, La/f97;->A0:La/nj7;

    .line 315
    .line 316
    move-object v1, p1

    .line 317
    check-cast v1, La/zhi0;

    .line 318
    .line 319
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 320
    .line 321
    invoke-interface {v1}, La/kuw;->getErrorCode()I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    invoke-virtual {v0, v1}, La/nj7;->b(I)V

    .line 326
    .line 327
    .line 328
    :cond_1
    new-instance v0, La/os6;

    .line 329
    .line 330
    const/16 v1, 0x18

    .line 331
    .line 332
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 336
    .line 337
    .line 338
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 339
    .line 340
    new-instance v1, La/h87;

    .line 341
    .line 342
    invoke-direct {v1, p1, p0, v2}, La/h87;-><init>(Ljava/lang/Throwable;La/f97;B)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 346
    .line 347
    .line 348
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 357
    .line 358
    new-instance v1, La/g87;

    .line 359
    .line 360
    invoke-direct {v1, p0, v2}, La/g87;-><init>(La/f97;B)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 364
    .line 365
    .line 366
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object p0

    .line 369
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 375
    .line 376
    new-instance v0, La/os6;

    .line 377
    .line 378
    const/16 v1, 0x19

    .line 379
    .line 380
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 384
    .line 385
    .line 386
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object p0

    .line 389
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 395
    .line 396
    new-instance v1, La/g87;

    .line 397
    .line 398
    const/4 v2, 0x3

    .line 399
    invoke-direct {v1, p0, v2}, La/g87;-><init>(La/f97;B)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 403
    .line 404
    .line 405
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object p0

    .line 408
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-object v0, p0, La/f97;->F:La/duj;

    .line 414
    .line 415
    new-instance v1, La/g87;

    .line 416
    .line 417
    invoke-direct {v1, p0, v2}, La/g87;-><init>(La/f97;B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 421
    .line 422
    .line 423
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object p0

    .line 426
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 432
    .line 433
    new-instance v0, La/os6;

    .line 434
    .line 435
    const/16 v1, 0x16

    .line 436
    .line 437
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object p0

    .line 446
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    iget-object p0, p0, La/f97;->F:La/duj;

    .line 452
    .line 453
    new-instance v0, La/os6;

    .line 454
    .line 455
    const/16 v1, 0x14

    .line 456
    .line 457
    invoke-direct {v0, v1}, La/os6;-><init>(B)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 461
    .line 462
    .line 463
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object p0

    .line 466
    nop

    .line 467
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
