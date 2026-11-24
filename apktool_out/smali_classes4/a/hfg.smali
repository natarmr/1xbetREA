.class public final synthetic La/hfg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hfg;->a:B

    iput-object p1, p0, La/hfg;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hfg;->a:B

    .line 4
    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    const v3, 0x799532c4

    .line 8
    .line 9
    .line 10
    const/high16 v5, 0x41800000    # 16.0f

    .line 11
    .line 12
    const/4 v6, 0x3

    .line 13
    const/16 v7, 0xa

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v0, v0, La/hfg;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v0, La/mii0;

    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v0, v0, La/mii0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v9}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    check-cast v0, La/x3i;

    .line 43
    .line 44
    move-object/from16 v1, p1

    .line 45
    .line 46
    check-cast v1, La/abi0;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, La/x3i;->a:La/gtj;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v1, v0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_1
    check-cast v0, La/z3i;

    .line 64
    .line 65
    move-object/from16 v1, p1

    .line 66
    .line 67
    check-cast v1, La/abi0;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, La/z3i;->a:La/gtj;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v1, v0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_2
    check-cast v0, La/rx30;

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, La/abi0;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget v0, v0, La/rx30;->d:I

    .line 94
    .line 95
    invoke-static {v1, v0}, La/cbi0;->c(La/abi0;I)V

    .line 96
    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_3
    check-cast v0, La/i0i;

    .line 102
    .line 103
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/fhl;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_4
    check-cast v0, La/ezh;

    .line 117
    .line 118
    move-object/from16 v6, p1

    .line 119
    .line 120
    check-cast v6, La/fhl;

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-boolean v0, v0, La/ezh;->e:Z

    .line 126
    .line 127
    if-eqz v0, :cond_0

    .line 128
    .line 129
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 130
    .line 131
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    new-instance v3, La/y3d;

    .line 136
    .line 137
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack60-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    new-instance v2, La/y3d;

    .line 145
    .line 146
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 147
    .line 148
    .line 149
    filled-new-array {v3, v2}, [La/y3d;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 158
    .line 159
    const/16 v2, 0x8

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    invoke-static {v0, v3, v1, v2}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    sget-object v0, La/qmk;->a:La/zcl;

    .line 167
    .line 168
    invoke-interface {v6, v5}, La/w6k;->w0(F)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    int-to-long v1, v1

    .line 177
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    int-to-long v3, v0

    .line 182
    const/16 v0, 0x20

    .line 183
    .line 184
    shl-long v0, v1, v0

    .line 185
    .line 186
    const-wide v8, 0xffffffffL

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    and-long v2, v3, v8

    .line 192
    .line 193
    or-long v12, v0, v2

    .line 194
    .line 195
    sget-object v14, La/l0q;->a:La/l0q;

    .line 196
    .line 197
    const/16 v15, 0xd6

    .line 198
    .line 199
    const-wide/16 v8, 0x0

    .line 200
    .line 201
    const-wide/16 v10, 0x0

    .line 202
    .line 203
    invoke-static/range {v6 .. v15}, La/fhl;->f(La/fhl;La/t89;JJJLa/agc;I)V

    .line 204
    .line 205
    .line 206
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_5
    check-cast v0, La/kxh;

    .line 210
    .line 211
    move-object/from16 v1, p1

    .line 212
    .line 213
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    instance-of v3, v2, La/jxh;

    .line 223
    .line 224
    if-eqz v3, :cond_1

    .line 225
    .line 226
    move-object v4, v2

    .line 227
    check-cast v4, La/jxh;

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_1
    const/4 v4, 0x0

    .line 231
    :goto_0
    if-eqz v4, :cond_2

    .line 232
    .line 233
    iget-object v2, v0, La/kxh;->b:La/a4x;

    .line 234
    .line 235
    iget-object v3, v0, La/kxh;->c:La/a4x;

    .line 236
    .line 237
    iget-object v5, v0, La/kxh;->a:La/a4x;

    .line 238
    .line 239
    iget-object v0, v0, La/kxh;->d:La/wwh;

    .line 240
    .line 241
    invoke-virtual {v4, v2, v3, v5, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 242
    .line 243
    .line 244
    :cond_2
    invoke-virtual {v1, v8, v9}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 266
    .line 267
    .line 268
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_6
    check-cast v0, La/knh;

    .line 272
    .line 273
    move-object/from16 v1, p1

    .line 274
    .line 275
    check-cast v1, La/hcz;

    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget-object v0, v0, La/knh;->a:La/a4x;

    .line 281
    .line 282
    new-instance v2, La/p1h;

    .line 283
    .line 284
    const/16 v4, 0x17

    .line 285
    .line 286
    invoke-direct {v2, v4}, La/p1h;-><init>(B)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    new-instance v6, La/vtf;

    .line 294
    .line 295
    invoke-direct {v6, v2, v0, v7}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 296
    .line 297
    .line 298
    new-instance v2, La/wl0;

    .line 299
    .line 300
    invoke-direct {v2, v0, v4}, La/wl0;-><init>(La/a4x;B)V

    .line 301
    .line 302
    .line 303
    new-instance v4, La/zd1;

    .line 304
    .line 305
    const/4 v7, 0x4

    .line 306
    invoke-direct {v4, v0, v7}, La/zd1;-><init>(La/a4x;B)V

    .line 307
    .line 308
    .line 309
    new-instance v0, La/ugd;

    .line 310
    .line 311
    invoke-direct {v0, v3, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v5, v6, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 315
    .line 316
    .line 317
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    return-object v0

    .line 320
    :pswitch_7
    move-object v1, v0

    .line 321
    check-cast v1, La/lmh;

    .line 322
    .line 323
    move-object/from16 v2, p1

    .line 324
    .line 325
    check-cast v2, Ljava/lang/Throwable;

    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    iget-boolean v0, v1, La/lmh;->z:Z

    .line 331
    .line 332
    if-eqz v0, :cond_3

    .line 333
    .line 334
    iget-object v0, v1, La/lmh;->o:Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 335
    .line 336
    iget-boolean v0, v0, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;->e:Z

    .line 337
    .line 338
    if-nez v0, :cond_3

    .line 339
    .line 340
    invoke-virtual {v1}, La/lmh;->N()V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    goto :goto_1

    .line 346
    :cond_3
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 347
    .line 348
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 349
    .line 350
    :cond_4
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iget-object v4, v1, La/i3t0;->f:La/oyg0;

    .line 358
    .line 359
    move-object v5, v0

    .line 360
    check-cast v5, La/fmh;

    .line 361
    .line 362
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 366
    .line 367
    new-instance v4, La/g0g0;

    .line 368
    .line 369
    invoke-direct {v4, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    new-instance v7, La/j0g0;

    .line 373
    .line 374
    invoke-direct {v7, v4}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    const/4 v9, 0x0

    .line 378
    const/16 v10, 0x1b

    .line 379
    .line 380
    const/4 v6, 0x0

    .line 381
    const/4 v8, 0x0

    .line 382
    invoke-static/range {v5 .. v10}, La/fmh;->a(La/fmh;La/bqr;La/j0g0;La/qlh;Ljava/lang/Integer;I)La/fmh;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_4

    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 393
    .line 394
    .line 395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    :goto_1
    return-object v0

    .line 398
    :pswitch_8
    check-cast v0, La/glh;

    .line 399
    .line 400
    move-object/from16 v1, p1

    .line 401
    .line 402
    check-cast v1, La/zjh;

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    iget-object v0, v0, La/glh;->a:Ljava/lang/String;

    .line 408
    .line 409
    new-instance v2, Lkotlin/Pair;

    .line 410
    .line 411
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    return-object v2

    .line 415
    :pswitch_9
    check-cast v0, La/mjh;

    .line 416
    .line 417
    move-object/from16 v1, p1

    .line 418
    .line 419
    check-cast v1, La/sih;

    .line 420
    .line 421
    sget-object v2, La/mjh;->Q1:La/std;

    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    iget-object v0, v0, La/mjh;->M1:La/a8z;

    .line 427
    .line 428
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    check-cast v0, La/k3t0;

    .line 433
    .line 434
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_a
    check-cast v0, La/z9f;

    .line 441
    .line 442
    move-object/from16 v1, p1

    .line 443
    .line 444
    check-cast v1, La/cp;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 450
    .line 451
    check-cast v2, La/lgh;

    .line 452
    .line 453
    iget-object v2, v2, La/lgh;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 454
    .line 455
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    new-instance v3, La/ngh;

    .line 459
    .line 460
    invoke-direct {v3, v0, v1, v8}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 461
    .line 462
    .line 463
    invoke-static {v2, v3}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 464
    .line 465
    .line 466
    new-instance v0, La/kgh;

    .line 467
    .line 468
    invoke-direct {v0, v1, v9}, La/kgh;-><init>(La/cp;B)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 472
    .line 473
    .line 474
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_b
    check-cast v0, La/opg;

    .line 478
    .line 479
    move-object/from16 v1, p1

    .line 480
    .line 481
    check-cast v1, La/cp;

    .line 482
    .line 483
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 487
    .line 488
    check-cast v2, La/tfh;

    .line 489
    .line 490
    iget-object v2, v2, La/tfh;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    new-instance v3, La/v4f;

    .line 496
    .line 497
    const/16 v4, 0x1d

    .line 498
    .line 499
    invoke-direct {v3, v0, v1, v4}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 500
    .line 501
    .line 502
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 503
    .line 504
    .line 505
    new-instance v0, La/ok;

    .line 506
    .line 507
    const/16 v2, 0x1b

    .line 508
    .line 509
    invoke-direct {v0, v1, v1, v2}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 513
    .line 514
    .line 515
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object v0

    .line 518
    :pswitch_c
    check-cast v0, La/dch;

    .line 519
    .line 520
    move-object/from16 v1, p1

    .line 521
    .line 522
    check-cast v1, Ljava/lang/Throwable;

    .line 523
    .line 524
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    new-instance v2, La/hbh;

    .line 528
    .line 529
    invoke-direct {v2, v1}, La/hbh;-><init>(Ljava/lang/Throwable;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, v2}, La/dch;->O(La/qbh;)V

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_d
    move-object v1, v0

    .line 539
    check-cast v1, La/a8h;

    .line 540
    .line 541
    move-object/from16 v2, p1

    .line 542
    .line 543
    check-cast v2, La/g7h;

    .line 544
    .line 545
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 549
    .line 550
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 551
    .line 552
    :cond_5
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object v4, v1, La/i3t0;->f:La/oyg0;

    .line 560
    .line 561
    move-object v5, v0

    .line 562
    check-cast v5, La/g7h;

    .line 563
    .line 564
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    if-eqz v0, :cond_5

    .line 572
    .line 573
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_e
    check-cast v0, La/eu6;

    .line 577
    .line 578
    move-object/from16 v1, p1

    .line 579
    .line 580
    check-cast v1, La/dao;

    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    iget v2, v1, La/dao;->a:I

    .line 586
    .line 587
    iget v3, v0, La/eu6;->a:I

    .line 588
    .line 589
    if-ne v2, v3, :cond_6

    .line 590
    .line 591
    iget-wide v2, v1, La/dao;->b:J

    .line 592
    .line 593
    iget-wide v4, v0, La/eu6;->b:J

    .line 594
    .line 595
    cmp-long v2, v2, v4

    .line 596
    .line 597
    if-nez v2, :cond_6

    .line 598
    .line 599
    iget-wide v2, v1, La/dao;->e:J

    .line 600
    .line 601
    iget-wide v4, v0, La/eu6;->c:J

    .line 602
    .line 603
    cmp-long v2, v2, v4

    .line 604
    .line 605
    if-nez v2, :cond_6

    .line 606
    .line 607
    iget-wide v2, v1, La/dao;->f:D

    .line 608
    .line 609
    iget-wide v4, v0, La/eu6;->d:D

    .line 610
    .line 611
    cmpg-double v2, v2, v4

    .line 612
    .line 613
    if-nez v2, :cond_6

    .line 614
    .line 615
    iget-object v1, v1, La/dao;->q:La/uoy;

    .line 616
    .line 617
    iget-object v0, v0, La/eu6;->e:La/uoy;

    .line 618
    .line 619
    if-ne v1, v0, :cond_6

    .line 620
    .line 621
    move v8, v9

    .line 622
    :cond_6
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    return-object v0

    .line 627
    :pswitch_f
    check-cast v0, La/h7h;

    .line 628
    .line 629
    move-object/from16 v1, p1

    .line 630
    .line 631
    check-cast v1, Ljava/lang/Integer;

    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    iget-wide v2, v0, La/h7h;->a:J

    .line 638
    .line 639
    iget-object v0, v0, La/h7h;->g:La/a4x;

    .line 640
    .line 641
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    check-cast v0, La/b7h;

    .line 646
    .line 647
    iget-wide v4, v0, La/b7h;->a:J

    .line 648
    .line 649
    new-instance v0, Ljava/lang/StringBuilder;

    .line 650
    .line 651
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    const-string v2, "_"

    .line 658
    .line 659
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    return-object v0

    .line 676
    :pswitch_10
    check-cast v0, La/m5h;

    .line 677
    .line 678
    move-object/from16 v1, p1

    .line 679
    .line 680
    check-cast v1, La/hcz;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    iget-object v0, v0, La/m5h;->a:La/a4x;

    .line 686
    .line 687
    new-instance v4, La/p1h;

    .line 688
    .line 689
    const/4 v5, 0x2

    .line 690
    invoke-direct {v4, v5}, La/p1h;-><init>(B)V

    .line 691
    .line 692
    .line 693
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    new-instance v7, La/vtf;

    .line 698
    .line 699
    invoke-direct {v7, v4, v0, v6}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 700
    .line 701
    .line 702
    new-instance v4, La/wl0;

    .line 703
    .line 704
    invoke-direct {v4, v0, v2}, La/wl0;-><init>(La/a4x;B)V

    .line 705
    .line 706
    .line 707
    new-instance v2, La/zd1;

    .line 708
    .line 709
    invoke-direct {v2, v0, v6}, La/zd1;-><init>(La/a4x;B)V

    .line 710
    .line 711
    .line 712
    new-instance v0, La/ugd;

    .line 713
    .line 714
    invoke-direct {v0, v3, v9, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v1, v5, v7, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 718
    .line 719
    .line 720
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 721
    .line 722
    return-object v0

    .line 723
    :pswitch_11
    check-cast v0, La/ppg;

    .line 724
    .line 725
    move-object/from16 v1, p1

    .line 726
    .line 727
    check-cast v1, La/cp;

    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    iget-object v2, v1, La/xhe0;->a:Landroid/view/View;

    .line 733
    .line 734
    invoke-virtual {v2, v8}, Landroid/view/View;->setLayoutDirection(I)V

    .line 735
    .line 736
    .line 737
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 738
    .line 739
    check-cast v2, La/mth;

    .line 740
    .line 741
    iget-object v3, v2, La/mth;->b:Landroid/widget/ImageView;

    .line 742
    .line 743
    sget-object v4, La/j5d;->a:Landroid/util/TypedValue;

    .line 744
    .line 745
    iget-object v4, v1, La/cp;->w:Landroid/content/Context;

    .line 746
    .line 747
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    const v5, 0x7f0606da

    .line 751
    .line 752
    .line 753
    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 758
    .line 759
    .line 760
    iget-object v2, v2, La/mth;->a:Landroid/widget/FrameLayout;

    .line 761
    .line 762
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    new-instance v3, La/v4f;

    .line 766
    .line 767
    const/16 v4, 0x19

    .line 768
    .line 769
    invoke-direct {v3, v0, v1, v4}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 770
    .line 771
    .line 772
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 773
    .line 774
    .line 775
    new-instance v0, La/rn5;

    .line 776
    .line 777
    const/16 v2, 0x1c

    .line 778
    .line 779
    invoke-direct {v0, v1, v2}, La/rn5;-><init>(La/cp;B)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 783
    .line 784
    .line 785
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 786
    .line 787
    return-object v0

    .line 788
    :pswitch_12
    check-cast v0, La/uzg;

    .line 789
    .line 790
    move-object/from16 v1, p1

    .line 791
    .line 792
    check-cast v1, La/k0w0;

    .line 793
    .line 794
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    iget-object v0, v0, La/uzg;->b:La/vqc;

    .line 798
    .line 799
    new-instance v2, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 800
    .line 801
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 802
    .line 803
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;

    .line 804
    .line 805
    invoke-direct {v2, v3, v4}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 806
    .line 807
    .line 808
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;

    .line 809
    .line 810
    invoke-direct {v3, v0, v2}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/home/CyberHomeParams;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 814
    .line 815
    .line 816
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 817
    .line 818
    return-object v0

    .line 819
    :pswitch_13
    check-cast v0, La/upg;

    .line 820
    .line 821
    move-object/from16 v1, p1

    .line 822
    .line 823
    check-cast v1, Landroid/graphics/Bitmap;

    .line 824
    .line 825
    iget-object v0, v0, La/upg;->N1:La/cgx0;

    .line 826
    .line 827
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    iget-object v0, v0, La/cgx0;->d:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;

    .line 836
    .line 837
    if-eqz v0, :cond_7

    .line 838
    .line 839
    iput-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->k1:Landroid/graphics/Bitmap;

    .line 840
    .line 841
    invoke-virtual {v0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->F1()V

    .line 842
    .line 843
    .line 844
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_14
    check-cast v0, La/jpg;

    .line 848
    .line 849
    move-object/from16 v1, p1

    .line 850
    .line 851
    check-cast v1, Ljava/lang/Integer;

    .line 852
    .line 853
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 854
    .line 855
    .line 856
    move-result v1

    .line 857
    iget-object v0, v0, La/zz3;->e:La/yz3;

    .line 858
    .line 859
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 860
    .line 861
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    instance-of v0, v0, La/uls;

    .line 866
    .line 867
    xor-int/2addr v0, v9

    .line 868
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    return-object v0

    .line 873
    :pswitch_15
    check-cast v0, La/ulg;

    .line 874
    .line 875
    move-object/from16 v1, p1

    .line 876
    .line 877
    check-cast v1, Ljava/lang/Integer;

    .line 878
    .line 879
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    new-instance v2, La/vlg;

    .line 884
    .line 885
    iget-object v3, v0, La/ulg;->r:La/ctf0;

    .line 886
    .line 887
    new-array v4, v8, [Ljava/lang/Object;

    .line 888
    .line 889
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 890
    .line 891
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-virtual {v3, v1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    invoke-direct {v2, v1}, La/vlg;-><init>(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    invoke-virtual {v0, v2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 903
    .line 904
    .line 905
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 906
    .line 907
    return-object v0

    .line 908
    :pswitch_16
    check-cast v0, La/sig;

    .line 909
    .line 910
    move-object/from16 v1, p1

    .line 911
    .line 912
    check-cast v1, La/lig;

    .line 913
    .line 914
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    iget-object v2, v1, La/lig;->a:Ljava/util/List;

    .line 918
    .line 919
    iget-object v3, v1, La/lig;->b:La/wcb;

    .line 920
    .line 921
    iget-object v0, v0, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 922
    .line 923
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 924
    .line 925
    iget-object v10, v1, La/lig;->c:Ljava/util/List;

    .line 926
    .line 927
    iget-object v11, v1, La/lig;->d:Ljava/lang/String;

    .line 928
    .line 929
    iget-boolean v12, v1, La/lig;->e:Z

    .line 930
    .line 931
    iget-object v13, v1, La/lig;->f:Ljava/util/List;

    .line 932
    .line 933
    iget-boolean v14, v1, La/lig;->g:Z

    .line 934
    .line 935
    iget-object v1, v1, La/lig;->h:Ljava/util/Map;

    .line 936
    .line 937
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    invoke-static {v11}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 950
    .line 951
    .line 952
    move-result v15

    .line 953
    if-eqz v15, :cond_8

    .line 954
    .line 955
    goto :goto_3

    .line 956
    :cond_8
    new-instance v15, Ljava/util/ArrayList;

    .line 957
    .line 958
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 959
    .line 960
    .line 961
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 966
    .line 967
    .line 968
    move-result v16

    .line 969
    if-eqz v16, :cond_a

    .line 970
    .line 971
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v5

    .line 975
    move-object v6, v5

    .line 976
    check-cast v6, La/eeb;

    .line 977
    .line 978
    iget-object v6, v6, La/eeb;->b:Ljava/lang/String;

    .line 979
    .line 980
    invoke-static {v6, v11, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 981
    .line 982
    .line 983
    move-result v6

    .line 984
    if-eqz v6, :cond_9

    .line 985
    .line 986
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    :cond_9
    const/high16 v5, 0x41800000    # 16.0f

    .line 990
    .line 991
    const/4 v6, 0x3

    .line 992
    goto :goto_2

    .line 993
    :cond_a
    move-object v2, v15

    .line 994
    :goto_3
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 995
    .line 996
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 997
    .line 998
    .line 999
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v6

    .line 1007
    if-eqz v6, :cond_d

    .line 1008
    .line 1009
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v6

    .line 1013
    move-object v11, v6

    .line 1014
    check-cast v11, La/eeb;

    .line 1015
    .line 1016
    sget-object v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1017
    .line 1018
    invoke-virtual {v0, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v15

    .line 1022
    if-eqz v15, :cond_b

    .line 1023
    .line 1024
    move-object/from16 p0, v10

    .line 1025
    .line 1026
    iget-wide v9, v11, La/eeb;->g:J

    .line 1027
    .line 1028
    goto :goto_5

    .line 1029
    :cond_b
    move-object/from16 p0, v10

    .line 1030
    .line 1031
    iget-wide v9, v11, La/eeb;->i:J

    .line 1032
    .line 1033
    :goto_5
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v9

    .line 1037
    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v10

    .line 1041
    if-nez v10, :cond_c

    .line 1042
    .line 1043
    new-instance v10, Ljava/util/ArrayList;

    .line 1044
    .line 1045
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1046
    .line 1047
    .line 1048
    invoke-interface {v5, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    :cond_c
    check-cast v10, Ljava/util/List;

    .line 1052
    .line 1053
    invoke-interface {v10, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    const/4 v9, 0x1

    .line 1057
    move-object/from16 v10, p0

    .line 1058
    .line 1059
    goto :goto_4

    .line 1060
    :cond_d
    move-object/from16 p0, v10

    .line 1061
    .line 1062
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v5

    .line 1078
    if-eqz v5, :cond_1e

    .line 1079
    .line 1080
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v5

    .line 1084
    check-cast v5, Ljava/util/Map$Entry;

    .line 1085
    .line 1086
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v6

    .line 1090
    check-cast v6, Ljava/lang/Number;

    .line 1091
    .line 1092
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 1093
    .line 1094
    .line 1095
    move-result-wide v9

    .line 1096
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v5

    .line 1100
    check-cast v5, Ljava/util/List;

    .line 1101
    .line 1102
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v6

    .line 1109
    check-cast v6, La/eeb;

    .line 1110
    .line 1111
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v11

    .line 1115
    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v11

    .line 1119
    check-cast v11, Ljava/lang/String;

    .line 1120
    .line 1121
    if-nez v11, :cond_10

    .line 1122
    .line 1123
    const-wide/16 v17, 0x0

    .line 1124
    .line 1125
    if-eqz v6, :cond_e

    .line 1126
    .line 1127
    iget-wide v7, v6, La/eeb;->i:J

    .line 1128
    .line 1129
    goto :goto_7

    .line 1130
    :cond_e
    move-wide/from16 v7, v17

    .line 1131
    .line 1132
    :goto_7
    move-object/from16 p1, v5

    .line 1133
    .line 1134
    if-eqz v6, :cond_f

    .line 1135
    .line 1136
    iget-wide v4, v6, La/eeb;->g:J

    .line 1137
    .line 1138
    goto :goto_8

    .line 1139
    :cond_f
    move-wide/from16 v4, v17

    .line 1140
    .line 1141
    :goto_8
    invoke-virtual {v3, v7, v8, v4, v5}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v11

    .line 1145
    goto :goto_9

    .line 1146
    :cond_10
    move-object/from16 p1, v5

    .line 1147
    .line 1148
    :goto_9
    new-instance v4, La/ncg;

    .line 1149
    .line 1150
    const-string v5, "CHAMP_HEADER_KEY"

    .line 1151
    .line 1152
    invoke-static {v9, v10, v5}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v5

    .line 1156
    if-eqz v6, :cond_11

    .line 1157
    .line 1158
    iget-object v6, v6, La/eeb;->c:Ljava/lang/String;

    .line 1159
    .line 1160
    goto :goto_a

    .line 1161
    :cond_11
    const/4 v6, 0x0

    .line 1162
    :goto_a
    if-nez v6, :cond_12

    .line 1163
    .line 1164
    const-string v6, ""

    .line 1165
    .line 1166
    :cond_12
    move-object/from16 v20, v6

    .line 1167
    .line 1168
    new-instance v6, La/n0x;

    .line 1169
    .line 1170
    invoke-direct {v6, v11}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    new-instance v7, La/m0x;

    .line 1174
    .line 1175
    const v8, 0x7f0808bb

    .line 1176
    .line 1177
    .line 1178
    const/4 v9, 0x6

    .line 1179
    const/4 v10, 0x0

    .line 1180
    invoke-direct {v7, v8, v10, v9}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1181
    .line 1182
    .line 1183
    new-instance v8, La/ojm;

    .line 1184
    .line 1185
    const/16 v9, 0x7f

    .line 1186
    .line 1187
    invoke-direct {v8, v9}, La/ojm;-><init>(I)V

    .line 1188
    .line 1189
    .line 1190
    new-instance v19, La/hjm;

    .line 1191
    .line 1192
    const/16 v31, 0x0

    .line 1193
    .line 1194
    const/16 v32, 0x1dd4

    .line 1195
    .line 1196
    const/16 v22, 0x0

    .line 1197
    .line 1198
    const/16 v24, 0x0

    .line 1199
    .line 1200
    const/16 v26, 0x0

    .line 1201
    .line 1202
    const/16 v27, 0x0

    .line 1203
    .line 1204
    const/16 v28, 0x0

    .line 1205
    .line 1206
    const/16 v29, 0x0

    .line 1207
    .line 1208
    const/16 v30, 0x0

    .line 1209
    .line 1210
    move-object/from16 v23, v6

    .line 1211
    .line 1212
    move-object/from16 v25, v7

    .line 1213
    .line 1214
    move-object/from16 v21, v8

    .line 1215
    .line 1216
    invoke-direct/range {v19 .. v32}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1217
    .line 1218
    .line 1219
    move-object/from16 v6, v19

    .line 1220
    .line 1221
    invoke-direct {v4, v5, v6}, La/ncg;-><init>(Ljava/lang/String;La/jjm;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    new-instance v4, Ljava/util/ArrayList;

    .line 1228
    .line 1229
    move-object/from16 v5, p1

    .line 1230
    .line 1231
    const/16 v6, 0xa

    .line 1232
    .line 1233
    invoke-static {v5, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1234
    .line 1235
    .line 1236
    move-result v7

    .line 1237
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1238
    .line 1239
    .line 1240
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v5

    .line 1244
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1245
    .line 1246
    .line 1247
    move-result v6

    .line 1248
    if-eqz v6, :cond_1d

    .line 1249
    .line 1250
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v6

    .line 1254
    check-cast v6, La/eeb;

    .line 1255
    .line 1256
    iget-wide v7, v6, La/eeb;->a:J

    .line 1257
    .line 1258
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v9

    .line 1262
    invoke-interface {v13, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1263
    .line 1264
    .line 1265
    move-result v22

    .line 1266
    const-string v9, "CHAMP_CELL_KEY"

    .line 1267
    .line 1268
    invoke-static {v7, v8, v9}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v9

    .line 1272
    iget-wide v10, v6, La/eeb;->a:J

    .line 1273
    .line 1274
    new-instance v15, La/a2l0;

    .line 1275
    .line 1276
    move-object/from16 v17, v1

    .line 1277
    .line 1278
    iget-object v1, v6, La/eeb;->b:Ljava/lang/String;

    .line 1279
    .line 1280
    sget-object v18, La/s6t0;->a:La/pz40;

    .line 1281
    .line 1282
    move-object/from16 v18, v2

    .line 1283
    .line 1284
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1289
    .line 1290
    move-object/from16 v30, v3

    .line 1291
    .line 1292
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 1293
    .line 1294
    .line 1295
    move-result-wide v2

    .line 1296
    invoke-direct {v15, v1, v2, v3}, La/a2l0;-><init>(Ljava/lang/String;J)V

    .line 1297
    .line 1298
    .line 1299
    sget-object v32, La/p1l0;->c:La/p1l0;

    .line 1300
    .line 1301
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v1

    .line 1305
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1306
    .line 1307
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1308
    .line 1309
    .line 1310
    move-result-wide v1

    .line 1311
    new-instance v3, La/y3d;

    .line 1312
    .line 1313
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 1314
    .line 1315
    .line 1316
    iget-object v1, v6, La/eeb;->e:Ljava/lang/String;

    .line 1317
    .line 1318
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v2

    .line 1322
    if-eqz v2, :cond_17

    .line 1323
    .line 1324
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1325
    .line 1326
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 1327
    .line 1328
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    iget-object v2, v6, La/eeb;->f:Ljava/lang/String;

    .line 1332
    .line 1333
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1334
    .line 1335
    .line 1336
    move-result v19

    .line 1337
    if-nez v19, :cond_13

    .line 1338
    .line 1339
    move-object/from16 v33, v3

    .line 1340
    .line 1341
    const/4 v3, 0x0

    .line 1342
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1343
    .line 1344
    .line 1345
    move-object/from16 v39, v5

    .line 1346
    .line 1347
    goto :goto_d

    .line 1348
    :cond_13
    move-object/from16 v33, v3

    .line 1349
    .line 1350
    move-object/from16 v39, v5

    .line 1351
    .line 1352
    const/4 v3, 0x0

    .line 1353
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 1354
    .line 1355
    invoke-static {v2, v5, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v5

    .line 1359
    if-nez v5, :cond_16

    .line 1360
    .line 1361
    const-string v5, "https://"

    .line 1362
    .line 1363
    invoke-static {v2, v5, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v5

    .line 1367
    if-eqz v5, :cond_14

    .line 1368
    .line 1369
    const/4 v3, 0x0

    .line 1370
    goto :goto_c

    .line 1371
    :cond_14
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    const/16 v5, 0x2f

    .line 1376
    .line 1377
    if-lez v3, :cond_15

    .line 1378
    .line 1379
    const-string v3, "/"

    .line 1380
    .line 1381
    invoke-static {v1, v3}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v3

    .line 1385
    if-nez v3, :cond_15

    .line 1386
    .line 1387
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1388
    .line 1389
    .line 1390
    :cond_15
    move/from16 p1, v5

    .line 1391
    .line 1392
    const/4 v3, 0x1

    .line 1393
    new-array v5, v3, [C

    .line 1394
    .line 1395
    const/4 v3, 0x0

    .line 1396
    aput-char p1, v5, v3

    .line 1397
    .line 1398
    invoke-static {v2, v5}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v2

    .line 1402
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1403
    .line 1404
    .line 1405
    goto :goto_d

    .line 1406
    :cond_16
    :goto_c
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1410
    .line 1411
    .line 1412
    :goto_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    :goto_e
    move-object/from16 v34, v1

    .line 1417
    .line 1418
    goto :goto_f

    .line 1419
    :cond_17
    move-object/from16 v33, v3

    .line 1420
    .line 1421
    move-object/from16 v39, v5

    .line 1422
    .line 1423
    goto :goto_e

    .line 1424
    :goto_f
    iget-object v1, v6, La/eeb;->j:La/pgb;

    .line 1425
    .line 1426
    sget-object v2, La/pgb;->b:La/pgb;

    .line 1427
    .line 1428
    if-ne v1, v2, :cond_18

    .line 1429
    .line 1430
    new-instance v1, La/pf5;

    .line 1431
    .line 1432
    const/4 v2, 0x0

    .line 1433
    const/4 v3, 0x3

    .line 1434
    invoke-direct {v1, v3, v2}, La/pf5;-><init>(ILa/y3d;)V

    .line 1435
    .line 1436
    .line 1437
    move-object/from16 v37, v1

    .line 1438
    .line 1439
    goto :goto_10

    .line 1440
    :cond_18
    const/4 v3, 0x3

    .line 1441
    const/16 v37, 0x0

    .line 1442
    .line 1443
    :goto_10
    new-instance v31, La/t1l0;

    .line 1444
    .line 1445
    const/16 v35, 0x0

    .line 1446
    .line 1447
    const/16 v36, 0x0

    .line 1448
    .line 1449
    const/16 v38, 0xd8

    .line 1450
    .line 1451
    invoke-direct/range {v31 .. v38}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 1452
    .line 1453
    .line 1454
    new-instance v1, La/l3l0;

    .line 1455
    .line 1456
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1457
    .line 1458
    const/high16 v2, 0x41800000    # 16.0f

    .line 1459
    .line 1460
    invoke-direct {v1, v2}, La/l3l0;-><init>(F)V

    .line 1461
    .line 1462
    .line 1463
    new-instance v27, La/zrm;

    .line 1464
    .line 1465
    const/16 v26, 0x0

    .line 1466
    .line 1467
    move-object/from16 v23, v27

    .line 1468
    .line 1469
    const/16 v27, 0x0

    .line 1470
    .line 1471
    const/16 v29, 0x2c

    .line 1472
    .line 1473
    move-object/from16 v28, v1

    .line 1474
    .line 1475
    move-object/from16 v24, v15

    .line 1476
    .line 1477
    move-object/from16 v25, v31

    .line 1478
    .line 1479
    invoke-direct/range {v23 .. v29}, La/zrm;-><init>(La/f2l0;La/u1l0;La/g3l0;La/d4d;La/n3l0;I)V

    .line 1480
    .line 1481
    .line 1482
    move-object/from16 v27, v23

    .line 1483
    .line 1484
    iget-wide v5, v6, La/eeb;->d:J

    .line 1485
    .line 1486
    if-eqz v12, :cond_1b

    .line 1487
    .line 1488
    new-instance v19, La/u2l0;

    .line 1489
    .line 1490
    new-instance v20, La/kpe;

    .line 1491
    .line 1492
    invoke-direct/range {v20 .. v20}, La/kpe;-><init>()V

    .line 1493
    .line 1494
    .line 1495
    long-to-int v1, v5

    .line 1496
    if-eqz v14, :cond_1a

    .line 1497
    .line 1498
    if-eqz v22, :cond_19

    .line 1499
    .line 1500
    goto :goto_11

    .line 1501
    :cond_19
    const/16 v23, 0x0

    .line 1502
    .line 1503
    goto :goto_12

    .line 1504
    :cond_1a
    :goto_11
    const/16 v23, 0x1

    .line 1505
    .line 1506
    :goto_12
    const/16 v24, 0x0

    .line 1507
    .line 1508
    move/from16 v21, v1

    .line 1509
    .line 1510
    invoke-direct/range {v19 .. v24}, La/u2l0;-><init>(La/ope;IZZLa/u1m;)V

    .line 1511
    .line 1512
    .line 1513
    move-object/from16 v7, p0

    .line 1514
    .line 1515
    move-object/from16 v28, v19

    .line 1516
    .line 1517
    const/4 v15, 0x0

    .line 1518
    goto :goto_14

    .line 1519
    :cond_1b
    new-instance v1, La/kpe;

    .line 1520
    .line 1521
    invoke-direct {v1}, La/kpe;-><init>()V

    .line 1522
    .line 1523
    .line 1524
    long-to-int v5, v5

    .line 1525
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v6

    .line 1529
    move-object/from16 v7, p0

    .line 1530
    .line 1531
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    move-result v6

    .line 1535
    if-eqz v6, :cond_1c

    .line 1536
    .line 1537
    const v6, 0x7f08090a

    .line 1538
    .line 1539
    .line 1540
    goto :goto_13

    .line 1541
    :cond_1c
    const v6, 0x7f08090b

    .line 1542
    .line 1543
    .line 1544
    :goto_13
    new-instance v8, La/e3l0;

    .line 1545
    .line 1546
    const/4 v15, 0x0

    .line 1547
    invoke-direct {v8, v5, v1, v6, v15}, La/e3l0;-><init>(ILa/ope;ILjava/lang/String;)V

    .line 1548
    .line 1549
    .line 1550
    move-object/from16 v28, v8

    .line 1551
    .line 1552
    :goto_14
    new-instance v23, La/zbg;

    .line 1553
    .line 1554
    move-object/from16 v24, v9

    .line 1555
    .line 1556
    move-wide/from16 v25, v10

    .line 1557
    .line 1558
    invoke-direct/range {v23 .. v28}, La/zbg;-><init>(Ljava/lang/String;JLa/zrm;La/g3l0;)V

    .line 1559
    .line 1560
    .line 1561
    move-object/from16 v1, v23

    .line 1562
    .line 1563
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1564
    .line 1565
    .line 1566
    move-object/from16 p0, v7

    .line 1567
    .line 1568
    move-object/from16 v1, v17

    .line 1569
    .line 1570
    move-object/from16 v2, v18

    .line 1571
    .line 1572
    move-object/from16 v3, v30

    .line 1573
    .line 1574
    move-object/from16 v5, v39

    .line 1575
    .line 1576
    goto/16 :goto_b

    .line 1577
    .line 1578
    :cond_1d
    move-object/from16 v7, p0

    .line 1579
    .line 1580
    move-object/from16 v17, v1

    .line 1581
    .line 1582
    move-object/from16 v18, v2

    .line 1583
    .line 1584
    move-object/from16 v30, v3

    .line 1585
    .line 1586
    const/4 v15, 0x0

    .line 1587
    const/high16 v2, 0x41800000    # 16.0f

    .line 1588
    .line 1589
    const/4 v3, 0x3

    .line 1590
    invoke-virtual {v0, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1591
    .line 1592
    .line 1593
    move-object/from16 v2, v18

    .line 1594
    .line 1595
    move-object/from16 v3, v30

    .line 1596
    .line 1597
    const/16 v7, 0xa

    .line 1598
    .line 1599
    const/4 v8, 0x0

    .line 1600
    goto/16 :goto_6

    .line 1601
    .line 1602
    :cond_1e
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v0

    .line 1610
    return-object v0

    .line 1611
    :pswitch_17
    check-cast v0, La/xig;

    .line 1612
    .line 1613
    move-object/from16 v1, p1

    .line 1614
    .line 1615
    check-cast v1, Ljava/lang/Integer;

    .line 1616
    .line 1617
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1618
    .line 1619
    .line 1620
    move-result v1

    .line 1621
    new-instance v2, La/rig;

    .line 1622
    .line 1623
    iget-object v3, v0, La/xig;->q:La/ctf0;

    .line 1624
    .line 1625
    const/4 v4, 0x0

    .line 1626
    new-array v5, v4, [Ljava/lang/Object;

    .line 1627
    .line 1628
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 1629
    .line 1630
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v4

    .line 1634
    invoke-virtual {v3, v1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    invoke-direct {v2, v1}, La/rig;-><init>(Ljava/lang/String;)V

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1642
    .line 1643
    .line 1644
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1645
    .line 1646
    return-object v0

    .line 1647
    :pswitch_18
    move-object v2, v0

    .line 1648
    check-cast v2, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 1649
    .line 1650
    move-object/from16 v0, p1

    .line 1651
    .line 1652
    check-cast v0, La/vzg0;

    .line 1653
    .line 1654
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1655
    .line 1656
    .line 1657
    iget-boolean v0, v2, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->c:Z

    .line 1658
    .line 1659
    if-eqz v0, :cond_1f

    .line 1660
    .line 1661
    sget-object v0, La/bnb;->a:La/bnb;

    .line 1662
    .line 1663
    :goto_15
    move-object v3, v0

    .line 1664
    goto :goto_16

    .line 1665
    :cond_1f
    sget-object v0, La/anb;->a:La/anb;

    .line 1666
    .line 1667
    goto :goto_15

    .line 1668
    :goto_16
    new-instance v4, La/hhq0;

    .line 1669
    .line 1670
    sget-object v5, La/ygq0;->c:La/ygq0;

    .line 1671
    .line 1672
    const-wide/16 v6, -0x1

    .line 1673
    .line 1674
    const-wide/16 v8, -0x1

    .line 1675
    .line 1676
    invoke-direct/range {v4 .. v9}, La/hhq0;-><init>(La/ygq0;JJ)V

    .line 1677
    .line 1678
    .line 1679
    new-instance v1, La/whg;

    .line 1680
    .line 1681
    const/4 v8, 0x0

    .line 1682
    const/16 v9, 0xc0

    .line 1683
    .line 1684
    move-object v7, v4

    .line 1685
    const-string v4, ""

    .line 1686
    .line 1687
    const/4 v5, 0x0

    .line 1688
    const/4 v6, 0x0

    .line 1689
    invoke-direct/range {v1 .. v9}, La/whg;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/cnb;Ljava/lang/String;ZZLa/hhq0;ZI)V

    .line 1690
    .line 1691
    .line 1692
    return-object v1

    .line 1693
    :pswitch_19
    move-object v1, v0

    .line 1694
    check-cast v1, La/igg;

    .line 1695
    .line 1696
    move-object/from16 v0, p1

    .line 1697
    .line 1698
    check-cast v0, Ljava/lang/Throwable;

    .line 1699
    .line 1700
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1704
    .line 1705
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1706
    .line 1707
    :cond_20
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v0

    .line 1711
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1712
    .line 1713
    .line 1714
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1715
    .line 1716
    move-object v4, v0

    .line 1717
    check-cast v4, La/egg;

    .line 1718
    .line 1719
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1720
    .line 1721
    .line 1722
    const/4 v9, 0x0

    .line 1723
    const/16 v10, 0xd7

    .line 1724
    .line 1725
    const/4 v5, 0x0

    .line 1726
    const/4 v6, 0x0

    .line 1727
    const/4 v7, 0x0

    .line 1728
    const/4 v8, 0x0

    .line 1729
    invoke-static/range {v4 .. v10}, La/egg;->a(La/egg;ZLjava/lang/Integer;La/vdg;Ljava/util/List;ZI)La/egg;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v3

    .line 1733
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v0

    .line 1737
    if-eqz v0, :cond_20

    .line 1738
    .line 1739
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1740
    .line 1741
    return-object v0

    .line 1742
    :pswitch_1a
    move v4, v8

    .line 1743
    check-cast v0, La/lib;

    .line 1744
    .line 1745
    move-object/from16 v1, p1

    .line 1746
    .line 1747
    check-cast v1, La/egg;

    .line 1748
    .line 1749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1750
    .line 1751
    .line 1752
    iget-object v2, v1, La/egg;->d:La/vdg;

    .line 1753
    .line 1754
    iget-object v3, v1, La/egg;->b:Ljava/lang/Integer;

    .line 1755
    .line 1756
    if-eqz v3, :cond_21

    .line 1757
    .line 1758
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1759
    .line 1760
    .line 1761
    move-result v8

    .line 1762
    goto :goto_17

    .line 1763
    :cond_21
    move v8, v4

    .line 1764
    :goto_17
    iget-object v3, v1, La/egg;->g:La/sff0;

    .line 1765
    .line 1766
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 1767
    .line 1768
    iget-object v3, v3, La/mum0;->y:La/v5l0;

    .line 1769
    .line 1770
    iget-object v0, v0, La/lib;->f:Ljava/lang/Object;

    .line 1771
    .line 1772
    check-cast v0, La/ctf0;

    .line 1773
    .line 1774
    iget-boolean v1, v1, La/egg;->h:Z

    .line 1775
    .line 1776
    if-nez v2, :cond_22

    .line 1777
    .line 1778
    sget-object v0, La/iun;->a:La/iun;

    .line 1779
    .line 1780
    goto :goto_1b

    .line 1781
    :cond_22
    sget-object v4, La/q0s;->a:La/q0s;

    .line 1782
    .line 1783
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1784
    .line 1785
    .line 1786
    iget-object v5, v2, La/vdg;->b:Ljava/util/ArrayList;

    .line 1787
    .line 1788
    iget-object v2, v2, La/vdg;->a:Ljava/util/ArrayList;

    .line 1789
    .line 1790
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1791
    .line 1792
    .line 1793
    move-result v2

    .line 1794
    if-nez v2, :cond_26

    .line 1795
    .line 1796
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1797
    .line 1798
    .line 1799
    move-result v2

    .line 1800
    if-eqz v2, :cond_23

    .line 1801
    .line 1802
    goto :goto_1a

    .line 1803
    :cond_23
    new-instance v2, Ljava/util/ArrayList;

    .line 1804
    .line 1805
    const/16 v6, 0xa

    .line 1806
    .line 1807
    invoke-static {v5, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1808
    .line 1809
    .line 1810
    move-result v7

    .line 1811
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v5

    .line 1818
    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1819
    .line 1820
    .line 1821
    move-result v6

    .line 1822
    if-eqz v6, :cond_24

    .line 1823
    .line 1824
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v6

    .line 1828
    check-cast v6, La/icg;

    .line 1829
    .line 1830
    invoke-static {v6, v4, v3, v0}, La/pzw;->Z(La/icg;La/q0s;La/v5l0;La/ctf0;)La/v0g0;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v6

    .line 1834
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1835
    .line 1836
    .line 1837
    goto :goto_18

    .line 1838
    :cond_24
    new-instance v0, Ljava/util/ArrayList;

    .line 1839
    .line 1840
    const/16 v6, 0xa

    .line 1841
    .line 1842
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1843
    .line 1844
    .line 1845
    move-result v3

    .line 1846
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v2

    .line 1853
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1854
    .line 1855
    .line 1856
    move-result v3

    .line 1857
    if-eqz v3, :cond_25

    .line 1858
    .line 1859
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v3

    .line 1863
    check-cast v3, La/x0g0;

    .line 1864
    .line 1865
    new-instance v4, La/agg;

    .line 1866
    .line 1867
    invoke-interface {v3}, La/a2n;->getKey()Ljava/lang/String;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v5

    .line 1871
    const-string v6, "RESULTS"

    .line 1872
    .line 1873
    invoke-static {v8, v6, v5}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v5

    .line 1877
    invoke-direct {v4, v5, v3, v1}, La/agg;-><init>(Ljava/lang/String;La/x0g0;Z)V

    .line 1878
    .line 1879
    .line 1880
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1881
    .line 1882
    .line 1883
    goto :goto_19

    .line 1884
    :cond_25
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    goto :goto_1b

    .line 1889
    :cond_26
    :goto_1a
    sget-object v0, La/iun;->a:La/iun;

    .line 1890
    .line 1891
    :goto_1b
    return-object v0

    .line 1892
    :pswitch_1b
    check-cast v0, La/zfg;

    .line 1893
    .line 1894
    move-object/from16 v1, p1

    .line 1895
    .line 1896
    check-cast v1, La/sfg;

    .line 1897
    .line 1898
    sget-object v2, La/zfg;->S1:La/kud;

    .line 1899
    .line 1900
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v0}, La/zfg;->G0()La/k3t0;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v0

    .line 1907
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1908
    .line 1909
    .line 1910
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1911
    .line 1912
    return-object v0

    .line 1913
    :pswitch_1c
    check-cast v0, La/jfg;

    .line 1914
    .line 1915
    move-object/from16 v1, p1

    .line 1916
    .line 1917
    check-cast v1, Ljava/lang/Throwable;

    .line 1918
    .line 1919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1920
    .line 1921
    .line 1922
    iget-object v0, v0, La/jfg;->s:La/duj;

    .line 1923
    .line 1924
    new-instance v3, La/jyf;

    .line 1925
    .line 1926
    invoke-direct {v3, v2}, La/jyf;-><init>(B)V

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1930
    .line 1931
    .line 1932
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1933
    .line 1934
    return-object v0

    .line 1935
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
