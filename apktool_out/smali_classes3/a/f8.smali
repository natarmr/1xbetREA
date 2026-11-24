.class public final synthetic La/f8;
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
    iput-byte p7, p0, La/f8;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f8;->a:B

    .line 4
    .line 5
    sget-object v2, La/sm4;->a:La/sm4;

    .line 6
    .line 7
    const-wide/16 v3, 0xd0f

    .line 8
    .line 9
    const-string v5, "action"

    .line 10
    .line 11
    const-string v6, "authenticator_off_alert_click"

    .line 12
    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/fy4;

    .line 23
    .line 24
    iget-object v1, v0, La/fy4;->b0:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v10, v0

    .line 31
    check-cast v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 32
    .line 33
    iget-object v2, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 34
    .line 35
    iget-object v3, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->c:Ljava/math/BigDecimal;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget-object v4, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 42
    .line 43
    if-ne v2, v8, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 54
    .line 55
    invoke-virtual {v4, v8, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {v2, v10}, La/fy4;->w(Ljava/math/BigDecimal;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;)Ljava/math/BigDecimal;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    iget-object v3, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-lez v3, :cond_2

    .line 77
    .line 78
    move v14, v8

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move v14, v9

    .line 81
    :goto_1
    iget-object v3, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-gez v2, :cond_3

    .line 88
    .line 89
    move v15, v8

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    move v15, v9

    .line 92
    :goto_2
    const/16 v16, 0x0

    .line 93
    .line 94
    const/16 v17, 0x11e

    .line 95
    .line 96
    const/4 v12, 0x0

    .line 97
    const/4 v13, 0x0

    .line 98
    invoke-static/range {v10 .. v17}, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_0
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, La/fy4;

    .line 114
    .line 115
    iget-object v1, v0, La/fy4;->b0:La/p7m0;

    .line 116
    .line 117
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v10, v0

    .line 122
    check-cast v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 123
    .line 124
    iget-object v2, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 125
    .line 126
    iget-object v3, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->d:Ljava/math/BigDecimal;

    .line 127
    .line 128
    iget-object v4, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->c:Ljava/math/BigDecimal;

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-gez v5, :cond_5

    .line 135
    .line 136
    move-object v2, v3

    .line 137
    goto :goto_4

    .line 138
    :cond_5
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eq v5, v8, :cond_7

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/math/BigDecimal;->scale()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    sget-object v5, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 152
    .line 153
    invoke-virtual {v2, v8, v5}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_7
    :goto_3
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    :goto_4
    invoke-static {v2, v10}, La/fy4;->w(Ljava/math/BigDecimal;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;)Ljava/math/BigDecimal;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    iget-object v4, v10, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->e:Ljava/math/BigDecimal;

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-lez v4, :cond_8

    .line 183
    .line 184
    move v14, v8

    .line 185
    goto :goto_5

    .line 186
    :cond_8
    move v14, v9

    .line 187
    :goto_5
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-gez v2, :cond_9

    .line 192
    .line 193
    move v15, v8

    .line 194
    goto :goto_6

    .line 195
    :cond_9
    move v15, v9

    .line 196
    :goto_6
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v17, 0x11e

    .line 199
    .line 200
    const/4 v12, 0x0

    .line 201
    const/4 v13, 0x0

    .line 202
    invoke-static/range {v10 .. v17}, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_4

    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_1
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, La/fy4;

    .line 218
    .line 219
    iget-object v1, v0, La/fy4;->H:La/ih5;

    .line 220
    .line 221
    iget-object v2, v0, La/fy4;->A:La/ms2;

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    instance-of v2, v2, La/vq2;

    .line 227
    .line 228
    if-eqz v2, :cond_a

    .line 229
    .line 230
    sget-object v3, La/k7k;->q1:La/k7k;

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_a
    sget-object v3, La/k7k;->l1:La/k7k;

    .line 234
    .line 235
    :goto_7
    invoke-virtual {v1, v3}, La/ih5;->f(La/k7k;)V

    .line 236
    .line 237
    .line 238
    iget-object v1, v0, La/fy4;->I:La/l7k;

    .line 239
    .line 240
    if-eqz v2, :cond_b

    .line 241
    .line 242
    sget-object v2, La/y1p;->F1:La/y1p;

    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_b
    sget-object v2, La/y1p;->E1:La/y1p;

    .line 246
    .line 247
    :goto_8
    iget-object v2, v2, La/y1p;->a:Ljava/lang/String;

    .line 248
    .line 249
    iget-object v3, v0, La/fy4;->R:La/cmt;

    .line 250
    .line 251
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-virtual {v1, v2, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    new-instance v12, La/sx4;

    .line 263
    .line 264
    invoke-direct {v12, v0, v7}, La/sx4;-><init>(La/fy4;B)V

    .line 265
    .line 266
    .line 267
    iget-object v1, v0, La/fy4;->g:La/mne;

    .line 268
    .line 269
    iget-object v14, v1, La/mne;->a:La/rwj;

    .line 270
    .line 271
    new-instance v15, La/ac4;

    .line 272
    .line 273
    invoke-direct {v15, v0, v10}, La/ac4;-><init>(La/fy4;La/yje;)V

    .line 274
    .line 275
    .line 276
    const/16 v16, 0xa

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 280
    .line 281
    .line 282
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_2
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, La/fy4;

    .line 288
    .line 289
    invoke-virtual {v0}, La/fy4;->E()V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_3
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, La/ku4;

    .line 298
    .line 299
    invoke-virtual {v0, v9}, La/ku4;->A(Z)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_4
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, La/ku4;

    .line 308
    .line 309
    invoke-virtual {v0}, La/ku4;->D()V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_5
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, La/ku4;

    .line 318
    .line 319
    iget-object v1, v0, La/ku4;->y:La/p7m0;

    .line 320
    .line 321
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1, v10, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v8}, La/ku4;->A(Z)V

    .line 330
    .line 331
    .line 332
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_6
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, La/ku4;

    .line 338
    .line 339
    invoke-virtual {v0}, La/ku4;->w()V

    .line 340
    .line 341
    .line 342
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_7
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, La/zr4;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    sget-object v2, La/yr4;->a:La/yr4;

    .line 357
    .line 358
    new-instance v5, La/qv3;

    .line 359
    .line 360
    invoke-direct {v5, v0, v10, v7}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 361
    .line 362
    .line 363
    const/16 v6, 0xe

    .line 364
    .line 365
    const/4 v3, 0x0

    .line 366
    const/4 v4, 0x0

    .line 367
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_8
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, La/hl60;

    .line 376
    .line 377
    invoke-virtual {v0}, La/hl60;->A()V

    .line 378
    .line 379
    .line 380
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object v0

    .line 383
    :pswitch_9
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, La/cq4;

    .line 386
    .line 387
    iget-object v1, v0, La/cq4;->d:La/ol60;

    .line 388
    .line 389
    new-instance v2, La/xp4;

    .line 390
    .line 391
    iget-object v0, v0, La/cq4;->c:La/zj2;

    .line 392
    .line 393
    invoke-virtual {v0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    check-cast v3, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 398
    .line 399
    iget-object v3, v3, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->a:La/c860;

    .line 400
    .line 401
    invoke-virtual {v0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 406
    .line 407
    iget-object v0, v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->b:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 408
    .line 409
    invoke-direct {v2, v3, v0}, La/xp4;-><init>(La/c860;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    return-object v0

    .line 418
    :pswitch_a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, La/cq4;

    .line 421
    .line 422
    iget-object v1, v0, La/cq4;->c:La/zj2;

    .line 423
    .line 424
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1}, La/zj2;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    check-cast v2, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 432
    .line 433
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    sget-object v3, La/c860;->b:La/c860;

    .line 437
    .line 438
    iget-object v8, v2, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->b:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 439
    .line 440
    sget-object v9, La/q760;->b:La/q760;

    .line 441
    .line 442
    const-wide/16 v11, 0x0

    .line 443
    .line 444
    const/4 v13, 0x2

    .line 445
    const/4 v10, 0x0

    .line 446
    invoke-static/range {v8 .. v13}, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->a(Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;La/q760;Ljava/lang/String;JI)Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-static {v2, v3, v4, v7}, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->a(Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;La/c860;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;I)Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {v1, v2}, La/zj2;->f(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    iget-object v1, v0, La/cq4;->d:La/ol60;

    .line 458
    .line 459
    new-instance v2, La/xp4;

    .line 460
    .line 461
    iget-object v0, v0, La/cq4;->c:La/zj2;

    .line 462
    .line 463
    invoke-virtual {v0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    check-cast v3, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 468
    .line 469
    iget-object v3, v3, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->a:La/c860;

    .line 470
    .line 471
    invoke-virtual {v0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;

    .line 476
    .line 477
    iget-object v0, v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->b:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 478
    .line 479
    invoke-direct {v2, v3, v0}, La/xp4;-><init>(La/c860;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    :pswitch_b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v0, La/qp4;

    .line 491
    .line 492
    sget-object v1, La/qp4;->R1:La/hfk0;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    sget-object v1, La/cr4;->n2:La/pek0;

    .line 498
    .line 499
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    sget-object v1, La/cr4;->p2:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    if-nez v2, :cond_c

    .line 516
    .line 517
    new-instance v2, La/cr4;

    .line 518
    .line 519
    invoke-direct {v2}, La/cr4;-><init>()V

    .line 520
    .line 521
    .line 522
    sget-object v3, La/cr4;->o2:[La/iiy;

    .line 523
    .line 524
    aget-object v3, v3, v9

    .line 525
    .line 526
    iget-object v4, v2, La/cr4;->k2:La/phf0;

    .line 527
    .line 528
    const-string v5, "KEY_OPTIONS_TYPE"

    .line 529
    .line 530
    invoke-virtual {v4, v2, v3, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, La/ku4;

    .line 542
    .line 543
    iget-object v1, v0, La/ku4;->p:La/yo4;

    .line 544
    .line 545
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 546
    .line 547
    const-string v2, "cancel"

    .line 548
    .line 549
    invoke-static {v5, v2, v1, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    iget-object v0, v0, La/ku4;->u:La/zr1;

    .line 553
    .line 554
    iget-object v0, v0, La/zr1;->a:La/s1p;

    .line 555
    .line 556
    invoke-static {v2, v0, v3, v4}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 557
    .line 558
    .line 559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_d
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, La/ku4;

    .line 565
    .line 566
    iget-object v1, v0, La/ku4;->p:La/yo4;

    .line 567
    .line 568
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 569
    .line 570
    const-string v2, "off"

    .line 571
    .line 572
    invoke-static {v5, v2, v1, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    iget-object v1, v0, La/ku4;->u:La/zr1;

    .line 576
    .line 577
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 578
    .line 579
    invoke-static {v2, v1, v3, v4}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 580
    .line 581
    .line 582
    iget-object v1, v0, La/ku4;->q:La/i1w0;

    .line 583
    .line 584
    const-string v2, "authenticatorChangedResultKey"

    .line 585
    .line 586
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 587
    .line 588
    invoke-virtual {v1, v3, v2}, La/i1w0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 592
    .line 593
    .line 594
    move-result-object v11

    .line 595
    new-instance v12, La/it4;

    .line 596
    .line 597
    const/4 v1, 0x2

    .line 598
    invoke-direct {v12, v0, v1}, La/it4;-><init>(La/ku4;B)V

    .line 599
    .line 600
    .line 601
    new-instance v13, La/lt4;

    .line 602
    .line 603
    invoke-direct {v13, v0, v8}, La/lt4;-><init>(La/ku4;B)V

    .line 604
    .line 605
    .line 606
    new-instance v15, La/au4;

    .line 607
    .line 608
    invoke-direct {v15, v0, v10, v9}, La/au4;-><init>(La/ku4;La/yje;B)V

    .line 609
    .line 610
    .line 611
    const/16 v16, 0xc

    .line 612
    .line 613
    const/4 v14, 0x0

    .line 614
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 615
    .line 616
    .line 617
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_e
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v0, La/im4;

    .line 623
    .line 624
    invoke-virtual {v0, v2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 628
    .line 629
    return-object v0

    .line 630
    :pswitch_f
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, La/im4;

    .line 633
    .line 634
    invoke-virtual {v0, v2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 638
    .line 639
    return-object v0

    .line 640
    :pswitch_10
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 643
    .line 644
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_11
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 653
    .line 654
    sget v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 655
    .line 656
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 657
    .line 658
    .line 659
    move-result v1

    .line 660
    if-nez v1, :cond_12

    .line 661
    .line 662
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 663
    .line 664
    .line 665
    move-result v1

    .line 666
    if-nez v1, :cond_12

    .line 667
    .line 668
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    if-eqz v1, :cond_d

    .line 673
    .line 674
    goto :goto_c

    .line 675
    :cond_d
    iget-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 676
    .line 677
    if-eqz v1, :cond_e

    .line 678
    .line 679
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->H(La/ndk0;)La/ndk0;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    goto :goto_9

    .line 684
    :cond_e
    move-object v1, v10

    .line 685
    :goto_9
    iput-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 686
    .line 687
    iget-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 688
    .line 689
    if-eqz v1, :cond_f

    .line 690
    .line 691
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->H(La/ndk0;)La/ndk0;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    goto :goto_a

    .line 696
    :cond_f
    move-object v1, v10

    .line 697
    :goto_a
    iput-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 698
    .line 699
    iget-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 700
    .line 701
    if-eqz v1, :cond_10

    .line 702
    .line 703
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->H(La/ndk0;)La/ndk0;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    goto :goto_b

    .line 708
    :cond_10
    move-object v1, v10

    .line 709
    :goto_b
    iput-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 710
    .line 711
    iget-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 712
    .line 713
    if-eqz v1, :cond_11

    .line 714
    .line 715
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->H(La/ndk0;)La/ndk0;

    .line 716
    .line 717
    .line 718
    move-result-object v10

    .line 719
    :cond_11
    iput-object v10, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 720
    .line 721
    :cond_12
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    return-object v0

    .line 724
    :pswitch_12
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v0, La/lc3;

    .line 727
    .line 728
    invoke-interface {v0}, La/lc3;->f()V

    .line 729
    .line 730
    .line 731
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 732
    .line 733
    return-object v0

    .line 734
    :pswitch_13
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v0, La/lc3;

    .line 737
    .line 738
    invoke-interface {v0}, La/lc3;->a()V

    .line 739
    .line 740
    .line 741
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    return-object v0

    .line 744
    :pswitch_14
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v0, Landroid/view/View;

    .line 747
    .line 748
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 749
    .line 750
    const/16 v2, 0x1e

    .line 751
    .line 752
    if-lt v1, v2, :cond_13

    .line 753
    .line 754
    invoke-static {v0}, La/e7;->m(Landroid/view/View;)V

    .line 755
    .line 756
    .line 757
    :cond_13
    const/16 v2, 0x1d

    .line 758
    .line 759
    if-lt v1, v2, :cond_15

    .line 760
    .line 761
    invoke-static {v0}, La/sf3;->g(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    if-nez v1, :cond_14

    .line 766
    .line 767
    goto :goto_d

    .line 768
    :cond_14
    new-instance v10, La/chf0;

    .line 769
    .line 770
    const/16 v2, 0x16

    .line 771
    .line 772
    invoke-direct {v10, v1, v0, v2}, La/chf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 773
    .line 774
    .line 775
    :cond_15
    :goto_d
    return-object v10

    .line 776
    :pswitch_15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, La/v51;

    .line 779
    .line 780
    sget-object v1, La/v51;->a2:La/qek0;

    .line 781
    .line 782
    invoke-virtual {v0}, La/v51;->H0()La/b61;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    iget-object v1, v1, La/b61;->f:La/s91;

    .line 787
    .line 788
    iget-object v1, v1, La/s91;->e:La/p7m0;

    .line 789
    .line 790
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    check-cast v1, La/lr1;

    .line 795
    .line 796
    sget-object v2, La/ir1;->c:La/ir1;

    .line 797
    .line 798
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-eqz v2, :cond_17

    .line 803
    .line 804
    :cond_16
    move v8, v9

    .line 805
    goto :goto_f

    .line 806
    :cond_17
    iget-object v2, v0, La/v51;->O1:La/ehf0;

    .line 807
    .line 808
    if-eqz v2, :cond_1a

    .line 809
    .line 810
    iget-object v1, v1, La/lr1;->b:La/tm1;

    .line 811
    .line 812
    new-instance v11, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 813
    .line 814
    const/16 v23, 0x0

    .line 815
    .line 816
    const/16 v24, 0x1ff

    .line 817
    .line 818
    const/4 v12, 0x0

    .line 819
    const/4 v13, 0x0

    .line 820
    const-wide/16 v14, 0x0

    .line 821
    .line 822
    const/16 v16, 0x0

    .line 823
    .line 824
    const/16 v17, 0x0

    .line 825
    .line 826
    const-wide/16 v18, 0x0

    .line 827
    .line 828
    const-wide/16 v20, 0x0

    .line 829
    .line 830
    const/16 v22, 0x0

    .line 831
    .line 832
    invoke-direct/range {v11 .. v24}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v1, v11, v8}, La/ehf0;->w(La/tm1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v2}, Landroidx/fragment/app/e;->S()La/m1r;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    invoke-interface {v1, v2}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    if-eqz v1, :cond_18

    .line 855
    .line 856
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    goto :goto_e

    .line 861
    :cond_18
    move-object v1, v10

    .line 862
    :goto_e
    if-eqz v1, :cond_16

    .line 863
    .line 864
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    const v2, 0x7f0a060f

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    if-eqz v0, :cond_19

    .line 876
    .line 877
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    move-result-object v10

    .line 881
    :cond_19
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    if-eqz v0, :cond_16

    .line 886
    .line 887
    :goto_f
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    return-object v0

    .line 892
    :cond_1a
    const-string v0, "aggregatorScreenUtils"

    .line 893
    .line 894
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    throw v10

    .line 898
    :pswitch_16
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v0, La/q21;

    .line 901
    .line 902
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    return-object v0

    .line 907
    :pswitch_17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast v0, La/f20;

    .line 910
    .line 911
    invoke-virtual {v0}, La/f20;->A()V

    .line 912
    .line 913
    .line 914
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 915
    .line 916
    return-object v0

    .line 917
    :pswitch_18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, La/f20;

    .line 920
    .line 921
    invoke-virtual {v0}, La/f20;->z()V

    .line 922
    .line 923
    .line 924
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 925
    .line 926
    return-object v0

    .line 927
    :pswitch_19
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v0, La/ab;

    .line 930
    .line 931
    invoke-virtual {v0}, La/ab;->D()V

    .line 932
    .line 933
    .line 934
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 935
    .line 936
    return-object v0

    .line 937
    :pswitch_1a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v0, La/ab;

    .line 940
    .line 941
    invoke-virtual {v0}, La/ab;->D()V

    .line 942
    .line 943
    .line 944
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 945
    .line 946
    return-object v0

    .line 947
    :pswitch_1b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v0, La/ab;

    .line 950
    .line 951
    invoke-virtual {v0}, La/ab;->D()V

    .line 952
    .line 953
    .line 954
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 955
    .line 956
    return-object v0

    .line 957
    :pswitch_1c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v0, La/ab;

    .line 960
    .line 961
    invoke-virtual {v0}, La/ab;->D()V

    .line 962
    .line 963
    .line 964
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 965
    .line 966
    return-object v0

    .line 967
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
