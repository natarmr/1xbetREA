.class public final synthetic La/pl70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pl70;->a:B

    iput-object p1, p0, La/pl70;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pl70;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "viewModelFactory"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v0, v0, La/pl70;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, La/j3a0;

    .line 17
    .line 18
    new-instance v1, La/q0h0;

    .line 19
    .line 20
    iget-object v0, v0, La/j3a0;->L1:La/coi;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v5

    .line 32
    :pswitch_0
    check-cast v0, La/b3a0;

    .line 33
    .line 34
    sget-object v1, La/l2a0;->a:La/l2a0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_1
    check-cast v0, La/s2a0;

    .line 43
    .line 44
    iget-object v0, v0, La/s2a0;->b:La/u6n;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_2
    check-cast v0, La/f0a0;

    .line 48
    .line 49
    sget-object v1, La/f0a0;->P1:La/xi70;

    .line 50
    .line 51
    iget-object v0, v0, La/f0a0;->K1:La/fiu0;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v5

    .line 60
    :pswitch_3
    check-cast v0, La/dq00;

    .line 61
    .line 62
    iget-object v0, v0, La/dq00;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, La/gii0;

    .line 65
    .line 66
    const-class v1, La/oz90;

    .line 67
    .line 68
    sget-object v2, La/sre0;->a:La/tre0;

    .line 69
    .line 70
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/oz90;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_4
    check-cast v0, La/nw20;

    .line 82
    .line 83
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/gii0;

    .line 86
    .line 87
    const-class v1, La/xy90;

    .line 88
    .line 89
    sget-object v2, La/sre0;->a:La/tre0;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/xy90;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_5
    check-cast v0, La/ez90;

    .line 103
    .line 104
    new-instance v1, La/q0h0;

    .line 105
    .line 106
    iget-object v0, v0, La/ez90;->K1:La/aoi;

    .line 107
    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v5

    .line 118
    :pswitch_6
    check-cast v0, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 119
    .line 120
    iget-object v0, v0, Lorg/xplatform/picker/api/presentation/PickerDialogParams;->a:Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;

    .line 121
    .line 122
    instance-of v1, v0, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Gender;

    .line 123
    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    instance-of v0, v0, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$ResidentStatus;

    .line 127
    .line 128
    if-nez v0, :cond_3

    .line 129
    .line 130
    const/4 v3, 0x1

    .line 131
    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    :pswitch_7
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 137
    .line 138
    sget-object v1, La/zo90;->p2:La/fl70;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "clipboard"

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    instance-of v1, v0, Landroid/content/ClipboardManager;

    .line 151
    .line 152
    if-eqz v1, :cond_4

    .line 153
    .line 154
    check-cast v0, Landroid/content/ClipboardManager;

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_4
    move-object v0, v5

    .line 158
    :goto_0
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-eqz v1, :cond_5

    .line 165
    .line 166
    invoke-virtual {v1, v3}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    goto :goto_1

    .line 183
    :cond_5
    move-object v1, v5

    .line 184
    :goto_1
    if-nez v1, :cond_6

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    move-object v2, v1

    .line 188
    :goto_2
    invoke-static {v2}, La/sj3;->G0(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    invoke-static {v5, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 199
    .line 200
    .line 201
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_8
    check-cast v0, Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 205
    .line 206
    new-instance v1, La/ko90;

    .line 207
    .line 208
    invoke-virtual {v0}, Lorg/xplatform/picker/api/presentation/PickerParams;->b0()Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_8

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    :cond_8
    sget-object v0, La/lak0;->c:La/lak0;

    .line 219
    .line 220
    invoke-direct {v1, v3, v0, v2, v2}, La/ko90;-><init>(ILa/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v1

    .line 224
    :pswitch_9
    check-cast v0, La/dn90;

    .line 225
    .line 226
    sget v1, La/dn90;->m2:I

    .line 227
    .line 228
    iget-object v0, v0, La/dn90;->k2:La/fiu0;

    .line 229
    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v5

    .line 237
    :pswitch_a
    check-cast v0, La/vm90;

    .line 238
    .line 239
    iget-object v0, v0, La/vm90;->a:La/l1a;

    .line 240
    .line 241
    new-instance v1, La/mw9;

    .line 242
    .line 243
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 244
    .line 245
    .line 246
    iget-object v0, v0, La/l1a;->a:La/fhn;

    .line 247
    .line 248
    iget-object v0, v0, La/fhn;->b:Ljava/lang/String;

    .line 249
    .line 250
    return-object v1

    .line 251
    :pswitch_b
    check-cast v0, La/j910;

    .line 252
    .line 253
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, La/gii0;

    .line 256
    .line 257
    const-class v1, La/sk90;

    .line 258
    .line 259
    sget-object v2, La/sre0;->a:La/tre0;

    .line 260
    .line 261
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, La/sk90;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_c
    check-cast v0, La/kk90;

    .line 273
    .line 274
    iget-object v0, v0, La/kk90;->B:La/p7m0;

    .line 275
    .line 276
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_d
    check-cast v0, La/nq8;

    .line 288
    .line 289
    sget-object v1, La/o890;->f2:La/jh70;

    .line 290
    .line 291
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 292
    .line 293
    check-cast v0, Landroid/widget/ProgressBar;

    .line 294
    .line 295
    const/16 v1, 0x8

    .line 296
    .line 297
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 298
    .line 299
    .line 300
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_e
    check-cast v0, La/x790;

    .line 304
    .line 305
    sget-object v1, La/x790;->V1:La/fl70;

    .line 306
    .line 307
    iget-object v0, v0, La/x790;->L1:La/fiu0;

    .line 308
    .line 309
    if-eqz v0, :cond_a

    .line 310
    .line 311
    return-object v0

    .line 312
    :cond_a
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v5

    .line 316
    :pswitch_f
    check-cast v0, La/j910;

    .line 317
    .line 318
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, La/gii0;

    .line 321
    .line 322
    const-class v1, La/bxf0;

    .line 323
    .line 324
    sget-object v2, La/sre0;->a:La/tre0;

    .line 325
    .line 326
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, La/bxf0;

    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_10
    check-cast v0, La/oy80;

    .line 338
    .line 339
    iget-object v0, v0, La/oy80;->a:La/mdm;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_11
    check-cast v0, Ljava/util/Map;

    .line 343
    .line 344
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0

    .line 353
    :pswitch_12
    check-cast v0, La/gn80;

    .line 354
    .line 355
    iget-object v0, v0, La/gn80;->K1:La/fiu0;

    .line 356
    .line 357
    if-eqz v0, :cond_b

    .line 358
    .line 359
    return-object v0

    .line 360
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v5

    .line 364
    :pswitch_13
    check-cast v0, La/d04;

    .line 365
    .line 366
    iget-object v0, v0, La/d04;->l:La/qoj0;

    .line 367
    .line 368
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    return-object v1

    .line 374
    :pswitch_14
    check-cast v0, La/xc80;

    .line 375
    .line 376
    sget-object v1, La/xc80;->O1:La/mi70;

    .line 377
    .line 378
    new-instance v1, La/sio0;

    .line 379
    .line 380
    new-instance v2, La/cd60;

    .line 381
    .line 382
    const/16 v3, 0x1b

    .line 383
    .line 384
    invoke-direct {v2, v0, v3}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 385
    .line 386
    .line 387
    new-instance v4, La/cz60;

    .line 388
    .line 389
    iget-object v0, v0, La/xc80;->M1:La/kiu0;

    .line 390
    .line 391
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    move-object v6, v0

    .line 396
    check-cast v6, La/rio0;

    .line 397
    .line 398
    const/4 v10, 0x0

    .line 399
    const/16 v11, 0xa

    .line 400
    .line 401
    const/4 v5, 0x0

    .line 402
    const-class v7, La/rio0;

    .line 403
    .line 404
    const-string v8, "onEndCallClicked"

    .line 405
    .line 406
    const-string v9, "onEndCallClicked()V"

    .line 407
    .line 408
    invoke-direct/range {v4 .. v11}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 409
    .line 410
    .line 411
    sget-object v0, La/ek5;->h:La/ek5;

    .line 412
    .line 413
    invoke-direct {v1, v0}, La/qv5;-><init>(La/dtb;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v2}, La/phu0;->N(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iget-object v3, v1, La/zz3;->d:La/dp;

    .line 421
    .line 422
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v2}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v2}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 437
    .line 438
    .line 439
    invoke-static {v2}, La/egm0;->i(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v2}, La/pzw;->H(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v4, v2}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 458
    .line 459
    .line 460
    invoke-static {v2}, La/ro4;->X(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 465
    .line 466
    .line 467
    return-object v1

    .line 468
    :pswitch_15
    check-cast v0, La/kc80;

    .line 469
    .line 470
    sget-object v1, La/kc80;->O1:La/nh70;

    .line 471
    .line 472
    new-instance v1, La/ic80;

    .line 473
    .line 474
    new-instance v2, La/cd60;

    .line 475
    .line 476
    const/16 v3, 0x19

    .line 477
    .line 478
    invoke-direct {v2, v0, v3}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 479
    .line 480
    .line 481
    new-instance v4, La/cz60;

    .line 482
    .line 483
    iget-object v0, v0, La/kc80;->M1:La/kiu0;

    .line 484
    .line 485
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    move-object v6, v0

    .line 490
    check-cast v6, La/fho0;

    .line 491
    .line 492
    const/4 v10, 0x0

    .line 493
    const/16 v11, 0x8

    .line 494
    .line 495
    const/4 v5, 0x0

    .line 496
    const-class v7, La/fho0;

    .line 497
    .line 498
    const-string v8, "onEndCallClicked"

    .line 499
    .line 500
    const-string v9, "onEndCallClicked()V"

    .line 501
    .line 502
    invoke-direct/range {v4 .. v11}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 503
    .line 504
    .line 505
    sget-object v0, La/ek5;->h:La/ek5;

    .line 506
    .line 507
    invoke-direct {v1, v0}, La/qv5;-><init>(La/dtb;)V

    .line 508
    .line 509
    .line 510
    invoke-static {v2}, La/ccq0;->S(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    iget-object v3, v1, La/zz3;->d:La/dp;

    .line 515
    .line 516
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 517
    .line 518
    .line 519
    invoke-static {v2}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 524
    .line 525
    .line 526
    invoke-static {v2}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 531
    .line 532
    .line 533
    invoke-static {v2}, La/ofm0;->p(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 538
    .line 539
    .line 540
    invoke-static {v2}, La/pzw;->H(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 545
    .line 546
    .line 547
    invoke-static {v4, v2}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 552
    .line 553
    .line 554
    invoke-static {v2}, La/bfb;->P(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v3, v0}, La/dp;->b(La/gbn;)V

    .line 559
    .line 560
    .line 561
    return-object v1

    .line 562
    :pswitch_16
    move-object v6, v0

    .line 563
    check-cast v6, La/aa80;

    .line 564
    .line 565
    iget-object v0, v6, La/aa80;->s:La/sa10;

    .line 566
    .line 567
    sget-object v1, La/pb10;->g:La/pb10;

    .line 568
    .line 569
    new-instance v4, La/cz60;

    .line 570
    .line 571
    const/4 v10, 0x0

    .line 572
    const/4 v11, 0x7

    .line 573
    const/4 v5, 0x0

    .line 574
    const-class v7, La/aa80;

    .line 575
    .line 576
    const-string v8, "onReloadScreenContent"

    .line 577
    .line 578
    const-string v9, "onReloadScreenContent()V"

    .line 579
    .line 580
    invoke-direct/range {v4 .. v11}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 581
    .line 582
    .line 583
    const-wide/16 v12, 0x2328

    .line 584
    .line 585
    const v9, 0x7f130677

    .line 586
    .line 587
    .line 588
    const v10, 0x7f131690

    .line 589
    .line 590
    .line 591
    move-object v7, v0

    .line 592
    move-object v8, v1

    .line 593
    move-object v11, v4

    .line 594
    invoke-virtual/range {v7 .. v13}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    return-object v0

    .line 599
    :pswitch_17
    check-cast v0, La/z880;

    .line 600
    .line 601
    iget-object v0, v0, La/z880;->K1:La/fiu0;

    .line 602
    .line 603
    if-eqz v0, :cond_c

    .line 604
    .line 605
    return-object v0

    .line 606
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    throw v5

    .line 610
    :pswitch_18
    check-cast v0, La/v480;

    .line 611
    .line 612
    sget-object v1, La/iun;->a:La/iun;

    .line 613
    .line 614
    iget-object v2, v0, La/v480;->b:Ljava/lang/String;

    .line 615
    .line 616
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-nez v3, :cond_d

    .line 621
    .line 622
    goto :goto_3

    .line 623
    :cond_d
    move-object v5, v2

    .line 624
    :goto_3
    iget-object v0, v0, La/v480;->e:La/i3m0;

    .line 625
    .line 626
    new-instance v2, La/i580;

    .line 627
    .line 628
    invoke-direct {v2, v1, v0, v5}, La/i580;-><init>(Ljava/util/List;La/i3m0;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    return-object v2

    .line 632
    :pswitch_19
    check-cast v0, La/rpt;

    .line 633
    .line 634
    new-instance v1, La/ay70;

    .line 635
    .line 636
    invoke-virtual {v0}, La/rpt;->k()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-direct {v1, v0, v3}, La/ay70;-><init>(Ljava/lang/String;Z)V

    .line 641
    .line 642
    .line 643
    return-object v1

    .line 644
    :pswitch_1a
    check-cast v0, La/wyu;

    .line 645
    .line 646
    sget-object v19, La/iun;->a:La/iun;

    .line 647
    .line 648
    sget-object v1, La/uaq0;->a:La/s9m0;

    .line 649
    .line 650
    invoke-static {v0, v1}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 651
    .line 652
    .line 653
    move-result v20

    .line 654
    sget-object v1, La/wuy;->a:La/wuy;

    .line 655
    .line 656
    new-instance v0, La/suy;

    .line 657
    .line 658
    const-wide/32 v5, 0x493e0

    .line 659
    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/4 v2, 0x0

    .line 663
    const-wide/16 v3, 0x0

    .line 664
    .line 665
    invoke-direct/range {v0 .. v7}, La/suy;-><init>(La/wuy;ZJJZ)V

    .line 666
    .line 667
    .line 668
    new-instance v1, La/hu70;

    .line 669
    .line 670
    const/16 v18, 0x1

    .line 671
    .line 672
    const/16 v22, 0x0

    .line 673
    .line 674
    const/4 v3, 0x0

    .line 675
    const/4 v4, 0x0

    .line 676
    const/4 v5, 0x0

    .line 677
    const/4 v6, 0x1

    .line 678
    const/4 v7, 0x1

    .line 679
    const/4 v8, 0x0

    .line 680
    const/4 v9, 0x0

    .line 681
    const/4 v10, 0x0

    .line 682
    const/4 v11, 0x0

    .line 683
    const/4 v12, 0x0

    .line 684
    const-string v13, "00:00"

    .line 685
    .line 686
    const/4 v14, 0x0

    .line 687
    const/4 v15, 0x1

    .line 688
    const/16 v16, 0x1

    .line 689
    .line 690
    const-string v17, ""

    .line 691
    .line 692
    move-object/from16 v21, v0

    .line 693
    .line 694
    invoke-direct/range {v1 .. v22}, La/hu70;-><init>(IIZZZZZZZZZLjava/lang/String;ZZZLjava/lang/String;ZLjava/util/List;ZLa/suy;Z)V

    .line 695
    .line 696
    .line 697
    return-object v1

    .line 698
    :pswitch_1b
    check-cast v0, La/om70;

    .line 699
    .line 700
    sget v1, La/om70;->Q1:I

    .line 701
    .line 702
    new-instance v1, La/ko60;

    .line 703
    .line 704
    const/4 v2, 0x7

    .line 705
    invoke-direct {v1, v0, v2}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 706
    .line 707
    .line 708
    return-object v1

    .line 709
    :pswitch_1c
    check-cast v0, La/ul70;

    .line 710
    .line 711
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 712
    .line 713
    new-instance v1, La/ko60;

    .line 714
    .line 715
    const/4 v2, 0x6

    .line 716
    invoke-direct {v1, v0, v2}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 717
    .line 718
    .line 719
    return-object v1

    .line 720
    nop

    .line 721
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
