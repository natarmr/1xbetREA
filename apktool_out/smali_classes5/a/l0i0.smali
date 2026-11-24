.class public final synthetic La/l0i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/t0i0;Lkotlin/jvm/functions/Function1;La/rqm;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/l0i0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/l0i0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/l0i0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/l0i0;->e:Ljava/lang/Object;

    iput-object p4, p0, La/l0i0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/l0i0;->a:B

    iput-object p1, p0, La/l0i0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/l0i0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/l0i0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/l0i0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/l0i0;->a:B

    iput-object p1, p0, La/l0i0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/l0i0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/l0i0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/l0i0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l0i0;->a:B

    .line 4
    .line 5
    const v4, -0x4e295cff

    .line 6
    .line 7
    .line 8
    const/16 v5, 0x9

    .line 9
    .line 10
    const v6, 0x799532c4

    .line 11
    .line 12
    .line 13
    const v7, 0x2fd4df92

    .line 14
    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x0

    .line 19
    const-wide/16 v11, 0x28

    .line 20
    .line 21
    const/4 v13, 0x3

    .line 22
    const/4 v14, 0x1

    .line 23
    iget-object v15, v0, La/l0i0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v2, v0, La/l0i0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v3, v0, La/l0i0;->c:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v0, v0, La/l0i0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    check-cast v0, La/ki9;

    .line 35
    .line 36
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    check-cast v2, La/p6t0;

    .line 39
    .line 40
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, La/yfu0;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v4, v0, La/ki9;->a:La/p6t0;

    .line 50
    .line 51
    if-nez v4, :cond_0

    .line 52
    .line 53
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-interface {v2, v4, v2}, La/p6t0;->o(La/p6t0;La/p6t0;)Ljava/util/Collection;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    check-cast v3, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, La/r6t0;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {v15, v1, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    :goto_1
    iput-object v2, v0, La/ki9;->a:La/p6t0;

    .line 89
    .line 90
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_0
    check-cast v0, La/jdt0;

    .line 94
    .line 95
    move-object/from16 v17, v3

    .line 96
    .line 97
    check-cast v17, Ljava/lang/String;

    .line 98
    .line 99
    check-cast v2, La/kie0;

    .line 100
    .line 101
    check-cast v15, La/q8t0;

    .line 102
    .line 103
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/k0w0;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    iget-object v4, v0, La/jdt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 115
    .line 116
    iget-wide v5, v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 117
    .line 118
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_2

    .line 127
    .line 128
    iget-object v0, v0, La/jdt0;->w:La/gr00;

    .line 129
    .line 130
    new-instance v16, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 131
    .line 132
    iget-wide v3, v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 133
    .line 134
    iget v2, v2, La/kie0;->a:I

    .line 135
    .line 136
    const-string v22, ""

    .line 137
    .line 138
    const-wide/16 v26, -0x1

    .line 139
    .line 140
    const/16 v20, 0x0

    .line 141
    .line 142
    move-object/from16 v23, v22

    .line 143
    .line 144
    move-object/from16 v24, v22

    .line 145
    .line 146
    move-object/from16 v25, v22

    .line 147
    .line 148
    move-object/from16 v28, v22

    .line 149
    .line 150
    move/from16 v21, v2

    .line 151
    .line 152
    move-wide/from16 v18, v3

    .line 153
    .line 154
    invoke-direct/range {v16 .. v28}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v2, v16

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 163
    .line 164
    invoke-direct {v3, v2, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    iget-object v0, v0, La/jdt0;->x:La/yfm0;

    .line 169
    .line 170
    iget-wide v2, v15, La/q8t0;->a:J

    .line 171
    .line 172
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v0, La/zfm0;

    .line 177
    .line 178
    invoke-virtual {v0, v11, v12, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    :goto_2
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 183
    .line 184
    .line 185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_1
    check-cast v0, La/wbt0;

    .line 189
    .line 190
    move-object/from16 v17, v3

    .line 191
    .line 192
    check-cast v17, Ljava/lang/String;

    .line 193
    .line 194
    check-cast v2, La/kie0;

    .line 195
    .line 196
    check-cast v15, La/hbt0;

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/k0w0;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    iget-object v4, v0, La/wbt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 210
    .line 211
    iget-wide v5, v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;->c:J

    .line 212
    .line 213
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_3

    .line 222
    .line 223
    iget-object v0, v0, La/wbt0;->t:La/gr00;

    .line 224
    .line 225
    new-instance v16, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 226
    .line 227
    iget-wide v3, v4, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;->c:J

    .line 228
    .line 229
    iget v2, v2, La/kie0;->a:I

    .line 230
    .line 231
    const-string v22, ""

    .line 232
    .line 233
    const-wide/16 v26, -0x1

    .line 234
    .line 235
    const/16 v20, 0x0

    .line 236
    .line 237
    move-object/from16 v23, v22

    .line 238
    .line 239
    move-object/from16 v24, v22

    .line 240
    .line 241
    move-object/from16 v25, v22

    .line 242
    .line 243
    move-object/from16 v28, v22

    .line 244
    .line 245
    move/from16 v21, v2

    .line 246
    .line 247
    move-wide/from16 v18, v3

    .line 248
    .line 249
    invoke-direct/range {v16 .. v28}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v2, v16

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 258
    .line 259
    invoke-direct {v3, v2, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_3
    iget-object v0, v0, La/wbt0;->u:La/yfm0;

    .line 264
    .line 265
    iget-wide v2, v15, La/hbt0;->a:J

    .line 266
    .line 267
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v0, La/zfm0;

    .line 272
    .line 273
    invoke-virtual {v0, v11, v12, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    :goto_3
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_2
    check-cast v0, La/pu90;

    .line 284
    .line 285
    check-cast v3, La/pu90;

    .line 286
    .line 287
    check-cast v2, La/pu90;

    .line 288
    .line 289
    check-cast v15, La/t33;

    .line 290
    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, La/ou90;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    const/4 v4, 0x0

    .line 299
    if-eqz v0, :cond_4

    .line 300
    .line 301
    invoke-virtual {v1, v0, v10, v10, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 302
    .line 303
    .line 304
    :cond_4
    if-eqz v3, :cond_5

    .line 305
    .line 306
    invoke-virtual {v1, v3, v10, v10, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 307
    .line 308
    .line 309
    :cond_5
    if-eqz v2, :cond_6

    .line 310
    .line 311
    invoke-virtual {v15}, La/t33;->d()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Ljava/lang/Number;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    invoke-static {v0}, La/si30;->b(F)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    invoke-virtual {v1, v2, v10, v0, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 326
    .line 327
    .line 328
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_3
    check-cast v0, La/o6s0;

    .line 332
    .line 333
    check-cast v3, La/lie0;

    .line 334
    .line 335
    check-cast v2, La/kie0;

    .line 336
    .line 337
    check-cast v15, La/vne;

    .line 338
    .line 339
    move-object/from16 v1, p1

    .line 340
    .line 341
    check-cast v1, La/t33;

    .line 342
    .line 343
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, La/ne60;

    .line 348
    .line 349
    iget-wide v4, v1, La/ne60;->a:J

    .line 350
    .line 351
    invoke-virtual {v0, v4, v5}, La/o6s0;->b(J)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, La/o6s0;->a()J

    .line 355
    .line 356
    .line 357
    move-result-wide v0

    .line 358
    iget-wide v4, v3, La/lie0;->a:J

    .line 359
    .line 360
    invoke-static {v0, v1, v4, v5}, La/ne60;->c(JJ)Z

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    if-eqz v4, :cond_7

    .line 365
    .line 366
    iget v0, v2, La/kie0;->a:I

    .line 367
    .line 368
    add-int/2addr v0, v14

    .line 369
    iput v0, v2, La/kie0;->a:I

    .line 370
    .line 371
    if-lt v0, v9, :cond_8

    .line 372
    .line 373
    invoke-static {v15, v8}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 374
    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_7
    iput v10, v2, La/kie0;->a:I

    .line 378
    .line 379
    iput-wide v0, v3, La/lie0;->a:J

    .line 380
    .line 381
    :cond_8
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object v0

    .line 384
    :pswitch_4
    check-cast v0, La/a4x;

    .line 385
    .line 386
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 387
    .line 388
    move-object v4, v2

    .line 389
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 390
    .line 391
    move-object v5, v15

    .line 392
    check-cast v5, La/xdr;

    .line 393
    .line 394
    move-object/from16 v8, p1

    .line 395
    .line 396
    check-cast v8, La/hcz;

    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    new-instance v1, La/t9r0;

    .line 402
    .line 403
    const/16 v2, 0x16

    .line 404
    .line 405
    invoke-direct {v1, v2}, La/t9r0;-><init>(B)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 409
    .line 410
    .line 411
    move-result v9

    .line 412
    new-instance v10, La/xlr0;

    .line 413
    .line 414
    invoke-direct {v10, v1, v0, v14}, La/xlr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 415
    .line 416
    .line 417
    new-instance v11, La/vdr0;

    .line 418
    .line 419
    const/4 v1, 0x4

    .line 420
    invoke-direct {v11, v0, v1}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 421
    .line 422
    .line 423
    new-instance v1, La/gq4;

    .line 424
    .line 425
    const/16 v6, 0xf

    .line 426
    .line 427
    move-object v2, v0

    .line 428
    invoke-direct/range {v1 .. v6}, La/gq4;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 429
    .line 430
    .line 431
    new-instance v0, La/ugd;

    .line 432
    .line 433
    invoke-direct {v0, v7, v14, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v8, v9, v10, v11, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 437
    .line 438
    .line 439
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    return-object v0

    .line 442
    :pswitch_5
    check-cast v0, La/a4x;

    .line 443
    .line 444
    check-cast v2, La/he80;

    .line 445
    .line 446
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 447
    .line 448
    check-cast v15, Lkotlin/jvm/functions/Function2;

    .line 449
    .line 450
    move-object/from16 v1, p1

    .line 451
    .line 452
    check-cast v1, La/hcz;

    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    new-instance v4, La/gcn0;

    .line 458
    .line 459
    const/16 v5, 0xe

    .line 460
    .line 461
    invoke-direct {v4, v2, v5}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 462
    .line 463
    .line 464
    new-instance v2, La/ugd;

    .line 465
    .line 466
    const v5, -0x3dc9dda6

    .line 467
    .line 468
    .line 469
    invoke-direct {v2, v5, v14, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-static {v1, v8, v8, v2, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    new-instance v4, La/vdr0;

    .line 480
    .line 481
    invoke-direct {v4, v0, v13}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 482
    .line 483
    .line 484
    new-instance v5, La/zip0;

    .line 485
    .line 486
    const/4 v7, 0x5

    .line 487
    invoke-direct {v5, v0, v3, v15, v7}, La/zip0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 488
    .line 489
    .line 490
    new-instance v0, La/ugd;

    .line 491
    .line 492
    invoke-direct {v0, v6, v14, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1, v2, v8, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 496
    .line 497
    .line 498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_6
    move-object v6, v0

    .line 502
    check-cast v6, La/a4x;

    .line 503
    .line 504
    move-object v7, v3

    .line 505
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 506
    .line 507
    move-object v8, v2

    .line 508
    check-cast v8, La/qj50;

    .line 509
    .line 510
    move-object v9, v15

    .line 511
    check-cast v9, La/hh80;

    .line 512
    .line 513
    move-object/from16 v0, p1

    .line 514
    .line 515
    check-cast v0, La/hcz;

    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v1, La/t9r0;

    .line 521
    .line 522
    invoke-direct {v1, v5}, La/t9r0;-><init>(B)V

    .line 523
    .line 524
    .line 525
    new-instance v2, La/t9r0;

    .line 526
    .line 527
    const/16 v3, 0xa

    .line 528
    .line 529
    invoke-direct {v2, v3}, La/t9r0;-><init>(B)V

    .line 530
    .line 531
    .line 532
    invoke-static {v6, v1}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    new-instance v11, La/vdr0;

    .line 541
    .line 542
    invoke-direct {v11, v1, v10}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 543
    .line 544
    .line 545
    new-instance v1, La/zcn0;

    .line 546
    .line 547
    const/16 v5, 0x1d

    .line 548
    .line 549
    invoke-direct {v1, v2, v6, v5}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 550
    .line 551
    .line 552
    new-instance v5, La/gq4;

    .line 553
    .line 554
    const/16 v10, 0xe

    .line 555
    .line 556
    invoke-direct/range {v5 .. v10}, La/gq4;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 557
    .line 558
    .line 559
    new-instance v2, La/ugd;

    .line 560
    .line 561
    invoke-direct {v2, v4, v14, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v3, v11, v1, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 565
    .line 566
    .line 567
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 568
    .line 569
    return-object v0

    .line 570
    :pswitch_7
    check-cast v0, La/wbp0;

    .line 571
    .line 572
    move-object/from16 v17, v3

    .line 573
    .line 574
    check-cast v17, Ljava/lang/String;

    .line 575
    .line 576
    check-cast v2, La/kie0;

    .line 577
    .line 578
    check-cast v15, La/h8p0;

    .line 579
    .line 580
    move-object/from16 v1, p1

    .line 581
    .line 582
    check-cast v1, La/k0w0;

    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    iget-object v4, v0, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 592
    .line 593
    iget-wide v5, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 594
    .line 595
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-eqz v3, :cond_9

    .line 604
    .line 605
    iget-object v0, v0, La/wbp0;->y:La/gr00;

    .line 606
    .line 607
    new-instance v16, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 608
    .line 609
    iget-wide v3, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 610
    .line 611
    iget v2, v2, La/kie0;->a:I

    .line 612
    .line 613
    const-string v22, ""

    .line 614
    .line 615
    const-wide/16 v26, -0x1

    .line 616
    .line 617
    const/16 v20, 0x0

    .line 618
    .line 619
    move-object/from16 v23, v22

    .line 620
    .line 621
    move-object/from16 v24, v22

    .line 622
    .line 623
    move-object/from16 v25, v22

    .line 624
    .line 625
    move-object/from16 v28, v22

    .line 626
    .line 627
    move/from16 v21, v2

    .line 628
    .line 629
    move-wide/from16 v18, v3

    .line 630
    .line 631
    invoke-direct/range {v16 .. v28}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 632
    .line 633
    .line 634
    move-object/from16 v2, v16

    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 640
    .line 641
    invoke-direct {v3, v2, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 642
    .line 643
    .line 644
    goto :goto_5

    .line 645
    :cond_9
    iget-object v0, v0, La/wbp0;->z:La/yfm0;

    .line 646
    .line 647
    iget-wide v2, v15, La/h8p0;->a:J

    .line 648
    .line 649
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    check-cast v0, La/zfm0;

    .line 654
    .line 655
    invoke-virtual {v0, v11, v12, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    :goto_5
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 660
    .line 661
    .line 662
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 663
    .line 664
    return-object v0

    .line 665
    :pswitch_8
    check-cast v0, La/zap0;

    .line 666
    .line 667
    move-object/from16 v17, v3

    .line 668
    .line 669
    check-cast v17, Ljava/lang/String;

    .line 670
    .line 671
    check-cast v2, La/kie0;

    .line 672
    .line 673
    check-cast v15, La/lap0;

    .line 674
    .line 675
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, La/k0w0;

    .line 678
    .line 679
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    iget-object v4, v0, La/zap0;->o:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;

    .line 687
    .line 688
    iget-wide v5, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;->a:J

    .line 689
    .line 690
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    if-eqz v3, :cond_a

    .line 699
    .line 700
    iget-object v0, v0, La/zap0;->u:La/gr00;

    .line 701
    .line 702
    new-instance v16, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 703
    .line 704
    iget-wide v3, v4, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsResultsParams;->a:J

    .line 705
    .line 706
    iget v2, v2, La/kie0;->a:I

    .line 707
    .line 708
    const-string v22, ""

    .line 709
    .line 710
    const-wide/16 v26, -0x1

    .line 711
    .line 712
    const/16 v20, 0x0

    .line 713
    .line 714
    move-object/from16 v23, v22

    .line 715
    .line 716
    move-object/from16 v24, v22

    .line 717
    .line 718
    move-object/from16 v25, v22

    .line 719
    .line 720
    move-object/from16 v28, v22

    .line 721
    .line 722
    move/from16 v21, v2

    .line 723
    .line 724
    move-wide/from16 v18, v3

    .line 725
    .line 726
    invoke-direct/range {v16 .. v28}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 727
    .line 728
    .line 729
    move-object/from16 v2, v16

    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 735
    .line 736
    invoke-direct {v3, v2, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 737
    .line 738
    .line 739
    goto :goto_6

    .line 740
    :cond_a
    iget-object v0, v0, La/zap0;->v:La/yfm0;

    .line 741
    .line 742
    iget-wide v2, v15, La/lap0;->a:J

    .line 743
    .line 744
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    check-cast v0, La/zfm0;

    .line 749
    .line 750
    invoke-virtual {v0, v11, v12, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    :goto_6
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 755
    .line 756
    .line 757
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 758
    .line 759
    return-object v0

    .line 760
    :pswitch_9
    check-cast v0, La/aqm0;

    .line 761
    .line 762
    check-cast v3, La/jzj;

    .line 763
    .line 764
    move-object v4, v2

    .line 765
    check-cast v4, La/xpm0;

    .line 766
    .line 767
    check-cast v15, La/pot0;

    .line 768
    .line 769
    move-object/from16 v1, p1

    .line 770
    .line 771
    check-cast v1, Ljava/lang/Throwable;

    .line 772
    .line 773
    instance-of v2, v1, La/ozw;

    .line 774
    .line 775
    if-eqz v2, :cond_b

    .line 776
    .line 777
    move-object v2, v1

    .line 778
    check-cast v2, La/ozw;

    .line 779
    .line 780
    iget-byte v2, v2, La/ozw;->a:B

    .line 781
    .line 782
    if-ne v2, v13, :cond_b

    .line 783
    .line 784
    iget-object v1, v0, La/aqm0;->b:La/tpt0;

    .line 785
    .line 786
    iget-object v7, v1, La/tpt0;->f:La/sje;

    .line 787
    .line 788
    new-instance v1, La/lpp;

    .line 789
    .line 790
    const/4 v6, 0x6

    .line 791
    const/4 v5, 0x0

    .line 792
    move-object v2, v0

    .line 793
    move-object v3, v15

    .line 794
    invoke-direct/range {v1 .. v6}, La/lpp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 795
    .line 796
    .line 797
    invoke-static {v7, v5, v5, v1, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 798
    .line 799
    .line 800
    goto :goto_7

    .line 801
    :cond_b
    iget-object v0, v4, La/xpm0;->d:La/odd;

    .line 802
    .line 803
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    if-eqz v1, :cond_d

    .line 807
    .line 808
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 809
    .line 810
    if-eqz v2, :cond_c

    .line 811
    .line 812
    check-cast v1, Ljava/util/concurrent/CancellationException;

    .line 813
    .line 814
    invoke-virtual {v0, v1}, La/pby;->s(Ljava/lang/Throwable;)V

    .line 815
    .line 816
    .line 817
    goto :goto_7

    .line 818
    :cond_c
    invoke-virtual {v0, v1}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 819
    .line 820
    .line 821
    goto :goto_7

    .line 822
    :cond_d
    invoke-interface {v3}, La/jzj;->getCompleted()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 830
    .line 831
    return-object v0

    .line 832
    :pswitch_a
    move-object v10, v0

    .line 833
    check-cast v10, La/nsl0;

    .line 834
    .line 835
    move-object v9, v3

    .line 836
    check-cast v9, La/ekf0;

    .line 837
    .line 838
    move-object v11, v2

    .line 839
    check-cast v11, La/pz40;

    .line 840
    .line 841
    move-object v12, v15

    .line 842
    check-cast v12, La/vne;

    .line 843
    .line 844
    move-object/from16 v0, p1

    .line 845
    .line 846
    check-cast v0, La/hcz;

    .line 847
    .line 848
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    iget-object v8, v10, La/nsl0;->c:La/a4x;

    .line 852
    .line 853
    new-instance v1, La/gcl0;

    .line 854
    .line 855
    const/16 v2, 0xf

    .line 856
    .line 857
    invoke-direct {v1, v2}, La/gcl0;-><init>(B)V

    .line 858
    .line 859
    .line 860
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    new-instance v3, La/o3l0;

    .line 865
    .line 866
    const/16 v4, 0x12

    .line 867
    .line 868
    invoke-direct {v3, v1, v8, v4}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 869
    .line 870
    .line 871
    new-instance v1, La/y9k0;

    .line 872
    .line 873
    const/16 v4, 0x14

    .line 874
    .line 875
    invoke-direct {v1, v8, v4}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 876
    .line 877
    .line 878
    new-instance v7, La/vll;

    .line 879
    .line 880
    const/4 v13, 0x4

    .line 881
    invoke-direct/range {v7 .. v13}, La/vll;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 882
    .line 883
    .line 884
    new-instance v4, La/ugd;

    .line 885
    .line 886
    invoke-direct {v4, v6, v14, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v0, v2, v3, v1, v4}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 890
    .line 891
    .line 892
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 893
    .line 894
    return-object v0

    .line 895
    :pswitch_b
    move-object v7, v0

    .line 896
    check-cast v7, La/f1l0;

    .line 897
    .line 898
    move-object v8, v2

    .line 899
    check-cast v8, La/w6k;

    .line 900
    .line 901
    move-object v9, v3

    .line 902
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 903
    .line 904
    move-object v10, v15

    .line 905
    check-cast v10, La/pz40;

    .line 906
    .line 907
    move-object/from16 v0, p1

    .line 908
    .line 909
    check-cast v0, La/hcz;

    .line 910
    .line 911
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    new-instance v6, La/v1i0;

    .line 915
    .line 916
    const/4 v11, 0x2

    .line 917
    invoke-direct/range {v6 .. v11}, La/v1i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 918
    .line 919
    .line 920
    new-instance v1, La/ugd;

    .line 921
    .line 922
    const v2, -0x786ec59b

    .line 923
    .line 924
    .line 925
    invoke-direct {v1, v2, v14, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 926
    .line 927
    .line 928
    const-string v2, "TOP_CONTENT_KEY"

    .line 929
    .line 930
    invoke-virtual {v0, v2, v2, v1}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 931
    .line 932
    .line 933
    instance-of v1, v7, La/e1l0;

    .line 934
    .line 935
    if-eqz v1, :cond_e

    .line 936
    .line 937
    check-cast v7, La/e1l0;

    .line 938
    .line 939
    iget-object v1, v7, La/e1l0;->g:La/a4x;

    .line 940
    .line 941
    new-instance v2, La/ejk0;

    .line 942
    .line 943
    const/16 v3, 0x11

    .line 944
    .line 945
    invoke-direct {v2, v3}, La/ejk0;-><init>(B)V

    .line 946
    .line 947
    .line 948
    new-instance v3, La/ejk0;

    .line 949
    .line 950
    const/16 v6, 0x12

    .line 951
    .line 952
    invoke-direct {v3, v6}, La/ejk0;-><init>(B)V

    .line 953
    .line 954
    .line 955
    invoke-static {v1, v2}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 960
    .line 961
    .line 962
    move-result v6

    .line 963
    new-instance v7, La/y9k0;

    .line 964
    .line 965
    invoke-direct {v7, v2, v13}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 966
    .line 967
    .line 968
    new-instance v2, La/pwe0;

    .line 969
    .line 970
    const/16 v8, 0x1b

    .line 971
    .line 972
    invoke-direct {v2, v3, v1, v8}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 973
    .line 974
    .line 975
    new-instance v3, La/zd1;

    .line 976
    .line 977
    invoke-direct {v3, v1, v5}, La/zd1;-><init>(La/a4x;B)V

    .line 978
    .line 979
    .line 980
    new-instance v1, La/ugd;

    .line 981
    .line 982
    invoke-direct {v1, v4, v14, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0, v6, v7, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 986
    .line 987
    .line 988
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 989
    .line 990
    return-object v0

    .line 991
    :pswitch_c
    check-cast v0, La/kd30;

    .line 992
    .line 993
    move-object v6, v3

    .line 994
    check-cast v6, Landroidx/fragment/app/Fragment;

    .line 995
    .line 996
    move-object v8, v2

    .line 997
    check-cast v8, Landroid/view/ViewGroup;

    .line 998
    .line 999
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 1000
    .line 1001
    move-object/from16 v18, p1

    .line 1002
    .line 1003
    check-cast v18, Ljava/lang/String;

    .line 1004
    .line 1005
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    iget-object v0, v0, La/kd30;->b:Ljava/lang/Object;

    .line 1009
    .line 1010
    move-object v4, v0

    .line 1011
    check-cast v4, La/wdk0;

    .line 1012
    .line 1013
    new-instance v16, La/xdk0;

    .line 1014
    .line 1015
    sget-object v17, La/rek0;->b:La/rek0;

    .line 1016
    .line 1017
    const/16 v22, 0x0

    .line 1018
    .line 1019
    const/16 v23, 0x7c

    .line 1020
    .line 1021
    const/16 v19, 0x0

    .line 1022
    .line 1023
    const/16 v20, 0x0

    .line 1024
    .line 1025
    const/16 v21, 0x0

    .line 1026
    .line 1027
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1028
    .line 1029
    .line 1030
    const/4 v10, 0x0

    .line 1031
    const/16 v11, 0x3f4

    .line 1032
    .line 1033
    const/4 v7, 0x0

    .line 1034
    const/4 v9, 0x0

    .line 1035
    move-object/from16 v5, v16

    .line 1036
    .line 1037
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1038
    .line 1039
    .line 1040
    invoke-interface {v15}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    :pswitch_d
    check-cast v0, La/l7m0;

    .line 1047
    .line 1048
    check-cast v3, Ljava/util/List;

    .line 1049
    .line 1050
    check-cast v2, La/xk80;

    .line 1051
    .line 1052
    check-cast v15, La/vne;

    .line 1053
    .line 1054
    move-object/from16 v1, p1

    .line 1055
    .line 1056
    check-cast v1, La/mxx;

    .line 1057
    .line 1058
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    iget-object v1, v1, La/mxx;->b:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 1062
    .line 1063
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/tabs/DsTabs;->getCurrentTabsStyle()La/aoo0;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v4

    .line 1067
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v5

    .line 1071
    check-cast v5, La/ucj0;

    .line 1072
    .line 1073
    iget-object v5, v5, La/ucj0;->f:La/aoo0;

    .line 1074
    .line 1075
    if-ne v4, v5, :cond_f

    .line 1076
    .line 1077
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/tabs/DsTabs;->getSelectedTabModel()La/s4i;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    if-nez v4, :cond_10

    .line 1082
    .line 1083
    :cond_f
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    check-cast v0, La/ucj0;

    .line 1088
    .line 1089
    iget-object v0, v0, La/ucj0;->f:La/aoo0;

    .line 1090
    .line 1091
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setTabsStyle(La/aoo0;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/tabs/DsTabs;->c(Ljava/util/List;)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v0, La/euv;

    .line 1098
    .line 1099
    invoke-direct {v0, v13, v15, v2}, La/euv;-><init>(BLa/vne;La/xk80;)V

    .line 1100
    .line 1101
    .line 1102
    iput-object v0, v1, Lorg/xplatform/uikit/components/tabs/DsTabs;->v:Lkotlin/jvm/functions/Function1;

    .line 1103
    .line 1104
    :cond_10
    invoke-virtual {v2}, La/xk80;->k()I

    .line 1105
    .line 1106
    .line 1107
    move-result v0

    .line 1108
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/tabs/DsTabs;->k(I)V

    .line 1109
    .line 1110
    .line 1111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1112
    .line 1113
    return-object v0

    .line 1114
    :pswitch_e
    check-cast v0, La/t0i0;

    .line 1115
    .line 1116
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1117
    .line 1118
    check-cast v15, La/rqm;

    .line 1119
    .line 1120
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1121
    .line 1122
    move-object/from16 v1, p1

    .line 1123
    .line 1124
    check-cast v1, La/hcz;

    .line 1125
    .line 1126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1127
    .line 1128
    .line 1129
    new-instance v4, La/rqc0;

    .line 1130
    .line 1131
    const/4 v5, 0x7

    .line 1132
    invoke-direct {v4, v15, v5}, La/rqc0;-><init>(Ljava/lang/Object;B)V

    .line 1133
    .line 1134
    .line 1135
    new-instance v6, La/ugd;

    .line 1136
    .line 1137
    const v10, -0x2a4f9d77

    .line 1138
    .line 1139
    .line 1140
    invoke-direct {v6, v10, v14, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1141
    .line 1142
    .line 1143
    const-string v4, "points"

    .line 1144
    .line 1145
    invoke-static {v1, v4, v8, v6, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1146
    .line 1147
    .line 1148
    const-string v4, "rules_footer"

    .line 1149
    .line 1150
    sget-object v6, La/ay3;->k:La/ugd;

    .line 1151
    .line 1152
    invoke-static {v1, v4, v8, v6, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1153
    .line 1154
    .line 1155
    iget-object v4, v0, La/t0i0;->a:La/a4x;

    .line 1156
    .line 1157
    new-instance v6, La/eoh0;

    .line 1158
    .line 1159
    invoke-direct {v6, v5}, La/eoh0;-><init>(B)V

    .line 1160
    .line 1161
    .line 1162
    new-instance v5, La/eoh0;

    .line 1163
    .line 1164
    const/16 v10, 0x8

    .line 1165
    .line 1166
    invoke-direct {v5, v10}, La/eoh0;-><init>(B)V

    .line 1167
    .line 1168
    .line 1169
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1170
    .line 1171
    .line 1172
    move-result v10

    .line 1173
    new-instance v11, La/pwe0;

    .line 1174
    .line 1175
    const/16 v12, 0x13

    .line 1176
    .line 1177
    invoke-direct {v11, v6, v4, v12}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v6, La/pwe0;

    .line 1181
    .line 1182
    const/16 v12, 0x14

    .line 1183
    .line 1184
    invoke-direct {v6, v5, v4, v12}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1185
    .line 1186
    .line 1187
    new-instance v5, La/njh0;

    .line 1188
    .line 1189
    invoke-direct {v5, v4, v2, v9}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1190
    .line 1191
    .line 1192
    new-instance v2, La/ugd;

    .line 1193
    .line 1194
    invoke-direct {v2, v7, v14, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v1, v10, v11, v6, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1198
    .line 1199
    .line 1200
    iget-object v2, v0, La/t0i0;->c:La/r0i0;

    .line 1201
    .line 1202
    instance-of v4, v2, La/o0i0;

    .line 1203
    .line 1204
    if-eqz v4, :cond_11

    .line 1205
    .line 1206
    const-string v0, "info_footer"

    .line 1207
    .line 1208
    sget-object v2, La/ay3;->l:La/ugd;

    .line 1209
    .line 1210
    invoke-static {v1, v0, v8, v2, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1211
    .line 1212
    .line 1213
    goto :goto_8

    .line 1214
    :cond_11
    instance-of v2, v2, La/q0i0;

    .line 1215
    .line 1216
    if-eqz v2, :cond_12

    .line 1217
    .line 1218
    new-instance v2, La/in80;

    .line 1219
    .line 1220
    const/16 v4, 0x15

    .line 1221
    .line 1222
    invoke-direct {v2, v3, v0, v4}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1223
    .line 1224
    .line 1225
    new-instance v0, La/ugd;

    .line 1226
    .line 1227
    const v3, 0x32bc2a5c

    .line 1228
    .line 1229
    .line 1230
    invoke-direct {v0, v3, v14, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    const-string v2, "single_cashback"

    .line 1234
    .line 1235
    invoke-static {v1, v2, v8, v0, v9}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1236
    .line 1237
    .line 1238
    :cond_12
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1239
    .line 1240
    return-object v0

    .line 1241
    :pswitch_data_0
    .packed-switch 0x0
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
