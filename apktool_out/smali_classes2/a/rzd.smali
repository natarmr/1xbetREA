.class public final synthetic La/rzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uzd;


# direct methods
.method public synthetic constructor <init>(La/uzd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rzd;->a:B

    iput-object p1, p0, La/rzd;->b:La/uzd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rzd;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/rzd;->b:La/uzd;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/uzd;->S1:La/qud;

    .line 13
    .line 14
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, La/g1e;->G()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    sget-object v0, La/uzd;->S1:La/qud;

    .line 25
    .line 26
    invoke-virtual {v4}, La/uzd;->K0()V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    sget-object v0, La/uzd;->S1:La/qud;

    .line 33
    .line 34
    invoke-virtual {v4}, La/uzd;->K0()V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_2
    sget-object v0, La/uzd;->S1:La/qud;

    .line 41
    .line 42
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, La/g1e;->c:La/i1w0;

    .line 47
    .line 48
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v3, La/c8d;

    .line 53
    .line 54
    sget-object v4, La/y7d;->a:La/v7d;

    .line 55
    .line 56
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 57
    .line 58
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_0
    move-object v2, v1

    .line 66
    check-cast v2, La/paw;

    .line 67
    .line 68
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, La/oe50;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_3
    sget-object v1, La/uzd;->S1:La/qud;

    .line 88
    .line 89
    iget-object v6, v0, La/rzd;->b:La/uzd;

    .line 90
    .line 91
    iget-object v4, v6, La/uzd;->N1:La/wdk0;

    .line 92
    .line 93
    if-eqz v4, :cond_1

    .line 94
    .line 95
    new-instance v5, La/xdk0;

    .line 96
    .line 97
    sget-object v8, La/rek0;->b:La/rek0;

    .line 98
    .line 99
    const v0, 0x7f130dca

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const/16 v14, 0x7c

    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    move-object v7, v5

    .line 116
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 117
    .line 118
    .line 119
    const/16 v11, 0x3fc

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 125
    .line 126
    .line 127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_1
    const-string v0, "snackbarManager"

    .line 131
    .line 132
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v3

    .line 136
    :pswitch_4
    sget-object v0, La/uzd;->S1:La/qud;

    .line 137
    .line 138
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-object v1, v0, La/g1e;->E:La/bby;

    .line 143
    .line 144
    if-eqz v1, :cond_2

    .line 145
    .line 146
    new-instance v2, La/art0;

    .line 147
    .line 148
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v3, "Operation canceled by user"

    .line 152
    .line 153
    invoke-static {v3, v2}, La/plc;->b(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-interface {v1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    invoke-virtual {v0}, La/g1e;->B()V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_5
    sget-object v0, La/uzd;->S1:La/qud;

    .line 167
    .line 168
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v1, v0, La/g1e;->c:La/i1w0;

    .line 173
    .line 174
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    iget-object v0, v0, La/g1e;->v:La/usd;

    .line 179
    .line 180
    invoke-virtual {v0}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    instance-of v4, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 185
    .line 186
    if-eqz v4, :cond_3

    .line 187
    .line 188
    new-instance v4, La/e1w0;

    .line 189
    .line 190
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 191
    .line 192
    invoke-direct {v4, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 193
    .line 194
    .line 195
    new-instance v0, La/c8d;

    .line 196
    .line 197
    sget-object v5, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_3
    new-instance v4, La/w0w0;

    .line 207
    .line 208
    invoke-direct {v4, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, La/c8d;

    .line 212
    .line 213
    sget-object v5, La/y7d;->a:La/v7d;

    .line 214
    .line 215
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :goto_1
    invoke-static {v1, v3, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :goto_2
    move-object v2, v0

    .line 226
    check-cast v2, La/paw;

    .line 227
    .line 228
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_4

    .line 233
    .line 234
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, La/oe50;

    .line 239
    .line 240
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_6
    sget-object v0, La/uzd;->S1:La/qud;

    .line 248
    .line 249
    iget-object v0, v4, La/uzd;->P1:La/a8z;

    .line 250
    .line 251
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, La/bdi;

    .line 256
    .line 257
    iget-object v0, v0, La/bdi;->s:La/n5d0;

    .line 258
    .line 259
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, La/adi;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_7
    sget-object v0, La/uzd;->S1:La/qud;

    .line 267
    .line 268
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    instance-of v1, v0, La/af3;

    .line 280
    .line 281
    if-eqz v1, :cond_5

    .line 282
    .line 283
    check-cast v0, La/af3;

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_5
    move-object v0, v3

    .line 287
    :goto_3
    const-class v1, La/qzd;

    .line 288
    .line 289
    if-eqz v0, :cond_8

    .line 290
    .line 291
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, La/o5d0;

    .line 300
    .line 301
    if-eqz v0, :cond_6

    .line 302
    .line 303
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, La/ze3;

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_6
    move-object v0, v3

    .line 311
    :goto_4
    instance-of v2, v0, La/qzd;

    .line 312
    .line 313
    if-nez v2, :cond_7

    .line 314
    .line 315
    move-object v0, v3

    .line 316
    :cond_7
    check-cast v0, La/qzd;

    .line 317
    .line 318
    if-eqz v0, :cond_8

    .line 319
    .line 320
    invoke-static {v4}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    invoke-virtual {v4}, La/uzd;->I0()Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;

    .line 325
    .line 326
    .line 327
    move-result-object v13

    .line 328
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    iget-object v14, v0, La/qzd;->d:La/duj;

    .line 332
    .line 333
    iget-object v15, v0, La/qzd;->e:La/mne;

    .line 334
    .line 335
    iget-object v1, v0, La/qzd;->f:La/m1e;

    .line 336
    .line 337
    iget-object v9, v0, La/qzd;->c:La/ok50;

    .line 338
    .line 339
    iget-object v2, v0, La/qzd;->g:La/cyh;

    .line 340
    .line 341
    iget-object v11, v0, La/qzd;->i:La/ii;

    .line 342
    .line 343
    iget-object v3, v0, La/qzd;->h:La/z4w0;

    .line 344
    .line 345
    iget-object v4, v0, La/qzd;->j:La/ojj;

    .line 346
    .line 347
    iget-object v5, v0, La/qzd;->k:La/wdk0;

    .line 348
    .line 349
    iget-object v6, v0, La/qzd;->l:La/lef0;

    .line 350
    .line 351
    iget-object v7, v0, La/qzd;->m:La/yox;

    .line 352
    .line 353
    iget-object v8, v0, La/qzd;->n:La/ctf0;

    .line 354
    .line 355
    move-object/from16 v21, v8

    .line 356
    .line 357
    iget-object v8, v0, La/qzd;->a:La/lp4;

    .line 358
    .line 359
    iget-object v10, v0, La/qzd;->b:La/c8c;

    .line 360
    .line 361
    move-object/from16 v16, v1

    .line 362
    .line 363
    iget-object v1, v0, La/qzd;->o:La/pru;

    .line 364
    .line 365
    move-object/from16 v17, v10

    .line 366
    .line 367
    iget-object v10, v0, La/qzd;->p:La/usd;

    .line 368
    .line 369
    iget-object v0, v0, La/qzd;->q:La/s64;

    .line 370
    .line 371
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-object/from16 v20, v5

    .line 390
    .line 391
    new-instance v5, La/bdi;

    .line 392
    .line 393
    move-object/from16 v23, v0

    .line 394
    .line 395
    move-object/from16 v22, v1

    .line 396
    .line 397
    move-object/from16 v17, v2

    .line 398
    .line 399
    move-object/from16 v18, v3

    .line 400
    .line 401
    move-object/from16 v19, v4

    .line 402
    .line 403
    invoke-direct/range {v5 .. v23}, La/bdi;-><init>(La/lef0;La/yox;La/lp4;La/ok50;La/usd;La/ii;La/i1w0;Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;La/duj;La/mne;La/m1e;La/cyh;La/z4w0;La/ojj;La/wdk0;La/ctf0;La/pru;La/s64;)V

    .line 404
    .line 405
    .line 406
    move-object v3, v5

    .line 407
    goto :goto_5

    .line 408
    :cond_8
    const-string v0, "Cannot create dependency "

    .line 409
    .line 410
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :goto_5
    return-object v3

    .line 418
    :pswitch_8
    sget-object v0, La/uzd;->S1:La/qud;

    .line 419
    .line 420
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, La/g1e;->G()V

    .line 425
    .line 426
    .line 427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_9
    sget-object v0, La/uzd;->S1:La/qud;

    .line 431
    .line 432
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    iget-object v1, v0, La/g1e;->d:Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;

    .line 437
    .line 438
    instance-of v4, v1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 439
    .line 440
    if-eqz v4, :cond_9

    .line 441
    .line 442
    check-cast v1, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;

    .line 443
    .line 444
    goto :goto_6

    .line 445
    :cond_9
    move-object v1, v3

    .line 446
    :goto_6
    if-eqz v1, :cond_a

    .line 447
    .line 448
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    iget-object v1, v0, La/g1e;->f:La/mne;

    .line 453
    .line 454
    iget-object v7, v1, La/mne;->b:La/dvj;

    .line 455
    .line 456
    sget-object v5, La/b1e;->a:La/b1e;

    .line 457
    .line 458
    new-instance v8, La/c1e;

    .line 459
    .line 460
    invoke-direct {v8, v0, v3, v2}, La/c1e;-><init>(La/g1e;La/yje;B)V

    .line 461
    .line 462
    .line 463
    const/16 v9, 0xa

    .line 464
    .line 465
    const/4 v6, 0x0

    .line 466
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 467
    .line 468
    .line 469
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object v0

    .line 472
    :pswitch_a
    sget-object v0, La/uzd;->S1:La/qud;

    .line 473
    .line 474
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    iget-object v0, v7, La/g1e;->F:La/bby;

    .line 479
    .line 480
    if-eqz v0, :cond_b

    .line 481
    .line 482
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    const/4 v1, 0x1

    .line 487
    if-ne v0, v1, :cond_b

    .line 488
    .line 489
    goto :goto_7

    .line 490
    :cond_b
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    new-instance v5, La/enc;

    .line 495
    .line 496
    const/4 v11, 0x0

    .line 497
    const/16 v12, 0x1b

    .line 498
    .line 499
    const/4 v6, 0x1

    .line 500
    const-class v8, La/g1e;

    .line 501
    .line 502
    const-string v9, "handleAuthorizationError"

    .line 503
    .line 504
    const-string v10, "handleAuthorizationError(Ljava/lang/Throwable;)V"

    .line 505
    .line 506
    invoke-direct/range {v5 .. v12}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 507
    .line 508
    .line 509
    iget-object v1, v7, La/g1e;->f:La/mne;

    .line 510
    .line 511
    iget-object v11, v1, La/mne;->b:La/dvj;

    .line 512
    .line 513
    new-instance v12, La/a1e;

    .line 514
    .line 515
    invoke-direct {v12, v7, v3}, La/a1e;-><init>(La/g1e;La/yje;)V

    .line 516
    .line 517
    .line 518
    const/16 v13, 0xa

    .line 519
    .line 520
    const/4 v10, 0x0

    .line 521
    move-object v8, v0

    .line 522
    move-object v9, v5

    .line 523
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iput-object v0, v7, La/g1e;->F:La/bby;

    .line 528
    .line 529
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object v0

    .line 532
    :pswitch_b
    sget-object v0, La/uzd;->S1:La/qud;

    .line 533
    .line 534
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, La/g1e;->G()V

    .line 539
    .line 540
    .line 541
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 542
    .line 543
    return-object v0

    .line 544
    :pswitch_c
    sget-object v0, La/uzd;->S1:La/qud;

    .line 545
    .line 546
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, La/g1e;->a()V

    .line 551
    .line 552
    .line 553
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0

    .line 556
    :pswitch_d
    sget-object v0, La/uzd;->S1:La/qud;

    .line 557
    .line 558
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v0}, La/g1e;->a()V

    .line 563
    .line 564
    .line 565
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    return-object v0

    .line 568
    :pswitch_e
    sget-object v0, La/uzd;->S1:La/qud;

    .line 569
    .line 570
    invoke-virtual {v4}, La/uzd;->K0()V

    .line 571
    .line 572
    .line 573
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_f
    sget-object v0, La/uzd;->S1:La/qud;

    .line 577
    .line 578
    invoke-virtual {v4}, La/uzd;->J0()La/g1e;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0}, La/g1e;->G()V

    .line 583
    .line 584
    .line 585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object v0

    .line 588
    :pswitch_10
    sget-object v0, La/uzd;->S1:La/qud;

    .line 589
    .line 590
    invoke-virtual {v4}, La/uzd;->K0()V

    .line 591
    .line 592
    .line 593
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 594
    .line 595
    return-object v0

    .line 596
    :pswitch_11
    sget-object v0, La/uzd;->S1:La/qud;

    .line 597
    .line 598
    invoke-virtual {v4}, La/uzd;->K0()V

    .line 599
    .line 600
    .line 601
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 602
    .line 603
    return-object v0

    .line 604
    nop

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
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
