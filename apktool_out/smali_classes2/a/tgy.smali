.class public final La/tgy;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/xgy;


# direct methods
.method public synthetic constructor <init>(La/xgy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tgy;->a:B

    iput-object p1, p0, La/tgy;->b:La/xgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/xgy;La/vgy;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/tgy;->a:B

    iput-object p1, p0, La/tgy;->b:La/xgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/tgy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/tgy;->b:La/xgy;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, La/xgy;->U()La/qlc;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-boolean v0, p0, La/qlc;->c:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, La/qlc;->a()La/swq;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 35
    .line 36
    iget-object v4, p0, La/twq;->a:Ljava/lang/String;

    .line 37
    .line 38
    :goto_0
    return-object v4

    .line 39
    :pswitch_0
    iget-object v0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p0}, La/xgy;->U()La/qlc;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-boolean v1, p0, La/qlc;->c:Z

    .line 53
    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/16 v2, 0x24

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p0, v0, p0}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {p0, v0, p0}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->n0(Ljava/lang/String;C)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    invoke-virtual {p0}, La/qlc;->f()La/g950;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, La/g950;->b()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    :goto_1
    return-object v4

    .line 139
    :pswitch_1
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    array-length v6, v0

    .line 150
    array-length v5, v5

    .line 151
    if-eq v6, v5, :cond_d

    .line 152
    .line 153
    new-instance v5, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 159
    .line 160
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    move-object v0, p0

    .line 164
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    array-length v7, v3

    .line 169
    sub-int/2addr v7, v1

    .line 170
    :goto_2
    if-ge v2, v7, :cond_c

    .line 171
    .line 172
    aget-object v8, v3, v7

    .line 173
    .line 174
    sget-object v9, La/xgy;->d:Ljava/util/HashSet;

    .line 175
    .line 176
    invoke-static {v8}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-nez v9, :cond_b

    .line 193
    .line 194
    const-string v9, "value"

    .line 195
    .line 196
    if-eq v0, p0, :cond_7

    .line 197
    .line 198
    sget-object v10, La/xtt0;->a:La/swq;

    .line 199
    .line 200
    invoke-static {v8}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    const-class v11, Ljava/lang/annotation/Inherited;

    .line 209
    .line 210
    invoke-virtual {v10, v11}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    if-eqz v10, :cond_b

    .line 215
    .line 216
    invoke-static {v8}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-static {v10}, La/xtt0;->j(La/sgy;)Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-eqz v10, :cond_7

    .line 225
    .line 226
    invoke-static {v8}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    invoke-virtual {v10, v9, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    invoke-virtual {v10}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sget-object v12, La/sre0;->a:La/tre0;

    .line 250
    .line 251
    invoke-virtual {v12, v10}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    invoke-virtual {v10, v11}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    if-eqz v10, :cond_b

    .line 264
    .line 265
    :cond_7
    sget-object v10, La/xtt0;->a:La/swq;

    .line 266
    .line 267
    invoke-static {v8}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    invoke-static {v10}, La/xtt0;->j(La/sgy;)Z

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    if-eqz v11, :cond_8

    .line 276
    .line 277
    invoke-static {v10}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-virtual {v10, v9, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    invoke-virtual {v9}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    sget-object v10, La/sre0;->a:La/tre0;

    .line 297
    .line 298
    invoke-virtual {v10, v9}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    :cond_8
    invoke-virtual {v6, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    check-cast v9, Ljava/lang/Class;

    .line 307
    .line 308
    if-nez v9, :cond_9

    .line 309
    .line 310
    invoke-interface {v6, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    :cond_9
    if-eqz v9, :cond_a

    .line 314
    .line 315
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v9

    .line 319
    if-eqz v9, :cond_b

    .line 320
    .line 321
    :cond_a
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    :cond_b
    add-int/lit8 v7, v7, -0x1

    .line 325
    .line 326
    goto/16 :goto_2

    .line 327
    .line 328
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-nez v0, :cond_6

    .line 333
    .line 334
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    goto :goto_4

    .line 339
    :cond_d
    new-instance p0, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    array-length v1, v0

    .line 345
    :goto_3
    if-ge v3, v1, :cond_f

    .line 346
    .line 347
    aget-object v2, v0, v3

    .line 348
    .line 349
    sget-object v4, La/xgy;->d:Ljava/util/HashSet;

    .line 350
    .line 351
    invoke-static {v2}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    invoke-static {v5}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-nez v4, :cond_e

    .line 368
    .line 369
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_f
    :goto_4
    invoke-static {p0}, La/xtt0;->t(Ljava/util/List;)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :pswitch_2
    invoke-virtual {p0}, La/xgy;->U()La/qlc;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-object v1, p0, La/xgy;->b:Ljava/lang/Class;

    .line 385
    .line 386
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 387
    .line 388
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    check-cast p0, La/vgy;

    .line 393
    .line 394
    iget-object p0, p0, La/hhy;->a:La/mre0;

    .line 395
    .line 396
    sget-object v5, La/hhy;->b:[La/iiy;

    .line 397
    .line 398
    aget-object v3, v5, v3

    .line 399
    .line 400
    invoke-virtual {p0}, La/mre0;->invoke()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    check-cast p0, La/pog0;

    .line 408
    .line 409
    iget-object v3, p0, La/pog0;->a:La/f6i;

    .line 410
    .line 411
    iget-object v5, v3, La/f6i;->f:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v5, La/ym40;

    .line 414
    .line 415
    iget-boolean v6, v0, La/qlc;->c:Z

    .line 416
    .line 417
    if-eqz v6, :cond_10

    .line 418
    .line 419
    const-class v6, Lkotlin/Metadata;

    .line 420
    .line 421
    invoke-virtual {v1, v6}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    if-eqz v6, :cond_10

    .line 426
    .line 427
    iget-object v3, v3, La/f6i;->d:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v3, La/nlc;

    .line 430
    .line 431
    sget-object v5, La/nlc;->c:Ljava/util/Set;

    .line 432
    .line 433
    invoke-virtual {v3, v0, v4}, La/nlc;->a(La/qlc;La/glc;)La/wm40;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    goto :goto_5

    .line 438
    :cond_10
    invoke-static {v5, v0}, La/obb;->V(La/ym40;La/qlc;)La/wm40;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    :goto_5
    if-nez v3, :cond_14

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Class;->isSynthetic()Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_11

    .line 449
    .line 450
    invoke-static {v0, p0}, La/xgy;->T(La/qlc;La/pog0;)La/llc;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    goto :goto_8

    .line 455
    :cond_11
    invoke-static {v1}, La/zvw;->N(Ljava/lang/Class;)La/jre0;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    if-eqz v3, :cond_12

    .line 460
    .line 461
    iget-object v3, v3, La/jre0;->b:La/cry;

    .line 462
    .line 463
    iget-object v3, v3, La/cry;->c:Ljava/io/Serializable;

    .line 464
    .line 465
    check-cast v3, La/bry;

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_12
    move-object v3, v4

    .line 469
    :goto_6
    if-nez v3, :cond_13

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_13
    sget-object v2, La/wgy;->a:[I

    .line 473
    .line 474
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    aget v2, v2, v5

    .line 479
    .line 480
    :goto_7
    const-string v5, " (kind = "

    .line 481
    .line 482
    packed-switch v2, :pswitch_data_1

    .line 483
    .line 484
    .line 485
    :pswitch_3
    invoke-static {}, La/t9f;->b()V

    .line 486
    .line 487
    .line 488
    goto :goto_8

    .line 489
    :pswitch_4
    const-string p0, "Unknown class: "

    .line 490
    .line 491
    invoke-static {p0, v1, v5, v3}, La/c99;->u(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    goto :goto_8

    .line 495
    :pswitch_5
    invoke-static {v0, p0}, La/xgy;->T(La/qlc;La/pog0;)La/llc;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    goto :goto_8

    .line 500
    :pswitch_6
    const-string p0, "Unresolved class: "

    .line 501
    .line 502
    invoke-static {p0, v1, v5, v3}, La/c99;->u(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_14
    move-object v4, v3

    .line 507
    :goto_8
    return-object v4

    .line 508
    :pswitch_7
    iget-object p0, p0, La/xgy;->b:Ljava/lang/Class;

    .line 509
    .line 510
    const-class v0, Ljava/lang/Iterable;

    .line 511
    .line 512
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-nez v0, :cond_16

    .line 517
    .line 518
    const-class v0, Ljava/util/Map;

    .line 519
    .line 520
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-nez v0, :cond_16

    .line 525
    .line 526
    const-class v0, Ljava/lang/CharSequence;

    .line 527
    .line 528
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-nez v0, :cond_16

    .line 533
    .line 534
    const-class v0, Ljava/lang/Number;

    .line 535
    .line 536
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 537
    .line 538
    .line 539
    move-result p0

    .line 540
    if-eqz p0, :cond_15

    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_15
    move v1, v3

    .line 544
    :cond_16
    :goto_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    return-object p0

    .line 549
    :pswitch_8
    new-instance v0, La/vgy;

    .line 550
    .line 551
    invoke-direct {v0, p0}, La/vgy;-><init>(La/xgy;)V

    .line 552
    .line 553
    .line 554
    return-object v0

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_6
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method
