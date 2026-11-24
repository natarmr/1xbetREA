.class public final synthetic La/sl60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m580;


# direct methods
.method public synthetic constructor <init>(La/m580;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sl60;->a:B

    iput-object p1, p0, La/sl60;->b:La/m580;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sl60;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const v3, 0x7f0809ae

    .line 8
    .line 9
    .line 10
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 11
    .line 12
    const/16 v5, 0x30

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    sget-object v7, La/jm40;->b:La/jm40;

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x3

    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v11, 0x0

    .line 21
    iget-object v0, v0, La/sl60;->b:La/m580;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/fet;

    .line 29
    .line 30
    move-object/from16 v12, p2

    .line 31
    .line 32
    check-cast v12, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    and-int/lit8 v13, v12, 0x3

    .line 39
    .line 40
    if-eq v13, v8, :cond_0

    .line 41
    .line 42
    move v11, v10

    .line 43
    :cond_0
    and-int/lit8 v8, v12, 0x1

    .line 44
    .line 45
    invoke-virtual {v1, v8, v11}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-eqz v8, :cond_3

    .line 50
    .line 51
    sget-object v8, La/gqw0;->k:La/yx7;

    .line 52
    .line 53
    sget-object v11, La/uc9;->a:La/lw3;

    .line 54
    .line 55
    invoke-static {v11, v8, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget-wide v11, v1, La/fet;->T:J

    .line 60
    .line 61
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    invoke-static {v1, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, La/fet;->i0()V

    .line 79
    .line 80
    .line 81
    iget-boolean v13, v1, La/fet;->S:Z

    .line 82
    .line 83
    if-eqz v13, :cond_1

    .line 84
    .line 85
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 90
    .line 91
    .line 92
    :goto_0
    sget-object v4, La/gqw0;->x:La/shd;

    .line 93
    .line 94
    invoke-static {v1, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object v4, La/gqw0;->w:La/shd;

    .line 98
    .line 99
    invoke-static {v1, v11, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    sget-object v5, La/gqw0;->y:La/shd;

    .line 107
    .line 108
    invoke-static {v1, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 112
    .line 113
    .line 114
    sget-object v4, La/gqw0;->v:La/shd;

    .line 115
    .line 116
    invoke-static {v1, v12, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v7, v6, v9}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iget-object v5, v0, La/m580;->f:La/die0;

    .line 124
    .line 125
    iget-boolean v6, v0, La/m580;->h:Z

    .line 126
    .line 127
    if-eqz v6, :cond_2

    .line 128
    .line 129
    new-instance v3, La/b280;

    .line 130
    .line 131
    const v6, 0x7f0809f3

    .line 132
    .line 133
    .line 134
    invoke-direct {v3, v6}, La/b280;-><init>(I)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    new-instance v6, La/c280;

    .line 139
    .line 140
    iget-object v7, v0, La/m580;->d:Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {v6, v7, v3}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    move-object v3, v6

    .line 146
    :goto_1
    const/4 v6, 0x6

    .line 147
    invoke-static {v4, v5, v3, v1, v6}, La/xvw;->g(La/mm40;La/die0;La/d280;La/fet;I)V

    .line 148
    .line 149
    .line 150
    new-instance v11, La/x7z;

    .line 151
    .line 152
    invoke-direct {v11, v2, v10}, La/x7z;-><init>(FZ)V

    .line 153
    .line 154
    .line 155
    sget-object v2, La/qmk;->a:La/zcl;

    .line 156
    .line 157
    const/4 v15, 0x0

    .line 158
    const/16 v16, 0xe

    .line 159
    .line 160
    const/high16 v12, 0x41000000    # 8.0f

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const/4 v14, 0x0

    .line 164
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    iget-object v13, v0, La/m580;->b:Ljava/lang/String;

    .line 169
    .line 170
    sget-object v14, La/gqw0;->d:La/zx7;

    .line 171
    .line 172
    const/16 v17, 0x180

    .line 173
    .line 174
    const/16 v18, 0x8

    .line 175
    .line 176
    const/4 v15, 0x0

    .line 177
    move-object/from16 v16, v1

    .line 178
    .line 179
    invoke-static/range {v12 .. v18}, La/hxm0;->h(La/mm40;Ljava/lang/String;La/zx7;ILa/fet;II)V

    .line 180
    .line 181
    .line 182
    move-object/from16 v0, v16

    .line 183
    .line 184
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    move-object v0, v1

    .line 189
    invoke-virtual {v0}, La/fet;->X()V

    .line 190
    .line 191
    .line 192
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_0
    move-object/from16 v1, p1

    .line 196
    .line 197
    check-cast v1, La/fet;

    .line 198
    .line 199
    move-object/from16 v2, p2

    .line 200
    .line 201
    check-cast v2, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    and-int/lit8 v3, v2, 0x3

    .line 208
    .line 209
    if-eq v3, v8, :cond_4

    .line 210
    .line 211
    move v3, v10

    .line 212
    goto :goto_3

    .line 213
    :cond_4
    move v3, v11

    .line 214
    :goto_3
    and-int/2addr v2, v10

    .line 215
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_5

    .line 220
    .line 221
    sget-object v2, La/qmk;->a:La/zcl;

    .line 222
    .line 223
    const/high16 v2, 0x41000000    # 8.0f

    .line 224
    .line 225
    const/4 v3, 0x0

    .line 226
    invoke-static {v7, v2, v3, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    iget-object v0, v0, La/m580;->g:La/lpm;

    .line 231
    .line 232
    invoke-static {v2, v0, v1, v11}, La/xvw;->q(La/mm40;La/lpm;La/fet;I)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_5
    invoke-virtual {v1}, La/fet;->X()V

    .line 237
    .line 238
    .line 239
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_1
    move-object/from16 v1, p1

    .line 243
    .line 244
    check-cast v1, La/fet;

    .line 245
    .line 246
    move-object/from16 v12, p2

    .line 247
    .line 248
    check-cast v12, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    and-int/lit8 v13, v12, 0x3

    .line 255
    .line 256
    if-eq v13, v8, :cond_6

    .line 257
    .line 258
    move v8, v10

    .line 259
    goto :goto_5

    .line 260
    :cond_6
    move v8, v11

    .line 261
    :goto_5
    and-int/2addr v12, v10

    .line 262
    invoke-virtual {v1, v12, v8}, La/fet;->U(IZ)Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-eqz v8, :cond_9

    .line 267
    .line 268
    sget-object v8, La/gqw0;->k:La/yx7;

    .line 269
    .line 270
    sget-object v12, La/uc9;->a:La/lw3;

    .line 271
    .line 272
    invoke-static {v12, v8, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    iget-wide v12, v1, La/fet;->T:J

    .line 277
    .line 278
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    invoke-static {v1, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 291
    .line 292
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, La/fet;->i0()V

    .line 296
    .line 297
    .line 298
    iget-boolean v14, v1, La/fet;->S:Z

    .line 299
    .line 300
    if-eqz v14, :cond_7

    .line 301
    .line 302
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 303
    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_7
    invoke-virtual {v1}, La/fet;->r0()V

    .line 307
    .line 308
    .line 309
    :goto_6
    sget-object v4, La/gqw0;->x:La/shd;

    .line 310
    .line 311
    invoke-static {v1, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 312
    .line 313
    .line 314
    sget-object v4, La/gqw0;->w:La/shd;

    .line 315
    .line 316
    invoke-static {v1, v12, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    sget-object v5, La/gqw0;->y:La/shd;

    .line 324
    .line 325
    invoke-static {v1, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 329
    .line 330
    .line 331
    sget-object v4, La/gqw0;->v:La/shd;

    .line 332
    .line 333
    invoke-static {v1, v13, v4, v2, v10}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 334
    .line 335
    .line 336
    move-result-object v12

    .line 337
    iget-object v13, v0, La/m580;->a:Ljava/lang/String;

    .line 338
    .line 339
    sget-object v14, La/gqw0;->f:La/zx7;

    .line 340
    .line 341
    const/16 v17, 0x180

    .line 342
    .line 343
    const/16 v18, 0x8

    .line 344
    .line 345
    const/4 v15, 0x0

    .line 346
    move-object/from16 v16, v1

    .line 347
    .line 348
    invoke-static/range {v12 .. v18}, La/hxm0;->h(La/mm40;Ljava/lang/String;La/zx7;ILa/fet;II)V

    .line 349
    .line 350
    .line 351
    invoke-static {v7, v6, v9}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 352
    .line 353
    .line 354
    move-result-object v12

    .line 355
    sget-object v2, La/qmk;->a:La/zcl;

    .line 356
    .line 357
    const/16 v16, 0x0

    .line 358
    .line 359
    const/16 v17, 0xe

    .line 360
    .line 361
    const/high16 v13, 0x41000000    # 8.0f

    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/4 v15, 0x0

    .line 365
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    iget-object v4, v0, La/m580;->e:La/die0;

    .line 370
    .line 371
    iget-boolean v5, v0, La/m580;->h:Z

    .line 372
    .line 373
    if-eqz v5, :cond_8

    .line 374
    .line 375
    new-instance v0, La/b280;

    .line 376
    .line 377
    const v3, 0x7f080917

    .line 378
    .line 379
    .line 380
    invoke-direct {v0, v3}, La/b280;-><init>(I)V

    .line 381
    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_8
    new-instance v5, La/c280;

    .line 385
    .line 386
    iget-object v0, v0, La/m580;->c:Ljava/lang/String;

    .line 387
    .line 388
    invoke-direct {v5, v0, v3}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 389
    .line 390
    .line 391
    move-object v0, v5

    .line 392
    :goto_7
    invoke-static {v2, v4, v0, v1, v11}, La/xvw;->g(La/mm40;La/die0;La/d280;La/fet;I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 396
    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 400
    .line 401
    .line 402
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
