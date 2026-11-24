.class public final Lorg/xplatform/personal/impl/presentation/edit/j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/v8d;

.field public j:Z

.field public final synthetic k:Lorg/xplatform/personal/impl/presentation/edit/n;


# direct methods
.method public constructor <init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/j;->k:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, Lorg/xplatform/personal/impl/presentation/edit/j;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/j;->k:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, Lorg/xplatform/personal/impl/presentation/edit/j;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/j;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/personal/impl/presentation/edit/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lorg/xplatform/personal/impl/presentation/edit/j;->k:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 4
    .line 5
    iget-object v2, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->n:La/vzg0;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, v0, Lorg/xplatform/personal/impl/presentation/edit/j;->j:Z

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const-string v7, "ORIGINAL_UI_STATE_HASH_KEY"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v8, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lorg/xplatform/personal/impl/presentation/edit/j;->i:La/v8d;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object v4, v0

    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v5

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v4, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 39
    .line 40
    invoke-virtual {v1}, Lorg/xplatform/personal/impl/presentation/edit/n;->B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    instance-of v4, v4, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v2, v7}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v1}, Lorg/xplatform/personal/impl/presentation/edit/n;->B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 72
    .line 73
    new-instance v1, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v7, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_3
    iget-object v4, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->e:La/bzt;

    .line 85
    .line 86
    iget-object v4, v4, La/bzt;->a:La/fsd;

    .line 87
    .line 88
    invoke-virtual {v4}, La/fsd;->a()La/v8d;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    iget-object v9, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->g:La/rou;

    .line 93
    .line 94
    iput-object v4, v0, Lorg/xplatform/personal/impl/presentation/edit/j;->i:La/v8d;

    .line 95
    .line 96
    iput-boolean v8, v0, Lorg/xplatform/personal/impl/presentation/edit/j;->j:Z

    .line 97
    .line 98
    invoke-virtual {v9, v6, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-ne v0, v3, :cond_4

    .line 103
    .line 104
    return-object v3

    .line 105
    :cond_4
    :goto_1
    move-object v14, v0

    .line 106
    check-cast v14, La/m2c0;

    .line 107
    .line 108
    sget-object v0, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 109
    .line 110
    iget-object v0, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->o:La/n0o0;

    .line 111
    .line 112
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    iget-boolean v0, v4, La/v8d;->G:Z

    .line 123
    .line 124
    iget-object v3, v4, La/v8d;->V:Ljava/util/List;

    .line 125
    .line 126
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iget-object v9, v14, La/m2c0;->G:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v10, v14, La/m2c0;->c:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v4, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    iget-object v9, v14, La/m2c0;->E:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v4, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v9, v14, La/m2c0;->z:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v4, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    iget-object v9, v14, La/m2c0;->x:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v4, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    if-eqz v13, :cond_5

    .line 159
    .line 160
    iget-object v9, v14, La/m2c0;->H:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v4, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    :cond_5
    iget-object v9, v14, La/m2c0;->w:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v4, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    if-eqz v4, :cond_7

    .line 175
    .line 176
    invoke-virtual {v4}, La/lc00;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v9, :cond_7

    .line 181
    .line 182
    :cond_6
    move v12, v8

    .line 183
    goto :goto_3

    .line 184
    :cond_7
    invoke-virtual {v4, v6}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    :goto_2
    move-object v9, v4

    .line 189
    check-cast v9, La/paw;

    .line 190
    .line 191
    invoke-virtual {v9}, La/paw;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-eqz v11, :cond_6

    .line 196
    .line 197
    invoke-virtual {v9}, La/paw;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    check-cast v9, Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-lez v9, :cond_8

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_8
    move v12, v6

    .line 211
    :goto_3
    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    if-eqz v4, :cond_9

    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    goto :goto_4

    .line 222
    :cond_9
    move v4, v6

    .line 223
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-nez v9, :cond_b

    .line 228
    .line 229
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-interface {v3, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_a

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_a
    move v11, v6

    .line 241
    goto :goto_6

    .line 242
    :cond_b
    :goto_5
    move v11, v8

    .line 243
    :goto_6
    const/16 v3, 0x4c

    .line 244
    .line 245
    if-ne v4, v3, :cond_c

    .line 246
    .line 247
    move v9, v8

    .line 248
    goto :goto_7

    .line 249
    :cond_c
    move v9, v6

    .line 250
    :goto_7
    const/16 v3, 0xd7

    .line 251
    .line 252
    if-ne v4, v3, :cond_d

    .line 253
    .line 254
    move-object v3, v10

    .line 255
    move v10, v8

    .line 256
    goto :goto_8

    .line 257
    :cond_d
    move-object v3, v10

    .line 258
    move v10, v6

    .line 259
    :goto_8
    if-ne v4, v8, :cond_e

    .line 260
    .line 261
    move v15, v8

    .line 262
    :goto_9
    move-object/from16 v20, v5

    .line 263
    .line 264
    goto :goto_a

    .line 265
    :cond_e
    move v15, v6

    .line 266
    goto :goto_9

    .line 267
    :goto_a
    const/16 v5, 0x79

    .line 268
    .line 269
    if-ne v4, v5, :cond_f

    .line 270
    .line 271
    move/from16 v16, v8

    .line 272
    .line 273
    goto :goto_b

    .line 274
    :cond_f
    move/from16 v16, v6

    .line 275
    .line 276
    :goto_b
    sget-object v4, La/d0c0;->c:La/c0o;

    .line 277
    .line 278
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 279
    .line 280
    const/16 v6, 0xa

    .line 281
    .line 282
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 283
    .line 284
    .line 285
    move-result v17

    .line 286
    invoke-static/range {v17 .. v17}, La/wp20;->a(I)I

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    const/16 v6, 0x10

    .line 291
    .line 292
    if-ge v8, v6, :cond_10

    .line 293
    .line 294
    move v8, v6

    .line 295
    :cond_10
    invoke-direct {v5, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4}, La/b3;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    if-eqz v6, :cond_18

    .line 307
    .line 308
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    move-object v8, v6

    .line 313
    check-cast v8, La/d0c0;

    .line 314
    .line 315
    iget-object v8, v8, La/d0c0;->a:Ljava/util/List;

    .line 316
    .line 317
    move/from16 v17, v0

    .line 318
    .line 319
    new-instance v0, Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v18

    .line 332
    if-eqz v18, :cond_12

    .line 333
    .line 334
    move-object/from16 p1, v3

    .line 335
    .line 336
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    move-object/from16 v21, v4

    .line 341
    .line 342
    move-object v4, v3

    .line 343
    check-cast v4, La/w2c0;

    .line 344
    .line 345
    invoke-static {v14, v4}, La/c2c0;->b(La/m2c0;La/w2c0;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v19

    .line 349
    move-object/from16 v18, v4

    .line 350
    .line 351
    move-object/from16 v4, p1

    .line 352
    .line 353
    invoke-static/range {v9 .. v19}, La/c2c0;->c(ZZZZZLa/m2c0;ZZZLa/w2c0;Ljava/lang/String;)Z

    .line 354
    .line 355
    .line 356
    move-result v18

    .line 357
    if-eqz v18, :cond_11

    .line 358
    .line 359
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    :cond_11
    move-object v3, v4

    .line 363
    move-object/from16 v4, v21

    .line 364
    .line 365
    goto :goto_d

    .line 366
    :cond_12
    move-object/from16 v21, v4

    .line 367
    .line 368
    move-object v4, v3

    .line 369
    new-instance v3, Ljava/util/ArrayList;

    .line 370
    .line 371
    move-object/from16 p1, v4

    .line 372
    .line 373
    const/16 v8, 0xa

    .line 374
    .line 375
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    const/4 v4, 0x0

    .line 387
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v18

    .line 391
    if-eqz v18, :cond_17

    .line 392
    .line 393
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v18

    .line 397
    add-int/lit8 v22, v4, 0x1

    .line 398
    .line 399
    if-ltz v4, :cond_16

    .line 400
    .line 401
    move-object/from16 v8, v18

    .line 402
    .line 403
    check-cast v8, La/w2c0;

    .line 404
    .line 405
    invoke-static {v14, v8}, La/c2c0;->b(La/m2c0;La/w2c0;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v19

    .line 409
    if-nez v4, :cond_13

    .line 410
    .line 411
    const/16 v29, 0x1

    .line 412
    .line 413
    goto :goto_f

    .line 414
    :cond_13
    const/16 v29, 0x0

    .line 415
    .line 416
    :goto_f
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    move-object/from16 v31, v0

    .line 421
    .line 422
    const/4 v0, 0x6

    .line 423
    if-eq v4, v0, :cond_14

    .line 424
    .line 425
    const/16 v0, 0xc

    .line 426
    .line 427
    if-eq v4, v0, :cond_14

    .line 428
    .line 429
    const/16 v0, 0xf

    .line 430
    .line 431
    if-eq v4, v0, :cond_14

    .line 432
    .line 433
    packed-switch v4, :pswitch_data_0

    .line 434
    .line 435
    .line 436
    new-instance v23, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 437
    .line 438
    move-object/from16 v18, v8

    .line 439
    .line 440
    invoke-static/range {v9 .. v19}, La/c2c0;->c(ZZZZZLa/m2c0;ZZZLa/w2c0;Ljava/lang/String;)Z

    .line 441
    .line 442
    .line 443
    move-result v26

    .line 444
    move-object/from16 v0, v18

    .line 445
    .line 446
    move-object/from16 v4, v19

    .line 447
    .line 448
    invoke-static {v14, v0, v4}, La/c2c0;->a(La/m2c0;La/w2c0;Ljava/lang/String;)Z

    .line 449
    .line 450
    .line 451
    move-result v27

    .line 452
    const-string v28, ""

    .line 453
    .line 454
    move-object/from16 v24, v0

    .line 455
    .line 456
    move-object/from16 v25, v4

    .line 457
    .line 458
    invoke-direct/range {v23 .. v29}, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;-><init>(La/w2c0;Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 459
    .line 460
    .line 461
    :goto_10
    move-object/from16 v0, v23

    .line 462
    .line 463
    goto :goto_13

    .line 464
    :cond_14
    :pswitch_0
    move-object/from16 v18, v8

    .line 465
    .line 466
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    packed-switch v0, :pswitch_data_1

    .line 471
    .line 472
    .line 473
    :pswitch_1
    const/4 v0, -0x1

    .line 474
    :goto_11
    move/from16 v25, v0

    .line 475
    .line 476
    goto :goto_12

    .line 477
    :pswitch_2
    iget v0, v14, La/m2c0;->F:I

    .line 478
    .line 479
    goto :goto_11

    .line 480
    :pswitch_3
    iget v0, v14, La/m2c0;->d:I

    .line 481
    .line 482
    goto :goto_11

    .line 483
    :pswitch_4
    iget v0, v14, La/m2c0;->g:I

    .line 484
    .line 485
    goto :goto_11

    .line 486
    :pswitch_5
    invoke-static/range {p1 .. p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    if-eqz v0, :cond_15

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    goto :goto_11

    .line 497
    :cond_15
    const/16 v25, 0x0

    .line 498
    .line 499
    :goto_12
    invoke-static/range {v9 .. v19}, La/c2c0;->c(ZZZZZLa/m2c0;ZZZLa/w2c0;Ljava/lang/String;)Z

    .line 500
    .line 501
    .line 502
    move-result v27

    .line 503
    move-object/from16 v0, v18

    .line 504
    .line 505
    move-object/from16 v4, v19

    .line 506
    .line 507
    invoke-static {v14, v0, v4}, La/c2c0;->a(La/m2c0;La/w2c0;Ljava/lang/String;)Z

    .line 508
    .line 509
    .line 510
    move-result v28

    .line 511
    new-instance v23, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 512
    .line 513
    move/from16 v30, v29

    .line 514
    .line 515
    const-string v29, ""

    .line 516
    .line 517
    move-object/from16 v24, v0

    .line 518
    .line 519
    move-object/from16 v26, v4

    .line 520
    .line 521
    invoke-direct/range {v23 .. v30}, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;-><init>(La/w2c0;ILjava/lang/String;ZZLjava/lang/String;Z)V

    .line 522
    .line 523
    .line 524
    goto :goto_10

    .line 525
    :goto_13
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move/from16 v4, v22

    .line 529
    .line 530
    move-object/from16 v0, v31

    .line 531
    .line 532
    const/16 v8, 0xa

    .line 533
    .line 534
    goto/16 :goto_e

    .line 535
    .line 536
    :cond_16
    invoke-static {}, La/q3d;->p()V

    .line 537
    .line 538
    .line 539
    throw v20

    .line 540
    :cond_17
    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-object/from16 v3, p1

    .line 544
    .line 545
    move/from16 v0, v17

    .line 546
    .line 547
    move-object/from16 v4, v21

    .line 548
    .line 549
    goto/16 :goto_c

    .line 550
    .line 551
    :cond_18
    new-instance v0, La/jo20;

    .line 552
    .line 553
    invoke-direct {v0}, La/jo20;-><init>()V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    :cond_19
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-eqz v4, :cond_21

    .line 569
    .line 570
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    check-cast v4, Ljava/util/Map$Entry;

    .line 575
    .line 576
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    check-cast v5, La/d0c0;

    .line 581
    .line 582
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    check-cast v4, Ljava/util/List;

    .line 587
    .line 588
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v6

    .line 592
    if-nez v6, :cond_20

    .line 593
    .line 594
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 598
    .line 599
    .line 600
    move-result v6

    .line 601
    const/4 v8, 0x2

    .line 602
    if-eqz v6, :cond_1c

    .line 603
    .line 604
    const/4 v9, 0x1

    .line 605
    if-eq v6, v9, :cond_1b

    .line 606
    .line 607
    if-ne v6, v8, :cond_1a

    .line 608
    .line 609
    sget-object v6, La/w2c0;->d:La/w2c0;

    .line 610
    .line 611
    goto :goto_15

    .line 612
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 613
    .line 614
    .line 615
    return-object v20

    .line 616
    :cond_1b
    sget-object v6, La/w2c0;->c:La/w2c0;

    .line 617
    .line 618
    goto :goto_15

    .line 619
    :cond_1c
    sget-object v6, La/w2c0;->b:La/w2c0;

    .line 620
    .line 621
    :goto_15
    new-instance v9, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;

    .line 622
    .line 623
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 624
    .line 625
    .line 626
    move-result v5

    .line 627
    const/4 v10, 0x1

    .line 628
    if-eqz v5, :cond_1f

    .line 629
    .line 630
    if-eq v5, v10, :cond_1e

    .line 631
    .line 632
    if-ne v5, v8, :cond_1d

    .line 633
    .line 634
    const v5, 0x7f1306e7

    .line 635
    .line 636
    .line 637
    goto :goto_16

    .line 638
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 639
    .line 640
    .line 641
    return-object v20

    .line 642
    :cond_1e
    const v5, 0x7f130b45

    .line 643
    .line 644
    .line 645
    goto :goto_16

    .line 646
    :cond_1f
    const v5, 0x7f13021d

    .line 647
    .line 648
    .line 649
    :goto_16
    invoke-direct {v9, v5}, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;-><init>(I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v6, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    if-eqz v5, :cond_19

    .line 664
    .line 665
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    check-cast v5, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;

    .line 670
    .line 671
    invoke-virtual {v5}, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;->u()La/w2c0;

    .line 672
    .line 673
    .line 674
    move-result-object v6

    .line 675
    invoke-virtual {v0, v6, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    goto :goto_17

    .line 679
    :cond_20
    const/4 v10, 0x1

    .line 680
    goto :goto_14

    .line 681
    :cond_21
    invoke-virtual {v0}, La/jo20;->b()La/jo20;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    new-instance v3, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 686
    .line 687
    invoke-direct {v3, v0}, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;-><init>(Ljava/util/Map;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1, v3}, Lorg/xplatform/personal/impl/presentation/edit/n;->E(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v1}, Lorg/xplatform/personal/impl/presentation/edit/n;->B()Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    iput v3, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->t:I

    .line 702
    .line 703
    new-instance v4, Ljava/lang/Integer;

    .line 704
    .line 705
    invoke-direct {v4, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v7, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->r:Ljava/util/LinkedHashMap;

    .line 712
    .line 713
    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 714
    .line 715
    .line 716
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 717
    .line 718
    return-object v0

    .line 719
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
