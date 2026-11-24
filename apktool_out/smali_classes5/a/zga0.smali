.class public final synthetic La/zga0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/g9b0;Ljava/lang/String;La/cp;)V
    .locals 0

    .line 1
    const/16 p2, 0xe

    iput-byte p2, p0, La/zga0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zga0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/zga0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/zga0;->a:B

    iput-object p1, p0, La/zga0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/zga0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/era0;B)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/zga0;->a:B

    iput-object p1, p0, La/zga0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zga0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zga0;->a:B

    .line 4
    .line 5
    const v3, 0x799532c4

    .line 6
    .line 7
    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    const/16 v7, 0x13

    .line 14
    .line 15
    const/16 v8, 0x18

    .line 16
    .line 17
    const/16 v9, 0x17

    .line 18
    .line 19
    const/4 v10, 0x3

    .line 20
    const/16 v11, 0x14

    .line 21
    .line 22
    const-string v12, ""

    .line 23
    .line 24
    const/4 v14, 0x0

    .line 25
    const/4 v15, 0x0

    .line 26
    const/4 v2, 0x1

    .line 27
    iget-object v13, v0, La/zga0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v0, v0, La/zga0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    check-cast v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 35
    .line 36
    check-cast v13, Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Throwable;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v2, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->t:La/duj;

    .line 46
    .line 47
    new-instance v3, La/r7a0;

    .line 48
    .line 49
    invoke-direct {v3, v0, v13, v11}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    instance-of v2, v1, La/zhi0;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    check-cast v1, La/zhi0;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object v1, v14

    .line 63
    :goto_0
    if-eqz v1, :cond_1

    .line 64
    .line 65
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    invoke-interface {v1}, La/kuw;->getErrorCode()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    :cond_1
    iget-object v1, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->v:La/b4j;

    .line 78
    .line 79
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v1, v1, La/b4j;->a:La/kt2;

    .line 87
    .line 88
    const-string v3, "promocode_activate_error"

    .line 89
    .line 90
    const-string v4, "error_code"

    .line 91
    .line 92
    invoke-static {v4, v2, v1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->w:La/ix0;

    .line 96
    .line 97
    if-eqz v14, :cond_2

    .line 98
    .line 99
    iget-object v0, v0, La/ix0;->a:La/s1p;

    .line 100
    .line 101
    new-instance v1, La/i1p;

    .line 102
    .line 103
    invoke-direct {v1, v14}, La/i1p;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-wide/16 v2, 0xc15

    .line 111
    .line 112
    invoke-virtual {v0, v1, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 113
    .line 114
    .line 115
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_0
    check-cast v0, La/l8c0;

    .line 119
    .line 120
    check-cast v13, La/b0c0;

    .line 121
    .line 122
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, La/cp;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 130
    .line 131
    check-cast v2, La/v2k;

    .line 132
    .line 133
    iget-object v3, v2, La/v2k;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 134
    .line 135
    new-instance v4, La/p0z;

    .line 136
    .line 137
    const/16 v5, 0x1a

    .line 138
    .line 139
    invoke-direct {v4, v0, v5}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->setOnItemClickListener(La/xdr;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v2, La/v2k;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 146
    .line 147
    new-instance v2, La/l910;

    .line 148
    .line 149
    invoke-direct {v2, v13, v8}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, La/ctv;

    .line 156
    .line 157
    invoke-direct {v0, v1, v1, v7}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 161
    .line 162
    .line 163
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_1
    check-cast v0, Ljava/lang/String;

    .line 167
    .line 168
    check-cast v13, La/l8c0;

    .line 169
    .line 170
    move-object/from16 v15, p1

    .line 171
    .line 172
    check-cast v15, La/cp;

    .line 173
    .line 174
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v1, La/bg5;

    .line 178
    .line 179
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v2, La/ksc0;

    .line 183
    .line 184
    invoke-direct {v2, v6}, La/ksc0;-><init>(B)V

    .line 185
    .line 186
    .line 187
    new-instance v3, La/ljc0;

    .line 188
    .line 189
    invoke-direct {v3, v5}, La/ljc0;-><init>(B)V

    .line 190
    .line 191
    .line 192
    new-instance v4, La/o5c0;

    .line 193
    .line 194
    const/16 v5, 0xd

    .line 195
    .line 196
    invoke-direct {v4, v10, v5}, La/o5c0;-><init>(IB)V

    .line 197
    .line 198
    .line 199
    sget-object v5, La/x4c0;->p:La/x4c0;

    .line 200
    .line 201
    new-instance v6, La/gbn;

    .line 202
    .line 203
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v1, La/zz3;->d:La/dp;

    .line 207
    .line 208
    invoke-virtual {v2, v6}, La/dp;->b(La/gbn;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v0, v13}, La/m2x;->A(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v2, v0}, La/dp;->b(La/gbn;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v15, La/cp;->u:La/yfu0;

    .line 219
    .line 220
    check-cast v0, La/l2k;

    .line 221
    .line 222
    iget-object v0, v0, La/l2k;->b:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 225
    .line 226
    .line 227
    new-instance v14, La/if6;

    .line 228
    .line 229
    const/16 v19, 0x7

    .line 230
    .line 231
    move-object/from16 v17, v15

    .line 232
    .line 233
    move-object/from16 v18, v1

    .line 234
    .line 235
    move-object/from16 v16, v1

    .line 236
    .line 237
    invoke-direct/range {v14 .. v19}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v15, v14}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_2
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 247
    .line 248
    check-cast v13, La/m4c0;

    .line 249
    .line 250
    move-object/from16 v1, p1

    .line 251
    .line 252
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-interface {v0, v1, v13}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Ljava/lang/Boolean;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_3
    check-cast v0, La/b2c0;

    .line 268
    .line 269
    check-cast v13, La/m2c0;

    .line 270
    .line 271
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, La/k0w0;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v0, v0, La/b2c0;->w:La/mi70;

    .line 279
    .line 280
    new-instance v2, La/xbi0;

    .line 281
    .line 282
    iget-object v3, v13, La/m2c0;->Z:Ljava/lang/String;

    .line 283
    .line 284
    const/16 v4, 0x19

    .line 285
    .line 286
    invoke-direct {v2, v3, v4, v15}, La/xbi0;-><init>(Ljava/lang/String;IZ)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 293
    .line 294
    invoke-direct {v0, v2}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 298
    .line 299
    .line 300
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_4
    check-cast v0, La/yn90;

    .line 304
    .line 305
    check-cast v13, La/cp;

    .line 306
    .line 307
    move-object/from16 v1, p1

    .line 308
    .line 309
    check-cast v1, Landroid/text/Editable;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v13}, La/cp;->u()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    check-cast v2, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 319
    .line 320
    iget-object v2, v2, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->a:La/w2c0;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {v0, v2, v1}, La/yn90;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    iget-object v0, v13, La/cp;->u:La/yfu0;

    .line 330
    .line 331
    check-cast v0, La/vwx;

    .line 332
    .line 333
    iget-object v1, v0, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 334
    .line 335
    invoke-virtual {v1, v12}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 336
    .line 337
    .line 338
    iget-object v0, v0, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 339
    .line 340
    invoke-virtual {v0, v15}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_5
    check-cast v0, La/e9b0;

    .line 347
    .line 348
    check-cast v13, La/cp;

    .line 349
    .line 350
    move-object/from16 v1, p1

    .line 351
    .line 352
    check-cast v1, Landroid/view/View;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v13}, La/cp;->u()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 362
    .line 363
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->a:La/w2c0;

    .line 364
    .line 365
    invoke-virtual {v0, v1}, La/e9b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_6
    check-cast v0, La/cyb0;

    .line 372
    .line 373
    check-cast v13, La/dyb0;

    .line 374
    .line 375
    move-object/from16 v1, p1

    .line 376
    .line 377
    check-cast v1, Landroid/view/View;

    .line 378
    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, La/xhe0;->d()I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    const/4 v1, -0x1

    .line 387
    if-eq v0, v1, :cond_4

    .line 388
    .line 389
    iget-object v1, v13, La/dyb0;->e:Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, La/vxb0;

    .line 396
    .line 397
    instance-of v1, v0, La/txb0;

    .line 398
    .line 399
    if-eqz v1, :cond_3

    .line 400
    .line 401
    move-object v14, v0

    .line 402
    check-cast v14, La/txb0;

    .line 403
    .line 404
    :cond_3
    if-eqz v14, :cond_4

    .line 405
    .line 406
    iget-object v0, v13, La/dyb0;->d:La/pf10;

    .line 407
    .line 408
    invoke-virtual {v0, v14}, La/pf10;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_7
    check-cast v0, La/vsb0;

    .line 415
    .line 416
    check-cast v13, La/usb0;

    .line 417
    .line 418
    move-object/from16 v1, p1

    .line 419
    .line 420
    check-cast v1, La/qpg0;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    iget-object v0, v0, La/vsb0;->b:La/f7k;

    .line 426
    .line 427
    invoke-virtual {v0, v1, v13}, La/f7k;->U(La/qpg0;Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    return-object v0

    .line 433
    :pswitch_8
    check-cast v0, La/rb5;

    .line 434
    .line 435
    check-cast v13, La/ckd;

    .line 436
    .line 437
    move-object/from16 v1, p1

    .line 438
    .line 439
    check-cast v1, La/lwk;

    .line 440
    .line 441
    invoke-virtual {v0, v13}, La/rb5;->a(La/c2;)V

    .line 442
    .line 443
    .line 444
    new-instance v1, La/pr0;

    .line 445
    .line 446
    const/16 v2, 0x12

    .line 447
    .line 448
    invoke-direct {v1, v0, v13, v2}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 449
    .line 450
    .line 451
    return-object v1

    .line 452
    :pswitch_9
    check-cast v0, La/zrb0;

    .line 453
    .line 454
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 455
    .line 456
    move-object/from16 v1, p1

    .line 457
    .line 458
    check-cast v1, Landroid/view/View;

    .line 459
    .line 460
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    iget-object v1, v0, La/zrb0;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 464
    .line 465
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    if-nez v2, :cond_5

    .line 470
    .line 471
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-virtual {v2}, Landroid/view/View;->clearFocus()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->c()V

    .line 492
    .line 493
    .line 494
    iget-object v1, v0, La/zrb0;->l:La/xrb0;

    .line 495
    .line 496
    invoke-virtual {v1, v15}, Landroid/view/View;->setVisibility(I)V

    .line 497
    .line 498
    .line 499
    iget-object v1, v0, La/zrb0;->n:La/jc50;

    .line 500
    .line 501
    invoke-virtual {v1}, La/jc50;->a()V

    .line 502
    .line 503
    .line 504
    iget-object v1, v0, La/zrb0;->i:Lkotlin/jvm/functions/Function0;

    .line 505
    .line 506
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    iget-object v0, v0, La/zrb0;->j:Lkotlin/jvm/functions/Function1;

    .line 510
    .line 511
    if-eqz v0, :cond_6

    .line 512
    .line 513
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 514
    .line 515
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    goto :goto_1

    .line 519
    :cond_5
    invoke-interface {v13}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    :cond_6
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_a
    check-cast v0, La/m2c0;

    .line 526
    .line 527
    check-cast v13, La/pmb0;

    .line 528
    .line 529
    move-object/from16 v1, p1

    .line 530
    .line 531
    check-cast v1, La/k0w0;

    .line 532
    .line 533
    iget-boolean v0, v0, La/m2c0;->a0:Z

    .line 534
    .line 535
    iget-object v3, v13, La/pmb0;->f0:La/svs0;

    .line 536
    .line 537
    if-eqz v0, :cond_7

    .line 538
    .line 539
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    new-instance v0, Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;

    .line 543
    .line 544
    invoke-direct {v0, v2}, Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;-><init>(Z)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 548
    .line 549
    .line 550
    goto :goto_2

    .line 551
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    new-instance v0, Lorg/xplatform/security/impl/presentation/otp_authenticator/OtpScreens$AddTwoFactoryAuthenticationScreen;

    .line 555
    .line 556
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 560
    .line 561
    .line 562
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    return-object v0

    .line 565
    :pswitch_b
    check-cast v0, La/l0b0;

    .line 566
    .line 567
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 568
    .line 569
    move-object/from16 v1, p1

    .line 570
    .line 571
    check-cast v1, La/hcz;

    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    iget-object v0, v0, La/l0b0;->a:La/a4x;

    .line 577
    .line 578
    new-instance v5, La/j3b0;

    .line 579
    .line 580
    invoke-direct {v5, v4}, La/j3b0;-><init>(B)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    new-instance v6, La/zu90;

    .line 588
    .line 589
    const/16 v7, 0x10

    .line 590
    .line 591
    invoke-direct {v6, v7, v5, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    new-instance v5, La/a580;

    .line 595
    .line 596
    const/16 v7, 0x1c

    .line 597
    .line 598
    invoke-direct {v5, v0, v7}, La/a580;-><init>(Ljava/util/List;B)V

    .line 599
    .line 600
    .line 601
    new-instance v7, La/a100;

    .line 602
    .line 603
    invoke-direct {v7, v0, v13, v9}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 604
    .line 605
    .line 606
    new-instance v0, La/ugd;

    .line 607
    .line 608
    invoke-direct {v0, v3, v2, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1, v4, v6, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 612
    .line 613
    .line 614
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_c
    check-cast v0, La/tjb0;

    .line 618
    .line 619
    check-cast v13, La/rbb;

    .line 620
    .line 621
    move-object/from16 v1, p1

    .line 622
    .line 623
    check-cast v1, La/k0w0;

    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    new-instance v3, La/gv60;

    .line 629
    .line 630
    const/4 v4, 0x5

    .line 631
    invoke-direct {v3, v0, v13, v14, v4}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 632
    .line 633
    .line 634
    new-instance v0, La/b1w0;

    .line 635
    .line 636
    invoke-direct {v0, v3}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v0, La/c8d;

    .line 646
    .line 647
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 648
    .line 649
    new-instance v3, La/v7d;

    .line 650
    .line 651
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 652
    .line 653
    .line 654
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 655
    .line 656
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 657
    .line 658
    return-object v0

    .line 659
    :pswitch_d
    move-object v3, v0

    .line 660
    check-cast v3, La/ccb0;

    .line 661
    .line 662
    check-cast v13, La/pv40;

    .line 663
    .line 664
    move-object/from16 v0, p1

    .line 665
    .line 666
    check-cast v0, La/kjb0;

    .line 667
    .line 668
    sget-object v1, La/ccb0;->X1:La/mi70;

    .line 669
    .line 670
    sget-object v5, La/rek0;->b:La/rek0;

    .line 671
    .line 672
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    instance-of v1, v0, La/bjb0;

    .line 676
    .line 677
    if-eqz v1, :cond_9

    .line 678
    .line 679
    check-cast v0, La/bjb0;

    .line 680
    .line 681
    iget-object v1, v0, La/bjb0;->b:Ljava/lang/String;

    .line 682
    .line 683
    iget-object v6, v0, La/bjb0;->a:Ljava/lang/String;

    .line 684
    .line 685
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 686
    .line 687
    if-nez v0, :cond_8

    .line 688
    .line 689
    new-instance v0, Landroid/os/Bundle;

    .line 690
    .line 691
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 695
    .line 696
    .line 697
    :cond_8
    const-string v2, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 698
    .line 699
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3}, La/ccb0;->G0()La/ii;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 707
    .line 708
    const v1, 0x7f130162

    .line 709
    .line 710
    .line 711
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    const v1, 0x7f1304ff

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    const v1, 0x7f130e5c

    .line 726
    .line 727
    .line 728
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    sget-object v13, La/n12;->a:La/n12;

    .line 733
    .line 734
    const/4 v14, 0x0

    .line 735
    const/16 v15, 0x5d0

    .line 736
    .line 737
    const/4 v9, 0x0

    .line 738
    const-string v10, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 739
    .line 740
    const/4 v11, 0x0

    .line 741
    const/4 v12, 0x0

    .line 742
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 753
    .line 754
    .line 755
    goto/16 :goto_3

    .line 756
    .line 757
    :cond_9
    instance-of v1, v0, La/yib0;

    .line 758
    .line 759
    if-eqz v1, :cond_b

    .line 760
    .line 761
    check-cast v0, La/yib0;

    .line 762
    .line 763
    iget-object v0, v0, La/yib0;->a:La/ckv;

    .line 764
    .line 765
    sget-object v1, La/ckv;->a:La/ckv;

    .line 766
    .line 767
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    if-eqz v0, :cond_a

    .line 772
    .line 773
    invoke-virtual {v3}, La/ccb0;->H0()La/wdk0;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    new-instance v2, La/xdk0;

    .line 778
    .line 779
    const v0, 0x7f13002c

    .line 780
    .line 781
    .line 782
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v6

    .line 786
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    const/4 v10, 0x0

    .line 790
    const/16 v11, 0x7c

    .line 791
    .line 792
    const/4 v7, 0x0

    .line 793
    const/4 v8, 0x0

    .line 794
    const/4 v9, 0x0

    .line 795
    move-object v4, v2

    .line 796
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 797
    .line 798
    .line 799
    const/16 v8, 0x3fc

    .line 800
    .line 801
    const/4 v4, 0x0

    .line 802
    const/4 v5, 0x0

    .line 803
    const/4 v6, 0x0

    .line 804
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 805
    .line 806
    .line 807
    goto/16 :goto_3

    .line 808
    .line 809
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 810
    .line 811
    .line 812
    goto/16 :goto_4

    .line 813
    .line 814
    :cond_b
    sget-object v1, La/cjb0;->a:La/cjb0;

    .line 815
    .line 816
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    move-result v1

    .line 820
    const-string v4, "alertsPipeReceiver"

    .line 821
    .line 822
    if-eqz v1, :cond_d

    .line 823
    .line 824
    iget-object v0, v3, La/ccb0;->O1:La/r12;

    .line 825
    .line 826
    if-eqz v0, :cond_c

    .line 827
    .line 828
    new-instance v1, La/q12;

    .line 829
    .line 830
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    sget-object v4, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$KzFirstDepositBottom;->a:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$KzFirstDepositBottom;

    .line 838
    .line 839
    invoke-direct {v1, v4, v2, v12}, La/q12;-><init>(Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    check-cast v0, La/s12;

    .line 843
    .line 844
    invoke-virtual {v0, v1}, La/s12;->a(La/q12;)V

    .line 845
    .line 846
    .line 847
    goto/16 :goto_3

    .line 848
    .line 849
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    throw v14

    .line 853
    :cond_d
    instance-of v1, v0, La/hjb0;

    .line 854
    .line 855
    if-eqz v1, :cond_e

    .line 856
    .line 857
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 858
    .line 859
    new-array v1, v15, [Ljava/lang/String;

    .line 860
    .line 861
    invoke-static {v3, v0, v1}, La/m7x;->P(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {v0}, La/khf0;->d()La/qog0;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    iget-object v1, v0, La/qog0;->b:Landroid/app/Activity;

    .line 870
    .line 871
    iget-object v4, v0, La/qog0;->c:[Ljava/lang/String;

    .line 872
    .line 873
    invoke-static {v4}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    invoke-static {v1, v4}, La/n4c;->J(Landroid/app/Activity;Ljava/util/List;)Ljava/util/ArrayList;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    invoke-static {v1}, La/n7x;->r(Ljava/util/ArrayList;)Z

    .line 882
    .line 883
    .line 884
    move-result v1

    .line 885
    new-instance v4, La/g8b0;

    .line 886
    .line 887
    const/4 v5, 0x2

    .line 888
    invoke-direct {v4, v3, v5}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 889
    .line 890
    .line 891
    iput-object v4, v0, La/qog0;->e:Lkotlin/jvm/functions/Function0;

    .line 892
    .line 893
    new-instance v4, La/s6b0;

    .line 894
    .line 895
    invoke-direct {v4, v0, v3, v1, v2}, La/s6b0;-><init>(La/qog0;La/yx5;ZB)V

    .line 896
    .line 897
    .line 898
    iget-object v1, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 899
    .line 900
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    invoke-virtual {v0}, La/qog0;->a()V

    .line 904
    .line 905
    .line 906
    goto/16 :goto_3

    .line 907
    .line 908
    :cond_e
    sget-object v1, La/ijb0;->a:La/ijb0;

    .line 909
    .line 910
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    if-eqz v1, :cond_f

    .line 915
    .line 916
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    iget-object v0, v13, La/pv40;->e:La/qoj0;

    .line 920
    .line 921
    iget-object v1, v13, La/pv40;->d:La/pz40;

    .line 922
    .line 923
    check-cast v1, La/hgk0;

    .line 924
    .line 925
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    new-instance v2, Lkotlin/Pair;

    .line 930
    .line 931
    sget-object v4, La/slb0;->a:La/slb0;

    .line 932
    .line 933
    invoke-direct {v2, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v0, v2}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    goto/16 :goto_3

    .line 940
    .line 941
    :cond_f
    sget-object v1, La/ajb0;->a:La/ajb0;

    .line 942
    .line 943
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v1

    .line 947
    if-eqz v1, :cond_10

    .line 948
    .line 949
    invoke-virtual {v3}, La/ccb0;->G0()La/ii;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 954
    .line 955
    const v1, 0x7f13005b

    .line 956
    .line 957
    .line 958
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v5

    .line 962
    const v1, 0x7f130762

    .line 963
    .line 964
    .line 965
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 966
    .line 967
    .line 968
    move-result-object v6

    .line 969
    const v1, 0x7f130e5d

    .line 970
    .line 971
    .line 972
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v7

    .line 976
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    const v1, 0x7f13032f

    .line 980
    .line 981
    .line 982
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v8

    .line 986
    sget-object v13, La/n12;->a:La/n12;

    .line 987
    .line 988
    const/4 v14, 0x0

    .line 989
    const/16 v15, 0x5d0

    .line 990
    .line 991
    const/4 v9, 0x0

    .line 992
    const-string v10, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY"

    .line 993
    .line 994
    const/4 v11, 0x0

    .line 995
    const/4 v12, 0x0

    .line 996
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v1

    .line 1003
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1007
    .line 1008
    .line 1009
    goto/16 :goto_3

    .line 1010
    .line 1011
    :cond_10
    instance-of v1, v0, La/jjb0;

    .line 1012
    .line 1013
    if-eqz v1, :cond_11

    .line 1014
    .line 1015
    check-cast v0, La/jjb0;

    .line 1016
    .line 1017
    iget-object v6, v0, La/jjb0;->a:Ljava/lang/String;

    .line 1018
    .line 1019
    invoke-virtual {v3}, La/ccb0;->H0()La/wdk0;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    new-instance v2, La/xdk0;

    .line 1024
    .line 1025
    const/4 v10, 0x0

    .line 1026
    const/16 v11, 0x7c

    .line 1027
    .line 1028
    const/4 v7, 0x0

    .line 1029
    const/4 v8, 0x0

    .line 1030
    const/4 v9, 0x0

    .line 1031
    move-object v4, v2

    .line 1032
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1033
    .line 1034
    .line 1035
    const/16 v8, 0x3fc

    .line 1036
    .line 1037
    const/4 v4, 0x0

    .line 1038
    const/4 v5, 0x0

    .line 1039
    const/4 v6, 0x0

    .line 1040
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1041
    .line 1042
    .line 1043
    goto/16 :goto_3

    .line 1044
    .line 1045
    :cond_11
    sget-object v1, La/djb0;->a:La/djb0;

    .line 1046
    .line 1047
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v1

    .line 1051
    if-eqz v1, :cond_13

    .line 1052
    .line 1053
    iget-object v0, v3, La/ccb0;->O1:La/r12;

    .line 1054
    .line 1055
    if-eqz v0, :cond_12

    .line 1056
    .line 1057
    new-instance v1, La/q12;

    .line 1058
    .line 1059
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    const-string v4, "KZ_IDENTIFICATION_ALERT_REQUEST_KEY"

    .line 1067
    .line 1068
    sget-object v5, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$IdentificationAlertKzAlert;->a:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$IdentificationAlertKzAlert;

    .line 1069
    .line 1070
    invoke-direct {v1, v5, v2, v4}, La/q12;-><init>(Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    check-cast v0, La/s12;

    .line 1074
    .line 1075
    invoke-virtual {v0, v1}, La/s12;->a(La/q12;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v3}, La/ccb0;->I0()La/k3t0;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    sget-object v1, La/xxa0;->a:La/xxa0;

    .line 1083
    .line 1084
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    goto/16 :goto_3

    .line 1088
    .line 1089
    :cond_12
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1090
    .line 1091
    .line 1092
    throw v14

    .line 1093
    :cond_13
    instance-of v1, v0, La/ejb0;

    .line 1094
    .line 1095
    if-eqz v1, :cond_14

    .line 1096
    .line 1097
    check-cast v0, La/ejb0;

    .line 1098
    .line 1099
    iget-object v6, v0, La/ejb0;->a:Ljava/lang/String;

    .line 1100
    .line 1101
    invoke-virtual {v3}, La/ccb0;->G0()La/ii;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1106
    .line 1107
    const v1, 0x7f130d19

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v5

    .line 1114
    const v1, 0x7f130d18

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v7

    .line 1121
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    sget-object v13, La/n12;->a:La/n12;

    .line 1125
    .line 1126
    const/4 v14, 0x0

    .line 1127
    const/16 v15, 0x5f8

    .line 1128
    .line 1129
    const/4 v8, 0x0

    .line 1130
    const/4 v9, 0x0

    .line 1131
    const/4 v10, 0x0

    .line 1132
    const/4 v11, 0x0

    .line 1133
    const/4 v12, 0x0

    .line 1134
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1145
    .line 1146
    .line 1147
    goto/16 :goto_3

    .line 1148
    .line 1149
    :cond_14
    sget-object v1, La/fjb0;->a:La/fjb0;

    .line 1150
    .line 1151
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v1

    .line 1155
    const v2, 0x7f130985

    .line 1156
    .line 1157
    .line 1158
    if-eqz v1, :cond_15

    .line 1159
    .line 1160
    invoke-virtual {v3}, La/ccb0;->G0()La/ii;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    const v1, 0x7f13145c

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v6

    .line 1171
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v7

    .line 1175
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1176
    .line 1177
    .line 1178
    sget-object v13, La/n12;->a:La/n12;

    .line 1179
    .line 1180
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1181
    .line 1182
    const/4 v14, 0x0

    .line 1183
    const/16 v15, 0x5d9

    .line 1184
    .line 1185
    const/4 v5, 0x0

    .line 1186
    const/4 v8, 0x0

    .line 1187
    const/4 v9, 0x0

    .line 1188
    const-string v10, "SWITCH_ON_NOTIFICATION_INFO_DIALOG_REQUEST_KEY"

    .line 1189
    .line 1190
    const/4 v11, 0x0

    .line 1191
    const/4 v12, 0x0

    .line 1192
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1203
    .line 1204
    .line 1205
    goto :goto_3

    .line 1206
    :cond_15
    sget-object v1, La/gjb0;->a:La/gjb0;

    .line 1207
    .line 1208
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v1

    .line 1212
    if-eqz v1, :cond_16

    .line 1213
    .line 1214
    sget v0, La/hvo0;->k2:I

    .line 1215
    .line 1216
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1221
    .line 1222
    .line 1223
    const-string v1, "TaxInfoDialog"

    .line 1224
    .line 1225
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v2

    .line 1229
    if-nez v2, :cond_17

    .line 1230
    .line 1231
    new-instance v2, La/hvo0;

    .line 1232
    .line 1233
    invoke-direct {v2}, La/hvo0;-><init>()V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v2, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    goto :goto_3

    .line 1240
    :cond_16
    sget-object v1, La/zib0;->a:La/zib0;

    .line 1241
    .line 1242
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    if-eqz v0, :cond_18

    .line 1247
    .line 1248
    invoke-virtual {v3}, La/ccb0;->G0()La/ii;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1253
    .line 1254
    const v1, 0x7f1300e0

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v5

    .line 1261
    const v1, 0x7f1300df

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v6

    .line 1268
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v7

    .line 1272
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1273
    .line 1274
    .line 1275
    const v1, 0x7f130479

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v8

    .line 1282
    sget-object v13, La/n12;->b:La/n12;

    .line 1283
    .line 1284
    const/4 v14, 0x0

    .line 1285
    const/16 v15, 0x5d0

    .line 1286
    .line 1287
    const/4 v9, 0x0

    .line 1288
    const-string v10, "KEY_2FA_ALERT"

    .line 1289
    .line 1290
    const/4 v11, 0x0

    .line 1291
    const/4 v12, 0x0

    .line 1292
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v1

    .line 1299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1303
    .line 1304
    .line 1305
    :cond_17
    :goto_3
    invoke-virtual {v3}, La/ccb0;->I0()La/k3t0;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    sget-object v1, La/gxa0;->a:La/gxa0;

    .line 1310
    .line 1311
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1312
    .line 1313
    .line 1314
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1315
    .line 1316
    goto :goto_4

    .line 1317
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 1318
    .line 1319
    .line 1320
    :goto_4
    return-object v14

    .line 1321
    :pswitch_e
    check-cast v0, La/g9b0;

    .line 1322
    .line 1323
    check-cast v13, La/cp;

    .line 1324
    .line 1325
    move-object/from16 v1, p1

    .line 1326
    .line 1327
    check-cast v1, Landroid/view/View;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v13}, La/cp;->u()Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v1

    .line 1336
    check-cast v1, La/jm60;

    .line 1337
    .line 1338
    iget-byte v1, v1, La/jm60;->a:B

    .line 1339
    .line 1340
    iget-object v3, v0, La/g9b0;->y:La/i1w0;

    .line 1341
    .line 1342
    iget-object v4, v0, La/g9b0;->C:La/gw60;

    .line 1343
    .line 1344
    iget-object v5, v0, La/g9b0;->B:La/hs60;

    .line 1345
    .line 1346
    const-wide/16 v6, 0x2eec

    .line 1347
    .line 1348
    const-string v8, "point"

    .line 1349
    .line 1350
    const-string v9, "games_promos_popular_call"

    .line 1351
    .line 1352
    if-eq v1, v2, :cond_1a

    .line 1353
    .line 1354
    const/4 v2, 0x2

    .line 1355
    if-eq v1, v2, :cond_19

    .line 1356
    .line 1357
    goto :goto_5

    .line 1358
    :cond_19
    iget-object v1, v5, La/hs60;->a:La/kt2;

    .line 1359
    .line 1360
    const-string v2, "jackpot"

    .line 1361
    .line 1362
    invoke-static {v8, v2, v1, v9}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    iget-object v1, v4, La/gw60;->a:La/s1p;

    .line 1366
    .line 1367
    new-instance v4, La/j1p;

    .line 1368
    .line 1369
    sget-object v5, La/beb0;->a:[La/beb0;

    .line 1370
    .line 1371
    invoke-direct {v4, v2, v15}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1372
    .line 1373
    .line 1374
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v2

    .line 1378
    invoke-virtual {v1, v2, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v1, La/j8b0;

    .line 1382
    .line 1383
    invoke-direct {v1, v0, v10}, La/j8b0;-><init>(La/g9b0;B)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v3, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1387
    .line 1388
    .line 1389
    goto :goto_5

    .line 1390
    :cond_1a
    iget-object v1, v5, La/hs60;->a:La/kt2;

    .line 1391
    .line 1392
    const-string v2, "lucky_wheel"

    .line 1393
    .line 1394
    invoke-static {v8, v2, v1, v9}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    iget-object v1, v4, La/gw60;->a:La/s1p;

    .line 1398
    .line 1399
    new-instance v4, La/j1p;

    .line 1400
    .line 1401
    sget-object v5, La/beb0;->a:[La/beb0;

    .line 1402
    .line 1403
    invoke-direct {v4, v2, v15}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1404
    .line 1405
    .line 1406
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    invoke-virtual {v1, v2, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1411
    .line 1412
    .line 1413
    sget-object v1, La/s470;->p:La/s470;

    .line 1414
    .line 1415
    invoke-virtual {v1}, La/s470;->a()J

    .line 1416
    .line 1417
    .line 1418
    move-result-wide v1

    .line 1419
    invoke-virtual {v0, v1, v2}, La/g9b0;->w(J)V

    .line 1420
    .line 1421
    .line 1422
    new-instance v1, La/j8b0;

    .line 1423
    .line 1424
    const/4 v2, 0x2

    .line 1425
    invoke-direct {v1, v0, v2}, La/j8b0;-><init>(La/g9b0;B)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v3, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1429
    .line 1430
    .line 1431
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1432
    .line 1433
    return-object v0

    .line 1434
    :pswitch_f
    check-cast v0, La/v3b0;

    .line 1435
    .line 1436
    check-cast v13, La/foc0;

    .line 1437
    .line 1438
    move-object/from16 v1, p1

    .line 1439
    .line 1440
    check-cast v1, La/k0w0;

    .line 1441
    .line 1442
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1443
    .line 1444
    .line 1445
    iget-object v0, v0, La/v3b0;->t:La/peg0;

    .line 1446
    .line 1447
    new-instance v2, La/er1;

    .line 1448
    .line 1449
    iget v3, v13, La/foc0;->e:I

    .line 1450
    .line 1451
    int-to-long v3, v3

    .line 1452
    invoke-direct {v2, v15, v3, v4}, La/er1;-><init>(ZJ)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1460
    .line 1461
    .line 1462
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1463
    .line 1464
    return-object v0

    .line 1465
    :pswitch_10
    check-cast v0, La/v3b0;

    .line 1466
    .line 1467
    check-cast v13, La/w4t;

    .line 1468
    .line 1469
    move-object/from16 v1, p1

    .line 1470
    .line 1471
    check-cast v1, Ljava/lang/Throwable;

    .line 1472
    .line 1473
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1474
    .line 1475
    .line 1476
    new-instance v2, La/d3b0;

    .line 1477
    .line 1478
    invoke-direct {v2, v13, v15}, La/d3b0;-><init>(La/w4t;B)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1485
    .line 1486
    .line 1487
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1488
    .line 1489
    return-object v0

    .line 1490
    :pswitch_11
    check-cast v0, La/v3b0;

    .line 1491
    .line 1492
    check-cast v13, La/vh0;

    .line 1493
    .line 1494
    move-object/from16 v1, p1

    .line 1495
    .line 1496
    check-cast v1, La/k0w0;

    .line 1497
    .line 1498
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1499
    .line 1500
    .line 1501
    iget-object v0, v0, La/v3b0;->t:La/peg0;

    .line 1502
    .line 1503
    new-instance v2, La/fr1;

    .line 1504
    .line 1505
    new-instance v3, La/fs80;

    .line 1506
    .line 1507
    iget-object v4, v13, La/vh0;->b:Ljava/lang/String;

    .line 1508
    .line 1509
    iget-wide v5, v13, La/vh0;->a:J

    .line 1510
    .line 1511
    sget-object v7, La/iun;->a:La/iun;

    .line 1512
    .line 1513
    const/4 v11, 0x0

    .line 1514
    const/16 v12, 0x78

    .line 1515
    .line 1516
    const/4 v8, 0x0

    .line 1517
    const-wide/16 v9, 0x0

    .line 1518
    .line 1519
    invoke-direct/range {v3 .. v12}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1520
    .line 1521
    .line 1522
    const/4 v5, 0x2

    .line 1523
    invoke-direct {v2, v3, v14, v5}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1531
    .line 1532
    .line 1533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1534
    .line 1535
    return-object v0

    .line 1536
    :pswitch_12
    check-cast v0, La/v2b0;

    .line 1537
    .line 1538
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1539
    .line 1540
    move-object/from16 v1, p1

    .line 1541
    .line 1542
    check-cast v1, La/hcz;

    .line 1543
    .line 1544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1545
    .line 1546
    .line 1547
    iget-object v0, v0, La/v2b0;->a:La/a4x;

    .line 1548
    .line 1549
    new-instance v4, La/jfa0;

    .line 1550
    .line 1551
    const/16 v6, 0x15

    .line 1552
    .line 1553
    invoke-direct {v4, v6}, La/jfa0;-><init>(B)V

    .line 1554
    .line 1555
    .line 1556
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1557
    .line 1558
    .line 1559
    move-result v7

    .line 1560
    new-instance v8, La/zu90;

    .line 1561
    .line 1562
    invoke-direct {v8, v5, v4, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1563
    .line 1564
    .line 1565
    new-instance v4, La/a580;

    .line 1566
    .line 1567
    const/16 v5, 0x1b

    .line 1568
    .line 1569
    invoke-direct {v4, v0, v5}, La/a580;-><init>(Ljava/util/List;B)V

    .line 1570
    .line 1571
    .line 1572
    new-instance v5, La/a100;

    .line 1573
    .line 1574
    invoke-direct {v5, v0, v13, v6}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1575
    .line 1576
    .line 1577
    new-instance v0, La/ugd;

    .line 1578
    .line 1579
    invoke-direct {v0, v3, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1580
    .line 1581
    .line 1582
    invoke-virtual {v1, v7, v8, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1583
    .line 1584
    .line 1585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1586
    .line 1587
    return-object v0

    .line 1588
    :pswitch_13
    check-cast v0, La/f1b0;

    .line 1589
    .line 1590
    check-cast v13, La/vh0;

    .line 1591
    .line 1592
    move-object/from16 v1, p1

    .line 1593
    .line 1594
    check-cast v1, La/k0w0;

    .line 1595
    .line 1596
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1597
    .line 1598
    .line 1599
    iget-object v0, v0, La/f1b0;->z:La/peg0;

    .line 1600
    .line 1601
    new-instance v2, La/fr1;

    .line 1602
    .line 1603
    new-instance v3, La/fs80;

    .line 1604
    .line 1605
    iget-object v4, v13, La/vh0;->b:Ljava/lang/String;

    .line 1606
    .line 1607
    iget-wide v5, v13, La/vh0;->a:J

    .line 1608
    .line 1609
    sget-object v7, La/iun;->a:La/iun;

    .line 1610
    .line 1611
    const/4 v11, 0x1

    .line 1612
    const/16 v12, 0x58

    .line 1613
    .line 1614
    const/4 v8, 0x0

    .line 1615
    const-wide/16 v9, 0x0

    .line 1616
    .line 1617
    invoke-direct/range {v3 .. v12}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 1618
    .line 1619
    .line 1620
    const/4 v5, 0x2

    .line 1621
    invoke-direct {v2, v3, v14, v5}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1629
    .line 1630
    .line 1631
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1632
    .line 1633
    return-object v0

    .line 1634
    :pswitch_14
    check-cast v0, La/f1b0;

    .line 1635
    .line 1636
    check-cast v13, La/eoc0;

    .line 1637
    .line 1638
    move-object/from16 v1, p1

    .line 1639
    .line 1640
    check-cast v1, La/k0w0;

    .line 1641
    .line 1642
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1643
    .line 1644
    .line 1645
    iget-object v0, v0, La/f1b0;->z:La/peg0;

    .line 1646
    .line 1647
    new-instance v2, La/er1;

    .line 1648
    .line 1649
    iget v3, v13, La/eoc0;->e:I

    .line 1650
    .line 1651
    int-to-long v3, v3

    .line 1652
    invoke-direct {v2, v15, v3, v4}, La/er1;-><init>(ZJ)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v0

    .line 1659
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1660
    .line 1661
    .line 1662
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1663
    .line 1664
    return-object v0

    .line 1665
    :pswitch_15
    check-cast v0, La/rua0;

    .line 1666
    .line 1667
    move-object v4, v13

    .line 1668
    check-cast v4, Ljava/util/Set;

    .line 1669
    .line 1670
    move-object/from16 v8, p1

    .line 1671
    .line 1672
    check-cast v8, La/k0w0;

    .line 1673
    .line 1674
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1675
    .line 1676
    .line 1677
    iget-object v1, v0, La/rua0;->s:La/vjp;

    .line 1678
    .line 1679
    sget-object v2, La/rua0;->H:La/j700;

    .line 1680
    .line 1681
    new-instance v3, La/m8h0;

    .line 1682
    .line 1683
    sget-object v0, La/xun;->a:La/xun;

    .line 1684
    .line 1685
    invoke-direct {v3, v12, v0, v15}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 1686
    .line 1687
    .line 1688
    const-string v7, ""

    .line 1689
    .line 1690
    const-wide/16 v5, -0x1

    .line 1691
    .line 1692
    invoke-virtual/range {v1 .. v7}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    invoke-virtual {v8, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1697
    .line 1698
    .line 1699
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1700
    .line 1701
    return-object v0

    .line 1702
    :pswitch_16
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1703
    .line 1704
    check-cast v0, La/cra0;

    .line 1705
    .line 1706
    move-object/from16 v1, p1

    .line 1707
    .line 1708
    check-cast v1, La/h2l0;

    .line 1709
    .line 1710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1714
    .line 1715
    .line 1716
    move-result v1

    .line 1717
    if-eqz v1, :cond_1c

    .line 1718
    .line 1719
    if-eq v1, v2, :cond_1b

    .line 1720
    .line 1721
    goto :goto_6

    .line 1722
    :cond_1b
    new-instance v1, La/rqa0;

    .line 1723
    .line 1724
    iget-wide v2, v0, La/cra0;->a:J

    .line 1725
    .line 1726
    invoke-direct {v1, v2, v3}, La/rqa0;-><init>(J)V

    .line 1727
    .line 1728
    .line 1729
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    goto :goto_6

    .line 1733
    :cond_1c
    new-instance v1, La/zpa0;

    .line 1734
    .line 1735
    new-instance v3, La/npn;

    .line 1736
    .line 1737
    iget-wide v4, v0, La/cra0;->a:J

    .line 1738
    .line 1739
    iget-wide v6, v0, La/cra0;->c:J

    .line 1740
    .line 1741
    iget v8, v0, La/cra0;->f:I

    .line 1742
    .line 1743
    int-to-long v8, v8

    .line 1744
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v8

    .line 1748
    iget-boolean v9, v0, La/cra0;->g:Z

    .line 1749
    .line 1750
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 1751
    .line 1752
    .line 1753
    iget-boolean v0, v0, La/cra0;->h:Z

    .line 1754
    .line 1755
    xor-int/2addr v0, v2

    .line 1756
    invoke-direct {v1, v3, v0}, La/zpa0;-><init>(La/npn;Z)V

    .line 1757
    .line 1758
    .line 1759
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1760
    .line 1761
    .line 1762
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1763
    .line 1764
    return-object v0

    .line 1765
    :pswitch_17
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1766
    .line 1767
    check-cast v0, La/ara0;

    .line 1768
    .line 1769
    move-object/from16 v1, p1

    .line 1770
    .line 1771
    check-cast v1, La/h2l0;

    .line 1772
    .line 1773
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1774
    .line 1775
    .line 1776
    sget-object v2, La/jta0;->a:[I

    .line 1777
    .line 1778
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1779
    .line 1780
    .line 1781
    move-result v1

    .line 1782
    aget v1, v2, v1

    .line 1783
    .line 1784
    if-ne v1, v10, :cond_1d

    .line 1785
    .line 1786
    new-instance v1, La/aqa0;

    .line 1787
    .line 1788
    iget-wide v2, v0, La/ara0;->a:J

    .line 1789
    .line 1790
    iget-wide v4, v0, La/ara0;->c:J

    .line 1791
    .line 1792
    invoke-direct {v1, v2, v3, v4, v5}, La/aqa0;-><init>(JJ)V

    .line 1793
    .line 1794
    .line 1795
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1796
    .line 1797
    .line 1798
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1799
    .line 1800
    return-object v0

    .line 1801
    :pswitch_18
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1802
    .line 1803
    check-cast v0, La/dra0;

    .line 1804
    .line 1805
    move-object/from16 v1, p1

    .line 1806
    .line 1807
    check-cast v1, La/h2l0;

    .line 1808
    .line 1809
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1813
    .line 1814
    .line 1815
    move-result v1

    .line 1816
    if-eqz v1, :cond_1f

    .line 1817
    .line 1818
    if-eq v1, v2, :cond_1e

    .line 1819
    .line 1820
    goto :goto_7

    .line 1821
    :cond_1e
    new-instance v1, La/rqa0;

    .line 1822
    .line 1823
    iget-wide v2, v0, La/dra0;->a:J

    .line 1824
    .line 1825
    invoke-direct {v1, v2, v3}, La/rqa0;-><init>(J)V

    .line 1826
    .line 1827
    .line 1828
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1829
    .line 1830
    .line 1831
    goto :goto_7

    .line 1832
    :cond_1f
    new-instance v1, La/zpa0;

    .line 1833
    .line 1834
    new-instance v3, La/npn;

    .line 1835
    .line 1836
    iget-wide v4, v0, La/dra0;->a:J

    .line 1837
    .line 1838
    iget-wide v6, v0, La/dra0;->c:J

    .line 1839
    .line 1840
    iget v8, v0, La/dra0;->f:I

    .line 1841
    .line 1842
    int-to-long v8, v8

    .line 1843
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v8

    .line 1847
    const/4 v9, 0x0

    .line 1848
    invoke-direct/range {v3 .. v9}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 1849
    .line 1850
    .line 1851
    iget-boolean v0, v0, La/dra0;->g:Z

    .line 1852
    .line 1853
    xor-int/2addr v0, v2

    .line 1854
    invoke-direct {v1, v3, v0}, La/zpa0;-><init>(La/npn;Z)V

    .line 1855
    .line 1856
    .line 1857
    invoke-interface {v13, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1861
    .line 1862
    return-object v0

    .line 1863
    :pswitch_19
    check-cast v0, La/ata0;

    .line 1864
    .line 1865
    check-cast v13, La/l9s;

    .line 1866
    .line 1867
    move-object/from16 v1, p1

    .line 1868
    .line 1869
    check-cast v1, La/k0w0;

    .line 1870
    .line 1871
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1872
    .line 1873
    .line 1874
    new-instance v3, La/gv60;

    .line 1875
    .line 1876
    invoke-direct {v3, v0, v13, v14, v6}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1877
    .line 1878
    .line 1879
    new-instance v0, La/b1w0;

    .line 1880
    .line 1881
    invoke-direct {v0, v3}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1889
    .line 1890
    check-cast v0, La/c8d;

    .line 1891
    .line 1892
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1893
    .line 1894
    new-instance v3, La/v7d;

    .line 1895
    .line 1896
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1897
    .line 1898
    .line 1899
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 1900
    .line 1901
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1902
    .line 1903
    return-object v0

    .line 1904
    :pswitch_1a
    check-cast v0, La/n660;

    .line 1905
    .line 1906
    check-cast v13, La/jpa0;

    .line 1907
    .line 1908
    move-object/from16 v1, p1

    .line 1909
    .line 1910
    check-cast v1, Landroid/view/MotionEvent;

    .line 1911
    .line 1912
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1913
    .line 1914
    .line 1915
    move-result v2

    .line 1916
    if-nez v2, :cond_21

    .line 1917
    .line 1918
    invoke-virtual {v13}, La/jpa0;->f()Lkotlin/jvm/functions/Function1;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v2

    .line 1922
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v1

    .line 1926
    check-cast v1, Ljava/lang/Boolean;

    .line 1927
    .line 1928
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1929
    .line 1930
    .line 1931
    move-result v1

    .line 1932
    if-eqz v1, :cond_20

    .line 1933
    .line 1934
    sget-object v1, La/ipa0;->b:La/ipa0;

    .line 1935
    .line 1936
    goto :goto_8

    .line 1937
    :cond_20
    sget-object v1, La/ipa0;->c:La/ipa0;

    .line 1938
    .line 1939
    :goto_8
    iput-object v1, v0, La/n660;->b:Ljava/lang/Object;

    .line 1940
    .line 1941
    goto :goto_9

    .line 1942
    :cond_21
    invoke-virtual {v13}, La/jpa0;->f()Lkotlin/jvm/functions/Function1;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v0

    .line 1946
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1950
    .line 1951
    return-object v0

    .line 1952
    :pswitch_1b
    check-cast v0, La/uja0;

    .line 1953
    .line 1954
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1955
    .line 1956
    move-object/from16 v1, p1

    .line 1957
    .line 1958
    check-cast v1, La/hcz;

    .line 1959
    .line 1960
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1961
    .line 1962
    .line 1963
    iget-object v0, v0, La/uja0;->b:La/hca0;

    .line 1964
    .line 1965
    iget-object v0, v0, La/hca0;->f:Ljava/util/List;

    .line 1966
    .line 1967
    new-instance v3, La/er90;

    .line 1968
    .line 1969
    invoke-direct {v3, v8}, La/er90;-><init>(B)V

    .line 1970
    .line 1971
    .line 1972
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1973
    .line 1974
    .line 1975
    move-result v4

    .line 1976
    new-instance v5, La/zu90;

    .line 1977
    .line 1978
    const/4 v6, 0x7

    .line 1979
    invoke-direct {v5, v6, v3, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1980
    .line 1981
    .line 1982
    new-instance v3, La/a580;

    .line 1983
    .line 1984
    invoke-direct {v3, v0, v9}, La/a580;-><init>(Ljava/util/List;B)V

    .line 1985
    .line 1986
    .line 1987
    new-instance v6, La/a100;

    .line 1988
    .line 1989
    invoke-direct {v6, v0, v13, v11}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1990
    .line 1991
    .line 1992
    new-instance v0, La/ugd;

    .line 1993
    .line 1994
    const v7, 0x2fd4df92

    .line 1995
    .line 1996
    .line 1997
    invoke-direct {v0, v7, v2, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1998
    .line 1999
    .line 2000
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2001
    .line 2002
    .line 2003
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2004
    .line 2005
    return-object v0

    .line 2006
    :pswitch_1c
    check-cast v0, La/hha0;

    .line 2007
    .line 2008
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 2009
    .line 2010
    move-object/from16 v1, p1

    .line 2011
    .line 2012
    check-cast v1, La/hcz;

    .line 2013
    .line 2014
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2015
    .line 2016
    .line 2017
    check-cast v0, La/gha0;

    .line 2018
    .line 2019
    iget-object v0, v0, La/gha0;->a:La/a4x;

    .line 2020
    .line 2021
    new-instance v3, La/er90;

    .line 2022
    .line 2023
    invoke-direct {v3, v9}, La/er90;-><init>(B)V

    .line 2024
    .line 2025
    .line 2026
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2027
    .line 2028
    .line 2029
    move-result v4

    .line 2030
    new-instance v5, La/zu90;

    .line 2031
    .line 2032
    const/4 v6, 0x6

    .line 2033
    invoke-direct {v5, v6, v3, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 2034
    .line 2035
    .line 2036
    new-instance v3, La/ubn;

    .line 2037
    .line 2038
    invoke-direct {v3, v0, v7}, La/ubn;-><init>(La/a4x;B)V

    .line 2039
    .line 2040
    .line 2041
    new-instance v6, La/ws1;

    .line 2042
    .line 2043
    invoke-direct {v6, v0, v13, v11}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 2044
    .line 2045
    .line 2046
    new-instance v0, La/ugd;

    .line 2047
    .line 2048
    const v7, 0x2fd4df92

    .line 2049
    .line 2050
    .line 2051
    invoke-direct {v0, v7, v2, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2052
    .line 2053
    .line 2054
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2055
    .line 2056
    .line 2057
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2058
    .line 2059
    return-object v0

    .line 2060
    nop

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
