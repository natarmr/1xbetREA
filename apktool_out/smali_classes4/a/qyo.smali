.class public final synthetic La/qyo;
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
    iput-byte p2, p0, La/qyo;->a:B

    iput-object p1, p0, La/qyo;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/qyo;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    sget-object v3, La/w8q;->a:La/w8q;

    .line 6
    .line 7
    iget-object p0, p0, La/qyo;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    sget-object p1, La/d4q;->a:La/d4q;

    .line 40
    .line 41
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, La/ivp;

    .line 53
    .line 54
    invoke-direct {v0, p1}, La/ivp;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    new-instance p1, La/jvp;

    .line 70
    .line 71
    invoke-direct {p1, v0, v1}, La/jvp;-><init>(J)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_4
    check-cast p1, La/bem;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v0, La/evp;

    .line 86
    .line 87
    invoke-direct {v0, p1}, La/evp;-><init>(La/bem;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    new-instance v0, La/him;

    .line 103
    .line 104
    invoke-direct {v0, p1}, La/him;-><init>(Z)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v0, La/iim;

    .line 119
    .line 120
    invoke-direct {v0, p1}, La/iim;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    new-instance v0, La/fim;

    .line 136
    .line 137
    invoke-direct {v0, p1}, La/fim;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    new-instance v0, La/him;

    .line 153
    .line 154
    invoke-direct {v0, p1}, La/him;-><init>(Z)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v0, La/iim;

    .line 169
    .line 170
    invoke-direct {v0, p1}, La/iim;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    new-instance v0, La/fim;

    .line 186
    .line 187
    invoke-direct {v0, p1}, La/fim;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    new-instance v0, La/him;

    .line 203
    .line 204
    invoke-direct {v0, p1}, La/him;-><init>(Z)V

    .line 205
    .line 206
    .line 207
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v0, La/iim;

    .line 219
    .line 220
    invoke-direct {v0, p1}, La/iim;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    new-instance v0, La/fim;

    .line 236
    .line 237
    invoke-direct {v0, p1}, La/fim;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    new-instance v0, La/fim;

    .line 253
    .line 254
    invoke-direct {v0, p1}, La/fim;-><init>(I)V

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
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    new-instance v0, La/him;

    .line 270
    .line 271
    invoke-direct {v0, p1}, La/him;-><init>(Z)V

    .line 272
    .line 273
    .line 274
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    new-instance v0, La/iim;

    .line 286
    .line 287
    invoke-direct {v0, p1}, La/iim;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    new-instance v0, La/chp;

    .line 302
    .line 303
    invoke-direct {v0, p1}, La/chp;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_12
    check-cast p1, La/m9n;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    instance-of v0, p1, La/k9n;

    .line 318
    .line 319
    if-eqz v0, :cond_0

    .line 320
    .line 321
    new-instance p1, La/k2t;

    .line 322
    .line 323
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    goto :goto_0

    .line 330
    :cond_0
    instance-of v0, p1, La/l9n;

    .line 331
    .line 332
    if-eqz v0, :cond_3

    .line 333
    .line 334
    check-cast p1, La/l9n;

    .line 335
    .line 336
    iget-wide v0, p1, La/l9n;->a:J

    .line 337
    .line 338
    iget-object p1, p1, La/l9n;->c:La/j9n;

    .line 339
    .line 340
    instance-of v3, p1, La/g9n;

    .line 341
    .line 342
    if-eqz v3, :cond_1

    .line 343
    .line 344
    new-instance v3, La/zm60;

    .line 345
    .line 346
    check-cast p1, La/g9n;

    .line 347
    .line 348
    iget-boolean p1, p1, La/g9n;->b:Z

    .line 349
    .line 350
    xor-int/lit8 p1, p1, 0x1

    .line 351
    .line 352
    invoke-direct {v3, v2, v0, v1, p1}, La/zm60;-><init>(IJZ)V

    .line 353
    .line 354
    .line 355
    new-instance p1, La/j2t;

    .line 356
    .line 357
    invoke-direct {p1, v3}, La/j2t;-><init>(La/dn60;)V

    .line 358
    .line 359
    .line 360
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    goto :goto_0

    .line 364
    :cond_1
    instance-of p1, p1, La/i9n;

    .line 365
    .line 366
    if-eqz p1, :cond_2

    .line 367
    .line 368
    new-instance p1, La/e2t;

    .line 369
    .line 370
    invoke-direct {p1, v0, v1}, La/e2t;-><init>(J)V

    .line 371
    .line 372
    .line 373
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    goto :goto_1

    .line 379
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 380
    .line 381
    .line 382
    :goto_1
    return-object v1

    .line 383
    :pswitch_13
    check-cast p1, La/m9n;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    instance-of v0, p1, La/k9n;

    .line 389
    .line 390
    if-eqz v0, :cond_4

    .line 391
    .line 392
    new-instance p1, La/k2t;

    .line 393
    .line 394
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_4
    instance-of v0, p1, La/l9n;

    .line 402
    .line 403
    if-eqz v0, :cond_7

    .line 404
    .line 405
    check-cast p1, La/l9n;

    .line 406
    .line 407
    iget-wide v0, p1, La/l9n;->a:J

    .line 408
    .line 409
    iget-object p1, p1, La/l9n;->c:La/j9n;

    .line 410
    .line 411
    instance-of v3, p1, La/g9n;

    .line 412
    .line 413
    if-eqz v3, :cond_5

    .line 414
    .line 415
    new-instance v3, La/zm60;

    .line 416
    .line 417
    check-cast p1, La/g9n;

    .line 418
    .line 419
    iget-boolean p1, p1, La/g9n;->b:Z

    .line 420
    .line 421
    xor-int/lit8 p1, p1, 0x1

    .line 422
    .line 423
    invoke-direct {v3, v2, v0, v1, p1}, La/zm60;-><init>(IJZ)V

    .line 424
    .line 425
    .line 426
    new-instance p1, La/j2t;

    .line 427
    .line 428
    invoke-direct {p1, v3}, La/j2t;-><init>(La/dn60;)V

    .line 429
    .line 430
    .line 431
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    goto :goto_2

    .line 435
    :cond_5
    instance-of p1, p1, La/i9n;

    .line 436
    .line 437
    if-eqz p1, :cond_6

    .line 438
    .line 439
    new-instance p1, La/e2t;

    .line 440
    .line 441
    invoke-direct {p1, v0, v1}, La/e2t;-><init>(J)V

    .line 442
    .line 443
    .line 444
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    :cond_6
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    goto :goto_3

    .line 450
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 451
    .line 452
    .line 453
    :goto_3
    return-object v1

    .line 454
    :pswitch_14
    check-cast p1, La/bem;

    .line 455
    .line 456
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    new-instance v0, La/p3p;

    .line 460
    .line 461
    invoke-direct {v0, p1}, La/p3p;-><init>(La/bem;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 468
    .line 469
    return-object p0

    .line 470
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    new-instance v0, La/u3p;

    .line 476
    .line 477
    invoke-direct {v0, p1}, La/u3p;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object p0

    .line 486
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 487
    .line 488
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 489
    .line 490
    .line 491
    sget-object p1, La/w3p;->a:La/w3p;

    .line 492
    .line 493
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object p0

    .line 499
    :pswitch_17
    check-cast p1, La/st0;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    new-instance v0, La/ia0;

    .line 505
    .line 506
    invoke-direct {v0, p1}, La/ia0;-><init>(La/st0;)V

    .line 507
    .line 508
    .line 509
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_18
    check-cast p1, La/st0;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v0, La/la0;

    .line 521
    .line 522
    iget-wide v1, p1, La/st0;->a:J

    .line 523
    .line 524
    invoke-direct {v0, v1, v2}, La/la0;-><init>(J)V

    .line 525
    .line 526
    .line 527
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 531
    .line 532
    return-object p0

    .line 533
    :pswitch_19
    check-cast p1, La/ra0;

    .line 534
    .line 535
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    new-instance v0, La/ha0;

    .line 539
    .line 540
    invoke-direct {v0, p1}, La/ha0;-><init>(La/ra0;)V

    .line 541
    .line 542
    .line 543
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object p0

    .line 549
    :pswitch_1a
    check-cast p1, La/jtl;

    .line 550
    .line 551
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    sget-object p1, La/qxo;->a:La/qxo;

    .line 555
    .line 556
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object p0

    .line 562
    :pswitch_1b
    check-cast p1, La/x5q0;

    .line 563
    .line 564
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    instance-of v0, p1, La/w5q0;

    .line 568
    .line 569
    if-eqz v0, :cond_8

    .line 570
    .line 571
    new-instance v0, La/txo;

    .line 572
    .line 573
    check-cast p1, La/w5q0;

    .line 574
    .line 575
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 576
    .line 577
    invoke-direct {v0, p1}, La/txo;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object p0

    .line 586
    :pswitch_1c
    check-cast p1, La/x5q0;

    .line 587
    .line 588
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    instance-of v0, p1, La/w5q0;

    .line 592
    .line 593
    if-eqz v0, :cond_9

    .line 594
    .line 595
    new-instance v0, La/rxo;

    .line 596
    .line 597
    check-cast p1, La/w5q0;

    .line 598
    .line 599
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 600
    .line 601
    invoke-direct {v0, p1}, La/rxo;-><init>(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 608
    .line 609
    return-object p0

    .line 610
    nop

    .line 611
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
