.class public final synthetic La/a540;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/a540;->a:B

    iput-object p3, p0, La/a540;->c:Ljava/lang/Object;

    iput-object p2, p0, La/a540;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/a540;->a:B

    iput-object p1, p0, La/a540;->b:Ljava/lang/Object;

    iput-object p2, p0, La/a540;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a540;->a:B

    .line 4
    .line 5
    sget-object v2, La/jp60;->a:La/jp60;

    .line 6
    .line 7
    sget-object v3, La/qp60;->a:La/qp60;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, ""

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, v0, La/a540;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, La/a540;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 21
    .line 22
    check-cast v7, La/qd80;

    .line 23
    .line 24
    iget v1, v7, La/qd80;->a:I

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, v7, La/qd80;->c:La/md80;

    .line 31
    .line 32
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 39
    .line 40
    check-cast v7, La/pd80;

    .line 41
    .line 42
    iget v1, v7, La/pd80;->a:I

    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, v7, La/pd80;->c:La/iqr0;

    .line 49
    .line 50
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    check-cast v0, La/z880;

    .line 57
    .line 58
    check-cast v7, La/m2r;

    .line 59
    .line 60
    sget-object v1, La/z880;->U1:La/xi70;

    .line 61
    .line 62
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v7, La/m2r;->e:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 66
    .line 67
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->clearFocus()V

    .line 68
    .line 69
    .line 70
    iget-object v1, v7, La/m2r;->h:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    iget-object v0, v9, La/aa80;->t:La/chf0;

    .line 80
    .line 81
    iget-object v1, v9, La/aa80;->z:La/p7m0;

    .line 82
    .line 83
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/d980;

    .line 88
    .line 89
    iget-object v2, v2, La/d980;->d:La/a980;

    .line 90
    .line 91
    if-eqz v2, :cond_0

    .line 92
    .line 93
    iget-object v2, v2, La/a980;->c:Ljava/lang/String;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    move-object v2, v6

    .line 97
    :goto_0
    if-nez v2, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    move-object v5, v2

    .line 101
    :goto_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/d980;

    .line 106
    .line 107
    iget-object v1, v1, La/d980;->b:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v5, v1}, La/chf0;->V(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v7, La/gk70;

    .line 117
    .line 118
    const/4 v13, 0x0

    .line 119
    const/16 v14, 0x1c

    .line 120
    .line 121
    const/4 v8, 0x1

    .line 122
    const-class v10, La/aa80;

    .line 123
    .line 124
    const-string v11, "handleException"

    .line 125
    .line 126
    const-string v12, "handleException(Ljava/lang/Throwable;)V"

    .line 127
    .line 128
    invoke-direct/range {v7 .. v14}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 129
    .line 130
    .line 131
    iget-object v1, v9, La/aa80;->g:La/mne;

    .line 132
    .line 133
    iget-object v13, v1, La/mne;->a:La/rwj;

    .line 134
    .line 135
    new-instance v14, La/mt00;

    .line 136
    .line 137
    const/16 v1, 0x1a

    .line 138
    .line 139
    invoke-direct {v14, v9, v6, v1}, La/mt00;-><init>(La/diu0;La/yje;B)V

    .line 140
    .line 141
    .line 142
    const/16 v15, 0xa

    .line 143
    .line 144
    const/4 v12, 0x0

    .line 145
    move-object v10, v0

    .line 146
    move-object v11, v7

    .line 147
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 148
    .line 149
    .line 150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_2
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 154
    .line 155
    check-cast v0, La/e180;

    .line 156
    .line 157
    iget v0, v0, La/e180;->a:I

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_3
    check-cast v0, La/dd50;

    .line 170
    .line 171
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 172
    .line 173
    iget-boolean v0, v0, La/dd50;->c:Z

    .line 174
    .line 175
    if-eqz v0, :cond_2

    .line 176
    .line 177
    invoke-interface {v7, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_2
    invoke-interface {v7, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_4
    check-cast v0, La/k570;

    .line 188
    .line 189
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 190
    .line 191
    invoke-interface {v0}, La/k570;->a()La/dd50;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-boolean v0, v0, La/dd50;->c:Z

    .line 196
    .line 197
    if-eqz v0, :cond_3

    .line 198
    .line 199
    invoke-interface {v7, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_3
    invoke-interface {v7, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_5
    check-cast v0, La/r170;

    .line 210
    .line 211
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 212
    .line 213
    iget-boolean v0, v0, La/r170;->c:Z

    .line 214
    .line 215
    if-nez v0, :cond_4

    .line 216
    .line 217
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_6
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 224
    .line 225
    check-cast v0, Landroid/content/Context;

    .line 226
    .line 227
    new-instance v1, La/rw60;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-direct {v1, v0}, La/rw60;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_7
    check-cast v0, La/dmt;

    .line 247
    .line 248
    check-cast v7, La/iqt;

    .line 249
    .line 250
    new-instance v8, La/ru60;

    .line 251
    .line 252
    new-instance v9, La/ewa;

    .line 253
    .line 254
    invoke-direct {v9, v5, v5, v5}, La/ewa;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, La/dmt;->b()La/kg;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    iget-object v0, v7, La/iqt;->a:La/gst0;

    .line 262
    .line 263
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    sget-object v16, La/lun;->a:La/lun;

    .line 268
    .line 269
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    sget-object v19, La/iun;->a:La/iun;

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    const-wide/16 v22, 0x0

    .line 277
    .line 278
    const/4 v12, 0x1

    .line 279
    const/4 v13, 0x1

    .line 280
    const-wide/16 v14, 0x0

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const/16 v20, 0x0

    .line 287
    .line 288
    invoke-direct/range {v8 .. v23}, La/ru60;-><init>(La/ewa;La/kg;ZZZJLjava/util/Map;La/qwa;La/mza;Ljava/util/List;La/dza;Ljava/lang/Throwable;J)V

    .line 289
    .line 290
    .line 291
    return-object v8

    .line 292
    :pswitch_8
    check-cast v0, La/cxa;

    .line 293
    .line 294
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 295
    .line 296
    iget-object v0, v0, La/cxa;->a:La/cza;

    .line 297
    .line 298
    invoke-static {v0, v6, v7}, La/jiq0;->s0(La/cza;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 299
    .line 300
    .line 301
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_9
    check-cast v0, Landroid/view/Window;

    .line 305
    .line 306
    check-cast v7, La/cjv0;

    .line 307
    .line 308
    new-instance v1, La/k9o0;

    .line 309
    .line 310
    if-eqz v0, :cond_5

    .line 311
    .line 312
    invoke-virtual {v0}, Landroid/view/Window;->getStatusBarColor()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    goto :goto_4

    .line 321
    :cond_5
    move-object v2, v6

    .line 322
    :goto_4
    if-eqz v0, :cond_6

    .line 323
    .line 324
    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    goto :goto_5

    .line 333
    :cond_6
    move-object v0, v6

    .line 334
    :goto_5
    if-eqz v7, :cond_7

    .line 335
    .line 336
    iget-object v3, v7, La/cjv0;->a:La/ycm0;

    .line 337
    .line 338
    invoke-virtual {v3}, La/ycm0;->u()Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    goto :goto_6

    .line 347
    :cond_7
    move-object v3, v6

    .line 348
    :goto_6
    if-eqz v7, :cond_8

    .line 349
    .line 350
    iget-object v4, v7, La/cjv0;->a:La/ycm0;

    .line 351
    .line 352
    invoke-virtual {v4}, La/ycm0;->t()Z

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    :cond_8
    invoke-direct {v1, v2, v0, v3, v6}, La/k9o0;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 361
    .line 362
    .line 363
    return-object v1

    .line 364
    :pswitch_a
    check-cast v0, La/i3t0;

    .line 365
    .line 366
    check-cast v7, La/ak60;

    .line 367
    .line 368
    new-instance v1, La/uh60;

    .line 369
    .line 370
    iget-object v2, v7, La/ak60;->f:La/av9;

    .line 371
    .line 372
    invoke-direct {v1, v2}, La/uh60;-><init>(La/av9;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_b
    check-cast v0, La/f7u;

    .line 382
    .line 383
    check-cast v7, La/lbu;

    .line 384
    .line 385
    new-instance v1, La/gj60;

    .line 386
    .line 387
    invoke-virtual {v7}, La/lbu;->j()Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    invoke-virtual {v0, v2}, La/f7u;->x(Z)Ljava/util/ArrayList;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-direct {v1, v0}, La/gj60;-><init>(Ljava/util/ArrayList;)V

    .line 396
    .line 397
    .line 398
    return-object v1

    .line 399
    :pswitch_c
    check-cast v0, La/ctf0;

    .line 400
    .line 401
    check-cast v7, La/wyu;

    .line 402
    .line 403
    new-instance v8, La/ui60;

    .line 404
    .line 405
    sget-object v1, La/iun;->a:La/iun;

    .line 406
    .line 407
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 412
    .line 413
    .line 414
    move-result-object v10

    .line 415
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    new-array v1, v4, [Ljava/lang/Object;

    .line 420
    .line 421
    iget-object v2, v0, La/ctf0;->b:La/lsm0;

    .line 422
    .line 423
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    const v3, 0x7f130dfb

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v14

    .line 434
    new-array v1, v4, [Ljava/lang/Object;

    .line 435
    .line 436
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 437
    .line 438
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const v2, 0x7f1312e2

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v15

    .line 449
    new-array v1, v4, [Ljava/lang/Object;

    .line 450
    .line 451
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v16

    .line 459
    invoke-virtual {v7}, La/wyu;->a()La/uaq0;

    .line 460
    .line 461
    .line 462
    move-result-object v17

    .line 463
    const/4 v12, 0x0

    .line 464
    const/4 v13, 0x0

    .line 465
    invoke-direct/range {v8 .. v17}, La/ui60;-><init>(La/a4x;La/a4x;La/a4x;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/uaq0;)V

    .line 466
    .line 467
    .line 468
    return-object v8

    .line 469
    :pswitch_d
    check-cast v0, La/ki60;

    .line 470
    .line 471
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 472
    .line 473
    iput-object v7, v0, La/ki60;->p2:Lkotlin/jvm/functions/Function0;

    .line 474
    .line 475
    invoke-virtual {v0}, La/ki60;->P0()La/k3t0;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sget-object v1, La/yh60;->a:La/yh60;

    .line 480
    .line 481
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_e
    check-cast v0, La/ki60;

    .line 488
    .line 489
    check-cast v7, La/xk80;

    .line 490
    .line 491
    sget-object v1, La/ki60;->q2:La/htz;

    .line 492
    .line 493
    invoke-virtual {v0}, La/ki60;->P0()La/k3t0;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    new-instance v2, La/ci60;

    .line 498
    .line 499
    iget-object v3, v0, La/ki60;->n2:La/zz2;

    .line 500
    .line 501
    sget-object v4, La/ki60;->r2:[La/iiy;

    .line 502
    .line 503
    const/4 v5, 0x1

    .line 504
    aget-object v5, v4, v5

    .line 505
    .line 506
    invoke-virtual {v3, v0, v5}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    invoke-virtual {v7}, La/xk80;->k()I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    invoke-virtual {v7}, La/xk80;->n()I

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    iget-object v7, v0, La/ki60;->o2:La/phf0;

    .line 523
    .line 524
    const/4 v8, 0x2

    .line 525
    aget-object v4, v4, v8

    .line 526
    .line 527
    invoke-virtual {v7, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-direct {v2, v3, v5, v6, v0}, La/ci60;-><init>(IIILjava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 538
    .line 539
    return-object v0

    .line 540
    :pswitch_f
    check-cast v0, Ljava/lang/String;

    .line 541
    .line 542
    check-cast v7, La/g0o;

    .line 543
    .line 544
    sget-object v1, La/aum0;->e:La/aum0;

    .line 545
    .line 546
    new-array v2, v4, [La/ugi0;

    .line 547
    .line 548
    new-instance v3, La/b530;

    .line 549
    .line 550
    const/16 v4, 0x1d

    .line 551
    .line 552
    invoke-direct {v3, v7, v4}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 553
    .line 554
    .line 555
    invoke-static {v0, v1, v2, v3}, La/x2x;->G(Ljava/lang/String;La/c3x;[La/ugi0;Lkotlin/jvm/functions/Function1;)La/wgi0;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    return-object v0

    .line 560
    :pswitch_10
    check-cast v0, La/y3v;

    .line 561
    .line 562
    check-cast v7, La/age0;

    .line 563
    .line 564
    iget-object v0, v0, La/y3v;->b:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, La/a14;

    .line 567
    .line 568
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    if-eqz v0, :cond_9

    .line 573
    .line 574
    goto :goto_7

    .line 575
    :cond_9
    invoke-virtual {v7}, La/age0;->invoke()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 582
    .line 583
    check-cast v0, La/dw50;

    .line 584
    .line 585
    check-cast v0, La/aw50;

    .line 586
    .line 587
    iget-object v0, v0, La/aw50;->h:La/rv50;

    .line 588
    .line 589
    iget-object v0, v0, La/rv50;->c:La/mv50;

    .line 590
    .line 591
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_12
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 598
    .line 599
    check-cast v0, La/xo5;

    .line 600
    .line 601
    iget v0, v0, La/xo5;->a:I

    .line 602
    .line 603
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object v0

    .line 613
    :pswitch_13
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 614
    .line 615
    check-cast v0, La/vo5;

    .line 616
    .line 617
    iget v0, v0, La/vo5;->a:I

    .line 618
    .line 619
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 627
    .line 628
    return-object v0

    .line 629
    :pswitch_14
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 630
    .line 631
    check-cast v0, La/yo5;

    .line 632
    .line 633
    iget v0, v0, La/yo5;->a:I

    .line 634
    .line 635
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_15
    check-cast v0, La/h2h0;

    .line 646
    .line 647
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 648
    .line 649
    iget-object v1, v0, La/h2h0;->a:Ljava/util/ArrayList;

    .line 650
    .line 651
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    iget-object v0, v0, La/h2h0;->c:La/y1h0;

    .line 656
    .line 657
    invoke-interface {v0}, La/y1h0;->a()Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    sub-int/2addr v1, v0

    .line 666
    :goto_8
    if-ge v4, v1, :cond_a

    .line 667
    .line 668
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    add-int/lit8 v4, v4, 0x1

    .line 672
    .line 673
    goto :goto_8

    .line 674
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 675
    .line 676
    return-object v0

    .line 677
    :pswitch_16
    check-cast v0, La/p850;

    .line 678
    .line 679
    check-cast v7, La/myr0;

    .line 680
    .line 681
    iget-object v0, v0, La/p850;->W:La/s91;

    .line 682
    .line 683
    new-instance v8, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 684
    .line 685
    new-instance v1, La/qm1;

    .line 686
    .line 687
    iget-wide v2, v7, La/myr0;->a:J

    .line 688
    .line 689
    sget-object v4, La/s9s0;->a:La/s9s0;

    .line 690
    .line 691
    iget-object v5, v7, La/myr0;->f:La/hyr0;

    .line 692
    .line 693
    iget-object v5, v5, La/hyr0;->a:Ljava/lang/String;

    .line 694
    .line 695
    const/4 v6, 0x0

    .line 696
    invoke-direct/range {v1 .. v6}, La/qm1;-><init>(JLa/s9s0;Ljava/lang/String;Z)V

    .line 697
    .line 698
    .line 699
    const/16 v20, 0x0

    .line 700
    .line 701
    const/16 v21, 0x1f7

    .line 702
    .line 703
    const/4 v9, 0x0

    .line 704
    const/4 v10, 0x0

    .line 705
    const-wide/16 v11, 0x0

    .line 706
    .line 707
    const/4 v14, 0x0

    .line 708
    const-wide/16 v15, 0x0

    .line 709
    .line 710
    const-wide/16 v17, 0x0

    .line 711
    .line 712
    const/16 v19, 0x0

    .line 713
    .line 714
    move-object v13, v1

    .line 715
    invoke-direct/range {v8 .. v21}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0, v8}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 719
    .line 720
    .line 721
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    return-object v0

    .line 724
    :pswitch_17
    check-cast v0, La/d650;

    .line 725
    .line 726
    check-cast v7, La/myr0;

    .line 727
    .line 728
    iget-object v0, v0, La/d650;->H:La/s91;

    .line 729
    .line 730
    new-instance v8, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 731
    .line 732
    new-instance v1, La/qm1;

    .line 733
    .line 734
    iget-wide v2, v7, La/myr0;->a:J

    .line 735
    .line 736
    sget-object v4, La/s9s0;->a:La/s9s0;

    .line 737
    .line 738
    iget-object v5, v7, La/myr0;->f:La/hyr0;

    .line 739
    .line 740
    iget-object v5, v5, La/hyr0;->a:Ljava/lang/String;

    .line 741
    .line 742
    const/4 v6, 0x0

    .line 743
    invoke-direct/range {v1 .. v6}, La/qm1;-><init>(JLa/s9s0;Ljava/lang/String;Z)V

    .line 744
    .line 745
    .line 746
    const/16 v20, 0x0

    .line 747
    .line 748
    const/16 v21, 0x1f7

    .line 749
    .line 750
    const/4 v9, 0x0

    .line 751
    const/4 v10, 0x0

    .line 752
    const-wide/16 v11, 0x0

    .line 753
    .line 754
    const/4 v14, 0x0

    .line 755
    const-wide/16 v15, 0x0

    .line 756
    .line 757
    const-wide/16 v17, 0x0

    .line 758
    .line 759
    const/16 v19, 0x0

    .line 760
    .line 761
    move-object v13, v1

    .line 762
    invoke-direct/range {v8 .. v21}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0, v8}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 766
    .line 767
    .line 768
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 769
    .line 770
    return-object v0

    .line 771
    :pswitch_18
    check-cast v0, La/w6n;

    .line 772
    .line 773
    check-cast v7, La/d280;

    .line 774
    .line 775
    new-instance v1, La/u6n;

    .line 776
    .line 777
    sget-object v2, La/d4d;->R1:La/d4d;

    .line 778
    .line 779
    invoke-direct {v1, v2, v0, v7}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 780
    .line 781
    .line 782
    return-object v1

    .line 783
    :pswitch_19
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 784
    .line 785
    check-cast v0, La/br40;

    .line 786
    .line 787
    new-instance v1, La/wqk0;

    .line 788
    .line 789
    iget-object v0, v0, La/br40;->c:La/ar40;

    .line 790
    .line 791
    invoke-direct {v1, v0}, La/wqk0;-><init>(La/ar40;)V

    .line 792
    .line 793
    .line 794
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 798
    .line 799
    return-object v0

    .line 800
    :pswitch_1a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 801
    .line 802
    check-cast v0, La/qa40;

    .line 803
    .line 804
    iget-wide v0, v0, La/qa40;->a:J

    .line 805
    .line 806
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 814
    .line 815
    return-object v0

    .line 816
    :pswitch_1b
    move-object v1, v0

    .line 817
    check-cast v1, La/m940;

    .line 818
    .line 819
    move-object v2, v7

    .line 820
    check-cast v2, Ljava/lang/String;

    .line 821
    .line 822
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 823
    .line 824
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 825
    .line 826
    :cond_b
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    iget-object v4, v1, La/i3t0;->f:La/oyg0;

    .line 834
    .line 835
    move-object v5, v0

    .line 836
    check-cast v5, La/n940;

    .line 837
    .line 838
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    iget-object v4, v5, La/n940;->c:Ljava/util/Set;

    .line 842
    .line 843
    invoke-static {v4, v2}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 844
    .line 845
    .line 846
    move-result-object v8

    .line 847
    const/4 v9, 0x0

    .line 848
    const/16 v10, 0xb

    .line 849
    .line 850
    const/4 v6, 0x0

    .line 851
    const/4 v7, 0x0

    .line 852
    invoke-static/range {v5 .. v10}, La/n940;->a(La/n940;La/d940;ZLjava/util/LinkedHashSet;Ljava/util/List;I)La/n940;

    .line 853
    .line 854
    .line 855
    move-result-object v4

    .line 856
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    if-eqz v0, :cond_b

    .line 861
    .line 862
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 863
    .line 864
    return-object v0

    .line 865
    :pswitch_1c
    check-cast v0, La/i740;

    .line 866
    .line 867
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 868
    .line 869
    iget-object v0, v0, La/i740;->h:La/t440;

    .line 870
    .line 871
    instance-of v1, v0, La/c440;

    .line 872
    .line 873
    if-eqz v1, :cond_c

    .line 874
    .line 875
    check-cast v0, La/c440;

    .line 876
    .line 877
    goto :goto_9

    .line 878
    :cond_c
    move-object v0, v6

    .line 879
    :goto_9
    if-eqz v0, :cond_d

    .line 880
    .line 881
    iget-object v6, v0, La/c440;->a:Ljava/lang/String;

    .line 882
    .line 883
    :cond_d
    if-nez v6, :cond_e

    .line 884
    .line 885
    goto :goto_a

    .line 886
    :cond_e
    move-object v5, v6

    .line 887
    :goto_a
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-lez v0, :cond_f

    .line 892
    .line 893
    invoke-interface {v7, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 897
    .line 898
    return-object v0

    .line 899
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
