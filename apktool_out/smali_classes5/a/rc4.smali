.class public final La/rc4;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final h:La/ctf0;

.field public final i:La/ojj;


# direct methods
.method public constructor <init>(La/ctf0;La/ojj;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/a04;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, La/a04;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/rc4;->h:La/ctf0;

    .line 14
    .line 15
    iput-object p2, p0, La/rc4;->i:La/ojj;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/pc4;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/rc4;->i(La/pc4;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(La/pc4;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/qc4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/qc4;

    .line 7
    .line 8
    iget v1, v0, La/qc4;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/qc4;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/qc4;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/qc4;-><init>(La/rc4;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/qc4;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/qc4;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/qc4;->i:La/pc4;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/qc4;->i:La/pc4;

    .line 53
    .line 54
    iput v4, v0, La/qc4;->l:I

    .line 55
    .line 56
    invoke-static {p0, p1, v0}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-ne p2, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    instance-of p2, p1, La/mc4;

    .line 64
    .line 65
    sget-object v0, La/ad4;->a:La/ad4;

    .line 66
    .line 67
    sget-object v1, La/tc4;->a:La/tc4;

    .line 68
    .line 69
    if-eqz p2, :cond_11

    .line 70
    .line 71
    check-cast p1, La/mc4;

    .line 72
    .line 73
    iget-object p2, p1, La/mc4;->a:Ljava/lang/Throwable;

    .line 74
    .line 75
    iget-object p1, p1, La/mc4;->b:Lorg/xplatform/login/core/presentation/model/AuthDataModel;

    .line 76
    .line 77
    if-nez p2, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    instance-of v2, p2, Ljava/net/UnknownHostException;

    .line 81
    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    instance-of v2, p2, La/el50;

    .line 86
    .line 87
    if-eqz v2, :cond_6

    .line 88
    .line 89
    :goto_2
    sget-object p1, La/cd4;->a:La/cd4;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_6
    instance-of v2, p2, La/fn50;

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    new-instance p1, La/xc4;

    .line 101
    .line 102
    check-cast p2, La/fn50;

    .line 103
    .line 104
    invoke-direct {p1, p2}, La/xc4;-><init>(La/fn50;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :cond_7
    instance-of v2, p2, La/n64;

    .line 113
    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    invoke-virtual {p0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_5

    .line 120
    .line 121
    :cond_8
    instance-of v1, p2, La/kj50;

    .line 122
    .line 123
    if-eqz v1, :cond_9

    .line 124
    .line 125
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_5

    .line 129
    .line 130
    :cond_9
    instance-of v0, p2, La/k6a;

    .line 131
    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    new-instance p2, La/zc4;

    .line 135
    .line 136
    invoke-direct {p2, p1}, La/zc4;-><init>(Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_5

    .line 143
    .line 144
    :cond_a
    instance-of p1, p2, La/i660;

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    const v1, 0x7f130442

    .line 148
    .line 149
    .line 150
    iget-object v2, p0, La/rc4;->h:La/ctf0;

    .line 151
    .line 152
    const-string v3, ""

    .line 153
    .line 154
    if-eqz p1, :cond_d

    .line 155
    .line 156
    check-cast p2, La/i660;

    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-nez p1, :cond_b

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_b
    move-object v3, p1

    .line 166
    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_c

    .line 171
    .line 172
    new-array p1, v0, [Ljava/lang/Object;

    .line 173
    .line 174
    iget-object p2, v2, La/ctf0;->b:La/lsm0;

    .line 175
    .line 176
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p2, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    :cond_c
    new-instance p1, La/bd4;

    .line 185
    .line 186
    invoke-direct {p1, v3}, La/bd4;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_5

    .line 193
    .line 194
    :cond_d
    instance-of p1, p2, La/zhi0;

    .line 195
    .line 196
    if-eqz p1, :cond_10

    .line 197
    .line 198
    check-cast p2, La/zhi0;

    .line 199
    .line 200
    iget-object p1, p2, La/zhi0;->c:La/kuw;

    .line 201
    .line 202
    invoke-interface {p1}, La/kuw;->getErrorCode()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    if-nez p2, :cond_e

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_e
    move-object v3, p2

    .line 218
    :goto_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    if-nez p2, :cond_f

    .line 223
    .line 224
    new-array p2, v0, [Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 227
    .line 228
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {v2, v1, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    :cond_f
    new-instance p2, La/yc4;

    .line 237
    .line 238
    invoke-direct {p2, p1, v3}, La/yc4;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_5

    .line 245
    .line 246
    :cond_10
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    const-string v1, "Login error: "

    .line 253
    .line 254
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    iget-object v0, p0, La/rc4;->i:La/ojj;

    .line 265
    .line 266
    invoke-virtual {v0, p1, p2}, La/ojj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    new-instance p1, La/ed4;

    .line 270
    .line 271
    invoke-direct {p1, p2}, La/ed4;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_5

    .line 278
    .line 279
    :cond_11
    instance-of p2, p1, La/nc4;

    .line 280
    .line 281
    if-eqz p2, :cond_15

    .line 282
    .line 283
    check-cast p1, La/nc4;

    .line 284
    .line 285
    iget-object p1, p1, La/nc4;->a:Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;

    .line 286
    .line 287
    instance-of p2, p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Success;

    .line 288
    .line 289
    if-eqz p2, :cond_12

    .line 290
    .line 291
    new-instance p2, La/wc4;

    .line 292
    .line 293
    check-cast p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Success;

    .line 294
    .line 295
    iget-object p1, p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Success;->a:Ljava/lang/String;

    .line 296
    .line 297
    invoke-direct {p2, p1}, La/wc4;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_5

    .line 304
    .line 305
    :cond_12
    instance-of p2, p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Error;

    .line 306
    .line 307
    if-eqz p2, :cond_13

    .line 308
    .line 309
    sget-object p1, La/vc4;->a:La/vc4;

    .line 310
    .line 311
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_5

    .line 315
    .line 316
    :cond_13
    instance-of p1, p1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Canceled;

    .line 317
    .line 318
    if-eqz p1, :cond_14

    .line 319
    .line 320
    sget-object p1, La/uc4;->a:La/uc4;

    .line 321
    .line 322
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    goto/16 :goto_5

    .line 326
    .line 327
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 328
    .line 329
    .line 330
    return-object v3

    .line 331
    :cond_15
    instance-of p2, p1, La/lc4;

    .line 332
    .line 333
    if-eqz p2, :cond_1e

    .line 334
    .line 335
    check-cast p1, La/lc4;

    .line 336
    .line 337
    iget-object p2, p1, La/lc4;->a:La/rvs0;

    .line 338
    .line 339
    iget-object p1, p1, La/lc4;->b:Lorg/xplatform/login/core/presentation/model/AuthDataModel;

    .line 340
    .line 341
    instance-of v2, p2, La/mvs0;

    .line 342
    .line 343
    if-eqz v2, :cond_16

    .line 344
    .line 345
    goto/16 :goto_5

    .line 346
    .line 347
    :cond_16
    instance-of v2, p2, La/qvs0;

    .line 348
    .line 349
    if-eqz v2, :cond_17

    .line 350
    .line 351
    new-instance p2, La/dd4;

    .line 352
    .line 353
    invoke-static {p1}, La/vu4;->a(Lorg/xplatform/login/core/presentation/model/AuthDataModel;)La/uu4;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-direct {p2, p1}, La/dd4;-><init>(La/uu4;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_5

    .line 364
    .line 365
    :cond_17
    instance-of v2, p2, La/ovs0;

    .line 366
    .line 367
    if-eqz v2, :cond_18

    .line 368
    .line 369
    new-instance p1, La/xc4;

    .line 370
    .line 371
    new-instance v0, La/fn50;

    .line 372
    .line 373
    check-cast p2, La/ovs0;

    .line 374
    .line 375
    iget-object v1, p2, La/ovs0;->a:Ljava/lang/String;

    .line 376
    .line 377
    iget-object v2, p2, La/ovs0;->b:Ljava/lang/String;

    .line 378
    .line 379
    iget-object v3, p2, La/ovs0;->c:Ljava/lang/String;

    .line 380
    .line 381
    iget-boolean v5, p2, La/ovs0;->d:Z

    .line 382
    .line 383
    iget-boolean v6, p2, La/ovs0;->e:Z

    .line 384
    .line 385
    iget-object v4, p2, La/ovs0;->f:Ljava/lang/String;

    .line 386
    .line 387
    iget-boolean v7, p2, La/ovs0;->g:Z

    .line 388
    .line 389
    invoke-direct/range {v0 .. v7}, La/fn50;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 390
    .line 391
    .line 392
    invoke-direct {p1, v0}, La/xc4;-><init>(La/fn50;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_18
    instance-of v2, p2, La/pvs0;

    .line 400
    .line 401
    if-eqz v2, :cond_19

    .line 402
    .line 403
    new-instance p1, La/yc4;

    .line 404
    .line 405
    check-cast p2, La/pvs0;

    .line 406
    .line 407
    iget v0, p2, La/pvs0;->a:I

    .line 408
    .line 409
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    iget-object p2, p2, La/pvs0;->b:Ljava/lang/String;

    .line 414
    .line 415
    invoke-direct {p1, v0, p2}, La/yc4;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_19
    instance-of v2, p2, La/nvs0;

    .line 423
    .line 424
    if-eqz v2, :cond_1d

    .line 425
    .line 426
    check-cast p2, La/nvs0;

    .line 427
    .line 428
    iget-object p2, p2, La/nvs0;->a:Ljava/lang/Class;

    .line 429
    .line 430
    const-class v2, La/n64;

    .line 431
    .line 432
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_1a

    .line 437
    .line 438
    invoke-virtual {p0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    goto :goto_5

    .line 442
    :cond_1a
    const-class v2, La/kj50;

    .line 443
    .line 444
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-eqz v2, :cond_1b

    .line 449
    .line 450
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_1b
    const-class v0, La/k6a;

    .line 455
    .line 456
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result p2

    .line 460
    if-eqz p2, :cond_1c

    .line 461
    .line 462
    new-instance p2, La/zc4;

    .line 463
    .line 464
    invoke-direct {p2, p1}, La/zc4;-><init>(Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    goto :goto_5

    .line 471
    :cond_1c
    invoke-virtual {p0, v1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    goto :goto_5

    .line 475
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 476
    .line 477
    .line 478
    return-object v3

    .line 479
    :cond_1e
    sget-object p2, La/oc4;->a:La/oc4;

    .line 480
    .line 481
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    if-eqz p1, :cond_1f

    .line 486
    .line 487
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 488
    .line 489
    .line 490
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    return-object p0

    .line 493
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 494
    .line 495
    .line 496
    return-object v3
.end method
