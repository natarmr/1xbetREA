.class public final synthetic La/gj4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/fy4;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput-byte v0, p0, La/gj4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gj4;->c:Ljava/lang/Object;

    iput-object p2, p0, La/gj4;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/gj4;->a:B

    iput-object p1, p0, La/gj4;->b:Ljava/lang/Object;

    iput-object p2, p0, La/gj4;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gj4;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/qw9;

    .line 16
    .line 17
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/pw9;

    .line 20
    .line 21
    iget-object v1, v1, La/qw9;->c:Landroid/hardware/camera2/CameraManager;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroid/hardware/camera2/CameraManager;

    .line 32
    .line 33
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, La/xv9;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/hardware/camera2/CameraManager;->unregisterAvailabilityCallback(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, La/oi9;

    .line 46
    .line 47
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, La/pi9;

    .line 50
    .line 51
    iget-object v1, v1, La/oi9;->r:Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_2
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 62
    .line 63
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/fxf;

    .line 66
    .line 67
    iget-object v0, v0, La/fxf;->d:La/exf;

    .line 68
    .line 69
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_3
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/uwe;

    .line 78
    .line 79
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/pc9;

    .line 82
    .line 83
    new-instance v2, La/nc9;

    .line 84
    .line 85
    iget-wide v3, v0, La/pc9;->a:J

    .line 86
    .line 87
    invoke-direct {v2, v3, v4}, La/nc9;-><init>(J)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, La/uwe;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_4
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, La/uwe;

    .line 99
    .line 100
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, La/kc9;

    .line 103
    .line 104
    new-instance v2, La/mc9;

    .line 105
    .line 106
    iget-wide v3, v0, La/kc9;->a:J

    .line 107
    .line 108
    invoke-direct {v2, v3, v4}, La/mc9;-><init>(J)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v2}, La/uwe;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_5
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/a99;

    .line 120
    .line 121
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/y89;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, La/a99;->h(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    new-instance v0, La/ej8;

    .line 129
    .line 130
    invoke-direct {v0, v2}, La/ej8;-><init>(B)V

    .line 131
    .line 132
    .line 133
    iput-object v0, v1, La/a99;->c:Lkotlin/jvm/functions/Function0;

    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_6
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 141
    .line 142
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, La/s460;

    .line 145
    .line 146
    if-eqz v1, :cond_1

    .line 147
    .line 148
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, La/jge0;

    .line 153
    .line 154
    if-nez v1, :cond_0

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_0
    move-object v5, v1

    .line 158
    goto :goto_2

    .line 159
    :cond_1
    :goto_0
    invoke-virtual {v0}, La/s460;->g1()La/lm40;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    iget-boolean v1, v1, La/lm40;->n:Z

    .line 164
    .line 165
    if-eqz v1, :cond_2

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_2
    move-object v0, v5

    .line 169
    :goto_1
    if-eqz v0, :cond_3

    .line 170
    .line 171
    iget-wide v0, v0, La/pu90;->c:J

    .line 172
    .line 173
    invoke-static {v0, v1}, La/n2x;->Q(J)J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    const-wide/16 v2, 0x0

    .line 178
    .line 179
    invoke-static {v2, v3, v0, v1}, La/k9x;->r(JJ)La/jge0;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    :cond_3
    :goto_2
    return-object v5

    .line 184
    :pswitch_7
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Ljava/lang/String;

    .line 187
    .line 188
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, Ljava/lang/String;

    .line 191
    .line 192
    new-instance v2, La/cz8;

    .line 193
    .line 194
    invoke-direct {v2, v1, v0}, La/cz8;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-object v2

    .line 198
    :pswitch_8
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, La/rd8;

    .line 201
    .line 202
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, La/pz40;

    .line 205
    .line 206
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 211
    .line 212
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_9
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 221
    .line 222
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, La/xb8;

    .line 225
    .line 226
    new-instance v2, La/tb8;

    .line 227
    .line 228
    iget-object v0, v0, La/xb8;->a:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;

    .line 229
    .line 230
    invoke-direct {v2, v0}, La/tb8;-><init>(Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_a
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, La/h38;

    .line 242
    .line 243
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, La/pyq;

    .line 246
    .line 247
    sget-object v2, La/h38;->V1:La/yk5;

    .line 248
    .line 249
    invoke-static {v1}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 250
    .line 251
    .line 252
    iget-object v0, v0, La/pyq;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 253
    .line 254
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->clearFocus()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, La/h38;->H0()La/d48;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getCode()Ljava/lang/CharSequence;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iget-object v1, v6, La/d48;->B:La/p7m0;

    .line 270
    .line 271
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    check-cast v1, La/v38;

    .line 276
    .line 277
    iget-object v1, v1, La/v38;->b:Ljava/lang/String;

    .line 278
    .line 279
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-nez v2, :cond_7

    .line 284
    .line 285
    iget-object v2, v6, La/d48;->G:La/bby;

    .line 286
    .line 287
    if-eqz v2, :cond_4

    .line 288
    .line 289
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-ne v2, v3, :cond_4

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_4
    iget-object v2, v6, La/d48;->I:La/bby;

    .line 297
    .line 298
    if-eqz v2, :cond_5

    .line 299
    .line 300
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-ne v2, v3, :cond_5

    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_5
    iget-boolean v2, v6, La/d48;->J:Z

    .line 308
    .line 309
    if-nez v2, :cond_6

    .line 310
    .line 311
    iget-object v0, v6, La/d48;->C:La/ol60;

    .line 312
    .line 313
    sget-object v1, La/n38;->a:La/n38;

    .line 314
    .line 315
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_6
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    new-instance v3, La/ye7;

    .line 324
    .line 325
    const-class v7, La/d48;

    .line 326
    .line 327
    const-string v8, "localHandleError"

    .line 328
    .line 329
    const-string v9, "localHandleError(Ljava/lang/Throwable;)V"

    .line 330
    .line 331
    const/4 v10, 0x0

    .line 332
    const/16 v11, 0x12

    .line 333
    .line 334
    const/4 v5, 0x1

    .line 335
    move-object v4, v3

    .line 336
    invoke-direct/range {v4 .. v11}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 337
    .line 338
    .line 339
    iget-object v4, v6, La/d48;->d:La/mne;

    .line 340
    .line 341
    iget-object v10, v4, La/mne;->b:La/dvj;

    .line 342
    .line 343
    new-instance v4, La/xb2;

    .line 344
    .line 345
    const/4 v8, 0x0

    .line 346
    const/16 v9, 0x8

    .line 347
    .line 348
    move-object v7, v0

    .line 349
    move-object v5, v1

    .line 350
    invoke-direct/range {v4 .. v9}, La/xb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 351
    .line 352
    .line 353
    move-object v0, v6

    .line 354
    const/16 v7, 0xa

    .line 355
    .line 356
    move-object v6, v4

    .line 357
    const/4 v4, 0x0

    .line 358
    move-object v5, v10

    .line 359
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    iput-object v1, v0, La/d48;->I:La/bby;

    .line 364
    .line 365
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_b
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v1, La/de7;

    .line 371
    .line 372
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, La/ao6;

    .line 375
    .line 376
    iget-object v1, v1, La/de7;->c:Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 377
    .line 378
    if-eqz v1, :cond_8

    .line 379
    .line 380
    invoke-virtual {v0, v1}, La/ao6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_c
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v1, Landroid/app/Dialog;

    .line 389
    .line 390
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 393
    .line 394
    sget-object v2, La/hz6;->p2:La/cl5;

    .line 395
    .line 396
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 397
    .line 398
    .line 399
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_d
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, La/x6f;

    .line 408
    .line 409
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, La/cp;

    .line 412
    .line 413
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, La/gc6;

    .line 418
    .line 419
    iget-object v0, v0, La/gc6;->c:Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v1, v0}, La/x6f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_e
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v1, La/vne;

    .line 430
    .line 431
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v0, La/bxq0;

    .line 434
    .line 435
    new-instance v2, La/la6;

    .line 436
    .line 437
    invoke-direct {v2, v0, v5, v4}, La/la6;-><init>(La/bxq0;La/yje;B)V

    .line 438
    .line 439
    .line 440
    const/4 v0, 0x3

    .line 441
    invoke-static {v1, v5, v5, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 442
    .line 443
    .line 444
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_f
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v1, La/e9q0;

    .line 450
    .line 451
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, La/j83;

    .line 454
    .line 455
    if-eqz v1, :cond_c

    .line 456
    .line 457
    iget-object v2, v1, La/e9q0;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 458
    .line 459
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    iget-object v5, v1, La/e9q0;->b:La/j83;

    .line 464
    .line 465
    if-eqz v3, :cond_9

    .line 466
    .line 467
    goto :goto_5

    .line 468
    :cond_9
    new-instance v3, La/m2q0;

    .line 469
    .line 470
    invoke-direct {v3, v5}, La/m2q0;-><init>(La/j83;)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    :goto_4
    if-ge v4, v5, :cond_a

    .line 478
    .line 479
    invoke-virtual {v2, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 484
    .line 485
    invoke-interface {v6, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    add-int/lit8 v4, v4, 0x1

    .line 489
    .line 490
    goto :goto_4

    .line 491
    :cond_a
    iget-object v5, v3, La/m2q0;->b:La/j83;

    .line 492
    .line 493
    :goto_5
    iput-object v5, v1, La/e9q0;->b:La/j83;

    .line 494
    .line 495
    if-nez v5, :cond_b

    .line 496
    .line 497
    goto :goto_6

    .line 498
    :cond_b
    move-object v0, v5

    .line 499
    :cond_c
    :goto_6
    return-object v0

    .line 500
    :pswitch_10
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v1, La/a8q0;

    .line 503
    .line 504
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v0, La/pz40;

    .line 507
    .line 508
    iget-wide v2, v1, La/a8q0;->b:J

    .line 509
    .line 510
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    check-cast v4, La/a8q0;

    .line 515
    .line 516
    iget-wide v4, v4, La/a8q0;->b:J

    .line 517
    .line 518
    invoke-static {v2, v3, v4, v5}, La/o9q0;->b(JJ)Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-eqz v2, :cond_d

    .line 523
    .line 524
    iget-object v2, v1, La/a8q0;->c:La/o9q0;

    .line 525
    .line 526
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    check-cast v3, La/a8q0;

    .line 531
    .line 532
    iget-object v3, v3, La/a8q0;->c:La/o9q0;

    .line 533
    .line 534
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    if-nez v2, :cond_e

    .line 539
    .line 540
    :cond_d
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    return-object v0

    .line 546
    :pswitch_11
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v1, La/yw5;

    .line 549
    .line 550
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v0, La/ww5;

    .line 553
    .line 554
    iget-object v1, v1, La/yw5;->a:La/b4e;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object v2, v1, La/b4e;->d:Ljava/lang/Object;

    .line 560
    .line 561
    monitor-enter v2

    .line 562
    :try_start_0
    iget-object v3, v1, La/b4e;->f:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 565
    .line 566
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-eqz v0, :cond_f

    .line 571
    .line 572
    iget-object v0, v1, La/b4e;->f:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-eqz v0, :cond_f

    .line 581
    .line 582
    invoke-virtual {v1}, La/b4e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 583
    .line 584
    .line 585
    goto :goto_7

    .line 586
    :catchall_0
    move-exception v0

    .line 587
    goto :goto_8

    .line 588
    :cond_f
    :goto_7
    monitor-exit v2

    .line 589
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 590
    .line 591
    return-object v0

    .line 592
    :goto_8
    monitor-exit v2

    .line 593
    throw v0

    .line 594
    :pswitch_12
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v1, La/dk5;

    .line 597
    .line 598
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v0, Ljava/util/List;

    .line 601
    .line 602
    iget-object v4, v1, La/dk5;->s:La/h7k;

    .line 603
    .line 604
    new-instance v6, Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 611
    .line 612
    .line 613
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    if-eqz v2, :cond_1d

    .line 622
    .line 623
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast v2, La/vk5;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    instance-of v7, v2, La/tjz;

    .line 633
    .line 634
    if-eqz v7, :cond_16

    .line 635
    .line 636
    check-cast v2, La/tjz;

    .line 637
    .line 638
    instance-of v7, v2, La/sjz;

    .line 639
    .line 640
    if-eqz v7, :cond_10

    .line 641
    .line 642
    new-instance v7, La/ljz;

    .line 643
    .line 644
    check-cast v2, La/sjz;

    .line 645
    .line 646
    iget-boolean v2, v2, La/sjz;->f:Z

    .line 647
    .line 648
    xor-int/2addr v2, v3

    .line 649
    invoke-direct {v7, v2}, La/ljz;-><init>(Z)V

    .line 650
    .line 651
    .line 652
    goto/16 :goto_a

    .line 653
    .line 654
    :cond_10
    instance-of v7, v2, La/rjz;

    .line 655
    .line 656
    if-eqz v7, :cond_11

    .line 657
    .line 658
    sget-object v7, La/kjz;->a:La/kjz;

    .line 659
    .line 660
    goto/16 :goto_a

    .line 661
    .line 662
    :cond_11
    instance-of v7, v2, La/qjz;

    .line 663
    .line 664
    if-eqz v7, :cond_12

    .line 665
    .line 666
    sget-object v7, La/jjz;->a:La/jjz;

    .line 667
    .line 668
    goto/16 :goto_a

    .line 669
    .line 670
    :cond_12
    instance-of v7, v2, La/ojz;

    .line 671
    .line 672
    if-eqz v7, :cond_13

    .line 673
    .line 674
    sget-object v7, La/hjz;->a:La/hjz;

    .line 675
    .line 676
    goto :goto_a

    .line 677
    :cond_13
    instance-of v7, v2, La/pjz;

    .line 678
    .line 679
    if-eqz v7, :cond_14

    .line 680
    .line 681
    sget-object v7, La/ijz;->a:La/ijz;

    .line 682
    .line 683
    goto :goto_a

    .line 684
    :cond_14
    instance-of v2, v2, La/njz;

    .line 685
    .line 686
    if-eqz v2, :cond_15

    .line 687
    .line 688
    sget-object v7, La/gjz;->a:La/gjz;

    .line 689
    .line 690
    goto :goto_a

    .line 691
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 692
    .line 693
    .line 694
    goto/16 :goto_c

    .line 695
    .line 696
    :cond_16
    instance-of v7, v2, La/lfs0;

    .line 697
    .line 698
    if-eqz v7, :cond_17

    .line 699
    .line 700
    sget-object v7, La/kfs0;->a:La/kfs0;

    .line 701
    .line 702
    goto :goto_a

    .line 703
    :cond_17
    instance-of v7, v2, La/aes0;

    .line 704
    .line 705
    if-eqz v7, :cond_18

    .line 706
    .line 707
    check-cast v2, La/aes0;

    .line 708
    .line 709
    new-instance v7, La/zds0;

    .line 710
    .line 711
    iget-wide v8, v2, La/aes0;->b:J

    .line 712
    .line 713
    invoke-direct {v7, v8, v9}, La/zds0;-><init>(J)V

    .line 714
    .line 715
    .line 716
    goto :goto_a

    .line 717
    :cond_18
    instance-of v7, v2, La/ogs0;

    .line 718
    .line 719
    if-eqz v7, :cond_19

    .line 720
    .line 721
    check-cast v2, La/ogs0;

    .line 722
    .line 723
    iget-wide v8, v2, La/ogs0;->a:J

    .line 724
    .line 725
    iget-wide v10, v2, La/ogs0;->b:J

    .line 726
    .line 727
    iget-object v7, v2, La/ogs0;->g:Ljava/lang/String;

    .line 728
    .line 729
    iget-wide v13, v2, La/ogs0;->j:D

    .line 730
    .line 731
    iget-object v15, v2, La/ogs0;->f:Ljava/lang/String;

    .line 732
    .line 733
    iget v12, v2, La/ogs0;->i:I

    .line 734
    .line 735
    iget-object v3, v2, La/ogs0;->h:Ljava/lang/String;

    .line 736
    .line 737
    iget v2, v2, La/ogs0;->k:I

    .line 738
    .line 739
    move-object/from16 v17, v7

    .line 740
    .line 741
    new-instance v7, La/zfs0;

    .line 742
    .line 743
    move/from16 v18, v2

    .line 744
    .line 745
    move-object/from16 v16, v3

    .line 746
    .line 747
    invoke-direct/range {v7 .. v18}, La/zfs0;-><init>(JJIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 748
    .line 749
    .line 750
    goto :goto_a

    .line 751
    :cond_19
    instance-of v3, v2, La/ues0;

    .line 752
    .line 753
    if-eqz v3, :cond_1a

    .line 754
    .line 755
    sget-object v7, La/tes0;->a:La/tes0;

    .line 756
    .line 757
    goto :goto_a

    .line 758
    :cond_1a
    instance-of v3, v2, La/gxn;

    .line 759
    .line 760
    if-eqz v3, :cond_1b

    .line 761
    .line 762
    sget-object v7, La/fxn;->a:La/fxn;

    .line 763
    .line 764
    goto :goto_a

    .line 765
    :cond_1b
    instance-of v2, v2, La/tds0;

    .line 766
    .line 767
    if-eqz v2, :cond_1c

    .line 768
    .line 769
    sget-object v7, La/sds0;->a:La/sds0;

    .line 770
    .line 771
    :goto_a
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    const/4 v3, 0x1

    .line 775
    goto/16 :goto_9

    .line 776
    .line 777
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 778
    .line 779
    .line 780
    goto :goto_c

    .line 781
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    :cond_1e
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    if-eqz v3, :cond_1f

    .line 795
    .line 796
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    move-object v5, v3

    .line 801
    check-cast v5, La/w9h0;

    .line 802
    .line 803
    instance-of v6, v5, La/fxn;

    .line 804
    .line 805
    if-nez v6, :cond_1e

    .line 806
    .line 807
    instance-of v6, v5, La/tes0;

    .line 808
    .line 809
    if-nez v6, :cond_1e

    .line 810
    .line 811
    instance-of v5, v5, La/sds0;

    .line 812
    .line 813
    if-nez v5, :cond_1e

    .line 814
    .line 815
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    goto :goto_b

    .line 819
    :cond_1f
    invoke-virtual {v1}, La/dk5;->S()Z

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    iget-object v3, v1, La/dk5;->c:La/l4b;

    .line 824
    .line 825
    invoke-static {v3}, La/f1t0;->e0(La/l4b;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    new-instance v5, La/qes0;

    .line 830
    .line 831
    invoke-direct {v5, v4, v0, v2, v3}, La/qes0;-><init>(La/h7k;Ljava/util/ArrayList;ZLjava/lang/String;)V

    .line 832
    .line 833
    .line 834
    iput-object v5, v1, La/dk5;->P:La/qes0;

    .line 835
    .line 836
    :goto_c
    return-object v5

    .line 837
    :pswitch_13
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v1, La/gd5;

    .line 840
    .line 841
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, Landroid/view/View;

    .line 844
    .line 845
    invoke-virtual {v1, v0}, La/gd5;->d(Landroid/view/View;)V

    .line 846
    .line 847
    .line 848
    iput-object v5, v1, La/gd5;->c:La/gj4;

    .line 849
    .line 850
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 851
    .line 852
    return-object v0

    .line 853
    :pswitch_14
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v1, La/sc5;

    .line 856
    .line 857
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v0, La/g7z;

    .line 860
    .line 861
    iget-object v2, v1, La/sc5;->r:La/yjj0;

    .line 862
    .line 863
    iget-object v3, v0, La/g7z;->a:La/a6a;

    .line 864
    .line 865
    invoke-interface {v3}, La/fhl;->d()J

    .line 866
    .line 867
    .line 868
    move-result-wide v3

    .line 869
    invoke-virtual {v0}, La/g7z;->getLayoutDirection()La/k6z;

    .line 870
    .line 871
    .line 872
    move-result-object v5

    .line 873
    invoke-interface {v2, v3, v4, v5, v0}, La/yjj0;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    iput-object v0, v1, La/sc5;->w:La/x1x;

    .line 878
    .line 879
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 880
    .line 881
    return-object v0

    .line 882
    :pswitch_15
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v1, La/uhd;

    .line 885
    .line 886
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 889
    .line 890
    iput-object v0, v1, La/uhd;->c:Lkotlin/jvm/functions/Function0;

    .line 891
    .line 892
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 893
    .line 894
    return-object v0

    .line 895
    :pswitch_16
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v1, La/iqt;

    .line 898
    .line 899
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v0, La/pru;

    .line 902
    .line 903
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 904
    .line 905
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 914
    .line 915
    iget-object v0, v0, La/hl1;->a:La/f61;

    .line 916
    .line 917
    new-instance v2, La/s75;

    .line 918
    .line 919
    new-instance v5, La/m65;

    .line 920
    .line 921
    sget-object v8, La/iun;->a:La/iun;

    .line 922
    .line 923
    const/4 v9, 0x0

    .line 924
    sget-object v10, La/xun;->a:La/xun;

    .line 925
    .line 926
    const/4 v6, 0x0

    .line 927
    const/4 v7, 0x1

    .line 928
    invoke-direct/range {v5 .. v10}, La/m65;-><init>(ZZLjava/util/List;ZLjava/util/Set;)V

    .line 929
    .line 930
    .line 931
    invoke-direct {v2, v5, v0, v1, v4}, La/s75;-><init>(La/m65;La/f61;ZZ)V

    .line 932
    .line 933
    .line 934
    return-object v2

    .line 935
    :pswitch_17
    iget-object v1, v0, La/gj4;->c:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v1, La/fy4;

    .line 938
    .line 939
    iget-object v0, v0, La/gj4;->b:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 942
    .line 943
    iget-object v2, v1, La/fy4;->L:La/rpt;

    .line 944
    .line 945
    invoke-virtual {v2}, La/rpt;->g()La/cit0;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    iget-object v2, v2, La/cit0;->e:Ljava/util/List;

    .line 950
    .line 951
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    check-cast v2, La/m97;

    .line 956
    .line 957
    iget-object v1, v1, La/fy4;->K:La/loi0;

    .line 958
    .line 959
    invoke-virtual {v1, v2}, La/loi0;->a(La/m97;)V

    .line 960
    .line 961
    .line 962
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 966
    .line 967
    return-object v0

    .line 968
    :pswitch_18
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 971
    .line 972
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 973
    .line 974
    check-cast v0, La/q84;

    .line 975
    .line 976
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 980
    .line 981
    return-object v0

    .line 982
    :pswitch_19
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 985
    .line 986
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 987
    .line 988
    check-cast v0, La/ao4;

    .line 989
    .line 990
    new-instance v2, La/h74;

    .line 991
    .line 992
    iget-object v0, v0, La/ao4;->a:Ljava/lang/String;

    .line 993
    .line 994
    invoke-direct {v2, v0}, La/h74;-><init>(Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1001
    .line 1002
    return-object v0

    .line 1003
    :pswitch_1a
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1006
    .line 1007
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast v0, La/k3q;

    .line 1010
    .line 1011
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1015
    .line 1016
    return-object v0

    .line 1017
    :pswitch_1b
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v1, La/ctf0;

    .line 1020
    .line 1021
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 1022
    .line 1023
    move-object v5, v0

    .line 1024
    check-cast v5, La/g2v;

    .line 1025
    .line 1026
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    new-array v0, v4, [Ljava/lang/Object;

    .line 1030
    .line 1031
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1032
    .line 1033
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    const v2, 0x7f13019b

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    sget-object v6, La/pb10;->g:La/pb10;

    .line 1045
    .line 1046
    const/4 v11, 0x0

    .line 1047
    const/16 v12, 0x15e

    .line 1048
    .line 1049
    const/4 v7, 0x0

    .line 1050
    const/4 v8, 0x0

    .line 1051
    const v9, 0x7f130677

    .line 1052
    .line 1053
    .line 1054
    const v10, 0x7f131690

    .line 1055
    .line 1056
    .line 1057
    invoke-static/range {v5 .. v12}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v11

    .line 1061
    sget-object v14, La/iun;->a:La/iun;

    .line 1062
    .line 1063
    new-instance v6, La/zn4;

    .line 1064
    .line 1065
    const/4 v12, 0x0

    .line 1066
    const/4 v13, 0x0

    .line 1067
    const/4 v7, 0x0

    .line 1068
    const/4 v9, 0x1

    .line 1069
    const/4 v10, 0x0

    .line 1070
    move-object v8, v0

    .line 1071
    invoke-direct/range {v6 .. v14}, La/zn4;-><init>(ZLjava/lang/String;ZZLa/jkm;ZLa/bo4;Ljava/util/List;)V

    .line 1072
    .line 1073
    .line 1074
    return-object v6

    .line 1075
    :pswitch_1c
    iget-object v1, v0, La/gj4;->b:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1078
    .line 1079
    iget-object v0, v0, La/gj4;->c:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v0, La/si4;

    .line 1082
    .line 1083
    new-instance v2, La/ph4;

    .line 1084
    .line 1085
    iget v0, v0, La/si4;->b:I

    .line 1086
    .line 1087
    invoke-direct {v2, v0}, La/ph4;-><init>(I)V

    .line 1088
    .line 1089
    .line 1090
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1094
    .line 1095
    return-object v0

    .line 1096
    nop

    .line 1097
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
