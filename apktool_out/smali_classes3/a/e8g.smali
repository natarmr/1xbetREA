.class public final synthetic La/e8g;
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
    iput-byte p2, p0, La/e8g;->a:B

    iput-object p1, p0, La/e8g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/e8g;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "viewModelFactory"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, La/e8g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/o7j;

    .line 14
    .line 15
    iget-object v0, p0, La/o7j;->k:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/o7j;->x(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p0, La/f7j;

    .line 24
    .line 25
    invoke-virtual {p0}, La/f7j;->w()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    check-cast p0, La/v6j;

    .line 32
    .line 33
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v6, La/x2i;

    .line 38
    .line 39
    const/16 v0, 0x8

    .line 40
    .line 41
    invoke-direct {v6, v0}, La/x2i;-><init>(B)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, La/v6j;->c:La/mne;

    .line 45
    .line 46
    iget-object v8, v0, La/mne;->a:La/rwj;

    .line 47
    .line 48
    new-instance v9, La/u6j;

    .line 49
    .line 50
    invoke-direct {v9, p0, v4, v1}, La/u6j;-><init>(La/v6j;La/yje;B)V

    .line 51
    .line 52
    .line 53
    const/16 v10, 0xa

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_2
    check-cast p0, La/i5j;

    .line 63
    .line 64
    sget-object v0, La/i5j;->O1:[La/iiy;

    .line 65
    .line 66
    iget-object p0, p0, La/i5j;->L1:La/fiu0;

    .line 67
    .line 68
    if-eqz p0, :cond_0

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v4

    .line 75
    :pswitch_3
    check-cast p0, La/cr;

    .line 76
    .line 77
    iget-object v0, p0, La/cr;->k:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/b4j;

    .line 80
    .line 81
    const-string v1, "alert_bar"

    .line 82
    .line 83
    const-string v3, "start"

    .line 84
    .line 85
    invoke-virtual {v0, v1, v3}, La/b4j;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, La/cr;->m:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/je;

    .line 91
    .line 92
    invoke-virtual {v0, v1, v3}, La/je;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, La/cr;->k:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, La/b4j;

    .line 98
    .line 99
    iget-object v1, v1, La/b4j;->a:La/kt2;

    .line 100
    .line 101
    const-string v3, "dchallenge_alert_open"

    .line 102
    .line 103
    invoke-interface {v1, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v0, La/je;->a:La/s1p;

    .line 107
    .line 108
    const-wide/16 v3, 0x2ac0

    .line 109
    .line 110
    sget-object v1, La/xun;->a:La/xun;

    .line 111
    .line 112
    invoke-virtual {v0, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, La/cr;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/oeg0;

    .line 118
    .line 119
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object p0, p0, La/cr;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, La/peg0;

    .line 130
    .line 131
    new-instance v3, La/jr1;

    .line 132
    .line 133
    sget-object v4, La/avc0;->a:La/avc0;

    .line 134
    .line 135
    invoke-direct {v3, v4}, La/jr1;-><init>(La/fvc0;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v3}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 143
    .line 144
    .line 145
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 146
    .line 147
    invoke-static {v0, p0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :goto_0
    move-object v1, p0

    .line 152
    check-cast v1, La/paw;

    .line 153
    .line 154
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_1

    .line 159
    .line 160
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, La/oe50;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_4
    check-cast p0, La/j4j;

    .line 174
    .line 175
    sget-object v0, La/j4j;->R1:La/kud;

    .line 176
    .line 177
    iget-object p0, p0, La/j4j;->M1:La/fiu0;

    .line 178
    .line 179
    if-eqz p0, :cond_2

    .line 180
    .line 181
    return-object p0

    .line 182
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v4

    .line 186
    :pswitch_5
    check-cast p0, La/f3j;

    .line 187
    .line 188
    iget-object v0, p0, La/f3j;->e:La/i1w0;

    .line 189
    .line 190
    check-cast v0, La/rl1;

    .line 191
    .line 192
    new-instance v1, La/e3j;

    .line 193
    .line 194
    invoke-direct {v1, p0, v2}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 198
    .line 199
    .line 200
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_6
    check-cast p0, La/nxh;

    .line 204
    .line 205
    new-instance v0, La/q0h0;

    .line 206
    .line 207
    iget-object p0, p0, La/nxh;->M1:La/bfi;

    .line 208
    .line 209
    if-eqz p0, :cond_3

    .line 210
    .line 211
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v4

    .line 219
    :pswitch_7
    check-cast p0, La/c5k;

    .line 220
    .line 221
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, La/gii0;

    .line 224
    .line 225
    const-class v0, La/twh;

    .line 226
    .line 227
    sget-object v1, La/sre0;->a:La/tre0;

    .line 228
    .line 229
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    check-cast p0, La/twh;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_8
    check-cast p0, La/ewh;

    .line 241
    .line 242
    iget p0, p0, La/ewh;->f:I

    .line 243
    .line 244
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_9
    check-cast p0, La/yvh;

    .line 250
    .line 251
    new-instance v0, La/q0h0;

    .line 252
    .line 253
    iget-object p0, p0, La/yvh;->M1:La/afi;

    .line 254
    .line 255
    if-eqz p0, :cond_4

    .line 256
    .line 257
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v4

    .line 265
    :pswitch_a
    check-cast p0, La/xr;

    .line 266
    .line 267
    iget-object p0, p0, La/xr;->a:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p0, La/gii0;

    .line 270
    .line 271
    const-class v0, La/evh;

    .line 272
    .line 273
    sget-object v1, La/sre0;->a:La/tre0;

    .line 274
    .line 275
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    check-cast p0, La/evh;

    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_b
    check-cast p0, La/muh;

    .line 287
    .line 288
    sget-object v0, La/muh;->R1:La/kud;

    .line 289
    .line 290
    iget-object p0, p0, La/muh;->P1:La/fiu0;

    .line 291
    .line 292
    if-eqz p0, :cond_5

    .line 293
    .line 294
    return-object p0

    .line 295
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v4

    .line 299
    :pswitch_c
    check-cast p0, La/yzn0;

    .line 300
    .line 301
    iget-object p0, p0, La/yzn0;->a:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p0, La/gii0;

    .line 304
    .line 305
    const-class v0, La/tih;

    .line 306
    .line 307
    sget-object v1, La/sre0;->a:La/tre0;

    .line 308
    .line 309
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    check-cast p0, La/tih;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_d
    check-cast p0, La/c5h;

    .line 321
    .line 322
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iget-object p0, p0, La/c5h;->e:La/pru;

    .line 327
    .line 328
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    iget-object p0, p0, La/sff0;->c:La/ech;

    .line 333
    .line 334
    iget-object p0, p0, La/ech;->a:La/hdh;

    .line 335
    .line 336
    iget-boolean v1, p0, La/hdh;->b:Z

    .line 337
    .line 338
    if-eqz v1, :cond_6

    .line 339
    .line 340
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 341
    .line 342
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    :cond_6
    iget-boolean v1, p0, La/hdh;->d:Z

    .line 346
    .line 347
    if-eqz v1, :cond_7

    .line 348
    .line 349
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 350
    .line 351
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    :cond_7
    iget-boolean p0, p0, La/hdh;->c:Z

    .line 355
    .line 356
    if-eqz p0, :cond_8

    .line 357
    .line 358
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 359
    .line 360
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    :cond_8
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    return-object p0

    .line 368
    :pswitch_e
    check-cast p0, La/y4h;

    .line 369
    .line 370
    sget-object v0, La/y4h;->W1:La/kwd;

    .line 371
    .line 372
    iget-object p0, p0, La/y4h;->M1:La/fiu0;

    .line 373
    .line 374
    if-eqz p0, :cond_9

    .line 375
    .line 376
    return-object p0

    .line 377
    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v4

    .line 381
    :pswitch_f
    check-cast p0, La/ehf0;

    .line 382
    .line 383
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast p0, La/gii0;

    .line 386
    .line 387
    const-class v0, La/y2h;

    .line 388
    .line 389
    sget-object v1, La/sre0;->a:La/tre0;

    .line 390
    .line 391
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    check-cast p0, La/y2h;

    .line 400
    .line 401
    return-object p0

    .line 402
    :pswitch_10
    check-cast p0, La/chf0;

    .line 403
    .line 404
    iget-object p0, p0, La/chf0;->b:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast p0, La/gii0;

    .line 407
    .line 408
    const-class v0, La/kpg;

    .line 409
    .line 410
    sget-object v1, La/sre0;->a:La/tre0;

    .line 411
    .line 412
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    check-cast p0, La/kpg;

    .line 421
    .line 422
    return-object p0

    .line 423
    :pswitch_11
    check-cast p0, La/xr;

    .line 424
    .line 425
    iget-object p0, p0, La/xr;->a:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast p0, La/gii0;

    .line 428
    .line 429
    const-class v0, La/pkg;

    .line 430
    .line 431
    sget-object v1, La/sre0;->a:La/tre0;

    .line 432
    .line 433
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    check-cast p0, La/pkg;

    .line 442
    .line 443
    return-object p0

    .line 444
    :pswitch_12
    check-cast p0, La/qjg;

    .line 445
    .line 446
    iget-object p0, p0, La/qjg;->a:La/gii0;

    .line 447
    .line 448
    const-class v0, La/sfh;

    .line 449
    .line 450
    sget-object v1, La/sre0;->a:La/tre0;

    .line 451
    .line 452
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    check-cast p0, La/sfh;

    .line 461
    .line 462
    return-object p0

    .line 463
    :pswitch_13
    check-cast p0, La/tig;

    .line 464
    .line 465
    iget-object p0, p0, La/tig;->a:La/lgg;

    .line 466
    .line 467
    iget-object p0, p0, La/lgg;->a:La/a4x;

    .line 468
    .line 469
    return-object p0

    .line 470
    :pswitch_14
    check-cast p0, La/i4;

    .line 471
    .line 472
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    return-object p0

    .line 481
    :pswitch_15
    check-cast p0, La/vfg;

    .line 482
    .line 483
    iget-object p0, p0, La/vfg;->a:La/mdm;

    .line 484
    .line 485
    return-object p0

    .line 486
    :pswitch_16
    check-cast p0, La/weg;

    .line 487
    .line 488
    iget-object p0, p0, La/weg;->a:La/mdm;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_17
    check-cast p0, La/dcg;

    .line 492
    .line 493
    sget-object v0, La/dcg;->P1:La/nwd;

    .line 494
    .line 495
    iget-object p0, p0, La/dcg;->L1:La/fiu0;

    .line 496
    .line 497
    if-eqz p0, :cond_a

    .line 498
    .line 499
    return-object p0

    .line 500
    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    throw v4

    .line 504
    :pswitch_18
    check-cast p0, La/hbg;

    .line 505
    .line 506
    iget-object p0, p0, La/hbg;->c:La/tag;

    .line 507
    .line 508
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    new-instance v2, La/oag;

    .line 517
    .line 518
    invoke-direct {v2, p0, v4, v1}, La/oag;-><init>(La/tag;La/yje;B)V

    .line 519
    .line 520
    .line 521
    const/4 p0, 0x3

    .line 522
    invoke-static {v0, v4, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 523
    .line 524
    .line 525
    invoke-static {}, La/dyb;->u0()V

    .line 526
    .line 527
    .line 528
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 529
    .line 530
    return-object p0

    .line 531
    :pswitch_19
    check-cast p0, La/c9g;

    .line 532
    .line 533
    sget-object v0, La/b9g;->R1:La/qud;

    .line 534
    .line 535
    iget-object p0, p0, La/c9g;->c:Landroidx/viewpager2/widget/ViewPager2;

    .line 536
    .line 537
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 538
    .line 539
    .line 540
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object p0

    .line 543
    :pswitch_1a
    check-cast p0, La/b9g;

    .line 544
    .line 545
    new-instance v0, La/q0h0;

    .line 546
    .line 547
    iget-object p0, p0, La/b9g;->K1:La/xai;

    .line 548
    .line 549
    if-eqz p0, :cond_b

    .line 550
    .line 551
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 552
    .line 553
    .line 554
    return-object v0

    .line 555
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v4

    .line 559
    :pswitch_1b
    check-cast p0, La/v8g;

    .line 560
    .line 561
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    iget-object p0, p0, La/v8g;->s:La/n0o0;

    .line 566
    .line 567
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    check-cast p0, Ljava/lang/Number;

    .line 572
    .line 573
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    const v1, 0x43c10b3d

    .line 578
    .line 579
    .line 580
    mul-float/2addr p0, v1

    .line 581
    mul-float/2addr p0, v0

    .line 582
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    return-object p0

    .line 587
    :pswitch_1c
    check-cast p0, La/h8g;

    .line 588
    .line 589
    new-instance v0, La/q0h0;

    .line 590
    .line 591
    iget-object p0, p0, La/h8g;->g2:La/aei;

    .line 592
    .line 593
    if-eqz p0, :cond_c

    .line 594
    .line 595
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 596
    .line 597
    .line 598
    return-object v0

    .line 599
    :cond_c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    throw v4

    .line 603
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
