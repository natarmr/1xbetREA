.class public final synthetic La/l3a0;
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
    iput-byte p2, p0, La/l3a0;->a:B

    iput-object p1, p0, La/l3a0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l3a0;->a:B

    .line 4
    .line 5
    const-string v2, "viewModelFactory"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/l3a0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, La/ocl;

    .line 15
    .line 16
    new-instance v0, La/mn00;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/mn00;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/mn00;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/mn00;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v16, La/iun;->a:La/iun;

    .line 37
    .line 38
    sget-object v5, La/pb10;->g:La/pb10;

    .line 39
    .line 40
    const-wide/16 v13, 0x0

    .line 41
    .line 42
    const/16 v15, 0x35e

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const v9, 0x7f130677

    .line 48
    .line 49
    .line 50
    const v10, 0x7f131690

    .line 51
    .line 52
    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    invoke-static/range {v4 .. v15}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 56
    .line 57
    .line 58
    move-result-object v15

    .line 59
    new-instance v5, La/nsa0;

    .line 60
    .line 61
    const/4 v12, 0x0

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v6, 0x1

    .line 64
    const/4 v11, 0x0

    .line 65
    move-object v7, v0

    .line 66
    move-object v8, v1

    .line 67
    move-object v9, v2

    .line 68
    move-object v10, v3

    .line 69
    move-object/from16 v14, v16

    .line 70
    .line 71
    invoke-direct/range {v5 .. v15}, La/nsa0;-><init>(ZLa/pn00;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;La/mdm;)V

    .line 72
    .line 73
    .line 74
    return-object v5

    .line 75
    :pswitch_0
    check-cast v0, La/sma0;

    .line 76
    .line 77
    iget v0, v0, La/sma0;->e:I

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :pswitch_1
    check-cast v0, La/ema0;

    .line 85
    .line 86
    new-instance v1, La/q0h0;

    .line 87
    .line 88
    iget-object v0, v0, La/ema0;->L1:La/joi;

    .line 89
    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v3

    .line 100
    :pswitch_2
    check-cast v0, La/ola0;

    .line 101
    .line 102
    iget v0, v0, La/ola0;->e:I

    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0

    .line 109
    :pswitch_3
    check-cast v0, La/f7u;

    .line 110
    .line 111
    invoke-virtual {v0}, La/f7u;->q()La/hko0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    new-instance v1, La/bla0;

    .line 116
    .line 117
    iget-object v0, v0, La/hko0;->c:Ljava/util/List;

    .line 118
    .line 119
    invoke-direct {v1, v0}, La/bla0;-><init>(Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    return-object v1

    .line 123
    :pswitch_4
    check-cast v0, La/ala0;

    .line 124
    .line 125
    sget-object v1, La/ala0;->O1:La/mi70;

    .line 126
    .line 127
    iget-object v0, v0, La/ala0;->L1:La/fiu0;

    .line 128
    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v3

    .line 136
    :pswitch_5
    check-cast v0, La/vka0;

    .line 137
    .line 138
    sget-object v1, La/vka0;->R1:La/nh70;

    .line 139
    .line 140
    iget-object v0, v0, La/vka0;->M1:La/fiu0;

    .line 141
    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v3

    .line 149
    :pswitch_6
    check-cast v0, La/lja0;

    .line 150
    .line 151
    iget-object v0, v0, La/lja0;->k2:La/fiu0;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    return-object v0

    .line 156
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v3

    .line 160
    :pswitch_7
    check-cast v0, La/g090;

    .line 161
    .line 162
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, La/gii0;

    .line 165
    .line 166
    const-class v1, La/oha0;

    .line 167
    .line 168
    sget-object v2, La/sre0;->a:La/tre0;

    .line 169
    .line 170
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/oha0;

    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_8
    check-cast v0, La/uia0;

    .line 182
    .line 183
    iget-object v0, v0, La/uia0;->k2:La/fiu0;

    .line 184
    .line 185
    if-eqz v0, :cond_4

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v3

    .line 192
    :pswitch_9
    check-cast v0, La/tia0;

    .line 193
    .line 194
    new-instance v1, La/q0h0;

    .line 195
    .line 196
    iget-object v0, v0, La/tia0;->M1:La/foi;

    .line 197
    .line 198
    if-eqz v0, :cond_5

    .line 199
    .line 200
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 201
    .line 202
    .line 203
    return-object v1

    .line 204
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v3

    .line 208
    :pswitch_a
    check-cast v0, La/cu;

    .line 209
    .line 210
    new-instance v1, La/lia0;

    .line 211
    .line 212
    sget-object v2, La/iun;->a:La/iun;

    .line 213
    .line 214
    iget-object v3, v0, La/cu;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, La/mrc;

    .line 217
    .line 218
    invoke-virtual {v3}, La/mrc;->b()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    iget-object v4, v0, La/cu;->d:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v4, La/t1u;

    .line 225
    .line 226
    iget-object v0, v0, La/cu;->c:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, La/mrc;

    .line 229
    .line 230
    invoke-virtual {v0, v3}, La/mrc;->a(Ljava/lang/String;)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {v4, v0, v3}, La/t1u;->a(ILjava/lang/String;)La/kjo0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    iget v0, v0, La/kjo0;->a:I

    .line 239
    .line 240
    invoke-direct {v1, v0, v2}, La/lia0;-><init>(ILjava/util/List;)V

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    :pswitch_b
    check-cast v0, La/kia0;

    .line 245
    .line 246
    iget-object v0, v0, La/kia0;->k2:La/fiu0;

    .line 247
    .line 248
    if-eqz v0, :cond_6

    .line 249
    .line 250
    return-object v0

    .line 251
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v3

    .line 255
    :pswitch_c
    check-cast v0, La/dq00;

    .line 256
    .line 257
    iget-object v0, v0, La/dq00;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, La/gii0;

    .line 260
    .line 261
    const-class v1, La/qha0;

    .line 262
    .line 263
    sget-object v2, La/sre0;->a:La/tre0;

    .line 264
    .line 265
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, La/qha0;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_d
    check-cast v0, La/tha0;

    .line 277
    .line 278
    iget-object v0, v0, La/tha0;->k2:La/fiu0;

    .line 279
    .line 280
    if-eqz v0, :cond_7

    .line 281
    .line 282
    return-object v0

    .line 283
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v3

    .line 287
    :pswitch_e
    check-cast v0, La/uja0;

    .line 288
    .line 289
    iget v0, v0, La/uja0;->d:I

    .line 290
    .line 291
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0

    .line 296
    :pswitch_f
    check-cast v0, La/cha0;

    .line 297
    .line 298
    sget-object v1, La/cha0;->P1:La/xi70;

    .line 299
    .line 300
    iget-object v0, v0, La/cha0;->L1:La/fiu0;

    .line 301
    .line 302
    if-eqz v0, :cond_8

    .line 303
    .line 304
    return-object v0

    .line 305
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v3

    .line 309
    :pswitch_10
    check-cast v0, La/hga0;

    .line 310
    .line 311
    iget-object v0, v0, La/hga0;->d:La/a4x;

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    return-object v0

    .line 322
    :pswitch_11
    check-cast v0, La/nw20;

    .line 323
    .line 324
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, La/gii0;

    .line 327
    .line 328
    const-class v1, La/wea0;

    .line 329
    .line 330
    sget-object v2, La/sre0;->a:La/tre0;

    .line 331
    .line 332
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, La/wea0;

    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_12
    check-cast v0, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 344
    .line 345
    new-instance v1, La/zda0;

    .line 346
    .line 347
    invoke-direct {v1, v0, v3}, La/zda0;-><init>(Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;La/j0g0;)V

    .line 348
    .line 349
    .line 350
    return-object v1

    .line 351
    :pswitch_13
    check-cast v0, La/uda0;

    .line 352
    .line 353
    iget-object v0, v0, La/uda0;->a:La/mdm;

    .line 354
    .line 355
    return-object v0

    .line 356
    :pswitch_14
    check-cast v0, La/kd30;

    .line 357
    .line 358
    iget-object v0, v0, La/kd30;->a:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, La/gii0;

    .line 361
    .line 362
    const-class v1, La/zca0;

    .line 363
    .line 364
    sget-object v2, La/sre0;->a:La/tre0;

    .line 365
    .line 366
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    check-cast v0, La/zca0;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_15
    check-cast v0, La/zn00;

    .line 378
    .line 379
    iget-object v0, v0, La/zn00;->a:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, La/gii0;

    .line 382
    .line 383
    const-class v1, La/a8a0;

    .line 384
    .line 385
    sget-object v2, La/sre0;->a:La/tre0;

    .line 386
    .line 387
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, La/a8a0;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_16
    check-cast v0, La/q7a0;

    .line 399
    .line 400
    sget-object v1, La/q7a0;->P1:La/fl70;

    .line 401
    .line 402
    iget-object v0, v0, La/q7a0;->M1:La/fiu0;

    .line 403
    .line 404
    if-eqz v0, :cond_9

    .line 405
    .line 406
    return-object v0

    .line 407
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v3

    .line 411
    :pswitch_17
    check-cast v0, La/j910;

    .line 412
    .line 413
    iget-object v0, v0, La/j910;->b:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, La/gii0;

    .line 416
    .line 417
    const-class v1, La/h7a0;

    .line 418
    .line 419
    sget-object v2, La/sre0;->a:La/tre0;

    .line 420
    .line 421
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, La/h7a0;

    .line 430
    .line 431
    return-object v0

    .line 432
    :pswitch_18
    check-cast v0, La/r5a0;

    .line 433
    .line 434
    sget-object v1, La/r5a0;->S1:La/mi70;

    .line 435
    .line 436
    iget-object v0, v0, La/r5a0;->Q1:La/fiu0;

    .line 437
    .line 438
    if-eqz v0, :cond_a

    .line 439
    .line 440
    return-object v0

    .line 441
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw v3

    .line 445
    :pswitch_19
    check-cast v0, La/g090;

    .line 446
    .line 447
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v0, La/gii0;

    .line 450
    .line 451
    const-class v1, La/o4a0;

    .line 452
    .line 453
    sget-object v2, La/sre0;->a:La/tre0;

    .line 454
    .line 455
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    check-cast v0, La/o4a0;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_1a
    check-cast v0, La/p3a0;

    .line 467
    .line 468
    iget v0, v0, La/p3a0;->c:I

    .line 469
    .line 470
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :pswitch_1b
    check-cast v0, La/q3a0;

    .line 476
    .line 477
    iget v0, v0, La/q3a0;->c:I

    .line 478
    .line 479
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    return-object v0

    .line 484
    :pswitch_1c
    check-cast v0, La/o3a0;

    .line 485
    .line 486
    iget v0, v0, La/o3a0;->c:I

    .line 487
    .line 488
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    return-object v0

    .line 493
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
