.class public final synthetic La/wil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wil;->a:B

    iput-object p1, p0, La/wil;->b:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wil;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/wil;->b:La/pz40;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/a4x;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/t33;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_2
    check-cast p1, La/kz3;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, La/kz3;->a:La/pm80;

    .line 62
    .line 63
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_3
    check-cast p1, La/kz3;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, La/kz3;->a:La/pm80;

    .line 75
    .line 76
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_5
    check-cast p1, La/kz3;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p1, p1, La/kz3;->a:La/pm80;

    .line 99
    .line 100
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_7
    check-cast p1, La/qkx;

    .line 115
    .line 116
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_8
    check-cast p1, La/o0x;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    instance-of v0, p1, La/n0x;

    .line 128
    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    check-cast p1, La/n0x;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_1
    move-object p1, v1

    .line 135
    :goto_0
    if-eqz p1, :cond_2

    .line 136
    .line 137
    iget-object v1, p1, La/n0x;->a:Ljava/lang/String;

    .line 138
    .line 139
    :cond_2
    invoke-interface {p0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_9
    check-cast p1, La/o0x;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    instance-of v0, p1, La/n0x;

    .line 151
    .line 152
    if-eqz v0, :cond_3

    .line 153
    .line 154
    check-cast p1, La/n0x;

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    move-object p1, v1

    .line 158
    :goto_1
    if-eqz p1, :cond_4

    .line 159
    .line 160
    iget-object v1, p1, La/n0x;->a:Ljava/lang/String;

    .line 161
    .line 162
    :cond_4
    invoke-interface {p0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_a
    check-cast p1, La/a9q0;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, La/a9q0;->f()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_b
    check-cast p1, La/abi0;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    sget-object v0, La/cbi0;->m:La/zai0;

    .line 193
    .line 194
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p0, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_c
    check-cast p1, La/a9q0;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, La/a9q0;->f()Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_d
    check-cast p1, La/abi0;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    sget-object v0, La/cbi0;->m:La/zai0;

    .line 234
    .line 235
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    check-cast p0, Ljava/lang/Boolean;

    .line 240
    .line 241
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_e
    check-cast p1, La/iz3;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 256
    .line 257
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_f
    check-cast p1, La/kz3;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 277
    .line 278
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_11
    check-cast p1, Ljava/lang/Float;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 290
    .line 291
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_12
    check-cast p1, La/a9q0;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, La/a9q0;->f()Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object p0

    .line 316
    :pswitch_13
    check-cast p1, La/abi0;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    sget-object v0, La/cbi0;->m:La/zai0;

    .line 322
    .line 323
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    check-cast p0, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_14
    check-cast p1, La/abi0;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    check-cast p0, La/daq0;

    .line 348
    .line 349
    iget-wide v0, p0, La/daq0;->a:J

    .line 350
    .line 351
    sget-object v0, La/cbi0;->o:La/zai0;

    .line 352
    .line 353
    sget-object v1, La/cbi0;->a:[La/iiy;

    .line 354
    .line 355
    const/16 v2, 0xc

    .line 356
    .line 357
    aget-object v1, v1, v2

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_15
    check-cast p1, La/iz3;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 374
    .line 375
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object p0

    .line 381
    :pswitch_16
    check-cast p1, La/kz3;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 387
    .line 388
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_17
    check-cast p1, La/lz3;

    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object p0

    .line 405
    :pswitch_18
    check-cast p1, La/a9q0;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-wide v0, p1, La/a9q0;->c:J

    .line 411
    .line 412
    const/16 p1, 0x20

    .line 413
    .line 414
    shr-long/2addr v0, p1

    .line 415
    long-to-int p1, v0

    .line 416
    int-to-float p1, p1

    .line 417
    new-instance v0, La/ycl;

    .line 418
    .line 419
    invoke-direct {v0, p1}, La/ycl;-><init>(F)V

    .line 420
    .line 421
    .line 422
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object p0

    .line 428
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 429
    .line 430
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 431
    .line 432
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    return-object p0

    .line 438
    :pswitch_1a
    check-cast p1, La/abi0;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    check-cast p0, Ljava/lang/Boolean;

    .line 448
    .line 449
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 450
    .line 451
    .line 452
    move-result p0

    .line 453
    invoke-static {p1, p0}, La/cbi0;->d(La/abi0;Z)V

    .line 454
    .line 455
    .line 456
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    return-object p0

    .line 459
    :pswitch_1b
    check-cast p1, La/a9q0;

    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual {p1}, La/a9q0;->f()Z

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    return-object p0

    .line 478
    :pswitch_1c
    check-cast p1, La/abi0;

    .line 479
    .line 480
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    sget-object v0, La/cbi0;->m:La/zai0;

    .line 484
    .line 485
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    check-cast p0, Ljava/lang/Boolean;

    .line 490
    .line 491
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 498
    .line 499
    return-object p0

    .line 500
    nop

    .line 501
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
