.class public final La/if6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/cp;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/cp;La/wma0;La/wma0;La/cp;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/if6;->a:B

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/if6;->b:La/cp;

    iput-object p2, p0, La/if6;->d:Ljava/lang/Object;

    iput-object p3, p0, La/if6;->e:Ljava/lang/Object;

    iput-object p4, p0, La/if6;->c:La/cp;

    return-void
.end method

.method public synthetic constructor <init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V
    .locals 0

    .line 17
    iput-byte p5, p0, La/if6;->a:B

    iput-object p1, p0, La/if6;->b:La/cp;

    iput-object p2, p0, La/if6;->d:Ljava/lang/Object;

    iput-object p3, p0, La/if6;->c:La/cp;

    iput-object p4, p0, La/if6;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/gkz;La/cp;La/gkz;La/cp;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput-byte v0, p0, La/if6;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/if6;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, La/if6;->b:La/cp;

    .line 11
    .line 12
    iput-object p3, p0, La/if6;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, La/if6;->c:La/cp;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/if6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const v2, 0x7f080842

    .line 5
    .line 6
    .line 7
    const v3, 0x7f080843

    .line 8
    .line 9
    .line 10
    const/16 v4, 0xb

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    iget-object v7, p0, La/if6;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, p0, La/if6;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v9, p0, La/if6;->b:La/cp;

    .line 19
    .line 20
    iget-object p0, p0, La/if6;->c:La/cp;

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_5

    .line 38
    .line 39
    check-cast v8, La/gkz;

    .line 40
    .line 41
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p1, v9, La/cp;->u:La/yfu0;

    .line 46
    .line 47
    check-cast p0, La/yrj0;

    .line 48
    .line 49
    iget-object p0, p0, La/yrj0;->e:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v8, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    check-cast p1, La/wsx;

    .line 55
    .line 56
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/yrj0;

    .line 61
    .line 62
    iget-boolean p0, p0, La/yrj0;->d:Z

    .line 63
    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    iget-object p0, p1, La/wsx;->d:La/jk3;

    .line 67
    .line 68
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 69
    .line 70
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p1, La/wsx;->e:La/jk3;

    .line 76
    .line 77
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 78
    .line 79
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 80
    .line 81
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_0
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/yrj0;

    .line 91
    .line 92
    iget-boolean v0, p0, La/yrj0;->c:Z

    .line 93
    .line 94
    iget-object v2, p0, La/yrj0;->b:Ljava/util/List;

    .line 95
    .line 96
    iget-object p0, p0, La/yrj0;->a:Ljava/util/List;

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    iget-object v0, p1, La/wsx;->d:La/jk3;

    .line 101
    .line 102
    iget-object v3, v0, La/jk3;->e:Landroid/view/View;

    .line 103
    .line 104
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 105
    .line 106
    const/16 v4, 0x8

    .line 107
    .line 108
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    iget-object v3, v0, La/jk3;->f:Landroid/view/View;

    .line 112
    .line 113
    check-cast v3, Landroid/widget/LinearLayout;

    .line 114
    .line 115
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    iget-object v3, v0, La/jk3;->c:Landroid/view/View;

    .line 119
    .line 120
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 121
    .line 122
    iget-object v0, v0, La/jk3;->d:Landroid/view/View;

    .line 123
    .line 124
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 125
    .line 126
    filled-new-array {v3, v0}, [Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0, p0}, La/a8k0;->Q(Ljava/util/List;Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    iget-object p0, p1, La/wsx;->e:La/jk3;

    .line 138
    .line 139
    iget-object v0, p0, La/jk3;->e:Landroid/view/View;

    .line 140
    .line 141
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 142
    .line 143
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, La/jk3;->f:Landroid/view/View;

    .line 147
    .line 148
    check-cast v0, Landroid/widget/LinearLayout;

    .line 149
    .line 150
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, La/jk3;->c:Landroid/view/View;

    .line 154
    .line 155
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 156
    .line 157
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 158
    .line 159
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 160
    .line 161
    filled-new-array {v0, p0}, [Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {p0, v2}, La/a8k0;->Q(Ljava/util/List;Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 174
    .line 175
    iget-object v0, p1, La/wsx;->d:La/jk3;

    .line 176
    .line 177
    iget-object v0, v0, La/jk3;->e:Landroid/view/View;

    .line 178
    .line 179
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 180
    .line 181
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, Ljava/lang/String;

    .line 186
    .line 187
    const-string v3, ""

    .line 188
    .line 189
    if-nez p0, :cond_2

    .line 190
    .line 191
    move-object p0, v3

    .line 192
    :cond_2
    invoke-static {v0, p0, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 193
    .line 194
    .line 195
    iget-object p0, p1, La/wsx;->e:La/jk3;

    .line 196
    .line 197
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 198
    .line 199
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 200
    .line 201
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Ljava/lang/String;

    .line 206
    .line 207
    if-nez v0, :cond_3

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_3
    move-object v3, v0

    .line 211
    :goto_0
    invoke-static {p0, v3, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 212
    .line 213
    .line 214
    :goto_1
    iget-object p0, p1, La/wsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 215
    .line 216
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, La/yrj0;

    .line 221
    .line 222
    iget-object v0, v0, La/yrj0;->g:La/jmo;

    .line 223
    .line 224
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;->a(La/jmo;)V

    .line 225
    .line 226
    .line 227
    iget-object p0, p1, La/wsx;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 228
    .line 229
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, La/yrj0;

    .line 234
    .line 235
    iget-boolean v0, v0, La/yrj0;->f:Z

    .line 236
    .line 237
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    check-cast v2, La/yrj0;

    .line 242
    .line 243
    iget-object v2, v2, La/yrj0;->e:Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    iget-object v3, p1, La/wsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 250
    .line 251
    new-instance v4, La/jto;

    .line 252
    .line 253
    invoke-direct {v4, p0, v3, v0, v2}, La/jto;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ZI)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 257
    .line 258
    .line 259
    iget-object p0, p1, La/wsx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 260
    .line 261
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, La/yrj0;

    .line 266
    .line 267
    iget-boolean p1, p1, La/yrj0;->h:Z

    .line 268
    .line 269
    if-eqz p1, :cond_4

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_4
    move v1, v6

    .line 273
    :goto_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_6

    .line 277
    .line 278
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_6

    .line 292
    .line 293
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    check-cast v2, Ljava/util/Collection;

    .line 301
    .line 302
    check-cast v2, Ljava/lang/Iterable;

    .line 303
    .line 304
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_c

    .line 317
    .line 318
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    check-cast v1, Ljava/util/List;

    .line 323
    .line 324
    new-instance v2, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-eqz v3, :cond_9

    .line 338
    .line 339
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    instance-of v4, v3, La/gqa;

    .line 344
    .line 345
    if-eqz v4, :cond_8

    .line 346
    .line 347
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_7

    .line 360
    .line 361
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    check-cast v2, La/gqa;

    .line 366
    .line 367
    if-eqz v2, :cond_b

    .line 368
    .line 369
    instance-of v3, v2, La/fqa;

    .line 370
    .line 371
    if-eqz v3, :cond_a

    .line 372
    .line 373
    move-object v3, v7

    .line 374
    check-cast v3, La/gkz;

    .line 375
    .line 376
    check-cast v2, La/fqa;

    .line 377
    .line 378
    iget-object v2, v2, La/fqa;->a:Ljava/util/ArrayList;

    .line 379
    .line 380
    invoke-virtual {v3, v2}, La/zz3;->A(Ljava/util/List;)V

    .line 381
    .line 382
    .line 383
    move-object v2, v0

    .line 384
    check-cast v2, La/wsx;

    .line 385
    .line 386
    iget-object v2, v2, La/wsx;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 387
    .line 388
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, La/yrj0;

    .line 393
    .line 394
    iget-boolean v3, v3, La/yrj0;->f:Z

    .line 395
    .line 396
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    check-cast v4, La/yrj0;

    .line 401
    .line 402
    iget-object v4, v4, La/yrj0;->e:Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    move-object v5, v0

    .line 409
    check-cast v5, La/wsx;

    .line 410
    .line 411
    iget-object v5, v5, La/wsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 412
    .line 413
    new-instance v6, La/jto;

    .line 414
    .line 415
    invoke-direct {v6, v2, v5, v3, v4}, La/jto;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ZI)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v6}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 419
    .line 420
    .line 421
    goto :goto_5

    .line 422
    :cond_a
    instance-of v3, v2, La/eqa;

    .line 423
    .line 424
    if-eqz v3, :cond_b

    .line 425
    .line 426
    check-cast v2, La/eqa;

    .line 427
    .line 428
    move-object v3, v0

    .line 429
    check-cast v3, La/wsx;

    .line 430
    .line 431
    iget-object v3, v3, La/wsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 432
    .line 433
    iget-object v2, v2, La/eqa;->a:La/jmo;

    .line 434
    .line 435
    invoke-virtual {v3, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;->a(La/jmo;)V

    .line 436
    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_c
    :goto_6
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    :goto_7
    return-object v10

    .line 446
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_d

    .line 456
    .line 457
    check-cast v8, La/j3j0;

    .line 458
    .line 459
    invoke-static {v9, v8}, La/k9x;->D(La/cp;La/j3j0;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v9}, La/k9x;->z(La/cp;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v9}, La/k9x;->A(La/cp;)V

    .line 466
    .line 467
    .line 468
    invoke-static {v9}, La/k9x;->B(La/cp;)V

    .line 469
    .line 470
    .line 471
    invoke-static {v9}, La/k9x;->C(La/cp;)V

    .line 472
    .line 473
    .line 474
    goto :goto_a

    .line 475
    :cond_d
    new-instance v0, Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 478
    .line 479
    .line 480
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-eqz v1, :cond_e

    .line 489
    .line 490
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    check-cast v1, Ljava/util/Collection;

    .line 498
    .line 499
    check-cast v1, Ljava/lang/Iterable;

    .line 500
    .line 501
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 502
    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-eqz v0, :cond_14

    .line 514
    .line 515
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    check-cast v0, La/n4j0;

    .line 520
    .line 521
    if-eqz v0, :cond_13

    .line 522
    .line 523
    instance-of v1, v0, La/k4j0;

    .line 524
    .line 525
    if-eqz v1, :cond_f

    .line 526
    .line 527
    move-object v0, v7

    .line 528
    check-cast v0, La/j3j0;

    .line 529
    .line 530
    invoke-static {p0, v0}, La/k9x;->D(La/cp;La/j3j0;)V

    .line 531
    .line 532
    .line 533
    goto :goto_9

    .line 534
    :cond_f
    instance-of v1, v0, La/i4j0;

    .line 535
    .line 536
    if-eqz v1, :cond_10

    .line 537
    .line 538
    invoke-static {p0}, La/k9x;->z(La/cp;)V

    .line 539
    .line 540
    .line 541
    goto :goto_9

    .line 542
    :cond_10
    instance-of v1, v0, La/j4j0;

    .line 543
    .line 544
    if-eqz v1, :cond_11

    .line 545
    .line 546
    invoke-static {p0}, La/k9x;->A(La/cp;)V

    .line 547
    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_11
    instance-of v1, v0, La/l4j0;

    .line 551
    .line 552
    if-eqz v1, :cond_12

    .line 553
    .line 554
    invoke-static {p0}, La/k9x;->B(La/cp;)V

    .line 555
    .line 556
    .line 557
    goto :goto_9

    .line 558
    :cond_12
    instance-of v0, v0, La/m4j0;

    .line 559
    .line 560
    if-eqz v0, :cond_13

    .line 561
    .line 562
    invoke-static {p0}, La/k9x;->C(La/cp;)V

    .line 563
    .line 564
    .line 565
    goto :goto_9

    .line 566
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 567
    .line 568
    .line 569
    goto :goto_b

    .line 570
    :cond_14
    :goto_a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    :goto_b
    return-object v10

    .line 573
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 574
    .line 575
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-eqz v0, :cond_15

    .line 583
    .line 584
    check-cast v8, La/j3j0;

    .line 585
    .line 586
    invoke-static {v9, v8}, La/c9x;->p(La/cp;La/j3j0;)V

    .line 587
    .line 588
    .line 589
    invoke-static {v9}, La/c9x;->q(La/cp;)V

    .line 590
    .line 591
    .line 592
    goto :goto_e

    .line 593
    :cond_15
    new-instance v0, Ljava/util/ArrayList;

    .line 594
    .line 595
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 596
    .line 597
    .line 598
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    if-eqz v1, :cond_16

    .line 607
    .line 608
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    check-cast v1, Ljava/util/Collection;

    .line 616
    .line 617
    check-cast v1, Ljava/lang/Iterable;

    .line 618
    .line 619
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 620
    .line 621
    .line 622
    goto :goto_c

    .line 623
    :cond_16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-eqz v0, :cond_19

    .line 632
    .line 633
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    check-cast v0, La/g3j0;

    .line 638
    .line 639
    if-eqz v0, :cond_18

    .line 640
    .line 641
    instance-of v1, v0, La/e3j0;

    .line 642
    .line 643
    if-eqz v1, :cond_17

    .line 644
    .line 645
    move-object v0, v7

    .line 646
    check-cast v0, La/j3j0;

    .line 647
    .line 648
    invoke-static {p0, v0}, La/c9x;->p(La/cp;La/j3j0;)V

    .line 649
    .line 650
    .line 651
    goto :goto_d

    .line 652
    :cond_17
    instance-of v0, v0, La/f3j0;

    .line 653
    .line 654
    if-eqz v0, :cond_18

    .line 655
    .line 656
    invoke-static {p0}, La/c9x;->q(La/cp;)V

    .line 657
    .line 658
    .line 659
    goto :goto_d

    .line 660
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 661
    .line 662
    .line 663
    goto :goto_f

    .line 664
    :cond_19
    :goto_e
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 665
    .line 666
    :goto_f
    return-object v10

    .line 667
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 668
    .line 669
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 670
    .line 671
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    if-eqz v2, :cond_1a

    .line 679
    .line 680
    iget-object p0, v9, La/cp;->u:La/yfu0;

    .line 681
    .line 682
    move-object p1, p0

    .line 683
    check-cast p1, La/xku0;

    .line 684
    .line 685
    iget-object p1, p1, La/xku0;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 686
    .line 687
    iget-object v0, v9, La/xhe0;->a:Landroid/view/View;

    .line 688
    .line 689
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    check-cast v2, La/cth0;

    .line 698
    .line 699
    iget v2, v2, La/cth0;->c:I

    .line 700
    .line 701
    invoke-static {v2, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 706
    .line 707
    .line 708
    check-cast p0, La/xku0;

    .line 709
    .line 710
    iget-object p1, p0, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 711
    .line 712
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    check-cast v0, La/cth0;

    .line 717
    .line 718
    iget-object v0, v0, La/cth0;->d:Ljava/lang/String;

    .line 719
    .line 720
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 721
    .line 722
    .line 723
    iget-object p1, p0, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 724
    .line 725
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    check-cast v0, La/cth0;

    .line 730
    .line 731
    iget-object v0, v0, La/cth0;->e:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 734
    .line 735
    .line 736
    iget-object p1, p0, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 737
    .line 738
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    check-cast v0, La/cth0;

    .line 743
    .line 744
    iget-object v0, v0, La/cth0;->i:La/i8m0;

    .line 745
    .line 746
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setStatus(La/i8m0;)V

    .line 747
    .line 748
    .line 749
    iget-object p1, p0, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 750
    .line 751
    invoke-virtual {p1, v10}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 752
    .line 753
    .line 754
    iget-object p1, p0, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 755
    .line 756
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    check-cast v0, La/cth0;

    .line 761
    .line 762
    iget-boolean v0, v0, La/cth0;->g:Z

    .line 763
    .line 764
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 765
    .line 766
    .line 767
    iget-object p1, p0, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 768
    .line 769
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    check-cast v0, La/cth0;

    .line 774
    .line 775
    iget-boolean v0, v0, La/cth0;->h:Z

    .line 776
    .line 777
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 778
    .line 779
    .line 780
    iget-object p1, p0, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 781
    .line 782
    new-instance v0, La/mth0;

    .line 783
    .line 784
    check-cast v8, La/gwg0;

    .line 785
    .line 786
    invoke-direct {v0, v8, v9, v5}, La/mth0;-><init>(La/gwg0;La/cp;B)V

    .line 787
    .line 788
    .line 789
    invoke-static {p1, v0}, La/wwb;->D(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    .line 790
    .line 791
    .line 792
    iget-object p1, p0, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 793
    .line 794
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 795
    .line 796
    .line 797
    iget-object p1, p0, La/xku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 798
    .line 799
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    check-cast v0, La/cth0;

    .line 804
    .line 805
    iget-boolean v0, v0, La/cth0;->j:Z

    .line 806
    .line 807
    invoke-virtual {p1, v0}, La/tw5;->setFirst(Z)V

    .line 808
    .line 809
    .line 810
    iget-object p0, p0, La/xku0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 811
    .line 812
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object p1

    .line 816
    check-cast p1, La/cth0;

    .line 817
    .line 818
    iget-boolean p1, p1, La/cth0;->k:Z

    .line 819
    .line 820
    invoke-virtual {p0, p1}, La/tw5;->setLast(Z)V

    .line 821
    .line 822
    .line 823
    goto/16 :goto_12

    .line 824
    .line 825
    :cond_1a
    new-instance v2, Ljava/util/ArrayList;

    .line 826
    .line 827
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 828
    .line 829
    .line 830
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 831
    .line 832
    .line 833
    move-result-object p1

    .line 834
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 835
    .line 836
    .line 837
    move-result v3

    .line 838
    if-eqz v3, :cond_1b

    .line 839
    .line 840
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    check-cast v3, Ljava/util/Collection;

    .line 848
    .line 849
    check-cast v3, Ljava/lang/Iterable;

    .line 850
    .line 851
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 852
    .line 853
    .line 854
    goto :goto_10

    .line 855
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 856
    .line 857
    .line 858
    move-result-object p1

    .line 859
    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-eqz v2, :cond_20

    .line 864
    .line 865
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    check-cast v2, La/bth0;

    .line 870
    .line 871
    if-eqz v2, :cond_1f

    .line 872
    .line 873
    instance-of v3, v2, La/xsh0;

    .line 874
    .line 875
    if-eqz v3, :cond_1c

    .line 876
    .line 877
    move-object v3, v0

    .line 878
    check-cast v3, La/xku0;

    .line 879
    .line 880
    iget-object v3, v3, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 881
    .line 882
    invoke-virtual {v3, v10}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 883
    .line 884
    .line 885
    move-object v3, v0

    .line 886
    check-cast v3, La/xku0;

    .line 887
    .line 888
    iget-object v4, v3, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 889
    .line 890
    check-cast v2, La/xsh0;

    .line 891
    .line 892
    iget-boolean v2, v2, La/xsh0;->a:Z

    .line 893
    .line 894
    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 895
    .line 896
    .line 897
    iget-object v2, v3, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 898
    .line 899
    new-instance v3, La/mth0;

    .line 900
    .line 901
    move-object v4, v7

    .line 902
    check-cast v4, La/gwg0;

    .line 903
    .line 904
    invoke-direct {v3, v4, p0, v6}, La/mth0;-><init>(La/gwg0;La/cp;B)V

    .line 905
    .line 906
    .line 907
    invoke-static {v2, v3}, La/wwb;->D(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    .line 908
    .line 909
    .line 910
    goto :goto_11

    .line 911
    :cond_1c
    instance-of v3, v2, La/ysh0;

    .line 912
    .line 913
    if-eqz v3, :cond_1d

    .line 914
    .line 915
    move-object v3, v0

    .line 916
    check-cast v3, La/xku0;

    .line 917
    .line 918
    iget-object v3, v3, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 919
    .line 920
    check-cast v2, La/ysh0;

    .line 921
    .line 922
    iget-object v2, v2, La/ysh0;->a:Ljava/lang/String;

    .line 923
    .line 924
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 925
    .line 926
    .line 927
    move-object v2, v0

    .line 928
    check-cast v2, La/xku0;

    .line 929
    .line 930
    iget-object v2, v2, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 931
    .line 932
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLinesForce(I)V

    .line 933
    .line 934
    .line 935
    goto :goto_11

    .line 936
    :cond_1d
    instance-of v3, v2, La/ath0;

    .line 937
    .line 938
    if-eqz v3, :cond_1e

    .line 939
    .line 940
    move-object v3, v0

    .line 941
    check-cast v3, La/xku0;

    .line 942
    .line 943
    iget-object v3, v3, La/xku0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 944
    .line 945
    check-cast v2, La/ath0;

    .line 946
    .line 947
    iget-object v2, v2, La/ath0;->a:La/i8m0;

    .line 948
    .line 949
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setStatus(La/i8m0;)V

    .line 950
    .line 951
    .line 952
    goto :goto_11

    .line 953
    :cond_1e
    instance-of v3, v2, La/zsh0;

    .line 954
    .line 955
    if-eqz v3, :cond_1f

    .line 956
    .line 957
    move-object v3, v0

    .line 958
    check-cast v3, La/xku0;

    .line 959
    .line 960
    iget-object v3, v3, La/xku0;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 961
    .line 962
    check-cast v2, La/zsh0;

    .line 963
    .line 964
    iget-boolean v2, v2, La/zsh0;->a:Z

    .line 965
    .line 966
    invoke-virtual {v3, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 967
    .line 968
    .line 969
    goto :goto_11

    .line 970
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 971
    .line 972
    .line 973
    goto :goto_13

    .line 974
    :cond_20
    :goto_12
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 975
    .line 976
    :goto_13
    return-object v10

    .line 977
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 978
    .line 979
    check-cast v7, Ljava/lang/String;

    .line 980
    .line 981
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 985
    .line 986
    .line 987
    move-result v0

    .line 988
    if-eqz v0, :cond_21

    .line 989
    .line 990
    invoke-static {v9}, La/m2x;->F(La/cp;)V

    .line 991
    .line 992
    .line 993
    invoke-static {v9}, La/m2x;->E(La/cp;)V

    .line 994
    .line 995
    .line 996
    check-cast v8, Ljava/lang/String;

    .line 997
    .line 998
    invoke-static {v9, v8}, La/m2x;->H(La/cp;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-static {v9}, La/m2x;->G(La/cp;)V

    .line 1002
    .line 1003
    .line 1004
    goto/16 :goto_16

    .line 1005
    .line 1006
    :cond_21
    new-instance v0, Ljava/util/ArrayList;

    .line 1007
    .line 1008
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1009
    .line 1010
    .line 1011
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1012
    .line 1013
    .line 1014
    move-result-object p1

    .line 1015
    :goto_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    if-eqz v1, :cond_22

    .line 1020
    .line 1021
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1026
    .line 1027
    .line 1028
    check-cast v1, Ljava/util/Collection;

    .line 1029
    .line 1030
    check-cast v1, Ljava/lang/Iterable;

    .line 1031
    .line 1032
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_14

    .line 1036
    :cond_22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1037
    .line 1038
    .line 1039
    move-result-object p1

    .line 1040
    :goto_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_29

    .line 1045
    .line 1046
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    check-cast v0, La/otc0;

    .line 1051
    .line 1052
    if-eqz v0, :cond_28

    .line 1053
    .line 1054
    instance-of v1, v0, La/ktc0;

    .line 1055
    .line 1056
    if-eqz v1, :cond_23

    .line 1057
    .line 1058
    invoke-static {p0}, La/m2x;->E(La/cp;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-static {p0}, La/m2x;->F(La/cp;)V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_15

    .line 1065
    :cond_23
    instance-of v1, v0, La/itc0;

    .line 1066
    .line 1067
    if-eqz v1, :cond_24

    .line 1068
    .line 1069
    invoke-static {p0}, La/m2x;->E(La/cp;)V

    .line 1070
    .line 1071
    .line 1072
    goto :goto_15

    .line 1073
    :cond_24
    instance-of v1, v0, La/jtc0;

    .line 1074
    .line 1075
    if-eqz v1, :cond_25

    .line 1076
    .line 1077
    invoke-static {p0}, La/m2x;->F(La/cp;)V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_15

    .line 1081
    :cond_25
    instance-of v1, v0, La/ltc0;

    .line 1082
    .line 1083
    if-eqz v1, :cond_26

    .line 1084
    .line 1085
    invoke-static {p0}, La/m2x;->G(La/cp;)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_15

    .line 1089
    :cond_26
    instance-of v1, v0, La/mtc0;

    .line 1090
    .line 1091
    if-eqz v1, :cond_27

    .line 1092
    .line 1093
    invoke-static {p0, v7}, La/m2x;->H(La/cp;Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_15

    .line 1097
    :cond_27
    instance-of v0, v0, La/ntc0;

    .line 1098
    .line 1099
    if-eqz v0, :cond_28

    .line 1100
    .line 1101
    invoke-static {p0, v7}, La/m2x;->H(La/cp;Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-static {p0}, La/m2x;->G(La/cp;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-static {p0}, La/m2x;->F(La/cp;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-static {p0}, La/m2x;->E(La/cp;)V

    .line 1111
    .line 1112
    .line 1113
    goto :goto_15

    .line 1114
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 1115
    .line 1116
    .line 1117
    goto :goto_17

    .line 1118
    :cond_29
    :goto_16
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1119
    .line 1120
    :goto_17
    return-object v10

    .line 1121
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 1122
    .line 1123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    if-eqz v0, :cond_2a

    .line 1131
    .line 1132
    check-cast v8, La/bg5;

    .line 1133
    .line 1134
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object p0

    .line 1138
    check-cast p0, La/v4c0;

    .line 1139
    .line 1140
    iget-object p0, p0, La/v4c0;->a:Ljava/util/ArrayList;

    .line 1141
    .line 1142
    invoke-virtual {v8, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 1143
    .line 1144
    .line 1145
    goto :goto_1a

    .line 1146
    :cond_2a
    new-instance v0, Ljava/util/ArrayList;

    .line 1147
    .line 1148
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1149
    .line 1150
    .line 1151
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1152
    .line 1153
    .line 1154
    move-result-object p1

    .line 1155
    :goto_18
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v1

    .line 1159
    if-eqz v1, :cond_2b

    .line 1160
    .line 1161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    check-cast v1, Ljava/util/Collection;

    .line 1169
    .line 1170
    check-cast v1, Ljava/lang/Iterable;

    .line 1171
    .line 1172
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1173
    .line 1174
    .line 1175
    goto :goto_18

    .line 1176
    :cond_2b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1177
    .line 1178
    .line 1179
    move-result-object p1

    .line 1180
    :cond_2c
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v0

    .line 1184
    if-eqz v0, :cond_2d

    .line 1185
    .line 1186
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    check-cast v0, La/u4c0;

    .line 1191
    .line 1192
    if-eqz v0, :cond_2c

    .line 1193
    .line 1194
    move-object v0, v7

    .line 1195
    check-cast v0, La/bg5;

    .line 1196
    .line 1197
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    check-cast v1, La/v4c0;

    .line 1202
    .line 1203
    iget-object v1, v1, La/v4c0;->a:Ljava/util/ArrayList;

    .line 1204
    .line 1205
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 1206
    .line 1207
    .line 1208
    goto :goto_19

    .line 1209
    :cond_2d
    :goto_1a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1210
    .line 1211
    return-object p0

    .line 1212
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 1213
    .line 1214
    iget-object v0, v9, La/cp;->u:La/yfu0;

    .line 1215
    .line 1216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1217
    .line 1218
    .line 1219
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1220
    .line 1221
    .line 1222
    move-result v1

    .line 1223
    if-eqz v1, :cond_2e

    .line 1224
    .line 1225
    move-object p0, v0

    .line 1226
    check-cast p0, La/er10;

    .line 1227
    .line 1228
    iget-object p1, p0, La/er10;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1229
    .line 1230
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v1

    .line 1234
    check-cast v1, La/cr10;

    .line 1235
    .line 1236
    iget-boolean v1, v1, La/cr10;->e:Z

    .line 1237
    .line 1238
    invoke-virtual {p1, v1}, La/tw5;->setFirst(Z)V

    .line 1239
    .line 1240
    .line 1241
    iget-object p1, p0, La/er10;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1242
    .line 1243
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v1

    .line 1247
    check-cast v1, La/cr10;

    .line 1248
    .line 1249
    iget-boolean v1, v1, La/cr10;->f:Z

    .line 1250
    .line 1251
    invoke-virtual {p1, v1}, La/tw5;->setLast(Z)V

    .line 1252
    .line 1253
    .line 1254
    iget-object p1, p0, La/er10;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1255
    .line 1256
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    check-cast v1, La/cr10;

    .line 1261
    .line 1262
    iget-object v1, v1, La/cr10;->b:Ljava/lang/String;

    .line 1263
    .line 1264
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1265
    .line 1266
    .line 1267
    check-cast v0, La/er10;

    .line 1268
    .line 1269
    iget-object p1, v0, La/er10;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1270
    .line 1271
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v0

    .line 1275
    check-cast v0, La/cr10;

    .line 1276
    .line 1277
    iget-boolean v0, v0, La/cr10;->c:Z

    .line 1278
    .line 1279
    invoke-virtual {p1, v0}, La/tw5;->setEnabled(Z)V

    .line 1280
    .line 1281
    .line 1282
    iget-object p0, p0, La/er10;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1283
    .line 1284
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object p1

    .line 1288
    check-cast p1, La/cr10;

    .line 1289
    .line 1290
    check-cast v8, La/e000;

    .line 1291
    .line 1292
    invoke-virtual {p0, v10}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1293
    .line 1294
    .line 1295
    iget-boolean v0, p1, La/cr10;->d:Z

    .line 1296
    .line 1297
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1298
    .line 1299
    .line 1300
    new-instance v0, La/okv;

    .line 1301
    .line 1302
    invoke-direct {v0, v5, v8, p1}, La/okv;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_1d

    .line 1309
    :cond_2e
    new-instance v0, Ljava/util/ArrayList;

    .line 1310
    .line 1311
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1312
    .line 1313
    .line 1314
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1315
    .line 1316
    .line 1317
    move-result-object p1

    .line 1318
    :goto_1b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    if-eqz v1, :cond_2f

    .line 1323
    .line 1324
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    check-cast v1, Ljava/util/Collection;

    .line 1332
    .line 1333
    check-cast v1, Ljava/lang/Iterable;

    .line 1334
    .line 1335
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_1b

    .line 1339
    :cond_2f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1340
    .line 1341
    .line 1342
    move-result-object p1

    .line 1343
    :goto_1c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v0

    .line 1347
    if-eqz v0, :cond_32

    .line 1348
    .line 1349
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    check-cast v0, La/br10;

    .line 1354
    .line 1355
    iget-object v1, p0, La/cp;->u:La/yfu0;

    .line 1356
    .line 1357
    check-cast v1, La/er10;

    .line 1358
    .line 1359
    if-eqz v0, :cond_31

    .line 1360
    .line 1361
    instance-of v2, v0, La/ar10;

    .line 1362
    .line 1363
    if-eqz v2, :cond_30

    .line 1364
    .line 1365
    iget-object v0, v1, La/er10;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1366
    .line 1367
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v1

    .line 1371
    check-cast v1, La/cr10;

    .line 1372
    .line 1373
    move-object v2, v7

    .line 1374
    check-cast v2, La/e000;

    .line 1375
    .line 1376
    invoke-virtual {v0, v10}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1377
    .line 1378
    .line 1379
    iget-boolean v3, v1, La/cr10;->d:Z

    .line 1380
    .line 1381
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 1382
    .line 1383
    .line 1384
    new-instance v3, La/okv;

    .line 1385
    .line 1386
    invoke-direct {v3, v5, v2, v1}, La/okv;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {v0, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_1c

    .line 1393
    :cond_30
    instance-of v0, v0, La/zq10;

    .line 1394
    .line 1395
    if-eqz v0, :cond_31

    .line 1396
    .line 1397
    iget-object v0, v1, La/er10;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1398
    .line 1399
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    check-cast v1, La/cr10;

    .line 1404
    .line 1405
    iget-boolean v1, v1, La/cr10;->c:Z

    .line 1406
    .line 1407
    invoke-virtual {v0, v1}, La/tw5;->setEnabled(Z)V

    .line 1408
    .line 1409
    .line 1410
    goto :goto_1c

    .line 1411
    :cond_31
    invoke-static {}, La/t9f;->b()V

    .line 1412
    .line 1413
    .line 1414
    goto :goto_1e

    .line 1415
    :cond_32
    :goto_1d
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1416
    .line 1417
    :goto_1e
    return-object v10

    .line 1418
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 1419
    .line 1420
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    if-eqz v0, :cond_34

    .line 1428
    .line 1429
    check-cast v8, La/gkz;

    .line 1430
    .line 1431
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object p0

    .line 1435
    iget-object p1, v9, La/cp;->w:Landroid/content/Context;

    .line 1436
    .line 1437
    iget-object v0, v9, La/cp;->u:La/yfu0;

    .line 1438
    .line 1439
    check-cast p0, La/zsq;

    .line 1440
    .line 1441
    iget-boolean v1, p0, La/zsq;->i:Z

    .line 1442
    .line 1443
    if-eqz v1, :cond_33

    .line 1444
    .line 1445
    move-object v1, v0

    .line 1446
    check-cast v1, La/qsx;

    .line 1447
    .line 1448
    iget-object v4, v1, La/qsx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1449
    .line 1450
    invoke-virtual {v4, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1451
    .line 1452
    .line 1453
    iget-object v1, v1, La/qsx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1454
    .line 1455
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1456
    .line 1457
    .line 1458
    goto :goto_1f

    .line 1459
    :cond_33
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1460
    .line 1461
    move-object v1, v0

    .line 1462
    check-cast v1, La/qsx;

    .line 1463
    .line 1464
    iget-object v2, v1, La/qsx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1465
    .line 1466
    iget-object v3, p0, La/zsq;->c:Ljava/lang/String;

    .line 1467
    .line 1468
    invoke-static {v2, v3, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1469
    .line 1470
    .line 1471
    iget-object v1, v1, La/qsx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1472
    .line 1473
    iget-object v2, p0, La/zsq;->d:Ljava/lang/String;

    .line 1474
    .line 1475
    invoke-static {v1, v2, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1476
    .line 1477
    .line 1478
    :goto_1f
    check-cast v0, La/qsx;

    .line 1479
    .line 1480
    iget-object v1, v0, La/qsx;->j:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 1481
    .line 1482
    iget-object v2, p0, La/zsq;->g:La/usq;

    .line 1483
    .line 1484
    invoke-virtual {v1, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;->a(La/usq;)V

    .line 1485
    .line 1486
    .line 1487
    iget-object v1, v0, La/qsx;->l:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 1488
    .line 1489
    iget-object v2, p0, La/zsq;->h:La/usq;

    .line 1490
    .line 1491
    invoke-virtual {v1, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;->a(La/usq;)V

    .line 1492
    .line 1493
    .line 1494
    iget-object v1, v0, La/qsx;->e:Landroid/widget/TextView;

    .line 1495
    .line 1496
    iget-object v2, p0, La/zsq;->a:Ljava/lang/String;

    .line 1497
    .line 1498
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1499
    .line 1500
    .line 1501
    iget-object v1, v0, La/qsx;->g:Landroid/widget/TextView;

    .line 1502
    .line 1503
    iget-object v2, p0, La/zsq;->b:Ljava/lang/String;

    .line 1504
    .line 1505
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1506
    .line 1507
    .line 1508
    iget-object v1, v0, La/qsx;->f:Landroid/widget/TextView;

    .line 1509
    .line 1510
    iget-object v2, p0, La/zsq;->e:La/zmk0;

    .line 1511
    .line 1512
    invoke-virtual {v2, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2

    .line 1516
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1517
    .line 1518
    .line 1519
    iget-object v0, v0, La/qsx;->h:Landroid/widget/TextView;

    .line 1520
    .line 1521
    iget-object v1, p0, La/zsq;->f:La/zmk0;

    .line 1522
    .line 1523
    invoke-virtual {v1, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1524
    .line 1525
    .line 1526
    move-result-object p1

    .line 1527
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1528
    .line 1529
    .line 1530
    iget-object p0, p0, La/zsq;->j:Ljava/util/ArrayList;

    .line 1531
    .line 1532
    invoke-virtual {v8, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 1533
    .line 1534
    .line 1535
    goto/16 :goto_23

    .line 1536
    .line 1537
    :cond_34
    new-instance v0, Ljava/util/ArrayList;

    .line 1538
    .line 1539
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1540
    .line 1541
    .line 1542
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1543
    .line 1544
    .line 1545
    move-result-object p1

    .line 1546
    :goto_20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1547
    .line 1548
    .line 1549
    move-result v1

    .line 1550
    if-eqz v1, :cond_35

    .line 1551
    .line 1552
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v1

    .line 1556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1557
    .line 1558
    .line 1559
    check-cast v1, Ljava/util/Collection;

    .line 1560
    .line 1561
    check-cast v1, Ljava/lang/Iterable;

    .line 1562
    .line 1563
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1564
    .line 1565
    .line 1566
    goto :goto_20

    .line 1567
    :cond_35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1568
    .line 1569
    .line 1570
    move-result-object p1

    .line 1571
    :cond_36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v0

    .line 1575
    if-eqz v0, :cond_3f

    .line 1576
    .line 1577
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v0

    .line 1581
    check-cast v0, Ljava/util/List;

    .line 1582
    .line 1583
    new-instance v1, Ljava/util/ArrayList;

    .line 1584
    .line 1585
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1586
    .line 1587
    .line 1588
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    :cond_37
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1593
    .line 1594
    .line 1595
    move-result v2

    .line 1596
    if-eqz v2, :cond_38

    .line 1597
    .line 1598
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v2

    .line 1602
    instance-of v3, v2, La/fpa;

    .line 1603
    .line 1604
    if-eqz v3, :cond_37

    .line 1605
    .line 1606
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    goto :goto_21

    .line 1610
    :cond_38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1615
    .line 1616
    .line 1617
    move-result v1

    .line 1618
    if-eqz v1, :cond_36

    .line 1619
    .line 1620
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v1

    .line 1624
    check-cast v1, La/fpa;

    .line 1625
    .line 1626
    move-object v2, v7

    .line 1627
    check-cast v2, La/gkz;

    .line 1628
    .line 1629
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 1630
    .line 1631
    iget-object v4, p0, La/cp;->u:La/yfu0;

    .line 1632
    .line 1633
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1634
    .line 1635
    .line 1636
    instance-of v5, v1, La/zoa;

    .line 1637
    .line 1638
    if-eqz v5, :cond_39

    .line 1639
    .line 1640
    check-cast v1, La/zoa;

    .line 1641
    .line 1642
    iget-object v1, v1, La/zoa;->a:Ljava/util/ArrayList;

    .line 1643
    .line 1644
    invoke-virtual {v2, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 1645
    .line 1646
    .line 1647
    goto :goto_22

    .line 1648
    :cond_39
    instance-of v2, v1, La/bpa;

    .line 1649
    .line 1650
    if-eqz v2, :cond_3a

    .line 1651
    .line 1652
    check-cast v4, La/qsx;

    .line 1653
    .line 1654
    iget-object v2, v4, La/qsx;->j:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 1655
    .line 1656
    check-cast v1, La/bpa;

    .line 1657
    .line 1658
    iget-object v1, v1, La/bpa;->a:La/usq;

    .line 1659
    .line 1660
    invoke-virtual {v2, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;->a(La/usq;)V

    .line 1661
    .line 1662
    .line 1663
    goto :goto_22

    .line 1664
    :cond_3a
    instance-of v2, v1, La/cpa;

    .line 1665
    .line 1666
    if-eqz v2, :cond_3b

    .line 1667
    .line 1668
    check-cast v4, La/qsx;

    .line 1669
    .line 1670
    iget-object v2, v4, La/qsx;->f:Landroid/widget/TextView;

    .line 1671
    .line 1672
    check-cast v1, La/cpa;

    .line 1673
    .line 1674
    iget-object v1, v1, La/cpa;->a:La/zmk0;

    .line 1675
    .line 1676
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v1

    .line 1680
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1681
    .line 1682
    .line 1683
    goto :goto_22

    .line 1684
    :cond_3b
    instance-of v2, v1, La/dpa;

    .line 1685
    .line 1686
    if-eqz v2, :cond_3c

    .line 1687
    .line 1688
    check-cast v4, La/qsx;

    .line 1689
    .line 1690
    iget-object v2, v4, La/qsx;->l:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 1691
    .line 1692
    check-cast v1, La/dpa;

    .line 1693
    .line 1694
    iget-object v1, v1, La/dpa;->a:La/usq;

    .line 1695
    .line 1696
    invoke-virtual {v2, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;->a(La/usq;)V

    .line 1697
    .line 1698
    .line 1699
    goto :goto_22

    .line 1700
    :cond_3c
    instance-of v2, v1, La/epa;

    .line 1701
    .line 1702
    if-eqz v2, :cond_3d

    .line 1703
    .line 1704
    check-cast v4, La/qsx;

    .line 1705
    .line 1706
    iget-object v2, v4, La/qsx;->h:Landroid/widget/TextView;

    .line 1707
    .line 1708
    check-cast v1, La/epa;

    .line 1709
    .line 1710
    iget-object v1, v1, La/epa;->a:La/zmk0;

    .line 1711
    .line 1712
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v1

    .line 1716
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1717
    .line 1718
    .line 1719
    goto :goto_22

    .line 1720
    :cond_3d
    instance-of v2, v1, La/apa;

    .line 1721
    .line 1722
    if-eqz v2, :cond_3e

    .line 1723
    .line 1724
    check-cast v4, La/qsx;

    .line 1725
    .line 1726
    iget-object v2, v4, La/qsx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 1727
    .line 1728
    check-cast v1, La/apa;

    .line 1729
    .line 1730
    iget v1, v1, La/apa;->a:I

    .line 1731
    .line 1732
    invoke-static {v2, v1}, La/ucx;->e0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_22

    .line 1736
    :cond_3e
    invoke-static {}, La/t9f;->b()V

    .line 1737
    .line 1738
    .line 1739
    goto :goto_24

    .line 1740
    :cond_3f
    :goto_23
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1741
    .line 1742
    :goto_24
    return-object v10

    .line 1743
    :pswitch_7
    check-cast p1, Ljava/util/List;

    .line 1744
    .line 1745
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 1746
    .line 1747
    iget-object v1, v9, La/cp;->u:La/yfu0;

    .line 1748
    .line 1749
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1750
    .line 1751
    .line 1752
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1753
    .line 1754
    .line 1755
    move-result v2

    .line 1756
    if-eqz v2, :cond_40

    .line 1757
    .line 1758
    move-object p0, v1

    .line 1759
    check-cast p0, La/vtx;

    .line 1760
    .line 1761
    iget-object p0, p0, La/vtx;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 1762
    .line 1763
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1764
    .line 1765
    .line 1766
    move-result-object p1

    .line 1767
    check-cast p1, La/upo;

    .line 1768
    .line 1769
    iget-object p1, p1, La/upo;->i:La/npo;

    .line 1770
    .line 1771
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setStyle(La/npo;)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1775
    .line 1776
    .line 1777
    move-result-object p1

    .line 1778
    const v0, 0x7f130842

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object p1

    .line 1785
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setMarketDescription(Ljava/lang/String;)V

    .line 1789
    .line 1790
    .line 1791
    new-instance p1, La/lhf;

    .line 1792
    .line 1793
    check-cast v8, La/wma0;

    .line 1794
    .line 1795
    const/16 v0, 0x17

    .line 1796
    .line 1797
    invoke-direct {p1, v8, v9, v0}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1798
    .line 1799
    .line 1800
    new-instance v0, La/jpe0;

    .line 1801
    .line 1802
    const/16 v2, 0xa

    .line 1803
    .line 1804
    invoke-direct {v0, p1, v2}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1808
    .line 1809
    .line 1810
    new-instance p1, La/lhf;

    .line 1811
    .line 1812
    check-cast v7, La/wma0;

    .line 1813
    .line 1814
    const/16 v0, 0x18

    .line 1815
    .line 1816
    invoke-direct {p1, v7, v9, v0}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1817
    .line 1818
    .line 1819
    iput-object p1, p0, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->q:Lkotlin/jvm/functions/Function0;

    .line 1820
    .line 1821
    move-object p0, v1

    .line 1822
    check-cast p0, La/vtx;

    .line 1823
    .line 1824
    iget-object p0, p0, La/vtx;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 1825
    .line 1826
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1827
    .line 1828
    .line 1829
    move-result-object p1

    .line 1830
    check-cast p1, La/upo;

    .line 1831
    .line 1832
    iget-object p1, p1, La/upo;->d:Ljava/lang/String;

    .line 1833
    .line 1834
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setHeaderTitle(Ljava/lang/String;)V

    .line 1835
    .line 1836
    .line 1837
    move-object p0, v1

    .line 1838
    check-cast p0, La/vtx;

    .line 1839
    .line 1840
    iget-object p0, p0, La/vtx;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 1841
    .line 1842
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1843
    .line 1844
    .line 1845
    move-result-object p1

    .line 1846
    check-cast p1, La/upo;

    .line 1847
    .line 1848
    iget-object p1, p1, La/upo;->c:Ljava/lang/String;

    .line 1849
    .line 1850
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setCoefficient(Ljava/lang/String;)V

    .line 1851
    .line 1852
    .line 1853
    check-cast v1, La/vtx;

    .line 1854
    .line 1855
    iget-object p0, v1, La/vtx;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 1856
    .line 1857
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object p1

    .line 1861
    check-cast p1, La/upo;

    .line 1862
    .line 1863
    iget-object p1, p1, La/upo;->f:Ljava/util/ArrayList;

    .line 1864
    .line 1865
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setSportEventList(Ljava/util/List;)V

    .line 1866
    .line 1867
    .line 1868
    goto :goto_27

    .line 1869
    :cond_40
    new-instance v1, Ljava/util/ArrayList;

    .line 1870
    .line 1871
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1872
    .line 1873
    .line 1874
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1875
    .line 1876
    .line 1877
    move-result-object p1

    .line 1878
    :goto_25
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1879
    .line 1880
    .line 1881
    move-result v2

    .line 1882
    if-eqz v2, :cond_41

    .line 1883
    .line 1884
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v2

    .line 1888
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1889
    .line 1890
    .line 1891
    check-cast v2, Ljava/util/Collection;

    .line 1892
    .line 1893
    check-cast v2, Ljava/lang/Iterable;

    .line 1894
    .line 1895
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1896
    .line 1897
    .line 1898
    goto :goto_25

    .line 1899
    :cond_41
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1900
    .line 1901
    .line 1902
    move-result-object p1

    .line 1903
    :goto_26
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1904
    .line 1905
    .line 1906
    move-result v1

    .line 1907
    if-eqz v1, :cond_44

    .line 1908
    .line 1909
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v1

    .line 1913
    check-cast v1, La/tpo;

    .line 1914
    .line 1915
    if-eqz v1, :cond_43

    .line 1916
    .line 1917
    instance-of v2, v1, La/rpo;

    .line 1918
    .line 1919
    if-eqz v2, :cond_42

    .line 1920
    .line 1921
    move-object v1, v0

    .line 1922
    check-cast v1, La/vtx;

    .line 1923
    .line 1924
    iget-object v1, v1, La/vtx;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 1925
    .line 1926
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v2

    .line 1930
    check-cast v2, La/upo;

    .line 1931
    .line 1932
    iget-object v2, v2, La/upo;->c:Ljava/lang/String;

    .line 1933
    .line 1934
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setCoefficient(Ljava/lang/String;)V

    .line 1935
    .line 1936
    .line 1937
    goto :goto_26

    .line 1938
    :cond_42
    instance-of v1, v1, La/spo;

    .line 1939
    .line 1940
    if-eqz v1, :cond_43

    .line 1941
    .line 1942
    move-object v1, v0

    .line 1943
    check-cast v1, La/vtx;

    .line 1944
    .line 1945
    iget-object v1, v1, La/vtx;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    .line 1946
    .line 1947
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v2

    .line 1951
    check-cast v2, La/upo;

    .line 1952
    .line 1953
    iget-object v2, v2, La/upo;->f:Ljava/util/ArrayList;

    .line 1954
    .line 1955
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->setSportEventList(Ljava/util/List;)V

    .line 1956
    .line 1957
    .line 1958
    goto :goto_26

    .line 1959
    :cond_43
    invoke-static {}, La/t9f;->b()V

    .line 1960
    .line 1961
    .line 1962
    goto :goto_28

    .line 1963
    :cond_44
    :goto_27
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1964
    .line 1965
    :goto_28
    return-object v10

    .line 1966
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 1967
    .line 1968
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1969
    .line 1970
    .line 1971
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1972
    .line 1973
    .line 1974
    move-result v0

    .line 1975
    if-eqz v0, :cond_45

    .line 1976
    .line 1977
    invoke-static {v9}, La/vtb;->e0(La/cp;)V

    .line 1978
    .line 1979
    .line 1980
    invoke-static {v9}, La/vtb;->f0(La/cp;)V

    .line 1981
    .line 1982
    .line 1983
    check-cast v8, La/x2i;

    .line 1984
    .line 1985
    invoke-static {v9, v8}, La/vtb;->d0(La/cp;La/x2i;)V

    .line 1986
    .line 1987
    .line 1988
    goto :goto_2b

    .line 1989
    :cond_45
    new-instance v0, Ljava/util/ArrayList;

    .line 1990
    .line 1991
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1992
    .line 1993
    .line 1994
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1995
    .line 1996
    .line 1997
    move-result-object p1

    .line 1998
    :goto_29
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1999
    .line 2000
    .line 2001
    move-result v1

    .line 2002
    if-eqz v1, :cond_46

    .line 2003
    .line 2004
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v1

    .line 2008
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2009
    .line 2010
    .line 2011
    check-cast v1, Ljava/util/Collection;

    .line 2012
    .line 2013
    check-cast v1, Ljava/lang/Iterable;

    .line 2014
    .line 2015
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2016
    .line 2017
    .line 2018
    goto :goto_29

    .line 2019
    :cond_46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2020
    .line 2021
    .line 2022
    move-result-object p1

    .line 2023
    :goto_2a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2024
    .line 2025
    .line 2026
    move-result v0

    .line 2027
    if-eqz v0, :cond_4a

    .line 2028
    .line 2029
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v0

    .line 2033
    check-cast v0, La/khj;

    .line 2034
    .line 2035
    if-eqz v0, :cond_49

    .line 2036
    .line 2037
    instance-of v1, v0, La/ihj;

    .line 2038
    .line 2039
    if-eqz v1, :cond_47

    .line 2040
    .line 2041
    invoke-static {p0}, La/vtb;->e0(La/cp;)V

    .line 2042
    .line 2043
    .line 2044
    goto :goto_2a

    .line 2045
    :cond_47
    instance-of v1, v0, La/hhj;

    .line 2046
    .line 2047
    if-eqz v1, :cond_48

    .line 2048
    .line 2049
    invoke-static {p0}, La/vtb;->f0(La/cp;)V

    .line 2050
    .line 2051
    .line 2052
    goto :goto_2a

    .line 2053
    :cond_48
    instance-of v0, v0, La/jhj;

    .line 2054
    .line 2055
    if-eqz v0, :cond_49

    .line 2056
    .line 2057
    move-object v0, v7

    .line 2058
    check-cast v0, La/x2i;

    .line 2059
    .line 2060
    invoke-static {p0, v0}, La/vtb;->d0(La/cp;La/x2i;)V

    .line 2061
    .line 2062
    .line 2063
    goto :goto_2a

    .line 2064
    :cond_49
    invoke-static {}, La/t9f;->b()V

    .line 2065
    .line 2066
    .line 2067
    goto :goto_2c

    .line 2068
    :cond_4a
    :goto_2b
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2069
    .line 2070
    :goto_2c
    return-object v10

    .line 2071
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 2072
    .line 2073
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 2074
    .line 2075
    iget-object v1, v9, La/cp;->u:La/yfu0;

    .line 2076
    .line 2077
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2078
    .line 2079
    .line 2080
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2081
    .line 2082
    .line 2083
    move-result v2

    .line 2084
    if-eqz v2, :cond_4b

    .line 2085
    .line 2086
    invoke-static {v9}, La/aac;->N(La/cp;)V

    .line 2087
    .line 2088
    .line 2089
    invoke-static {v9}, La/aac;->K(La/cp;)V

    .line 2090
    .line 2091
    .line 2092
    move-object p0, v1

    .line 2093
    check-cast p0, La/p5g;

    .line 2094
    .line 2095
    iget-object p0, p0, La/p5g;->f:Landroid/widget/TextView;

    .line 2096
    .line 2097
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 2098
    .line 2099
    .line 2100
    move-result-object p1

    .line 2101
    check-cast p1, La/w5g;

    .line 2102
    .line 2103
    iget-object p1, p1, La/w5g;->e:Ljava/lang/String;

    .line 2104
    .line 2105
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2106
    .line 2107
    .line 2108
    invoke-static {v9}, La/aac;->L(La/cp;)V

    .line 2109
    .line 2110
    .line 2111
    move-object p0, v1

    .line 2112
    check-cast p0, La/p5g;

    .line 2113
    .line 2114
    iget-object p0, p0, La/p5g;->b:Landroid/widget/FrameLayout;

    .line 2115
    .line 2116
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 2117
    .line 2118
    .line 2119
    move-result-object p1

    .line 2120
    check-cast p1, La/w5g;

    .line 2121
    .line 2122
    iget-object p1, p1, La/w5g;->f:Ljava/util/ArrayList;

    .line 2123
    .line 2124
    check-cast v8, Ljava/util/ArrayList;

    .line 2125
    .line 2126
    invoke-static {p0, p1, v8}, La/aac;->M(Landroid/widget/FrameLayout;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 2127
    .line 2128
    .line 2129
    check-cast v1, La/p5g;

    .line 2130
    .line 2131
    iget-object v2, v1, La/p5g;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2132
    .line 2133
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object p0

    .line 2137
    check-cast p0, La/w5g;

    .line 2138
    .line 2139
    iget v6, p0, La/w5g;->h:I

    .line 2140
    .line 2141
    const/4 v7, 0x7

    .line 2142
    const/4 v3, 0x0

    .line 2143
    const/4 v4, 0x0

    .line 2144
    const/4 v5, 0x0

    .line 2145
    invoke-static/range {v2 .. v7}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 2146
    .line 2147
    .line 2148
    goto/16 :goto_2f

    .line 2149
    .line 2150
    :cond_4b
    new-instance v1, Ljava/util/ArrayList;

    .line 2151
    .line 2152
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2153
    .line 2154
    .line 2155
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2156
    .line 2157
    .line 2158
    move-result-object p1

    .line 2159
    :goto_2d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2160
    .line 2161
    .line 2162
    move-result v2

    .line 2163
    if-eqz v2, :cond_4c

    .line 2164
    .line 2165
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v2

    .line 2169
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2170
    .line 2171
    .line 2172
    check-cast v2, Ljava/util/Collection;

    .line 2173
    .line 2174
    check-cast v2, Ljava/lang/Iterable;

    .line 2175
    .line 2176
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2177
    .line 2178
    .line 2179
    goto :goto_2d

    .line 2180
    :cond_4c
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2181
    .line 2182
    .line 2183
    move-result-object p1

    .line 2184
    :goto_2e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2185
    .line 2186
    .line 2187
    move-result v1

    .line 2188
    if-eqz v1, :cond_52

    .line 2189
    .line 2190
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v1

    .line 2194
    check-cast v1, La/v5g;

    .line 2195
    .line 2196
    if-eqz v1, :cond_51

    .line 2197
    .line 2198
    instance-of v2, v1, La/u5g;

    .line 2199
    .line 2200
    if-eqz v2, :cond_4d

    .line 2201
    .line 2202
    invoke-static {p0}, La/aac;->N(La/cp;)V

    .line 2203
    .line 2204
    .line 2205
    goto :goto_2e

    .line 2206
    :cond_4d
    instance-of v2, v1, La/r5g;

    .line 2207
    .line 2208
    if-eqz v2, :cond_4e

    .line 2209
    .line 2210
    invoke-static {p0}, La/aac;->K(La/cp;)V

    .line 2211
    .line 2212
    .line 2213
    goto :goto_2e

    .line 2214
    :cond_4e
    instance-of v2, v1, La/q5g;

    .line 2215
    .line 2216
    if-eqz v2, :cond_4f

    .line 2217
    .line 2218
    move-object v1, v0

    .line 2219
    check-cast v1, La/p5g;

    .line 2220
    .line 2221
    iget-object v1, v1, La/p5g;->f:Landroid/widget/TextView;

    .line 2222
    .line 2223
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v2

    .line 2227
    check-cast v2, La/w5g;

    .line 2228
    .line 2229
    iget-object v2, v2, La/w5g;->e:Ljava/lang/String;

    .line 2230
    .line 2231
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2232
    .line 2233
    .line 2234
    goto :goto_2e

    .line 2235
    :cond_4f
    instance-of v2, v1, La/t5g;

    .line 2236
    .line 2237
    if-eqz v2, :cond_50

    .line 2238
    .line 2239
    invoke-static {p0}, La/aac;->L(La/cp;)V

    .line 2240
    .line 2241
    .line 2242
    goto :goto_2e

    .line 2243
    :cond_50
    instance-of v1, v1, La/s5g;

    .line 2244
    .line 2245
    if-eqz v1, :cond_51

    .line 2246
    .line 2247
    move-object v1, v0

    .line 2248
    check-cast v1, La/p5g;

    .line 2249
    .line 2250
    iget-object v1, v1, La/p5g;->b:Landroid/widget/FrameLayout;

    .line 2251
    .line 2252
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v2

    .line 2256
    check-cast v2, La/w5g;

    .line 2257
    .line 2258
    iget-object v2, v2, La/w5g;->f:Ljava/util/ArrayList;

    .line 2259
    .line 2260
    move-object v3, v7

    .line 2261
    check-cast v3, Ljava/util/ArrayList;

    .line 2262
    .line 2263
    invoke-static {v1, v2, v3}, La/aac;->M(Landroid/widget/FrameLayout;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 2264
    .line 2265
    .line 2266
    goto :goto_2e

    .line 2267
    :cond_51
    invoke-static {}, La/t9f;->b()V

    .line 2268
    .line 2269
    .line 2270
    goto :goto_30

    .line 2271
    :cond_52
    :goto_2f
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2272
    .line 2273
    :goto_30
    return-object v10

    .line 2274
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 2275
    .line 2276
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2277
    .line 2278
    .line 2279
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2280
    .line 2281
    .line 2282
    move-result v0

    .line 2283
    if-eqz v0, :cond_54

    .line 2284
    .line 2285
    check-cast v8, La/gkz;

    .line 2286
    .line 2287
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 2288
    .line 2289
    .line 2290
    move-result-object p0

    .line 2291
    iget-object p1, v9, La/cp;->w:Landroid/content/Context;

    .line 2292
    .line 2293
    iget-object v0, v9, La/cp;->u:La/yfu0;

    .line 2294
    .line 2295
    check-cast p0, La/xnd;

    .line 2296
    .line 2297
    iget-boolean v1, p0, La/xnd;->h:Z

    .line 2298
    .line 2299
    if-eqz v1, :cond_53

    .line 2300
    .line 2301
    move-object v1, v0

    .line 2302
    check-cast v1, La/ltx;

    .line 2303
    .line 2304
    iget-object v4, v1, La/ltx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2305
    .line 2306
    invoke-virtual {v4, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2307
    .line 2308
    .line 2309
    iget-object v1, v1, La/ltx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2310
    .line 2311
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2312
    .line 2313
    .line 2314
    goto :goto_31

    .line 2315
    :cond_53
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 2316
    .line 2317
    move-object v1, v0

    .line 2318
    check-cast v1, La/ltx;

    .line 2319
    .line 2320
    iget-object v2, v1, La/ltx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2321
    .line 2322
    iget-object v3, p0, La/xnd;->d:Ljava/lang/String;

    .line 2323
    .line 2324
    invoke-static {v2, v3, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2325
    .line 2326
    .line 2327
    iget-object v1, v1, La/ltx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2328
    .line 2329
    iget-object v2, p0, La/xnd;->e:Ljava/lang/String;

    .line 2330
    .line 2331
    invoke-static {v1, v2, v6, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2332
    .line 2333
    .line 2334
    :goto_31
    check-cast v0, La/ltx;

    .line 2335
    .line 2336
    iget-object v1, v0, La/ltx;->e:Landroid/widget/TextView;

    .line 2337
    .line 2338
    iget-object v2, p0, La/xnd;->b:La/zmk0;

    .line 2339
    .line 2340
    invoke-virtual {v2, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v2

    .line 2344
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2345
    .line 2346
    .line 2347
    iget-object v1, v0, La/ltx;->g:Landroid/widget/TextView;

    .line 2348
    .line 2349
    iget-object v2, p0, La/xnd;->c:La/zmk0;

    .line 2350
    .line 2351
    invoke-virtual {v2, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v2

    .line 2355
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2356
    .line 2357
    .line 2358
    iget-object v1, v0, La/ltx;->f:Landroid/widget/TextView;

    .line 2359
    .line 2360
    iget-object v2, p0, La/xnd;->f:La/zmk0;

    .line 2361
    .line 2362
    invoke-virtual {v2, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v2

    .line 2366
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2367
    .line 2368
    .line 2369
    iget-object v0, v0, La/ltx;->h:Landroid/widget/TextView;

    .line 2370
    .line 2371
    iget-object v1, p0, La/xnd;->g:La/zmk0;

    .line 2372
    .line 2373
    invoke-virtual {v1, p1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2374
    .line 2375
    .line 2376
    move-result-object p1

    .line 2377
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2378
    .line 2379
    .line 2380
    iget-object p0, p0, La/xnd;->i:Ljava/util/List;

    .line 2381
    .line 2382
    invoke-virtual {v8, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 2383
    .line 2384
    .line 2385
    goto/16 :goto_35

    .line 2386
    .line 2387
    :cond_54
    new-instance v0, Ljava/util/ArrayList;

    .line 2388
    .line 2389
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2390
    .line 2391
    .line 2392
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2393
    .line 2394
    .line 2395
    move-result-object p1

    .line 2396
    :goto_32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2397
    .line 2398
    .line 2399
    move-result v1

    .line 2400
    if-eqz v1, :cond_55

    .line 2401
    .line 2402
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v1

    .line 2406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2407
    .line 2408
    .line 2409
    check-cast v1, Ljava/util/Collection;

    .line 2410
    .line 2411
    check-cast v1, Ljava/lang/Iterable;

    .line 2412
    .line 2413
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2414
    .line 2415
    .line 2416
    goto :goto_32

    .line 2417
    :cond_55
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2418
    .line 2419
    .line 2420
    move-result-object p1

    .line 2421
    :cond_56
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2422
    .line 2423
    .line 2424
    move-result v0

    .line 2425
    if-eqz v0, :cond_5d

    .line 2426
    .line 2427
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2428
    .line 2429
    .line 2430
    move-result-object v0

    .line 2431
    check-cast v0, Ljava/util/List;

    .line 2432
    .line 2433
    new-instance v1, Ljava/util/ArrayList;

    .line 2434
    .line 2435
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2436
    .line 2437
    .line 2438
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v0

    .line 2442
    :cond_57
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2443
    .line 2444
    .line 2445
    move-result v2

    .line 2446
    if-eqz v2, :cond_58

    .line 2447
    .line 2448
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v2

    .line 2452
    instance-of v3, v2, La/qmd;

    .line 2453
    .line 2454
    if-eqz v3, :cond_57

    .line 2455
    .line 2456
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2457
    .line 2458
    .line 2459
    goto :goto_33

    .line 2460
    :cond_58
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v0

    .line 2464
    :goto_34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2465
    .line 2466
    .line 2467
    move-result v1

    .line 2468
    if-eqz v1, :cond_56

    .line 2469
    .line 2470
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2471
    .line 2472
    .line 2473
    move-result-object v1

    .line 2474
    check-cast v1, La/qmd;

    .line 2475
    .line 2476
    move-object v2, v7

    .line 2477
    check-cast v2, La/gkz;

    .line 2478
    .line 2479
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 2480
    .line 2481
    iget-object v4, p0, La/cp;->u:La/yfu0;

    .line 2482
    .line 2483
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2484
    .line 2485
    .line 2486
    instance-of v5, v1, La/mmd;

    .line 2487
    .line 2488
    if-eqz v5, :cond_59

    .line 2489
    .line 2490
    check-cast v1, La/mmd;

    .line 2491
    .line 2492
    iget-object v1, v1, La/mmd;->a:Ljava/util/List;

    .line 2493
    .line 2494
    invoke-virtual {v2, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 2495
    .line 2496
    .line 2497
    goto :goto_34

    .line 2498
    :cond_59
    instance-of v2, v1, La/omd;

    .line 2499
    .line 2500
    if-eqz v2, :cond_5a

    .line 2501
    .line 2502
    check-cast v4, La/ltx;

    .line 2503
    .line 2504
    iget-object v2, v4, La/ltx;->f:Landroid/widget/TextView;

    .line 2505
    .line 2506
    check-cast v1, La/omd;

    .line 2507
    .line 2508
    iget-object v1, v1, La/omd;->a:La/zmk0;

    .line 2509
    .line 2510
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v1

    .line 2514
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2515
    .line 2516
    .line 2517
    goto :goto_34

    .line 2518
    :cond_5a
    instance-of v2, v1, La/pmd;

    .line 2519
    .line 2520
    if-eqz v2, :cond_5b

    .line 2521
    .line 2522
    check-cast v4, La/ltx;

    .line 2523
    .line 2524
    iget-object v2, v4, La/ltx;->h:Landroid/widget/TextView;

    .line 2525
    .line 2526
    check-cast v1, La/pmd;

    .line 2527
    .line 2528
    iget-object v1, v1, La/pmd;->a:La/zmk0;

    .line 2529
    .line 2530
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v1

    .line 2534
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2535
    .line 2536
    .line 2537
    goto :goto_34

    .line 2538
    :cond_5b
    instance-of v2, v1, La/nmd;

    .line 2539
    .line 2540
    if-eqz v2, :cond_5c

    .line 2541
    .line 2542
    check-cast v4, La/ltx;

    .line 2543
    .line 2544
    iget-object v2, v4, La/ltx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 2545
    .line 2546
    check-cast v1, La/nmd;

    .line 2547
    .line 2548
    iget v1, v1, La/nmd;->a:I

    .line 2549
    .line 2550
    invoke-static {v2, v1}, La/ucx;->e0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2551
    .line 2552
    .line 2553
    goto :goto_34

    .line 2554
    :cond_5c
    invoke-static {}, La/t9f;->b()V

    .line 2555
    .line 2556
    .line 2557
    goto :goto_36

    .line 2558
    :cond_5d
    :goto_35
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2559
    .line 2560
    :goto_36
    return-object v10

    .line 2561
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 2562
    .line 2563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2564
    .line 2565
    .line 2566
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2567
    .line 2568
    .line 2569
    move-result v0

    .line 2570
    const/16 v1, 0x19

    .line 2571
    .line 2572
    const v2, -0x5eb201e4

    .line 2573
    .line 2574
    .line 2575
    if-eqz v0, :cond_5e

    .line 2576
    .line 2577
    check-cast v8, La/uwe;

    .line 2578
    .line 2579
    iget-object p0, v9, La/cp;->u:La/yfu0;

    .line 2580
    .line 2581
    check-cast p0, La/pcu0;

    .line 2582
    .line 2583
    iget-object p0, p0, La/pcu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 2584
    .line 2585
    new-instance p1, La/sr1;

    .line 2586
    .line 2587
    invoke-direct {p1, v9, v8, v1}, La/sr1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2588
    .line 2589
    .line 2590
    new-instance v0, La/ugd;

    .line 2591
    .line 2592
    invoke-direct {v0, v2, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2593
    .line 2594
    .line 2595
    invoke-static {p0, v10, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 2596
    .line 2597
    .line 2598
    goto :goto_39

    .line 2599
    :cond_5e
    new-instance v0, Ljava/util/ArrayList;

    .line 2600
    .line 2601
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2602
    .line 2603
    .line 2604
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2605
    .line 2606
    .line 2607
    move-result-object p1

    .line 2608
    :goto_37
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2609
    .line 2610
    .line 2611
    move-result v3

    .line 2612
    if-eqz v3, :cond_5f

    .line 2613
    .line 2614
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v3

    .line 2618
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2619
    .line 2620
    .line 2621
    check-cast v3, Ljava/util/Collection;

    .line 2622
    .line 2623
    check-cast v3, Ljava/lang/Iterable;

    .line 2624
    .line 2625
    invoke-static {v0, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2626
    .line 2627
    .line 2628
    goto :goto_37

    .line 2629
    :cond_5f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2630
    .line 2631
    .line 2632
    move-result-object p1

    .line 2633
    :goto_38
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 2634
    .line 2635
    .line 2636
    move-result v0

    .line 2637
    if-eqz v0, :cond_61

    .line 2638
    .line 2639
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v0

    .line 2643
    check-cast v0, La/km6;

    .line 2644
    .line 2645
    if-eqz v0, :cond_60

    .line 2646
    .line 2647
    move-object v0, v7

    .line 2648
    check-cast v0, La/uwe;

    .line 2649
    .line 2650
    iget-object v3, p0, La/cp;->u:La/yfu0;

    .line 2651
    .line 2652
    check-cast v3, La/pcu0;

    .line 2653
    .line 2654
    iget-object v3, v3, La/pcu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 2655
    .line 2656
    new-instance v4, La/sr1;

    .line 2657
    .line 2658
    invoke-direct {v4, p0, v0, v1}, La/sr1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2659
    .line 2660
    .line 2661
    new-instance v0, La/ugd;

    .line 2662
    .line 2663
    invoke-direct {v0, v2, v5, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2664
    .line 2665
    .line 2666
    invoke-static {v3, v10, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 2667
    .line 2668
    .line 2669
    goto :goto_38

    .line 2670
    :cond_60
    invoke-static {}, La/t9f;->b()V

    .line 2671
    .line 2672
    .line 2673
    goto :goto_3a

    .line 2674
    :cond_61
    :goto_39
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2675
    .line 2676
    :goto_3a
    return-object v10

    .line 2677
    :pswitch_data_0
    .packed-switch 0x0
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
