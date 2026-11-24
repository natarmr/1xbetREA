.class public final synthetic La/ql7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fm7;


# direct methods
.method public synthetic constructor <init>(La/fm7;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ql7;->a:B

    iput-object p1, p0, La/ql7;->b:La/fm7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/fm7;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p2, 0x9

    iput-byte p2, p0, La/ql7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ql7;->b:La/fm7;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ql7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/ql7;->b:La/fm7;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Throwable;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 20
    .line 21
    new-instance v3, La/sl7;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v3, v0, v4}, La/sl7;-><init>(La/fm7;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, Ljava/lang/Throwable;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, La/fm7;->t:La/duj;

    .line 41
    .line 42
    new-instance v4, La/sl7;

    .line 43
    .line 44
    invoke-direct {v4, v0, v2}, La/sl7;-><init>(La/fm7;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_1
    move-object/from16 v1, p1

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Throwable;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 61
    .line 62
    new-instance v4, La/sl7;

    .line 63
    .line 64
    invoke-direct {v4, v0, v3}, La/sl7;-><init>(La/fm7;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_2
    move-object/from16 v1, p1

    .line 74
    .line 75
    check-cast v1, Ljava/lang/Throwable;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, v0, La/fm7;->t:La/duj;

    .line 81
    .line 82
    new-instance v2, La/i87;

    .line 83
    .line 84
    const/16 v3, 0xa

    .line 85
    .line 86
    invoke-direct {v2, v3}, La/i87;-><init>(B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_3
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, Ljava/lang/Throwable;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    instance-of v2, v1, La/zhi0;

    .line 103
    .line 104
    if-eqz v2, :cond_0

    .line 105
    .line 106
    iget-object v2, v0, La/fm7;->a0:La/nj7;

    .line 107
    .line 108
    move-object v4, v1

    .line 109
    check-cast v4, La/zhi0;

    .line 110
    .line 111
    iget-object v4, v4, La/zhi0;->c:La/kuw;

    .line 112
    .line 113
    invoke-interface {v4}, La/kuw;->getErrorCode()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-virtual {v2, v4}, La/nj7;->b(I)V

    .line 118
    .line 119
    .line 120
    :cond_0
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 121
    .line 122
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 123
    .line 124
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v5, v0, La/i3t0;->f:La/oyg0;

    .line 132
    .line 133
    move-object v6, v4

    .line 134
    check-cast v6, La/jk7;

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const/16 v27, 0x0

    .line 140
    .line 141
    const v28, 0x1feffff

    .line 142
    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    const/4 v8, 0x0

    .line 146
    const-wide/16 v9, 0x0

    .line 147
    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x0

    .line 150
    const/4 v13, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const/16 v22, 0x0

    .line 166
    .line 167
    const/16 v23, 0x0

    .line 168
    .line 169
    const/16 v24, 0x0

    .line 170
    .line 171
    const/16 v25, 0x0

    .line 172
    .line 173
    const/16 v26, 0x0

    .line 174
    .line 175
    invoke-static/range {v6 .. v28}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-virtual {v2, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_1

    .line 184
    .line 185
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 186
    .line 187
    new-instance v4, La/rl7;

    .line 188
    .line 189
    invoke-direct {v4, v1, v0, v3}, La/rl7;-><init>(Ljava/lang/Throwable;La/fm7;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_4
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
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 206
    .line 207
    new-instance v3, La/sl7;

    .line 208
    .line 209
    const/4 v4, 0x3

    .line 210
    invoke-direct {v3, v0, v4}, La/sl7;-><init>(La/fm7;B)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 214
    .line 215
    .line 216
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_5
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, Ljava/lang/Throwable;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 227
    .line 228
    new-instance v4, La/sl7;

    .line 229
    .line 230
    invoke-direct {v4, v0, v3}, La/sl7;-><init>(La/fm7;B)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_6
    move-object/from16 v1, p1

    .line 240
    .line 241
    check-cast v1, Ljava/lang/Throwable;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 247
    .line 248
    new-instance v3, La/sl7;

    .line 249
    .line 250
    const/4 v4, 0x4

    .line 251
    invoke-direct {v3, v0, v4}, La/sl7;-><init>(La/fm7;B)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_7
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, Ljava/lang/Throwable;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v0, v0, La/fm7;->t:La/duj;

    .line 268
    .line 269
    new-instance v2, La/i87;

    .line 270
    .line 271
    const/16 v3, 0x9

    .line 272
    .line 273
    invoke-direct {v2, v3}, La/i87;-><init>(B)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object v0

    .line 282
    :pswitch_8
    move-object/from16 v1, p1

    .line 283
    .line 284
    check-cast v1, Ljava/lang/Throwable;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget-object v3, v0, La/fm7;->t:La/duj;

    .line 290
    .line 291
    new-instance v4, La/rl7;

    .line 292
    .line 293
    invoke-direct {v4, v1, v0, v2}, La/rl7;-><init>(Ljava/lang/Throwable;La/fm7;B)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_9
    move-object/from16 v1, p1

    .line 303
    .line 304
    check-cast v1, Ljava/lang/Throwable;

    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 310
    .line 311
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 312
    .line 313
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 321
    .line 322
    move-object v5, v3

    .line 323
    check-cast v5, La/jk7;

    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    const/16 v26, 0x0

    .line 329
    .line 330
    const v27, 0x1ffffec

    .line 331
    .line 332
    .line 333
    const/4 v6, 0x0

    .line 334
    const/4 v7, 0x1

    .line 335
    const-wide/16 v8, 0x0

    .line 336
    .line 337
    const/4 v10, 0x0

    .line 338
    const/4 v11, 0x0

    .line 339
    const/4 v12, 0x0

    .line 340
    const/4 v13, 0x0

    .line 341
    const/4 v14, 0x0

    .line 342
    const/4 v15, 0x0

    .line 343
    const/16 v16, 0x0

    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const/16 v18, 0x0

    .line 348
    .line 349
    const/16 v19, 0x0

    .line 350
    .line 351
    const/16 v20, 0x0

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    const/16 v22, 0x0

    .line 356
    .line 357
    const/16 v23, 0x0

    .line 358
    .line 359
    const/16 v24, 0x0

    .line 360
    .line 361
    const/16 v25, 0x0

    .line 362
    .line 363
    invoke-static/range {v5 .. v27}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    if-eqz v3, :cond_2

    .line 372
    .line 373
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 374
    .line 375
    new-instance v3, La/sl7;

    .line 376
    .line 377
    const/4 v4, 0x6

    .line 378
    invoke-direct {v3, v0, v4}, La/sl7;-><init>(La/fm7;B)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object v0

    .line 387
    :pswitch_a
    move-object/from16 v1, p1

    .line 388
    .line 389
    check-cast v1, Ljava/lang/Throwable;

    .line 390
    .line 391
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v0, v0, La/fm7;->t:La/duj;

    .line 395
    .line 396
    new-instance v2, La/i87;

    .line 397
    .line 398
    const/16 v3, 0xb

    .line 399
    .line 400
    invoke-direct {v2, v3}, La/i87;-><init>(B)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_b
    move-object/from16 v1, p1

    .line 410
    .line 411
    check-cast v1, Ljava/lang/Throwable;

    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    iget-object v2, v0, La/fm7;->t:La/duj;

    .line 417
    .line 418
    new-instance v3, La/sl7;

    .line 419
    .line 420
    const/4 v4, 0x5

    .line 421
    invoke-direct {v3, v0, v4}, La/sl7;-><init>(La/fm7;B)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 425
    .line 426
    .line 427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_c
    move-object/from16 v1, p1

    .line 431
    .line 432
    check-cast v1, Ljava/lang/Throwable;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    iget-object v0, v0, La/fm7;->t:La/duj;

    .line 438
    .line 439
    new-instance v2, La/i87;

    .line 440
    .line 441
    const/16 v3, 0xc

    .line 442
    .line 443
    invoke-direct {v2, v3}, La/i87;-><init>(B)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 447
    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    nop

    .line 453
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
