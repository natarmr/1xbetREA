.class public final synthetic La/koq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/noq0;


# direct methods
.method public synthetic constructor <init>(La/noq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/koq0;->a:B

    iput-object p1, p0, La/koq0;->b:La/noq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/koq0;->a:B

    .line 4
    .line 5
    const-string v2, "SETTINGS_TIPS_SHOWED"

    .line 6
    .line 7
    const-string v3, "COUPON_TIPS_SHOWED"

    .line 8
    .line 9
    const-string v4, "BET_CONSTRUCTOR_TIPS_SHOWED"

    .line 10
    .line 11
    const-string v5, "TIPS_CYBER_GAMES_SHOWED"

    .line 12
    .line 13
    const-string v6, "TIPS_TEAM_BET_SHOWED"

    .line 14
    .line 15
    const-string v7, "TIPS_MY_AGGREGATOR_SHOWED"

    .line 16
    .line 17
    const-string v8, "TIPS_AGGREGATOR_SLOTS_SHOWED"

    .line 18
    .line 19
    const-string v9, "TIPS_LIVE_AGGREGATOR_SHOWED"

    .line 20
    .line 21
    const-string v10, "TIPS_AGGREGATOR_PROMO_SHOWED"

    .line 22
    .line 23
    const-string v11, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED"

    .line 24
    .line 25
    const-string v12, "TIPS_POPULAR_PERSONALIZATION"

    .line 26
    .line 27
    const-string v13, "TIPS_CYBER_EVENT_SHOWED"

    .line 28
    .line 29
    const-string v14, "TIPS_CYBER_TOURNAMENT_SHOWED"

    .line 30
    .line 31
    const-string v15, "TIPS_CYBER_TEAM_SHOWED"

    .line 32
    .line 33
    move/from16 v16, v1

    .line 34
    .line 35
    const-string v1, "TIPS_CYBER_PROMO_SHOWED"

    .line 36
    .line 37
    move-object/from16 v17, v2

    .line 38
    .line 39
    const-string v2, "TIPS_CYBER_CALENDAR_SHOWED"

    .line 40
    .line 41
    move-object/from16 v18, v3

    .line 42
    .line 43
    const-string v3, "TIPS_CYBER_PARTNERS_SHOWED"

    .line 44
    .line 45
    const/16 v19, -0x1

    .line 46
    .line 47
    const/16 v20, 0x4

    .line 48
    .line 49
    move-object/from16 v21, v4

    .line 50
    .line 51
    iget-object v0, v0, La/koq0;->b:La/noq0;

    .line 52
    .line 53
    const/16 v22, 0x1

    .line 54
    .line 55
    packed-switch v16, :pswitch_data_0

    .line 56
    .line 57
    .line 58
    move-object/from16 v16, p1

    .line 59
    .line 60
    check-cast v16, Landroid/view/View;

    .line 61
    .line 62
    sget-object v23, La/noq0;->m2:La/y2m0;

    .line 63
    .line 64
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, La/noq0;->Y0()La/xoq0;

    .line 68
    .line 69
    .line 70
    move-result-object v24

    .line 71
    invoke-virtual {v0}, La/noq0;->X0()I

    .line 72
    .line 73
    .line 74
    move-result v25

    .line 75
    invoke-virtual {v0}, La/noq0;->V0()I

    .line 76
    .line 77
    .line 78
    move-result v16

    .line 79
    add-int/lit8 v26, v16, 0x1

    .line 80
    .line 81
    invoke-virtual {v0}, La/noq0;->T0()La/ioq0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget-object v4, v4, La/i26;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v27

    .line 93
    iget-object v4, v0, La/noq0;->i2:La/phf0;

    .line 94
    .line 95
    sget-object v16, La/noq0;->n2:[La/iiy;

    .line 96
    .line 97
    move-object/from16 v23, v5

    .line 98
    .line 99
    aget-object v5, v16, v20

    .line 100
    .line 101
    invoke-virtual {v4, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v28

    .line 105
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v29, La/jf3;->b:La/jf3;

    .line 109
    .line 110
    invoke-virtual/range {v24 .. v29}, La/xoq0;->w(IIILjava/lang/String;La/jf3;)V

    .line 111
    .line 112
    .line 113
    move-object/from16 v4, v24

    .line 114
    .line 115
    iget-object v5, v4, La/xoq0;->K:La/ocl;

    .line 116
    .line 117
    invoke-virtual {v5}, La/ocl;->m()Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_0

    .line 122
    .line 123
    invoke-virtual {v4}, La/xoq0;->y()V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_1

    .line 127
    .line 128
    :cond_0
    iget-object v5, v4, La/xoq0;->L:La/lsn;

    .line 129
    .line 130
    invoke-virtual {v5}, La/lsn;->f()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_1

    .line 135
    .line 136
    invoke-virtual {v4}, La/xoq0;->x()V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :cond_1
    iget-object v5, v4, La/xoq0;->j0:La/fk60;

    .line 142
    .line 143
    if-nez v5, :cond_2

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_2
    sget-object v16, La/voq0;->a:[I

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    aget v19, v16, v5

    .line 153
    .line 154
    :goto_0
    packed-switch v19, :pswitch_data_1

    .line 155
    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :pswitch_0
    iget-object v1, v4, La/xoq0;->c0:La/ani0;

    .line 160
    .line 161
    iget-object v1, v1, La/ani0;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, La/uur0;

    .line 164
    .line 165
    iget-object v1, v1, La/uur0;->b:La/q7d0;

    .line 166
    .line 167
    const-string v2, "TOTO_TIPS_SHOWED"

    .line 168
    .line 169
    const/4 v3, 0x2

    .line 170
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :pswitch_1
    iget-object v1, v4, La/xoq0;->b:La/bst;

    .line 176
    .line 177
    iget-object v2, v4, La/xoq0;->g:La/wyu;

    .line 178
    .line 179
    invoke-virtual {v2}, La/wyu;->a()La/uaq0;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v1, v2}, La/bst;->f(La/uaq0;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    goto/16 :goto_1

    .line 187
    .line 188
    :pswitch_2
    iget-object v1, v4, La/xoq0;->h0:La/eyg0;

    .line 189
    .line 190
    invoke-virtual {v1}, La/eyg0;->l()V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :pswitch_3
    iget-object v1, v4, La/xoq0;->A:La/psc;

    .line 196
    .line 197
    iget-object v1, v1, La/psc;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, La/bah;

    .line 200
    .line 201
    iget-object v1, v1, La/bah;->a:La/q7d0;

    .line 202
    .line 203
    const/4 v5, 0x2

    .line 204
    invoke-virtual {v1, v5, v3}, La/q7d0;->e(ILjava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_4
    const/4 v5, 0x2

    .line 210
    iget-object v1, v4, La/xoq0;->z:La/mag;

    .line 211
    .line 212
    iget-object v1, v1, La/mag;->a:La/nag;

    .line 213
    .line 214
    iget-object v1, v1, La/nag;->a:La/q7d0;

    .line 215
    .line 216
    invoke-virtual {v1, v5, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :pswitch_5
    const/4 v5, 0x2

    .line 222
    iget-object v2, v4, La/xoq0;->y:La/yqc;

    .line 223
    .line 224
    iget-object v2, v2, La/yqc;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v2, La/uah;

    .line 227
    .line 228
    iget-object v2, v2, La/uah;->a:La/q7d0;

    .line 229
    .line 230
    invoke-virtual {v2, v5, v1}, La/q7d0;->e(ILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :pswitch_6
    const/4 v5, 0x2

    .line 236
    iget-object v1, v4, La/xoq0;->x:La/vqc;

    .line 237
    .line 238
    iget-object v1, v1, La/vqc;->b:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v1, La/qhh;

    .line 241
    .line 242
    iget-object v1, v1, La/qhh;->a:La/q7d0;

    .line 243
    .line 244
    invoke-virtual {v1, v5, v15}, La/q7d0;->e(ILjava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :pswitch_7
    const/4 v5, 0x2

    .line 250
    iget-object v1, v4, La/xoq0;->w:La/psc;

    .line 251
    .line 252
    iget-object v1, v1, La/psc;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v1, La/pnh;

    .line 255
    .line 256
    iget-object v1, v1, La/pnh;->a:La/q7d0;

    .line 257
    .line 258
    invoke-virtual {v1, v5, v14}, La/q7d0;->e(ILjava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_1

    .line 262
    .line 263
    :pswitch_8
    const/4 v5, 0x2

    .line 264
    iget-object v1, v4, La/xoq0;->v:La/zng;

    .line 265
    .line 266
    iget-object v1, v1, La/zng;->a:La/aog;

    .line 267
    .line 268
    iget-object v1, v1, La/aog;->a:La/q7d0;

    .line 269
    .line 270
    invoke-virtual {v1, v5, v13}, La/q7d0;->e(ILjava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :pswitch_9
    const/4 v5, 0x2

    .line 276
    iget-object v1, v4, La/xoq0;->f0:La/eyg0;

    .line 277
    .line 278
    iget-object v1, v1, La/eyg0;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, La/khb0;

    .line 281
    .line 282
    iget-object v1, v1, La/khb0;->a:La/q7d0;

    .line 283
    .line 284
    invoke-virtual {v1, v5, v12}, La/q7d0;->e(ILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :pswitch_a
    iget-object v1, v4, La/xoq0;->F:La/peg0;

    .line 290
    .line 291
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v1, La/iz1;

    .line 294
    .line 295
    iget-object v1, v1, La/iz1;->a:La/q7d0;

    .line 296
    .line 297
    move/from16 v2, v22

    .line 298
    .line 299
    invoke-virtual {v1, v2, v11}, La/q7d0;->e(ILjava/lang/String;)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_1

    .line 303
    .line 304
    :pswitch_b
    move/from16 v2, v22

    .line 305
    .line 306
    iget-object v1, v4, La/xoq0;->H:La/wf1;

    .line 307
    .line 308
    iget-object v1, v1, La/wf1;->a:La/xf1;

    .line 309
    .line 310
    iget-object v1, v1, La/xf1;->a:La/q7d0;

    .line 311
    .line 312
    invoke-virtual {v1, v2, v10}, La/q7d0;->e(ILjava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :pswitch_c
    move/from16 v2, v22

    .line 318
    .line 319
    iget-object v1, v4, La/xoq0;->G:La/qh00;

    .line 320
    .line 321
    iget-object v1, v1, La/qh00;->a:La/rh00;

    .line 322
    .line 323
    iget-object v1, v1, La/rh00;->a:La/q7d0;

    .line 324
    .line 325
    invoke-virtual {v1, v2, v9}, La/q7d0;->e(ILjava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_1

    .line 329
    .line 330
    :pswitch_d
    move/from16 v2, v22

    .line 331
    .line 332
    iget-object v1, v4, La/xoq0;->E:La/lp1;

    .line 333
    .line 334
    iget-object v1, v1, La/lp1;->a:La/mp1;

    .line 335
    .line 336
    iget-object v1, v1, La/mp1;->a:La/q7d0;

    .line 337
    .line 338
    invoke-virtual {v1, v2, v8}, La/q7d0;->e(ILjava/lang/String;)V

    .line 339
    .line 340
    .line 341
    goto :goto_1

    .line 342
    :pswitch_e
    move/from16 v2, v22

    .line 343
    .line 344
    iget-object v1, v4, La/xoq0;->D:La/u650;

    .line 345
    .line 346
    iget-object v1, v1, La/u650;->a:La/v650;

    .line 347
    .line 348
    iget-object v1, v1, La/v650;->a:La/q7d0;

    .line 349
    .line 350
    invoke-virtual {v1, v2, v7}, La/q7d0;->e(ILjava/lang/String;)V

    .line 351
    .line 352
    .line 353
    goto :goto_1

    .line 354
    :pswitch_f
    iget-object v1, v4, La/xoq0;->C:La/eyu;

    .line 355
    .line 356
    iget-object v1, v1, La/eyu;->a:La/x4p0;

    .line 357
    .line 358
    iget-object v1, v1, La/x4p0;->a:La/q7d0;

    .line 359
    .line 360
    const/4 v3, 0x2

    .line 361
    invoke-virtual {v1, v3, v6}, La/q7d0;->e(ILjava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_1

    .line 365
    :pswitch_10
    iget-object v1, v4, La/xoq0;->B:La/dpi0;

    .line 366
    .line 367
    invoke-virtual {v1}, La/dpi0;->j()V

    .line 368
    .line 369
    .line 370
    goto :goto_1

    .line 371
    :pswitch_11
    const/4 v3, 0x2

    .line 372
    iget-object v1, v4, La/xoq0;->u:La/cad;

    .line 373
    .line 374
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v1, La/g0h;

    .line 377
    .line 378
    iget-object v1, v1, La/g0h;->a:La/q7d0;

    .line 379
    .line 380
    move-object/from16 v4, v23

    .line 381
    .line 382
    invoke-virtual {v1, v3, v4}, La/q7d0;->e(ILjava/lang/String;)V

    .line 383
    .line 384
    .line 385
    goto :goto_1

    .line 386
    :pswitch_12
    const/4 v3, 0x2

    .line 387
    iget-object v1, v4, La/xoq0;->t:La/vt6;

    .line 388
    .line 389
    iget-object v1, v1, La/vt6;->a:La/wt6;

    .line 390
    .line 391
    iget-object v1, v1, La/wt6;->a:La/q7d0;

    .line 392
    .line 393
    move-object/from16 v5, v21

    .line 394
    .line 395
    invoke-virtual {v1, v3, v5}, La/q7d0;->e(ILjava/lang/String;)V

    .line 396
    .line 397
    .line 398
    goto :goto_1

    .line 399
    :pswitch_13
    const/4 v3, 0x2

    .line 400
    iget-object v1, v4, La/xoq0;->s:La/h4f;

    .line 401
    .line 402
    iget-object v1, v1, La/h4f;->a:La/i4f;

    .line 403
    .line 404
    iget-object v1, v1, La/i4f;->a:La/q7d0;

    .line 405
    .line 406
    move-object/from16 v2, v18

    .line 407
    .line 408
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 409
    .line 410
    .line 411
    goto :goto_1

    .line 412
    :pswitch_14
    const/4 v3, 0x2

    .line 413
    iget-object v1, v4, La/xoq0;->q:La/epi0;

    .line 414
    .line 415
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v1, La/rdj0;

    .line 418
    .line 419
    iget-object v1, v1, La/rdj0;->a:La/q7d0;

    .line 420
    .line 421
    move-object/from16 v2, v17

    .line 422
    .line 423
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 424
    .line 425
    .line 426
    goto :goto_1

    .line 427
    :pswitch_15
    const/4 v3, 0x2

    .line 428
    iget-object v1, v4, La/xoq0;->r:La/a1d;

    .line 429
    .line 430
    iget-object v1, v1, La/a1d;->b:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v1, La/lrs;

    .line 433
    .line 434
    iget-object v1, v1, La/lrs;->a:La/q7d0;

    .line 435
    .line 436
    const-string v2, "TIPS_GAMES_SHOWED_v3"

    .line 437
    .line 438
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :goto_1
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 442
    .line 443
    .line 444
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_16
    move-object v4, v5

    .line 448
    move-object/from16 v30, v17

    .line 449
    .line 450
    move-object/from16 v31, v18

    .line 451
    .line 452
    move-object/from16 v5, v21

    .line 453
    .line 454
    move-object/from16 v16, p1

    .line 455
    .line 456
    check-cast v16, Landroid/view/View;

    .line 457
    .line 458
    sget-object v17, La/noq0;->m2:La/y2m0;

    .line 459
    .line 460
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, La/noq0;->Y0()La/xoq0;

    .line 464
    .line 465
    .line 466
    move-result-object v23

    .line 467
    invoke-virtual {v0}, La/noq0;->X0()I

    .line 468
    .line 469
    .line 470
    move-result v24

    .line 471
    invoke-virtual {v0}, La/noq0;->V0()I

    .line 472
    .line 473
    .line 474
    move-result v16

    .line 475
    const/16 v22, 0x1

    .line 476
    .line 477
    add-int/lit8 v25, v16, 0x1

    .line 478
    .line 479
    invoke-virtual {v0}, La/noq0;->T0()La/ioq0;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    iget-object v5, v5, La/i26;->f:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v5, Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 488
    .line 489
    .line 490
    move-result v26

    .line 491
    iget-object v5, v0, La/noq0;->i2:La/phf0;

    .line 492
    .line 493
    sget-object v16, La/noq0;->n2:[La/iiy;

    .line 494
    .line 495
    move-object/from16 v17, v4

    .line 496
    .line 497
    aget-object v4, v16, v20

    .line 498
    .line 499
    invoke-virtual {v5, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v27

    .line 503
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    sget-object v28, La/jf3;->c:La/jf3;

    .line 507
    .line 508
    invoke-virtual/range {v23 .. v28}, La/xoq0;->w(IIILjava/lang/String;La/jf3;)V

    .line 509
    .line 510
    .line 511
    move-object/from16 v4, v23

    .line 512
    .line 513
    iget-object v5, v4, La/xoq0;->K:La/ocl;

    .line 514
    .line 515
    invoke-virtual {v5}, La/ocl;->m()Z

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    if-eqz v5, :cond_3

    .line 520
    .line 521
    invoke-virtual {v4}, La/xoq0;->y()V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_3

    .line 525
    .line 526
    :cond_3
    iget-object v5, v4, La/xoq0;->L:La/lsn;

    .line 527
    .line 528
    invoke-virtual {v5}, La/lsn;->f()Z

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    if-eqz v5, :cond_4

    .line 533
    .line 534
    invoke-virtual {v4}, La/xoq0;->x()V

    .line 535
    .line 536
    .line 537
    goto/16 :goto_3

    .line 538
    .line 539
    :cond_4
    iget-object v5, v4, La/xoq0;->j0:La/fk60;

    .line 540
    .line 541
    if-nez v5, :cond_5

    .line 542
    .line 543
    goto :goto_2

    .line 544
    :cond_5
    sget-object v16, La/voq0;->a:[I

    .line 545
    .line 546
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 547
    .line 548
    .line 549
    move-result v5

    .line 550
    aget v19, v16, v5

    .line 551
    .line 552
    :goto_2
    packed-switch v19, :pswitch_data_2

    .line 553
    .line 554
    .line 555
    goto/16 :goto_3

    .line 556
    .line 557
    :pswitch_17
    iget-object v1, v4, La/xoq0;->h0:La/eyg0;

    .line 558
    .line 559
    invoke-virtual {v1}, La/eyg0;->l()V

    .line 560
    .line 561
    .line 562
    goto/16 :goto_3

    .line 563
    .line 564
    :pswitch_18
    iget-object v1, v4, La/xoq0;->A:La/psc;

    .line 565
    .line 566
    iget-object v1, v1, La/psc;->b:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v1, La/bah;

    .line 569
    .line 570
    iget-object v1, v1, La/bah;->a:La/q7d0;

    .line 571
    .line 572
    const/4 v5, 0x2

    .line 573
    invoke-virtual {v1, v5, v3}, La/q7d0;->e(ILjava/lang/String;)V

    .line 574
    .line 575
    .line 576
    goto/16 :goto_3

    .line 577
    .line 578
    :pswitch_19
    const/4 v5, 0x2

    .line 579
    iget-object v1, v4, La/xoq0;->z:La/mag;

    .line 580
    .line 581
    iget-object v1, v1, La/mag;->a:La/nag;

    .line 582
    .line 583
    iget-object v1, v1, La/nag;->a:La/q7d0;

    .line 584
    .line 585
    invoke-virtual {v1, v5, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_3

    .line 589
    .line 590
    :pswitch_1a
    const/4 v5, 0x2

    .line 591
    iget-object v2, v4, La/xoq0;->y:La/yqc;

    .line 592
    .line 593
    iget-object v2, v2, La/yqc;->b:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v2, La/uah;

    .line 596
    .line 597
    iget-object v2, v2, La/uah;->a:La/q7d0;

    .line 598
    .line 599
    invoke-virtual {v2, v5, v1}, La/q7d0;->e(ILjava/lang/String;)V

    .line 600
    .line 601
    .line 602
    goto/16 :goto_3

    .line 603
    .line 604
    :pswitch_1b
    const/4 v5, 0x2

    .line 605
    iget-object v1, v4, La/xoq0;->x:La/vqc;

    .line 606
    .line 607
    iget-object v1, v1, La/vqc;->b:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v1, La/qhh;

    .line 610
    .line 611
    iget-object v1, v1, La/qhh;->a:La/q7d0;

    .line 612
    .line 613
    invoke-virtual {v1, v5, v15}, La/q7d0;->e(ILjava/lang/String;)V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_3

    .line 617
    .line 618
    :pswitch_1c
    const/4 v5, 0x2

    .line 619
    iget-object v1, v4, La/xoq0;->w:La/psc;

    .line 620
    .line 621
    iget-object v1, v1, La/psc;->b:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v1, La/pnh;

    .line 624
    .line 625
    iget-object v1, v1, La/pnh;->a:La/q7d0;

    .line 626
    .line 627
    invoke-virtual {v1, v5, v14}, La/q7d0;->e(ILjava/lang/String;)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_3

    .line 631
    .line 632
    :pswitch_1d
    const/4 v5, 0x2

    .line 633
    iget-object v1, v4, La/xoq0;->v:La/zng;

    .line 634
    .line 635
    iget-object v1, v1, La/zng;->a:La/aog;

    .line 636
    .line 637
    iget-object v1, v1, La/aog;->a:La/q7d0;

    .line 638
    .line 639
    invoke-virtual {v1, v5, v13}, La/q7d0;->e(ILjava/lang/String;)V

    .line 640
    .line 641
    .line 642
    goto/16 :goto_3

    .line 643
    .line 644
    :pswitch_1e
    const/4 v5, 0x2

    .line 645
    iget-object v1, v4, La/xoq0;->f0:La/eyg0;

    .line 646
    .line 647
    iget-object v1, v1, La/eyg0;->b:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v1, La/khb0;

    .line 650
    .line 651
    iget-object v1, v1, La/khb0;->a:La/q7d0;

    .line 652
    .line 653
    invoke-virtual {v1, v5, v12}, La/q7d0;->e(ILjava/lang/String;)V

    .line 654
    .line 655
    .line 656
    goto/16 :goto_3

    .line 657
    .line 658
    :pswitch_1f
    iget-object v1, v4, La/xoq0;->F:La/peg0;

    .line 659
    .line 660
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v1, La/iz1;

    .line 663
    .line 664
    iget-object v1, v1, La/iz1;->a:La/q7d0;

    .line 665
    .line 666
    const/4 v2, 0x1

    .line 667
    invoke-virtual {v1, v2, v11}, La/q7d0;->e(ILjava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_3

    .line 671
    .line 672
    :pswitch_20
    const/4 v2, 0x1

    .line 673
    iget-object v1, v4, La/xoq0;->H:La/wf1;

    .line 674
    .line 675
    iget-object v1, v1, La/wf1;->a:La/xf1;

    .line 676
    .line 677
    iget-object v1, v1, La/xf1;->a:La/q7d0;

    .line 678
    .line 679
    invoke-virtual {v1, v2, v10}, La/q7d0;->e(ILjava/lang/String;)V

    .line 680
    .line 681
    .line 682
    goto/16 :goto_3

    .line 683
    .line 684
    :pswitch_21
    const/4 v2, 0x1

    .line 685
    iget-object v1, v4, La/xoq0;->G:La/qh00;

    .line 686
    .line 687
    iget-object v1, v1, La/qh00;->a:La/rh00;

    .line 688
    .line 689
    iget-object v1, v1, La/rh00;->a:La/q7d0;

    .line 690
    .line 691
    invoke-virtual {v1, v2, v9}, La/q7d0;->e(ILjava/lang/String;)V

    .line 692
    .line 693
    .line 694
    goto/16 :goto_3

    .line 695
    .line 696
    :pswitch_22
    const/4 v2, 0x1

    .line 697
    iget-object v1, v4, La/xoq0;->E:La/lp1;

    .line 698
    .line 699
    iget-object v1, v1, La/lp1;->a:La/mp1;

    .line 700
    .line 701
    iget-object v1, v1, La/mp1;->a:La/q7d0;

    .line 702
    .line 703
    invoke-virtual {v1, v2, v8}, La/q7d0;->e(ILjava/lang/String;)V

    .line 704
    .line 705
    .line 706
    goto :goto_3

    .line 707
    :pswitch_23
    const/4 v2, 0x1

    .line 708
    iget-object v1, v4, La/xoq0;->D:La/u650;

    .line 709
    .line 710
    iget-object v1, v1, La/u650;->a:La/v650;

    .line 711
    .line 712
    iget-object v1, v1, La/v650;->a:La/q7d0;

    .line 713
    .line 714
    invoke-virtual {v1, v2, v7}, La/q7d0;->e(ILjava/lang/String;)V

    .line 715
    .line 716
    .line 717
    goto :goto_3

    .line 718
    :pswitch_24
    iget-object v1, v4, La/xoq0;->C:La/eyu;

    .line 719
    .line 720
    iget-object v1, v1, La/eyu;->a:La/x4p0;

    .line 721
    .line 722
    iget-object v1, v1, La/x4p0;->a:La/q7d0;

    .line 723
    .line 724
    const/4 v3, 0x2

    .line 725
    invoke-virtual {v1, v3, v6}, La/q7d0;->e(ILjava/lang/String;)V

    .line 726
    .line 727
    .line 728
    goto :goto_3

    .line 729
    :pswitch_25
    iget-object v1, v4, La/xoq0;->B:La/dpi0;

    .line 730
    .line 731
    invoke-virtual {v1}, La/dpi0;->j()V

    .line 732
    .line 733
    .line 734
    goto :goto_3

    .line 735
    :pswitch_26
    const/4 v3, 0x2

    .line 736
    iget-object v1, v4, La/xoq0;->u:La/cad;

    .line 737
    .line 738
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v1, La/g0h;

    .line 741
    .line 742
    iget-object v1, v1, La/g0h;->a:La/q7d0;

    .line 743
    .line 744
    move-object/from16 v4, v17

    .line 745
    .line 746
    invoke-virtual {v1, v3, v4}, La/q7d0;->e(ILjava/lang/String;)V

    .line 747
    .line 748
    .line 749
    goto :goto_3

    .line 750
    :pswitch_27
    const/4 v3, 0x2

    .line 751
    iget-object v1, v4, La/xoq0;->t:La/vt6;

    .line 752
    .line 753
    iget-object v1, v1, La/vt6;->a:La/wt6;

    .line 754
    .line 755
    iget-object v1, v1, La/wt6;->a:La/q7d0;

    .line 756
    .line 757
    move-object/from16 v5, v21

    .line 758
    .line 759
    invoke-virtual {v1, v3, v5}, La/q7d0;->e(ILjava/lang/String;)V

    .line 760
    .line 761
    .line 762
    goto :goto_3

    .line 763
    :pswitch_28
    const/4 v3, 0x2

    .line 764
    iget-object v1, v4, La/xoq0;->s:La/h4f;

    .line 765
    .line 766
    iget-object v1, v1, La/h4f;->a:La/i4f;

    .line 767
    .line 768
    iget-object v1, v1, La/i4f;->a:La/q7d0;

    .line 769
    .line 770
    move-object/from16 v2, v31

    .line 771
    .line 772
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 773
    .line 774
    .line 775
    goto :goto_3

    .line 776
    :pswitch_29
    const/4 v3, 0x2

    .line 777
    iget-object v1, v4, La/xoq0;->q:La/epi0;

    .line 778
    .line 779
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v1, La/rdj0;

    .line 782
    .line 783
    iget-object v1, v1, La/rdj0;->a:La/q7d0;

    .line 784
    .line 785
    move-object/from16 v2, v30

    .line 786
    .line 787
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 788
    .line 789
    .line 790
    goto :goto_3

    .line 791
    :pswitch_2a
    const/4 v3, 0x2

    .line 792
    iget-object v1, v4, La/xoq0;->r:La/a1d;

    .line 793
    .line 794
    iget-object v1, v1, La/a1d;->b:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, La/lrs;

    .line 797
    .line 798
    iget-object v1, v1, La/lrs;->a:La/q7d0;

    .line 799
    .line 800
    const-string v2, "TIPS_GAMES_SHOWED_v3"

    .line 801
    .line 802
    invoke-virtual {v1, v3, v2}, La/q7d0;->e(ILjava/lang/String;)V

    .line 803
    .line 804
    .line 805
    :goto_3
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 806
    .line 807
    .line 808
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 809
    .line 810
    return-object v0

    .line 811
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
    .end packed-switch

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    :pswitch_data_1
    .packed-switch 0x1
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

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch
.end method
