.class public final synthetic La/p7d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p7d0;->a:B

    iput-object p1, p0, La/p7d0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/p7d0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "viewModelFactory"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/p7d0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/oge0;

    .line 13
    .line 14
    iput-object v3, p0, La/oge0;->i:La/fx2;

    .line 15
    .line 16
    const-string v0, "OnPositionedDispatch"

    .line 17
    .line 18
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p0}, La/oge0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :pswitch_0
    check-cast p0, La/nde0;

    .line 36
    .line 37
    iget-object p0, p0, La/nde0;->g:La/p7m0;

    .line 38
    .line 39
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    check-cast p0, La/xce0;

    .line 51
    .line 52
    sget-object v0, La/xce0;->N1:La/fl70;

    .line 53
    .line 54
    iget-object p0, p0, La/xce0;->K1:La/fiu0;

    .line 55
    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v3

    .line 63
    :pswitch_2
    check-cast p0, La/mce0;

    .line 64
    .line 65
    sget-object v0, La/mce0;->e2:[La/iiy;

    .line 66
    .line 67
    new-instance v0, La/ry3;

    .line 68
    .line 69
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object p0, p0, La/mce0;->c2:La/eri;

    .line 74
    .line 75
    if-eqz p0, :cond_1

    .line 76
    .line 77
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v3

    .line 85
    :pswitch_3
    check-cast p0, La/ice0;

    .line 86
    .line 87
    sget-object v0, La/ice0;->c2:[La/iiy;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_2

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    .line 96
    .line 97
    .line 98
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_4
    check-cast p0, Lokhttp3/internal/ws/WebSocketWriter;

    .line 102
    .line 103
    sget-object v0, Lokhttp3/internal/ws/RealWebSocket;->x:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {p0}, Lokhttp3/internal/_UtilCommonKt;->b(Ljava/io/Closeable;)V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_5
    check-cast p0, Lokhttp3/internal/ws/RealWebSocket;

    .line 112
    .line 113
    sget-object v0, Lokhttp3/internal/ws/RealWebSocket;->x:Ljava/util/List;

    .line 114
    .line 115
    invoke-virtual {p0}, Lokhttp3/internal/ws/RealWebSocket;->h()V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_6
    check-cast p0, La/f8e0;

    .line 122
    .line 123
    sget-object v0, La/f8e0;->Q1:La/mi70;

    .line 124
    .line 125
    iget-object p0, p0, La/f8e0;->N1:La/fiu0;

    .line 126
    .line 127
    if-eqz p0, :cond_3

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v3

    .line 134
    :pswitch_7
    check-cast p0, La/zn00;

    .line 135
    .line 136
    iget-object p0, p0, La/zn00;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, La/gii0;

    .line 139
    .line 140
    const-class v0, La/p7e0;

    .line 141
    .line 142
    sget-object v1, La/sre0;->a:La/tre0;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, La/p7e0;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_8
    check-cast p0, La/n7e0;

    .line 156
    .line 157
    iget-object p0, p0, La/n7e0;->b:La/gii0;

    .line 158
    .line 159
    const-class v0, La/l7e0;

    .line 160
    .line 161
    sget-object v1, La/sre0;->a:La/tre0;

    .line 162
    .line 163
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, La/l7e0;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_9
    check-cast p0, La/k7e0;

    .line 175
    .line 176
    sget-object v0, La/k7e0;->S1:La/nh70;

    .line 177
    .line 178
    iget-object p0, p0, La/k7e0;->P1:La/fiu0;

    .line 179
    .line 180
    if-eqz p0, :cond_4

    .line 181
    .line 182
    return-object p0

    .line 183
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v3

    .line 187
    :pswitch_a
    check-cast p0, La/s5e0;

    .line 188
    .line 189
    sget-object v0, La/s5e0;->P1:La/jh70;

    .line 190
    .line 191
    iget-object p0, p0, La/s5e0;->L1:La/fiu0;

    .line 192
    .line 193
    if-eqz p0, :cond_5

    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v3

    .line 200
    :pswitch_b
    check-cast p0, La/g090;

    .line 201
    .line 202
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, La/gii0;

    .line 205
    .line 206
    const-class v0, La/z4e0;

    .line 207
    .line 208
    sget-object v1, La/sre0;->a:La/tre0;

    .line 209
    .line 210
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/z4e0;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_c
    check-cast p0, La/t4e0;

    .line 222
    .line 223
    iget-object p0, p0, La/t4e0;->q:La/i1w0;

    .line 224
    .line 225
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v2, La/c8d;

    .line 230
    .line 231
    sget-object v3, La/y7d;->a:La/v7d;

    .line 232
    .line 233
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 234
    .line 235
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    :goto_0
    move-object v1, v0

    .line 243
    check-cast v1, La/paw;

    .line 244
    .line 245
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_6

    .line 250
    .line 251
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, La/oe50;

    .line 256
    .line 257
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 258
    .line 259
    .line 260
    goto :goto_0

    .line 261
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_d
    check-cast p0, La/i4e0;

    .line 265
    .line 266
    sget-object v0, La/i4e0;->P1:La/xi70;

    .line 267
    .line 268
    iget-object p0, p0, La/i4e0;->K1:La/fiu0;

    .line 269
    .line 270
    if-eqz p0, :cond_7

    .line 271
    .line 272
    return-object p0

    .line 273
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw v3

    .line 277
    :pswitch_e
    check-cast p0, La/o2e0;

    .line 278
    .line 279
    sget-object v0, La/o2e0;->b2:La/mi70;

    .line 280
    .line 281
    iget-object p0, p0, La/o2e0;->Y1:La/fiu0;

    .line 282
    .line 283
    if-eqz p0, :cond_8

    .line 284
    .line 285
    return-object p0

    .line 286
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v3

    .line 290
    :pswitch_f
    check-cast p0, La/dq00;

    .line 291
    .line 292
    iget-object p0, p0, La/dq00;->b:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p0, La/gii0;

    .line 295
    .line 296
    const-class v0, La/q1e0;

    .line 297
    .line 298
    sget-object v1, La/sre0;->a:La/tre0;

    .line 299
    .line 300
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    check-cast p0, La/q1e0;

    .line 309
    .line 310
    return-object p0

    .line 311
    :pswitch_10
    check-cast p0, La/bsf;

    .line 312
    .line 313
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iget-object v1, p0, La/bsf;->m:La/n0o0;

    .line 318
    .line 319
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v1, La/fee;

    .line 324
    .line 325
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    check-cast v1, Ljava/util/Collection;

    .line 330
    .line 331
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 332
    .line 333
    .line 334
    iget-object v1, p0, La/bsf;->n:La/n0o0;

    .line 335
    .line 336
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, La/fee;

    .line 341
    .line 342
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    check-cast v1, Ljava/util/Collection;

    .line 347
    .line 348
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 349
    .line 350
    .line 351
    iget-object v1, p0, La/bsf;->p:La/n0o0;

    .line 352
    .line 353
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, La/fee;

    .line 358
    .line 359
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    check-cast v1, Ljava/util/Collection;

    .line 364
    .line 365
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 366
    .line 367
    .line 368
    iget-object p0, p0, La/bsf;->o:La/n0o0;

    .line 369
    .line 370
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    check-cast p0, La/fee;

    .line 375
    .line 376
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    check-cast p0, Ljava/util/Collection;

    .line 381
    .line 382
    invoke-static {v0, p0, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    return-object p0

    .line 387
    :pswitch_11
    check-cast p0, La/nw20;

    .line 388
    .line 389
    iget-object p0, p0, La/nw20;->a:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast p0, La/gii0;

    .line 392
    .line 393
    const-class v0, La/vud0;

    .line 394
    .line 395
    sget-object v1, La/sre0;->a:La/tre0;

    .line 396
    .line 397
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    check-cast p0, La/vud0;

    .line 406
    .line 407
    return-object p0

    .line 408
    :pswitch_12
    check-cast p0, La/uud0;

    .line 409
    .line 410
    new-instance v0, La/q0h0;

    .line 411
    .line 412
    iget-object p0, p0, La/uud0;->L1:La/xqi;

    .line 413
    .line 414
    if-eqz p0, :cond_9

    .line 415
    .line 416
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 417
    .line 418
    .line 419
    return-object v0

    .line 420
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v3

    .line 424
    :pswitch_13
    check-cast p0, La/kd30;

    .line 425
    .line 426
    iget-object p0, p0, La/kd30;->a:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast p0, La/gii0;

    .line 429
    .line 430
    const-class v0, La/itd0;

    .line 431
    .line 432
    sget-object v1, La/sre0;->a:La/tre0;

    .line 433
    .line 434
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    check-cast p0, La/itd0;

    .line 443
    .line 444
    return-object p0

    .line 445
    :pswitch_14
    check-cast p0, La/j910;

    .line 446
    .line 447
    iget-object p0, p0, La/j910;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast p0, La/gii0;

    .line 450
    .line 451
    const-class v0, La/ysd0;

    .line 452
    .line 453
    sget-object v1, La/sre0;->a:La/tre0;

    .line 454
    .line 455
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    check-cast p0, La/ysd0;

    .line 464
    .line 465
    return-object p0

    .line 466
    :pswitch_15
    check-cast p0, La/srd0;

    .line 467
    .line 468
    new-instance v0, La/q0h0;

    .line 469
    .line 470
    iget-object p0, p0, La/srd0;->K1:La/wqi;

    .line 471
    .line 472
    if-eqz p0, :cond_a

    .line 473
    .line 474
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 475
    .line 476
    .line 477
    return-object v0

    .line 478
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v3

    .line 482
    :pswitch_16
    check-cast p0, La/xqd0;

    .line 483
    .line 484
    sget-object v0, La/xqd0;->S1:La/jh70;

    .line 485
    .line 486
    iget-object p0, p0, La/xqd0;->P1:La/fiu0;

    .line 487
    .line 488
    if-eqz p0, :cond_b

    .line 489
    .line 490
    return-object p0

    .line 491
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v3

    .line 495
    :pswitch_17
    check-cast p0, La/ywu;

    .line 496
    .line 497
    iget-object p0, p0, La/ywu;->b:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast p0, La/rrc;

    .line 500
    .line 501
    iget-object p0, p0, La/rrc;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast p0, Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 504
    .line 505
    invoke-virtual {p0}, Lorg/xplatform/onexdatabase/OnexDatabase;->s()La/gnd0;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    return-object p0

    .line 510
    :pswitch_18
    check-cast p0, La/z220;

    .line 511
    .line 512
    iget-object p0, p0, La/z220;->c:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast p0, La/gii0;

    .line 515
    .line 516
    const-class v0, La/gkd0;

    .line 517
    .line 518
    sget-object v1, La/sre0;->a:La/tre0;

    .line 519
    .line 520
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    check-cast p0, La/gkd0;

    .line 529
    .line 530
    return-object p0

    .line 531
    :pswitch_19
    check-cast p0, La/ned0;

    .line 532
    .line 533
    const/4 v0, 0x2

    .line 534
    invoke-static {v0}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    if-nez v0, :cond_c

    .line 543
    .line 544
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 545
    .line 546
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    if-nez v0, :cond_c

    .line 551
    .line 552
    const-string v0, ""

    .line 553
    .line 554
    :cond_c
    new-instance v2, La/ged0;

    .line 555
    .line 556
    iget-object v3, p0, La/ned0;->e:La/rpt;

    .line 557
    .line 558
    iget-object v3, v3, La/rpt;->a:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v3, La/xr;

    .line 561
    .line 562
    invoke-virtual {v3}, La/xr;->i()La/rl40;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    sget-object v4, La/rl40;->b:La/rl40;

    .line 567
    .line 568
    if-ne v3, v4, :cond_d

    .line 569
    .line 570
    const/4 v1, 0x1

    .line 571
    :cond_d
    iget-object v3, p0, La/ned0;->q:La/x4u;

    .line 572
    .line 573
    invoke-virtual {v3, v0}, La/x4u;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-direct {v2, v1, v0, v3}, La/ged0;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {p0, v2}, La/ned0;->x(La/ked0;)V

    .line 581
    .line 582
    .line 583
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object p0

    .line 586
    :pswitch_1a
    check-cast p0, La/sdd0;

    .line 587
    .line 588
    sget-object v0, La/sdd0;->i2:La/xi70;

    .line 589
    .line 590
    new-instance v0, La/ko60;

    .line 591
    .line 592
    const/16 v1, 0xb

    .line 593
    .line 594
    invoke-direct {v0, p0, v1}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 595
    .line 596
    .line 597
    return-object v0

    .line 598
    :pswitch_1b
    check-cast p0, La/ilq;

    .line 599
    .line 600
    invoke-interface {p0}, La/ilq;->invoke()F

    .line 601
    .line 602
    .line 603
    move-result p0

    .line 604
    const/high16 v0, 0x3f800000    # 1.0f

    .line 605
    .line 606
    cmpl-float p0, p0, v0

    .line 607
    .line 608
    if-ltz p0, :cond_e

    .line 609
    .line 610
    goto :goto_1

    .line 611
    :cond_e
    const v0, 0x3e99999a    # 0.3f

    .line 612
    .line 613
    .line 614
    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    return-object p0

    .line 619
    :pswitch_1c
    check-cast p0, La/q7d0;

    .line 620
    .line 621
    iget-object v0, p0, La/q7d0;->a:La/us00;

    .line 622
    .line 623
    iget-object p0, p0, La/q7d0;->b:Ljava/lang/String;

    .line 624
    .line 625
    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    return-object p0

    .line 630
    nop

    .line 631
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
