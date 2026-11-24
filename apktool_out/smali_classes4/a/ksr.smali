.class public final synthetic La/ksr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yys;


# direct methods
.method public synthetic constructor <init>(La/yys;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ksr;->a:B

    iput-object p1, p0, La/ksr;->b:La/yys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ksr;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/ksr;->b:La/yys;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v4, La/p39;->c:La/p39;

    .line 17
    .line 18
    sget-object v5, La/v39;->b:La/v39;

    .line 19
    .line 20
    iget-object v3, v0, La/yys;->A:La/xex;

    .line 21
    .line 22
    iget-object v1, v0, La/yys;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 23
    .line 24
    iget-wide v6, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 25
    .line 26
    iget-wide v8, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 27
    .line 28
    iget-wide v10, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 29
    .line 30
    invoke-virtual/range {v3 .. v11}, La/xex;->N(La/p39;La/v39;JJJ)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, La/yys;->B:La/p7m0;

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move-object v4, v3

    .line 40
    check-cast v4, La/ixs;

    .line 41
    .line 42
    const/16 v19, 0x0

    .line 43
    .line 44
    const v20, 0x5ffff

    .line 45
    .line 46
    .line 47
    const-wide/16 v5, 0x0

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x0

    .line 53
    const/4 v11, 0x0

    .line 54
    const/4 v12, 0x0

    .line 55
    const/4 v13, 0x0

    .line 56
    const/4 v14, 0x0

    .line 57
    const/4 v15, 0x0

    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    invoke-static/range {v4 .. v20}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    iget-object v3, v0, La/yys;->C:La/p7m0;

    .line 75
    .line 76
    sget-object v4, La/nws;->b:La/nws;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v2, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v3, v0, La/yys;->f:La/xsc;

    .line 85
    .line 86
    invoke-virtual {v3}, La/xsc;->b()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, La/yys;->B()V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    sget-object v5, La/uys;->a:La/uys;

    .line 97
    .line 98
    iget-object v3, v0, La/yys;->p:La/mne;

    .line 99
    .line 100
    iget-object v7, v3, La/mne;->a:La/rwj;

    .line 101
    .line 102
    new-instance v8, La/sys;

    .line 103
    .line 104
    const/4 v3, 0x1

    .line 105
    invoke-direct {v8, v0, v2, v3}, La/sys;-><init>(La/yys;La/yje;B)V

    .line 106
    .line 107
    .line 108
    const/16 v9, 0xa

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 112
    .line 113
    .line 114
    iget-object v0, v0, La/yys;->c:La/ali;

    .line 115
    .line 116
    new-instance v2, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;

    .line 117
    .line 118
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, La/ixs;

    .line 123
    .line 124
    iget-wide v3, v3, La/ixs;->a:J

    .line 125
    .line 126
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, La/ixs;

    .line 131
    .line 132
    iget-wide v5, v5, La/ixs;->b:J

    .line 133
    .line 134
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, La/ixs;

    .line 139
    .line 140
    iget-object v9, v7, La/ixs;->c:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, La/ixs;

    .line 147
    .line 148
    iget-wide v7, v7, La/ixs;->d:J

    .line 149
    .line 150
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, La/ixs;

    .line 155
    .line 156
    iget-object v10, v1, La/ixs;->e:Ljava/lang/String;

    .line 157
    .line 158
    const/4 v11, 0x0

    .line 159
    invoke-direct/range {v2 .. v11}, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;-><init>(JJJLjava/lang/String;Ljava/lang/String;Z)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v0, La/ali;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, La/oeg0;

    .line 165
    .line 166
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    new-instance v3, Lorg/xplatform/game_broadcasting/impl/navigation/BroadcastingVideoFullScreenFactory$getScreen$1;

    .line 175
    .line 176
    invoke-direct {v3, v2}, Lorg/xplatform/game_broadcasting/impl/navigation/BroadcastingVideoFullScreenFactory$getScreen$1;-><init>(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;)V

    .line 177
    .line 178
    .line 179
    instance-of v2, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 180
    .line 181
    if-eqz v2, :cond_1

    .line 182
    .line 183
    new-instance v2, La/e1w0;

    .line 184
    .line 185
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 186
    .line 187
    invoke-direct {v2, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 188
    .line 189
    .line 190
    new-instance v3, La/c8d;

    .line 191
    .line 192
    sget-object v4, La/y7d;->a:La/v7d;

    .line 193
    .line 194
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_1
    new-instance v2, La/w0w0;

    .line 202
    .line 203
    invoke-direct {v2, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 204
    .line 205
    .line 206
    new-instance v3, La/c8d;

    .line 207
    .line 208
    sget-object v4, La/y7d;->a:La/v7d;

    .line 209
    .line 210
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    :goto_0
    const/4 v2, 0x0

    .line 217
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :goto_1
    move-object v2, v1

    .line 222
    check-cast v2, La/paw;

    .line 223
    .line 224
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_2

    .line 229
    .line 230
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, La/oe50;

    .line 235
    .line 236
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_2
    return-void

    .line 241
    :pswitch_0
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 242
    .line 243
    iget-object v1, v0, La/yys;->B:La/p7m0;

    .line 244
    .line 245
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, La/ixs;

    .line 250
    .line 251
    iget-boolean v2, v2, La/ixs;->f:Z

    .line 252
    .line 253
    if-eqz v2, :cond_4

    .line 254
    .line 255
    sget-object v4, La/p39;->b:La/p39;

    .line 256
    .line 257
    sget-object v5, La/v39;->b:La/v39;

    .line 258
    .line 259
    iget-object v3, v0, La/yys;->A:La/xex;

    .line 260
    .line 261
    iget-object v2, v0, La/yys;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 262
    .line 263
    iget-wide v6, v2, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 264
    .line 265
    iget-wide v8, v2, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 266
    .line 267
    iget-wide v10, v2, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 268
    .line 269
    invoke-virtual/range {v3 .. v11}, La/xex;->N(La/p39;La/v39;JJJ)V

    .line 270
    .line 271
    .line 272
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    move-object v3, v2

    .line 277
    check-cast v3, La/ixs;

    .line 278
    .line 279
    const/16 v18, 0x0

    .line 280
    .line 281
    const v19, 0x7ff9f

    .line 282
    .line 283
    .line 284
    const-wide/16 v4, 0x0

    .line 285
    .line 286
    const/4 v6, 0x0

    .line 287
    const/4 v7, 0x0

    .line 288
    const/4 v8, 0x0

    .line 289
    const/4 v9, 0x0

    .line 290
    const/4 v10, 0x0

    .line 291
    const/4 v11, 0x0

    .line 292
    const/4 v12, 0x0

    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const/16 v16, 0x0

    .line 297
    .line 298
    const/16 v17, 0x0

    .line 299
    .line 300
    invoke-static/range {v3 .. v19}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_3

    .line 309
    .line 310
    invoke-virtual {v0}, La/yys;->B()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, La/yys;->A()V

    .line 314
    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    move-object v3, v2

    .line 322
    check-cast v3, La/ixs;

    .line 323
    .line 324
    const/16 v18, 0x0

    .line 325
    .line 326
    const v19, 0x7ffdf

    .line 327
    .line 328
    .line 329
    const-wide/16 v4, 0x0

    .line 330
    .line 331
    const/4 v6, 0x0

    .line 332
    const/4 v7, 0x1

    .line 333
    const/4 v8, 0x0

    .line 334
    const/4 v9, 0x0

    .line 335
    const/4 v10, 0x0

    .line 336
    const/4 v11, 0x0

    .line 337
    const/4 v12, 0x0

    .line 338
    const/4 v13, 0x0

    .line 339
    const/4 v14, 0x0

    .line 340
    const/4 v15, 0x0

    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0x0

    .line 344
    .line 345
    invoke-static/range {v3 .. v19}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_4

    .line 354
    .line 355
    invoke-virtual {v0}, La/yys;->D()V

    .line 356
    .line 357
    .line 358
    :goto_2
    return-void

    .line 359
    :pswitch_1
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    sget-object v4, La/p39;->d:La/p39;

    .line 365
    .line 366
    sget-object v5, La/v39;->b:La/v39;

    .line 367
    .line 368
    iget-object v3, v0, La/yys;->A:La/xex;

    .line 369
    .line 370
    iget-object v1, v0, La/yys;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 371
    .line 372
    iget-wide v6, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 373
    .line 374
    iget-wide v8, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 375
    .line 376
    iget-wide v10, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 377
    .line 378
    invoke-virtual/range {v3 .. v11}, La/xex;->N(La/p39;La/v39;JJJ)V

    .line 379
    .line 380
    .line 381
    iget-object v1, v0, La/yys;->B:La/p7m0;

    .line 382
    .line 383
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    move-object v4, v3

    .line 388
    check-cast v4, La/ixs;

    .line 389
    .line 390
    const/16 v19, 0x0

    .line 391
    .line 392
    const v20, 0x5ffff

    .line 393
    .line 394
    .line 395
    const-wide/16 v5, 0x0

    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const/4 v8, 0x0

    .line 399
    const/4 v9, 0x0

    .line 400
    const/4 v10, 0x0

    .line 401
    const/4 v11, 0x0

    .line 402
    const/4 v12, 0x0

    .line 403
    const/4 v13, 0x0

    .line 404
    const/4 v14, 0x0

    .line 405
    const/4 v15, 0x0

    .line 406
    const/16 v16, 0x0

    .line 407
    .line 408
    const/16 v17, 0x0

    .line 409
    .line 410
    const/16 v18, 0x0

    .line 411
    .line 412
    invoke-static/range {v4 .. v20}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-eqz v3, :cond_5

    .line 421
    .line 422
    iget-object v1, v0, La/yys;->C:La/p7m0;

    .line 423
    .line 424
    new-instance v3, La/ows;

    .line 425
    .line 426
    new-instance v4, La/jcs;

    .line 427
    .line 428
    const/16 v5, 0x9

    .line 429
    .line 430
    invoke-direct {v4, v0, v5}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 431
    .line 432
    .line 433
    invoke-direct {v3, v4}, La/ows;-><init>(La/jcs;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v2, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
