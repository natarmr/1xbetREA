.class public final synthetic La/p8w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/naw;


# direct methods
.method public synthetic constructor <init>(La/naw;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/p8w;->a:B

    iput-object p1, p0, La/p8w;->b:La/naw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/naw;La/n3w;)V
    .locals 0

    .line 1
    const/4 p2, 0x5

    iput-byte p2, p0, La/p8w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p8w;->b:La/naw;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p8w;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/p8w;->b:La/naw;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Throwable;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    instance-of v2, v1, La/zhi0;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v0, La/naw;->l0:La/q37;

    .line 23
    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, La/zhi0;

    .line 26
    .line 27
    iget-object v3, v3, La/zhi0;->c:La/kuw;

    .line 28
    .line 29
    invoke-interface {v3}, La/kuw;->getErrorCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget-object v4, v2, La/q37;->b:La/b4j;

    .line 34
    .line 35
    sget-object v5, La/a1w;->a:La/a1w;

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    sget-object v6, La/r6w;->k:La/r6w;

    .line 42
    .line 43
    invoke-virtual {v4, v5, v6}, La/b4j;->c(Ljava/lang/String;La/r6w;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, v2, La/q37;->c:La/au0;

    .line 47
    .line 48
    invoke-virtual {v6}, La/r6w;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v2, v3, v4}, La/au0;->f(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object v2, v0, La/naw;->W0:La/p7m0;

    .line 56
    .line 57
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    move-object v4, v3

    .line 62
    check-cast v4, La/l9h0;

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    const/16 v18, 0x7ffd

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x0

    .line 78
    const/4 v15, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    invoke-static/range {v4 .. v18}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_1

    .line 90
    .line 91
    iget-object v2, v0, La/naw;->M:La/duj;

    .line 92
    .line 93
    new-instance v3, La/q8w;

    .line 94
    .line 95
    invoke-direct {v3, v1, v0}, La/q8w;-><init>(Ljava/lang/Throwable;La/naw;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_0
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, Ljava/lang/Throwable;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v2, v0, La/naw;->M:La/duj;

    .line 112
    .line 113
    new-instance v3, La/q8w;

    .line 114
    .line 115
    invoke-direct {v3, v0, v1}, La/q8w;-><init>(La/naw;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_1
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, Ljava/util/List;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const/4 v4, 0x0

    .line 136
    if-nez v3, :cond_5

    .line 137
    .line 138
    iget-boolean v3, v0, La/naw;->F0:Z

    .line 139
    .line 140
    iget-wide v5, v0, La/naw;->x0:J

    .line 141
    .line 142
    if-eqz v3, :cond_5

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-eqz v7, :cond_3

    .line 153
    .line 154
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    move-object v8, v7

    .line 159
    check-cast v8, La/n3w;

    .line 160
    .line 161
    iget-object v8, v8, La/n3w;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_2

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_3
    const/4 v7, 0x0

    .line 175
    :goto_0
    check-cast v7, La/n3w;

    .line 176
    .line 177
    if-eqz v7, :cond_4

    .line 178
    .line 179
    iget-object v3, v7, La/n3w;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v0, v3}, La/naw;->F(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_4
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v0, v3}, La/naw;->F(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_1
    iput-boolean v4, v0, La/naw;->F0:Z

    .line 193
    .line 194
    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-nez v3, :cond_9

    .line 199
    .line 200
    iget-boolean v3, v0, La/naw;->P0:Z

    .line 201
    .line 202
    iget-object v5, v0, La/naw;->Q0:La/sff0;

    .line 203
    .line 204
    if-nez v3, :cond_9

    .line 205
    .line 206
    iget-object v3, v0, La/naw;->d:La/sys0;

    .line 207
    .line 208
    sget-object v6, La/sys0;->a:La/sys0;

    .line 209
    .line 210
    if-ne v3, v6, :cond_9

    .line 211
    .line 212
    iget-boolean v3, v5, La/sff0;->y1:Z

    .line 213
    .line 214
    if-eqz v3, :cond_9

    .line 215
    .line 216
    iget-object v3, v0, La/naw;->s0:La/pzu;

    .line 217
    .line 218
    invoke-virtual {v3}, La/pzu;->h0()Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_8

    .line 223
    .line 224
    iget v3, v5, La/sff0;->B1:I

    .line 225
    .line 226
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    if-eqz v1, :cond_6

    .line 231
    .line 232
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_6

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_7

    .line 248
    .line 249
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    check-cast v3, La/n3w;

    .line 254
    .line 255
    iget-object v3, v3, La/n3w;->l:La/e4f;

    .line 256
    .line 257
    sget-object v5, La/e4f;->f:La/e4f;

    .line 258
    .line 259
    if-ne v3, v5, :cond_8

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_7
    :goto_3
    iget-object v1, v0, La/naw;->O:La/i1w0;

    .line 263
    .line 264
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    iget-object v5, v0, La/naw;->t0:La/nh70;

    .line 269
    .line 270
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    new-instance v5, Lorg/xplatform/rate_app/impl/navigation/RateAppDialogFactoryImpl$getRateAppDialog$1;

    .line 274
    .line 275
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v5}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 279
    .line 280
    .line 281
    iget-object v3, v3, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 282
    .line 283
    invoke-static {v1, v3, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    :goto_4
    move-object v4, v3

    .line 288
    check-cast v4, La/paw;

    .line 289
    .line 290
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-eqz v5, :cond_8

    .line 295
    .line 296
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    check-cast v4, La/oe50;

    .line 301
    .line 302
    invoke-virtual {v1, v4}, La/i1w0;->a(La/oe50;)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    iput-boolean v2, v0, La/naw;->P0:Z

    .line 307
    .line 308
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_2
    move-object/from16 v1, p1

    .line 312
    .line 313
    check-cast v1, La/k0w0;

    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-object v0, v0, La/naw;->S:La/s2m0;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    new-instance v0, Lorg/xplatform/toto_jackpot/impl/navigation/TotoJackpotScreens$TotoJackpotDsFragmentScreen;

    .line 324
    .line 325
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, La/c8d;

    .line 335
    .line 336
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 337
    .line 338
    new-instance v3, La/v7d;

    .line 339
    .line 340
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 341
    .line 342
    .line 343
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 344
    .line 345
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_3
    move-object/from16 v1, p1

    .line 349
    .line 350
    check-cast v1, La/k0w0;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iget-object v0, v0, La/naw;->T:Lorg/xplatform/toto_bet/core/navigation/a;

    .line 356
    .line 357
    invoke-virtual {v0}, Lorg/xplatform/toto_bet/core/navigation/a;->a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, La/c8d;

    .line 368
    .line 369
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 370
    .line 371
    new-instance v3, La/v7d;

    .line 372
    .line 373
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 374
    .line 375
    .line 376
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 377
    .line 378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_4
    move-object/from16 v1, p1

    .line 382
    .line 383
    check-cast v1, Ljava/lang/Throwable;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    instance-of v2, v1, La/zhi0;

    .line 389
    .line 390
    if-eqz v2, :cond_a

    .line 391
    .line 392
    move-object v2, v1

    .line 393
    check-cast v2, La/zhi0;

    .line 394
    .line 395
    iget-object v2, v2, La/zhi0;->c:La/kuw;

    .line 396
    .line 397
    sget-object v3, La/i2o;->k1:La/i2o;

    .line 398
    .line 399
    if-ne v2, v3, :cond_a

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    if-eqz v1, :cond_a

    .line 406
    .line 407
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 408
    .line 409
    new-instance v2, La/g9w;

    .line 410
    .line 411
    invoke-direct {v2, v1}, La/g9w;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    return-object v0

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
