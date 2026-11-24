.class public final synthetic La/x6a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j4n;

.field public final synthetic c:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/j4n;La/mm40;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/x6a0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x6a0;->b:La/j4n;

    iput-object p2, p0, La/x6a0;->c:La/mm40;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/j4n;I)V
    .locals 0

    .line 2
    const/4 p3, 0x0

    iput-byte p3, p0, La/x6a0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x6a0;->c:La/mm40;

    iput-object p2, p0, La/x6a0;->b:La/j4n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/x6a0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/x6a0;->c:La/mm40;

    .line 5
    .line 6
    iget-object p0, p0, La/x6a0;->b:La/j4n;

    .line 7
    .line 8
    check-cast p1, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v0, v4, :cond_0

    .line 24
    .line 25
    move v0, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v3

    .line 28
    :goto_0
    and-int/2addr p2, v1

    .line 29
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_13

    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v5, 0x0

    .line 44
    sget-object v6, La/e4n;->a:La/e4n;

    .line 45
    .line 46
    const/high16 v7, 0x41000000    # 8.0f

    .line 47
    .line 48
    const/high16 v8, 0x40c00000    # 6.0f

    .line 49
    .line 50
    if-nez p2, :cond_1

    .line 51
    .line 52
    sget-object p2, La/ukd;->a:La/cl5;

    .line 53
    .line 54
    if-ne v0, p2, :cond_6

    .line 55
    .line 56
    :cond_1
    sget-object p2, La/f4n;->a:La/f4n;

    .line 57
    .line 58
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    sget-object p2, La/qmk;->a:La/zcl;

    .line 65
    .line 66
    move p2, v8

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    sget-object p2, La/g4n;->a:La/g4n;

    .line 69
    .line 70
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    sget-object p2, La/qmk;->a:La/zcl;

    .line 77
    .line 78
    :goto_1
    move p2, v7

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    sget-object p2, La/h4n;->a:La/h4n;

    .line 81
    .line 82
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_4

    .line 87
    .line 88
    sget-object p2, La/qmk;->a:La/zcl;

    .line 89
    .line 90
    const/high16 p2, 0x40000000    # 2.0f

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    sget-object p2, La/i4n;->a:La/i4n;

    .line 94
    .line 95
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    sget-object p2, La/qmk;->a:La/zcl;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {p0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_12

    .line 109
    .line 110
    sget-object p2, La/qmk;->a:La/zcl;

    .line 111
    .line 112
    const/high16 p2, 0x40800000    # 4.0f

    .line 113
    .line 114
    :goto_2
    invoke-static {p2, p1}, La/twn;->j(FLa/fet;)La/ycl;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :cond_6
    check-cast v0, La/ycl;

    .line 119
    .line 120
    iget p2, v0, La/ycl;->a:F

    .line 121
    .line 122
    new-instance v0, La/qw3;

    .line 123
    .line 124
    new-instance v9, La/jf4;

    .line 125
    .line 126
    const/16 v10, 0xe

    .line 127
    .line 128
    invoke-direct {v9, v10}, La/jf4;-><init>(B)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, p2, v1, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 132
    .line 133
    .line 134
    sget-object p2, La/gqw0;->j:La/yx7;

    .line 135
    .line 136
    invoke-static {v0, p2, p1, v3}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iget-wide v9, p1, La/fet;->T:J

    .line 141
    .line 142
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 155
    .line 156
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, La/fet;->i0()V

    .line 160
    .line 161
    .line 162
    iget-boolean v10, p1, La/fet;->S:Z

    .line 163
    .line 164
    if-eqz v10, :cond_7

    .line 165
    .line 166
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 167
    .line 168
    invoke-virtual {p1, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    invoke-virtual {p1}, La/fet;->r0()V

    .line 173
    .line 174
    .line 175
    :goto_3
    sget-object v10, La/gqw0;->x:La/shd;

    .line 176
    .line 177
    invoke-static {p1, p2, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    sget-object p2, La/gqw0;->w:La/shd;

    .line 181
    .line 182
    invoke-static {p1, v9, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    sget-object v0, La/gqw0;->y:La/shd;

    .line 190
    .line 191
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 195
    .line 196
    .line 197
    sget-object p2, La/gqw0;->v:La/shd;

    .line 198
    .line 199
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    const p2, 0x1f91a134

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 206
    .line 207
    .line 208
    move p2, v3

    .line 209
    :goto_4
    const/4 v0, 0x3

    .line 210
    if-ge p2, v0, :cond_11

    .line 211
    .line 212
    instance-of v0, p0, La/f4n;

    .line 213
    .line 214
    const/high16 v2, 0x3f800000    # 1.0f

    .line 215
    .line 216
    sget-object v9, La/jm40;->b:La/jm40;

    .line 217
    .line 218
    sget-object v10, La/zhg0;->a:La/zhg0;

    .line 219
    .line 220
    if-eqz v0, :cond_8

    .line 221
    .line 222
    const v0, 0x40c52f3

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v2, v9, v1}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    sget-object v2, La/qmk;->a:La/zcl;

    .line 233
    .line 234
    const/high16 v2, 0x42200000    # 40.0f

    .line 235
    .line 236
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sget-object v2, La/qmk;->h:La/zcl;

    .line 241
    .line 242
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 243
    .line 244
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-static {v5, p1, v3, v1}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :goto_5
    invoke-static {v0, v2, p1, v3, v3}, La/dw9;->x(La/mm40;La/fqj0;La/fet;IZ)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_9

    .line 256
    .line 257
    :cond_8
    instance-of v0, p0, La/g4n;

    .line 258
    .line 259
    const/high16 v11, 0x42100000    # 36.0f

    .line 260
    .line 261
    const/4 v12, 0x0

    .line 262
    if-eqz v0, :cond_9

    .line 263
    .line 264
    const v0, 0x4131f30

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v10, v2, v9, v1}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    sget-object v2, La/qmk;->a:La/zcl;

    .line 275
    .line 276
    invoke-static {v0, v12, v8, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-static {v0, v11}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    sget-object v2, La/qmk;->f:La/zcl;

    .line 285
    .line 286
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 287
    .line 288
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v5, p1, v3, v1}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    goto :goto_5

    .line 297
    :cond_9
    instance-of v0, p0, La/h4n;

    .line 298
    .line 299
    if-eqz v0, :cond_e

    .line 300
    .line 301
    const v0, 0x41b3b76

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v10, v2, v9, v1}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sget-object v2, La/qmk;->a:La/zcl;

    .line 312
    .line 313
    invoke-static {v0, v12, v8, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0, v11}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const/high16 v2, 0x41400000    # 12.0f

    .line 322
    .line 323
    if-nez p2, :cond_a

    .line 324
    .line 325
    move v9, v2

    .line 326
    goto :goto_6

    .line 327
    :cond_a
    move v9, v12

    .line 328
    :goto_6
    if-ne p2, v4, :cond_b

    .line 329
    .line 330
    move v10, v2

    .line 331
    goto :goto_7

    .line 332
    :cond_b
    move v10, v12

    .line 333
    :goto_7
    if-ne p2, v4, :cond_c

    .line 334
    .line 335
    move v11, v2

    .line 336
    goto :goto_8

    .line 337
    :cond_c
    move v11, v12

    .line 338
    :goto_8
    if-nez p2, :cond_d

    .line 339
    .line 340
    move v12, v2

    .line 341
    :cond_d
    invoke-static {v9, v10, v11, v12}, La/vgg0;->b(FFFF)La/ugg0;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-static {v0, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v5, p1, v3, v1}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    goto :goto_5

    .line 354
    :cond_e
    instance-of v0, p0, La/i4n;

    .line 355
    .line 356
    if-eqz v0, :cond_f

    .line 357
    .line 358
    const v0, 0x42ae6d0

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10, v2, v9, v1}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    sget-object v2, La/qmk;->a:La/zcl;

    .line 369
    .line 370
    invoke-static {v0, v12, v8, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0, v11}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    sget-object v2, La/qmk;->h:La/zcl;

    .line 379
    .line 380
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 381
    .line 382
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v5, p1, v3, v1}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    goto/16 :goto_5

    .line 391
    .line 392
    :cond_f
    invoke-static {p0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_10

    .line 397
    .line 398
    const v0, 0x432ba11

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v10, v2, v9, v1}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    sget-object v2, La/qmk;->a:La/zcl;

    .line 409
    .line 410
    invoke-static {v0, v12, v7, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const/high16 v2, 0x41c00000    # 24.0f

    .line 415
    .line 416
    invoke-static {v0, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    sget-object v2, La/qmk;->e:La/zcl;

    .line 421
    .line 422
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 423
    .line 424
    invoke-static {v2, v2, v2, v2, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v5, p1, v3, v1}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    goto/16 :goto_5

    .line 433
    .line 434
    :goto_9
    add-int/lit8 p2, p2, 0x1

    .line 435
    .line 436
    goto/16 :goto_4

    .line 437
    .line 438
    :cond_10
    const p0, -0x316af521

    .line 439
    .line 440
    .line 441
    invoke-static {p0, p1, v3}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    throw p0

    .line 446
    :cond_11
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {p1, v1}, La/fet;->r(Z)V

    .line 450
    .line 451
    .line 452
    goto :goto_a

    .line 453
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 454
    .line 455
    .line 456
    goto :goto_b

    .line 457
    :cond_13
    invoke-virtual {p1}, La/fet;->X()V

    .line 458
    .line 459
    .line 460
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    :goto_b
    return-object v5

    .line 463
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-static {v1}, La/x8x;->L(I)I

    .line 467
    .line 468
    .line 469
    move-result p2

    .line 470
    invoke-static {v2, p0, p1, p2}, La/b8k0;->l(La/mm40;La/j4n;La/fet;I)V

    .line 471
    .line 472
    .line 473
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object p0

    .line 476
    nop

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
