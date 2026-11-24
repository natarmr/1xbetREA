.class public final synthetic La/pw4;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/pw4;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pw4;->a:B

    .line 4
    .line 5
    const-string v2, "changeBalanceDialogProvider"

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const-wide/16 v4, 0x2fb8

    .line 9
    .line 10
    const-string v6, "action"

    .line 11
    .line 12
    const-string v7, "express_boost_info_call"

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/r7f;

    .line 23
    .line 24
    invoke-virtual {v0}, La/r7f;->C()La/et7;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, La/et7;->b:La/k3p;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v1, La/m2a;->m:La/m2a;

    .line 34
    .line 35
    :goto_0
    invoke-virtual {v0, v9, v1}, La/r7f;->o0(ZLa/k3p;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/r7f;

    .line 44
    .line 45
    invoke-virtual {v0}, La/r7f;->b0()V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, La/axe;

    .line 54
    .line 55
    sget-object v1, La/axe;->e2:La/kud;

    .line 56
    .line 57
    invoke-virtual {v0}, La/axe;->P0()V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_2
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/r7f;

    .line 66
    .line 67
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 68
    .line 69
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 70
    .line 71
    const-string v2, "close"

    .line 72
    .line 73
    invoke-static {v6, v2, v1, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, La/r7f;->K0:La/x20;

    .line 77
    .line 78
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 79
    .line 80
    new-instance v3, La/j1p;

    .line 81
    .line 82
    invoke-direct {v3, v2, v8}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 97
    .line 98
    iget-object v14, v1, La/mne;->b:La/dvj;

    .line 99
    .line 100
    sget-object v12, La/k6f;->a:La/k6f;

    .line 101
    .line 102
    new-instance v15, La/l6f;

    .line 103
    .line 104
    invoke-direct {v15, v0, v10, v8}, La/l6f;-><init>(La/r7f;La/yje;B)V

    .line 105
    .line 106
    .line 107
    const/16 v16, 0xa

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 111
    .line 112
    .line 113
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_3
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, La/r7f;

    .line 119
    .line 120
    invoke-virtual {v0}, La/r7f;->C()La/et7;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-eqz v1, :cond_1

    .line 125
    .line 126
    iget-object v1, v1, La/et7;->b:La/k3p;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    sget-object v1, La/m2a;->m:La/m2a;

    .line 130
    .line 131
    :goto_1
    invoke-virtual {v0, v9, v1}, La/r7f;->o0(ZLa/k3p;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_4
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, La/r7f;

    .line 140
    .line 141
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 142
    .line 143
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 144
    .line 145
    const-string v2, "info"

    .line 146
    .line 147
    invoke-static {v6, v2, v1, v7}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v1, v0, La/r7f;->K0:La/x20;

    .line 151
    .line 152
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 153
    .line 154
    invoke-static {v2, v1, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v0, La/r7f;->s0:La/ert;

    .line 158
    .line 159
    invoke-virtual {v1}, La/ert;->a()La/g0f;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    new-instance v2, La/r3f;

    .line 164
    .line 165
    iget v3, v1, La/g0f;->o:I

    .line 166
    .line 167
    iget-object v1, v1, La/g0f;->m:Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v2, v3, v1}, La/r3f;-><init>(ILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v2}, La/r7f;->R(La/c4f;)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_5
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/r7f;

    .line 181
    .line 182
    iput-boolean v9, v0, La/r7f;->x1:Z

    .line 183
    .line 184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_6
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, La/r7f;

    .line 190
    .line 191
    sget-object v1, La/m3f;->a:La/m3f;

    .line 192
    .line 193
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_7
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, La/r7f;

    .line 202
    .line 203
    sget-object v1, La/q3f;->a:La/q3f;

    .line 204
    .line 205
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 206
    .line 207
    .line 208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_8
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 212
    .line 213
    move-object v3, v0

    .line 214
    check-cast v3, La/axe;

    .line 215
    .line 216
    sget-object v0, La/axe;->e2:La/kud;

    .line 217
    .line 218
    iget-object v1, v3, La/axe;->U1:La/wdk0;

    .line 219
    .line 220
    if-eqz v1, :cond_2

    .line 221
    .line 222
    new-instance v2, La/xdk0;

    .line 223
    .line 224
    sget-object v12, La/pek0;->a:La/pek0;

    .line 225
    .line 226
    const v0, 0x7f1301ac

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    const/16 v18, 0x7c

    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    const/4 v15, 0x0

    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    move-object v11, v2

    .line 245
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, La/axe;->L0()La/pzq;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v5, v0, La/pzq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 253
    .line 254
    const/4 v7, 0x0

    .line 255
    const/16 v8, 0x3e4

    .line 256
    .line 257
    const/4 v4, 0x0

    .line 258
    const/4 v6, 0x1

    .line 259
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 260
    .line 261
    .line 262
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_2
    const-string v0, "snackbarManager"

    .line 266
    .line 267
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v10

    .line 271
    :pswitch_9
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, La/dk5;

    .line 274
    .line 275
    invoke-virtual {v0}, La/dk5;->O()V

    .line 276
    .line 277
    .line 278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, La/dk5;

    .line 284
    .line 285
    invoke-virtual {v0}, La/dk5;->O()V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, La/on4;

    .line 294
    .line 295
    invoke-virtual {v0}, La/on4;->b()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0

    .line 304
    :pswitch_c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, La/gob;

    .line 307
    .line 308
    iget-object v1, v0, La/gob;->m:La/zg;

    .line 309
    .line 310
    iget-object v1, v1, La/zg;->a:La/kt2;

    .line 311
    .line 312
    const-string v2, "create_bill_bottom_call"

    .line 313
    .line 314
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    iget-object v1, v0, La/gob;->q:La/i1w0;

    .line 318
    .line 319
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    iget-object v0, v0, La/gob;->p:La/wxs0;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v0, Lorg/xplatform/wallet/impl/navigation/WalletsScreen$AddWalletScreen;

    .line 329
    .line 330
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 334
    .line 335
    .line 336
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 337
    .line 338
    invoke-static {v1, v0, v8}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    :goto_2
    move-object v2, v0

    .line 343
    check-cast v2, La/paw;

    .line 344
    .line 345
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-eqz v3, :cond_3

    .line 350
    .line 351
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, La/oe50;

    .line 356
    .line 357
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 358
    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object v0

    .line 364
    :pswitch_d
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, La/gob;

    .line 367
    .line 368
    iget-object v1, v0, La/gob;->w:La/bby;

    .line 369
    .line 370
    if-eqz v1, :cond_4

    .line 371
    .line 372
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-ne v1, v9, :cond_4

    .line 377
    .line 378
    goto :goto_3

    .line 379
    :cond_4
    iget-object v1, v0, La/gob;->v:La/ql5;

    .line 380
    .line 381
    if-nez v1, :cond_5

    .line 382
    .line 383
    goto :goto_3

    .line 384
    :cond_5
    iget-object v2, v0, La/gob;->l:La/ih5;

    .line 385
    .line 386
    iget-object v2, v2, La/ih5;->a:La/kt2;

    .line 387
    .line 388
    const-string v3, "deposit_call"

    .line 389
    .line 390
    const-string v4, "screen"

    .line 391
    .line 392
    const-string v5, "spoiler_bill_choise"

    .line 393
    .line 394
    invoke-static {v4, v5, v2, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    iget-object v2, v0, La/gob;->r:La/l7k;

    .line 398
    .line 399
    sget-object v3, La/y1p;->b:La/y1p;

    .line 400
    .line 401
    iget-object v3, v0, La/gob;->s:La/cmt;

    .line 402
    .line 403
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-virtual {v2, v5, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    iget-object v2, v0, La/gob;->o:La/mne;

    .line 415
    .line 416
    iget-object v14, v2, La/mne;->c:La/vs10;

    .line 417
    .line 418
    new-instance v12, La/znb;

    .line 419
    .line 420
    invoke-direct {v12, v0, v9}, La/znb;-><init>(La/gob;B)V

    .line 421
    .line 422
    .line 423
    new-instance v15, La/fob;

    .line 424
    .line 425
    invoke-direct {v15, v0, v1, v10, v8}, La/fob;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 426
    .line 427
    .line 428
    const/16 v16, 0xa

    .line 429
    .line 430
    const/4 v13, 0x0

    .line 431
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    iput-object v1, v0, La/gob;->w:La/bby;

    .line 436
    .line 437
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_e
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v0, La/mr9;

    .line 443
    .line 444
    iget-object v1, v0, La/mr9;->k:La/bby;

    .line 445
    .line 446
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 447
    .line 448
    .line 449
    iget-object v0, v0, La/mr9;->m:La/p7m0;

    .line 450
    .line 451
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 452
    .line 453
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_f
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, La/p89;

    .line 465
    .line 466
    iget-object v1, v0, La/p89;->o:La/bby;

    .line 467
    .line 468
    if-eqz v1, :cond_6

    .line 469
    .line 470
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-ne v1, v9, :cond_6

    .line 475
    .line 476
    goto :goto_4

    .line 477
    :cond_6
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 478
    .line 479
    .line 480
    move-result-object v11

    .line 481
    sget-object v12, La/n89;->a:La/n89;

    .line 482
    .line 483
    iget-object v1, v0, La/p89;->d:La/mne;

    .line 484
    .line 485
    iget-object v14, v1, La/mne;->c:La/vs10;

    .line 486
    .line 487
    new-instance v15, La/k89;

    .line 488
    .line 489
    invoke-direct {v15, v0, v10, v3}, La/k89;-><init>(La/p89;La/yje;B)V

    .line 490
    .line 491
    .line 492
    const/16 v16, 0xa

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    iput-object v1, v0, La/p89;->o:La/bby;

    .line 500
    .line 501
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    return-object v0

    .line 504
    :pswitch_10
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 505
    .line 506
    move-object v1, v0

    .line 507
    check-cast v1, La/p89;

    .line 508
    .line 509
    iget-object v2, v1, La/p89;->l:La/p7m0;

    .line 510
    .line 511
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    move-object v3, v0

    .line 516
    check-cast v3, La/b89;

    .line 517
    .line 518
    const/4 v9, 0x0

    .line 519
    const/16 v10, 0x7e7f

    .line 520
    .line 521
    const/4 v4, 0x0

    .line 522
    const/4 v5, 0x0

    .line 523
    const/4 v6, 0x1

    .line 524
    const/4 v7, 0x0

    .line 525
    const/4 v8, 0x0

    .line 526
    invoke-static/range {v3 .. v10}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    if-eqz v0, :cond_7

    .line 535
    .line 536
    invoke-virtual {v1}, La/p89;->y()V

    .line 537
    .line 538
    .line 539
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object v0

    .line 542
    :pswitch_11
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 543
    .line 544
    move-object v1, v0

    .line 545
    check-cast v1, La/p89;

    .line 546
    .line 547
    iget-object v2, v1, La/p89;->l:La/p7m0;

    .line 548
    .line 549
    :cond_8
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    move-object v3, v0

    .line 554
    check-cast v3, La/b89;

    .line 555
    .line 556
    const/4 v9, 0x0

    .line 557
    const/16 v10, 0x7f5f

    .line 558
    .line 559
    const/4 v4, 0x1

    .line 560
    const/4 v5, 0x1

    .line 561
    const/4 v6, 0x0

    .line 562
    const/4 v7, 0x0

    .line 563
    const/4 v8, 0x0

    .line 564
    invoke-static/range {v3 .. v10}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    if-eqz v0, :cond_8

    .line 573
    .line 574
    invoke-virtual {v1}, La/p89;->z()V

    .line 575
    .line 576
    .line 577
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_12
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v0, La/yj8;

    .line 583
    .line 584
    invoke-virtual {v0}, La/yj8;->w()V

    .line 585
    .line 586
    .line 587
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_13
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, La/cb8;

    .line 593
    .line 594
    invoke-virtual {v0}, La/cb8;->a()Z

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    iget-object v0, v0, La/cb8;->h:La/cgk0;

    .line 599
    .line 600
    if-eqz v1, :cond_9

    .line 601
    .line 602
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    add-int/2addr v1, v9

    .line 607
    invoke-virtual {v0, v1}, La/cgk0;->m(I)V

    .line 608
    .line 609
    .line 610
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object v0

    .line 613
    :pswitch_14
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v0, La/as6;

    .line 616
    .line 617
    invoke-virtual {v0}, La/as6;->B()V

    .line 618
    .line 619
    .line 620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object v0

    .line 623
    :pswitch_15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, La/as6;

    .line 626
    .line 627
    invoke-virtual {v0}, La/as6;->C()V

    .line 628
    .line 629
    .line 630
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object v0

    .line 633
    :pswitch_16
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, La/po6;

    .line 636
    .line 637
    iget-object v1, v0, La/po6;->A:La/v88;

    .line 638
    .line 639
    iget-object v0, v0, La/po6;->E:La/i1w0;

    .line 640
    .line 641
    const-wide/16 v2, 0x0

    .line 642
    .line 643
    const/4 v4, 0x4

    .line 644
    invoke-static {v1, v0, v2, v3, v4}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 645
    .line 646
    .line 647
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 651
    .line 652
    move-object v13, v0

    .line 653
    check-cast v13, La/po6;

    .line 654
    .line 655
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 659
    .line 660
    .line 661
    move-result-object v4

    .line 662
    iget-object v0, v13, La/po6;->D:La/mne;

    .line 663
    .line 664
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 665
    .line 666
    new-instance v5, La/yj5;

    .line 667
    .line 668
    const/16 v17, 0x0

    .line 669
    .line 670
    const/16 v18, 0x12

    .line 671
    .line 672
    const/4 v12, 0x1

    .line 673
    const-class v14, La/po6;

    .line 674
    .line 675
    const-string v15, "emitShowSnackBarWithDefaultErrorMessage"

    .line 676
    .line 677
    const-string v16, "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V"

    .line 678
    .line 679
    move-object v11, v5

    .line 680
    invoke-direct/range {v11 .. v18}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 681
    .line 682
    .line 683
    new-instance v8, La/ko6;

    .line 684
    .line 685
    invoke-direct {v8, v13, v10, v3}, La/ko6;-><init>(La/po6;La/yje;B)V

    .line 686
    .line 687
    .line 688
    const/16 v9, 0xa

    .line 689
    .line 690
    const/4 v6, 0x0

    .line 691
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 692
    .line 693
    .line 694
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0

    .line 697
    :pswitch_18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v0, La/ol5;

    .line 700
    .line 701
    sget-object v1, La/ol5;->R1:La/kl5;

    .line 702
    .line 703
    iget-object v3, v0, La/ol5;->L1:La/ynb;

    .line 704
    .line 705
    if-eqz v3, :cond_a

    .line 706
    .line 707
    sget-object v4, La/bm5;->g:La/bm5;

    .line 708
    .line 709
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 710
    .line 711
    .line 712
    move-result-object v6

    .line 713
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    const-string v8, "CHANGE_BALANCE_KEY"

    .line 717
    .line 718
    const/16 v9, 0x1ee

    .line 719
    .line 720
    const/4 v5, 0x0

    .line 721
    const/4 v7, 0x0

    .line 722
    invoke-static/range {v3 .. v9}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 723
    .line 724
    .line 725
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 726
    .line 727
    return-object v0

    .line 728
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    throw v10

    .line 732
    :pswitch_19
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v0, La/bl5;

    .line 735
    .line 736
    sget-object v1, La/bl5;->R1:La/yk5;

    .line 737
    .line 738
    iget-object v3, v0, La/bl5;->L1:La/ynb;

    .line 739
    .line 740
    if-eqz v3, :cond_b

    .line 741
    .line 742
    sget-object v4, La/bm5;->g:La/bm5;

    .line 743
    .line 744
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    const-string v8, "CHANGE_BALANCE_KEY"

    .line 752
    .line 753
    const/16 v9, 0x1ee

    .line 754
    .line 755
    const/4 v5, 0x0

    .line 756
    const/4 v7, 0x0

    .line 757
    invoke-static/range {v3 .. v9}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 758
    .line 759
    .line 760
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 761
    .line 762
    return-object v0

    .line 763
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    throw v10

    .line 767
    :pswitch_1a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v0, La/dk5;

    .line 770
    .line 771
    invoke-virtual {v0}, La/dk5;->N()V

    .line 772
    .line 773
    .line 774
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_1b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, La/fy4;

    .line 780
    .line 781
    invoke-virtual {v0}, La/fy4;->D()V

    .line 782
    .line 783
    .line 784
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 785
    .line 786
    return-object v0

    .line 787
    :pswitch_1c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v0, La/rw4;

    .line 790
    .line 791
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    return-object v0

    .line 796
    nop

    .line 797
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
