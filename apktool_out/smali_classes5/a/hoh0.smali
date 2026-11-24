.class public final synthetic La/hoh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/joh0;


# direct methods
.method public synthetic constructor <init>(La/joh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hoh0;->a:B

    iput-object p1, p0, La/hoh0;->b:La/joh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/hoh0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/hoh0;->b:La/joh0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, La/joh0;->N1:La/eke0;

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
    sget-object v0, La/joh0;->N1:La/eke0;

    .line 84
    .line 85
    iget-object v3, p0, La/hoh0;->b:La/joh0;

    .line 86
    .line 87
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget-object v0, p0, La/iph0;->b:La/qu;

    .line 92
    .line 93
    sget-object v1, La/pu;->b:La/pu;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, La/qu;->e(La/pu;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/iph0;->c:La/ik4;

    .line 99
    .line 100
    sget-object v0, La/r54;->b:La/r54;

    .line 101
    .line 102
    invoke-virtual {p0, v0}, La/ik4;->b(La/r54;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, v3, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 106
    .line 107
    if-eqz p0, :cond_5

    .line 108
    .line 109
    const-string v0, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 110
    .line 111
    const-string v1, ""

    .line 112
    .line 113
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    if-nez v5, :cond_4

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    invoke-virtual {v3}, La/joh0;->G0()La/zsi;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, La/zsi;->b()La/wdk0;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const p0, 0x7f130671

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    const p0, 0x7f080467

    .line 139
    .line 140
    .line 141
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    iget-object p0, v3, La/joh0;->L1:La/s0r;

    .line 146
    .line 147
    sget-object v0, La/joh0;->O1:[La/iiy;

    .line 148
    .line 149
    aget-object v0, v0, v2

    .line 150
    .line 151
    invoke-virtual {p0, v0, v3}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    check-cast p0, La/aid;

    .line 159
    .line 160
    iget-object v10, p0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 161
    .line 162
    const/16 v11, 0x10

    .line 163
    .line 164
    const/4 v8, 0x0

    .line 165
    move-object v6, v5

    .line 166
    invoke-static/range {v3 .. v11}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    :goto_4
    return-object p0

    .line 175
    :pswitch_1
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 176
    .line 177
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    iget-object v0, p0, La/iph0;->b:La/qu;

    .line 182
    .line 183
    sget-object v1, La/pu;->c:La/pu;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, La/qu;->e(La/pu;)V

    .line 186
    .line 187
    .line 188
    iget-object p0, p0, La/iph0;->c:La/ik4;

    .line 189
    .line 190
    sget-object v0, La/r54;->c:La/r54;

    .line 191
    .line 192
    invoke-virtual {p0, v0}, La/ik4;->b(La/r54;)V

    .line 193
    .line 194
    .line 195
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_2
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 199
    .line 200
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    iget-object v0, p0, La/iph0;->A:La/i1w0;

    .line 205
    .line 206
    new-instance v1, La/qoh0;

    .line 207
    .line 208
    invoke-direct {v1, p0, v2}, La/qoh0;-><init>(La/iph0;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_3
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 218
    .line 219
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-virtual {p0}, La/iph0;->x()V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_4
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 230
    .line 231
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    iget-object v0, p0, La/iph0;->A:La/i1w0;

    .line 236
    .line 237
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iget-object p0, p0, La/iph0;->z:La/qgd;

    .line 242
    .line 243
    invoke-virtual {p0}, La/qgd;->g()Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    instance-of v3, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 248
    .line 249
    if-eqz v3, :cond_6

    .line 250
    .line 251
    new-instance v3, La/e1w0;

    .line 252
    .line 253
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 254
    .line 255
    invoke-direct {v3, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 256
    .line 257
    .line 258
    new-instance p0, La/c8d;

    .line 259
    .line 260
    sget-object v4, La/y7d;->a:La/v7d;

    .line 261
    .line 262
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_6
    new-instance v3, La/w0w0;

    .line 270
    .line 271
    invoke-direct {v3, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 272
    .line 273
    .line 274
    new-instance p0, La/c8d;

    .line 275
    .line 276
    sget-object v4, La/y7d;->a:La/v7d;

    .line 277
    .line 278
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    :goto_5
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    :goto_6
    move-object v1, p0

    .line 289
    check-cast v1, La/paw;

    .line 290
    .line 291
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_7

    .line 296
    .line 297
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, La/oe50;

    .line 302
    .line 303
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_5
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 311
    .line 312
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    new-instance v0, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 317
    .line 318
    sget-object v1, Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;->a:Lorg/xplatform/security/api/navigation/EndFlowNavigation$ToPersonalDataScreen;

    .line 319
    .line 320
    const/16 v3, 0x15

    .line 321
    .line 322
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;-><init>(Lorg/xplatform/security/api/navigation/EndFlowNavigation;ZI)V

    .line 323
    .line 324
    .line 325
    iget-object v1, p0, La/iph0;->A:La/i1w0;

    .line 326
    .line 327
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    iget-object p0, p0, La/iph0;->B:La/sek;

    .line 332
    .line 333
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance p0, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;

    .line 337
    .line 338
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/EmailScreenFactoryImpl$getBindEmailScreen$1;-><init>(Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;)V

    .line 339
    .line 340
    .line 341
    instance-of v0, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 342
    .line 343
    if-eqz v0, :cond_8

    .line 344
    .line 345
    new-instance v0, La/e1w0;

    .line 346
    .line 347
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 348
    .line 349
    invoke-direct {v0, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 350
    .line 351
    .line 352
    new-instance p0, La/c8d;

    .line 353
    .line 354
    sget-object v4, La/y7d;->a:La/v7d;

    .line 355
    .line 356
    invoke-direct {p0, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto :goto_7

    .line 363
    :cond_8
    new-instance v0, La/w0w0;

    .line 364
    .line 365
    invoke-direct {v0, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 366
    .line 367
    .line 368
    new-instance p0, La/c8d;

    .line 369
    .line 370
    sget-object v4, La/y7d;->a:La/v7d;

    .line 371
    .line 372
    invoke-direct {p0, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    :goto_7
    invoke-static {v1, v3, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    :goto_8
    move-object v0, p0

    .line 383
    check-cast v0, La/paw;

    .line 384
    .line 385
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-eqz v2, :cond_9

    .line 390
    .line 391
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, La/oe50;

    .line 396
    .line 397
    invoke-virtual {v1, v0}, La/i1w0;->a(La/oe50;)V

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    return-object p0

    .line 404
    :pswitch_6
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 405
    .line 406
    invoke-virtual {v3}, La/joh0;->H0()La/iph0;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    iget-object p0, v6, La/iph0;->H:La/bby;

    .line 411
    .line 412
    const/4 v0, 0x1

    .line 413
    if-eqz p0, :cond_a

    .line 414
    .line 415
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-ne p0, v0, :cond_a

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_a
    iget-object p0, v6, La/iph0;->D:La/p7m0;

    .line 423
    .line 424
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 425
    .line 426
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-virtual {p0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    iget-object v2, v6, La/iph0;->s:La/mne;

    .line 437
    .line 438
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 439
    .line 440
    new-instance v4, La/jjh0;

    .line 441
    .line 442
    const/4 v10, 0x0

    .line 443
    const/4 v11, 0x7

    .line 444
    const/4 v5, 0x1

    .line 445
    const-class v7, La/iph0;

    .line 446
    .line 447
    const-string v8, "onError"

    .line 448
    .line 449
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 450
    .line 451
    invoke-direct/range {v4 .. v11}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 452
    .line 453
    .line 454
    new-instance v11, La/fph0;

    .line 455
    .line 456
    invoke-direct {v11, v6, v1, v0}, La/fph0;-><init>(La/iph0;La/yje;B)V

    .line 457
    .line 458
    .line 459
    const/16 v12, 0xa

    .line 460
    .line 461
    const/4 v9, 0x0

    .line 462
    move-object v7, p0

    .line 463
    move-object v10, v2

    .line 464
    move-object v8, v4

    .line 465
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    iput-object p0, v6, La/iph0;->H:La/bby;

    .line 470
    .line 471
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_7
    sget-object p0, La/joh0;->N1:La/eke0;

    .line 475
    .line 476
    invoke-virtual {v3}, La/joh0;->G0()La/zsi;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    iget-object p0, p0, La/zsi;->j:La/n5d0;

    .line 481
    .line 482
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    check-cast p0, La/wsi;

    .line 487
    .line 488
    return-object p0

    .line 489
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
