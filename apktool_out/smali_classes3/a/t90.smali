.class public final synthetic La/t90;
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
    iput-byte p7, p0, La/t90;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t90;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const v4, 0x7f130e5c

    .line 8
    .line 9
    .line 10
    const-string v5, "changeBalanceDialogProvider"

    .line 11
    .line 12
    const-string v6, "actionDialogManager"

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/b11;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/k3t0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    move-object/from16 v1, p1

    .line 36
    .line 37
    check-cast v1, La/p11;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v10, v0

    .line 45
    check-cast v10, La/e11;

    .line 46
    .line 47
    sget-object v0, La/e11;->W1:La/qek0;

    .line 48
    .line 49
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    instance-of v0, v1, La/j11;

    .line 53
    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    check-cast v1, La/j11;

    .line 57
    .line 58
    iget-object v0, v1, La/j11;->a:La/ob0;

    .line 59
    .line 60
    instance-of v1, v0, La/mb0;

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    check-cast v0, La/mb0;

    .line 65
    .line 66
    iget-object v13, v0, La/mb0;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v11, v10, La/e11;->M1:La/ynb;

    .line 69
    .line 70
    if-eqz v11, :cond_0

    .line 71
    .line 72
    sget-object v12, La/bm5;->e:La/bm5;

    .line 73
    .line 74
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const-string v16, "REQUEST_CHANGE_BALANCE_KEY"

    .line 82
    .line 83
    const/16 v17, 0x1e6

    .line 84
    .line 85
    const/4 v15, 0x0

    .line 86
    invoke-static/range {v11 .. v17}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v7

    .line 95
    :cond_1
    sget-object v1, La/lb0;->a:La/lb0;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    invoke-virtual {v10}, La/e11;->G0()La/k3t0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v1, La/p01;->a:La/p01;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_0

    .line 113
    .line 114
    :cond_2
    sget-object v1, La/nb0;->a:La/nb0;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_d

    .line 127
    .line 128
    iget-object v1, v10, La/e11;->O1:La/ii;

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 133
    .line 134
    const v2, 0x7f130162

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    const v2, 0x7f13123b

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    sget-object v20, La/n12;->b:La/n12;

    .line 156
    .line 157
    const/16 v21, 0x0

    .line 158
    .line 159
    const/16 v22, 0x5d8

    .line 160
    .line 161
    const/4 v15, 0x0

    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const-string v17, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 165
    .line 166
    const/16 v18, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v1, v11, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_3
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v7

    .line 186
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_5
    sget-object v0, La/k11;->a:La/k11;

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_7

    .line 198
    .line 199
    iget-object v0, v10, La/e11;->O1:La/ii;

    .line 200
    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 204
    .line 205
    const v1, 0x7f1304dc

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    const v1, 0x7f131116

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v13

    .line 219
    const v1, 0x7f131843

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    const v1, 0x7f130e07

    .line 230
    .line 231
    .line 232
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v15

    .line 236
    sget-object v20, La/n12;->a:La/n12;

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    const/16 v22, 0x5d0

    .line 241
    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const-string v17, "REQUEST_REFUSE_BONUS"

    .line 245
    .line 246
    const/16 v18, 0x0

    .line 247
    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_6
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v7

    .line 269
    :cond_7
    sget-object v0, La/m11;->a:La/m11;

    .line 270
    .line 271
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    const-string v2, "snackbarManager"

    .line 276
    .line 277
    if-eqz v0, :cond_9

    .line 278
    .line 279
    iget-object v8, v10, La/e11;->N1:La/wdk0;

    .line 280
    .line 281
    if-eqz v8, :cond_8

    .line 282
    .line 283
    new-instance v9, La/xdk0;

    .line 284
    .line 285
    sget-object v12, La/qek0;->a:La/qek0;

    .line 286
    .line 287
    const v0, 0x7f1303da

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v13

    .line 294
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    const/16 v17, 0x0

    .line 298
    .line 299
    const/16 v18, 0x7c

    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const/4 v15, 0x0

    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    move-object v11, v9

    .line 306
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 307
    .line 308
    .line 309
    const/16 v15, 0x3fc

    .line 310
    .line 311
    const/4 v11, 0x0

    .line 312
    const/4 v12, 0x0

    .line 313
    const/4 v13, 0x0

    .line 314
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 315
    .line 316
    .line 317
    goto :goto_0

    .line 318
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v7

    .line 322
    :cond_9
    sget-object v0, La/l11;->a:La/l11;

    .line 323
    .line 324
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-eqz v0, :cond_a

    .line 329
    .line 330
    invoke-static {v10}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 331
    .line 332
    .line 333
    goto :goto_0

    .line 334
    :cond_a
    instance-of v0, v1, La/o11;

    .line 335
    .line 336
    if-eqz v0, :cond_c

    .line 337
    .line 338
    check-cast v1, La/o11;

    .line 339
    .line 340
    iget-object v12, v1, La/o11;->a:Ljava/lang/String;

    .line 341
    .line 342
    iget-object v13, v1, La/o11;->b:Ljava/lang/String;

    .line 343
    .line 344
    iget-object v14, v1, La/o11;->c:Ljava/lang/String;

    .line 345
    .line 346
    iget-object v0, v10, La/e11;->O1:La/ii;

    .line 347
    .line 348
    if-eqz v0, :cond_b

    .line 349
    .line 350
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 351
    .line 352
    sget-object v20, La/n12;->b:La/n12;

    .line 353
    .line 354
    const/16 v21, 0x0

    .line 355
    .line 356
    const/16 v22, 0x5f8

    .line 357
    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/16 v18, 0x0

    .line 364
    .line 365
    const/16 v19, 0x0

    .line 366
    .line 367
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 378
    .line 379
    .line 380
    goto :goto_0

    .line 381
    :cond_b
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v7

    .line 385
    :cond_c
    instance-of v0, v1, La/n11;

    .line 386
    .line 387
    if-eqz v0, :cond_f

    .line 388
    .line 389
    check-cast v1, La/n11;

    .line 390
    .line 391
    iget-object v13, v1, La/n11;->a:Ljava/lang/String;

    .line 392
    .line 393
    iget-object v8, v10, La/e11;->N1:La/wdk0;

    .line 394
    .line 395
    if-eqz v8, :cond_e

    .line 396
    .line 397
    new-instance v9, La/xdk0;

    .line 398
    .line 399
    sget-object v12, La/rek0;->b:La/rek0;

    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const/16 v18, 0x7c

    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    const/4 v15, 0x0

    .line 407
    const/16 v16, 0x0

    .line 408
    .line 409
    move-object v11, v9

    .line 410
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 411
    .line 412
    .line 413
    const/16 v15, 0x3fc

    .line 414
    .line 415
    const/4 v11, 0x0

    .line 416
    const/4 v12, 0x0

    .line 417
    const/4 v13, 0x0

    .line 418
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 419
    .line 420
    .line 421
    :cond_d
    :goto_0
    invoke-virtual {v10}, La/e11;->G0()La/k3t0;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    sget-object v1, La/m01;->a:La/m01;

    .line 426
    .line 427
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    goto :goto_1

    .line 433
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    throw v7

    .line 437
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 438
    .line 439
    .line 440
    :goto_1
    return-object v7

    .line 441
    :pswitch_1
    move-object/from16 v1, p1

    .line 442
    .line 443
    check-cast v1, Ljava/lang/Throwable;

    .line 444
    .line 445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, La/a01;

    .line 451
    .line 452
    invoke-virtual {v0, v1}, La/a01;->S(Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_2
    move-object/from16 v1, p1

    .line 459
    .line 460
    check-cast v1, Ljava/lang/Throwable;

    .line 461
    .line 462
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v0, La/a01;

    .line 468
    .line 469
    invoke-virtual {v0, v1}, La/a01;->R(Ljava/lang/Throwable;)V

    .line 470
    .line 471
    .line 472
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_3
    move-object/from16 v1, p1

    .line 476
    .line 477
    check-cast v1, Ljava/lang/Throwable;

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, La/a01;

    .line 485
    .line 486
    invoke-virtual {v0, v1}, La/a01;->R(Ljava/lang/Throwable;)V

    .line 487
    .line 488
    .line 489
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_4
    move-object/from16 v1, p1

    .line 493
    .line 494
    check-cast v1, Ljava/lang/Throwable;

    .line 495
    .line 496
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v0, La/duj;

    .line 502
    .line 503
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 504
    .line 505
    .line 506
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 507
    .line 508
    return-object v0

    .line 509
    :pswitch_5
    move-object/from16 v1, p1

    .line 510
    .line 511
    check-cast v1, Ljava/lang/Throwable;

    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, La/a01;

    .line 519
    .line 520
    invoke-virtual {v0, v1}, La/a01;->S(Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 524
    .line 525
    return-object v0

    .line 526
    :pswitch_6
    move-object/from16 v1, p1

    .line 527
    .line 528
    check-cast v1, La/jy0;

    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, La/k3t0;

    .line 536
    .line 537
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_7
    move-object/from16 v1, p1

    .line 544
    .line 545
    check-cast v1, Landroid/view/View;

    .line 546
    .line 547
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v0, La/zw0;

    .line 550
    .line 551
    invoke-virtual {v0, v1}, La/zw0;->i(Landroid/view/View;)V

    .line 552
    .line 553
    .line 554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_8
    move-object/from16 v1, p1

    .line 558
    .line 559
    check-cast v1, Landroid/view/View;

    .line 560
    .line 561
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v0, La/zw0;

    .line 564
    .line 565
    invoke-virtual {v0, v1}, La/zw0;->i(Landroid/view/View;)V

    .line 566
    .line 567
    .line 568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_9
    move-object/from16 v1, p1

    .line 572
    .line 573
    check-cast v1, Ljava/lang/Throwable;

    .line 574
    .line 575
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, La/duj;

    .line 581
    .line 582
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 583
    .line 584
    .line 585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object v0

    .line 588
    :pswitch_a
    move-object/from16 v1, p1

    .line 589
    .line 590
    check-cast v1, La/lv0;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v0, La/kv0;

    .line 598
    .line 599
    sget-object v2, La/kv0;->n2:La/hfk0;

    .line 600
    .line 601
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    iget-object v1, v1, La/lv0;->a:Ljava/lang/String;

    .line 605
    .line 606
    new-instance v2, Landroid/os/Bundle;

    .line 607
    .line 608
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 609
    .line 610
    .line 611
    const-string v4, "RESULT_GAME_NICKNAME_LISTENER_KEY"

    .line 612
    .line 613
    invoke-virtual {v2, v4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    iget-object v1, v0, La/kv0;->k2:La/phf0;

    .line 617
    .line 618
    sget-object v4, La/kv0;->o2:[La/iiy;

    .line 619
    .line 620
    aget-object v3, v4, v3

    .line 621
    .line 622
    invoke-virtual {v1, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0}, La/kv0;->P0()La/k3t0;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    sget-object v1, La/cv0;->a:La/cv0;

    .line 637
    .line 638
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 642
    .line 643
    return-object v0

    .line 644
    :pswitch_b
    move-object/from16 v1, p1

    .line 645
    .line 646
    check-cast v1, La/vu0;

    .line 647
    .line 648
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v0, La/uu0;

    .line 654
    .line 655
    sget-object v3, La/uu0;->o2:La/gfk0;

    .line 656
    .line 657
    iget-object v1, v1, La/vu0;->a:La/av0;

    .line 658
    .line 659
    iget-object v3, v0, La/uu0;->l2:La/phf0;

    .line 660
    .line 661
    sget-object v4, La/uu0;->p2:[La/iiy;

    .line 662
    .line 663
    aget-object v2, v4, v2

    .line 664
    .line 665
    invoke-virtual {v3, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    new-instance v3, Lkotlin/Pair;

    .line 670
    .line 671
    const-string v4, "RESULT_GAME_MODE_LISTENER_KEY"

    .line 672
    .line 673
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 688
    .line 689
    .line 690
    iget-object v0, v0, La/uu0;->n2:La/a8z;

    .line 691
    .line 692
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    check-cast v0, La/k3t0;

    .line 697
    .line 698
    sget-object v1, La/qu0;->a:La/qu0;

    .line 699
    .line 700
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    return-object v0

    .line 706
    :pswitch_c
    move-object/from16 v1, p1

    .line 707
    .line 708
    check-cast v1, La/vs0;

    .line 709
    .line 710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, La/k3t0;

    .line 716
    .line 717
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 721
    .line 722
    return-object v0

    .line 723
    :pswitch_d
    move-object/from16 v1, p1

    .line 724
    .line 725
    check-cast v1, La/iw0;

    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 731
    .line 732
    move-object v10, v0

    .line 733
    check-cast v10, La/hu0;

    .line 734
    .line 735
    sget-object v0, La/hu0;->Y1:La/rek0;

    .line 736
    .line 737
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    instance-of v0, v1, La/gw0;

    .line 741
    .line 742
    if-eqz v0, :cond_10

    .line 743
    .line 744
    check-cast v1, La/gw0;

    .line 745
    .line 746
    sget-object v0, La/pwu0;->q2:La/svs0;

    .line 747
    .line 748
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    iget-wide v5, v1, La/gw0;->a:J

    .line 756
    .line 757
    iget-wide v7, v1, La/gw0;->b:J

    .line 758
    .line 759
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    new-instance v0, La/pwu0;

    .line 763
    .line 764
    invoke-direct {v0}, La/pwu0;-><init>()V

    .line 765
    .line 766
    .line 767
    sget-object v1, La/pwu0;->r2:[La/iiy;

    .line 768
    .line 769
    aget-object v3, v1, v3

    .line 770
    .line 771
    iget-object v9, v0, La/pwu0;->l2:La/r34;

    .line 772
    .line 773
    invoke-virtual {v9, v0, v3, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 774
    .line 775
    .line 776
    iget-object v3, v0, La/pwu0;->m2:La/r34;

    .line 777
    .line 778
    aget-object v2, v1, v2

    .line 779
    .line 780
    invoke-virtual {v3, v0, v2, v7, v8}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 781
    .line 782
    .line 783
    const/4 v2, 0x2

    .line 784
    aget-object v1, v1, v2

    .line 785
    .line 786
    iget-object v2, v0, La/pwu0;->n2:La/phf0;

    .line 787
    .line 788
    const-string v3, ""

    .line 789
    .line 790
    invoke-virtual {v2, v0, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    const-class v1, La/pwu0;

    .line 794
    .line 795
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    invoke-virtual {v0, v4, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    goto/16 :goto_2

    .line 803
    .line 804
    :cond_10
    instance-of v0, v1, La/hw0;

    .line 805
    .line 806
    if-eqz v0, :cond_12

    .line 807
    .line 808
    check-cast v1, La/hw0;

    .line 809
    .line 810
    iget-object v13, v1, La/hw0;->a:Ljava/lang/String;

    .line 811
    .line 812
    iget-object v8, v10, La/hu0;->W1:La/wdk0;

    .line 813
    .line 814
    if-eqz v8, :cond_11

    .line 815
    .line 816
    new-instance v9, La/xdk0;

    .line 817
    .line 818
    sget-object v12, La/rek0;->b:La/rek0;

    .line 819
    .line 820
    const/16 v17, 0x0

    .line 821
    .line 822
    const/16 v18, 0x7c

    .line 823
    .line 824
    const/4 v14, 0x0

    .line 825
    const/4 v15, 0x0

    .line 826
    const/16 v16, 0x0

    .line 827
    .line 828
    move-object v11, v9

    .line 829
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 830
    .line 831
    .line 832
    const/16 v15, 0x3fc

    .line 833
    .line 834
    const/4 v11, 0x0

    .line 835
    const/4 v12, 0x0

    .line 836
    const/4 v13, 0x0

    .line 837
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 838
    .line 839
    .line 840
    goto/16 :goto_2

    .line 841
    .line 842
    :cond_11
    const-string v0, "snackBarManager"

    .line 843
    .line 844
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    throw v7

    .line 848
    :cond_12
    instance-of v0, v1, La/dw0;

    .line 849
    .line 850
    if-eqz v0, :cond_13

    .line 851
    .line 852
    check-cast v1, La/dw0;

    .line 853
    .line 854
    iget-object v0, v1, La/dw0;->a:Ljava/lang/String;

    .line 855
    .line 856
    iget-object v13, v1, La/dw0;->b:Ljava/lang/String;

    .line 857
    .line 858
    iget-object v12, v1, La/dw0;->c:Ljava/lang/String;

    .line 859
    .line 860
    iget-object v1, v10, La/hu0;->R1:La/n0o0;

    .line 861
    .line 862
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    move-object v9, v1

    .line 867
    check-cast v9, La/qog0;

    .line 868
    .line 869
    if-eqz v9, :cond_15

    .line 870
    .line 871
    new-instance v8, La/fu0;

    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    move-object v11, v10

    .line 875
    move-object v10, v0

    .line 876
    invoke-direct/range {v8 .. v14}, La/fu0;-><init>(La/qog0;Ljava/lang/String;La/yx5;Ljava/lang/String;Ljava/lang/String;B)V

    .line 877
    .line 878
    .line 879
    move-object v10, v11

    .line 880
    iget-object v0, v9, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 881
    .line 882
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    invoke-virtual {v9}, La/qog0;->a()V

    .line 886
    .line 887
    .line 888
    goto :goto_2

    .line 889
    :cond_13
    sget-object v0, La/fw0;->a:La/fw0;

    .line 890
    .line 891
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    if-eqz v0, :cond_15

    .line 896
    .line 897
    iget-object v0, v10, La/hu0;->V1:La/ii;

    .line 898
    .line 899
    if-eqz v0, :cond_14

    .line 900
    .line 901
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 902
    .line 903
    const v1, 0x7f1303fb

    .line 904
    .line 905
    .line 906
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v12

    .line 910
    const v1, 0x7f13131f

    .line 911
    .line 912
    .line 913
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v13

    .line 917
    const v1, 0x7f130e5d

    .line 918
    .line 919
    .line 920
    invoke-virtual {v10, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v14

    .line 924
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    sget-object v20, La/n12;->a:La/n12;

    .line 928
    .line 929
    const/16 v21, 0x0

    .line 930
    .line 931
    const/16 v22, 0x5d8

    .line 932
    .line 933
    const/4 v15, 0x0

    .line 934
    const/16 v16, 0x0

    .line 935
    .line 936
    const-string v17, "ERROR_DIALOG_KEY"

    .line 937
    .line 938
    const/16 v18, 0x0

    .line 939
    .line 940
    const/16 v19, 0x0

    .line 941
    .line 942
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 953
    .line 954
    .line 955
    goto :goto_2

    .line 956
    :cond_14
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    throw v7

    .line 960
    :cond_15
    :goto_2
    invoke-virtual {v10}, La/hu0;->G0()La/k3t0;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    sget-object v1, La/ms0;->a:La/ms0;

    .line 965
    .line 966
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 970
    .line 971
    return-object v0

    .line 972
    :pswitch_e
    move-object/from16 v1, p1

    .line 973
    .line 974
    check-cast v1, La/bq0;

    .line 975
    .line 976
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v0, La/gs0;

    .line 982
    .line 983
    invoke-virtual {v0, v1}, La/gs0;->Q(La/bq0;)V

    .line 984
    .line 985
    .line 986
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 987
    .line 988
    return-object v0

    .line 989
    :pswitch_f
    move-object/from16 v1, p1

    .line 990
    .line 991
    check-cast v1, La/tr0;

    .line 992
    .line 993
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 997
    .line 998
    check-cast v0, La/jq0;

    .line 999
    .line 1000
    sget-object v2, La/jq0;->P1:La/qek0;

    .line 1001
    .line 1002
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    iget-object v2, v1, La/tr0;->a:Ljava/util/List;

    .line 1006
    .line 1007
    iget-object v1, v1, La/tr0;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 1008
    .line 1009
    sget-object v3, La/jlk0;->n2:La/lme0;

    .line 1010
    .line 1011
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1016
    .line 1017
    .line 1018
    const-string v3, "SELECT_SORT_OPTION_REQUEST_KEY"

    .line 1019
    .line 1020
    invoke-static {v4, v3, v2, v1}, La/lme0;->b(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v0}, La/jq0;->G0()La/gs0;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    sget-object v1, La/qp0;->a:La/qp0;

    .line 1028
    .line 1029
    invoke-virtual {v0, v1}, La/gs0;->Q(La/bq0;)V

    .line 1030
    .line 1031
    .line 1032
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1033
    .line 1034
    return-object v0

    .line 1035
    :pswitch_10
    move-object/from16 v1, p1

    .line 1036
    .line 1037
    check-cast v1, La/ql0;

    .line 1038
    .line 1039
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1043
    .line 1044
    check-cast v0, La/k3t0;

    .line 1045
    .line 1046
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1047
    .line 1048
    .line 1049
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1050
    .line 1051
    return-object v0

    .line 1052
    :pswitch_11
    move-object/from16 v1, p1

    .line 1053
    .line 1054
    check-cast v1, La/hf0;

    .line 1055
    .line 1056
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1060
    .line 1061
    check-cast v0, La/k3t0;

    .line 1062
    .line 1063
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1067
    .line 1068
    return-object v0

    .line 1069
    :pswitch_12
    move-object/from16 v1, p1

    .line 1070
    .line 1071
    check-cast v1, La/gg0;

    .line 1072
    .line 1073
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v0, La/nf0;

    .line 1079
    .line 1080
    sget-object v2, La/nf0;->S1:La/hfk0;

    .line 1081
    .line 1082
    instance-of v2, v1, La/eg0;

    .line 1083
    .line 1084
    if-eqz v2, :cond_17

    .line 1085
    .line 1086
    check-cast v1, La/eg0;

    .line 1087
    .line 1088
    iget-object v1, v1, La/eg0;->a:La/ob0;

    .line 1089
    .line 1090
    instance-of v1, v1, La/mb0;

    .line 1091
    .line 1092
    if-eqz v1, :cond_18

    .line 1093
    .line 1094
    iget-object v8, v0, La/nf0;->N1:La/ynb;

    .line 1095
    .line 1096
    if-eqz v8, :cond_16

    .line 1097
    .line 1098
    sget-object v9, La/bm5;->e:La/bm5;

    .line 1099
    .line 1100
    const v1, 0x7f130983

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v10

    .line 1107
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v11

    .line 1114
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    const-string v13, "REQUEST_CHANGE_BALANCE_KEY"

    .line 1118
    .line 1119
    const/16 v14, 0x1e6

    .line 1120
    .line 1121
    const/4 v12, 0x0

    .line 1122
    invoke-static/range {v8 .. v14}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_3

    .line 1126
    :cond_16
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1127
    .line 1128
    .line 1129
    throw v7

    .line 1130
    :cond_17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    sget-object v2, La/fg0;->a:La/fg0;

    .line 1134
    .line 1135
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v1

    .line 1139
    if-eqz v1, :cond_1a

    .line 1140
    .line 1141
    iget-object v1, v0, La/nf0;->O1:La/ii;

    .line 1142
    .line 1143
    if-eqz v1, :cond_19

    .line 1144
    .line 1145
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1146
    .line 1147
    const v2, 0x7f1307bb

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v9

    .line 1154
    const v2, 0x7f130932

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v10

    .line 1161
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v11

    .line 1165
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    sget-object v17, La/n12;->b:La/n12;

    .line 1169
    .line 1170
    const/16 v18, 0x0

    .line 1171
    .line 1172
    const/16 v19, 0x5f8

    .line 1173
    .line 1174
    const/4 v12, 0x0

    .line 1175
    const/4 v13, 0x0

    .line 1176
    const/4 v14, 0x0

    .line 1177
    const/4 v15, 0x0

    .line 1178
    const/16 v16, 0x0

    .line 1179
    .line 1180
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v2

    .line 1187
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1, v8, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1191
    .line 1192
    .line 1193
    :cond_18
    :goto_3
    invoke-virtual {v0}, La/nf0;->G0()La/k3t0;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    sget-object v1, La/se0;->a:La/se0;

    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1200
    .line 1201
    .line 1202
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    goto :goto_4

    .line 1205
    :cond_19
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    throw v7

    .line 1209
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 1210
    .line 1211
    .line 1212
    :goto_4
    return-object v7

    .line 1213
    :pswitch_13
    move-object/from16 v1, p1

    .line 1214
    .line 1215
    check-cast v1, La/gd0;

    .line 1216
    .line 1217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1218
    .line 1219
    .line 1220
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v0, La/k3t0;

    .line 1223
    .line 1224
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_14
    move-object/from16 v1, p1

    .line 1231
    .line 1232
    check-cast v1, La/vd0;

    .line 1233
    .line 1234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v0, La/jd0;

    .line 1240
    .line 1241
    sget-object v2, La/jd0;->P1:La/gfk0;

    .line 1242
    .line 1243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    sget-object v2, La/vd0;->a:La/vd0;

    .line 1247
    .line 1248
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    if-eqz v1, :cond_1b

    .line 1253
    .line 1254
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v0}, La/jd0;->H0()La/k3t0;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    sget-object v1, La/ad0;->a:La/ad0;

    .line 1269
    .line 1270
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1271
    .line 1272
    .line 1273
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1274
    .line 1275
    goto :goto_5

    .line 1276
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 1277
    .line 1278
    .line 1279
    :goto_5
    return-object v7

    .line 1280
    :pswitch_15
    move-object/from16 v1, p1

    .line 1281
    .line 1282
    check-cast v1, Ljava/lang/Throwable;

    .line 1283
    .line 1284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1288
    .line 1289
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1290
    .line 1291
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1295
    .line 1296
    return-object v0

    .line 1297
    :pswitch_16
    move-object/from16 v1, p1

    .line 1298
    .line 1299
    check-cast v1, Ljava/lang/Throwable;

    .line 1300
    .line 1301
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1302
    .line 1303
    .line 1304
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1305
    .line 1306
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1307
    .line 1308
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1312
    .line 1313
    return-object v0

    .line 1314
    :pswitch_17
    move-object/from16 v1, p1

    .line 1315
    .line 1316
    check-cast v1, Ljava/lang/Throwable;

    .line 1317
    .line 1318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1322
    .line 1323
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1324
    .line 1325
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1329
    .line 1330
    return-object v0

    .line 1331
    :pswitch_18
    move-object/from16 v1, p1

    .line 1332
    .line 1333
    check-cast v1, Ljava/lang/Throwable;

    .line 1334
    .line 1335
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1336
    .line 1337
    check-cast v0, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1338
    .line 1339
    sget v2, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->s:I

    .line 1340
    .line 1341
    invoke-virtual {v0, v1}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->c(Ljava/lang/Throwable;)V

    .line 1342
    .line 1343
    .line 1344
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1345
    .line 1346
    return-object v0

    .line 1347
    :pswitch_19
    move-object/from16 v1, p1

    .line 1348
    .line 1349
    check-cast v1, Landroid/graphics/Bitmap;

    .line 1350
    .line 1351
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v0, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;

    .line 1354
    .line 1355
    sget v2, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->s:I

    .line 1356
    .line 1357
    invoke-virtual {v0, v1}, Lorg/xplatform/main_menu/impl/presentation/common/views/AggregatorBanner;->d(Landroid/graphics/Bitmap;)V

    .line 1358
    .line 1359
    .line 1360
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1361
    .line 1362
    return-object v0

    .line 1363
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1364
    .line 1365
    check-cast v1, Ljava/lang/Throwable;

    .line 1366
    .line 1367
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1371
    .line 1372
    check-cast v0, La/duj;

    .line 1373
    .line 1374
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 1375
    .line 1376
    .line 1377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1378
    .line 1379
    return-object v0

    .line 1380
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1381
    .line 1382
    check-cast v1, Ljava/lang/Throwable;

    .line 1383
    .line 1384
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1385
    .line 1386
    .line 1387
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1388
    .line 1389
    check-cast v0, La/u90;

    .line 1390
    .line 1391
    invoke-virtual {v0, v1}, La/u90;->x(Ljava/lang/Throwable;)V

    .line 1392
    .line 1393
    .line 1394
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1395
    .line 1396
    return-object v0

    .line 1397
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1398
    .line 1399
    check-cast v1, Ljava/lang/Throwable;

    .line 1400
    .line 1401
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1402
    .line 1403
    .line 1404
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1405
    .line 1406
    check-cast v0, La/u90;

    .line 1407
    .line 1408
    invoke-virtual {v0, v1}, La/u90;->x(Ljava/lang/Throwable;)V

    .line 1409
    .line 1410
    .line 1411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1412
    .line 1413
    return-object v0

    .line 1414
    nop

    .line 1415
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
