.class public final La/yxc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qjt;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, La/yxc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/yk5;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput-byte p1, p0, La/yxc;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(La/htw;Ljava/lang/String;La/j;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-byte v2, v2, La/yxc;->a:B

    .line 10
    .line 11
    const/16 v4, 0x22

    .line 12
    .line 13
    const-string v5, "<pre>"

    .line 14
    .line 15
    const-string v6, "code"

    .line 16
    .line 17
    const-string v7, "\n"

    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, La/j;->a()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, La/j;

    .line 46
    .line 47
    sget-object v4, La/cy2;->M:La/ar20;

    .line 48
    .line 49
    sget-object v5, La/cy2;->A:La/ar20;

    .line 50
    .line 51
    filled-new-array {v4, v5}, [La/ar20;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v5, v3, La/j;->a:La/ar20;

    .line 60
    .line 61
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    invoke-static {v3, v1}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v0, v3}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v0, v7}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const-string v1, "<br />"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const-string v1, "<hr />"

    .line 92
    .line 93
    invoke-virtual {v0, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v5}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    new-array v2, v9, [Ljava/lang/CharSequence;

    .line 104
    .line 105
    invoke-virtual {v0, v3, v6, v2, v9}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, La/j;->a()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, La/j;

    .line 127
    .line 128
    iget-object v4, v3, La/j;->a:La/ar20;

    .line 129
    .line 130
    sget-object v5, La/cy2;->y:La/ar20;

    .line 131
    .line 132
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_3

    .line 137
    .line 138
    invoke-static {v3, v1}, La/hic;->B(La/j;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/4 v4, 0x4

    .line 143
    invoke-static {v4, v3}, La/hic;->K(ILjava/lang/String;)Ljava/lang/CharSequence;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v0, v3}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    iget-object v3, v3, La/j;->a:La/ar20;

    .line 152
    .line 153
    sget-object v4, La/cy2;->M:La/ar20;

    .line 154
    .line 155
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_2

    .line 160
    .line 161
    invoke-virtual {v0, v7}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    invoke-virtual {v0, v7}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v6}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    const-string v1, "</pre>"

    .line 172
    .line 173
    invoke-virtual {v0, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :pswitch_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v3, v1}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    sget-object v2, La/tzn;->a:Ljava/util/Map;

    .line 189
    .line 190
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    sub-int/2addr v2, v8

    .line 195
    invoke-interface {v1, v8, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2, v8, v9}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    sget-object v5, La/pb00;->b:Lkotlin/text/Regex;

    .line 204
    .line 205
    invoke-static {v1, v9}, La/efx;->E(Ljava/lang/CharSequence;Z)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-static {v1}, La/y1w0;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    new-instance v5, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v6, "href=\""

    .line 216
    .line 217
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    new-array v4, v8, [Ljava/lang/CharSequence;

    .line 231
    .line 232
    aput-object v1, v4, v9

    .line 233
    .line 234
    const-string v1, "a"

    .line 235
    .line 236
    invoke-virtual {v0, v3, v1, v4, v9}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v2}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {v3, v1}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v0, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, La/j;->a()Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v3}, La/j;->a()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    sub-int/2addr v4, v8

    .line 273
    invoke-interface {v2, v8, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    new-instance v14, La/s43;

    .line 278
    .line 279
    invoke-direct {v14, v1, v8}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 280
    .line 281
    .line 282
    const/16 v15, 0x1e

    .line 283
    .line 284
    const-string v11, ""

    .line 285
    .line 286
    const/4 v12, 0x0

    .line 287
    const/4 v13, 0x0

    .line 288
    invoke-static/range {v10 .. v15}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    new-array v2, v9, [Ljava/lang/CharSequence;

    .line 301
    .line 302
    invoke-virtual {v0, v3, v6, v2, v9}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v6}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_7
    sget-object v2, La/cy2;->M:La/ar20;

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-static {v3, v1}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    const-string v11, " "

    .line 322
    .line 323
    const/16 v12, 0xa

    .line 324
    .line 325
    invoke-static {v12, v11}, Lkotlin/text/c;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->N(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    invoke-virtual {v0, v5}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3}, La/j;->a()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    check-cast v11, La/j;

    .line 349
    .line 350
    iget-object v11, v11, La/j;->a:La/ar20;

    .line 351
    .line 352
    sget-object v12, La/cy2;->d0:La/ar20;

    .line 353
    .line 354
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-eqz v11, :cond_5

    .line 359
    .line 360
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    sub-int/2addr v11, v8

    .line 365
    invoke-interface {v5, v9, v11}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    :cond_5
    new-instance v11, Ljava/util/ArrayList;

    .line 370
    .line 371
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    move v12, v9

    .line 379
    move v13, v12

    .line 380
    move v14, v13

    .line 381
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v15

    .line 385
    if-eqz v15, :cond_13

    .line 386
    .line 387
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v15

    .line 391
    check-cast v15, La/j;

    .line 392
    .line 393
    if-ne v12, v8, :cond_a

    .line 394
    .line 395
    move/from16 p0, v9

    .line 396
    .line 397
    sget-object v9, La/cy2;->c0:La/ar20;

    .line 398
    .line 399
    filled-new-array {v9, v2}, [La/ar20;

    .line 400
    .line 401
    .line 402
    move-result-object v16

    .line 403
    invoke-static/range {v16 .. v16}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    iget-object v4, v15, La/j;->a:La/ar20;

    .line 408
    .line 409
    invoke-interface {v8, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v8

    .line 413
    if-eqz v8, :cond_a

    .line 414
    .line 415
    invoke-static {v15, v1}, La/hic;->B(La/j;Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v8

    .line 419
    invoke-static {v10, v8}, La/hic;->K(ILjava/lang/String;)Ljava/lang/CharSequence;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    if-eqz v14, :cond_9

    .line 424
    .line 425
    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v13

    .line 429
    if-eqz v13, :cond_9

    .line 430
    .line 431
    const-string v13, "+"

    .line 432
    .line 433
    invoke-static {v8, v13}, Lkotlin/text/StringsKt;->l0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 434
    .line 435
    .line 436
    move-result v13

    .line 437
    if-eqz v13, :cond_6

    .line 438
    .line 439
    const-string v13, "line-added"

    .line 440
    .line 441
    goto :goto_3

    .line 442
    :cond_6
    const-string v13, "-"

    .line 443
    .line 444
    invoke-static {v8, v13}, Lkotlin/text/StringsKt;->l0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    if-eqz v13, :cond_7

    .line 449
    .line 450
    const-string v13, "line-deleted"

    .line 451
    .line 452
    goto :goto_3

    .line 453
    :cond_7
    const/4 v13, 0x0

    .line 454
    :goto_3
    if-eqz v13, :cond_8

    .line 455
    .line 456
    move-object/from16 v17, v5

    .line 457
    .line 458
    const-string v5, "class=\"code-line "

    .line 459
    .line 460
    move/from16 v18, v10

    .line 461
    .line 462
    const/16 v10, 0x22

    .line 463
    .line 464
    invoke-static {v10, v5, v13}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    const/4 v10, 0x1

    .line 469
    new-array v13, v10, [Ljava/lang/CharSequence;

    .line 470
    .line 471
    aput-object v5, v13, p0

    .line 472
    .line 473
    const-string v5, "span"

    .line 474
    .line 475
    move/from16 v10, p0

    .line 476
    .line 477
    invoke-virtual {v0, v15, v5, v13, v10}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v8}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v5}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 484
    .line 485
    .line 486
    goto :goto_4

    .line 487
    :cond_8
    move-object/from16 v17, v5

    .line 488
    .line 489
    move/from16 v18, v10

    .line 490
    .line 491
    invoke-virtual {v0, v8}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 492
    .line 493
    .line 494
    goto :goto_4

    .line 495
    :cond_9
    move-object/from16 v17, v5

    .line 496
    .line 497
    move/from16 v18, v10

    .line 498
    .line 499
    invoke-virtual {v0, v8}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 500
    .line 501
    .line 502
    :goto_4
    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    goto :goto_5

    .line 507
    :cond_a
    move-object/from16 v17, v5

    .line 508
    .line 509
    move/from16 v18, v10

    .line 510
    .line 511
    :goto_5
    if-nez v12, :cond_11

    .line 512
    .line 513
    iget-object v4, v15, La/j;->a:La/ar20;

    .line 514
    .line 515
    sget-object v5, La/cy2;->a0:La/ar20;

    .line 516
    .line 517
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-eqz v4, :cond_11

    .line 522
    .line 523
    iget-object v4, v15, La/j;->a:La/ar20;

    .line 524
    .line 525
    sget-object v5, La/cy2;->z:La/ar20;

    .line 526
    .line 527
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    if-eqz v4, :cond_b

    .line 532
    .line 533
    const-string v4, ""

    .line 534
    .line 535
    const/4 v10, 0x1

    .line 536
    goto :goto_6

    .line 537
    :cond_b
    sget-object v4, La/tzn;->a:Ljava/util/Map;

    .line 538
    .line 539
    invoke-static {v15, v1}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    const/4 v10, 0x1

    .line 544
    invoke-static {v4, v10, v10}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    :goto_6
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    invoke-static {v4}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    const/4 v8, 0x0

    .line 565
    :goto_7
    const/4 v9, -0x1

    .line 566
    if-ge v8, v5, :cond_d

    .line 567
    .line 568
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 569
    .line 570
    .line 571
    move-result v14

    .line 572
    invoke-static {v14}, Lkotlin/text/CharsKt;->d(C)Z

    .line 573
    .line 574
    .line 575
    move-result v14

    .line 576
    if-eqz v14, :cond_c

    .line 577
    .line 578
    goto :goto_8

    .line 579
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 580
    .line 581
    goto :goto_7

    .line 582
    :cond_d
    move v8, v9

    .line 583
    :goto_8
    if-ne v8, v9, :cond_e

    .line 584
    .line 585
    goto :goto_9

    .line 586
    :cond_e
    const/4 v5, 0x0

    .line 587
    invoke-virtual {v4, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    :goto_9
    const-string v5, "diff"

    .line 592
    .line 593
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-nez v5, :cond_10

    .line 598
    .line 599
    const-string v5, "patch"

    .line 600
    .line 601
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    if-eqz v5, :cond_f

    .line 606
    .line 607
    goto :goto_a

    .line 608
    :cond_f
    const/4 v14, 0x0

    .line 609
    goto :goto_b

    .line 610
    :cond_10
    :goto_a
    move v14, v10

    .line 611
    :goto_b
    new-instance v5, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    const-string v8, "class=\"language-"

    .line 614
    .line 615
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const/16 v4, 0x22

    .line 622
    .line 623
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    goto :goto_c

    .line 634
    :cond_11
    const/16 v4, 0x22

    .line 635
    .line 636
    const/4 v10, 0x1

    .line 637
    :goto_c
    if-nez v12, :cond_12

    .line 638
    .line 639
    iget-object v5, v15, La/j;->a:La/ar20;

    .line 640
    .line 641
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v5

    .line 645
    if-eqz v5, :cond_12

    .line 646
    .line 647
    const/4 v5, 0x0

    .line 648
    new-array v8, v5, [Ljava/lang/String;

    .line 649
    .line 650
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v8

    .line 654
    check-cast v8, [Ljava/lang/String;

    .line 655
    .line 656
    array-length v9, v8

    .line 657
    invoke-static {v8, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v8

    .line 661
    check-cast v8, [Ljava/lang/CharSequence;

    .line 662
    .line 663
    invoke-virtual {v0, v3, v6, v8, v5}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 664
    .line 665
    .line 666
    move v9, v5

    .line 667
    move v8, v10

    .line 668
    move v12, v8

    .line 669
    :goto_d
    move-object/from16 v5, v17

    .line 670
    .line 671
    move/from16 v10, v18

    .line 672
    .line 673
    goto/16 :goto_2

    .line 674
    .line 675
    :cond_12
    const/4 v5, 0x0

    .line 676
    move v9, v5

    .line 677
    move v8, v10

    .line 678
    goto :goto_d

    .line 679
    :cond_13
    move v5, v9

    .line 680
    if-nez v12, :cond_14

    .line 681
    .line 682
    new-array v1, v5, [Ljava/lang/String;

    .line 683
    .line 684
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    check-cast v1, [Ljava/lang/String;

    .line 689
    .line 690
    array-length v2, v1

    .line 691
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    check-cast v1, [Ljava/lang/CharSequence;

    .line 696
    .line 697
    invoke-virtual {v0, v3, v6, v1, v5}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 698
    .line 699
    .line 700
    :cond_14
    if-eqz v13, :cond_15

    .line 701
    .line 702
    invoke-virtual {v0, v7}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 703
    .line 704
    .line 705
    :cond_15
    const-string v1, "</code></pre>"

    .line 706
    .line 707
    invoke-virtual {v0, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 708
    .line 709
    .line 710
    return-void

    .line 711
    :pswitch_data_0
    .packed-switch 0x0
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
