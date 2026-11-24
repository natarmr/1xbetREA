.class public final La/dxj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/dxj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/dxj;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dxj;->a:La/dxj;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m3k0;La/fet;I)V
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    iget v1, v0, La/m3k0;->g:F

    .line 6
    .line 7
    const v2, 0x7f677649

    .line 8
    .line 9
    .line 10
    invoke-virtual {v4, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v7, 0x4

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v7

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v3

    .line 24
    :goto_0
    or-int v8, p3, v2

    .line 25
    .line 26
    and-int/lit8 v2, v8, 0x3

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    const/4 v10, 0x0

    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    move v2, v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v10

    .line 35
    :goto_1
    and-int/lit8 v3, v8, 0x1

    .line 36
    .line 37
    invoke-virtual {v4, v3, v2}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_10

    .line 42
    .line 43
    iget-object v11, v0, La/m3k0;->i:La/kyq0;

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_f

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const v2, 0x7fffffff

    .line 56
    .line 57
    .line 58
    and-int/2addr v1, v2

    .line 59
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 60
    .line 61
    if-ge v1, v2, :cond_f

    .line 62
    .line 63
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    or-int/2addr v1, v2

    .line 73
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/16 v12, 0x19

    .line 78
    .line 79
    sget-object v13, La/ukd;->a:La/cl5;

    .line 80
    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    if-ne v2, v13, :cond_3

    .line 84
    .line 85
    :cond_2
    new-instance v1, La/q7g;

    .line 86
    .line 87
    invoke-direct {v1, v0, v12}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    check-cast v2, La/l7m0;

    .line 98
    .line 99
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/y3d;

    .line 104
    .line 105
    iget-wide v1, v1, La/y3d;->a:J

    .line 106
    .line 107
    sget-object v3, La/yt40;->c:La/yt40;

    .line 108
    .line 109
    invoke-static {v3, v4}, La/d7x;->P(La/yt40;La/fet;)La/nul0;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    const/4 v5, 0x0

    .line 114
    const/16 v6, 0xc

    .line 115
    .line 116
    invoke-static/range {v1 .. v6}, La/m5k0;->b(JLa/j73;La/fet;II)La/l7m0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    new-instance v2, La/f42;

    .line 121
    .line 122
    const/4 v3, 0x5

    .line 123
    invoke-direct {v2, v0, v3}, La/f42;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    const v3, -0x62e0c0ee

    .line 127
    .line 128
    .line 129
    invoke-static {v3, v2, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 130
    .line 131
    .line 132
    move-result-object v16

    .line 133
    const v2, 0x292236d1

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 140
    .line 141
    .line 142
    iget-object v2, v0, La/m3k0;->a:La/mm40;

    .line 143
    .line 144
    sget-object v3, La/jm40;->b:La/jm40;

    .line 145
    .line 146
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    if-nez v5, :cond_4

    .line 159
    .line 160
    if-ne v6, v13, :cond_5

    .line 161
    .line 162
    :cond_4
    new-instance v6, La/x1d;

    .line 163
    .line 164
    const/16 v5, 0xd

    .line 165
    .line 166
    invoke-direct {v6, v1, v5}, La/x1d;-><init>(La/l7m0;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 173
    .line 174
    invoke-static {v2, v6}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v2, v13, :cond_6

    .line 183
    .line 184
    new-instance v2, La/x2i;

    .line 185
    .line 186
    invoke-direct {v2, v12}, La/x2i;-><init>(B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 193
    .line 194
    invoke-static {v1, v10, v2}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    if-ne v5, v13, :cond_7

    .line 205
    .line 206
    sget-object v5, La/i54;->j:La/i54;

    .line 207
    .line 208
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_7
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 212
    .line 213
    invoke-static {v1, v2, v5}, La/fnn0;->a(La/mm40;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 218
    .line 219
    invoke-static {v2, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v4}, La/e3c;->x(La/fet;)I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v4, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 236
    .line 237
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4}, La/fet;->i0()V

    .line 241
    .line 242
    .line 243
    iget-boolean v12, v4, La/fet;->S:Z

    .line 244
    .line 245
    if-eqz v12, :cond_8

    .line 246
    .line 247
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 248
    .line 249
    invoke-virtual {v4, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_8
    invoke-virtual {v4}, La/fet;->r0()V

    .line 254
    .line 255
    .line 256
    :goto_2
    sget-object v12, La/gqw0;->x:La/shd;

    .line 257
    .line 258
    invoke-static {v4, v2, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    sget-object v2, La/gqw0;->w:La/shd;

    .line 262
    .line 263
    invoke-static {v4, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    sget-object v2, La/gqw0;->y:La/shd;

    .line 267
    .line 268
    iget-boolean v6, v4, La/fet;->S:Z

    .line 269
    .line 270
    if-nez v6, :cond_9

    .line 271
    .line 272
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-nez v6, :cond_a

    .line 285
    .line 286
    :cond_9
    invoke-static {v5, v4, v5, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    sget-object v2, La/gqw0;->v:La/shd;

    .line 290
    .line 291
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    iget-object v1, v0, La/m3k0;->h:La/vhv0;

    .line 295
    .line 296
    invoke-static {v3, v1}, La/j120;->k0(La/mm40;La/vhv0;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-static {v1}, La/lgb;->K(La/mm40;)La/mm40;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    sget-object v2, La/ob3;->a:La/zfn;

    .line 305
    .line 306
    and-int/lit8 v2, v8, 0xe

    .line 307
    .line 308
    if-ne v2, v7, :cond_b

    .line 309
    .line 310
    move v2, v9

    .line 311
    goto :goto_3

    .line 312
    :cond_b
    move v2, v10

    .line 313
    :goto_3
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    if-nez v2, :cond_c

    .line 318
    .line 319
    if-ne v3, v13, :cond_d

    .line 320
    .line 321
    :cond_c
    new-instance v3, La/bxj;

    .line 322
    .line 323
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_d
    move-object v2, v3

    .line 330
    check-cast v2, La/ilq;

    .line 331
    .line 332
    iget-wide v5, v11, La/kyq0;->c:J

    .line 333
    .line 334
    move-wide v7, v5

    .line 335
    iget-wide v5, v11, La/kyq0;->d:J

    .line 336
    .line 337
    move v3, v9

    .line 338
    move v12, v10

    .line 339
    iget-wide v9, v11, La/kyq0;->e:J

    .line 340
    .line 341
    iget-wide v14, v11, La/kyq0;->f:J

    .line 342
    .line 343
    iget-object v11, v0, La/m3k0;->b:La/ugd;

    .line 344
    .line 345
    move/from16 v17, v12

    .line 346
    .line 347
    iget-object v12, v0, La/m3k0;->c:La/y9q0;

    .line 348
    .line 349
    iget-object v3, v0, La/m3k0;->d:La/y9q0;

    .line 350
    .line 351
    move-wide/from16 v19, v7

    .line 352
    .line 353
    move-wide v7, v14

    .line 354
    iget-object v15, v0, La/m3k0;->e:La/ugd;

    .line 355
    .line 356
    iget v14, v0, La/m3k0;->g:F

    .line 357
    .line 358
    move-object/from16 v21, v1

    .line 359
    .line 360
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    if-ne v1, v13, :cond_e

    .line 365
    .line 366
    new-instance v1, La/rtj;

    .line 367
    .line 368
    const/4 v13, 0x3

    .line 369
    invoke-direct {v1, v13}, La/rtj;-><init>(B)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_e
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 376
    .line 377
    move-object v13, v3

    .line 378
    move-wide/from16 v3, v19

    .line 379
    .line 380
    const/16 v19, 0x0

    .line 381
    .line 382
    move-object/from16 v18, p2

    .line 383
    .line 384
    move/from16 v17, v14

    .line 385
    .line 386
    const/4 v0, 0x1

    .line 387
    move-object v14, v1

    .line 388
    move-object/from16 v1, v21

    .line 389
    .line 390
    invoke-static/range {v1 .. v19}, La/ob3;->c(La/mm40;La/ilq;JJJJLa/ugd;La/y9q0;La/y9q0;Lkotlin/jvm/functions/Function0;La/ugd;La/ugd;FLa/fet;I)V

    .line 391
    .line 392
    .line 393
    move-object/from16 v4, v18

    .line 394
    .line 395
    invoke-virtual {v4, v0}, La/fet;->r(Z)V

    .line 396
    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_f
    const-string v0, "The expandedHeight is expected to be specified and finite"

    .line 400
    .line 401
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_10
    invoke-virtual {v4}, La/fet;->X()V

    .line 406
    .line 407
    .line 408
    :goto_4
    invoke-virtual {v4}, La/fet;->u()La/yfe0;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    if-eqz v0, :cond_11

    .line 413
    .line 414
    new-instance v1, La/cxj;

    .line 415
    .line 416
    move-object/from16 v2, p0

    .line 417
    .line 418
    move-object/from16 v3, p1

    .line 419
    .line 420
    move/from16 v4, p3

    .line 421
    .line 422
    const/4 v12, 0x0

    .line 423
    invoke-direct {v1, v2, v3, v4, v12}, La/cxj;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 424
    .line 425
    .line 426
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 427
    .line 428
    :cond_11
    return-void
.end method
