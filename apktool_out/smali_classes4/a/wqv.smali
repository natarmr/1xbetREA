.class public final synthetic La/wqv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/m1z;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/16 v0, 0x1a

    iput-byte v0, p0, La/wqv;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wqv;->c:Ljava/lang/Object;

    iput-object p2, p0, La/wqv;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/wqv;->a:B

    iput-object p1, p0, La/wqv;->b:Ljava/lang/Object;

    iput-object p2, p0, La/wqv;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wqv;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x6

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/zbk;

    .line 17
    .line 18
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/d9z;

    .line 21
    .line 22
    invoke-virtual {v1}, La/zbk;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/i8z;

    .line 27
    .line 28
    new-instance v2, Landroidx/compose/foundation/lazy/layout/c;

    .line 29
    .line 30
    iget-object v3, v0, La/d9z;->d:La/t8z;

    .line 31
    .line 32
    iget-object v3, v3, La/t8z;->f:La/lbz;

    .line 33
    .line 34
    invoke-virtual {v3}, La/lbz;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lkotlin/ranges/IntRange;

    .line 39
    .line 40
    invoke-direct {v2, v3, v1}, Landroidx/compose/foundation/lazy/layout/c;-><init>(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/b;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/j8z;

    .line 44
    .line 45
    invoke-direct {v3, v0, v1, v2}, La/j8z;-><init>(La/d9z;La/i8z;Landroidx/compose/foundation/lazy/layout/c;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :pswitch_0
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, La/e7z;

    .line 52
    .line 53
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, La/mie0;

    .line 56
    .line 57
    iget-object v1, v1, La/e7z;->h1:La/tzi;

    .line 58
    .line 59
    iget-object v2, v1, La/tzi;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, La/lm40;

    .line 62
    .line 63
    iget v2, v2, La/lm40;->d:I

    .line 64
    .line 65
    and-int/lit8 v2, v2, 0x8

    .line 66
    .line 67
    if-eqz v2, :cond_a

    .line 68
    .line 69
    iget-object v1, v1, La/tzi;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/wso0;

    .line 72
    .line 73
    :goto_0
    if-eqz v1, :cond_a

    .line 74
    .line 75
    iget v2, v1, La/lm40;->c:I

    .line 76
    .line 77
    and-int/lit8 v2, v2, 0x8

    .line 78
    .line 79
    if-eqz v2, :cond_9

    .line 80
    .line 81
    move-object v2, v1

    .line 82
    move-object v3, v5

    .line 83
    :goto_1
    if-eqz v2, :cond_9

    .line 84
    .line 85
    instance-of v4, v2, La/qai0;

    .line 86
    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    check-cast v2, La/qai0;

    .line 90
    .line 91
    invoke-interface {v2}, La/qai0;->y()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_0

    .line 96
    .line 97
    new-instance v4, La/nai0;

    .line 98
    .line 99
    invoke-direct {v4}, La/nai0;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v4, v0, La/mie0;->a:Ljava/lang/Object;

    .line 103
    .line 104
    iput-boolean v7, v4, La/nai0;->d:Z

    .line 105
    .line 106
    :cond_0
    invoke-interface {v2}, La/qai0;->J0()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    iget-object v4, v0, La/mie0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, La/nai0;

    .line 115
    .line 116
    iput-boolean v7, v4, La/nai0;->c:Z

    .line 117
    .line 118
    :cond_1
    iget-object v4, v0, La/mie0;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v4, La/abi0;

    .line 121
    .line 122
    invoke-interface {v2, v4}, La/qai0;->x0(La/abi0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_2
    iget v4, v2, La/lm40;->c:I

    .line 127
    .line 128
    and-int/lit8 v4, v4, 0x8

    .line 129
    .line 130
    if-eqz v4, :cond_8

    .line 131
    .line 132
    instance-of v4, v2, La/f3k;

    .line 133
    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    move-object v4, v2

    .line 137
    check-cast v4, La/f3k;

    .line 138
    .line 139
    iget-object v4, v4, La/f3k;->p:La/lm40;

    .line 140
    .line 141
    move v8, v6

    .line 142
    :goto_2
    if-eqz v4, :cond_7

    .line 143
    .line 144
    iget v9, v4, La/lm40;->c:I

    .line 145
    .line 146
    and-int/lit8 v9, v9, 0x8

    .line 147
    .line 148
    if-eqz v9, :cond_6

    .line 149
    .line 150
    add-int/lit8 v8, v8, 0x1

    .line 151
    .line 152
    if-ne v8, v7, :cond_3

    .line 153
    .line 154
    move-object v2, v4

    .line 155
    goto :goto_3

    .line 156
    :cond_3
    if-nez v3, :cond_4

    .line 157
    .line 158
    new-instance v3, La/xz40;

    .line 159
    .line 160
    const/16 v9, 0x10

    .line 161
    .line 162
    new-array v9, v9, [La/lm40;

    .line 163
    .line 164
    invoke-direct {v3, v9}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_4
    if-eqz v2, :cond_5

    .line 168
    .line 169
    invoke-virtual {v3, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    move-object v2, v5

    .line 173
    :cond_5
    invoke-virtual {v3, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_6
    :goto_3
    iget-object v4, v4, La/lm40;->f:La/lm40;

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_7
    if-ne v8, v7, :cond_8

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_8
    :goto_4
    invoke-static {v3}, La/vcc;->V(La/xz40;)La/lm40;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    goto :goto_1

    .line 187
    :cond_9
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_1
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, La/gxu;

    .line 196
    .line 197
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, La/j4z;

    .line 200
    .line 201
    iget-object v1, v1, La/gxu;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, La/jx50;

    .line 204
    .line 205
    iget-object v1, v1, La/jx50;->a:La/ix50;

    .line 206
    .line 207
    iget-object v2, v1, La/ix50;->b:Ljava/lang/Long;

    .line 208
    .line 209
    if-nez v2, :cond_b

    .line 210
    .line 211
    iget-object v2, v1, La/ix50;->a:Ljava/lang/Long;

    .line 212
    .line 213
    :cond_b
    if-eqz v2, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    new-instance v2, La/z3z;

    .line 220
    .line 221
    invoke-direct {v2, v0, v1}, La/z3z;-><init>(J)V

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_c
    new-instance v2, La/y3z;

    .line 226
    .line 227
    iget-object v0, v0, La/j4z;->a:La/h4z;

    .line 228
    .line 229
    iget-wide v3, v0, La/h4z;->a:J

    .line 230
    .line 231
    iget-wide v0, v0, La/h4z;->d:J

    .line 232
    .line 233
    invoke-direct {v2, v3, v4, v0, v1}, La/y3z;-><init>(JJ)V

    .line 234
    .line 235
    .line 236
    :goto_5
    return-object v2

    .line 237
    :pswitch_2
    iget-object v1, v0, La/wqv;->c:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, La/m1z;

    .line 240
    .line 241
    iget-object v0, v0, La/wqv;->b:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 244
    .line 245
    invoke-interface {v1}, La/m1z;->c()La/f9m0;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iget-boolean v1, v1, La/f9m0;->h:Z

    .line 250
    .line 251
    if-eqz v1, :cond_d

    .line 252
    .line 253
    sget-object v1, La/k0z;->a:La/k0z;

    .line 254
    .line 255
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_3
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, La/q0z;

    .line 264
    .line 265
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, La/n3q;

    .line 268
    .line 269
    sget-object v2, La/q0z;->n2:La/art;

    .line 270
    .line 271
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->R()Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_e

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_e
    iget-object v2, v1, La/q0z;->k2:La/phf0;

    .line 279
    .line 280
    sget-object v3, La/q0z;->o2:[La/iiy;

    .line 281
    .line 282
    aget-object v3, v3, v6

    .line 283
    .line 284
    invoke-virtual {v2, v1, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const-string v3, "REQUEST_SELECT_FILTER_MODEL"

    .line 289
    .line 290
    new-instance v4, Lkotlin/Pair;

    .line 291
    .line 292
    invoke-direct {v4, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0, v1, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, La/yo8;->y0()V

    .line 307
    .line 308
    .line 309
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_4
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 315
    .line 316
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, La/hzy;

    .line 319
    .line 320
    iget-object v0, v0, La/hzy;->g:Ljava/lang/String;

    .line 321
    .line 322
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object v0

    .line 328
    :pswitch_5
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 331
    .line 332
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, La/fzy;

    .line 335
    .line 336
    iget-object v0, v0, La/fzy;->e:Ljava/lang/String;

    .line 337
    .line 338
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_6
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 347
    .line 348
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, La/ezy;

    .line 351
    .line 352
    iget-object v0, v0, La/ezy;->e:Ljava/lang/String;

    .line 353
    .line 354
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_7
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v1, Landroid/content/Context;

    .line 363
    .line 364
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesShimmerCollection;

    .line 367
    .line 368
    sget v2, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesShimmerCollection;->g:I

    .line 369
    .line 370
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    move v3, v6

    .line 375
    :goto_7
    const/4 v7, 0x3

    .line 376
    if-ge v3, v7, :cond_f

    .line 377
    .line 378
    new-instance v7, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 379
    .line 380
    invoke-direct {v7, v1, v5, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 381
    .line 382
    .line 383
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 384
    .line 385
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 386
    .line 387
    .line 388
    const v9, 0x7f040b0e

    .line 389
    .line 390
    .line 391
    invoke-static {v9, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    invoke-static {v9}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v7, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 403
    .line 404
    .line 405
    iget v8, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesShimmerCollection;->a:I

    .line 406
    .line 407
    invoke-static {v7, v8}, La/jmu0;->i(Landroid/view/View;I)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    add-int/lit8 v3, v3, 0x1

    .line 414
    .line 415
    goto :goto_7

    .line 416
    :cond_f
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v1, v6}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    :goto_8
    move-object v3, v2

    .line 425
    check-cast v3, La/paw;

    .line 426
    .line 427
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    if-eqz v4, :cond_10

    .line 432
    .line 433
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    check-cast v3, Landroid/view/View;

    .line 438
    .line 439
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 440
    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_10
    return-object v1

    .line 444
    :pswitch_8
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v1, La/kuy;

    .line 447
    .line 448
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, La/iuy;

    .line 451
    .line 452
    iget-object v1, v1, La/kuy;->a:La/q7d0;

    .line 453
    .line 454
    invoke-virtual {v1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 459
    .line 460
    .line 461
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_9
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, La/ugi0;

    .line 467
    .line 468
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, La/vby;

    .line 471
    .line 472
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 473
    .line 474
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 475
    .line 476
    .line 477
    iget-object v3, v0, La/vby;->a:La/dcy;

    .line 478
    .line 479
    invoke-static {v0, v1}, La/ady;->d(La/vby;La/ugi0;)V

    .line 480
    .line 481
    .line 482
    invoke-interface {v1}, La/ugi0;->d()I

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    move v3, v6

    .line 487
    :goto_9
    if-ge v3, v0, :cond_16

    .line 488
    .line 489
    invoke-interface {v1, v3}, La/ugi0;->f(I)Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    new-instance v7, Ljava/util/ArrayList;

    .line 494
    .line 495
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 496
    .line 497
    .line 498
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    :cond_11
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    if-eqz v8, :cond_12

    .line 507
    .line 508
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    instance-of v9, v8, La/zcy;

    .line 513
    .line 514
    if-eqz v9, :cond_11

    .line 515
    .line 516
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    goto :goto_a

    .line 520
    :cond_12
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v4

    .line 524
    check-cast v4, La/zcy;

    .line 525
    .line 526
    if-eqz v4, :cond_15

    .line 527
    .line 528
    invoke-interface {v4}, La/zcy;->names()[Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    if-eqz v4, :cond_15

    .line 533
    .line 534
    array-length v7, v4

    .line 535
    move v8, v6

    .line 536
    :goto_b
    if-ge v8, v7, :cond_15

    .line 537
    .line 538
    aget-object v9, v4, v8

    .line 539
    .line 540
    invoke-interface {v1}, La/ugi0;->l()La/c3x;

    .line 541
    .line 542
    .line 543
    move-result-object v10

    .line 544
    sget-object v11, La/zgi0;->b:La/zgi0;

    .line 545
    .line 546
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v10

    .line 550
    if-eqz v10, :cond_13

    .line 551
    .line 552
    const-string v10, "enum value"

    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_13
    const-string v10, "property"

    .line 556
    .line 557
    :goto_c
    invoke-interface {v2, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    if-nez v11, :cond_14

    .line 562
    .line 563
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v10

    .line 567
    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    add-int/lit8 v8, v8, 0x1

    .line 571
    .line 572
    goto :goto_b

    .line 573
    :cond_14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    const-string v4, "The suggested name \'"

    .line 576
    .line 577
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    const-string v4, "\' for "

    .line 584
    .line 585
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    const/16 v4, 0x20

    .line 592
    .line 593
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-interface {v1, v3}, La/ugi0;->e(I)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    const-string v3, " is already one of the names for "

    .line 604
    .line 605
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-static {v2, v9}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    check-cast v2, Ljava/lang/Number;

    .line 619
    .line 620
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    invoke-interface {v1, v2}, La/ugi0;->e(I)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    const-string v2, " in "

    .line 632
    .line 633
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    new-instance v1, La/kcy;

    .line 644
    .line 645
    const/4 v2, -0x1

    .line 646
    invoke-static {v2, v0, v5, v5, v5}, La/xww;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-direct {v1, v0}, La/ucy;-><init>(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    throw v1

    .line 654
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 655
    .line 656
    goto/16 :goto_9

    .line 657
    .line 658
    :cond_16
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_17

    .line 663
    .line 664
    sget-object v2, La/lun;->a:La/lun;

    .line 665
    .line 666
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    :cond_17
    return-object v2

    .line 670
    :pswitch_a
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v1, La/hrc;

    .line 673
    .line 674
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v0, La/ctf0;

    .line 677
    .line 678
    new-instance v7, La/x5y;

    .line 679
    .line 680
    invoke-virtual {v1}, La/hrc;->a()J

    .line 681
    .line 682
    .line 683
    move-result-wide v8

    .line 684
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    new-instance v9, La/vm5;

    .line 689
    .line 690
    const-string v14, ""

    .line 691
    .line 692
    const-string v15, ""

    .line 693
    .line 694
    const/16 v16, 0x0

    .line 695
    .line 696
    const-wide/16 v10, 0x0

    .line 697
    .line 698
    const-wide/16 v12, -0x1

    .line 699
    .line 700
    invoke-direct/range {v9 .. v16}, La/vm5;-><init>(JJLjava/lang/String;Ljava/lang/String;Z)V

    .line 701
    .line 702
    .line 703
    new-instance v10, La/zw6;

    .line 704
    .line 705
    new-instance v1, La/a8q0;

    .line 706
    .line 707
    const-string v5, ""

    .line 708
    .line 709
    invoke-direct {v1, v5, v2, v3, v4}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 710
    .line 711
    .line 712
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 713
    .line 714
    .line 715
    move-result-object v11

    .line 716
    const-wide/high16 v14, -0x4010000000000000L    # -1.0

    .line 717
    .line 718
    const-wide/high16 v16, -0x4010000000000000L    # -1.0

    .line 719
    .line 720
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 721
    .line 722
    invoke-direct/range {v10 .. v17}, La/zw6;-><init>(La/pz40;DDD)V

    .line 723
    .line 724
    .line 725
    new-array v1, v6, [Ljava/lang/Object;

    .line 726
    .line 727
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 728
    .line 729
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    const v2, 0x7f131627

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v11

    .line 740
    const/4 v12, 0x0

    .line 741
    const/4 v13, 0x0

    .line 742
    invoke-direct/range {v7 .. v13}, La/x5y;-><init>(Ljava/lang/String;La/vm5;La/zw6;Ljava/lang/String;ZZ)V

    .line 743
    .line 744
    .line 745
    return-object v7

    .line 746
    :pswitch_b
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 749
    .line 750
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v0, La/eoh;

    .line 753
    .line 754
    iget-object v0, v0, La/eoh;->g:La/f7v0;

    .line 755
    .line 756
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 760
    .line 761
    return-object v0

    .line 762
    :pswitch_c
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 763
    .line 764
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 765
    .line 766
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v0, La/doh;

    .line 769
    .line 770
    iget-wide v2, v0, La/doh;->a:J

    .line 771
    .line 772
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_d
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v1, La/v70;

    .line 785
    .line 786
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v0, La/ykg0;

    .line 789
    .line 790
    iget-object v1, v1, La/v70;->v:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v1, La/dke0;

    .line 793
    .line 794
    iget-object v0, v0, La/ykg0;->c:La/ysw;

    .line 795
    .line 796
    iget-object v2, v0, La/ysw;->b:Ljava/lang/String;

    .line 797
    .line 798
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    if-nez v3, :cond_18

    .line 803
    .line 804
    iget-object v2, v0, La/ysw;->a:Ljava/lang/String;

    .line 805
    .line 806
    :cond_18
    iget-object v0, v0, La/ysw;->b:Ljava/lang/String;

    .line 807
    .line 808
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    if-lez v0, :cond_19

    .line 813
    .line 814
    move v6, v7

    .line 815
    :cond_19
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v1, v2, v0}, La/dke0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 823
    .line 824
    return-object v0

    .line 825
    :pswitch_e
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v1, Lokhttp3/internal/http2/Http2Connection;

    .line 828
    .line 829
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 830
    .line 831
    check-cast v0, La/mie0;

    .line 832
    .line 833
    iget-object v2, v1, Lokhttp3/internal/http2/Http2Connection;->a:Lokhttp3/internal/http2/Http2Connection$Listener;

    .line 834
    .line 835
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 836
    .line 837
    check-cast v0, Lokhttp3/internal/http2/Settings;

    .line 838
    .line 839
    invoke-virtual {v2, v1, v0}, Lokhttp3/internal/http2/Http2Connection$Listener;->a(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V

    .line 840
    .line 841
    .line 842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 843
    .line 844
    return-object v0

    .line 845
    :pswitch_f
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;

    .line 848
    .line 849
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v0, Lokhttp3/internal/http2/Settings;

    .line 852
    .line 853
    new-instance v4, La/mie0;

    .line 854
    .line 855
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 856
    .line 857
    .line 858
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 859
    .line 860
    iget-object v8, v1, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 861
    .line 862
    monitor-enter v8

    .line 863
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 864
    :try_start_1
    iget-object v9, v1, Lokhttp3/internal/http2/Http2Connection;->s:Lokhttp3/internal/http2/Settings;

    .line 865
    .line 866
    new-instance v10, Lokhttp3/internal/http2/Settings;

    .line 867
    .line 868
    invoke-direct {v10}, Lokhttp3/internal/http2/Settings;-><init>()V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    move v11, v6

    .line 875
    :goto_d
    const/16 v12, 0xa

    .line 876
    .line 877
    if-ge v11, v12, :cond_1b

    .line 878
    .line 879
    shl-int v12, v7, v11

    .line 880
    .line 881
    iget v13, v9, Lokhttp3/internal/http2/Settings;->a:I

    .line 882
    .line 883
    and-int/2addr v12, v13

    .line 884
    if-eqz v12, :cond_1a

    .line 885
    .line 886
    iget-object v12, v9, Lokhttp3/internal/http2/Settings;->b:[I

    .line 887
    .line 888
    aget v12, v12, v11

    .line 889
    .line 890
    invoke-virtual {v10, v11, v12}, Lokhttp3/internal/http2/Settings;->b(II)V

    .line 891
    .line 892
    .line 893
    :cond_1a
    add-int/lit8 v11, v11, 0x1

    .line 894
    .line 895
    goto :goto_d

    .line 896
    :cond_1b
    move v11, v6

    .line 897
    :goto_e
    if-ge v11, v12, :cond_1d

    .line 898
    .line 899
    shl-int v13, v7, v11

    .line 900
    .line 901
    iget v14, v0, Lokhttp3/internal/http2/Settings;->a:I

    .line 902
    .line 903
    and-int/2addr v13, v14

    .line 904
    if-eqz v13, :cond_1c

    .line 905
    .line 906
    iget-object v13, v0, Lokhttp3/internal/http2/Settings;->b:[I

    .line 907
    .line 908
    aget v13, v13, v11

    .line 909
    .line 910
    invoke-virtual {v10, v11, v13}, Lokhttp3/internal/http2/Settings;->b(II)V

    .line 911
    .line 912
    .line 913
    :cond_1c
    add-int/lit8 v11, v11, 0x1

    .line 914
    .line 915
    goto :goto_e

    .line 916
    :cond_1d
    iput-object v10, v4, La/mie0;->a:Ljava/lang/Object;

    .line 917
    .line 918
    invoke-virtual {v10}, Lokhttp3/internal/http2/Settings;->a()I

    .line 919
    .line 920
    .line 921
    move-result v0

    .line 922
    int-to-long v10, v0

    .line 923
    invoke-virtual {v9}, Lokhttp3/internal/http2/Settings;->a()I

    .line 924
    .line 925
    .line 926
    move-result v0

    .line 927
    int-to-long v12, v0

    .line 928
    sub-long/2addr v10, v12

    .line 929
    cmp-long v2, v10, v2

    .line 930
    .line 931
    if-eqz v2, :cond_1f

    .line 932
    .line 933
    iget-object v0, v1, Lokhttp3/internal/http2/Http2Connection;->b:Ljava/util/LinkedHashMap;

    .line 934
    .line 935
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    if-eqz v0, :cond_1e

    .line 940
    .line 941
    goto :goto_f

    .line 942
    :cond_1e
    iget-object v0, v1, Lokhttp3/internal/http2/Http2Connection;->b:Ljava/util/LinkedHashMap;

    .line 943
    .line 944
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    new-array v3, v6, [Lokhttp3/internal/http2/Http2Stream;

    .line 949
    .line 950
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    move-object v5, v0

    .line 955
    check-cast v5, [Lokhttp3/internal/http2/Http2Stream;

    .line 956
    .line 957
    goto :goto_f

    .line 958
    :catchall_0
    move-exception v0

    .line 959
    goto :goto_12

    .line 960
    :cond_1f
    :goto_f
    iget-object v0, v4, La/mie0;->a:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v0, Lokhttp3/internal/http2/Settings;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    iput-object v0, v1, Lokhttp3/internal/http2/Http2Connection;->s:Lokhttp3/internal/http2/Settings;

    .line 968
    .line 969
    iget-object v12, v1, Lokhttp3/internal/http2/Http2Connection;->j:Lokhttp3/internal/concurrent/TaskQueue;

    .line 970
    .line 971
    new-instance v0, Ljava/lang/StringBuilder;

    .line 972
    .line 973
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 974
    .line 975
    .line 976
    iget-object v3, v1, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 977
    .line 978
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    const-string v3, " onSettings"

    .line 982
    .line 983
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v13

    .line 990
    new-instance v0, La/wqv;

    .line 991
    .line 992
    const/16 v3, 0xe

    .line 993
    .line 994
    invoke-direct {v0, v1, v4, v3}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 995
    .line 996
    .line 997
    const/16 v17, 0x6

    .line 998
    .line 999
    const-wide/16 v14, 0x0

    .line 1000
    .line 1001
    move-object/from16 v16, v0

    .line 1002
    .line 1003
    invoke-static/range {v12 .. v17}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JLkotlin/jvm/functions/Function0;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1004
    .line 1005
    .line 1006
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1007
    :try_start_3
    iget-object v0, v1, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 1008
    .line 1009
    iget-object v3, v4, La/mie0;->a:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v3, Lokhttp3/internal/http2/Settings;

    .line 1012
    .line 1013
    invoke-virtual {v0, v3}, Lokhttp3/internal/http2/Http2Writer;->a(Lokhttp3/internal/http2/Settings;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1014
    .line 1015
    .line 1016
    goto :goto_10

    .line 1017
    :catchall_1
    move-exception v0

    .line 1018
    goto :goto_13

    .line 1019
    :catch_0
    move-exception v0

    .line 1020
    :try_start_4
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 1021
    .line 1022
    invoke-virtual {v1, v3, v3, v0}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1023
    .line 1024
    .line 1025
    :goto_10
    monitor-exit v8

    .line 1026
    if-eqz v5, :cond_21

    .line 1027
    .line 1028
    array-length v0, v5

    .line 1029
    :goto_11
    if-ge v6, v0, :cond_21

    .line 1030
    .line 1031
    aget-object v1, v5, v6

    .line 1032
    .line 1033
    monitor-enter v1

    .line 1034
    :try_start_5
    iget-wide v3, v1, Lokhttp3/internal/http2/Http2Stream;->e:J

    .line 1035
    .line 1036
    add-long/2addr v3, v10

    .line 1037
    iput-wide v3, v1, Lokhttp3/internal/http2/Http2Stream;->e:J

    .line 1038
    .line 1039
    if-lez v2, :cond_20

    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1042
    .line 1043
    .line 1044
    :cond_20
    monitor-exit v1

    .line 1045
    add-int/lit8 v6, v6, 0x1

    .line 1046
    .line 1047
    goto :goto_11

    .line 1048
    :catchall_2
    move-exception v0

    .line 1049
    monitor-exit v1

    .line 1050
    throw v0

    .line 1051
    :cond_21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1052
    .line 1053
    return-object v0

    .line 1054
    :goto_12
    :try_start_6
    monitor-exit v1

    .line 1055
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1056
    :goto_13
    monitor-exit v8

    .line 1057
    throw v0

    .line 1058
    :pswitch_10
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1059
    .line 1060
    check-cast v1, Lokhttp3/internal/http2/Http2Connection;

    .line 1061
    .line 1062
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1063
    .line 1064
    move-object v2, v0

    .line 1065
    check-cast v2, Lokhttp3/internal/http2/Http2Stream;

    .line 1066
    .line 1067
    :try_start_7
    iget-object v0, v1, Lokhttp3/internal/http2/Http2Connection;->a:Lokhttp3/internal/http2/Http2Connection$Listener;

    .line 1068
    .line 1069
    invoke-virtual {v0, v2}, Lokhttp3/internal/http2/Http2Connection$Listener;->b(Lokhttp3/internal/http2/Http2Stream;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 1070
    .line 1071
    .line 1072
    goto :goto_14

    .line 1073
    :catch_1
    move-exception v0

    .line 1074
    sget-object v3, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 1075
    .line 1076
    sget-object v3, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 1077
    .line 1078
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1079
    .line 1080
    const-string v5, "Http2Connection.Listener failure for "

    .line 1081
    .line 1082
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    iget-object v1, v1, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 1086
    .line 1087
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    const/4 v4, 0x4

    .line 1095
    invoke-virtual {v3, v4, v1, v0}, Lokhttp3/internal/platform/Platform;->k(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 1096
    .line 1097
    .line 1098
    :try_start_8
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 1099
    .line 1100
    invoke-virtual {v2, v1, v0}, Lokhttp3/internal/http2/Http2Stream;->e(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 1101
    .line 1102
    .line 1103
    :catch_2
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1104
    .line 1105
    return-object v0

    .line 1106
    :pswitch_11
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1107
    .line 1108
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1109
    .line 1110
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1111
    .line 1112
    check-cast v0, La/fpw;

    .line 1113
    .line 1114
    new-instance v2, La/xqw;

    .line 1115
    .line 1116
    iget-object v0, v0, La/fpw;->a:Ljava/lang/String;

    .line 1117
    .line 1118
    invoke-direct {v2, v0}, La/xqw;-><init>(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1125
    .line 1126
    return-object v0

    .line 1127
    :pswitch_12
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1128
    .line 1129
    check-cast v1, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 1130
    .line 1131
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1132
    .line 1133
    check-cast v0, La/wyu;

    .line 1134
    .line 1135
    new-instance v8, La/gnw;

    .line 1136
    .line 1137
    const-string v12, ""

    .line 1138
    .line 1139
    sget-object v13, La/lak0;->c:La/lak0;

    .line 1140
    .line 1141
    new-instance v14, La/wmw;

    .line 1142
    .line 1143
    const-string v2, ""

    .line 1144
    .line 1145
    sget-object v3, La/hmw;->d:La/hmw;

    .line 1146
    .line 1147
    invoke-direct {v14, v2, v3, v2, v2}, La/wmw;-><init>(Ljava/lang/String;La/hmw;Ljava/lang/String;Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    new-instance v15, La/mc5;

    .line 1151
    .line 1152
    iget-wide v1, v1, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;->a:J

    .line 1153
    .line 1154
    sget-object v3, La/uaq0;->a:La/s9m0;

    .line 1155
    .line 1156
    invoke-static {v0, v3}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 1157
    .line 1158
    .line 1159
    move-result v0

    .line 1160
    xor-int/2addr v0, v7

    .line 1161
    invoke-direct {v15, v0, v1, v2}, La/mc5;-><init>(ZJ)V

    .line 1162
    .line 1163
    .line 1164
    const/4 v9, 0x1

    .line 1165
    const/4 v10, 0x0

    .line 1166
    const/4 v11, 0x0

    .line 1167
    invoke-direct/range {v8 .. v15}, La/gnw;-><init>(ZZZLjava/lang/String;Ljava/util/List;La/wmw;La/nc5;)V

    .line 1168
    .line 1169
    .line 1170
    return-object v8

    .line 1171
    :pswitch_13
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1172
    .line 1173
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1174
    .line 1175
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1176
    .line 1177
    check-cast v0, La/xjw;

    .line 1178
    .line 1179
    iget v2, v0, La/xjw;->a:I

    .line 1180
    .line 1181
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    iget-object v0, v0, La/xjw;->b:Ljava/lang/String;

    .line 1186
    .line 1187
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1191
    .line 1192
    return-object v0

    .line 1193
    :pswitch_14
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1196
    .line 1197
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1198
    .line 1199
    check-cast v0, La/siw;

    .line 1200
    .line 1201
    new-instance v2, La/jhw;

    .line 1202
    .line 1203
    iget-object v0, v0, La/siw;->c:La/eiw;

    .line 1204
    .line 1205
    iget-object v0, v0, La/eiw;->a:Ljava/lang/String;

    .line 1206
    .line 1207
    invoke-direct {v2, v0}, La/jhw;-><init>(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1214
    .line 1215
    return-object v0

    .line 1216
    :pswitch_15
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1217
    .line 1218
    check-cast v1, La/oaw;

    .line 1219
    .line 1220
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast v0, La/lm40;

    .line 1223
    .line 1224
    invoke-virtual {v1, v0}, La/oaw;->d(La/lm40;)V

    .line 1225
    .line 1226
    .line 1227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_16
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1231
    .line 1232
    check-cast v1, La/izv;

    .line 1233
    .line 1234
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v0, La/n3w;

    .line 1237
    .line 1238
    sget-object v2, La/izv;->d2:La/rqt;

    .line 1239
    .line 1240
    invoke-virtual {v1}, La/izv;->M0()La/jzv;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v2

    .line 1244
    invoke-virtual {v1}, La/izv;->H0()J

    .line 1245
    .line 1246
    .line 1247
    move-result-wide v3

    .line 1248
    sget-object v1, La/sys0;->b:La/sys0;

    .line 1249
    .line 1250
    iget-object v2, v2, La/jzv;->d:La/z4w;

    .line 1251
    .line 1252
    invoke-virtual {v2, v0, v3, v4, v1}, La/z4w;->A(La/n3w;JLa/sys0;)V

    .line 1253
    .line 1254
    .line 1255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1256
    .line 1257
    return-object v0

    .line 1258
    :pswitch_17
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1259
    .line 1260
    check-cast v1, La/axv;

    .line 1261
    .line 1262
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1263
    .line 1264
    check-cast v0, Lorg/xplatform/bet_history/history/domain/model/bet_history/TimeTypeModel;

    .line 1265
    .line 1266
    iget-object v2, v1, La/axv;->l2:La/phf0;

    .line 1267
    .line 1268
    sget-object v3, La/axv;->o2:[La/iiy;

    .line 1269
    .line 1270
    aget-object v3, v3, v7

    .line 1271
    .line 1272
    invoke-virtual {v2, v1, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    const-string v3, "TIME_MODEL_RESULT"

    .line 1277
    .line 1278
    new-instance v4, Lkotlin/Pair;

    .line 1279
    .line 1280
    invoke-direct {v4, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-static {v0, v1, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v1}, La/yo8;->y0()V

    .line 1295
    .line 1296
    .line 1297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1298
    .line 1299
    return-object v0

    .line 1300
    :pswitch_18
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1301
    .line 1302
    check-cast v1, La/x6f;

    .line 1303
    .line 1304
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1305
    .line 1306
    check-cast v0, La/tvv;

    .line 1307
    .line 1308
    iget-wide v2, v0, La/tvv;->a:J

    .line 1309
    .line 1310
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    invoke-virtual {v1, v0}, La/x6f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1318
    .line 1319
    return-object v0

    .line 1320
    :pswitch_19
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1323
    .line 1324
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1325
    .line 1326
    check-cast v0, La/dsv;

    .line 1327
    .line 1328
    iget-object v0, v0, La/dsv;->b:La/sip;

    .line 1329
    .line 1330
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1334
    .line 1335
    return-object v0

    .line 1336
    :pswitch_1a
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1339
    .line 1340
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v0, La/esv;

    .line 1343
    .line 1344
    iget-object v0, v0, La/esv;->a:Ljava/lang/String;

    .line 1345
    .line 1346
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1350
    .line 1351
    return-object v0

    .line 1352
    :pswitch_1b
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1353
    .line 1354
    check-cast v1, La/mco;

    .line 1355
    .line 1356
    iget-object v2, v1, La/mco;->r:La/n0o0;

    .line 1357
    .line 1358
    iget-object v3, v1, La/mco;->s:La/n0o0;

    .line 1359
    .line 1360
    iget-object v4, v1, La/mco;->o:La/n0o0;

    .line 1361
    .line 1362
    iget-object v6, v1, La/mco;->n:La/n0o0;

    .line 1363
    .line 1364
    iget-object v8, v1, La/mco;->m:La/n0o0;

    .line 1365
    .line 1366
    iget-object v9, v1, La/mco;->p:La/n0o0;

    .line 1367
    .line 1368
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1369
    .line 1370
    check-cast v0, La/jih;

    .line 1371
    .line 1372
    iget-object v10, v1, La/mco;->q:La/n0o0;

    .line 1373
    .line 1374
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v11

    .line 1378
    check-cast v11, La/fee;

    .line 1379
    .line 1380
    iget-object v12, v0, La/jih;->b:Ljava/lang/Object;

    .line 1381
    .line 1382
    sget-object v13, La/j0g0;->b:La/e0g0;

    .line 1383
    .line 1384
    instance-of v13, v12, La/g0g0;

    .line 1385
    .line 1386
    if-eqz v13, :cond_22

    .line 1387
    .line 1388
    move-object v12, v5

    .line 1389
    :cond_22
    check-cast v12, Ljava/util/List;

    .line 1390
    .line 1391
    if-nez v12, :cond_23

    .line 1392
    .line 1393
    sget-object v12, La/iun;->a:La/iun;

    .line 1394
    .line 1395
    :cond_23
    invoke-virtual {v11, v12}, La/fee;->d(Ljava/lang/Object;)V

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v11

    .line 1402
    check-cast v11, La/fee;

    .line 1403
    .line 1404
    invoke-virtual {v1}, La/mco;->b()La/fee;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v12

    .line 1408
    invoke-virtual {v11, v12}, La/fee;->d(Ljava/lang/Object;)V

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v11

    .line 1415
    check-cast v11, La/fee;

    .line 1416
    .line 1417
    invoke-static {v0}, La/jwb;->X(La/jih;)La/xqv;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v12

    .line 1421
    invoke-virtual {v11, v12}, La/fee;->d(Ljava/lang/Object;)V

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v11

    .line 1428
    check-cast v11, La/fee;

    .line 1429
    .line 1430
    invoke-virtual {v1}, La/mco;->b()La/fee;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v1

    .line 1438
    check-cast v1, La/ekw;

    .line 1439
    .line 1440
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1441
    .line 1442
    invoke-static {v0, v1, v7}, La/kih;->a(La/jih;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Z

    .line 1443
    .line 1444
    .line 1445
    move-result v1

    .line 1446
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v1

    .line 1450
    invoke-virtual {v11, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v1

    .line 1457
    check-cast v1, La/fee;

    .line 1458
    .line 1459
    iget-object v7, v0, La/jih;->e:Ljava/lang/Object;

    .line 1460
    .line 1461
    instance-of v11, v7, La/g0g0;

    .line 1462
    .line 1463
    if-eqz v11, :cond_24

    .line 1464
    .line 1465
    move-object v7, v5

    .line 1466
    :cond_24
    check-cast v7, Ljava/util/List;

    .line 1467
    .line 1468
    if-nez v7, :cond_25

    .line 1469
    .line 1470
    sget-object v7, La/iun;->a:La/iun;

    .line 1471
    .line 1472
    :cond_25
    invoke-virtual {v1, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v1

    .line 1479
    check-cast v1, La/fee;

    .line 1480
    .line 1481
    invoke-static {v0}, La/phu0;->W(La/jih;)La/n52;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v7

    .line 1485
    invoke-virtual {v1, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v1

    .line 1492
    check-cast v1, La/fee;

    .line 1493
    .line 1494
    iget-object v0, v0, La/jih;->i:Ljava/lang/Object;

    .line 1495
    .line 1496
    instance-of v7, v0, La/g0g0;

    .line 1497
    .line 1498
    if-eqz v7, :cond_26

    .line 1499
    .line 1500
    goto :goto_15

    .line 1501
    :cond_26
    move-object v5, v0

    .line 1502
    :goto_15
    check-cast v5, Ljava/util/List;

    .line 1503
    .line 1504
    if-nez v5, :cond_27

    .line 1505
    .line 1506
    sget-object v5, La/iun;->a:La/iun;

    .line 1507
    .line 1508
    :cond_27
    invoke-static {v5}, La/cwr0;->S(Ljava/util/List;)La/n52;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    invoke-virtual {v1, v0}, La/fee;->d(Ljava/lang/Object;)V

    .line 1513
    .line 1514
    .line 1515
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v1

    .line 1523
    check-cast v1, La/fee;

    .line 1524
    .line 1525
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1

    .line 1529
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v1

    .line 1536
    check-cast v1, La/fee;

    .line 1537
    .line 1538
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v1

    .line 1542
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    check-cast v1, La/fee;

    .line 1550
    .line 1551
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v1

    .line 1555
    check-cast v1, Ljava/util/Collection;

    .line 1556
    .line 1557
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v1

    .line 1564
    check-cast v1, La/fee;

    .line 1565
    .line 1566
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v1

    .line 1570
    check-cast v1, Ljava/util/Collection;

    .line 1571
    .line 1572
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v1

    .line 1579
    check-cast v1, La/fee;

    .line 1580
    .line 1581
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v1

    .line 1585
    check-cast v1, Ljava/util/Collection;

    .line 1586
    .line 1587
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v1

    .line 1594
    check-cast v1, La/fee;

    .line 1595
    .line 1596
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v1

    .line 1600
    check-cast v1, Ljava/util/Collection;

    .line 1601
    .line 1602
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v1

    .line 1609
    check-cast v1, La/fee;

    .line 1610
    .line 1611
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v1

    .line 1615
    check-cast v1, Ljava/util/Collection;

    .line 1616
    .line 1617
    invoke-static {v0, v1, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    return-object v0

    .line 1622
    :pswitch_1c
    iget-object v1, v0, La/wqv;->b:Ljava/lang/Object;

    .line 1623
    .line 1624
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1625
    .line 1626
    iget-object v0, v0, La/wqv;->c:Ljava/lang/Object;

    .line 1627
    .line 1628
    check-cast v0, La/vqv;

    .line 1629
    .line 1630
    iget-wide v2, v0, La/vqv;->d:J

    .line 1631
    .line 1632
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1640
    .line 1641
    return-object v0

    .line 1642
    nop

    .line 1643
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
