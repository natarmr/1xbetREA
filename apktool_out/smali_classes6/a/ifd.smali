.class public final synthetic La/ifd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/ocl;

.field public final synthetic d:La/vjp;

.field public final synthetic e:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/ocl;La/vjp;La/r9u;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/ifd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ifd;->b:La/ctf0;

    iput-object p2, p0, La/ifd;->c:La/ocl;

    iput-object p3, p0, La/ifd;->d:La/vjp;

    iput-object p4, p0, La/ifd;->e:La/r9u;

    return-void
.end method

.method public synthetic constructor <init>(La/vjp;La/r9u;La/ctf0;La/ocl;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/ifd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ifd;->d:La/vjp;

    iput-object p2, p0, La/ifd;->e:La/r9u;

    iput-object p3, p0, La/ifd;->b:La/ctf0;

    iput-object p4, p0, La/ifd;->c:La/ocl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ifd;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    iget-object v5, v0, La/ifd;->e:La/r9u;

    .line 10
    .line 11
    iget-object v6, v0, La/ifd;->d:La/vjp;

    .line 12
    .line 13
    iget-object v12, v0, La/ifd;->b:La/ctf0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/rgp;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v12}, La/ctf0;->h()Z

    .line 26
    .line 27
    .line 28
    move-result v28

    .line 29
    invoke-virtual {v6}, La/vjp;->e()La/v5l0;

    .line 30
    .line 31
    .line 32
    move-result-object v11

    .line 33
    sget-object v6, La/ygp;->t:La/ygp;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v5, v5, La/r9u;->a:La/j1q0;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v5, v5, La/j1q0;->a:La/m1q0;

    .line 44
    .line 45
    invoke-virtual {v5, v6}, La/m1q0;->d(La/ygp;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    iget-boolean v6, v1, La/rgp;->c:Z

    .line 50
    .line 51
    iget-object v12, v0, La/ifd;->c:La/ocl;

    .line 52
    .line 53
    if-eqz v6, :cond_0

    .line 54
    .line 55
    sget-object v13, La/pb10;->g:La/pb10;

    .line 56
    .line 57
    const-wide/16 v21, 0x0

    .line 58
    .line 59
    const/16 v23, 0x3de

    .line 60
    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const v17, 0x7f130674

    .line 66
    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const-wide/16 v19, 0x0

    .line 71
    .line 72
    invoke-static/range {v12 .. v23}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget-boolean v0, v1, La/rgp;->b:Z

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    sget-object v13, La/pb10;->g:La/pb10;

    .line 82
    .line 83
    const-wide/16 v21, 0x0

    .line 84
    .line 85
    const/16 v23, 0x25e

    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const v17, 0x7f130677

    .line 92
    .line 93
    .line 94
    const v18, 0x7f131690

    .line 95
    .line 96
    .line 97
    const-wide/16 v19, 0x2710

    .line 98
    .line 99
    invoke-static/range {v12 .. v23}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_0

    .line 104
    :cond_1
    const/4 v0, 0x0

    .line 105
    :goto_0
    iget-boolean v6, v1, La/rgp;->a:Z

    .line 106
    .line 107
    if-eqz v6, :cond_2

    .line 108
    .line 109
    sget-object v1, La/tgp;->a:La/tgp;

    .line 110
    .line 111
    filled-new-array {v1, v1, v1, v1}, [La/tgp;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_2
    iget-object v6, v1, La/rgp;->d:Ljava/util/List;

    .line 122
    .line 123
    new-instance v7, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {v6, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, La/uft0;

    .line 147
    .line 148
    iget-wide v8, v1, La/rgp;->e:J

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v10, v6, La/uft0;->d:La/ufp0;

    .line 154
    .line 155
    iget-object v12, v10, La/ufp0;->e:Ljava/util/List;

    .line 156
    .line 157
    iget-object v13, v6, La/uft0;->e:La/ufp0;

    .line 158
    .line 159
    iget-object v14, v13, La/ufp0;->e:Ljava/util/List;

    .line 160
    .line 161
    filled-new-array {v10, v13}, [La/ufp0;

    .line 162
    .line 163
    .line 164
    move-result-object v15

    .line 165
    invoke-static {v15}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    invoke-static {v8, v9, v15}, La/wvb;->V(JLjava/util/List;)La/cys0;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    check-cast v8, La/y3n0;

    .line 178
    .line 179
    if-eqz v8, :cond_3

    .line 180
    .line 181
    iget-object v8, v8, La/y3n0;->b:Ljava/lang/String;

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    const/4 v8, 0x0

    .line 185
    :goto_2
    if-nez v8, :cond_4

    .line 186
    .line 187
    move-object v8, v2

    .line 188
    :cond_4
    invoke-static {v8}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v18

    .line 192
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    check-cast v8, La/y3n0;

    .line 197
    .line 198
    if-eqz v8, :cond_5

    .line 199
    .line 200
    iget-object v8, v8, La/y3n0;->b:Ljava/lang/String;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_5
    const/4 v8, 0x0

    .line 204
    :goto_3
    if-nez v8, :cond_6

    .line 205
    .line 206
    move-object v8, v2

    .line 207
    :cond_6
    invoke-static {v8}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v19

    .line 211
    iget-object v8, v10, La/ufp0;->d:Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v8, v12, v9}, La/a8k0;->w(Ljava/lang/String;Ljava/util/List;La/cys0;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    iget-object v8, v13, La/ufp0;->d:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v8, v14, v9}, La/a8k0;->w(Ljava/lang/String;Ljava/util/List;La/cys0;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v17

    .line 223
    new-instance v8, La/kbo;

    .line 224
    .line 225
    iget-object v14, v10, La/ufp0;->b:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v10, v13, La/ufp0;->b:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v12, v6, La/uft0;->f:La/znq0;

    .line 230
    .line 231
    invoke-interface {v12}, La/aoq0;->b()J

    .line 232
    .line 233
    .line 234
    move-result-wide v25

    .line 235
    const/16 v27, 0x0

    .line 236
    .line 237
    sget-object v29, La/iun;->a:La/iun;

    .line 238
    .line 239
    const-string v20, ""

    .line 240
    .line 241
    const-string v21, ""

    .line 242
    .line 243
    const/16 v22, 0x1

    .line 244
    .line 245
    const-string v23, ""

    .line 246
    .line 247
    const-string v24, ""

    .line 248
    .line 249
    move-object v13, v8

    .line 250
    move-object/from16 v16, v10

    .line 251
    .line 252
    invoke-direct/range {v13 .. v29}, La/kbo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JIZLjava/util/List;)V

    .line 253
    .line 254
    .line 255
    move-object v12, v7

    .line 256
    move-object v10, v13

    .line 257
    iget-wide v7, v6, La/uft0;->b:J

    .line 258
    .line 259
    move-object v13, v12

    .line 260
    sget-object v12, La/oim0;->a:La/oim0;

    .line 261
    .line 262
    invoke-static/range {v7 .. v12}, La/ntb;->c0(JLa/cys0;La/kbo;La/v5l0;La/pim0;)La/mim0;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    new-instance v8, La/sgp;

    .line 267
    .line 268
    invoke-direct {v8, v7, v6}, La/sgp;-><init>(La/mim0;La/uft0;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-object v7, v13

    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :cond_7
    move-object v13, v7

    .line 278
    invoke-static {v13}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    :goto_4
    new-instance v2, La/vgp;

    .line 283
    .line 284
    invoke-direct {v2, v0, v1, v5}, La/vgp;-><init>(La/mdm;La/a4x;Z)V

    .line 285
    .line 286
    .line 287
    return-object v2

    .line 288
    :pswitch_0
    move-object/from16 v1, p1

    .line 289
    .line 290
    check-cast v1, La/sed;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6}, La/vjp;->e()La/v5l0;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    sget-object v6, La/ygp;->t:La/ygp;

    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object v5, v5, La/r9u;->a:La/j1q0;

    .line 305
    .line 306
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    iget-object v5, v5, La/j1q0;->a:La/m1q0;

    .line 310
    .line 311
    invoke-virtual {v5, v6}, La/m1q0;->d(La/ygp;)Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    const/4 v6, 0x0

    .line 319
    new-array v7, v6, [Ljava/lang/Object;

    .line 320
    .line 321
    iget-object v8, v12, La/ctf0;->b:La/lsm0;

    .line 322
    .line 323
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    const v7, 0x7f1304cb

    .line 328
    .line 329
    .line 330
    invoke-virtual {v8, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    iget-boolean v7, v1, La/sed;->b:Z

    .line 335
    .line 336
    iget-boolean v8, v1, La/sed;->a:Z

    .line 337
    .line 338
    iget-object v1, v1, La/sed;->c:Ljava/util/List;

    .line 339
    .line 340
    iget-object v13, v0, La/ifd;->c:La/ocl;

    .line 341
    .line 342
    if-eqz v7, :cond_8

    .line 343
    .line 344
    sget-object v14, La/pb10;->g:La/pb10;

    .line 345
    .line 346
    const-wide/16 v22, 0x0

    .line 347
    .line 348
    const/16 v24, 0x25e

    .line 349
    .line 350
    const/4 v15, 0x0

    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    const v18, 0x7f130677

    .line 356
    .line 357
    .line 358
    const v19, 0x7f131690

    .line 359
    .line 360
    .line 361
    const-wide/16 v20, 0x2710

    .line 362
    .line 363
    invoke-static/range {v13 .. v24}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    goto :goto_5

    .line 368
    :cond_8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_9

    .line 373
    .line 374
    if-nez v8, :cond_9

    .line 375
    .line 376
    sget-object v14, La/pb10;->g:La/pb10;

    .line 377
    .line 378
    const-wide/16 v22, 0x0

    .line 379
    .line 380
    const/16 v24, 0x3de

    .line 381
    .line 382
    const/4 v15, 0x0

    .line 383
    const/16 v16, 0x0

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const v18, 0x7f130674

    .line 388
    .line 389
    .line 390
    const/16 v19, 0x0

    .line 391
    .line 392
    const-wide/16 v20, 0x0

    .line 393
    .line 394
    invoke-static/range {v13 .. v24}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    goto :goto_5

    .line 399
    :cond_9
    const/4 v0, 0x0

    .line 400
    :goto_5
    if-eqz v8, :cond_a

    .line 401
    .line 402
    sget-object v1, La/zdd;->a:La/zdd;

    .line 403
    .line 404
    filled-new-array {v1, v1, v1, v1}, [La/zdd;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_a
    new-instance v14, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    if-eqz v3, :cond_f

    .line 432
    .line 433
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    check-cast v3, La/rvf;

    .line 438
    .line 439
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    iget-object v9, v3, La/rvf;->l:La/cys0;

    .line 443
    .line 444
    iget-object v7, v3, La/rvf;->m:Ljava/util/List;

    .line 445
    .line 446
    iget-object v8, v3, La/rvf;->n:Ljava/util/List;

    .line 447
    .line 448
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    check-cast v10, La/y3n0;

    .line 453
    .line 454
    if-eqz v10, :cond_b

    .line 455
    .line 456
    iget-object v10, v10, La/y3n0;->b:Ljava/lang/String;

    .line 457
    .line 458
    goto :goto_7

    .line 459
    :cond_b
    const/4 v10, 0x0

    .line 460
    :goto_7
    if-nez v10, :cond_c

    .line 461
    .line 462
    move-object v10, v2

    .line 463
    :cond_c
    invoke-static {v10}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v20

    .line 467
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    check-cast v10, La/y3n0;

    .line 472
    .line 473
    if-eqz v10, :cond_d

    .line 474
    .line 475
    iget-object v10, v10, La/y3n0;->b:Ljava/lang/String;

    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_d
    const/4 v10, 0x0

    .line 479
    :goto_8
    if-nez v10, :cond_e

    .line 480
    .line 481
    move-object v10, v2

    .line 482
    :cond_e
    invoke-static {v10}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v21

    .line 486
    iget-object v10, v3, La/rvf;->f:Ljava/lang/String;

    .line 487
    .line 488
    invoke-static {v10, v7, v9}, La/a8k0;->w(Ljava/lang/String;Ljava/util/List;La/cys0;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v17

    .line 492
    iget-object v7, v3, La/rvf;->g:Ljava/lang/String;

    .line 493
    .line 494
    invoke-static {v7, v8, v9}, La/a8k0;->w(Ljava/lang/String;Ljava/util/List;La/cys0;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v19

    .line 498
    new-instance v15, La/kbo;

    .line 499
    .line 500
    iget-object v7, v3, La/rvf;->d:Ljava/lang/String;

    .line 501
    .line 502
    iget-object v8, v3, La/rvf;->e:Ljava/lang/String;

    .line 503
    .line 504
    iget-object v10, v3, La/rvf;->h:Ljava/lang/String;

    .line 505
    .line 506
    iget-object v13, v3, La/rvf;->i:Ljava/lang/String;

    .line 507
    .line 508
    iget v4, v3, La/rvf;->j:I

    .line 509
    .line 510
    move-object/from16 p0, v1

    .line 511
    .line 512
    move-object/from16 v32, v2

    .line 513
    .line 514
    int-to-long v1, v4

    .line 515
    iget v4, v3, La/rvf;->k:I

    .line 516
    .line 517
    invoke-virtual {v12}, La/ctf0;->h()Z

    .line 518
    .line 519
    .line 520
    move-result v30

    .line 521
    move-wide/from16 v27, v1

    .line 522
    .line 523
    new-instance v1, Lkotlin/Pair;

    .line 524
    .line 525
    iget-object v2, v3, La/rvf;->h:Ljava/lang/String;

    .line 526
    .line 527
    move/from16 v29, v4

    .line 528
    .line 529
    iget-object v4, v3, La/rvf;->i:Ljava/lang/String;

    .line 530
    .line 531
    invoke-direct {v1, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v31

    .line 538
    const/16 v24, 0x0

    .line 539
    .line 540
    const-string v25, ""

    .line 541
    .line 542
    const-string v26, ""

    .line 543
    .line 544
    move-object/from16 v16, v7

    .line 545
    .line 546
    move-object/from16 v18, v8

    .line 547
    .line 548
    move-object/from16 v22, v10

    .line 549
    .line 550
    move-object/from16 v23, v13

    .line 551
    .line 552
    invoke-direct/range {v15 .. v31}, La/kbo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JIZLjava/util/List;)V

    .line 553
    .line 554
    .line 555
    iget-wide v7, v3, La/rvf;->b:J

    .line 556
    .line 557
    sget-object v13, La/oim0;->a:La/oim0;

    .line 558
    .line 559
    move-object v10, v15

    .line 560
    invoke-static/range {v7 .. v13}, La/wwb;->S(JLa/cys0;La/kbo;La/v5l0;La/ctf0;La/pim0;)La/mim0;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    new-instance v2, La/ydd;

    .line 565
    .line 566
    invoke-direct {v2, v1, v3}, La/ydd;-><init>(La/mim0;La/rvf;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-object/from16 v1, p0

    .line 573
    .line 574
    move-object/from16 v2, v32

    .line 575
    .line 576
    goto/16 :goto_6

    .line 577
    .line 578
    :cond_f
    invoke-static {v14}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    :goto_9
    new-instance v2, La/hfd;

    .line 583
    .line 584
    invoke-direct {v2, v0, v1, v6, v5}, La/hfd;-><init>(La/mdm;La/a4x;Ljava/lang/String;Z)V

    .line 585
    .line 586
    .line 587
    return-object v2

    .line 588
    nop

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
