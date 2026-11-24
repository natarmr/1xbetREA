.class public final synthetic La/gvj0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/gvj0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gvj0;->a:B

    .line 4
    .line 5
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/v0l0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/k3t0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/b1l0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/x0l0;

    .line 40
    .line 41
    iget-object v1, v1, La/b1l0;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 42
    .line 43
    iget-object v2, v0, La/x0l0;->K1:La/ii;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, La/x0l0;->M1:La/a8z;

    .line 58
    .line 59
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/k3t0;

    .line 64
    .line 65
    sget-object v1, La/o0l0;->a:La/o0l0;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_0
    const-string v0, "actionDialogManager"

    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v5

    .line 79
    :pswitch_1
    move-object/from16 v1, p1

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Throwable;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, La/tyk0;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_2
    move-object/from16 v1, p1

    .line 97
    .line 98
    check-cast v1, Ljava/lang/Throwable;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, La/tyk0;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_3
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, Ljava/lang/Throwable;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, La/tyk0;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_4
    move-object/from16 v1, p1

    .line 131
    .line 132
    check-cast v1, Ljava/lang/Throwable;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, La/tyk0;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_5
    move-object/from16 v1, p1

    .line 148
    .line 149
    check-cast v1, Ljava/lang/Throwable;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, La/tyk0;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_6
    move-object/from16 v1, p1

    .line 165
    .line 166
    check-cast v1, Ljava/lang/Throwable;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, La/tyk0;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_7
    move-object/from16 v1, p1

    .line 182
    .line 183
    check-cast v1, Ljava/lang/Throwable;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, La/tyk0;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_8
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, Ljava/lang/Throwable;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, La/tyk0;

    .line 208
    .line 209
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_9
    move-object/from16 v1, p1

    .line 216
    .line 217
    check-cast v1, Ljava/lang/Throwable;

    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, La/tyk0;

    .line 225
    .line 226
    invoke-virtual {v0, v1}, La/tyk0;->x(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_a
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, La/ilk0;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, La/jlk0;

    .line 242
    .line 243
    sget-object v2, La/jlk0;->n2:La/lme0;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object v2, v0, La/jlk0;->k2:La/phf0;

    .line 249
    .line 250
    instance-of v3, v1, La/glk0;

    .line 251
    .line 252
    if-eqz v3, :cond_1

    .line 253
    .line 254
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 255
    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_1
    instance-of v3, v1, La/hlk0;

    .line 259
    .line 260
    if-eqz v3, :cond_2

    .line 261
    .line 262
    sget-object v3, La/jlk0;->o2:[La/iiy;

    .line 263
    .line 264
    aget-object v4, v3, v6

    .line 265
    .line 266
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    aget-object v3, v3, v6

    .line 271
    .line 272
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    check-cast v1, La/hlk0;

    .line 277
    .line 278
    iget-object v1, v1, La/hlk0;->a:Ljava/lang/String;

    .line 279
    .line 280
    new-instance v3, Lkotlin/Pair;

    .line 281
    .line 282
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v1, v0, v4}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 300
    .line 301
    .line 302
    :goto_1
    return-object v5

    .line 303
    :pswitch_b
    move-object/from16 v1, p1

    .line 304
    .line 305
    check-cast v1, La/clk0;

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, La/dlk0;

    .line 313
    .line 314
    sget-object v2, La/dlk0;->m2:La/gle0;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iget-object v2, v0, La/dlk0;->k2:La/phf0;

    .line 320
    .line 321
    sget-object v3, La/alk0;->a:La/alk0;

    .line 322
    .line 323
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_3

    .line 328
    .line 329
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 330
    .line 331
    .line 332
    goto :goto_2

    .line 333
    :cond_3
    instance-of v3, v1, La/blk0;

    .line 334
    .line 335
    if-eqz v3, :cond_4

    .line 336
    .line 337
    sget-object v3, La/dlk0;->n2:[La/iiy;

    .line 338
    .line 339
    aget-object v4, v3, v6

    .line 340
    .line 341
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    aget-object v3, v3, v6

    .line 346
    .line 347
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v1, La/blk0;

    .line 352
    .line 353
    iget-object v1, v1, La/blk0;->a:La/uzb0;

    .line 354
    .line 355
    new-instance v3, Lkotlin/Pair;

    .line 356
    .line 357
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v1, v0, v4}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    goto :goto_3

    .line 374
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 375
    .line 376
    .line 377
    :goto_3
    return-object v5

    .line 378
    :pswitch_c
    move-object/from16 v9, p1

    .line 379
    .line 380
    check-cast v9, La/ghk0;

    .line 381
    .line 382
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v0, La/tik0;

    .line 388
    .line 389
    sget-object v1, La/tik0;->Q1:[La/iiy;

    .line 390
    .line 391
    invoke-virtual {v0}, La/tik0;->I0()La/cjk0;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    iget-object v1, v7, La/cjk0;->m:La/p7m0;

    .line 396
    .line 397
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    move-object v2, v0

    .line 402
    check-cast v2, La/pik0;

    .line 403
    .line 404
    new-instance v2, La/nik0;

    .line 405
    .line 406
    invoke-direct {v2, v4}, La/nik0;-><init>(Z)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_5

    .line 414
    .line 415
    new-instance v8, La/su4;

    .line 416
    .line 417
    iget-object v12, v9, La/ghk0;->d:Ljava/lang/String;

    .line 418
    .line 419
    iget v11, v9, La/ghk0;->a:I

    .line 420
    .line 421
    iget-object v13, v9, La/ghk0;->b:Ljava/lang/String;

    .line 422
    .line 423
    iget-object v14, v9, La/ghk0;->c:Ljava/lang/String;

    .line 424
    .line 425
    iget-object v0, v7, La/cjk0;->k:La/v8d;

    .line 426
    .line 427
    const/16 v1, 0xd

    .line 428
    .line 429
    if-ne v11, v1, :cond_6

    .line 430
    .line 431
    iget-object v0, v0, La/v8d;->m:Ljava/lang/String;

    .line 432
    .line 433
    :goto_4
    move-object v15, v0

    .line 434
    move-object v10, v8

    .line 435
    goto :goto_5

    .line 436
    :cond_6
    iget-object v0, v0, La/v8d;->k:Ljava/lang/String;

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :goto_5
    invoke-direct/range {v10 .. v15}, La/su4;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    move-object v8, v10

    .line 443
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    iget-object v1, v7, La/cjk0;->b:La/mne;

    .line 448
    .line 449
    iget-object v13, v1, La/mne;->a:La/rwj;

    .line 450
    .line 451
    new-instance v1, La/vik0;

    .line 452
    .line 453
    invoke-direct {v1, v7, v4}, La/vik0;-><init>(La/cjk0;B)V

    .line 454
    .line 455
    .line 456
    new-instance v14, La/kpb0;

    .line 457
    .line 458
    const/4 v10, 0x0

    .line 459
    const/16 v11, 0x11

    .line 460
    .line 461
    move-object v6, v14

    .line 462
    invoke-direct/range {v6 .. v11}, La/kpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 463
    .line 464
    .line 465
    const/16 v15, 0xa

    .line 466
    .line 467
    const/4 v12, 0x0

    .line 468
    move-object v10, v0

    .line 469
    move-object v11, v1

    .line 470
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 471
    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_d
    move-object/from16 v1, p1

    .line 477
    .line 478
    check-cast v1, Ljava/lang/Number;

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v0, La/qah0;

    .line 487
    .line 488
    invoke-interface {v0, v1}, La/qah0;->a(F)F

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    :pswitch_e
    move-object/from16 v1, p1

    .line 498
    .line 499
    check-cast v1, Ljava/lang/Number;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, La/qah0;

    .line 508
    .line 509
    invoke-interface {v0, v1}, La/qah0;->a(F)F

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    return-object v0

    .line 518
    :pswitch_f
    move-object/from16 v1, p1

    .line 519
    .line 520
    check-cast v1, La/pck0;

    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v0, La/k3t0;

    .line 528
    .line 529
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_10
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, La/w4k0;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, La/k3t0;

    .line 545
    .line 546
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_11
    move-object/from16 v1, p1

    .line 553
    .line 554
    check-cast v1, Ljava/lang/Throwable;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast v0, La/l2k0;

    .line 562
    .line 563
    iget-object v2, v0, La/l2k0;->p:La/duj;

    .line 564
    .line 565
    new-instance v3, La/i2k0;

    .line 566
    .line 567
    invoke-direct {v3, v0, v6}, La/i2k0;-><init>(La/l2k0;B)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 571
    .line 572
    .line 573
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 574
    .line 575
    return-object v0

    .line 576
    :pswitch_12
    move-object/from16 v1, p1

    .line 577
    .line 578
    check-cast v1, Ljava/lang/Throwable;

    .line 579
    .line 580
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, La/l2k0;

    .line 586
    .line 587
    iget-object v2, v0, La/l2k0;->p:La/duj;

    .line 588
    .line 589
    new-instance v3, La/i2k0;

    .line 590
    .line 591
    invoke-direct {v3, v0, v6}, La/i2k0;-><init>(La/l2k0;B)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 595
    .line 596
    .line 597
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_13
    move-object/from16 v1, p1

    .line 601
    .line 602
    check-cast v1, Ljava/lang/Throwable;

    .line 603
    .line 604
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v0, La/l2k0;

    .line 610
    .line 611
    iget-object v2, v0, La/l2k0;->p:La/duj;

    .line 612
    .line 613
    new-instance v3, La/i2k0;

    .line 614
    .line 615
    invoke-direct {v3, v0, v4}, La/i2k0;-><init>(La/l2k0;B)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 619
    .line 620
    .line 621
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    return-object v0

    .line 624
    :pswitch_14
    move-object/from16 v1, p1

    .line 625
    .line 626
    check-cast v1, Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v0, La/wyj0;

    .line 634
    .line 635
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    invoke-static {v1}, Lkotlin/text/b;->h(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    if-nez v1, :cond_7

    .line 643
    .line 644
    new-instance v1, Ljava/math/BigDecimal;

    .line 645
    .line 646
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    :cond_7
    move-object v4, v1

    .line 654
    iget-object v1, v0, La/wyj0;->E:La/p7m0;

    .line 655
    .line 656
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    move-object v3, v0

    .line 661
    check-cast v3, La/od7;

    .line 662
    .line 663
    const/4 v8, 0x0

    .line 664
    const/16 v9, 0x1e

    .line 665
    .line 666
    const/4 v5, 0x0

    .line 667
    const/4 v6, 0x0

    .line 668
    const/4 v7, 0x0

    .line 669
    invoke-static/range {v3 .. v9}, La/od7;->a(La/od7;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;I)La/od7;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    if-eqz v0, :cond_8

    .line 678
    .line 679
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 680
    .line 681
    return-object v0

    .line 682
    :pswitch_15
    move-object/from16 v1, p1

    .line 683
    .line 684
    check-cast v1, Ljava/lang/Throwable;

    .line 685
    .line 686
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, La/xxj0;

    .line 692
    .line 693
    invoke-virtual {v0, v1}, La/xxj0;->C(Ljava/lang/Throwable;)V

    .line 694
    .line 695
    .line 696
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 697
    .line 698
    return-object v0

    .line 699
    :pswitch_16
    move-object/from16 v1, p1

    .line 700
    .line 701
    check-cast v1, Ljava/lang/Throwable;

    .line 702
    .line 703
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v0, La/yxj0;

    .line 709
    .line 710
    invoke-virtual {v0, v1}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 711
    .line 712
    .line 713
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 714
    .line 715
    return-object v0

    .line 716
    :pswitch_17
    move-object/from16 v1, p1

    .line 717
    .line 718
    check-cast v1, Ljava/lang/Throwable;

    .line 719
    .line 720
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v0, La/xxj0;

    .line 726
    .line 727
    invoke-virtual {v0, v1}, La/xxj0;->C(Ljava/lang/Throwable;)V

    .line 728
    .line 729
    .line 730
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_18
    move-object/from16 v1, p1

    .line 734
    .line 735
    check-cast v1, Ljava/lang/Throwable;

    .line 736
    .line 737
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v0, La/yxj0;

    .line 743
    .line 744
    invoke-virtual {v0, v1}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 745
    .line 746
    .line 747
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object v0

    .line 750
    :pswitch_19
    move-object/from16 v1, p1

    .line 751
    .line 752
    check-cast v1, Ljava/lang/Throwable;

    .line 753
    .line 754
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v0, La/yxj0;

    .line 760
    .line 761
    invoke-virtual {v0, v1}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 762
    .line 763
    .line 764
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 765
    .line 766
    return-object v0

    .line 767
    :pswitch_1a
    move-object/from16 v1, p1

    .line 768
    .line 769
    check-cast v1, Ljava/lang/Throwable;

    .line 770
    .line 771
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v0, La/yxj0;

    .line 777
    .line 778
    invoke-virtual {v0, v1}, La/d06;->y(Ljava/lang/Throwable;)V

    .line 779
    .line 780
    .line 781
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 782
    .line 783
    return-object v0

    .line 784
    :pswitch_1b
    move-object/from16 v1, p1

    .line 785
    .line 786
    check-cast v1, Ljava/lang/String;

    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v0, La/yxj0;

    .line 794
    .line 795
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    iget-object v4, v0, La/yxj0;->X:La/p7m0;

    .line 799
    .line 800
    :cond_9
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    move-object v5, v0

    .line 805
    check-cast v5, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 806
    .line 807
    invoke-static {v1}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 808
    .line 809
    .line 810
    move-result-object v6

    .line 811
    if-eqz v6, :cond_a

    .line 812
    .line 813
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 814
    .line 815
    .line 816
    move-result-wide v6

    .line 817
    goto :goto_6

    .line 818
    :cond_a
    move-wide v6, v2

    .line 819
    :goto_6
    const/16 v20, 0x0

    .line 820
    .line 821
    const/16 v21, 0x1dfe

    .line 822
    .line 823
    const-wide/16 v8, 0x0

    .line 824
    .line 825
    const-wide/16 v10, 0x0

    .line 826
    .line 827
    const-wide/16 v12, 0x0

    .line 828
    .line 829
    const/4 v14, 0x0

    .line 830
    const/4 v15, 0x0

    .line 831
    const/16 v16, 0x0

    .line 832
    .line 833
    const/16 v17, 0x1

    .line 834
    .line 835
    const/16 v18, 0x0

    .line 836
    .line 837
    const/16 v19, 0x0

    .line 838
    .line 839
    invoke-static/range {v5 .. v21}, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;DDDDLjava/lang/String;ZZZZZZI)Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    if-eqz v0, :cond_9

    .line 848
    .line 849
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 850
    .line 851
    return-object v0

    .line 852
    :pswitch_1c
    move-object/from16 v1, p1

    .line 853
    .line 854
    check-cast v1, Ljava/lang/String;

    .line 855
    .line 856
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v0, La/xxj0;

    .line 862
    .line 863
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    iget-object v0, v0, La/xxj0;->C0:La/p7m0;

    .line 867
    .line 868
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    move-object v5, v4

    .line 873
    check-cast v5, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 874
    .line 875
    invoke-static {v1}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 876
    .line 877
    .line 878
    move-result-object v6

    .line 879
    if-eqz v6, :cond_c

    .line 880
    .line 881
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 882
    .line 883
    .line 884
    move-result-wide v6

    .line 885
    goto :goto_7

    .line 886
    :cond_c
    move-wide v6, v2

    .line 887
    :goto_7
    const/16 v25, 0x0

    .line 888
    .line 889
    const v26, 0x1f7fe

    .line 890
    .line 891
    .line 892
    const-wide/16 v8, 0x0

    .line 893
    .line 894
    const-wide/16 v10, 0x0

    .line 895
    .line 896
    const-wide/16 v12, 0x0

    .line 897
    .line 898
    const-wide/16 v14, 0x0

    .line 899
    .line 900
    const/16 v16, 0x0

    .line 901
    .line 902
    const/16 v17, 0x0

    .line 903
    .line 904
    const/16 v18, 0x0

    .line 905
    .line 906
    const/16 v19, 0x0

    .line 907
    .line 908
    const/16 v20, 0x1

    .line 909
    .line 910
    const/16 v21, 0x0

    .line 911
    .line 912
    const/16 v22, 0x0

    .line 913
    .line 914
    const/16 v23, 0x0

    .line 915
    .line 916
    const/16 v24, 0x0

    .line 917
    .line 918
    invoke-static/range {v5 .. v26}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 919
    .line 920
    .line 921
    move-result-object v5

    .line 922
    invoke-virtual {v0, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v4

    .line 926
    if-eqz v4, :cond_b

    .line 927
    .line 928
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 929
    .line 930
    return-object v0

    .line 931
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
