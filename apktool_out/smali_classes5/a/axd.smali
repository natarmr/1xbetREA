.class public final synthetic La/axd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/exd;


# direct methods
.method public synthetic constructor <init>(La/exd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/axd;->a:B

    iput-object p1, p0, La/axd;->b:La/exd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/axd;->a:B

    .line 4
    .line 5
    const-string v2, "authenticator"

    .line 6
    .line 7
    const-wide/16 v3, 0xd10

    .line 8
    .line 9
    const-wide/16 v5, 0xd0d

    .line 10
    .line 11
    const-string v7, "action"

    .line 12
    .line 13
    const-string v8, "authenticator_linked_device_click"

    .line 14
    .line 15
    sget-object v9, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;->a:Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;

    .line 16
    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x1

    .line 20
    const/4 v13, 0x0

    .line 21
    iget-object v14, v0, La/axd;->b:La/exd;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    sget-object v0, La/exd;->U1:La/usd;

    .line 27
    .line 28
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v13}, La/kyd;->D(Z)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    sget-object v1, La/exd;->U1:La/usd;

    .line 39
    .line 40
    iget-object v4, v0, La/axd;->b:La/exd;

    .line 41
    .line 42
    iget-object v2, v4, La/exd;->M1:La/wdk0;

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    new-instance v3, La/xdk0;

    .line 47
    .line 48
    sget-object v13, La/rek0;->b:La/rek0;

    .line 49
    .line 50
    const v0, 0x7f130dca

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v14

    .line 57
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x7c

    .line 63
    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    move-object v12, v3

    .line 70
    invoke-direct/range {v12 .. v19}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 71
    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    const/16 v9, 0x3fc

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 80
    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_0
    const-string v0, "snackbarManager"

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v11

    .line 91
    :pswitch_1
    sget-object v0, La/exd;->U1:La/usd;

    .line 92
    .line 93
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0, v12}, La/kyd;->D(Z)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_2
    sget-object v0, La/exd;->U1:La/usd;

    .line 104
    .line 105
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, v13}, La/kyd;->D(Z)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_3
    sget-object v0, La/exd;->U1:La/usd;

    .line 116
    .line 117
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v1, v0, La/kyd;->p:Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;

    .line 122
    .line 123
    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_1

    .line 128
    .line 129
    iget-object v1, v0, La/kyd;->z:La/yo4;

    .line 130
    .line 131
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 132
    .line 133
    const-string v2, "confirm"

    .line 134
    .line 135
    invoke-static {v7, v2, v1, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, v0, La/kyd;->A:La/zr1;

    .line 139
    .line 140
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 141
    .line 142
    invoke-static {v2, v1, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 143
    .line 144
    .line 145
    :cond_1
    iget-boolean v1, v0, La/kyd;->J:Z

    .line 146
    .line 147
    if-nez v1, :cond_2

    .line 148
    .line 149
    iget-object v0, v0, La/kyd;->D:La/ol60;

    .line 150
    .line 151
    sget-object v1, La/kxd;->a:La/kxd;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    new-instance v15, La/enc;

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const/16 v22, 0x15

    .line 166
    .line 167
    const/16 v16, 0x1

    .line 168
    .line 169
    const-class v18, La/kyd;

    .line 170
    .line 171
    const-string v19, "handleServerError"

    .line 172
    .line 173
    const-string v20, "handleServerError(Ljava/lang/Throwable;)V"

    .line 174
    .line 175
    move-object/from16 v17, v0

    .line 176
    .line 177
    invoke-direct/range {v15 .. v22}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 178
    .line 179
    .line 180
    new-instance v1, La/yxd;

    .line 181
    .line 182
    invoke-direct {v1, v0, v11, v13}, La/yxd;-><init>(La/kyd;La/yje;B)V

    .line 183
    .line 184
    .line 185
    new-instance v3, La/enc;

    .line 186
    .line 187
    const/16 v20, 0x0

    .line 188
    .line 189
    const/16 v21, 0x16

    .line 190
    .line 191
    move-object/from16 v16, v15

    .line 192
    .line 193
    const/4 v15, 0x1

    .line 194
    const-class v17, Lkotlin/jvm/functions/Function1;

    .line 195
    .line 196
    const-string v18, "invoke"

    .line 197
    .line 198
    const-string v19, "invoke(Ljava/lang/Object;)Ljava/lang/Object;"

    .line 199
    .line 200
    move-object v14, v3

    .line 201
    invoke-direct/range {v14 .. v21}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 202
    .line 203
    .line 204
    iget-object v4, v0, La/kyd;->c:La/mne;

    .line 205
    .line 206
    iget-object v5, v4, La/mne;->a:La/rwj;

    .line 207
    .line 208
    new-instance v4, La/fxd;

    .line 209
    .line 210
    invoke-direct {v4, v0, v12}, La/fxd;-><init>(La/kyd;B)V

    .line 211
    .line 212
    .line 213
    new-instance v6, La/cxd;

    .line 214
    .line 215
    invoke-direct {v6, v0, v1, v11, v10}, La/cxd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 216
    .line 217
    .line 218
    const/16 v7, 0x8

    .line 219
    .line 220
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 221
    .line 222
    .line 223
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_4
    sget-object v0, La/exd;->U1:La/usd;

    .line 227
    .line 228
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0, v12}, La/kyd;->E(Z)V

    .line 233
    .line 234
    .line 235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_5
    sget-object v0, La/exd;->U1:La/usd;

    .line 239
    .line 240
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-boolean v1, v0, La/kyd;->J:Z

    .line 245
    .line 246
    if-nez v1, :cond_3

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_3
    iget-object v1, v0, La/kyd;->p:Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;

    .line 250
    .line 251
    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_4

    .line 256
    .line 257
    iget-object v1, v0, La/kyd;->z:La/yo4;

    .line 258
    .line 259
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 260
    .line 261
    const-string v2, "resend"

    .line 262
    .line 263
    invoke-static {v7, v2, v1, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    iget-object v1, v0, La/kyd;->A:La/zr1;

    .line 267
    .line 268
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 269
    .line 270
    invoke-static {v2, v1, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 271
    .line 272
    .line 273
    :cond_4
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    new-instance v13, La/ejd;

    .line 278
    .line 279
    const/4 v1, 0x7

    .line 280
    invoke-direct {v13, v0, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 281
    .line 282
    .line 283
    new-instance v1, La/yxd;

    .line 284
    .line 285
    invoke-direct {v1, v0, v11, v10}, La/yxd;-><init>(La/kyd;La/yje;B)V

    .line 286
    .line 287
    .line 288
    const/16 v17, 0xe

    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const/4 v15, 0x0

    .line 292
    move-object/from16 v16, v1

    .line 293
    .line 294
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 295
    .line 296
    .line 297
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_6
    sget-object v0, La/exd;->U1:La/usd;

    .line 301
    .line 302
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v0}, La/kyd;->J()V

    .line 307
    .line 308
    .line 309
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_7
    sget-object v0, La/exd;->U1:La/usd;

    .line 313
    .line 314
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    iget-object v1, v0, La/kyd;->z:La/yo4;

    .line 319
    .line 320
    invoke-virtual {v1}, La/yo4;->i()V

    .line 321
    .line 322
    .line 323
    iget-object v0, v0, La/kyd;->A:La/zr1;

    .line 324
    .line 325
    iget-object v0, v0, La/zr1;->a:La/s1p;

    .line 326
    .line 327
    new-instance v1, La/j1p;

    .line 328
    .line 329
    const-string v5, "cancel"

    .line 330
    .line 331
    invoke-direct {v1, v5, v13}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 332
    .line 333
    .line 334
    new-instance v5, La/j1p;

    .line 335
    .line 336
    invoke-direct {v5, v2, v12}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 337
    .line 338
    .line 339
    new-array v2, v10, [La/k1p;

    .line 340
    .line 341
    aput-object v1, v2, v13

    .line 342
    .line 343
    aput-object v5, v2, v12

    .line 344
    .line 345
    invoke-static {v2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-virtual {v0, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v0}, La/kyd;->H()V

    .line 357
    .line 358
    .line 359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_8
    sget-object v0, La/exd;->U1:La/usd;

    .line 363
    .line 364
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v1, v0, La/kyd;->z:La/yo4;

    .line 369
    .line 370
    invoke-virtual {v1}, La/yo4;->h()V

    .line 371
    .line 372
    .line 373
    iget-object v0, v0, La/kyd;->A:La/zr1;

    .line 374
    .line 375
    iget-object v0, v0, La/zr1;->a:La/s1p;

    .line 376
    .line 377
    new-instance v1, La/j1p;

    .line 378
    .line 379
    const-string v5, "settings"

    .line 380
    .line 381
    invoke-direct {v1, v5, v13}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 382
    .line 383
    .line 384
    new-instance v5, La/j1p;

    .line 385
    .line 386
    invoke-direct {v5, v2, v12}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 387
    .line 388
    .line 389
    new-array v2, v10, [La/k1p;

    .line 390
    .line 391
    aput-object v1, v2, v13

    .line 392
    .line 393
    aput-object v5, v2, v12

    .line 394
    .line 395
    invoke-static {v2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v0, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 400
    .line 401
    .line 402
    iget-object v0, v14, La/exd;->R1:La/ywq;

    .line 403
    .line 404
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, La/ywq;->a(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-object v1

    .line 410
    :pswitch_9
    sget-object v0, La/exd;->U1:La/usd;

    .line 411
    .line 412
    iget-object v0, v14, La/exd;->P1:La/a8z;

    .line 413
    .line 414
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, La/xci;

    .line 419
    .line 420
    iget-object v0, v0, La/xci;->v:La/n5d0;

    .line 421
    .line 422
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, La/wci;

    .line 427
    .line 428
    return-object v0

    .line 429
    :pswitch_a
    sget-object v0, La/exd;->U1:La/usd;

    .line 430
    .line 431
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    instance-of v1, v0, La/af3;

    .line 443
    .line 444
    if-eqz v1, :cond_5

    .line 445
    .line 446
    check-cast v0, La/af3;

    .line 447
    .line 448
    goto :goto_2

    .line 449
    :cond_5
    move-object v0, v11

    .line 450
    :goto_2
    const-class v1, La/zwd;

    .line 451
    .line 452
    if-eqz v0, :cond_8

    .line 453
    .line 454
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, La/o5d0;

    .line 463
    .line 464
    if-eqz v0, :cond_6

    .line 465
    .line 466
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, La/ze3;

    .line 471
    .line 472
    goto :goto_3

    .line 473
    :cond_6
    move-object v0, v11

    .line 474
    :goto_3
    instance-of v2, v0, La/zwd;

    .line 475
    .line 476
    if-nez v2, :cond_7

    .line 477
    .line 478
    move-object v0, v11

    .line 479
    :cond_7
    check-cast v0, La/zwd;

    .line 480
    .line 481
    if-eqz v0, :cond_8

    .line 482
    .line 483
    invoke-static {v14}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 484
    .line 485
    .line 486
    move-result-object v20

    .line 487
    iget-object v1, v14, La/exd;->S1:La/khf0;

    .line 488
    .line 489
    sget-object v2, La/exd;->V1:[La/iiy;

    .line 490
    .line 491
    aget-object v2, v2, v12

    .line 492
    .line 493
    invoke-virtual {v1, v14, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    move-object/from16 v21, v1

    .line 498
    .line 499
    check-cast v21, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;

    .line 500
    .line 501
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object v1, v0, La/zwd;->a:La/qgd;

    .line 505
    .line 506
    iget-object v2, v0, La/zwd;->d:La/lp4;

    .line 507
    .line 508
    iget-object v3, v0, La/zwd;->b:La/duj;

    .line 509
    .line 510
    iget-object v4, v0, La/zwd;->c:La/ii;

    .line 511
    .line 512
    iget-object v5, v0, La/zwd;->g:La/lef0;

    .line 513
    .line 514
    iget-object v6, v0, La/zwd;->h:La/m1e;

    .line 515
    .line 516
    iget-object v7, v0, La/zwd;->i:La/wdk0;

    .line 517
    .line 518
    iget-object v8, v0, La/zwd;->j:La/ctf0;

    .line 519
    .line 520
    iget-object v9, v0, La/zwd;->k:La/iqt;

    .line 521
    .line 522
    iget-object v10, v0, La/zwd;->m:La/mne;

    .line 523
    .line 524
    iget-object v11, v0, La/zwd;->o:La/rou;

    .line 525
    .line 526
    iget-object v12, v0, La/zwd;->l:La/pru;

    .line 527
    .line 528
    iget-object v13, v0, La/zwd;->n:La/z4w0;

    .line 529
    .line 530
    iget-object v14, v0, La/zwd;->p:La/mi70;

    .line 531
    .line 532
    iget-object v15, v0, La/zwd;->q:La/zn00;

    .line 533
    .line 534
    move-object/from16 v31, v1

    .line 535
    .line 536
    iget-object v1, v0, La/zwd;->r:La/kt2;

    .line 537
    .line 538
    move-object/from16 v36, v1

    .line 539
    .line 540
    iget-object v1, v0, La/zwd;->e:La/hse0;

    .line 541
    .line 542
    move-object/from16 v25, v1

    .line 543
    .line 544
    iget-object v1, v0, La/zwd;->f:La/g2v;

    .line 545
    .line 546
    iget-object v0, v0, La/zwd;->s:La/d1p;

    .line 547
    .line 548
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-object/from16 v35, v15

    .line 573
    .line 574
    new-instance v15, La/xci;

    .line 575
    .line 576
    move-object/from16 v18, v0

    .line 577
    .line 578
    move-object/from16 v26, v1

    .line 579
    .line 580
    move-object/from16 v16, v2

    .line 581
    .line 582
    move-object/from16 v22, v3

    .line 583
    .line 584
    move-object/from16 v19, v4

    .line 585
    .line 586
    move-object/from16 v17, v5

    .line 587
    .line 588
    move-object/from16 v23, v6

    .line 589
    .line 590
    move-object/from16 v27, v7

    .line 591
    .line 592
    move-object/from16 v28, v8

    .line 593
    .line 594
    move-object/from16 v29, v9

    .line 595
    .line 596
    move-object/from16 v30, v10

    .line 597
    .line 598
    move-object/from16 v32, v11

    .line 599
    .line 600
    move-object/from16 v33, v12

    .line 601
    .line 602
    move-object/from16 v24, v13

    .line 603
    .line 604
    move-object/from16 v34, v14

    .line 605
    .line 606
    invoke-direct/range {v15 .. v36}, La/xci;-><init>(La/lp4;La/lef0;La/d1p;La/ii;La/i1w0;Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;La/duj;La/m1e;La/z4w0;La/hse0;La/g2v;La/wdk0;La/ctf0;La/iqt;La/mne;La/qgd;La/rou;La/pru;La/mi70;La/zn00;La/kt2;)V

    .line 607
    .line 608
    .line 609
    move-object v11, v15

    .line 610
    goto :goto_4

    .line 611
    :cond_8
    const-string v0, "Cannot create dependency "

    .line 612
    .line 613
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    :goto_4
    return-object v11

    .line 621
    :pswitch_b
    sget-object v0, La/exd;->U1:La/usd;

    .line 622
    .line 623
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-virtual {v0, v13}, La/kyd;->E(Z)V

    .line 628
    .line 629
    .line 630
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object v0

    .line 633
    :pswitch_c
    sget-object v0, La/exd;->U1:La/usd;

    .line 634
    .line 635
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-virtual {v0, v13}, La/kyd;->D(Z)V

    .line 640
    .line 641
    .line 642
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_d
    sget-object v0, La/exd;->U1:La/usd;

    .line 646
    .line 647
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-virtual {v0, v12}, La/kyd;->E(Z)V

    .line 652
    .line 653
    .line 654
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 655
    .line 656
    return-object v0

    .line 657
    :pswitch_e
    sget-object v0, La/exd;->U1:La/usd;

    .line 658
    .line 659
    invoke-virtual {v14}, La/exd;->I0()La/kyd;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v0}, La/kyd;->J()V

    .line 664
    .line 665
    .line 666
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 667
    .line 668
    return-object v0

    .line 669
    :pswitch_data_0
    .packed-switch 0x0
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
