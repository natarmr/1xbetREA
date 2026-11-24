.class public final synthetic La/fd20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/fd20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/fd20;->a:B

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    check-cast v7, La/a820;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 29
    .line 30
    iget-object v0, v8, La/pvj0;->a:La/bx6;

    .line 31
    .line 32
    iget-object v9, v0, La/bx6;->b:La/tw6;

    .line 33
    .line 34
    iget-boolean v2, v0, La/bx6;->c:Z

    .line 35
    .line 36
    xor-int/lit8 v28, v2, 0x1

    .line 37
    .line 38
    const/16 v29, 0x0

    .line 39
    .line 40
    const v30, 0xbfff

    .line 41
    .line 42
    .line 43
    const-wide/16 v10, 0x0

    .line 44
    .line 45
    const-wide/16 v12, 0x0

    .line 46
    .line 47
    const-wide/16 v14, 0x0

    .line 48
    .line 49
    const-wide/16 v16, 0x0

    .line 50
    .line 51
    const-wide/16 v18, 0x0

    .line 52
    .line 53
    const/16 v20, 0x0

    .line 54
    .line 55
    const/16 v21, 0x0

    .line 56
    .line 57
    const/16 v22, 0x0

    .line 58
    .line 59
    const/16 v23, 0x0

    .line 60
    .line 61
    const/16 v24, 0x0

    .line 62
    .line 63
    const/16 v25, 0x0

    .line 64
    .line 65
    const/16 v26, 0x0

    .line 66
    .line 67
    const/16 v27, 0x0

    .line 68
    .line 69
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v0, v6, v2, v4, v1}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    const/4 v14, 0x0

    .line 78
    const/16 v15, 0x3e

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    iget-object v12, v7, La/a820;->g:La/hx4;

    .line 89
    .line 90
    iget-object v0, v12, La/hx4;->c:La/bx6;

    .line 91
    .line 92
    iget-object v13, v0, La/bx6;->b:La/tw6;

    .line 93
    .line 94
    iget-boolean v2, v0, La/bx6;->c:Z

    .line 95
    .line 96
    xor-int/lit8 v32, v2, 0x1

    .line 97
    .line 98
    const/16 v33, 0x0

    .line 99
    .line 100
    const v34, 0xbfff

    .line 101
    .line 102
    .line 103
    const-wide/16 v14, 0x0

    .line 104
    .line 105
    const-wide/16 v20, 0x0

    .line 106
    .line 107
    const-wide/16 v22, 0x0

    .line 108
    .line 109
    const/16 v24, 0x0

    .line 110
    .line 111
    const/16 v27, 0x0

    .line 112
    .line 113
    const/16 v28, 0x0

    .line 114
    .line 115
    const/16 v30, 0x0

    .line 116
    .line 117
    const/16 v31, 0x0

    .line 118
    .line 119
    invoke-static/range {v13 .. v34}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v0, v6, v2, v4, v1}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v19, 0x3b

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    invoke-static/range {v12 .. v19}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    const/16 v23, 0x0

    .line 142
    .line 143
    const v24, 0x3ffaf

    .line 144
    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v12, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const/16 v19, 0x0

    .line 153
    .line 154
    const/16 v20, 0x0

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const/16 v22, 0x0

    .line 159
    .line 160
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :pswitch_0
    move-object/from16 v0, p1

    .line 166
    .line 167
    check-cast v0, La/oyg0;

    .line 168
    .line 169
    move-object/from16 v7, p2

    .line 170
    .line 171
    check-cast v7, La/a820;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v8, v7, La/a820;->f:La/dzc0;

    .line 180
    .line 181
    iget-object v0, v8, La/dzc0;->a:La/syc0;

    .line 182
    .line 183
    invoke-static {v6}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    const/16 v2, 0x2e

    .line 188
    .line 189
    invoke-static {v0, v1, v4, v4, v2}, La/syc0;->a(La/syc0;La/pz40;ZZI)La/syc0;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    iget-object v0, v8, La/dzc0;->c:La/olc0;

    .line 194
    .line 195
    invoke-static {v0}, La/olc0;->a(La/olc0;)La/olc0;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    const/4 v13, 0x0

    .line 200
    const/16 v14, 0x2a

    .line 201
    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    invoke-static/range {v8 .. v14}, La/dzc0;->a(La/dzc0;La/syc0;La/olc0;ZZZI)La/dzc0;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    const v24, 0x3ffdf

    .line 211
    .line 212
    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v15, 0x0

    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    const/16 v18, 0x0

    .line 225
    .line 226
    const/16 v19, 0x0

    .line 227
    .line 228
    const/16 v20, 0x0

    .line 229
    .line 230
    const/16 v21, 0x0

    .line 231
    .line 232
    const/16 v22, 0x0

    .line 233
    .line 234
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    return-object v0

    .line 239
    :pswitch_1
    move-object/from16 v0, p1

    .line 240
    .line 241
    check-cast v0, La/oyg0;

    .line 242
    .line 243
    move-object/from16 v4, p2

    .line 244
    .line 245
    check-cast v4, La/a820;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    iget-object v0, v4, La/a820;->h:La/vtb0;

    .line 254
    .line 255
    if-eqz v0, :cond_0

    .line 256
    .line 257
    const/16 v1, 0xf7

    .line 258
    .line 259
    invoke-static {v0, v2, v3, v1}, La/vtb0;->a(La/vtb0;DI)La/vtb0;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    move-object v11, v0

    .line 264
    goto :goto_0

    .line 265
    :cond_0
    iget-object v0, v4, La/a820;->e:La/pvj0;

    .line 266
    .line 267
    iget-object v0, v0, La/pvj0;->a:La/bx6;

    .line 268
    .line 269
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 270
    .line 271
    iget-wide v1, v0, La/tw6;->a:D

    .line 272
    .line 273
    invoke-virtual {v0}, La/tw6;->c()D

    .line 274
    .line 275
    .line 276
    move-result-wide v5

    .line 277
    mul-double v8, v5, v1

    .line 278
    .line 279
    sget-object v15, La/g920;->e:La/g920;

    .line 280
    .line 281
    new-instance v7, La/vtb0;

    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const/16 v16, 0x0

    .line 285
    .line 286
    const/4 v10, 0x0

    .line 287
    const/4 v11, 0x0

    .line 288
    const/4 v12, 0x1

    .line 289
    const/4 v13, 0x0

    .line 290
    invoke-direct/range {v7 .. v16}, La/vtb0;-><init>(DZZZLjava/lang/String;La/ex4;La/g920;Z)V

    .line 291
    .line 292
    .line 293
    move-object v11, v7

    .line 294
    :goto_0
    const/16 v20, 0x0

    .line 295
    .line 296
    const v21, 0x3ff7f

    .line 297
    .line 298
    .line 299
    const/4 v5, 0x0

    .line 300
    const/4 v6, 0x0

    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v8, 0x0

    .line 303
    const/4 v9, 0x0

    .line 304
    const/4 v10, 0x0

    .line 305
    const/4 v12, 0x0

    .line 306
    const/4 v13, 0x0

    .line 307
    const/4 v14, 0x0

    .line 308
    const/4 v15, 0x0

    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    const/16 v17, 0x0

    .line 312
    .line 313
    const/16 v18, 0x0

    .line 314
    .line 315
    const/16 v19, 0x0

    .line 316
    .line 317
    invoke-static/range {v4 .. v21}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    return-object v0

    .line 322
    :pswitch_2
    move-object/from16 v0, p1

    .line 323
    .line 324
    check-cast v0, La/oyg0;

    .line 325
    .line 326
    move-object/from16 v7, p2

    .line 327
    .line 328
    check-cast v7, La/b820;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    iget-object v0, v7, La/b820;->e:La/czc0;

    .line 337
    .line 338
    if-eqz v0, :cond_1

    .line 339
    .line 340
    iget-object v0, v0, La/czc0;->a:La/tyc0;

    .line 341
    .line 342
    iget-object v0, v0, La/tyc0;->a:La/pz40;

    .line 343
    .line 344
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    move-object v6, v0

    .line 349
    check-cast v6, Ljava/lang/String;

    .line 350
    .line 351
    :cond_1
    move-object v14, v6

    .line 352
    new-instance v8, La/wtb0;

    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    const/4 v15, 0x0

    .line 356
    const-wide/16 v9, 0x0

    .line 357
    .line 358
    const/4 v11, 0x0

    .line 359
    const/4 v12, 0x0

    .line 360
    invoke-direct/range {v8 .. v15}, La/wtb0;-><init>(DZZZLjava/lang/String;La/ex4;)V

    .line 361
    .line 362
    .line 363
    move-object v14, v8

    .line 364
    const/16 v19, 0x0

    .line 365
    .line 366
    const/16 v20, 0x1fbf

    .line 367
    .line 368
    const/4 v8, 0x0

    .line 369
    const/4 v9, 0x0

    .line 370
    const/4 v10, 0x0

    .line 371
    const/4 v11, 0x0

    .line 372
    const/4 v12, 0x0

    .line 373
    const/4 v13, 0x0

    .line 374
    const/4 v15, 0x0

    .line 375
    const/16 v16, 0x0

    .line 376
    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    const/16 v18, 0x0

    .line 380
    .line 381
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    return-object v0

    .line 386
    :pswitch_3
    move-object/from16 v0, p1

    .line 387
    .line 388
    check-cast v0, La/oyg0;

    .line 389
    .line 390
    move-object/from16 v7, p2

    .line 391
    .line 392
    check-cast v7, La/a820;

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 401
    .line 402
    iget-object v0, v8, La/pvj0;->b:La/knb0;

    .line 403
    .line 404
    const/4 v1, 0x6

    .line 405
    invoke-static {v0, v4, v6, v1}, La/knb0;->b(La/knb0;ZLjava/lang/String;I)La/knb0;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    const/4 v14, 0x0

    .line 410
    const/16 v15, 0x3d

    .line 411
    .line 412
    const/4 v9, 0x0

    .line 413
    const/4 v11, 0x0

    .line 414
    const/4 v12, 0x0

    .line 415
    const/4 v13, 0x0

    .line 416
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 417
    .line 418
    .line 419
    move-result-object v11

    .line 420
    iget-object v12, v7, La/a820;->g:La/hx4;

    .line 421
    .line 422
    iget-object v0, v12, La/hx4;->e:La/knb0;

    .line 423
    .line 424
    invoke-static {v0, v4, v6, v1}, La/knb0;->b(La/knb0;ZLjava/lang/String;I)La/knb0;

    .line 425
    .line 426
    .line 427
    move-result-object v17

    .line 428
    const/16 v18, 0x0

    .line 429
    .line 430
    const/16 v19, 0x2f

    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const/4 v15, 0x0

    .line 434
    const/16 v16, 0x0

    .line 435
    .line 436
    invoke-static/range {v12 .. v19}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 437
    .line 438
    .line 439
    move-result-object v13

    .line 440
    const/16 v23, 0x0

    .line 441
    .line 442
    const v24, 0x3ffaf

    .line 443
    .line 444
    .line 445
    const/4 v8, 0x0

    .line 446
    const/4 v10, 0x0

    .line 447
    const/4 v12, 0x0

    .line 448
    const/4 v15, 0x0

    .line 449
    const/16 v17, 0x0

    .line 450
    .line 451
    const/16 v19, 0x0

    .line 452
    .line 453
    const/16 v20, 0x0

    .line 454
    .line 455
    const/16 v21, 0x0

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    return-object v0

    .line 464
    :pswitch_4
    move-object/from16 v0, p1

    .line 465
    .line 466
    check-cast v0, La/oyg0;

    .line 467
    .line 468
    move-object/from16 v7, p2

    .line 469
    .line 470
    check-cast v7, La/b820;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v8, v7, La/b820;->f:La/gx4;

    .line 479
    .line 480
    if-eqz v8, :cond_2

    .line 481
    .line 482
    iget-object v0, v8, La/gx4;->c:La/dx6;

    .line 483
    .line 484
    iget-object v9, v0, La/dx6;->b:La/vw6;

    .line 485
    .line 486
    const/16 v27, 0x0

    .line 487
    .line 488
    const v28, 0xbfff

    .line 489
    .line 490
    .line 491
    const-wide/16 v10, 0x0

    .line 492
    .line 493
    const-wide/16 v12, 0x0

    .line 494
    .line 495
    const-wide/16 v14, 0x0

    .line 496
    .line 497
    const-wide/16 v16, 0x0

    .line 498
    .line 499
    const-wide/16 v18, 0x0

    .line 500
    .line 501
    const/16 v20, 0x0

    .line 502
    .line 503
    const/16 v21, 0x0

    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const/16 v23, 0x0

    .line 508
    .line 509
    const/16 v24, 0x0

    .line 510
    .line 511
    const/16 v25, 0x0

    .line 512
    .line 513
    const/16 v26, 0x0

    .line 514
    .line 515
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-static {v0, v6, v1, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 520
    .line 521
    .line 522
    move-result-object v11

    .line 523
    const/4 v13, 0x0

    .line 524
    const/16 v14, 0x1b

    .line 525
    .line 526
    const/4 v9, 0x0

    .line 527
    const/4 v10, 0x0

    .line 528
    const/4 v12, 0x0

    .line 529
    invoke-static/range {v8 .. v14}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    :cond_2
    move-object v13, v6

    .line 534
    const/16 v19, 0x0

    .line 535
    .line 536
    const/16 v20, 0x1fdf

    .line 537
    .line 538
    const/4 v8, 0x0

    .line 539
    const/4 v9, 0x0

    .line 540
    const/4 v10, 0x0

    .line 541
    const/4 v11, 0x0

    .line 542
    const/4 v12, 0x0

    .line 543
    const/4 v14, 0x0

    .line 544
    const/4 v15, 0x0

    .line 545
    const/16 v16, 0x0

    .line 546
    .line 547
    const/16 v17, 0x0

    .line 548
    .line 549
    const/16 v18, 0x0

    .line 550
    .line 551
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    return-object v0

    .line 556
    :pswitch_5
    move-object/from16 v0, p1

    .line 557
    .line 558
    check-cast v0, La/oyg0;

    .line 559
    .line 560
    move-object/from16 v4, p2

    .line 561
    .line 562
    check-cast v4, La/b820;

    .line 563
    .line 564
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    iget-object v0, v4, La/b820;->g:La/wtb0;

    .line 571
    .line 572
    if-eqz v0, :cond_3

    .line 573
    .line 574
    const/16 v1, 0x37

    .line 575
    .line 576
    invoke-static {v0, v2, v3, v1}, La/wtb0;->a(La/wtb0;DI)La/wtb0;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    move-object v11, v0

    .line 581
    goto :goto_1

    .line 582
    :cond_3
    iget-object v0, v4, La/b820;->d:La/rvj0;

    .line 583
    .line 584
    iget-object v0, v0, La/rvj0;->a:La/dx6;

    .line 585
    .line 586
    iget-object v0, v0, La/dx6;->b:La/vw6;

    .line 587
    .line 588
    iget-wide v1, v0, La/vw6;->a:D

    .line 589
    .line 590
    invoke-virtual {v0}, La/vw6;->c()D

    .line 591
    .line 592
    .line 593
    move-result-wide v5

    .line 594
    mul-double v8, v5, v1

    .line 595
    .line 596
    new-instance v7, La/wtb0;

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v10, 0x0

    .line 601
    const/4 v11, 0x0

    .line 602
    const/4 v12, 0x1

    .line 603
    invoke-direct/range {v7 .. v14}, La/wtb0;-><init>(DZZZLjava/lang/String;La/ex4;)V

    .line 604
    .line 605
    .line 606
    move-object v11, v7

    .line 607
    :goto_1
    const/16 v16, 0x0

    .line 608
    .line 609
    const/16 v17, 0x1fbf

    .line 610
    .line 611
    const/4 v5, 0x0

    .line 612
    const/4 v6, 0x0

    .line 613
    const/4 v7, 0x0

    .line 614
    const/4 v8, 0x0

    .line 615
    const/4 v9, 0x0

    .line 616
    const/4 v10, 0x0

    .line 617
    const/4 v12, 0x0

    .line 618
    const/4 v13, 0x0

    .line 619
    const/4 v14, 0x0

    .line 620
    const/4 v15, 0x0

    .line 621
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    return-object v0

    .line 626
    :pswitch_6
    move-object/from16 v0, p1

    .line 627
    .line 628
    check-cast v0, La/oyg0;

    .line 629
    .line 630
    move-object/from16 v4, p2

    .line 631
    .line 632
    check-cast v4, La/b820;

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    iget-object v0, v4, La/b820;->g:La/wtb0;

    .line 641
    .line 642
    if-eqz v0, :cond_4

    .line 643
    .line 644
    const/16 v1, 0x3b

    .line 645
    .line 646
    invoke-static {v0, v2, v3, v1}, La/wtb0;->a(La/wtb0;DI)La/wtb0;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    move-object v11, v0

    .line 651
    goto :goto_2

    .line 652
    :cond_4
    iget-object v0, v4, La/b820;->d:La/rvj0;

    .line 653
    .line 654
    iget-object v0, v0, La/rvj0;->a:La/dx6;

    .line 655
    .line 656
    iget-object v0, v0, La/dx6;->b:La/vw6;

    .line 657
    .line 658
    iget-wide v1, v0, La/vw6;->a:D

    .line 659
    .line 660
    invoke-virtual {v0}, La/vw6;->c()D

    .line 661
    .line 662
    .line 663
    move-result-wide v5

    .line 664
    mul-double v8, v5, v1

    .line 665
    .line 666
    new-instance v7, La/wtb0;

    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const/4 v14, 0x0

    .line 670
    const/4 v10, 0x0

    .line 671
    const/4 v11, 0x1

    .line 672
    const/4 v12, 0x0

    .line 673
    invoke-direct/range {v7 .. v14}, La/wtb0;-><init>(DZZZLjava/lang/String;La/ex4;)V

    .line 674
    .line 675
    .line 676
    move-object v11, v7

    .line 677
    :goto_2
    const/16 v16, 0x0

    .line 678
    .line 679
    const/16 v17, 0x1fbf

    .line 680
    .line 681
    const/4 v5, 0x0

    .line 682
    const/4 v6, 0x0

    .line 683
    const/4 v7, 0x0

    .line 684
    const/4 v8, 0x0

    .line 685
    const/4 v9, 0x0

    .line 686
    const/4 v10, 0x0

    .line 687
    const/4 v12, 0x0

    .line 688
    const/4 v13, 0x0

    .line 689
    const/4 v14, 0x0

    .line 690
    const/4 v15, 0x0

    .line 691
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    return-object v0

    .line 696
    :pswitch_7
    move-object/from16 v0, p1

    .line 697
    .line 698
    check-cast v0, La/oyg0;

    .line 699
    .line 700
    move-object/from16 v4, p2

    .line 701
    .line 702
    check-cast v4, La/a820;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    iget-object v5, v4, La/a820;->d:La/xm5;

    .line 711
    .line 712
    sget-object v0, La/f40;->d:La/f40;

    .line 713
    .line 714
    new-instance v9, La/h40;

    .line 715
    .line 716
    invoke-direct {v9, v2, v3, v0}, La/h40;-><init>(DLa/f40;)V

    .line 717
    .line 718
    .line 719
    const/4 v10, 0x7

    .line 720
    const/4 v6, 0x0

    .line 721
    const/4 v7, 0x0

    .line 722
    const/4 v8, 0x0

    .line 723
    invoke-static/range {v5 .. v10}, La/xm5;->a(La/xm5;La/ke;ZLa/ql5;La/h40;I)La/xm5;

    .line 724
    .line 725
    .line 726
    move-result-object v7

    .line 727
    const/16 v20, 0x0

    .line 728
    .line 729
    const v21, 0x3fff7

    .line 730
    .line 731
    .line 732
    const/4 v5, 0x0

    .line 733
    const/4 v9, 0x0

    .line 734
    const/4 v10, 0x0

    .line 735
    const/4 v11, 0x0

    .line 736
    const/4 v12, 0x0

    .line 737
    const/4 v13, 0x0

    .line 738
    const/4 v14, 0x0

    .line 739
    const/4 v15, 0x0

    .line 740
    const/16 v16, 0x0

    .line 741
    .line 742
    const/16 v17, 0x0

    .line 743
    .line 744
    const/16 v18, 0x0

    .line 745
    .line 746
    const/16 v19, 0x0

    .line 747
    .line 748
    invoke-static/range {v4 .. v21}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    return-object v0

    .line 753
    :pswitch_8
    move-object/from16 v0, p1

    .line 754
    .line 755
    check-cast v0, La/ql5;

    .line 756
    .line 757
    move-object/from16 v1, p2

    .line 758
    .line 759
    check-cast v1, La/ql5;

    .line 760
    .line 761
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    iget-wide v2, v0, La/ql5;->a:J

    .line 768
    .line 769
    iget-wide v0, v1, La/ql5;->a:J

    .line 770
    .line 771
    cmp-long v0, v2, v0

    .line 772
    .line 773
    if-nez v0, :cond_5

    .line 774
    .line 775
    move v4, v5

    .line 776
    :cond_5
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    return-object v0

    .line 781
    :pswitch_9
    move-object/from16 v0, p1

    .line 782
    .line 783
    check-cast v0, La/ql5;

    .line 784
    .line 785
    move-object/from16 v1, p2

    .line 786
    .line 787
    check-cast v1, La/ql5;

    .line 788
    .line 789
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    iget-wide v2, v0, La/ql5;->a:J

    .line 796
    .line 797
    iget-wide v0, v1, La/ql5;->a:J

    .line 798
    .line 799
    cmp-long v0, v2, v0

    .line 800
    .line 801
    if-nez v0, :cond_6

    .line 802
    .line 803
    move v4, v5

    .line 804
    :cond_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    return-object v0

    .line 809
    :pswitch_a
    move-object/from16 v0, p1

    .line 810
    .line 811
    check-cast v0, La/oyg0;

    .line 812
    .line 813
    move-object/from16 v1, p2

    .line 814
    .line 815
    check-cast v1, La/a820;

    .line 816
    .line 817
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    iget-object v2, v1, La/a820;->g:La/hx4;

    .line 824
    .line 825
    iget-object v3, v2, La/hx4;->d:La/iwo0;

    .line 826
    .line 827
    sget-object v8, La/iun;->a:La/iun;

    .line 828
    .line 829
    const-wide/16 v6, 0x0

    .line 830
    .line 831
    const/16 v9, 0x15

    .line 832
    .line 833
    const/4 v4, 0x0

    .line 834
    const/4 v5, 0x0

    .line 835
    invoke-static/range {v3 .. v9}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 836
    .line 837
    .line 838
    move-result-object v6

    .line 839
    const/4 v8, 0x0

    .line 840
    const/16 v9, 0x37

    .line 841
    .line 842
    const/4 v3, 0x0

    .line 843
    const/4 v4, 0x0

    .line 844
    const/4 v5, 0x0

    .line 845
    const/4 v7, 0x0

    .line 846
    invoke-static/range {v2 .. v9}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 847
    .line 848
    .line 849
    move-result-object v7

    .line 850
    const/16 v17, 0x0

    .line 851
    .line 852
    const v18, 0x3ffbf

    .line 853
    .line 854
    .line 855
    const/4 v2, 0x0

    .line 856
    const/4 v6, 0x0

    .line 857
    const/4 v8, 0x0

    .line 858
    const/4 v9, 0x0

    .line 859
    const/4 v10, 0x0

    .line 860
    const/4 v11, 0x0

    .line 861
    const/4 v12, 0x0

    .line 862
    const/4 v13, 0x0

    .line 863
    const/4 v14, 0x0

    .line 864
    const/4 v15, 0x0

    .line 865
    const/16 v16, 0x0

    .line 866
    .line 867
    invoke-static/range {v1 .. v18}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    return-object v0

    .line 872
    :pswitch_b
    move-object/from16 v0, p1

    .line 873
    .line 874
    check-cast v0, La/oyg0;

    .line 875
    .line 876
    move-object/from16 v4, p2

    .line 877
    .line 878
    check-cast v4, La/a820;

    .line 879
    .line 880
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    iget-object v0, v4, La/a820;->h:La/vtb0;

    .line 887
    .line 888
    if-eqz v0, :cond_7

    .line 889
    .line 890
    const/16 v1, 0xfb

    .line 891
    .line 892
    invoke-static {v0, v2, v3, v1}, La/vtb0;->a(La/vtb0;DI)La/vtb0;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    move-object v11, v0

    .line 897
    goto :goto_3

    .line 898
    :cond_7
    new-instance v5, La/vtb0;

    .line 899
    .line 900
    iget-object v0, v4, La/a820;->e:La/pvj0;

    .line 901
    .line 902
    iget-object v0, v0, La/pvj0;->a:La/bx6;

    .line 903
    .line 904
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 905
    .line 906
    iget-wide v1, v0, La/tw6;->a:D

    .line 907
    .line 908
    invoke-virtual {v0}, La/tw6;->c()D

    .line 909
    .line 910
    .line 911
    move-result-wide v6

    .line 912
    mul-double/2addr v6, v1

    .line 913
    sget-object v13, La/g920;->e:La/g920;

    .line 914
    .line 915
    const/4 v14, 0x0

    .line 916
    const/4 v8, 0x0

    .line 917
    const/4 v9, 0x1

    .line 918
    const/4 v10, 0x0

    .line 919
    const/4 v11, 0x0

    .line 920
    const/4 v12, 0x0

    .line 921
    invoke-direct/range {v5 .. v14}, La/vtb0;-><init>(DZZZLjava/lang/String;La/ex4;La/g920;Z)V

    .line 922
    .line 923
    .line 924
    move-object v11, v5

    .line 925
    :goto_3
    const/16 v20, 0x0

    .line 926
    .line 927
    const v21, 0x3ff7f

    .line 928
    .line 929
    .line 930
    const/4 v5, 0x0

    .line 931
    const/4 v6, 0x0

    .line 932
    const/4 v7, 0x0

    .line 933
    const/4 v8, 0x0

    .line 934
    const/4 v9, 0x0

    .line 935
    const/4 v10, 0x0

    .line 936
    const/4 v12, 0x0

    .line 937
    const/4 v13, 0x0

    .line 938
    const/4 v14, 0x0

    .line 939
    const/4 v15, 0x0

    .line 940
    const/16 v16, 0x0

    .line 941
    .line 942
    const/16 v17, 0x0

    .line 943
    .line 944
    const/16 v18, 0x0

    .line 945
    .line 946
    const/16 v19, 0x0

    .line 947
    .line 948
    invoke-static/range {v4 .. v21}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    return-object v0

    .line 953
    :pswitch_c
    move-object/from16 v0, p1

    .line 954
    .line 955
    check-cast v0, La/oyg0;

    .line 956
    .line 957
    move-object/from16 v7, p2

    .line 958
    .line 959
    check-cast v7, La/a820;

    .line 960
    .line 961
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    iget-object v8, v7, La/a820;->g:La/hx4;

    .line 968
    .line 969
    iget-object v0, v8, La/hx4;->c:La/bx6;

    .line 970
    .line 971
    iget-object v9, v0, La/bx6;->b:La/tw6;

    .line 972
    .line 973
    const/16 v29, 0x0

    .line 974
    .line 975
    const v30, 0xbfff

    .line 976
    .line 977
    .line 978
    const-wide/16 v10, 0x0

    .line 979
    .line 980
    const-wide/16 v12, 0x0

    .line 981
    .line 982
    const-wide/16 v14, 0x0

    .line 983
    .line 984
    const-wide/16 v16, 0x0

    .line 985
    .line 986
    const-wide/16 v18, 0x0

    .line 987
    .line 988
    const/16 v20, 0x0

    .line 989
    .line 990
    const/16 v21, 0x0

    .line 991
    .line 992
    const/16 v22, 0x0

    .line 993
    .line 994
    const/16 v23, 0x0

    .line 995
    .line 996
    const/16 v24, 0x0

    .line 997
    .line 998
    const/16 v25, 0x0

    .line 999
    .line 1000
    const/16 v26, 0x0

    .line 1001
    .line 1002
    const/16 v27, 0x0

    .line 1003
    .line 1004
    const/16 v28, 0x0

    .line 1005
    .line 1006
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v2

    .line 1010
    invoke-static {v0, v6, v2, v4, v1}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v11

    .line 1014
    const/4 v14, 0x0

    .line 1015
    const/16 v15, 0x3b

    .line 1016
    .line 1017
    const/4 v9, 0x0

    .line 1018
    const/4 v10, 0x0

    .line 1019
    const/4 v12, 0x0

    .line 1020
    const/4 v13, 0x0

    .line 1021
    invoke-static/range {v8 .. v15}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v13

    .line 1025
    const/16 v23, 0x0

    .line 1026
    .line 1027
    const v24, 0x3ffbf

    .line 1028
    .line 1029
    .line 1030
    const/4 v8, 0x0

    .line 1031
    const/4 v11, 0x0

    .line 1032
    const/4 v14, 0x0

    .line 1033
    const/4 v15, 0x0

    .line 1034
    const/16 v16, 0x0

    .line 1035
    .line 1036
    const/16 v17, 0x0

    .line 1037
    .line 1038
    const/16 v18, 0x0

    .line 1039
    .line 1040
    const/16 v19, 0x0

    .line 1041
    .line 1042
    const/16 v20, 0x0

    .line 1043
    .line 1044
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    return-object v0

    .line 1049
    :pswitch_d
    move-object/from16 v0, p1

    .line 1050
    .line 1051
    check-cast v0, La/oyg0;

    .line 1052
    .line 1053
    move-object/from16 v1, p2

    .line 1054
    .line 1055
    check-cast v1, La/b820;

    .line 1056
    .line 1057
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    iget-object v2, v1, La/b820;->d:La/rvj0;

    .line 1064
    .line 1065
    iget-object v3, v2, La/rvj0;->c:La/kwo0;

    .line 1066
    .line 1067
    sget-object v8, La/iun;->a:La/iun;

    .line 1068
    .line 1069
    const/16 v9, 0x1c

    .line 1070
    .line 1071
    const/4 v4, 0x0

    .line 1072
    const/4 v5, 0x0

    .line 1073
    const-wide/16 v6, 0x0

    .line 1074
    .line 1075
    invoke-static/range {v3 .. v9}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v5

    .line 1079
    const/4 v7, 0x0

    .line 1080
    const/16 v8, 0x1b

    .line 1081
    .line 1082
    const/4 v3, 0x0

    .line 1083
    const/4 v4, 0x0

    .line 1084
    const/4 v6, 0x0

    .line 1085
    invoke-static/range {v2 .. v8}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v5

    .line 1089
    const/4 v13, 0x0

    .line 1090
    const/16 v14, 0x1ff7

    .line 1091
    .line 1092
    const/4 v2, 0x0

    .line 1093
    const/4 v8, 0x0

    .line 1094
    const/4 v9, 0x0

    .line 1095
    const/4 v10, 0x0

    .line 1096
    const/4 v11, 0x0

    .line 1097
    const/4 v12, 0x0

    .line 1098
    invoke-static/range {v1 .. v14}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    return-object v0

    .line 1103
    :pswitch_e
    move-object/from16 v0, p1

    .line 1104
    .line 1105
    check-cast v0, La/oyg0;

    .line 1106
    .line 1107
    move-object/from16 v7, p2

    .line 1108
    .line 1109
    check-cast v7, La/b820;

    .line 1110
    .line 1111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    iget-object v8, v7, La/b820;->d:La/rvj0;

    .line 1118
    .line 1119
    iget-object v0, v8, La/rvj0;->a:La/dx6;

    .line 1120
    .line 1121
    iget-object v9, v0, La/dx6;->b:La/vw6;

    .line 1122
    .line 1123
    const/16 v27, 0x0

    .line 1124
    .line 1125
    const v28, 0xbfff

    .line 1126
    .line 1127
    .line 1128
    const-wide/16 v10, 0x0

    .line 1129
    .line 1130
    const-wide/16 v12, 0x0

    .line 1131
    .line 1132
    const-wide/16 v14, 0x0

    .line 1133
    .line 1134
    const-wide/16 v16, 0x0

    .line 1135
    .line 1136
    const-wide/16 v18, 0x0

    .line 1137
    .line 1138
    const/16 v20, 0x0

    .line 1139
    .line 1140
    const/16 v21, 0x0

    .line 1141
    .line 1142
    const/16 v22, 0x0

    .line 1143
    .line 1144
    const/16 v23, 0x0

    .line 1145
    .line 1146
    const/16 v24, 0x0

    .line 1147
    .line 1148
    const/16 v25, 0x0

    .line 1149
    .line 1150
    const/16 v26, 0x0

    .line 1151
    .line 1152
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v1

    .line 1156
    invoke-static {v0, v6, v1, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v9

    .line 1160
    const/4 v13, 0x0

    .line 1161
    const/16 v14, 0x1e

    .line 1162
    .line 1163
    const/4 v10, 0x0

    .line 1164
    const/4 v11, 0x0

    .line 1165
    const/4 v12, 0x0

    .line 1166
    invoke-static/range {v8 .. v14}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v11

    .line 1170
    const/16 v19, 0x0

    .line 1171
    .line 1172
    const/16 v20, 0x1ff7

    .line 1173
    .line 1174
    const/4 v8, 0x0

    .line 1175
    const/4 v9, 0x0

    .line 1176
    const/4 v14, 0x0

    .line 1177
    const/4 v15, 0x0

    .line 1178
    const/16 v16, 0x0

    .line 1179
    .line 1180
    const/16 v17, 0x0

    .line 1181
    .line 1182
    const/16 v18, 0x0

    .line 1183
    .line 1184
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    return-object v0

    .line 1189
    :pswitch_f
    move-object/from16 v0, p1

    .line 1190
    .line 1191
    check-cast v0, La/oyg0;

    .line 1192
    .line 1193
    move-object/from16 v1, p2

    .line 1194
    .line 1195
    check-cast v1, La/a820;

    .line 1196
    .line 1197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1201
    .line 1202
    .line 1203
    new-instance v2, La/vtb0;

    .line 1204
    .line 1205
    iget-object v0, v1, La/a820;->e:La/pvj0;

    .line 1206
    .line 1207
    iget-object v0, v0, La/pvj0;->a:La/bx6;

    .line 1208
    .line 1209
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 1210
    .line 1211
    iget-wide v3, v0, La/tw6;->a:D

    .line 1212
    .line 1213
    invoke-virtual {v0}, La/tw6;->c()D

    .line 1214
    .line 1215
    .line 1216
    move-result-wide v5

    .line 1217
    mul-double/2addr v3, v5

    .line 1218
    sget-object v10, La/g920;->e:La/g920;

    .line 1219
    .line 1220
    const/4 v11, 0x0

    .line 1221
    const/4 v5, 0x0

    .line 1222
    const/4 v6, 0x0

    .line 1223
    const/4 v7, 0x0

    .line 1224
    const/4 v8, 0x0

    .line 1225
    const/4 v9, 0x0

    .line 1226
    invoke-direct/range {v2 .. v11}, La/vtb0;-><init>(DZZZLjava/lang/String;La/ex4;La/g920;Z)V

    .line 1227
    .line 1228
    .line 1229
    const/16 v17, 0x0

    .line 1230
    .line 1231
    const v18, 0x3ff7f

    .line 1232
    .line 1233
    .line 1234
    move-object v8, v2

    .line 1235
    const/4 v2, 0x0

    .line 1236
    const/4 v3, 0x0

    .line 1237
    const/4 v4, 0x0

    .line 1238
    const/4 v5, 0x0

    .line 1239
    const/4 v6, 0x0

    .line 1240
    const/4 v7, 0x0

    .line 1241
    const/4 v9, 0x0

    .line 1242
    const/4 v10, 0x0

    .line 1243
    const/4 v11, 0x0

    .line 1244
    const/4 v12, 0x0

    .line 1245
    const/4 v13, 0x0

    .line 1246
    const/4 v14, 0x0

    .line 1247
    const/4 v15, 0x0

    .line 1248
    const/16 v16, 0x0

    .line 1249
    .line 1250
    invoke-static/range {v1 .. v18}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    return-object v0

    .line 1255
    :pswitch_10
    move-object/from16 v0, p1

    .line 1256
    .line 1257
    check-cast v0, La/oyg0;

    .line 1258
    .line 1259
    move-object/from16 v7, p2

    .line 1260
    .line 1261
    check-cast v7, La/b820;

    .line 1262
    .line 1263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    iget-object v8, v7, La/b820;->f:La/gx4;

    .line 1270
    .line 1271
    if-eqz v8, :cond_8

    .line 1272
    .line 1273
    iget-object v9, v8, La/gx4;->d:La/kwo0;

    .line 1274
    .line 1275
    sget-object v14, La/iun;->a:La/iun;

    .line 1276
    .line 1277
    const-wide/16 v12, 0x0

    .line 1278
    .line 1279
    const/16 v15, 0x15

    .line 1280
    .line 1281
    const/4 v10, 0x0

    .line 1282
    const/4 v11, 0x0

    .line 1283
    invoke-static/range {v9 .. v15}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v12

    .line 1287
    const/4 v13, 0x0

    .line 1288
    const/16 v14, 0x17

    .line 1289
    .line 1290
    const/4 v9, 0x0

    .line 1291
    const/4 v10, 0x0

    .line 1292
    const/4 v11, 0x0

    .line 1293
    invoke-static/range {v8 .. v14}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v6

    .line 1297
    :cond_8
    move-object v13, v6

    .line 1298
    const/16 v19, 0x0

    .line 1299
    .line 1300
    const/16 v20, 0x1fdf

    .line 1301
    .line 1302
    const/4 v8, 0x0

    .line 1303
    const/4 v9, 0x0

    .line 1304
    const/4 v10, 0x0

    .line 1305
    const/4 v11, 0x0

    .line 1306
    const/4 v12, 0x0

    .line 1307
    const/4 v14, 0x0

    .line 1308
    const/4 v15, 0x0

    .line 1309
    const/16 v16, 0x0

    .line 1310
    .line 1311
    const/16 v17, 0x0

    .line 1312
    .line 1313
    const/16 v18, 0x0

    .line 1314
    .line 1315
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    return-object v0

    .line 1320
    :pswitch_11
    move-object/from16 v0, p1

    .line 1321
    .line 1322
    check-cast v0, La/oyg0;

    .line 1323
    .line 1324
    move-object/from16 v1, p2

    .line 1325
    .line 1326
    check-cast v1, La/a820;

    .line 1327
    .line 1328
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    const/16 v17, 0x0

    .line 1335
    .line 1336
    const v18, 0x3ff7f

    .line 1337
    .line 1338
    .line 1339
    const/4 v2, 0x0

    .line 1340
    const/4 v3, 0x0

    .line 1341
    const/4 v4, 0x0

    .line 1342
    const/4 v5, 0x0

    .line 1343
    const/4 v6, 0x0

    .line 1344
    const/4 v7, 0x0

    .line 1345
    const/4 v8, 0x0

    .line 1346
    const/4 v9, 0x0

    .line 1347
    const/4 v10, 0x0

    .line 1348
    const/4 v11, 0x0

    .line 1349
    const/4 v12, 0x0

    .line 1350
    const/4 v13, 0x0

    .line 1351
    const/4 v14, 0x0

    .line 1352
    const/4 v15, 0x0

    .line 1353
    const/16 v16, 0x0

    .line 1354
    .line 1355
    invoke-static/range {v1 .. v18}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    return-object v0

    .line 1360
    :pswitch_12
    move-object/from16 v0, p1

    .line 1361
    .line 1362
    check-cast v0, La/oyg0;

    .line 1363
    .line 1364
    move-object/from16 v1, p2

    .line 1365
    .line 1366
    check-cast v1, La/sg20;

    .line 1367
    .line 1368
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1372
    .line 1373
    .line 1374
    iget-object v2, v1, La/sg20;->e:La/qvj0;

    .line 1375
    .line 1376
    iget-object v3, v2, La/qvj0;->c:La/jwo0;

    .line 1377
    .line 1378
    sget-object v8, La/iun;->a:La/iun;

    .line 1379
    .line 1380
    const/16 v9, 0x16

    .line 1381
    .line 1382
    const/4 v4, 0x0

    .line 1383
    const/4 v5, 0x0

    .line 1384
    const-wide/16 v6, 0x0

    .line 1385
    .line 1386
    invoke-static/range {v3 .. v9}, La/jwo0;->a(La/jwo0;ZZDLjava/util/List;I)La/jwo0;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v5

    .line 1390
    const/4 v6, 0x0

    .line 1391
    const/16 v7, 0x1b

    .line 1392
    .line 1393
    const/4 v3, 0x0

    .line 1394
    const/4 v4, 0x0

    .line 1395
    invoke-static/range {v2 .. v7}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v5

    .line 1399
    const/4 v10, 0x0

    .line 1400
    const/16 v11, 0x7ef

    .line 1401
    .line 1402
    const/4 v2, 0x0

    .line 1403
    const/4 v7, 0x0

    .line 1404
    const/4 v8, 0x0

    .line 1405
    const/4 v9, 0x0

    .line 1406
    invoke-static/range {v1 .. v11}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    return-object v0

    .line 1411
    :pswitch_13
    move-object/from16 v0, p1

    .line 1412
    .line 1413
    check-cast v0, La/oyg0;

    .line 1414
    .line 1415
    move-object/from16 v7, p2

    .line 1416
    .line 1417
    check-cast v7, La/a820;

    .line 1418
    .line 1419
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1423
    .line 1424
    .line 1425
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 1426
    .line 1427
    iget-object v0, v8, La/pvj0;->a:La/bx6;

    .line 1428
    .line 1429
    iget-object v9, v0, La/bx6;->b:La/tw6;

    .line 1430
    .line 1431
    const/16 v29, 0x0

    .line 1432
    .line 1433
    const v30, 0xbfff

    .line 1434
    .line 1435
    .line 1436
    const-wide/16 v10, 0x0

    .line 1437
    .line 1438
    const-wide/16 v12, 0x0

    .line 1439
    .line 1440
    const-wide/16 v14, 0x0

    .line 1441
    .line 1442
    const-wide/16 v16, 0x0

    .line 1443
    .line 1444
    const-wide/16 v18, 0x0

    .line 1445
    .line 1446
    const/16 v20, 0x0

    .line 1447
    .line 1448
    const/16 v21, 0x0

    .line 1449
    .line 1450
    const/16 v22, 0x0

    .line 1451
    .line 1452
    const/16 v23, 0x0

    .line 1453
    .line 1454
    const/16 v24, 0x0

    .line 1455
    .line 1456
    const/16 v25, 0x0

    .line 1457
    .line 1458
    const/16 v26, 0x0

    .line 1459
    .line 1460
    const/16 v27, 0x0

    .line 1461
    .line 1462
    const/16 v28, 0x0

    .line 1463
    .line 1464
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    invoke-static {v0, v6, v2, v4, v1}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v9

    .line 1472
    const/4 v14, 0x0

    .line 1473
    const/16 v15, 0x3e

    .line 1474
    .line 1475
    const/4 v10, 0x0

    .line 1476
    const/4 v11, 0x0

    .line 1477
    const/4 v12, 0x0

    .line 1478
    const/4 v13, 0x0

    .line 1479
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v11

    .line 1483
    const/16 v23, 0x0

    .line 1484
    .line 1485
    const v24, 0x3ffef

    .line 1486
    .line 1487
    .line 1488
    const/4 v8, 0x0

    .line 1489
    const/4 v9, 0x0

    .line 1490
    const/4 v14, 0x0

    .line 1491
    const/4 v15, 0x0

    .line 1492
    const/16 v16, 0x0

    .line 1493
    .line 1494
    const/16 v17, 0x0

    .line 1495
    .line 1496
    const/16 v18, 0x0

    .line 1497
    .line 1498
    const/16 v19, 0x0

    .line 1499
    .line 1500
    const/16 v20, 0x0

    .line 1501
    .line 1502
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    return-object v0

    .line 1507
    :pswitch_14
    move-object/from16 v0, p1

    .line 1508
    .line 1509
    check-cast v0, La/oyg0;

    .line 1510
    .line 1511
    move-object/from16 v7, p2

    .line 1512
    .line 1513
    check-cast v7, La/sg20;

    .line 1514
    .line 1515
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1519
    .line 1520
    .line 1521
    iget-object v8, v7, La/sg20;->e:La/qvj0;

    .line 1522
    .line 1523
    iget-object v0, v8, La/qvj0;->a:La/cx6;

    .line 1524
    .line 1525
    iget-object v9, v0, La/cx6;->b:La/uw6;

    .line 1526
    .line 1527
    const/16 v24, 0x0

    .line 1528
    .line 1529
    const/16 v25, 0x2fff

    .line 1530
    .line 1531
    const-wide/16 v10, 0x0

    .line 1532
    .line 1533
    const-wide/16 v12, 0x0

    .line 1534
    .line 1535
    const-wide/16 v14, 0x0

    .line 1536
    .line 1537
    const-wide/16 v16, 0x0

    .line 1538
    .line 1539
    const/16 v18, 0x0

    .line 1540
    .line 1541
    const/16 v19, 0x0

    .line 1542
    .line 1543
    const/16 v20, 0x0

    .line 1544
    .line 1545
    const/16 v21, 0x0

    .line 1546
    .line 1547
    const/16 v22, 0x0

    .line 1548
    .line 1549
    const/16 v23, 0x0

    .line 1550
    .line 1551
    invoke-static/range {v9 .. v25}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v1

    .line 1555
    invoke-static {v0, v6, v1, v5}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v9

    .line 1559
    const/4 v12, 0x0

    .line 1560
    const/16 v13, 0x1e

    .line 1561
    .line 1562
    const/4 v10, 0x0

    .line 1563
    const/4 v11, 0x0

    .line 1564
    invoke-static/range {v8 .. v13}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v11

    .line 1568
    const/16 v16, 0x0

    .line 1569
    .line 1570
    const/16 v17, 0x7ef

    .line 1571
    .line 1572
    const/4 v8, 0x0

    .line 1573
    const/4 v9, 0x0

    .line 1574
    const/4 v13, 0x0

    .line 1575
    const/4 v14, 0x0

    .line 1576
    const/4 v15, 0x0

    .line 1577
    invoke-static/range {v7 .. v17}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v0

    .line 1581
    return-object v0

    .line 1582
    :pswitch_15
    move-object/from16 v0, p1

    .line 1583
    .line 1584
    check-cast v0, La/oyg0;

    .line 1585
    .line 1586
    move-object/from16 v1, p2

    .line 1587
    .line 1588
    check-cast v1, La/b820;

    .line 1589
    .line 1590
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1594
    .line 1595
    .line 1596
    iget-object v0, v1, La/b820;->d:La/rvj0;

    .line 1597
    .line 1598
    iget-object v0, v0, La/rvj0;->a:La/dx6;

    .line 1599
    .line 1600
    iget-object v0, v0, La/dx6;->b:La/vw6;

    .line 1601
    .line 1602
    iget-wide v2, v0, La/vw6;->a:D

    .line 1603
    .line 1604
    invoke-virtual {v0}, La/vw6;->c()D

    .line 1605
    .line 1606
    .line 1607
    move-result-wide v4

    .line 1608
    mul-double v7, v4, v2

    .line 1609
    .line 1610
    new-instance v6, La/wtb0;

    .line 1611
    .line 1612
    const/4 v12, 0x0

    .line 1613
    const/4 v13, 0x0

    .line 1614
    const/4 v9, 0x0

    .line 1615
    const/4 v10, 0x0

    .line 1616
    const/4 v11, 0x0

    .line 1617
    invoke-direct/range {v6 .. v13}, La/wtb0;-><init>(DZZZLjava/lang/String;La/ex4;)V

    .line 1618
    .line 1619
    .line 1620
    const/4 v13, 0x0

    .line 1621
    const/16 v14, 0x1fbf

    .line 1622
    .line 1623
    const/4 v2, 0x0

    .line 1624
    const/4 v3, 0x0

    .line 1625
    const/4 v4, 0x0

    .line 1626
    const/4 v5, 0x0

    .line 1627
    move-object v8, v6

    .line 1628
    const/4 v6, 0x0

    .line 1629
    const/4 v7, 0x0

    .line 1630
    const/4 v12, 0x0

    .line 1631
    invoke-static/range {v1 .. v14}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v0

    .line 1635
    return-object v0

    .line 1636
    :pswitch_16
    move-object/from16 v0, p1

    .line 1637
    .line 1638
    check-cast v0, La/oyg0;

    .line 1639
    .line 1640
    move-object/from16 v7, p2

    .line 1641
    .line 1642
    check-cast v7, La/sg20;

    .line 1643
    .line 1644
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    iget-object v8, v7, La/sg20;->e:La/qvj0;

    .line 1651
    .line 1652
    iget-object v0, v8, La/qvj0;->a:La/cx6;

    .line 1653
    .line 1654
    iget-object v9, v0, La/cx6;->b:La/uw6;

    .line 1655
    .line 1656
    const/16 v24, 0x0

    .line 1657
    .line 1658
    const/16 v25, 0x2fff

    .line 1659
    .line 1660
    const-wide/16 v10, 0x0

    .line 1661
    .line 1662
    const-wide/16 v12, 0x0

    .line 1663
    .line 1664
    const-wide/16 v14, 0x0

    .line 1665
    .line 1666
    const-wide/16 v16, 0x0

    .line 1667
    .line 1668
    const/16 v18, 0x0

    .line 1669
    .line 1670
    const/16 v19, 0x0

    .line 1671
    .line 1672
    const/16 v20, 0x0

    .line 1673
    .line 1674
    const/16 v21, 0x0

    .line 1675
    .line 1676
    const/16 v22, 0x0

    .line 1677
    .line 1678
    const/16 v23, 0x1

    .line 1679
    .line 1680
    invoke-static/range {v9 .. v25}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v1

    .line 1684
    invoke-static {v0, v6, v1, v5}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v9

    .line 1688
    const/4 v12, 0x0

    .line 1689
    const/16 v13, 0x1e

    .line 1690
    .line 1691
    const/4 v10, 0x0

    .line 1692
    const/4 v11, 0x0

    .line 1693
    invoke-static/range {v8 .. v13}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v11

    .line 1697
    const/16 v16, 0x0

    .line 1698
    .line 1699
    const/16 v17, 0x7ef

    .line 1700
    .line 1701
    const/4 v8, 0x0

    .line 1702
    const/4 v9, 0x0

    .line 1703
    const/4 v13, 0x0

    .line 1704
    const/4 v14, 0x0

    .line 1705
    const/4 v15, 0x0

    .line 1706
    invoke-static/range {v7 .. v17}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    return-object v0

    .line 1711
    :pswitch_17
    move-object/from16 v0, p1

    .line 1712
    .line 1713
    check-cast v0, La/oyg0;

    .line 1714
    .line 1715
    move-object/from16 v7, p2

    .line 1716
    .line 1717
    check-cast v7, La/b820;

    .line 1718
    .line 1719
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1723
    .line 1724
    .line 1725
    iget-object v0, v7, La/b820;->b:La/fo7;

    .line 1726
    .line 1727
    sget-object v1, La/co7;->b:La/co7;

    .line 1728
    .line 1729
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1730
    .line 1731
    .line 1732
    move-result v1

    .line 1733
    if-eqz v1, :cond_9

    .line 1734
    .line 1735
    iget-object v8, v7, La/b820;->d:La/rvj0;

    .line 1736
    .line 1737
    iget-object v0, v8, La/rvj0;->c:La/kwo0;

    .line 1738
    .line 1739
    sget-object v5, La/iun;->a:La/iun;

    .line 1740
    .line 1741
    const/16 v6, 0x1c

    .line 1742
    .line 1743
    const/4 v1, 0x0

    .line 1744
    const/4 v2, 0x0

    .line 1745
    const-wide/16 v3, 0x0

    .line 1746
    .line 1747
    invoke-static/range {v0 .. v6}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v11

    .line 1751
    const/4 v13, 0x0

    .line 1752
    const/16 v14, 0x1b

    .line 1753
    .line 1754
    const/4 v9, 0x0

    .line 1755
    const/4 v10, 0x0

    .line 1756
    const/4 v12, 0x0

    .line 1757
    invoke-static/range {v8 .. v14}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v11

    .line 1761
    const/16 v19, 0x0

    .line 1762
    .line 1763
    const/16 v20, 0x1ff7

    .line 1764
    .line 1765
    const/4 v8, 0x0

    .line 1766
    const/4 v14, 0x0

    .line 1767
    const/4 v15, 0x0

    .line 1768
    const/16 v16, 0x0

    .line 1769
    .line 1770
    const/16 v17, 0x0

    .line 1771
    .line 1772
    const/16 v18, 0x0

    .line 1773
    .line 1774
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v6

    .line 1778
    goto :goto_4

    .line 1779
    :cond_9
    sget-object v1, La/xn7;->b:La/xn7;

    .line 1780
    .line 1781
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1782
    .line 1783
    .line 1784
    move-result v1

    .line 1785
    if-eqz v1, :cond_b

    .line 1786
    .line 1787
    iget-object v8, v7, La/b820;->f:La/gx4;

    .line 1788
    .line 1789
    if-eqz v8, :cond_a

    .line 1790
    .line 1791
    iget-object v9, v8, La/gx4;->d:La/kwo0;

    .line 1792
    .line 1793
    sget-object v14, La/iun;->a:La/iun;

    .line 1794
    .line 1795
    const/16 v15, 0x1c

    .line 1796
    .line 1797
    const/4 v10, 0x0

    .line 1798
    const/4 v11, 0x0

    .line 1799
    const-wide/16 v12, 0x0

    .line 1800
    .line 1801
    invoke-static/range {v9 .. v15}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v12

    .line 1805
    const/4 v13, 0x0

    .line 1806
    const/16 v14, 0x17

    .line 1807
    .line 1808
    const/4 v9, 0x0

    .line 1809
    const/4 v10, 0x0

    .line 1810
    const/4 v11, 0x0

    .line 1811
    invoke-static/range {v8 .. v14}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v6

    .line 1815
    :cond_a
    move-object v13, v6

    .line 1816
    const/16 v19, 0x0

    .line 1817
    .line 1818
    const/16 v20, 0x1fdf

    .line 1819
    .line 1820
    const/4 v8, 0x0

    .line 1821
    const/4 v9, 0x0

    .line 1822
    const/4 v10, 0x0

    .line 1823
    const/4 v11, 0x0

    .line 1824
    const/4 v12, 0x0

    .line 1825
    const/4 v14, 0x0

    .line 1826
    const/4 v15, 0x0

    .line 1827
    const/16 v16, 0x0

    .line 1828
    .line 1829
    const/16 v17, 0x0

    .line 1830
    .line 1831
    const/16 v18, 0x0

    .line 1832
    .line 1833
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v6

    .line 1837
    goto :goto_4

    .line 1838
    :cond_b
    sget-object v1, La/zn7;->b:La/zn7;

    .line 1839
    .line 1840
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1841
    .line 1842
    .line 1843
    move-result v0

    .line 1844
    if-eqz v0, :cond_c

    .line 1845
    .line 1846
    move-object v6, v7

    .line 1847
    goto :goto_4

    .line 1848
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 1849
    .line 1850
    .line 1851
    :goto_4
    return-object v6

    .line 1852
    :pswitch_18
    move-object/from16 v0, p1

    .line 1853
    .line 1854
    check-cast v0, La/oyg0;

    .line 1855
    .line 1856
    move-object/from16 v4, p2

    .line 1857
    .line 1858
    check-cast v4, La/a820;

    .line 1859
    .line 1860
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1864
    .line 1865
    .line 1866
    iget-object v0, v4, La/a820;->h:La/vtb0;

    .line 1867
    .line 1868
    if-eqz v0, :cond_d

    .line 1869
    .line 1870
    const/16 v1, 0x7f

    .line 1871
    .line 1872
    invoke-static {v0, v2, v3, v1}, La/vtb0;->a(La/vtb0;DI)La/vtb0;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v0

    .line 1876
    move-object v11, v0

    .line 1877
    goto :goto_5

    .line 1878
    :cond_d
    new-instance v5, La/vtb0;

    .line 1879
    .line 1880
    iget-object v0, v4, La/a820;->e:La/pvj0;

    .line 1881
    .line 1882
    iget-object v0, v0, La/pvj0;->a:La/bx6;

    .line 1883
    .line 1884
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 1885
    .line 1886
    iget-wide v1, v0, La/tw6;->a:D

    .line 1887
    .line 1888
    invoke-virtual {v0}, La/tw6;->c()D

    .line 1889
    .line 1890
    .line 1891
    move-result-wide v6

    .line 1892
    mul-double/2addr v6, v1

    .line 1893
    sget-object v13, La/g920;->e:La/g920;

    .line 1894
    .line 1895
    const/4 v14, 0x1

    .line 1896
    const/4 v8, 0x0

    .line 1897
    const/4 v9, 0x0

    .line 1898
    const/4 v10, 0x0

    .line 1899
    const/4 v11, 0x0

    .line 1900
    const/4 v12, 0x0

    .line 1901
    invoke-direct/range {v5 .. v14}, La/vtb0;-><init>(DZZZLjava/lang/String;La/ex4;La/g920;Z)V

    .line 1902
    .line 1903
    .line 1904
    move-object v11, v5

    .line 1905
    :goto_5
    const/16 v20, 0x0

    .line 1906
    .line 1907
    const v21, 0x3ff7f

    .line 1908
    .line 1909
    .line 1910
    const/4 v5, 0x0

    .line 1911
    const/4 v6, 0x0

    .line 1912
    const/4 v7, 0x0

    .line 1913
    const/4 v8, 0x0

    .line 1914
    const/4 v9, 0x0

    .line 1915
    const/4 v10, 0x0

    .line 1916
    const/4 v12, 0x0

    .line 1917
    const/4 v13, 0x0

    .line 1918
    const/4 v14, 0x0

    .line 1919
    const/4 v15, 0x0

    .line 1920
    const/16 v16, 0x0

    .line 1921
    .line 1922
    const/16 v17, 0x0

    .line 1923
    .line 1924
    const/16 v18, 0x0

    .line 1925
    .line 1926
    const/16 v19, 0x0

    .line 1927
    .line 1928
    invoke-static/range {v4 .. v21}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v0

    .line 1932
    return-object v0

    .line 1933
    :pswitch_19
    move-object/from16 v0, p1

    .line 1934
    .line 1935
    check-cast v0, Ljava/lang/Throwable;

    .line 1936
    .line 1937
    move-object/from16 v1, p2

    .line 1938
    .line 1939
    check-cast v1, Ljava/lang/String;

    .line 1940
    .line 1941
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1942
    .line 1943
    .line 1944
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1945
    .line 1946
    .line 1947
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1948
    .line 1949
    return-object v0

    .line 1950
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1951
    .line 1952
    check-cast v0, La/oyg0;

    .line 1953
    .line 1954
    move-object/from16 v7, p2

    .line 1955
    .line 1956
    check-cast v7, La/b820;

    .line 1957
    .line 1958
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1959
    .line 1960
    .line 1961
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1962
    .line 1963
    .line 1964
    iget-object v8, v7, La/b820;->d:La/rvj0;

    .line 1965
    .line 1966
    iget-object v0, v8, La/rvj0;->a:La/dx6;

    .line 1967
    .line 1968
    iget-object v9, v0, La/dx6;->b:La/vw6;

    .line 1969
    .line 1970
    const/16 v27, 0x0

    .line 1971
    .line 1972
    const v28, 0xbfff

    .line 1973
    .line 1974
    .line 1975
    const-wide/16 v10, 0x0

    .line 1976
    .line 1977
    const-wide/16 v12, 0x0

    .line 1978
    .line 1979
    const-wide/16 v14, 0x0

    .line 1980
    .line 1981
    const-wide/16 v16, 0x0

    .line 1982
    .line 1983
    const-wide/16 v18, 0x0

    .line 1984
    .line 1985
    const/16 v20, 0x0

    .line 1986
    .line 1987
    const/16 v21, 0x0

    .line 1988
    .line 1989
    const/16 v22, 0x0

    .line 1990
    .line 1991
    const/16 v23, 0x0

    .line 1992
    .line 1993
    const/16 v24, 0x0

    .line 1994
    .line 1995
    const/16 v25, 0x0

    .line 1996
    .line 1997
    const/16 v26, 0x1

    .line 1998
    .line 1999
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v1

    .line 2003
    invoke-static {v0, v6, v1, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v9

    .line 2007
    const/4 v13, 0x0

    .line 2008
    const/16 v14, 0x1e

    .line 2009
    .line 2010
    const/4 v10, 0x0

    .line 2011
    const/4 v11, 0x0

    .line 2012
    const/4 v12, 0x0

    .line 2013
    invoke-static/range {v8 .. v14}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v11

    .line 2017
    iget-object v12, v7, La/b820;->f:La/gx4;

    .line 2018
    .line 2019
    if-eqz v12, :cond_e

    .line 2020
    .line 2021
    iget-object v0, v12, La/gx4;->c:La/dx6;

    .line 2022
    .line 2023
    iget-object v13, v0, La/dx6;->b:La/vw6;

    .line 2024
    .line 2025
    const/16 v31, 0x0

    .line 2026
    .line 2027
    const v32, 0xbfff

    .line 2028
    .line 2029
    .line 2030
    const-wide/16 v14, 0x0

    .line 2031
    .line 2032
    const-wide/16 v16, 0x0

    .line 2033
    .line 2034
    const-wide/16 v18, 0x0

    .line 2035
    .line 2036
    const-wide/16 v20, 0x0

    .line 2037
    .line 2038
    const-wide/16 v22, 0x0

    .line 2039
    .line 2040
    const/16 v24, 0x0

    .line 2041
    .line 2042
    const/16 v25, 0x0

    .line 2043
    .line 2044
    const/16 v26, 0x0

    .line 2045
    .line 2046
    const/16 v27, 0x0

    .line 2047
    .line 2048
    const/16 v28, 0x0

    .line 2049
    .line 2050
    const/16 v29, 0x0

    .line 2051
    .line 2052
    const/16 v30, 0x1

    .line 2053
    .line 2054
    invoke-static/range {v13 .. v32}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v1

    .line 2058
    invoke-static {v0, v6, v1, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v15

    .line 2062
    const/16 v17, 0x0

    .line 2063
    .line 2064
    const/16 v18, 0x1b

    .line 2065
    .line 2066
    const/4 v13, 0x0

    .line 2067
    const/4 v14, 0x0

    .line 2068
    const/16 v16, 0x0

    .line 2069
    .line 2070
    invoke-static/range {v12 .. v18}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v6

    .line 2074
    :cond_e
    move-object v13, v6

    .line 2075
    const/16 v19, 0x0

    .line 2076
    .line 2077
    const/16 v20, 0x1fd7

    .line 2078
    .line 2079
    const/4 v8, 0x0

    .line 2080
    const/4 v9, 0x0

    .line 2081
    const/4 v10, 0x0

    .line 2082
    const/4 v12, 0x0

    .line 2083
    const/4 v14, 0x0

    .line 2084
    const/4 v15, 0x0

    .line 2085
    const/16 v16, 0x0

    .line 2086
    .line 2087
    const/16 v17, 0x0

    .line 2088
    .line 2089
    const/16 v18, 0x0

    .line 2090
    .line 2091
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v0

    .line 2095
    return-object v0

    .line 2096
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2097
    .line 2098
    check-cast v0, La/oyg0;

    .line 2099
    .line 2100
    move-object/from16 v7, p2

    .line 2101
    .line 2102
    check-cast v7, La/sg20;

    .line 2103
    .line 2104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2105
    .line 2106
    .line 2107
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2108
    .line 2109
    .line 2110
    iget-object v0, v7, La/sg20;->d:La/eo7;

    .line 2111
    .line 2112
    sget-object v1, La/bo7;->a:La/bo7;

    .line 2113
    .line 2114
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2115
    .line 2116
    .line 2117
    move-result v1

    .line 2118
    if-eqz v1, :cond_f

    .line 2119
    .line 2120
    iget-object v8, v7, La/sg20;->e:La/qvj0;

    .line 2121
    .line 2122
    iget-object v0, v8, La/qvj0;->c:La/jwo0;

    .line 2123
    .line 2124
    sget-object v5, La/iun;->a:La/iun;

    .line 2125
    .line 2126
    const/16 v6, 0x16

    .line 2127
    .line 2128
    const/4 v1, 0x0

    .line 2129
    const/4 v2, 0x0

    .line 2130
    const-wide/16 v3, 0x0

    .line 2131
    .line 2132
    invoke-static/range {v0 .. v6}, La/jwo0;->a(La/jwo0;ZZDLjava/util/List;I)La/jwo0;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v11

    .line 2136
    const/4 v12, 0x0

    .line 2137
    const/16 v13, 0x1b

    .line 2138
    .line 2139
    const/4 v9, 0x0

    .line 2140
    const/4 v10, 0x0

    .line 2141
    invoke-static/range {v8 .. v13}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v11

    .line 2145
    const/16 v16, 0x0

    .line 2146
    .line 2147
    const/16 v17, 0x7ef

    .line 2148
    .line 2149
    const/4 v8, 0x0

    .line 2150
    const/4 v13, 0x0

    .line 2151
    const/4 v14, 0x0

    .line 2152
    const/4 v15, 0x0

    .line 2153
    invoke-static/range {v7 .. v17}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v6

    .line 2157
    goto :goto_6

    .line 2158
    :cond_f
    sget-object v1, La/yn7;->a:La/yn7;

    .line 2159
    .line 2160
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2161
    .line 2162
    .line 2163
    move-result v0

    .line 2164
    if-eqz v0, :cond_10

    .line 2165
    .line 2166
    move-object v6, v7

    .line 2167
    goto :goto_6

    .line 2168
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 2169
    .line 2170
    .line 2171
    :goto_6
    return-object v6

    .line 2172
    :pswitch_1c
    move-object/from16 v0, p1

    .line 2173
    .line 2174
    check-cast v0, Ljava/lang/Throwable;

    .line 2175
    .line 2176
    move-object/from16 v1, p2

    .line 2177
    .line 2178
    check-cast v1, Ljava/lang/String;

    .line 2179
    .line 2180
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2181
    .line 2182
    .line 2183
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2184
    .line 2185
    return-object v0

    .line 2186
    nop

    .line 2187
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
