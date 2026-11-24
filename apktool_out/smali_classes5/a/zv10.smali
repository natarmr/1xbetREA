.class public final synthetic La/zv10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dw10;


# direct methods
.method public synthetic constructor <init>(La/dw10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zv10;->a:B

    iput-object p1, p0, La/zv10;->b:La/dw10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zv10;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/zv10;->b:La/dw10;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 14
    .line 15
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, La/cx10;->B()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 26
    .line 27
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v5, La/yw10;

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x1

    .line 39
    const/4 v6, 0x1

    .line 40
    const-class v8, La/cx10;

    .line 41
    .line 42
    const-string v9, "handleError"

    .line 43
    .line 44
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 45
    .line 46
    invoke-direct/range {v5 .. v12}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v7, La/cx10;->f:La/mne;

    .line 50
    .line 51
    iget-object v11, v1, La/mne;->b:La/dvj;

    .line 52
    .line 53
    new-instance v12, La/xw10;

    .line 54
    .line 55
    invoke-direct {v12, v7, v4, v3}, La/xw10;-><init>(La/cx10;La/yje;B)V

    .line 56
    .line 57
    .line 58
    const/16 v13, 0xa

    .line 59
    .line 60
    const/4 v10, 0x0

    .line 61
    move-object v8, v0

    .line 62
    move-object v9, v5

    .line 63
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_1
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    new-instance v4, Lkotlin/Pair;

    .line 78
    .line 79
    const-string v5, "PAYMENT_CLICK_REQUEST_KEY"

    .line 80
    .line 81
    invoke-direct {v4, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v1, v2, v5}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v1, v0, La/cx10;->k:La/v88;

    .line 100
    .line 101
    iget-object v0, v0, La/cx10;->d:La/i1w0;

    .line 102
    .line 103
    const-wide/16 v4, 0x0

    .line 104
    .line 105
    invoke-static {v1, v0, v4, v5, v3}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_2
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 112
    .line 113
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    new-instance v3, Lkotlin/Pair;

    .line 120
    .line 121
    const-string v5, "CHANGE_BALANCE_CLICK_REQUEST_KEY"

    .line 122
    .line 123
    invoke-direct {v3, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2, v5}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v6, La/yw10;

    .line 146
    .line 147
    const/4 v12, 0x0

    .line 148
    const/4 v13, 0x0

    .line 149
    const/4 v7, 0x1

    .line 150
    const-class v9, La/cx10;

    .line 151
    .line 152
    const-string v10, "handleError"

    .line 153
    .line 154
    const-string v11, "handleError(Ljava/lang/Throwable;)V"

    .line 155
    .line 156
    invoke-direct/range {v6 .. v13}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v8, La/cx10;->f:La/mne;

    .line 160
    .line 161
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 162
    .line 163
    new-instance v13, La/uw10;

    .line 164
    .line 165
    const/4 v1, 0x3

    .line 166
    invoke-direct {v13, v8, v4, v1}, La/uw10;-><init>(La/cx10;La/yje;B)V

    .line 167
    .line 168
    .line 169
    const/16 v14, 0xa

    .line 170
    .line 171
    const/4 v11, 0x0

    .line 172
    move-object v9, v0

    .line 173
    move-object v10, v6

    .line 174
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_3
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 181
    .line 182
    invoke-virtual {v0}, La/dw10;->H0()La/vki;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v0, v0, La/vki;->G:La/n5d0;

    .line 187
    .line 188
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, La/uki;

    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_4
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    instance-of v2, v1, La/af3;

    .line 209
    .line 210
    if-eqz v2, :cond_0

    .line 211
    .line 212
    check-cast v1, La/af3;

    .line 213
    .line 214
    goto :goto_0

    .line 215
    :cond_0
    move-object v1, v4

    .line 216
    :goto_0
    const-class v2, La/ew10;

    .line 217
    .line 218
    if-eqz v1, :cond_3

    .line 219
    .line 220
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, La/o5d0;

    .line 229
    .line 230
    if-eqz v1, :cond_1

    .line 231
    .line 232
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, La/ze3;

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_1
    move-object v1, v4

    .line 240
    :goto_1
    instance-of v3, v1, La/ew10;

    .line 241
    .line 242
    if-nez v3, :cond_2

    .line 243
    .line 244
    move-object v1, v4

    .line 245
    :cond_2
    check-cast v1, La/ew10;

    .line 246
    .line 247
    if-eqz v1, :cond_3

    .line 248
    .line 249
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v10, v1, La/ew10;->c:La/peg0;

    .line 257
    .line 258
    iget-object v15, v1, La/ew10;->d:La/ii;

    .line 259
    .line 260
    iget-object v0, v1, La/ew10;->a:La/mne;

    .line 261
    .line 262
    iget-object v2, v1, La/ew10;->b:La/v88;

    .line 263
    .line 264
    iget-object v3, v1, La/ew10;->e:La/m1e;

    .line 265
    .line 266
    iget-object v4, v1, La/ew10;->f:La/gst0;

    .line 267
    .line 268
    iget-object v5, v1, La/ew10;->g:La/pmi0;

    .line 269
    .line 270
    iget-object v6, v1, La/ew10;->h:La/pru;

    .line 271
    .line 272
    iget-object v7, v1, La/ew10;->i:La/ag3;

    .line 273
    .line 274
    iget-object v8, v1, La/ew10;->j:La/ytt;

    .line 275
    .line 276
    iget-object v9, v1, La/ew10;->k:La/yfu;

    .line 277
    .line 278
    iget-object v11, v1, La/ew10;->m:La/do20;

    .line 279
    .line 280
    iget-object v12, v1, La/ew10;->n:La/lbu;

    .line 281
    .line 282
    iget-object v14, v1, La/ew10;->o:La/rou;

    .line 283
    .line 284
    move-object/from16 v23, v8

    .line 285
    .line 286
    iget-object v8, v1, La/ew10;->l:La/wsf0;

    .line 287
    .line 288
    move-object/from16 v16, v0

    .line 289
    .line 290
    iget-object v0, v1, La/ew10;->p:La/zlt0;

    .line 291
    .line 292
    move-object/from16 v28, v0

    .line 293
    .line 294
    iget-object v0, v1, La/ew10;->q:La/kt2;

    .line 295
    .line 296
    move-object/from16 v29, v0

    .line 297
    .line 298
    iget-object v0, v1, La/ew10;->r:La/duj;

    .line 299
    .line 300
    move-object/from16 v30, v0

    .line 301
    .line 302
    iget-object v0, v1, La/ew10;->s:La/ctf0;

    .line 303
    .line 304
    move-object/from16 v31, v0

    .line 305
    .line 306
    iget-object v0, v1, La/ew10;->t:La/dmt;

    .line 307
    .line 308
    move-object/from16 v21, v6

    .line 309
    .line 310
    iget-object v6, v1, La/ew10;->u:La/d1p;

    .line 311
    .line 312
    move-object/from16 v22, v7

    .line 313
    .line 314
    iget-object v7, v1, La/ew10;->v:La/nr00;

    .line 315
    .line 316
    move-object/from16 v24, v9

    .line 317
    .line 318
    iget-object v9, v1, La/ew10;->w:La/onv;

    .line 319
    .line 320
    move-object/from16 v32, v0

    .line 321
    .line 322
    iget-object v0, v1, La/ew10;->x:La/r9u;

    .line 323
    .line 324
    move-object/from16 v26, v12

    .line 325
    .line 326
    iget-object v12, v1, La/ew10;->y:La/nr00;

    .line 327
    .line 328
    move-object/from16 v33, v0

    .line 329
    .line 330
    iget-object v0, v1, La/ew10;->z:La/wdk0;

    .line 331
    .line 332
    move-object/from16 v25, v11

    .line 333
    .line 334
    iget-object v11, v1, La/ew10;->A:La/lef0;

    .line 335
    .line 336
    move-object/from16 v34, v0

    .line 337
    .line 338
    iget-object v0, v1, La/ew10;->B:La/mnb;

    .line 339
    .line 340
    move-object/from16 v35, v0

    .line 341
    .line 342
    iget-object v0, v1, La/ew10;->C:La/bzt;

    .line 343
    .line 344
    move-object/from16 v36, v0

    .line 345
    .line 346
    iget-object v0, v1, La/ew10;->D:La/qho;

    .line 347
    .line 348
    move-object/from16 v27, v14

    .line 349
    .line 350
    iget-object v14, v1, La/ew10;->E:La/o470;

    .line 351
    .line 352
    iget-object v1, v1, La/ew10;->F:La/n4u;

    .line 353
    .line 354
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-object/from16 v20, v5

    .line 379
    .line 380
    new-instance v5, La/vki;

    .line 381
    .line 382
    move-object/from16 v37, v0

    .line 383
    .line 384
    move-object/from16 v38, v1

    .line 385
    .line 386
    move-object/from16 v17, v2

    .line 387
    .line 388
    move-object/from16 v18, v3

    .line 389
    .line 390
    move-object/from16 v19, v4

    .line 391
    .line 392
    invoke-direct/range {v5 .. v38}, La/vki;-><init>(La/d1p;La/nr00;La/wsf0;La/onv;La/peg0;La/lef0;La/nr00;La/i1w0;La/o470;La/ii;La/mne;La/v88;La/m1e;La/gst0;La/pmi0;La/pru;La/ag3;La/ytt;La/yfu;La/do20;La/lbu;La/rou;La/zlt0;La/kt2;La/duj;La/ctf0;La/dmt;La/r9u;La/wdk0;La/mnb;La/bzt;La/qho;La/n4u;)V

    .line 393
    .line 394
    .line 395
    move-object v4, v5

    .line 396
    goto :goto_2

    .line 397
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 398
    .line 399
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    :goto_2
    return-object v4

    .line 407
    :pswitch_5
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 408
    .line 409
    sget-object v1, La/ufo0;->Q1:La/s2m0;

    .line 410
    .line 411
    iget-object v3, v0, La/dw10;->P1:La/yzn0;

    .line 412
    .line 413
    sget-object v4, La/dw10;->W1:[La/iiy;

    .line 414
    .line 415
    aget-object v4, v4, v2

    .line 416
    .line 417
    invoke-virtual {v3, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, La/r040;

    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    new-instance v1, La/ufo0;

    .line 427
    .line 428
    invoke-direct {v1}, La/ufo0;-><init>()V

    .line 429
    .line 430
    .line 431
    sget-object v3, La/ufo0;->R1:[La/iiy;

    .line 432
    .line 433
    aget-object v2, v3, v2

    .line 434
    .line 435
    iget-object v3, v1, La/ufo0;->O1:La/yzn0;

    .line 436
    .line 437
    invoke-virtual {v3, v1, v2, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 438
    .line 439
    .line 440
    return-object v1

    .line 441
    :pswitch_6
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 442
    .line 443
    sget-object v1, La/jho0;->R1:La/y2m0;

    .line 444
    .line 445
    iget-object v3, v0, La/dw10;->P1:La/yzn0;

    .line 446
    .line 447
    sget-object v4, La/dw10;->W1:[La/iiy;

    .line 448
    .line 449
    aget-object v4, v4, v2

    .line 450
    .line 451
    invoke-virtual {v3, v0, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, La/r040;

    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    new-instance v1, La/jho0;

    .line 461
    .line 462
    invoke-direct {v1}, La/jho0;-><init>()V

    .line 463
    .line 464
    .line 465
    sget-object v3, La/jho0;->S1:[La/iiy;

    .line 466
    .line 467
    aget-object v2, v3, v2

    .line 468
    .line 469
    iget-object v3, v1, La/jho0;->O1:La/yzn0;

    .line 470
    .line 471
    invoke-virtual {v3, v1, v2, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 472
    .line 473
    .line 474
    return-object v1

    .line 475
    :pswitch_7
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 476
    .line 477
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, La/cx10;->B()V

    .line 482
    .line 483
    .line 484
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_8
    sget-object v1, La/dw10;->V1:La/uuz;

    .line 488
    .line 489
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    iget-object v1, v0, La/cx10;->z:La/tzi;

    .line 494
    .line 495
    iget-object v2, v1, La/tzi;->h:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v2, La/ag3;

    .line 498
    .line 499
    iget-object v2, v2, La/ag3;->a:La/kt2;

    .line 500
    .line 501
    const-string v3, "header_menu_msg_click"

    .line 502
    .line 503
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    iget-object v1, v1, La/tzi;->d:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v1, La/je;

    .line 509
    .line 510
    iget-object v1, v1, La/je;->a:La/s1p;

    .line 511
    .line 512
    const-wide/16 v2, 0xc41

    .line 513
    .line 514
    sget-object v4, La/xun;->a:La/xun;

    .line 515
    .line 516
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 517
    .line 518
    .line 519
    iget-object v1, v0, La/cx10;->d:La/i1w0;

    .line 520
    .line 521
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    iget-object v0, v0, La/cx10;->i:La/q840;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance v0, Lorg/xplatform/messages/navigation/MessagesScreens$MessagesScreen;

    .line 531
    .line 532
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 536
    .line 537
    .line 538
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 539
    .line 540
    const/4 v2, 0x0

    .line 541
    invoke-static {v1, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    :goto_3
    move-object v2, v0

    .line 546
    check-cast v2, La/paw;

    .line 547
    .line 548
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-eqz v3, :cond_4

    .line 553
    .line 554
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    check-cast v2, La/oe50;

    .line 559
    .line 560
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 561
    .line 562
    .line 563
    goto :goto_3

    .line 564
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 565
    .line 566
    return-object v0

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
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
