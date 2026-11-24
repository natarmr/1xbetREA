.class public final synthetic La/wg2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vzg0;


# direct methods
.method public synthetic constructor <init>(La/vzg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wg2;->a:B

    iput-object p1, p0, La/wg2;->b:La/vzg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wg2;->a:B

    .line 4
    .line 5
    const-string v2, "SEARCH_QUERY_KEY"

    .line 6
    .line 7
    const-string v3, "CURRENT_TAB_KEY"

    .line 8
    .line 9
    const-string v4, "SELECTED_CHIP"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, ""

    .line 13
    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    iget-object v0, v0, La/wg2;->b:La/vzg0;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance v9, La/qkp0;

    .line 22
    .line 23
    const-string v1, "CHECKED_CHIPS_ID_KEY"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Long;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v7

    .line 37
    :cond_0
    move-wide v15, v7

    .line 38
    const-wide/16 v10, 0x0

    .line 39
    .line 40
    const/4 v12, 0x1

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    invoke-direct/range {v9 .. v16}, La/qkp0;-><init>(JZZLa/kkp0;J)V

    .line 44
    .line 45
    .line 46
    return-object v9

    .line 47
    :pswitch_0
    new-instance v1, La/yrd0;

    .line 48
    .line 49
    invoke-virtual {v0, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/Long;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    :cond_1
    move-object v0, v1

    .line 62
    move-wide v4, v7

    .line 63
    const/4 v1, 0x1

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct/range {v0 .. v5}, La/yrd0;-><init>(ZZLa/zsd0;J)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_1
    const-string v1, "EXTRA_CATEGORY_NAME"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    if-nez v0, :cond_2

    .line 79
    .line 80
    move-object v8, v6

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-object v8, v0

    .line 83
    :goto_0
    sget-object v9, La/iun;->a:La/iun;

    .line 84
    .line 85
    new-instance v7, La/wpc0;

    .line 86
    .line 87
    const/4 v11, 0x0

    .line 88
    const/4 v12, 0x0

    .line 89
    const/4 v10, 0x1

    .line 90
    invoke-direct/range {v7 .. v12}, La/wpc0;-><init>(Ljava/lang/String;Ljava/util/List;ZZZ)V

    .line 91
    .line 92
    .line 93
    return-object v7

    .line 94
    :pswitch_2
    const-string v1, "SAVE_STATE_INPUT_PROMO_KEY"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/String;

    .line 101
    .line 102
    if-nez v0, :cond_3

    .line 103
    .line 104
    move-object v11, v6

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v11, v0

    .line 107
    :goto_1
    new-instance v7, La/jac0;

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    invoke-direct/range {v7 .. v12}, La/jac0;-><init>(ZZZLjava/lang/String;La/zec0;)V

    .line 114
    .line 115
    .line 116
    return-object v7

    .line 117
    :pswitch_3
    new-instance v1, La/n3a0;

    .line 118
    .line 119
    const-string v2, "KEY_MAIN_TAB"

    .line 120
    .line 121
    invoke-virtual {v0, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/Integer;

    .line 126
    .line 127
    if-eqz v2, :cond_4

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    move v2, v5

    .line 135
    :goto_2
    const-string v3, "KEY_SUB_TAB_LEFT"

    .line 136
    .line 137
    invoke-virtual {v0, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Ljava/lang/Integer;

    .line 142
    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    goto :goto_3

    .line 150
    :cond_5
    move v3, v5

    .line 151
    :goto_3
    const-string v4, "KEY_SUB_TAB_RIGHT"

    .line 152
    .line 153
    invoke-virtual {v0, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Ljava/lang/Integer;

    .line 158
    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    :cond_6
    move v4, v5

    .line 166
    const/4 v5, 0x1

    .line 167
    const/4 v6, 0x0

    .line 168
    move-object v0, v1

    .line 169
    const/4 v1, 0x0

    .line 170
    invoke-direct/range {v0 .. v6}, La/n3a0;-><init>(La/vgn;IIIZZ)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_4
    sget-object v2, La/iun;->a:La/iun;

    .line 175
    .line 176
    const-string v1, "INSTRUMENT_ID_KEY"

    .line 177
    .line 178
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v4, v1

    .line 183
    check-cast v4, Ljava/lang/Integer;

    .line 184
    .line 185
    const-string v1, "SELECTED_INDEX_KEY"

    .line 186
    .line 187
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Ljava/lang/Integer;

    .line 192
    .line 193
    if-eqz v1, :cond_7

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    :goto_4
    move v11, v1

    .line 200
    goto :goto_5

    .line 201
    :cond_7
    const/16 v1, 0xb

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :goto_5
    const-string v1, "SELECTED_TYPE_KEY"

    .line 205
    .line 206
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, La/wbq;

    .line 211
    .line 212
    if-nez v0, :cond_8

    .line 213
    .line 214
    sget-object v0, La/wbq;->c:La/wbq;

    .line 215
    .line 216
    :cond_8
    move-object v12, v0

    .line 217
    new-instance v1, La/oaq;

    .line 218
    .line 219
    const/4 v10, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    const/4 v3, 0x0

    .line 222
    const/4 v5, 0x0

    .line 223
    const/4 v6, 0x0

    .line 224
    const/4 v7, 0x0

    .line 225
    const/4 v8, 0x0

    .line 226
    const/4 v9, 0x1

    .line 227
    invoke-direct/range {v1 .. v13}, La/oaq;-><init>(Ljava/util/List;ZLjava/lang/Integer;La/g9q;La/eb8;La/kcq;La/cev;ZZILa/wbq;Z)V

    .line 228
    .line 229
    .line 230
    return-object v1

    .line 231
    :pswitch_5
    invoke-virtual {v0, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    check-cast v0, Ljava/lang/Long;

    .line 236
    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 240
    .line 241
    .line 242
    move-result-wide v7

    .line 243
    :cond_9
    move-wide v14, v7

    .line 244
    new-instance v13, La/zwh;

    .line 245
    .line 246
    sget-object v0, La/iun;->a:La/iun;

    .line 247
    .line 248
    invoke-direct {v13, v5, v0}, La/zwh;-><init>(ILjava/util/List;)V

    .line 249
    .line 250
    .line 251
    new-instance v9, La/oxh;

    .line 252
    .line 253
    const/4 v11, 0x0

    .line 254
    const/4 v12, 0x0

    .line 255
    const/4 v10, 0x1

    .line 256
    invoke-direct/range {v9 .. v15}, La/oxh;-><init>(ZZZLa/zwh;J)V

    .line 257
    .line 258
    .line 259
    return-object v9

    .line 260
    :pswitch_6
    const-string v1, "KEY_CURRENT_TAB"

    .line 261
    .line 262
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Ljava/lang/Long;

    .line 267
    .line 268
    if-eqz v0, :cond_a

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 271
    .line 272
    .line 273
    move-result-wide v7

    .line 274
    :cond_a
    move-wide v14, v7

    .line 275
    new-instance v0, La/mwh;

    .line 276
    .line 277
    sget-object v1, La/b9a0;->g:La/b9a0;

    .line 278
    .line 279
    sget-object v2, La/iun;->a:La/iun;

    .line 280
    .line 281
    invoke-direct {v0, v1, v2}, La/mwh;-><init>(La/b9a0;Ljava/util/List;)V

    .line 282
    .line 283
    .line 284
    new-instance v9, La/dwh;

    .line 285
    .line 286
    const/4 v12, 0x0

    .line 287
    const/4 v13, 0x0

    .line 288
    const/4 v10, 0x0

    .line 289
    const/4 v11, 0x1

    .line 290
    move-object/from16 v16, v0

    .line 291
    .line 292
    invoke-direct/range {v9 .. v16}, La/dwh;-><init>(ZZZZJLa/mwh;)V

    .line 293
    .line 294
    .line 295
    return-object v9

    .line 296
    :pswitch_7
    invoke-virtual {v0, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 301
    .line 302
    if-nez v1, :cond_b

    .line 303
    .line 304
    sget-object v1, Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;->a:Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;

    .line 305
    .line 306
    :cond_b
    move-object v9, v1

    .line 307
    new-instance v12, La/zpv;

    .line 308
    .line 309
    invoke-direct {v12, v5, v5}, La/zpv;-><init>(ZZ)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Ljava/lang/String;

    .line 317
    .line 318
    if-nez v0, :cond_c

    .line 319
    .line 320
    move-object v15, v6

    .line 321
    goto :goto_6

    .line 322
    :cond_c
    move-object v15, v0

    .line 323
    :goto_6
    new-instance v7, La/onc;

    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const/16 v16, 0x1

    .line 327
    .line 328
    const/4 v8, 0x0

    .line 329
    sget-object v10, La/jmc;->a:La/jmc;

    .line 330
    .line 331
    const/4 v11, 0x0

    .line 332
    const/4 v13, 0x0

    .line 333
    invoke-direct/range {v7 .. v16}, La/onc;-><init>(La/ymc;Lorg/xplatform/favorites/impl/presentation/screen/classic/models/ClassicFavoriteTab;La/kmc;ILa/zpv;ZZLjava/lang/String;Z)V

    .line 334
    .line 335
    .line 336
    return-object v7

    .line 337
    :pswitch_8
    new-instance v8, La/p5b;

    .line 338
    .line 339
    invoke-virtual {v0, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;

    .line 344
    .line 345
    if-nez v1, :cond_d

    .line 346
    .line 347
    sget-object v1, Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;->a:Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;

    .line 348
    .line 349
    :cond_d
    move-object v10, v1

    .line 350
    new-instance v12, La/ex70;

    .line 351
    .line 352
    new-instance v1, La/zpv;

    .line 353
    .line 354
    invoke-direct {v1, v5, v5}, La/zpv;-><init>(ZZ)V

    .line 355
    .line 356
    .line 357
    invoke-direct {v12, v1}, La/ex70;-><init>(La/zpv;)V

    .line 358
    .line 359
    .line 360
    const-string v1, "SEARCH_FIELD_STATE_KEY"

    .line 361
    .line 362
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 367
    .line 368
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v14

    .line 372
    invoke-virtual {v0, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, Ljava/lang/String;

    .line 377
    .line 378
    if-nez v2, :cond_e

    .line 379
    .line 380
    move-object v15, v6

    .line 381
    goto :goto_7

    .line 382
    :cond_e
    move-object v15, v2

    .line 383
    :goto_7
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v16

    .line 391
    const/4 v9, 0x0

    .line 392
    sget-object v11, La/hm5;->a:La/hm5;

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    invoke-direct/range {v8 .. v16}, La/p5b;-><init>(La/z4b;Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;La/om5;La/jx70;ZZLjava/lang/String;Z)V

    .line 396
    .line 397
    .line 398
    return-object v8

    .line 399
    :pswitch_9
    const-string v1, "SELECTED_TRACK_COEF_KEY"

    .line 400
    .line 401
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    move-object v10, v1

    .line 406
    check-cast v10, La/s4i0;

    .line 407
    .line 408
    const-string v1, "REMOVING_TRACK_COEF_KEY"

    .line 409
    .line 410
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    move-object v11, v0

    .line 415
    check-cast v11, La/s4i0;

    .line 416
    .line 417
    new-instance v2, La/nl2;

    .line 418
    .line 419
    const/4 v8, 0x0

    .line 420
    const/4 v9, 0x1

    .line 421
    const/4 v3, 0x0

    .line 422
    const/4 v4, 0x1

    .line 423
    const/4 v5, 0x0

    .line 424
    sget-object v6, La/dds0;->a:La/dds0;

    .line 425
    .line 426
    const/4 v7, 0x0

    .line 427
    invoke-direct/range {v2 .. v11}, La/nl2;-><init>(La/yk2;ZZLa/gds0;ZZZLa/s4i0;La/s4i0;)V

    .line 428
    .line 429
    .line 430
    return-object v2

    .line 431
    :pswitch_a
    new-instance v3, La/ug2;

    .line 432
    .line 433
    sget-object v11, La/xun;->a:La/xun;

    .line 434
    .line 435
    const-string v1, "PENDING_DELETE_GAME_GROUPS"

    .line 436
    .line 437
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    move-object v12, v0

    .line 442
    check-cast v12, Ljava/util/List;

    .line 443
    .line 444
    const-string v13, ""

    .line 445
    .line 446
    const/4 v14, 0x0

    .line 447
    const/4 v4, 0x0

    .line 448
    const/4 v5, 0x1

    .line 449
    sget-object v6, La/fat;->a:La/fat;

    .line 450
    .line 451
    const/4 v7, 0x0

    .line 452
    const/4 v8, 0x0

    .line 453
    const/4 v9, 0x1

    .line 454
    const/4 v10, 0x1

    .line 455
    invoke-direct/range {v3 .. v14}, La/ug2;-><init>(La/hg2;ZLa/hat;ZZZZLjava/util/Set;Ljava/util/List;Ljava/lang/String;Z)V

    .line 456
    .line 457
    .line 458
    return-object v3

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
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
