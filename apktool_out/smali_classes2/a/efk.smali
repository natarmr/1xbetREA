.class public final La/efk;
.super La/i1;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final d:La/cu00;

.field public final synthetic e:La/h1;


# direct methods
.method public constructor <init>(La/ffk;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/efk;->c:B

    .line 3
    .line 4
    iput-object p1, p0, La/efk;->e:La/h1;

    .line 5
    .line 6
    iget-object v0, p1, La/ffk;->l:La/g45;

    .line 7
    .line 8
    iget-object v1, v0, La/g45;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/f6i;

    .line 11
    .line 12
    iget-object v1, v1, La/f6i;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/eu00;

    .line 15
    .line 16
    invoke-direct {p0, v1}, La/i1;-><init>(La/eu00;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/f6i;

    .line 22
    .line 23
    iget-object v0, v0, La/f6i;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/eu00;

    .line 26
    .line 27
    new-instance v1, La/yek;

    .line 28
    .line 29
    const/4 v2, 0x6

    .line 30
    invoke-direct {v1, p1, v2}, La/yek;-><init>(La/ffk;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p1, La/cu00;

    .line 37
    .line 38
    invoke-direct {p1, v0, v1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/efk;->d:La/cu00;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(La/l9z;)V
    .locals 3

    const/4 v0, 0x1

    iput-byte v0, p0, La/efk;->c:B

    .line 44
    iput-object p1, p0, La/efk;->e:La/h1;

    .line 45
    iget-object v0, p1, La/l9z;->j:La/f7u;

    .line 46
    iget-object v1, v0, La/f7u;->b:Ljava/lang/Object;

    check-cast v1, La/v7i;

    .line 47
    iget-object v1, v1, La/v7i;->i:Ljava/lang/Object;

    check-cast v1, La/eu00;

    .line 48
    invoke-direct {p0, v1}, La/r5;-><init>(La/eu00;)V

    .line 49
    iget-object v0, v0, La/f7u;->b:Ljava/lang/Object;

    check-cast v0, La/v7i;

    .line 50
    iget-object v0, v0, La/v7i;->i:Ljava/lang/Object;

    check-cast v0, La/eu00;

    .line 51
    new-instance v1, La/k9z;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, La/k9z;-><init>(La/l9z;B)V

    .line 52
    new-instance p1, La/cu00;

    .line 53
    invoke-direct {p1, v0, v1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 54
    iput-object p1, p0, La/efk;->d:La/cu00;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 15

    .line 1
    iget-byte v0, p0, La/efk;->c:B

    .line 2
    .line 3
    iget-object p0, p0, La/efk;->e:La/h1;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/l9z;

    .line 12
    .line 13
    iget-object v6, p0, La/l9z;->j:La/f7u;

    .line 14
    .line 15
    iget-object v0, p0, La/l9z;->h:La/mqe0;

    .line 16
    .line 17
    iget-object v0, v0, La/mqe0;->a:Ljava/lang/Class;

    .line 18
    .line 19
    const-class v3, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x2

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    sget-object v0, La/iun;->a:La/iun;

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    new-instance v4, La/jdg0;

    .line 32
    .line 33
    invoke-direct {v4, v5}, La/jdg0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    if-nez v7, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v3, v7

    .line 44
    :goto_0
    invoke-virtual {v4, v3}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v4, v0}, La/jdg0;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v4, La/jdg0;->b:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    new-array v3, v3, [Ljava/lang/reflect/Type;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ljava/lang/reflect/Type;

    .line 94
    .line 95
    new-instance v7, La/oqe0;

    .line 96
    .line 97
    invoke-direct {v7, v4}, La/oqe0;-><init>(Ljava/lang/reflect/Type;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move-object v0, v3

    .line 105
    :goto_2
    new-instance v9, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    new-instance v10, Ljava/util/ArrayList;

    .line 115
    .line 116
    const/4 v11, 0x0

    .line 117
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iget-object v3, p0, La/l9z;->u:La/j9z;

    .line 121
    .line 122
    sget-object v4, La/bey;->p:La/swq;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v4}, La/j9z;->O0(La/swq;)La/t83;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    const/4 v4, 0x1

    .line 132
    if-nez v3, :cond_4

    .line 133
    .line 134
    :cond_3
    :goto_3
    move-object v5, v2

    .line 135
    goto/16 :goto_8

    .line 136
    .line 137
    :cond_4
    invoke-interface {v3}, La/t83;->c()Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Ljava/lang/Iterable;

    .line 146
    .line 147
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->w0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    instance-of v7, v3, La/htm0;

    .line 152
    .line 153
    if-eqz v7, :cond_5

    .line 154
    .line 155
    check-cast v3, La/htm0;

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_5
    move-object v3, v2

    .line 159
    :goto_4
    if-eqz v3, :cond_3

    .line 160
    .line 161
    iget-object v3, v3, La/r2e;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v3, Ljava/lang/String;

    .line 164
    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    sget-object v7, La/j7m0;->a:La/j7m0;

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    move v12, v11

    .line 175
    :goto_5
    if-ge v12, v8, :cond_d

    .line 176
    .line 177
    invoke-virtual {v3, v12}, Ljava/lang/String;->charAt(I)C

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 182
    .line 183
    .line 184
    move-result v14

    .line 185
    if-eqz v14, :cond_a

    .line 186
    .line 187
    if-eq v14, v4, :cond_8

    .line 188
    .line 189
    if-ne v14, v5, :cond_7

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_14

    .line 196
    .line 197
    :cond_8
    const/16 v14, 0x2e

    .line 198
    .line 199
    if-ne v13, v14, :cond_9

    .line 200
    .line 201
    sget-object v7, La/j7m0;->c:La/j7m0;

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_9
    invoke-static {v13}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-nez v13, :cond_c

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_a
    :goto_6
    invoke-static {v13}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-nez v7, :cond_b

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_b
    sget-object v7, La/j7m0;->b:La/j7m0;

    .line 219
    .line 220
    :cond_c
    :goto_7
    add-int/lit8 v12, v12, 0x1

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_d
    sget-object v5, La/j7m0;->c:La/j7m0;

    .line 224
    .line 225
    if-eq v7, v5, :cond_3

    .line 226
    .line 227
    new-instance v5, La/swq;

    .line 228
    .line 229
    invoke-direct {v5, v3}, La/swq;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_8
    if-eqz v5, :cond_e

    .line 233
    .line 234
    iget-object v3, v5, La/swq;->a:La/twq;

    .line 235
    .line 236
    invoke-virtual {v3}, La/twq;->c()Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-nez v7, :cond_e

    .line 241
    .line 242
    sget-object v7, La/j4m0;->k:La/g950;

    .line 243
    .line 244
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v7}, La/twq;->h(La/g950;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_e

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_e
    move-object v5, v2

    .line 255
    :goto_9
    if-nez v5, :cond_10

    .line 256
    .line 257
    sget-object v3, La/uwo;->a:Ljava/util/LinkedHashMap;

    .line 258
    .line 259
    invoke-static {p0}, La/rek;->g(La/vjj;)La/swq;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    sget-object v7, La/uwo;->b:Ljava/util/Map;

    .line 264
    .line 265
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, La/swq;

    .line 270
    .line 271
    if-nez v3, :cond_11

    .line 272
    .line 273
    :cond_f
    :goto_a
    move-object v12, v2

    .line 274
    goto/16 :goto_e

    .line 275
    .line 276
    :cond_10
    move-object v3, v5

    .line 277
    :cond_11
    iget-object v7, v3, La/swq;->a:La/twq;

    .line 278
    .line 279
    iget-object v8, v6, La/f7u;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v8, La/v7i;

    .line 282
    .line 283
    iget-object v8, v8, La/v7i;->j:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v8, La/zm40;

    .line 286
    .line 287
    sget-object v12, La/ux50;->h:La/ux50;

    .line 288
    .line 289
    sget v13, La/rek;->a:I

    .line 290
    .line 291
    invoke-virtual {v7}, La/twq;->c()Z

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3}, La/swq;->b()La/swq;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v8, v3}, La/zm40;->c0(La/swq;)La/gdz;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    iget-object v3, v3, La/gdz;->h:La/mdz;

    .line 303
    .line 304
    invoke-virtual {v7}, La/twq;->g()La/g950;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-virtual {v3, v7, v12}, La/mdz;->d(La/g950;La/ux50;)La/foc;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    instance-of v7, v3, La/wm40;

    .line 313
    .line 314
    if-eqz v7, :cond_12

    .line 315
    .line 316
    check-cast v3, La/wm40;

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_12
    move-object v3, v2

    .line 320
    :goto_b
    if-nez v3, :cond_13

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_13
    invoke-interface {v3}, La/foc;->h()La/iys0;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    invoke-interface {v7}, La/iys0;->getParameters()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    iget-object v8, p0, La/l9z;->p:La/efk;

    .line 336
    .line 337
    invoke-virtual {v8}, La/efk;->getParameters()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-ne v12, v7, :cond_14

    .line 349
    .line 350
    new-instance v4, Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-static {v8, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v7

    .line 367
    if-eqz v7, :cond_15

    .line 368
    .line 369
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    check-cast v7, La/hzs0;

    .line 374
    .line 375
    new-instance v8, La/q4m0;

    .line 376
    .line 377
    sget-object v12, La/t3u0;->c:La/t3u0;

    .line 378
    .line 379
    invoke-interface {v7}, La/foc;->I()La/kzj0;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    invoke-direct {v8, v7, v12}, La/q4m0;-><init>(La/wsy;La/t3u0;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_14
    if-ne v12, v4, :cond_f

    .line 391
    .line 392
    if-le v7, v4, :cond_f

    .line 393
    .line 394
    if-nez v5, :cond_f

    .line 395
    .line 396
    new-instance v5, La/q4m0;

    .line 397
    .line 398
    sget-object v12, La/t3u0;->c:La/t3u0;

    .line 399
    .line 400
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    check-cast v8, La/hzs0;

    .line 405
    .line 406
    invoke-interface {v8}, La/foc;->I()La/kzj0;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    invoke-direct {v5, v8, v12}, La/q4m0;-><init>(La/wsy;La/t3u0;)V

    .line 411
    .line 412
    .line 413
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 414
    .line 415
    invoke-direct {v8, v4, v7, v4}, Lkotlin/ranges/a;-><init>(III)V

    .line 416
    .line 417
    .line 418
    new-instance v4, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-static {v8, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v8}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    :goto_d
    move-object v8, v7

    .line 432
    check-cast v8, La/kkx;

    .line 433
    .line 434
    iget-boolean v8, v8, La/kkx;->c:Z

    .line 435
    .line 436
    if-eqz v8, :cond_15

    .line 437
    .line 438
    move-object v8, v7

    .line 439
    check-cast v8, La/bkx;

    .line 440
    .line 441
    invoke-virtual {v8}, La/bkx;->nextInt()I

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_d

    .line 448
    :cond_15
    sget-object v5, La/ays0;->b:La/fck0;

    .line 449
    .line 450
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    sget-object v5, La/ays0;->c:La/ays0;

    .line 454
    .line 455
    invoke-static {v5, v3, v4}, La/ucx;->f0(La/ays0;La/wm40;Ljava/util/List;)La/kzj0;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    move-object v12, v3

    .line 460
    :goto_e
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    :cond_16
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-eqz v3, :cond_1b

    .line 469
    .line 470
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    move-object v13, v3

    .line 475
    check-cast v13, La/oqe0;

    .line 476
    .line 477
    iget-object v3, v6, La/f7u;->e:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v3, La/nvu;

    .line 480
    .line 481
    sget-object v4, La/b0t0;->a:La/b0t0;

    .line 482
    .line 483
    const/4 v5, 0x7

    .line 484
    invoke-static {v4, v11, v2, v5}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    invoke-virtual {v3, v13, v4}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 489
    .line 490
    .line 491
    move-result-object v14

    .line 492
    iget-object v3, v6, La/f7u;->b:Ljava/lang/Object;

    .line 493
    .line 494
    new-instance v3, La/huj0;

    .line 495
    .line 496
    sget-object v7, La/x83;->e:La/x83;

    .line 497
    .line 498
    const/4 v4, 0x0

    .line 499
    const/4 v5, 0x0

    .line 500
    const/4 v8, 0x1

    .line 501
    invoke-direct/range {v3 .. v8}, La/huj0;-><init>(La/e83;ZLa/f7u;La/x83;Z)V

    .line 502
    .line 503
    .line 504
    sget-object v4, La/iun;->a:La/iun;

    .line 505
    .line 506
    invoke-virtual {v3, v14, v4, v2, v11}, La/q8a;->L(La/aty;Ljava/util/List;La/pys0;Z)La/g5;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v14}, La/wsy;->j0()La/tft0;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-static {v4, v3, v11, v8}, La/tqt;->b(La/tft0;La/g5;IZ)La/y78;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    iget-object v3, v3, La/y78;->c:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v3, La/wsy;

    .line 521
    .line 522
    if-nez v3, :cond_17

    .line 523
    .line 524
    goto :goto_10

    .line 525
    :cond_17
    move-object v14, v3

    .line 526
    :goto_10
    invoke-virtual {v14}, La/wsy;->S()La/iys0;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-interface {v3}, La/iys0;->n()La/foc;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    instance-of v3, v3, La/m660;

    .line 535
    .line 536
    if-eqz v3, :cond_18

    .line 537
    .line 538
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    :cond_18
    invoke-virtual {v14}, La/wsy;->S()La/iys0;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    if-eqz v12, :cond_19

    .line 546
    .line 547
    invoke-virtual {v12}, La/wsy;->S()La/iys0;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    goto :goto_11

    .line 552
    :cond_19
    move-object v4, v2

    .line 553
    :goto_11
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-eqz v3, :cond_1a

    .line 558
    .line 559
    goto :goto_f

    .line 560
    :cond_1a
    invoke-static {v14}, La/ary;->y(La/wsy;)Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-nez v3, :cond_16

    .line 565
    .line 566
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    goto :goto_f

    .line 570
    :cond_1b
    iget-object v0, p0, La/l9z;->i:La/wm40;

    .line 571
    .line 572
    if-eqz v0, :cond_1c

    .line 573
    .line 574
    invoke-static {v0, p0}, La/e9x;->K(La/wm40;La/wm40;)La/r4m0;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    new-instance v4, La/xzs0;

    .line 579
    .line 580
    invoke-direct {v4, v3}, La/xzs0;-><init>(La/vzs0;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0}, La/wm40;->I()La/kzj0;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    sget-object v3, La/t3u0;->c:La/t3u0;

    .line 588
    .line 589
    invoke-virtual {v4, v0, v3}, La/xzs0;->h(La/wsy;La/t3u0;)La/wsy;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    goto :goto_12

    .line 594
    :cond_1c
    move-object v0, v2

    .line 595
    :goto_12
    if-eqz v0, :cond_1d

    .line 596
    .line 597
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    :cond_1d
    if-eqz v12, :cond_1e

    .line 601
    .line 602
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    :cond_1e
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    if-nez v0, :cond_20

    .line 610
    .line 611
    iget-object v0, v6, La/f7u;->b:Ljava/lang/Object;

    .line 612
    .line 613
    new-instance v0, Ljava/util/ArrayList;

    .line 614
    .line 615
    invoke-static {v10, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    if-eqz v3, :cond_1f

    .line 631
    .line 632
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    check-cast v3, La/zqe0;

    .line 637
    .line 638
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    check-cast v3, La/oqe0;

    .line 642
    .line 643
    iget-object v3, v3, La/oqe0;->a:Ljava/lang/reflect/Type;

    .line 644
    .line 645
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    goto :goto_13

    .line 653
    :cond_1f
    invoke-interface {p0}, La/vjj;->getName()La/g950;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    const-string v1, ", unresolved classes "

    .line 658
    .line 659
    const-string v3, "Incomplete hierarchy for class "

    .line 660
    .line 661
    invoke-static {v3, p0, v1, v0}, La/e9d0;->k(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    goto :goto_14

    .line 665
    :cond_20
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 666
    .line 667
    .line 668
    move-result p0

    .line 669
    if-nez p0, :cond_21

    .line 670
    .line 671
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    goto :goto_14

    .line 676
    :cond_21
    iget-object p0, v6, La/f7u;->b:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast p0, La/v7i;

    .line 679
    .line 680
    iget-object p0, p0, La/v7i;->j:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast p0, La/zm40;

    .line 683
    .line 684
    iget-object p0, p0, La/zm40;->e:La/ary;

    .line 685
    .line 686
    invoke-virtual {p0}, La/ary;->e()La/kzj0;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    :goto_14
    return-object v2

    .line 695
    :pswitch_0
    check-cast p0, La/ffk;

    .line 696
    .line 697
    iget-object v0, p0, La/ffk;->e:La/s2d0;

    .line 698
    .line 699
    iget-object v3, p0, La/ffk;->l:La/g45;

    .line 700
    .line 701
    iget-object v4, v3, La/g45;->d:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v4, La/roi0;

    .line 704
    .line 705
    invoke-static {v0, v4}, La/m8x;->k0(La/s2d0;La/roi0;)Ljava/util/List;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    new-instance v4, Ljava/util/ArrayList;

    .line 710
    .line 711
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v5

    .line 726
    if-eqz v5, :cond_22

    .line 727
    .line 728
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v5

    .line 732
    check-cast v5, La/a4d0;

    .line 733
    .line 734
    iget-object v6, v3, La/g45;->h:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v6, La/qgd;

    .line 737
    .line 738
    invoke-virtual {v6, v5}, La/qgd;->d0(La/a4d0;)La/wsy;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    goto :goto_15

    .line 746
    :cond_22
    iget-object v0, v3, La/g45;->a:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v0, La/f6i;

    .line 749
    .line 750
    iget-object v0, v0, La/f6i;->p:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v0, La/fx;

    .line 753
    .line 754
    invoke-interface {v0, p0}, La/fx;->d(La/wm40;)Ljava/util/Collection;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    check-cast v0, Ljava/lang/Iterable;

    .line 759
    .line 760
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    new-instance v4, Ljava/util/ArrayList;

    .line 765
    .line 766
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    :cond_23
    :goto_16
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v6

    .line 777
    if-eqz v6, :cond_25

    .line 778
    .line 779
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v6

    .line 783
    check-cast v6, La/wsy;

    .line 784
    .line 785
    invoke-virtual {v6}, La/wsy;->S()La/iys0;

    .line 786
    .line 787
    .line 788
    move-result-object v6

    .line 789
    invoke-interface {v6}, La/iys0;->n()La/foc;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    instance-of v7, v6, La/m660;

    .line 794
    .line 795
    if-eqz v7, :cond_24

    .line 796
    .line 797
    check-cast v6, La/m660;

    .line 798
    .line 799
    goto :goto_17

    .line 800
    :cond_24
    move-object v6, v2

    .line 801
    :goto_17
    if-eqz v6, :cond_23

    .line 802
    .line 803
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    goto :goto_16

    .line 807
    :cond_25
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    if-nez v2, :cond_29

    .line 812
    .line 813
    iget-object v2, v3, La/g45;->a:Ljava/lang/Object;

    .line 814
    .line 815
    check-cast v2, La/f6i;

    .line 816
    .line 817
    iget-object v2, v2, La/f6i;->j:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v2, La/q1o;

    .line 820
    .line 821
    new-instance v3, Ljava/util/ArrayList;

    .line 822
    .line 823
    invoke-static {v4, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    if-eqz v4, :cond_28

    .line 839
    .line 840
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    check-cast v4, La/m660;

    .line 845
    .line 846
    invoke-static {v4}, La/rek;->f(La/foc;)La/qlc;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    if-eqz v5, :cond_26

    .line 851
    .line 852
    invoke-virtual {v5}, La/qlc;->a()La/swq;

    .line 853
    .line 854
    .line 855
    move-result-object v5

    .line 856
    if-eqz v5, :cond_26

    .line 857
    .line 858
    iget-object v5, v5, La/swq;->a:La/twq;

    .line 859
    .line 860
    iget-object v5, v5, La/twq;->a:Ljava/lang/String;

    .line 861
    .line 862
    if-nez v5, :cond_27

    .line 863
    .line 864
    :cond_26
    invoke-virtual {v4}, La/h1;->getName()La/g950;

    .line 865
    .line 866
    .line 867
    move-result-object v4

    .line 868
    invoke-virtual {v4}, La/g950;->b()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    :cond_27
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    goto :goto_18

    .line 879
    :cond_28
    invoke-interface {v2, p0, v3}, La/q1o;->o(La/wm40;Ljava/util/ArrayList;)V

    .line 880
    .line 881
    .line 882
    :cond_29
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 883
    .line 884
    .line 885
    move-result-object p0

    .line 886
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()La/gfk0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/efk;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/efk;->e:La/h1;

    .line 7
    .line 8
    check-cast p0, La/l9z;

    .line 9
    .line 10
    iget-object p0, p0, La/l9z;->j:La/f7u;

    .line 11
    .line 12
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p0, La/gfk0;->c:La/gfk0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget-object p0, La/gfk0;->c:La/gfk0;

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-byte v0, p0, La/efk;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/efk;->d:La/cu00;

    .line 7
    .line 8
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, La/efk;->d:La/cu00;

    .line 16
    .line 17
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()La/wm40;
    .locals 1

    .line 1
    iget-byte v0, p0, La/efk;->c:B

    .line 2
    .line 3
    iget-object p0, p0, La/efk;->e:La/h1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/l9z;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, La/ffk;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n()La/foc;
    .locals 1

    .line 1
    iget-byte v0, p0, La/efk;->c:B

    .line 2
    .line 3
    iget-object p0, p0, La/efk;->e:La/h1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/l9z;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, La/ffk;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Z
    .locals 0

    .line 1
    iget-byte p0, p0, La/efk;->c:B

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x1

    return p0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/efk;->c:B

    .line 2
    .line 3
    iget-object p0, p0, La/efk;->e:La/h1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/l9z;

    .line 9
    .line 10
    invoke-virtual {p0}, La/h1;->getName()La/g950;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/g950;->b()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p0, La/ffk;

    .line 23
    .line 24
    invoke-virtual {p0}, La/h1;->getName()La/g950;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p0, p0, La/g950;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
