.class public final synthetic La/n1w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s1w;


# direct methods
.method public synthetic constructor <init>(La/s1w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n1w;->a:B

    iput-object p1, p0, La/n1w;->b:La/s1w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n1w;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x2b5a

    .line 6
    .line 7
    const-string v4, "action"

    .line 8
    .line 9
    const-string v5, "bet_history_link_mail"

    .line 10
    .line 11
    const/16 v6, 0x1d

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object v0, v0, La/n1w;->b:La/s1w;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v1, La/s1w;->d2:La/bst;

    .line 22
    .line 23
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v1, v7

    .line 41
    :goto_0
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v1, v7

    .line 53
    :goto_1
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    move v1, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move v1, v9

    .line 66
    :goto_2
    iput v1, v2, La/naw;->O0:I

    .line 67
    .line 68
    iget-boolean v0, v2, La/naw;->T0:Z

    .line 69
    .line 70
    xor-int/lit8 v3, v0, 0x1

    .line 71
    .line 72
    iput-boolean v3, v2, La/naw;->T0:Z

    .line 73
    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    const-string v0, "compact"

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    const-string v0, "all"

    .line 80
    .line 81
    :goto_3
    iget-object v3, v2, La/naw;->l0:La/q37;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v4, v3, La/q37;->b:La/b4j;

    .line 87
    .line 88
    iget-object v4, v4, La/b4j;->a:La/kt2;

    .line 89
    .line 90
    const-string v5, "bet_history_select_view"

    .line 91
    .line 92
    const-string v6, "option"

    .line 93
    .line 94
    invoke-static {v6, v0, v4, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, v3, La/q37;->c:La/au0;

    .line 98
    .line 99
    iget-object v3, v3, La/au0;->a:La/s1p;

    .line 100
    .line 101
    const-wide/16 v4, 0xc83

    .line 102
    .line 103
    invoke-static {v0, v3, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v2, La/naw;->x:La/yyu;

    .line 107
    .line 108
    iget-boolean v3, v2, La/naw;->T0:Z

    .line 109
    .line 110
    iget-object v0, v0, La/yyu;->a:La/v6j0;

    .line 111
    .line 112
    iget-object v0, v0, La/v6j0;->a:La/q7d0;

    .line 113
    .line 114
    const-string v4, "COMPACT_HISTORY"

    .line 115
    .line 116
    invoke-virtual {v0, v4, v3}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    iget-object v3, v2, La/naw;->W0:La/p7m0;

    .line 120
    .line 121
    :cond_4
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v10, v0

    .line 126
    check-cast v10, La/l9h0;

    .line 127
    .line 128
    iget-boolean v4, v2, La/naw;->T0:Z

    .line 129
    .line 130
    const/16 v23, 0x0

    .line 131
    .line 132
    const/16 v24, 0x7fdf

    .line 133
    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v12, 0x0

    .line 136
    const/4 v13, 0x0

    .line 137
    const/4 v14, 0x0

    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    move/from16 v16, v4

    .line 152
    .line 153
    invoke-static/range {v10 .. v24}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    iget-object v0, v2, La/naw;->J:La/td9;

    .line 164
    .line 165
    iput-boolean v8, v0, La/td9;->a:Z

    .line 166
    .line 167
    new-instance v3, La/bp00;

    .line 168
    .line 169
    invoke-direct {v3, v9}, La/mva;-><init>(Z)V

    .line 170
    .line 171
    .line 172
    iput-object v3, v0, La/td9;->e:Ljava/lang/Object;

    .line 173
    .line 174
    new-instance v3, La/umu;

    .line 175
    .line 176
    const/16 v4, 0x1b

    .line 177
    .line 178
    invoke-direct {v3, v4}, La/umu;-><init>(B)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v3}, La/td9;->h(Lkotlin/jvm/functions/Function1;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v2, La/naw;->c1:La/p7m0;

    .line 185
    .line 186
    new-instance v3, La/r9w;

    .line 187
    .line 188
    invoke-direct {v3, v1}, La/r9w;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    iget-object v0, v2, La/naw;->Z0:La/ol60;

    .line 198
    .line 199
    new-instance v1, La/s8w;

    .line 200
    .line 201
    invoke-direct {v1, v9}, La/s8w;-><init>(Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object v0

    .line 210
    :pswitch_0
    sget-object v1, La/s1w;->d2:La/bst;

    .line 211
    .line 212
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget-object v1, v0, La/naw;->l0:La/q37;

    .line 217
    .line 218
    sget-object v2, La/a1w;->f:La/a1w;

    .line 219
    .line 220
    iget-object v3, v0, La/naw;->D0:La/s77;

    .line 221
    .line 222
    invoke-static {v3}, La/b34;->w0(La/s77;)La/r6w;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    iget-object v4, v0, La/naw;->D0:La/s77;

    .line 227
    .line 228
    invoke-static {v4}, La/b34;->w0(La/s77;)La/r6w;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-virtual {v4}, La/r6w;->a()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v5, v1, La/q37;->b:La/b4j;

    .line 240
    .line 241
    invoke-static {v5, v2, v3}, La/b4j;->h(La/b4j;La/a1w;La/r6w;)V

    .line 242
    .line 243
    .line 244
    iget-object v1, v1, La/q37;->c:La/au0;

    .line 245
    .line 246
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 247
    .line 248
    const-wide/16 v2, 0xc81

    .line 249
    .line 250
    invoke-static {v4, v1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 251
    .line 252
    .line 253
    iget-object v1, v0, La/naw;->D0:La/s77;

    .line 254
    .line 255
    sget-object v2, La/s77;->h:La/s77;

    .line 256
    .line 257
    if-ne v1, v2, :cond_6

    .line 258
    .line 259
    iget-object v1, v0, La/naw;->O:La/i1w0;

    .line 260
    .line 261
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    new-instance v3, Lorg/xplatform/bethistory/filter/presentation/FilterInfoScreen;

    .line 266
    .line 267
    iget-object v0, v0, La/naw;->d:La/sys0;

    .line 268
    .line 269
    invoke-direct {v3, v0}, Lorg/xplatform/bethistory/filter/presentation/FilterInfoScreen;-><init>(La/sys0;)V

    .line 270
    .line 271
    .line 272
    instance-of v0, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 273
    .line 274
    if-eqz v0, :cond_5

    .line 275
    .line 276
    new-instance v0, La/e1w0;

    .line 277
    .line 278
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 279
    .line 280
    invoke-direct {v0, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 281
    .line 282
    .line 283
    new-instance v3, La/c8d;

    .line 284
    .line 285
    sget-object v4, La/y7d;->a:La/v7d;

    .line 286
    .line 287
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_5
    new-instance v0, La/w0w0;

    .line 295
    .line 296
    invoke-direct {v0, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 297
    .line 298
    .line 299
    new-instance v3, La/c8d;

    .line 300
    .line 301
    sget-object v4, La/y7d;->a:La/v7d;

    .line 302
    .line 303
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    :goto_4
    invoke-static {v1, v2, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    :goto_5
    move-object v2, v0

    .line 314
    check-cast v2, La/paw;

    .line 315
    .line 316
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_7

    .line 321
    .line 322
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    check-cast v2, La/oe50;

    .line 327
    .line 328
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_6
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 333
    .line 334
    new-instance v2, La/o9w;

    .line 335
    .line 336
    invoke-direct {v2, v1}, La/o9w;-><init>(La/s77;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_1
    sget-object v1, La/s1w;->d2:La/bst;

    .line 346
    .line 347
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v0, v0, La/naw;->O:La/i1w0;

    .line 352
    .line 353
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    new-instance v2, La/c8d;

    .line 358
    .line 359
    sget-object v3, La/y7d;->a:La/v7d;

    .line 360
    .line 361
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 362
    .line 363
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 364
    .line 365
    .line 366
    invoke-static {v1, v2, v0, v1, v9}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    :goto_6
    move-object v2, v1

    .line 371
    check-cast v2, La/paw;

    .line 372
    .line 373
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-eqz v3, :cond_8

    .line 378
    .line 379
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    check-cast v2, La/oe50;

    .line 384
    .line 385
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 386
    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_2
    sget-object v1, La/s1w;->d2:La/bst;

    .line 393
    .line 394
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    iget-object v1, v0, La/naw;->I0:Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-nez v2, :cond_b

    .line 405
    .line 406
    iget-object v2, v0, La/naw;->d:La/sys0;

    .line 407
    .line 408
    sget-object v3, La/sys0;->a:La/sys0;

    .line 409
    .line 410
    if-ne v2, v3, :cond_b

    .line 411
    .line 412
    new-instance v2, Ljava/util/ArrayList;

    .line 413
    .line 414
    const/16 v3, 0xa

    .line 415
    .line 416
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    if-eqz v3, :cond_a

    .line 432
    .line 433
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    check-cast v3, La/s77;

    .line 438
    .line 439
    new-instance v4, La/m77;

    .line 440
    .line 441
    iget-object v5, v0, La/naw;->D0:La/s77;

    .line 442
    .line 443
    if-ne v3, v5, :cond_9

    .line 444
    .line 445
    move v5, v8

    .line 446
    goto :goto_8

    .line 447
    :cond_9
    move v5, v9

    .line 448
    :goto_8
    invoke-direct {v4, v3, v5}, La/m77;-><init>(La/s77;Z)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_7

    .line 455
    :cond_a
    iget-object v1, v0, La/naw;->Q0:La/sff0;

    .line 456
    .line 457
    iget-object v1, v1, La/sff0;->a:La/gx7;

    .line 458
    .line 459
    iget-object v3, v1, La/gx7;->b:La/q57;

    .line 460
    .line 461
    iget-boolean v3, v3, La/q57;->f:Z

    .line 462
    .line 463
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 464
    .line 465
    new-instance v4, La/b9w;

    .line 466
    .line 467
    iget-object v1, v1, La/gx7;->f:Ljava/lang/String;

    .line 468
    .line 469
    invoke-direct {v4, v2, v3, v1}, La/b9w;-><init>(Ljava/util/ArrayList;ZLjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0, v4}, La/ol60;->f(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    return-object v0

    .line 478
    :pswitch_3
    sget-object v1, La/s1w;->d2:La/bst;

    .line 479
    .line 480
    invoke-virtual {v0}, La/s1w;->J0()La/r5w;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    iget-object v0, v0, La/s1w;->Y1:La/a8z;

    .line 485
    .line 486
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    check-cast v0, La/t3w;

    .line 491
    .line 492
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    new-instance v2, La/cd60;

    .line 499
    .line 500
    invoke-direct {v2, v0, v6}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v2}, La/gl80;->z(Lkotlin/jvm/functions/Function1;)V

    .line 504
    .line 505
    .line 506
    new-instance v2, La/oqd;

    .line 507
    .line 508
    const/4 v3, 0x2

    .line 509
    new-array v3, v3, [La/yge0;

    .line 510
    .line 511
    aput-object v1, v3, v9

    .line 512
    .line 513
    aput-object v0, v3, v8

    .line 514
    .line 515
    sget-object v0, La/nqd;->c:La/nqd;

    .line 516
    .line 517
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-direct {v2, v0, v1}, La/oqd;-><init>(La/nqd;Ljava/util/List;)V

    .line 522
    .line 523
    .line 524
    return-object v2

    .line 525
    :pswitch_4
    sget-object v1, La/s1w;->d2:La/bst;

    .line 526
    .line 527
    new-instance v10, La/vft;

    .line 528
    .line 529
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 530
    .line 531
    .line 532
    move-result-object v12

    .line 533
    const/16 v16, 0x0

    .line 534
    .line 535
    const/16 v17, 0x17

    .line 536
    .line 537
    const/4 v11, 0x1

    .line 538
    const-class v21, La/naw;

    .line 539
    .line 540
    const-string v14, "onSaleButtonClicked"

    .line 541
    .line 542
    const-string v15, "onSaleButtonClicked(Ljava/lang/String;)V"

    .line 543
    .line 544
    move-object/from16 v13, v21

    .line 545
    .line 546
    invoke-direct/range {v10 .. v17}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 547
    .line 548
    .line 549
    new-instance v18, La/vft;

    .line 550
    .line 551
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 552
    .line 553
    .line 554
    move-result-object v20

    .line 555
    const/16 v24, 0x0

    .line 556
    .line 557
    const/16 v25, 0x18

    .line 558
    .line 559
    const/16 v19, 0x1

    .line 560
    .line 561
    const-string v22, "onMoreButtonClicked"

    .line 562
    .line 563
    const-string v23, "onMoreButtonClicked(Ljava/lang/String;)V"

    .line 564
    .line 565
    invoke-direct/range {v18 .. v25}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 566
    .line 567
    .line 568
    move-object/from16 v13, v18

    .line 569
    .line 570
    new-instance v18, La/o0t;

    .line 571
    .line 572
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 573
    .line 574
    .line 575
    move-result-object v20

    .line 576
    const/16 v25, 0x5

    .line 577
    .line 578
    const/16 v19, 0x0

    .line 579
    .line 580
    const-string v22, "onHeaderClicked"

    .line 581
    .line 582
    const-string v23, "onHeaderClicked()V"

    .line 583
    .line 584
    invoke-direct/range {v18 .. v25}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 585
    .line 586
    .line 587
    move-object/from16 v1, v18

    .line 588
    .line 589
    new-instance v18, La/vft;

    .line 590
    .line 591
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 592
    .line 593
    .line 594
    move-result-object v20

    .line 595
    const/16 v25, 0x19

    .line 596
    .line 597
    const/16 v19, 0x1

    .line 598
    .line 599
    const-string v22, "winBackClicked"

    .line 600
    .line 601
    const-string v23, "winBackClicked(Ljava/lang/String;)V"

    .line 602
    .line 603
    invoke-direct/range {v18 .. v25}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 604
    .line 605
    .line 606
    move-object/from16 v2, v18

    .line 607
    .line 608
    new-instance v18, La/ens;

    .line 609
    .line 610
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 611
    .line 612
    .line 613
    move-result-object v20

    .line 614
    const/16 v25, 0x8

    .line 615
    .line 616
    const/16 v19, 0x2

    .line 617
    .line 618
    const-string v22, "logItems"

    .line 619
    .line 620
    const-string v23, "logItems(Ljava/lang/Exception;Ljava/util/List;)V"

    .line 621
    .line 622
    invoke-direct/range {v18 .. v25}, La/ens;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 623
    .line 624
    .line 625
    move-object/from16 v3, v18

    .line 626
    .line 627
    new-instance v4, La/r5w;

    .line 628
    .line 629
    new-instance v11, La/m1w;

    .line 630
    .line 631
    invoke-direct {v11, v0, v9}, La/m1w;-><init>(La/s1w;B)V

    .line 632
    .line 633
    .line 634
    new-instance v12, La/m1w;

    .line 635
    .line 636
    invoke-direct {v12, v0, v8}, La/m1w;-><init>(La/s1w;B)V

    .line 637
    .line 638
    .line 639
    invoke-direct {v4, v3}, La/r5w;-><init>(La/ens;)V

    .line 640
    .line 641
    .line 642
    new-instance v0, La/nuq;

    .line 643
    .line 644
    const/4 v3, 0x3

    .line 645
    invoke-direct {v0, v3}, La/nuq;-><init>(B)V

    .line 646
    .line 647
    .line 648
    move-object v14, v10

    .line 649
    new-instance v10, La/enm;

    .line 650
    .line 651
    const/4 v15, 0x5

    .line 652
    invoke-direct/range {v10 .. v15}, La/enm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 653
    .line 654
    .line 655
    new-instance v5, La/atq;

    .line 656
    .line 657
    const/4 v7, 0x4

    .line 658
    invoke-direct {v5, v3, v7}, La/atq;-><init>(IB)V

    .line 659
    .line 660
    .line 661
    sget-object v14, La/gzn;->B:La/gzn;

    .line 662
    .line 663
    new-instance v15, La/gbn;

    .line 664
    .line 665
    invoke-direct {v15, v0, v5, v10, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 666
    .line 667
    .line 668
    iget-object v0, v4, La/r5w;->h:La/dp;

    .line 669
    .line 670
    invoke-virtual {v0, v15}, La/dp;->b(La/gbn;)V

    .line 671
    .line 672
    .line 673
    new-instance v5, La/sfc;

    .line 674
    .line 675
    const/16 v10, 0x18

    .line 676
    .line 677
    invoke-direct {v5, v10}, La/sfc;-><init>(B)V

    .line 678
    .line 679
    .line 680
    new-instance v10, La/sw8;

    .line 681
    .line 682
    const/16 v14, 0x9

    .line 683
    .line 684
    invoke-direct {v10, v11, v12, v13, v14}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 685
    .line 686
    .line 687
    new-instance v11, La/tad;

    .line 688
    .line 689
    invoke-direct {v11, v3, v14}, La/tad;-><init>(IB)V

    .line 690
    .line 691
    .line 692
    sget-object v12, La/qja;->t:La/qja;

    .line 693
    .line 694
    new-instance v13, La/gbn;

    .line 695
    .line 696
    invoke-direct {v13, v5, v11, v10, v12}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v0, v13}, La/dp;->b(La/gbn;)V

    .line 700
    .line 701
    .line 702
    new-instance v5, La/x2w;

    .line 703
    .line 704
    invoke-direct {v5, v9}, La/x2w;-><init>(B)V

    .line 705
    .line 706
    .line 707
    new-instance v10, La/y2w;

    .line 708
    .line 709
    invoke-direct {v10, v1, v9}, La/y2w;-><init>(La/o0t;B)V

    .line 710
    .line 711
    .line 712
    new-instance v1, La/pkv;

    .line 713
    .line 714
    const/16 v9, 0xd

    .line 715
    .line 716
    invoke-direct {v1, v3, v9}, La/pkv;-><init>(IB)V

    .line 717
    .line 718
    .line 719
    sget-object v9, La/btv;->i:La/btv;

    .line 720
    .line 721
    new-instance v11, La/gbn;

    .line 722
    .line 723
    invoke-direct {v11, v5, v1, v10, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0, v11}, La/dp;->b(La/gbn;)V

    .line 727
    .line 728
    .line 729
    new-instance v1, La/i9v0;

    .line 730
    .line 731
    invoke-direct {v1, v7}, La/i9v0;-><init>(B)V

    .line 732
    .line 733
    .line 734
    new-instance v5, La/gdv0;

    .line 735
    .line 736
    invoke-direct {v5, v2, v8}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 737
    .line 738
    .line 739
    new-instance v2, La/d8q0;

    .line 740
    .line 741
    invoke-direct {v2, v3, v6}, La/d8q0;-><init>(IB)V

    .line 742
    .line 743
    .line 744
    sget-object v6, La/mnu0;->h:La/mnu0;

    .line 745
    .line 746
    new-instance v7, La/gbn;

    .line 747
    .line 748
    invoke-direct {v7, v1, v2, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 752
    .line 753
    .line 754
    new-instance v1, La/x2w;

    .line 755
    .line 756
    invoke-direct {v1, v3}, La/x2w;-><init>(B)V

    .line 757
    .line 758
    .line 759
    new-instance v2, La/umu;

    .line 760
    .line 761
    const/16 v5, 0x1a

    .line 762
    .line 763
    invoke-direct {v2, v5}, La/umu;-><init>(B)V

    .line 764
    .line 765
    .line 766
    new-instance v5, La/pkv;

    .line 767
    .line 768
    const/16 v6, 0xf

    .line 769
    .line 770
    invoke-direct {v5, v3, v6}, La/pkv;-><init>(IB)V

    .line 771
    .line 772
    .line 773
    sget-object v3, La/btv;->k:La/btv;

    .line 774
    .line 775
    new-instance v6, La/gbn;

    .line 776
    .line 777
    invoke-direct {v6, v1, v5, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 778
    .line 779
    .line 780
    iput-object v6, v0, La/dp;->b:La/gbn;

    .line 781
    .line 782
    return-object v4

    .line 783
    :pswitch_5
    sget-object v1, La/s1w;->d2:La/bst;

    .line 784
    .line 785
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    iget-object v0, v0, La/naw;->R:La/z4w;

    .line 790
    .line 791
    invoke-virtual {v0}, La/z4w;->B()V

    .line 792
    .line 793
    .line 794
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 795
    .line 796
    return-object v0

    .line 797
    :pswitch_6
    iget-object v0, v0, La/s1w;->Z1:La/ywq;

    .line 798
    .line 799
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 800
    .line 801
    invoke-virtual {v0, v1}, La/ywq;->a(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    return-object v1

    .line 805
    :pswitch_7
    sget-object v1, La/s1w;->d2:La/bst;

    .line 806
    .line 807
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    iget-object v0, v0, La/naw;->l0:La/q37;

    .line 812
    .line 813
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    iget-object v1, v0, La/q37;->b:La/b4j;

    .line 817
    .line 818
    iget-object v1, v1, La/b4j;->a:La/kt2;

    .line 819
    .line 820
    const-string v6, "cancel"

    .line 821
    .line 822
    invoke-static {v4, v6, v1, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    iget-object v0, v0, La/q37;->c:La/au0;

    .line 826
    .line 827
    iget-object v0, v0, La/au0;->a:La/s1p;

    .line 828
    .line 829
    invoke-static {v6, v0, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 830
    .line 831
    .line 832
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_8
    sget-object v1, La/s1w;->d2:La/bst;

    .line 836
    .line 837
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    iget-object v1, v0, La/naw;->l0:La/q37;

    .line 842
    .line 843
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    iget-object v6, v1, La/q37;->b:La/b4j;

    .line 847
    .line 848
    iget-object v6, v6, La/b4j;->a:La/kt2;

    .line 849
    .line 850
    const-string v7, "link"

    .line 851
    .line 852
    invoke-static {v4, v7, v6, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    iget-object v1, v1, La/q37;->c:La/au0;

    .line 856
    .line 857
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 858
    .line 859
    invoke-static {v7, v1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 860
    .line 861
    .line 862
    iget-object v1, v0, La/naw;->P:La/ouu;

    .line 863
    .line 864
    new-instance v2, La/ab50;

    .line 865
    .line 866
    invoke-direct {v2, v9}, La/ab50;-><init>(I)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v1, v2, v8}, La/ouu;->q(La/cb50;Z)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1, v2}, La/ouu;->M(La/cb50;)La/i1w0;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 880
    .line 881
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 882
    .line 883
    .line 884
    iget-object v0, v0, La/naw;->r0:La/jh70;

    .line 885
    .line 886
    invoke-static {v0, v9}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 891
    .line 892
    if-eqz v3, :cond_c

    .line 893
    .line 894
    new-instance v3, La/e1w0;

    .line 895
    .line 896
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 897
    .line 898
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 899
    .line 900
    .line 901
    new-instance v0, La/c8d;

    .line 902
    .line 903
    sget-object v4, La/y7d;->a:La/v7d;

    .line 904
    .line 905
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    goto :goto_9

    .line 912
    :cond_c
    new-instance v3, La/w0w0;

    .line 913
    .line 914
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 915
    .line 916
    .line 917
    new-instance v0, La/c8d;

    .line 918
    .line 919
    sget-object v4, La/y7d;->a:La/v7d;

    .line 920
    .line 921
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    :goto_9
    invoke-static {v1, v2, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    :goto_a
    move-object v2, v0

    .line 932
    check-cast v2, La/paw;

    .line 933
    .line 934
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    if-eqz v3, :cond_d

    .line 939
    .line 940
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v2

    .line 944
    check-cast v2, La/oe50;

    .line 945
    .line 946
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 947
    .line 948
    .line 949
    goto :goto_a

    .line 950
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    return-object v0

    .line 953
    :pswitch_9
    sget-object v1, La/s1w;->d2:La/bst;

    .line 954
    .line 955
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    iget-object v1, v0, La/naw;->R:La/z4w;

    .line 960
    .line 961
    iget-object v0, v0, La/naw;->C0:La/ql5;

    .line 962
    .line 963
    if-eqz v0, :cond_e

    .line 964
    .line 965
    iget-wide v2, v0, La/ql5;->a:J

    .line 966
    .line 967
    goto :goto_b

    .line 968
    :cond_e
    const-wide/16 v2, 0x0

    .line 969
    .line 970
    :goto_b
    invoke-virtual {v1, v2, v3}, La/z4w;->x(J)V

    .line 971
    .line 972
    .line 973
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 974
    .line 975
    return-object v0

    .line 976
    :pswitch_a
    sget-object v1, La/s1w;->d2:La/bst;

    .line 977
    .line 978
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    const-class v1, La/s1w;

    .line 983
    .line 984
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    iget-object v2, v0, La/naw;->z:La/upt;

    .line 989
    .line 990
    invoke-virtual {v2, v8}, La/upt;->a(Z)V

    .line 991
    .line 992
    .line 993
    iget-object v2, v0, La/naw;->A:La/k9u;

    .line 994
    .line 995
    invoke-virtual {v2, v8}, La/k9u;->a(Z)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0, v1}, La/naw;->B(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1002
    .line 1003
    return-object v0

    .line 1004
    :pswitch_b
    sget-object v1, La/s1w;->d2:La/bst;

    .line 1005
    .line 1006
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    iget-object v0, v0, La/naw;->R:La/z4w;

    .line 1011
    .line 1012
    invoke-virtual {v0}, La/z4w;->y()V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1016
    .line 1017
    return-object v0

    .line 1018
    :pswitch_c
    new-instance v1, La/q0h0;

    .line 1019
    .line 1020
    iget-object v0, v0, La/s1w;->L1:La/qii;

    .line 1021
    .line 1022
    if-eqz v0, :cond_f

    .line 1023
    .line 1024
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 1025
    .line 1026
    .line 1027
    return-object v1

    .line 1028
    :cond_f
    const-string v0, "viewModelFactory"

    .line 1029
    .line 1030
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    throw v7

    .line 1034
    nop

    .line 1035
    :pswitch_data_0
    .packed-switch 0x0
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
