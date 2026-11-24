.class public final synthetic La/xl10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zl10;


# direct methods
.method public synthetic constructor <init>(La/zl10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xl10;->a:B

    iput-object p1, p0, La/xl10;->b:La/zl10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xl10;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/xl10;->b:La/zl10;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/sm10;

    .line 13
    .line 14
    sget-object v2, La/zl10;->U1:La/wsz;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v2, La/pm10;->a:La/pm10;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const v3, 0x7f130e5c

    .line 26
    .line 27
    .line 28
    const v4, 0x7f1307bb

    .line 29
    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, La/zl10;->G0()La/ii;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const v2, 0x7f13115d

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v14, La/n12;->b:La/n12;

    .line 58
    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x5d8

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    const-string v11, "LUCKY_WHEEL_REQUEST_ERROR_DIALOG_KEY"

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v13, 0x0

    .line 68
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_0
    instance-of v2, v1, La/nm10;

    .line 84
    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    check-cast v1, La/nm10;

    .line 88
    .line 89
    iget-object v7, v1, La/nm10;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0}, La/zl10;->G0()La/ii;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 96
    .line 97
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v14, La/n12;->b:La/n12;

    .line 109
    .line 110
    const/4 v15, 0x0

    .line 111
    const/16 v16, 0x5d8

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    const-string v11, "LUCKY_WHEEL_ERROR_DIALOG_KEY"

    .line 116
    .line 117
    const/4 v12, 0x0

    .line 118
    const/4 v13, 0x0

    .line 119
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_1

    .line 133
    .line 134
    :cond_1
    sget-object v2, La/mm10;->a:La/mm10;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    const/4 v5, 0x0

    .line 141
    if-eqz v2, :cond_4

    .line 142
    .line 143
    iget-object v1, v0, La/zl10;->M1:La/mj8;

    .line 144
    .line 145
    if-eqz v1, :cond_3

    .line 146
    .line 147
    iget-object v1, v1, La/mj8;->a:La/r9u;

    .line 148
    .line 149
    sget-object v2, La/ygp;->s:La/ygp;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v1, v1, La/r9u;->a:La/j1q0;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, La/m1q0;->d(La/ygp;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_2

    .line 166
    .line 167
    new-instance v1, La/wi8;

    .line 168
    .line 169
    invoke-direct {v1}, La/wi8;-><init>()V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_2
    new-instance v1, La/jj8;

    .line 174
    .line 175
    invoke-direct {v1}, La/jj8;-><init>()V

    .line 176
    .line 177
    .line 178
    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const-string v3, "LuckyWheelGameFragment.BONUSES_INFO_DIALOG_TAG"

    .line 183
    .line 184
    invoke-virtual {v1, v2, v3}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_3
    const-string v0, "bonusesInfoScreenFactory"

    .line 190
    .line 191
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v5

    .line 195
    :cond_4
    sget-object v2, La/lm10;->a:La/lm10;

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    const v6, 0x7f130162

    .line 202
    .line 203
    .line 204
    if-eqz v2, :cond_5

    .line 205
    .line 206
    invoke-virtual {v0}, La/zl10;->G0()La/ii;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 211
    .line 212
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    const v2, 0x7f13092f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    const v2, 0x7f130e5d

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    sget-object v16, La/n12;->b:La/n12;

    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    const/16 v18, 0x5d8

    .line 238
    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const-string v13, "LUCKY_WHEEL_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY"

    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v7, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :cond_5
    instance-of v2, v1, La/om10;

    .line 261
    .line 262
    if-eqz v2, :cond_7

    .line 263
    .line 264
    check-cast v1, La/om10;

    .line 265
    .line 266
    iget-boolean v1, v1, La/om10;->a:Z

    .line 267
    .line 268
    const v2, 0x7f13032f

    .line 269
    .line 270
    .line 271
    if-eqz v1, :cond_6

    .line 272
    .line 273
    invoke-virtual {v0}, La/zl10;->G0()La/ii;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    new-instance v3, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 278
    .line 279
    const v4, 0x7f130e2d

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    const v5, 0x7f130a7e

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    const v6, 0x7f13115a

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    sget-object v12, La/n12;->b:La/n12;

    .line 308
    .line 309
    const/4 v13, 0x0

    .line 310
    const/16 v14, 0x5d0

    .line 311
    .line 312
    const/4 v8, 0x0

    .line 313
    const-string v9, "LUCKY_WHEEL_NOT_ENOUGH_FUNDS_DIALOG_KEY"

    .line 314
    .line 315
    const/4 v10, 0x0

    .line 316
    const/4 v11, 0x0

    .line 317
    invoke-direct/range {v3 .. v14}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v3, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    :cond_6
    invoke-virtual {v0}, La/zl10;->G0()La/ii;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 337
    .line 338
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    const v3, 0x7f130e2c

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    sget-object v14, La/n12;->b:La/n12;

    .line 357
    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x5f8

    .line 360
    .line 361
    const/4 v9, 0x0

    .line 362
    const/4 v10, 0x0

    .line 363
    const/4 v11, 0x0

    .line 364
    const/4 v12, 0x0

    .line 365
    const/4 v13, 0x0

    .line 366
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 377
    .line 378
    .line 379
    goto :goto_1

    .line 380
    :cond_7
    sget-object v2, La/qm10;->a:La/qm10;

    .line 381
    .line 382
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_8

    .line 387
    .line 388
    invoke-virtual {v0}, La/zl10;->G0()La/ii;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 393
    .line 394
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    const v2, 0x7f1316f0

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    sget-object v16, La/n12;->b:La/n12;

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const/16 v18, 0x5d8

    .line 417
    .line 418
    const/4 v11, 0x0

    .line 419
    const/4 v12, 0x0

    .line 420
    const-string v13, "LUCKY_WHEEL_SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY"

    .line 421
    .line 422
    const/4 v14, 0x0

    .line 423
    const/4 v15, 0x0

    .line 424
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v7, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 435
    .line 436
    .line 437
    goto :goto_1

    .line 438
    :cond_8
    sget-object v2, La/rm10;->a:La/rm10;

    .line 439
    .line 440
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_a

    .line 445
    .line 446
    iget-object v1, v0, La/zl10;->O1:La/uxs0;

    .line 447
    .line 448
    if-eqz v1, :cond_9

    .line 449
    .line 450
    new-instance v1, La/ffv0;

    .line 451
    .line 452
    invoke-direct {v1}, La/ffv0;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-static {v1, v2}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 463
    .line 464
    .line 465
    :goto_1
    invoke-virtual {v0}, La/zl10;->H0()La/k3t0;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    sget-object v1, La/bl10;->a:La/bl10;

    .line 470
    .line 471
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    goto :goto_2

    .line 477
    :cond_9
    const-string v0, "wildFreeBetScreenFactory"

    .line 478
    .line 479
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw v5

    .line 483
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 484
    .line 485
    .line 486
    :goto_2
    return-object v5

    .line 487
    :pswitch_0
    move-object/from16 v1, p1

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Long;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 492
    .line 493
    .line 494
    move-result-wide v1

    .line 495
    sget-object v3, La/zl10;->U1:La/wsz;

    .line 496
    .line 497
    invoke-virtual {v0}, La/zl10;->H0()La/k3t0;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    new-instance v3, La/ul10;

    .line 502
    .line 503
    invoke-direct {v3, v1, v2}, La/ul10;-><init>(J)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    return-object v0

    .line 512
    nop

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
