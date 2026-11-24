.class public final synthetic La/rea;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(BIJLa/mm40;Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/rea;->a:B

    iput-object p5, p0, La/rea;->b:La/mm40;

    iput-wide p3, p0, La/rea;->c:J

    iput-object p6, p0, La/rea;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/rea;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rea;->b:La/mm40;

    iput-wide p2, p0, La/rea;->c:J

    iput-object p4, p0, La/rea;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rea;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v6, p1

    .line 10
    .line 11
    check-cast v6, La/fet;

    .line 12
    .line 13
    move-object/from16 v1, p2

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iget-wide v4, v0, La/rea;->c:J

    .line 25
    .line 26
    iget-object v7, v0, La/rea;->b:La/mm40;

    .line 27
    .line 28
    iget-object v8, v0, La/rea;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static/range {v3 .. v8}, La/wdx;->F(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v4, p1

    .line 37
    .line 38
    check-cast v4, La/fet;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, La/x8x;->L(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-wide v2, v0, La/rea;->c:J

    .line 52
    .line 53
    iget-object v5, v0, La/rea;->b:La/mm40;

    .line 54
    .line 55
    iget-object v6, v0, La/rea;->d:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static/range {v1 .. v6}, La/feb;->E(IJLa/fet;La/mm40;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object v0

    .line 63
    :pswitch_1
    move-object/from16 v1, p1

    .line 64
    .line 65
    check-cast v1, La/fet;

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
    if-eq v4, v5, :cond_0

    .line 80
    .line 81
    move v4, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v4, v6

    .line 84
    :goto_0
    and-int/2addr v3, v2

    .line 85
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    const-string v3, "CARD_CRICKET_GAME_PROGRESS_POINTS_CELL"

    .line 92
    .line 93
    iget-object v4, v0, La/rea;->b:La/mm40;

    .line 94
    .line 95
    invoke-static {v4, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    sget-object v3, La/qmk;->a:La/zcl;

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    const/16 v12, 0xd

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    const/high16 v9, 0x40c00000    # 6.0f

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const/high16 v4, 0x42800000    # 64.0f

    .line 113
    .line 114
    invoke-static {v3, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 119
    .line 120
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    sget-object v5, La/qmk;->c:La/zcl;

    .line 125
    .line 126
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 127
    .line 128
    new-instance v9, La/ugg0;

    .line 129
    .line 130
    invoke-direct {v9, v5, v5, v5, v5}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v3, v7, v8, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const/high16 v5, 0x40800000    # 4.0f

    .line 138
    .line 139
    invoke-static {v3, v5}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v5, La/uc9;->e:La/nw3;

    .line 144
    .line 145
    sget-object v7, La/gqw0;->k:La/yx7;

    .line 146
    .line 147
    const/16 v8, 0x36

    .line 148
    .line 149
    invoke-static {v5, v7, v1, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    iget-wide v7, v1, La/fet;->T:J

    .line 154
    .line 155
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 168
    .line 169
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, La/fet;->i0()V

    .line 173
    .line 174
    .line 175
    iget-boolean v9, v1, La/fet;->S:Z

    .line 176
    .line 177
    if-eqz v9, :cond_1

    .line 178
    .line 179
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 180
    .line 181
    invoke-virtual {v1, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 186
    .line 187
    .line 188
    :goto_1
    sget-object v9, La/gqw0;->x:La/shd;

    .line 189
    .line 190
    invoke-static {v1, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    sget-object v5, La/gqw0;->w:La/shd;

    .line 194
    .line 195
    invoke-static {v1, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    sget-object v7, La/gqw0;->y:La/shd;

    .line 203
    .line 204
    invoke-static {v1, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 208
    .line 209
    .line 210
    sget-object v5, La/gqw0;->v:La/shd;

    .line 211
    .line 212
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    const-string v3, "CARD_CRICKET_GAME_PROGRESS_POINTS_COLOR"

    .line 216
    .line 217
    sget-object v5, La/jm40;->b:La/jm40;

    .line 218
    .line 219
    invoke-static {v5, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    iget-wide v7, v0, La/rea;->c:J

    .line 224
    .line 225
    invoke-virtual {v1, v7, v8}, La/fet;->f(J)Z

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    if-nez v9, :cond_2

    .line 234
    .line 235
    sget-object v9, La/ukd;->a:La/cl5;

    .line 236
    .line 237
    if-ne v10, v9, :cond_3

    .line 238
    .line 239
    :cond_2
    new-instance v10, La/bx;

    .line 240
    .line 241
    const/16 v9, 0x16

    .line 242
    .line 243
    invoke-direct {v10, v9, v7, v8}, La/bx;-><init>(BJ)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_3
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 250
    .line 251
    invoke-static {v3, v6, v10}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    const/high16 v9, 0x41000000    # 8.0f

    .line 256
    .line 257
    invoke-static {v3, v9}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    sget-object v9, La/qmk;->b:La/zcl;

    .line 262
    .line 263
    new-instance v10, La/ugg0;

    .line 264
    .line 265
    invoke-direct {v10, v9, v9, v9, v9}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v3, v7, v8, v10}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-static {v6, v1, v3}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 273
    .line 274
    .line 275
    const-string v3, "CARD_CRICKET_GAME_PROGRESS_POINTS_TEXT"

    .line 276
    .line 277
    invoke-static {v5, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    const/4 v10, 0x0

    .line 282
    const/16 v11, 0xe

    .line 283
    .line 284
    const/high16 v7, 0x40800000    # 4.0f

    .line 285
    .line 286
    const/4 v8, 0x0

    .line 287
    const/4 v9, 0x0

    .line 288
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 293
    .line 294
    .line 295
    move-result-wide v5

    .line 296
    sget-object v13, La/j1t0;->b:La/qrq;

    .line 297
    .line 298
    sget-wide v10, La/qmk;->p:J

    .line 299
    .line 300
    sget-wide v19, La/qmk;->C:J

    .line 301
    .line 302
    new-instance v7, La/y9q0;

    .line 303
    .line 304
    const/16 v18, 0x0

    .line 305
    .line 306
    const v21, 0xfdffdd

    .line 307
    .line 308
    .line 309
    const-wide/16 v8, 0x0

    .line 310
    .line 311
    const/4 v12, 0x0

    .line 312
    const-wide/16 v14, 0x0

    .line 313
    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    invoke-direct/range {v7 .. v21}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 319
    .line 320
    .line 321
    const/16 v26, 0x0

    .line 322
    .line 323
    const v27, 0x1fff8

    .line 324
    .line 325
    .line 326
    iget-object v0, v0, La/rea;->d:Ljava/lang/String;

    .line 327
    .line 328
    move-object/from16 v23, v7

    .line 329
    .line 330
    const/4 v7, 0x0

    .line 331
    const/4 v10, 0x0

    .line 332
    const/4 v11, 0x0

    .line 333
    const-wide/16 v13, 0x0

    .line 334
    .line 335
    const/4 v15, 0x0

    .line 336
    const-wide/16 v16, 0x0

    .line 337
    .line 338
    const/16 v19, 0x0

    .line 339
    .line 340
    const/16 v20, 0x0

    .line 341
    .line 342
    const/16 v21, 0x0

    .line 343
    .line 344
    const/16 v22, 0x0

    .line 345
    .line 346
    const/16 v25, 0x0

    .line 347
    .line 348
    move-object/from16 v24, v1

    .line 349
    .line 350
    move-object v4, v3

    .line 351
    move-object v3, v0

    .line 352
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 353
    .line 354
    .line 355
    move-object/from16 v0, v24

    .line 356
    .line 357
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 358
    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_4
    move-object v0, v1

    .line 362
    invoke-virtual {v0}, La/fet;->X()V

    .line 363
    .line 364
    .line 365
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
