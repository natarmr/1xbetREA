.class public final La/ce40;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final c:La/kf60;

.field public final d:La/ywu;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:La/vvt0;


# direct methods
.method public constructor <init>(La/vkr0;La/kf60;La/ywu;Ljava/lang/String;Ljava/lang/String;La/vvt0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, La/ce40;->c:La/kf60;

    .line 15
    .line 16
    iput-object p3, p0, La/ce40;->d:La/ywu;

    .line 17
    .line 18
    iput-object p4, p0, La/ce40;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p5, p0, La/ce40;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p6, p0, La/ce40;->g:La/vvt0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final q0(La/td9;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, La/td9;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, La/td9;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    iget-object v2, v1, La/ce40;->d:La/ywu;

    .line 26
    .line 27
    iget-object v3, v0, La/td9;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, v2, La/ywu;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    const-string v5, "captcha_sid"

    .line 36
    .line 37
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, La/td9;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v2, v2, La/ywu;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    const-string v4, "captcha_key"

    .line 49
    .line 50
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v2, v0, La/td9;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget-object v3, v1, La/ce40;->d:La/ywu;

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v3, v3, La/ywu;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 75
    .line 76
    const-string v4, "captcha_attempt"

    .line 77
    .line 78
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_0
    iget-object v2, v0, La/td9;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/lang/Double;

    .line 84
    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    iget-object v4, v1, La/ce40;->d:La/ywu;

    .line 92
    .line 93
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v3, v4, La/ywu;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    const-string v4, "captcha_ts"

    .line 105
    .line 106
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :cond_1
    iget-boolean v0, v0, La/td9;->a:Z

    .line 110
    .line 111
    const-string v2, "1"

    .line 112
    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    iget-object v0, v1, La/ce40;->d:La/ywu;

    .line 116
    .line 117
    iget-object v0, v0, La/ywu;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    const-string v3, "confirm"

    .line 122
    .line 123
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_2
    iget-object v0, v1, La/ce40;->d:La/ywu;

    .line 127
    .line 128
    iget-object v0, v0, La/ywu;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    const-string v3, "device_id"

    .line 133
    .line 134
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Ljava/lang/String;

    .line 139
    .line 140
    const-string v4, ""

    .line 141
    .line 142
    if-nez v0, :cond_3

    .line 143
    .line 144
    move-object v0, v4

    .line 145
    :cond_3
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_4

    .line 150
    .line 151
    iget-object v0, v1, La/ce40;->e:Ljava/lang/String;

    .line 152
    .line 153
    :cond_4
    iget-object v5, v1, La/ce40;->d:La/ywu;

    .line 154
    .line 155
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v5, v5, La/ywu;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    invoke-interface {v5, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    iget-object v0, v1, La/ce40;->d:La/ywu;

    .line 177
    .line 178
    iget-object v0, v0, La/ywu;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 181
    .line 182
    const-string v3, "lang"

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/String;

    .line 189
    .line 190
    if-nez v0, :cond_5

    .line 191
    .line 192
    move-object v0, v4

    .line 193
    :cond_5
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_6

    .line 198
    .line 199
    iget-object v0, v1, La/ce40;->f:Ljava/lang/String;

    .line 200
    .line 201
    :cond_6
    iget-object v5, v1, La/ce40;->d:La/ywu;

    .line 202
    .line 203
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object v5, v5, La/ywu;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 220
    .line 221
    invoke-interface {v5, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    iget-object v0, v1, La/ce40;->d:La/ywu;

    .line 225
    .line 226
    iget-object v3, v0, La/ywu;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v3, Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v3}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    const/4 v5, 0x0

    .line 235
    if-nez v3, :cond_2c

    .line 236
    .line 237
    iget-object v3, v0, La/ywu;->c:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v3, Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v3}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_2b

    .line 246
    .line 247
    iget-object v3, v0, La/ywu;->b:Ljava/lang/Object;

    .line 248
    .line 249
    move-object v8, v3

    .line 250
    check-cast v8, Ljava/lang/String;

    .line 251
    .line 252
    iget-object v3, v0, La/ywu;->c:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v3, Ljava/lang/String;

    .line 255
    .line 256
    iget-object v0, v0, La/ywu;->d:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 259
    .line 260
    iget-object v6, v1, La/ce40;->c:La/kf60;

    .line 261
    .line 262
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object v7, v6, La/kf60;->c:La/a8z;

    .line 266
    .line 267
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    check-cast v7, Ljava/util/List;

    .line 272
    .line 273
    invoke-static {v7}, La/w7n0;->m(Ljava/util/List;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget-object v9, v6, La/kf60;->c:La/a8z;

    .line 281
    .line 282
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    check-cast v9, Ljava/util/List;

    .line 287
    .line 288
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    check-cast v9, La/xut0;

    .line 296
    .line 297
    if-eqz v9, :cond_7

    .line 298
    .line 299
    iget-object v9, v9, La/xut0;->b:Ljava/lang/String;

    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_7
    move-object v9, v5

    .line 303
    :goto_0
    sget-object v10, La/qkd0;->a:La/qkd0;

    .line 304
    .line 305
    iget-object v11, v6, La/kf60;->a:La/jw20;

    .line 306
    .line 307
    iget-object v11, v11, La/jw20;->b:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v11, La/wut0;

    .line 310
    .line 311
    iget v11, v11, La/wut0;->b:I

    .line 312
    .line 313
    iget-object v12, v6, La/kf60;->c:La/a8z;

    .line 314
    .line 315
    invoke-interface {v12}, La/a8z;->getValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    check-cast v12, Ljava/lang/Iterable;

    .line 320
    .line 321
    new-instance v13, Ljava/util/ArrayList;

    .line 322
    .line 323
    const/16 v14, 0xa

    .line 324
    .line 325
    invoke-static {v12, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 326
    .line 327
    .line 328
    move-result v15

    .line 329
    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v15

    .line 340
    if-eqz v15, :cond_8

    .line 341
    .line 342
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    check-cast v15, La/xut0;

    .line 347
    .line 348
    iget-object v15, v15, La/xut0;->a:Ljava/lang/String;

    .line 349
    .line 350
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_1

    .line 354
    :cond_8
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    const-string v10, "/method/"

    .line 364
    .line 365
    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    sget-object v12, La/lun;->a:La/lun;

    .line 370
    .line 371
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 375
    .line 376
    invoke-direct {v12, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 377
    .line 378
    .line 379
    const-string v0, "v"

    .line 380
    .line 381
    invoke-interface {v12, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    const-string v0, "https"

    .line 385
    .line 386
    invoke-interface {v12, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    invoke-static {v7}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_9

    .line 394
    .line 395
    if-eqz v11, :cond_a

    .line 396
    .line 397
    const-string v0, "api_id"

    .line 398
    .line 399
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-interface {v12, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    goto :goto_2

    .line 407
    :cond_9
    const-string v0, "access_token"

    .line 408
    .line 409
    invoke-interface {v12, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    :cond_a
    :goto_2
    new-instance v0, Landroid/net/Uri$Builder;

    .line 413
    .line 414
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    check-cast v2, Ljava/lang/Iterable;

    .line 422
    .line 423
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    :cond_b
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    const-string v7, "sig"

    .line 432
    .line 433
    if-eqz v3, :cond_c

    .line 434
    .line 435
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    check-cast v3, Ljava/util/Map$Entry;

    .line 440
    .line 441
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v11

    .line 445
    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    if-nez v7, :cond_b

    .line 450
    .line 451
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    check-cast v7, Ljava/lang/String;

    .line 456
    .line 457
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    check-cast v3, Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v0, v7, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 464
    .line 465
    .line 466
    goto :goto_3

    .line 467
    :cond_c
    sget-object v2, La/xun;->a:La/xun;

    .line 468
    .line 469
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    sget-object v2, La/hun;->a:La/hun;

    .line 473
    .line 474
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    const/4 v2, 0x0

    .line 482
    const/4 v3, 0x4

    .line 483
    if-eqz v9, :cond_11

    .line 484
    .line 485
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    if-nez v11, :cond_d

    .line 490
    .line 491
    goto/16 :goto_7

    .line 492
    .line 493
    :cond_d
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    invoke-static {}, La/qkd0;->a()Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 502
    .line 503
    .line 504
    invoke-static {}, La/qkd0;->a()Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    move-result-object v12

    .line 508
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    const/16 v10, 0x3f

    .line 512
    .line 513
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    if-eqz v11, :cond_f

    .line 517
    .line 518
    invoke-static {v11}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    if-eqz v10, :cond_e

    .line 523
    .line 524
    goto :goto_4

    .line 525
    :cond_e
    invoke-static {}, La/qkd0;->a()Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    move-result-object v10

    .line 529
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    :cond_f
    :goto_4
    invoke-static {}, La/qkd0;->a()Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    move-result-object v10

    .line 536
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-static {}, La/qkd0;->a()Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    move-result-object v9

    .line 543
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v9

    .line 547
    sget-object v10, La/ewt0;->a:La/ewt0;

    .line 548
    .line 549
    :try_start_0
    const-string v11, "MD5"

    .line 550
    .line 551
    invoke-static {v11}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    const-string v12, "UTF-8"

    .line 556
    .line 557
    invoke-static {v12}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 558
    .line 559
    .line 560
    move-result-object v12

    .line 561
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v9, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 565
    .line 566
    .line 567
    move-result-object v9

    .line 568
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v11, v9}, Ljava/security/MessageDigest;->digest([B)[B

    .line 572
    .line 573
    .line 574
    move-result-object v9

    .line 575
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-static {}, La/ewt0;->a()Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    move-result-object v10

    .line 582
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    array-length v10, v9

    .line 589
    move v11, v2

    .line 590
    :goto_5
    if-ge v11, v10, :cond_10

    .line 591
    .line 592
    aget-byte v12, v9, v11

    .line 593
    .line 594
    invoke-static {}, La/ewt0;->a()Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    move-result-object v13

    .line 598
    sget-object v15, La/ewt0;->c:[C

    .line 599
    .line 600
    and-int/lit16 v14, v12, 0xf0

    .line 601
    .line 602
    shr-int/2addr v14, v3

    .line 603
    aget-char v14, v15, v14

    .line 604
    .line 605
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-static {}, La/ewt0;->a()Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    move-result-object v13

    .line 612
    and-int/lit8 v12, v12, 0xf

    .line 613
    .line 614
    aget-char v12, v15, v12

    .line 615
    .line 616
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    add-int/lit8 v11, v11, 0x1

    .line 620
    .line 621
    const/16 v14, 0xa

    .line 622
    .line 623
    goto :goto_5

    .line 624
    :cond_10
    invoke-static {}, La/ewt0;->a()Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    move-result-object v9

    .line 628
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 632
    goto :goto_6

    .line 633
    :catch_0
    move-object v9, v4

    .line 634
    :goto_6
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0, v7, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    if-nez v0, :cond_12

    .line 651
    .line 652
    goto :goto_8

    .line 653
    :cond_11
    :goto_7
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    if-nez v0, :cond_12

    .line 658
    .line 659
    goto :goto_8

    .line 660
    :cond_12
    move-object v4, v0

    .line 661
    :goto_8
    sget v0, Lokhttp3/RequestBody;->a:I

    .line 662
    .line 663
    const-string v0, "execute."

    .line 664
    .line 665
    invoke-static {v8, v0, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-eqz v0, :cond_14

    .line 670
    .line 671
    const-string v0, "https://vk.com/?"

    .line 672
    .line 673
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    const-string v7, "method"

    .line 682
    .line 683
    invoke-virtual {v0, v7}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v7

    .line 687
    const-string v9, "execute"

    .line 688
    .line 689
    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    if-eqz v7, :cond_14

    .line 694
    .line 695
    const-string v7, "code"

    .line 696
    .line 697
    invoke-virtual {v0, v7}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    if-eqz v0, :cond_14

    .line 702
    .line 703
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    if-eqz v0, :cond_13

    .line 708
    .line 709
    goto :goto_9

    .line 710
    :cond_13
    new-instance v6, La/yut0;

    .line 711
    .line 712
    const/4 v12, 0x0

    .line 713
    const/16 v13, 0x3f0

    .line 714
    .line 715
    const/16 v7, 0xf

    .line 716
    .line 717
    const-string v9, "Hey dude don\'t execute your hacky code ;)"

    .line 718
    .line 719
    const/4 v10, 0x0

    .line 720
    const/4 v11, 0x0

    .line 721
    invoke-direct/range {v6 .. v13}, La/yut0;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)V

    .line 722
    .line 723
    .line 724
    throw v6

    .line 725
    :cond_14
    :goto_9
    sget-object v0, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 726
    .line 727
    const-string v0, "application/x-www-form-urlencoded; charset=utf-8"

    .line 728
    .line 729
    :try_start_1
    invoke-static {v0}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 730
    .line 731
    .line 732
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 733
    goto :goto_a

    .line 734
    :catch_1
    move-object v0, v5

    .line 735
    :goto_a
    invoke-static {v4, v0}, Lokhttp3/RequestBody$Companion;->a(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody$Companion$toRequestBody$3;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget-object v4, v6, La/kf60;->a:La/jw20;

    .line 740
    .line 741
    iget-object v4, v4, La/jw20;->b:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v4, La/wut0;

    .line 744
    .line 745
    iget-object v4, v4, La/wut0;->n:Lkotlin/jvm/functions/Function0;

    .line 746
    .line 747
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    check-cast v4, Ljava/lang/String;

    .line 752
    .line 753
    new-instance v7, Lokhttp3/Request$Builder;

    .line 754
    .line 755
    invoke-direct {v7}, Lokhttp3/Request$Builder;-><init>()V

    .line 756
    .line 757
    .line 758
    const-string v9, "POST"

    .line 759
    .line 760
    invoke-virtual {v7, v9, v0}, Lokhttp3/Request$Builder;->b(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 761
    .line 762
    .line 763
    new-instance v0, Ljava/lang/StringBuilder;

    .line 764
    .line 765
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 766
    .line 767
    .line 768
    iget-object v9, v6, La/kf60;->e:Ljava/lang/String;

    .line 769
    .line 770
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 771
    .line 772
    .line 773
    move-result v10

    .line 774
    if-nez v10, :cond_15

    .line 775
    .line 776
    goto :goto_b

    .line 777
    :cond_15
    const-string v10, "https://api.vk.com/method"

    .line 778
    .line 779
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    move-result v10

    .line 783
    if-eqz v10, :cond_16

    .line 784
    .line 785
    :goto_b
    const-string v9, "https://"

    .line 786
    .line 787
    const-string v10, "/method"

    .line 788
    .line 789
    invoke-static {v9, v4, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    :cond_16
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    const/16 v4, 0x2f

    .line 797
    .line 798
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {v7, v0}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    sget-object v0, Lokhttp3/CacheControl;->n:Lokhttp3/CacheControl;

    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v0}, Lokhttp3/CacheControl;->toString()Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    const-string v9, "Cache-Control"

    .line 825
    .line 826
    if-nez v4, :cond_17

    .line 827
    .line 828
    iget-object v0, v7, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 829
    .line 830
    invoke-virtual {v0, v9}, Lokhttp3/Headers$Builder;->d(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    goto :goto_c

    .line 834
    :cond_17
    invoke-virtual {v7, v9, v0}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    :goto_c
    const-class v0, Ljava/util/Map;

    .line 838
    .line 839
    invoke-virtual {v7, v0, v5}, Lokhttp3/Request$Builder;->c(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 840
    .line 841
    .line 842
    new-instance v0, Lokhttp3/Request;

    .line 843
    .line 844
    invoke-direct {v0, v7}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 845
    .line 846
    .line 847
    iget-object v4, v6, La/kf60;->c:La/a8z;

    .line 848
    .line 849
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v4

    .line 853
    check-cast v4, Ljava/util/List;

    .line 854
    .line 855
    invoke-static {v4}, La/w7n0;->m(Ljava/util/List;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    iget-object v7, v6, La/kf60;->b:La/n0o0;

    .line 860
    .line 861
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v7

    .line 865
    check-cast v7, La/uvt0;

    .line 866
    .line 867
    invoke-virtual {v7}, La/uvt0;->a()Lokhttp3/OkHttpClient;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    new-instance v9, Lokhttp3/internal/connection/RealCall;

    .line 872
    .line 873
    invoke-direct {v9, v7, v0, v2}, Lokhttp3/internal/connection/RealCall;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V

    .line 874
    .line 875
    .line 876
    invoke-static {v9}, Lcom/google/firebase/perf/network/FirebasePerfOkHttpClient;->execute(Lokhttp3/Call;)Lokhttp3/Response;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    iget v7, v0, Lokhttp3/Response;->d:I

    .line 884
    .line 885
    iget-object v9, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 886
    .line 887
    const/16 v10, 0x19d

    .line 888
    .line 889
    if-eq v7, v10, :cond_2a

    .line 890
    .line 891
    const/16 v10, 0x1f4

    .line 892
    .line 893
    if-gt v10, v7, :cond_1a

    .line 894
    .line 895
    const/16 v10, 0x258

    .line 896
    .line 897
    if-ge v7, v10, :cond_1a

    .line 898
    .line 899
    if-eqz v9, :cond_18

    .line 900
    .line 901
    :try_start_2
    invoke-virtual {v9}, Lokhttp3/ResponseBody;->k()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 905
    invoke-interface {v9}, Ljava/io/Closeable;->close()V

    .line 906
    .line 907
    .line 908
    if-nez v0, :cond_19

    .line 909
    .line 910
    goto :goto_d

    .line 911
    :catchall_0
    move-exception v0

    .line 912
    move-object v1, v0

    .line 913
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 914
    :catchall_1
    move-exception v0

    .line 915
    invoke-static {v9, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 916
    .line 917
    .line 918
    throw v0

    .line 919
    :cond_18
    :goto_d
    const-string v0, "null"

    .line 920
    .line 921
    :cond_19
    new-instance v1, La/ovt0;

    .line 922
    .line 923
    new-instance v2, Ljava/lang/StringBuilder;

    .line 924
    .line 925
    const-string v3, "Server returned httpStatusCode="

    .line 926
    .line 927
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    const-string v3, " with body: "

    .line 934
    .line 935
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    throw v1

    .line 949
    :cond_1a
    const/4 v7, 0x1

    .line 950
    if-eqz v9, :cond_21

    .line 951
    .line 952
    invoke-virtual {v9}, Lokhttp3/ResponseBody;->a()Ljava/io/InputStream;

    .line 953
    .line 954
    .line 955
    move-result-object v9

    .line 956
    iget-object v6, v6, La/kf60;->a:La/jw20;

    .line 957
    .line 958
    iget-object v6, v6, La/jw20;->b:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v6, La/wut0;

    .line 961
    .line 962
    iget-object v6, v6, La/wut0;->A:La/n0o0;

    .line 963
    .line 964
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v6

    .line 968
    check-cast v6, La/ktf0;

    .line 969
    .line 970
    iget-object v10, v0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 971
    .line 972
    const-string v11, "content-type"

    .line 973
    .line 974
    invoke-virtual {v10, v11}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v10

    .line 978
    iget-object v0, v0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 979
    .line 980
    iget-object v0, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 981
    .line 982
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->b()Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v13

    .line 986
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    const-string v0, "root_response"

    .line 990
    .line 991
    if-eqz v10, :cond_1f

    .line 992
    .line 993
    :try_start_4
    iget-object v6, v6, La/ktf0;->a:Ljava/util/List;

    .line 994
    .line 995
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 996
    .line 997
    .line 998
    move-result-object v6

    .line 999
    :cond_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v11

    .line 1003
    if-eqz v11, :cond_1c

    .line 1004
    .line 1005
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v11

    .line 1009
    move-object v12, v11

    .line 1010
    check-cast v12, La/mvj;

    .line 1011
    .line 1012
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    const-string v12, "application/json"

    .line 1016
    .line 1017
    invoke-static {v10, v12, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v12

    .line 1021
    if-nez v12, :cond_1d

    .line 1022
    .line 1023
    const-string v12, "text/javascript"

    .line 1024
    .line 1025
    invoke-static {v10, v12, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v12

    .line 1029
    if-eqz v12, :cond_1b

    .line 1030
    .line 1031
    goto :goto_e

    .line 1032
    :catch_2
    move-exception v0

    .line 1033
    goto :goto_10

    .line 1034
    :cond_1c
    move-object v11, v5

    .line 1035
    :cond_1d
    :goto_e
    check-cast v11, La/mvj;

    .line 1036
    .line 1037
    if-eqz v11, :cond_1f

    .line 1038
    .line 1039
    new-instance v6, Lorg/json/JSONTokener;

    .line 1040
    .line 1041
    invoke-static {v9}, La/gfx;->P(Ljava/io/InputStream;)Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v10

    .line 1045
    invoke-direct {v6, v10}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v6}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v6

    .line 1052
    instance-of v10, v6, Lorg/json/JSONObject;

    .line 1053
    .line 1054
    if-eqz v10, :cond_1e

    .line 1055
    .line 1056
    check-cast v6, Lorg/json/JSONObject;

    .line 1057
    .line 1058
    goto :goto_f

    .line 1059
    :cond_1e
    new-instance v10, Lorg/json/JSONObject;

    .line 1060
    .line 1061
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v10, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1065
    .line 1066
    .line 1067
    move-object v6, v10

    .line 1068
    goto :goto_f

    .line 1069
    :cond_1f
    move-object v6, v5

    .line 1070
    :goto_f
    if-nez v6, :cond_20

    .line 1071
    .line 1072
    new-instance v6, Lorg/json/JSONObject;

    .line 1073
    .line 1074
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1075
    .line 1076
    .line 1077
    invoke-static {v9}, La/gfx;->P(Ljava/io/InputStream;)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v9

    .line 1081
    invoke-virtual {v6, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 1082
    .line 1083
    .line 1084
    :cond_20
    move-object v14, v6

    .line 1085
    goto :goto_11

    .line 1086
    :goto_10
    new-instance v11, La/yut0;

    .line 1087
    .line 1088
    const-string v1, "["

    .line 1089
    .line 1090
    const-string v2, "] "

    .line 1091
    .line 1092
    invoke-static {v1, v13, v2}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v14

    .line 1107
    const/16 v17, 0x0

    .line 1108
    .line 1109
    const/16 v18, 0x3f0

    .line 1110
    .line 1111
    const/4 v12, -0x2

    .line 1112
    const/4 v15, 0x0

    .line 1113
    const/16 v16, 0x0

    .line 1114
    .line 1115
    invoke-direct/range {v11 .. v18}, La/yut0;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)V

    .line 1116
    .line 1117
    .line 1118
    throw v11

    .line 1119
    :cond_21
    move-object v14, v5

    .line 1120
    :goto_11
    const/16 v15, 0xf

    .line 1121
    .line 1122
    if-eqz v14, :cond_29

    .line 1123
    .line 1124
    const-string v0, "error"

    .line 1125
    .line 1126
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v6

    .line 1130
    if-eqz v6, :cond_23

    .line 1131
    .line 1132
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    if-nez v0, :cond_22

    .line 1137
    .line 1138
    move-object v0, v14

    .line 1139
    :cond_22
    invoke-static {v0, v8, v4}, La/afn0;->x(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)La/c44;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v5

    .line 1143
    goto/16 :goto_15

    .line 1144
    .line 1145
    :cond_23
    const-string v0, "execute_errors"

    .line 1146
    .line 1147
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v4

    .line 1151
    if-nez v4, :cond_24

    .line 1152
    .line 1153
    goto/16 :goto_15

    .line 1154
    .line 1155
    :cond_24
    invoke-virtual {v14, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    :try_start_5
    new-instance v11, Ljava/util/ArrayList;

    .line 1163
    .line 1164
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 1168
    .line 1169
    .line 1170
    move-result v4

    .line 1171
    :goto_12
    if-ge v2, v4, :cond_27

    .line 1172
    .line 1173
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v6

    .line 1177
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    invoke-static {v6, v5, v5}, La/afn0;->x(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)La/c44;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v6

    .line 1184
    instance-of v9, v6, La/yut0;

    .line 1185
    .line 1186
    if-nez v9, :cond_26

    .line 1187
    .line 1188
    :cond_25
    :goto_13
    move-object v5, v6

    .line 1189
    goto :goto_15

    .line 1190
    :cond_26
    move-object v9, v6

    .line 1191
    check-cast v9, La/yut0;

    .line 1192
    .line 1193
    iget v9, v9, La/yut0;->b:I

    .line 1194
    .line 1195
    if-eq v9, v7, :cond_25

    .line 1196
    .line 1197
    const/16 v10, 0xe

    .line 1198
    .line 1199
    if-eq v9, v10, :cond_25

    .line 1200
    .line 1201
    const/16 v10, 0x11

    .line 1202
    .line 1203
    if-eq v9, v10, :cond_25

    .line 1204
    .line 1205
    const/16 v10, 0xe1a

    .line 1206
    .line 1207
    if-eq v9, v10, :cond_25

    .line 1208
    .line 1209
    if-eq v9, v3, :cond_25

    .line 1210
    .line 1211
    const/4 v10, 0x5

    .line 1212
    if-eq v9, v10, :cond_25

    .line 1213
    .line 1214
    const/4 v10, 0x6

    .line 1215
    if-eq v9, v10, :cond_25

    .line 1216
    .line 1217
    const/16 v10, 0x9

    .line 1218
    .line 1219
    if-eq v9, v10, :cond_25

    .line 1220
    .line 1221
    const/16 v10, 0xa

    .line 1222
    .line 1223
    if-eq v9, v10, :cond_25

    .line 1224
    .line 1225
    const/16 v12, 0x18

    .line 1226
    .line 1227
    if-eq v9, v12, :cond_25

    .line 1228
    .line 1229
    const/16 v12, 0x19

    .line 1230
    .line 1231
    if-eq v9, v12, :cond_25

    .line 1232
    .line 1233
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1234
    .line 1235
    .line 1236
    add-int/lit8 v2, v2, 0x1

    .line 1237
    .line 1238
    goto :goto_12

    .line 1239
    :catch_3
    move-exception v0

    .line 1240
    goto :goto_14

    .line 1241
    :cond_27
    new-instance v6, La/yut0;

    .line 1242
    .line 1243
    const-string v9, ""

    .line 1244
    .line 1245
    const/4 v12, 0x0

    .line 1246
    const/16 v13, 0x3c0

    .line 1247
    .line 1248
    const/high16 v7, -0x80000000

    .line 1249
    .line 1250
    const/4 v10, 0x0

    .line 1251
    invoke-direct/range {v6 .. v13}, La/yut0;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1252
    .line 1253
    .line 1254
    goto :goto_13

    .line 1255
    :goto_14
    new-instance v2, La/zut0;

    .line 1256
    .line 1257
    invoke-direct {v2, v0, v15}, La/c44;-><init>(Ljava/lang/Throwable;B)V

    .line 1258
    .line 1259
    .line 1260
    move-object v5, v2

    .line 1261
    :goto_15
    if-nez v5, :cond_28

    .line 1262
    .line 1263
    iget-object v0, v1, La/ce40;->g:La/vvt0;

    .line 1264
    .line 1265
    invoke-virtual {v0, v14}, La/vvt0;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    return-object v0

    .line 1270
    :cond_28
    throw v5

    .line 1271
    :cond_29
    new-instance v0, La/c44;

    .line 1272
    .line 1273
    const-string v1, "Response returned null instead of valid string response"

    .line 1274
    .line 1275
    invoke-direct {v0, v1, v15}, La/c44;-><init>(Ljava/lang/String;B)V

    .line 1276
    .line 1277
    .line 1278
    throw v0

    .line 1279
    :cond_2a
    new-instance v1, La/c44;

    .line 1280
    .line 1281
    iget-object v0, v0, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 1282
    .line 1283
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    const/16 v2, 0x10

    .line 1287
    .line 1288
    invoke-direct {v1, v0, v2}, La/c44;-><init>(Ljava/lang/String;B)V

    .line 1289
    .line 1290
    .line 1291
    throw v1

    .line 1292
    :cond_2b
    const-string v0, "version is null or empty"

    .line 1293
    .line 1294
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    return-object v5

    .line 1298
    :cond_2c
    const-string v0, "method is null or empty"

    .line 1299
    .line 1300
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    return-object v5
.end method
