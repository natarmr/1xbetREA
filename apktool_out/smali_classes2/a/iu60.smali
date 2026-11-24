.class public final synthetic La/iu60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bxa;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/bxa;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/iu60;->a:B

    iput-object p1, p0, La/iu60;->b:La/bxa;

    iput-object p2, p0, La/iu60;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iu60;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x6

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, v0, La/iu60;->c:La/pz40;

    .line 13
    .line 14
    iget-object v0, v0, La/iu60;->b:La/bxa;

    .line 15
    .line 16
    const/4 v8, 0x4

    .line 17
    const/4 v9, 0x1

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/ir8;

    .line 24
    .line 25
    move-object/from16 v15, p2

    .line 26
    .line 27
    check-cast v15, La/fet;

    .line 28
    .line 29
    move-object/from16 v10, p3

    .line 30
    .line 31
    check-cast v10, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    and-int/lit8 v11, v10, 0x6

    .line 41
    .line 42
    if-nez v11, :cond_1

    .line 43
    .line 44
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v11, :cond_0

    .line 49
    .line 50
    move v4, v8

    .line 51
    :cond_0
    or-int/2addr v10, v4

    .line 52
    :cond_1
    and-int/lit8 v4, v10, 0x13

    .line 53
    .line 54
    if-eq v4, v3, :cond_2

    .line 55
    .line 56
    move v3, v9

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v3, v6

    .line 59
    :goto_0
    and-int/lit8 v4, v10, 0x1

    .line 60
    .line 61
    invoke-virtual {v15, v4, v3}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_6

    .line 66
    .line 67
    iget-object v10, v0, La/bxa;->b:La/n0x;

    .line 68
    .line 69
    iget-object v11, v0, La/bxa;->c:La/n0x;

    .line 70
    .line 71
    new-instance v12, La/m0x;

    .line 72
    .line 73
    const v3, 0x7f0807c2

    .line 74
    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-direct {v12, v3, v4, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    sget-object v4, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v3, v4, :cond_3

    .line 87
    .line 88
    new-instance v3, La/y9v;

    .line 89
    .line 90
    const/16 v4, 0x16

    .line 91
    .line 92
    invoke-direct {v3, v7, v4}, La/y9v;-><init>(La/pz40;B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v15, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    move-object v13, v3

    .line 99
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    new-instance v3, La/csw;

    .line 102
    .line 103
    invoke-direct {v3, v1, v8}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    const v4, -0x1d0e638a

    .line 107
    .line 108
    .line 109
    invoke-static {v4, v3, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    const/16 v16, 0x6c00

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    invoke-static/range {v10 .. v17}, La/y9a;->f(La/o0x;La/o0x;La/m0x;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;II)V

    .line 118
    .line 119
    .line 120
    iget-boolean v0, v0, La/bxa;->g:Z

    .line 121
    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    const v0, -0x7574cf05

    .line 125
    .line 126
    .line 127
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v1, v2}, La/ir8;->a(La/mm40;)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget-object v1, La/qmk;->a:La/zcl;

    .line 135
    .line 136
    const/high16 v1, 0x41200000    # 10.0f

    .line 137
    .line 138
    invoke-static {v1}, La/vgg0;->a(F)La/ugg0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 147
    .line 148
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 153
    .line 154
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundLight60-0d7_KjU()J

    .line 155
    .line 156
    .line 157
    move-result-wide v1

    .line 158
    sget-object v3, La/jd8;->n:La/ljc;

    .line 159
    .line 160
    invoke-static {v0, v1, v2, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 165
    .line 166
    invoke-static {v1, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    iget-wide v2, v15, La/fet;->T:J

    .line 171
    .line 172
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v15, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v15}, La/fet;->i0()V

    .line 190
    .line 191
    .line 192
    iget-boolean v4, v15, La/fet;->S:Z

    .line 193
    .line 194
    if-eqz v4, :cond_4

    .line 195
    .line 196
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 197
    .line 198
    invoke-virtual {v15, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_4
    invoke-virtual {v15}, La/fet;->r0()V

    .line 203
    .line 204
    .line 205
    :goto_1
    sget-object v4, La/gqw0;->x:La/shd;

    .line 206
    .line 207
    invoke-static {v15, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    sget-object v1, La/gqw0;->w:La/shd;

    .line 211
    .line 212
    invoke-static {v15, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    sget-object v2, La/gqw0;->y:La/shd;

    .line 220
    .line 221
    invoke-static {v15, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 225
    .line 226
    .line 227
    sget-object v1, La/gqw0;->v:La/shd;

    .line 228
    .line 229
    invoke-static {v15, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    const v0, 0x7f080c73

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v6, v15}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    const/16 v18, 0x38

    .line 240
    .line 241
    const/16 v19, 0x7c

    .line 242
    .line 243
    const/4 v11, 0x0

    .line 244
    const/4 v12, 0x0

    .line 245
    const/4 v13, 0x0

    .line 246
    const/4 v14, 0x0

    .line 247
    move-object/from16 v17, v15

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    invoke-static/range {v10 .. v19}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v15, v17

    .line 256
    .line 257
    invoke-virtual {v15, v9}, La/fet;->r(Z)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v15, v6}, La/fet;->r(Z)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_5
    const v0, -0x756c89d1    # -1.4200041E-32f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v15, v6}, La/fet;->r(Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_6
    invoke-virtual {v15}, La/fet;->X()V

    .line 275
    .line 276
    .line 277
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_0
    move-object/from16 v1, p1

    .line 281
    .line 282
    check-cast v1, La/yhg0;

    .line 283
    .line 284
    move-object/from16 v10, p2

    .line 285
    .line 286
    check-cast v10, La/fet;

    .line 287
    .line 288
    move-object/from16 v11, p3

    .line 289
    .line 290
    check-cast v11, Ljava/lang/Integer;

    .line 291
    .line 292
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    and-int/lit8 v12, v11, 0x6

    .line 300
    .line 301
    if-nez v12, :cond_8

    .line 302
    .line 303
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v12

    .line 307
    if-eqz v12, :cond_7

    .line 308
    .line 309
    move v4, v8

    .line 310
    :cond_7
    or-int/2addr v11, v4

    .line 311
    :cond_8
    and-int/lit8 v4, v11, 0x13

    .line 312
    .line 313
    if-eq v4, v3, :cond_9

    .line 314
    .line 315
    move v6, v9

    .line 316
    :cond_9
    and-int/lit8 v3, v11, 0x1

    .line 317
    .line 318
    invoke-virtual {v10, v3, v6}, La/fet;->U(IZ)Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_b

    .line 323
    .line 324
    new-instance v3, La/iu60;

    .line 325
    .line 326
    invoke-direct {v3, v0, v7, v9}, La/iu60;-><init>(La/bxa;La/pz40;B)V

    .line 327
    .line 328
    .line 329
    const v4, 0x2fb6ceb3

    .line 330
    .line 331
    .line 332
    invoke-static {v4, v3, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-static {v3, v10, v5}, La/jiq0;->x(La/ugd;La/fet;I)V

    .line 337
    .line 338
    .line 339
    iget-object v11, v0, La/bxa;->d:Ljava/lang/String;

    .line 340
    .line 341
    iget-boolean v12, v0, La/bxa;->e:Z

    .line 342
    .line 343
    iget-object v13, v0, La/bxa;->f:Ljava/lang/String;

    .line 344
    .line 345
    iget-boolean v0, v0, La/bxa;->g:Z

    .line 346
    .line 347
    if-eqz v0, :cond_a

    .line 348
    .line 349
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 350
    .line 351
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 356
    .line 357
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 358
    .line 359
    .line 360
    move-result-wide v3

    .line 361
    :goto_3
    move-wide v14, v3

    .line 362
    goto :goto_4

    .line 363
    :cond_a
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 364
    .line 365
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 370
    .line 371
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    goto :goto_3

    .line 376
    :goto_4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 377
    .line 378
    invoke-interface {v1, v0, v2, v9}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    sget-object v0, La/qmk;->a:La/zcl;

    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    const/16 v8, 0xe

    .line 386
    .line 387
    const/high16 v4, 0x41400000    # 12.0f

    .line 388
    .line 389
    const/4 v5, 0x0

    .line 390
    const/4 v6, 0x0

    .line 391
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    move-object/from16 v16, v10

    .line 398
    .line 399
    move-object v10, v0

    .line 400
    invoke-static/range {v10 .. v17}, La/jiq0;->m(La/mm40;Ljava/lang/String;ZLjava/lang/String;JLa/fet;I)V

    .line 401
    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_b
    move-object/from16 v16, v10

    .line 405
    .line 406
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 407
    .line 408
    .line 409
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object v0

    .line 412
    nop

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
