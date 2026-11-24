.class public final La/hzv;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/izv;


# direct methods
.method public synthetic constructor <init>(La/izv;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hzv;->i:B

    iput-object p1, p0, La/hzv;->k:La/izv;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/qek0;->a:La/qek0;

    .line 4
    .line 5
    sget-object v3, La/rek0;->b:La/rek0;

    .line 6
    .line 7
    iget-object v2, v0, La/hzv;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/s4w;

    .line 10
    .line 11
    sget-object v4, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v4, La/m4w;->a:La/m4w;

    .line 17
    .line 18
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    iget-object v8, v0, La/hzv;->k:La/izv;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v8}, La/izv;->G0()La/ii;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 31
    .line 32
    const v1, 0x7f1304dc

    .line 33
    .line 34
    .line 35
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    const v1, 0x7f130ede

    .line 40
    .line 41
    .line 42
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    const v1, 0x7f131843

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const v1, 0x7f130e07

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    sget-object v18, La/n12;->a:La/n12;

    .line 64
    .line 65
    const/16 v19, 0x0

    .line 66
    .line 67
    const/16 v20, 0x5d0

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    const-string v15, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY"

    .line 71
    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :cond_0
    instance-of v0, v2, La/o4w;

    .line 92
    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    sget-object v0, La/y3w;->n2:La/sqt;

    .line 96
    .line 97
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v2, La/o4w;

    .line 102
    .line 103
    iget-object v3, v2, La/o4w;->a:La/n3w;

    .line 104
    .line 105
    iget-boolean v2, v2, La/o4w;->b:Z

    .line 106
    .line 107
    iget-object v4, v8, La/izv;->R1:La/yzn0;

    .line 108
    .line 109
    sget-object v5, La/izv;->e2:[La/iiy;

    .line 110
    .line 111
    const/4 v6, 0x6

    .line 112
    aget-object v5, v5, v6

    .line 113
    .line 114
    invoke-virtual {v4, v8, v5}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, La/sys0;

    .line 119
    .line 120
    invoke-static {v0, v1, v3, v2, v4}, La/sqt;->g(La/sqt;Landroidx/fragment/app/e;La/n3w;ZLa/sys0;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :cond_1
    instance-of v0, v2, La/n4w;

    .line 126
    .line 127
    const v4, 0x7f13032f

    .line 128
    .line 129
    .line 130
    const v5, 0x7f130e5d

    .line 131
    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    check-cast v2, La/n4w;

    .line 136
    .line 137
    iget-object v0, v2, La/n4w;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-lez v1, :cond_2

    .line 144
    .line 145
    const v1, 0x7f1309da

    .line 146
    .line 147
    .line 148
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v8, v1, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_0
    move-object v10, v0

    .line 157
    goto :goto_1

    .line 158
    :cond_2
    const-string v0, ""

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :goto_1
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8}, La/izv;->G0()La/ii;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 169
    .line 170
    const v1, 0x7f1309c1

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    sget-object v18, La/n12;->a:La/n12;

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const/16 v20, 0x5d0

    .line 193
    .line 194
    const/4 v14, 0x0

    .line 195
    const-string v15, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 196
    .line 197
    const/16 v16, 0x0

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :cond_3
    instance-of v0, v2, La/l4w;

    .line 217
    .line 218
    if-eqz v0, :cond_4

    .line 219
    .line 220
    invoke-virtual {v8}, La/izv;->G0()La/ii;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 225
    .line 226
    const v1, 0x7f13051a

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    const v1, 0x7f130751

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v13

    .line 251
    sget-object v18, La/n12;->a:La/n12;

    .line 252
    .line 253
    const/16 v19, 0x0

    .line 254
    .line 255
    const/16 v20, 0x5d0

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const-string v15, "REQUEST_COUPON_DIALOG_KEY"

    .line 259
    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    const/16 v17, 0x0

    .line 263
    .line 264
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_2

    .line 278
    .line 279
    :cond_4
    instance-of v0, v2, La/q4w;

    .line 280
    .line 281
    if-eqz v0, :cond_5

    .line 282
    .line 283
    invoke-virtual {v8}, La/izv;->L0()La/wdk0;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    new-instance v0, La/xdk0;

    .line 288
    .line 289
    const v3, 0x7f13123d

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    check-cast v2, La/q4w;

    .line 300
    .line 301
    iget-object v2, v2, La/q4w;->a:Ljava/lang/String;

    .line 302
    .line 303
    new-instance v6, Ljava/lang/Integer;

    .line 304
    .line 305
    const v4, 0x7f080be5

    .line 306
    .line 307
    .line 308
    invoke-direct {v6, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 309
    .line 310
    .line 311
    const/16 v7, 0x58

    .line 312
    .line 313
    const/4 v4, 0x0

    .line 314
    const/4 v5, 0x0

    .line 315
    move-object/from16 v21, v3

    .line 316
    .line 317
    move-object v3, v2

    .line 318
    move-object/from16 v2, v21

    .line 319
    .line 320
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 321
    .line 322
    .line 323
    const/4 v11, 0x0

    .line 324
    const/16 v12, 0x3fc

    .line 325
    .line 326
    move-object v7, v8

    .line 327
    const/4 v8, 0x0

    .line 328
    move-object v5, v9

    .line 329
    const/4 v9, 0x0

    .line 330
    const/4 v10, 0x0

    .line 331
    move-object v6, v0

    .line 332
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 333
    .line 334
    .line 335
    goto/16 :goto_2

    .line 336
    .line 337
    :cond_5
    move-object v0, v8

    .line 338
    instance-of v4, v2, La/j4w;

    .line 339
    .line 340
    const/4 v6, 0x0

    .line 341
    if-eqz v4, :cond_7

    .line 342
    .line 343
    check-cast v2, La/j4w;

    .line 344
    .line 345
    iget-object v1, v2, La/j4w;->b:Ljava/lang/String;

    .line 346
    .line 347
    iget-object v2, v2, La/j4w;->a:[B

    .line 348
    .line 349
    sget-object v4, La/izv;->d2:La/rqt;

    .line 350
    .line 351
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    if-eqz v4, :cond_d

    .line 356
    .line 357
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-nez v5, :cond_d

    .line 362
    .line 363
    :try_start_0
    const-string v5, "print"

    .line 364
    .line 365
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    instance-of v7, v5, Landroid/print/PrintManager;

    .line 370
    .line 371
    if-eqz v7, :cond_6

    .line 372
    .line 373
    move-object v6, v5

    .line 374
    check-cast v6, Landroid/print/PrintManager;

    .line 375
    .line 376
    :cond_6
    if-eqz v6, :cond_d

    .line 377
    .line 378
    sget v5, La/qb90;->e:I

    .line 379
    .line 380
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-static {v5, v1, v2}, La/xvw;->D(Landroid/content/Context;Ljava/lang/String;[B)La/qb90;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    new-instance v5, Landroid/print/PrintAttributes$Builder;

    .line 389
    .line 390
    invoke-direct {v5}, Landroid/print/PrintAttributes$Builder;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v5}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    invoke-virtual {v6, v1, v2, v5}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 398
    .line 399
    .line 400
    goto/16 :goto_2

    .line 401
    .line 402
    :catch_0
    invoke-virtual {v0}, La/izv;->L0()La/wdk0;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    new-instance v2, La/xdk0;

    .line 407
    .line 408
    const-string v5, "PDFReader"

    .line 409
    .line 410
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    const v6, 0x7f1307c8

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    const/4 v8, 0x0

    .line 425
    const/16 v9, 0x7c

    .line 426
    .line 427
    const/4 v5, 0x0

    .line 428
    const/4 v6, 0x0

    .line 429
    const/4 v7, 0x0

    .line 430
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 431
    .line 432
    .line 433
    const/4 v11, 0x0

    .line 434
    const/16 v12, 0x3fc

    .line 435
    .line 436
    const/4 v9, 0x0

    .line 437
    const/4 v10, 0x0

    .line 438
    move-object v7, v0

    .line 439
    move-object v5, v1

    .line 440
    move-object v6, v2

    .line 441
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 442
    .line 443
    .line 444
    goto/16 :goto_2

    .line 445
    .line 446
    :cond_7
    move-object v7, v0

    .line 447
    instance-of v0, v2, La/h4w;

    .line 448
    .line 449
    if-eqz v0, :cond_8

    .line 450
    .line 451
    invoke-virtual {v7}, La/izv;->L0()La/wdk0;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    check-cast v2, La/h4w;

    .line 456
    .line 457
    iget-object v8, v2, La/h4w;->b:Ljava/lang/String;

    .line 458
    .line 459
    iget-object v10, v2, La/h4w;->a:Ljava/lang/String;

    .line 460
    .line 461
    const v0, 0x7f1304fe

    .line 462
    .line 463
    .line 464
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    new-instance v11, Ljava/lang/Integer;

    .line 472
    .line 473
    const v0, 0x7f080467

    .line 474
    .line 475
    .line 476
    invoke-direct {v11, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 477
    .line 478
    .line 479
    const/4 v12, 0x0

    .line 480
    const/16 v13, 0x40

    .line 481
    .line 482
    move-object v0, v7

    .line 483
    const-string v7, "Bet Number"

    .line 484
    .line 485
    move-object v5, v0

    .line 486
    invoke-static/range {v5 .. v13}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_2

    .line 490
    .line 491
    :cond_8
    move-object v8, v7

    .line 492
    instance-of v0, v2, La/g4w;

    .line 493
    .line 494
    if-eqz v0, :cond_9

    .line 495
    .line 496
    invoke-virtual {v8}, La/izv;->L0()La/wdk0;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    new-instance v0, La/xdk0;

    .line 501
    .line 502
    const v2, 0x7f130330

    .line 503
    .line 504
    .line 505
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    const/4 v6, 0x0

    .line 513
    const/16 v7, 0x7c

    .line 514
    .line 515
    const/4 v3, 0x0

    .line 516
    const/4 v4, 0x0

    .line 517
    const/4 v5, 0x0

    .line 518
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 519
    .line 520
    .line 521
    const/4 v11, 0x0

    .line 522
    const/16 v12, 0x3fc

    .line 523
    .line 524
    move-object v7, v8

    .line 525
    const/4 v8, 0x0

    .line 526
    move-object v5, v9

    .line 527
    const/4 v9, 0x0

    .line 528
    const/4 v10, 0x0

    .line 529
    move-object v6, v0

    .line 530
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 531
    .line 532
    .line 533
    goto/16 :goto_2

    .line 534
    .line 535
    :cond_9
    move-object v0, v8

    .line 536
    instance-of v1, v2, La/i4w;

    .line 537
    .line 538
    if-eqz v1, :cond_a

    .line 539
    .line 540
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    check-cast v2, La/i4w;

    .line 549
    .line 550
    iget-object v2, v2, La/i4w;->a:La/n3w;

    .line 551
    .line 552
    iget-object v2, v2, La/n3w;->a:Ljava/lang/String;

    .line 553
    .line 554
    new-instance v3, Lkotlin/Pair;

    .line 555
    .line 556
    const-string v4, "BET_INFO_FRAGMENT_REQUEST_KEY"

    .line 557
    .line 558
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0}, La/izv;->M0()La/jzv;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, La/jzv;->w()V

    .line 577
    .line 578
    .line 579
    goto/16 :goto_2

    .line 580
    .line 581
    :cond_a
    instance-of v1, v2, La/k4w;

    .line 582
    .line 583
    if-eqz v1, :cond_b

    .line 584
    .line 585
    invoke-virtual {v0}, La/izv;->G0()La/ii;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 590
    .line 591
    const v2, 0x7f1307bb

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    const v2, 0x7f13115d

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v8

    .line 605
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v9

    .line 609
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    sget-object v15, La/n12;->b:La/n12;

    .line 613
    .line 614
    const/16 v16, 0x0

    .line 615
    .line 616
    const/16 v17, 0x5f8

    .line 617
    .line 618
    const/4 v10, 0x0

    .line 619
    const/4 v11, 0x0

    .line 620
    const/4 v12, 0x0

    .line 621
    const/4 v13, 0x0

    .line 622
    const/4 v14, 0x0

    .line 623
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v6, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 634
    .line 635
    .line 636
    goto :goto_2

    .line 637
    :cond_b
    instance-of v1, v2, La/p4w;

    .line 638
    .line 639
    if-eqz v1, :cond_c

    .line 640
    .line 641
    invoke-virtual {v0}, La/izv;->L0()La/wdk0;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    new-instance v6, La/xdk0;

    .line 646
    .line 647
    check-cast v2, La/p4w;

    .line 648
    .line 649
    iget-object v4, v2, La/p4w;->a:Ljava/lang/String;

    .line 650
    .line 651
    const/4 v8, 0x0

    .line 652
    const/16 v9, 0x7c

    .line 653
    .line 654
    const/4 v5, 0x0

    .line 655
    move-object v2, v6

    .line 656
    const/4 v6, 0x0

    .line 657
    const/4 v7, 0x0

    .line 658
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 659
    .line 660
    .line 661
    const/4 v11, 0x0

    .line 662
    const/16 v12, 0x3fc

    .line 663
    .line 664
    const/4 v9, 0x0

    .line 665
    const/4 v10, 0x0

    .line 666
    move-object v7, v0

    .line 667
    move-object v5, v1

    .line 668
    move-object v6, v2

    .line 669
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 670
    .line 671
    .line 672
    goto :goto_2

    .line 673
    :cond_c
    instance-of v1, v2, La/r4w;

    .line 674
    .line 675
    if-eqz v1, :cond_e

    .line 676
    .line 677
    invoke-virtual {v0}, La/izv;->L0()La/wdk0;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    new-instance v6, La/xdk0;

    .line 682
    .line 683
    check-cast v2, La/r4w;

    .line 684
    .line 685
    iget-object v4, v2, La/r4w;->a:Ljava/lang/String;

    .line 686
    .line 687
    const/4 v8, 0x0

    .line 688
    const/16 v9, 0x7c

    .line 689
    .line 690
    const/4 v5, 0x0

    .line 691
    move-object v2, v6

    .line 692
    const/4 v6, 0x0

    .line 693
    const/4 v7, 0x0

    .line 694
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 695
    .line 696
    .line 697
    const/4 v11, 0x0

    .line 698
    const/16 v12, 0x3fc

    .line 699
    .line 700
    const/4 v9, 0x0

    .line 701
    const/4 v10, 0x0

    .line 702
    move-object v7, v0

    .line 703
    move-object v5, v1

    .line 704
    move-object v6, v2

    .line 705
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 706
    .line 707
    .line 708
    :cond_d
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object v0

    .line 711
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 712
    .line 713
    .line 714
    return-object v6
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/qek0;->a:La/qek0;

    .line 4
    .line 5
    iget-object v2, v0, La/hzv;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/j5w;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v3, La/e5w;->c:La/e5w;

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const v4, 0x7f13032f

    .line 21
    .line 22
    .line 23
    const v5, 0x7f1304dc

    .line 24
    .line 25
    .line 26
    iget-object v8, v0, La/hzv;->k:La/izv;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    sget-object v0, La/izv;->d2:La/rqt;

    .line 31
    .line 32
    invoke-virtual {v8}, La/izv;->G0()La/ii;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 37
    .line 38
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const v1, 0x7f131477

    .line 43
    .line 44
    .line 45
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    const v1, 0x7f130ec2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    sget-object v18, La/n12;->a:La/n12;

    .line 64
    .line 65
    const/16 v19, 0x0

    .line 66
    .line 67
    const/16 v20, 0x5d0

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    const-string v15, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 71
    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_0
    sget-object v0, La/e5w;->b:La/e5w;

    .line 92
    .line 93
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    sget-object v0, La/izv;->d2:La/rqt;

    .line 100
    .line 101
    invoke-virtual {v8}, La/izv;->G0()La/ii;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 106
    .line 107
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    const v1, 0x7f131087

    .line 112
    .line 113
    .line 114
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    const v1, 0x7f130042

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    sget-object v18, La/n12;->a:La/n12;

    .line 133
    .line 134
    const/16 v19, 0x0

    .line 135
    .line 136
    const/16 v20, 0x5d0

    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const-string v15, "REQUEST_APP_SETTINGS_PUSH_DIALOG_KEY"

    .line 140
    .line 141
    const/16 v16, 0x0

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_1
    sget-object v0, La/e5w;->a:La/e5w;

    .line 161
    .line 162
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_2

    .line 167
    .line 168
    sget-object v0, La/izv;->d2:La/rqt;

    .line 169
    .line 170
    invoke-virtual {v8}, La/izv;->G0()La/ii;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 175
    .line 176
    const v1, 0x7f130162

    .line 177
    .line 178
    .line 179
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    const v1, 0x7f131247

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    const v1, 0x7f130e5d

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v18, La/n12;->a:La/n12;

    .line 201
    .line 202
    const/16 v19, 0x0

    .line 203
    .line 204
    const/16 v20, 0x5f8

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v15, 0x0

    .line 209
    const/16 v16, 0x0

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_0

    .line 227
    .line 228
    :cond_2
    instance-of v0, v2, La/f5w;

    .line 229
    .line 230
    if-eqz v0, :cond_3

    .line 231
    .line 232
    invoke-virtual {v8}, La/izv;->L0()La/wdk0;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    check-cast v2, La/f5w;

    .line 237
    .line 238
    iget-object v0, v2, La/f5w;->a:Ljava/lang/String;

    .line 239
    .line 240
    iget v3, v2, La/f5w;->c:I

    .line 241
    .line 242
    iget-object v2, v2, La/f5w;->b:Ljava/lang/String;

    .line 243
    .line 244
    new-instance v7, La/xdk0;

    .line 245
    .line 246
    new-instance v6, Ljava/lang/Integer;

    .line 247
    .line 248
    invoke-direct {v6, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 249
    .line 250
    .line 251
    move-object v3, v2

    .line 252
    move-object v2, v0

    .line 253
    move-object v0, v7

    .line 254
    const/16 v7, 0x58

    .line 255
    .line 256
    const/4 v4, 0x0

    .line 257
    const/4 v5, 0x0

    .line 258
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 259
    .line 260
    .line 261
    const/4 v12, 0x0

    .line 262
    const/16 v13, 0x3fc

    .line 263
    .line 264
    move-object v6, v9

    .line 265
    const/4 v9, 0x0

    .line 266
    const/4 v10, 0x0

    .line 267
    const/4 v11, 0x0

    .line 268
    move-object v7, v0

    .line 269
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 270
    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_3
    instance-of v0, v2, La/h5w;

    .line 275
    .line 276
    if-eqz v0, :cond_4

    .line 277
    .line 278
    sget-object v0, La/oyd;->k2:La/std;

    .line 279
    .line 280
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    check-cast v2, La/h5w;

    .line 285
    .line 286
    iget-object v2, v2, La/h5w;->a:La/n3w;

    .line 287
    .line 288
    iget-wide v3, v2, La/n3w;->m:D

    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-static {v1, v2, v3, v4}, La/std;->h(Landroidx/fragment/app/e;La/n3w;D)V

    .line 294
    .line 295
    .line 296
    goto :goto_0

    .line 297
    :cond_4
    instance-of v0, v2, La/i5w;

    .line 298
    .line 299
    if-eqz v0, :cond_5

    .line 300
    .line 301
    invoke-virtual {v8}, La/izv;->L0()La/wdk0;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    new-instance v0, La/xdk0;

    .line 306
    .line 307
    move-object v14, v2

    .line 308
    check-cast v14, La/i5w;

    .line 309
    .line 310
    iget-object v2, v14, La/i5w;->a:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v3, v14, La/i5w;->b:Ljava/lang/String;

    .line 313
    .line 314
    const/4 v6, 0x0

    .line 315
    const/16 v7, 0x78

    .line 316
    .line 317
    const/4 v4, 0x0

    .line 318
    const/4 v5, 0x0

    .line 319
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 320
    .line 321
    .line 322
    const/4 v12, 0x0

    .line 323
    const/16 v13, 0x3ec

    .line 324
    .line 325
    move-object v6, v9

    .line 326
    const/4 v9, 0x0

    .line 327
    const/4 v10, 0x0

    .line 328
    const/4 v11, 0x1

    .line 329
    move-object v7, v0

    .line 330
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 331
    .line 332
    .line 333
    iget-object v0, v14, La/i5w;->c:Ljava/lang/String;

    .line 334
    .line 335
    new-instance v1, Lkotlin/Pair;

    .line 336
    .line 337
    const-string v2, "BUNDLE_BET_ID"

    .line 338
    .line 339
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 343
    .line 344
    new-instance v2, Lkotlin/Pair;

    .line 345
    .line 346
    const-string v3, "REQUEST_KEY_HIDE_COUPON"

    .line 347
    .line 348
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const-string v1, "REQUEST_KEY_SUCCESS_SALE"

    .line 360
    .line 361
    invoke-static {v0, v8, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_0

    .line 365
    :cond_5
    instance-of v0, v2, La/g5w;

    .line 366
    .line 367
    if-eqz v0, :cond_6

    .line 368
    .line 369
    invoke-virtual {v8}, La/izv;->L0()La/wdk0;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    new-instance v7, La/xdk0;

    .line 374
    .line 375
    sget-object v10, La/rek0;->b:La/rek0;

    .line 376
    .line 377
    check-cast v2, La/g5w;

    .line 378
    .line 379
    iget-object v11, v2, La/g5w;->a:Ljava/lang/String;

    .line 380
    .line 381
    const/4 v15, 0x0

    .line 382
    const/16 v16, 0x7c

    .line 383
    .line 384
    const/4 v12, 0x0

    .line 385
    const/4 v13, 0x0

    .line 386
    const/4 v14, 0x0

    .line 387
    move-object v9, v7

    .line 388
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 389
    .line 390
    .line 391
    const/16 v13, 0x3fc

    .line 392
    .line 393
    const/4 v9, 0x0

    .line 394
    const/4 v10, 0x0

    .line 395
    const/4 v11, 0x0

    .line 396
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 397
    .line 398
    .line 399
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 403
    .line 404
    .line 405
    const/4 v0, 0x0

    .line 406
    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hzv;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/hzv;->k:La/izv;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/hzv;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/hzv;-><init>(La/izv;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/hzv;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/hzv;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/hzv;-><init>(La/izv;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/hzv;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/hzv;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/hzv;-><init>(La/izv;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/hzv;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/hzv;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/hzv;-><init>(La/izv;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/hzv;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/hzv;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/hzv;-><init>(La/izv;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/hzv;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hzv;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/k5w;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/hzv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hzv;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hzv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/d5w;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/hzv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/hzv;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/hzv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/j5w;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/hzv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/hzv;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/hzv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/s4w;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/hzv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/hzv;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/hzv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/i2w;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/hzv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/hzv;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/hzv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hzv;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/hzv;->k:La/izv;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/hzv;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/k5w;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/k5w;->b:La/k5w;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const-string v6, "MENU_NOTIFY_BUTTON"

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    sget-object v0, La/izv;->d2:La/rqt;

    .line 33
    .line 34
    invoke-virtual {v2, v6, v3}, La/izv;->S0(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, La/izv;->R0(Z)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v1, La/k5w;->c:La/k5w;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    sget-object v0, La/izv;->d2:La/rqt;

    .line 50
    .line 51
    invoke-virtual {v2, v6, v3}, La/izv;->S0(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, La/izv;->R0(Z)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object v1, La/k5w;->a:La/k5w;

    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    sget-object v0, La/izv;->d2:La/rqt;

    .line 67
    .line 68
    invoke-virtual {v2, v6, v4}, La/izv;->S0(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-object v5

    .line 78
    :pswitch_0
    iget-object v0, v0, La/hzv;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La/d5w;

    .line 81
    .line 82
    sget-object v1, La/wne;->a:La/wne;

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v1, La/b5w;->a:La/b5w;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_4

    .line 94
    .line 95
    instance-of v3, v0, La/c5w;

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    check-cast v0, La/c5w;

    .line 100
    .line 101
    iget-boolean v3, v0, La/c5w;->a:Z

    .line 102
    .line 103
    iget-boolean v0, v0, La/c5w;->b:Z

    .line 104
    .line 105
    sget-object v4, La/izv;->d2:La/rqt;

    .line 106
    .line 107
    invoke-virtual {v2, v3, v0}, La/izv;->P0(ZZ)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, La/izv;->M0()La/jzv;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v0, v0, La/jzv;->e:La/q5w;

    .line 115
    .line 116
    iget-object v0, v0, La/q5w;->F:La/p7m0;

    .line 117
    .line 118
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_4
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    :goto_3
    return-object v5

    .line 129
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/hzv;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0

    .line 134
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/hzv;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    return-object v0

    .line 139
    :pswitch_3
    iget-object v1, v2, La/izv;->b2:La/n0o0;

    .line 140
    .line 141
    iget-object v0, v0, La/hzv;->j:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, La/i2w;

    .line 144
    .line 145
    sget-object v6, La/wne;->a:La/wne;

    .line 146
    .line 147
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object v6, La/f2w;->a:La/f2w;

    .line 151
    .line 152
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    const/16 v7, 0x8

    .line 157
    .line 158
    if-eqz v6, :cond_5

    .line 159
    .line 160
    sget-object v0, La/izv;->d2:La/rqt;

    .line 161
    .line 162
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-object v0, v0, La/q0r;->e:Landroid/widget/LinearLayout;

    .line 167
    .line 168
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, La/izv;->N0()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, La/izv;->Q0(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v3}, La/izv;->O0(Z)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_44

    .line 181
    .line 182
    :cond_5
    instance-of v6, v0, La/g2w;

    .line 183
    .line 184
    if-eqz v6, :cond_6

    .line 185
    .line 186
    sget-object v1, La/izv;->d2:La/rqt;

    .line 187
    .line 188
    invoke-virtual {v2, v4}, La/izv;->O0(Z)V

    .line 189
    .line 190
    .line 191
    check-cast v0, La/g2w;

    .line 192
    .line 193
    iget-boolean v1, v0, La/g2w;->a:Z

    .line 194
    .line 195
    invoke-virtual {v2, v1}, La/izv;->Q0(Z)V

    .line 196
    .line 197
    .line 198
    if-nez v1, :cond_5b

    .line 199
    .line 200
    iget-boolean v0, v0, La/g2w;->b:Z

    .line 201
    .line 202
    invoke-virtual {v2, v0, v4}, La/izv;->P0(ZZ)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_44

    .line 206
    .line 207
    :cond_6
    instance-of v6, v0, La/h2w;

    .line 208
    .line 209
    if-eqz v6, :cond_5d

    .line 210
    .line 211
    sget-object v6, La/izv;->d2:La/rqt;

    .line 212
    .line 213
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    iget-object v6, v6, La/q0r;->e:Landroid/widget/LinearLayout;

    .line 218
    .line 219
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4}, La/izv;->O0(Z)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, La/izv;->N0()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4}, La/izv;->Q0(Z)V

    .line 229
    .line 230
    .line 231
    check-cast v0, La/h2w;

    .line 232
    .line 233
    iget-object v6, v0, La/h2w;->a:La/s47;

    .line 234
    .line 235
    iget-object v8, v6, La/s47;->a:La/n3w;

    .line 236
    .line 237
    iget-wide v9, v8, La/n3w;->B:D

    .line 238
    .line 239
    iget-wide v11, v8, La/n3w;->n:D

    .line 240
    .line 241
    iget-wide v13, v8, La/n3w;->o:D

    .line 242
    .line 243
    iget-wide v3, v8, La/n3w;->N1:J

    .line 244
    .line 245
    move-object/from16 p0, v6

    .line 246
    .line 247
    iget-wide v5, v8, La/n3w;->Z:D

    .line 248
    .line 249
    iget-object v15, v8, La/n3w;->q1:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v7, v8, La/n3w;->l:La/e4f;

    .line 252
    .line 253
    move-object/from16 v18, v1

    .line 254
    .line 255
    iget-object v1, v8, La/n3w;->g:Ljava/lang/String;

    .line 256
    .line 257
    move-wide/from16 v19, v3

    .line 258
    .line 259
    invoke-virtual {v2}, La/izv;->M0()La/jzv;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    iget-object v4, v8, La/n3w;->A1:La/mob0;

    .line 264
    .line 265
    move-object/from16 v21, v15

    .line 266
    .line 267
    iget-object v15, v8, La/n3w;->i:Ljava/lang/String;

    .line 268
    .line 269
    move-object/from16 v22, v0

    .line 270
    .line 271
    iget-object v0, v8, La/n3w;->h:Ljava/lang/String;

    .line 272
    .line 273
    move-object/from16 v23, v4

    .line 274
    .line 275
    iget-boolean v4, v8, La/n3w;->f1:Z

    .line 276
    .line 277
    move/from16 v24, v4

    .line 278
    .line 279
    iget-boolean v4, v8, La/n3w;->t:Z

    .line 280
    .line 281
    move/from16 v25, v4

    .line 282
    .line 283
    iget-object v4, v8, La/n3w;->g1:La/q4f;

    .line 284
    .line 285
    move-wide/from16 v26, v9

    .line 286
    .line 287
    iget-object v9, v8, La/n3w;->c:La/s77;

    .line 288
    .line 289
    iget-object v3, v3, La/jzv;->e:La/q5w;

    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v10, v3, La/q5w;->C:La/p7m0;

    .line 295
    .line 296
    move-wide/from16 v28, v11

    .line 297
    .line 298
    :goto_4
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    move-object v12, v11

    .line 303
    check-cast v12, La/n3w;

    .line 304
    .line 305
    invoke-virtual {v10, v11, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    if-eqz v11, :cond_5c

    .line 310
    .line 311
    iget-object v10, v3, La/q5w;->E:La/p7m0;

    .line 312
    .line 313
    invoke-virtual {v3}, La/q5w;->v()La/n3w;

    .line 314
    .line 315
    .line 316
    move-result-object v11

    .line 317
    iget-object v12, v11, La/n3w;->l:La/e4f;

    .line 318
    .line 319
    move-object/from16 v30, v3

    .line 320
    .line 321
    sget-object v3, La/e4f;->c:La/e4f;

    .line 322
    .line 323
    if-ne v12, v3, :cond_8

    .line 324
    .line 325
    iget-object v3, v11, La/n3w;->c:La/s77;

    .line 326
    .line 327
    sget-object v11, La/s77;->d:La/s77;

    .line 328
    .line 329
    if-eq v3, v11, :cond_8

    .line 330
    .line 331
    sget-object v11, La/s77;->i:La/s77;

    .line 332
    .line 333
    if-eq v3, v11, :cond_8

    .line 334
    .line 335
    sget-object v11, La/s77;->e:La/s77;

    .line 336
    .line 337
    if-eq v3, v11, :cond_8

    .line 338
    .line 339
    invoke-virtual/range {v30 .. v30}, La/q5w;->v()La/n3w;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    iget-boolean v3, v3, La/n3w;->j1:Z

    .line 344
    .line 345
    if-eqz v3, :cond_7

    .line 346
    .line 347
    sget-object v3, La/k5w;->b:La/k5w;

    .line 348
    .line 349
    :goto_5
    const/4 v11, 0x0

    .line 350
    goto :goto_6

    .line 351
    :cond_7
    sget-object v3, La/k5w;->c:La/k5w;

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_8
    sget-object v3, La/k5w;->a:La/k5w;

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :goto_6
    invoke-virtual {v10, v11, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    if-nez v25, :cond_9

    .line 361
    .line 362
    sget-object v3, La/s77;->e:La/s77;

    .line 363
    .line 364
    if-eq v9, v3, :cond_9

    .line 365
    .line 366
    const/4 v3, 0x1

    .line 367
    goto :goto_7

    .line 368
    :cond_9
    const/4 v3, 0x0

    .line 369
    :goto_7
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    iget-object v10, v10, La/q0r;->l:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 374
    .line 375
    invoke-virtual {v10, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 376
    .line 377
    .line 378
    move-object/from16 v3, p0

    .line 379
    .line 380
    iget-object v10, v3, La/s47;->h:Ljava/lang/String;

    .line 381
    .line 382
    iget-boolean v12, v3, La/s47;->l:Z

    .line 383
    .line 384
    move/from16 v30, v12

    .line 385
    .line 386
    iget-wide v11, v8, La/n3w;->v:D

    .line 387
    .line 388
    move-wide/from16 v31, v11

    .line 389
    .line 390
    iget-object v11, v8, La/n3w;->g:Ljava/lang/String;

    .line 391
    .line 392
    move-object/from16 p0, v11

    .line 393
    .line 394
    iget-wide v11, v8, La/n3w;->p:D

    .line 395
    .line 396
    move-wide/from16 v33, v11

    .line 397
    .line 398
    iget-boolean v11, v3, La/s47;->i:Z

    .line 399
    .line 400
    iget-boolean v12, v3, La/s47;->n:Z

    .line 401
    .line 402
    move/from16 v35, v11

    .line 403
    .line 404
    iget-boolean v11, v3, La/s47;->j:Z

    .line 405
    .line 406
    move/from16 v36, v11

    .line 407
    .line 408
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 409
    .line 410
    .line 411
    move-result-object v11

    .line 412
    iget-object v11, v11, La/q0r;->b:La/h6z;

    .line 413
    .line 414
    iget-object v11, v11, La/h6z;->R:Landroid/widget/TextView;

    .line 415
    .line 416
    sget-object v37, La/rdj;->a:La/rdj;

    .line 417
    .line 418
    move-wide/from16 v37, v13

    .line 419
    .line 420
    move v14, v12

    .line 421
    iget-wide v12, v8, La/n3w;->j:J

    .line 422
    .line 423
    move/from16 v39, v14

    .line 424
    .line 425
    sget-object v14, La/efj;->c:La/efj;

    .line 426
    .line 427
    move-object/from16 v40, v15

    .line 428
    .line 429
    new-instance v15, La/znq0;

    .line 430
    .line 431
    invoke-direct {v15, v12, v13}, La/znq0;-><init>(J)V

    .line 432
    .line 433
    .line 434
    invoke-static/range {v39 .. v39}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    const/16 v13, 0x38

    .line 439
    .line 440
    move-object/from16 v39, v0

    .line 441
    .line 442
    const/4 v0, 0x0

    .line 443
    invoke-static {v15, v14, v12, v0, v13}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v12

    .line 447
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 455
    .line 456
    iget-object v0, v0, La/h6z;->k0:Landroid/widget/TextView;

    .line 457
    .line 458
    iget-object v11, v8, La/n3w;->m1:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 468
    .line 469
    iget-object v0, v0, La/h6z;->X:Landroid/widget/TextView;

    .line 470
    .line 471
    sget-object v11, La/fzv;->a:[I

    .line 472
    .line 473
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 474
    .line 475
    .line 476
    move-result v12

    .line 477
    aget v11, v11, v12

    .line 478
    .line 479
    iget-object v12, v8, La/n3w;->a:Ljava/lang/String;

    .line 480
    .line 481
    const v13, 0x7f1309da

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x1

    .line 485
    if-ne v11, v14, :cond_b

    .line 486
    .line 487
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    if-nez v11, :cond_a

    .line 492
    .line 493
    iget-object v12, v8, La/n3w;->b:Ljava/lang/String;

    .line 494
    .line 495
    :cond_a
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v11

    .line 499
    invoke-virtual {v2, v13, v11}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    goto :goto_8

    .line 504
    :cond_b
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v11

    .line 508
    invoke-virtual {v2, v13, v11}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    :goto_8
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 520
    .line 521
    iget-object v0, v0, La/h6z;->c0:Landroid/widget/TextView;

    .line 522
    .line 523
    iget-boolean v11, v8, La/n3w;->s1:Z

    .line 524
    .line 525
    if-eqz v11, :cond_c

    .line 526
    .line 527
    const/4 v11, 0x0

    .line 528
    goto :goto_9

    .line 529
    :cond_c
    const/16 v11, 0x8

    .line 530
    .line 531
    :goto_9
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 539
    .line 540
    iget-object v0, v0, La/h6z;->o:Landroid/widget/LinearLayout;

    .line 541
    .line 542
    if-eqz v25, :cond_d

    .line 543
    .line 544
    const/4 v11, 0x0

    .line 545
    goto :goto_a

    .line 546
    :cond_d
    const/16 v11, 0x8

    .line 547
    .line 548
    :goto_a
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 556
    .line 557
    iget-object v0, v0, La/h6z;->Y:Landroid/widget/TextView;

    .line 558
    .line 559
    if-eqz v35, :cond_e

    .line 560
    .line 561
    const/4 v11, 0x0

    .line 562
    goto :goto_b

    .line 563
    :cond_e
    const/16 v11, 0x8

    .line 564
    .line 565
    :goto_b
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 573
    .line 574
    iget-object v0, v0, La/h6z;->S:Landroid/widget/TextView;

    .line 575
    .line 576
    if-eqz v36, :cond_f

    .line 577
    .line 578
    const/4 v11, 0x0

    .line 579
    goto :goto_c

    .line 580
    :cond_f
    const/16 v11, 0x8

    .line 581
    .line 582
    :goto_c
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 590
    .line 591
    iget-object v0, v0, La/h6z;->U:Landroid/widget/TextView;

    .line 592
    .line 593
    sget-object v11, La/q4f;->u:La/q4f;

    .line 594
    .line 595
    if-ne v4, v11, :cond_10

    .line 596
    .line 597
    const/4 v12, 0x0

    .line 598
    goto :goto_d

    .line 599
    :cond_10
    const/16 v12, 0x8

    .line 600
    .line 601
    :goto_d
    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 609
    .line 610
    iget-object v0, v0, La/h6z;->T:Landroid/widget/TextView;

    .line 611
    .line 612
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 613
    .line 614
    .line 615
    move-result v12

    .line 616
    if-lez v12, :cond_11

    .line 617
    .line 618
    const/4 v12, 0x0

    .line 619
    goto :goto_e

    .line 620
    :cond_11
    const/16 v12, 0x8

    .line 621
    .line 622
    :goto_e
    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 630
    .line 631
    iget-object v0, v0, La/h6z;->T:Landroid/widget/TextView;

    .line 632
    .line 633
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 641
    .line 642
    iget-object v0, v0, La/h6z;->f:Landroid/widget/ImageView;

    .line 643
    .line 644
    iget-boolean v10, v8, La/n3w;->P1:Z

    .line 645
    .line 646
    if-eqz v10, :cond_12

    .line 647
    .line 648
    const/4 v10, 0x0

    .line 649
    goto :goto_f

    .line 650
    :cond_12
    const/16 v10, 0x8

    .line 651
    .line 652
    :goto_f
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 653
    .line 654
    .line 655
    sget-object v0, La/s77;->h:La/s77;

    .line 656
    .line 657
    if-eq v9, v0, :cond_13

    .line 658
    .line 659
    sget-object v0, La/e4f;->l:La/e4f;

    .line 660
    .line 661
    sget-object v10, La/e4f;->m:La/e4f;

    .line 662
    .line 663
    filled-new-array {v0, v10}, [La/e4f;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-nez v0, :cond_13

    .line 676
    .line 677
    const/4 v0, 0x1

    .line 678
    goto :goto_10

    .line 679
    :cond_13
    const/4 v0, 0x0

    .line 680
    :goto_10
    const-string v10, "MENU_MORE_BUTTON"

    .line 681
    .line 682
    invoke-virtual {v2, v10, v0}, La/izv;->S0(Ljava/lang/String;Z)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    iget-object v0, v0, La/q0r;->k:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 690
    .line 691
    invoke-virtual {v0, v10}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    if-eqz v0, :cond_14

    .line 696
    .line 697
    new-instance v10, La/wqv;

    .line 698
    .line 699
    const/4 v12, 0x6

    .line 700
    invoke-direct {v10, v2, v8, v12}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0, v10}, La/e1i;->setOnNavigationBarButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 704
    .line 705
    .line 706
    :cond_14
    iget-boolean v0, v8, La/n3w;->j1:Z

    .line 707
    .line 708
    invoke-virtual {v2, v0}, La/izv;->R0(Z)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 716
    .line 717
    iget-object v0, v0, La/h6z;->e:Landroidx/constraintlayout/widget/Group;

    .line 718
    .line 719
    const-wide/16 v12, 0x0

    .line 720
    .line 721
    cmpl-double v10, v5, v12

    .line 722
    .line 723
    if-lez v10, :cond_15

    .line 724
    .line 725
    const/4 v10, 0x0

    .line 726
    goto :goto_11

    .line 727
    :cond_15
    const/16 v10, 0x8

    .line 728
    .line 729
    :goto_11
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 737
    .line 738
    iget-object v0, v0, La/h6z;->F:Landroid/widget/TextView;

    .line 739
    .line 740
    const/4 v15, 0x0

    .line 741
    invoke-static {v5, v6, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 753
    .line 754
    iget-object v0, v0, La/h6z;->P:Landroid/widget/TextView;

    .line 755
    .line 756
    sget-object v5, La/e4f;->k:La/e4f;

    .line 757
    .line 758
    if-eq v7, v5, :cond_17

    .line 759
    .line 760
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 761
    .line 762
    .line 763
    move-result v6

    .line 764
    if-lez v6, :cond_16

    .line 765
    .line 766
    sget-object v6, La/e4f;->l:La/e4f;

    .line 767
    .line 768
    if-ne v7, v6, :cond_16

    .line 769
    .line 770
    goto :goto_12

    .line 771
    :cond_16
    const/4 v6, 0x0

    .line 772
    goto :goto_13

    .line 773
    :cond_17
    :goto_12
    const/4 v6, 0x1

    .line 774
    :goto_13
    iget-boolean v10, v8, La/n3w;->o1:Z

    .line 775
    .line 776
    if-eqz v6, :cond_18

    .line 777
    .line 778
    const/4 v6, 0x0

    .line 779
    goto :goto_14

    .line 780
    :cond_18
    const/16 v6, 0x8

    .line 781
    .line 782
    :goto_14
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 790
    .line 791
    iget-object v0, v0, La/h6z;->Q:Landroid/widget/TextView;

    .line 792
    .line 793
    if-eq v7, v5, :cond_1a

    .line 794
    .line 795
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 796
    .line 797
    .line 798
    move-result v6

    .line 799
    if-lez v6, :cond_19

    .line 800
    .line 801
    sget-object v6, La/e4f;->l:La/e4f;

    .line 802
    .line 803
    if-ne v7, v6, :cond_19

    .line 804
    .line 805
    goto :goto_15

    .line 806
    :cond_19
    const/16 v6, 0x8

    .line 807
    .line 808
    goto :goto_16

    .line 809
    :cond_1a
    :goto_15
    const/4 v6, 0x0

    .line 810
    :goto_16
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 811
    .line 812
    .line 813
    if-ne v7, v5, :cond_1b

    .line 814
    .line 815
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 820
    .line 821
    iget-object v0, v0, La/h6z;->Q:Landroid/widget/TextView;

    .line 822
    .line 823
    const v6, 0x7f1317ee

    .line 824
    .line 825
    .line 826
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 831
    .line 832
    .line 833
    goto :goto_17

    .line 834
    :cond_1b
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 839
    .line 840
    iget-object v0, v0, La/h6z;->Q:Landroid/widget/TextView;

    .line 841
    .line 842
    const v6, 0x7f130333

    .line 843
    .line 844
    .line 845
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 850
    .line 851
    .line 852
    :goto_17
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 857
    .line 858
    iget-object v0, v0, La/h6z;->P:Landroid/widget/TextView;

    .line 859
    .line 860
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 861
    .line 862
    .line 863
    move-result-object v6

    .line 864
    invoke-static {v7, v6}, La/feb;->a0(La/e4f;Landroid/content/Context;)I

    .line 865
    .line 866
    .line 867
    move-result v6

    .line 868
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 876
    .line 877
    iget-object v0, v0, La/h6z;->P:Landroid/widget/TextView;

    .line 878
    .line 879
    if-eqz v10, :cond_1c

    .line 880
    .line 881
    if-ne v7, v5, :cond_1c

    .line 882
    .line 883
    const v5, 0x7f130740

    .line 884
    .line 885
    .line 886
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v5

    .line 890
    goto :goto_18

    .line 891
    :cond_1c
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 892
    .line 893
    .line 894
    move-result v5

    .line 895
    if-lez v5, :cond_1d

    .line 896
    .line 897
    sget-object v5, La/e4f;->l:La/e4f;

    .line 898
    .line 899
    if-ne v7, v5, :cond_1d

    .line 900
    .line 901
    move-object/from16 v5, v21

    .line 902
    .line 903
    goto :goto_18

    .line 904
    :cond_1d
    if-nez v10, :cond_1e

    .line 905
    .line 906
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 907
    .line 908
    .line 909
    move-result-object v5

    .line 910
    invoke-static {v8, v5}, La/zjb;->G(La/n3w;La/ctf0;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v5

    .line 914
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 915
    .line 916
    .line 917
    move-result v5

    .line 918
    if-nez v5, :cond_1e

    .line 919
    .line 920
    const v5, 0x7f130e2b

    .line 921
    .line 922
    .line 923
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v5

    .line 927
    goto :goto_18

    .line 928
    :cond_1e
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 929
    .line 930
    .line 931
    move-result-object v5

    .line 932
    invoke-static {v8, v5}, La/zjb;->G(La/n3w;La/ctf0;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v5

    .line 936
    :goto_18
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 937
    .line 938
    .line 939
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 944
    .line 945
    iget-object v0, v0, La/h6z;->D:Landroid/widget/TextView;

    .line 946
    .line 947
    if-eqz v24, :cond_1f

    .line 948
    .line 949
    const-wide/16 v5, 0x0

    .line 950
    .line 951
    cmp-long v5, v19, v5

    .line 952
    .line 953
    if-eqz v5, :cond_1f

    .line 954
    .line 955
    const/4 v5, 0x0

    .line 956
    goto :goto_19

    .line 957
    :cond_1f
    const/16 v5, 0x8

    .line 958
    .line 959
    :goto_19
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 967
    .line 968
    iget-object v0, v0, La/h6z;->D:Landroid/widget/TextView;

    .line 969
    .line 970
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 971
    .line 972
    .line 973
    move-result-object v5

    .line 974
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v6

    .line 978
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v6

    .line 982
    const v10, 0x7f13024e

    .line 983
    .line 984
    .line 985
    invoke-virtual {v5, v10, v6}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 997
    .line 998
    iget-object v0, v0, La/h6z;->p:Landroidx/constraintlayout/widget/Group;

    .line 999
    .line 1000
    iget v5, v8, La/n3w;->y:I

    .line 1001
    .line 1002
    const/4 v14, 0x1

    .line 1003
    if-le v5, v14, :cond_20

    .line 1004
    .line 1005
    const/4 v6, 0x0

    .line 1006
    goto :goto_1a

    .line 1007
    :cond_20
    const/16 v6, 0x8

    .line 1008
    .line 1009
    :goto_1a
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1010
    .line 1011
    .line 1012
    if-le v5, v14, :cond_21

    .line 1013
    .line 1014
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1019
    .line 1020
    iget-object v0, v0, La/h6z;->q:Landroid/widget/ImageView;

    .line 1021
    .line 1022
    invoke-static {v4}, La/lgb;->S(La/q4f;)I

    .line 1023
    .line 1024
    .line 1025
    move-result v6

    .line 1026
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1034
    .line 1035
    iget-object v0, v0, La/h6z;->q:Landroid/widget/ImageView;

    .line 1036
    .line 1037
    sget-object v6, La/j5d;->a:Landroid/util/TypedValue;

    .line 1038
    .line 1039
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v6

    .line 1043
    const v10, 0x7f040b0b

    .line 1044
    .line 1045
    .line 1046
    const/4 v15, 0x0

    .line 1047
    invoke-static {v6, v10, v15}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1048
    .line 1049
    .line 1050
    move-result v6

    .line 1051
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1059
    .line 1060
    iget-object v0, v0, La/h6z;->W:Landroid/widget/TextView;

    .line 1061
    .line 1062
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v6

    .line 1066
    invoke-static {v8, v6}, La/zjb;->A(La/n3w;La/ctf0;)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v6

    .line 1070
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1078
    .line 1079
    iget-object v0, v0, La/h6z;->V:Landroid/widget/TextView;

    .line 1080
    .line 1081
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v6

    .line 1085
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v6

    .line 1089
    iget v10, v8, La/n3w;->A:I

    .line 1090
    .line 1091
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v10

    .line 1095
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v5

    .line 1099
    filled-new-array {v10, v5}, [Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v5

    .line 1103
    const v10, 0x7f1308d5

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v6, v10, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1111
    .line 1112
    .line 1113
    :cond_21
    iget-boolean v0, v3, La/s47;->f:Z

    .line 1114
    .line 1115
    if-eqz v0, :cond_22

    .line 1116
    .line 1117
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1122
    .line 1123
    iget-object v0, v0, La/h6z;->k:Landroidx/constraintlayout/widget/Group;

    .line 1124
    .line 1125
    const/4 v15, 0x0

    .line 1126
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1134
    .line 1135
    iget-object v0, v0, La/h6z;->I:Landroid/widget/TextView;

    .line 1136
    .line 1137
    const v5, 0x7f130490

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v5

    .line 1144
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1152
    .line 1153
    iget-object v0, v0, La/h6z;->J:Landroid/widget/TextView;

    .line 1154
    .line 1155
    const v5, 0x7f130499

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v5

    .line 1162
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1163
    .line 1164
    .line 1165
    goto :goto_1b

    .line 1166
    :cond_22
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1171
    .line 1172
    iget-object v0, v0, La/h6z;->k:Landroidx/constraintlayout/widget/Group;

    .line 1173
    .line 1174
    const/16 v5, 0x8

    .line 1175
    .line 1176
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1177
    .line 1178
    .line 1179
    :goto_1b
    iget-object v0, v8, La/n3w;->f:Ljava/lang/String;

    .line 1180
    .line 1181
    invoke-virtual/range {v39 .. v39}, Ljava/lang/String;->length()I

    .line 1182
    .line 1183
    .line 1184
    move-result v5

    .line 1185
    const-string v6, ":"

    .line 1186
    .line 1187
    if-lez v5, :cond_24

    .line 1188
    .line 1189
    if-eqz v35, :cond_24

    .line 1190
    .line 1191
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1196
    .line 1197
    iget-object v0, v0, La/h6z;->j:Landroidx/constraintlayout/widget/Group;

    .line 1198
    .line 1199
    const/4 v15, 0x0

    .line 1200
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1208
    .line 1209
    iget-object v0, v0, La/h6z;->G:Landroid/widget/TextView;

    .line 1210
    .line 1211
    move-object/from16 v14, v39

    .line 1212
    .line 1213
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1214
    .line 1215
    .line 1216
    invoke-static {}, La/cy7;->c()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    const v5, 0x7f130cdc

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v5

    .line 1227
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1228
    .line 1229
    .line 1230
    if-eqz v0, :cond_23

    .line 1231
    .line 1232
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    goto :goto_1c

    .line 1237
    :cond_23
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    :goto_1c
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v5

    .line 1245
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1246
    .line 1247
    iget-object v5, v5, La/h6z;->H:Landroid/widget/TextView;

    .line 1248
    .line 1249
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_1d

    .line 1253
    :cond_24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1254
    .line 1255
    .line 1256
    move-result v5

    .line 1257
    if-nez v5, :cond_25

    .line 1258
    .line 1259
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1264
    .line 1265
    iget-object v0, v0, La/h6z;->j:Landroidx/constraintlayout/widget/Group;

    .line 1266
    .line 1267
    const/16 v5, 0x8

    .line 1268
    .line 1269
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_1d

    .line 1273
    :cond_25
    sget-object v5, La/s77;->d:La/s77;

    .line 1274
    .line 1275
    if-eq v9, v5, :cond_26

    .line 1276
    .line 1277
    sget-object v5, La/s77;->i:La/s77;

    .line 1278
    .line 1279
    if-ne v9, v5, :cond_27

    .line 1280
    .line 1281
    :cond_26
    sget-object v5, La/e4f;->e:La/e4f;

    .line 1282
    .line 1283
    sget-object v10, La/e4f;->f:La/e4f;

    .line 1284
    .line 1285
    filled-new-array {v5, v10}, [La/e4f;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v5

    .line 1289
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    invoke-interface {v5, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v5

    .line 1297
    if-nez v5, :cond_27

    .line 1298
    .line 1299
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1304
    .line 1305
    iget-object v0, v0, La/h6z;->j:Landroidx/constraintlayout/widget/Group;

    .line 1306
    .line 1307
    const/16 v5, 0x8

    .line 1308
    .line 1309
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1310
    .line 1311
    .line 1312
    goto :goto_1d

    .line 1313
    :cond_27
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v5

    .line 1317
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1318
    .line 1319
    iget-object v5, v5, La/h6z;->j:Landroidx/constraintlayout/widget/Group;

    .line 1320
    .line 1321
    const/4 v15, 0x0

    .line 1322
    invoke-virtual {v5, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v5

    .line 1329
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1330
    .line 1331
    iget-object v5, v5, La/h6z;->G:Landroid/widget/TextView;

    .line 1332
    .line 1333
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1334
    .line 1335
    .line 1336
    :goto_1d
    invoke-virtual/range {v40 .. v40}, Ljava/lang/String;->length()I

    .line 1337
    .line 1338
    .line 1339
    move-result v0

    .line 1340
    if-lez v0, :cond_29

    .line 1341
    .line 1342
    if-eqz v35, :cond_29

    .line 1343
    .line 1344
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1349
    .line 1350
    iget-object v0, v0, La/h6z;->r:Landroidx/constraintlayout/widget/Group;

    .line 1351
    .line 1352
    const/4 v15, 0x0

    .line 1353
    invoke-virtual {v0, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1361
    .line 1362
    iget-object v0, v0, La/h6z;->Z:Landroid/widget/TextView;

    .line 1363
    .line 1364
    move-object/from16 v5, v40

    .line 1365
    .line 1366
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1367
    .line 1368
    .line 1369
    invoke-static {}, La/cy7;->c()Z

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    const v5, 0x7f130ed9

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v5

    .line 1380
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    if-eqz v0, :cond_28

    .line 1384
    .line 1385
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    goto :goto_1e

    .line 1390
    :cond_28
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    :goto_1e
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1399
    .line 1400
    iget-object v5, v5, La/h6z;->a0:Landroid/widget/TextView;

    .line 1401
    .line 1402
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1403
    .line 1404
    .line 1405
    goto :goto_1f

    .line 1406
    :cond_29
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1411
    .line 1412
    iget-object v0, v0, La/h6z;->r:Landroidx/constraintlayout/widget/Group;

    .line 1413
    .line 1414
    const/16 v5, 0x8

    .line 1415
    .line 1416
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1417
    .line 1418
    .line 1419
    :goto_1f
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1424
    .line 1425
    iget-object v0, v0, La/h6z;->h:Landroidx/constraintlayout/widget/Group;

    .line 1426
    .line 1427
    iget-wide v5, v8, La/n3w;->n1:D

    .line 1428
    .line 1429
    sget-object v10, La/s77;->d:La/s77;

    .line 1430
    .line 1431
    if-eq v9, v10, :cond_2b

    .line 1432
    .line 1433
    sget-object v10, La/s77;->i:La/s77;

    .line 1434
    .line 1435
    if-ne v9, v10, :cond_2a

    .line 1436
    .line 1437
    goto :goto_20

    .line 1438
    :cond_2a
    sget-object v10, La/q4f;->h:La/q4f;

    .line 1439
    .line 1440
    if-ne v4, v10, :cond_2c

    .line 1441
    .line 1442
    goto :goto_21

    .line 1443
    :cond_2b
    :goto_20
    cmpl-double v10, v37, v12

    .line 1444
    .line 1445
    if-lez v10, :cond_2d

    .line 1446
    .line 1447
    :cond_2c
    const/4 v10, 0x0

    .line 1448
    goto :goto_22

    .line 1449
    :cond_2d
    :goto_21
    const/16 v10, 0x8

    .line 1450
    .line 1451
    :goto_22
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v0

    .line 1458
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1459
    .line 1460
    iget-object v0, v0, La/h6z;->g:Landroidx/constraintlayout/widget/Group;

    .line 1461
    .line 1462
    cmpl-double v10, v28, v12

    .line 1463
    .line 1464
    if-lez v10, :cond_2e

    .line 1465
    .line 1466
    cmpl-double v14, v5, v12

    .line 1467
    .line 1468
    if-lez v14, :cond_2e

    .line 1469
    .line 1470
    const/4 v14, 0x0

    .line 1471
    goto :goto_23

    .line 1472
    :cond_2e
    const/16 v14, 0x8

    .line 1473
    .line 1474
    :goto_23
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1482
    .line 1483
    iget-object v0, v0, La/h6z;->l:Landroidx/constraintlayout/widget/Group;

    .line 1484
    .line 1485
    if-lez v10, :cond_2f

    .line 1486
    .line 1487
    const/4 v14, 0x0

    .line 1488
    goto :goto_24

    .line 1489
    :cond_2f
    const/16 v14, 0x8

    .line 1490
    .line 1491
    :goto_24
    invoke-virtual {v0, v14}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v0

    .line 1498
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1499
    .line 1500
    iget-object v0, v0, La/h6z;->M:Landroid/widget/TextView;

    .line 1501
    .line 1502
    sget-object v14, La/e4f;->j:La/e4f;

    .line 1503
    .line 1504
    if-ne v7, v14, :cond_30

    .line 1505
    .line 1506
    const v10, 0x7f13137e

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v2, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v10

    .line 1513
    goto :goto_25

    .line 1514
    :cond_30
    if-lez v10, :cond_31

    .line 1515
    .line 1516
    const v10, 0x7f1309cd

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v2, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v10

    .line 1523
    goto :goto_25

    .line 1524
    :cond_31
    const v10, 0x7f1309cc

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v2, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v10

    .line 1531
    :goto_25
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1539
    .line 1540
    iget-object v0, v0, La/h6z;->L:Landroid/widget/TextView;

    .line 1541
    .line 1542
    cmpl-double v10, v5, v12

    .line 1543
    .line 1544
    if-lez v10, :cond_32

    .line 1545
    .line 1546
    :goto_26
    const/4 v15, 0x0

    .line 1547
    goto :goto_27

    .line 1548
    :cond_32
    move-wide/from16 v5, v37

    .line 1549
    .line 1550
    goto :goto_26

    .line 1551
    :goto_27
    invoke-static {v5, v6, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v5

    .line 1555
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1563
    .line 1564
    iget-object v0, v0, La/h6z;->f0:Landroid/widget/TextView;

    .line 1565
    .line 1566
    move-wide/from16 v5, v37

    .line 1567
    .line 1568
    invoke-static {v5, v6, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v5

    .line 1572
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1580
    .line 1581
    iget-object v0, v0, La/h6z;->m:Landroid/widget/TextView;

    .line 1582
    .line 1583
    move-wide/from16 v5, v28

    .line 1584
    .line 1585
    invoke-static {v5, v6, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v5

    .line 1589
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1590
    .line 1591
    .line 1592
    iget-object v0, v8, La/n3w;->u:Ljava/lang/String;

    .line 1593
    .line 1594
    iget-object v5, v8, La/n3w;->l:La/e4f;

    .line 1595
    .line 1596
    cmpl-double v6, v33, v12

    .line 1597
    .line 1598
    move-wide/from16 v28, v12

    .line 1599
    .line 1600
    const v12, 0x7f0606c1

    .line 1601
    .line 1602
    .line 1603
    const v13, 0x7f1309f6

    .line 1604
    .line 1605
    .line 1606
    if-lez v6, :cond_35

    .line 1607
    .line 1608
    sget-object v6, La/e4f;->g:La/e4f;

    .line 1609
    .line 1610
    if-eq v5, v6, :cond_35

    .line 1611
    .line 1612
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v5

    .line 1616
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1617
    .line 1618
    iget-object v5, v5, La/h6z;->O:Landroid/widget/TextView;

    .line 1619
    .line 1620
    invoke-virtual {v2, v13}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v6

    .line 1624
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v5

    .line 1631
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1632
    .line 1633
    iget-object v5, v5, La/h6z;->N:Landroid/widget/TextView;

    .line 1634
    .line 1635
    iget-object v6, v8, La/n3w;->g1:La/q4f;

    .line 1636
    .line 1637
    const-string v13, " "

    .line 1638
    .line 1639
    if-ne v6, v11, :cond_33

    .line 1640
    .line 1641
    sget-object v0, La/pn40;->a:La/pn40;

    .line 1642
    .line 1643
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 1644
    .line 1645
    move-object/from16 v25, v11

    .line 1646
    .line 1647
    move-wide/from16 v10, v33

    .line 1648
    .line 1649
    invoke-static {v10, v11, v0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v0

    .line 1653
    const v6, 0x7f13107d

    .line 1654
    .line 1655
    .line 1656
    invoke-virtual {v2, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v6

    .line 1660
    invoke-static {v0, v13, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    goto :goto_28

    .line 1665
    :cond_33
    move-object/from16 v25, v11

    .line 1666
    .line 1667
    move-wide/from16 v10, v33

    .line 1668
    .line 1669
    sget-object v15, La/q4f;->y:La/q4f;

    .line 1670
    .line 1671
    if-ne v6, v15, :cond_34

    .line 1672
    .line 1673
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1674
    .line 1675
    .line 1676
    move-result v6

    .line 1677
    if-lez v6, :cond_34

    .line 1678
    .line 1679
    move-object/from16 v6, p0

    .line 1680
    .line 1681
    const/4 v15, 0x0

    .line 1682
    invoke-static {v10, v11, v6, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v6

    .line 1686
    invoke-static {v0, v13, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    goto :goto_28

    .line 1691
    :cond_34
    move-object/from16 v6, p0

    .line 1692
    .line 1693
    const/4 v15, 0x0

    .line 1694
    invoke-static {v10, v11, v6, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    :goto_28
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1706
    .line 1707
    iget-object v0, v0, La/h6z;->N:Landroid/widget/TextView;

    .line 1708
    .line 1709
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v5

    .line 1713
    invoke-virtual {v5, v12}, Landroid/content/Context;->getColor(I)I

    .line 1714
    .line 1715
    .line 1716
    move-result v5

    .line 1717
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1718
    .line 1719
    .line 1720
    goto/16 :goto_2d

    .line 1721
    .line 1722
    :cond_35
    move-object/from16 v6, p0

    .line 1723
    .line 1724
    move-object/from16 v25, v11

    .line 1725
    .line 1726
    iget-boolean v0, v8, La/n3w;->r1:Z

    .line 1727
    .line 1728
    if-eqz v0, :cond_37

    .line 1729
    .line 1730
    cmpl-double v10, v31, v28

    .line 1731
    .line 1732
    if-lez v10, :cond_37

    .line 1733
    .line 1734
    if-ne v5, v14, :cond_37

    .line 1735
    .line 1736
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v0

    .line 1740
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1741
    .line 1742
    iget-object v0, v0, La/h6z;->O:Landroid/widget/TextView;

    .line 1743
    .line 1744
    const v5, 0x7f1309d5

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v5

    .line 1751
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v0

    .line 1758
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1759
    .line 1760
    iget-object v0, v0, La/h6z;->N:Landroid/widget/TextView;

    .line 1761
    .line 1762
    iget-wide v10, v8, La/n3w;->y1:D

    .line 1763
    .line 1764
    cmpl-double v5, v31, v10

    .line 1765
    .line 1766
    if-lez v5, :cond_36

    .line 1767
    .line 1768
    :goto_29
    const/4 v15, 0x0

    .line 1769
    goto :goto_2a

    .line 1770
    :cond_36
    move-wide/from16 v10, v31

    .line 1771
    .line 1772
    goto :goto_29

    .line 1773
    :goto_2a
    invoke-static {v10, v11, v6, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v5

    .line 1777
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1778
    .line 1779
    .line 1780
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1785
    .line 1786
    iget-object v0, v0, La/h6z;->N:Landroid/widget/TextView;

    .line 1787
    .line 1788
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 1789
    .line 1790
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v5

    .line 1794
    const v6, 0x7f040b72

    .line 1795
    .line 1796
    .line 1797
    invoke-static {v5, v6, v15}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1798
    .line 1799
    .line 1800
    move-result v5

    .line 1801
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1802
    .line 1803
    .line 1804
    goto/16 :goto_2d

    .line 1805
    .line 1806
    :cond_37
    if-eqz v0, :cond_3c

    .line 1807
    .line 1808
    cmpl-double v0, v31, v28

    .line 1809
    .line 1810
    if-lez v0, :cond_3c

    .line 1811
    .line 1812
    iget-object v0, v8, La/n3w;->L1:La/ozc;

    .line 1813
    .line 1814
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1815
    .line 1816
    .line 1817
    move-result v0

    .line 1818
    if-eqz v0, :cond_3b

    .line 1819
    .line 1820
    const/4 v5, 0x1

    .line 1821
    if-eq v0, v5, :cond_3a

    .line 1822
    .line 1823
    const/4 v5, 0x2

    .line 1824
    if-ne v0, v5, :cond_39

    .line 1825
    .line 1826
    iget-boolean v0, v8, La/n3w;->w:Z

    .line 1827
    .line 1828
    if-eqz v0, :cond_38

    .line 1829
    .line 1830
    const v0, 0x7f130c90

    .line 1831
    .line 1832
    .line 1833
    goto :goto_2c

    .line 1834
    :cond_38
    const v0, 0x7f1309eb

    .line 1835
    .line 1836
    .line 1837
    goto :goto_2c

    .line 1838
    :cond_39
    invoke-static {}, La/t9f;->b()V

    .line 1839
    .line 1840
    .line 1841
    :goto_2b
    const/4 v5, 0x0

    .line 1842
    goto/16 :goto_45

    .line 1843
    .line 1844
    :cond_3a
    const v0, 0x7f1309e4

    .line 1845
    .line 1846
    .line 1847
    goto :goto_2c

    .line 1848
    :cond_3b
    const v0, 0x7f130cd5

    .line 1849
    .line 1850
    .line 1851
    :goto_2c
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v5

    .line 1855
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1856
    .line 1857
    iget-object v5, v5, La/h6z;->O:Landroid/widget/TextView;

    .line 1858
    .line 1859
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v0

    .line 1863
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1864
    .line 1865
    .line 1866
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1871
    .line 1872
    iget-object v0, v0, La/h6z;->N:Landroid/widget/TextView;

    .line 1873
    .line 1874
    move-wide/from16 v10, v31

    .line 1875
    .line 1876
    const/4 v15, 0x0

    .line 1877
    invoke-static {v10, v11, v6, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v5

    .line 1881
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1889
    .line 1890
    iget-object v0, v0, La/h6z;->N:Landroid/widget/TextView;

    .line 1891
    .line 1892
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 1893
    .line 1894
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v5

    .line 1898
    const v6, 0x7f040b72

    .line 1899
    .line 1900
    .line 1901
    invoke-static {v5, v6, v15}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1902
    .line 1903
    .line 1904
    move-result v5

    .line 1905
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1906
    .line 1907
    .line 1908
    goto :goto_2d

    .line 1909
    :cond_3c
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v0

    .line 1913
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1914
    .line 1915
    iget-object v0, v0, La/h6z;->i:Landroidx/constraintlayout/widget/Group;

    .line 1916
    .line 1917
    const/16 v5, 0x8

    .line 1918
    .line 1919
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1920
    .line 1921
    .line 1922
    :goto_2d
    iget-object v0, v3, La/s47;->b:La/mb90;

    .line 1923
    .line 1924
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v5

    .line 1928
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 1929
    .line 1930
    iget-object v6, v5, La/h6z;->s:Landroidx/constraintlayout/widget/Group;

    .line 1931
    .line 1932
    iget-object v10, v5, La/h6z;->t:Landroid/widget/TextView;

    .line 1933
    .line 1934
    iget-boolean v11, v0, La/mb90;->d:Z

    .line 1935
    .line 1936
    if-eqz v11, :cond_3d

    .line 1937
    .line 1938
    const/4 v11, 0x0

    .line 1939
    goto :goto_2e

    .line 1940
    :cond_3d
    const/16 v11, 0x8

    .line 1941
    .line 1942
    :goto_2e
    invoke-virtual {v6, v11}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1943
    .line 1944
    .line 1945
    iget-object v5, v5, La/h6z;->u:Landroid/widget/TextView;

    .line 1946
    .line 1947
    iget-object v6, v0, La/mb90;->a:Ljava/lang/String;

    .line 1948
    .line 1949
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1950
    .line 1951
    .line 1952
    iget-object v5, v0, La/mb90;->b:Ljava/lang/String;

    .line 1953
    .line 1954
    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1955
    .line 1956
    .line 1957
    iget v0, v0, La/mb90;->c:I

    .line 1958
    .line 1959
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1960
    .line 1961
    .line 1962
    iget-wide v5, v3, La/s47;->c:D

    .line 1963
    .line 1964
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v0

    .line 1968
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 1969
    .line 1970
    iget-object v0, v0, La/h6z;->v:Landroidx/constraintlayout/widget/Group;

    .line 1971
    .line 1972
    sget-object v10, La/s77;->g:La/s77;

    .line 1973
    .line 1974
    if-ne v9, v10, :cond_3e

    .line 1975
    .line 1976
    if-eq v7, v14, :cond_3e

    .line 1977
    .line 1978
    const/4 v11, 0x0

    .line 1979
    goto :goto_2f

    .line 1980
    :cond_3e
    const/16 v11, 0x8

    .line 1981
    .line 1982
    :goto_2f
    invoke-virtual {v0, v11}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1983
    .line 1984
    .line 1985
    const/4 v0, 0x1

    .line 1986
    invoke-static {v5, v6, v1, v0}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v11

    .line 1990
    cmpl-double v0, v5, v28

    .line 1991
    .line 1992
    if-lez v0, :cond_3f

    .line 1993
    .line 1994
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v0

    .line 1998
    invoke-virtual {v0, v12}, Landroid/content/Context;->getColor(I)I

    .line 1999
    .line 2000
    .line 2001
    move-result v0

    .line 2002
    goto :goto_30

    .line 2003
    :cond_3f
    cmpg-double v0, v5, v28

    .line 2004
    .line 2005
    if-gez v0, :cond_40

    .line 2006
    .line 2007
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v0

    .line 2011
    const v5, 0x7f0606d0

    .line 2012
    .line 2013
    .line 2014
    invoke-virtual {v0, v5}, Landroid/content/Context;->getColor(I)I

    .line 2015
    .line 2016
    .line 2017
    move-result v0

    .line 2018
    goto :goto_30

    .line 2019
    :cond_40
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 2020
    .line 2021
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v0

    .line 2025
    const v6, 0x7f040b72

    .line 2026
    .line 2027
    .line 2028
    const/4 v15, 0x0

    .line 2029
    invoke-static {v0, v6, v15}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2030
    .line 2031
    .line 2032
    move-result v0

    .line 2033
    :goto_30
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v5

    .line 2037
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 2038
    .line 2039
    iget-object v5, v5, La/h6z;->x:Landroid/widget/TextView;

    .line 2040
    .line 2041
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2042
    .line 2043
    .line 2044
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v0

    .line 2048
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2049
    .line 2050
    iget-object v0, v0, La/h6z;->x:Landroid/widget/TextView;

    .line 2051
    .line 2052
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v0

    .line 2059
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2060
    .line 2061
    iget-object v0, v0, La/h6z;->z:Landroidx/constraintlayout/widget/Group;

    .line 2062
    .line 2063
    if-ne v9, v10, :cond_42

    .line 2064
    .line 2065
    if-ne v7, v14, :cond_41

    .line 2066
    .line 2067
    goto :goto_31

    .line 2068
    :cond_41
    const/16 v5, 0x8

    .line 2069
    .line 2070
    goto :goto_32

    .line 2071
    :cond_42
    :goto_31
    const/4 v5, 0x0

    .line 2072
    :goto_32
    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2073
    .line 2074
    .line 2075
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2076
    .line 2077
    .line 2078
    move-result-object v0

    .line 2079
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2080
    .line 2081
    iget-object v0, v0, La/h6z;->K:Landroid/widget/TextView;

    .line 2082
    .line 2083
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v0

    .line 2087
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2088
    .line 2089
    .line 2090
    invoke-static {v7, v0}, La/feb;->a0(La/e4f;Landroid/content/Context;)I

    .line 2091
    .line 2092
    .line 2093
    move-result v0

    .line 2094
    if-eqz v0, :cond_43

    .line 2095
    .line 2096
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2101
    .line 2102
    iget-object v0, v0, La/h6z;->K:Landroid/widget/TextView;

    .line 2103
    .line 2104
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v5

    .line 2108
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 2109
    .line 2110
    iget-object v5, v5, La/h6z;->K:Landroid/widget/TextView;

    .line 2111
    .line 2112
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v5

    .line 2116
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2117
    .line 2118
    .line 2119
    invoke-static {v7, v5}, La/feb;->a0(La/e4f;Landroid/content/Context;)I

    .line 2120
    .line 2121
    .line 2122
    move-result v5

    .line 2123
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2124
    .line 2125
    .line 2126
    :cond_43
    move-object/from16 v0, v25

    .line 2127
    .line 2128
    if-ne v4, v0, :cond_45

    .line 2129
    .line 2130
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v0

    .line 2134
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2135
    .line 2136
    iget-object v0, v0, La/h6z;->n:Landroid/widget/ImageView;

    .line 2137
    .line 2138
    const/4 v15, 0x0

    .line 2139
    invoke-virtual {v0, v15}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2140
    .line 2141
    .line 2142
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v0

    .line 2146
    invoke-static {v7}, La/feb;->X(La/e4f;)I

    .line 2147
    .line 2148
    .line 2149
    move-result v4

    .line 2150
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v0

    .line 2154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2155
    .line 2156
    .line 2157
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v4

    .line 2161
    if-eqz v24, :cond_44

    .line 2162
    .line 2163
    const v5, 0x7f1304de

    .line 2164
    .line 2165
    .line 2166
    goto :goto_33

    .line 2167
    :cond_44
    const v5, 0x7f130e2a

    .line 2168
    .line 2169
    .line 2170
    :goto_33
    invoke-virtual {v4, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v4

    .line 2174
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2175
    .line 2176
    .line 2177
    new-instance v5, Ljava/lang/StringBuilder;

    .line 2178
    .line 2179
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2180
    .line 2181
    .line 2182
    const-string v0, " ("

    .line 2183
    .line 2184
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2185
    .line 2186
    .line 2187
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2188
    .line 2189
    .line 2190
    const-string v0, ")"

    .line 2191
    .line 2192
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2193
    .line 2194
    .line 2195
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v0

    .line 2199
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v4

    .line 2203
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2204
    .line 2205
    iget-object v4, v4, La/h6z;->K:Landroid/widget/TextView;

    .line 2206
    .line 2207
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2208
    .line 2209
    .line 2210
    goto :goto_34

    .line 2211
    :cond_45
    sget-object v0, La/e4f;->e:La/e4f;

    .line 2212
    .line 2213
    if-ne v7, v0, :cond_46

    .line 2214
    .line 2215
    iget-wide v4, v8, La/n3w;->G1:D

    .line 2216
    .line 2217
    cmpg-double v0, v26, v4

    .line 2218
    .line 2219
    if-nez v0, :cond_46

    .line 2220
    .line 2221
    cmpl-double v0, v26, v28

    .line 2222
    .line 2223
    if-lez v0, :cond_46

    .line 2224
    .line 2225
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v0

    .line 2229
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2230
    .line 2231
    iget-object v0, v0, La/h6z;->n:Landroid/widget/ImageView;

    .line 2232
    .line 2233
    invoke-static {v7}, La/feb;->V(La/e4f;)I

    .line 2234
    .line 2235
    .line 2236
    move-result v4

    .line 2237
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2238
    .line 2239
    .line 2240
    iget-wide v4, v8, La/n3w;->p:D

    .line 2241
    .line 2242
    const/4 v15, 0x0

    .line 2243
    invoke-static {v4, v5, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v0

    .line 2247
    move-wide/from16 v11, v26

    .line 2248
    .line 2249
    invoke-static {v11, v12, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v4

    .line 2253
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v5

    .line 2257
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 2258
    .line 2259
    iget-object v5, v5, La/h6z;->K:Landroid/widget/TextView;

    .line 2260
    .line 2261
    const v6, 0x7f1309e8

    .line 2262
    .line 2263
    .line 2264
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v0

    .line 2268
    invoke-virtual {v2, v6, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v0

    .line 2272
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2273
    .line 2274
    .line 2275
    goto :goto_34

    .line 2276
    :cond_46
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v0

    .line 2280
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2281
    .line 2282
    iget-object v0, v0, La/h6z;->n:Landroid/widget/ImageView;

    .line 2283
    .line 2284
    invoke-static {v7}, La/feb;->V(La/e4f;)I

    .line 2285
    .line 2286
    .line 2287
    move-result v4

    .line 2288
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2289
    .line 2290
    .line 2291
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v0

    .line 2295
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 2296
    .line 2297
    iget-object v0, v0, La/h6z;->K:Landroid/widget/TextView;

    .line 2298
    .line 2299
    invoke-static {v7}, La/feb;->X(La/e4f;)I

    .line 2300
    .line 2301
    .line 2302
    move-result v4

    .line 2303
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2304
    .line 2305
    .line 2306
    move-result-object v4

    .line 2307
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2308
    .line 2309
    .line 2310
    :goto_34
    iget-boolean v0, v3, La/s47;->g:Z

    .line 2311
    .line 2312
    iget-boolean v4, v3, La/s47;->d:Z

    .line 2313
    .line 2314
    iget-boolean v5, v3, La/s47;->e:Z

    .line 2315
    .line 2316
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v6

    .line 2320
    iget-object v6, v6, La/q0r;->f:Landroid/widget/LinearLayout;

    .line 2321
    .line 2322
    if-nez v0, :cond_48

    .line 2323
    .line 2324
    if-eqz v5, :cond_47

    .line 2325
    .line 2326
    goto :goto_35

    .line 2327
    :cond_47
    const/16 v7, 0x8

    .line 2328
    .line 2329
    goto :goto_36

    .line 2330
    :cond_48
    :goto_35
    const/4 v7, 0x0

    .line 2331
    :goto_36
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2332
    .line 2333
    .line 2334
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v6

    .line 2338
    iget-object v6, v6, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2339
    .line 2340
    if-eqz v0, :cond_49

    .line 2341
    .line 2342
    const/4 v0, 0x0

    .line 2343
    goto :goto_37

    .line 2344
    :cond_49
    const/16 v0, 0x8

    .line 2345
    .line 2346
    :goto_37
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 2347
    .line 2348
    .line 2349
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v0

    .line 2353
    iget-object v0, v0, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2354
    .line 2355
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 2356
    .line 2357
    .line 2358
    move-result v0

    .line 2359
    if-nez v0, :cond_4b

    .line 2360
    .line 2361
    sget-object v0, La/mob0;->f:La/mob0;

    .line 2362
    .line 2363
    move-object/from16 v13, v23

    .line 2364
    .line 2365
    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2366
    .line 2367
    .line 2368
    move-result v0

    .line 2369
    if-nez v0, :cond_4a

    .line 2370
    .line 2371
    if-eqz v4, :cond_4a

    .line 2372
    .line 2373
    sget-object v0, La/pn40;->a:La/pn40;

    .line 2374
    .line 2375
    iget-wide v6, v13, La/mob0;->c:D

    .line 2376
    .line 2377
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 2378
    .line 2379
    invoke-static {v6, v7, v1, v0}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v0

    .line 2383
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2384
    .line 2385
    .line 2386
    move-result-object v1

    .line 2387
    iget-object v1, v1, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2388
    .line 2389
    const v4, 0x7f1309ec

    .line 2390
    .line 2391
    .line 2392
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v0

    .line 2396
    invoke-virtual {v2, v4, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2397
    .line 2398
    .line 2399
    move-result-object v0

    .line 2400
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2401
    .line 2402
    .line 2403
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2404
    .line 2405
    .line 2406
    move-result-object v0

    .line 2407
    iget-object v0, v0, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2408
    .line 2409
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 2410
    .line 2411
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v1

    .line 2415
    const v4, 0x7f040aeb

    .line 2416
    .line 2417
    .line 2418
    const/4 v15, 0x0

    .line 2419
    invoke-static {v1, v4, v15}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2420
    .line 2421
    .line 2422
    move-result v1

    .line 2423
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v1

    .line 2427
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2428
    .line 2429
    .line 2430
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v0

    .line 2434
    iget-object v0, v0, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2435
    .line 2436
    new-instance v1, La/ezv;

    .line 2437
    .line 2438
    const/4 v14, 0x1

    .line 2439
    invoke-direct {v1, v2, v14}, La/ezv;-><init>(La/izv;B)V

    .line 2440
    .line 2441
    .line 2442
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 2443
    .line 2444
    .line 2445
    goto :goto_38

    .line 2446
    :cond_4a
    sget-object v0, La/pn40;->a:La/pn40;

    .line 2447
    .line 2448
    iget-wide v6, v8, La/n3w;->m:D

    .line 2449
    .line 2450
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 2451
    .line 2452
    invoke-static {v6, v7, v1, v0}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v0

    .line 2456
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2457
    .line 2458
    .line 2459
    move-result-object v1

    .line 2460
    iget-object v1, v1, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2461
    .line 2462
    const v4, 0x7f1309ef

    .line 2463
    .line 2464
    .line 2465
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v0

    .line 2469
    invoke-virtual {v2, v4, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v0

    .line 2473
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2474
    .line 2475
    .line 2476
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2477
    .line 2478
    .line 2479
    move-result-object v0

    .line 2480
    iget-object v0, v0, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2481
    .line 2482
    new-instance v1, La/ezv;

    .line 2483
    .line 2484
    const/4 v4, 0x2

    .line 2485
    invoke-direct {v1, v2, v4}, La/ezv;-><init>(La/izv;B)V

    .line 2486
    .line 2487
    .line 2488
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 2489
    .line 2490
    .line 2491
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v0

    .line 2495
    iget-object v0, v0, La/q0r;->d:Lcom/google/android/material/button/MaterialButton;

    .line 2496
    .line 2497
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 2498
    .line 2499
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2500
    .line 2501
    .line 2502
    move-result-object v1

    .line 2503
    const v4, 0x7f040afc

    .line 2504
    .line 2505
    .line 2506
    const/4 v15, 0x0

    .line 2507
    invoke-static {v1, v4, v15}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2508
    .line 2509
    .line 2510
    move-result v1

    .line 2511
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v1

    .line 2515
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2516
    .line 2517
    .line 2518
    :cond_4b
    :goto_38
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v0

    .line 2522
    iget-object v0, v0, La/q0r;->c:Lcom/google/android/material/button/MaterialButton;

    .line 2523
    .line 2524
    if-eqz v5, :cond_4c

    .line 2525
    .line 2526
    const/4 v1, 0x0

    .line 2527
    goto :goto_39

    .line 2528
    :cond_4c
    const/16 v1, 0x8

    .line 2529
    .line 2530
    :goto_39
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2531
    .line 2532
    .line 2533
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v0

    .line 2537
    iget-object v0, v0, La/q0r;->c:Lcom/google/android/material/button/MaterialButton;

    .line 2538
    .line 2539
    new-instance v1, La/f3s;

    .line 2540
    .line 2541
    const/16 v4, 0x17

    .line 2542
    .line 2543
    invoke-direct {v1, v2, v8, v4}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2544
    .line 2545
    .line 2546
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 2547
    .line 2548
    .line 2549
    move-object/from16 v0, v22

    .line 2550
    .line 2551
    iget-object v1, v0, La/h2w;->b:Ljava/util/ArrayList;

    .line 2552
    .line 2553
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2554
    .line 2555
    .line 2556
    move-result v4

    .line 2557
    if-eqz v4, :cond_4d

    .line 2558
    .line 2559
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v1

    .line 2563
    iget-object v1, v1, La/q0r;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 2564
    .line 2565
    const/16 v5, 0x8

    .line 2566
    .line 2567
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 2568
    .line 2569
    .line 2570
    goto :goto_3a

    .line 2571
    :cond_4d
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v4

    .line 2575
    iget-object v4, v4, La/q0r;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 2576
    .line 2577
    const/4 v15, 0x0

    .line 2578
    invoke-virtual {v4, v15}, Landroid/view/View;->setVisibility(I)V

    .line 2579
    .line 2580
    .line 2581
    invoke-virtual/range {v18 .. v18}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v4

    .line 2585
    check-cast v4, La/ma7;

    .line 2586
    .line 2587
    iput-object v1, v4, La/i26;->f:Ljava/lang/Object;

    .line 2588
    .line 2589
    invoke-virtual/range {v18 .. v18}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v1

    .line 2593
    check-cast v1, La/ma7;

    .line 2594
    .line 2595
    invoke-virtual {v1}, La/yge0;->g()V

    .line 2596
    .line 2597
    .line 2598
    :goto_3a
    iget-object v0, v0, La/h2w;->c:La/cxo0;

    .line 2599
    .line 2600
    iget-object v1, v0, La/cxo0;->b:Ljava/lang/String;

    .line 2601
    .line 2602
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2603
    .line 2604
    .line 2605
    move-result-object v4

    .line 2606
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2607
    .line 2608
    iget-object v4, v4, La/h6z;->A:Landroidx/constraintlayout/widget/Group;

    .line 2609
    .line 2610
    iget-object v5, v0, La/cxo0;->a:La/hxu;

    .line 2611
    .line 2612
    iget-object v0, v0, La/cxo0;->c:La/e4f;

    .line 2613
    .line 2614
    iget-object v6, v5, La/hxu;->a:La/ivo0;

    .line 2615
    .line 2616
    invoke-static {v6}, La/osm0;->l(La/ivo0;)Z

    .line 2617
    .line 2618
    .line 2619
    move-result v7

    .line 2620
    if-eqz v7, :cond_4e

    .line 2621
    .line 2622
    const/4 v7, 0x0

    .line 2623
    goto :goto_3b

    .line 2624
    :cond_4e
    const/16 v7, 0x8

    .line 2625
    .line 2626
    :goto_3b
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2627
    .line 2628
    .line 2629
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v4

    .line 2633
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2634
    .line 2635
    iget-object v4, v4, La/h6z;->g0:Landroid/widget/TextView;

    .line 2636
    .line 2637
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v7

    .line 2641
    iget-object v9, v5, La/hxu;->f:La/ivo0;

    .line 2642
    .line 2643
    iget-object v10, v5, La/hxu;->e:La/ivo0;

    .line 2644
    .line 2645
    iget-object v11, v5, La/hxu;->d:La/ivo0;

    .line 2646
    .line 2647
    iget-object v12, v5, La/hxu;->c:La/ivo0;

    .line 2648
    .line 2649
    iget-object v5, v5, La/hxu;->b:La/ivo0;

    .line 2650
    .line 2651
    iget-object v13, v6, La/ivo0;->a:Ljava/lang/String;

    .line 2652
    .line 2653
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v13

    .line 2657
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 2658
    .line 2659
    const/4 v14, 0x1

    .line 2660
    invoke-static {v13, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v13

    .line 2664
    const v14, 0x7f130279

    .line 2665
    .line 2666
    .line 2667
    invoke-virtual {v7, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2668
    .line 2669
    .line 2670
    move-result-object v7

    .line 2671
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2672
    .line 2673
    .line 2674
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v4

    .line 2678
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2679
    .line 2680
    iget-object v4, v4, La/h6z;->h0:Landroid/widget/TextView;

    .line 2681
    .line 2682
    iget-wide v6, v6, La/ivo0;->b:D

    .line 2683
    .line 2684
    const/4 v15, 0x0

    .line 2685
    invoke-static {v6, v7, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 2686
    .line 2687
    .line 2688
    move-result-object v6

    .line 2689
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2690
    .line 2691
    .line 2692
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v4

    .line 2696
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2697
    .line 2698
    iget-object v4, v4, La/h6z;->s0:Landroidx/constraintlayout/widget/Group;

    .line 2699
    .line 2700
    invoke-static {v5}, La/osm0;->l(La/ivo0;)Z

    .line 2701
    .line 2702
    .line 2703
    move-result v6

    .line 2704
    if-eqz v6, :cond_4f

    .line 2705
    .line 2706
    const/4 v6, 0x0

    .line 2707
    goto :goto_3c

    .line 2708
    :cond_4f
    const/16 v6, 0x8

    .line 2709
    .line 2710
    :goto_3c
    invoke-virtual {v4, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2711
    .line 2712
    .line 2713
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2714
    .line 2715
    .line 2716
    move-result-object v4

    .line 2717
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2718
    .line 2719
    iget-object v4, v4, La/h6z;->n0:Landroid/widget/TextView;

    .line 2720
    .line 2721
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v6

    .line 2725
    iget-object v7, v5, La/ivo0;->a:Ljava/lang/String;

    .line 2726
    .line 2727
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 2728
    .line 2729
    .line 2730
    move-result-object v7

    .line 2731
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 2732
    .line 2733
    const/4 v13, 0x1

    .line 2734
    invoke-static {v7, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v7

    .line 2738
    invoke-virtual {v6, v14, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2739
    .line 2740
    .line 2741
    move-result-object v6

    .line 2742
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2743
    .line 2744
    .line 2745
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v4

    .line 2749
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2750
    .line 2751
    iget-object v4, v4, La/h6z;->o0:Landroid/widget/TextView;

    .line 2752
    .line 2753
    iget-wide v5, v5, La/ivo0;->b:D

    .line 2754
    .line 2755
    const/4 v15, 0x0

    .line 2756
    invoke-static {v5, v6, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 2757
    .line 2758
    .line 2759
    move-result-object v5

    .line 2760
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2761
    .line 2762
    .line 2763
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v4

    .line 2767
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2768
    .line 2769
    iget-object v4, v4, La/h6z;->y:Landroidx/constraintlayout/widget/Group;

    .line 2770
    .line 2771
    invoke-static {v12}, La/osm0;->l(La/ivo0;)Z

    .line 2772
    .line 2773
    .line 2774
    move-result v5

    .line 2775
    if-eqz v5, :cond_50

    .line 2776
    .line 2777
    const/4 v5, 0x0

    .line 2778
    goto :goto_3d

    .line 2779
    :cond_50
    const/16 v5, 0x8

    .line 2780
    .line 2781
    :goto_3d
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2782
    .line 2783
    .line 2784
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v4

    .line 2788
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2789
    .line 2790
    iget-object v4, v4, La/h6z;->d0:Landroid/widget/TextView;

    .line 2791
    .line 2792
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 2793
    .line 2794
    .line 2795
    move-result-object v5

    .line 2796
    iget-object v6, v12, La/ivo0;->a:Ljava/lang/String;

    .line 2797
    .line 2798
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v6

    .line 2802
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 2803
    .line 2804
    const/4 v13, 0x1

    .line 2805
    invoke-static {v6, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2806
    .line 2807
    .line 2808
    move-result-object v6

    .line 2809
    invoke-virtual {v5, v14, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v5

    .line 2813
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2814
    .line 2815
    .line 2816
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v4

    .line 2820
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2821
    .line 2822
    iget-object v4, v4, La/h6z;->e0:Landroid/widget/TextView;

    .line 2823
    .line 2824
    iget-wide v5, v12, La/ivo0;->b:D

    .line 2825
    .line 2826
    const/4 v15, 0x0

    .line 2827
    invoke-static {v5, v6, v1, v15}, La/jtv;->I0(DLjava/lang/String;Z)Ljava/lang/String;

    .line 2828
    .line 2829
    .line 2830
    move-result-object v5

    .line 2831
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2832
    .line 2833
    .line 2834
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2835
    .line 2836
    .line 2837
    move-result-object v4

    .line 2838
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2839
    .line 2840
    iget-object v4, v4, La/h6z;->t0:Landroidx/constraintlayout/widget/Group;

    .line 2841
    .line 2842
    invoke-static {v11}, La/osm0;->l(La/ivo0;)Z

    .line 2843
    .line 2844
    .line 2845
    move-result v5

    .line 2846
    if-eqz v5, :cond_51

    .line 2847
    .line 2848
    const/4 v5, 0x0

    .line 2849
    goto :goto_3e

    .line 2850
    :cond_51
    const/16 v5, 0x8

    .line 2851
    .line 2852
    :goto_3e
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2853
    .line 2854
    .line 2855
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2856
    .line 2857
    .line 2858
    move-result-object v4

    .line 2859
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2860
    .line 2861
    iget-object v4, v4, La/h6z;->p0:Landroid/widget/TextView;

    .line 2862
    .line 2863
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 2864
    .line 2865
    .line 2866
    move-result-object v5

    .line 2867
    iget-object v6, v11, La/ivo0;->a:Ljava/lang/String;

    .line 2868
    .line 2869
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 2870
    .line 2871
    .line 2872
    move-result-object v6

    .line 2873
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 2874
    .line 2875
    const/4 v7, 0x1

    .line 2876
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2877
    .line 2878
    .line 2879
    move-result-object v6

    .line 2880
    invoke-virtual {v5, v14, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2881
    .line 2882
    .line 2883
    move-result-object v5

    .line 2884
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2885
    .line 2886
    .line 2887
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v4

    .line 2891
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2892
    .line 2893
    iget-object v4, v4, La/h6z;->q0:Landroid/widget/TextView;

    .line 2894
    .line 2895
    iget-wide v5, v11, La/ivo0;->b:D

    .line 2896
    .line 2897
    invoke-static {v1, v5, v6}, La/jtv;->J0(Ljava/lang/String;D)Ljava/lang/String;

    .line 2898
    .line 2899
    .line 2900
    move-result-object v5

    .line 2901
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2902
    .line 2903
    .line 2904
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v4

    .line 2908
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2909
    .line 2910
    iget-object v4, v4, La/h6z;->B:Landroidx/constraintlayout/widget/Group;

    .line 2911
    .line 2912
    invoke-static {v10}, La/osm0;->l(La/ivo0;)Z

    .line 2913
    .line 2914
    .line 2915
    move-result v5

    .line 2916
    if-eqz v5, :cond_52

    .line 2917
    .line 2918
    const/4 v5, 0x0

    .line 2919
    goto :goto_3f

    .line 2920
    :cond_52
    const/16 v5, 0x8

    .line 2921
    .line 2922
    :goto_3f
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2923
    .line 2924
    .line 2925
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v4

    .line 2929
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2930
    .line 2931
    iget-object v4, v4, La/h6z;->i0:Landroid/widget/TextView;

    .line 2932
    .line 2933
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 2934
    .line 2935
    .line 2936
    move-result-object v5

    .line 2937
    iget-object v6, v10, La/ivo0;->a:Ljava/lang/String;

    .line 2938
    .line 2939
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v6

    .line 2943
    invoke-virtual {v5, v14, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2944
    .line 2945
    .line 2946
    move-result-object v5

    .line 2947
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2948
    .line 2949
    .line 2950
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2951
    .line 2952
    .line 2953
    move-result-object v4

    .line 2954
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2955
    .line 2956
    iget-object v4, v4, La/h6z;->j0:Landroid/widget/TextView;

    .line 2957
    .line 2958
    iget-wide v5, v10, La/ivo0;->b:D

    .line 2959
    .line 2960
    invoke-static {v1, v5, v6}, La/jtv;->J0(Ljava/lang/String;D)Ljava/lang/String;

    .line 2961
    .line 2962
    .line 2963
    move-result-object v5

    .line 2964
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2965
    .line 2966
    .line 2967
    invoke-static {v9}, La/osm0;->l(La/ivo0;)Z

    .line 2968
    .line 2969
    .line 2970
    move-result v4

    .line 2971
    if-eqz v4, :cond_54

    .line 2972
    .line 2973
    sget-object v4, La/e4f;->f:La/e4f;

    .line 2974
    .line 2975
    if-eq v0, v4, :cond_54

    .line 2976
    .line 2977
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v4

    .line 2981
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 2982
    .line 2983
    iget-object v4, v4, La/h6z;->i:Landroidx/constraintlayout/widget/Group;

    .line 2984
    .line 2985
    const/4 v15, 0x0

    .line 2986
    invoke-virtual {v4, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 2987
    .line 2988
    .line 2989
    sget-object v4, La/e4f;->e:La/e4f;

    .line 2990
    .line 2991
    if-ne v0, v4, :cond_53

    .line 2992
    .line 2993
    const v0, 0x7f1309f6

    .line 2994
    .line 2995
    .line 2996
    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2997
    .line 2998
    .line 2999
    move-result-object v0

    .line 3000
    goto :goto_40

    .line 3001
    :cond_53
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 3002
    .line 3003
    .line 3004
    move-result-object v0

    .line 3005
    iget-object v4, v9, La/ivo0;->a:Ljava/lang/String;

    .line 3006
    .line 3007
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 3008
    .line 3009
    .line 3010
    move-result-object v4

    .line 3011
    invoke-virtual {v0, v14, v4}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3012
    .line 3013
    .line 3014
    move-result-object v0

    .line 3015
    :goto_40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3016
    .line 3017
    .line 3018
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v4

    .line 3022
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 3023
    .line 3024
    iget-object v4, v4, La/h6z;->O:Landroid/widget/TextView;

    .line 3025
    .line 3026
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3027
    .line 3028
    .line 3029
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3030
    .line 3031
    .line 3032
    move-result-object v0

    .line 3033
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3034
    .line 3035
    iget-object v0, v0, La/h6z;->N:Landroid/widget/TextView;

    .line 3036
    .line 3037
    iget-wide v4, v9, La/ivo0;->b:D

    .line 3038
    .line 3039
    invoke-static {v1, v4, v5}, La/jtv;->J0(Ljava/lang/String;D)Ljava/lang/String;

    .line 3040
    .line 3041
    .line 3042
    move-result-object v1

    .line 3043
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3044
    .line 3045
    .line 3046
    :cond_54
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3047
    .line 3048
    .line 3049
    move-result-object v0

    .line 3050
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3051
    .line 3052
    iget-object v0, v0, La/h6z;->O:Landroid/widget/TextView;

    .line 3053
    .line 3054
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v0

    .line 3058
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3059
    .line 3060
    .line 3061
    check-cast v0, La/a3e;

    .line 3062
    .line 3063
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3064
    .line 3065
    .line 3066
    move-result-object v1

    .line 3067
    iget-object v1, v1, La/q0r;->b:La/h6z;

    .line 3068
    .line 3069
    iget-object v1, v1, La/h6z;->E:Landroid/widget/TextView;

    .line 3070
    .line 3071
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3072
    .line 3073
    .line 3074
    move-result-object v1

    .line 3075
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3076
    .line 3077
    .line 3078
    check-cast v1, La/a3e;

    .line 3079
    .line 3080
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3081
    .line 3082
    .line 3083
    move-result-object v4

    .line 3084
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 3085
    .line 3086
    iget-object v4, v4, La/h6z;->w:Landroid/widget/TextView;

    .line 3087
    .line 3088
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3089
    .line 3090
    .line 3091
    move-result-object v4

    .line 3092
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3093
    .line 3094
    .line 3095
    check-cast v4, La/a3e;

    .line 3096
    .line 3097
    invoke-virtual {v8}, La/n3w;->b()Z

    .line 3098
    .line 3099
    .line 3100
    move-result v5

    .line 3101
    if-eqz v5, :cond_56

    .line 3102
    .line 3103
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3104
    .line 3105
    .line 3106
    move-result-object v5

    .line 3107
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3108
    .line 3109
    iget-object v5, v5, La/h6z;->v:Landroidx/constraintlayout/widget/Group;

    .line 3110
    .line 3111
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 3112
    .line 3113
    .line 3114
    move-result v5

    .line 3115
    if-nez v5, :cond_55

    .line 3116
    .line 3117
    goto :goto_41

    .line 3118
    :cond_55
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3119
    .line 3120
    .line 3121
    move-result-object v5

    .line 3122
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3123
    .line 3124
    iget-object v5, v5, La/h6z;->E:Landroid/widget/TextView;

    .line 3125
    .line 3126
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 3127
    .line 3128
    .line 3129
    move-result v5

    .line 3130
    iput v5, v0, La/a3e;->j:I

    .line 3131
    .line 3132
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3133
    .line 3134
    .line 3135
    move-result-object v5

    .line 3136
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3137
    .line 3138
    iget-object v5, v5, La/h6z;->O:Landroid/widget/TextView;

    .line 3139
    .line 3140
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 3141
    .line 3142
    .line 3143
    move-result v5

    .line 3144
    iput v5, v4, La/a3e;->j:I

    .line 3145
    .line 3146
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3147
    .line 3148
    .line 3149
    move-result-object v5

    .line 3150
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3151
    .line 3152
    iget-object v5, v5, La/h6z;->C:Landroid/widget/TextView;

    .line 3153
    .line 3154
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 3155
    .line 3156
    .line 3157
    move-result v5

    .line 3158
    iput v5, v1, La/a3e;->j:I

    .line 3159
    .line 3160
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3161
    .line 3162
    .line 3163
    move-result-object v5

    .line 3164
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3165
    .line 3166
    iget-object v5, v5, La/h6z;->O:Landroid/widget/TextView;

    .line 3167
    .line 3168
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3169
    .line 3170
    .line 3171
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3172
    .line 3173
    .line 3174
    move-result-object v0

    .line 3175
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3176
    .line 3177
    iget-object v0, v0, La/h6z;->E:Landroid/widget/TextView;

    .line 3178
    .line 3179
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3180
    .line 3181
    .line 3182
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v0

    .line 3186
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3187
    .line 3188
    iget-object v0, v0, La/h6z;->w:Landroid/widget/TextView;

    .line 3189
    .line 3190
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3191
    .line 3192
    .line 3193
    :cond_56
    :goto_41
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v0

    .line 3197
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3198
    .line 3199
    iget-object v0, v0, La/h6z;->O:Landroid/widget/TextView;

    .line 3200
    .line 3201
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3202
    .line 3203
    .line 3204
    move-result-object v0

    .line 3205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3206
    .line 3207
    .line 3208
    check-cast v0, La/a3e;

    .line 3209
    .line 3210
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3211
    .line 3212
    .line 3213
    move-result-object v1

    .line 3214
    iget-object v1, v1, La/q0r;->b:La/h6z;

    .line 3215
    .line 3216
    iget-object v1, v1, La/h6z;->c:Landroid/widget/TextView;

    .line 3217
    .line 3218
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3219
    .line 3220
    .line 3221
    move-result-object v1

    .line 3222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3223
    .line 3224
    .line 3225
    check-cast v1, La/a3e;

    .line 3226
    .line 3227
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3228
    .line 3229
    .line 3230
    move-result-object v4

    .line 3231
    iget-object v4, v4, La/q0r;->b:La/h6z;

    .line 3232
    .line 3233
    iget-object v4, v4, La/h6z;->l0:Landroid/widget/TextView;

    .line 3234
    .line 3235
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 3236
    .line 3237
    .line 3238
    move-result-object v4

    .line 3239
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3240
    .line 3241
    .line 3242
    check-cast v4, La/a3e;

    .line 3243
    .line 3244
    invoke-virtual {v8}, La/n3w;->e()Z

    .line 3245
    .line 3246
    .line 3247
    move-result v5

    .line 3248
    if-eqz v5, :cond_57

    .line 3249
    .line 3250
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3251
    .line 3252
    .line 3253
    move-result-object v5

    .line 3254
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3255
    .line 3256
    iget-object v5, v5, La/h6z;->c:Landroid/widget/TextView;

    .line 3257
    .line 3258
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 3259
    .line 3260
    .line 3261
    move-result v5

    .line 3262
    iput v5, v0, La/a3e;->j:I

    .line 3263
    .line 3264
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3265
    .line 3266
    .line 3267
    move-result-object v5

    .line 3268
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3269
    .line 3270
    iget-object v5, v5, La/h6z;->O:Landroid/widget/TextView;

    .line 3271
    .line 3272
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 3273
    .line 3274
    .line 3275
    move-result v5

    .line 3276
    iput v5, v4, La/a3e;->j:I

    .line 3277
    .line 3278
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3279
    .line 3280
    .line 3281
    move-result-object v5

    .line 3282
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3283
    .line 3284
    iget-object v5, v5, La/h6z;->i0:Landroid/widget/TextView;

    .line 3285
    .line 3286
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 3287
    .line 3288
    .line 3289
    move-result v5

    .line 3290
    iput v5, v1, La/a3e;->j:I

    .line 3291
    .line 3292
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3293
    .line 3294
    .line 3295
    move-result-object v5

    .line 3296
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3297
    .line 3298
    iget-object v5, v5, La/h6z;->O:Landroid/widget/TextView;

    .line 3299
    .line 3300
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3301
    .line 3302
    .line 3303
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3304
    .line 3305
    .line 3306
    move-result-object v0

    .line 3307
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3308
    .line 3309
    iget-object v0, v0, La/h6z;->c:Landroid/widget/TextView;

    .line 3310
    .line 3311
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3312
    .line 3313
    .line 3314
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3315
    .line 3316
    .line 3317
    move-result-object v0

    .line 3318
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3319
    .line 3320
    iget-object v0, v0, La/h6z;->l0:Landroid/widget/TextView;

    .line 3321
    .line 3322
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3323
    .line 3324
    .line 3325
    :cond_57
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3326
    .line 3327
    .line 3328
    move-result-object v0

    .line 3329
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3330
    .line 3331
    iget-object v0, v0, La/h6z;->b:Landroidx/constraintlayout/widget/Group;

    .line 3332
    .line 3333
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 3334
    .line 3335
    .line 3336
    move-result-object v1

    .line 3337
    invoke-static {v8, v1}, La/zjb;->G(La/n3w;La/ctf0;)Ljava/lang/String;

    .line 3338
    .line 3339
    .line 3340
    move-result-object v1

    .line 3341
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 3342
    .line 3343
    .line 3344
    move-result v1

    .line 3345
    if-lez v1, :cond_58

    .line 3346
    .line 3347
    const/4 v1, 0x0

    .line 3348
    goto :goto_42

    .line 3349
    :cond_58
    const/16 v1, 0x8

    .line 3350
    .line 3351
    :goto_42
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 3352
    .line 3353
    .line 3354
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3355
    .line 3356
    .line 3357
    move-result-object v0

    .line 3358
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3359
    .line 3360
    iget-object v0, v0, La/h6z;->c:Landroid/widget/TextView;

    .line 3361
    .line 3362
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 3363
    .line 3364
    .line 3365
    move-result-object v1

    .line 3366
    invoke-static {v8, v1}, La/zjb;->G(La/n3w;La/ctf0;)Ljava/lang/String;

    .line 3367
    .line 3368
    .line 3369
    move-result-object v1

    .line 3370
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3371
    .line 3372
    .line 3373
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3374
    .line 3375
    .line 3376
    move-result-object v0

    .line 3377
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3378
    .line 3379
    iget-object v0, v0, La/h6z;->d:Landroid/widget/TextView;

    .line 3380
    .line 3381
    invoke-virtual {v2}, La/izv;->K0()La/ctf0;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v1

    .line 3385
    iget-object v4, v8, La/n3w;->g:Ljava/lang/String;

    .line 3386
    .line 3387
    invoke-static {v8, v1, v4}, La/zjb;->H(La/n3w;La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 3388
    .line 3389
    .line 3390
    move-result-object v1

    .line 3391
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3392
    .line 3393
    .line 3394
    iget-wide v0, v3, La/s47;->k:J

    .line 3395
    .line 3396
    iget-object v4, v8, La/n3w;->M1:Ljava/lang/String;

    .line 3397
    .line 3398
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3399
    .line 3400
    .line 3401
    move-result-object v5

    .line 3402
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3403
    .line 3404
    iget-object v5, v5, La/h6z;->r0:Landroidx/constraintlayout/widget/Group;

    .line 3405
    .line 3406
    if-eqz v30, :cond_59

    .line 3407
    .line 3408
    const/4 v6, 0x0

    .line 3409
    goto :goto_43

    .line 3410
    :cond_59
    const/16 v6, 0x8

    .line 3411
    .line 3412
    :goto_43
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 3413
    .line 3414
    .line 3415
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3416
    .line 3417
    .line 3418
    move-result-object v5

    .line 3419
    iget-object v5, v5, La/q0r;->b:La/h6z;

    .line 3420
    .line 3421
    iget-object v5, v5, La/h6z;->m0:Landroid/widget/TextView;

    .line 3422
    .line 3423
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 3424
    .line 3425
    .line 3426
    move-result-object v0

    .line 3427
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3428
    .line 3429
    .line 3430
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3431
    .line 3432
    .line 3433
    move-result-object v0

    .line 3434
    iget-object v0, v0, La/q0r;->b:La/h6z;

    .line 3435
    .line 3436
    iget-object v0, v0, La/h6z;->b0:Landroid/widget/TextView;

    .line 3437
    .line 3438
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3439
    .line 3440
    .line 3441
    iget-object v0, v3, La/s47;->m:Landroid/graphics/Bitmap;

    .line 3442
    .line 3443
    invoke-virtual {v2}, La/izv;->I0()La/q0r;

    .line 3444
    .line 3445
    .line 3446
    move-result-object v1

    .line 3447
    iget-object v1, v1, La/q0r;->i:La/nq8;

    .line 3448
    .line 3449
    iget-object v2, v1, La/nq8;->b:Landroid/view/View;

    .line 3450
    .line 3451
    check-cast v2, Landroid/widget/LinearLayout;

    .line 3452
    .line 3453
    if-eqz v30, :cond_5a

    .line 3454
    .line 3455
    if-eqz v0, :cond_5a

    .line 3456
    .line 3457
    const/4 v15, 0x0

    .line 3458
    invoke-virtual {v2, v15}, Landroid/view/View;->setVisibility(I)V

    .line 3459
    .line 3460
    .line 3461
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 3462
    .line 3463
    check-cast v1, Landroid/widget/ImageView;

    .line 3464
    .line 3465
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 3466
    .line 3467
    .line 3468
    goto :goto_44

    .line 3469
    :cond_5a
    const/16 v0, 0x8

    .line 3470
    .line 3471
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3472
    .line 3473
    .line 3474
    :cond_5b
    :goto_44
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3475
    .line 3476
    goto :goto_45

    .line 3477
    :cond_5c
    move-wide/from16 v37, v13

    .line 3478
    .line 3479
    const/16 v16, 0x1

    .line 3480
    .line 3481
    const/16 v17, 0x8

    .line 3482
    .line 3483
    goto/16 :goto_4

    .line 3484
    .line 3485
    :cond_5d
    invoke-static {}, La/t9f;->b()V

    .line 3486
    .line 3487
    .line 3488
    goto/16 :goto_2b

    .line 3489
    .line 3490
    :goto_45
    return-object v5

    .line 3491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
