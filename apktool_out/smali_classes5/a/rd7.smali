.class public final synthetic La/rd7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rd7;->a:B

    iput-object p1, p0, La/rd7;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/rd7;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/rd7;->a:B

    iput-boolean p1, p0, La/rd7;->b:Z

    iput-object p2, p0, La/rd7;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rd7;->a:B

    .line 4
    .line 5
    const-string v2, "package"

    .line 6
    .line 7
    const-string v3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 8
    .line 9
    const/16 v4, 0x22b

    .line 10
    .line 11
    const/high16 v5, 0x3f000000    # 0.5f

    .line 12
    .line 13
    const/high16 v6, 0x3f800000    # 1.0f

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    iget-boolean v10, v0, La/rd7;->b:Z

    .line 19
    .line 20
    iget-object v0, v0, La/rd7;->c:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/ywv0;

    .line 26
    .line 27
    iget-object v0, v0, La/ywv0;->e:La/muv0;

    .line 28
    .line 29
    iput-boolean v10, v0, La/muv0;->g:Z

    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    check-cast v0, La/oyq0;

    .line 35
    .line 36
    if-eqz v10, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, La/oyq0;->a()F

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    :goto_0
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :pswitch_1
    check-cast v0, La/e2d;

    .line 49
    .line 50
    if-nez v10, :cond_1

    .line 51
    .line 52
    iget-object v0, v0, La/e2d;->a:La/oyq0;

    .line 53
    .line 54
    invoke-virtual {v0}, La/oyq0;->a()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    cmpl-float v0, v0, v5

    .line 59
    .line 60
    if-ltz v0, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v8, v9

    .line 64
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_2
    check-cast v0, La/xpl0;

    .line 70
    .line 71
    if-eqz v10, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/hpl0;

    .line 78
    .line 79
    iget-object v0, v0, La/hpl0;->f:La/dnf0;

    .line 80
    .line 81
    instance-of v1, v0, La/zmf0;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    move-object v7, v0

    .line 86
    check-cast v7, La/zmf0;

    .line 87
    .line 88
    :cond_2
    if-eqz v7, :cond_3

    .line 89
    .line 90
    iget-object v0, v7, La/zmf0;->a:La/a4x;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    xor-int/2addr v0, v8

    .line 99
    if-ne v0, v8, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move v8, v9

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/hpl0;

    .line 109
    .line 110
    iget-object v0, v0, La/hpl0;->f:La/dnf0;

    .line 111
    .line 112
    instance-of v8, v0, La/zmf0;

    .line 113
    .line 114
    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :pswitch_3
    check-cast v0, La/oyj0;

    .line 120
    .line 121
    sget-object v1, La/oyj0;->U1:La/gle0;

    .line 122
    .line 123
    const-string v1, "toto"

    .line 124
    .line 125
    if-eqz v10, :cond_6

    .line 126
    .line 127
    invoke-virtual {v0}, La/oyj0;->H0()La/wyj0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v3, v2, La/wyj0;->x:La/ih5;

    .line 132
    .line 133
    invoke-virtual {v3, v1}, La/ih5;->c(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v2, v2, La/wyj0;->y:La/gg5;

    .line 137
    .line 138
    invoke-virtual {v2, v1}, La/gg5;->i(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, La/oyj0;->G0()La/u4r;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iget-object v1, v1, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 146
    .line 147
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 148
    .line 149
    .line 150
    iget-object v8, v0, La/oyj0;->P1:La/ynb;

    .line 151
    .line 152
    if-eqz v8, :cond_5

    .line 153
    .line 154
    sget-object v9, La/bm5;->l:La/bm5;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const-string v13, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 164
    .line 165
    const/16 v14, 0x1ce

    .line 166
    .line 167
    const/4 v10, 0x0

    .line 168
    const/4 v12, 0x0

    .line 169
    invoke-static/range {v8 .. v14}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    const-string v0, "changeBalanceDialogProvider"

    .line 174
    .line 175
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v7

    .line 179
    :cond_6
    invoke-virtual {v0}, La/oyj0;->H0()La/wyj0;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v2, v0, La/wyj0;->z:La/ih5;

    .line 184
    .line 185
    sget-object v3, La/k7k;->h1:La/k7k;

    .line 186
    .line 187
    invoke-virtual {v2, v3}, La/ih5;->f(La/k7k;)V

    .line 188
    .line 189
    .line 190
    iget-object v2, v0, La/wyj0;->A:La/l7k;

    .line 191
    .line 192
    sget-object v3, La/y1p;->b:La/y1p;

    .line 193
    .line 194
    iget-object v3, v0, La/wyj0;->B:La/cmt;

    .line 195
    .line 196
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v2, v1, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    new-instance v11, La/pyj0;

    .line 208
    .line 209
    invoke-direct {v11, v0, v9}, La/pyj0;-><init>(La/wyj0;B)V

    .line 210
    .line 211
    .line 212
    new-instance v14, La/myj0;

    .line 213
    .line 214
    invoke-direct {v14, v0, v7}, La/myj0;-><init>(La/wyj0;La/yje;)V

    .line 215
    .line 216
    .line 217
    const/16 v15, 0xe

    .line 218
    .line 219
    const/4 v12, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 222
    .line 223
    .line 224
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_4
    check-cast v0, La/w5j0;

    .line 228
    .line 229
    new-instance v1, La/x2j0;

    .line 230
    .line 231
    invoke-direct {v1, v10}, La/x2j0;-><init>(Z)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v1}, La/w5j0;->J(La/a3j0;)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v0, La/w5j0;->l:La/dzu;

    .line 238
    .line 239
    iget-object v0, v0, La/dzu;->a:La/pv00;

    .line 240
    .line 241
    iget-object v0, v0, La/pv00;->a:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, La/ywu;

    .line 244
    .line 245
    iget-object v0, v0, La/ywu;->c:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v0, La/vwb0;

    .line 248
    .line 249
    const-string v1, "PREF_IS_QUICK_BETS_ENABLED"

    .line 250
    .line 251
    invoke-virtual {v0, v1, v10}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    invoke-static {}, La/dyb;->u0()V

    .line 255
    .line 256
    .line 257
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_5
    check-cast v0, La/k4g0;

    .line 261
    .line 262
    if-eqz v10, :cond_9

    .line 263
    .line 264
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, La/y3g0;

    .line 269
    .line 270
    iget-object v0, v0, La/y3g0;->d:La/enf0;

    .line 271
    .line 272
    instance-of v1, v0, La/anf0;

    .line 273
    .line 274
    if-eqz v1, :cond_7

    .line 275
    .line 276
    move-object v7, v0

    .line 277
    check-cast v7, La/anf0;

    .line 278
    .line 279
    :cond_7
    if-eqz v7, :cond_8

    .line 280
    .line 281
    iget-object v0, v7, La/anf0;->a:Ljava/util/List;

    .line 282
    .line 283
    if-eqz v0, :cond_8

    .line 284
    .line 285
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    xor-int/2addr v0, v8

    .line 290
    if-ne v0, v8, :cond_8

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_8
    move v8, v9

    .line 294
    goto :goto_4

    .line 295
    :cond_9
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, La/y3g0;

    .line 300
    .line 301
    iget-object v0, v0, La/y3g0;->d:La/enf0;

    .line 302
    .line 303
    instance-of v8, v0, La/anf0;

    .line 304
    .line 305
    :goto_4
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    return-object v0

    .line 310
    :pswitch_6
    check-cast v0, La/xcz;

    .line 311
    .line 312
    iget-object v1, v0, La/xcz;->j:La/ywj;

    .line 313
    .line 314
    invoke-virtual {v1}, La/ywj;->a()Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-nez v1, :cond_c

    .line 319
    .line 320
    if-eqz v10, :cond_a

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_a
    invoke-virtual {v0}, La/xcz;->d()Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    if-nez v1, :cond_c

    .line 328
    .line 329
    invoke-virtual {v0}, La/xcz;->c()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_b

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_b
    move v8, v9

    .line 337
    :cond_c
    :goto_5
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    return-object v0

    .line 342
    :pswitch_7
    check-cast v0, La/hde0;

    .line 343
    .line 344
    iget-object v1, v0, La/hde0;->j:La/p7m0;

    .line 345
    .line 346
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v10}, La/hde0;->w(Z)V

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_8
    check-cast v0, La/g9b0;

    .line 361
    .line 362
    invoke-virtual {v0, v10}, La/g9b0;->G(Z)V

    .line 363
    .line 364
    .line 365
    sget-object v1, La/s8b0;->a:La/s8b0;

    .line 366
    .line 367
    invoke-virtual {v0, v1}, La/g9b0;->A(La/s8b0;)V

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_9
    check-cast v0, La/o890;

    .line 374
    .line 375
    sget-object v1, La/o890;->f2:La/jh70;

    .line 376
    .line 377
    if-eqz v10, :cond_d

    .line 378
    .line 379
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v3}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-static {v2, v3, v7}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v1, v4}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_d
    invoke-virtual {v0}, La/o890;->G0()V

    .line 403
    .line 404
    .line 405
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_a
    check-cast v0, La/r790;

    .line 409
    .line 410
    sget-object v1, La/r790;->Z1:La/xi70;

    .line 411
    .line 412
    if-eqz v10, :cond_e

    .line 413
    .line 414
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-static {v3}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-static {v2, v3, v7}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v1, v4}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 434
    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_e
    iget-object v1, v0, La/r790;->P1:La/a8z;

    .line 438
    .line 439
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    check-cast v1, La/qog0;

    .line 444
    .line 445
    if-eqz v1, :cond_f

    .line 446
    .line 447
    new-instance v2, La/lz9;

    .line 448
    .line 449
    const/4 v3, 0x4

    .line 450
    invoke-direct {v2, v1, v0, v3}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 451
    .line 452
    .line 453
    iget-object v0, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 454
    .line 455
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1}, La/qog0;->a()V

    .line 459
    .line 460
    .line 461
    :cond_f
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_b
    move-object v13, v0

    .line 465
    check-cast v13, La/p850;

    .line 466
    .line 467
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    iget-object v1, v13, La/p850;->p:La/mne;

    .line 472
    .line 473
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 474
    .line 475
    new-instance v1, La/r750;

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/16 v18, 0x2

    .line 480
    .line 481
    const/4 v12, 0x1

    .line 482
    const-class v14, La/p850;

    .line 483
    .line 484
    const-string v15, "handleError"

    .line 485
    .line 486
    const-string v16, "handleError(Ljava/lang/Throwable;)V"

    .line 487
    .line 488
    move-object v11, v1

    .line 489
    invoke-direct/range {v11 .. v18}, La/r750;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 490
    .line 491
    .line 492
    new-instance v4, La/l850;

    .line 493
    .line 494
    invoke-direct {v4, v13, v10, v7, v9}, La/l850;-><init>(La/p850;ZLa/yje;B)V

    .line 495
    .line 496
    .line 497
    const/16 v5, 0xa

    .line 498
    .line 499
    const/4 v2, 0x0

    .line 500
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 501
    .line 502
    .line 503
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    return-object v0

    .line 506
    :pswitch_c
    move-object v13, v0

    .line 507
    check-cast v13, La/d650;

    .line 508
    .line 509
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iget-object v1, v13, La/d650;->L:La/mne;

    .line 514
    .line 515
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 516
    .line 517
    new-instance v1, La/f340;

    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    const/16 v18, 0x15

    .line 522
    .line 523
    const/4 v12, 0x1

    .line 524
    const-class v14, La/d650;

    .line 525
    .line 526
    const-string v15, "handleError"

    .line 527
    .line 528
    const-string v16, "handleError(Ljava/lang/Throwable;)V"

    .line 529
    .line 530
    move-object v11, v1

    .line 531
    invoke-direct/range {v11 .. v18}, La/f340;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 532
    .line 533
    .line 534
    new-instance v4, La/x550;

    .line 535
    .line 536
    invoke-direct {v4, v13, v10, v7, v9}, La/x550;-><init>(La/d650;ZLa/yje;B)V

    .line 537
    .line 538
    .line 539
    const/16 v5, 0xa

    .line 540
    .line 541
    const/4 v2, 0x0

    .line 542
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 543
    .line 544
    .line 545
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    return-object v0

    .line 548
    :pswitch_d
    check-cast v0, Ljava/lang/String;

    .line 549
    .line 550
    new-instance v1, La/cy00;

    .line 551
    .line 552
    invoke-direct {v1, v0, v10, v8}, La/cy00;-><init>(Ljava/lang/String;ZZ)V

    .line 553
    .line 554
    .line 555
    return-object v1

    .line 556
    :pswitch_e
    check-cast v0, La/kfp;

    .line 557
    .line 558
    invoke-virtual {v0, v10}, La/eg60;->f(Z)V

    .line 559
    .line 560
    .line 561
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 562
    .line 563
    return-object v0

    .line 564
    :pswitch_f
    check-cast v0, La/egk0;

    .line 565
    .line 566
    if-nez v10, :cond_11

    .line 567
    .line 568
    invoke-virtual {v0}, La/egk0;->l()J

    .line 569
    .line 570
    .line 571
    move-result-wide v0

    .line 572
    const-wide/32 v2, 0x5b8998

    .line 573
    .line 574
    .line 575
    cmp-long v0, v0, v2

    .line 576
    .line 577
    if-lez v0, :cond_10

    .line 578
    .line 579
    goto :goto_8

    .line 580
    :cond_10
    move v8, v9

    .line 581
    :cond_11
    :goto_8
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    return-object v0

    .line 586
    :pswitch_10
    check-cast v0, La/r7f;

    .line 587
    .line 588
    iget-object v1, v0, La/r7f;->C1:La/w4f;

    .line 589
    .line 590
    sget-object v2, La/w4f;->c:La/w4f;

    .line 591
    .line 592
    if-ne v1, v2, :cond_12

    .line 593
    .line 594
    if-eqz v10, :cond_12

    .line 595
    .line 596
    invoke-virtual {v0}, La/r7f;->Z()V

    .line 597
    .line 598
    .line 599
    :cond_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_11
    check-cast v0, La/e03;

    .line 603
    .line 604
    if-eqz v10, :cond_13

    .line 605
    .line 606
    invoke-virtual {v0}, La/e03;->i()La/mz40;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    if-eqz v0, :cond_13

    .line 611
    .line 612
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    check-cast v0, La/qoj0;

    .line 615
    .line 616
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_12
    check-cast v0, La/nyq0;

    .line 623
    .line 624
    invoke-interface {v0}, La/nyq0;->getState()La/oyq0;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {v1}, La/oyq0;->a()F

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    cmpg-float v1, v1, v6

    .line 633
    .line 634
    if-nez v1, :cond_14

    .line 635
    .line 636
    goto :goto_9

    .line 637
    :cond_14
    invoke-interface {v0}, La/nyq0;->getState()La/oyq0;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-virtual {v0}, La/oyq0;->a()F

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    sub-float/2addr v6, v0

    .line 646
    const v0, 0x3c23d70a    # 0.01f

    .line 647
    .line 648
    .line 649
    cmpg-float v0, v6, v0

    .line 650
    .line 651
    if-ltz v0, :cond_16

    .line 652
    .line 653
    if-nez v10, :cond_15

    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_15
    move v8, v9

    .line 657
    :cond_16
    :goto_9
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    return-object v0

    .line 662
    :pswitch_13
    check-cast v0, La/bzl;

    .line 663
    .line 664
    if-nez v10, :cond_17

    .line 665
    .line 666
    iget-object v0, v0, La/bzl;->f:La/a8z;

    .line 667
    .line 668
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    check-cast v0, La/l7m0;

    .line 673
    .line 674
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    check-cast v0, Ljava/lang/Number;

    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    cmpl-float v0, v0, v5

    .line 685
    .line 686
    if-ltz v0, :cond_17

    .line 687
    .line 688
    goto :goto_a

    .line 689
    :cond_17
    move v8, v9

    .line 690
    :goto_a
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    return-object v0

    .line 695
    :pswitch_14
    check-cast v0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 696
    .line 697
    sget v1, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->c:I

    .line 698
    .line 699
    invoke-virtual {v0, v9, v10}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->a(ZZ)V

    .line 700
    .line 701
    .line 702
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    return-object v0

    .line 705
    :pswitch_15
    check-cast v0, La/hdj;

    .line 706
    .line 707
    if-nez v10, :cond_19

    .line 708
    .line 709
    :cond_18
    move v8, v9

    .line 710
    goto :goto_b

    .line 711
    :cond_19
    invoke-virtual {v0}, La/hdj;->a()Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    if-nez v1, :cond_1a

    .line 716
    .line 717
    goto :goto_b

    .line 718
    :cond_1a
    iget-object v2, v0, La/hdj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 719
    .line 720
    invoke-static {v1, v2}, La/bsr0;->W(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)I

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-ltz v2, :cond_18

    .line 725
    .line 726
    iget-object v0, v0, La/hdj;->c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 727
    .line 728
    invoke-static {v1, v0}, La/bsr0;->W(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)I

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-gtz v0, :cond_18

    .line 733
    .line 734
    :goto_b
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    return-object v0

    .line 739
    :pswitch_16
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 740
    .line 741
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 742
    .line 743
    iget-object v0, v0, La/vd7;->d:Landroid/view/View;

    .line 744
    .line 745
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 746
    .line 747
    invoke-virtual {v0, v10}, Lorg/xplatform/uikit/components/text_field/DsTextField;->g(Z)V

    .line 748
    .line 749
    .line 750
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 751
    .line 752
    return-object v0

    .line 753
    :pswitch_data_0
    .packed-switch 0x0
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
