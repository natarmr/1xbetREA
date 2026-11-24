.class public final synthetic La/m1w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s1w;


# direct methods
.method public synthetic constructor <init>(La/s1w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m1w;->a:B

    iput-object p1, p0, La/m1w;->b:La/s1w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m1w;->a:B

    .line 4
    .line 5
    const-string v2, "history_anonim"

    .line 6
    .line 7
    const-string v3, "history_user"

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const-string v5, "BUNDLE_RESULT_END_TIME_SEC"

    .line 11
    .line 12
    const-string v6, "BUNDLE_RESULT_START_TIME_SEC"

    .line 13
    .line 14
    const-string v7, "screen"

    .line 15
    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x0

    .line 21
    iget-object v0, v0, La/m1w;->b:La/s1w;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, Landroid/os/Bundle;

    .line 29
    .line 30
    sget-object v2, La/s1w;->d2:La/bst;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v6, v8, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v14

    .line 39
    invoke-virtual {v1, v5, v8, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v16

    .line 43
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 44
    .line 45
    .line 46
    move-result-object v13

    .line 47
    cmp-long v0, v16, v8

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    iget-object v0, v13, La/naw;->Z0:La/ol60;

    .line 52
    .line 53
    new-instance v1, La/n9w;

    .line 54
    .line 55
    invoke-direct {v1, v14, v15}, La/n9w;-><init>(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-object v1, v13, La/naw;->W0:La/p7m0;

    .line 63
    .line 64
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object/from16 v18, v0

    .line 69
    .line 70
    check-cast v18, La/l9h0;

    .line 71
    .line 72
    const/16 v31, 0x0

    .line 73
    .line 74
    const/16 v32, 0x7ffe

    .line 75
    .line 76
    const/16 v19, 0x1

    .line 77
    .line 78
    const/16 v20, 0x0

    .line 79
    .line 80
    const/16 v21, 0x0

    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const/16 v23, 0x0

    .line 85
    .line 86
    const/16 v24, 0x0

    .line 87
    .line 88
    const/16 v25, 0x0

    .line 89
    .line 90
    const/16 v26, 0x0

    .line 91
    .line 92
    const/16 v27, 0x0

    .line 93
    .line 94
    const/16 v28, 0x0

    .line 95
    .line 96
    const/16 v29, 0x0

    .line 97
    .line 98
    const/16 v30, 0x0

    .line 99
    .line 100
    invoke-static/range {v18 .. v32}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v1, v13, La/naw;->b1:La/ax5;

    .line 115
    .line 116
    iget-object v2, v13, La/naw;->L:La/mne;

    .line 117
    .line 118
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v12, La/iaw;

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0x1

    .line 132
    .line 133
    invoke-direct/range {v12 .. v19}, La/iaw;-><init>(La/naw;JJLa/yje;B)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v1, v11, v12, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 137
    .line 138
    .line 139
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_0
    move-object/from16 v1, p1

    .line 143
    .line 144
    check-cast v1, La/h7d;

    .line 145
    .line 146
    sget-object v2, La/s1w;->d2:La/bst;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v0, v0, La/s1w;->Y1:La/a8z;

    .line 152
    .line 153
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, La/t3w;

    .line 158
    .line 159
    iget-object v1, v1, La/h7d;->c:La/mva;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, La/q4;->F(La/mva;)V

    .line 162
    .line 163
    .line 164
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_1
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, Landroid/os/Bundle;

    .line 170
    .line 171
    sget-object v2, La/s1w;->d2:La/bst;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v6, v8, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v2

    .line 180
    invoke-virtual {v1, v5, v8, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 181
    .line 182
    .line 183
    move-result-wide v17

    .line 184
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    const-string v0, "BUNDLE_RESULT_CANCELED"

    .line 189
    .line 190
    invoke-virtual {v1, v0, v12}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_2

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_2
    cmp-long v0, v17, v8

    .line 198
    .line 199
    if-nez v0, :cond_3

    .line 200
    .line 201
    iget-object v0, v14, La/naw;->Z0:La/ol60;

    .line 202
    .line 203
    new-instance v1, La/e9w;

    .line 204
    .line 205
    iget-object v4, v14, La/naw;->Q0:La/sff0;

    .line 206
    .line 207
    iget-object v4, v4, La/sff0;->a:La/gx7;

    .line 208
    .line 209
    iget-object v4, v4, La/gx7;->b:La/q57;

    .line 210
    .line 211
    iget v4, v4, La/q57;->d:I

    .line 212
    .line 213
    invoke-direct {v1, v2, v3, v4}, La/e9w;-><init>(JI)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_3
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v13, La/iaw;

    .line 225
    .line 226
    const/16 v19, 0x0

    .line 227
    .line 228
    const/16 v20, 0x0

    .line 229
    .line 230
    move-wide v15, v2

    .line 231
    invoke-direct/range {v13 .. v20}, La/iaw;-><init>(La/naw;JJLa/yje;B)V

    .line 232
    .line 233
    .line 234
    const/4 v1, 0x3

    .line 235
    invoke-static {v0, v11, v11, v13, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 236
    .line 237
    .line 238
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_2
    move-object/from16 v1, p1

    .line 242
    .line 243
    check-cast v1, Landroid/os/Bundle;

    .line 244
    .line 245
    sget-object v2, La/s1w;->d2:La/bst;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    const-string v2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_4

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    instance-of v2, v1, La/ql5;

    .line 263
    .line 264
    if-eqz v2, :cond_4

    .line 265
    .line 266
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v1, La/ql5;

    .line 271
    .line 272
    invoke-virtual {v0, v1}, La/naw;->C(La/ql5;)V

    .line 273
    .line 274
    .line 275
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_3
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, Landroid/os/Bundle;

    .line 281
    .line 282
    sget-object v2, La/s1w;->d2:La/bst;

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    const-string v2, "RESULT_TYPE"

    .line 288
    .line 289
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    instance-of v2, v1, La/vlq0;

    .line 294
    .line 295
    if-eqz v2, :cond_5

    .line 296
    .line 297
    check-cast v1, La/vlq0;

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_5
    move-object v1, v11

    .line 301
    :goto_2
    if-eqz v1, :cond_6

    .line 302
    .line 303
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    iget-object v3, v0, La/naw;->L:La/mne;

    .line 312
    .line 313
    iget-object v5, v3, La/mne;->b:La/dvj;

    .line 314
    .line 315
    new-instance v3, La/p8w;

    .line 316
    .line 317
    invoke-direct {v3, v0, v12}, La/p8w;-><init>(La/naw;B)V

    .line 318
    .line 319
    .line 320
    new-instance v6, La/fhq;

    .line 321
    .line 322
    const/16 v4, 0xf

    .line 323
    .line 324
    invoke-direct {v6, v0, v1, v11, v4}, La/fhq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 325
    .line 326
    .line 327
    const/16 v7, 0xa

    .line 328
    .line 329
    const/4 v4, 0x0

    .line 330
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 331
    .line 332
    .line 333
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_4
    move-object/from16 v1, p1

    .line 337
    .line 338
    check-cast v1, Landroid/view/View;

    .line 339
    .line 340
    sget-object v2, La/s1w;->d2:La/bst;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    iget-object v1, v0, La/naw;->l0:La/q37;

    .line 350
    .line 351
    sget-object v2, La/y1p;->b:La/y1p;

    .line 352
    .line 353
    iget-object v2, v0, La/naw;->w0:La/cmt;

    .line 354
    .line 355
    invoke-virtual {v2}, La/cmt;->g()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v4, v1, La/q37;->e:La/ih5;

    .line 363
    .line 364
    iget-object v4, v4, La/ih5;->a:La/kt2;

    .line 365
    .line 366
    const-string v5, "deposit_call"

    .line 367
    .line 368
    invoke-static {v7, v3, v4, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object v1, v1, La/q37;->f:La/l7k;

    .line 372
    .line 373
    invoke-virtual {v1, v3, v2}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v1, v0, La/naw;->C0:La/ql5;

    .line 377
    .line 378
    if-eqz v1, :cond_7

    .line 379
    .line 380
    iget-object v2, v0, La/naw;->K:La/v88;

    .line 381
    .line 382
    iget-object v0, v0, La/naw;->O:La/i1w0;

    .line 383
    .line 384
    iget-wide v3, v1, La/ql5;->a:J

    .line 385
    .line 386
    invoke-virtual {v2, v0, v10, v3, v4}, La/v88;->a(La/i1w0;ZJ)V

    .line 387
    .line 388
    .line 389
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_5
    move-object/from16 v1, p1

    .line 393
    .line 394
    check-cast v1, Landroid/view/View;

    .line 395
    .line 396
    sget-object v2, La/s1w;->d2:La/bst;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    iget-object v1, v0, La/naw;->l0:La/q37;

    .line 406
    .line 407
    sget-object v2, La/a1w;->g:La/a1w;

    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v3, v1, La/q37;->b:La/b4j;

    .line 413
    .line 414
    iget-object v3, v3, La/b4j;->a:La/kt2;

    .line 415
    .line 416
    invoke-virtual {v2}, La/a1w;->a()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-interface {v3, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    iget-object v1, v1, La/q37;->c:La/au0;

    .line 424
    .line 425
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 426
    .line 427
    const-wide/16 v2, 0xc79

    .line 428
    .line 429
    sget-object v4, La/xun;->a:La/xun;

    .line 430
    .line 431
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 432
    .line 433
    .line 434
    iget-object v1, v0, La/naw;->C0:La/ql5;

    .line 435
    .line 436
    if-eqz v1, :cond_8

    .line 437
    .line 438
    iget-object v1, v1, La/ql5;->i:La/txs0;

    .line 439
    .line 440
    invoke-virtual {v1}, La/txs0;->a()Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-ne v1, v10, :cond_8

    .line 445
    .line 446
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 447
    .line 448
    sget-object v1, La/y8w;->a:La/y8w;

    .line 449
    .line 450
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_8
    new-instance v1, Lorg/xplatform/bethistory/history/presentation/HistoryScreen;

    .line 455
    .line 456
    new-instance v2, La/p57;

    .line 457
    .line 458
    sget-object v3, La/s77;->b:La/bj5;

    .line 459
    .line 460
    iget-object v8, v0, La/naw;->A0:Ljava/lang/String;

    .line 461
    .line 462
    iget-object v9, v0, La/naw;->B0:Ljava/lang/String;

    .line 463
    .line 464
    const/4 v3, 0x4

    .line 465
    const-wide/16 v4, 0x0

    .line 466
    .line 467
    const-wide/16 v6, 0x0

    .line 468
    .line 469
    invoke-direct/range {v2 .. v9}, La/p57;-><init>(IJJLjava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    iget-object v3, v0, La/naw;->d:La/sys0;

    .line 473
    .line 474
    invoke-direct {v1, v2, v3}, Lorg/xplatform/bethistory/history/presentation/HistoryScreen;-><init>(La/p57;La/sys0;)V

    .line 475
    .line 476
    .line 477
    iget-object v0, v0, La/naw;->O:La/i1w0;

    .line 478
    .line 479
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 484
    .line 485
    if-eqz v3, :cond_9

    .line 486
    .line 487
    new-instance v3, La/e1w0;

    .line 488
    .line 489
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 490
    .line 491
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 492
    .line 493
    .line 494
    new-instance v1, La/c8d;

    .line 495
    .line 496
    sget-object v4, La/y7d;->a:La/v7d;

    .line 497
    .line 498
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    goto :goto_3

    .line 505
    :cond_9
    new-instance v3, La/w0w0;

    .line 506
    .line 507
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 508
    .line 509
    .line 510
    new-instance v1, La/c8d;

    .line 511
    .line 512
    sget-object v4, La/y7d;->a:La/v7d;

    .line 513
    .line 514
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    :goto_3
    invoke-static {v0, v2, v12}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    :goto_4
    move-object v2, v1

    .line 525
    check-cast v2, La/paw;

    .line 526
    .line 527
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    if-eqz v3, :cond_a

    .line 532
    .line 533
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    check-cast v2, La/oe50;

    .line 538
    .line 539
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 540
    .line 541
    .line 542
    goto :goto_4

    .line 543
    :cond_a
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    return-object v0

    .line 546
    :pswitch_6
    move-object/from16 v1, p1

    .line 547
    .line 548
    check-cast v1, Landroid/view/View;

    .line 549
    .line 550
    sget-object v2, La/s1w;->d2:La/bst;

    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    iget-boolean v1, v0, La/naw;->S0:Z

    .line 560
    .line 561
    iget-object v2, v0, La/naw;->D0:La/s77;

    .line 562
    .line 563
    sget-object v3, La/s77;->c:La/s77;

    .line 564
    .line 565
    if-ne v2, v3, :cond_b

    .line 566
    .line 567
    iget-object v2, v0, La/naw;->Q0:La/sff0;

    .line 568
    .line 569
    iget-object v2, v2, La/sff0;->a:La/gx7;

    .line 570
    .line 571
    iget-object v2, v2, La/gx7;->b:La/q57;

    .line 572
    .line 573
    iget-boolean v2, v2, La/q57;->b:Z

    .line 574
    .line 575
    if-eqz v2, :cond_b

    .line 576
    .line 577
    goto :goto_6

    .line 578
    :cond_b
    move v10, v12

    .line 579
    :goto_6
    if-nez v1, :cond_c

    .line 580
    .line 581
    if-eqz v10, :cond_d

    .line 582
    .line 583
    :cond_c
    iget-object v2, v0, La/naw;->l0:La/q37;

    .line 584
    .line 585
    iget-object v2, v2, La/q37;->b:La/b4j;

    .line 586
    .line 587
    iget-object v2, v2, La/b4j;->a:La/kt2;

    .line 588
    .line 589
    const-string v3, "bet_history_date_filter"

    .line 590
    .line 591
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 595
    .line 596
    new-instance v2, La/d9w;

    .line 597
    .line 598
    invoke-direct {v2, v1, v10}, La/d9w;-><init>(ZZ)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_7
    move-object/from16 v1, p1

    .line 608
    .line 609
    check-cast v1, Landroid/view/View;

    .line 610
    .line 611
    sget-object v3, La/s1w;->d2:La/bst;

    .line 612
    .line 613
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 617
    .line 618
    .line 619
    move-result-object v14

    .line 620
    iget-object v0, v14, La/naw;->l0:La/q37;

    .line 621
    .line 622
    sget-object v1, La/y1p;->i:La/y1p;

    .line 623
    .line 624
    iget-object v3, v14, La/naw;->w0:La/cmt;

    .line 625
    .line 626
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    iget-object v4, v0, La/q37;->b:La/b4j;

    .line 634
    .line 635
    iget-object v4, v4, La/b4j;->a:La/kt2;

    .line 636
    .line 637
    const-string v5, "reg_page_call"

    .line 638
    .line 639
    invoke-static {v7, v2, v4, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    iget-object v0, v0, La/q37;->d:La/s64;

    .line 643
    .line 644
    invoke-virtual {v0, v1, v3}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    new-instance v5, La/n5w;

    .line 652
    .line 653
    const/16 v18, 0x0

    .line 654
    .line 655
    const/16 v19, 0xb

    .line 656
    .line 657
    const/4 v13, 0x1

    .line 658
    const-class v15, La/naw;

    .line 659
    .line 660
    const-string v16, "handleError"

    .line 661
    .line 662
    const-string v17, "handleError(Ljava/lang/Throwable;)V"

    .line 663
    .line 664
    move-object v12, v5

    .line 665
    invoke-direct/range {v12 .. v19}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 666
    .line 667
    .line 668
    new-instance v8, La/r8w;

    .line 669
    .line 670
    const/4 v0, 0x7

    .line 671
    invoke-direct {v8, v14, v11, v0}, La/r8w;-><init>(La/naw;La/yje;B)V

    .line 672
    .line 673
    .line 674
    const/16 v9, 0xe

    .line 675
    .line 676
    const/4 v6, 0x0

    .line 677
    const/4 v7, 0x0

    .line 678
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 679
    .line 680
    .line 681
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 682
    .line 683
    return-object v0

    .line 684
    :pswitch_8
    move-object/from16 v1, p1

    .line 685
    .line 686
    check-cast v1, Landroid/view/View;

    .line 687
    .line 688
    sget-object v3, La/s1w;->d2:La/bst;

    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    iget-object v1, v0, La/naw;->l0:La/q37;

    .line 698
    .line 699
    sget-object v3, La/y1p;->b:La/y1p;

    .line 700
    .line 701
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    iget-object v3, v1, La/q37;->b:La/b4j;

    .line 705
    .line 706
    iget-object v3, v3, La/b4j;->a:La/kt2;

    .line 707
    .line 708
    const-string v4, "login_page_call"

    .line 709
    .line 710
    invoke-static {v7, v2, v3, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    iget-object v1, v1, La/q37;->d:La/s64;

    .line 714
    .line 715
    invoke-virtual {v1, v2}, La/s64;->c(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    iget-object v0, v0, La/naw;->O:La/i1w0;

    .line 719
    .line 720
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    new-instance v2, La/c8d;

    .line 725
    .line 726
    sget-object v3, La/y7d;->a:La/v7d;

    .line 727
    .line 728
    sget-object v4, La/n0w0;->a:La/n0w0;

    .line 729
    .line 730
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 731
    .line 732
    .line 733
    invoke-static {v1, v2}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    sget-object v3, La/wez;->b:La/wez;

    .line 738
    .line 739
    invoke-static {v3, v2, v0, v1, v12}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    :goto_7
    move-object v2, v1

    .line 744
    check-cast v2, La/paw;

    .line 745
    .line 746
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v3

    .line 750
    if-eqz v3, :cond_e

    .line 751
    .line 752
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    check-cast v2, La/oe50;

    .line 757
    .line 758
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 759
    .line 760
    .line 761
    goto :goto_7

    .line 762
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 763
    .line 764
    return-object v0

    .line 765
    :pswitch_9
    move-object/from16 v1, p1

    .line 766
    .line 767
    check-cast v1, Landroid/view/View;

    .line 768
    .line 769
    sget-object v2, La/s1w;->d2:La/bst;

    .line 770
    .line 771
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    iget-object v1, v0, La/naw;->m0:La/ih5;

    .line 779
    .line 780
    invoke-virtual {v1, v3}, La/ih5;->c(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    iget-object v1, v0, La/naw;->n0:La/gg5;

    .line 784
    .line 785
    invoke-virtual {v1, v3}, La/gg5;->i(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    iget-object v1, v0, La/naw;->D0:La/s77;

    .line 789
    .line 790
    sget-object v2, La/s77;->c:La/s77;

    .line 791
    .line 792
    if-eq v1, v2, :cond_10

    .line 793
    .line 794
    sget-object v2, La/s77;->f:La/s77;

    .line 795
    .line 796
    if-ne v1, v2, :cond_f

    .line 797
    .line 798
    goto :goto_8

    .line 799
    :cond_f
    move v10, v12

    .line 800
    :cond_10
    :goto_8
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 801
    .line 802
    new-instance v1, La/a9w;

    .line 803
    .line 804
    invoke-direct {v1, v10}, La/a9w;-><init>(Z)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 811
    .line 812
    return-object v0

    .line 813
    :pswitch_a
    move-object/from16 v1, p1

    .line 814
    .line 815
    check-cast v1, Ljava/lang/String;

    .line 816
    .line 817
    sget-object v2, La/s1w;->d2:La/bst;

    .line 818
    .line 819
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    const-class v3, La/s1w;

    .line 827
    .line 828
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    invoke-static {v0}, La/sj3;->L(Landroid/content/Context;)Z

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    iget-object v5, v2, La/naw;->C:La/fvt0;

    .line 841
    .line 842
    iget-object v6, v2, La/naw;->J:La/td9;

    .line 843
    .line 844
    invoke-virtual {v6, v1}, La/td9;->c(Ljava/lang/String;)La/n3w;

    .line 845
    .line 846
    .line 847
    move-result-object v6

    .line 848
    if-eqz v6, :cond_14

    .line 849
    .line 850
    iget-object v7, v6, La/n3w;->a:Ljava/lang/String;

    .line 851
    .line 852
    iget-boolean v10, v6, La/n3w;->j1:Z

    .line 853
    .line 854
    if-eqz v10, :cond_11

    .line 855
    .line 856
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 857
    .line 858
    .line 859
    move-result-wide v12

    .line 860
    cmp-long v1, v12, v8

    .line 861
    .line 862
    if-lez v1, :cond_11

    .line 863
    .line 864
    iget-object v0, v2, La/naw;->l0:La/q37;

    .line 865
    .line 866
    sget-object v1, La/a1w;->i:La/a1w;

    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    iget-object v3, v0, La/q37;->b:La/b4j;

    .line 875
    .line 876
    invoke-virtual {v3, v1, v7}, La/b4j;->i(La/a1w;Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    iget-object v0, v0, La/q37;->i:La/ix0;

    .line 880
    .line 881
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 882
    .line 883
    .line 884
    move-result-wide v7

    .line 885
    iget-object v0, v0, La/ix0;->a:La/s1p;

    .line 886
    .line 887
    const-wide/16 v9, 0xd27

    .line 888
    .line 889
    invoke-static {v7, v8, v0, v9, v10}, La/h97;->r(JLa/s1p;J)V

    .line 890
    .line 891
    .line 892
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    iget-object v1, v2, La/naw;->b1:La/ax5;

    .line 897
    .line 898
    iget-object v3, v2, La/naw;->L:La/mne;

    .line 899
    .line 900
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 901
    .line 902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    invoke-static {v1, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    new-instance v3, La/atj;

    .line 910
    .line 911
    const/16 v5, 0x1a

    .line 912
    .line 913
    invoke-direct {v3, v2, v6, v11, v5}, La/atj;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 914
    .line 915
    .line 916
    invoke-static {v0, v1, v11, v3, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 917
    .line 918
    .line 919
    goto :goto_9

    .line 920
    :cond_11
    if-nez v0, :cond_12

    .line 921
    .line 922
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 923
    .line 924
    .line 925
    move-result-wide v0

    .line 926
    invoke-virtual {v5, v0, v1}, La/fvt0;->x(J)V

    .line 927
    .line 928
    .line 929
    iget-object v0, v2, La/naw;->Z0:La/ol60;

    .line 930
    .line 931
    sget-object v1, La/v8w;->a:La/v8w;

    .line 932
    .line 933
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    goto :goto_9

    .line 937
    :cond_12
    iget-object v0, v2, La/naw;->y:La/vpt;

    .line 938
    .line 939
    invoke-virtual {v0}, La/vpt;->a()Z

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    if-nez v0, :cond_13

    .line 944
    .line 945
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 946
    .line 947
    .line 948
    move-result-wide v0

    .line 949
    invoke-virtual {v5, v0, v1}, La/fvt0;->x(J)V

    .line 950
    .line 951
    .line 952
    iget-object v0, v2, La/naw;->a1:La/ol60;

    .line 953
    .line 954
    sget-object v1, La/f9w;->a:La/f9w;

    .line 955
    .line 956
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    goto :goto_9

    .line 960
    :cond_13
    invoke-virtual {v2, v6, v3}, La/naw;->L(La/n3w;Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    :cond_14
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 964
    .line 965
    return-object v0

    .line 966
    :pswitch_b
    move-object/from16 v1, p1

    .line 967
    .line 968
    check-cast v1, Ljava/lang/String;

    .line 969
    .line 970
    sget-object v2, La/s1w;->d2:La/bst;

    .line 971
    .line 972
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 976
    .line 977
    .line 978
    move-result-object v2

    .line 979
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    iget-object v3, v3, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 984
    .line 985
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 986
    .line 987
    .line 988
    move-result-object v3

    .line 989
    instance-of v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 990
    .line 991
    if-eqz v4, :cond_15

    .line 992
    .line 993
    move-object v11, v3

    .line 994
    check-cast v11, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 995
    .line 996
    :cond_15
    if-eqz v11, :cond_16

    .line 997
    .line 998
    invoke-virtual {v11}, Landroidx/recyclerview/widget/LinearLayoutManager;->h1()I

    .line 999
    .line 1000
    .line 1001
    move-result v12

    .line 1002
    :cond_16
    iput v12, v2, La/naw;->O0:I

    .line 1003
    .line 1004
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-virtual {v0, v1}, La/naw;->F(Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1012
    .line 1013
    return-object v0

    .line 1014
    nop

    .line 1015
    :pswitch_data_0
    .packed-switch 0x0
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
