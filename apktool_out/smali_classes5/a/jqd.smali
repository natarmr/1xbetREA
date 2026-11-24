.class public final synthetic La/jqd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r5h0;


# direct methods
.method public synthetic constructor <init>(La/r5h0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jqd;->a:B

    iput-object p1, p0, La/jqd;->b:La/r5h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/jqd;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    iget-object p0, p0, La/jqd;->b:La/r5h0;

    .line 15
    .line 16
    iget-object p0, p0, La/r5h0;->a:La/cex;

    .line 17
    .line 18
    check-cast p1, La/y5d;

    .line 19
    .line 20
    check-cast p2, La/fet;

    .line 21
    .line 22
    check-cast p3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    packed-switch v0, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 p1, p3, 0x11

    .line 35
    .line 36
    if-eq p1, v4, :cond_0

    .line 37
    .line 38
    move p1, v6

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p1, v5

    .line 41
    :goto_0
    and-int/2addr p3, v6

    .line 42
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_6

    .line 47
    .line 48
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v3, :cond_1

    .line 53
    .line 54
    sget-object p1, La/qmk;->a:La/zcl;

    .line 55
    .line 56
    const/high16 p1, 0x42000000    # 32.0f

    .line 57
    .line 58
    invoke-static {v2, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p2, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    check-cast p1, La/mm40;

    .line 66
    .line 67
    sget-object p3, La/gqw0;->e:La/zx7;

    .line 68
    .line 69
    invoke-static {p3, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-wide v2, p2, La/fet;->T:J

    .line 74
    .line 75
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, La/fet;->i0()V

    .line 93
    .line 94
    .line 95
    iget-boolean v8, p2, La/fet;->S:Z

    .line 96
    .line 97
    if-eqz v8, :cond_2

    .line 98
    .line 99
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-virtual {p2}, La/fet;->r0()V

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v8, La/gqw0;->x:La/shd;

    .line 107
    .line 108
    invoke-static {p2, v0, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    sget-object v0, La/gqw0;->w:La/shd;

    .line 112
    .line 113
    invoke-static {p2, v3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v3, La/gqw0;->y:La/shd;

    .line 121
    .line 122
    invoke-static {p2, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 126
    .line 127
    .line 128
    sget-object v2, La/gqw0;->v:La/shd;

    .line 129
    .line 130
    invoke-static {p2, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    sget-object v4, La/cex;->a:La/cex;

    .line 134
    .line 135
    if-ne p0, v4, :cond_3

    .line 136
    .line 137
    const v4, 0x2351b9cc

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v4}, La/fet;->e0(I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5, p2, v7}, La/vdx;->d(ILa/fet;La/mm40;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_3
    const v4, 0x23528fc5

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v4}, La/fet;->e0(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 157
    .line 158
    .line 159
    :goto_2
    invoke-virtual {p2, v6}, La/fet;->r(Z)V

    .line 160
    .line 161
    .line 162
    invoke-static {p3, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    iget-wide v9, p2, La/fet;->T:J

    .line 167
    .line 168
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p2}, La/fet;->i0()V

    .line 181
    .line 182
    .line 183
    iget-boolean v10, p2, La/fet;->S:Z

    .line 184
    .line 185
    if-eqz v10, :cond_4

    .line 186
    .line 187
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_4
    invoke-virtual {p2}, La/fet;->r0()V

    .line 192
    .line 193
    .line 194
    :goto_3
    invoke-static {p2, p3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    invoke-static {p2, v9, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v4, p2, v3, p2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 201
    .line 202
    .line 203
    invoke-static {p2, p1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, La/cex;->b:La/cex;

    .line 207
    .line 208
    if-ne p0, p1, :cond_5

    .line 209
    .line 210
    const p0, -0x2b53e41d

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v5, p2, v7}, La/vdx;->d(ILa/fet;La/mm40;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_5
    const p0, -0x2b530e24

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    :goto_4
    invoke-virtual {p2, v6}, La/fet;->r(Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_6
    invoke-virtual {p2}, La/fet;->X()V

    .line 237
    .line 238
    .line 239
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    and-int/lit8 p1, p3, 0x11

    .line 246
    .line 247
    if-eq p1, v4, :cond_7

    .line 248
    .line 249
    move p1, v6

    .line 250
    goto :goto_6

    .line 251
    :cond_7
    move p1, v5

    .line 252
    :goto_6
    and-int/2addr p3, v6

    .line 253
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-eqz p1, :cond_d

    .line 258
    .line 259
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    if-ne p1, v3, :cond_8

    .line 264
    .line 265
    sget-object p1, La/qmk;->a:La/zcl;

    .line 266
    .line 267
    const/high16 p1, 0x41c00000    # 24.0f

    .line 268
    .line 269
    invoke-static {v2, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p2, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_8
    check-cast p1, La/mm40;

    .line 277
    .line 278
    sget-object p3, La/gqw0;->e:La/zx7;

    .line 279
    .line 280
    invoke-static {p3, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iget-wide v2, p2, La/fet;->T:J

    .line 285
    .line 286
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 299
    .line 300
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2}, La/fet;->i0()V

    .line 304
    .line 305
    .line 306
    iget-boolean v8, p2, La/fet;->S:Z

    .line 307
    .line 308
    if-eqz v8, :cond_9

    .line 309
    .line 310
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 311
    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_9
    invoke-virtual {p2}, La/fet;->r0()V

    .line 315
    .line 316
    .line 317
    :goto_7
    sget-object v8, La/gqw0;->x:La/shd;

    .line 318
    .line 319
    invoke-static {p2, v0, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 320
    .line 321
    .line 322
    sget-object v0, La/gqw0;->w:La/shd;

    .line 323
    .line 324
    invoke-static {p2, v3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    sget-object v3, La/gqw0;->y:La/shd;

    .line 332
    .line 333
    invoke-static {p2, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 334
    .line 335
    .line 336
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 337
    .line 338
    .line 339
    sget-object v2, La/gqw0;->v:La/shd;

    .line 340
    .line 341
    invoke-static {p2, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 342
    .line 343
    .line 344
    sget-object v4, La/cex;->a:La/cex;

    .line 345
    .line 346
    if-ne p0, v4, :cond_a

    .line 347
    .line 348
    const v4, -0x73928da9

    .line 349
    .line 350
    .line 351
    invoke-virtual {p2, v4}, La/fet;->e0(I)V

    .line 352
    .line 353
    .line 354
    invoke-static {v5, p2, v7}, La/vdx;->d(ILa/fet;La/mm40;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_a
    const v4, -0x7391b7b0

    .line 362
    .line 363
    .line 364
    invoke-virtual {p2, v4}, La/fet;->e0(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 368
    .line 369
    .line 370
    :goto_8
    invoke-virtual {p2, v6}, La/fet;->r(Z)V

    .line 371
    .line 372
    .line 373
    invoke-static {p3, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 374
    .line 375
    .line 376
    move-result-object p3

    .line 377
    iget-wide v9, p2, La/fet;->T:J

    .line 378
    .line 379
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-virtual {p2}, La/fet;->i0()V

    .line 392
    .line 393
    .line 394
    iget-boolean v10, p2, La/fet;->S:Z

    .line 395
    .line 396
    if-eqz v10, :cond_b

    .line 397
    .line 398
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_b
    invoke-virtual {p2}, La/fet;->r0()V

    .line 403
    .line 404
    .line 405
    :goto_9
    invoke-static {p2, p3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 406
    .line 407
    .line 408
    invoke-static {p2, v9, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v4, p2, v3, p2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 412
    .line 413
    .line 414
    invoke-static {p2, p1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 415
    .line 416
    .line 417
    sget-object p1, La/cex;->b:La/cex;

    .line 418
    .line 419
    if-ne p0, p1, :cond_c

    .line 420
    .line 421
    const p0, -0x607d55d2

    .line 422
    .line 423
    .line 424
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 425
    .line 426
    .line 427
    invoke-static {v5, p2, v7}, La/vdx;->d(ILa/fet;La/mm40;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 431
    .line 432
    .line 433
    goto :goto_a

    .line 434
    :cond_c
    const p0, -0x607c7fd9

    .line 435
    .line 436
    .line 437
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2, v5}, La/fet;->r(Z)V

    .line 441
    .line 442
    .line 443
    :goto_a
    invoke-virtual {p2, v6}, La/fet;->r(Z)V

    .line 444
    .line 445
    .line 446
    goto :goto_b

    .line 447
    :cond_d
    invoke-virtual {p2}, La/fet;->X()V

    .line 448
    .line 449
    .line 450
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object p0

    .line 453
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
