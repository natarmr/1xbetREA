.class public final synthetic La/kui0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/kui0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/kui0;->a:B

    .line 4
    .line 5
    const v1, 0x7f0a1260

    .line 6
    .line 7
    .line 8
    const v2, 0x7f0d03b0

    .line 9
    .line 10
    .line 11
    const-string v3, "rootView"

    .line 12
    .line 13
    const v4, 0x7f0a0434

    .line 14
    .line 15
    .line 16
    const-string v5, "Missing required view with ID: "

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Landroid/view/LayoutInflater;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Landroid/view/ViewGroup;

    .line 30
    .line 31
    const v2, 0x7f0d0563

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const v1, 0x7f0a042b

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-static {v2}, La/dc3;->c(Landroid/view/View;)La/dc3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f0a0fe9

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    .line 60
    invoke-static {v3}, La/dc3;->d(Landroid/view/View;)La/dc3;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v6, La/b3j0;

    .line 65
    .line 66
    check-cast v0, Landroid/widget/LinearLayout;

    .line 67
    .line 68
    invoke-direct {v6, v0, v1, v2}, La/b3j0;-><init>(Landroid/widget/LinearLayout;La/dc3;La/dc3;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v1, v2

    .line 73
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v6

    .line 89
    :pswitch_0
    move-object/from16 v0, p1

    .line 90
    .line 91
    check-cast v0, Landroid/view/LayoutInflater;

    .line 92
    .line 93
    move-object/from16 v1, p2

    .line 94
    .line 95
    check-cast v1, Landroid/view/ViewGroup;

    .line 96
    .line 97
    const v2, 0x7f0d0562

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const v1, 0x7f0a0018

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    invoke-static {v2}, La/dc3;->b(Landroid/view/View;)La/dc3;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const v2, 0x7f0a0019

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    invoke-static {v3}, La/dc3;->b(Landroid/view/View;)La/dc3;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const v3, 0x7f0a0381

    .line 131
    .line 132
    .line 133
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    if-eqz v4, :cond_2

    .line 138
    .line 139
    invoke-static {v4}, La/dc3;->b(Landroid/view/View;)La/dc3;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v0, Landroid/widget/LinearLayout;

    .line 144
    .line 145
    new-instance v6, La/h2j0;

    .line 146
    .line 147
    invoke-direct {v6, v0, v1, v2, v3}, La/h2j0;-><init>(Landroid/widget/LinearLayout;La/dc3;La/dc3;La/dc3;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    move v1, v3

    .line 152
    goto :goto_1

    .line 153
    :cond_3
    move v1, v2

    .line 154
    :cond_4
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_2
    return-object v6

    .line 170
    :pswitch_1
    move-object/from16 v0, p1

    .line 171
    .line 172
    check-cast v0, Landroid/view/LayoutInflater;

    .line 173
    .line 174
    move-object/from16 v1, p2

    .line 175
    .line 176
    check-cast v1, Landroid/view/ViewGroup;

    .line 177
    .line 178
    const v2, 0x7f0d0561

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 190
    .line 191
    if-eqz v1, :cond_5

    .line 192
    .line 193
    move-object v2, v0

    .line 194
    check-cast v2, Landroid/widget/LinearLayout;

    .line 195
    .line 196
    const v4, 0x7f0a0fe4

    .line 197
    .line 198
    .line 199
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-eqz v3, :cond_5

    .line 204
    .line 205
    invoke-static {v3}, La/dc3;->d(Landroid/view/View;)La/dc3;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v6, La/g2j0;

    .line 210
    .line 211
    invoke-direct {v6, v2, v1, v0}, La/g2j0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/footer/DsFooter;La/dc3;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :goto_3
    return-object v6

    .line 231
    :pswitch_2
    move-object/from16 v0, p1

    .line 232
    .line 233
    check-cast v0, Landroid/view/LayoutInflater;

    .line 234
    .line 235
    move-object/from16 v1, p2

    .line 236
    .line 237
    check-cast v1, Landroid/view/ViewGroup;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {v0, v1, v7}, La/fwx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La/fwx;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    return-object v0

    .line 250
    :pswitch_3
    move-object/from16 v0, p1

    .line 251
    .line 252
    check-cast v0, Landroid/view/LayoutInflater;

    .line 253
    .line 254
    move-object/from16 v1, p2

    .line 255
    .line 256
    check-cast v1, Landroid/view/ViewGroup;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v1, v7}, La/cux;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La/cux;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    return-object v0

    .line 269
    :pswitch_4
    move-object/from16 v0, p1

    .line 270
    .line 271
    check-cast v0, Landroid/view/LayoutInflater;

    .line 272
    .line 273
    move-object/from16 v1, p2

    .line 274
    .line 275
    check-cast v1, Landroid/view/ViewGroup;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {v0, v1, v7}, La/kxx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La/kxx;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    return-object v0

    .line 288
    :pswitch_5
    move-object/from16 v0, p1

    .line 289
    .line 290
    check-cast v0, Landroid/view/LayoutInflater;

    .line 291
    .line 292
    move-object/from16 v1, p2

    .line 293
    .line 294
    check-cast v1, Landroid/view/ViewGroup;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-static {v0, v1, v7}, La/hxx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)La/hxx;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    return-object v0

    .line 307
    :pswitch_6
    move-object/from16 v0, p1

    .line 308
    .line 309
    check-cast v0, La/oyg0;

    .line 310
    .line 311
    move-object/from16 v1, p2

    .line 312
    .line 313
    check-cast v1, La/twi0;

    .line 314
    .line 315
    iget v0, v1, La/twi0;->S:I

    .line 316
    .line 317
    add-int/lit8 v32, v0, 0x1

    .line 318
    .line 319
    const/16 v33, -0x1

    .line 320
    .line 321
    const v34, 0x1bffff

    .line 322
    .line 323
    .line 324
    const/4 v2, 0x0

    .line 325
    const/4 v3, 0x0

    .line 326
    const/4 v4, 0x0

    .line 327
    const/4 v5, 0x0

    .line 328
    const/4 v6, 0x0

    .line 329
    const/4 v7, 0x0

    .line 330
    const/4 v8, 0x0

    .line 331
    const/4 v9, 0x0

    .line 332
    const/4 v10, 0x0

    .line 333
    const/4 v11, 0x0

    .line 334
    const/4 v12, 0x0

    .line 335
    const/4 v13, 0x0

    .line 336
    const/4 v14, 0x0

    .line 337
    const/4 v15, 0x0

    .line 338
    const/16 v16, 0x0

    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const/16 v18, 0x0

    .line 343
    .line 344
    const/16 v19, 0x0

    .line 345
    .line 346
    const/16 v20, 0x0

    .line 347
    .line 348
    const/16 v21, 0x0

    .line 349
    .line 350
    const/16 v22, 0x0

    .line 351
    .line 352
    const/16 v23, 0x0

    .line 353
    .line 354
    const/16 v24, 0x0

    .line 355
    .line 356
    const/16 v25, 0x0

    .line 357
    .line 358
    const/16 v26, 0x0

    .line 359
    .line 360
    const/16 v27, 0x0

    .line 361
    .line 362
    const/16 v28, 0x0

    .line 363
    .line 364
    const/16 v29, 0x0

    .line 365
    .line 366
    const/16 v30, 0x0

    .line 367
    .line 368
    const/16 v31, 0x0

    .line 369
    .line 370
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    return-object v0

    .line 375
    :pswitch_7
    move-object/from16 v0, p1

    .line 376
    .line 377
    check-cast v0, Ljava/lang/Throwable;

    .line 378
    .line 379
    move-object/from16 v1, p2

    .line 380
    .line 381
    check-cast v1, Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_8
    move-object/from16 v0, p1

    .line 393
    .line 394
    check-cast v0, La/oyg0;

    .line 395
    .line 396
    move-object/from16 v1, p2

    .line 397
    .line 398
    check-cast v1, La/twi0;

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    const/16 v33, -0x1

    .line 407
    .line 408
    const v34, 0x1dffff

    .line 409
    .line 410
    .line 411
    const/4 v2, 0x0

    .line 412
    const/4 v3, 0x0

    .line 413
    const/4 v4, 0x0

    .line 414
    const/4 v5, 0x0

    .line 415
    const/4 v6, 0x0

    .line 416
    const/4 v7, 0x0

    .line 417
    const/4 v8, 0x0

    .line 418
    const/4 v9, 0x0

    .line 419
    const/4 v10, 0x0

    .line 420
    const/4 v11, 0x0

    .line 421
    const/4 v12, 0x0

    .line 422
    const/4 v13, 0x0

    .line 423
    const/4 v14, 0x0

    .line 424
    const/4 v15, 0x0

    .line 425
    const/16 v16, 0x0

    .line 426
    .line 427
    const/16 v17, 0x0

    .line 428
    .line 429
    const/16 v18, 0x0

    .line 430
    .line 431
    const/16 v19, 0x0

    .line 432
    .line 433
    const/16 v20, 0x0

    .line 434
    .line 435
    const/16 v21, 0x0

    .line 436
    .line 437
    const/16 v22, 0x0

    .line 438
    .line 439
    const/16 v23, 0x0

    .line 440
    .line 441
    const/16 v24, 0x0

    .line 442
    .line 443
    const/16 v25, 0x0

    .line 444
    .line 445
    const/16 v26, 0x0

    .line 446
    .line 447
    const/16 v27, 0x0

    .line 448
    .line 449
    const/16 v28, 0x0

    .line 450
    .line 451
    const/16 v29, 0x0

    .line 452
    .line 453
    const/16 v30, 0x0

    .line 454
    .line 455
    const/16 v31, 0x1

    .line 456
    .line 457
    const/16 v32, 0x0

    .line 458
    .line 459
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    return-object v0

    .line 464
    :pswitch_9
    move-object/from16 v0, p1

    .line 465
    .line 466
    check-cast v0, La/oyg0;

    .line 467
    .line 468
    move-object/from16 v1, p2

    .line 469
    .line 470
    check-cast v1, La/twi0;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget v0, v1, La/twi0;->S:I

    .line 479
    .line 480
    add-int/lit8 v32, v0, 0x1

    .line 481
    .line 482
    const/16 v33, -0x1

    .line 483
    .line 484
    const v34, 0x1bffff

    .line 485
    .line 486
    .line 487
    const/4 v2, 0x0

    .line 488
    const/4 v3, 0x0

    .line 489
    const/4 v4, 0x0

    .line 490
    const/4 v5, 0x0

    .line 491
    const/4 v6, 0x0

    .line 492
    const/4 v7, 0x0

    .line 493
    const/4 v8, 0x0

    .line 494
    const/4 v9, 0x0

    .line 495
    const/4 v10, 0x0

    .line 496
    const/4 v11, 0x0

    .line 497
    const/4 v12, 0x0

    .line 498
    const/4 v13, 0x0

    .line 499
    const/4 v14, 0x0

    .line 500
    const/4 v15, 0x0

    .line 501
    const/16 v16, 0x0

    .line 502
    .line 503
    const/16 v17, 0x0

    .line 504
    .line 505
    const/16 v18, 0x0

    .line 506
    .line 507
    const/16 v19, 0x0

    .line 508
    .line 509
    const/16 v20, 0x0

    .line 510
    .line 511
    const/16 v21, 0x0

    .line 512
    .line 513
    const/16 v22, 0x0

    .line 514
    .line 515
    const/16 v23, 0x0

    .line 516
    .line 517
    const/16 v24, 0x0

    .line 518
    .line 519
    const/16 v25, 0x0

    .line 520
    .line 521
    const/16 v26, 0x0

    .line 522
    .line 523
    const/16 v27, 0x0

    .line 524
    .line 525
    const/16 v28, 0x0

    .line 526
    .line 527
    const/16 v29, 0x0

    .line 528
    .line 529
    const/16 v30, 0x0

    .line 530
    .line 531
    const/16 v31, 0x0

    .line 532
    .line 533
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    return-object v0

    .line 538
    :pswitch_a
    move-object/from16 v0, p1

    .line 539
    .line 540
    check-cast v0, La/oyg0;

    .line 541
    .line 542
    move-object/from16 v1, p2

    .line 543
    .line 544
    check-cast v1, La/twi0;

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    const/16 v33, -0x2

    .line 553
    .line 554
    const v34, 0x1fffff

    .line 555
    .line 556
    .line 557
    const/4 v2, 0x0

    .line 558
    const/4 v3, 0x0

    .line 559
    const/4 v4, 0x0

    .line 560
    const/4 v5, 0x0

    .line 561
    const/4 v6, 0x0

    .line 562
    const/4 v7, 0x0

    .line 563
    const/4 v8, 0x0

    .line 564
    const/4 v9, 0x0

    .line 565
    const/4 v10, 0x0

    .line 566
    const/4 v11, 0x0

    .line 567
    const/4 v12, 0x0

    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const/16 v16, 0x0

    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    const/16 v18, 0x0

    .line 576
    .line 577
    const/16 v19, 0x0

    .line 578
    .line 579
    const/16 v20, 0x0

    .line 580
    .line 581
    const/16 v21, 0x0

    .line 582
    .line 583
    const/16 v22, 0x0

    .line 584
    .line 585
    const/16 v23, 0x0

    .line 586
    .line 587
    const/16 v24, 0x0

    .line 588
    .line 589
    const/16 v25, 0x0

    .line 590
    .line 591
    const/16 v26, 0x0

    .line 592
    .line 593
    const/16 v27, 0x0

    .line 594
    .line 595
    const/16 v28, 0x0

    .line 596
    .line 597
    const/16 v29, 0x0

    .line 598
    .line 599
    const/16 v30, 0x0

    .line 600
    .line 601
    const/16 v31, 0x0

    .line 602
    .line 603
    const/16 v32, 0x0

    .line 604
    .line 605
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    return-object v0

    .line 610
    :pswitch_b
    move-object/from16 v0, p1

    .line 611
    .line 612
    check-cast v0, Ljava/lang/Throwable;

    .line 613
    .line 614
    move-object/from16 v1, p2

    .line 615
    .line 616
    check-cast v1, Ljava/lang/String;

    .line 617
    .line 618
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_c
    move-object/from16 v0, p1

    .line 628
    .line 629
    check-cast v0, Ljava/lang/Throwable;

    .line 630
    .line 631
    move-object/from16 v1, p2

    .line 632
    .line 633
    check-cast v1, Ljava/lang/String;

    .line 634
    .line 635
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 642
    .line 643
    return-object v0

    .line 644
    :pswitch_d
    move-object/from16 v0, p1

    .line 645
    .line 646
    check-cast v0, La/oyg0;

    .line 647
    .line 648
    move-object/from16 v1, p2

    .line 649
    .line 650
    check-cast v1, La/twi0;

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    const/16 v33, -0x1

    .line 659
    .line 660
    const v34, 0x19ffff

    .line 661
    .line 662
    .line 663
    const/4 v2, 0x0

    .line 664
    const/4 v3, 0x0

    .line 665
    const/4 v4, 0x0

    .line 666
    const/4 v5, 0x0

    .line 667
    const/4 v6, 0x0

    .line 668
    const/4 v7, 0x0

    .line 669
    const/4 v8, 0x0

    .line 670
    const/4 v9, 0x0

    .line 671
    const/4 v10, 0x0

    .line 672
    const/4 v11, 0x0

    .line 673
    const/4 v12, 0x0

    .line 674
    const/4 v13, 0x0

    .line 675
    const/4 v14, 0x0

    .line 676
    const/4 v15, 0x0

    .line 677
    const/16 v16, 0x0

    .line 678
    .line 679
    const/16 v17, 0x0

    .line 680
    .line 681
    const/16 v18, 0x0

    .line 682
    .line 683
    const/16 v19, 0x0

    .line 684
    .line 685
    const/16 v20, 0x0

    .line 686
    .line 687
    const/16 v21, 0x0

    .line 688
    .line 689
    const/16 v22, 0x0

    .line 690
    .line 691
    const/16 v23, 0x0

    .line 692
    .line 693
    const/16 v24, 0x0

    .line 694
    .line 695
    const/16 v25, 0x0

    .line 696
    .line 697
    const/16 v26, 0x0

    .line 698
    .line 699
    const/16 v27, 0x0

    .line 700
    .line 701
    const/16 v28, 0x0

    .line 702
    .line 703
    const/16 v29, 0x0

    .line 704
    .line 705
    const/16 v30, 0x0

    .line 706
    .line 707
    const/16 v31, 0x0

    .line 708
    .line 709
    const/16 v32, 0x1

    .line 710
    .line 711
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    return-object v0

    .line 716
    :pswitch_e
    move-object/from16 v0, p1

    .line 717
    .line 718
    check-cast v0, Ljava/lang/Throwable;

    .line 719
    .line 720
    move-object/from16 v1, p2

    .line 721
    .line 722
    check-cast v1, Ljava/lang/String;

    .line 723
    .line 724
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_f
    move-object/from16 v0, p1

    .line 734
    .line 735
    check-cast v0, Ljava/lang/Throwable;

    .line 736
    .line 737
    move-object/from16 v1, p2

    .line 738
    .line 739
    check-cast v1, Ljava/lang/String;

    .line 740
    .line 741
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object v0

    .line 750
    :pswitch_10
    move-object/from16 v0, p1

    .line 751
    .line 752
    check-cast v0, La/oyg0;

    .line 753
    .line 754
    move-object/from16 v1, p2

    .line 755
    .line 756
    check-cast v1, La/twi0;

    .line 757
    .line 758
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    iget v0, v1, La/twi0;->S:I

    .line 765
    .line 766
    add-int/lit8 v32, v0, 0x1

    .line 767
    .line 768
    const/16 v33, -0x1

    .line 769
    .line 770
    const v34, 0x1bffff

    .line 771
    .line 772
    .line 773
    const/4 v2, 0x0

    .line 774
    const/4 v3, 0x0

    .line 775
    const/4 v4, 0x0

    .line 776
    const/4 v5, 0x0

    .line 777
    const/4 v6, 0x0

    .line 778
    const/4 v7, 0x0

    .line 779
    const/4 v8, 0x0

    .line 780
    const/4 v9, 0x0

    .line 781
    const/4 v10, 0x0

    .line 782
    const/4 v11, 0x0

    .line 783
    const/4 v12, 0x0

    .line 784
    const/4 v13, 0x0

    .line 785
    const/4 v14, 0x0

    .line 786
    const/4 v15, 0x0

    .line 787
    const/16 v16, 0x0

    .line 788
    .line 789
    const/16 v17, 0x0

    .line 790
    .line 791
    const/16 v18, 0x0

    .line 792
    .line 793
    const/16 v19, 0x0

    .line 794
    .line 795
    const/16 v20, 0x0

    .line 796
    .line 797
    const/16 v21, 0x0

    .line 798
    .line 799
    const/16 v22, 0x0

    .line 800
    .line 801
    const/16 v23, 0x0

    .line 802
    .line 803
    const/16 v24, 0x0

    .line 804
    .line 805
    const/16 v25, 0x0

    .line 806
    .line 807
    const/16 v26, 0x0

    .line 808
    .line 809
    const/16 v27, 0x0

    .line 810
    .line 811
    const/16 v28, 0x0

    .line 812
    .line 813
    const/16 v29, 0x0

    .line 814
    .line 815
    const/16 v30, 0x0

    .line 816
    .line 817
    const/16 v31, 0x0

    .line 818
    .line 819
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    return-object v0

    .line 824
    :pswitch_11
    move-object/from16 v0, p1

    .line 825
    .line 826
    check-cast v0, Ljava/lang/Throwable;

    .line 827
    .line 828
    move-object/from16 v1, p2

    .line 829
    .line 830
    check-cast v1, Ljava/lang/String;

    .line 831
    .line 832
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 839
    .line 840
    return-object v0

    .line 841
    :pswitch_12
    move-object/from16 v0, p1

    .line 842
    .line 843
    check-cast v0, Ljava/lang/Throwable;

    .line 844
    .line 845
    move-object/from16 v1, p2

    .line 846
    .line 847
    check-cast v1, Ljava/lang/String;

    .line 848
    .line 849
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 856
    .line 857
    return-object v0

    .line 858
    :pswitch_13
    move-object/from16 v0, p1

    .line 859
    .line 860
    check-cast v0, Ljava/lang/Throwable;

    .line 861
    .line 862
    move-object/from16 v1, p2

    .line 863
    .line 864
    check-cast v1, Ljava/lang/String;

    .line 865
    .line 866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 873
    .line 874
    return-object v0

    .line 875
    :pswitch_14
    move-object/from16 v0, p1

    .line 876
    .line 877
    check-cast v0, Ljava/lang/Throwable;

    .line 878
    .line 879
    move-object/from16 v1, p2

    .line 880
    .line 881
    check-cast v1, Ljava/lang/String;

    .line 882
    .line 883
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 890
    .line 891
    return-object v0

    .line 892
    :pswitch_15
    move-object/from16 v0, p1

    .line 893
    .line 894
    check-cast v0, La/oyg0;

    .line 895
    .line 896
    move-object/from16 v1, p2

    .line 897
    .line 898
    check-cast v1, La/twi0;

    .line 899
    .line 900
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    const/16 v33, -0x3

    .line 907
    .line 908
    const v34, 0x1fffff

    .line 909
    .line 910
    .line 911
    const/4 v2, 0x0

    .line 912
    const/4 v3, 0x0

    .line 913
    const/4 v4, 0x0

    .line 914
    const/4 v5, 0x0

    .line 915
    const/4 v6, 0x0

    .line 916
    const/4 v7, 0x0

    .line 917
    const/4 v8, 0x0

    .line 918
    const/4 v9, 0x0

    .line 919
    const/4 v10, 0x0

    .line 920
    const/4 v11, 0x0

    .line 921
    const/4 v12, 0x0

    .line 922
    const/4 v13, 0x0

    .line 923
    const/4 v14, 0x0

    .line 924
    const/4 v15, 0x0

    .line 925
    const/16 v16, 0x0

    .line 926
    .line 927
    const/16 v17, 0x0

    .line 928
    .line 929
    const/16 v18, 0x0

    .line 930
    .line 931
    const/16 v19, 0x0

    .line 932
    .line 933
    const/16 v20, 0x0

    .line 934
    .line 935
    const/16 v21, 0x0

    .line 936
    .line 937
    const/16 v22, 0x0

    .line 938
    .line 939
    const/16 v23, 0x0

    .line 940
    .line 941
    const/16 v24, 0x0

    .line 942
    .line 943
    const/16 v25, 0x0

    .line 944
    .line 945
    const/16 v26, 0x0

    .line 946
    .line 947
    const/16 v27, 0x0

    .line 948
    .line 949
    const/16 v28, 0x0

    .line 950
    .line 951
    const/16 v29, 0x0

    .line 952
    .line 953
    const/16 v30, 0x0

    .line 954
    .line 955
    const/16 v31, 0x0

    .line 956
    .line 957
    const/16 v32, 0x0

    .line 958
    .line 959
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    return-object v0

    .line 964
    :pswitch_16
    move-object/from16 v0, p1

    .line 965
    .line 966
    check-cast v0, Ljava/lang/Throwable;

    .line 967
    .line 968
    move-object/from16 v1, p2

    .line 969
    .line 970
    check-cast v1, Ljava/lang/String;

    .line 971
    .line 972
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 979
    .line 980
    return-object v0

    .line 981
    :pswitch_17
    move-object/from16 v0, p1

    .line 982
    .line 983
    check-cast v0, La/oyg0;

    .line 984
    .line 985
    move-object/from16 v1, p2

    .line 986
    .line 987
    check-cast v1, La/twi0;

    .line 988
    .line 989
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    iget v0, v1, La/twi0;->S:I

    .line 996
    .line 997
    add-int/lit8 v32, v0, 0x1

    .line 998
    .line 999
    const/16 v33, -0x1

    .line 1000
    .line 1001
    const v34, 0x1bffff

    .line 1002
    .line 1003
    .line 1004
    const/4 v2, 0x0

    .line 1005
    const/4 v3, 0x0

    .line 1006
    const/4 v4, 0x0

    .line 1007
    const/4 v5, 0x0

    .line 1008
    const/4 v6, 0x0

    .line 1009
    const/4 v7, 0x0

    .line 1010
    const/4 v8, 0x0

    .line 1011
    const/4 v9, 0x0

    .line 1012
    const/4 v10, 0x0

    .line 1013
    const/4 v11, 0x0

    .line 1014
    const/4 v12, 0x0

    .line 1015
    const/4 v13, 0x0

    .line 1016
    const/4 v14, 0x0

    .line 1017
    const/4 v15, 0x0

    .line 1018
    const/16 v16, 0x0

    .line 1019
    .line 1020
    const/16 v17, 0x0

    .line 1021
    .line 1022
    const/16 v18, 0x0

    .line 1023
    .line 1024
    const/16 v19, 0x0

    .line 1025
    .line 1026
    const/16 v20, 0x0

    .line 1027
    .line 1028
    const/16 v21, 0x0

    .line 1029
    .line 1030
    const/16 v22, 0x0

    .line 1031
    .line 1032
    const/16 v23, 0x0

    .line 1033
    .line 1034
    const/16 v24, 0x0

    .line 1035
    .line 1036
    const/16 v25, 0x0

    .line 1037
    .line 1038
    const/16 v26, 0x0

    .line 1039
    .line 1040
    const/16 v27, 0x0

    .line 1041
    .line 1042
    const/16 v28, 0x0

    .line 1043
    .line 1044
    const/16 v29, 0x0

    .line 1045
    .line 1046
    const/16 v30, 0x0

    .line 1047
    .line 1048
    const/16 v31, 0x0

    .line 1049
    .line 1050
    invoke-static/range {v1 .. v34}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    return-object v0

    .line 1055
    :pswitch_18
    move-object/from16 v0, p1

    .line 1056
    .line 1057
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1058
    .line 1059
    move-object/from16 v1, p2

    .line 1060
    .line 1061
    check-cast v1, Landroid/view/ViewGroup;

    .line 1062
    .line 1063
    const v2, 0x7f0d0410

    .line 1064
    .line 1065
    .line 1066
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    if-eqz v0, :cond_6

    .line 1071
    .line 1072
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1073
    .line 1074
    new-instance v6, La/fxx;

    .line 1075
    .line 1076
    invoke-direct {v6, v0, v0}, La/fxx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_4

    .line 1080
    :cond_6
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    :goto_4
    return-object v6

    .line 1084
    :pswitch_19
    move-object/from16 v0, p1

    .line 1085
    .line 1086
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1087
    .line 1088
    move-object/from16 v1, p2

    .line 1089
    .line 1090
    check-cast v1, Landroid/view/ViewGroup;

    .line 1091
    .line 1092
    const v2, 0x7f0d0411

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    if-eqz v0, :cond_7

    .line 1100
    .line 1101
    new-instance v6, La/gxx;

    .line 1102
    .line 1103
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1104
    .line 1105
    invoke-direct {v6, v0}, La/gxx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 1106
    .line 1107
    .line 1108
    goto :goto_5

    .line 1109
    :cond_7
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    :goto_5
    return-object v6

    .line 1113
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1114
    .line 1115
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1116
    .line 1117
    move-object/from16 v3, p2

    .line 1118
    .line 1119
    check-cast v3, Landroid/view/ViewGroup;

    .line 1120
    .line 1121
    invoke-static {v0, v3, v2, v3, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    check-cast v2, Landroid/widget/TextView;

    .line 1130
    .line 1131
    if-eqz v2, :cond_8

    .line 1132
    .line 1133
    new-instance v6, La/mux;

    .line 1134
    .line 1135
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1136
    .line 1137
    invoke-direct {v6, v0, v2}, La/mux;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_6

    .line 1141
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1154
    .line 1155
    .line 1156
    :goto_6
    return-object v6

    .line 1157
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1158
    .line 1159
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1160
    .line 1161
    move-object/from16 v3, p2

    .line 1162
    .line 1163
    check-cast v3, Landroid/view/ViewGroup;

    .line 1164
    .line 1165
    invoke-static {v0, v3, v2, v3, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    check-cast v2, Landroid/widget/TextView;

    .line 1174
    .line 1175
    if-eqz v2, :cond_9

    .line 1176
    .line 1177
    new-instance v6, La/lux;

    .line 1178
    .line 1179
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1180
    .line 1181
    invoke-direct {v6, v0, v2}, La/lux;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V

    .line 1182
    .line 1183
    .line 1184
    goto :goto_7

    .line 1185
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    :goto_7
    return-object v6

    .line 1201
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1202
    .line 1203
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1204
    .line 1205
    move-object/from16 v1, p2

    .line 1206
    .line 1207
    check-cast v1, Landroid/view/ViewGroup;

    .line 1208
    .line 1209
    const v2, 0x7f0d040f

    .line 1210
    .line 1211
    .line 1212
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    const v1, 0x7f0a016a

    .line 1217
    .line 1218
    .line 1219
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    move-object v9, v2

    .line 1224
    check-cast v9, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1225
    .line 1226
    if-eqz v9, :cond_a

    .line 1227
    .line 1228
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    move-object v10, v1

    .line 1233
    check-cast v10, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1234
    .line 1235
    if-eqz v10, :cond_b

    .line 1236
    .line 1237
    const v4, 0x7f0a0d78

    .line 1238
    .line 1239
    .line 1240
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    move-object v11, v1

    .line 1245
    check-cast v11, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 1246
    .line 1247
    if-eqz v11, :cond_b

    .line 1248
    .line 1249
    move-object v8, v0

    .line 1250
    check-cast v8, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1251
    .line 1252
    new-instance v7, La/exx;

    .line 1253
    .line 1254
    move-object v12, v8

    .line 1255
    invoke-direct/range {v7 .. v12}, La/exx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/separator/DsSeparator;Lorg/xplatform/uikit/components/cells/DsSettingsCell;)V

    .line 1256
    .line 1257
    .line 1258
    move-object v6, v7

    .line 1259
    goto :goto_8

    .line 1260
    :cond_a
    move v4, v1

    .line 1261
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v0

    .line 1273
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1274
    .line 1275
    .line 1276
    :goto_8
    return-object v6

    .line 1277
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
