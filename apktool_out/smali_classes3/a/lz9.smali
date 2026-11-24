.class public final La/lz9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rg90;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qog0;

.field public final synthetic c:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(La/qog0;Landroidx/fragment/app/Fragment;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lz9;->a:B

    iput-object p1, p0, La/lz9;->b:La/qog0;

    iput-object p2, p0, La/lz9;->c:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/ArrayList;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lz9;->a:B

    .line 4
    .line 5
    const/16 v2, 0x1e

    .line 6
    .line 7
    const-string v3, "actionDialogManager"

    .line 8
    .line 9
    const v4, 0x7f13032f

    .line 10
    .line 11
    .line 12
    const v5, 0x7f130f35

    .line 13
    .line 14
    .line 15
    const v6, 0x7f130f3a

    .line 16
    .line 17
    .line 18
    const v7, 0x7f1304dc

    .line 19
    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x1

    .line 24
    iget-object v11, v0, La/lz9;->b:La/qog0;

    .line 25
    .line 26
    iget-object v12, v0, La/lz9;->c:Landroidx/fragment/app/Fragment;

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    check-cast v12, La/mvr0;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    sget-object v1, La/mvr0;->W1:La/g9m0;

    .line 40
    .line 41
    invoke-virtual {v12}, La/mvr0;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, La/vur0;->a:La/vur0;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v1, v12, La/mvr0;->N1:La/ii;

    .line 52
    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 56
    .line 57
    invoke-virtual {v12, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    invoke-virtual {v12, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v16

    .line 69
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v12, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v17

    .line 76
    sget-object v22, La/n12;->a:La/n12;

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    const/16 v24, 0x5d0

    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const-string v19, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 107
    .line 108
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v8

    .line 116
    :pswitch_0
    check-cast v12, La/whn0;

    .line 117
    .line 118
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    sget-object v1, La/whn0;->Y1:La/s2m0;

    .line 125
    .line 126
    invoke-virtual {v12}, La/whn0;->I0()La/qm90;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, La/qm90;->c()V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    invoke-static/range {p1 .. p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_3

    .line 139
    .line 140
    sget-object v1, La/whn0;->Y1:La/s2m0;

    .line 141
    .line 142
    invoke-virtual {v12, v9}, La/whn0;->L0(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    invoke-static/range {p1 .. p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_4

    .line 151
    .line 152
    sget-object v1, La/whn0;->Y1:La/s2m0;

    .line 153
    .line 154
    invoke-virtual {v12, v10}, La/whn0;->L0(Z)V

    .line 155
    .line 156
    .line 157
    :cond_4
    :goto_1
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 158
    .line 159
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_1
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    check-cast v12, La/umj0;

    .line 168
    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    sget-object v1, La/umj0;->S1:La/lme0;

    .line 172
    .line 173
    invoke-virtual {v12}, La/umj0;->G0()La/k3t0;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    sget-object v2, La/hmj0;->a:La/hmj0;

    .line 178
    .line 179
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    sget-object v1, La/umj0;->S1:La/lme0;

    .line 184
    .line 185
    iget-object v1, v12, La/umj0;->M1:La/ii;

    .line 186
    .line 187
    if-eqz v1, :cond_6

    .line 188
    .line 189
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 190
    .line 191
    invoke-virtual {v12, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-virtual {v12, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    invoke-virtual {v12, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v17

    .line 210
    sget-object v22, La/n12;->a:La/n12;

    .line 211
    .line 212
    const/16 v23, 0x0

    .line 213
    .line 214
    const/16 v24, 0x5d0

    .line 215
    .line 216
    const/16 v18, 0x0

    .line 217
    .line 218
    const-string v19, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 219
    .line 220
    const/16 v20, 0x0

    .line 221
    .line 222
    const/16 v21, 0x0

    .line 223
    .line 224
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 235
    .line 236
    .line 237
    :goto_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 241
    .line 242
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v8

    .line 250
    :pswitch_2
    check-cast v12, La/o890;

    .line 251
    .line 252
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_7

    .line 257
    .line 258
    sget-object v1, La/o890;->f2:La/jh70;

    .line 259
    .line 260
    invoke-virtual {v12}, La/o890;->L0()La/qm90;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, La/qm90;->c()V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_7
    invoke-static/range {p1 .. p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_8

    .line 273
    .line 274
    sget-object v1, La/o890;->f2:La/jh70;

    .line 275
    .line 276
    invoke-virtual {v12, v9}, La/o890;->P0(Z)V

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_8
    invoke-static/range {p1 .. p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_9

    .line 285
    .line 286
    sget-object v1, La/o890;->f2:La/jh70;

    .line 287
    .line 288
    invoke-virtual {v12, v10}, La/o890;->P0(Z)V

    .line 289
    .line 290
    .line 291
    :cond_9
    :goto_3
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 292
    .line 293
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_3
    check-cast v12, La/r790;

    .line 298
    .line 299
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_a

    .line 304
    .line 305
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 306
    .line 307
    invoke-virtual {v12}, La/r790;->H0()La/qm90;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v1}, La/qm90;->c()V

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_a
    invoke-static/range {p1 .. p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_b

    .line 320
    .line 321
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 322
    .line 323
    invoke-virtual {v12, v9}, La/r790;->K0(Z)V

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_b
    invoke-static/range {p1 .. p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-eqz v1, :cond_c

    .line 332
    .line 333
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 334
    .line 335
    invoke-virtual {v12, v10}, La/r790;->K0(Z)V

    .line 336
    .line 337
    .line 338
    :cond_c
    :goto_4
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 339
    .line 340
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_4
    check-cast v12, La/w590;

    .line 345
    .line 346
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 347
    .line 348
    if-ge v1, v2, :cond_d

    .line 349
    .line 350
    move v9, v10

    .line 351
    :cond_d
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_f

    .line 356
    .line 357
    sget-object v2, La/w590;->W1:La/mi70;

    .line 358
    .line 359
    invoke-virtual {v12}, La/w590;->I0()La/s690;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    iget-object v3, v2, La/s690;->m:La/vqc;

    .line 364
    .line 365
    invoke-virtual {v3}, La/vqc;->h()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    iget-object v2, v2, La/s690;->y:La/ol60;

    .line 370
    .line 371
    new-instance v4, La/d690;

    .line 372
    .line 373
    const/16 v5, 0x1a

    .line 374
    .line 375
    if-lt v1, v5, :cond_e

    .line 376
    .line 377
    sget-object v1, La/d590;->c:La/jh70;

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-static {}, La/jh70;->h()[Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    goto :goto_5

    .line 387
    :cond_e
    sget-object v1, La/d590;->c:La/jh70;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    const-string v1, "video/avi"

    .line 393
    .line 394
    const-string v5, "application/pdf"

    .line 395
    .line 396
    const-string v6, "image/png"

    .line 397
    .line 398
    const-string v7, "image/jpeg"

    .line 399
    .line 400
    const-string v8, "video/mp4"

    .line 401
    .line 402
    filled-new-array {v6, v7, v8, v1, v5}, [Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    :goto_5
    invoke-direct {v4, v3, v1}, La/d690;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v4}, La/ol60;->f(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_f
    invoke-static/range {p1 .. p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-eqz v1, :cond_11

    .line 418
    .line 419
    if-eqz v9, :cond_10

    .line 420
    .line 421
    sget-object v1, La/w590;->W1:La/mi70;

    .line 422
    .line 423
    invoke-virtual {v12}, La/w590;->K0()V

    .line 424
    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_10
    sget-object v1, La/w590;->W1:La/mi70;

    .line 428
    .line 429
    invoke-virtual {v12}, La/w590;->J0()V

    .line 430
    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_11
    invoke-static/range {p1 .. p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-eqz v1, :cond_13

    .line 438
    .line 439
    if-eqz v9, :cond_12

    .line 440
    .line 441
    sget-object v1, La/w590;->W1:La/mi70;

    .line 442
    .line 443
    invoke-virtual {v12}, La/w590;->K0()V

    .line 444
    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_12
    sget-object v1, La/w590;->W1:La/mi70;

    .line 448
    .line 449
    invoke-virtual {v12}, La/w590;->J0()V

    .line 450
    .line 451
    .line 452
    :cond_13
    :goto_6
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 456
    .line 457
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :pswitch_5
    check-cast v12, La/l590;

    .line 462
    .line 463
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 464
    .line 465
    if-ge v1, v2, :cond_14

    .line 466
    .line 467
    move v1, v10

    .line 468
    goto :goto_7

    .line 469
    :cond_14
    move v1, v9

    .line 470
    :goto_7
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    if-eqz v2, :cond_15

    .line 475
    .line 476
    sget-object v1, La/l590;->Y1:La/nh70;

    .line 477
    .line 478
    invoke-virtual {v12}, La/l590;->L0()La/k3t0;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    sget-object v2, La/a590;->a:La/a590;

    .line 483
    .line 484
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    goto :goto_8

    .line 488
    :cond_15
    invoke-static/range {p1 .. p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-eqz v2, :cond_17

    .line 493
    .line 494
    if-eqz v1, :cond_16

    .line 495
    .line 496
    sget-object v1, La/l590;->Y1:La/nh70;

    .line 497
    .line 498
    invoke-virtual {v12, v9}, La/l590;->N0(Z)V

    .line 499
    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_16
    sget-object v1, La/l590;->Y1:La/nh70;

    .line 503
    .line 504
    invoke-virtual {v12, v9}, La/l590;->M0(Z)V

    .line 505
    .line 506
    .line 507
    goto :goto_8

    .line 508
    :cond_17
    invoke-static/range {p1 .. p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    if-eqz v2, :cond_19

    .line 513
    .line 514
    if-eqz v1, :cond_18

    .line 515
    .line 516
    sget-object v1, La/l590;->Y1:La/nh70;

    .line 517
    .line 518
    invoke-virtual {v12, v10}, La/l590;->N0(Z)V

    .line 519
    .line 520
    .line 521
    goto :goto_8

    .line 522
    :cond_18
    sget-object v1, La/l590;->Y1:La/nh70;

    .line 523
    .line 524
    invoke-virtual {v12, v10}, La/l590;->M0(Z)V

    .line 525
    .line 526
    .line 527
    :cond_19
    :goto_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 531
    .line 532
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :pswitch_6
    check-cast v12, La/kr70;

    .line 537
    .line 538
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    if-eqz v1, :cond_1a

    .line 543
    .line 544
    sget-object v1, La/kr70;->S1:La/jh70;

    .line 545
    .line 546
    invoke-virtual {v12}, La/kr70;->G0()La/k3t0;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    sget-object v2, La/cq70;->a:La/cq70;

    .line 551
    .line 552
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_1a
    invoke-static/range {p1 .. p1}, La/n7x;->t(Ljava/util/ArrayList;)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_1b

    .line 561
    .line 562
    sget-object v1, La/kr70;->S1:La/jh70;

    .line 563
    .line 564
    invoke-virtual {v12}, La/kr70;->G0()La/k3t0;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    new-instance v2, La/hq70;

    .line 569
    .line 570
    const-string v3, "PERMISSION_DIALOG"

    .line 571
    .line 572
    invoke-direct {v2, v3}, La/hq70;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    goto :goto_9

    .line 579
    :cond_1b
    invoke-static/range {p1 .. p1}, La/n7x;->s(Ljava/util/ArrayList;)Z

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-eqz v1, :cond_1c

    .line 584
    .line 585
    sget-object v1, La/kr70;->S1:La/jh70;

    .line 586
    .line 587
    invoke-virtual {v12}, La/kr70;->G0()La/k3t0;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    new-instance v2, La/hq70;

    .line 592
    .line 593
    const-string v3, "APP_SETTINGS_DIALOG"

    .line 594
    .line 595
    invoke-direct {v2, v3}, La/hq70;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    :cond_1c
    :goto_9
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 605
    .line 606
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    return-void

    .line 610
    :pswitch_7
    check-cast v12, La/qz9;

    .line 611
    .line 612
    sget-object v1, La/qz9;->t2:La/kl5;

    .line 613
    .line 614
    invoke-virtual {v12}, La/qz9;->S0()La/d4a;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-static/range {p1 .. p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-eqz v2, :cond_1d

    .line 623
    .line 624
    iget-object v1, v1, La/d4a;->h:La/p7m0;

    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    sget-object v2, La/flu0;->a:La/flu0;

    .line 630
    .line 631
    invoke-virtual {v1, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_1d
    sget-object v2, La/v0k0;->a:La/v0k0;

    .line 636
    .line 637
    invoke-virtual {v1, v2}, La/d4a;->C(La/a1k0;)V

    .line 638
    .line 639
    .line 640
    :goto_a
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    iget-object v1, v11, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 644
    .line 645
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    return-void

    .line 649
    :pswitch_data_0
    .packed-switch 0x0
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
