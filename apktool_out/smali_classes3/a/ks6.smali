.class public final synthetic La/ks6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:D


# direct methods
.method public synthetic constructor <init>(DB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ks6;->a:B

    iput-wide p1, p0, La/ks6;->b:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ks6;->a:B

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    check-cast v7, La/a820;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iget-object v1, v8, La/pvj0;->a:La/bx6;

    .line 31
    .line 32
    iget-object v9, v1, La/bx6;->b:La/tw6;

    .line 33
    .line 34
    const/16 v29, 0x0

    .line 35
    .line 36
    const v30, 0xfffe

    .line 37
    .line 38
    .line 39
    iget-wide v10, v0, La/ks6;->b:D

    .line 40
    .line 41
    const-wide/16 v12, 0x0

    .line 42
    .line 43
    const-wide/16 v14, 0x0

    .line 44
    .line 45
    const-wide/16 v16, 0x0

    .line 46
    .line 47
    const-wide/16 v18, 0x0

    .line 48
    .line 49
    const/16 v20, 0x0

    .line 50
    .line 51
    const/16 v21, 0x0

    .line 52
    .line 53
    const/16 v22, 0x0

    .line 54
    .line 55
    const/16 v23, 0x0

    .line 56
    .line 57
    const/16 v24, 0x0

    .line 58
    .line 59
    const/16 v25, 0x0

    .line 60
    .line 61
    const/16 v26, 0x0

    .line 62
    .line 63
    const/16 v27, 0x0

    .line 64
    .line 65
    const/16 v28, 0x0

    .line 66
    .line 67
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v1, v6, v0, v4, v3}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    const/4 v14, 0x0

    .line 76
    const/16 v15, 0x3e

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v13, 0x0

    .line 82
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const v24, 0x3ffef

    .line 89
    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const/4 v15, 0x0

    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const/16 v19, 0x0

    .line 102
    .line 103
    const/16 v20, 0x0

    .line 104
    .line 105
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :pswitch_0
    move-object/from16 v1, p1

    .line 111
    .line 112
    check-cast v1, La/oyg0;

    .line 113
    .line 114
    move-object/from16 v7, p2

    .line 115
    .line 116
    check-cast v7, La/sg20;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v8, v7, La/sg20;->e:La/qvj0;

    .line 125
    .line 126
    iget-object v1, v8, La/qvj0;->a:La/cx6;

    .line 127
    .line 128
    iget-object v9, v1, La/cx6;->b:La/uw6;

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    const/16 v25, 0x3ffe

    .line 133
    .line 134
    iget-wide v10, v0, La/ks6;->b:D

    .line 135
    .line 136
    const-wide/16 v12, 0x0

    .line 137
    .line 138
    const-wide/16 v14, 0x0

    .line 139
    .line 140
    const-wide/16 v16, 0x0

    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    const/16 v20, 0x0

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const/16 v22, 0x0

    .line 151
    .line 152
    const/16 v23, 0x0

    .line 153
    .line 154
    invoke-static/range {v9 .. v25}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v1, v6, v0, v5}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    const/4 v12, 0x0

    .line 163
    const/16 v13, 0x1e

    .line 164
    .line 165
    const/4 v10, 0x0

    .line 166
    const/4 v11, 0x0

    .line 167
    invoke-static/range {v8 .. v13}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    const/16 v16, 0x0

    .line 172
    .line 173
    const/16 v17, 0x7ef

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v13, 0x0

    .line 178
    const/4 v14, 0x0

    .line 179
    const/4 v15, 0x0

    .line 180
    invoke-static/range {v7 .. v17}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    return-object v0

    .line 185
    :pswitch_1
    move-object/from16 v1, p1

    .line 186
    .line 187
    check-cast v1, La/oyg0;

    .line 188
    .line 189
    move-object/from16 v7, p2

    .line 190
    .line 191
    check-cast v7, La/a820;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 200
    .line 201
    iget-object v1, v8, La/pvj0;->a:La/bx6;

    .line 202
    .line 203
    iget-object v9, v1, La/bx6;->b:La/tw6;

    .line 204
    .line 205
    const/16 v29, 0x0

    .line 206
    .line 207
    const v30, 0xfffc

    .line 208
    .line 209
    .line 210
    iget-wide v10, v0, La/ks6;->b:D

    .line 211
    .line 212
    const-wide/16 v14, 0x0

    .line 213
    .line 214
    const-wide/16 v16, 0x0

    .line 215
    .line 216
    const-wide/16 v18, 0x0

    .line 217
    .line 218
    const/16 v20, 0x0

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const/16 v23, 0x0

    .line 225
    .line 226
    const/16 v24, 0x0

    .line 227
    .line 228
    const/16 v25, 0x0

    .line 229
    .line 230
    const/16 v26, 0x0

    .line 231
    .line 232
    const/16 v27, 0x0

    .line 233
    .line 234
    const/16 v28, 0x0

    .line 235
    .line 236
    move-wide v12, v10

    .line 237
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v1, v6, v0, v4, v3}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    const/4 v14, 0x0

    .line 246
    const/16 v15, 0x3e

    .line 247
    .line 248
    const/4 v10, 0x0

    .line 249
    const/4 v11, 0x0

    .line 250
    const/4 v12, 0x0

    .line 251
    const/4 v13, 0x0

    .line 252
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    const/16 v23, 0x0

    .line 257
    .line 258
    const v24, 0x3ffef

    .line 259
    .line 260
    .line 261
    const/4 v8, 0x0

    .line 262
    const/4 v9, 0x0

    .line 263
    const/4 v14, 0x0

    .line 264
    const/4 v15, 0x0

    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const/16 v18, 0x0

    .line 270
    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    const/16 v20, 0x0

    .line 274
    .line 275
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0

    .line 280
    :pswitch_2
    move-object/from16 v1, p1

    .line 281
    .line 282
    check-cast v1, La/oyg0;

    .line 283
    .line 284
    move-object/from16 v7, p2

    .line 285
    .line 286
    check-cast v7, La/sg20;

    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v8, v7, La/sg20;->e:La/qvj0;

    .line 295
    .line 296
    iget-object v1, v8, La/qvj0;->a:La/cx6;

    .line 297
    .line 298
    iget-object v9, v1, La/cx6;->b:La/uw6;

    .line 299
    .line 300
    const/16 v24, 0x0

    .line 301
    .line 302
    const/16 v25, 0x3ffe

    .line 303
    .line 304
    iget-wide v10, v0, La/ks6;->b:D

    .line 305
    .line 306
    const-wide/16 v12, 0x0

    .line 307
    .line 308
    const-wide/16 v14, 0x0

    .line 309
    .line 310
    const-wide/16 v16, 0x0

    .line 311
    .line 312
    const/16 v18, 0x0

    .line 313
    .line 314
    const/16 v19, 0x0

    .line 315
    .line 316
    const/16 v20, 0x0

    .line 317
    .line 318
    const/16 v21, 0x0

    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const/16 v23, 0x0

    .line 323
    .line 324
    invoke-static/range {v9 .. v25}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v1, v6, v0, v5}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    const/4 v12, 0x0

    .line 333
    const/16 v13, 0x1e

    .line 334
    .line 335
    const/4 v10, 0x0

    .line 336
    const/4 v11, 0x0

    .line 337
    invoke-static/range {v8 .. v13}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 338
    .line 339
    .line 340
    move-result-object v11

    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0x7ef

    .line 344
    .line 345
    const/4 v8, 0x0

    .line 346
    const/4 v9, 0x0

    .line 347
    const/4 v13, 0x0

    .line 348
    const/4 v14, 0x0

    .line 349
    const/4 v15, 0x0

    .line 350
    invoke-static/range {v7 .. v17}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    return-object v0

    .line 355
    :pswitch_3
    move-object/from16 v1, p1

    .line 356
    .line 357
    check-cast v1, La/oyg0;

    .line 358
    .line 359
    move-object/from16 v7, p2

    .line 360
    .line 361
    check-cast v7, La/a820;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 370
    .line 371
    iget-object v1, v8, La/pvj0;->a:La/bx6;

    .line 372
    .line 373
    iget-object v9, v1, La/bx6;->b:La/tw6;

    .line 374
    .line 375
    const/16 v29, 0x0

    .line 376
    .line 377
    const v30, 0xfffe

    .line 378
    .line 379
    .line 380
    iget-wide v10, v0, La/ks6;->b:D

    .line 381
    .line 382
    const-wide/16 v12, 0x0

    .line 383
    .line 384
    const-wide/16 v14, 0x0

    .line 385
    .line 386
    const-wide/16 v16, 0x0

    .line 387
    .line 388
    const-wide/16 v18, 0x0

    .line 389
    .line 390
    const/16 v20, 0x0

    .line 391
    .line 392
    const/16 v21, 0x0

    .line 393
    .line 394
    const/16 v22, 0x0

    .line 395
    .line 396
    const/16 v23, 0x0

    .line 397
    .line 398
    const/16 v24, 0x0

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v28, 0x0

    .line 407
    .line 408
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-static {v1, v6, v0, v4, v3}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    const/4 v14, 0x0

    .line 417
    const/16 v15, 0x3e

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    const/4 v11, 0x0

    .line 421
    const/4 v12, 0x0

    .line 422
    const/4 v13, 0x0

    .line 423
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    const/16 v23, 0x0

    .line 428
    .line 429
    const v24, 0x3ffef

    .line 430
    .line 431
    .line 432
    const/4 v8, 0x0

    .line 433
    const/4 v9, 0x0

    .line 434
    const/4 v14, 0x0

    .line 435
    const/4 v15, 0x0

    .line 436
    const/16 v16, 0x0

    .line 437
    .line 438
    const/16 v17, 0x0

    .line 439
    .line 440
    const/16 v18, 0x0

    .line 441
    .line 442
    const/16 v19, 0x0

    .line 443
    .line 444
    const/16 v20, 0x0

    .line 445
    .line 446
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    return-object v0

    .line 451
    :pswitch_4
    move-object/from16 v1, p1

    .line 452
    .line 453
    check-cast v1, La/oyg0;

    .line 454
    .line 455
    move-object/from16 v7, p2

    .line 456
    .line 457
    check-cast v7, La/b820;

    .line 458
    .line 459
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object v8, v7, La/b820;->d:La/rvj0;

    .line 466
    .line 467
    iget-object v1, v8, La/rvj0;->a:La/dx6;

    .line 468
    .line 469
    iget-object v9, v1, La/dx6;->b:La/vw6;

    .line 470
    .line 471
    const/16 v27, 0x0

    .line 472
    .line 473
    const v28, 0xfffe

    .line 474
    .line 475
    .line 476
    iget-wide v10, v0, La/ks6;->b:D

    .line 477
    .line 478
    const-wide/16 v12, 0x0

    .line 479
    .line 480
    const-wide/16 v14, 0x0

    .line 481
    .line 482
    const-wide/16 v16, 0x0

    .line 483
    .line 484
    const-wide/16 v18, 0x0

    .line 485
    .line 486
    const/16 v20, 0x0

    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const/16 v23, 0x0

    .line 493
    .line 494
    const/16 v24, 0x0

    .line 495
    .line 496
    const/16 v25, 0x0

    .line 497
    .line 498
    const/16 v26, 0x0

    .line 499
    .line 500
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v1, v6, v0, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    const/4 v13, 0x0

    .line 509
    const/16 v14, 0x1e

    .line 510
    .line 511
    const/4 v10, 0x0

    .line 512
    const/4 v11, 0x0

    .line 513
    const/4 v12, 0x0

    .line 514
    invoke-static/range {v8 .. v14}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    const/16 v19, 0x0

    .line 519
    .line 520
    const/16 v20, 0x1ff7

    .line 521
    .line 522
    const/4 v8, 0x0

    .line 523
    const/4 v9, 0x0

    .line 524
    const/4 v14, 0x0

    .line 525
    const/4 v15, 0x0

    .line 526
    const/16 v16, 0x0

    .line 527
    .line 528
    const/16 v17, 0x0

    .line 529
    .line 530
    const/16 v18, 0x0

    .line 531
    .line 532
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    return-object v0

    .line 537
    :pswitch_5
    move-object/from16 v1, p1

    .line 538
    .line 539
    check-cast v1, La/oyg0;

    .line 540
    .line 541
    move-object/from16 v7, p2

    .line 542
    .line 543
    check-cast v7, La/b820;

    .line 544
    .line 545
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    iget-object v8, v7, La/b820;->d:La/rvj0;

    .line 552
    .line 553
    iget-object v1, v8, La/rvj0;->a:La/dx6;

    .line 554
    .line 555
    iget-object v9, v1, La/dx6;->b:La/vw6;

    .line 556
    .line 557
    const/16 v27, 0x0

    .line 558
    .line 559
    const v28, 0xfffe

    .line 560
    .line 561
    .line 562
    iget-wide v10, v0, La/ks6;->b:D

    .line 563
    .line 564
    const-wide/16 v12, 0x0

    .line 565
    .line 566
    const-wide/16 v14, 0x0

    .line 567
    .line 568
    const-wide/16 v16, 0x0

    .line 569
    .line 570
    const-wide/16 v18, 0x0

    .line 571
    .line 572
    const/16 v20, 0x0

    .line 573
    .line 574
    const/16 v21, 0x0

    .line 575
    .line 576
    const/16 v22, 0x0

    .line 577
    .line 578
    const/16 v23, 0x0

    .line 579
    .line 580
    const/16 v24, 0x0

    .line 581
    .line 582
    const/16 v25, 0x0

    .line 583
    .line 584
    const/16 v26, 0x0

    .line 585
    .line 586
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v1, v6, v0, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    const/4 v13, 0x0

    .line 595
    const/16 v14, 0x1e

    .line 596
    .line 597
    const/4 v10, 0x0

    .line 598
    const/4 v11, 0x0

    .line 599
    const/4 v12, 0x0

    .line 600
    invoke-static/range {v8 .. v14}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 601
    .line 602
    .line 603
    move-result-object v11

    .line 604
    const/16 v19, 0x0

    .line 605
    .line 606
    const/16 v20, 0x1ff7

    .line 607
    .line 608
    const/4 v8, 0x0

    .line 609
    const/4 v9, 0x0

    .line 610
    const/4 v14, 0x0

    .line 611
    const/4 v15, 0x0

    .line 612
    const/16 v16, 0x0

    .line 613
    .line 614
    const/16 v17, 0x0

    .line 615
    .line 616
    const/16 v18, 0x0

    .line 617
    .line 618
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    return-object v0

    .line 623
    :pswitch_6
    move-object/from16 v1, p1

    .line 624
    .line 625
    check-cast v1, La/oyg0;

    .line 626
    .line 627
    move-object/from16 v7, p2

    .line 628
    .line 629
    check-cast v7, La/b820;

    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    iget-object v8, v7, La/b820;->d:La/rvj0;

    .line 638
    .line 639
    iget-object v1, v8, La/rvj0;->a:La/dx6;

    .line 640
    .line 641
    iget-object v9, v1, La/dx6;->b:La/vw6;

    .line 642
    .line 643
    const/16 v27, 0x0

    .line 644
    .line 645
    const v28, 0xfffe

    .line 646
    .line 647
    .line 648
    iget-wide v10, v0, La/ks6;->b:D

    .line 649
    .line 650
    const-wide/16 v12, 0x0

    .line 651
    .line 652
    const-wide/16 v14, 0x0

    .line 653
    .line 654
    const-wide/16 v16, 0x0

    .line 655
    .line 656
    const-wide/16 v18, 0x0

    .line 657
    .line 658
    const/16 v20, 0x0

    .line 659
    .line 660
    const/16 v21, 0x0

    .line 661
    .line 662
    const/16 v22, 0x0

    .line 663
    .line 664
    const/16 v23, 0x0

    .line 665
    .line 666
    const/16 v24, 0x0

    .line 667
    .line 668
    const/16 v25, 0x0

    .line 669
    .line 670
    const/16 v26, 0x0

    .line 671
    .line 672
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-static {v1, v6, v0, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 677
    .line 678
    .line 679
    move-result-object v9

    .line 680
    const/4 v13, 0x0

    .line 681
    const/16 v14, 0x1e

    .line 682
    .line 683
    const/4 v10, 0x0

    .line 684
    const/4 v11, 0x0

    .line 685
    const/4 v12, 0x0

    .line 686
    invoke-static/range {v8 .. v14}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 687
    .line 688
    .line 689
    move-result-object v11

    .line 690
    const/16 v19, 0x0

    .line 691
    .line 692
    const/16 v20, 0x1ff7

    .line 693
    .line 694
    const/4 v8, 0x0

    .line 695
    const/4 v9, 0x0

    .line 696
    const/4 v14, 0x0

    .line 697
    const/4 v15, 0x0

    .line 698
    const/16 v16, 0x0

    .line 699
    .line 700
    const/16 v17, 0x0

    .line 701
    .line 702
    const/16 v18, 0x0

    .line 703
    .line 704
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    return-object v0

    .line 709
    :pswitch_7
    move-object/from16 v1, p1

    .line 710
    .line 711
    check-cast v1, La/oyg0;

    .line 712
    .line 713
    move-object/from16 v7, p2

    .line 714
    .line 715
    check-cast v7, La/sg20;

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    iget-object v8, v7, La/sg20;->e:La/qvj0;

    .line 724
    .line 725
    iget-object v1, v8, La/qvj0;->a:La/cx6;

    .line 726
    .line 727
    iget-object v9, v1, La/cx6;->b:La/uw6;

    .line 728
    .line 729
    const/16 v24, 0x0

    .line 730
    .line 731
    const/16 v25, 0x3ffe

    .line 732
    .line 733
    iget-wide v10, v0, La/ks6;->b:D

    .line 734
    .line 735
    const-wide/16 v12, 0x0

    .line 736
    .line 737
    const-wide/16 v14, 0x0

    .line 738
    .line 739
    const-wide/16 v16, 0x0

    .line 740
    .line 741
    const/16 v18, 0x0

    .line 742
    .line 743
    const/16 v19, 0x0

    .line 744
    .line 745
    const/16 v20, 0x0

    .line 746
    .line 747
    const/16 v21, 0x0

    .line 748
    .line 749
    const/16 v22, 0x0

    .line 750
    .line 751
    const/16 v23, 0x0

    .line 752
    .line 753
    invoke-static/range {v9 .. v25}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-static {v1, v6, v0, v5}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 758
    .line 759
    .line 760
    move-result-object v9

    .line 761
    const/4 v12, 0x0

    .line 762
    const/16 v13, 0x1e

    .line 763
    .line 764
    const/4 v10, 0x0

    .line 765
    const/4 v11, 0x0

    .line 766
    invoke-static/range {v8 .. v13}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 767
    .line 768
    .line 769
    move-result-object v11

    .line 770
    const/16 v16, 0x0

    .line 771
    .line 772
    const/16 v17, 0x7ef

    .line 773
    .line 774
    const/4 v8, 0x0

    .line 775
    const/4 v9, 0x0

    .line 776
    const/4 v13, 0x0

    .line 777
    const/4 v14, 0x0

    .line 778
    const/4 v15, 0x0

    .line 779
    invoke-static/range {v7 .. v17}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    return-object v0

    .line 784
    :pswitch_8
    move-object/from16 v1, p1

    .line 785
    .line 786
    check-cast v1, La/oyg0;

    .line 787
    .line 788
    move-object/from16 v7, p2

    .line 789
    .line 790
    check-cast v7, La/a820;

    .line 791
    .line 792
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    iget-object v8, v7, La/a820;->e:La/pvj0;

    .line 799
    .line 800
    iget-object v1, v8, La/pvj0;->a:La/bx6;

    .line 801
    .line 802
    iget-object v9, v1, La/bx6;->b:La/tw6;

    .line 803
    .line 804
    const/16 v29, 0x0

    .line 805
    .line 806
    const v30, 0xfffe

    .line 807
    .line 808
    .line 809
    iget-wide v10, v0, La/ks6;->b:D

    .line 810
    .line 811
    const-wide/16 v12, 0x0

    .line 812
    .line 813
    const-wide/16 v14, 0x0

    .line 814
    .line 815
    const-wide/16 v16, 0x0

    .line 816
    .line 817
    const-wide/16 v18, 0x0

    .line 818
    .line 819
    const/16 v20, 0x0

    .line 820
    .line 821
    const/16 v21, 0x0

    .line 822
    .line 823
    const/16 v22, 0x0

    .line 824
    .line 825
    const/16 v23, 0x0

    .line 826
    .line 827
    const/16 v24, 0x0

    .line 828
    .line 829
    const/16 v25, 0x0

    .line 830
    .line 831
    const/16 v26, 0x0

    .line 832
    .line 833
    const/16 v27, 0x0

    .line 834
    .line 835
    const/16 v28, 0x0

    .line 836
    .line 837
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-static {v1, v6, v0, v4, v3}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    const/4 v14, 0x0

    .line 846
    const/16 v15, 0x3e

    .line 847
    .line 848
    const/4 v10, 0x0

    .line 849
    const/4 v11, 0x0

    .line 850
    const/4 v12, 0x0

    .line 851
    const/4 v13, 0x0

    .line 852
    invoke-static/range {v8 .. v15}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 853
    .line 854
    .line 855
    move-result-object v11

    .line 856
    const/16 v23, 0x0

    .line 857
    .line 858
    const v24, 0x3ffef

    .line 859
    .line 860
    .line 861
    const/4 v8, 0x0

    .line 862
    const/4 v9, 0x0

    .line 863
    const/4 v14, 0x0

    .line 864
    const/4 v15, 0x0

    .line 865
    const/16 v16, 0x0

    .line 866
    .line 867
    const/16 v17, 0x0

    .line 868
    .line 869
    const/16 v18, 0x0

    .line 870
    .line 871
    const/16 v19, 0x0

    .line 872
    .line 873
    const/16 v20, 0x0

    .line 874
    .line 875
    invoke-static/range {v7 .. v24}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    return-object v0

    .line 880
    :pswitch_9
    move-object/from16 v1, p1

    .line 881
    .line 882
    check-cast v1, La/oyg0;

    .line 883
    .line 884
    move-object/from16 v7, p2

    .line 885
    .line 886
    check-cast v7, La/c820;

    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    iget-object v1, v7, La/c820;->d:La/svj0;

    .line 895
    .line 896
    iget-object v3, v1, La/svj0;->a:La/ex6;

    .line 897
    .line 898
    iget-object v8, v3, La/ex6;->b:La/ww6;

    .line 899
    .line 900
    const/16 v23, 0x0

    .line 901
    .line 902
    const/16 v24, 0x3ffe

    .line 903
    .line 904
    iget-wide v9, v0, La/ks6;->b:D

    .line 905
    .line 906
    const-wide/16 v11, 0x0

    .line 907
    .line 908
    const-wide/16 v13, 0x0

    .line 909
    .line 910
    const-wide/16 v15, 0x0

    .line 911
    .line 912
    const-wide/16 v17, 0x0

    .line 913
    .line 914
    const/16 v19, 0x0

    .line 915
    .line 916
    const/16 v20, 0x0

    .line 917
    .line 918
    const/16 v21, 0x0

    .line 919
    .line 920
    const/16 v22, 0x0

    .line 921
    .line 922
    invoke-static/range {v8 .. v24}, La/ww6;->a(La/ww6;DDDDDLjava/lang/String;ZLa/qz4;ZZI)La/ww6;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-static {v3, v6, v0, v5}, La/ex6;->a(La/ex6;La/a8q0;La/ww6;I)La/ex6;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    invoke-static {v1, v0, v6, v6, v2}, La/svj0;->a(La/svj0;La/ex6;La/nnb0;La/lwo0;I)La/svj0;

    .line 931
    .line 932
    .line 933
    move-result-object v11

    .line 934
    const/16 v18, 0x0

    .line 935
    .line 936
    const/16 v19, 0x1ff7

    .line 937
    .line 938
    const/4 v8, 0x0

    .line 939
    const/4 v9, 0x0

    .line 940
    const/4 v10, 0x0

    .line 941
    const/4 v12, 0x0

    .line 942
    const/4 v13, 0x0

    .line 943
    const/4 v14, 0x0

    .line 944
    const/4 v15, 0x0

    .line 945
    const/16 v16, 0x0

    .line 946
    .line 947
    const/16 v17, 0x0

    .line 948
    .line 949
    invoke-static/range {v7 .. v19}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    return-object v0

    .line 954
    :pswitch_a
    move-object/from16 v1, p1

    .line 955
    .line 956
    check-cast v1, La/oyg0;

    .line 957
    .line 958
    move-object/from16 v7, p2

    .line 959
    .line 960
    check-cast v7, La/c820;

    .line 961
    .line 962
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    iget-object v1, v7, La/c820;->d:La/svj0;

    .line 969
    .line 970
    iget-object v3, v1, La/svj0;->a:La/ex6;

    .line 971
    .line 972
    iget-object v8, v3, La/ex6;->b:La/ww6;

    .line 973
    .line 974
    const/16 v23, 0x0

    .line 975
    .line 976
    const/16 v24, 0x3ffe

    .line 977
    .line 978
    iget-wide v9, v0, La/ks6;->b:D

    .line 979
    .line 980
    const-wide/16 v11, 0x0

    .line 981
    .line 982
    const-wide/16 v13, 0x0

    .line 983
    .line 984
    const-wide/16 v15, 0x0

    .line 985
    .line 986
    const-wide/16 v17, 0x0

    .line 987
    .line 988
    const/16 v19, 0x0

    .line 989
    .line 990
    const/16 v20, 0x0

    .line 991
    .line 992
    const/16 v21, 0x0

    .line 993
    .line 994
    const/16 v22, 0x0

    .line 995
    .line 996
    invoke-static/range {v8 .. v24}, La/ww6;->a(La/ww6;DDDDDLjava/lang/String;ZLa/qz4;ZZI)La/ww6;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    invoke-static {v3, v6, v0, v5}, La/ex6;->a(La/ex6;La/a8q0;La/ww6;I)La/ex6;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    invoke-static {v1, v0, v6, v6, v2}, La/svj0;->a(La/svj0;La/ex6;La/nnb0;La/lwo0;I)La/svj0;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v11

    .line 1008
    const/16 v18, 0x0

    .line 1009
    .line 1010
    const/16 v19, 0x1ff7

    .line 1011
    .line 1012
    const/4 v8, 0x0

    .line 1013
    const/4 v9, 0x0

    .line 1014
    const/4 v10, 0x0

    .line 1015
    const/4 v12, 0x0

    .line 1016
    const/4 v13, 0x0

    .line 1017
    const/4 v14, 0x0

    .line 1018
    const/4 v15, 0x0

    .line 1019
    const/16 v16, 0x0

    .line 1020
    .line 1021
    const/16 v17, 0x0

    .line 1022
    .line 1023
    invoke-static/range {v7 .. v19}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    return-object v0

    .line 1028
    :pswitch_b
    move-object/from16 v1, p1

    .line 1029
    .line 1030
    check-cast v1, La/oyg0;

    .line 1031
    .line 1032
    move-object/from16 v7, p2

    .line 1033
    .line 1034
    check-cast v7, La/c820;

    .line 1035
    .line 1036
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    iget-object v1, v7, La/c820;->d:La/svj0;

    .line 1043
    .line 1044
    iget-object v3, v1, La/svj0;->a:La/ex6;

    .line 1045
    .line 1046
    iget-object v8, v3, La/ex6;->b:La/ww6;

    .line 1047
    .line 1048
    const/16 v23, 0x0

    .line 1049
    .line 1050
    const/16 v24, 0x3ffe

    .line 1051
    .line 1052
    iget-wide v9, v0, La/ks6;->b:D

    .line 1053
    .line 1054
    const-wide/16 v11, 0x0

    .line 1055
    .line 1056
    const-wide/16 v13, 0x0

    .line 1057
    .line 1058
    const-wide/16 v15, 0x0

    .line 1059
    .line 1060
    const-wide/16 v17, 0x0

    .line 1061
    .line 1062
    const/16 v19, 0x0

    .line 1063
    .line 1064
    const/16 v20, 0x0

    .line 1065
    .line 1066
    const/16 v21, 0x0

    .line 1067
    .line 1068
    const/16 v22, 0x0

    .line 1069
    .line 1070
    invoke-static/range {v8 .. v24}, La/ww6;->a(La/ww6;DDDDDLjava/lang/String;ZLa/qz4;ZZI)La/ww6;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-static {v3, v6, v0, v5}, La/ex6;->a(La/ex6;La/a8q0;La/ww6;I)La/ex6;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-static {v1, v0, v6, v6, v2}, La/svj0;->a(La/svj0;La/ex6;La/nnb0;La/lwo0;I)La/svj0;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v11

    .line 1082
    const/16 v18, 0x0

    .line 1083
    .line 1084
    const/16 v19, 0x1ff7

    .line 1085
    .line 1086
    const/4 v8, 0x0

    .line 1087
    const/4 v9, 0x0

    .line 1088
    const/4 v10, 0x0

    .line 1089
    const/4 v12, 0x0

    .line 1090
    const/4 v13, 0x0

    .line 1091
    const/4 v14, 0x0

    .line 1092
    const/4 v15, 0x0

    .line 1093
    const/16 v16, 0x0

    .line 1094
    .line 1095
    const/16 v17, 0x0

    .line 1096
    .line 1097
    invoke-static/range {v7 .. v19}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    return-object v0

    .line 1102
    nop

    .line 1103
    :pswitch_data_0
    .packed-switch 0x0
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
