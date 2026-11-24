.class public final synthetic La/ggd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jgd0;


# direct methods
.method public synthetic constructor <init>(La/jgd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ggd0;->a:B

    iput-object p1, p0, La/ggd0;->b:La/jgd0;

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
    iget-byte v1, v0, La/ggd0;->a:B

    .line 4
    .line 5
    sget-object v2, La/fhd0;->a:La/fhd0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/ggd0;->b:La/jgd0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/jgd0;->V1:La/xi70;

    .line 15
    .line 16
    iget-object v7, v0, La/ggd0;->b:La/jgd0;

    .line 17
    .line 18
    iget-object v5, v7, La/jgd0;->M1:La/wdk0;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    new-instance v6, La/xdk0;

    .line 23
    .line 24
    sget-object v9, La/rek0;->b:La/rek0;

    .line 25
    .line 26
    const v0, 0x7f130dca

    .line 27
    .line 28
    .line 29
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v14, 0x0

    .line 37
    const/16 v15, 0x7c

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    move-object v8, v6

    .line 43
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 44
    .line 45
    .line 46
    const/16 v12, 0x3fc

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 52
    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_0
    const-string v0, "snackbarManager"

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v4

    .line 63
    :pswitch_0
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 64
    .line 65
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, v2}, La/shd0;->B(La/khd0;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 76
    .line 77
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, v2}, La/shd0;->B(La/khd0;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_2
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 88
    .line 89
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, v0, La/shd0;->c:La/i1w0;

    .line 94
    .line 95
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget-object v0, v0, La/shd0;->o:La/usd;

    .line 100
    .line 101
    invoke-virtual {v0}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    instance-of v4, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 106
    .line 107
    if-eqz v4, :cond_1

    .line 108
    .line 109
    new-instance v4, La/e1w0;

    .line 110
    .line 111
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 112
    .line 113
    invoke-direct {v4, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, La/c8d;

    .line 117
    .line 118
    sget-object v5, La/y7d;->a:La/v7d;

    .line 119
    .line 120
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    new-instance v4, La/w0w0;

    .line 128
    .line 129
    invoke-direct {v4, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 130
    .line 131
    .line 132
    new-instance v0, La/c8d;

    .line 133
    .line 134
    sget-object v5, La/y7d;->a:La/v7d;

    .line 135
    .line 136
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :goto_0
    invoke-static {v1, v2, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_1
    move-object v2, v0

    .line 147
    check-cast v2, La/paw;

    .line 148
    .line 149
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_2

    .line 154
    .line 155
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, La/oe50;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_3
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 169
    .line 170
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v1, v0, La/shd0;->c:La/i1w0;

    .line 175
    .line 176
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iget-object v0, v0, La/shd0;->k:La/pmi0;

    .line 181
    .line 182
    invoke-static {v0, v3}, La/pmi0;->b(La/pmi0;Z)Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-instance v4, La/q0w0;

    .line 187
    .line 188
    invoke-direct {v4, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 189
    .line 190
    .line 191
    new-instance v0, La/c8d;

    .line 192
    .line 193
    sget-object v5, La/y7d;->a:La/v7d;

    .line 194
    .line 195
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v2, v0, v1, v2, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :goto_2
    move-object v2, v0

    .line 203
    check-cast v2, La/paw;

    .line 204
    .line 205
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-eqz v3, :cond_3

    .line 210
    .line 211
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, La/oe50;

    .line 216
    .line 217
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_4
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 225
    .line 226
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v1, v0, La/shd0;->c:La/i1w0;

    .line 231
    .line 232
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    iget-object v0, v0, La/shd0;->k:La/pmi0;

    .line 237
    .line 238
    invoke-static {v0, v3}, La/pmi0;->b(La/pmi0;Z)Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-instance v4, La/q0w0;

    .line 243
    .line 244
    invoke-direct {v4, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 245
    .line 246
    .line 247
    new-instance v0, La/c8d;

    .line 248
    .line 249
    sget-object v5, La/y7d;->a:La/v7d;

    .line 250
    .line 251
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 252
    .line 253
    .line 254
    invoke-static {v2, v0, v1, v2, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    :goto_3
    move-object v2, v0

    .line 259
    check-cast v2, La/paw;

    .line 260
    .line 261
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_4

    .line 266
    .line 267
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, La/oe50;

    .line 272
    .line 273
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_5
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 281
    .line 282
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    iget-object v1, v0, La/shd0;->c:La/i1w0;

    .line 287
    .line 288
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iget-object v0, v0, La/shd0;->k:La/pmi0;

    .line 293
    .line 294
    invoke-static {v0, v3}, La/pmi0;->b(La/pmi0;Z)Lorg/xplatform/settings/impl/navigation/SettingsScreenFactoryImpl$getScreen$1;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    new-instance v4, La/q0w0;

    .line 299
    .line 300
    invoke-direct {v4, v0}, La/q0w0;-><init>(La/m7h0;)V

    .line 301
    .line 302
    .line 303
    new-instance v0, La/c8d;

    .line 304
    .line 305
    sget-object v5, La/y7d;->a:La/v7d;

    .line 306
    .line 307
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v2, v0, v1, v2, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    :goto_4
    move-object v2, v0

    .line 315
    check-cast v2, La/paw;

    .line 316
    .line 317
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-eqz v3, :cond_5

    .line 322
    .line 323
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    check-cast v2, La/oe50;

    .line 328
    .line 329
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_6
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 337
    .line 338
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    instance-of v1, v0, La/af3;

    .line 350
    .line 351
    if-eqz v1, :cond_6

    .line 352
    .line 353
    check-cast v0, La/af3;

    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_6
    move-object v0, v4

    .line 357
    :goto_5
    const-class v1, La/kgd0;

    .line 358
    .line 359
    if-eqz v0, :cond_9

    .line 360
    .line 361
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    check-cast v0, La/o5d0;

    .line 370
    .line 371
    if-eqz v0, :cond_7

    .line 372
    .line 373
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, La/ze3;

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :cond_7
    move-object v0, v4

    .line 381
    :goto_6
    instance-of v2, v0, La/kgd0;

    .line 382
    .line 383
    if-nez v2, :cond_8

    .line 384
    .line 385
    move-object v0, v4

    .line 386
    :cond_8
    check-cast v0, La/kgd0;

    .line 387
    .line 388
    if-eqz v0, :cond_9

    .line 389
    .line 390
    new-instance v6, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;

    .line 391
    .line 392
    iget-object v1, v5, La/jgd0;->Q1:La/yzn0;

    .line 393
    .line 394
    sget-object v2, La/jgd0;->W1:[La/iiy;

    .line 395
    .line 396
    const/4 v3, 0x1

    .line 397
    aget-object v3, v2, v3

    .line 398
    .line 399
    invoke-virtual {v1, v5, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    move-object v7, v1

    .line 404
    check-cast v7, La/swp0;

    .line 405
    .line 406
    iget-object v1, v5, La/jgd0;->R1:La/r34;

    .line 407
    .line 408
    const/4 v3, 0x2

    .line 409
    aget-object v3, v2, v3

    .line 410
    .line 411
    invoke-virtual {v1, v5, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 416
    .line 417
    .line 418
    move-result-wide v8

    .line 419
    iget-object v1, v5, La/jgd0;->S1:La/yzn0;

    .line 420
    .line 421
    const/4 v3, 0x3

    .line 422
    aget-object v3, v2, v3

    .line 423
    .line 424
    invoke-virtual {v1, v5, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    move-object v10, v1

    .line 429
    check-cast v10, La/yed0;

    .line 430
    .line 431
    iget-object v1, v5, La/jgd0;->U1:La/es;

    .line 432
    .line 433
    const/4 v3, 0x4

    .line 434
    aget-object v2, v2, v3

    .line 435
    .line 436
    invoke-virtual {v1, v5, v2}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v11

    .line 440
    invoke-direct/range {v6 .. v11}, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;-><init>(La/swp0;JLa/yed0;Ljava/util/List;)V

    .line 441
    .line 442
    .line 443
    iget-object v7, v0, La/kgd0;->a:La/zx10;

    .line 444
    .line 445
    iget-object v12, v0, La/kgd0;->b:La/mne;

    .line 446
    .line 447
    iget-object v13, v0, La/kgd0;->c:La/duj;

    .line 448
    .line 449
    iget-object v14, v0, La/kgd0;->d:La/rou;

    .line 450
    .line 451
    iget-object v15, v0, La/kgd0;->e:La/ubu;

    .line 452
    .line 453
    iget-object v8, v0, La/kgd0;->g:La/iw20;

    .line 454
    .line 455
    iget-object v1, v0, La/kgd0;->f:La/zoi0;

    .line 456
    .line 457
    iget-object v10, v0, La/kgd0;->h:La/ii;

    .line 458
    .line 459
    iget-object v2, v0, La/kgd0;->i:La/pmi0;

    .line 460
    .line 461
    iget-object v3, v0, La/kgd0;->j:La/rjo;

    .line 462
    .line 463
    iget-object v4, v0, La/kgd0;->k:La/m1e;

    .line 464
    .line 465
    iget-object v5, v0, La/kgd0;->l:La/wdk0;

    .line 466
    .line 467
    iget-object v9, v0, La/kgd0;->m:La/lef0;

    .line 468
    .line 469
    iget-object v11, v0, La/kgd0;->n:La/yuu;

    .line 470
    .line 471
    move-object/from16 v16, v1

    .line 472
    .line 473
    iget-object v1, v0, La/kgd0;->o:La/usd;

    .line 474
    .line 475
    iget-object v0, v0, La/kgd0;->p:La/ctf0;

    .line 476
    .line 477
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-object/from16 v21, v11

    .line 490
    .line 491
    move-object v11, v6

    .line 492
    new-instance v6, La/oqi;

    .line 493
    .line 494
    move-object/from16 v23, v0

    .line 495
    .line 496
    move-object/from16 v22, v1

    .line 497
    .line 498
    move-object/from16 v17, v2

    .line 499
    .line 500
    move-object/from16 v18, v3

    .line 501
    .line 502
    move-object/from16 v19, v4

    .line 503
    .line 504
    move-object/from16 v20, v5

    .line 505
    .line 506
    invoke-direct/range {v6 .. v23}, La/oqi;-><init>(La/zx10;La/iw20;La/lef0;La/ii;Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/params/QrCheckCodeBySmsParams;La/mne;La/duj;La/rou;La/ubu;La/zoi0;La/pmi0;La/rjo;La/m1e;La/wdk0;La/yuu;La/usd;La/ctf0;)V

    .line 507
    .line 508
    .line 509
    move-object v4, v6

    .line 510
    goto :goto_7

    .line 511
    :cond_9
    const-string v0, "Cannot create dependency "

    .line 512
    .line 513
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    :goto_7
    return-object v4

    .line 521
    :pswitch_7
    new-instance v0, La/t0h0;

    .line 522
    .line 523
    iget-object v1, v5, La/jgd0;->K1:La/nqi;

    .line 524
    .line 525
    if-eqz v1, :cond_a

    .line 526
    .line 527
    invoke-static {v5}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-direct {v0, v1, v2}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 532
    .line 533
    .line 534
    return-object v0

    .line 535
    :cond_a
    const-string v0, "viewModelFactory"

    .line 536
    .line 537
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v4

    .line 541
    :pswitch_8
    sget-object v0, La/jgd0;->V1:La/xi70;

    .line 542
    .line 543
    invoke-virtual {v5}, La/jgd0;->I0()La/shd0;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v0}, La/shd0;->A()V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
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
