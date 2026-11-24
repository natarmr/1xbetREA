.class public final synthetic La/hgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/xdr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hgx;->a:B

    iput-object p1, p0, La/hgx;->b:La/xdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/hgx;->a:B

    .line 2
    .line 3
    const/16 v1, 0x482

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x80

    .line 7
    .line 8
    const/16 v4, 0x100

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object p0, p0, La/hgx;->b:La/xdr;

    .line 14
    .line 15
    check-cast p1, La/ygx;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast p3, La/mm40;

    .line 26
    .line 27
    check-cast p4, La/fet;

    .line 28
    .line 29
    check-cast p5, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 p5, p2, 0x6

    .line 42
    .line 43
    if-nez p5, :cond_2

    .line 44
    .line 45
    and-int/lit8 p5, p2, 0x8

    .line 46
    .line 47
    if-nez p5, :cond_0

    .line 48
    .line 49
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p5

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p4, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p5

    .line 58
    :goto_0
    if-eqz p5, :cond_1

    .line 59
    .line 60
    move v5, v6

    .line 61
    :cond_1
    or-int p5, p2, v5

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move p5, p2

    .line 65
    :goto_1
    and-int/lit16 p2, p2, 0x180

    .line 66
    .line 67
    if-nez p2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    move v3, v4

    .line 76
    :cond_3
    or-int/2addr p5, v3

    .line 77
    :cond_4
    and-int/lit16 p2, p5, 0x483

    .line 78
    .line 79
    if-eq p2, v1, :cond_5

    .line 80
    .line 81
    move v2, v7

    .line 82
    :cond_5
    and-int/lit8 p2, p5, 0x1

    .line 83
    .line 84
    invoke-virtual {p4, p2, v2}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_6

    .line 89
    .line 90
    shr-int/lit8 p2, p5, 0x6

    .line 91
    .line 92
    and-int/lit8 p2, p2, 0xe

    .line 93
    .line 94
    shl-int/lit8 p5, p5, 0x3

    .line 95
    .line 96
    and-int/lit8 p5, p5, 0x70

    .line 97
    .line 98
    or-int/2addr p2, p5

    .line 99
    invoke-static {p3, p1, p0, p4, p2}, La/pzw;->g(La/mm40;La/ygx;La/xdr;La/fet;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-virtual {p4}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    check-cast p3, La/mm40;

    .line 113
    .line 114
    check-cast p4, La/fet;

    .line 115
    .line 116
    check-cast p5, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    and-int/lit8 p5, p2, 0x6

    .line 129
    .line 130
    if-nez p5, :cond_9

    .line 131
    .line 132
    and-int/lit8 p5, p2, 0x8

    .line 133
    .line 134
    if-nez p5, :cond_7

    .line 135
    .line 136
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p5

    .line 140
    goto :goto_3

    .line 141
    :cond_7
    invoke-virtual {p4, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p5

    .line 145
    :goto_3
    if-eqz p5, :cond_8

    .line 146
    .line 147
    move v5, v6

    .line 148
    :cond_8
    or-int p5, p2, v5

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    move p5, p2

    .line 152
    :goto_4
    and-int/lit16 p2, p2, 0x180

    .line 153
    .line 154
    if-nez p2, :cond_b

    .line 155
    .line 156
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-eqz p2, :cond_a

    .line 161
    .line 162
    move v3, v4

    .line 163
    :cond_a
    or-int/2addr p5, v3

    .line 164
    :cond_b
    and-int/lit16 p2, p5, 0x483

    .line 165
    .line 166
    if-eq p2, v1, :cond_c

    .line 167
    .line 168
    move v2, v7

    .line 169
    :cond_c
    and-int/lit8 p2, p5, 0x1

    .line 170
    .line 171
    invoke-virtual {p4, p2, v2}, La/fet;->U(IZ)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_d

    .line 176
    .line 177
    shr-int/lit8 p2, p5, 0x6

    .line 178
    .line 179
    and-int/lit8 p2, p2, 0xe

    .line 180
    .line 181
    shl-int/lit8 p5, p5, 0x3

    .line 182
    .line 183
    and-int/lit8 p5, p5, 0x70

    .line 184
    .line 185
    or-int/2addr p2, p5

    .line 186
    invoke-static {p3, p1, p0, p4, p2}, La/piz;->e(La/mm40;La/ygx;La/xdr;La/fet;I)V

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_d
    invoke-virtual {p4}, La/fet;->X()V

    .line 191
    .line 192
    .line 193
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    check-cast p3, La/mm40;

    .line 200
    .line 201
    check-cast p4, La/fet;

    .line 202
    .line 203
    check-cast p5, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    and-int/lit8 p5, p2, 0x6

    .line 216
    .line 217
    if-nez p5, :cond_10

    .line 218
    .line 219
    and-int/lit8 p5, p2, 0x8

    .line 220
    .line 221
    if-nez p5, :cond_e

    .line 222
    .line 223
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p5

    .line 227
    goto :goto_6

    .line 228
    :cond_e
    invoke-virtual {p4, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p5

    .line 232
    :goto_6
    if-eqz p5, :cond_f

    .line 233
    .line 234
    move v5, v6

    .line 235
    :cond_f
    or-int p5, p2, v5

    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_10
    move p5, p2

    .line 239
    :goto_7
    and-int/lit16 p2, p2, 0x180

    .line 240
    .line 241
    if-nez p2, :cond_12

    .line 242
    .line 243
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    if-eqz p2, :cond_11

    .line 248
    .line 249
    move v3, v4

    .line 250
    :cond_11
    or-int/2addr p5, v3

    .line 251
    :cond_12
    and-int/lit16 p2, p5, 0x483

    .line 252
    .line 253
    if-eq p2, v1, :cond_13

    .line 254
    .line 255
    move v2, v7

    .line 256
    :cond_13
    and-int/lit8 p2, p5, 0x1

    .line 257
    .line 258
    invoke-virtual {p4, p2, v2}, La/fet;->U(IZ)Z

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    if-eqz p2, :cond_15

    .line 263
    .line 264
    iget-boolean p2, p1, La/ygx;->e:Z

    .line 265
    .line 266
    if-eqz p2, :cond_14

    .line 267
    .line 268
    sget-object p2, La/qmk;->i:La/zcl;

    .line 269
    .line 270
    sget-object v0, La/qmk;->a:La/zcl;

    .line 271
    .line 272
    new-instance v1, La/ugg0;

    .line 273
    .line 274
    invoke-direct {v1, p2, p2, v0, v0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 275
    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_14
    sget-object p2, La/qmk;->i:La/zcl;

    .line 279
    .line 280
    sget-object v0, La/vgg0;->a:La/ugg0;

    .line 281
    .line 282
    new-instance v1, La/ugg0;

    .line 283
    .line 284
    invoke-direct {v1, p2, p2, p2, p2}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 285
    .line 286
    .line 287
    :goto_8
    invoke-static {p3, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    shl-int/lit8 p3, p5, 0x3

    .line 292
    .line 293
    and-int/lit8 p3, p3, 0x70

    .line 294
    .line 295
    invoke-static {p2, p1, p0, p4, p3}, La/piz;->e(La/mm40;La/ygx;La/xdr;La/fet;I)V

    .line 296
    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_15
    invoke-virtual {p4}, La/fet;->X()V

    .line 300
    .line 301
    .line 302
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result p2

    .line 309
    check-cast p3, La/mm40;

    .line 310
    .line 311
    check-cast p4, La/fet;

    .line 312
    .line 313
    check-cast p5, Ljava/lang/Integer;

    .line 314
    .line 315
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result p5

    .line 319
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    and-int/lit8 v0, p5, 0x6

    .line 326
    .line 327
    if-nez v0, :cond_18

    .line 328
    .line 329
    and-int/lit8 v0, p5, 0x8

    .line 330
    .line 331
    if-nez v0, :cond_16

    .line 332
    .line 333
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    goto :goto_a

    .line 338
    :cond_16
    invoke-virtual {p4, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    :goto_a
    if-eqz v0, :cond_17

    .line 343
    .line 344
    move v5, v6

    .line 345
    :cond_17
    or-int v0, p5, v5

    .line 346
    .line 347
    goto :goto_b

    .line 348
    :cond_18
    move v0, p5

    .line 349
    :goto_b
    and-int/lit8 v1, p5, 0x30

    .line 350
    .line 351
    if-nez v1, :cond_1a

    .line 352
    .line 353
    invoke-virtual {p4, p2}, La/fet;->e(I)Z

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    if-eqz v1, :cond_19

    .line 358
    .line 359
    const/16 v1, 0x20

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_19
    const/16 v1, 0x10

    .line 363
    .line 364
    :goto_c
    or-int/2addr v0, v1

    .line 365
    :cond_1a
    and-int/lit16 p5, p5, 0x180

    .line 366
    .line 367
    if-nez p5, :cond_1c

    .line 368
    .line 369
    invoke-virtual {p4, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result p5

    .line 373
    if-eqz p5, :cond_1b

    .line 374
    .line 375
    move v3, v4

    .line 376
    :cond_1b
    or-int/2addr v0, v3

    .line 377
    :cond_1c
    and-int/lit16 p5, v0, 0x493

    .line 378
    .line 379
    const/16 v1, 0x492

    .line 380
    .line 381
    if-eq p5, v1, :cond_1d

    .line 382
    .line 383
    move v2, v7

    .line 384
    :cond_1d
    and-int/lit8 p5, v0, 0x1

    .line 385
    .line 386
    invoke-virtual {p4, p5, v2}, La/fet;->U(IZ)Z

    .line 387
    .line 388
    .line 389
    move-result p5

    .line 390
    if-eqz p5, :cond_1f

    .line 391
    .line 392
    if-nez p2, :cond_1e

    .line 393
    .line 394
    sget-object p2, La/qmk;->a:La/zcl;

    .line 395
    .line 396
    const/high16 p2, 0x41000000    # 8.0f

    .line 397
    .line 398
    :goto_d
    move v3, p2

    .line 399
    goto :goto_e

    .line 400
    :cond_1e
    sget-object p2, La/qmk;->a:La/zcl;

    .line 401
    .line 402
    const/4 p2, 0x0

    .line 403
    goto :goto_d

    .line 404
    :goto_e
    const/4 v5, 0x0

    .line 405
    const/16 v6, 0xd

    .line 406
    .line 407
    sget-object v1, La/jm40;->b:La/jm40;

    .line 408
    .line 409
    const/4 v2, 0x0

    .line 410
    const/4 v4, 0x0

    .line 411
    invoke-static/range {v1 .. v6}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 412
    .line 413
    .line 414
    move-result-object p2

    .line 415
    invoke-interface {p2, p3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 416
    .line 417
    .line 418
    move-result-object p2

    .line 419
    shl-int/lit8 p3, v0, 0x3

    .line 420
    .line 421
    and-int/lit8 p3, p3, 0x70

    .line 422
    .line 423
    invoke-static {p2, p1, p0, p4, p3}, La/qxw;->b(La/mm40;La/ygx;La/xdr;La/fet;I)V

    .line 424
    .line 425
    .line 426
    goto :goto_f

    .line 427
    :cond_1f
    invoke-virtual {p4}, La/fet;->X()V

    .line 428
    .line 429
    .line 430
    :goto_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    return-object p0

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
