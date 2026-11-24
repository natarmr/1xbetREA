.class public final La/f7h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/d7h0;

.field public final c:La/b7h0;

.field public final d:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/d7h0;La/b7h0;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/f7h0;->a:La/knf0;

    .line 11
    .line 12
    iput-object p2, p0, La/f7h0;->b:La/d7h0;

    .line 13
    .line 14
    iput-object p3, p0, La/f7h0;->c:La/b7h0;

    .line 15
    .line 16
    iput-object p4, p0, La/f7h0;->d:La/btt0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(DJLa/zje;La/csr;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, La/e7h0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/e7h0;

    .line 11
    .line 12
    iget v3, v2, La/e7h0;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/e7h0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/e7h0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/e7h0;-><init>(La/f7h0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/e7h0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/e7h0;->k:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, La/f7h0;->d:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v4, v0, La/f7h0;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    iput v6, v2, La/e7h0;->k:I

    .line 67
    .line 68
    iget-object v0, v0, La/f7h0;->b:La/d7h0;

    .line 69
    .line 70
    iget-object v0, v0, La/d7h0;->b:La/a7g0;

    .line 71
    .line 72
    invoke-virtual {v0}, La/a7g0;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/i6h0;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/Double;

    .line 79
    .line 80
    move-wide/from16 v6, p1

    .line 81
    .line 82
    invoke-direct {v4, v6, v7}, Ljava/lang/Double;-><init>(D)V

    .line 83
    .line 84
    .line 85
    move-object/from16 v6, p6

    .line 86
    .line 87
    iget-object v7, v6, La/csr;->a:La/bsr;

    .line 88
    .line 89
    iget-object v7, v7, La/bsr;->a:La/esr;

    .line 90
    .line 91
    invoke-virtual {v7}, La/esr;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_3

    .line 96
    .line 97
    move-object v11, v4

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v11, v5

    .line 100
    :goto_1
    sget-object v4, La/bg8;->Companion:La/ag8;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v6}, La/ag8;->a(La/csr;)La/bg8;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    new-instance v7, La/uv5;

    .line 110
    .line 111
    move-wide/from16 v8, p3

    .line 112
    .line 113
    invoke-direct/range {v7 .. v12}, La/uv5;-><init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, v1, v7, v2}, La/i6h0;->a(Ljava/lang/String;La/uv5;La/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-ne v1, v3, :cond_4

    .line 121
    .line 122
    return-object v3

    .line 123
    :cond_4
    :goto_2
    check-cast v1, La/q16;

    .line 124
    .line 125
    invoke-virtual {v1}, La/q16;->a()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, La/i7h0;

    .line 130
    .line 131
    iget-object v1, v0, La/i7h0;->a:Ljava/lang/Long;

    .line 132
    .line 133
    if-eqz v1, :cond_f

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    iget-object v1, v0, La/i7h0;->b:Ljava/lang/Double;

    .line 140
    .line 141
    if-eqz v1, :cond_e

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    iget-object v1, v0, La/i7h0;->d:Ljava/lang/String;

    .line 148
    .line 149
    const-string v2, "2"

    .line 150
    .line 151
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_5

    .line 156
    .line 157
    sget-object v1, La/j7h0;->a:La/j7h0;

    .line 158
    .line 159
    :goto_3
    move-object v11, v1

    .line 160
    goto :goto_4

    .line 161
    :cond_5
    const-string v2, "3"

    .line 162
    .line 163
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_d

    .line 168
    .line 169
    sget-object v1, La/j7h0;->b:La/j7h0;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :goto_4
    iget-object v1, v0, La/i7h0;->c:Ljava/lang/Double;

    .line 173
    .line 174
    const-wide/16 v7, 0x0

    .line 175
    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 179
    .line 180
    .line 181
    move-result-wide v1

    .line 182
    goto :goto_5

    .line 183
    :cond_6
    move-wide v1, v7

    .line 184
    :goto_5
    iget-object v9, v0, La/i7h0;->e:Ljava/lang/Double;

    .line 185
    .line 186
    if-eqz v9, :cond_7

    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 189
    .line 190
    .line 191
    move-result-wide v7

    .line 192
    :cond_7
    move-wide v9, v7

    .line 193
    iget-object v7, v0, La/i7h0;->f:Ljava/util/List;

    .line 194
    .line 195
    if-eqz v7, :cond_c

    .line 196
    .line 197
    new-instance v12, Ljava/util/ArrayList;

    .line 198
    .line 199
    const/16 v8, 0xa

    .line 200
    .line 201
    invoke-static {v7, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-eqz v13, :cond_9

    .line 217
    .line 218
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    check-cast v13, Ljava/util/List;

    .line 223
    .line 224
    new-instance v14, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-static {v13, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v15

    .line 241
    if-eqz v15, :cond_8

    .line 242
    .line 243
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    check-cast v15, Ljava/lang/Number;

    .line 248
    .line 249
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v15

    .line 253
    packed-switch v15, :pswitch_data_0

    .line 254
    .line 255
    .line 256
    new-instance v0, La/ef5;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :pswitch_0
    sget-object v15, La/z6h0;->i:La/z6h0;

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :pswitch_1
    sget-object v15, La/z6h0;->h:La/z6h0;

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :pswitch_2
    sget-object v15, La/z6h0;->g:La/z6h0;

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :pswitch_3
    sget-object v15, La/z6h0;->f:La/z6h0;

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :pswitch_4
    sget-object v15, La/z6h0;->e:La/z6h0;

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :pswitch_5
    sget-object v15, La/z6h0;->d:La/z6h0;

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :pswitch_6
    sget-object v15, La/z6h0;->c:La/z6h0;

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :pswitch_7
    sget-object v15, La/z6h0;->b:La/z6h0;

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :pswitch_8
    sget-object v15, La/z6h0;->a:La/z6h0;

    .line 287
    .line 288
    :goto_8
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_8
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_9
    iget-object v0, v0, La/i7h0;->g:Ljava/util/List;

    .line 297
    .line 298
    if-eqz v0, :cond_b

    .line 299
    .line 300
    new-instance v7, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    if-eqz v8, :cond_a

    .line 318
    .line 319
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    check-cast v8, Ljava/lang/Number;

    .line 324
    .line 325
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    packed-switch v8, :pswitch_data_1

    .line 330
    .line 331
    .line 332
    new-instance v0, La/ef5;

    .line 333
    .line 334
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :pswitch_9
    sget-object v8, La/a7h0;->h:La/a7h0;

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :pswitch_a
    sget-object v8, La/a7h0;->g:La/a7h0;

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :pswitch_b
    sget-object v8, La/a7h0;->f:La/a7h0;

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :pswitch_c
    sget-object v8, La/a7h0;->e:La/a7h0;

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :pswitch_d
    sget-object v8, La/a7h0;->d:La/a7h0;

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :pswitch_e
    sget-object v8, La/a7h0;->c:La/a7h0;

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :pswitch_f
    sget-object v8, La/a7h0;->b:La/a7h0;

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :pswitch_10
    sget-object v8, La/a7h0;->a:La/a7h0;

    .line 360
    .line 361
    :goto_a
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_a
    :goto_b
    move-object v13, v7

    .line 366
    move-wide v7, v1

    .line 367
    goto :goto_c

    .line 368
    :cond_b
    sget-object v7, La/iun;->a:La/iun;

    .line 369
    .line 370
    goto :goto_b

    .line 371
    :goto_c
    new-instance v2, La/c7h0;

    .line 372
    .line 373
    invoke-direct/range {v2 .. v13}, La/c7h0;-><init>(JDDDLa/j7h0;Ljava/util/List;Ljava/util/List;)V

    .line 374
    .line 375
    .line 376
    return-object v2

    .line 377
    :cond_c
    new-instance v0, La/ef5;

    .line 378
    .line 379
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_d
    new-instance v0, La/ef5;

    .line 384
    .line 385
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 386
    .line 387
    .line 388
    throw v0

    .line 389
    :cond_e
    new-instance v0, La/ef5;

    .line 390
    .line 391
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 392
    .line 393
    .line 394
    throw v0

    .line 395
    :cond_f
    new-instance v0, La/ef5;

    .line 396
    .line 397
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
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

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method
