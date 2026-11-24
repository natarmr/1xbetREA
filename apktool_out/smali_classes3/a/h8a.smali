.class public final synthetic La/h8a;
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
    iput-byte p2, p0, La/h8a;->a:B

    iput-object p1, p0, La/h8a;->b:Ljava/lang/Object;

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
    iget-byte v1, v0, La/h8a;->a:B

    .line 4
    .line 5
    const-string v2, "viewModelFactory"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/h8a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/svd;

    .line 14
    .line 15
    invoke-virtual {v0}, La/svd;->C()V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    check-cast v0, La/skd;

    .line 22
    .line 23
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    invoke-static {v1, v2, v1, v2}, La/qkx;->a(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v0, v0, La/skd;->a:Landroid/view/View;

    .line 30
    .line 31
    if-eqz v4, :cond_6

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v1, v0

    .line 38
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    instance-of v2, v1, Landroid/app/Activity;

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    :goto_1
    move-object v3, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    instance-of v2, v1, Landroid/inputmethodservice/InputMethodService;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    instance-of v2, v1, Landroid/app/Application;

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    check-cast v1, Landroid/content/ContextWrapper;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-nez v2, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    :goto_2
    if-eqz v3, :cond_5

    .line 73
    .line 74
    sget-object v0, La/mjv0;->a:La/ljv0;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v0, La/ljv0;->b:La/njv0;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3}, La/njv0;->b(Landroid/content/Context;)La/kjv0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v0, v0, La/kjv0;->a:La/tq8;

    .line 89
    .line 90
    invoke-virtual {v0}, La/tq8;->c()Landroid/graphics/Rect;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v0}, La/tq8;->c()Landroid/graphics/Rect;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    int-to-long v1, v1

    .line 107
    const/16 v4, 0x20

    .line 108
    .line 109
    shl-long/2addr v1, v4

    .line 110
    int-to-long v4, v0

    .line 111
    const-wide v6, 0xffffffffL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    and-long/2addr v4, v6

    .line 117
    or-long v0, v1, v4

    .line 118
    .line 119
    invoke-static {v3}, La/q8a;->e(Landroid/content/Context;)La/a7k;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v0, v1}, La/n2x;->Q(J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    invoke-interface {v2, v3, v4}, La/w6k;->p(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    new-instance v4, La/xbk;

    .line 132
    .line 133
    invoke-direct {v4, v0, v1, v2, v3}, La/xbk;-><init>(JJ)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v0}, La/q8a;->e(Landroid/content/Context;)La/a7k;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget v2, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 150
    .line 151
    int-to-float v2, v2

    .line 152
    iget v1, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 153
    .line 154
    int-to-float v1, v1

    .line 155
    invoke-static {v2, v1}, La/qbc;->i(FF)J

    .line 156
    .line 157
    .line 158
    move-result-wide v1

    .line 159
    invoke-interface {v0, v1, v2}, La/w6k;->G0(J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v3

    .line 163
    invoke-static {v3, v4}, La/n2x;->N(J)J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    new-instance v0, La/xbk;

    .line 168
    .line 169
    invoke-direct {v0, v3, v4, v1, v2}, La/xbk;-><init>(JJ)V

    .line 170
    .line 171
    .line 172
    :goto_3
    move-object v4, v0

    .line 173
    goto :goto_4

    .line 174
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, La/q8a;->e(Landroid/content/Context;)La/a7k;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v1, v2}, La/n2x;->Q(J)J

    .line 183
    .line 184
    .line 185
    move-result-wide v3

    .line 186
    invoke-interface {v0, v3, v4}, La/w6k;->p(J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v3

    .line 190
    new-instance v0, La/xbk;

    .line 191
    .line 192
    invoke-direct {v0, v1, v2, v3, v4}, La/xbk;-><init>(JJ)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :goto_4
    return-object v4

    .line 197
    :pswitch_1
    check-cast v0, Lkotlin/Pair;

    .line 198
    .line 199
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    return-object v0

    .line 204
    :pswitch_2
    check-cast v0, La/yed;

    .line 205
    .line 206
    sget-object v1, La/yed;->P1:La/bj5;

    .line 207
    .line 208
    iget-object v0, v0, La/yed;->K1:La/fiu0;

    .line 209
    .line 210
    if-eqz v0, :cond_7

    .line 211
    .line 212
    return-object v0

    .line 213
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v3

    .line 217
    :pswitch_3
    check-cast v0, La/ehf0;

    .line 218
    .line 219
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, La/gii0;

    .line 222
    .line 223
    const-class v1, La/fed;

    .line 224
    .line 225
    sget-object v2, La/sre0;->a:La/tre0;

    .line 226
    .line 227
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, La/fed;

    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_4
    check-cast v0, La/hed;

    .line 239
    .line 240
    sget-object v1, La/hed;->Q1:La/gl5;

    .line 241
    .line 242
    iget-object v0, v0, La/hed;->K1:La/fiu0;

    .line 243
    .line 244
    if-eqz v0, :cond_8

    .line 245
    .line 246
    return-object v0

    .line 247
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v3

    .line 251
    :pswitch_5
    check-cast v0, La/z6d;

    .line 252
    .line 253
    iget-object v0, v0, La/z6d;->l1:Lkotlin/jvm/functions/Function0;

    .line 254
    .line 255
    if-eqz v0, :cond_9

    .line 256
    .line 257
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    :cond_9
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_6
    check-cast v0, La/x4d;

    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_7
    check-cast v0, Ljava/lang/Iterable;

    .line 267
    .line 268
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    return-object v0

    .line 273
    :pswitch_8
    check-cast v0, La/nyq0;

    .line 274
    .line 275
    invoke-interface {v0}, La/nyq0;->getState()La/oyq0;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v0}, La/oyq0;->a()F

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    const/high16 v1, 0x3f800000    # 1.0f

    .line 284
    .line 285
    sub-float/2addr v1, v0

    .line 286
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    return-object v0

    .line 291
    :pswitch_9
    check-cast v0, La/nhf0;

    .line 292
    .line 293
    iget-object v0, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, La/rrc;

    .line 296
    .line 297
    iget-object v0, v0, La/rrc;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 300
    .line 301
    invoke-virtual {v0}, Lorg/xplatform/onexdatabase/OnexDatabase;->r()La/sr50;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0

    .line 306
    :pswitch_a
    check-cast v0, La/iwc;

    .line 307
    .line 308
    iget-object v0, v0, La/iwc;->i:La/ctf0;

    .line 309
    .line 310
    const/4 v1, 0x0

    .line 311
    new-array v2, v1, [Ljava/lang/Object;

    .line 312
    .line 313
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 314
    .line 315
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    const v2, 0x7f130690

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :pswitch_b
    check-cast v0, La/esc;

    .line 328
    .line 329
    sget v1, La/esc;->m2:I

    .line 330
    .line 331
    iget-object v0, v0, La/esc;->k2:La/fiu0;

    .line 332
    .line 333
    if-eqz v0, :cond_a

    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v3

    .line 340
    :pswitch_c
    check-cast v0, La/trc;

    .line 341
    .line 342
    iget-object v0, v0, La/trc;->i:La/p7m0;

    .line 343
    .line 344
    sget-object v1, La/i8d;->c:La/i8d;

    .line 345
    .line 346
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_d
    check-cast v0, La/ygc;

    .line 353
    .line 354
    sget-object v1, La/cgc;->a:La/cgc;

    .line 355
    .line 356
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_e
    move-object v1, v0

    .line 363
    check-cast v1, La/wdc;

    .line 364
    .line 365
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 366
    .line 367
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 368
    .line 369
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 377
    .line 378
    move-object v4, v0

    .line 379
    check-cast v4, La/rdc;

    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    const/4 v15, 0x0

    .line 385
    const/16 v16, 0x17f

    .line 386
    .line 387
    const/4 v5, 0x0

    .line 388
    const-wide/16 v6, 0x0

    .line 389
    .line 390
    const/4 v8, 0x0

    .line 391
    const/4 v9, 0x0

    .line 392
    const/4 v10, 0x0

    .line 393
    const-wide/16 v11, 0x0

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    const/4 v14, 0x0

    .line 397
    invoke-static/range {v4 .. v16}, La/rdc;->a(La/rdc;Ljava/util/List;DLa/i8r;Ljava/lang/String;ZDLjava/lang/Double;ZLa/z85;I)La/rdc;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-eqz v0, :cond_b

    .line 406
    .line 407
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    return-object v0

    .line 410
    :pswitch_f
    check-cast v0, La/rac;

    .line 411
    .line 412
    iget v0, v0, La/rac;->h:I

    .line 413
    .line 414
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    return-object v0

    .line 419
    :pswitch_10
    check-cast v0, La/v7c;

    .line 420
    .line 421
    iget-object v1, v0, La/v7c;->Q:La/p7m0;

    .line 422
    .line 423
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    move-object v2, v0

    .line 428
    check-cast v2, La/i7c;

    .line 429
    .line 430
    const/4 v9, 0x0

    .line 431
    const/16 v10, 0x1fff

    .line 432
    .line 433
    const/4 v3, 0x0

    .line 434
    const/4 v4, 0x0

    .line 435
    const/4 v5, 0x0

    .line 436
    const/4 v6, 0x0

    .line 437
    const/4 v7, 0x0

    .line 438
    const/4 v8, 0x0

    .line 439
    invoke-static/range {v2 .. v10}, La/i7c;->a(La/i7c;Ljava/lang/String;La/m6c;La/n6c;La/u6c;ZZZI)La/i7c;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_c

    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_11
    check-cast v0, La/s1c;

    .line 453
    .line 454
    iget-object v1, v0, La/s1c;->x:La/p7m0;

    .line 455
    .line 456
    :cond_d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    move-object v2, v0

    .line 461
    check-cast v2, La/f1c;

    .line 462
    .line 463
    const/4 v6, 0x0

    .line 464
    const/16 v7, 0x7f

    .line 465
    .line 466
    const/4 v3, 0x0

    .line 467
    const/4 v4, 0x0

    .line 468
    const/4 v5, 0x0

    .line 469
    invoke-static/range {v2 .. v7}, La/f1c;->a(La/f1c;Ljava/lang/String;ZZZI)La/f1c;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_d

    .line 478
    .line 479
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    return-object v0

    .line 482
    :pswitch_12
    check-cast v0, La/eqb;

    .line 483
    .line 484
    iget-object v0, v0, La/eqb;->u:La/p7m0;

    .line 485
    .line 486
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 487
    .line 488
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object v0

    .line 497
    :pswitch_13
    check-cast v0, La/k71;

    .line 498
    .line 499
    invoke-virtual {v0}, La/k71;->invoke()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_14
    check-cast v0, La/t6n;

    .line 506
    .line 507
    return-object v0

    .line 508
    :pswitch_15
    check-cast v0, La/ehf0;

    .line 509
    .line 510
    iget-object v0, v0, La/ehf0;->b:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v0, La/gii0;

    .line 513
    .line 514
    const-class v1, La/agb;

    .line 515
    .line 516
    sget-object v2, La/sre0;->a:La/tre0;

    .line 517
    .line 518
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    check-cast v0, La/agb;

    .line 527
    .line 528
    return-object v0

    .line 529
    :pswitch_16
    check-cast v0, La/chf0;

    .line 530
    .line 531
    iget-object v0, v0, La/chf0;->b:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, La/gii0;

    .line 534
    .line 535
    const-class v1, La/mfb;

    .line 536
    .line 537
    sget-object v2, La/sre0;->a:La/tre0;

    .line 538
    .line 539
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, La/mfb;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_17
    check-cast v0, La/xex;

    .line 551
    .line 552
    iget-object v0, v0, La/xex;->a:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, La/gii0;

    .line 555
    .line 556
    const-class v1, La/scb;

    .line 557
    .line 558
    sget-object v2, La/sre0;->a:La/tre0;

    .line 559
    .line 560
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    check-cast v0, La/scb;

    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_18
    check-cast v0, La/yya;

    .line 572
    .line 573
    iget-object v0, v0, La/yya;->w:La/p7m0;

    .line 574
    .line 575
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 576
    .line 577
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object v0

    .line 586
    :pswitch_19
    move-object v1, v0

    .line 587
    check-cast v1, La/uya;

    .line 588
    .line 589
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 590
    .line 591
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 592
    .line 593
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 601
    .line 602
    move-object v4, v0

    .line 603
    check-cast v4, La/kya;

    .line 604
    .line 605
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    const/16 v14, 0x3ef

    .line 610
    .line 611
    const/4 v5, 0x0

    .line 612
    const/4 v6, 0x0

    .line 613
    const/4 v7, 0x0

    .line 614
    const/4 v8, 0x0

    .line 615
    const/4 v9, 0x0

    .line 616
    const/4 v10, 0x0

    .line 617
    const-wide/16 v11, 0x0

    .line 618
    .line 619
    invoke-static/range {v4 .. v14}, La/kya;->a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-eqz v0, :cond_e

    .line 628
    .line 629
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 630
    .line 631
    return-object v0

    .line 632
    :pswitch_1a
    check-cast v0, La/jwa;

    .line 633
    .line 634
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 635
    .line 636
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 641
    .line 642
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary40-0d7_KjU()J

    .line 643
    .line 644
    .line 645
    move-result-wide v3

    .line 646
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 651
    .line 652
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary40-0d7_KjU()J

    .line 653
    .line 654
    .line 655
    move-result-wide v7

    .line 656
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 661
    .line 662
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary40-0d7_KjU()J

    .line 663
    .line 664
    .line 665
    move-result-wide v5

    .line 666
    sget-object v10, La/jol;->b:La/jol;

    .line 667
    .line 668
    check-cast v0, La/iwa;

    .line 669
    .line 670
    iget-object v9, v0, La/iwa;->c:La/bi90;

    .line 671
    .line 672
    new-instance v2, La/iol;

    .line 673
    .line 674
    invoke-direct/range {v2 .. v10}, La/iol;-><init>(JJJLa/bi90;La/jol;)V

    .line 675
    .line 676
    .line 677
    return-object v2

    .line 678
    :pswitch_1b
    check-cast v0, La/i9a;

    .line 679
    .line 680
    iget-object v0, v0, La/i9a;->a:La/o5d0;

    .line 681
    .line 682
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    check-cast v0, La/g9a;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_1c
    check-cast v0, La/g9a;

    .line 690
    .line 691
    iget-object v0, v0, La/g9a;->h:La/o5d0;

    .line 692
    .line 693
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    check-cast v0, La/cpt0;

    .line 698
    .line 699
    return-object v0

    .line 700
    nop

    .line 701
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
