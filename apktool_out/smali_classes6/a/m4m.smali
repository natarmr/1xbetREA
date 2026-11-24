.class public final synthetic La/m4m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/d9d0;ZFFLa/yjj0;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/m4m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m4m;->e:Ljava/lang/Object;

    iput-boolean p2, p0, La/m4m;->d:Z

    iput p3, p0, La/m4m;->b:F

    iput p4, p0, La/m4m;->c:F

    iput-object p5, p0, La/m4m;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/j4m;FZFLa/x03;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/m4m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m4m;->e:Ljava/lang/Object;

    iput p2, p0, La/m4m;->b:F

    iput-boolean p3, p0, La/m4m;->d:Z

    iput p4, p0, La/m4m;->c:F

    iput-object p5, p0, La/m4m;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/prm;FFZ)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/m4m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m4m;->e:Ljava/lang/Object;

    iput-object p2, p0, La/m4m;->f:Ljava/lang/Object;

    iput p3, p0, La/m4m;->b:F

    iput p4, p0, La/m4m;->c:F

    iput-boolean p5, p0, La/m4m;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m4m;->a:B

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget v6, v0, La/m4m;->b:F

    .line 12
    .line 13
    iget-boolean v7, v0, La/m4m;->d:Z

    .line 14
    .line 15
    iget-object v8, v0, La/m4m;->f:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v9, v0, La/m4m;->e:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v9, La/d9d0;

    .line 23
    .line 24
    check-cast v8, La/yjj0;

    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/uag0;

    .line 29
    .line 30
    iget-object v10, v9, La/d9d0;->a:La/t33;

    .line 31
    .line 32
    invoke-virtual {v10}, La/t33;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    check-cast v10, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    cmpl-float v10, v10, v5

    .line 43
    .line 44
    const/4 v11, 0x1

    .line 45
    if-gtz v10, :cond_1

    .line 46
    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v4, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    move v4, v11

    .line 53
    :goto_1
    iget-object v7, v9, La/d9d0;->a:La/t33;

    .line 54
    .line 55
    invoke-virtual {v7}, La/t33;->d()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    int-to-float v6, v6

    .line 70
    mul-float/2addr v7, v6

    .line 71
    iget-wide v9, v1, La/uag0;->r:J

    .line 72
    .line 73
    and-long/2addr v2, v9

    .line 74
    long-to-int v2, v2

    .line 75
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    sub-float/2addr v7, v2

    .line 80
    invoke-virtual {v1, v7}, La/uag0;->I(F)V

    .line 81
    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    iget-object v2, v1, La/uag0;->t:La/w6k;

    .line 86
    .line 87
    invoke-interface {v2}, La/w6k;->getDensity()F

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    iget v0, v0, La/m4m;->c:F

    .line 92
    .line 93
    mul-float v5, v2, v0

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v1, v5}, La/uag0;->C(F)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v8}, La/uag0;->D(La/yjj0;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v11}, La/uag0;->g(Z)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    check-cast v8, La/prm;

    .line 110
    .line 111
    move-object/from16 v1, p1

    .line 112
    .line 113
    check-cast v1, La/ne60;

    .line 114
    .line 115
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v6, v8, La/prm;->d:La/a4x;

    .line 119
    .line 120
    iget-wide v2, v1, La/ne60;->a:J

    .line 121
    .line 122
    iget v4, v0, La/m4m;->b:F

    .line 123
    .line 124
    iget v5, v0, La/m4m;->c:F

    .line 125
    .line 126
    iget-boolean v7, v0, La/m4m;->d:Z

    .line 127
    .line 128
    invoke-static/range {v2 .. v7}, La/qcc;->N(JFFLa/a4x;Z)F

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_1
    check-cast v9, La/j4m;

    .line 143
    .line 144
    iget v0, v0, La/m4m;->c:F

    .line 145
    .line 146
    move-object/from16 v19, v8

    .line 147
    .line 148
    check-cast v19, La/x03;

    .line 149
    .line 150
    move-object/from16 v10, p1

    .line 151
    .line 152
    check-cast v10, La/fhl;

    .line 153
    .line 154
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v1, v9, La/j4m;->d:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/4 v8, 0x0

    .line 164
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_8

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    add-int/lit8 v21, v8, 0x1

    .line 175
    .line 176
    if-ltz v8, :cond_7

    .line 177
    .line 178
    check-cast v9, La/r4m;

    .line 179
    .line 180
    int-to-float v8, v8

    .line 181
    mul-float/2addr v8, v6

    .line 182
    iget-object v11, v9, La/r4m;->c:La/a9q0;

    .line 183
    .line 184
    iget-wide v11, v11, La/a9q0;->c:J

    .line 185
    .line 186
    and-long/2addr v11, v2

    .line 187
    long-to-int v11, v11

    .line 188
    int-to-float v11, v11

    .line 189
    const/high16 v22, 0x40000000    # 2.0f

    .line 190
    .line 191
    div-float v11, v11, v22

    .line 192
    .line 193
    add-float/2addr v8, v11

    .line 194
    iget-boolean v11, v9, La/r4m;->a:Z

    .line 195
    .line 196
    const/16 v23, 0x20

    .line 197
    .line 198
    if-eqz v11, :cond_4

    .line 199
    .line 200
    const/high16 v11, 0x3f800000    # 1.0f

    .line 201
    .line 202
    if-eqz v7, :cond_3

    .line 203
    .line 204
    const/high16 v12, -0x40800000    # -1.0f

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_3
    move v12, v11

    .line 208
    :goto_3
    invoke-interface {v10}, La/fhl;->E0()J

    .line 209
    .line 210
    .line 211
    move-result-wide v13

    .line 212
    invoke-interface {v10}, La/fhl;->A0()La/nr;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    move-wide/from16 v24, v2

    .line 217
    .line 218
    invoke-virtual {v15}, La/nr;->p()J

    .line 219
    .line 220
    .line 221
    move-result-wide v2

    .line 222
    invoke-virtual {v15}, La/nr;->i()La/x5a;

    .line 223
    .line 224
    .line 225
    move-result-object v16

    .line 226
    invoke-interface/range {v16 .. v16}, La/x5a;->l()V

    .line 227
    .line 228
    .line 229
    move/from16 v26, v5

    .line 230
    .line 231
    :try_start_0
    iget-object v5, v15, La/nr;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v5, La/fvt0;

    .line 234
    .line 235
    invoke-virtual {v5, v12, v11, v13, v14}, La/fvt0;->z(FFJ)V

    .line 236
    .line 237
    .line 238
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 239
    .line 240
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 241
    .line 242
    .line 243
    move-result-wide v11

    .line 244
    invoke-static/range {v26 .. v26}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    int-to-long v13, v5

    .line 249
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    int-to-long v4, v5

    .line 254
    shl-long v13, v13, v23

    .line 255
    .line 256
    and-long v4, v4, v24

    .line 257
    .line 258
    or-long/2addr v13, v4

    .line 259
    invoke-interface {v10}, La/fhl;->d()J

    .line 260
    .line 261
    .line 262
    move-result-wide v4

    .line 263
    shr-long v4, v4, v23

    .line 264
    .line 265
    long-to-int v4, v4

    .line 266
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    sget v5, La/q4m;->a:F

    .line 271
    .line 272
    invoke-interface {v10, v5}, La/w6k;->w0(F)F

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    sub-float/2addr v4, v5

    .line 277
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    int-to-long v4, v4

    .line 282
    move/from16 v17, v0

    .line 283
    .line 284
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 285
    .line 286
    .line 287
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 288
    move-object/from16 p0, v1

    .line 289
    .line 290
    int-to-long v0, v0

    .line 291
    shl-long v4, v4, v23

    .line 292
    .line 293
    and-long v0, v0, v24

    .line 294
    .line 295
    or-long/2addr v0, v4

    .line 296
    const/16 v18, 0x0

    .line 297
    .line 298
    const/16 v20, 0x1d0

    .line 299
    .line 300
    move-wide/from16 v27, v0

    .line 301
    .line 302
    move-object v1, v15

    .line 303
    move-wide/from16 v15, v27

    .line 304
    .line 305
    :try_start_1
    invoke-static/range {v10 .. v20}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 306
    .line 307
    .line 308
    invoke-static {v1, v2, v3}, Lc;->g(La/nr;J)V

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :catchall_0
    move-exception v0

    .line 313
    goto :goto_4

    .line 314
    :catchall_1
    move-exception v0

    .line 315
    move-object v1, v15

    .line 316
    :goto_4
    invoke-static {v1, v2, v3}, Lc;->g(La/nr;J)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :cond_4
    move/from16 v17, v0

    .line 321
    .line 322
    move-object/from16 p0, v1

    .line 323
    .line 324
    move-wide/from16 v24, v2

    .line 325
    .line 326
    move/from16 v26, v5

    .line 327
    .line 328
    :goto_5
    iget-boolean v0, v9, La/r4m;->b:Z

    .line 329
    .line 330
    if-eqz v0, :cond_6

    .line 331
    .line 332
    iget-object v11, v9, La/r4m;->c:La/a9q0;

    .line 333
    .line 334
    iget-wide v0, v11, La/a9q0;->c:J

    .line 335
    .line 336
    and-long v0, v0, v24

    .line 337
    .line 338
    long-to-int v0, v0

    .line 339
    int-to-float v0, v0

    .line 340
    div-float v0, v0, v22

    .line 341
    .line 342
    sub-float/2addr v8, v0

    .line 343
    if-eqz v7, :cond_5

    .line 344
    .line 345
    const/4 v0, 0x0

    .line 346
    invoke-virtual {v11, v0}, La/a9q0;->g(I)F

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    neg-float v0, v1

    .line 351
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    int-to-long v0, v0

    .line 356
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    int-to-long v2, v2

    .line 361
    shl-long v0, v0, v23

    .line 362
    .line 363
    and-long v2, v2, v24

    .line 364
    .line 365
    or-long/2addr v0, v2

    .line 366
    move-wide v14, v0

    .line 367
    const/4 v1, 0x0

    .line 368
    goto :goto_6

    .line 369
    :cond_5
    invoke-interface {v10}, La/fhl;->d()J

    .line 370
    .line 371
    .line 372
    move-result-wide v0

    .line 373
    shr-long v0, v0, v23

    .line 374
    .line 375
    long-to-int v0, v0

    .line 376
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    const/4 v1, 0x0

    .line 381
    invoke-virtual {v11, v1}, La/a9q0;->h(I)F

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    sub-float/2addr v0, v2

    .line 386
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    int-to-long v2, v0

    .line 391
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    int-to-long v4, v0

    .line 396
    shl-long v2, v2, v23

    .line 397
    .line 398
    and-long v4, v4, v24

    .line 399
    .line 400
    or-long/2addr v2, v4

    .line 401
    move-wide v14, v2

    .line 402
    :goto_6
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 403
    .line 404
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 405
    .line 406
    .line 407
    move-result-wide v12

    .line 408
    const/16 v16, 0xf8

    .line 409
    .line 410
    invoke-static/range {v10 .. v16}, La/v2n0;->o(La/fhl;La/a9q0;JJI)V

    .line 411
    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_6
    const/4 v1, 0x0

    .line 415
    :goto_7
    move-object/from16 v1, p0

    .line 416
    .line 417
    move/from16 v0, v17

    .line 418
    .line 419
    move/from16 v8, v21

    .line 420
    .line 421
    move-wide/from16 v2, v24

    .line 422
    .line 423
    move/from16 v5, v26

    .line 424
    .line 425
    goto/16 :goto_2

    .line 426
    .line 427
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 428
    .line 429
    .line 430
    const/4 v0, 0x0

    .line 431
    throw v0

    .line 432
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    return-object v0

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
