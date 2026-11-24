.class public final synthetic La/bs50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/oz60;La/u6b0;Lorg/xplatform/uikit_web_games/game_collection_section/WebGamesGameCollectionSection;)V
    .locals 0

    .line 1
    const/4 p3, 0x6

    iput-byte p3, p0, La/bs50;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bs50;->b:Ljava/lang/Object;

    iput-object p2, p0, La/bs50;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/bs50;->a:B

    iput-object p1, p0, La/bs50;->b:Ljava/lang/Object;

    iput-object p2, p0, La/bs50;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bs50;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/bs50;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v0, v0, La/bs50;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/dnv0;

    .line 14
    .line 15
    check-cast v3, La/y8b;

    .line 16
    .line 17
    iget-object v0, v0, La/dnv0;->m:La/szu0;

    .line 18
    .line 19
    check-cast v3, La/umv0;

    .line 20
    .line 21
    iget-object v1, v3, La/umv0;->g:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, La/szu0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    check-cast v0, La/w7s0;

    .line 28
    .line 29
    check-cast v3, La/y8b;

    .line 30
    .line 31
    iget-object v0, v0, La/w7s0;->m:La/elk0;

    .line 32
    .line 33
    invoke-virtual {v0, v3}, La/elk0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    check-cast v0, La/rsq0;

    .line 38
    .line 39
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    sget-object v1, La/ymx;->d:La/ymx;

    .line 42
    .line 43
    new-instance v2, La/vpj0;

    .line 44
    .line 45
    const/16 v4, 0xb

    .line 46
    .line 47
    invoke-direct {v2, v3, v4}, La/vpj0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    check-cast v0, La/zr50;

    .line 55
    .line 56
    check-cast v3, La/ygq0;

    .line 57
    .line 58
    iget-object v0, v0, La/zr50;->x:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    check-cast v3, La/chq0;

    .line 69
    .line 70
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_4
    check-cast v0, La/z6e;

    .line 75
    .line 76
    check-cast v3, La/ne9;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_5
    check-cast v0, La/cp;

    .line 83
    .line 84
    check-cast v3, La/mhc;

    .line 85
    .line 86
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/ude0;

    .line 91
    .line 92
    iget-object v1, v1, La/ude0;->b:La/rlf0;

    .line 93
    .line 94
    instance-of v2, v1, La/nlf0;

    .line 95
    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/ude0;

    .line 103
    .line 104
    iget v0, v0, La/ude0;->a:I

    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v1, La/nlf0;

    .line 111
    .line 112
    iget v1, v1, La/nlf0;->a:I

    .line 113
    .line 114
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v3, v0, v1}, La/mhc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    instance-of v2, v1, La/olf0;

    .line 123
    .line 124
    if-eqz v2, :cond_1

    .line 125
    .line 126
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/ude0;

    .line 131
    .line 132
    iget v0, v0, La/ude0;->a:I

    .line 133
    .line 134
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v1, La/olf0;

    .line 139
    .line 140
    iget v1, v1, La/olf0;->a:I

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v3, v0, v1}, La/mhc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_1
    instance-of v2, v1, La/qlf0;

    .line 151
    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/ude0;

    .line 159
    .line 160
    iget v0, v0, La/ude0;->a:I

    .line 161
    .line 162
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v1, La/qlf0;

    .line 167
    .line 168
    iget v1, v1, La/qlf0;->a:I

    .line 169
    .line 170
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v3, v0, v1}, La/mhc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_2
    sget-object v0, La/plf0;->a:La/plf0;

    .line 179
    .line 180
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_3

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 188
    .line 189
    .line 190
    :goto_0
    return-void

    .line 191
    :pswitch_6
    check-cast v0, La/nfj0;

    .line 192
    .line 193
    check-cast v3, La/cp;

    .line 194
    .line 195
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, La/tjp0;

    .line 200
    .line 201
    iget v1, v1, La/tjp0;->a:I

    .line 202
    .line 203
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, La/tjp0;

    .line 212
    .line 213
    iget-boolean v3, v3, La/tjp0;->d:Z

    .line 214
    .line 215
    xor-int/2addr v2, v3

    .line 216
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v0, v1, v2}, La/nfj0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_7
    check-cast v0, La/ndl0;

    .line 225
    .line 226
    check-cast v3, La/cp;

    .line 227
    .line 228
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, La/fdl0;

    .line 233
    .line 234
    iget-wide v4, v1, La/fdl0;->a:J

    .line 235
    .line 236
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast v1, La/fdl0;

    .line 241
    .line 242
    iget-boolean v1, v1, La/fdl0;->d:Z

    .line 243
    .line 244
    iget-object v6, v0, La/ndl0;->n:La/p7m0;

    .line 245
    .line 246
    :cond_4
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    move-object v7, v0

    .line 251
    check-cast v7, La/odl0;

    .line 252
    .line 253
    iget-object v3, v7, La/odl0;->k:Ljava/util/Set;

    .line 254
    .line 255
    check-cast v3, Ljava/lang/Iterable;

    .line 256
    .line 257
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->J0(Ljava/lang/Iterable;)Ljava/util/HashSet;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    if-nez v1, :cond_5

    .line 266
    .line 267
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_5
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    :goto_1
    iget-object v8, v7, La/odl0;->i:Ljava/util/List;

    .line 275
    .line 276
    new-instance v9, Ljava/util/ArrayList;

    .line 277
    .line 278
    const/16 v10, 0xa

    .line 279
    .line 280
    invoke-static {v8, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    if-eqz v10, :cond_6

    .line 296
    .line 297
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    check-cast v10, La/cok0;

    .line 302
    .line 303
    iget-wide v10, v10, La/cok0;->a:J

    .line 304
    .line 305
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 306
    .line 307
    .line 308
    move-result-object v10

    .line 309
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_6
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    xor-int/lit8 v9, v8, 0x1

    .line 322
    .line 323
    iget-object v8, v7, La/odl0;->l:Ljava/util/Set;

    .line 324
    .line 325
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    const/4 v11, 0x0

    .line 334
    if-lt v10, v2, :cond_7

    .line 335
    .line 336
    move v10, v11

    .line 337
    move v11, v2

    .line 338
    goto :goto_3

    .line 339
    :cond_7
    move v10, v11

    .line 340
    :goto_3
    if-nez v8, :cond_8

    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    if-lt v8, v2, :cond_8

    .line 347
    .line 348
    move v10, v2

    .line 349
    :cond_8
    const/16 v19, 0x0

    .line 350
    .line 351
    const/16 v20, 0x3be3

    .line 352
    .line 353
    const/4 v8, 0x0

    .line 354
    const/4 v12, 0x0

    .line 355
    const/4 v13, 0x0

    .line 356
    const/4 v14, 0x0

    .line 357
    const/4 v15, 0x0

    .line 358
    const/16 v16, 0x0

    .line 359
    .line 360
    const/16 v18, 0x0

    .line 361
    .line 362
    move-object/from16 v17, v3

    .line 363
    .line 364
    invoke-static/range {v7 .. v20}, La/odl0;->a(La/odl0;ZZZZZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;La/jkm;I)La/odl0;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-virtual {v6, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_4

    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_8
    check-cast v0, Landroid/view/View$OnClickListener;

    .line 376
    .line 377
    check-cast v3, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 378
    .line 379
    invoke-static {v0, v3}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->f(Landroid/view/View$OnClickListener;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :pswitch_9
    check-cast v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 384
    .line 385
    check-cast v3, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 386
    .line 387
    iget-object v0, v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->b:Lkotlin/jvm/functions/Function1;

    .line 388
    .line 389
    invoke-virtual {v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->getType()La/yxk0;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :pswitch_a
    check-cast v0, La/v70;

    .line 398
    .line 399
    check-cast v3, La/xxk0;

    .line 400
    .line 401
    iget-object v0, v0, La/v70;->v:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v0, La/cyk0;

    .line 404
    .line 405
    invoke-virtual {v0, v3}, La/cyk0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 410
    .line 411
    check-cast v3, La/lik0;

    .line 412
    .line 413
    new-instance v1, La/drk0;

    .line 414
    .line 415
    invoke-direct {v1, v3}, La/drk0;-><init>(La/lik0;)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :pswitch_c
    check-cast v0, La/cp;

    .line 423
    .line 424
    check-cast v3, La/o470;

    .line 425
    .line 426
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 430
    .line 431
    move-object v1, v0

    .line 432
    check-cast v1, La/u7z;

    .line 433
    .line 434
    iget-object v1, v1, La/u7z;->b:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 435
    .line 436
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    if-eqz v1, :cond_9

    .line 441
    .line 442
    const/16 v1, 0x15

    .line 443
    .line 444
    :goto_4
    move-object/from16 v2, p1

    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_9
    const/16 v1, 0x16

    .line 448
    .line 449
    goto :goto_4

    .line 450
    :goto_5
    invoke-static {v2, v1}, La/ckb;->Z(Landroid/view/View;I)V

    .line 451
    .line 452
    .line 453
    check-cast v0, La/u7z;

    .line 454
    .line 455
    iget-object v0, v0, La/u7z;->b:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 456
    .line 457
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    iget-object v1, v3, La/o470;->a:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, La/woe0;

    .line 464
    .line 465
    sget-object v2, La/woe0;->S1:La/gne0;

    .line 466
    .line 467
    invoke-virtual {v1}, La/woe0;->H0()La/zoe0;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    if-eqz v0, :cond_a

    .line 472
    .line 473
    iget-object v2, v1, La/zoe0;->j:La/yo4;

    .line 474
    .line 475
    iget-object v2, v2, La/yo4;->a:La/kt2;

    .line 476
    .line 477
    const-string v3, "promo_referal_accept"

    .line 478
    .line 479
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    iget-object v2, v1, La/zoe0;->n:La/x20;

    .line 483
    .line 484
    iget-object v2, v2, La/x20;->a:La/s1p;

    .line 485
    .line 486
    const-wide/16 v3, 0xcfc

    .line 487
    .line 488
    sget-object v5, La/xun;->a:La/xun;

    .line 489
    .line 490
    invoke-virtual {v2, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 491
    .line 492
    .line 493
    :cond_a
    iget-object v2, v1, La/zoe0;->r:La/p7m0;

    .line 494
    .line 495
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    const/4 v3, 0x0

    .line 503
    invoke-virtual {v2, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1}, La/zoe0;->x()V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :pswitch_d
    check-cast v0, La/oz60;

    .line 511
    .line 512
    check-cast v3, La/u6b0;

    .line 513
    .line 514
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 515
    .line 516
    iget-object v0, v0, La/oz60;->a:La/td00;

    .line 517
    .line 518
    check-cast v0, La/sd00;

    .line 519
    .line 520
    iget-object v0, v0, La/sd00;->b:Ljava/util/List;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    new-instance v1, La/sx3;

    .line 526
    .line 527
    invoke-direct {v1, v0, v2}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 528
    .line 529
    .line 530
    sget-object v0, La/b180;->f:La/b180;

    .line 531
    .line 532
    invoke-static {v1, v0}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    sget-object v1, La/eab0;->b:La/eab0;

    .line 537
    .line 538
    invoke-static {v0, v1}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    new-instance v1, La/eoh0;

    .line 543
    .line 544
    const/16 v2, 0x17

    .line 545
    .line 546
    invoke-direct {v1, v2}, La/eoh0;-><init>(B)V

    .line 547
    .line 548
    .line 549
    invoke-static {v0, v1}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-static {v0}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, La/u4s;

    .line 562
    .line 563
    if-eqz v0, :cond_b

    .line 564
    .line 565
    invoke-virtual {v3}, La/u6b0;->J0()La/sbb0;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sget-object v1, La/zn60;->b:La/zn60;

    .line 570
    .line 571
    iget-object v0, v0, La/sbb0;->o:La/pm60;

    .line 572
    .line 573
    const-string v1, "WebGamesGameCollectionSection"

    .line 574
    .line 575
    invoke-virtual {v0, v1}, La/pm60;->w(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    :cond_b
    return-void

    .line 579
    :pswitch_e
    check-cast v0, La/wma0;

    .line 580
    .line 581
    check-cast v3, La/cp;

    .line 582
    .line 583
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-virtual {v0, v1}, La/wma0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    return-void

    .line 591
    :pswitch_f
    check-cast v0, La/vra;

    .line 592
    .line 593
    check-cast v3, La/cp;

    .line 594
    .line 595
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    check-cast v1, La/i1b;

    .line 600
    .line 601
    iget-object v1, v1, La/i1b;->a:La/a570;

    .line 602
    .line 603
    invoke-virtual {v0, v1}, La/vra;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :pswitch_10
    check-cast v0, La/jw50;

    .line 608
    .line 609
    check-cast v3, La/cp;

    .line 610
    .line 611
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-virtual {v0, v1}, La/jw50;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    return-void

    .line 619
    :pswitch_11
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;

    .line 620
    .line 621
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/views/NumberItemView;

    .line 622
    .line 623
    sget v1, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;->e:I

    .line 624
    .line 625
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    new-instance v1, La/nvu;

    .line 629
    .line 630
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    if-nez v2, :cond_c

    .line 635
    .line 636
    goto :goto_6

    .line 637
    :cond_c
    invoke-direct {v1, v2}, La/nvu;-><init>(Landroid/content/Context;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v1}, La/nvu;->Z()V

    .line 641
    .line 642
    .line 643
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/views/NumberKeyboardView;->b:Lkotlin/jvm/functions/Function1;

    .line 644
    .line 645
    if-eqz v0, :cond_d

    .line 646
    .line 647
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    :cond_d
    :goto_6
    return-void

    .line 651
    :pswitch_12
    check-cast v0, La/zr50;

    .line 652
    .line 653
    check-cast v3, La/qn50;

    .line 654
    .line 655
    iget-object v0, v0, La/zr50;->w:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 658
    .line 659
    iget-object v1, v3, La/qn50;->b:La/bt5;

    .line 660
    .line 661
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    return-void

    .line 665
    :pswitch_13
    check-cast v0, La/cs50;

    .line 666
    .line 667
    check-cast v3, La/ct5;

    .line 668
    .line 669
    iget-object v1, v0, La/cs50;->u:Lkotlin/jvm/functions/Function2;

    .line 670
    .line 671
    iget-object v0, v0, La/cs50;->w:Ljava/lang/String;

    .line 672
    .line 673
    invoke-interface {v1, v3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
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
