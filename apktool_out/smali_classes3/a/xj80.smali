.class public final synthetic La/xj80;
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
    iput-byte p7, p0, La/xj80;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xj80;->a:B

    .line 4
    .line 5
    sget-object v4, La/nb0;->a:La/nb0;

    .line 6
    .line 7
    const-string v6, "changeBalanceDialogProvider"

    .line 8
    .line 9
    const v8, 0x7f130162

    .line 10
    .line 11
    .line 12
    const-string v9, "actionDialogManager"

    .line 13
    .line 14
    const/4 v10, 0x2

    .line 15
    const-string v11, "android.intent.action.VIEW"

    .line 16
    .line 17
    const-string v12, "android.permission.CAMERA"

    .line 18
    .line 19
    const/4 v13, 0x4

    .line 20
    const v14, 0x7f130e5d

    .line 21
    .line 22
    .line 23
    const v15, 0x7f1307bb

    .line 24
    .line 25
    .line 26
    const v2, 0x7f130a82

    .line 27
    .line 28
    .line 29
    const-string v17, "snackbarManager"

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, La/ej90;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/kk90;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v2, v0, La/kk90;->m:La/mne;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    if-eq v1, v3, :cond_4

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    if-eq v1, v4, :cond_3

    .line 63
    .line 64
    if-eq v1, v13, :cond_2

    .line 65
    .line 66
    const/4 v4, 0x5

    .line 67
    if-eq v1, v4, :cond_1

    .line 68
    .line 69
    const/4 v3, 0x6

    .line 70
    if-eq v1, v3, :cond_0

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_0
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iget-object v11, v2, La/mne;->a:La/rwj;

    .line 79
    .line 80
    sget-object v9, La/bk90;->a:La/bk90;

    .line 81
    .line 82
    new-instance v12, La/ck90;

    .line 83
    .line 84
    invoke-direct {v12, v0, v5, v7}, La/ck90;-><init>(La/kk90;La/yje;B)V

    .line 85
    .line 86
    .line 87
    const/16 v13, 0xa

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 99
    .line 100
    move-object v4, v1

    .line 101
    sget-object v1, La/fk90;->a:La/fk90;

    .line 102
    .line 103
    move-object v6, v4

    .line 104
    new-instance v4, La/ek90;

    .line 105
    .line 106
    invoke-direct {v4, v0, v5, v3}, La/ek90;-><init>(La/kk90;La/yje;B)V

    .line 107
    .line 108
    .line 109
    const/16 v5, 0xa

    .line 110
    .line 111
    move-object v3, v2

    .line 112
    const/4 v2, 0x0

    .line 113
    move-object v0, v6

    .line 114
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {v0}, La/kk90;->E()V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    invoke-virtual {v0}, La/kk90;->C()V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    iget-object v1, v0, La/kk90;->u:La/ywq0;

    .line 127
    .line 128
    iget-object v2, v1, La/ywq0;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v2, La/vd1;

    .line 131
    .line 132
    iget-object v2, v2, La/vd1;->a:La/kt2;

    .line 133
    .line 134
    const-string v3, "acc_pers_responsible_gambling"

    .line 135
    .line 136
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v1, v1, La/ywq0;->f:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, La/au0;

    .line 142
    .line 143
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 144
    .line 145
    const-wide/16 v2, 0xcc5

    .line 146
    .line 147
    sget-object v4, La/xun;->a:La/xun;

    .line 148
    .line 149
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v0, La/kk90;->p:La/i1w0;

    .line 153
    .line 154
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iget-object v0, v0, La/kk90;->h:La/lme0;

    .line 159
    .line 160
    invoke-static {v0, v2}, La/rz4;->u(La/lme0;La/k0w0;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 164
    .line 165
    invoke-static {v1, v0, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_0
    move-object v2, v0

    .line 170
    check-cast v2, La/paw;

    .line 171
    .line 172
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_6

    .line 177
    .line 178
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, La/oe50;

    .line 183
    .line 184
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 185
    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_5
    invoke-virtual {v0}, La/kk90;->D()V

    .line 189
    .line 190
    .line 191
    :cond_6
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_0
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, La/o890;

    .line 204
    .line 205
    sget-object v2, La/o890;->f2:La/jh70;

    .line 206
    .line 207
    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->Z:Z

    .line 208
    .line 209
    const-string v4, "/onpay/withdraw/cancel"

    .line 210
    .line 211
    const-string v6, "/onpay/withdraw/pending"

    .line 212
    .line 213
    const-string v8, "/onpay/withdraw/fail"

    .line 214
    .line 215
    const-string v9, "/onpay/withdraw/success"

    .line 216
    .line 217
    const-string v10, "/onpay/cancel"

    .line 218
    .line 219
    const-string v11, "/onpay/pending"

    .line 220
    .line 221
    const-string v12, "/onpay/fail"

    .line 222
    .line 223
    const-string v13, "/onpay/success"

    .line 224
    .line 225
    if-nez v2, :cond_e

    .line 226
    .line 227
    sget-object v2, La/rek0;->b:La/rek0;

    .line 228
    .line 229
    sget-object v14, La/qek0;->a:La/qek0;

    .line 230
    .line 231
    sget-object v15, La/pek0;->a:La/pek0;

    .line 232
    .line 233
    invoke-static {v1, v13, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 234
    .line 235
    .line 236
    move-result v16

    .line 237
    if-eqz v16, :cond_7

    .line 238
    .line 239
    invoke-virtual {v0}, La/o890;->M0()La/p990;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    iget-object v15, v2, La/p990;->j:La/x1u;

    .line 244
    .line 245
    invoke-virtual {v15}, La/x1u;->a()J

    .line 246
    .line 247
    .line 248
    move-result-wide v15

    .line 249
    iget-object v3, v2, La/p990;->k:La/vd1;

    .line 250
    .line 251
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 252
    .line 253
    .line 254
    move-result-object v15

    .line 255
    new-instance v5, Lkotlin/Pair;

    .line 256
    .line 257
    const-string v7, "id_user"

    .line 258
    .line 259
    invoke-direct {v5, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v5}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v3, v3, La/vd1;->a:La/kt2;

    .line 273
    .line 274
    const-string v7, "dep_done"

    .line 275
    .line 276
    invoke-interface {v3, v7, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 277
    .line 278
    .line 279
    iget-object v2, v2, La/p990;->o:La/l7k;

    .line 280
    .line 281
    iget-object v2, v2, La/l7k;->a:La/s1p;

    .line 282
    .line 283
    move-object/from16 p0, v4

    .line 284
    .line 285
    const-wide/16 v3, 0xbe4

    .line 286
    .line 287
    sget-object v5, La/xun;->a:La/xun;

    .line 288
    .line 289
    invoke-virtual {v2, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 290
    .line 291
    .line 292
    const v2, 0x7f130e3b

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v2, v14}, La/o890;->Q0(ILa/sek0;)V

    .line 296
    .line 297
    .line 298
    :goto_2
    move-object/from16 v2, p0

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    goto/16 :goto_4

    .line 302
    .line 303
    :cond_7
    move-object/from16 p0, v4

    .line 304
    .line 305
    move v3, v7

    .line 306
    invoke-static {v1, v12, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-eqz v4, :cond_8

    .line 311
    .line 312
    invoke-virtual {v0}, La/o890;->M0()La/p990;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    iget-object v4, v3, La/p990;->k:La/vd1;

    .line 317
    .line 318
    iget-object v4, v4, La/vd1;->a:La/kt2;

    .line 319
    .line 320
    const-string v5, "dep_error"

    .line 321
    .line 322
    invoke-interface {v4, v5}, La/kt2;->c(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    iget-object v3, v3, La/p990;->o:La/l7k;

    .line 326
    .line 327
    iget-object v3, v3, La/l7k;->a:La/s1p;

    .line 328
    .line 329
    const-wide/16 v4, 0xbe5

    .line 330
    .line 331
    sget-object v7, La/xun;->a:La/xun;

    .line 332
    .line 333
    invoke-virtual {v3, v7, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 334
    .line 335
    .line 336
    const v3, 0x7f130e39

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v3, v2}, La/o890;->Q0(ILa/sek0;)V

    .line 340
    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_8
    const/4 v3, 0x0

    .line 344
    invoke-static {v1, v11, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_9

    .line 349
    .line 350
    const v2, 0x7f130e3a

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2, v15}, La/o890;->Q0(ILa/sek0;)V

    .line 354
    .line 355
    .line 356
    :goto_3
    move-object/from16 v2, p0

    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_9
    invoke-static {v1, v10, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    const v5, 0x7f130e38

    .line 364
    .line 365
    .line 366
    if-eqz v4, :cond_a

    .line 367
    .line 368
    invoke-virtual {v0, v5, v15}, La/o890;->Q0(ILa/sek0;)V

    .line 369
    .line 370
    .line 371
    goto :goto_3

    .line 372
    :cond_a
    invoke-static {v1, v9, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    if-eqz v4, :cond_b

    .line 377
    .line 378
    const v2, 0x7f130e3e

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v2, v14}, La/o890;->Q0(ILa/sek0;)V

    .line 382
    .line 383
    .line 384
    goto :goto_3

    .line 385
    :cond_b
    invoke-static {v1, v8, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-eqz v4, :cond_c

    .line 390
    .line 391
    const v4, 0x7f130e3c

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v4, v2}, La/o890;->Q0(ILa/sek0;)V

    .line 395
    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_c
    invoke-static {v1, v6, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_d

    .line 403
    .line 404
    const v2, 0x7f130e3d

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v2, v15}, La/o890;->Q0(ILa/sek0;)V

    .line 408
    .line 409
    .line 410
    goto :goto_3

    .line 411
    :cond_d
    move-object/from16 v2, p0

    .line 412
    .line 413
    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-eqz v4, :cond_f

    .line 418
    .line 419
    invoke-virtual {v0, v5, v15}, La/o890;->Q0(ILa/sek0;)V

    .line 420
    .line 421
    .line 422
    goto :goto_4

    .line 423
    :cond_e
    move-object v2, v4

    .line 424
    move v3, v7

    .line 425
    :cond_f
    :goto_4
    invoke-static {v1, v10, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-nez v4, :cond_11

    .line 430
    .line 431
    invoke-static {v1, v13, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-nez v4, :cond_11

    .line 436
    .line 437
    invoke-static {v1, v12, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    if-nez v4, :cond_11

    .line 442
    .line 443
    invoke-static {v1, v11, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    if-nez v4, :cond_11

    .line 448
    .line 449
    invoke-static {v1, v9, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    if-nez v4, :cond_11

    .line 454
    .line 455
    invoke-static {v1, v8, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-nez v4, :cond_11

    .line 460
    .line 461
    invoke-static {v1, v6, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    if-nez v4, :cond_11

    .line 466
    .line 467
    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    if-eqz v1, :cond_10

    .line 472
    .line 473
    goto :goto_5

    .line 474
    :cond_10
    const/4 v3, 0x0

    .line 475
    goto :goto_6

    .line 476
    :cond_11
    :goto_5
    invoke-virtual {v0}, La/o890;->M0()La/p990;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    iget-object v3, v1, La/p990;->p:La/mne;

    .line 485
    .line 486
    iget-object v5, v3, La/mne;->b:La/dvj;

    .line 487
    .line 488
    sget-object v3, La/j990;->a:La/j990;

    .line 489
    .line 490
    new-instance v6, La/f990;

    .line 491
    .line 492
    const/4 v4, 0x1

    .line 493
    const/4 v7, 0x0

    .line 494
    invoke-direct {v6, v1, v7, v4}, La/f990;-><init>(La/p990;La/yje;B)V

    .line 495
    .line 496
    .line 497
    const/16 v7, 0xa

    .line 498
    .line 499
    const/4 v4, 0x0

    .line 500
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0}, La/o890;->M0()La/p990;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v0}, La/p990;->A()V

    .line 508
    .line 509
    .line 510
    const/4 v3, 0x1

    .line 511
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    return-object v0

    .line 516
    :pswitch_1
    move-object/from16 v1, p1

    .line 517
    .line 518
    check-cast v1, Landroid/webkit/PermissionRequest;

    .line 519
    .line 520
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, La/o890;

    .line 526
    .line 527
    sget-object v2, La/o890;->f2:La/jh70;

    .line 528
    .line 529
    iput-object v1, v0, La/o890;->a2:Landroid/webkit/PermissionRequest;

    .line 530
    .line 531
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-static {v2, v12}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    if-eqz v2, :cond_12

    .line 540
    .line 541
    invoke-virtual {v0, v1}, La/o890;->H0(Landroid/webkit/PermissionRequest;)V

    .line 542
    .line 543
    .line 544
    goto :goto_7

    .line 545
    :cond_12
    invoke-virtual {v1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-virtual {v1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 553
    .line 554
    return-object v0

    .line 555
    :pswitch_2
    move-object/from16 v1, p1

    .line 556
    .line 557
    check-cast v1, Landroid/webkit/ValueCallback;

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, La/o890;

    .line 565
    .line 566
    sget-object v2, La/o890;->f2:La/jh70;

    .line 567
    .line 568
    iget-object v2, v0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 569
    .line 570
    if-eqz v2, :cond_13

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    invoke-interface {v2, v7}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    :cond_13
    iput-object v1, v0, La/o890;->Z1:Landroid/webkit/ValueCallback;

    .line 577
    .line 578
    invoke-virtual {v0}, La/o890;->G0()V

    .line 579
    .line 580
    .line 581
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 582
    .line 583
    return-object v0

    .line 584
    :pswitch_3
    move-object/from16 v1, p1

    .line 585
    .line 586
    check-cast v1, Landroid/content/Intent;

    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, La/o890;

    .line 594
    .line 595
    sget-object v2, La/o890;->f2:La/jh70;

    .line 596
    .line 597
    invoke-virtual {v0, v1}, La/o890;->R0(Landroid/content/Intent;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0}, La/o890;->M0()La/p990;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0}, La/p990;->A()V

    .line 605
    .line 606
    .line 607
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 608
    .line 609
    return-object v0

    .line 610
    :pswitch_4
    move-object/from16 v1, p1

    .line 611
    .line 612
    check-cast v1, Landroid/content/Intent;

    .line 613
    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v0, La/o890;

    .line 620
    .line 621
    sget-object v2, La/o890;->f2:La/jh70;

    .line 622
    .line 623
    invoke-virtual {v0, v1}, La/o890;->R0(Landroid/content/Intent;)V

    .line 624
    .line 625
    .line 626
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 627
    .line 628
    return-object v0

    .line 629
    :pswitch_5
    move-object/from16 v1, p1

    .line 630
    .line 631
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v0, La/x790;

    .line 639
    .line 640
    sget-object v2, La/x790;->V1:La/fl70;

    .line 641
    .line 642
    iput-object v1, v0, La/x790;->U1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 643
    .line 644
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_6
    move-object/from16 v1, p1

    .line 648
    .line 649
    check-cast v1, La/z390;

    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v0, La/k3t0;

    .line 657
    .line 658
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_7
    move-object/from16 v1, p1

    .line 665
    .line 666
    check-cast v1, La/b890;

    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 672
    .line 673
    move-object v5, v0

    .line 674
    check-cast v5, La/x790;

    .line 675
    .line 676
    sget-object v0, La/x790;->V1:La/fl70;

    .line 677
    .line 678
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    iget-object v0, v5, La/x790;->O1:La/a8z;

    .line 682
    .line 683
    instance-of v3, v1, La/y790;

    .line 684
    .line 685
    if-eqz v3, :cond_14

    .line 686
    .line 687
    check-cast v1, La/y790;

    .line 688
    .line 689
    iget-boolean v1, v1, La/y790;->a:Z

    .line 690
    .line 691
    invoke-static {v1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 692
    .line 693
    .line 694
    goto :goto_9

    .line 695
    :cond_14
    sget-object v3, La/z790;->a:La/z790;

    .line 696
    .line 697
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-eqz v3, :cond_15

    .line 702
    .line 703
    iget-object v1, v5, La/x790;->U1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 704
    .line 705
    if-eqz v1, :cond_16

    .line 706
    .line 707
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->g()V

    .line 708
    .line 709
    .line 710
    goto :goto_9

    .line 711
    :cond_15
    instance-of v3, v1, La/a890;

    .line 712
    .line 713
    if-eqz v3, :cond_18

    .line 714
    .line 715
    check-cast v1, La/a890;

    .line 716
    .line 717
    iget-object v1, v1, La/a890;->a:Ljava/lang/String;

    .line 718
    .line 719
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    .line 720
    .line 721
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-direct {v3, v11, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v5, v3}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 729
    .line 730
    .line 731
    goto :goto_8

    .line 732
    :catch_0
    iget-object v3, v5, La/x790;->M1:La/wdk0;

    .line 733
    .line 734
    if-eqz v3, :cond_17

    .line 735
    .line 736
    new-instance v4, La/xdk0;

    .line 737
    .line 738
    sget-object v7, La/rek0;->b:La/rek0;

    .line 739
    .line 740
    invoke-virtual {v5, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    const/4 v12, 0x0

    .line 748
    const/16 v13, 0x7c

    .line 749
    .line 750
    const/4 v9, 0x0

    .line 751
    const/4 v10, 0x0

    .line 752
    const/4 v11, 0x0

    .line 753
    move-object v6, v4

    .line 754
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 755
    .line 756
    .line 757
    const/16 v10, 0x3fc

    .line 758
    .line 759
    const/4 v6, 0x0

    .line 760
    const/4 v7, 0x0

    .line 761
    const/4 v8, 0x0

    .line 762
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 763
    .line 764
    .line 765
    :goto_8
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    check-cast v1, La/k3t0;

    .line 770
    .line 771
    sget-object v2, La/x390;->a:La/x390;

    .line 772
    .line 773
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    :cond_16
    :goto_9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    check-cast v0, La/k3t0;

    .line 781
    .line 782
    sget-object v1, La/r390;->a:La/r390;

    .line 783
    .line 784
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 788
    .line 789
    goto :goto_a

    .line 790
    :cond_17
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    const/16 v19, 0x0

    .line 794
    .line 795
    throw v19

    .line 796
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 797
    .line 798
    .line 799
    const/4 v5, 0x0

    .line 800
    :goto_a
    return-object v5

    .line 801
    :pswitch_8
    move-object/from16 v1, p1

    .line 802
    .line 803
    check-cast v1, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 804
    .line 805
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v0, La/r790;

    .line 811
    .line 812
    sget-object v2, La/r790;->Z1:La/xi70;

    .line 813
    .line 814
    iput-object v1, v0, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 815
    .line 816
    new-instance v2, La/l790;

    .line 817
    .line 818
    const/4 v3, 0x0

    .line 819
    invoke-direct {v2, v0, v3}, La/l790;-><init>(La/r790;B)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v1, v2}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->setOnWebViewErrorListener$impl(Lkotlin/jvm/functions/Function1;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    if-eqz v1, :cond_19

    .line 830
    .line 831
    new-instance v2, La/l3v0;

    .line 832
    .line 833
    new-instance v4, La/m790;

    .line 834
    .line 835
    invoke-direct {v4, v0, v3}, La/m790;-><init>(La/r790;B)V

    .line 836
    .line 837
    .line 838
    new-instance v3, La/l790;

    .line 839
    .line 840
    const/4 v5, 0x1

    .line 841
    invoke-direct {v3, v0, v5}, La/l790;-><init>(La/r790;B)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v0}, La/r790;->G0()La/mni;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    iget-object v0, v0, La/mni;->v:La/vby;

    .line 849
    .line 850
    invoke-direct {v2, v4, v3, v0}, La/l3v0;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/vby;)V

    .line 851
    .line 852
    .line 853
    const-string v0, "paymentWebHandler"

    .line 854
    .line 855
    invoke-virtual {v1, v2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    :cond_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_9
    move-object/from16 v1, p1

    .line 862
    .line 863
    check-cast v1, Landroid/content/Intent;

    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v0, La/r790;

    .line 871
    .line 872
    sget-object v3, La/r790;->Z1:La/xi70;

    .line 873
    .line 874
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    :try_start_1
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 878
    .line 879
    .line 880
    goto :goto_b

    .line 881
    :catch_1
    invoke-virtual {v0}, La/r790;->G0()La/mni;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 886
    .line 887
    const/4 v3, 0x0

    .line 888
    new-array v4, v3, [Ljava/lang/Object;

    .line 889
    .line 890
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 891
    .line 892
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    invoke-virtual {v1, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    sget-object v2, La/da90;->b:La/da90;

    .line 901
    .line 902
    invoke-virtual {v0, v1, v2}, La/r790;->L0(Ljava/lang/String;La/da90;)V

    .line 903
    .line 904
    .line 905
    :goto_b
    invoke-virtual {v0}, La/r790;->I0()La/k3t0;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    sget-object v1, La/j490;->a:La/j490;

    .line 910
    .line 911
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 915
    .line 916
    return-object v0

    .line 917
    :pswitch_a
    move-object/from16 v1, p1

    .line 918
    .line 919
    check-cast v1, Landroid/content/Intent;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, La/r790;

    .line 927
    .line 928
    sget-object v3, La/r790;->Z1:La/xi70;

    .line 929
    .line 930
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    :try_start_2
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 934
    .line 935
    .line 936
    goto :goto_c

    .line 937
    :catch_2
    invoke-virtual {v0}, La/r790;->G0()La/mni;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 942
    .line 943
    const/4 v3, 0x0

    .line 944
    new-array v4, v3, [Ljava/lang/Object;

    .line 945
    .line 946
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 947
    .line 948
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v3

    .line 952
    invoke-virtual {v1, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    sget-object v2, La/da90;->b:La/da90;

    .line 957
    .line 958
    invoke-virtual {v0, v1, v2}, La/r790;->L0(Ljava/lang/String;La/da90;)V

    .line 959
    .line 960
    .line 961
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 962
    .line 963
    return-object v0

    .line 964
    :pswitch_b
    move-object/from16 v1, p1

    .line 965
    .line 966
    check-cast v1, Landroid/webkit/PermissionRequest;

    .line 967
    .line 968
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 972
    .line 973
    check-cast v0, La/r790;

    .line 974
    .line 975
    sget-object v2, La/r790;->Z1:La/xi70;

    .line 976
    .line 977
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    invoke-static {v2, v12}, La/jiq0;->j0(Landroid/content/Context;Ljava/lang/String;)I

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    if-eqz v2, :cond_1a

    .line 986
    .line 987
    iget-object v2, v0, La/r790;->R1:La/a8z;

    .line 988
    .line 989
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v2

    .line 993
    check-cast v2, La/qog0;

    .line 994
    .line 995
    if-eqz v2, :cond_1b

    .line 996
    .line 997
    new-instance v3, La/p790;

    .line 998
    .line 999
    const/4 v4, 0x0

    .line 1000
    invoke-direct {v3, v2, v1, v0, v4}, La/p790;-><init>(La/qog0;Landroid/webkit/PermissionRequest;La/yx5;B)V

    .line 1001
    .line 1002
    .line 1003
    iget-object v0, v2, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 1004
    .line 1005
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v2}, La/qog0;->a()V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_d

    .line 1012
    :cond_1a
    invoke-virtual {v1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    invoke-virtual {v1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    :cond_1b
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1020
    .line 1021
    return-object v0

    .line 1022
    :pswitch_c
    move-object/from16 v1, p1

    .line 1023
    .line 1024
    check-cast v1, Landroid/webkit/ValueCallback;

    .line 1025
    .line 1026
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v0, La/r790;

    .line 1032
    .line 1033
    sget-object v2, La/r790;->Z1:La/xi70;

    .line 1034
    .line 1035
    iget-object v2, v0, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 1036
    .line 1037
    if-eqz v2, :cond_1c

    .line 1038
    .line 1039
    const/4 v7, 0x0

    .line 1040
    invoke-interface {v2, v7}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_1c
    iput-object v1, v0, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 1044
    .line 1045
    iget-object v1, v0, La/r790;->P1:La/a8z;

    .line 1046
    .line 1047
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    check-cast v1, La/qog0;

    .line 1052
    .line 1053
    if-eqz v1, :cond_1d

    .line 1054
    .line 1055
    new-instance v2, La/lz9;

    .line 1056
    .line 1057
    invoke-direct {v2, v1, v0, v13}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 1058
    .line 1059
    .line 1060
    iget-object v0, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 1061
    .line 1062
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v1}, La/qog0;->a()V

    .line 1066
    .line 1067
    .line 1068
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1069
    .line 1070
    return-object v0

    .line 1071
    :pswitch_d
    move-object/from16 v1, p1

    .line 1072
    .line 1073
    check-cast v1, La/q490;

    .line 1074
    .line 1075
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v0, La/k3t0;

    .line 1081
    .line 1082
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1086
    .line 1087
    return-object v0

    .line 1088
    :pswitch_e
    move-object/from16 v1, p1

    .line 1089
    .line 1090
    check-cast v1, La/ea90;

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1096
    .line 1097
    move-object v5, v0

    .line 1098
    check-cast v5, La/r790;

    .line 1099
    .line 1100
    sget-object v0, La/r790;->Z1:La/xi70;

    .line 1101
    .line 1102
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    sget-object v0, La/x990;->a:La/x990;

    .line 1106
    .line 1107
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    const v2, 0x7f13032f

    .line 1112
    .line 1113
    .line 1114
    const v3, 0x7f1303fb

    .line 1115
    .line 1116
    .line 1117
    if-eqz v0, :cond_1e

    .line 1118
    .line 1119
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 1124
    .line 1125
    new-instance v21, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1126
    .line 1127
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1132
    .line 1133
    const/4 v4, 0x0

    .line 1134
    new-array v6, v4, [Ljava/lang/Object;

    .line 1135
    .line 1136
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1137
    .line 1138
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v6

    .line 1142
    invoke-virtual {v1, v3, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v22

    .line 1146
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v1

    .line 1150
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1151
    .line 1152
    new-array v3, v4, [Ljava/lang/Object;

    .line 1153
    .line 1154
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1155
    .line 1156
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v3

    .line 1160
    const v6, 0x7f130f23

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v1, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v23

    .line 1167
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1172
    .line 1173
    new-array v3, v4, [Ljava/lang/Object;

    .line 1174
    .line 1175
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1176
    .line 1177
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v3

    .line 1181
    invoke-virtual {v1, v14, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v24

    .line 1185
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v1

    .line 1189
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1190
    .line 1191
    new-array v3, v4, [Ljava/lang/Object;

    .line 1192
    .line 1193
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1194
    .line 1195
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v3

    .line 1199
    invoke-virtual {v1, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v25

    .line 1203
    sget-object v30, La/n12;->a:La/n12;

    .line 1204
    .line 1205
    const/16 v31, 0x0

    .line 1206
    .line 1207
    const/16 v32, 0x5d0

    .line 1208
    .line 1209
    const/16 v26, 0x0

    .line 1210
    .line 1211
    const-string v27, "BONUS_LISTENER"

    .line 1212
    .line 1213
    const/16 v28, 0x0

    .line 1214
    .line 1215
    const/16 v29, 0x0

    .line 1216
    .line 1217
    invoke-direct/range {v21 .. v32}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1218
    .line 1219
    .line 1220
    move-object/from16 v1, v21

    .line 1221
    .line 1222
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1230
    .line 1231
    .line 1232
    goto/16 :goto_e

    .line 1233
    .line 1234
    :cond_1e
    sget-object v0, La/y990;->a:La/y990;

    .line 1235
    .line 1236
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v0

    .line 1240
    if-eqz v0, :cond_1f

    .line 1241
    .line 1242
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 1247
    .line 1248
    new-instance v21, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1249
    .line 1250
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1255
    .line 1256
    const/4 v3, 0x0

    .line 1257
    new-array v2, v3, [Ljava/lang/Object;

    .line 1258
    .line 1259
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1260
    .line 1261
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v2

    .line 1265
    invoke-virtual {v1, v15, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v22

    .line 1269
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1274
    .line 1275
    new-array v2, v3, [Ljava/lang/Object;

    .line 1276
    .line 1277
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1278
    .line 1279
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    const v4, 0x7f13131f

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v1, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v23

    .line 1290
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1295
    .line 1296
    new-array v2, v3, [Ljava/lang/Object;

    .line 1297
    .line 1298
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1299
    .line 1300
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v2

    .line 1304
    invoke-virtual {v1, v14, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v24

    .line 1308
    sget-object v30, La/n12;->b:La/n12;

    .line 1309
    .line 1310
    const/16 v31, 0x0

    .line 1311
    .line 1312
    const/16 v32, 0x5d8

    .line 1313
    .line 1314
    const/16 v25, 0x0

    .line 1315
    .line 1316
    const/16 v26, 0x0

    .line 1317
    .line 1318
    const-string v27, "ERROR_DIALOG_LISTENER"

    .line 1319
    .line 1320
    const/16 v28, 0x0

    .line 1321
    .line 1322
    const/16 v29, 0x0

    .line 1323
    .line 1324
    invoke-direct/range {v21 .. v32}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1325
    .line 1326
    .line 1327
    move-object/from16 v1, v21

    .line 1328
    .line 1329
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1337
    .line 1338
    .line 1339
    goto/16 :goto_e

    .line 1340
    .line 1341
    :cond_1f
    sget-object v0, La/z990;->a:La/z990;

    .line 1342
    .line 1343
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v0

    .line 1347
    if-eqz v0, :cond_20

    .line 1348
    .line 1349
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 1354
    .line 1355
    new-instance v21, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1356
    .line 1357
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v1

    .line 1361
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1362
    .line 1363
    const/4 v4, 0x0

    .line 1364
    new-array v6, v4, [Ljava/lang/Object;

    .line 1365
    .line 1366
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1367
    .line 1368
    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v6

    .line 1372
    invoke-virtual {v1, v3, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v22

    .line 1376
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1381
    .line 1382
    new-array v3, v4, [Ljava/lang/Object;

    .line 1383
    .line 1384
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1385
    .line 1386
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    const v6, 0x7f130f03

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v1, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v23

    .line 1397
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1402
    .line 1403
    new-array v3, v4, [Ljava/lang/Object;

    .line 1404
    .line 1405
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1406
    .line 1407
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v3

    .line 1411
    invoke-virtual {v1, v14, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v24

    .line 1415
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1420
    .line 1421
    new-array v3, v4, [Ljava/lang/Object;

    .line 1422
    .line 1423
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1424
    .line 1425
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v3

    .line 1429
    invoke-virtual {v1, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v25

    .line 1433
    sget-object v30, La/n12;->a:La/n12;

    .line 1434
    .line 1435
    const/16 v31, 0x0

    .line 1436
    .line 1437
    const/16 v32, 0x5d0

    .line 1438
    .line 1439
    const/16 v26, 0x0

    .line 1440
    .line 1441
    const-string v27, "NEED_VERIFICATION_LISTENER"

    .line 1442
    .line 1443
    const/16 v28, 0x0

    .line 1444
    .line 1445
    const/16 v29, 0x0

    .line 1446
    .line 1447
    invoke-direct/range {v21 .. v32}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1448
    .line 1449
    .line 1450
    move-object/from16 v1, v21

    .line 1451
    .line 1452
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1460
    .line 1461
    .line 1462
    goto/16 :goto_e

    .line 1463
    .line 1464
    :cond_20
    sget-object v0, La/ba90;->a:La/ba90;

    .line 1465
    .line 1466
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v0

    .line 1470
    if-eqz v0, :cond_21

    .line 1471
    .line 1472
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 1477
    .line 1478
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v1

    .line 1482
    iget-object v1, v1, La/mni;->t:La/pv00;

    .line 1483
    .line 1484
    new-instance v21, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1485
    .line 1486
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1491
    .line 1492
    const/4 v3, 0x0

    .line 1493
    new-array v2, v3, [Ljava/lang/Object;

    .line 1494
    .line 1495
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1496
    .line 1497
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v2

    .line 1501
    invoke-virtual {v1, v15, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v22

    .line 1505
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1510
    .line 1511
    new-array v2, v3, [Ljava/lang/Object;

    .line 1512
    .line 1513
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1514
    .line 1515
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    const v4, 0x7f13173e

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v1, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v23

    .line 1526
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v1

    .line 1530
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1531
    .line 1532
    new-array v2, v3, [Ljava/lang/Object;

    .line 1533
    .line 1534
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1535
    .line 1536
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v2

    .line 1540
    const v3, 0x7f130b5e

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v24

    .line 1547
    sget-object v30, La/n12;->b:La/n12;

    .line 1548
    .line 1549
    const/16 v31, 0x0

    .line 1550
    .line 1551
    const/16 v32, 0x5f8

    .line 1552
    .line 1553
    const/16 v25, 0x0

    .line 1554
    .line 1555
    const/16 v26, 0x0

    .line 1556
    .line 1557
    const/16 v27, 0x0

    .line 1558
    .line 1559
    const/16 v28, 0x0

    .line 1560
    .line 1561
    const/16 v29, 0x0

    .line 1562
    .line 1563
    invoke-direct/range {v21 .. v32}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1564
    .line 1565
    .line 1566
    move-object/from16 v1, v21

    .line 1567
    .line 1568
    sget-object v2, La/tx00;->l2:La/evz;

    .line 1569
    .line 1570
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    const/4 v3, 0x0

    .line 1574
    invoke-static {v1, v3, v3, v3}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v1

    .line 1578
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v2

    .line 1582
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 1586
    .line 1587
    .line 1588
    goto/16 :goto_e

    .line 1589
    .line 1590
    :cond_21
    sget-object v0, La/ca90;->a:La/ca90;

    .line 1591
    .line 1592
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1593
    .line 1594
    .line 1595
    move-result v0

    .line 1596
    if-eqz v0, :cond_22

    .line 1597
    .line 1598
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v0

    .line 1602
    iget-object v0, v0, La/mni;->s:La/ii;

    .line 1603
    .line 1604
    new-instance v21, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1605
    .line 1606
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v1

    .line 1610
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1611
    .line 1612
    const/4 v4, 0x0

    .line 1613
    new-array v2, v4, [Ljava/lang/Object;

    .line 1614
    .line 1615
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1616
    .line 1617
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v2

    .line 1621
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v22

    .line 1625
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v1

    .line 1629
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1630
    .line 1631
    new-array v2, v4, [Ljava/lang/Object;

    .line 1632
    .line 1633
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1634
    .line 1635
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v2

    .line 1639
    const v3, 0x7f1306f3

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v23

    .line 1646
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v1

    .line 1650
    iget-object v1, v1, La/mni;->o:La/ctf0;

    .line 1651
    .line 1652
    new-array v2, v4, [Ljava/lang/Object;

    .line 1653
    .line 1654
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1655
    .line 1656
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v2

    .line 1660
    invoke-virtual {v1, v14, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v24

    .line 1664
    sget-object v30, La/n12;->a:La/n12;

    .line 1665
    .line 1666
    const/16 v31, 0x0

    .line 1667
    .line 1668
    const/16 v32, 0x5d8

    .line 1669
    .line 1670
    const/16 v25, 0x0

    .line 1671
    .line 1672
    const/16 v26, 0x0

    .line 1673
    .line 1674
    const-string v27, "VERIFICATION_LISTENER"

    .line 1675
    .line 1676
    const/16 v28, 0x0

    .line 1677
    .line 1678
    const/16 v29, 0x0

    .line 1679
    .line 1680
    invoke-direct/range {v21 .. v32}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1681
    .line 1682
    .line 1683
    move-object/from16 v1, v21

    .line 1684
    .line 1685
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v2

    .line 1689
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1693
    .line 1694
    .line 1695
    goto/16 :goto_e

    .line 1696
    .line 1697
    :cond_22
    instance-of v0, v1, La/v990;

    .line 1698
    .line 1699
    if-eqz v0, :cond_23

    .line 1700
    .line 1701
    check-cast v1, La/v990;

    .line 1702
    .line 1703
    iget-object v0, v1, La/v990;->a:Ljava/lang/String;

    .line 1704
    .line 1705
    :try_start_3
    new-instance v1, Landroid/content/Intent;

    .line 1706
    .line 1707
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v0

    .line 1711
    invoke-direct {v1, v11, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v5, v1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 1715
    .line 1716
    .line 1717
    goto/16 :goto_e

    .line 1718
    .line 1719
    :catch_3
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v0

    .line 1723
    iget-object v0, v0, La/mni;->o:La/ctf0;

    .line 1724
    .line 1725
    const/4 v3, 0x0

    .line 1726
    new-array v1, v3, [Ljava/lang/Object;

    .line 1727
    .line 1728
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1729
    .line 1730
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v1

    .line 1734
    const v2, 0x7f1307d0

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v0

    .line 1741
    sget-object v1, La/da90;->b:La/da90;

    .line 1742
    .line 1743
    invoke-virtual {v5, v0, v1}, La/r790;->L0(Ljava/lang/String;La/da90;)V

    .line 1744
    .line 1745
    .line 1746
    goto/16 :goto_e

    .line 1747
    .line 1748
    :cond_23
    instance-of v0, v1, La/s990;

    .line 1749
    .line 1750
    if-eqz v0, :cond_24

    .line 1751
    .line 1752
    iget-object v0, v5, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 1753
    .line 1754
    if-eqz v0, :cond_28

    .line 1755
    .line 1756
    check-cast v1, La/s990;

    .line 1757
    .line 1758
    iget-object v1, v1, La/s990;->a:Ljava/lang/String;

    .line 1759
    .line 1760
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 1761
    .line 1762
    if-eqz v0, :cond_28

    .line 1763
    .line 1764
    const/4 v7, 0x0

    .line 1765
    invoke-virtual {v0, v1, v7}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1766
    .line 1767
    .line 1768
    goto :goto_e

    .line 1769
    :cond_24
    instance-of v0, v1, La/w990;

    .line 1770
    .line 1771
    if-eqz v0, :cond_25

    .line 1772
    .line 1773
    iget-object v0, v5, La/r790;->U1:Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 1774
    .line 1775
    if-eqz v0, :cond_28

    .line 1776
    .line 1777
    check-cast v1, La/w990;

    .line 1778
    .line 1779
    iget-object v2, v1, La/w990;->a:Ljava/lang/String;

    .line 1780
    .line 1781
    iget-object v1, v1, La/w990;->b:Ljava/util/Map;

    .line 1782
    .line 1783
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 1784
    .line 1785
    .line 1786
    goto :goto_e

    .line 1787
    :cond_25
    instance-of v0, v1, La/aa90;

    .line 1788
    .line 1789
    if-eqz v0, :cond_26

    .line 1790
    .line 1791
    check-cast v1, La/aa90;

    .line 1792
    .line 1793
    iget-object v0, v1, La/aa90;->a:Ljava/lang/String;

    .line 1794
    .line 1795
    iget-object v1, v1, La/aa90;->b:La/da90;

    .line 1796
    .line 1797
    invoke-virtual {v5, v0, v1}, La/r790;->L0(Ljava/lang/String;La/da90;)V

    .line 1798
    .line 1799
    .line 1800
    goto :goto_e

    .line 1801
    :cond_26
    instance-of v0, v1, La/u990;

    .line 1802
    .line 1803
    if-eqz v0, :cond_27

    .line 1804
    .line 1805
    check-cast v1, La/u990;

    .line 1806
    .line 1807
    iget-object v4, v1, La/u990;->a:Ljava/lang/String;

    .line 1808
    .line 1809
    iget-object v6, v1, La/u990;->b:Ljava/lang/String;

    .line 1810
    .line 1811
    iget-object v0, v5, La/r790;->Q1:La/a8z;

    .line 1812
    .line 1813
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v0

    .line 1817
    move-object v3, v0

    .line 1818
    check-cast v3, La/qog0;

    .line 1819
    .line 1820
    if-eqz v3, :cond_28

    .line 1821
    .line 1822
    new-instance v2, La/q790;

    .line 1823
    .line 1824
    const/4 v7, 0x0

    .line 1825
    invoke-direct/range {v2 .. v7}, La/q790;-><init>(La/qog0;Ljava/lang/String;La/yx5;Ljava/lang/String;B)V

    .line 1826
    .line 1827
    .line 1828
    iget-object v0, v3, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 1829
    .line 1830
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v3}, La/qog0;->a()V

    .line 1834
    .line 1835
    .line 1836
    goto :goto_e

    .line 1837
    :cond_27
    instance-of v0, v1, La/t990;

    .line 1838
    .line 1839
    if-eqz v0, :cond_29

    .line 1840
    .line 1841
    check-cast v1, La/t990;

    .line 1842
    .line 1843
    iget v0, v1, La/t990;->a:I

    .line 1844
    .line 1845
    iget-object v2, v1, La/t990;->b:Ljava/lang/String;

    .line 1846
    .line 1847
    iget-object v1, v1, La/t990;->c:Ljava/lang/String;

    .line 1848
    .line 1849
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v3

    .line 1853
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v4

    .line 1857
    iget-object v4, v4, La/mni;->u:La/wdk0;

    .line 1858
    .line 1859
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v6

    .line 1863
    iget-object v6, v6, La/mni;->o:La/ctf0;

    .line 1864
    .line 1865
    const/4 v7, 0x0

    .line 1866
    new-array v8, v7, [Ljava/lang/Object;

    .line 1867
    .line 1868
    iget-object v6, v6, La/ctf0;->b:La/lsm0;

    .line 1869
    .line 1870
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v7

    .line 1874
    invoke-virtual {v6, v0, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v0

    .line 1878
    invoke-static {v3, v4, v0, v2, v1}, La/n6x;->i0(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1879
    .line 1880
    .line 1881
    :cond_28
    :goto_e
    invoke-virtual {v5}, La/r790;->I0()La/k3t0;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v0

    .line 1885
    sget-object v1, La/a490;->a:La/a490;

    .line 1886
    .line 1887
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1888
    .line 1889
    .line 1890
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1891
    .line 1892
    goto :goto_f

    .line 1893
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1894
    .line 1895
    .line 1896
    const/4 v5, 0x0

    .line 1897
    :goto_f
    return-object v5

    .line 1898
    :pswitch_f
    move-object/from16 v1, p1

    .line 1899
    .line 1900
    check-cast v1, La/c590;

    .line 1901
    .line 1902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1903
    .line 1904
    .line 1905
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1906
    .line 1907
    check-cast v0, La/k3t0;

    .line 1908
    .line 1909
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1910
    .line 1911
    .line 1912
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1913
    .line 1914
    return-object v0

    .line 1915
    :pswitch_10
    move-object/from16 v1, p1

    .line 1916
    .line 1917
    check-cast v1, La/w690;

    .line 1918
    .line 1919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1920
    .line 1921
    .line 1922
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1923
    .line 1924
    check-cast v0, La/l590;

    .line 1925
    .line 1926
    sget-object v2, La/l590;->Y1:La/nh70;

    .line 1927
    .line 1928
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1929
    .line 1930
    .line 1931
    instance-of v2, v1, La/v690;

    .line 1932
    .line 1933
    if-eqz v2, :cond_2b

    .line 1934
    .line 1935
    check-cast v1, La/v690;

    .line 1936
    .line 1937
    iget-object v2, v1, La/v690;->a:Ljava/lang/String;

    .line 1938
    .line 1939
    iget-object v1, v1, La/v690;->b:[Ljava/lang/String;

    .line 1940
    .line 1941
    new-instance v3, Ljava/io/File;

    .line 1942
    .line 1943
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1944
    .line 1945
    .line 1946
    iput-object v3, v0, La/l590;->R1:Ljava/io/File;

    .line 1947
    .line 1948
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v3

    .line 1952
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v4

    .line 1956
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v4

    .line 1960
    const-string v5, ".provider"

    .line 1961
    .line 1962
    invoke-static {v4, v5}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v4

    .line 1966
    new-instance v5, Ljava/io/File;

    .line 1967
    .line 1968
    invoke-direct {v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1969
    .line 1970
    .line 1971
    invoke-static {v3, v5, v4}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v2

    .line 1975
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1976
    .line 1977
    .line 1978
    invoke-static {v2}, La/v3a;->c(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v2

    .line 1982
    new-instance v3, Landroid/content/Intent;

    .line 1983
    .line 1984
    const-string v4, "android.intent.action.PICK"

    .line 1985
    .line 1986
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1987
    .line 1988
    .line 1989
    const-string v4, "image/*"

    .line 1990
    .line 1991
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1992
    .line 1993
    .line 1994
    const-string v4, "android.intent.extra.ALLOW_MULTIPLE"

    .line 1995
    .line 1996
    const/4 v7, 0x0

    .line 1997
    invoke-virtual {v3, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1998
    .line 1999
    .line 2000
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2001
    .line 2002
    .line 2003
    new-instance v4, Landroid/content/Intent;

    .line 2004
    .line 2005
    const-string v5, "android.intent.action.GET_CONTENT"

    .line 2006
    .line 2007
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2008
    .line 2009
    .line 2010
    const-string v5, "android.intent.category.OPENABLE"

    .line 2011
    .line 2012
    invoke-virtual {v4, v5}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 2013
    .line 2014
    .line 2015
    const-string v5, "android.intent.extra.MIME_TYPES"

    .line 2016
    .line 2017
    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 2018
    .line 2019
    .line 2020
    const-string v1, "application/pdf"

    .line 2021
    .line 2022
    invoke-virtual {v4, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 2023
    .line 2024
    .line 2025
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v1

    .line 2029
    if-eqz v1, :cond_2a

    .line 2030
    .line 2031
    new-array v1, v10, [Landroid/content/Intent;

    .line 2032
    .line 2033
    const/16 v20, 0x0

    .line 2034
    .line 2035
    aput-object v2, v1, v20

    .line 2036
    .line 2037
    const/4 v5, 0x1

    .line 2038
    aput-object v4, v1, v5

    .line 2039
    .line 2040
    goto :goto_10

    .line 2041
    :cond_2a
    const/4 v5, 0x1

    .line 2042
    const/16 v20, 0x0

    .line 2043
    .line 2044
    new-array v1, v5, [Landroid/content/Intent;

    .line 2045
    .line 2046
    aput-object v4, v1, v20

    .line 2047
    .line 2048
    :goto_10
    const-string v2, "File Chooser"

    .line 2049
    .line 2050
    invoke-static {v3, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v2

    .line 2054
    const-string v3, "android.intent.extra.INITIAL_INTENTS"

    .line 2055
    .line 2056
    check-cast v1, [Landroid/os/Parcelable;

    .line 2057
    .line 2058
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2059
    .line 2060
    .line 2061
    :try_start_4
    iget-object v0, v0, La/l590;->S1:La/ywq;

    .line 2062
    .line 2063
    invoke-virtual {v0, v2}, La/ywq;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 2064
    .line 2065
    .line 2066
    goto :goto_11

    .line 2067
    :catch_4
    move-exception v0

    .line 2068
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 2069
    .line 2070
    .line 2071
    goto :goto_11

    .line 2072
    :cond_2b
    instance-of v2, v1, La/t690;

    .line 2073
    .line 2074
    if-eqz v2, :cond_2e

    .line 2075
    .line 2076
    check-cast v1, La/t690;

    .line 2077
    .line 2078
    iget-boolean v1, v1, La/t690;->a:Z

    .line 2079
    .line 2080
    iget-object v0, v0, La/l590;->N1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2081
    .line 2082
    if-nez v0, :cond_2c

    .line 2083
    .line 2084
    goto :goto_11

    .line 2085
    :cond_2c
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 2086
    .line 2087
    .line 2088
    move-result v0

    .line 2089
    if-nez v0, :cond_2d

    .line 2090
    .line 2091
    goto :goto_11

    .line 2092
    :cond_2d
    invoke-static {v1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 2093
    .line 2094
    .line 2095
    goto :goto_11

    .line 2096
    :cond_2e
    instance-of v2, v1, La/u690;

    .line 2097
    .line 2098
    if-eqz v2, :cond_2f

    .line 2099
    .line 2100
    check-cast v1, La/u690;

    .line 2101
    .line 2102
    iput-object v1, v0, La/l590;->P1:La/u690;

    .line 2103
    .line 2104
    invoke-virtual {v0}, La/l590;->H0()V

    .line 2105
    .line 2106
    .line 2107
    :goto_11
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2108
    .line 2109
    goto :goto_12

    .line 2110
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 2111
    .line 2112
    .line 2113
    const/4 v5, 0x0

    .line 2114
    :goto_12
    return-object v5

    .line 2115
    :pswitch_11
    move-object/from16 v1, p1

    .line 2116
    .line 2117
    check-cast v1, Ljava/lang/Throwable;

    .line 2118
    .line 2119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2120
    .line 2121
    .line 2122
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2123
    .line 2124
    check-cast v0, La/duj;

    .line 2125
    .line 2126
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 2127
    .line 2128
    .line 2129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2130
    .line 2131
    return-object v0

    .line 2132
    :pswitch_12
    move-object/from16 v1, p1

    .line 2133
    .line 2134
    check-cast v1, Ljava/lang/Throwable;

    .line 2135
    .line 2136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2137
    .line 2138
    .line 2139
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2140
    .line 2141
    check-cast v0, La/duj;

    .line 2142
    .line 2143
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 2144
    .line 2145
    .line 2146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2147
    .line 2148
    return-object v0

    .line 2149
    :pswitch_13
    move-object/from16 v1, p1

    .line 2150
    .line 2151
    check-cast v1, La/zy80;

    .line 2152
    .line 2153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2154
    .line 2155
    .line 2156
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2157
    .line 2158
    move-object v4, v0

    .line 2159
    check-cast v4, La/uy80;

    .line 2160
    .line 2161
    sget-object v0, La/uy80;->W1:La/jh70;

    .line 2162
    .line 2163
    instance-of v0, v1, La/xy80;

    .line 2164
    .line 2165
    if-eqz v0, :cond_31

    .line 2166
    .line 2167
    check-cast v1, La/xy80;

    .line 2168
    .line 2169
    iget-object v7, v1, La/xy80;->a:Ljava/lang/String;

    .line 2170
    .line 2171
    iget-object v2, v4, La/uy80;->L1:La/wdk0;

    .line 2172
    .line 2173
    if-eqz v2, :cond_30

    .line 2174
    .line 2175
    new-instance v3, La/xdk0;

    .line 2176
    .line 2177
    sget-object v6, La/rek0;->b:La/rek0;

    .line 2178
    .line 2179
    const/4 v11, 0x0

    .line 2180
    const/16 v12, 0x7c

    .line 2181
    .line 2182
    const/4 v8, 0x0

    .line 2183
    const/4 v9, 0x0

    .line 2184
    const/4 v10, 0x0

    .line 2185
    move-object v5, v3

    .line 2186
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2187
    .line 2188
    .line 2189
    const/16 v9, 0x3fc

    .line 2190
    .line 2191
    const/4 v5, 0x0

    .line 2192
    const/4 v6, 0x0

    .line 2193
    const/4 v7, 0x0

    .line 2194
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2195
    .line 2196
    .line 2197
    goto :goto_13

    .line 2198
    :cond_30
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2199
    .line 2200
    .line 2201
    const/16 v19, 0x0

    .line 2202
    .line 2203
    throw v19

    .line 2204
    :cond_31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2205
    .line 2206
    .line 2207
    sget-object v0, La/yy80;->a:La/yy80;

    .line 2208
    .line 2209
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2210
    .line 2211
    .line 2212
    move-result v0

    .line 2213
    if-eqz v0, :cond_34

    .line 2214
    .line 2215
    iget-object v0, v4, La/uy80;->M1:La/poq0;

    .line 2216
    .line 2217
    if-eqz v0, :cond_33

    .line 2218
    .line 2219
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v0

    .line 2223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2224
    .line 2225
    .line 2226
    sget-object v1, La/fk60;->b:La/uuz;

    .line 2227
    .line 2228
    sget-object v1, La/ki60;->q2:La/htz;

    .line 2229
    .line 2230
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2231
    .line 2232
    .line 2233
    const-string v1, "OnboardingBottomSheetContainerFragment"

    .line 2234
    .line 2235
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v2

    .line 2239
    if-nez v2, :cond_32

    .line 2240
    .line 2241
    new-instance v2, La/ki60;

    .line 2242
    .line 2243
    invoke-direct {v2}, La/ki60;-><init>()V

    .line 2244
    .line 2245
    .line 2246
    sget-object v3, La/ki60;->r2:[La/iiy;

    .line 2247
    .line 2248
    const/16 v18, 0x1

    .line 2249
    .line 2250
    aget-object v5, v3, v18

    .line 2251
    .line 2252
    iget-object v6, v2, La/ki60;->n2:La/zz2;

    .line 2253
    .line 2254
    const/16 v7, 0x1a

    .line 2255
    .line 2256
    invoke-virtual {v6, v2, v5, v7}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2257
    .line 2258
    .line 2259
    iget-object v5, v2, La/ki60;->o2:La/phf0;

    .line 2260
    .line 2261
    aget-object v3, v3, v10

    .line 2262
    .line 2263
    const-string v6, ""

    .line 2264
    .line 2265
    invoke-virtual {v5, v2, v3, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2266
    .line 2267
    .line 2268
    invoke-static {v2, v0, v1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2269
    .line 2270
    .line 2271
    :cond_32
    :goto_13
    invoke-virtual {v4}, La/uy80;->G0()La/k3t0;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v0

    .line 2275
    sget-object v1, La/cy80;->a:La/cy80;

    .line 2276
    .line 2277
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2278
    .line 2279
    .line 2280
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2281
    .line 2282
    goto :goto_14

    .line 2283
    :cond_33
    const-string v0, "tipsDialogFeature"

    .line 2284
    .line 2285
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2286
    .line 2287
    .line 2288
    const/16 v19, 0x0

    .line 2289
    .line 2290
    throw v19

    .line 2291
    :cond_34
    invoke-static {}, La/t9f;->b()V

    .line 2292
    .line 2293
    .line 2294
    const/4 v5, 0x0

    .line 2295
    :goto_14
    return-object v5

    .line 2296
    :pswitch_14
    move-object/from16 v1, p1

    .line 2297
    .line 2298
    check-cast v1, La/cu80;

    .line 2299
    .line 2300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2301
    .line 2302
    .line 2303
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2304
    .line 2305
    check-cast v0, La/k3t0;

    .line 2306
    .line 2307
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2308
    .line 2309
    .line 2310
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2311
    .line 2312
    return-object v0

    .line 2313
    :pswitch_15
    move-object/from16 v1, p1

    .line 2314
    .line 2315
    check-cast v1, La/xu80;

    .line 2316
    .line 2317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2318
    .line 2319
    .line 2320
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2321
    .line 2322
    check-cast v0, La/ou80;

    .line 2323
    .line 2324
    sget-object v2, La/ou80;->V1:La/rl70;

    .line 2325
    .line 2326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2327
    .line 2328
    .line 2329
    instance-of v2, v1, La/vu80;

    .line 2330
    .line 2331
    if-eqz v2, :cond_36

    .line 2332
    .line 2333
    check-cast v1, La/vu80;

    .line 2334
    .line 2335
    iget-object v4, v1, La/vu80;->a:Ljava/lang/String;

    .line 2336
    .line 2337
    iget-object v1, v0, La/ou80;->O1:La/wdk0;

    .line 2338
    .line 2339
    if-eqz v1, :cond_35

    .line 2340
    .line 2341
    new-instance v2, La/xdk0;

    .line 2342
    .line 2343
    sget-object v3, La/rek0;->b:La/rek0;

    .line 2344
    .line 2345
    const/4 v8, 0x0

    .line 2346
    const/16 v9, 0x7c

    .line 2347
    .line 2348
    const/4 v5, 0x0

    .line 2349
    const/4 v6, 0x0

    .line 2350
    const/4 v7, 0x0

    .line 2351
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2352
    .line 2353
    .line 2354
    const/16 v26, 0x0

    .line 2355
    .line 2356
    const/16 v27, 0x3fc

    .line 2357
    .line 2358
    const/16 v23, 0x0

    .line 2359
    .line 2360
    const/16 v24, 0x0

    .line 2361
    .line 2362
    const/16 v25, 0x0

    .line 2363
    .line 2364
    move-object/from16 v22, v0

    .line 2365
    .line 2366
    move-object/from16 v20, v1

    .line 2367
    .line 2368
    move-object/from16 v21, v2

    .line 2369
    .line 2370
    invoke-static/range {v20 .. v27}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2371
    .line 2372
    .line 2373
    goto/16 :goto_16

    .line 2374
    .line 2375
    :cond_35
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2376
    .line 2377
    .line 2378
    const/16 v19, 0x0

    .line 2379
    .line 2380
    throw v19

    .line 2381
    :cond_36
    instance-of v2, v1, La/tu80;

    .line 2382
    .line 2383
    if-eqz v2, :cond_37

    .line 2384
    .line 2385
    invoke-static {v0}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 2386
    .line 2387
    .line 2388
    goto/16 :goto_16

    .line 2389
    .line 2390
    :cond_37
    instance-of v2, v1, La/wu80;

    .line 2391
    .line 2392
    if-eqz v2, :cond_39

    .line 2393
    .line 2394
    check-cast v1, La/wu80;

    .line 2395
    .line 2396
    iget-object v1, v1, La/wu80;->a:Ljava/lang/String;

    .line 2397
    .line 2398
    iget-object v2, v0, La/ou80;->N1:La/ii;

    .line 2399
    .line 2400
    if-eqz v2, :cond_38

    .line 2401
    .line 2402
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2403
    .line 2404
    invoke-virtual {v0, v15}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v21

    .line 2408
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2409
    .line 2410
    .line 2411
    move-result-object v23

    .line 2412
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2413
    .line 2414
    .line 2415
    sget-object v29, La/n12;->b:La/n12;

    .line 2416
    .line 2417
    const/16 v30, 0x0

    .line 2418
    .line 2419
    const/16 v31, 0x5f8

    .line 2420
    .line 2421
    const/16 v24, 0x0

    .line 2422
    .line 2423
    const/16 v25, 0x0

    .line 2424
    .line 2425
    const/16 v26, 0x0

    .line 2426
    .line 2427
    const/16 v27, 0x0

    .line 2428
    .line 2429
    const/16 v28, 0x0

    .line 2430
    .line 2431
    move-object/from16 v22, v1

    .line 2432
    .line 2433
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2434
    .line 2435
    .line 2436
    move-object/from16 v1, v20

    .line 2437
    .line 2438
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v3

    .line 2442
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2443
    .line 2444
    .line 2445
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2446
    .line 2447
    .line 2448
    goto/16 :goto_16

    .line 2449
    .line 2450
    :cond_38
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2451
    .line 2452
    .line 2453
    const/16 v19, 0x0

    .line 2454
    .line 2455
    throw v19

    .line 2456
    :cond_39
    instance-of v2, v1, La/su80;

    .line 2457
    .line 2458
    if-eqz v2, :cond_40

    .line 2459
    .line 2460
    check-cast v1, La/su80;

    .line 2461
    .line 2462
    iget-object v1, v1, La/su80;->a:La/ob0;

    .line 2463
    .line 2464
    instance-of v2, v1, La/mb0;

    .line 2465
    .line 2466
    if-eqz v2, :cond_3b

    .line 2467
    .line 2468
    check-cast v1, La/mb0;

    .line 2469
    .line 2470
    iget-object v9, v1, La/mb0;->a:Ljava/lang/String;

    .line 2471
    .line 2472
    iget-object v7, v0, La/ou80;->P1:La/ynb;

    .line 2473
    .line 2474
    if-eqz v7, :cond_3a

    .line 2475
    .line 2476
    sget-object v8, La/bm5;->e:La/bm5;

    .line 2477
    .line 2478
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2479
    .line 2480
    .line 2481
    move-result-object v10

    .line 2482
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2483
    .line 2484
    .line 2485
    const-string v12, "REQUEST_CHANGE_BALANCE_KEY"

    .line 2486
    .line 2487
    const/16 v13, 0x1e6

    .line 2488
    .line 2489
    const/4 v11, 0x0

    .line 2490
    invoke-static/range {v7 .. v13}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 2491
    .line 2492
    .line 2493
    goto/16 :goto_16

    .line 2494
    .line 2495
    :cond_3a
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2496
    .line 2497
    .line 2498
    const/16 v19, 0x0

    .line 2499
    .line 2500
    throw v19

    .line 2501
    :cond_3b
    instance-of v2, v1, La/lb0;

    .line 2502
    .line 2503
    if-eqz v2, :cond_3d

    .line 2504
    .line 2505
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v1

    .line 2509
    if-eqz v1, :cond_41

    .line 2510
    .line 2511
    iget-object v2, v0, La/ou80;->N1:La/ii;

    .line 2512
    .line 2513
    if-eqz v2, :cond_3c

    .line 2514
    .line 2515
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2516
    .line 2517
    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2518
    .line 2519
    .line 2520
    move-result-object v21

    .line 2521
    const v3, 0x7f1303dc

    .line 2522
    .line 2523
    .line 2524
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2525
    .line 2526
    .line 2527
    move-result-object v22

    .line 2528
    const v3, 0x7f130e5c

    .line 2529
    .line 2530
    .line 2531
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v23

    .line 2535
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2536
    .line 2537
    .line 2538
    sget-object v29, La/n12;->b:La/n12;

    .line 2539
    .line 2540
    const/16 v30, 0x0

    .line 2541
    .line 2542
    const/16 v31, 0x5d8

    .line 2543
    .line 2544
    const/16 v24, 0x0

    .line 2545
    .line 2546
    const/16 v25, 0x0

    .line 2547
    .line 2548
    const-string v26, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 2549
    .line 2550
    const/16 v27, 0x0

    .line 2551
    .line 2552
    const/16 v28, 0x0

    .line 2553
    .line 2554
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2555
    .line 2556
    .line 2557
    move-object/from16 v3, v20

    .line 2558
    .line 2559
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v1

    .line 2563
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2564
    .line 2565
    .line 2566
    goto/16 :goto_16

    .line 2567
    .line 2568
    :cond_3c
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2569
    .line 2570
    .line 2571
    const/16 v19, 0x0

    .line 2572
    .line 2573
    throw v19

    .line 2574
    :cond_3d
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2575
    .line 2576
    .line 2577
    move-result v1

    .line 2578
    if-eqz v1, :cond_3f

    .line 2579
    .line 2580
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2581
    .line 2582
    .line 2583
    move-result-object v1

    .line 2584
    if-eqz v1, :cond_41

    .line 2585
    .line 2586
    iget-object v2, v0, La/ou80;->N1:La/ii;

    .line 2587
    .line 2588
    if-eqz v2, :cond_3e

    .line 2589
    .line 2590
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2591
    .line 2592
    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2593
    .line 2594
    .line 2595
    move-result-object v21

    .line 2596
    const v3, 0x7f13123b

    .line 2597
    .line 2598
    .line 2599
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2600
    .line 2601
    .line 2602
    move-result-object v22

    .line 2603
    const v3, 0x7f130e5c

    .line 2604
    .line 2605
    .line 2606
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v23

    .line 2610
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2611
    .line 2612
    .line 2613
    sget-object v29, La/n12;->b:La/n12;

    .line 2614
    .line 2615
    const/16 v30, 0x0

    .line 2616
    .line 2617
    const/16 v31, 0x5d8

    .line 2618
    .line 2619
    const/16 v24, 0x0

    .line 2620
    .line 2621
    const/16 v25, 0x0

    .line 2622
    .line 2623
    const-string v26, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 2624
    .line 2625
    const/16 v27, 0x0

    .line 2626
    .line 2627
    const/16 v28, 0x0

    .line 2628
    .line 2629
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2630
    .line 2631
    .line 2632
    move-object/from16 v3, v20

    .line 2633
    .line 2634
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 2635
    .line 2636
    .line 2637
    move-result-object v1

    .line 2638
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2639
    .line 2640
    .line 2641
    goto :goto_16

    .line 2642
    :cond_3e
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2643
    .line 2644
    .line 2645
    const/16 v19, 0x0

    .line 2646
    .line 2647
    throw v19

    .line 2648
    :cond_3f
    invoke-static {}, La/t9f;->b()V

    .line 2649
    .line 2650
    .line 2651
    :goto_15
    const/4 v5, 0x0

    .line 2652
    goto :goto_17

    .line 2653
    :cond_40
    sget-object v2, La/uu80;->a:La/uu80;

    .line 2654
    .line 2655
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2656
    .line 2657
    .line 2658
    move-result v1

    .line 2659
    if-eqz v1, :cond_43

    .line 2660
    .line 2661
    iget-object v1, v0, La/ou80;->N1:La/ii;

    .line 2662
    .line 2663
    if-eqz v1, :cond_42

    .line 2664
    .line 2665
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2666
    .line 2667
    invoke-virtual {v0, v15}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2668
    .line 2669
    .line 2670
    move-result-object v21

    .line 2671
    const v2, 0x7f130932

    .line 2672
    .line 2673
    .line 2674
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v22

    .line 2678
    const v3, 0x7f130e5c

    .line 2679
    .line 2680
    .line 2681
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v23

    .line 2685
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2686
    .line 2687
    .line 2688
    sget-object v29, La/n12;->b:La/n12;

    .line 2689
    .line 2690
    const/16 v30, 0x0

    .line 2691
    .line 2692
    const/16 v31, 0x5f8

    .line 2693
    .line 2694
    const/16 v24, 0x0

    .line 2695
    .line 2696
    const/16 v25, 0x0

    .line 2697
    .line 2698
    const/16 v26, 0x0

    .line 2699
    .line 2700
    const/16 v27, 0x0

    .line 2701
    .line 2702
    const/16 v28, 0x0

    .line 2703
    .line 2704
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2705
    .line 2706
    .line 2707
    move-object/from16 v2, v20

    .line 2708
    .line 2709
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2710
    .line 2711
    .line 2712
    move-result-object v3

    .line 2713
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2714
    .line 2715
    .line 2716
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2717
    .line 2718
    .line 2719
    :cond_41
    :goto_16
    invoke-virtual {v0}, La/ou80;->G0()La/k3t0;

    .line 2720
    .line 2721
    .line 2722
    move-result-object v0

    .line 2723
    sget-object v1, La/pt80;->a:La/pt80;

    .line 2724
    .line 2725
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2726
    .line 2727
    .line 2728
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2729
    .line 2730
    goto :goto_17

    .line 2731
    :cond_42
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2732
    .line 2733
    .line 2734
    const/16 v19, 0x0

    .line 2735
    .line 2736
    throw v19

    .line 2737
    :cond_43
    invoke-static {}, La/t9f;->b()V

    .line 2738
    .line 2739
    .line 2740
    goto :goto_15

    .line 2741
    :goto_17
    return-object v5

    .line 2742
    :pswitch_16
    move-object/from16 v1, p1

    .line 2743
    .line 2744
    check-cast v1, La/lr80;

    .line 2745
    .line 2746
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2747
    .line 2748
    .line 2749
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2750
    .line 2751
    check-cast v0, La/jt80;

    .line 2752
    .line 2753
    invoke-virtual {v0, v1}, La/jt80;->b0(La/lr80;)V

    .line 2754
    .line 2755
    .line 2756
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2757
    .line 2758
    return-object v0

    .line 2759
    :pswitch_17
    move-object/from16 v1, p1

    .line 2760
    .line 2761
    check-cast v1, La/qs80;

    .line 2762
    .line 2763
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2764
    .line 2765
    .line 2766
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2767
    .line 2768
    check-cast v0, La/as80;

    .line 2769
    .line 2770
    sget-object v2, La/as80;->Y1:La/fl70;

    .line 2771
    .line 2772
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2773
    .line 2774
    .line 2775
    instance-of v2, v1, La/os80;

    .line 2776
    .line 2777
    if-eqz v2, :cond_45

    .line 2778
    .line 2779
    check-cast v1, La/os80;

    .line 2780
    .line 2781
    iget-object v4, v1, La/os80;->a:Ljava/lang/String;

    .line 2782
    .line 2783
    iget-object v1, v0, La/as80;->P1:La/wdk0;

    .line 2784
    .line 2785
    if-eqz v1, :cond_44

    .line 2786
    .line 2787
    new-instance v2, La/xdk0;

    .line 2788
    .line 2789
    sget-object v3, La/rek0;->b:La/rek0;

    .line 2790
    .line 2791
    const/4 v8, 0x0

    .line 2792
    const/16 v9, 0x7c

    .line 2793
    .line 2794
    const/4 v5, 0x0

    .line 2795
    const/4 v6, 0x0

    .line 2796
    const/4 v7, 0x0

    .line 2797
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2798
    .line 2799
    .line 2800
    const/16 v27, 0x0

    .line 2801
    .line 2802
    const/16 v28, 0x3fc

    .line 2803
    .line 2804
    const/16 v24, 0x0

    .line 2805
    .line 2806
    const/16 v25, 0x0

    .line 2807
    .line 2808
    const/16 v26, 0x0

    .line 2809
    .line 2810
    move-object/from16 v23, v0

    .line 2811
    .line 2812
    move-object/from16 v21, v1

    .line 2813
    .line 2814
    move-object/from16 v22, v2

    .line 2815
    .line 2816
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2817
    .line 2818
    .line 2819
    goto/16 :goto_19

    .line 2820
    .line 2821
    :cond_44
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2822
    .line 2823
    .line 2824
    const/16 v19, 0x0

    .line 2825
    .line 2826
    throw v19

    .line 2827
    :cond_45
    instance-of v2, v1, La/ms80;

    .line 2828
    .line 2829
    if-eqz v2, :cond_46

    .line 2830
    .line 2831
    invoke-static {v0}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 2832
    .line 2833
    .line 2834
    goto/16 :goto_19

    .line 2835
    .line 2836
    :cond_46
    instance-of v2, v1, La/ps80;

    .line 2837
    .line 2838
    if-eqz v2, :cond_48

    .line 2839
    .line 2840
    check-cast v1, La/ps80;

    .line 2841
    .line 2842
    iget-object v1, v1, La/ps80;->a:Ljava/lang/String;

    .line 2843
    .line 2844
    iget-object v2, v0, La/as80;->O1:La/ii;

    .line 2845
    .line 2846
    if-eqz v2, :cond_47

    .line 2847
    .line 2848
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2849
    .line 2850
    invoke-virtual {v0, v15}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v21

    .line 2854
    invoke-virtual {v0, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2855
    .line 2856
    .line 2857
    move-result-object v23

    .line 2858
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2859
    .line 2860
    .line 2861
    sget-object v29, La/n12;->b:La/n12;

    .line 2862
    .line 2863
    const/16 v30, 0x0

    .line 2864
    .line 2865
    const/16 v31, 0x5f8

    .line 2866
    .line 2867
    const/16 v24, 0x0

    .line 2868
    .line 2869
    const/16 v25, 0x0

    .line 2870
    .line 2871
    const/16 v26, 0x0

    .line 2872
    .line 2873
    const/16 v27, 0x0

    .line 2874
    .line 2875
    const/16 v28, 0x0

    .line 2876
    .line 2877
    move-object/from16 v22, v1

    .line 2878
    .line 2879
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2880
    .line 2881
    .line 2882
    move-object/from16 v1, v20

    .line 2883
    .line 2884
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v3

    .line 2888
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2889
    .line 2890
    .line 2891
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2892
    .line 2893
    .line 2894
    goto/16 :goto_19

    .line 2895
    .line 2896
    :cond_47
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2897
    .line 2898
    .line 2899
    const/16 v19, 0x0

    .line 2900
    .line 2901
    throw v19

    .line 2902
    :cond_48
    instance-of v2, v1, La/js80;

    .line 2903
    .line 2904
    if-eqz v2, :cond_4f

    .line 2905
    .line 2906
    check-cast v1, La/js80;

    .line 2907
    .line 2908
    iget-object v1, v1, La/js80;->a:La/ob0;

    .line 2909
    .line 2910
    instance-of v2, v1, La/mb0;

    .line 2911
    .line 2912
    if-eqz v2, :cond_4a

    .line 2913
    .line 2914
    check-cast v1, La/mb0;

    .line 2915
    .line 2916
    iget-object v9, v1, La/mb0;->a:Ljava/lang/String;

    .line 2917
    .line 2918
    iget-object v7, v0, La/as80;->Q1:La/ynb;

    .line 2919
    .line 2920
    if-eqz v7, :cond_49

    .line 2921
    .line 2922
    sget-object v8, La/bm5;->e:La/bm5;

    .line 2923
    .line 2924
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2925
    .line 2926
    .line 2927
    move-result-object v10

    .line 2928
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2929
    .line 2930
    .line 2931
    const-string v12, "REQUEST_CHANGE_BALANCE_KEY"

    .line 2932
    .line 2933
    const/16 v13, 0x1e6

    .line 2934
    .line 2935
    const/4 v11, 0x0

    .line 2936
    invoke-static/range {v7 .. v13}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 2937
    .line 2938
    .line 2939
    goto/16 :goto_19

    .line 2940
    .line 2941
    :cond_49
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2942
    .line 2943
    .line 2944
    const/16 v19, 0x0

    .line 2945
    .line 2946
    throw v19

    .line 2947
    :cond_4a
    instance-of v2, v1, La/lb0;

    .line 2948
    .line 2949
    if-eqz v2, :cond_4c

    .line 2950
    .line 2951
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2952
    .line 2953
    .line 2954
    move-result-object v1

    .line 2955
    if-eqz v1, :cond_53

    .line 2956
    .line 2957
    iget-object v2, v0, La/as80;->O1:La/ii;

    .line 2958
    .line 2959
    if-eqz v2, :cond_4b

    .line 2960
    .line 2961
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2962
    .line 2963
    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2964
    .line 2965
    .line 2966
    move-result-object v21

    .line 2967
    const v3, 0x7f1303dc

    .line 2968
    .line 2969
    .line 2970
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2971
    .line 2972
    .line 2973
    move-result-object v22

    .line 2974
    const v3, 0x7f130e5c

    .line 2975
    .line 2976
    .line 2977
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v23

    .line 2981
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2982
    .line 2983
    .line 2984
    sget-object v29, La/n12;->b:La/n12;

    .line 2985
    .line 2986
    const/16 v30, 0x0

    .line 2987
    .line 2988
    const/16 v31, 0x5d8

    .line 2989
    .line 2990
    const/16 v24, 0x0

    .line 2991
    .line 2992
    const/16 v25, 0x0

    .line 2993
    .line 2994
    const-string v26, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 2995
    .line 2996
    const/16 v27, 0x0

    .line 2997
    .line 2998
    const/16 v28, 0x0

    .line 2999
    .line 3000
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3001
    .line 3002
    .line 3003
    move-object/from16 v3, v20

    .line 3004
    .line 3005
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 3006
    .line 3007
    .line 3008
    move-result-object v1

    .line 3009
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3010
    .line 3011
    .line 3012
    goto/16 :goto_19

    .line 3013
    .line 3014
    :cond_4b
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3015
    .line 3016
    .line 3017
    const/16 v19, 0x0

    .line 3018
    .line 3019
    throw v19

    .line 3020
    :cond_4c
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3021
    .line 3022
    .line 3023
    move-result v1

    .line 3024
    if-eqz v1, :cond_4e

    .line 3025
    .line 3026
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 3027
    .line 3028
    .line 3029
    move-result-object v1

    .line 3030
    if-eqz v1, :cond_53

    .line 3031
    .line 3032
    iget-object v2, v0, La/as80;->O1:La/ii;

    .line 3033
    .line 3034
    if-eqz v2, :cond_4d

    .line 3035
    .line 3036
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3037
    .line 3038
    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v21

    .line 3042
    const v3, 0x7f13123b

    .line 3043
    .line 3044
    .line 3045
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3046
    .line 3047
    .line 3048
    move-result-object v22

    .line 3049
    const v3, 0x7f130e5c

    .line 3050
    .line 3051
    .line 3052
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 3053
    .line 3054
    .line 3055
    move-result-object v23

    .line 3056
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3057
    .line 3058
    .line 3059
    sget-object v29, La/n12;->b:La/n12;

    .line 3060
    .line 3061
    const/16 v30, 0x0

    .line 3062
    .line 3063
    const/16 v31, 0x5d8

    .line 3064
    .line 3065
    const/16 v24, 0x0

    .line 3066
    .line 3067
    const/16 v25, 0x0

    .line 3068
    .line 3069
    const-string v26, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 3070
    .line 3071
    const/16 v27, 0x0

    .line 3072
    .line 3073
    const/16 v28, 0x0

    .line 3074
    .line 3075
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3076
    .line 3077
    .line 3078
    move-object/from16 v3, v20

    .line 3079
    .line 3080
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 3081
    .line 3082
    .line 3083
    move-result-object v1

    .line 3084
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3085
    .line 3086
    .line 3087
    goto/16 :goto_19

    .line 3088
    .line 3089
    :cond_4d
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3090
    .line 3091
    .line 3092
    const/16 v19, 0x0

    .line 3093
    .line 3094
    throw v19

    .line 3095
    :cond_4e
    invoke-static {}, La/t9f;->b()V

    .line 3096
    .line 3097
    .line 3098
    :goto_18
    const/4 v5, 0x0

    .line 3099
    goto/16 :goto_1a

    .line 3100
    .line 3101
    :cond_4f
    instance-of v2, v1, La/ks80;

    .line 3102
    .line 3103
    if-eqz v2, :cond_51

    .line 3104
    .line 3105
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 3106
    .line 3107
    .line 3108
    move-result-object v2

    .line 3109
    if-eqz v2, :cond_53

    .line 3110
    .line 3111
    invoke-virtual {v2}, La/kxq;->r()La/v1r;

    .line 3112
    .line 3113
    .line 3114
    move-result-object v2

    .line 3115
    invoke-static {v2}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 3116
    .line 3117
    .line 3118
    move-result v2

    .line 3119
    if-eqz v2, :cond_53

    .line 3120
    .line 3121
    new-instance v2, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

    .line 3122
    .line 3123
    check-cast v1, La/ks80;

    .line 3124
    .line 3125
    iget-object v3, v1, La/ks80;->a:Ljava/lang/String;

    .line 3126
    .line 3127
    iget-object v1, v1, La/ks80;->b:Ljava/lang/String;

    .line 3128
    .line 3129
    invoke-direct {v2, v3, v1}, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3130
    .line 3131
    .line 3132
    sget-object v1, La/z31;->n2:La/jdk0;

    .line 3133
    .line 3134
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3135
    .line 3136
    .line 3137
    move-result-object v3

    .line 3138
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3139
    .line 3140
    .line 3141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3142
    .line 3143
    .line 3144
    const-string v1, "AGGREGATOR_JACKPOT_TAG"

    .line 3145
    .line 3146
    invoke-virtual {v3, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 3147
    .line 3148
    .line 3149
    move-result-object v4

    .line 3150
    if-eqz v4, :cond_50

    .line 3151
    .line 3152
    goto/16 :goto_19

    .line 3153
    .line 3154
    :cond_50
    new-instance v4, La/z31;

    .line 3155
    .line 3156
    invoke-direct {v4}, La/z31;-><init>()V

    .line 3157
    .line 3158
    .line 3159
    sget-object v5, La/z31;->o2:[La/iiy;

    .line 3160
    .line 3161
    const/16 v20, 0x0

    .line 3162
    .line 3163
    aget-object v5, v5, v20

    .line 3164
    .line 3165
    iget-object v6, v4, La/z31;->k2:La/khf0;

    .line 3166
    .line 3167
    invoke-virtual {v6, v4, v5, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 3168
    .line 3169
    .line 3170
    invoke-virtual {v4, v3, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 3171
    .line 3172
    .line 3173
    goto :goto_19

    .line 3174
    :cond_51
    sget-object v2, La/ls80;->a:La/ls80;

    .line 3175
    .line 3176
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3177
    .line 3178
    .line 3179
    move-result v2

    .line 3180
    if-eqz v2, :cond_52

    .line 3181
    .line 3182
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v1

    .line 3186
    if-eqz v1, :cond_53

    .line 3187
    .line 3188
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 3189
    .line 3190
    .line 3191
    move-result-object v1

    .line 3192
    invoke-static {v1}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 3193
    .line 3194
    .line 3195
    move-result v1

    .line 3196
    if-eqz v1, :cond_53

    .line 3197
    .line 3198
    invoke-virtual {v0}, La/as80;->H0()La/jt80;

    .line 3199
    .line 3200
    .line 3201
    move-result-object v1

    .line 3202
    sget-object v2, La/xq80;->a:La/xq80;

    .line 3203
    .line 3204
    invoke-virtual {v1, v2}, La/jt80;->b0(La/lr80;)V

    .line 3205
    .line 3206
    .line 3207
    goto :goto_19

    .line 3208
    :cond_52
    sget-object v2, La/ns80;->a:La/ns80;

    .line 3209
    .line 3210
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3211
    .line 3212
    .line 3213
    move-result v1

    .line 3214
    if-eqz v1, :cond_55

    .line 3215
    .line 3216
    iget-object v1, v0, La/as80;->O1:La/ii;

    .line 3217
    .line 3218
    if-eqz v1, :cond_54

    .line 3219
    .line 3220
    new-instance v20, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 3221
    .line 3222
    invoke-virtual {v0, v15}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3223
    .line 3224
    .line 3225
    move-result-object v21

    .line 3226
    const v2, 0x7f130932

    .line 3227
    .line 3228
    .line 3229
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3230
    .line 3231
    .line 3232
    move-result-object v22

    .line 3233
    const v3, 0x7f130e5c

    .line 3234
    .line 3235
    .line 3236
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3237
    .line 3238
    .line 3239
    move-result-object v23

    .line 3240
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3241
    .line 3242
    .line 3243
    sget-object v29, La/n12;->b:La/n12;

    .line 3244
    .line 3245
    const/16 v30, 0x0

    .line 3246
    .line 3247
    const/16 v31, 0x5f8

    .line 3248
    .line 3249
    const/16 v24, 0x0

    .line 3250
    .line 3251
    const/16 v25, 0x0

    .line 3252
    .line 3253
    const/16 v26, 0x0

    .line 3254
    .line 3255
    const/16 v27, 0x0

    .line 3256
    .line 3257
    const/16 v28, 0x0

    .line 3258
    .line 3259
    invoke-direct/range {v20 .. v31}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 3260
    .line 3261
    .line 3262
    move-object/from16 v2, v20

    .line 3263
    .line 3264
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 3265
    .line 3266
    .line 3267
    move-result-object v3

    .line 3268
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3269
    .line 3270
    .line 3271
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 3272
    .line 3273
    .line 3274
    :cond_53
    :goto_19
    invoke-virtual {v0}, La/as80;->H0()La/jt80;

    .line 3275
    .line 3276
    .line 3277
    move-result-object v0

    .line 3278
    sget-object v1, La/uq80;->a:La/uq80;

    .line 3279
    .line 3280
    invoke-virtual {v0, v1}, La/jt80;->b0(La/lr80;)V

    .line 3281
    .line 3282
    .line 3283
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3284
    .line 3285
    goto :goto_1a

    .line 3286
    :cond_54
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3287
    .line 3288
    .line 3289
    const/16 v19, 0x0

    .line 3290
    .line 3291
    throw v19

    .line 3292
    :cond_55
    invoke-static {}, La/t9f;->b()V

    .line 3293
    .line 3294
    .line 3295
    goto/16 :goto_18

    .line 3296
    .line 3297
    :goto_1a
    return-object v5

    .line 3298
    :pswitch_18
    move-object/from16 v1, p1

    .line 3299
    .line 3300
    check-cast v1, La/qn80;

    .line 3301
    .line 3302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3303
    .line 3304
    .line 3305
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 3306
    .line 3307
    check-cast v0, La/tn80;

    .line 3308
    .line 3309
    invoke-virtual {v0, v1}, La/tn80;->x(La/qn80;)V

    .line 3310
    .line 3311
    .line 3312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3313
    .line 3314
    return-object v0

    .line 3315
    :pswitch_19
    move-object/from16 v1, p1

    .line 3316
    .line 3317
    check-cast v1, La/qn80;

    .line 3318
    .line 3319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3320
    .line 3321
    .line 3322
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 3323
    .line 3324
    check-cast v0, La/tn80;

    .line 3325
    .line 3326
    invoke-virtual {v0, v1}, La/tn80;->x(La/qn80;)V

    .line 3327
    .line 3328
    .line 3329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3330
    .line 3331
    return-object v0

    .line 3332
    :pswitch_1a
    move-object/from16 v1, p1

    .line 3333
    .line 3334
    check-cast v1, Ljava/lang/Throwable;

    .line 3335
    .line 3336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3337
    .line 3338
    .line 3339
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 3340
    .line 3341
    check-cast v0, La/fk80;

    .line 3342
    .line 3343
    invoke-virtual {v0, v1}, La/fk80;->c(Ljava/lang/Throwable;)V

    .line 3344
    .line 3345
    .line 3346
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3347
    .line 3348
    return-object v0

    .line 3349
    :pswitch_1b
    move-object/from16 v1, p1

    .line 3350
    .line 3351
    check-cast v1, Ljava/lang/Throwable;

    .line 3352
    .line 3353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3354
    .line 3355
    .line 3356
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 3357
    .line 3358
    check-cast v0, La/fk80;

    .line 3359
    .line 3360
    invoke-virtual {v0, v1}, La/fk80;->c(Ljava/lang/Throwable;)V

    .line 3361
    .line 3362
    .line 3363
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3364
    .line 3365
    return-object v0

    .line 3366
    :pswitch_1c
    move-object/from16 v1, p1

    .line 3367
    .line 3368
    check-cast v1, Ljava/lang/Throwable;

    .line 3369
    .line 3370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3371
    .line 3372
    .line 3373
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 3374
    .line 3375
    check-cast v0, La/ek80;

    .line 3376
    .line 3377
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 3378
    .line 3379
    if-nez v2, :cond_56

    .line 3380
    .line 3381
    iget-object v2, v0, La/ek80;->a:La/lhf0;

    .line 3382
    .line 3383
    iget-object v2, v2, La/lhf0;->b:Ljava/lang/Object;

    .line 3384
    .line 3385
    check-cast v2, La/cyu;

    .line 3386
    .line 3387
    iget-object v2, v2, La/cyu;->c:Ljava/lang/Object;

    .line 3388
    .line 3389
    check-cast v2, La/p7m0;

    .line 3390
    .line 3391
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 3392
    .line 3393
    .line 3394
    move-result-object v2

    .line 3395
    check-cast v2, Ljava/util/List;

    .line 3396
    .line 3397
    iget-object v0, v0, La/ek80;->e:La/p7m0;

    .line 3398
    .line 3399
    new-instance v3, La/rl80;

    .line 3400
    .line 3401
    invoke-direct {v3, v1, v2}, La/rl80;-><init>(Ljava/lang/Throwable;Ljava/util/List;)V

    .line 3402
    .line 3403
    .line 3404
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3405
    .line 3406
    .line 3407
    const/4 v7, 0x0

    .line 3408
    invoke-virtual {v0, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3409
    .line 3410
    .line 3411
    goto :goto_1b

    .line 3412
    :cond_56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3413
    .line 3414
    .line 3415
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3416
    .line 3417
    return-object v0

    .line 3418
    nop

    .line 3419
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
