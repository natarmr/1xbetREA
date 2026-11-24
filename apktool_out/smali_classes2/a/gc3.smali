.class public final synthetic La/gc3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;FLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/gc3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gc3;->c:Ljava/lang/Object;

    iput-object p2, p0, La/gc3;->d:Ljava/lang/Object;

    iput p3, p0, La/gc3;->b:F

    iput-object p4, p0, La/gc3;->e:Ljava/lang/Object;

    iput-object p5, p0, La/gc3;->f:Ljava/lang/Object;

    iput-object p6, p0, La/gc3;->g:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/ycl;La/ycp0;FLa/w6n;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/gc3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gc3;->c:Ljava/lang/Object;

    iput-object p2, p0, La/gc3;->d:Ljava/lang/Object;

    iput-object p3, p0, La/gc3;->e:Ljava/lang/Object;

    iput p4, p0, La/gc3;->b:F

    iput-object p5, p0, La/gc3;->f:Ljava/lang/Object;

    iput-object p6, p0, La/gc3;->g:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;FLjava/lang/Object;La/wdr;IB)V
    .locals 0

    .line 3
    iput-byte p8, p0, La/gc3;->a:B

    iput-object p1, p0, La/gc3;->c:Ljava/lang/Object;

    iput-object p2, p0, La/gc3;->d:Ljava/lang/Object;

    iput-object p3, p0, La/gc3;->e:Ljava/lang/Object;

    iput p4, p0, La/gc3;->b:F

    iput-object p5, p0, La/gc3;->f:Ljava/lang/Object;

    iput-object p6, p0, La/gc3;->g:La/wdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gc3;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v6, v0, La/gc3;->g:La/wdr;

    .line 8
    .line 9
    iget-object v7, v0, La/gc3;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v8, v0, La/gc3;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v9, v0, La/gc3;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v10, v0, La/gc3;->c:Ljava/lang/Object;

    .line 16
    .line 17
    const/16 v11, 0xe

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v1, La/gqw0;->v:La/shd;

    .line 23
    .line 24
    sget-object v12, La/gqw0;->y:La/shd;

    .line 25
    .line 26
    sget-object v13, La/gqw0;->w:La/shd;

    .line 27
    .line 28
    sget-object v14, La/gqw0;->x:La/shd;

    .line 29
    .line 30
    check-cast v10, La/mm40;

    .line 31
    .line 32
    check-cast v9, La/ycl;

    .line 33
    .line 34
    check-cast v8, La/ycp0;

    .line 35
    .line 36
    move-object/from16 v17, v7

    .line 37
    .line 38
    check-cast v17, La/w6n;

    .line 39
    .line 40
    move-object/from16 v18, v6

    .line 41
    .line 42
    check-cast v18, Lkotlin/jvm/functions/Function2;

    .line 43
    .line 44
    move-object/from16 v6, p1

    .line 45
    .line 46
    check-cast v6, La/fet;

    .line 47
    .line 48
    move-object/from16 v7, p2

    .line 49
    .line 50
    check-cast v7, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    sget-object v15, La/gqw0;->n:La/xx7;

    .line 57
    .line 58
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 59
    .line 60
    and-int/lit8 v5, v7, 0x3

    .line 61
    .line 62
    if-eq v5, v2, :cond_0

    .line 63
    .line 64
    move v2, v4

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v2, 0x0

    .line 67
    :goto_0
    and-int/lit8 v5, v7, 0x1

    .line 68
    .line 69
    invoke-virtual {v6, v5, v2}, La/fet;->U(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_8

    .line 74
    .line 75
    sget-object v2, La/kcp0;->c:La/zfn;

    .line 76
    .line 77
    invoke-virtual {v6, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sget-object v7, La/jm40;->b:La/jm40;

    .line 88
    .line 89
    iget v0, v0, La/gc3;->b:F

    .line 90
    .line 91
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    const v2, -0x42a69372

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v2}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    sget-object v2, La/qmk;->a:La/zcl;

    .line 102
    .line 103
    new-instance v2, La/qw3;

    .line 104
    .line 105
    new-instance v4, La/jf4;

    .line 106
    .line 107
    invoke-direct {v4, v11}, La/jf4;-><init>(B)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v19, v8

    .line 111
    .line 112
    const/high16 v8, 0x41800000    # 16.0f

    .line 113
    .line 114
    const/4 v11, 0x1

    .line 115
    invoke-direct {v2, v8, v11, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 116
    .line 117
    .line 118
    const/16 v4, 0x30

    .line 119
    .line 120
    invoke-static {v2, v3, v6, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-wide v3, v6, La/fet;->T:J

    .line 125
    .line 126
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v6, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6}, La/fet;->i0()V

    .line 144
    .line 145
    .line 146
    iget-boolean v10, v6, La/fet;->S:Z

    .line 147
    .line 148
    if-eqz v10, :cond_1

    .line 149
    .line 150
    invoke-virtual {v6, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_1
    invoke-virtual {v6}, La/fet;->r0()V

    .line 155
    .line 156
    .line 157
    :goto_1
    invoke-static {v6, v2, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v6, v4, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v3, v6, v12, v6}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 164
    .line 165
    .line 166
    const/high16 v2, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v11, 0x1

    .line 169
    invoke-static {v6, v8, v1, v2, v11}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-eqz v9, :cond_2

    .line 174
    .line 175
    iget v3, v9, La/ycl;->a:F

    .line 176
    .line 177
    invoke-static {v7, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    const/4 v4, 0x0

    .line 182
    goto :goto_2

    .line 183
    :cond_2
    const/4 v3, 0x3

    .line 184
    const/4 v4, 0x0

    .line 185
    const/4 v8, 0x0

    .line 186
    invoke-static {v7, v8, v4, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :goto_2
    invoke-interface {v2, v3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    move-object/from16 v8, v19

    .line 195
    .line 196
    check-cast v8, La/rcp0;

    .line 197
    .line 198
    iget-object v3, v8, La/rcp0;->c:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v4, v6, v2, v3}, La/egp0;->a(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    new-instance v2, La/qw3;

    .line 204
    .line 205
    new-instance v3, La/jf4;

    .line 206
    .line 207
    const/16 v4, 0xe

    .line 208
    .line 209
    invoke-direct {v3, v4}, La/jf4;-><init>(B)V

    .line 210
    .line 211
    .line 212
    const/4 v11, 0x1

    .line 213
    invoke-direct {v2, v0, v11, v3}, La/qw3;-><init>(FZLa/rw3;)V

    .line 214
    .line 215
    .line 216
    const/16 v4, 0x30

    .line 217
    .line 218
    invoke-static {v2, v15, v6, v4}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget-wide v2, v6, La/fet;->T:J

    .line 223
    .line 224
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {v6, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v6}, La/fet;->i0()V

    .line 237
    .line 238
    .line 239
    iget-boolean v7, v6, La/fet;->S:Z

    .line 240
    .line 241
    if-eqz v7, :cond_3

    .line 242
    .line 243
    invoke-virtual {v6, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_3
    invoke-virtual {v6}, La/fet;->r0()V

    .line 248
    .line 249
    .line 250
    :goto_3
    invoke-static {v6, v0, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v6, v3, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v2, v6, v12, v6}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v6, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    iget-object v15, v8, La/rcp0;->a:La/g5a0;

    .line 263
    .line 264
    iget-object v0, v8, La/rcp0;->b:La/g5a0;

    .line 265
    .line 266
    const/16 v20, 0x0

    .line 267
    .line 268
    const/16 v21, 0x1

    .line 269
    .line 270
    move-object/from16 v16, v0

    .line 271
    .line 272
    move-object/from16 v19, v6

    .line 273
    .line 274
    invoke-static/range {v15 .. v21}, La/cn80;->a(La/g5a0;La/g5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v2, v19

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    const/4 v11, 0x1

    .line 281
    invoke-static {v2, v11, v11, v4}, La/ohs0;->x(La/fet;ZZZ)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_7

    .line 285
    .line 286
    :cond_4
    move-object v2, v6

    .line 287
    move-object/from16 v19, v8

    .line 288
    .line 289
    const/4 v11, 0x1

    .line 290
    const v4, -0x4292ddb6

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 294
    .line 295
    .line 296
    sget-object v4, La/qmk;->a:La/zcl;

    .line 297
    .line 298
    new-instance v4, La/qw3;

    .line 299
    .line 300
    new-instance v6, La/jf4;

    .line 301
    .line 302
    const/16 v8, 0xe

    .line 303
    .line 304
    invoke-direct {v6, v8}, La/jf4;-><init>(B)V

    .line 305
    .line 306
    .line 307
    const/high16 v8, 0x41800000    # 16.0f

    .line 308
    .line 309
    invoke-direct {v4, v8, v11, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 310
    .line 311
    .line 312
    const/16 v6, 0x30

    .line 313
    .line 314
    invoke-static {v4, v3, v2, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    move-object v4, v9

    .line 319
    iget-wide v8, v2, La/fet;->T:J

    .line 320
    .line 321
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    invoke-static {v2, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 334
    .line 335
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2}, La/fet;->i0()V

    .line 339
    .line 340
    .line 341
    iget-boolean v10, v2, La/fet;->S:Z

    .line 342
    .line 343
    if-eqz v10, :cond_5

    .line 344
    .line 345
    invoke-virtual {v2, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_5
    invoke-virtual {v2}, La/fet;->r0()V

    .line 350
    .line 351
    .line 352
    :goto_4
    invoke-static {v2, v3, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v2, v8, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v6, v2, v12, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v2, v9, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 362
    .line 363
    .line 364
    new-instance v3, La/qw3;

    .line 365
    .line 366
    new-instance v6, La/jf4;

    .line 367
    .line 368
    const/16 v8, 0xe

    .line 369
    .line 370
    invoke-direct {v6, v8}, La/jf4;-><init>(B)V

    .line 371
    .line 372
    .line 373
    const/4 v11, 0x1

    .line 374
    invoke-direct {v3, v0, v11, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 375
    .line 376
    .line 377
    const/16 v6, 0x30

    .line 378
    .line 379
    invoke-static {v3, v15, v2, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-wide v8, v2, La/fet;->T:J

    .line 384
    .line 385
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    invoke-static {v2, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    invoke-virtual {v2}, La/fet;->i0()V

    .line 398
    .line 399
    .line 400
    iget-boolean v9, v2, La/fet;->S:Z

    .line 401
    .line 402
    if-eqz v9, :cond_6

    .line 403
    .line 404
    invoke-virtual {v2, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_6
    invoke-virtual {v2}, La/fet;->r0()V

    .line 409
    .line 410
    .line 411
    :goto_5
    invoke-static {v2, v0, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v2, v6, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 415
    .line 416
    .line 417
    invoke-static {v3, v2, v12, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v2, v8, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v8, v19

    .line 424
    .line 425
    check-cast v8, La/rcp0;

    .line 426
    .line 427
    iget-object v15, v8, La/rcp0;->a:La/g5a0;

    .line 428
    .line 429
    iget-object v0, v8, La/rcp0;->b:La/g5a0;

    .line 430
    .line 431
    const/16 v20, 0x0

    .line 432
    .line 433
    const/16 v21, 0x1

    .line 434
    .line 435
    move-object/from16 v16, v0

    .line 436
    .line 437
    move-object/from16 v19, v2

    .line 438
    .line 439
    invoke-static/range {v15 .. v21}, La/cn80;->a(La/g5a0;La/g5a0;La/w6n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 440
    .line 441
    .line 442
    const/4 v11, 0x1

    .line 443
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x3f800000    # 1.0f

    .line 447
    .line 448
    invoke-static {v7, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    if-eqz v4, :cond_7

    .line 453
    .line 454
    iget v1, v4, La/ycl;->a:F

    .line 455
    .line 456
    invoke-static {v7, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    const/4 v4, 0x0

    .line 461
    goto :goto_6

    .line 462
    :cond_7
    const/4 v1, 0x0

    .line 463
    const/4 v3, 0x3

    .line 464
    const/4 v4, 0x0

    .line 465
    invoke-static {v7, v1, v4, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    :goto_6
    invoke-interface {v0, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    iget-object v1, v8, La/rcp0;->c:Ljava/lang/String;

    .line 474
    .line 475
    invoke-static {v4, v2, v0, v1}, La/egp0;->a(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v11}, La/fet;->r(Z)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v4}, La/fet;->r(Z)V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_8
    move-object v2, v6

    .line 486
    invoke-virtual {v2}, La/fet;->X()V

    .line 487
    .line 488
    .line 489
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_0
    move-object v1, v10

    .line 493
    check-cast v1, La/mm40;

    .line 494
    .line 495
    move-object v2, v9

    .line 496
    check-cast v2, La/e3y;

    .line 497
    .line 498
    move-object v3, v8

    .line 499
    check-cast v3, La/vj50;

    .line 500
    .line 501
    move-object v5, v7

    .line 502
    check-cast v5, La/xcz;

    .line 503
    .line 504
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 505
    .line 506
    move-object/from16 v7, p1

    .line 507
    .line 508
    check-cast v7, La/fet;

    .line 509
    .line 510
    move-object/from16 v4, p2

    .line 511
    .line 512
    check-cast v4, Ljava/lang/Integer;

    .line 513
    .line 514
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    const/4 v4, 0x7

    .line 518
    invoke-static {v4}, La/x8x;->L(I)I

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    iget v4, v0, La/gc3;->b:F

    .line 523
    .line 524
    invoke-static/range {v1 .. v8}, La/hmw0;->N(La/mm40;La/e3y;La/vj50;FLa/xcz;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 525
    .line 526
    .line 527
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_1
    move-object v1, v10

    .line 531
    check-cast v1, La/mm40;

    .line 532
    .line 533
    move-object v11, v9

    .line 534
    check-cast v11, La/l7m0;

    .line 535
    .line 536
    move-object v12, v8

    .line 537
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 538
    .line 539
    move-object v13, v7

    .line 540
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 541
    .line 542
    move-object v14, v6

    .line 543
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 544
    .line 545
    move-object/from16 v3, p1

    .line 546
    .line 547
    check-cast v3, La/fet;

    .line 548
    .line 549
    move-object/from16 v4, p2

    .line 550
    .line 551
    check-cast v4, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    and-int/lit8 v5, v4, 0x3

    .line 558
    .line 559
    if-eq v5, v2, :cond_9

    .line 560
    .line 561
    const/4 v2, 0x1

    .line 562
    :goto_8
    const/16 v22, 0x1

    .line 563
    .line 564
    goto :goto_9

    .line 565
    :cond_9
    const/4 v2, 0x0

    .line 566
    goto :goto_8

    .line 567
    :goto_9
    and-int/lit8 v4, v4, 0x1

    .line 568
    .line 569
    invoke-virtual {v3, v4, v2}, La/fet;->U(IZ)Z

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    if-eqz v2, :cond_c

    .line 574
    .line 575
    const/4 v2, 0x3

    .line 576
    const/4 v4, 0x0

    .line 577
    invoke-static {v4, v4, v3, v4, v2}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    sget-object v4, La/qmk;->a:La/zcl;

    .line 582
    .line 583
    const/high16 v4, 0x41c00000    # 24.0f

    .line 584
    .line 585
    const/4 v5, 0x5

    .line 586
    const/4 v6, 0x0

    .line 587
    const/high16 v7, 0x41000000    # 8.0f

    .line 588
    .line 589
    invoke-static {v6, v7, v6, v4, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    move-object v5, v4

    .line 594
    new-instance v4, La/qw3;

    .line 595
    .line 596
    new-instance v6, La/jf4;

    .line 597
    .line 598
    const/16 v8, 0xe

    .line 599
    .line 600
    invoke-direct {v6, v8}, La/jf4;-><init>(B)V

    .line 601
    .line 602
    .line 603
    const/4 v8, 0x1

    .line 604
    invoke-direct {v4, v7, v8, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v3, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v6

    .line 611
    iget v15, v0, La/gc3;->b:F

    .line 612
    .line 613
    invoke-virtual {v3, v15}, La/fet;->d(F)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    or-int/2addr v0, v6

    .line 618
    invoke-virtual {v3, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result v6

    .line 622
    or-int/2addr v0, v6

    .line 623
    invoke-virtual {v3, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    or-int/2addr v0, v6

    .line 628
    invoke-virtual {v3, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v6

    .line 632
    or-int/2addr v0, v6

    .line 633
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    if-nez v0, :cond_a

    .line 638
    .line 639
    sget-object v0, La/ukd;->a:La/cl5;

    .line 640
    .line 641
    if-ne v6, v0, :cond_b

    .line 642
    .line 643
    :cond_a
    new-instance v10, La/m9x;

    .line 644
    .line 645
    invoke-direct/range {v10 .. v15}, La/m9x;-><init>(La/l7m0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;F)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v3, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    move-object v6, v10

    .line 652
    :cond_b
    move-object v9, v6

    .line 653
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 654
    .line 655
    const/4 v11, 0x0

    .line 656
    const/16 v12, 0x1e8

    .line 657
    .line 658
    move-object v10, v3

    .line 659
    move-object v3, v5

    .line 660
    const/4 v5, 0x0

    .line 661
    const/4 v6, 0x0

    .line 662
    const/4 v7, 0x0

    .line 663
    const/4 v8, 0x0

    .line 664
    invoke-static/range {v1 .. v12}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 665
    .line 666
    .line 667
    goto :goto_a

    .line 668
    :cond_c
    move-object v10, v3

    .line 669
    invoke-virtual {v10}, La/fet;->X()V

    .line 670
    .line 671
    .line 672
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 673
    .line 674
    return-object v0

    .line 675
    :pswitch_2
    move-object v1, v10

    .line 676
    check-cast v1, La/do20;

    .line 677
    .line 678
    move-object v2, v9

    .line 679
    check-cast v2, Ljava/lang/String;

    .line 680
    .line 681
    move-object v3, v8

    .line 682
    check-cast v3, La/qt20;

    .line 683
    .line 684
    move-object v5, v7

    .line 685
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 686
    .line 687
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 688
    .line 689
    move-object/from16 v7, p1

    .line 690
    .line 691
    check-cast v7, La/fet;

    .line 692
    .line 693
    move-object/from16 v4, p2

    .line 694
    .line 695
    check-cast v4, Ljava/lang/Integer;

    .line 696
    .line 697
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    const/16 v4, 0x41

    .line 701
    .line 702
    invoke-static {v4}, La/x8x;->L(I)I

    .line 703
    .line 704
    .line 705
    move-result v8

    .line 706
    iget v4, v0, La/gc3;->b:F

    .line 707
    .line 708
    invoke-virtual/range {v1 .. v8}, La/do20;->a(Ljava/lang/String;La/qt20;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 709
    .line 710
    .line 711
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    return-object v0

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
