.class public final synthetic La/yc7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kd7;


# direct methods
.method public synthetic constructor <init>(La/kd7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yc7;->a:B

    iput-object p1, p0, La/yc7;->b:La/kd7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yc7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v0, v0, La/yc7;->b:La/kd7;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Throwable;

    .line 17
    .line 18
    sget-object v2, La/kd7;->m0:Ljava/util/List;

    .line 19
    .line 20
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, La/rc7;

    .line 33
    .line 34
    const-wide/16 v19, 0x0

    .line 35
    .line 36
    const v21, 0xffffffe

    .line 37
    .line 38
    .line 39
    sget-object v5, La/p9x;->a:La/p9x;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v14, 0x0

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const-wide/16 v17, 0x0

    .line 54
    .line 55
    invoke-static/range {v4 .. v21}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    invoke-virtual {v0, v1}, La/kd7;->N(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    move-object/from16 v1, p1

    .line 72
    .line 73
    check-cast v1, Ljava/lang/Throwable;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 79
    .line 80
    new-instance v3, La/zc7;

    .line 81
    .line 82
    const/4 v4, 0x4

    .line 83
    invoke-direct {v3, v0, v4}, La/zc7;-><init>(La/kd7;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    move-object/from16 v1, p1

    .line 93
    .line 94
    check-cast v1, Ljava/lang/Throwable;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 100
    .line 101
    new-instance v4, La/zc7;

    .line 102
    .line 103
    invoke-direct {v4, v0, v3}, La/zc7;-><init>(La/kd7;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_2
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
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 120
    .line 121
    new-instance v3, La/zc7;

    .line 122
    .line 123
    invoke-direct {v3, v0, v5}, La/zc7;-><init>(La/kd7;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_3
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, Ljava/lang/Throwable;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 140
    .line 141
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 142
    .line 143
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 151
    .line 152
    move-object v6, v2

    .line 153
    check-cast v6, La/rc7;

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    const-wide/16 v21, 0x0

    .line 159
    .line 160
    const v23, 0xff7ffff

    .line 161
    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    const/4 v8, 0x0

    .line 165
    const/4 v9, 0x0

    .line 166
    const/4 v10, 0x0

    .line 167
    const/4 v11, 0x0

    .line 168
    const/4 v12, 0x0

    .line 169
    const/4 v13, 0x0

    .line 170
    const/4 v14, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const/16 v18, 0x0

    .line 177
    .line 178
    const-wide/16 v19, 0x0

    .line 179
    .line 180
    invoke-static/range {v6 .. v23}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_1

    .line 189
    .line 190
    new-instance v1, La/kc7;

    .line 191
    .line 192
    new-instance v6, La/xdk0;

    .line 193
    .line 194
    sget-object v7, La/rek0;->b:La/rek0;

    .line 195
    .line 196
    iget-object v2, v0, La/kd7;->s:La/ctf0;

    .line 197
    .line 198
    new-array v3, v4, [Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v8, v2, La/ctf0;->b:La/lsm0;

    .line 201
    .line 202
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const v4, 0x7f13123c

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    iget-object v3, v0, La/kd7;->o:Ljava/lang/String;

    .line 214
    .line 215
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 220
    .line 221
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    const v4, 0x7f1309d9

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    const/4 v12, 0x0

    .line 233
    const/16 v13, 0x78

    .line 234
    .line 235
    const/4 v10, 0x0

    .line 236
    const/4 v11, 0x0

    .line 237
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 238
    .line 239
    .line 240
    invoke-direct {v1, v6}, La/kc7;-><init>(La/xdk0;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_4
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, Ljava/lang/Throwable;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 257
    .line 258
    iget-object v3, v2, La/ocj;->a:La/p7m0;

    .line 259
    .line 260
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 268
    .line 269
    move-object v5, v2

    .line 270
    check-cast v5, La/rc7;

    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    const-wide/16 v20, 0x0

    .line 276
    .line 277
    const v22, 0xffffffe

    .line 278
    .line 279
    .line 280
    sget-object v6, La/p9x;->a:La/p9x;

    .line 281
    .line 282
    const/4 v7, 0x0

    .line 283
    const/4 v8, 0x0

    .line 284
    const/4 v9, 0x0

    .line 285
    const/4 v10, 0x0

    .line 286
    const/4 v11, 0x0

    .line 287
    const/4 v12, 0x0

    .line 288
    const/4 v13, 0x0

    .line 289
    const/4 v14, 0x0

    .line 290
    const/4 v15, 0x0

    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    const/16 v17, 0x0

    .line 294
    .line 295
    const-wide/16 v18, 0x0

    .line 296
    .line 297
    invoke-static/range {v5 .. v22}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v3, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_2

    .line 306
    .line 307
    invoke-virtual {v0, v1}, La/kd7;->N(Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_5
    move-object/from16 v1, p1

    .line 314
    .line 315
    check-cast v1, Ljava/lang/Throwable;

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    iget-object v0, v0, La/kd7;->f0:La/duj;

    .line 321
    .line 322
    new-instance v3, La/i87;

    .line 323
    .line 324
    invoke-direct {v3, v2}, La/i87;-><init>(B)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 328
    .line 329
    .line 330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_6
    move-object/from16 v1, p1

    .line 334
    .line 335
    check-cast v1, Ljava/lang/Throwable;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 341
    .line 342
    new-instance v3, La/zc7;

    .line 343
    .line 344
    invoke-direct {v3, v0, v4}, La/zc7;-><init>(La/kd7;B)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 348
    .line 349
    .line 350
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 351
    .line 352
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 353
    .line 354
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 362
    .line 363
    move-object v4, v2

    .line 364
    check-cast v4, La/rc7;

    .line 365
    .line 366
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    const-wide/16 v19, 0x0

    .line 370
    .line 371
    const v21, 0xff7ffff

    .line 372
    .line 373
    .line 374
    const/4 v5, 0x0

    .line 375
    const/4 v6, 0x0

    .line 376
    const/4 v7, 0x0

    .line 377
    const/4 v8, 0x0

    .line 378
    const/4 v9, 0x0

    .line 379
    const/4 v10, 0x0

    .line 380
    const/4 v11, 0x0

    .line 381
    const/4 v12, 0x0

    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v14, 0x0

    .line 384
    const/4 v15, 0x0

    .line 385
    const/16 v16, 0x0

    .line 386
    .line 387
    const-wide/16 v17, 0x0

    .line 388
    .line 389
    invoke-static/range {v4 .. v21}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-eqz v2, :cond_3

    .line 398
    .line 399
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_7
    move-object/from16 v1, p1

    .line 403
    .line 404
    check-cast v1, Ljava/lang/Throwable;

    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v3, v0, La/kd7;->f0:La/duj;

    .line 410
    .line 411
    new-instance v4, La/zc7;

    .line 412
    .line 413
    invoke-direct {v4, v0, v2}, La/zc7;-><init>(La/kd7;B)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 417
    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_8
    move-object/from16 v1, p1

    .line 423
    .line 424
    check-cast v1, Ljava/lang/Throwable;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 430
    .line 431
    new-instance v4, La/zc7;

    .line 432
    .line 433
    invoke-direct {v4, v0, v3}, La/zc7;-><init>(La/kd7;B)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 437
    .line 438
    .line 439
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    return-object v0

    .line 442
    :pswitch_9
    move-object/from16 v1, p1

    .line 443
    .line 444
    check-cast v1, Ljava/lang/Throwable;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 450
    .line 451
    new-instance v3, La/ad7;

    .line 452
    .line 453
    invoke-direct {v3, v1, v0, v4}, La/ad7;-><init>(Ljava/lang/Throwable;La/kd7;B)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 457
    .line 458
    .line 459
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    :pswitch_a
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, Ljava/lang/Throwable;

    .line 465
    .line 466
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    instance-of v2, v1, La/zhi0;

    .line 470
    .line 471
    if-eqz v2, :cond_4

    .line 472
    .line 473
    iget-object v2, v0, La/kd7;->O:La/nj7;

    .line 474
    .line 475
    move-object v3, v1

    .line 476
    check-cast v3, La/zhi0;

    .line 477
    .line 478
    iget-object v3, v3, La/zhi0;->c:La/kuw;

    .line 479
    .line 480
    invoke-interface {v3}, La/kuw;->getErrorCode()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    invoke-virtual {v2, v3}, La/nj7;->b(I)V

    .line 485
    .line 486
    .line 487
    :cond_4
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 488
    .line 489
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 490
    .line 491
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 499
    .line 500
    move-object v6, v3

    .line 501
    check-cast v6, La/rc7;

    .line 502
    .line 503
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    const-wide/16 v21, 0x0

    .line 507
    .line 508
    const v23, 0xff7ffff

    .line 509
    .line 510
    .line 511
    const/4 v7, 0x0

    .line 512
    const/4 v8, 0x0

    .line 513
    const/4 v9, 0x0

    .line 514
    const/4 v10, 0x0

    .line 515
    const/4 v11, 0x0

    .line 516
    const/4 v12, 0x0

    .line 517
    const/4 v13, 0x0

    .line 518
    const/4 v14, 0x0

    .line 519
    const/4 v15, 0x0

    .line 520
    const/16 v16, 0x0

    .line 521
    .line 522
    const/16 v17, 0x0

    .line 523
    .line 524
    const/16 v18, 0x0

    .line 525
    .line 526
    const-wide/16 v19, 0x0

    .line 527
    .line 528
    invoke-static/range {v6 .. v23}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-eqz v3, :cond_5

    .line 537
    .line 538
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 539
    .line 540
    new-instance v3, La/ad7;

    .line 541
    .line 542
    invoke-direct {v3, v1, v0, v5}, La/ad7;-><init>(Ljava/lang/Throwable;La/kd7;B)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 546
    .line 547
    .line 548
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 549
    .line 550
    return-object v0

    .line 551
    :pswitch_b
    move-object/from16 v1, p1

    .line 552
    .line 553
    check-cast v1, Ljava/lang/Throwable;

    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 559
    .line 560
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 561
    .line 562
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v3

    .line 566
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 570
    .line 571
    move-object v5, v3

    .line 572
    check-cast v5, La/rc7;

    .line 573
    .line 574
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    const-wide/16 v20, 0x0

    .line 578
    .line 579
    const v22, 0xff7ffff

    .line 580
    .line 581
    .line 582
    const/4 v6, 0x0

    .line 583
    const/4 v7, 0x0

    .line 584
    const/4 v8, 0x0

    .line 585
    const/4 v9, 0x0

    .line 586
    const/4 v10, 0x0

    .line 587
    const/4 v11, 0x0

    .line 588
    const/4 v12, 0x0

    .line 589
    const/4 v13, 0x0

    .line 590
    const/4 v14, 0x0

    .line 591
    const/4 v15, 0x0

    .line 592
    const/16 v16, 0x0

    .line 593
    .line 594
    const/16 v17, 0x0

    .line 595
    .line 596
    const-wide/16 v18, 0x0

    .line 597
    .line 598
    invoke-static/range {v5 .. v22}, La/rc7;->a(La/rc7;La/s9x;ZLa/a5w;La/z760;Ljava/util/List;La/ql5;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZZJJI)La/rc7;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    if-eqz v3, :cond_6

    .line 607
    .line 608
    invoke-virtual {v0, v1}, La/kd7;->N(Ljava/lang/Throwable;)V

    .line 609
    .line 610
    .line 611
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 612
    .line 613
    return-object v0

    .line 614
    :pswitch_c
    move-object/from16 v1, p1

    .line 615
    .line 616
    check-cast v1, Ljava/lang/Throwable;

    .line 617
    .line 618
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget-object v2, v0, La/kd7;->f0:La/duj;

    .line 622
    .line 623
    new-instance v3, La/zc7;

    .line 624
    .line 625
    const/4 v4, 0x2

    .line 626
    invoke-direct {v3, v0, v4}, La/zc7;-><init>(La/kd7;B)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 630
    .line 631
    .line 632
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_data_0
    .packed-switch 0x0
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
