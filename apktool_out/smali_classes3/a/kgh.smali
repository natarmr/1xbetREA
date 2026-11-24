.class public final synthetic La/kgh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kgh;->a:B

    iput-object p1, p0, La/kgh;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kgh;->a:B

    .line 4
    .line 5
    const v2, 0x7f130e1c

    .line 6
    .line 7
    .line 8
    const v3, 0x7f130e1e

    .line 9
    .line 10
    .line 11
    const/16 v4, 0x8

    .line 12
    .line 13
    const/4 v5, 0x5

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    iget-object v0, v0, La/kgh;->b:La/cp;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 30
    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, La/b47;

    .line 33
    .line 34
    iget-object v2, v2, La/b47;->b:Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object v3, v0, La/xhe0;->a:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, La/u0w;

    .line 47
    .line 48
    iget-object v5, v5, La/u0w;->a:La/pdj;

    .line 49
    .line 50
    invoke-static {v5}, La/ulb;->O(La/pdj;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    check-cast v1, La/b47;

    .line 62
    .line 63
    iget-object v1, v1, La/b47;->b:Landroid/widget/TextView;

    .line 64
    .line 65
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 66
    .line 67
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/u0w;

    .line 79
    .line 80
    iget v0, v0, La/u0w;->b:I

    .line 81
    .line 82
    invoke-static {v2, v0, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_0
    move-object/from16 v1, p1

    .line 93
    .line 94
    check-cast v1, Ljava/util/List;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 100
    .line 101
    check-cast v1, La/kyv;

    .line 102
    .line 103
    iget-object v2, v1, La/kyv;->b:Landroid/widget/TextView;

    .line 104
    .line 105
    iget-object v1, v1, La/kyv;->a:Landroid/widget/TextView;

    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, La/t21;

    .line 116
    .line 117
    invoke-interface {v3}, La/t21;->b()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/t21;

    .line 133
    .line 134
    invoke-interface {v0}, La/t21;->a()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_0

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-virtual {v2, v0}, Landroid/view/View;->setElevation(F)V

    .line 142
    .line 143
    .line 144
    const v0, 0x7f0802a5

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 148
    .line 149
    .line 150
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const v1, 0x7f0606da

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const v1, 0x7f0705c2

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-virtual {v2, v0}, Landroid/view/View;->setElevation(F)V

    .line 182
    .line 183
    .line 184
    const v0, 0x7f0802a4

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 188
    .line 189
    .line 190
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 191
    .line 192
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    const v1, 0x7f040b72

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v1, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    .line 208
    .line 209
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_1
    move-object/from16 v1, p1

    .line 213
    .line 214
    check-cast v1, Ljava/util/List;

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 220
    .line 221
    check-cast v1, La/lvx;

    .line 222
    .line 223
    iget-object v1, v1, La/lvx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 224
    .line 225
    new-instance v2, La/nrv;

    .line 226
    .line 227
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, La/nsv;

    .line 232
    .line 233
    iget-object v3, v0, La/nsv;->a:Ljava/lang/String;

    .line 234
    .line 235
    const/4 v9, 0x0

    .line 236
    const/16 v10, 0xfe

    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v5, 0x0

    .line 240
    const/4 v6, 0x0

    .line 241
    const/4 v7, 0x0

    .line 242
    const/4 v8, 0x0

    .line 243
    invoke-direct/range {v2 .. v10}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 247
    .line 248
    .line 249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_2
    move-object/from16 v1, p1

    .line 253
    .line 254
    check-cast v1, Ljava/util/List;

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 260
    .line 261
    check-cast v1, La/yxx;

    .line 262
    .line 263
    iget-object v1, v1, La/yxx;->b:Landroid/widget/TextView;

    .line 264
    .line 265
    const/high16 v2, 0x40800000    # 4.0f

    .line 266
    .line 267
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    const/high16 v3, 0x41000000    # 8.0f

    .line 272
    .line 273
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v1, v2, v3, v5}, La/sj3;->M0(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;I)V

    .line 278
    .line 279
    .line 280
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 281
    .line 282
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, La/ypv;

    .line 290
    .line 291
    iget-object v0, v0, La/ypv;->a:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    .line 295
    .line 296
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object v0

    .line 299
    :pswitch_3
    move-object/from16 v1, p1

    .line 300
    .line 301
    check-cast v1, Ljava/util/List;

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 307
    .line 308
    check-cast v1, La/ivx;

    .line 309
    .line 310
    iget-object v1, v1, La/ivx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 311
    .line 312
    new-instance v2, La/nrv;

    .line 313
    .line 314
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, La/ssv;

    .line 319
    .line 320
    iget-object v3, v0, La/ssv;->a:Ljava/lang/String;

    .line 321
    .line 322
    const/4 v9, 0x0

    .line 323
    const/16 v10, 0xfe

    .line 324
    .line 325
    const/4 v4, 0x0

    .line 326
    const/4 v5, 0x0

    .line 327
    const/4 v6, 0x0

    .line 328
    const/4 v7, 0x0

    .line 329
    const/4 v8, 0x0

    .line 330
    invoke-direct/range {v2 .. v10}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_4
    move-object/from16 v1, p1

    .line 340
    .line 341
    check-cast v1, Ljava/util/List;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 347
    .line 348
    check-cast v1, La/jvx;

    .line 349
    .line 350
    iget-object v1, v1, La/jvx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 351
    .line 352
    new-instance v2, La/nrv;

    .line 353
    .line 354
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, La/qsv;

    .line 359
    .line 360
    iget-object v3, v0, La/qsv;->a:Ljava/lang/String;

    .line 361
    .line 362
    const/4 v9, 0x0

    .line 363
    const/16 v10, 0xfe

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
    invoke-direct/range {v2 .. v10}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 374
    .line 375
    .line 376
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 377
    .line 378
    return-object v0

    .line 379
    :pswitch_5
    move-object/from16 v1, p1

    .line 380
    .line 381
    check-cast v1, Ljava/util/List;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 387
    .line 388
    move-object v2, v1

    .line 389
    check-cast v2, La/ohv;

    .line 390
    .line 391
    iget-object v2, v2, La/ohv;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 392
    .line 393
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    check-cast v3, La/phv;

    .line 398
    .line 399
    iget-object v3, v3, La/phv;->b:Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 402
    .line 403
    .line 404
    check-cast v1, La/ohv;

    .line 405
    .line 406
    iget-object v1, v1, La/ohv;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;

    .line 407
    .line 408
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    check-cast v0, La/phv;

    .line 413
    .line 414
    iget-boolean v0, v0, La/phv;->c:Z

    .line 415
    .line 416
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;->setSelected(Z)V

    .line 417
    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_6
    move-object/from16 v1, p1

    .line 423
    .line 424
    check-cast v1, Ljava/util/List;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 430
    .line 431
    move-object v2, v1

    .line 432
    check-cast v2, La/v6b0;

    .line 433
    .line 434
    iget-object v2, v2, La/v6b0;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 435
    .line 436
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    check-cast v3, La/pv60;

    .line 441
    .line 442
    iget-object v3, v3, La/pv60;->a:La/nrv;

    .line 443
    .line 444
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 445
    .line 446
    .line 447
    check-cast v1, La/v6b0;

    .line 448
    .line 449
    iget-object v1, v1, La/v6b0;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 450
    .line 451
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, La/pv60;

    .line 456
    .line 457
    iget-object v0, v0, La/pv60;->d:Ljava/util/ArrayList;

    .line 458
    .line 459
    sget v2, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 460
    .line 461
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    check-cast v1, La/o4s;

    .line 469
    .line 470
    invoke-virtual {v1, v0, v6}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 471
    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_7
    move-object/from16 v1, p1

    .line 477
    .line 478
    check-cast v1, Ljava/util/List;

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 484
    .line 485
    move-object v1, v0

    .line 486
    check-cast v1, La/i8b0;

    .line 487
    .line 488
    iget-object v1, v1, La/i8b0;->j:La/vd7;

    .line 489
    .line 490
    iget-object v1, v1, La/vd7;->d:Landroid/view/View;

    .line 491
    .line 492
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 493
    .line 494
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 495
    .line 496
    .line 497
    check-cast v0, La/i8b0;

    .line 498
    .line 499
    iget-object v1, v0, La/i8b0;->f:La/nq8;

    .line 500
    .line 501
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 502
    .line 503
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 504
    .line 505
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 506
    .line 507
    .line 508
    iget-object v1, v0, La/i8b0;->i:La/nq8;

    .line 509
    .line 510
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 511
    .line 512
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 513
    .line 514
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 515
    .line 516
    .line 517
    iget-object v1, v0, La/i8b0;->h:La/nq8;

    .line 518
    .line 519
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 520
    .line 521
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 522
    .line 523
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 524
    .line 525
    .line 526
    iget-object v1, v0, La/i8b0;->e:La/nq8;

    .line 527
    .line 528
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 529
    .line 530
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 531
    .line 532
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 533
    .line 534
    .line 535
    iget-object v1, v0, La/i8b0;->d:La/nq8;

    .line 536
    .line 537
    iget-object v1, v1, La/nq8;->c:Landroid/view/View;

    .line 538
    .line 539
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 540
    .line 541
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 542
    .line 543
    .line 544
    iget-object v0, v0, La/i8b0;->g:La/nq8;

    .line 545
    .line 546
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 547
    .line 548
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 549
    .line 550
    invoke-virtual {v0, v7}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 551
    .line 552
    .line 553
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0

    .line 556
    :pswitch_8
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, La/l7m0;

    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 564
    .line 565
    check-cast v0, La/vjd;

    .line 566
    .line 567
    iget-object v0, v0, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 568
    .line 569
    sget-object v2, La/pek0;->g:La/pek0;

    .line 570
    .line 571
    new-instance v3, La/cw0;

    .line 572
    .line 573
    const/16 v4, 0xa

    .line 574
    .line 575
    invoke-direct {v3, v1, v4}, La/cw0;-><init>(La/l7m0;B)V

    .line 576
    .line 577
    .line 578
    new-instance v1, La/ugd;

    .line 579
    .line 580
    const v4, 0x6f3bde48

    .line 581
    .line 582
    .line 583
    invoke-direct {v1, v4, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    new-instance v3, La/shd;

    .line 587
    .line 588
    const/16 v4, 0xe

    .line 589
    .line 590
    invoke-direct {v3, v4}, La/shd;-><init>(B)V

    .line 591
    .line 592
    .line 593
    invoke-static {v0, v2, v3, v1}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 594
    .line 595
    .line 596
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_9
    move-object/from16 v1, p1

    .line 600
    .line 601
    check-cast v1, Ljava/util/List;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 607
    .line 608
    check-cast v1, La/pux;

    .line 609
    .line 610
    iget-object v1, v1, La/pux;->b:Landroid/widget/TextView;

    .line 611
    .line 612
    const v2, 0x7f131176

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0, v2}, La/cp;->v(I)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 620
    .line 621
    .line 622
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 623
    .line 624
    return-object v0

    .line 625
    :pswitch_a
    move-object/from16 v1, p1

    .line 626
    .line 627
    check-cast v1, Ljava/util/List;

    .line 628
    .line 629
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 633
    .line 634
    move-object v2, v1

    .line 635
    check-cast v2, La/ucu0;

    .line 636
    .line 637
    iget-object v2, v2, La/ucu0;->c:Landroid/widget/TextView;

    .line 638
    .line 639
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v3

    .line 643
    check-cast v3, La/utq;

    .line 644
    .line 645
    iget-object v3, v3, La/utq;->a:Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 648
    .line 649
    .line 650
    check-cast v1, La/ucu0;

    .line 651
    .line 652
    iget-object v1, v1, La/ucu0;->b:Landroid/view/View;

    .line 653
    .line 654
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 655
    .line 656
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    check-cast v0, La/utq;

    .line 661
    .line 662
    iget v0, v0, La/utq;->b:I

    .line 663
    .line 664
    invoke-static {v0, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 673
    .line 674
    .line 675
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 676
    .line 677
    return-object v0

    .line 678
    :pswitch_b
    move-object/from16 v1, p1

    .line 679
    .line 680
    check-cast v1, Ljava/util/List;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 686
    .line 687
    check-cast v1, La/f2k;

    .line 688
    .line 689
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    check-cast v2, La/z5p;

    .line 694
    .line 695
    new-instance v2, La/ocb;

    .line 696
    .line 697
    const-string v3, ""

    .line 698
    .line 699
    invoke-direct {v2, v3}, La/ocb;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    check-cast v3, La/z5p;

    .line 707
    .line 708
    iget-object v3, v3, La/z5p;->f:Ljava/lang/String;

    .line 709
    .line 710
    new-instance v4, La/ncb;

    .line 711
    .line 712
    invoke-direct {v4, v3}, La/ncb;-><init>(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    check-cast v3, La/z5p;

    .line 720
    .line 721
    iget-wide v5, v3, La/z5p;->g:J

    .line 722
    .line 723
    invoke-static {v2, v4, v5, v6}, La/rcb;->d0(La/qcb;La/qcb;J)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v10

    .line 727
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 728
    .line 729
    iget-object v2, v1, La/f2k;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 730
    .line 731
    iget-object v3, v1, La/f2k;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 732
    .line 733
    invoke-virtual {v2}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 734
    .line 735
    .line 736
    move-result-object v9

    .line 737
    new-instance v2, La/j2x;

    .line 738
    .line 739
    iget-object v4, v1, La/f2k;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 740
    .line 741
    invoke-virtual {v4}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 750
    .line 751
    div-int/lit8 v5, v5, 0x2

    .line 752
    .line 753
    invoke-direct {v2, v5}, La/j2x;-><init>(I)V

    .line 754
    .line 755
    .line 756
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 757
    .line 758
    .line 759
    move-result-object v13

    .line 760
    const/4 v15, 0x0

    .line 761
    const/16 v16, 0x1ec

    .line 762
    .line 763
    const v11, 0x7f08096e

    .line 764
    .line 765
    .line 766
    const/4 v12, 0x0

    .line 767
    const/4 v14, 0x0

    .line 768
    invoke-static/range {v9 .. v16}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    check-cast v2, La/z5p;

    .line 776
    .line 777
    iget-object v2, v2, La/z5p;->i:La/h5p;

    .line 778
    .line 779
    sget-object v5, La/h5p;->b:La/h5p;

    .line 780
    .line 781
    if-ne v2, v5, :cond_1

    .line 782
    .line 783
    goto :goto_1

    .line 784
    :cond_1
    move v7, v8

    .line 785
    :goto_1
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    check-cast v2, La/z5p;

    .line 790
    .line 791
    iget-object v2, v2, La/z5p;->i:La/h5p;

    .line 792
    .line 793
    sget-object v5, La/h5p;->c:La/h5p;

    .line 794
    .line 795
    if-ne v2, v5, :cond_2

    .line 796
    .line 797
    sget-object v2, La/yrm;->b:La/yrm;

    .line 798
    .line 799
    goto :goto_2

    .line 800
    :cond_2
    if-eqz v7, :cond_3

    .line 801
    .line 802
    sget-object v2, La/yrm;->a:La/yrm;

    .line 803
    .line 804
    goto :goto_2

    .line 805
    :cond_3
    sget-object v2, La/yrm;->c:La/yrm;

    .line 806
    .line 807
    :goto_2
    invoke-virtual {v4, v2}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setBadge(La/yrm;)V

    .line 808
    .line 809
    .line 810
    iget-object v9, v0, La/cp;->w:Landroid/content/Context;

    .line 811
    .line 812
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, La/z5p;

    .line 817
    .line 818
    iget-object v10, v2, La/z5p;->l:Ljava/lang/String;

    .line 819
    .line 820
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 821
    .line 822
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    const v5, 0x7f070660

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 834
    .line 835
    .line 836
    move-result-object v11

    .line 837
    sget-object v13, La/iun;->a:La/iun;

    .line 838
    .line 839
    new-instance v14, La/a6p;

    .line 840
    .line 841
    invoke-direct {v14, v4, v8}, La/a6p;-><init>(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 842
    .line 843
    .line 844
    const/4 v15, 0x0

    .line 845
    const/16 v16, 0x24

    .line 846
    .line 847
    const/4 v12, 0x0

    .line 848
    invoke-static/range {v9 .. v16}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 849
    .line 850
    .line 851
    iget-object v1, v1, La/f2k;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 852
    .line 853
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    check-cast v2, La/z5p;

    .line 858
    .line 859
    iget-object v2, v2, La/z5p;->e:Ljava/lang/String;

    .line 860
    .line 861
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    check-cast v1, La/z5p;

    .line 869
    .line 870
    iget v1, v1, La/z5p;->k:I

    .line 871
    .line 872
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setCounterNumber(Ljava/lang/Integer;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    check-cast v0, La/z5p;

    .line 884
    .line 885
    iget-boolean v0, v0, La/z5p;->h:Z

    .line 886
    .line 887
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setTagVisible(Z)V

    .line 888
    .line 889
    .line 890
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 891
    .line 892
    return-object v0

    .line 893
    :pswitch_c
    move-object/from16 v1, p1

    .line 894
    .line 895
    check-cast v1, Ljava/util/List;

    .line 896
    .line 897
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 898
    .line 899
    .line 900
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 901
    .line 902
    check-cast v1, La/x1k;

    .line 903
    .line 904
    iget-object v1, v1, La/x1k;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 905
    .line 906
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    check-cast v0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;

    .line 911
    .line 912
    new-instance v9, La/nrv;

    .line 913
    .line 914
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->z()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v10

    .line 918
    iget-boolean v11, v0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->b:Z

    .line 919
    .line 920
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->p()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v13

    .line 924
    iget-boolean v2, v0, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->a:Z

    .line 925
    .line 926
    if-eqz v2, :cond_4

    .line 927
    .line 928
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/adapters/models/FavoriteGroupHeaderUiItem;->u()I

    .line 929
    .line 930
    .line 931
    move-result v8

    .line 932
    :cond_4
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 933
    .line 934
    .line 935
    move-result-object v16

    .line 936
    const/16 v17, 0x74

    .line 937
    .line 938
    const/4 v12, 0x0

    .line 939
    const/4 v14, 0x0

    .line 940
    const/4 v15, 0x0

    .line 941
    invoke-direct/range {v9 .. v17}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v1, v9}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 945
    .line 946
    .line 947
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 948
    .line 949
    return-object v0

    .line 950
    :pswitch_d
    move-object/from16 v1, p1

    .line 951
    .line 952
    check-cast v1, Ljava/util/List;

    .line 953
    .line 954
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    sget-object v1, La/sre0;->a:La/tre0;

    .line 966
    .line 967
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    const-string v1, "AdapterDelegate not found for "

    .line 976
    .line 977
    const-string v2, "fallbackAdapterDelegate"

    .line 978
    .line 979
    invoke-static {v1, v0, v2}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 983
    .line 984
    return-object v0

    .line 985
    :pswitch_e
    move-object/from16 v1, p1

    .line 986
    .line 987
    check-cast v1, Ljava/util/List;

    .line 988
    .line 989
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    check-cast v1, La/n140;

    .line 997
    .line 998
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 999
    .line 1000
    check-cast v0, La/dux;

    .line 1001
    .line 1002
    iget-object v2, v0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1003
    .line 1004
    iget v3, v1, La/n140;->d:I

    .line 1005
    .line 1006
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1007
    .line 1008
    .line 1009
    iget-object v2, v0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1010
    .line 1011
    iget-boolean v3, v1, La/n140;->b:Z

    .line 1012
    .line 1013
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1014
    .line 1015
    .line 1016
    iget-object v2, v0, La/dux;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1017
    .line 1018
    iget-object v3, v1, La/n140;->e:Ljava/lang/String;

    .line 1019
    .line 1020
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1021
    .line 1022
    .line 1023
    iget-object v3, v1, La/n140;->f:Ljava/lang/String;

    .line 1024
    .line 1025
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1026
    .line 1027
    .line 1028
    iget-object v0, v0, La/dux;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1029
    .line 1030
    iget v1, v1, La/n140;->g:I

    .line 1031
    .line 1032
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 1033
    .line 1034
    .line 1035
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1036
    .line 1037
    return-object v0

    .line 1038
    :pswitch_f
    move-object/from16 v1, p1

    .line 1039
    .line 1040
    check-cast v1, Ljava/util/List;

    .line 1041
    .line 1042
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    check-cast v1, La/n140;

    .line 1050
    .line 1051
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1052
    .line 1053
    check-cast v0, La/zvx;

    .line 1054
    .line 1055
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1056
    .line 1057
    iget v3, v1, La/n140;->d:I

    .line 1058
    .line 1059
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1060
    .line 1061
    .line 1062
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1063
    .line 1064
    iget-boolean v3, v1, La/n140;->b:Z

    .line 1065
    .line 1066
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1067
    .line 1068
    .line 1069
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1070
    .line 1071
    iget-object v2, v1, La/n140;->e:Ljava/lang/String;

    .line 1072
    .line 1073
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1074
    .line 1075
    .line 1076
    iget-object v1, v1, La/n140;->f:Ljava/lang/String;

    .line 1077
    .line 1078
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1079
    .line 1080
    .line 1081
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1082
    .line 1083
    return-object v0

    .line 1084
    :pswitch_10
    move-object/from16 v1, p1

    .line 1085
    .line 1086
    check-cast v1, La/l7m0;

    .line 1087
    .line 1088
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1092
    .line 1093
    check-cast v0, La/vjd;

    .line 1094
    .line 1095
    iget-object v0, v0, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 1096
    .line 1097
    sget-object v2, La/pek0;->g:La/pek0;

    .line 1098
    .line 1099
    new-instance v3, La/cw0;

    .line 1100
    .line 1101
    const/4 v4, 0x7

    .line 1102
    invoke-direct {v3, v1, v4}, La/cw0;-><init>(La/l7m0;B)V

    .line 1103
    .line 1104
    .line 1105
    new-instance v1, La/ugd;

    .line 1106
    .line 1107
    const v4, -0x647dffcf

    .line 1108
    .line 1109
    .line 1110
    invoke-direct {v1, v4, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-static {v0, v2, v6, v1}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 1114
    .line 1115
    .line 1116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1117
    .line 1118
    return-object v0

    .line 1119
    :pswitch_11
    move-object/from16 v1, p1

    .line 1120
    .line 1121
    check-cast v1, Ljava/util/List;

    .line 1122
    .line 1123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    check-cast v1, La/d240;

    .line 1131
    .line 1132
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1133
    .line 1134
    check-cast v0, La/zvx;

    .line 1135
    .line 1136
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1137
    .line 1138
    invoke-static {v2}, La/hxm0;->w(Landroid/widget/ImageView;)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1142
    .line 1143
    iget-object v3, v1, La/d240;->f:Ljava/lang/String;

    .line 1144
    .line 1145
    const v4, 0x7f0809b3

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v2, v4, v6, v6, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->o(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1149
    .line 1150
    .line 1151
    iget-boolean v3, v1, La/d240;->a:Z

    .line 1152
    .line 1153
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1154
    .line 1155
    .line 1156
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1157
    .line 1158
    iget-object v1, v1, La/d240;->g:Ljava/lang/String;

    .line 1159
    .line 1160
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1161
    .line 1162
    .line 1163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1164
    .line 1165
    return-object v0

    .line 1166
    :pswitch_12
    move-object/from16 v1, p1

    .line 1167
    .line 1168
    check-cast v1, Ljava/util/List;

    .line 1169
    .line 1170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1171
    .line 1172
    .line 1173
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1174
    .line 1175
    move-object v2, v1

    .line 1176
    check-cast v2, La/ktk;

    .line 1177
    .line 1178
    iget-object v2, v2, La/ktk;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1179
    .line 1180
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v3

    .line 1184
    check-cast v3, La/muk;

    .line 1185
    .line 1186
    iget-boolean v3, v3, La/muk;->a:Z

    .line 1187
    .line 1188
    invoke-virtual {v2, v3}, La/tw5;->setSelected(Z)V

    .line 1189
    .line 1190
    .line 1191
    check-cast v1, La/ktk;

    .line 1192
    .line 1193
    iget-object v2, v1, La/ktk;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1194
    .line 1195
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v3

    .line 1199
    check-cast v3, La/muk;

    .line 1200
    .line 1201
    iget-object v3, v3, La/muk;->b:Ljava/lang/String;

    .line 1202
    .line 1203
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1204
    .line 1205
    .line 1206
    iget-object v1, v1, La/ktk;->c:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1207
    .line 1208
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    check-cast v0, La/muk;

    .line 1213
    .line 1214
    iget-boolean v0, v0, La/muk;->d:Z

    .line 1215
    .line 1216
    if-nez v0, :cond_5

    .line 1217
    .line 1218
    move v4, v8

    .line 1219
    :cond_5
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1220
    .line 1221
    .line 1222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1223
    .line 1224
    return-object v0

    .line 1225
    :pswitch_13
    move-object/from16 v1, p1

    .line 1226
    .line 1227
    check-cast v1, Ljava/util/List;

    .line 1228
    .line 1229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1230
    .line 1231
    .line 1232
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1233
    .line 1234
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1235
    .line 1236
    move-object v2, v1

    .line 1237
    check-cast v2, La/xth;

    .line 1238
    .line 1239
    iget-object v2, v2, La/xth;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 1240
    .line 1241
    invoke-virtual {v2}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v3

    .line 1245
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    check-cast v2, La/hok;

    .line 1250
    .line 1251
    iget-object v4, v2, La/hok;->c:Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    check-cast v2, La/hok;

    .line 1258
    .line 1259
    const/4 v9, 0x0

    .line 1260
    const/16 v10, 0x1fc

    .line 1261
    .line 1262
    const v5, 0x7f0807b4

    .line 1263
    .line 1264
    .line 1265
    const/4 v6, 0x0

    .line 1266
    const/4 v7, 0x0

    .line 1267
    const/4 v8, 0x0

    .line 1268
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1269
    .line 1270
    .line 1271
    check-cast v1, La/xth;

    .line 1272
    .line 1273
    iget-object v1, v1, La/xth;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 1274
    .line 1275
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    check-cast v0, La/hok;

    .line 1280
    .line 1281
    iget-object v0, v0, La/hok;->d:Ljava/lang/String;

    .line 1282
    .line 1283
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1287
    .line 1288
    return-object v0

    .line 1289
    :pswitch_14
    move-object/from16 v1, p1

    .line 1290
    .line 1291
    check-cast v1, Ljava/util/List;

    .line 1292
    .line 1293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    .line 1295
    .line 1296
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1297
    .line 1298
    check-cast v1, La/kux;

    .line 1299
    .line 1300
    iget-object v1, v1, La/kux;->b:Landroid/widget/TextView;

    .line 1301
    .line 1302
    iget-object v4, v0, La/cp;->w:Landroid/content/Context;

    .line 1303
    .line 1304
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    check-cast v0, La/kck;

    .line 1309
    .line 1310
    iget-object v0, v0, La/kck;->a:La/hck;

    .line 1311
    .line 1312
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1313
    .line 1314
    .line 1315
    move-result v0

    .line 1316
    if-eqz v0, :cond_7

    .line 1317
    .line 1318
    if-ne v0, v7, :cond_6

    .line 1319
    .line 1320
    move v2, v3

    .line 1321
    goto :goto_3

    .line 1322
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 1323
    .line 1324
    .line 1325
    goto :goto_4

    .line 1326
    :cond_7
    :goto_3
    invoke-virtual {v4, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1331
    .line 1332
    .line 1333
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1334
    .line 1335
    :goto_4
    return-object v6

    .line 1336
    :pswitch_15
    move-object/from16 v1, p1

    .line 1337
    .line 1338
    check-cast v1, Ljava/util/List;

    .line 1339
    .line 1340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1344
    .line 1345
    check-cast v1, La/jux;

    .line 1346
    .line 1347
    iget-object v1, v1, La/jux;->b:Landroid/widget/TextView;

    .line 1348
    .line 1349
    iget-object v4, v0, La/cp;->w:Landroid/content/Context;

    .line 1350
    .line 1351
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    check-cast v0, La/jck;

    .line 1356
    .line 1357
    iget-object v0, v0, La/jck;->a:La/gck;

    .line 1358
    .line 1359
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1360
    .line 1361
    .line 1362
    move-result v0

    .line 1363
    if-eqz v0, :cond_9

    .line 1364
    .line 1365
    if-ne v0, v7, :cond_8

    .line 1366
    .line 1367
    move v2, v3

    .line 1368
    goto :goto_5

    .line 1369
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 1370
    .line 1371
    .line 1372
    goto :goto_6

    .line 1373
    :cond_9
    :goto_5
    invoke-virtual {v4, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1378
    .line 1379
    .line 1380
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1381
    .line 1382
    :goto_6
    return-object v6

    .line 1383
    :pswitch_16
    move-object/from16 v1, p1

    .line 1384
    .line 1385
    check-cast v1, Ljava/util/List;

    .line 1386
    .line 1387
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1391
    .line 1392
    move-object v2, v1

    .line 1393
    check-cast v2, La/djj0;

    .line 1394
    .line 1395
    iget-object v2, v2, La/djj0;->c:Landroid/widget/TextView;

    .line 1396
    .line 1397
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v3

    .line 1401
    check-cast v3, La/p8k;

    .line 1402
    .line 1403
    iget-object v3, v3, La/p8k;->b:Ljava/lang/String;

    .line 1404
    .line 1405
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1406
    .line 1407
    .line 1408
    check-cast v1, La/djj0;

    .line 1409
    .line 1410
    iget-object v1, v1, La/djj0;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 1411
    .line 1412
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v0

    .line 1416
    check-cast v0, La/p8k;

    .line 1417
    .line 1418
    iget-boolean v0, v0, La/p8k;->c:Z

    .line 1419
    .line 1420
    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1421
    .line 1422
    .line 1423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1424
    .line 1425
    return-object v0

    .line 1426
    :pswitch_17
    move-object/from16 v1, p1

    .line 1427
    .line 1428
    check-cast v1, Ljava/util/List;

    .line 1429
    .line 1430
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1431
    .line 1432
    .line 1433
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1434
    .line 1435
    move-object v2, v1

    .line 1436
    check-cast v2, La/djj0;

    .line 1437
    .line 1438
    iget-object v2, v2, La/djj0;->c:Landroid/widget/TextView;

    .line 1439
    .line 1440
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v3

    .line 1444
    check-cast v3, La/o8k;

    .line 1445
    .line 1446
    iget-object v3, v3, La/o8k;->b:Ljava/lang/String;

    .line 1447
    .line 1448
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1449
    .line 1450
    .line 1451
    check-cast v1, La/djj0;

    .line 1452
    .line 1453
    iget-object v1, v1, La/djj0;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 1454
    .line 1455
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    check-cast v0, La/o8k;

    .line 1460
    .line 1461
    iget-boolean v0, v0, La/o8k;->c:Z

    .line 1462
    .line 1463
    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1464
    .line 1465
    .line 1466
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1467
    .line 1468
    return-object v0

    .line 1469
    :pswitch_18
    move-object/from16 v1, p1

    .line 1470
    .line 1471
    check-cast v1, Ljava/util/List;

    .line 1472
    .line 1473
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1474
    .line 1475
    .line 1476
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1477
    .line 1478
    move-object v2, v1

    .line 1479
    check-cast v2, La/ytx;

    .line 1480
    .line 1481
    iget-object v2, v2, La/ytx;->b:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1482
    .line 1483
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1484
    .line 1485
    .line 1486
    iget-object v3, v0, La/cp;->w:Landroid/content/Context;

    .line 1487
    .line 1488
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v4

    .line 1492
    check-cast v4, La/l140;

    .line 1493
    .line 1494
    const v4, 0x7f040afc

    .line 1495
    .line 1496
    .line 1497
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1498
    .line 1499
    .line 1500
    move-result v3

    .line 1501
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v3

    .line 1505
    invoke-static {v2, v3}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 1506
    .line 1507
    .line 1508
    check-cast v1, La/ytx;

    .line 1509
    .line 1510
    iget-object v2, v1, La/ytx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1511
    .line 1512
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v3

    .line 1516
    check-cast v3, La/l140;

    .line 1517
    .line 1518
    iget v3, v3, La/l140;->d:I

    .line 1519
    .line 1520
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1521
    .line 1522
    .line 1523
    iget-object v2, v1, La/ytx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1524
    .line 1525
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v3

    .line 1529
    check-cast v3, La/l140;

    .line 1530
    .line 1531
    const v3, 0x7f040b5f

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconBackgroundTint(I)V

    .line 1535
    .line 1536
    .line 1537
    iget-object v3, v1, La/ytx;->e:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1538
    .line 1539
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v4

    .line 1543
    check-cast v4, La/l140;

    .line 1544
    .line 1545
    iget-object v4, v4, La/l140;->e:Ljava/lang/String;

    .line 1546
    .line 1547
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v4

    .line 1554
    check-cast v4, La/l140;

    .line 1555
    .line 1556
    iget-object v4, v4, La/l140;->f:Ljava/lang/String;

    .line 1557
    .line 1558
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1559
    .line 1560
    .line 1561
    iget-object v1, v1, La/ytx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1562
    .line 1563
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v3

    .line 1567
    check-cast v3, La/l140;

    .line 1568
    .line 1569
    iget v3, v3, La/l140;->g:I

    .line 1570
    .line 1571
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v0

    .line 1578
    check-cast v0, La/l140;

    .line 1579
    .line 1580
    iget-boolean v0, v0, La/l140;->b:Z

    .line 1581
    .line 1582
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1583
    .line 1584
    .line 1585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1586
    .line 1587
    return-object v0

    .line 1588
    :pswitch_19
    move-object/from16 v1, p1

    .line 1589
    .line 1590
    check-cast v1, Ljava/util/List;

    .line 1591
    .line 1592
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    check-cast v1, La/k140;

    .line 1600
    .line 1601
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 1602
    .line 1603
    check-cast v2, La/wtx;

    .line 1604
    .line 1605
    iget-object v3, v2, La/wtx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1606
    .line 1607
    iget v4, v1, La/k140;->f:I

    .line 1608
    .line 1609
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1610
    .line 1611
    .line 1612
    iget-object v3, v2, La/wtx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1613
    .line 1614
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 1615
    .line 1616
    iget v4, v1, La/k140;->g:I

    .line 1617
    .line 1618
    invoke-static {v4, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1619
    .line 1620
    .line 1621
    move-result v0

    .line 1622
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 1623
    .line 1624
    .line 1625
    iget-boolean v0, v1, La/k140;->b:Z

    .line 1626
    .line 1627
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1628
    .line 1629
    .line 1630
    iget v0, v1, La/k140;->d:I

    .line 1631
    .line 1632
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeBackgroundTint(I)V

    .line 1633
    .line 1634
    .line 1635
    iget v0, v1, La/k140;->h:I

    .line 1636
    .line 1637
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconBackgroundTint(I)V

    .line 1638
    .line 1639
    .line 1640
    iget-object v0, v2, La/wtx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1641
    .line 1642
    iget-object v3, v1, La/k140;->i:Ljava/lang/String;

    .line 1643
    .line 1644
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1645
    .line 1646
    .line 1647
    iget-object v3, v1, La/k140;->j:Ljava/lang/String;

    .line 1648
    .line 1649
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1650
    .line 1651
    .line 1652
    iget-object v0, v2, La/wtx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1653
    .line 1654
    iget v3, v1, La/k140;->k:I

    .line 1655
    .line 1656
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 1657
    .line 1658
    .line 1659
    iget-object v3, v1, La/k140;->n:Landroid/graphics/ColorFilter;

    .line 1660
    .line 1661
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 1662
    .line 1663
    .line 1664
    iget-object v0, v2, La/wtx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1665
    .line 1666
    iget v1, v1, La/k140;->l:I

    .line 1667
    .line 1668
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1669
    .line 1670
    .line 1671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1672
    .line 1673
    return-object v0

    .line 1674
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1675
    .line 1676
    check-cast v1, Ljava/util/List;

    .line 1677
    .line 1678
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v1

    .line 1685
    check-cast v1, La/k140;

    .line 1686
    .line 1687
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1688
    .line 1689
    check-cast v0, La/zvx;

    .line 1690
    .line 1691
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1692
    .line 1693
    iget v3, v1, La/k140;->f:I

    .line 1694
    .line 1695
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1696
    .line 1697
    .line 1698
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1699
    .line 1700
    iget-boolean v3, v1, La/k140;->b:Z

    .line 1701
    .line 1702
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1703
    .line 1704
    .line 1705
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1706
    .line 1707
    iget-object v2, v1, La/k140;->i:Ljava/lang/String;

    .line 1708
    .line 1709
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1710
    .line 1711
    .line 1712
    iget-object v1, v1, La/k140;->j:Ljava/lang/String;

    .line 1713
    .line 1714
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1715
    .line 1716
    .line 1717
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1718
    .line 1719
    return-object v0

    .line 1720
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1721
    .line 1722
    check-cast v1, Ljava/util/List;

    .line 1723
    .line 1724
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1725
    .line 1726
    .line 1727
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1728
    .line 1729
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1730
    .line 1731
    move-object v2, v1

    .line 1732
    check-cast v2, La/lgh;

    .line 1733
    .line 1734
    iget-object v2, v2, La/lgh;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1735
    .line 1736
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v3

    .line 1740
    check-cast v3, La/mgh;

    .line 1741
    .line 1742
    iget v3, v3, La/mgh;->b:I

    .line 1743
    .line 1744
    invoke-static {v2, v3}, La/u0d;->i(Landroid/widget/ImageView;I)V

    .line 1745
    .line 1746
    .line 1747
    check-cast v1, La/lgh;

    .line 1748
    .line 1749
    iget-object v2, v1, La/lgh;->c:Landroid/widget/TextView;

    .line 1750
    .line 1751
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v3

    .line 1755
    check-cast v3, La/mgh;

    .line 1756
    .line 1757
    iget-object v3, v3, La/mgh;->c:Ljava/lang/String;

    .line 1758
    .line 1759
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1760
    .line 1761
    .line 1762
    iget-object v1, v1, La/lgh;->c:Landroid/widget/TextView;

    .line 1763
    .line 1764
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v0

    .line 1768
    check-cast v0, La/mgh;

    .line 1769
    .line 1770
    iget-object v0, v0, La/mgh;->c:Ljava/lang/String;

    .line 1771
    .line 1772
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1773
    .line 1774
    .line 1775
    move-result v0

    .line 1776
    if-lez v0, :cond_a

    .line 1777
    .line 1778
    move v4, v8

    .line 1779
    :cond_a
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1780
    .line 1781
    .line 1782
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1783
    .line 1784
    return-object v0

    .line 1785
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1786
    .line 1787
    check-cast v1, Ljava/util/List;

    .line 1788
    .line 1789
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1790
    .line 1791
    .line 1792
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1793
    .line 1794
    check-cast v1, La/vjd;

    .line 1795
    .line 1796
    iget-object v1, v1, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 1797
    .line 1798
    sget-object v2, La/pek0;->g:La/pek0;

    .line 1799
    .line 1800
    new-instance v3, La/kja;

    .line 1801
    .line 1802
    invoke-direct {v3, v0, v5}, La/kja;-><init>(La/cp;B)V

    .line 1803
    .line 1804
    .line 1805
    new-instance v0, La/ugd;

    .line 1806
    .line 1807
    const v4, 0x1d78d6bb

    .line 1808
    .line 1809
    .line 1810
    invoke-direct {v0, v4, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1811
    .line 1812
    .line 1813
    invoke-static {v1, v2, v6, v0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 1814
    .line 1815
    .line 1816
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1817
    .line 1818
    return-object v0

    .line 1819
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
