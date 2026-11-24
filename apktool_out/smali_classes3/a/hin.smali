.class public final synthetic La/hin;
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
    iput-byte p7, p0, La/hin;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hin;->a:B

    .line 4
    .line 5
    const-string v2, "snackBarManager"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const-string v4, "actionDialogManager"

    .line 9
    .line 10
    const v5, 0x7f13032f

    .line 11
    .line 12
    .line 13
    const v6, 0x7f130e5d

    .line 14
    .line 15
    .line 16
    sget-object v7, La/vyo;->a:La/vyo;

    .line 17
    .line 18
    const/16 v8, 0x19

    .line 19
    .line 20
    const/16 v9, 0xc

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/c5p;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, La/m4p;

    .line 37
    .line 38
    sget-object v2, La/m4p;->S1:La/bek;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v2, v1, La/a5p;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    instance-of v2, v1, La/b5p;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v2, v0, La/m4p;->Q1:La/ujd;

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    check-cast v1, La/b5p;

    .line 60
    .line 61
    iget-object v1, v1, La/b5p;->a:La/sjd;

    .line 62
    .line 63
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0}, La/m4p;->G0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, La/m3p;->a:La/m3p;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const-string v0, "gameCardFragmentDelegate"

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v11

    .line 84
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 85
    .line 86
    .line 87
    :goto_1
    return-object v11

    .line 88
    :pswitch_0
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, Ljava/lang/Throwable;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, La/i3p;

    .line 98
    .line 99
    iget-object v2, v0, La/i3p;->u:La/duj;

    .line 100
    .line 101
    new-instance v3, La/f5o;

    .line 102
    .line 103
    invoke-direct {v3, v0, v9}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_1
    move-object/from16 v1, p1

    .line 113
    .line 114
    check-cast v1, Ljava/lang/Throwable;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, La/i3p;

    .line 122
    .line 123
    iget-object v2, v0, La/i3p;->z:La/ivn;

    .line 124
    .line 125
    new-instance v3, La/yhn;

    .line 126
    .line 127
    invoke-direct {v3, v0, v8}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 131
    .line 132
    .line 133
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_2
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Throwable;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, La/i3p;

    .line 146
    .line 147
    iget-object v2, v0, La/i3p;->u:La/duj;

    .line 148
    .line 149
    new-instance v3, La/f5o;

    .line 150
    .line 151
    invoke-direct {v3, v0, v9}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_3
    move-object/from16 v1, p1

    .line 161
    .line 162
    check-cast v1, La/q2p;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, La/k3t0;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_4
    move-object/from16 v1, p1

    .line 178
    .line 179
    check-cast v1, La/v2p;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 185
    .line 186
    move-object v4, v0

    .line 187
    check-cast v4, La/t2p;

    .line 188
    .line 189
    sget-object v0, La/t2p;->O1:La/ddk;

    .line 190
    .line 191
    iget-object v0, v4, La/t2p;->L1:La/a8z;

    .line 192
    .line 193
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, La/igi;

    .line 198
    .line 199
    iget-object v2, v0, La/igi;->p:La/wdk0;

    .line 200
    .line 201
    new-instance v3, La/xdk0;

    .line 202
    .line 203
    sget-object v6, La/rek0;->b:La/rek0;

    .line 204
    .line 205
    iget-object v7, v1, La/v2p;->a:Ljava/lang/String;

    .line 206
    .line 207
    const/4 v11, 0x0

    .line 208
    const/16 v12, 0x7c

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x0

    .line 213
    move-object v5, v3

    .line 214
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 215
    .line 216
    .line 217
    const/16 v9, 0x3fc

    .line 218
    .line 219
    const/4 v5, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 222
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 223
    .line 224
    .line 225
    iget-object v0, v4, La/t2p;->M1:La/a8z;

    .line 226
    .line 227
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, La/k3t0;

    .line 232
    .line 233
    sget-object v1, La/h2p;->a:La/h2p;

    .line 234
    .line 235
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_5
    move-object/from16 v1, p1

    .line 242
    .line 243
    check-cast v1, Ljava/lang/Throwable;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, La/duj;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_6
    move-object/from16 v1, p1

    .line 259
    .line 260
    check-cast v1, Ljava/lang/Throwable;

    .line 261
    .line 262
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, La/gzo;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    instance-of v2, v1, Ljava/net/SocketTimeoutException;

    .line 273
    .line 274
    if-eqz v2, :cond_3

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_3
    instance-of v2, v1, Ljava/net/UnknownHostException;

    .line 278
    .line 279
    if-eqz v2, :cond_4

    .line 280
    .line 281
    :goto_2
    invoke-virtual {v0, v7}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_4

    .line 285
    .line 286
    :cond_4
    instance-of v2, v1, La/x4x;

    .line 287
    .line 288
    if-eqz v2, :cond_7

    .line 289
    .line 290
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 291
    .line 292
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 293
    .line 294
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 302
    .line 303
    move-object v5, v3

    .line 304
    check-cast v5, La/syo;

    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    if-nez v4, :cond_6

    .line 314
    .line 315
    const-string v4, ""

    .line 316
    .line 317
    :cond_6
    move-object v12, v4

    .line 318
    sget-object v15, La/yxo;->a:La/yxo;

    .line 319
    .line 320
    const/16 v16, 0x37f

    .line 321
    .line 322
    const/4 v6, 0x0

    .line 323
    const/4 v7, 0x0

    .line 324
    const/4 v8, 0x0

    .line 325
    const/4 v9, 0x0

    .line 326
    const/4 v10, 0x0

    .line 327
    const/4 v11, 0x0

    .line 328
    const/4 v13, 0x0

    .line 329
    const/4 v14, 0x0

    .line 330
    invoke-static/range {v5 .. v16}, La/syo;->a(La/syo;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;La/dyo;La/dyo;La/yxo;I)La/syo;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-eqz v3, :cond_5

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_7
    instance-of v2, v1, La/zhi0;

    .line 342
    .line 343
    if-eqz v2, :cond_8

    .line 344
    .line 345
    move-object v11, v1

    .line 346
    check-cast v11, La/zhi0;

    .line 347
    .line 348
    :cond_8
    if-eqz v11, :cond_9

    .line 349
    .line 350
    iget-object v2, v11, La/zhi0;->c:La/kuw;

    .line 351
    .line 352
    if-eqz v2, :cond_9

    .line 353
    .line 354
    invoke-interface {v2}, La/kuw;->getErrorCode()I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    :cond_9
    if-nez v10, :cond_a

    .line 359
    .line 360
    goto :goto_3

    .line 361
    :cond_a
    iget-object v2, v0, La/gzo;->z:La/nr;

    .line 362
    .line 363
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object v2, v2, La/nr;->b:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, La/kt2;

    .line 376
    .line 377
    const-string v4, "acc_change_password_error"

    .line 378
    .line 379
    const-string v5, "error_code"

    .line 380
    .line 381
    invoke-static {v5, v3, v2, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    iget-object v2, v0, La/gzo;->A:La/s64;

    .line 385
    .line 386
    iget-object v2, v2, La/s64;->a:La/s1p;

    .line 387
    .line 388
    const-wide/16 v3, 0xcad

    .line 389
    .line 390
    invoke-static {v10, v2, v3, v4}, La/b1j;->r(ILa/s1p;J)V

    .line 391
    .line 392
    .line 393
    :goto_3
    iget-object v2, v0, La/gzo;->x:La/duj;

    .line 394
    .line 395
    new-instance v3, La/f5o;

    .line 396
    .line 397
    const/16 v4, 0xa

    .line 398
    .line 399
    invoke-direct {v3, v0, v4}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 403
    .line 404
    .line 405
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_7
    move-object/from16 v1, p1

    .line 409
    .line 410
    check-cast v1, La/wxo;

    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, La/k3t0;

    .line 418
    .line 419
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_8
    move-object/from16 v1, p1

    .line 426
    .line 427
    check-cast v1, La/xyo;

    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, La/byo;

    .line 435
    .line 436
    sget-object v2, La/byo;->P1:La/bek;

    .line 437
    .line 438
    instance-of v2, v1, La/uyo;

    .line 439
    .line 440
    if-eqz v2, :cond_b

    .line 441
    .line 442
    check-cast v1, La/uyo;

    .line 443
    .line 444
    iget-object v2, v1, La/uyo;->a:Ljava/lang/String;

    .line 445
    .line 446
    iget-object v1, v1, La/uyo;->b:La/sek0;

    .line 447
    .line 448
    invoke-virtual {v0, v1, v2}, La/byo;->I0(La/sek0;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    goto/16 :goto_5

    .line 452
    .line 453
    :cond_b
    instance-of v2, v1, La/wyo;

    .line 454
    .line 455
    if-eqz v2, :cond_c

    .line 456
    .line 457
    check-cast v1, La/wyo;

    .line 458
    .line 459
    iget-object v7, v1, La/wyo;->a:Ljava/lang/String;

    .line 460
    .line 461
    iget-object v1, v0, La/byo;->N1:La/a8z;

    .line 462
    .line 463
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, La/egi;

    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    const v1, 0x7f130419

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    sget-object v1, La/a2v0;->g2:La/svs0;

    .line 486
    .line 487
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    new-instance v2, La/c2v0;

    .line 492
    .line 493
    new-instance v4, La/i7a;

    .line 494
    .line 495
    sget-object v3, La/m7a;->e:La/m7a;

    .line 496
    .line 497
    const-string v5, ""

    .line 498
    .line 499
    invoke-direct {v4, v10, v5, v10, v3}, La/i7a;-><init>(ILjava/lang/String;ILa/m7a;)V

    .line 500
    .line 501
    .line 502
    const-string v3, "CAPTCHA_REQUEST_KEY"

    .line 503
    .line 504
    invoke-direct/range {v2 .. v7}, La/c2v0;-><init>(Ljava/lang/String;La/i7a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-static {v8, v2}, La/svs0;->d(Landroidx/fragment/app/e;La/c2v0;)V

    .line 511
    .line 512
    .line 513
    goto :goto_5

    .line 514
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v2, :cond_d

    .line 522
    .line 523
    iget-object v1, v0, La/byo;->N1:La/a8z;

    .line 524
    .line 525
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    check-cast v1, La/egi;

    .line 530
    .line 531
    iget-object v1, v1, La/egi;->a:La/v7i;

    .line 532
    .line 533
    iget-object v1, v1, La/v7i;->n:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v1, La/ii;

    .line 536
    .line 537
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 541
    .line 542
    const v2, 0x7f1307bb

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    const v2, 0x7f13115d

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v9

    .line 556
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v10

    .line 560
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    sget-object v16, La/n12;->a:La/n12;

    .line 564
    .line 565
    const/16 v17, 0x0

    .line 566
    .line 567
    const/16 v18, 0x5d8

    .line 568
    .line 569
    const/4 v11, 0x0

    .line 570
    const/4 v12, 0x0

    .line 571
    const-string v13, "ERROR_REQUEST_KEY"

    .line 572
    .line 573
    const/4 v14, 0x0

    .line 574
    const/4 v15, 0x0

    .line 575
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1, v7, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 586
    .line 587
    .line 588
    goto :goto_5

    .line 589
    :cond_d
    sget-object v2, La/tyo;->a:La/tyo;

    .line 590
    .line 591
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    if-eqz v1, :cond_f

    .line 596
    .line 597
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 598
    .line 599
    if-eqz v1, :cond_e

    .line 600
    .line 601
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 605
    .line 606
    .line 607
    :cond_e
    :goto_5
    invoke-virtual {v0}, La/byo;->H0()La/k3t0;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sget-object v1, La/kxo;->a:La/kxo;

    .line 612
    .line 613
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 617
    .line 618
    goto :goto_6

    .line 619
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 620
    .line 621
    .line 622
    :goto_6
    return-object v11

    .line 623
    :pswitch_9
    move-object/from16 v1, p1

    .line 624
    .line 625
    check-cast v1, Ljava/lang/Throwable;

    .line 626
    .line 627
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, La/cwo;

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 638
    .line 639
    .line 640
    instance-of v1, v1, La/ff5;

    .line 641
    .line 642
    if-eqz v1, :cond_10

    .line 643
    .line 644
    new-instance v1, La/x6o;

    .line 645
    .line 646
    const/16 v2, 0xf

    .line 647
    .line 648
    invoke-direct {v1, v2}, La/x6o;-><init>(B)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 652
    .line 653
    .line 654
    goto :goto_7

    .line 655
    :cond_10
    new-instance v1, La/x6o;

    .line 656
    .line 657
    const/16 v2, 0x10

    .line 658
    .line 659
    invoke-direct {v1, v2}, La/x6o;-><init>(B)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 663
    .line 664
    .line 665
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 666
    .line 667
    return-object v0

    .line 668
    :pswitch_a
    move-object/from16 v1, p1

    .line 669
    .line 670
    check-cast v1, La/gvo;

    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v0, La/k3t0;

    .line 678
    .line 679
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 683
    .line 684
    return-object v0

    .line 685
    :pswitch_b
    move-object/from16 v1, p1

    .line 686
    .line 687
    check-cast v1, La/hqo;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v0, La/k3t0;

    .line 695
    .line 696
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 700
    .line 701
    return-object v0

    .line 702
    :pswitch_c
    move-object/from16 v1, p1

    .line 703
    .line 704
    check-cast v1, La/oqo;

    .line 705
    .line 706
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v0, La/kqo;

    .line 712
    .line 713
    sget-object v1, La/kqo;->P1:La/pek;

    .line 714
    .line 715
    invoke-virtual {v0}, La/kqo;->G0()La/dfi;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    iget-object v1, v1, La/dfi;->u:La/ii;

    .line 720
    .line 721
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 722
    .line 723
    invoke-virtual {v0}, La/kqo;->G0()La/dfi;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    iget-object v2, v2, La/dfi;->k:La/ctf0;

    .line 728
    .line 729
    new-array v3, v10, [Ljava/lang/Object;

    .line 730
    .line 731
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 732
    .line 733
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    const v4, 0x7f13051a

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v12

    .line 744
    invoke-virtual {v0}, La/kqo;->G0()La/dfi;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    iget-object v2, v2, La/dfi;->k:La/ctf0;

    .line 749
    .line 750
    new-array v3, v10, [Ljava/lang/Object;

    .line 751
    .line 752
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 753
    .line 754
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    const v4, 0x7f13051b

    .line 759
    .line 760
    .line 761
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v13

    .line 765
    invoke-virtual {v0}, La/kqo;->G0()La/dfi;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    iget-object v2, v2, La/dfi;->k:La/ctf0;

    .line 770
    .line 771
    new-array v3, v10, [Ljava/lang/Object;

    .line 772
    .line 773
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 774
    .line 775
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    invoke-virtual {v2, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v14

    .line 783
    invoke-virtual {v0}, La/kqo;->G0()La/dfi;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    iget-object v2, v2, La/dfi;->k:La/ctf0;

    .line 788
    .line 789
    new-array v3, v10, [Ljava/lang/Object;

    .line 790
    .line 791
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 792
    .line 793
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    invoke-virtual {v2, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v15

    .line 801
    sget-object v20, La/n12;->a:La/n12;

    .line 802
    .line 803
    const/16 v21, 0x0

    .line 804
    .line 805
    const/16 v22, 0x5d0

    .line 806
    .line 807
    const/16 v16, 0x0

    .line 808
    .line 809
    const-string v17, "REQUEST_EXPRESS_DIALOG_EXPRESS"

    .line 810
    .line 811
    const/16 v18, 0x0

    .line 812
    .line 813
    const/16 v19, 0x0

    .line 814
    .line 815
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v1, v11, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 826
    .line 827
    .line 828
    iget-object v0, v0, La/kqo;->N1:La/a8z;

    .line 829
    .line 830
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    check-cast v0, La/k3t0;

    .line 835
    .line 836
    sget-object v1, La/vpo;->a:La/vpo;

    .line 837
    .line 838
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 839
    .line 840
    .line 841
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 842
    .line 843
    return-object v0

    .line 844
    :pswitch_d
    move-object/from16 v1, p1

    .line 845
    .line 846
    check-cast v1, La/gg2;

    .line 847
    .line 848
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v0, La/k3t0;

    .line 854
    .line 855
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 859
    .line 860
    return-object v0

    .line 861
    :pswitch_e
    move-object/from16 v1, p1

    .line 862
    .line 863
    check-cast v1, La/tg2;

    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v0, La/cio;

    .line 871
    .line 872
    sget-object v2, La/cio;->P1:La/ddk;

    .line 873
    .line 874
    instance-of v2, v1, La/ng2;

    .line 875
    .line 876
    if-eqz v2, :cond_11

    .line 877
    .line 878
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    iget-object v2, v2, La/mgi;->m:La/itr;

    .line 883
    .line 884
    invoke-interface {v2}, La/itr;->d()La/ujd;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    check-cast v1, La/ng2;

    .line 892
    .line 893
    iget-object v1, v1, La/ng2;->a:La/sjd;

    .line 894
    .line 895
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_8

    .line 899
    .line 900
    :cond_11
    instance-of v2, v1, La/qg2;

    .line 901
    .line 902
    if-nez v2, :cond_16

    .line 903
    .line 904
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    instance-of v2, v1, La/sg2;

    .line 908
    .line 909
    if-eqz v2, :cond_12

    .line 910
    .line 911
    sget-object v1, La/s6p;->o2:La/pek;

    .line 912
    .line 913
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    sget-object v3, La/wep;->a:La/wep;

    .line 921
    .line 922
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    const-string v1, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 926
    .line 927
    invoke-static {v2, v3, v1}, La/pek;->p(Landroidx/fragment/app/e;La/wep;Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    goto/16 :goto_8

    .line 931
    .line 932
    :cond_12
    sget-object v2, La/rg2;->a:La/rg2;

    .line 933
    .line 934
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    if-eqz v2, :cond_13

    .line 939
    .line 940
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    iget-object v1, v1, La/mgi;->a:La/ii;

    .line 945
    .line 946
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 947
    .line 948
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    iget-object v2, v2, La/mgi;->b:La/ctf0;

    .line 953
    .line 954
    new-array v3, v10, [Ljava/lang/Object;

    .line 955
    .line 956
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 957
    .line 958
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v3

    .line 962
    const v4, 0x7f13046c

    .line 963
    .line 964
    .line 965
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v12

    .line 969
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    iget-object v2, v2, La/mgi;->b:La/ctf0;

    .line 974
    .line 975
    new-array v3, v10, [Ljava/lang/Object;

    .line 976
    .line 977
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 978
    .line 979
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    const v6, 0x7f1304d8

    .line 984
    .line 985
    .line 986
    invoke-virtual {v2, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v13

    .line 990
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    iget-object v2, v2, La/mgi;->b:La/ctf0;

    .line 995
    .line 996
    new-array v3, v10, [Ljava/lang/Object;

    .line 997
    .line 998
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 999
    .line 1000
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v3

    .line 1004
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v14

    .line 1008
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    iget-object v2, v2, La/mgi;->b:La/ctf0;

    .line 1013
    .line 1014
    new-array v3, v10, [Ljava/lang/Object;

    .line 1015
    .line 1016
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 1017
    .line 1018
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v3

    .line 1022
    invoke-virtual {v2, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v15

    .line 1026
    sget-object v20, La/n12;->a:La/n12;

    .line 1027
    .line 1028
    const/16 v21, 0x0

    .line 1029
    .line 1030
    const/16 v22, 0x5d0

    .line 1031
    .line 1032
    const/16 v16, 0x0

    .line 1033
    .line 1034
    const-string v17, "REQUEST_CLEAR_GROUPS_DIALOG_KEY"

    .line 1035
    .line 1036
    const/16 v18, 0x0

    .line 1037
    .line 1038
    const/16 v19, 0x0

    .line 1039
    .line 1040
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v1, v11, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1051
    .line 1052
    .line 1053
    goto :goto_8

    .line 1054
    :cond_13
    sget-object v2, La/pg2;->a:La/pg2;

    .line 1055
    .line 1056
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v2

    .line 1060
    if-nez v2, :cond_15

    .line 1061
    .line 1062
    sget-object v2, La/og2;->a:La/og2;

    .line 1063
    .line 1064
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v1

    .line 1068
    if-eqz v1, :cond_14

    .line 1069
    .line 1070
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    invoke-static {v1}, La/j120;->X(Landroid/view/View;)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_8

    .line 1081
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_9

    .line 1085
    :cond_15
    :goto_8
    invoke-virtual {v0}, La/cio;->H0()La/k3t0;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    sget-object v1, La/qf2;->a:La/qf2;

    .line 1090
    .line 1091
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1092
    .line 1093
    .line 1094
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1095
    .line 1096
    :goto_9
    return-object v11

    .line 1097
    :cond_16
    invoke-virtual {v0}, La/cio;->G0()La/mgi;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    iget-object v0, v0, La/mgi;->j:La/bwl;

    .line 1102
    .line 1103
    iget-object v0, v0, La/bwl;->a:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v0, La/dbi;

    .line 1106
    .line 1107
    invoke-virtual {v0}, La/dbi;->o()La/jw20;

    .line 1108
    .line 1109
    .line 1110
    const-string v0, "resourceManager"

    .line 1111
    .line 1112
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    throw v11

    .line 1116
    :pswitch_f
    move-object/from16 v1, p1

    .line 1117
    .line 1118
    check-cast v1, La/isp;

    .line 1119
    .line 1120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1124
    .line 1125
    check-cast v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;

    .line 1126
    .line 1127
    sget v2, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->w:I

    .line 1128
    .line 1129
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->u(La/isp;)Landroid/graphics/drawable/Drawable;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    return-object v0

    .line 1134
    :pswitch_10
    move-object/from16 v1, p1

    .line 1135
    .line 1136
    check-cast v1, La/y8o;

    .line 1137
    .line 1138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1139
    .line 1140
    .line 1141
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v0, La/k8o;

    .line 1144
    .line 1145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1146
    .line 1147
    .line 1148
    instance-of v2, v1, La/x8o;

    .line 1149
    .line 1150
    if-eqz v2, :cond_18

    .line 1151
    .line 1152
    check-cast v1, La/x8o;

    .line 1153
    .line 1154
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    iget-object v3, v0, La/k8o;->O1:La/wdk0;

    .line 1159
    .line 1160
    if-eqz v3, :cond_17

    .line 1161
    .line 1162
    iget-object v4, v1, La/x8o;->a:Ljava/lang/String;

    .line 1163
    .line 1164
    iget-object v5, v1, La/x8o;->b:Ljava/lang/String;

    .line 1165
    .line 1166
    iget-object v1, v1, La/x8o;->c:Ljava/lang/String;

    .line 1167
    .line 1168
    invoke-static {v2, v3, v4, v5, v1}, La/n6x;->F(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_a

    .line 1172
    :cond_17
    const-string v0, "snackbarManager"

    .line 1173
    .line 1174
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1175
    .line 1176
    .line 1177
    throw v11

    .line 1178
    :cond_18
    instance-of v2, v1, La/w8o;

    .line 1179
    .line 1180
    if-eqz v2, :cond_1a

    .line 1181
    .line 1182
    check-cast v1, La/w8o;

    .line 1183
    .line 1184
    iget-object v2, v0, La/k8o;->N1:La/ujd;

    .line 1185
    .line 1186
    if-eqz v2, :cond_19

    .line 1187
    .line 1188
    iget-object v1, v1, La/w8o;->a:La/sjd;

    .line 1189
    .line 1190
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1191
    .line 1192
    .line 1193
    :goto_a
    invoke-virtual {v0}, La/k8o;->G0()La/k3t0;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    sget-object v1, La/e7o;->a:La/e7o;

    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1200
    .line 1201
    .line 1202
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    goto :goto_b

    .line 1205
    :cond_19
    const-string v0, "composeGameCardFragmentDelegate"

    .line 1206
    .line 1207
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    throw v11

    .line 1211
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 1212
    .line 1213
    .line 1214
    :goto_b
    return-object v11

    .line 1215
    :pswitch_11
    move-object/from16 v1, p1

    .line 1216
    .line 1217
    check-cast v1, La/s4o;

    .line 1218
    .line 1219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast v0, La/k3t0;

    .line 1225
    .line 1226
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1227
    .line 1228
    .line 1229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1230
    .line 1231
    return-object v0

    .line 1232
    :pswitch_12
    move-object/from16 v1, p1

    .line 1233
    .line 1234
    check-cast v1, La/hyn;

    .line 1235
    .line 1236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1240
    .line 1241
    check-cast v0, La/ayn;

    .line 1242
    .line 1243
    sget-object v2, La/ayn;->c2:La/sek;

    .line 1244
    .line 1245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1246
    .line 1247
    .line 1248
    sget-object v2, La/fyn;->a:La/fyn;

    .line 1249
    .line 1250
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v2

    .line 1254
    if-eqz v2, :cond_1b

    .line 1255
    .line 1256
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    invoke-static {v1}, La/j120;->h0(Landroid/content/Context;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v0, v10, v10, v10}, La/sik;->z0(ZZZ)V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_c

    .line 1267
    :cond_1b
    sget-object v2, La/gyn;->a:La/gyn;

    .line 1268
    .line 1269
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v1

    .line 1273
    if-eqz v1, :cond_1c

    .line 1274
    .line 1275
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v1

    .line 1279
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1280
    .line 1281
    new-instance v3, Lkotlin/Pair;

    .line 1282
    .line 1283
    const-string v4, "SHOW_AUTHORIZATION"

    .line 1284
    .line 1285
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1286
    .line 1287
    .line 1288
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    invoke-static {v1, v2}, La/j120;->g0(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v0, v10, v10, v10}, La/sik;->z0(ZZZ)V

    .line 1300
    .line 1301
    .line 1302
    :goto_c
    invoke-virtual {v0}, La/ayn;->I0()La/k3t0;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    sget-object v1, La/sxn;->a:La/sxn;

    .line 1307
    .line 1308
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1309
    .line 1310
    .line 1311
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1312
    .line 1313
    goto :goto_d

    .line 1314
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1315
    .line 1316
    .line 1317
    :goto_d
    return-object v11

    .line 1318
    :pswitch_13
    move-object/from16 v1, p1

    .line 1319
    .line 1320
    check-cast v1, Ljava/lang/Throwable;

    .line 1321
    .line 1322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1326
    .line 1327
    check-cast v0, La/mpn;

    .line 1328
    .line 1329
    sget v2, La/mpn;->K:I

    .line 1330
    .line 1331
    iget-object v2, v0, La/mpn;->y:La/duj;

    .line 1332
    .line 1333
    new-instance v3, La/mxm;

    .line 1334
    .line 1335
    invoke-direct {v3, v0, v8}, La/mxm;-><init>(Ljava/lang/Object;B)V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1339
    .line 1340
    .line 1341
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1342
    .line 1343
    return-object v0

    .line 1344
    :pswitch_14
    move-object/from16 v1, p1

    .line 1345
    .line 1346
    check-cast v1, La/gon;

    .line 1347
    .line 1348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1349
    .line 1350
    .line 1351
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v0, La/k3t0;

    .line 1354
    .line 1355
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1356
    .line 1357
    .line 1358
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1359
    .line 1360
    return-object v0

    .line 1361
    :pswitch_15
    move-object/from16 v1, p1

    .line 1362
    .line 1363
    check-cast v1, La/hpn;

    .line 1364
    .line 1365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1366
    .line 1367
    .line 1368
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1369
    .line 1370
    move-object v14, v0

    .line 1371
    check-cast v14, La/xon;

    .line 1372
    .line 1373
    sget-object v0, La/xon;->S1:La/bek;

    .line 1374
    .line 1375
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1376
    .line 1377
    .line 1378
    instance-of v0, v1, La/epn;

    .line 1379
    .line 1380
    if-eqz v0, :cond_1e

    .line 1381
    .line 1382
    check-cast v1, La/epn;

    .line 1383
    .line 1384
    iget-object v0, v1, La/epn;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1385
    .line 1386
    iget-object v1, v14, La/xon;->O1:La/ii;

    .line 1387
    .line 1388
    if-eqz v1, :cond_1d

    .line 1389
    .line 1390
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v2

    .line 1394
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1398
    .line 1399
    .line 1400
    goto :goto_e

    .line 1401
    :cond_1d
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    throw v11

    .line 1405
    :cond_1e
    instance-of v0, v1, La/fpn;

    .line 1406
    .line 1407
    if-eqz v0, :cond_20

    .line 1408
    .line 1409
    check-cast v1, La/fpn;

    .line 1410
    .line 1411
    iget-object v0, v1, La/fpn;->a:Ljava/lang/String;

    .line 1412
    .line 1413
    iget-object v1, v1, La/fpn;->b:Ljava/lang/String;

    .line 1414
    .line 1415
    sget-object v2, La/gvv;->m2:La/gst;

    .line 1416
    .line 1417
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v4

    .line 1421
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1431
    .line 1432
    .line 1433
    const-string v2, "HelperBottomSheetDialog"

    .line 1434
    .line 1435
    invoke-virtual {v4, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v5

    .line 1439
    if-eqz v5, :cond_1f

    .line 1440
    .line 1441
    goto :goto_e

    .line 1442
    :cond_1f
    new-instance v5, La/gvv;

    .line 1443
    .line 1444
    invoke-direct {v5}, La/gvv;-><init>()V

    .line 1445
    .line 1446
    .line 1447
    sget-object v6, La/gvv;->n2:[La/iiy;

    .line 1448
    .line 1449
    aget-object v7, v6, v10

    .line 1450
    .line 1451
    iget-object v8, v5, La/gvv;->k2:La/phf0;

    .line 1452
    .line 1453
    invoke-virtual {v8, v5, v7, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    iget-object v0, v5, La/gvv;->l2:La/phf0;

    .line 1457
    .line 1458
    aget-object v3, v6, v3

    .line 1459
    .line 1460
    invoke-virtual {v0, v5, v3, v1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v5, v4, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1464
    .line 1465
    .line 1466
    goto :goto_e

    .line 1467
    :cond_20
    instance-of v0, v1, La/gpn;

    .line 1468
    .line 1469
    if-eqz v0, :cond_22

    .line 1470
    .line 1471
    check-cast v1, La/gpn;

    .line 1472
    .line 1473
    iget-object v13, v1, La/gpn;->a:La/xdk0;

    .line 1474
    .line 1475
    iget-object v12, v14, La/xon;->P1:La/wdk0;

    .line 1476
    .line 1477
    if-eqz v12, :cond_21

    .line 1478
    .line 1479
    const/16 v18, 0x0

    .line 1480
    .line 1481
    const/16 v19, 0x3ec

    .line 1482
    .line 1483
    const/4 v15, 0x0

    .line 1484
    const/16 v16, 0x0

    .line 1485
    .line 1486
    const/16 v17, 0x1

    .line 1487
    .line 1488
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1489
    .line 1490
    .line 1491
    :goto_e
    invoke-virtual {v14}, La/xon;->G0()La/k3t0;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    sget-object v1, La/xnn;->a:La/xnn;

    .line 1496
    .line 1497
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1501
    .line 1502
    goto :goto_f

    .line 1503
    :cond_21
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1504
    .line 1505
    .line 1506
    throw v11

    .line 1507
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1508
    .line 1509
    .line 1510
    :goto_f
    return-object v11

    .line 1511
    :pswitch_16
    move-object/from16 v1, p1

    .line 1512
    .line 1513
    check-cast v1, Ljava/lang/Throwable;

    .line 1514
    .line 1515
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1516
    .line 1517
    .line 1518
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1519
    .line 1520
    check-cast v0, La/wnn;

    .line 1521
    .line 1522
    iget-object v2, v0, La/wnn;->B:La/duj;

    .line 1523
    .line 1524
    new-instance v3, La/qnn;

    .line 1525
    .line 1526
    invoke-direct {v3, v0, v10}, La/qnn;-><init>(La/wnn;B)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1530
    .line 1531
    .line 1532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1533
    .line 1534
    return-object v0

    .line 1535
    :pswitch_17
    move-object/from16 v1, p1

    .line 1536
    .line 1537
    check-cast v1, Ljava/lang/Throwable;

    .line 1538
    .line 1539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1540
    .line 1541
    .line 1542
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1543
    .line 1544
    check-cast v0, La/wnn;

    .line 1545
    .line 1546
    invoke-virtual {v0, v1}, La/wnn;->N(Ljava/lang/Throwable;)V

    .line 1547
    .line 1548
    .line 1549
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1550
    .line 1551
    return-object v0

    .line 1552
    :pswitch_18
    move-object/from16 v1, p1

    .line 1553
    .line 1554
    check-cast v1, Ljava/lang/Throwable;

    .line 1555
    .line 1556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1557
    .line 1558
    .line 1559
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1560
    .line 1561
    check-cast v0, La/wnn;

    .line 1562
    .line 1563
    invoke-virtual {v0, v1}, La/wnn;->N(Ljava/lang/Throwable;)V

    .line 1564
    .line 1565
    .line 1566
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1567
    .line 1568
    return-object v0

    .line 1569
    :pswitch_19
    move-object/from16 v1, p1

    .line 1570
    .line 1571
    check-cast v1, La/wkn;

    .line 1572
    .line 1573
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1574
    .line 1575
    .line 1576
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1577
    .line 1578
    check-cast v0, La/k3t0;

    .line 1579
    .line 1580
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1581
    .line 1582
    .line 1583
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1584
    .line 1585
    return-object v0

    .line 1586
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1587
    .line 1588
    check-cast v1, La/hnn;

    .line 1589
    .line 1590
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1591
    .line 1592
    .line 1593
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1594
    .line 1595
    move-object v14, v0

    .line 1596
    check-cast v14, La/kmn;

    .line 1597
    .line 1598
    sget-object v0, La/kmn;->Q1:La/xak;

    .line 1599
    .line 1600
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    instance-of v0, v1, La/enn;

    .line 1604
    .line 1605
    if-eqz v0, :cond_24

    .line 1606
    .line 1607
    check-cast v1, La/enn;

    .line 1608
    .line 1609
    iget-object v0, v1, La/enn;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1610
    .line 1611
    iget-object v1, v14, La/kmn;->M1:La/ii;

    .line 1612
    .line 1613
    if-eqz v1, :cond_23

    .line 1614
    .line 1615
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v2

    .line 1619
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1620
    .line 1621
    .line 1622
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1623
    .line 1624
    .line 1625
    goto/16 :goto_10

    .line 1626
    .line 1627
    :cond_23
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1628
    .line 1629
    .line 1630
    throw v11

    .line 1631
    :cond_24
    instance-of v0, v1, La/fnn;

    .line 1632
    .line 1633
    if-eqz v0, :cond_26

    .line 1634
    .line 1635
    check-cast v1, La/fnn;

    .line 1636
    .line 1637
    iget-object v0, v1, La/fnn;->a:Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;

    .line 1638
    .line 1639
    sget-object v1, La/omn;->p2:La/ddk;

    .line 1640
    .line 1641
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v2

    .line 1645
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    iget-object v4, v0, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;->b:Ljava/lang/String;

    .line 1649
    .line 1650
    iget-object v5, v0, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;->d:Ljava/lang/String;

    .line 1651
    .line 1652
    iget-object v6, v0, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;->a:Ljava/lang/String;

    .line 1653
    .line 1654
    iget v7, v0, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;->c:I

    .line 1655
    .line 1656
    iget-object v0, v0, Lorg/xplatform/bet_history/edit_coupon/presentation/model/OptionSelectBottomSheetDialogModel;->e:Ljava/util/List;

    .line 1657
    .line 1658
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    const-string v1, "OPTION_SELECTION_BOTTOM_SHEET_TAG"

    .line 1674
    .line 1675
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v8

    .line 1679
    if-eqz v8, :cond_25

    .line 1680
    .line 1681
    goto :goto_10

    .line 1682
    :cond_25
    new-instance v8, La/omn;

    .line 1683
    .line 1684
    invoke-direct {v8}, La/omn;-><init>()V

    .line 1685
    .line 1686
    .line 1687
    sget-object v9, La/omn;->q2:[La/iiy;

    .line 1688
    .line 1689
    aget-object v10, v9, v10

    .line 1690
    .line 1691
    iget-object v11, v8, La/omn;->k2:La/es;

    .line 1692
    .line 1693
    invoke-virtual {v11, v8, v10, v0}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 1694
    .line 1695
    .line 1696
    const/4 v0, 0x2

    .line 1697
    aget-object v0, v9, v0

    .line 1698
    .line 1699
    iget-object v10, v8, La/omn;->m2:La/phf0;

    .line 1700
    .line 1701
    invoke-virtual {v10, v8, v0, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1702
    .line 1703
    .line 1704
    const/4 v0, 0x3

    .line 1705
    aget-object v0, v9, v0

    .line 1706
    .line 1707
    iget-object v4, v8, La/omn;->n2:La/phf0;

    .line 1708
    .line 1709
    invoke-virtual {v4, v8, v0, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1710
    .line 1711
    .line 1712
    const/4 v0, 0x4

    .line 1713
    aget-object v0, v9, v0

    .line 1714
    .line 1715
    iget-object v4, v8, La/omn;->o2:La/zz2;

    .line 1716
    .line 1717
    invoke-virtual {v4, v8, v0, v7}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1718
    .line 1719
    .line 1720
    iget-object v0, v8, La/omn;->l2:La/phf0;

    .line 1721
    .line 1722
    aget-object v3, v9, v3

    .line 1723
    .line 1724
    invoke-virtual {v0, v8, v3, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v8, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    goto :goto_10

    .line 1731
    :cond_26
    instance-of v0, v1, La/gnn;

    .line 1732
    .line 1733
    if-eqz v0, :cond_28

    .line 1734
    .line 1735
    check-cast v1, La/gnn;

    .line 1736
    .line 1737
    iget-object v13, v1, La/gnn;->a:La/xdk0;

    .line 1738
    .line 1739
    iget-object v12, v14, La/kmn;->N1:La/wdk0;

    .line 1740
    .line 1741
    if-eqz v12, :cond_27

    .line 1742
    .line 1743
    const/16 v18, 0x0

    .line 1744
    .line 1745
    const/16 v19, 0x3ec

    .line 1746
    .line 1747
    const/4 v15, 0x0

    .line 1748
    const/16 v16, 0x0

    .line 1749
    .line 1750
    const/16 v17, 0x1

    .line 1751
    .line 1752
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1753
    .line 1754
    .line 1755
    goto :goto_10

    .line 1756
    :cond_27
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1757
    .line 1758
    .line 1759
    throw v11

    .line 1760
    :cond_28
    sget-object v0, La/dnn;->a:La/dnn;

    .line 1761
    .line 1762
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    if-eqz v0, :cond_29

    .line 1767
    .line 1768
    const-string v0, "REQUEST_EDIT_COUPON_DIALOG"

    .line 1769
    .line 1770
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v1

    .line 1774
    invoke-static {v1, v14, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1775
    .line 1776
    .line 1777
    :goto_10
    invoke-virtual {v14}, La/kmn;->G0()La/k3t0;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0

    .line 1781
    sget-object v1, La/ckn;->a:La/ckn;

    .line 1782
    .line 1783
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1784
    .line 1785
    .line 1786
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1787
    .line 1788
    goto :goto_11

    .line 1789
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1790
    .line 1791
    .line 1792
    :goto_11
    return-object v11

    .line 1793
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1794
    .line 1795
    check-cast v1, Ljava/lang/Throwable;

    .line 1796
    .line 1797
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1798
    .line 1799
    .line 1800
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v0, La/kin;

    .line 1803
    .line 1804
    invoke-virtual {v0, v1}, La/kin;->A(Ljava/lang/Throwable;)V

    .line 1805
    .line 1806
    .line 1807
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1808
    .line 1809
    return-object v0

    .line 1810
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1811
    .line 1812
    check-cast v1, Ljava/lang/Throwable;

    .line 1813
    .line 1814
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1815
    .line 1816
    .line 1817
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1818
    .line 1819
    check-cast v0, La/kin;

    .line 1820
    .line 1821
    invoke-virtual {v0, v1}, La/kin;->A(Ljava/lang/Throwable;)V

    .line 1822
    .line 1823
    .line 1824
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1825
    .line 1826
    return-object v0

    .line 1827
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
