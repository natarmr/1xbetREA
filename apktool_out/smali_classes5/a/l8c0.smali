.class public final synthetic La/l8c0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/l8c0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l8c0;->a:B

    .line 4
    .line 5
    const-string v2, "snackbarManager"

    .line 6
    .line 7
    const/16 v3, 0x15

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/mqc0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/k3t0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/yqc0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/pqc0;

    .line 40
    .line 41
    sget-object v2, La/pqc0;->Q1:La/mi70;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    instance-of v2, v1, La/tqc0;

    .line 47
    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    check-cast v1, La/tqc0;

    .line 51
    .line 52
    iget-object v1, v1, La/tqc0;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 53
    .line 54
    invoke-virtual {v0}, La/pqc0;->G0()La/ii;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_0
    instance-of v2, v1, La/xqc0;

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    check-cast v1, La/xqc0;

    .line 75
    .line 76
    iget-object v6, v1, La/xqc0;->c:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, v1, La/xqc0;->a:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v7, v1, La/xqc0;->b:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v8, v1, La/xqc0;->d:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0}, La/pqc0;->G0()La/ii;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v5, "clipboard"

    .line 102
    .line 103
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    instance-of v5, v3, Landroid/content/ClipboardManager;

    .line 108
    .line 109
    if-eqz v5, :cond_1

    .line 110
    .line 111
    move-object v4, v3

    .line 112
    check-cast v4, Landroid/content/ClipboardManager;

    .line 113
    .line 114
    :cond_1
    const-string v3, "PROMO_CLIPBOARD_LABEL"

    .line 115
    .line 116
    invoke-static {v3, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    invoke-virtual {v4, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 126
    .line 127
    sget-object v14, La/n12;->c:La/n12;

    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    const/16 v16, 0x5f8

    .line 131
    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v12, 0x0

    .line 136
    const/4 v13, 0x0

    .line 137
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_3
    instance-of v2, v1, La/uqc0;

    .line 152
    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    check-cast v1, La/uqc0;

    .line 156
    .line 157
    iget-object v1, v1, La/uqc0;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 158
    .line 159
    invoke-virtual {v0}, La/pqc0;->G0()La/ii;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_4
    instance-of v2, v1, La/vqc0;

    .line 175
    .line 176
    if-eqz v2, :cond_6

    .line 177
    .line 178
    check-cast v1, La/vqc0;

    .line 179
    .line 180
    iget-object v1, v1, La/vqc0;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 181
    .line 182
    iget-object v2, v1, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 183
    .line 184
    if-nez v2, :cond_5

    .line 185
    .line 186
    const-string v2, ""

    .line 187
    .line 188
    :cond_5
    new-instance v3, La/nqc0;

    .line 189
    .line 190
    const/4 v4, 0x1

    .line 191
    invoke-direct {v3, v0, v4}, La/nqc0;-><init>(La/pqc0;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v2, v3}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, La/pqc0;->G0()La/ii;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 209
    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_6
    instance-of v2, v1, La/wqc0;

    .line 213
    .line 214
    if-eqz v2, :cond_7

    .line 215
    .line 216
    check-cast v1, La/wqc0;

    .line 217
    .line 218
    iget-object v1, v1, La/wqc0;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 219
    .line 220
    invoke-virtual {v0}, La/pqc0;->G0()La/ii;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 232
    .line 233
    .line 234
    :goto_0
    iget-object v0, v0, La/pqc0;->N1:La/a8z;

    .line 235
    .line 236
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, La/k3t0;

    .line 241
    .line 242
    sget-object v1, La/hqc0;->a:La/hqc0;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 251
    .line 252
    .line 253
    :goto_1
    return-object v4

    .line 254
    :pswitch_1
    move-object/from16 v1, p1

    .line 255
    .line 256
    check-cast v1, La/kpc0;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, La/k3t0;

    .line 264
    .line 265
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_2
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, Ljava/lang/Throwable;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, La/tac0;

    .line 281
    .line 282
    iget-object v2, v0, La/tac0;->e:La/duj;

    .line 283
    .line 284
    new-instance v4, La/lma0;

    .line 285
    .line 286
    invoke-direct {v4, v0, v3}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_3
    move-object/from16 v1, p1

    .line 296
    .line 297
    check-cast v1, La/ptc0;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, La/doc0;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object v0, v0, La/doc0;->c:La/tac0;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    iget-object v1, v1, La/ptc0;->b:La/gtc0;

    .line 315
    .line 316
    invoke-virtual {v0, v1}, La/tac0;->v(La/gtc0;)V

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_4
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, La/dmc0;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, La/k3t0;

    .line 332
    .line 333
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_5
    move-object/from16 v1, p1

    .line 340
    .line 341
    check-cast v1, La/ptc0;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, La/hyc0;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    iget-object v1, v1, La/ptc0;->b:La/gtc0;

    .line 359
    .line 360
    invoke-virtual {v0, v1}, La/tac0;->v(La/gtc0;)V

    .line 361
    .line 362
    .line 363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object v0

    .line 366
    :pswitch_6
    move-object/from16 v1, p1

    .line 367
    .line 368
    check-cast v1, La/u4s;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, La/hyc0;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    iget-object v2, v1, La/u4s;->b:La/v4s;

    .line 381
    .line 382
    sget-object v3, La/v4s;->c:La/v4s;

    .line 383
    .line 384
    if-ne v2, v3, :cond_8

    .line 385
    .line 386
    goto :goto_2

    .line 387
    :cond_8
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 388
    .line 389
    invoke-virtual {v0, v1}, La/tac0;->z(La/u4s;)V

    .line 390
    .line 391
    .line 392
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_7
    move-object/from16 v1, p1

    .line 396
    .line 397
    check-cast v1, La/euc0;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, La/hyc0;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, La/hyc0;->C(La/euc0;)V

    .line 407
    .line 408
    .line 409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_8
    move-object/from16 v1, p1

    .line 413
    .line 414
    check-cast v1, La/ptc0;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v0, La/hyc0;

    .line 422
    .line 423
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    iget-object v1, v1, La/ptc0;->b:La/gtc0;

    .line 429
    .line 430
    invoke-virtual {v0, v1}, La/tac0;->v(La/gtc0;)V

    .line 431
    .line 432
    .line 433
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object v0

    .line 436
    :pswitch_9
    move-object/from16 v1, p1

    .line 437
    .line 438
    check-cast v1, La/tgc0;

    .line 439
    .line 440
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, La/k3t0;

    .line 446
    .line 447
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object v0

    .line 453
    :pswitch_a
    move-object/from16 v1, p1

    .line 454
    .line 455
    check-cast v1, La/ugc0;

    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, La/igc0;

    .line 463
    .line 464
    sget-object v2, La/igc0;->V1:La/fl70;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    sget-object v2, La/ugc0;->a:La/ugc0;

    .line 470
    .line 471
    invoke-virtual {v1, v2}, La/ugc0;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    if-eqz v1, :cond_a

    .line 476
    .line 477
    iget-object v1, v0, La/igc0;->N1:La/ii;

    .line 478
    .line 479
    if-eqz v1, :cond_9

    .line 480
    .line 481
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 482
    .line 483
    const v2, 0x7f130162

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    const v2, 0x7f1316ef

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    const v2, 0x7f130e5c

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v8

    .line 504
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    sget-object v14, La/n12;->b:La/n12;

    .line 508
    .line 509
    const/4 v15, 0x0

    .line 510
    const/16 v16, 0x5f8

    .line 511
    .line 512
    const/4 v9, 0x0

    .line 513
    const/4 v10, 0x0

    .line 514
    const/4 v11, 0x0

    .line 515
    const/4 v12, 0x0

    .line 516
    const/4 v13, 0x0

    .line 517
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 528
    .line 529
    .line 530
    iget-object v0, v0, La/igc0;->S1:La/a8z;

    .line 531
    .line 532
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    check-cast v0, La/k3t0;

    .line 537
    .line 538
    sget-object v1, La/ogc0;->a:La/ogc0;

    .line 539
    .line 540
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    goto :goto_3

    .line 546
    :cond_9
    const-string v0, "actionDialogManager"

    .line 547
    .line 548
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw v4

    .line 552
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 553
    .line 554
    .line 555
    :goto_3
    return-object v4

    .line 556
    :pswitch_b
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, La/cpc0;

    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, La/k3t0;

    .line 566
    .line 567
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    return-object v0

    .line 573
    :pswitch_c
    move-object/from16 v1, p1

    .line 574
    .line 575
    check-cast v1, La/wdc0;

    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v0, La/k3t0;

    .line 583
    .line 584
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_d
    move-object/from16 v1, p1

    .line 591
    .line 592
    check-cast v1, Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, La/jhc0;

    .line 600
    .line 601
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    sget-object v6, La/fhc0;->a:La/fhc0;

    .line 609
    .line 610
    iget-object v2, v0, La/jhc0;->d:La/mne;

    .line 611
    .line 612
    iget-object v8, v2, La/mne;->b:La/dvj;

    .line 613
    .line 614
    new-instance v9, La/ghc0;

    .line 615
    .line 616
    invoke-direct {v9, v0, v1, v4}, La/ghc0;-><init>(La/jhc0;Ljava/lang/String;La/yje;)V

    .line 617
    .line 618
    .line 619
    const/16 v10, 0xa

    .line 620
    .line 621
    const/4 v7, 0x0

    .line 622
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 623
    .line 624
    .line 625
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 626
    .line 627
    return-object v0

    .line 628
    :pswitch_e
    move-object/from16 v1, p1

    .line 629
    .line 630
    check-cast v1, Ljava/lang/Throwable;

    .line 631
    .line 632
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v0, La/sec0;

    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 643
    .line 644
    iget-object v3, v0, La/i3t0;->i:La/ocj;

    .line 645
    .line 646
    instance-of v4, v1, Ljava/net/SocketTimeoutException;

    .line 647
    .line 648
    if-nez v4, :cond_10

    .line 649
    .line 650
    instance-of v4, v1, Ljava/net/UnknownHostException;

    .line 651
    .line 652
    if-eqz v4, :cond_b

    .line 653
    .line 654
    goto/16 :goto_4

    .line 655
    .line 656
    :cond_b
    instance-of v4, v1, La/zhi0;

    .line 657
    .line 658
    const/4 v5, 0x0

    .line 659
    if-eqz v4, :cond_e

    .line 660
    .line 661
    move-object v4, v1

    .line 662
    check-cast v4, La/zhi0;

    .line 663
    .line 664
    iget-object v4, v4, La/zhi0;->c:La/kuw;

    .line 665
    .line 666
    sget-object v6, La/i2o;->y2:La/i2o;

    .line 667
    .line 668
    if-ne v4, v6, :cond_e

    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    if-eqz v1, :cond_c

    .line 675
    .line 676
    new-instance v4, La/gec0;

    .line 677
    .line 678
    iget-object v6, v0, La/sec0;->v:La/ctf0;

    .line 679
    .line 680
    new-array v7, v5, [Ljava/lang/Object;

    .line 681
    .line 682
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 683
    .line 684
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    const v7, 0x7f1303fb

    .line 689
    .line 690
    .line 691
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v5

    .line 695
    invoke-direct {v4, v5, v1}, La/gec0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    :cond_c
    iget-object v4, v3, La/ocj;->a:La/p7m0;

    .line 702
    .line 703
    :cond_d
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    move-object v5, v0

    .line 711
    check-cast v5, La/bec0;

    .line 712
    .line 713
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    const/16 v16, 0x0

    .line 717
    .line 718
    const v17, 0xffc7

    .line 719
    .line 720
    .line 721
    const/4 v6, 0x0

    .line 722
    const/4 v7, 0x0

    .line 723
    const/4 v8, 0x0

    .line 724
    const/4 v9, 0x0

    .line 725
    const/4 v10, 0x1

    .line 726
    const/4 v11, 0x0

    .line 727
    const/4 v12, 0x0

    .line 728
    const/4 v13, 0x0

    .line 729
    const/4 v14, 0x0

    .line 730
    const/4 v15, 0x0

    .line 731
    invoke-static/range {v5 .. v17}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    if-eqz v0, :cond_d

    .line 740
    .line 741
    goto :goto_5

    .line 742
    :cond_e
    iget-object v4, v0, La/sec0;->u:La/duj;

    .line 743
    .line 744
    new-instance v6, La/xh20;

    .line 745
    .line 746
    const/16 v7, 0xe

    .line 747
    .line 748
    invoke-direct {v6, v0, v5, v7}, La/xh20;-><init>(Ljava/lang/Object;ZB)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v4, v1, v6}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 752
    .line 753
    .line 754
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 755
    .line 756
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    move-object v3, v1

    .line 764
    check-cast v3, La/bec0;

    .line 765
    .line 766
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    const/4 v14, 0x0

    .line 770
    const v15, 0xffc7

    .line 771
    .line 772
    .line 773
    const/4 v4, 0x0

    .line 774
    const/4 v5, 0x0

    .line 775
    const/4 v6, 0x0

    .line 776
    const/4 v7, 0x0

    .line 777
    const/4 v8, 0x1

    .line 778
    const/4 v9, 0x0

    .line 779
    const/4 v10, 0x0

    .line 780
    const/4 v11, 0x0

    .line 781
    const/4 v12, 0x0

    .line 782
    const/4 v13, 0x0

    .line 783
    invoke-static/range {v3 .. v15}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    if-eqz v1, :cond_f

    .line 792
    .line 793
    goto :goto_5

    .line 794
    :cond_10
    :goto_4
    iget-object v1, v3, La/ocj;->a:La/p7m0;

    .line 795
    .line 796
    :cond_11
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    move-object v3, v0

    .line 804
    check-cast v3, La/bec0;

    .line 805
    .line 806
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    iget-boolean v8, v3, La/bec0;->h:Z

    .line 810
    .line 811
    const/4 v14, 0x0

    .line 812
    const v15, 0xff87

    .line 813
    .line 814
    .line 815
    const/4 v4, 0x0

    .line 816
    const/4 v5, 0x0

    .line 817
    const/4 v6, 0x0

    .line 818
    const/4 v7, 0x0

    .line 819
    const/4 v9, 0x0

    .line 820
    const/4 v10, 0x0

    .line 821
    const/4 v11, 0x0

    .line 822
    const/4 v12, 0x0

    .line 823
    const/4 v13, 0x0

    .line 824
    invoke-static/range {v3 .. v15}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v0

    .line 832
    if-eqz v0, :cond_11

    .line 833
    .line 834
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 835
    .line 836
    return-object v0

    .line 837
    :pswitch_f
    move-object/from16 v1, p1

    .line 838
    .line 839
    check-cast v1, Ljava/lang/Throwable;

    .line 840
    .line 841
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v0, La/tac0;

    .line 847
    .line 848
    iget-object v2, v0, La/tac0;->e:La/duj;

    .line 849
    .line 850
    new-instance v4, La/lma0;

    .line 851
    .line 852
    invoke-direct {v4, v0, v3}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 856
    .line 857
    .line 858
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_10
    move-object/from16 v1, p1

    .line 862
    .line 863
    check-cast v1, La/j9c0;

    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v0, La/k3t0;

    .line 871
    .line 872
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 876
    .line 877
    return-object v0

    .line 878
    :pswitch_11
    move-object/from16 v1, p1

    .line 879
    .line 880
    check-cast v1, La/gac0;

    .line 881
    .line 882
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 886
    .line 887
    move-object v7, v0

    .line 888
    check-cast v7, La/x9c0;

    .line 889
    .line 890
    sget-object v0, La/x9c0;->Q1:La/rl70;

    .line 891
    .line 892
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    instance-of v0, v1, La/fac0;

    .line 896
    .line 897
    if-eqz v0, :cond_13

    .line 898
    .line 899
    check-cast v1, La/fac0;

    .line 900
    .line 901
    iget-object v5, v7, La/x9c0;->M1:La/wdk0;

    .line 902
    .line 903
    if-eqz v5, :cond_12

    .line 904
    .line 905
    new-instance v6, La/xdk0;

    .line 906
    .line 907
    sget-object v9, La/rek0;->b:La/rek0;

    .line 908
    .line 909
    iget-object v10, v1, La/fac0;->a:Ljava/lang/String;

    .line 910
    .line 911
    const/4 v14, 0x0

    .line 912
    const/16 v15, 0x7c

    .line 913
    .line 914
    const/4 v11, 0x0

    .line 915
    const/4 v12, 0x0

    .line 916
    const/4 v13, 0x0

    .line 917
    move-object v8, v6

    .line 918
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 919
    .line 920
    .line 921
    const/16 v12, 0x3fc

    .line 922
    .line 923
    const/4 v8, 0x0

    .line 924
    const/4 v9, 0x0

    .line 925
    const/4 v10, 0x0

    .line 926
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 927
    .line 928
    .line 929
    goto :goto_6

    .line 930
    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    throw v4

    .line 934
    :cond_13
    instance-of v0, v1, La/cac0;

    .line 935
    .line 936
    if-eqz v0, :cond_14

    .line 937
    .line 938
    invoke-static {v7}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 939
    .line 940
    .line 941
    :goto_6
    invoke-virtual {v7}, La/x9c0;->H0()La/k3t0;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    sget-object v1, La/y8c0;->a:La/y8c0;

    .line 946
    .line 947
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    goto :goto_7

    .line 953
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 954
    .line 955
    .line 956
    :goto_7
    return-object v4

    .line 957
    :pswitch_12
    move-object/from16 v1, p1

    .line 958
    .line 959
    check-cast v1, Ljava/lang/Throwable;

    .line 960
    .line 961
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 967
    .line 968
    sget v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 969
    .line 970
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 971
    .line 972
    .line 973
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 974
    .line 975
    return-object v0

    .line 976
    :pswitch_13
    move-object/from16 v1, p1

    .line 977
    .line 978
    check-cast v1, Ljava/lang/Throwable;

    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 986
    .line 987
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 988
    .line 989
    .line 990
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 991
    .line 992
    return-object v0

    .line 993
    :pswitch_14
    move-object/from16 v1, p1

    .line 994
    .line 995
    check-cast v1, Ljava/lang/Throwable;

    .line 996
    .line 997
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 1003
    .line 1004
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_15
    move-object/from16 v1, p1

    .line 1011
    .line 1012
    check-cast v1, Ljava/lang/Throwable;

    .line 1013
    .line 1014
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 1020
    .line 1021
    sget v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 1022
    .line 1023
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->P(Ljava/lang/Throwable;)V

    .line 1024
    .line 1025
    .line 1026
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_16
    move-object/from16 v1, p1

    .line 1030
    .line 1031
    check-cast v1, La/k9c0;

    .line 1032
    .line 1033
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, La/k3t0;

    .line 1039
    .line 1040
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    :pswitch_17
    move-object/from16 v1, p1

    .line 1047
    .line 1048
    check-cast v1, La/hac0;

    .line 1049
    .line 1050
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1054
    .line 1055
    move-object v7, v0

    .line 1056
    check-cast v7, La/n9c0;

    .line 1057
    .line 1058
    sget-object v0, La/n9c0;->S1:La/fl70;

    .line 1059
    .line 1060
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    instance-of v0, v1, La/eac0;

    .line 1064
    .line 1065
    if-eqz v0, :cond_16

    .line 1066
    .line 1067
    iget-object v5, v7, La/n9c0;->L1:La/wdk0;

    .line 1068
    .line 1069
    if-eqz v5, :cond_15

    .line 1070
    .line 1071
    new-instance v6, La/xdk0;

    .line 1072
    .line 1073
    sget-object v9, La/pek0;->a:La/pek0;

    .line 1074
    .line 1075
    check-cast v1, La/eac0;

    .line 1076
    .line 1077
    iget-object v10, v1, La/eac0;->a:Ljava/lang/String;

    .line 1078
    .line 1079
    const/4 v14, 0x0

    .line 1080
    const/16 v15, 0x7c

    .line 1081
    .line 1082
    const/4 v11, 0x0

    .line 1083
    const/4 v12, 0x0

    .line 1084
    const/4 v13, 0x0

    .line 1085
    move-object v8, v6

    .line 1086
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1087
    .line 1088
    .line 1089
    const/16 v12, 0x3fc

    .line 1090
    .line 1091
    const/4 v8, 0x0

    .line 1092
    const/4 v9, 0x0

    .line 1093
    const/4 v10, 0x0

    .line 1094
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1095
    .line 1096
    .line 1097
    goto :goto_8

    .line 1098
    :cond_15
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    throw v4

    .line 1102
    :cond_16
    instance-of v0, v1, La/dac0;

    .line 1103
    .line 1104
    if-eqz v0, :cond_18

    .line 1105
    .line 1106
    iget-object v0, v7, La/n9c0;->M1:La/q5j;

    .line 1107
    .line 1108
    if-eqz v0, :cond_17

    .line 1109
    .line 1110
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    invoke-virtual {v0, v1}, La/q5j;->a(Landroidx/fragment/app/e;)V

    .line 1115
    .line 1116
    .line 1117
    :goto_8
    iget-object v0, v7, La/n9c0;->R1:La/a8z;

    .line 1118
    .line 1119
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    check-cast v0, La/k3t0;

    .line 1124
    .line 1125
    sget-object v1, La/z8c0;->a:La/z8c0;

    .line 1126
    .line 1127
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1128
    .line 1129
    .line 1130
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1131
    .line 1132
    goto :goto_9

    .line 1133
    :cond_17
    const-string v0, "dailyTasksScreenFactory"

    .line 1134
    .line 1135
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    throw v4

    .line 1139
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 1140
    .line 1141
    .line 1142
    :goto_9
    return-object v4

    .line 1143
    :pswitch_18
    move-object/from16 v1, p1

    .line 1144
    .line 1145
    check-cast v1, La/o4c0;

    .line 1146
    .line 1147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1151
    .line 1152
    check-cast v0, La/qyc0;

    .line 1153
    .line 1154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    iget-object v0, v0, La/qyc0;->c:La/tac0;

    .line 1158
    .line 1159
    invoke-virtual {v0, v1}, La/tac0;->A(La/o4c0;)V

    .line 1160
    .line 1161
    .line 1162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1163
    .line 1164
    return-object v0

    .line 1165
    :pswitch_19
    move-object/from16 v1, p1

    .line 1166
    .line 1167
    check-cast v1, La/u4s;

    .line 1168
    .line 1169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1170
    .line 1171
    .line 1172
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v0, La/qyc0;

    .line 1175
    .line 1176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    .line 1178
    .line 1179
    iget-object v0, v0, La/qyc0;->c:La/tac0;

    .line 1180
    .line 1181
    invoke-virtual {v0, v1}, La/tac0;->z(La/u4s;)V

    .line 1182
    .line 1183
    .line 1184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1185
    .line 1186
    return-object v0

    .line 1187
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1188
    .line 1189
    check-cast v1, La/ptc0;

    .line 1190
    .line 1191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1192
    .line 1193
    .line 1194
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1195
    .line 1196
    check-cast v0, La/qyc0;

    .line 1197
    .line 1198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    iget-object v0, v0, La/qyc0;->c:La/tac0;

    .line 1202
    .line 1203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    iget-object v1, v1, La/ptc0;->b:La/gtc0;

    .line 1207
    .line 1208
    invoke-virtual {v0, v1}, La/tac0;->v(La/gtc0;)V

    .line 1209
    .line 1210
    .line 1211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1212
    .line 1213
    return-object v0

    .line 1214
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1215
    .line 1216
    check-cast v1, La/o4c0;

    .line 1217
    .line 1218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast v0, La/hyc0;

    .line 1224
    .line 1225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 1229
    .line 1230
    invoke-virtual {v0, v1}, La/tac0;->A(La/o4c0;)V

    .line 1231
    .line 1232
    .line 1233
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1234
    .line 1235
    return-object v0

    .line 1236
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1237
    .line 1238
    check-cast v1, La/u4s;

    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1241
    .line 1242
    .line 1243
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v0, La/hyc0;

    .line 1246
    .line 1247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    iget-object v2, v1, La/u4s;->b:La/v4s;

    .line 1251
    .line 1252
    sget-object v3, La/v4s;->c:La/v4s;

    .line 1253
    .line 1254
    if-ne v2, v3, :cond_19

    .line 1255
    .line 1256
    goto :goto_a

    .line 1257
    :cond_19
    iget-object v0, v0, La/hyc0;->c:La/tac0;

    .line 1258
    .line 1259
    invoke-virtual {v0, v1}, La/tac0;->z(La/u4s;)V

    .line 1260
    .line 1261
    .line 1262
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1263
    .line 1264
    return-object v0

    .line 1265
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
