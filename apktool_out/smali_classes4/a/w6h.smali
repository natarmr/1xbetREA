.class public final synthetic La/w6h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z6h;

.field public final synthetic c:La/k3t0;


# direct methods
.method public synthetic constructor <init>(La/z6h;La/k3t0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w6h;->a:B

    iput-object p1, p0, La/w6h;->b:La/z6h;

    iput-object p2, p0, La/w6h;->c:La/k3t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w6h;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/w6h;->b:La/z6h;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/f7h;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, La/z6h;->d:La/ii;

    .line 18
    .line 19
    iget-object v4, v2, La/z6h;->c:La/vq;

    .line 20
    .line 21
    iget-object v5, v2, La/z6h;->a:Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    instance-of v6, v1, La/kmd0;

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    iget-object v2, v2, La/z6h;->b:La/e720;

    .line 28
    .line 29
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast v1, La/kmd0;

    .line 37
    .line 38
    iget-object v4, v1, La/kmd0;->b:La/m97;

    .line 39
    .line 40
    iget-object v5, v1, La/kmd0;->a:La/m0k0;

    .line 41
    .line 42
    iget-object v1, v1, La/kmd0;->c:La/ms2;

    .line 43
    .line 44
    invoke-virtual {v2, v3, v4, v5, v1}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    instance-of v6, v1, La/qve;

    .line 50
    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    check-cast v1, La/qve;

    .line 54
    .line 55
    iget-object v6, v1, La/qve;->a:La/aud;

    .line 56
    .line 57
    iget-object v10, v1, La/qve;->b:La/ctc;

    .line 58
    .line 59
    iget-object v12, v1, La/qve;->c:La/ms2;

    .line 60
    .line 61
    iget-wide v13, v1, La/qve;->d:J

    .line 62
    .line 63
    iget-object v15, v1, La/qve;->e:Ljava/lang/String;

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v11, 0x1

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    invoke-virtual/range {v4 .. v15}, La/vq;->a(Landroidx/fragment/app/Fragment;La/aud;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ctc;ZLa/ms2;JLjava/lang/String;)La/yq;

    .line 70
    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_1
    instance-of v6, v1, La/pve;

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    invoke-virtual {v4, v5, v7, v7}, La/vq;->b(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)La/xq;

    .line 80
    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_2
    sget-object v4, La/e430;->a:La/e430;

    .line 85
    .line 86
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, La/wsz;->i(Landroidx/fragment/app/e;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :cond_3
    instance-of v4, v1, La/wve;

    .line 105
    .line 106
    if-eqz v4, :cond_4

    .line 107
    .line 108
    check-cast v1, La/wve;

    .line 109
    .line 110
    iget-object v1, v1, La/wve;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, La/z6h;->c(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_4
    sget-object v4, La/pmd0;->a:La/pmd0;

    .line 118
    .line 119
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_5

    .line 124
    .line 125
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_5
    sget-object v4, La/hmd0;->a:La/hmd0;

    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_6

    .line 141
    .line 142
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_3

    .line 150
    .line 151
    :cond_6
    instance-of v4, v1, La/nmd0;

    .line 152
    .line 153
    const/4 v6, 0x0

    .line 154
    if-eqz v4, :cond_b

    .line 155
    .line 156
    check-cast v1, La/nmd0;

    .line 157
    .line 158
    iget-object v3, v1, La/nmd0;->a:La/zh7;

    .line 159
    .line 160
    iget-object v4, v1, La/nmd0;->g:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-lez v8, :cond_7

    .line 167
    .line 168
    const/4 v8, 0x1

    .line 169
    goto :goto_0

    .line 170
    :cond_7
    move v8, v6

    .line 171
    :goto_0
    iget-object v2, v2, La/z6h;->h:La/lgn0;

    .line 172
    .line 173
    new-instance v9, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 174
    .line 175
    const v10, 0x7f13025d

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-direct {v9, v10, v7, v7, v7}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-object v7, v3, La/zh7;->f:La/q4f;

    .line 189
    .line 190
    invoke-static {v7}, La/lgb;->V(La/q4f;)I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    invoke-virtual {v5, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    iget-object v12, v3, La/zh7;->b:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 205
    .line 206
    if-eqz v8, :cond_8

    .line 207
    .line 208
    const v13, 0x7f130cdc

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_8
    const v13, 0x7f130494

    .line 213
    .line 214
    .line 215
    :goto_1
    invoke-virtual {v5, v13}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v14, v3, La/zh7;->d:Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct {v10, v13, v14}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    if-eqz v8, :cond_9

    .line 231
    .line 232
    new-instance v8, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 233
    .line 234
    const v10, 0x7f130ed9

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-direct {v8, v10, v4}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v7, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    :cond_9
    new-instance v13, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 251
    .line 252
    const v4, 0x7f130270

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v15

    .line 259
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    sget-object v4, La/pn40;->a:La/pn40;

    .line 263
    .line 264
    iget-wide v3, v3, La/zh7;->e:D

    .line 265
    .line 266
    sget-object v8, La/p3u0;->c:La/p3u0;

    .line 267
    .line 268
    invoke-static {v3, v4, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v16

    .line 272
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    const v4, 0x7f040b72

    .line 277
    .line 278
    .line 279
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 280
    .line 281
    .line 282
    move-result v14

    .line 283
    iget-object v3, v1, La/nmd0;->b:Ljava/lang/String;

    .line 284
    .line 285
    const/16 v18, 0x1

    .line 286
    .line 287
    move-object/from16 v17, v3

    .line 288
    .line 289
    invoke-direct/range {v13 .. v18}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    iget-boolean v3, v1, La/nmd0;->f:Z

    .line 296
    .line 297
    if-nez v3, :cond_a

    .line 298
    .line 299
    new-instance v13, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 300
    .line 301
    iget v3, v1, La/nmd0;->c:I

    .line 302
    .line 303
    invoke-virtual {v5, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    const-string v4, ":"

    .line 311
    .line 312
    const-string v10, ""

    .line 313
    .line 314
    invoke-static {v3, v4, v10, v6}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    iget-wide v3, v1, La/nmd0;->d:D

    .line 319
    .line 320
    invoke-static {v3, v4, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v16

    .line 324
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    const v4, 0x7f040aeb

    .line 329
    .line 330
    .line 331
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 332
    .line 333
    .line 334
    move-result v14

    .line 335
    iget-object v3, v1, La/nmd0;->b:Ljava/lang/String;

    .line 336
    .line 337
    const/16 v18, 0x0

    .line 338
    .line 339
    move-object/from16 v17, v3

    .line 340
    .line 341
    invoke-direct/range {v13 .. v18}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v7, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    :cond_a
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 348
    .line 349
    .line 350
    move-result-object v16

    .line 351
    iget-wide v3, v1, La/nmd0;->e:J

    .line 352
    .line 353
    sget-object v1, La/hg7;->a:La/hg7;

    .line 354
    .line 355
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 356
    .line 357
    const-string v13, "REQUEST_SUCCESS_BET_KEY"

    .line 358
    .line 359
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 360
    .line 361
    .line 362
    move-result-object v14

    .line 363
    const-string v15, "SIMPLE"

    .line 364
    .line 365
    invoke-direct/range {v10 .. v16}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v9, v10, v5}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_3

    .line 372
    .line 373
    :cond_b
    instance-of v4, v1, La/jmd0;

    .line 374
    .line 375
    const v8, 0x7f1307bb

    .line 376
    .line 377
    .line 378
    const v9, 0x7f13032f

    .line 379
    .line 380
    .line 381
    if-eqz v4, :cond_c

    .line 382
    .line 383
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 384
    .line 385
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v11

    .line 389
    check-cast v1, La/jmd0;

    .line 390
    .line 391
    iget-object v12, v1, La/jmd0;->a:Ljava/lang/String;

    .line 392
    .line 393
    const v1, 0x7f130e5d

    .line 394
    .line 395
    .line 396
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v13

    .line 400
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v14

    .line 407
    sget-object v19, La/n12;->b:La/n12;

    .line 408
    .line 409
    const/16 v20, 0x0

    .line 410
    .line 411
    const/16 v21, 0x5d0

    .line 412
    .line 413
    const/4 v15, 0x0

    .line 414
    const-string v16, "REQUEST_CODE_BET_EXIST_ERROR_BS"

    .line 415
    .line 416
    const/16 v17, 0x0

    .line 417
    .line 418
    const/16 v18, 0x0

    .line 419
    .line 420
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 421
    .line 422
    .line 423
    :goto_2
    invoke-static {v5, v3, v10}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_3

    .line 427
    .line 428
    :cond_c
    instance-of v4, v1, La/lmd0;

    .line 429
    .line 430
    if-eqz v4, :cond_d

    .line 431
    .line 432
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 433
    .line 434
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v11

    .line 438
    check-cast v1, La/lmd0;

    .line 439
    .line 440
    iget-object v12, v1, La/lmd0;->a:Ljava/lang/String;

    .line 441
    .line 442
    const v1, 0x7f13115a

    .line 443
    .line 444
    .line 445
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v13

    .line 449
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v14

    .line 456
    sget-object v19, La/n12;->b:La/n12;

    .line 457
    .line 458
    const/16 v20, 0x0

    .line 459
    .line 460
    const/16 v21, 0x5d0

    .line 461
    .line 462
    const/4 v15, 0x0

    .line 463
    const-string v16, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR_BS"

    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    const/16 v18, 0x0

    .line 468
    .line 469
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 470
    .line 471
    .line 472
    goto :goto_2

    .line 473
    :cond_d
    sget-object v4, La/mmd0;->a:La/mmd0;

    .line 474
    .line 475
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    if-eqz v4, :cond_e

    .line 480
    .line 481
    const v1, 0x7f131095

    .line 482
    .line 483
    .line 484
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2, v1}, La/z6h;->c(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_3

    .line 495
    .line 496
    :cond_e
    instance-of v4, v1, La/omd0;

    .line 497
    .line 498
    if-eqz v4, :cond_f

    .line 499
    .line 500
    check-cast v1, La/omd0;

    .line 501
    .line 502
    iget-object v1, v1, La/omd0;->a:Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {v2, v1}, La/z6h;->c(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    goto/16 :goto_3

    .line 508
    .line 509
    :cond_f
    instance-of v4, v1, La/imd0;

    .line 510
    .line 511
    if-eqz v4, :cond_10

    .line 512
    .line 513
    iget-object v2, v2, La/z6h;->f:La/v88;

    .line 514
    .line 515
    invoke-static {v5}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    check-cast v1, La/imd0;

    .line 520
    .line 521
    iget-wide v4, v1, La/imd0;->a:J

    .line 522
    .line 523
    const/4 v1, 0x2

    .line 524
    invoke-static {v2, v3, v4, v5, v1}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_3

    .line 528
    .line 529
    :cond_10
    instance-of v4, v1, La/sve;

    .line 530
    .line 531
    const v8, 0x7f130162

    .line 532
    .line 533
    .line 534
    if-eqz v4, :cond_11

    .line 535
    .line 536
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    const v3, 0x7f130535

    .line 544
    .line 545
    .line 546
    invoke-virtual {v5, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2, v1, v3}, La/z6h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_3

    .line 557
    .line 558
    :cond_11
    instance-of v4, v1, La/vve;

    .line 559
    .line 560
    if-eqz v4, :cond_12

    .line 561
    .line 562
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 563
    .line 564
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v11

    .line 568
    const v1, 0x7f1306ba

    .line 569
    .line 570
    .line 571
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v12

    .line 575
    const v1, 0x7f130e5c

    .line 576
    .line 577
    .line 578
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v13

    .line 582
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v5, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v14

    .line 589
    sget-object v19, La/n12;->b:La/n12;

    .line 590
    .line 591
    const/16 v20, 0x0

    .line 592
    .line 593
    const/16 v21, 0x5d0

    .line 594
    .line 595
    const/4 v15, 0x0

    .line 596
    const-string v16, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT_BS"

    .line 597
    .line 598
    const/16 v17, 0x0

    .line 599
    .line 600
    const/16 v18, 0x0

    .line 601
    .line 602
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_2

    .line 606
    .line 607
    :cond_12
    instance-of v4, v1, La/uve;

    .line 608
    .line 609
    if-eqz v4, :cond_13

    .line 610
    .line 611
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    const v3, 0x7f13052d

    .line 619
    .line 620
    .line 621
    invoke-virtual {v5, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v1, v3}, La/z6h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    goto :goto_3

    .line 632
    :cond_13
    instance-of v4, v1, La/tve;

    .line 633
    .line 634
    if-eqz v4, :cond_14

    .line 635
    .line 636
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 637
    .line 638
    invoke-virtual {v5, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v10

    .line 642
    check-cast v1, La/tve;

    .line 643
    .line 644
    iget-object v2, v1, La/tve;->a:Ljava/lang/String;

    .line 645
    .line 646
    iget v1, v1, La/tve;->b:I

    .line 647
    .line 648
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    const v2, 0x7f130543

    .line 657
    .line 658
    .line 659
    invoke-virtual {v5, v2, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v11

    .line 663
    const v1, 0x7f131843

    .line 664
    .line 665
    .line 666
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v12

    .line 670
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    const v1, 0x7f130e07

    .line 674
    .line 675
    .line 676
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v13

    .line 680
    sget-object v18, La/n12;->b:La/n12;

    .line 681
    .line 682
    const/16 v19, 0x0

    .line 683
    .line 684
    const/16 v20, 0x5d0

    .line 685
    .line 686
    const/4 v14, 0x0

    .line 687
    const-string v15, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG_BS"

    .line 688
    .line 689
    const/16 v16, 0x0

    .line 690
    .line 691
    const/16 v17, 0x0

    .line 692
    .line 693
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 694
    .line 695
    .line 696
    invoke-static {v5, v3, v9}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 697
    .line 698
    .line 699
    goto :goto_3

    .line 700
    :cond_14
    sget-object v3, La/rve;->a:La/rve;

    .line 701
    .line 702
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    if-eqz v1, :cond_15

    .line 707
    .line 708
    iget-object v1, v2, La/z6h;->e:La/ouu;

    .line 709
    .line 710
    new-instance v7, La/za50;

    .line 711
    .line 712
    const-wide/16 v12, 0x0

    .line 713
    .line 714
    const/4 v9, 0x7

    .line 715
    const/4 v8, 0x0

    .line 716
    const-wide/16 v10, 0x0

    .line 717
    .line 718
    invoke-direct/range {v7 .. v13}, La/za50;-><init>(IIJJ)V

    .line 719
    .line 720
    .line 721
    iget-object v1, v1, La/ouu;->b:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v1, La/qe50;

    .line 724
    .line 725
    invoke-virtual {v1, v7, v6}, La/qe50;->a(La/cb50;Z)V

    .line 726
    .line 727
    .line 728
    :goto_3
    sget-object v1, La/a6h;->a:La/a6h;

    .line 729
    .line 730
    iget-object v0, v0, La/w6h;->c:La/k3t0;

    .line 731
    .line 732
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    goto :goto_4

    .line 738
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 739
    .line 740
    .line 741
    :goto_4
    return-object v7

    .line 742
    :pswitch_0
    move-object/from16 v1, p1

    .line 743
    .line 744
    check-cast v1, La/lwk;

    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    new-instance v3, La/x6f;

    .line 750
    .line 751
    const/4 v9, 0x0

    .line 752
    const/16 v10, 0x1d

    .line 753
    .line 754
    const/4 v4, 0x1

    .line 755
    iget-object v5, v0, La/w6h;->c:La/k3t0;

    .line 756
    .line 757
    const-class v6, La/k3t0;

    .line 758
    .line 759
    const-string v7, "onAction"

    .line 760
    .line 761
    const-string v8, "onAction(Ljava/lang/Object;)V"

    .line 762
    .line 763
    invoke-direct/range {v3 .. v10}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2, v3}, La/z6h;->a(Lkotlin/jvm/functions/Function1;)V

    .line 767
    .line 768
    .line 769
    new-instance v0, La/mz2;

    .line 770
    .line 771
    const/4 v1, 0x3

    .line 772
    invoke-direct {v0, v1}, La/mz2;-><init>(B)V

    .line 773
    .line 774
    .line 775
    return-object v0

    .line 776
    nop

    .line 777
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
