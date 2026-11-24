.class public final synthetic La/aqh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cqh0;


# direct methods
.method public synthetic constructor <init>(La/cqh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aqh0;->a:B

    iput-object p1, p0, La/aqh0;->b:La/cqh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/aqh0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/aqh0;->b:La/cqh0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 11
    .line 12
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    instance-of v0, p0, La/af3;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    check-cast p0, La/af3;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p0, v1

    .line 31
    :goto_0
    const-class v0, La/pph0;

    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/o5d0;

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/ze3;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object p0, v1

    .line 55
    :goto_1
    instance-of v2, p0, La/pph0;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    move-object p0, v1

    .line 60
    :cond_2
    check-cast p0, La/pph0;

    .line 61
    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-static {v3}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, La/pph0;->a(La/i1w0;)La/zsi;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 74
    .line 75
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_2
    return-object v1

    .line 83
    :pswitch_0
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 84
    .line 85
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object v0, p0, La/irh0;->z:La/i1w0;

    .line 90
    .line 91
    new-instance v1, La/pqh0;

    .line 92
    .line 93
    invoke-direct {v1, p0, v2}, La/pqh0;-><init>(La/irh0;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 103
    .line 104
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, La/irh0;->y()V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_2
    sget-object v0, La/cqh0;->N1:La/gne0;

    .line 115
    .line 116
    iget-object v3, p0, La/aqh0;->b:La/cqh0;

    .line 117
    .line 118
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iget-object v0, p0, La/irh0;->b:La/qu;

    .line 123
    .line 124
    sget-object v1, La/pu;->b:La/pu;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, La/qu;->e(La/pu;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, La/irh0;->B:La/ik4;

    .line 130
    .line 131
    sget-object v0, La/r54;->b:La/r54;

    .line 132
    .line 133
    invoke-virtual {p0, v0}, La/ik4;->b(La/r54;)V

    .line 134
    .line 135
    .line 136
    iget-object p0, v3, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 137
    .line 138
    if-eqz p0, :cond_5

    .line 139
    .line 140
    const-string v0, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 141
    .line 142
    const-string v1, ""

    .line 143
    .line 144
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    if-nez v5, :cond_4

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_4
    invoke-virtual {v3}, La/cqh0;->G0()La/zsi;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, La/zsi;->b()La/wdk0;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    const p0, 0x7f130671

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const p0, 0x7f080467

    .line 170
    .line 171
    .line 172
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    iget-object p0, v3, La/cqh0;->K1:La/s0r;

    .line 177
    .line 178
    sget-object v0, La/cqh0;->O1:[La/iiy;

    .line 179
    .line 180
    aget-object v0, v0, v2

    .line 181
    .line 182
    invoke-virtual {p0, v0, v3}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast p0, La/aid;

    .line 190
    .line 191
    iget-object v10, p0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 192
    .line 193
    const/16 v11, 0x10

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    move-object v6, v5

    .line 197
    invoke-static/range {v3 .. v11}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 198
    .line 199
    .line 200
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    :goto_4
    return-object p0

    .line 206
    :pswitch_3
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 207
    .line 208
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    iget-object v0, p0, La/irh0;->b:La/qu;

    .line 213
    .line 214
    sget-object v1, La/pu;->c:La/pu;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, La/qu;->e(La/pu;)V

    .line 217
    .line 218
    .line 219
    iget-object p0, p0, La/irh0;->B:La/ik4;

    .line 220
    .line 221
    sget-object v0, La/r54;->c:La/r54;

    .line 222
    .line 223
    invoke-virtual {p0, v0}, La/ik4;->b(La/r54;)V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_4
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 230
    .line 231
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    new-instance v0, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 236
    .line 237
    sget-object v1, Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;->a:Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;

    .line 238
    .line 239
    const/16 v3, 0x15

    .line 240
    .line 241
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;-><init>(Lorg/xplatform/security/api/navigation/EndFlowNavigation;ZI)V

    .line 242
    .line 243
    .line 244
    iget-object v1, p0, La/irh0;->z:La/i1w0;

    .line 245
    .line 246
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    iget-object p0, p0, La/irh0;->A:La/sek;

    .line 251
    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance p0, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;

    .line 256
    .line 257
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;-><init>(Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;)V

    .line 258
    .line 259
    .line 260
    instance-of v0, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 261
    .line 262
    if-eqz v0, :cond_6

    .line 263
    .line 264
    new-instance v0, La/e1w0;

    .line 265
    .line 266
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 267
    .line 268
    invoke-direct {v0, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 269
    .line 270
    .line 271
    new-instance p0, La/c8d;

    .line 272
    .line 273
    sget-object v4, La/y7d;->a:La/v7d;

    .line 274
    .line 275
    invoke-direct {p0, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_6
    new-instance v0, La/w0w0;

    .line 283
    .line 284
    invoke-direct {v0, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 285
    .line 286
    .line 287
    new-instance p0, La/c8d;

    .line 288
    .line 289
    sget-object v4, La/y7d;->a:La/v7d;

    .line 290
    .line 291
    invoke-direct {p0, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    :goto_5
    invoke-static {v1, v3, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    :goto_6
    move-object v0, p0

    .line 302
    check-cast v0, La/paw;

    .line 303
    .line 304
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_7

    .line 309
    .line 310
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, La/oe50;

    .line 315
    .line 316
    invoke-virtual {v1, v0}, La/i1w0;->a(La/oe50;)V

    .line 317
    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object p0

    .line 323
    :pswitch_5
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 324
    .line 325
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    iget-object p0, v6, La/irh0;->D:La/p7m0;

    .line 330
    .line 331
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    iget-object v0, v6, La/irh0;->r:La/mne;

    .line 344
    .line 345
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 346
    .line 347
    new-instance v4, La/jjh0;

    .line 348
    .line 349
    const/4 v10, 0x0

    .line 350
    const/16 v11, 0x11

    .line 351
    .line 352
    const/4 v5, 0x1

    .line 353
    const-class v7, La/irh0;

    .line 354
    .line 355
    const-string v8, "onError"

    .line 356
    .line 357
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 358
    .line 359
    invoke-direct/range {v4 .. v11}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 360
    .line 361
    .line 362
    new-instance v11, La/frh0;

    .line 363
    .line 364
    const/4 v2, 0x1

    .line 365
    invoke-direct {v11, v6, v1, v2}, La/frh0;-><init>(La/irh0;La/yje;B)V

    .line 366
    .line 367
    .line 368
    const/16 v12, 0xa

    .line 369
    .line 370
    const/4 v9, 0x0

    .line 371
    move-object v7, p0

    .line 372
    move-object v10, v0

    .line 373
    move-object v8, v4

    .line 374
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 375
    .line 376
    .line 377
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 378
    .line 379
    return-object p0

    .line 380
    :pswitch_6
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 381
    .line 382
    invoke-virtual {v3}, La/cqh0;->H0()La/irh0;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    iget-object v0, p0, La/irh0;->z:La/i1w0;

    .line 387
    .line 388
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    iget-object p0, p0, La/irh0;->y:La/qgd;

    .line 393
    .line 394
    invoke-virtual {p0}, La/qgd;->g()Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    instance-of v3, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 399
    .line 400
    if-eqz v3, :cond_8

    .line 401
    .line 402
    new-instance v3, La/e1w0;

    .line 403
    .line 404
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 405
    .line 406
    invoke-direct {v3, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 407
    .line 408
    .line 409
    new-instance p0, La/c8d;

    .line 410
    .line 411
    sget-object v4, La/y7d;->a:La/v7d;

    .line 412
    .line 413
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_7

    .line 420
    :cond_8
    new-instance v3, La/w0w0;

    .line 421
    .line 422
    invoke-direct {v3, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 423
    .line 424
    .line 425
    new-instance p0, La/c8d;

    .line 426
    .line 427
    sget-object v4, La/y7d;->a:La/v7d;

    .line 428
    .line 429
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    :goto_7
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    :goto_8
    move-object v1, p0

    .line 440
    check-cast v1, La/paw;

    .line 441
    .line 442
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-eqz v2, :cond_9

    .line 447
    .line 448
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    check-cast v1, La/oe50;

    .line 453
    .line 454
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 455
    .line 456
    .line 457
    goto :goto_8

    .line 458
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object p0

    .line 461
    :pswitch_7
    sget-object p0, La/cqh0;->N1:La/gne0;

    .line 462
    .line 463
    invoke-virtual {v3}, La/cqh0;->G0()La/zsi;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    iget-object p0, p0, La/zsi;->l:La/n5d0;

    .line 468
    .line 469
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    check-cast p0, La/ysi;

    .line 474
    .line 475
    return-object p0

    .line 476
    nop

    .line 477
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
