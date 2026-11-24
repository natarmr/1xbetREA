.class public final synthetic La/y6h;
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
    iput-byte p7, p0, La/y6h;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/y6h;->a:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const-string v3, "actionDialogManager"

    .line 7
    .line 8
    const v4, 0x7f130162

    .line 9
    .line 10
    .line 11
    const-string v5, "snackbarManager"

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Throwable;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, La/l0l;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, La/l0l;->x(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Throwable;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/txk;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, v0, La/txk;->d:La/mne;

    .line 56
    .line 57
    iget-object v4, v2, La/mne;->a:La/rwj;

    .line 58
    .line 59
    sget-object v2, La/qxk;->a:La/qxk;

    .line 60
    .line 61
    new-instance v5, La/pxk;

    .line 62
    .line 63
    invoke-direct {v5, v0, v9, v8}, La/pxk;-><init>(La/txk;La/yje;B)V

    .line 64
    .line 65
    .line 66
    const/16 v6, 0xa

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, Ljava/lang/Throwable;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, La/txk;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    iget-object v1, v0, La/txk;->d:La/mne;

    .line 94
    .line 95
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 96
    .line 97
    sget-object v11, La/rxk;->a:La/rxk;

    .line 98
    .line 99
    new-instance v14, La/pxk;

    .line 100
    .line 101
    invoke-direct {v14, v0, v9, v6}, La/pxk;-><init>(La/txk;La/yje;B)V

    .line 102
    .line 103
    .line 104
    const/16 v15, 0xa

    .line 105
    .line 106
    const/4 v12, 0x0

    .line 107
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 108
    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_2
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentRedesignUiModel;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v12, v0

    .line 123
    check-cast v12, La/txk;

    .line 124
    .line 125
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v12}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v2, v12, La/txk;->d:La/mne;

    .line 133
    .line 134
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 135
    .line 136
    new-instance v14, La/y6h;

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    const/16 v17, 0x1c

    .line 141
    .line 142
    const/4 v11, 0x1

    .line 143
    const-class v13, La/txk;

    .line 144
    .line 145
    move-object v10, v14

    .line 146
    const-string v14, "handleError"

    .line 147
    .line 148
    const-string v15, "handleError(Ljava/lang/Throwable;)V"

    .line 149
    .line 150
    invoke-direct/range {v10 .. v17}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    new-instance v3, La/sxk;

    .line 154
    .line 155
    invoke-direct {v3, v12, v1, v9, v7}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 156
    .line 157
    .line 158
    const/16 v18, 0xa

    .line 159
    .line 160
    const/4 v15, 0x0

    .line 161
    move-object v13, v0

    .line 162
    move-object/from16 v16, v2

    .line 163
    .line 164
    move-object/from16 v17, v3

    .line 165
    .line 166
    move-object v14, v10

    .line 167
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 168
    .line 169
    .line 170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_3
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/jsk;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v12, v0

    .line 183
    check-cast v12, La/crk;

    .line 184
    .line 185
    sget-object v0, La/crk;->W1:La/xak;

    .line 186
    .line 187
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    instance-of v0, v1, La/hsk;

    .line 191
    .line 192
    if-eqz v0, :cond_1

    .line 193
    .line 194
    iget-object v0, v12, La/crk;->L1:La/ujd;

    .line 195
    .line 196
    if-eqz v0, :cond_0

    .line 197
    .line 198
    check-cast v1, La/hsk;

    .line 199
    .line 200
    iget-object v1, v1, La/hsk;->a:La/sjd;

    .line 201
    .line 202
    invoke-virtual {v0, v12, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_0
    const-string v0, "composeGameCardFragmentDelegate"

    .line 207
    .line 208
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v9

    .line 212
    :cond_1
    instance-of v0, v1, La/isk;

    .line 213
    .line 214
    if-eqz v0, :cond_3

    .line 215
    .line 216
    iget-object v10, v12, La/crk;->N1:La/wdk0;

    .line 217
    .line 218
    if-eqz v10, :cond_2

    .line 219
    .line 220
    check-cast v1, La/isk;

    .line 221
    .line 222
    iget-object v11, v1, La/isk;->a:La/xdk0;

    .line 223
    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const/16 v17, 0x3fc

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 232
    .line 233
    .line 234
    :goto_0
    invoke-virtual {v12}, La/crk;->G0()La/k3t0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    sget-object v1, La/lok;->a:La/lok;

    .line 239
    .line 240
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v9

    .line 250
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 251
    .line 252
    .line 253
    :goto_1
    return-object v9

    .line 254
    :pswitch_4
    move-object/from16 v1, p1

    .line 255
    .line 256
    check-cast v1, La/cty;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, La/ffk;

    .line 264
    .line 265
    new-instance v2, La/cfk;

    .line 266
    .line 267
    invoke-direct {v2, v0, v1}, La/cfk;-><init>(La/ffk;La/cty;)V

    .line 268
    .line 269
    .line 270
    return-object v2

    .line 271
    :pswitch_5
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, La/g950;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, La/ffk;

    .line 281
    .line 282
    invoke-virtual {v0, v1}, La/ffk;->v0(La/g950;)La/kzj0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0

    .line 287
    :pswitch_6
    move-object/from16 v1, p1

    .line 288
    .line 289
    check-cast v1, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, La/iek;

    .line 297
    .line 298
    invoke-virtual {v0, v1}, La/iek;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :pswitch_7
    move-object/from16 v1, p1

    .line 304
    .line 305
    check-cast v1, La/uak;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, La/k3t0;

    .line 313
    .line 314
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_8
    move-object/from16 v1, p1

    .line 321
    .line 322
    check-cast v1, La/gbk;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, La/cbk;

    .line 330
    .line 331
    sget-object v1, La/cbk;->O1:La/xak;

    .line 332
    .line 333
    iget-object v1, v0, La/cbk;->M1:La/ii;

    .line 334
    .line 335
    if-eqz v1, :cond_4

    .line 336
    .line 337
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 338
    .line 339
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    const v2, 0x7f13131f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v12

    .line 350
    const v2, 0x7f130e5d

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    sget-object v19, La/n12;->a:La/n12;

    .line 361
    .line 362
    const/16 v20, 0x0

    .line 363
    .line 364
    const/16 v21, 0x5f8

    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const/16 v16, 0x0

    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1, v10, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 385
    .line 386
    .line 387
    iget-object v0, v0, La/cbk;->N1:La/a8z;

    .line 388
    .line 389
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    check-cast v0, La/k3t0;

    .line 394
    .line 395
    sget-object v1, La/tak;->a:La/tak;

    .line 396
    .line 397
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object v0

    .line 403
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v9

    .line 407
    :pswitch_9
    move-object/from16 v1, p1

    .line 408
    .line 409
    check-cast v1, La/p7k;

    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 415
    .line 416
    move-object v3, v0

    .line 417
    check-cast v3, La/iak;

    .line 418
    .line 419
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    iget-object v4, v3, La/iak;->k:Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    move v5, v7

    .line 429
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_6

    .line 434
    .line 435
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    check-cast v6, La/p8k;

    .line 440
    .line 441
    iget-boolean v6, v6, La/p8k;->c:Z

    .line 442
    .line 443
    if-eqz v6, :cond_5

    .line 444
    .line 445
    goto :goto_3

    .line 446
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 447
    .line 448
    goto :goto_2

    .line 449
    :cond_6
    move v5, v2

    .line 450
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    move v6, v7

    .line 455
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    if-eqz v9, :cond_8

    .line 460
    .line 461
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    check-cast v9, La/p8k;

    .line 466
    .line 467
    iget-object v9, v9, La/p8k;->a:La/p7k;

    .line 468
    .line 469
    if-ne v9, v1, :cond_7

    .line 470
    .line 471
    move v2, v6

    .line 472
    goto :goto_5

    .line 473
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 474
    .line 475
    goto :goto_4

    .line 476
    :cond_8
    :goto_5
    if-ltz v5, :cond_9

    .line 477
    .line 478
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    check-cast v0, La/p8k;

    .line 483
    .line 484
    invoke-static {v0, v7}, La/p8k;->c(La/p8k;Z)La/p8k;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v4, v5, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    :cond_9
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    check-cast v0, La/p8k;

    .line 496
    .line 497
    invoke-static {v0, v8}, La/p8k;->c(La/p8k;Z)La/p8k;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v4, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    check-cast v0, La/p8k;

    .line 509
    .line 510
    iget-object v0, v0, La/p8k;->a:La/p7k;

    .line 511
    .line 512
    iput-object v0, v3, La/iak;->j:La/p7k;

    .line 513
    .line 514
    iget-object v5, v3, La/iak;->o:La/p7m0;

    .line 515
    .line 516
    :cond_a
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    move-object v2, v0

    .line 521
    check-cast v2, La/z9k;

    .line 522
    .line 523
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 528
    .line 529
    .line 530
    move-result v9

    .line 531
    const/4 v10, 0x4

    .line 532
    if-eq v9, v10, :cond_c

    .line 533
    .line 534
    const/4 v10, 0x5

    .line 535
    if-eq v9, v10, :cond_c

    .line 536
    .line 537
    iget-object v9, v3, La/iak;->i:La/p7k;

    .line 538
    .line 539
    iget-object v10, v3, La/iak;->j:La/p7k;

    .line 540
    .line 541
    if-eq v9, v10, :cond_b

    .line 542
    .line 543
    :goto_6
    move v9, v8

    .line 544
    goto :goto_7

    .line 545
    :cond_b
    move v9, v7

    .line 546
    goto :goto_7

    .line 547
    :cond_c
    sget-object v9, La/p7k;->h:La/p7k;

    .line 548
    .line 549
    sget-object v10, La/p7k;->g:La/p7k;

    .line 550
    .line 551
    filled-new-array {v9, v10}, [La/p7k;

    .line 552
    .line 553
    .line 554
    move-result-object v9

    .line 555
    invoke-static {v9}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    iget-object v10, v3, La/iak;->i:La/p7k;

    .line 560
    .line 561
    invoke-interface {v9, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v9

    .line 565
    if-nez v9, :cond_b

    .line 566
    .line 567
    goto :goto_6

    .line 568
    :goto_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    new-instance v2, La/z9k;

    .line 575
    .line 576
    invoke-direct {v2, v6, v9}, La/z9k;-><init>(Ljava/util/List;Z)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v5, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-eqz v0, :cond_a

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
    check-cast v1, La/n8k;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 596
    .line 597
    move-object v3, v0

    .line 598
    check-cast v3, La/p9k;

    .line 599
    .line 600
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    iget-object v4, v3, La/p9k;->l:Ljava/util/ArrayList;

    .line 604
    .line 605
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    move v5, v7

    .line 610
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 611
    .line 612
    .line 613
    move-result v6

    .line 614
    if-eqz v6, :cond_e

    .line 615
    .line 616
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    check-cast v6, La/o8k;

    .line 621
    .line 622
    iget-boolean v6, v6, La/o8k;->c:Z

    .line 623
    .line 624
    if-eqz v6, :cond_d

    .line 625
    .line 626
    goto :goto_9

    .line 627
    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 628
    .line 629
    goto :goto_8

    .line 630
    :cond_e
    move v5, v2

    .line 631
    :goto_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    move v6, v7

    .line 636
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v9

    .line 640
    if-eqz v9, :cond_10

    .line 641
    .line 642
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v9

    .line 646
    check-cast v9, La/o8k;

    .line 647
    .line 648
    iget-object v9, v9, La/o8k;->a:La/n8k;

    .line 649
    .line 650
    if-ne v9, v1, :cond_f

    .line 651
    .line 652
    move v2, v6

    .line 653
    goto :goto_b

    .line 654
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 655
    .line 656
    goto :goto_a

    .line 657
    :cond_10
    :goto_b
    if-ltz v5, :cond_11

    .line 658
    .line 659
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    check-cast v0, La/o8k;

    .line 664
    .line 665
    invoke-static {v0, v7}, La/o8k;->c(La/o8k;Z)La/o8k;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-virtual {v4, v5, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    :cond_11
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    check-cast v0, La/o8k;

    .line 677
    .line 678
    invoke-static {v0, v8}, La/o8k;->c(La/o8k;Z)La/o8k;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v4, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    check-cast v0, La/o8k;

    .line 690
    .line 691
    iget-object v0, v0, La/o8k;->a:La/n8k;

    .line 692
    .line 693
    iput-object v0, v3, La/p9k;->k:La/n8k;

    .line 694
    .line 695
    iget-object v2, v3, La/p9k;->p:La/p7m0;

    .line 696
    .line 697
    :cond_12
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    move-object v5, v0

    .line 702
    check-cast v5, La/g9k;

    .line 703
    .line 704
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 709
    .line 710
    .line 711
    move-result v9

    .line 712
    const/16 v10, 0x8

    .line 713
    .line 714
    if-eq v9, v10, :cond_14

    .line 715
    .line 716
    const/16 v10, 0x9

    .line 717
    .line 718
    if-eq v9, v10, :cond_14

    .line 719
    .line 720
    iget-object v9, v3, La/p9k;->j:La/n8k;

    .line 721
    .line 722
    iget-object v10, v3, La/p9k;->k:La/n8k;

    .line 723
    .line 724
    if-eq v9, v10, :cond_13

    .line 725
    .line 726
    :goto_c
    move v9, v8

    .line 727
    goto :goto_d

    .line 728
    :cond_13
    move v9, v7

    .line 729
    goto :goto_d

    .line 730
    :cond_14
    sget-object v9, La/n8k;->l:La/n8k;

    .line 731
    .line 732
    sget-object v10, La/n8k;->k:La/n8k;

    .line 733
    .line 734
    filled-new-array {v9, v10}, [La/n8k;

    .line 735
    .line 736
    .line 737
    move-result-object v9

    .line 738
    invoke-static {v9}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 739
    .line 740
    .line 741
    move-result-object v9

    .line 742
    iget-object v10, v3, La/p9k;->j:La/n8k;

    .line 743
    .line 744
    invoke-interface {v9, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v9

    .line 748
    if-nez v9, :cond_13

    .line 749
    .line 750
    goto :goto_c

    .line 751
    :goto_d
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    new-instance v5, La/g9k;

    .line 758
    .line 759
    invoke-direct {v5, v6, v9}, La/g9k;-><init>(Ljava/util/List;Z)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    if-eqz v0, :cond_12

    .line 767
    .line 768
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 769
    .line 770
    return-object v0

    .line 771
    :pswitch_b
    move-object/from16 v1, p1

    .line 772
    .line 773
    check-cast v1, La/z7k;

    .line 774
    .line 775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v0, La/k3t0;

    .line 781
    .line 782
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 786
    .line 787
    return-object v0

    .line 788
    :pswitch_c
    move-object/from16 v1, p1

    .line 789
    .line 790
    check-cast v1, La/yje;

    .line 791
    .line 792
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v0, La/m0o0;

    .line 795
    .line 796
    invoke-virtual {v0, v1}, La/m0o0;->f(La/yje;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    sget-object v1, La/wne;->a:La/wne;

    .line 801
    .line 802
    if-ne v0, v1, :cond_15

    .line 803
    .line 804
    goto :goto_e

    .line 805
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 806
    .line 807
    :goto_e
    return-object v0

    .line 808
    :pswitch_d
    move-object/from16 v1, p1

    .line 809
    .line 810
    check-cast v1, Ljava/lang/Throwable;

    .line 811
    .line 812
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v0, La/f7j;

    .line 818
    .line 819
    new-instance v2, La/b7j;

    .line 820
    .line 821
    iget-object v3, v0, La/f7j;->f:La/g2v;

    .line 822
    .line 823
    sget-object v4, La/pb10;->g:La/pb10;

    .line 824
    .line 825
    new-instance v9, La/e8g;

    .line 826
    .line 827
    const/16 v5, 0x1c

    .line 828
    .line 829
    invoke-direct {v9, v0, v5}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 830
    .line 831
    .line 832
    const/16 v10, 0x5e

    .line 833
    .line 834
    const/4 v5, 0x0

    .line 835
    const/4 v6, 0x0

    .line 836
    const v7, 0x7f130677

    .line 837
    .line 838
    .line 839
    const v8, 0x7f131690

    .line 840
    .line 841
    .line 842
    invoke-static/range {v3 .. v10}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-direct {v2, v3}, La/b7j;-><init>(La/jkm;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v0, v2}, La/f7j;->x(La/d7j;)V

    .line 850
    .line 851
    .line 852
    iget-object v0, v0, La/f7j;->g:La/duj;

    .line 853
    .line 854
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 855
    .line 856
    .line 857
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    return-object v0

    .line 860
    :pswitch_e
    move-object/from16 v1, p1

    .line 861
    .line 862
    check-cast v1, Ljava/lang/Throwable;

    .line 863
    .line 864
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v0, La/duj;

    .line 870
    .line 871
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 872
    .line 873
    .line 874
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 875
    .line 876
    return-object v0

    .line 877
    :pswitch_f
    move-object/from16 v1, p1

    .line 878
    .line 879
    check-cast v1, La/f5j;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, La/k3t0;

    .line 887
    .line 888
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 892
    .line 893
    return-object v0

    .line 894
    :pswitch_10
    move-object/from16 v1, p1

    .line 895
    .line 896
    check-cast v1, La/z3j;

    .line 897
    .line 898
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v0, La/k3t0;

    .line 904
    .line 905
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :pswitch_11
    move-object/from16 v1, p1

    .line 912
    .line 913
    check-cast v1, La/v5j;

    .line 914
    .line 915
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 919
    .line 920
    move-object v12, v0

    .line 921
    check-cast v12, La/j4j;

    .line 922
    .line 923
    sget-object v0, La/j4j;->R1:La/kud;

    .line 924
    .line 925
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    instance-of v0, v1, La/s5j;

    .line 929
    .line 930
    if-eqz v0, :cond_17

    .line 931
    .line 932
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    if-eqz v0, :cond_1b

    .line 937
    .line 938
    iget-object v1, v12, La/j4j;->O1:La/ii;

    .line 939
    .line 940
    if-eqz v1, :cond_16

    .line 941
    .line 942
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 943
    .line 944
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v14

    .line 948
    const v2, 0x7f1303dc

    .line 949
    .line 950
    .line 951
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v15

    .line 955
    const v2, 0x7f130e5c

    .line 956
    .line 957
    .line 958
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v16

    .line 962
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    sget-object v22, La/n12;->b:La/n12;

    .line 966
    .line 967
    const/16 v23, 0x0

    .line 968
    .line 969
    const/16 v24, 0x5d8

    .line 970
    .line 971
    const/16 v17, 0x0

    .line 972
    .line 973
    const/16 v18, 0x0

    .line 974
    .line 975
    const-string v19, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 976
    .line 977
    const/16 v20, 0x0

    .line 978
    .line 979
    const/16 v21, 0x0

    .line 980
    .line 981
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 989
    .line 990
    .line 991
    goto/16 :goto_f

    .line 992
    .line 993
    :cond_16
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    throw v9

    .line 997
    :cond_17
    instance-of v0, v1, La/t5j;

    .line 998
    .line 999
    if-eqz v0, :cond_18

    .line 1000
    .line 1001
    check-cast v1, La/t5j;

    .line 1002
    .line 1003
    sget-object v0, La/v0j;->p2:La/nwd;

    .line 1004
    .line 1005
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1010
    .line 1011
    .line 1012
    iget-object v3, v1, La/t5j;->a:La/sba0;

    .line 1013
    .line 1014
    iget-byte v3, v3, La/sba0;->a:B

    .line 1015
    .line 1016
    iget-wide v4, v1, La/t5j;->b:J

    .line 1017
    .line 1018
    iget v1, v1, La/t5j;->c:I

    .line 1019
    .line 1020
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1021
    .line 1022
    .line 1023
    const-string v0, "DailyTaskMoreInfoBottomSheetDialog"

    .line 1024
    .line 1025
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v9

    .line 1029
    if-nez v9, :cond_1b

    .line 1030
    .line 1031
    new-instance v9, La/v0j;

    .line 1032
    .line 1033
    invoke-direct {v9}, La/v0j;-><init>()V

    .line 1034
    .line 1035
    .line 1036
    sget-object v10, La/v0j;->q2:[La/iiy;

    .line 1037
    .line 1038
    aget-object v7, v10, v7

    .line 1039
    .line 1040
    iget-object v11, v9, La/v0j;->k2:La/zz2;

    .line 1041
    .line 1042
    invoke-virtual {v11, v9, v7, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1043
    .line 1044
    .line 1045
    iget-object v3, v9, La/v0j;->m2:La/r34;

    .line 1046
    .line 1047
    aget-object v6, v10, v6

    .line 1048
    .line 1049
    invoke-virtual {v3, v9, v6, v4, v5}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 1050
    .line 1051
    .line 1052
    iget-object v3, v9, La/v0j;->l2:La/zz2;

    .line 1053
    .line 1054
    aget-object v4, v10, v8

    .line 1055
    .line 1056
    invoke-virtual {v3, v9, v4, v1}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v9, v2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    goto :goto_f

    .line 1063
    :cond_18
    instance-of v0, v1, La/u5j;

    .line 1064
    .line 1065
    if-eqz v0, :cond_1a

    .line 1066
    .line 1067
    check-cast v1, La/u5j;

    .line 1068
    .line 1069
    iget-object v10, v12, La/j4j;->N1:La/wdk0;

    .line 1070
    .line 1071
    if-eqz v10, :cond_19

    .line 1072
    .line 1073
    new-instance v11, La/xdk0;

    .line 1074
    .line 1075
    sget-object v14, La/rek0;->b:La/rek0;

    .line 1076
    .line 1077
    iget-object v15, v1, La/u5j;->a:Ljava/lang/String;

    .line 1078
    .line 1079
    const/16 v19, 0x0

    .line 1080
    .line 1081
    const/16 v20, 0x7c

    .line 1082
    .line 1083
    const/16 v16, 0x0

    .line 1084
    .line 1085
    const/16 v17, 0x0

    .line 1086
    .line 1087
    const/16 v18, 0x0

    .line 1088
    .line 1089
    move-object v13, v11

    .line 1090
    invoke-direct/range {v13 .. v20}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1091
    .line 1092
    .line 1093
    const/16 v17, 0x3fc

    .line 1094
    .line 1095
    const/4 v13, 0x0

    .line 1096
    const/4 v14, 0x0

    .line 1097
    const/4 v15, 0x0

    .line 1098
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1099
    .line 1100
    .line 1101
    goto :goto_f

    .line 1102
    :cond_19
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    throw v9

    .line 1106
    :cond_1a
    instance-of v0, v1, La/r5j;

    .line 1107
    .line 1108
    if-eqz v0, :cond_1c

    .line 1109
    .line 1110
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    check-cast v1, La/r5j;

    .line 1115
    .line 1116
    iget-object v1, v1, La/r5j;->a:La/jr1;

    .line 1117
    .line 1118
    new-instance v2, Lkotlin/Pair;

    .line 1119
    .line 1120
    const-string v3, "DAILY_TASKS_SWITCH_TAB"

    .line 1121
    .line 1122
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    const-string v2, "DAILY_TASKS_SWITCH_TAB_REQUEST"

    .line 1134
    .line 1135
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    :cond_1b
    :goto_f
    invoke-virtual {v12}, La/j4j;->G0()La/k3t0;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    sget-object v1, La/m3j;->a:La/m3j;

    .line 1143
    .line 1144
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1148
    .line 1149
    goto :goto_10

    .line 1150
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1151
    .line 1152
    .line 1153
    :goto_10
    return-object v9

    .line 1154
    :pswitch_12
    move-object/from16 v1, p1

    .line 1155
    .line 1156
    check-cast v1, Ljava/lang/Throwable;

    .line 1157
    .line 1158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1162
    .line 1163
    check-cast v0, La/j2j;

    .line 1164
    .line 1165
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 1166
    .line 1167
    .line 1168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1169
    .line 1170
    return-object v0

    .line 1171
    :pswitch_13
    move-object/from16 v1, p1

    .line 1172
    .line 1173
    check-cast v1, Ljava/lang/Throwable;

    .line 1174
    .line 1175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1176
    .line 1177
    .line 1178
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v0, La/j2j;

    .line 1181
    .line 1182
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 1183
    .line 1184
    .line 1185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1186
    .line 1187
    return-object v0

    .line 1188
    :pswitch_14
    move-object/from16 v1, p1

    .line 1189
    .line 1190
    check-cast v1, Ljava/lang/Throwable;

    .line 1191
    .line 1192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1193
    .line 1194
    .line 1195
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, La/j2j;

    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 1200
    .line 1201
    .line 1202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    return-object v0

    .line 1205
    :pswitch_15
    move-object/from16 v1, p1

    .line 1206
    .line 1207
    check-cast v1, Ljava/lang/Throwable;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v0, La/j2j;

    .line 1215
    .line 1216
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 1217
    .line 1218
    .line 1219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1220
    .line 1221
    return-object v0

    .line 1222
    :pswitch_16
    move-object/from16 v1, p1

    .line 1223
    .line 1224
    check-cast v1, La/a2j;

    .line 1225
    .line 1226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    .line 1228
    .line 1229
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1230
    .line 1231
    move-object v12, v0

    .line 1232
    check-cast v12, La/q1j;

    .line 1233
    .line 1234
    sget v0, La/q1j;->n2:I

    .line 1235
    .line 1236
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    instance-of v0, v1, La/y1j;

    .line 1240
    .line 1241
    if-eqz v0, :cond_1d

    .line 1242
    .line 1243
    invoke-virtual {v12}, La/yo8;->y0()V

    .line 1244
    .line 1245
    .line 1246
    goto :goto_11

    .line 1247
    :cond_1d
    instance-of v0, v1, La/z1j;

    .line 1248
    .line 1249
    if-eqz v0, :cond_1f

    .line 1250
    .line 1251
    check-cast v1, La/z1j;

    .line 1252
    .line 1253
    iget-object v15, v1, La/z1j;->a:Ljava/lang/String;

    .line 1254
    .line 1255
    iget-object v10, v12, La/q1j;->k2:La/wdk0;

    .line 1256
    .line 1257
    if-eqz v10, :cond_1e

    .line 1258
    .line 1259
    new-instance v11, La/xdk0;

    .line 1260
    .line 1261
    sget-object v14, La/rek0;->b:La/rek0;

    .line 1262
    .line 1263
    const/16 v19, 0x0

    .line 1264
    .line 1265
    const/16 v20, 0x7c

    .line 1266
    .line 1267
    const/16 v16, 0x0

    .line 1268
    .line 1269
    const/16 v17, 0x0

    .line 1270
    .line 1271
    const/16 v18, 0x0

    .line 1272
    .line 1273
    move-object v13, v11

    .line 1274
    invoke-direct/range {v13 .. v20}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1275
    .line 1276
    .line 1277
    const/16 v17, 0x3fc

    .line 1278
    .line 1279
    const/4 v13, 0x0

    .line 1280
    const/4 v14, 0x0

    .line 1281
    const/4 v15, 0x0

    .line 1282
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v12}, La/yo8;->y0()V

    .line 1286
    .line 1287
    .line 1288
    :goto_11
    invoke-virtual {v12}, La/q1j;->P0()La/k3t0;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v0

    .line 1292
    sget-object v1, La/h1j;->a:La/h1j;

    .line 1293
    .line 1294
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1295
    .line 1296
    .line 1297
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1298
    .line 1299
    goto :goto_12

    .line 1300
    :cond_1e
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    throw v9

    .line 1304
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1305
    .line 1306
    .line 1307
    :goto_12
    return-object v9

    .line 1308
    :pswitch_17
    move-object/from16 v1, p1

    .line 1309
    .line 1310
    check-cast v1, La/y0j;

    .line 1311
    .line 1312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1313
    .line 1314
    .line 1315
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1316
    .line 1317
    check-cast v0, La/v0j;

    .line 1318
    .line 1319
    sget-object v2, La/v0j;->p2:La/nwd;

    .line 1320
    .line 1321
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1322
    .line 1323
    .line 1324
    instance-of v2, v1, La/x0j;

    .line 1325
    .line 1326
    if-eqz v2, :cond_20

    .line 1327
    .line 1328
    iget-object v1, v0, La/v0j;->m2:La/r34;

    .line 1329
    .line 1330
    sget-object v2, La/v0j;->q2:[La/iiy;

    .line 1331
    .line 1332
    aget-object v3, v2, v6

    .line 1333
    .line 1334
    invoke-virtual {v1, v0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v1

    .line 1338
    new-instance v3, Lkotlin/Pair;

    .line 1339
    .line 1340
    const-string v4, "BUNDLE_PRODUCT_ID_KEY"

    .line 1341
    .line 1342
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    iget-object v1, v0, La/v0j;->k2:La/zz2;

    .line 1346
    .line 1347
    aget-object v4, v2, v7

    .line 1348
    .line 1349
    invoke-virtual {v1, v0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    new-instance v4, Lkotlin/Pair;

    .line 1354
    .line 1355
    const-string v5, "BUNDLE_TASK_KIND_ID_KEY"

    .line 1356
    .line 1357
    invoke-direct {v4, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1358
    .line 1359
    .line 1360
    iget-object v1, v0, La/v0j;->l2:La/zz2;

    .line 1361
    .line 1362
    aget-object v2, v2, v8

    .line 1363
    .line 1364
    invoke-virtual {v1, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v1

    .line 1368
    new-instance v2, Lkotlin/Pair;

    .line 1369
    .line 1370
    const-string v5, "BUNDLE_PROGRESS_KEY"

    .line 1371
    .line 1372
    invoke-direct {v2, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1373
    .line 1374
    .line 1375
    filled-new-array {v3, v4, v2}, [Lkotlin/Pair;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v1

    .line 1379
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v1

    .line 1383
    const-string v2, "REQUEST_CLOSE_MORE_INFO_DIALOG_KEY"

    .line 1384
    .line 1385
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1389
    .line 1390
    .line 1391
    goto :goto_13

    .line 1392
    :cond_20
    instance-of v1, v1, La/w0j;

    .line 1393
    .line 1394
    if-eqz v1, :cond_21

    .line 1395
    .line 1396
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1397
    .line 1398
    .line 1399
    :goto_13
    invoke-virtual {v0}, La/v0j;->P0()La/k3t0;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    sget-object v1, La/p0j;->a:La/p0j;

    .line 1404
    .line 1405
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1406
    .line 1407
    .line 1408
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1409
    .line 1410
    goto :goto_14

    .line 1411
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 1412
    .line 1413
    .line 1414
    :goto_14
    return-object v9

    .line 1415
    :pswitch_18
    move-object/from16 v1, p1

    .line 1416
    .line 1417
    check-cast v1, La/ixh;

    .line 1418
    .line 1419
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1420
    .line 1421
    .line 1422
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v0, La/k3t0;

    .line 1425
    .line 1426
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1427
    .line 1428
    .line 1429
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1430
    .line 1431
    return-object v0

    .line 1432
    :pswitch_19
    move-object/from16 v1, p1

    .line 1433
    .line 1434
    check-cast v1, La/uvh;

    .line 1435
    .line 1436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1437
    .line 1438
    .line 1439
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1440
    .line 1441
    check-cast v0, La/k3t0;

    .line 1442
    .line 1443
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1444
    .line 1445
    .line 1446
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1447
    .line 1448
    return-object v0

    .line 1449
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1450
    .line 1451
    check-cast v1, La/juh;

    .line 1452
    .line 1453
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1454
    .line 1455
    .line 1456
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1457
    .line 1458
    check-cast v0, La/k3t0;

    .line 1459
    .line 1460
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1461
    .line 1462
    .line 1463
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1464
    .line 1465
    return-object v0

    .line 1466
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1467
    .line 1468
    check-cast v1, La/n6h;

    .line 1469
    .line 1470
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1471
    .line 1472
    .line 1473
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v0, La/k3t0;

    .line 1476
    .line 1477
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1478
    .line 1479
    .line 1480
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1481
    .line 1482
    return-object v0

    .line 1483
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1484
    .line 1485
    check-cast v1, La/n6h;

    .line 1486
    .line 1487
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1491
    .line 1492
    check-cast v0, La/k3t0;

    .line 1493
    .line 1494
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1495
    .line 1496
    .line 1497
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1498
    .line 1499
    return-object v0

    .line 1500
    nop

    .line 1501
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
