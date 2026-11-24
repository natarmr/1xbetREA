.class public final La/sue0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sue0;->a:B

    iput-object p1, p0, La/sue0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/sue0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sue0;->a:B

    .line 4
    .line 5
    const-string v2, "rootView"

    .line 6
    .line 7
    const-string v3, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "Missing required view with ID: "

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, v0, La/sue0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, La/sue0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, La/fcm0;

    .line 21
    .line 22
    sget-object v1, La/fcm0;->n2:La/j6m0;

    .line 23
    .line 24
    iget-object v1, v0, La/fcm0;->m2:La/phf0;

    .line 25
    .line 26
    sget-object v2, La/fcm0;->o2:[La/iiy;

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    aget-object v2, v2, v4

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v7, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;

    .line 36
    .line 37
    new-instance v2, Lkotlin/Pair;

    .line 38
    .line 39
    invoke-direct {v2, v3, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    check-cast v7, La/tdb;

    .line 62
    .line 63
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_1
    check-cast v0, Landroid/app/Application;

    .line 70
    .line 71
    instance-of v1, v0, La/af3;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    check-cast v0, La/af3;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    move-object v0, v6

    .line 79
    :goto_0
    const-class v1, La/zzl0;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/o5d0;

    .line 92
    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/ze3;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    move-object v0, v6

    .line 103
    :goto_1
    instance-of v2, v0, La/zzl0;

    .line 104
    .line 105
    if-nez v2, :cond_2

    .line 106
    .line 107
    move-object v0, v6

    .line 108
    :cond_2
    check-cast v0, La/zzl0;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    check-cast v7, La/d0m0;

    .line 113
    .line 114
    iget-wide v1, v7, La/d0m0;->b:J

    .line 115
    .line 116
    iget-object v4, v0, La/zzl0;->a:La/cad;

    .line 117
    .line 118
    iget-object v3, v0, La/zzl0;->d:La/roi0;

    .line 119
    .line 120
    iget-object v5, v0, La/zzl0;->b:La/ctf0;

    .line 121
    .line 122
    iget-object v6, v0, La/zzl0;->c:La/r9u;

    .line 123
    .line 124
    iget-object v8, v0, La/zzl0;->f:La/a0m0;

    .line 125
    .line 126
    iget-object v3, v3, La/roi0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, La/daf;

    .line 129
    .line 130
    invoke-virtual {v3}, La/daf;->j()La/yui;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-object v0, v0, La/zzl0;->e:La/oeg0;

    .line 135
    .line 136
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v3, v0}, La/yui;->a(La/i1w0;)La/kki;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v3, La/vui;

    .line 154
    .line 155
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-direct/range {v3 .. v9}, La/vui;-><init>(La/cad;La/ctf0;La/r9u;Ljava/lang/Long;La/a0m0;La/kki;)V

    .line 160
    .line 161
    .line 162
    move-object v6, v3

    .line 163
    goto :goto_2

    .line 164
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 165
    .line 166
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :goto_2
    return-object v6

    .line 174
    :pswitch_2
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 175
    .line 176
    check-cast v7, La/kvl0;

    .line 177
    .line 178
    iget-wide v1, v7, La/kvl0;->a:J

    .line 179
    .line 180
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    iget-object v2, v7, La/kvl0;->b:Ljava/lang/String;

    .line 185
    .line 186
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_3
    check-cast v7, La/a8z;

    .line 193
    .line 194
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    check-cast v1, La/riu0;

    .line 199
    .line 200
    instance-of v2, v1, La/wmv;

    .line 201
    .line 202
    if-eqz v2, :cond_4

    .line 203
    .line 204
    move-object v6, v1

    .line 205
    check-cast v6, La/wmv;

    .line 206
    .line 207
    :cond_4
    if-eqz v6, :cond_5

    .line 208
    .line 209
    invoke-interface {v6}, La/wmv;->n()La/miu0;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-nez v1, :cond_6

    .line 214
    .line 215
    :cond_5
    check-cast v0, La/mtl0;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :cond_6
    return-object v1

    .line 222
    :pswitch_4
    check-cast v7, La/a8z;

    .line 223
    .line 224
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, La/riu0;

    .line 229
    .line 230
    instance-of v2, v1, La/wmv;

    .line 231
    .line 232
    if-eqz v2, :cond_7

    .line 233
    .line 234
    move-object v6, v1

    .line 235
    check-cast v6, La/wmv;

    .line 236
    .line 237
    :cond_7
    if-eqz v6, :cond_8

    .line 238
    .line 239
    invoke-interface {v6}, La/wmv;->n()La/miu0;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-nez v1, :cond_9

    .line 244
    .line 245
    :cond_8
    check-cast v0, La/ysl0;

    .line 246
    .line 247
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    :cond_9
    return-object v1

    .line 252
    :pswitch_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 253
    .line 254
    new-instance v1, La/vxq0;

    .line 255
    .line 256
    new-instance v2, La/w4l0;

    .line 257
    .line 258
    check-cast v7, La/ger0;

    .line 259
    .line 260
    iget-object v3, v7, La/ger0;->c:La/l1b0;

    .line 261
    .line 262
    iget-wide v3, v3, La/l1b0;->a:J

    .line 263
    .line 264
    invoke-direct {v2, v3, v4}, La/w4l0;-><init>(J)V

    .line 265
    .line 266
    .line 267
    invoke-direct {v1, v2}, La/vxq0;-><init>(La/b5l0;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_6
    check-cast v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    check-cast v7, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 290
    .line 291
    const v1, 0x7f0d0087

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 299
    .line 300
    .line 301
    move-object v9, v0

    .line 302
    check-cast v9, Landroid/widget/GridLayout;

    .line 303
    .line 304
    const v1, 0x7f0a1463

    .line 305
    .line 306
    .line 307
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    move-object v11, v2

    .line 312
    check-cast v11, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 313
    .line 314
    if-eqz v11, :cond_a

    .line 315
    .line 316
    const v1, 0x7f0a1464

    .line 317
    .line 318
    .line 319
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    move-object v12, v2

    .line 324
    check-cast v12, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 325
    .line 326
    if-eqz v12, :cond_a

    .line 327
    .line 328
    const v1, 0x7f0a1465

    .line 329
    .line 330
    .line 331
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    move-object v13, v2

    .line 336
    check-cast v13, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 337
    .line 338
    if-eqz v13, :cond_a

    .line 339
    .line 340
    const v1, 0x7f0a1466

    .line 341
    .line 342
    .line 343
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    move-object v14, v2

    .line 348
    check-cast v14, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 349
    .line 350
    if-eqz v14, :cond_a

    .line 351
    .line 352
    const v1, 0x7f0a1467

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    move-object v15, v2

    .line 360
    check-cast v15, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 361
    .line 362
    if-eqz v15, :cond_a

    .line 363
    .line 364
    const v1, 0x7f0a1468

    .line 365
    .line 366
    .line 367
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    move-object/from16 v16, v2

    .line 372
    .line 373
    check-cast v16, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 374
    .line 375
    if-eqz v16, :cond_a

    .line 376
    .line 377
    new-instance v8, La/mic;

    .line 378
    .line 379
    move-object v10, v9

    .line 380
    invoke-direct/range {v8 .. v16}, La/mic;-><init>(Landroid/widget/GridLayout;Landroid/widget/GridLayout;Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;)V

    .line 381
    .line 382
    .line 383
    move-object v6, v8

    .line 384
    goto :goto_3

    .line 385
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :goto_3
    return-object v6

    .line 401
    :pswitch_7
    check-cast v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    check-cast v7, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 415
    .line 416
    const v1, 0x7f0d004e

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 424
    .line 425
    .line 426
    const v1, 0x7f0a01fe

    .line 427
    .line 428
    .line 429
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    move-object v9, v2

    .line 434
    check-cast v9, Landroid/widget/ImageView;

    .line 435
    .line 436
    if-eqz v9, :cond_b

    .line 437
    .line 438
    const v1, 0x7f0a0206

    .line 439
    .line 440
    .line 441
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    move-object v10, v2

    .line 446
    check-cast v10, Landroid/widget/TextView;

    .line 447
    .line 448
    if-eqz v10, :cond_b

    .line 449
    .line 450
    const v1, 0x7f0a0207

    .line 451
    .line 452
    .line 453
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    move-object v11, v2

    .line 458
    check-cast v11, Landroid/widget/ImageView;

    .line 459
    .line 460
    if-eqz v11, :cond_b

    .line 461
    .line 462
    const v1, 0x7f0a0365

    .line 463
    .line 464
    .line 465
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    move-object v12, v2

    .line 470
    check-cast v12, Landroid/widget/TextView;

    .line 471
    .line 472
    if-eqz v12, :cond_b

    .line 473
    .line 474
    const v1, 0x7f0a06da

    .line 475
    .line 476
    .line 477
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    move-object v13, v2

    .line 482
    check-cast v13, Landroidx/constraintlayout/widget/Guideline;

    .line 483
    .line 484
    if-eqz v13, :cond_b

    .line 485
    .line 486
    new-instance v7, La/wm6;

    .line 487
    .line 488
    move-object v8, v0

    .line 489
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 490
    .line 491
    invoke-direct/range {v7 .. v13}, La/wm6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Guideline;)V

    .line 492
    .line 493
    .line 494
    move-object v6, v7

    .line 495
    goto :goto_4

    .line 496
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :goto_4
    return-object v6

    .line 512
    :pswitch_8
    check-cast v7, La/a8z;

    .line 513
    .line 514
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    check-cast v1, La/riu0;

    .line 519
    .line 520
    instance-of v2, v1, La/wmv;

    .line 521
    .line 522
    if-eqz v2, :cond_c

    .line 523
    .line 524
    move-object v6, v1

    .line 525
    check-cast v6, La/wmv;

    .line 526
    .line 527
    :cond_c
    if-eqz v6, :cond_d

    .line 528
    .line 529
    invoke-interface {v6}, La/wmv;->n()La/miu0;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    if-nez v1, :cond_e

    .line 534
    .line 535
    :cond_d
    check-cast v0, La/jvj0;

    .line 536
    .line 537
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    :cond_e
    return-object v1

    .line 542
    :pswitch_9
    check-cast v0, La/usj0;

    .line 543
    .line 544
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    check-cast v7, La/usj0;

    .line 556
    .line 557
    const v1, 0x7f0d0580

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 565
    .line 566
    .line 567
    if-eqz v0, :cond_f

    .line 568
    .line 569
    check-cast v0, Landroid/widget/ImageView;

    .line 570
    .line 571
    new-instance v6, La/vsj0;

    .line 572
    .line 573
    invoke-direct {v6, v0, v0}, La/vsj0;-><init>(Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 574
    .line 575
    .line 576
    goto :goto_5

    .line 577
    :cond_f
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    :goto_5
    return-object v6

    .line 581
    :pswitch_a
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/settoemezzo/costrule/SettoeMezzoRuleView;

    .line 582
    .line 583
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/settoemezzo/costrule/SettoeMezzoRuleView;

    .line 595
    .line 596
    const v1, 0x7f0d056a

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 600
    .line 601
    .line 602
    const v0, 0x7f0a077d

    .line 603
    .line 604
    .line 605
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    check-cast v1, Landroid/widget/ImageView;

    .line 610
    .line 611
    if-eqz v1, :cond_10

    .line 612
    .line 613
    const v0, 0x7f0a10c2

    .line 614
    .line 615
    .line 616
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    check-cast v2, Landroid/widget/TextView;

    .line 621
    .line 622
    if-eqz v2, :cond_10

    .line 623
    .line 624
    new-instance v6, La/sij0;

    .line 625
    .line 626
    invoke-direct {v6, v7, v1, v2}, La/sij0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/settoemezzo/costrule/SettoeMezzoRuleView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 627
    .line 628
    .line 629
    goto :goto_6

    .line 630
    :cond_10
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    :goto_6
    return-object v6

    .line 646
    :pswitch_b
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/settoemezzo/combination/SettoeMezzoCombinationView;

    .line 647
    .line 648
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    move-object v9, v7

    .line 660
    check-cast v9, Lorg/xplatform/cyber/game/universal/impl/presentation/settoemezzo/combination/SettoeMezzoCombinationView;

    .line 661
    .line 662
    const v1, 0x7f0d0569

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 666
    .line 667
    .line 668
    const v0, 0x7f0a0785

    .line 669
    .line 670
    .line 671
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    move-object v10, v1

    .line 676
    check-cast v10, Landroid/widget/ImageView;

    .line 677
    .line 678
    if-eqz v10, :cond_11

    .line 679
    .line 680
    const v0, 0x7f0a07a0

    .line 681
    .line 682
    .line 683
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    move-object v11, v1

    .line 688
    check-cast v11, Landroid/widget/ImageView;

    .line 689
    .line 690
    if-eqz v11, :cond_11

    .line 691
    .line 692
    const v0, 0x7f0a07a9

    .line 693
    .line 694
    .line 695
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    move-object v12, v1

    .line 700
    check-cast v12, Landroid/widget/ImageView;

    .line 701
    .line 702
    if-eqz v12, :cond_11

    .line 703
    .line 704
    const v0, 0x7f0a10e3

    .line 705
    .line 706
    .line 707
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    move-object v13, v1

    .line 712
    check-cast v13, Landroid/widget/TextView;

    .line 713
    .line 714
    if-eqz v13, :cond_11

    .line 715
    .line 716
    const v0, 0x7f0a1260

    .line 717
    .line 718
    .line 719
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    move-object v14, v1

    .line 724
    check-cast v14, Landroid/widget/TextView;

    .line 725
    .line 726
    if-eqz v14, :cond_11

    .line 727
    .line 728
    const v0, 0x7f0a1289

    .line 729
    .line 730
    .line 731
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    move-object v15, v1

    .line 736
    check-cast v15, Landroid/widget/TextView;

    .line 737
    .line 738
    if-eqz v15, :cond_11

    .line 739
    .line 740
    new-instance v8, La/jij0;

    .line 741
    .line 742
    invoke-direct/range {v8 .. v15}, La/jij0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/settoemezzo/combination/SettoeMezzoCombinationView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 743
    .line 744
    .line 745
    move-object v6, v8

    .line 746
    goto :goto_7

    .line 747
    :cond_11
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    :goto_7
    return-object v6

    .line 763
    :pswitch_c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 764
    .line 765
    new-instance v1, La/zzi0;

    .line 766
    .line 767
    check-cast v7, La/pzc;

    .line 768
    .line 769
    iget-object v2, v7, La/pzc;->a:La/jvn;

    .line 770
    .line 771
    invoke-direct {v1, v2}, La/zzi0;-><init>(La/jvn;)V

    .line 772
    .line 773
    .line 774
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 778
    .line 779
    return-object v0

    .line 780
    :pswitch_d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 781
    .line 782
    new-instance v1, La/fec;

    .line 783
    .line 784
    check-cast v7, La/dre;

    .line 785
    .line 786
    iget v2, v7, La/dre;->a:I

    .line 787
    .line 788
    invoke-direct {v1, v2}, La/fec;-><init>(I)V

    .line 789
    .line 790
    .line 791
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 795
    .line 796
    return-object v0

    .line 797
    :pswitch_e
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 798
    .line 799
    new-instance v1, La/gjh0;

    .line 800
    .line 801
    check-cast v7, La/ejh0;

    .line 802
    .line 803
    iget v2, v7, La/ejh0;->a:I

    .line 804
    .line 805
    invoke-direct {v1, v2}, La/gjh0;-><init>(I)V

    .line 806
    .line 807
    .line 808
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 812
    .line 813
    return-object v0

    .line 814
    :pswitch_f
    check-cast v0, La/ljh0;

    .line 815
    .line 816
    sget-object v1, La/ljh0;->m2:La/lme0;

    .line 817
    .line 818
    iget-object v1, v0, La/ljh0;->l2:La/phf0;

    .line 819
    .line 820
    sget-object v2, La/ljh0;->n2:[La/iiy;

    .line 821
    .line 822
    const/4 v4, 0x1

    .line 823
    aget-object v2, v2, v4

    .line 824
    .line 825
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    check-cast v7, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 830
    .line 831
    new-instance v2, Lkotlin/Pair;

    .line 832
    .line 833
    invoke-direct {v2, v3, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 848
    .line 849
    .line 850
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 851
    .line 852
    return-object v0

    .line 853
    :pswitch_10
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;

    .line 854
    .line 855
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;

    .line 867
    .line 868
    const v1, 0x7f0d06cb

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    if-eqz v0, :cond_12

    .line 876
    .line 877
    new-instance v6, La/pku0;

    .line 878
    .line 879
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 880
    .line 881
    invoke-direct {v6, v0}, La/pku0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 882
    .line 883
    .line 884
    goto :goto_8

    .line 885
    :cond_12
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    :goto_8
    return-object v6

    .line 889
    :pswitch_11
    check-cast v7, La/a8z;

    .line 890
    .line 891
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    check-cast v1, La/riu0;

    .line 896
    .line 897
    instance-of v2, v1, La/wmv;

    .line 898
    .line 899
    if-eqz v2, :cond_13

    .line 900
    .line 901
    move-object v6, v1

    .line 902
    check-cast v6, La/wmv;

    .line 903
    .line 904
    :cond_13
    if-eqz v6, :cond_14

    .line 905
    .line 906
    invoke-interface {v6}, La/wmv;->n()La/miu0;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    if-nez v1, :cond_15

    .line 911
    .line 912
    :cond_14
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 913
    .line 914
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    :cond_15
    return-object v1

    .line 919
    :pswitch_12
    check-cast v0, La/htg0;

    .line 920
    .line 921
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    check-cast v7, La/htg0;

    .line 933
    .line 934
    const v1, 0x7f0d06c8

    .line 935
    .line 936
    .line 937
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 942
    .line 943
    .line 944
    const v1, 0x7f0a0465

    .line 945
    .line 946
    .line 947
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    check-cast v2, Landroidx/appcompat/widget/AppCompatImageView;

    .line 952
    .line 953
    if-eqz v2, :cond_16

    .line 954
    .line 955
    const v1, 0x7f0a0cb8

    .line 956
    .line 957
    .line 958
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 959
    .line 960
    .line 961
    move-result-object v3

    .line 962
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageView;

    .line 963
    .line 964
    if-eqz v3, :cond_16

    .line 965
    .line 966
    new-instance v6, La/nku0;

    .line 967
    .line 968
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 969
    .line 970
    invoke-direct {v6, v0, v2, v3}, La/nku0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)V

    .line 971
    .line 972
    .line 973
    goto :goto_9

    .line 974
    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    :goto_9
    return-object v6

    .line 990
    :pswitch_13
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;

    .line 991
    .line 992
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;

    .line 1004
    .line 1005
    const v1, 0x7f0d05db

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1009
    .line 1010
    .line 1011
    const v0, 0x7f0a0c55

    .line 1012
    .line 1013
    .line 1014
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    check-cast v1, Landroid/widget/ImageView;

    .line 1019
    .line 1020
    if-eqz v1, :cond_17

    .line 1021
    .line 1022
    const v0, 0x7f0a0c56

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    check-cast v1, Landroid/widget/ImageView;

    .line 1030
    .line 1031
    if-eqz v1, :cond_17

    .line 1032
    .line 1033
    const v0, 0x7f0a0c57

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    check-cast v1, Landroid/widget/ImageView;

    .line 1041
    .line 1042
    if-eqz v1, :cond_17

    .line 1043
    .line 1044
    const v0, 0x7f0a0c58

    .line 1045
    .line 1046
    .line 1047
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v2

    .line 1051
    check-cast v2, Landroid/widget/TextView;

    .line 1052
    .line 1053
    if-eqz v2, :cond_17

    .line 1054
    .line 1055
    new-instance v6, La/q7o0;

    .line 1056
    .line 1057
    invoke-direct {v6, v7, v1, v2}, La/q7o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/roulette/gamefield/RouletteView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 1058
    .line 1059
    .line 1060
    goto :goto_a

    .line 1061
    :cond_17
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1074
    .line 1075
    .line 1076
    :goto_a
    return-object v6

    .line 1077
    :pswitch_14
    check-cast v7, La/a8z;

    .line 1078
    .line 1079
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    check-cast v1, La/riu0;

    .line 1084
    .line 1085
    instance-of v2, v1, La/wmv;

    .line 1086
    .line 1087
    if-eqz v2, :cond_18

    .line 1088
    .line 1089
    move-object v6, v1

    .line 1090
    check-cast v6, La/wmv;

    .line 1091
    .line 1092
    :cond_18
    if-eqz v6, :cond_19

    .line 1093
    .line 1094
    invoke-interface {v6}, La/wmv;->n()La/miu0;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    if-nez v1, :cond_1a

    .line 1099
    .line 1100
    :cond_19
    check-cast v0, La/ayf0;

    .line 1101
    .line 1102
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    :cond_1a
    return-object v1

    .line 1107
    :pswitch_15
    check-cast v7, La/a8z;

    .line 1108
    .line 1109
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    check-cast v1, La/riu0;

    .line 1114
    .line 1115
    instance-of v2, v1, La/wmv;

    .line 1116
    .line 1117
    if-eqz v2, :cond_1b

    .line 1118
    .line 1119
    move-object v6, v1

    .line 1120
    check-cast v6, La/wmv;

    .line 1121
    .line 1122
    :cond_1b
    if-eqz v6, :cond_1c

    .line 1123
    .line 1124
    invoke-interface {v6}, La/wmv;->n()La/miu0;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    if-nez v1, :cond_1d

    .line 1129
    .line 1130
    :cond_1c
    check-cast v0, La/hxf0;

    .line 1131
    .line 1132
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    :cond_1d
    return-object v1

    .line 1137
    :pswitch_16
    check-cast v0, Lorg/xplatform/resident/presentation/views/ResidentTagView;

    .line 1138
    .line 1139
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    check-cast v7, Lorg/xplatform/resident/presentation/views/ResidentTagView;

    .line 1151
    .line 1152
    const v1, 0x7f0d06c5

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1160
    .line 1161
    .line 1162
    const v1, 0x7f0a06cd

    .line 1163
    .line 1164
    .line 1165
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v2

    .line 1169
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1170
    .line 1171
    if-eqz v2, :cond_1e

    .line 1172
    .line 1173
    const v1, 0x7f0a06ce

    .line 1174
    .line 1175
    .line 1176
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v2

    .line 1180
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1181
    .line 1182
    if-eqz v2, :cond_1e

    .line 1183
    .line 1184
    const v1, 0x7f0a06cf

    .line 1185
    .line 1186
    .line 1187
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1192
    .line 1193
    if-eqz v2, :cond_1e

    .line 1194
    .line 1195
    const v1, 0x7f0a06d0

    .line 1196
    .line 1197
    .line 1198
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1203
    .line 1204
    if-eqz v2, :cond_1e

    .line 1205
    .line 1206
    const v1, 0x7f0a08c6

    .line 1207
    .line 1208
    .line 1209
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v2

    .line 1213
    check-cast v2, Landroid/widget/ImageView;

    .line 1214
    .line 1215
    if-eqz v2, :cond_1e

    .line 1216
    .line 1217
    const v1, 0x7f0a11ce

    .line 1218
    .line 1219
    .line 1220
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v2

    .line 1224
    check-cast v2, Landroid/widget/TextView;

    .line 1225
    .line 1226
    if-eqz v2, :cond_1e

    .line 1227
    .line 1228
    new-instance v6, La/mku0;

    .line 1229
    .line 1230
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1231
    .line 1232
    invoke-direct {v6, v0, v2}, La/mku0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V

    .line 1233
    .line 1234
    .line 1235
    goto :goto_b

    .line 1236
    :cond_1e
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    :goto_b
    return-object v6

    .line 1252
    :pswitch_17
    check-cast v0, La/srf0;

    .line 1253
    .line 1254
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1263
    .line 1264
    .line 1265
    check-cast v7, La/srf0;

    .line 1266
    .line 1267
    const v1, 0x7f0d06c4

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1275
    .line 1276
    .line 1277
    const v1, 0x7f0a089c

    .line 1278
    .line 1279
    .line 1280
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v2

    .line 1284
    check-cast v2, Landroid/widget/ImageView;

    .line 1285
    .line 1286
    if-eqz v2, :cond_1f

    .line 1287
    .line 1288
    const v1, 0x7f0a11ef

    .line 1289
    .line 1290
    .line 1291
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v3

    .line 1295
    check-cast v3, Landroid/widget/TextView;

    .line 1296
    .line 1297
    if-eqz v3, :cond_1f

    .line 1298
    .line 1299
    new-instance v6, La/lku0;

    .line 1300
    .line 1301
    check-cast v0, Landroid/widget/FrameLayout;

    .line 1302
    .line 1303
    invoke-direct {v6, v0, v2, v3}, La/lku0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 1304
    .line 1305
    .line 1306
    goto :goto_c

    .line 1307
    :cond_1f
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1320
    .line 1321
    .line 1322
    :goto_c
    return-object v6

    .line 1323
    :pswitch_18
    check-cast v0, Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 1324
    .line 1325
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1334
    .line 1335
    .line 1336
    check-cast v7, Lorg/xplatform/resident/presentation/views/ResidentPersonView;

    .line 1337
    .line 1338
    const v1, 0x7f0d06c3

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v0

    .line 1345
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1346
    .line 1347
    .line 1348
    const v1, 0x7f0a06a7

    .line 1349
    .line 1350
    .line 1351
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v2

    .line 1355
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1356
    .line 1357
    if-eqz v2, :cond_20

    .line 1358
    .line 1359
    const v1, 0x7f0a06a8

    .line 1360
    .line 1361
    .line 1362
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1367
    .line 1368
    if-eqz v2, :cond_20

    .line 1369
    .line 1370
    const v1, 0x7f0a0839

    .line 1371
    .line 1372
    .line 1373
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    check-cast v2, Landroid/widget/ImageView;

    .line 1378
    .line 1379
    if-eqz v2, :cond_20

    .line 1380
    .line 1381
    const v1, 0x7f0a0887

    .line 1382
    .line 1383
    .line 1384
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v3

    .line 1388
    check-cast v3, Landroid/widget/ImageView;

    .line 1389
    .line 1390
    if-eqz v3, :cond_20

    .line 1391
    .line 1392
    new-instance v6, La/kku0;

    .line 1393
    .line 1394
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1395
    .line 1396
    invoke-direct {v6, v0, v2, v3}, La/kku0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 1397
    .line 1398
    .line 1399
    goto :goto_d

    .line 1400
    :cond_20
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1413
    .line 1414
    .line 1415
    :goto_d
    return-object v6

    .line 1416
    :pswitch_19
    check-cast v0, La/mof0;

    .line 1417
    .line 1418
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    check-cast v7, La/mof0;

    .line 1430
    .line 1431
    const v1, 0x7f0d06c2

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v0, v1, v7, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1439
    .line 1440
    .line 1441
    move-object v1, v0

    .line 1442
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1443
    .line 1444
    const v2, 0x7f0a06bb

    .line 1445
    .line 1446
    .line 1447
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v3

    .line 1451
    check-cast v3, Landroidx/constraintlayout/widget/Guideline;

    .line 1452
    .line 1453
    if-eqz v3, :cond_21

    .line 1454
    .line 1455
    const v2, 0x7f0a06bc

    .line 1456
    .line 1457
    .line 1458
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    check-cast v3, Landroidx/constraintlayout/widget/Guideline;

    .line 1463
    .line 1464
    if-eqz v3, :cond_21

    .line 1465
    .line 1466
    const v2, 0x7f0a06c1

    .line 1467
    .line 1468
    .line 1469
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v3

    .line 1473
    check-cast v3, Landroidx/constraintlayout/widget/Guideline;

    .line 1474
    .line 1475
    if-eqz v3, :cond_21

    .line 1476
    .line 1477
    const v2, 0x7f0a07f9

    .line 1478
    .line 1479
    .line 1480
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v3

    .line 1484
    check-cast v3, Landroid/widget/ImageView;

    .line 1485
    .line 1486
    if-eqz v3, :cond_21

    .line 1487
    .line 1488
    const v2, 0x7f0a082d

    .line 1489
    .line 1490
    .line 1491
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v4

    .line 1495
    check-cast v4, Landroid/widget/ImageView;

    .line 1496
    .line 1497
    if-eqz v4, :cond_21

    .line 1498
    .line 1499
    new-instance v6, La/jku0;

    .line 1500
    .line 1501
    invoke-direct {v6, v1, v3, v4}, La/jku0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 1502
    .line 1503
    .line 1504
    goto :goto_e

    .line 1505
    :cond_21
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v0

    .line 1513
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v0

    .line 1517
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1518
    .line 1519
    .line 1520
    :goto_e
    return-object v6

    .line 1521
    :pswitch_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1522
    .line 1523
    new-instance v1, La/egf0;

    .line 1524
    .line 1525
    check-cast v7, La/tsd;

    .line 1526
    .line 1527
    iget-object v2, v7, La/tsd;->a:Ljava/lang/String;

    .line 1528
    .line 1529
    invoke-direct {v1, v2}, La/egf0;-><init>(Ljava/lang/String;)V

    .line 1530
    .line 1531
    .line 1532
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1536
    .line 1537
    return-object v0

    .line 1538
    :pswitch_1b
    check-cast v0, Lorg/xplatform/related/api/presentation/RelatedContainerView;

    .line 1539
    .line 1540
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v0

    .line 1548
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1549
    .line 1550
    .line 1551
    move-object v9, v7

    .line 1552
    check-cast v9, Lorg/xplatform/related/api/presentation/RelatedContainerView;

    .line 1553
    .line 1554
    const v1, 0x7f0d06bd

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v0, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1558
    .line 1559
    .line 1560
    const v0, 0x7f0a09b7

    .line 1561
    .line 1562
    .line 1563
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    check-cast v1, Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 1568
    .line 1569
    if-eqz v1, :cond_22

    .line 1570
    .line 1571
    const v0, 0x7f0a0c12

    .line 1572
    .line 1573
    .line 1574
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v1

    .line 1578
    move-object v10, v1

    .line 1579
    check-cast v10, Landroidx/compose/ui/platform/ComposeView;

    .line 1580
    .line 1581
    if-eqz v10, :cond_22

    .line 1582
    .line 1583
    const v0, 0x7f0a0c13

    .line 1584
    .line 1585
    .line 1586
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v1

    .line 1590
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1591
    .line 1592
    if-eqz v1, :cond_22

    .line 1593
    .line 1594
    const v0, 0x7f0a0fca

    .line 1595
    .line 1596
    .line 1597
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v1

    .line 1601
    move-object v11, v1

    .line 1602
    check-cast v11, Landroidx/constraintlayout/widget/Group;

    .line 1603
    .line 1604
    if-eqz v11, :cond_22

    .line 1605
    .line 1606
    const v0, 0x7f0a117a

    .line 1607
    .line 1608
    .line 1609
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v1

    .line 1613
    move-object v12, v1

    .line 1614
    check-cast v12, Landroid/widget/TextView;

    .line 1615
    .line 1616
    if-eqz v12, :cond_22

    .line 1617
    .line 1618
    const v0, 0x7f0a125b

    .line 1619
    .line 1620
    .line 1621
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v1

    .line 1625
    move-object v13, v1

    .line 1626
    check-cast v13, Landroid/widget/TextView;

    .line 1627
    .line 1628
    if-eqz v13, :cond_22

    .line 1629
    .line 1630
    const v0, 0x7f0a125f

    .line 1631
    .line 1632
    .line 1633
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v1

    .line 1637
    check-cast v1, Landroid/widget/TextView;

    .line 1638
    .line 1639
    if-eqz v1, :cond_22

    .line 1640
    .line 1641
    new-instance v8, La/hku0;

    .line 1642
    .line 1643
    invoke-direct/range {v8 .. v13}, La/hku0;-><init>(Lorg/xplatform/related/api/presentation/RelatedContainerView;Landroidx/compose/ui/platform/ComposeView;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1644
    .line 1645
    .line 1646
    move-object v6, v8

    .line 1647
    goto :goto_f

    .line 1648
    :cond_22
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v1

    .line 1652
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1661
    .line 1662
    .line 1663
    :goto_f
    return-object v6

    .line 1664
    :pswitch_1c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1665
    .line 1666
    check-cast v7, La/d8f0;

    .line 1667
    .line 1668
    iget-object v1, v7, La/d8f0;->a:La/q7f0;

    .line 1669
    .line 1670
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1674
    .line 1675
    return-object v0

    .line 1676
    nop

    .line 1677
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
