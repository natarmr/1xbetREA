.class public final synthetic La/g8l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g8l;->a:B

    iput-object p1, p0, La/g8l;->d:Ljava/lang/Object;

    iput-object p2, p0, La/g8l;->b:Ljava/lang/Object;

    iput-object p3, p0, La/g8l;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g8l;->a:B

    .line 4
    .line 5
    const v2, 0x7f130880

    .line 6
    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/s460;

    .line 23
    .line 24
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/hie0;

    .line 27
    .line 28
    sget-object v3, La/jge0;->e:La/jge0;

    .line 29
    .line 30
    sget-object v4, La/s460;->y1:La/uag0;

    .line 31
    .line 32
    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object v1, v2, La/s460;->k1:La/yjj0;

    .line 36
    .line 37
    iget-object v8, v4, La/uag0;->o:La/yjj0;

    .line 38
    .line 39
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    iget-boolean v8, v2, La/s460;->n1:Z

    .line 44
    .line 45
    iget-boolean v9, v4, La/uag0;->p:Z

    .line 46
    .line 47
    if-eq v8, v9, :cond_0

    .line 48
    .line 49
    move v7, v5

    .line 50
    :cond_0
    iget-object v8, v4, La/uag0;->o:La/yjj0;

    .line 51
    .line 52
    iget-wide v9, v4, La/uag0;->r:J

    .line 53
    .line 54
    iget-object v11, v4, La/uag0;->u:La/k6z;

    .line 55
    .line 56
    iget-object v12, v4, La/uag0;->t:La/w6k;

    .line 57
    .line 58
    invoke-interface {v8, v9, v10, v11, v12}, La/yjj0;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iput-object v8, v4, La/uag0;->y:La/x1x;

    .line 63
    .line 64
    iget-object v9, v2, La/s460;->m1:La/jge0;

    .line 65
    .line 66
    if-eqz v8, :cond_1

    .line 67
    .line 68
    invoke-virtual {v8}, La/x1x;->C()La/jge0;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    :cond_1
    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    xor-int/lit8 v8, v6, 0x1

    .line 77
    .line 78
    iput-boolean v8, v0, La/hie0;->a:Z

    .line 79
    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    if-nez v7, :cond_2

    .line 83
    .line 84
    if-nez v6, :cond_7

    .line 85
    .line 86
    :cond_2
    iget-object v0, v4, La/uag0;->o:La/yjj0;

    .line 87
    .line 88
    iput-object v0, v2, La/s460;->k1:La/yjj0;

    .line 89
    .line 90
    iget-boolean v0, v4, La/uag0;->p:Z

    .line 91
    .line 92
    iput-boolean v0, v2, La/s460;->n1:Z

    .line 93
    .line 94
    iget-object v0, v4, La/uag0;->y:La/x1x;

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0}, La/x1x;->C()La/jge0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    :cond_3
    move-object v0, v3

    .line 105
    :cond_4
    iput-object v0, v2, La/s460;->m1:La/jge0;

    .line 106
    .line 107
    iget-object v0, v4, La/uag0;->y:La/x1x;

    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0}, La/x1x;->C()La/jge0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    invoke-static {v0}, La/m2x;->C(La/jge0;)La/mkx;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    new-instance v3, La/jge0;

    .line 122
    .line 123
    iget v4, v0, La/mkx;->a:I

    .line 124
    .line 125
    int-to-float v4, v4

    .line 126
    iget v6, v0, La/mkx;->b:I

    .line 127
    .line 128
    int-to-float v6, v6

    .line 129
    iget v8, v0, La/mkx;->c:I

    .line 130
    .line 131
    int-to-float v8, v8

    .line 132
    iget v0, v0, La/mkx;->d:I

    .line 133
    .line 134
    int-to-float v0, v0

    .line 135
    invoke-direct {v3, v4, v6, v8, v0}, La/jge0;-><init>(FFFF)V

    .line 136
    .line 137
    .line 138
    :cond_5
    iput-object v3, v2, La/s460;->l1:La/jge0;

    .line 139
    .line 140
    iget-boolean v0, v2, La/s460;->o1:Z

    .line 141
    .line 142
    if-eqz v0, :cond_7

    .line 143
    .line 144
    if-nez v7, :cond_6

    .line 145
    .line 146
    iget-boolean v0, v2, La/s460;->n1:Z

    .line 147
    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    if-nez v1, :cond_7

    .line 151
    .line 152
    :cond_6
    iget-object v0, v2, La/s460;->u:La/e7z;

    .line 153
    .line 154
    invoke-virtual {v0}, La/e7z;->G()V

    .line 155
    .line 156
    .line 157
    :cond_7
    iput-boolean v5, v2, La/s460;->o1:Z

    .line 158
    .line 159
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_0
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, La/ctf0;

    .line 165
    .line 166
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 167
    .line 168
    move-object v8, v2

    .line 169
    check-cast v8, La/g2v;

    .line 170
    .line 171
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, La/qho;

    .line 174
    .line 175
    new-instance v2, La/q060;

    .line 176
    .line 177
    const-string v3, "NoTabsDashboardFiltersViewModel"

    .line 178
    .line 179
    new-array v4, v7, [Ljava/lang/Object;

    .line 180
    .line 181
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 182
    .line 183
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const v5, 0x7f13086e

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    new-instance v9, La/j060;

    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    const/16 v16, 0x0

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    const/4 v11, 0x0

    .line 201
    const/4 v12, 0x0

    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x0

    .line 204
    invoke-direct/range {v9 .. v16}, La/j060;-><init>(IIIIIII)V

    .line 205
    .line 206
    .line 207
    move-object v4, v9

    .line 208
    sget-object v5, La/iun;->a:La/iun;

    .line 209
    .line 210
    sget-object v9, La/pb10;->g:La/pb10;

    .line 211
    .line 212
    const-wide/16 v19, 0x0

    .line 213
    .line 214
    const/16 v21, 0x25e

    .line 215
    .line 216
    const/4 v10, 0x0

    .line 217
    const/4 v11, 0x0

    .line 218
    const v14, 0x7f130677

    .line 219
    .line 220
    .line 221
    const v16, 0x7f131690

    .line 222
    .line 223
    .line 224
    const-wide/16 v17, 0x2710

    .line 225
    .line 226
    invoke-static/range {v8 .. v21}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 227
    .line 228
    .line 229
    move-result-object v19

    .line 230
    const/4 v12, 0x0

    .line 231
    const/16 v17, 0x0

    .line 232
    .line 233
    const/16 v18, 0x1

    .line 234
    .line 235
    move-object v15, v5

    .line 236
    move-object/from16 v16, v5

    .line 237
    .line 238
    move-object/from16 v20, v0

    .line 239
    .line 240
    move-object v11, v1

    .line 241
    move-object v9, v2

    .line 242
    move-object v10, v3

    .line 243
    move-object v13, v4

    .line 244
    move-object v14, v5

    .line 245
    invoke-direct/range {v9 .. v20}, La/q060;-><init>(Ljava/lang/String;Ljava/lang/String;La/e060;La/j060;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLa/mdm;La/qho;)V

    .line 246
    .line 247
    .line 248
    return-object v9

    .line 249
    :pswitch_1
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 252
    .line 253
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v2, La/gc50;

    .line 256
    .line 257
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, La/jc50;

    .line 260
    .line 261
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    iget-object v1, v2, La/gc50;->d:Lkotlin/jvm/functions/Function0;

    .line 265
    .line 266
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    iget-object v0, v0, La/jc50;->f:Lkotlin/jvm/functions/Function0;

    .line 270
    .line 271
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_2
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, La/vzg0;

    .line 280
    .line 281
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v2, Ljava/lang/String;

    .line 284
    .line 285
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 286
    .line 287
    invoke-virtual {v1, v0, v2}, La/vzg0;->c(Ljava/lang/Object;Ljava/lang/String;)La/xae0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    :pswitch_3
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v1, La/xpj0;

    .line 295
    .line 296
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, La/vne;

    .line 299
    .line 300
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, La/xpj0;

    .line 303
    .line 304
    iget-object v1, v1, La/xpj0;->e:La/qv2;

    .line 305
    .line 306
    iget-object v1, v1, La/qv2;->e:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 309
    .line 310
    sget-object v3, La/ypj0;->b:La/ypj0;

    .line 311
    .line 312
    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Ljava/lang/Boolean;

    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-eqz v1, :cond_8

    .line 323
    .line 324
    new-instance v1, La/xp8;

    .line 325
    .line 326
    const/16 v3, 0xd

    .line 327
    .line 328
    invoke-direct {v1, v0, v6, v3}, La/xp8;-><init>(La/xpj0;La/yje;B)V

    .line 329
    .line 330
    .line 331
    const/4 v0, 0x3

    .line 332
    invoke-static {v2, v6, v6, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 333
    .line 334
    .line 335
    :cond_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_4
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v1, La/cgk0;

    .line 341
    .line 342
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v2, La/cgk0;

    .line 345
    .line 346
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v0, La/cgk0;

    .line 349
    .line 350
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    add-int/2addr v2, v1

    .line 359
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    add-int/2addr v0, v2

    .line 364
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :pswitch_5
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 372
    .line 373
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, La/mie0;

    .line 376
    .line 377
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, La/xlw;

    .line 380
    .line 381
    iget-object v2, v2, La/mie0;->a:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v2, La/c810;

    .line 384
    .line 385
    iget-object v3, v2, La/c810;->m:La/hz40;

    .line 386
    .line 387
    if-nez v3, :cond_9

    .line 388
    .line 389
    sget-object v3, La/u1h0;->a:[J

    .line 390
    .line 391
    new-instance v3, La/hz40;

    .line 392
    .line 393
    invoke-direct {v3}, La/hz40;-><init>()V

    .line 394
    .line 395
    .line 396
    iput-object v3, v2, La/c810;->m:La/hz40;

    .line 397
    .line 398
    :cond_9
    invoke-virtual {v3, v0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    if-nez v4, :cond_a

    .line 403
    .line 404
    new-instance v4, La/a810;

    .line 405
    .line 406
    invoke-direct {v4, v2}, La/a810;-><init>(La/c810;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v0, v4}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :cond_a
    check-cast v4, La/a810;

    .line 413
    .line 414
    iput-boolean v7, v4, La/a810;->a:Z

    .line 415
    .line 416
    invoke-interface {v1, v4, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_6
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v1, La/cp;

    .line 425
    .line 426
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v2, La/gkz;

    .line 429
    .line 430
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, La/gkz;

    .line 433
    .line 434
    new-instance v3, La/b800;

    .line 435
    .line 436
    invoke-direct {v3, v1, v2, v0}, La/b800;-><init>(La/cp;La/gkz;La/gkz;)V

    .line 437
    .line 438
    .line 439
    return-object v3

    .line 440
    :pswitch_7
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v1, La/zbk;

    .line 443
    .line 444
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v2, La/xcz;

    .line 447
    .line 448
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, La/g9z;

    .line 451
    .line 452
    invoke-virtual {v1}, La/zbk;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    check-cast v1, La/hcz;

    .line 457
    .line 458
    new-instance v3, Landroidx/compose/foundation/lazy/layout/c;

    .line 459
    .line 460
    iget-object v4, v2, La/xcz;->e:La/t8z;

    .line 461
    .line 462
    iget-object v4, v4, La/t8z;->f:La/lbz;

    .line 463
    .line 464
    invoke-virtual {v4}, La/lbz;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    check-cast v4, Lkotlin/ranges/IntRange;

    .line 469
    .line 470
    invoke-direct {v3, v4, v1}, Landroidx/compose/foundation/lazy/layout/c;-><init>(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/b;)V

    .line 471
    .line 472
    .line 473
    new-instance v4, La/icz;

    .line 474
    .line 475
    invoke-direct {v4, v2, v1, v0, v3}, La/icz;-><init>(La/xcz;La/hcz;La/g9z;Landroidx/compose/foundation/lazy/layout/c;)V

    .line 476
    .line 477
    .line 478
    return-object v4

    .line 479
    :pswitch_8
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v1, La/pz40;

    .line 482
    .line 483
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v2, La/pz40;

    .line 486
    .line 487
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 490
    .line 491
    new-instance v3, La/jk80;

    .line 492
    .line 493
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    check-cast v1, La/ydr;

    .line 498
    .line 499
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 504
    .line 505
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    check-cast v0, Ljava/lang/Number;

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    invoke-direct {v3, v1, v2, v0}, La/jk80;-><init>(La/ydr;Lkotlin/jvm/functions/Function1;I)V

    .line 516
    .line 517
    .line 518
    return-object v3

    .line 519
    :pswitch_9
    const-string v1, "https://play.google.com/store/apps/details?id="

    .line 520
    .line 521
    const-string v2, "market://details?id="

    .line 522
    .line 523
    iget-object v3, v0, La/g8l;->d:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v3, La/kxq;

    .line 526
    .line 527
    iget-object v4, v0, La/g8l;->b:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v4, Ljava/lang/String;

    .line 530
    .line 531
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, La/wdk0;

    .line 534
    .line 535
    const-string v5, "android.intent.action.VIEW"

    .line 536
    .line 537
    :try_start_0
    new-instance v6, Landroid/content/Intent;

    .line 538
    .line 539
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-direct {v6, v5, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 551
    .line 552
    .line 553
    goto :goto_0

    .line 554
    :catch_0
    invoke-static {v3, v0}, La/n6x;->h0(La/kxq;La/wdk0;)V

    .line 555
    .line 556
    .line 557
    goto :goto_0

    .line 558
    :catch_1
    :try_start_1
    new-instance v2, Landroid/content/Intent;

    .line 559
    .line 560
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-direct {v2, v5, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 572
    .line 573
    .line 574
    goto :goto_0

    .line 575
    :catch_2
    invoke-static {v3, v0}, La/n6x;->h0(La/kxq;La/wdk0;)V

    .line 576
    .line 577
    .line 578
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_a
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v1, La/luu;

    .line 584
    .line 585
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v2, La/pru;

    .line 588
    .line 589
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, La/r9u;

    .line 592
    .line 593
    new-instance v5, La/pyy;

    .line 594
    .line 595
    new-instance v7, La/ypl0;

    .line 596
    .line 597
    const-string v6, ""

    .line 598
    .line 599
    sget-object v8, La/lel0;->Companion:La/kel0;

    .line 600
    .line 601
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-static {}, La/kel0;->a()La/lel0;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    invoke-direct {v7, v3, v4, v6, v8}, La/ypl0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 609
    .line 610
    .line 611
    sget-object v9, La/xun;->a:La/xun;

    .line 612
    .line 613
    iget-object v1, v1, La/luu;->a:La/nok0;

    .line 614
    .line 615
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 616
    .line 617
    .line 618
    move-result-object v10

    .line 619
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 620
    .line 621
    .line 622
    move-result-object v11

    .line 623
    sget-object v1, La/ygp;->t:La/ygp;

    .line 624
    .line 625
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 631
    .line 632
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 633
    .line 634
    .line 635
    move-result v12

    .line 636
    const/4 v6, 0x0

    .line 637
    const/4 v8, 0x0

    .line 638
    invoke-direct/range {v5 .. v12}, La/pyy;-><init>(ZLa/ypl0;La/j0g0;Ljava/util/Set;Ljava/util/List;La/sff0;Z)V

    .line 639
    .line 640
    .line 641
    return-object v5

    .line 642
    :pswitch_b
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 645
    .line 646
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v2, La/jvy;

    .line 649
    .line 650
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v0, La/pz40;

    .line 653
    .line 654
    iget-wide v2, v2, La/jvy;->a:J

    .line 655
    .line 656
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    check-cast v0, Ljava/lang/String;

    .line 665
    .line 666
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 670
    .line 671
    return-object v0

    .line 672
    :pswitch_c
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v1, La/hie0;

    .line 675
    .line 676
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 679
    .line 680
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, La/o1e;

    .line 683
    .line 684
    iget-boolean v1, v1, La/hie0;->a:Z

    .line 685
    .line 686
    if-eqz v1, :cond_b

    .line 687
    .line 688
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    sget-object v3, La/pov0;->a:Ljava/lang/String;

    .line 693
    .line 694
    const-string v4, "NetworkRequestConstraintController unregister callback"

    .line 695
    .line 696
    invoke-virtual {v1, v3, v4}, La/wv00;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 700
    .line 701
    .line 702
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    return-object v0

    .line 705
    :pswitch_d
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 706
    .line 707
    check-cast v1, La/pru;

    .line 708
    .line 709
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 710
    .line 711
    move-object v6, v2

    .line 712
    check-cast v6, La/f8w;

    .line 713
    .line 714
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 715
    .line 716
    move-object v7, v0

    .line 717
    check-cast v7, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 718
    .line 719
    new-instance v3, La/z7w;

    .line 720
    .line 721
    sget-object v0, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 722
    .line 723
    filled-new-array {v0}, [Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-static {v0}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 736
    .line 737
    iget-object v5, v0, La/gx7;->f:Ljava/lang/String;

    .line 738
    .line 739
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 744
    .line 745
    iget-object v0, v0, La/gx7;->b:La/q57;

    .line 746
    .line 747
    iget-boolean v8, v0, La/q57;->f:Z

    .line 748
    .line 749
    invoke-direct/range {v3 .. v8}, La/z7w;-><init>(Ljava/util/List;Ljava/lang/String;La/f8w;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Z)V

    .line 750
    .line 751
    .line 752
    return-object v3

    .line 753
    :pswitch_e
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v1, La/yqt;

    .line 756
    .line 757
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v2, La/w1u;

    .line 760
    .line 761
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, La/w4u;

    .line 764
    .line 765
    invoke-virtual {v1}, La/yqt;->a()La/zzp0;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    new-instance v3, La/t4q;

    .line 770
    .line 771
    iget-object v2, v2, La/w1u;->a:La/k0q0;

    .line 772
    .line 773
    iget-object v2, v2, La/k0q0;->a:La/h0q0;

    .line 774
    .line 775
    iget-object v2, v2, La/h0q0;->a:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v2, La/rgv0;

    .line 778
    .line 779
    sget-object v4, La/rgv0;->g:La/rgv0;

    .line 780
    .line 781
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    iget-object v0, v0, La/w4u;->a:La/k0q0;

    .line 786
    .line 787
    iget-object v0, v0, La/k0q0;->a:La/h0q0;

    .line 788
    .line 789
    iget-object v0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v0, La/zzp0;

    .line 792
    .line 793
    invoke-direct {v3, v2, v1, v0, v1}, La/t4q;-><init>(ZLa/zzp0;La/zzp0;La/zzp0;)V

    .line 794
    .line 795
    .line 796
    return-object v3

    .line 797
    :pswitch_f
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v1, La/vzg0;

    .line 800
    .line 801
    iget-object v3, v0, La/g8l;->b:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v3, La/ctf0;

    .line 804
    .line 805
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 806
    .line 807
    move-object v13, v0

    .line 808
    check-cast v13, La/j700;

    .line 809
    .line 810
    new-instance v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 811
    .line 812
    sget-object v4, La/xun;->a:La/xun;

    .line 813
    .line 814
    invoke-direct {v0, v4, v7}, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;-><init>(Ljava/util/Set;Z)V

    .line 815
    .line 816
    .line 817
    const-string v4, "SELECTION_STATE_KEY"

    .line 818
    .line 819
    invoke-virtual {v1, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    check-cast v1, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 824
    .line 825
    if-nez v1, :cond_c

    .line 826
    .line 827
    move-object v14, v0

    .line 828
    goto :goto_1

    .line 829
    :cond_c
    move-object v14, v1

    .line 830
    :goto_1
    sget-object v9, La/iun;->a:La/iun;

    .line 831
    .line 832
    new-array v0, v7, [Ljava/lang/Object;

    .line 833
    .line 834
    iget-object v1, v3, La/ctf0;->b:La/lsm0;

    .line 835
    .line 836
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v20

    .line 844
    new-instance v8, La/ngl0;

    .line 845
    .line 846
    const-string v11, ""

    .line 847
    .line 848
    const/16 v19, 0x0

    .line 849
    .line 850
    const/16 v21, 0x0

    .line 851
    .line 852
    const/4 v12, 0x0

    .line 853
    const/4 v15, 0x0

    .line 854
    const/16 v16, 0x1

    .line 855
    .line 856
    const/16 v17, 0x0

    .line 857
    .line 858
    const/16 v18, 0x0

    .line 859
    .line 860
    move-object v10, v9

    .line 861
    invoke-direct/range {v8 .. v21}, La/ngl0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/mgl0;La/j700;Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;ZZZZZLjava/lang/String;Z)V

    .line 862
    .line 863
    .line 864
    return-object v8

    .line 865
    :pswitch_10
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v1, La/vzg0;

    .line 868
    .line 869
    iget-object v3, v0, La/g8l;->b:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v3, La/ctf0;

    .line 872
    .line 873
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;

    .line 876
    .line 877
    new-instance v4, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 878
    .line 879
    sget-object v5, La/xun;->a:La/xun;

    .line 880
    .line 881
    invoke-direct {v4, v5, v7}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;-><init>(Ljava/util/Set;Z)V

    .line 882
    .line 883
    .line 884
    const-string v5, "SELECTION_STATE_KEY"

    .line 885
    .line 886
    invoke-virtual {v1, v5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v5

    .line 890
    check-cast v5, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 891
    .line 892
    if-nez v5, :cond_d

    .line 893
    .line 894
    move-object v13, v4

    .line 895
    goto :goto_2

    .line 896
    :cond_d
    move-object v13, v5

    .line 897
    :goto_2
    const-string v4, "EXPANDED_STATE_KEY"

    .line 898
    .line 899
    invoke-virtual {v1, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    check-cast v4, Ljava/util/Set;

    .line 904
    .line 905
    if-nez v4, :cond_e

    .line 906
    .line 907
    const-string v4, "-2"

    .line 908
    .line 909
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    :cond_e
    move-object v12, v4

    .line 914
    new-instance v9, La/jnb;

    .line 915
    .line 916
    new-instance v4, La/knb;

    .line 917
    .line 918
    sget-object v5, La/iun;->a:La/iun;

    .line 919
    .line 920
    invoke-direct {v4, v5, v5}, La/knb;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 921
    .line 922
    .line 923
    invoke-direct {v9, v4, v5}, La/jnb;-><init>(La/knb;Ljava/util/List;)V

    .line 924
    .line 925
    .line 926
    new-array v4, v7, [Ljava/lang/Object;

    .line 927
    .line 928
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 929
    .line 930
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v4

    .line 934
    invoke-virtual {v3, v2, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v18

    .line 938
    iget-object v0, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->b:La/j700;

    .line 939
    .line 940
    const-string v2, "EXPANDED_GAMES_STATE_KEY"

    .line 941
    .line 942
    invoke-virtual {v1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    check-cast v1, Ljava/util/List;

    .line 947
    .line 948
    if-nez v1, :cond_f

    .line 949
    .line 950
    move-object/from16 v17, v5

    .line 951
    .line 952
    goto :goto_3

    .line 953
    :cond_f
    move-object/from16 v17, v1

    .line 954
    .line 955
    :goto_3
    sget-object v21, La/zmb;->a:La/zmb;

    .line 956
    .line 957
    new-instance v8, La/xmp;

    .line 958
    .line 959
    const-string v11, ""

    .line 960
    .line 961
    const/16 v19, 0x0

    .line 962
    .line 963
    const/16 v22, 0x0

    .line 964
    .line 965
    const/4 v10, 0x0

    .line 966
    const/4 v14, 0x0

    .line 967
    const/4 v15, 0x1

    .line 968
    const/16 v16, 0x0

    .line 969
    .line 970
    move-object/from16 v20, v0

    .line 971
    .line 972
    invoke-direct/range {v8 .. v22}, La/xmp;-><init>(La/jnb;La/rlp;Ljava/lang/String;Ljava/util/Set;Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZZZLjava/util/List;Ljava/lang/String;ZLa/j700;La/zmb;Z)V

    .line 973
    .line 974
    .line 975
    return-object v8

    .line 976
    :pswitch_11
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v1, La/mco;

    .line 979
    .line 980
    iget-object v2, v1, La/mco;->o:La/n0o0;

    .line 981
    .line 982
    iget-object v7, v1, La/mco;->q:La/n0o0;

    .line 983
    .line 984
    iget-object v8, v1, La/mco;->m:La/n0o0;

    .line 985
    .line 986
    iget-object v9, v1, La/mco;->s:La/n0o0;

    .line 987
    .line 988
    iget-object v10, v1, La/mco;->p:La/n0o0;

    .line 989
    .line 990
    iget-object v11, v1, La/mco;->n:La/n0o0;

    .line 991
    .line 992
    iget-object v12, v1, La/mco;->r:La/n0o0;

    .line 993
    .line 994
    iget-object v13, v1, La/mco;->l:La/n0o0;

    .line 995
    .line 996
    iget-object v14, v1, La/mco;->k:La/n0o0;

    .line 997
    .line 998
    iget-object v15, v0, La/g8l;->b:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v15, La/jih;

    .line 1001
    .line 1002
    iget-object v3, v15, La/jih;->c:Ljava/lang/Object;

    .line 1003
    .line 1004
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast v0, La/zjw;

    .line 1007
    .line 1008
    iget-object v4, v0, La/zjw;->m:Ljava/util/Map;

    .line 1009
    .line 1010
    move-object/from16 v18, v6

    .line 1011
    .line 1012
    iget-object v6, v0, La/zjw;->g:La/ekw;

    .line 1013
    .line 1014
    iget-object v6, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1015
    .line 1016
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v4

    .line 1020
    check-cast v4, Ljava/lang/Long;

    .line 1021
    .line 1022
    if-eqz v4, :cond_10

    .line 1023
    .line 1024
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1025
    .line 1026
    .line 1027
    move-result-wide v19

    .line 1028
    move-object v4, v1

    .line 1029
    move-wide/from16 v26, v19

    .line 1030
    .line 1031
    move-object/from16 v19, v2

    .line 1032
    .line 1033
    move-wide/from16 v1, v26

    .line 1034
    .line 1035
    goto :goto_4

    .line 1036
    :cond_10
    move-object v4, v1

    .line 1037
    move-object/from16 v19, v2

    .line 1038
    .line 1039
    const-wide/16 v1, 0x0

    .line 1040
    .line 1041
    :goto_4
    iget-object v5, v0, La/zjw;->n:Ljava/util/Map;

    .line 1042
    .line 1043
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v5

    .line 1047
    check-cast v5, Ljava/lang/Long;

    .line 1048
    .line 1049
    if-eqz v5, :cond_11

    .line 1050
    .line 1051
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v16

    .line 1055
    move-object/from16 p0, v4

    .line 1056
    .line 1057
    move-wide/from16 v4, v16

    .line 1058
    .line 1059
    :goto_5
    move-object/from16 v16, v7

    .line 1060
    .line 1061
    goto :goto_6

    .line 1062
    :cond_11
    move-object/from16 p0, v4

    .line 1063
    .line 1064
    const-wide/16 v4, 0x0

    .line 1065
    .line 1066
    goto :goto_5

    .line 1067
    :goto_6
    iget-object v7, v0, La/zjw;->o:Ljava/util/Map;

    .line 1068
    .line 1069
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v7

    .line 1073
    check-cast v7, Ljava/util/List;

    .line 1074
    .line 1075
    if-nez v7, :cond_12

    .line 1076
    .line 1077
    sget-object v7, La/iun;->a:La/iun;

    .line 1078
    .line 1079
    :cond_12
    iget-object v0, v0, La/zjw;->p:Ljava/util/Map;

    .line 1080
    .line 1081
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    check-cast v0, Ljava/util/List;

    .line 1086
    .line 1087
    if-nez v0, :cond_13

    .line 1088
    .line 1089
    sget-object v0, La/iun;->a:La/iun;

    .line 1090
    .line 1091
    :cond_13
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v17

    .line 1095
    move-object/from16 v21, v8

    .line 1096
    .line 1097
    move-object/from16 v8, v17

    .line 1098
    .line 1099
    check-cast v8, La/fee;

    .line 1100
    .line 1101
    move-object/from16 v17, v9

    .line 1102
    .line 1103
    iget-object v9, v15, La/jih;->d:Ljava/lang/Object;

    .line 1104
    .line 1105
    sget-object v22, La/j0g0;->b:La/e0g0;

    .line 1106
    .line 1107
    move-object/from16 v22, v10

    .line 1108
    .line 1109
    instance-of v10, v3, La/g0g0;

    .line 1110
    .line 1111
    if-eqz v10, :cond_14

    .line 1112
    .line 1113
    move-object/from16 v10, v18

    .line 1114
    .line 1115
    goto :goto_7

    .line 1116
    :cond_14
    move-object v10, v3

    .line 1117
    :goto_7
    check-cast v10, Ljava/util/List;

    .line 1118
    .line 1119
    if-nez v10, :cond_15

    .line 1120
    .line 1121
    sget-object v10, La/iun;->a:La/iun;

    .line 1122
    .line 1123
    :cond_15
    move-object/from16 v23, v11

    .line 1124
    .line 1125
    instance-of v11, v9, La/g0g0;

    .line 1126
    .line 1127
    if-eqz v11, :cond_16

    .line 1128
    .line 1129
    move-object/from16 v24, v18

    .line 1130
    .line 1131
    goto :goto_8

    .line 1132
    :cond_16
    move-object/from16 v24, v9

    .line 1133
    .line 1134
    :goto_8
    check-cast v24, Ljava/util/List;

    .line 1135
    .line 1136
    if-eqz v24, :cond_17

    .line 1137
    .line 1138
    :goto_9
    move-object/from16 v25, v9

    .line 1139
    .line 1140
    move-object/from16 v9, v24

    .line 1141
    .line 1142
    goto :goto_a

    .line 1143
    :cond_17
    sget-object v24, La/iun;->a:La/iun;

    .line 1144
    .line 1145
    goto :goto_9

    .line 1146
    :goto_a
    invoke-static {v10, v9}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v9

    .line 1150
    invoke-virtual {v8, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v8

    .line 1157
    check-cast v8, La/fee;

    .line 1158
    .line 1159
    iget-object v9, v15, La/jih;->b:Ljava/lang/Object;

    .line 1160
    .line 1161
    instance-of v10, v9, La/g0g0;

    .line 1162
    .line 1163
    if-eqz v10, :cond_18

    .line 1164
    .line 1165
    move-object/from16 v9, v18

    .line 1166
    .line 1167
    :cond_18
    check-cast v9, Ljava/util/List;

    .line 1168
    .line 1169
    if-nez v9, :cond_19

    .line 1170
    .line 1171
    sget-object v9, La/iun;->a:La/iun;

    .line 1172
    .line 1173
    :cond_19
    invoke-virtual {v8, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    check-cast v8, La/fee;

    .line 1181
    .line 1182
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v8}, La/fee;->a()La/pz40;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v9

    .line 1189
    invoke-virtual {v8}, La/fee;->a()La/pz40;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v8

    .line 1193
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v8

    .line 1197
    check-cast v8, La/xbo;

    .line 1198
    .line 1199
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    new-instance v8, La/xbo;

    .line 1203
    .line 1204
    instance-of v10, v3, La/g0g0;

    .line 1205
    .line 1206
    if-eqz v10, :cond_1a

    .line 1207
    .line 1208
    move-object/from16 v3, v18

    .line 1209
    .line 1210
    :cond_1a
    check-cast v3, Ljava/util/List;

    .line 1211
    .line 1212
    if-nez v3, :cond_1b

    .line 1213
    .line 1214
    sget-object v3, La/iun;->a:La/iun;

    .line 1215
    .line 1216
    :cond_1b
    invoke-direct {v8, v1, v2, v3, v7}, La/xbo;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 1217
    .line 1218
    .line 1219
    invoke-interface {v9, v8}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual/range {v23 .. v23}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v1

    .line 1226
    check-cast v1, La/fee;

    .line 1227
    .line 1228
    iget-object v2, v15, La/jih;->e:Ljava/lang/Object;

    .line 1229
    .line 1230
    instance-of v3, v2, La/g0g0;

    .line 1231
    .line 1232
    if-eqz v3, :cond_1c

    .line 1233
    .line 1234
    move-object/from16 v2, v18

    .line 1235
    .line 1236
    :cond_1c
    check-cast v2, Ljava/util/List;

    .line 1237
    .line 1238
    if-nez v2, :cond_1d

    .line 1239
    .line 1240
    sget-object v2, La/iun;->a:La/iun;

    .line 1241
    .line 1242
    :cond_1d
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual/range {v22 .. v22}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    check-cast v1, La/fee;

    .line 1250
    .line 1251
    invoke-static {v15}, La/phu0;->W(La/jih;)La/n52;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v2

    .line 1255
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual/range {v17 .. v17}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v1

    .line 1262
    check-cast v1, La/fee;

    .line 1263
    .line 1264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v1}, La/fee;->a()La/pz40;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v2

    .line 1271
    invoke-virtual {v1}, La/fee;->a()La/pz40;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v1

    .line 1275
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v1

    .line 1279
    check-cast v1, La/xbo;

    .line 1280
    .line 1281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    new-instance v1, La/xbo;

    .line 1285
    .line 1286
    if-eqz v11, :cond_1e

    .line 1287
    .line 1288
    move-object/from16 v9, v18

    .line 1289
    .line 1290
    goto :goto_b

    .line 1291
    :cond_1e
    move-object/from16 v9, v25

    .line 1292
    .line 1293
    :goto_b
    check-cast v9, Ljava/util/List;

    .line 1294
    .line 1295
    if-nez v9, :cond_1f

    .line 1296
    .line 1297
    sget-object v9, La/iun;->a:La/iun;

    .line 1298
    .line 1299
    :cond_1f
    invoke-direct {v1, v4, v5, v9, v0}, La/xbo;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 1300
    .line 1301
    .line 1302
    invoke-interface {v2, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual/range {v21 .. v21}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    check-cast v0, La/fee;

    .line 1310
    .line 1311
    invoke-virtual/range {p0 .. p0}, La/mco;->a()La/fee;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v1

    .line 1315
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v1

    .line 1319
    check-cast v1, La/ekw;

    .line 1320
    .line 1321
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1322
    .line 1323
    const/4 v2, 0x1

    .line 1324
    invoke-static {v15, v1, v2}, La/kih;->a(La/jih;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v1

    .line 1328
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v1

    .line 1332
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual/range {v16 .. v16}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    check-cast v0, La/fee;

    .line 1340
    .line 1341
    iget-object v1, v15, La/jih;->h:Ljava/lang/Object;

    .line 1342
    .line 1343
    instance-of v2, v1, La/g0g0;

    .line 1344
    .line 1345
    if-eqz v2, :cond_20

    .line 1346
    .line 1347
    move-object/from16 v1, v18

    .line 1348
    .line 1349
    :cond_20
    check-cast v1, Ljava/util/List;

    .line 1350
    .line 1351
    if-nez v1, :cond_21

    .line 1352
    .line 1353
    sget-object v1, La/iun;->a:La/iun;

    .line 1354
    .line 1355
    :cond_21
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual/range {v19 .. v19}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    check-cast v0, La/fee;

    .line 1363
    .line 1364
    iget-object v1, v15, La/jih;->i:Ljava/lang/Object;

    .line 1365
    .line 1366
    instance-of v2, v1, La/g0g0;

    .line 1367
    .line 1368
    if-eqz v2, :cond_22

    .line 1369
    .line 1370
    move-object/from16 v1, v18

    .line 1371
    .line 1372
    :cond_22
    check-cast v1, Ljava/util/List;

    .line 1373
    .line 1374
    if-nez v1, :cond_23

    .line 1375
    .line 1376
    sget-object v1, La/iun;->a:La/iun;

    .line 1377
    .line 1378
    :cond_23
    invoke-static {v1}, La/cwr0;->S(Ljava/util/List;)La/n52;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v1

    .line 1382
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 1383
    .line 1384
    .line 1385
    instance-of v0, v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1386
    .line 1387
    if-eqz v0, :cond_24

    .line 1388
    .line 1389
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v1

    .line 1397
    check-cast v1, La/fee;

    .line 1398
    .line 1399
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    check-cast v1, La/fee;

    .line 1411
    .line 1412
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    check-cast v1, Ljava/util/Collection;

    .line 1417
    .line 1418
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v1

    .line 1425
    check-cast v1, La/fee;

    .line 1426
    .line 1427
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v1

    .line 1431
    check-cast v1, Ljava/util/Collection;

    .line 1432
    .line 1433
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual/range {v21 .. v21}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    check-cast v1, La/fee;

    .line 1441
    .line 1442
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v1

    .line 1446
    check-cast v1, Ljava/util/Collection;

    .line 1447
    .line 1448
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual/range {v19 .. v19}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v1

    .line 1455
    check-cast v1, La/fee;

    .line 1456
    .line 1457
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v1

    .line 1461
    check-cast v1, Ljava/util/Collection;

    .line 1462
    .line 1463
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual/range {v17 .. v17}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v1

    .line 1470
    check-cast v1, La/fee;

    .line 1471
    .line 1472
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v1

    .line 1476
    check-cast v1, Ljava/util/Collection;

    .line 1477
    .line 1478
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual/range {v23 .. v23}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    check-cast v1, La/fee;

    .line 1486
    .line 1487
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v1

    .line 1491
    check-cast v1, Ljava/util/Collection;

    .line 1492
    .line 1493
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1494
    .line 1495
    .line 1496
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0

    .line 1500
    goto :goto_c

    .line 1501
    :cond_24
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    check-cast v1, La/fee;

    .line 1510
    .line 1511
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v1

    .line 1522
    check-cast v1, La/fee;

    .line 1523
    .line 1524
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v1

    .line 1528
    check-cast v1, Ljava/util/Collection;

    .line 1529
    .line 1530
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v1

    .line 1537
    check-cast v1, La/fee;

    .line 1538
    .line 1539
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v1

    .line 1543
    check-cast v1, Ljava/util/Collection;

    .line 1544
    .line 1545
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual/range {v16 .. v16}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v1

    .line 1552
    check-cast v1, La/fee;

    .line 1553
    .line 1554
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v1

    .line 1558
    check-cast v1, Ljava/util/Collection;

    .line 1559
    .line 1560
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1561
    .line 1562
    .line 1563
    invoke-virtual/range {v22 .. v22}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    check-cast v1, La/fee;

    .line 1568
    .line 1569
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v1

    .line 1573
    check-cast v1, Ljava/util/Collection;

    .line 1574
    .line 1575
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    :goto_c
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    return-object v0

    .line 1587
    :pswitch_12
    move-object/from16 v18, v6

    .line 1588
    .line 1589
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1590
    .line 1591
    check-cast v1, [Ljava/lang/String;

    .line 1592
    .line 1593
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1594
    .line 1595
    check-cast v2, [Z

    .line 1596
    .line 1597
    iget-object v3, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1598
    .line 1599
    const/16 v0, 0x1f01

    .line 1600
    .line 1601
    :try_start_2
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v0

    .line 1605
    aput-object v0, v1, v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1606
    .line 1607
    const/16 v20, 0x1

    .line 1608
    .line 1609
    aput-boolean v20, v2, v7

    .line 1610
    .line 1611
    monitor-enter v3

    .line 1612
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1613
    .line 1614
    .line 1615
    :goto_d
    monitor-exit v3

    .line 1616
    goto :goto_e

    .line 1617
    :catchall_0
    move-exception v0

    .line 1618
    monitor-exit v3

    .line 1619
    throw v0

    .line 1620
    :catchall_1
    move-exception v0

    .line 1621
    const/16 v20, 0x1

    .line 1622
    .line 1623
    goto :goto_f

    .line 1624
    :catch_3
    :try_start_4
    aput-object v18, v1, v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 1625
    .line 1626
    const/16 v20, 0x1

    .line 1627
    .line 1628
    aput-boolean v20, v2, v7

    .line 1629
    .line 1630
    monitor-enter v3

    .line 1631
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1632
    .line 1633
    .line 1634
    goto :goto_d

    .line 1635
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1636
    .line 1637
    return-object v0

    .line 1638
    :catchall_2
    move-exception v0

    .line 1639
    monitor-exit v3

    .line 1640
    throw v0

    .line 1641
    :goto_f
    aput-boolean v20, v2, v7

    .line 1642
    .line 1643
    monitor-enter v3

    .line 1644
    :try_start_6
    invoke-virtual {v3}, Ljava/lang/Object;->notify()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1645
    .line 1646
    .line 1647
    monitor-exit v3

    .line 1648
    throw v0

    .line 1649
    :catchall_3
    move-exception v0

    .line 1650
    monitor-exit v3

    .line 1651
    throw v0

    .line 1652
    :pswitch_13
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1653
    .line 1654
    check-cast v1, La/edu;

    .line 1655
    .line 1656
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v2, La/r9u;

    .line 1659
    .line 1660
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1661
    .line 1662
    check-cast v0, La/bzt;

    .line 1663
    .line 1664
    new-instance v3, La/ipn;

    .line 1665
    .line 1666
    invoke-virtual {v1}, La/edu;->g()La/aw20;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    sget-object v4, La/ygp;->t:La/ygp;

    .line 1671
    .line 1672
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 1673
    .line 1674
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1675
    .line 1676
    .line 1677
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 1678
    .line 1679
    invoke-virtual {v2, v4}, La/m1q0;->d(La/ygp;)Z

    .line 1680
    .line 1681
    .line 1682
    move-result v2

    .line 1683
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 1684
    .line 1685
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    iget v0, v0, La/v8d;->r:I

    .line 1690
    .line 1691
    sget-object v4, La/mon;->a:La/mon;

    .line 1692
    .line 1693
    invoke-direct {v3, v1, v2, v0, v4}, La/ipn;-><init>(La/aw20;ZILa/oon;)V

    .line 1694
    .line 1695
    .line 1696
    return-object v3

    .line 1697
    :pswitch_14
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1698
    .line 1699
    check-cast v1, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 1700
    .line 1701
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1702
    .line 1703
    check-cast v2, La/edu;

    .line 1704
    .line 1705
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v0, La/r9u;

    .line 1708
    .line 1709
    sget-object v4, La/iun;->a:La/iun;

    .line 1710
    .line 1711
    iget-wide v7, v1, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;->c:J

    .line 1712
    .line 1713
    invoke-virtual {v2}, La/edu;->g()La/aw20;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v11

    .line 1717
    sget-object v1, La/ygp;->t:La/ygp;

    .line 1718
    .line 1719
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1720
    .line 1721
    .line 1722
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 1723
    .line 1724
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1725
    .line 1726
    .line 1727
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 1728
    .line 1729
    invoke-virtual {v0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 1730
    .line 1731
    .line 1732
    move-result v12

    .line 1733
    new-instance v3, La/cdn;

    .line 1734
    .line 1735
    const/4 v9, 0x1

    .line 1736
    const/4 v10, 0x0

    .line 1737
    const/4 v6, 0x0

    .line 1738
    move-object v5, v4

    .line 1739
    invoke-direct/range {v3 .. v12}, La/cdn;-><init>(Ljava/util/List;Ljava/util/List;La/l9s;JZLa/xfa0;La/aw20;Z)V

    .line 1740
    .line 1741
    .line 1742
    return-object v3

    .line 1743
    :pswitch_15
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1744
    .line 1745
    check-cast v1, La/lan;

    .line 1746
    .line 1747
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1748
    .line 1749
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1750
    .line 1751
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1752
    .line 1753
    check-cast v0, La/pz40;

    .line 1754
    .line 1755
    check-cast v1, La/jan;

    .line 1756
    .line 1757
    iget-boolean v1, v1, La/jan;->g:Z

    .line 1758
    .line 1759
    if-nez v1, :cond_25

    .line 1760
    .line 1761
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1766
    .line 1767
    .line 1768
    :cond_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1769
    .line 1770
    return-object v0

    .line 1771
    :pswitch_16
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1772
    .line 1773
    check-cast v1, La/rqm;

    .line 1774
    .line 1775
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1776
    .line 1777
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 1778
    .line 1779
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1780
    .line 1781
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1782
    .line 1783
    iget-boolean v1, v1, La/rqm;->h:Z

    .line 1784
    .line 1785
    if-eqz v1, :cond_26

    .line 1786
    .line 1787
    if-eqz v2, :cond_27

    .line 1788
    .line 1789
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    goto :goto_10

    .line 1793
    :cond_26
    if-eqz v0, :cond_27

    .line 1794
    .line 1795
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1796
    .line 1797
    .line 1798
    :cond_27
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1799
    .line 1800
    return-object v0

    .line 1801
    :pswitch_17
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1802
    .line 1803
    check-cast v1, La/cqq;

    .line 1804
    .line 1805
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1806
    .line 1807
    check-cast v2, La/pz40;

    .line 1808
    .line 1809
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1810
    .line 1811
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1812
    .line 1813
    invoke-static {v1}, La/cqq;->a(La/cqq;)V

    .line 1814
    .line 1815
    .line 1816
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v1

    .line 1820
    check-cast v1, La/a8q0;

    .line 1821
    .line 1822
    const-string v3, ""

    .line 1823
    .line 1824
    invoke-static {v7, v7}, La/s7n0;->e(II)J

    .line 1825
    .line 1826
    .line 1827
    move-result-wide v4

    .line 1828
    const/4 v6, 0x4

    .line 1829
    invoke-static {v1, v3, v4, v5, v6}, La/a8q0;->b(La/a8q0;Ljava/lang/String;JI)La/a8q0;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v1

    .line 1833
    invoke-static {v2, v0, v1}, La/aac;->o(La/pz40;Lkotlin/jvm/functions/Function1;La/a8q0;)V

    .line 1834
    .line 1835
    .line 1836
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1837
    .line 1838
    return-object v0

    .line 1839
    :pswitch_18
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1840
    .line 1841
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 1842
    .line 1843
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1844
    .line 1845
    check-cast v2, La/kzc0;

    .line 1846
    .line 1847
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1848
    .line 1849
    check-cast v0, La/pz40;

    .line 1850
    .line 1851
    iget v2, v2, La/kzc0;->a:I

    .line 1852
    .line 1853
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v2

    .line 1857
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v0

    .line 1861
    check-cast v0, Ljava/lang/String;

    .line 1862
    .line 1863
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1864
    .line 1865
    .line 1866
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1867
    .line 1868
    return-object v0

    .line 1869
    :pswitch_19
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1870
    .line 1871
    check-cast v1, La/omv;

    .line 1872
    .line 1873
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1874
    .line 1875
    check-cast v2, La/yvl;

    .line 1876
    .line 1877
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1878
    .line 1879
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1880
    .line 1881
    iget-object v2, v2, La/yvl;->a:La/evq0;

    .line 1882
    .line 1883
    sget-object v3, La/evq0;->a:La/evq0;

    .line 1884
    .line 1885
    if-ne v2, v3, :cond_28

    .line 1886
    .line 1887
    const/16 v2, 0x16

    .line 1888
    .line 1889
    goto :goto_11

    .line 1890
    :cond_28
    const/16 v2, 0x15

    .line 1891
    .line 1892
    :goto_11
    invoke-static {v1, v2}, La/ckb;->a0(La/omv;I)V

    .line 1893
    .line 1894
    .line 1895
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1896
    .line 1897
    .line 1898
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1899
    .line 1900
    return-object v0

    .line 1901
    :pswitch_1a
    move-object/from16 v18, v6

    .line 1902
    .line 1903
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1904
    .line 1905
    check-cast v1, La/a4x;

    .line 1906
    .line 1907
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1908
    .line 1909
    check-cast v2, La/xk80;

    .line 1910
    .line 1911
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1912
    .line 1913
    check-cast v0, La/cgk0;

    .line 1914
    .line 1915
    invoke-virtual {v2}, La/xk80;->k()I

    .line 1916
    .line 1917
    .line 1918
    move-result v2

    .line 1919
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v1

    .line 1923
    check-cast v1, La/pr5;

    .line 1924
    .line 1925
    if-eqz v1, :cond_29

    .line 1926
    .line 1927
    iget-object v1, v1, La/pr5;->c:La/ds5;

    .line 1928
    .line 1929
    goto :goto_12

    .line 1930
    :cond_29
    move-object/from16 v1, v18

    .line 1931
    .line 1932
    :goto_12
    if-nez v1, :cond_2a

    .line 1933
    .line 1934
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 1935
    .line 1936
    .line 1937
    move-result v0

    .line 1938
    int-to-float v0, v0

    .line 1939
    const v1, 0x3fdb6db7

    .line 1940
    .line 1941
    .line 1942
    div-float/2addr v0, v1

    .line 1943
    float-to-int v0, v0

    .line 1944
    invoke-static {v0}, La/f7k;->T(I)I

    .line 1945
    .line 1946
    .line 1947
    move-result v0

    .line 1948
    int-to-float v0, v0

    .line 1949
    goto :goto_13

    .line 1950
    :cond_2a
    instance-of v0, v1, La/ds5;

    .line 1951
    .line 1952
    if-eqz v0, :cond_2b

    .line 1953
    .line 1954
    iget v0, v1, La/ds5;->a:F

    .line 1955
    .line 1956
    :goto_13
    new-instance v6, La/ycl;

    .line 1957
    .line 1958
    invoke-direct {v6, v0}, La/ycl;-><init>(F)V

    .line 1959
    .line 1960
    .line 1961
    goto :goto_14

    .line 1962
    :cond_2b
    invoke-static {}, La/t9f;->b()V

    .line 1963
    .line 1964
    .line 1965
    move-object/from16 v6, v18

    .line 1966
    .line 1967
    :goto_14
    return-object v6

    .line 1968
    :pswitch_1b
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1969
    .line 1970
    check-cast v1, La/d9l;

    .line 1971
    .line 1972
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1973
    .line 1974
    check-cast v2, Ljava/util/List;

    .line 1975
    .line 1976
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 1977
    .line 1978
    check-cast v0, Ljava/util/ArrayList;

    .line 1979
    .line 1980
    const/4 v3, 0x1

    .line 1981
    iput-boolean v3, v1, La/d9l;->x:Z

    .line 1982
    .line 1983
    invoke-virtual {v1, v2}, La/d9l;->setMapBuildings(Ljava/util/List;)V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v1, v0}, La/d9l;->setMapHeroes(Ljava/util/List;)V

    .line 1987
    .line 1988
    .line 1989
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1990
    .line 1991
    return-object v0

    .line 1992
    :pswitch_1c
    move v3, v5

    .line 1993
    iget-object v1, v0, La/g8l;->d:Ljava/lang/Object;

    .line 1994
    .line 1995
    check-cast v1, La/i8l;

    .line 1996
    .line 1997
    iget-object v2, v0, La/g8l;->b:Ljava/lang/Object;

    .line 1998
    .line 1999
    check-cast v2, Ljava/util/List;

    .line 2000
    .line 2001
    iget-object v0, v0, La/g8l;->c:Ljava/lang/Object;

    .line 2002
    .line 2003
    check-cast v0, Ljava/util/ArrayList;

    .line 2004
    .line 2005
    iput-boolean v3, v1, La/i8l;->i:Z

    .line 2006
    .line 2007
    invoke-virtual {v1, v2}, La/i8l;->setMapBuildings(Ljava/util/List;)V

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual {v1, v0}, La/i8l;->setMapHeroes(Ljava/util/List;)V

    .line 2011
    .line 2012
    .line 2013
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2014
    .line 2015
    return-object v0

    .line 2016
    nop

    .line 2017
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
