.class public final synthetic La/b33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/im3;La/gr00;)V
    .locals 0

    .line 1
    const/4 p2, 0x4

    iput-byte p2, p0, La/b33;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b33;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/b33;->a:B

    iput-object p1, p0, La/b33;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b33;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v0, v0, La/b33;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/ms5;

    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Throwable;

    .line 20
    .line 21
    iput-object v5, v0, La/ms5;->f:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    check-cast v0, La/hs5;

    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Throwable;

    .line 31
    .line 32
    iput-object v5, v0, La/hs5;->h:Ljava/lang/String;

    .line 33
    .line 34
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    check-cast v0, La/fs5;

    .line 38
    .line 39
    move-object/from16 v1, p1

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Throwable;

    .line 42
    .line 43
    iput-object v5, v0, La/fs5;->g:Ljava/lang/String;

    .line 44
    .line 45
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_2
    check-cast v0, La/yr5;

    .line 49
    .line 50
    move-object/from16 v1, p1

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Throwable;

    .line 53
    .line 54
    iput-object v5, v0, La/yr5;->h:Ljava/lang/String;

    .line 55
    .line 56
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_3
    check-cast v0, La/wr5;

    .line 60
    .line 61
    move-object/from16 v1, p1

    .line 62
    .line 63
    check-cast v1, Ljava/lang/Throwable;

    .line 64
    .line 65
    iput-object v5, v0, La/wr5;->l:Ljava/lang/String;

    .line 66
    .line 67
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_4
    check-cast v0, La/tr5;

    .line 71
    .line 72
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, Ljava/lang/Throwable;

    .line 75
    .line 76
    iput-object v5, v0, La/tr5;->k:Ljava/lang/String;

    .line 77
    .line 78
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_5
    check-cast v0, La/rr5;

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, Ljava/lang/Throwable;

    .line 86
    .line 87
    iput-object v5, v0, La/rr5;->o:Ljava/lang/String;

    .line 88
    .line 89
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_6
    check-cast v0, La/ro5;

    .line 93
    .line 94
    move-object/from16 v1, p1

    .line 95
    .line 96
    check-cast v1, Ljava/lang/Throwable;

    .line 97
    .line 98
    iput-object v5, v0, La/ro5;->l:Ljava/lang/String;

    .line 99
    .line 100
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_7
    check-cast v0, La/ii5;

    .line 104
    .line 105
    move-object/from16 v1, p1

    .line 106
    .line 107
    check-cast v1, La/tjz;

    .line 108
    .line 109
    sget-object v2, La/ii5;->O1:La/gfk0;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, La/ii5;->J0()La/dk5;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, v1}, La/dk5;->L(La/tjz;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_8
    check-cast v0, La/kb0;

    .line 125
    .line 126
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, La/k0w0;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, La/kb0;->o:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/qgd;

    .line 136
    .line 137
    sget-object v2, La/sb50;->a:La/xuz;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v0, Lorg/xplatform/wallet/impl/navigation/WalletsScreen$WalletsScreen;

    .line 143
    .line 144
    const-string v2, "addbalance"

    .line 145
    .line 146
    invoke-direct {v0, v2}, Lorg/xplatform/wallet/impl/navigation/WalletsScreen$WalletsScreen;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 150
    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_9
    check-cast v0, La/ob50;

    .line 156
    .line 157
    move-object/from16 v1, p1

    .line 158
    .line 159
    check-cast v1, La/ob50;

    .line 160
    .line 161
    iget-object v1, v1, La/ob50;->b:Ljava/lang/Object;

    .line 162
    .line 163
    iget-object v0, v0, La/ob50;->b:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_a
    check-cast v0, La/il4;

    .line 175
    .line 176
    move-object/from16 v1, p1

    .line 177
    .line 178
    check-cast v1, Ljava/lang/Throwable;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v2, v0, La/il4;->d:La/duj;

    .line 184
    .line 185
    new-instance v3, La/fa2;

    .line 186
    .line 187
    const/16 v4, 0xb

    .line 188
    .line 189
    invoke-direct {v3, v0, v4}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_b
    check-cast v0, La/hl4;

    .line 199
    .line 200
    move-object/from16 v1, p1

    .line 201
    .line 202
    check-cast v1, Ljava/lang/Throwable;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v2, v0, La/hl4;->d:La/duj;

    .line 208
    .line 209
    new-instance v4, La/fa2;

    .line 210
    .line 211
    invoke-direct {v4, v0, v3}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 215
    .line 216
    .line 217
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_c
    check-cast v0, La/kd4;

    .line 221
    .line 222
    move-object/from16 v1, p1

    .line 223
    .line 224
    check-cast v1, La/k0w0;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object v0, v0, La/kd4;->b:La/mi70;

    .line 230
    .line 231
    new-instance v0, La/i38;

    .line 232
    .line 233
    const/16 v2, 0x11

    .line 234
    .line 235
    invoke-direct {v0, v2}, La/i38;-><init>(I)V

    .line 236
    .line 237
    .line 238
    new-instance v2, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 239
    .line 240
    invoke-direct {v2, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_d
    check-cast v0, La/ra4;

    .line 250
    .line 251
    move-object/from16 v1, p1

    .line 252
    .line 253
    check-cast v1, La/abi0;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    sget-object v2, La/cbi0;->b:La/zai0;

    .line 259
    .line 260
    iget v0, v0, La/ra4;->a:I

    .line 261
    .line 262
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_e
    check-cast v0, La/bk2;

    .line 273
    .line 274
    move-object/from16 v1, p1

    .line 275
    .line 276
    check-cast v1, La/cp;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 282
    .line 283
    check-cast v3, La/bsx;

    .line 284
    .line 285
    iget-object v3, v3, La/bsx;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 286
    .line 287
    new-instance v4, La/ys3;

    .line 288
    .line 289
    invoke-direct {v4, v0, v1, v2}, La/ys3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 290
    .line 291
    .line 292
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 293
    .line 294
    .line 295
    new-instance v0, La/j9;

    .line 296
    .line 297
    const/16 v2, 0x14

    .line 298
    .line 299
    invoke-direct {v0, v1, v2}, La/j9;-><init>(La/cp;B)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 303
    .line 304
    .line 305
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_f
    check-cast v0, La/d54;

    .line 309
    .line 310
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, Ljava/lang/Boolean;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    sget-object v2, La/d54;->R1:La/gfk0;

    .line 319
    .line 320
    invoke-virtual {v0}, La/d54;->G0()La/k3t0;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    new-instance v2, La/y44;

    .line 325
    .line 326
    invoke-direct {v2, v1}, La/y44;-><init>(Z)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object v0

    .line 335
    :pswitch_10
    check-cast v0, La/z6e;

    .line 336
    .line 337
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, La/cp;

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 345
    .line 346
    check-cast v2, La/zzj;

    .line 347
    .line 348
    iget-object v2, v2, La/zzj;->b:Landroid/widget/ImageView;

    .line 349
    .line 350
    new-instance v3, La/wg;

    .line 351
    .line 352
    const/4 v4, 0x4

    .line 353
    invoke-direct {v3, v0, v1, v4}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 357
    .line 358
    .line 359
    new-instance v0, La/j9;

    .line 360
    .line 361
    const/16 v2, 0x13

    .line 362
    .line 363
    invoke-direct {v0, v1, v2}, La/j9;-><init>(La/cp;B)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 367
    .line 368
    .line 369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_11
    check-cast v0, La/k14;

    .line 373
    .line 374
    move-object/from16 v1, p1

    .line 375
    .line 376
    check-cast v1, Landroid/content/res/TypedArray;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    iget v3, v0, La/k14;->e:I

    .line 382
    .line 383
    iget-object v6, v0, La/k14;->a:Landroid/view/View;

    .line 384
    .line 385
    const/16 v7, 0x22

    .line 386
    .line 387
    invoke-virtual {v1, v7, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    iput v3, v0, La/k14;->e:I

    .line 392
    .line 393
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-static {v1, v2}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    if-eqz v1, :cond_1

    .line 402
    .line 403
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    invoke-virtual {v6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    instance-of v3, v2, Landroid/graphics/drawable/GradientDrawable;

    .line 412
    .line 413
    if-eqz v3, :cond_0

    .line 414
    .line 415
    check-cast v2, Landroid/graphics/drawable/GradientDrawable;

    .line 416
    .line 417
    goto :goto_0

    .line 418
    :cond_0
    move-object v2, v5

    .line 419
    :goto_0
    if-eqz v2, :cond_1

    .line 420
    .line 421
    invoke-virtual {v2}, Landroid/graphics/drawable/GradientDrawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 425
    .line 426
    .line 427
    :cond_1
    iget-boolean v1, v0, La/k14;->f:Z

    .line 428
    .line 429
    if-eqz v1, :cond_5

    .line 430
    .line 431
    invoke-virtual {v6}, Landroid/view/View;->isAttachedToWindow()Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-eqz v1, :cond_4

    .line 436
    .line 437
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    if-eqz v1, :cond_2

    .line 442
    .line 443
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    goto :goto_1

    .line 448
    :cond_2
    move-object v1, v5

    .line 449
    :goto_1
    instance-of v2, v1, Landroid/view/View;

    .line 450
    .line 451
    if-eqz v2, :cond_3

    .line 452
    .line 453
    move-object v5, v1

    .line 454
    check-cast v5, Landroid/view/View;

    .line 455
    .line 456
    :cond_3
    iget-object v1, v0, La/k14;->h:Ljava/lang/ref/WeakReference;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    check-cast v1, Landroid/view/View;

    .line 463
    .line 464
    invoke-virtual {v0, v5, v1}, La/k14;->f(Landroid/view/View;Landroid/view/View;)V

    .line 465
    .line 466
    .line 467
    goto :goto_2

    .line 468
    :cond_4
    new-instance v1, La/j14;

    .line 469
    .line 470
    invoke-direct {v1, v6, v0, v4}, La/j14;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v6, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 474
    .line 475
    .line 476
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_12
    check-cast v0, La/f04;

    .line 480
    .line 481
    move-object/from16 v1, p1

    .line 482
    .line 483
    check-cast v1, La/h7d;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    iget-object v2, v0, La/f04;->e:La/p7m0;

    .line 489
    .line 490
    iget-object v3, v0, La/f04;->p:La/mfr;

    .line 491
    .line 492
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    check-cast v2, Ljava/lang/Boolean;

    .line 497
    .line 498
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    if-nez v2, :cond_6

    .line 503
    .line 504
    iget-object v0, v0, La/f04;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-eqz v2, :cond_7

    .line 515
    .line 516
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 521
    .line 522
    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    goto :goto_3

    .line 526
    :cond_6
    iget-object v0, v0, La/f04;->o:La/n0o0;

    .line 527
    .line 528
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    check-cast v0, Landroid/os/Handler;

    .line 533
    .line 534
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 535
    .line 536
    .line 537
    iget-object v2, v3, La/mfr;->b:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 540
    .line 541
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 545
    .line 546
    .line 547
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_13
    check-cast v0, La/kq3;

    .line 551
    .line 552
    move-object/from16 v1, p1

    .line 553
    .line 554
    check-cast v1, Ljava/lang/Throwable;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    iget-object v2, v0, La/kq3;->f:La/mne;

    .line 564
    .line 565
    iget-object v9, v2, La/mne;->a:La/rwj;

    .line 566
    .line 567
    sget-object v7, La/aq3;->a:La/aq3;

    .line 568
    .line 569
    new-instance v10, La/bq3;

    .line 570
    .line 571
    invoke-direct {v10, v0, v5, v4}, La/bq3;-><init>(La/kq3;La/yje;B)V

    .line 572
    .line 573
    .line 574
    const/16 v11, 0xa

    .line 575
    .line 576
    const/4 v8, 0x0

    .line 577
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 578
    .line 579
    .line 580
    new-instance v2, La/xy5;

    .line 581
    .line 582
    invoke-direct {v2, v4}, La/xy5;-><init>(Z)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v2}, La/kq3;->w(La/zy5;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v1}, La/kq3;->C(Ljava/lang/Throwable;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_14
    check-cast v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;

    .line 595
    .line 596
    move-object/from16 v1, p1

    .line 597
    .line 598
    check-cast v1, Landroid/view/View;

    .line 599
    .line 600
    sget v2, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->t:I

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    check-cast v1, La/sab;

    .line 606
    .line 607
    iget v2, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->n:I

    .line 608
    .line 609
    invoke-virtual {v1}, La/sab;->getRow()I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    if-ne v2, v3, :cond_8

    .line 614
    .line 615
    iget-boolean v2, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->h:Z

    .line 616
    .line 617
    if-eqz v2, :cond_8

    .line 618
    .line 619
    iget-object v2, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->a:Lkotlin/jvm/functions/Function1;

    .line 620
    .line 621
    invoke-virtual {v1}, La/sab;->getColumn()I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    check-cast v2, Ljava/lang/Boolean;

    .line 634
    .line 635
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    if-eqz v2, :cond_8

    .line 640
    .line 641
    iget-object v2, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->i:Landroid/util/SparseArray;

    .line 642
    .line 643
    invoke-virtual {v1}, La/sab;->getRow()I

    .line 644
    .line 645
    .line 646
    move-result v3

    .line 647
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    check-cast v2, Ljava/util/List;

    .line 652
    .line 653
    invoke-virtual {v1}, La/sab;->getColumn()I

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    add-int/lit8 v3, v3, -0x1

    .line 658
    .line 659
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    check-cast v2, La/sab;

    .line 664
    .line 665
    const v3, 0x7f0805e6

    .line 666
    .line 667
    .line 668
    invoke-static {v3, v2}, La/sab;->u(ILa/sab;)V

    .line 669
    .line 670
    .line 671
    iput-object v1, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;->r:La/sab;

    .line 672
    .line 673
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 674
    .line 675
    return-object v0

    .line 676
    :pswitch_15
    check-cast v0, La/tp3;

    .line 677
    .line 678
    move-object/from16 v1, p1

    .line 679
    .line 680
    check-cast v1, Landroid/view/View;

    .line 681
    .line 682
    sget v2, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->u:I

    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0}, La/tp3;->invoke()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 691
    .line 692
    return-object v0

    .line 693
    :pswitch_16
    check-cast v0, La/fo3;

    .line 694
    .line 695
    move-object/from16 v1, p1

    .line 696
    .line 697
    check-cast v1, Ljava/lang/Throwable;

    .line 698
    .line 699
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    iget-object v0, v0, La/fo3;->h:La/p7m0;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    sget-object v1, La/wn3;->a:La/wn3;

    .line 708
    .line 709
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 713
    .line 714
    return-object v0

    .line 715
    :pswitch_17
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;

    .line 716
    .line 717
    move-object/from16 v1, p1

    .line 718
    .line 719
    check-cast v1, Landroid/view/View;

    .line 720
    .line 721
    sget v2, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->A:I

    .line 722
    .line 723
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    iget-object v0, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->y:Lkotlin/jvm/functions/Function0;

    .line 727
    .line 728
    if-eqz v0, :cond_9

    .line 729
    .line 730
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 734
    .line 735
    return-object v0

    .line 736
    :pswitch_18
    check-cast v0, La/im3;

    .line 737
    .line 738
    move-object/from16 v1, p1

    .line 739
    .line 740
    check-cast v1, La/k0w0;

    .line 741
    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    instance-of v2, v0, La/gm3;

    .line 746
    .line 747
    if-eqz v2, :cond_b

    .line 748
    .line 749
    new-instance v2, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 750
    .line 751
    check-cast v0, La/gm3;

    .line 752
    .line 753
    iget-boolean v3, v0, La/gm3;->b:Z

    .line 754
    .line 755
    iget-object v4, v0, La/gm3;->a:Ljava/lang/String;

    .line 756
    .line 757
    iget-object v0, v0, La/gm3;->c:Ljava/lang/String;

    .line 758
    .line 759
    invoke-direct {v2, v4, v3, v0}, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 760
    .line 761
    .line 762
    new-instance v0, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;

    .line 763
    .line 764
    invoke-direct {v0, v2}, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;-><init>(Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;)V

    .line 765
    .line 766
    .line 767
    if-eqz v3, :cond_a

    .line 768
    .line 769
    new-instance v2, La/y0w0;

    .line 770
    .line 771
    invoke-direct {v2, v0}, La/y0w0;-><init>(La/m7h0;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v1, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 775
    .line 776
    .line 777
    goto :goto_4

    .line 778
    :cond_a
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 779
    .line 780
    .line 781
    goto :goto_4

    .line 782
    :cond_b
    instance-of v0, v0, La/hm3;

    .line 783
    .line 784
    if-eqz v0, :cond_c

    .line 785
    .line 786
    new-instance v0, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFacadeImpl$getLockScreen$1;

    .line 787
    .line 788
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 792
    .line 793
    .line 794
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 795
    .line 796
    goto :goto_5

    .line 797
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 798
    .line 799
    .line 800
    :goto_5
    return-object v5

    .line 801
    :pswitch_19
    check-cast v0, La/db2;

    .line 802
    .line 803
    move-object/from16 v1, p1

    .line 804
    .line 805
    check-cast v1, Ljava/util/List;

    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    iget-object v0, v0, La/db2;->b:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v0, La/n0o0;

    .line 813
    .line 814
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    check-cast v0, La/fee;

    .line 819
    .line 820
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    check-cast v0, Ljava/lang/Number;

    .line 825
    .line 826
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 827
    .line 828
    .line 829
    move-result-wide v4

    .line 830
    new-instance v0, Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 833
    .line 834
    .line 835
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    :cond_d
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    if-eqz v2, :cond_e

    .line 844
    .line 845
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    move-object v6, v2

    .line 850
    check-cast v6, La/vcw;

    .line 851
    .line 852
    iget-wide v6, v6, La/vcw;->a:J

    .line 853
    .line 854
    cmp-long v6, v6, v4

    .line 855
    .line 856
    if-nez v6, :cond_d

    .line 857
    .line 858
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    goto :goto_6

    .line 862
    :cond_e
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    check-cast v0, La/vcw;

    .line 867
    .line 868
    if-eqz v0, :cond_10

    .line 869
    .line 870
    iget-object v0, v0, La/vcw;->c:Ljava/util/List;

    .line 871
    .line 872
    if-eqz v0, :cond_10

    .line 873
    .line 874
    new-instance v1, Ljava/util/ArrayList;

    .line 875
    .line 876
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 881
    .line 882
    .line 883
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    if-eqz v2, :cond_11

    .line 892
    .line 893
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    check-cast v2, La/jdw;

    .line 898
    .line 899
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    iget-wide v3, v2, La/jdw;->a:J

    .line 903
    .line 904
    new-instance v6, La/b2l0;

    .line 905
    .line 906
    iget-object v5, v2, La/jdw;->b:Ljava/lang/String;

    .line 907
    .line 908
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 909
    .line 910
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 911
    .line 912
    .line 913
    move-result-wide v8

    .line 914
    invoke-direct {v6, v5, v8, v9}, La/b2l0;-><init>(Ljava/lang/String;J)V

    .line 915
    .line 916
    .line 917
    sget-object v9, La/d4d;->i3:La/d4d;

    .line 918
    .line 919
    new-instance v10, La/l3l0;

    .line 920
    .line 921
    sget-object v5, La/qmk;->a:La/zcl;

    .line 922
    .line 923
    const/high16 v5, 0x41800000    # 16.0f

    .line 924
    .line 925
    invoke-direct {v10, v5}, La/l3l0;-><init>(F)V

    .line 926
    .line 927
    .line 928
    sget-object v12, La/p1l0;->g:La/p1l0;

    .line 929
    .line 930
    iget-object v2, v2, La/jdw;->e:Ljava/lang/String;

    .line 931
    .line 932
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 933
    .line 934
    .line 935
    move-result v5

    .line 936
    if-nez v5, :cond_f

    .line 937
    .line 938
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    :cond_f
    move-object v14, v2

    .line 943
    new-instance v11, La/t1l0;

    .line 944
    .line 945
    const/4 v13, 0x0

    .line 946
    const/4 v15, 0x0

    .line 947
    const/16 v16, 0x0

    .line 948
    .line 949
    const/16 v17, 0x0

    .line 950
    .line 951
    const/16 v18, 0xfa

    .line 952
    .line 953
    invoke-direct/range {v11 .. v18}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;I)V

    .line 954
    .line 955
    .line 956
    new-instance v8, La/v2l0;

    .line 957
    .line 958
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 959
    .line 960
    .line 961
    move-result-wide v12

    .line 962
    invoke-direct {v8, v12, v13}, La/v2l0;-><init>(J)V

    .line 963
    .line 964
    .line 965
    new-instance v5, La/zrm;

    .line 966
    .line 967
    move-object v7, v11

    .line 968
    const/16 v11, 0x20

    .line 969
    .line 970
    invoke-direct/range {v5 .. v11}, La/zrm;-><init>(La/f2l0;La/u1l0;La/g3l0;La/d4d;La/n3l0;I)V

    .line 971
    .line 972
    .line 973
    new-instance v2, La/qa5;

    .line 974
    .line 975
    invoke-direct {v2, v3, v4, v5}, La/qa5;-><init>(JLa/zrm;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 979
    .line 980
    .line 981
    goto :goto_7

    .line 982
    :cond_10
    sget-object v1, La/iun;->a:La/iun;

    .line 983
    .line 984
    :cond_11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 985
    .line 986
    .line 987
    move-result v0

    .line 988
    if-eqz v0, :cond_12

    .line 989
    .line 990
    sget-object v1, La/iun;->a:La/iun;

    .line 991
    .line 992
    :cond_12
    return-object v1

    .line 993
    :pswitch_1a
    check-cast v0, La/q93;

    .line 994
    .line 995
    move-object/from16 v1, p1

    .line 996
    .line 997
    check-cast v1, La/o93;

    .line 998
    .line 999
    sget-object v2, La/q93;->Q1:La/pek0;

    .line 1000
    .line 1001
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    iget-object v0, v0, La/q93;->M1:La/a8z;

    .line 1005
    .line 1006
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    check-cast v0, La/k3t0;

    .line 1011
    .line 1012
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1016
    .line 1017
    return-object v0

    .line 1018
    :pswitch_1b
    check-cast v0, La/e7z;

    .line 1019
    .line 1020
    move-object/from16 v1, p1

    .line 1021
    .line 1022
    check-cast v1, La/w6k;

    .line 1023
    .line 1024
    invoke-virtual {v0, v1}, La/e7z;->a0(La/w6k;)V

    .line 1025
    .line 1026
    .line 1027
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1028
    .line 1029
    return-object v0

    .line 1030
    :pswitch_1c
    check-cast v0, Landroidx/fragment/app/e;

    .line 1031
    .line 1032
    move-object/from16 v1, p1

    .line 1033
    .line 1034
    check-cast v1, Landroidx/fragment/app/FragmentContainerView;

    .line 1035
    .line 1036
    if-eqz v0, :cond_13

    .line 1037
    .line 1038
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 1039
    .line 1040
    .line 1041
    move-result v1

    .line 1042
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v5

    .line 1046
    :cond_13
    if-eqz v5, :cond_14

    .line 1047
    .line 1048
    invoke-virtual {v0}, Landroidx/fragment/app/e;->a0()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v1

    .line 1052
    if-nez v1, :cond_14

    .line 1053
    .line 1054
    new-instance v1, La/zb5;

    .line 1055
    .line 1056
    invoke-direct {v1, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v1, v5}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1}, La/zb5;->h()V

    .line 1063
    .line 1064
    .line 1065
    :cond_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1066
    .line 1067
    return-object v0

    .line 1068
    nop

    .line 1069
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
