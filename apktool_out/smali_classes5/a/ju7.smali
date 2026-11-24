.class public final La/ju7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/agk0;La/vne;La/t33;La/pz40;La/agk0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/ju7;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ju7;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/ju7;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/ju7;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/ju7;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, La/ju7;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;La/roq0;La/lme0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ju7;->a:B

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ju7;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ju7;->c:Ljava/lang/Object;

    iput-object p3, p0, La/ju7;->d:Ljava/lang/Object;

    iput-object p4, p0, La/ju7;->e:Ljava/lang/Object;

    iput-object p5, p0, La/ju7;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ju7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/ju7;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/ju7;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, La/ju7;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/ju7;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, v0, La/ju7;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/hdb0;

    .line 22
    .line 23
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v5, La/roq0;

    .line 33
    .line 34
    check-cast v4, La/lme0;

    .line 35
    .line 36
    invoke-static {v7, v5, v4}, La/d9x;->J(Landroidx/fragment/app/e;La/roq0;La/lme0;)V

    .line 37
    .line 38
    .line 39
    sget-object v4, La/bdb0;->a:La/bdb0;

    .line 40
    .line 41
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_6

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v1, v1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 52
    .line 53
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v2, v2, Landroidx/fragment/app/e;->c:La/pmi;

    .line 65
    .line 66
    invoke-virtual {v2}, La/pmi;->p()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_1

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    instance-of v5, v4, La/of80;

    .line 97
    .line 98
    if-eqz v5, :cond_0

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, La/of80;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->N()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    iget-object v2, v2, La/sik;->S1:Landroid/app/Dialog;

    .line 134
    .line 135
    if-eqz v2, :cond_3

    .line 136
    .line 137
    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    const/4 v4, 0x1

    .line 142
    if-ne v2, v4, :cond_3

    .line 143
    .line 144
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 145
    .line 146
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto/16 :goto_3

    .line 150
    .line 151
    :cond_4
    :goto_1
    sget-object v1, La/qk4;->i2:La/jdk0;

    .line 152
    .line 153
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const-string v1, "AUTH_OFFER_DIALOG_TAG"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-eqz v2, :cond_5

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_5
    new-instance v2, La/qk4;

    .line 173
    .line 174
    invoke-direct {v2}, La/qk4;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto/16 :goto_3

    .line 186
    .line 187
    :cond_6
    sget-object v3, La/cdb0;->a:La/cdb0;

    .line 188
    .line 189
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_8

    .line 194
    .line 195
    sget-object v1, La/jgv;->h2:La/gst;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    const-string v1, "GREETING_KZ_DIALOG_TAG"

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    if-eqz v2, :cond_7

    .line 214
    .line 215
    goto/16 :goto_3

    .line 216
    .line 217
    :cond_7
    new-instance v2, La/jgv;

    .line 218
    .line 219
    invoke-direct {v2}, La/jgv;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_8
    sget-object v3, La/edb0;->a:La/edb0;

    .line 227
    .line 228
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_9

    .line 233
    .line 234
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    sget-object v1, La/fk60;->b:La/uuz;

    .line 242
    .line 243
    const/16 v1, 0xb

    .line 244
    .line 245
    invoke-static {v5, v0, v1}, La/roq0;->c(La/roq0;Landroidx/fragment/app/e;I)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_9
    sget-object v3, La/fdb0;->a:La/fdb0;

    .line 250
    .line 251
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_a

    .line 256
    .line 257
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    sget-object v1, La/fk60;->b:La/uuz;

    .line 265
    .line 266
    const/16 v1, 0x14

    .line 267
    .line 268
    invoke-static {v5, v0, v1}, La/roq0;->c(La/roq0;Landroidx/fragment/app/e;I)V

    .line 269
    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_a
    sget-object v3, La/gdb0;->a:La/gdb0;

    .line 273
    .line 274
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_c

    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    sget-object v1, La/zuf0;->e2:La/gne0;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    sget-object v1, La/zuf0;->g2:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    if-eqz v2, :cond_b

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_b
    new-instance v2, La/zuf0;

    .line 302
    .line 303
    invoke-direct {v2}, La/zuf0;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_c
    sget-object v3, La/ddb0;->a:La/ddb0;

    .line 311
    .line 312
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_d

    .line 317
    .line 318
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    sget-object v1, La/fk60;->b:La/uuz;

    .line 326
    .line 327
    const/16 v1, 0x1e

    .line 328
    .line 329
    invoke-static {v5, v0, v1}, La/roq0;->c(La/roq0;Landroidx/fragment/app/e;I)V

    .line 330
    .line 331
    .line 332
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 336
    .line 337
    .line 338
    :goto_4
    return-object v2

    .line 339
    :pswitch_0
    move-object/from16 v1, p1

    .line 340
    .line 341
    check-cast v1, Lkotlin/Pair;

    .line 342
    .line 343
    iget-object v7, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v7, Ljava/lang/Boolean;

    .line 346
    .line 347
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v1, Ljava/lang/Number;

    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    move-object v8, v0

    .line 360
    check-cast v8, La/agk0;

    .line 361
    .line 362
    invoke-virtual {v8}, La/agk0;->l()F

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    div-float v9, v1, v9

    .line 367
    .line 368
    const/high16 v10, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/4 v11, 0x0

    .line 371
    invoke-static {v9, v11, v10}, La/l1e0;->c(FFF)F

    .line 372
    .line 373
    .line 374
    move-result v15

    .line 375
    if-nez v7, :cond_10

    .line 376
    .line 377
    cmpg-float v7, v1, v11

    .line 378
    .line 379
    if-nez v7, :cond_e

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_e
    invoke-virtual {v8}, La/agk0;->l()F

    .line 383
    .line 384
    .line 385
    move-result v7

    .line 386
    cmpg-float v1, v1, v7

    .line 387
    .line 388
    if-nez v1, :cond_f

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_f
    check-cast v4, La/vne;

    .line 392
    .line 393
    new-instance v12, La/iu7;

    .line 394
    .line 395
    move-object v13, v6

    .line 396
    check-cast v13, La/t33;

    .line 397
    .line 398
    move-object v14, v3

    .line 399
    check-cast v14, La/pz40;

    .line 400
    .line 401
    move-object/from16 v16, v5

    .line 402
    .line 403
    check-cast v16, La/agk0;

    .line 404
    .line 405
    move-object/from16 v17, v0

    .line 406
    .line 407
    check-cast v17, La/agk0;

    .line 408
    .line 409
    const/16 v18, 0x0

    .line 410
    .line 411
    invoke-direct/range {v12 .. v18}, La/iu7;-><init>(La/t33;La/pz40;FLa/agk0;La/agk0;La/yje;)V

    .line 412
    .line 413
    .line 414
    const/4 v0, 0x3

    .line 415
    invoke-static {v4, v2, v2, v12, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 416
    .line 417
    .line 418
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_10
    :goto_5
    check-cast v6, La/t33;

    .line 422
    .line 423
    new-instance v0, Ljava/lang/Float;

    .line 424
    .line 425
    invoke-direct {v0, v15}, Ljava/lang/Float;-><init>(F)V

    .line 426
    .line 427
    .line 428
    move-object/from16 v1, p2

    .line 429
    .line 430
    invoke-virtual {v6, v1, v0}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    sget-object v1, La/wne;->a:La/wne;

    .line 435
    .line 436
    if-ne v0, v1, :cond_11

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    :goto_6
    return-object v0

    .line 442
    nop

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
