.class public final La/ji3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rwk;


# direct methods
.method public synthetic constructor <init>(La/rwk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ji3;->a:B

    iput-object p1, p0, La/ji3;->b:La/rwk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ji3;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ji3;->b:La/rwk;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p2, La/k0o0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/k0o0;

    .line 20
    .line 21
    iget v6, v0, La/k0o0;->j:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, La/k0o0;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/k0o0;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/k0o0;-><init>(La/ji3;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/k0o0;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/k0o0;->j:I

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/d8n0;

    .line 58
    .line 59
    const/16 v2, 0x9

    .line 60
    .line 61
    invoke-direct {p0, p1, v2}, La/d8n0;-><init>(La/kmq;B)V

    .line 62
    .line 63
    .line 64
    iput v5, v0, La/k0o0;->j:I

    .line 65
    .line 66
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, p2, :cond_3

    .line 71
    .line 72
    move-object v2, p2

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_2
    return-object v2

    .line 77
    :pswitch_0
    instance-of v0, p2, La/g0o0;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    move-object v0, p2

    .line 82
    check-cast v0, La/g0o0;

    .line 83
    .line 84
    iget v6, v0, La/g0o0;->j:I

    .line 85
    .line 86
    and-int v7, v6, v4

    .line 87
    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    sub-int/2addr v6, v4

    .line 91
    iput v6, v0, La/g0o0;->j:I

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    new-instance v0, La/g0o0;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2}, La/g0o0;-><init>(La/ji3;La/yje;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    iget-object p0, v0, La/g0o0;->i:Ljava/lang/Object;

    .line 100
    .line 101
    sget-object p2, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget v4, v0, La/g0o0;->j:I

    .line 104
    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    if-ne v4, v5, :cond_5

    .line 108
    .line 109
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p0, La/d8n0;

    .line 121
    .line 122
    const/16 v2, 0x8

    .line 123
    .line 124
    invoke-direct {p0, p1, v2}, La/d8n0;-><init>(La/kmq;B)V

    .line 125
    .line 126
    .line 127
    iput v5, v0, La/g0o0;->j:I

    .line 128
    .line 129
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, p2, :cond_7

    .line 134
    .line 135
    move-object v2, p2

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_5
    return-object v2

    .line 140
    :pswitch_1
    instance-of v0, p2, La/a0o0;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    move-object v0, p2

    .line 145
    check-cast v0, La/a0o0;

    .line 146
    .line 147
    iget v6, v0, La/a0o0;->j:I

    .line 148
    .line 149
    and-int v7, v6, v4

    .line 150
    .line 151
    if-eqz v7, :cond_8

    .line 152
    .line 153
    sub-int/2addr v6, v4

    .line 154
    iput v6, v0, La/a0o0;->j:I

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    new-instance v0, La/a0o0;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2}, La/a0o0;-><init>(La/ji3;La/yje;)V

    .line 160
    .line 161
    .line 162
    :goto_6
    iget-object p0, v0, La/a0o0;->i:Ljava/lang/Object;

    .line 163
    .line 164
    sget-object p2, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget v4, v0, La/a0o0;->j:I

    .line 167
    .line 168
    if-eqz v4, :cond_a

    .line 169
    .line 170
    if-ne v4, v5, :cond_9

    .line 171
    .line 172
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance p0, La/d8n0;

    .line 184
    .line 185
    const/4 v2, 0x7

    .line 186
    invoke-direct {p0, p1, v2}, La/d8n0;-><init>(La/kmq;B)V

    .line 187
    .line 188
    .line 189
    iput v5, v0, La/a0o0;->j:I

    .line 190
    .line 191
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, p2, :cond_b

    .line 196
    .line 197
    move-object v2, p2

    .line 198
    goto :goto_8

    .line 199
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_8
    return-object v2

    .line 202
    :pswitch_2
    instance-of v0, p2, La/pc60;

    .line 203
    .line 204
    if-eqz v0, :cond_c

    .line 205
    .line 206
    move-object v0, p2

    .line 207
    check-cast v0, La/pc60;

    .line 208
    .line 209
    iget v6, v0, La/pc60;->j:I

    .line 210
    .line 211
    and-int v7, v6, v4

    .line 212
    .line 213
    if-eqz v7, :cond_c

    .line 214
    .line 215
    sub-int/2addr v6, v4

    .line 216
    iput v6, v0, La/pc60;->j:I

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_c
    new-instance v0, La/pc60;

    .line 220
    .line 221
    invoke-direct {v0, p0, p2}, La/pc60;-><init>(La/ji3;La/yje;)V

    .line 222
    .line 223
    .line 224
    :goto_9
    iget-object p0, v0, La/pc60;->i:Ljava/lang/Object;

    .line 225
    .line 226
    sget-object p2, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget v4, v0, La/pc60;->j:I

    .line 229
    .line 230
    if-eqz v4, :cond_e

    .line 231
    .line 232
    if-ne v4, v5, :cond_d

    .line 233
    .line 234
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance p0, La/nr30;

    .line 246
    .line 247
    const/16 v2, 0x18

    .line 248
    .line 249
    invoke-direct {p0, p1, v2}, La/nr30;-><init>(La/kmq;B)V

    .line 250
    .line 251
    .line 252
    iput v5, v0, La/pc60;->j:I

    .line 253
    .line 254
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    if-ne p0, p2, :cond_f

    .line 259
    .line 260
    move-object v2, p2

    .line 261
    goto :goto_b

    .line 262
    :cond_f
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    :goto_b
    return-object v2

    .line 265
    :pswitch_3
    instance-of v0, p2, La/ln3;

    .line 266
    .line 267
    if-eqz v0, :cond_10

    .line 268
    .line 269
    move-object v0, p2

    .line 270
    check-cast v0, La/ln3;

    .line 271
    .line 272
    iget v6, v0, La/ln3;->j:I

    .line 273
    .line 274
    and-int v7, v6, v4

    .line 275
    .line 276
    if-eqz v7, :cond_10

    .line 277
    .line 278
    sub-int/2addr v6, v4

    .line 279
    iput v6, v0, La/ln3;->j:I

    .line 280
    .line 281
    goto :goto_c

    .line 282
    :cond_10
    new-instance v0, La/ln3;

    .line 283
    .line 284
    invoke-direct {v0, p0, p2}, La/ln3;-><init>(La/ji3;La/yje;)V

    .line 285
    .line 286
    .line 287
    :goto_c
    iget-object p0, v0, La/ln3;->i:Ljava/lang/Object;

    .line 288
    .line 289
    sget-object p2, La/wne;->a:La/wne;

    .line 290
    .line 291
    iget v4, v0, La/ln3;->j:I

    .line 292
    .line 293
    if-eqz v4, :cond_12

    .line 294
    .line 295
    if-ne v4, v5, :cond_11

    .line 296
    .line 297
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    goto :goto_d

    .line 301
    :cond_11
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_e

    .line 305
    :cond_12
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    new-instance p0, La/ua;

    .line 309
    .line 310
    const/16 v2, 0x1c

    .line 311
    .line 312
    invoke-direct {p0, p1, v2}, La/ua;-><init>(La/kmq;B)V

    .line 313
    .line 314
    .line 315
    iput v5, v0, La/ln3;->j:I

    .line 316
    .line 317
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    if-ne p0, p2, :cond_13

    .line 322
    .line 323
    move-object v2, p2

    .line 324
    goto :goto_e

    .line 325
    :cond_13
    :goto_d
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    :goto_e
    return-object v2

    .line 328
    :pswitch_4
    instance-of v0, p2, La/ki3;

    .line 329
    .line 330
    if-eqz v0, :cond_14

    .line 331
    .line 332
    move-object v0, p2

    .line 333
    check-cast v0, La/ki3;

    .line 334
    .line 335
    iget v6, v0, La/ki3;->j:I

    .line 336
    .line 337
    and-int v7, v6, v4

    .line 338
    .line 339
    if-eqz v7, :cond_14

    .line 340
    .line 341
    sub-int/2addr v6, v4

    .line 342
    iput v6, v0, La/ki3;->j:I

    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_14
    new-instance v0, La/ki3;

    .line 346
    .line 347
    invoke-direct {v0, p0, p2}, La/ki3;-><init>(La/ji3;La/yje;)V

    .line 348
    .line 349
    .line 350
    :goto_f
    iget-object p0, v0, La/ki3;->i:Ljava/lang/Object;

    .line 351
    .line 352
    sget-object p2, La/wne;->a:La/wne;

    .line 353
    .line 354
    iget v4, v0, La/ki3;->j:I

    .line 355
    .line 356
    if-eqz v4, :cond_16

    .line 357
    .line 358
    if-ne v4, v5, :cond_15

    .line 359
    .line 360
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    goto :goto_10

    .line 364
    :cond_15
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    goto :goto_11

    .line 368
    :cond_16
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    new-instance p0, La/ua;

    .line 372
    .line 373
    const/16 v2, 0x17

    .line 374
    .line 375
    invoke-direct {p0, p1, v2}, La/ua;-><init>(La/kmq;B)V

    .line 376
    .line 377
    .line 378
    iput v5, v0, La/ki3;->j:I

    .line 379
    .line 380
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    if-ne p0, p2, :cond_17

    .line 385
    .line 386
    move-object v2, p2

    .line 387
    goto :goto_11

    .line 388
    :cond_17
    :goto_10
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    :goto_11
    return-object v2

    .line 391
    :pswitch_5
    instance-of v0, p2, La/hi3;

    .line 392
    .line 393
    if-eqz v0, :cond_18

    .line 394
    .line 395
    move-object v0, p2

    .line 396
    check-cast v0, La/hi3;

    .line 397
    .line 398
    iget v6, v0, La/hi3;->j:I

    .line 399
    .line 400
    and-int v7, v6, v4

    .line 401
    .line 402
    if-eqz v7, :cond_18

    .line 403
    .line 404
    sub-int/2addr v6, v4

    .line 405
    iput v6, v0, La/hi3;->j:I

    .line 406
    .line 407
    goto :goto_12

    .line 408
    :cond_18
    new-instance v0, La/hi3;

    .line 409
    .line 410
    invoke-direct {v0, p0, p2}, La/hi3;-><init>(La/ji3;La/yje;)V

    .line 411
    .line 412
    .line 413
    :goto_12
    iget-object p0, v0, La/hi3;->i:Ljava/lang/Object;

    .line 414
    .line 415
    sget-object p2, La/wne;->a:La/wne;

    .line 416
    .line 417
    iget v4, v0, La/hi3;->j:I

    .line 418
    .line 419
    if-eqz v4, :cond_1a

    .line 420
    .line 421
    if-ne v4, v5, :cond_19

    .line 422
    .line 423
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    goto :goto_13

    .line 427
    :cond_19
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    goto :goto_14

    .line 431
    :cond_1a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    new-instance p0, La/ua;

    .line 435
    .line 436
    const/16 v2, 0x16

    .line 437
    .line 438
    invoke-direct {p0, p1, v2}, La/ua;-><init>(La/kmq;B)V

    .line 439
    .line 440
    .line 441
    iput v5, v0, La/hi3;->j:I

    .line 442
    .line 443
    invoke-virtual {v1, p0, v0}, La/rwk;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    if-ne p0, p2, :cond_1b

    .line 448
    .line 449
    move-object v2, p2

    .line 450
    goto :goto_14

    .line 451
    :cond_1b
    :goto_13
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    :goto_14
    return-object v2

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
