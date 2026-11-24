.class public final synthetic La/yl3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wn;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yl3;->a:B

    iput-object p1, p0, La/yl3;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yl3;->a:B

    .line 4
    .line 5
    const-string v2, "ERROR_SOCIAL"

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const-string v4, "CLOSE_SOCIAL"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, v0, La/yl3;->b:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, La/n2w0;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/u2w0;

    .line 23
    .line 24
    sget-object v7, La/n2w0;->h2:La/bzs0;

    .line 25
    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    instance-of v7, v1, La/t2w0;

    .line 29
    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    check-cast v1, La/t2w0;

    .line 33
    .line 34
    iget-object v1, v1, La/t2w0;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, v0, La/n2w0;->c2:La/sje;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-static {v2}, La/d5c;->R(La/vne;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-ne v2, v5, :cond_0

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_0
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v3, v0, La/n2w0;->g2:La/mne;

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 57
    .line 58
    invoke-static {v2, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    iput-object v7, v0, La/n2w0;->c2:La/sje;

    .line 67
    .line 68
    new-instance v8, La/gdv0;

    .line 69
    .line 70
    const/16 v2, 0xa

    .line 71
    .line 72
    invoke-direct {v8, v0, v2}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    new-instance v11, La/wbl0;

    .line 76
    .line 77
    const/16 v2, 0x14

    .line 78
    .line 79
    invoke-direct {v11, v0, v1, v6, v2}, La/wbl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 80
    .line 81
    .line 82
    const/16 v12, 0xe

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string v0, "coroutineDispatchers"

    .line 91
    .line 92
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v6

    .line 96
    :cond_2
    instance-of v5, v1, La/r2w0;

    .line 97
    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    new-instance v2, Lkotlin/Pair;

    .line 105
    .line 106
    invoke-direct {v2, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, La/sik;->y0()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_3
    instance-of v1, v1, La/s2w0;

    .line 125
    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    const v1, 0x7f13131f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    new-instance v4, Lkotlin/Pair;

    .line 143
    .line 144
    invoke-direct {v4, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v3, v1, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, La/sik;->y0()V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 163
    .line 164
    .line 165
    :goto_0
    return-void

    .line 166
    :pswitch_0
    check-cast v0, La/rvt0;

    .line 167
    .line 168
    move-object/from16 v1, p1

    .line 169
    .line 170
    check-cast v1, La/jvt0;

    .line 171
    .line 172
    sget-object v6, La/rvt0;->f2:La/sxs0;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    instance-of v6, v1, La/ivt0;

    .line 178
    .line 179
    if-eqz v6, :cond_6

    .line 180
    .line 181
    check-cast v1, La/ivt0;

    .line 182
    .line 183
    iget-object v1, v1, La/ivt0;->a:La/uut0;

    .line 184
    .line 185
    iget-object v2, v1, La/uut0;->b:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v1, v1, La/uut0;->c:Ljava/lang/String;

    .line 188
    .line 189
    if-nez v1, :cond_5

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_5
    move-object v3, v1

    .line 193
    :goto_1
    new-instance v1, La/pvt0;

    .line 194
    .line 195
    invoke-direct {v1, v0}, La/pvt0;-><init>(La/rvt0;)V

    .line 196
    .line 197
    .line 198
    new-instance v4, La/mkt0;

    .line 199
    .line 200
    invoke-direct {v4, v0, v2, v3}, La/mkt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget-object v0, La/tut0;->a:La/wut0;

    .line 204
    .line 205
    sget-object v0, La/wvt0;->c:La/n0o0;

    .line 206
    .line 207
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 215
    .line 216
    new-instance v2, La/qaq0;

    .line 217
    .line 218
    const/16 v3, 0x9

    .line 219
    .line 220
    invoke-direct {v2, v1, v4, v3}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 224
    .line 225
    .line 226
    goto/16 :goto_3

    .line 227
    .line 228
    :cond_6
    instance-of v6, v1, La/hvt0;

    .line 229
    .line 230
    if-eqz v6, :cond_c

    .line 231
    .line 232
    check-cast v1, La/hvt0;

    .line 233
    .line 234
    iget-object v1, v1, La/hvt0;->a:La/evt0;

    .line 235
    .line 236
    iget-object v6, v1, La/evt0;->b:Ljava/lang/String;

    .line 237
    .line 238
    iget v1, v1, La/evt0;->a:I

    .line 239
    .line 240
    if-nez v1, :cond_7

    .line 241
    .line 242
    if-eqz v6, :cond_9

    .line 243
    .line 244
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    if-nez v7, :cond_7

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_7
    if-eqz v6, :cond_8

    .line 252
    .line 253
    invoke-static {v6}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-eqz v7, :cond_9

    .line 258
    .line 259
    :cond_8
    if-nez v1, :cond_9

    .line 260
    .line 261
    iget-object v1, v0, La/rvt0;->d2:La/ywq;

    .line 262
    .line 263
    sget-object v2, La/xvt0;->b:La/xvt0;

    .line 264
    .line 265
    sget-object v3, La/xvt0;->a:La/xvt0;

    .line 266
    .line 267
    filled-new-array {v2, v3}, [La/xvt0;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v2}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v1, v2}, La/ywq;->a(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    iput-boolean v5, v0, La/rvt0;->c2:Z

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_9
    :goto_2
    if-nez v1, :cond_b

    .line 282
    .line 283
    if-eqz v6, :cond_a

    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-nez v1, :cond_b

    .line 290
    .line 291
    :cond_a
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    new-instance v2, Lkotlin/Pair;

    .line 296
    .line 297
    invoke-direct {v2, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, La/sik;->y0()V

    .line 312
    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_b
    const v1, 0x7f1307f9

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    new-instance v4, Lkotlin/Pair;

    .line 330
    .line 331
    invoke-direct {v4, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v3, v1, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, La/sik;->y0()V

    .line 346
    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 350
    .line 351
    .line 352
    :goto_3
    return-void

    .line 353
    :pswitch_1
    check-cast v0, La/d4j0;

    .line 354
    .line 355
    move-object/from16 v1, p1

    .line 356
    .line 357
    check-cast v1, Lkotlin/Unit;

    .line 358
    .line 359
    sget-object v2, La/d4j0;->S1:La/eke0;

    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_d

    .line 373
    .line 374
    invoke-virtual {v0}, La/d4j0;->I0()La/w5j0;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    sget-object v1, La/r4j0;->a:La/r4j0;

    .line 379
    .line 380
    invoke-virtual {v0, v1}, La/w5j0;->z(La/a5j0;)V

    .line 381
    .line 382
    .line 383
    goto :goto_4

    .line 384
    :cond_d
    invoke-virtual {v0}, La/d4j0;->I0()La/w5j0;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const/4 v1, 0x0

    .line 389
    invoke-virtual {v0, v1}, La/w5j0;->D(Z)V

    .line 390
    .line 391
    .line 392
    :goto_4
    return-void

    .line 393
    :pswitch_2
    check-cast v0, La/qid0;

    .line 394
    .line 395
    move-object/from16 v1, p1

    .line 396
    .line 397
    check-cast v1, Ljava/lang/Boolean;

    .line 398
    .line 399
    sget-object v2, La/qid0;->V1:La/rl70;

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_e

    .line 406
    .line 407
    invoke-virtual {v0}, La/qid0;->G0()La/n3r;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    iget-object v0, v0, La/n3r;->c:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 412
    .line 413
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->e()V

    .line 414
    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_e
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->m:Z

    .line 418
    .line 419
    if-eqz v1, :cond_f

    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_f
    iget-object v1, v0, La/qid0;->M1:La/ii;

    .line 423
    .line 424
    if-eqz v1, :cond_10

    .line 425
    .line 426
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 427
    .line 428
    const v2, 0x7f13108f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v8

    .line 435
    const v2, 0x7f130f36

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    const v2, 0x7f130e5c

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    sget-object v16, La/n12;->b:La/n12;

    .line 453
    .line 454
    const/16 v17, 0x0

    .line 455
    .line 456
    const/16 v18, 0x5d8

    .line 457
    .line 458
    const/4 v11, 0x0

    .line 459
    const/4 v12, 0x0

    .line 460
    const-string v13, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY"

    .line 461
    .line 462
    const/4 v14, 0x0

    .line 463
    const/4 v15, 0x0

    .line 464
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 475
    .line 476
    .line 477
    :goto_5
    return-void

    .line 478
    :cond_10
    const-string v0, "actionDialogManager"

    .line 479
    .line 480
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw v6

    .line 484
    :pswitch_3
    check-cast v0, La/s1w;

    .line 485
    .line 486
    move-object/from16 v1, p1

    .line 487
    .line 488
    check-cast v1, Lkotlin/Unit;

    .line 489
    .line 490
    sget-object v1, La/s1w;->d2:La/bst;

    .line 491
    .line 492
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    if-eqz v1, :cond_11

    .line 501
    .line 502
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    const-class v1, La/s1w;

    .line 507
    .line 508
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    invoke-virtual {v0, v1}, La/naw;->B(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    :cond_11
    return-void

    .line 516
    :pswitch_4
    check-cast v0, La/izv;

    .line 517
    .line 518
    move-object/from16 v1, p1

    .line 519
    .line 520
    check-cast v1, Lkotlin/Unit;

    .line 521
    .line 522
    sget-object v1, La/izv;->d2:La/rqt;

    .line 523
    .line 524
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    if-eqz v1, :cond_12

    .line 533
    .line 534
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    iget-object v0, v0, La/jzv;->e:La/q5w;

    .line 539
    .line 540
    invoke-virtual {v0}, La/q5w;->x()V

    .line 541
    .line 542
    .line 543
    :cond_12
    return-void

    .line 544
    :pswitch_5
    check-cast v0, La/gns;

    .line 545
    .line 546
    move-object/from16 v1, p1

    .line 547
    .line 548
    check-cast v1, Lkotlin/Unit;

    .line 549
    .line 550
    sget-object v2, La/gns;->R1:La/pek;

    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, La/gns;->G0()La/k3t0;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    sget-object v1, La/rms;->a:La/rms;

    .line 560
    .line 561
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_6
    check-cast v0, La/exd;

    .line 566
    .line 567
    move-object/from16 v1, p1

    .line 568
    .line 569
    check-cast v1, Lkotlin/Unit;

    .line 570
    .line 571
    sget-object v1, La/exd;->U1:La/usd;

    .line 572
    .line 573
    invoke-virtual {v0}, La/exd;->I0()La/kyd;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual {v0}, La/kyd;->H()V

    .line 578
    .line 579
    .line 580
    return-void

    .line 581
    :pswitch_7
    check-cast v0, La/nud;

    .line 582
    .line 583
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, Lkotlin/Unit;

    .line 586
    .line 587
    sget-object v1, La/nud;->b2:La/kud;

    .line 588
    .line 589
    invoke-virtual {v0}, La/nud;->I0()La/svd;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0}, La/svd;->D()V

    .line 594
    .line 595
    .line 596
    return-void

    .line 597
    :pswitch_8
    check-cast v0, La/l5c;

    .line 598
    .line 599
    move-object/from16 v1, p1

    .line 600
    .line 601
    check-cast v1, Lkotlin/Unit;

    .line 602
    .line 603
    sget-object v1, La/l5c;->W1:La/kl5;

    .line 604
    .line 605
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    if-eqz v1, :cond_13

    .line 614
    .line 615
    invoke-virtual {v0}, La/l5c;->I0()La/v7c;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-virtual {v0}, La/v7c;->x()V

    .line 620
    .line 621
    .line 622
    goto :goto_6

    .line 623
    :cond_13
    invoke-virtual {v0}, La/l5c;->G0()La/ii;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 628
    .line 629
    const v3, 0x7f1303fb

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    const v4, 0x7f13018f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    const v5, 0x7f130ec2

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v5

    .line 650
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    const v6, 0x7f13032f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    sget-object v11, La/n12;->a:La/n12;

    .line 661
    .line 662
    const/4 v12, 0x0

    .line 663
    const/16 v13, 0x5d0

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    const-string v8, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 667
    .line 668
    const/4 v9, 0x0

    .line 669
    const/4 v10, 0x0

    .line 670
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v1, v2, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 681
    .line 682
    .line 683
    :goto_6
    return-void

    .line 684
    :pswitch_9
    check-cast v0, La/gk7;

    .line 685
    .line 686
    move-object/from16 v1, p1

    .line 687
    .line 688
    check-cast v1, Lkotlin/Unit;

    .line 689
    .line 690
    sget-object v1, La/gk7;->U1:La/kl5;

    .line 691
    .line 692
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    if-eqz v1, :cond_14

    .line 701
    .line 702
    invoke-virtual {v0}, La/gk7;->I0()La/k3t0;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    const-class v1, La/gk7;

    .line 707
    .line 708
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    new-instance v2, La/kj7;

    .line 713
    .line 714
    invoke-direct {v2, v1}, La/kj7;-><init>(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    :cond_14
    return-void

    .line 721
    :pswitch_a
    check-cast v0, La/wa7;

    .line 722
    .line 723
    move-object/from16 v1, p1

    .line 724
    .line 725
    check-cast v1, Lkotlin/Unit;

    .line 726
    .line 727
    sget-object v1, La/wa7;->U1:La/kj5;

    .line 728
    .line 729
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 734
    .line 735
    .line 736
    move-result v1

    .line 737
    if-eqz v1, :cond_15

    .line 738
    .line 739
    invoke-virtual {v0}, La/wa7;->I0()La/k3t0;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sget-object v1, La/ka7;->a:La/ka7;

    .line 744
    .line 745
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    :cond_15
    return-void

    .line 749
    :pswitch_b
    check-cast v0, La/q47;

    .line 750
    .line 751
    move-object/from16 v1, p1

    .line 752
    .line 753
    check-cast v1, Lkotlin/Unit;

    .line 754
    .line 755
    sget-object v1, La/q47;->U1:La/gl5;

    .line 756
    .line 757
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-static {v1}, La/sj3;->L(Landroid/content/Context;)Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    if-eqz v1, :cond_16

    .line 766
    .line 767
    invoke-virtual {v0}, La/q47;->I0()La/k3t0;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    new-instance v1, La/d37;

    .line 772
    .line 773
    const-class v2, La/q47;

    .line 774
    .line 775
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    invoke-direct {v1, v2}, La/d37;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    :cond_16
    return-void

    .line 786
    :pswitch_c
    check-cast v0, La/tu5;

    .line 787
    .line 788
    move-object/from16 v1, p1

    .line 789
    .line 790
    check-cast v1, Ljava/lang/Boolean;

    .line 791
    .line 792
    sget-object v2, La/tu5;->V1:La/yk5;

    .line 793
    .line 794
    invoke-virtual {v0}, La/tu5;->H0()La/wu5;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    iget-object v2, v2, La/wu5;->c:La/vzg0;

    .line 799
    .line 800
    const-string v3, "KEY_CAMERA_PERMISSION_REQUESTED"

    .line 801
    .line 802
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 803
    .line 804
    invoke-virtual {v2, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    if-eqz v1, :cond_17

    .line 812
    .line 813
    invoke-virtual {v0}, La/tu5;->G0()La/iyq;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    iget-object v0, v0, La/iyq;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    .line 818
    .line 819
    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->e()V

    .line 820
    .line 821
    .line 822
    goto :goto_7

    .line 823
    :cond_17
    invoke-virtual {v0}, La/tu5;->H0()La/wu5;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {v0}, La/wu5;->x()V

    .line 828
    .line 829
    .line 830
    :goto_7
    return-void

    .line 831
    :pswitch_d
    check-cast v0, La/dm3;

    .line 832
    .line 833
    move-object/from16 v1, p1

    .line 834
    .line 835
    check-cast v1, Landroidx/activity/result/ActivityResult;

    .line 836
    .line 837
    sget-object v1, La/dm3;->U1:La/qek0;

    .line 838
    .line 839
    invoke-virtual {v0}, La/dm3;->G0()V

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :pswitch_data_0
    .packed-switch 0x0
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
