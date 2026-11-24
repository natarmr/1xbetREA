.class public final synthetic La/qzn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qzn;->a:B

    iput-object p1, p0, La/qzn;->b:Ljava/lang/Object;

    iput-object p2, p0, La/qzn;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/qzn;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "rootView"

    .line 5
    .line 6
    const/4 v3, 0x3

    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v8, p0, La/qzn;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, La/qzn;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, La/mmn;

    .line 20
    .line 21
    check-cast v8, La/cp;

    .line 22
    .line 23
    check-cast p1, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v8}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, La/mmn;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p0, La/i3p;

    .line 39
    .line 40
    check-cast v8, La/x2p;

    .line 41
    .line 42
    check-cast p1, La/k0w0;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/i3p;->w:La/ifp;

    .line 48
    .line 49
    new-instance v0, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;

    .line 50
    .line 51
    iget-wide v1, v8, La/x2p;->b:J

    .line 52
    .line 53
    iget-object v3, v8, La/x2p;->g:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v0, v1, v2, v3}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;-><init>(JLjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v1, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 62
    .line 63
    invoke-direct {v1, p0, v0}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    check-cast p0, La/z2p;

    .line 73
    .line 74
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    check-cast p1, La/hcz;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/z2p;->a:La/a4x;

    .line 82
    .line 83
    new-instance v0, La/mmn;

    .line 84
    .line 85
    const/16 v2, 0x19

    .line 86
    .line 87
    invoke-direct {v0, v2}, La/mmn;-><init>(B)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    new-instance v3, La/d2p;

    .line 95
    .line 96
    invoke-direct {v3, v0, p0, v1}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    new-instance v0, La/yul;

    .line 100
    .line 101
    const/4 v1, 0x5

    .line 102
    invoke-direct {v0, p0, v8, v1}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 103
    .line 104
    .line 105
    new-instance p0, La/ugd;

    .line 106
    .line 107
    const v1, 0x2fd4df92

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v1, v5, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v2, v7, v3, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_2
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    check-cast v8, La/cuo;

    .line 122
    .line 123
    check-cast p1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v0, La/t27;

    .line 129
    .line 130
    iget-object v1, v8, La/cuo;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-direct {v0, p1, v1}, La/t27;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_3
    check-cast p0, La/cgj;

    .line 142
    .line 143
    check-cast v8, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;

    .line 144
    .line 145
    check-cast p1, La/wgl0;

    .line 146
    .line 147
    sget v0, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->r:I

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object p1, v8, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->q:La/uk5;

    .line 153
    .line 154
    iget-object p1, p1, La/uk5;->f:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p1, Landroidx/compose/ui/platform/ComposeView;

    .line 157
    .line 158
    invoke-virtual {p0, p1}, La/cgj;->onClick(Landroid/view/View;)V

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_4
    check-cast p0, La/wma0;

    .line 165
    .line 166
    check-cast v8, La/wma0;

    .line 167
    .line 168
    check-cast p1, La/cp;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v0, La/if6;

    .line 174
    .line 175
    invoke-direct {v0, p1, p0, v8, p1}, La/if6;-><init>(La/cp;La/wma0;La/wma0;La/cp;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_5
    check-cast p0, La/who;

    .line 185
    .line 186
    check-cast v8, La/vne;

    .line 187
    .line 188
    check-cast p1, Ljava/lang/Throwable;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, La/who;->h:La/p7m0;

    .line 197
    .line 198
    sget-object v1, La/i8d;->e:La/i8d;

    .line 199
    .line 200
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, p1, v8}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_6
    check-cast p0, La/udo;

    .line 210
    .line 211
    check-cast v8, La/vne;

    .line 212
    .line 213
    check-cast p1, Ljava/lang/Throwable;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, La/udo;->h:La/p7m0;

    .line 222
    .line 223
    sget-object v1, La/i8d;->e:La/i8d;

    .line 224
    .line 225
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, p1, v8}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 229
    .line 230
    .line 231
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_7
    check-cast p0, La/o9o;

    .line 235
    .line 236
    check-cast v8, La/n9o;

    .line 237
    .line 238
    check-cast p1, Ljava/lang/Throwable;

    .line 239
    .line 240
    iget-object p0, p0, La/o9o;->b:La/p7d;

    .line 241
    .line 242
    invoke-virtual {p0, v8}, La/p7d;->f(La/bmf0;)V

    .line 243
    .line 244
    .line 245
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_8
    check-cast p0, La/g8o;

    .line 249
    .line 250
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 251
    .line 252
    check-cast p1, La/hcz;

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    check-cast p0, La/e8o;

    .line 258
    .line 259
    iget-object p0, p0, La/e8o;->b:Ljava/util/ArrayList;

    .line 260
    .line 261
    new-instance v0, La/x6o;

    .line 262
    .line 263
    invoke-direct {v0, v1}, La/x6o;-><init>(B)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    new-instance v2, La/ctl;

    .line 271
    .line 272
    const/16 v3, 0x1a

    .line 273
    .line 274
    invoke-direct {v2, v0, p0, v3}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 275
    .line 276
    .line 277
    new-instance v0, La/j13;

    .line 278
    .line 279
    const/16 v3, 0xd

    .line 280
    .line 281
    invoke-direct {v0, p0, v3, v6}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 282
    .line 283
    .line 284
    new-instance v3, La/sh0;

    .line 285
    .line 286
    const/4 v4, 0x4

    .line 287
    invoke-direct {v3, p0, v8, v4}, La/sh0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 288
    .line 289
    .line 290
    new-instance p0, La/ugd;

    .line 291
    .line 292
    const v4, 0x799532c4

    .line 293
    .line 294
    .line 295
    invoke-direct {p0, v4, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, v1, v2, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 299
    .line 300
    .line 301
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_9
    check-cast p0, La/gvu0;

    .line 305
    .line 306
    check-cast v8, Landroid/content/Context;

    .line 307
    .line 308
    check-cast p1, La/w8o0;

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iget-object v0, p0, La/gvu0;->e:Ljava/lang/String;

    .line 314
    .line 315
    iget-object v1, p1, La/w8o0;->b:Landroid/widget/TextView;

    .line 316
    .line 317
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v0, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    float-to-int v0, v0

    .line 326
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 327
    .line 328
    .line 329
    iget-object v0, p0, La/gvu0;->c:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    .line 333
    .line 334
    iget-object v0, p0, La/gvu0;->f:Ljava/lang/String;

    .line 335
    .line 336
    iget-object v1, p1, La/w8o0;->c:Landroid/widget/TextView;

    .line 337
    .line 338
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-static {v0, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    float-to-int v0, v0

    .line 347
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 348
    .line 349
    .line 350
    iget-object v0, p0, La/gvu0;->d:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 353
    .line 354
    .line 355
    iget-object v0, p1, La/w8o0;->d:Landroid/widget/TextView;

    .line 356
    .line 357
    iget-object v1, p0, La/gvu0;->b:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    iget-object p1, p1, La/w8o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 363
    .line 364
    iget p0, p0, La/gvu0;->h:I

    .line 365
    .line 366
    invoke-static {p0, v8}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 371
    .line 372
    .line 373
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object p0

    .line 376
    :pswitch_a
    check-cast p0, La/fvu0;

    .line 377
    .line 378
    check-cast v8, Landroid/view/animation/Animation;

    .line 379
    .line 380
    check-cast p1, La/v8o0;

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iget-object v0, p1, La/v8o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 386
    .line 387
    iget-object v1, p1, La/v8o0;->c:Landroid/widget/ImageView;

    .line 388
    .line 389
    iget-object v2, p1, La/v8o0;->b:Landroid/widget/ImageView;

    .line 390
    .line 391
    iget v3, p0, La/fvu0;->e:I

    .line 392
    .line 393
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 394
    .line 395
    .line 396
    iget-object v0, p1, La/v8o0;->d:Landroid/widget/TextView;

    .line 397
    .line 398
    iget-object v3, p0, La/fvu0;->a:Ljava/lang/String;

    .line 399
    .line 400
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    .line 402
    .line 403
    iget-object p1, p1, La/v8o0;->e:Landroid/widget/TextView;

    .line 404
    .line 405
    iget-object v0, p0, La/fvu0;->b:Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-boolean p1, p0, La/fvu0;->c:Z

    .line 414
    .line 415
    if-eqz p1, :cond_0

    .line 416
    .line 417
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 427
    .line 428
    .line 429
    :cond_0
    iget-boolean p0, p0, La/fvu0;->d:Z

    .line 430
    .line 431
    if-eqz p0, :cond_1

    .line 432
    .line 433
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V

    .line 443
    .line 444
    .line 445
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 446
    .line 447
    return-object p0

    .line 448
    :pswitch_b
    check-cast p0, La/xdu0;

    .line 449
    .line 450
    check-cast v8, La/clz;

    .line 451
    .line 452
    check-cast p1, La/t8o0;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    iget-object p1, p1, La/t8o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;

    .line 458
    .line 459
    iget-object v0, p0, La/xdu0;->g:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerFormula(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    iget-object v0, p0, La/xdu0;->h:Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerFormula(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    iget-object v0, p0, La/xdu0;->a:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerFirstNumber(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    iget-object v0, p0, La/xdu0;->b:Ljava/lang/String;

    .line 475
    .line 476
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerSecondNumber(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    iget-object v0, p0, La/xdu0;->c:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerThirdNumber(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    iget-object v0, p0, La/xdu0;->d:Ljava/lang/String;

    .line 485
    .line 486
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerFirstNumber(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    iget-object v0, p0, La/xdu0;->e:Ljava/lang/String;

    .line 490
    .line 491
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerSecondNumber(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    iget-object v0, p0, La/xdu0;->f:Ljava/lang/String;

    .line 495
    .line 496
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerThirdNumber(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    iget-object v0, p0, La/xdu0;->i:Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerTotalScore(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    iget-object v0, p0, La/xdu0;->j:Ljava/lang/String;

    .line 505
    .line 506
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerTotalScore(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object v0, p0, La/xdu0;->k:La/udu0;

    .line 510
    .line 511
    iget-wide v1, v0, La/udu0;->a:J

    .line 512
    .line 513
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    iget-object v0, v0, La/udu0;->b:Ljava/lang/Long;

    .line 518
    .line 519
    invoke-virtual {p1, v1, v2, v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->u(JLa/tkz;Ljava/lang/Long;)V

    .line 520
    .line 521
    .line 522
    iget-object p0, p0, La/xdu0;->l:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setWinnerText(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object p0

    .line 530
    :pswitch_c
    check-cast p0, La/s8o0;

    .line 531
    .line 532
    check-cast v8, Landroid/content/Context;

    .line 533
    .line 534
    check-cast p1, La/r8o0;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    iget-object v0, p1, La/r8o0;->d:Landroid/widget/TextView;

    .line 540
    .line 541
    iget-object v1, p0, La/s8o0;->e:Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    iget-object v0, p1, La/r8o0;->c:Landroid/widget/TextView;

    .line 547
    .line 548
    iget-object v1, p0, La/s8o0;->c:Ljava/lang/String;

    .line 549
    .line 550
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    .line 552
    .line 553
    iget-object v0, p1, La/r8o0;->e:Landroid/widget/TextView;

    .line 554
    .line 555
    iget-object v1, p0, La/s8o0;->d:Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 558
    .line 559
    .line 560
    iget-object v0, p1, La/r8o0;->b:Landroid/widget/TextView;

    .line 561
    .line 562
    iget-object v1, p0, La/s8o0;->b:Ljava/lang/String;

    .line 563
    .line 564
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 565
    .line 566
    .line 567
    iget-object p1, p1, La/r8o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 568
    .line 569
    iget p0, p0, La/s8o0;->f:I

    .line 570
    .line 571
    invoke-static {p0, v8}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 576
    .line 577
    .line 578
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object p0

    .line 581
    :pswitch_d
    check-cast p0, La/g8o0;

    .line 582
    .line 583
    check-cast v8, Ljava/util/List;

    .line 584
    .line 585
    check-cast p1, La/f8o0;

    .line 586
    .line 587
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    iget-object p1, p1, La/f8o0;->b:Landroid/widget/LinearLayout;

    .line 591
    .line 592
    iget-object p0, p0, La/g8o0;->a:Ljava/util/ArrayList;

    .line 593
    .line 594
    new-instance v0, La/ihu0;

    .line 595
    .line 596
    invoke-direct {v0, p1}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    move v1, v6

    .line 604
    :goto_0
    move-object v3, v0

    .line 605
    check-cast v3, La/jhu0;

    .line 606
    .line 607
    invoke-virtual {v3}, La/jhu0;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    if-eqz v5, :cond_4

    .line 612
    .line 613
    invoke-virtual {v3}, La/jhu0;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    add-int/lit8 v5, v1, 0x1

    .line 618
    .line 619
    if-ltz v1, :cond_3

    .line 620
    .line 621
    check-cast v3, Landroid/view/View;

    .line 622
    .line 623
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 624
    .line 625
    .line 626
    move-result v9

    .line 627
    if-ge v1, v9, :cond_2

    .line 628
    .line 629
    move v1, v6

    .line 630
    goto :goto_1

    .line 631
    :cond_2
    move v1, v4

    .line 632
    :goto_1
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 633
    .line 634
    .line 635
    move v1, v5

    .line 636
    goto :goto_0

    .line 637
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 638
    .line 639
    .line 640
    throw v7

    .line 641
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object p0

    .line 645
    move v0, v6

    .line 646
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v1

    .line 650
    if-eqz v1, :cond_8

    .line 651
    .line 652
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    add-int/lit8 v3, v0, 0x1

    .line 657
    .line 658
    if-ltz v0, :cond_7

    .line 659
    .line 660
    check-cast v1, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    check-cast v0, La/i8o0;

    .line 667
    .line 668
    if-nez v0, :cond_6

    .line 669
    .line 670
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    const v4, 0x7f0d05ec

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0, v4, p1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    if-eqz v0, :cond_5

    .line 686
    .line 687
    check-cast v0, Landroid/widget/TextView;

    .line 688
    .line 689
    new-instance v4, La/i8o0;

    .line 690
    .line 691
    invoke-direct {v4, v0, v0}, La/i8o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 695
    .line 696
    .line 697
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-object v0, v4

    .line 701
    goto :goto_3

    .line 702
    :cond_5
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    goto :goto_4

    .line 706
    :cond_6
    :goto_3
    iget-object v0, v0, La/i8o0;->b:Landroid/widget/TextView;

    .line 707
    .line 708
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 709
    .line 710
    .line 711
    move v0, v3

    .line 712
    goto :goto_2

    .line 713
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 714
    .line 715
    .line 716
    throw v7

    .line 717
    :cond_8
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 718
    .line 719
    :goto_4
    return-object v7

    .line 720
    :pswitch_e
    check-cast p0, La/y7o0;

    .line 721
    .line 722
    check-cast v8, Ljava/util/List;

    .line 723
    .line 724
    check-cast p1, La/x7o0;

    .line 725
    .line 726
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    iget-object p1, p1, La/x7o0;->b:Landroid/widget/LinearLayout;

    .line 730
    .line 731
    iget-object p0, p0, La/y7o0;->a:Ljava/util/ArrayList;

    .line 732
    .line 733
    new-instance v0, La/ihu0;

    .line 734
    .line 735
    invoke-direct {v0, p1}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    move v1, v6

    .line 743
    :goto_5
    move-object v3, v0

    .line 744
    check-cast v3, La/jhu0;

    .line 745
    .line 746
    invoke-virtual {v3}, La/jhu0;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v5

    .line 750
    if-eqz v5, :cond_b

    .line 751
    .line 752
    invoke-virtual {v3}, La/jhu0;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    add-int/lit8 v5, v1, 0x1

    .line 757
    .line 758
    if-ltz v1, :cond_a

    .line 759
    .line 760
    check-cast v3, Landroid/view/View;

    .line 761
    .line 762
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 763
    .line 764
    .line 765
    move-result v9

    .line 766
    if-ge v1, v9, :cond_9

    .line 767
    .line 768
    move v1, v6

    .line 769
    goto :goto_6

    .line 770
    :cond_9
    move v1, v4

    .line 771
    :goto_6
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 772
    .line 773
    .line 774
    move v1, v5

    .line 775
    goto :goto_5

    .line 776
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 777
    .line 778
    .line 779
    throw v7

    .line 780
    :cond_b
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 781
    .line 782
    .line 783
    move-result-object p0

    .line 784
    move v0, v6

    .line 785
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    if-eqz v1, :cond_f

    .line 790
    .line 791
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    add-int/lit8 v3, v0, 0x1

    .line 796
    .line 797
    if-ltz v0, :cond_e

    .line 798
    .line 799
    check-cast v1, Ljava/lang/String;

    .line 800
    .line 801
    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    check-cast v0, La/a8o0;

    .line 806
    .line 807
    if-nez v0, :cond_d

    .line 808
    .line 809
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    const v4, 0x7f0d05e6

    .line 818
    .line 819
    .line 820
    invoke-virtual {v0, v4, p1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    if-eqz v0, :cond_c

    .line 825
    .line 826
    check-cast v0, Landroid/widget/TextView;

    .line 827
    .line 828
    new-instance v4, La/a8o0;

    .line 829
    .line 830
    invoke-direct {v4, v0, v0}, La/a8o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 834
    .line 835
    .line 836
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-object v0, v4

    .line 840
    goto :goto_8

    .line 841
    :cond_c
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    goto :goto_9

    .line 845
    :cond_d
    :goto_8
    iget-object v0, v0, La/a8o0;->b:Landroid/widget/TextView;

    .line 846
    .line 847
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 848
    .line 849
    .line 850
    move v0, v3

    .line 851
    goto :goto_7

    .line 852
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 853
    .line 854
    .line 855
    throw v7

    .line 856
    :cond_f
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 857
    .line 858
    :goto_9
    return-object v7

    .line 859
    :pswitch_f
    check-cast p0, La/iyh0;

    .line 860
    .line 861
    check-cast v8, La/clz;

    .line 862
    .line 863
    check-cast p1, La/v7o0;

    .line 864
    .line 865
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iget-object p1, p1, La/v7o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;

    .line 869
    .line 870
    iget-object v0, p0, La/iyh0;->a:Ljava/util/ArrayList;

    .line 871
    .line 872
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setFirstPlayerCards(Ljava/util/List;)V

    .line 873
    .line 874
    .line 875
    iget-object v0, p0, La/iyh0;->b:Ljava/util/ArrayList;

    .line 876
    .line 877
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setSecondPlayerCards(Ljava/util/List;)V

    .line 878
    .line 879
    .line 880
    iget-object v0, p0, La/iyh0;->c:La/vxh0;

    .line 881
    .line 882
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setMatchStatus(La/vxh0;)V

    .line 883
    .line 884
    .line 885
    iget-object v0, p0, La/iyh0;->d:La/pxh0;

    .line 886
    .line 887
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setFirstPlayerCardsSum(La/pxh0;)V

    .line 888
    .line 889
    .line 890
    iget-object v0, p0, La/iyh0;->e:La/pxh0;

    .line 891
    .line 892
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setSecondPlayerCardsSum(La/pxh0;)V

    .line 893
    .line 894
    .line 895
    iget-object v0, p0, La/iyh0;->f:La/gyh0;

    .line 896
    .line 897
    iget-wide v1, v0, La/gyh0;->a:J

    .line 898
    .line 899
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    iget-object v0, v0, La/gyh0;->b:Ljava/lang/Long;

    .line 904
    .line 905
    invoke-virtual {p1, v1, v2, v4, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->u(JLa/tkz;Ljava/lang/Long;)V

    .line 906
    .line 907
    .line 908
    iget-boolean p0, p0, La/iyh0;->g:Z

    .line 909
    .line 910
    if-eqz p0, :cond_10

    .line 911
    .line 912
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 913
    .line 914
    .line 915
    goto :goto_a

    .line 916
    :cond_10
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 917
    .line 918
    .line 919
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 920
    .line 921
    return-object p0

    .line 922
    :pswitch_10
    check-cast p0, La/clz;

    .line 923
    .line 924
    check-cast v8, La/npg0;

    .line 925
    .line 926
    check-cast p1, La/t7o0;

    .line 927
    .line 928
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    invoke-static {p0}, La/g1x;->u(La/clz;)La/tkz;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    iget-object v0, p1, La/t7o0;->f:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 936
    .line 937
    iget-object p0, v8, La/npg0;->a:La/kpg0;

    .line 938
    .line 939
    iget-wide v1, p0, La/kpg0;->a:J

    .line 940
    .line 941
    iget-object v4, p0, La/kpg0;->b:Ljava/lang/Long;

    .line 942
    .line 943
    const/4 v5, 0x4

    .line 944
    invoke-static/range {v0 .. v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 945
    .line 946
    .line 947
    iget-object p0, p1, La/t7o0;->b:La/vd7;

    .line 948
    .line 949
    iget-object v0, p0, La/vd7;->d:Landroid/view/View;

    .line 950
    .line 951
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;

    .line 952
    .line 953
    iget-object v1, v8, La/npg0;->b:Ljava/util/ArrayList;

    .line 954
    .line 955
    iget-object v2, v8, La/npg0;->f:Ljava/util/List;

    .line 956
    .line 957
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;->c(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 958
    .line 959
    .line 960
    iget-object v0, p1, La/t7o0;->e:La/vd7;

    .line 961
    .line 962
    iget-object v1, v0, La/vd7;->d:Landroid/view/View;

    .line 963
    .line 964
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;

    .line 965
    .line 966
    iget-object v3, v8, La/npg0;->c:Ljava/util/ArrayList;

    .line 967
    .line 968
    invoke-virtual {v1, v3, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;->c(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 969
    .line 970
    .line 971
    invoke-static {p1, v8}, La/vfc;->C(La/t7o0;La/npg0;)V

    .line 972
    .line 973
    .line 974
    iget-object p0, p0, La/vd7;->c:Landroid/view/View;

    .line 975
    .line 976
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;

    .line 977
    .line 978
    iget-object v1, v8, La/npg0;->d:La/uog0;

    .line 979
    .line 980
    iget-object v2, v1, La/uog0;->a:Ljava/lang/String;

    .line 981
    .line 982
    iget v3, v1, La/uog0;->b:I

    .line 983
    .line 984
    iget v1, v1, La/uog0;->c:I

    .line 985
    .line 986
    invoke-virtual {p0, v3, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;->a(IILjava/lang/String;)V

    .line 987
    .line 988
    .line 989
    iget-object p0, v0, La/vd7;->c:Landroid/view/View;

    .line 990
    .line 991
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;

    .line 992
    .line 993
    iget-object v0, v8, La/npg0;->e:La/uog0;

    .line 994
    .line 995
    iget-object v1, v0, La/uog0;->a:Ljava/lang/String;

    .line 996
    .line 997
    iget v2, v0, La/uog0;->b:I

    .line 998
    .line 999
    iget v0, v0, La/uog0;->c:I

    .line 1000
    .line 1001
    invoke-virtual {p0, v2, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;->a(IILjava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-static {p1, v8}, La/vfc;->E(La/t7o0;La/npg0;)V

    .line 1005
    .line 1006
    .line 1007
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object p0

    .line 1010
    :pswitch_11
    check-cast p0, La/hfg0;

    .line 1011
    .line 1012
    check-cast v8, La/ifg0;

    .line 1013
    .line 1014
    check-cast p1, La/p7o0;

    .line 1015
    .line 1016
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    iget-object p1, p1, La/p7o0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1020
    .line 1021
    invoke-virtual {p1, v7}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    if-nez v0, :cond_11

    .line 1029
    .line 1030
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 1031
    .line 1032
    .line 1033
    :cond_11
    iget-object p1, v8, La/ifg0;->a:Ljava/util/ArrayList;

    .line 1034
    .line 1035
    invoke-virtual {p0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 1036
    .line 1037
    .line 1038
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1039
    .line 1040
    return-object p0

    .line 1041
    :pswitch_12
    check-cast p0, La/vqb0;

    .line 1042
    .line 1043
    check-cast v8, La/clz;

    .line 1044
    .line 1045
    check-cast p1, La/o6o0;

    .line 1046
    .line 1047
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    iget-object p1, p1, La/o6o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;

    .line 1051
    .line 1052
    iget-object v0, p0, La/vqb0;->c:Ljava/lang/String;

    .line 1053
    .line 1054
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->setDescription(Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    iget-boolean v0, p0, La/vqb0;->b:Z

    .line 1058
    .line 1059
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->setTimerVisibility(Z)V

    .line 1060
    .line 1061
    .line 1062
    iget-wide v0, p0, La/vqb0;->a:J

    .line 1063
    .line 1064
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 1065
    .line 1066
    .line 1067
    move-result-object p0

    .line 1068
    invoke-virtual {p1, v0, v1, p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->a(JLa/tkz;)V

    .line 1069
    .line 1070
    .line 1071
    const p0, 0x7f080974

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->setIcon(I)V

    .line 1075
    .line 1076
    .line 1077
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1078
    .line 1079
    return-object p0

    .line 1080
    :pswitch_13
    check-cast p0, La/f6o0;

    .line 1081
    .line 1082
    check-cast v8, La/poy;

    .line 1083
    .line 1084
    check-cast p1, Ljava/lang/Boolean;

    .line 1085
    .line 1086
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1087
    .line 1088
    .line 1089
    move-result p1

    .line 1090
    iget-object v0, p0, La/f6o0;->e:Landroid/widget/TextView;

    .line 1091
    .line 1092
    iget-object v1, v8, La/poy;->i:La/koy;

    .line 1093
    .line 1094
    iget-object v2, v1, La/koy;->a:Ljava/lang/String;

    .line 1095
    .line 1096
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1097
    .line 1098
    .line 1099
    if-nez p1, :cond_13

    .line 1100
    .line 1101
    iget-boolean v1, v1, La/koy;->b:Z

    .line 1102
    .line 1103
    if-eqz v1, :cond_12

    .line 1104
    .line 1105
    goto :goto_b

    .line 1106
    :cond_12
    move v1, v4

    .line 1107
    goto :goto_c

    .line 1108
    :cond_13
    :goto_b
    move v1, v6

    .line 1109
    :goto_c
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1110
    .line 1111
    .line 1112
    iget-object p0, p0, La/f6o0;->d:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 1113
    .line 1114
    if-nez p1, :cond_14

    .line 1115
    .line 1116
    iget-object p1, v8, La/poy;->d:La/noy;

    .line 1117
    .line 1118
    iget-boolean p1, p1, La/noy;->c:Z

    .line 1119
    .line 1120
    if-eqz p1, :cond_14

    .line 1121
    .line 1122
    move v4, v6

    .line 1123
    :cond_14
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1124
    .line 1125
    .line 1126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1127
    .line 1128
    return-object p0

    .line 1129
    :pswitch_14
    check-cast p0, La/clz;

    .line 1130
    .line 1131
    check-cast v8, La/poy;

    .line 1132
    .line 1133
    check-cast p1, La/f6o0;

    .line 1134
    .line 1135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-static {p0}, La/g1x;->u(La/clz;)La/tkz;

    .line 1139
    .line 1140
    .line 1141
    move-result-object p0

    .line 1142
    invoke-static {p1, p0, v8}, La/ibc;->X(La/f6o0;La/tkz;La/poy;)V

    .line 1143
    .line 1144
    .line 1145
    invoke-static {p1, v8}, La/ibc;->U(La/f6o0;La/poy;)V

    .line 1146
    .line 1147
    .line 1148
    iget-object p0, p1, La/f6o0;->f:Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    .line 1149
    .line 1150
    iget-object v0, v8, La/poy;->f:La/loy;

    .line 1151
    .line 1152
    iget v1, v0, La/loy;->a:I

    .line 1153
    .line 1154
    iget v0, v0, La/loy;->b:I

    .line 1155
    .line 1156
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->j(II)V

    .line 1157
    .line 1158
    .line 1159
    iget-object v0, v8, La/poy;->g:La/moy;

    .line 1160
    .line 1161
    iget v1, v0, La/moy;->a:I

    .line 1162
    .line 1163
    iget v0, v0, La/moy;->b:I

    .line 1164
    .line 1165
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->k(II)V

    .line 1166
    .line 1167
    .line 1168
    iget-object v0, v8, La/poy;->e:Ljava/util/ArrayList;

    .line 1169
    .line 1170
    new-instance v1, La/qzn;

    .line 1171
    .line 1172
    const/16 v2, 0x9

    .line 1173
    .line 1174
    invoke-direct {v1, p1, v8, v2}, La/qzn;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1175
    .line 1176
    .line 1177
    new-instance v2, La/yhn;

    .line 1178
    .line 1179
    const/16 v3, 0xf

    .line 1180
    .line 1181
    invoke-direct {v2, p1, v3}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {p0, v0, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->i(Ljava/util/ArrayList;La/qzn;La/yhn;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-static {p1, v8}, La/ibc;->W(La/f6o0;La/poy;)V

    .line 1188
    .line 1189
    .line 1190
    iget-object v0, v8, La/poy;->a:Ljava/util/List;

    .line 1191
    .line 1192
    invoke-virtual {p0, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->setFirstPlayerGameField(Ljava/util/List;)V

    .line 1193
    .line 1194
    .line 1195
    iget-object v0, v8, La/poy;->b:Ljava/util/List;

    .line 1196
    .line 1197
    invoke-virtual {p0, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->setSecondPlayerGameField(Ljava/util/List;)V

    .line 1198
    .line 1199
    .line 1200
    iget-object p0, p1, La/f6o0;->b:Landroid/widget/ImageView;

    .line 1201
    .line 1202
    iget p1, v8, La/poy;->c:F

    .line 1203
    .line 1204
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 1205
    .line 1206
    .line 1207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1208
    .line 1209
    return-object p0

    .line 1210
    :pswitch_15
    check-cast p0, La/xkk;

    .line 1211
    .line 1212
    check-cast v8, La/clz;

    .line 1213
    .line 1214
    check-cast p1, La/j1o0;

    .line 1215
    .line 1216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1217
    .line 1218
    .line 1219
    iget-object v0, p1, La/j1o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

    .line 1220
    .line 1221
    iget-object v1, p0, La/xkk;->a:La/jkk;

    .line 1222
    .line 1223
    invoke-virtual {v0, v1, v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->v(La/jkk;Z)V

    .line 1224
    .line 1225
    .line 1226
    iget-object v1, p0, La/xkk;->b:La/jkk;

    .line 1227
    .line 1228
    invoke-virtual {v0, v1, v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->A(La/jkk;Z)V

    .line 1229
    .line 1230
    .line 1231
    iget-object v1, p0, La/xkk;->d:La/okk;

    .line 1232
    .line 1233
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v2

    .line 1237
    invoke-virtual {v0, v1, v2, v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->B(La/okk;La/tkz;Z)V

    .line 1238
    .line 1239
    .line 1240
    iget-object v1, p0, La/xkk;->c:La/gkk;

    .line 1241
    .line 1242
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v2

    .line 1246
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    invoke-virtual {v0, v1, v5, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->w(La/gkk;ZLa/tkz;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v1

    .line 1257
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v10

    .line 1261
    iget-object v1, p0, La/xkk;->e:La/vkk;

    .line 1262
    .line 1263
    iget-object v0, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->q:La/zkk;

    .line 1264
    .line 1265
    iget-object v0, v0, La/zkk;->g:Ljava/lang/Object;

    .line 1266
    .line 1267
    move-object v7, v0

    .line 1268
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 1269
    .line 1270
    iget-wide v8, v1, La/vkk;->a:J

    .line 1271
    .line 1272
    iget-object v11, v1, La/vkk;->b:Ljava/lang/Long;

    .line 1273
    .line 1274
    const/4 v12, 0x4

    .line 1275
    invoke-static/range {v7 .. v12}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 1276
    .line 1277
    .line 1278
    iget-boolean p0, p0, La/xkk;->f:Z

    .line 1279
    .line 1280
    iget-object p1, p1, La/j1o0;->a:Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

    .line 1281
    .line 1282
    if-eqz p0, :cond_15

    .line 1283
    .line 1284
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1285
    .line 1286
    .line 1287
    goto :goto_d

    .line 1288
    :cond_15
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1289
    .line 1290
    .line 1291
    :goto_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1292
    .line 1293
    return-object p0

    .line 1294
    :pswitch_16
    check-cast p0, La/h9j;

    .line 1295
    .line 1296
    check-cast v8, La/clz;

    .line 1297
    .line 1298
    check-cast p1, La/h1o0;

    .line 1299
    .line 1300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    iget-object v0, p1, La/h1o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;

    .line 1304
    .line 1305
    const-string v1, "static/img/ImgDefault/Esports/Virtual/Darts/dartboard.png"

    .line 1306
    .line 1307
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFieldImage(Ljava/lang/String;)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->v()V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->x()V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->u()V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->w()V

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->y()V

    .line 1323
    .line 1324
    .line 1325
    iget-object v1, p0, La/h9j;->d:Ljava/lang/String;

    .line 1326
    .line 1327
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerNumberOfThrow(Ljava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    iget-object v1, p0, La/h9j;->e:Ljava/lang/String;

    .line 1331
    .line 1332
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerNumberOfThrow(Ljava/lang/String;)V

    .line 1333
    .line 1334
    .line 1335
    iget-object v1, p0, La/h9j;->b:Ljava/lang/String;

    .line 1336
    .line 1337
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerTotal(Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    iget-object v1, p0, La/h9j;->c:Ljava/lang/String;

    .line 1341
    .line 1342
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerTotal(Ljava/lang/String;)V

    .line 1343
    .line 1344
    .line 1345
    iget-object v1, p0, La/h9j;->f:Ljava/util/ArrayList;

    .line 1346
    .line 1347
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerThrows(Ljava/util/List;)V

    .line 1348
    .line 1349
    .line 1350
    iget-object v1, p0, La/h9j;->g:Ljava/util/ArrayList;

    .line 1351
    .line 1352
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerThrows(Ljava/util/List;)V

    .line 1353
    .line 1354
    .line 1355
    iget-object v1, p0, La/h9j;->h:Ljava/lang/String;

    .line 1356
    .line 1357
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerSumOfThrows(Ljava/lang/String;)V

    .line 1358
    .line 1359
    .line 1360
    iget-object v1, p0, La/h9j;->i:Ljava/lang/String;

    .line 1361
    .line 1362
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerSumOfThrows(Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    iget-object v1, p0, La/h9j;->k:La/f9j;

    .line 1366
    .line 1367
    iget-wide v2, v1, La/f9j;->a:J

    .line 1368
    .line 1369
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v4

    .line 1373
    iget-object v1, v1, La/f9j;->b:Ljava/lang/Long;

    .line 1374
    .line 1375
    invoke-virtual {v0, v2, v3, v4, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->A(JLa/tkz;Ljava/lang/Long;)V

    .line 1376
    .line 1377
    .line 1378
    iget-object v1, p0, La/h9j;->l:Ljava/lang/String;

    .line 1379
    .line 1380
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setWinner(Ljava/lang/String;)V

    .line 1381
    .line 1382
    .line 1383
    iget-object v0, p0, La/h9j;->j:La/f9a0;

    .line 1384
    .line 1385
    invoke-static {p1, p0, v0}, La/wzb;->L(La/h1o0;La/h9j;La/f9a0;)V

    .line 1386
    .line 1387
    .line 1388
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1389
    .line 1390
    return-object p0

    .line 1391
    :pswitch_17
    check-cast p0, La/zhf;

    .line 1392
    .line 1393
    check-cast v8, La/clz;

    .line 1394
    .line 1395
    check-cast p1, La/a1o0;

    .line 1396
    .line 1397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1398
    .line 1399
    .line 1400
    invoke-static {p1, p0}, La/uzb;->B0(La/a1o0;La/zhf;)V

    .line 1401
    .line 1402
    .line 1403
    invoke-static {p1, p0}, La/uzb;->A0(La/a1o0;La/zhf;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-static {p1, p0}, La/uzb;->z0(La/a1o0;La/zhf;)V

    .line 1407
    .line 1408
    .line 1409
    iget-object v0, p1, La/a1o0;->j:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;

    .line 1410
    .line 1411
    iget-object v1, p0, La/zhf;->e:La/thf;

    .line 1412
    .line 1413
    iget-object v2, v1, La/thf;->a:Ljava/util/ArrayList;

    .line 1414
    .line 1415
    iget-boolean v4, v1, La/thf;->d:Z

    .line 1416
    .line 1417
    invoke-virtual {v0, v2, v4}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->a(Ljava/util/ArrayList;Z)V

    .line 1418
    .line 1419
    .line 1420
    iget-object v0, p1, La/a1o0;->i:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;

    .line 1421
    .line 1422
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setFirstPlayerRounds(La/thf;)V

    .line 1423
    .line 1424
    .line 1425
    iget-object v1, p1, La/a1o0;->k:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;

    .line 1426
    .line 1427
    iget-object v2, p0, La/zhf;->f:La/vhf;

    .line 1428
    .line 1429
    iget-object v4, v2, La/vhf;->a:Ljava/util/ArrayList;

    .line 1430
    .line 1431
    iget-boolean v5, v2, La/vhf;->d:Z

    .line 1432
    .line 1433
    invoke-virtual {v1, v4, v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->a(Ljava/util/ArrayList;Z)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setSecondPlayerRounds(La/vhf;)V

    .line 1437
    .line 1438
    .line 1439
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v1

    .line 1443
    invoke-static {p1, v1, p0}, La/uzb;->y0(La/a1o0;La/tkz;La/zhf;)V

    .line 1444
    .line 1445
    .line 1446
    iget-object v1, p0, La/zhf;->j:La/igg0;

    .line 1447
    .line 1448
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setRoundState-EQFU1Hg(La/igg0;)V

    .line 1449
    .line 1450
    .line 1451
    iget-object v1, p0, La/zhf;->h:Ljava/lang/String;

    .line 1452
    .line 1453
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setFirstPlayerResult-Z7eCPMA(Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    iget-object v1, p0, La/zhf;->i:Ljava/lang/String;

    .line 1457
    .line 1458
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setSecondPlayerResult-r0dkc8Y(Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    iget-boolean p0, p0, La/zhf;->k:Z

    .line 1462
    .line 1463
    iget-object p1, p1, La/a1o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1464
    .line 1465
    if-eqz p0, :cond_16

    .line 1466
    .line 1467
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1468
    .line 1469
    .line 1470
    goto :goto_e

    .line 1471
    :cond_16
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1472
    .line 1473
    .line 1474
    :goto_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1475
    .line 1476
    return-object p0

    .line 1477
    :pswitch_18
    check-cast p0, La/eia;

    .line 1478
    .line 1479
    check-cast v8, La/clz;

    .line 1480
    .line 1481
    check-cast p1, La/y0o0;

    .line 1482
    .line 1483
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1484
    .line 1485
    .line 1486
    iget-object p1, p1, La/y0o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;

    .line 1487
    .line 1488
    iget-object v0, p0, La/eia;->a:La/gha;

    .line 1489
    .line 1490
    invoke-static {v8}, La/g1x;->u(La/clz;)La/tkz;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v1

    .line 1494
    invoke-virtual {p1, v0, v1, v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->v(La/gha;La/tkz;Z)V

    .line 1495
    .line 1496
    .line 1497
    iget-object v0, p0, La/eia;->b:La/cia;

    .line 1498
    .line 1499
    invoke-virtual {p1, v0, v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->z(La/cia;Z)V

    .line 1500
    .line 1501
    .line 1502
    iget-object v0, p0, La/eia;->c:La/mha;

    .line 1503
    .line 1504
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->setFirstPeriod$impl(La/mha;)V

    .line 1505
    .line 1506
    .line 1507
    iget-object v0, p0, La/eia;->d:La/mha;

    .line 1508
    .line 1509
    invoke-virtual {p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->setSecondPeriod$impl(La/mha;)V

    .line 1510
    .line 1511
    .line 1512
    iget-object p0, p0, La/eia;->e:La/sha;

    .line 1513
    .line 1514
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    invoke-virtual {p1, p0, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->y(La/sha;La/tkz;)V

    .line 1523
    .line 1524
    .line 1525
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1526
    .line 1527
    return-object p0

    .line 1528
    :pswitch_19
    check-cast p0, La/x0o0;

    .line 1529
    .line 1530
    check-cast v8, Landroid/content/Context;

    .line 1531
    .line 1532
    check-cast p1, La/w0o0;

    .line 1533
    .line 1534
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1535
    .line 1536
    .line 1537
    iget-object v0, p0, La/x0o0;->c:Ljava/lang/String;

    .line 1538
    .line 1539
    iget-object v1, p1, La/w0o0;->b:Landroid/widget/TextView;

    .line 1540
    .line 1541
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    invoke-static {v0, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 1546
    .line 1547
    .line 1548
    move-result v0

    .line 1549
    float-to-int v0, v0

    .line 1550
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 1551
    .line 1552
    .line 1553
    iget-object v0, p0, La/x0o0;->e:Ljava/lang/String;

    .line 1554
    .line 1555
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1556
    .line 1557
    .line 1558
    iget-object v0, p0, La/x0o0;->d:Ljava/lang/String;

    .line 1559
    .line 1560
    iget-object v1, p1, La/w0o0;->c:Landroid/widget/TextView;

    .line 1561
    .line 1562
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v2

    .line 1566
    invoke-static {v0, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 1567
    .line 1568
    .line 1569
    move-result v0

    .line 1570
    float-to-int v0, v0

    .line 1571
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setWidth(I)V

    .line 1572
    .line 1573
    .line 1574
    iget-object v0, p0, La/x0o0;->f:Ljava/lang/String;

    .line 1575
    .line 1576
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1577
    .line 1578
    .line 1579
    iget-object v0, p1, La/w0o0;->d:Landroid/widget/TextView;

    .line 1580
    .line 1581
    iget-object v1, p0, La/x0o0;->b:Ljava/lang/String;

    .line 1582
    .line 1583
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1584
    .line 1585
    .line 1586
    iget-object p1, p1, La/w0o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1587
    .line 1588
    iget p0, p0, La/x0o0;->g:I

    .line 1589
    .line 1590
    invoke-static {p0, v8}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1591
    .line 1592
    .line 1593
    move-result-object p0

    .line 1594
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1595
    .line 1596
    .line 1597
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1598
    .line 1599
    return-object p0

    .line 1600
    :pswitch_1a
    check-cast p0, Landroid/content/Context;

    .line 1601
    .line 1602
    check-cast v8, La/t0o0;

    .line 1603
    .line 1604
    check-cast p1, La/s0o0;

    .line 1605
    .line 1606
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1607
    .line 1608
    .line 1609
    iget-object v0, p1, La/s0o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1610
    .line 1611
    iget v1, v8, La/t0o0;->d:I

    .line 1612
    .line 1613
    invoke-static {v1, p0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1614
    .line 1615
    .line 1616
    move-result-object p0

    .line 1617
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1618
    .line 1619
    .line 1620
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 1621
    .line 1622
    iget-object p0, p1, La/s0o0;->c:Landroid/widget/ImageView;

    .line 1623
    .line 1624
    iget-object v0, v8, La/t0o0;->c:Ljava/lang/String;

    .line 1625
    .line 1626
    const v1, 0x7f080cf8

    .line 1627
    .line 1628
    .line 1629
    invoke-static {p0, v0, v1, v3}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1630
    .line 1631
    .line 1632
    iget-object p0, p1, La/s0o0;->d:Landroid/widget/TextView;

    .line 1633
    .line 1634
    iget-object v0, v8, La/t0o0;->b:Ljava/lang/String;

    .line 1635
    .line 1636
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1637
    .line 1638
    .line 1639
    iget-object p0, p1, La/s0o0;->b:Landroid/widget/LinearLayout;

    .line 1640
    .line 1641
    sget-object p1, La/v4o;->a:Ljava/util/ArrayList;

    .line 1642
    .line 1643
    iget-object v0, v8, La/t0o0;->e:Ljava/util/ArrayList;

    .line 1644
    .line 1645
    new-instance v1, La/ihu0;

    .line 1646
    .line 1647
    invoke-direct {v1, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v1}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v1

    .line 1654
    move v3, v6

    .line 1655
    :goto_f
    move-object v5, v1

    .line 1656
    check-cast v5, La/jhu0;

    .line 1657
    .line 1658
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 1659
    .line 1660
    .line 1661
    move-result v8

    .line 1662
    if-eqz v8, :cond_19

    .line 1663
    .line 1664
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v5

    .line 1668
    add-int/lit8 v8, v3, 0x1

    .line 1669
    .line 1670
    if-ltz v3, :cond_18

    .line 1671
    .line 1672
    check-cast v5, Landroid/view/View;

    .line 1673
    .line 1674
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1675
    .line 1676
    .line 1677
    move-result v9

    .line 1678
    if-ge v3, v9, :cond_17

    .line 1679
    .line 1680
    move v3, v6

    .line 1681
    goto :goto_10

    .line 1682
    :cond_17
    move v3, v4

    .line 1683
    :goto_10
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1684
    .line 1685
    .line 1686
    move v3, v8

    .line 1687
    goto :goto_f

    .line 1688
    :cond_18
    invoke-static {}, La/q3d;->p()V

    .line 1689
    .line 1690
    .line 1691
    throw v7

    .line 1692
    :cond_19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    move v1, v6

    .line 1697
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1698
    .line 1699
    .line 1700
    move-result v3

    .line 1701
    if-eqz v3, :cond_1d

    .line 1702
    .line 1703
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v3

    .line 1707
    add-int/lit8 v4, v1, 0x1

    .line 1708
    .line 1709
    if-ltz v1, :cond_1c

    .line 1710
    .line 1711
    check-cast v3, Ljava/lang/String;

    .line 1712
    .line 1713
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v1

    .line 1717
    check-cast v1, La/q0o0;

    .line 1718
    .line 1719
    if-nez v1, :cond_1b

    .line 1720
    .line 1721
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v1

    .line 1725
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v1

    .line 1729
    const v5, 0x7f0d05ac

    .line 1730
    .line 1731
    .line 1732
    invoke-virtual {v1, v5, p0, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v1

    .line 1736
    if-eqz v1, :cond_1a

    .line 1737
    .line 1738
    check-cast v1, Landroid/widget/TextView;

    .line 1739
    .line 1740
    new-instance v5, La/q0o0;

    .line 1741
    .line 1742
    invoke-direct {v5, v1, v1}, La/q0o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1749
    .line 1750
    .line 1751
    move-object v1, v5

    .line 1752
    goto :goto_12

    .line 1753
    :cond_1a
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 1754
    .line 1755
    .line 1756
    goto :goto_13

    .line 1757
    :cond_1b
    :goto_12
    iget-object v1, v1, La/q0o0;->b:Landroid/widget/TextView;

    .line 1758
    .line 1759
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1760
    .line 1761
    .line 1762
    move v1, v4

    .line 1763
    goto :goto_11

    .line 1764
    :cond_1c
    invoke-static {}, La/q3d;->p()V

    .line 1765
    .line 1766
    .line 1767
    throw v7

    .line 1768
    :cond_1d
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1769
    .line 1770
    :goto_13
    return-object v7

    .line 1771
    :pswitch_1b
    check-cast p0, La/phf0;

    .line 1772
    .line 1773
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 1774
    .line 1775
    iget-object v0, p0, La/phf0;->b:Ljava/lang/Object;

    .line 1776
    .line 1777
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 1778
    .line 1779
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v1

    .line 1783
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1784
    .line 1785
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v1

    .line 1789
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v0

    .line 1793
    instance-of v1, v0, La/xzn;

    .line 1794
    .line 1795
    if-eqz v1, :cond_1e

    .line 1796
    .line 1797
    move-object v7, v0

    .line 1798
    check-cast v7, La/xzn;

    .line 1799
    .line 1800
    :cond_1e
    iget-object v0, p0, La/phf0;->c:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 1803
    .line 1804
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v8, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    if-nez v0, :cond_21

    .line 1812
    .line 1813
    if-eqz v7, :cond_1f

    .line 1814
    .line 1815
    iget-object v0, v7, La/xzn;->c:Lkotlin/jvm/functions/Function1;

    .line 1816
    .line 1817
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v0

    .line 1821
    check-cast v0, Ljava/util/Map;

    .line 1822
    .line 1823
    if-nez v0, :cond_20

    .line 1824
    .line 1825
    :cond_1f
    sget-object v0, La/lun;->a:La/lun;

    .line 1826
    .line 1827
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1828
    .line 1829
    .line 1830
    :cond_20
    invoke-interface {v8, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1831
    .line 1832
    .line 1833
    :cond_21
    check-cast v0, Ljava/util/Map;

    .line 1834
    .line 1835
    if-eqz v7, :cond_22

    .line 1836
    .line 1837
    new-instance p0, La/ob50;

    .line 1838
    .line 1839
    iget-object v1, v7, La/xzn;->b:Lkotlin/jvm/functions/Function1;

    .line 1840
    .line 1841
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v1

    .line 1845
    iget-object v2, v7, La/xzn;->d:La/ugd;

    .line 1846
    .line 1847
    invoke-direct {p0, p1, v1, v0, v2}, La/ob50;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;La/ugd;)V

    .line 1848
    .line 1849
    .line 1850
    goto :goto_14

    .line 1851
    :cond_22
    iget-object p0, p0, La/phf0;->a:Ljava/lang/Object;

    .line 1852
    .line 1853
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1854
    .line 1855
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1856
    .line 1857
    .line 1858
    move-result-object p0

    .line 1859
    check-cast p0, La/ob50;

    .line 1860
    .line 1861
    :goto_14
    return-object p0

    .line 1862
    :pswitch_1c
    check-cast p0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;

    .line 1863
    .line 1864
    check-cast v8, La/dc3;

    .line 1865
    .line 1866
    check-cast p1, Ljava/lang/String;

    .line 1867
    .line 1868
    invoke-static {p0, v8, p1}, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->u(Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;La/dc3;Ljava/lang/String;)Lkotlin/Unit;

    .line 1869
    .line 1870
    .line 1871
    move-result-object p0

    .line 1872
    return-object p0

    .line 1873
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
