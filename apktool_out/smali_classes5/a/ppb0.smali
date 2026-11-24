.class public final synthetic La/ppb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ppb0;->a:B

    iput-object p1, p0, La/ppb0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/ppb0;->a:B

    .line 6
    .line 7
    const/16 v3, 0xd

    .line 8
    .line 9
    const/16 v4, 0x15

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v0, v0, La/ppb0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, La/hmf0;

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Throwable;

    .line 23
    .line 24
    iget-object v0, v0, La/hmf0;->b:La/odd;

    .line 25
    .line 26
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_0
    check-cast v0, La/odd;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Throwable;

    .line 35
    .line 36
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    check-cast v0, La/kxc0;

    .line 43
    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    sget-object v2, La/kxc0;->Y1:La/jh70;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, La/kxc0;->J0()La/k3t0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v2, La/uvc0;

    .line 56
    .line 57
    invoke-direct {v2, v1}, La/uvc0;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_2
    check-cast v0, La/qwc0;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    sget-object v2, La/qwc0;->Z1:La/rl70;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, La/qwc0;->J0()La/k3t0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v2, La/iwc0;

    .line 80
    .line 81
    invoke-direct {v2, v1}, La/iwc0;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_3
    check-cast v0, La/kvc0;

    .line 91
    .line 92
    check-cast v1, Ljava/lang/Throwable;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_4
    check-cast v0, La/aqc0;

    .line 104
    .line 105
    check-cast v1, Ljava/lang/Throwable;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, La/aqc0;->w:La/duj;

    .line 111
    .line 112
    new-instance v3, La/xh20;

    .line 113
    .line 114
    const/16 v4, 0xf

    .line 115
    .line 116
    invoke-direct {v3, v7, v0, v4}, La/xh20;-><init>(ZLjava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_5
    check-cast v0, La/znc0;

    .line 126
    .line 127
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 128
    .line 129
    sget-object v2, La/znc0;->U1:La/rl70;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, La/znc0;->H0()La/doc0;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, La/doc0;->y()V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_6
    check-cast v0, La/hnc0;

    .line 145
    .line 146
    check-cast v1, Landroid/view/View;

    .line 147
    .line 148
    sget-object v2, La/hnc0;->R1:La/xi70;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v0, v0, La/hnc0;->Q1:La/kiu0;

    .line 154
    .line 155
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, La/qnc0;

    .line 160
    .line 161
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    iget-object v1, v0, La/qnc0;->c:La/mne;

    .line 166
    .line 167
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 168
    .line 169
    new-instance v10, La/inc0;

    .line 170
    .line 171
    invoke-direct {v10, v0, v8}, La/inc0;-><init>(La/qnc0;B)V

    .line 172
    .line 173
    .line 174
    new-instance v13, La/hu3;

    .line 175
    .line 176
    const/4 v1, 0x5

    .line 177
    invoke-direct {v13, v0, v6, v1}, La/hu3;-><init>(La/diu0;La/yje;B)V

    .line 178
    .line 179
    .line 180
    const/16 v14, 0xa

    .line 181
    .line 182
    const/4 v11, 0x0

    .line 183
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 184
    .line 185
    .line 186
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_7
    check-cast v0, La/bnc0;

    .line 190
    .line 191
    move-object v7, v1

    .line 192
    check-cast v7, La/hcz;

    .line 193
    .line 194
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v1, La/jiq0;->e:La/ugd;

    .line 198
    .line 199
    invoke-static {v7, v6, v6, v1, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 200
    .line 201
    .line 202
    iget-boolean v1, v0, La/bnc0;->b:Z

    .line 203
    .line 204
    if-eqz v1, :cond_0

    .line 205
    .line 206
    sget-object v1, La/jiq0;->f:La/ugd;

    .line 207
    .line 208
    invoke-static {v7, v6, v6, v1, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 209
    .line 210
    .line 211
    :cond_0
    iget-boolean v0, v0, La/bnc0;->c:Z

    .line 212
    .line 213
    if-eqz v0, :cond_1

    .line 214
    .line 215
    sget-object v0, La/jiq0;->g:La/ugd;

    .line 216
    .line 217
    invoke-static {v7, v6, v6, v0, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 218
    .line 219
    .line 220
    sget-object v0, La/jiq0;->h:La/ugd;

    .line 221
    .line 222
    invoke-static {v7, v6, v6, v0, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 223
    .line 224
    .line 225
    :cond_1
    sget-object v0, La/jiq0;->i:La/ugd;

    .line 226
    .line 227
    invoke-static {v7, v6, v6, v0, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 228
    .line 229
    .line 230
    sget-object v11, La/jiq0;->j:La/ugd;

    .line 231
    .line 232
    const/4 v12, 0x6

    .line 233
    const/4 v8, 0x5

    .line 234
    const/4 v9, 0x0

    .line 235
    const/4 v10, 0x0

    .line 236
    invoke-static/range {v7 .. v12}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 237
    .line 238
    .line 239
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_8
    check-cast v0, La/jmc0;

    .line 243
    .line 244
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 245
    .line 246
    sget-object v2, La/jmc0;->U1:La/nh70;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, La/jmc0;->H0()La/hyc0;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0, v8}, La/hyc0;->y(Z)V

    .line 256
    .line 257
    .line 258
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_9
    check-cast v0, La/clc0;

    .line 262
    .line 263
    check-cast v1, Ljava/lang/Throwable;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-static {v1}, La/saj;->Y(Ljava/lang/Throwable;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_3

    .line 273
    .line 274
    iget-object v1, v0, La/clc0;->r:Ljava/util/Map;

    .line 275
    .line 276
    if-nez v1, :cond_2

    .line 277
    .line 278
    sget-object v1, La/lun;->a:La/lun;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    :cond_2
    iput-object v1, v0, La/clc0;->r:Ljava/util/Map;

    .line 284
    .line 285
    invoke-virtual {v0}, La/clc0;->y()V

    .line 286
    .line 287
    .line 288
    goto :goto_0

    .line 289
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 290
    .line 291
    .line 292
    iget-object v0, v0, La/clc0;->p:La/q99;

    .line 293
    .line 294
    new-instance v1, La/wkc0;

    .line 295
    .line 296
    const v2, 0x7f13131f

    .line 297
    .line 298
    .line 299
    invoke-direct {v1, v2}, La/wkc0;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v0, v1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_a
    check-cast v0, La/rkc0;

    .line 309
    .line 310
    check-cast v1, Ljava/lang/Throwable;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object v2, v0, La/rkc0;->e:La/duj;

    .line 316
    .line 317
    new-instance v3, La/lma0;

    .line 318
    .line 319
    const/16 v4, 0x16

    .line 320
    .line 321
    invoke-direct {v3, v0, v4}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 325
    .line 326
    .line 327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_b
    check-cast v0, La/gkc0;

    .line 331
    .line 332
    check-cast v1, Ljava/lang/Throwable;

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object v0, v0, La/gkc0;->m:La/duj;

    .line 338
    .line 339
    new-instance v2, La/yr0;

    .line 340
    .line 341
    invoke-direct {v2, v1, v4}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 345
    .line 346
    .line 347
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object v0

    .line 350
    :pswitch_c
    check-cast v0, La/jhc0;

    .line 351
    .line 352
    check-cast v1, Ljava/lang/Throwable;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iget-object v0, v0, La/jhc0;->n:La/p7m0;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    sget-object v1, La/ygc0;->a:La/ygc0;

    .line 363
    .line 364
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_d
    check-cast v0, La/l8c0;

    .line 371
    .line 372
    check-cast v1, La/cp;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 378
    .line 379
    check-cast v2, La/ywx;

    .line 380
    .line 381
    iget-object v2, v2, La/ywx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    new-instance v4, La/oac0;

    .line 387
    .line 388
    invoke-direct {v4, v0, v1, v5}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 389
    .line 390
    .line 391
    invoke-static {v2, v4}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 392
    .line 393
    .line 394
    new-instance v0, La/bb;

    .line 395
    .line 396
    const/16 v2, 0xe

    .line 397
    .line 398
    invoke-direct {v0, v1, v2}, La/bb;-><init>(La/cp;B)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 402
    .line 403
    .line 404
    new-instance v0, La/ui80;

    .line 405
    .line 406
    invoke-direct {v0, v1, v3}, La/ui80;-><init>(La/cp;B)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 410
    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_e
    check-cast v0, La/idc0;

    .line 416
    .line 417
    check-cast v1, Landroid/view/View;

    .line 418
    .line 419
    sget-object v2, La/idc0;->S1:La/jh70;

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, La/idc0;->L0()La/l6q;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget-object v1, v1, La/l6q;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 429
    .line 430
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0}, La/idc0;->M0()La/kvc0;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    iget-object v1, v0, La/kvc0;->D:La/p7m0;

    .line 438
    .line 439
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    check-cast v1, La/ivc0;

    .line 444
    .line 445
    iget-object v1, v1, La/ivc0;->a:Ljava/lang/String;

    .line 446
    .line 447
    invoke-static {v1}, La/sj3;->i0(Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    if-nez v1, :cond_4

    .line 452
    .line 453
    goto :goto_1

    .line 454
    :cond_4
    invoke-virtual {v0, v1, v8}, La/kvc0;->C(Ljava/lang/String;Z)V

    .line 455
    .line 456
    .line 457
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    :pswitch_f
    check-cast v0, La/tac0;

    .line 461
    .line 462
    check-cast v1, La/k0w0;

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget-object v0, v0, La/tac0;->h:La/peg0;

    .line 468
    .line 469
    invoke-virtual {v0}, La/peg0;->o()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, La/c8d;

    .line 480
    .line 481
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 482
    .line 483
    new-instance v2, La/v7d;

    .line 484
    .line 485
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 486
    .line 487
    .line 488
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 489
    .line 490
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    return-object v0

    .line 493
    :pswitch_10
    check-cast v0, La/op30;

    .line 494
    .line 495
    iget-object v2, v0, La/op30;->d:La/n0o0;

    .line 496
    .line 497
    check-cast v1, La/fee;

    .line 498
    .line 499
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    iget-object v1, v0, La/op30;->h:La/n0o0;

    .line 503
    .line 504
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    check-cast v3, La/fee;

    .line 509
    .line 510
    iget-object v4, v0, La/op30;->b:La/ctf0;

    .line 511
    .line 512
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    check-cast v3, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;

    .line 517
    .line 518
    instance-of v3, v3, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$DetailsPromo;

    .line 519
    .line 520
    iget-object v5, v0, La/op30;->f:La/n0o0;

    .line 521
    .line 522
    if-eqz v3, :cond_5

    .line 523
    .line 524
    new-instance v1, La/edc0;

    .line 525
    .line 526
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    check-cast v2, La/fee;

    .line 531
    .line 532
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    check-cast v2, Ljava/lang/String;

    .line 537
    .line 538
    iget-object v0, v0, La/op30;->g:La/n0o0;

    .line 539
    .line 540
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, La/fee;

    .line 545
    .line 546
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, Ljava/lang/Iterable;

    .line 551
    .line 552
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    new-array v3, v8, [Ljava/lang/Object;

    .line 557
    .line 558
    iget-object v5, v4, La/ctf0;->b:La/lsm0;

    .line 559
    .line 560
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 561
    .line 562
    invoke-static {v3, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    const v6, 0x7f1302bd

    .line 567
    .line 568
    .line 569
    invoke-virtual {v5, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    new-instance v5, La/mtl;

    .line 574
    .line 575
    new-instance v6, La/itl;

    .line 576
    .line 577
    new-instance v9, La/wul;

    .line 578
    .line 579
    sget-object v10, La/lul;->e:La/lul;

    .line 580
    .line 581
    sget-object v11, La/oe9;->a:La/oe9;

    .line 582
    .line 583
    new-instance v12, La/ue9;

    .line 584
    .line 585
    new-array v7, v8, [Ljava/lang/Object;

    .line 586
    .line 587
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v7

    .line 591
    const v13, 0x7f130988

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, v13, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    invoke-direct {v12, v7}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    const/4 v15, 0x1

    .line 603
    const/4 v13, 0x1

    .line 604
    invoke-direct/range {v9 .. v15}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 605
    .line 606
    .line 607
    sget-object v7, La/rk;->A:La/rk;

    .line 608
    .line 609
    invoke-direct {v6, v9, v7}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 610
    .line 611
    .line 612
    new-instance v7, La/itl;

    .line 613
    .line 614
    move-object v13, v11

    .line 615
    new-instance v11, La/wul;

    .line 616
    .line 617
    sget-object v12, La/nul;->e:La/nul;

    .line 618
    .line 619
    new-instance v14, La/ue9;

    .line 620
    .line 621
    new-array v9, v8, [Ljava/lang/Object;

    .line 622
    .line 623
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v8

    .line 627
    const v9, 0x7f130abf

    .line 628
    .line 629
    .line 630
    invoke-virtual {v4, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    invoke-direct {v14, v4}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    const/16 v16, 0x0

    .line 638
    .line 639
    const/16 v17, 0x1

    .line 640
    .line 641
    invoke-direct/range {v11 .. v17}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 642
    .line 643
    .line 644
    sget-object v4, La/rk;->Z:La/rk;

    .line 645
    .line 646
    invoke-direct {v7, v11, v4}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 647
    .line 648
    .line 649
    filled-new-array {v6, v7}, [La/itl;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    invoke-direct {v5, v4}, La/mtl;-><init>(La/a4x;)V

    .line 658
    .line 659
    .line 660
    invoke-direct {v1, v2, v0, v3, v5}, La/edc0;-><init>(Ljava/lang/String;La/a4x;Ljava/lang/String;La/mtl;)V

    .line 661
    .line 662
    .line 663
    goto/16 :goto_3

    .line 664
    .line 665
    :cond_5
    new-instance v6, La/ddc0;

    .line 666
    .line 667
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    check-cast v3, La/fee;

    .line 672
    .line 673
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    check-cast v3, Ljava/lang/String;

    .line 678
    .line 679
    new-array v9, v8, [Ljava/lang/Object;

    .line 680
    .line 681
    iget-object v10, v4, La/ctf0;->b:La/lsm0;

    .line 682
    .line 683
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 684
    .line 685
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v9

    .line 689
    const v11, 0x7f130048

    .line 690
    .line 691
    .line 692
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v9

    .line 696
    new-array v10, v8, [Ljava/lang/Object;

    .line 697
    .line 698
    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    const v11, 0x7f1307b2

    .line 703
    .line 704
    .line 705
    invoke-virtual {v4, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v10

    .line 709
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    check-cast v1, La/fee;

    .line 714
    .line 715
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    instance-of v1, v1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState$Error;

    .line 720
    .line 721
    iget-object v0, v0, La/op30;->e:La/n0o0;

    .line 722
    .line 723
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    check-cast v0, La/fee;

    .line 728
    .line 729
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    move-object v11, v0

    .line 734
    check-cast v11, Ljava/lang/String;

    .line 735
    .line 736
    new-instance v12, La/mtl;

    .line 737
    .line 738
    new-instance v0, La/itl;

    .line 739
    .line 740
    new-instance v13, La/wul;

    .line 741
    .line 742
    sget-object v14, La/lul;->e:La/lul;

    .line 743
    .line 744
    sget-object v15, La/oe9;->a:La/oe9;

    .line 745
    .line 746
    new-instance v7, La/ue9;

    .line 747
    .line 748
    move/from16 p0, v1

    .line 749
    .line 750
    new-array v1, v8, [Ljava/lang/Object;

    .line 751
    .line 752
    invoke-static {v1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    const v8, 0x7f130042

    .line 757
    .line 758
    .line 759
    invoke-virtual {v4, v8, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    invoke-direct {v7, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    check-cast v1, La/fee;

    .line 771
    .line 772
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    check-cast v1, Ljava/lang/CharSequence;

    .line 777
    .line 778
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    if-lez v1, :cond_6

    .line 783
    .line 784
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    check-cast v1, La/fee;

    .line 789
    .line 790
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    check-cast v1, Ljava/lang/Boolean;

    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    if-nez v1, :cond_6

    .line 801
    .line 802
    const/16 v17, 0x1

    .line 803
    .line 804
    goto :goto_2

    .line 805
    :cond_6
    const/16 v17, 0x0

    .line 806
    .line 807
    :goto_2
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    check-cast v1, La/fee;

    .line 812
    .line 813
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    check-cast v1, Ljava/lang/Boolean;

    .line 818
    .line 819
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 820
    .line 821
    .line 822
    move-result v18

    .line 823
    const/16 v19, 0x1

    .line 824
    .line 825
    move-object/from16 v16, v7

    .line 826
    .line 827
    invoke-direct/range {v13 .. v19}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 828
    .line 829
    .line 830
    sget-object v1, La/rk;->a:La/rk;

    .line 831
    .line 832
    invoke-direct {v0, v13, v1}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 833
    .line 834
    .line 835
    filled-new-array {v0}, [La/itl;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    invoke-direct {v12, v0}, La/mtl;-><init>(La/a4x;)V

    .line 844
    .line 845
    .line 846
    move-object v7, v3

    .line 847
    move-object v8, v9

    .line 848
    move-object v9, v10

    .line 849
    move/from16 v10, p0

    .line 850
    .line 851
    invoke-direct/range {v6 .. v12}, La/ddc0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;La/mtl;)V

    .line 852
    .line 853
    .line 854
    move-object v1, v6

    .line 855
    :goto_3
    return-object v1

    .line 856
    :pswitch_11
    check-cast v0, La/nac0;

    .line 857
    .line 858
    check-cast v1, La/hcz;

    .line 859
    .line 860
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    new-instance v2, La/p0z;

    .line 864
    .line 865
    const/16 v3, 0x1b

    .line 866
    .line 867
    invoke-direct {v2, v0, v3}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 868
    .line 869
    .line 870
    new-instance v3, La/ugd;

    .line 871
    .line 872
    const v7, -0x54e6a5f2

    .line 873
    .line 874
    .line 875
    const/4 v8, 0x1

    .line 876
    invoke-direct {v3, v7, v8, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    invoke-static {v1, v6, v6, v3, v5}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 880
    .line 881
    .line 882
    iget-object v0, v0, La/nac0;->b:La/fdc0;

    .line 883
    .line 884
    check-cast v0, La/edc0;

    .line 885
    .line 886
    iget-object v0, v0, La/edc0;->b:La/a4x;

    .line 887
    .line 888
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    new-instance v3, La/ubn;

    .line 893
    .line 894
    invoke-direct {v3, v0, v4}, La/ubn;-><init>(La/a4x;B)V

    .line 895
    .line 896
    .line 897
    new-instance v4, La/zd1;

    .line 898
    .line 899
    const/4 v5, 0x7

    .line 900
    invoke-direct {v4, v0, v5}, La/zd1;-><init>(La/a4x;B)V

    .line 901
    .line 902
    .line 903
    new-instance v0, La/ugd;

    .line 904
    .line 905
    const v5, 0x2fd4df92

    .line 906
    .line 907
    .line 908
    const/4 v8, 0x1

    .line 909
    invoke-direct {v0, v5, v8, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v1, v2, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 913
    .line 914
    .line 915
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 916
    .line 917
    return-object v0

    .line 918
    :pswitch_12
    check-cast v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 919
    .line 920
    check-cast v1, La/k0w0;

    .line 921
    .line 922
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    iget-object v2, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->x:La/peg0;

    .line 926
    .line 927
    iget-object v0, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->o:La/eld0;

    .line 928
    .line 929
    iget v3, v0, La/eld0;->b:I

    .line 930
    .line 931
    iget v0, v0, La/eld0;->c:I

    .line 932
    .line 933
    sget-object v4, La/d7v;->a:La/art;

    .line 934
    .line 935
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorGiftsFragmentScreen;

    .line 939
    .line 940
    const/4 v4, 0x0

    .line 941
    invoke-direct {v2, v3, v0, v4, v4}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorGiftsFragmentScreen;-><init>(IIIZ)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v1, v2}, La/k0w0;->k(La/m7h0;)V

    .line 945
    .line 946
    .line 947
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 948
    .line 949
    return-object v0

    .line 950
    :pswitch_13
    check-cast v0, La/r8c0;

    .line 951
    .line 952
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 953
    .line 954
    sget-object v2, La/r8c0;->U1:La/xi70;

    .line 955
    .line 956
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0}, La/r8c0;->H0()La/qyc0;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v0}, La/qyc0;->x()V

    .line 964
    .line 965
    .line 966
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_14
    check-cast v0, La/m8c0;

    .line 970
    .line 971
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 972
    .line 973
    sget-object v2, La/m8c0;->V1:La/mi70;

    .line 974
    .line 975
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v0}, La/m8c0;->H0()La/hyc0;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    const/4 v4, 0x0

    .line 983
    invoke-virtual {v0, v4}, La/hyc0;->y(Z)V

    .line 984
    .line 985
    .line 986
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 987
    .line 988
    return-object v0

    .line 989
    :pswitch_15
    check-cast v0, La/g7c0;

    .line 990
    .line 991
    check-cast v1, Ljava/lang/Throwable;

    .line 992
    .line 993
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    iget-object v2, v0, La/g7c0;->k:La/duj;

    .line 997
    .line 998
    new-instance v3, La/c7c0;

    .line 999
    .line 1000
    const/4 v8, 0x1

    .line 1001
    invoke-direct {v3, v0, v8}, La/c7c0;-><init>(La/g7c0;B)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_16
    check-cast v0, La/b0c0;

    .line 1011
    .line 1012
    check-cast v1, Landroid/view/View;

    .line 1013
    .line 1014
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1021
    .line 1022
    return-object v0

    .line 1023
    :pswitch_17
    check-cast v0, La/b0c0;

    .line 1024
    .line 1025
    check-cast v1, Landroid/view/View;

    .line 1026
    .line 1027
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1034
    .line 1035
    return-object v0

    .line 1036
    :pswitch_18
    check-cast v0, La/yn90;

    .line 1037
    .line 1038
    check-cast v1, La/cp;

    .line 1039
    .line 1040
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1044
    .line 1045
    check-cast v2, La/vwx;

    .line 1046
    .line 1047
    iget-object v4, v2, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1048
    .line 1049
    invoke-virtual {v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v4

    .line 1053
    if-eqz v4, :cond_7

    .line 1054
    .line 1055
    const/4 v5, 0x0

    .line 1056
    invoke-virtual {v4, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v4, v5}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1060
    .line 1061
    .line 1062
    :cond_7
    iget-object v4, v2, La/vwx;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1063
    .line 1064
    new-instance v5, La/s6w;

    .line 1065
    .line 1066
    const/4 v8, 0x1

    .line 1067
    invoke-direct {v5, v1, v8}, La/s6w;-><init>(La/cp;B)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v4, La/bb;

    .line 1074
    .line 1075
    invoke-direct {v4, v1, v3}, La/bb;-><init>(La/cp;B)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v1, v4}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 1079
    .line 1080
    .line 1081
    iget-object v2, v2, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1082
    .line 1083
    new-instance v3, La/da0;

    .line 1084
    .line 1085
    new-instance v4, La/zga0;

    .line 1086
    .line 1087
    const/16 v5, 0x18

    .line 1088
    .line 1089
    invoke-direct {v4, v0, v1, v5}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1090
    .line 1091
    .line 1092
    invoke-direct {v3, v4}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 1096
    .line 1097
    .line 1098
    new-instance v0, La/ctv;

    .line 1099
    .line 1100
    const/16 v2, 0xa

    .line 1101
    .line 1102
    invoke-direct {v0, v1, v1, v2}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1106
    .line 1107
    .line 1108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1109
    .line 1110
    return-object v0

    .line 1111
    :pswitch_19
    check-cast v0, La/e9b0;

    .line 1112
    .line 1113
    check-cast v1, La/cp;

    .line 1114
    .line 1115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1119
    .line 1120
    check-cast v2, La/wwx;

    .line 1121
    .line 1122
    iget-object v2, v2, La/wwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1123
    .line 1124
    sget-object v3, La/ymx;->e:La/ymx;

    .line 1125
    .line 1126
    new-instance v4, La/zga0;

    .line 1127
    .line 1128
    const/16 v5, 0x17

    .line 1129
    .line 1130
    invoke-direct {v4, v0, v1, v5}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1131
    .line 1132
    .line 1133
    invoke-static {v2, v3, v4}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1134
    .line 1135
    .line 1136
    new-instance v0, La/ctv;

    .line 1137
    .line 1138
    const/16 v2, 0x9

    .line 1139
    .line 1140
    invoke-direct {v0, v1, v1, v2}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1144
    .line 1145
    .line 1146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1147
    .line 1148
    return-object v0

    .line 1149
    :pswitch_1a
    check-cast v0, La/w5z;

    .line 1150
    .line 1151
    iget-object v0, v0, La/w5z;->e:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v0, La/xw3;

    .line 1154
    .line 1155
    invoke-virtual {v0, v1}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 1156
    .line 1157
    .line 1158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1159
    .line 1160
    return-object v0

    .line 1161
    :pswitch_1b
    check-cast v0, La/kxb0;

    .line 1162
    .line 1163
    check-cast v1, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1164
    .line 1165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    iget-object v0, v0, La/kxb0;->b:Ljava/lang/String;

    .line 1169
    .line 1170
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v2

    .line 1174
    const v3, 0x7f080ab2

    .line 1175
    .line 1176
    .line 1177
    invoke-static {v3, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    const v4, 0x7f040b10

    .line 1189
    .line 1190
    .line 1191
    invoke-static {v2, v3, v4}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 1192
    .line 1193
    .line 1194
    const/16 v3, 0xc

    .line 1195
    .line 1196
    invoke-static {v1, v0, v2, v3}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 1197
    .line 1198
    .line 1199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1200
    .line 1201
    return-object v0

    .line 1202
    :pswitch_1c
    check-cast v0, La/w5z;

    .line 1203
    .line 1204
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 1205
    .line 1206
    iput-object v1, v0, La/w5z;->d:Ljava/lang/Object;

    .line 1207
    .line 1208
    iget-object v0, v0, La/w5z;->a:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v0, La/tpb0;

    .line 1211
    .line 1212
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1216
    .line 1217
    .line 1218
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1219
    .line 1220
    return-object v0

    .line 1221
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
