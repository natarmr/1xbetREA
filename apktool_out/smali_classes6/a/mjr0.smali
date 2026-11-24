.class public final synthetic La/mjr0;
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
    iput-byte p7, p0, La/mjr0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mjr0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const v4, 0x7f130e5d

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const v6, 0x7f13032f

    .line 13
    .line 14
    .line 15
    const-string v7, "actionDialogManager"

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/o7j;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/o7j;->x(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, La/u6s0;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/k3t0;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_1
    move-object/from16 v1, p1

    .line 56
    .line 57
    check-cast v1, La/d7s0;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, La/z6s0;

    .line 65
    .line 66
    sget-object v2, La/z6s0;->S1:La/m6m0;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v2, v1, La/b7s0;

    .line 72
    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    check-cast v1, La/b7s0;

    .line 76
    .line 77
    iget-wide v2, v1, La/b7s0;->a:J

    .line 78
    .line 79
    iget-object v1, v1, La/b7s0;->b:Ljava/lang/String;

    .line 80
    .line 81
    sget-object v4, La/cl1;->o2:La/gfk0;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v2, v3, v1}, La/gfk0;->g(JLjava/lang/String;)La/cl1;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v2}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    instance-of v2, v1, La/c7s0;

    .line 102
    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    check-cast v1, La/c7s0;

    .line 106
    .line 107
    iget-object v10, v1, La/c7s0;->a:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v11, v1, La/c7s0;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v12, v1, La/c7s0;->c:Ljava/lang/String;

    .line 112
    .line 113
    sget-object v18, La/n12;->b:La/n12;

    .line 114
    .line 115
    iget-object v1, v0, La/z6s0;->M1:La/ii;

    .line 116
    .line 117
    if-eqz v1, :cond_1

    .line 118
    .line 119
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 120
    .line 121
    const/16 v19, 0x0

    .line 122
    .line 123
    const/16 v20, 0x5f8

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    const/4 v15, 0x0

    .line 128
    const/16 v16, 0x0

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v9, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v8

    .line 150
    :cond_2
    sget-object v2, La/a7s0;->a:La/a7s0;

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_3

    .line 157
    .line 158
    invoke-virtual {v0, v8}, La/z6s0;->G0(La/s9s0;)V

    .line 159
    .line 160
    .line 161
    :goto_0
    iget-object v0, v0, La/z6s0;->R1:La/a8z;

    .line 162
    .line 163
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, La/k3t0;

    .line 168
    .line 169
    sget-object v1, La/p6s0;->a:La/p6s0;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 178
    .line 179
    .line 180
    :goto_1
    return-object v8

    .line 181
    :pswitch_2
    move-object/from16 v1, p1

    .line 182
    .line 183
    check-cast v1, La/y5s0;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, La/k3t0;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_3
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/d6s0;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, La/a6s0;

    .line 208
    .line 209
    sget-object v2, La/a6s0;->S1:La/j6m0;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    instance-of v2, v1, La/b6s0;

    .line 215
    .line 216
    if-eqz v2, :cond_4

    .line 217
    .line 218
    check-cast v1, La/b6s0;

    .line 219
    .line 220
    iget-wide v2, v1, La/b6s0;->a:J

    .line 221
    .line 222
    iget-object v1, v1, La/b6s0;->b:Ljava/lang/String;

    .line 223
    .line 224
    sget-object v4, La/cl1;->o2:La/gfk0;

    .line 225
    .line 226
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {v2, v3, v1}, La/gfk0;->g(JLjava/lang/String;)La/cl1;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {v1, v2}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_4
    instance-of v2, v1, La/c6s0;

    .line 245
    .line 246
    if-eqz v2, :cond_6

    .line 247
    .line 248
    check-cast v1, La/c6s0;

    .line 249
    .line 250
    iget-object v10, v1, La/c6s0;->a:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v11, v1, La/c6s0;->b:Ljava/lang/String;

    .line 253
    .line 254
    iget-object v12, v1, La/c6s0;->c:Ljava/lang/String;

    .line 255
    .line 256
    sget-object v18, La/n12;->b:La/n12;

    .line 257
    .line 258
    iget-object v1, v0, La/a6s0;->M1:La/ii;

    .line 259
    .line 260
    if-eqz v1, :cond_5

    .line 261
    .line 262
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 263
    .line 264
    const/16 v19, 0x0

    .line 265
    .line 266
    const/16 v20, 0x5f8

    .line 267
    .line 268
    const/4 v13, 0x0

    .line 269
    const/4 v14, 0x0

    .line 270
    const/4 v15, 0x0

    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v9, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 286
    .line 287
    .line 288
    :goto_2
    invoke-virtual {v0}, La/a6s0;->G0()La/k3t0;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    sget-object v1, La/s5s0;->a:La/s5s0;

    .line 293
    .line 294
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v8

    .line 304
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 305
    .line 306
    .line 307
    :goto_3
    return-object v8

    .line 308
    :pswitch_4
    move-object/from16 v1, p1

    .line 309
    .line 310
    check-cast v1, La/o3s0;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, La/k3t0;

    .line 318
    .line 319
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_5
    move-object/from16 v1, p1

    .line 326
    .line 327
    check-cast v1, La/z3s0;

    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, La/v3s0;

    .line 335
    .line 336
    sget-object v2, La/v3s0;->S1:La/y2m0;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    instance-of v2, v1, La/x3s0;

    .line 342
    .line 343
    if-eqz v2, :cond_7

    .line 344
    .line 345
    check-cast v1, La/x3s0;

    .line 346
    .line 347
    iget-wide v2, v1, La/x3s0;->a:J

    .line 348
    .line 349
    iget-object v1, v1, La/x3s0;->b:Ljava/lang/String;

    .line 350
    .line 351
    sget-object v4, La/cl1;->o2:La/gfk0;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-static {v2, v3, v1}, La/gfk0;->g(JLjava/lang/String;)La/cl1;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {v1, v2}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 368
    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_7
    instance-of v2, v1, La/y3s0;

    .line 372
    .line 373
    if-eqz v2, :cond_9

    .line 374
    .line 375
    check-cast v1, La/y3s0;

    .line 376
    .line 377
    iget-object v10, v1, La/y3s0;->a:Ljava/lang/String;

    .line 378
    .line 379
    iget-object v11, v1, La/y3s0;->b:Ljava/lang/String;

    .line 380
    .line 381
    iget-object v12, v1, La/y3s0;->c:Ljava/lang/String;

    .line 382
    .line 383
    sget-object v18, La/n12;->b:La/n12;

    .line 384
    .line 385
    iget-object v1, v0, La/v3s0;->M1:La/ii;

    .line 386
    .line 387
    if-eqz v1, :cond_8

    .line 388
    .line 389
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 390
    .line 391
    const/16 v19, 0x0

    .line 392
    .line 393
    const/16 v20, 0x5f8

    .line 394
    .line 395
    const/4 v13, 0x0

    .line 396
    const/4 v14, 0x0

    .line 397
    const/4 v15, 0x0

    .line 398
    const/16 v16, 0x0

    .line 399
    .line 400
    const/16 v17, 0x0

    .line 401
    .line 402
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v9, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 413
    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v8

    .line 420
    :cond_9
    sget-object v2, La/w3s0;->a:La/w3s0;

    .line 421
    .line 422
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-eqz v1, :cond_a

    .line 427
    .line 428
    invoke-virtual {v0, v8}, La/v3s0;->G0(La/s9s0;)V

    .line 429
    .line 430
    .line 431
    :goto_4
    iget-object v0, v0, La/v3s0;->R1:La/a8z;

    .line 432
    .line 433
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, La/k3t0;

    .line 438
    .line 439
    sget-object v1, La/h3s0;->a:La/h3s0;

    .line 440
    .line 441
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    goto :goto_5

    .line 447
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 448
    .line 449
    .line 450
    :goto_5
    return-object v8

    .line 451
    :pswitch_6
    move-object/from16 v1, p1

    .line 452
    .line 453
    check-cast v1, Ljava/lang/Throwable;

    .line 454
    .line 455
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v0, La/zvr0;

    .line 461
    .line 462
    invoke-virtual {v0, v1}, La/zvr0;->O(Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_7
    move-object/from16 v1, p1

    .line 469
    .line 470
    check-cast v1, Ljava/lang/Throwable;

    .line 471
    .line 472
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, La/zvr0;

    .line 478
    .line 479
    invoke-virtual {v0, v1}, La/zvr0;->O(Ljava/lang/Throwable;)V

    .line 480
    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_8
    move-object/from16 v1, p1

    .line 486
    .line 487
    check-cast v1, Ljava/lang/Throwable;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, La/zvr0;

    .line 495
    .line 496
    invoke-virtual {v0, v1}, La/zvr0;->O(Ljava/lang/Throwable;)V

    .line 497
    .line 498
    .line 499
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object v0

    .line 502
    :pswitch_9
    move-object/from16 v1, p1

    .line 503
    .line 504
    check-cast v1, Ljava/lang/Throwable;

    .line 505
    .line 506
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v0, La/zvr0;

    .line 512
    .line 513
    invoke-virtual {v0, v1}, La/zvr0;->O(Ljava/lang/Throwable;)V

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_a
    move-object/from16 v1, p1

    .line 520
    .line 521
    check-cast v1, Ljava/lang/Throwable;

    .line 522
    .line 523
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v0, La/zvr0;

    .line 529
    .line 530
    invoke-virtual {v0, v1}, La/zvr0;->O(Ljava/lang/Throwable;)V

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_b
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, La/tvr0;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 544
    .line 545
    move-object v11, v0

    .line 546
    check-cast v11, La/mvr0;

    .line 547
    .line 548
    sget-object v0, La/mvr0;->W1:La/g9m0;

    .line 549
    .line 550
    instance-of v0, v1, La/rvr0;

    .line 551
    .line 552
    if-eqz v0, :cond_c

    .line 553
    .line 554
    check-cast v1, La/rvr0;

    .line 555
    .line 556
    iget-object v10, v1, La/rvr0;->a:La/xdk0;

    .line 557
    .line 558
    iget-object v9, v11, La/mvr0;->M1:La/wdk0;

    .line 559
    .line 560
    if-eqz v9, :cond_b

    .line 561
    .line 562
    iget-object v0, v11, La/mvr0;->R1:La/s0r;

    .line 563
    .line 564
    sget-object v1, La/mvr0;->X1:[La/iiy;

    .line 565
    .line 566
    aget-object v1, v1, v5

    .line 567
    .line 568
    invoke-virtual {v0, v1, v11}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    check-cast v0, La/nvr0;

    .line 576
    .line 577
    iget-object v13, v0, La/nvr0;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 578
    .line 579
    const/4 v15, 0x0

    .line 580
    const/16 v16, 0x3f4

    .line 581
    .line 582
    const/4 v12, 0x0

    .line 583
    const/4 v14, 0x0

    .line 584
    invoke-static/range {v9 .. v16}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 585
    .line 586
    .line 587
    goto/16 :goto_6

    .line 588
    .line 589
    :cond_b
    const-string v0, "snackbarManager"

    .line 590
    .line 591
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    throw v8

    .line 595
    :cond_c
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    sget-object v0, La/svr0;->a:La/svr0;

    .line 599
    .line 600
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    if-eqz v0, :cond_f

    .line 605
    .line 606
    iget-object v0, v11, La/mvr0;->O1:La/r9u;

    .line 607
    .line 608
    if-eqz v0, :cond_e

    .line 609
    .line 610
    sget-object v1, La/ygp;->B1:La/ygp;

    .line 611
    .line 612
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 618
    .line 619
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_d

    .line 624
    .line 625
    sget v0, La/ylr0;->m2:I

    .line 626
    .line 627
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-static {v0}, La/yum0;->m(Landroidx/fragment/app/e;)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_6

    .line 638
    .line 639
    :cond_d
    sget v0, La/amr0;->m2:I

    .line 640
    .line 641
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-static {v0}, La/cvm0;->l(Landroidx/fragment/app/e;)V

    .line 649
    .line 650
    .line 651
    goto :goto_6

    .line 652
    :cond_e
    const-string v0, "getFeatureToggleUseCase"

    .line 653
    .line 654
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v8

    .line 658
    :cond_f
    sget-object v0, La/pvr0;->a:La/pvr0;

    .line 659
    .line 660
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-eqz v0, :cond_10

    .line 665
    .line 666
    iget-object v0, v11, La/mvr0;->Q1:La/n0o0;

    .line 667
    .line 668
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    check-cast v0, La/qog0;

    .line 673
    .line 674
    new-instance v1, La/lz9;

    .line 675
    .line 676
    const/16 v2, 0x8

    .line 677
    .line 678
    invoke-direct {v1, v0, v11, v2}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    iget-object v2, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 685
    .line 686
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, La/qog0;->a()V

    .line 690
    .line 691
    .line 692
    goto :goto_6

    .line 693
    :cond_10
    instance-of v0, v1, La/qvr0;

    .line 694
    .line 695
    if-eqz v0, :cond_12

    .line 696
    .line 697
    check-cast v1, La/qvr0;

    .line 698
    .line 699
    iget-object v0, v1, La/qvr0;->a:Ljava/lang/String;

    .line 700
    .line 701
    iget-object v1, v11, La/mvr0;->N1:La/ii;

    .line 702
    .line 703
    if-eqz v1, :cond_11

    .line 704
    .line 705
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 706
    .line 707
    const v2, 0x7f1304dc

    .line 708
    .line 709
    .line 710
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v13

    .line 714
    const v2, 0x7f131630

    .line 715
    .line 716
    .line 717
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v11, v2, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v14

    .line 725
    invoke-virtual {v11, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v15

    .line 729
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v11, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v16

    .line 736
    sget-object v21, La/n12;->a:La/n12;

    .line 737
    .line 738
    const/16 v22, 0x0

    .line 739
    .line 740
    const/16 v23, 0x5d0

    .line 741
    .line 742
    const/16 v17, 0x0

    .line 743
    .line 744
    const-string v18, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 745
    .line 746
    const/16 v19, 0x0

    .line 747
    .line 748
    const/16 v20, 0x0

    .line 749
    .line 750
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v1, v12, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 761
    .line 762
    .line 763
    :goto_6
    invoke-virtual {v11}, La/mvr0;->G0()La/k3t0;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    sget-object v1, La/wur0;->a:La/wur0;

    .line 768
    .line 769
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 773
    .line 774
    goto :goto_7

    .line 775
    :cond_11
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    throw v8

    .line 779
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 780
    .line 781
    .line 782
    :goto_7
    return-object v8

    .line 783
    :pswitch_c
    move-object/from16 v1, p1

    .line 784
    .line 785
    check-cast v1, La/vtr0;

    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v0, La/k3t0;

    .line 793
    .line 794
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 798
    .line 799
    return-object v0

    .line 800
    :pswitch_d
    move-object/from16 v1, p1

    .line 801
    .line 802
    check-cast v1, Ljava/lang/Throwable;

    .line 803
    .line 804
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v0, La/ltr0;

    .line 810
    .line 811
    invoke-virtual {v0, v1}, La/ltr0;->N(Ljava/lang/Throwable;)V

    .line 812
    .line 813
    .line 814
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 815
    .line 816
    return-object v0

    .line 817
    :pswitch_e
    move-object/from16 v1, p1

    .line 818
    .line 819
    check-cast v1, Ljava/lang/Throwable;

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v0, La/ltr0;

    .line 827
    .line 828
    invoke-virtual {v0, v1}, La/ltr0;->N(Ljava/lang/Throwable;)V

    .line 829
    .line 830
    .line 831
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 832
    .line 833
    return-object v0

    .line 834
    :pswitch_f
    move-object/from16 v1, p1

    .line 835
    .line 836
    check-cast v1, Ljava/lang/Throwable;

    .line 837
    .line 838
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, La/ltr0;

    .line 844
    .line 845
    invoke-virtual {v0, v1}, La/ltr0;->N(Ljava/lang/Throwable;)V

    .line 846
    .line 847
    .line 848
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 849
    .line 850
    return-object v0

    .line 851
    :pswitch_10
    move-object/from16 v1, p1

    .line 852
    .line 853
    check-cast v1, La/l520;

    .line 854
    .line 855
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, La/k3t0;

    .line 861
    .line 862
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 866
    .line 867
    return-object v0

    .line 868
    :pswitch_11
    move-object/from16 v1, p1

    .line 869
    .line 870
    check-cast v1, La/etr0;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 876
    .line 877
    move-object v11, v0

    .line 878
    check-cast v11, La/usr0;

    .line 879
    .line 880
    sget v0, La/usr0;->r2:I

    .line 881
    .line 882
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    sget-object v0, La/ysr0;->a:La/ysr0;

    .line 886
    .line 887
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    if-eqz v0, :cond_13

    .line 892
    .line 893
    invoke-virtual {v11, v3}, La/sik;->E0(Z)V

    .line 894
    .line 895
    .line 896
    invoke-static {v11}, La/usr0;->P0(Landroidx/fragment/app/Fragment;)La/e920;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-interface {v0, v5}, La/e920;->v(Z)V

    .line 901
    .line 902
    .line 903
    goto/16 :goto_9

    .line 904
    .line 905
    :cond_13
    sget-object v0, La/wsr0;->a:La/wsr0;

    .line 906
    .line 907
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-eqz v0, :cond_15

    .line 912
    .line 913
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->R()Z

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    if-eqz v0, :cond_14

    .line 918
    .line 919
    goto/16 :goto_9

    .line 920
    .line 921
    :cond_14
    invoke-virtual {v11}, La/yo8;->y0()V

    .line 922
    .line 923
    .line 924
    goto/16 :goto_9

    .line 925
    .line 926
    :cond_15
    instance-of v0, v1, La/zsr0;

    .line 927
    .line 928
    if-eqz v0, :cond_18

    .line 929
    .line 930
    check-cast v1, La/zsr0;

    .line 931
    .line 932
    iget-object v0, v1, La/zsr0;->a:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 933
    .line 934
    iget-object v1, v1, La/zsr0;->b:Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 935
    .line 936
    iget-object v2, v11, La/usr0;->l2:La/lgn0;

    .line 937
    .line 938
    if-eqz v2, :cond_17

    .line 939
    .line 940
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    invoke-virtual {v2, v0, v1, v3}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 945
    .line 946
    .line 947
    iget-object v0, v11, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 948
    .line 949
    instance-of v1, v0, La/yo8;

    .line 950
    .line 951
    if-eqz v1, :cond_16

    .line 952
    .line 953
    move-object v8, v0

    .line 954
    check-cast v8, La/yo8;

    .line 955
    .line 956
    :cond_16
    if-eqz v8, :cond_21

    .line 957
    .line 958
    invoke-virtual {v8}, La/yo8;->x0()V

    .line 959
    .line 960
    .line 961
    goto/16 :goto_9

    .line 962
    .line 963
    :cond_17
    const-string v0, "successBetAlertManager"

    .line 964
    .line 965
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    throw v8

    .line 969
    :cond_18
    sget-object v0, La/atr0;->a:La/atr0;

    .line 970
    .line 971
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    if-eqz v0, :cond_1a

    .line 976
    .line 977
    iget-object v12, v11, La/usr0;->m2:La/ynb;

    .line 978
    .line 979
    if-eqz v12, :cond_19

    .line 980
    .line 981
    sget-object v13, La/bm5;->l:La/bm5;

    .line 982
    .line 983
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 984
    .line 985
    .line 986
    move-result-object v15

    .line 987
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    const-string v17, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 991
    .line 992
    const/16 v18, 0x1ce

    .line 993
    .line 994
    const/4 v14, 0x0

    .line 995
    const/16 v16, 0x0

    .line 996
    .line 997
    invoke-static/range {v12 .. v18}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 998
    .line 999
    .line 1000
    goto/16 :goto_9

    .line 1001
    .line 1002
    :cond_19
    const-string v0, "changeBalanceDialogProvider"

    .line 1003
    .line 1004
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    throw v8

    .line 1008
    :cond_1a
    instance-of v0, v1, La/btr0;

    .line 1009
    .line 1010
    if-eqz v0, :cond_1c

    .line 1011
    .line 1012
    check-cast v1, La/btr0;

    .line 1013
    .line 1014
    iget-object v14, v1, La/btr0;->a:Ljava/lang/String;

    .line 1015
    .line 1016
    iget-object v0, v11, La/usr0;->o2:La/ii;

    .line 1017
    .line 1018
    if-eqz v0, :cond_1b

    .line 1019
    .line 1020
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1021
    .line 1022
    const v1, 0x7f1307bb

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v13

    .line 1029
    const v1, 0x7f13115a

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v15

    .line 1036
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v11, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v16

    .line 1043
    sget-object v21, La/n12;->b:La/n12;

    .line 1044
    .line 1045
    const/16 v22, 0x0

    .line 1046
    .line 1047
    const/16 v23, 0x5d0

    .line 1048
    .line 1049
    const/16 v17, 0x0

    .line 1050
    .line 1051
    const-string v18, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 1052
    .line 1053
    const/16 v19, 0x0

    .line 1054
    .line 1055
    const/16 v20, 0x0

    .line 1056
    .line 1057
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v0, v12, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1068
    .line 1069
    .line 1070
    goto :goto_9

    .line 1071
    :cond_1b
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1072
    .line 1073
    .line 1074
    throw v8

    .line 1075
    :cond_1c
    sget-object v0, La/ctr0;->a:La/ctr0;

    .line 1076
    .line 1077
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_1d

    .line 1082
    .line 1083
    invoke-virtual {v11, v5}, La/sik;->E0(Z)V

    .line 1084
    .line 1085
    .line 1086
    invoke-static {v11}, La/usr0;->P0(Landroidx/fragment/app/Fragment;)La/e920;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    invoke-interface {v0, v3}, La/e920;->v(Z)V

    .line 1091
    .line 1092
    .line 1093
    goto :goto_9

    .line 1094
    :cond_1d
    instance-of v0, v1, La/dtr0;

    .line 1095
    .line 1096
    if-eqz v0, :cond_20

    .line 1097
    .line 1098
    check-cast v1, La/dtr0;

    .line 1099
    .line 1100
    iget-object v10, v1, La/dtr0;->a:La/xdk0;

    .line 1101
    .line 1102
    iget-object v0, v11, La/sik;->S1:Landroid/app/Dialog;

    .line 1103
    .line 1104
    if-eqz v0, :cond_1e

    .line 1105
    .line 1106
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    if-eqz v0, :cond_1e

    .line 1111
    .line 1112
    const v1, 0x1020002

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    check-cast v0, Landroid/view/ViewGroup;

    .line 1120
    .line 1121
    move-object v13, v0

    .line 1122
    goto :goto_8

    .line 1123
    :cond_1e
    move-object v13, v8

    .line 1124
    :goto_8
    iget-object v9, v11, La/usr0;->n2:La/wdk0;

    .line 1125
    .line 1126
    if-eqz v9, :cond_1f

    .line 1127
    .line 1128
    const/4 v15, 0x0

    .line 1129
    const/16 v16, 0x3f4

    .line 1130
    .line 1131
    const/4 v12, 0x0

    .line 1132
    const/4 v14, 0x0

    .line 1133
    invoke-static/range {v9 .. v16}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1134
    .line 1135
    .line 1136
    goto :goto_9

    .line 1137
    :cond_1f
    const-string v0, "snackBarManager"

    .line 1138
    .line 1139
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    throw v8

    .line 1143
    :cond_20
    sget-object v0, La/xsr0;->a:La/xsr0;

    .line 1144
    .line 1145
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v0

    .line 1149
    if-eqz v0, :cond_22

    .line 1150
    .line 1151
    invoke-static {v11}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1152
    .line 1153
    .line 1154
    iget-object v0, v11, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 1155
    .line 1156
    if-eqz v0, :cond_21

    .line 1157
    .line 1158
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 1159
    .line 1160
    .line 1161
    :cond_21
    :goto_9
    invoke-virtual {v11}, La/usr0;->Q0()La/k3t0;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    sget-object v1, La/k320;->a:La/k320;

    .line 1166
    .line 1167
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1168
    .line 1169
    .line 1170
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1171
    .line 1172
    goto :goto_a

    .line 1173
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1174
    .line 1175
    .line 1176
    :goto_a
    return-object v8

    .line 1177
    :pswitch_12
    move-object/from16 v1, p1

    .line 1178
    .line 1179
    check-cast v1, La/l520;

    .line 1180
    .line 1181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1182
    .line 1183
    .line 1184
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v0, La/k3t0;

    .line 1187
    .line 1188
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1189
    .line 1190
    .line 1191
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1192
    .line 1193
    return-object v0

    .line 1194
    :pswitch_13
    move-object/from16 v1, p1

    .line 1195
    .line 1196
    check-cast v1, Ljava/lang/Throwable;

    .line 1197
    .line 1198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1202
    .line 1203
    check-cast v0, La/psr0;

    .line 1204
    .line 1205
    invoke-virtual {v0, v1}, La/psr0;->N(Ljava/lang/Throwable;)V

    .line 1206
    .line 1207
    .line 1208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :pswitch_14
    move-object/from16 v1, p1

    .line 1212
    .line 1213
    check-cast v1, Ljava/lang/Throwable;

    .line 1214
    .line 1215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1219
    .line 1220
    check-cast v0, La/psr0;

    .line 1221
    .line 1222
    sget v2, La/psr0;->K:I

    .line 1223
    .line 1224
    invoke-virtual {v0, v1}, La/psr0;->N(Ljava/lang/Throwable;)V

    .line 1225
    .line 1226
    .line 1227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1228
    .line 1229
    return-object v0

    .line 1230
    :pswitch_15
    move-object/from16 v1, p1

    .line 1231
    .line 1232
    check-cast v1, Ljava/lang/Throwable;

    .line 1233
    .line 1234
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v0, La/psr0;

    .line 1240
    .line 1241
    invoke-virtual {v0, v1}, La/psr0;->N(Ljava/lang/Throwable;)V

    .line 1242
    .line 1243
    .line 1244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1245
    .line 1246
    return-object v0

    .line 1247
    :pswitch_16
    move-object/from16 v1, p1

    .line 1248
    .line 1249
    check-cast v1, Ljava/lang/Throwable;

    .line 1250
    .line 1251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    .line 1253
    .line 1254
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1255
    .line 1256
    check-cast v0, La/yrr0;

    .line 1257
    .line 1258
    iget-object v3, v0, La/yrr0;->t:La/duj;

    .line 1259
    .line 1260
    new-instance v4, La/p6r0;

    .line 1261
    .line 1262
    invoke-direct {v4, v0, v2}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1266
    .line 1267
    .line 1268
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1269
    .line 1270
    return-object v0

    .line 1271
    :pswitch_17
    move-object/from16 v1, p1

    .line 1272
    .line 1273
    check-cast v1, Ljava/lang/Throwable;

    .line 1274
    .line 1275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1276
    .line 1277
    .line 1278
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1279
    .line 1280
    check-cast v0, La/yrr0;

    .line 1281
    .line 1282
    iget-object v3, v0, La/yrr0;->t:La/duj;

    .line 1283
    .line 1284
    new-instance v4, La/p6r0;

    .line 1285
    .line 1286
    invoke-direct {v4, v0, v2}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1290
    .line 1291
    .line 1292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1293
    .line 1294
    return-object v0

    .line 1295
    :pswitch_18
    move-object/from16 v1, p1

    .line 1296
    .line 1297
    check-cast v1, La/sqr0;

    .line 1298
    .line 1299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v0, La/wpr0;

    .line 1305
    .line 1306
    sget-object v2, La/wpr0;->P1:La/s9m0;

    .line 1307
    .line 1308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    instance-of v2, v1, La/pqr0;

    .line 1312
    .line 1313
    if-eqz v2, :cond_2b

    .line 1314
    .line 1315
    check-cast v1, La/pqr0;

    .line 1316
    .line 1317
    iget-object v1, v1, La/pqr0;->a:La/ua20;

    .line 1318
    .line 1319
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1320
    .line 1321
    .line 1322
    move-result v1

    .line 1323
    const-string v2, "JackpotSimpleBetDialogTag"

    .line 1324
    .line 1325
    if-eqz v1, :cond_29

    .line 1326
    .line 1327
    if-eq v1, v3, :cond_27

    .line 1328
    .line 1329
    const/4 v3, 0x2

    .line 1330
    if-eq v1, v3, :cond_25

    .line 1331
    .line 1332
    const/4 v3, 0x3

    .line 1333
    if-ne v1, v3, :cond_24

    .line 1334
    .line 1335
    sget v1, La/h1y;->q2:I

    .line 1336
    .line 1337
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v1

    .line 1341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v3

    .line 1348
    if-eqz v3, :cond_23

    .line 1349
    .line 1350
    goto/16 :goto_b

    .line 1351
    .line 1352
    :cond_23
    new-instance v3, La/h1y;

    .line 1353
    .line 1354
    invoke-direct {v3}, La/h1y;-><init>()V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1358
    .line 1359
    .line 1360
    goto/16 :goto_b

    .line 1361
    .line 1362
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1363
    .line 1364
    .line 1365
    goto/16 :goto_c

    .line 1366
    .line 1367
    :cond_25
    sget v1, La/o3y;->q2:I

    .line 1368
    .line 1369
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v1

    .line 1373
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1374
    .line 1375
    .line 1376
    const-string v2, "JackpotLiteNoTabBetTag"

    .line 1377
    .line 1378
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v3

    .line 1382
    if-eqz v3, :cond_26

    .line 1383
    .line 1384
    goto/16 :goto_b

    .line 1385
    .line 1386
    :cond_26
    new-instance v3, La/o3y;

    .line 1387
    .line 1388
    invoke-direct {v3}, La/o3y;-><init>()V

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    goto/16 :goto_b

    .line 1395
    .line 1396
    :cond_27
    sget v1, La/p4y;->q2:I

    .line 1397
    .line 1398
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v1

    .line 1402
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v3

    .line 1409
    if-eqz v3, :cond_28

    .line 1410
    .line 1411
    goto/16 :goto_b

    .line 1412
    .line 1413
    :cond_28
    new-instance v3, La/p4y;

    .line 1414
    .line 1415
    invoke-direct {v3}, La/p4y;-><init>()V

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1419
    .line 1420
    .line 1421
    goto/16 :goto_b

    .line 1422
    .line 1423
    :cond_29
    sget v1, La/o5y;->q2:I

    .line 1424
    .line 1425
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v3

    .line 1436
    if-eqz v3, :cond_2a

    .line 1437
    .line 1438
    goto/16 :goto_b

    .line 1439
    .line 1440
    :cond_2a
    new-instance v3, La/o5y;

    .line 1441
    .line 1442
    invoke-direct {v3}, La/o5y;-><init>()V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1446
    .line 1447
    .line 1448
    goto/16 :goto_b

    .line 1449
    .line 1450
    :cond_2b
    sget-object v2, La/qqr0;->a:La/qqr0;

    .line 1451
    .line 1452
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1453
    .line 1454
    .line 1455
    move-result v2

    .line 1456
    const v3, 0x7f130162

    .line 1457
    .line 1458
    .line 1459
    if-eqz v2, :cond_2d

    .line 1460
    .line 1461
    iget-object v1, v0, La/wpr0;->N1:La/ii;

    .line 1462
    .line 1463
    if-eqz v1, :cond_2c

    .line 1464
    .line 1465
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1466
    .line 1467
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v10

    .line 1471
    const v2, 0x7f131619

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v11

    .line 1478
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v12

    .line 1482
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v13

    .line 1489
    sget-object v18, La/n12;->b:La/n12;

    .line 1490
    .line 1491
    const/16 v19, 0x0

    .line 1492
    .line 1493
    const/16 v20, 0x5d0

    .line 1494
    .line 1495
    const/4 v14, 0x0

    .line 1496
    const-string v15, "REQUEST_JACKPOT_CLEAR_DIALOG_KEY"

    .line 1497
    .line 1498
    const/16 v16, 0x0

    .line 1499
    .line 1500
    const/16 v17, 0x0

    .line 1501
    .line 1502
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v2

    .line 1509
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v1, v9, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1513
    .line 1514
    .line 1515
    goto/16 :goto_b

    .line 1516
    .line 1517
    :cond_2c
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1518
    .line 1519
    .line 1520
    throw v8

    .line 1521
    :cond_2d
    sget-object v2, La/rqr0;->a:La/rqr0;

    .line 1522
    .line 1523
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1524
    .line 1525
    .line 1526
    move-result v2

    .line 1527
    if-eqz v2, :cond_2f

    .line 1528
    .line 1529
    iget-object v1, v0, La/wpr0;->N1:La/ii;

    .line 1530
    .line 1531
    if-eqz v1, :cond_2e

    .line 1532
    .line 1533
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1534
    .line 1535
    const v2, 0x7f131616

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v10

    .line 1542
    const v2, 0x7f13163c

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v11

    .line 1549
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v12

    .line 1553
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1554
    .line 1555
    .line 1556
    sget-object v18, La/n12;->b:La/n12;

    .line 1557
    .line 1558
    const/16 v19, 0x0

    .line 1559
    .line 1560
    const/16 v20, 0x5f8

    .line 1561
    .line 1562
    const/4 v13, 0x0

    .line 1563
    const/4 v14, 0x0

    .line 1564
    const/4 v15, 0x0

    .line 1565
    const/16 v16, 0x0

    .line 1566
    .line 1567
    const/16 v17, 0x0

    .line 1568
    .line 1569
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v2

    .line 1576
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v1, v9, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1580
    .line 1581
    .line 1582
    goto :goto_b

    .line 1583
    :cond_2e
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1584
    .line 1585
    .line 1586
    throw v8

    .line 1587
    :cond_2f
    sget-object v2, La/oqr0;->a:La/oqr0;

    .line 1588
    .line 1589
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1590
    .line 1591
    .line 1592
    move-result v1

    .line 1593
    if-eqz v1, :cond_31

    .line 1594
    .line 1595
    iget-object v1, v0, La/wpr0;->N1:La/ii;

    .line 1596
    .line 1597
    if-eqz v1, :cond_30

    .line 1598
    .line 1599
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1600
    .line 1601
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v10

    .line 1605
    const v2, 0x7f1316ef

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v11

    .line 1612
    const v2, 0x7f130e5c

    .line 1613
    .line 1614
    .line 1615
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v12

    .line 1619
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1620
    .line 1621
    .line 1622
    sget-object v18, La/n12;->b:La/n12;

    .line 1623
    .line 1624
    const/16 v19, 0x0

    .line 1625
    .line 1626
    const/16 v20, 0x5f8

    .line 1627
    .line 1628
    const/4 v13, 0x0

    .line 1629
    const/4 v14, 0x0

    .line 1630
    const/4 v15, 0x0

    .line 1631
    const/16 v16, 0x0

    .line 1632
    .line 1633
    const/16 v17, 0x0

    .line 1634
    .line 1635
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v2

    .line 1642
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v1, v9, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1646
    .line 1647
    .line 1648
    :goto_b
    iget-object v0, v0, La/wpr0;->O1:La/a8z;

    .line 1649
    .line 1650
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v0

    .line 1654
    check-cast v0, La/k3t0;

    .line 1655
    .line 1656
    sget-object v1, La/xor0;->a:La/xor0;

    .line 1657
    .line 1658
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1659
    .line 1660
    .line 1661
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1662
    .line 1663
    goto :goto_c

    .line 1664
    :cond_30
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1665
    .line 1666
    .line 1667
    throw v8

    .line 1668
    :cond_31
    invoke-static {}, La/t9f;->b()V

    .line 1669
    .line 1670
    .line 1671
    :goto_c
    return-object v8

    .line 1672
    :pswitch_19
    move-object/from16 v1, p1

    .line 1673
    .line 1674
    check-cast v1, Ljava/lang/Throwable;

    .line 1675
    .line 1676
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v0, La/njr0;

    .line 1682
    .line 1683
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 1684
    .line 1685
    .line 1686
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1687
    .line 1688
    return-object v0

    .line 1689
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1690
    .line 1691
    check-cast v1, Ljava/lang/Throwable;

    .line 1692
    .line 1693
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1694
    .line 1695
    .line 1696
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1697
    .line 1698
    check-cast v0, La/njr0;

    .line 1699
    .line 1700
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 1701
    .line 1702
    .line 1703
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1704
    .line 1705
    return-object v0

    .line 1706
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1707
    .line 1708
    check-cast v1, Ljava/lang/Throwable;

    .line 1709
    .line 1710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1711
    .line 1712
    .line 1713
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1714
    .line 1715
    check-cast v0, La/njr0;

    .line 1716
    .line 1717
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 1718
    .line 1719
    .line 1720
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1721
    .line 1722
    return-object v0

    .line 1723
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1724
    .line 1725
    check-cast v1, Ljava/lang/Throwable;

    .line 1726
    .line 1727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1728
    .line 1729
    .line 1730
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1731
    .line 1732
    check-cast v0, La/njr0;

    .line 1733
    .line 1734
    invoke-virtual {v0, v1}, La/njr0;->z(Ljava/lang/Throwable;)V

    .line 1735
    .line 1736
    .line 1737
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1738
    .line 1739
    return-object v0

    .line 1740
    nop

    .line 1741
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
