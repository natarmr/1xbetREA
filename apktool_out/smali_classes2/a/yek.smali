.class public final La/yek;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ffk;


# direct methods
.method public synthetic constructor <init>(La/ffk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yek;->a:B

    iput-object p1, p0, La/yek;->b:La/ffk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/yek;->a:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/yek;->b:La/ffk;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {v4}, La/nsm0;->o(La/goc;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object p0, v4, La/ffk;->l:La/g45;

    .line 19
    .line 20
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/f6i;

    .line 23
    .line 24
    iget-object p0, p0, La/f6i;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/m83;

    .line 27
    .line 28
    iget-object v0, v4, La/ffk;->u:La/p4d0;

    .line 29
    .line 30
    invoke-interface {p0, v0}, La/w83;->b(La/p4d0;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_1
    iget-object v8, p0, La/yek;->b:La/ffk;

    .line 40
    .line 41
    invoke-virtual {v8}, La/ffk;->isInline()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_0

    .line 46
    .line 47
    invoke-virtual {v8}, La/ffk;->r0()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    iget-object p0, v8, La/ffk;->f:La/e28;

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    invoke-virtual {p0, v3, v0, v3}, La/e28;->a(III)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    iget-object v0, v8, La/ffk;->e:La/s2d0;

    .line 63
    .line 64
    iget-object v1, v8, La/ffk;->l:La/g45;

    .line 65
    .line 66
    iget-object v2, v1, La/g45;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, La/h950;

    .line 69
    .line 70
    iget-object v4, v1, La/g45;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, La/roi0;

    .line 73
    .line 74
    iget-object v1, v1, La/g45;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/qgd;

    .line 77
    .line 78
    new-instance v6, La/y6h;

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    const/16 v13, 0x17

    .line 82
    .line 83
    const/4 v7, 0x1

    .line 84
    const-class v9, La/ffk;

    .line 85
    .line 86
    const-string v10, "getValueClassPropertyType"

    .line 87
    .line 88
    const-string v11, "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;"

    .line 89
    .line 90
    invoke-direct/range {v6 .. v13}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v7, v0, La/s2d0;->z:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_3

    .line 120
    .line 121
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, La/p2d0;

    .line 126
    .line 127
    iget v9, v9, La/p2d0;->c:I

    .line 128
    .line 129
    invoke-static {v2, v9}, La/ydx;->K(La/h950;I)La/qlc;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    iget-object v10, v9, La/qlc;->b:La/swq;

    .line 134
    .line 135
    iget-object v10, v10, La/swq;->a:La/twq;

    .line 136
    .line 137
    iget-object v10, v10, La/twq;->a:Ljava/lang/String;

    .line 138
    .line 139
    const-string v11, "JvmInline"

    .line 140
    .line 141
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-eqz v10, :cond_2

    .line 146
    .line 147
    iget-object v9, v9, La/qlc;->a:La/swq;

    .line 148
    .line 149
    iget-object v9, v9, La/swq;->a:La/twq;

    .line 150
    .line 151
    iget-object v9, v9, La/twq;->a:Ljava/lang/String;

    .line 152
    .line 153
    const-string v10, "kotlin.jvm"

    .line 154
    .line 155
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_2

    .line 160
    .line 161
    :cond_3
    :goto_0
    iget v7, v0, La/s2d0;->c:I

    .line 162
    .line 163
    const/16 v9, 0x8

    .line 164
    .line 165
    and-int/2addr v7, v9

    .line 166
    if-ne v7, v9, :cond_9

    .line 167
    .line 168
    iget v7, v0, La/s2d0;->w:I

    .line 169
    .line 170
    invoke-interface {v2, v7}, La/h950;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v7}, La/g950;->d(Ljava/lang/String;)La/g950;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    iget v9, v0, La/s2d0;->c:I

    .line 179
    .line 180
    and-int/lit8 v10, v9, 0x10

    .line 181
    .line 182
    const/16 v11, 0x10

    .line 183
    .line 184
    if-ne v10, v11, :cond_4

    .line 185
    .line 186
    iget-object v4, v0, La/s2d0;->x:La/a4d0;

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    const/16 v10, 0x20

    .line 190
    .line 191
    and-int/2addr v9, v10

    .line 192
    if-ne v9, v10, :cond_5

    .line 193
    .line 194
    iget v9, v0, La/s2d0;->y:I

    .line 195
    .line 196
    invoke-virtual {v4, v9}, La/roi0;->c(I)La/a4d0;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    goto :goto_1

    .line 201
    :cond_5
    move-object v4, v5

    .line 202
    :goto_1
    if-eqz v4, :cond_6

    .line 203
    .line 204
    invoke-virtual {v1, v4, v3}, La/qgd;->Z(La/a4d0;Z)La/kzj0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-nez v1, :cond_7

    .line 209
    .line 210
    :cond_6
    invoke-virtual {v6, v7}, La/y6h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, La/dcg0;

    .line 215
    .line 216
    if-eqz v1, :cond_8

    .line 217
    .line 218
    :cond_7
    new-instance v0, La/cdx;

    .line 219
    .line 220
    invoke-direct {v0, v7, v1}, La/cdx;-><init>(La/g950;La/dcg0;)V

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_8
    iget p0, v0, La/s2d0;->e:I

    .line 225
    .line 226
    invoke-interface {v2, p0}, La/h950;->getString(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-static {p0}, La/g950;->d(Ljava/lang/String;)La/g950;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v1, "cannot determine underlying type for value class "

    .line 237
    .line 238
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string p0, " with property "

    .line 245
    .line 246
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v0

    .line 266
    :cond_9
    move-object v0, v5

    .line 267
    :goto_2
    if-eqz v0, :cond_a

    .line 268
    .line 269
    move-object v5, v0

    .line 270
    goto :goto_3

    .line 271
    :cond_a
    if-nez p0, :cond_d

    .line 272
    .line 273
    invoke-virtual {v8}, La/ffk;->m0()La/flc;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    if-eqz p0, :cond_c

    .line 278
    .line 279
    invoke-virtual {p0}, La/oer;->z()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    check-cast p0, La/k3u0;

    .line 291
    .line 292
    invoke-virtual {p0}, La/wjj;->getName()La/g950;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8, p0}, La/ffk;->v0(La/g950;)La/kzj0;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    if-eqz v0, :cond_b

    .line 304
    .line 305
    new-instance v5, La/cdx;

    .line 306
    .line 307
    invoke-direct {v5, p0, v0}, La/cdx;-><init>(La/g950;La/dcg0;)V

    .line 308
    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_b
    const-string p0, "Value class has no underlying property: "

    .line 312
    .line 313
    invoke-static {v8, p0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_c
    const-string p0, "Inline class has no primary constructor: "

    .line 318
    .line 319
    invoke-static {v8, p0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_d
    :goto_3
    return-object v5

    .line 323
    :pswitch_2
    iget-object p0, v4, La/ffk;->i:La/gm40;

    .line 324
    .line 325
    sget-object v0, La/gm40;->c:La/gm40;

    .line 326
    .line 327
    if-eq p0, v0, :cond_e

    .line 328
    .line 329
    sget-object p0, La/iun;->a:La/iun;

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_e
    iget-object v6, v4, La/ffk;->e:La/s2d0;

    .line 333
    .line 334
    iget-object v6, v6, La/s2d0;->u:Ljava/util/List;

    .line 335
    .line 336
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-nez v7, :cond_10

    .line 344
    .line 345
    new-instance p0, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    :cond_f
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_13

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Ljava/lang/Integer;

    .line 365
    .line 366
    iget-object v2, v4, La/ffk;->l:La/g45;

    .line 367
    .line 368
    iget-object v3, v2, La/g45;->a:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v3, La/f6i;

    .line 371
    .line 372
    iget-object v2, v2, La/g45;->b:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, La/h950;

    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    invoke-static {v2, v1}, La/ydx;->K(La/h950;I)La/qlc;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    iget-object v2, v3, La/f6i;->d:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v2, La/nlc;

    .line 390
    .line 391
    sget-object v3, La/nlc;->c:Ljava/util/Set;

    .line 392
    .line 393
    invoke-virtual {v2, v1, v5}, La/nlc;->a(La/qlc;La/glc;)La/wm40;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    if-eqz v1, :cond_f

    .line 398
    .line 399
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    goto :goto_4

    .line 403
    :cond_10
    if-eq p0, v0, :cond_11

    .line 404
    .line 405
    sget-object p0, La/iun;->a:La/iun;

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_11
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 409
    .line 410
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 411
    .line 412
    .line 413
    iget-object v0, v4, La/ffk;->q:La/vjj;

    .line 414
    .line 415
    instance-of v5, v0, La/mg80;

    .line 416
    .line 417
    if-eqz v5, :cond_12

    .line 418
    .line 419
    check-cast v0, La/mg80;

    .line 420
    .line 421
    invoke-interface {v0}, La/mg80;->y()La/cr30;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-static {v4, p0, v0, v2}, La/vdb;->X(La/wm40;Ljava/util/LinkedHashSet;La/cr30;Z)V

    .line 426
    .line 427
    .line 428
    :cond_12
    invoke-virtual {v4}, La/h1;->j0()La/cr30;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-static {v4, p0, v0, v3}, La/vdb;->X(La/wm40;Ljava/util/LinkedHashSet;La/cr30;Z)V

    .line 433
    .line 434
    .line 435
    new-instance v0, La/vt5;

    .line 436
    .line 437
    invoke-direct {v0, v1}, La/vt5;-><init>(B)V

    .line 438
    .line 439
    .line 440
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    :cond_13
    :goto_5
    return-object p0

    .line 445
    :pswitch_3
    iget-object p0, v4, La/ffk;->e:La/s2d0;

    .line 446
    .line 447
    iget v0, p0, La/s2d0;->c:I

    .line 448
    .line 449
    const/4 v1, 0x4

    .line 450
    and-int/2addr v0, v1

    .line 451
    if-ne v0, v1, :cond_14

    .line 452
    .line 453
    iget-object v0, v4, La/ffk;->l:La/g45;

    .line 454
    .line 455
    iget-object v0, v0, La/g45;->b:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v0, La/h950;

    .line 458
    .line 459
    iget p0, p0, La/s2d0;->f:I

    .line 460
    .line 461
    invoke-static {v0, p0}, La/ydx;->L(La/h950;I)La/g950;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {v4}, La/ffk;->u0()La/cfk;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    sget-object v1, La/ux50;->g:La/ux50;

    .line 470
    .line 471
    invoke-virtual {v0, p0, v1}, La/cfk;->d(La/g950;La/ux50;)La/foc;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    instance-of v0, p0, La/wm40;

    .line 476
    .line 477
    if-eqz v0, :cond_14

    .line 478
    .line 479
    move-object v5, p0

    .line 480
    check-cast v5, La/wm40;

    .line 481
    .line 482
    :cond_14
    return-object v5

    .line 483
    :pswitch_4
    iget-object p0, v4, La/ffk;->l:La/g45;

    .line 484
    .line 485
    iget-object v0, v4, La/ffk;->e:La/s2d0;

    .line 486
    .line 487
    iget-object v0, v0, La/s2d0;->p:Ljava/util/List;

    .line 488
    .line 489
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    :cond_15
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-eqz v5, :cond_16

    .line 502
    .line 503
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    move-object v6, v5

    .line 508
    check-cast v6, La/v2d0;

    .line 509
    .line 510
    sget-object v7, La/njq;->n:La/kjq;

    .line 511
    .line 512
    iget v6, v6, La/v2d0;->d:I

    .line 513
    .line 514
    invoke-virtual {v7, v6}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    if-eqz v6, :cond_15

    .line 523
    .line 524
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    goto :goto_6

    .line 528
    :cond_16
    new-instance v0, Ljava/util/ArrayList;

    .line 529
    .line 530
    invoke-static {v3, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    if-eqz v3, :cond_17

    .line 546
    .line 547
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    check-cast v3, La/v2d0;

    .line 552
    .line 553
    iget-object v5, p0, La/g45;->i:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v5, La/xq30;

    .line 556
    .line 557
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v5, v3, v2}, La/xq30;->e(La/v2d0;Z)La/xek;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    goto :goto_7

    .line 568
    :cond_17
    invoke-virtual {v4}, La/ffk;->m0()La/flc;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-static {v1}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast p0, La/f6i;

    .line 583
    .line 584
    iget-object p0, p0, La/f6i;->p:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast p0, La/fx;

    .line 587
    .line 588
    invoke-interface {p0, v4}, La/fx;->a(La/wm40;)Ljava/util/Collection;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    check-cast p0, Ljava/lang/Iterable;

    .line 593
    .line 594
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 595
    .line 596
    .line 597
    move-result-object p0

    .line 598
    return-object p0

    .line 599
    :pswitch_5
    iget-object v7, p0, La/yek;->b:La/ffk;

    .line 600
    .line 601
    iget-object p0, v7, La/ffk;->k:La/slc;

    .line 602
    .line 603
    invoke-virtual {p0}, La/slc;->a()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-eqz v0, :cond_20

    .line 608
    .line 609
    new-instance v6, La/lck;

    .line 610
    .line 611
    sget-object v9, La/ujn;->c:La/f93;

    .line 612
    .line 613
    const/4 v10, 0x1

    .line 614
    const/4 v11, 0x1

    .line 615
    const/4 v8, 0x0

    .line 616
    sget-object v12, La/gmk0;->x0:La/gne0;

    .line 617
    .line 618
    invoke-direct/range {v6 .. v12}, La/flc;-><init>(La/wm40;La/x4e;La/g93;ZILa/gmk0;)V

    .line 619
    .line 620
    .line 621
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 622
    .line 623
    sget v1, La/oek;->a:I

    .line 624
    .line 625
    sget-object v1, La/slc;->c:La/slc;

    .line 626
    .line 627
    if-eq p0, v1, :cond_1e

    .line 628
    .line 629
    invoke-virtual {p0}, La/slc;->a()Z

    .line 630
    .line 631
    .line 632
    move-result p0

    .line 633
    if-eqz p0, :cond_18

    .line 634
    .line 635
    goto :goto_8

    .line 636
    :cond_18
    invoke-static {v7}, La/oek;->p(La/vjj;)Z

    .line 637
    .line 638
    .line 639
    move-result p0

    .line 640
    if-eqz p0, :cond_1a

    .line 641
    .line 642
    sget-object p0, La/uek;->a:La/tek;

    .line 643
    .line 644
    if-eqz p0, :cond_19

    .line 645
    .line 646
    goto :goto_9

    .line 647
    :cond_19
    const/16 p0, 0x33

    .line 648
    .line 649
    invoke-static {p0}, La/oek;->a(I)V

    .line 650
    .line 651
    .line 652
    throw v5

    .line 653
    :cond_1a
    invoke-static {v7}, La/oek;->k(La/vjj;)Z

    .line 654
    .line 655
    .line 656
    move-result p0

    .line 657
    if-eqz p0, :cond_1c

    .line 658
    .line 659
    sget-object p0, La/uek;->k:La/tek;

    .line 660
    .line 661
    if-eqz p0, :cond_1b

    .line 662
    .line 663
    goto :goto_9

    .line 664
    :cond_1b
    const/16 p0, 0x34

    .line 665
    .line 666
    invoke-static {p0}, La/oek;->a(I)V

    .line 667
    .line 668
    .line 669
    throw v5

    .line 670
    :cond_1c
    sget-object p0, La/uek;->e:La/tek;

    .line 671
    .line 672
    if-eqz p0, :cond_1d

    .line 673
    .line 674
    goto :goto_9

    .line 675
    :cond_1d
    const/16 p0, 0x35

    .line 676
    .line 677
    invoke-static {p0}, La/oek;->a(I)V

    .line 678
    .line 679
    .line 680
    throw v5

    .line 681
    :cond_1e
    :goto_8
    sget-object p0, La/uek;->a:La/tek;

    .line 682
    .line 683
    if-eqz p0, :cond_1f

    .line 684
    .line 685
    :goto_9
    invoke-virtual {v6, v0, p0}, La/flc;->C1(Ljava/util/List;La/tek;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v7}, La/h1;->I()La/kzj0;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    iput-object p0, v6, La/oer;->h:La/wsy;

    .line 693
    .line 694
    move-object v5, v6

    .line 695
    goto :goto_b

    .line 696
    :cond_1f
    const/16 p0, 0x31

    .line 697
    .line 698
    invoke-static {p0}, La/oek;->a(I)V

    .line 699
    .line 700
    .line 701
    throw v5

    .line 702
    :cond_20
    iget-object p0, v7, La/ffk;->e:La/s2d0;

    .line 703
    .line 704
    iget-object p0, p0, La/s2d0;->p:Ljava/util/List;

    .line 705
    .line 706
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 710
    .line 711
    .line 712
    move-result-object p0

    .line 713
    :cond_21
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    if-eqz v0, :cond_22

    .line 718
    .line 719
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    move-object v1, v0

    .line 724
    check-cast v1, La/v2d0;

    .line 725
    .line 726
    sget-object v2, La/njq;->n:La/kjq;

    .line 727
    .line 728
    iget v1, v1, La/v2d0;->d:I

    .line 729
    .line 730
    invoke-virtual {v2, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    if-nez v1, :cond_21

    .line 739
    .line 740
    goto :goto_a

    .line 741
    :cond_22
    move-object v0, v5

    .line 742
    :goto_a
    check-cast v0, La/v2d0;

    .line 743
    .line 744
    if-eqz v0, :cond_23

    .line 745
    .line 746
    iget-object p0, v7, La/ffk;->l:La/g45;

    .line 747
    .line 748
    iget-object p0, p0, La/g45;->i:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast p0, La/xq30;

    .line 751
    .line 752
    invoke-virtual {p0, v0, v3}, La/xq30;->e(La/v2d0;Z)La/xek;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    :cond_23
    :goto_b
    return-object v5

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
