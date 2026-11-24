.class public final synthetic La/uki0;
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
    iput-byte p7, p0, La/uki0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final Q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/o1j0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, La/op9;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, La/ofj0;

    .line 14
    .line 15
    sget-object v1, La/ofj0;->X1:La/cge0;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of v1, v0, La/n1j0;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v2, La/ofj0;->K1:La/rqj0;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v3}, La/rqj0;->b(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, La/ofj0;->H0()La/k3t0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, La/qyi0;->a:La/qyi0;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_0
    const-string v0, "shortCutManager"

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v4

    .line 53
    :cond_1
    instance-of v1, v0, La/p0j0;

    .line 54
    .line 55
    const/4 v5, 0x3

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 59
    .line 60
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, La/z8b0;

    .line 65
    .line 66
    const/16 v3, 0x13

    .line 67
    .line 68
    invoke-direct {v1, v2, v4, v3}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v4, v4, v1, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    goto/16 :goto_1

    .line 75
    .line 76
    :cond_2
    instance-of v1, v0, La/s0j0;

    .line 77
    .line 78
    const-string v6, "logoutDialogFactory"

    .line 79
    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, v2, La/ofj0;->N1:La/ux00;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-static {}, La/ux00;->a()La/tx00;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, La/j120;->h0(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_3
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v4

    .line 117
    :cond_4
    instance-of v1, v0, La/e1j0;

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const v8, 0x7f13032f

    .line 121
    .line 122
    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v1, v2, La/ofj0;->N1:La/ux00;

    .line 130
    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    const v1, 0x7f1307f8

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const v1, 0x7f1307f7

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    invoke-virtual {v2, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    sget-object v18, La/n12;->a:La/n12;

    .line 159
    .line 160
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 161
    .line 162
    const/16 v19, 0x0

    .line 163
    .line 164
    const/16 v20, 0x5c2

    .line 165
    .line 166
    const/4 v11, 0x0

    .line 167
    const-string v15, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 168
    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 174
    .line 175
    .line 176
    sget-object v1, La/tx00;->l2:La/evz;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {v9, v7, v3, v3}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v3}, La/kxq;->r()La/v1r;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v0, v1, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_1

    .line 197
    .line 198
    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v4

    .line 202
    :cond_6
    instance-of v1, v0, La/v0j0;

    .line 203
    .line 204
    if-eqz v1, :cond_7

    .line 205
    .line 206
    invoke-virtual {v2}, La/ofj0;->H0()La/k3t0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    new-instance v1, La/fyi0;

    .line 211
    .line 212
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :cond_7
    instance-of v1, v0, La/a1j0;

    .line 221
    .line 222
    const v3, 0x7f1301a0

    .line 223
    .line 224
    .line 225
    if-eqz v1, :cond_8

    .line 226
    .line 227
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    const v1, 0x7f130bab

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v0, v1}, La/ofj0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :cond_8
    instance-of v1, v0, La/g1j0;

    .line 250
    .line 251
    if-eqz v1, :cond_9

    .line 252
    .line 253
    const v0, 0x7f130dca

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    const v1, 0x7f130437

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v0, v1}, La/ofj0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_9
    instance-of v1, v0, La/h1j0;

    .line 279
    .line 280
    const v6, 0x7f130e5d

    .line 281
    .line 282
    .line 283
    const v9, 0x7f1303fb

    .line 284
    .line 285
    .line 286
    if-eqz v1, :cond_a

    .line 287
    .line 288
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 293
    .line 294
    invoke-virtual {v2, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    const v1, 0x7f130f23

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    sget-object v19, La/n12;->b:La/n12;

    .line 317
    .line 318
    const/16 v20, 0x0

    .line 319
    .line 320
    const/16 v21, 0x5d0

    .line 321
    .line 322
    const/4 v15, 0x0

    .line 323
    const-string v16, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY"

    .line 324
    .line 325
    const/16 v17, 0x0

    .line 326
    .line 327
    const/16 v18, 0x0

    .line 328
    .line 329
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 340
    .line 341
    .line 342
    goto/16 :goto_1

    .line 343
    .line 344
    :cond_a
    instance-of v1, v0, La/l1j0;

    .line 345
    .line 346
    if-eqz v1, :cond_b

    .line 347
    .line 348
    sget-object v0, La/iz80;->g2:La/nh70;

    .line 349
    .line 350
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {v1}, La/nh70;->l(Landroidx/fragment/app/e;)V

    .line 361
    .line 362
    .line 363
    goto/16 :goto_1

    .line 364
    .line 365
    :cond_b
    instance-of v1, v0, La/m1j0;

    .line 366
    .line 367
    if-eqz v1, :cond_d

    .line 368
    .line 369
    check-cast v0, La/m1j0;

    .line 370
    .line 371
    iget-boolean v0, v0, La/m1j0;->a:Z

    .line 372
    .line 373
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 378
    .line 379
    invoke-virtual {v2, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v11

    .line 383
    if-eqz v0, :cond_c

    .line 384
    .line 385
    const v0, 0x7f130ec1

    .line 386
    .line 387
    .line 388
    goto :goto_0

    .line 389
    :cond_c
    const v0, 0x7f130ec3

    .line 390
    .line 391
    .line 392
    :goto_0
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v12

    .line 396
    const v0, 0x7f130ebb

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v14

    .line 410
    sget-object v19, La/n12;->a:La/n12;

    .line 411
    .line 412
    const/16 v20, 0x0

    .line 413
    .line 414
    const/16 v21, 0x5d0

    .line 415
    .line 416
    const/4 v15, 0x0

    .line 417
    const-string v16, "REQUEST_OPEN_SITE_DIALOG_KEY"

    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    const/16 v18, 0x0

    .line 422
    .line 423
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v10, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_1

    .line 437
    .line 438
    :cond_d
    instance-of v1, v0, La/x0j0;

    .line 439
    .line 440
    if-eqz v1, :cond_e

    .line 441
    .line 442
    check-cast v0, La/x0j0;

    .line 443
    .line 444
    iget-object v0, v0, La/x0j0;->a:Ljava/lang/String;

    .line 445
    .line 446
    new-instance v1, Landroid/content/Intent;

    .line 447
    .line 448
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 449
    .line 450
    .line 451
    const-string v3, "android.intent.action.SEND"

    .line 452
    .line 453
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 454
    .line 455
    .line 456
    const-string v3, "android.intent.extra.TEXT"

    .line 457
    .line 458
    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 459
    .line 460
    .line 461
    const-string v0, "text/plain"

    .line 462
    .line 463
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 464
    .line 465
    .line 466
    invoke-static {v1, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_1

    .line 474
    .line 475
    :cond_e
    instance-of v1, v0, La/r0j0;

    .line 476
    .line 477
    if-eqz v1, :cond_f

    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-eqz v0, :cond_24

    .line 484
    .line 485
    new-instance v1, Landroid/content/Intent;

    .line 486
    .line 487
    const-string v3, "android.settings.DATE_SETTINGS"

    .line 488
    .line 489
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_1

    .line 496
    .line 497
    :cond_f
    instance-of v1, v0, La/o0j0;

    .line 498
    .line 499
    if-eqz v1, :cond_10

    .line 500
    .line 501
    check-cast v0, La/o0j0;

    .line 502
    .line 503
    iget-boolean v0, v0, La/o0j0;->a:Z

    .line 504
    .line 505
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 506
    .line 507
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    new-instance v3, La/a220;

    .line 512
    .line 513
    const/16 v6, 0x1a

    .line 514
    .line 515
    invoke-direct {v3, v2, v0, v4, v6}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 516
    .line 517
    .line 518
    invoke-static {v1, v4, v4, v3, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 519
    .line 520
    .line 521
    goto/16 :goto_1

    .line 522
    .line 523
    :cond_10
    instance-of v1, v0, La/i1j0;

    .line 524
    .line 525
    if-eqz v1, :cond_11

    .line 526
    .line 527
    check-cast v0, La/i1j0;

    .line 528
    .line 529
    iget-object v9, v0, La/i1j0;->a:Ljava/lang/String;

    .line 530
    .line 531
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 536
    .line 537
    const v1, 0x7f1307bb

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v8

    .line 544
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v10

    .line 548
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    sget-object v16, La/n12;->b:La/n12;

    .line 552
    .line 553
    const/16 v17, 0x0

    .line 554
    .line 555
    const/16 v18, 0x5f8

    .line 556
    .line 557
    const/4 v11, 0x0

    .line 558
    const/4 v12, 0x0

    .line 559
    const/4 v13, 0x0

    .line 560
    const/4 v14, 0x0

    .line 561
    const/4 v15, 0x0

    .line 562
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_1

    .line 576
    .line 577
    :cond_11
    instance-of v1, v0, La/j1j0;

    .line 578
    .line 579
    if-eqz v1, :cond_12

    .line 580
    .line 581
    check-cast v0, La/j1j0;

    .line 582
    .line 583
    iget-object v0, v0, La/j1j0;->a:Ljava/lang/String;

    .line 584
    .line 585
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v1, v0}, La/ofj0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_1

    .line 596
    .line 597
    :cond_12
    instance-of v1, v0, La/f1j0;

    .line 598
    .line 599
    if-eqz v1, :cond_14

    .line 600
    .line 601
    check-cast v0, La/f1j0;

    .line 602
    .line 603
    iget-object v0, v0, La/f1j0;->a:La/vvi0;

    .line 604
    .line 605
    iget-object v1, v2, La/ofj0;->V1:La/qgd;

    .line 606
    .line 607
    if-eqz v1, :cond_13

    .line 608
    .line 609
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    const v4, 0x7f13002d

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    new-instance v5, La/x6h0;

    .line 624
    .line 625
    const/16 v6, 0x14

    .line 626
    .line 627
    invoke-direct {v5, v2, v0, v6}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    const v6, 0x7f040b73

    .line 635
    .line 636
    .line 637
    const/4 v8, 0x6

    .line 638
    invoke-static {v0, v6, v8}, La/m5d;->g(Landroid/content/Context;II)I

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    invoke-static {v6, v0}, La/m5d;->e(ILandroid/content/Context;)Landroid/content/res/Resources$Theme;

    .line 643
    .line 644
    .line 645
    move-result-object v6

    .line 646
    const v8, 0x7f040afc

    .line 647
    .line 648
    .line 649
    invoke-static {v0, v8, v7, v6}, La/m5d;->f(Landroid/content/Context;IZLandroid/content/res/Resources$Theme;)I

    .line 650
    .line 651
    .line 652
    invoke-virtual {v1, v3, v4, v5}, La/qgd;->Y(La/kxq;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 653
    .line 654
    .line 655
    goto/16 :goto_1

    .line 656
    .line 657
    :cond_13
    const-string v0, "settingsNavigator"

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    throw v4

    .line 663
    :cond_14
    instance-of v1, v0, La/c1j0;

    .line 664
    .line 665
    if-eqz v1, :cond_16

    .line 666
    .line 667
    check-cast v0, La/c1j0;

    .line 668
    .line 669
    iget-object v0, v0, La/c1j0;->a:La/d7a;

    .line 670
    .line 671
    iget-object v1, v2, La/ofj0;->M1:La/gl5;

    .line 672
    .line 673
    if-eqz v1, :cond_15

    .line 674
    .line 675
    const v1, 0x7f131288

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    const-string v3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 686
    .line 687
    invoke-static {v2, v3, v0, v1}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    goto/16 :goto_1

    .line 691
    .line 692
    :cond_15
    const-string v0, "captchaDialogDelegate"

    .line 693
    .line 694
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    throw v4

    .line 698
    :cond_16
    instance-of v1, v0, La/q0j0;

    .line 699
    .line 700
    const-string v3, "snackbarManager"

    .line 701
    .line 702
    if-eqz v1, :cond_18

    .line 703
    .line 704
    check-cast v0, La/q0j0;

    .line 705
    .line 706
    iget-object v0, v0, La/q0j0;->a:Ljava/lang/String;

    .line 707
    .line 708
    move-object v1, v3

    .line 709
    iget-object v3, v2, La/ofj0;->P1:La/wdk0;

    .line 710
    .line 711
    if-eqz v3, :cond_17

    .line 712
    .line 713
    invoke-static {v0, v7}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    const v0, 0x7f130671

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v6

    .line 731
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    const/4 v9, 0x0

    .line 735
    const/16 v10, 0x70

    .line 736
    .line 737
    const-string v4, ""

    .line 738
    .line 739
    const/4 v7, 0x0

    .line 740
    const/4 v8, 0x0

    .line 741
    invoke-static/range {v2 .. v10}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 742
    .line 743
    .line 744
    goto/16 :goto_1

    .line 745
    .line 746
    :cond_17
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    throw v4

    .line 750
    :cond_18
    move-object v1, v3

    .line 751
    instance-of v3, v0, La/u0j0;

    .line 752
    .line 753
    if-eqz v3, :cond_19

    .line 754
    .line 755
    check-cast v0, La/u0j0;

    .line 756
    .line 757
    iget-object v0, v0, La/u0j0;->a:Ljava/lang/String;

    .line 758
    .line 759
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    invoke-static {v1, v0}, La/vic;->C(Landroid/content/Context;Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    goto/16 :goto_1

    .line 767
    .line 768
    :cond_19
    instance-of v3, v0, La/w0j0;

    .line 769
    .line 770
    if-eqz v3, :cond_1b

    .line 771
    .line 772
    iget-object v0, v2, La/ofj0;->W1:La/xi70;

    .line 773
    .line 774
    if-eqz v0, :cond_1a

    .line 775
    .line 776
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    invoke-static {v0}, La/xi70;->i(Landroidx/fragment/app/e;)V

    .line 784
    .line 785
    .line 786
    goto/16 :goto_1

    .line 787
    .line 788
    :cond_1a
    const-string v0, "quickBetDialogNavigator"

    .line 789
    .line 790
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    throw v4

    .line 794
    :cond_1b
    instance-of v3, v0, La/y0j0;

    .line 795
    .line 796
    if-eqz v3, :cond_1c

    .line 797
    .line 798
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    const v1, 0x7f13069d

    .line 803
    .line 804
    .line 805
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v10

    .line 809
    const v1, 0x7f13069c

    .line 810
    .line 811
    .line 812
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v11

    .line 816
    invoke-virtual {v2, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v12

    .line 820
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    const v1, 0x7f131151

    .line 824
    .line 825
    .line 826
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v13

    .line 830
    sget-object v18, La/n12;->b:La/n12;

    .line 831
    .line 832
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 833
    .line 834
    const/16 v19, 0x0

    .line 835
    .line 836
    const/16 v20, 0x5d0

    .line 837
    .line 838
    const/4 v14, 0x0

    .line 839
    const-string v15, "REQUEST_DELETE_ACCOUNT"

    .line 840
    .line 841
    const/16 v16, 0x0

    .line 842
    .line 843
    const/16 v17, 0x0

    .line 844
    .line 845
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 856
    .line 857
    .line 858
    goto/16 :goto_1

    .line 859
    .line 860
    :cond_1c
    sget-object v3, La/b1j0;->a:La/b1j0;

    .line 861
    .line 862
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v3

    .line 866
    if-nez v3, :cond_24

    .line 867
    .line 868
    instance-of v3, v0, La/z0j0;

    .line 869
    .line 870
    if-eqz v3, :cond_1d

    .line 871
    .line 872
    check-cast v0, La/z0j0;

    .line 873
    .line 874
    iget-object v0, v0, La/z0j0;->a:Ljava/lang/String;

    .line 875
    .line 876
    invoke-virtual {v2}, La/ofj0;->G0()La/ii;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 881
    .line 882
    const v3, 0x7f1305c1

    .line 883
    .line 884
    .line 885
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v10

    .line 889
    new-instance v11, Landroid/text/SpannableString;

    .line 890
    .line 891
    invoke-static {v0, v7}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    invoke-direct {v11, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 899
    .line 900
    .line 901
    const v0, 0x7f1304ff

    .line 902
    .line 903
    .line 904
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v12

    .line 908
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v2, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v13

    .line 915
    sget-object v18, La/n12;->a:La/n12;

    .line 916
    .line 917
    const/16 v19, 0x0

    .line 918
    .line 919
    const/16 v20, 0x5d0

    .line 920
    .line 921
    const/4 v14, 0x0

    .line 922
    const-string v15, "REQUEST_APP_INFO_DIALOG_KEY"

    .line 923
    .line 924
    const/16 v16, 0x0

    .line 925
    .line 926
    const/16 v17, 0x0

    .line 927
    .line 928
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v1, v9, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 939
    .line 940
    .line 941
    goto :goto_1

    .line 942
    :cond_1d
    instance-of v3, v0, La/k1j0;

    .line 943
    .line 944
    if-eqz v3, :cond_1f

    .line 945
    .line 946
    check-cast v0, La/k1j0;

    .line 947
    .line 948
    iget-object v7, v0, La/k1j0;->a:Ljava/lang/String;

    .line 949
    .line 950
    move-object v3, v4

    .line 951
    move-object v4, v2

    .line 952
    iget-object v2, v4, La/ofj0;->P1:La/wdk0;

    .line 953
    .line 954
    if-eqz v2, :cond_1e

    .line 955
    .line 956
    new-instance v3, La/xdk0;

    .line 957
    .line 958
    sget-object v6, La/rek0;->b:La/rek0;

    .line 959
    .line 960
    const/4 v11, 0x0

    .line 961
    const/16 v12, 0x7c

    .line 962
    .line 963
    const/4 v8, 0x0

    .line 964
    const/4 v9, 0x0

    .line 965
    const/4 v10, 0x0

    .line 966
    move-object v5, v3

    .line 967
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 968
    .line 969
    .line 970
    const/16 v9, 0x3fc

    .line 971
    .line 972
    const/4 v5, 0x0

    .line 973
    const/4 v6, 0x0

    .line 974
    const/4 v7, 0x0

    .line 975
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 976
    .line 977
    .line 978
    move-object v2, v4

    .line 979
    goto :goto_1

    .line 980
    :cond_1e
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    throw v3

    .line 984
    :cond_1f
    move-object v3, v4

    .line 985
    sget-object v1, La/t0j0;->a:La/t0j0;

    .line 986
    .line 987
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move-result v1

    .line 991
    if-eqz v1, :cond_21

    .line 992
    .line 993
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    if-eqz v0, :cond_24

    .line 998
    .line 999
    iget-object v0, v2, La/ofj0;->Q1:La/zav;

    .line 1000
    .line 1001
    if-eqz v0, :cond_20

    .line 1002
    .line 1003
    goto :goto_1

    .line 1004
    :cond_20
    const-string v0, "consentManager"

    .line 1005
    .line 1006
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    throw v3

    .line 1010
    :cond_21
    sget-object v1, La/d1j0;->a:La/d1j0;

    .line 1011
    .line 1012
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    if-eqz v0, :cond_23

    .line 1017
    .line 1018
    iget-object v0, v2, La/ofj0;->O1:La/nwd;

    .line 1019
    .line 1020
    if-eqz v0, :cond_22

    .line 1021
    .line 1022
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    invoke-static {v0}, La/nwd;->g(Landroidx/fragment/app/e;)V

    .line 1030
    .line 1031
    .line 1032
    goto :goto_1

    .line 1033
    :cond_22
    const-string v0, "confirmChooseLanguageDialogFactory"

    .line 1034
    .line 1035
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    throw v3

    .line 1039
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1040
    .line 1041
    .line 1042
    return-object v3

    .line 1043
    :cond_24
    :goto_1
    invoke-virtual {v2}, La/ofj0;->H0()La/k3t0;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    sget-object v1, La/dyi0;->a:La/dyi0;

    .line 1048
    .line 1049
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1050
    .line 1051
    .line 1052
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1053
    .line 1054
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uki0;->a:B

    .line 4
    .line 5
    const v6, 0x7f130bab

    .line 6
    .line 7
    .line 8
    const v7, 0x7f1307f7

    .line 9
    .line 10
    .line 11
    const v8, 0x7f1307f8

    .line 12
    .line 13
    .line 14
    const v9, 0x7f1304ff

    .line 15
    .line 16
    .line 17
    const v10, 0x7f1305c1

    .line 18
    .line 19
    .line 20
    const-string v11, "shortCutManager"

    .line 21
    .line 22
    const v12, 0x7f13032f

    .line 23
    .line 24
    .line 25
    const v14, 0x7f1301a0

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    const-string v17, "snackbarManager"

    .line 30
    .line 31
    const-string v18, "logoutDialogFactory"

    .line 32
    .line 33
    const-string v13, "android.intent.action.SEND"

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v15, 0x0

    .line 37
    const/4 v4, 0x6

    .line 38
    const/4 v5, 0x0

    .line 39
    packed-switch v1, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Ljava/lang/Throwable;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, La/duj;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    move-object/from16 v1, p1

    .line 60
    .line 61
    check-cast v1, Ljava/lang/Throwable;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/duj;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_1
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, Ljava/lang/Throwable;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/eoj0;

    .line 86
    .line 87
    iget-object v0, v0, La/eoj0;->y:La/duj;

    .line 88
    .line 89
    new-instance v2, La/ogj0;

    .line 90
    .line 91
    invoke-direct {v2, v4}, La/ogj0;-><init>(B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_2
    move-object/from16 v1, p1

    .line 101
    .line 102
    check-cast v1, Ljava/lang/Throwable;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, La/eoj0;

    .line 110
    .line 111
    iget-object v2, v0, La/eoj0;->y:La/duj;

    .line 112
    .line 113
    new-instance v3, La/znj0;

    .line 114
    .line 115
    invoke-direct {v3, v0, v15}, La/znj0;-><init>(La/eoj0;B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_3
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, Ljava/lang/Throwable;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, La/eoj0;

    .line 134
    .line 135
    iget-object v2, v0, La/eoj0;->y:La/duj;

    .line 136
    .line 137
    new-instance v4, La/znj0;

    .line 138
    .line 139
    invoke-direct {v4, v0, v3}, La/znj0;-><init>(La/eoj0;B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_4
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, Ljava/lang/Throwable;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, La/eoj0;

    .line 158
    .line 159
    iget-object v0, v0, La/eoj0;->y:La/duj;

    .line 160
    .line 161
    new-instance v2, La/ogj0;

    .line 162
    .line 163
    invoke-direct {v2, v4}, La/ogj0;-><init>(B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_5
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, La/mmj0;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, La/k3t0;

    .line 182
    .line 183
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_6
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, Ljava/lang/Throwable;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 197
    .line 198
    move-object v1, v0

    .line 199
    check-cast v1, La/bmj0;

    .line 200
    .line 201
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 202
    .line 203
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 204
    .line 205
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 213
    .line 214
    move-object v4, v0

    .line 215
    check-cast v4, La/vlj0;

    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    const/4 v9, 0x1

    .line 221
    const/16 v10, 0x2f

    .line 222
    .line 223
    const/4 v5, 0x0

    .line 224
    const/4 v6, 0x0

    .line 225
    const/4 v7, 0x0

    .line 226
    const/4 v8, 0x0

    .line 227
    invoke-static/range {v4 .. v10}, La/vlj0;->a(La/vlj0;ILa/zvh0;Ljava/util/List;ZZI)La/vlj0;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_0

    .line 236
    .line 237
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_7
    move-object/from16 v1, p1

    .line 241
    .line 242
    check-cast v1, La/olj0;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, La/k3t0;

    .line 250
    .line 251
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_8
    move-object/from16 v1, p1

    .line 258
    .line 259
    check-cast v1, La/olj0;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, La/k3t0;

    .line 267
    .line 268
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_9
    move-object/from16 v1, p1

    .line 275
    .line 276
    check-cast v1, La/olj0;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, La/k3t0;

    .line 284
    .line 285
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_a
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, La/ulj0;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 299
    .line 300
    move-object v2, v0

    .line 301
    check-cast v2, La/rlj0;

    .line 302
    .line 303
    sget-object v0, La/rlj0;->O1:La/eke0;

    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iget-object v0, v1, La/ulj0;->a:Landroid/graphics/Bitmap;

    .line 309
    .line 310
    const-string v1, "org.xbet.client1.provider"

    .line 311
    .line 312
    const-string v3, "app_qr_image_"

    .line 313
    .line 314
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 315
    .line 316
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    sget-object v7, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v6, v7}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 327
    .line 328
    .line 329
    move-result-wide v7

    .line 330
    new-instance v9, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v3, ".png"

    .line 339
    .line 340
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-direct {v4, v6, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    new-instance v3, Ljava/io/FileOutputStream;

    .line 351
    .line 352
    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    .line 354
    .line 355
    :try_start_1
    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 356
    .line 357
    const/16 v7, 0x64

    .line 358
    .line 359
    invoke-virtual {v0, v6, v7, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 360
    .line 361
    .line 362
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v0, v4, v1}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 370
    .line 371
    .line 372
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 373
    goto :goto_1

    .line 374
    :catch_0
    move-exception v0

    .line 375
    goto :goto_0

    .line 376
    :catchall_0
    move-exception v0

    .line 377
    move-object v1, v0

    .line 378
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 379
    :catchall_1
    move-exception v0

    .line 380
    :try_start_4
    invoke-static {v3, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 384
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 385
    .line 386
    .line 387
    move-object v0, v5

    .line 388
    :goto_1
    if-eqz v0, :cond_1

    .line 389
    .line 390
    new-instance v1, Landroid/content/Intent;

    .line 391
    .line 392
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 396
    .line 397
    .line 398
    const-string v3, "android.intent.extra.STREAM"

    .line 399
    .line 400
    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 401
    .line 402
    .line 403
    const-string v0, "image/png"

    .line 404
    .line 405
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 406
    .line 407
    .line 408
    invoke-static {v1, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 413
    .line 414
    .line 415
    :cond_1
    iget-object v0, v2, La/rlj0;->N1:La/a8z;

    .line 416
    .line 417
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, La/k3t0;

    .line 422
    .line 423
    sget-object v1, La/hlj0;->a:La/hlj0;

    .line 424
    .line 425
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_b
    move-object/from16 v1, p1

    .line 432
    .line 433
    check-cast v1, Ljava/lang/Throwable;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v0, La/rjo;

    .line 441
    .line 442
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 443
    .line 444
    .line 445
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 446
    .line 447
    return-object v0

    .line 448
    :pswitch_c
    move-object/from16 v1, p1

    .line 449
    .line 450
    check-cast v1, Ljava/lang/Throwable;

    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v0, La/rjo;

    .line 458
    .line 459
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 460
    .line 461
    .line 462
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_d
    move-object/from16 v1, p1

    .line 466
    .line 467
    check-cast v1, La/czi0;

    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, La/k3t0;

    .line 475
    .line 476
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    return-object v0

    .line 482
    :pswitch_e
    invoke-direct/range {p0 .. p1}, La/uki0;->Q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    return-object v0

    .line 487
    :pswitch_f
    move-object/from16 v1, p1

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Throwable;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v0, La/rjo;

    .line 497
    .line 498
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 499
    .line 500
    .line 501
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    return-object v0

    .line 504
    :pswitch_10
    move-object/from16 v1, p1

    .line 505
    .line 506
    check-cast v1, Ljava/lang/Throwable;

    .line 507
    .line 508
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, La/rjo;

    .line 514
    .line 515
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 516
    .line 517
    .line 518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_11
    move-object/from16 v1, p1

    .line 522
    .line 523
    check-cast v1, Ljava/lang/Throwable;

    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v0, La/rjo;

    .line 531
    .line 532
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_12
    move-object/from16 v1, p1

    .line 539
    .line 540
    check-cast v1, Ljava/lang/Throwable;

    .line 541
    .line 542
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v0, La/rjo;

    .line 548
    .line 549
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 553
    .line 554
    return-object v0

    .line 555
    :pswitch_13
    move-object/from16 v1, p1

    .line 556
    .line 557
    check-cast v1, La/lbj0;

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, La/k3t0;

    .line 565
    .line 566
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_14
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, La/scj0;

    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v0, La/qbj0;

    .line 582
    .line 583
    sget-object v24, La/qbj0;->Z1:La/lme0;

    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    instance-of v4, v1, La/rcj0;

    .line 589
    .line 590
    if-eqz v4, :cond_3

    .line 591
    .line 592
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 593
    .line 594
    .line 595
    iget-object v1, v0, La/qbj0;->M1:La/rqj0;

    .line 596
    .line 597
    if-eqz v1, :cond_2

    .line 598
    .line 599
    invoke-virtual {v1, v3}, La/rqj0;->b(Z)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, La/qbj0;->H0()La/k3t0;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    sget-object v2, La/raj0;->a:La/raj0;

    .line 607
    .line 608
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    goto/16 :goto_3

    .line 612
    .line 613
    :cond_2
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    throw v5

    .line 617
    :cond_3
    instance-of v4, v1, La/sbj0;

    .line 618
    .line 619
    if-eqz v4, :cond_4

    .line 620
    .line 621
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 622
    .line 623
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    new-instance v3, La/z8b0;

    .line 628
    .line 629
    const/16 v4, 0x12

    .line 630
    .line 631
    invoke-direct {v3, v0, v5, v4}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 632
    .line 633
    .line 634
    invoke-static {v1, v5, v5, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 635
    .line 636
    .line 637
    goto/16 :goto_3

    .line 638
    .line 639
    :cond_4
    instance-of v4, v1, La/ccj0;

    .line 640
    .line 641
    if-eqz v4, :cond_5

    .line 642
    .line 643
    check-cast v1, La/ccj0;

    .line 644
    .line 645
    iget-object v1, v1, La/ccj0;->a:Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 652
    .line 653
    invoke-virtual {v0, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v17

    .line 657
    new-instance v3, Landroid/text/SpannableString;

    .line 658
    .line 659
    invoke-static {v1, v15}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    invoke-direct {v3, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v19

    .line 673
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v20

    .line 680
    sget-object v25, La/n12;->a:La/n12;

    .line 681
    .line 682
    const/16 v26, 0x0

    .line 683
    .line 684
    const/16 v27, 0x5d0

    .line 685
    .line 686
    const/16 v21, 0x0

    .line 687
    .line 688
    const-string v22, "REQUEST_APP_INFO_DIALOG_KEY"

    .line 689
    .line 690
    const/16 v23, 0x0

    .line 691
    .line 692
    const/16 v24, 0x0

    .line 693
    .line 694
    move-object/from16 v18, v3

    .line 695
    .line 696
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 697
    .line 698
    .line 699
    move-object/from16 v1, v16

    .line 700
    .line 701
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 709
    .line 710
    .line 711
    goto/16 :goto_3

    .line 712
    .line 713
    :cond_5
    instance-of v4, v1, La/ocj0;

    .line 714
    .line 715
    if-eqz v4, :cond_7

    .line 716
    .line 717
    check-cast v1, La/ocj0;

    .line 718
    .line 719
    iget-object v8, v1, La/ocj0;->a:Ljava/lang/String;

    .line 720
    .line 721
    iget-object v1, v0, La/qbj0;->R1:La/wdk0;

    .line 722
    .line 723
    if-eqz v1, :cond_6

    .line 724
    .line 725
    new-instance v6, La/xdk0;

    .line 726
    .line 727
    sget-object v7, La/rek0;->b:La/rek0;

    .line 728
    .line 729
    const/4 v12, 0x0

    .line 730
    const/16 v13, 0x7c

    .line 731
    .line 732
    const/4 v9, 0x0

    .line 733
    const/4 v10, 0x0

    .line 734
    const/4 v11, 0x0

    .line 735
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 736
    .line 737
    .line 738
    const/16 v30, 0x0

    .line 739
    .line 740
    const/16 v31, 0x3fc

    .line 741
    .line 742
    const/16 v27, 0x0

    .line 743
    .line 744
    const/16 v28, 0x0

    .line 745
    .line 746
    const/16 v29, 0x0

    .line 747
    .line 748
    move-object/from16 v26, v0

    .line 749
    .line 750
    move-object/from16 v24, v1

    .line 751
    .line 752
    move-object/from16 v25, v6

    .line 753
    .line 754
    invoke-static/range {v24 .. v31}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 755
    .line 756
    .line 757
    goto/16 :goto_3

    .line 758
    .line 759
    :cond_6
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    throw v5

    .line 763
    :cond_7
    instance-of v4, v1, La/vbj0;

    .line 764
    .line 765
    if-eqz v4, :cond_9

    .line 766
    .line 767
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    iget-object v2, v0, La/qbj0;->O1:La/ux00;

    .line 772
    .line 773
    if-eqz v2, :cond_8

    .line 774
    .line 775
    invoke-static {}, La/ux00;->a()La/tx00;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v1, v2, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    invoke-static {v1}, La/j120;->h0(Landroid/content/Context;)V

    .line 794
    .line 795
    .line 796
    goto/16 :goto_3

    .line 797
    .line 798
    :cond_8
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    throw v5

    .line 802
    :cond_9
    instance-of v4, v1, La/icj0;

    .line 803
    .line 804
    if-eqz v4, :cond_b

    .line 805
    .line 806
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    iget-object v2, v0, La/qbj0;->O1:La/ux00;

    .line 811
    .line 812
    if-eqz v2, :cond_a

    .line 813
    .line 814
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v20

    .line 818
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v22

    .line 822
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v24

    .line 829
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v23

    .line 833
    sget-object v28, La/n12;->a:La/n12;

    .line 834
    .line 835
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 836
    .line 837
    const/16 v29, 0x0

    .line 838
    .line 839
    const/16 v30, 0x5c2

    .line 840
    .line 841
    const/16 v21, 0x0

    .line 842
    .line 843
    const-string v25, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 844
    .line 845
    const/16 v26, 0x0

    .line 846
    .line 847
    const/16 v27, 0x0

    .line 848
    .line 849
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 850
    .line 851
    .line 852
    move-object/from16 v2, v19

    .line 853
    .line 854
    sget-object v4, La/tx00;->l2:La/evz;

    .line 855
    .line 856
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-static {v2, v15, v3, v3}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    invoke-virtual {v3}, La/kxq;->r()La/v1r;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    invoke-virtual {v1, v2, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 872
    .line 873
    .line 874
    goto/16 :goto_3

    .line 875
    .line 876
    :cond_a
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    throw v5

    .line 880
    :cond_b
    instance-of v4, v1, La/ybj0;

    .line 881
    .line 882
    if-eqz v4, :cond_c

    .line 883
    .line 884
    invoke-virtual {v0}, La/qbj0;->H0()La/k3t0;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    new-instance v2, La/maj0;

    .line 889
    .line 890
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    goto/16 :goto_3

    .line 897
    .line 898
    :cond_c
    instance-of v4, v1, La/dcj0;

    .line 899
    .line 900
    if-eqz v4, :cond_d

    .line 901
    .line 902
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v0, v1, v2}, La/qbj0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    goto/16 :goto_3

    .line 920
    .line 921
    :cond_d
    instance-of v4, v1, La/kcj0;

    .line 922
    .line 923
    if-eqz v4, :cond_e

    .line 924
    .line 925
    const v4, 0x7f130dca

    .line 926
    .line 927
    .line 928
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    const v2, 0x7f130437

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v0, v1, v2}, La/qbj0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    goto/16 :goto_3

    .line 949
    .line 950
    :cond_e
    instance-of v4, v1, La/lcj0;

    .line 951
    .line 952
    if-eqz v4, :cond_f

    .line 953
    .line 954
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    new-instance v22, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 959
    .line 960
    const v2, 0x7f1303fb

    .line 961
    .line 962
    .line 963
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v23

    .line 967
    const v2, 0x7f130f23

    .line 968
    .line 969
    .line 970
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v24

    .line 974
    const v2, 0x7f130e5d

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v25

    .line 981
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v26

    .line 988
    sget-object v31, La/n12;->b:La/n12;

    .line 989
    .line 990
    const/16 v32, 0x0

    .line 991
    .line 992
    const/16 v33, 0x5d0

    .line 993
    .line 994
    const/16 v27, 0x0

    .line 995
    .line 996
    const-string v28, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY"

    .line 997
    .line 998
    const/16 v29, 0x0

    .line 999
    .line 1000
    const/16 v30, 0x0

    .line 1001
    .line 1002
    invoke-direct/range {v22 .. v33}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1003
    .line 1004
    .line 1005
    move-object/from16 v2, v22

    .line 1006
    .line 1007
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v3

    .line 1011
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1015
    .line 1016
    .line 1017
    goto/16 :goto_3

    .line 1018
    .line 1019
    :cond_f
    instance-of v4, v1, La/pcj0;

    .line 1020
    .line 1021
    if-eqz v4, :cond_10

    .line 1022
    .line 1023
    sget-object v1, La/iz80;->g2:La/nh70;

    .line 1024
    .line 1025
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1033
    .line 1034
    .line 1035
    invoke-static {v2}, La/nh70;->l(Landroidx/fragment/app/e;)V

    .line 1036
    .line 1037
    .line 1038
    goto/16 :goto_3

    .line 1039
    .line 1040
    :cond_10
    instance-of v4, v1, La/qcj0;

    .line 1041
    .line 1042
    if-eqz v4, :cond_12

    .line 1043
    .line 1044
    check-cast v1, La/qcj0;

    .line 1045
    .line 1046
    iget-boolean v1, v1, La/qcj0;->a:Z

    .line 1047
    .line 1048
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    new-instance v22, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1053
    .line 1054
    const v3, 0x7f1303fb

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v23

    .line 1061
    if-eqz v1, :cond_11

    .line 1062
    .line 1063
    const v1, 0x7f130ec1

    .line 1064
    .line 1065
    .line 1066
    goto :goto_2

    .line 1067
    :cond_11
    const v1, 0x7f130ec3

    .line 1068
    .line 1069
    .line 1070
    :goto_2
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v24

    .line 1074
    const v1, 0x7f130ebb

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v25

    .line 1081
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v26

    .line 1088
    sget-object v31, La/n12;->a:La/n12;

    .line 1089
    .line 1090
    const/16 v32, 0x0

    .line 1091
    .line 1092
    const/16 v33, 0x5d0

    .line 1093
    .line 1094
    const/16 v27, 0x0

    .line 1095
    .line 1096
    const-string v28, "REQUEST_OPEN_SITE_DIALOG_KEY"

    .line 1097
    .line 1098
    const/16 v29, 0x0

    .line 1099
    .line 1100
    const/16 v30, 0x0

    .line 1101
    .line 1102
    invoke-direct/range {v22 .. v33}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1103
    .line 1104
    .line 1105
    move-object/from16 v1, v22

    .line 1106
    .line 1107
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v3

    .line 1111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1115
    .line 1116
    .line 1117
    goto/16 :goto_3

    .line 1118
    .line 1119
    :cond_12
    instance-of v4, v1, La/acj0;

    .line 1120
    .line 1121
    if-eqz v4, :cond_13

    .line 1122
    .line 1123
    check-cast v1, La/acj0;

    .line 1124
    .line 1125
    iget-object v1, v1, La/acj0;->a:Ljava/lang/String;

    .line 1126
    .line 1127
    new-instance v2, Landroid/content/Intent;

    .line 1128
    .line 1129
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v2, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1133
    .line 1134
    .line 1135
    const-string v3, "android.intent.extra.TEXT"

    .line 1136
    .line 1137
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1138
    .line 1139
    .line 1140
    const-string v1, "text/plain"

    .line 1141
    .line 1142
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1143
    .line 1144
    .line 1145
    invoke-static {v2, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v1

    .line 1149
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 1150
    .line 1151
    .line 1152
    goto/16 :goto_3

    .line 1153
    .line 1154
    :cond_13
    instance-of v4, v1, La/ubj0;

    .line 1155
    .line 1156
    if-eqz v4, :cond_14

    .line 1157
    .line 1158
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    new-instance v2, Landroid/content/Intent;

    .line 1163
    .line 1164
    const-string v3, "android.settings.DATE_SETTINGS"

    .line 1165
    .line 1166
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1170
    .line 1171
    .line 1172
    goto/16 :goto_3

    .line 1173
    .line 1174
    :cond_14
    instance-of v4, v1, La/rbj0;

    .line 1175
    .line 1176
    if-eqz v4, :cond_15

    .line 1177
    .line 1178
    check-cast v1, La/rbj0;

    .line 1179
    .line 1180
    iget-boolean v1, v1, La/rbj0;->a:Z

    .line 1181
    .line 1182
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 1183
    .line 1184
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v3

    .line 1188
    new-instance v4, La/a220;

    .line 1189
    .line 1190
    const/16 v6, 0x19

    .line 1191
    .line 1192
    invoke-direct {v4, v0, v1, v5, v6}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 1193
    .line 1194
    .line 1195
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1196
    .line 1197
    .line 1198
    goto/16 :goto_3

    .line 1199
    .line 1200
    :cond_15
    instance-of v2, v1, La/mcj0;

    .line 1201
    .line 1202
    if-eqz v2, :cond_16

    .line 1203
    .line 1204
    check-cast v1, La/mcj0;

    .line 1205
    .line 1206
    iget-object v4, v1, La/mcj0;->a:Ljava/lang/String;

    .line 1207
    .line 1208
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v1

    .line 1212
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1213
    .line 1214
    const v3, 0x7f1307bb

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v3

    .line 1221
    const v5, 0x7f130e5d

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v5

    .line 1228
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1229
    .line 1230
    .line 1231
    sget-object v11, La/n12;->b:La/n12;

    .line 1232
    .line 1233
    const/4 v12, 0x0

    .line 1234
    const/16 v13, 0x5f8

    .line 1235
    .line 1236
    const/4 v6, 0x0

    .line 1237
    const/4 v7, 0x0

    .line 1238
    const/4 v8, 0x0

    .line 1239
    const/4 v9, 0x0

    .line 1240
    const/4 v10, 0x0

    .line 1241
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v3

    .line 1248
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_3

    .line 1255
    .line 1256
    :cond_16
    instance-of v2, v1, La/ncj0;

    .line 1257
    .line 1258
    if-eqz v2, :cond_17

    .line 1259
    .line 1260
    check-cast v1, La/ncj0;

    .line 1261
    .line 1262
    iget-object v1, v1, La/ncj0;->a:Ljava/lang/String;

    .line 1263
    .line 1264
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v0, v2, v1}, La/qbj0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    goto/16 :goto_3

    .line 1275
    .line 1276
    :cond_17
    instance-of v2, v1, La/jcj0;

    .line 1277
    .line 1278
    if-eqz v2, :cond_19

    .line 1279
    .line 1280
    check-cast v1, La/jcj0;

    .line 1281
    .line 1282
    iget-object v1, v1, La/jcj0;->a:La/vvi0;

    .line 1283
    .line 1284
    iget-object v2, v0, La/qbj0;->V1:La/qgd;

    .line 1285
    .line 1286
    if-eqz v2, :cond_18

    .line 1287
    .line 1288
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v3

    .line 1292
    const v4, 0x7f13002d

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v4

    .line 1299
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    new-instance v5, La/x6h0;

    .line 1303
    .line 1304
    const/16 v6, 0x13

    .line 1305
    .line 1306
    invoke-direct {v5, v0, v1, v6}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v1

    .line 1313
    const v6, 0x7f040b73

    .line 1314
    .line 1315
    .line 1316
    const/4 v7, 0x6

    .line 1317
    invoke-static {v1, v6, v7}, La/m5d;->g(Landroid/content/Context;II)I

    .line 1318
    .line 1319
    .line 1320
    move-result v6

    .line 1321
    invoke-static {v6, v1}, La/m5d;->e(ILandroid/content/Context;)Landroid/content/res/Resources$Theme;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v6

    .line 1325
    const v7, 0x7f040afc

    .line 1326
    .line 1327
    .line 1328
    invoke-static {v1, v7, v15, v6}, La/m5d;->f(Landroid/content/Context;IZLandroid/content/res/Resources$Theme;)I

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v2, v3, v4, v5}, La/qgd;->Y(La/kxq;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 1332
    .line 1333
    .line 1334
    goto/16 :goto_3

    .line 1335
    .line 1336
    :cond_18
    const-string v0, "settingsNavigator"

    .line 1337
    .line 1338
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1339
    .line 1340
    .line 1341
    throw v5

    .line 1342
    :cond_19
    instance-of v2, v1, La/fcj0;

    .line 1343
    .line 1344
    if-eqz v2, :cond_1b

    .line 1345
    .line 1346
    check-cast v1, La/fcj0;

    .line 1347
    .line 1348
    iget-object v1, v1, La/fcj0;->a:La/d7a;

    .line 1349
    .line 1350
    iget-object v2, v0, La/qbj0;->Q1:La/gl5;

    .line 1351
    .line 1352
    if-eqz v2, :cond_1a

    .line 1353
    .line 1354
    const v2, 0x7f131288

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v2

    .line 1361
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    const-string v3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 1365
    .line 1366
    invoke-static {v0, v3, v1, v2}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 1367
    .line 1368
    .line 1369
    goto/16 :goto_3

    .line 1370
    .line 1371
    :cond_1a
    const-string v0, "captchaDialogDelegate"

    .line 1372
    .line 1373
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1374
    .line 1375
    .line 1376
    throw v5

    .line 1377
    :cond_1b
    instance-of v2, v1, La/tbj0;

    .line 1378
    .line 1379
    if-eqz v2, :cond_1d

    .line 1380
    .line 1381
    check-cast v1, La/tbj0;

    .line 1382
    .line 1383
    iget-object v1, v1, La/tbj0;->a:Ljava/lang/String;

    .line 1384
    .line 1385
    iget-object v2, v0, La/qbj0;->R1:La/wdk0;

    .line 1386
    .line 1387
    if-eqz v2, :cond_1c

    .line 1388
    .line 1389
    invoke-static {v1, v15}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v1

    .line 1393
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v27

    .line 1400
    const v1, 0x7f130671

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v28

    .line 1407
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1408
    .line 1409
    .line 1410
    const/16 v31, 0x0

    .line 1411
    .line 1412
    const/16 v32, 0x70

    .line 1413
    .line 1414
    const-string v26, ""

    .line 1415
    .line 1416
    const/16 v29, 0x0

    .line 1417
    .line 1418
    const/16 v30, 0x0

    .line 1419
    .line 1420
    move-object/from16 v24, v0

    .line 1421
    .line 1422
    move-object/from16 v25, v2

    .line 1423
    .line 1424
    invoke-static/range {v24 .. v32}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 1425
    .line 1426
    .line 1427
    goto/16 :goto_3

    .line 1428
    .line 1429
    :cond_1c
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    throw v5

    .line 1433
    :cond_1d
    instance-of v2, v1, La/xbj0;

    .line 1434
    .line 1435
    if-eqz v2, :cond_1e

    .line 1436
    .line 1437
    check-cast v1, La/xbj0;

    .line 1438
    .line 1439
    iget-object v1, v1, La/xbj0;->a:Ljava/lang/String;

    .line 1440
    .line 1441
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v2

    .line 1445
    invoke-static {v2, v1}, La/vic;->C(Landroid/content/Context;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    goto/16 :goto_3

    .line 1449
    .line 1450
    :cond_1e
    instance-of v2, v1, La/zbj0;

    .line 1451
    .line 1452
    if-eqz v2, :cond_20

    .line 1453
    .line 1454
    iget-object v1, v0, La/qbj0;->X1:La/xi70;

    .line 1455
    .line 1456
    if-eqz v1, :cond_1f

    .line 1457
    .line 1458
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v1

    .line 1462
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1463
    .line 1464
    .line 1465
    invoke-static {v1}, La/xi70;->i(Landroidx/fragment/app/e;)V

    .line 1466
    .line 1467
    .line 1468
    goto/16 :goto_3

    .line 1469
    .line 1470
    :cond_1f
    const-string v0, "quickBetDialogNavigator"

    .line 1471
    .line 1472
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1473
    .line 1474
    .line 1475
    throw v5

    .line 1476
    :cond_20
    instance-of v2, v1, La/bcj0;

    .line 1477
    .line 1478
    if-eqz v2, :cond_21

    .line 1479
    .line 1480
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v1

    .line 1484
    const v2, 0x7f13069d

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v14

    .line 1491
    const v2, 0x7f13069c

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v15

    .line 1498
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v16

    .line 1502
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1503
    .line 1504
    .line 1505
    const v2, 0x7f131151

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v17

    .line 1512
    sget-object v22, La/n12;->b:La/n12;

    .line 1513
    .line 1514
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1515
    .line 1516
    const/16 v23, 0x0

    .line 1517
    .line 1518
    const/16 v24, 0x5d0

    .line 1519
    .line 1520
    const/16 v18, 0x0

    .line 1521
    .line 1522
    const-string v19, "REQUEST_DELETE_ACCOUNT"

    .line 1523
    .line 1524
    const/16 v20, 0x0

    .line 1525
    .line 1526
    const/16 v21, 0x0

    .line 1527
    .line 1528
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v2

    .line 1535
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1539
    .line 1540
    .line 1541
    goto/16 :goto_3

    .line 1542
    .line 1543
    :cond_21
    sget-object v2, La/ecj0;->a:La/ecj0;

    .line 1544
    .line 1545
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v2

    .line 1549
    if-eqz v2, :cond_23

    .line 1550
    .line 1551
    iget-object v1, v0, La/qbj0;->W1:La/ynb;

    .line 1552
    .line 1553
    if-eqz v1, :cond_22

    .line 1554
    .line 1555
    sget-object v21, La/bm5;->g:La/bm5;

    .line 1556
    .line 1557
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v23

    .line 1561
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1562
    .line 1563
    .line 1564
    const-string v25, "SELECT_BALANCE_REQUEST_KEY"

    .line 1565
    .line 1566
    const/16 v26, 0x1ae

    .line 1567
    .line 1568
    const/16 v22, 0x0

    .line 1569
    .line 1570
    const/16 v24, 0x0

    .line 1571
    .line 1572
    move-object/from16 v20, v1

    .line 1573
    .line 1574
    invoke-static/range {v20 .. v26}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1575
    .line 1576
    .line 1577
    goto/16 :goto_3

    .line 1578
    .line 1579
    :cond_22
    const-string v0, "changeBalanceDialogProvider"

    .line 1580
    .line 1581
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1582
    .line 1583
    .line 1584
    throw v5

    .line 1585
    :cond_23
    instance-of v2, v1, La/gcj0;

    .line 1586
    .line 1587
    if-eqz v2, :cond_25

    .line 1588
    .line 1589
    check-cast v1, La/gcj0;

    .line 1590
    .line 1591
    invoke-virtual {v0}, La/qbj0;->G0()La/ii;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v2

    .line 1595
    sget-object v4, La/onb;->i2:La/gl5;

    .line 1596
    .line 1597
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1598
    .line 1599
    const v5, 0x7f130162

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v21

    .line 1606
    iget-object v5, v1, La/gcj0;->a:Ljava/lang/String;

    .line 1607
    .line 1608
    const v6, 0x7f130e5d

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v23

    .line 1615
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v24

    .line 1622
    sget-object v29, La/n12;->a:La/n12;

    .line 1623
    .line 1624
    const/16 v30, 0x0

    .line 1625
    .line 1626
    const/16 v31, 0x5d0

    .line 1627
    .line 1628
    const/16 v25, 0x0

    .line 1629
    .line 1630
    const-string v26, "CHANGE_BALANCE_REQUEST_KEY"

    .line 1631
    .line 1632
    const/16 v27, 0x0

    .line 1633
    .line 1634
    const/16 v28, 0x0

    .line 1635
    .line 1636
    move-object/from16 v22, v5

    .line 1637
    .line 1638
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1639
    .line 1640
    .line 1641
    move-object/from16 v5, v20

    .line 1642
    .line 1643
    iget-object v1, v1, La/gcj0;->b:La/ql5;

    .line 1644
    .line 1645
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1649
    .line 1650
    .line 1651
    new-instance v4, La/onb;

    .line 1652
    .line 1653
    invoke-direct {v4}, La/onb;-><init>()V

    .line 1654
    .line 1655
    .line 1656
    invoke-virtual {v4, v5}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 1657
    .line 1658
    .line 1659
    iget-object v5, v5, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 1660
    .line 1661
    if-nez v5, :cond_24

    .line 1662
    .line 1663
    const-string v5, ""

    .line 1664
    .line 1665
    :cond_24
    sget-object v6, La/onb;->j2:[La/iiy;

    .line 1666
    .line 1667
    aget-object v7, v6, v15

    .line 1668
    .line 1669
    iget-object v8, v4, La/onb;->f2:La/phf0;

    .line 1670
    .line 1671
    invoke-virtual {v8, v4, v7, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1672
    .line 1673
    .line 1674
    iget-object v5, v4, La/onb;->g2:La/phf0;

    .line 1675
    .line 1676
    aget-object v3, v6, v3

    .line 1677
    .line 1678
    const-string v7, "GET_BALANCE_REQUEST_KEY"

    .line 1679
    .line 1680
    invoke-virtual {v5, v4, v3, v7}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1681
    .line 1682
    .line 1683
    const/4 v3, 0x2

    .line 1684
    aget-object v3, v6, v3

    .line 1685
    .line 1686
    iget-object v5, v4, La/onb;->h2:La/yzn0;

    .line 1687
    .line 1688
    invoke-virtual {v5, v4, v3, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v1

    .line 1695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v2, v4, v1}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 1699
    .line 1700
    .line 1701
    goto :goto_3

    .line 1702
    :cond_25
    sget-object v2, La/wbj0;->a:La/wbj0;

    .line 1703
    .line 1704
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v2

    .line 1708
    if-eqz v2, :cond_27

    .line 1709
    .line 1710
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v1

    .line 1714
    if-eqz v1, :cond_28

    .line 1715
    .line 1716
    iget-object v1, v0, La/qbj0;->S1:La/zav;

    .line 1717
    .line 1718
    if-eqz v1, :cond_26

    .line 1719
    .line 1720
    goto :goto_3

    .line 1721
    :cond_26
    const-string v0, "consentManager"

    .line 1722
    .line 1723
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1724
    .line 1725
    .line 1726
    throw v5

    .line 1727
    :cond_27
    sget-object v2, La/hcj0;->a:La/hcj0;

    .line 1728
    .line 1729
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1730
    .line 1731
    .line 1732
    move-result v1

    .line 1733
    if-eqz v1, :cond_2a

    .line 1734
    .line 1735
    iget-object v1, v0, La/qbj0;->P1:La/nwd;

    .line 1736
    .line 1737
    if-eqz v1, :cond_29

    .line 1738
    .line 1739
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v1

    .line 1743
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1744
    .line 1745
    .line 1746
    invoke-static {v1}, La/nwd;->g(Landroidx/fragment/app/e;)V

    .line 1747
    .line 1748
    .line 1749
    :cond_28
    :goto_3
    invoke-virtual {v0}, La/qbj0;->H0()La/k3t0;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    sget-object v1, La/kaj0;->a:La/kaj0;

    .line 1754
    .line 1755
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1756
    .line 1757
    .line 1758
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1759
    .line 1760
    goto :goto_4

    .line 1761
    :cond_29
    const-string v0, "confirmChooseLanguageDialogFactory"

    .line 1762
    .line 1763
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1764
    .line 1765
    .line 1766
    throw v5

    .line 1767
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 1768
    .line 1769
    .line 1770
    :goto_4
    return-object v5

    .line 1771
    :pswitch_15
    move-object/from16 v1, p1

    .line 1772
    .line 1773
    check-cast v1, La/o6j0;

    .line 1774
    .line 1775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1776
    .line 1777
    .line 1778
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1779
    .line 1780
    check-cast v0, La/k3t0;

    .line 1781
    .line 1782
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1783
    .line 1784
    .line 1785
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1786
    .line 1787
    return-object v0

    .line 1788
    :pswitch_16
    move-object/from16 v1, p1

    .line 1789
    .line 1790
    check-cast v1, La/b0j0;

    .line 1791
    .line 1792
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1793
    .line 1794
    .line 1795
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1796
    .line 1797
    check-cast v0, La/k3t0;

    .line 1798
    .line 1799
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1800
    .line 1801
    .line 1802
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1803
    .line 1804
    return-object v0

    .line 1805
    :pswitch_17
    move-object/from16 v1, p1

    .line 1806
    .line 1807
    check-cast v1, Ljava/lang/Throwable;

    .line 1808
    .line 1809
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1813
    .line 1814
    check-cast v0, La/rjo;

    .line 1815
    .line 1816
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 1817
    .line 1818
    .line 1819
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1820
    .line 1821
    return-object v0

    .line 1822
    :pswitch_18
    move-object/from16 v1, p1

    .line 1823
    .line 1824
    check-cast v1, Ljava/lang/Throwable;

    .line 1825
    .line 1826
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1827
    .line 1828
    .line 1829
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1830
    .line 1831
    check-cast v0, La/rjo;

    .line 1832
    .line 1833
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 1834
    .line 1835
    .line 1836
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1837
    .line 1838
    return-object v0

    .line 1839
    :pswitch_19
    move-object/from16 v1, p1

    .line 1840
    .line 1841
    check-cast v1, La/czi0;

    .line 1842
    .line 1843
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1844
    .line 1845
    .line 1846
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v0, La/k3t0;

    .line 1849
    .line 1850
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1851
    .line 1852
    .line 1853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1854
    .line 1855
    return-object v0

    .line 1856
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1857
    .line 1858
    check-cast v1, La/o1j0;

    .line 1859
    .line 1860
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1864
    .line 1865
    check-cast v0, La/swi0;

    .line 1866
    .line 1867
    sget-object v4, La/swi0;->X1:La/gne0;

    .line 1868
    .line 1869
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1870
    .line 1871
    .line 1872
    instance-of v4, v1, La/n1j0;

    .line 1873
    .line 1874
    if-eqz v4, :cond_2c

    .line 1875
    .line 1876
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1877
    .line 1878
    .line 1879
    iget-object v1, v0, La/swi0;->K1:La/rqj0;

    .line 1880
    .line 1881
    if-eqz v1, :cond_2b

    .line 1882
    .line 1883
    invoke-virtual {v1, v3}, La/rqj0;->b(Z)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v0}, La/swi0;->H0()La/k3t0;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v1

    .line 1890
    sget-object v2, La/qyi0;->a:La/qyi0;

    .line 1891
    .line 1892
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1893
    .line 1894
    .line 1895
    goto/16 :goto_6

    .line 1896
    .line 1897
    :cond_2b
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1898
    .line 1899
    .line 1900
    throw v5

    .line 1901
    :cond_2c
    instance-of v4, v1, La/p0j0;

    .line 1902
    .line 1903
    if-eqz v4, :cond_2d

    .line 1904
    .line 1905
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 1906
    .line 1907
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v1

    .line 1911
    new-instance v3, La/z8b0;

    .line 1912
    .line 1913
    const/16 v4, 0x10

    .line 1914
    .line 1915
    invoke-direct {v3, v0, v5, v4}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1916
    .line 1917
    .line 1918
    invoke-static {v1, v5, v5, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1919
    .line 1920
    .line 1921
    goto/16 :goto_6

    .line 1922
    .line 1923
    :cond_2d
    instance-of v4, v1, La/s0j0;

    .line 1924
    .line 1925
    if-eqz v4, :cond_2f

    .line 1926
    .line 1927
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v1

    .line 1931
    iget-object v2, v0, La/swi0;->M1:La/ux00;

    .line 1932
    .line 1933
    if-eqz v2, :cond_2e

    .line 1934
    .line 1935
    invoke-static {}, La/ux00;->a()La/tx00;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v2

    .line 1939
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v3

    .line 1943
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v1, v2, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 1947
    .line 1948
    .line 1949
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v1

    .line 1953
    invoke-static {v1}, La/j120;->h0(Landroid/content/Context;)V

    .line 1954
    .line 1955
    .line 1956
    goto/16 :goto_6

    .line 1957
    .line 1958
    :cond_2e
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1959
    .line 1960
    .line 1961
    throw v5

    .line 1962
    :cond_2f
    instance-of v4, v1, La/e1j0;

    .line 1963
    .line 1964
    if-eqz v4, :cond_31

    .line 1965
    .line 1966
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v1

    .line 1970
    iget-object v2, v0, La/swi0;->M1:La/ux00;

    .line 1971
    .line 1972
    if-eqz v2, :cond_30

    .line 1973
    .line 1974
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v20

    .line 1978
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v22

    .line 1982
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1983
    .line 1984
    .line 1985
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v24

    .line 1989
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v23

    .line 1993
    sget-object v28, La/n12;->a:La/n12;

    .line 1994
    .line 1995
    new-instance v19, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1996
    .line 1997
    const/16 v29, 0x0

    .line 1998
    .line 1999
    const/16 v30, 0x5c2

    .line 2000
    .line 2001
    const/16 v21, 0x0

    .line 2002
    .line 2003
    const-string v25, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 2004
    .line 2005
    const/16 v26, 0x0

    .line 2006
    .line 2007
    const/16 v27, 0x0

    .line 2008
    .line 2009
    invoke-direct/range {v19 .. v30}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2010
    .line 2011
    .line 2012
    move-object/from16 v2, v19

    .line 2013
    .line 2014
    sget-object v4, La/tx00;->l2:La/evz;

    .line 2015
    .line 2016
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2017
    .line 2018
    .line 2019
    invoke-static {v2, v15, v3, v3}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v2

    .line 2023
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v3

    .line 2027
    invoke-virtual {v3}, La/kxq;->r()La/v1r;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v3

    .line 2031
    invoke-virtual {v1, v2, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 2032
    .line 2033
    .line 2034
    goto/16 :goto_6

    .line 2035
    .line 2036
    :cond_30
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2037
    .line 2038
    .line 2039
    throw v5

    .line 2040
    :cond_31
    instance-of v3, v1, La/v0j0;

    .line 2041
    .line 2042
    if-eqz v3, :cond_32

    .line 2043
    .line 2044
    invoke-virtual {v0}, La/swi0;->H0()La/k3t0;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v1

    .line 2048
    new-instance v2, La/fyi0;

    .line 2049
    .line 2050
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2051
    .line 2052
    .line 2053
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2054
    .line 2055
    .line 2056
    goto/16 :goto_6

    .line 2057
    .line 2058
    :cond_32
    instance-of v3, v1, La/a1j0;

    .line 2059
    .line 2060
    if-eqz v3, :cond_33

    .line 2061
    .line 2062
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v1

    .line 2066
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2067
    .line 2068
    .line 2069
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v2

    .line 2073
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2074
    .line 2075
    .line 2076
    invoke-virtual {v0, v1, v2}, La/swi0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2077
    .line 2078
    .line 2079
    goto/16 :goto_6

    .line 2080
    .line 2081
    :cond_33
    instance-of v3, v1, La/g1j0;

    .line 2082
    .line 2083
    if-eqz v3, :cond_34

    .line 2084
    .line 2085
    const v4, 0x7f130dca

    .line 2086
    .line 2087
    .line 2088
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v1

    .line 2092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    .line 2094
    .line 2095
    const v2, 0x7f130437

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v2

    .line 2102
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2103
    .line 2104
    .line 2105
    invoke-virtual {v0, v1, v2}, La/swi0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2106
    .line 2107
    .line 2108
    goto/16 :goto_6

    .line 2109
    .line 2110
    :cond_34
    instance-of v3, v1, La/h1j0;

    .line 2111
    .line 2112
    if-eqz v3, :cond_35

    .line 2113
    .line 2114
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v1

    .line 2118
    new-instance v22, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2119
    .line 2120
    const v2, 0x7f1303fb

    .line 2121
    .line 2122
    .line 2123
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v23

    .line 2127
    const v2, 0x7f130f23

    .line 2128
    .line 2129
    .line 2130
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v24

    .line 2134
    const v2, 0x7f130e5d

    .line 2135
    .line 2136
    .line 2137
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v25

    .line 2141
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2142
    .line 2143
    .line 2144
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v26

    .line 2148
    sget-object v31, La/n12;->b:La/n12;

    .line 2149
    .line 2150
    const/16 v32, 0x0

    .line 2151
    .line 2152
    const/16 v33, 0x5d0

    .line 2153
    .line 2154
    const/16 v27, 0x0

    .line 2155
    .line 2156
    const-string v28, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY"

    .line 2157
    .line 2158
    const/16 v29, 0x0

    .line 2159
    .line 2160
    const/16 v30, 0x0

    .line 2161
    .line 2162
    invoke-direct/range {v22 .. v33}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2163
    .line 2164
    .line 2165
    move-object/from16 v2, v22

    .line 2166
    .line 2167
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v3

    .line 2171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2172
    .line 2173
    .line 2174
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2175
    .line 2176
    .line 2177
    goto/16 :goto_6

    .line 2178
    .line 2179
    :cond_35
    instance-of v3, v1, La/l1j0;

    .line 2180
    .line 2181
    if-eqz v3, :cond_36

    .line 2182
    .line 2183
    sget-object v1, La/iz80;->g2:La/nh70;

    .line 2184
    .line 2185
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v2

    .line 2189
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2193
    .line 2194
    .line 2195
    invoke-static {v2}, La/nh70;->l(Landroidx/fragment/app/e;)V

    .line 2196
    .line 2197
    .line 2198
    goto/16 :goto_6

    .line 2199
    .line 2200
    :cond_36
    instance-of v3, v1, La/m1j0;

    .line 2201
    .line 2202
    if-eqz v3, :cond_38

    .line 2203
    .line 2204
    check-cast v1, La/m1j0;

    .line 2205
    .line 2206
    iget-boolean v1, v1, La/m1j0;->a:Z

    .line 2207
    .line 2208
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v2

    .line 2212
    new-instance v22, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2213
    .line 2214
    const v3, 0x7f1303fb

    .line 2215
    .line 2216
    .line 2217
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v23

    .line 2221
    if-eqz v1, :cond_37

    .line 2222
    .line 2223
    const v1, 0x7f130ec1

    .line 2224
    .line 2225
    .line 2226
    goto :goto_5

    .line 2227
    :cond_37
    const v1, 0x7f130ec3

    .line 2228
    .line 2229
    .line 2230
    :goto_5
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v24

    .line 2234
    const v1, 0x7f130ebb

    .line 2235
    .line 2236
    .line 2237
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v25

    .line 2241
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2242
    .line 2243
    .line 2244
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v26

    .line 2248
    sget-object v31, La/n12;->a:La/n12;

    .line 2249
    .line 2250
    const/16 v32, 0x0

    .line 2251
    .line 2252
    const/16 v33, 0x5d0

    .line 2253
    .line 2254
    const/16 v27, 0x0

    .line 2255
    .line 2256
    const-string v28, "REQUEST_OPEN_SITE_DIALOG_KEY"

    .line 2257
    .line 2258
    const/16 v29, 0x0

    .line 2259
    .line 2260
    const/16 v30, 0x0

    .line 2261
    .line 2262
    invoke-direct/range {v22 .. v33}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2263
    .line 2264
    .line 2265
    move-object/from16 v1, v22

    .line 2266
    .line 2267
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v3

    .line 2271
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2272
    .line 2273
    .line 2274
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2275
    .line 2276
    .line 2277
    goto/16 :goto_6

    .line 2278
    .line 2279
    :cond_38
    instance-of v3, v1, La/x0j0;

    .line 2280
    .line 2281
    if-eqz v3, :cond_39

    .line 2282
    .line 2283
    check-cast v1, La/x0j0;

    .line 2284
    .line 2285
    iget-object v1, v1, La/x0j0;->a:Ljava/lang/String;

    .line 2286
    .line 2287
    new-instance v2, Landroid/content/Intent;

    .line 2288
    .line 2289
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 2290
    .line 2291
    .line 2292
    invoke-virtual {v2, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2293
    .line 2294
    .line 2295
    const-string v3, "android.intent.extra.TEXT"

    .line 2296
    .line 2297
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2298
    .line 2299
    .line 2300
    const-string v1, "text/plain"

    .line 2301
    .line 2302
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2303
    .line 2304
    .line 2305
    invoke-static {v2, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v1

    .line 2309
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 2310
    .line 2311
    .line 2312
    goto/16 :goto_6

    .line 2313
    .line 2314
    :cond_39
    instance-of v3, v1, La/r0j0;

    .line 2315
    .line 2316
    if-eqz v3, :cond_3a

    .line 2317
    .line 2318
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v1

    .line 2322
    if-eqz v1, :cond_4f

    .line 2323
    .line 2324
    new-instance v2, Landroid/content/Intent;

    .line 2325
    .line 2326
    const-string v3, "android.settings.DATE_SETTINGS"

    .line 2327
    .line 2328
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2329
    .line 2330
    .line 2331
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2332
    .line 2333
    .line 2334
    goto/16 :goto_6

    .line 2335
    .line 2336
    :cond_3a
    instance-of v3, v1, La/o0j0;

    .line 2337
    .line 2338
    if-eqz v3, :cond_3b

    .line 2339
    .line 2340
    check-cast v1, La/o0j0;

    .line 2341
    .line 2342
    iget-boolean v1, v1, La/o0j0;->a:Z

    .line 2343
    .line 2344
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 2345
    .line 2346
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v3

    .line 2350
    new-instance v4, La/a220;

    .line 2351
    .line 2352
    const/16 v6, 0x16

    .line 2353
    .line 2354
    invoke-direct {v4, v0, v1, v5, v6}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 2355
    .line 2356
    .line 2357
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2358
    .line 2359
    .line 2360
    goto/16 :goto_6

    .line 2361
    .line 2362
    :cond_3b
    instance-of v2, v1, La/i1j0;

    .line 2363
    .line 2364
    if-eqz v2, :cond_3c

    .line 2365
    .line 2366
    check-cast v1, La/i1j0;

    .line 2367
    .line 2368
    iget-object v4, v1, La/i1j0;->a:Ljava/lang/String;

    .line 2369
    .line 2370
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v1

    .line 2374
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2375
    .line 2376
    const v3, 0x7f1307bb

    .line 2377
    .line 2378
    .line 2379
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v3

    .line 2383
    const v5, 0x7f130e5d

    .line 2384
    .line 2385
    .line 2386
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v5

    .line 2390
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2391
    .line 2392
    .line 2393
    sget-object v11, La/n12;->b:La/n12;

    .line 2394
    .line 2395
    const/4 v12, 0x0

    .line 2396
    const/16 v13, 0x5f8

    .line 2397
    .line 2398
    const/4 v6, 0x0

    .line 2399
    const/4 v7, 0x0

    .line 2400
    const/4 v8, 0x0

    .line 2401
    const/4 v9, 0x0

    .line 2402
    const/4 v10, 0x0

    .line 2403
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v3

    .line 2410
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2411
    .line 2412
    .line 2413
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2414
    .line 2415
    .line 2416
    goto/16 :goto_6

    .line 2417
    .line 2418
    :cond_3c
    instance-of v2, v1, La/j1j0;

    .line 2419
    .line 2420
    if-eqz v2, :cond_3d

    .line 2421
    .line 2422
    check-cast v1, La/j1j0;

    .line 2423
    .line 2424
    iget-object v1, v1, La/j1j0;->a:Ljava/lang/String;

    .line 2425
    .line 2426
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v2

    .line 2430
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2431
    .line 2432
    .line 2433
    invoke-virtual {v0, v2, v1}, La/swi0;->I0(Ljava/lang/String;Ljava/lang/String;)V

    .line 2434
    .line 2435
    .line 2436
    goto/16 :goto_6

    .line 2437
    .line 2438
    :cond_3d
    instance-of v2, v1, La/f1j0;

    .line 2439
    .line 2440
    if-eqz v2, :cond_3f

    .line 2441
    .line 2442
    check-cast v1, La/f1j0;

    .line 2443
    .line 2444
    iget-object v1, v1, La/f1j0;->a:La/vvi0;

    .line 2445
    .line 2446
    iget-object v2, v0, La/swi0;->V1:La/qgd;

    .line 2447
    .line 2448
    if-eqz v2, :cond_3e

    .line 2449
    .line 2450
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v3

    .line 2454
    const v4, 0x7f13002d

    .line 2455
    .line 2456
    .line 2457
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2458
    .line 2459
    .line 2460
    move-result-object v4

    .line 2461
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2462
    .line 2463
    .line 2464
    new-instance v5, La/x6h0;

    .line 2465
    .line 2466
    const/16 v6, 0xd

    .line 2467
    .line 2468
    invoke-direct {v5, v0, v1, v6}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2469
    .line 2470
    .line 2471
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2472
    .line 2473
    .line 2474
    move-result-object v1

    .line 2475
    const v6, 0x7f040b73

    .line 2476
    .line 2477
    .line 2478
    const/4 v7, 0x6

    .line 2479
    invoke-static {v1, v6, v7}, La/m5d;->g(Landroid/content/Context;II)I

    .line 2480
    .line 2481
    .line 2482
    move-result v6

    .line 2483
    invoke-static {v6, v1}, La/m5d;->e(ILandroid/content/Context;)Landroid/content/res/Resources$Theme;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v6

    .line 2487
    const v7, 0x7f040afc

    .line 2488
    .line 2489
    .line 2490
    invoke-static {v1, v7, v15, v6}, La/m5d;->f(Landroid/content/Context;IZLandroid/content/res/Resources$Theme;)I

    .line 2491
    .line 2492
    .line 2493
    invoke-virtual {v2, v3, v4, v5}, La/qgd;->Y(La/kxq;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 2494
    .line 2495
    .line 2496
    goto/16 :goto_6

    .line 2497
    .line 2498
    :cond_3e
    const-string v0, "settingsNavigator"

    .line 2499
    .line 2500
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2501
    .line 2502
    .line 2503
    throw v5

    .line 2504
    :cond_3f
    instance-of v2, v1, La/c1j0;

    .line 2505
    .line 2506
    if-eqz v2, :cond_41

    .line 2507
    .line 2508
    check-cast v1, La/c1j0;

    .line 2509
    .line 2510
    iget-object v1, v1, La/c1j0;->a:La/d7a;

    .line 2511
    .line 2512
    iget-object v2, v0, La/swi0;->O1:La/gl5;

    .line 2513
    .line 2514
    if-eqz v2, :cond_40

    .line 2515
    .line 2516
    const v2, 0x7f131288

    .line 2517
    .line 2518
    .line 2519
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v2

    .line 2523
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2524
    .line 2525
    .line 2526
    const-string v3, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 2527
    .line 2528
    invoke-static {v0, v3, v1, v2}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 2529
    .line 2530
    .line 2531
    goto/16 :goto_6

    .line 2532
    .line 2533
    :cond_40
    const-string v0, "captchaDialogDelegate"

    .line 2534
    .line 2535
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2536
    .line 2537
    .line 2538
    throw v5

    .line 2539
    :cond_41
    instance-of v2, v1, La/q0j0;

    .line 2540
    .line 2541
    if-eqz v2, :cond_43

    .line 2542
    .line 2543
    check-cast v1, La/q0j0;

    .line 2544
    .line 2545
    iget-object v1, v1, La/q0j0;->a:Ljava/lang/String;

    .line 2546
    .line 2547
    iget-object v2, v0, La/swi0;->P1:La/wdk0;

    .line 2548
    .line 2549
    if-eqz v2, :cond_42

    .line 2550
    .line 2551
    invoke-static {v1, v15}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v1

    .line 2555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2556
    .line 2557
    .line 2558
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v28

    .line 2562
    const v1, 0x7f130671

    .line 2563
    .line 2564
    .line 2565
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v29

    .line 2569
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2570
    .line 2571
    .line 2572
    const/16 v32, 0x0

    .line 2573
    .line 2574
    const/16 v33, 0x70

    .line 2575
    .line 2576
    const-string v27, ""

    .line 2577
    .line 2578
    const/16 v30, 0x0

    .line 2579
    .line 2580
    const/16 v31, 0x0

    .line 2581
    .line 2582
    move-object/from16 v25, v0

    .line 2583
    .line 2584
    move-object/from16 v26, v2

    .line 2585
    .line 2586
    invoke-static/range {v25 .. v33}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 2587
    .line 2588
    .line 2589
    goto/16 :goto_6

    .line 2590
    .line 2591
    :cond_42
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2592
    .line 2593
    .line 2594
    throw v5

    .line 2595
    :cond_43
    instance-of v2, v1, La/u0j0;

    .line 2596
    .line 2597
    if-eqz v2, :cond_44

    .line 2598
    .line 2599
    check-cast v1, La/u0j0;

    .line 2600
    .line 2601
    iget-object v1, v1, La/u0j0;->a:Ljava/lang/String;

    .line 2602
    .line 2603
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2604
    .line 2605
    .line 2606
    move-result-object v2

    .line 2607
    invoke-static {v2, v1}, La/vic;->C(Landroid/content/Context;Ljava/lang/String;)V

    .line 2608
    .line 2609
    .line 2610
    goto/16 :goto_6

    .line 2611
    .line 2612
    :cond_44
    instance-of v2, v1, La/w0j0;

    .line 2613
    .line 2614
    if-eqz v2, :cond_46

    .line 2615
    .line 2616
    iget-object v1, v0, La/swi0;->W1:La/xi70;

    .line 2617
    .line 2618
    if-eqz v1, :cond_45

    .line 2619
    .line 2620
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2621
    .line 2622
    .line 2623
    move-result-object v1

    .line 2624
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2625
    .line 2626
    .line 2627
    invoke-static {v1}, La/xi70;->i(Landroidx/fragment/app/e;)V

    .line 2628
    .line 2629
    .line 2630
    goto/16 :goto_6

    .line 2631
    .line 2632
    :cond_45
    const-string v0, "quickBetDialogNavigator"

    .line 2633
    .line 2634
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2635
    .line 2636
    .line 2637
    throw v5

    .line 2638
    :cond_46
    instance-of v2, v1, La/y0j0;

    .line 2639
    .line 2640
    if-eqz v2, :cond_47

    .line 2641
    .line 2642
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v1

    .line 2646
    const v2, 0x7f13069d

    .line 2647
    .line 2648
    .line 2649
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2650
    .line 2651
    .line 2652
    move-result-object v14

    .line 2653
    const v2, 0x7f13069c

    .line 2654
    .line 2655
    .line 2656
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v15

    .line 2660
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v16

    .line 2664
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2665
    .line 2666
    .line 2667
    const v2, 0x7f131151

    .line 2668
    .line 2669
    .line 2670
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v17

    .line 2674
    sget-object v22, La/n12;->b:La/n12;

    .line 2675
    .line 2676
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2677
    .line 2678
    const/16 v23, 0x0

    .line 2679
    .line 2680
    const/16 v24, 0x5d0

    .line 2681
    .line 2682
    const/16 v18, 0x0

    .line 2683
    .line 2684
    const-string v19, "REQUEST_DELETE_ACCOUNT"

    .line 2685
    .line 2686
    const/16 v20, 0x0

    .line 2687
    .line 2688
    const/16 v21, 0x0

    .line 2689
    .line 2690
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2691
    .line 2692
    .line 2693
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2694
    .line 2695
    .line 2696
    move-result-object v2

    .line 2697
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2698
    .line 2699
    .line 2700
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2701
    .line 2702
    .line 2703
    goto/16 :goto_6

    .line 2704
    .line 2705
    :cond_47
    sget-object v2, La/b1j0;->a:La/b1j0;

    .line 2706
    .line 2707
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2708
    .line 2709
    .line 2710
    move-result v2

    .line 2711
    if-nez v2, :cond_4f

    .line 2712
    .line 2713
    instance-of v2, v1, La/z0j0;

    .line 2714
    .line 2715
    if-eqz v2, :cond_48

    .line 2716
    .line 2717
    check-cast v1, La/z0j0;

    .line 2718
    .line 2719
    iget-object v1, v1, La/z0j0;->a:Ljava/lang/String;

    .line 2720
    .line 2721
    invoke-virtual {v0}, La/swi0;->G0()La/ii;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v2

    .line 2725
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2726
    .line 2727
    invoke-virtual {v0, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2728
    .line 2729
    .line 2730
    move-result-object v17

    .line 2731
    new-instance v3, Landroid/text/SpannableString;

    .line 2732
    .line 2733
    invoke-static {v1, v15}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v1

    .line 2737
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2738
    .line 2739
    .line 2740
    invoke-direct {v3, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 2741
    .line 2742
    .line 2743
    invoke-virtual {v0, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2744
    .line 2745
    .line 2746
    move-result-object v19

    .line 2747
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2748
    .line 2749
    .line 2750
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2751
    .line 2752
    .line 2753
    move-result-object v20

    .line 2754
    sget-object v25, La/n12;->a:La/n12;

    .line 2755
    .line 2756
    const/16 v26, 0x0

    .line 2757
    .line 2758
    const/16 v27, 0x5d0

    .line 2759
    .line 2760
    const/16 v21, 0x0

    .line 2761
    .line 2762
    const-string v22, "REQUEST_APP_INFO_DIALOG_KEY"

    .line 2763
    .line 2764
    const/16 v23, 0x0

    .line 2765
    .line 2766
    const/16 v24, 0x0

    .line 2767
    .line 2768
    move-object/from16 v18, v3

    .line 2769
    .line 2770
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2771
    .line 2772
    .line 2773
    move-object/from16 v1, v16

    .line 2774
    .line 2775
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v3

    .line 2779
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2780
    .line 2781
    .line 2782
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2783
    .line 2784
    .line 2785
    goto/16 :goto_6

    .line 2786
    .line 2787
    :cond_48
    instance-of v2, v1, La/k1j0;

    .line 2788
    .line 2789
    if-eqz v2, :cond_4a

    .line 2790
    .line 2791
    check-cast v1, La/k1j0;

    .line 2792
    .line 2793
    iget-object v8, v1, La/k1j0;->a:Ljava/lang/String;

    .line 2794
    .line 2795
    iget-object v1, v0, La/swi0;->P1:La/wdk0;

    .line 2796
    .line 2797
    if-eqz v1, :cond_49

    .line 2798
    .line 2799
    new-instance v6, La/xdk0;

    .line 2800
    .line 2801
    sget-object v7, La/rek0;->b:La/rek0;

    .line 2802
    .line 2803
    const/4 v12, 0x0

    .line 2804
    const/16 v13, 0x7c

    .line 2805
    .line 2806
    const/4 v9, 0x0

    .line 2807
    const/4 v10, 0x0

    .line 2808
    const/4 v11, 0x0

    .line 2809
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2810
    .line 2811
    .line 2812
    const/16 v31, 0x0

    .line 2813
    .line 2814
    const/16 v32, 0x3fc

    .line 2815
    .line 2816
    const/16 v28, 0x0

    .line 2817
    .line 2818
    const/16 v29, 0x0

    .line 2819
    .line 2820
    const/16 v30, 0x0

    .line 2821
    .line 2822
    move-object/from16 v27, v0

    .line 2823
    .line 2824
    move-object/from16 v25, v1

    .line 2825
    .line 2826
    move-object/from16 v26, v6

    .line 2827
    .line 2828
    invoke-static/range {v25 .. v32}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2829
    .line 2830
    .line 2831
    goto :goto_6

    .line 2832
    :cond_49
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2833
    .line 2834
    .line 2835
    throw v5

    .line 2836
    :cond_4a
    sget-object v2, La/t0j0;->a:La/t0j0;

    .line 2837
    .line 2838
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2839
    .line 2840
    .line 2841
    move-result v2

    .line 2842
    if-eqz v2, :cond_4c

    .line 2843
    .line 2844
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2845
    .line 2846
    .line 2847
    move-result-object v1

    .line 2848
    if-eqz v1, :cond_4f

    .line 2849
    .line 2850
    iget-object v1, v0, La/swi0;->Q1:La/zav;

    .line 2851
    .line 2852
    if-eqz v1, :cond_4b

    .line 2853
    .line 2854
    goto :goto_6

    .line 2855
    :cond_4b
    const-string v0, "consentManager"

    .line 2856
    .line 2857
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2858
    .line 2859
    .line 2860
    throw v5

    .line 2861
    :cond_4c
    sget-object v2, La/d1j0;->a:La/d1j0;

    .line 2862
    .line 2863
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2864
    .line 2865
    .line 2866
    move-result v1

    .line 2867
    if-eqz v1, :cond_4e

    .line 2868
    .line 2869
    iget-object v1, v0, La/swi0;->N1:La/nwd;

    .line 2870
    .line 2871
    if-eqz v1, :cond_4d

    .line 2872
    .line 2873
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2874
    .line 2875
    .line 2876
    move-result-object v1

    .line 2877
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2878
    .line 2879
    .line 2880
    invoke-static {v1}, La/nwd;->g(Landroidx/fragment/app/e;)V

    .line 2881
    .line 2882
    .line 2883
    goto :goto_6

    .line 2884
    :cond_4d
    const-string v0, "confirmChooseLanguageDialogFactory"

    .line 2885
    .line 2886
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2887
    .line 2888
    .line 2889
    throw v5

    .line 2890
    :cond_4e
    invoke-static {}, La/t9f;->b()V

    .line 2891
    .line 2892
    .line 2893
    goto :goto_7

    .line 2894
    :cond_4f
    :goto_6
    invoke-virtual {v0}, La/swi0;->H0()La/k3t0;

    .line 2895
    .line 2896
    .line 2897
    move-result-object v0

    .line 2898
    sget-object v1, La/dyi0;->a:La/dyi0;

    .line 2899
    .line 2900
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2901
    .line 2902
    .line 2903
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2904
    .line 2905
    :goto_7
    return-object v5

    .line 2906
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2907
    .line 2908
    check-cast v1, La/hli0;

    .line 2909
    .line 2910
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2911
    .line 2912
    .line 2913
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2914
    .line 2915
    check-cast v0, La/k3t0;

    .line 2916
    .line 2917
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2918
    .line 2919
    .line 2920
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2921
    .line 2922
    return-object v0

    .line 2923
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2924
    .line 2925
    check-cast v1, La/nki0;

    .line 2926
    .line 2927
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2928
    .line 2929
    .line 2930
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2931
    .line 2932
    check-cast v0, La/imi0;

    .line 2933
    .line 2934
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2935
    .line 2936
    .line 2937
    iget-object v2, v0, La/imi0;->i:Ljava/util/ArrayList;

    .line 2938
    .line 2939
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v4

    .line 2943
    move v5, v15

    .line 2944
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2945
    .line 2946
    .line 2947
    move-result v6

    .line 2948
    const/4 v7, -0x1

    .line 2949
    if-eqz v6, :cond_51

    .line 2950
    .line 2951
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2952
    .line 2953
    .line 2954
    move-result-object v6

    .line 2955
    check-cast v6, La/qki0;

    .line 2956
    .line 2957
    iget-boolean v6, v6, La/qki0;->c:Z

    .line 2958
    .line 2959
    if-eqz v6, :cond_50

    .line 2960
    .line 2961
    goto :goto_9

    .line 2962
    :cond_50
    add-int/lit8 v5, v5, 0x1

    .line 2963
    .line 2964
    goto :goto_8

    .line 2965
    :cond_51
    move v5, v7

    .line 2966
    :goto_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2967
    .line 2968
    .line 2969
    move-result-object v4

    .line 2970
    move v6, v15

    .line 2971
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2972
    .line 2973
    .line 2974
    move-result v8

    .line 2975
    if-eqz v8, :cond_53

    .line 2976
    .line 2977
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v8

    .line 2981
    check-cast v8, La/qki0;

    .line 2982
    .line 2983
    iget-object v8, v8, La/qki0;->a:La/nki0;

    .line 2984
    .line 2985
    if-ne v8, v1, :cond_52

    .line 2986
    .line 2987
    move v7, v6

    .line 2988
    goto :goto_b

    .line 2989
    :cond_52
    add-int/lit8 v6, v6, 0x1

    .line 2990
    .line 2991
    goto :goto_a

    .line 2992
    :cond_53
    :goto_b
    if-ltz v5, :cond_54

    .line 2993
    .line 2994
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2995
    .line 2996
    .line 2997
    move-result-object v4

    .line 2998
    check-cast v4, La/qki0;

    .line 2999
    .line 3000
    invoke-static {v4, v15}, La/qki0;->c(La/qki0;Z)La/qki0;

    .line 3001
    .line 3002
    .line 3003
    move-result-object v4

    .line 3004
    invoke-virtual {v2, v5, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 3005
    .line 3006
    .line 3007
    :cond_54
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3008
    .line 3009
    .line 3010
    move-result-object v4

    .line 3011
    check-cast v4, La/qki0;

    .line 3012
    .line 3013
    invoke-static {v4, v3}, La/qki0;->c(La/qki0;Z)La/qki0;

    .line 3014
    .line 3015
    .line 3016
    move-result-object v4

    .line 3017
    invoke-virtual {v2, v7, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 3018
    .line 3019
    .line 3020
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3021
    .line 3022
    .line 3023
    move-result-object v4

    .line 3024
    check-cast v4, La/qki0;

    .line 3025
    .line 3026
    iget-object v4, v4, La/qki0;->a:La/nki0;

    .line 3027
    .line 3028
    iput-object v4, v0, La/imi0;->h:La/nki0;

    .line 3029
    .line 3030
    iget-object v4, v0, La/imi0;->m:La/p7m0;

    .line 3031
    .line 3032
    :cond_55
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 3033
    .line 3034
    .line 3035
    move-result-object v5

    .line 3036
    move-object v6, v5

    .line 3037
    check-cast v6, La/zli0;

    .line 3038
    .line 3039
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 3040
    .line 3041
    .line 3042
    move-result-object v7

    .line 3043
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 3044
    .line 3045
    .line 3046
    move-result v8

    .line 3047
    const/16 v9, 0x17

    .line 3048
    .line 3049
    if-eq v8, v9, :cond_57

    .line 3050
    .line 3051
    const/16 v9, 0x18

    .line 3052
    .line 3053
    if-eq v8, v9, :cond_57

    .line 3054
    .line 3055
    iget-object v8, v0, La/imi0;->g:La/nki0;

    .line 3056
    .line 3057
    iget-object v9, v0, La/imi0;->h:La/nki0;

    .line 3058
    .line 3059
    if-eq v8, v9, :cond_56

    .line 3060
    .line 3061
    :goto_c
    move v8, v3

    .line 3062
    goto :goto_d

    .line 3063
    :cond_56
    move v8, v15

    .line 3064
    goto :goto_d

    .line 3065
    :cond_57
    sget-object v8, La/nki0;->A:La/nki0;

    .line 3066
    .line 3067
    sget-object v9, La/nki0;->z:La/nki0;

    .line 3068
    .line 3069
    filled-new-array {v8, v9}, [La/nki0;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v8

    .line 3073
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 3074
    .line 3075
    .line 3076
    move-result-object v8

    .line 3077
    iget-object v9, v0, La/imi0;->g:La/nki0;

    .line 3078
    .line 3079
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 3080
    .line 3081
    .line 3082
    move-result v8

    .line 3083
    if-nez v8, :cond_56

    .line 3084
    .line 3085
    goto :goto_c

    .line 3086
    :goto_d
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3087
    .line 3088
    .line 3089
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3090
    .line 3091
    .line 3092
    new-instance v6, La/zli0;

    .line 3093
    .line 3094
    invoke-direct {v6, v7, v8}, La/zli0;-><init>(Ljava/util/List;Z)V

    .line 3095
    .line 3096
    .line 3097
    invoke-virtual {v4, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3098
    .line 3099
    .line 3100
    move-result v5

    .line 3101
    if-eqz v5, :cond_55

    .line 3102
    .line 3103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3104
    .line 3105
    return-object v0

    .line 3106
    nop

    .line 3107
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
