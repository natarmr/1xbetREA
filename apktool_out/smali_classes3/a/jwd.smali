.class public final synthetic La/jwd;
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
    iput-byte p2, p0, La/jwd;->a:B

    iput-object p1, p0, La/jwd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/jwd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "viewModelFactory"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, La/jwd;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/y7g;

    .line 14
    .line 15
    new-instance v0, La/q0h0;

    .line 16
    .line 17
    iget-object p0, p0, La/y7g;->K1:La/zdi;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v4

    .line 29
    :pswitch_0
    check-cast p0, La/s7g;

    .line 30
    .line 31
    new-instance v0, La/q0h0;

    .line 32
    .line 33
    iget-object p0, p0, La/s7g;->L1:La/ydi;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v4

    .line 45
    :pswitch_1
    check-cast p0, La/l6g;

    .line 46
    .line 47
    new-instance v0, La/q0h0;

    .line 48
    .line 49
    iget-object p0, p0, La/l6g;->K1:La/bei;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v4

    .line 61
    :pswitch_2
    check-cast p0, La/v4g;

    .line 62
    .line 63
    sget-object v0, La/v4g;->l2:La/kud;

    .line 64
    .line 65
    iget-object p0, p0, La/v4g;->g2:La/fiu0;

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v4

    .line 74
    :pswitch_3
    check-cast p0, La/g1g;

    .line 75
    .line 76
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v6, La/r0g;

    .line 81
    .line 82
    const/4 v0, 0x4

    .line 83
    invoke-direct {v6, p0, v0}, La/r0g;-><init>(La/g1g;B)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La/g1g;->v:La/mne;

    .line 87
    .line 88
    iget-object v8, v0, La/mne;->a:La/rwj;

    .line 89
    .line 90
    new-instance v9, La/x0g;

    .line 91
    .line 92
    invoke-direct {v9, p0, v4, v2}, La/x0g;-><init>(La/g1g;La/yje;B)V

    .line 93
    .line 94
    .line 95
    const/16 v10, 0xa

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_4
    check-cast p0, La/o0g;

    .line 105
    .line 106
    sget-object v0, La/o0g;->k2:La/usd;

    .line 107
    .line 108
    iget-object p0, p0, La/o0g;->f2:La/fiu0;

    .line 109
    .line 110
    if-eqz p0, :cond_4

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v4

    .line 117
    :pswitch_5
    check-cast p0, La/chf0;

    .line 118
    .line 119
    iget-object p0, p0, La/chf0;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, La/azj0;

    .line 122
    .line 123
    const-class v0, La/vwf;

    .line 124
    .line 125
    sget-object v1, La/sre0;->a:La/tre0;

    .line 126
    .line 127
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v1, "https://betpari-ads.com/"

    .line 132
    .line 133
    invoke-virtual {p0, v0, v1}, La/azj0;->e(La/sgy;Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, La/vwf;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_6
    check-cast p0, La/bsf;

    .line 141
    .line 142
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v1, p0, La/bsf;->m:La/n0o0;

    .line 147
    .line 148
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, La/fee;

    .line 153
    .line 154
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/util/Collection;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 161
    .line 162
    .line 163
    iget-object v1, p0, La/bsf;->n:La/n0o0;

    .line 164
    .line 165
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, La/fee;

    .line 170
    .line 171
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Ljava/util/Collection;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 178
    .line 179
    .line 180
    iget-object v1, p0, La/bsf;->p:La/n0o0;

    .line 181
    .line 182
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, La/fee;

    .line 187
    .line 188
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, Ljava/util/Collection;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, La/bsf;->o:La/n0o0;

    .line 198
    .line 199
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    check-cast p0, La/fee;

    .line 204
    .line 205
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    check-cast p0, Ljava/util/Collection;

    .line 210
    .line 211
    invoke-static {v0, p0, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_7
    check-cast p0, La/xsh;

    .line 217
    .line 218
    iget-object p0, p0, La/xsh;->c:Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    .line 219
    .line 220
    const/16 v0, 0x8

    .line 221
    .line 222
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 223
    .line 224
    .line 225
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_8
    check-cast p0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/game_log/bomb/Cs2GameLogBombTimerView;

    .line 229
    .line 230
    invoke-static {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/game_log/bomb/Cs2GameLogBombTimerView;->c(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/game_log/bomb/Cs2GameLogBombTimerView;)La/vne;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :pswitch_9
    check-cast p0, La/alf;

    .line 236
    .line 237
    new-instance v0, La/q0h0;

    .line 238
    .line 239
    iget-object p0, p0, La/alf;->L1:La/rdi;

    .line 240
    .line 241
    if-eqz p0, :cond_5

    .line 242
    .line 243
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 244
    .line 245
    .line 246
    return-object v0

    .line 247
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v4

    .line 251
    :pswitch_a
    check-cast p0, La/tgf;

    .line 252
    .line 253
    iget-object p0, p0, La/tgf;->a:La/gii0;

    .line 254
    .line 255
    const-class v0, La/tef;

    .line 256
    .line 257
    sget-object v1, La/sre0;->a:La/tre0;

    .line 258
    .line 259
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    check-cast p0, La/tef;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_b
    check-cast p0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;

    .line 271
    .line 272
    invoke-static {p0}, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->e(Lorg/xplatform/crystal/presentation/views/CrystalFieldView;)Lkotlin/Unit;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    return-object p0

    .line 277
    :pswitch_c
    check-cast p0, La/vdf;

    .line 278
    .line 279
    iget-object v0, p0, La/vdf;->a:La/vby;

    .line 280
    .line 281
    iget-object p0, p0, La/vdf;->b:Ljava/lang/String;

    .line 282
    .line 283
    sget-object v2, La/ydf;->Companion:La/xdf;

    .line 284
    .line 285
    invoke-virtual {v2}, La/xdf;->serializer()La/jiy;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    check-cast v2, La/jiy;

    .line 290
    .line 291
    invoke-virtual {v0, v2, p0}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    check-cast p0, La/ydf;

    .line 296
    .line 297
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    iget-object v0, p0, La/ydf;->a:Ljava/lang/Boolean;

    .line 301
    .line 302
    if-eqz v0, :cond_6

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    move v3, v0

    .line 309
    goto :goto_0

    .line 310
    :cond_6
    move v3, v1

    .line 311
    :goto_0
    iget-object v0, p0, La/ydf;->c:Ljava/lang/Boolean;

    .line 312
    .line 313
    if-eqz v0, :cond_7

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    move v5, v0

    .line 320
    goto :goto_1

    .line 321
    :cond_7
    move v5, v1

    .line 322
    :goto_1
    iget-object v0, p0, La/ydf;->b:Ljava/lang/Boolean;

    .line 323
    .line 324
    if-eqz v0, :cond_8

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    move v4, v0

    .line 331
    goto :goto_2

    .line 332
    :cond_8
    move v4, v1

    .line 333
    :goto_2
    iget-object v0, p0, La/ydf;->d:Ljava/lang/Boolean;

    .line 334
    .line 335
    if-eqz v0, :cond_9

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    move v6, v0

    .line 342
    goto :goto_3

    .line 343
    :cond_9
    move v6, v1

    .line 344
    :goto_3
    iget-object p0, p0, La/ydf;->e:Ljava/lang/Boolean;

    .line 345
    .line 346
    if-eqz p0, :cond_a

    .line 347
    .line 348
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    :cond_a
    move v7, v1

    .line 353
    new-instance v2, La/zdf;

    .line 354
    .line 355
    invoke-direct/range {v2 .. v7}, La/zdf;-><init>(ZZZZZ)V

    .line 356
    .line 357
    .line 358
    return-object v2

    .line 359
    :pswitch_d
    check-cast p0, La/lbf;

    .line 360
    .line 361
    iget-object p0, p0, La/lbf;->r:La/ol60;

    .line 362
    .line 363
    new-instance v0, La/zaf;

    .line 364
    .line 365
    invoke-direct {v0, v1}, La/zaf;-><init>(Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_e
    check-cast p0, La/d2f;

    .line 375
    .line 376
    sget-object v0, La/d2f;->O1:La/std;

    .line 377
    .line 378
    iget-object p0, p0, La/d2f;->K1:La/fiu0;

    .line 379
    .line 380
    if-eqz p0, :cond_b

    .line 381
    .line 382
    return-object p0

    .line 383
    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v4

    .line 387
    :pswitch_f
    check-cast p0, La/p2f;

    .line 388
    .line 389
    iget p0, p0, La/p2f;->g:I

    .line 390
    .line 391
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    return-object p0

    .line 396
    :pswitch_10
    check-cast p0, La/ehf0;

    .line 397
    .line 398
    iget-object p0, p0, La/ehf0;->b:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast p0, La/gii0;

    .line 401
    .line 402
    const-class v0, La/vre;

    .line 403
    .line 404
    sget-object v1, La/sre0;->a:La/tre0;

    .line 405
    .line 406
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    check-cast p0, La/vre;

    .line 415
    .line 416
    return-object p0

    .line 417
    :pswitch_11
    check-cast p0, La/rye;

    .line 418
    .line 419
    iget-object p0, p0, La/rye;->K1:La/ldi;

    .line 420
    .line 421
    if-eqz p0, :cond_c

    .line 422
    .line 423
    return-object p0

    .line 424
    :cond_c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw v4

    .line 428
    :pswitch_12
    check-cast p0, La/xqe;

    .line 429
    .line 430
    iget-object p0, p0, La/xqe;->a:La/rrc;

    .line 431
    .line 432
    iget-object p0, p0, La/rrc;->b:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast p0, Lorg/xplatform/onexdatabase/OnexDatabase;

    .line 435
    .line 436
    invoke-virtual {p0}, Lorg/xplatform/onexdatabase/OnexDatabase;->k()La/nqe;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    return-object p0

    .line 441
    :pswitch_13
    check-cast p0, La/ma80;

    .line 442
    .line 443
    new-instance v0, La/d7q0;

    .line 444
    .line 445
    const/4 v1, 0x0

    .line 446
    invoke-direct {v0, p0, v1}, La/d7q0;-><init>(La/ma80;F)V

    .line 447
    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_14
    check-cast p0, La/djz;

    .line 451
    .line 452
    invoke-virtual {p0}, La/djz;->d()La/b9q0;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    return-object p0

    .line 457
    :pswitch_15
    check-cast p0, La/fee;

    .line 458
    .line 459
    iget-object v0, p0, La/fee;->b:La/l7m0;

    .line 460
    .line 461
    iget-object v1, p0, La/fee;->a:Lkotlin/jvm/functions/Function1;

    .line 462
    .line 463
    if-eqz v0, :cond_d

    .line 464
    .line 465
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    if-eqz v0, :cond_d

    .line 470
    .line 471
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    if-eqz v0, :cond_d

    .line 476
    .line 477
    goto :goto_4

    .line 478
    :cond_d
    invoke-virtual {p0}, La/fee;->a()La/pz40;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    :goto_4
    return-object v0

    .line 491
    :pswitch_16
    check-cast p0, La/dbe;

    .line 492
    .line 493
    sget-object v0, La/dbe;->k2:La/kud;

    .line 494
    .line 495
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    new-instance v1, La/ya;

    .line 504
    .line 505
    const/16 v2, 0x12

    .line 506
    .line 507
    invoke-direct {v1, p0, v4, v2}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 508
    .line 509
    .line 510
    const/4 p0, 0x3

    .line 511
    invoke-static {v0, v4, v4, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 512
    .line 513
    .line 514
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 515
    .line 516
    return-object p0

    .line 517
    :pswitch_17
    check-cast p0, La/vae;

    .line 518
    .line 519
    iget-object p0, p0, La/vae;->r:La/p7m0;

    .line 520
    .line 521
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 522
    .line 523
    invoke-virtual {p0, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 527
    .line 528
    return-object p0

    .line 529
    :pswitch_18
    check-cast p0, La/nhf0;

    .line 530
    .line 531
    iget-object v0, p0, La/nhf0;->b:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, La/pru;

    .line 534
    .line 535
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    iget-object v0, v0, La/sff0;->j0:Ljava/lang/String;

    .line 540
    .line 541
    invoke-virtual {p0}, La/nhf0;->m()La/mbe;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    sget-object v3, La/mbe;->a:La/mbe;

    .line 546
    .line 547
    if-ne v1, v3, :cond_e

    .line 548
    .line 549
    const-string p0, "https://mobilaserverstest.xyz/supphelper/"

    .line 550
    .line 551
    goto :goto_5

    .line 552
    :cond_e
    sget-object v3, La/mbe;->c:La/mbe;

    .line 553
    .line 554
    if-ne v1, v3, :cond_f

    .line 555
    .line 556
    const-string p0, "https://consdesk.com/widget/stage/api/"

    .line 557
    .line 558
    goto :goto_5

    .line 559
    :cond_f
    sget-object v3, La/mbe;->d:La/mbe;

    .line 560
    .line 561
    if-ne v1, v3, :cond_10

    .line 562
    .line 563
    iget-object p0, p0, La/nhf0;->a:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast p0, La/j1q0;

    .line 566
    .line 567
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 568
    .line 569
    invoke-virtual {p0}, La/m1q0;->n()La/z0q0;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    iget-object p0, p0, La/z0q0;->b:Ljava/lang/String;

    .line 574
    .line 575
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    const-string v0, "https://webx-consultant-widget-v2-%s.antflatair.com/services/widget/"

    .line 584
    .line 585
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    goto :goto_5

    .line 590
    :cond_10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    if-nez v1, :cond_11

    .line 595
    .line 596
    iget-object p0, p0, La/nhf0;->c:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast p0, La/ntu;

    .line 599
    .line 600
    invoke-virtual {p0}, La/ntu;->a()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p0

    .line 604
    const-string v0, "/supphelper/"

    .line 605
    .line 606
    invoke-static {p0, v0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object p0

    .line 610
    goto :goto_5

    .line 611
    :cond_11
    const-string p0, "https://"

    .line 612
    .line 613
    const-string v1, "/widget/"

    .line 614
    .line 615
    invoke-static {p0, v0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object p0

    .line 619
    :goto_5
    return-object p0

    .line 620
    :pswitch_19
    check-cast p0, La/ehf0;

    .line 621
    .line 622
    const-string v0, ":memory:"

    .line 623
    .line 624
    invoke-virtual {p0, v0}, La/ehf0;->a(Ljava/lang/String;)La/qpg0;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    return-object p0

    .line 629
    :pswitch_1a
    check-cast p0, La/g1e;

    .line 630
    .line 631
    iget-boolean v0, p0, La/g1e;->H:Z

    .line 632
    .line 633
    if-nez v0, :cond_12

    .line 634
    .line 635
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 636
    .line 637
    const-string v1, "Connection terminated"

    .line 638
    .line 639
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    sget-object v6, La/z0e;->a:La/z0e;

    .line 647
    .line 648
    new-instance v9, La/w0e;

    .line 649
    .line 650
    invoke-direct {v9, v0, p0, v4, v2}, La/w0e;-><init>(Ljava/lang/Throwable;La/g1e;La/yje;B)V

    .line 651
    .line 652
    .line 653
    const/16 v10, 0xe

    .line 654
    .line 655
    const/4 v7, 0x0

    .line 656
    const/4 v8, 0x0

    .line 657
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 658
    .line 659
    .line 660
    :cond_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 661
    .line 662
    return-object p0

    .line 663
    :pswitch_1b
    check-cast p0, La/oyd;

    .line 664
    .line 665
    iget-object p0, p0, La/oyd;->h2:La/fiu0;

    .line 666
    .line 667
    if-eqz p0, :cond_13

    .line 668
    .line 669
    return-object p0

    .line 670
    :cond_13
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    throw v4

    .line 674
    :pswitch_1c
    check-cast p0, La/mwd;

    .line 675
    .line 676
    sget-object v0, La/mwd;->k2:La/kwd;

    .line 677
    .line 678
    iget-object p0, p0, La/mwd;->h2:La/fiu0;

    .line 679
    .line 680
    if-eqz p0, :cond_14

    .line 681
    .line 682
    return-object p0

    .line 683
    :cond_14
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    throw v4

    .line 687
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
