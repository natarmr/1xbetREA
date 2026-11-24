.class public final La/hdx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tgi0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/hdx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(La/wvq0;Z)I
    .locals 2

    .line 1
    invoke-virtual {p0}, La/wvq0;->e()La/ar20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/cy2;->V:La/ar20;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move p1, v1

    .line 21
    :goto_0
    invoke-virtual {p0, v1}, La/wvq0;->f(I)La/lvq0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v0, v0, La/lvq0;->c:I

    .line 26
    .line 27
    invoke-virtual {p0, v1}, La/wvq0;->f(I)La/lvq0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget p0, p0, La/lvq0;->b:I

    .line 32
    .line 33
    sub-int/2addr v0, p0

    .line 34
    sub-int/2addr v0, p1

    .line 35
    return v0
.end method


# virtual methods
.method public final a(La/dgu;Ljava/util/List;)La/j910;
    .locals 11

    .line 1
    iget-byte p0, p0, La/hdx;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, -0xef

    .line 5
    .line 6
    const/16 v2, 0x1a

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p0, La/j910;

    .line 16
    .line 17
    invoke-direct {p0, v2}, La/j910;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/xvq0;

    .line 26
    .line 27
    invoke-direct {v2, p1, p2}, La/xvq0;-><init>(La/dgu;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, La/z0x;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    invoke-direct {v4, p1, p2, v5}, La/z0x;-><init>(La/dgu;Ljava/util/List;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    move p2, v1

    .line 41
    move v4, p2

    .line 42
    :goto_0
    invoke-virtual {v2}, La/wvq0;->e()La/ar20;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    invoke-virtual {v2}, La/wvq0;->e()La/ar20;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    sget-object v6, La/cy2;->F:La/ar20;

    .line 53
    .line 54
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, La/qb00;

    .line 65
    .line 66
    invoke-static {v2, v5}, La/efx;->G(La/wvq0;La/qb00;)La/vr00;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    iget-object v2, v5, La/vr00;->a:La/wvq0;

    .line 73
    .line 74
    invoke-virtual {v2}, La/wvq0;->a()La/wvq0;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {p0, v5}, La/j910;->E(La/vr00;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    iget v5, v2, La/wvq0;->a:I

    .line 83
    .line 84
    add-int/lit8 v6, p2, 0x1

    .line 85
    .line 86
    if-ne v6, v5, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    if-eq v4, v1, :cond_2

    .line 90
    .line 91
    new-instance v6, Lkotlin/ranges/IntRange;

    .line 92
    .line 93
    invoke-direct {v6, v4, p2, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    move v4, v5

    .line 100
    :goto_1
    invoke-virtual {v2}, La/wvq0;->a()La/wvq0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    move p2, v5

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    if-eq v4, v1, :cond_4

    .line 107
    .line 108
    new-instance p1, Lkotlin/ranges/IntRange;

    .line 109
    .line 110
    invoke-direct {p1, v4, p2, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_4
    invoke-virtual {p0, v0}, La/j910;->D(Ljava/util/ArrayList;)V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance p0, La/j910;

    .line 124
    .line 125
    invoke-direct {p0, v2}, La/j910;-><init>(B)V

    .line 126
    .line 127
    .line 128
    new-instance v2, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance v4, La/xvq0;

    .line 134
    .line 135
    invoke-direct {v4, p1, p2}, La/xvq0;-><init>(La/dgu;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    new-instance v5, La/z0x;

    .line 139
    .line 140
    invoke-direct {v5, p1, p2, v0}, La/z0x;-><init>(La/dgu;Ljava/util/List;B)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    move p2, v1

    .line 148
    move v0, p2

    .line 149
    :goto_2
    invoke-virtual {v4}, La/wvq0;->e()La/ar20;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    iget v6, v4, La/wvq0;->a:I

    .line 154
    .line 155
    if-eqz v5, :cond_9

    .line 156
    .line 157
    invoke-virtual {v4}, La/wvq0;->e()La/ar20;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v7, La/cy2;->K:La/ar20;

    .line 162
    .line 163
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_6

    .line 168
    .line 169
    invoke-virtual {v4}, La/wvq0;->g()La/ar20;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    sget-object v7, La/cy2;->F:La/ar20;

    .line 174
    .line 175
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_6

    .line 180
    .line 181
    invoke-virtual {v4}, La/wvq0;->a()La/wvq0;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    check-cast v7, La/qb00;

    .line 190
    .line 191
    invoke-static {v5, v7}, La/gst;->i(La/wvq0;La/qb00;)La/vr00;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    if-nez v5, :cond_5

    .line 196
    .line 197
    invoke-virtual {v4}, La/wvq0;->a()La/wvq0;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v7, La/qb00;

    .line 206
    .line 207
    invoke-static {v5, v7}, La/efx;->G(La/wvq0;La/qb00;)La/vr00;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    :cond_5
    if-eqz v5, :cond_6

    .line 212
    .line 213
    iget-object v4, v5, La/vr00;->a:La/wvq0;

    .line 214
    .line 215
    new-instance v7, La/sgi0;

    .line 216
    .line 217
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 218
    .line 219
    iget v9, v4, La/wvq0;->a:I

    .line 220
    .line 221
    add-int/2addr v9, v3

    .line 222
    invoke-direct {v8, v6, v9, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 223
    .line 224
    .line 225
    sget-object v6, La/wb;->G:La/ar20;

    .line 226
    .line 227
    invoke-direct {v7, v8, v6}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 228
    .line 229
    .line 230
    iget-object v6, p0, La/j910;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v6, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v5}, La/j910;->E(La/vr00;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4}, La/wvq0;->a()La/wvq0;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    goto :goto_2

    .line 245
    :cond_6
    add-int/lit8 v5, p2, 0x1

    .line 246
    .line 247
    if-ne v5, v6, :cond_7

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_7
    if-eq v0, v1, :cond_8

    .line 251
    .line 252
    new-instance v5, Lkotlin/ranges/IntRange;

    .line 253
    .line 254
    invoke-direct {v5, v0, p2, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    :cond_8
    move v0, v6

    .line 261
    :goto_3
    invoke-virtual {v4}, La/wvq0;->a()La/wvq0;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    move p2, v6

    .line 266
    goto :goto_2

    .line 267
    :cond_9
    if-eq v0, v1, :cond_a

    .line 268
    .line 269
    new-instance p1, Lkotlin/ranges/IntRange;

    .line 270
    .line 271
    invoke-direct {p1, v0, p2, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    :cond_a
    invoke-virtual {p0, v2}, La/j910;->D(Ljava/util/ArrayList;)V

    .line 278
    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_1
    sget-object p0, La/cy2;->V:La/ar20;

    .line 282
    .line 283
    sget-object v4, La/cy2;->U:La/ar20;

    .line 284
    .line 285
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    new-instance v5, La/j910;

    .line 289
    .line 290
    invoke-direct {v5, v2}, La/j910;-><init>(B)V

    .line 291
    .line 292
    .line 293
    new-instance v2, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    new-instance v6, La/xvq0;

    .line 299
    .line 300
    invoke-direct {v6, p1, p2}, La/xvq0;-><init>(La/dgu;Ljava/util/List;)V

    .line 301
    .line 302
    .line 303
    move p1, v1

    .line 304
    move p2, p1

    .line 305
    :goto_4
    invoke-virtual {v6}, La/wvq0;->e()La/ar20;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    iget v8, v6, La/wvq0;->a:I

    .line 310
    .line 311
    if-eqz v7, :cond_12

    .line 312
    .line 313
    invoke-virtual {v6}, La/wvq0;->e()La/ar20;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    if-nez v7, :cond_b

    .line 322
    .line 323
    invoke-virtual {v6}, La/wvq0;->e()La/ar20;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    invoke-static {v7, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-eqz v7, :cond_f

    .line 332
    .line 333
    :cond_b
    invoke-virtual {v6}, La/wvq0;->a()La/wvq0;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-static {v6, v3}, La/hdx;->b(La/wvq0;Z)I

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    :goto_5
    invoke-virtual {v7}, La/wvq0;->e()La/ar20;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    if-eqz v10, :cond_e

    .line 346
    .line 347
    invoke-virtual {v7}, La/wvq0;->e()La/ar20;

    .line 348
    .line 349
    .line 350
    move-result-object v10

    .line 351
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    if-nez v10, :cond_c

    .line 356
    .line 357
    invoke-virtual {v7}, La/wvq0;->e()La/ar20;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    invoke-static {v10, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    if-eqz v10, :cond_d

    .line 366
    .line 367
    :cond_c
    invoke-static {v7, v0}, La/hdx;->b(La/wvq0;Z)I

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    if-ne v10, v9, :cond_d

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_d
    invoke-virtual {v7}, La/wvq0;->a()La/wvq0;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    goto :goto_5

    .line 379
    :cond_e
    const/4 v7, 0x0

    .line 380
    :goto_6
    if-eqz v7, :cond_f

    .line 381
    .line 382
    new-instance v6, La/sgi0;

    .line 383
    .line 384
    new-instance v9, Lkotlin/ranges/IntRange;

    .line 385
    .line 386
    iget v10, v7, La/wvq0;->a:I

    .line 387
    .line 388
    add-int/2addr v10, v3

    .line 389
    invoke-direct {v9, v8, v10, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 390
    .line 391
    .line 392
    sget-object v8, La/wb;->t:La/ar20;

    .line 393
    .line 394
    invoke-direct {v6, v9, v8}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 395
    .line 396
    .line 397
    iget-object v8, v5, La/j910;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v8, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    invoke-virtual {v7}, La/wvq0;->a()La/wvq0;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    goto :goto_4

    .line 409
    :cond_f
    add-int/lit8 v7, p1, 0x1

    .line 410
    .line 411
    if-ne v7, v8, :cond_10

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_10
    if-eq p2, v1, :cond_11

    .line 415
    .line 416
    new-instance v7, Lkotlin/ranges/IntRange;

    .line 417
    .line 418
    invoke-direct {v7, p2, p1, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    :cond_11
    move p2, v8

    .line 425
    :goto_7
    invoke-virtual {v6}, La/wvq0;->a()La/wvq0;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    move p1, v8

    .line 430
    goto :goto_4

    .line 431
    :cond_12
    if-eq p2, v1, :cond_13

    .line 432
    .line 433
    new-instance p0, Lkotlin/ranges/IntRange;

    .line 434
    .line 435
    invoke-direct {p0, p2, p1, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    :cond_13
    invoke-virtual {v5, v2}, La/j910;->D(Ljava/util/ArrayList;)V

    .line 442
    .line 443
    .line 444
    return-object v5

    .line 445
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    new-instance p0, La/j910;

    .line 449
    .line 450
    invoke-direct {p0, v2}, La/j910;-><init>(B)V

    .line 451
    .line 452
    .line 453
    new-instance v0, Ljava/util/ArrayList;

    .line 454
    .line 455
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 456
    .line 457
    .line 458
    new-instance v2, La/xvq0;

    .line 459
    .line 460
    invoke-direct {v2, p1, p2}, La/xvq0;-><init>(La/dgu;Ljava/util/List;)V

    .line 461
    .line 462
    .line 463
    new-instance v4, La/z0x;

    .line 464
    .line 465
    invoke-direct {v4, p1, p2, v3}, La/z0x;-><init>(La/dgu;Ljava/util/List;B)V

    .line 466
    .line 467
    .line 468
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    move p2, v1

    .line 473
    move v4, p2

    .line 474
    :goto_8
    invoke-virtual {v2}, La/wvq0;->e()La/ar20;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    if-eqz v5, :cond_17

    .line 479
    .line 480
    invoke-virtual {v2}, La/wvq0;->e()La/ar20;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    sget-object v6, La/cy2;->F:La/ar20;

    .line 485
    .line 486
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v5

    .line 490
    if-eqz v5, :cond_14

    .line 491
    .line 492
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v5

    .line 496
    check-cast v5, La/qb00;

    .line 497
    .line 498
    invoke-static {v2, v5}, La/gst;->i(La/wvq0;La/qb00;)La/vr00;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    if-eqz v5, :cond_14

    .line 503
    .line 504
    iget-object v2, v5, La/vr00;->a:La/wvq0;

    .line 505
    .line 506
    invoke-virtual {v2}, La/wvq0;->a()La/wvq0;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    invoke-virtual {p0, v5}, La/j910;->E(La/vr00;)V

    .line 511
    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_14
    iget v5, v2, La/wvq0;->a:I

    .line 515
    .line 516
    add-int/lit8 v6, p2, 0x1

    .line 517
    .line 518
    if-ne v6, v5, :cond_15

    .line 519
    .line 520
    goto :goto_9

    .line 521
    :cond_15
    if-eq v4, v1, :cond_16

    .line 522
    .line 523
    new-instance v6, Lkotlin/ranges/IntRange;

    .line 524
    .line 525
    invoke-direct {v6, v4, p2, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    :cond_16
    move v4, v5

    .line 532
    :goto_9
    invoke-virtual {v2}, La/wvq0;->a()La/wvq0;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    move p2, v5

    .line 537
    goto :goto_8

    .line 538
    :cond_17
    if-eq v4, v1, :cond_18

    .line 539
    .line 540
    new-instance p1, Lkotlin/ranges/IntRange;

    .line 541
    .line 542
    invoke-direct {p1, v4, p2, v3}, Lkotlin/ranges/a;-><init>(III)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    :cond_18
    invoke-virtual {p0, v0}, La/j910;->D(Ljava/util/ArrayList;)V

    .line 549
    .line 550
    .line 551
    return-object p0

    .line 552
    nop

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
