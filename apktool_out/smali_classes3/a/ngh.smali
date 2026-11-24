.class public final synthetic La/ngh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cp;La/qpg;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/ngh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ngh;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ngh;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/ngh;->a:B

    iput-object p1, p0, La/ngh;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ngh;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ngh;->a:B

    .line 4
    .line 5
    const/16 v2, 0x15

    .line 6
    .line 7
    const/16 v3, 0x18

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const/16 v5, 0x1b

    .line 12
    .line 13
    const v6, 0x799532c4

    .line 14
    .line 15
    .line 16
    const v7, 0x7f13015a

    .line 17
    .line 18
    .line 19
    const/16 v8, 0x1a

    .line 20
    .line 21
    const/16 v9, 0xc

    .line 22
    .line 23
    const v10, 0x2fd4df92

    .line 24
    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x1

    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La/npl;

    .line 35
    .line 36
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    move-object/from16 v2, p1

    .line 41
    .line 42
    check-cast v2, La/hcz;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, La/npl;->a:La/a4x;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    new-instance v4, La/bzh;

    .line 54
    .line 55
    const/16 v5, 0xe

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 58
    .line 59
    .line 60
    new-instance v5, La/vb;

    .line 61
    .line 62
    const/16 v6, 0x1c

    .line 63
    .line 64
    invoke-direct {v5, v1, v0, v6}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/ugd;

    .line 68
    .line 69
    invoke-direct {v0, v10, v13, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3, v12, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_0
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La/kpl;

    .line 81
    .line 82
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 85
    .line 86
    move-object/from16 v6, p1

    .line 87
    .line 88
    check-cast v6, La/i8z;

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v1, v1, La/kpl;->a:La/a4x;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    new-instance v10, La/bzh;

    .line 100
    .line 101
    const/16 v2, 0xd

    .line 102
    .line 103
    invoke-direct {v10, v1, v2}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 104
    .line 105
    .line 106
    new-instance v2, La/vb;

    .line 107
    .line 108
    invoke-direct {v2, v1, v0, v5}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 109
    .line 110
    .line 111
    new-instance v11, La/ugd;

    .line 112
    .line 113
    const v0, -0x4297e015

    .line 114
    .line 115
    .line 116
    invoke-direct {v11, v0, v13, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v9, 0x0

    .line 121
    invoke-virtual/range {v6 .. v11}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 122
    .line 123
    .line 124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_1
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, La/hpl;

    .line 130
    .line 131
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 134
    .line 135
    move-object/from16 v2, p1

    .line 136
    .line 137
    check-cast v2, La/hcz;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object v1, v1, La/hpl;->a:La/a4x;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    new-instance v4, La/bzh;

    .line 149
    .line 150
    invoke-direct {v4, v1, v9}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 151
    .line 152
    .line 153
    new-instance v5, La/vb;

    .line 154
    .line 155
    invoke-direct {v5, v1, v0, v8}, La/vb;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 156
    .line 157
    .line 158
    new-instance v0, La/ugd;

    .line 159
    .line 160
    invoke-direct {v0, v10, v13, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v3, v12, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_2
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, La/gol;

    .line 172
    .line 173
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 176
    .line 177
    move-object/from16 v2, p1

    .line 178
    .line 179
    check-cast v2, Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    instance-of v3, v1, La/eol;

    .line 185
    .line 186
    if-eqz v3, :cond_0

    .line 187
    .line 188
    if-eqz v0, :cond_0

    .line 189
    .line 190
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 199
    .line 200
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 203
    .line 204
    move-object/from16 v2, p1

    .line 205
    .line 206
    check-cast v2, Landroid/view/View;

    .line 207
    .line 208
    invoke-static {v1, v0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->B(Lkotlin/jvm/functions/Function0;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Landroid/view/View;)Lkotlin/Unit;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_4
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 216
    .line 217
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Landroid/content/Context;

    .line 220
    .line 221
    move-object/from16 v2, p1

    .line 222
    .line 223
    check-cast v2, Landroid/content/res/TypedArray;

    .line 224
    .line 225
    invoke-static {v1, v0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Landroid/content/Context;Landroid/content/res/TypedArray;)Lkotlin/Unit;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    :pswitch_5
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v1, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 233
    .line 234
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Landroid/content/Context;

    .line 237
    .line 238
    move-object/from16 v2, p1

    .line 239
    .line 240
    check-cast v2, Landroid/content/res/TypedArray;

    .line 241
    .line 242
    invoke-static {v1, v0, v2}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->a(Lorg/xplatform/uikit/components/accordion/DsAccordion;Landroid/content/Context;Landroid/content/res/TypedArray;)Lkotlin/Unit;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    return-object v0

    .line 247
    :pswitch_6
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, La/tzq;

    .line 250
    .line 251
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, La/qfl;

    .line 254
    .line 255
    move-object/from16 v2, p1

    .line 256
    .line 257
    check-cast v2, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    sget-object v3, La/qfl;->O1:[La/iiy;

    .line 264
    .line 265
    iget-object v3, v1, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 266
    .line 267
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 268
    .line 269
    .line 270
    iget-object v1, v1, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 271
    .line 272
    invoke-virtual {v1, v11}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 273
    .line 274
    .line 275
    iget-object v1, v1, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->s:Landroid/widget/Button;

    .line 276
    .line 277
    invoke-virtual {v1, v11}, Landroid/view/View;->setEnabled(Z)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, La/qfl;->H0()La/cgl;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    iget-object v0, v5, La/cgl;->d:La/lzt;

    .line 285
    .line 286
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-nez v0, :cond_1

    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_1
    iget-object v0, v5, La/cgl;->v:La/bby;

    .line 294
    .line 295
    if-eqz v0, :cond_2

    .line 296
    .line 297
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-ne v0, v13, :cond_2

    .line 302
    .line 303
    goto :goto_0

    .line 304
    :cond_2
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v1, v5, La/cgl;->f:La/mne;

    .line 309
    .line 310
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 311
    .line 312
    new-instance v3, La/k0l;

    .line 313
    .line 314
    const-class v6, La/cgl;

    .line 315
    .line 316
    const-string v7, "handleGameError"

    .line 317
    .line 318
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 319
    .line 320
    const/4 v9, 0x0

    .line 321
    const/16 v10, 0x12

    .line 322
    .line 323
    const/4 v4, 0x1

    .line 324
    invoke-direct/range {v3 .. v10}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 325
    .line 326
    .line 327
    new-instance v10, La/iq3;

    .line 328
    .line 329
    invoke-direct {v10, v5, v2, v12, v13}, La/iq3;-><init>(La/w46;ILa/yje;B)V

    .line 330
    .line 331
    .line 332
    const/16 v11, 0xa

    .line 333
    .line 334
    const/4 v8, 0x0

    .line 335
    move-object v6, v0

    .line 336
    move-object v9, v1

    .line 337
    move-object v7, v3

    .line 338
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iput-object v0, v5, La/cgl;->v:La/bby;

    .line 343
    .line 344
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_7
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v1, La/e8l;

    .line 350
    .line 351
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, La/vne;

    .line 354
    .line 355
    move-object/from16 v2, p1

    .line 356
    .line 357
    check-cast v2, La/i8l;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v3, v1, La/e8l;->a:La/b8l;

    .line 363
    .line 364
    iget-object v4, v3, La/b8l;->b:Ljava/lang/String;

    .line 365
    .line 366
    invoke-virtual {v2, v4}, La/i8l;->setRadiantTeamIcon(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    iget-object v4, v3, La/b8l;->c:Ljava/lang/String;

    .line 370
    .line 371
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    iget-object v5, v2, La/i8l;->g:La/p8l;

    .line 375
    .line 376
    const v6, 0x7f0804ac

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5, v6, v4}, La/p8l;->z(ILjava/lang/String;)V

    .line 380
    .line 381
    .line 382
    iget-object v3, v3, La/b8l;->a:Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v2, v3}, La/i8l;->setRadiantTeamName(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v3, v1, La/e8l;->b:La/t7l;

    .line 388
    .line 389
    iget-object v4, v3, La/t7l;->b:Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {v2, v4}, La/i8l;->setDireTeamIcon(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    iget-object v4, v3, La/t7l;->c:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    iget-object v6, v2, La/i8l;->h:La/p8l;

    .line 400
    .line 401
    const v7, 0x7f0804a0

    .line 402
    .line 403
    .line 404
    invoke-virtual {v6, v7, v4}, La/p8l;->z(ILjava/lang/String;)V

    .line 405
    .line 406
    .line 407
    iget-object v3, v3, La/t7l;->a:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v2, v3}, La/i8l;->setDireTeamName(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iget-object v3, v1, La/e8l;->c:Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-virtual {v2, v3}, La/i8l;->setRadiantSelectedHeroes(Ljava/util/List;)V

    .line 415
    .line 416
    .line 417
    iget-object v3, v1, La/e8l;->d:Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-virtual {v2, v3}, La/i8l;->setDireSelectedHeroes(Ljava/util/List;)V

    .line 420
    .line 421
    .line 422
    iget-object v3, v1, La/e8l;->e:La/z7l;

    .line 423
    .line 424
    invoke-virtual {v2, v3}, La/i8l;->setNetWorthRadiant(La/z7l;)V

    .line 425
    .line 426
    .line 427
    iget-object v3, v1, La/e8l;->f:La/r7l;

    .line 428
    .line 429
    invoke-virtual {v2, v3}, La/i8l;->setNetWorthDire(La/r7l;)V

    .line 430
    .line 431
    .line 432
    iget-object v3, v1, La/e8l;->g:La/c8l;

    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    iget-wide v3, v3, La/c8l;->a:J

    .line 438
    .line 439
    invoke-virtual {v5, v3, v4, v0}, La/p8l;->A(JLa/vne;)V

    .line 440
    .line 441
    .line 442
    iget-object v3, v1, La/e8l;->h:La/u7l;

    .line 443
    .line 444
    iget-wide v3, v3, La/u7l;->a:J

    .line 445
    .line 446
    invoke-virtual {v6, v3, v4, v0}, La/p8l;->A(JLa/vne;)V

    .line 447
    .line 448
    .line 449
    iget-object v3, v1, La/e8l;->i:La/y7l;

    .line 450
    .line 451
    iget-wide v7, v3, La/y7l;->a:J

    .line 452
    .line 453
    iget-boolean v3, v3, La/y7l;->b:Z

    .line 454
    .line 455
    invoke-virtual {v5, v7, v8, v3, v0}, La/p8l;->w(JZLa/vne;)V

    .line 456
    .line 457
    .line 458
    iget-object v3, v1, La/e8l;->j:La/q7l;

    .line 459
    .line 460
    iget-wide v4, v3, La/q7l;->a:J

    .line 461
    .line 462
    iget-boolean v3, v3, La/q7l;->b:Z

    .line 463
    .line 464
    invoke-virtual {v6, v4, v5, v3, v0}, La/p8l;->w(JZLa/vne;)V

    .line 465
    .line 466
    .line 467
    iget-object v3, v1, La/e8l;->k:La/d8l;

    .line 468
    .line 469
    invoke-virtual {v2, v3, v0}, La/i8l;->b(La/d8l;La/vne;)V

    .line 470
    .line 471
    .line 472
    iget-object v0, v1, La/e8l;->l:La/x7l;

    .line 473
    .line 474
    iget-object v3, v1, La/e8l;->m:Ljava/util/List;

    .line 475
    .line 476
    iget-object v1, v1, La/e8l;->n:Ljava/util/ArrayList;

    .line 477
    .line 478
    iget-object v4, v2, La/i8l;->f:La/x23;

    .line 479
    .line 480
    iget-object v5, v0, La/x7l;->a:Ljava/lang/String;

    .line 481
    .line 482
    iget-boolean v0, v0, La/x7l;->b:Z

    .line 483
    .line 484
    new-instance v6, La/g8l;

    .line 485
    .line 486
    invoke-direct {v6, v2, v3, v1, v11}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v4, v5, v0, v6}, La/x23;->i(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v3}, La/i8l;->setMapBuildings(Ljava/util/List;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v1}, La/i8l;->setMapHeroes(Ljava/util/List;)V

    .line 496
    .line 497
    .line 498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_8
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v1, La/b9l;

    .line 504
    .line 505
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, La/vne;

    .line 508
    .line 509
    move-object/from16 v2, p1

    .line 510
    .line 511
    check-cast v2, La/d9l;

    .line 512
    .line 513
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    iget-object v3, v1, La/b9l;->a:Ljava/lang/String;

    .line 517
    .line 518
    invoke-virtual {v2, v3}, La/d9l;->setRadiantTeamIcon(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iget-object v3, v1, La/b9l;->b:Ljava/lang/String;

    .line 522
    .line 523
    invoke-virtual {v2, v3}, La/d9l;->setDireTeamIcon(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    iget-object v3, v1, La/b9l;->c:La/x8l;

    .line 527
    .line 528
    invoke-virtual {v2, v3}, La/d9l;->setRadiantSide(La/x8l;)V

    .line 529
    .line 530
    .line 531
    iget-object v3, v1, La/b9l;->d:La/r8l;

    .line 532
    .line 533
    invoke-virtual {v2, v3}, La/d9l;->setDireSide(La/r8l;)V

    .line 534
    .line 535
    .line 536
    iget-object v3, v1, La/b9l;->e:La/w8l;

    .line 537
    .line 538
    invoke-virtual {v2, v3}, La/d9l;->setNetWorth(La/w8l;)V

    .line 539
    .line 540
    .line 541
    iget-object v3, v1, La/b9l;->f:La/a9l;

    .line 542
    .line 543
    invoke-virtual {v2, v3, v0}, La/d9l;->d(La/a9l;La/vne;)V

    .line 544
    .line 545
    .line 546
    iget-object v3, v1, La/b9l;->g:La/q8l;

    .line 547
    .line 548
    invoke-virtual {v2, v3, v0}, La/d9l;->a(La/q8l;La/vne;)V

    .line 549
    .line 550
    .line 551
    iget-object v3, v1, La/b9l;->h:La/z8l;

    .line 552
    .line 553
    invoke-virtual {v2, v3, v0}, La/d9l;->c(La/z8l;La/vne;)V

    .line 554
    .line 555
    .line 556
    iget-object v0, v1, La/b9l;->i:La/v8l;

    .line 557
    .line 558
    iget-object v3, v1, La/b9l;->j:Ljava/util/List;

    .line 559
    .line 560
    iget-object v1, v1, La/b9l;->k:Ljava/util/ArrayList;

    .line 561
    .line 562
    iget-object v4, v2, La/d9l;->u:La/x23;

    .line 563
    .line 564
    iget-object v5, v0, La/v8l;->a:Ljava/lang/String;

    .line 565
    .line 566
    iget-boolean v0, v0, La/v8l;->b:Z

    .line 567
    .line 568
    new-instance v6, La/g8l;

    .line 569
    .line 570
    invoke-direct {v6, v2, v3, v1, v13}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v4, v5, v0, v6}, La/x23;->i(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v3}, La/d9l;->setMapBuildings(Ljava/util/List;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v1}, La/d9l;->setMapHeroes(Ljava/util/List;)V

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_9
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, La/szq;

    .line 588
    .line 589
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, La/szk;

    .line 592
    .line 593
    move-object/from16 v2, p1

    .line 594
    .line 595
    check-cast v2, Landroid/view/View;

    .line 596
    .line 597
    sget-object v3, La/szk;->Q1:[La/iiy;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    iget-object v1, v1, La/szq;->b:La/e0f;

    .line 603
    .line 604
    iget-object v2, v1, La/e0f;->n:Landroid/view/View;

    .line 605
    .line 606
    check-cast v2, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 607
    .line 608
    invoke-virtual {v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->getCenterYFromBottom()I

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    iget-object v3, v1, La/e0f;->g:Landroid/view/View;

    .line 613
    .line 614
    check-cast v3, Landroid/widget/ImageView;

    .line 615
    .line 616
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 617
    .line 618
    .line 619
    move-result v4

    .line 620
    shr-int/2addr v4, v13

    .line 621
    sub-int/2addr v2, v4

    .line 622
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 623
    .line 624
    .line 625
    move-result-object v4

    .line 626
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 630
    .line 631
    iput v2, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 632
    .line 633
    iget-object v4, v1, La/e0f;->i:Landroid/view/View;

    .line 634
    .line 635
    check-cast v4, Landroid/widget/ImageView;

    .line 636
    .line 637
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 645
    .line 646
    iput v2, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 647
    .line 648
    iget-object v2, v1, La/e0f;->n:Landroid/view/View;

    .line 649
    .line 650
    check-cast v2, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 651
    .line 652
    invoke-virtual {v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->getStartYFromBottom()I

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 669
    .line 670
    const/high16 v5, 0x40800000    # 4.0f

    .line 671
    .line 672
    mul-float/2addr v0, v5

    .line 673
    float-to-double v5, v0

    .line 674
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 675
    .line 676
    .line 677
    move-result-wide v5

    .line 678
    double-to-float v0, v5

    .line 679
    float-to-int v0, v0

    .line 680
    add-int/2addr v2, v0

    .line 681
    iget-object v0, v1, La/e0f;->d:Landroid/widget/LinearLayout;

    .line 682
    .line 683
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 691
    .line 692
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 693
    .line 694
    invoke-virtual {v3}, Landroid/view/View;->forceLayout()V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v4}, Landroid/view/View;->forceLayout()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0}, Landroid/view/View;->forceLayout()V

    .line 701
    .line 702
    .line 703
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    return-object v0

    .line 706
    :pswitch_a
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v1, La/v8;

    .line 709
    .line 710
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v0, La/cp;

    .line 713
    .line 714
    move-object/from16 v2, p1

    .line 715
    .line 716
    check-cast v2, Landroid/view/View;

    .line 717
    .line 718
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v1, v0}, La/v8;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_b
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v1, Lokhttp3/internal/cache/DiskLruCache;

    .line 734
    .line 735
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 736
    .line 737
    check-cast v0, Lokhttp3/internal/cache/DiskLruCache$Editor;

    .line 738
    .line 739
    move-object/from16 v2, p1

    .line 740
    .line 741
    check-cast v2, Ljava/io/IOException;

    .line 742
    .line 743
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    monitor-enter v1

    .line 747
    :try_start_0
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache$Editor;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 748
    .line 749
    .line 750
    monitor-exit v1

    .line 751
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    return-object v0

    .line 754
    :catchall_0
    move-exception v0

    .line 755
    monitor-exit v1

    .line 756
    throw v0

    .line 757
    :pswitch_c
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v1, La/yfg;

    .line 760
    .line 761
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, La/cp;

    .line 764
    .line 765
    move-object/from16 v2, p1

    .line 766
    .line 767
    check-cast v2, Landroid/view/View;

    .line 768
    .line 769
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    check-cast v2, La/muk;

    .line 777
    .line 778
    iget-object v2, v2, La/muk;->c:Ljava/lang/String;

    .line 779
    .line 780
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    check-cast v0, La/muk;

    .line 785
    .line 786
    iget-object v0, v0, La/muk;->b:Ljava/lang/String;

    .line 787
    .line 788
    invoke-virtual {v1, v2, v0}, La/yfg;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 792
    .line 793
    return-object v0

    .line 794
    :pswitch_d
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, La/htk;

    .line 797
    .line 798
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 801
    .line 802
    move-object/from16 v2, p1

    .line 803
    .line 804
    check-cast v2, La/hcz;

    .line 805
    .line 806
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    move-object v3, v1

    .line 810
    check-cast v3, La/ftk;

    .line 811
    .line 812
    iget-object v3, v3, La/ftk;->b:La/a4x;

    .line 813
    .line 814
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 815
    .line 816
    .line 817
    move-result v4

    .line 818
    new-instance v5, La/wl0;

    .line 819
    .line 820
    invoke-direct {v5, v3, v8}, La/wl0;-><init>(La/a4x;B)V

    .line 821
    .line 822
    .line 823
    new-instance v6, La/c8;

    .line 824
    .line 825
    const/16 v7, 0x11

    .line 826
    .line 827
    invoke-direct {v6, v3, v1, v0, v7}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 828
    .line 829
    .line 830
    new-instance v0, La/ugd;

    .line 831
    .line 832
    invoke-direct {v0, v10, v13, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v4, v12, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 836
    .line 837
    .line 838
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 839
    .line 840
    return-object v0

    .line 841
    :pswitch_e
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v1, Ljava/lang/String;

    .line 844
    .line 845
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v0, La/pz40;

    .line 848
    .line 849
    move-object/from16 v2, p1

    .line 850
    .line 851
    check-cast v2, La/abi0;

    .line 852
    .line 853
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    check-cast v3, Ljava/lang/Boolean;

    .line 861
    .line 862
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 863
    .line 864
    .line 865
    move-result v3

    .line 866
    invoke-static {v2, v3}, La/cbi0;->d(La/abi0;Z)V

    .line 867
    .line 868
    .line 869
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    check-cast v0, Ljava/lang/Boolean;

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    if-eqz v0, :cond_3

    .line 880
    .line 881
    new-instance v0, La/n0x;

    .line 882
    .line 883
    invoke-direct {v0, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    goto :goto_1

    .line 887
    :cond_3
    new-instance v0, La/m0x;

    .line 888
    .line 889
    const v1, 0x7f080483

    .line 890
    .line 891
    .line 892
    const/4 v3, 0x6

    .line 893
    invoke-direct {v0, v1, v12, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 894
    .line 895
    .line 896
    :goto_1
    invoke-static {v2, v0}, La/cbi0;->b(La/abi0;La/o0x;)V

    .line 897
    .line 898
    .line 899
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_f
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v1, La/y6h;

    .line 905
    .line 906
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v0, La/cp;

    .line 909
    .line 910
    move-object/from16 v2, p1

    .line 911
    .line 912
    check-cast v2, Landroid/view/View;

    .line 913
    .line 914
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    check-cast v0, La/p8k;

    .line 922
    .line 923
    iget-object v0, v0, La/p8k;->a:La/p7k;

    .line 924
    .line 925
    invoke-virtual {v1, v0}, La/y6h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 929
    .line 930
    return-object v0

    .line 931
    :pswitch_10
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v1, La/y6h;

    .line 934
    .line 935
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v0, La/cp;

    .line 938
    .line 939
    move-object/from16 v2, p1

    .line 940
    .line 941
    check-cast v2, Landroid/view/View;

    .line 942
    .line 943
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    check-cast v0, La/o8k;

    .line 951
    .line 952
    iget-object v0, v0, La/o8k;->a:La/n8k;

    .line 953
    .line 954
    invoke-virtual {v1, v0}, La/y6h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 958
    .line 959
    return-object v0

    .line 960
    :pswitch_11
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v1, La/g7k;

    .line 963
    .line 964
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v0, La/b7k;

    .line 967
    .line 968
    move-object/from16 v2, p1

    .line 969
    .line 970
    check-cast v2, La/qpg0;

    .line 971
    .line 972
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    iget-object v1, v1, La/g7k;->b:La/f7k;

    .line 976
    .line 977
    invoke-virtual {v1, v2, v0}, La/f7k;->U(La/qpg0;Ljava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 981
    .line 982
    return-object v0

    .line 983
    :pswitch_12
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v1, La/zrj;

    .line 986
    .line 987
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 988
    .line 989
    check-cast v0, La/tcp;

    .line 990
    .line 991
    move-object/from16 v2, p1

    .line 992
    .line 993
    check-cast v2, La/k0w0;

    .line 994
    .line 995
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    new-instance v4, La/vef;

    .line 999
    .line 1000
    invoke-direct {v4, v1, v0, v3}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1001
    .line 1002
    .line 1003
    new-instance v0, La/a1w0;

    .line 1004
    .line 1005
    invoke-direct {v0, v4}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v2, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v0, La/c8d;

    .line 1015
    .line 1016
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1017
    .line 1018
    new-instance v2, La/v7d;

    .line 1019
    .line 1020
    invoke-direct {v2, v11, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1021
    .line 1022
    .line 1023
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1024
    .line 1025
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1026
    .line 1027
    return-object v0

    .line 1028
    :pswitch_13
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v1, La/e6j;

    .line 1031
    .line 1032
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1033
    .line 1034
    move-object/from16 v16, v0

    .line 1035
    .line 1036
    check-cast v16, La/hm1;

    .line 1037
    .line 1038
    move-object/from16 v0, p1

    .line 1039
    .line 1040
    check-cast v0, La/k0w0;

    .line 1041
    .line 1042
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    iget-object v12, v1, La/e6j;->w:La/peg0;

    .line 1046
    .line 1047
    sget-object v2, La/nw80;->b:La/nw80;

    .line 1048
    .line 1049
    invoke-virtual {v2}, La/nw80;->getId()J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v14

    .line 1053
    iget-object v1, v1, La/e6j;->r:La/ctf0;

    .line 1054
    .line 1055
    new-array v2, v11, [Ljava/lang/Object;

    .line 1056
    .line 1057
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1058
    .line 1059
    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    invoke-virtual {v1, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v13

    .line 1067
    const/16 v17, 0x32

    .line 1068
    .line 1069
    invoke-static/range {v12 .. v17}, La/peg0;->n(La/peg0;Ljava/lang/String;JLa/hm1;I)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v1

    .line 1073
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1074
    .line 1075
    .line 1076
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1077
    .line 1078
    return-object v0

    .line 1079
    :pswitch_14
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v1, La/g3j;

    .line 1082
    .line 1083
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1084
    .line 1085
    move-object/from16 v16, v0

    .line 1086
    .line 1087
    check-cast v16, La/hm1;

    .line 1088
    .line 1089
    move-object/from16 v0, p1

    .line 1090
    .line 1091
    check-cast v0, La/k0w0;

    .line 1092
    .line 1093
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    iget-object v2, v1, La/g3j;->o:Ljava/lang/Object;

    .line 1097
    .line 1098
    move-object v12, v2

    .line 1099
    check-cast v12, La/peg0;

    .line 1100
    .line 1101
    sget-object v2, La/nw80;->b:La/nw80;

    .line 1102
    .line 1103
    invoke-virtual {v2}, La/nw80;->getId()J

    .line 1104
    .line 1105
    .line 1106
    move-result-wide v14

    .line 1107
    iget-object v1, v1, La/g3j;->k:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v1, La/ctf0;

    .line 1110
    .line 1111
    new-array v2, v11, [Ljava/lang/Object;

    .line 1112
    .line 1113
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1114
    .line 1115
    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    invoke-virtual {v1, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v13

    .line 1123
    const/16 v17, 0x32

    .line 1124
    .line 1125
    invoke-static/range {v12 .. v17}, La/peg0;->n(La/peg0;Ljava/lang/String;JLa/hm1;I)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1130
    .line 1131
    .line 1132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1133
    .line 1134
    return-object v0

    .line 1135
    :pswitch_15
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v1, La/f3j;

    .line 1138
    .line 1139
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1140
    .line 1141
    move-object/from16 v16, v0

    .line 1142
    .line 1143
    check-cast v16, La/hm1;

    .line 1144
    .line 1145
    move-object/from16 v0, p1

    .line 1146
    .line 1147
    check-cast v0, La/k0w0;

    .line 1148
    .line 1149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1150
    .line 1151
    .line 1152
    iget-object v2, v1, La/f3j;->k:Ljava/lang/Object;

    .line 1153
    .line 1154
    move-object v12, v2

    .line 1155
    check-cast v12, La/peg0;

    .line 1156
    .line 1157
    sget-object v2, La/nw80;->b:La/nw80;

    .line 1158
    .line 1159
    invoke-virtual {v2}, La/nw80;->getId()J

    .line 1160
    .line 1161
    .line 1162
    move-result-wide v14

    .line 1163
    iget-object v1, v1, La/f3j;->f:Ljava/lang/Object;

    .line 1164
    .line 1165
    check-cast v1, La/ctf0;

    .line 1166
    .line 1167
    new-array v2, v11, [Ljava/lang/Object;

    .line 1168
    .line 1169
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1170
    .line 1171
    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v2

    .line 1175
    invoke-virtual {v1, v7, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v13

    .line 1179
    const/16 v17, 0x32

    .line 1180
    .line 1181
    invoke-static/range {v12 .. v17}, La/peg0;->n(La/peg0;Ljava/lang/String;JLa/hm1;I)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$PartTypeOneScreen;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v1

    .line 1185
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1186
    .line 1187
    .line 1188
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1189
    .line 1190
    return-object v0

    .line 1191
    :pswitch_16
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v1, La/vuh;

    .line 1194
    .line 1195
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1198
    .line 1199
    move-object/from16 v2, p1

    .line 1200
    .line 1201
    check-cast v2, La/hcz;

    .line 1202
    .line 1203
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    move-object v4, v1

    .line 1207
    check-cast v4, La/suh;

    .line 1208
    .line 1209
    iget-object v4, v4, La/suh;->e:La/a4x;

    .line 1210
    .line 1211
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1212
    .line 1213
    .line 1214
    move-result v5

    .line 1215
    new-instance v7, La/wl0;

    .line 1216
    .line 1217
    invoke-direct {v7, v4, v3}, La/wl0;-><init>(La/a4x;B)V

    .line 1218
    .line 1219
    .line 1220
    new-instance v3, La/c8;

    .line 1221
    .line 1222
    const/16 v8, 0x10

    .line 1223
    .line 1224
    invoke-direct {v3, v4, v1, v0, v8}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1225
    .line 1226
    .line 1227
    new-instance v0, La/ugd;

    .line 1228
    .line 1229
    invoke-direct {v0, v6, v13, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v2, v5, v12, v7, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1233
    .line 1234
    .line 1235
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1236
    .line 1237
    return-object v0

    .line 1238
    :pswitch_17
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1239
    .line 1240
    check-cast v1, La/enh;

    .line 1241
    .line 1242
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1245
    .line 1246
    move-object/from16 v3, p1

    .line 1247
    .line 1248
    check-cast v3, La/hcz;

    .line 1249
    .line 1250
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1251
    .line 1252
    .line 1253
    check-cast v1, La/cnh;

    .line 1254
    .line 1255
    iget-object v1, v1, La/cnh;->a:La/a4x;

    .line 1256
    .line 1257
    new-instance v4, La/p1h;

    .line 1258
    .line 1259
    invoke-direct {v4, v2}, La/p1h;-><init>(B)V

    .line 1260
    .line 1261
    .line 1262
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    new-instance v5, La/vtf;

    .line 1267
    .line 1268
    const/16 v7, 0x9

    .line 1269
    .line 1270
    invoke-direct {v5, v4, v1, v7}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1271
    .line 1272
    .line 1273
    new-instance v4, La/wl0;

    .line 1274
    .line 1275
    const/16 v7, 0x16

    .line 1276
    .line 1277
    invoke-direct {v4, v1, v7}, La/wl0;-><init>(La/a4x;B)V

    .line 1278
    .line 1279
    .line 1280
    new-instance v7, La/ws1;

    .line 1281
    .line 1282
    invoke-direct {v7, v1, v0, v9}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 1283
    .line 1284
    .line 1285
    new-instance v0, La/ugd;

    .line 1286
    .line 1287
    invoke-direct {v0, v6, v13, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v3, v2, v5, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1291
    .line 1292
    .line 1293
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1294
    .line 1295
    return-object v0

    .line 1296
    :pswitch_18
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast v1, La/bnh;

    .line 1299
    .line 1300
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1301
    .line 1302
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1303
    .line 1304
    move-object/from16 v3, p1

    .line 1305
    .line 1306
    check-cast v3, La/hcz;

    .line 1307
    .line 1308
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    check-cast v1, La/zmh;

    .line 1312
    .line 1313
    iget-object v1, v1, La/zmh;->a:La/a4x;

    .line 1314
    .line 1315
    new-instance v5, La/p1h;

    .line 1316
    .line 1317
    const/16 v7, 0x13

    .line 1318
    .line 1319
    invoke-direct {v5, v7}, La/p1h;-><init>(B)V

    .line 1320
    .line 1321
    .line 1322
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1323
    .line 1324
    .line 1325
    move-result v7

    .line 1326
    new-instance v8, La/vtf;

    .line 1327
    .line 1328
    invoke-direct {v8, v5, v1, v4}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1329
    .line 1330
    .line 1331
    new-instance v4, La/wl0;

    .line 1332
    .line 1333
    invoke-direct {v4, v1, v2}, La/wl0;-><init>(La/a4x;B)V

    .line 1334
    .line 1335
    .line 1336
    new-instance v2, La/ws1;

    .line 1337
    .line 1338
    const/16 v5, 0xb

    .line 1339
    .line 1340
    invoke-direct {v2, v1, v0, v5}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 1341
    .line 1342
    .line 1343
    new-instance v0, La/ugd;

    .line 1344
    .line 1345
    invoke-direct {v0, v6, v13, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v3, v7, v8, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1349
    .line 1350
    .line 1351
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1352
    .line 1353
    return-object v0

    .line 1354
    :pswitch_19
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v1, La/thh;

    .line 1357
    .line 1358
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1359
    .line 1360
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1361
    .line 1362
    move-object/from16 v2, p1

    .line 1363
    .line 1364
    check-cast v2, La/hcz;

    .line 1365
    .line 1366
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    iget-object v3, v1, La/thh;->b:La/a4x;

    .line 1370
    .line 1371
    new-instance v4, La/m7h;

    .line 1372
    .line 1373
    invoke-direct {v4, v9}, La/m7h;-><init>(B)V

    .line 1374
    .line 1375
    .line 1376
    invoke-static {v3, v4}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v4

    .line 1380
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1381
    .line 1382
    .line 1383
    move-result v6

    .line 1384
    new-instance v7, La/dx8;

    .line 1385
    .line 1386
    invoke-direct {v7, v4, v8}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 1387
    .line 1388
    .line 1389
    new-instance v4, La/dx8;

    .line 1390
    .line 1391
    invoke-direct {v4, v3, v5}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 1392
    .line 1393
    .line 1394
    new-instance v5, La/c8;

    .line 1395
    .line 1396
    const/16 v8, 0xf

    .line 1397
    .line 1398
    invoke-direct {v5, v3, v1, v0, v8}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1399
    .line 1400
    .line 1401
    new-instance v0, La/ugd;

    .line 1402
    .line 1403
    const v1, -0x4e295cff

    .line 1404
    .line 1405
    .line 1406
    invoke-direct {v0, v1, v13, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v2, v6, v7, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1410
    .line 1411
    .line 1412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1413
    .line 1414
    return-object v0

    .line 1415
    :pswitch_1a
    iget-object v1, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1416
    .line 1417
    check-cast v1, La/cp;

    .line 1418
    .line 1419
    iget-object v0, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v0, La/qpg;

    .line 1422
    .line 1423
    move-object/from16 v2, p1

    .line 1424
    .line 1425
    check-cast v2, Ljava/util/List;

    .line 1426
    .line 1427
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1431
    .line 1432
    check-cast v2, La/vjd;

    .line 1433
    .line 1434
    iget-object v2, v2, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 1435
    .line 1436
    sget-object v3, La/pek0;->g:La/pek0;

    .line 1437
    .line 1438
    new-instance v4, La/eod;

    .line 1439
    .line 1440
    const/16 v5, 0x1d

    .line 1441
    .line 1442
    invoke-direct {v4, v1, v0, v5}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1443
    .line 1444
    .line 1445
    new-instance v0, La/ugd;

    .line 1446
    .line 1447
    const v1, 0x586ea828

    .line 1448
    .line 1449
    .line 1450
    invoke-direct {v0, v1, v13, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-static {v2, v3, v12, v0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 1454
    .line 1455
    .line 1456
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1457
    .line 1458
    return-object v0

    .line 1459
    :pswitch_1b
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1460
    .line 1461
    check-cast v1, La/h7h;

    .line 1462
    .line 1463
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1464
    .line 1465
    check-cast v0, La/k7h;

    .line 1466
    .line 1467
    move-object/from16 v2, p1

    .line 1468
    .line 1469
    check-cast v2, La/abi0;

    .line 1470
    .line 1471
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    iget-wide v3, v1, La/h7h;->a:J

    .line 1475
    .line 1476
    iget-wide v0, v0, La/k7h;->c:J

    .line 1477
    .line 1478
    cmp-long v0, v3, v0

    .line 1479
    .line 1480
    if-nez v0, :cond_4

    .line 1481
    .line 1482
    move v11, v13

    .line 1483
    :cond_4
    invoke-static {v2, v11}, La/yai0;->f(La/abi0;Z)V

    .line 1484
    .line 1485
    .line 1486
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1487
    .line 1488
    return-object v0

    .line 1489
    :pswitch_1c
    iget-object v1, v0, La/ngh;->b:Ljava/lang/Object;

    .line 1490
    .line 1491
    check-cast v1, La/z9f;

    .line 1492
    .line 1493
    iget-object v0, v0, La/ngh;->c:Ljava/lang/Object;

    .line 1494
    .line 1495
    check-cast v0, La/cp;

    .line 1496
    .line 1497
    move-object/from16 v2, p1

    .line 1498
    .line 1499
    check-cast v2, Landroid/view/View;

    .line 1500
    .line 1501
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v0

    .line 1508
    check-cast v0, La/p6t0;

    .line 1509
    .line 1510
    invoke-virtual {v1, v0}, La/z9f;->e(La/p6t0;)V

    .line 1511
    .line 1512
    .line 1513
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1514
    .line 1515
    return-object v0

    .line 1516
    nop

    .line 1517
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
