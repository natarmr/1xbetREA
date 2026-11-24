.class public final synthetic La/o0c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r0c;


# direct methods
.method public synthetic constructor <init>(La/r0c;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o0c;->a:B

    iput-object p1, p0, La/o0c;->b:La/r0c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o0c;->a:B

    .line 4
    .line 5
    const-string v2, "email"

    .line 6
    .line 7
    sget-object v3, La/y0c;->a:La/y0c;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, La/o0c;->b:La/r0c;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 17
    .line 18
    invoke-virtual {v6}, La/r0c;->H0()La/s1c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, La/s1c;->w()V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    sget-object v1, La/r0c;->S1:La/cl5;

    .line 29
    .line 30
    iget-object v8, v0, La/o0c;->b:La/r0c;

    .line 31
    .line 32
    iget-object v6, v8, La/r0c;->N1:La/wdk0;

    .line 33
    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    new-instance v7, La/xdk0;

    .line 37
    .line 38
    sget-object v10, La/rek0;->b:La/rek0;

    .line 39
    .line 40
    const v0, 0x7f130dca

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x7c

    .line 52
    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    move-object v9, v7

    .line 57
    invoke-direct/range {v9 .. v16}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 58
    .line 59
    .line 60
    const/16 v13, 0x3fc

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    const/4 v11, 0x0

    .line 65
    invoke-static/range {v6 .. v13}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 66
    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_0
    const-string v0, "snackbarManager"

    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v5

    .line 77
    :pswitch_1
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 78
    .line 79
    invoke-virtual {v6}, La/r0c;->H0()La/s1c;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, La/s1c;->w()V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_2
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 90
    .line 91
    iget-object v0, v6, La/r0c;->P1:La/a8z;

    .line 92
    .line 93
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/jci;

    .line 98
    .line 99
    iget-object v0, v0, La/jci;->u:La/n5d0;

    .line 100
    .line 101
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, La/ici;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_3
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 109
    .line 110
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    instance-of v1, v0, La/af3;

    .line 122
    .line 123
    if-eqz v1, :cond_1

    .line 124
    .line 125
    check-cast v0, La/af3;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    move-object v0, v5

    .line 129
    :goto_0
    const-class v1, La/n0c;

    .line 130
    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, La/o5d0;

    .line 142
    .line 143
    if-eqz v0, :cond_2

    .line 144
    .line 145
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/ze3;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    move-object v0, v5

    .line 153
    :goto_1
    instance-of v2, v0, La/n0c;

    .line 154
    .line 155
    if-nez v2, :cond_3

    .line 156
    .line 157
    move-object v0, v5

    .line 158
    :cond_3
    check-cast v0, La/n0c;

    .line 159
    .line 160
    if-eqz v0, :cond_4

    .line 161
    .line 162
    invoke-static {v6}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    iget-object v1, v6, La/r0c;->R1:La/khf0;

    .line 167
    .line 168
    sget-object v2, La/r0c;->U1:[La/iiy;

    .line 169
    .line 170
    const/4 v3, 0x1

    .line 171
    aget-object v2, v2, v3

    .line 172
    .line 173
    invoke-virtual {v1, v6, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    move-object v12, v1

    .line 178
    check-cast v12, Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;

    .line 179
    .line 180
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v13, v0, La/n0c;->a:La/mne;

    .line 184
    .line 185
    iget-object v14, v0, La/n0c;->b:La/ctf0;

    .line 186
    .line 187
    iget-object v15, v0, La/n0c;->c:La/s64;

    .line 188
    .line 189
    iget-object v1, v0, La/n0c;->g:La/lme0;

    .line 190
    .line 191
    iget-object v2, v0, La/n0c;->d:La/zg;

    .line 192
    .line 193
    iget-object v3, v0, La/n0c;->e:La/uuz;

    .line 194
    .line 195
    iget-object v10, v0, La/n0c;->j:La/ii;

    .line 196
    .line 197
    iget-object v4, v0, La/n0c;->f:La/jh70;

    .line 198
    .line 199
    iget-object v5, v0, La/n0c;->h:La/duj;

    .line 200
    .line 201
    iget-object v6, v0, La/n0c;->i:La/pru;

    .line 202
    .line 203
    iget-object v7, v0, La/n0c;->k:La/nr;

    .line 204
    .line 205
    iget-object v8, v0, La/n0c;->l:La/gst0;

    .line 206
    .line 207
    iget-object v9, v0, La/n0c;->m:La/m1e;

    .line 208
    .line 209
    move-object/from16 v16, v1

    .line 210
    .line 211
    iget-object v1, v0, La/n0c;->n:La/wdk0;

    .line 212
    .line 213
    move-object/from16 v25, v1

    .line 214
    .line 215
    iget-object v1, v0, La/n0c;->o:La/q7d0;

    .line 216
    .line 217
    move-object/from16 v17, v1

    .line 218
    .line 219
    iget-object v1, v0, La/n0c;->p:La/vby;

    .line 220
    .line 221
    move-object/from16 v18, v1

    .line 222
    .line 223
    iget-object v1, v0, La/n0c;->q:La/d190;

    .line 224
    .line 225
    move-object/from16 v23, v8

    .line 226
    .line 227
    iget-object v8, v0, La/n0c;->r:La/lef0;

    .line 228
    .line 229
    move-object/from16 v19, v1

    .line 230
    .line 231
    iget-object v1, v0, La/n0c;->s:La/usd;

    .line 232
    .line 233
    move-object/from16 v26, v1

    .line 234
    .line 235
    iget-object v1, v0, La/n0c;->t:La/zn00;

    .line 236
    .line 237
    move-object/from16 v27, v1

    .line 238
    .line 239
    iget-object v1, v0, La/n0c;->u:La/qgd;

    .line 240
    .line 241
    iget-object v0, v0, La/n0c;->v:La/xsu;

    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-object/from16 v22, v7

    .line 268
    .line 269
    new-instance v7, La/jci;

    .line 270
    .line 271
    move-object/from16 v28, v1

    .line 272
    .line 273
    move-object/from16 v17, v2

    .line 274
    .line 275
    move-object/from16 v18, v3

    .line 276
    .line 277
    move-object/from16 v19, v4

    .line 278
    .line 279
    move-object/from16 v20, v5

    .line 280
    .line 281
    move-object/from16 v21, v6

    .line 282
    .line 283
    move-object/from16 v24, v9

    .line 284
    .line 285
    move-object v9, v0

    .line 286
    invoke-direct/range {v7 .. v28}, La/jci;-><init>(La/lef0;La/xsu;La/ii;La/i1w0;Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;La/mne;La/ctf0;La/s64;La/lme0;La/zg;La/uuz;La/jh70;La/duj;La/pru;La/nr;La/gst0;La/m1e;La/wdk0;La/usd;La/zn00;La/qgd;)V

    .line 287
    .line 288
    .line 289
    move-object v5, v7

    .line 290
    goto :goto_2

    .line 291
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 292
    .line 293
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    :goto_2
    return-object v5

    .line 301
    :pswitch_4
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 302
    .line 303
    invoke-virtual {v6}, La/r0c;->H0()La/s1c;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    iget-object v0, v9, La/s1c;->x:La/p7m0;

    .line 308
    .line 309
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    check-cast v0, La/f1c;

    .line 314
    .line 315
    iget-boolean v0, v0, La/f1c;->d:Z

    .line 316
    .line 317
    if-nez v0, :cond_5

    .line 318
    .line 319
    iget-object v0, v9, La/s1c;->v:La/ol60;

    .line 320
    .line 321
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_5
    iget-object v0, v9, La/s1c;->k:La/nr;

    .line 326
    .line 327
    iget-object v0, v0, La/nr;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, La/kt2;

    .line 330
    .line 331
    const-string v1, "reg_approve_code_sent_again"

    .line 332
    .line 333
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v0, v9, La/s1c;->e:La/s64;

    .line 337
    .line 338
    sget-object v1, La/dl;->a:[La/dl;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget-object v0, v0, La/s64;->a:La/s1p;

    .line 344
    .line 345
    new-instance v1, La/j1p;

    .line 346
    .line 347
    invoke-direct {v1, v2, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 348
    .line 349
    .line 350
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    const-wide/16 v2, 0xbd5

    .line 355
    .line 356
    invoke-virtual {v0, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 357
    .line 358
    .line 359
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    iget-object v1, v9, La/s1c;->d:La/mne;

    .line 364
    .line 365
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 366
    .line 367
    new-instance v7, La/zhb;

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    const/16 v14, 0xe

    .line 371
    .line 372
    const/4 v8, 0x1

    .line 373
    const-class v10, La/s1c;

    .line 374
    .line 375
    const-string v11, "handleError"

    .line 376
    .line 377
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 378
    .line 379
    invoke-direct/range {v7 .. v14}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 380
    .line 381
    .line 382
    new-instance v2, La/n1c;

    .line 383
    .line 384
    invoke-direct {v2, v9, v5}, La/n1c;-><init>(La/s1c;La/yje;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v9, v0, v1, v7, v2}, La/s1c;->B(La/bvc;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 388
    .line 389
    .line 390
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_5
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 394
    .line 395
    invoke-virtual {v6}, La/r0c;->H0()La/s1c;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    iget-object v0, v9, La/s1c;->x:La/p7m0;

    .line 400
    .line 401
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, La/f1c;

    .line 406
    .line 407
    iget-boolean v0, v0, La/f1c;->d:Z

    .line 408
    .line 409
    if-nez v0, :cond_6

    .line 410
    .line 411
    iget-object v0, v9, La/s1c;->v:La/ol60;

    .line 412
    .line 413
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_6
    iget-object v0, v9, La/s1c;->e:La/s64;

    .line 418
    .line 419
    sget-object v1, La/dl;->a:[La/dl;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object v0, v0, La/s64;->a:La/s1p;

    .line 425
    .line 426
    new-instance v1, La/j1p;

    .line 427
    .line 428
    invoke-direct {v1, v2, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 429
    .line 430
    .line 431
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    const-wide/16 v2, 0xbd4

    .line 436
    .line 437
    invoke-virtual {v0, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 438
    .line 439
    .line 440
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    iget-object v1, v9, La/s1c;->d:La/mne;

    .line 445
    .line 446
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 447
    .line 448
    new-instance v7, La/zhb;

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const/16 v14, 0xd

    .line 452
    .line 453
    const/4 v8, 0x1

    .line 454
    const-class v10, La/s1c;

    .line 455
    .line 456
    const-string v11, "onCheckCodeError"

    .line 457
    .line 458
    const-string v12, "onCheckCodeError(Ljava/lang/Throwable;)V"

    .line 459
    .line 460
    invoke-direct/range {v7 .. v14}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 461
    .line 462
    .line 463
    new-instance v2, La/m1c;

    .line 464
    .line 465
    invoke-direct {v2, v9, v5}, La/m1c;-><init>(La/s1c;La/yje;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v9, v0, v1, v7, v2}, La/s1c;->B(La/bvc;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 469
    .line 470
    .line 471
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_6
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 475
    .line 476
    invoke-virtual {v6}, La/r0c;->I0()V

    .line 477
    .line 478
    .line 479
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    return-object v0

    .line 482
    :pswitch_7
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 483
    .line 484
    invoke-virtual {v6}, La/r0c;->H0()La/s1c;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    iget-object v1, v0, La/s1c;->c:La/i1w0;

    .line 489
    .line 490
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    iget-object v0, v0, La/s1c;->s:La/usd;

    .line 495
    .line 496
    invoke-virtual {v0}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 501
    .line 502
    if-eqz v3, :cond_7

    .line 503
    .line 504
    new-instance v3, La/e1w0;

    .line 505
    .line 506
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 507
    .line 508
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 509
    .line 510
    .line 511
    new-instance v0, La/c8d;

    .line 512
    .line 513
    sget-object v5, La/y7d;->a:La/v7d;

    .line 514
    .line 515
    invoke-direct {v0, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    goto :goto_5

    .line 522
    :cond_7
    new-instance v3, La/w0w0;

    .line 523
    .line 524
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 525
    .line 526
    .line 527
    new-instance v0, La/c8d;

    .line 528
    .line 529
    sget-object v5, La/y7d;->a:La/v7d;

    .line 530
    .line 531
    invoke-direct {v0, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    :goto_5
    invoke-static {v1, v2, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    :goto_6
    move-object v2, v0

    .line 542
    check-cast v2, La/paw;

    .line 543
    .line 544
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-eqz v3, :cond_8

    .line 549
    .line 550
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    check-cast v2, La/oe50;

    .line 555
    .line 556
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 557
    .line 558
    .line 559
    goto :goto_6

    .line 560
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    return-object v0

    .line 563
    :pswitch_8
    sget-object v0, La/r0c;->S1:La/cl5;

    .line 564
    .line 565
    invoke-virtual {v6}, La/r0c;->I0()V

    .line 566
    .line 567
    .line 568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
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
