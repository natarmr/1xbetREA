.class public final La/ugy;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/xgy;

.field public final c:La/vgy;


# direct methods
.method public synthetic constructor <init>(La/vgy;La/xgy;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ugy;->a:B

    iput-object p1, p0, La/ugy;->c:La/vgy;

    iput-object p2, p0, La/ugy;->b:La/xgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/xgy;La/vgy;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/ugy;->a:B

    iput-object p1, p0, La/ugy;->b:La/xgy;

    iput-object p2, p0, La/ugy;->c:La/vgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ugy;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/16 v3, 0x2e

    .line 7
    .line 8
    const/16 v4, 0x2f

    .line 9
    .line 10
    const-string v5, "name"

    .line 11
    .line 12
    const-class v6, Lkotlin/Metadata;

    .line 13
    .line 14
    const/16 v7, 0xa

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v10, v0, La/ugy;->b:La/xgy;

    .line 18
    .line 19
    iget-object v0, v0, La/ugy;->c:La/vgy;

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    sget-object v0, La/nzs0;->d:La/nzs0;

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_0
    sget-object v2, La/nzs0;->d:La/nzs0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v2, v2, La/qpy;->c:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v4, La/j24;->e:La/c5k;

    .line 61
    .line 62
    sget-object v5, La/j24;->a:[La/iiy;

    .line 63
    .line 64
    aget-object v5, v5, v7

    .line 65
    .line 66
    invoke-virtual {v4, v5, v0}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v3, v11

    .line 74
    :goto_0
    if-eqz v3, :cond_2

    .line 75
    .line 76
    sget-object v0, La/sre0;->a:La/tre0;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v0, v11

    .line 84
    :goto_1
    instance-of v3, v0, La/xgy;

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    check-cast v0, La/xgy;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    move-object v0, v11

    .line 92
    :goto_2
    if-eqz v0, :cond_4

    .line 93
    .line 94
    iget-object v0, v0, La/xgy;->c:La/a8z;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/vgy;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0}, La/vgy;->d()La/nzs0;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    :cond_4
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v2, v11, v10, v0}, La/msm0;->k(Ljava/util/ArrayList;La/nzs0;La/oiy;Ljava/lang/ClassLoader;)La/nzs0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_3
    return-object v0

    .line 119
    :pswitch_0
    sget-boolean v1, La/aao0;->a:Z

    .line 120
    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    invoke-virtual {v0}, La/vgy;->b()La/wm40;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, La/wm40;->M()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v1, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, La/hzs0;

    .line 158
    .line 159
    new-instance v3, La/niy;

    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-direct {v3, v10, v2}, La/niy;-><init>(La/oiy;La/hzs0;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_5
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    if-nez v1, :cond_6

    .line 176
    .line 177
    iget-object v0, v10, La/xgy;->b:Ljava/lang/Class;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v10}, La/tke;->k0([Ljava/lang/reflect/TypeVariable;La/oiy;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto :goto_5

    .line 191
    :cond_6
    invoke-virtual {v0}, La/vgy;->d()La/nzs0;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v1, v0, La/nzs0;->a:Ljava/util/List;

    .line 196
    .line 197
    :cond_7
    :goto_5
    return-object v1

    .line 198
    :pswitch_1
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 199
    .line 200
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-eqz v0, :cond_d

    .line 205
    .line 206
    invoke-static {v0}, La/j24;->a(La/qpy;)La/rlc;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    sget-object v6, La/rlc;->g:La/rlc;

    .line 211
    .line 212
    if-eq v2, v6, :cond_8

    .line 213
    .line 214
    invoke-static {v0}, La/j24;->a(La/qpy;)La/rlc;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    sget-object v6, La/rlc;->h:La/rlc;

    .line 219
    .line 220
    if-eq v2, v6, :cond_8

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_8
    invoke-static {v0}, La/j24;->a(La/qpy;)La/rlc;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    sget-object v6, La/rlc;->h:La/rlc;

    .line 228
    .line 229
    if-ne v2, v6, :cond_c

    .line 230
    .line 231
    sget-object v2, La/scd;->a:Ljava/util/LinkedHashSet;

    .line 232
    .line 233
    iget-object v6, v0, La/qpy;->b:Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v6, :cond_b

    .line 236
    .line 237
    invoke-static {v6}, La/jwb;->V(Ljava/lang/String;)La/qlc;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-virtual {v6}, La/qlc;->e()La/qlc;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-nez v2, :cond_c

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    iget-object v0, v0, La/qpy;->b:Ljava/lang/String;

    .line 256
    .line 257
    if-eqz v0, :cond_a

    .line 258
    .line 259
    const-string v2, "."

    .line 260
    .line 261
    invoke-static {v0, v2, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-nez v2, :cond_9

    .line 266
    .line 267
    invoke-static {v4, v0, v0}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v3, v0, v0}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    goto :goto_6

    .line 280
    :cond_9
    const-string v1, "Local class is not supported: "

    .line 281
    .line 282
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v0}, La/c99;->s(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_a
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v11

    .line 294
    :cond_b
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v11

    .line 298
    :cond_c
    const-string v0, "INSTANCE"

    .line 299
    .line 300
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    :goto_6
    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    :cond_d
    :goto_7
    return-object v11

    .line 312
    :pswitch_2
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 313
    .line 314
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-eqz v0, :cond_11

    .line 319
    .line 320
    iget-object v2, v0, La/qpy;->b:Ljava/lang/String;

    .line 321
    .line 322
    if-eqz v2, :cond_10

    .line 323
    .line 324
    invoke-static {v2}, La/jwb;->V(Ljava/lang/String;)La/qlc;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iget-object v0, v0, La/qpy;->i:Ljava/util/ArrayList;

    .line 333
    .line 334
    new-instance v3, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_12

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    check-cast v4, Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v4}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-virtual {v2, v4}, La/qlc;->d(La/g950;)La/qlc;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-static {v1, v4, v9}, La/xtt0;->l(Ljava/lang/ClassLoader;La/qlc;I)Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    if-eqz v4, :cond_f

    .line 368
    .line 369
    sget-object v5, La/sre0;->a:La/tre0;

    .line 370
    .line 371
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    goto :goto_9

    .line 376
    :cond_f
    move-object v4, v11

    .line 377
    :goto_9
    if-eqz v4, :cond_e

    .line 378
    .line 379
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_10
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v11

    .line 387
    :cond_11
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    new-instance v3, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 397
    .line 398
    .line 399
    array-length v1, v0

    .line 400
    :goto_a
    if-ge v9, v1, :cond_12

    .line 401
    .line 402
    aget-object v2, v0, v9

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    sget-object v4, La/sre0;->a:La/tre0;

    .line 408
    .line 409
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    add-int/lit8 v9, v9, 0x1

    .line 417
    .line 418
    goto :goto_a

    .line 419
    :cond_12
    return-object v3

    .line 420
    :pswitch_3
    invoke-virtual {v10}, La/xgy;->V()La/rlc;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iget-object v2, v10, La/xgy;->b:Ljava/lang/Class;

    .line 425
    .line 426
    sget-object v5, La/rlc;->c:La/rlc;

    .line 427
    .line 428
    if-eq v1, v5, :cond_25

    .line 429
    .line 430
    invoke-virtual {v10}, La/xgy;->V()La/rlc;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    sget-object v5, La/rlc;->g:La/rlc;

    .line 435
    .line 436
    if-eq v1, v5, :cond_25

    .line 437
    .line 438
    invoke-virtual {v10}, La/xgy;->V()La/rlc;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    sget-object v5, La/rlc;->h:La/rlc;

    .line 443
    .line 444
    if-eq v1, v5, :cond_25

    .line 445
    .line 446
    invoke-virtual {v10}, La/xgy;->V()La/rlc;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    sget-object v5, La/rlc;->e:La/rlc;

    .line 451
    .line 452
    if-eq v1, v5, :cond_25

    .line 453
    .line 454
    invoke-virtual {v2}, Ljava/lang/Class;->isSynthetic()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_13

    .line 459
    .line 460
    goto/16 :goto_16

    .line 461
    .line 462
    :cond_13
    sget-boolean v1, La/aao0;->a:Z

    .line 463
    .line 464
    if-eqz v1, :cond_14

    .line 465
    .line 466
    invoke-virtual {v10}, La/xgy;->D()Ljava/util/Collection;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, Ljava/lang/Iterable;

    .line 471
    .line 472
    new-instance v1, Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 479
    .line 480
    .line 481
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-eqz v2, :cond_26

    .line 490
    .line 491
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    check-cast v2, La/x4e;

    .line 496
    .line 497
    new-instance v3, La/qck;

    .line 498
    .line 499
    invoke-direct {v3, v10, v2}, La/qck;-><init>(La/ihy;La/mer;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    goto :goto_b

    .line 506
    :cond_14
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    if-eqz v1, :cond_22

    .line 511
    .line 512
    invoke-virtual {v10}, La/xgy;->E()Ljava/util/Collection;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, Ljava/lang/Iterable;

    .line 517
    .line 518
    new-instance v2, Ljava/util/ArrayList;

    .line 519
    .line 520
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 525
    .line 526
    .line 527
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    if-eqz v5, :cond_16

    .line 536
    .line 537
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    check-cast v5, La/upy;

    .line 542
    .line 543
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    sget-object v6, La/sey;->b:La/zpy;

    .line 547
    .line 548
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    iget-object v8, v5, La/upy;->f:Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-static {v8, v6}, La/slb;->V(Ljava/util/Collection;La/zpy;)La/ypy;

    .line 554
    .line 555
    .line 556
    move-result-object v6

    .line 557
    check-cast v6, La/sey;

    .line 558
    .line 559
    iget-object v6, v6, La/sey;->a:La/hfy;

    .line 560
    .line 561
    if-eqz v6, :cond_15

    .line 562
    .line 563
    invoke-virtual {v6}, La/hfy;->toString()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    new-instance v8, La/qry;

    .line 568
    .line 569
    sget-object v12, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 570
    .line 571
    invoke-direct {v8, v10, v6, v12, v5}, La/qry;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/upy;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_c

    .line 578
    :cond_15
    new-instance v0, La/poe;

    .line 579
    .line 580
    iget-object v1, v5, La/upy;->b:Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    new-instance v2, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    const-string v3, "No signature for constructor ("

    .line 589
    .line 590
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-string v1, " parameters, declared in "

    .line 597
    .line 598
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    const/16 v1, 0x29

    .line 605
    .line 606
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    throw v0

    .line 617
    :cond_16
    iget-object v0, v0, La/vgy;->q:La/xgy;

    .line 618
    .line 619
    invoke-static {v0}, La/tke;->X(La/sgy;)Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    iget-object v5, v0, La/xgy;->b:Ljava/lang/Class;

    .line 624
    .line 625
    if-nez v1, :cond_17

    .line 626
    .line 627
    sget-object v0, La/iun;->a:La/iun;

    .line 628
    .line 629
    goto/16 :goto_13

    .line 630
    .line 631
    :cond_17
    invoke-virtual {v0}, La/xgy;->E()Ljava/util/Collection;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    check-cast v1, Ljava/lang/Iterable;

    .line 636
    .line 637
    new-instance v6, Ljava/util/ArrayList;

    .line 638
    .line 639
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 640
    .line 641
    .line 642
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    :cond_18
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v8

    .line 650
    if-eqz v8, :cond_1a

    .line 651
    .line 652
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v8

    .line 656
    check-cast v8, La/upy;

    .line 657
    .line 658
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    sget-object v10, La/sey;->b:La/zpy;

    .line 662
    .line 663
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    iget-object v8, v8, La/upy;->f:Ljava/util/ArrayList;

    .line 667
    .line 668
    invoke-static {v8, v10}, La/slb;->V(Ljava/util/Collection;La/zpy;)La/ypy;

    .line 669
    .line 670
    .line 671
    move-result-object v8

    .line 672
    check-cast v8, La/sey;

    .line 673
    .line 674
    iget-object v8, v8, La/sey;->a:La/hfy;

    .line 675
    .line 676
    if-eqz v8, :cond_19

    .line 677
    .line 678
    invoke-virtual {v8}, La/hfy;->toString()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    goto :goto_e

    .line 683
    :cond_19
    move-object v8, v11

    .line 684
    :goto_e
    if-eqz v8, :cond_18

    .line 685
    .line 686
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    goto :goto_d

    .line 690
    :cond_1a
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    invoke-virtual {v6, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    new-instance v8, Ljava/util/ArrayList;

    .line 713
    .line 714
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 715
    .line 716
    .line 717
    array-length v10, v6

    .line 718
    :goto_f
    if-ge v9, v10, :cond_20

    .line 719
    .line 720
    aget-object v12, v6, v9

    .line 721
    .line 722
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-static {v12}, La/azw;->J(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v13

    .line 729
    invoke-virtual {v12}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 730
    .line 731
    .line 732
    move-result v14

    .line 733
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 734
    .line 735
    .line 736
    move-result v14

    .line 737
    if-nez v14, :cond_1b

    .line 738
    .line 739
    invoke-virtual {v12}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 740
    .line 741
    .line 742
    move-result v14

    .line 743
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 744
    .line 745
    .line 746
    move-result v14

    .line 747
    if-eqz v14, :cond_1e

    .line 748
    .line 749
    :cond_1b
    invoke-interface {v1, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v14

    .line 753
    if-nez v14, :cond_1e

    .line 754
    .line 755
    invoke-virtual {v12}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    move-result-object v14

    .line 759
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    invoke-static {v14}, La/tx3;->X([Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v14

    .line 766
    check-cast v14, Ljava/lang/Class;

    .line 767
    .line 768
    if-nez v14, :cond_1c

    .line 769
    .line 770
    goto :goto_10

    .line 771
    :cond_1c
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v15

    .line 775
    if-nez v15, :cond_1e

    .line 776
    .line 777
    sget-object v15, La/bqe0;->b:Ljava/util/LinkedHashMap;

    .line 778
    .line 779
    invoke-virtual {v15, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v15

    .line 783
    check-cast v15, Ljava/lang/Class;

    .line 784
    .line 785
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v14

    .line 789
    if-eqz v14, :cond_1d

    .line 790
    .line 791
    goto :goto_11

    .line 792
    :cond_1d
    :goto_10
    const-class v14, Ljava/lang/Deprecated;

    .line 793
    .line 794
    invoke-virtual {v12, v14}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 795
    .line 796
    .line 797
    move-result v14

    .line 798
    if-nez v14, :cond_1e

    .line 799
    .line 800
    sget-object v14, La/pey;->f:Ljava/util/LinkedHashSet;

    .line 801
    .line 802
    new-instance v15, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    invoke-direct {v15, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v13

    .line 817
    invoke-interface {v14, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v13

    .line 821
    if-nez v13, :cond_1e

    .line 822
    .line 823
    new-instance v13, La/h9y;

    .line 824
    .line 825
    sget-object v14, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 826
    .line 827
    invoke-direct {v13, v0, v12, v14}, La/h9y;-><init>(La/ihy;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    goto :goto_12

    .line 831
    :cond_1e
    :goto_11
    move-object v13, v11

    .line 832
    :goto_12
    if-eqz v13, :cond_1f

    .line 833
    .line 834
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 835
    .line 836
    .line 837
    :cond_1f
    add-int/lit8 v9, v9, 0x1

    .line 838
    .line 839
    goto :goto_f

    .line 840
    :cond_20
    move-object v0, v8

    .line 841
    :goto_13
    new-instance v1, Ljava/util/ArrayList;

    .line 842
    .line 843
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 844
    .line 845
    .line 846
    move-result v3

    .line 847
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 848
    .line 849
    .line 850
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    if-eqz v3, :cond_21

    .line 859
    .line 860
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    check-cast v3, La/h9y;

    .line 865
    .line 866
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    goto :goto_14

    .line 873
    :cond_21
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    goto :goto_17

    .line 878
    :cond_22
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-eqz v0, :cond_23

    .line 883
    .line 884
    sget-object v1, La/iun;->a:La/iun;

    .line 885
    .line 886
    goto :goto_17

    .line 887
    :cond_23
    invoke-virtual {v2}, Ljava/lang/Class;->isAnnotation()Z

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-nez v0, :cond_24

    .line 892
    .line 893
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 898
    .line 899
    .line 900
    new-instance v1, Ljava/util/ArrayList;

    .line 901
    .line 902
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 903
    .line 904
    .line 905
    array-length v2, v0

    .line 906
    :goto_15
    if-ge v9, v2, :cond_26

    .line 907
    .line 908
    aget-object v3, v0, v9

    .line 909
    .line 910
    new-instance v4, La/h9y;

    .line 911
    .line 912
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    sget-object v5, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 916
    .line 917
    invoke-direct {v4, v10, v3, v5}, La/h9y;-><init>(La/ihy;Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    add-int/lit8 v9, v9, 0x1

    .line 924
    .line 925
    goto :goto_15

    .line 926
    :cond_24
    new-instance v0, La/i8y;

    .line 927
    .line 928
    invoke-direct {v0, v10}, La/i8y;-><init>(La/xgy;)V

    .line 929
    .line 930
    .line 931
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    goto :goto_17

    .line 936
    :cond_25
    :goto_16
    sget-object v1, La/iun;->a:La/iun;

    .line 937
    .line 938
    :cond_26
    :goto_17
    return-object v1

    .line 939
    :pswitch_4
    invoke-virtual {v0}, La/vgy;->a()Ljava/util/Collection;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    sget-object v1, La/two;->a:La/gi2;

    .line 944
    .line 945
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    new-instance v1, Ljava/util/HashMap;

    .line 949
    .line 950
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 951
    .line 952
    .line 953
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-virtual {v2, v6}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    if-eqz v2, :cond_27

    .line 962
    .line 963
    const/4 v2, 0x1

    .line 964
    goto :goto_18

    .line 965
    :cond_27
    move v2, v9

    .line 966
    :goto_18
    new-instance v3, Ljava/util/HashMap;

    .line 967
    .line 968
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 969
    .line 970
    .line 971
    sget-object v4, La/j0o;->a:La/j0o;

    .line 972
    .line 973
    if-eqz v2, :cond_29

    .line 974
    .line 975
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 976
    .line 977
    .line 978
    move-result-object v5

    .line 979
    :cond_28
    :goto_19
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 980
    .line 981
    .line 982
    move-result v6

    .line 983
    if-eqz v6, :cond_29

    .line 984
    .line 985
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v6

    .line 989
    check-cast v6, La/dre0;

    .line 990
    .line 991
    invoke-static {v10, v6}, La/two;->e(La/xgy;La/dre0;)Z

    .line 992
    .line 993
    .line 994
    move-result v7

    .line 995
    if-nez v7, :cond_28

    .line 996
    .line 997
    invoke-static {v6, v4}, La/two;->h(La/dre0;La/vtb;)La/k0o;

    .line 998
    .line 999
    .line 1000
    move-result-object v7

    .line 1001
    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    goto :goto_19

    .line 1005
    :cond_29
    invoke-virtual {v10}, La/xgy;->b()Ljava/util/List;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v5

    .line 1009
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v5

    .line 1013
    :cond_2a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v6

    .line 1017
    sget-object v21, La/i0o;->a:La/i0o;

    .line 1018
    .line 1019
    if-eqz v6, :cond_3b

    .line 1020
    .line 1021
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v6

    .line 1025
    check-cast v6, La/kiy;

    .line 1026
    .line 1027
    invoke-interface {v6}, La/kiy;->o()La/fhy;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v7

    .line 1031
    instance-of v12, v7, La/sgy;

    .line 1032
    .line 1033
    if-eqz v12, :cond_2b

    .line 1034
    .line 1035
    check-cast v7, La/sgy;

    .line 1036
    .line 1037
    goto :goto_1a

    .line 1038
    :cond_2b
    move-object v7, v11

    .line 1039
    :goto_1a
    if-eqz v7, :cond_3a

    .line 1040
    .line 1041
    sget-object v12, La/siy;->c:La/siy;

    .line 1042
    .line 1043
    invoke-static {v6}, La/b5x;->x(La/kiy;)La/siy;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v6

    .line 1047
    invoke-static {v7}, La/two;->c(La/sgy;)Ljava/util/Map;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v7

    .line 1051
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v7

    .line 1055
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v7

    .line 1059
    :cond_2c
    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v12

    .line 1063
    if-eqz v12, :cond_2a

    .line 1064
    .line 1065
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v12

    .line 1069
    check-cast v12, Ljava/util/Map$Entry;

    .line 1070
    .line 1071
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v12

    .line 1075
    check-cast v12, La/dre0;

    .line 1076
    .line 1077
    move-object v13, v12

    .line 1078
    check-cast v13, La/ere0;

    .line 1079
    .line 1080
    iget-object v13, v13, La/ere0;->a:La/rgy;

    .line 1081
    .line 1082
    invoke-virtual {v13, v6}, La/rgy;->d(La/siy;)La/rgy;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v22

    .line 1086
    invoke-static {v12}, La/two;->f(La/dre0;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v13

    .line 1090
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v25

    .line 1094
    invoke-static {v12}, La/two;->d(La/dre0;)La/ihy;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v26

    .line 1098
    invoke-interface {v12}, La/qgy;->getTypeParameters()Ljava/util/List;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v27

    .line 1102
    invoke-static {v12}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v28

    .line 1106
    const/16 v32, 0x0

    .line 1107
    .line 1108
    const/16 v33, 0x3c3

    .line 1109
    .line 1110
    const/16 v23, 0x0

    .line 1111
    .line 1112
    const/16 v24, 0x0

    .line 1113
    .line 1114
    const/16 v29, 0x0

    .line 1115
    .line 1116
    const/16 v30, 0x0

    .line 1117
    .line 1118
    const/16 v31, 0x0

    .line 1119
    .line 1120
    invoke-static/range {v22 .. v33}, La/rgy;->a(La/rgy;La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZI)La/rgy;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v13

    .line 1124
    invoke-interface {v12, v10, v13}, La/dre0;->H(La/ihy;La/rgy;)La/dre0;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v12

    .line 1128
    invoke-static {v12, v4}, La/two;->h(La/dre0;La/vtb;)La/k0o;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v13

    .line 1132
    invoke-virtual {v3, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v14

    .line 1136
    if-nez v14, :cond_2c

    .line 1137
    .line 1138
    move-object v14, v12

    .line 1139
    new-instance v12, La/k0o;

    .line 1140
    .line 1141
    iget-object v15, v13, La/k0o;->a:La/guj0;

    .line 1142
    .line 1143
    move-object/from16 v16, v14

    .line 1144
    .line 1145
    iget-object v14, v13, La/k0o;->b:Ljava/lang/String;

    .line 1146
    .line 1147
    move-object/from16 v17, v15

    .line 1148
    .line 1149
    iget-object v15, v13, La/k0o;->c:Ljava/lang/String;

    .line 1150
    .line 1151
    iget-object v8, v13, La/k0o;->d:Ljava/util/List;

    .line 1152
    .line 1153
    iget-object v9, v13, La/k0o;->e:Ljava/util/ArrayList;

    .line 1154
    .line 1155
    iget-object v11, v13, La/k0o;->f:Ljava/util/List;

    .line 1156
    .line 1157
    move-object/from16 v24, v0

    .line 1158
    .line 1159
    iget-object v0, v13, La/k0o;->g:Ljava/util/List;

    .line 1160
    .line 1161
    iget-boolean v13, v13, La/k0o;->h:Z

    .line 1162
    .line 1163
    move-object/from16 v19, v0

    .line 1164
    .line 1165
    move-object/from16 v18, v11

    .line 1166
    .line 1167
    move/from16 v20, v13

    .line 1168
    .line 1169
    move-object/from16 v0, v16

    .line 1170
    .line 1171
    move-object/from16 v13, v17

    .line 1172
    .line 1173
    move-object/from16 v16, v8

    .line 1174
    .line 1175
    move-object/from16 v17, v9

    .line 1176
    .line 1177
    invoke-direct/range {v12 .. v21}, La/k0o;-><init>(La/guj0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLa/vtb;)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v1, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v8

    .line 1184
    if-eqz v8, :cond_39

    .line 1185
    .line 1186
    check-cast v8, La/dre0;

    .line 1187
    .line 1188
    sget-object v9, La/s7f;->b:La/s7f;

    .line 1189
    .line 1190
    invoke-virtual {v9, v8, v0}, La/s7f;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1191
    .line 1192
    .line 1193
    move-result v9

    .line 1194
    if-gtz v9, :cond_2d

    .line 1195
    .line 1196
    move-object v9, v8

    .line 1197
    goto :goto_1c

    .line 1198
    :cond_2d
    move-object v9, v0

    .line 1199
    :goto_1c
    instance-of v11, v8, La/jhy;

    .line 1200
    .line 1201
    if-eqz v11, :cond_37

    .line 1202
    .line 1203
    instance-of v11, v0, La/jhy;

    .line 1204
    .line 1205
    if-eqz v11, :cond_37

    .line 1206
    .line 1207
    invoke-interface {v9}, La/dre0;->K()La/ihy;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v11

    .line 1211
    move-object v13, v9

    .line 1212
    check-cast v13, La/ere0;

    .line 1213
    .line 1214
    iget-object v13, v13, La/ere0;->a:La/rgy;

    .line 1215
    .line 1216
    sget-object v14, La/two;->a:La/gi2;

    .line 1217
    .line 1218
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v14, v8, v0}, La/gi2;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 1222
    .line 1223
    .line 1224
    move-result v14

    .line 1225
    if-gtz v14, :cond_2e

    .line 1226
    .line 1227
    move-object v14, v8

    .line 1228
    goto :goto_1d

    .line 1229
    :cond_2e
    move-object v14, v0

    .line 1230
    :goto_1d
    invoke-interface {v14}, La/dre0;->m()La/fm40;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v27

    .line 1234
    move-object v14, v8

    .line 1235
    check-cast v14, La/ere0;

    .line 1236
    .line 1237
    iget-object v14, v14, La/ere0;->a:La/rgy;

    .line 1238
    .line 1239
    iget-object v14, v14, La/rgy;->f:Ljava/util/List;

    .line 1240
    .line 1241
    move-object v15, v0

    .line 1242
    check-cast v15, La/ere0;

    .line 1243
    .line 1244
    iget-object v15, v15, La/ere0;->a:La/rgy;

    .line 1245
    .line 1246
    iget-object v15, v15, La/rgy;->f:Ljava/util/List;

    .line 1247
    .line 1248
    invoke-static {v14, v15}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v31

    .line 1252
    check-cast v8, La/jhy;

    .line 1253
    .line 1254
    invoke-interface {v8}, La/jhy;->isExternal()Z

    .line 1255
    .line 1256
    .line 1257
    move-result v14

    .line 1258
    if-nez v14, :cond_30

    .line 1259
    .line 1260
    move-object v14, v0

    .line 1261
    check-cast v14, La/jhy;

    .line 1262
    .line 1263
    invoke-interface {v14}, La/jhy;->isExternal()Z

    .line 1264
    .line 1265
    .line 1266
    move-result v14

    .line 1267
    if-eqz v14, :cond_2f

    .line 1268
    .line 1269
    goto :goto_1e

    .line 1270
    :cond_2f
    const/16 v32, 0x0

    .line 1271
    .line 1272
    goto :goto_1f

    .line 1273
    :cond_30
    :goto_1e
    const/16 v32, 0x1

    .line 1274
    .line 1275
    :goto_1f
    invoke-interface {v8}, La/jhy;->isOperator()Z

    .line 1276
    .line 1277
    .line 1278
    move-result v14

    .line 1279
    if-nez v14, :cond_32

    .line 1280
    .line 1281
    move-object v14, v0

    .line 1282
    check-cast v14, La/jhy;

    .line 1283
    .line 1284
    invoke-interface {v14}, La/jhy;->isOperator()Z

    .line 1285
    .line 1286
    .line 1287
    move-result v14

    .line 1288
    if-eqz v14, :cond_31

    .line 1289
    .line 1290
    goto :goto_20

    .line 1291
    :cond_31
    const/16 v33, 0x0

    .line 1292
    .line 1293
    goto :goto_21

    .line 1294
    :cond_32
    :goto_20
    const/16 v33, 0x1

    .line 1295
    .line 1296
    :goto_21
    invoke-interface {v8}, La/jhy;->isInfix()Z

    .line 1297
    .line 1298
    .line 1299
    move-result v14

    .line 1300
    if-nez v14, :cond_34

    .line 1301
    .line 1302
    move-object v14, v0

    .line 1303
    check-cast v14, La/jhy;

    .line 1304
    .line 1305
    invoke-interface {v14}, La/jhy;->isInfix()Z

    .line 1306
    .line 1307
    .line 1308
    move-result v14

    .line 1309
    if-eqz v14, :cond_33

    .line 1310
    .line 1311
    goto :goto_22

    .line 1312
    :cond_33
    const/16 v34, 0x0

    .line 1313
    .line 1314
    goto :goto_23

    .line 1315
    :cond_34
    :goto_22
    const/16 v34, 0x1

    .line 1316
    .line 1317
    :goto_23
    invoke-interface {v8}, La/jhy;->isInline()Z

    .line 1318
    .line 1319
    .line 1320
    move-result v8

    .line 1321
    if-nez v8, :cond_36

    .line 1322
    .line 1323
    move-object v8, v0

    .line 1324
    check-cast v8, La/jhy;

    .line 1325
    .line 1326
    invoke-interface {v8}, La/jhy;->isInline()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v8

    .line 1330
    if-eqz v8, :cond_35

    .line 1331
    .line 1332
    goto :goto_24

    .line 1333
    :cond_35
    const/16 v35, 0x0

    .line 1334
    .line 1335
    goto :goto_25

    .line 1336
    :cond_36
    :goto_24
    const/16 v35, 0x1

    .line 1337
    .line 1338
    :goto_25
    const/16 v36, 0x1d

    .line 1339
    .line 1340
    const/16 v26, 0x0

    .line 1341
    .line 1342
    const/16 v28, 0x0

    .line 1343
    .line 1344
    const/16 v29, 0x0

    .line 1345
    .line 1346
    const/16 v30, 0x0

    .line 1347
    .line 1348
    move-object/from16 v25, v13

    .line 1349
    .line 1350
    invoke-static/range {v25 .. v36}, La/rgy;->a(La/rgy;La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZI)La/rgy;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v8

    .line 1354
    invoke-interface {v9, v11, v8}, La/dre0;->H(La/ihy;La/rgy;)La/dre0;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v8

    .line 1358
    goto :goto_26

    .line 1359
    :cond_37
    move-object v8, v9

    .line 1360
    :goto_26
    if-nez v8, :cond_38

    .line 1361
    .line 1362
    goto :goto_27

    .line 1363
    :cond_38
    move-object v0, v8

    .line 1364
    :cond_39
    :goto_27
    invoke-virtual {v1, v12, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-object/from16 v0, v24

    .line 1368
    .line 1369
    const/4 v9, 0x0

    .line 1370
    const/4 v11, 0x0

    .line 1371
    goto/16 :goto_1b

    .line 1372
    .line 1373
    :cond_3a
    const-string v0, "Non-denotable supertypes are not possible. Supertype \'"

    .line 1374
    .line 1375
    const-string v1, "\' appears non-denotable in class \'"

    .line 1376
    .line 1377
    invoke-static {v0, v6, v1, v10}, La/ohq;->n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1378
    .line 1379
    .line 1380
    const/4 v11, 0x0

    .line 1381
    goto :goto_2a

    .line 1382
    :cond_3b
    move-object/from16 v24, v0

    .line 1383
    .line 1384
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v3

    .line 1396
    if-eqz v3, :cond_3c

    .line 1397
    .line 1398
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v3

    .line 1402
    check-cast v3, Ljava/util/Map$Entry;

    .line 1403
    .line 1404
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v4

    .line 1408
    check-cast v4, La/k0o;

    .line 1409
    .line 1410
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v3

    .line 1414
    check-cast v3, La/dre0;

    .line 1415
    .line 1416
    new-instance v12, La/k0o;

    .line 1417
    .line 1418
    iget-object v13, v4, La/k0o;->a:La/guj0;

    .line 1419
    .line 1420
    iget-object v14, v4, La/k0o;->b:Ljava/lang/String;

    .line 1421
    .line 1422
    iget-object v15, v4, La/k0o;->c:Ljava/lang/String;

    .line 1423
    .line 1424
    iget-object v5, v4, La/k0o;->d:Ljava/util/List;

    .line 1425
    .line 1426
    iget-object v6, v4, La/k0o;->e:Ljava/util/ArrayList;

    .line 1427
    .line 1428
    iget-object v7, v4, La/k0o;->f:Ljava/util/List;

    .line 1429
    .line 1430
    iget-object v8, v4, La/k0o;->g:Ljava/util/List;

    .line 1431
    .line 1432
    iget-boolean v4, v4, La/k0o;->h:Z

    .line 1433
    .line 1434
    move/from16 v20, v4

    .line 1435
    .line 1436
    move-object/from16 v16, v5

    .line 1437
    .line 1438
    move-object/from16 v17, v6

    .line 1439
    .line 1440
    move-object/from16 v18, v7

    .line 1441
    .line 1442
    move-object/from16 v19, v8

    .line 1443
    .line 1444
    invoke-direct/range {v12 .. v21}, La/k0o;-><init>(La/guj0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZLa/vtb;)V

    .line 1445
    .line 1446
    .line 1447
    move-object/from16 v4, v21

    .line 1448
    .line 1449
    invoke-virtual {v1, v12, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    goto :goto_28

    .line 1453
    :cond_3c
    move-object/from16 v4, v21

    .line 1454
    .line 1455
    if-nez v2, :cond_3e

    .line 1456
    .line 1457
    invoke-interface/range {v24 .. v24}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    :cond_3d
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1462
    .line 1463
    .line 1464
    move-result v2

    .line 1465
    if-eqz v2, :cond_3e

    .line 1466
    .line 1467
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v2

    .line 1471
    check-cast v2, La/dre0;

    .line 1472
    .line 1473
    invoke-static {v10, v2}, La/two;->e(La/xgy;La/dre0;)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v3

    .line 1477
    if-nez v3, :cond_3d

    .line 1478
    .line 1479
    invoke-static {v2, v4}, La/two;->h(La/dre0;La/vtb;)La/k0o;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v3

    .line 1483
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    goto :goto_29

    .line 1487
    :cond_3e
    move-object v11, v1

    .line 1488
    :goto_2a
    return-object v11

    .line 1489
    :pswitch_5
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 1490
    .line 1491
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v2

    .line 1495
    if-eqz v2, :cond_43

    .line 1496
    .line 1497
    sget-object v3, La/j24;->f:La/c5k;

    .line 1498
    .line 1499
    sget-object v4, La/j24;->a:[La/iiy;

    .line 1500
    .line 1501
    const/16 v5, 0xe

    .line 1502
    .line 1503
    aget-object v4, v4, v5

    .line 1504
    .line 1505
    invoke-virtual {v3, v4, v2}, La/c5k;->m(La/iiy;Ljava/lang/Object;)Z

    .line 1506
    .line 1507
    .line 1508
    move-result v3

    .line 1509
    if-nez v3, :cond_3f

    .line 1510
    .line 1511
    goto :goto_2c

    .line 1512
    :cond_3f
    iget-object v3, v2, La/qpy;->n:La/fqy;

    .line 1513
    .line 1514
    const/16 v4, 0xc

    .line 1515
    .line 1516
    if-eqz v3, :cond_40

    .line 1517
    .line 1518
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v1

    .line 1522
    invoke-virtual {v0}, La/vgy;->d()La/nzs0;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v0

    .line 1526
    const/4 v2, 0x0

    .line 1527
    invoke-static {v3, v1, v0, v2, v4}, La/jwb;->Z(La/fqy;Ljava/lang/ClassLoader;La/nzs0;Lkotlin/jvm/functions/Function0;I)La/v2;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v11

    .line 1531
    goto :goto_2d

    .line 1532
    :cond_40
    iget-object v3, v2, La/qpy;->f:Ljava/util/ArrayList;

    .line 1533
    .line 1534
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v3

    .line 1538
    const/4 v5, 0x0

    .line 1539
    const/4 v9, 0x0

    .line 1540
    :cond_41
    :goto_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1541
    .line 1542
    .line 1543
    move-result v6

    .line 1544
    if-eqz v6, :cond_44

    .line 1545
    .line 1546
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v6

    .line 1550
    move-object v7, v6

    .line 1551
    check-cast v7, La/dqy;

    .line 1552
    .line 1553
    iget-object v8, v7, La/dqy;->b:Ljava/lang/String;

    .line 1554
    .line 1555
    iget-object v10, v2, La/qpy;->m:Ljava/lang/String;

    .line 1556
    .line 1557
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v8

    .line 1561
    if-eqz v8, :cond_41

    .line 1562
    .line 1563
    iget-object v8, v7, La/dqy;->h:Ljava/util/ArrayList;

    .line 1564
    .line 1565
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1566
    .line 1567
    .line 1568
    move-result v8

    .line 1569
    if-eqz v8, :cond_41

    .line 1570
    .line 1571
    iget-object v7, v7, La/dqy;->f:La/fqy;

    .line 1572
    .line 1573
    if-nez v7, :cond_41

    .line 1574
    .line 1575
    if-nez v9, :cond_42

    .line 1576
    .line 1577
    move-object v5, v6

    .line 1578
    const/4 v9, 0x1

    .line 1579
    goto :goto_2b

    .line 1580
    :cond_42
    const-string v0, "Collection contains more than one matching element."

    .line 1581
    .line 1582
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1583
    .line 1584
    .line 1585
    :cond_43
    :goto_2c
    const/4 v11, 0x0

    .line 1586
    goto :goto_2d

    .line 1587
    :cond_44
    if-eqz v9, :cond_46

    .line 1588
    .line 1589
    check-cast v5, La/dqy;

    .line 1590
    .line 1591
    iget-object v2, v5, La/dqy;->j:La/fqy;

    .line 1592
    .line 1593
    if-eqz v2, :cond_45

    .line 1594
    .line 1595
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    invoke-virtual {v0}, La/vgy;->d()La/nzs0;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    const/4 v3, 0x0

    .line 1604
    invoke-static {v2, v1, v0, v3, v4}, La/jwb;->Z(La/fqy;Ljava/lang/ClassLoader;La/nzs0;Lkotlin/jvm/functions/Function0;I)La/v2;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v11

    .line 1608
    goto :goto_2d

    .line 1609
    :cond_45
    const/4 v3, 0x0

    .line 1610
    const-string v0, "returnType"

    .line 1611
    .line 1612
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1613
    .line 1614
    .line 1615
    throw v3

    .line 1616
    :cond_46
    const-string v0, "Collection contains no element matching the predicate."

    .line 1617
    .line 1618
    invoke-static {v0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 1619
    .line 1620
    .line 1621
    goto :goto_2c

    .line 1622
    :goto_2d
    return-object v11

    .line 1623
    :pswitch_6
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 1624
    .line 1625
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v2

    .line 1629
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    if-eqz v0, :cond_48

    .line 1634
    .line 1635
    iget-object v0, v0, La/qpy;->l:Ljava/util/ArrayList;

    .line 1636
    .line 1637
    new-instance v1, Ljava/util/ArrayList;

    .line 1638
    .line 1639
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    :cond_47
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1647
    .line 1648
    .line 1649
    move-result v3

    .line 1650
    if-eqz v3, :cond_4e

    .line 1651
    .line 1652
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v3

    .line 1656
    check-cast v3, Ljava/lang/String;

    .line 1657
    .line 1658
    const/4 v4, 0x0

    .line 1659
    invoke-static {v2, v3, v4}, La/jwb;->R(Ljava/lang/ClassLoader;Ljava/lang/String;Z)La/sgy;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v3

    .line 1663
    if-eqz v3, :cond_47

    .line 1664
    .line 1665
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1666
    .line 1667
    .line 1668
    goto :goto_2e

    .line 1669
    :cond_48
    invoke-static {v1}, La/zdx;->E(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1674
    .line 1675
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1676
    .line 1677
    .line 1678
    move-result v0

    .line 1679
    if-eqz v0, :cond_4d

    .line 1680
    .line 1681
    invoke-static {}, La/zdx;->D()La/f7u;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    iget-object v0, v0, La/f7u;->c:Ljava/lang/Object;

    .line 1686
    .line 1687
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1688
    .line 1689
    if-nez v0, :cond_49

    .line 1690
    .line 1691
    const/4 v0, 0x0

    .line 1692
    goto :goto_2f

    .line 1693
    :cond_49
    const/4 v2, 0x0

    .line 1694
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1699
    .line 1700
    .line 1701
    check-cast v0, [Ljava/lang/Class;

    .line 1702
    .line 1703
    :goto_2f
    if-eqz v0, :cond_4a

    .line 1704
    .line 1705
    new-instance v11, Ljava/util/ArrayList;

    .line 1706
    .line 1707
    array-length v1, v0

    .line 1708
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1709
    .line 1710
    .line 1711
    array-length v1, v0

    .line 1712
    const/4 v9, 0x0

    .line 1713
    :goto_30
    if-ge v9, v1, :cond_4b

    .line 1714
    .line 1715
    aget-object v2, v0, v9

    .line 1716
    .line 1717
    invoke-static {v2}, La/azw;->M(Ljava/lang/Class;)La/sgy;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1722
    .line 1723
    .line 1724
    add-int/lit8 v9, v9, 0x1

    .line 1725
    .line 1726
    goto :goto_30

    .line 1727
    :cond_4a
    const/4 v11, 0x0

    .line 1728
    :cond_4b
    if-nez v11, :cond_4c

    .line 1729
    .line 1730
    sget-object v1, La/iun;->a:La/iun;

    .line 1731
    .line 1732
    goto :goto_31

    .line 1733
    :cond_4c
    move-object v1, v11

    .line 1734
    goto :goto_31

    .line 1735
    :cond_4d
    sget-object v1, La/iun;->a:La/iun;

    .line 1736
    .line 1737
    :cond_4e
    :goto_31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1738
    .line 1739
    .line 1740
    return-object v1

    .line 1741
    :pswitch_7
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 1742
    .line 1743
    const-class v3, Ljava/lang/Object;

    .line 1744
    .line 1745
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v4

    .line 1749
    if-eqz v4, :cond_4f

    .line 1750
    .line 1751
    sget-object v11, La/iun;->a:La/iun;

    .line 1752
    .line 1753
    goto/16 :goto_4a

    .line 1754
    .line 1755
    :cond_4f
    sget-boolean v4, La/aao0;->a:Z

    .line 1756
    .line 1757
    if-eqz v4, :cond_58

    .line 1758
    .line 1759
    invoke-virtual {v0}, La/vgy;->b()La/wm40;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v1

    .line 1763
    invoke-interface {v1}, La/foc;->h()La/iys0;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v1

    .line 1767
    invoke-interface {v1}, La/iys0;->b()Ljava/util/Collection;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v1

    .line 1771
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1772
    .line 1773
    .line 1774
    new-instance v2, Ljava/util/ArrayList;

    .line 1775
    .line 1776
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1777
    .line 1778
    .line 1779
    move-result v3

    .line 1780
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1781
    .line 1782
    .line 1783
    check-cast v1, Ljava/lang/Iterable;

    .line 1784
    .line 1785
    iget-object v3, v0, La/vgy;->q:La/xgy;

    .line 1786
    .line 1787
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v1

    .line 1791
    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1792
    .line 1793
    .line 1794
    move-result v4

    .line 1795
    if-eqz v4, :cond_50

    .line 1796
    .line 1797
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v4

    .line 1801
    check-cast v4, La/wsy;

    .line 1802
    .line 1803
    new-instance v5, La/wdk;

    .line 1804
    .line 1805
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1806
    .line 1807
    .line 1808
    new-instance v6, La/nsr;

    .line 1809
    .line 1810
    const/16 v7, 0x14

    .line 1811
    .line 1812
    invoke-direct {v6, v4, v3, v7}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1813
    .line 1814
    .line 1815
    const/4 v7, 0x0

    .line 1816
    invoke-direct {v5, v4, v6, v7}, La/wdk;-><init>(La/wsy;Lkotlin/jvm/functions/Function0;Z)V

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1820
    .line 1821
    .line 1822
    goto :goto_32

    .line 1823
    :cond_50
    invoke-virtual {v0}, La/vgy;->b()La/wm40;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v0

    .line 1827
    if-eqz v0, :cond_57

    .line 1828
    .line 1829
    sget-object v1, La/ary;->e:La/g950;

    .line 1830
    .line 1831
    sget-object v1, La/i4m0;->a:La/twq;

    .line 1832
    .line 1833
    invoke-static {v0, v1}, La/ary;->b(La/wm40;La/twq;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v1

    .line 1837
    if-nez v1, :cond_56

    .line 1838
    .line 1839
    sget-object v1, La/i4m0;->b:La/twq;

    .line 1840
    .line 1841
    invoke-static {v0, v1}, La/ary;->b(La/wm40;La/twq;)Z

    .line 1842
    .line 1843
    .line 1844
    move-result v0

    .line 1845
    if-eqz v0, :cond_51

    .line 1846
    .line 1847
    goto :goto_36

    .line 1848
    :cond_51
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1849
    .line 1850
    .line 1851
    move-result v0

    .line 1852
    if-eqz v0, :cond_52

    .line 1853
    .line 1854
    goto :goto_35

    .line 1855
    :cond_52
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    :cond_53
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v1

    .line 1863
    if-eqz v1, :cond_55

    .line 1864
    .line 1865
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    check-cast v1, La/kiy;

    .line 1870
    .line 1871
    invoke-interface {v1}, La/kiy;->o()La/fhy;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v1

    .line 1875
    instance-of v3, v1, La/xgy;

    .line 1876
    .line 1877
    if-eqz v3, :cond_54

    .line 1878
    .line 1879
    check-cast v1, La/xgy;

    .line 1880
    .line 1881
    goto :goto_34

    .line 1882
    :cond_54
    const/4 v1, 0x0

    .line 1883
    :goto_34
    if-eqz v1, :cond_56

    .line 1884
    .line 1885
    invoke-virtual {v1}, La/xgy;->V()La/rlc;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v3

    .line 1889
    sget-object v4, La/rlc;->c:La/rlc;

    .line 1890
    .line 1891
    if-eq v3, v4, :cond_53

    .line 1892
    .line 1893
    invoke-virtual {v1}, La/xgy;->V()La/rlc;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v1

    .line 1897
    sget-object v3, La/rlc;->f:La/rlc;

    .line 1898
    .line 1899
    if-ne v1, v3, :cond_56

    .line 1900
    .line 1901
    goto :goto_33

    .line 1902
    :cond_55
    :goto_35
    sget-object v0, La/g4m0;->a:La/kiy;

    .line 1903
    .line 1904
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1905
    .line 1906
    .line 1907
    :cond_56
    :goto_36
    invoke-static {v2}, La/d5c;->I(Ljava/util/ArrayList;)Ljava/util/List;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v11

    .line 1911
    goto/16 :goto_4a

    .line 1912
    .line 1913
    :cond_57
    const/16 v0, 0x6b

    .line 1914
    .line 1915
    invoke-static {v0}, La/ary;->a(I)V

    .line 1916
    .line 1917
    .line 1918
    const/4 v2, 0x0

    .line 1919
    throw v2

    .line 1920
    :cond_58
    new-instance v4, Ljava/util/ArrayList;

    .line 1921
    .line 1922
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v0}, La/vgy;->c()La/qpy;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v5

    .line 1929
    if-eqz v5, :cond_59

    .line 1930
    .line 1931
    iget-object v5, v5, La/qpy;->d:Ljava/util/ArrayList;

    .line 1932
    .line 1933
    goto :goto_37

    .line 1934
    :cond_59
    const/4 v5, 0x0

    .line 1935
    :goto_37
    if-eqz v5, :cond_62

    .line 1936
    .line 1937
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v2

    .line 1941
    :goto_38
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1942
    .line 1943
    .line 1944
    move-result v3

    .line 1945
    const/4 v5, 0x3

    .line 1946
    if-eqz v3, :cond_5d

    .line 1947
    .line 1948
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v3

    .line 1952
    check-cast v3, La/fqy;

    .line 1953
    .line 1954
    invoke-virtual {v3}, La/fqy;->a()La/x8x;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v6

    .line 1958
    instance-of v7, v6, La/rpy;

    .line 1959
    .line 1960
    if-eqz v7, :cond_5a

    .line 1961
    .line 1962
    check-cast v6, La/rpy;

    .line 1963
    .line 1964
    goto :goto_39

    .line 1965
    :cond_5a
    const/4 v6, 0x0

    .line 1966
    :goto_39
    if-eqz v6, :cond_5c

    .line 1967
    .line 1968
    iget-object v6, v6, La/rpy;->a:Ljava/lang/String;

    .line 1969
    .line 1970
    if-eqz v6, :cond_5c

    .line 1971
    .line 1972
    invoke-static {v6}, La/jwb;->V(Ljava/lang/String;)La/qlc;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v6

    .line 1976
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v7

    .line 1980
    const/4 v8, 0x0

    .line 1981
    invoke-static {v7, v6, v8}, La/xtt0;->l(Ljava/lang/ClassLoader;La/qlc;I)Ljava/lang/Class;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v7

    .line 1985
    if-eqz v7, :cond_5b

    .line 1986
    .line 1987
    invoke-static {v1}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v8

    .line 1991
    invoke-virtual {v0}, La/vgy;->d()La/nzs0;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v9

    .line 1995
    new-instance v11, La/kch;

    .line 1996
    .line 1997
    invoke-direct {v11, v10, v7, v6, v5}, La/kch;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1998
    .line 1999
    .line 2000
    const/4 v5, 0x4

    .line 2001
    invoke-static {v3, v8, v9, v11, v5}, La/jwb;->Z(La/fqy;Ljava/lang/ClassLoader;La/nzs0;Lkotlin/jvm/functions/Function0;I)La/v2;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v3

    .line 2005
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2006
    .line 2007
    .line 2008
    goto :goto_38

    .line 2009
    :cond_5b
    const-string v0, "Unsupported superclass of "

    .line 2010
    .line 2011
    const-string v1, ": "

    .line 2012
    .line 2013
    invoke-static {v0, v10, v1, v6}, La/udk;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2014
    .line 2015
    .line 2016
    const/4 v11, 0x0

    .line 2017
    goto/16 :goto_4a

    .line 2018
    .line 2019
    :cond_5c
    new-instance v0, La/poe;

    .line 2020
    .line 2021
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2022
    .line 2023
    const-string v2, "Supertype of "

    .line 2024
    .line 2025
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2026
    .line 2027
    .line 2028
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v3}, La/fqy;->a()La/x8x;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v2

    .line 2035
    const-string v3, " not a class: "

    .line 2036
    .line 2037
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2041
    .line 2042
    .line 2043
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v1

    .line 2047
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 2048
    .line 2049
    .line 2050
    throw v0

    .line 2051
    :cond_5d
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 2052
    .line 2053
    .line 2054
    move-result v2

    .line 2055
    if-eqz v2, :cond_5e

    .line 2056
    .line 2057
    sget-object v2, La/g4m0;->c:La/kiy;

    .line 2058
    .line 2059
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2060
    .line 2061
    .line 2062
    :cond_5e
    invoke-static {v1}, La/bqe0;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v2

    .line 2066
    if-nez v2, :cond_5f

    .line 2067
    .line 2068
    move-object v2, v1

    .line 2069
    :cond_5f
    const-class v3, Ljava/io/Serializable;

    .line 2070
    .line 2071
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2072
    .line 2073
    .line 2074
    move-result v2

    .line 2075
    if-eqz v2, :cond_60

    .line 2076
    .line 2077
    sget-object v2, La/g4m0;->d:La/kiy;

    .line 2078
    .line 2079
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2080
    .line 2081
    .line 2082
    move-result v3

    .line 2083
    if-nez v3, :cond_60

    .line 2084
    .line 2085
    iget-object v0, v0, La/vgy;->g:La/mre0;

    .line 2086
    .line 2087
    sget-object v3, La/vgy;->r:[La/iiy;

    .line 2088
    .line 2089
    aget-object v3, v3, v5

    .line 2090
    .line 2091
    invoke-virtual {v0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v0

    .line 2095
    check-cast v0, Ljava/lang/String;

    .line 2096
    .line 2097
    if-eqz v0, :cond_60

    .line 2098
    .line 2099
    const-string v3, "kotlin."

    .line 2100
    .line 2101
    const/4 v7, 0x0

    .line 2102
    invoke-static {v0, v3, v7}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2103
    .line 2104
    .line 2105
    move-result v0

    .line 2106
    const/4 v3, 0x1

    .line 2107
    if-ne v0, v3, :cond_60

    .line 2108
    .line 2109
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 2110
    .line 2111
    .line 2112
    move-result v0

    .line 2113
    if-nez v0, :cond_61

    .line 2114
    .line 2115
    sget-object v0, La/bay;->a:Ljava/lang/String;

    .line 2116
    .line 2117
    invoke-virtual {v10}, La/xgy;->U()La/qlc;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2122
    .line 2123
    .line 2124
    sget-object v1, La/bay;->n:Ljava/util/LinkedHashSet;

    .line 2125
    .line 2126
    invoke-virtual {v0}, La/qlc;->a()La/swq;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v0

    .line 2130
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v0

    .line 2134
    if-eqz v0, :cond_60

    .line 2135
    .line 2136
    goto :goto_3b

    .line 2137
    :cond_60
    :goto_3a
    const/4 v9, 0x0

    .line 2138
    goto/16 :goto_46

    .line 2139
    .line 2140
    :cond_61
    :goto_3b
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2141
    .line 2142
    .line 2143
    goto :goto_3a

    .line 2144
    :cond_62
    invoke-virtual {v10}, La/xgy;->getAnnotations()Ljava/util/List;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v0

    .line 2148
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v0

    .line 2152
    :cond_63
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2153
    .line 2154
    .line 2155
    move-result v5

    .line 2156
    if-eqz v5, :cond_64

    .line 2157
    .line 2158
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v5

    .line 2162
    move-object v6, v5

    .line 2163
    check-cast v6, Ljava/lang/annotation/Annotation;

    .line 2164
    .line 2165
    instance-of v6, v6, La/f9d0;

    .line 2166
    .line 2167
    if-eqz v6, :cond_63

    .line 2168
    .line 2169
    goto :goto_3c

    .line 2170
    :cond_64
    const/4 v5, 0x0

    .line 2171
    :goto_3c
    check-cast v5, La/f9d0;

    .line 2172
    .line 2173
    if-eqz v5, :cond_66

    .line 2174
    .line 2175
    invoke-interface {v5}, La/f9d0;->value()Ljava/lang/String;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v0

    .line 2179
    if-eqz v0, :cond_66

    .line 2180
    .line 2181
    new-instance v5, La/swq;

    .line 2182
    .line 2183
    invoke-direct {v5, v0}, La/swq;-><init>(Ljava/lang/String;)V

    .line 2184
    .line 2185
    .line 2186
    iget-object v0, v5, La/swq;->a:La/twq;

    .line 2187
    .line 2188
    invoke-virtual {v0}, La/twq;->c()Z

    .line 2189
    .line 2190
    .line 2191
    move-result v6

    .line 2192
    if-nez v6, :cond_65

    .line 2193
    .line 2194
    sget-object v6, La/j4m0;->k:La/g950;

    .line 2195
    .line 2196
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2197
    .line 2198
    .line 2199
    invoke-virtual {v0, v6}, La/twq;->h(La/g950;)Z

    .line 2200
    .line 2201
    .line 2202
    move-result v0

    .line 2203
    if-eqz v0, :cond_65

    .line 2204
    .line 2205
    goto :goto_3d

    .line 2206
    :cond_65
    const/4 v5, 0x0

    .line 2207
    :goto_3d
    if-eqz v5, :cond_66

    .line 2208
    .line 2209
    new-instance v0, La/qlc;

    .line 2210
    .line 2211
    invoke-virtual {v5}, La/swq;->b()La/swq;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v6

    .line 2215
    iget-object v5, v5, La/swq;->a:La/twq;

    .line 2216
    .line 2217
    invoke-virtual {v5}, La/twq;->g()La/g950;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v5

    .line 2221
    invoke-direct {v0, v6, v5}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 2222
    .line 2223
    .line 2224
    goto :goto_3e

    .line 2225
    :cond_66
    const/4 v0, 0x0

    .line 2226
    :goto_3e
    if-nez v0, :cond_67

    .line 2227
    .line 2228
    sget-object v5, La/uwo;->a:Ljava/util/LinkedHashMap;

    .line 2229
    .line 2230
    invoke-virtual {v10}, La/xgy;->U()La/qlc;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v5

    .line 2234
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2235
    .line 2236
    .line 2237
    sget-object v6, La/uwo;->a:Ljava/util/LinkedHashMap;

    .line 2238
    .line 2239
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v5

    .line 2243
    check-cast v5, La/qlc;

    .line 2244
    .line 2245
    if-nez v5, :cond_68

    .line 2246
    .line 2247
    :goto_3f
    const/4 v2, 0x0

    .line 2248
    const/4 v9, 0x0

    .line 2249
    goto/16 :goto_43

    .line 2250
    .line 2251
    :cond_67
    move-object v5, v0

    .line 2252
    :cond_68
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v6

    .line 2256
    invoke-static {v6}, La/bqe0;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v6

    .line 2260
    const/4 v8, 0x0

    .line 2261
    invoke-static {v6, v5, v8}, La/xtt0;->l(Ljava/lang/ClassLoader;La/qlc;I)Ljava/lang/Class;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v5

    .line 2265
    if-nez v5, :cond_69

    .line 2266
    .line 2267
    goto :goto_3f

    .line 2268
    :cond_69
    invoke-static {v5}, La/tke;->Q(Ljava/lang/Class;)Ljava/util/List;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v6

    .line 2272
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 2273
    .line 2274
    .line 2275
    move-result v6

    .line 2276
    invoke-virtual {v10}, La/xgy;->getTypeParameters()Ljava/util/List;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v8

    .line 2280
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2281
    .line 2282
    .line 2283
    move-result v9

    .line 2284
    if-ne v9, v6, :cond_6b

    .line 2285
    .line 2286
    new-instance v0, Ljava/util/ArrayList;

    .line 2287
    .line 2288
    invoke-static {v8, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2289
    .line 2290
    .line 2291
    move-result v6

    .line 2292
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2293
    .line 2294
    .line 2295
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v6

    .line 2299
    :goto_40
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2300
    .line 2301
    .line 2302
    move-result v7

    .line 2303
    if-eqz v7, :cond_6a

    .line 2304
    .line 2305
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v7

    .line 2309
    check-cast v7, La/miy;

    .line 2310
    .line 2311
    sget-object v8, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    .line 2312
    .line 2313
    const/4 v9, 0x0

    .line 2314
    invoke-static {v7, v9, v2}, La/x2x;->N(La/fhy;Ljava/util/List;I)La/v2;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v7

    .line 2318
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2319
    .line 2320
    .line 2321
    invoke-static {v7}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v7

    .line 2325
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2326
    .line 2327
    .line 2328
    goto :goto_40

    .line 2329
    :cond_6a
    const/4 v9, 0x0

    .line 2330
    goto :goto_42

    .line 2331
    :cond_6b
    const/4 v7, 0x1

    .line 2332
    if-ne v9, v7, :cond_6d

    .line 2333
    .line 2334
    if-le v6, v7, :cond_6d

    .line 2335
    .line 2336
    if-nez v0, :cond_6d

    .line 2337
    .line 2338
    sget-object v0, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    .line 2339
    .line 2340
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v7

    .line 2344
    check-cast v7, La/fhy;

    .line 2345
    .line 2346
    const/4 v9, 0x0

    .line 2347
    invoke-static {v7, v9, v2}, La/x2x;->N(La/fhy;Ljava/util/List;I)La/v2;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v2

    .line 2351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2352
    .line 2353
    .line 2354
    invoke-static {v2}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v0

    .line 2358
    new-instance v2, Ljava/util/ArrayList;

    .line 2359
    .line 2360
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 2361
    .line 2362
    .line 2363
    const/4 v7, 0x0

    .line 2364
    :goto_41
    if-ge v7, v6, :cond_6c

    .line 2365
    .line 2366
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2367
    .line 2368
    .line 2369
    add-int/lit8 v7, v7, 0x1

    .line 2370
    .line 2371
    goto :goto_41

    .line 2372
    :cond_6c
    move-object v0, v2

    .line 2373
    :goto_42
    sget-object v2, La/sre0;->a:La/tre0;

    .line 2374
    .line 2375
    invoke-virtual {v2, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v2

    .line 2379
    const/4 v7, 0x0

    .line 2380
    invoke-static {v5, v2, v0, v7}, La/tke;->S(Ljava/lang/reflect/Type;La/fhy;Ljava/util/List;Z)La/iyj0;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v2

    .line 2384
    invoke-static {v2, v5}, La/tke;->T(La/iyj0;Ljava/lang/reflect/Type;)La/iyj0;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v0

    .line 2388
    if-eqz v0, :cond_6e

    .line 2389
    .line 2390
    move-object v2, v0

    .line 2391
    goto :goto_43

    .line 2392
    :cond_6d
    const/4 v9, 0x0

    .line 2393
    move-object v2, v9

    .line 2394
    :cond_6e
    :goto_43
    new-instance v0, La/jdg0;

    .line 2395
    .line 2396
    const/4 v5, 0x2

    .line 2397
    invoke-direct {v0, v5}, La/jdg0;-><init>(I)V

    .line 2398
    .line 2399
    .line 2400
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v5

    .line 2404
    invoke-virtual {v0, v5}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 2405
    .line 2406
    .line 2407
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 2408
    .line 2409
    .line 2410
    move-result-object v1

    .line 2411
    invoke-virtual {v0, v1}, La/jdg0;->b(Ljava/lang/Object;)V

    .line 2412
    .line 2413
    .line 2414
    iget-object v0, v0, La/jdg0;->b:Ljava/util/ArrayList;

    .line 2415
    .line 2416
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 2417
    .line 2418
    .line 2419
    move-result v1

    .line 2420
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 2421
    .line 2422
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v0

    .line 2426
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v0

    .line 2430
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v0

    .line 2434
    :cond_6f
    :goto_44
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2435
    .line 2436
    .line 2437
    move-result v1

    .line 2438
    if-eqz v1, :cond_72

    .line 2439
    .line 2440
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v1

    .line 2444
    move-object v10, v1

    .line 2445
    check-cast v10, Ljava/lang/reflect/Type;

    .line 2446
    .line 2447
    if-eqz v10, :cond_6f

    .line 2448
    .line 2449
    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2450
    .line 2451
    .line 2452
    move-result v1

    .line 2453
    if-nez v1, :cond_6f

    .line 2454
    .line 2455
    if-eqz v2, :cond_70

    .line 2456
    .line 2457
    iget-object v1, v2, La/iyj0;->b:La/fhy;

    .line 2458
    .line 2459
    goto :goto_45

    .line 2460
    :cond_70
    move-object v1, v9

    .line 2461
    :goto_45
    invoke-virtual {v10, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2462
    .line 2463
    .line 2464
    move-result v1

    .line 2465
    if-eqz v1, :cond_71

    .line 2466
    .line 2467
    goto :goto_44

    .line 2468
    :cond_71
    sget-object v11, La/lun;->a:La/lun;

    .line 2469
    .line 2470
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2471
    .line 2472
    .line 2473
    sget-object v12, La/gzs0;->a:La/gzs0;

    .line 2474
    .line 2475
    sget-object v15, La/c0t0;->a:La/c0t0;

    .line 2476
    .line 2477
    const/16 v16, 0xc

    .line 2478
    .line 2479
    const/4 v13, 0x0

    .line 2480
    const/4 v14, 0x0

    .line 2481
    invoke-static/range {v10 .. v16}, La/tke;->j0(Ljava/lang/reflect/Type;Ljava/util/Map;La/gzs0;ZZLa/c0t0;I)La/kiy;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v1

    .line 2485
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2486
    .line 2487
    .line 2488
    goto :goto_44

    .line 2489
    :cond_72
    if-eqz v2, :cond_73

    .line 2490
    .line 2491
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2492
    .line 2493
    .line 2494
    :cond_73
    :goto_46
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2495
    .line 2496
    .line 2497
    move-result v0

    .line 2498
    if-eqz v0, :cond_74

    .line 2499
    .line 2500
    goto :goto_49

    .line 2501
    :cond_74
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2502
    .line 2503
    .line 2504
    move-result-object v0

    .line 2505
    :cond_75
    :goto_47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2506
    .line 2507
    .line 2508
    move-result v1

    .line 2509
    if-eqz v1, :cond_77

    .line 2510
    .line 2511
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v1

    .line 2515
    check-cast v1, La/kiy;

    .line 2516
    .line 2517
    invoke-interface {v1}, La/kiy;->o()La/fhy;

    .line 2518
    .line 2519
    .line 2520
    move-result-object v1

    .line 2521
    instance-of v2, v1, La/xgy;

    .line 2522
    .line 2523
    if-eqz v2, :cond_76

    .line 2524
    .line 2525
    move-object v2, v1

    .line 2526
    check-cast v2, La/xgy;

    .line 2527
    .line 2528
    goto :goto_48

    .line 2529
    :cond_76
    move-object v2, v9

    .line 2530
    :goto_48
    if-eqz v2, :cond_78

    .line 2531
    .line 2532
    invoke-virtual {v2}, La/xgy;->V()La/rlc;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v1

    .line 2536
    sget-object v3, La/rlc;->c:La/rlc;

    .line 2537
    .line 2538
    if-eq v1, v3, :cond_75

    .line 2539
    .line 2540
    invoke-virtual {v2}, La/xgy;->V()La/rlc;

    .line 2541
    .line 2542
    .line 2543
    move-result-object v1

    .line 2544
    sget-object v2, La/rlc;->f:La/rlc;

    .line 2545
    .line 2546
    if-ne v1, v2, :cond_78

    .line 2547
    .line 2548
    goto :goto_47

    .line 2549
    :cond_77
    :goto_49
    sget-object v0, La/g4m0;->a:La/kiy;

    .line 2550
    .line 2551
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2552
    .line 2553
    .line 2554
    :cond_78
    invoke-static {v4}, La/d5c;->I(Ljava/util/ArrayList;)Ljava/util/List;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v11

    .line 2558
    :goto_4a
    return-object v11

    .line 2559
    :pswitch_8
    move-object v9, v11

    .line 2560
    iget-object v1, v10, La/xgy;->b:Ljava/lang/Class;

    .line 2561
    .line 2562
    sget-boolean v3, La/aao0;->c:Z

    .line 2563
    .line 2564
    if-eqz v3, :cond_7b

    .line 2565
    .line 2566
    invoke-virtual {v1, v6}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 2567
    .line 2568
    .line 2569
    move-result-object v0

    .line 2570
    check-cast v0, Lkotlin/Metadata;

    .line 2571
    .line 2572
    if-eqz v0, :cond_7a

    .line 2573
    .line 2574
    sget-object v1, La/scd;->a:Ljava/util/LinkedHashSet;

    .line 2575
    .line 2576
    invoke-virtual {v10}, La/xgy;->U()La/qlc;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v2

    .line 2580
    invoke-virtual {v2}, La/qlc;->e()La/qlc;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v2

    .line 2584
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 2585
    .line 2586
    .line 2587
    move-result v1

    .line 2588
    if-nez v1, :cond_7a

    .line 2589
    .line 2590
    invoke-static {v0}, La/d9x;->R(Lkotlin/Metadata;)La/e9x;

    .line 2591
    .line 2592
    .line 2593
    move-result-object v0

    .line 2594
    instance-of v1, v0, La/dry;

    .line 2595
    .line 2596
    if-eqz v1, :cond_79

    .line 2597
    .line 2598
    move-object v2, v0

    .line 2599
    check-cast v2, La/dry;

    .line 2600
    .line 2601
    goto :goto_4b

    .line 2602
    :cond_79
    move-object v2, v9

    .line 2603
    :goto_4b
    if-eqz v2, :cond_7f

    .line 2604
    .line 2605
    iget-object v11, v2, La/dry;->a:La/qpy;

    .line 2606
    .line 2607
    goto/16 :goto_4f

    .line 2608
    .line 2609
    :cond_7a
    invoke-virtual {v10}, La/xgy;->U()La/qlc;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v0

    .line 2613
    invoke-static {v0}, La/md9;->b(La/qlc;)La/qpy;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v11

    .line 2617
    goto/16 :goto_4f

    .line 2618
    .line 2619
    :cond_7b
    invoke-virtual {v0}, La/vgy;->b()La/wm40;

    .line 2620
    .line 2621
    .line 2622
    move-result-object v0

    .line 2623
    instance-of v3, v0, La/ier;

    .line 2624
    .line 2625
    const/16 v4, 0x8

    .line 2626
    .line 2627
    const/16 v5, 0x9

    .line 2628
    .line 2629
    if-eqz v3, :cond_80

    .line 2630
    .line 2631
    move-object v1, v0

    .line 2632
    check-cast v1, La/ier;

    .line 2633
    .line 2634
    iget-object v3, v1, La/ier;->g:La/wer;

    .line 2635
    .line 2636
    instance-of v6, v3, La/ser;

    .line 2637
    .line 2638
    if-eqz v6, :cond_7e

    .line 2639
    .line 2640
    iget v0, v1, La/ier;->h:I

    .line 2641
    .line 2642
    sget-object v1, La/md9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2643
    .line 2644
    new-instance v11, La/qpy;

    .line 2645
    .line 2646
    invoke-direct {v11}, La/qpy;-><init>()V

    .line 2647
    .line 2648
    .line 2649
    const-string v1, "kotlin/Function"

    .line 2650
    .line 2651
    invoke-static {v0, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v3

    .line 2655
    iput-object v3, v11, La/qpy;->b:Ljava/lang/String;

    .line 2656
    .line 2657
    sget-object v3, La/rlc;->c:La/rlc;

    .line 2658
    .line 2659
    sget-object v6, La/j24;->a:[La/iiy;

    .line 2660
    .line 2661
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2662
    .line 2663
    .line 2664
    sget-object v6, La/j24;->d:La/pmi;

    .line 2665
    .line 2666
    sget-object v7, La/j24;->a:[La/iiy;

    .line 2667
    .line 2668
    aget-object v5, v7, v5

    .line 2669
    .line 2670
    invoke-virtual {v6, v11, v5, v3}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2671
    .line 2672
    .line 2673
    sget-object v3, La/fm40;->d:La/fm40;

    .line 2674
    .line 2675
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2676
    .line 2677
    .line 2678
    sget-object v5, La/j24;->b:La/pmi;

    .line 2679
    .line 2680
    aget-object v2, v7, v2

    .line 2681
    .line 2682
    invoke-virtual {v5, v11, v2, v3}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2683
    .line 2684
    .line 2685
    sget-object v2, La/nuu0;->e:La/nuu0;

    .line 2686
    .line 2687
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2688
    .line 2689
    .line 2690
    sget-object v3, La/j24;->c:La/pmi;

    .line 2691
    .line 2692
    aget-object v4, v7, v4

    .line 2693
    .line 2694
    invoke-virtual {v3, v11, v4, v2}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2695
    .line 2696
    .line 2697
    iget-object v2, v11, La/qpy;->c:Ljava/util/ArrayList;

    .line 2698
    .line 2699
    const/4 v3, 0x1

    .line 2700
    if-gt v3, v0, :cond_7d

    .line 2701
    .line 2702
    const/4 v3, 0x1

    .line 2703
    :goto_4c
    new-instance v4, La/hqy;

    .line 2704
    .line 2705
    const-string v5, "P"

    .line 2706
    .line 2707
    invoke-static {v3, v5}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 2708
    .line 2709
    .line 2710
    move-result-object v5

    .line 2711
    sget-object v6, La/kqy;->b:La/kqy;

    .line 2712
    .line 2713
    const/4 v7, 0x0

    .line 2714
    invoke-direct {v4, v7, v5, v3, v6}, La/hqy;-><init>(ILjava/lang/String;ILa/kqy;)V

    .line 2715
    .line 2716
    .line 2717
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2718
    .line 2719
    .line 2720
    if-eq v3, v0, :cond_7c

    .line 2721
    .line 2722
    add-int/lit8 v3, v3, 0x1

    .line 2723
    .line 2724
    goto :goto_4c

    .line 2725
    :cond_7c
    const/16 v22, 0x1

    .line 2726
    .line 2727
    goto :goto_4d

    .line 2728
    :cond_7d
    move/from16 v22, v3

    .line 2729
    .line 2730
    :goto_4d
    add-int/lit8 v0, v0, 0x1

    .line 2731
    .line 2732
    new-instance v3, La/hqy;

    .line 2733
    .line 2734
    const-string v4, "R"

    .line 2735
    .line 2736
    sget-object v5, La/kqy;->c:La/kqy;

    .line 2737
    .line 2738
    const/4 v7, 0x0

    .line 2739
    invoke-direct {v3, v7, v4, v0, v5}, La/hqy;-><init>(ILjava/lang/String;ILa/kqy;)V

    .line 2740
    .line 2741
    .line 2742
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2743
    .line 2744
    .line 2745
    new-instance v2, La/fqy;

    .line 2746
    .line 2747
    invoke-direct {v2, v7}, La/fqy;-><init>(I)V

    .line 2748
    .line 2749
    .line 2750
    new-instance v3, La/rpy;

    .line 2751
    .line 2752
    invoke-direct {v3, v1}, La/rpy;-><init>(Ljava/lang/String;)V

    .line 2753
    .line 2754
    .line 2755
    iput-object v3, v2, La/fqy;->b:La/x8x;

    .line 2756
    .line 2757
    sget-object v1, La/kqy;->a:La/kqy;

    .line 2758
    .line 2759
    new-instance v3, La/fqy;

    .line 2760
    .line 2761
    invoke-direct {v3, v7}, La/fqy;-><init>(I)V

    .line 2762
    .line 2763
    .line 2764
    new-instance v4, La/tpy;

    .line 2765
    .line 2766
    invoke-direct {v4, v0}, La/tpy;-><init>(I)V

    .line 2767
    .line 2768
    .line 2769
    iput-object v4, v3, La/fqy;->b:La/x8x;

    .line 2770
    .line 2771
    new-instance v0, La/iqy;

    .line 2772
    .line 2773
    invoke-direct {v0, v1, v3}, La/iqy;-><init>(La/kqy;La/fqy;)V

    .line 2774
    .line 2775
    .line 2776
    iget-object v1, v2, La/fqy;->c:Ljava/util/ArrayList;

    .line 2777
    .line 2778
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2779
    .line 2780
    .line 2781
    iget-object v0, v11, La/qpy;->d:Ljava/util/ArrayList;

    .line 2782
    .line 2783
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2784
    .line 2785
    .line 2786
    goto/16 :goto_4f

    .line 2787
    .line 2788
    :cond_7e
    const-string v1, "Unsupported function type kind: "

    .line 2789
    .line 2790
    const-string v2, " ("

    .line 2791
    .line 2792
    invoke-static {v1, v3, v2, v0}, La/c99;->u(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2793
    .line 2794
    .line 2795
    :cond_7f
    move-object v11, v9

    .line 2796
    goto/16 :goto_4f

    .line 2797
    .line 2798
    :cond_80
    const-class v3, Ljava/lang/Cloneable;

    .line 2799
    .line 2800
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2801
    .line 2802
    .line 2803
    move-result v1

    .line 2804
    if-eqz v1, :cond_81

    .line 2805
    .line 2806
    sget-object v0, La/md9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2807
    .line 2808
    new-instance v11, La/qpy;

    .line 2809
    .line 2810
    invoke-direct {v11}, La/qpy;-><init>()V

    .line 2811
    .line 2812
    .line 2813
    const-string v0, "kotlin/Cloneable"

    .line 2814
    .line 2815
    iput-object v0, v11, La/qpy;->b:Ljava/lang/String;

    .line 2816
    .line 2817
    sget-object v0, La/rlc;->c:La/rlc;

    .line 2818
    .line 2819
    sget-object v1, La/j24;->a:[La/iiy;

    .line 2820
    .line 2821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2822
    .line 2823
    .line 2824
    sget-object v1, La/j24;->d:La/pmi;

    .line 2825
    .line 2826
    sget-object v3, La/j24;->a:[La/iiy;

    .line 2827
    .line 2828
    aget-object v5, v3, v5

    .line 2829
    .line 2830
    invoke-virtual {v1, v11, v5, v0}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2831
    .line 2832
    .line 2833
    sget-object v0, La/fm40;->d:La/fm40;

    .line 2834
    .line 2835
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2836
    .line 2837
    .line 2838
    sget-object v1, La/j24;->b:La/pmi;

    .line 2839
    .line 2840
    aget-object v2, v3, v2

    .line 2841
    .line 2842
    invoke-virtual {v1, v11, v2, v0}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2843
    .line 2844
    .line 2845
    sget-object v0, La/nuu0;->e:La/nuu0;

    .line 2846
    .line 2847
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2848
    .line 2849
    .line 2850
    sget-object v1, La/j24;->c:La/pmi;

    .line 2851
    .line 2852
    aget-object v2, v3, v4

    .line 2853
    .line 2854
    invoke-virtual {v1, v11, v2, v0}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2855
    .line 2856
    .line 2857
    new-instance v0, La/bqy;

    .line 2858
    .line 2859
    const-string v1, "clone"

    .line 2860
    .line 2861
    const/4 v7, 0x0

    .line 2862
    invoke-direct {v0, v7, v1}, La/bqy;-><init>(ILjava/lang/String;)V

    .line 2863
    .line 2864
    .line 2865
    sget-object v1, La/fm40;->c:La/fm40;

    .line 2866
    .line 2867
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2868
    .line 2869
    .line 2870
    sget-object v2, La/j24;->i:La/pmi;

    .line 2871
    .line 2872
    const/16 v4, 0x17

    .line 2873
    .line 2874
    aget-object v4, v3, v4

    .line 2875
    .line 2876
    invoke-virtual {v2, v0, v4, v1}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2877
    .line 2878
    .line 2879
    sget-object v1, La/nuu0;->d:La/nuu0;

    .line 2880
    .line 2881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2882
    .line 2883
    .line 2884
    sget-object v2, La/j24;->h:La/pmi;

    .line 2885
    .line 2886
    const/16 v4, 0x16

    .line 2887
    .line 2888
    aget-object v3, v3, v4

    .line 2889
    .line 2890
    invoke-virtual {v2, v0, v3, v1}, La/pmi;->I(Ljava/lang/Object;La/iiy;Ljava/lang/Enum;)V

    .line 2891
    .line 2892
    .line 2893
    new-instance v1, La/fqy;

    .line 2894
    .line 2895
    const/4 v7, 0x0

    .line 2896
    invoke-direct {v1, v7}, La/fqy;-><init>(I)V

    .line 2897
    .line 2898
    .line 2899
    new-instance v2, La/rpy;

    .line 2900
    .line 2901
    const-string v3, "kotlin/Any"

    .line 2902
    .line 2903
    invoke-direct {v2, v3}, La/rpy;-><init>(Ljava/lang/String;)V

    .line 2904
    .line 2905
    .line 2906
    iput-object v2, v1, La/fqy;->b:La/x8x;

    .line 2907
    .line 2908
    iput-object v1, v0, La/bqy;->h:La/fqy;

    .line 2909
    .line 2910
    iget-object v1, v11, La/qpy;->e:Ljava/util/ArrayList;

    .line 2911
    .line 2912
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2913
    .line 2914
    .line 2915
    goto :goto_4f

    .line 2916
    :cond_81
    instance-of v1, v0, La/ffk;

    .line 2917
    .line 2918
    if-eqz v1, :cond_82

    .line 2919
    .line 2920
    move-object v2, v0

    .line 2921
    check-cast v2, La/ffk;

    .line 2922
    .line 2923
    goto :goto_4e

    .line 2924
    :cond_82
    move-object v2, v9

    .line 2925
    :goto_4e
    if-eqz v2, :cond_7f

    .line 2926
    .line 2927
    iget-object v0, v2, La/ffk;->e:La/s2d0;

    .line 2928
    .line 2929
    iget-object v1, v2, La/ffk;->l:La/g45;

    .line 2930
    .line 2931
    iget-object v1, v1, La/g45;->b:Ljava/lang/Object;

    .line 2932
    .line 2933
    check-cast v1, La/h950;

    .line 2934
    .line 2935
    const/4 v2, 0x6

    .line 2936
    const/4 v7, 0x0

    .line 2937
    invoke-static {v0, v1, v7, v2}, La/m8x;->o0(La/s2d0;La/h950;ZI)La/qpy;

    .line 2938
    .line 2939
    .line 2940
    move-result-object v11

    .line 2941
    :goto_4f
    return-object v11

    .line 2942
    nop

    .line 2943
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
