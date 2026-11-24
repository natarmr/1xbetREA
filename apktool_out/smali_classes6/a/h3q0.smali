.class public final synthetic La/h3q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ibo0;La/m72;)V
    .locals 0

    .line 2
    const/16 p2, 0x18

    iput-byte p2, p0, La/h3q0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h3q0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/y78;La/r1a;)V
    .locals 0

    .line 1
    const/16 p1, 0x9

    iput-byte p1, p0, La/h3q0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/h3q0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p2, p0, La/h3q0;->a:B

    iput-object p1, p0, La/h3q0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/h3q0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "viewModelFactory"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object p0, p0, La/h3q0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/udr0;

    .line 15
    .line 16
    sget-object v0, La/udr0;->O1:La/s2m0;

    .line 17
    .line 18
    new-instance v0, La/sdr0;

    .line 19
    .line 20
    new-instance v1, La/tdr0;

    .line 21
    .line 22
    invoke-direct {v1, p0, v3}, La/tdr0;-><init>(La/udr0;B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/tdr0;

    .line 26
    .line 27
    invoke-direct {v2, p0, v4}, La/tdr0;-><init>(La/udr0;B)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/phu0;->N(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object v3, v0, La/zz3;->d:La/dp;

    .line 38
    .line 39
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, La/k9x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, La/egm0;->i(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, La/ro4;->X(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, La/wvb;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v1}, La/q7x;->A(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    check-cast p0, La/qbr0;

    .line 100
    .line 101
    sget-object v0, La/qbr0;->O1:La/s9m0;

    .line 102
    .line 103
    iget-object p0, p0, La/qbr0;->M1:La/fiu0;

    .line 104
    .line 105
    if-eqz p0, :cond_0

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v5

    .line 112
    :pswitch_1
    check-cast p0, La/jbr0;

    .line 113
    .line 114
    sget-object v0, La/jbr0;->O1:La/g9m0;

    .line 115
    .line 116
    iget-object p0, p0, La/jbr0;->M1:La/fiu0;

    .line 117
    .line 118
    if-eqz p0, :cond_1

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v5

    .line 125
    :pswitch_2
    check-cast p0, La/adr0;

    .line 126
    .line 127
    iget-object p0, p0, La/adr0;->b:La/xcr0;

    .line 128
    .line 129
    iget p0, p0, La/xcr0;->b:I

    .line 130
    .line 131
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :pswitch_3
    check-cast p0, La/q7r0;

    .line 137
    .line 138
    sget-object v0, La/q7r0;->O1:La/y2m0;

    .line 139
    .line 140
    new-instance v0, La/n7r0;

    .line 141
    .line 142
    new-instance v1, La/o7r0;

    .line 143
    .line 144
    invoke-direct {v1, p0, v3}, La/o7r0;-><init>(La/q7r0;B)V

    .line 145
    .line 146
    .line 147
    new-instance v2, La/o7r0;

    .line 148
    .line 149
    invoke-direct {v2, p0, v4}, La/o7r0;-><init>(La/q7r0;B)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-static {v1}, La/ccq0;->S(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    iget-object v3, v0, La/zz3;->d:La/dp;

    .line 160
    .line 161
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v1}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v1}, La/ofm0;->p(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v1}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, La/q7x;->A(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1}, La/bfb;->P(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_4
    check-cast p0, La/ibo0;

    .line 215
    .line 216
    if-eqz p0, :cond_2

    .line 217
    .line 218
    iget-object p0, p0, La/ibo0;->h:La/v5l0;

    .line 219
    .line 220
    if-nez p0, :cond_3

    .line 221
    .line 222
    :cond_2
    sget-object p0, La/v5l0;->d:La/v5l0;

    .line 223
    .line 224
    :cond_3
    new-instance v0, La/ydo0;

    .line 225
    .line 226
    new-instance v2, Ljava/util/ArrayList;

    .line 227
    .line 228
    const/16 v6, 0xc

    .line 229
    .line 230
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    :goto_0
    if-ge v3, v6, :cond_9

    .line 234
    .line 235
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-eqz v8, :cond_8

    .line 244
    .line 245
    if-eq v8, v4, :cond_7

    .line 246
    .line 247
    if-eq v8, v1, :cond_6

    .line 248
    .line 249
    const/4 v9, 0x3

    .line 250
    if-eq v8, v9, :cond_5

    .line 251
    .line 252
    const/4 v9, 0x4

    .line 253
    if-ne v8, v9, :cond_4

    .line 254
    .line 255
    sget-object v8, La/h0l0;->a:La/h0l0;

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_5
    sget-object v8, La/i0l0;->a:La/i0l0;

    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_6
    sget-object v8, La/j0l0;->a:La/j0l0;

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_7
    sget-object v8, La/k0l0;->a:La/k0l0;

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_8
    sget-object v8, La/g0l0;->a:La/g0l0;

    .line 272
    .line 273
    :goto_1
    new-instance v9, La/x56;

    .line 274
    .line 275
    invoke-direct {v9, v8, v7}, La/x56;-><init>(La/l0l0;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    add-int/lit8 v3, v3, 0x1

    .line 282
    .line 283
    goto :goto_0

    .line 284
    :cond_9
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-direct {v0, p0}, La/ydo0;-><init>(La/a4x;)V

    .line 289
    .line 290
    .line 291
    move-object v5, v0

    .line 292
    :goto_2
    return-object v5

    .line 293
    :pswitch_5
    check-cast p0, La/trm0;

    .line 294
    .line 295
    iget-object p0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p0, La/gii0;

    .line 298
    .line 299
    const-class v0, La/f2m0;

    .line 300
    .line 301
    sget-object v1, La/sre0;->a:La/tre0;

    .line 302
    .line 303
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, La/f2m0;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_6
    check-cast p0, La/czq0;

    .line 315
    .line 316
    iget-object p0, p0, La/czq0;->h:La/p7m0;

    .line 317
    .line 318
    sget-object v0, La/i8d;->c:La/i8d;

    .line 319
    .line 320
    invoke-virtual {p0, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_7
    check-cast p0, La/dvq0;

    .line 327
    .line 328
    iget-object v0, p0, La/dvq0;->o1:Lkotlin/jvm/functions/Function1;

    .line 329
    .line 330
    iget-boolean p0, p0, La/dvq0;->n1:Z

    .line 331
    .line 332
    xor-int/2addr p0, v4

    .line 333
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object p0

    .line 343
    :pswitch_8
    check-cast p0, La/cym0;

    .line 344
    .line 345
    invoke-virtual {p0}, La/cym0;->invoke()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_9
    check-cast p0, La/qrq0;

    .line 352
    .line 353
    invoke-virtual {p0}, La/qrq0;->i()V

    .line 354
    .line 355
    .line 356
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object p0

    .line 359
    :pswitch_a
    check-cast p0, La/yqq0;

    .line 360
    .line 361
    invoke-virtual {p0, v4}, La/yqq0;->w(Z)V

    .line 362
    .line 363
    .line 364
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 365
    .line 366
    return-object p0

    .line 367
    :pswitch_b
    check-cast p0, La/tpq0;

    .line 368
    .line 369
    invoke-virtual {p0, v4}, La/tpq0;->w(Z)V

    .line 370
    .line 371
    .line 372
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    return-object p0

    .line 375
    :pswitch_c
    check-cast p0, La/noq0;

    .line 376
    .line 377
    sget-object v0, La/noq0;->m2:La/y2m0;

    .line 378
    .line 379
    iget-object p0, p0, La/noq0;->j2:La/fiu0;

    .line 380
    .line 381
    if-eqz p0, :cond_a

    .line 382
    .line 383
    return-object p0

    .line 384
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    throw v5

    .line 388
    :pswitch_d
    check-cast p0, La/wmq0;

    .line 389
    .line 390
    iget-object p0, p0, La/wmq0;->f:La/p7m0;

    .line 391
    .line 392
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 393
    .line 394
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_e
    check-cast p0, La/ugq0;

    .line 404
    .line 405
    iget-object v0, p0, La/ugq0;->e:La/dpi0;

    .line 406
    .line 407
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 408
    .line 409
    .line 410
    move-result-wide v1

    .line 411
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, La/ieu;

    .line 414
    .line 415
    iget-object v0, v0, La/ieu;->c:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, La/es00;

    .line 418
    .line 419
    iput-wide v1, v0, La/es00;->a:J

    .line 420
    .line 421
    iget-object v0, p0, La/ugq0;->f:La/ls00;

    .line 422
    .line 423
    invoke-virtual {v0}, La/ls00;->a()V

    .line 424
    .line 425
    .line 426
    iget-object p0, p0, La/ugq0;->j:La/p7m0;

    .line 427
    .line 428
    sget-object v0, La/i8d;->c:La/i8d;

    .line 429
    .line 430
    invoke-virtual {p0, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object p0

    .line 436
    :pswitch_f
    check-cast p0, La/wfq0;

    .line 437
    .line 438
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    iget-object v0, p0, La/wfq0;->q:La/mne;

    .line 443
    .line 444
    iget-object v9, v0, La/mne;->a:La/rwj;

    .line 445
    .line 446
    sget-object v7, La/vfq0;->a:La/vfq0;

    .line 447
    .line 448
    new-instance v10, La/tfq0;

    .line 449
    .line 450
    invoke-direct {v10, p0, v5, v1}, La/tfq0;-><init>(La/wfq0;La/yje;B)V

    .line 451
    .line 452
    .line 453
    const/16 v11, 0xa

    .line 454
    .line 455
    const/4 v8, 0x0

    .line 456
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 457
    .line 458
    .line 459
    invoke-virtual {p0}, La/wfq0;->B()V

    .line 460
    .line 461
    .line 462
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object p0

    .line 465
    :pswitch_10
    check-cast p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 466
    .line 467
    sget v0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 468
    .line 469
    invoke-virtual {p0}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->c()V

    .line 470
    .line 471
    .line 472
    iget-object v0, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->e:Lkotlin/jvm/functions/Function0;

    .line 473
    .line 474
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    invoke-virtual {p0}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->a()V

    .line 478
    .line 479
    .line 480
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object p0

    .line 483
    :pswitch_11
    check-cast p0, La/ck60;

    .line 484
    .line 485
    invoke-virtual {p0}, La/ck60;->invoke()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_12
    check-cast p0, La/yip0;

    .line 492
    .line 493
    invoke-virtual {p0}, La/yip0;->invoke()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 498
    .line 499
    return-object p0

    .line 500
    :pswitch_13
    check-cast p0, La/r1a;

    .line 501
    .line 502
    new-instance v0, Landroid/os/HandlerThread;

    .line 503
    .line 504
    const-string v1, "CXCP-Camera-H"

    .line 505
    .line 506
    const/4 v2, -0x3

    .line 507
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 511
    .line 512
    .line 513
    sget-object v1, La/p1a;->c:La/p1a;

    .line 514
    .line 515
    new-instance v2, La/apj0;

    .line 516
    .line 517
    const/16 v3, 0x10

    .line 518
    .line 519
    invoke-direct {v2, v0, v3}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {p0, v1, v2}, La/r1a;->a(La/p1a;Ljava/lang/Runnable;)V

    .line 523
    .line 524
    .line 525
    new-instance p0, Landroid/os/Handler;

    .line 526
    .line 527
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 532
    .line 533
    .line 534
    return-object p0

    .line 535
    :pswitch_14
    check-cast p0, La/rbq0;

    .line 536
    .line 537
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    iget-object p0, p0, La/rbq0;->b:La/mne;

    .line 542
    .line 543
    iget-object p0, p0, La/mne;->c:La/vs10;

    .line 544
    .line 545
    invoke-static {v0, p0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    return-object p0

    .line 554
    :pswitch_15
    check-cast p0, La/waq0;

    .line 555
    .line 556
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    iget-object p0, p0, La/waq0;->b:La/mne;

    .line 561
    .line 562
    iget-object p0, p0, La/mne;->c:La/vs10;

    .line 563
    .line 564
    invoke-static {v0, p0}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    invoke-static {p0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    return-object p0

    .line 573
    :pswitch_16
    check-cast p0, La/x9q0;

    .line 574
    .line 575
    iput-object v5, p0, La/x9q0;->z:La/w9q0;

    .line 576
    .line 577
    invoke-static {p0}, La/s0x;->S(La/qai0;)V

    .line 578
    .line 579
    .line 580
    invoke-static {p0}, La/n7x;->I(La/v6z;)V

    .line 581
    .line 582
    .line 583
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 584
    .line 585
    .line 586
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 587
    .line 588
    return-object p0

    .line 589
    :pswitch_17
    check-cast p0, La/mkx;

    .line 590
    .line 591
    invoke-virtual {p0}, La/mkx;->b()J

    .line 592
    .line 593
    .line 594
    move-result-wide v0

    .line 595
    new-instance p0, La/ikx;

    .line 596
    .line 597
    invoke-direct {p0, v0, v1}, La/ikx;-><init>(J)V

    .line 598
    .line 599
    .line 600
    return-object p0

    .line 601
    :pswitch_18
    check-cast p0, La/q8q0;

    .line 602
    .line 603
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    .line 604
    .line 605
    iget-object p0, p0, La/q8q0;->a:Landroid/view/View;

    .line 606
    .line 607
    invoke-direct {v0, p0, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 608
    .line 609
    .line 610
    return-object v0

    .line 611
    :pswitch_19
    check-cast p0, La/j5q0;

    .line 612
    .line 613
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 614
    .line 615
    if-eqz v0, :cond_b

    .line 616
    .line 617
    invoke-static {p0}, La/etm0;->k(La/yzj;)La/u4q0;

    .line 618
    .line 619
    .line 620
    move-result-object p0

    .line 621
    goto :goto_3

    .line 622
    :cond_b
    sget-object p0, La/u4q0;->b:La/u4q0;

    .line 623
    .line 624
    :goto_3
    return-object p0

    .line 625
    :pswitch_1a
    check-cast p0, Landroid/app/RemoteAction;

    .line 626
    .line 627
    invoke-static {p0}, La/jw90;->b(Landroid/app/RemoteAction;)Landroid/app/PendingIntent;

    .line 628
    .line 629
    .line 630
    move-result-object p0

    .line 631
    invoke-static {p0}, La/btm0;->u(Landroid/app/PendingIntent;)V

    .line 632
    .line 633
    .line 634
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object p0

    .line 637
    :pswitch_1b
    check-cast p0, La/v3q0;

    .line 638
    .line 639
    iget-object p0, p0, La/v3q0;->d:La/a4x;

    .line 640
    .line 641
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 642
    .line 643
    .line 644
    move-result p0

    .line 645
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 646
    .line 647
    .line 648
    move-result-object p0

    .line 649
    return-object p0

    .line 650
    :pswitch_1c
    check-cast p0, La/j3q0;

    .line 651
    .line 652
    sget-object v0, La/j3q0;->P1:La/m6m0;

    .line 653
    .line 654
    iget-object p0, p0, La/j3q0;->M1:La/fiu0;

    .line 655
    .line 656
    if-eqz p0, :cond_c

    .line 657
    .line 658
    return-object p0

    .line 659
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    throw v5

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
