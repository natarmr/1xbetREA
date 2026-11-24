.class public final synthetic La/h2s;
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
    iput-byte p7, p0, La/h2s;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h2s;->a:B

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const-string v3, "BUNDLE_KEY_GAME_ID"

    .line 8
    .line 9
    const-string v4, "REQUEST_KEY_UPDATE_GAME_ID"

    .line 10
    .line 11
    const v5, 0x7f130e86

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x3

    .line 15
    const/16 v7, 0x14

    .line 16
    .line 17
    const-string v8, "snackbarManager"

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/zft;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/wft;

    .line 35
    .line 36
    sget-object v2, La/wft;->n2:La/bek;

    .line 37
    .line 38
    iget-object v1, v1, La/zft;->a:La/nk90;

    .line 39
    .line 40
    iget-object v2, v0, La/wft;->m2:La/yzn0;

    .line 41
    .line 42
    sget-object v3, La/wft;->o2:[La/iiy;

    .line 43
    .line 44
    aget-object v4, v3, v10

    .line 45
    .line 46
    invoke-virtual {v2, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, La/yft;

    .line 51
    .line 52
    iget-object v2, v0, La/wft;->m2:La/yzn0;

    .line 53
    .line 54
    aget-object v3, v3, v10

    .line 55
    .line 56
    invoke-virtual {v2, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, La/yft;

    .line 61
    .line 62
    new-instance v2, Lkotlin/Pair;

    .line 63
    .line 64
    const-string v3, "GENDER_CHOICE_ITEM_KEY"

    .line 65
    .line 66
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 81
    .line 82
    .line 83
    iget-object v0, v0, La/wft;->l2:La/a8z;

    .line 84
    .line 85
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/k3t0;

    .line 90
    .line 91
    sget-object v1, La/qft;->a:La/qft;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, Ljava/lang/Throwable;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/a9t;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, La/a9t;->x(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_1
    move-object/from16 v1, p1

    .line 117
    .line 118
    check-cast v1, Ljava/lang/Throwable;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/a9t;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, La/a9t;->x(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_2
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, Ljava/lang/Throwable;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, La/a9t;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, La/a9t;->x(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_3
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, Ljava/lang/Throwable;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/a9t;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, La/a9t;->x(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_4
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, Ljava/lang/Throwable;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, La/q3t;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    iget-object v2, v0, La/q3t;->l:La/mne;

    .line 186
    .line 187
    iget-object v15, v2, La/mne;->a:La/rwj;

    .line 188
    .line 189
    sget-object v13, La/p3t;->a:La/p3t;

    .line 190
    .line 191
    new-instance v2, La/cbq;

    .line 192
    .line 193
    invoke-direct {v2, v0, v1, v11, v7}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 194
    .line 195
    .line 196
    const/16 v17, 0xa

    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    move-object/from16 v16, v2

    .line 200
    .line 201
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 202
    .line 203
    .line 204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_5
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, Ljava/lang/Throwable;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, La/q3t;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    iget-object v2, v0, La/q3t;->l:La/mne;

    .line 226
    .line 227
    iget-object v15, v2, La/mne;->a:La/rwj;

    .line 228
    .line 229
    sget-object v13, La/p3t;->a:La/p3t;

    .line 230
    .line 231
    new-instance v2, La/cbq;

    .line 232
    .line 233
    invoke-direct {v2, v0, v1, v11, v7}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 234
    .line 235
    .line 236
    const/16 v17, 0xa

    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    move-object/from16 v16, v2

    .line 240
    .line 241
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 242
    .line 243
    .line 244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_6
    move-object/from16 v1, p1

    .line 248
    .line 249
    check-cast v1, Ljava/lang/Throwable;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, La/zns;

    .line 257
    .line 258
    invoke-virtual {v0, v1}, La/zns;->Q(Ljava/lang/Throwable;)V

    .line 259
    .line 260
    .line 261
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_7
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, Ljava/lang/Throwable;

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, La/zns;

    .line 274
    .line 275
    invoke-virtual {v0, v1}, La/zns;->Q(Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_8
    move-object/from16 v1, p1

    .line 282
    .line 283
    check-cast v1, Ljava/lang/Throwable;

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, La/zns;

    .line 291
    .line 292
    invoke-virtual {v0, v1}, La/zns;->Q(Ljava/lang/Throwable;)V

    .line 293
    .line 294
    .line 295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_9
    move-object/from16 v1, p1

    .line 299
    .line 300
    check-cast v1, Ljava/lang/Throwable;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, La/zns;

    .line 308
    .line 309
    invoke-virtual {v0, v1}, La/zns;->Q(Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_a
    move-object/from16 v1, p1

    .line 316
    .line 317
    check-cast v1, Ljava/lang/Throwable;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, La/zns;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    new-instance v3, La/j0s;

    .line 334
    .line 335
    const/4 v4, 0x5

    .line 336
    invoke-direct {v3, v1, v0, v11, v4}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v11, v11, v3, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 340
    .line 341
    .line 342
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_b
    move-object/from16 v1, p1

    .line 346
    .line 347
    check-cast v1, Ljava/lang/Throwable;

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, La/zns;

    .line 355
    .line 356
    invoke-virtual {v0, v1}, La/zns;->Q(Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_c
    move-object/from16 v1, p1

    .line 363
    .line 364
    check-cast v1, Ljava/lang/Throwable;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, La/zns;

    .line 372
    .line 373
    invoke-virtual {v0, v1}, La/zns;->Q(Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object v0

    .line 379
    :pswitch_d
    move-object/from16 v1, p1

    .line 380
    .line 381
    check-cast v1, La/ans;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v0, La/k3t0;

    .line 389
    .line 390
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object v0

    .line 396
    :pswitch_e
    move-object/from16 v1, p1

    .line 397
    .line 398
    check-cast v1, La/pns;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 404
    .line 405
    move-object v14, v0

    .line 406
    check-cast v14, La/gns;

    .line 407
    .line 408
    sget-object v0, La/gns;->R1:La/pek;

    .line 409
    .line 410
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    instance-of v0, v1, La/nns;

    .line 414
    .line 415
    if-eqz v0, :cond_1

    .line 416
    .line 417
    iget-object v12, v14, La/gns;->L1:La/wdk0;

    .line 418
    .line 419
    if-eqz v12, :cond_0

    .line 420
    .line 421
    new-instance v0, La/xdk0;

    .line 422
    .line 423
    sget-object v1, La/pek0;->a:La/pek0;

    .line 424
    .line 425
    const v2, 0x7f130d3b

    .line 426
    .line 427
    .line 428
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    const/4 v6, 0x0

    .line 436
    const/16 v7, 0x7c

    .line 437
    .line 438
    const/4 v3, 0x0

    .line 439
    const/4 v4, 0x0

    .line 440
    const/4 v5, 0x0

    .line 441
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 442
    .line 443
    .line 444
    const/16 v18, 0x0

    .line 445
    .line 446
    const/16 v19, 0x3fc

    .line 447
    .line 448
    const/4 v15, 0x0

    .line 449
    const/16 v16, 0x0

    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    move-object v13, v0

    .line 454
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 455
    .line 456
    .line 457
    goto/16 :goto_0

    .line 458
    .line 459
    :cond_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v11

    .line 463
    :cond_1
    instance-of v0, v1, La/hns;

    .line 464
    .line 465
    if-eqz v0, :cond_2

    .line 466
    .line 467
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    const v1, 0x7f130675

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-static {v0, v1, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 483
    .line 484
    .line 485
    goto/16 :goto_0

    .line 486
    .line 487
    :cond_2
    instance-of v0, v1, La/jns;

    .line 488
    .line 489
    const-string v2, "actionDialogManager"

    .line 490
    .line 491
    const v3, 0x7f13032f

    .line 492
    .line 493
    .line 494
    const v4, 0x7f1304dc

    .line 495
    .line 496
    .line 497
    if-eqz v0, :cond_5

    .line 498
    .line 499
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-static {v0}, La/gns;->H0(Landroidx/fragment/app/e;)Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-eqz v0, :cond_3

    .line 511
    .line 512
    goto/16 :goto_0

    .line 513
    .line 514
    :cond_3
    iget-object v0, v14, La/gns;->K1:La/ii;

    .line 515
    .line 516
    if-eqz v0, :cond_4

    .line 517
    .line 518
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 519
    .line 520
    invoke-virtual {v14, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v16

    .line 524
    const v1, 0x7f131477

    .line 525
    .line 526
    .line 527
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v17

    .line 531
    const v1, 0x7f130ec2

    .line 532
    .line 533
    .line 534
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v18

    .line 538
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v19

    .line 545
    sget-object v24, La/n12;->a:La/n12;

    .line 546
    .line 547
    const/16 v25, 0x0

    .line 548
    .line 549
    const/16 v26, 0x5d0

    .line 550
    .line 551
    const/16 v20, 0x0

    .line 552
    .line 553
    const-string v21, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 554
    .line 555
    const/16 v22, 0x0

    .line 556
    .line 557
    const/16 v23, 0x0

    .line 558
    .line 559
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 570
    .line 571
    .line 572
    goto/16 :goto_0

    .line 573
    .line 574
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw v11

    .line 578
    :cond_5
    instance-of v0, v1, La/mns;

    .line 579
    .line 580
    if-eqz v0, :cond_8

    .line 581
    .line 582
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    invoke-static {v0}, La/gns;->H0(Landroidx/fragment/app/e;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_6

    .line 594
    .line 595
    goto/16 :goto_0

    .line 596
    .line 597
    :cond_6
    iget-object v0, v14, La/gns;->K1:La/ii;

    .line 598
    .line 599
    if-eqz v0, :cond_7

    .line 600
    .line 601
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 602
    .line 603
    invoke-virtual {v14, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v16

    .line 607
    const v1, 0x7f131087

    .line 608
    .line 609
    .line 610
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v17

    .line 614
    const v1, 0x7f130042

    .line 615
    .line 616
    .line 617
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v18

    .line 621
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v19

    .line 628
    sget-object v24, La/n12;->a:La/n12;

    .line 629
    .line 630
    const/16 v25, 0x0

    .line 631
    .line 632
    const/16 v26, 0x5d0

    .line 633
    .line 634
    const/16 v20, 0x0

    .line 635
    .line 636
    const-string v21, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY"

    .line 637
    .line 638
    const/16 v22, 0x0

    .line 639
    .line 640
    const/16 v23, 0x0

    .line 641
    .line 642
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 653
    .line 654
    .line 655
    goto/16 :goto_0

    .line 656
    .line 657
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    throw v11

    .line 661
    :cond_8
    instance-of v0, v1, La/ons;

    .line 662
    .line 663
    const v3, 0x7f1307bb

    .line 664
    .line 665
    .line 666
    const-class v4, La/gns;

    .line 667
    .line 668
    if-eqz v0, :cond_9

    .line 669
    .line 670
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-static {v0, v1, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v14}, La/gns;->G0()La/k3t0;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    new-instance v1, La/sms;

    .line 690
    .line 691
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-direct {v1, v2}, La/sms;-><init>(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    goto/16 :goto_0

    .line 702
    .line 703
    :cond_9
    instance-of v0, v1, La/ins;

    .line 704
    .line 705
    if-eqz v0, :cond_a

    .line 706
    .line 707
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 708
    .line 709
    new-instance v1, Lkotlin/Pair;

    .line 710
    .line 711
    const-string v2, "bundle_key_notification_update"

    .line 712
    .line 713
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    const-string v1, "request_key_notification_updated"

    .line 725
    .line 726
    invoke-static {v0, v14, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v14}, La/gns;->G0()La/k3t0;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    new-instance v1, La/sms;

    .line 734
    .line 735
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-direct {v1, v2}, La/sms;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    goto :goto_0

    .line 746
    :cond_a
    instance-of v0, v1, La/lns;

    .line 747
    .line 748
    if-eqz v0, :cond_b

    .line 749
    .line 750
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-static {v0, v1, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v14}, La/gns;->G0()La/k3t0;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    new-instance v1, La/sms;

    .line 770
    .line 771
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    invoke-direct {v1, v2}, La/sms;-><init>(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    goto :goto_0

    .line 782
    :cond_b
    instance-of v0, v1, La/kns;

    .line 783
    .line 784
    if-eqz v0, :cond_e

    .line 785
    .line 786
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    invoke-static {v0}, La/gns;->H0(Landroidx/fragment/app/e;)Z

    .line 794
    .line 795
    .line 796
    move-result v0

    .line 797
    if-eqz v0, :cond_c

    .line 798
    .line 799
    goto :goto_0

    .line 800
    :cond_c
    iget-object v0, v14, La/gns;->K1:La/ii;

    .line 801
    .line 802
    if-eqz v0, :cond_d

    .line 803
    .line 804
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 805
    .line 806
    const v1, 0x7f130162

    .line 807
    .line 808
    .line 809
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v16

    .line 813
    const v1, 0x7f131247

    .line 814
    .line 815
    .line 816
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v17

    .line 820
    const v1, 0x7f130e5d

    .line 821
    .line 822
    .line 823
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v18

    .line 827
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    sget-object v24, La/n12;->a:La/n12;

    .line 831
    .line 832
    const/16 v25, 0x0

    .line 833
    .line 834
    const/16 v26, 0x5d8

    .line 835
    .line 836
    const/16 v19, 0x0

    .line 837
    .line 838
    const/16 v20, 0x0

    .line 839
    .line 840
    const-string v21, "REQUEST_SELF_EXCLUSION_ERROR_DIALOG_KEY"

    .line 841
    .line 842
    const/16 v22, 0x0

    .line 843
    .line 844
    const/16 v23, 0x0

    .line 845
    .line 846
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 857
    .line 858
    .line 859
    :goto_0
    invoke-virtual {v14}, La/gns;->G0()La/k3t0;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    sget-object v1, La/qms;->a:La/qms;

    .line 864
    .line 865
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 869
    .line 870
    goto :goto_1

    .line 871
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v11

    .line 875
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 876
    .line 877
    .line 878
    :goto_1
    return-object v11

    .line 879
    :pswitch_f
    move-object/from16 v1, p1

    .line 880
    .line 881
    check-cast v1, Ljava/lang/Throwable;

    .line 882
    .line 883
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v0, La/yks;

    .line 889
    .line 890
    iget-object v2, v0, La/yks;->t:La/ivn;

    .line 891
    .line 892
    new-instance v3, La/vjs;

    .line 893
    .line 894
    invoke-direct {v3, v0, v10}, La/vjs;-><init>(La/yks;B)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 898
    .line 899
    .line 900
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 901
    .line 902
    return-object v0

    .line 903
    :pswitch_10
    move-object/from16 v1, p1

    .line 904
    .line 905
    check-cast v1, La/sis;

    .line 906
    .line 907
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    .line 909
    .line 910
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v0, La/k3t0;

    .line 913
    .line 914
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 918
    .line 919
    return-object v0

    .line 920
    :pswitch_11
    move-object/from16 v1, p1

    .line 921
    .line 922
    check-cast v1, La/sis;

    .line 923
    .line 924
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 928
    .line 929
    check-cast v0, La/k3t0;

    .line 930
    .line 931
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 932
    .line 933
    .line 934
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 935
    .line 936
    return-object v0

    .line 937
    :pswitch_12
    move-object/from16 v1, p1

    .line 938
    .line 939
    check-cast v1, La/mjs;

    .line 940
    .line 941
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 945
    .line 946
    move-object v14, v0

    .line 947
    check-cast v14, La/cjs;

    .line 948
    .line 949
    sget-object v0, La/cjs;->a2:La/nek;

    .line 950
    .line 951
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    instance-of v0, v1, La/jjs;

    .line 955
    .line 956
    if-eqz v0, :cond_f

    .line 957
    .line 958
    new-instance v0, La/gmo;

    .line 959
    .line 960
    const/16 v2, 0x18

    .line 961
    .line 962
    invoke-direct {v0, v14, v1, v2}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 963
    .line 964
    .line 965
    invoke-static {v14, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 966
    .line 967
    .line 968
    goto/16 :goto_2

    .line 969
    .line 970
    :cond_f
    sget-object v0, La/kjs;->a:La/kjs;

    .line 971
    .line 972
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    if-eqz v0, :cond_10

    .line 977
    .line 978
    new-instance v0, La/xis;

    .line 979
    .line 980
    invoke-direct {v0, v14, v6}, La/xis;-><init>(La/cjs;B)V

    .line 981
    .line 982
    .line 983
    invoke-static {v14, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 984
    .line 985
    .line 986
    goto/16 :goto_2

    .line 987
    .line 988
    :cond_10
    sget-object v0, La/kjs;->b:La/kjs;

    .line 989
    .line 990
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-eqz v0, :cond_12

    .line 995
    .line 996
    iget-object v12, v14, La/cjs;->O1:La/wdk0;

    .line 997
    .line 998
    if-eqz v12, :cond_11

    .line 999
    .line 1000
    new-instance v15, La/xdk0;

    .line 1001
    .line 1002
    sget-object v16, La/qek0;->a:La/qek0;

    .line 1003
    .line 1004
    invoke-virtual {v14, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v17

    .line 1008
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    const/16 v21, 0x0

    .line 1012
    .line 1013
    const/16 v22, 0x7c

    .line 1014
    .line 1015
    const/16 v18, 0x0

    .line 1016
    .line 1017
    const/16 v19, 0x0

    .line 1018
    .line 1019
    const/16 v20, 0x0

    .line 1020
    .line 1021
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1022
    .line 1023
    .line 1024
    const/16 v19, 0x3fc

    .line 1025
    .line 1026
    move-object v13, v15

    .line 1027
    const/4 v15, 0x0

    .line 1028
    const/16 v16, 0x0

    .line 1029
    .line 1030
    const/16 v17, 0x0

    .line 1031
    .line 1032
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1033
    .line 1034
    .line 1035
    goto :goto_2

    .line 1036
    :cond_11
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    throw v11

    .line 1040
    :cond_12
    instance-of v0, v1, La/ljs;

    .line 1041
    .line 1042
    if-eqz v0, :cond_13

    .line 1043
    .line 1044
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    check-cast v1, La/ljs;

    .line 1049
    .line 1050
    iget-wide v1, v1, La/ljs;->a:J

    .line 1051
    .line 1052
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    new-instance v2, Lkotlin/Pair;

    .line 1057
    .line 1058
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    invoke-virtual {v0, v1, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    goto :goto_2

    .line 1073
    :cond_13
    instance-of v0, v1, La/ijs;

    .line 1074
    .line 1075
    if-eqz v0, :cond_15

    .line 1076
    .line 1077
    iget-object v12, v14, La/cjs;->O1:La/wdk0;

    .line 1078
    .line 1079
    if-eqz v12, :cond_14

    .line 1080
    .line 1081
    new-instance v15, La/xdk0;

    .line 1082
    .line 1083
    sget-object v16, La/rek0;->b:La/rek0;

    .line 1084
    .line 1085
    check-cast v1, La/ijs;

    .line 1086
    .line 1087
    iget v0, v1, La/ijs;->a:I

    .line 1088
    .line 1089
    invoke-virtual {v14, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v17

    .line 1093
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    const/16 v21, 0x0

    .line 1097
    .line 1098
    const/16 v22, 0x7c

    .line 1099
    .line 1100
    const/16 v18, 0x0

    .line 1101
    .line 1102
    const/16 v19, 0x0

    .line 1103
    .line 1104
    const/16 v20, 0x0

    .line 1105
    .line 1106
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1107
    .line 1108
    .line 1109
    const/16 v19, 0x3fc

    .line 1110
    .line 1111
    move-object v13, v15

    .line 1112
    const/4 v15, 0x0

    .line 1113
    const/16 v16, 0x0

    .line 1114
    .line 1115
    const/16 v17, 0x0

    .line 1116
    .line 1117
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1118
    .line 1119
    .line 1120
    :goto_2
    invoke-virtual {v14}, La/cjs;->I0()La/k3t0;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    sget-object v1, La/mis;->a:La/mis;

    .line 1125
    .line 1126
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1130
    .line 1131
    goto :goto_3

    .line 1132
    :cond_14
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    throw v11

    .line 1136
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 1137
    .line 1138
    .line 1139
    :goto_3
    return-object v11

    .line 1140
    :pswitch_13
    move-object/from16 v1, p1

    .line 1141
    .line 1142
    check-cast v1, La/amr;

    .line 1143
    .line 1144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1148
    .line 1149
    check-cast v0, La/k3t0;

    .line 1150
    .line 1151
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1152
    .line 1153
    .line 1154
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1155
    .line 1156
    return-object v0

    .line 1157
    :pswitch_14
    move-object/from16 v1, p1

    .line 1158
    .line 1159
    check-cast v1, Ljava/lang/Throwable;

    .line 1160
    .line 1161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1162
    .line 1163
    .line 1164
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1165
    .line 1166
    check-cast v0, La/sbs;

    .line 1167
    .line 1168
    sget v3, La/sbs;->D:I

    .line 1169
    .line 1170
    iget-object v3, v0, La/sbs;->q:La/duj;

    .line 1171
    .line 1172
    new-instance v4, La/jar;

    .line 1173
    .line 1174
    invoke-direct {v4, v0, v2}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1178
    .line 1179
    .line 1180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1181
    .line 1182
    return-object v0

    .line 1183
    :pswitch_15
    move-object/from16 v1, p1

    .line 1184
    .line 1185
    check-cast v1, Ljava/lang/Throwable;

    .line 1186
    .line 1187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1191
    .line 1192
    check-cast v0, La/sbs;

    .line 1193
    .line 1194
    iget-object v3, v0, La/sbs;->q:La/duj;

    .line 1195
    .line 1196
    new-instance v4, La/jar;

    .line 1197
    .line 1198
    invoke-direct {v4, v0, v2}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1202
    .line 1203
    .line 1204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    return-object v0

    .line 1207
    :pswitch_16
    move-object/from16 v1, p1

    .line 1208
    .line 1209
    check-cast v1, La/dbs;

    .line 1210
    .line 1211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1215
    .line 1216
    check-cast v0, La/k3t0;

    .line 1217
    .line 1218
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1219
    .line 1220
    .line 1221
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1222
    .line 1223
    return-object v0

    .line 1224
    :pswitch_17
    move-object/from16 v1, p1

    .line 1225
    .line 1226
    check-cast v1, Ljava/lang/Throwable;

    .line 1227
    .line 1228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1229
    .line 1230
    .line 1231
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v0, La/g9s;

    .line 1234
    .line 1235
    iget-object v2, v0, La/g9s;->t:La/ivn;

    .line 1236
    .line 1237
    new-instance v3, La/b8s;

    .line 1238
    .line 1239
    invoke-direct {v3, v0, v9}, La/b8s;-><init>(La/g9s;B)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 1243
    .line 1244
    .line 1245
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1246
    .line 1247
    return-object v0

    .line 1248
    :pswitch_18
    move-object/from16 v1, p1

    .line 1249
    .line 1250
    check-cast v1, La/v6s;

    .line 1251
    .line 1252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1253
    .line 1254
    .line 1255
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1256
    .line 1257
    check-cast v0, La/k3t0;

    .line 1258
    .line 1259
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1263
    .line 1264
    return-object v0

    .line 1265
    :pswitch_19
    move-object/from16 v1, p1

    .line 1266
    .line 1267
    check-cast v1, La/v6s;

    .line 1268
    .line 1269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1270
    .line 1271
    .line 1272
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v0, La/k3t0;

    .line 1275
    .line 1276
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1277
    .line 1278
    .line 1279
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1280
    .line 1281
    return-object v0

    .line 1282
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1283
    .line 1284
    check-cast v1, La/q7s;

    .line 1285
    .line 1286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1287
    .line 1288
    .line 1289
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1290
    .line 1291
    move-object v14, v0

    .line 1292
    check-cast v14, La/i7s;

    .line 1293
    .line 1294
    sget-object v0, La/i7s;->a2:La/nek;

    .line 1295
    .line 1296
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1297
    .line 1298
    .line 1299
    instance-of v0, v1, La/n7s;

    .line 1300
    .line 1301
    if-eqz v0, :cond_16

    .line 1302
    .line 1303
    new-instance v0, La/gmo;

    .line 1304
    .line 1305
    const/16 v2, 0x17

    .line 1306
    .line 1307
    invoke-direct {v0, v14, v1, v2}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1308
    .line 1309
    .line 1310
    invoke-static {v14, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 1311
    .line 1312
    .line 1313
    goto/16 :goto_4

    .line 1314
    .line 1315
    :cond_16
    sget-object v0, La/o7s;->a:La/o7s;

    .line 1316
    .line 1317
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v0

    .line 1321
    if-eqz v0, :cond_17

    .line 1322
    .line 1323
    new-instance v0, La/e7s;

    .line 1324
    .line 1325
    invoke-direct {v0, v14, v9}, La/e7s;-><init>(La/i7s;B)V

    .line 1326
    .line 1327
    .line 1328
    invoke-static {v14, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 1329
    .line 1330
    .line 1331
    goto/16 :goto_4

    .line 1332
    .line 1333
    :cond_17
    sget-object v0, La/o7s;->b:La/o7s;

    .line 1334
    .line 1335
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1336
    .line 1337
    .line 1338
    move-result v0

    .line 1339
    if-eqz v0, :cond_19

    .line 1340
    .line 1341
    iget-object v12, v14, La/i7s;->O1:La/wdk0;

    .line 1342
    .line 1343
    if-eqz v12, :cond_18

    .line 1344
    .line 1345
    new-instance v15, La/xdk0;

    .line 1346
    .line 1347
    sget-object v16, La/qek0;->a:La/qek0;

    .line 1348
    .line 1349
    invoke-virtual {v14, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v17

    .line 1353
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    const/16 v21, 0x0

    .line 1357
    .line 1358
    const/16 v22, 0x7c

    .line 1359
    .line 1360
    const/16 v18, 0x0

    .line 1361
    .line 1362
    const/16 v19, 0x0

    .line 1363
    .line 1364
    const/16 v20, 0x0

    .line 1365
    .line 1366
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1367
    .line 1368
    .line 1369
    const/16 v19, 0x3fc

    .line 1370
    .line 1371
    move-object v13, v15

    .line 1372
    const/4 v15, 0x0

    .line 1373
    const/16 v16, 0x0

    .line 1374
    .line 1375
    const/16 v17, 0x0

    .line 1376
    .line 1377
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1378
    .line 1379
    .line 1380
    goto :goto_4

    .line 1381
    :cond_18
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1382
    .line 1383
    .line 1384
    throw v11

    .line 1385
    :cond_19
    instance-of v0, v1, La/p7s;

    .line 1386
    .line 1387
    if-eqz v0, :cond_1a

    .line 1388
    .line 1389
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    check-cast v1, La/p7s;

    .line 1394
    .line 1395
    iget-wide v1, v1, La/p7s;->a:J

    .line 1396
    .line 1397
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    new-instance v2, Lkotlin/Pair;

    .line 1402
    .line 1403
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1404
    .line 1405
    .line 1406
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    invoke-virtual {v0, v1, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1415
    .line 1416
    .line 1417
    goto :goto_4

    .line 1418
    :cond_1a
    instance-of v0, v1, La/m7s;

    .line 1419
    .line 1420
    if-eqz v0, :cond_1c

    .line 1421
    .line 1422
    iget-object v12, v14, La/i7s;->O1:La/wdk0;

    .line 1423
    .line 1424
    if-eqz v12, :cond_1b

    .line 1425
    .line 1426
    new-instance v15, La/xdk0;

    .line 1427
    .line 1428
    sget-object v16, La/rek0;->b:La/rek0;

    .line 1429
    .line 1430
    check-cast v1, La/m7s;

    .line 1431
    .line 1432
    iget v0, v1, La/m7s;->a:I

    .line 1433
    .line 1434
    invoke-virtual {v14, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v17

    .line 1438
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    const/16 v21, 0x0

    .line 1442
    .line 1443
    const/16 v22, 0x7c

    .line 1444
    .line 1445
    const/16 v18, 0x0

    .line 1446
    .line 1447
    const/16 v19, 0x0

    .line 1448
    .line 1449
    const/16 v20, 0x0

    .line 1450
    .line 1451
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1452
    .line 1453
    .line 1454
    const/16 v19, 0x3fc

    .line 1455
    .line 1456
    move-object v13, v15

    .line 1457
    const/4 v15, 0x0

    .line 1458
    const/16 v16, 0x0

    .line 1459
    .line 1460
    const/16 v17, 0x0

    .line 1461
    .line 1462
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1463
    .line 1464
    .line 1465
    :goto_4
    invoke-virtual {v14}, La/i7s;->I0()La/k3t0;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v0

    .line 1469
    sget-object v1, La/n6s;->a:La/n6s;

    .line 1470
    .line 1471
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1472
    .line 1473
    .line 1474
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1475
    .line 1476
    goto :goto_5

    .line 1477
    :cond_1b
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1478
    .line 1479
    .line 1480
    throw v11

    .line 1481
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1482
    .line 1483
    .line 1484
    :goto_5
    return-object v11

    .line 1485
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1486
    .line 1487
    check-cast v1, Ljava/lang/Throwable;

    .line 1488
    .line 1489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1490
    .line 1491
    .line 1492
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1493
    .line 1494
    check-cast v0, La/k4s;

    .line 1495
    .line 1496
    iget-object v2, v0, La/k4s;->v:La/ivn;

    .line 1497
    .line 1498
    new-instance v3, La/j3s;

    .line 1499
    .line 1500
    invoke-direct {v3, v0, v10}, La/j3s;-><init>(La/k4s;B)V

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 1504
    .line 1505
    .line 1506
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1507
    .line 1508
    return-object v0

    .line 1509
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1510
    .line 1511
    check-cast v1, La/v1s;

    .line 1512
    .line 1513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1514
    .line 1515
    .line 1516
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1517
    .line 1518
    check-cast v0, La/k3t0;

    .line 1519
    .line 1520
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1521
    .line 1522
    .line 1523
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1524
    .line 1525
    return-object v0

    .line 1526
    nop

    .line 1527
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
