.class public final synthetic La/jjd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/njd0;


# direct methods
.method public synthetic constructor <init>(La/njd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jjd0;->a:B

    iput-object p1, p0, La/jjd0;->b:La/njd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jjd0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/jjd0;->b:La/njd0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 16
    .line 17
    invoke-virtual {v6}, La/njd0;->I0()La/fkd0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/fkd0;->b:La/i1w0;

    .line 22
    .line 23
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, La/c8d;

    .line 28
    .line 29
    sget-object v5, La/y7d;->a:La/v7d;

    .line 30
    .line 31
    invoke-direct {v2, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, v0, v1, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    move-object v2, v1

    .line 39
    check-cast v2, La/paw;

    .line 40
    .line 41
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/oe50;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_0
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 61
    .line 62
    invoke-virtual {v6}, La/njd0;->I0()La/fkd0;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v7, La/prc0;

    .line 71
    .line 72
    const/4 v13, 0x0

    .line 73
    const/16 v14, 0x10

    .line 74
    .line 75
    const/4 v8, 0x1

    .line 76
    const-class v10, La/fkd0;

    .line 77
    .line 78
    const-string v11, "handleError"

    .line 79
    .line 80
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 81
    .line 82
    invoke-direct/range {v7 .. v14}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 83
    .line 84
    .line 85
    iget-object v1, v9, La/fkd0;->f:La/mne;

    .line 86
    .line 87
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 88
    .line 89
    new-instance v14, La/zjd0;

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-direct {v14, v9, v5, v1}, La/zjd0;-><init>(La/fkd0;La/yje;B)V

    .line 93
    .line 94
    .line 95
    const/16 v15, 0xa

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    move-object v10, v0

    .line 99
    move-object v11, v7

    .line 100
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_1
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    instance-of v1, v0, La/af3;

    .line 120
    .line 121
    if-eqz v1, :cond_1

    .line 122
    .line 123
    check-cast v0, La/af3;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    move-object v0, v5

    .line 127
    :goto_1
    const-class v1, La/ojd0;

    .line 128
    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, La/o5d0;

    .line 140
    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/ze3;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    move-object v0, v5

    .line 151
    :goto_2
    instance-of v3, v0, La/ojd0;

    .line 152
    .line 153
    if-nez v3, :cond_3

    .line 154
    .line 155
    move-object v0, v5

    .line 156
    :cond_3
    check-cast v0, La/ojd0;

    .line 157
    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    new-instance v10, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;

    .line 161
    .line 162
    iget-object v1, v6, La/njd0;->Q1:La/yzn0;

    .line 163
    .line 164
    sget-object v3, La/njd0;->U1:[La/iiy;

    .line 165
    .line 166
    const/4 v4, 0x1

    .line 167
    aget-object v4, v3, v4

    .line 168
    .line 169
    invoke-virtual {v1, v6, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, La/swp0;

    .line 174
    .line 175
    iget-object v4, v6, La/njd0;->R1:La/es;

    .line 176
    .line 177
    aget-object v2, v3, v2

    .line 178
    .line 179
    invoke-virtual {v4, v6, v2}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-direct {v10, v1, v2}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;-><init>(La/swp0;Ljava/util/List;)V

    .line 184
    .line 185
    .line 186
    iget-object v11, v0, La/ojd0;->a:La/mne;

    .line 187
    .line 188
    iget-object v12, v0, La/ojd0;->b:La/duj;

    .line 189
    .line 190
    iget-object v13, v0, La/ojd0;->c:La/rou;

    .line 191
    .line 192
    iget-object v9, v0, La/ojd0;->d:La/ii;

    .line 193
    .line 194
    iget-object v14, v0, La/ojd0;->e:La/m1e;

    .line 195
    .line 196
    iget-object v15, v0, La/ojd0;->f:La/wdk0;

    .line 197
    .line 198
    iget-object v8, v0, La/ojd0;->g:La/lef0;

    .line 199
    .line 200
    iget-object v0, v0, La/ojd0;->h:La/s64;

    .line 201
    .line 202
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    new-instance v7, La/tqi;

    .line 212
    .line 213
    move-object/from16 v16, v0

    .line 214
    .line 215
    invoke-direct/range {v7 .. v16}, La/tqi;-><init>(La/lef0;La/ii;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/send/params/QrSendConfirmationSmsParams;La/mne;La/duj;La/rou;La/m1e;La/wdk0;La/s64;)V

    .line 216
    .line 217
    .line 218
    move-object v5, v7

    .line 219
    goto :goto_3

    .line 220
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 221
    .line 222
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :goto_3
    return-object v5

    .line 230
    :pswitch_2
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 231
    .line 232
    new-instance v0, La/ry3;

    .line 233
    .line 234
    invoke-static {v6}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget-object v2, v6, La/njd0;->K1:La/sqi;

    .line 239
    .line 240
    if-eqz v2, :cond_5

    .line 241
    .line 242
    invoke-direct {v0, v1, v2}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :cond_5
    const-string v0, "viewModelFactory"

    .line 247
    .line 248
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v5

    .line 252
    :pswitch_3
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 253
    .line 254
    invoke-virtual {v6}, La/njd0;->I0()La/fkd0;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget-object v1, La/rjd0;->a:La/rjd0;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, La/fkd0;->y(La/xjd0;)V

    .line 261
    .line 262
    .line 263
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_4
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 267
    .line 268
    invoke-virtual {v6}, La/njd0;->I0()La/fkd0;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    new-instance v7, La/prc0;

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const/16 v14, 0xd

    .line 280
    .line 281
    const/4 v8, 0x1

    .line 282
    const-class v10, La/fkd0;

    .line 283
    .line 284
    const-string v11, "handleError"

    .line 285
    .line 286
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 287
    .line 288
    invoke-direct/range {v7 .. v14}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 289
    .line 290
    .line 291
    iget-object v1, v9, La/fkd0;->f:La/mne;

    .line 292
    .line 293
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 294
    .line 295
    new-instance v14, La/zjd0;

    .line 296
    .line 297
    invoke-direct {v14, v9, v5, v4}, La/zjd0;-><init>(La/fkd0;La/yje;B)V

    .line 298
    .line 299
    .line 300
    const/16 v15, 0xa

    .line 301
    .line 302
    const/4 v12, 0x0

    .line 303
    move-object v10, v0

    .line 304
    move-object v11, v7

    .line 305
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 306
    .line 307
    .line 308
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_5
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 312
    .line 313
    invoke-virtual {v6}, La/njd0;->I0()La/fkd0;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iget-object v0, v0, La/fkd0;->b:La/i1w0;

    .line 318
    .line 319
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    new-instance v2, La/c8d;

    .line 324
    .line 325
    sget-object v5, La/y7d;->a:La/v7d;

    .line 326
    .line 327
    invoke-direct {v2, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v1, v2, v0, v1, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    :goto_4
    move-object v2, v1

    .line 335
    check-cast v2, La/paw;

    .line 336
    .line 337
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_6

    .line 342
    .line 343
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, La/oe50;

    .line 348
    .line 349
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 350
    .line 351
    .line 352
    goto :goto_4

    .line 353
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object v0

    .line 356
    :pswitch_6
    sget-object v0, La/njd0;->S1:La/nh70;

    .line 357
    .line 358
    invoke-virtual {v6}, La/njd0;->I0()La/fkd0;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    new-instance v7, La/prc0;

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const/16 v14, 0xf

    .line 370
    .line 371
    const/4 v8, 0x1

    .line 372
    const-class v10, La/fkd0;

    .line 373
    .line 374
    const-string v11, "handleError"

    .line 375
    .line 376
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 377
    .line 378
    invoke-direct/range {v7 .. v14}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 379
    .line 380
    .line 381
    iget-object v1, v9, La/fkd0;->f:La/mne;

    .line 382
    .line 383
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 384
    .line 385
    new-instance v14, La/zjd0;

    .line 386
    .line 387
    invoke-direct {v14, v9, v5, v2}, La/zjd0;-><init>(La/fkd0;La/yje;B)V

    .line 388
    .line 389
    .line 390
    const/16 v15, 0xa

    .line 391
    .line 392
    const/4 v12, 0x0

    .line 393
    move-object v10, v0

    .line 394
    move-object v11, v7

    .line 395
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 396
    .line 397
    .line 398
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    return-object v0

    .line 401
    :pswitch_7
    sget-object v1, La/njd0;->S1:La/nh70;

    .line 402
    .line 403
    iget-object v8, v0, La/jjd0;->b:La/njd0;

    .line 404
    .line 405
    iget-object v6, v8, La/njd0;->M1:La/wdk0;

    .line 406
    .line 407
    if-eqz v6, :cond_7

    .line 408
    .line 409
    new-instance v7, La/xdk0;

    .line 410
    .line 411
    sget-object v10, La/rek0;->b:La/rek0;

    .line 412
    .line 413
    const v0, 0x7f130dca

    .line 414
    .line 415
    .line 416
    invoke-virtual {v8, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v11

    .line 420
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    const/4 v15, 0x0

    .line 424
    const/16 v16, 0x7c

    .line 425
    .line 426
    const/4 v12, 0x0

    .line 427
    const/4 v13, 0x0

    .line 428
    const/4 v14, 0x0

    .line 429
    move-object v9, v7

    .line 430
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 431
    .line 432
    .line 433
    const/16 v13, 0x3fc

    .line 434
    .line 435
    const/4 v9, 0x0

    .line 436
    const/4 v10, 0x0

    .line 437
    const/4 v11, 0x0

    .line 438
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 439
    .line 440
    .line 441
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object v0

    .line 444
    :cond_7
    const-string v0, "snackbarManager"

    .line 445
    .line 446
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v5

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
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
