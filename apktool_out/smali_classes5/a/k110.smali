.class public final synthetic La/k110;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILa/mm40;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/k110;->a:B

    iput-object p3, p0, La/k110;->b:Ljava/lang/Object;

    iput-object p4, p0, La/k110;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/nn20;La/m97;La/m97;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    iput-byte p1, p0, La/k110;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/k110;->c:Ljava/lang/Object;

    iput-object p3, p0, La/k110;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/k110;->a:B

    iput-object p1, p0, La/k110;->c:Ljava/lang/Object;

    iput-object p2, p0, La/k110;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 4
    iput-byte p4, p0, La/k110;->a:B

    iput-object p1, p0, La/k110;->c:Ljava/lang/Object;

    iput-object p2, p0, La/k110;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k110;->a:B

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    const/4 v3, 0x7

    .line 8
    sget-object v4, La/ukd;->a:La/cl5;

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x2

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x1

    .line 19
    iget-object v13, v0, La/k110;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, La/k110;->c:Ljava/lang/Object;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 27
    .line 28
    check-cast v13, Ljava/util/ArrayList;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, Landroid/view/View;

    .line 33
    .line 34
    move-object/from16 v2, p2

    .line 35
    .line 36
    check-cast v2, Landroid/view/View;

    .line 37
    .line 38
    sget v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t1:I

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v3, La/mbz;

    .line 47
    .line 48
    const/16 v4, 0x16

    .line 49
    .line 50
    invoke-direct {v3, v0, v13, v4}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1, v2, v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->D(Landroid/view/View;Landroid/view/View;La/mbz;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    move-object v3, v0

    .line 60
    check-cast v3, La/js20;

    .line 61
    .line 62
    move-object v0, v13

    .line 63
    check-cast v0, La/uz20;

    .line 64
    .line 65
    move-object/from16 v1, p1

    .line 66
    .line 67
    check-cast v1, La/oyg0;

    .line 68
    .line 69
    move-object v2, v1

    .line 70
    move-object/from16 v1, p2

    .line 71
    .line 72
    check-cast v1, La/dz20;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v3}, La/js20;->a()J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const/4 v12, 0x0

    .line 89
    const/16 v13, 0xff9

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    const/4 v11, 0x0

    .line 99
    invoke-static/range {v1 .. v13}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v0, v0, La/uz20;->o:La/vzg0;

    .line 104
    .line 105
    const-string v2, "KEY_CURRENT_CATEGORY_ID"

    .line 106
    .line 107
    iget-object v3, v1, La/dz20;->c:Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {v0, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :pswitch_1
    check-cast v0, La/xvm0;

    .line 114
    .line 115
    check-cast v13, La/uz20;

    .line 116
    .line 117
    move-object/from16 v1, p1

    .line 118
    .line 119
    check-cast v1, La/oyg0;

    .line 120
    .line 121
    move-object/from16 v14, p2

    .line 122
    .line 123
    check-cast v14, La/dz20;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-interface {v0}, La/xvm0;->getId()J

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object v19

    .line 139
    const/16 v25, 0x0

    .line 140
    .line 141
    const/16 v26, 0xfef

    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const/16 v20, 0x0

    .line 151
    .line 152
    const/16 v21, 0x0

    .line 153
    .line 154
    const/16 v22, 0x0

    .line 155
    .line 156
    const/16 v23, 0x0

    .line 157
    .line 158
    const/16 v24, 0x0

    .line 159
    .line 160
    invoke-static/range {v14 .. v26}, La/dz20;->a(La/dz20;Ljava/util/List;La/js20;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Long;La/xvm0;ZLjava/lang/String;La/px7;La/sf6;ZI)La/dz20;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, v13, La/uz20;->o:La/vzg0;

    .line 165
    .line 166
    const-string v2, "KEY_CURRENT_SUB_GAME_ID"

    .line 167
    .line 168
    iget-object v3, v0, La/dz20;->e:Ljava/lang/Long;

    .line 169
    .line 170
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_2
    check-cast v0, La/ry20;

    .line 175
    .line 176
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 177
    .line 178
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, La/fet;

    .line 181
    .line 182
    move-object/from16 v2, p2

    .line 183
    .line 184
    check-cast v2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v12}, La/x8x;->L(I)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-static {v0, v13, v1, v2}, La/l8x;->C(La/ry20;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 194
    .line 195
    .line 196
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_3
    check-cast v13, La/mm40;

    .line 200
    .line 201
    check-cast v0, La/lgs;

    .line 202
    .line 203
    move-object/from16 v1, p1

    .line 204
    .line 205
    check-cast v1, La/fet;

    .line 206
    .line 207
    move-object/from16 v2, p2

    .line 208
    .line 209
    check-cast v2, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {v12}, La/x8x;->L(I)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    invoke-static {v13, v0, v1, v2}, La/q7x;->e(La/mm40;La/lgs;La/fet;I)V

    .line 219
    .line 220
    .line 221
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_4
    check-cast v13, La/mm40;

    .line 225
    .line 226
    check-cast v0, La/gho;

    .line 227
    .line 228
    move-object/from16 v1, p1

    .line 229
    .line 230
    check-cast v1, La/fet;

    .line 231
    .line 232
    move-object/from16 v2, p2

    .line 233
    .line 234
    check-cast v2, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v12}, La/x8x;->L(I)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-static {v13, v0, v1, v2}, La/b5x;->e(La/mm40;La/gho;La/fet;I)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_5
    check-cast v13, La/mm40;

    .line 250
    .line 251
    check-cast v0, La/wls;

    .line 252
    .line 253
    move-object/from16 v1, p1

    .line 254
    .line 255
    check-cast v1, La/fet;

    .line 256
    .line 257
    move-object/from16 v2, p2

    .line 258
    .line 259
    check-cast v2, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v12}, La/x8x;->L(I)I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    invoke-static {v13, v0, v1, v2}, La/ep20;->a(La/mm40;La/wls;La/fet;I)V

    .line 269
    .line 270
    .line 271
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_6
    check-cast v0, La/m97;

    .line 275
    .line 276
    check-cast v13, La/m97;

    .line 277
    .line 278
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, La/oyg0;

    .line 281
    .line 282
    move-object/from16 v14, p2

    .line 283
    .line 284
    check-cast v14, La/b820;

    .line 285
    .line 286
    iget-object v1, v14, La/b820;->a:La/ly6;

    .line 287
    .line 288
    iget-object v2, v1, La/ly6;->d:La/jur;

    .line 289
    .line 290
    iget-object v0, v0, La/m97;->m:Ljava/lang/String;

    .line 291
    .line 292
    iget-object v3, v13, La/m97;->m:Ljava/lang/String;

    .line 293
    .line 294
    sget-object v4, La/czc;->d:La/czc;

    .line 295
    .line 296
    invoke-static {v0, v3, v4}, La/nn20;->Y(Ljava/lang/String;Ljava/lang/String;La/czc;)La/j43;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    const/16 v3, 0x1b

    .line 301
    .line 302
    invoke-static {v2, v0, v11, v3}, La/jur;->a(La/jur;La/j43;La/wbs0;I)La/jur;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    const/4 v5, 0x0

    .line 307
    const/16 v6, 0x57

    .line 308
    .line 309
    const/4 v2, 0x0

    .line 310
    const/4 v4, 0x0

    .line 311
    invoke-static/range {v1 .. v6}, La/ly6;->a(La/ly6;La/htv;La/jur;La/f0d;La/g680;I)La/ly6;

    .line 312
    .line 313
    .line 314
    move-result-object v15

    .line 315
    const/16 v26, 0x0

    .line 316
    .line 317
    const/16 v27, 0x1ffe

    .line 318
    .line 319
    const/16 v16, 0x0

    .line 320
    .line 321
    const/16 v17, 0x0

    .line 322
    .line 323
    const/16 v18, 0x0

    .line 324
    .line 325
    const/16 v19, 0x0

    .line 326
    .line 327
    const/16 v20, 0x0

    .line 328
    .line 329
    const/16 v21, 0x0

    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    const/16 v23, 0x0

    .line 334
    .line 335
    const/16 v24, 0x0

    .line 336
    .line 337
    const/16 v25, 0x0

    .line 338
    .line 339
    invoke-static/range {v14 .. v27}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    :pswitch_7
    check-cast v0, La/on20;

    .line 345
    .line 346
    check-cast v13, La/q4f;

    .line 347
    .line 348
    move-object/from16 v1, p1

    .line 349
    .line 350
    check-cast v1, La/oyg0;

    .line 351
    .line 352
    move-object/from16 v14, p2

    .line 353
    .line 354
    check-cast v14, La/a820;

    .line 355
    .line 356
    iget-object v1, v14, La/a820;->b:La/txe;

    .line 357
    .line 358
    sget v2, La/on20;->m1:I

    .line 359
    .line 360
    invoke-virtual {v0}, La/on20;->c0()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    iget-object v0, v14, La/a820;->b:La/txe;

    .line 365
    .line 366
    iget-object v0, v0, La/txe;->d:La/m0d;

    .line 367
    .line 368
    sget-object v5, La/q4f;->g:La/q4f;

    .line 369
    .line 370
    sget-object v6, La/q4f;->f:La/q4f;

    .line 371
    .line 372
    sget-object v7, La/q4f;->h:La/q4f;

    .line 373
    .line 374
    sget-object v8, La/q4f;->j:La/q4f;

    .line 375
    .line 376
    sget-object v9, La/q4f;->k:La/q4f;

    .line 377
    .line 378
    sget-object v10, La/q4f;->m:La/q4f;

    .line 379
    .line 380
    filled-new-array/range {v5 .. v10}, [La/q4f;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-interface {v2, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    if-nez v2, :cond_0

    .line 393
    .line 394
    sget-object v2, La/o0d;->b:La/o0d;

    .line 395
    .line 396
    goto :goto_0

    .line 397
    :cond_0
    sget-object v2, La/o0d;->a:La/o0d;

    .line 398
    .line 399
    :goto_0
    const/16 v3, 0x3f

    .line 400
    .line 401
    invoke-static {v0, v11, v2, v3}, La/m0d;->a(La/m0d;La/azc;La/o0d;I)La/m0d;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    const/4 v9, 0x0

    .line 406
    const/16 v10, 0x75

    .line 407
    .line 408
    const-wide/16 v2, 0x0

    .line 409
    .line 410
    const/4 v5, 0x0

    .line 411
    const/4 v7, 0x0

    .line 412
    const/4 v8, 0x0

    .line 413
    invoke-static/range {v1 .. v10}, La/txe;->a(La/txe;JILa/gao0;La/m0d;Ljava/lang/String;ZLa/h680;I)La/txe;

    .line 414
    .line 415
    .line 416
    move-result-object v15

    .line 417
    const/16 v30, 0x0

    .line 418
    .line 419
    const v31, 0x3fdfd

    .line 420
    .line 421
    .line 422
    const/16 v16, 0x0

    .line 423
    .line 424
    const/16 v17, 0x0

    .line 425
    .line 426
    const/16 v18, 0x0

    .line 427
    .line 428
    const/16 v19, 0x0

    .line 429
    .line 430
    const/16 v20, 0x0

    .line 431
    .line 432
    const/16 v21, 0x0

    .line 433
    .line 434
    const/16 v22, 0x0

    .line 435
    .line 436
    const/16 v24, 0x0

    .line 437
    .line 438
    const/16 v25, 0x0

    .line 439
    .line 440
    const/16 v26, 0x0

    .line 441
    .line 442
    const/16 v27, 0x0

    .line 443
    .line 444
    const/16 v28, 0x0

    .line 445
    .line 446
    const/16 v29, 0x0

    .line 447
    .line 448
    move-object/from16 v23, v13

    .line 449
    .line 450
    invoke-static/range {v14 .. v31}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    return-object v0

    .line 455
    :pswitch_8
    check-cast v0, La/on20;

    .line 456
    .line 457
    check-cast v13, La/en7;

    .line 458
    .line 459
    move-object/from16 v1, p1

    .line 460
    .line 461
    check-cast v1, La/oyg0;

    .line 462
    .line 463
    move-object/from16 v14, p2

    .line 464
    .line 465
    check-cast v14, La/a820;

    .line 466
    .line 467
    iget-object v15, v14, La/a820;->b:La/txe;

    .line 468
    .line 469
    sget v1, La/on20;->m1:I

    .line 470
    .line 471
    iget-object v1, v0, La/on20;->b0:La/j9c;

    .line 472
    .line 473
    invoke-virtual {v1}, La/j9c;->a()La/q4f;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    sget-object v2, La/q4f;->g:La/q4f;

    .line 478
    .line 479
    if-ne v1, v2, :cond_1

    .line 480
    .line 481
    iget-object v0, v0, La/on20;->Z:La/hst;

    .line 482
    .line 483
    invoke-virtual {v0}, La/hst;->a()I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-gt v0, v10, :cond_2

    .line 488
    .line 489
    :cond_1
    sget-object v0, La/q4f;->e:La/q4f;

    .line 490
    .line 491
    if-ne v1, v0, :cond_4

    .line 492
    .line 493
    :cond_2
    iget v0, v13, La/en7;->a:I

    .line 494
    .line 495
    if-nez v0, :cond_3

    .line 496
    .line 497
    iget v0, v13, La/en7;->c:I

    .line 498
    .line 499
    if-nez v0, :cond_3

    .line 500
    .line 501
    sget-object v0, La/eao0;->a:La/eao0;

    .line 502
    .line 503
    :goto_1
    move-object/from16 v19, v0

    .line 504
    .line 505
    goto :goto_2

    .line 506
    :cond_3
    new-instance v0, La/fao0;

    .line 507
    .line 508
    invoke-direct {v0, v13}, La/fao0;-><init>(La/en7;)V

    .line 509
    .line 510
    .line 511
    goto :goto_1

    .line 512
    :cond_4
    sget-object v0, La/dao0;->a:La/dao0;

    .line 513
    .line 514
    goto :goto_1

    .line 515
    :goto_2
    const/16 v23, 0x0

    .line 516
    .line 517
    const/16 v24, 0x7b

    .line 518
    .line 519
    const-wide/16 v16, 0x0

    .line 520
    .line 521
    const/16 v18, 0x0

    .line 522
    .line 523
    const/16 v20, 0x0

    .line 524
    .line 525
    const/16 v21, 0x0

    .line 526
    .line 527
    const/16 v22, 0x0

    .line 528
    .line 529
    invoke-static/range {v15 .. v24}, La/txe;->a(La/txe;JILa/gao0;La/m0d;Ljava/lang/String;ZLa/h680;I)La/txe;

    .line 530
    .line 531
    .line 532
    move-result-object v15

    .line 533
    const/16 v30, 0x0

    .line 534
    .line 535
    const v31, 0x3fffd

    .line 536
    .line 537
    .line 538
    const/16 v16, 0x0

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/16 v18, 0x0

    .line 543
    .line 544
    const/16 v19, 0x0

    .line 545
    .line 546
    const/16 v24, 0x0

    .line 547
    .line 548
    const/16 v25, 0x0

    .line 549
    .line 550
    const/16 v26, 0x0

    .line 551
    .line 552
    const/16 v27, 0x0

    .line 553
    .line 554
    const/16 v28, 0x0

    .line 555
    .line 556
    const/16 v29, 0x0

    .line 557
    .line 558
    invoke-static/range {v14 .. v31}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    return-object v0

    .line 563
    :pswitch_9
    check-cast v0, La/hnd0;

    .line 564
    .line 565
    check-cast v13, La/ql5;

    .line 566
    .line 567
    move-object/from16 v1, p1

    .line 568
    .line 569
    check-cast v1, La/oyg0;

    .line 570
    .line 571
    move-object/from16 v14, p2

    .line 572
    .line 573
    check-cast v14, La/b820;

    .line 574
    .line 575
    iget-object v1, v14, La/b820;->d:La/rvj0;

    .line 576
    .line 577
    iget-object v2, v1, La/rvj0;->d:La/mnd0;

    .line 578
    .line 579
    iget-wide v4, v0, La/hnd0;->b:D

    .line 580
    .line 581
    iget-wide v6, v0, La/hnd0;->c:D

    .line 582
    .line 583
    iget-wide v8, v0, La/hnd0;->d:D

    .line 584
    .line 585
    iget-object v10, v13, La/ql5;->f:Ljava/lang/String;

    .line 586
    .line 587
    const/16 v11, 0x21

    .line 588
    .line 589
    const/4 v3, 0x0

    .line 590
    invoke-static/range {v2 .. v11}, La/mnd0;->a(La/mnd0;ZDDDLjava/lang/String;I)La/mnd0;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    const/4 v6, 0x0

    .line 595
    const/16 v7, 0x17

    .line 596
    .line 597
    const/4 v2, 0x0

    .line 598
    const/4 v3, 0x0

    .line 599
    const/4 v4, 0x0

    .line 600
    invoke-static/range {v1 .. v7}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 601
    .line 602
    .line 603
    move-result-object v18

    .line 604
    const/16 v26, 0x0

    .line 605
    .line 606
    const/16 v27, 0x1ff7

    .line 607
    .line 608
    const/4 v15, 0x0

    .line 609
    const/16 v16, 0x0

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    const/16 v19, 0x0

    .line 614
    .line 615
    const/16 v20, 0x0

    .line 616
    .line 617
    const/16 v21, 0x0

    .line 618
    .line 619
    const/16 v22, 0x0

    .line 620
    .line 621
    const/16 v23, 0x0

    .line 622
    .line 623
    const/16 v24, 0x0

    .line 624
    .line 625
    const/16 v25, 0x0

    .line 626
    .line 627
    invoke-static/range {v14 .. v27}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    return-object v0

    .line 632
    :pswitch_a
    check-cast v0, La/on20;

    .line 633
    .line 634
    check-cast v13, Ljava/lang/String;

    .line 635
    .line 636
    move-object/from16 v1, p1

    .line 637
    .line 638
    check-cast v1, La/oyg0;

    .line 639
    .line 640
    move-object/from16 v14, p2

    .line 641
    .line 642
    check-cast v14, La/a820;

    .line 643
    .line 644
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-object v2, v14, La/a820;->e:La/pvj0;

    .line 651
    .line 652
    invoke-virtual {v0}, La/on20;->r0()Z

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    iget-object v3, v2, La/pvj0;->a:La/bx6;

    .line 657
    .line 658
    iget-object v3, v3, La/bx6;->b:La/tw6;

    .line 659
    .line 660
    iget-boolean v3, v3, La/tw6;->p:Z

    .line 661
    .line 662
    invoke-virtual {v0, v3, v11}, La/on20;->h0(ZLjava/lang/Double;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-static {v0, v13, v1}, La/knb0;->a(Ljava/lang/String;Ljava/lang/String;Z)La/knb0;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    const/4 v8, 0x0

    .line 671
    const/16 v9, 0x3d

    .line 672
    .line 673
    const/4 v3, 0x0

    .line 674
    const/4 v5, 0x0

    .line 675
    const/4 v6, 0x0

    .line 676
    const/4 v7, 0x0

    .line 677
    invoke-static/range {v2 .. v9}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 678
    .line 679
    .line 680
    move-result-object v18

    .line 681
    const/16 v30, 0x0

    .line 682
    .line 683
    const v31, 0x3ffef

    .line 684
    .line 685
    .line 686
    const/4 v15, 0x0

    .line 687
    const/16 v16, 0x0

    .line 688
    .line 689
    const/16 v17, 0x0

    .line 690
    .line 691
    const/16 v19, 0x0

    .line 692
    .line 693
    const/16 v20, 0x0

    .line 694
    .line 695
    const/16 v21, 0x0

    .line 696
    .line 697
    const/16 v22, 0x0

    .line 698
    .line 699
    const/16 v23, 0x0

    .line 700
    .line 701
    const/16 v24, 0x0

    .line 702
    .line 703
    const/16 v25, 0x0

    .line 704
    .line 705
    const/16 v26, 0x0

    .line 706
    .line 707
    const/16 v27, 0x0

    .line 708
    .line 709
    const/16 v28, 0x0

    .line 710
    .line 711
    const/16 v29, 0x0

    .line 712
    .line 713
    invoke-static/range {v14 .. v31}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    return-object v0

    .line 718
    :pswitch_b
    move-object v1, v0

    .line 719
    check-cast v1, La/gx4;

    .line 720
    .line 721
    check-cast v13, La/a8q0;

    .line 722
    .line 723
    move-object/from16 v0, p1

    .line 724
    .line 725
    check-cast v0, La/oyg0;

    .line 726
    .line 727
    move-object/from16 v14, p2

    .line 728
    .line 729
    check-cast v14, La/b820;

    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    iget-object v0, v1, La/gx4;->c:La/dx6;

    .line 738
    .line 739
    invoke-static {v0, v13, v11, v10}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 740
    .line 741
    .line 742
    move-result-object v4

    .line 743
    const/4 v6, 0x0

    .line 744
    const/16 v7, 0x1b

    .line 745
    .line 746
    const/4 v2, 0x0

    .line 747
    const/4 v3, 0x0

    .line 748
    const/4 v5, 0x0

    .line 749
    invoke-static/range {v1 .. v7}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 750
    .line 751
    .line 752
    move-result-object v20

    .line 753
    const/16 v26, 0x0

    .line 754
    .line 755
    const/16 v27, 0x1fdf

    .line 756
    .line 757
    const/4 v15, 0x0

    .line 758
    const/16 v16, 0x0

    .line 759
    .line 760
    const/16 v17, 0x0

    .line 761
    .line 762
    const/16 v18, 0x0

    .line 763
    .line 764
    const/16 v19, 0x0

    .line 765
    .line 766
    const/16 v21, 0x0

    .line 767
    .line 768
    const/16 v22, 0x0

    .line 769
    .line 770
    const/16 v23, 0x0

    .line 771
    .line 772
    const/16 v24, 0x0

    .line 773
    .line 774
    const/16 v25, 0x0

    .line 775
    .line 776
    invoke-static/range {v14 .. v27}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    return-object v0

    .line 781
    :pswitch_c
    move-object v1, v0

    .line 782
    check-cast v1, La/gx4;

    .line 783
    .line 784
    check-cast v13, Ljava/lang/String;

    .line 785
    .line 786
    move-object/from16 v0, p1

    .line 787
    .line 788
    check-cast v0, La/oyg0;

    .line 789
    .line 790
    move-object/from16 v14, p2

    .line 791
    .line 792
    check-cast v14, La/b820;

    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    iget-object v0, v1, La/gx4;->e:La/mnb0;

    .line 801
    .line 802
    invoke-static {v0, v12, v11, v13, v10}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    const/16 v7, 0xf

    .line 807
    .line 808
    const/4 v2, 0x0

    .line 809
    const/4 v3, 0x0

    .line 810
    const/4 v4, 0x0

    .line 811
    const/4 v5, 0x0

    .line 812
    invoke-static/range {v1 .. v7}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 813
    .line 814
    .line 815
    move-result-object v20

    .line 816
    const/16 v26, 0x0

    .line 817
    .line 818
    const/16 v27, 0x1fdf

    .line 819
    .line 820
    const/4 v15, 0x0

    .line 821
    const/16 v16, 0x0

    .line 822
    .line 823
    const/16 v17, 0x0

    .line 824
    .line 825
    const/16 v18, 0x0

    .line 826
    .line 827
    const/16 v19, 0x0

    .line 828
    .line 829
    const/16 v21, 0x0

    .line 830
    .line 831
    const/16 v22, 0x0

    .line 832
    .line 833
    const/16 v23, 0x0

    .line 834
    .line 835
    const/16 v24, 0x0

    .line 836
    .line 837
    const/16 v25, 0x0

    .line 838
    .line 839
    invoke-static/range {v14 .. v27}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    return-object v0

    .line 844
    :pswitch_d
    move-object v1, v0

    .line 845
    check-cast v1, La/nn20;

    .line 846
    .line 847
    check-cast v13, Ljava/lang/Throwable;

    .line 848
    .line 849
    move-object/from16 v0, p1

    .line 850
    .line 851
    check-cast v0, Ljava/lang/Throwable;

    .line 852
    .line 853
    move-object/from16 v16, p2

    .line 854
    .line 855
    check-cast v16, Ljava/lang/String;

    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    instance-of v0, v13, La/zhi0;

    .line 867
    .line 868
    if-eqz v0, :cond_6

    .line 869
    .line 870
    check-cast v13, La/zhi0;

    .line 871
    .line 872
    iget-object v0, v13, La/zhi0;->c:La/kuw;

    .line 873
    .line 874
    sget-object v2, La/i2o;->n:La/i2o;

    .line 875
    .line 876
    if-eq v0, v2, :cond_5

    .line 877
    .line 878
    sget-object v2, La/i2o;->A:La/i2o;

    .line 879
    .line 880
    if-eq v0, v2, :cond_5

    .line 881
    .line 882
    sget-object v2, La/i2o;->B:La/i2o;

    .line 883
    .line 884
    if-ne v0, v2, :cond_6

    .line 885
    .line 886
    :cond_5
    new-instance v0, La/qc20;

    .line 887
    .line 888
    new-instance v14, La/xdk0;

    .line 889
    .line 890
    sget-object v15, La/pek0;->a:La/pek0;

    .line 891
    .line 892
    const/16 v20, 0x0

    .line 893
    .line 894
    const/16 v21, 0x7c

    .line 895
    .line 896
    const/16 v17, 0x0

    .line 897
    .line 898
    const/16 v18, 0x0

    .line 899
    .line 900
    const/16 v19, 0x0

    .line 901
    .line 902
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 903
    .line 904
    .line 905
    invoke-direct {v0, v14}, La/qc20;-><init>(La/xdk0;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    :cond_6
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 912
    .line 913
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 914
    .line 915
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 923
    .line 924
    move-object v12, v0

    .line 925
    check-cast v12, La/b820;

    .line 926
    .line 927
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    iget-object v3, v12, La/b820;->c:La/an5;

    .line 931
    .line 932
    sget-object v4, La/e40;->d:La/e40;

    .line 933
    .line 934
    new-instance v5, La/g40;

    .line 935
    .line 936
    invoke-direct {v5, v6, v7, v4}, La/g40;-><init>(DLa/e40;)V

    .line 937
    .line 938
    .line 939
    invoke-static {v3, v5}, La/an5;->a(La/an5;La/g40;)La/an5;

    .line 940
    .line 941
    .line 942
    move-result-object v15

    .line 943
    const/16 v24, 0x0

    .line 944
    .line 945
    const/16 v25, 0x1ffb

    .line 946
    .line 947
    const/4 v13, 0x0

    .line 948
    const/4 v14, 0x0

    .line 949
    const/16 v16, 0x0

    .line 950
    .line 951
    const/16 v17, 0x0

    .line 952
    .line 953
    const/16 v18, 0x0

    .line 954
    .line 955
    const/16 v19, 0x0

    .line 956
    .line 957
    const/16 v20, 0x0

    .line 958
    .line 959
    const/16 v21, 0x0

    .line 960
    .line 961
    const/16 v22, 0x0

    .line 962
    .line 963
    const/16 v23, 0x0

    .line 964
    .line 965
    invoke-static/range {v12 .. v25}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 966
    .line 967
    .line 968
    move-result-object v3

    .line 969
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v0

    .line 973
    if-eqz v0, :cond_7

    .line 974
    .line 975
    iget-object v0, v1, La/nn20;->T0:La/bby;

    .line 976
    .line 977
    if-eqz v0, :cond_8

    .line 978
    .line 979
    invoke-interface {v0, v11}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 980
    .line 981
    .line 982
    :cond_8
    new-instance v0, La/mj20;

    .line 983
    .line 984
    invoke-direct {v0, v1, v11, v9}, La/mj20;-><init>(La/nn20;La/yje;B)V

    .line 985
    .line 986
    .line 987
    invoke-static {v1, v11, v11, v0, v8}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    iput-object v0, v1, La/nn20;->T0:La/bby;

    .line 992
    .line 993
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 994
    .line 995
    return-object v0

    .line 996
    :pswitch_e
    check-cast v0, La/on20;

    .line 997
    .line 998
    check-cast v13, Ljava/lang/Throwable;

    .line 999
    .line 1000
    move-object/from16 v1, p1

    .line 1001
    .line 1002
    check-cast v1, Ljava/lang/Throwable;

    .line 1003
    .line 1004
    move-object/from16 v16, p2

    .line 1005
    .line 1006
    check-cast v16, Ljava/lang/String;

    .line 1007
    .line 1008
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    instance-of v1, v13, La/zhi0;

    .line 1018
    .line 1019
    if-eqz v1, :cond_a

    .line 1020
    .line 1021
    check-cast v13, La/zhi0;

    .line 1022
    .line 1023
    iget-object v1, v13, La/zhi0;->c:La/kuw;

    .line 1024
    .line 1025
    sget-object v2, La/i2o;->n:La/i2o;

    .line 1026
    .line 1027
    if-eq v1, v2, :cond_9

    .line 1028
    .line 1029
    sget-object v2, La/i2o;->A:La/i2o;

    .line 1030
    .line 1031
    if-eq v1, v2, :cond_9

    .line 1032
    .line 1033
    sget-object v2, La/i2o;->B:La/i2o;

    .line 1034
    .line 1035
    if-ne v1, v2, :cond_a

    .line 1036
    .line 1037
    :cond_9
    new-instance v1, La/pc20;

    .line 1038
    .line 1039
    new-instance v14, La/xdk0;

    .line 1040
    .line 1041
    sget-object v15, La/pek0;->a:La/pek0;

    .line 1042
    .line 1043
    const/16 v20, 0x0

    .line 1044
    .line 1045
    const/16 v21, 0x7c

    .line 1046
    .line 1047
    const/16 v17, 0x0

    .line 1048
    .line 1049
    const/16 v18, 0x0

    .line 1050
    .line 1051
    const/16 v19, 0x0

    .line 1052
    .line 1053
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-direct {v1, v14}, La/pc20;-><init>(La/xdk0;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1060
    .line 1061
    .line 1062
    :cond_a
    new-instance v1, La/fd20;

    .line 1063
    .line 1064
    const/16 v2, 0x15

    .line 1065
    .line 1066
    invoke-direct {v1, v2}, La/fd20;-><init>(B)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1070
    .line 1071
    .line 1072
    iget-object v1, v0, La/on20;->g1:La/bby;

    .line 1073
    .line 1074
    if-eqz v1, :cond_b

    .line 1075
    .line 1076
    invoke-interface {v1, v11}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1077
    .line 1078
    .line 1079
    :cond_b
    new-instance v1, La/hj20;

    .line 1080
    .line 1081
    invoke-direct {v1, v0, v11, v12}, La/hj20;-><init>(La/on20;La/yje;B)V

    .line 1082
    .line 1083
    .line 1084
    invoke-static {v0, v11, v11, v1, v8}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    iput-object v1, v0, La/on20;->g1:La/bby;

    .line 1089
    .line 1090
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1091
    .line 1092
    return-object v0

    .line 1093
    :pswitch_f
    check-cast v0, La/cit0;

    .line 1094
    .line 1095
    check-cast v13, La/nn20;

    .line 1096
    .line 1097
    move-object/from16 v1, p1

    .line 1098
    .line 1099
    check-cast v1, La/oyg0;

    .line 1100
    .line 1101
    move-object/from16 v14, p2

    .line 1102
    .line 1103
    check-cast v14, La/b820;

    .line 1104
    .line 1105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1109
    .line 1110
    .line 1111
    iget-object v15, v14, La/b820;->f:La/gx4;

    .line 1112
    .line 1113
    if-eqz v15, :cond_f

    .line 1114
    .line 1115
    iget-object v1, v15, La/gx4;->c:La/dx6;

    .line 1116
    .line 1117
    iget-object v2, v1, La/dx6;->b:La/vw6;

    .line 1118
    .line 1119
    iget-wide v3, v0, La/cit0;->C:D

    .line 1120
    .line 1121
    move-wide/from16 v16, v6

    .line 1122
    .line 1123
    iget-wide v6, v0, La/cit0;->F:D

    .line 1124
    .line 1125
    iget-wide v9, v0, La/cit0;->E:D

    .line 1126
    .line 1127
    iget-boolean v5, v0, La/cit0;->M:Z

    .line 1128
    .line 1129
    const-wide v18, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    if-eqz v5, :cond_c

    .line 1135
    .line 1136
    move-wide/from16 v25, v18

    .line 1137
    .line 1138
    goto :goto_3

    .line 1139
    :cond_c
    move-wide/from16 v25, v6

    .line 1140
    .line 1141
    :goto_3
    iget-object v8, v14, La/b820;->c:La/an5;

    .line 1142
    .line 1143
    iget-object v8, v8, La/an5;->c:La/ql5;

    .line 1144
    .line 1145
    iget-object v8, v8, La/ql5;->f:Ljava/lang/String;

    .line 1146
    .line 1147
    if-eqz v5, :cond_d

    .line 1148
    .line 1149
    move-wide/from16 v6, v18

    .line 1150
    .line 1151
    :cond_d
    iget-object v13, v13, La/nn20;->G:La/zlt0;

    .line 1152
    .line 1153
    invoke-virtual {v13}, La/zlt0;->j()Z

    .line 1154
    .line 1155
    .line 1156
    move-result v13

    .line 1157
    new-instance v11, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 1158
    .line 1159
    invoke-direct {v11, v6, v7, v13}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 1160
    .line 1161
    .line 1162
    iget-wide v6, v0, La/cit0;->C:D

    .line 1163
    .line 1164
    cmpg-double v0, v6, v16

    .line 1165
    .line 1166
    if-nez v0, :cond_e

    .line 1167
    .line 1168
    move v0, v12

    .line 1169
    goto :goto_4

    .line 1170
    :cond_e
    const/4 v0, 0x0

    .line 1171
    :goto_4
    xor-int/lit8 v31, v0, 0x1

    .line 1172
    .line 1173
    const/16 v34, 0x0

    .line 1174
    .line 1175
    const v35, 0xc083

    .line 1176
    .line 1177
    .line 1178
    const-wide/16 v17, 0x0

    .line 1179
    .line 1180
    const-wide/16 v19, 0x0

    .line 1181
    .line 1182
    const/16 v29, 0x0

    .line 1183
    .line 1184
    const/16 v32, 0x0

    .line 1185
    .line 1186
    const/16 v33, 0x0

    .line 1187
    .line 1188
    move-object/from16 v16, v2

    .line 1189
    .line 1190
    move-wide/from16 v21, v3

    .line 1191
    .line 1192
    move/from16 v28, v5

    .line 1193
    .line 1194
    move-object/from16 v27, v8

    .line 1195
    .line 1196
    move-wide/from16 v23, v9

    .line 1197
    .line 1198
    move-object/from16 v30, v11

    .line 1199
    .line 1200
    invoke-static/range {v16 .. v35}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    const/4 v2, 0x0

    .line 1205
    invoke-static {v1, v2, v0, v12}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v18

    .line 1209
    const/16 v20, 0x0

    .line 1210
    .line 1211
    const/16 v21, 0x1b

    .line 1212
    .line 1213
    const/16 v16, 0x0

    .line 1214
    .line 1215
    const/16 v17, 0x0

    .line 1216
    .line 1217
    const/16 v19, 0x0

    .line 1218
    .line 1219
    invoke-static/range {v15 .. v21}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v11

    .line 1223
    move-object/from16 v20, v11

    .line 1224
    .line 1225
    goto :goto_5

    .line 1226
    :cond_f
    const/16 v20, 0x0

    .line 1227
    .line 1228
    :goto_5
    const/16 v26, 0x0

    .line 1229
    .line 1230
    const/16 v27, 0x1fdf

    .line 1231
    .line 1232
    const/4 v15, 0x0

    .line 1233
    const/16 v16, 0x0

    .line 1234
    .line 1235
    const/16 v17, 0x0

    .line 1236
    .line 1237
    const/16 v18, 0x0

    .line 1238
    .line 1239
    const/16 v19, 0x0

    .line 1240
    .line 1241
    const/16 v21, 0x0

    .line 1242
    .line 1243
    const/16 v22, 0x0

    .line 1244
    .line 1245
    const/16 v23, 0x0

    .line 1246
    .line 1247
    const/16 v24, 0x0

    .line 1248
    .line 1249
    const/16 v25, 0x0

    .line 1250
    .line 1251
    invoke-static/range {v14 .. v27}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    return-object v0

    .line 1256
    :pswitch_10
    check-cast v0, La/f120;

    .line 1257
    .line 1258
    check-cast v13, Ljava/lang/Throwable;

    .line 1259
    .line 1260
    move-object/from16 v1, p1

    .line 1261
    .line 1262
    check-cast v1, Ljava/lang/Throwable;

    .line 1263
    .line 1264
    move-object/from16 v2, p2

    .line 1265
    .line 1266
    check-cast v2, Ljava/lang/String;

    .line 1267
    .line 1268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1272
    .line 1273
    .line 1274
    new-instance v1, La/yr0;

    .line 1275
    .line 1276
    invoke-direct {v1, v13, v5}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1280
    .line 1281
    .line 1282
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1283
    .line 1284
    return-object v0

    .line 1285
    :pswitch_11
    check-cast v13, La/mm40;

    .line 1286
    .line 1287
    check-cast v0, La/eb10;

    .line 1288
    .line 1289
    move-object/from16 v1, p1

    .line 1290
    .line 1291
    check-cast v1, La/fet;

    .line 1292
    .line 1293
    move-object/from16 v2, p2

    .line 1294
    .line 1295
    check-cast v2, Ljava/lang/Integer;

    .line 1296
    .line 1297
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1298
    .line 1299
    .line 1300
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1301
    .line 1302
    .line 1303
    move-result v2

    .line 1304
    invoke-static {v13, v0, v1, v2}, La/q7x;->d(La/mm40;La/eb10;La/fet;I)V

    .line 1305
    .line 1306
    .line 1307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1308
    .line 1309
    return-object v0

    .line 1310
    :pswitch_12
    check-cast v0, La/nv10;

    .line 1311
    .line 1312
    check-cast v13, La/qv10;

    .line 1313
    .line 1314
    move-object/from16 v1, p1

    .line 1315
    .line 1316
    check-cast v1, La/fet;

    .line 1317
    .line 1318
    move-object/from16 v2, p2

    .line 1319
    .line 1320
    check-cast v2, Ljava/lang/Integer;

    .line 1321
    .line 1322
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1323
    .line 1324
    .line 1325
    move-result v2

    .line 1326
    sget-object v3, La/qv10;->O1:La/htz;

    .line 1327
    .line 1328
    and-int/lit8 v3, v2, 0x3

    .line 1329
    .line 1330
    if-eq v3, v10, :cond_10

    .line 1331
    .line 1332
    move v8, v12

    .line 1333
    goto :goto_6

    .line 1334
    :cond_10
    const/4 v8, 0x0

    .line 1335
    :goto_6
    and-int/2addr v2, v12

    .line 1336
    invoke-virtual {v1, v2, v8}, La/fet;->U(IZ)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v2

    .line 1340
    if-eqz v2, :cond_13

    .line 1341
    .line 1342
    invoke-virtual {v1, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v2

    .line 1346
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v3

    .line 1350
    if-nez v2, :cond_11

    .line 1351
    .line 1352
    if-ne v3, v4, :cond_12

    .line 1353
    .line 1354
    :cond_11
    new-instance v3, La/mv10;

    .line 1355
    .line 1356
    invoke-direct {v3, v13, v12}, La/mv10;-><init>(La/qv10;B)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1360
    .line 1361
    .line 1362
    :cond_12
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 1363
    .line 1364
    const/4 v8, 0x0

    .line 1365
    invoke-static {v0, v3, v1, v8}, La/m7x;->d(La/nv10;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_7

    .line 1369
    :cond_13
    invoke-virtual {v1}, La/fet;->X()V

    .line 1370
    .line 1371
    .line 1372
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1373
    .line 1374
    return-object v0

    .line 1375
    :pswitch_13
    check-cast v0, La/nv10;

    .line 1376
    .line 1377
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 1378
    .line 1379
    move-object/from16 v1, p1

    .line 1380
    .line 1381
    check-cast v1, La/fet;

    .line 1382
    .line 1383
    move-object/from16 v2, p2

    .line 1384
    .line 1385
    check-cast v2, Ljava/lang/Integer;

    .line 1386
    .line 1387
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1388
    .line 1389
    .line 1390
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1391
    .line 1392
    .line 1393
    move-result v2

    .line 1394
    invoke-static {v0, v13, v1, v2}, La/m7x;->d(La/nv10;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1395
    .line 1396
    .line 1397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1398
    .line 1399
    return-object v0

    .line 1400
    :pswitch_14
    check-cast v0, La/yr10;

    .line 1401
    .line 1402
    check-cast v13, Landroidx/viewpager2/widget/ViewPager2;

    .line 1403
    .line 1404
    move-object/from16 v1, p1

    .line 1405
    .line 1406
    check-cast v1, La/fet;

    .line 1407
    .line 1408
    move-object/from16 v2, p2

    .line 1409
    .line 1410
    check-cast v2, Ljava/lang/Integer;

    .line 1411
    .line 1412
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1413
    .line 1414
    .line 1415
    move-result v2

    .line 1416
    sget-object v6, La/yr10;->R1:La/wsz;

    .line 1417
    .line 1418
    and-int/lit8 v6, v2, 0x3

    .line 1419
    .line 1420
    if-eq v6, v10, :cond_14

    .line 1421
    .line 1422
    move v6, v12

    .line 1423
    goto :goto_8

    .line 1424
    :cond_14
    const/4 v6, 0x0

    .line 1425
    :goto_8
    and-int/2addr v2, v12

    .line 1426
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 1427
    .line 1428
    .line 1429
    move-result v2

    .line 1430
    if-eqz v2, :cond_1b

    .line 1431
    .line 1432
    iget-object v2, v0, La/yr10;->M1:La/kiu0;

    .line 1433
    .line 1434
    invoke-virtual {v2}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v2

    .line 1438
    check-cast v2, La/ds10;

    .line 1439
    .line 1440
    iget-object v2, v2, La/ds10;->e:La/p7m0;

    .line 1441
    .line 1442
    invoke-static {v2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v2

    .line 1446
    const/4 v6, 0x0

    .line 1447
    const/4 v8, 0x0

    .line 1448
    invoke-static {v2, v6, v1, v8, v3}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v3

    .line 1456
    check-cast v3, La/ru9;

    .line 1457
    .line 1458
    iget v3, v3, La/ru9;->c:I

    .line 1459
    .line 1460
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    invoke-virtual {v1, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v6

    .line 1468
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v7

    .line 1472
    or-int/2addr v6, v7

    .line 1473
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v7

    .line 1477
    if-nez v6, :cond_15

    .line 1478
    .line 1479
    if-ne v7, v4, :cond_16

    .line 1480
    .line 1481
    :cond_15
    new-instance v7, La/xr10;

    .line 1482
    .line 1483
    const/4 v6, 0x0

    .line 1484
    const/4 v8, 0x0

    .line 1485
    invoke-direct {v7, v13, v2, v6, v8}, La/xr10;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1489
    .line 1490
    .line 1491
    :cond_16
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 1492
    .line 1493
    invoke-static {v1, v3, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1494
    .line 1495
    .line 1496
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1497
    .line 1498
    const/high16 v3, 0x41000000    # 8.0f

    .line 1499
    .line 1500
    const/high16 v6, 0x41400000    # 12.0f

    .line 1501
    .line 1502
    sget-object v7, La/jm40;->b:La/jm40;

    .line 1503
    .line 1504
    invoke-static {v7, v6, v3}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v14

    .line 1508
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v3

    .line 1512
    check-cast v3, La/ru9;

    .line 1513
    .line 1514
    iget-object v15, v3, La/ru9;->a:La/a4x;

    .line 1515
    .line 1516
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v3

    .line 1520
    check-cast v3, La/ru9;

    .line 1521
    .line 1522
    iget-object v3, v3, La/ru9;->b:La/dxh0;

    .line 1523
    .line 1524
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1525
    .line 1526
    .line 1527
    move-result v6

    .line 1528
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v7

    .line 1532
    if-nez v6, :cond_17

    .line 1533
    .line 1534
    if-ne v7, v4, :cond_18

    .line 1535
    .line 1536
    :cond_17
    new-instance v7, La/rip;

    .line 1537
    .line 1538
    const/16 v6, 0xb

    .line 1539
    .line 1540
    invoke-direct {v7, v2, v6}, La/rip;-><init>(La/pz40;B)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1544
    .line 1545
    .line 1546
    :cond_18
    move-object/from16 v19, v7

    .line 1547
    .line 1548
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 1549
    .line 1550
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v2

    .line 1554
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v6

    .line 1558
    if-nez v2, :cond_19

    .line 1559
    .line 1560
    if-ne v6, v4, :cond_1a

    .line 1561
    .line 1562
    :cond_19
    new-instance v6, La/km00;

    .line 1563
    .line 1564
    invoke-direct {v6, v0, v5}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1568
    .line 1569
    .line 1570
    :cond_1a
    move-object/from16 v20, v6

    .line 1571
    .line 1572
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 1573
    .line 1574
    const/16 v22, 0x180

    .line 1575
    .line 1576
    const/16 v23, 0x10

    .line 1577
    .line 1578
    sget-object v16, La/gxh0;->a:La/gxh0;

    .line 1579
    .line 1580
    const/16 v18, 0x0

    .line 1581
    .line 1582
    move-object/from16 v21, v1

    .line 1583
    .line 1584
    move-object/from16 v17, v3

    .line 1585
    .line 1586
    invoke-static/range {v14 .. v23}, La/ibc;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1587
    .line 1588
    .line 1589
    goto :goto_9

    .line 1590
    :cond_1b
    move-object/from16 v21, v1

    .line 1591
    .line 1592
    invoke-virtual/range {v21 .. v21}, La/fet;->X()V

    .line 1593
    .line 1594
    .line 1595
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1596
    .line 1597
    return-object v0

    .line 1598
    :pswitch_15
    check-cast v0, La/co10;

    .line 1599
    .line 1600
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1601
    .line 1602
    move-object/from16 v1, p1

    .line 1603
    .line 1604
    check-cast v1, La/fet;

    .line 1605
    .line 1606
    move-object/from16 v3, p2

    .line 1607
    .line 1608
    check-cast v3, Ljava/lang/Integer;

    .line 1609
    .line 1610
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1611
    .line 1612
    .line 1613
    invoke-static {v2}, La/x8x;->L(I)I

    .line 1614
    .line 1615
    .line 1616
    move-result v2

    .line 1617
    invoke-static {v0, v13, v1, v2}, La/km10;->k(La/co10;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1618
    .line 1619
    .line 1620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1621
    .line 1622
    return-object v0

    .line 1623
    :pswitch_16
    check-cast v0, La/vm10;

    .line 1624
    .line 1625
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1626
    .line 1627
    move-object/from16 v1, p1

    .line 1628
    .line 1629
    check-cast v1, La/fet;

    .line 1630
    .line 1631
    move-object/from16 v3, p2

    .line 1632
    .line 1633
    check-cast v3, Ljava/lang/Integer;

    .line 1634
    .line 1635
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    invoke-static {v2}, La/x8x;->L(I)I

    .line 1639
    .line 1640
    .line 1641
    move-result v2

    .line 1642
    invoke-static {v0, v13, v1, v2}, La/km10;->i(La/vm10;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1643
    .line 1644
    .line 1645
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1646
    .line 1647
    return-object v0

    .line 1648
    :pswitch_17
    check-cast v0, La/d250;

    .line 1649
    .line 1650
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1651
    .line 1652
    move-object/from16 v1, p1

    .line 1653
    .line 1654
    check-cast v1, La/fet;

    .line 1655
    .line 1656
    move-object/from16 v2, p2

    .line 1657
    .line 1658
    check-cast v2, Ljava/lang/Integer;

    .line 1659
    .line 1660
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1661
    .line 1662
    .line 1663
    invoke-static {v3}, La/x8x;->L(I)I

    .line 1664
    .line 1665
    .line 1666
    move-result v2

    .line 1667
    invoke-static {v0, v13, v1, v2}, La/x0x;->h(La/d250;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1668
    .line 1669
    .line 1670
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1671
    .line 1672
    return-object v0

    .line 1673
    :pswitch_18
    move-object v6, v11

    .line 1674
    check-cast v0, La/y3h;

    .line 1675
    .line 1676
    check-cast v13, Ljava/lang/String;

    .line 1677
    .line 1678
    move-object/from16 v1, p1

    .line 1679
    .line 1680
    check-cast v1, La/oyg0;

    .line 1681
    .line 1682
    move-object/from16 v14, p2

    .line 1683
    .line 1684
    check-cast v14, La/m310;

    .line 1685
    .line 1686
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    iget-object v15, v14, La/m310;->j:La/g310;

    .line 1693
    .line 1694
    iget-object v1, v15, La/g310;->c:La/o4i0;

    .line 1695
    .line 1696
    iget-object v2, v0, La/y3h;->c:Ljava/util/List;

    .line 1697
    .line 1698
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v2

    .line 1702
    :cond_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1703
    .line 1704
    .line 1705
    move-result v3

    .line 1706
    if-eqz v3, :cond_1d

    .line 1707
    .line 1708
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v3

    .line 1712
    move-object v4, v3

    .line 1713
    check-cast v4, La/c4h;

    .line 1714
    .line 1715
    iget-object v4, v4, La/c4h;->a:Ljava/lang/String;

    .line 1716
    .line 1717
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1718
    .line 1719
    .line 1720
    move-result v4

    .line 1721
    if-eqz v4, :cond_1c

    .line 1722
    .line 1723
    move-object v2, v3

    .line 1724
    goto :goto_a

    .line 1725
    :cond_1d
    move-object v2, v6

    .line 1726
    :goto_a
    check-cast v2, La/c4h;

    .line 1727
    .line 1728
    if-eqz v2, :cond_1e

    .line 1729
    .line 1730
    iget-object v2, v2, La/c4h;->a:Ljava/lang/String;

    .line 1731
    .line 1732
    goto :goto_b

    .line 1733
    :cond_1e
    iget-object v2, v1, La/o4i0;->a:Ljava/lang/String;

    .line 1734
    .line 1735
    :goto_b
    iget-object v0, v0, La/y3h;->g:Ljava/util/List;

    .line 1736
    .line 1737
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v0

    .line 1741
    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1742
    .line 1743
    .line 1744
    move-result v3

    .line 1745
    if-eqz v3, :cond_20

    .line 1746
    .line 1747
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v3

    .line 1751
    move-object v4, v3

    .line 1752
    check-cast v4, La/c4h;

    .line 1753
    .line 1754
    iget-object v4, v4, La/c4h;->a:Ljava/lang/String;

    .line 1755
    .line 1756
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1757
    .line 1758
    .line 1759
    move-result v4

    .line 1760
    if-eqz v4, :cond_1f

    .line 1761
    .line 1762
    move-object v11, v3

    .line 1763
    goto :goto_c

    .line 1764
    :cond_20
    move-object v11, v6

    .line 1765
    :goto_c
    check-cast v11, La/c4h;

    .line 1766
    .line 1767
    if-eqz v11, :cond_21

    .line 1768
    .line 1769
    iget-object v0, v11, La/c4h;->a:Ljava/lang/String;

    .line 1770
    .line 1771
    goto :goto_d

    .line 1772
    :cond_21
    iget-object v0, v1, La/o4i0;->b:Ljava/lang/String;

    .line 1773
    .line 1774
    :goto_d
    invoke-static {v2, v0}, La/o4i0;->a(Ljava/lang/String;Ljava/lang/String;)La/o4i0;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v20

    .line 1778
    const/16 v26, 0x0

    .line 1779
    .line 1780
    const/16 v27, 0xfb

    .line 1781
    .line 1782
    const-wide/16 v16, 0x0

    .line 1783
    .line 1784
    const-wide/16 v18, 0x0

    .line 1785
    .line 1786
    const-wide/16 v21, 0x0

    .line 1787
    .line 1788
    const/16 v23, 0x0

    .line 1789
    .line 1790
    const-wide/16 v24, 0x0

    .line 1791
    .line 1792
    invoke-static/range {v15 .. v27}, La/g310;->a(La/g310;JJLa/o4i0;JLjava/util/ArrayList;JZI)La/g310;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v22

    .line 1796
    const/16 v30, 0x0

    .line 1797
    .line 1798
    const v31, 0x1fffdff

    .line 1799
    .line 1800
    .line 1801
    const/4 v15, 0x0

    .line 1802
    const/16 v16, 0x0

    .line 1803
    .line 1804
    const/16 v17, 0x0

    .line 1805
    .line 1806
    const/16 v18, 0x0

    .line 1807
    .line 1808
    const/16 v19, 0x0

    .line 1809
    .line 1810
    const/16 v20, 0x0

    .line 1811
    .line 1812
    const/16 v21, 0x0

    .line 1813
    .line 1814
    const/16 v24, 0x0

    .line 1815
    .line 1816
    const/16 v25, 0x0

    .line 1817
    .line 1818
    const/16 v26, 0x0

    .line 1819
    .line 1820
    const/16 v27, 0x0

    .line 1821
    .line 1822
    const/16 v28, 0x0

    .line 1823
    .line 1824
    const/16 v29, 0x0

    .line 1825
    .line 1826
    invoke-static/range {v14 .. v31}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v0

    .line 1830
    return-object v0

    .line 1831
    :pswitch_19
    check-cast v0, La/c610;

    .line 1832
    .line 1833
    check-cast v13, La/mm40;

    .line 1834
    .line 1835
    move-object/from16 v1, p1

    .line 1836
    .line 1837
    check-cast v1, La/fet;

    .line 1838
    .line 1839
    move-object/from16 v2, p2

    .line 1840
    .line 1841
    check-cast v2, Ljava/lang/Integer;

    .line 1842
    .line 1843
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1844
    .line 1845
    .line 1846
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1847
    .line 1848
    .line 1849
    move-result v2

    .line 1850
    invoke-static {v0, v13, v1, v2}, La/uvw;->c(La/c610;La/mm40;La/fet;I)V

    .line 1851
    .line 1852
    .line 1853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1854
    .line 1855
    return-object v0

    .line 1856
    :pswitch_1a
    check-cast v0, La/g610;

    .line 1857
    .line 1858
    check-cast v13, La/mm40;

    .line 1859
    .line 1860
    move-object/from16 v1, p1

    .line 1861
    .line 1862
    check-cast v1, La/fet;

    .line 1863
    .line 1864
    move-object/from16 v2, p2

    .line 1865
    .line 1866
    check-cast v2, Ljava/lang/Integer;

    .line 1867
    .line 1868
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1869
    .line 1870
    .line 1871
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1872
    .line 1873
    .line 1874
    move-result v2

    .line 1875
    invoke-static {v0, v13, v1, v2}, La/ufx;->c(La/g610;La/mm40;La/fet;I)V

    .line 1876
    .line 1877
    .line 1878
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1879
    .line 1880
    return-object v0

    .line 1881
    :pswitch_1b
    check-cast v0, La/m110;

    .line 1882
    .line 1883
    check-cast v13, La/mm40;

    .line 1884
    .line 1885
    move-object/from16 v1, p1

    .line 1886
    .line 1887
    check-cast v1, La/fet;

    .line 1888
    .line 1889
    move-object/from16 v2, p2

    .line 1890
    .line 1891
    check-cast v2, Ljava/lang/Integer;

    .line 1892
    .line 1893
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1894
    .line 1895
    .line 1896
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1897
    .line 1898
    .line 1899
    move-result v2

    .line 1900
    invoke-static {v0, v13, v1, v2}, La/kcx;->o(La/m110;La/mm40;La/fet;I)V

    .line 1901
    .line 1902
    .line 1903
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1904
    .line 1905
    return-object v0

    .line 1906
    :pswitch_1c
    check-cast v0, La/g110;

    .line 1907
    .line 1908
    check-cast v13, La/mm40;

    .line 1909
    .line 1910
    move-object/from16 v1, p1

    .line 1911
    .line 1912
    check-cast v1, La/fet;

    .line 1913
    .line 1914
    move-object/from16 v2, p2

    .line 1915
    .line 1916
    check-cast v2, Ljava/lang/Integer;

    .line 1917
    .line 1918
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1919
    .line 1920
    .line 1921
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1922
    .line 1923
    .line 1924
    move-result v2

    .line 1925
    invoke-static {v0, v13, v1, v2}, La/x9x;->s(La/g110;La/mm40;La/fet;I)V

    .line 1926
    .line 1927
    .line 1928
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1929
    .line 1930
    return-object v0

    .line 1931
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
