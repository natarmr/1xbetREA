.class public final synthetic La/li8;
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
    iput-byte p7, p0, La/li8;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/li8;->a:B

    .line 4
    .line 5
    const-string v2, "snackbarManager"

    .line 6
    .line 7
    const-string v3, "actionDialogManager"

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
    check-cast v1, La/oj2;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/xra;

    .line 23
    .line 24
    sget-object v2, La/xra;->X1:La/cl5;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v2, La/oj2;->a:La/oj2;

    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const-string v1, "REMOVE_ALL_TOURNAMENTS_RESULT"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/xra;->T0(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, La/xra;->R0()La/k3t0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, La/si2;->a:La/si2;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-object v4

    .line 58
    :pswitch_0
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, La/vh2;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, La/k3t0;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

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
    check-cast v1, La/di2;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, La/xra;

    .line 85
    .line 86
    sget-object v2, La/xra;->X1:La/cl5;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget-object v2, La/di2;->a:La/di2;

    .line 92
    .line 93
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    const-string v1, "REMOVE_ALL_TEAM_RESULT"

    .line 100
    .line 101
    invoke-virtual {v0, v1}, La/xra;->T0(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, La/xra;->Q0()La/k3t0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v1, La/kh2;->a:La/kh2;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 117
    .line 118
    .line 119
    :goto_1
    return-object v4

    .line 120
    :pswitch_2
    move-object/from16 v1, p1

    .line 121
    .line 122
    check-cast v1, La/gg2;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La/k3t0;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_3
    move-object/from16 v1, p1

    .line 138
    .line 139
    check-cast v1, La/tg2;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, La/xra;

    .line 147
    .line 148
    sget-object v2, La/xra;->X1:La/cl5;

    .line 149
    .line 150
    instance-of v2, v1, La/ng2;

    .line 151
    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iget-object v2, v2, La/pbi;->b:La/itr;

    .line 159
    .line 160
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    check-cast v1, La/ng2;

    .line 168
    .line 169
    iget-object v1, v1, La/ng2;->a:La/sjd;

    .line 170
    .line 171
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_2

    .line 175
    .line 176
    :cond_2
    instance-of v2, v1, La/qg2;

    .line 177
    .line 178
    if-eqz v2, :cond_3

    .line 179
    .line 180
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iget-object v2, v2, La/pbi;->c:La/bwl;

    .line 185
    .line 186
    iget-object v2, v2, La/bwl;->a:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, La/dbi;

    .line 189
    .line 190
    invoke-virtual {v2}, La/dbi;->o()La/jw20;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v1, La/qg2;

    .line 195
    .line 196
    iget-object v1, v1, La/qg2;->a:La/j2g0;

    .line 197
    .line 198
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    iget-object v3, v3, La/pbi;->e:La/ctf0;

    .line 203
    .line 204
    invoke-virtual {v2, v0, v3, v1}, La/jw20;->r(Landroidx/fragment/app/Fragment;La/ctf0;La/j2g0;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_2

    .line 208
    .line 209
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    instance-of v2, v1, La/sg2;

    .line 213
    .line 214
    if-eqz v2, :cond_4

    .line 215
    .line 216
    sget-object v1, La/s6p;->o2:La/pek;

    .line 217
    .line 218
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    sget-object v3, La/wep;->a:La/wep;

    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    const-string v1, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 231
    .line 232
    invoke-static {v2, v3, v1}, La/pek;->p(Landroidx/fragment/app/e;La/wep;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_2

    .line 236
    .line 237
    :cond_4
    sget-object v2, La/rg2;->a:La/rg2;

    .line 238
    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_5

    .line 244
    .line 245
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iget-object v1, v1, La/pbi;->d:La/ii;

    .line 250
    .line 251
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 252
    .line 253
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    iget-object v3, v3, La/pbi;->e:La/ctf0;

    .line 258
    .line 259
    const/4 v4, 0x0

    .line 260
    new-array v5, v4, [Ljava/lang/Object;

    .line 261
    .line 262
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 263
    .line 264
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    const v6, 0x7f13046c

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    iget-object v5, v5, La/pbi;->e:La/ctf0;

    .line 280
    .line 281
    new-array v7, v4, [Ljava/lang/Object;

    .line 282
    .line 283
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 284
    .line 285
    invoke-static {v7, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    const v8, 0x7f1304d8

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    iget-object v7, v7, La/pbi;->e:La/ctf0;

    .line 301
    .line 302
    new-array v8, v4, [Ljava/lang/Object;

    .line 303
    .line 304
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 305
    .line 306
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    invoke-virtual {v7, v6, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {v0}, La/xra;->N0()La/pbi;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    iget-object v7, v7, La/pbi;->e:La/ctf0;

    .line 319
    .line 320
    new-array v8, v4, [Ljava/lang/Object;

    .line 321
    .line 322
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 323
    .line 324
    invoke-static {v8, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    const v8, 0x7f13032f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v7, v8, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    sget-object v11, La/n12;->a:La/n12;

    .line 336
    .line 337
    const/4 v12, 0x0

    .line 338
    const/16 v13, 0x5d0

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    const-string v8, "REQUEST_CLEAR_GROUPS_DIALOG_KEY"

    .line 342
    .line 343
    const/4 v9, 0x0

    .line 344
    const/4 v10, 0x0

    .line 345
    move-object/from16 v20, v6

    .line 346
    .line 347
    move-object v6, v4

    .line 348
    move-object v4, v5

    .line 349
    move-object/from16 v5, v20

    .line 350
    .line 351
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 362
    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_5
    sget-object v2, La/pg2;->a:La/pg2;

    .line 366
    .line 367
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_6

    .line 372
    .line 373
    invoke-virtual {v0}, La/xra;->O0()La/k3t0;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    sget-object v2, La/cra;->a:La/cra;

    .line 378
    .line 379
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    goto :goto_2

    .line 383
    :cond_6
    sget-object v2, La/og2;->a:La/og2;

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_7

    .line 390
    .line 391
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 399
    .line 400
    .line 401
    :goto_2
    invoke-virtual {v0}, La/xra;->P0()La/k3t0;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    sget-object v1, La/qf2;->a:La/qf2;

    .line 406
    .line 407
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    goto :goto_3

    .line 413
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 414
    .line 415
    .line 416
    :goto_3
    return-object v4

    .line 417
    :pswitch_4
    move-object/from16 v1, p1

    .line 418
    .line 419
    check-cast v1, La/yl2;

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v0, La/k3t0;

    .line 427
    .line 428
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_5
    move-object/from16 v1, p1

    .line 435
    .line 436
    check-cast v1, La/qt9;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, La/k3t0;

    .line 444
    .line 445
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_6
    move-object/from16 v1, p1

    .line 452
    .line 453
    check-cast v1, La/qt9;

    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v0, La/k3t0;

    .line 461
    .line 462
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_7
    move-object/from16 v1, p1

    .line 469
    .line 470
    check-cast v1, La/du9;

    .line 471
    .line 472
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 476
    .line 477
    move-object v7, v0

    .line 478
    check-cast v7, La/ut9;

    .line 479
    .line 480
    sget-object v0, La/ut9;->s2:La/bj5;

    .line 481
    .line 482
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    instance-of v0, v1, La/au9;

    .line 486
    .line 487
    if-eqz v0, :cond_a

    .line 488
    .line 489
    iget-object v0, v7, La/sik;->S1:Landroid/app/Dialog;

    .line 490
    .line 491
    if-eqz v0, :cond_8

    .line 492
    .line 493
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-eqz v0, :cond_8

    .line 498
    .line 499
    const v3, 0x1020002

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v3}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    check-cast v0, Landroid/view/ViewGroup;

    .line 507
    .line 508
    move-object v9, v0

    .line 509
    goto :goto_4

    .line 510
    :cond_8
    move-object v9, v4

    .line 511
    :goto_4
    iget-object v5, v7, La/ut9;->m2:La/wdk0;

    .line 512
    .line 513
    if-eqz v5, :cond_9

    .line 514
    .line 515
    new-instance v6, La/xdk0;

    .line 516
    .line 517
    sget-object v11, La/rek0;->b:La/rek0;

    .line 518
    .line 519
    check-cast v1, La/au9;

    .line 520
    .line 521
    iget-object v12, v1, La/au9;->a:Ljava/lang/String;

    .line 522
    .line 523
    const/16 v16, 0x0

    .line 524
    .line 525
    const/16 v17, 0x7c

    .line 526
    .line 527
    const/4 v13, 0x0

    .line 528
    const/4 v14, 0x0

    .line 529
    const/4 v15, 0x0

    .line 530
    move-object v10, v6

    .line 531
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 532
    .line 533
    .line 534
    const/4 v11, 0x0

    .line 535
    const/16 v12, 0x3f4

    .line 536
    .line 537
    const/4 v8, 0x0

    .line 538
    const/4 v10, 0x0

    .line 539
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 540
    .line 541
    .line 542
    goto/16 :goto_5

    .line 543
    .line 544
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    throw v4

    .line 548
    :cond_a
    instance-of v0, v1, La/cu9;

    .line 549
    .line 550
    if-eqz v0, :cond_c

    .line 551
    .line 552
    iget-object v0, v7, La/ut9;->k2:La/ii;

    .line 553
    .line 554
    if-eqz v0, :cond_b

    .line 555
    .line 556
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 557
    .line 558
    const v1, 0x7f130162

    .line 559
    .line 560
    .line 561
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v9

    .line 565
    const v1, 0x7f1310ba

    .line 566
    .line 567
    .line 568
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    const v1, 0x7f1310b7

    .line 573
    .line 574
    .line 575
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v11

    .line 579
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    const v1, 0x7f1310b4

    .line 583
    .line 584
    .line 585
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v12

    .line 589
    sget-object v17, La/n12;->a:La/n12;

    .line 590
    .line 591
    const/16 v18, 0x0

    .line 592
    .line 593
    const/16 v19, 0x5d0

    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    const-string v14, "DIALOG_EXIT_WITHOUT_SAVE_REQUEST"

    .line 597
    .line 598
    const/4 v15, 0x0

    .line 599
    const/16 v16, 0x0

    .line 600
    .line 601
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 612
    .line 613
    .line 614
    goto :goto_5

    .line 615
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    throw v4

    .line 619
    :cond_c
    instance-of v0, v1, La/bu9;

    .line 620
    .line 621
    if-eqz v0, :cond_e

    .line 622
    .line 623
    iget-object v0, v7, La/ut9;->k2:La/ii;

    .line 624
    .line 625
    if-eqz v0, :cond_d

    .line 626
    .line 627
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 628
    .line 629
    const v1, 0x7f130431

    .line 630
    .line 631
    .line 632
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v9

    .line 636
    const v1, 0x7f130432

    .line 637
    .line 638
    .line 639
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v10

    .line 643
    const v1, 0x7f130e5c

    .line 644
    .line 645
    .line 646
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v11

    .line 650
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    sget-object v17, La/n12;->c:La/n12;

    .line 654
    .line 655
    const/16 v18, 0x0

    .line 656
    .line 657
    const/16 v19, 0x5d8

    .line 658
    .line 659
    const/4 v12, 0x0

    .line 660
    const/4 v13, 0x0

    .line 661
    const-string v14, "DIALOG_EXIT_WITH_SUCCESS_REQUEST"

    .line 662
    .line 663
    const/4 v15, 0x0

    .line 664
    const/16 v16, 0x0

    .line 665
    .line 666
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 677
    .line 678
    .line 679
    goto :goto_5

    .line 680
    :cond_d
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v4

    .line 684
    :cond_e
    :goto_5
    invoke-virtual {v7}, La/ut9;->P0()La/k3t0;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    sget-object v1, La/kt9;->a:La/kt9;

    .line 689
    .line 690
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 694
    .line 695
    return-object v0

    .line 696
    :pswitch_8
    move-object/from16 v1, p1

    .line 697
    .line 698
    check-cast v1, Ljava/lang/Number;

    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 701
    .line 702
    .line 703
    move-result-wide v5

    .line 704
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 705
    .line 706
    move-object v1, v0

    .line 707
    check-cast v1, La/mr9;

    .line 708
    .line 709
    iget-object v0, v1, La/mr9;->i:La/ehf0;

    .line 710
    .line 711
    invoke-virtual {v0}, La/ehf0;->o()V

    .line 712
    .line 713
    .line 714
    iget-object v7, v1, La/mr9;->l:La/p7m0;

    .line 715
    .line 716
    :cond_f
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    move-object v8, v0

    .line 721
    check-cast v8, La/es9;

    .line 722
    .line 723
    iget-object v2, v8, La/es9;->a:Ljava/util/List;

    .line 724
    .line 725
    new-instance v3, Ljava/util/ArrayList;

    .line 726
    .line 727
    const/16 v9, 0xa

    .line 728
    .line 729
    invoke-static {v2, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 730
    .line 731
    .line 732
    move-result v9

    .line 733
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 734
    .line 735
    .line 736
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v9

    .line 744
    if-eqz v9, :cond_10

    .line 745
    .line 746
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v9

    .line 750
    check-cast v9, La/xq9;

    .line 751
    .line 752
    iget-object v9, v9, La/xq9;->b:Ljava/util/List;

    .line 753
    .line 754
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_6

    .line 758
    :cond_10
    invoke-static {v3}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    if-eqz v3, :cond_12

    .line 771
    .line 772
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    move-object v9, v3

    .line 777
    check-cast v9, La/it9;

    .line 778
    .line 779
    iget-wide v9, v9, La/it9;->a:J

    .line 780
    .line 781
    cmp-long v9, v9, v5

    .line 782
    .line 783
    if-nez v9, :cond_11

    .line 784
    .line 785
    goto :goto_7

    .line 786
    :cond_12
    move-object v3, v4

    .line 787
    :goto_7
    check-cast v3, La/it9;

    .line 788
    .line 789
    new-instance v12, La/sp9;

    .line 790
    .line 791
    if-eqz v3, :cond_13

    .line 792
    .line 793
    iget-wide v9, v3, La/it9;->a:J

    .line 794
    .line 795
    goto :goto_8

    .line 796
    :cond_13
    move-wide v9, v5

    .line 797
    :goto_8
    if-eqz v3, :cond_14

    .line 798
    .line 799
    iget-object v2, v3, La/it9;->e:Ljava/lang/String;

    .line 800
    .line 801
    goto :goto_9

    .line 802
    :cond_14
    move-object v2, v4

    .line 803
    :goto_9
    invoke-direct {v12, v9, v10, v2}, La/sp9;-><init>(JLjava/lang/String;)V

    .line 804
    .line 805
    .line 806
    const/4 v13, 0x7

    .line 807
    const/4 v9, 0x0

    .line 808
    const/4 v10, 0x0

    .line 809
    const/4 v11, 0x0

    .line 810
    invoke-static/range {v8 .. v13}, La/es9;->a(La/es9;Ljava/util/List;La/ds9;ZLa/sp9;I)La/es9;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-virtual {v7, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v0

    .line 818
    if-eqz v0, :cond_f

    .line 819
    .line 820
    iget-object v0, v1, La/mr9;->n:La/p7m0;

    .line 821
    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    sget-object v1, La/qq9;->a:La/qq9;

    .line 826
    .line 827
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 831
    .line 832
    return-object v0

    .line 833
    :pswitch_9
    move-object/from16 v1, p1

    .line 834
    .line 835
    check-cast v1, La/as9;

    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 841
    .line 842
    move-object v7, v0

    .line 843
    check-cast v7, La/wq9;

    .line 844
    .line 845
    sget-object v0, La/wq9;->S1:La/gl5;

    .line 846
    .line 847
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    instance-of v0, v1, La/xr9;

    .line 851
    .line 852
    if-eqz v0, :cond_16

    .line 853
    .line 854
    iget-object v0, v7, La/wq9;->M1:La/ii;

    .line 855
    .line 856
    if-eqz v0, :cond_15

    .line 857
    .line 858
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 859
    .line 860
    const v1, 0x7f13142c

    .line 861
    .line 862
    .line 863
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v9

    .line 867
    const v1, 0x7f13143d

    .line 868
    .line 869
    .line 870
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v10

    .line 874
    const v1, 0x7f131843

    .line 875
    .line 876
    .line 877
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v11

    .line 881
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    const v1, 0x7f130e07

    .line 885
    .line 886
    .line 887
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v12

    .line 891
    sget-object v17, La/n12;->a:La/n12;

    .line 892
    .line 893
    const/16 v18, 0x0

    .line 894
    .line 895
    const/16 v19, 0x5d0

    .line 896
    .line 897
    const/4 v13, 0x0

    .line 898
    const-string v14, "CANCEL_REQUEST_DIALOG_KEY"

    .line 899
    .line 900
    const/4 v15, 0x0

    .line 901
    const/16 v16, 0x0

    .line 902
    .line 903
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 914
    .line 915
    .line 916
    goto :goto_a

    .line 917
    :cond_15
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    throw v4

    .line 921
    :cond_16
    instance-of v0, v1, La/yr9;

    .line 922
    .line 923
    if-eqz v0, :cond_18

    .line 924
    .line 925
    iget-object v5, v7, La/wq9;->N1:La/wdk0;

    .line 926
    .line 927
    if-eqz v5, :cond_17

    .line 928
    .line 929
    new-instance v6, La/xdk0;

    .line 930
    .line 931
    sget-object v9, La/rek0;->b:La/rek0;

    .line 932
    .line 933
    const v0, 0x7f1307d0

    .line 934
    .line 935
    .line 936
    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v10

    .line 940
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    const/4 v14, 0x0

    .line 944
    const/16 v15, 0x7c

    .line 945
    .line 946
    const/4 v11, 0x0

    .line 947
    const/4 v12, 0x0

    .line 948
    const/4 v13, 0x0

    .line 949
    move-object v8, v6

    .line 950
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 951
    .line 952
    .line 953
    const/16 v12, 0x3fc

    .line 954
    .line 955
    const/4 v8, 0x0

    .line 956
    const/4 v9, 0x0

    .line 957
    const/4 v10, 0x0

    .line 958
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 959
    .line 960
    .line 961
    goto :goto_a

    .line 962
    :cond_17
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    throw v4

    .line 966
    :cond_18
    instance-of v0, v1, La/zr9;

    .line 967
    .line 968
    if-eqz v0, :cond_1a

    .line 969
    .line 970
    check-cast v1, La/zr9;

    .line 971
    .line 972
    iget-object v10, v1, La/zr9;->a:Ljava/lang/String;

    .line 973
    .line 974
    iget-object v5, v7, La/wq9;->N1:La/wdk0;

    .line 975
    .line 976
    if-eqz v5, :cond_19

    .line 977
    .line 978
    new-instance v6, La/xdk0;

    .line 979
    .line 980
    sget-object v9, La/pek0;->a:La/pek0;

    .line 981
    .line 982
    const/4 v14, 0x0

    .line 983
    const/16 v15, 0x7c

    .line 984
    .line 985
    const/4 v11, 0x0

    .line 986
    const/4 v12, 0x0

    .line 987
    const/4 v13, 0x0

    .line 988
    move-object v8, v6

    .line 989
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 990
    .line 991
    .line 992
    const/16 v12, 0x3fc

    .line 993
    .line 994
    const/4 v8, 0x0

    .line 995
    const/4 v9, 0x0

    .line 996
    const/4 v10, 0x0

    .line 997
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 998
    .line 999
    .line 1000
    goto :goto_a

    .line 1001
    :cond_19
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    throw v4

    .line 1005
    :cond_1a
    instance-of v0, v1, La/wr9;

    .line 1006
    .line 1007
    if-eqz v0, :cond_1b

    .line 1008
    .line 1009
    sget-object v0, La/ut9;->s2:La/bj5;

    .line 1010
    .line 1011
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v2

    .line 1015
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1016
    .line 1017
    .line 1018
    check-cast v1, La/wr9;

    .line 1019
    .line 1020
    iget-wide v3, v1, La/wr9;->a:J

    .line 1021
    .line 1022
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v2, v3, v4}, La/bj5;->d(Landroidx/fragment/app/e;J)V

    .line 1026
    .line 1027
    .line 1028
    :goto_a
    invoke-virtual {v7}, La/wq9;->G0()La/k3t0;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    sget-object v1, La/cq9;->a:La/cq9;

    .line 1033
    .line 1034
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1035
    .line 1036
    .line 1037
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1038
    .line 1039
    goto :goto_b

    .line 1040
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 1041
    .line 1042
    .line 1043
    :goto_b
    return-object v4

    .line 1044
    :pswitch_a
    move-object/from16 v1, p1

    .line 1045
    .line 1046
    check-cast v1, La/nq9;

    .line 1047
    .line 1048
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, La/k3t0;

    .line 1054
    .line 1055
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1056
    .line 1057
    .line 1058
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1059
    .line 1060
    return-object v0

    .line 1061
    :pswitch_b
    move-object/from16 v1, p1

    .line 1062
    .line 1063
    check-cast v1, Ljava/lang/String;

    .line 1064
    .line 1065
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v0, La/gd9;

    .line 1071
    .line 1072
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v1}, La/gd9;->a(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    return-object v0

    .line 1080
    :pswitch_c
    move-object/from16 v1, p1

    .line 1081
    .line 1082
    check-cast v1, La/ha9;

    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1088
    .line 1089
    check-cast v0, La/k3t0;

    .line 1090
    .line 1091
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1092
    .line 1093
    .line 1094
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1095
    .line 1096
    return-object v0

    .line 1097
    :pswitch_d
    move-object/from16 v1, p1

    .line 1098
    .line 1099
    check-cast v1, La/oa9;

    .line 1100
    .line 1101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v0, La/ka9;

    .line 1107
    .line 1108
    sget-object v2, La/ka9;->Q1:La/cl5;

    .line 1109
    .line 1110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    instance-of v2, v1, La/na9;

    .line 1114
    .line 1115
    if-eqz v2, :cond_1d

    .line 1116
    .line 1117
    sget v1, La/esc;->m2:I

    .line 1118
    .line 1119
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v1

    .line 1123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    const-string v2, "CLEAR_TEAMS_DIALOG_TAG"

    .line 1127
    .line 1128
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v3

    .line 1132
    if-eqz v3, :cond_1c

    .line 1133
    .line 1134
    goto :goto_c

    .line 1135
    :cond_1c
    new-instance v3, La/esc;

    .line 1136
    .line 1137
    invoke-direct {v3}, La/esc;-><init>()V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    goto :goto_c

    .line 1144
    :cond_1d
    instance-of v1, v1, La/ma9;

    .line 1145
    .line 1146
    if-eqz v1, :cond_1f

    .line 1147
    .line 1148
    sget v1, La/dn90;->m2:I

    .line 1149
    .line 1150
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v1

    .line 1154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    const-string v2, "PICK_DUEL_SUB_GAME_DIALOG_TAG"

    .line 1158
    .line 1159
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v3

    .line 1163
    if-eqz v3, :cond_1e

    .line 1164
    .line 1165
    goto :goto_c

    .line 1166
    :cond_1e
    new-instance v3, La/dn90;

    .line 1167
    .line 1168
    invoke-direct {v3}, La/dn90;-><init>()V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    :goto_c
    iget-object v0, v0, La/ka9;->P1:La/a8z;

    .line 1175
    .line 1176
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    check-cast v0, La/k3t0;

    .line 1181
    .line 1182
    sget-object v1, La/z99;->a:La/z99;

    .line 1183
    .line 1184
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1188
    .line 1189
    goto :goto_d

    .line 1190
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1191
    .line 1192
    .line 1193
    :goto_d
    return-object v4

    .line 1194
    :pswitch_e
    move-object/from16 v1, p1

    .line 1195
    .line 1196
    check-cast v1, La/y09;

    .line 1197
    .line 1198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1202
    .line 1203
    check-cast v0, La/k3t0;

    .line 1204
    .line 1205
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1206
    .line 1207
    .line 1208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :pswitch_f
    move-object/from16 v1, p1

    .line 1212
    .line 1213
    check-cast v1, La/qz8;

    .line 1214
    .line 1215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1219
    .line 1220
    check-cast v0, La/k3t0;

    .line 1221
    .line 1222
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1223
    .line 1224
    .line 1225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1226
    .line 1227
    return-object v0

    .line 1228
    :pswitch_10
    move-object/from16 v1, p1

    .line 1229
    .line 1230
    check-cast v1, La/wy8;

    .line 1231
    .line 1232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1233
    .line 1234
    .line 1235
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v0, La/k3t0;

    .line 1238
    .line 1239
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1243
    .line 1244
    return-object v0

    .line 1245
    :pswitch_11
    move-object/from16 v1, p1

    .line 1246
    .line 1247
    check-cast v1, La/bz8;

    .line 1248
    .line 1249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1253
    .line 1254
    check-cast v0, La/yy8;

    .line 1255
    .line 1256
    sget-object v2, La/yy8;->Q1:La/gl5;

    .line 1257
    .line 1258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    sget-object v2, La/bz8;->a:La/bz8;

    .line 1262
    .line 1263
    invoke-virtual {v1, v2}, La/bz8;->equals(Ljava/lang/Object;)Z

    .line 1264
    .line 1265
    .line 1266
    move-result v1

    .line 1267
    if-eqz v1, :cond_20

    .line 1268
    .line 1269
    invoke-static {v0}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 1270
    .line 1271
    .line 1272
    iget-object v0, v0, La/yy8;->M1:La/a8z;

    .line 1273
    .line 1274
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    check-cast v0, La/k3t0;

    .line 1279
    .line 1280
    sget-object v1, La/uy8;->a:La/uy8;

    .line 1281
    .line 1282
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1283
    .line 1284
    .line 1285
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1286
    .line 1287
    goto :goto_e

    .line 1288
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 1289
    .line 1290
    .line 1291
    :goto_e
    return-object v4

    .line 1292
    :pswitch_12
    move-object/from16 v1, p1

    .line 1293
    .line 1294
    check-cast v1, La/su8;

    .line 1295
    .line 1296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v0, La/k3t0;

    .line 1302
    .line 1303
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1304
    .line 1305
    .line 1306
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1307
    .line 1308
    return-object v0

    .line 1309
    :pswitch_13
    move-object/from16 v1, p1

    .line 1310
    .line 1311
    check-cast v1, La/lv8;

    .line 1312
    .line 1313
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1314
    .line 1315
    .line 1316
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1317
    .line 1318
    check-cast v0, La/k3t0;

    .line 1319
    .line 1320
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1321
    .line 1322
    .line 1323
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1324
    .line 1325
    return-object v0

    .line 1326
    :pswitch_14
    move-object/from16 v1, p1

    .line 1327
    .line 1328
    check-cast v1, La/iw8;

    .line 1329
    .line 1330
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1331
    .line 1332
    .line 1333
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1334
    .line 1335
    check-cast v0, La/tv8;

    .line 1336
    .line 1337
    sget-object v2, La/tv8;->N1:La/yk5;

    .line 1338
    .line 1339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1340
    .line 1341
    .line 1342
    iget-object v2, v1, La/iw8;->a:Ljava/util/List;

    .line 1343
    .line 1344
    iget-object v1, v1, La/iw8;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 1345
    .line 1346
    sget-object v3, La/jlk0;->n2:La/lme0;

    .line 1347
    .line 1348
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v4

    .line 1352
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1356
    .line 1357
    .line 1358
    const-string v3, "BRAND_GAMES_SELECT_SORT_OPTION_REQUEST_KEY"

    .line 1359
    .line 1360
    invoke-static {v4, v3, v2, v1}, La/lme0;->b(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;)V

    .line 1361
    .line 1362
    .line 1363
    iget-object v0, v0, La/tv8;->M1:La/a8z;

    .line 1364
    .line 1365
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v0

    .line 1369
    check-cast v0, La/k3t0;

    .line 1370
    .line 1371
    sget-object v1, La/dv8;->a:La/dv8;

    .line 1372
    .line 1373
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1374
    .line 1375
    .line 1376
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1377
    .line 1378
    return-object v0

    .line 1379
    :pswitch_15
    move-object/from16 v1, p1

    .line 1380
    .line 1381
    check-cast v1, Ljava/lang/Throwable;

    .line 1382
    .line 1383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1384
    .line 1385
    .line 1386
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v0, La/jm8;

    .line 1389
    .line 1390
    invoke-virtual {v0, v1}, La/jm8;->N(Ljava/lang/Throwable;)V

    .line 1391
    .line 1392
    .line 1393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1394
    .line 1395
    return-object v0

    .line 1396
    :pswitch_16
    move-object/from16 v1, p1

    .line 1397
    .line 1398
    check-cast v1, Ljava/lang/Throwable;

    .line 1399
    .line 1400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1401
    .line 1402
    .line 1403
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v0, La/jm8;

    .line 1406
    .line 1407
    invoke-virtual {v0, v1}, La/jm8;->N(Ljava/lang/Throwable;)V

    .line 1408
    .line 1409
    .line 1410
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1411
    .line 1412
    return-object v0

    .line 1413
    :pswitch_17
    move-object/from16 v1, p1

    .line 1414
    .line 1415
    check-cast v1, Ljava/lang/Throwable;

    .line 1416
    .line 1417
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1418
    .line 1419
    .line 1420
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v0, La/jm8;

    .line 1423
    .line 1424
    invoke-virtual {v0, v1}, La/jm8;->N(Ljava/lang/Throwable;)V

    .line 1425
    .line 1426
    .line 1427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1428
    .line 1429
    return-object v0

    .line 1430
    :pswitch_18
    move-object/from16 v1, p1

    .line 1431
    .line 1432
    check-cast v1, Ljava/lang/Throwable;

    .line 1433
    .line 1434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1435
    .line 1436
    .line 1437
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v0, La/jm8;

    .line 1440
    .line 1441
    invoke-virtual {v0, v1}, La/jm8;->N(Ljava/lang/Throwable;)V

    .line 1442
    .line 1443
    .line 1444
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1445
    .line 1446
    return-object v0

    .line 1447
    :pswitch_19
    move-object/from16 v1, p1

    .line 1448
    .line 1449
    check-cast v1, Ljava/lang/Throwable;

    .line 1450
    .line 1451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1452
    .line 1453
    .line 1454
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1455
    .line 1456
    check-cast v0, La/jm8;

    .line 1457
    .line 1458
    invoke-virtual {v0, v1}, La/jm8;->N(Ljava/lang/Throwable;)V

    .line 1459
    .line 1460
    .line 1461
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1462
    .line 1463
    return-object v0

    .line 1464
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1465
    .line 1466
    check-cast v1, La/si8;

    .line 1467
    .line 1468
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1469
    .line 1470
    .line 1471
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1472
    .line 1473
    check-cast v0, La/k3t0;

    .line 1474
    .line 1475
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1476
    .line 1477
    .line 1478
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1479
    .line 1480
    return-object v0

    .line 1481
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1482
    .line 1483
    check-cast v1, La/ci8;

    .line 1484
    .line 1485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1486
    .line 1487
    .line 1488
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v0, La/k3t0;

    .line 1491
    .line 1492
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1493
    .line 1494
    .line 1495
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1496
    .line 1497
    return-object v0

    .line 1498
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1499
    .line 1500
    check-cast v1, La/sk8;

    .line 1501
    .line 1502
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1503
    .line 1504
    .line 1505
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1506
    .line 1507
    check-cast v0, La/k3t0;

    .line 1508
    .line 1509
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1510
    .line 1511
    .line 1512
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1513
    .line 1514
    return-object v0

    .line 1515
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
