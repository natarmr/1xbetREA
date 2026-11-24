.class public final synthetic La/obi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rbi0;


# direct methods
.method public synthetic constructor <init>(La/rbi0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/obi0;->a:B

    iput-object p1, p0, La/obi0;->b:La/rbi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/obi0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/obi0;->b:La/rbi0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 14
    .line 15
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, La/ldi0;->D()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 26
    .line 27
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, La/ldi0;->D()V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 38
    .line 39
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, La/ldi0;->z()La/it2;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v3, v0, La/ldi0;->n:La/nr;

    .line 48
    .line 49
    invoke-virtual {v3, v2, v1}, La/nr;->D(ZLa/it2;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, La/ldi0;->o:La/s64;

    .line 53
    .line 54
    invoke-virtual {v0, v2, v1}, La/s64;->k(ZLa/it2;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_2
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 61
    .line 62
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v8}, La/ldi0;->z()La/it2;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v1, v8, La/ldi0;->n:La/nr;

    .line 71
    .line 72
    invoke-virtual {v1, v3, v0}, La/nr;->D(ZLa/it2;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, v8, La/ldi0;->o:La/s64;

    .line 76
    .line 77
    invoke-virtual {v1, v3, v0}, La/s64;->k(ZLa/it2;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v8, La/ldi0;->F:La/bby;

    .line 81
    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-ne v0, v3, :cond_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, v8, La/ldi0;->H:La/p7m0;

    .line 92
    .line 93
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/uci0;

    .line 98
    .line 99
    iget-boolean v0, v0, La/uci0;->i:Z

    .line 100
    .line 101
    if-nez v0, :cond_1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v6, La/nxh0;

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    const/16 v13, 0x1d

    .line 112
    .line 113
    const/4 v7, 0x1

    .line 114
    const-class v9, La/ldi0;

    .line 115
    .line 116
    const-string v10, "localHandleError"

    .line 117
    .line 118
    const-string v11, "localHandleError(Ljava/lang/Throwable;)V"

    .line 119
    .line 120
    invoke-direct/range {v6 .. v13}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 121
    .line 122
    .line 123
    new-instance v1, La/yci0;

    .line 124
    .line 125
    const/4 v2, 0x4

    .line 126
    invoke-direct {v1, v8, v4, v2}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v0, v6, v1}, La/ldi0;->B(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, v8, La/ldi0;->F:La/bby;

    .line 134
    .line 135
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_3
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 139
    .line 140
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, La/ldi0;->x()V

    .line 145
    .line 146
    .line 147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_4
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 151
    .line 152
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, La/ldi0;->D()V

    .line 157
    .line 158
    .line 159
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_5
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 163
    .line 164
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, La/ldi0;->z()La/it2;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget-object v3, v0, La/ldi0;->n:La/nr;

    .line 173
    .line 174
    invoke-virtual {v3, v2, v1}, La/nr;->B(ZLa/it2;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v0, La/ldi0;->o:La/s64;

    .line 178
    .line 179
    invoke-virtual {v0, v2, v1}, La/s64;->i(ZLa/it2;)V

    .line 180
    .line 181
    .line 182
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_6
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 186
    .line 187
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-virtual {v8}, La/ldi0;->z()La/it2;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v1, v8, La/ldi0;->n:La/nr;

    .line 196
    .line 197
    invoke-virtual {v1, v3, v0}, La/nr;->B(ZLa/it2;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v8, La/ldi0;->o:La/s64;

    .line 201
    .line 202
    invoke-virtual {v1, v3, v0}, La/s64;->i(ZLa/it2;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, v8, La/ldi0;->F:La/bby;

    .line 206
    .line 207
    if-eqz v0, :cond_2

    .line 208
    .line 209
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-ne v0, v3, :cond_2

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_2
    iget-object v0, v8, La/ldi0;->H:La/p7m0;

    .line 217
    .line 218
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, La/uci0;

    .line 223
    .line 224
    iget-boolean v0, v0, La/uci0;->i:Z

    .line 225
    .line 226
    if-nez v0, :cond_3

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_3
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v6, La/nxh0;

    .line 234
    .line 235
    const/4 v12, 0x0

    .line 236
    const/16 v13, 0x1a

    .line 237
    .line 238
    const/4 v7, 0x1

    .line 239
    const-class v9, La/ldi0;

    .line 240
    .line 241
    const-string v10, "localHandleError"

    .line 242
    .line 243
    const-string v11, "localHandleError(Ljava/lang/Throwable;)V"

    .line 244
    .line 245
    invoke-direct/range {v6 .. v13}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 246
    .line 247
    .line 248
    new-instance v1, La/yci0;

    .line 249
    .line 250
    invoke-direct {v1, v8, v4, v3}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8, v0, v6, v1}, La/ldi0;->B(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iput-object v0, v8, La/ldi0;->F:La/bby;

    .line 258
    .line 259
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_7
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 263
    .line 264
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    iget-object v1, v0, La/ldi0;->b:La/i1w0;

    .line 269
    .line 270
    iget-object v0, v0, La/ldi0;->c:La/dci0;

    .line 271
    .line 272
    if-nez v0, :cond_4

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_4
    instance-of v3, v0, La/xbi0;

    .line 276
    .line 277
    if-eqz v3, :cond_5

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_5
    instance-of v3, v0, La/ybi0;

    .line 281
    .line 282
    if-eqz v3, :cond_6

    .line 283
    .line 284
    :goto_2
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    new-instance v4, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 289
    .line 290
    invoke-direct {v4, v0}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, La/d1w0;

    .line 294
    .line 295
    invoke-direct {v0, v4}, La/d1w0;-><init>(La/m7h0;)V

    .line 296
    .line 297
    .line 298
    new-instance v4, La/c8d;

    .line 299
    .line 300
    sget-object v5, La/y7d;->a:La/v7d;

    .line 301
    .line 302
    invoke-direct {v4, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v3, v4, v1, v3, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    :goto_3
    move-object v2, v0

    .line 310
    check-cast v2, La/paw;

    .line 311
    .line 312
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-eqz v3, :cond_7

    .line 317
    .line 318
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, La/oe50;

    .line 323
    .line 324
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 325
    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_6
    :goto_4
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    new-instance v3, La/c8d;

    .line 333
    .line 334
    sget-object v4, La/y7d;->a:La/v7d;

    .line 335
    .line 336
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 337
    .line 338
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v0, v3, v1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    :goto_5
    move-object v2, v0

    .line 346
    check-cast v2, La/paw;

    .line 347
    .line 348
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-eqz v3, :cond_7

    .line 353
    .line 354
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    check-cast v2, La/oe50;

    .line 359
    .line 360
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_8
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 368
    .line 369
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0}, La/ldi0;->z()La/it2;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    iget-object v3, v0, La/ldi0;->n:La/nr;

    .line 378
    .line 379
    invoke-virtual {v3, v2, v1}, La/nr;->C(ZLa/it2;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v0, La/ldi0;->o:La/s64;

    .line 383
    .line 384
    invoke-virtual {v0, v2, v1}, La/s64;->j(ZLa/it2;)V

    .line 385
    .line 386
    .line 387
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object v0

    .line 390
    :pswitch_9
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 391
    .line 392
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    invoke-virtual {v8}, La/ldi0;->z()La/it2;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iget-object v1, v8, La/ldi0;->n:La/nr;

    .line 401
    .line 402
    invoke-virtual {v1, v3, v0}, La/nr;->C(ZLa/it2;)V

    .line 403
    .line 404
    .line 405
    iget-object v1, v8, La/ldi0;->o:La/s64;

    .line 406
    .line 407
    invoke-virtual {v1, v3, v0}, La/s64;->j(ZLa/it2;)V

    .line 408
    .line 409
    .line 410
    iget-object v0, v8, La/ldi0;->F:La/bby;

    .line 411
    .line 412
    if-eqz v0, :cond_8

    .line 413
    .line 414
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-ne v0, v3, :cond_8

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_8
    iget-object v0, v8, La/ldi0;->H:La/p7m0;

    .line 422
    .line 423
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    check-cast v0, La/uci0;

    .line 428
    .line 429
    iget-boolean v0, v0, La/uci0;->i:Z

    .line 430
    .line 431
    if-nez v0, :cond_9

    .line 432
    .line 433
    goto :goto_6

    .line 434
    :cond_9
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    new-instance v6, La/nxh0;

    .line 439
    .line 440
    const/4 v12, 0x0

    .line 441
    const/16 v13, 0x1b

    .line 442
    .line 443
    const/4 v7, 0x1

    .line 444
    const-class v9, La/ldi0;

    .line 445
    .line 446
    const-string v10, "localHandleError"

    .line 447
    .line 448
    const-string v11, "localHandleError(Ljava/lang/Throwable;)V"

    .line 449
    .line 450
    invoke-direct/range {v6 .. v13}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 451
    .line 452
    .line 453
    new-instance v1, La/yci0;

    .line 454
    .line 455
    const/4 v2, 0x2

    .line 456
    invoke-direct {v1, v8, v4, v2}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v8, v0, v6, v1}, La/ldi0;->B(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    iput-object v0, v8, La/ldi0;->F:La/bby;

    .line 464
    .line 465
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_a
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 469
    .line 470
    invoke-virtual {v5}, La/rbi0;->I0()La/ldi0;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, La/ldi0;->x()V

    .line 475
    .line 476
    .line 477
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_b
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 481
    .line 482
    iget-object v0, v5, La/rbi0;->R1:La/a8z;

    .line 483
    .line 484
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, La/mti;

    .line 489
    .line 490
    iget-object v0, v0, La/mti;->y:La/n5d0;

    .line 491
    .line 492
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    check-cast v0, La/lti;

    .line 497
    .line 498
    return-object v0

    .line 499
    :pswitch_c
    sget-object v0, La/rbi0;->U1:La/gle0;

    .line 500
    .line 501
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    instance-of v1, v0, La/af3;

    .line 513
    .line 514
    if-eqz v1, :cond_a

    .line 515
    .line 516
    check-cast v0, La/af3;

    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_a
    move-object v0, v4

    .line 520
    :goto_7
    const-class v1, La/mbi0;

    .line 521
    .line 522
    if-eqz v0, :cond_d

    .line 523
    .line 524
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    check-cast v0, La/o5d0;

    .line 533
    .line 534
    if-eqz v0, :cond_b

    .line 535
    .line 536
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    check-cast v0, La/ze3;

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_b
    move-object v0, v4

    .line 544
    :goto_8
    instance-of v2, v0, La/mbi0;

    .line 545
    .line 546
    if-nez v2, :cond_c

    .line 547
    .line 548
    move-object v0, v4

    .line 549
    :cond_c
    check-cast v0, La/mbi0;

    .line 550
    .line 551
    if-eqz v0, :cond_d

    .line 552
    .line 553
    invoke-static {v5}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    iget-object v1, v5, La/rbi0;->Q1:La/yzn0;

    .line 558
    .line 559
    sget-object v2, La/rbi0;->V1:[La/iiy;

    .line 560
    .line 561
    aget-object v2, v2, v3

    .line 562
    .line 563
    invoke-virtual {v1, v5, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    move-object v13, v1

    .line 568
    check-cast v13, La/dci0;

    .line 569
    .line 570
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    iget-object v8, v0, La/mbi0;->a:La/lp4;

    .line 574
    .line 575
    iget-object v9, v0, La/mbi0;->b:La/pv00;

    .line 576
    .line 577
    iget-object v7, v0, La/mbi0;->c:La/lef0;

    .line 578
    .line 579
    iget-object v11, v0, La/mbi0;->d:La/x1u;

    .line 580
    .line 581
    iget-object v14, v0, La/mbi0;->e:La/ctf0;

    .line 582
    .line 583
    iget-object v15, v0, La/mbi0;->f:La/duj;

    .line 584
    .line 585
    iget-object v1, v0, La/mbi0;->g:La/mne;

    .line 586
    .line 587
    iget-object v2, v0, La/mbi0;->h:La/zg;

    .line 588
    .line 589
    iget-object v3, v0, La/mbi0;->i:La/cyh;

    .line 590
    .line 591
    iget-object v4, v0, La/mbi0;->j:La/nr;

    .line 592
    .line 593
    iget-object v5, v0, La/mbi0;->l:La/s64;

    .line 594
    .line 595
    iget-object v6, v0, La/mbi0;->m:La/z4w0;

    .line 596
    .line 597
    iget-object v10, v0, La/mbi0;->n:La/rou;

    .line 598
    .line 599
    move-object/from16 v21, v10

    .line 600
    .line 601
    iget-object v10, v0, La/mbi0;->p:La/ii;

    .line 602
    .line 603
    move-object/from16 v16, v1

    .line 604
    .line 605
    iget-object v1, v0, La/mbi0;->o:La/gii0;

    .line 606
    .line 607
    move-object/from16 v17, v1

    .line 608
    .line 609
    iget-object v1, v0, La/mbi0;->q:La/btt0;

    .line 610
    .line 611
    move-object/from16 v18, v1

    .line 612
    .line 613
    iget-object v1, v0, La/mbi0;->k:La/at4;

    .line 614
    .line 615
    move-object/from16 v19, v1

    .line 616
    .line 617
    iget-object v1, v0, La/mbi0;->r:La/pru;

    .line 618
    .line 619
    move-object/from16 v23, v1

    .line 620
    .line 621
    iget-object v1, v0, La/mbi0;->s:La/m1e;

    .line 622
    .line 623
    move-object/from16 v24, v1

    .line 624
    .line 625
    iget-object v1, v0, La/mbi0;->t:La/wdk0;

    .line 626
    .line 627
    move-object/from16 v25, v1

    .line 628
    .line 629
    iget-object v1, v0, La/mbi0;->u:La/mi70;

    .line 630
    .line 631
    move-object/from16 v26, v1

    .line 632
    .line 633
    iget-object v1, v0, La/mbi0;->v:La/qud;

    .line 634
    .line 635
    move-object/from16 v27, v1

    .line 636
    .line 637
    iget-object v1, v0, La/mbi0;->w:La/zn00;

    .line 638
    .line 639
    move-object/from16 v28, v1

    .line 640
    .line 641
    iget-object v1, v0, La/mbi0;->x:La/au0;

    .line 642
    .line 643
    move-object/from16 v29, v1

    .line 644
    .line 645
    iget-object v1, v0, La/mbi0;->y:La/ag3;

    .line 646
    .line 647
    iget-object v0, v0, La/mbi0;->z:La/ik4;

    .line 648
    .line 649
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    move-object/from16 v22, v6

    .line 674
    .line 675
    new-instance v6, La/mti;

    .line 676
    .line 677
    move-object/from16 v31, v0

    .line 678
    .line 679
    move-object/from16 v30, v1

    .line 680
    .line 681
    move-object/from16 v17, v2

    .line 682
    .line 683
    move-object/from16 v18, v3

    .line 684
    .line 685
    move-object/from16 v19, v4

    .line 686
    .line 687
    move-object/from16 v20, v5

    .line 688
    .line 689
    invoke-direct/range {v6 .. v31}, La/mti;-><init>(La/lef0;La/lp4;La/pv00;La/ii;La/x1u;La/i1w0;La/dci0;La/ctf0;La/duj;La/mne;La/zg;La/cyh;La/nr;La/s64;La/rou;La/z4w0;La/pru;La/m1e;La/wdk0;La/mi70;La/qud;La/zn00;La/au0;La/ag3;La/ik4;)V

    .line 690
    .line 691
    .line 692
    move-object v4, v6

    .line 693
    goto :goto_9

    .line 694
    :cond_d
    const-string v0, "Cannot create dependency "

    .line 695
    .line 696
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    :goto_9
    return-object v4

    .line 704
    :pswitch_d
    sget-object v1, La/rbi0;->U1:La/gle0;

    .line 705
    .line 706
    iget-object v7, v0, La/obi0;->b:La/rbi0;

    .line 707
    .line 708
    iget-object v5, v7, La/rbi0;->O1:La/wdk0;

    .line 709
    .line 710
    if-eqz v5, :cond_e

    .line 711
    .line 712
    new-instance v6, La/xdk0;

    .line 713
    .line 714
    sget-object v9, La/rek0;->b:La/rek0;

    .line 715
    .line 716
    const v0, 0x7f130dca

    .line 717
    .line 718
    .line 719
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v10

    .line 723
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    const/4 v14, 0x0

    .line 727
    const/16 v15, 0x7c

    .line 728
    .line 729
    const/4 v11, 0x0

    .line 730
    const/4 v12, 0x0

    .line 731
    const/4 v13, 0x0

    .line 732
    move-object v8, v6

    .line 733
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 734
    .line 735
    .line 736
    const/16 v12, 0x3fc

    .line 737
    .line 738
    const/4 v8, 0x0

    .line 739
    const/4 v9, 0x0

    .line 740
    const/4 v10, 0x0

    .line 741
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 742
    .line 743
    .line 744
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 745
    .line 746
    return-object v0

    .line 747
    :cond_e
    const-string v0, "snackbarManager"

    .line 748
    .line 749
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    throw v4

    .line 753
    :pswitch_data_0
    .packed-switch 0x0
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
