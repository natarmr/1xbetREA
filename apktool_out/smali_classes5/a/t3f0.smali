.class public final synthetic La/t3f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z3f0;


# direct methods
.method public synthetic constructor <init>(La/z3f0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t3f0;->a:B

    iput-object p1, p0, La/t3f0;->b:La/z3f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t3f0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    const-string v3, "RESULT_KEY_CALENDAR_SIMPLE_DATE"

    .line 8
    .line 9
    iget-object v4, v0, La/t3f0;->b:La/z3f0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Landroid/os/Bundle;

    .line 21
    .line 22
    sget-object v5, La/z3f0;->Y1:La/zie0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    if-gt v0, v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroid/os/Parcelable;

    .line 44
    .line 45
    :goto_0
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v2, La/r2f0;

    .line 54
    .line 55
    invoke-direct {v2, v0}, La/r2f0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    move-object/from16 v1, p2

    .line 69
    .line 70
    check-cast v1, Landroid/os/Bundle;

    .line 71
    .line 72
    sget-object v2, La/z3f0;->Y1:La/zie0;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget-object v1, La/n2f0;->a:La/n2f0;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    move-object/from16 v0, p1

    .line 93
    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    move-object/from16 v1, p2

    .line 97
    .line 98
    check-cast v1, Landroid/os/Bundle;

    .line 99
    .line 100
    sget-object v2, La/z3f0;->Y1:La/zie0;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v0, v4, La/z3f0;->W1:La/nh70;

    .line 109
    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    const-string v0, "PICKER_DIALOG_FRAGMENT_TAG"

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sget-object v1, La/p2f0;->a:La/p2f0;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_2
    const-string v0, "pickerDialogScreenFactory"

    .line 130
    .line 131
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    throw v0

    .line 136
    :pswitch_2
    move-object/from16 v0, p1

    .line 137
    .line 138
    check-cast v0, Ljava/lang/String;

    .line 139
    .line 140
    move-object/from16 v1, p2

    .line 141
    .line 142
    check-cast v1, Landroid/os/Bundle;

    .line 143
    .line 144
    sget-object v2, La/z3f0;->Y1:La/zie0;

    .line 145
    .line 146
    const-string v2, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 147
    .line 148
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    const-string v2, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    new-instance v3, La/o2f0;

    .line 163
    .line 164
    invoke-direct {v3, v0, v1}, La/o2f0;-><init>(IZ)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_3
    move-object/from16 v0, p1

    .line 174
    .line 175
    check-cast v0, Ljava/lang/String;

    .line 176
    .line 177
    move-object/from16 v1, p2

    .line 178
    .line 179
    check-cast v1, Landroid/os/Bundle;

    .line 180
    .line 181
    sget-object v2, La/z3f0;->Y1:La/zie0;

    .line 182
    .line 183
    const-string v2, "KEY_PICKER_MODEL_REQUEST"

    .line 184
    .line 185
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    new-instance v2, La/m2f0;

    .line 194
    .line 195
    invoke-direct {v2, v0}, La/m2f0;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_4
    move-object/from16 v0, p1

    .line 205
    .line 206
    check-cast v0, Ljava/lang/String;

    .line 207
    .line 208
    move-object/from16 v1, p2

    .line 209
    .line 210
    check-cast v1, Landroid/os/Bundle;

    .line 211
    .line 212
    sget-object v5, La/z3f0;->Y1:La/zie0;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 221
    .line 222
    if-gt v0, v2, :cond_3

    .line 223
    .line 224
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_1

    .line 229
    :cond_3
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Landroid/os/Parcelable;

    .line 234
    .line 235
    :goto_1
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 236
    .line 237
    if-eqz v0, :cond_4

    .line 238
    .line 239
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    new-instance v2, La/d3f0;

    .line 244
    .line 245
    invoke-direct {v2, v0}, La/d3f0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_5
    move-object/from16 v0, p1

    .line 255
    .line 256
    check-cast v0, Ljava/lang/String;

    .line 257
    .line 258
    move-object/from16 v1, p2

    .line 259
    .line 260
    check-cast v1, Landroid/os/Bundle;

    .line 261
    .line 262
    sget-object v5, La/z3f0;->Y1:La/zie0;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 271
    .line 272
    if-gt v0, v2, :cond_5

    .line 273
    .line 274
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    goto :goto_2

    .line 279
    :cond_5
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, Landroid/os/Parcelable;

    .line 284
    .line 285
    :goto_2
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 286
    .line 287
    if-eqz v0, :cond_6

    .line 288
    .line 289
    invoke-virtual {v4}, La/z3f0;->H0()La/k3t0;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    new-instance v2, La/r2f0;

    .line 294
    .line 295
    invoke-direct {v2, v0}, La/r2f0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_6
    move-object/from16 v4, p1

    .line 305
    .line 306
    check-cast v4, La/fet;

    .line 307
    .line 308
    move-object/from16 v1, p2

    .line 309
    .line 310
    check-cast v1, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    sget-object v2, La/z3f0;->Y1:La/zie0;

    .line 317
    .line 318
    and-int/lit8 v2, v1, 0x3

    .line 319
    .line 320
    const/4 v3, 0x2

    .line 321
    const/4 v5, 0x1

    .line 322
    const/4 v6, 0x0

    .line 323
    if-eq v2, v3, :cond_7

    .line 324
    .line 325
    move v2, v5

    .line 326
    goto :goto_3

    .line 327
    :cond_7
    move v2, v6

    .line 328
    :goto_3
    and-int/2addr v1, v5

    .line 329
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_27

    .line 334
    .line 335
    sget-object v1, La/dy2;->f:La/zfn;

    .line 336
    .line 337
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, Landroid/view/View;

    .line 342
    .line 343
    invoke-static {v1, v4, v6}, La/k7x;->i(Landroid/view/View;La/fet;I)V

    .line 344
    .line 345
    .line 346
    const/4 v7, 0x3

    .line 347
    invoke-static {v6, v6, v4, v6, v7}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    sget-object v8, La/ukd;->a:La/cl5;

    .line 356
    .line 357
    if-ne v1, v8, :cond_8

    .line 358
    .line 359
    sget-object v1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 360
    .line 361
    invoke-static {v1, v4}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v4, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_8
    move-object v12, v1

    .line 369
    check-cast v12, La/vne;

    .line 370
    .line 371
    iget-object v9, v0, La/t3f0;->b:La/z3f0;

    .line 372
    .line 373
    invoke-virtual {v9}, La/z3f0;->H0()La/k3t0;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, La/i3t0;

    .line 378
    .line 379
    invoke-virtual {v0, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    new-array v1, v6, [Ljava/lang/Object;

    .line 384
    .line 385
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    if-nez v2, :cond_9

    .line 394
    .line 395
    if-ne v3, v8, :cond_a

    .line 396
    .line 397
    :cond_9
    new-instance v3, La/wda0;

    .line 398
    .line 399
    const/16 v2, 0x15

    .line 400
    .line 401
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 408
    .line 409
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 410
    .line 411
    .line 412
    move-result-object v21

    .line 413
    iget-object v1, v14, La/xcz;->g:La/gy40;

    .line 414
    .line 415
    invoke-static {v1, v4}, La/vcc;->D(La/gy40;La/fet;)La/pz40;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    new-array v1, v6, [Ljava/lang/Object;

    .line 420
    .line 421
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    if-nez v2, :cond_b

    .line 430
    .line 431
    if-ne v3, v8, :cond_c

    .line 432
    .line 433
    :cond_b
    new-instance v3, La/wda0;

    .line 434
    .line 435
    const/16 v2, 0x16

    .line 436
    .line 437
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 444
    .line 445
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 446
    .line 447
    .line 448
    move-result-object v11

    .line 449
    sget-object v1, La/bmd;->i:La/zfn;

    .line 450
    .line 451
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    move-object v15, v1

    .line 456
    check-cast v15, La/wpq;

    .line 457
    .line 458
    sget-object v1, La/bmd;->q:La/zfn;

    .line 459
    .line 460
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    move-object v13, v1

    .line 465
    check-cast v13, La/pkk0;

    .line 466
    .line 467
    new-array v1, v6, [Ljava/lang/Object;

    .line 468
    .line 469
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    if-nez v2, :cond_d

    .line 478
    .line 479
    if-ne v3, v8, :cond_e

    .line 480
    .line 481
    :cond_d
    new-instance v3, La/wda0;

    .line 482
    .line 483
    const/16 v2, 0x17

    .line 484
    .line 485
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 492
    .line 493
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 494
    .line 495
    .line 496
    move-result-object v29

    .line 497
    new-array v1, v6, [Ljava/lang/Object;

    .line 498
    .line 499
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    if-nez v2, :cond_f

    .line 508
    .line 509
    if-ne v3, v8, :cond_10

    .line 510
    .line 511
    :cond_f
    new-instance v3, La/wda0;

    .line 512
    .line 513
    const/16 v2, 0x18

    .line 514
    .line 515
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    :cond_10
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 522
    .line 523
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 524
    .line 525
    .line 526
    move-result-object v30

    .line 527
    new-array v1, v6, [Ljava/lang/Object;

    .line 528
    .line 529
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    if-nez v2, :cond_11

    .line 538
    .line 539
    if-ne v3, v8, :cond_12

    .line 540
    .line 541
    :cond_11
    new-instance v3, La/wda0;

    .line 542
    .line 543
    const/16 v2, 0x19

    .line 544
    .line 545
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    :cond_12
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 552
    .line 553
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 554
    .line 555
    .line 556
    move-result-object v31

    .line 557
    new-array v1, v6, [Ljava/lang/Object;

    .line 558
    .line 559
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    if-nez v2, :cond_13

    .line 568
    .line 569
    if-ne v3, v8, :cond_14

    .line 570
    .line 571
    :cond_13
    new-instance v3, La/wda0;

    .line 572
    .line 573
    const/16 v2, 0x1a

    .line 574
    .line 575
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    :cond_14
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 582
    .line 583
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 584
    .line 585
    .line 586
    move-result-object v32

    .line 587
    new-array v1, v6, [Ljava/lang/Object;

    .line 588
    .line 589
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    if-nez v2, :cond_15

    .line 598
    .line 599
    if-ne v3, v8, :cond_16

    .line 600
    .line 601
    :cond_15
    new-instance v3, La/wda0;

    .line 602
    .line 603
    const/16 v2, 0x1b

    .line 604
    .line 605
    invoke-direct {v3, v0, v2}, La/wda0;-><init>(La/l7m0;B)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 612
    .line 613
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 614
    .line 615
    .line 616
    move-result-object v33

    .line 617
    const/4 v1, 0x0

    .line 618
    invoke-static {v1, v4, v5}, La/g8x;->U(Landroid/view/View;La/fet;I)La/pz40;

    .line 619
    .line 620
    .line 621
    move-result-object v16

    .line 622
    new-array v2, v6, [Ljava/lang/Object;

    .line 623
    .line 624
    invoke-virtual {v4, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    if-nez v3, :cond_17

    .line 633
    .line 634
    if-ne v5, v8, :cond_18

    .line 635
    .line 636
    :cond_17
    new-instance v5, La/wda0;

    .line 637
    .line 638
    const/16 v3, 0x1c

    .line 639
    .line 640
    invoke-direct {v5, v0, v3}, La/wda0;-><init>(La/l7m0;B)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    :cond_18
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 647
    .line 648
    invoke-static {v2, v5, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    if-ne v3, v8, :cond_19

    .line 657
    .line 658
    new-instance v3, La/cqq;

    .line 659
    .line 660
    invoke-direct {v3}, La/cqq;-><init>()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    :cond_19
    move-object/from16 v17, v3

    .line 667
    .line 668
    check-cast v17, La/cqq;

    .line 669
    .line 670
    invoke-virtual {v4, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    invoke-virtual {v4, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    or-int/2addr v3, v5

    .line 679
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    if-nez v3, :cond_1a

    .line 684
    .line 685
    if-ne v5, v8, :cond_1b

    .line 686
    .line 687
    :cond_1a
    new-instance v5, La/za4;

    .line 688
    .line 689
    invoke-direct {v5, v13, v15}, La/za4;-><init>(La/pkk0;La/wpq;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    :cond_1b
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 696
    .line 697
    move-object v3, v2

    .line 698
    move-object v2, v5

    .line 699
    const/4 v5, 0x0

    .line 700
    const/4 v6, 0x5

    .line 701
    move-object/from16 v19, v1

    .line 702
    .line 703
    const/4 v1, 0x0

    .line 704
    move-object/from16 v18, v3

    .line 705
    .line 706
    const/4 v3, 0x0

    .line 707
    move-object/from16 p2, v0

    .line 708
    .line 709
    move-object/from16 p0, v16

    .line 710
    .line 711
    move-object/from16 v7, v18

    .line 712
    .line 713
    move-object/from16 v0, v19

    .line 714
    .line 715
    invoke-static/range {v1 .. v6}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    if-nez v1, :cond_1c

    .line 727
    .line 728
    if-ne v2, v8, :cond_1d

    .line 729
    .line 730
    :cond_1c
    new-instance v2, La/wi6;

    .line 731
    .line 732
    const/16 v1, 0xb

    .line 733
    .line 734
    invoke-direct {v2, v14, v0, v1}, La/wi6;-><init>(La/xcz;La/yje;B)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    :cond_1d
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 741
    .line 742
    invoke-static {v4, v11, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 743
    .line 744
    .line 745
    invoke-interface/range {p0 .. p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    check-cast v1, La/tly;

    .line 750
    .line 751
    iget-boolean v1, v1, La/tly;->a:Z

    .line 752
    .line 753
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    move-object/from16 v2, p0

    .line 758
    .line 759
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    invoke-virtual {v4, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v5

    .line 767
    or-int/2addr v3, v5

    .line 768
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v5

    .line 772
    if-nez v3, :cond_1e

    .line 773
    .line 774
    if-ne v5, v8, :cond_1f

    .line 775
    .line 776
    :cond_1e
    move-object/from16 v18, v15

    .line 777
    .line 778
    goto :goto_4

    .line 779
    :cond_1f
    move-object/from16 v19, v0

    .line 780
    .line 781
    move-object v0, v15

    .line 782
    goto :goto_5

    .line 783
    :goto_4
    new-instance v15, La/qkb0;

    .line 784
    .line 785
    const/16 v20, 0x4

    .line 786
    .line 787
    move-object/from16 v19, v0

    .line 788
    .line 789
    move-object/from16 v16, v2

    .line 790
    .line 791
    invoke-direct/range {v15 .. v20}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 792
    .line 793
    .line 794
    move-object/from16 v0, v18

    .line 795
    .line 796
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    move-object v5, v15

    .line 800
    :goto_5
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 801
    .line 802
    invoke-static {v4, v1, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v4, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    or-int/2addr v1, v2

    .line 814
    invoke-virtual {v4, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    or-int/2addr v1, v2

    .line 819
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v2

    .line 823
    if-nez v1, :cond_21

    .line 824
    .line 825
    if-ne v2, v8, :cond_20

    .line 826
    .line 827
    goto :goto_6

    .line 828
    :cond_20
    move-object v15, v0

    .line 829
    move-object v11, v13

    .line 830
    move-object/from16 v3, v17

    .line 831
    .line 832
    goto :goto_7

    .line 833
    :cond_21
    :goto_6
    new-instance v22, La/nwe0;

    .line 834
    .line 835
    const/16 v27, 0x0

    .line 836
    .line 837
    const/16 v28, 0x1

    .line 838
    .line 839
    move-object/from16 v25, v0

    .line 840
    .line 841
    move-object/from16 v23, v10

    .line 842
    .line 843
    move-object/from16 v26, v13

    .line 844
    .line 845
    move-object/from16 v24, v17

    .line 846
    .line 847
    invoke-direct/range {v22 .. v28}, La/nwe0;-><init>(La/l7m0;La/cqq;La/wpq;La/pkk0;La/yje;B)V

    .line 848
    .line 849
    .line 850
    move-object/from16 v2, v22

    .line 851
    .line 852
    move-object/from16 v3, v24

    .line 853
    .line 854
    move-object/from16 v15, v25

    .line 855
    .line 856
    move-object/from16 v11, v26

    .line 857
    .line 858
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    :goto_7
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 862
    .line 863
    invoke-static {v4, v14, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v9}, La/z3f0;->H0()La/k3t0;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-virtual {v4, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v1

    .line 874
    invoke-virtual {v4, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v2

    .line 878
    or-int/2addr v1, v2

    .line 879
    invoke-virtual {v4, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move-result v2

    .line 883
    or-int/2addr v1, v2

    .line 884
    invoke-virtual {v4, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    or-int/2addr v1, v2

    .line 889
    invoke-virtual {v4, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    or-int/2addr v1, v2

    .line 894
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    or-int/2addr v1, v2

    .line 899
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v2

    .line 903
    if-nez v1, :cond_22

    .line 904
    .line 905
    if-ne v2, v8, :cond_23

    .line 906
    .line 907
    :cond_22
    move-object v1, v8

    .line 908
    goto :goto_8

    .line 909
    :cond_23
    move-object v1, v8

    .line 910
    move-object/from16 v25, v15

    .line 911
    .line 912
    goto :goto_9

    .line 913
    :goto_8
    new-instance v8, La/bg0;

    .line 914
    .line 915
    move-object/from16 v18, v15

    .line 916
    .line 917
    const/16 v15, 0xf

    .line 918
    .line 919
    move-object v13, v7

    .line 920
    move-object/from16 v10, v18

    .line 921
    .line 922
    invoke-direct/range {v8 .. v15}, La/bg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 923
    .line 924
    .line 925
    move-object/from16 v25, v10

    .line 926
    .line 927
    invoke-virtual {v4, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    move-object v2, v8

    .line 931
    :goto_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 932
    .line 933
    sget-object v5, La/lkz;->a:La/lkz;

    .line 934
    .line 935
    invoke-static {v2, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 940
    .line 941
    .line 942
    move-result v5

    .line 943
    invoke-virtual {v4, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v6

    .line 947
    or-int/2addr v5, v6

    .line 948
    const/4 v6, 0x3

    .line 949
    invoke-virtual {v4, v6}, La/fet;->e(I)Z

    .line 950
    .line 951
    .line 952
    move-result v7

    .line 953
    or-int/2addr v5, v7

    .line 954
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 955
    .line 956
    .line 957
    move-result v6

    .line 958
    or-int/2addr v5, v6

    .line 959
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v6

    .line 963
    if-nez v5, :cond_24

    .line 964
    .line 965
    if-ne v6, v1, :cond_25

    .line 966
    .line 967
    :cond_24
    new-instance v15, La/nu80;

    .line 968
    .line 969
    const/16 v20, 0x10

    .line 970
    .line 971
    move-object/from16 v16, v0

    .line 972
    .line 973
    move-object/from16 v18, v2

    .line 974
    .line 975
    move-object/from16 v17, v9

    .line 976
    .line 977
    invoke-direct/range {v15 .. v20}, La/nu80;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v4, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 981
    .line 982
    .line 983
    move-object v6, v15

    .line 984
    :cond_25
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 985
    .line 986
    invoke-static {v4, v9, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 987
    .line 988
    .line 989
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 990
    .line 991
    invoke-static {v0, v3}, La/y860;->b0(La/mm40;La/cqq;)La/mm40;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    const/4 v6, 0x3

    .line 996
    invoke-static {v0, v6}, La/ju70;->K(La/mm40;I)La/mm40;

    .line 997
    .line 998
    .line 999
    move-result-object v7

    .line 1000
    invoke-interface/range {v30 .. v30}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    check-cast v0, Ljava/lang/Boolean;

    .line 1005
    .line 1006
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-eqz v0, :cond_26

    .line 1011
    .line 1012
    sget-object v1, La/i4w0;->d:La/ugd;

    .line 1013
    .line 1014
    move-object v5, v1

    .line 1015
    goto :goto_a

    .line 1016
    :cond_26
    move-object/from16 v5, v19

    .line 1017
    .line 1018
    :goto_a
    new-instance v15, La/x2g;

    .line 1019
    .line 1020
    const/16 v20, 0x1b

    .line 1021
    .line 1022
    move-object/from16 v19, v9

    .line 1023
    .line 1024
    move-object/from16 v18, v11

    .line 1025
    .line 1026
    move-object/from16 v16, v21

    .line 1027
    .line 1028
    move-object/from16 v17, v25

    .line 1029
    .line 1030
    invoke-direct/range {v15 .. v20}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1031
    .line 1032
    .line 1033
    move-object/from16 v18, v17

    .line 1034
    .line 1035
    const v0, 0x2a8a7ec3

    .line 1036
    .line 1037
    .line 1038
    invoke-static {v0, v15, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    new-instance v0, La/in80;

    .line 1043
    .line 1044
    const/16 v1, 0xf

    .line 1045
    .line 1046
    move-object/from16 v3, p2

    .line 1047
    .line 1048
    invoke-direct {v0, v3, v9, v1}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1049
    .line 1050
    .line 1051
    const v1, 0x603fb362

    .line 1052
    .line 1053
    .line 1054
    invoke-static {v1, v0, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    new-instance v8, La/qe4;

    .line 1059
    .line 1060
    move-object/from16 v16, v11

    .line 1061
    .line 1062
    move-object v10, v14

    .line 1063
    move-object/from16 v15, v18

    .line 1064
    .line 1065
    move-object/from16 v11, v29

    .line 1066
    .line 1067
    move-object/from16 v17, v31

    .line 1068
    .line 1069
    move-object/from16 v13, v32

    .line 1070
    .line 1071
    move-object/from16 v12, v33

    .line 1072
    .line 1073
    move-object v14, v3

    .line 1074
    invoke-direct/range {v8 .. v17}, La/qe4;-><init>(La/z3f0;La/xcz;La/l7m0;La/l7m0;La/l7m0;La/pz40;La/wpq;La/pkk0;La/l7m0;)V

    .line 1075
    .line 1076
    .line 1077
    const v1, -0x6a0b17ff

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v1, v8, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    move-object v6, v4

    .line 1085
    move-object v4, v1

    .line 1086
    const/16 v1, 0x6d80

    .line 1087
    .line 1088
    move-object v3, v0

    .line 1089
    invoke-static/range {v1 .. v7}, La/m7x;->k(ILa/ugd;La/ugd;La/ugd;La/xdr;La/fet;La/mm40;)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_b

    .line 1093
    :cond_27
    invoke-virtual {v4}, La/fet;->X()V

    .line 1094
    .line 1095
    .line 1096
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1097
    .line 1098
    return-object v0

    .line 1099
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
