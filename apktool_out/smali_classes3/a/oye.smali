.class public final synthetic La/oye;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/oye;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oye;->a:B

    .line 4
    .line 5
    const-string v2, "regular_coupon"

    .line 6
    .line 7
    const/16 v3, 0x16

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const-string v5, "no_money_regular_coupone"

    .line 11
    .line 12
    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    .line 13
    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    const/4 v11, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/dej;

    .line 24
    .line 25
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, La/vcj;

    .line 34
    .line 35
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_1
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/rsh;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v1, La/da10;->b:La/da10;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, La/rsh;->y(La/da10;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_2
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, La/rsh;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v1, La/da10;->c:La/da10;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, La/rsh;->y(La/da10;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, La/rsh;->w()V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_3
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/rsh;

    .line 77
    .line 78
    iget-object v0, v0, La/rsh;->o:La/p7m0;

    .line 79
    .line 80
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    xor-int/2addr v1, v10

    .line 91
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v11, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_4
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/vqg;

    .line 104
    .line 105
    iget-object v1, v0, La/vqg;->d:La/hzg;

    .line 106
    .line 107
    iget-object v0, v0, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 108
    .line 109
    iget-wide v2, v0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 110
    .line 111
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 112
    .line 113
    sget-object v4, La/k1g;->b:La/k1g;

    .line 114
    .line 115
    check-cast v1, La/uzg;

    .line 116
    .line 117
    invoke-virtual {v1, v2, v3, v0, v4}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 118
    .line 119
    .line 120
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_5
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/vqg;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    sget-object v1, La/da10;->c:La/da10;

    .line 131
    .line 132
    iput-object v1, v0, La/vqg;->G:La/da10;

    .line 133
    .line 134
    iget-object v1, v0, La/vqg;->C:La/bby;

    .line 135
    .line 136
    if-eqz v1, :cond_0

    .line 137
    .line 138
    invoke-interface {v1, v11}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 139
    .line 140
    .line 141
    :cond_0
    invoke-virtual {v0}, La/vqg;->w()V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_6
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, La/vqg;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    sget-object v1, La/da10;->b:La/da10;

    .line 155
    .line 156
    iput-object v1, v0, La/vqg;->G:La/da10;

    .line 157
    .line 158
    iget-object v1, v0, La/vqg;->I:La/p7m0;

    .line 159
    .line 160
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    instance-of v3, v2, La/mch;

    .line 165
    .line 166
    if-eqz v3, :cond_1

    .line 167
    .line 168
    move-object v11, v2

    .line 169
    check-cast v11, La/mch;

    .line 170
    .line 171
    :cond_1
    if-eqz v11, :cond_3

    .line 172
    .line 173
    iget-object v0, v0, La/vqg;->G:La/da10;

    .line 174
    .line 175
    iget-short v0, v0, La/da10;->a:S

    .line 176
    .line 177
    int-to-long v2, v0

    .line 178
    iget-object v0, v11, La/mch;->a:La/jkm;

    .line 179
    .line 180
    new-instance v4, La/mch;

    .line 181
    .line 182
    invoke-direct {v4, v0, v2, v3}, La/mch;-><init>(La/jkm;J)V

    .line 183
    .line 184
    .line 185
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v2, v0

    .line 190
    check-cast v2, La/och;

    .line 191
    .line 192
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_2

    .line 197
    .line 198
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_7
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, La/vqg;

    .line 204
    .line 205
    iget-object v1, v0, La/vqg;->d:La/hzg;

    .line 206
    .line 207
    iget-object v0, v0, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 208
    .line 209
    iget-wide v2, v0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 210
    .line 211
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 212
    .line 213
    sget-object v4, La/k1g;->b:La/k1g;

    .line 214
    .line 215
    check-cast v1, La/uzg;

    .line 216
    .line 217
    invoke-virtual {v1, v2, v3, v0, v4}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_8
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, La/hbg;

    .line 226
    .line 227
    iget-object v0, v0, La/hbg;->c:La/tag;

    .line 228
    .line 229
    invoke-virtual {v0}, La/eiu0;->s()La/diu0;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    new-instance v2, La/oag;

    .line 238
    .line 239
    const/4 v3, 0x2

    .line 240
    invoke-direct {v2, v0, v11, v3}, La/oag;-><init>(La/tag;La/yje;B)V

    .line 241
    .line 242
    .line 243
    invoke-static {v1, v11, v11, v2, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_9
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, La/hbg;

    .line 252
    .line 253
    iget-object v0, v0, La/hbg;->c:La/tag;

    .line 254
    .line 255
    iget-object v0, v0, La/tag;->c:La/oeg0;

    .line 256
    .line 257
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    new-instance v2, La/c8d;

    .line 266
    .line 267
    sget-object v3, La/y7d;->a:La/v7d;

    .line 268
    .line 269
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 270
    .line 271
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v1, v2, v0, v1, v9}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    :goto_0
    move-object v2, v1

    .line 279
    check-cast v2, La/paw;

    .line 280
    .line 281
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_4

    .line 286
    .line 287
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, La/oe50;

    .line 292
    .line 293
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 294
    .line 295
    .line 296
    goto :goto_0

    .line 297
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, La/u8g;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    sget-object v1, La/da10;->b:La/da10;

    .line 308
    .line 309
    invoke-virtual {v0, v1}, La/u8g;->z(La/da10;)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, La/u8g;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    sget-object v1, La/da10;->c:La/da10;

    .line 323
    .line 324
    invoke-virtual {v0, v1}, La/u8g;->z(La/da10;)V

    .line 325
    .line 326
    .line 327
    iget-object v1, v0, La/u8g;->p:La/c4m0;

    .line 328
    .line 329
    if-eqz v1, :cond_5

    .line 330
    .line 331
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 332
    .line 333
    .line 334
    :cond_5
    invoke-virtual {v0}, La/u8g;->y()V

    .line 335
    .line 336
    .line 337
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, La/w6g;

    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    sget-object v1, La/da10;->b:La/da10;

    .line 348
    .line 349
    invoke-virtual {v0, v1}, La/w6g;->y(La/da10;)V

    .line 350
    .line 351
    .line 352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_d
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, La/w6g;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    sget-object v1, La/da10;->c:La/da10;

    .line 363
    .line 364
    invoke-virtual {v0, v1}, La/w6g;->y(La/da10;)V

    .line 365
    .line 366
    .line 367
    iput-object v11, v0, La/w6g;->q:La/c5g;

    .line 368
    .line 369
    iget-object v1, v0, La/w6g;->r:La/c4m0;

    .line 370
    .line 371
    if-eqz v1, :cond_6

    .line 372
    .line 373
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 374
    .line 375
    .line 376
    :cond_6
    invoke-virtual {v0}, La/w6g;->x()V

    .line 377
    .line 378
    .line 379
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    return-object v0

    .line 382
    :pswitch_e
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v0, La/h6g;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    sget-object v1, La/da10;->b:La/da10;

    .line 390
    .line 391
    invoke-virtual {v0, v1}, La/h6g;->A(La/da10;)V

    .line 392
    .line 393
    .line 394
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_f
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, La/h6g;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    sget-object v1, La/da10;->c:La/da10;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, La/h6g;->A(La/da10;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0}, La/h6g;->y()V

    .line 410
    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_10
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, La/hbg;

    .line 418
    .line 419
    invoke-virtual {v0}, La/hbg;->B()V

    .line 420
    .line 421
    .line 422
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_11
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v0, La/baf;

    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0}, Landroid/os/Looper;->isCurrentThread()Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    xor-int/2addr v0, v10

    .line 441
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    return-object v0

    .line 446
    :pswitch_12
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, La/baf;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    const-string v1, "Firebase Blocking Thread #"

    .line 465
    .line 466
    invoke-static {v0, v1, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :pswitch_13
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, La/baf;

    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    const-string v1, "Firebase Background Thread #"

    .line 494
    .line 495
    invoke-static {v0, v1, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 496
    .line 497
    .line 498
    move-result v0

    .line 499
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    return-object v0

    .line 504
    :pswitch_14
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 505
    .line 506
    move-object v1, v0

    .line 507
    check-cast v1, La/qg20;

    .line 508
    .line 509
    iget-object v2, v1, La/qg20;->d1:La/p7m0;

    .line 510
    .line 511
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    move-object v8, v0

    .line 516
    check-cast v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 517
    .line 518
    new-instance v3, Ljava/math/BigDecimal;

    .line 519
    .line 520
    iget-wide v4, v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 521
    .line 522
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    new-instance v4, Ljava/math/BigDecimal;

    .line 530
    .line 531
    iget-wide v9, v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->c:D

    .line 532
    .line 533
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    invoke-direct {v4, v5}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    new-instance v5, Ljava/math/BigDecimal;

    .line 541
    .line 542
    iget-wide v9, v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->d:D

    .line 543
    .line 544
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v11

    .line 548
    invoke-direct {v5, v11}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    new-instance v11, Ljava/math/BigDecimal;

    .line 552
    .line 553
    invoke-virtual {v8}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b()D

    .line 554
    .line 555
    .line 556
    move-result-wide v12

    .line 557
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v12

    .line 561
    invoke-direct {v11, v12}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    iget-wide v12, v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 565
    .line 566
    cmpg-double v12, v12, v6

    .line 567
    .line 568
    if-nez v12, :cond_8

    .line 569
    .line 570
    iget-wide v9, v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b:D

    .line 571
    .line 572
    goto :goto_1

    .line 573
    :cond_8
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 581
    .line 582
    .line 583
    move-result v5

    .line 584
    if-gez v5, :cond_9

    .line 585
    .line 586
    goto :goto_1

    .line 587
    :cond_9
    invoke-virtual {v3, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    if-lez v5, :cond_a

    .line 592
    .line 593
    invoke-virtual {v8}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b()D

    .line 594
    .line 595
    .line 596
    move-result-wide v9

    .line 597
    goto :goto_1

    .line 598
    :cond_a
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 606
    .line 607
    .line 608
    move-result-wide v9

    .line 609
    :goto_1
    invoke-virtual {v1, v9, v10}, La/qg20;->l0(D)V

    .line 610
    .line 611
    .line 612
    const/16 v29, 0x0

    .line 613
    .line 614
    const v30, 0x3effe

    .line 615
    .line 616
    .line 617
    const-wide/16 v11, 0x0

    .line 618
    .line 619
    const-wide/16 v13, 0x0

    .line 620
    .line 621
    const-wide/16 v15, 0x0

    .line 622
    .line 623
    const-wide/16 v17, 0x0

    .line 624
    .line 625
    const/16 v19, 0x0

    .line 626
    .line 627
    const/16 v20, 0x0

    .line 628
    .line 629
    const/16 v21, 0x0

    .line 630
    .line 631
    const/16 v22, 0x0

    .line 632
    .line 633
    const/16 v23, 0x0

    .line 634
    .line 635
    const/16 v24, 0x0

    .line 636
    .line 637
    const/16 v25, 0x0

    .line 638
    .line 639
    const/16 v26, 0x0

    .line 640
    .line 641
    const/16 v27, 0x0

    .line 642
    .line 643
    const/16 v28, 0x0

    .line 644
    .line 645
    invoke-static/range {v8 .. v30}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    if-eqz v0, :cond_7

    .line 654
    .line 655
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 656
    .line 657
    return-object v0

    .line 658
    :pswitch_15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 659
    .line 660
    move-object v8, v0

    .line 661
    check-cast v8, La/qg20;

    .line 662
    .line 663
    iget-object v1, v8, La/qg20;->d1:La/p7m0;

    .line 664
    .line 665
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    move-object v2, v0

    .line 670
    check-cast v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 671
    .line 672
    iget-wide v9, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 673
    .line 674
    cmpg-double v3, v9, v6

    .line 675
    .line 676
    if-nez v3, :cond_d

    .line 677
    .line 678
    iget-boolean v3, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->h:Z

    .line 679
    .line 680
    iget-wide v9, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b:D

    .line 681
    .line 682
    if-eqz v3, :cond_c

    .line 683
    .line 684
    :goto_2
    move-wide v10, v9

    .line 685
    goto :goto_3

    .line 686
    :cond_c
    iget-wide v11, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->c:D

    .line 687
    .line 688
    invoke-virtual {v2}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b()D

    .line 689
    .line 690
    .line 691
    move-result-wide v13

    .line 692
    invoke-virtual/range {v8 .. v14}, La/qg20;->j0(DDD)D

    .line 693
    .line 694
    .line 695
    move-result-wide v9

    .line 696
    goto :goto_2

    .line 697
    :cond_d
    iget-wide v11, v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->c:D

    .line 698
    .line 699
    invoke-virtual {v2}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->b()D

    .line 700
    .line 701
    .line 702
    move-result-wide v13

    .line 703
    invoke-virtual/range {v8 .. v14}, La/qg20;->j0(DDD)D

    .line 704
    .line 705
    .line 706
    move-result-wide v9

    .line 707
    goto :goto_2

    .line 708
    :goto_3
    invoke-virtual {v8, v10, v11}, La/qg20;->l0(D)V

    .line 709
    .line 710
    .line 711
    const/16 v30, 0x0

    .line 712
    .line 713
    const v31, 0x3effe

    .line 714
    .line 715
    .line 716
    const-wide/16 v12, 0x0

    .line 717
    .line 718
    const-wide/16 v14, 0x0

    .line 719
    .line 720
    const-wide/16 v16, 0x0

    .line 721
    .line 722
    const-wide/16 v18, 0x0

    .line 723
    .line 724
    const/16 v20, 0x0

    .line 725
    .line 726
    const/16 v21, 0x0

    .line 727
    .line 728
    const/16 v22, 0x0

    .line 729
    .line 730
    const/16 v23, 0x0

    .line 731
    .line 732
    const/16 v24, 0x0

    .line 733
    .line 734
    const/16 v25, 0x0

    .line 735
    .line 736
    const/16 v26, 0x0

    .line 737
    .line 738
    const/16 v27, 0x0

    .line 739
    .line 740
    const/16 v28, 0x0

    .line 741
    .line 742
    const/16 v29, 0x0

    .line 743
    .line 744
    move-object v9, v2

    .line 745
    invoke-static/range {v9 .. v31}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    if-eqz v0, :cond_b

    .line 754
    .line 755
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 756
    .line 757
    return-object v0

    .line 758
    :pswitch_16
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 759
    .line 760
    check-cast v0, La/qg20;

    .line 761
    .line 762
    iget-object v1, v0, La/qg20;->I0:La/ih5;

    .line 763
    .line 764
    sget-object v2, La/k7k;->m1:La/k7k;

    .line 765
    .line 766
    invoke-virtual {v1, v2}, La/ih5;->f(La/k7k;)V

    .line 767
    .line 768
    .line 769
    iget-object v1, v0, La/qg20;->J0:La/l7k;

    .line 770
    .line 771
    sget-object v2, La/y1p;->b:La/y1p;

    .line 772
    .line 773
    iget-object v2, v0, La/qg20;->K0:La/cmt;

    .line 774
    .line 775
    invoke-virtual {v2}, La/cmt;->g()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    invoke-virtual {v1, v5, v2}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 783
    .line 784
    .line 785
    move-result-object v12

    .line 786
    new-instance v13, La/cd20;

    .line 787
    .line 788
    invoke-direct {v13, v0, v4}, La/cd20;-><init>(La/qg20;B)V

    .line 789
    .line 790
    .line 791
    iget-object v1, v0, La/qg20;->d:La/mne;

    .line 792
    .line 793
    iget-object v15, v1, La/mne;->a:La/rwj;

    .line 794
    .line 795
    new-instance v1, La/v620;

    .line 796
    .line 797
    invoke-direct {v1, v0, v11, v3}, La/v620;-><init>(La/w46;La/yje;B)V

    .line 798
    .line 799
    .line 800
    const/16 v17, 0xa

    .line 801
    .line 802
    const/4 v14, 0x0

    .line 803
    move-object/from16 v16, v1

    .line 804
    .line 805
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 806
    .line 807
    .line 808
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 809
    .line 810
    return-object v0

    .line 811
    :pswitch_17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v0, La/qg20;

    .line 814
    .line 815
    iget-object v1, v0, La/qg20;->I0:La/ih5;

    .line 816
    .line 817
    sget-object v5, La/k7k;->g1:La/k7k;

    .line 818
    .line 819
    invoke-virtual {v1, v5}, La/ih5;->f(La/k7k;)V

    .line 820
    .line 821
    .line 822
    iget-object v1, v0, La/qg20;->J0:La/l7k;

    .line 823
    .line 824
    sget-object v5, La/y1p;->b:La/y1p;

    .line 825
    .line 826
    iget-object v5, v0, La/qg20;->K0:La/cmt;

    .line 827
    .line 828
    invoke-virtual {v5}, La/cmt;->g()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    invoke-virtual {v1, v2, v5}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 836
    .line 837
    .line 838
    move-result-object v12

    .line 839
    new-instance v13, La/cd20;

    .line 840
    .line 841
    invoke-direct {v13, v0, v4}, La/cd20;-><init>(La/qg20;B)V

    .line 842
    .line 843
    .line 844
    iget-object v1, v0, La/qg20;->d:La/mne;

    .line 845
    .line 846
    iget-object v15, v1, La/mne;->a:La/rwj;

    .line 847
    .line 848
    new-instance v1, La/v620;

    .line 849
    .line 850
    invoke-direct {v1, v0, v11, v3}, La/v620;-><init>(La/w46;La/yje;B)V

    .line 851
    .line 852
    .line 853
    const/16 v17, 0xa

    .line 854
    .line 855
    const/4 v14, 0x0

    .line 856
    move-object/from16 v16, v1

    .line 857
    .line 858
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 859
    .line 860
    .line 861
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v0, La/h620;

    .line 867
    .line 868
    iget-object v1, v0, La/h620;->d0:La/c4m0;

    .line 869
    .line 870
    if-eqz v1, :cond_e

    .line 871
    .line 872
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 873
    .line 874
    .line 875
    :cond_e
    iget-object v1, v0, La/h620;->h0:La/p7m0;

    .line 876
    .line 877
    :cond_f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    move-object v11, v0

    .line 882
    check-cast v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 883
    .line 884
    iget-object v2, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 885
    .line 886
    iget-object v3, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->c:Ljava/math/BigDecimal;

    .line 887
    .line 888
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 889
    .line 890
    .line 891
    move-result v4

    .line 892
    if-eq v4, v10, :cond_11

    .line 893
    .line 894
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    if-nez v4, :cond_10

    .line 899
    .line 900
    goto :goto_4

    .line 901
    :cond_10
    sget-object v4, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 902
    .line 903
    invoke-virtual {v2, v10, v4}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 908
    .line 909
    .line 910
    move-result-object v2

    .line 911
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    goto :goto_5

    .line 915
    :cond_11
    :goto_4
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    :goto_5
    invoke-static {v2, v11}, La/h620;->w(Ljava/math/BigDecimal;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;)Ljava/math/BigDecimal;

    .line 923
    .line 924
    .line 925
    move-result-object v12

    .line 926
    iget-object v3, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 927
    .line 928
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    if-lez v3, :cond_12

    .line 933
    .line 934
    move v15, v10

    .line 935
    goto :goto_6

    .line 936
    :cond_12
    move v15, v9

    .line 937
    :goto_6
    iget-object v3, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 938
    .line 939
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 940
    .line 941
    .line 942
    move-result v2

    .line 943
    if-gez v2, :cond_13

    .line 944
    .line 945
    move/from16 v16, v10

    .line 946
    .line 947
    goto :goto_7

    .line 948
    :cond_13
    move/from16 v16, v9

    .line 949
    .line 950
    :goto_7
    const/16 v17, 0x0

    .line 951
    .line 952
    const/16 v18, 0x11e

    .line 953
    .line 954
    const/4 v13, 0x0

    .line 955
    const/4 v14, 0x0

    .line 956
    invoke-static/range {v11 .. v18}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-eqz v0, :cond_f

    .line 965
    .line 966
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_19
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v0, La/h620;

    .line 972
    .line 973
    iget-object v1, v0, La/h620;->d0:La/c4m0;

    .line 974
    .line 975
    if-eqz v1, :cond_14

    .line 976
    .line 977
    invoke-virtual {v1, v11}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 978
    .line 979
    .line 980
    :cond_14
    iget-object v1, v0, La/h620;->h0:La/p7m0;

    .line 981
    .line 982
    :cond_15
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    move-object v11, v0

    .line 987
    check-cast v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 988
    .line 989
    iget-object v2, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 990
    .line 991
    iget-object v3, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 992
    .line 993
    iget-object v4, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->c:Ljava/math/BigDecimal;

    .line 994
    .line 995
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 996
    .line 997
    .line 998
    move-result v5

    .line 999
    if-gez v5, :cond_16

    .line 1000
    .line 1001
    move-object v2, v3

    .line 1002
    goto :goto_9

    .line 1003
    :cond_16
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 1004
    .line 1005
    .line 1006
    move-result v5

    .line 1007
    if-eq v5, v10, :cond_18

    .line 1008
    .line 1009
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 1010
    .line 1011
    .line 1012
    move-result v5

    .line 1013
    if-nez v5, :cond_17

    .line 1014
    .line 1015
    goto :goto_8

    .line 1016
    :cond_17
    sget-object v5, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 1017
    .line 1018
    invoke-virtual {v2, v10, v5}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    goto :goto_9

    .line 1030
    :cond_18
    :goto_8
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1035
    .line 1036
    .line 1037
    :goto_9
    invoke-static {v2, v11}, La/h620;->w(Ljava/math/BigDecimal;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;)Ljava/math/BigDecimal;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v12

    .line 1041
    iget-object v4, v11, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 1042
    .line 1043
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 1044
    .line 1045
    .line 1046
    move-result v4

    .line 1047
    if-lez v4, :cond_19

    .line 1048
    .line 1049
    move v15, v10

    .line 1050
    goto :goto_a

    .line 1051
    :cond_19
    move v15, v9

    .line 1052
    :goto_a
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 1053
    .line 1054
    .line 1055
    move-result v2

    .line 1056
    if-gez v2, :cond_1a

    .line 1057
    .line 1058
    move/from16 v16, v10

    .line 1059
    .line 1060
    goto :goto_b

    .line 1061
    :cond_1a
    move/from16 v16, v9

    .line 1062
    .line 1063
    :goto_b
    const/16 v17, 0x0

    .line 1064
    .line 1065
    const/16 v18, 0x11e

    .line 1066
    .line 1067
    const/4 v13, 0x0

    .line 1068
    const/4 v14, 0x0

    .line 1069
    invoke-static/range {v11 .. v18}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v0

    .line 1077
    if-eqz v0, :cond_15

    .line 1078
    .line 1079
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1080
    .line 1081
    return-object v0

    .line 1082
    :pswitch_1a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1083
    .line 1084
    check-cast v0, La/h620;

    .line 1085
    .line 1086
    iget-object v1, v0, La/h620;->Q:La/ih5;

    .line 1087
    .line 1088
    sget-object v2, La/k7k;->m1:La/k7k;

    .line 1089
    .line 1090
    invoke-virtual {v1, v2}, La/ih5;->f(La/k7k;)V

    .line 1091
    .line 1092
    .line 1093
    iget-object v1, v0, La/h620;->R:La/l7k;

    .line 1094
    .line 1095
    sget-object v2, La/y1p;->b:La/y1p;

    .line 1096
    .line 1097
    iget-object v2, v0, La/h620;->S:La/cmt;

    .line 1098
    .line 1099
    invoke-virtual {v2}, La/cmt;->g()Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    invoke-virtual {v1, v5, v2}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v12

    .line 1110
    new-instance v13, La/p520;

    .line 1111
    .line 1112
    invoke-direct {v13, v0, v8}, La/p520;-><init>(La/h620;B)V

    .line 1113
    .line 1114
    .line 1115
    iget-object v1, v0, La/h620;->c:La/mne;

    .line 1116
    .line 1117
    iget-object v15, v1, La/mne;->a:La/rwj;

    .line 1118
    .line 1119
    new-instance v1, La/cm10;

    .line 1120
    .line 1121
    invoke-direct {v1, v0, v11}, La/cm10;-><init>(La/h620;La/yje;)V

    .line 1122
    .line 1123
    .line 1124
    const/16 v17, 0xa

    .line 1125
    .line 1126
    const/4 v14, 0x0

    .line 1127
    move-object/from16 v16, v1

    .line 1128
    .line 1129
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1130
    .line 1131
    .line 1132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1133
    .line 1134
    return-object v0

    .line 1135
    :pswitch_1b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v0, La/h620;

    .line 1138
    .line 1139
    invoke-virtual {v0, v10}, La/h620;->D(Z)V

    .line 1140
    .line 1141
    .line 1142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1143
    .line 1144
    return-object v0

    .line 1145
    :pswitch_1c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v0, La/h620;

    .line 1148
    .line 1149
    iget-object v1, v0, La/h620;->Q:La/ih5;

    .line 1150
    .line 1151
    sget-object v3, La/k7k;->g1:La/k7k;

    .line 1152
    .line 1153
    invoke-virtual {v1, v3}, La/ih5;->f(La/k7k;)V

    .line 1154
    .line 1155
    .line 1156
    iget-object v1, v0, La/h620;->R:La/l7k;

    .line 1157
    .line 1158
    sget-object v3, La/y1p;->b:La/y1p;

    .line 1159
    .line 1160
    iget-object v3, v0, La/h620;->S:La/cmt;

    .line 1161
    .line 1162
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v3

    .line 1166
    invoke-virtual {v1, v2, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v12

    .line 1173
    new-instance v13, La/p520;

    .line 1174
    .line 1175
    invoke-direct {v13, v0, v8}, La/p520;-><init>(La/h620;B)V

    .line 1176
    .line 1177
    .line 1178
    iget-object v1, v0, La/h620;->c:La/mne;

    .line 1179
    .line 1180
    iget-object v15, v1, La/mne;->a:La/rwj;

    .line 1181
    .line 1182
    new-instance v1, La/cm10;

    .line 1183
    .line 1184
    invoke-direct {v1, v0, v11}, La/cm10;-><init>(La/h620;La/yje;)V

    .line 1185
    .line 1186
    .line 1187
    const/16 v17, 0xa

    .line 1188
    .line 1189
    const/4 v14, 0x0

    .line 1190
    move-object/from16 v16, v1

    .line 1191
    .line 1192
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1193
    .line 1194
    .line 1195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1196
    .line 1197
    return-object v0

    .line 1198
    nop

    .line 1199
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
