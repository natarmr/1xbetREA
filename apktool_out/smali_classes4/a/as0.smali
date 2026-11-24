.class public final synthetic La/as0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(J[FLa/kie0;La/jie0;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput-byte v0, p0, La/as0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/as0;->b:J

    iput-object p3, p0, La/as0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/as0;->d:Ljava/lang/Object;

    iput-object p5, p0, La/as0;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/i3t0;JLjava/io/Serializable;Ljava/lang/String;B)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/as0;->a:B

    iput-object p1, p0, La/as0;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/as0;->b:J

    iput-object p4, p0, La/as0;->d:Ljava/lang/Object;

    iput-object p5, p0, La/as0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p6, p0, La/as0;->a:B

    iput-object p1, p0, La/as0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/as0;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/as0;->b:J

    iput-object p5, p0, La/as0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JB)V
    .locals 0

    .line 4
    iput-byte p6, p0, La/as0;->a:B

    iput-object p1, p0, La/as0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/as0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/as0;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/as0;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/as0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x40b00000    # 5.5f

    .line 6
    .line 7
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 8
    .line 9
    const/high16 v10, 0x40000000    # 2.0f

    .line 10
    .line 11
    const/high16 v14, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/4 v15, 0x0

    .line 14
    const/high16 v16, 0x43b40000    # 360.0f

    .line 15
    .line 16
    const/high16 v17, 0x3f000000    # 0.5f

    .line 17
    .line 18
    const/high16 v18, -0x41800000    # -0.25f

    .line 19
    .line 20
    const v19, 0x3f4ccccd    # 0.8f

    .line 21
    .line 22
    .line 23
    iget-wide v5, v0, La/as0;->b:J

    .line 24
    .line 25
    const/high16 v20, 0x40800000    # 4.0f

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    const/high16 v21, 0x40400000    # 3.0f

    .line 29
    .line 30
    iget-object v11, v0, La/as0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    const/high16 v22, 0x40a00000    # 5.0f

    .line 33
    .line 34
    iget-object v12, v0, La/as0;->d:Ljava/lang/Object;

    .line 35
    .line 36
    const v23, 0x3ecccccd    # 0.4f

    .line 37
    .line 38
    .line 39
    iget-object v13, v0, La/as0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    packed-switch v1, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    move-object/from16 v25, v13

    .line 45
    .line 46
    check-cast v25, La/l7s0;

    .line 47
    .line 48
    move-object/from16 v28, v12

    .line 49
    .line 50
    check-cast v28, La/z1s0;

    .line 51
    .line 52
    move-object/from16 v29, v11

    .line 53
    .line 54
    check-cast v29, Ljava/lang/String;

    .line 55
    .line 56
    move-object/from16 v1, p1

    .line 57
    .line 58
    check-cast v1, La/k0w0;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v24, La/i4s0;

    .line 64
    .line 65
    const/16 v30, 0x0

    .line 66
    .line 67
    const/16 v31, 0x2

    .line 68
    .line 69
    iget-wide v2, v0, La/as0;->b:J

    .line 70
    .line 71
    move-wide/from16 v26, v2

    .line 72
    .line 73
    invoke-direct/range {v24 .. v31}, La/i4s0;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v0, v24

    .line 77
    .line 78
    new-instance v2, La/b1w0;

    .line 79
    .line 80
    invoke-direct {v2, v0}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/c8d;

    .line 90
    .line 91
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 92
    .line 93
    new-instance v2, La/v7d;

    .line 94
    .line 95
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 96
    .line 97
    .line 98
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 99
    .line 100
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    move-object v9, v13

    .line 104
    check-cast v9, La/n6s0;

    .line 105
    .line 106
    check-cast v12, La/z1s0;

    .line 107
    .line 108
    move-object v13, v11

    .line 109
    check-cast v13, Ljava/lang/String;

    .line 110
    .line 111
    move-object/from16 v1, p1

    .line 112
    .line 113
    check-cast v1, La/k0w0;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance v8, La/i4s0;

    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const/4 v15, 0x1

    .line 122
    iget-wide v10, v0, La/as0;->b:J

    .line 123
    .line 124
    invoke-direct/range {v8 .. v15}, La/i4s0;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 125
    .line 126
    .line 127
    new-instance v0, La/b1w0;

    .line 128
    .line 129
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, La/c8d;

    .line 139
    .line 140
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 141
    .line 142
    new-instance v2, La/v7d;

    .line 143
    .line 144
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 148
    .line 149
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_1
    move-object v9, v13

    .line 153
    check-cast v9, La/k4s0;

    .line 154
    .line 155
    check-cast v12, La/z1s0;

    .line 156
    .line 157
    move-object v13, v11

    .line 158
    check-cast v13, Ljava/lang/String;

    .line 159
    .line 160
    move-object/from16 v1, p1

    .line 161
    .line 162
    check-cast v1, La/k0w0;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v8, La/i4s0;

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    iget-wide v10, v0, La/as0;->b:J

    .line 172
    .line 173
    invoke-direct/range {v8 .. v15}, La/i4s0;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 174
    .line 175
    .line 176
    new-instance v0, La/b1w0;

    .line 177
    .line 178
    invoke-direct {v0, v8}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, La/c8d;

    .line 188
    .line 189
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 190
    .line 191
    new-instance v2, La/v7d;

    .line 192
    .line 193
    invoke-direct {v2, v7, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 194
    .line 195
    .line 196
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 197
    .line 198
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_2
    check-cast v13, La/ctf0;

    .line 202
    .line 203
    check-cast v12, La/vjp;

    .line 204
    .line 205
    check-cast v11, La/r9u;

    .line 206
    .line 207
    move-object/from16 v0, p1

    .line 208
    .line 209
    check-cast v0, La/a5g0;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, La/vjp;->e()La/v5l0;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    sget-object v1, La/ygp;->t:La/ygp;

    .line 219
    .line 220
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v2, v11, La/r9u;->a:La/j1q0;

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 229
    .line 230
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object v0, v0, La/a5g0;->a:Ljava/util/ArrayList;

    .line 238
    .line 239
    new-instance v2, Ljava/util/ArrayList;

    .line 240
    .line 241
    const/16 v8, 0xa

    .line 242
    .line 243
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    if-eqz v8, :cond_6

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    move-object v15, v8

    .line 265
    check-cast v15, La/e8g0;

    .line 266
    .line 267
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object v8, v15, La/e8g0;->e:La/lho;

    .line 271
    .line 272
    iget-object v9, v15, La/e8g0;->g:Ljava/lang/String;

    .line 273
    .line 274
    iget-object v10, v15, La/e8g0;->f:Ljava/lang/String;

    .line 275
    .line 276
    iget-object v11, v15, La/e8g0;->b:La/ufp0;

    .line 277
    .line 278
    iget-object v14, v15, La/e8g0;->c:La/ufp0;

    .line 279
    .line 280
    filled-new-array {v11, v14}, [La/ufp0;

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    invoke-static/range {v16 .. v16}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-static {v5, v6, v4}, La/wvb;->V(JLjava/util/List;)La/cys0;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    iget-object v3, v11, La/ufp0;->d:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {v3}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v18

    .line 298
    iget-object v3, v14, La/ufp0;->d:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {v3}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v20

    .line 304
    new-instance v16, La/kbo;

    .line 305
    .line 306
    iget-object v3, v11, La/ufp0;->b:Ljava/lang/String;

    .line 307
    .line 308
    iget-object v7, v14, La/ufp0;->b:Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 311
    .line 312
    .line 313
    move-result v17

    .line 314
    if-nez v17, :cond_0

    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_0
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 318
    .line 319
    .line 320
    move-result v17

    .line 321
    if-nez v17, :cond_1

    .line 322
    .line 323
    :goto_1
    const/16 v25, 0x1

    .line 324
    .line 325
    :goto_2
    move-object/from16 v17, v3

    .line 326
    .line 327
    move-object/from16 p0, v4

    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_1
    const/16 v25, 0x0

    .line 331
    .line 332
    goto :goto_2

    .line 333
    :goto_3
    iget-wide v3, v15, La/e8g0;->i:J

    .line 334
    .line 335
    move-object/from16 p1, v0

    .line 336
    .line 337
    iget-object v0, v15, La/e8g0;->h:La/n8g0;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    move-wide/from16 v28, v3

    .line 344
    .line 345
    const/4 v3, 0x1

    .line 346
    if-eq v0, v3, :cond_3

    .line 347
    .line 348
    const/4 v3, 0x2

    .line 349
    if-eq v0, v3, :cond_2

    .line 350
    .line 351
    const/16 v30, 0x0

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_2
    const/16 v30, 0x2

    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_3
    const/16 v30, 0x1

    .line 358
    .line 359
    :goto_4
    invoke-virtual {v13}, La/ctf0;->h()Z

    .line 360
    .line 361
    .line 362
    move-result v31

    .line 363
    new-instance v0, Lkotlin/Pair;

    .line 364
    .line 365
    invoke-direct {v0, v10, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v32

    .line 372
    const-string v21, ""

    .line 373
    .line 374
    const-string v22, ""

    .line 375
    .line 376
    const-string v26, ""

    .line 377
    .line 378
    const-string v27, ""

    .line 379
    .line 380
    move-object/from16 v19, v7

    .line 381
    .line 382
    move-object/from16 v24, v9

    .line 383
    .line 384
    move-object/from16 v23, v10

    .line 385
    .line 386
    invoke-direct/range {v16 .. v32}, La/kbo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JIZLjava/util/List;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    move-object/from16 v20, v8

    .line 394
    .line 395
    iget-wide v8, v15, La/e8g0;->d:J

    .line 396
    .line 397
    sget-object v19, La/nim0;->a:La/nim0;

    .line 398
    .line 399
    const/4 v3, 0x1

    .line 400
    if-eq v0, v3, :cond_5

    .line 401
    .line 402
    const/4 v3, 0x2

    .line 403
    if-eq v0, v3, :cond_4

    .line 404
    .line 405
    move-object/from16 v10, p0

    .line 406
    .line 407
    move-object v0, v11

    .line 408
    move-object v3, v14

    .line 409
    move-object/from16 v11, v16

    .line 410
    .line 411
    move-object/from16 v14, v19

    .line 412
    .line 413
    invoke-static/range {v8 .. v14}, La/wwb;->S(JLa/cys0;La/kbo;La/v5l0;La/ctf0;La/pim0;)La/mim0;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    :goto_5
    move-object/from16 v21, v4

    .line 418
    .line 419
    move-object v8, v15

    .line 420
    goto :goto_6

    .line 421
    :cond_4
    move-object/from16 v10, p0

    .line 422
    .line 423
    move-object v0, v11

    .line 424
    move-object v3, v14

    .line 425
    move-object/from16 v11, v16

    .line 426
    .line 427
    move-object/from16 v14, v19

    .line 428
    .line 429
    invoke-static/range {v8 .. v14}, La/vtb;->j0(JLa/cys0;La/kbo;La/v5l0;La/ctf0;La/pim0;)La/mim0;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    goto :goto_5

    .line 434
    :cond_5
    move-object v0, v11

    .line 435
    move-object/from16 v18, v12

    .line 436
    .line 437
    move-object v3, v14

    .line 438
    move-object/from16 v17, v16

    .line 439
    .line 440
    move-object/from16 v16, p0

    .line 441
    .line 442
    move-wide/from16 v36, v8

    .line 443
    .line 444
    move-object v8, v15

    .line 445
    move-wide/from16 v14, v36

    .line 446
    .line 447
    invoke-static/range {v14 .. v19}, La/ntb;->c0(JLa/cys0;La/kbo;La/v5l0;La/pim0;)La/mim0;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    move-object/from16 v21, v4

    .line 452
    .line 453
    move-object/from16 v11, v17

    .line 454
    .line 455
    :goto_6
    new-instance v16, La/dyl0;

    .line 456
    .line 457
    iget-wide v9, v8, La/e8g0;->d:J

    .line 458
    .line 459
    iget-object v4, v8, La/e8g0;->a:Ljava/lang/String;

    .line 460
    .line 461
    iget-object v0, v0, La/ufp0;->e:Ljava/util/List;

    .line 462
    .line 463
    iget-object v3, v3, La/ufp0;->e:Ljava/util/List;

    .line 464
    .line 465
    move-object/from16 v23, v0

    .line 466
    .line 467
    move-object/from16 v24, v3

    .line 468
    .line 469
    move-object/from16 v19, v4

    .line 470
    .line 471
    move-wide/from16 v17, v9

    .line 472
    .line 473
    move-object/from16 v22, v11

    .line 474
    .line 475
    invoke-direct/range {v16 .. v24}, La/dyl0;-><init>(JLjava/lang/String;La/lho;La/mim0;La/kbo;Ljava/util/List;Ljava/util/List;)V

    .line 476
    .line 477
    .line 478
    move-object/from16 v0, v16

    .line 479
    .line 480
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-object/from16 v0, p1

    .line 484
    .line 485
    const/4 v7, 0x1

    .line 486
    goto/16 :goto_0

    .line 487
    .line 488
    :cond_6
    new-instance v0, La/b5g0;

    .line 489
    .line 490
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-direct {v0, v2, v1}, La/b5g0;-><init>(La/i4;Z)V

    .line 495
    .line 496
    .line 497
    return-object v0

    .line 498
    :pswitch_3
    check-cast v13, La/ilq;

    .line 499
    .line 500
    check-cast v12, La/l7m0;

    .line 501
    .line 502
    iget-wide v0, v0, La/as0;->b:J

    .line 503
    .line 504
    check-cast v11, La/w03;

    .line 505
    .line 506
    move-object/from16 v3, p1

    .line 507
    .line 508
    check-cast v3, La/fhl;

    .line 509
    .line 510
    invoke-interface {v13}, La/ilq;->invoke()F

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    invoke-static {v14, v4}, Ljava/lang/Math;->min(FF)F

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    sub-float v5, v5, v23

    .line 519
    .line 520
    invoke-static {v5, v15}, Ljava/lang/Math;->max(FF)F

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    mul-float v5, v5, v22

    .line 525
    .line 526
    div-float v5, v5, v21

    .line 527
    .line 528
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    sub-float/2addr v4, v14

    .line 533
    invoke-static {v4, v15, v10}, La/l1e0;->c(FFF)F

    .line 534
    .line 535
    .line 536
    move-result v4

    .line 537
    float-to-double v6, v4

    .line 538
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 539
    .line 540
    .line 541
    move-result-wide v6

    .line 542
    double-to-float v6, v6

    .line 543
    div-float v6, v6, v20

    .line 544
    .line 545
    sub-float/2addr v4, v6

    .line 546
    mul-float v6, v5, v19

    .line 547
    .line 548
    mul-float v13, v5, v23

    .line 549
    .line 550
    add-float v13, v13, v18

    .line 551
    .line 552
    add-float/2addr v13, v4

    .line 553
    mul-float v13, v13, v17

    .line 554
    .line 555
    mul-float v27, v13, v16

    .line 556
    .line 557
    add-float/2addr v6, v13

    .line 558
    mul-float v6, v6, v16

    .line 559
    .line 560
    invoke-static {v14, v5}, Ljava/lang/Math;->min(FF)F

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    new-instance v5, La/yx3;

    .line 565
    .line 566
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 567
    .line 568
    .line 569
    iput v6, v5, La/yx3;->a:F

    .line 570
    .line 571
    iput v4, v5, La/yx3;->b:F

    .line 572
    .line 573
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    check-cast v4, Ljava/lang/Number;

    .line 578
    .line 579
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 580
    .line 581
    .line 582
    move-result v33

    .line 583
    invoke-interface {v3}, La/fhl;->E0()J

    .line 584
    .line 585
    .line 586
    move-result-wide v7

    .line 587
    invoke-interface {v3}, La/fhl;->A0()La/nr;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    invoke-virtual {v4}, La/nr;->p()J

    .line 592
    .line 593
    .line 594
    move-result-wide v14

    .line 595
    invoke-virtual {v4}, La/nr;->i()La/x5a;

    .line 596
    .line 597
    .line 598
    move-result-object v9

    .line 599
    invoke-interface {v9}, La/x5a;->l()V

    .line 600
    .line 601
    .line 602
    :try_start_0
    iget-object v9, v4, La/nr;->b:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast v9, La/fvt0;

    .line 605
    .line 606
    invoke-virtual {v9, v13, v7, v8}, La/fvt0;->y(FJ)V

    .line 607
    .line 608
    .line 609
    invoke-interface {v3, v2}, La/w6k;->w0(F)F

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    const/high16 v7, 0x40200000    # 2.5f

    .line 614
    .line 615
    invoke-interface {v3, v7}, La/w6k;->w0(F)F

    .line 616
    .line 617
    .line 618
    move-result v8

    .line 619
    div-float/2addr v8, v10

    .line 620
    add-float/2addr v8, v2

    .line 621
    invoke-interface {v3}, La/fhl;->d()J

    .line 622
    .line 623
    .line 624
    move-result-wide v9

    .line 625
    invoke-static {v9, v10}, La/p7x;->u(J)J

    .line 626
    .line 627
    .line 628
    move-result-wide v9

    .line 629
    invoke-static {v8, v9, v10}, La/k9x;->q(FJ)La/jge0;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    sub-float v28, v6, v27

    .line 634
    .line 635
    invoke-virtual {v2}, La/jge0;->g()J

    .line 636
    .line 637
    .line 638
    move-result-wide v29

    .line 639
    invoke-virtual {v2}, La/jge0;->f()J

    .line 640
    .line 641
    .line 642
    move-result-wide v31

    .line 643
    new-instance v16, La/vtm0;

    .line 644
    .line 645
    invoke-interface {v3, v7}, La/w6k;->w0(F)F

    .line 646
    .line 647
    .line 648
    move-result v17

    .line 649
    const/16 v21, 0x0

    .line 650
    .line 651
    const/16 v22, 0x1a

    .line 652
    .line 653
    const/16 v18, 0x0

    .line 654
    .line 655
    const/16 v19, 0x0

    .line 656
    .line 657
    const/16 v20, 0x0

    .line 658
    .line 659
    invoke-direct/range {v16 .. v22}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 660
    .line 661
    .line 662
    const/16 v35, 0x300

    .line 663
    .line 664
    move-wide/from16 v25, v0

    .line 665
    .line 666
    move-object/from16 v24, v3

    .line 667
    .line 668
    move-object/from16 v34, v16

    .line 669
    .line 670
    invoke-static/range {v24 .. v35}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 671
    .line 672
    .line 673
    move-object/from16 v30, v5

    .line 674
    .line 675
    move-wide/from16 v27, v25

    .line 676
    .line 677
    move/from16 v29, v33

    .line 678
    .line 679
    move-object/from16 v26, v2

    .line 680
    .line 681
    move-object/from16 v25, v11

    .line 682
    .line 683
    invoke-static/range {v24 .. v30}, La/idx;->u(La/fhl;La/w03;La/jge0;JFLa/yx3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 684
    .line 685
    .line 686
    invoke-static {v4, v14, v15}, Lc;->g(La/nr;J)V

    .line 687
    .line 688
    .line 689
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 690
    .line 691
    return-object v0

    .line 692
    :catchall_0
    move-exception v0

    .line 693
    invoke-static {v4, v14, v15}, Lc;->g(La/nr;J)V

    .line 694
    .line 695
    .line 696
    throw v0

    .line 697
    :pswitch_4
    check-cast v13, La/r4b0;

    .line 698
    .line 699
    move-object v6, v12

    .line 700
    check-cast v6, Ljava/lang/String;

    .line 701
    .line 702
    move-object v3, v11

    .line 703
    check-cast v3, Ljava/util/Set;

    .line 704
    .line 705
    move-object/from16 v7, p1

    .line 706
    .line 707
    check-cast v7, La/k0w0;

    .line 708
    .line 709
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    iget-object v1, v13, La/r4b0;->e:La/vjp;

    .line 713
    .line 714
    iget-object v2, v13, La/r4b0;->l:La/f4b0;

    .line 715
    .line 716
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    if-eqz v2, :cond_8

    .line 721
    .line 722
    const/4 v4, 0x1

    .line 723
    if-ne v2, v4, :cond_7

    .line 724
    .line 725
    sget-object v2, La/j700;->a:La/j700;

    .line 726
    .line 727
    goto :goto_7

    .line 728
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 729
    .line 730
    .line 731
    const/4 v0, 0x0

    .line 732
    goto :goto_8

    .line 733
    :cond_8
    sget-object v2, La/j700;->b:La/j700;

    .line 734
    .line 735
    :goto_7
    new-instance v4, La/m8h0;

    .line 736
    .line 737
    invoke-direct {v4, v6}, La/m8h0;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    move-object v8, v1

    .line 741
    move-object v1, v2

    .line 742
    move-object v2, v4

    .line 743
    iget-wide v4, v0, La/as0;->b:J

    .line 744
    .line 745
    move-object v0, v8

    .line 746
    invoke-virtual/range {v0 .. v6}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-virtual {v7, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 751
    .line 752
    .line 753
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    :goto_8
    return-object v0

    .line 756
    :pswitch_5
    check-cast v13, Ljava/lang/String;

    .line 757
    .line 758
    check-cast v12, Ljava/util/Map;

    .line 759
    .line 760
    check-cast v11, La/pz40;

    .line 761
    .line 762
    move-object/from16 v0, p1

    .line 763
    .line 764
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 765
    .line 766
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    new-instance v1, La/prs0;

    .line 770
    .line 771
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    invoke-direct {v1, v13, v12, v2}, La/prs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    invoke-virtual {v1, v2}, La/prs0;->equals(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v2

    .line 786
    if-nez v2, :cond_a

    .line 787
    .line 788
    invoke-interface {v11, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    const-string v1, "http"

    .line 792
    .line 793
    const/4 v2, 0x0

    .line 794
    invoke-static {v13, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    if-nez v1, :cond_9

    .line 799
    .line 800
    const-string v1, "mailto"

    .line 801
    .line 802
    invoke-static {v13, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 803
    .line 804
    .line 805
    move-result v1

    .line 806
    if-nez v1, :cond_9

    .line 807
    .line 808
    const-string v1, "tel"

    .line 809
    .line 810
    invoke-static {v13, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    if-nez v1, :cond_9

    .line 815
    .line 816
    const-string v1, "http://"

    .line 817
    .line 818
    invoke-virtual {v1, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v13

    .line 822
    :cond_9
    invoke-virtual {v0, v13, v12}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 823
    .line 824
    .line 825
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 826
    .line 827
    return-object v0

    .line 828
    :pswitch_6
    check-cast v13, [F

    .line 829
    .line 830
    check-cast v12, La/kie0;

    .line 831
    .line 832
    check-cast v11, La/jie0;

    .line 833
    .line 834
    move-object/from16 v0, p1

    .line 835
    .line 836
    check-cast v0, La/yn80;

    .line 837
    .line 838
    iget v1, v0, La/yn80;->b:I

    .line 839
    .line 840
    iget-object v2, v0, La/yn80;->a:La/s03;

    .line 841
    .line 842
    iget v3, v0, La/yn80;->c:I

    .line 843
    .line 844
    invoke-static {v5, v6}, La/o9q0;->f(J)I

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    if-le v1, v4, :cond_b

    .line 849
    .line 850
    iget v1, v0, La/yn80;->b:I

    .line 851
    .line 852
    goto :goto_9

    .line 853
    :cond_b
    invoke-static {v5, v6}, La/o9q0;->f(J)I

    .line 854
    .line 855
    .line 856
    move-result v1

    .line 857
    :goto_9
    invoke-static {v5, v6}, La/o9q0;->e(J)I

    .line 858
    .line 859
    .line 860
    move-result v4

    .line 861
    if-ge v3, v4, :cond_c

    .line 862
    .line 863
    goto :goto_a

    .line 864
    :cond_c
    invoke-static {v5, v6}, La/o9q0;->e(J)I

    .line 865
    .line 866
    .line 867
    move-result v3

    .line 868
    :goto_a
    invoke-virtual {v0, v1}, La/yn80;->d(I)I

    .line 869
    .line 870
    .line 871
    move-result v1

    .line 872
    invoke-virtual {v0, v3}, La/yn80;->d(I)I

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    invoke-static {v1, v0}, La/s7n0;->e(II)J

    .line 877
    .line 878
    .line 879
    move-result-wide v0

    .line 880
    iget v3, v12, La/kie0;->a:I

    .line 881
    .line 882
    iget-object v4, v2, La/s03;->d:La/y8q0;

    .line 883
    .line 884
    invoke-static {v0, v1}, La/o9q0;->f(J)I

    .line 885
    .line 886
    .line 887
    move-result v5

    .line 888
    invoke-static {v0, v1}, La/o9q0;->e(J)I

    .line 889
    .line 890
    .line 891
    move-result v6

    .line 892
    iget-object v7, v4, La/y8q0;->f:Landroid/text/Layout;

    .line 893
    .line 894
    invoke-virtual {v7}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 895
    .line 896
    .line 897
    move-result-object v8

    .line 898
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 899
    .line 900
    .line 901
    move-result v8

    .line 902
    if-ltz v5, :cond_d

    .line 903
    .line 904
    goto :goto_b

    .line 905
    :cond_d
    const-string v9, "startOffset must be > 0"

    .line 906
    .line 907
    invoke-static {v9}, La/ycx;->a(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    :goto_b
    if-ge v5, v8, :cond_e

    .line 911
    .line 912
    goto :goto_c

    .line 913
    :cond_e
    const-string v9, "startOffset must be less than text length"

    .line 914
    .line 915
    invoke-static {v9}, La/ycx;->a(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    :goto_c
    if-le v6, v5, :cond_f

    .line 919
    .line 920
    goto :goto_d

    .line 921
    :cond_f
    const-string v9, "endOffset must be greater than startOffset"

    .line 922
    .line 923
    invoke-static {v9}, La/ycx;->a(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    :goto_d
    if-gt v6, v8, :cond_10

    .line 927
    .line 928
    goto :goto_e

    .line 929
    :cond_10
    const-string v8, "endOffset must be smaller or equal to text length"

    .line 930
    .line 931
    invoke-static {v8}, La/ycx;->a(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    :goto_e
    sub-int v8, v6, v5

    .line 935
    .line 936
    mul-int/lit8 v8, v8, 0x4

    .line 937
    .line 938
    array-length v9, v13

    .line 939
    sub-int/2addr v9, v3

    .line 940
    if-lt v9, v8, :cond_11

    .line 941
    .line 942
    goto :goto_f

    .line 943
    :cond_11
    const-string v8, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"

    .line 944
    .line 945
    invoke-static {v8}, La/ycx;->a(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    :goto_f
    invoke-virtual {v4, v5}, La/y8q0;->f(I)I

    .line 949
    .line 950
    .line 951
    move-result v8

    .line 952
    add-int/lit8 v9, v6, -0x1

    .line 953
    .line 954
    invoke-virtual {v4, v9}, La/y8q0;->f(I)I

    .line 955
    .line 956
    .line 957
    move-result v9

    .line 958
    new-instance v10, La/tlw;

    .line 959
    .line 960
    invoke-direct {v10, v4}, La/tlw;-><init>(La/y8q0;)V

    .line 961
    .line 962
    .line 963
    if-gt v8, v9, :cond_17

    .line 964
    .line 965
    :goto_10
    invoke-virtual {v7, v8}, Landroid/text/Layout;->getLineStart(I)I

    .line 966
    .line 967
    .line 968
    move-result v14

    .line 969
    invoke-virtual {v4, v8}, La/y8q0;->e(I)I

    .line 970
    .line 971
    .line 972
    move-result v15

    .line 973
    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    .line 974
    .line 975
    .line 976
    move-result v14

    .line 977
    invoke-static {v6, v15}, Ljava/lang/Math;->min(II)I

    .line 978
    .line 979
    .line 980
    move-result v15

    .line 981
    invoke-virtual {v4, v8}, La/y8q0;->h(I)F

    .line 982
    .line 983
    .line 984
    move-result v16

    .line 985
    invoke-virtual {v4, v8}, La/y8q0;->d(I)F

    .line 986
    .line 987
    .line 988
    move-result v17

    .line 989
    move-wide/from16 p0, v0

    .line 990
    .line 991
    invoke-virtual {v7, v8}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    const/4 v1, 0x1

    .line 996
    if-ne v0, v1, :cond_12

    .line 997
    .line 998
    move v0, v1

    .line 999
    goto :goto_11

    .line 1000
    :cond_12
    const/4 v0, 0x0

    .line 1001
    :goto_11
    if-ge v14, v15, :cond_16

    .line 1002
    .line 1003
    invoke-virtual {v7, v14}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v18

    .line 1007
    if-eqz v0, :cond_13

    .line 1008
    .line 1009
    if-nez v18, :cond_13

    .line 1010
    .line 1011
    move/from16 v19, v0

    .line 1012
    .line 1013
    const/4 v0, 0x0

    .line 1014
    invoke-virtual {v10, v14, v0, v0, v1}, La/tlw;->a(IZZZ)F

    .line 1015
    .line 1016
    .line 1017
    move-result v18

    .line 1018
    add-int/lit8 v0, v14, 0x1

    .line 1019
    .line 1020
    invoke-virtual {v10, v0, v1, v1, v1}, La/tlw;->a(IZZZ)F

    .line 1021
    .line 1022
    .line 1023
    move-result v0

    .line 1024
    move/from16 v20, v3

    .line 1025
    .line 1026
    goto :goto_13

    .line 1027
    :cond_13
    move/from16 v19, v0

    .line 1028
    .line 1029
    if-eqz v19, :cond_14

    .line 1030
    .line 1031
    if-eqz v18, :cond_14

    .line 1032
    .line 1033
    const/4 v0, 0x0

    .line 1034
    invoke-virtual {v10, v14, v0, v0, v0}, La/tlw;->a(IZZZ)F

    .line 1035
    .line 1036
    .line 1037
    move-result v18

    .line 1038
    move/from16 v20, v3

    .line 1039
    .line 1040
    add-int/lit8 v3, v14, 0x1

    .line 1041
    .line 1042
    invoke-virtual {v10, v3, v1, v1, v0}, La/tlw;->a(IZZZ)F

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    move/from16 v0, v18

    .line 1047
    .line 1048
    move/from16 v18, v3

    .line 1049
    .line 1050
    goto :goto_13

    .line 1051
    :cond_14
    move/from16 v20, v3

    .line 1052
    .line 1053
    const/4 v0, 0x0

    .line 1054
    if-nez v19, :cond_15

    .line 1055
    .line 1056
    if-eqz v18, :cond_15

    .line 1057
    .line 1058
    invoke-virtual {v10, v14, v0, v0, v1}, La/tlw;->a(IZZZ)F

    .line 1059
    .line 1060
    .line 1061
    move-result v3

    .line 1062
    add-int/lit8 v0, v14, 0x1

    .line 1063
    .line 1064
    invoke-virtual {v10, v0, v1, v1, v1}, La/tlw;->a(IZZZ)F

    .line 1065
    .line 1066
    .line 1067
    move-result v18

    .line 1068
    :goto_12
    move v0, v3

    .line 1069
    goto :goto_13

    .line 1070
    :cond_15
    invoke-virtual {v10, v14, v0, v0, v0}, La/tlw;->a(IZZZ)F

    .line 1071
    .line 1072
    .line 1073
    move-result v18

    .line 1074
    add-int/lit8 v3, v14, 0x1

    .line 1075
    .line 1076
    invoke-virtual {v10, v3, v1, v1, v0}, La/tlw;->a(IZZZ)F

    .line 1077
    .line 1078
    .line 1079
    move-result v3

    .line 1080
    goto :goto_12

    .line 1081
    :goto_13
    aput v18, v13, v20

    .line 1082
    .line 1083
    add-int/lit8 v3, v20, 0x1

    .line 1084
    .line 1085
    aput v16, v13, v3

    .line 1086
    .line 1087
    add-int/lit8 v3, v20, 0x2

    .line 1088
    .line 1089
    aput v0, v13, v3

    .line 1090
    .line 1091
    add-int/lit8 v3, v20, 0x3

    .line 1092
    .line 1093
    aput v17, v13, v3

    .line 1094
    .line 1095
    add-int/lit8 v3, v20, 0x4

    .line 1096
    .line 1097
    add-int/lit8 v14, v14, 0x1

    .line 1098
    .line 1099
    move/from16 v0, v19

    .line 1100
    .line 1101
    goto :goto_11

    .line 1102
    :cond_16
    move/from16 v20, v3

    .line 1103
    .line 1104
    if-eq v8, v9, :cond_18

    .line 1105
    .line 1106
    add-int/lit8 v8, v8, 0x1

    .line 1107
    .line 1108
    move-wide/from16 v0, p0

    .line 1109
    .line 1110
    move/from16 v3, v20

    .line 1111
    .line 1112
    goto/16 :goto_10

    .line 1113
    .line 1114
    :cond_17
    move-wide/from16 p0, v0

    .line 1115
    .line 1116
    :cond_18
    iget v0, v12, La/kie0;->a:I

    .line 1117
    .line 1118
    invoke-static/range {p0 .. p1}, La/o9q0;->d(J)I

    .line 1119
    .line 1120
    .line 1121
    move-result v1

    .line 1122
    mul-int/lit8 v1, v1, 0x4

    .line 1123
    .line 1124
    add-int/2addr v1, v0

    .line 1125
    iget v0, v12, La/kie0;->a:I

    .line 1126
    .line 1127
    :goto_14
    if-ge v0, v1, :cond_19

    .line 1128
    .line 1129
    add-int/lit8 v3, v0, 0x1

    .line 1130
    .line 1131
    aget v4, v13, v3

    .line 1132
    .line 1133
    iget v5, v11, La/jie0;->a:F

    .line 1134
    .line 1135
    add-float/2addr v4, v5

    .line 1136
    aput v4, v13, v3

    .line 1137
    .line 1138
    add-int/lit8 v3, v0, 0x3

    .line 1139
    .line 1140
    aget v4, v13, v3

    .line 1141
    .line 1142
    add-float/2addr v4, v5

    .line 1143
    aput v4, v13, v3

    .line 1144
    .line 1145
    add-int/lit8 v0, v0, 0x4

    .line 1146
    .line 1147
    goto :goto_14

    .line 1148
    :cond_19
    iput v1, v12, La/kie0;->a:I

    .line 1149
    .line 1150
    iget v0, v11, La/jie0;->a:F

    .line 1151
    .line 1152
    iget v1, v2, La/s03;->f:F

    .line 1153
    .line 1154
    add-float/2addr v0, v1

    .line 1155
    iput v0, v11, La/jie0;->a:F

    .line 1156
    .line 1157
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1158
    .line 1159
    return-object v0

    .line 1160
    :pswitch_7
    check-cast v13, La/dez;

    .line 1161
    .line 1162
    move-object v1, v12

    .line 1163
    check-cast v1, Ljava/util/ArrayList;

    .line 1164
    .line 1165
    move-object v4, v11

    .line 1166
    check-cast v4, La/jbz;

    .line 1167
    .line 1168
    move-object/from16 v6, p1

    .line 1169
    .line 1170
    check-cast v6, La/ou90;

    .line 1171
    .line 1172
    new-instance v2, La/mz0;

    .line 1173
    .line 1174
    const/16 v5, 0x14

    .line 1175
    .line 1176
    move-object v7, v2

    .line 1177
    iget-wide v2, v0, La/as0;->b:J

    .line 1178
    .line 1179
    move-object v0, v7

    .line 1180
    invoke-direct/range {v0 .. v5}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v6, v0}, La/ou90;->H(Lkotlin/jvm/functions/Function1;)V

    .line 1184
    .line 1185
    .line 1186
    iget-object v0, v13, La/dez;->a:La/mez;

    .line 1187
    .line 1188
    iget-object v0, v0, La/mez;->u:La/pz40;

    .line 1189
    .line 1190
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1191
    .line 1192
    .line 1193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1194
    .line 1195
    return-object v0

    .line 1196
    :pswitch_8
    check-cast v13, La/nnp;

    .line 1197
    .line 1198
    move-object v7, v12

    .line 1199
    check-cast v7, Ljava/lang/String;

    .line 1200
    .line 1201
    move-object v4, v11

    .line 1202
    check-cast v4, Ljava/util/Set;

    .line 1203
    .line 1204
    move-object/from16 v8, p1

    .line 1205
    .line 1206
    check-cast v8, La/k0w0;

    .line 1207
    .line 1208
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    iget-object v1, v13, La/nnp;->B:La/vjp;

    .line 1212
    .line 1213
    iget-object v2, v13, La/nnp;->T:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;

    .line 1214
    .line 1215
    move-object v3, v1

    .line 1216
    iget-object v1, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->d:Ljava/lang/String;

    .line 1217
    .line 1218
    iget-object v5, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->b:La/j700;

    .line 1219
    .line 1220
    move-object v6, v3

    .line 1221
    new-instance v3, La/m8h0;

    .line 1222
    .line 1223
    iget-object v9, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->c:Ljava/util/Set;

    .line 1224
    .line 1225
    check-cast v9, Ljava/lang/Iterable;

    .line 1226
    .line 1227
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v9

    .line 1231
    iget-boolean v2, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->e:Z

    .line 1232
    .line 1233
    invoke-direct {v3, v7, v9, v2}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 1234
    .line 1235
    .line 1236
    move-object v9, v5

    .line 1237
    move-object v2, v6

    .line 1238
    iget-wide v5, v0, La/as0;->b:J

    .line 1239
    .line 1240
    move-object v0, v2

    .line 1241
    move-object v2, v9

    .line 1242
    invoke-virtual/range {v0 .. v7}, La/vjp;->c(Ljava/lang/String;La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v0

    .line 1246
    invoke-virtual {v8, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1247
    .line 1248
    .line 1249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1250
    .line 1251
    return-object v0

    .line 1252
    :pswitch_9
    check-cast v13, La/nnp;

    .line 1253
    .line 1254
    check-cast v12, La/aj00;

    .line 1255
    .line 1256
    check-cast v11, Ljava/lang/String;

    .line 1257
    .line 1258
    move-object/from16 v0, p1

    .line 1259
    .line 1260
    check-cast v0, La/k0w0;

    .line 1261
    .line 1262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1263
    .line 1264
    .line 1265
    iget-object v14, v13, La/nnp;->B:La/vjp;

    .line 1266
    .line 1267
    iget-object v1, v13, La/nnp;->T:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;

    .line 1268
    .line 1269
    iget-object v15, v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->d:Ljava/lang/String;

    .line 1270
    .line 1271
    iget-object v1, v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->b:La/j700;

    .line 1272
    .line 1273
    new-instance v2, La/p8h0;

    .line 1274
    .line 1275
    invoke-direct {v2, v5, v6, v12, v11}, La/p8h0;-><init>(JLa/aj00;Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    sget-object v18, La/xun;->a:La/xun;

    .line 1279
    .line 1280
    const-string v21, ""

    .line 1281
    .line 1282
    const-wide/16 v19, -0x1

    .line 1283
    .line 1284
    move-object/from16 v16, v1

    .line 1285
    .line 1286
    move-object/from16 v17, v2

    .line 1287
    .line 1288
    invoke-virtual/range {v14 .. v21}, La/vjp;->c(Ljava/lang/String;La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v1

    .line 1292
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1293
    .line 1294
    .line 1295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1296
    .line 1297
    return-object v0

    .line 1298
    :pswitch_a
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 1299
    .line 1300
    check-cast v12, La/l7m0;

    .line 1301
    .line 1302
    iget-wide v0, v0, La/as0;->b:J

    .line 1303
    .line 1304
    check-cast v11, La/w03;

    .line 1305
    .line 1306
    move-object/from16 v3, p1

    .line 1307
    .line 1308
    check-cast v3, La/fhl;

    .line 1309
    .line 1310
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    invoke-interface {v13}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v4

    .line 1317
    check-cast v4, Ljava/lang/Number;

    .line 1318
    .line 1319
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 1320
    .line 1321
    .line 1322
    move-result v4

    .line 1323
    invoke-static {v14, v4}, Ljava/lang/Math;->min(FF)F

    .line 1324
    .line 1325
    .line 1326
    move-result v5

    .line 1327
    sub-float v5, v5, v23

    .line 1328
    .line 1329
    invoke-static {v5, v15}, Ljava/lang/Math;->max(FF)F

    .line 1330
    .line 1331
    .line 1332
    move-result v5

    .line 1333
    mul-float v5, v5, v22

    .line 1334
    .line 1335
    div-float v5, v5, v21

    .line 1336
    .line 1337
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1338
    .line 1339
    .line 1340
    move-result v4

    .line 1341
    sub-float/2addr v4, v14

    .line 1342
    invoke-static {v4, v15, v10}, La/l1e0;->c(FFF)F

    .line 1343
    .line 1344
    .line 1345
    move-result v4

    .line 1346
    float-to-double v6, v4

    .line 1347
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 1348
    .line 1349
    .line 1350
    move-result-wide v6

    .line 1351
    double-to-float v6, v6

    .line 1352
    div-float v6, v6, v20

    .line 1353
    .line 1354
    sub-float/2addr v4, v6

    .line 1355
    mul-float v6, v5, v19

    .line 1356
    .line 1357
    mul-float v13, v5, v23

    .line 1358
    .line 1359
    add-float v13, v13, v18

    .line 1360
    .line 1361
    add-float/2addr v13, v4

    .line 1362
    mul-float v13, v13, v17

    .line 1363
    .line 1364
    mul-float v4, v13, v16

    .line 1365
    .line 1366
    add-float/2addr v6, v13

    .line 1367
    mul-float v6, v6, v16

    .line 1368
    .line 1369
    invoke-static {v14, v5}, Ljava/lang/Math;->min(FF)F

    .line 1370
    .line 1371
    .line 1372
    move-result v5

    .line 1373
    new-instance v7, La/isl;

    .line 1374
    .line 1375
    invoke-direct {v7, v13, v4, v6, v5}, La/isl;-><init>(FFFF)V

    .line 1376
    .line 1377
    .line 1378
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v5

    .line 1382
    check-cast v5, Ljava/lang/Number;

    .line 1383
    .line 1384
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 1385
    .line 1386
    .line 1387
    move-result v33

    .line 1388
    invoke-interface {v3}, La/fhl;->E0()J

    .line 1389
    .line 1390
    .line 1391
    move-result-wide v8

    .line 1392
    invoke-interface {v3}, La/fhl;->A0()La/nr;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v5

    .line 1396
    invoke-virtual {v5}, La/nr;->p()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v14

    .line 1400
    invoke-virtual {v5}, La/nr;->i()La/x5a;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v12

    .line 1404
    invoke-interface {v12}, La/x5a;->l()V

    .line 1405
    .line 1406
    .line 1407
    :try_start_1
    iget-object v12, v5, La/nr;->b:Ljava/lang/Object;

    .line 1408
    .line 1409
    check-cast v12, La/fvt0;

    .line 1410
    .line 1411
    invoke-virtual {v12, v13, v8, v9}, La/fvt0;->y(FJ)V

    .line 1412
    .line 1413
    .line 1414
    invoke-interface {v3, v2}, La/w6k;->w0(F)F

    .line 1415
    .line 1416
    .line 1417
    move-result v2

    .line 1418
    sget v8, La/mom;->d:F

    .line 1419
    .line 1420
    invoke-interface {v3, v8}, La/w6k;->w0(F)F

    .line 1421
    .line 1422
    .line 1423
    move-result v9

    .line 1424
    div-float/2addr v9, v10

    .line 1425
    add-float/2addr v9, v2

    .line 1426
    invoke-interface {v3}, La/fhl;->d()J

    .line 1427
    .line 1428
    .line 1429
    move-result-wide v12

    .line 1430
    invoke-static {v12, v13}, La/p7x;->u(J)J

    .line 1431
    .line 1432
    .line 1433
    move-result-wide v12

    .line 1434
    invoke-static {v9, v12, v13}, La/k9x;->q(FJ)La/jge0;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v2

    .line 1438
    sub-float v28, v6, v4

    .line 1439
    .line 1440
    invoke-virtual {v2}, La/jge0;->g()J

    .line 1441
    .line 1442
    .line 1443
    move-result-wide v29

    .line 1444
    invoke-virtual {v2}, La/jge0;->f()J

    .line 1445
    .line 1446
    .line 1447
    move-result-wide v31

    .line 1448
    new-instance v16, La/vtm0;

    .line 1449
    .line 1450
    invoke-interface {v3, v8}, La/w6k;->w0(F)F

    .line 1451
    .line 1452
    .line 1453
    move-result v17

    .line 1454
    const/16 v21, 0x0

    .line 1455
    .line 1456
    const/16 v22, 0x1a

    .line 1457
    .line 1458
    const/16 v18, 0x0

    .line 1459
    .line 1460
    const/16 v19, 0x0

    .line 1461
    .line 1462
    const/16 v20, 0x0

    .line 1463
    .line 1464
    invoke-direct/range {v16 .. v22}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1465
    .line 1466
    .line 1467
    const/16 v35, 0x300

    .line 1468
    .line 1469
    move-wide/from16 v25, v0

    .line 1470
    .line 1471
    move-object/from16 v24, v3

    .line 1472
    .line 1473
    move/from16 v27, v4

    .line 1474
    .line 1475
    move-object/from16 v34, v16

    .line 1476
    .line 1477
    invoke-static/range {v24 .. v35}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 1478
    .line 1479
    .line 1480
    move-object/from16 v30, v7

    .line 1481
    .line 1482
    move/from16 v31, v8

    .line 1483
    .line 1484
    move-wide/from16 v27, v25

    .line 1485
    .line 1486
    move/from16 v29, v33

    .line 1487
    .line 1488
    move-object/from16 v26, v2

    .line 1489
    .line 1490
    move-object/from16 v25, v11

    .line 1491
    .line 1492
    invoke-static/range {v24 .. v31}, La/mom;->e(La/fhl;La/w03;La/jge0;JFLa/isl;F)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1493
    .line 1494
    .line 1495
    invoke-static {v5, v14, v15}, Lc;->g(La/nr;J)V

    .line 1496
    .line 1497
    .line 1498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1499
    .line 1500
    return-object v0

    .line 1501
    :catchall_1
    move-exception v0

    .line 1502
    invoke-static {v5, v14, v15}, Lc;->g(La/nr;J)V

    .line 1503
    .line 1504
    .line 1505
    throw v0

    .line 1506
    :pswitch_b
    check-cast v13, La/pu90;

    .line 1507
    .line 1508
    check-cast v12, La/pu90;

    .line 1509
    .line 1510
    check-cast v11, La/pu90;

    .line 1511
    .line 1512
    move-object/from16 v0, p1

    .line 1513
    .line 1514
    check-cast v0, La/ou90;

    .line 1515
    .line 1516
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1517
    .line 1518
    .line 1519
    if-eqz v13, :cond_1a

    .line 1520
    .line 1521
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 1522
    .line 1523
    .line 1524
    move-result v1

    .line 1525
    iget v2, v13, La/pu90;->a:I

    .line 1526
    .line 1527
    sub-int/2addr v1, v2

    .line 1528
    const/16 v34, 0x2

    .line 1529
    .line 1530
    div-int/lit8 v1, v1, 0x2

    .line 1531
    .line 1532
    invoke-static {v5, v6}, La/p4e;->h(J)I

    .line 1533
    .line 1534
    .line 1535
    move-result v2

    .line 1536
    iget v3, v13, La/pu90;->b:I

    .line 1537
    .line 1538
    sub-int/2addr v2, v3

    .line 1539
    invoke-virtual {v0, v13, v1, v2, v15}, La/ou90;->m(La/pu90;IIF)V

    .line 1540
    .line 1541
    .line 1542
    goto :goto_15

    .line 1543
    :cond_1a
    const/16 v34, 0x2

    .line 1544
    .line 1545
    :goto_15
    if-eqz v12, :cond_1b

    .line 1546
    .line 1547
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 1548
    .line 1549
    .line 1550
    move-result v1

    .line 1551
    iget v2, v12, La/pu90;->a:I

    .line 1552
    .line 1553
    sub-int/2addr v1, v2

    .line 1554
    div-int/lit8 v1, v1, 0x2

    .line 1555
    .line 1556
    invoke-static {v5, v6}, La/p4e;->h(J)I

    .line 1557
    .line 1558
    .line 1559
    move-result v2

    .line 1560
    iget v3, v12, La/pu90;->b:I

    .line 1561
    .line 1562
    sub-int/2addr v2, v3

    .line 1563
    invoke-virtual {v0, v12, v1, v2, v15}, La/ou90;->m(La/pu90;IIF)V

    .line 1564
    .line 1565
    .line 1566
    :cond_1b
    if-eqz v11, :cond_1c

    .line 1567
    .line 1568
    invoke-static {v5, v6}, La/p4e;->h(J)I

    .line 1569
    .line 1570
    .line 1571
    move-result v1

    .line 1572
    iget v2, v11, La/pu90;->b:I

    .line 1573
    .line 1574
    sub-int/2addr v1, v2

    .line 1575
    const/4 v2, 0x0

    .line 1576
    invoke-virtual {v0, v11, v2, v1, v15}, La/ou90;->m(La/pu90;IIF)V

    .line 1577
    .line 1578
    .line 1579
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1580
    .line 1581
    return-object v0

    .line 1582
    :pswitch_c
    check-cast v13, La/jge0;

    .line 1583
    .line 1584
    check-cast v12, La/mie0;

    .line 1585
    .line 1586
    iget-wide v2, v0, La/as0;->b:J

    .line 1587
    .line 1588
    move-object v7, v11

    .line 1589
    check-cast v7, La/a4d;

    .line 1590
    .line 1591
    move-object/from16 v0, p1

    .line 1592
    .line 1593
    check-cast v0, La/g7z;

    .line 1594
    .line 1595
    invoke-virtual {v0}, La/g7z;->a()V

    .line 1596
    .line 1597
    .line 1598
    iget v10, v13, La/jge0;->a:F

    .line 1599
    .line 1600
    iget v11, v13, La/jge0;->b:F

    .line 1601
    .line 1602
    iget-object v13, v0, La/g7z;->a:La/a6a;

    .line 1603
    .line 1604
    iget-object v1, v13, La/a6a;->b:La/nr;

    .line 1605
    .line 1606
    iget-object v1, v1, La/nr;->b:Ljava/lang/Object;

    .line 1607
    .line 1608
    check-cast v1, La/fvt0;

    .line 1609
    .line 1610
    invoke-virtual {v1, v10, v11}, La/fvt0;->A(FF)V

    .line 1611
    .line 1612
    .line 1613
    :try_start_2
    iget-object v1, v12, La/mie0;->a:Ljava/lang/Object;

    .line 1614
    .line 1615
    check-cast v1, La/vz2;

    .line 1616
    .line 1617
    const/4 v8, 0x0

    .line 1618
    const/16 v9, 0x37a

    .line 1619
    .line 1620
    const-wide/16 v4, 0x0

    .line 1621
    .line 1622
    const/4 v6, 0x0

    .line 1623
    invoke-static/range {v0 .. v9}, La/fhl;->b0(La/fhl;La/vz2;JJFLa/a4d;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1624
    .line 1625
    .line 1626
    iget-object v0, v13, La/a6a;->b:La/nr;

    .line 1627
    .line 1628
    iget-object v0, v0, La/nr;->b:Ljava/lang/Object;

    .line 1629
    .line 1630
    check-cast v0, La/fvt0;

    .line 1631
    .line 1632
    neg-float v1, v10

    .line 1633
    neg-float v2, v11

    .line 1634
    invoke-virtual {v0, v1, v2}, La/fvt0;->A(FF)V

    .line 1635
    .line 1636
    .line 1637
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1638
    .line 1639
    return-object v0

    .line 1640
    :catchall_2
    move-exception v0

    .line 1641
    iget-object v1, v13, La/a6a;->b:La/nr;

    .line 1642
    .line 1643
    iget-object v1, v1, La/nr;->b:Ljava/lang/Object;

    .line 1644
    .line 1645
    check-cast v1, La/fvt0;

    .line 1646
    .line 1647
    neg-float v2, v10

    .line 1648
    neg-float v3, v11

    .line 1649
    invoke-virtual {v1, v2, v3}, La/fvt0;->A(FF)V

    .line 1650
    .line 1651
    .line 1652
    throw v0

    .line 1653
    :pswitch_d
    check-cast v13, La/pru;

    .line 1654
    .line 1655
    check-cast v12, La/bzt;

    .line 1656
    .line 1657
    check-cast v11, La/wyu;

    .line 1658
    .line 1659
    move-object/from16 v1, p1

    .line 1660
    .line 1661
    check-cast v1, La/vzg0;

    .line 1662
    .line 1663
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    invoke-virtual {v13}, La/pru;->a()La/sff0;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 1671
    .line 1672
    iget-boolean v2, v1, La/hl1;->N:Z

    .line 1673
    .line 1674
    iget-object v1, v1, La/hl1;->u:La/ep0;

    .line 1675
    .line 1676
    iget-object v3, v12, La/bzt;->a:La/fsd;

    .line 1677
    .line 1678
    invoke-virtual {v3}, La/fsd;->a()La/v8d;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v3

    .line 1682
    iget v3, v3, La/v8d;->r:I

    .line 1683
    .line 1684
    invoke-virtual {v11}, La/wyu;->a()La/uaq0;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v22

    .line 1688
    new-instance v13, La/ur0;

    .line 1689
    .line 1690
    iget-wide v14, v0, La/as0;->b:J

    .line 1691
    .line 1692
    sget-object v16, La/u5q;->a:La/u5q;

    .line 1693
    .line 1694
    sget-object v17, La/qlk0;->a:La/qlk0;

    .line 1695
    .line 1696
    sget-object v18, La/x5d0;->a:La/x5d0;

    .line 1697
    .line 1698
    move-object/from16 v19, v1

    .line 1699
    .line 1700
    move/from16 v20, v2

    .line 1701
    .line 1702
    move/from16 v21, v3

    .line 1703
    .line 1704
    invoke-direct/range {v13 .. v22}, La/ur0;-><init>(JLa/v5q;La/rlk0;La/y5d0;La/ep0;ZILa/uaq0;)V

    .line 1705
    .line 1706
    .line 1707
    return-object v13

    .line 1708
    nop

    .line 1709
    :pswitch_data_0
    .packed-switch 0x0
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
