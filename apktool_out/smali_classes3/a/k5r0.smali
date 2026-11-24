.class public final synthetic La/k5r0;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/k5r0;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/k5r0;->h:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v0, v0, La/xo;->a:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v2, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v1, Ljava/util/List;

    .line 17
    .line 18
    move-object/from16 v2, p2

    .line 19
    .line 20
    check-cast v2, La/yje;

    .line 21
    .line 22
    check-cast v0, La/szv0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    move-object/from16 v2, p2

    .line 33
    .line 34
    check-cast v2, La/yje;

    .line 35
    .line 36
    check-cast v0, La/ayv0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_1
    check-cast v1, Ljava/lang/Throwable;

    .line 45
    .line 46
    move-object/from16 v2, p2

    .line 47
    .line 48
    check-cast v2, La/yje;

    .line 49
    .line 50
    check-cast v0, La/emv0;

    .line 51
    .line 52
    iget-object v2, v0, La/emv0;->t:La/duj;

    .line 53
    .line 54
    new-instance v3, La/ggt0;

    .line 55
    .line 56
    const/16 v4, 0x16

    .line 57
    .line 58
    invoke-direct {v3, v0, v4}, La/ggt0;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_2
    check-cast v1, La/y3v0;

    .line 68
    .line 69
    move-object/from16 v2, p2

    .line 70
    .line 71
    check-cast v2, La/yje;

    .line 72
    .line 73
    check-cast v0, La/u3v0;

    .line 74
    .line 75
    sget-object v2, La/u3v0;->P1:La/kys0;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    iget-boolean v0, v1, La/y3v0;->a:Z

    .line 83
    .line 84
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 85
    .line 86
    .line 87
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 91
    .line 92
    .line 93
    :goto_0
    return-object v5

    .line 94
    :pswitch_3
    check-cast v1, Ljava/lang/String;

    .line 95
    .line 96
    move-object/from16 v2, p2

    .line 97
    .line 98
    check-cast v2, La/yje;

    .line 99
    .line 100
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_4
    check-cast v1, Ljava/lang/String;

    .line 109
    .line 110
    move-object/from16 v2, p2

    .line 111
    .line 112
    check-cast v2, La/yje;

    .line 113
    .line 114
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_5
    check-cast v1, La/l2v0;

    .line 123
    .line 124
    move-object/from16 v2, p2

    .line 125
    .line 126
    check-cast v2, La/yje;

    .line 127
    .line 128
    check-cast v0, La/w1v0;

    .line 129
    .line 130
    sget-object v2, La/w1v0;->j2:La/bzs0;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    instance-of v2, v1, La/j2v0;

    .line 138
    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    invoke-virtual {v0}, La/w1v0;->R0()La/sjk;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v2, v2, La/sjk;->b:Landroid/widget/ProgressBar;

    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, La/w1v0;->R0()La/sjk;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v0, v0, La/sjk;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 155
    .line 156
    check-cast v1, La/j2v0;

    .line 157
    .line 158
    iget-object v1, v1, La/j2v0;->a:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 161
    .line 162
    if-eqz v0, :cond_2

    .line 163
    .line 164
    invoke-virtual {v0, v1, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_1
    instance-of v2, v1, La/k2v0;

    .line 169
    .line 170
    if-eqz v2, :cond_3

    .line 171
    .line 172
    invoke-virtual {v0}, La/w1v0;->S0()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v0}, La/w1v0;->S0()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    new-instance v4, La/iqt0;

    .line 181
    .line 182
    check-cast v1, La/k2v0;

    .line 183
    .line 184
    iget-object v1, v1, La/k2v0;->a:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v5, v0, La/w1v0;->e2:La/yzn0;

    .line 187
    .line 188
    sget-object v6, La/w1v0;->k2:[La/iiy;

    .line 189
    .line 190
    const/4 v7, 0x3

    .line 191
    aget-object v6, v6, v7

    .line 192
    .line 193
    invoke-virtual {v5, v0, v6}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    check-cast v5, La/i7a;

    .line 198
    .line 199
    invoke-direct {v4, v5, v1}, La/iqt0;-><init>(La/i7a;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    new-instance v1, Lkotlin/Pair;

    .line 203
    .line 204
    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, La/sik;->y0()V

    .line 219
    .line 220
    .line 221
    :cond_2
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 225
    .line 226
    .line 227
    :goto_2
    return-object v5

    .line 228
    :pswitch_6
    check-cast v1, Ljava/util/List;

    .line 229
    .line 230
    move-object/from16 v2, p2

    .line 231
    .line 232
    check-cast v2, La/yje;

    .line 233
    .line 234
    check-cast v0, La/tio0;

    .line 235
    .line 236
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_7
    check-cast v1, Ljava/util/List;

    .line 243
    .line 244
    move-object/from16 v2, p2

    .line 245
    .line 246
    check-cast v2, La/yje;

    .line 247
    .line 248
    check-cast v0, La/uru0;

    .line 249
    .line 250
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_8
    check-cast v1, La/sau0;

    .line 257
    .line 258
    move-object/from16 v2, p2

    .line 259
    .line 260
    check-cast v2, La/yje;

    .line 261
    .line 262
    move-object v8, v0

    .line 263
    check-cast v8, La/mau0;

    .line 264
    .line 265
    sget-object v0, La/mau0;->Q1:La/bzs0;

    .line 266
    .line 267
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    sget-object v0, La/qau0;->a:La/qau0;

    .line 271
    .line 272
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_5

    .line 277
    .line 278
    new-instance v0, Landroid/content/Intent;

    .line 279
    .line 280
    const-string v1, "mailto"

    .line 281
    .line 282
    const-string v2, "doc@1xbet.kz"

    .line 283
    .line 284
    invoke-static {v1, v2, v5}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    const-string v2, "android.intent.action.SENDTO"

    .line 289
    .line 290
    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 291
    .line 292
    .line 293
    :try_start_0
    invoke-virtual {v8, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 294
    .line 295
    .line 296
    goto/16 :goto_3

    .line 297
    .line 298
    :catch_0
    iget-object v6, v8, La/mau0;->M1:La/wdk0;

    .line 299
    .line 300
    if-eqz v6, :cond_4

    .line 301
    .line 302
    new-instance v7, La/xdk0;

    .line 303
    .line 304
    sget-object v10, La/rek0;->b:La/rek0;

    .line 305
    .line 306
    const v0, 0x7f130a82

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    const/4 v15, 0x0

    .line 317
    const/16 v16, 0x7c

    .line 318
    .line 319
    const/4 v12, 0x0

    .line 320
    const/4 v13, 0x0

    .line 321
    const/4 v14, 0x0

    .line 322
    move-object v9, v7

    .line 323
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 324
    .line 325
    .line 326
    const/16 v13, 0x3fc

    .line 327
    .line 328
    const/4 v9, 0x0

    .line 329
    const/4 v10, 0x0

    .line 330
    const/4 v11, 0x0

    .line 331
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 332
    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_4
    const-string v0, "snackbarManager"

    .line 336
    .line 337
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v5

    .line 341
    :cond_5
    sget-object v0, La/pau0;->a:La/pau0;

    .line 342
    .line 343
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_7

    .line 348
    .line 349
    new-instance v0, La/kau0;

    .line 350
    .line 351
    const/4 v1, 0x1

    .line 352
    invoke-direct {v0, v8, v1}, La/kau0;-><init>(La/mau0;B)V

    .line 353
    .line 354
    .line 355
    const-string v1, "KZ_FIRST_DEPOSIT_ALERT_REQUEST_KEY"

    .line 356
    .line 357
    invoke-static {v8, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, v8, La/mau0;->N1:La/ii;

    .line 361
    .line 362
    if-eqz v0, :cond_6

    .line 363
    .line 364
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    const v2, 0x7f130aa7

    .line 372
    .line 373
    .line 374
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    const v2, 0x7f130aac

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    const v2, 0x7f13110f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v12

    .line 392
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    const v2, 0x7f130abf

    .line 396
    .line 397
    .line 398
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v13

    .line 402
    sget-object v18, La/n12;->a:La/n12;

    .line 403
    .line 404
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 405
    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v20, 0x5d0

    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const-string v15, "KZ_FIRST_DEPOSIT_ALERT_REQUEST_KEY"

    .line 412
    .line 413
    const/16 v16, 0x0

    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 421
    .line 422
    .line 423
    goto :goto_3

    .line 424
    :cond_6
    const-string v0, "actionDialogManager"

    .line 425
    .line 426
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    throw v5

    .line 430
    :cond_7
    sget-object v0, La/rau0;->a:La/rau0;

    .line 431
    .line 432
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_8

    .line 437
    .line 438
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v0}, La/j120;->h0(Landroid/content/Context;)V

    .line 443
    .line 444
    .line 445
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 446
    .line 447
    goto :goto_4

    .line 448
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 449
    .line 450
    .line 451
    :goto_4
    return-object v5

    .line 452
    :pswitch_9
    check-cast v1, La/wau0;

    .line 453
    .line 454
    move-object/from16 v2, p2

    .line 455
    .line 456
    check-cast v2, La/yje;

    .line 457
    .line 458
    check-cast v0, La/mau0;

    .line 459
    .line 460
    sget-object v2, La/mau0;->Q1:La/bzs0;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    sget-object v2, La/tau0;->a:La/tau0;

    .line 466
    .line 467
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_9

    .line 472
    .line 473
    invoke-virtual {v0}, La/mau0;->G0()La/hau0;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    iget-object v1, v0, La/hau0;->d:La/nq8;

    .line 478
    .line 479
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 480
    .line 481
    check-cast v1, Landroid/widget/ProgressBar;

    .line 482
    .line 483
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 484
    .line 485
    .line 486
    iget-object v1, v0, La/hau0;->i:Landroid/widget/LinearLayout;

    .line 487
    .line 488
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 489
    .line 490
    .line 491
    iget-object v1, v0, La/hau0;->b:Lcom/google/android/material/button/MaterialButton;

    .line 492
    .line 493
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 494
    .line 495
    .line 496
    iget-object v0, v0, La/hau0;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 497
    .line 498
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 499
    .line 500
    .line 501
    goto/16 :goto_8

    .line 502
    .line 503
    :cond_9
    instance-of v2, v1, La/uau0;

    .line 504
    .line 505
    if-eqz v2, :cond_d

    .line 506
    .line 507
    check-cast v1, La/uau0;

    .line 508
    .line 509
    iget-object v1, v1, La/uau0;->a:La/fbu0;

    .line 510
    .line 511
    invoke-virtual {v0}, La/mau0;->G0()La/hau0;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    iget-object v2, v0, La/hau0;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 516
    .line 517
    iget-object v5, v0, La/hau0;->h:Landroid/widget/TextView;

    .line 518
    .line 519
    iget-object v6, v0, La/hau0;->b:Lcom/google/android/material/button/MaterialButton;

    .line 520
    .line 521
    iget-boolean v7, v1, La/fbu0;->e:Z

    .line 522
    .line 523
    if-eqz v7, :cond_a

    .line 524
    .line 525
    move v7, v3

    .line 526
    goto :goto_5

    .line 527
    :cond_a
    move v7, v4

    .line 528
    :goto_5
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 529
    .line 530
    .line 531
    iget-boolean v2, v1, La/fbu0;->f:Z

    .line 532
    .line 533
    if-eqz v2, :cond_b

    .line 534
    .line 535
    move v2, v3

    .line 536
    goto :goto_6

    .line 537
    :cond_b
    move v2, v4

    .line 538
    :goto_6
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 539
    .line 540
    .line 541
    iget-object v2, v1, La/fbu0;->g:Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    iget-boolean v2, v1, La/fbu0;->b:Z

    .line 547
    .line 548
    if-eqz v2, :cond_c

    .line 549
    .line 550
    move v2, v3

    .line 551
    goto :goto_7

    .line 552
    :cond_c
    move v2, v4

    .line 553
    :goto_7
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 554
    .line 555
    .line 556
    iget-object v2, v0, La/hau0;->g:Landroid/widget/ImageView;

    .line 557
    .line 558
    iget v6, v1, La/fbu0;->a:I

    .line 559
    .line 560
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 561
    .line 562
    .line 563
    iget-object v2, v1, La/fbu0;->c:Ljava/lang/String;

    .line 564
    .line 565
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 566
    .line 567
    .line 568
    iget-object v2, v0, La/hau0;->f:Landroid/widget/TextView;

    .line 569
    .line 570
    iget-object v1, v1, La/fbu0;->d:Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    .line 574
    .line 575
    iget-object v1, v0, La/hau0;->i:Landroid/widget/LinearLayout;

    .line 576
    .line 577
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 578
    .line 579
    .line 580
    iget-object v1, v0, La/hau0;->d:La/nq8;

    .line 581
    .line 582
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 583
    .line 584
    check-cast v1, Landroid/widget/ProgressBar;

    .line 585
    .line 586
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 587
    .line 588
    .line 589
    iget-object v0, v0, La/hau0;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 590
    .line 591
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 592
    .line 593
    .line 594
    goto :goto_8

    .line 595
    :cond_d
    instance-of v2, v1, La/vau0;

    .line 596
    .line 597
    if-eqz v2, :cond_e

    .line 598
    .line 599
    check-cast v1, La/vau0;

    .line 600
    .line 601
    iget-object v1, v1, La/vau0;->a:La/ra10;

    .line 602
    .line 603
    invoke-virtual {v0}, La/mau0;->G0()La/hau0;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    iget-object v2, v0, La/hau0;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 608
    .line 609
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 613
    .line 614
    .line 615
    iget-object v1, v0, La/hau0;->d:La/nq8;

    .line 616
    .line 617
    iget-object v1, v1, La/nq8;->b:Landroid/view/View;

    .line 618
    .line 619
    check-cast v1, Landroid/widget/ProgressBar;

    .line 620
    .line 621
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 622
    .line 623
    .line 624
    iget-object v1, v0, La/hau0;->i:Landroid/widget/LinearLayout;

    .line 625
    .line 626
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 627
    .line 628
    .line 629
    iget-object v0, v0, La/hau0;->b:Lcom/google/android/material/button/MaterialButton;

    .line 630
    .line 631
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 632
    .line 633
    .line 634
    :goto_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    goto :goto_9

    .line 637
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 638
    .line 639
    .line 640
    :goto_9
    return-object v5

    .line 641
    :pswitch_a
    check-cast v1, La/d7u0;

    .line 642
    .line 643
    move-object/from16 v2, p2

    .line 644
    .line 645
    check-cast v2, La/yje;

    .line 646
    .line 647
    check-cast v0, La/y6u0;

    .line 648
    .line 649
    sget-object v2, La/y6u0;->R1:La/bzs0;

    .line 650
    .line 651
    instance-of v2, v1, La/a7u0;

    .line 652
    .line 653
    if-eqz v2, :cond_f

    .line 654
    .line 655
    iget-object v2, v0, La/y6u0;->P1:La/n0o0;

    .line 656
    .line 657
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    check-cast v2, La/s6u0;

    .line 662
    .line 663
    check-cast v1, La/a7u0;

    .line 664
    .line 665
    iget-object v1, v1, La/a7u0;->a:Ljava/util/List;

    .line 666
    .line 667
    invoke-virtual {v2, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    iget-object v1, v1, La/k6r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 675
    .line 676
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    iget-object v1, v1, La/k6r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 684
    .line 685
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    iget-object v0, v0, La/k6r;->b:La/vr9;

    .line 693
    .line 694
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 695
    .line 696
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 697
    .line 698
    .line 699
    goto :goto_a

    .line 700
    :cond_f
    instance-of v2, v1, La/b7u0;

    .line 701
    .line 702
    if-eqz v2, :cond_10

    .line 703
    .line 704
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    iget-object v2, v2, La/k6r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 709
    .line 710
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    iget-object v2, v2, La/k6r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 718
    .line 719
    check-cast v1, La/b7u0;

    .line 720
    .line 721
    iget-object v1, v1, La/b7u0;->a:La/jkm;

    .line 722
    .line 723
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    iget-object v1, v1, La/k6r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 731
    .line 732
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget-object v0, v0, La/k6r;->b:La/vr9;

    .line 740
    .line 741
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 742
    .line 743
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 744
    .line 745
    .line 746
    goto :goto_a

    .line 747
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    sget-object v2, La/c7u0;->a:La/c7u0;

    .line 751
    .line 752
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_11

    .line 757
    .line 758
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    iget-object v1, v1, La/k6r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 763
    .line 764
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    iget-object v1, v1, La/k6r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 772
    .line 773
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0}, La/y6u0;->G0()La/k6r;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    iget-object v0, v0, La/k6r;->b:La/vr9;

    .line 781
    .line 782
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 783
    .line 784
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 785
    .line 786
    .line 787
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 788
    .line 789
    goto :goto_b

    .line 790
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 791
    .line 792
    .line 793
    :goto_b
    return-object v5

    .line 794
    :pswitch_b
    move-object/from16 v2, p2

    .line 795
    .line 796
    check-cast v2, La/yje;

    .line 797
    .line 798
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 799
    .line 800
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 804
    .line 805
    return-object v0

    .line 806
    :pswitch_c
    check-cast v1, Landroid/graphics/Bitmap;

    .line 807
    .line 808
    move-object/from16 v2, p2

    .line 809
    .line 810
    check-cast v2, La/yje;

    .line 811
    .line 812
    check-cast v0, Landroid/widget/ImageView;

    .line 813
    .line 814
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 815
    .line 816
    .line 817
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 818
    .line 819
    return-object v0

    .line 820
    :pswitch_d
    check-cast v1, Ljava/lang/Throwable;

    .line 821
    .line 822
    move-object/from16 v2, p2

    .line 823
    .line 824
    check-cast v2, La/yje;

    .line 825
    .line 826
    check-cast v0, La/zvr0;

    .line 827
    .line 828
    invoke-virtual {v0, v1}, La/zvr0;->O(Ljava/lang/Throwable;)V

    .line 829
    .line 830
    .line 831
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 832
    .line 833
    return-object v0

    .line 834
    :pswitch_e
    check-cast v1, Ljava/lang/Throwable;

    .line 835
    .line 836
    move-object/from16 v2, p2

    .line 837
    .line 838
    check-cast v2, La/yje;

    .line 839
    .line 840
    check-cast v0, La/psr0;

    .line 841
    .line 842
    invoke-virtual {v0, v1}, La/psr0;->N(Ljava/lang/Throwable;)V

    .line 843
    .line 844
    .line 845
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 846
    .line 847
    return-object v0

    .line 848
    :pswitch_f
    check-cast v1, Ljava/lang/Throwable;

    .line 849
    .line 850
    move-object/from16 v2, p2

    .line 851
    .line 852
    check-cast v2, La/yje;

    .line 853
    .line 854
    check-cast v0, La/psr0;

    .line 855
    .line 856
    invoke-virtual {v0, v1}, La/psr0;->N(Ljava/lang/Throwable;)V

    .line 857
    .line 858
    .line 859
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 860
    .line 861
    return-object v0

    .line 862
    :pswitch_10
    check-cast v1, Ljava/lang/Throwable;

    .line 863
    .line 864
    move-object/from16 v2, p2

    .line 865
    .line 866
    check-cast v2, La/yje;

    .line 867
    .line 868
    check-cast v0, La/psr0;

    .line 869
    .line 870
    invoke-virtual {v0, v1}, La/psr0;->N(Ljava/lang/Throwable;)V

    .line 871
    .line 872
    .line 873
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_11
    check-cast v1, Ljava/lang/Throwable;

    .line 877
    .line 878
    move-object/from16 v2, p2

    .line 879
    .line 880
    check-cast v2, La/yje;

    .line 881
    .line 882
    check-cast v0, La/yrr0;

    .line 883
    .line 884
    iget-object v2, v0, La/yrr0;->t:La/duj;

    .line 885
    .line 886
    new-instance v3, La/p6r0;

    .line 887
    .line 888
    const/16 v4, 0xb

    .line 889
    .line 890
    invoke-direct {v3, v0, v4}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 894
    .line 895
    .line 896
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 897
    .line 898
    return-object v0

    .line 899
    :pswitch_12
    check-cast v1, Ljava/lang/Throwable;

    .line 900
    .line 901
    move-object/from16 v2, p2

    .line 902
    .line 903
    check-cast v2, La/yje;

    .line 904
    .line 905
    check-cast v0, La/njr0;

    .line 906
    .line 907
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 908
    .line 909
    .line 910
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_13
    check-cast v1, Ljava/lang/Throwable;

    .line 914
    .line 915
    move-object/from16 v2, p2

    .line 916
    .line 917
    check-cast v2, La/yje;

    .line 918
    .line 919
    check-cast v0, La/njr0;

    .line 920
    .line 921
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 922
    .line 923
    .line 924
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 925
    .line 926
    return-object v0

    .line 927
    :pswitch_14
    check-cast v1, Ljava/lang/Throwable;

    .line 928
    .line 929
    move-object/from16 v2, p2

    .line 930
    .line 931
    check-cast v2, La/yje;

    .line 932
    .line 933
    check-cast v0, La/njr0;

    .line 934
    .line 935
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 936
    .line 937
    .line 938
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 939
    .line 940
    return-object v0

    .line 941
    :pswitch_15
    check-cast v1, Ljava/util/List;

    .line 942
    .line 943
    move-object/from16 v2, p2

    .line 944
    .line 945
    check-cast v2, La/yje;

    .line 946
    .line 947
    check-cast v0, La/sdr0;

    .line 948
    .line 949
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 950
    .line 951
    .line 952
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 953
    .line 954
    return-object v0

    .line 955
    :pswitch_16
    check-cast v1, Ljava/util/List;

    .line 956
    .line 957
    move-object/from16 v2, p2

    .line 958
    .line 959
    check-cast v2, La/yje;

    .line 960
    .line 961
    check-cast v0, La/n7r0;

    .line 962
    .line 963
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 964
    .line 965
    .line 966
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_17
    check-cast v1, Ljava/lang/Throwable;

    .line 970
    .line 971
    move-object/from16 v2, p2

    .line 972
    .line 973
    check-cast v2, La/yje;

    .line 974
    .line 975
    check-cast v0, La/m5r0;

    .line 976
    .line 977
    invoke-virtual {v0, v1}, La/m5r0;->O(Ljava/lang/Throwable;)V

    .line 978
    .line 979
    .line 980
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 981
    .line 982
    return-object v0

    .line 983
    :pswitch_data_0
    .packed-switch 0x0
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
