.class public final synthetic La/hka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/hka;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/hka;->c:Ljava/lang/Object;

    iput-boolean p3, p0, La/hka;->b:Z

    iput p1, p0, La/hka;->d:I

    return-void
.end method

.method public synthetic constructor <init>(La/v7c;IZ)V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput-byte v0, p0, La/hka;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hka;->c:Ljava/lang/Object;

    iput p2, p0, La/hka;->d:I

    iput-boolean p3, p0, La/hka;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/ArrayList;IB)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/hka;->a:B

    iput-boolean p1, p0, La/hka;->b:Z

    iput-object p2, p0, La/hka;->c:Ljava/lang/Object;

    iput p3, p0, La/hka;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hka;->a:B

    .line 2
    .line 3
    const-string v1, "INFO"

    .line 4
    .line 5
    const-string v2, "SCORE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-boolean v6, p0, La/hka;->b:Z

    .line 11
    .line 12
    iget v7, p0, La/hka;->d:I

    .line 13
    .line 14
    iget-object p0, p0, La/hka;->c:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, La/v7c;

    .line 20
    .line 21
    check-cast p1, La/k0w0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/v7c;->A:La/qgd;

    .line 27
    .line 28
    iget-object p0, p0, La/v7c;->d:La/d6c;

    .line 29
    .line 30
    invoke-interface {p0}, La/d6c;->getPhoneNumber()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    new-instance v0, La/q5c;

    .line 43
    .line 44
    invoke-direct {v0, p0, v7}, La/q5c;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v0, La/p5c;

    .line 49
    .line 50
    invoke-direct {v0, p0, v7, v5}, La/p5c;-><init>(Ljava/lang/String;IZ)V

    .line 51
    .line 52
    .line 53
    :goto_0
    new-instance p0, Lorg/xplatform/security/impl/navigation/PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;-><init>(La/d6c;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    check-cast p0, Ljava/util/ArrayList;

    .line 65
    .line 66
    check-cast p1, La/ou90;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move v1, v5

    .line 76
    move v2, v1

    .line 77
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    add-int/lit8 v9, v1, 0x1

    .line 88
    .line 89
    if-ltz v1, :cond_3

    .line 90
    .line 91
    check-cast v8, La/pu90;

    .line 92
    .line 93
    if-eqz v6, :cond_1

    .line 94
    .line 95
    invoke-virtual {p1, v8, v2, v5, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    invoke-virtual {p1, v8, v2, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 100
    .line 101
    .line 102
    :goto_2
    iget v8, v8, La/pu90;->a:I

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    add-int/lit8 v10, v10, -0x1

    .line 109
    .line 110
    if-eq v1, v10, :cond_2

    .line 111
    .line 112
    move v1, v7

    .line 113
    goto :goto_3

    .line 114
    :cond_2
    move v1, v5

    .line 115
    :goto_3
    add-int/2addr v8, v1

    .line 116
    add-int/2addr v2, v8

    .line 117
    move v1, v9

    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 120
    .line 121
    .line 122
    throw v3

    .line 123
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_1
    check-cast p0, Ljava/util/ArrayList;

    .line 127
    .line 128
    check-cast p1, La/ou90;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const-string v0, "SPORT_GAME_BOARD_SCORE"

    .line 134
    .line 135
    const-string v1, "SPORT_GAME_BOARD_INFO"

    .line 136
    .line 137
    if-eqz v6, :cond_a

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    add-int/lit8 v2, v2, -0x1

    .line 144
    .line 145
    if-ltz v2, :cond_10

    .line 146
    .line 147
    :goto_4
    add-int/lit8 v6, v2, -0x1

    .line 148
    .line 149
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, La/pu90;

    .line 154
    .line 155
    invoke-virtual {v2}, La/pu90;->n()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    instance-of v9, v8, La/p6z;

    .line 160
    .line 161
    if-eqz v9, :cond_5

    .line 162
    .line 163
    check-cast v8, La/p6z;

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_5
    move-object v8, v3

    .line 167
    :goto_5
    if-eqz v8, :cond_6

    .line 168
    .line 169
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    goto :goto_6

    .line 174
    :cond_6
    move-object v8, v3

    .line 175
    :goto_6
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-eqz v9, :cond_7

    .line 180
    .line 181
    iget v8, v2, La/pu90;->a:I

    .line 182
    .line 183
    sub-int v8, v7, v8

    .line 184
    .line 185
    invoke-virtual {p1, v2, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_7
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    if-eqz v8, :cond_8

    .line 194
    .line 195
    invoke-virtual {p1, v2, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 196
    .line 197
    .line 198
    :cond_8
    :goto_7
    if-gez v6, :cond_9

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_9
    move v2, v6

    .line 202
    goto :goto_4

    .line 203
    :cond_a
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    add-int/lit8 v2, v2, -0x1

    .line 208
    .line 209
    if-ltz v2, :cond_10

    .line 210
    .line 211
    :goto_8
    add-int/lit8 v6, v2, -0x1

    .line 212
    .line 213
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, La/pu90;

    .line 218
    .line 219
    invoke-virtual {v2}, La/pu90;->n()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    instance-of v9, v8, La/p6z;

    .line 224
    .line 225
    if-eqz v9, :cond_b

    .line 226
    .line 227
    check-cast v8, La/p6z;

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_b
    move-object v8, v3

    .line 231
    :goto_9
    if-eqz v8, :cond_c

    .line 232
    .line 233
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    goto :goto_a

    .line 238
    :cond_c
    move-object v8, v3

    .line 239
    :goto_a
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_d

    .line 244
    .line 245
    invoke-virtual {p1, v2, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 246
    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_d
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-eqz v8, :cond_e

    .line 254
    .line 255
    iget v8, v2, La/pu90;->a:I

    .line 256
    .line 257
    sub-int v8, v7, v8

    .line 258
    .line 259
    invoke-virtual {p1, v2, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 260
    .line 261
    .line 262
    :cond_e
    :goto_b
    if-gez v6, :cond_f

    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_f
    move v2, v6

    .line 266
    goto :goto_8

    .line 267
    :cond_10
    :goto_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_2
    check-cast p0, Ljava/util/ArrayList;

    .line 271
    .line 272
    check-cast p1, La/ou90;

    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    if-eqz v6, :cond_16

    .line 278
    .line 279
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    add-int/lit8 v0, v0, -0x1

    .line 284
    .line 285
    if-ltz v0, :cond_1c

    .line 286
    .line 287
    :goto_d
    add-int/lit8 v6, v0, -0x1

    .line 288
    .line 289
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, La/pu90;

    .line 294
    .line 295
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    instance-of v9, v8, La/p6z;

    .line 300
    .line 301
    if-eqz v9, :cond_11

    .line 302
    .line 303
    check-cast v8, La/p6z;

    .line 304
    .line 305
    goto :goto_e

    .line 306
    :cond_11
    move-object v8, v3

    .line 307
    :goto_e
    if-eqz v8, :cond_12

    .line 308
    .line 309
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    goto :goto_f

    .line 314
    :cond_12
    move-object v8, v3

    .line 315
    :goto_f
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v9

    .line 319
    if-eqz v9, :cond_13

    .line 320
    .line 321
    iget v8, v0, La/pu90;->a:I

    .line 322
    .line 323
    sub-int v8, v7, v8

    .line 324
    .line 325
    invoke-virtual {p1, v0, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 326
    .line 327
    .line 328
    goto :goto_10

    .line 329
    :cond_13
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-eqz v8, :cond_14

    .line 334
    .line 335
    invoke-virtual {p1, v0, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 336
    .line 337
    .line 338
    :cond_14
    :goto_10
    if-gez v6, :cond_15

    .line 339
    .line 340
    goto :goto_15

    .line 341
    :cond_15
    move v0, v6

    .line 342
    goto :goto_d

    .line 343
    :cond_16
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    add-int/lit8 v0, v0, -0x1

    .line 348
    .line 349
    if-ltz v0, :cond_1c

    .line 350
    .line 351
    :goto_11
    add-int/lit8 v6, v0, -0x1

    .line 352
    .line 353
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, La/pu90;

    .line 358
    .line 359
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    instance-of v9, v8, La/p6z;

    .line 364
    .line 365
    if-eqz v9, :cond_17

    .line 366
    .line 367
    check-cast v8, La/p6z;

    .line 368
    .line 369
    goto :goto_12

    .line 370
    :cond_17
    move-object v8, v3

    .line 371
    :goto_12
    if-eqz v8, :cond_18

    .line 372
    .line 373
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    goto :goto_13

    .line 378
    :cond_18
    move-object v8, v3

    .line 379
    :goto_13
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    if-eqz v9, :cond_19

    .line 384
    .line 385
    invoke-virtual {p1, v0, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 386
    .line 387
    .line 388
    goto :goto_14

    .line 389
    :cond_19
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    if-eqz v8, :cond_1a

    .line 394
    .line 395
    iget v8, v0, La/pu90;->a:I

    .line 396
    .line 397
    sub-int v8, v7, v8

    .line 398
    .line 399
    invoke-virtual {p1, v0, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 400
    .line 401
    .line 402
    :cond_1a
    :goto_14
    if-gez v6, :cond_1b

    .line 403
    .line 404
    goto :goto_15

    .line 405
    :cond_1b
    move v0, v6

    .line 406
    goto :goto_11

    .line 407
    :cond_1c
    :goto_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    return-object p0

    .line 410
    :pswitch_3
    check-cast p0, Ljava/util/ArrayList;

    .line 411
    .line 412
    check-cast p1, La/ou90;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    if-eqz v6, :cond_22

    .line 418
    .line 419
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    add-int/lit8 v0, v0, -0x1

    .line 424
    .line 425
    if-ltz v0, :cond_28

    .line 426
    .line 427
    :goto_16
    add-int/lit8 v6, v0, -0x1

    .line 428
    .line 429
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    check-cast v0, La/pu90;

    .line 434
    .line 435
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    instance-of v9, v8, La/p6z;

    .line 440
    .line 441
    if-eqz v9, :cond_1d

    .line 442
    .line 443
    check-cast v8, La/p6z;

    .line 444
    .line 445
    goto :goto_17

    .line 446
    :cond_1d
    move-object v8, v3

    .line 447
    :goto_17
    if-eqz v8, :cond_1e

    .line 448
    .line 449
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    goto :goto_18

    .line 454
    :cond_1e
    move-object v8, v3

    .line 455
    :goto_18
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    if-eqz v9, :cond_1f

    .line 460
    .line 461
    iget v8, v0, La/pu90;->a:I

    .line 462
    .line 463
    sub-int v8, v7, v8

    .line 464
    .line 465
    invoke-virtual {p1, v0, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 466
    .line 467
    .line 468
    goto :goto_19

    .line 469
    :cond_1f
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    if-eqz v8, :cond_20

    .line 474
    .line 475
    invoke-virtual {p1, v0, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 476
    .line 477
    .line 478
    :cond_20
    :goto_19
    if-gez v6, :cond_21

    .line 479
    .line 480
    goto :goto_1e

    .line 481
    :cond_21
    move v0, v6

    .line 482
    goto :goto_16

    .line 483
    :cond_22
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    add-int/lit8 v0, v0, -0x1

    .line 488
    .line 489
    if-ltz v0, :cond_28

    .line 490
    .line 491
    :goto_1a
    add-int/lit8 v6, v0, -0x1

    .line 492
    .line 493
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    check-cast v0, La/pu90;

    .line 498
    .line 499
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    instance-of v9, v8, La/p6z;

    .line 504
    .line 505
    if-eqz v9, :cond_23

    .line 506
    .line 507
    check-cast v8, La/p6z;

    .line 508
    .line 509
    goto :goto_1b

    .line 510
    :cond_23
    move-object v8, v3

    .line 511
    :goto_1b
    if-eqz v8, :cond_24

    .line 512
    .line 513
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    goto :goto_1c

    .line 518
    :cond_24
    move-object v8, v3

    .line 519
    :goto_1c
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    if-eqz v9, :cond_25

    .line 524
    .line 525
    invoke-virtual {p1, v0, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 526
    .line 527
    .line 528
    goto :goto_1d

    .line 529
    :cond_25
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    if-eqz v8, :cond_26

    .line 534
    .line 535
    iget v8, v0, La/pu90;->a:I

    .line 536
    .line 537
    sub-int v8, v7, v8

    .line 538
    .line 539
    invoke-virtual {p1, v0, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 540
    .line 541
    .line 542
    :cond_26
    :goto_1d
    if-gez v6, :cond_27

    .line 543
    .line 544
    goto :goto_1e

    .line 545
    :cond_27
    move v0, v6

    .line 546
    goto :goto_1a

    .line 547
    :cond_28
    :goto_1e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object p0

    .line 550
    :pswitch_4
    check-cast p0, Ljava/util/ArrayList;

    .line 551
    .line 552
    check-cast p1, La/ou90;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    if-eqz v6, :cond_2e

    .line 558
    .line 559
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    add-int/lit8 v0, v0, -0x1

    .line 564
    .line 565
    if-ltz v0, :cond_34

    .line 566
    .line 567
    :goto_1f
    add-int/lit8 v6, v0, -0x1

    .line 568
    .line 569
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    check-cast v0, La/pu90;

    .line 574
    .line 575
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    instance-of v9, v8, La/p6z;

    .line 580
    .line 581
    if-eqz v9, :cond_29

    .line 582
    .line 583
    check-cast v8, La/p6z;

    .line 584
    .line 585
    goto :goto_20

    .line 586
    :cond_29
    move-object v8, v3

    .line 587
    :goto_20
    if-eqz v8, :cond_2a

    .line 588
    .line 589
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    goto :goto_21

    .line 594
    :cond_2a
    move-object v8, v3

    .line 595
    :goto_21
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    if-eqz v9, :cond_2b

    .line 600
    .line 601
    iget v8, v0, La/pu90;->a:I

    .line 602
    .line 603
    sub-int v8, v7, v8

    .line 604
    .line 605
    invoke-virtual {p1, v0, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 606
    .line 607
    .line 608
    goto :goto_22

    .line 609
    :cond_2b
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v8

    .line 613
    if-eqz v8, :cond_2c

    .line 614
    .line 615
    invoke-virtual {p1, v0, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 616
    .line 617
    .line 618
    :cond_2c
    :goto_22
    if-gez v6, :cond_2d

    .line 619
    .line 620
    goto :goto_27

    .line 621
    :cond_2d
    move v0, v6

    .line 622
    goto :goto_1f

    .line 623
    :cond_2e
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    add-int/lit8 v0, v0, -0x1

    .line 628
    .line 629
    if-ltz v0, :cond_34

    .line 630
    .line 631
    :goto_23
    add-int/lit8 v6, v0, -0x1

    .line 632
    .line 633
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    check-cast v0, La/pu90;

    .line 638
    .line 639
    invoke-virtual {v0}, La/pu90;->n()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    instance-of v9, v8, La/p6z;

    .line 644
    .line 645
    if-eqz v9, :cond_2f

    .line 646
    .line 647
    check-cast v8, La/p6z;

    .line 648
    .line 649
    goto :goto_24

    .line 650
    :cond_2f
    move-object v8, v3

    .line 651
    :goto_24
    if-eqz v8, :cond_30

    .line 652
    .line 653
    invoke-interface {v8}, La/p6z;->g0()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v8

    .line 657
    goto :goto_25

    .line 658
    :cond_30
    move-object v8, v3

    .line 659
    :goto_25
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v9

    .line 663
    if-eqz v9, :cond_31

    .line 664
    .line 665
    invoke-virtual {p1, v0, v5, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 666
    .line 667
    .line 668
    goto :goto_26

    .line 669
    :cond_31
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v8

    .line 673
    if-eqz v8, :cond_32

    .line 674
    .line 675
    iget v8, v0, La/pu90;->a:I

    .line 676
    .line 677
    sub-int v8, v7, v8

    .line 678
    .line 679
    invoke-virtual {p1, v0, v8, v5, v4}, La/ou90;->g(La/pu90;IIF)V

    .line 680
    .line 681
    .line 682
    :cond_32
    :goto_26
    if-gez v6, :cond_33

    .line 683
    .line 684
    goto :goto_27

    .line 685
    :cond_33
    move v0, v6

    .line 686
    goto :goto_23

    .line 687
    :cond_34
    :goto_27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 688
    .line 689
    return-object p0

    .line 690
    nop

    .line 691
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
