.class public final synthetic La/kqj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kqj0;->a:B

    iput-object p1, p0, La/kqj0;->b:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/ugd;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/kqj0;->a:B

    iput-object p1, p0, La/kqj0;->b:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/kqj0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, La/kqj0;->b:La/ugd;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    and-int/lit8 v0, p2, 0x3

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    move v0, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v4

    .line 27
    :goto_0
    and-int/2addr p2, v3

    .line 28
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p0, p1, p2}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 43
    .line 44
    .line 45
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast p1, La/fet;

    .line 49
    .line 50
    check-cast p2, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    and-int/lit8 v0, p2, 0x3

    .line 57
    .line 58
    if-eq v0, v2, :cond_2

    .line 59
    .line 60
    move v0, v3

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v0, v4

    .line 63
    :goto_2
    and-int/2addr p2, v3

    .line 64
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p0, p1, p2}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 79
    .line 80
    .line 81
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_1
    check-cast p1, La/fet;

    .line 85
    .line 86
    check-cast p2, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    and-int/lit8 v0, p2, 0x3

    .line 93
    .line 94
    if-eq v0, v2, :cond_4

    .line 95
    .line 96
    move v0, v3

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    move v0, v4

    .line 99
    :goto_4
    and-int/2addr p2, v3

    .line 100
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_5

    .line 105
    .line 106
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p0, p1, p2}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 115
    .line 116
    .line 117
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_2
    check-cast p1, La/fet;

    .line 121
    .line 122
    check-cast p2, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    and-int/lit8 v0, p2, 0x3

    .line 129
    .line 130
    if-eq v0, v2, :cond_6

    .line 131
    .line 132
    move v0, v3

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    move v0, v4

    .line 135
    :goto_6
    and-int/2addr p2, v3

    .line 136
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_7

    .line 141
    .line 142
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p0, p1, p2}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 151
    .line 152
    .line 153
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_3
    check-cast p1, La/fet;

    .line 157
    .line 158
    check-cast p2, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    and-int/lit8 v0, p2, 0x3

    .line 165
    .line 166
    if-eq v0, v2, :cond_8

    .line 167
    .line 168
    move v0, v3

    .line 169
    goto :goto_8

    .line 170
    :cond_8
    move v0, v4

    .line 171
    :goto_8
    and-int/2addr p2, v3

    .line 172
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-eqz p2, :cond_9

    .line 177
    .line 178
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p0, p1, p2}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 187
    .line 188
    .line 189
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_4
    check-cast p1, La/fet;

    .line 193
    .line 194
    check-cast p2, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    and-int/lit8 v0, p2, 0x3

    .line 201
    .line 202
    if-eq v0, v2, :cond_a

    .line 203
    .line 204
    move v0, v3

    .line 205
    goto :goto_a

    .line 206
    :cond_a
    move v0, v4

    .line 207
    :goto_a
    and-int/2addr p2, v3

    .line 208
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    if-eqz p2, :cond_b

    .line 213
    .line 214
    sget-object p2, La/jm40;->b:La/jm40;

    .line 215
    .line 216
    invoke-static {p2}, La/o050;->W(La/mm40;)La/mm40;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    sget-object p2, La/qmk;->a:La/zcl;

    .line 221
    .line 222
    const/high16 v9, 0x41000000    # 8.0f

    .line 223
    .line 224
    const/4 v10, 0x7

    .line 225
    const/4 v6, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {p0, p2, p1, v0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto :goto_b

    .line 240
    :cond_b
    invoke-virtual {p1}, La/fet;->X()V

    .line 241
    .line 242
    .line 243
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_5
    check-cast p1, La/fet;

    .line 247
    .line 248
    check-cast p2, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v1}, La/x8x;->L(I)I

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    invoke-static {p0, p1, p2}, La/pzp0;->a(La/ugd;La/fet;I)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_6
    check-cast p1, La/fet;

    .line 264
    .line 265
    check-cast p2, Ljava/lang/Integer;

    .line 266
    .line 267
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v1}, La/x8x;->L(I)I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    invoke-static {p0, p1, p2}, La/pzp0;->b(La/ugd;La/fet;I)V

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_7
    check-cast p1, La/c5n0;

    .line 281
    .line 282
    check-cast p2, La/p4e;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    const-string v0, "shimmerItem"

    .line 288
    .line 289
    invoke-interface {p1, v0, p0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, La/pj30;

    .line 298
    .line 299
    iget-wide v5, p2, La/p4e;->a:J

    .line 300
    .line 301
    const/4 v10, 0x0

    .line 302
    const/16 v11, 0xb

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const/4 v8, 0x0

    .line 306
    const/4 v9, 0x0

    .line 307
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 308
    .line 309
    .line 310
    move-result-wide v1

    .line 311
    invoke-interface {v0, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    iget v0, v0, La/pu90;->b:I

    .line 316
    .line 317
    iget-wide v1, p2, La/p4e;->a:J

    .line 318
    .line 319
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 320
    .line 321
    .line 322
    move-result p2

    .line 323
    int-to-double v5, p2

    .line 324
    int-to-double v7, v0

    .line 325
    div-double/2addr v5, v7

    .line 326
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 327
    .line 328
    .line 329
    move-result-wide v5

    .line 330
    double-to-int p2, v5

    .line 331
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object p2

    .line 335
    if-lez v0, :cond_c

    .line 336
    .line 337
    goto :goto_c

    .line 338
    :cond_c
    const/4 p2, 0x0

    .line 339
    :goto_c
    if-eqz p2, :cond_d

    .line 340
    .line 341
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 342
    .line 343
    .line 344
    move-result p2

    .line 345
    goto :goto_d

    .line 346
    :cond_d
    move p2, v4

    .line 347
    :goto_d
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    const/4 v10, 0x1

    .line 352
    if-ltz v3, :cond_e

    .line 353
    .line 354
    move v5, v10

    .line 355
    goto :goto_e

    .line 356
    :cond_e
    move v5, v4

    .line 357
    :goto_e
    if-ltz v0, :cond_f

    .line 358
    .line 359
    move v6, v10

    .line 360
    goto :goto_f

    .line 361
    :cond_f
    move v6, v4

    .line 362
    :goto_f
    and-int/2addr v5, v6

    .line 363
    if-nez v5, :cond_10

    .line 364
    .line 365
    const-string v5, "width and height must be >= 0"

    .line 366
    .line 367
    invoke-static {v5}, La/zcx;->a(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    :cond_10
    invoke-static {v3, v3, v0, v0}, La/r4e;->h(IIII)J

    .line 371
    .line 372
    .line 373
    move-result-wide v6

    .line 374
    new-instance v8, Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-direct {v8, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 377
    .line 378
    .line 379
    move v9, v4

    .line 380
    :goto_10
    if-ge v9, p2, :cond_11

    .line 381
    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    const-string v3, "shimmer_"

    .line 385
    .line 386
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-interface {p1, v0, p0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    move-object v5, v0

    .line 405
    check-cast v5, La/pj30;

    .line 406
    .line 407
    invoke-static/range {v5 .. v10}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    goto :goto_10

    .line 412
    :cond_11
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 413
    .line 414
    .line 415
    move-result p0

    .line 416
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    new-instance v0, La/uy2;

    .line 421
    .line 422
    const/16 v1, 0xf

    .line 423
    .line 424
    invoke-direct {v0, v8, v1}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 425
    .line 426
    .line 427
    invoke-static {p1, p0, p2, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    return-object p0

    .line 432
    nop

    .line 433
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
