.class public final synthetic La/eta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cgk0;

.field public final synthetic c:La/cgk0;

.field public final synthetic d:I

.field public final synthetic e:La/t33;

.field public final synthetic f:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/cgk0;La/cgk0;ILa/t33;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/eta;->a:B

    iput-object p1, p0, La/eta;->b:La/cgk0;

    iput-object p2, p0, La/eta;->c:La/cgk0;

    iput p3, p0, La/eta;->d:I

    iput-object p4, p0, La/eta;->e:La/t33;

    iput-object p5, p0, La/eta;->f:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eta;->a:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    iget-object v7, v0, La/eta;->f:La/l7m0;

    .line 16
    .line 17
    iget-object v8, v0, La/eta;->e:La/t33;

    .line 18
    .line 19
    iget v9, v0, La/eta;->d:I

    .line 20
    .line 21
    iget-object v10, v0, La/eta;->c:La/cgk0;

    .line 22
    .line 23
    iget-object v0, v0, La/eta;->b:La/cgk0;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v11, p1

    .line 29
    .line 30
    check-cast v11, La/fhl;

    .line 31
    .line 32
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v1, La/qmk;->a:La/zcl;

    .line 36
    .line 37
    const/high16 v1, 0x41600000    # 14.0f

    .line 38
    .line 39
    invoke-interface {v11, v1}, La/w6k;->w0(F)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    int-to-long v12, v12

    .line 48
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    int-to-long v14, v1

    .line 53
    shl-long/2addr v12, v6

    .line 54
    and-long/2addr v4, v14

    .line 55
    or-long v18, v12, v4

    .line 56
    .line 57
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eq v1, v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v2, :cond_0

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_0
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ne v9, v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-le v1, v0, :cond_1

    .line 86
    .line 87
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    sub-float v0, v3, v0

    .line 109
    .line 110
    :goto_0
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 111
    .line 112
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    invoke-static {v0, v2, v3, v4, v5}, La/o050;->O(FJJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    :goto_1
    move-wide v12, v0

    .line 125
    goto :goto_4

    .line 126
    :cond_2
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-ne v9, v1, :cond_4

    .line 131
    .line 132
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-le v1, v0, :cond_3

    .line 141
    .line 142
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    goto :goto_2

    .line 153
    :cond_3
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    sub-float v0, v3, v0

    .line 164
    .line 165
    :goto_2
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 166
    .line 167
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v2

    .line 171
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    invoke-static {v0, v2, v3, v4, v5}, La/o050;->O(FJJ)J

    .line 176
    .line 177
    .line 178
    move-result-wide v0

    .line 179
    goto :goto_1

    .line 180
    :cond_4
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 181
    .line 182
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 183
    .line 184
    .line 185
    move-result-wide v0

    .line 186
    goto :goto_1

    .line 187
    :cond_5
    :goto_3
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-ne v9, v0, :cond_6

    .line 198
    .line 199
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 200
    .line 201
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 202
    .line 203
    .line 204
    move-result-wide v0

    .line 205
    goto :goto_1

    .line 206
    :cond_6
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 207
    .line 208
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v0

    .line 212
    goto :goto_1

    .line 213
    :goto_4
    invoke-interface {v11}, La/fhl;->d()J

    .line 214
    .line 215
    .line 216
    move-result-wide v16

    .line 217
    const/16 v20, 0x0

    .line 218
    .line 219
    const/16 v21, 0xf2

    .line 220
    .line 221
    const-wide/16 v14, 0x0

    .line 222
    .line 223
    invoke-static/range {v11 .. v21}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 224
    .line 225
    .line 226
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_0
    move-object/from16 v1, p1

    .line 230
    .line 231
    check-cast v1, La/fhl;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    sget-object v11, La/qmk;->a:La/zcl;

    .line 237
    .line 238
    const/high16 v11, 0x43b40000    # 360.0f

    .line 239
    .line 240
    invoke-interface {v1, v11}, La/w6k;->w0(F)F

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    int-to-long v12, v12

    .line 249
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    int-to-long v14, v11

    .line 254
    shl-long v11, v12, v6

    .line 255
    .line 256
    and-long/2addr v4, v14

    .line 257
    or-long/2addr v4, v11

    .line 258
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eq v6, v2, :cond_c

    .line 263
    .line 264
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-ne v6, v2, :cond_7

    .line 269
    .line 270
    goto/16 :goto_7

    .line 271
    .line 272
    :cond_7
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-ne v9, v2, :cond_9

    .line 277
    .line 278
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-le v2, v0, :cond_8

    .line 287
    .line 288
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    goto :goto_5

    .line 299
    :cond_8
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Ljava/lang/Number;

    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    sub-float v0, v3, v0

    .line 310
    .line 311
    :goto_5
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 312
    .line 313
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 314
    .line 315
    .line 316
    move-result-wide v6

    .line 317
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v2

    .line 321
    invoke-static {v0, v6, v7, v2, v3}, La/j120;->W(FJJ)J

    .line 322
    .line 323
    .line 324
    move-result-wide v2

    .line 325
    goto :goto_8

    .line 326
    :cond_9
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-ne v9, v2, :cond_b

    .line 331
    .line 332
    invoke-virtual {v10}, La/cgk0;->l()I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-le v2, v0, :cond_a

    .line 341
    .line 342
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    goto :goto_6

    .line 353
    :cond_a
    invoke-virtual {v8}, La/t33;->d()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, Ljava/lang/Number;

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    sub-float v0, v3, v0

    .line 364
    .line 365
    :goto_6
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 366
    .line 367
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v2

    .line 375
    invoke-static {v0, v6, v7, v2, v3}, La/j120;->W(FJJ)J

    .line 376
    .line 377
    .line 378
    move-result-wide v2

    .line 379
    goto :goto_8

    .line 380
    :cond_b
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 381
    .line 382
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 383
    .line 384
    .line 385
    move-result-wide v2

    .line 386
    goto :goto_8

    .line 387
    :cond_c
    :goto_7
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    check-cast v0, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-ne v9, v0, :cond_d

    .line 398
    .line 399
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 400
    .line 401
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 402
    .line 403
    .line 404
    move-result-wide v2

    .line 405
    goto :goto_8

    .line 406
    :cond_d
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 407
    .line 408
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite40-0d7_KjU()J

    .line 409
    .line 410
    .line 411
    move-result-wide v2

    .line 412
    :goto_8
    invoke-interface {v1}, La/fhl;->d()J

    .line 413
    .line 414
    .line 415
    move-result-wide v6

    .line 416
    const/4 v10, 0x0

    .line 417
    const/16 v11, 0xf2

    .line 418
    .line 419
    move-wide v8, v4

    .line 420
    const-wide/16 v4, 0x0

    .line 421
    .line 422
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 423
    .line 424
    .line 425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object v0

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
