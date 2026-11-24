.class public final La/e9o;
.super La/guy;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/lwf;

.field public final synthetic d:La/nie0;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/lwf;La/nie0;Ljava/lang/Object;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/e9o;->a:B

    iput-object p1, p0, La/e9o;->b:La/pz40;

    iput-object p2, p0, La/e9o;->c:La/lwf;

    iput-object p3, p0, La/e9o;->d:La/nie0;

    iput-object p4, p0, La/e9o;->h:Ljava/lang/Object;

    iput-object p5, p0, La/e9o;->e:La/l7m0;

    iput-object p6, p0, La/e9o;->f:La/l7m0;

    iput-object p7, p0, La/e9o;->g:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e9o;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sget-object v5, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    sget-object v6, La/cmd;->b:La/cmd;

    .line 14
    .line 15
    sget-object v7, La/cmd;->a:La/cmd;

    .line 16
    .line 17
    iget-object v8, v0, La/e9o;->d:La/nie0;

    .line 18
    .line 19
    iget-object v9, v0, La/e9o;->c:La/lwf;

    .line 20
    .line 21
    iget-object v10, v0, La/e9o;->b:La/pz40;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    iget-object v13, v0, La/e9o;->h:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/nt40;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, La/fet;

    .line 37
    .line 38
    move-object/from16 v14, p3

    .line 39
    .line 40
    check-cast v14, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-object v14, v13

    .line 46
    check-cast v14, La/wpu0;

    .line 47
    .line 48
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    invoke-interface {v10, v13}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v9, v8, La/nie0;->a:Ljava/lang/Object;

    .line 57
    .line 58
    if-ne v9, v7, :cond_0

    .line 59
    .line 60
    iput-object v6, v8, La/nie0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_0
    const v6, 0x53564b64

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v6}, La/fet;->e0(I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, La/kt40;->a:La/kt40;

    .line 73
    .line 74
    invoke-static {v4, v5}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    sget-object v5, La/gqw0;->b:La/zx7;

    .line 79
    .line 80
    invoke-static {v5, v11}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    iget-wide v6, v1, La/fet;->T:J

    .line 85
    .line 86
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, La/fet;->i0()V

    .line 104
    .line 105
    .line 106
    iget-boolean v8, v1, La/fet;->S:Z

    .line 107
    .line 108
    if-eqz v8, :cond_1

    .line 109
    .line 110
    invoke-virtual {v1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 115
    .line 116
    .line 117
    :goto_0
    sget-object v3, La/gqw0;->x:La/shd;

    .line 118
    .line 119
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    sget-object v3, La/gqw0;->w:La/shd;

    .line 123
    .line 124
    invoke-static {v1, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v5, La/gqw0;->y:La/shd;

    .line 132
    .line 133
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 137
    .line 138
    .line 139
    sget-object v3, La/gqw0;->v:La/shd;

    .line 140
    .line 141
    invoke-static {v1, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    iget-object v3, v14, La/wpu0;->a:Ljava/lang/String;

    .line 145
    .line 146
    iget v4, v14, La/wpu0;->b:I

    .line 147
    .line 148
    invoke-static {v4, v11, v1, v3}, La/q8a;->r(IILa/fet;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 152
    .line 153
    iget-object v15, v0, La/e9o;->e:La/l7m0;

    .line 154
    .line 155
    invoke-virtual {v1, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-nez v4, :cond_2

    .line 164
    .line 165
    if-ne v5, v2, :cond_3

    .line 166
    .line 167
    :cond_2
    new-instance v5, La/eb3;

    .line 168
    .line 169
    const/16 v2, 0xd

    .line 170
    .line 171
    invoke-direct {v5, v15, v2}, La/eb3;-><init>(La/l7m0;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 178
    .line 179
    invoke-static {v3, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 184
    .line 185
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 190
    .line 191
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 192
    .line 193
    .line 194
    move-result-wide v3

    .line 195
    sget-object v5, La/jd8;->n:La/ljc;

    .line 196
    .line 197
    invoke-static {v2, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-static {v11, v1, v2}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 202
    .line 203
    .line 204
    iget-object v2, v0, La/e9o;->g:Lkotlin/jvm/functions/Function0;

    .line 205
    .line 206
    const/16 v19, 0x180

    .line 207
    .line 208
    iget-object v0, v0, La/e9o;->f:La/l7m0;

    .line 209
    .line 210
    move-object/from16 v16, v0

    .line 211
    .line 212
    move-object/from16 v18, v1

    .line 213
    .line 214
    move-object/from16 v17, v2

    .line 215
    .line 216
    invoke-static/range {v14 .. v19}, La/q8a;->y(La/wpu0;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v0, v18

    .line 220
    .line 221
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v14, La/wpu0;->c:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v1, v0, v11}, La/q8a;->H(Ljava/lang/String;La/fet;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    return-object v13

    .line 233
    :pswitch_0
    move-object/from16 v1, p1

    .line 234
    .line 235
    check-cast v1, La/nt40;

    .line 236
    .line 237
    move-object/from16 v1, p2

    .line 238
    .line 239
    check-cast v1, La/fet;

    .line 240
    .line 241
    move-object/from16 v14, p3

    .line 242
    .line 243
    check-cast v14, Ljava/lang/Number;

    .line 244
    .line 245
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 246
    .line 247
    .line 248
    check-cast v13, La/f9o;

    .line 249
    .line 250
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    invoke-interface {v10, v14}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object v9, v8, La/nie0;->a:Ljava/lang/Object;

    .line 259
    .line 260
    if-ne v9, v7, :cond_4

    .line 261
    .line 262
    iput-object v6, v8, La/nie0;->a:Ljava/lang/Object;

    .line 263
    .line 264
    :cond_4
    const v6, -0x1e2683fd

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1, v6}, La/fet;->e0(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    sget-object v5, La/mt40;->a:La/mt40;

    .line 275
    .line 276
    invoke-static {v4, v5}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    sget-object v5, La/gqw0;->b:La/zx7;

    .line 281
    .line 282
    invoke-static {v5, v11}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    iget-wide v6, v1, La/fet;->T:J

    .line 287
    .line 288
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 301
    .line 302
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, La/fet;->i0()V

    .line 306
    .line 307
    .line 308
    iget-boolean v8, v1, La/fet;->S:Z

    .line 309
    .line 310
    if-eqz v8, :cond_5

    .line 311
    .line 312
    invoke-virtual {v1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 313
    .line 314
    .line 315
    goto :goto_1

    .line 316
    :cond_5
    invoke-virtual {v1}, La/fet;->r0()V

    .line 317
    .line 318
    .line 319
    :goto_1
    sget-object v3, La/gqw0;->x:La/shd;

    .line 320
    .line 321
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    sget-object v3, La/gqw0;->w:La/shd;

    .line 325
    .line 326
    invoke-static {v1, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    sget-object v5, La/gqw0;->y:La/shd;

    .line 334
    .line 335
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 339
    .line 340
    .line 341
    sget-object v3, La/gqw0;->v:La/shd;

    .line 342
    .line 343
    invoke-static {v1, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    iget-object v3, v13, La/f9o;->b:Ljava/lang/String;

    .line 347
    .line 348
    iget v4, v13, La/f9o;->c:I

    .line 349
    .line 350
    invoke-static {v4, v11, v1, v3}, La/b34;->j(IILa/fet;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 354
    .line 355
    iget-object v15, v0, La/e9o;->e:La/l7m0;

    .line 356
    .line 357
    invoke-virtual {v1, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    if-nez v4, :cond_6

    .line 366
    .line 367
    if-ne v5, v2, :cond_7

    .line 368
    .line 369
    :cond_6
    new-instance v5, La/eb3;

    .line 370
    .line 371
    const/4 v2, 0x2

    .line 372
    invoke-direct {v5, v15, v2}, La/eb3;-><init>(La/l7m0;B)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 379
    .line 380
    invoke-static {v3, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 385
    .line 386
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 391
    .line 392
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 393
    .line 394
    .line 395
    move-result-wide v3

    .line 396
    sget-object v5, La/jd8;->n:La/ljc;

    .line 397
    .line 398
    invoke-static {v2, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-static {v11, v1, v2}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 403
    .line 404
    .line 405
    move-object v2, v14

    .line 406
    iget-object v14, v13, La/f9o;->a:Ljava/lang/String;

    .line 407
    .line 408
    iget-object v3, v0, La/e9o;->g:Lkotlin/jvm/functions/Function0;

    .line 409
    .line 410
    const/16 v19, 0x0

    .line 411
    .line 412
    iget-object v0, v0, La/e9o;->f:La/l7m0;

    .line 413
    .line 414
    move-object/from16 v16, v0

    .line 415
    .line 416
    move-object/from16 v18, v1

    .line 417
    .line 418
    move-object/from16 v17, v3

    .line 419
    .line 420
    invoke-static/range {v14 .. v19}, La/b34;->E(Ljava/lang/String;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v0, v18

    .line 424
    .line 425
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 426
    .line 427
    .line 428
    iget-object v1, v13, La/f9o;->a:Ljava/lang/String;

    .line 429
    .line 430
    invoke-static {v1, v0, v11}, La/b34;->Q(Ljava/lang/String;La/fet;I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 434
    .line 435
    .line 436
    return-object v2

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
