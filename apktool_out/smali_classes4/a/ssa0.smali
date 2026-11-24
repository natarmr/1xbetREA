.class public final synthetic La/ssa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ssa0;->a:B

    iput-object p1, p0, La/ssa0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ssa0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/16 v4, 0x9

    .line 8
    .line 9
    const-string v5, "viewModelFactory"

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    iget-object v0, v0, La/ssa0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v0, La/g1d0;

    .line 20
    .line 21
    iget-object v0, v0, La/g1d0;->K1:La/fiu0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v7

    .line 30
    :pswitch_0
    check-cast v0, Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast v0, La/kuc0;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    move-object v1, v0

    .line 39
    check-cast v1, La/dtc0;

    .line 40
    .line 41
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 42
    .line 43
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 53
    .line 54
    move-object v4, v0

    .line 55
    check-cast v4, La/rrc0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    const v13, 0xfffb

    .line 62
    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    invoke-static/range {v4 .. v13}, La/rrc0;->a(La/rrc0;Ljava/util/List;IZZLjava/lang/String;ZZZI)La/rrc0;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_2
    check-cast v0, La/ikc0;

    .line 85
    .line 86
    sget-object v1, La/ikc0;->O1:[La/iiy;

    .line 87
    .line 88
    new-instance v1, La/ko60;

    .line 89
    .line 90
    invoke-direct {v1, v0, v4}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :pswitch_3
    check-cast v0, La/gkc0;

    .line 95
    .line 96
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, La/d5c;->R(La/vne;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {v0}, La/gkc0;->w()V

    .line 107
    .line 108
    .line 109
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_4
    check-cast v0, La/kjc0;

    .line 113
    .line 114
    sget-object v1, La/kjc0;->P1:[La/iiy;

    .line 115
    .line 116
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, La/gkc0;->y()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, La/kjc0;->K0()La/gkc0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v1, v1, La/gkc0;->p:La/p7m0;

    .line 128
    .line 129
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    instance-of v1, v1, La/tjc0;

    .line 134
    .line 135
    if-nez v1, :cond_3

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-virtual {v0, v8}, La/kjc0;->L0(Z)V

    .line 139
    .line 140
    .line 141
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_5
    check-cast v0, La/vic0;

    .line 145
    .line 146
    sget-object v1, La/vic0;->S1:[La/iiy;

    .line 147
    .line 148
    new-instance v1, La/ko60;

    .line 149
    .line 150
    const/16 v2, 0x8

    .line 151
    .line 152
    invoke-direct {v1, v0, v2}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 153
    .line 154
    .line 155
    return-object v1

    .line 156
    :pswitch_6
    check-cast v0, La/jhc0;

    .line 157
    .line 158
    iget-object v0, v0, La/jhc0;->m:La/bby;

    .line 159
    .line 160
    if-eqz v0, :cond_4

    .line 161
    .line 162
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object v0

    .line 168
    :pswitch_7
    check-cast v0, La/vgc0;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0

    .line 179
    :pswitch_8
    move-object v1, v0

    .line 180
    check-cast v1, La/sec0;

    .line 181
    .line 182
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 183
    .line 184
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 185
    .line 186
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 194
    .line 195
    move-object v7, v0

    .line 196
    check-cast v7, La/bec0;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v3, v7, La/bec0;->p:La/kdc0;

    .line 202
    .line 203
    const/16 v4, 0x77

    .line 204
    .line 205
    invoke-static {v3, v6, v6, v4}, La/kdc0;->a(La/kdc0;IZI)La/kdc0;

    .line 206
    .line 207
    .line 208
    move-result-object v18

    .line 209
    const/16 v19, 0x7fff

    .line 210
    .line 211
    const/4 v8, 0x0

    .line 212
    const/4 v9, 0x0

    .line 213
    const/4 v10, 0x0

    .line 214
    const/4 v11, 0x0

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    const/16 v16, 0x0

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    invoke-static/range {v7 .. v19}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_5

    .line 232
    .line 233
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_9
    move-object v1, v0

    .line 237
    check-cast v1, La/pac0;

    .line 238
    .line 239
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 240
    .line 241
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 242
    .line 243
    :cond_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 251
    .line 252
    move-object v4, v0

    .line 253
    check-cast v4, La/jac0;

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    const/4 v9, 0x0

    .line 259
    const/16 v10, 0x1e

    .line 260
    .line 261
    const/4 v5, 0x0

    .line 262
    const/4 v6, 0x0

    .line 263
    const/4 v7, 0x0

    .line 264
    const/4 v8, 0x0

    .line 265
    invoke-static/range {v4 .. v10}, La/jac0;->a(La/jac0;ZZZLjava/lang/String;La/zec0;I)La/jac0;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_6

    .line 274
    .line 275
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_a
    move-object v1, v0

    .line 279
    check-cast v1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 280
    .line 281
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 282
    .line 283
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 284
    .line 285
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 293
    .line 294
    move-object v4, v0

    .line 295
    check-cast v4, La/iac0;

    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const/16 v14, 0x1ffb

    .line 302
    .line 303
    const/4 v5, 0x0

    .line 304
    const/4 v6, 0x0

    .line 305
    const/4 v7, 0x0

    .line 306
    const/4 v8, 0x0

    .line 307
    const/4 v9, 0x0

    .line 308
    const/4 v10, 0x0

    .line 309
    const/4 v11, 0x0

    .line 310
    const/4 v12, 0x0

    .line 311
    invoke-static/range {v4 .. v14}, La/iac0;->a(La/iac0;Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;ZLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZZI)La/iac0;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_7

    .line 320
    .line 321
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_b
    check-cast v0, La/n9c0;

    .line 325
    .line 326
    new-instance v1, La/q0h0;

    .line 327
    .line 328
    iget-object v0, v0, La/n9c0;->Q1:La/npi;

    .line 329
    .line 330
    if-eqz v0, :cond_8

    .line 331
    .line 332
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 333
    .line 334
    .line 335
    return-object v1

    .line 336
    :cond_8
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v7

    .line 340
    :pswitch_c
    check-cast v0, La/a8c0;

    .line 341
    .line 342
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 343
    .line 344
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 349
    .line 350
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 351
    .line 352
    .line 353
    move-result-wide v3

    .line 354
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 359
    .line 360
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 361
    .line 362
    .line 363
    move-result-wide v7

    .line 364
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 369
    .line 370
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 371
    .line 372
    .line 373
    move-result-wide v5

    .line 374
    sget-object v10, La/jol;->b:La/jol;

    .line 375
    .line 376
    iget-object v9, v0, La/a8c0;->d:La/bi90;

    .line 377
    .line 378
    new-instance v2, La/iol;

    .line 379
    .line 380
    invoke-direct/range {v2 .. v10}, La/iol;-><init>(JJJLa/bi90;La/jol;)V

    .line 381
    .line 382
    .line 383
    return-object v2

    .line 384
    :pswitch_d
    check-cast v0, La/out0;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    return-object v0

    .line 404
    :pswitch_e
    check-cast v0, La/xwb0;

    .line 405
    .line 406
    iget-object v1, v0, La/xwb0;->a:La/us00;

    .line 407
    .line 408
    iget-object v0, v0, La/xwb0;->b:Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v1, v0}, La/n2x;->w(La/us00;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    return-object v0

    .line 415
    :pswitch_f
    check-cast v0, La/wwb0;

    .line 416
    .line 417
    iget-object v1, v0, La/wwb0;->a:La/us00;

    .line 418
    .line 419
    iget-object v0, v0, La/wwb0;->b:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {v1, v0}, La/n2x;->w(La/us00;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    return-object v0

    .line 426
    :pswitch_10
    check-cast v0, La/uwb0;

    .line 427
    .line 428
    iget-object v1, v0, La/uwb0;->a:La/us00;

    .line 429
    .line 430
    iget-object v0, v0, La/uwb0;->b:Ljava/lang/String;

    .line 431
    .line 432
    invoke-static {v1, v0}, La/n2x;->w(La/us00;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0

    .line 437
    :pswitch_11
    check-cast v0, La/qw80;

    .line 438
    .line 439
    invoke-virtual {v0}, La/qw80;->invoke()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    check-cast v0, Ljava/io/File;

    .line 444
    .line 445
    invoke-static {v0}, La/k0q;->e(Ljava/io/File;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    const-string v2, "preferences_pb"

    .line 450
    .line 451
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    if-eqz v1, :cond_9

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    goto :goto_1

    .line 465
    :cond_9
    const-string v1, "File extension for file: "

    .line 466
    .line 467
    const-string v2, " does not match required extension for Preferences file: preferences_pb"

    .line 468
    .line 469
    invoke-static {v0, v2, v1}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :goto_1
    return-object v7

    .line 473
    :pswitch_12
    check-cast v0, La/zrb0;

    .line 474
    .line 475
    invoke-virtual {v0}, La/zrb0;->i()V

    .line 476
    .line 477
    .line 478
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_13
    check-cast v0, La/spb0;

    .line 482
    .line 483
    new-instance v1, Landroid/text/TextPaint;

    .line 484
    .line 485
    invoke-direct {v1}, Landroid/text/TextPaint;-><init>()V

    .line 486
    .line 487
    .line 488
    iget-object v2, v0, La/spb0;->a:La/tpb0;

    .line 489
    .line 490
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    const v4, 0x7f14045b

    .line 498
    .line 499
    .line 500
    invoke-static {v1, v3, v4}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 504
    .line 505
    .line 506
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 507
    .line 508
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    const v3, 0x7f0606da

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v3}, Landroid/content/Context;->getColor(I)I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 523
    .line 524
    .line 525
    iget v0, v0, La/spb0;->b:F

    .line 526
    .line 527
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 528
    .line 529
    .line 530
    return-object v1

    .line 531
    :pswitch_14
    check-cast v0, La/w5z;

    .line 532
    .line 533
    new-instance v1, La/j2x;

    .line 534
    .line 535
    iget-object v0, v0, La/w5z;->a:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v0, La/tpb0;

    .line 538
    .line 539
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    const v2, 0x7f0700ad

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    invoke-direct {v1, v0}, La/j2x;-><init>(I)V

    .line 551
    .line 552
    .line 553
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    return-object v0

    .line 558
    :pswitch_15
    check-cast v0, La/rmb0;

    .line 559
    .line 560
    invoke-static {v0}, La/rmb0;->m(La/rmb0;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    return-object v0

    .line 569
    :pswitch_16
    check-cast v0, La/uql0;

    .line 570
    .line 571
    if-nez v0, :cond_a

    .line 572
    .line 573
    const/4 v0, -0x1

    .line 574
    goto :goto_2

    .line 575
    :cond_a
    sget-object v1, La/mlb0;->a:[I

    .line 576
    .line 577
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    aget v0, v1, v0

    .line 582
    .line 583
    :goto_2
    if-eq v0, v8, :cond_e

    .line 584
    .line 585
    const/4 v1, 0x2

    .line 586
    if-eq v0, v1, :cond_d

    .line 587
    .line 588
    if-eq v0, v3, :cond_c

    .line 589
    .line 590
    if-eq v0, v2, :cond_b

    .line 591
    .line 592
    sget-object v0, La/osm;->a:La/osm;

    .line 593
    .line 594
    goto :goto_3

    .line 595
    :cond_b
    sget-object v0, La/rsm;->a:La/rsm;

    .line 596
    .line 597
    goto :goto_3

    .line 598
    :cond_c
    sget-object v0, La/ism;->a:La/ism;

    .line 599
    .line 600
    goto :goto_3

    .line 601
    :cond_d
    sget-object v0, La/lsm;->a:La/lsm;

    .line 602
    .line 603
    goto :goto_3

    .line 604
    :cond_e
    sget-object v0, La/fsm;->a:La/fsm;

    .line 605
    .line 606
    :goto_3
    return-object v0

    .line 607
    :pswitch_17
    check-cast v0, La/sgb0;

    .line 608
    .line 609
    iget-object v0, v0, La/sgb0;->h:La/p7m0;

    .line 610
    .line 611
    sget-object v1, La/i8d;->c:La/i8d;

    .line 612
    .line 613
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 617
    .line 618
    return-object v0

    .line 619
    :pswitch_18
    move-object v11, v0

    .line 620
    check-cast v11, La/kgb0;

    .line 621
    .line 622
    iget-object v1, v11, La/i3t0;->f:La/oyg0;

    .line 623
    .line 624
    sget v0, La/kgb0;->k0:I

    .line 625
    .line 626
    iget-object v0, v11, La/i3t0;->i:La/ocj;

    .line 627
    .line 628
    iget-object v9, v0, La/ocj;->a:La/p7m0;

    .line 629
    .line 630
    :cond_f
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    move-object v12, v5

    .line 638
    check-cast v12, La/ufb0;

    .line 639
    .line 640
    sget-object v16, La/seb0;->a:La/seb0;

    .line 641
    .line 642
    const/16 v23, 0x0

    .line 643
    .line 644
    const/16 v24, 0xff7

    .line 645
    .line 646
    const/4 v13, 0x0

    .line 647
    const/4 v14, 0x0

    .line 648
    const/4 v15, 0x0

    .line 649
    const/16 v17, 0x0

    .line 650
    .line 651
    const/16 v18, 0x0

    .line 652
    .line 653
    const/16 v19, 0x0

    .line 654
    .line 655
    const/16 v20, 0x0

    .line 656
    .line 657
    const/16 v21, 0x0

    .line 658
    .line 659
    const/16 v22, 0x0

    .line 660
    .line 661
    invoke-static/range {v12 .. v24}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 662
    .line 663
    .line 664
    move-result-object v10

    .line 665
    invoke-virtual {v9, v5, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v5

    .line 669
    if-eqz v5, :cond_f

    .line 670
    .line 671
    iget-object v5, v11, La/kgb0;->p:La/mne;

    .line 672
    .line 673
    iget-object v9, v11, La/kgb0;->b0:La/bby;

    .line 674
    .line 675
    if-eqz v9, :cond_10

    .line 676
    .line 677
    invoke-interface {v9}, La/bby;->isActive()Z

    .line 678
    .line 679
    .line 680
    move-result v9

    .line 681
    if-ne v9, v8, :cond_10

    .line 682
    .line 683
    goto :goto_4

    .line 684
    :cond_10
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v9

    .line 688
    check-cast v9, La/ufb0;

    .line 689
    .line 690
    iget-object v9, v9, La/ufb0;->g:Ljava/util/List;

    .line 691
    .line 692
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 693
    .line 694
    .line 695
    move-result v9

    .line 696
    if-nez v9, :cond_11

    .line 697
    .line 698
    goto :goto_4

    .line 699
    :cond_11
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 700
    .line 701
    .line 702
    move-result-object v17

    .line 703
    iget-object v9, v5, La/mne;->b:La/dvj;

    .line 704
    .line 705
    new-instance v13, La/e9b0;

    .line 706
    .line 707
    const/4 v15, 0x0

    .line 708
    const/16 v16, 0x9

    .line 709
    .line 710
    const/4 v10, 0x1

    .line 711
    const-class v12, La/kgb0;

    .line 712
    .line 713
    move-object v14, v9

    .line 714
    move-object v9, v13

    .line 715
    const-string v13, "handleError"

    .line 716
    .line 717
    move-object/from16 v18, v14

    .line 718
    .line 719
    const-string v14, "handleError(Ljava/lang/Throwable;)V"

    .line 720
    .line 721
    invoke-direct/range {v9 .. v16}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 722
    .line 723
    .line 724
    new-instance v10, La/cgb0;

    .line 725
    .line 726
    invoke-direct {v10, v11, v7, v8}, La/cgb0;-><init>(La/kgb0;La/yje;B)V

    .line 727
    .line 728
    .line 729
    move-object/from16 v12, v17

    .line 730
    .line 731
    const/16 v17, 0xa

    .line 732
    .line 733
    const/4 v14, 0x0

    .line 734
    move-object v13, v9

    .line 735
    move-object/from16 v16, v10

    .line 736
    .line 737
    move-object/from16 v15, v18

    .line 738
    .line 739
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    iput-object v9, v11, La/kgb0;->b0:La/bby;

    .line 744
    .line 745
    :goto_4
    invoke-virtual {v11}, La/kgb0;->R()V

    .line 746
    .line 747
    .line 748
    iget-object v9, v11, La/kgb0;->e0:La/bby;

    .line 749
    .line 750
    sget-object v22, La/vee;->a:La/vee;

    .line 751
    .line 752
    if-eqz v9, :cond_12

    .line 753
    .line 754
    invoke-interface {v9}, La/bby;->isActive()Z

    .line 755
    .line 756
    .line 757
    move-result v9

    .line 758
    if-ne v9, v8, :cond_12

    .line 759
    .line 760
    move-object/from16 v23, v22

    .line 761
    .line 762
    goto/16 :goto_7

    .line 763
    .line 764
    :cond_12
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v9

    .line 768
    check-cast v9, La/ufb0;

    .line 769
    .line 770
    iget-object v9, v9, La/ufb0;->l:La/hfe;

    .line 771
    .line 772
    invoke-virtual {v9}, La/hfe;->a()Z

    .line 773
    .line 774
    .line 775
    move-result v9

    .line 776
    if-nez v9, :cond_14

    .line 777
    .line 778
    iget-object v9, v0, La/ocj;->a:La/p7m0;

    .line 779
    .line 780
    :goto_5
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v10

    .line 784
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    move-object v12, v10

    .line 788
    check-cast v12, La/ufb0;

    .line 789
    .line 790
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    move-object/from16 v23, v22

    .line 794
    .line 795
    const/16 v22, 0x0

    .line 796
    .line 797
    const/16 v24, 0x7ff

    .line 798
    .line 799
    const/4 v13, 0x0

    .line 800
    const/4 v14, 0x0

    .line 801
    const/4 v15, 0x0

    .line 802
    const/16 v16, 0x0

    .line 803
    .line 804
    const/16 v17, 0x0

    .line 805
    .line 806
    const/16 v18, 0x0

    .line 807
    .line 808
    const/16 v19, 0x0

    .line 809
    .line 810
    const/16 v20, 0x0

    .line 811
    .line 812
    const/16 v21, 0x0

    .line 813
    .line 814
    invoke-static/range {v12 .. v24}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 815
    .line 816
    .line 817
    move-result-object v12

    .line 818
    invoke-virtual {v9, v10, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v10

    .line 822
    if-eqz v10, :cond_13

    .line 823
    .line 824
    goto :goto_6

    .line 825
    :cond_13
    move-object/from16 v22, v23

    .line 826
    .line 827
    goto :goto_5

    .line 828
    :cond_14
    move-object/from16 v23, v22

    .line 829
    .line 830
    :goto_6
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 831
    .line 832
    .line 833
    move-result-object v17

    .line 834
    iget-object v9, v5, La/mne;->b:La/dvj;

    .line 835
    .line 836
    new-instance v13, La/e9b0;

    .line 837
    .line 838
    const/4 v15, 0x0

    .line 839
    const/16 v16, 0xa

    .line 840
    .line 841
    const/4 v10, 0x1

    .line 842
    const-class v12, La/kgb0;

    .line 843
    .line 844
    move-object v14, v9

    .line 845
    move-object v9, v13

    .line 846
    const-string v13, "setErrorLuckyWheel"

    .line 847
    .line 848
    move-object/from16 v18, v14

    .line 849
    .line 850
    const-string v14, "setErrorLuckyWheel(Ljava/lang/Throwable;)V"

    .line 851
    .line 852
    invoke-direct/range {v9 .. v16}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 853
    .line 854
    .line 855
    new-instance v10, La/dgb0;

    .line 856
    .line 857
    invoke-direct {v10, v11, v7, v8}, La/dgb0;-><init>(La/kgb0;La/yje;B)V

    .line 858
    .line 859
    .line 860
    move-object/from16 v12, v17

    .line 861
    .line 862
    const/16 v17, 0xa

    .line 863
    .line 864
    const/4 v14, 0x0

    .line 865
    move-object v13, v9

    .line 866
    move-object/from16 v16, v10

    .line 867
    .line 868
    move-object/from16 v15, v18

    .line 869
    .line 870
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 871
    .line 872
    .line 873
    move-result-object v9

    .line 874
    iput-object v9, v11, La/kgb0;->e0:La/bby;

    .line 875
    .line 876
    :goto_7
    iget-object v9, v11, La/kgb0;->f0:La/c4m0;

    .line 877
    .line 878
    if-eqz v9, :cond_15

    .line 879
    .line 880
    invoke-virtual {v9}, La/pby;->isActive()Z

    .line 881
    .line 882
    .line 883
    move-result v9

    .line 884
    if-ne v9, v8, :cond_15

    .line 885
    .line 886
    goto/16 :goto_8

    .line 887
    .line 888
    :cond_15
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v9

    .line 892
    check-cast v9, La/ufb0;

    .line 893
    .line 894
    iget-object v9, v9, La/ufb0;->k:La/hfe;

    .line 895
    .line 896
    invoke-virtual {v9}, La/hfe;->a()Z

    .line 897
    .line 898
    .line 899
    move-result v9

    .line 900
    if-nez v9, :cond_17

    .line 901
    .line 902
    iget-object v9, v0, La/ocj;->a:La/p7m0;

    .line 903
    .line 904
    :cond_16
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v10

    .line 908
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    move-object v12, v10

    .line 912
    check-cast v12, La/ufb0;

    .line 913
    .line 914
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    move-object/from16 v22, v23

    .line 918
    .line 919
    const/16 v23, 0x0

    .line 920
    .line 921
    const/16 v24, 0xbff

    .line 922
    .line 923
    const/4 v13, 0x0

    .line 924
    const/4 v14, 0x0

    .line 925
    const/4 v15, 0x0

    .line 926
    const/16 v16, 0x0

    .line 927
    .line 928
    const/16 v17, 0x0

    .line 929
    .line 930
    const/16 v18, 0x0

    .line 931
    .line 932
    const/16 v19, 0x0

    .line 933
    .line 934
    const/16 v20, 0x0

    .line 935
    .line 936
    const/16 v21, 0x0

    .line 937
    .line 938
    invoke-static/range {v12 .. v24}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 939
    .line 940
    .line 941
    move-result-object v12

    .line 942
    move-object/from16 v23, v22

    .line 943
    .line 944
    invoke-virtual {v9, v10, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v10

    .line 948
    if-eqz v10, :cond_16

    .line 949
    .line 950
    :cond_17
    invoke-virtual {v11}, La/i3t0;->D()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    check-cast v9, La/ufb0;

    .line 955
    .line 956
    iget-boolean v9, v9, La/ufb0;->c:Z

    .line 957
    .line 958
    if-eqz v9, :cond_18

    .line 959
    .line 960
    iget-object v0, v11, La/kgb0;->E:La/uii;

    .line 961
    .line 962
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 966
    .line 967
    .line 968
    move-result-wide v9

    .line 969
    iget-object v1, v0, La/uii;->e:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v1, La/f4u;

    .line 972
    .line 973
    iget-object v1, v1, La/f4u;->b:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v1, La/qfb0;

    .line 976
    .line 977
    iget-object v1, v1, La/qfb0;->a:La/afb0;

    .line 978
    .line 979
    iget-wide v12, v1, La/afb0;->a:J

    .line 980
    .line 981
    sub-long/2addr v9, v12

    .line 982
    const-wide/32 v12, 0x2bf20

    .line 983
    .line 984
    .line 985
    sub-long v9, v12, v9

    .line 986
    .line 987
    const-wide/16 v14, 0x0

    .line 988
    .line 989
    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 990
    .line 991
    .line 992
    move-result-wide v9

    .line 993
    new-instance v1, La/gc1;

    .line 994
    .line 995
    invoke-direct {v1, v0, v7, v4}, La/gc1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 996
    .line 997
    .line 998
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 999
    .line 1000
    invoke-static {v12, v13, v0, v1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    new-instance v1, La/dou;

    .line 1005
    .line 1006
    invoke-direct {v1, v9, v10, v7}, La/dou;-><init>(JLa/yje;)V

    .line 1007
    .line 1008
    .line 1009
    new-instance v12, La/fnq;

    .line 1010
    .line 1011
    invoke-direct {v12, v0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 1012
    .line 1013
    .line 1014
    sget-object v0, La/pnm0;->c:Lkotlin/ranges/IntRange;

    .line 1015
    .line 1016
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v18

    .line 1020
    const/16 v19, 0x0

    .line 1021
    .line 1022
    const/16 v20, 0x28

    .line 1023
    .line 1024
    const-string v13, "PopularOneXGamesViewModel.getJackpot"

    .line 1025
    .line 1026
    const/4 v14, 0x3

    .line 1027
    const-wide/16 v15, 0x3

    .line 1028
    .line 1029
    const/16 v17, 0x0

    .line 1030
    .line 1031
    invoke-static/range {v12 .. v20}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    new-instance v1, La/k2c;

    .line 1036
    .line 1037
    invoke-direct {v1, v0, v3}, La/k2c;-><init>(La/a1g;B)V

    .line 1038
    .line 1039
    .line 1040
    new-instance v0, La/ggb0;

    .line 1041
    .line 1042
    invoke-direct {v0, v11, v7, v6}, La/ggb0;-><init>(La/kgb0;La/yje;B)V

    .line 1043
    .line 1044
    .line 1045
    new-instance v3, La/fnq;

    .line 1046
    .line 1047
    invoke-direct {v3, v1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1048
    .line 1049
    .line 1050
    new-instance v0, La/gbv;

    .line 1051
    .line 1052
    const/16 v1, 0x19

    .line 1053
    .line 1054
    invoke-direct {v0, v11, v7, v1}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1055
    .line 1056
    .line 1057
    new-instance v1, La/dnq;

    .line 1058
    .line 1059
    invoke-direct {v1, v3, v0, v8}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 1060
    .line 1061
    .line 1062
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    iget-object v2, v5, La/mne;->b:La/dvj;

    .line 1067
    .line 1068
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    sget-object v2, La/foe;->h:La/foe;

    .line 1073
    .line 1074
    invoke-static {v1, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    iput-object v0, v11, La/kgb0;->f0:La/c4m0;

    .line 1079
    .line 1080
    goto :goto_8

    .line 1081
    :cond_18
    iget-object v5, v0, La/ocj;->a:La/p7m0;

    .line 1082
    .line 1083
    :cond_19
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    move-object v6, v0

    .line 1091
    check-cast v6, La/ufb0;

    .line 1092
    .line 1093
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    const/16 v17, 0x0

    .line 1097
    .line 1098
    const/16 v18, 0xbff

    .line 1099
    .line 1100
    const/4 v7, 0x0

    .line 1101
    const/4 v8, 0x0

    .line 1102
    const/4 v9, 0x0

    .line 1103
    const/4 v10, 0x0

    .line 1104
    const/4 v11, 0x0

    .line 1105
    const/4 v12, 0x0

    .line 1106
    const/4 v13, 0x0

    .line 1107
    const/4 v14, 0x0

    .line 1108
    const/4 v15, 0x0

    .line 1109
    sget-object v16, La/zee;->a:La/zee;

    .line 1110
    .line 1111
    invoke-static/range {v6 .. v18}, La/ufb0;->a(La/ufb0;Ljava/lang/String;ZZLa/seb0;ZLa/lq5;Ljava/util/List;La/hfe;La/hfe;La/hfe;La/hfe;I)La/ufb0;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v2

    .line 1115
    invoke-virtual {v5, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v0

    .line 1119
    if-eqz v0, :cond_19

    .line 1120
    .line 1121
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1122
    .line 1123
    return-object v0

    .line 1124
    :pswitch_19
    check-cast v0, La/d2b0;

    .line 1125
    .line 1126
    sget-object v1, La/d2b0;->S1:La/rl70;

    .line 1127
    .line 1128
    iget-object v0, v0, La/d2b0;->K1:La/fiu0;

    .line 1129
    .line 1130
    if-eqz v0, :cond_1a

    .line 1131
    .line 1132
    return-object v0

    .line 1133
    :cond_1a
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1134
    .line 1135
    .line 1136
    throw v7

    .line 1137
    :pswitch_1a
    check-cast v0, La/uua0;

    .line 1138
    .line 1139
    sget-object v1, La/tua0;->b:La/tua0;

    .line 1140
    .line 1141
    new-array v2, v6, [La/ugi0;

    .line 1142
    .line 1143
    new-instance v3, La/yr80;

    .line 1144
    .line 1145
    const/16 v4, 0x13

    .line 1146
    .line 1147
    invoke-direct {v3, v0, v4}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 1148
    .line 1149
    .line 1150
    const-string v4, "kotlinx.serialization.Polymorphic"

    .line 1151
    .line 1152
    invoke-static {v4, v1, v2, v3}, La/x2x;->G(Ljava/lang/String;La/c3x;[La/ugi0;Lkotlin/jvm/functions/Function1;)La/wgi0;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v1

    .line 1156
    iget-object v0, v0, La/uua0;->a:La/sgy;

    .line 1157
    .line 1158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    new-instance v2, La/nje;

    .line 1162
    .line 1163
    invoke-direct {v2, v1, v0}, La/nje;-><init>(La/wgi0;La/sgy;)V

    .line 1164
    .line 1165
    .line 1166
    return-object v2

    .line 1167
    :pswitch_1b
    check-cast v0, La/xfu;

    .line 1168
    .line 1169
    new-instance v1, La/hua0;

    .line 1170
    .line 1171
    iget-object v0, v0, La/xfu;->a:Ljava/lang/Object;

    .line 1172
    .line 1173
    check-cast v0, La/nr00;

    .line 1174
    .line 1175
    iget-object v0, v0, La/nr00;->a:Ljava/lang/Object;

    .line 1176
    .line 1177
    check-cast v0, La/xv20;

    .line 1178
    .line 1179
    iget-object v0, v0, La/xv20;->a:La/p7m0;

    .line 1180
    .line 1181
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    check-cast v0, Ljava/util/List;

    .line 1186
    .line 1187
    if-nez v0, :cond_1b

    .line 1188
    .line 1189
    sget-object v0, La/iun;->a:La/iun;

    .line 1190
    .line 1191
    :cond_1b
    sget-object v2, La/iun;->a:La/iun;

    .line 1192
    .line 1193
    invoke-direct {v1, v0, v2, v8, v6}, La/hua0;-><init>(Ljava/util/List;Ljava/util/List;ZZ)V

    .line 1194
    .line 1195
    .line 1196
    return-object v1

    .line 1197
    :pswitch_1c
    check-cast v0, La/ata0;

    .line 1198
    .line 1199
    sget-object v1, La/ksa0;->a:La/ksa0;

    .line 1200
    .line 1201
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    return-object v0

    .line 1207
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
