.class public final La/ft7;
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

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/cp;La/mhc;La/pw4;La/cp;La/mhc;La/pw4;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/ft7;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ft7;->b:La/cp;

    .line 8
    .line 9
    iput-object p2, p0, La/ft7;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/ft7;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/ft7;->c:La/cp;

    .line 14
    .line 15
    iput-object p5, p0, La/ft7;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, La/ft7;->g:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/cp;La/zre;La/a8z;La/cp;La/zre;La/a8z;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ft7;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ft7;->b:La/cp;

    iput-object p2, p0, La/ft7;->d:Ljava/lang/Object;

    iput-object p3, p0, La/ft7;->e:Ljava/lang/Object;

    iput-object p4, p0, La/ft7;->c:La/cp;

    iput-object p5, p0, La/ft7;->f:Ljava/lang/Object;

    iput-object p6, p0, La/ft7;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ft7;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ft7;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/ft7;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/ft7;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/ft7;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, p0, La/ft7;->b:La/cp;

    .line 12
    .line 13
    iget-object p0, p0, La/ft7;->c:La/cp;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    iget-object v6, v5, La/cp;->u:La/yfu0;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_1

    .line 32
    .line 33
    move-object p0, v6

    .line 34
    check-cast p0, La/rcu0;

    .line 35
    .line 36
    iget-object p0, p0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 37
    .line 38
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, La/ra8;

    .line 43
    .line 44
    iget-object p1, p1, La/ra8;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockName(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object p0, v6

    .line 50
    check-cast p0, La/rcu0;

    .line 51
    .line 52
    iget-object p0, p0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 53
    .line 54
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/ra8;

    .line 59
    .line 60
    iget-boolean p1, p1, La/ra8;->e:Z

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetVisibility(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, La/ra8;

    .line 70
    .line 71
    iget-boolean p0, p0, La/ra8;->f:Z

    .line 72
    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    move-object p0, v6

    .line 76
    check-cast p0, La/rcu0;

    .line 77
    .line 78
    iget-object p0, p0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 79
    .line 80
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, La/ra8;

    .line 85
    .line 86
    iget-boolean p1, p1, La/ra8;->g:Z

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetValueLoading(Z)V

    .line 89
    .line 90
    .line 91
    :cond_0
    move-object p0, v6

    .line 92
    check-cast p0, La/rcu0;

    .line 93
    .line 94
    iget-object p0, p0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 95
    .line 96
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, La/ra8;

    .line 101
    .line 102
    iget p1, p1, La/ra8;->c:I

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetImage(I)V

    .line 105
    .line 106
    .line 107
    check-cast v6, La/rcu0;

    .line 108
    .line 109
    iget-object p0, v6, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 110
    .line 111
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, La/ra8;

    .line 116
    .line 117
    iget-object p1, p1, La/ra8;->d:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetText(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v5}, La/obc;->K(La/cp;)V

    .line 123
    .line 124
    .line 125
    check-cast v4, La/a8z;

    .line 126
    .line 127
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, La/ase;

    .line 132
    .line 133
    check-cast v3, La/zre;

    .line 134
    .line 135
    invoke-static {v5, p0, v3}, La/obc;->L(La/cp;La/ase;La/zre;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_2

    .line 139
    .line 140
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_2

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    check-cast v4, Ljava/util/Collection;

    .line 163
    .line 164
    check-cast v4, Ljava/lang/Iterable;

    .line 165
    .line 166
    invoke-static {v3, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_b

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, La/qa8;

    .line 185
    .line 186
    if-nez v3, :cond_4

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_4
    instance-of v4, v3, La/pa8;

    .line 190
    .line 191
    if-eqz v4, :cond_5

    .line 192
    .line 193
    move-object v3, v0

    .line 194
    check-cast v3, La/rcu0;

    .line 195
    .line 196
    iget-object v3, v3, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 197
    .line 198
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, La/ra8;

    .line 203
    .line 204
    iget-object v4, v4, La/ra8;->b:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v3, v4}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockName(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_5
    instance-of v4, v3, La/ma8;

    .line 211
    .line 212
    if-eqz v4, :cond_6

    .line 213
    .line 214
    move-object v3, v0

    .line 215
    check-cast v3, La/rcu0;

    .line 216
    .line 217
    iget-object v3, v3, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 218
    .line 219
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, La/ra8;

    .line 224
    .line 225
    iget-boolean v4, v4, La/ra8;->e:Z

    .line 226
    .line 227
    invoke-virtual {v3, v4}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetVisibility(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_6
    instance-of v4, v3, La/la8;

    .line 232
    .line 233
    if-eqz v4, :cond_7

    .line 234
    .line 235
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, La/ra8;

    .line 240
    .line 241
    iget-boolean v3, v3, La/ra8;->f:Z

    .line 242
    .line 243
    if-eqz v3, :cond_3

    .line 244
    .line 245
    move-object v3, v0

    .line 246
    check-cast v3, La/rcu0;

    .line 247
    .line 248
    iget-object v3, v3, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 249
    .line 250
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, La/ra8;

    .line 255
    .line 256
    iget-boolean v4, v4, La/ra8;->g:Z

    .line 257
    .line 258
    invoke-virtual {v3, v4}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetValueLoading(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_7
    instance-of v4, v3, La/ja8;

    .line 263
    .line 264
    if-eqz v4, :cond_8

    .line 265
    .line 266
    move-object v3, v0

    .line 267
    check-cast v3, La/rcu0;

    .line 268
    .line 269
    iget-object v3, v3, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 270
    .line 271
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    check-cast v4, La/ra8;

    .line 276
    .line 277
    iget v4, v4, La/ra8;->c:I

    .line 278
    .line 279
    invoke-virtual {v3, v4}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetImage(I)V

    .line 280
    .line 281
    .line 282
    goto :goto_1

    .line 283
    :cond_8
    instance-of v4, v3, La/ka8;

    .line 284
    .line 285
    if-eqz v4, :cond_9

    .line 286
    .line 287
    move-object v3, v0

    .line 288
    check-cast v3, La/rcu0;

    .line 289
    .line 290
    iget-object v3, v3, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 291
    .line 292
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, La/ra8;

    .line 297
    .line 298
    iget-object v4, v4, La/ra8;->d:Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v3, v4}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->setBlockBetText(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :cond_9
    instance-of v4, v3, La/ia8;

    .line 306
    .line 307
    if-eqz v4, :cond_a

    .line 308
    .line 309
    invoke-static {p0}, La/obc;->K(La/cp;)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_1

    .line 313
    .line 314
    :cond_a
    instance-of v3, v3, La/na8;

    .line 315
    .line 316
    if-eqz v3, :cond_3

    .line 317
    .line 318
    move-object v3, v2

    .line 319
    check-cast v3, La/a8z;

    .line 320
    .line 321
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    check-cast v3, La/ase;

    .line 326
    .line 327
    move-object v4, v1

    .line 328
    check-cast v4, La/zre;

    .line 329
    .line 330
    invoke-static {p0, v3, v4}, La/obc;->L(La/cp;La/ase;La/zre;)V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :cond_b
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    const/16 v6, 0x1a

    .line 348
    .line 349
    const/4 v7, 0x0

    .line 350
    const/4 v8, 0x1

    .line 351
    const v9, 0x61d5993d

    .line 352
    .line 353
    .line 354
    if-eqz v0, :cond_c

    .line 355
    .line 356
    check-cast v3, La/mhc;

    .line 357
    .line 358
    check-cast v1, La/pw4;

    .line 359
    .line 360
    iget-object p0, v5, La/cp;->u:La/yfu0;

    .line 361
    .line 362
    check-cast p0, La/qcu0;

    .line 363
    .line 364
    iget-object p0, p0, La/qcu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 365
    .line 366
    new-instance p1, La/ry2;

    .line 367
    .line 368
    invoke-direct {p1, v5, v3, v1, v6}, La/ry2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 369
    .line 370
    .line 371
    new-instance v0, La/ugd;

    .line 372
    .line 373
    invoke-direct {v0, v9, v8, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-static {p0, v7, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 377
    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_d

    .line 394
    .line 395
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    check-cast v1, Ljava/util/Collection;

    .line 403
    .line 404
    check-cast v1, Ljava/lang/Iterable;

    .line 405
    .line 406
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 407
    .line 408
    .line 409
    goto :goto_3

    .line 410
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eqz v0, :cond_f

    .line 419
    .line 420
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    check-cast v0, La/ct7;

    .line 425
    .line 426
    if-eqz v0, :cond_e

    .line 427
    .line 428
    move-object v0, v4

    .line 429
    check-cast v0, La/mhc;

    .line 430
    .line 431
    move-object v1, v2

    .line 432
    check-cast v1, La/pw4;

    .line 433
    .line 434
    iget-object v3, p0, La/cp;->u:La/yfu0;

    .line 435
    .line 436
    check-cast v3, La/qcu0;

    .line 437
    .line 438
    iget-object v3, v3, La/qcu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 439
    .line 440
    new-instance v5, La/ry2;

    .line 441
    .line 442
    invoke-direct {v5, p0, v0, v1, v6}, La/ry2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 443
    .line 444
    .line 445
    new-instance v0, La/ugd;

    .line 446
    .line 447
    invoke-direct {v0, v9, v8, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v3, v7, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 451
    .line 452
    .line 453
    goto :goto_4

    .line 454
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 455
    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_f
    :goto_5
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    :goto_6
    return-object v7

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
