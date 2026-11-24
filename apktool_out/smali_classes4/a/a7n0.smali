.class public final synthetic La/a7n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/a7n0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/pmi0;)V
    .locals 0

    .line 1
    const/16 p1, 0x18

    iput-byte p1, p0, La/a7n0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/a7n0;->a:B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    sget-object v2, La/bid;->a:La/bid;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget v0, La/zco0;->r0:I

    .line 13
    .line 14
    return-object v2

    .line 15
    :pswitch_0
    new-instance v0, La/g0o;

    .line 16
    .line 17
    sget-object v1, La/cco0;->INSTANCE:La/cco0;

    .line 18
    .line 19
    new-array v2, v3, [Ljava/lang/annotation/Annotation;

    .line 20
    .line 21
    const-string v3, "org.xplatform.games_section.api.navigation.TabOneXGamesRoute"

    .line 22
    .line 23
    invoke-direct {v0, v3, v1, v2}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;->Companion:La/a0h;

    .line 28
    .line 29
    invoke-virtual {v0}, La/a0h;->serializer()La/jiy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :pswitch_2
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->Companion:La/zzg;

    .line 35
    .line 36
    invoke-virtual {v0}, La/zzg;->serializer()La/jiy;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :pswitch_3
    new-instance v0, La/g0o;

    .line 42
    .line 43
    sget-object v1, La/iao0;->INSTANCE:La/iao0;

    .line 44
    .line 45
    new-array v2, v3, [Ljava/lang/annotation/Annotation;

    .line 46
    .line 47
    const-string v3, "org.xplatform.aggregator.popular.dashboard.api.navigation.TabAggregatorRoute"

    .line 48
    .line 49
    invoke-direct {v0, v3, v1, v2}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    const-string v0, ""

    .line 54
    .line 55
    :try_start_0
    const-string v2, "android.os.SystemProperties"

    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v4, "get"

    .line 62
    .line 63
    const-class v5, Ljava/lang/String;

    .line 64
    .line 65
    filled-new-array {v5, v5}, [Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "ro.build.backported_fixes.alias_bitset.long_list"

    .line 74
    .line 75
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v4, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    move-object v0, v2

    .line 89
    :catch_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    new-array v1, v1, [C

    .line 94
    .line 95
    const/16 v4, 0x2c

    .line 96
    .line 97
    aput-char v4, v1, v3

    .line 98
    .line 99
    const/4 v4, 0x6

    .line 100
    invoke-static {v0, v1, v4}, Lkotlin/text/StringsKt;->i0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_0

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/lang/String;

    .line 119
    .line 120
    :try_start_1
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :catch_1
    :cond_0
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->M0(Ljava/util/Collection;)[J

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Ljava/util/BitSet;->valueOf([J)Ljava/util/BitSet;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/util/BitSet;->size()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_1

    .line 149
    .line 150
    sget-object v0, La/xun;->a:La/xun;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_1
    new-instance v2, La/yni0;

    .line 154
    .line 155
    invoke-direct {v2, v1}, La/yni0;-><init>(I)V

    .line 156
    .line 157
    .line 158
    :goto_1
    if-ltz v3, :cond_4

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->get(I)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_2

    .line 165
    .line 166
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v2, v1}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_2
    const v1, 0x7fffffff

    .line 174
    .line 175
    .line 176
    if-ne v3, v1, :cond_3

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 180
    .line 181
    invoke-virtual {v0, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    goto :goto_1

    .line 186
    :cond_4
    :goto_2
    invoke-static {v2}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :goto_3
    return-object v0

    .line 191
    :pswitch_5
    sget-object v0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->w:La/r710;

    .line 192
    .line 193
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sget-object v1, La/tvk;->a:La/rwj;

    .line 198
    .line 199
    sget-object v1, La/ys10;->a:La/vs10;

    .line 200
    .line 201
    invoke-virtual {v1}, La/vs10;->x()La/vs10;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :pswitch_6
    sget-object v2, La/lak0;->c:La/lak0;

    .line 215
    .line 216
    sget-object v14, La/he;->b:La/he;

    .line 217
    .line 218
    new-instance v1, La/vxn0;

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/16 v18, 0x0

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    const/4 v5, 0x0

    .line 226
    const/4 v6, 0x1

    .line 227
    const/4 v7, 0x0

    .line 228
    const/4 v8, 0x0

    .line 229
    const/4 v9, 0x0

    .line 230
    const-string v10, ""

    .line 231
    .line 232
    const-string v11, ""

    .line 233
    .line 234
    const-string v12, ""

    .line 235
    .line 236
    const-string v13, ""

    .line 237
    .line 238
    const/4 v15, 0x0

    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    move-object v3, v2

    .line 242
    invoke-direct/range {v1 .. v18}, La/vxn0;-><init>(La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;)V

    .line 243
    .line 244
    .line 245
    return-object v1

    .line 246
    :pswitch_7
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 247
    .line 248
    new-instance v0, La/ssn0;

    .line 249
    .line 250
    invoke-direct {v0}, La/ssn0;-><init>()V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_8
    sget-object v0, La/tun0;->P1:La/y2m0;

    .line 255
    .line 256
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_9
    new-instance v0, La/zw3;

    .line 260
    .line 261
    sget-object v1, La/y2q;->a:La/y2q;

    .line 262
    .line 263
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 264
    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_a
    new-instance v0, La/zw3;

    .line 268
    .line 269
    sget-object v1, La/cpn0;->a:La/cpn0;

    .line 270
    .line 271
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 272
    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_b
    sget-object v0, La/ypn0;->h2:La/s9m0;

    .line 276
    .line 277
    new-instance v0, La/ssn0;

    .line 278
    .line 279
    invoke-direct {v0}, La/ssn0;-><init>()V

    .line 280
    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_c
    new-instance v0, La/ycl;

    .line 284
    .line 285
    const/4 v1, 0x0

    .line 286
    invoke-direct {v0, v1}, La/ycl;-><init>(F)V

    .line 287
    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    return-object v0

    .line 293
    :pswitch_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_f
    sget v0, La/ven0;->K:I

    .line 297
    .line 298
    return-object v2

    .line 299
    :pswitch_10
    new-instance v3, La/tbn0;

    .line 300
    .line 301
    sget-object v4, La/iun;->a:La/iun;

    .line 302
    .line 303
    sget-object v6, La/tan0;->a:La/tan0;

    .line 304
    .line 305
    sget-object v7, La/zan0;->a:La/zan0;

    .line 306
    .line 307
    sget-object v13, La/v5l0;->b:La/v5l0;

    .line 308
    .line 309
    const/4 v15, 0x0

    .line 310
    const/16 v16, 0x0

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    const/4 v8, 0x0

    .line 314
    const/4 v10, 0x0

    .line 315
    const/4 v11, 0x0

    .line 316
    const/4 v12, 0x0

    .line 317
    const/4 v14, 0x0

    .line 318
    move-object v9, v4

    .line 319
    invoke-direct/range {v3 .. v16}, La/tbn0;-><init>(Ljava/util/List;ZLa/tan0;La/zan0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZ)V

    .line 320
    .line 321
    .line 322
    return-object v3

    .line 323
    :pswitch_11
    sget-object v9, La/een0;->a:La/een0;

    .line 324
    .line 325
    sget-object v8, La/iun;->a:La/iun;

    .line 326
    .line 327
    new-instance v4, La/jen0;

    .line 328
    .line 329
    const/4 v6, 0x0

    .line 330
    const/4 v7, 0x0

    .line 331
    const/4 v5, 0x0

    .line 332
    invoke-direct/range {v4 .. v9}, La/jen0;-><init>(ZZZLjava/util/List;La/een0;)V

    .line 333
    .line 334
    .line 335
    return-object v4

    .line 336
    :pswitch_12
    sget v0, La/rdn0;->I:I

    .line 337
    .line 338
    return-object v2

    .line 339
    :pswitch_13
    new-instance v3, La/hdn0;

    .line 340
    .line 341
    sget-object v4, La/iun;->a:La/iun;

    .line 342
    .line 343
    sget-object v6, La/bdn0;->a:La/bdn0;

    .line 344
    .line 345
    sget-object v7, La/cdn0;->a:La/cdn0;

    .line 346
    .line 347
    sget-object v13, La/v5l0;->b:La/v5l0;

    .line 348
    .line 349
    const/4 v15, 0x0

    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    const/4 v5, 0x0

    .line 353
    const/4 v8, 0x0

    .line 354
    const/4 v10, 0x0

    .line 355
    const/4 v11, 0x0

    .line 356
    const/4 v12, 0x0

    .line 357
    const/4 v14, 0x0

    .line 358
    move-object v9, v4

    .line 359
    invoke-direct/range {v3 .. v16}, La/hdn0;-><init>(Ljava/util/List;ZLa/bdn0;La/cdn0;La/wcb;Ljava/util/List;ZZZLa/v5l0;ZZZ)V

    .line 360
    .line 361
    .line 362
    return-object v3

    .line 363
    :pswitch_14
    new-instance v0, La/zw3;

    .line 364
    .line 365
    sget-object v1, La/x6n0;->a:La/x6n0;

    .line 366
    .line 367
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_15
    new-instance v0, La/inv;

    .line 372
    .line 373
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 374
    .line 375
    new-instance v4, La/zw3;

    .line 376
    .line 377
    sget-object v5, La/r9n0;->a:La/r9n0;

    .line 378
    .line 379
    invoke-direct {v4, v5, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 380
    .line 381
    .line 382
    invoke-direct {v0, v2, v4, v1}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 383
    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_16
    new-instance v0, La/zw3;

    .line 387
    .line 388
    sget-object v1, La/p8n0;->a:La/p8n0;

    .line 389
    .line 390
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 391
    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_17
    new-instance v0, La/zw3;

    .line 395
    .line 396
    sget-object v1, La/s710;->a:La/s710;

    .line 397
    .line 398
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 399
    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_18
    new-instance v0, La/zw3;

    .line 403
    .line 404
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 405
    .line 406
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 411
    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_19
    new-instance v0, La/zw3;

    .line 415
    .line 416
    sget-object v1, La/l9n0;->a:La/l9n0;

    .line 417
    .line 418
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 419
    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_1a
    new-instance v0, La/zw3;

    .line 423
    .line 424
    sget-object v1, La/x6n0;->a:La/x6n0;

    .line 425
    .line 426
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 427
    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_1b
    new-instance v0, La/zw3;

    .line 431
    .line 432
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 433
    .line 434
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 435
    .line 436
    .line 437
    return-object v0

    .line 438
    :pswitch_1c
    new-instance v0, La/zw3;

    .line 439
    .line 440
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 441
    .line 442
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 443
    .line 444
    .line 445
    return-object v0

    .line 446
    nop

    .line 447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
