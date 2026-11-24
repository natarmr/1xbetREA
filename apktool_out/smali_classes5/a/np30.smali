.class public final synthetic La/np30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/np30;->a:B

    iput-object p1, p0, La/np30;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/np30;->a:B

    .line 2
    .line 3
    const-string v1, "viewModelFactory"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, La/np30;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/du50;

    .line 14
    .line 15
    sget-object v0, La/du50;->P1:La/htz;

    .line 16
    .line 17
    iget-object p0, p0, La/du50;->M1:La/fiu0;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v4

    .line 26
    :pswitch_0
    check-cast p0, La/ut50;

    .line 27
    .line 28
    iget-boolean v0, p0, La/ut50;->c:Z

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, La/ut50;->k:La/pru;

    .line 33
    .line 34
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-boolean p0, p0, La/sff0;->O0:Z

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    move v2, v3

    .line 43
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p0, La/gt50;

    .line 49
    .line 50
    iget-boolean v0, p0, La/gt50;->p:Z

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    iget-object p0, p0, La/gt50;->x:La/pru;

    .line 55
    .line 56
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iget-boolean p0, p0, La/sff0;->O0:Z

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    move v2, v3

    .line 65
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_2
    check-cast p0, La/qr50;

    .line 71
    .line 72
    iget-boolean v0, p0, La/qr50;->p:Z

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    iget-object p0, p0, La/qr50;->w:La/pru;

    .line 77
    .line 78
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget-boolean p0, p0, La/sff0;->O0:Z

    .line 83
    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    move v2, v3

    .line 87
    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_3
    check-cast p0, La/sq50;

    .line 93
    .line 94
    iget-object p0, p0, La/sq50;->r:La/pru;

    .line 95
    .line 96
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-boolean p0, p0, La/sff0;->O0:Z

    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_4
    check-cast p0, La/xp50;

    .line 108
    .line 109
    iget-boolean v0, p0, La/xp50;->p:Z

    .line 110
    .line 111
    if-nez v0, :cond_4

    .line 112
    .line 113
    iget-object p0, p0, La/xp50;->x:La/pru;

    .line 114
    .line 115
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-boolean p0, p0, La/sff0;->O0:Z

    .line 120
    .line 121
    if-eqz p0, :cond_4

    .line 122
    .line 123
    move v2, v3

    .line 124
    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :pswitch_5
    check-cast p0, La/ip50;

    .line 130
    .line 131
    iget-boolean v0, p0, La/ip50;->p:Z

    .line 132
    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    iget-object p0, p0, La/ip50;->x:La/pru;

    .line 136
    .line 137
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    iget-boolean p0, p0, La/sff0;->O0:Z

    .line 142
    .line 143
    if-eqz p0, :cond_5

    .line 144
    .line 145
    move v2, v3

    .line 146
    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_6
    check-cast p0, La/in50;

    .line 152
    .line 153
    sget-object v0, La/in50;->R1:La/atz;

    .line 154
    .line 155
    iget-object p0, p0, La/in50;->P1:La/fiu0;

    .line 156
    .line 157
    if-eqz p0, :cond_6

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v4

    .line 164
    :pswitch_7
    check-cast p0, La/zpu;

    .line 165
    .line 166
    iget-object p0, p0, La/zpu;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, La/gii0;

    .line 169
    .line 170
    const-class v0, La/sn50;

    .line 171
    .line 172
    sget-object v1, La/sre0;->a:La/tre0;

    .line 173
    .line 174
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, La/sn50;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_8
    check-cast p0, La/gbe0;

    .line 186
    .line 187
    iget-object p0, p0, La/gbe0;->a:La/dbe0;

    .line 188
    .line 189
    iget-object p0, p0, La/dbe0;->e:La/n0o0;

    .line 190
    .line 191
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, La/bbe0;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_9
    check-cast p0, La/ek50;

    .line 199
    .line 200
    invoke-virtual {p0}, La/ek50;->Z0()La/vne;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0

    .line 205
    :pswitch_a
    check-cast p0, La/yj50;

    .line 206
    .line 207
    iget-object p0, p0, La/yj50;->d:La/vne;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_b
    check-cast p0, La/fj50;

    .line 211
    .line 212
    iget-object p0, p0, La/fj50;->f2:La/fiu0;

    .line 213
    .line 214
    if-eqz p0, :cond_7

    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v4

    .line 221
    :pswitch_c
    check-cast p0, La/jx40;

    .line 222
    .line 223
    iget-object p0, p0, La/jx40;->b:La/gr00;

    .line 224
    .line 225
    iget-object p0, p0, La/gr00;->a:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p0, La/zz2;

    .line 228
    .line 229
    iget-object p0, p0, La/zz2;->b:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p0, La/akq;

    .line 232
    .line 233
    invoke-virtual {p0}, La/akq;->b()Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, La/wh80;

    .line 242
    .line 243
    if-eqz p0, :cond_8

    .line 244
    .line 245
    instance-of v0, p0, La/rh80;

    .line 246
    .line 247
    if-eqz v0, :cond_8

    .line 248
    .line 249
    check-cast p0, La/rh80;

    .line 250
    .line 251
    iget-object v0, p0, La/rh80;->a:La/gp00;

    .line 252
    .line 253
    sget-object v1, La/gp00;->a:La/gp00;

    .line 254
    .line 255
    if-ne v0, v1, :cond_8

    .line 256
    .line 257
    move-object v4, p0

    .line 258
    :cond_8
    return-object v4

    .line 259
    :pswitch_d
    check-cast p0, La/nwk;

    .line 260
    .line 261
    invoke-interface {p0}, La/nwk;->a()V

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_e
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/MultiLineChipsListView;

    .line 268
    .line 269
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/MultiLineChipsListView;->x:I

    .line 270
    .line 271
    new-instance v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    const/4 v3, 0x6

    .line 281
    invoke-direct {v0, v1, v4, v3}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 282
    .line 283
    .line 284
    new-instance v1, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;

    .line 285
    .line 286
    const/4 v3, -0x1

    .line 287
    const/4 v4, -0x2

    .line 288
    invoke-direct {v1, v3, v4}, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;-><init>(II)V

    .line 289
    .line 290
    .line 291
    iget p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/MultiLineChipsListView;->v:I

    .line 292
    .line 293
    invoke-virtual {v1, v2, p0, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    .line 298
    .line 299
    const-string p0, "ds_header_multi_line_tag"

    .line 300
    .line 301
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/header/DsHeader;->setTag(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    sget-object p0, La/vrv;->b:La/vrv;

    .line 305
    .line 306
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/header/DsHeader;->setType(La/vrv;)V

    .line 307
    .line 308
    .line 309
    new-instance v1, La/nrv;

    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    const v2, 0x7f130fd9

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    const/4 v8, 0x0

    .line 326
    const/16 v9, 0xfe

    .line 327
    .line 328
    const/4 v3, 0x0

    .line 329
    const/4 v4, 0x0

    .line 330
    const/4 v5, 0x0

    .line 331
    const/4 v6, 0x0

    .line 332
    const/4 v7, 0x0

    .line 333
    invoke-direct/range {v1 .. v9}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 337
    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_f
    move-object v0, p0

    .line 341
    check-cast v0, La/ip40;

    .line 342
    .line 343
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 344
    .line 345
    iget-object v1, p0, La/ocj;->a:La/p7m0;

    .line 346
    .line 347
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    iget-object v2, v0, La/i3t0;->f:La/oyg0;

    .line 355
    .line 356
    move-object v3, p0

    .line 357
    check-cast v3, La/gp40;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    const/4 v11, 0x0

    .line 363
    const/16 v12, 0x1fb

    .line 364
    .line 365
    const/4 v4, 0x0

    .line 366
    const/4 v5, 0x0

    .line 367
    const/4 v6, 0x0

    .line 368
    const/4 v7, 0x0

    .line 369
    const/4 v8, 0x0

    .line 370
    const-wide/16 v9, 0x0

    .line 371
    .line 372
    invoke-static/range {v3 .. v12}, La/gp40;->a(La/gp40;La/pcq;ZLjava/lang/String;IIJZI)La/gp40;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result p0

    .line 380
    if-eqz p0, :cond_9

    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_10
    check-cast p0, La/e1u;

    .line 386
    .line 387
    new-instance v0, La/hn40;

    .line 388
    .line 389
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast p0, La/gn40;

    .line 392
    .line 393
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    sget-object p0, La/njt;->a:Ljava/util/List;

    .line 397
    .line 398
    new-instance v1, Ljava/util/ArrayList;

    .line 399
    .line 400
    const/16 v2, 0xa

    .line 401
    .line 402
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 407
    .line 408
    .line 409
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-eqz v3, :cond_a

    .line 418
    .line 419
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    check-cast v3, La/ojt;

    .line 424
    .line 425
    new-instance v4, La/cn40;

    .line 426
    .line 427
    iget-object v5, v3, La/ojt;->a:Ljava/lang/String;

    .line 428
    .line 429
    iget-object v6, v3, La/ojt;->b:Ljava/lang/String;

    .line 430
    .line 431
    iget-boolean v3, v3, La/ojt;->c:Z

    .line 432
    .line 433
    invoke-direct {v4, v5, v6, v3}, La/cn40;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_0

    .line 440
    :cond_a
    new-instance p0, Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    if-eqz v2, :cond_b

    .line 458
    .line 459
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    check-cast v2, La/cn40;

    .line 464
    .line 465
    new-instance v3, La/fn40;

    .line 466
    .line 467
    iget-object v4, v2, La/cn40;->a:Ljava/lang/String;

    .line 468
    .line 469
    iget-object v5, v2, La/cn40;->b:Ljava/lang/String;

    .line 470
    .line 471
    iget-boolean v2, v2, La/cn40;->c:Z

    .line 472
    .line 473
    invoke-direct {v3, v4, v5, v2}, La/fn40;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    goto :goto_1

    .line 480
    :cond_b
    invoke-direct {v0, p0}, La/hn40;-><init>(Ljava/util/ArrayList;)V

    .line 481
    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_11
    check-cast p0, La/en40;

    .line 485
    .line 486
    sget-object v0, La/en40;->N1:La/wsz;

    .line 487
    .line 488
    iget-object p0, p0, La/en40;->L1:La/fiu0;

    .line 489
    .line 490
    if-eqz p0, :cond_c

    .line 491
    .line 492
    return-object p0

    .line 493
    :cond_c
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    throw v4

    .line 497
    :pswitch_12
    check-cast p0, La/qm40;

    .line 498
    .line 499
    iput-boolean v2, p0, La/qm40;->f:Z

    .line 500
    .line 501
    new-instance v0, Ljava/util/HashSet;

    .line 502
    .line 503
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 504
    .line 505
    .line 506
    iget-object v1, p0, La/qm40;->d:La/vy40;

    .line 507
    .line 508
    if-eqz v1, :cond_10

    .line 509
    .line 510
    iget-object v3, v1, La/vy40;->a:[Ljava/lang/Object;

    .line 511
    .line 512
    iget v4, v1, La/vy40;->b:I

    .line 513
    .line 514
    move v5, v2

    .line 515
    :goto_2
    if-ge v5, v4, :cond_f

    .line 516
    .line 517
    aget-object v6, v3, v5

    .line 518
    .line 519
    check-cast v6, La/e7z;

    .line 520
    .line 521
    iget-object v7, p0, La/qm40;->e:La/vy40;

    .line 522
    .line 523
    if-nez v7, :cond_d

    .line 524
    .line 525
    new-instance v7, La/vy40;

    .line 526
    .line 527
    invoke-direct {v7}, La/vy40;-><init>()V

    .line 528
    .line 529
    .line 530
    iput-object v7, p0, La/qm40;->e:La/vy40;

    .line 531
    .line 532
    :cond_d
    invoke-virtual {v7, v5}, La/vy40;->g(I)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    check-cast v7, La/i5d0;

    .line 537
    .line 538
    iget-object v6, v6, La/e7z;->h1:La/tzi;

    .line 539
    .line 540
    iget-object v6, v6, La/tzi;->g:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v6, La/lm40;

    .line 543
    .line 544
    iget-boolean v8, v6, La/lm40;->n:Z

    .line 545
    .line 546
    if-eqz v8, :cond_e

    .line 547
    .line 548
    invoke-static {v6, v7}, La/qm40;->b(La/lm40;La/i5d0;)V

    .line 549
    .line 550
    .line 551
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 552
    .line 553
    goto :goto_2

    .line 554
    :cond_f
    invoke-virtual {v1}, La/vy40;->d()V

    .line 555
    .line 556
    .line 557
    iget-object v1, p0, La/qm40;->e:La/vy40;

    .line 558
    .line 559
    if-eqz v1, :cond_10

    .line 560
    .line 561
    invoke-virtual {v1}, La/vy40;->d()V

    .line 562
    .line 563
    .line 564
    :cond_10
    iget-object v1, p0, La/qm40;->b:La/vy40;

    .line 565
    .line 566
    if-eqz v1, :cond_14

    .line 567
    .line 568
    iget-object v3, v1, La/vy40;->a:[Ljava/lang/Object;

    .line 569
    .line 570
    iget v4, v1, La/vy40;->b:I

    .line 571
    .line 572
    :goto_3
    if-ge v2, v4, :cond_13

    .line 573
    .line 574
    aget-object v5, v3, v2

    .line 575
    .line 576
    check-cast v5, La/df5;

    .line 577
    .line 578
    iget-object v6, p0, La/qm40;->c:La/vy40;

    .line 579
    .line 580
    if-nez v6, :cond_11

    .line 581
    .line 582
    new-instance v6, La/vy40;

    .line 583
    .line 584
    invoke-direct {v6}, La/vy40;-><init>()V

    .line 585
    .line 586
    .line 587
    iput-object v6, p0, La/qm40;->c:La/vy40;

    .line 588
    .line 589
    :cond_11
    invoke-virtual {v6, v2}, La/vy40;->g(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v6

    .line 593
    check-cast v6, La/i5d0;

    .line 594
    .line 595
    iget-boolean v7, v5, La/lm40;->n:Z

    .line 596
    .line 597
    if-eqz v7, :cond_12

    .line 598
    .line 599
    invoke-static {v5, v6}, La/qm40;->b(La/lm40;La/i5d0;)V

    .line 600
    .line 601
    .line 602
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 603
    .line 604
    goto :goto_3

    .line 605
    :cond_13
    invoke-virtual {v1}, La/vy40;->d()V

    .line 606
    .line 607
    .line 608
    iget-object p0, p0, La/qm40;->c:La/vy40;

    .line 609
    .line 610
    if-eqz p0, :cond_14

    .line 611
    .line 612
    invoke-virtual {p0}, La/vy40;->d()V

    .line 613
    .line 614
    .line 615
    :cond_14
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 616
    .line 617
    .line 618
    move-result-object p0

    .line 619
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_15

    .line 624
    .line 625
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    check-cast v0, La/df5;

    .line 630
    .line 631
    invoke-virtual {v0}, La/df5;->b1()V

    .line 632
    .line 633
    .line 634
    goto :goto_4

    .line 635
    :cond_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 636
    .line 637
    return-object p0

    .line 638
    :pswitch_13
    check-cast p0, La/wl40;

    .line 639
    .line 640
    iget-object p0, p0, La/wl40;->e:Lkotlin/jvm/functions/Function0;

    .line 641
    .line 642
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 646
    .line 647
    return-object p0

    .line 648
    :pswitch_14
    check-cast p0, La/ql40;

    .line 649
    .line 650
    iget-object p0, p0, La/ql40;->i:La/p7m0;

    .line 651
    .line 652
    sget-object v0, La/i8d;->c:La/i8d;

    .line 653
    .line 654
    invoke-virtual {p0, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 658
    .line 659
    return-object p0

    .line 660
    :pswitch_15
    check-cast p0, La/ai40;

    .line 661
    .line 662
    new-instance v0, La/q0h0;

    .line 663
    .line 664
    iget-object p0, p0, La/ai40;->L1:La/tli;

    .line 665
    .line 666
    if-eqz p0, :cond_16

    .line 667
    .line 668
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 669
    .line 670
    .line 671
    return-object v0

    .line 672
    :cond_16
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    throw v4

    .line 676
    :pswitch_16
    check-cast p0, La/wf40;

    .line 677
    .line 678
    iget-object v0, p0, La/wf40;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 679
    .line 680
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->clearFocus()V

    .line 681
    .line 682
    .line 683
    iget-object p0, p0, La/wf40;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 684
    .line 685
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->c()V

    .line 686
    .line 687
    .line 688
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 689
    .line 690
    return-object p0

    .line 691
    :pswitch_17
    check-cast p0, La/aa40;

    .line 692
    .line 693
    new-instance v0, Ljava/lang/StringBuilder;

    .line 694
    .line 695
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 696
    .line 697
    .line 698
    iget-object v1, p0, La/aa40;->a:La/lvu0;

    .line 699
    .line 700
    iget-object v2, v1, La/lvu0;->b:Ljava/lang/String;

    .line 701
    .line 702
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    const-string v2, ""

    .line 709
    .line 710
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    if-nez v4, :cond_17

    .line 715
    .line 716
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    sub-int/2addr v4, v3

    .line 721
    const/16 v5, 0x3a

    .line 722
    .line 723
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 727
    .line 728
    .line 729
    move-result v4

    .line 730
    sub-int/2addr v4, v3

    .line 731
    invoke-virtual {v0, v4, v2}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    const-string v2, "supp/external"

    .line 735
    .line 736
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    :cond_17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    new-instance v3, La/guc;

    .line 744
    .line 745
    iget-object v4, p0, La/aa40;->i:La/jw20;

    .line 746
    .line 747
    iget-object v5, p0, La/aa40;->b:Lokhttp3/OkHttpClient;

    .line 748
    .line 749
    iget-object p0, v1, La/lvu0;->a:La/kwf0;

    .line 750
    .line 751
    iget-object v7, p0, La/kwf0;->a:Ljava/lang/String;

    .line 752
    .line 753
    iget-object v8, p0, La/kwf0;->b:Ljava/lang/String;

    .line 754
    .line 755
    iget-object v9, v1, La/lvu0;->b:Ljava/lang/String;

    .line 756
    .line 757
    invoke-direct/range {v3 .. v9}, La/guc;-><init>(La/jw20;Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    return-object v3

    .line 761
    :pswitch_18
    check-cast p0, La/zn00;

    .line 762
    .line 763
    iget-object p0, p0, La/zn00;->a:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast p0, La/gii0;

    .line 766
    .line 767
    const-class v0, La/gr30;

    .line 768
    .line 769
    sget-object v1, La/sre0;->a:La/tre0;

    .line 770
    .line 771
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object p0

    .line 779
    check-cast p0, La/gr30;

    .line 780
    .line 781
    return-object p0

    .line 782
    :pswitch_19
    check-cast p0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 783
    .line 784
    iput-boolean v3, p0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->d:Z

    .line 785
    .line 786
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 787
    .line 788
    return-object p0

    .line 789
    :pswitch_1a
    check-cast p0, La/sr30;

    .line 790
    .line 791
    sget-object v0, La/sr30;->P1:[La/iiy;

    .line 792
    .line 793
    iget-object p0, p0, La/sr30;->L1:La/fiu0;

    .line 794
    .line 795
    if-eqz p0, :cond_18

    .line 796
    .line 797
    return-object p0

    .line 798
    :cond_18
    const-string p0, "memoryViewModelFactory"

    .line 799
    .line 800
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    throw v4

    .line 804
    :pswitch_1b
    check-cast p0, La/ir30;

    .line 805
    .line 806
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    iget-object p0, p0, La/ir30;->a:La/lne;

    .line 811
    .line 812
    invoke-static {v0, p0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 817
    .line 818
    .line 819
    move-result-object p0

    .line 820
    return-object p0

    .line 821
    :pswitch_1c
    check-cast p0, La/op30;

    .line 822
    .line 823
    iget-object p0, p0, La/op30;->b:La/ctf0;

    .line 824
    .line 825
    invoke-static {p0}, La/kcx;->C(La/ctf0;)La/wul;

    .line 826
    .line 827
    .line 828
    move-result-object p0

    .line 829
    return-object p0

    .line 830
    nop

    .line 831
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
