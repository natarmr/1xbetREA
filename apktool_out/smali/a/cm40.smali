.class public final La/cm40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:La/xpj0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:La/vne;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/xpj0;Lkotlin/jvm/functions/Function0;La/vne;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/cm40;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/cm40;->c:La/xpj0;

    .line 8
    .line 9
    iput-object p2, p0, La/cm40;->d:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iput-object p3, p0, La/cm40;->e:La/vne;

    .line 12
    .line 13
    iput-boolean p4, p0, La/cm40;->f:Z

    .line 14
    .line 15
    iput-object p5, p0, La/cm40;->g:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, La/cm40;->h:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, La/cm40;->i:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, La/cm40;->b:Lkotlin/jvm/functions/Function2;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;La/t33;La/xpj0;Lkotlin/jvm/functions/Function2;La/ugd;Lkotlin/jvm/functions/Function0;La/vne;Z)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/cm40;->a:B

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cm40;->b:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, La/cm40;->g:Ljava/lang/Object;

    iput-object p3, p0, La/cm40;->c:La/xpj0;

    iput-object p4, p0, La/cm40;->h:Ljava/lang/Object;

    iput-object p5, p0, La/cm40;->i:Ljava/lang/Object;

    iput-object p6, p0, La/cm40;->d:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/cm40;->e:La/vne;

    iput-boolean p8, p0, La/cm40;->f:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cm40;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    iget-object v4, v0, La/cm40;->b:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    iget-object v7, v0, La/cm40;->i:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, La/cm40;->h:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    iget-object v10, v0, La/cm40;->g:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/fet;

    .line 26
    .line 27
    move-object/from16 v11, p2

    .line 28
    .line 29
    check-cast v11, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    check-cast v10, La/t33;

    .line 36
    .line 37
    and-int/lit8 v12, v11, 0x3

    .line 38
    .line 39
    if-eq v12, v5, :cond_0

    .line 40
    .line 41
    move v5, v6

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v5, v9

    .line 44
    :goto_0
    and-int/2addr v11, v6

    .line 45
    invoke-virtual {v1, v11, v5}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_7

    .line 50
    .line 51
    sget-object v5, La/jm40;->b:La/jm40;

    .line 52
    .line 53
    const/high16 v11, 0x3f800000    # 1.0f

    .line 54
    .line 55
    invoke-static {v5, v11}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-interface {v4, v1, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, La/vhv0;

    .line 68
    .line 69
    invoke-static {v5, v4}, La/j120;->k0(La/mm40;La/vhv0;)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    if-nez v5, :cond_1

    .line 82
    .line 83
    if-ne v11, v3, :cond_2

    .line 84
    .line 85
    :cond_1
    new-instance v11, La/m53;

    .line 86
    .line 87
    const/16 v3, 0x15

    .line 88
    .line 89
    invoke-direct {v11, v10, v3}, La/m53;-><init>(La/t33;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 96
    .line 97
    invoke-static {v4, v11}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    new-instance v4, La/pp8;

    .line 102
    .line 103
    iget-object v11, v0, La/cm40;->c:La/xpj0;

    .line 104
    .line 105
    invoke-direct {v4, v11, v9}, La/pp8;-><init>(La/xpj0;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v4}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    move-object/from16 v18, v8

    .line 113
    .line 114
    check-cast v18, Lkotlin/jvm/functions/Function2;

    .line 115
    .line 116
    check-cast v7, La/ugd;

    .line 117
    .line 118
    sget-object v4, La/uc9;->c:La/mw3;

    .line 119
    .line 120
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 121
    .line 122
    invoke-static {v4, v5, v1, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, La/fet;->i0()V

    .line 144
    .line 145
    .line 146
    iget-boolean v10, v1, La/fet;->S:Z

    .line 147
    .line 148
    if-eqz v10, :cond_3

    .line 149
    .line 150
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 158
    .line 159
    invoke-static {v1, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    sget-object v2, La/gqw0;->w:La/shd;

    .line 163
    .line 164
    invoke-static {v1, v8, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    sget-object v2, La/gqw0;->y:La/shd;

    .line 168
    .line 169
    iget-boolean v4, v1, La/fet;->S:Z

    .line 170
    .line 171
    if-nez v4, :cond_4

    .line 172
    .line 173
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_5

    .line 186
    .line 187
    :cond_4
    invoke-static {v5, v1, v5, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 188
    .line 189
    .line 190
    :cond_5
    sget-object v2, La/gqw0;->v:La/shd;

    .line 191
    .line 192
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 193
    .line 194
    .line 195
    if-eqz v18, :cond_6

    .line 196
    .line 197
    const v2, 0x50a4256d

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 201
    .line 202
    .line 203
    const v2, 0x7f130c3e

    .line 204
    .line 205
    .line 206
    invoke-static {v2, v1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v17

    .line 210
    const v2, 0x7f130c3f

    .line 211
    .line 212
    .line 213
    invoke-static {v2, v1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    const v2, 0x7f130c41

    .line 218
    .line 219
    .line 220
    invoke-static {v2, v1}, La/jtt0;->j(ILa/fet;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v16

    .line 224
    new-instance v10, La/cm40;

    .line 225
    .line 226
    iget-object v12, v0, La/cm40;->d:Lkotlin/jvm/functions/Function0;

    .line 227
    .line 228
    iget-object v13, v0, La/cm40;->e:La/vne;

    .line 229
    .line 230
    iget-boolean v14, v0, La/cm40;->f:Z

    .line 231
    .line 232
    invoke-direct/range {v10 .. v18}, La/cm40;-><init>(La/xpj0;Lkotlin/jvm/functions/Function0;La/vne;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 233
    .line 234
    .line 235
    const v0, 0x773d37a4

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v10, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const/16 v2, 0x36

    .line 243
    .line 244
    invoke-static {v0, v1, v2}, La/tpj0;->a(La/ugd;La/fet;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_6
    const v0, 0x50d311ed

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 258
    .line 259
    .line 260
    :goto_2
    const/4 v0, 0x6

    .line 261
    sget-object v2, La/y5d;->a:La/y5d;

    .line 262
    .line 263
    invoke-static {v0, v7, v2, v1, v6}, La/vqd;->t(ILa/ugd;La/y5d;La/fet;Z)V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 268
    .line 269
    .line 270
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object v0

    .line 273
    :pswitch_0
    move-object/from16 v1, p1

    .line 274
    .line 275
    check-cast v1, La/fet;

    .line 276
    .line 277
    move-object/from16 v11, p2

    .line 278
    .line 279
    check-cast v11, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    and-int/lit8 v12, v11, 0x3

    .line 286
    .line 287
    if-eq v12, v5, :cond_8

    .line 288
    .line 289
    move v5, v6

    .line 290
    goto :goto_4

    .line 291
    :cond_8
    move v5, v9

    .line 292
    :goto_4
    and-int/2addr v11, v6

    .line 293
    invoke-virtual {v1, v11, v5}, La/fet;->U(IZ)Z

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    if-eqz v5, :cond_10

    .line 298
    .line 299
    iget-object v13, v0, La/cm40;->c:La/xpj0;

    .line 300
    .line 301
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    iget-object v11, v0, La/cm40;->d:Lkotlin/jvm/functions/Function0;

    .line 306
    .line 307
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    or-int/2addr v5, v12

    .line 312
    iget-object v12, v0, La/cm40;->e:La/vne;

    .line 313
    .line 314
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v14

    .line 318
    or-int/2addr v5, v14

    .line 319
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    if-nez v5, :cond_9

    .line 324
    .line 325
    if-ne v14, v3, :cond_a

    .line 326
    .line 327
    :cond_9
    new-instance v14, La/yl40;

    .line 328
    .line 329
    invoke-direct {v14, v13, v11, v12}, La/yl40;-><init>(La/xpj0;Lkotlin/jvm/functions/Function0;La/vne;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :cond_a
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 336
    .line 337
    invoke-static {v14}, La/y860;->X(Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    iget-boolean v14, v0, La/cm40;->f:Z

    .line 342
    .line 343
    invoke-virtual {v1, v14}, La/fet;->h(Z)Z

    .line 344
    .line 345
    .line 346
    move-result v14

    .line 347
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v15

    .line 351
    or-int/2addr v14, v15

    .line 352
    move-object v15, v10

    .line 353
    check-cast v15, Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v1, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v15

    .line 359
    or-int/2addr v14, v15

    .line 360
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    or-int/2addr v11, v14

    .line 365
    move-object v14, v8

    .line 366
    check-cast v14, Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v1, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v14

    .line 372
    or-int/2addr v11, v14

    .line 373
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    or-int/2addr v11, v12

    .line 378
    move-object v12, v7

    .line 379
    check-cast v12, Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v1, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    or-int/2addr v11, v12

    .line 386
    move-object v14, v10

    .line 387
    check-cast v14, Ljava/lang/String;

    .line 388
    .line 389
    move-object v15, v8

    .line 390
    check-cast v15, Ljava/lang/String;

    .line 391
    .line 392
    move-object/from16 v16, v7

    .line 393
    .line 394
    check-cast v16, Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    if-nez v11, :cond_b

    .line 401
    .line 402
    if-ne v7, v3, :cond_c

    .line 403
    .line 404
    :cond_b
    new-instance v11, La/acc;

    .line 405
    .line 406
    iget-boolean v12, v0, La/cm40;->f:Z

    .line 407
    .line 408
    iget-object v3, v0, La/cm40;->d:Lkotlin/jvm/functions/Function0;

    .line 409
    .line 410
    iget-object v0, v0, La/cm40;->e:La/vne;

    .line 411
    .line 412
    move-object/from16 v18, v0

    .line 413
    .line 414
    move-object/from16 v17, v3

    .line 415
    .line 416
    invoke-direct/range {v11 .. v18}, La/acc;-><init>(ZLa/xpj0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/vne;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    move-object v7, v11

    .line 423
    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 424
    .line 425
    invoke-static {v5, v6, v7}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 430
    .line 431
    invoke-static {v3, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-static {v1}, La/e3c;->x(La/fet;)I

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 448
    .line 449
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, La/fet;->i0()V

    .line 453
    .line 454
    .line 455
    iget-boolean v8, v1, La/fet;->S:Z

    .line 456
    .line 457
    if-eqz v8, :cond_d

    .line 458
    .line 459
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 460
    .line 461
    .line 462
    goto :goto_5

    .line 463
    :cond_d
    invoke-virtual {v1}, La/fet;->r0()V

    .line 464
    .line 465
    .line 466
    :goto_5
    sget-object v2, La/gqw0;->x:La/shd;

    .line 467
    .line 468
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 469
    .line 470
    .line 471
    sget-object v2, La/gqw0;->w:La/shd;

    .line 472
    .line 473
    invoke-static {v1, v7, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    sget-object v2, La/gqw0;->y:La/shd;

    .line 477
    .line 478
    iget-boolean v3, v1, La/fet;->S:Z

    .line 479
    .line 480
    if-nez v3, :cond_e

    .line 481
    .line 482
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    if-nez v3, :cond_f

    .line 495
    .line 496
    :cond_e
    invoke-static {v5, v1, v5, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 497
    .line 498
    .line 499
    :cond_f
    sget-object v2, La/gqw0;->v:La/shd;

    .line 500
    .line 501
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 502
    .line 503
    .line 504
    invoke-static {v9, v1, v4, v6}, La/h97;->q(ILa/fet;Lkotlin/jvm/functions/Function2;Z)V

    .line 505
    .line 506
    .line 507
    goto :goto_6

    .line 508
    :cond_10
    invoke-virtual {v1}, La/fet;->X()V

    .line 509
    .line 510
    .line 511
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object v0

    .line 514
    nop

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
