.class public final La/e1h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e1h0;->a:B

    iput-object p1, p0, La/e1h0;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/e1h0;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    iget-object p0, p0, La/e1h0;->b:Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/fet;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    and-int/2addr p2, v5

    .line 31
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_4

    .line 36
    .line 37
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 38
    .line 39
    invoke-static {p2, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, La/fet;->i0()V

    .line 61
    .line 62
    .line 63
    iget-boolean v6, p1, La/fet;->S:Z

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 72
    .line 73
    .line 74
    :goto_1
    sget-object v1, La/gqw0;->x:La/shd;

    .line 75
    .line 76
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, La/gqw0;->w:La/shd;

    .line 80
    .line 81
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    sget-object p2, La/gqw0;->y:La/shd;

    .line 85
    .line 86
    iget-boolean v1, p1, La/fet;->S:Z

    .line 87
    .line 88
    if-nez v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_3

    .line 103
    .line 104
    :cond_2
    invoke-static {v0, p1, v0, p2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    sget-object p2, La/gqw0;->v:La/shd;

    .line 108
    .line 109
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4, p1, p0, v5}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 117
    .line 118
    .line 119
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_0
    check-cast p1, La/fet;

    .line 123
    .line 124
    check-cast p2, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    and-int/lit8 v0, p2, 0x3

    .line 131
    .line 132
    if-eq v0, v3, :cond_5

    .line 133
    .line 134
    move v0, v5

    .line 135
    goto :goto_3

    .line 136
    :cond_5
    move v0, v4

    .line 137
    :goto_3
    and-int/2addr p2, v5

    .line 138
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_9

    .line 143
    .line 144
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 145
    .line 146
    invoke-static {p2, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 163
    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, La/fet;->i0()V

    .line 168
    .line 169
    .line 170
    iget-boolean v6, p1, La/fet;->S:Z

    .line 171
    .line 172
    if-eqz v6, :cond_6

    .line 173
    .line 174
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    invoke-virtual {p1}, La/fet;->r0()V

    .line 179
    .line 180
    .line 181
    :goto_4
    sget-object v1, La/gqw0;->x:La/shd;

    .line 182
    .line 183
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    sget-object p2, La/gqw0;->w:La/shd;

    .line 187
    .line 188
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    sget-object p2, La/gqw0;->y:La/shd;

    .line 192
    .line 193
    iget-boolean v1, p1, La/fet;->S:Z

    .line 194
    .line 195
    if-nez v1, :cond_7

    .line 196
    .line 197
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-nez v1, :cond_8

    .line 210
    .line 211
    :cond_7
    invoke-static {v0, p1, v0, p2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    sget-object p2, La/gqw0;->v:La/shd;

    .line 215
    .line 216
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v4, p1, p0, v5}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_1
    check-cast p1, La/fet;

    .line 230
    .line 231
    check-cast p2, Ljava/lang/Number;

    .line 232
    .line 233
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    and-int/lit8 v0, p2, 0x3

    .line 238
    .line 239
    if-eq v0, v3, :cond_a

    .line 240
    .line 241
    move v0, v5

    .line 242
    goto :goto_6

    .line 243
    :cond_a
    move v0, v4

    .line 244
    :goto_6
    and-int/2addr p2, v5

    .line 245
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    if-eqz p2, :cond_e

    .line 250
    .line 251
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 252
    .line 253
    invoke-static {p2, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 270
    .line 271
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, La/fet;->i0()V

    .line 275
    .line 276
    .line 277
    iget-boolean v6, p1, La/fet;->S:Z

    .line 278
    .line 279
    if-eqz v6, :cond_b

    .line 280
    .line 281
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 282
    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_b
    invoke-virtual {p1}, La/fet;->r0()V

    .line 286
    .line 287
    .line 288
    :goto_7
    sget-object v1, La/gqw0;->x:La/shd;

    .line 289
    .line 290
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    sget-object p2, La/gqw0;->w:La/shd;

    .line 294
    .line 295
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 296
    .line 297
    .line 298
    sget-object p2, La/gqw0;->y:La/shd;

    .line 299
    .line 300
    iget-boolean v1, p1, La/fet;->S:Z

    .line 301
    .line 302
    if-nez v1, :cond_c

    .line 303
    .line 304
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-nez v1, :cond_d

    .line 317
    .line 318
    :cond_c
    invoke-static {v0, p1, v0, p2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 319
    .line 320
    .line 321
    :cond_d
    sget-object p2, La/gqw0;->v:La/shd;

    .line 322
    .line 323
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    invoke-static {v4, p1, p0, v5}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_e
    invoke-virtual {p1}, La/fet;->X()V

    .line 331
    .line 332
    .line 333
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_2
    check-cast p1, La/fet;

    .line 337
    .line 338
    check-cast p2, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    and-int/lit8 v0, p2, 0x3

    .line 345
    .line 346
    if-eq v0, v3, :cond_f

    .line 347
    .line 348
    move v0, v5

    .line 349
    goto :goto_9

    .line 350
    :cond_f
    move v0, v4

    .line 351
    :goto_9
    and-int/2addr p2, v5

    .line 352
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    if-eqz p2, :cond_13

    .line 357
    .line 358
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 359
    .line 360
    invoke-static {p2, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 377
    .line 378
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1}, La/fet;->i0()V

    .line 382
    .line 383
    .line 384
    iget-boolean v6, p1, La/fet;->S:Z

    .line 385
    .line 386
    if-eqz v6, :cond_10

    .line 387
    .line 388
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 389
    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_10
    invoke-virtual {p1}, La/fet;->r0()V

    .line 393
    .line 394
    .line 395
    :goto_a
    sget-object v1, La/gqw0;->x:La/shd;

    .line 396
    .line 397
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 398
    .line 399
    .line 400
    sget-object p2, La/gqw0;->w:La/shd;

    .line 401
    .line 402
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 403
    .line 404
    .line 405
    sget-object p2, La/gqw0;->y:La/shd;

    .line 406
    .line 407
    iget-boolean v1, p1, La/fet;->S:Z

    .line 408
    .line 409
    if-nez v1, :cond_11

    .line 410
    .line 411
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-nez v1, :cond_12

    .line 424
    .line 425
    :cond_11
    invoke-static {v0, p1, v0, p2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 426
    .line 427
    .line 428
    :cond_12
    sget-object p2, La/gqw0;->v:La/shd;

    .line 429
    .line 430
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 431
    .line 432
    .line 433
    invoke-static {v4, p1, p0, v5}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 434
    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_13
    invoke-virtual {p1}, La/fet;->X()V

    .line 438
    .line 439
    .line 440
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object p0

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
