.class public final synthetic La/gz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mz;


# direct methods
.method public synthetic constructor <init>(La/mz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gz;->a:B

    iput-object p1, p0, La/gz;->b:La/mz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gz;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sget-object v3, La/qz;->a:La/qz;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, v0, La/gz;->b:La/mz;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 17
    .line 18
    invoke-virtual {v7}, La/mz;->H0()La/g00;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/g00;->z:La/ol60;

    .line 23
    .line 24
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 31
    .line 32
    invoke-virtual {v7}, La/mz;->H0()La/g00;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v0, v0, La/g00;->z:La/ol60;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_1
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 45
    .line 46
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, La/t32;

    .line 59
    .line 60
    const/16 v3, 0x1c

    .line 61
    .line 62
    invoke-direct {v2, v3}, La/t32;-><init>(B)V

    .line 63
    .line 64
    .line 65
    if-nez v1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v3, Landroid/os/Handler;

    .line 73
    .line 74
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-direct {v3, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/b1;

    .line 82
    .line 83
    invoke-direct {v8, v0, v1, v2, v5}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    invoke-virtual {v3, v8, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 89
    .line 90
    .line 91
    :goto_0
    invoke-virtual {v7}, La/mz;->H0()La/g00;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-boolean v1, v0, La/g00;->D:Z

    .line 96
    .line 97
    if-nez v1, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    iget-object v1, v0, La/g00;->p:La/mne;

    .line 105
    .line 106
    iget-object v10, v1, La/mne;->a:La/rwj;

    .line 107
    .line 108
    new-instance v8, La/nz;

    .line 109
    .line 110
    invoke-direct {v8, v0, v4}, La/nz;-><init>(La/g00;B)V

    .line 111
    .line 112
    .line 113
    new-instance v11, La/oa;

    .line 114
    .line 115
    invoke-direct {v11, v0, v6, v5}, La/oa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 116
    .line 117
    .line 118
    const/16 v12, 0xa

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 122
    .line 123
    .line 124
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_2
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 128
    .line 129
    invoke-virtual {v7}, La/mz;->H0()La/g00;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v8, La/zz;

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x0

    .line 141
    const/4 v9, 0x1

    .line 142
    const-class v11, La/g00;

    .line 143
    .line 144
    const-string v12, "handleError"

    .line 145
    .line 146
    const-string v13, "handleError(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V"

    .line 147
    .line 148
    invoke-direct/range {v8 .. v15}, La/zz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v10, La/g00;->p:La/mne;

    .line 152
    .line 153
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 154
    .line 155
    new-instance v2, La/kz;

    .line 156
    .line 157
    invoke-direct {v2, v10, v6}, La/kz;-><init>(La/g00;La/yje;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v0, v8, v6, v1, v2}, La/sac;->R(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_3
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 167
    .line 168
    iget-object v0, v7, La/mz;->O1:La/a8z;

    .line 169
    .line 170
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, La/d6i;

    .line 175
    .line 176
    iget-object v0, v0, La/d6i;->s:La/n5d0;

    .line 177
    .line 178
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, La/c6i;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_4
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 186
    .line 187
    invoke-virtual {v7}, La/mz;->H0()La/g00;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-object v1, v0, La/g00;->m:La/i1w0;

    .line 192
    .line 193
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iget-object v3, v0, La/g00;->i:La/zn00;

    .line 198
    .line 199
    iget-object v0, v0, La/g00;->c:La/chf0;

    .line 200
    .line 201
    iget-object v0, v0, La/chf0;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, La/we50;

    .line 204
    .line 205
    invoke-virtual {v3, v0}, La/zn00;->G0(La/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v2, v0}, La/k0w0;->c(La/m7h0;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 213
    .line 214
    invoke-static {v1, v0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :goto_2
    move-object v2, v0

    .line 219
    check-cast v2, La/paw;

    .line 220
    .line 221
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_2

    .line 226
    .line 227
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, La/oe50;

    .line 232
    .line 233
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_5
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 241
    .line 242
    invoke-virtual {v7}, La/mz;->H0()La/g00;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iget-object v1, v0, La/g00;->m:La/i1w0;

    .line 247
    .line 248
    iget-object v3, v0, La/g00;->c:La/chf0;

    .line 249
    .line 250
    iget-object v3, v3, La/chf0;->c:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v3, La/we50;

    .line 253
    .line 254
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eq v3, v2, :cond_4

    .line 259
    .line 260
    if-eq v3, v5, :cond_3

    .line 261
    .line 262
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    new-instance v2, La/c8d;

    .line 267
    .line 268
    sget-object v3, La/y7d;->a:La/v7d;

    .line 269
    .line 270
    sget-object v5, La/r0w0;->a:La/r0w0;

    .line 271
    .line 272
    invoke-direct {v2, v3, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v0, v2, v1, v0, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    :goto_3
    move-object v2, v0

    .line 280
    check-cast v2, La/paw;

    .line 281
    .line 282
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-eqz v3, :cond_6

    .line 287
    .line 288
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    check-cast v2, La/oe50;

    .line 293
    .line 294
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_3
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iget-object v0, v0, La/g00;->l:La/iw20;

    .line 303
    .line 304
    sget-object v3, La/nqh0;->a:La/nqh0;

    .line 305
    .line 306
    invoke-static {v0, v3}, La/iw20;->f(La/iw20;La/nqh0;)Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    new-instance v3, La/q0w0;

    .line 311
    .line 312
    invoke-direct {v3, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 313
    .line 314
    .line 315
    new-instance v0, La/c8d;

    .line 316
    .line 317
    sget-object v5, La/y7d;->a:La/v7d;

    .line 318
    .line 319
    invoke-direct {v0, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v2, v0, v1, v2, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    :goto_4
    move-object v2, v0

    .line 327
    check-cast v2, La/paw;

    .line 328
    .line 329
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_6

    .line 334
    .line 335
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    check-cast v2, La/oe50;

    .line 340
    .line 341
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_4
    iget-object v2, v0, La/g00;->e:La/joc;

    .line 346
    .line 347
    iget-object v2, v2, La/joc;->a:La/g090;

    .line 348
    .line 349
    iget-object v2, v2, La/g090;->a:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v2, La/d190;

    .line 352
    .line 353
    iget-object v2, v2, La/d190;->e:La/pwf0;

    .line 354
    .line 355
    sget-object v3, La/pwf0;->c:La/pwf0;

    .line 356
    .line 357
    if-ne v2, v3, :cond_5

    .line 358
    .line 359
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    iget-object v0, v0, La/g00;->j:La/jh70;

    .line 364
    .line 365
    invoke-static {v0, v4}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    new-instance v3, La/q0w0;

    .line 370
    .line 371
    invoke-direct {v3, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 372
    .line 373
    .line 374
    new-instance v0, La/c8d;

    .line 375
    .line 376
    sget-object v5, La/y7d;->a:La/v7d;

    .line 377
    .line 378
    invoke-direct {v0, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 379
    .line 380
    .line 381
    invoke-static {v2, v0, v1, v2, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    :goto_5
    move-object v2, v0

    .line 386
    check-cast v2, La/paw;

    .line 387
    .line 388
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_6

    .line 393
    .line 394
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    check-cast v2, La/oe50;

    .line 399
    .line 400
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 401
    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_5
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    iget-object v0, v0, La/g00;->h:La/qgd;

    .line 409
    .line 410
    invoke-virtual {v0}, La/qgd;->f0()Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    new-instance v3, La/d1w0;

    .line 415
    .line 416
    invoke-direct {v3, v0}, La/d1w0;-><init>(La/m7h0;)V

    .line 417
    .line 418
    .line 419
    new-instance v0, La/c8d;

    .line 420
    .line 421
    sget-object v5, La/y7d;->a:La/v7d;

    .line 422
    .line 423
    invoke-direct {v0, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 424
    .line 425
    .line 426
    invoke-static {v2, v0, v1, v2, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    :goto_6
    move-object v2, v0

    .line 431
    check-cast v2, La/paw;

    .line 432
    .line 433
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-eqz v3, :cond_6

    .line 438
    .line 439
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    check-cast v2, La/oe50;

    .line 444
    .line 445
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_6
    sget-object v1, La/mz;->V1:La/jdk0;

    .line 453
    .line 454
    iget-object v9, v0, La/gz;->b:La/mz;

    .line 455
    .line 456
    iget-object v7, v9, La/mz;->N1:La/wdk0;

    .line 457
    .line 458
    if-eqz v7, :cond_7

    .line 459
    .line 460
    new-instance v8, La/xdk0;

    .line 461
    .line 462
    sget-object v11, La/rek0;->b:La/rek0;

    .line 463
    .line 464
    const v0, 0x7f130dca

    .line 465
    .line 466
    .line 467
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v12

    .line 471
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    const/16 v16, 0x0

    .line 475
    .line 476
    const/16 v17, 0x7c

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const/4 v14, 0x0

    .line 480
    const/4 v15, 0x0

    .line 481
    move-object v10, v8

    .line 482
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 483
    .line 484
    .line 485
    const/16 v14, 0x3fc

    .line 486
    .line 487
    const/4 v10, 0x0

    .line 488
    const/4 v11, 0x0

    .line 489
    const/4 v12, 0x0

    .line 490
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 491
    .line 492
    .line 493
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object v0

    .line 496
    :cond_7
    const-string v0, "snackbarManager"

    .line 497
    .line 498
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    throw v6

    .line 502
    :pswitch_7
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 503
    .line 504
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    instance-of v1, v0, La/af3;

    .line 516
    .line 517
    if-eqz v1, :cond_8

    .line 518
    .line 519
    check-cast v0, La/af3;

    .line 520
    .line 521
    goto :goto_7

    .line 522
    :cond_8
    move-object v0, v6

    .line 523
    :goto_7
    const-class v1, La/fz;

    .line 524
    .line 525
    if-eqz v0, :cond_b

    .line 526
    .line 527
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    check-cast v0, La/o5d0;

    .line 536
    .line 537
    if-eqz v0, :cond_9

    .line 538
    .line 539
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    check-cast v0, La/ze3;

    .line 544
    .line 545
    goto :goto_8

    .line 546
    :cond_9
    move-object v0, v6

    .line 547
    :goto_8
    instance-of v3, v0, La/fz;

    .line 548
    .line 549
    if-nez v3, :cond_a

    .line 550
    .line 551
    move-object v0, v6

    .line 552
    :cond_a
    check-cast v0, La/fz;

    .line 553
    .line 554
    if-eqz v0, :cond_b

    .line 555
    .line 556
    invoke-static {v7}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    new-instance v1, La/chf0;

    .line 561
    .line 562
    iget-object v3, v7, La/mz;->S1:La/khf0;

    .line 563
    .line 564
    sget-object v4, La/mz;->W1:[La/iiy;

    .line 565
    .line 566
    aget-object v2, v4, v2

    .line 567
    .line 568
    invoke-virtual {v3, v7, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    check-cast v2, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 573
    .line 574
    iget-object v3, v7, La/mz;->U1:La/yzn0;

    .line 575
    .line 576
    aget-object v4, v4, v5

    .line 577
    .line 578
    invoke-virtual {v3, v7, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    check-cast v3, La/we50;

    .line 583
    .line 584
    const/4 v4, 0x4

    .line 585
    invoke-direct {v1, v2, v3, v4}, La/chf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iget-object v11, v0, La/fz;->b:La/pp90;

    .line 592
    .line 593
    iget-object v14, v0, La/fz;->a:La/qgd;

    .line 594
    .line 595
    iget-object v15, v0, La/fz;->c:La/jh70;

    .line 596
    .line 597
    iget-object v2, v0, La/fz;->d:La/rjo;

    .line 598
    .line 599
    iget-object v3, v0, La/fz;->e:La/pru;

    .line 600
    .line 601
    iget-object v4, v0, La/fz;->f:La/duj;

    .line 602
    .line 603
    iget-object v9, v0, La/fz;->g:La/cad;

    .line 604
    .line 605
    iget-object v5, v0, La/fz;->h:La/d190;

    .line 606
    .line 607
    iget-object v12, v0, La/fz;->j:La/ii;

    .line 608
    .line 609
    iget-object v6, v0, La/fz;->i:La/ntu;

    .line 610
    .line 611
    iget-object v7, v0, La/fz;->k:La/fsd;

    .line 612
    .line 613
    iget-object v10, v0, La/fz;->l:La/lef0;

    .line 614
    .line 615
    iget-object v8, v0, La/fz;->m:La/ctf0;

    .line 616
    .line 617
    move-object/from16 v18, v1

    .line 618
    .line 619
    iget-object v1, v0, La/fz;->n:La/gii0;

    .line 620
    .line 621
    move-object/from16 v16, v1

    .line 622
    .line 623
    iget-object v1, v0, La/fz;->o:La/m1e;

    .line 624
    .line 625
    move-object/from16 v22, v1

    .line 626
    .line 627
    iget-object v1, v0, La/fz;->p:La/wdk0;

    .line 628
    .line 629
    move-object/from16 v23, v1

    .line 630
    .line 631
    iget-object v1, v0, La/fz;->q:La/rl70;

    .line 632
    .line 633
    move-object/from16 v24, v1

    .line 634
    .line 635
    iget-object v1, v0, La/fz;->r:La/rpt;

    .line 636
    .line 637
    iget-object v0, v0, La/fz;->s:La/zn00;

    .line 638
    .line 639
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    move-object/from16 v21, v8

    .line 664
    .line 665
    new-instance v8, La/d6i;

    .line 666
    .line 667
    move-object/from16 v26, v0

    .line 668
    .line 669
    move-object/from16 v25, v1

    .line 670
    .line 671
    move-object/from16 v16, v2

    .line 672
    .line 673
    move-object/from16 v17, v3

    .line 674
    .line 675
    move-object/from16 v19, v4

    .line 676
    .line 677
    move-object/from16 v20, v6

    .line 678
    .line 679
    invoke-direct/range {v8 .. v26}, La/d6i;-><init>(La/cad;La/lef0;La/pp90;La/ii;La/i1w0;La/qgd;La/jh70;La/rjo;La/pru;La/chf0;La/duj;La/ntu;La/ctf0;La/m1e;La/wdk0;La/rl70;La/rpt;La/zn00;)V

    .line 680
    .line 681
    .line 682
    move-object v6, v8

    .line 683
    goto :goto_9

    .line 684
    :cond_b
    const-string v0, "Cannot create dependency "

    .line 685
    .line 686
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    :goto_9
    return-object v6

    .line 694
    nop

    .line 695
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
