.class public final synthetic La/w800;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/w800;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p0, p0, La/w800;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/fee;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/bqr;

    .line 18
    .line 19
    invoke-static {p0, v1}, La/kpb;->o0(La/bqr;Z)La/cqr;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, La/mbp0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, p1, La/mbp0;->h:La/fbp0;

    .line 30
    .line 31
    iget-object v0, p1, La/mbp0;->f:La/sff0;

    .line 32
    .line 33
    invoke-static {v0}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-boolean v1, p1, La/mbp0;->a:Z

    .line 38
    .line 39
    iget-object v2, p1, La/mbp0;->l:La/obp0;

    .line 40
    .line 41
    iget-object p1, p1, La/mbp0;->k:La/e9p0;

    .line 42
    .line 43
    invoke-static {p0, v0, v1, p1, v2}, La/qim0;->k(La/fbp0;La/dxh0;ZLa/e9p0;La/obp0;)La/gbp0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/mbp0;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 54
    .line 55
    iget-object v1, p1, La/mbp0;->d:Ljava/util/Map;

    .line 56
    .line 57
    iget-object v2, p1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 58
    .line 59
    iget-boolean v3, p1, La/mbp0;->e:Z

    .line 60
    .line 61
    iget-object v4, p1, La/mbp0;->g:La/v8d;

    .line 62
    .line 63
    iget-boolean v5, p1, La/mbp0;->a:Z

    .line 64
    .line 65
    invoke-static/range {v0 .. v5}, La/xnm0;->h(La/o9p0;Ljava/util/Map;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;ZLa/v8d;Z)La/qbp0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_3
    check-cast p1, La/bh90;

    .line 79
    .line 80
    sget-object p0, La/dy2;->b:La/zfn;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p0}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Landroid/content/Context;

    .line 90
    .line 91
    :goto_0
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    instance-of p1, p0, Landroid/app/Activity;

    .line 96
    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    move-object v0, p0

    .line 100
    goto :goto_1

    .line 101
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    goto :goto_0

    .line 108
    :cond_1
    :goto_1
    check-cast v0, Landroid/app/Activity;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_4
    check-cast p1, La/cp;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_5
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    sget p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->B:I

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_6
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    sget p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->B:I

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 140
    .line 141
    sget p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->B:I

    .line 142
    .line 143
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_8
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 147
    .line 148
    sget p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->B:I

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_9
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    sget p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->B:I

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_a
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 167
    .line 168
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_b
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 177
    .line 178
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_c
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 187
    .line 188
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 197
    .line 198
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 199
    .line 200
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 204
    .line 205
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_f
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 211
    .line 212
    sget p0, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    const/4 v2, -0x1

    .line 234
    if-eqz v0, :cond_5

    .line 235
    .line 236
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, La/npm0;

    .line 241
    .line 242
    iget-object v0, v0, La/npm0;->b:Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_2

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-eqz v3, :cond_4

    .line 260
    .line 261
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, La/mpm0;

    .line 266
    .line 267
    iget-boolean v3, v3, La/mpm0;->b:Z

    .line 268
    .line 269
    if-nez v3, :cond_3

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_4
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_5
    move v1, v2

    .line 276
    :goto_4
    if-eq v1, v2, :cond_6

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    :pswitch_11
    check-cast p1, La/bem;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_12
    check-cast p1, La/a2n;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    instance-of p0, p1, La/q56;

    .line 302
    .line 303
    if-eqz p0, :cond_7

    .line 304
    .line 305
    check-cast p1, La/q56;

    .line 306
    .line 307
    invoke-interface {p1}, La/q56;->a()J

    .line 308
    .line 309
    .line 310
    move-result-wide p0

    .line 311
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    goto :goto_6

    .line 316
    :cond_7
    instance-of p0, p1, La/w56;

    .line 317
    .line 318
    if-eqz p0, :cond_8

    .line 319
    .line 320
    check-cast p1, La/w56;

    .line 321
    .line 322
    invoke-interface {p1}, La/w56;->a()J

    .line 323
    .line 324
    .line 325
    move-result-wide p0

    .line 326
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    goto :goto_6

    .line 331
    :cond_8
    instance-of p0, p1, La/v1o0;

    .line 332
    .line 333
    if-eqz p0, :cond_9

    .line 334
    .line 335
    check-cast p1, La/v1o0;

    .line 336
    .line 337
    invoke-interface {p1}, La/v1o0;->a()J

    .line 338
    .line 339
    .line 340
    move-result-wide p0

    .line 341
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    goto :goto_6

    .line 346
    :cond_9
    instance-of p0, p1, La/b2o0;

    .line 347
    .line 348
    if-eqz p0, :cond_a

    .line 349
    .line 350
    check-cast p1, La/b2o0;

    .line 351
    .line 352
    invoke-interface {p1}, La/b2o0;->a()J

    .line 353
    .line 354
    .line 355
    move-result-wide p0

    .line 356
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    goto :goto_6

    .line 361
    :cond_a
    invoke-static {}, La/axq;->g()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    :goto_6
    return-object p0

    .line 366
    :pswitch_13
    check-cast p1, La/sjd;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    new-instance p0, La/pj00;

    .line 372
    .line 373
    invoke-direct {p0, p1}, La/pj00;-><init>(La/sjd;)V

    .line 374
    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 383
    .line 384
    .line 385
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object p0

    .line 388
    :pswitch_15
    check-cast p1, La/vsr0;

    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    iget-boolean p0, p1, La/vsr0;->a:Z

    .line 394
    .line 395
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    return-object p0

    .line 400
    :pswitch_16
    check-cast p1, La/zvh0;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-static {p1}, La/ydx;->a0(La/zvh0;)La/dxh0;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    return-object p0

    .line 410
    :pswitch_17
    check-cast p1, La/fee;

    .line 411
    .line 412
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast p0, La/my6;

    .line 420
    .line 421
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    new-instance p1, La/ny6;

    .line 425
    .line 426
    new-instance v1, La/uf40;

    .line 427
    .line 428
    iget-object v2, p0, La/my6;->c:La/kur;

    .line 429
    .line 430
    new-instance v3, La/kgs;

    .line 431
    .line 432
    iget-object v4, v2, La/kur;->a:La/ww20;

    .line 433
    .line 434
    iget-object v4, v4, La/ww20;->a:Ljava/lang/String;

    .line 435
    .line 436
    invoke-direct {v3, v4}, La/kgs;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    iget-object p0, p0, La/my6;->b:La/j580;

    .line 440
    .line 441
    new-instance v4, La/a480;

    .line 442
    .line 443
    iget-object v5, p0, La/j580;->a:Ljava/lang/String;

    .line 444
    .line 445
    iget-object v6, p0, La/j580;->b:Ljava/lang/String;

    .line 446
    .line 447
    iget-boolean p0, p0, La/j580;->c:Z

    .line 448
    .line 449
    invoke-direct {v4, v5, v6, p0}, La/a480;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 450
    .line 451
    .line 452
    iget-object p0, v2, La/kur;->b:La/j43;

    .line 453
    .line 454
    invoke-direct {v1, v3, v4, p0, v0}, La/uf40;-><init>(La/ogs;La/d480;La/j43;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    invoke-direct {p1, v1}, La/ny6;-><init>(La/uf40;)V

    .line 458
    .line 459
    .line 460
    return-object p1

    .line 461
    :pswitch_18
    check-cast p1, La/hcz;

    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    :goto_7
    const/16 p0, 0x28

    .line 467
    .line 468
    if-ge v1, p0, :cond_b

    .line 469
    .line 470
    new-instance p0, La/cl2;

    .line 471
    .line 472
    const/4 v2, 0x6

    .line 473
    invoke-direct {p0, v1, v2}, La/cl2;-><init>(IB)V

    .line 474
    .line 475
    .line 476
    new-instance v2, La/ugd;

    .line 477
    .line 478
    const v3, 0x6dad1902

    .line 479
    .line 480
    .line 481
    const/4 v4, 0x1

    .line 482
    invoke-direct {v2, v3, v4, p0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    const/4 p0, 0x3

    .line 486
    invoke-static {p1, v0, v0, v2, p0}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 487
    .line 488
    .line 489
    add-int/lit8 v1, v1, 0x1

    .line 490
    .line 491
    goto :goto_7

    .line 492
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    return-object p0

    .line 495
    :pswitch_19
    check-cast p1, La/oea0;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    iget-object p0, p1, La/oea0;->a:Ljava/lang/String;

    .line 501
    .line 502
    return-object p0

    .line 503
    :pswitch_1a
    check-cast p1, La/n1g;

    .line 504
    .line 505
    new-instance p0, La/dr2;

    .line 506
    .line 507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 514
    .line 515
    sget-object p0, La/l1g;->b:La/l1g;

    .line 516
    .line 517
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 518
    .line 519
    sget-object p0, La/k1g;->e:La/k1g;

    .line 520
    .line 521
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 522
    .line 523
    sget-object p0, La/j1g;->c:La/j1g;

    .line 524
    .line 525
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 526
    .line 527
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object p0

    .line 530
    :pswitch_1b
    check-cast p1, La/ma00;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    iget p0, p1, La/ma00;->c:I

    .line 536
    .line 537
    if-nez p0, :cond_c

    .line 538
    .line 539
    iget p0, p1, La/ma00;->d:I

    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_c
    iget p0, p1, La/ma00;->e:I

    .line 543
    .line 544
    :goto_8
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    return-object p0

    .line 549
    :pswitch_1c
    check-cast p1, La/lu90;

    .line 550
    .line 551
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    iget p0, p1, La/lu90;->e:I

    .line 555
    .line 556
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    return-object p0

    .line 561
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
