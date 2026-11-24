.class public final La/qig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/qig;->a:B

    iput-object p1, p0, La/qig;->b:Ljava/lang/Object;

    iput-object p2, p0, La/qig;->c:Ljava/lang/Object;

    iput-object p3, p0, La/qig;->d:Ljava/lang/Object;

    iput-object p4, p0, La/qig;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qig;->a:B

    .line 4
    .line 5
    const-class v2, Lkotlin/Metadata;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/qig;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, La/qig;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, La/qig;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, La/qig;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v9, v0

    .line 21
    check-cast v9, La/ihy;

    .line 22
    .line 23
    check-cast v7, Ljava/lang/String;

    .line 24
    .line 25
    move-object v10, v6

    .line 26
    check-cast v10, Ljava/lang/String;

    .line 27
    .line 28
    check-cast v5, La/dz40;

    .line 29
    .line 30
    instance-of v0, v9, La/zhy;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v9, v7, v10}, La/ihy;->C(Ljava/lang/String;Ljava/lang/String;)La/dqy;

    .line 35
    .line 36
    .line 37
    move-result-object v12

    .line 38
    new-instance v8, La/wry;

    .line 39
    .line 40
    invoke-virtual {v5}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    sget-object v13, La/rgy;->k:La/rgy;

    .line 45
    .line 46
    invoke-direct/range {v8 .. v13}, La/wry;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v8, La/uck;

    .line 51
    .line 52
    invoke-virtual {v5}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v8, v9, v7, v10, v0}, La/uck;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-object v8

    .line 60
    :pswitch_0
    move-object v1, v0

    .line 61
    check-cast v1, La/ihy;

    .line 62
    .line 63
    check-cast v7, Ljava/lang/String;

    .line 64
    .line 65
    move-object v2, v6

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    check-cast v5, La/i0d0;

    .line 69
    .line 70
    instance-of v0, v1, La/zhy;

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v1, v7, v2}, La/ihy;->C(Ljava/lang/String;Ljava/lang/String;)La/dqy;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    new-instance v0, La/nsy;

    .line 79
    .line 80
    invoke-virtual {v5}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    sget-object v5, La/rgy;->k:La/rgy;

    .line 85
    .line 86
    invoke-direct/range {v0 .. v5}, La/nsy;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    new-instance v0, La/ndk;

    .line 91
    .line 92
    invoke-virtual {v5}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-direct {v0, v1, v7, v2, v3}, La/ndk;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    return-object v0

    .line 100
    :pswitch_1
    check-cast v0, Ljava/lang/String;

    .line 101
    .line 102
    check-cast v7, La/ihy;

    .line 103
    .line 104
    check-cast v6, La/cz40;

    .line 105
    .line 106
    check-cast v5, Ljava/lang/String;

    .line 107
    .line 108
    sget-object v1, La/ihy;->a:Lkotlin/text/Regex;

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)La/bh30;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_2

    .line 115
    .line 116
    invoke-virtual {v1}, La/bh30;->a()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, La/ah30;

    .line 121
    .line 122
    invoke-virtual {v1, v3}, La/ah30;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {v7, v1, v0}, La/ihy;->u(ILjava/lang/String;)La/ksy;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    goto :goto_2

    .line 137
    :cond_2
    instance-of v1, v7, La/xgy;

    .line 138
    .line 139
    if-eqz v1, :cond_3

    .line 140
    .line 141
    move-object v1, v7

    .line 142
    check-cast v1, La/xgy;

    .line 143
    .line 144
    iget-object v1, v1, La/xgy;->b:Ljava/lang/Class;

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-nez v1, :cond_3

    .line 151
    .line 152
    invoke-virtual {v6}, La/op9;->getName()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v7, v1}, La/ihy;->A(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_3

    .line 169
    .line 170
    new-instance v0, La/k9y;

    .line 171
    .line 172
    invoke-virtual {v6}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    sget-object v3, La/rgy;->k:La/rgy;

    .line 177
    .line 178
    invoke-direct {v0, v7, v1, v2, v3}, La/k9y;-><init>(La/ihy;Ljava/lang/reflect/Field;Ljava/lang/Object;La/rgy;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    instance-of v1, v7, La/zhy;

    .line 183
    .line 184
    if-eqz v1, :cond_4

    .line 185
    .line 186
    invoke-virtual {v7, v5, v0}, La/ihy;->C(Ljava/lang/String;Ljava/lang/String;)La/dqy;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-instance v1, La/ury;

    .line 191
    .line 192
    invoke-virtual {v6}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    sget-object v6, La/rgy;->k:La/rgy;

    .line 197
    .line 198
    move-object v3, v0

    .line 199
    move-object v2, v7

    .line 200
    invoke-direct/range {v1 .. v6}, La/ury;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V

    .line 201
    .line 202
    .line 203
    move-object v0, v1

    .line 204
    goto :goto_2

    .line 205
    :cond_4
    move-object v3, v0

    .line 206
    move-object v2, v7

    .line 207
    new-instance v0, La/sck;

    .line 208
    .line 209
    invoke-virtual {v6}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-direct {v0, v2, v5, v3, v1}, La/sck;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :goto_2
    return-object v0

    .line 217
    :pswitch_2
    check-cast v0, Ljava/lang/String;

    .line 218
    .line 219
    check-cast v7, La/ihy;

    .line 220
    .line 221
    check-cast v6, La/h0d0;

    .line 222
    .line 223
    check-cast v5, Ljava/lang/String;

    .line 224
    .line 225
    sget-object v1, La/ihy;->a:Lkotlin/text/Regex;

    .line 226
    .line 227
    invoke-virtual {v1, v0}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)La/bh30;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-eqz v1, :cond_5

    .line 232
    .line 233
    invoke-virtual {v1}, La/bh30;->a()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    check-cast v1, La/ah30;

    .line 238
    .line 239
    invoke-virtual {v1, v3}, La/ah30;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    check-cast v1, Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-virtual {v7, v1, v0}, La/ihy;->u(ILjava/lang/String;)La/ksy;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_3

    .line 254
    :cond_5
    instance-of v1, v7, La/xgy;

    .line 255
    .line 256
    if-eqz v1, :cond_6

    .line 257
    .line 258
    move-object v1, v7

    .line 259
    check-cast v1, La/xgy;

    .line 260
    .line 261
    iget-object v3, v1, La/xgy;->b:Ljava/lang/Class;

    .line 262
    .line 263
    invoke-virtual {v3, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    if-nez v2, :cond_6

    .line 268
    .line 269
    :try_start_0
    invoke-virtual {v6}, La/op9;->getName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v7, v2}, La/ihy;->A(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_6

    .line 286
    .line 287
    new-instance v3, La/t9y;

    .line 288
    .line 289
    invoke-virtual {v6}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    sget-object v8, La/rgy;->k:La/rgy;

    .line 294
    .line 295
    invoke-direct {v3, v7, v2, v4, v8}, La/t9y;-><init>(La/ihy;Ljava/lang/reflect/Field;Ljava/lang/Object;La/rgy;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 296
    .line 297
    .line 298
    move-object v0, v3

    .line 299
    goto :goto_3

    .line 300
    :catch_0
    const-string v2, "getEntries()Lkotlin/enums/EnumEntries;"

    .line 301
    .line 302
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_6

    .line 307
    .line 308
    new-instance v0, La/b9y;

    .line 309
    .line 310
    invoke-direct {v0, v1}, La/b9y;-><init>(La/xgy;)V

    .line 311
    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_6
    instance-of v1, v7, La/zhy;

    .line 315
    .line 316
    if-eqz v1, :cond_7

    .line 317
    .line 318
    invoke-virtual {v7, v5, v0}, La/ihy;->C(Ljava/lang/String;Ljava/lang/String;)La/dqy;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    new-instance v1, La/ksy;

    .line 323
    .line 324
    invoke-virtual {v6}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    sget-object v6, La/rgy;->k:La/rgy;

    .line 329
    .line 330
    move-object v3, v0

    .line 331
    move-object v2, v7

    .line 332
    invoke-direct/range {v1 .. v6}, La/ksy;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V

    .line 333
    .line 334
    .line 335
    move-object v0, v1

    .line 336
    goto :goto_3

    .line 337
    :cond_7
    move-object v3, v0

    .line 338
    move-object v2, v7

    .line 339
    new-instance v0, La/kdk;

    .line 340
    .line 341
    invoke-virtual {v6}, La/op9;->getBoundReceiver()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-direct {v0, v2, v5, v3, v1}, La/kdk;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    :goto_3
    return-object v0

    .line 349
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 350
    .line 351
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, La/riu0;

    .line 356
    .line 357
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 358
    .line 359
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    check-cast v1, La/miu0;

    .line 364
    .line 365
    instance-of v2, v0, La/wmv;

    .line 366
    .line 367
    if-eqz v2, :cond_8

    .line 368
    .line 369
    move-object v4, v0

    .line 370
    check-cast v4, La/wmv;

    .line 371
    .line 372
    :cond_8
    if-eqz v4, :cond_9

    .line 373
    .line 374
    invoke-interface {v4}, La/wmv;->o()La/by40;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    goto :goto_4

    .line 379
    :cond_9
    sget-object v2, La/vbf;->b:La/vbf;

    .line 380
    .line 381
    :goto_4
    invoke-interface {v0}, La/riu0;->g()La/piu0;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    new-instance v3, La/h0q0;

    .line 395
    .line 396
    invoke-direct {v3, v0, v1, v2}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 397
    .line 398
    .line 399
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 400
    .line 401
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Ljava/lang/String;

    .line 406
    .line 407
    check-cast v5, La/sgy;

    .line 408
    .line 409
    if-nez v5, :cond_a

    .line 410
    .line 411
    const-class v1, La/k3t0;

    .line 412
    .line 413
    sget-object v2, La/sre0;->a:La/tre0;

    .line 414
    .line 415
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    :cond_a
    invoke-static {v5}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    sget-object v2, La/sre0;->a:La/tre0;

    .line 427
    .line 428
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v3, v1, v0}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0

    .line 437
    :pswitch_4
    check-cast v0, Landroid/app/Application;

    .line 438
    .line 439
    instance-of v1, v0, La/af3;

    .line 440
    .line 441
    if-eqz v1, :cond_b

    .line 442
    .line 443
    check-cast v0, La/af3;

    .line 444
    .line 445
    goto :goto_5

    .line 446
    :cond_b
    move-object v0, v4

    .line 447
    :goto_5
    const-class v1, La/kig;

    .line 448
    .line 449
    if-eqz v0, :cond_e

    .line 450
    .line 451
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    check-cast v0, La/o5d0;

    .line 460
    .line 461
    if-eqz v0, :cond_c

    .line 462
    .line 463
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, La/ze3;

    .line 468
    .line 469
    goto :goto_6

    .line 470
    :cond_c
    move-object v0, v4

    .line 471
    :goto_6
    instance-of v2, v0, La/kig;

    .line 472
    .line 473
    if-nez v2, :cond_d

    .line 474
    .line 475
    move-object v0, v4

    .line 476
    :cond_d
    check-cast v0, La/kig;

    .line 477
    .line 478
    if-eqz v0, :cond_e

    .line 479
    .line 480
    move-object/from16 v18, v7

    .line 481
    .line 482
    check-cast v18, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 483
    .line 484
    move-object/from16 v19, v6

    .line 485
    .line 486
    check-cast v19, La/sip;

    .line 487
    .line 488
    move-object/from16 v26, v5

    .line 489
    .line 490
    check-cast v26, La/cog;

    .line 491
    .line 492
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    iget-object v9, v0, La/kig;->a:La/cad;

    .line 502
    .line 503
    iget-object v10, v0, La/kig;->b:La/pyg;

    .line 504
    .line 505
    iget-object v11, v0, La/kig;->c:La/iw20;

    .line 506
    .line 507
    iget-object v12, v0, La/kig;->d:La/ugf0;

    .line 508
    .line 509
    iget-object v13, v0, La/kig;->e:La/iip;

    .line 510
    .line 511
    iget-object v14, v0, La/kig;->f:La/a1d;

    .line 512
    .line 513
    iget-object v15, v0, La/kig;->g:La/m1e;

    .line 514
    .line 515
    iget-object v1, v0, La/kig;->h:La/ctf0;

    .line 516
    .line 517
    iget-object v2, v0, La/kig;->i:La/wdk0;

    .line 518
    .line 519
    iget-object v3, v0, La/kig;->j:La/viu;

    .line 520
    .line 521
    iget-object v4, v0, La/kig;->k:La/g2v;

    .line 522
    .line 523
    iget-object v5, v0, La/kig;->l:La/b3c0;

    .line 524
    .line 525
    iget-object v6, v0, La/kig;->m:La/oeg0;

    .line 526
    .line 527
    iget-object v7, v0, La/kig;->n:La/fvt0;

    .line 528
    .line 529
    iget-object v0, v0, La/kig;->o:La/nv20;

    .line 530
    .line 531
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    new-instance v8, La/kei;

    .line 553
    .line 554
    move-object/from16 v25, v0

    .line 555
    .line 556
    move-object/from16 v16, v1

    .line 557
    .line 558
    move-object/from16 v17, v2

    .line 559
    .line 560
    move-object/from16 v20, v3

    .line 561
    .line 562
    move-object/from16 v21, v4

    .line 563
    .line 564
    move-object/from16 v22, v5

    .line 565
    .line 566
    move-object/from16 v23, v6

    .line 567
    .line 568
    move-object/from16 v24, v7

    .line 569
    .line 570
    invoke-direct/range {v8 .. v26}, La/kei;-><init>(La/cad;La/pyg;La/iw20;La/ugf0;La/iip;La/a1d;La/m1e;La/ctf0;La/wdk0;Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/sip;La/viu;La/g2v;La/b3c0;La/oeg0;La/fvt0;La/nv20;La/cog;)V

    .line 571
    .line 572
    .line 573
    move-object v4, v8

    .line 574
    goto :goto_7

    .line 575
    :cond_e
    const-string v0, "Cannot create dependency "

    .line 576
    .line 577
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    :goto_7
    return-object v4

    .line 585
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
