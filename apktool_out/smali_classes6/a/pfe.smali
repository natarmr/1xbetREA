.class public final synthetic La/pfe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:La/mez;

.field public final synthetic c:La/ehm0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z

.field public final synthetic f:La/ehm0;

.field public final synthetic g:La/ehm0;

.field public final synthetic h:La/db00;

.field public final synthetic i:La/ehm0;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:La/ehm0;

.field public final synthetic l:La/ehm0;

.field public final synthetic m:La/ehm0;

.field public final synthetic n:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/mez;La/ehm0;Lkotlin/jvm/functions/Function1;ZLa/ehm0;La/ehm0;La/db00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pfe;->a:La/a4x;

    iput-object p2, p0, La/pfe;->b:La/mez;

    iput-object p3, p0, La/pfe;->c:La/ehm0;

    iput-object p4, p0, La/pfe;->d:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, La/pfe;->e:Z

    iput-object p6, p0, La/pfe;->f:La/ehm0;

    iput-object p7, p0, La/pfe;->g:La/ehm0;

    iput-object p8, p0, La/pfe;->h:La/db00;

    iput-object p9, p0, La/pfe;->i:La/ehm0;

    iput-object p10, p0, La/pfe;->j:Ljava/util/List;

    iput-object p11, p0, La/pfe;->k:La/ehm0;

    iput-object p12, p0, La/pfe;->l:La/ehm0;

    iput-object p13, p0, La/pfe;->m:La/ehm0;

    iput-object p14, p0, La/pfe;->n:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/rk80;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v13, p3

    .line 16
    .line 17
    check-cast v13, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    and-int/lit8 v1, v3, 0x30

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v13, v2}, La/fet;->e(I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const/16 v1, 0x20

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/16 v1, 0x10

    .line 46
    .line 47
    :goto_0
    or-int/2addr v3, v1

    .line 48
    :cond_1
    and-int/lit16 v1, v3, 0x91

    .line 49
    .line 50
    const/16 v5, 0x90

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x1

    .line 54
    if-eq v1, v5, :cond_2

    .line 55
    .line 56
    move v1, v7

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v1, v6

    .line 59
    :goto_1
    and-int/2addr v3, v7

    .line 60
    invoke-virtual {v13, v3, v1}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_c

    .line 65
    .line 66
    iget-object v1, v0, La/pfe;->a:La/a4x;

    .line 67
    .line 68
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/beo0;

    .line 73
    .line 74
    iget v1, v1, La/beo0;->c:I

    .line 75
    .line 76
    const/16 v2, 0xc

    .line 77
    .line 78
    const/4 v3, 0x7

    .line 79
    const/high16 v5, 0x41c00000    # 24.0f

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    iget-object v9, v0, La/pfe;->d:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    iget-boolean v10, v0, La/pfe;->e:Z

    .line 85
    .line 86
    const/high16 v11, 0x41000000    # 8.0f

    .line 87
    .line 88
    sget-object v12, La/ukd;->a:La/cl5;

    .line 89
    .line 90
    const/4 v14, 0x2

    .line 91
    if-eq v1, v7, :cond_9

    .line 92
    .line 93
    if-eq v1, v14, :cond_6

    .line 94
    .line 95
    const/4 v10, 0x3

    .line 96
    if-eq v1, v10, :cond_3

    .line 97
    .line 98
    const v0, -0x570dfe54

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v13, v6}, La/fet;->r(Z)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_3
    const v1, 0x7541e45f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 113
    .line 114
    .line 115
    new-instance v1, La/y3m0;

    .line 116
    .line 117
    invoke-direct {v1, v14}, La/y3m0;-><init>(I)V

    .line 118
    .line 119
    .line 120
    sget-object v10, La/qmk;->a:La/zcl;

    .line 121
    .line 122
    move v10, v6

    .line 123
    invoke-static {v8, v8, v8, v5, v3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    new-instance v8, La/qw3;

    .line 128
    .line 129
    new-instance v3, La/gne;

    .line 130
    .line 131
    invoke-direct {v3, v4, v2}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v8, v11, v7, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v0, La/pfe;->n:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v13, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    or-int/2addr v2, v3

    .line 148
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    if-nez v2, :cond_4

    .line 153
    .line 154
    if-ne v3, v12, :cond_5

    .line 155
    .line 156
    :cond_4
    new-instance v3, La/td8;

    .line 157
    .line 158
    invoke-direct {v3, v0, v9, v7}, La/td8;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    move-object v12, v3

    .line 165
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 166
    .line 167
    const/high16 v14, 0x30000000

    .line 168
    .line 169
    const/16 v15, 0x196

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    const/4 v5, 0x0

    .line 173
    const/high16 v7, 0x41000000    # 8.0f

    .line 174
    .line 175
    const/4 v9, 0x0

    .line 176
    move v0, v10

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object v3, v1

    .line 180
    move v1, v0

    .line 181
    invoke-static/range {v3 .. v15}, La/ydx;->f(La/y3m0;La/mm40;La/mez;La/lh80;FLa/ow3;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13, v1}, La/fet;->r(Z)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :cond_6
    move v1, v6

    .line 190
    const v2, 0x7524ff5c

    .line 191
    .line 192
    .line 193
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 194
    .line 195
    .line 196
    sget-object v2, La/qmk;->a:La/zcl;

    .line 197
    .line 198
    invoke-static {v8, v8, v8, v5, v3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    iget-object v15, v0, La/pfe;->k:La/ehm0;

    .line 203
    .line 204
    invoke-virtual {v13, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v13, v10}, La/fet;->h(Z)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    or-int/2addr v2, v3

    .line 213
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    or-int/2addr v2, v3

    .line 218
    iget-object v3, v0, La/pfe;->l:La/ehm0;

    .line 219
    .line 220
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    or-int/2addr v2, v4

    .line 225
    iget-object v0, v0, La/pfe;->m:La/ehm0;

    .line 226
    .line 227
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    or-int/2addr v2, v4

    .line 232
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    if-nez v2, :cond_7

    .line 237
    .line 238
    if-ne v4, v12, :cond_8

    .line 239
    .line 240
    :cond_7
    new-instance v14, La/cw6;

    .line 241
    .line 242
    const/16 v20, 0x4

    .line 243
    .line 244
    move-object/from16 v19, v0

    .line 245
    .line 246
    move-object/from16 v18, v3

    .line 247
    .line 248
    move-object/from16 v17, v9

    .line 249
    .line 250
    move/from16 v16, v10

    .line 251
    .line 252
    invoke-direct/range {v14 .. v20}, La/cw6;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v13, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move-object v4, v14

    .line 259
    :cond_8
    move-object v11, v4

    .line 260
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 261
    .line 262
    move-object v12, v13

    .line 263
    const/high16 v13, 0x6000000

    .line 264
    .line 265
    const/16 v14, 0xfb

    .line 266
    .line 267
    const/4 v3, 0x0

    .line 268
    const/4 v4, 0x0

    .line 269
    const/4 v6, 0x0

    .line 270
    const/4 v7, 0x0

    .line 271
    const/4 v8, 0x0

    .line 272
    const/4 v9, 0x0

    .line 273
    const/4 v10, 0x0

    .line 274
    invoke-static/range {v3 .. v14}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 275
    .line 276
    .line 277
    move-object v13, v12

    .line 278
    invoke-virtual {v13, v1}, La/fet;->r(Z)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_9
    move v1, v6

    .line 284
    move-object v6, v9

    .line 285
    move v9, v10

    .line 286
    const v10, 0x74e9fb76

    .line 287
    .line 288
    .line 289
    invoke-virtual {v13, v10}, La/fet;->e0(I)V

    .line 290
    .line 291
    .line 292
    sget-object v10, La/jm40;->b:La/jm40;

    .line 293
    .line 294
    const-string v15, "CONTENT_MENU_VERTICAL_PAGER"

    .line 295
    .line 296
    invoke-static {v10, v15}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    new-instance v15, La/y3m0;

    .line 301
    .line 302
    invoke-direct {v15, v14}, La/y3m0;-><init>(I)V

    .line 303
    .line 304
    .line 305
    sget-object v14, La/qmk;->a:La/zcl;

    .line 306
    .line 307
    invoke-static {v8, v8, v8, v5, v3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    new-instance v8, La/qw3;

    .line 312
    .line 313
    new-instance v5, La/gne;

    .line 314
    .line 315
    invoke-direct {v5, v4, v2}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 316
    .line 317
    .line 318
    invoke-direct {v8, v11, v7, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 319
    .line 320
    .line 321
    move-object v2, v15

    .line 322
    iget-object v15, v0, La/pfe;->c:La/ehm0;

    .line 323
    .line 324
    invoke-virtual {v13, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    invoke-virtual {v13, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    or-int/2addr v4, v5

    .line 333
    invoke-virtual {v13, v9}, La/fet;->h(Z)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    or-int/2addr v4, v5

    .line 338
    iget-object v5, v0, La/pfe;->f:La/ehm0;

    .line 339
    .line 340
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    or-int/2addr v4, v7

    .line 345
    iget-object v7, v0, La/pfe;->g:La/ehm0;

    .line 346
    .line 347
    invoke-virtual {v13, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    or-int/2addr v4, v11

    .line 352
    iget-object v11, v0, La/pfe;->h:La/db00;

    .line 353
    .line 354
    invoke-virtual {v13, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v14

    .line 358
    or-int/2addr v4, v14

    .line 359
    iget-object v14, v0, La/pfe;->i:La/ehm0;

    .line 360
    .line 361
    invoke-virtual {v13, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v16

    .line 365
    or-int v4, v4, v16

    .line 366
    .line 367
    iget-object v1, v0, La/pfe;->j:Ljava/util/List;

    .line 368
    .line 369
    invoke-virtual {v13, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v16

    .line 373
    or-int v4, v4, v16

    .line 374
    .line 375
    move-object/from16 v20, v1

    .line 376
    .line 377
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    if-nez v4, :cond_a

    .line 382
    .line 383
    if-ne v1, v12, :cond_b

    .line 384
    .line 385
    :cond_a
    move-object/from16 v19, v14

    .line 386
    .line 387
    new-instance v14, La/rfe;

    .line 388
    .line 389
    move-object/from16 v16, v5

    .line 390
    .line 391
    move-object/from16 v21, v6

    .line 392
    .line 393
    move-object/from16 v17, v7

    .line 394
    .line 395
    move/from16 v22, v9

    .line 396
    .line 397
    move-object/from16 v18, v11

    .line 398
    .line 399
    invoke-direct/range {v14 .. v22}, La/rfe;-><init>(La/ehm0;La/ehm0;La/ehm0;La/db00;La/ehm0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v13, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    move-object v1, v14

    .line 406
    :cond_b
    move-object v12, v1

    .line 407
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 408
    .line 409
    const v14, 0x30000030

    .line 410
    .line 411
    .line 412
    const/16 v15, 0x190

    .line 413
    .line 414
    iget-object v5, v0, La/pfe;->b:La/mez;

    .line 415
    .line 416
    const/high16 v7, 0x41000000    # 8.0f

    .line 417
    .line 418
    const/4 v9, 0x0

    .line 419
    move-object v4, v10

    .line 420
    const/4 v10, 0x0

    .line 421
    const/4 v11, 0x0

    .line 422
    move-object v6, v3

    .line 423
    move-object v3, v2

    .line 424
    invoke-static/range {v3 .. v15}, La/ydx;->f(La/y3m0;La/mm40;La/mez;La/lh80;FLa/ow3;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 425
    .line 426
    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 429
    .line 430
    .line 431
    goto :goto_2

    .line 432
    :cond_c
    invoke-virtual {v13}, La/fet;->X()V

    .line 433
    .line 434
    .line 435
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    return-object v0
.end method
