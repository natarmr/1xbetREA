.class public final synthetic La/a1l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(FLjava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/a1l;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/a1l;->c:F

    iput-object p2, p0, La/a1l;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;F)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/a1l;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a1l;->b:Ljava/util/ArrayList;

    iput p2, p0, La/a1l;->c:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a1l;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/a1l;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    check-cast v3, La/fhl;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v1, La/qmk;->a:La/zcl;

    .line 18
    .line 19
    const/high16 v1, 0x41000000    # 8.0f

    .line 20
    .line 21
    invoke-interface {v3, v1}, La/w6k;->w0(F)F

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-interface {v3}, La/fhl;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    invoke-static {v6, v7}, La/h7k0;->d(J)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    sub-float/2addr v4, v5

    .line 34
    const/high16 v11, 0x40000000    # 2.0f

    .line 35
    .line 36
    div-float v12, v4, v11

    .line 37
    .line 38
    const v4, 0x40c90fdb

    .line 39
    .line 40
    .line 41
    mul-float/2addr v4, v12

    .line 42
    const/high16 v6, 0x43b40000    # 360.0f

    .line 43
    .line 44
    div-float v4, v6, v4

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    const/4 v8, 0x1

    .line 51
    const/4 v9, 0x0

    .line 52
    if-le v7, v8, :cond_0

    .line 53
    .line 54
    const/high16 v7, 0x40800000    # 4.0f

    .line 55
    .line 56
    invoke-interface {v3, v7}, La/w6k;->w0(F)F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    add-float/2addr v7, v5

    .line 61
    mul-float/2addr v7, v4

    .line 62
    move v15, v7

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v15, v9

    .line 65
    :goto_0
    invoke-interface {v3, v1}, La/w6k;->w0(F)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    mul-float/2addr v1, v4

    .line 70
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    int-to-float v4, v4

    .line 75
    mul-float/2addr v4, v15

    .line 76
    sub-float/2addr v6, v4

    .line 77
    new-instance v4, Ljava/util/ArrayList;

    .line 78
    .line 79
    const/16 v7, 0xa

    .line 80
    .line 81
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_1

    .line 97
    .line 98
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    check-cast v10, La/g1p0;

    .line 103
    .line 104
    iget v10, v10, La/g1p0;->b:I

    .line 105
    .line 106
    int-to-float v10, v10

    .line 107
    mul-float/2addr v10, v6

    .line 108
    iget v13, v0, La/a1l;->c:F

    .line 109
    .line 110
    div-float/2addr v10, v13

    .line 111
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    move v6, v9

    .line 124
    move v8, v6

    .line 125
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-eqz v10, :cond_3

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    check-cast v10, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    cmpg-float v13, v10, v1

    .line 142
    .line 143
    if-gez v13, :cond_2

    .line 144
    .line 145
    sub-float v10, v1, v10

    .line 146
    .line 147
    add-float/2addr v8, v10

    .line 148
    goto :goto_2

    .line 149
    :cond_2
    sub-float/2addr v10, v1

    .line 150
    add-float/2addr v6, v10

    .line 151
    goto :goto_2

    .line 152
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-static {v4, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-eqz v7, :cond_6

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    check-cast v7, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    cmpg-float v10, v7, v1

    .line 182
    .line 183
    if-gtz v10, :cond_4

    .line 184
    .line 185
    move v7, v1

    .line 186
    goto :goto_4

    .line 187
    :cond_4
    cmpl-float v10, v6, v9

    .line 188
    .line 189
    if-lez v10, :cond_5

    .line 190
    .line 191
    sub-float v10, v7, v1

    .line 192
    .line 193
    mul-float/2addr v10, v8

    .line 194
    div-float/2addr v10, v6

    .line 195
    sub-float/2addr v7, v10

    .line 196
    :cond_5
    :goto_4
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_6
    new-instance v4, La/vtm0;

    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    const/16 v10, 0x1a

    .line 208
    .line 209
    const/4 v6, 0x0

    .line 210
    const/4 v7, 0x1

    .line 211
    const/4 v8, 0x0

    .line 212
    invoke-direct/range {v4 .. v10}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 213
    .line 214
    .line 215
    mul-float/2addr v12, v11

    .line 216
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    int-to-long v5, v1

    .line 221
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    int-to-long v7, v1

    .line 226
    const/16 v1, 0x20

    .line 227
    .line 228
    shl-long/2addr v5, v1

    .line 229
    const-wide v9, 0xffffffffL

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    and-long/2addr v7, v9

    .line 235
    or-long/2addr v5, v7

    .line 236
    invoke-interface {v3}, La/fhl;->d()J

    .line 237
    .line 238
    .line 239
    move-result-wide v7

    .line 240
    shr-long/2addr v7, v1

    .line 241
    long-to-int v7, v7

    .line 242
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    shr-long v12, v5, v1

    .line 247
    .line 248
    long-to-int v8, v12

    .line 249
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    sub-float/2addr v7, v8

    .line 254
    div-float/2addr v7, v11

    .line 255
    invoke-interface {v3}, La/fhl;->d()J

    .line 256
    .line 257
    .line 258
    move-result-wide v12

    .line 259
    and-long/2addr v12, v9

    .line 260
    long-to-int v8, v12

    .line 261
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    and-long v12, v5, v9

    .line 266
    .line 267
    long-to-int v12, v12

    .line 268
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    sub-float/2addr v8, v12

    .line 273
    div-float/2addr v8, v11

    .line 274
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    int-to-long v11, v7

    .line 279
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    int-to-long v7, v7

    .line 284
    shl-long/2addr v11, v1

    .line 285
    and-long/2addr v7, v9

    .line 286
    or-long v8, v11, v7

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-eqz v10, :cond_8

    .line 300
    .line 301
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v10

    .line 305
    add-int/lit8 v16, v7, 0x1

    .line 306
    .line 307
    if-ltz v7, :cond_7

    .line 308
    .line 309
    check-cast v10, La/g1p0;

    .line 310
    .line 311
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    check-cast v7, Ljava/lang/Number;

    .line 316
    .line 317
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    iget-wide v10, v10, La/g1p0;->d:J

    .line 322
    .line 323
    const/4 v12, 0x0

    .line 324
    const/16 v14, 0x340

    .line 325
    .line 326
    move-object v13, v4

    .line 327
    move-wide/from16 v17, v5

    .line 328
    .line 329
    move v6, v2

    .line 330
    move-wide v4, v10

    .line 331
    move-wide/from16 v10, v17

    .line 332
    .line 333
    invoke-static/range {v3 .. v14}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 334
    .line 335
    .line 336
    move-object v4, v13

    .line 337
    add-float/2addr v7, v15

    .line 338
    add-float v2, v7, v6

    .line 339
    .line 340
    move-wide v5, v10

    .line 341
    move/from16 v7, v16

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 345
    .line 346
    .line 347
    const/4 v0, 0x0

    .line 348
    throw v0

    .line 349
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_0
    move-object/from16 v1, p1

    .line 353
    .line 354
    check-cast v1, La/fhl;

    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    new-instance v3, La/vtm0;

    .line 360
    .line 361
    const/4 v8, 0x0

    .line 362
    const/16 v9, 0x1a

    .line 363
    .line 364
    iget v4, v0, La/a1l;->c:F

    .line 365
    .line 366
    const/4 v5, 0x0

    .line 367
    const/4 v6, 0x1

    .line 368
    const/4 v7, 0x0

    .line 369
    invoke-direct/range {v3 .. v9}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_9

    .line 381
    .line 382
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    check-cast v2, La/bw3;

    .line 387
    .line 388
    iget v4, v2, La/bw3;->b:F

    .line 389
    .line 390
    iget v5, v2, La/bw3;->a:F

    .line 391
    .line 392
    iget-wide v6, v2, La/bw3;->c:J

    .line 393
    .line 394
    invoke-interface {v1}, La/fhl;->d()J

    .line 395
    .line 396
    .line 397
    move-result-wide v8

    .line 398
    const/4 v10, 0x0

    .line 399
    const/16 v12, 0x340

    .line 400
    .line 401
    move-object v11, v3

    .line 402
    move-wide v2, v6

    .line 403
    const-wide/16 v6, 0x0

    .line 404
    .line 405
    invoke-static/range {v1 .. v12}, La/fhl;->V(La/fhl;JFFJJFLa/agc;I)V

    .line 406
    .line 407
    .line 408
    move-object v3, v11

    .line 409
    goto :goto_6

    .line 410
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
