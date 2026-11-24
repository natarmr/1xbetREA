.class public final synthetic La/nop0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/nop0;La/g0p0;)V
    .locals 0

    .line 1
    const/16 p2, 0xd

    iput-byte p2, p0, La/nop0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nop0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/nop0;->a:B

    iput-object p1, p0, La/nop0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nop0;->a:B

    .line 4
    .line 5
    const-string v2, "org.telegram.messenger"

    .line 6
    .line 7
    const v3, 0x7f131316

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    const/16 v5, 0x9

    .line 12
    .line 13
    const/16 v6, 0x16

    .line 14
    .line 15
    const/16 v7, 0x1d

    .line 16
    .line 17
    const/16 v8, 0x11

    .line 18
    .line 19
    const v9, 0x799532c4

    .line 20
    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    iget-object v0, v0, La/nop0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v0, La/jcr0;

    .line 31
    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    check-cast v1, La/hcz;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, La/jcr0;->b:La/a4x;

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    new-instance v4, La/adn0;

    .line 46
    .line 47
    invoke-direct {v4, v2, v7}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 48
    .line 49
    .line 50
    new-instance v5, La/xe4;

    .line 51
    .line 52
    invoke-direct {v5, v2, v0, v6}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v0, La/ugd;

    .line 56
    .line 57
    invoke-direct {v0, v9, v12, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3, v11, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    move-object v1, v0

    .line 67
    check-cast v1, La/ecr0;

    .line 68
    .line 69
    move-object/from16 v0, p1

    .line 70
    .line 71
    check-cast v0, Ljava/lang/Throwable;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 77
    .line 78
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 79
    .line 80
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 88
    .line 89
    move-object v4, v0

    .line 90
    check-cast v4, La/tbr0;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const/4 v11, 0x0

    .line 96
    const/16 v12, 0x67

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v9, 0x1

    .line 103
    const/4 v10, 0x0

    .line 104
    invoke-static/range {v4 .. v12}, La/tbr0;->a(La/tbr0;La/eme;La/hdm0;La/nc5;ZZZLa/jjy;I)La/tbr0;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_1
    check-cast v0, La/gar0;

    .line 118
    .line 119
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, La/hcz;

    .line 122
    .line 123
    sget-object v2, La/y9r0;->m2:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v2, v0, La/gar0;->a:La/a4x;

    .line 129
    .line 130
    new-instance v3, La/shq0;

    .line 131
    .line 132
    invoke-direct {v3, v8}, La/shq0;-><init>(B)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    new-instance v5, La/zcn0;

    .line 140
    .line 141
    const/16 v6, 0x13

    .line 142
    .line 143
    invoke-direct {v5, v3, v2, v6}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    new-instance v3, La/e0m0;

    .line 147
    .line 148
    const/4 v6, 0x4

    .line 149
    invoke-direct {v3, v2, v6}, La/e0m0;-><init>(La/a4x;B)V

    .line 150
    .line 151
    .line 152
    new-instance v6, La/xe4;

    .line 153
    .line 154
    const/16 v7, 0x15

    .line 155
    .line 156
    invoke-direct {v6, v2, v0, v7}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 157
    .line 158
    .line 159
    new-instance v0, La/ugd;

    .line 160
    .line 161
    invoke-direct {v0, v9, v12, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 165
    .line 166
    .line 167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_2
    check-cast v0, La/r6r0;

    .line 171
    .line 172
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, La/uid;

    .line 175
    .line 176
    sget-object v2, La/r6r0;->S1:La/s2m0;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, La/r6r0;->G0()La/k3t0;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    new-instance v2, La/y5r0;

    .line 186
    .line 187
    invoke-direct {v2, v1}, La/y5r0;-><init>(La/uid;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    check-cast v0, La/b5r0;

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/uid;

    .line 201
    .line 202
    sget-object v2, La/b5r0;->t2:La/j6m0;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, La/b5r0;->Q0()La/k3t0;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v2, La/n4r0;

    .line 212
    .line 213
    invoke-direct {v2, v1}, La/n4r0;-><init>(La/uid;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_4
    check-cast v0, La/z2r0;

    .line 223
    .line 224
    move-object/from16 v1, p1

    .line 225
    .line 226
    check-cast v1, Ljava/lang/Throwable;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    instance-of v2, v1, La/zhi0;

    .line 232
    .line 233
    if-eqz v2, :cond_1

    .line 234
    .line 235
    check-cast v1, La/zhi0;

    .line 236
    .line 237
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 238
    .line 239
    sget-object v2, La/i2o;->D2:La/i2o;

    .line 240
    .line 241
    if-ne v1, v2, :cond_1

    .line 242
    .line 243
    iget-object v0, v0, La/z2r0;->h:La/jc60;

    .line 244
    .line 245
    iget-object v0, v0, La/jc60;->a:La/gst0;

    .line 246
    .line 247
    invoke-virtual {v0, v10, v10}, La/gst0;->h(ZZ)V

    .line 248
    .line 249
    .line 250
    move v10, v12

    .line 251
    :cond_1
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    return-object v0

    .line 256
    :pswitch_5
    check-cast v0, La/nie0;

    .line 257
    .line 258
    move-object/from16 v1, p1

    .line 259
    .line 260
    check-cast v1, La/j6z;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iput-object v1, v0, La/nie0;->a:Ljava/lang/Object;

    .line 266
    .line 267
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_6
    check-cast v0, La/yqq0;

    .line 271
    .line 272
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, Ljava/lang/Throwable;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    iget-object v2, v0, La/yqq0;->g:La/duj;

    .line 280
    .line 281
    new-instance v3, La/l7p0;

    .line 282
    .line 283
    const/16 v4, 0x1c

    .line 284
    .line 285
    invoke-direct {v3, v0, v4}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 289
    .line 290
    .line 291
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_7
    check-cast v0, La/tpq0;

    .line 295
    .line 296
    move-object/from16 v1, p1

    .line 297
    .line 298
    check-cast v1, Ljava/lang/Throwable;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    iget-object v2, v0, La/tpq0;->d:La/duj;

    .line 304
    .line 305
    new-instance v3, La/l7p0;

    .line 306
    .line 307
    const/16 v4, 0x1b

    .line 308
    .line 309
    invoke-direct {v3, v0, v4}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 313
    .line 314
    .line 315
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_8
    check-cast v0, La/wmq0;

    .line 319
    .line 320
    move-object/from16 v1, p1

    .line 321
    .line 322
    check-cast v1, Ljava/lang/Throwable;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-object v2, v0, La/wmq0;->e:La/duj;

    .line 328
    .line 329
    new-instance v3, La/l7p0;

    .line 330
    .line 331
    const/16 v4, 0x1a

    .line 332
    .line 333
    invoke-direct {v3, v0, v4}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_9
    check-cast v0, La/fiq0;

    .line 343
    .line 344
    move-object/from16 v1, p1

    .line 345
    .line 346
    check-cast v1, Ljava/lang/Throwable;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object v0, v0, La/fiq0;->q:La/duj;

    .line 352
    .line 353
    new-instance v2, La/shq0;

    .line 354
    .line 355
    invoke-direct {v2, v12}, La/shq0;-><init>(B)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object v0

    .line 364
    :pswitch_a
    check-cast v0, La/zgq0;

    .line 365
    .line 366
    move-object/from16 v1, p1

    .line 367
    .line 368
    check-cast v1, La/ygq0;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object v0, v0, La/zgq0;->h:La/w6q0;

    .line 374
    .line 375
    invoke-virtual {v0, v1}, La/w6q0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_b
    check-cast v0, La/z6e;

    .line 382
    .line 383
    move-object/from16 v1, p1

    .line 384
    .line 385
    check-cast v1, La/cp;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 391
    .line 392
    check-cast v2, La/d3k;

    .line 393
    .line 394
    iget-object v3, v2, La/d3k;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 395
    .line 396
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    if-eqz v3, :cond_2

    .line 401
    .line 402
    iget-object v4, v1, La/cp;->w:Landroid/content/Context;

    .line 403
    .line 404
    const v5, 0x7f040afc

    .line 405
    .line 406
    .line 407
    invoke-static {v3, v4, v5}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 408
    .line 409
    .line 410
    :cond_2
    iget-object v2, v2, La/d3k;->b:Landroid/widget/ImageView;

    .line 411
    .line 412
    new-instance v3, La/pzp;

    .line 413
    .line 414
    const/4 v4, 0x6

    .line 415
    invoke-direct {v3, v1, v0, v4}, La/pzp;-><init>(La/cp;La/z6e;B)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 419
    .line 420
    .line 421
    new-instance v0, La/kzi0;

    .line 422
    .line 423
    const/16 v2, 0x12

    .line 424
    .line 425
    invoke-direct {v0, v1, v2}, La/kzi0;-><init>(La/cp;B)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 429
    .line 430
    .line 431
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_c
    check-cast v0, La/f9q0;

    .line 435
    .line 436
    move-object/from16 v1, p1

    .line 437
    .line 438
    check-cast v1, La/i83;

    .line 439
    .line 440
    iget-object v2, v1, La/i83;->a:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v2, La/f83;

    .line 443
    .line 444
    instance-of v3, v2, La/jb00;

    .line 445
    .line 446
    const/16 v4, 0xe

    .line 447
    .line 448
    if-eqz v3, :cond_3

    .line 449
    .line 450
    move-object v3, v2

    .line 451
    check-cast v3, La/jb00;

    .line 452
    .line 453
    iget-object v5, v3, La/jb00;->b:La/f9q0;

    .line 454
    .line 455
    if-nez v5, :cond_3

    .line 456
    .line 457
    iget-object v2, v3, La/jb00;->a:Ljava/lang/String;

    .line 458
    .line 459
    iget-object v3, v3, La/jb00;->c:La/sa4;

    .line 460
    .line 461
    new-instance v5, La/jb00;

    .line 462
    .line 463
    invoke-direct {v5, v2, v0, v3}, La/jb00;-><init>(Ljava/lang/String;La/f9q0;La/sa4;)V

    .line 464
    .line 465
    .line 466
    invoke-static {v1, v5, v10, v4}, La/i83;->a(La/i83;La/f83;II)La/i83;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    goto :goto_0

    .line 471
    :cond_3
    instance-of v3, v2, La/ib00;

    .line 472
    .line 473
    if-eqz v3, :cond_4

    .line 474
    .line 475
    check-cast v2, La/ib00;

    .line 476
    .line 477
    iget-object v3, v2, La/ib00;->b:La/f9q0;

    .line 478
    .line 479
    if-nez v3, :cond_4

    .line 480
    .line 481
    iget-object v3, v2, La/ib00;->a:Ljava/lang/String;

    .line 482
    .line 483
    iget-object v2, v2, La/ib00;->c:La/sa4;

    .line 484
    .line 485
    new-instance v5, La/ib00;

    .line 486
    .line 487
    invoke-direct {v5, v3, v0, v2}, La/ib00;-><init>(Ljava/lang/String;La/f9q0;La/sa4;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v1, v5, v10, v4}, La/i83;->a(La/i83;La/f83;II)La/i83;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    :cond_4
    :goto_0
    return-object v1

    .line 495
    :pswitch_d
    check-cast v0, La/hz;

    .line 496
    .line 497
    move-object/from16 v1, p1

    .line 498
    .line 499
    check-cast v1, La/cp;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 505
    .line 506
    check-cast v2, La/ifx;

    .line 507
    .line 508
    iget-object v2, v2, La/ifx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 509
    .line 510
    new-instance v3, La/da0;

    .line 511
    .line 512
    new-instance v4, La/b8q0;

    .line 513
    .line 514
    invoke-direct {v4, v0, v1, v10}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 515
    .line 516
    .line 517
    invoke-direct {v3, v4}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 521
    .line 522
    .line 523
    new-instance v0, La/pgj0;

    .line 524
    .line 525
    invoke-direct {v0, v1, v1, v8}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 529
    .line 530
    .line 531
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_e
    check-cast v0, La/d7q0;

    .line 535
    .line 536
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, Ljava/lang/Float;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    iget-object v2, v0, La/d7q0;->a:La/agk0;

    .line 545
    .line 546
    invoke-virtual {v2}, La/agk0;->l()F

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    add-float/2addr v3, v1

    .line 551
    iget-object v0, v0, La/d7q0;->b:La/agk0;

    .line 552
    .line 553
    invoke-virtual {v0}, La/agk0;->l()F

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    cmpl-float v4, v3, v4

    .line 558
    .line 559
    if-lez v4, :cond_5

    .line 560
    .line 561
    invoke-virtual {v0}, La/agk0;->l()F

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    invoke-virtual {v2}, La/agk0;->l()F

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    sub-float v1, v0, v1

    .line 570
    .line 571
    goto :goto_1

    .line 572
    :cond_5
    const/4 v0, 0x0

    .line 573
    cmpg-float v0, v3, v0

    .line 574
    .line 575
    if-gez v0, :cond_6

    .line 576
    .line 577
    invoke-virtual {v2}, La/agk0;->l()F

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    neg-float v1, v0

    .line 582
    :cond_6
    :goto_1
    invoke-virtual {v2}, La/agk0;->l()F

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    add-float/2addr v0, v1

    .line 587
    invoke-virtual {v2, v0}, La/agk0;->m(F)V

    .line 588
    .line 589
    .line 590
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    return-object v0

    .line 595
    :pswitch_f
    check-cast v0, La/nop0;

    .line 596
    .line 597
    move-object/from16 v1, p1

    .line 598
    .line 599
    check-cast v1, La/hps0;

    .line 600
    .line 601
    instance-of v2, v1, La/eu;

    .line 602
    .line 603
    if-eqz v2, :cond_7

    .line 604
    .line 605
    check-cast v1, La/eu;

    .line 606
    .line 607
    iget-object v1, v1, La/eu;->o:La/t1;

    .line 608
    .line 609
    invoke-virtual {v0, v1}, La/nop0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 613
    .line 614
    goto :goto_2

    .line 615
    :cond_7
    const-string v0, "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."

    .line 616
    .line 617
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    :goto_2
    return-object v11

    .line 621
    :pswitch_10
    check-cast v0, La/s4q0;

    .line 622
    .line 623
    move-object/from16 v1, p1

    .line 624
    .line 625
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 626
    .line 627
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object v0

    .line 633
    :pswitch_11
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 634
    .line 635
    move-object/from16 v1, p1

    .line 636
    .line 637
    check-cast v1, La/fhl;

    .line 638
    .line 639
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-interface {v1}, La/fhl;->d()J

    .line 648
    .line 649
    .line 650
    move-result-wide v3

    .line 651
    const/16 v5, 0x20

    .line 652
    .line 653
    shr-long/2addr v3, v5

    .line 654
    long-to-int v3, v3

    .line 655
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    float-to-int v3, v3

    .line 660
    invoke-interface {v1}, La/fhl;->d()J

    .line 661
    .line 662
    .line 663
    move-result-wide v4

    .line 664
    const-wide v6, 0xffffffffL

    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    and-long/2addr v4, v6

    .line 670
    long-to-int v1, v4

    .line 671
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    float-to-int v1, v1

    .line 676
    invoke-virtual {v0, v10, v10, v3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 677
    .line 678
    .line 679
    invoke-static {v2}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 684
    .line 685
    .line 686
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_12
    check-cast v0, La/x1q0;

    .line 690
    .line 691
    move-object/from16 v1, p1

    .line 692
    .line 693
    check-cast v1, Ljava/lang/Throwable;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 699
    .line 700
    .line 701
    iget-object v0, v0, La/x1q0;->c:La/rjo;

    .line 702
    .line 703
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 704
    .line 705
    .line 706
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    return-object v0

    .line 709
    :pswitch_13
    check-cast v0, La/r0q0;

    .line 710
    .line 711
    move-object/from16 v1, p1

    .line 712
    .line 713
    check-cast v1, La/hcz;

    .line 714
    .line 715
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    new-instance v2, La/gcn0;

    .line 719
    .line 720
    invoke-direct {v2, v0, v5}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 721
    .line 722
    .line 723
    new-instance v3, La/ugd;

    .line 724
    .line 725
    const v5, -0x77d8f892

    .line 726
    .line 727
    .line 728
    invoke-direct {v3, v5, v12, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    invoke-static {v1, v11, v11, v3, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 732
    .line 733
    .line 734
    sget-object v2, La/unh0;->e:La/ugd;

    .line 735
    .line 736
    invoke-static {v1, v11, v11, v2, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 737
    .line 738
    .line 739
    iget-object v0, v0, La/r0q0;->a:La/q0q0;

    .line 740
    .line 741
    iget-object v0, v0, La/q0q0;->b:La/a4x;

    .line 742
    .line 743
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    new-instance v3, La/adn0;

    .line 748
    .line 749
    const/16 v4, 0x18

    .line 750
    .line 751
    invoke-direct {v3, v0, v4}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 752
    .line 753
    .line 754
    new-instance v4, La/bzp0;

    .line 755
    .line 756
    invoke-direct {v4, v0, v12}, La/bzp0;-><init>(Ljava/util/List;B)V

    .line 757
    .line 758
    .line 759
    new-instance v0, La/ugd;

    .line 760
    .line 761
    invoke-direct {v0, v9, v12, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v1, v2, v11, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 765
    .line 766
    .line 767
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 768
    .line 769
    return-object v0

    .line 770
    :pswitch_14
    check-cast v0, La/nzp0;

    .line 771
    .line 772
    move-object/from16 v1, p1

    .line 773
    .line 774
    check-cast v1, Ljava/lang/Throwable;

    .line 775
    .line 776
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    iget-object v2, v0, La/nzp0;->r:La/duj;

    .line 780
    .line 781
    new-instance v3, La/l7p0;

    .line 782
    .line 783
    const/16 v4, 0xd

    .line 784
    .line 785
    invoke-direct {v3, v0, v4}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 789
    .line 790
    .line 791
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 792
    .line 793
    return-object v0

    .line 794
    :pswitch_15
    check-cast v0, La/lzp0;

    .line 795
    .line 796
    move-object/from16 v1, p1

    .line 797
    .line 798
    check-cast v1, La/hcz;

    .line 799
    .line 800
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    check-cast v0, La/hzp0;

    .line 804
    .line 805
    iget-object v2, v0, La/hzp0;->a:Ljava/util/List;

    .line 806
    .line 807
    iget-object v3, v0, La/hzp0;->b:Ljava/util/List;

    .line 808
    .line 809
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    const v5, 0x2fd4df92

    .line 814
    .line 815
    .line 816
    if-nez v2, :cond_8

    .line 817
    .line 818
    sget-object v2, La/fre0;->d:La/ugd;

    .line 819
    .line 820
    invoke-static {v1, v11, v11, v2, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 821
    .line 822
    .line 823
    iget-object v0, v0, La/hzp0;->a:Ljava/util/List;

    .line 824
    .line 825
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    new-instance v8, La/adn0;

    .line 830
    .line 831
    invoke-direct {v8, v0, v6}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 832
    .line 833
    .line 834
    new-instance v6, La/xy1;

    .line 835
    .line 836
    invoke-direct {v6, v0, v7}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 837
    .line 838
    .line 839
    new-instance v0, La/ugd;

    .line 840
    .line 841
    invoke-direct {v0, v5, v12, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v1, v2, v11, v8, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 845
    .line 846
    .line 847
    :cond_8
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 848
    .line 849
    .line 850
    move-result v0

    .line 851
    if-nez v0, :cond_9

    .line 852
    .line 853
    sget-object v0, La/fre0;->e:La/ugd;

    .line 854
    .line 855
    invoke-static {v1, v11, v11, v0, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 856
    .line 857
    .line 858
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    new-instance v2, La/adn0;

    .line 863
    .line 864
    const/16 v4, 0x17

    .line 865
    .line 866
    invoke-direct {v2, v3, v4}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 867
    .line 868
    .line 869
    new-instance v4, La/bzp0;

    .line 870
    .line 871
    invoke-direct {v4, v3, v10}, La/bzp0;-><init>(Ljava/util/List;B)V

    .line 872
    .line 873
    .line 874
    new-instance v3, La/ugd;

    .line 875
    .line 876
    invoke-direct {v3, v5, v12, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v1, v0, v11, v2, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 880
    .line 881
    .line 882
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 883
    .line 884
    return-object v0

    .line 885
    :pswitch_16
    check-cast v0, La/qvp0;

    .line 886
    .line 887
    iget-object v1, v0, La/qvp0;->k2:La/a8z;

    .line 888
    .line 889
    move-object/from16 v4, p1

    .line 890
    .line 891
    check-cast v4, La/yvp0;

    .line 892
    .line 893
    sget v5, La/qvp0;->m2:I

    .line 894
    .line 895
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    sget-object v5, La/wvp0;->a:La/wvp0;

    .line 899
    .line 900
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v5

    .line 904
    if-eqz v5, :cond_a

    .line 905
    .line 906
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    check-cast v2, La/uwi;

    .line 911
    .line 912
    iget-object v2, v2, La/uwi;->a:La/w5z;

    .line 913
    .line 914
    iget-object v2, v2, La/w5z;->d:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v2, La/ii;

    .line 917
    .line 918
    invoke-static {v2}, La/x1x;->y(Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    check-cast v1, La/uwi;

    .line 926
    .line 927
    iget-object v1, v1, La/uwi;->a:La/w5z;

    .line 928
    .line 929
    const v1, 0x7f1307f8

    .line 930
    .line 931
    .line 932
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v14

    .line 936
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v16

    .line 940
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    const v1, 0x7f1307f7

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v18

    .line 950
    const v1, 0x7f13032f

    .line 951
    .line 952
    .line 953
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v17

    .line 957
    sget-object v22, La/n12;->a:La/n12;

    .line 958
    .line 959
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 960
    .line 961
    const/16 v23, 0x0

    .line 962
    .line 963
    const/16 v24, 0x5c2

    .line 964
    .line 965
    const/4 v15, 0x0

    .line 966
    const-string v19, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 967
    .line 968
    const/16 v20, 0x0

    .line 969
    .line 970
    const/16 v21, 0x0

    .line 971
    .line 972
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 973
    .line 974
    .line 975
    sget-object v1, La/tx00;->l2:La/evz;

    .line 976
    .line 977
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    invoke-static {v13, v10, v12, v12}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 985
    .line 986
    .line 987
    move-result-object v3

    .line 988
    invoke-virtual {v3}, La/kxq;->r()La/v1r;

    .line 989
    .line 990
    .line 991
    move-result-object v3

    .line 992
    invoke-virtual {v2, v1, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 993
    .line 994
    .line 995
    goto :goto_3

    .line 996
    :cond_a
    instance-of v5, v4, La/xvp0;

    .line 997
    .line 998
    if-eqz v5, :cond_c

    .line 999
    .line 1000
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v5

    .line 1004
    if-eqz v5, :cond_b

    .line 1005
    .line 1006
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    check-cast v1, La/uwi;

    .line 1011
    .line 1012
    iget-object v1, v1, La/uwi;->a:La/w5z;

    .line 1013
    .line 1014
    iget-object v1, v1, La/w5z;->a:Ljava/lang/Object;

    .line 1015
    .line 1016
    check-cast v1, La/wdk0;

    .line 1017
    .line 1018
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1026
    .line 1027
    .line 1028
    check-cast v4, La/xvp0;

    .line 1029
    .line 1030
    iget-object v4, v4, La/xvp0;->a:Ljava/lang/String;

    .line 1031
    .line 1032
    invoke-static {v5, v1, v3, v2, v4}, La/n6x;->i0(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    :cond_b
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1036
    .line 1037
    .line 1038
    :goto_3
    iget-object v0, v0, La/qvp0;->l2:La/a8z;

    .line 1039
    .line 1040
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    check-cast v0, La/k3t0;

    .line 1045
    .line 1046
    sget-object v1, La/rvp0;->a:La/rvp0;

    .line 1047
    .line 1048
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1052
    .line 1053
    goto :goto_4

    .line 1054
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 1055
    .line 1056
    .line 1057
    :goto_4
    return-object v11

    .line 1058
    :pswitch_17
    check-cast v0, La/gup0;

    .line 1059
    .line 1060
    iget-object v1, v0, La/gup0;->l2:La/a8z;

    .line 1061
    .line 1062
    move-object/from16 v4, p1

    .line 1063
    .line 1064
    check-cast v4, La/sup0;

    .line 1065
    .line 1066
    sget-object v5, La/gup0;->n2:La/m6m0;

    .line 1067
    .line 1068
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1069
    .line 1070
    .line 1071
    instance-of v5, v4, La/rup0;

    .line 1072
    .line 1073
    if-eqz v5, :cond_e

    .line 1074
    .line 1075
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v5

    .line 1079
    if-eqz v5, :cond_d

    .line 1080
    .line 1081
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    check-cast v1, La/swi;

    .line 1086
    .line 1087
    iget-object v1, v1, La/swi;->a:La/n660;

    .line 1088
    .line 1089
    iget-object v1, v1, La/n660;->a:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v1, La/wdk0;

    .line 1092
    .line 1093
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v3

    .line 1100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    check-cast v4, La/rup0;

    .line 1104
    .line 1105
    iget-object v4, v4, La/rup0;->a:Ljava/lang/String;

    .line 1106
    .line 1107
    invoke-static {v5, v1, v3, v2, v4}, La/n6x;->i0(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    :cond_d
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1111
    .line 1112
    .line 1113
    goto :goto_5

    .line 1114
    :cond_e
    sget-object v2, La/pup0;->a:La/pup0;

    .line 1115
    .line 1116
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v2

    .line 1120
    if-eqz v2, :cond_f

    .line 1121
    .line 1122
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_5

    .line 1126
    :cond_f
    instance-of v2, v4, La/qup0;

    .line 1127
    .line 1128
    if-eqz v2, :cond_10

    .line 1129
    .line 1130
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v1

    .line 1134
    check-cast v1, La/swi;

    .line 1135
    .line 1136
    iget-object v1, v1, La/swi;->a:La/n660;

    .line 1137
    .line 1138
    iget-object v1, v1, La/n660;->a:Ljava/lang/Object;

    .line 1139
    .line 1140
    check-cast v1, La/wdk0;

    .line 1141
    .line 1142
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 1143
    .line 1144
    .line 1145
    check-cast v4, La/qup0;

    .line 1146
    .line 1147
    iget-object v3, v4, La/qup0;->a:Ljava/lang/String;

    .line 1148
    .line 1149
    const v2, 0x7f13053b

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v4

    .line 1156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    const v2, 0x7f080467

    .line 1160
    .line 1161
    .line 1162
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v6

    .line 1166
    const/4 v7, 0x0

    .line 1167
    const/16 v8, 0x50

    .line 1168
    .line 1169
    const-string v2, ""

    .line 1170
    .line 1171
    const/4 v5, 0x0

    .line 1172
    invoke-static/range {v0 .. v8}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 1173
    .line 1174
    .line 1175
    :goto_5
    invoke-virtual {v0}, La/gup0;->P0()La/k3t0;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    sget-object v1, La/hup0;->a:La/hup0;

    .line 1180
    .line 1181
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1182
    .line 1183
    .line 1184
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1185
    .line 1186
    goto :goto_6

    .line 1187
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 1188
    .line 1189
    .line 1190
    :goto_6
    return-object v11

    .line 1191
    :pswitch_18
    move-object v1, v0

    .line 1192
    check-cast v1, La/rtp0;

    .line 1193
    .line 1194
    move-object/from16 v0, p1

    .line 1195
    .line 1196
    check-cast v0, Ljava/lang/Throwable;

    .line 1197
    .line 1198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1202
    .line 1203
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1204
    .line 1205
    :cond_11
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1213
    .line 1214
    move-object v4, v0

    .line 1215
    check-cast v4, La/gsp0;

    .line 1216
    .line 1217
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1218
    .line 1219
    .line 1220
    const/4 v12, 0x0

    .line 1221
    const/16 v13, 0x8f

    .line 1222
    .line 1223
    const/4 v5, 0x0

    .line 1224
    const/4 v6, 0x0

    .line 1225
    const/4 v7, 0x0

    .line 1226
    const/4 v8, 0x0

    .line 1227
    const/4 v9, 0x0

    .line 1228
    const/4 v10, 0x1

    .line 1229
    const/4 v11, 0x0

    .line 1230
    invoke-static/range {v4 .. v13}, La/gsp0;->a(La/gsp0;La/eme;La/hdm0;La/nc5;Ljava/util/List;ZZZZI)La/gsp0;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v3

    .line 1234
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v0

    .line 1238
    if-eqz v0, :cond_11

    .line 1239
    .line 1240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1241
    .line 1242
    return-object v0

    .line 1243
    :pswitch_19
    check-cast v0, La/yj5;

    .line 1244
    .line 1245
    move-object/from16 v1, p1

    .line 1246
    .line 1247
    check-cast v1, La/cp;

    .line 1248
    .line 1249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    new-instance v2, La/ngp0;

    .line 1253
    .line 1254
    invoke-direct {v2, v0}, La/ngp0;-><init>(La/yj5;)V

    .line 1255
    .line 1256
    .line 1257
    new-instance v3, La/ngp0;

    .line 1258
    .line 1259
    invoke-direct {v3, v0}, La/ngp0;-><init>(La/yj5;)V

    .line 1260
    .line 1261
    .line 1262
    iget-object v0, v1, La/cp;->u:La/yfu0;

    .line 1263
    .line 1264
    check-cast v0, La/fs6;

    .line 1265
    .line 1266
    iget-object v4, v0, La/fs6;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1267
    .line 1268
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 1269
    .line 1270
    .line 1271
    iget-object v0, v0, La/fs6;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 1272
    .line 1273
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 1274
    .line 1275
    .line 1276
    new-instance v0, La/nej0;

    .line 1277
    .line 1278
    invoke-direct {v0, v2, v1, v3, v8}, La/nej0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1282
    .line 1283
    .line 1284
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1285
    .line 1286
    return-object v0

    .line 1287
    :pswitch_1a
    check-cast v0, La/jpp0;

    .line 1288
    .line 1289
    move-object/from16 v1, p1

    .line 1290
    .line 1291
    check-cast v1, Ljava/lang/Integer;

    .line 1292
    .line 1293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    .line 1295
    .line 1296
    sget-object v1, La/jpp0;->O1:La/s2m0;

    .line 1297
    .line 1298
    invoke-virtual {v0}, La/jpp0;->G0()La/k3t0;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    sget-object v1, La/ph2;->a:La/ph2;

    .line 1303
    .line 1304
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1305
    .line 1306
    .line 1307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1308
    .line 1309
    return-object v0

    .line 1310
    :pswitch_1b
    move-object v1, v0

    .line 1311
    check-cast v1, La/zop0;

    .line 1312
    .line 1313
    move-object/from16 v0, p1

    .line 1314
    .line 1315
    check-cast v0, Ljava/lang/Throwable;

    .line 1316
    .line 1317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1321
    .line 1322
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1323
    .line 1324
    :cond_12
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1332
    .line 1333
    move-object v4, v0

    .line 1334
    check-cast v4, La/oop0;

    .line 1335
    .line 1336
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1337
    .line 1338
    .line 1339
    const/4 v11, 0x0

    .line 1340
    const/16 v12, 0x67

    .line 1341
    .line 1342
    const/4 v5, 0x0

    .line 1343
    const/4 v6, 0x0

    .line 1344
    const/4 v7, 0x0

    .line 1345
    const/4 v8, 0x0

    .line 1346
    const/4 v9, 0x1

    .line 1347
    const/4 v10, 0x0

    .line 1348
    invoke-static/range {v4 .. v12}, La/oop0;->a(La/oop0;La/eme;La/hdm0;La/nc5;ZZZLa/i5p0;I)La/oop0;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v3

    .line 1352
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v0

    .line 1356
    if-eqz v0, :cond_12

    .line 1357
    .line 1358
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1359
    .line 1360
    return-object v0

    .line 1361
    :pswitch_1c
    check-cast v0, La/pop0;

    .line 1362
    .line 1363
    move-object/from16 v1, p1

    .line 1364
    .line 1365
    check-cast v1, La/hcz;

    .line 1366
    .line 1367
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    iget-object v2, v0, La/pop0;->c:Ljava/util/ArrayList;

    .line 1371
    .line 1372
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1373
    .line 1374
    .line 1375
    move-result v3

    .line 1376
    new-instance v4, La/t9l0;

    .line 1377
    .line 1378
    invoke-direct {v4, v2, v5}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v5, La/xe4;

    .line 1382
    .line 1383
    const/16 v6, 0x14

    .line 1384
    .line 1385
    invoke-direct {v5, v2, v0, v6}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 1386
    .line 1387
    .line 1388
    new-instance v0, La/ugd;

    .line 1389
    .line 1390
    invoke-direct {v0, v9, v12, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v1, v3, v11, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1394
    .line 1395
    .line 1396
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1397
    .line 1398
    return-object v0

    .line 1399
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
