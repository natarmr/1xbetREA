.class public final synthetic La/bpd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZLkotlin/jvm/functions/Function0;La/xdr;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/bpd0;->a:B

    iput-object p1, p0, La/bpd0;->b:La/mm40;

    iput-boolean p2, p0, La/bpd0;->c:Z

    iput-object p3, p0, La/bpd0;->d:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/bpd0;->e:La/xdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bpd0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    sget-object v3, La/jr8;->a:La/jr8;

    .line 7
    .line 8
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 9
    .line 10
    sget-object v5, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    const/high16 v6, 0x41400000    # 12.0f

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v10, v0, La/bpd0;->e:La/xdr;

    .line 18
    .line 19
    iget-object v11, v0, La/bpd0;->b:La/mm40;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/fet;

    .line 27
    .line 28
    move-object/from16 v12, p2

    .line 29
    .line 30
    check-cast v12, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    and-int/lit8 v13, v12, 0x3

    .line 37
    .line 38
    if-eq v13, v7, :cond_0

    .line 39
    .line 40
    move v7, v9

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v7, v8

    .line 43
    :goto_0
    and-int/2addr v12, v9

    .line 44
    invoke-virtual {v1, v12, v7}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_4

    .line 49
    .line 50
    sget-object v7, La/qmk;->a:La/zcl;

    .line 51
    .line 52
    const/high16 v7, 0x42200000    # 40.0f

    .line 53
    .line 54
    invoke-static {v11, v7}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    sget-object v11, La/uld0;->b:La/zfn;

    .line 59
    .line 60
    invoke-virtual {v1, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    check-cast v11, La/y3d;

    .line 65
    .line 66
    iget-wide v11, v11, La/y3d;->a:J

    .line 67
    .line 68
    sget-object v13, La/qmk;->f:La/zcl;

    .line 69
    .line 70
    sget-object v14, La/vgg0;->a:La/ugg0;

    .line 71
    .line 72
    new-instance v14, La/ugg0;

    .line 73
    .line 74
    invoke-direct {v14, v13, v13, v13, v13}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v7, v11, v12, v14}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    const/high16 v11, 0x41200000    # 10.0f

    .line 82
    .line 83
    invoke-static {v7, v6, v11}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    if-ne v6, v5, :cond_1

    .line 92
    .line 93
    invoke-static {v1}, La/dw9;->j(La/fet;)La/gy40;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    :cond_1
    move-object v13, v6

    .line 98
    check-cast v13, La/gy40;

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/16 v18, 0x18

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    iget-boolean v15, v0, La/bpd0;->c:Z

    .line 106
    .line 107
    iget-object v0, v0, La/bpd0;->d:Lkotlin/jvm/functions/Function0;

    .line 108
    .line 109
    move-object/from16 v17, v0

    .line 110
    .line 111
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v5, La/gqw0;->e:La/zx7;

    .line 116
    .line 117
    invoke-static {v5, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    iget-wide v6, v1, La/fet;->T:J

    .line 122
    .line 123
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 136
    .line 137
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, La/fet;->i0()V

    .line 141
    .line 142
    .line 143
    iget-boolean v11, v1, La/fet;->S:Z

    .line 144
    .line 145
    if-eqz v11, :cond_2

    .line 146
    .line 147
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    invoke-virtual {v1}, La/fet;->r0()V

    .line 152
    .line 153
    .line 154
    :goto_1
    sget-object v4, La/gqw0;->x:La/shd;

    .line 155
    .line 156
    invoke-static {v1, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    sget-object v4, La/gqw0;->w:La/shd;

    .line 160
    .line 161
    invoke-static {v1, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    sget-object v5, La/gqw0;->y:La/shd;

    .line 169
    .line 170
    invoke-static {v1, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 174
    .line 175
    .line 176
    sget-object v4, La/gqw0;->v:La/shd;

    .line 177
    .line 178
    invoke-static {v1, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    if-nez v10, :cond_3

    .line 182
    .line 183
    const v0, 0x71cfcd31

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 187
    .line 188
    .line 189
    :goto_2
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_3
    const v0, -0x4963330

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {v10, v3, v1, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :goto_3
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 212
    .line 213
    .line 214
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_0
    move-object/from16 v1, p1

    .line 218
    .line 219
    check-cast v1, La/fet;

    .line 220
    .line 221
    move-object/from16 v12, p2

    .line 222
    .line 223
    check-cast v12, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    and-int/lit8 v13, v12, 0x3

    .line 230
    .line 231
    if-eq v13, v7, :cond_5

    .line 232
    .line 233
    move v13, v9

    .line 234
    goto :goto_5

    .line 235
    :cond_5
    move v13, v8

    .line 236
    :goto_5
    and-int/2addr v12, v9

    .line 237
    invoke-virtual {v1, v12, v13}, La/fet;->U(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    if-eqz v12, :cond_9

    .line 242
    .line 243
    sget-object v12, La/qmk;->a:La/zcl;

    .line 244
    .line 245
    const/high16 v12, 0x42000000    # 32.0f

    .line 246
    .line 247
    invoke-static {v11, v12}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    sget-object v12, La/vld0;->b:La/zfn;

    .line 252
    .line 253
    invoke-virtual {v1, v12}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    check-cast v12, La/y3d;

    .line 258
    .line 259
    iget-wide v12, v12, La/y3d;->a:J

    .line 260
    .line 261
    sget-object v14, La/qmk;->f:La/zcl;

    .line 262
    .line 263
    sget-object v15, La/vgg0;->a:La/ugg0;

    .line 264
    .line 265
    new-instance v15, La/ugg0;

    .line 266
    .line 267
    invoke-direct {v15, v14, v14, v14, v14}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v11, v12, v13, v15}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    const/4 v12, 0x0

    .line 275
    invoke-static {v11, v6, v12, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    if-ne v6, v5, :cond_6

    .line 284
    .line 285
    invoke-static {v1}, La/dw9;->j(La/fet;)La/gy40;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    :cond_6
    move-object v14, v6

    .line 290
    check-cast v14, La/gy40;

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/16 v19, 0x18

    .line 295
    .line 296
    const/4 v15, 0x0

    .line 297
    iget-boolean v5, v0, La/bpd0;->c:Z

    .line 298
    .line 299
    iget-object v0, v0, La/bpd0;->d:Lkotlin/jvm/functions/Function0;

    .line 300
    .line 301
    move-object/from16 v18, v0

    .line 302
    .line 303
    move/from16 v16, v5

    .line 304
    .line 305
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    sget-object v5, La/gqw0;->e:La/zx7;

    .line 310
    .line 311
    invoke-static {v5, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    iget-wide v6, v1, La/fet;->T:J

    .line 316
    .line 317
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 330
    .line 331
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, La/fet;->i0()V

    .line 335
    .line 336
    .line 337
    iget-boolean v11, v1, La/fet;->S:Z

    .line 338
    .line 339
    if-eqz v11, :cond_7

    .line 340
    .line 341
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_7
    invoke-virtual {v1}, La/fet;->r0()V

    .line 346
    .line 347
    .line 348
    :goto_6
    sget-object v4, La/gqw0;->x:La/shd;

    .line 349
    .line 350
    invoke-static {v1, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 351
    .line 352
    .line 353
    sget-object v4, La/gqw0;->w:La/shd;

    .line 354
    .line 355
    invoke-static {v1, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    sget-object v5, La/gqw0;->y:La/shd;

    .line 363
    .line 364
    invoke-static {v1, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 368
    .line 369
    .line 370
    sget-object v4, La/gqw0;->v:La/shd;

    .line 371
    .line 372
    invoke-static {v1, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 373
    .line 374
    .line 375
    if-nez v10, :cond_8

    .line 376
    .line 377
    const v0, 0x756adedf

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 381
    .line 382
    .line 383
    :goto_7
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 384
    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_8
    const v0, -0x6791329e

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 391
    .line 392
    .line 393
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-interface {v10, v3, v1, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    goto :goto_7

    .line 401
    :goto_8
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 402
    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 406
    .line 407
    .line 408
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
