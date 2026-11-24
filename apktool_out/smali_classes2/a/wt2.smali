.class public final synthetic La/wt2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:La/l7m0;

.field public final synthetic d:J

.field public final synthetic e:La/ugd;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:La/l7m0;


# direct methods
.method public synthetic constructor <init>(FLa/l7m0;JLa/ugd;La/l7m0;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/wt2;->a:B

    iput p1, p0, La/wt2;->b:F

    iput-object p2, p0, La/wt2;->c:La/l7m0;

    iput-wide p3, p0, La/wt2;->d:J

    iput-object p5, p0, La/wt2;->e:La/ugd;

    iput-object p6, p0, La/wt2;->f:La/l7m0;

    iput-object p7, p0, La/wt2;->g:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wt2;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/16 v4, 0xc

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-wide v10, v0, La/wt2;->d:J

    .line 18
    .line 19
    iget-object v12, v0, La/wt2;->c:La/l7m0;

    .line 20
    .line 21
    iget v13, v0, La/wt2;->b:F

    .line 22
    .line 23
    const/4 v14, 0x0

    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/hh80;

    .line 30
    .line 31
    move-object/from16 v15, p2

    .line 32
    .line 33
    check-cast v15, La/fet;

    .line 34
    .line 35
    move-object/from16 v16, p3

    .line 36
    .line 37
    check-cast v16, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v16

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    and-int/lit8 v17, v16, 0x6

    .line 47
    .line 48
    if-nez v17, :cond_1

    .line 49
    .line 50
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v17

    .line 54
    if-eqz v17, :cond_0

    .line 55
    .line 56
    move v6, v7

    .line 57
    :cond_0
    or-int v16, v16, v6

    .line 58
    .line 59
    :cond_1
    and-int/lit8 v6, v16, 0x13

    .line 60
    .line 61
    if-eq v6, v5, :cond_2

    .line 62
    .line 63
    move v5, v8

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v5, v9

    .line 66
    :goto_0
    and-int/lit8 v6, v16, 0x1

    .line 67
    .line 68
    invoke-virtual {v15, v6, v5}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    sget-object v17, La/o7k0;->c:La/n0q;

    .line 75
    .line 76
    invoke-interface {v1}, La/hh80;->d()F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    sub-float v19, v5, v13

    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const/16 v22, 0xd

    .line 85
    .line 86
    const/16 v18, 0x0

    .line 87
    .line 88
    const/16 v20, 0x0

    .line 89
    .line 90
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, La/ycl;

    .line 99
    .line 100
    iget v6, v6, La/ycl;->a:F

    .line 101
    .line 102
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    check-cast v7, La/ycl;

    .line 107
    .line 108
    iget v7, v7, La/ycl;->a:F

    .line 109
    .line 110
    invoke-static {v6, v7, v14, v14, v4}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {v5, v4}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-static {v4, v3}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    sget-object v4, La/jd8;->n:La/ljc;

    .line 123
    .line 124
    invoke-static {v3, v10, v11, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    sget-object v4, La/gqw0;->a:La/zx7;

    .line 129
    .line 130
    invoke-static {v4, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    iget-wide v5, v15, La/fet;->T:J

    .line 135
    .line 136
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {v15, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v15}, La/fet;->i0()V

    .line 154
    .line 155
    .line 156
    iget-boolean v7, v15, La/fet;->S:Z

    .line 157
    .line 158
    if-eqz v7, :cond_3

    .line 159
    .line 160
    invoke-virtual {v15, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    invoke-virtual {v15}, La/fet;->r0()V

    .line 165
    .line 166
    .line 167
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 168
    .line 169
    invoke-static {v15, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    sget-object v2, La/gqw0;->w:La/shd;

    .line 173
    .line 174
    invoke-static {v15, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    sget-object v4, La/gqw0;->y:La/shd;

    .line 182
    .line 183
    invoke-static {v15, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 187
    .line 188
    .line 189
    sget-object v2, La/gqw0;->v:La/shd;

    .line 190
    .line 191
    invoke-static {v15, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    and-int/lit8 v2, v16, 0xe

    .line 195
    .line 196
    or-int/lit16 v2, v2, 0x1b0

    .line 197
    .line 198
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v20

    .line 202
    move-object/from16 v19, v15

    .line 203
    .line 204
    iget-object v15, v0, La/wt2;->e:La/ugd;

    .line 205
    .line 206
    iget-object v2, v0, La/wt2;->f:La/l7m0;

    .line 207
    .line 208
    iget-object v0, v0, La/wt2;->g:La/l7m0;

    .line 209
    .line 210
    move-object/from16 v18, v0

    .line 211
    .line 212
    move-object/from16 v16, v1

    .line 213
    .line 214
    move-object/from16 v17, v2

    .line 215
    .line 216
    invoke-virtual/range {v15 .. v20}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-object/from16 v0, v19

    .line 220
    .line 221
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 222
    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_4
    move-object v0, v15

    .line 226
    invoke-virtual {v0}, La/fet;->X()V

    .line 227
    .line 228
    .line 229
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_0
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, La/hh80;

    .line 235
    .line 236
    move-object/from16 v15, p2

    .line 237
    .line 238
    check-cast v15, La/fet;

    .line 239
    .line 240
    move-object/from16 v16, p3

    .line 241
    .line 242
    check-cast v16, Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v16

    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    and-int/lit8 v17, v16, 0x6

    .line 252
    .line 253
    if-nez v17, :cond_6

    .line 254
    .line 255
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v17

    .line 259
    if-eqz v17, :cond_5

    .line 260
    .line 261
    move v6, v7

    .line 262
    :cond_5
    or-int v16, v16, v6

    .line 263
    .line 264
    :cond_6
    and-int/lit8 v6, v16, 0x13

    .line 265
    .line 266
    if-eq v6, v5, :cond_7

    .line 267
    .line 268
    move v5, v8

    .line 269
    goto :goto_3

    .line 270
    :cond_7
    move v5, v9

    .line 271
    :goto_3
    and-int/lit8 v6, v16, 0x1

    .line 272
    .line 273
    invoke-virtual {v15, v6, v5}, La/fet;->U(IZ)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_9

    .line 278
    .line 279
    sget-object v17, La/o7k0;->c:La/n0q;

    .line 280
    .line 281
    invoke-interface {v1}, La/hh80;->d()F

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    sub-float v19, v5, v13

    .line 286
    .line 287
    const/16 v21, 0x0

    .line 288
    .line 289
    const/16 v22, 0xd

    .line 290
    .line 291
    const/16 v18, 0x0

    .line 292
    .line 293
    const/16 v20, 0x0

    .line 294
    .line 295
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    check-cast v6, La/ycl;

    .line 304
    .line 305
    iget v6, v6, La/ycl;->a:F

    .line 306
    .line 307
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    check-cast v7, La/ycl;

    .line 312
    .line 313
    iget v7, v7, La/ycl;->a:F

    .line 314
    .line 315
    invoke-static {v6, v7, v14, v14, v4}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-static {v5, v4}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-static {v4, v3}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    sget-object v4, La/jd8;->n:La/ljc;

    .line 328
    .line 329
    invoke-static {v3, v10, v11, v4}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    sget-object v4, La/gqw0;->a:La/zx7;

    .line 334
    .line 335
    invoke-static {v4, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    iget-wide v5, v15, La/fet;->T:J

    .line 340
    .line 341
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    invoke-static {v15, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 354
    .line 355
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v15}, La/fet;->i0()V

    .line 359
    .line 360
    .line 361
    iget-boolean v7, v15, La/fet;->S:Z

    .line 362
    .line 363
    if-eqz v7, :cond_8

    .line 364
    .line 365
    invoke-virtual {v15, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 366
    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_8
    invoke-virtual {v15}, La/fet;->r0()V

    .line 370
    .line 371
    .line 372
    :goto_4
    sget-object v2, La/gqw0;->x:La/shd;

    .line 373
    .line 374
    invoke-static {v15, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 375
    .line 376
    .line 377
    sget-object v2, La/gqw0;->w:La/shd;

    .line 378
    .line 379
    invoke-static {v15, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    sget-object v4, La/gqw0;->y:La/shd;

    .line 387
    .line 388
    invoke-static {v15, v2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 392
    .line 393
    .line 394
    sget-object v2, La/gqw0;->v:La/shd;

    .line 395
    .line 396
    invoke-static {v15, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 397
    .line 398
    .line 399
    and-int/lit8 v2, v16, 0xe

    .line 400
    .line 401
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    move-object v2, v1

    .line 406
    iget-object v1, v0, La/wt2;->e:La/ugd;

    .line 407
    .line 408
    iget-object v3, v0, La/wt2;->f:La/l7m0;

    .line 409
    .line 410
    iget-object v4, v0, La/wt2;->g:La/l7m0;

    .line 411
    .line 412
    move-object v5, v15

    .line 413
    invoke-virtual/range {v1 .. v6}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 417
    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_9
    move-object v5, v15

    .line 421
    invoke-virtual {v5}, La/fet;->X()V

    .line 422
    .line 423
    .line 424
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
