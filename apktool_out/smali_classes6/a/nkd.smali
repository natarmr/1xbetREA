.class public final synthetic La/nkd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:La/ugd;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nkd;->a:B

    iput-object p1, p0, La/nkd;->b:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, La/nkd;->c:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/nkd;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/nkd;->c:La/ugd;

    .line 11
    .line 12
    iget-object p0, p0, La/nkd;->b:Lkotlin/jvm/functions/Function2;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, La/fet;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    and-int/lit8 v8, p2, 0x3

    .line 31
    .line 32
    if-eq v8, v4, :cond_0

    .line 33
    .line 34
    move v4, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v4, v7

    .line 37
    :goto_0
    and-int/2addr p2, v5

    .line 38
    invoke-virtual {p1, p2, v4}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    if-nez p0, :cond_1

    .line 45
    .line 46
    const p0, -0x1851fed9

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    const p2, -0x1851fed8

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/vhv0;

    .line 67
    .line 68
    invoke-static {v2, p0}, La/j120;->k0(La/mm40;La/vhv0;)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 73
    .line 74
    invoke-static {p2, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iget-wide v2, p1, La/fet;->T:J

    .line 79
    .line 80
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {p1, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, La/fet;->i0()V

    .line 98
    .line 99
    .line 100
    iget-boolean v4, p1, La/fet;->S:Z

    .line 101
    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-object v1, La/gqw0;->x:La/shd;

    .line 112
    .line 113
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    sget-object p2, La/gqw0;->w:La/shd;

    .line 117
    .line 118
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    sget-object v1, La/gqw0;->y:La/shd;

    .line 126
    .line 127
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 131
    .line 132
    .line 133
    sget-object p2, La/gqw0;->v:La/shd;

    .line 134
    .line 135
    invoke-static {p1, p0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 145
    .line 146
    .line 147
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_2
    if-nez v3, :cond_3

    .line 150
    .line 151
    const p0, -0x7465a955

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :goto_3
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_3
    const p0, -0x7465bec4

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 172
    .line 173
    .line 174
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_0
    move-object v3, p1

    .line 178
    check-cast v3, La/fet;

    .line 179
    .line 180
    check-cast p2, Ljava/lang/Integer;

    .line 181
    .line 182
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    and-int/lit8 p2, p1, 0x3

    .line 187
    .line 188
    if-eq p2, v4, :cond_5

    .line 189
    .line 190
    move p2, v5

    .line 191
    goto :goto_5

    .line 192
    :cond_5
    move p2, v7

    .line 193
    :goto_5
    and-int/2addr p1, v5

    .line 194
    invoke-virtual {v3, p1, p2}, La/fet;->U(IZ)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_6

    .line 199
    .line 200
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 201
    .line 202
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {}, La/s6t0;->c()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    new-instance p1, La/nkd;

    .line 211
    .line 212
    invoke-direct {p1, p0, v6, v7}, La/nkd;-><init>(Lkotlin/jvm/functions/Function2;La/ugd;B)V

    .line 213
    .line 214
    .line 215
    const p0, -0x7c1bf9f1

    .line 216
    .line 217
    .line 218
    invoke-static {p0, p1, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const/16 v4, 0x180

    .line 223
    .line 224
    const/4 v5, 0x0

    .line 225
    invoke-static/range {v0 .. v5}, La/dem0;->e(La/taq0;ZLa/ugd;La/fet;II)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_6
    invoke-virtual {v3}, La/fet;->X()V

    .line 230
    .line 231
    .line 232
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_1
    move-object v3, p1

    .line 236
    check-cast v3, La/fet;

    .line 237
    .line 238
    check-cast p2, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    and-int/lit8 p2, p1, 0x3

    .line 245
    .line 246
    if-eq p2, v4, :cond_7

    .line 247
    .line 248
    move v7, v5

    .line 249
    :cond_7
    and-int/2addr p1, v5

    .line 250
    invoke-virtual {v3, p1, v7}, La/fet;->U(IZ)Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_8

    .line 255
    .line 256
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 257
    .line 258
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {}, La/s6t0;->c()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    new-instance p1, La/nkd;

    .line 267
    .line 268
    const/4 p2, 0x3

    .line 269
    invoke-direct {p1, p0, v6, p2}, La/nkd;-><init>(Lkotlin/jvm/functions/Function2;La/ugd;B)V

    .line 270
    .line 271
    .line 272
    const p0, 0x2b911383

    .line 273
    .line 274
    .line 275
    invoke-static {p0, p1, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    const/16 v4, 0x180

    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    invoke-static/range {v0 .. v5}, La/dem0;->e(La/taq0;ZLa/ugd;La/fet;II)V

    .line 283
    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_8
    invoke-virtual {v3}, La/fet;->X()V

    .line 287
    .line 288
    .line 289
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_2
    check-cast p1, La/fet;

    .line 293
    .line 294
    check-cast p2, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    and-int/lit8 v8, p2, 0x3

    .line 305
    .line 306
    if-eq v8, v4, :cond_9

    .line 307
    .line 308
    move v4, v5

    .line 309
    goto :goto_8

    .line 310
    :cond_9
    move v4, v7

    .line 311
    :goto_8
    and-int/2addr p2, v5

    .line 312
    invoke-virtual {p1, p2, v4}, La/fet;->U(IZ)Z

    .line 313
    .line 314
    .line 315
    move-result p2

    .line 316
    if-eqz p2, :cond_d

    .line 317
    .line 318
    if-nez p0, :cond_a

    .line 319
    .line 320
    const p0, 0x445d731b

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 327
    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_a
    const p2, 0x445d731c

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 334
    .line 335
    .line 336
    invoke-interface {p0, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    check-cast p0, La/vhv0;

    .line 341
    .line 342
    invoke-static {v2, p0}, La/j120;->k0(La/mm40;La/vhv0;)La/mm40;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 347
    .line 348
    invoke-static {p2, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    iget-wide v2, p1, La/fet;->T:J

    .line 353
    .line 354
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-static {p1, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 367
    .line 368
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, La/fet;->i0()V

    .line 372
    .line 373
    .line 374
    iget-boolean v4, p1, La/fet;->S:Z

    .line 375
    .line 376
    if-eqz v4, :cond_b

    .line 377
    .line 378
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 379
    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_b
    invoke-virtual {p1}, La/fet;->r0()V

    .line 383
    .line 384
    .line 385
    :goto_9
    sget-object v1, La/gqw0;->x:La/shd;

    .line 386
    .line 387
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 388
    .line 389
    .line 390
    sget-object p2, La/gqw0;->w:La/shd;

    .line 391
    .line 392
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object p2

    .line 399
    sget-object v1, La/gqw0;->y:La/shd;

    .line 400
    .line 401
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 405
    .line 406
    .line 407
    sget-object p2, La/gqw0;->v:La/shd;

    .line 408
    .line 409
    invoke-static {p1, p0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 419
    .line 420
    .line 421
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    :goto_a
    if-nez v3, :cond_c

    .line 424
    .line 425
    const p0, 0x1afad637

    .line 426
    .line 427
    .line 428
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    :goto_b
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 435
    .line 436
    .line 437
    goto :goto_c

    .line 438
    :cond_c
    const p0, 0x1afac0c8

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 442
    .line 443
    .line 444
    goto :goto_b

    .line 445
    :cond_d
    invoke-virtual {p1}, La/fet;->X()V

    .line 446
    .line 447
    .line 448
    :goto_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object p0

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
