.class public final La/x43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:La/oms0;

.field public final synthetic c:La/ed90;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:La/i53;

.field public final synthetic f:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic g:La/ydr;


# direct methods
.method public constructor <init>(Ljava/lang/Object;La/oms0;La/ed90;Lkotlin/jvm/functions/Function1;La/i53;Landroidx/compose/runtime/snapshots/SnapshotStateList;La/ydr;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x43;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, La/x43;->b:La/oms0;

    .line 4
    .line 5
    iput-object p3, p0, La/x43;->c:La/ed90;

    .line 6
    .line 7
    iput-object p4, p0, La/x43;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p5, p0, La/x43;->e:La/i53;

    .line 10
    .line 11
    iput-object p6, p0, La/x43;->f:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 12
    .line 13
    iput-object p7, p0, La/x43;->g:La/ydr;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    check-cast v7, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v5

    .line 26
    invoke-virtual {v7, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_10

    .line 31
    .line 32
    iget-object v1, v0, La/x43;->b:La/oms0;

    .line 33
    .line 34
    iget-object v2, v1, La/oms0;->e:La/pz40;

    .line 35
    .line 36
    iget-object v3, v1, La/oms0;->d:La/pz40;

    .line 37
    .line 38
    move-object v6, v2

    .line 39
    check-cast v6, La/hgk0;

    .line 40
    .line 41
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget-object v9, v0, La/x43;->a:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-virtual {v7, v6}, La/fet;->h(Z)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    iget-object v10, v0, La/x43;->d:Lkotlin/jvm/functions/Function1;

    .line 60
    .line 61
    iget-object v11, v0, La/x43;->c:La/ed90;

    .line 62
    .line 63
    sget-object v12, La/ukd;->a:La/cl5;

    .line 64
    .line 65
    iget-object v13, v0, La/x43;->e:La/i53;

    .line 66
    .line 67
    if-nez v6, :cond_1

    .line 68
    .line 69
    if-ne v8, v12, :cond_4

    .line 70
    .line 71
    :cond_1
    move-object v6, v2

    .line 72
    check-cast v6, La/hgk0;

    .line 73
    .line 74
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    if-eqz v11, :cond_2

    .line 85
    .line 86
    invoke-interface {v10, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, La/lie;

    .line 91
    .line 92
    :goto_1
    move-object v8, v6

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-interface {v6}, La/ams0;->d()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-nez v6, :cond_3

    .line 107
    .line 108
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-interface {v6}, La/ams0;->b()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_3

    .line 121
    .line 122
    new-instance v6, La/ed90;

    .line 123
    .line 124
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-interface {v8}, La/ams0;->d()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-direct {v6, v13, v8, v9}, La/ed90;-><init>(La/c53;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v10, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    check-cast v6, La/lie;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-interface {v10, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, La/lie;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :goto_2
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    check-cast v8, La/lie;

    .line 153
    .line 154
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-interface {v6}, La/ams0;->b()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    check-cast v2, La/hgk0;

    .line 167
    .line 168
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    invoke-virtual {v7, v6}, La/fet;->h(Z)Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    invoke-virtual {v7, v14}, La/fet;->h(Z)Z

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    or-int/2addr v6, v14

    .line 185
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    if-nez v6, :cond_5

    .line 190
    .line 191
    if-ne v14, v12, :cond_9

    .line 192
    .line 193
    :cond_5
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-interface {v6}, La/ams0;->b()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-nez v6, :cond_8

    .line 206
    .line 207
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_6

    .line 216
    .line 217
    if-eqz v11, :cond_6

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_6
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-interface {v6}, La/ams0;->d()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-nez v6, :cond_7

    .line 233
    .line 234
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-interface {v6}, La/ams0;->b()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-nez v6, :cond_7

    .line 247
    .line 248
    new-instance v6, La/ed90;

    .line 249
    .line 250
    invoke-virtual {v1}, La/oms0;->f()La/ams0;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    invoke-interface {v11}, La/ams0;->d()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    invoke-direct {v6, v13, v9, v11}, La/ed90;-><init>(La/c53;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v10, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    check-cast v6, La/lie;

    .line 266
    .line 267
    iget-object v6, v6, La/lie;->b:La/alo;

    .line 268
    .line 269
    :goto_3
    move-object v14, v6

    .line 270
    goto :goto_5

    .line 271
    :cond_7
    invoke-interface {v10, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    check-cast v6, La/lie;

    .line 276
    .line 277
    iget-object v6, v6, La/lie;->b:La/alo;

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_8
    :goto_4
    sget-object v6, La/alo;->b:La/alo;

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :goto_5
    invoke-virtual {v7, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_9
    check-cast v14, La/alo;

    .line 287
    .line 288
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    if-ne v6, v12, :cond_a

    .line 293
    .line 294
    new-instance v6, La/d53;

    .line 295
    .line 296
    move-object v10, v3

    .line 297
    check-cast v10, La/hgk0;

    .line 298
    .line 299
    invoke-virtual {v10}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-direct {v6, v10}, La/d53;-><init>(Z)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v7, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_a
    check-cast v6, La/d53;

    .line 314
    .line 315
    move-object v10, v3

    .line 316
    iget-object v3, v8, La/lie;->a:La/pzn;

    .line 317
    .line 318
    new-instance v11, La/a3w0;

    .line 319
    .line 320
    iget-object v8, v8, La/lie;->c:La/agk0;

    .line 321
    .line 322
    invoke-virtual {v8}, La/agk0;->l()F

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    invoke-direct {v11, v9, v8}, La/a3w0;-><init>(Ljava/lang/Object;F)V

    .line 327
    .line 328
    .line 329
    move-object v8, v10

    .line 330
    check-cast v8, La/hgk0;

    .line 331
    .line 332
    invoke-virtual {v8}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    iget-object v15, v6, La/d53;->b:La/pz40;

    .line 341
    .line 342
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    check-cast v15, La/hgk0;

    .line 347
    .line 348
    invoke-virtual {v15, v10}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_b

    .line 360
    .line 361
    invoke-virtual {v8}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-nez v2, :cond_b

    .line 370
    .line 371
    iget-object v1, v1, La/oms0;->a:La/p4;

    .line 372
    .line 373
    invoke-virtual {v1}, La/p4;->y0()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-nez v1, :cond_b

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_b
    move v5, v4

    .line 385
    :goto_6
    iget-object v1, v6, La/d53;->c:La/pz40;

    .line 386
    .line 387
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    check-cast v1, La/hgk0;

    .line 392
    .line 393
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v11, v6}, La/mm40;->e(La/mm40;)La/mm40;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v7, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    if-nez v1, :cond_c

    .line 409
    .line 410
    if-ne v5, v12, :cond_d

    .line 411
    .line 412
    :cond_c
    new-instance v5, La/s43;

    .line 413
    .line 414
    invoke-direct {v5, v9, v4}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    :cond_d
    move-object v1, v5

    .line 421
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 422
    .line 423
    invoke-virtual {v7, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    if-nez v5, :cond_e

    .line 432
    .line 433
    if-ne v6, v12, :cond_f

    .line 434
    .line 435
    :cond_e
    new-instance v6, La/t43;

    .line 436
    .line 437
    invoke-direct {v6, v14, v4}, La/t43;-><init>(Ljava/lang/Object;B)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v7, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_f
    move-object v5, v6

    .line 444
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 445
    .line 446
    new-instance v8, La/w43;

    .line 447
    .line 448
    iget-object v12, v0, La/x43;->g:La/ydr;

    .line 449
    .line 450
    move-object v11, v13

    .line 451
    const/4 v13, 0x0

    .line 452
    iget-object v10, v0, La/x43;->f:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 453
    .line 454
    invoke-direct/range {v8 .. v13}, La/w43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 455
    .line 456
    .line 457
    const v4, 0x6d31f397

    .line 458
    .line 459
    .line 460
    invoke-static {v4, v8, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    const/high16 v8, 0x6000000

    .line 465
    .line 466
    iget-object v0, v0, La/x43;->b:La/oms0;

    .line 467
    .line 468
    move-object v4, v14

    .line 469
    invoke-static/range {v0 .. v8}, La/b34;->d(La/oms0;Lkotlin/jvm/functions/Function1;La/mm40;La/pzn;La/alo;Lkotlin/jvm/functions/Function2;La/ugd;La/fet;I)V

    .line 470
    .line 471
    .line 472
    goto :goto_7

    .line 473
    :cond_10
    invoke-virtual {v7}, La/fet;->X()V

    .line 474
    .line 475
    .line 476
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0
.end method
