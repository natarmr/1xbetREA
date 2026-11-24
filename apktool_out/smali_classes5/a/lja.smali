.class public final La/lja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/gkz;

.field public final synthetic d:La/gkz;

.field public final synthetic e:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/gkz;La/gkz;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/lja;->a:B

    iput-object p1, p0, La/lja;->b:La/cp;

    iput-object p2, p0, La/lja;->c:La/gkz;

    iput-object p3, p0, La/lja;->d:La/gkz;

    iput-object p4, p0, La/lja;->e:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/lja;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/lja;->e:La/cp;

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0x8

    .line 9
    .line 10
    iget-object v6, p0, La/lja;->d:La/gkz;

    .line 11
    .line 12
    iget-object v7, p0, La/lja;->c:La/gkz;

    .line 13
    .line 14
    iget-object p0, p0, La/lja;->b:La/cp;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 35
    .line 36
    check-cast p1, La/mka;

    .line 37
    .line 38
    iget-object v1, p1, La/mka;->e:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v2, p1, La/mka;->f:La/ank0;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    iget-object v9, p0, La/cp;->u:La/yfu0;

    .line 47
    .line 48
    if-lez v8, :cond_0

    .line 49
    .line 50
    move-object v8, v9

    .line 51
    check-cast v8, La/msx;

    .line 52
    .line 53
    iget-object v10, v8, La/msx;->d:Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object v8, v8, La/msx;->d:Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v1, v9

    .line 65
    check-cast v1, La/msx;

    .line 66
    .line 67
    iget-object v1, v1, La/msx;->d:Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    :goto_0
    check-cast v9, La/msx;

    .line 73
    .line 74
    iget-object v1, v9, La/msx;->f:Landroidx/appcompat/widget/AppCompatTextView;

    .line 75
    .line 76
    iget-object v8, v9, La/msx;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 77
    .line 78
    invoke-static {v1}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v9, La/msx;->f:Landroidx/appcompat/widget/AppCompatTextView;

    .line 82
    .line 83
    iget-object v10, p1, La/mka;->b:La/ank0;

    .line 84
    .line 85
    invoke-virtual {v10, v0}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8}, La/jwb;->A(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, La/ank0;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-lez v1, :cond_1

    .line 104
    .line 105
    move v5, v4

    .line 106
    :cond_1
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, v9, La/msx;->g:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 117
    .line 118
    iget-object v1, p1, La/mka;->g:La/hg30;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p1, La/mka;->c:Ljava/util/List;

    .line 124
    .line 125
    invoke-virtual {v7, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p1, La/mka;->d:Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {v6, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, v9, La/msx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 134
    .line 135
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    check-cast p0, La/mka;

    .line 140
    .line 141
    iget-boolean p0, p0, La/mka;->i:Z

    .line 142
    .line 143
    if-eqz p0, :cond_2

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_2
    move v3, v4

    .line 147
    :goto_1
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_5

    .line 151
    .line 152
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_4

    .line 166
    .line 167
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    check-cast v0, Ljava/util/Collection;

    .line 175
    .line 176
    check-cast v0, Ljava/lang/Iterable;

    .line 177
    .line 178
    invoke-static {p0, v0}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_b

    .line 191
    .line 192
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Ljava/util/List;

    .line 197
    .line 198
    new-instance v0, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_7

    .line 212
    .line 213
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    instance-of v4, v3, La/mfs;

    .line 218
    .line 219
    if-eqz v4, :cond_6

    .line 220
    .line 221
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_5

    .line 234
    .line 235
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, La/mfs;

    .line 240
    .line 241
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 242
    .line 243
    iget-object v4, v2, La/cp;->u:La/yfu0;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    instance-of v5, v0, La/jfs;

    .line 249
    .line 250
    if-eqz v5, :cond_8

    .line 251
    .line 252
    check-cast v4, La/msx;

    .line 253
    .line 254
    iget-object v4, v4, La/msx;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 255
    .line 256
    check-cast v0, La/jfs;

    .line 257
    .line 258
    iget-object v0, v0, La/jfs;->a:La/ank0;

    .line 259
    .line 260
    invoke-virtual {v0, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_8
    instance-of v5, v0, La/kfs;

    .line 269
    .line 270
    if-eqz v5, :cond_9

    .line 271
    .line 272
    check-cast v4, La/msx;

    .line 273
    .line 274
    iget-object v4, v4, La/msx;->f:Landroidx/appcompat/widget/AppCompatTextView;

    .line 275
    .line 276
    check-cast v0, La/kfs;

    .line 277
    .line 278
    iget-object v0, v0, La/kfs;->a:La/ank0;

    .line 279
    .line 280
    invoke-virtual {v0, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_9
    instance-of v3, v0, La/lfs;

    .line 289
    .line 290
    if-eqz v3, :cond_a

    .line 291
    .line 292
    check-cast v4, La/msx;

    .line 293
    .line 294
    iget-object v3, v4, La/msx;->g:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 295
    .line 296
    check-cast v0, La/lfs;

    .line 297
    .line 298
    iget-object v0, v0, La/lfs;->a:La/hg30;

    .line 299
    .line 300
    invoke-virtual {v3, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 301
    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_b
    :goto_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    :goto_6
    return-object v1

    .line 311
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_f

    .line 321
    .line 322
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    check-cast p1, La/lka;

    .line 327
    .line 328
    iget-object v0, p1, La/lka;->e:Ljava/lang/String;

    .line 329
    .line 330
    iget-object v1, p1, La/lka;->f:Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    iget-object v8, p0, La/cp;->u:La/yfu0;

    .line 337
    .line 338
    if-lez v2, :cond_c

    .line 339
    .line 340
    move-object v2, v8

    .line 341
    check-cast v2, La/msx;

    .line 342
    .line 343
    iget-object v9, v2, La/msx;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 344
    .line 345
    iget-object v2, v2, La/msx;->d:Landroid/widget/TextView;

    .line 346
    .line 347
    const/4 v10, 0x1

    .line 348
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 349
    .line 350
    .line 351
    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 352
    .line 353
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    check-cast v10, La/a3e;

    .line 364
    .line 365
    const/4 v11, -0x2

    .line 366
    iput v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 367
    .line 368
    invoke-virtual {v9, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_c
    move-object v0, v8

    .line 379
    check-cast v0, La/msx;

    .line 380
    .line 381
    iget-object v0, v0, La/msx;->d:Landroid/widget/TextView;

    .line 382
    .line 383
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 384
    .line 385
    .line 386
    :goto_7
    check-cast v8, La/msx;

    .line 387
    .line 388
    iget-object v0, v8, La/msx;->f:Landroidx/appcompat/widget/AppCompatTextView;

    .line 389
    .line 390
    iget-object v2, v8, La/msx;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 391
    .line 392
    invoke-static {v0}, La/jwb;->y(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 393
    .line 394
    .line 395
    iget-object v0, v8, La/msx;->f:Landroidx/appcompat/widget/AppCompatTextView;

    .line 396
    .line 397
    iget-object v9, p1, La/lka;->b:Ljava/lang/String;

    .line 398
    .line 399
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-lez v0, :cond_d

    .line 407
    .line 408
    move v5, v4

    .line 409
    :cond_d
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    .line 414
    .line 415
    iget-object v0, v8, La/msx;->g:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 416
    .line 417
    iget-object v1, p1, La/lka;->g:La/hg30;

    .line 418
    .line 419
    invoke-virtual {v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 420
    .line 421
    .line 422
    iget-object v0, p1, La/lka;->c:Ljava/util/List;

    .line 423
    .line 424
    invoke-virtual {v7, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 425
    .line 426
    .line 427
    iget-object p1, p1, La/lka;->d:Ljava/util/List;

    .line 428
    .line 429
    invoke-virtual {v6, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 430
    .line 431
    .line 432
    iget-object p1, v8, La/msx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 433
    .line 434
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    check-cast p0, La/lka;

    .line 439
    .line 440
    iget-boolean p0, p0, La/lka;->i:Z

    .line 441
    .line 442
    if-eqz p0, :cond_e

    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_e
    move v3, v4

    .line 446
    :goto_8
    invoke-virtual {p1, v3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_c

    .line 450
    .line 451
    :cond_f
    new-instance p0, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_10

    .line 465
    .line 466
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    check-cast v0, Ljava/util/Collection;

    .line 474
    .line 475
    check-cast v0, Ljava/lang/Iterable;

    .line 476
    .line 477
    invoke-static {p0, v0}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 478
    .line 479
    .line 480
    goto :goto_9

    .line 481
    :cond_10
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    :cond_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result p1

    .line 489
    if-eqz p1, :cond_15

    .line 490
    .line 491
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    check-cast p1, Ljava/util/List;

    .line 496
    .line 497
    new-instance v0, Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    :cond_12
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    if-eqz v3, :cond_13

    .line 511
    .line 512
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    instance-of v4, v3, La/ifs;

    .line 517
    .line 518
    if-eqz v4, :cond_12

    .line 519
    .line 520
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    goto :goto_a

    .line 524
    :cond_13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_11

    .line 533
    .line 534
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, La/ifs;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    instance-of v3, v0, La/ifs;

    .line 544
    .line 545
    if-eqz v3, :cond_14

    .line 546
    .line 547
    iget-object v3, v2, La/cp;->u:La/yfu0;

    .line 548
    .line 549
    check-cast v3, La/msx;

    .line 550
    .line 551
    iget-object v3, v3, La/msx;->g:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 552
    .line 553
    iget-object v0, v0, La/ifs;->a:La/hg30;

    .line 554
    .line 555
    invoke-virtual {v3, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 556
    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 560
    .line 561
    .line 562
    goto :goto_d

    .line 563
    :cond_15
    :goto_c
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 564
    .line 565
    :goto_d
    return-object v1

    .line 566
    nop

    .line 567
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
