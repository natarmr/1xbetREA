.class public final La/y38;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLa/kmq;La/hie0;La/lie0;Ljava/lang/Object;)V
    .locals 0

    .line 18
    iput-byte p1, p0, La/y38;->a:B

    iput-object p2, p0, La/y38;->b:Ljava/lang/Object;

    iput-object p4, p0, La/y38;->e:Ljava/lang/Object;

    iput-object p3, p0, La/y38;->c:Ljava/lang/Object;

    iput-object p5, p0, La/y38;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/mie0;La/kmq;[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    iput-byte v0, p0, La/y38;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/y38;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, La/y38;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, La/y38;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, La/y38;->e:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/mie0;La/vne;La/utb;La/kmq;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/y38;->a:B

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y38;->c:Ljava/lang/Object;

    iput-object p2, p0, La/y38;->d:Ljava/lang/Object;

    iput-object p3, p0, La/y38;->e:Ljava/lang/Object;

    iput-object p4, p0, La/y38;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 19
    iput-byte p5, p0, La/y38;->a:B

    iput-object p2, p0, La/y38;->c:Ljava/lang/Object;

    iput-object p3, p0, La/y38;->d:Ljava/lang/Object;

    iput-object p4, p0, La/y38;->e:Ljava/lang/Object;

    iput-object p1, p0, La/y38;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-byte v3, v0, La/y38;->a:B

    .line 8
    .line 9
    const/16 v4, 0x9

    .line 10
    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x0

    .line 13
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v11, 0x1

    .line 16
    iget-object v12, v0, La/y38;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v13, v0, La/y38;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v14, v0, La/y38;->d:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v15, v0, La/y38;->e:Ljava/lang/Object;

    .line 23
    .line 24
    const-wide/16 v16, 0x0

    .line 25
    .line 26
    packed-switch v3, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v1, [I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, La/y38;->c([ILa/yje;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_0
    check-cast v15, La/lie0;

    .line 37
    .line 38
    check-cast v14, Ljava/lang/String;

    .line 39
    .line 40
    check-cast v13, La/ldi0;

    .line 41
    .line 42
    iget-object v3, v13, La/ldi0;->A:La/au0;

    .line 43
    .line 44
    iget-object v6, v13, La/ldi0;->m:La/zg;

    .line 45
    .line 46
    const/high16 v18, -0x80000000

    .line 47
    .line 48
    instance-of v10, v2, La/wci0;

    .line 49
    .line 50
    if-eqz v10, :cond_0

    .line 51
    .line 52
    move-object v10, v2

    .line 53
    check-cast v10, La/wci0;

    .line 54
    .line 55
    iget v5, v10, La/wci0;->j:I

    .line 56
    .line 57
    and-int v20, v5, v18

    .line 58
    .line 59
    if-eqz v20, :cond_0

    .line 60
    .line 61
    sub-int v5, v5, v18

    .line 62
    .line 63
    iput v5, v10, La/wci0;->j:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    new-instance v10, La/wci0;

    .line 67
    .line 68
    invoke-direct {v10, v0, v2}, La/wci0;-><init>(La/y38;La/yje;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object v0, v10, La/wci0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    sget-object v2, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget v5, v10, La/wci0;->j:I

    .line 76
    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    if-eq v5, v11, :cond_2

    .line 80
    .line 81
    if-ne v5, v7, :cond_1

    .line 82
    .line 83
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_7

    .line 87
    .line 88
    :cond_1
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    const/4 v5, 0x0

    .line 92
    goto/16 :goto_8

    .line 93
    .line 94
    :cond_2
    iget-object v1, v10, La/wci0;->l:La/kmq;

    .line 95
    .line 96
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    const/4 v3, 0x0

    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object v0, v12

    .line 106
    check-cast v0, La/kmq;

    .line 107
    .line 108
    check-cast v1, La/e7a;

    .line 109
    .line 110
    if-eqz v1, :cond_9

    .line 111
    .line 112
    instance-of v5, v1, La/d7a;

    .line 113
    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    iget-object v0, v13, La/ldi0;->c:La/dci0;

    .line 117
    .line 118
    invoke-interface {v0}, La/dci0;->p()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/16 v2, 0x8

    .line 123
    .line 124
    if-eq v0, v2, :cond_4

    .line 125
    .line 126
    if-eq v0, v4, :cond_4

    .line 127
    .line 128
    const-string v0, "phone_binding"

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_4
    const-string v0, "link_phone_mailing"

    .line 132
    .line 133
    :goto_3
    invoke-virtual {v6, v0}, La/zg;->e(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v14}, La/au0;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v2

    .line 143
    iput-wide v2, v15, La/lie0;->a:J

    .line 144
    .line 145
    iget-object v0, v13, La/ldi0;->I:La/ol60;

    .line 146
    .line 147
    new-instance v2, La/kci0;

    .line 148
    .line 149
    iget-object v3, v13, La/ldi0;->p:La/ctf0;

    .line 150
    .line 151
    new-array v4, v8, [Ljava/lang/Object;

    .line 152
    .line 153
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 154
    .line 155
    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    const v5, 0x7f130045

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v1, La/d7a;

    .line 167
    .line 168
    invoke-direct {v2, v1, v3}, La/kci0;-><init>(La/d7a;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_5
    instance-of v4, v1, La/c7a;

    .line 176
    .line 177
    if-eqz v4, :cond_9

    .line 178
    .line 179
    iget-wide v4, v15, La/lie0;->a:J

    .line 180
    .line 181
    cmp-long v4, v4, v16

    .line 182
    .line 183
    if-nez v4, :cond_6

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    invoke-virtual {v6, v14}, La/zg;->d(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v14}, La/au0;->g(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_4
    check-cast v1, La/c7a;

    .line 193
    .line 194
    iget-object v1, v1, La/c7a;->a:La/ynb0;

    .line 195
    .line 196
    iput-object v0, v10, La/wci0;->l:La/kmq;

    .line 197
    .line 198
    iput v11, v10, La/wci0;->j:I

    .line 199
    .line 200
    invoke-virtual {v13, v1, v10}, La/ldi0;->w(La/ynb0;La/zje;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-ne v1, v2, :cond_7

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_7
    move-object v3, v1

    .line 208
    move-object v1, v0

    .line 209
    move-object v0, v3

    .line 210
    goto :goto_2

    .line 211
    :goto_5
    iput-object v3, v10, La/wci0;->l:La/kmq;

    .line 212
    .line 213
    iput v7, v10, La/wci0;->j:I

    .line 214
    .line 215
    invoke-interface {v1, v0, v10}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-ne v0, v2, :cond_8

    .line 220
    .line 221
    :goto_6
    move-object v5, v2

    .line 222
    goto :goto_8

    .line 223
    :cond_8
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :goto_8
    return-object v5

    .line 232
    :pswitch_1
    move-object v0, v1

    .line 233
    check-cast v0, La/prs0;

    .line 234
    .line 235
    check-cast v13, La/cgk0;

    .line 236
    .line 237
    iget-object v1, v0, La/prs0;->a:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    iget-object v2, v0, La/prs0;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, Ljava/lang/Boolean;

    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    iget-object v0, v0, La/prs0;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, Ljava/lang/Boolean;

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-nez v2, :cond_b

    .line 262
    .line 263
    if-eqz v0, :cond_a

    .line 264
    .line 265
    goto :goto_9

    .line 266
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    goto/16 :goto_12

    .line 269
    .line 270
    :cond_b
    :goto_9
    sget v0, La/ys90;->a:F

    .line 271
    .line 272
    invoke-virtual {v13}, La/cgk0;->l()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-ne v1, v0, :cond_c

    .line 277
    .line 278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    goto/16 :goto_12

    .line 281
    .line 282
    :cond_c
    check-cast v12, La/pz40;

    .line 283
    .line 284
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Ljava/util/List;

    .line 289
    .line 290
    if-ltz v1, :cond_1d

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    if-ge v1, v2, :cond_1d

    .line 297
    .line 298
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, La/cav0;

    .line 303
    .line 304
    iget-boolean v0, v0, La/cav0;->c:Z

    .line 305
    .line 306
    if-eqz v0, :cond_1c

    .line 307
    .line 308
    check-cast v14, La/nw20;

    .line 309
    .line 310
    check-cast v15, La/egk0;

    .line 311
    .line 312
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 313
    .line 314
    .line 315
    move-result-wide v2

    .line 316
    invoke-virtual {v15}, La/egk0;->l()J

    .line 317
    .line 318
    .line 319
    move-result-wide v5

    .line 320
    cmp-long v0, v5, v16

    .line 321
    .line 322
    const-wide/16 v5, 0x78

    .line 323
    .line 324
    if-nez v0, :cond_d

    .line 325
    .line 326
    move-wide/from16 v16, v5

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_d
    invoke-virtual {v15}, La/egk0;->l()J

    .line 330
    .line 331
    .line 332
    move-result-wide v9

    .line 333
    sub-long v9, v2, v9

    .line 334
    .line 335
    move-wide/from16 v16, v9

    .line 336
    .line 337
    :goto_a
    const-wide/16 v18, 0x28

    .line 338
    .line 339
    const-wide/16 v20, 0x12c

    .line 340
    .line 341
    invoke-static/range {v16 .. v21}, La/l1e0;->f(JJJ)J

    .line 342
    .line 343
    .line 344
    move-result-wide v9

    .line 345
    const-wide/16 v16, 0x23

    .line 346
    .line 347
    cmp-long v0, v9, v16

    .line 348
    .line 349
    const/high16 v12, 0x3f800000    # 1.0f

    .line 350
    .line 351
    if-gez v0, :cond_e

    .line 352
    .line 353
    move v0, v12

    .line 354
    goto :goto_b

    .line 355
    :cond_e
    const-wide/16 v16, 0x46

    .line 356
    .line 357
    cmp-long v0, v9, v16

    .line 358
    .line 359
    if-gez v0, :cond_f

    .line 360
    .line 361
    const/high16 v0, 0x3f400000    # 0.75f

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_f
    cmp-long v0, v9, v5

    .line 365
    .line 366
    if-gez v0, :cond_10

    .line 367
    .line 368
    const v0, 0x3f0ccccd    # 0.55f

    .line 369
    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_10
    const v0, 0x3ecccccd    # 0.4f

    .line 373
    .line 374
    .line 375
    :goto_b
    iget-object v5, v14, La/nw20;->a:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v5, La/omv;

    .line 378
    .line 379
    iget-object v6, v14, La/nw20;->b:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v6, Landroid/os/Vibrator;

    .line 382
    .line 383
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 384
    .line 385
    const/16 v10, 0x1e

    .line 386
    .line 387
    if-lt v9, v10, :cond_12

    .line 388
    .line 389
    new-instance v10, La/f54;

    .line 390
    .line 391
    const/16 v14, 0x19

    .line 392
    .line 393
    invoke-direct {v10, v0, v14}, La/f54;-><init>(FB)V

    .line 394
    .line 395
    .line 396
    if-nez v6, :cond_11

    .line 397
    .line 398
    goto :goto_c

    .line 399
    :cond_11
    :try_start_0
    invoke-virtual {v10, v6}, La/f54;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 400
    .line 401
    .line 402
    move v10, v11

    .line 403
    goto :goto_d

    .line 404
    :catchall_0
    :cond_12
    :goto_c
    move v10, v8

    .line 405
    :goto_d
    const/16 v14, 0x1d

    .line 406
    .line 407
    if-lt v9, v14, :cond_16

    .line 408
    .line 409
    if-nez v10, :cond_16

    .line 410
    .line 411
    if-nez v6, :cond_13

    .line 412
    .line 413
    :catchall_1
    move v10, v8

    .line 414
    goto :goto_f

    .line 415
    :cond_13
    const/high16 v10, 0x3fc00000    # 1.5f

    .line 416
    .line 417
    mul-float/2addr v10, v0

    .line 418
    const/4 v14, 0x0

    .line 419
    :try_start_1
    invoke-static {v10, v14, v12}, La/l1e0;->c(FFF)F

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    const v12, 0x3f59999a    # 0.85f

    .line 424
    .line 425
    .line 426
    cmpl-float v10, v10, v12

    .line 427
    .line 428
    if-ltz v10, :cond_14

    .line 429
    .line 430
    move v7, v8

    .line 431
    :cond_14
    invoke-static {v6}, La/um30;->B(Landroid/os/Vibrator;)Z

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    if-eqz v10, :cond_15

    .line 436
    .line 437
    invoke-static {v7}, La/xl50;->h(I)Landroid/os/VibrationEffect;

    .line 438
    .line 439
    .line 440
    move-result-object v7

    .line 441
    invoke-static {v6, v7}, La/um30;->p(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 442
    .line 443
    .line 444
    goto :goto_e

    .line 445
    :cond_15
    invoke-static {}, La/um30;->h()Landroid/os/VibrationEffect;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    invoke-static {v6, v7}, La/um30;->p(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 450
    .line 451
    .line 452
    :goto_e
    move v10, v11

    .line 453
    :cond_16
    :goto_f
    const/16 v7, 0x1a

    .line 454
    .line 455
    if-lt v9, v7, :cond_1a

    .line 456
    .line 457
    if-nez v10, :cond_1a

    .line 458
    .line 459
    if-nez v6, :cond_17

    .line 460
    .line 461
    goto :goto_11

    .line 462
    :cond_17
    :try_start_2
    invoke-static {v6}, La/um30;->B(Landroid/os/Vibrator;)Z

    .line 463
    .line 464
    .line 465
    move-result v7

    .line 466
    if-eqz v7, :cond_18

    .line 467
    .line 468
    const-wide/16 v9, 0xa

    .line 469
    .line 470
    goto :goto_10

    .line 471
    :cond_18
    const-wide/16 v9, 0xd

    .line 472
    .line 473
    :goto_10
    invoke-static {v6}, La/um30;->B(Landroid/os/Vibrator;)Z

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    const/16 v12, 0xff

    .line 478
    .line 479
    if-eqz v7, :cond_19

    .line 480
    .line 481
    const/high16 v7, 0x433f0000    # 191.0f

    .line 482
    .line 483
    mul-float/2addr v7, v0

    .line 484
    const/high16 v0, 0x42800000    # 64.0f

    .line 485
    .line 486
    add-float/2addr v7, v0

    .line 487
    float-to-int v0, v7

    .line 488
    invoke-static {v0, v11, v12}, La/l1e0;->d(III)I

    .line 489
    .line 490
    .line 491
    move-result v12

    .line 492
    :cond_19
    invoke-static {v12, v9, v10}, La/um30;->i(IJ)Landroid/os/VibrationEffect;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v6, v0}, La/um30;->p(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 497
    .line 498
    .line 499
    move v8, v11

    .line 500
    :catchall_2
    :goto_11
    move v10, v8

    .line 501
    :cond_1a
    if-nez v10, :cond_1b

    .line 502
    .line 503
    invoke-static {v5, v4}, La/ckb;->a0(La/omv;I)V

    .line 504
    .line 505
    .line 506
    :cond_1b
    invoke-virtual {v15, v2, v3}, La/egk0;->m(J)V

    .line 507
    .line 508
    .line 509
    :cond_1c
    invoke-virtual {v13, v1}, La/cgk0;->m(I)V

    .line 510
    .line 511
    .line 512
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    :goto_12
    return-object v0

    .line 515
    :pswitch_2
    const/high16 v18, -0x80000000

    .line 516
    .line 517
    check-cast v13, La/hie0;

    .line 518
    .line 519
    check-cast v15, La/lie0;

    .line 520
    .line 521
    instance-of v3, v2, La/r1v;

    .line 522
    .line 523
    if-eqz v3, :cond_1e

    .line 524
    .line 525
    move-object v3, v2

    .line 526
    check-cast v3, La/r1v;

    .line 527
    .line 528
    iget v4, v3, La/r1v;->j:I

    .line 529
    .line 530
    and-int v5, v4, v18

    .line 531
    .line 532
    if-eqz v5, :cond_1e

    .line 533
    .line 534
    sub-int v4, v4, v18

    .line 535
    .line 536
    iput v4, v3, La/r1v;->j:I

    .line 537
    .line 538
    goto :goto_13

    .line 539
    :cond_1e
    new-instance v3, La/r1v;

    .line 540
    .line 541
    invoke-direct {v3, v0, v2}, La/r1v;-><init>(La/y38;La/yje;)V

    .line 542
    .line 543
    .line 544
    :goto_13
    iget-object v0, v3, La/r1v;->i:Ljava/lang/Object;

    .line 545
    .line 546
    sget-object v2, La/wne;->a:La/wne;

    .line 547
    .line 548
    iget v4, v3, La/r1v;->j:I

    .line 549
    .line 550
    if-eqz v4, :cond_22

    .line 551
    .line 552
    if-eq v4, v11, :cond_20

    .line 553
    .line 554
    if-ne v4, v7, :cond_1f

    .line 555
    .line 556
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_16

    .line 560
    .line 561
    :cond_1f
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    const/4 v5, 0x0

    .line 565
    goto/16 :goto_17

    .line 566
    .line 567
    :cond_20
    iget-wide v4, v3, La/r1v;->p:J

    .line 568
    .line 569
    iget-boolean v1, v3, La/r1v;->o:Z

    .line 570
    .line 571
    iget-object v6, v3, La/r1v;->n:La/a6u;

    .line 572
    .line 573
    iget-object v8, v3, La/r1v;->m:Ljava/lang/Object;

    .line 574
    .line 575
    iget-object v9, v3, La/r1v;->l:La/kmq;

    .line 576
    .line 577
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    :cond_21
    move v12, v1

    .line 581
    move-wide v10, v4

    .line 582
    move-object v1, v9

    .line 583
    move-object v9, v8

    .line 584
    goto :goto_14

    .line 585
    :cond_22
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    move-object v9, v12

    .line 589
    check-cast v9, La/kmq;

    .line 590
    .line 591
    move-object v0, v1

    .line 592
    check-cast v0, La/j0g0;

    .line 593
    .line 594
    iget-object v8, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 595
    .line 596
    instance-of v0, v8, La/g0g0;

    .line 597
    .line 598
    if-nez v0, :cond_23

    .line 599
    .line 600
    move-object v0, v8

    .line 601
    check-cast v0, Ljava/util/List;

    .line 602
    .line 603
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 604
    .line 605
    .line 606
    move-result-wide v0

    .line 607
    iput-wide v0, v15, La/lie0;->a:J

    .line 608
    .line 609
    iput-boolean v11, v13, La/hie0;->a:Z

    .line 610
    .line 611
    :cond_23
    iget-wide v4, v15, La/lie0;->a:J

    .line 612
    .line 613
    iget-boolean v1, v13, La/hie0;->a:Z

    .line 614
    .line 615
    move-object v6, v14

    .line 616
    check-cast v6, La/a6u;

    .line 617
    .line 618
    iget-object v0, v6, La/a6u;->d:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v0, La/hnu;

    .line 621
    .line 622
    iput-object v9, v3, La/r1v;->l:La/kmq;

    .line 623
    .line 624
    iput-object v8, v3, La/r1v;->m:Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v6, v3, La/r1v;->n:La/a6u;

    .line 627
    .line 628
    iput-boolean v1, v3, La/r1v;->o:Z

    .line 629
    .line 630
    iput-wide v4, v3, La/r1v;->p:J

    .line 631
    .line 632
    iput v11, v3, La/r1v;->j:I

    .line 633
    .line 634
    invoke-virtual {v0, v11, v3}, La/hnu;->f(ZLa/zje;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    if-ne v0, v2, :cond_21

    .line 639
    .line 640
    goto :goto_15

    .line 641
    :goto_14
    check-cast v0, Ljava/util/List;

    .line 642
    .line 643
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    invoke-static {v0}, La/a6u;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 647
    .line 648
    .line 649
    move-result-object v13

    .line 650
    new-instance v8, La/b3g0;

    .line 651
    .line 652
    invoke-direct/range {v8 .. v13}, La/b3g0;-><init>(Ljava/lang/Object;JZLjava/util/List;)V

    .line 653
    .line 654
    .line 655
    const/4 v0, 0x0

    .line 656
    iput-object v0, v3, La/r1v;->l:La/kmq;

    .line 657
    .line 658
    iput-object v0, v3, La/r1v;->m:Ljava/lang/Object;

    .line 659
    .line 660
    iput-object v0, v3, La/r1v;->n:La/a6u;

    .line 661
    .line 662
    iput v7, v3, La/r1v;->j:I

    .line 663
    .line 664
    invoke-interface {v1, v8, v3}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    if-ne v0, v2, :cond_24

    .line 669
    .line 670
    :goto_15
    move-object v5, v2

    .line 671
    goto :goto_17

    .line 672
    :cond_24
    :goto_16
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 673
    .line 674
    :goto_17
    return-object v5

    .line 675
    :pswitch_3
    const/high16 v18, -0x80000000

    .line 676
    .line 677
    check-cast v13, La/hie0;

    .line 678
    .line 679
    check-cast v15, La/lie0;

    .line 680
    .line 681
    instance-of v3, v2, La/z0v;

    .line 682
    .line 683
    if-eqz v3, :cond_25

    .line 684
    .line 685
    move-object v3, v2

    .line 686
    check-cast v3, La/z0v;

    .line 687
    .line 688
    iget v4, v3, La/z0v;->j:I

    .line 689
    .line 690
    and-int v5, v4, v18

    .line 691
    .line 692
    if-eqz v5, :cond_25

    .line 693
    .line 694
    sub-int v4, v4, v18

    .line 695
    .line 696
    iput v4, v3, La/z0v;->j:I

    .line 697
    .line 698
    goto :goto_18

    .line 699
    :cond_25
    new-instance v3, La/z0v;

    .line 700
    .line 701
    invoke-direct {v3, v0, v2}, La/z0v;-><init>(La/y38;La/yje;)V

    .line 702
    .line 703
    .line 704
    :goto_18
    iget-object v0, v3, La/z0v;->i:Ljava/lang/Object;

    .line 705
    .line 706
    sget-object v2, La/wne;->a:La/wne;

    .line 707
    .line 708
    iget v4, v3, La/z0v;->j:I

    .line 709
    .line 710
    if-eqz v4, :cond_28

    .line 711
    .line 712
    if-eq v4, v11, :cond_27

    .line 713
    .line 714
    if-ne v4, v7, :cond_26

    .line 715
    .line 716
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    goto/16 :goto_1c

    .line 720
    .line 721
    :cond_26
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    const/4 v5, 0x0

    .line 725
    goto/16 :goto_1d

    .line 726
    .line 727
    :cond_27
    iget-wide v4, v3, La/z0v;->p:J

    .line 728
    .line 729
    iget-boolean v1, v3, La/z0v;->o:Z

    .line 730
    .line 731
    iget-object v6, v3, La/z0v;->n:La/f7u;

    .line 732
    .line 733
    iget-object v8, v3, La/z0v;->m:Ljava/lang/Object;

    .line 734
    .line 735
    iget-object v9, v3, La/z0v;->l:La/kmq;

    .line 736
    .line 737
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    move v12, v1

    .line 741
    move-object v1, v9

    .line 742
    move-object v9, v8

    .line 743
    :goto_19
    move-wide v10, v4

    .line 744
    goto :goto_1a

    .line 745
    :cond_28
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    move-object v9, v12

    .line 749
    check-cast v9, La/kmq;

    .line 750
    .line 751
    move-object v0, v1

    .line 752
    check-cast v0, La/j0g0;

    .line 753
    .line 754
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 755
    .line 756
    instance-of v1, v0, La/g0g0;

    .line 757
    .line 758
    if-nez v1, :cond_29

    .line 759
    .line 760
    move-object v1, v0

    .line 761
    check-cast v1, Ljava/util/List;

    .line 762
    .line 763
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 764
    .line 765
    .line 766
    move-result-wide v4

    .line 767
    iput-wide v4, v15, La/lie0;->a:J

    .line 768
    .line 769
    iput-boolean v11, v13, La/hie0;->a:Z

    .line 770
    .line 771
    :cond_29
    iget-wide v4, v15, La/lie0;->a:J

    .line 772
    .line 773
    iget-boolean v1, v13, La/hie0;->a:Z

    .line 774
    .line 775
    move-object v6, v14

    .line 776
    check-cast v6, La/f7u;

    .line 777
    .line 778
    iget-object v10, v6, La/f7u;->d:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v10, La/hnu;

    .line 781
    .line 782
    iput-object v9, v3, La/z0v;->l:La/kmq;

    .line 783
    .line 784
    iput-object v0, v3, La/z0v;->m:Ljava/lang/Object;

    .line 785
    .line 786
    iput-object v6, v3, La/z0v;->n:La/f7u;

    .line 787
    .line 788
    iput-boolean v1, v3, La/z0v;->o:Z

    .line 789
    .line 790
    iput-wide v4, v3, La/z0v;->p:J

    .line 791
    .line 792
    iput v11, v3, La/z0v;->j:I

    .line 793
    .line 794
    invoke-virtual {v10, v8, v3}, La/hnu;->f(ZLa/zje;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    if-ne v8, v2, :cond_2a

    .line 799
    .line 800
    goto :goto_1b

    .line 801
    :cond_2a
    move v12, v1

    .line 802
    move-object v1, v9

    .line 803
    move-object v9, v0

    .line 804
    move-object v0, v8

    .line 805
    goto :goto_19

    .line 806
    :goto_1a
    check-cast v0, Ljava/util/List;

    .line 807
    .line 808
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    invoke-static {v0}, La/f7u;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 812
    .line 813
    .line 814
    move-result-object v13

    .line 815
    new-instance v8, La/b3g0;

    .line 816
    .line 817
    invoke-direct/range {v8 .. v13}, La/b3g0;-><init>(Ljava/lang/Object;JZLjava/util/List;)V

    .line 818
    .line 819
    .line 820
    const/4 v0, 0x0

    .line 821
    iput-object v0, v3, La/z0v;->l:La/kmq;

    .line 822
    .line 823
    iput-object v0, v3, La/z0v;->m:Ljava/lang/Object;

    .line 824
    .line 825
    iput-object v0, v3, La/z0v;->n:La/f7u;

    .line 826
    .line 827
    iput v7, v3, La/z0v;->j:I

    .line 828
    .line 829
    invoke-interface {v1, v8, v3}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    if-ne v0, v2, :cond_2b

    .line 834
    .line 835
    :goto_1b
    move-object v5, v2

    .line 836
    goto :goto_1d

    .line 837
    :cond_2b
    :goto_1c
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 838
    .line 839
    :goto_1d
    return-object v5

    .line 840
    :pswitch_4
    const/high16 v18, -0x80000000

    .line 841
    .line 842
    check-cast v13, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 843
    .line 844
    instance-of v3, v2, La/uep;

    .line 845
    .line 846
    if-eqz v3, :cond_2c

    .line 847
    .line 848
    move-object v3, v2

    .line 849
    check-cast v3, La/uep;

    .line 850
    .line 851
    iget v4, v3, La/uep;->j:I

    .line 852
    .line 853
    and-int v5, v4, v18

    .line 854
    .line 855
    if-eqz v5, :cond_2c

    .line 856
    .line 857
    sub-int v4, v4, v18

    .line 858
    .line 859
    iput v4, v3, La/uep;->j:I

    .line 860
    .line 861
    goto :goto_1e

    .line 862
    :cond_2c
    new-instance v3, La/uep;

    .line 863
    .line 864
    invoke-direct {v3, v0, v2}, La/uep;-><init>(La/y38;La/yje;)V

    .line 865
    .line 866
    .line 867
    :goto_1e
    iget-object v0, v3, La/uep;->i:Ljava/lang/Object;

    .line 868
    .line 869
    sget-object v2, La/wne;->a:La/wne;

    .line 870
    .line 871
    iget v4, v3, La/uep;->j:I

    .line 872
    .line 873
    if-eqz v4, :cond_2e

    .line 874
    .line 875
    if-ne v4, v11, :cond_2d

    .line 876
    .line 877
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    goto/16 :goto_20

    .line 881
    .line 882
    :cond_2d
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    const/4 v5, 0x0

    .line 886
    goto/16 :goto_21

    .line 887
    .line 888
    :cond_2e
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    check-cast v12, La/kmq;

    .line 892
    .line 893
    move-object v0, v1

    .line 894
    check-cast v0, Ljava/util/List;

    .line 895
    .line 896
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    sget-object v4, La/f860;->a:La/f860;

    .line 901
    .line 902
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 903
    .line 904
    .line 905
    sget-object v4, La/cfe0;->a:La/cfe0;

    .line 906
    .line 907
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    new-instance v4, Ljava/util/ArrayList;

    .line 911
    .line 912
    const/16 v5, 0xa

    .line 913
    .line 914
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 915
    .line 916
    .line 917
    move-result v5

    .line 918
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 919
    .line 920
    .line 921
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 922
    .line 923
    .line 924
    move-result-object v5

    .line 925
    :goto_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 926
    .line 927
    .line 928
    move-result v6

    .line 929
    if-eqz v6, :cond_2f

    .line 930
    .line 931
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v6

    .line 935
    move-object/from16 v16, v6

    .line 936
    .line 937
    check-cast v16, La/d0t;

    .line 938
    .line 939
    iget-object v6, v13, Lorg/xplatform/favorites/impl/presentation/category/f;->h:La/ctf0;

    .line 940
    .line 941
    iget-object v7, v13, Lorg/xplatform/favorites/impl/presentation/category/f;->g:La/y78;

    .line 942
    .line 943
    iget-object v8, v13, Lorg/xplatform/favorites/impl/presentation/category/f;->i:La/lbu;

    .line 944
    .line 945
    invoke-virtual {v8}, La/lbu;->j()Z

    .line 946
    .line 947
    .line 948
    move-result v19

    .line 949
    iget-object v8, v13, Lorg/xplatform/favorites/impl/presentation/category/f;->s:La/n0o0;

    .line 950
    .line 951
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v8

    .line 955
    check-cast v8, La/sff0;

    .line 956
    .line 957
    iget-boolean v8, v8, La/sff0;->J:Z

    .line 958
    .line 959
    move-object/from16 v21, v14

    .line 960
    .line 961
    check-cast v21, La/wcb;

    .line 962
    .line 963
    move-object/from16 v22, v15

    .line 964
    .line 965
    check-cast v22, Ljava/util/List;

    .line 966
    .line 967
    move-object/from16 v17, v6

    .line 968
    .line 969
    move-object/from16 v18, v7

    .line 970
    .line 971
    move/from16 v20, v8

    .line 972
    .line 973
    invoke-static/range {v16 .. v22}, La/e0t;->a(La/d0t;La/ctf0;La/y78;ZZLa/wcb;Ljava/util/List;)La/b0s;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    goto :goto_1f

    .line 981
    :cond_2f
    invoke-virtual {v1, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 982
    .line 983
    .line 984
    iget-object v4, v13, Lorg/xplatform/favorites/impl/presentation/category/f;->f:La/l0s;

    .line 985
    .line 986
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    iput-object v0, v4, La/l0s;->y:Ljava/util/List;

    .line 990
    .line 991
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    iput v11, v3, La/uep;->j:I

    .line 996
    .line 997
    invoke-interface {v12, v0, v3}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    if-ne v0, v2, :cond_30

    .line 1002
    .line 1003
    move-object v5, v2

    .line 1004
    goto :goto_21

    .line 1005
    :cond_30
    :goto_20
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1006
    .line 1007
    :goto_21
    return-object v5

    .line 1008
    :pswitch_5
    move-object v0, v1

    .line 1009
    check-cast v0, La/nlx;

    .line 1010
    .line 1011
    check-cast v14, La/kie0;

    .line 1012
    .line 1013
    check-cast v13, La/kie0;

    .line 1014
    .line 1015
    check-cast v12, La/kie0;

    .line 1016
    .line 1017
    instance-of v1, v0, La/jub0;

    .line 1018
    .line 1019
    if-eqz v1, :cond_31

    .line 1020
    .line 1021
    iget v0, v12, La/kie0;->a:I

    .line 1022
    .line 1023
    add-int/2addr v0, v11

    .line 1024
    iput v0, v12, La/kie0;->a:I

    .line 1025
    .line 1026
    goto :goto_22

    .line 1027
    :cond_31
    instance-of v1, v0, La/kub0;

    .line 1028
    .line 1029
    if-eqz v1, :cond_32

    .line 1030
    .line 1031
    iget v0, v12, La/kie0;->a:I

    .line 1032
    .line 1033
    add-int/lit8 v0, v0, -0x1

    .line 1034
    .line 1035
    iput v0, v12, La/kie0;->a:I

    .line 1036
    .line 1037
    goto :goto_22

    .line 1038
    :cond_32
    instance-of v1, v0, La/iub0;

    .line 1039
    .line 1040
    if-eqz v1, :cond_33

    .line 1041
    .line 1042
    iget v0, v12, La/kie0;->a:I

    .line 1043
    .line 1044
    add-int/lit8 v0, v0, -0x1

    .line 1045
    .line 1046
    iput v0, v12, La/kie0;->a:I

    .line 1047
    .line 1048
    goto :goto_22

    .line 1049
    :cond_33
    instance-of v1, v0, La/rsw;

    .line 1050
    .line 1051
    if-eqz v1, :cond_34

    .line 1052
    .line 1053
    iget v0, v13, La/kie0;->a:I

    .line 1054
    .line 1055
    add-int/2addr v0, v11

    .line 1056
    iput v0, v13, La/kie0;->a:I

    .line 1057
    .line 1058
    goto :goto_22

    .line 1059
    :cond_34
    instance-of v1, v0, La/ssw;

    .line 1060
    .line 1061
    if-eqz v1, :cond_35

    .line 1062
    .line 1063
    iget v0, v13, La/kie0;->a:I

    .line 1064
    .line 1065
    add-int/lit8 v0, v0, -0x1

    .line 1066
    .line 1067
    iput v0, v13, La/kie0;->a:I

    .line 1068
    .line 1069
    goto :goto_22

    .line 1070
    :cond_35
    instance-of v1, v0, La/qpq;

    .line 1071
    .line 1072
    if-eqz v1, :cond_36

    .line 1073
    .line 1074
    iget v0, v14, La/kie0;->a:I

    .line 1075
    .line 1076
    add-int/2addr v0, v11

    .line 1077
    iput v0, v14, La/kie0;->a:I

    .line 1078
    .line 1079
    goto :goto_22

    .line 1080
    :cond_36
    instance-of v0, v0, La/rpq;

    .line 1081
    .line 1082
    if-eqz v0, :cond_37

    .line 1083
    .line 1084
    iget v0, v14, La/kie0;->a:I

    .line 1085
    .line 1086
    add-int/lit8 v0, v0, -0x1

    .line 1087
    .line 1088
    iput v0, v14, La/kie0;->a:I

    .line 1089
    .line 1090
    :cond_37
    :goto_22
    iget v0, v12, La/kie0;->a:I

    .line 1091
    .line 1092
    if-lez v0, :cond_38

    .line 1093
    .line 1094
    move v0, v11

    .line 1095
    goto :goto_23

    .line 1096
    :cond_38
    move v0, v8

    .line 1097
    :goto_23
    iget v1, v13, La/kie0;->a:I

    .line 1098
    .line 1099
    if-lez v1, :cond_39

    .line 1100
    .line 1101
    move v1, v11

    .line 1102
    goto :goto_24

    .line 1103
    :cond_39
    move v1, v8

    .line 1104
    :goto_24
    iget v2, v14, La/kie0;->a:I

    .line 1105
    .line 1106
    if-lez v2, :cond_3a

    .line 1107
    .line 1108
    move v2, v11

    .line 1109
    goto :goto_25

    .line 1110
    :cond_3a
    move v2, v8

    .line 1111
    :goto_25
    check-cast v15, La/otj;

    .line 1112
    .line 1113
    iget-boolean v3, v15, La/otj;->p:Z

    .line 1114
    .line 1115
    if-eq v3, v0, :cond_3b

    .line 1116
    .line 1117
    iput-boolean v0, v15, La/otj;->p:Z

    .line 1118
    .line 1119
    move v8, v11

    .line 1120
    :cond_3b
    iget-boolean v0, v15, La/otj;->q:Z

    .line 1121
    .line 1122
    if-eq v0, v1, :cond_3c

    .line 1123
    .line 1124
    iput-boolean v1, v15, La/otj;->q:Z

    .line 1125
    .line 1126
    move v8, v11

    .line 1127
    :cond_3c
    iget-boolean v0, v15, La/otj;->r:Z

    .line 1128
    .line 1129
    if-eq v0, v2, :cond_3d

    .line 1130
    .line 1131
    iput-boolean v2, v15, La/otj;->r:Z

    .line 1132
    .line 1133
    goto :goto_26

    .line 1134
    :cond_3d
    move v11, v8

    .line 1135
    :goto_26
    if-eqz v11, :cond_3e

    .line 1136
    .line 1137
    invoke-static {v15}, La/vfc;->J(La/ehl;)V

    .line 1138
    .line 1139
    .line 1140
    :cond_3e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1141
    .line 1142
    return-object v0

    .line 1143
    :pswitch_6
    move-object v0, v1

    .line 1144
    check-cast v0, Ljava/lang/Boolean;

    .line 1145
    .line 1146
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1147
    .line 1148
    .line 1149
    move-result v0

    .line 1150
    check-cast v14, La/k7q0;

    .line 1151
    .line 1152
    check-cast v12, La/djz;

    .line 1153
    .line 1154
    if-eqz v0, :cond_3f

    .line 1155
    .line 1156
    invoke-virtual {v12}, La/djz;->b()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v0

    .line 1160
    if-eqz v0, :cond_3f

    .line 1161
    .line 1162
    check-cast v13, La/o8q0;

    .line 1163
    .line 1164
    invoke-virtual {v14}, La/k7q0;->l()La/a8q0;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    check-cast v15, La/k3x;

    .line 1169
    .line 1170
    iget-object v1, v14, La/k7q0;->b:La/qe60;

    .line 1171
    .line 1172
    invoke-static {v13, v12, v0, v15, v1}, La/dyb;->l0(La/o8q0;La/djz;La/a8q0;La/k3x;La/qe60;)V

    .line 1173
    .line 1174
    .line 1175
    goto :goto_27

    .line 1176
    :cond_3f
    invoke-static {v12}, La/dyb;->R(La/djz;)V

    .line 1177
    .line 1178
    .line 1179
    :goto_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1180
    .line 1181
    return-object v0

    .line 1182
    :pswitch_7
    const/high16 v18, -0x80000000

    .line 1183
    .line 1184
    check-cast v13, La/h03;

    .line 1185
    .line 1186
    instance-of v3, v2, La/c2c;

    .line 1187
    .line 1188
    if-eqz v3, :cond_40

    .line 1189
    .line 1190
    move-object v3, v2

    .line 1191
    check-cast v3, La/c2c;

    .line 1192
    .line 1193
    iget v4, v3, La/c2c;->j:I

    .line 1194
    .line 1195
    and-int v5, v4, v18

    .line 1196
    .line 1197
    if-eqz v5, :cond_40

    .line 1198
    .line 1199
    sub-int v4, v4, v18

    .line 1200
    .line 1201
    iput v4, v3, La/c2c;->j:I

    .line 1202
    .line 1203
    goto :goto_28

    .line 1204
    :cond_40
    new-instance v3, La/c2c;

    .line 1205
    .line 1206
    invoke-direct {v3, v0, v2}, La/c2c;-><init>(La/y38;La/yje;)V

    .line 1207
    .line 1208
    .line 1209
    :goto_28
    iget-object v0, v3, La/c2c;->i:Ljava/lang/Object;

    .line 1210
    .line 1211
    sget-object v2, La/wne;->a:La/wne;

    .line 1212
    .line 1213
    iget v4, v3, La/c2c;->j:I

    .line 1214
    .line 1215
    if-eqz v4, :cond_42

    .line 1216
    .line 1217
    if-ne v4, v11, :cond_41

    .line 1218
    .line 1219
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    goto :goto_29

    .line 1223
    :cond_41
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    const/4 v5, 0x0

    .line 1227
    goto :goto_2a

    .line 1228
    :cond_42
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1229
    .line 1230
    .line 1231
    check-cast v12, La/kmq;

    .line 1232
    .line 1233
    move-object v0, v1

    .line 1234
    check-cast v0, Ljava/util/List;

    .line 1235
    .line 1236
    sget-object v1, La/w3q;->a:La/w3q;

    .line 1237
    .line 1238
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1239
    .line 1240
    .line 1241
    invoke-static {v0, v1}, La/h03;->y(Ljava/util/List;La/w3q;)Ljava/util/List;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v1

    .line 1245
    check-cast v14, Ljava/util/List;

    .line 1246
    .line 1247
    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v1

    .line 1251
    if-eqz v1, :cond_43

    .line 1252
    .line 1253
    sget-object v1, La/w3q;->b:La/w3q;

    .line 1254
    .line 1255
    invoke-static {v0, v1}, La/h03;->y(Ljava/util/List;La/w3q;)Ljava/util/List;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    check-cast v15, Ljava/util/List;

    .line 1260
    .line 1261
    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v0

    .line 1265
    if-nez v0, :cond_44

    .line 1266
    .line 1267
    :cond_43
    move v8, v11

    .line 1268
    :cond_44
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    iput v11, v3, La/c2c;->j:I

    .line 1273
    .line 1274
    invoke-interface {v12, v0, v3}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    if-ne v0, v2, :cond_45

    .line 1279
    .line 1280
    move-object v5, v2

    .line 1281
    goto :goto_2a

    .line 1282
    :cond_45
    :goto_29
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1283
    .line 1284
    :goto_2a
    return-object v5

    .line 1285
    :pswitch_8
    const/high16 v18, -0x80000000

    .line 1286
    .line 1287
    check-cast v13, La/mie0;

    .line 1288
    .line 1289
    instance-of v3, v2, La/ttb;

    .line 1290
    .line 1291
    if-eqz v3, :cond_46

    .line 1292
    .line 1293
    move-object v3, v2

    .line 1294
    check-cast v3, La/ttb;

    .line 1295
    .line 1296
    iget v4, v3, La/ttb;->l:I

    .line 1297
    .line 1298
    and-int v5, v4, v18

    .line 1299
    .line 1300
    if-eqz v5, :cond_46

    .line 1301
    .line 1302
    sub-int v4, v4, v18

    .line 1303
    .line 1304
    iput v4, v3, La/ttb;->l:I

    .line 1305
    .line 1306
    goto :goto_2b

    .line 1307
    :cond_46
    new-instance v3, La/ttb;

    .line 1308
    .line 1309
    invoke-direct {v3, v0, v2}, La/ttb;-><init>(La/y38;La/yje;)V

    .line 1310
    .line 1311
    .line 1312
    :goto_2b
    iget-object v0, v3, La/ttb;->j:Ljava/lang/Object;

    .line 1313
    .line 1314
    sget-object v2, La/wne;->a:La/wne;

    .line 1315
    .line 1316
    iget v4, v3, La/ttb;->l:I

    .line 1317
    .line 1318
    if-eqz v4, :cond_48

    .line 1319
    .line 1320
    if-ne v4, v11, :cond_47

    .line 1321
    .line 1322
    iget-object v1, v3, La/ttb;->i:Ljava/lang/Object;

    .line 1323
    .line 1324
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1325
    .line 1326
    .line 1327
    goto :goto_2c

    .line 1328
    :cond_47
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    const/4 v5, 0x0

    .line 1332
    goto :goto_2d

    .line 1333
    :cond_48
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1334
    .line 1335
    .line 1336
    iget-object v0, v13, La/mie0;->a:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v0, La/bby;

    .line 1339
    .line 1340
    if-eqz v0, :cond_49

    .line 1341
    .line 1342
    new-instance v4, La/dac;

    .line 1343
    .line 1344
    const-string v5, "Child of the scoped flow was cancelled"

    .line 1345
    .line 1346
    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1347
    .line 1348
    .line 1349
    invoke-interface {v0, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1350
    .line 1351
    .line 1352
    iput-object v1, v3, La/ttb;->i:Ljava/lang/Object;

    .line 1353
    .line 1354
    iput v11, v3, La/ttb;->l:I

    .line 1355
    .line 1356
    invoke-interface {v0, v3}, La/bby;->join(La/yje;)Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    if-ne v0, v2, :cond_49

    .line 1361
    .line 1362
    move-object v5, v2

    .line 1363
    goto :goto_2d

    .line 1364
    :cond_49
    :goto_2c
    check-cast v14, La/vne;

    .line 1365
    .line 1366
    sget-object v0, La/yne;->d:La/yne;

    .line 1367
    .line 1368
    new-instance v2, La/stb;

    .line 1369
    .line 1370
    check-cast v15, La/utb;

    .line 1371
    .line 1372
    check-cast v12, La/kmq;

    .line 1373
    .line 1374
    const/4 v3, 0x0

    .line 1375
    invoke-direct {v2, v15, v12, v1, v3}, La/stb;-><init>(La/utb;La/kmq;Ljava/lang/Object;La/yje;)V

    .line 1376
    .line 1377
    .line 1378
    invoke-static {v14, v3, v0, v2, v11}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    iput-object v0, v13, La/mie0;->a:Ljava/lang/Object;

    .line 1383
    .line 1384
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1385
    .line 1386
    :goto_2d
    return-object v5

    .line 1387
    :pswitch_9
    check-cast v1, La/gmq;

    .line 1388
    .line 1389
    invoke-virtual {v0, v1, v2}, La/y38;->b(La/gmq;La/yje;)Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    return-object v0

    .line 1394
    :pswitch_a
    const/4 v3, 0x0

    .line 1395
    check-cast v15, La/lie0;

    .line 1396
    .line 1397
    check-cast v14, Ljava/lang/String;

    .line 1398
    .line 1399
    check-cast v13, La/d48;

    .line 1400
    .line 1401
    check-cast v12, La/kmq;

    .line 1402
    .line 1403
    move-object v0, v1

    .line 1404
    check-cast v0, La/e7a;

    .line 1405
    .line 1406
    if-eqz v0, :cond_4e

    .line 1407
    .line 1408
    instance-of v1, v0, La/d7a;

    .line 1409
    .line 1410
    if-eqz v1, :cond_4b

    .line 1411
    .line 1412
    iget-object v1, v13, La/d48;->q:La/zg;

    .line 1413
    .line 1414
    invoke-virtual {v1, v14}, La/zg;->e(Ljava/lang/String;)V

    .line 1415
    .line 1416
    .line 1417
    iget-object v1, v13, La/d48;->A:La/au0;

    .line 1418
    .line 1419
    invoke-virtual {v1, v14}, La/au0;->h(Ljava/lang/String;)V

    .line 1420
    .line 1421
    .line 1422
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1423
    .line 1424
    .line 1425
    move-result-wide v1

    .line 1426
    iput-wide v1, v15, La/lie0;->a:J

    .line 1427
    .line 1428
    iget-object v1, v13, La/d48;->B:La/p7m0;

    .line 1429
    .line 1430
    :cond_4a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    move-object v3, v2

    .line 1435
    check-cast v3, La/v38;

    .line 1436
    .line 1437
    const/4 v8, 0x0

    .line 1438
    const/16 v9, 0xfb

    .line 1439
    .line 1440
    const/4 v4, 0x0

    .line 1441
    const/4 v5, 0x0

    .line 1442
    const/4 v6, 0x1

    .line 1443
    const/4 v7, 0x0

    .line 1444
    invoke-static/range {v3 .. v9}, La/v38;->a(La/v38;La/kbn;Ljava/lang/String;ZZLandroid/text/SpannableStringBuilder;I)La/v38;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v3

    .line 1448
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v2

    .line 1452
    if-eqz v2, :cond_4a

    .line 1453
    .line 1454
    iget-object v1, v13, La/d48;->C:La/ol60;

    .line 1455
    .line 1456
    new-instance v2, La/o38;

    .line 1457
    .line 1458
    check-cast v0, La/d7a;

    .line 1459
    .line 1460
    invoke-virtual {v13}, La/d48;->y()Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    invoke-direct {v2, v0, v3}, La/o38;-><init>(La/d7a;Ljava/lang/String;)V

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1468
    .line 1469
    .line 1470
    goto :goto_2e

    .line 1471
    :cond_4b
    instance-of v1, v0, La/c7a;

    .line 1472
    .line 1473
    if-eqz v1, :cond_4e

    .line 1474
    .line 1475
    iget-wide v3, v15, La/lie0;->a:J

    .line 1476
    .line 1477
    cmp-long v1, v3, v16

    .line 1478
    .line 1479
    if-lez v1, :cond_4c

    .line 1480
    .line 1481
    iget-object v1, v13, La/d48;->q:La/zg;

    .line 1482
    .line 1483
    invoke-virtual {v1, v14}, La/zg;->d(Ljava/lang/String;)V

    .line 1484
    .line 1485
    .line 1486
    iget-object v1, v13, La/d48;->A:La/au0;

    .line 1487
    .line 1488
    invoke-virtual {v1, v14}, La/au0;->g(Ljava/lang/String;)V

    .line 1489
    .line 1490
    .line 1491
    :cond_4c
    check-cast v0, La/c7a;

    .line 1492
    .line 1493
    iget-object v0, v0, La/c7a;->a:La/ynb0;

    .line 1494
    .line 1495
    invoke-interface {v12, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v5

    .line 1499
    sget-object v0, La/wne;->a:La/wne;

    .line 1500
    .line 1501
    if-ne v5, v0, :cond_4d

    .line 1502
    .line 1503
    goto :goto_2f

    .line 1504
    :cond_4d
    :goto_2e
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1505
    .line 1506
    goto :goto_2f

    .line 1507
    :cond_4e
    invoke-static {}, La/t9f;->b()V

    .line 1508
    .line 1509
    .line 1510
    move-object v5, v3

    .line 1511
    :goto_2f
    return-object v5

    .line 1512
    nop

    .line 1513
    :pswitch_data_0
    .packed-switch 0x0
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

.method public b(La/gmq;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/y38;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, v0

    .line 4
    check-cast v4, La/gbi0;

    .line 5
    .line 6
    instance-of v0, p2, La/otb;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/otb;

    .line 12
    .line 13
    iget v1, v0, La/otb;->l:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, La/otb;->l:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, La/otb;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, La/otb;-><init>(La/y38;La/yje;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, La/otb;->j:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, La/wne;->a:La/wne;

    .line 33
    .line 34
    iget v2, v0, La/otb;->l:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget-object p1, v0, La/otb;->i:La/gmq;

    .line 42
    .line 43
    check-cast p1, La/gmq;

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v2, p1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, La/y38;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, La/bby;

    .line 63
    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    invoke-interface {p2}, La/bby;->isActive()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-interface {p2}, La/bby;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    throw p0

    .line 78
    :cond_5
    :goto_1
    move-object p2, p1

    .line 79
    check-cast p2, La/gmq;

    .line 80
    .line 81
    iput-object p2, v0, La/otb;->i:La/gmq;

    .line 82
    .line 83
    iput v3, v0, La/otb;->l:I

    .line 84
    .line 85
    invoke-virtual {v4, v0}, La/fbi0;->b(La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-ne p2, v1, :cond_1

    .line 90
    .line 91
    return-object v1

    .line 92
    :goto_2
    iget-object p1, p0, La/y38;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, La/hzb0;

    .line 95
    .line 96
    new-instance v1, La/yxa;

    .line 97
    .line 98
    iget-object p0, p0, La/y38;->e:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v3, p0

    .line 101
    check-cast v3, La/mfi0;

    .line 102
    .line 103
    const/16 v6, 0x1c

    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    invoke-direct/range {v1 .. v6}, La/yxa;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 107
    .line 108
    .line 109
    const/4 p0, 0x3

    .line 110
    invoke-static {p1, v5, v5, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0
.end method

.method public c([ILa/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/y38;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [Ljava/lang/String;

    .line 10
    .line 11
    iget-object v4, v0, La/y38;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, La/kmq;

    .line 14
    .line 15
    instance-of v5, v2, La/yqs0;

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    move-object v5, v2

    .line 20
    check-cast v5, La/yqs0;

    .line 21
    .line 22
    iget v6, v5, La/yqs0;->m:I

    .line 23
    .line 24
    const/high16 v7, -0x80000000

    .line 25
    .line 26
    and-int v8, v6, v7

    .line 27
    .line 28
    if-eqz v8, :cond_0

    .line 29
    .line 30
    sub-int/2addr v6, v7

    .line 31
    iput v6, v5, La/yqs0;->m:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v5, La/yqs0;

    .line 35
    .line 36
    invoke-direct {v5, v0, v2}, La/yqs0;-><init>(La/y38;La/yje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v2, v5, La/yqs0;->k:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v6, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v7, v5, La/yqs0;->m:I

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x2

    .line 47
    const/4 v10, 0x1

    .line 48
    if-eqz v7, :cond_3

    .line 49
    .line 50
    if-eq v7, v10, :cond_2

    .line 51
    .line 52
    if-ne v7, v9, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v8

    .line 61
    :cond_2
    :goto_1
    iget-object v0, v5, La/yqs0;->j:[I

    .line 62
    .line 63
    iget-object v1, v5, La/yqs0;->i:La/y38;

    .line 64
    .line 65
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object/from16 v16, v1

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    move-object/from16 v0, v16

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v0, La/y38;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, La/mie0;

    .line 80
    .line 81
    iget-object v7, v2, La/mie0;->a:Ljava/lang/Object;

    .line 82
    .line 83
    if-nez v7, :cond_4

    .line 84
    .line 85
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput-object v0, v5, La/yqs0;->i:La/y38;

    .line 90
    .line 91
    iput-object v1, v5, La/yqs0;->j:[I

    .line 92
    .line 93
    iput v10, v5, La/yqs0;->m:I

    .line 94
    .line 95
    invoke-interface {v4, v2, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-ne v2, v6, :cond_8

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    iget-object v7, v0, La/y38;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v7, [I

    .line 105
    .line 106
    new-instance v10, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    array-length v11, v3

    .line 112
    const/4 v12, 0x0

    .line 113
    move v13, v12

    .line 114
    :goto_2
    if-ge v12, v11, :cond_7

    .line 115
    .line 116
    aget-object v14, v3, v12

    .line 117
    .line 118
    add-int/lit8 v15, v13, 0x1

    .line 119
    .line 120
    move-object/from16 p2, v8

    .line 121
    .line 122
    iget-object v8, v2, La/mie0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    if-eqz v8, :cond_6

    .line 125
    .line 126
    check-cast v8, [I

    .line 127
    .line 128
    aget v13, v7, v13

    .line 129
    .line 130
    aget v8, v8, v13

    .line 131
    .line 132
    aget v13, v1, v13

    .line 133
    .line 134
    if-eq v8, v13, :cond_5

    .line 135
    .line 136
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 140
    .line 141
    move-object/from16 v8, p2

    .line 142
    .line 143
    move v13, v15

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    const-string v0, "Required value was null."

    .line 146
    .line 147
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object p2

    .line 151
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iput-object v0, v5, La/yqs0;->i:La/y38;

    .line 162
    .line 163
    iput-object v1, v5, La/yqs0;->j:[I

    .line 164
    .line 165
    iput v9, v5, La/yqs0;->m:I

    .line 166
    .line 167
    invoke-interface {v4, v2, v5}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-ne v2, v6, :cond_8

    .line 172
    .line 173
    :goto_3
    return-object v6

    .line 174
    :cond_8
    :goto_4
    iget-object v0, v0, La/y38;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, La/mie0;

    .line 177
    .line 178
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 179
    .line 180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object v0
.end method
