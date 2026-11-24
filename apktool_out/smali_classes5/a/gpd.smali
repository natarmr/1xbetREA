.class public final La/gpd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:Landroid/animation/ObjectAnimator;

.field public final synthetic d:Landroid/animation/ObjectAnimator;

.field public final synthetic e:La/cp;

.field public final synthetic f:Landroid/animation/ObjectAnimator;

.field public final synthetic g:Landroid/animation/ObjectAnimator;

.field public final synthetic h:La/zz3;

.field public final synthetic i:La/zz3;


# direct methods
.method public synthetic constructor <init>(La/cp;La/zz3;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;La/cp;La/zz3;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;B)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/gpd;->a:B

    iput-object p1, p0, La/gpd;->b:La/cp;

    iput-object p2, p0, La/gpd;->h:La/zz3;

    iput-object p3, p0, La/gpd;->c:Landroid/animation/ObjectAnimator;

    iput-object p4, p0, La/gpd;->d:Landroid/animation/ObjectAnimator;

    iput-object p5, p0, La/gpd;->e:La/cp;

    iput-object p6, p0, La/gpd;->i:La/zz3;

    iput-object p7, p0, La/gpd;->f:Landroid/animation/ObjectAnimator;

    iput-object p8, p0, La/gpd;->g:Landroid/animation/ObjectAnimator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gpd;->a:B

    .line 4
    .line 5
    iget-object v3, v0, La/gpd;->i:La/zz3;

    .line 6
    .line 7
    iget-object v4, v0, La/gpd;->e:La/cp;

    .line 8
    .line 9
    const v9, 0x7f1314e3

    .line 10
    .line 11
    .line 12
    iget-object v10, v0, La/gpd;->h:La/zz3;

    .line 13
    .line 14
    iget-object v11, v0, La/gpd;->b:La/cp;

    .line 15
    .line 16
    iget-object v12, v0, La/gpd;->c:Landroid/animation/ObjectAnimator;

    .line 17
    .line 18
    iget-object v13, v0, La/gpd;->d:Landroid/animation/ObjectAnimator;

    .line 19
    .line 20
    const/4 v15, 0x0

    .line 21
    iget-object v2, v0, La/gpd;->f:Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    iget-object v0, v0, La/gpd;->g:Landroid/animation/ObjectAnimator;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v16

    .line 39
    if-eqz v16, :cond_4

    .line 40
    .line 41
    check-cast v10, La/gkz;

    .line 42
    .line 43
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/yf90;

    .line 48
    .line 49
    iget-object v1, v11, La/cp;->u:La/yfu0;

    .line 50
    .line 51
    check-cast v1, La/usx;

    .line 52
    .line 53
    iget-object v2, v1, La/usx;->n:Landroid/widget/TextView;

    .line 54
    .line 55
    iget-object v3, v1, La/usx;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 56
    .line 57
    iget-object v4, v1, La/usx;->i:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 58
    .line 59
    iget-object v5, v1, La/usx;->h:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 60
    .line 61
    iget-object v6, v1, La/usx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 62
    .line 63
    iget-object v7, v0, La/yf90;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, La/usx;->r:Landroid/widget/TextView;

    .line 69
    .line 70
    iget-object v7, v0, La/yf90;->b:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v1, La/usx;->q:Landroid/widget/TextView;

    .line 76
    .line 77
    iget-object v7, v0, La/yf90;->g:La/zmk0;

    .line 78
    .line 79
    iget-object v8, v11, La/cp;->w:Landroid/content/Context;

    .line 80
    .line 81
    invoke-virtual {v7, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, La/usx;->u:Landroid/widget/TextView;

    .line 89
    .line 90
    iget-object v7, v0, La/yf90;->h:La/zmk0;

    .line 91
    .line 92
    invoke-virtual {v7, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    iget-object v2, v1, La/usx;->l:Landroid/widget/TextView;

    .line 100
    .line 101
    iget-object v7, v0, La/yf90;->i:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, La/yf90;->j:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v10, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    iget-object v7, v0, La/yf90;->k:La/zmk0;

    .line 112
    .line 113
    iget-object v10, v7, La/zmk0;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    iget-object v14, v1, La/usx;->c:Landroidx/constraintlayout/widget/Group;

    .line 120
    .line 121
    if-lez v10, :cond_0

    .line 122
    .line 123
    invoke-virtual {v14, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    iget-object v10, v1, La/usx;->k:Landroid/widget/TextView;

    .line 127
    .line 128
    invoke-virtual {v11, v9}, La/cp;->v(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-virtual {v10, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    iget-object v9, v1, La/usx;->p:Landroid/widget/TextView;

    .line 136
    .line 137
    invoke-virtual {v7, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    iget-object v7, v1, La/usx;->t:Landroid/widget/TextView;

    .line 145
    .line 146
    iget-object v9, v0, La/yf90;->l:La/zmk0;

    .line 147
    .line 148
    invoke-virtual {v9, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_0
    const/16 v7, 0x8

    .line 157
    .line 158
    invoke-virtual {v14, v7}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    :goto_0
    iget-object v7, v1, La/usx;->b:Landroidx/constraintlayout/widget/Group;

    .line 162
    .line 163
    iget-boolean v9, v0, La/yf90;->o:Z

    .line 164
    .line 165
    if-eqz v9, :cond_1

    .line 166
    .line 167
    move v9, v15

    .line 168
    goto :goto_1

    .line 169
    :cond_1
    const/16 v9, 0x8

    .line 170
    .line 171
    :goto_1
    invoke-virtual {v7, v9}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    iget-object v7, v1, La/usx;->m:Landroid/widget/TextView;

    .line 175
    .line 176
    const v9, 0x7f130749

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11, v9}, La/cp;->v(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    iget-object v7, v1, La/usx;->o:Landroid/widget/TextView;

    .line 187
    .line 188
    iget-object v9, v0, La/yf90;->m:La/zmk0;

    .line 189
    .line 190
    invoke-virtual {v9, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    iget-object v7, v1, La/usx;->s:Landroid/widget/TextView;

    .line 198
    .line 199
    iget-object v9, v0, La/yf90;->n:La/zmk0;

    .line 200
    .line 201
    invoke-virtual {v9, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    .line 207
    .line 208
    iget-object v7, v1, La/usx;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    add-int/lit8 v2, v2, -0x1

    .line 215
    .line 216
    invoke-virtual {v7, v2}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 217
    .line 218
    .line 219
    iget-boolean v2, v0, La/yf90;->p:Z

    .line 220
    .line 221
    iget-boolean v7, v0, La/yf90;->q:Z

    .line 222
    .line 223
    iget-object v8, v0, La/yf90;->c:Ljava/lang/String;

    .line 224
    .line 225
    iget-object v9, v0, La/yf90;->e:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v10, v0, La/yf90;->d:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v0, v0, La/yf90;->f:Ljava/lang/String;

    .line 230
    .line 231
    iget-object v1, v1, La/usx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 232
    .line 233
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const v14, 0x7f070197

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v2, :cond_2

    .line 245
    .line 246
    const v2, 0x7f080843

    .line 247
    .line 248
    .line 249
    invoke-virtual {v6, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 250
    .line 251
    .line 252
    const v0, 0x7f080842

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_2
    if-eqz v7, :cond_3

    .line 260
    .line 261
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 262
    .line 263
    const/16 v2, 0xb

    .line 264
    .line 265
    invoke-static {v6, v8, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 266
    .line 267
    .line 268
    invoke-static {v5, v9, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 269
    .line 270
    .line 271
    invoke-static {v3, v10, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 272
    .line 273
    .line 274
    invoke-static {v4, v0, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 282
    .line 283
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 288
    .line 289
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 294
    .line 295
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 300
    .line 301
    invoke-virtual {v3, v15}, Landroid/view/View;->setVisibility(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, v15}, Landroid/view/View;->setVisibility(I)V

    .line 305
    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_3
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 309
    .line 310
    const/16 v2, 0xb

    .line 311
    .line 312
    invoke-static {v6, v8, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 313
    .line 314
    .line 315
    invoke-static {v5, v9, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 316
    .line 317
    .line 318
    const/16 v7, 0x8

    .line 319
    .line 320
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 324
    .line 325
    .line 326
    :goto_2
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, La/yf90;

    .line 331
    .line 332
    iget-object v0, v0, La/yf90;->r:La/bex;

    .line 333
    .line 334
    invoke-static {v11, v0, v12, v13}, La/k7x;->P(La/cp;La/bex;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_7

    .line 338
    .line 339
    :cond_4
    new-instance v5, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-eqz v6, :cond_5

    .line 353
    .line 354
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    check-cast v6, Ljava/util/Collection;

    .line 362
    .line 363
    check-cast v6, Ljava/lang/Iterable;

    .line 364
    .line 365
    invoke-static {v5, v6}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 366
    .line 367
    .line 368
    goto :goto_3

    .line 369
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    if-eqz v5, :cond_14

    .line 378
    .line 379
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    check-cast v5, Ljava/util/List;

    .line 384
    .line 385
    new-instance v6, Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    :cond_7
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    if-eqz v7, :cond_8

    .line 399
    .line 400
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    instance-of v8, v7, La/dqa;

    .line 405
    .line 406
    if-eqz v8, :cond_7

    .line 407
    .line 408
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    goto :goto_4

    .line 412
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    if-eqz v6, :cond_6

    .line 421
    .line 422
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    check-cast v6, La/dqa;

    .line 427
    .line 428
    move-object v7, v3

    .line 429
    check-cast v7, La/gkz;

    .line 430
    .line 431
    iget-object v8, v4, La/cp;->w:Landroid/content/Context;

    .line 432
    .line 433
    iget-object v9, v4, La/cp;->u:La/yfu0;

    .line 434
    .line 435
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    instance-of v10, v6, La/vpa;

    .line 439
    .line 440
    if-eqz v10, :cond_9

    .line 441
    .line 442
    check-cast v6, La/vpa;

    .line 443
    .line 444
    iget-object v6, v6, La/vpa;->a:Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-virtual {v7, v6}, La/zz3;->A(Ljava/util/List;)V

    .line 447
    .line 448
    .line 449
    goto :goto_5

    .line 450
    :cond_9
    instance-of v7, v6, La/ypa;

    .line 451
    .line 452
    if-eqz v7, :cond_a

    .line 453
    .line 454
    check-cast v9, La/usx;

    .line 455
    .line 456
    iget-object v7, v9, La/usx;->q:Landroid/widget/TextView;

    .line 457
    .line 458
    check-cast v6, La/ypa;

    .line 459
    .line 460
    iget-object v6, v6, La/ypa;->a:La/zmk0;

    .line 461
    .line 462
    invoke-virtual {v6, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 467
    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_a
    instance-of v7, v6, La/bqa;

    .line 471
    .line 472
    if-eqz v7, :cond_b

    .line 473
    .line 474
    check-cast v9, La/usx;

    .line 475
    .line 476
    iget-object v7, v9, La/usx;->u:Landroid/widget/TextView;

    .line 477
    .line 478
    check-cast v6, La/bqa;

    .line 479
    .line 480
    iget-object v6, v6, La/bqa;->a:La/zmk0;

    .line 481
    .line 482
    invoke-virtual {v6, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 487
    .line 488
    .line 489
    goto :goto_5

    .line 490
    :cond_b
    instance-of v7, v6, La/zpa;

    .line 491
    .line 492
    if-eqz v7, :cond_c

    .line 493
    .line 494
    check-cast v9, La/usx;

    .line 495
    .line 496
    iget-object v7, v9, La/usx;->p:Landroid/widget/TextView;

    .line 497
    .line 498
    check-cast v6, La/zpa;

    .line 499
    .line 500
    iget-object v6, v6, La/zpa;->a:La/zmk0;

    .line 501
    .line 502
    invoke-virtual {v6, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 507
    .line 508
    .line 509
    goto :goto_5

    .line 510
    :cond_c
    instance-of v7, v6, La/cqa;

    .line 511
    .line 512
    if-eqz v7, :cond_d

    .line 513
    .line 514
    check-cast v9, La/usx;

    .line 515
    .line 516
    iget-object v7, v9, La/usx;->t:Landroid/widget/TextView;

    .line 517
    .line 518
    check-cast v6, La/cqa;

    .line 519
    .line 520
    iget-object v6, v6, La/cqa;->a:La/zmk0;

    .line 521
    .line 522
    invoke-virtual {v6, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 527
    .line 528
    .line 529
    goto :goto_5

    .line 530
    :cond_d
    instance-of v7, v6, La/xpa;

    .line 531
    .line 532
    if-eqz v7, :cond_e

    .line 533
    .line 534
    check-cast v9, La/usx;

    .line 535
    .line 536
    iget-object v7, v9, La/usx;->o:Landroid/widget/TextView;

    .line 537
    .line 538
    check-cast v6, La/xpa;

    .line 539
    .line 540
    iget-object v6, v6, La/xpa;->a:La/zmk0;

    .line 541
    .line 542
    invoke-virtual {v6, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 547
    .line 548
    .line 549
    goto/16 :goto_5

    .line 550
    .line 551
    :cond_e
    instance-of v7, v6, La/aqa;

    .line 552
    .line 553
    if-eqz v7, :cond_f

    .line 554
    .line 555
    check-cast v9, La/usx;

    .line 556
    .line 557
    iget-object v7, v9, La/usx;->s:Landroid/widget/TextView;

    .line 558
    .line 559
    check-cast v6, La/aqa;

    .line 560
    .line 561
    iget-object v6, v6, La/aqa;->a:La/zmk0;

    .line 562
    .line 563
    invoke-virtual {v6, v8}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 568
    .line 569
    .line 570
    goto/16 :goto_5

    .line 571
    .line 572
    :cond_f
    instance-of v7, v6, La/upa;

    .line 573
    .line 574
    if-eqz v7, :cond_11

    .line 575
    .line 576
    check-cast v9, La/usx;

    .line 577
    .line 578
    iget-object v7, v9, La/usx;->b:Landroidx/constraintlayout/widget/Group;

    .line 579
    .line 580
    check-cast v6, La/upa;

    .line 581
    .line 582
    iget-boolean v6, v6, La/upa;->a:Z

    .line 583
    .line 584
    if-eqz v6, :cond_10

    .line 585
    .line 586
    move v6, v15

    .line 587
    goto :goto_6

    .line 588
    :cond_10
    const/16 v6, 0x8

    .line 589
    .line 590
    :goto_6
    invoke-virtual {v7, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 591
    .line 592
    .line 593
    goto/16 :goto_5

    .line 594
    .line 595
    :cond_11
    instance-of v7, v6, La/tpa;

    .line 596
    .line 597
    if-eqz v7, :cond_12

    .line 598
    .line 599
    check-cast v6, La/tpa;

    .line 600
    .line 601
    iget-object v6, v6, La/tpa;->a:La/bex;

    .line 602
    .line 603
    invoke-static {v4, v6, v2, v0}, La/k7x;->P(La/cp;La/bex;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_5

    .line 607
    .line 608
    :cond_12
    instance-of v7, v6, La/wpa;

    .line 609
    .line 610
    if-eqz v7, :cond_13

    .line 611
    .line 612
    check-cast v9, La/usx;

    .line 613
    .line 614
    iget-object v7, v9, La/usx;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 615
    .line 616
    check-cast v6, La/wpa;

    .line 617
    .line 618
    iget v6, v6, La/wpa;->a:I

    .line 619
    .line 620
    invoke-static {v7, v6}, La/ucx;->e0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 621
    .line 622
    .line 623
    goto/16 :goto_5

    .line 624
    .line 625
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 626
    .line 627
    .line 628
    const/4 v2, 0x0

    .line 629
    goto :goto_8

    .line 630
    :cond_14
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    :goto_8
    return-object v2

    .line 633
    :pswitch_0
    move-object/from16 v1, p1

    .line 634
    .line 635
    check-cast v1, Ljava/util/List;

    .line 636
    .line 637
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    if-eqz v5, :cond_1a

    .line 645
    .line 646
    check-cast v10, La/gkz;

    .line 647
    .line 648
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    check-cast v0, La/cpd;

    .line 653
    .line 654
    iget-object v1, v11, La/cp;->u:La/yfu0;

    .line 655
    .line 656
    check-cast v1, La/mtx;

    .line 657
    .line 658
    iget-object v2, v1, La/mtx;->n:Landroid/widget/TextView;

    .line 659
    .line 660
    iget-object v3, v1, La/mtx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 661
    .line 662
    iget-object v4, v0, La/cpd;->b:La/zmk0;

    .line 663
    .line 664
    iget-object v5, v11, La/cp;->w:Landroid/content/Context;

    .line 665
    .line 666
    invoke-virtual {v4, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 671
    .line 672
    .line 673
    iget-object v2, v1, La/mtx;->r:Landroid/widget/TextView;

    .line 674
    .line 675
    iget-object v4, v0, La/cpd;->c:La/zmk0;

    .line 676
    .line 677
    invoke-virtual {v4, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 682
    .line 683
    .line 684
    iget-object v2, v1, La/mtx;->q:Landroid/widget/TextView;

    .line 685
    .line 686
    iget-object v4, v0, La/cpd;->h:La/zmk0;

    .line 687
    .line 688
    invoke-virtual {v4, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 693
    .line 694
    .line 695
    iget-object v2, v1, La/mtx;->u:Landroid/widget/TextView;

    .line 696
    .line 697
    iget-object v4, v0, La/cpd;->i:La/zmk0;

    .line 698
    .line 699
    invoke-virtual {v4, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 704
    .line 705
    .line 706
    iget-object v2, v1, La/mtx;->l:Landroid/widget/TextView;

    .line 707
    .line 708
    iget-object v4, v0, La/cpd;->j:La/zmk0;

    .line 709
    .line 710
    invoke-virtual {v4, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 715
    .line 716
    .line 717
    iget-object v2, v0, La/cpd;->k:Ljava/util/ArrayList;

    .line 718
    .line 719
    invoke-virtual {v10, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 720
    .line 721
    .line 722
    iget-object v4, v0, La/cpd;->l:La/zmk0;

    .line 723
    .line 724
    iget-object v6, v4, La/zmk0;->a:Ljava/lang/String;

    .line 725
    .line 726
    const-string v7, ""

    .line 727
    .line 728
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    iget-object v7, v1, La/mtx;->c:Landroidx/constraintlayout/widget/Group;

    .line 733
    .line 734
    if-nez v6, :cond_15

    .line 735
    .line 736
    invoke-virtual {v7, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 737
    .line 738
    .line 739
    iget-object v6, v1, La/mtx;->k:Landroid/widget/TextView;

    .line 740
    .line 741
    invoke-virtual {v11, v9}, La/cp;->v(I)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v7

    .line 745
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 746
    .line 747
    .line 748
    iget-object v6, v1, La/mtx;->p:Landroid/widget/TextView;

    .line 749
    .line 750
    invoke-virtual {v4, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 755
    .line 756
    .line 757
    iget-object v4, v1, La/mtx;->t:Landroid/widget/TextView;

    .line 758
    .line 759
    iget-object v6, v0, La/cpd;->m:La/zmk0;

    .line 760
    .line 761
    invoke-virtual {v6, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 762
    .line 763
    .line 764
    move-result-object v6

    .line 765
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 766
    .line 767
    .line 768
    goto :goto_9

    .line 769
    :cond_15
    const/16 v4, 0x8

    .line 770
    .line 771
    invoke-virtual {v7, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 772
    .line 773
    .line 774
    :goto_9
    iget-object v4, v1, La/mtx;->b:Landroidx/constraintlayout/widget/Group;

    .line 775
    .line 776
    iget-boolean v6, v0, La/cpd;->p:Z

    .line 777
    .line 778
    if-eqz v6, :cond_16

    .line 779
    .line 780
    move v7, v15

    .line 781
    goto :goto_a

    .line 782
    :cond_16
    const/16 v7, 0x8

    .line 783
    .line 784
    :goto_a
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 785
    .line 786
    .line 787
    iget-object v4, v1, La/mtx;->m:Landroid/widget/TextView;

    .line 788
    .line 789
    const v9, 0x7f130749

    .line 790
    .line 791
    .line 792
    invoke-virtual {v11, v9}, La/cp;->v(I)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v6

    .line 796
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 797
    .line 798
    .line 799
    iget-object v4, v1, La/mtx;->o:Landroid/widget/TextView;

    .line 800
    .line 801
    iget-object v6, v0, La/cpd;->n:La/zmk0;

    .line 802
    .line 803
    invoke-virtual {v6, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 804
    .line 805
    .line 806
    move-result-object v6

    .line 807
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 808
    .line 809
    .line 810
    iget-object v4, v1, La/mtx;->s:Landroid/widget/TextView;

    .line 811
    .line 812
    iget-object v6, v0, La/cpd;->o:La/zmk0;

    .line 813
    .line 814
    invoke-virtual {v6, v5}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 815
    .line 816
    .line 817
    move-result-object v6

    .line 818
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 819
    .line 820
    .line 821
    iget-object v4, v1, La/mtx;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 822
    .line 823
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    add-int/lit8 v2, v2, -0x1

    .line 828
    .line 829
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 830
    .line 831
    .line 832
    iget-boolean v2, v0, La/cpd;->q:Z

    .line 833
    .line 834
    iget-boolean v4, v0, La/cpd;->r:Z

    .line 835
    .line 836
    iget-object v6, v0, La/cpd;->d:Ljava/lang/String;

    .line 837
    .line 838
    iget-object v7, v0, La/cpd;->f:Ljava/lang/String;

    .line 839
    .line 840
    iget-object v8, v0, La/cpd;->e:Ljava/lang/String;

    .line 841
    .line 842
    iget-object v0, v0, La/cpd;->g:Ljava/lang/String;

    .line 843
    .line 844
    if-eqz v4, :cond_17

    .line 845
    .line 846
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    const v9, 0x7f070194

    .line 851
    .line 852
    .line 853
    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 854
    .line 855
    .line 856
    move-result v5

    .line 857
    goto :goto_b

    .line 858
    :cond_17
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    const v14, 0x7f070197

    .line 863
    .line 864
    .line 865
    invoke-virtual {v5, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 866
    .line 867
    .line 868
    move-result v5

    .line 869
    :goto_b
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 870
    .line 871
    .line 872
    move-result-object v9

    .line 873
    iput v5, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 874
    .line 875
    iget-object v9, v1, La/mtx;->i:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 876
    .line 877
    iget-object v10, v1, La/mtx;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 878
    .line 879
    iget-object v1, v1, La/mtx;->h:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 880
    .line 881
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 882
    .line 883
    .line 884
    move-result-object v14

    .line 885
    iput v5, v14, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 886
    .line 887
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 888
    .line 889
    .line 890
    move-result-object v14

    .line 891
    iput v5, v14, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 892
    .line 893
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 894
    .line 895
    .line 896
    move-result-object v14

    .line 897
    iput v5, v14, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 898
    .line 899
    if-eqz v2, :cond_18

    .line 900
    .line 901
    const v2, 0x7f080843

    .line 902
    .line 903
    .line 904
    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 905
    .line 906
    .line 907
    const v0, 0x7f080842

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 911
    .line 912
    .line 913
    goto :goto_c

    .line 914
    :cond_18
    if-eqz v4, :cond_19

    .line 915
    .line 916
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 917
    .line 918
    const/16 v2, 0xb

    .line 919
    .line 920
    invoke-static {v3, v6, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 921
    .line 922
    .line 923
    invoke-static {v1, v7, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 924
    .line 925
    .line 926
    invoke-static {v10, v8, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 927
    .line 928
    .line 929
    invoke-static {v9, v0, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v10, v15}, Landroid/view/View;->setVisibility(I)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v9, v15}, Landroid/view/View;->setVisibility(I)V

    .line 936
    .line 937
    .line 938
    goto :goto_c

    .line 939
    :cond_19
    const/16 v2, 0xb

    .line 940
    .line 941
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 942
    .line 943
    invoke-static {v3, v6, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 944
    .line 945
    .line 946
    invoke-static {v1, v7, v15, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 947
    .line 948
    .line 949
    const/16 v7, 0x8

    .line 950
    .line 951
    invoke-virtual {v10, v7}, Landroid/view/View;->setVisibility(I)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 955
    .line 956
    .line 957
    :goto_c
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    check-cast v0, La/cpd;

    .line 962
    .line 963
    iget-object v0, v0, La/cpd;->s:La/bex;

    .line 964
    .line 965
    invoke-static {v11, v0, v12, v13}, La/hic;->z(La/cp;La/bex;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    .line 966
    .line 967
    .line 968
    goto/16 :goto_11

    .line 969
    .line 970
    :cond_1a
    const/16 v7, 0x8

    .line 971
    .line 972
    new-instance v5, Ljava/util/ArrayList;

    .line 973
    .line 974
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 975
    .line 976
    .line 977
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 978
    .line 979
    .line 980
    move-result-object v1

    .line 981
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 982
    .line 983
    .line 984
    move-result v6

    .line 985
    if-eqz v6, :cond_1b

    .line 986
    .line 987
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v6

    .line 991
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    check-cast v6, Ljava/util/Collection;

    .line 995
    .line 996
    check-cast v6, Ljava/lang/Iterable;

    .line 997
    .line 998
    invoke-static {v5, v6}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_d

    .line 1002
    :cond_1b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    :cond_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v5

    .line 1010
    if-eqz v5, :cond_2a

    .line 1011
    .line 1012
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v5

    .line 1016
    check-cast v5, Ljava/util/List;

    .line 1017
    .line 1018
    new-instance v6, Ljava/util/ArrayList;

    .line 1019
    .line 1020
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v5

    .line 1027
    :cond_1d
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v8

    .line 1031
    if-eqz v8, :cond_1e

    .line 1032
    .line 1033
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v8

    .line 1037
    instance-of v9, v8, La/ind;

    .line 1038
    .line 1039
    if-eqz v9, :cond_1d

    .line 1040
    .line 1041
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    goto :goto_e

    .line 1045
    :cond_1e
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v5

    .line 1049
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v6

    .line 1053
    if-eqz v6, :cond_1c

    .line 1054
    .line 1055
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v6

    .line 1059
    check-cast v6, La/ind;

    .line 1060
    .line 1061
    move-object v8, v3

    .line 1062
    check-cast v8, La/gkz;

    .line 1063
    .line 1064
    iget-object v9, v4, La/cp;->w:Landroid/content/Context;

    .line 1065
    .line 1066
    iget-object v10, v4, La/cp;->u:La/yfu0;

    .line 1067
    .line 1068
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1069
    .line 1070
    .line 1071
    instance-of v11, v6, La/and;

    .line 1072
    .line 1073
    if-eqz v11, :cond_1f

    .line 1074
    .line 1075
    check-cast v6, La/and;

    .line 1076
    .line 1077
    iget-object v6, v6, La/and;->a:Ljava/util/ArrayList;

    .line 1078
    .line 1079
    invoke-virtual {v8, v6}, La/zz3;->A(Ljava/util/List;)V

    .line 1080
    .line 1081
    .line 1082
    goto :goto_f

    .line 1083
    :cond_1f
    instance-of v8, v6, La/dnd;

    .line 1084
    .line 1085
    if-eqz v8, :cond_20

    .line 1086
    .line 1087
    check-cast v10, La/mtx;

    .line 1088
    .line 1089
    iget-object v8, v10, La/mtx;->q:Landroid/widget/TextView;

    .line 1090
    .line 1091
    check-cast v6, La/dnd;

    .line 1092
    .line 1093
    iget-object v6, v6, La/dnd;->a:La/zmk0;

    .line 1094
    .line 1095
    invoke-virtual {v6, v9}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v6

    .line 1099
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_f

    .line 1103
    :cond_20
    instance-of v8, v6, La/gnd;

    .line 1104
    .line 1105
    if-eqz v8, :cond_21

    .line 1106
    .line 1107
    check-cast v10, La/mtx;

    .line 1108
    .line 1109
    iget-object v8, v10, La/mtx;->u:Landroid/widget/TextView;

    .line 1110
    .line 1111
    check-cast v6, La/gnd;

    .line 1112
    .line 1113
    iget-object v6, v6, La/gnd;->a:La/zmk0;

    .line 1114
    .line 1115
    invoke-virtual {v6, v9}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v6

    .line 1119
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_f

    .line 1123
    :cond_21
    instance-of v8, v6, La/end;

    .line 1124
    .line 1125
    if-eqz v8, :cond_22

    .line 1126
    .line 1127
    check-cast v10, La/mtx;

    .line 1128
    .line 1129
    iget-object v8, v10, La/mtx;->p:Landroid/widget/TextView;

    .line 1130
    .line 1131
    check-cast v6, La/end;

    .line 1132
    .line 1133
    iget-object v6, v6, La/end;->a:La/zmk0;

    .line 1134
    .line 1135
    invoke-virtual {v6, v9}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v6

    .line 1139
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_f

    .line 1143
    :cond_22
    instance-of v8, v6, La/hnd;

    .line 1144
    .line 1145
    if-eqz v8, :cond_23

    .line 1146
    .line 1147
    check-cast v10, La/mtx;

    .line 1148
    .line 1149
    iget-object v8, v10, La/mtx;->t:Landroid/widget/TextView;

    .line 1150
    .line 1151
    check-cast v6, La/hnd;

    .line 1152
    .line 1153
    iget-object v6, v6, La/hnd;->a:La/zmk0;

    .line 1154
    .line 1155
    invoke-virtual {v6, v9}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v6

    .line 1159
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1160
    .line 1161
    .line 1162
    goto :goto_f

    .line 1163
    :cond_23
    instance-of v8, v6, La/cnd;

    .line 1164
    .line 1165
    if-eqz v8, :cond_24

    .line 1166
    .line 1167
    check-cast v10, La/mtx;

    .line 1168
    .line 1169
    iget-object v8, v10, La/mtx;->o:Landroid/widget/TextView;

    .line 1170
    .line 1171
    check-cast v6, La/cnd;

    .line 1172
    .line 1173
    iget-object v6, v6, La/cnd;->a:La/zmk0;

    .line 1174
    .line 1175
    invoke-virtual {v6, v9}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v6

    .line 1179
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1180
    .line 1181
    .line 1182
    goto/16 :goto_f

    .line 1183
    .line 1184
    :cond_24
    instance-of v8, v6, La/fnd;

    .line 1185
    .line 1186
    if-eqz v8, :cond_25

    .line 1187
    .line 1188
    check-cast v10, La/mtx;

    .line 1189
    .line 1190
    iget-object v8, v10, La/mtx;->s:Landroid/widget/TextView;

    .line 1191
    .line 1192
    check-cast v6, La/fnd;

    .line 1193
    .line 1194
    iget-object v6, v6, La/fnd;->a:La/zmk0;

    .line 1195
    .line 1196
    invoke-virtual {v6, v9}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v6

    .line 1200
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1201
    .line 1202
    .line 1203
    goto/16 :goto_f

    .line 1204
    .line 1205
    :cond_25
    instance-of v8, v6, La/zmd;

    .line 1206
    .line 1207
    if-eqz v8, :cond_27

    .line 1208
    .line 1209
    check-cast v10, La/mtx;

    .line 1210
    .line 1211
    iget-object v8, v10, La/mtx;->b:Landroidx/constraintlayout/widget/Group;

    .line 1212
    .line 1213
    check-cast v6, La/zmd;

    .line 1214
    .line 1215
    iget-boolean v6, v6, La/zmd;->a:Z

    .line 1216
    .line 1217
    if-eqz v6, :cond_26

    .line 1218
    .line 1219
    move v6, v15

    .line 1220
    goto :goto_10

    .line 1221
    :cond_26
    move v6, v7

    .line 1222
    :goto_10
    invoke-virtual {v8, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1223
    .line 1224
    .line 1225
    goto/16 :goto_f

    .line 1226
    .line 1227
    :cond_27
    instance-of v8, v6, La/ymd;

    .line 1228
    .line 1229
    if-eqz v8, :cond_28

    .line 1230
    .line 1231
    check-cast v6, La/ymd;

    .line 1232
    .line 1233
    iget-object v6, v6, La/ymd;->a:La/bex;

    .line 1234
    .line 1235
    invoke-static {v4, v6, v2, v0}, La/hic;->z(La/cp;La/bex;Landroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;)V

    .line 1236
    .line 1237
    .line 1238
    goto/16 :goto_f

    .line 1239
    .line 1240
    :cond_28
    instance-of v8, v6, La/bnd;

    .line 1241
    .line 1242
    if-eqz v8, :cond_29

    .line 1243
    .line 1244
    check-cast v10, La/mtx;

    .line 1245
    .line 1246
    iget-object v8, v10, La/mtx;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 1247
    .line 1248
    check-cast v6, La/bnd;

    .line 1249
    .line 1250
    iget v6, v6, La/bnd;->a:I

    .line 1251
    .line 1252
    invoke-static {v8, v6}, La/ucx;->e0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 1253
    .line 1254
    .line 1255
    goto/16 :goto_f

    .line 1256
    .line 1257
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1258
    .line 1259
    .line 1260
    const/4 v2, 0x0

    .line 1261
    goto :goto_12

    .line 1262
    :cond_2a
    :goto_11
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1263
    .line 1264
    :goto_12
    return-object v2

    .line 1265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
