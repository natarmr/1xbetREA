.class public final synthetic La/gmo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gmo;->a:B

    iput-object p1, p0, La/gmo;->b:Ljava/lang/Object;

    iput-object p2, p0, La/gmo;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gmo;->a:B

    .line 4
    .line 5
    const-string v2, "actionMenuDialogFactory"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/gmo;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/gmo;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    check-cast v6, La/w1z;

    .line 20
    .line 21
    iget-object v1, v6, La/w1z;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    check-cast v0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;

    .line 30
    .line 31
    check-cast v6, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-static {v0, v6}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->d(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;Ljava/util/HashMap;)Lkotlin/Unit;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :pswitch_1
    check-cast v0, La/fet;

    .line 39
    .line 40
    check-cast v6, La/mu40;

    .line 41
    .line 42
    iget-object v1, v6, La/mu40;->a:La/ju40;

    .line 43
    .line 44
    iget-object v2, v6, La/mu40;->g:La/bh90;

    .line 45
    .line 46
    iget-object v3, v6, La/mu40;->b:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2, v3, v5}, La/fet;->F(La/ju40;La/bh90;Ljava/lang/Object;Z)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_2
    check-cast v0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;

    .line 55
    .line 56
    check-cast v6, La/bzt;

    .line 57
    .line 58
    iget-boolean v12, v0, Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;->f:Z

    .line 59
    .line 60
    new-instance v13, La/mdm;

    .line 61
    .line 62
    sget-object v0, La/pb10;->c:La/xuz;

    .line 63
    .line 64
    sget-object v1, La/pb10;->g:La/pb10;

    .line 65
    .line 66
    iget-object v2, v6, La/bzt;->a:La/fsd;

    .line 67
    .line 68
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget v2, v2, La/v8d;->r:I

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v2}, La/xuz;->a(La/pb10;I)I

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    const-wide/16 v24, 0x0

    .line 82
    .line 83
    const/16 v26, 0x3de

    .line 84
    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const v19, 0x7f130677

    .line 93
    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    const/16 v21, 0x0

    .line 98
    .line 99
    const-wide/16 v22, 0x0

    .line 100
    .line 101
    invoke-direct/range {v13 .. v26}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 102
    .line 103
    .line 104
    sget-object v15, La/iun;->a:La/iun;

    .line 105
    .line 106
    new-instance v7, La/qns;

    .line 107
    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v14, 0x0

    .line 110
    const/4 v8, 0x1

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    move-object/from16 v16, v15

    .line 114
    .line 115
    invoke-direct/range {v7 .. v16}, La/qns;-><init>(ZZZZZLa/mdm;Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Ljava/util/List;Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    return-object v7

    .line 119
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    check-cast v6, La/zls;

    .line 122
    .line 123
    iget-boolean v1, v6, La/zls;->b:Z

    .line 124
    .line 125
    xor-int/2addr v1, v5

    .line 126
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_4
    check-cast v0, La/cjs;

    .line 137
    .line 138
    check-cast v6, La/mjs;

    .line 139
    .line 140
    iget-object v1, v0, La/cjs;->M1:La/gfk0;

    .line 141
    .line 142
    if-eqz v1, :cond_0

    .line 143
    .line 144
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast v6, La/jjs;

    .line 152
    .line 153
    iget-object v1, v6, La/jjs;->a:Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 154
    .line 155
    invoke-static {v0, v1}, La/gfk0;->h(Landroidx/fragment/app/e;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v4

    .line 165
    :pswitch_5
    check-cast v0, La/i7s;

    .line 166
    .line 167
    check-cast v6, La/q7s;

    .line 168
    .line 169
    iget-object v1, v0, La/i7s;->M1:La/gfk0;

    .line 170
    .line 171
    if-eqz v1, :cond_1

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    check-cast v6, La/n7s;

    .line 181
    .line 182
    iget-object v1, v6, La/n7s;->a:Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 183
    .line 184
    invoke-static {v0, v1}, La/gfk0;->h(Landroidx/fragment/app/e;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v4

    .line 194
    :pswitch_6
    check-cast v0, La/l7m0;

    .line 195
    .line 196
    check-cast v6, La/dja;

    .line 197
    .line 198
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_3

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, La/bja;

    .line 219
    .line 220
    invoke-interface {v1}, La/bja;->getType()La/dja;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-ne v1, v6, :cond_2

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_3
    const/4 v3, -0x1

    .line 231
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    return-object v0

    .line 236
    :pswitch_7
    check-cast v0, La/l0s;

    .line 237
    .line 238
    check-cast v6, La/mie0;

    .line 239
    .line 240
    invoke-virtual {v0}, La/eiu0;->s()La/diu0;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    new-instance v8, La/g0s;

    .line 249
    .line 250
    invoke-direct {v8, v0, v3}, La/g0s;-><init>(La/l0s;B)V

    .line 251
    .line 252
    .line 253
    new-instance v11, La/cbq;

    .line 254
    .line 255
    const/16 v1, 0xa

    .line 256
    .line 257
    invoke-direct {v11, v0, v6, v4, v1}, La/cbq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 258
    .line 259
    .line 260
    const/16 v12, 0xe

    .line 261
    .line 262
    const/4 v9, 0x0

    .line 263
    const/4 v10, 0x0

    .line 264
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 265
    .line 266
    .line 267
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_8
    check-cast v0, La/f0s;

    .line 271
    .line 272
    check-cast v6, La/nm7;

    .line 273
    .line 274
    iget-object v1, v6, La/nm7;->a:La/m0k0;

    .line 275
    .line 276
    iget-object v2, v6, La/nm7;->b:La/m97;

    .line 277
    .line 278
    invoke-interface {v0, v1, v2, v3}, La/f0s;->n(La/m0k0;La/m97;Z)V

    .line 279
    .line 280
    .line 281
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_9
    check-cast v0, La/f0s;

    .line 285
    .line 286
    check-cast v6, La/qm7;

    .line 287
    .line 288
    iget-object v1, v6, La/qm7;->c:La/m0k0;

    .line 289
    .line 290
    iget-object v2, v6, La/qm7;->d:La/m97;

    .line 291
    .line 292
    invoke-interface {v0, v1, v2, v5}, La/f0s;->n(La/m0k0;La/m97;Z)V

    .line 293
    .line 294
    .line 295
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_a
    check-cast v0, La/t33;

    .line 299
    .line 300
    check-cast v6, La/t33;

    .line 301
    .line 302
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Ljava/lang/Number;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    const/4 v2, 0x0

    .line 313
    cmpg-float v1, v1, v2

    .line 314
    .line 315
    const/high16 v3, 0x40000000    # 2.0f

    .line 316
    .line 317
    const/high16 v4, 0x3f800000    # 1.0f

    .line 318
    .line 319
    if-nez v1, :cond_4

    .line 320
    .line 321
    invoke-virtual {v6}, La/t33;->d()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    mul-float/2addr v0, v3

    .line 332
    sub-float v0, v4, v0

    .line 333
    .line 334
    invoke-static {v0, v2, v4}, La/l1e0;->c(FFF)F

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    goto :goto_2

    .line 339
    :cond_4
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    check-cast v0, Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    mul-float/2addr v0, v3

    .line 350
    sub-float v0, v4, v0

    .line 351
    .line 352
    invoke-static {v0, v2, v4}, La/l1e0;->c(FFF)F

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    return-object v0

    .line 361
    :pswitch_b
    check-cast v0, La/dnr;

    .line 362
    .line 363
    check-cast v6, La/pnr;

    .line 364
    .line 365
    iget-object v1, v0, La/dnr;->M1:La/gfk0;

    .line 366
    .line 367
    if-eqz v1, :cond_5

    .line 368
    .line 369
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    check-cast v6, La/mnr;

    .line 377
    .line 378
    iget-object v1, v6, La/mnr;->a:Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 379
    .line 380
    invoke-static {v0, v1}, La/gfk0;->h(Landroidx/fragment/app/e;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V

    .line 381
    .line 382
    .line 383
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object v0

    .line 386
    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v4

    .line 390
    :pswitch_c
    check-cast v0, La/ywv0;

    .line 391
    .line 392
    check-cast v6, Landroid/view/View;

    .line 393
    .line 394
    iget-object v1, v0, La/ywv0;->d:La/glt0;

    .line 395
    .line 396
    iget-object v2, v0, La/ywv0;->j:La/ruv0;

    .line 397
    .line 398
    invoke-virtual {v1}, La/glt0;->f()Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_d

    .line 403
    .line 404
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    instance-of v6, v1, La/vjk;

    .line 409
    .line 410
    if-eqz v6, :cond_6

    .line 411
    .line 412
    check-cast v1, La/vjk;

    .line 413
    .line 414
    goto :goto_3

    .line 415
    :cond_6
    move-object v1, v4

    .line 416
    :goto_3
    if-eqz v1, :cond_7

    .line 417
    .line 418
    invoke-interface {v1}, La/vjk;->getWindow()Landroid/view/Window;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    goto :goto_4

    .line 423
    :cond_7
    move-object v1, v4

    .line 424
    :goto_4
    const/4 v6, 0x3

    .line 425
    if-eqz v1, :cond_8

    .line 426
    .line 427
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    iget v7, v7, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 432
    .line 433
    or-int/2addr v7, v6

    .line 434
    invoke-virtual {v1, v7}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 435
    .line 436
    .line 437
    :cond_8
    invoke-virtual {v2}, La/ruv0;->g()Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-eqz v1, :cond_d

    .line 442
    .line 443
    iget-object v1, v2, La/ruv0;->t:La/vne;

    .line 444
    .line 445
    invoke-virtual {v2}, La/ruv0;->f()La/yuv0;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    if-eqz v1, :cond_c

    .line 450
    .line 451
    if-eqz v7, :cond_c

    .line 452
    .line 453
    iget-object v8, v2, La/ruv0;->d:La/mkt0;

    .line 454
    .line 455
    invoke-virtual {v8}, La/mkt0;->b()Z

    .line 456
    .line 457
    .line 458
    move-result v8

    .line 459
    if-nez v8, :cond_c

    .line 460
    .line 461
    iget-boolean v8, v2, La/ruv0;->i:Z

    .line 462
    .line 463
    if-nez v8, :cond_c

    .line 464
    .line 465
    iget-boolean v8, v2, La/ruv0;->m:Z

    .line 466
    .line 467
    if-eqz v8, :cond_9

    .line 468
    .line 469
    goto :goto_6

    .line 470
    :cond_9
    iget-object v8, v2, La/ruv0;->b:La/fht0;

    .line 471
    .line 472
    invoke-virtual {v8}, La/fht0;->f()La/cvv0;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    if-nez v8, :cond_a

    .line 477
    .line 478
    iget v7, v7, La/yuv0;->b:F

    .line 479
    .line 480
    goto :goto_5

    .line 481
    :cond_a
    iget-object v7, v7, La/yuv0;->a:La/lxv0;

    .line 482
    .line 483
    invoke-static {v8, v7}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    int-to-float v7, v7

    .line 488
    :goto_5
    iget-object v8, v2, La/ruv0;->s:La/c4m0;

    .line 489
    .line 490
    if-eqz v8, :cond_b

    .line 491
    .line 492
    invoke-virtual {v8, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 493
    .line 494
    .line 495
    :cond_b
    iput-object v4, v2, La/ruv0;->s:La/c4m0;

    .line 496
    .line 497
    invoke-virtual {v2}, La/ruv0;->k()V

    .line 498
    .line 499
    .line 500
    iput v3, v2, La/ruv0;->o:I

    .line 501
    .line 502
    iput-boolean v3, v2, La/ruv0;->p:Z

    .line 503
    .line 504
    new-instance v3, La/puv0;

    .line 505
    .line 506
    invoke-direct {v3, v2, v7, v4, v5}, La/puv0;-><init>(La/ruv0;FLa/yje;B)V

    .line 507
    .line 508
    .line 509
    invoke-static {v1, v4, v4, v3, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 510
    .line 511
    .line 512
    :cond_c
    :goto_6
    iget-object v0, v0, La/ywv0;->a:La/duv0;

    .line 513
    .line 514
    iget-object v0, v0, La/duv0;->g:La/pz40;

    .line 515
    .line 516
    check-cast v0, La/hgk0;

    .line 517
    .line 518
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    check-cast v0, La/pkk0;

    .line 523
    .line 524
    if-eqz v0, :cond_d

    .line 525
    .line 526
    check-cast v0, La/r3k;

    .line 527
    .line 528
    invoke-virtual {v0}, La/r3k;->a()V

    .line 529
    .line 530
    .line 531
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_d
    check-cast v0, La/mie0;

    .line 535
    .line 536
    check-cast v6, La/uqq;

    .line 537
    .line 538
    sget-object v1, La/hu90;->a:La/zfn;

    .line 539
    .line 540
    invoke-static {v6, v1}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 545
    .line 546
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_e
    check-cast v0, La/mie0;

    .line 550
    .line 551
    check-cast v6, La/nqq;

    .line 552
    .line 553
    invoke-virtual {v6}, La/nqq;->b1()La/aqq;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 558
    .line 559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_f
    check-cast v0, La/mie0;

    .line 563
    .line 564
    check-cast v6, La/lqq;

    .line 565
    .line 566
    sget-object v1, La/hu90;->a:La/zfn;

    .line 567
    .line 568
    invoke-static {v6, v1}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 573
    .line 574
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object v0

    .line 577
    :pswitch_10
    check-cast v0, La/r8q;

    .line 578
    .line 579
    check-cast v6, Ljava/lang/String;

    .line 580
    .line 581
    iget-object v0, v0, La/r8q;->T:La/ol60;

    .line 582
    .line 583
    new-instance v1, La/c8q;

    .line 584
    .line 585
    invoke-direct {v1, v6}, La/c8q;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_11
    check-cast v0, La/nmy;

    .line 595
    .line 596
    check-cast v6, La/cny;

    .line 597
    .line 598
    new-instance v1, La/o5q;

    .line 599
    .line 600
    invoke-direct {v1, v0, v6}, La/o5q;-><init>(La/nmy;La/cny;)V

    .line 601
    .line 602
    .line 603
    return-object v1

    .line 604
    :pswitch_12
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 605
    .line 606
    check-cast v6, La/a5a0;

    .line 607
    .line 608
    iget-wide v1, v6, La/a5a0;->b:J

    .line 609
    .line 610
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    iget-boolean v2, v6, La/a5a0;->c:Z

    .line 615
    .line 616
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 624
    .line 625
    return-object v0

    .line 626
    :pswitch_13
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 627
    .line 628
    check-cast v6, La/b5a0;

    .line 629
    .line 630
    iget-wide v1, v6, La/b5a0;->b:J

    .line 631
    .line 632
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    iget-boolean v2, v6, La/b5a0;->c:Z

    .line 637
    .line 638
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 646
    .line 647
    return-object v0

    .line 648
    :pswitch_14
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 649
    .line 650
    check-cast v6, La/z4a0;

    .line 651
    .line 652
    iget-wide v1, v6, La/z4a0;->b:J

    .line 653
    .line 654
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    iget-boolean v2, v6, La/z4a0;->c:Z

    .line 659
    .line 660
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_15
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 671
    .line 672
    check-cast v6, La/y4a0;

    .line 673
    .line 674
    iget-wide v1, v6, La/y4a0;->b:J

    .line 675
    .line 676
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    iget-boolean v2, v6, La/y4a0;->c:Z

    .line 681
    .line 682
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 690
    .line 691
    return-object v0

    .line 692
    :pswitch_16
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 693
    .line 694
    check-cast v6, La/zfp;

    .line 695
    .line 696
    iget-wide v1, v6, La/zfp;->a:J

    .line 697
    .line 698
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    iget-boolean v2, v6, La/zfp;->b:Z

    .line 703
    .line 704
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    return-object v0

    .line 714
    :pswitch_17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 715
    .line 716
    check-cast v6, La/dhm;

    .line 717
    .line 718
    iget-wide v1, v6, La/dhm;->a:J

    .line 719
    .line 720
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_18
    check-cast v0, Ljava/lang/String;

    .line 731
    .line 732
    check-cast v6, La/a8z;

    .line 733
    .line 734
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    check-cast v1, Ljava/lang/String;

    .line 739
    .line 740
    const-string v2, ""

    .line 741
    .line 742
    invoke-static {v0, v1, v2, v3}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-static {}, La/cy7;->c()Z

    .line 755
    .line 756
    .line 757
    move-result v1

    .line 758
    const-string v2, " "

    .line 759
    .line 760
    if-eqz v1, :cond_e

    .line 761
    .line 762
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    check-cast v1, Ljava/lang/String;

    .line 767
    .line 768
    invoke-static {v1, v2, v0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    goto :goto_7

    .line 773
    :cond_e
    invoke-interface {v6}, La/a8z;->getValue()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    check-cast v1, Ljava/lang/String;

    .line 778
    .line 779
    invoke-static {v0, v2, v1}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    :goto_7
    return-object v0

    .line 784
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 785
    .line 786
    check-cast v6, La/e7p;

    .line 787
    .line 788
    new-instance v1, La/n6p;

    .line 789
    .line 790
    iget-object v2, v6, La/e7p;->a:La/s9p;

    .line 791
    .line 792
    invoke-direct {v1, v2}, La/n6p;-><init>(La/s9p;)V

    .line 793
    .line 794
    .line 795
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 799
    .line 800
    return-object v0

    .line 801
    :pswitch_1a
    check-cast v0, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 802
    .line 803
    move-object v7, v6

    .line 804
    check-cast v7, La/g2v;

    .line 805
    .line 806
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;->b()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    sget-object v1, La/iun;->a:La/iun;

    .line 811
    .line 812
    sget-object v2, La/f4p;->a:La/f4p;

    .line 813
    .line 814
    sget-object v3, La/v5l0;->b:La/v5l0;

    .line 815
    .line 816
    sget-object v8, La/pb10;->g:La/pb10;

    .line 817
    .line 818
    sget-object v9, La/pdm;->b:La/pdm;

    .line 819
    .line 820
    const-wide/16 v18, 0x0

    .line 821
    .line 822
    const/16 v20, 0x3d4

    .line 823
    .line 824
    const/4 v10, 0x0

    .line 825
    const v11, 0x7f080827

    .line 826
    .line 827
    .line 828
    const/4 v12, 0x0

    .line 829
    const v13, 0x7f130780

    .line 830
    .line 831
    .line 832
    const/4 v14, 0x0

    .line 833
    const/4 v15, 0x0

    .line 834
    const-wide/16 v16, 0x0

    .line 835
    .line 836
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 837
    .line 838
    .line 839
    move-result-object v14

    .line 840
    new-instance v8, La/x4p;

    .line 841
    .line 842
    const/16 v21, 0x0

    .line 843
    .line 844
    const/16 v22, 0x0

    .line 845
    .line 846
    const/4 v13, 0x0

    .line 847
    const/16 v16, 0x0

    .line 848
    .line 849
    const/16 v17, 0x0

    .line 850
    .line 851
    const/16 v18, 0x0

    .line 852
    .line 853
    const/16 v19, 0x0

    .line 854
    .line 855
    move-object v11, v1

    .line 856
    move-object v15, v1

    .line 857
    move-object v9, v0

    .line 858
    move-object v10, v1

    .line 859
    move-object v12, v2

    .line 860
    move-object/from16 v20, v3

    .line 861
    .line 862
    invoke-direct/range {v8 .. v22}, La/x4p;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;La/mdm;Ljava/util/List;ZZZZLa/v5l0;ZZ)V

    .line 863
    .line 864
    .line 865
    return-object v8

    .line 866
    :pswitch_1b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 867
    .line 868
    check-cast v6, La/kem;

    .line 869
    .line 870
    new-instance v1, La/udm;

    .line 871
    .line 872
    iget-wide v2, v6, La/kem;->a:J

    .line 873
    .line 874
    invoke-direct {v1, v2, v3}, La/udm;-><init>(J)V

    .line 875
    .line 876
    .line 877
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 881
    .line 882
    return-object v0

    .line 883
    :pswitch_1c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 884
    .line 885
    check-cast v6, La/mmo;

    .line 886
    .line 887
    iget-boolean v1, v6, La/mmo;->c:Z

    .line 888
    .line 889
    xor-int/2addr v1, v5

    .line 890
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 898
    .line 899
    return-object v0

    .line 900
    nop

    .line 901
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
