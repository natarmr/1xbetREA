.class public final synthetic La/h15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;JJJLjava/lang/String;La/y9q0;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/h15;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h15;->b:La/mm40;

    iput-wide p2, p0, La/h15;->c:J

    iput-wide p4, p0, La/h15;->d:J

    iput-wide p6, p0, La/h15;->e:J

    iput-object p8, p0, La/h15;->f:Ljava/lang/Object;

    iput-object p9, p0, La/h15;->h:Ljava/lang/Object;

    iput-object p10, p0, La/h15;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;I)V
    .locals 0

    .line 2
    const/4 p11, 0x1

    iput-byte p11, p0, La/h15;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/h15;->b:La/mm40;

    iput-wide p2, p0, La/h15;->c:J

    iput-wide p4, p0, La/h15;->d:J

    iput-wide p6, p0, La/h15;->e:J

    iput-object p8, p0, La/h15;->f:Ljava/lang/Object;

    iput-object p9, p0, La/h15;->g:Ljava/lang/Object;

    iput-object p10, p0, La/h15;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h15;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/h15;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/h15;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/h15;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v12, v4

    .line 15
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 16
    .line 17
    move-object v13, v3

    .line 18
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    move-object v14, v2

    .line 21
    check-cast v14, La/ugd;

    .line 22
    .line 23
    move-object/from16 v15, p1

    .line 24
    .line 25
    check-cast v15, La/fet;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const v1, 0x180007

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, La/x8x;->L(I)I

    .line 38
    .line 39
    .line 40
    move-result v16

    .line 41
    iget-object v5, v0, La/h15;->b:La/mm40;

    .line 42
    .line 43
    iget-wide v6, v0, La/h15;->c:J

    .line 44
    .line 45
    iget-wide v8, v0, La/h15;->d:J

    .line 46
    .line 47
    iget-wide v10, v0, La/h15;->e:J

    .line 48
    .line 49
    invoke-static/range {v5 .. v16}, La/ozb;->h(La/mm40;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    move-object v1, v4

    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    check-cast v2, La/y9q0;

    .line 59
    .line 60
    move-object v14, v3

    .line 61
    check-cast v14, Ljava/lang/String;

    .line 62
    .line 63
    move-object/from16 v11, p1

    .line 64
    .line 65
    check-cast v11, La/fet;

    .line 66
    .line 67
    move-object/from16 v3, p2

    .line 68
    .line 69
    check-cast v3, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    and-int/lit8 v4, v3, 0x3

    .line 76
    .line 77
    const/4 v5, 0x2

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v15, 0x1

    .line 80
    if-eq v4, v5, :cond_0

    .line 81
    .line 82
    move v4, v15

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move v4, v6

    .line 85
    :goto_0
    and-int/2addr v3, v15

    .line 86
    invoke-virtual {v11, v3, v4}, La/fet;->U(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-wide v7, v0, La/h15;->c:J

    .line 97
    .line 98
    sget-object v4, La/ukd;->a:La/cl5;

    .line 99
    .line 100
    if-ne v3, v4, :cond_1

    .line 101
    .line 102
    new-instance v3, La/daq0;

    .line 103
    .line 104
    invoke-direct {v3, v7, v8}, La/daq0;-><init>(J)V

    .line 105
    .line 106
    .line 107
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    check-cast v3, La/pz40;

    .line 115
    .line 116
    sget-object v9, La/gqw0;->k:La/yx7;

    .line 117
    .line 118
    sget-object v10, La/uc9;->b:La/lw3;

    .line 119
    .line 120
    const/16 v12, 0x36

    .line 121
    .line 122
    invoke-static {v10, v9, v11, v12}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    iget-wide v12, v11, La/fet;->T:J

    .line 127
    .line 128
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    iget-object v13, v0, La/h15;->b:La/mm40;

    .line 137
    .line 138
    invoke-static {v11, v13}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 143
    .line 144
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11}, La/fet;->i0()V

    .line 148
    .line 149
    .line 150
    iget-boolean v15, v11, La/fet;->S:Z

    .line 151
    .line 152
    if-eqz v15, :cond_2

    .line 153
    .line 154
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 155
    .line 156
    invoke-virtual {v11, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    invoke-virtual {v11}, La/fet;->r0()V

    .line 161
    .line 162
    .line 163
    :goto_1
    sget-object v15, La/gqw0;->x:La/shd;

    .line 164
    .line 165
    invoke-static {v11, v9, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    sget-object v9, La/gqw0;->w:La/shd;

    .line 169
    .line 170
    invoke-static {v11, v12, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    sget-object v10, La/gqw0;->y:La/shd;

    .line 178
    .line 179
    invoke-static {v11, v9, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 183
    .line 184
    .line 185
    sget-object v9, La/gqw0;->v:La/shd;

    .line 186
    .line 187
    invoke-static {v11, v13, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 188
    .line 189
    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const-string v10, "SUM_VALUE_TEST_TAG"

    .line 193
    .line 194
    invoke-static {v9, v6, v10}, La/hne;->i(FZLjava/lang/String;)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    iget-wide v9, v0, La/h15;->d:J

    .line 199
    .line 200
    invoke-virtual {v11, v9, v10}, La/fet;->f(J)Z

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    if-nez v12, :cond_3

    .line 209
    .line 210
    if-ne v13, v4, :cond_4

    .line 211
    .line 212
    :cond_3
    new-instance v13, La/f15;

    .line 213
    .line 214
    invoke-direct {v13, v5, v9, v10}, La/f15;-><init>(BJ)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v11, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_4
    check-cast v13, La/n4d;

    .line 221
    .line 222
    sget-wide v21, La/qmk;->n:J

    .line 223
    .line 224
    new-instance v16, La/n05;

    .line 225
    .line 226
    move-object v5, v1

    .line 227
    iget-wide v0, v0, La/h15;->e:J

    .line 228
    .line 229
    move-wide/from16 v17, v0

    .line 230
    .line 231
    move-wide/from16 v19, v7

    .line 232
    .line 233
    invoke-direct/range {v16 .. v22}, La/n05;-><init>(JJJ)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-ne v0, v4, :cond_5

    .line 241
    .line 242
    new-instance v0, La/we;

    .line 243
    .line 244
    const/16 v1, 0x18

    .line 245
    .line 246
    invoke-direct {v0, v3, v1}, La/we;-><init>(La/pz40;B)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v11, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :cond_5
    move-object v4, v0

    .line 253
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 254
    .line 255
    const/16 v12, 0x6c00

    .line 256
    .line 257
    move-wide v0, v9

    .line 258
    move-object v9, v13

    .line 259
    const/16 v13, 0xa0

    .line 260
    .line 261
    move-wide v7, v0

    .line 262
    move-object v1, v5

    .line 263
    const/4 v5, 0x2

    .line 264
    move-object v0, v3

    .line 265
    move-object v3, v2

    .line 266
    move-object v2, v6

    .line 267
    const/4 v6, 0x0

    .line 268
    move-wide/from16 v17, v7

    .line 269
    .line 270
    const/4 v7, 0x1

    .line 271
    const/4 v8, 0x0

    .line 272
    move-object/from16 v10, v16

    .line 273
    .line 274
    invoke-static/range {v1 .. v13}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v25, v11

    .line 278
    .line 279
    const/4 v5, 0x0

    .line 280
    const/16 v6, 0xe

    .line 281
    .line 282
    sget-object v1, La/jm40;->b:La/jm40;

    .line 283
    .line 284
    const/high16 v2, 0x40800000    # 4.0f

    .line 285
    .line 286
    const/4 v3, 0x0

    .line 287
    const/4 v4, 0x0

    .line 288
    invoke-static/range {v1 .. v6}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-string v2, "CURRENCY_VALUE_TEST_TAG"

    .line 293
    .line 294
    invoke-static {v1, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    sget-object v32, La/j1t0;->b:La/qrq;

    .line 299
    .line 300
    sget-wide v29, La/qmk;->s:J

    .line 301
    .line 302
    sget-wide v38, La/qmk;->G:J

    .line 303
    .line 304
    new-instance v24, La/y9q0;

    .line 305
    .line 306
    const/16 v37, 0x0

    .line 307
    .line 308
    const v40, 0xfdffdd

    .line 309
    .line 310
    .line 311
    const-wide/16 v27, 0x0

    .line 312
    .line 313
    const/16 v31, 0x0

    .line 314
    .line 315
    const-wide/16 v33, 0x0

    .line 316
    .line 317
    const/16 v35, 0x0

    .line 318
    .line 319
    const/16 v36, 0x0

    .line 320
    .line 321
    move-object/from16 v26, v24

    .line 322
    .line 323
    invoke-direct/range {v26 .. v40}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, La/daq0;

    .line 331
    .line 332
    iget-wide v9, v0, La/daq0;->a:J

    .line 333
    .line 334
    const/16 v27, 0x6000

    .line 335
    .line 336
    const v28, 0x1bfe8

    .line 337
    .line 338
    .line 339
    const/4 v8, 0x0

    .line 340
    const/4 v11, 0x0

    .line 341
    const/4 v12, 0x0

    .line 342
    const/4 v13, 0x0

    .line 343
    move-object v4, v14

    .line 344
    const-wide/16 v14, 0x0

    .line 345
    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    move-wide/from16 v0, v17

    .line 349
    .line 350
    const-wide/16 v17, 0x0

    .line 351
    .line 352
    const/16 v19, 0x0

    .line 353
    .line 354
    const/16 v20, 0x0

    .line 355
    .line 356
    const/16 v21, 0x1

    .line 357
    .line 358
    const/16 v22, 0x0

    .line 359
    .line 360
    const/16 v23, 0x0

    .line 361
    .line 362
    const/16 v26, 0x0

    .line 363
    .line 364
    move-wide v6, v0

    .line 365
    const/4 v0, 0x1

    .line 366
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 367
    .line 368
    .line 369
    move-object/from16 v11, v25

    .line 370
    .line 371
    invoke-virtual {v11, v0}, La/fet;->r(Z)V

    .line 372
    .line 373
    .line 374
    goto :goto_2

    .line 375
    :cond_6
    invoke-virtual {v11}, La/fet;->X()V

    .line 376
    .line 377
    .line 378
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
