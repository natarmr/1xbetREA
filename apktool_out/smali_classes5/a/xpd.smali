.class public final synthetic La/xpd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/tsq;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/tsq;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xpd;->a:B

    iput-object p1, p0, La/xpd;->b:La/mm40;

    iput-object p2, p0, La/xpd;->c:La/tsq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/xpd;->a:B

    .line 2
    .line 3
    const v1, 0x30030

    .line 4
    .line 5
    .line 6
    const/16 v2, 0x12

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    iget-object v5, p0, La/xpd;->b:La/mm40;

    .line 12
    .line 13
    const/4 v6, 0x4

    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v8, p0, La/xpd;->c:La/tsq;

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, La/y5d;

    .line 22
    .line 23
    check-cast p2, La/fet;

    .line 24
    .line 25
    check-cast p3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 p1, p0, 0x11

    .line 35
    .line 36
    if-eq p1, v4, :cond_0

    .line 37
    .line 38
    move v7, v9

    .line 39
    :cond_0
    and-int/2addr p0, v9

    .line 40
    invoke-virtual {p2, p0, v7}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    iget p0, v8, La/tsq;->c:I

    .line 47
    .line 48
    invoke-static {p0, p2, v5}, La/dyb;->z(ILa/fet;La/mm40;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    check-cast p1, La/y5d;

    .line 59
    .line 60
    check-cast p2, La/fet;

    .line 61
    .line 62
    check-cast p3, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    and-int/lit8 p1, p0, 0x11

    .line 72
    .line 73
    if-eq p1, v4, :cond_2

    .line 74
    .line 75
    move v7, v9

    .line 76
    :cond_2
    and-int/2addr p0, v9

    .line 77
    invoke-virtual {p2, p0, v7}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    iget p0, v8, La/tsq;->c:I

    .line 84
    .line 85
    invoke-static {p0, p2, v5}, La/dyb;->z(ILa/fet;La/mm40;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_1
    move-object v0, p1

    .line 96
    check-cast v0, La/y5d;

    .line 97
    .line 98
    check-cast p2, La/fet;

    .line 99
    .line 100
    check-cast p3, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    and-int/lit8 p3, p1, 0x6

    .line 110
    .line 111
    if-nez p3, :cond_5

    .line 112
    .line 113
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-eqz p3, :cond_4

    .line 118
    .line 119
    move v3, v6

    .line 120
    :cond_4
    or-int/2addr p1, v3

    .line 121
    :cond_5
    and-int/lit8 p3, p1, 0x13

    .line 122
    .line 123
    if-eq p3, v2, :cond_6

    .line 124
    .line 125
    move v7, v9

    .line 126
    :cond_6
    and-int/lit8 p3, p1, 0x1

    .line 127
    .line 128
    invoke-virtual {p2, p3, v7}, La/fet;->U(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    if-eqz p3, :cond_7

    .line 133
    .line 134
    iget-object v2, v8, La/tsq;->a:La/j83;

    .line 135
    .line 136
    iget-object v3, v8, La/tsq;->b:La/j83;

    .line 137
    .line 138
    sget-object p3, La/j1t0;->e:La/zfn;

    .line 139
    .line 140
    invoke-virtual {p2, p3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    check-cast p3, La/g1t0;

    .line 145
    .line 146
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    new-instance p3, La/xpd;

    .line 154
    .line 155
    move v5, v1

    .line 156
    iget-object v1, p0, La/xpd;->b:La/mm40;

    .line 157
    .line 158
    invoke-direct {p3, v1, v8, v6}, La/xpd;-><init>(La/mm40;La/tsq;B)V

    .line 159
    .line 160
    .line 161
    const p0, -0x48eb5cd3

    .line 162
    .line 163
    .line 164
    invoke-static {p0, p3, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    and-int/lit8 p1, p1, 0xe

    .line 169
    .line 170
    or-int v7, p1, v5

    .line 171
    .line 172
    move-object v5, p0

    .line 173
    move-object v6, p2

    .line 174
    invoke-static/range {v0 .. v7}, La/uvw;->n(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_7
    move-object v6, p2

    .line 179
    invoke-virtual {v6}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_2
    move v5, v1

    .line 186
    move-object v0, p1

    .line 187
    check-cast v0, La/y5d;

    .line 188
    .line 189
    check-cast p2, La/fet;

    .line 190
    .line 191
    check-cast p3, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    and-int/lit8 p3, p1, 0x6

    .line 201
    .line 202
    if-nez p3, :cond_9

    .line 203
    .line 204
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p3

    .line 208
    if-eqz p3, :cond_8

    .line 209
    .line 210
    move v3, v6

    .line 211
    :cond_8
    or-int/2addr p1, v3

    .line 212
    :cond_9
    and-int/lit8 p3, p1, 0x13

    .line 213
    .line 214
    if-eq p3, v2, :cond_a

    .line 215
    .line 216
    move v7, v9

    .line 217
    :cond_a
    and-int/lit8 p3, p1, 0x1

    .line 218
    .line 219
    invoke-virtual {p2, p3, v7}, La/fet;->U(IZ)Z

    .line 220
    .line 221
    .line 222
    move-result p3

    .line 223
    if-eqz p3, :cond_b

    .line 224
    .line 225
    iget-object v2, v8, La/tsq;->a:La/j83;

    .line 226
    .line 227
    iget-object v3, v8, La/tsq;->b:La/j83;

    .line 228
    .line 229
    sget-object p3, La/j1t0;->e:La/zfn;

    .line 230
    .line 231
    invoke-virtual {p2, p3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    check-cast p3, La/g1t0;

    .line 236
    .line 237
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    new-instance p3, La/xpd;

    .line 245
    .line 246
    iget-object v1, p0, La/xpd;->b:La/mm40;

    .line 247
    .line 248
    invoke-direct {p3, v1, v8, v9}, La/xpd;-><init>(La/mm40;La/tsq;B)V

    .line 249
    .line 250
    .line 251
    const p0, -0x40e5cb32

    .line 252
    .line 253
    .line 254
    invoke-static {p0, p3, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    and-int/lit8 p1, p1, 0xe

    .line 259
    .line 260
    or-int v7, p1, v5

    .line 261
    .line 262
    move-object v5, p0

    .line 263
    move-object v6, p2

    .line 264
    invoke-static/range {v0 .. v7}, La/uvw;->n(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_b
    move-object v6, p2

    .line 269
    invoke-virtual {v6}, La/fet;->X()V

    .line 270
    .line 271
    .line 272
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_3
    check-cast p1, La/y5d;

    .line 276
    .line 277
    check-cast p2, La/fet;

    .line 278
    .line 279
    check-cast p3, Ljava/lang/Integer;

    .line 280
    .line 281
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    and-int/lit8 p1, p0, 0x11

    .line 289
    .line 290
    if-eq p1, v4, :cond_c

    .line 291
    .line 292
    move v7, v9

    .line 293
    :cond_c
    and-int/2addr p0, v9

    .line 294
    invoke-virtual {p2, p0, v7}, La/fet;->U(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-eqz p0, :cond_d

    .line 299
    .line 300
    iget p0, v8, La/tsq;->c:I

    .line 301
    .line 302
    invoke-static {p0, p2, v5}, La/dyb;->z(ILa/fet;La/mm40;)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_d
    invoke-virtual {p2}, La/fet;->X()V

    .line 307
    .line 308
    .line 309
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :pswitch_4
    move v5, v1

    .line 313
    move-object v0, p1

    .line 314
    check-cast v0, La/y5d;

    .line 315
    .line 316
    check-cast p2, La/fet;

    .line 317
    .line 318
    check-cast p3, Ljava/lang/Integer;

    .line 319
    .line 320
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    and-int/lit8 p3, p1, 0x6

    .line 328
    .line 329
    if-nez p3, :cond_f

    .line 330
    .line 331
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p3

    .line 335
    if-eqz p3, :cond_e

    .line 336
    .line 337
    move v3, v6

    .line 338
    :cond_e
    or-int/2addr p1, v3

    .line 339
    :cond_f
    and-int/lit8 p3, p1, 0x13

    .line 340
    .line 341
    if-eq p3, v2, :cond_10

    .line 342
    .line 343
    move v7, v9

    .line 344
    :cond_10
    and-int/lit8 p3, p1, 0x1

    .line 345
    .line 346
    invoke-virtual {p2, p3, v7}, La/fet;->U(IZ)Z

    .line 347
    .line 348
    .line 349
    move-result p3

    .line 350
    if-eqz p3, :cond_11

    .line 351
    .line 352
    iget-object v2, v8, La/tsq;->a:La/j83;

    .line 353
    .line 354
    iget-object v3, v8, La/tsq;->b:La/j83;

    .line 355
    .line 356
    sget-object p3, La/j1t0;->e:La/zfn;

    .line 357
    .line 358
    invoke-virtual {p2, p3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    check-cast p3, La/g1t0;

    .line 363
    .line 364
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    new-instance p3, La/xpd;

    .line 372
    .line 373
    const/4 v1, 0x5

    .line 374
    iget-object p0, p0, La/xpd;->b:La/mm40;

    .line 375
    .line 376
    invoke-direct {p3, p0, v8, v1}, La/xpd;-><init>(La/mm40;La/tsq;B)V

    .line 377
    .line 378
    .line 379
    const v1, -0x38e03991

    .line 380
    .line 381
    .line 382
    invoke-static {v1, p3, p2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 383
    .line 384
    .line 385
    move-result-object p3

    .line 386
    and-int/lit8 p1, p1, 0xe

    .line 387
    .line 388
    or-int v7, p1, v5

    .line 389
    .line 390
    move-object v1, p0

    .line 391
    move-object v6, p2

    .line 392
    move-object v5, p3

    .line 393
    invoke-static/range {v0 .. v7}, La/uvw;->n(La/y5d;La/mm40;La/j83;La/j83;La/y9q0;La/ugd;La/fet;I)V

    .line 394
    .line 395
    .line 396
    goto :goto_5

    .line 397
    :cond_11
    move-object v6, p2

    .line 398
    invoke-virtual {v6}, La/fet;->X()V

    .line 399
    .line 400
    .line 401
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    return-object p0

    .line 404
    nop

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
