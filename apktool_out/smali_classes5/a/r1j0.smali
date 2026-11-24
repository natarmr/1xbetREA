.class public final synthetic La/r1j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t1j0;


# direct methods
.method public synthetic constructor <init>(La/t1j0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r1j0;->a:B

    iput-object p1, p0, La/r1j0;->b:La/t1j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r1j0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0xf

    .line 7
    .line 8
    const/4 v4, 0x7

    .line 9
    const/16 v5, 0x13

    .line 10
    .line 11
    const/16 v6, 0xa

    .line 12
    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object v0, v0, La/r1j0;->b:La/t1j0;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 22
    .line 23
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->d:La/s31;

    .line 28
    .line 29
    iget-object v1, v1, La/s31;->a:La/kt2;

    .line 30
    .line 31
    const-string v2, "acc_settings_mirror_go"

    .line 32
    .line 33
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->A:La/s64;

    .line 37
    .line 38
    iget-object v1, v1, La/s64;->a:La/s1p;

    .line 39
    .line 40
    const-wide/16 v2, 0xcd4

    .line 41
    .line 42
    sget-object v4, La/xun;->a:La/xun;

    .line 43
    .line 44
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->J0:La/sff0;

    .line 48
    .line 49
    iget-object v1, v1, La/sff0;->O:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 62
    .line 63
    iget-object v13, v1, La/mne;->c:La/vs10;

    .line 64
    .line 65
    new-instance v11, La/kej0;

    .line 66
    .line 67
    invoke-direct {v11, v0, v8}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 68
    .line 69
    .line 70
    new-instance v14, La/oej0;

    .line 71
    .line 72
    invoke-direct {v14, v0, v9, v7}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 73
    .line 74
    .line 75
    const/16 v15, 0xa

    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    iget-object v2, v0, Lorg/xplatform/settings/impl/presentation/a;->F:La/wgu;

    .line 83
    .line 84
    invoke-virtual {v2}, La/wgu;->a()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v1, v2}, La/nsm0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v2, La/u0j0;

    .line 93
    .line 94
    invoke-direct {v2, v1}, La/u0j0;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2, v9}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 104
    .line 105
    new-instance v1, La/dzi0;

    .line 106
    .line 107
    new-instance v9, La/q1j0;

    .line 108
    .line 109
    invoke-direct {v9, v0, v8}, La/q1j0;-><init>(La/t1j0;B)V

    .line 110
    .line 111
    .line 112
    new-instance v10, La/q1j0;

    .line 113
    .line 114
    invoke-direct {v10, v0, v7}, La/q1j0;-><init>(La/t1j0;B)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v0, La/kui0;

    .line 121
    .line 122
    const/16 v11, 0x17

    .line 123
    .line 124
    invoke-direct {v0, v11}, La/kui0;-><init>(B)V

    .line 125
    .line 126
    .line 127
    new-instance v12, La/izi0;

    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    invoke-direct {v12, v9, v13}, La/izi0;-><init>(La/q1j0;B)V

    .line 131
    .line 132
    .line 133
    new-instance v14, La/gsh0;

    .line 134
    .line 135
    invoke-direct {v14, v8, v6}, La/gsh0;-><init>(IB)V

    .line 136
    .line 137
    .line 138
    sget-object v6, La/ynh0;->q:La/ynh0;

    .line 139
    .line 140
    new-instance v15, La/gbn;

    .line 141
    .line 142
    invoke-direct {v15, v0, v14, v12, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 146
    .line 147
    invoke-virtual {v0, v15}, La/dp;->b(La/gbn;)V

    .line 148
    .line 149
    .line 150
    new-instance v6, La/s3t;

    .line 151
    .line 152
    const/16 v12, 0x15

    .line 153
    .line 154
    invoke-direct {v6, v12}, La/s3t;-><init>(B)V

    .line 155
    .line 156
    .line 157
    new-instance v14, La/umu;

    .line 158
    .line 159
    invoke-direct {v14, v5}, La/umu;-><init>(B)V

    .line 160
    .line 161
    .line 162
    new-instance v5, La/pkv;

    .line 163
    .line 164
    invoke-direct {v5, v8, v4}, La/pkv;-><init>(IB)V

    .line 165
    .line 166
    .line 167
    sget-object v4, La/btv;->c:La/btv;

    .line 168
    .line 169
    new-instance v15, La/gbn;

    .line 170
    .line 171
    invoke-direct {v15, v6, v5, v14, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v15}, La/dp;->b(La/gbn;)V

    .line 175
    .line 176
    .line 177
    new-instance v4, La/s3t;

    .line 178
    .line 179
    const/16 v5, 0x11

    .line 180
    .line 181
    invoke-direct {v4, v5}, La/s3t;-><init>(B)V

    .line 182
    .line 183
    .line 184
    new-instance v5, La/umu;

    .line 185
    .line 186
    invoke-direct {v5, v3}, La/umu;-><init>(B)V

    .line 187
    .line 188
    .line 189
    new-instance v3, La/pkv;

    .line 190
    .line 191
    invoke-direct {v3, v8, v8}, La/pkv;-><init>(IB)V

    .line 192
    .line 193
    .line 194
    sget-object v6, La/fvr;->Y:La/fvr;

    .line 195
    .line 196
    new-instance v14, La/gbn;

    .line 197
    .line 198
    invoke-direct {v14, v4, v3, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v14}, La/dp;->b(La/gbn;)V

    .line 202
    .line 203
    .line 204
    new-instance v3, La/ogj0;

    .line 205
    .line 206
    const/16 v4, 0x16

    .line 207
    .line 208
    invoke-direct {v3, v4}, La/ogj0;-><init>(B)V

    .line 209
    .line 210
    .line 211
    new-instance v5, La/thj0;

    .line 212
    .line 213
    const/16 v6, 0xe

    .line 214
    .line 215
    invoke-direct {v5, v6}, La/thj0;-><init>(B)V

    .line 216
    .line 217
    .line 218
    new-instance v6, La/asj0;

    .line 219
    .line 220
    const/4 v14, 0x1

    .line 221
    invoke-direct {v6, v8, v14}, La/asj0;-><init>(IB)V

    .line 222
    .line 223
    .line 224
    sget-object v15, La/wjj0;->h:La/wjj0;

    .line 225
    .line 226
    new-instance v4, La/gbn;

    .line 227
    .line 228
    invoke-direct {v4, v3, v6, v5, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v4}, La/dp;->b(La/gbn;)V

    .line 232
    .line 233
    .line 234
    new-instance v3, La/r3j0;

    .line 235
    .line 236
    invoke-direct {v3, v7}, La/r3j0;-><init>(B)V

    .line 237
    .line 238
    .line 239
    new-instance v4, La/izi0;

    .line 240
    .line 241
    invoke-direct {v4, v9, v7}, La/izi0;-><init>(La/q1j0;B)V

    .line 242
    .line 243
    .line 244
    new-instance v5, La/gsh0;

    .line 245
    .line 246
    invoke-direct {v5, v8, v12}, La/gsh0;-><init>(IB)V

    .line 247
    .line 248
    .line 249
    sget-object v6, La/ynh0;->B:La/ynh0;

    .line 250
    .line 251
    new-instance v7, La/gbn;

    .line 252
    .line 253
    invoke-direct {v7, v3, v5, v4, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 257
    .line 258
    .line 259
    new-instance v3, La/kui0;

    .line 260
    .line 261
    const/16 v4, 0x18

    .line 262
    .line 263
    invoke-direct {v3, v4}, La/kui0;-><init>(B)V

    .line 264
    .line 265
    .line 266
    new-instance v5, La/izi0;

    .line 267
    .line 268
    invoke-direct {v5, v9, v14}, La/izi0;-><init>(La/q1j0;B)V

    .line 269
    .line 270
    .line 271
    new-instance v6, La/gsh0;

    .line 272
    .line 273
    const/16 v7, 0xb

    .line 274
    .line 275
    invoke-direct {v6, v8, v7}, La/gsh0;-><init>(IB)V

    .line 276
    .line 277
    .line 278
    sget-object v12, La/ynh0;->r:La/ynh0;

    .line 279
    .line 280
    new-instance v15, La/gbn;

    .line 281
    .line 282
    invoke-direct {v15, v3, v6, v5, v12}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v15}, La/dp;->b(La/gbn;)V

    .line 286
    .line 287
    .line 288
    new-instance v3, La/kui0;

    .line 289
    .line 290
    const/16 v5, 0x1a

    .line 291
    .line 292
    invoke-direct {v3, v5}, La/kui0;-><init>(B)V

    .line 293
    .line 294
    .line 295
    new-instance v5, La/izi0;

    .line 296
    .line 297
    invoke-direct {v5, v9, v8}, La/izi0;-><init>(La/q1j0;B)V

    .line 298
    .line 299
    .line 300
    new-instance v6, La/gsh0;

    .line 301
    .line 302
    const/16 v12, 0xd

    .line 303
    .line 304
    invoke-direct {v6, v8, v12}, La/gsh0;-><init>(IB)V

    .line 305
    .line 306
    .line 307
    sget-object v12, La/ynh0;->t:La/ynh0;

    .line 308
    .line 309
    new-instance v15, La/gbn;

    .line 310
    .line 311
    invoke-direct {v15, v3, v6, v5, v12}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v15}, La/dp;->b(La/gbn;)V

    .line 315
    .line 316
    .line 317
    new-instance v3, La/kui0;

    .line 318
    .line 319
    const/16 v5, 0x19

    .line 320
    .line 321
    invoke-direct {v3, v5}, La/kui0;-><init>(B)V

    .line 322
    .line 323
    .line 324
    new-instance v5, La/izi0;

    .line 325
    .line 326
    invoke-direct {v5, v9, v2}, La/izi0;-><init>(La/q1j0;B)V

    .line 327
    .line 328
    .line 329
    new-instance v2, La/gsh0;

    .line 330
    .line 331
    const/16 v6, 0xc

    .line 332
    .line 333
    invoke-direct {v2, v8, v6}, La/gsh0;-><init>(IB)V

    .line 334
    .line 335
    .line 336
    sget-object v6, La/ynh0;->s:La/ynh0;

    .line 337
    .line 338
    new-instance v12, La/gbn;

    .line 339
    .line 340
    invoke-direct {v12, v3, v2, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v12}, La/dp;->b(La/gbn;)V

    .line 344
    .line 345
    .line 346
    new-instance v2, La/ogj0;

    .line 347
    .line 348
    invoke-direct {v2, v14}, La/ogj0;-><init>(B)V

    .line 349
    .line 350
    .line 351
    new-instance v3, La/izi0;

    .line 352
    .line 353
    const/4 v5, 0x6

    .line 354
    invoke-direct {v3, v9, v5}, La/izi0;-><init>(La/q1j0;B)V

    .line 355
    .line 356
    .line 357
    new-instance v5, La/gsh0;

    .line 358
    .line 359
    invoke-direct {v5, v8, v4}, La/gsh0;-><init>(IB)V

    .line 360
    .line 361
    .line 362
    sget-object v4, La/ynh0;->f1:La/ynh0;

    .line 363
    .line 364
    new-instance v6, La/gbn;

    .line 365
    .line 366
    invoke-direct {v6, v2, v5, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 370
    .line 371
    .line 372
    new-instance v2, La/ogj0;

    .line 373
    .line 374
    invoke-direct {v2, v13}, La/ogj0;-><init>(B)V

    .line 375
    .line 376
    .line 377
    new-instance v3, La/izi0;

    .line 378
    .line 379
    const/4 v4, 0x5

    .line 380
    invoke-direct {v3, v9, v4}, La/izi0;-><init>(La/q1j0;B)V

    .line 381
    .line 382
    .line 383
    new-instance v4, La/gsh0;

    .line 384
    .line 385
    invoke-direct {v4, v8, v11}, La/gsh0;-><init>(IB)V

    .line 386
    .line 387
    .line 388
    sget-object v5, La/ynh0;->Z:La/ynh0;

    .line 389
    .line 390
    new-instance v6, La/gbn;

    .line 391
    .line 392
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 396
    .line 397
    .line 398
    new-instance v2, La/r3j0;

    .line 399
    .line 400
    const/16 v3, 0x1c

    .line 401
    .line 402
    invoke-direct {v2, v3}, La/r3j0;-><init>(B)V

    .line 403
    .line 404
    .line 405
    new-instance v3, La/rai0;

    .line 406
    .line 407
    invoke-direct {v3, v10, v7}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 408
    .line 409
    .line 410
    new-instance v4, La/gsh0;

    .line 411
    .line 412
    const/16 v5, 0x16

    .line 413
    .line 414
    invoke-direct {v4, v8, v5}, La/gsh0;-><init>(IB)V

    .line 415
    .line 416
    .line 417
    sget-object v5, La/ynh0;->Y:La/ynh0;

    .line 418
    .line 419
    new-instance v6, La/gbn;

    .line 420
    .line 421
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 425
    .line 426
    .line 427
    return-object v1

    .line 428
    :pswitch_1
    iget-object v0, v0, La/t1j0;->Q1:La/fiu0;

    .line 429
    .line 430
    if-eqz v0, :cond_1

    .line 431
    .line 432
    return-object v0

    .line 433
    :cond_1
    const-string v0, "viewModelFactory"

    .line 434
    .line 435
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v9

    .line 439
    :pswitch_2
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 440
    .line 441
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    iget-object v2, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 450
    .line 451
    iget-object v4, v2, La/mne;->b:La/dvj;

    .line 452
    .line 453
    new-instance v2, La/kej0;

    .line 454
    .line 455
    const/16 v3, 0x12

    .line 456
    .line 457
    invoke-direct {v2, v0, v3}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 458
    .line 459
    .line 460
    new-instance v5, La/oej0;

    .line 461
    .line 462
    const/16 v3, 0x9

    .line 463
    .line 464
    invoke-direct {v5, v0, v9, v3}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 465
    .line 466
    .line 467
    const/16 v6, 0xa

    .line 468
    .line 469
    const/4 v3, 0x0

    .line 470
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 471
    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_3
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 477
    .line 478
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 483
    .line 484
    .line 485
    move-result-object v10

    .line 486
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 487
    .line 488
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 489
    .line 490
    new-instance v11, La/kej0;

    .line 491
    .line 492
    invoke-direct {v11, v0, v3}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 493
    .line 494
    .line 495
    new-instance v14, La/oej0;

    .line 496
    .line 497
    const/16 v1, 0x8

    .line 498
    .line 499
    invoke-direct {v14, v0, v9, v1}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 500
    .line 501
    .line 502
    const/16 v15, 0xa

    .line 503
    .line 504
    const/4 v12, 0x0

    .line 505
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 506
    .line 507
    .line 508
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 509
    .line 510
    return-object v0

    .line 511
    :pswitch_4
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 512
    .line 513
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 522
    .line 523
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 524
    .line 525
    sget-object v11, La/cfj0;->a:La/cfj0;

    .line 526
    .line 527
    new-instance v14, La/oej0;

    .line 528
    .line 529
    invoke-direct {v14, v0, v9, v4}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 530
    .line 531
    .line 532
    const/16 v15, 0xa

    .line 533
    .line 534
    const/4 v12, 0x0

    .line 535
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 536
    .line 537
    .line 538
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 539
    .line 540
    return-object v0

    .line 541
    :pswitch_5
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 542
    .line 543
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, Lorg/xplatform/settings/impl/presentation/a;->K()V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_6
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 554
    .line 555
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 560
    .line 561
    new-instance v3, La/kej0;

    .line 562
    .line 563
    invoke-direct {v3, v0, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 567
    .line 568
    .line 569
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_7
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 573
    .line 574
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 579
    .line 580
    .line 581
    move-result-object v10

    .line 582
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 583
    .line 584
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 585
    .line 586
    new-instance v11, La/kej0;

    .line 587
    .line 588
    invoke-direct {v11, v0, v5}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 589
    .line 590
    .line 591
    new-instance v14, La/oej0;

    .line 592
    .line 593
    invoke-direct {v14, v0, v9, v6}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 594
    .line 595
    .line 596
    const/16 v15, 0xa

    .line 597
    .line 598
    const/4 v12, 0x0

    .line 599
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 600
    .line 601
    .line 602
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_8
    sget-object v1, La/t1j0;->Y1:La/zie0;

    .line 606
    .line 607
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->b0:La/ubu;

    .line 612
    .line 613
    invoke-virtual {v1}, La/ubu;->a()Z

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    invoke-virtual {v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->H(Z)V

    .line 618
    .line 619
    .line 620
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->S0:La/bby;

    .line 621
    .line 622
    if-eqz v0, :cond_2

    .line 623
    .line 624
    invoke-interface {v0, v9}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 625
    .line 626
    .line 627
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 628
    .line 629
    return-object v0

    .line 630
    nop

    .line 631
    :pswitch_data_0
    .packed-switch 0x0
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
